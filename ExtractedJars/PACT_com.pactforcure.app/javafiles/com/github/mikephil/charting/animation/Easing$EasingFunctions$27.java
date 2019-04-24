// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;


// Referenced classes of package com.github.mikephil.charting.animation:
//			EasingFunction, Easing

static final class Easing$EasingFunctions$27
	implements EasingFunction
{

	public float getInterpolation(float f)
	{
		if(f < 0.3636364F)
	//*   0    0:fload_1         
	//*   1    1:ldc1            #19  <Float 0.3636364F>
	//*   2    3:fcmpg           
	//*   3    4:ifge            14
			return 7.5625F * f * f;
	//    4    7:ldc1            #20  <Float 7.5625F>
	//    5    9:fload_1         
	//    6   10:fmul            
	//    7   11:fload_1         
	//    8   12:fmul            
	//    9   13:freturn         
		if(f < 0.7272727F)
	//*  10   14:fload_1         
	//*  11   15:ldc1            #21  <Float 0.7272727F>
	//*  12   17:fcmpg           
	//*  13   18:ifge            36
		{
			f -= 0.5454546F;
	//   14   21:fload_1         
	//   15   22:ldc1            #22  <Float 0.5454546F>
	//   16   24:fsub            
	//   17   25:fstore_1        
			return 7.5625F * f * f + 0.75F;
	//   18   26:ldc1            #20  <Float 7.5625F>
	//   19   28:fload_1         
	//   20   29:fmul            
	//   21   30:fload_1         
	//   22   31:fmul            
	//   23   32:ldc1            #23  <Float 0.75F>
	//   24   34:fadd            
	//   25   35:freturn         
		}
		if(f < 0.9090909F)
	//*  26   36:fload_1         
	//*  27   37:ldc1            #24  <Float 0.9090909F>
	//*  28   39:fcmpg           
	//*  29   40:ifge            58
		{
			f -= 0.8181818F;
	//   30   43:fload_1         
	//   31   44:ldc1            #25  <Float 0.8181818F>
	//   32   46:fsub            
	//   33   47:fstore_1        
			return 7.5625F * f * f + 0.9375F;
	//   34   48:ldc1            #20  <Float 7.5625F>
	//   35   50:fload_1         
	//   36   51:fmul            
	//   37   52:fload_1         
	//   38   53:fmul            
	//   39   54:ldc1            #26  <Float 0.9375F>
	//   40   56:fadd            
	//   41   57:freturn         
		} else
		{
			f -= 0.9545454F;
	//   42   58:fload_1         
	//   43   59:ldc1            #27  <Float 0.9545454F>
	//   44   61:fsub            
	//   45   62:fstore_1        
			return 7.5625F * f * f + 0.984375F;
	//   46   63:ldc1            #20  <Float 7.5625F>
	//   47   65:fload_1         
	//   48   66:fmul            
	//   49   67:fload_1         
	//   50   68:fmul            
	//   51   69:ldc1            #28  <Float 0.984375F>
	//   52   71:fadd            
	//   53   72:freturn         
		}
	}

	Easing$EasingFunctions$27()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
