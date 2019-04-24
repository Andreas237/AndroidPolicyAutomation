// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package android.support.transition:
//			Transition

class Transition$3 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		a.g();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Transition a>
	//    2    4:invokevirtual   #22  <Method void Transition.g()>
		animator.removeListener(((android.animation.atorListener) (this)));
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #28  <Method void Animator.removeListener(android.animation.Animator$AnimatorListener)>
	//    6   12:return          
	}

	final Transition a;

	Transition$3(Transition transition)
	{
		a = transition;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field Transition a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void AnimatorListenerAdapter()>
	//    5    9:return          
	}
}
