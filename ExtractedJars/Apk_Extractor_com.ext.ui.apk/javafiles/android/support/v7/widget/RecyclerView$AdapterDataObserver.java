// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public static abstract class RecyclerView$AdapterDataObserver
{

	public void onChanged()
	{
	//    0    0:return          
	}

	public void onItemRangeChanged(int i, int j)
	{
	//    0    0:return          
	}

	public void onItemRangeChanged(int i, int j, Object obj)
	{
		onItemRangeChanged(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #18  <Method void onItemRangeChanged(int, int)>
	//    4    6:return          
	}

	public void onItemRangeInserted(int i, int j)
	{
	//    0    0:return          
	}

	public void onItemRangeMoved(int i, int j, int k)
	{
	//    0    0:return          
	}

	public void onItemRangeRemoved(int i, int j)
	{
	//    0    0:return          
	}

	public RecyclerView$AdapterDataObserver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
