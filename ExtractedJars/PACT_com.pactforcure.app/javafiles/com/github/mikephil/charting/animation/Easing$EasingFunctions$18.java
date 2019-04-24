// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;


// Referenced classes of package com.github.mikephil.charting.animation:
//			EasingFunction, Easing

static final class Easing$EasingFunctions$18
	implements EasingFunction
{

	public float getInterpolation(float f)
	{
		f--;
	//    0    0:fload_1         
	//    1    1:fconst_1        
	//    2    2:fsub            
	//    3    3:fstore_1        
		return (float)Math.sqrt(1.0F - f * f);
	//    4    4:fconst_1        
	//    5    5:fload_1         
	//    6    6:fload_1         
	//    7    7:fmul            
	//    8    8:fsub            
	//    9    9:f2d             
	//   10   10:invokestatic    #24  <Method double Math.sqrt(double)>
	//   11   13:d2f             
	//   12   14:freturn         
	}

	Easing$EasingFunctions$18()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
