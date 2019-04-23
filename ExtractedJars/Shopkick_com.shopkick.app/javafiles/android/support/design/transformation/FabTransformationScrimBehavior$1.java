// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package android.support.design.transformation:
//			FabTransformationScrimBehavior

class FabTransformationScrimBehavior$1 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		if(!val$expanded)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean val$expanded>
	//*   2    4:ifne            15
			val$child.setVisibility(4);
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field View val$child>
	//    5   11:iconst_4        
	//    6   12:invokevirtual   #35  <Method void View.setVisibility(int)>
	//    7   15:return          
	}

	public void onAnimationStart(Animator animator)
	{
		if(val$expanded)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean val$expanded>
	//*   2    4:ifeq            15
			val$child.setVisibility(0);
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field View val$child>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #35  <Method void View.setVisibility(int)>
	//    7   15:return          
	}

	final FabTransformationScrimBehavior this$0;
	final View val$child;
	final boolean val$expanded;

	FabTransformationScrimBehavior$1()
	{
		this$0 = final_fabtransformationscrimbehavior;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field FabTransformationScrimBehavior this$0>
		val$expanded = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field boolean val$expanded>
		val$child = View.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field View val$child>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method void AnimatorListenerAdapter()>
	//   11   19:return          
	}
}
