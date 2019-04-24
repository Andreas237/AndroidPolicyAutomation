// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;


// Referenced classes of package com.github.mikephil.charting.animation:
//			EasingFunction, Easing

static final class Easing$EasingFunctions$12
	implements EasingFunction
{

	public float getInterpolation(float f)
	{
		return (float)Math.sin((double)f * 1.5707963267948966D);
	//    0    0:fload_1         
	//    1    1:f2d             
	//    2    2:ldc2w           #19  <Double 1.5707963267948966D>
	//    3    5:dmul            
	//    4    6:invokestatic    #26  <Method double Math.sin(double)>
	//    5    9:d2f             
	//    6   10:freturn         
	}

	Easing$EasingFunctions$12()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
