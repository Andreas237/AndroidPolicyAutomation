// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;


// Referenced classes of package com.github.mikephil.charting.animation:
//			EasingFunction, Easing

static final class Easing$EasingFunctions$2
	implements EasingFunction
{

	public float getInterpolation(float f)
	{
		return f * f;
	//    0    0:fload_1         
	//    1    1:fload_1         
	//    2    2:fmul            
	//    3    3:freturn         
	}

	Easing$EasingFunctions$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
