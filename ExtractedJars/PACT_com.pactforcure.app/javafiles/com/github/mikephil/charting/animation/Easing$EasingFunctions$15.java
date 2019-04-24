// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;


// Referenced classes of package com.github.mikephil.charting.animation:
//			EasingFunction, Easing

static final class Easing$EasingFunctions$15
	implements EasingFunction
{

	public float getInterpolation(float f)
	{
		if(f == 1.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_1        
	//*   2    2:fcmpl           
	//*   3    3:ifne            8
			return 1.0F;
	//    4    6:fconst_1        
	//    5    7:freturn         
		else
			return -(float)Math.pow(2D, (1.0F + f) * -10F);
	//    6    8:ldc2w           #19  <Double 2D>
	//    7   11:fconst_1        
	//    8   12:fload_1         
	//    9   13:fadd            
	//   10   14:ldc1            #21  <Float -10F>
	//   11   16:fmul            
	//   12   17:f2d             
	//   13   18:invokestatic    #27  <Method double Math.pow(double, double)>
	//   14   21:d2f             
	//   15   22:fneg            
	//   16   23:freturn         
	}

	Easing$EasingFunctions$15()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
