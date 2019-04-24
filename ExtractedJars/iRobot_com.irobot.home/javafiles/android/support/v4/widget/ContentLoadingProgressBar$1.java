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
		a.b = false;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ContentLoadingProgressBar a>
	//    2    4:iconst_0        
	//    3    5:putfield        #23  <Field boolean ContentLoadingProgressBar.b>
		a.a = -1L;
	//    4    8:aload_0         
	//    5    9:getfield        #14  <Field ContentLoadingProgressBar a>
	//    6   12:ldc2w           #24  <Long -1L>
	//    7   15:putfield        #28  <Field long ContentLoadingProgressBar.a>
		a.setVisibility(8);
	//    8   18:aload_0         
	//    9   19:getfield        #14  <Field ContentLoadingProgressBar a>
	//   10   22:bipush          8
	//   11   24:invokevirtual   #32  <Method void ContentLoadingProgressBar.setVisibility(int)>
	//   12   27:return          
	}

	final ContentLoadingProgressBar a;

	ContentLoadingProgressBar$1(ContentLoadingProgressBar contentloadingprogressbar)
	{
		a = contentloadingprogressbar;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ContentLoadingProgressBar a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
