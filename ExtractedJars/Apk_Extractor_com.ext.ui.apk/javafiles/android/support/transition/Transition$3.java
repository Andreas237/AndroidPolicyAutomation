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
		end();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Transition this$0>
	//    2    4:invokevirtual   #23  <Method void Transition.end()>
		animator.removeListener(((android.animation.atorListener) (this)));
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #29  <Method void Animator.removeListener(android.animation.Animator$AnimatorListener)>
	//    6   12:return          
	}

	final Transition this$0;

	Transition$3()
	{
		this$0 = Transition.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field Transition this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void AnimatorListenerAdapter()>
	//    5    9:return          
	}
}
