package com.shopkick.app.tileViewHolderConfigurators

import android.content.Context
import android.view.View
import android.widget.TextView
import com.shopkick.app.R
import com.shopkick.app.fetchers.api.skapi.TileInfoV2
import com.shopkick.app.permissions.PermissionUtils
import com.shopkick.app.view.SKRecyclerView.RecyclerViewHolder
import java.util.HashMap

class SearchResultInfoTileViewConfigurator : ViewHolderConfigurator() {


    public enum class SearchResultType {
        PARTIAL_SEARCH_RESULTS,
        NO_SEARCH_RESULTS,
        NO_LOCATION_PERMISSION,
        SUGGESTED_TILES,
        SEARCHING,
        SUCCESS,
        UNKNOWN
    }

    companion object {
        const val PARAM_SEARCH_RESULT_TYPE = "ParamSearchResultType"
        const val PARAM_SEARCH_KEYWORD = "ParamSearchKeyword"
    }

    override fun getLayout(): Int {
        return R.layout.search_result_status_info
    }

    override fun onBindViewHolder(viewHolder: RecyclerViewHolder?, tileInfo: TileInfoV2?) {
        val searchStatusTextView: TextView = viewHolder?.getTextView(R.id.status_title) ?: return
        val clientDataMap: HashMap<String, Any> = tileInfo?.clientData() ?: return
        val searchResultType: SearchResultType? = clientDataMap[PARAM_SEARCH_RESULT_TYPE] as SearchResultType
                ?: return
        val context: Context = searchStatusTextView.context ?: return

        when (searchResultType) {
            SearchResultType.PARTIAL_SEARCH_RESULTS -> {
                viewHolder.getImageView(R.id.result_status_image)?.visibility = View.GONE
                viewHolder.getTextView(R.id.status_title)?.visibility = View.GONE
                viewHolder.getTextView(R.id.status_sub_title).text = context.getString(R.string.earn_screen_search_failed_fetch_message)
            }
            SearchResultType.NO_SEARCH_RESULTS -> {
                viewHolder.getImageView(R.id.result_status_image)?.setImageDrawable(context.getDrawable(R.drawable.no_results))
                viewHolder.getImageView(R.id.result_status_image)?.visibility = View.VISIBLE
                viewHolder.getTextView(R.id.status_title)?.visibility = View.VISIBLE
                viewHolder.getTextView(R.id.status_title)?.text = context.getString(R.string.earn_screen_search_no_results_title)
                viewHolder.getTextView(R.id.status_sub_title)?.visibility = View.VISIBLE
                val keyword: String = clientDataMap[PARAM_SEARCH_KEYWORD] as String ?: ""
                viewHolder.getTextView(R.id.status_sub_title)?.text = context.getString(R.string.earn_screen_search_no_results_description, keyword)
            }
        }
    }
}