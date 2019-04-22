// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package android.support.design.circularreveal:
//			CircularRevealCompat, CircularRevealWidget

static final class CircularRevealCompat$1 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		val$view.destroyCircularRevealCache();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field CircularRevealWidget val$view>
	//    2    4:invokeinterface #26  <Method void CircularRevealWidget.destroyCircularRevealCache()>
	//    3    9:return          
	}

	public void onAnimationStart(Animator animator)
	{
		val$view.buildCircularRevealCache();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field CircularRevealWidget val$view>
	//    2    4:invokeinterface #30  <Method void CircularRevealWidget.buildCircularRevealCache()>
	//    3    9:return          
	}

	final CircularRevealWidget val$view;

	CircularRevealCompat$1(CircularRevealWidget circularrevealwidget)
	{
		val$view = circularrevealwidget;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field CircularRevealWidget val$view>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void AnimatorListenerAdapter()>
	//    5    9:return          
	}
}
