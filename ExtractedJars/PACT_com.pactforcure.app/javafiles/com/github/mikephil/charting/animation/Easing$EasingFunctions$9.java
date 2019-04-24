// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;


// Referenced classes of package com.github.mikephil.charting.animation:
//			EasingFunction, Easing

static final class Easing$EasingFunctions$9
	implements EasingFunction
{

	public float getInterpolation(float f)
	{
		f--;
	//    0    0:fload_1         
	//    1    1:fconst_1        
	//    2    2:fsub            
	//    3    3:fstore_1        
		return -(f * f * f * f - 1.0F);
	//    4    4:fload_1         
	//    5    5:fload_1         
	//    6    6:fmul            
	//    7    7:fload_1         
	//    8    8:fmul            
	//    9    9:fload_1         
	//   10   10:fmul            
	//   11   11:fconst_1        
	//   12   12:fsub            
	//   13   13:fneg            
	//   14   14:freturn         
	}

	Easing$EasingFunctions$9()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
