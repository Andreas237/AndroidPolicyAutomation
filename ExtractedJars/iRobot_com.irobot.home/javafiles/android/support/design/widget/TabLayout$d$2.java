// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package android.support.design.widget:
//			TabLayout

class TabLayout$d$2 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		b.a = a;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field TabLayout$d b>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field int a>
	//    4    8:putfield        #28  <Field int TabLayout$d.a>
		b.b = 0.0F;
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field TabLayout$d b>
	//    7   15:fconst_0        
	//    8   16:putfield        #31  <Field float TabLayout$d.b>
	//    9   19:return          
	}

	final int a;
	final TabLayout.d b;

	TabLayout$d$2(TabLayout.d d1, int i)
	{
		b = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field TabLayout$d b>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field int a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void AnimatorListenerAdapter()>
	//    8   14:return          
	}
}
