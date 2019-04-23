// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			StaggeredGridLayoutManager

class StaggeredGridLayoutManager$1
	implements Runnable
{

	public void run()
	{
		checkForGaps();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field StaggeredGridLayoutManager this$0>
	//    2    4:invokevirtual   #23  <Method boolean StaggeredGridLayoutManager.checkForGaps()>
	//    3    7:pop             
	//    4    8:return          
	}

	final StaggeredGridLayoutManager this$0;

	StaggeredGridLayoutManager$1()
	{
		this$0 = StaggeredGridLayoutManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field StaggeredGridLayoutManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
