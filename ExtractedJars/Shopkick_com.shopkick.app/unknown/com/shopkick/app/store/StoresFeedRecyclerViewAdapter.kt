package com.shopkick.app.store

import android.Manifest
import android.os.Handler
import android.widget.Filter
import android.widget.Filterable
import com.shopkick.app.R
import com.shopkick.app.application.ScreenGlobals
import com.shopkick.app.feed.DataFeedRecyclerViewAdapter
import com.shopkick.app.feed.FeedRecyclerViewAdapter
import com.shopkick.app.fetchers.api.SKAPI
import com.shopkick.app.fetchers.api.skapi.ClientLogRecord
import com.shopkick.app.fetchers.api.skapi.TileInfoV2
import com.shopkick.app.logging.IUserEventCoordinator
import com.shopkick.app.logging.IUserEventView
import com.shopkick.app.permissions.PermissionUtils
import com.shopkick.app.permissions.PermissionsRequestController
import com.shopkick.app.screens.AppScreen
import com.shopkick.app.tileViewHolderConfigurators.SearchLoadingTileViewHolderConfigurator
import com.shopkick.app.tileViewHolderConfigurators.SearchResultInfoTileViewConfigurator
import com.shopkick.app.tileViewHolderConfigurators.StoreTileViewHolderConfigurator
import com.shopkick.app.util.NullUtils
import com.shopkick.app.util.TypeUtils
import com.shopkick.app.view.SKRecyclerView.SKRecyclerView
import kotlin.collections.ArrayList

class StoresFeedRecyclerViewAdapter : DataFeedRecyclerViewAdapter, Filterable {
    protected var filteredFeedTiles: ArrayList<TileInfoV2>? = null
    protected var storeSearchFilter: Filter = getFilter()
    private var searchKeyWord: String = ""
    private var searchFilterResults: ArrayList<TileInfoV2>? = null
    private var isModeFilter: Boolean = false
    private var canLogSearchResult: Boolean = false
    private val logHandler: Handler = Handler()
    private var searchResultType: SearchResultInfoTileViewConfigurator.SearchResultType? = SearchResultInfoTileViewConfigurator.SearchResultType.UNKNOWN

    constructor(screenGlobals: ScreenGlobals?, appScreen: AppScreen?, callback: IDataFeedRecyclerViewAdapterCallback?, recyclerView: SKRecyclerView?, supportedTileTypes: MutableCollection<Int>?, additionalUserEventCoordinators: ArrayList<IUserEventCoordinator>?, dataFetcherType: DataFetcherType?) : super(screenGlobals, appScreen, callback, recyclerView, supportedTileTypes, additionalUserEventCoordinators, dataFetcherType) {
        filteredFeedTiles = null
    }

    override fun getItemCount(): Int {
        return filteredFeedTiles?.size ?: super.getItemCount()
    }

    override fun getItem(position: Int): TileInfoV2 {
        return filteredFeedTiles?.get(position) ?: super.getItem(position)
    }

    override fun getItemViewType(position: Int): Int {
        return filteredFeedTiles?.get(position)?.type ?: feedTiles.get(position).type
    }

    fun clearFilter() {
        //Get new search filter. If the old search results returns after query is cleared,
        storeSearchFilter = getFilter()
        filteredFeedTiles = null
        searchFilterResults = null
        isModeFilter = false
        searchKeyWord = ""
        cancelCurrentRequest()
        logHandler.removeCallbacksAndMessages(null);
        canLogSearchResult = false

        //Clear the search keyword in configurator for logging click event
        val configurator: StoreTileViewHolderConfigurator = configuratorMap.get(SKAPI.TileTypeV2StoreV4) as StoreTileViewHolderConfigurator
        configurator.setSearchKeyword(searchKeyWord)
    }

    fun startFilter() {
        isModeFilter = true
        setSearchKeyword("");
    }

    fun checkLocationPermission() {
        if (isModeFilter) {
            updateSearchResults(searchFilterResults, searchKeyWord)
        }
    }

