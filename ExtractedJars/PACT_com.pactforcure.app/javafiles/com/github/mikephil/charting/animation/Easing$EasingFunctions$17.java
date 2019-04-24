// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;


// Referenced classes of package com.github.mikephil.charting.animation:
//			EasingFunction, Easing

static final class Easing$EasingFunctions$17
	implements EasingFunction
{

	public float getInterpolation(float f)
	{
		return -((float)Math.sqrt(1.0F - f * f) - 1.0F);
	//    0    0:fconst_1        
	//    1    1:fload_1         
	//    2    2:fload_1         
	//    3    3:fmul            
	//    4    4:fsub            
	//    5    5:f2d             
	//    6    6:invokestatic    #24  <Method double Math.sqrt(double)>
	//    7    9:d2f             
	//    8   10:fconst_1        
	//    9   11:fsub            
	//   10   12:fneg            
	//   11   13:freturn         
	}

	Easing$EasingFunctions$17()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
