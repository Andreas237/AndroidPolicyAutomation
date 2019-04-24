package com.shopkick.app.tileViewHolderConfigurators

import android.widget.TextView
import com.shopkick.app.R
import com.shopkick.app.fetchers.api.skapi.TileInfoV2
import com.shopkick.app.view.SKRecyclerView.RecyclerViewHolder

class SearchLoadingTileViewHolderConfigurator : ViewHolderConfigurator() {

    companion object {
        const val PARAM_SEARCH_KEYWORD = "ParamSearchKeyword"

    }

    override fun getLayout(): Int {
        return R.layout.search_loading_tile
    }

    override fun onBindViewHolder(viewHolder: RecyclerViewHolder?, tileInfo: TileInfoV2?) {
        val searchKeyWord : String = (tileInfo?.clientData()?.get(PARAM_SEARCH_KEYWORD)) as String
        val searchStatusTextView : TextView? = viewHolder?.getTextView(R.id.search_progress_text)
        searchStatusTextView?.text = searchStatusTextView?.context?.getString(R.string.earn_screen_searching_text, searchKeyWord)
    }
}