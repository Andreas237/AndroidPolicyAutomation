// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.contentcards.recycler;

import android.support.v7.widget.RecyclerView;

// Referenced classes of package com.appboy.ui.contentcards.recycler:
//			ItemTouchHelperAdapter

public class SimpleItemTouchHelperCallback extends android.support.v7.widget.helper.ItemTouchHelper.Callback
{

	public SimpleItemTouchHelperCallback(ItemTouchHelperAdapter itemtouchhelperadapter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void android.support.v7.widget.helper.ItemTouchHelper$Callback()>
		mAdapter = itemtouchhelperadapter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field ItemTouchHelperAdapter mAdapter>
	//    5    9:return          
	}

	public int getMovementFlags(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder)
	{
		byte byte0;
		if(mAdapter.isItemDismissable(viewholder.getAdapterPosition()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field ItemTouchHelperAdapter mAdapter>
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #22  <Method int android.support.v7.widget.RecyclerView$ViewHolder.getAdapterPosition()>
	//*   4    8:invokeinterface #28  <Method boolean ItemTouchHelperAdapter.isItemDismissable(int)>
	//*   5   13:ifeq            22
			byte0 = 16;
	//    6   16:bipush          16
	//    7   18:istore_3        
		else
	//*   8   19:goto            24
			byte0 = 0;
	//    9   22:iconst_0        
	//   10   23:istore_3        
		return makeMovementFlags(0, ((int) (byte0)));
	//   11   24:iconst_0        
	//   12   25:iload_3         
	//   13   26:invokestatic    #32  <Method int makeMovementFlags(int, int)>
	//   14   29:ireturn         
	}

	public boolean isItemViewSwipeEnabled()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isLongPressDragEnabled()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean onMove(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, android.support.v7.widget.RecyclerView.ViewHolder viewholder1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
	{
		mAdapter.onItemDismiss(viewholder.getAdapterPosition());
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field ItemTouchHelperAdapter mAdapter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #22  <Method int android.support.v7.widget.RecyclerView$ViewHolder.getAdapterPosition()>
	//    4    8:invokeinterface #43  <Method void ItemTouchHelperAdapter.onItemDismiss(int)>
	//    5   13:return          
	}

	private final ItemTouchHelperAdapter mAdapter;
}
