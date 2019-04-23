// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;


// Referenced classes of package android.support.v4.widget:
//			ContentLoadingProgressBar

class ContentLoadingProgressBar$1
	implements Runnable
{

	public void run()
	{
		ContentLoadingProgressBar contentloadingprogressbar = ContentLoadingProgressBar.this;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ContentLoadingProgressBar this$0>
	//    2    4:astore_1        
		contentloadingprogressbar.mPostedHide = false;
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:putfield        #23  <Field boolean ContentLoadingProgressBar.mPostedHide>
		contentloadingprogressbar.mStartTime = -1L;
	//    6   10:aload_1         
	//    7   11:ldc2w           #24  <Long -1L>
	//    8   14:putfield        #29  <Field long ContentLoadingProgressBar.mStartTime>
		contentloadingprogressbar.setVisibility(8);
	//    9   17:aload_1         
	//   10   18:bipush          8
	//   11   20:invokevirtual   #33  <Method void ContentLoadingProgressBar.setVisibility(int)>
	//   12   23:return          
	}

	final ContentLoadingProgressBar this$0;

	ContentLoadingProgressBar$1()
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
