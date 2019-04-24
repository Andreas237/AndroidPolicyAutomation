// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;


// Referenced classes of package com.github.mikephil.charting.animation:
//			EasingFunction, Easing

static final class Easing$EasingFunctions$7
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
	//*   7    8:ifge            20
		{
			return 0.5F * f * f * f;
	//    8   11:ldc1            #19  <Float 0.5F>
	//    9   13:fload_1         
	//   10   14:fmul            
	//   11   15:fload_1         
	//   12   16:fmul            
	//   13   17:fload_1         
	//   14   18:fmul            
	//   15   19:freturn         
		} else
		{
			f -= 2.0F;
	//   16   20:fload_1         
	//   17   21:fconst_2        
	//   18   22:fsub            
	//   19   23:fstore_1        
			return (f * f * f + 2.0F) * 0.5F;
	//   20   24:fload_1         
	//   21   25:fload_1         
	//   22   26:fmul            
	//   23   27:fload_1         
	//   24   28:fmul            
	//   25   29:fconst_2        
	//   26   30:fadd            
	//   27   31:ldc1            #19  <Float 0.5F>
	//   28   33:fmul            
	//   29   34:freturn         
		}
	}

	Easing$EasingFunctions$7()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
