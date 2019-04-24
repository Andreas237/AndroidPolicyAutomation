// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;


// Referenced classes of package android.support.v4.widget:
//			ContentLoadingProgressBar

class ContentLoadingProgressBar$2
	implements Runnable
{

	public void run()
	{
		mPostedShow = false;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ContentLoadingProgressBar this$0>
	//    2    4:iconst_0        
	//    3    5:putfield        #23  <Field boolean ContentLoadingProgressBar.mPostedShow>
		if(!mDismissed)
	//*   4    8:aload_0         
	//*   5    9:getfield        #14  <Field ContentLoadingProgressBar this$0>
	//*   6   12:getfield        #26  <Field boolean ContentLoadingProgressBar.mDismissed>
	//*   7   15:ifne            36
		{
			mStartTime = System.currentTimeMillis();
	//    8   18:aload_0         
	//    9   19:getfield        #14  <Field ContentLoadingProgressBar this$0>
	//   10   22:invokestatic    #32  <Method long System.currentTimeMillis()>
	//   11   25:putfield        #36  <Field long ContentLoadingProgressBar.mStartTime>
			setVisibility(0);
	//   12   28:aload_0         
	//   13   29:getfield        #14  <Field ContentLoadingProgressBar this$0>
	//   14   32:iconst_0        
	//   15   33:invokevirtual   #40  <Method void ContentLoadingProgressBar.setVisibility(int)>
		}
	//   16   36:return          
	}

	final ContentLoadingProgressBar this$0;

	ContentLoadingProgressBar$2()
	{
		this$0 = ContentLoadingProgressBar.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ContentLoadingProgressBar this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
