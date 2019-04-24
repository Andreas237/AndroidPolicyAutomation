// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;


// Referenced classes of package com.github.mikephil.charting.animation:
//			EasingFunction, Easing

static final class Easing$EasingFunctions$20
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
			f--;
	//   20   28:fload_1         
	//   21   29:fconst_1        
	//   22   30:fsub            
	//   23   31:fstore_1        
			return -((float)Math.pow(2D, 10F * f) * (float)Math.sin(((double)(f - f1 * f2) * 6.2831853071795862D) / (double)0.3F));
	//   24   32:ldc2w           #27  <Double 2D>
	//   25   35:ldc1            #29  <Float 10F>
	//   26   37:fload_1         
	//   27   38:fmul            
	//   28   39:f2d             
	//   29   40:invokestatic    #33  <Method double Math.pow(double, double)>
	//   30   43:d2f             
	//   31   44:fload_1         
	//   32   45:fload_2         
	//   33   46:fload_3         
	//   34   47:fmul            
	//   35   48:fsub            
	//   36   49:f2d             
	//   37   50:ldc2w           #34  <Double 6.2831853071795862D>
	//   38   53:dmul            
	//   39   54:ldc1            #19  <Float 0.3F>
	//   40   56:f2d             
	//   41   57:ddiv            
	//   42   58:invokestatic    #38  <Method double Math.sin(double)>
	//   43   61:d2f             
	//   44   62:fmul            
	//   45   63:fneg            
	//   46   64:freturn         
		}
	}

	Easing$EasingFunctions$20()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
