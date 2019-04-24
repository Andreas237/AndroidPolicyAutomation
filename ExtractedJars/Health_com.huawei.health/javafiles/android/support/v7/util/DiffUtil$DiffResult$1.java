// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;


// Referenced classes of package android.support.v7.util:
//			ListUpdateCallback, DiffUtil

class DiffUtil$DiffResult$1
	implements ListUpdateCallback
{

	public void onChanged(int i, int j, Object obj)
	{
		val$adapter.notifyItemRangeChanged(i, j, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.support.v7.widget.RecyclerView$Adapter val$adapter>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #35  <Method void android.support.v7.widget.RecyclerView$Adapter.notifyItemRangeChanged(int, int, Object)>
	//    6   10:return          
	}

	public void onInserted(int i, int j)
	{
		val$adapter.notifyItemRangeInserted(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.support.v7.widget.RecyclerView$Adapter val$adapter>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #40  <Method void android.support.v7.widget.RecyclerView$Adapter.notifyItemRangeInserted(int, int)>
	//    5    9:return          
	}

	public void onMoved(int i, int j)
	{
		val$adapter.notifyItemMoved(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.support.v7.widget.RecyclerView$Adapter val$adapter>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #44  <Method void android.support.v7.widget.RecyclerView$Adapter.notifyItemMoved(int, int)>
	//    5    9:return          
	}

	public void onRemoved(int i, int j)
	{
		val$adapter.notifyItemRangeRemoved(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.support.v7.widget.RecyclerView$Adapter val$adapter>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #48  <Method void android.support.v7.widget.RecyclerView$Adapter.notifyItemRangeRemoved(int, int)>
	//    5    9:return          
	}

	final DiffUtil.DiffResult this$0;
	final android.support.v7.widget.RecyclerView.Adapter val$adapter;

	DiffUtil$DiffResult$1()
	{
		this$0 = final_diffresult;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field DiffUtil$DiffResult this$0>
		val$adapter = android.support.v7.widget.RecyclerView.Adapter.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field android.support.v7.widget.RecyclerView$Adapter val$adapter>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
