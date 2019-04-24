// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v7.view.menu.s;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ac, AppCompatSpinner

class AppCompatSpinner$1 extends ac
{

	public s a()
	{
		return ((s) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field AppCompatSpinner$b a>
	//    2    4:areturn         
	}

	public boolean b()
	{
		if(!AppCompatSpinner.a(b).f())
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field AppCompatSpinner b>
	//*   2    4:invokestatic    #27  <Method AppCompatSpinner$b AppCompatSpinner.a(AppCompatSpinner)>
	//*   3    7:invokevirtual   #32  <Method boolean AppCompatSpinner$b.f()>
	//*   4   10:ifne            23
			AppCompatSpinner.a(b).d();
	//    5   13:aload_0         
	//    6   14:getfield        #16  <Field AppCompatSpinner b>
	//    7   17:invokestatic    #27  <Method AppCompatSpinner$b AppCompatSpinner.a(AppCompatSpinner)>
	//    8   20:invokevirtual   #36  <Method void AppCompatSpinner$b.d()>
		return true;
	//    9   23:iconst_1        
	//   10   24:ireturn         
	}

	final AppCompatSpinner$b a;
	final AppCompatSpinner b;

	AppCompatSpinner$1(AppCompatSpinner appcompatspinner, View view, AppCompatSpinner$b appcompatspinner$b)
	{
		b = appcompatspinner;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field AppCompatSpinner b>
		a = appcompatspinner$b;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #18  <Field AppCompatSpinner$b a>
		super(view);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #21  <Method void ac(View)>
	//    9   15:return          
	}
}
