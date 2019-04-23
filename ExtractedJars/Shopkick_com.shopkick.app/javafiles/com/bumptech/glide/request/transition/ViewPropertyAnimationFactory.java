// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;

// Referenced classes of package com.bumptech.glide.request.transition:
//			TransitionFactory, ViewPropertyTransition, NoTransition, Transition

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
		if(datasource != DataSource.MEMORY_CACHE && flag)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #28  <Field DataSource DataSource.MEMORY_CACHE>
	//*   2    4:if_acmpeq       41
	//*   3    7:iload_2         
	//*   4    8:ifne            14
	//*   5   11:goto            41
		{
			if(animation == null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #30  <Field ViewPropertyTransition animation>
	//*   8   18:ifnonnull       36
				animation = new ViewPropertyTransition(animator);
	//    9   21:aload_0         
	//   10   22:new             #32  <Class ViewPropertyTransition>
	//   11   25:dup             
	//   12   26:aload_0         
	//   13   27:getfield        #19  <Field ViewPropertyTransition$Animator animator>
	//   14   30:invokespecial   #34  <Method void ViewPropertyTransition(ViewPropertyTransition$Animator)>
	//   15   33:putfield        #30  <Field ViewPropertyTransition animation>
			return ((Transition) (animation));
	//   16   36:aload_0         
	//   17   37:getfield        #30  <Field ViewPropertyTransition animation>
	//   18   40:areturn         
		} else
		{
			return NoTransition.get();
	//   19   41:invokestatic    #40  <Method Transition NoTransition.get()>
	//   20   44:areturn         
		}
	}

	private ViewPropertyTransition animation;
	private final ViewPropertyTransition.Animator animator;
}
