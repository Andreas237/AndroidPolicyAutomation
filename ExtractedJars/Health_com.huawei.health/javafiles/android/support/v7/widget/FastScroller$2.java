// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			FastScroller, RecyclerView

class FastScroller$2 extends ScrollListener
{

	public void onScrolled(RecyclerView recyclerview, int i, int j)
	{
		updateScrollPosition(recyclerview.computeHorizontalScrollOffset(), recyclerview.computeVerticalScrollOffset());
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field FastScroller this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #24  <Method int RecyclerView.computeHorizontalScrollOffset()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #27  <Method int RecyclerView.computeVerticalScrollOffset()>
	//    6   12:invokevirtual   #31  <Method void FastScroller.updateScrollPosition(int, int)>
	//    7   15:return          
	}

	final FastScroller this$0;

	FastScroller$2()
	{
		this$0 = FastScroller.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field FastScroller this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void RecyclerView$OnScrollListener()>
	//    5    9:return          
	}
}
