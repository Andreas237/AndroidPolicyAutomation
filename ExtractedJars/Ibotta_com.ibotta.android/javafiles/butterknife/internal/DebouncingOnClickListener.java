// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package butterknife.internal;

import android.view.View;

public abstract class DebouncingOnClickListener
	implements android.view.View.OnClickListener
{

	public DebouncingOnClickListener()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	static void lambda$static$0()
	{
		enabled = true;
	//    0    0:iconst_1        
	//    1    1:putstatic       #28  <Field boolean enabled>
	//    2    4:return          
	}

	public abstract void doClick(View view);

	public final void onClick(View view)
	{
		if(enabled)
	//*   0    0:getstatic       #28  <Field boolean enabled>
	//*   1    3:ifeq            23
		{
			enabled = false;
	//    2    6:iconst_0        
	//    3    7:putstatic       #28  <Field boolean enabled>
			view.post(ENABLE_AGAIN);
	//    4   10:aload_1         
	//    5   11:getstatic       #21  <Field Runnable ENABLE_AGAIN>
	//    6   14:invokevirtual   #37  <Method boolean View.post(Runnable)>
	//    7   17:pop             
			doClick(view);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokevirtual   #39  <Method void doClick(View)>
		}
	//   11   23:return          
	}

	private static final Runnable ENABLE_AGAIN;
	static boolean enabled = true;

	static 
	{
		ENABLE_AGAIN = ((Runnable) (_2D_..Lambda.DebouncingOnClickListener.EDavjG1Da3G8JTdFPVGk_7OErB8.INSTANCE));
	//    0    0:getstatic       #19  <Field _2D_$$Lambda$DebouncingOnClickListener$EDavjG1Da3G8JTdFPVGk_7OErB8 _2D_$$Lambda$DebouncingOnClickListener$EDavjG1Da3G8JTdFPVGk_7OErB8.INSTANCE>
	//    1    3:putstatic       #21  <Field Runnable ENABLE_AGAIN>
	//*   2    6:return          
	}
}
