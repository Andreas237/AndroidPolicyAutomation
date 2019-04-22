// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bumptech.glide.load.DataSource;

// Referenced classes of package com.bumptech.glide.request.transition:
//			TransitionFactory, ViewTransition, NoTransition, Transition

public class ViewAnimationFactory
	implements TransitionFactory
{
	private static class ResourceViewTransitionAnimationFactory
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

		ResourceViewTransitionAnimationFactory(int i)
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
	//    1    1:new             #9   <Class ViewAnimationFactory$ResourceViewTransitionAnimationFactory>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #19  <Method void ViewAnimationFactory$ResourceViewTransitionAnimationFactory(int)>
	//    5    9:invokespecial   #22  <Method void ViewAnimationFactory(ViewTransition$ViewTransitionAnimationFactory)>
	//    6   12:return          
	}

	ViewAnimationFactory(ViewTransition.ViewTransitionAnimationFactory viewtransitionanimationfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		viewTransitionAnimationFactory = viewtransitionanimationfactory;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field ViewTransition$ViewTransitionAnimationFactory viewTransitionAnimationFactory>
	//    5    9:return          
	}

	public Transition build(DataSource datasource, boolean flag)
	{
		if(datasource != DataSource.MEMORY_CACHE && flag)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #36  <Field DataSource DataSource.MEMORY_CACHE>
	//*   2    4:if_acmpeq       41
	//*   3    7:iload_2         
	//*   4    8:ifne            14
	//*   5   11:goto            41
		{
			if(transition == null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #38  <Field Transition transition>
	//*   8   18:ifnonnull       36
				transition = ((Transition) (new ViewTransition(viewTransitionAnimationFactory)));
	//    9   21:aload_0         
	//   10   22:new             #40  <Class ViewTransition>
	//   11   25:dup             
	//   12   26:aload_0         
	//   13   27:getfield        #28  <Field ViewTransition$ViewTransitionAnimationFactory viewTransitionAnimationFactory>
	//   14   30:invokespecial   #41  <Method void ViewTransition(ViewTransition$ViewTransitionAnimationFactory)>
	//   15   33:putfield        #38  <Field Transition transition>
			return transition;
	//   16   36:aload_0         
	//   17   37:getfield        #38  <Field Transition transition>
	//   18   40:areturn         
		} else
		{
			return NoTransition.get();
	//   19   41:invokestatic    #47  <Method Transition NoTransition.get()>
	//   20   44:areturn         
		}
	}

	private Transition transition;
	private final ViewTransition.ViewTransitionAnimationFactory viewTransitionAnimationFactory;
}
