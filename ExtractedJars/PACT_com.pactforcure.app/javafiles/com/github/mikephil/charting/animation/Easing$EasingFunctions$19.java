// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;


// Referenced classes of package com.github.mikephil.charting.animation:
//			EasingFunction, Easing

static final class Easing$EasingFunctions$19
	implements EasingFunction
{

	public float getInterpolation(float f)
	{
		f /= 0.5F;
	//    0    0:fload_1         
	//    1    1:ldc1            #19  <Float 0.5F>
	//    2    3:fdiv            
	//    3    4:fstore_1        
		if(f < 1.0F)
	//*   4    5:fload_1         
	//*   5    6:fconst_1        
	//*   6    7:fcmpg           
	//*   7    8:ifge            27
		{
			return -0.5F * ((float)Math.sqrt(1.0F - f * f) - 1.0F);
	//    8   11:ldc1            #20  <Float -0.5F>
	//    9   13:fconst_1        
	//   10   14:fload_1         
	//   11   15:fload_1         
	//   12   16:fmul            
	//   13   17:fsub            
	//   14   18:f2d             
	//   15   19:invokestatic    #26  <Method double Math.sqrt(double)>
	//   16   22:d2f             
	//   17   23:fconst_1        
	//   18   24:fsub            
	//   19   25:fmul            
	//   20   26:freturn         
		} else
		{
			f -= 2.0F;
	//   21   27:fload_1         
	//   22   28:fconst_2        
	//   23   29:fsub            
	//   24   30:fstore_1        
			return ((float)Math.sqrt(1.0F - f * f) + 1.0F) * 0.5F;
	//   25   31:fconst_1        
	//   26   32:fload_1         
	//   27   33:fload_1         
	//   28   34:fmul            
	//   29   35:fsub            
	//   30   36:f2d             
	//   31   37:invokestatic    #26  <Method double Math.sqrt(double)>
	//   32   40:d2f             
	//   33   41:fconst_1        
	//   34   42:fadd            
	//   35   43:ldc1            #19  <Float 0.5F>
	//   36   45:fmul            
	//   37   46:freturn         
		}
	}

	Easing$EasingFunctions$19()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
