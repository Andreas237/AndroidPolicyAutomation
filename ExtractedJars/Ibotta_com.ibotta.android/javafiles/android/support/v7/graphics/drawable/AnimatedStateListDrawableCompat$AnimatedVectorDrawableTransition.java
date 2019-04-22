// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics.drawable;

import android.support.graphics.drawable.AnimatedVectorDrawableCompat;

// Referenced classes of package android.support.v7.graphics.drawable:
//			AnimatedStateListDrawableCompat

private static class AnimatedStateListDrawableCompat$AnimatedVectorDrawableTransition extends AnimatedStateListDrawableCompat.Transition
{

	public void start()
	{
		mAvd.start();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field AnimatedVectorDrawableCompat mAvd>
	//    2    4:invokevirtual   #23  <Method void AnimatedVectorDrawableCompat.start()>
	//    3    7:return          
	}

	public void stop()
	{
		mAvd.stop();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field AnimatedVectorDrawableCompat mAvd>
	//    2    4:invokevirtual   #26  <Method void AnimatedVectorDrawableCompat.stop()>
	//    3    7:return          
	}

	private final AnimatedVectorDrawableCompat mAvd;

	AnimatedStateListDrawableCompat$AnimatedVectorDrawableTransition(AnimatedVectorDrawableCompat animatedvectordrawablecompat)
	{
		super(((AnimatedStateListDrawableCompat._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #14  <Method void AnimatedStateListDrawableCompat$Transition(AnimatedStateListDrawableCompat$1)>
		mAvd = animatedvectordrawablecompat;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #16  <Field AnimatedVectorDrawableCompat mAvd>
	//    6   10:return          
	}
}
