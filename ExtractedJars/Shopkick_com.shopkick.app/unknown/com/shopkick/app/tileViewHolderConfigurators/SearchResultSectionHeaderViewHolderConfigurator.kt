package com.shopkick.app.tileViewHolderConfigurators

import com.shopkick.app.R
import com.shopkick.app.fetchers.api.skapi.TileInfoV2
import com.shopkick.app.view.SKRecyclerView.RecyclerViewHolder

class SearchResultSectionHeaderViewHolderConfigurator: ViewHolderConfigurator() {

    override fun getLayout(): Int {
        return R.layout.search_result_section_header
    }

    override fun onBindViewHolder(viewHolder: RecyclerViewHolder?, tileInfo: TileInfoV2?) {
        val categoryName : String = tileInfo?.headerText?:"Category Name"
        viewHolder?.getTextView(R.id.category_name)?.setText(categoryName)
    }

}