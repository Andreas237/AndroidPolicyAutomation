// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;


// Referenced classes of package com.github.mikephil.charting.animation:
//			EasingFunction, Easing

static final class Easing$EasingFunctions$25
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
	//*   7    8:ifge            32
		{
			float f1 = 1.70158F * 1.525F;
	//    8   11:ldc1            #20  <Float 1.70158F>
	//    9   13:ldc1            #21  <Float 1.525F>
	//   10   15:fmul            
	//   11   16:fstore_2        
			return f * f * ((1.0F + f1) * f - f1) * 0.5F;
	//   12   17:fload_1         
	//   13   18:fload_1         
	//   14   19:fmul            
	//   15   20:fconst_1        
	//   16   21:fload_2         
	//   17   22:fadd            
	//   18   23:fload_1         
	//   19   24:fmul            
	//   20   25:fload_2         
	//   21   26:fsub            
	//   22   27:fmul            
	//   23   28:ldc1            #19  <Float 0.5F>
	//   24   30:fmul            
	//   25   31:freturn         
		} else
		{
			f -= 2.0F;
	//   26   32:fload_1         
	//   27   33:fconst_2        
	//   28   34:fsub            
	//   29   35:fstore_1        
			float f2 = 1.70158F * 1.525F;
	//   30   36:ldc1            #20  <Float 1.70158F>
	//   31   38:ldc1            #21  <Float 1.525F>
	//   32   40:fmul            
	//   33   41:fstore_2        
			return (f * f * ((1.0F + f2) * f + f2) + 2.0F) * 0.5F;
	//   34   42:fload_1         
	//   35   43:fload_1         
	//   36   44:fmul            
	//   37   45:fconst_1        
	//   38   46:fload_2         
	//   39   47:fadd            
	//   40   48:fload_1         
	//   41   49:fmul            
	//   42   50:fload_2         
	//   43   51:fadd            
	//   44   52:fmul            
	//   45   53:fconst_2        
	//   46   54:fadd            
	//   47   55:ldc1            #19  <Float 0.5F>
	//   48   57:fmul            
	//   49   58:freturn         
		}
	}

	Easing$EasingFunctions$25()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
