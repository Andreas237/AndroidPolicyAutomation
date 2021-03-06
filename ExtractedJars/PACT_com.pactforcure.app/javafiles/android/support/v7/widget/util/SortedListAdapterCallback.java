// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget.util;


public abstract class SortedListAdapterCallback extends android.support.v7.util.SortedList.Callback
{

	public SortedListAdapterCallback(android.support.v7.widget.RecyclerView.Adapter adapter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void android.support.v7.util.SortedList$Callback()>
		mAdapter = adapter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field android.support.v7.widget.RecyclerView$Adapter mAdapter>
	//    5    9:return          
	}

	public void onChanged(int i, int j)
	{
		mAdapter.notifyItemRangeChanged(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field android.support.v7.widget.RecyclerView$Adapter mAdapter>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #22  <Method void android.support.v7.widget.RecyclerView$Adapter.notifyItemRangeChanged(int, int)>
	//    5    9:return          
	}

	public void onInserted(int i, int j)
	{
		mAdapter.notifyItemRangeInserted(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field android.support.v7.widget.RecyclerView$Adapter mAdapter>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #26  <Method void android.support.v7.widget.RecyclerView$Adapter.notifyItemRangeInserted(int, int)>
	//    5    9:return          
	}

	public void onMoved(int i, int j)
	{
		mAdapter.notifyItemMoved(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field android.support.v7.widget.RecyclerView$Adapter mAdapter>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #30  <Method void android.support.v7.widget.RecyclerView$Adapter.notifyItemMoved(int, int)>
	//    5    9:return          
	}

	public void onRemoved(int i, int j)
	{
		mAdapter.notifyItemRangeRemoved(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field android.support.v7.widget.RecyclerView$Adapter mAdapter>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #34  <Method void android.support.v7.widget.RecyclerView$Adapter.notifyItemRangeRemoved(int, int)>
	//    5    9:return          
	}

	final android.support.v7.widget.RecyclerView.Adapter mAdapter;
}
