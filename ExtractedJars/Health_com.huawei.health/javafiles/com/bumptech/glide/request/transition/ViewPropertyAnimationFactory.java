// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;

// Referenced classes of package com.bumptech.glide.request.transition:
//			TransitionFactory, NoTransition, ViewPropertyTransition, Transition

public class ViewPropertyAnimationFactory
	implements TransitionFactory
{

	public ViewPropertyAnimationFactory(ViewPropertyTransition.Animator animator1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		animator = animator1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field ViewPropertyTransition$Animator animator>
	//    5    9:return          
	}

	public Transition build(DataSource datasource, boolean flag)
	{
		if(datasource == DataSource.MEMORY_CACHE || !flag)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #28  <Field DataSource DataSource.MEMORY_CACHE>
	//*   2    4:if_acmpeq       11
	//*   3    7:iload_2         
	//*   4    8:ifne            15
			return NoTransition.get();
	//    5   11:invokestatic    #34  <Method Transition NoTransition.get()>
	//    6   14:areturn         
		if(animation == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #36  <Field ViewPropertyTransition animation>
	//*   9   19:ifnonnull       37
			animation = new ViewPropertyTransition(animator);
	//   10   22:aload_0         
	//   11   23:new             #38  <Class ViewPropertyTransition>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:getfield        #19  <Field ViewPropertyTransition$Animator animator>
	//   15   31:invokespecial   #40  <Method void ViewPropertyTransition(ViewPropertyTransition$Animator)>
	//   16   34:putfield        #36  <Field ViewPropertyTransition animation>
		return ((Transition) (animation));
	//   17   37:aload_0         
	//   18   38:getfield        #36  <Field ViewPropertyTransition animation>
	//   19   41:areturn         
	}

	private ViewPropertyTransition animation;
	private final ViewPropertyTransition.Animator animator;
}
