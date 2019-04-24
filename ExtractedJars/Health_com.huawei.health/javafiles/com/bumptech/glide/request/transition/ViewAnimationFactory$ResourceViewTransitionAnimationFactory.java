// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

// Referenced classes of package com.bumptech.glide.request.transition:
//			ViewAnimationFactory

static class ViewAnimationFactory$ResourceViewTransitionAnimationFactory
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

	public ViewAnimationFactory$ResourceViewTransitionAnimationFactory(int i)
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
