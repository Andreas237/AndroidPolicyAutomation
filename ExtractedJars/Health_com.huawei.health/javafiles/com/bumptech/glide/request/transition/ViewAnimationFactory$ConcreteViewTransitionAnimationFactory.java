// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.animation.Animation;

// Referenced classes of package com.bumptech.glide.request.transition:
//			ViewAnimationFactory

static class ViewAnimationFactory$ConcreteViewTransitionAnimationFactory
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

	public ViewAnimationFactory$ConcreteViewTransitionAnimationFactory(Animation animation1)
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
