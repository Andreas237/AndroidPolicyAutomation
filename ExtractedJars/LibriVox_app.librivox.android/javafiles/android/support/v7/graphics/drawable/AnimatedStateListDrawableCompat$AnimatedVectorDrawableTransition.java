// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics.drawable;

import android.support.d.a.c;

class AnimatedStateListDrawableCompat$AnimatedVectorDrawableTransition extends AnimatedStateListDrawableCompat.Transition
{

	public void start()
	{
		mAvd.start();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field c mAvd>
	//    2    4:invokevirtual   #20  <Method void c.start()>
	//    3    7:return          
	}

	public void stop()
	{
		mAvd.stop();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field c mAvd>
	//    2    4:invokevirtual   #23  <Method void c.stop()>
	//    3    7:return          
	}

	private final c mAvd;

	AnimatedStateListDrawableCompat$AnimatedVectorDrawableTransition(c c1)
	{
		super(((AnimatedStateListDrawableCompat._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #11  <Method void AnimatedStateListDrawableCompat$Transition(AnimatedStateListDrawableCompat$1)>
		mAvd = c1;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #13  <Field c mAvd>
	//    6   10:return          
	}
}
