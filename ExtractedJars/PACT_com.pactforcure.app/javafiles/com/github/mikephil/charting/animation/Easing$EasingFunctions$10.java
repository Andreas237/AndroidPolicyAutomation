// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;


// Referenced classes of package com.github.mikephil.charting.animation:
//			EasingFunction, Easing

static final class Easing$EasingFunctions$10
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
	//*   7    8:ifge            22
		{
			return 0.5F * f * f * f * f;
	//    8   11:ldc1            #19  <Float 0.5F>
	//    9   13:fload_1         
	//   10   14:fmul            
	//   11   15:fload_1         
	//   12   16:fmul            
	//   13   17:fload_1         
	//   14   18:fmul            
	//   15   19:fload_1         
	//   16   20:fmul            
	//   17   21:freturn         
		} else
		{
			f -= 2.0F;
	//   18   22:fload_1         
	//   19   23:fconst_2        
	//   20   24:fsub            
	//   21   25:fstore_1        
			return -0.5F * (f * f * f * f - 2.0F);
	//   22   26:ldc1            #20  <Float -0.5F>
	//   23   28:fload_1         
	//   24   29:fload_1         
	//   25   30:fmul            
	//   26   31:fload_1         
	//   27   32:fmul            
	//   28   33:fload_1         
	//   29   34:fmul            
	//   30   35:fconst_2        
	//   31   36:fsub            
	//   32   37:fmul            
	//   33   38:freturn         
		}
	}

	Easing$EasingFunctions$10()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
