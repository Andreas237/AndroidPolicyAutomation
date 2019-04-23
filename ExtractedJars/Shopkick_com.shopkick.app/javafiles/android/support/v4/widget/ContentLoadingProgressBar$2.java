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
		ContentLoadingProgressBar contentloadingprogressbar = ContentLoadingProgressBar.this;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ContentLoadingProgressBar this$0>
	//    2    4:astore_1        
		contentloadingprogressbar.mPostedShow = false;
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:putfield        #23  <Field boolean ContentLoadingProgressBar.mPostedShow>
		if(!contentloadingprogressbar.mDismissed)
	//*   6   10:aload_1         
	//*   7   11:getfield        #26  <Field boolean ContentLoadingProgressBar.mDismissed>
	//*   8   14:ifne            35
		{
			mStartTime = System.currentTimeMillis();
	//    9   17:aload_0         
	//   10   18:getfield        #14  <Field ContentLoadingProgressBar this$0>
	//   11   21:invokestatic    #32  <Method long System.currentTimeMillis()>
	//   12   24:putfield        #36  <Field long ContentLoadingProgressBar.mStartTime>
			setVisibility(0);
	//   13   27:aload_0         
	//   14   28:getfield        #14  <Field ContentLoadingProgressBar this$0>
	//   15   31:iconst_0        
	//   16   32:invokevirtual   #40  <Method void ContentLoadingProgressBar.setVisibility(int)>
		}
	//   17   35:return          
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
