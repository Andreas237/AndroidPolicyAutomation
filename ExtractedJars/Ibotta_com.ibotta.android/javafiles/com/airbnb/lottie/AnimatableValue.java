// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;


// Referenced classes of package com.airbnb.lottie:
//			BaseKeyframeAnimation

interface AnimatableValue
{
	public static interface Factory
	{

		public abstract Object valueFromObject(Object obj, float f);
	}


	public abstract BaseKeyframeAnimation createAnimation();

	public abstract boolean hasAnimation();
}
