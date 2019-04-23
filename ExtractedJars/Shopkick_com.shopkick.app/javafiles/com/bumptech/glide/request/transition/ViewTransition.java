// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.bumptech.glide.request.transition:
//			Transition

public class ViewTransition
	implements Transition
{
	static interface ViewTransitionAnimationFactory
	{

		public abstract Animation build(Context context);
	}


	ViewTransition(ViewTransitionAnimationFactory viewtransitionanimationfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		viewTransitionAnimationFactory = viewtransitionanimationfactory;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field ViewTransition$ViewTransitionAnimationFactory viewTransitionAnimationFactory>
	//    5    9:return          
	}

	public boolean transition(Object obj, Transition.ViewAdapter viewadapter)
	{
		obj = ((Object) (viewadapter.getView()));
	//    0    0:aload_2         
	//    1    1:invokeinterface #28  <Method View Transition$ViewAdapter.getView()>
	//    2    6:astore_1        
		if(obj != null)
	//*   3    7:aload_1         
	//*   4    8:ifnull          32
		{
			((View) (obj)).clearAnimation();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #33  <Method void View.clearAnimation()>
			((View) (obj)).startAnimation(viewTransitionAnimationFactory.build(((View) (obj)).getContext()));
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #19  <Field ViewTransition$ViewTransitionAnimationFactory viewTransitionAnimationFactory>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #37  <Method Context View.getContext()>
	//   12   24:invokeinterface #41  <Method Animation ViewTransition$ViewTransitionAnimationFactory.build(Context)>
	//   13   29:invokevirtual   #45  <Method void View.startAnimation(Animation)>
		}
		return false;
	//   14   32:iconst_0        
	//   15   33:ireturn         
	}

	private final ViewTransitionAnimationFactory viewTransitionAnimationFactory;
}
