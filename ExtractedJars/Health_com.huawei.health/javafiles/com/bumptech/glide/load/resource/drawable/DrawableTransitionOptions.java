// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.drawable;

import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory;
import com.bumptech.glide.request.transition.TransitionFactory;

public final class DrawableTransitionOptions extends TransitionOptions
{

	public DrawableTransitionOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void TransitionOptions()>
	//    2    4:return          
	}

	public static DrawableTransitionOptions with(TransitionFactory transitionfactory)
	{
		return (DrawableTransitionOptions)(new DrawableTransitionOptions()).transition(transitionfactory);
	//    0    0:new             #2   <Class DrawableTransitionOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void DrawableTransitionOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #17  <Method TransitionOptions transition(TransitionFactory)>
	//    5   11:checkcast       #2   <Class DrawableTransitionOptions>
	//    6   14:areturn         
	}

	public static DrawableTransitionOptions withCrossFade()
	{
		return (new DrawableTransitionOptions()).crossFade();
	//    0    0:new             #2   <Class DrawableTransitionOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void DrawableTransitionOptions()>
	//    3    7:invokevirtual   #24  <Method DrawableTransitionOptions crossFade()>
	//    4   10:areturn         
	}

	public static DrawableTransitionOptions withCrossFade(int i)
	{
		return (new DrawableTransitionOptions()).crossFade(i);
	//    0    0:new             #2   <Class DrawableTransitionOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void DrawableTransitionOptions()>
	//    3    7:iload_0         
	//    4    8:invokevirtual   #27  <Method DrawableTransitionOptions crossFade(int)>
	//    5   11:areturn         
	}

	public static DrawableTransitionOptions withCrossFade(com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder builder)
	{
		return (new DrawableTransitionOptions()).crossFade(builder);
	//    0    0:new             #2   <Class DrawableTransitionOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void DrawableTransitionOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #30  <Method DrawableTransitionOptions crossFade(com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder)>
	//    5   11:areturn         
	}

	public static DrawableTransitionOptions withCrossFade(DrawableCrossFadeFactory drawablecrossfadefactory)
	{
		return (new DrawableTransitionOptions()).crossFade(drawablecrossfadefactory);
	//    0    0:new             #2   <Class DrawableTransitionOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void DrawableTransitionOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #33  <Method DrawableTransitionOptions crossFade(DrawableCrossFadeFactory)>
	//    5   11:areturn         
	}

	public DrawableTransitionOptions crossFade()
	{
		return crossFade(new com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder());
	//    0    0:aload_0         
	//    1    1:new             #35  <Class com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder>
	//    2    4:dup             
	//    3    5:invokespecial   #36  <Method void com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder()>
	//    4    8:invokevirtual   #30  <Method DrawableTransitionOptions crossFade(com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder)>
	//    5   11:areturn         
	}

	public DrawableTransitionOptions crossFade(int i)
	{
		return crossFade(new com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder(i));
	//    0    0:aload_0         
	//    1    1:new             #35  <Class com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #39  <Method void com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder(int)>
	//    5    9:invokevirtual   #30  <Method DrawableTransitionOptions crossFade(com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder)>
	//    6   12:areturn         
	}

	public DrawableTransitionOptions crossFade(com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder builder)
	{
		return crossFade(builder.build());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #43  <Method DrawableCrossFadeFactory com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder.build()>
	//    3    5:invokevirtual   #33  <Method DrawableTransitionOptions crossFade(DrawableCrossFadeFactory)>
	//    4    8:areturn         
	}

	public DrawableTransitionOptions crossFade(DrawableCrossFadeFactory drawablecrossfadefactory)
	{
		return (DrawableTransitionOptions)transition(((TransitionFactory) (drawablecrossfadefactory)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #17  <Method TransitionOptions transition(TransitionFactory)>
	//    3    5:checkcast       #2   <Class DrawableTransitionOptions>
	//    4    8:areturn         
	}
}
