// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;

// Referenced classes of package com.bumptech.glide.request.transition:
//			TransitionFactory, NoTransition, Transition

public static class NoTransition$NoAnimationFactory
	implements TransitionFactory
{

	public Transition build(DataSource datasource, boolean flag)
	{
		return ((Transition) (NoTransition.NO_ANIMATION));
	//    0    0:getstatic       #21  <Field NoTransition NoTransition.NO_ANIMATION>
	//    1    3:areturn         
	}

	public NoTransition$NoAnimationFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
