// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import com.bumptech.glide.request.transition.TransitionFactory;

// Referenced classes of package com.bumptech.glide:
//			TransitionOptions

public final class GenericTransitionOptions extends TransitionOptions
{

	public GenericTransitionOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void TransitionOptions()>
	//    2    4:return          
	}

	public static GenericTransitionOptions with(int i)
	{
		return (GenericTransitionOptions)(new GenericTransitionOptions()).transition(i);
	//    0    0:new             #2   <Class GenericTransitionOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void GenericTransitionOptions()>
	//    3    7:iload_0         
	//    4    8:invokevirtual   #18  <Method TransitionOptions transition(int)>
	//    5   11:checkcast       #2   <Class GenericTransitionOptions>
	//    6   14:areturn         
	}

	public static GenericTransitionOptions with(TransitionFactory transitionfactory)
	{
		return (GenericTransitionOptions)(new GenericTransitionOptions()).transition(transitionfactory);
	//    0    0:new             #2   <Class GenericTransitionOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void GenericTransitionOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #25  <Method TransitionOptions transition(TransitionFactory)>
	//    5   11:checkcast       #2   <Class GenericTransitionOptions>
	//    6   14:areturn         
	}

	public static GenericTransitionOptions with(com.bumptech.glide.request.transition.ViewPropertyTransition.Animator animator)
	{
		return (GenericTransitionOptions)(new GenericTransitionOptions()).transition(animator);
	//    0    0:new             #2   <Class GenericTransitionOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void GenericTransitionOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #31  <Method TransitionOptions transition(com.bumptech.glide.request.transition.ViewPropertyTransition$Animator)>
	//    5   11:checkcast       #2   <Class GenericTransitionOptions>
	//    6   14:areturn         
	}

	public static GenericTransitionOptions withNoTransition()
	{
		return (GenericTransitionOptions)(new GenericTransitionOptions()).dontTransition();
	//    0    0:new             #2   <Class GenericTransitionOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void GenericTransitionOptions()>
	//    3    7:invokevirtual   #38  <Method TransitionOptions dontTransition()>
	//    4   10:checkcast       #2   <Class GenericTransitionOptions>
	//    5   13:areturn         
	}
}
