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
		a.c = false;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ContentLoadingProgressBar a>
	//    2    4:iconst_0        
	//    3    5:putfield        #23  <Field boolean ContentLoadingProgressBar.c>
		if(!a.d)
	//*   4    8:aload_0         
	//*   5    9:getfield        #14  <Field ContentLoadingProgressBar a>
	//*   6   12:getfield        #26  <Field boolean ContentLoadingProgressBar.d>
	//*   7   15:ifne            36
		{
			a.a = System.currentTimeMillis();
	//    8   18:aload_0         
	//    9   19:getfield        #14  <Field ContentLoadingProgressBar a>
	//   10   22:invokestatic    #32  <Method long System.currentTimeMillis()>
	//   11   25:putfield        #35  <Field long ContentLoadingProgressBar.a>
			a.setVisibility(0);
	//   12   28:aload_0         
	//   13   29:getfield        #14  <Field ContentLoadingProgressBar a>
	//   14   32:iconst_0        
	//   15   33:invokevirtual   #39  <Method void ContentLoadingProgressBar.setVisibility(int)>
		}
	//   16   36:return          
	}

	final ContentLoadingProgressBar a;

	ContentLoadingProgressBar$2(ContentLoadingProgressBar contentloadingprogressbar)
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
