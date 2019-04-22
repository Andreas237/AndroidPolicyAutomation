// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import android.support.design.circularreveal.CircularRevealWidget;

// Referenced classes of package android.support.design.transformation:
//			FabTransformationBehavior

class FabTransformationBehavior$3 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		val$circularRevealChild.setCircularRevealOverlayDrawable(((Drawable) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field CircularRevealWidget val$circularRevealChild>
	//    2    4:aconst_null     
	//    3    5:invokeinterface #35  <Method void CircularRevealWidget.setCircularRevealOverlayDrawable(Drawable)>
	//    4   10:return          
	}

	public void onAnimationStart(Animator animator)
	{
		val$circularRevealChild.setCircularRevealOverlayDrawable(val$icon);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field CircularRevealWidget val$circularRevealChild>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field Drawable val$icon>
	//    4    8:invokeinterface #35  <Method void CircularRevealWidget.setCircularRevealOverlayDrawable(Drawable)>
	//    5   13:return          
	}

	final FabTransformationBehavior this$0;
	final CircularRevealWidget val$circularRevealChild;
	final Drawable val$icon;

	FabTransformationBehavior$3()
	{
		this$0 = final_fabtransformationbehavior;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field FabTransformationBehavior this$0>
		val$circularRevealChild = circularrevealwidget;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field CircularRevealWidget val$circularRevealChild>
		val$icon = Drawable.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field Drawable val$icon>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method void AnimatorListenerAdapter()>
	//   11   19:return          
	}
}
