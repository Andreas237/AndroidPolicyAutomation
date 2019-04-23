// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.design.circularreveal.CircularRevealWidget;

// Referenced classes of package android.support.design.transformation:
//			FabTransformationBehavior

class FabTransformationBehavior$4 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		animator = ((Animator) (val$circularRevealChild.getRevealInfo()));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field CircularRevealWidget val$circularRevealChild>
	//    2    4:invokeinterface #31  <Method android.support.design.circularreveal.CircularRevealWidget$RevealInfo CircularRevealWidget.getRevealInfo()>
	//    3    9:astore_1        
		animator.radius = 3.402823E+38F;
	//    4   10:aload_1         
	//    5   11:ldc1            #32  <Float 3.402823E+38F>
	//    6   13:putfield        #38  <Field float android.support.design.circularreveal.CircularRevealWidget$RevealInfo.radius>
		val$circularRevealChild.setRevealInfo(((android.support.design.circularreveal.nfo) (animator)));
	//    7   16:aload_0         
	//    8   17:getfield        #19  <Field CircularRevealWidget val$circularRevealChild>
	//    9   20:aload_1         
	//   10   21:invokeinterface #42  <Method void CircularRevealWidget.setRevealInfo(android.support.design.circularreveal.CircularRevealWidget$RevealInfo)>
	//   11   26:return          
	}

	final FabTransformationBehavior this$0;
	final CircularRevealWidget val$circularRevealChild;

	FabTransformationBehavior$4()
	{
		this$0 = final_fabtransformationbehavior;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field FabTransformationBehavior this$0>
		val$circularRevealChild = CircularRevealWidget.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field CircularRevealWidget val$circularRevealChild>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void AnimatorListenerAdapter()>
	//    8   14:return          
	}
}