    /**
     * setSearchKeyword - function to start searching with a string.
     * will start the search with a Filter->filter results->publish results ->update the final list with search results + any status tiles
     */
    fun setSearchKeyword(keyword: String) {
        canLogSearchResult = false
        isModeFilter = true
        if (nextPageKey != null) {
            autoFetchNextPage();
        }
        searchKeyWord = keyword
        storeSearchFilter.filter(keyword)
        logHandler.removeCallbacksAndMessages(null);
        searchResultType = SearchResultInfoTileViewConfigurator.SearchResultType.UNKNOWN
        //Log search after atleast 1s after user has stopped typing
        logHandler.postDelayed({
            canLogSearchResult = true
            logSearchResult()
        }, 700)
    }

    fun autoFetchNextPage() {
        if (!NullUtils.isNull(nextPageKey)) {
            fetchNextPage(true)
        }
    }

    private fun logSearchResult() {
        if (canLogSearchResult) {
            val clientLogRecord: ClientLogRecord = ClientLogRecord(SKAPI.ElementEarnTabSearchBadge, SKAPI.ActionSubmit)
            var validStateToLog: Boolean = false
            clientLogRecord.searchText = searchKeyWord
            when (searchResultType) {
                SearchResultInfoTileViewConfigurator.SearchResultType.SUCCESS -> {
                    validStateToLog = true
                }
                SearchResultInfoTileViewConfigurator.SearchResultType.PARTIAL_SEARCH_RESULTS -> {
                    validStateToLog = true
                    clientLogRecord.searchFailureReason = SKAPI.SearchFailureReasonPartialResults
                }
                SearchResultInfoTileViewConfigurator.SearchResultType.NO_SEARCH_RESULTS -> {
                    validStateToLog = true
                    clientLogRecord.searchFailureReason = SKAPI.SearchFailureReasonNoResults
                }
            }
            if (validStateToLog) {
                val appScreen: AppScreen? = appScreenWeakReference.get();
                if (appScreen != null) {
                    appScreen.eventLogger.logEventRecord(clientLogRecord)
                }
            }
        }
    }

