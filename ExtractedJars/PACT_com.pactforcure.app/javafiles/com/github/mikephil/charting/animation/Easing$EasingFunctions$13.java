// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;


// Referenced classes of package com.github.mikephil.charting.animation:
//			EasingFunction, Easing

static final class Easing$EasingFunctions$13
	implements EasingFunction
{

	public float getInterpolation(float f)
	{
		return -0.5F * ((float)Math.cos(3.1415926535897931D * (double)f) - 1.0F);
	//    0    0:ldc1            #19  <Float -0.5F>
	//    1    2:ldc2w           #20  <Double 3.1415926535897931D>
	//    2    5:fload_1         
	//    3    6:f2d             
	//    4    7:dmul            
	//    5    8:invokestatic    #27  <Method double Math.cos(double)>
	//    6   11:d2f             
	//    7   12:fconst_1        
	//    8   13:fsub            
	//    9   14:fmul            
	//   10   15:freturn         
	}

	Easing$EasingFunctions$13()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
