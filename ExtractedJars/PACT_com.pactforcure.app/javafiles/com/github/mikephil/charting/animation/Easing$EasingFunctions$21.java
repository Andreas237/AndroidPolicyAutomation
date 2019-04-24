// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;


// Referenced classes of package com.github.mikephil.charting.animation:
//			EasingFunction, Easing

static final class Easing$EasingFunctions$21
	implements EasingFunction
{

	public float getInterpolation(float f)
	{
		if(f == 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpl           
	//*   3    3:ifne            8
			return 0.0F;
	//    4    6:fconst_0        
	//    5    7:freturn         
		if(f == 1.0F)
	//*   6    8:fload_1         
	//*   7    9:fconst_1        
	//*   8   10:fcmpl           
	//*   9   11:ifne            16
		{
			return 1.0F;
	//   10   14:fconst_1        
	//   11   15:freturn         
		} else
		{
			float f1 = 0.3F / 6.283185F;
	//   12   16:ldc1            #19  <Float 0.3F>
	//   13   18:ldc1            #20  <Float 6.283185F>
	//   14   20:fdiv            
	//   15   21:fstore_2        
			float f2 = (float)Math.asin(1.0D);
	//   16   22:dconst_1        
	//   17   23:invokestatic    #26  <Method double Math.asin(double)>
	//   18   26:d2f             
	//   19   27:fstore_3        
			return (float)Math.pow(2D, -10F * f) * (float)Math.sin(((double)(f - f1 * f2) * 6.2831853071795862D) / (double)0.3F) + 1.0F;
	//   20   28:ldc2w           #27  <Double 2D>
	//   21   31:ldc1            #29  <Float -10F>
	//   22   33:fload_1         
	//   23   34:fmul            
	//   24   35:f2d             
	//   25   36:invokestatic    #33  <Method double Math.pow(double, double)>
	//   26   39:d2f             
	//   27   40:fload_1         
	//   28   41:fload_2         
	//   29   42:fload_3         
	//   30   43:fmul            
	//   31   44:fsub            
	//   32   45:f2d             
	//   33   46:ldc2w           #34  <Double 6.2831853071795862D>
	//   34   49:dmul            
	//   35   50:ldc1            #19  <Float 0.3F>
	//   36   52:f2d             
	//   37   53:ddiv            
	//   38   54:invokestatic    #38  <Method double Math.sin(double)>
	//   39   57:d2f             
	//   40   58:fmul            
	//   41   59:fconst_1        
	//   42   60:fadd            
	//   43   61:freturn         
		}
	}

	Easing$EasingFunctions$21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
