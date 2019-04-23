// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.request.transition.*;

public final class BitmapTransitionOptions extends TransitionOptions
{

	public BitmapTransitionOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void TransitionOptions()>
	//    2    4:return          
	}

	public static BitmapTransitionOptions with(TransitionFactory transitionfactory)
	{
		return (BitmapTransitionOptions)(new BitmapTransitionOptions()).transition(transitionfactory);
	//    0    0:new             #2   <Class BitmapTransitionOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void BitmapTransitionOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #18  <Method TransitionOptions transition(TransitionFactory)>
	//    5   11:checkcast       #2   <Class BitmapTransitionOptions>
	//    6   14:areturn         
	}

	public static BitmapTransitionOptions withCrossFade()
	{
		return (new BitmapTransitionOptions()).crossFade();
	//    0    0:new             #2   <Class BitmapTransitionOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void BitmapTransitionOptions()>
	//    3    7:invokevirtual   #27  <Method BitmapTransitionOptions crossFade()>
	//    4   10:areturn         
	}

	public static BitmapTransitionOptions withCrossFade(int i)
	{
		return (new BitmapTransitionOptions()).crossFade(i);
	//    0    0:new             #2   <Class BitmapTransitionOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void BitmapTransitionOptions()>
	//    3    7:iload_0         
	//    4    8:invokevirtual   #30  <Method BitmapTransitionOptions crossFade(int)>
	//    5   11:areturn         
	}

	public static BitmapTransitionOptions withCrossFade(com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder builder)
	{
		return (new BitmapTransitionOptions()).crossFade(builder);
	//    0    0:new             #2   <Class BitmapTransitionOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void BitmapTransitionOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #33  <Method BitmapTransitionOptions crossFade(com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder)>
	//    5   11:areturn         
	}

	public static BitmapTransitionOptions withCrossFade(DrawableCrossFadeFactory drawablecrossfadefactory)
	{
		return (new BitmapTransitionOptions()).crossFade(drawablecrossfadefactory);
	//    0    0:new             #2   <Class BitmapTransitionOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void BitmapTransitionOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #36  <Method BitmapTransitionOptions crossFade(DrawableCrossFadeFactory)>
	//    5   11:areturn         
	}

	public static BitmapTransitionOptions withWrapped(TransitionFactory transitionfactory)
	{
		return (new BitmapTransitionOptions()).transitionUsing(transitionfactory);
	//    0    0:new             #2   <Class BitmapTransitionOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void BitmapTransitionOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #40  <Method BitmapTransitionOptions transitionUsing(TransitionFactory)>
	//    5   11:areturn         
	}

	public BitmapTransitionOptions crossFade()
	{
		return crossFade(new com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder());
	//    0    0:aload_0         
	//    1    1:new             #43  <Class com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder>
	//    2    4:dup             
	//    3    5:invokespecial   #44  <Method void com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder()>
	//    4    8:invokevirtual   #33  <Method BitmapTransitionOptions crossFade(com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder)>
	//    5   11:areturn         
	}

	public BitmapTransitionOptions crossFade(int i)
	{
		return crossFade(new com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder(i));
	//    0    0:aload_0         
	//    1    1:new             #43  <Class com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #47  <Method void com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder(int)>
	//    5    9:invokevirtual   #33  <Method BitmapTransitionOptions crossFade(com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder)>
	//    6   12:areturn         
	}

	public BitmapTransitionOptions crossFade(com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder builder)
	{
		return transitionUsing(((TransitionFactory) (builder.build())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #51  <Method DrawableCrossFadeFactory com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder.build()>
	//    3    5:invokevirtual   #40  <Method BitmapTransitionOptions transitionUsing(TransitionFactory)>
	//    4    8:areturn         
	}

	public BitmapTransitionOptions crossFade(DrawableCrossFadeFactory drawablecrossfadefactory)
	{
		return transitionUsing(((TransitionFactory) (drawablecrossfadefactory)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #40  <Method BitmapTransitionOptions transitionUsing(TransitionFactory)>
	//    3    5:areturn         
	}

	public BitmapTransitionOptions transitionUsing(TransitionFactory transitionfactory)
	{
		return (BitmapTransitionOptions)transition(((TransitionFactory) (new BitmapTransitionFactory(transitionfactory))));
	//    0    0:aload_0         
	//    1    1:new             #53  <Class BitmapTransitionFactory>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #56  <Method void BitmapTransitionFactory(TransitionFactory)>
	//    5    9:invokevirtual   #18  <Method TransitionOptions transition(TransitionFactory)>
	//    6   12:checkcast       #2   <Class BitmapTransitionOptions>
	//    7   15:areturn         
	}
}
