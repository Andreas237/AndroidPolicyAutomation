// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;

// Referenced classes of package com.bumptech.glide.request.transition:
//			Transition, TransitionFactory

public class NoTransition
	implements Transition
{
	public static class NoAnimationFactory
		implements TransitionFactory
	{

		public Transition build(DataSource datasource, boolean flag)
		{
			return ((Transition) (NoTransition.NO_ANIMATION));
		//    0    0:getstatic       #21  <Field NoTransition NoTransition.NO_ANIMATION>
		//    1    3:areturn         
		}

		public NoAnimationFactory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}


	public NoTransition()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}

	public static Transition get()
	{
		return ((Transition) (NO_ANIMATION));
	//    0    0:getstatic       #23  <Field NoTransition NO_ANIMATION>
	//    1    3:areturn         
	}

	public static TransitionFactory getFactory()
	{
		return NO_ANIMATION_FACTORY;
	//    0    0:getstatic       #26  <Field TransitionFactory NO_ANIMATION_FACTORY>
	//    1    3:areturn         
	}

	public boolean transition(Object obj, Transition.ViewAdapter viewadapter)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	static final NoTransition NO_ANIMATION = new NoTransition();
	private static final TransitionFactory NO_ANIMATION_FACTORY = new NoAnimationFactory();

	static 
	{
	//    0    0:new             #2   <Class NoTransition>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void NoTransition()>
	//    3    7:putstatic       #23  <Field NoTransition NO_ANIMATION>
	//    4   10:new             #9   <Class NoTransition$NoAnimationFactory>
	//    5   13:dup             
	//    6   14:invokespecial   #24  <Method void NoTransition$NoAnimationFactory()>
	//    7   17:putstatic       #26  <Field TransitionFactory NO_ANIMATION_FACTORY>
	//*   8   20:return          
	}
}