    private fun updateSearchResults(searchFilterResults: ArrayList<TileInfoV2>?, searchKeyword: String) {
        //Set the search keyword in configurator for logging click event
        val configurator: StoreTileViewHolderConfigurator = configuratorMap.get(SKAPI.TileTypeV2StoreV4) as StoreTileViewHolderConfigurator
        configurator.setSearchKeyword(searchKeyword)

        var updatedSearchResults: ArrayList<TileInfoV2> = ArrayList()
        val recyclerView: SKRecyclerView = recyclerViewWeakReference.get() ?: return;

        searchResultType = SearchResultInfoTileViewConfigurator.SearchResultType.UNKNOWN
        if (PermissionsRequestController.isSystemLocationEnabled(recyclerView.context) && PermissionUtils.isPermissionEnabled(Manifest.permission.ACCESS_COARSE_LOCATION, recyclerView.context)) {
            if (searchFilterResults != null) {
                updatedSearchResults.addAll(searchFilterResults)
                if (!TypeUtils.isEmptyString(searchKeyword)) {
                    if (NullUtils.isNull(nextPageKey)) {
                        if (searchFilterResults.size == 0) {
                            //Add to search result tiles: No search results
                            val tile: TileInfoV2 = TileInfoV2()
                            tile.type = FeedRecyclerViewAdapter.SEARCH_RESULT_STATUS
                            tile.clientData()[SearchResultInfoTileViewConfigurator.PARAM_SEARCH_RESULT_TYPE] = SearchResultInfoTileViewConfigurator.SearchResultType.NO_SEARCH_RESULTS
                            tile.clientData()[SearchResultInfoTileViewConfigurator.PARAM_SEARCH_KEYWORD] = searchKeyword
                            searchResultType = SearchResultInfoTileViewConfigurator.SearchResultType.NO_SEARCH_RESULTS
                            updatedSearchResults.add(tile)
                        } else {
                            searchResultType = SearchResultInfoTileViewConfigurator.SearchResultType.SUCCESS
                        }
                    } else {
                        if (isFetching) {
                            // Add to search result tiles: fetching search results
                            val tile: TileInfoV2 = TileInfoV2()
                            tile.type = FeedRecyclerViewAdapter.FETCHING_TILE_TYPE
                            tile.clientData()[SearchLoadingTileViewHolderConfigurator.PARAM_SEARCH_KEYWORD] = searchKeyword
                            searchResultType = SearchResultInfoTileViewConfigurator.SearchResultType.SEARCHING
                            updatedSearchResults.add(tile)
                        } else if (!NullUtils.isNull(nextPageKey)) {
                            // Add to search result tiles: Add partial result tile
                            val tile: TileInfoV2 = TileInfoV2()
                            tile.type = FeedRecyclerViewAdapter.SEARCH_RESULT_STATUS
                            tile.clientData()[SearchResultInfoTileViewConfigurator.PARAM_SEARCH_RESULT_TYPE] = SearchResultInfoTileViewConfigurator.SearchResultType.PARTIAL_SEARCH_RESULTS
                            tile.clientData()[SearchResultInfoTileViewConfigurator.PARAM_SEARCH_KEYWORD] = searchKeyword
                            searchResultType = SearchResultInfoTileViewConfigurator.SearchResultType.PARTIAL_SEARCH_RESULTS
                            updatedSearchResults.add(tile)
                        }
                    }
                } else {
                    searchResultType = SearchResultInfoTileViewConfigurator.SearchResultType.SUGGESTED_TILES
                }
            }
        } else {
            searchResultType = SearchResultInfoTileViewConfigurator.SearchResultType.NO_LOCATION_PERMISSION
        }

        logSearchResult()
        filteredFeedTiles = updatedSearchResults
        notifyDataSetChanged()
    }

    override fun handlePageResponse(pageResponse: PageResponse) {
        super.handlePageResponse(pageResponse)

        if (isModeFilter && !NullUtils.isNull(searchKeyWord)) {
            if (pageResponse.pageStatus == PageStatus.SUCCESS || pageResponse.pageStatus == PageStatus.SUCCESS_CLEAR) {
                storeSearchFilter.filter(searchKeyWord)
                autoFetchNextPage()
            } else {
                //No more new tiles to add. Update tiles with appropriate error.
                updateSearchResults(searchFilterResults, searchKeyWord)
            }
        }
    }


    override fun getFilter(): Filter {
        return object : Filter() {

            override fun performFiltering(charSequence: CharSequence?): FilterResults {
                val charString: String = charSequence.toString()
                var filteredList: ArrayList<TileInfoV2> = feedTiles
                if (!charString.isEmpty()) {
                    filteredList = ArrayList()
                    var currentCategoryTile: TileInfoV2? = null
                    for (tile in feedTiles) {
                        if (tile.type == FeedRecyclerViewAdapter.SEARCH_RESULT_CATEGORY_HEADER_TILE_TYPE) {
                            currentCategoryTile = tile;
                        } else if (tile.chainName != null && tile.chainName.toLowerCase().contains(charString.toLowerCase())) {
                            if (currentCategoryTile != null) {
                                //Add only if the category tile only if at least one tile is in that category.
                                filteredList.add(currentCategoryTile)
                                currentCategoryTile = null
                            }
                            filteredList.add(tile)
                        }
                    }
                }

                val filterResults: FilterResults = FilterResults()
                filterResults.values = filteredList
                return filterResults
            }


            override fun publishResults(constraint: CharSequence?, filterResults: FilterResults?) {
                if (storeSearchFilter == this) {
                    val newTiles: ArrayList<TileInfoV2>? = filterResults?.values as ArrayList<TileInfoV2>?
                    searchFilterResults = newTiles ?: ArrayList()

                    updateSearchResults(searchFilterResults, constraint?.toString() ?: "")
                }
            }
        }
    }
}
