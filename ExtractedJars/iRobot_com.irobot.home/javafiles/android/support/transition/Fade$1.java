// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.view.View;

// Referenced classes of package android.support.transition:
//			ad, Fade, au, Transition

class Fade$1 extends ad
{

	public void a(Transition transition)
	{
		au.a(a, 1.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field View a>
	//    2    4:fconst_1        
	//    3    5:invokestatic    #28  <Method void au.a(View, float)>
		au.e(a);
	//    4    8:aload_0         
	//    5    9:getfield        #18  <Field View a>
	//    6   12:invokestatic    #32  <Method void au.e(View)>
		transition.b(((ion.c) (this)));
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #37  <Method Transition Transition.b(Transition$c)>
	//   10   20:pop             
	//   11   21:return          
	}

	final View a;
	final Fade b;

	Fade$1(Fade fade, View view)
	{
		b = fade;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field Fade b>
		a = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field View a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #21  <Method void ad()>
	//    8   14:return          
	}
}
