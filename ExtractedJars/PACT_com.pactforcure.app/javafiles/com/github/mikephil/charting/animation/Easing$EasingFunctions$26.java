// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;


// Referenced classes of package com.github.mikephil.charting.animation:
//			EasingFunction, Easing

static final class Easing$EasingFunctions$26
	implements EasingFunction
{

	public float getInterpolation(float f)
	{
		return 1.0F - Easing.EasingFunctions.EaseOutBounce.getInterpolation(1.0F - f);
	//    0    0:fconst_1        
	//    1    1:getstatic       #22  <Field EasingFunction Easing$EasingFunctions.EaseOutBounce>
	//    2    4:fconst_1        
	//    3    5:fload_1         
	//    4    6:fsub            
	//    5    7:invokeinterface #24  <Method float EasingFunction.getInterpolation(float)>
	//    6   12:fsub            
	//    7   13:freturn         
	}

	Easing$EasingFunctions$26()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
