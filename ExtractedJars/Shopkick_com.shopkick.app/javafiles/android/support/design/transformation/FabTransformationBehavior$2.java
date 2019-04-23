// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.transformation;

import android.animation.ValueAnimator;
import android.view.View;

// Referenced classes of package android.support.design.transformation:
//			FabTransformationBehavior

class FabTransformationBehavior$2
	implements android.animation.Listener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		val$child.invalidate();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field View val$child>
	//    2    4:invokevirtual   #32  <Method void View.invalidate()>
	//    3    7:return          
	}

	final FabTransformationBehavior this$0;
	final View val$child;

	FabTransformationBehavior$2()
	{
		this$0 = final_fabtransformationbehavior;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field FabTransformationBehavior this$0>
		val$child = View.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field View val$child>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
