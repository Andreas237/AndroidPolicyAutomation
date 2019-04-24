// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;


// Referenced classes of package com.github.mikephil.charting.animation:
//			EasingFunction, Easing

static final class Easing$EasingFunctions$3
	implements EasingFunction
{

	public float getInterpolation(float f)
	{
		return -f * (f - 2.0F);
	//    0    0:fload_1         
	//    1    1:fneg            
	//    2    2:fload_1         
	//    3    3:fconst_2        
	//    4    4:fsub            
	//    5    5:fmul            
	//    6    6:freturn         
	}

	Easing$EasingFunctions$3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
