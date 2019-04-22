// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package android.support.design.widget:
//			StateListAnimator

class StateListAnimator$1 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		if(runningAnimator == animator)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field StateListAnimator this$0>
	//*   2    4:getfield        #22  <Field android.animation.ValueAnimator StateListAnimator.runningAnimator>
	//*   3    7:aload_1         
	//*   4    8:if_acmpne       19
			runningAnimator = null;
	//    5   11:aload_0         
	//    6   12:getfield        #12  <Field StateListAnimator this$0>
	//    7   15:aconst_null     
	//    8   16:putfield        #22  <Field android.animation.ValueAnimator StateListAnimator.runningAnimator>
	//    9   19:return          
	}

	final StateListAnimator this$0;

	StateListAnimator$1()
	{
		this$0 = StateListAnimator.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field StateListAnimator this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void AnimatorListenerAdapter()>
	//    5    9:return          
	}
}
