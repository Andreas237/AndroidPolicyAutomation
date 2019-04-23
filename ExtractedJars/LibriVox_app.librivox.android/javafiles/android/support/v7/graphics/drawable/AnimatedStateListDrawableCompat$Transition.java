// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics.drawable;


abstract class AnimatedStateListDrawableCompat$Transition
{

	public boolean canReverse()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void reverse()
	{
	//    0    0:return          
	}

	public abstract void start();

	public abstract void stop();

	private AnimatedStateListDrawableCompat$Transition()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	AnimatedStateListDrawableCompat$Transition(AnimatedStateListDrawableCompat._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AnimatedStateListDrawableCompat$Transition()>
	//    2    4:return          
	}
}
