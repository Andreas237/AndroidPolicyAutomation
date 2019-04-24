// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;


// Referenced classes of package com.github.mikephil.charting.animation:
//			EasingFunction, Easing

static final class Easing$EasingFunctions$4
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
	//*   7    8:ifge            18
		{
			return 0.5F * f * f;
	//    8   11:ldc1            #19  <Float 0.5F>
	//    9   13:fload_1         
	//   10   14:fmul            
	//   11   15:fload_1         
	//   12   16:fmul            
	//   13   17:freturn         
		} else
		{
			f--;
	//   14   18:fload_1         
	//   15   19:fconst_1        
	//   16   20:fsub            
	//   17   21:fstore_1        
			return -0.5F * ((f - 2.0F) * f - 1.0F);
	//   18   22:ldc1            #20  <Float -0.5F>
	//   19   24:fload_1         
	//   20   25:fconst_2        
	//   21   26:fsub            
	//   22   27:fload_1         
	//   23   28:fmul            
	//   24   29:fconst_1        
	//   25   30:fsub            
	//   26   31:fmul            
	//   27   32:freturn         
		}
	}

	Easing$EasingFunctions$4()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
