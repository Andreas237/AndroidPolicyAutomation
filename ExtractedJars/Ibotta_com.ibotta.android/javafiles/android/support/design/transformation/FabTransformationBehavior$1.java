// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package android.support.design.transformation:
//			FabTransformationBehavior

class FabTransformationBehavior$1 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		if(!val$expanded)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field boolean val$expanded>
	//*   2    4:ifne            31
		{
			val$child.setVisibility(4);
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field View val$child>
	//    5   11:iconst_4        
	//    6   12:invokevirtual   #38  <Method void View.setVisibility(int)>
			val$dependency.setAlpha(1.0F);
	//    7   15:aload_0         
	//    8   16:getfield        #26  <Field View val$dependency>
	//    9   19:fconst_1        
	//   10   20:invokevirtual   #42  <Method void View.setAlpha(float)>
			val$dependency.setVisibility(0);
	//   11   23:aload_0         
	//   12   24:getfield        #26  <Field View val$dependency>
	//   13   27:iconst_0        
	//   14   28:invokevirtual   #38  <Method void View.setVisibility(int)>
		}
	//   15   31:return          
	}

	public void onAnimationStart(Animator animator)
	{
		if(val$expanded)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field boolean val$expanded>
	//*   2    4:ifeq            31
		{
			val$child.setVisibility(0);
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field View val$child>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #38  <Method void View.setVisibility(int)>
			val$dependency.setAlpha(0.0F);
	//    7   15:aload_0         
	//    8   16:getfield        #26  <Field View val$dependency>
	//    9   19:fconst_0        
	//   10   20:invokevirtual   #42  <Method void View.setAlpha(float)>
			val$dependency.setVisibility(4);
	//   11   23:aload_0         
	//   12   24:getfield        #26  <Field View val$dependency>
	//   13   27:iconst_4        
	//   14   28:invokevirtual   #38  <Method void View.setVisibility(int)>
		}
	//   15   31:return          
	}

	final FabTransformationBehavior this$0;
	final View val$child;
	final View val$dependency;
	final boolean val$expanded;

	FabTransformationBehavior$1()
	{
		this$0 = final_fabtransformationbehavior;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field FabTransformationBehavior this$0>
		val$expanded = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #22  <Field boolean val$expanded>
		val$child = view;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field View val$child>
		val$dependency = View.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #26  <Field View val$dependency>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #29  <Method void AnimatorListenerAdapter()>
	//   14   25:return          
	}
}
