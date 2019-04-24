// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;


// Referenced classes of package android.support.v7.util:
//			ListUpdateCallback

public final class AdapterListUpdateCallback
	implements ListUpdateCallback
{

	public AdapterListUpdateCallback(android.support.v7.widget.RecyclerView.Adapter adapter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mAdapter = adapter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field android.support.v7.widget.RecyclerView$Adapter mAdapter>
	//    5    9:return          
	}

	public void onChanged(int i, int j, Object obj)
	{
		mAdapter.notifyItemRangeChanged(i, j, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field android.support.v7.widget.RecyclerView$Adapter mAdapter>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #25  <Method void android.support.v7.widget.RecyclerView$Adapter.notifyItemRangeChanged(int, int, Object)>
	//    6   10:return          
	}

	public void onInserted(int i, int j)
	{
		mAdapter.notifyItemRangeInserted(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field android.support.v7.widget.RecyclerView$Adapter mAdapter>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #30  <Method void android.support.v7.widget.RecyclerView$Adapter.notifyItemRangeInserted(int, int)>
	//    5    9:return          
	}

	public void onMoved(int i, int j)
	{
		mAdapter.notifyItemMoved(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field android.support.v7.widget.RecyclerView$Adapter mAdapter>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #34  <Method void android.support.v7.widget.RecyclerView$Adapter.notifyItemMoved(int, int)>
	//    5    9:return          
	}

	public void onRemoved(int i, int j)
	{
		mAdapter.notifyItemRangeRemoved(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field android.support.v7.widget.RecyclerView$Adapter mAdapter>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #38  <Method void android.support.v7.widget.RecyclerView$Adapter.notifyItemRangeRemoved(int, int)>
	//    5    9:return          
	}

	private final android.support.v7.widget.RecyclerView.Adapter mAdapter;
}
