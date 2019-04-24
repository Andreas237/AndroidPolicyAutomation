package com.shopkick.app.store


import android.graphics.Rect
import android.support.v7.widget.RecyclerView;
import android.view.View

class StoreItemDecorator : RecyclerView.ItemDecoration() {
    private var bottomInset:Int = 0

    public fun setBottomInset(bottomInset: Int){

        this.bottomInset = bottomInset
    }

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State){
        val itemCount = parent.getAdapter()?.getItemCount()?:-1;
        if(parent.getChildAdapterPosition(view) == itemCount-1)
        {
            outRect.bottom = bottomInset
        }
    }
}
