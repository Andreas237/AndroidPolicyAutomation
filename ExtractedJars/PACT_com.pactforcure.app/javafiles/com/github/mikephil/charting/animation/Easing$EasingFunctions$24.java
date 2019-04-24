// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;


// Referenced classes of package com.github.mikephil.charting.animation:
//			EasingFunction, Easing

static final class Easing$EasingFunctions$24
	implements EasingFunction
{

	public float getInterpolation(float f)
	{
		f--;
	//    0    0:fload_1         
	//    1    1:fconst_1        
	//    2    2:fsub            
	//    3    3:fstore_1        
		return f * f * (2.70158F * f + 1.70158F) + 1.0F;
	//    4    4:fload_1         
	//    5    5:fload_1         
	//    6    6:fmul            
	//    7    7:ldc1            #19  <Float 2.70158F>
	//    8    9:fload_1         
	//    9   10:fmul            
	//   10   11:ldc1            #20  <Float 1.70158F>
	//   11   13:fadd            
	//   12   14:fmul            
	//   13   15:fconst_1        
	//   14   16:fadd            
	//   15   17:freturn         
	}

	Easing$EasingFunctions$24()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
