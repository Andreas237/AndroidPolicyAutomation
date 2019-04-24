// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;


// Referenced classes of package com.github.mikephil.charting.animation:
//			EasingFunction, Easing

static final class Easing$EasingFunctions$16
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
			return 1.0F;
	//   10   14:fconst_1        
	//   11   15:freturn         
		f /= 0.5F;
	//   12   16:fload_1         
	//   13   17:ldc1            #19  <Float 0.5F>
	//   14   19:fdiv            
	//   15   20:fstore_1        
		if(f < 1.0F)
	//*  16   21:fload_1         
	//*  17   22:fconst_1        
	//*  18   23:fcmpg           
	//*  19   24:ifge            45
			return (float)Math.pow(2D, 10F * (f - 1.0F)) * 0.5F;
	//   20   27:ldc2w           #20  <Double 2D>
	//   21   30:ldc1            #22  <Float 10F>
	//   22   32:fload_1         
	//   23   33:fconst_1        
	//   24   34:fsub            
	//   25   35:fmul            
	//   26   36:f2d             
	//   27   37:invokestatic    #28  <Method double Math.pow(double, double)>
	//   28   40:d2f             
	//   29   41:ldc1            #19  <Float 0.5F>
	//   30   43:fmul            
	//   31   44:freturn         
		else
			return (-(float)Math.pow(2D, -10F * (f - 1.0F)) + 2.0F) * 0.5F;
	//   32   45:ldc2w           #20  <Double 2D>
	//   33   48:ldc1            #29  <Float -10F>
	//   34   50:fload_1         
	//   35   51:fconst_1        
	//   36   52:fsub            
	//   37   53:fmul            
	//   38   54:f2d             
	//   39   55:invokestatic    #28  <Method double Math.pow(double, double)>
	//   40   58:d2f             
	//   41   59:fneg            
	//   42   60:fconst_2        
	//   43   61:fadd            
	//   44   62:ldc1            #19  <Float 0.5F>
	//   45   64:fmul            
	//   46   65:freturn         
	}

	Easing$EasingFunctions$16()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
