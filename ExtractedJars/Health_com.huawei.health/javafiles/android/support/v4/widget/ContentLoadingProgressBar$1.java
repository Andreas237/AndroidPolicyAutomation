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
		mPostedHide = false;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ContentLoadingProgressBar this$0>
	//    2    4:iconst_0        
	//    3    5:putfield        #23  <Field boolean ContentLoadingProgressBar.mPostedHide>
		mStartTime = -1L;
	//    4    8:aload_0         
	//    5    9:getfield        #14  <Field ContentLoadingProgressBar this$0>
	//    6   12:ldc2w           #24  <Long -1L>
	//    7   15:putfield        #29  <Field long ContentLoadingProgressBar.mStartTime>
		setVisibility(8);
	//    8   18:aload_0         
	//    9   19:getfield        #14  <Field ContentLoadingProgressBar this$0>
	//   10   22:bipush          8
	//   11   24:invokevirtual   #33  <Method void ContentLoadingProgressBar.setVisibility(int)>
	//   12   27:return          
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
