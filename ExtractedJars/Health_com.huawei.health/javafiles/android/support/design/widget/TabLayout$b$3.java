// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package android.support.design.widget:
//			TabLayout

class TabLayout$b$3 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		b.d = e;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field TabLayout$b b>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field int e>
	//    4    8:putfield        #29  <Field int TabLayout$b.d>
		b.a = 0.0F;
	//    5   11:aload_0         
	//    6   12:getfield        #18  <Field TabLayout$b b>
	//    7   15:fconst_0        
	//    8   16:putfield        #33  <Field float TabLayout$b.a>
	//    9   19:return          
	}

	final TabLayout.b b;
	final int e;

	TabLayout$b$3(TabLayout.b b1, int i)
	{
		b = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field TabLayout$b b>
		e = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #20  <Field int e>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void AnimatorListenerAdapter()>
	//    8   14:return          
	}
}
