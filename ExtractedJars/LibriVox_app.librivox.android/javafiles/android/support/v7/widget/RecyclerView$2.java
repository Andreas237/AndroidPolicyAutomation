// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			RecyclerView

class RecyclerView$2
	implements Runnable
{

	public void run()
	{
		if(mItemAnimator != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field RecyclerView this$0>
	//*   2    4:getfield        #23  <Field RecyclerView$ItemAnimator RecyclerView.mItemAnimator>
	//*   3    7:ifnull          20
			mItemAnimator.runPendingAnimations();
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field RecyclerView this$0>
	//    6   14:getfield        #23  <Field RecyclerView$ItemAnimator RecyclerView.mItemAnimator>
	//    7   17:invokevirtual   #28  <Method void RecyclerView$ItemAnimator.runPendingAnimations()>
		mPostedAnimatorRunner = false;
	//    8   20:aload_0         
	//    9   21:getfield        #12  <Field RecyclerView this$0>
	//   10   24:iconst_0        
	//   11   25:putfield        #32  <Field boolean RecyclerView.mPostedAnimatorRunner>
	//   12   28:return          
	}

	final RecyclerView this$0;

	RecyclerView$2()
	{
		this$0 = RecyclerView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field RecyclerView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
