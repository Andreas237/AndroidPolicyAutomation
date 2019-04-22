// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics.drawable;

import android.graphics.drawable.Animatable;

// Referenced classes of package android.support.v7.graphics.drawable:
//			AnimatedStateListDrawableCompat

private static class AnimatedStateListDrawableCompat$AnimatableTransition extends AnimatedStateListDrawableCompat.Transition
{

	public void start()
	{
		mA.start();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Animatable mA>
	//    2    4:invokeinterface #23  <Method void Animatable.start()>
	//    3    9:return          
	}

	public void stop()
	{
		mA.stop();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Animatable mA>
	//    2    4:invokeinterface #26  <Method void Animatable.stop()>
	//    3    9:return          
	}

	private final Animatable mA;

	AnimatedStateListDrawableCompat$AnimatableTransition(Animatable animatable)
	{
		super(((AnimatedStateListDrawableCompat._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #14  <Method void AnimatedStateListDrawableCompat$Transition(AnimatedStateListDrawableCompat$1)>
		mA = animatable;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #16  <Field Animatable mA>
	//    6   10:return          
	}
}
