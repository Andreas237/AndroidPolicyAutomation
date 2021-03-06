// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import com.bumptech.glide.request.transition.NoTransition;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.request.transition.ViewAnimationFactory;
import com.bumptech.glide.util.Preconditions;

public abstract class TransitionOptions
	implements Cloneable
{

	public TransitionOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		transitionFactory = NoTransition.getFactory();
	//    2    4:aload_0         
	//    3    5:invokestatic    #20  <Method TransitionFactory NoTransition.getFactory()>
	//    4    8:putfield        #22  <Field TransitionFactory transitionFactory>
	//    5   11:return          
	}

	private TransitionOptions self()
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public final TransitionOptions clone()
	{
		TransitionOptions transitionoptions;
		try
		{
			transitionoptions = (TransitionOptions)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method Object Object.clone()>
	//    2    4:checkcast       #2   <Class TransitionOptions>
	//    3    7:astore_1        
		}
	//*   4    8:aload_1         
	//*   5    9:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*   6   10:astore_1        
		{
			throw new RuntimeException(((Throwable) (clonenotsupportedexception)));
	//    7   11:new             #35  <Class RuntimeException>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:invokespecial   #38  <Method void RuntimeException(Throwable)>
	//   11   19:athrow          
		}
		return transitionoptions;
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method TransitionOptions clone()>
	//    2    4:areturn         
	}

	final TransitionFactory getTransitionFactory()
	{
		return transitionFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field TransitionFactory transitionFactory>
	//    2    4:areturn         
	}

	public final TransitionOptions transition(int i)
	{
		return transition(((TransitionFactory) (new ViewAnimationFactory(i))));
	//    0    0:aload_0         
	//    1    1:new             #48  <Class ViewAnimationFactory>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #51  <Method void ViewAnimationFactory(int)>
	//    5    9:invokevirtual   #54  <Method TransitionOptions transition(TransitionFactory)>
	//    6   12:areturn         
	}

	public final TransitionOptions transition(TransitionFactory transitionfactory)
	{
		transitionFactory = (TransitionFactory)Preconditions.checkNotNull(((Object) (transitionfactory)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #62  <Method Object Preconditions.checkNotNull(Object)>
	//    3    5:checkcast       #64  <Class TransitionFactory>
	//    4    8:putfield        #22  <Field TransitionFactory transitionFactory>
		return self();
	//    5   11:aload_0         
	//    6   12:invokespecial   #66  <Method TransitionOptions self()>
	//    7   15:areturn         
	}

	private TransitionFactory transitionFactory;
}
