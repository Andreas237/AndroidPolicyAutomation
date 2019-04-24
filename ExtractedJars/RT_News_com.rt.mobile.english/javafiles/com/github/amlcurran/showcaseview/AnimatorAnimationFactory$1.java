// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview;

import android.animation.Animator;

// Referenced classes of package com.github.amlcurran.showcaseview:
//			AnimatorAnimationFactory

class AnimatorAnimationFactory$1
	implements android.animation.Animator.AnimatorListener
{

	public void onAnimationCancel(Animator animator)
	{
	//    0    0:return          
	}

	public void onAnimationEnd(Animator animator)
	{
	//    0    0:return          
	}

	public void onAnimationRepeat(Animator animator)
	{
	//    0    0:return          
	}

	public void onAnimationStart(Animator animator)
	{
		val$listener.onAnimationStart();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AnimationFactory$AnimationStartListener val$listener>
	//    2    4:invokeinterface #34  <Method void AnimationFactory$AnimationStartListener.onAnimationStart()>
	//    3    9:return          
	}

	final AnimatorAnimationFactory this$0;
	final tartListener val$listener;

	AnimatorAnimationFactory$1()
	{
		this$0 = final_animatoranimationfactory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AnimatorAnimationFactory this$0>
		val$listener = tartListener.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field AnimationFactory$AnimationStartListener val$listener>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
