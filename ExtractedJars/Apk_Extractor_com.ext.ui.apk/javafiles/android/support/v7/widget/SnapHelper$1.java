// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			SnapHelper, RecyclerView

class SnapHelper$1 extends OnScrollListener
{

	public void onScrollStateChanged(RecyclerView recyclerview, int i)
	{
		super.onScrollStateChanged(recyclerview, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #24  <Method void RecyclerView$OnScrollListener.onScrollStateChanged(RecyclerView, int)>
		if(i == 0 && mScrolled)
	//*   4    6:iload_2         
	//*   5    7:ifne            29
	//*   6   10:aload_0         
	//*   7   11:getfield        #19  <Field boolean mScrolled>
	//*   8   14:ifeq            29
		{
			mScrolled = false;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #19  <Field boolean mScrolled>
			snapToTargetExistingView();
	//   12   22:aload_0         
	//   13   23:getfield        #14  <Field SnapHelper this$0>
	//   14   26:invokevirtual   #27  <Method void SnapHelper.snapToTargetExistingView()>
		}
	//   15   29:return          
	}

	public void onScrolled(RecyclerView recyclerview, int i, int j)
	{
		if(i != 0 || j != 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            8
	//*   2    4:iload_3         
	//*   3    5:ifeq            13
			mScrolled = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #19  <Field boolean mScrolled>
	//    7   13:return          
	}

	boolean mScrolled;
	final SnapHelper this$0;

	SnapHelper$1()
	{
		this$0 = SnapHelper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field SnapHelper this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void RecyclerView$OnScrollListener()>
		mScrolled = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #19  <Field boolean mScrolled>
	//    8   14:return          
	}
}
