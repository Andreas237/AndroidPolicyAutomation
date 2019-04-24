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
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public abstract void doClick(View view);

	public final void onClick(View view)
	{
		if(enabled)
	//*   0    0:getstatic       #26  <Field boolean enabled>
	//*   1    3:ifeq            23
		{
			enabled = false;
	//    2    6:iconst_0        
	//    3    7:putstatic       #26  <Field boolean enabled>
			view.post(ENABLE_AGAIN);
	//    4   10:aload_1         
	//    5   11:getstatic       #20  <Field Runnable ENABLE_AGAIN>
	//    6   14:invokevirtual   #35  <Method boolean View.post(Runnable)>
	//    7   17:pop             
			doClick(view);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokevirtual   #37  <Method void doClick(View)>
		}
	//   11   23:return          
	}

	private static final Runnable ENABLE_AGAIN = new Runnable() {

		public void run()
		{
			DebouncingOnClickListener.enabled = true;
		//    0    0:iconst_1        
		//    1    1:invokestatic    #18  <Method boolean DebouncingOnClickListener.access$002(boolean)>
		//    2    4:pop             
		//    3    5:return          
		}

	}
;
	private static boolean enabled = true;

	static 
	{
	//    0    0:new             #8   <Class DebouncingOnClickListener$1>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void DebouncingOnClickListener$1()>
	//    3    7:putstatic       #20  <Field Runnable ENABLE_AGAIN>
	//*   4   10:return          
	}


/*
	static boolean access$002(boolean flag)
	{
		enabled = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #26  <Field boolean enabled>
		return flag;
	//    2    4:iload_0         
	//    3    5:ireturn         
	}

*/
}
