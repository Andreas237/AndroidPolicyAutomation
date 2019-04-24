// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;


// Referenced classes of package com.github.mikephil.charting.animation:
//			EasingFunction, Easing

static final class Easing$EasingFunctions$28
	implements EasingFunction
{

	public float getInterpolation(float f)
	{
		if(f < 0.5F)
	//*   0    0:fload_1         
	//*   1    1:ldc1            #19  <Float 0.5F>
	//*   2    3:fcmpg           
	//*   3    4:ifge            22
			return Easing.EasingFunctions.EaseInBounce.getInterpolation(2.0F * f) * 0.5F;
	//    4    7:getstatic       #23  <Field EasingFunction Easing$EasingFunctions.EaseInBounce>
	//    5   10:fconst_2        
	//    6   11:fload_1         
	//    7   12:fmul            
	//    8   13:invokeinterface #25  <Method float EasingFunction.getInterpolation(float)>
	//    9   18:ldc1            #19  <Float 0.5F>
	//   10   20:fmul            
	//   11   21:freturn         
		else
			return Easing.EasingFunctions.EaseOutBounce.getInterpolation(2.0F * f - 1.0F) * 0.5F + 0.5F;
	//   12   22:getstatic       #28  <Field EasingFunction Easing$EasingFunctions.EaseOutBounce>
	//   13   25:fconst_2        
	//   14   26:fload_1         
	//   15   27:fmul            
	//   16   28:fconst_1        
	//   17   29:fsub            
	//   18   30:invokeinterface #25  <Method float EasingFunction.getInterpolation(float)>
	//   19   35:ldc1            #19  <Float 0.5F>
	//   20   37:fmul            
	//   21   38:ldc1            #19  <Float 0.5F>
	//   22   40:fadd            
	//   23   41:freturn         
	}

	Easing$EasingFunctions$28()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
