// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bumptech.glide.load.DataSource;

// Referenced classes of package com.bumptech.glide.request.transition:
//			TransitionFactory, NoTransition, ViewTransition, Transition

public class ViewAnimationFactory
	implements TransitionFactory
{
	static class ConcreteViewTransitionAnimationFactory
		implements ViewTransition.ViewTransitionAnimationFactory
	{

		public Animation build(Context context)
		{
			return animation;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Animation animation>
		//    2    4:areturn         
		}

		private final Animation animation;

		public ConcreteViewTransitionAnimationFactory(Animation animation1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			animation = animation1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field Animation animation>
		//    5    9:return          
		}
	}

	static class ResourceViewTransitionAnimationFactory
		implements ViewTransition.ViewTransitionAnimationFactory
	{

		public Animation build(Context context)
		{
			return AnimationUtils.loadAnimation(context, animationId);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #18  <Field int animationId>
		//    3    5:invokestatic    #27  <Method Animation AnimationUtils.loadAnimation(Context, int)>
		//    4    8:areturn         
		}

		private final int animationId;

		public ResourceViewTransitionAnimationFactory(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			animationId = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #18  <Field int animationId>
		//    5    9:return          
		}
	}


	public ViewAnimationFactory(int i)
	{
		this(((ViewTransition.ViewTransitionAnimationFactory) (new ResourceViewTransitionAnimationFactory(i))));
	//    0    0:aload_0         
	//    1    1:new             #12  <Class ViewAnimationFactory$ResourceViewTransitionAnimationFactory>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #22  <Method void ViewAnimationFactory$ResourceViewTransitionAnimationFactory(int)>
	//    5    9:invokespecial   #25  <Method void ViewAnimationFactory(ViewTransition$ViewTransitionAnimationFactory)>
	//    6   12:return          
	}

	public ViewAnimationFactory(Animation animation)
	{
		this(((ViewTransition.ViewTransitionAnimationFactory) (new ConcreteViewTransitionAnimationFactory(animation))));
	//    0    0:aload_0         
	//    1    1:new             #9   <Class ViewAnimationFactory$ConcreteViewTransitionAnimationFactory>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #29  <Method void ViewAnimationFactory$ConcreteViewTransitionAnimationFactory(Animation)>
	//    5    9:invokespecial   #25  <Method void ViewAnimationFactory(ViewTransition$ViewTransitionAnimationFactory)>
	//    6   12:return          
	}

	ViewAnimationFactory(ViewTransition.ViewTransitionAnimationFactory viewtransitionanimationfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		viewTransitionAnimationFactory = viewtransitionanimationfactory;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #34  <Field ViewTransition$ViewTransitionAnimationFactory viewTransitionAnimationFactory>
	//    5    9:return          
	}

	public Transition build(DataSource datasource, boolean flag)
	{
		if(datasource == DataSource.MEMORY_CACHE || !flag)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #42  <Field DataSource DataSource.MEMORY_CACHE>
	//*   2    4:if_acmpeq       11
	//*   3    7:iload_2         
	//*   4    8:ifne            15
			return NoTransition.get();
	//    5   11:invokestatic    #48  <Method Transition NoTransition.get()>
	//    6   14:areturn         
		if(transition == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #50  <Field Transition transition>
	//*   9   19:ifnonnull       37
			transition = ((Transition) (new ViewTransition(viewTransitionAnimationFactory)));
	//   10   22:aload_0         
	//   11   23:new             #52  <Class ViewTransition>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:getfield        #34  <Field ViewTransition$ViewTransitionAnimationFactory viewTransitionAnimationFactory>
	//   15   31:invokespecial   #53  <Method void ViewTransition(ViewTransition$ViewTransitionAnimationFactory)>
	//   16   34:putfield        #50  <Field Transition transition>
		return transition;
	//   17   37:aload_0         
	//   18   38:getfield        #50  <Field Transition transition>
	//   19   41:areturn         
	}

	private Transition transition;
	private final ViewTransition.ViewTransitionAnimationFactory viewTransitionAnimationFactory;
}
