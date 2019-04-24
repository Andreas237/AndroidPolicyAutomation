// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;


// Referenced classes of package com.github.mikephil.charting.animation:
//			EasingFunction, Easing

static final class Easing$EasingFunctions$22
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
		float f1 = f / 0.5F;
	//    6    8:fload_1         
	//    7    9:ldc1            #19  <Float 0.5F>
	//    8   11:fdiv            
	//    9   12:fstore_2        
		if(f1 == 2.0F)
	//*  10   13:fload_2         
	//*  11   14:fconst_2        
	//*  12   15:fcmpl           
	//*  13   16:ifne            21
			return 1.0F;
	//   14   19:fconst_1        
	//   15   20:freturn         
		f = (0.45F / 6.283185F) * (float)Math.asin(1.0D);
	//   16   21:ldc1            #20  <Float 0.45F>
	//   17   23:ldc1            #21  <Float 6.283185F>
	//   18   25:fdiv            
	//   19   26:dconst_1        
	//   20   27:invokestatic    #27  <Method double Math.asin(double)>
	//   21   30:d2f             
	//   22   31:fmul            
	//   23   32:fstore_1        
		if(f1 < 1.0F)
	//*  24   33:fload_2         
	//*  25   34:fconst_1        
	//*  26   35:fcmpg           
	//*  27   36:ifge            80
		{
			f1--;
	//   28   39:fload_2         
	//   29   40:fconst_1        
	//   30   41:fsub            
	//   31   42:fstore_2        
			float f2 = (float)Math.pow(2D, 10F * f1);
	//   32   43:ldc2w           #28  <Double 2D>
	//   33   46:ldc1            #30  <Float 10F>
	//   34   48:fload_2         
	//   35   49:fmul            
	//   36   50:f2d             
	//   37   51:invokestatic    #34  <Method double Math.pow(double, double)>
	//   38   54:d2f             
	//   39   55:fstore_3        
			return -0.5F * ((float)Math.sin(((double)(1.0F * f1 - f) * 6.2831853071795862D) / (double)0.45F) * f2);
	//   40   56:ldc1            #35  <Float -0.5F>
	//   41   58:fconst_1        
	//   42   59:fload_2         
	//   43   60:fmul            
	//   44   61:fload_1         
	//   45   62:fsub            
	//   46   63:f2d             
	//   47   64:ldc2w           #36  <Double 6.2831853071795862D>
	//   48   67:dmul            
	//   49   68:ldc1            #20  <Float 0.45F>
	//   50   70:f2d             
	//   51   71:ddiv            
	//   52   72:invokestatic    #40  <Method double Math.sin(double)>
	//   53   75:d2f             
	//   54   76:fload_3         
	//   55   77:fmul            
	//   56   78:fmul            
	//   57   79:freturn         
		} else
		{
			f1--;
	//   58   80:fload_2         
	//   59   81:fconst_1        
	//   60   82:fsub            
	//   61   83:fstore_2        
			return (float)Math.pow(2D, -10F * f1) * (float)Math.sin(((double)(f1 * 1.0F - f) * 6.2831853071795862D) / (double)0.45F) * 0.5F + 1.0F;
	//   62   84:ldc2w           #28  <Double 2D>
	//   63   87:ldc1            #41  <Float -10F>
	//   64   89:fload_2         
	//   65   90:fmul            
	//   66   91:f2d             
	//   67   92:invokestatic    #34  <Method double Math.pow(double, double)>
	//   68   95:d2f             
	//   69   96:fload_2         
	//   70   97:fconst_1        
	//   71   98:fmul            
	//   72   99:fload_1         
	//   73  100:fsub            
	//   74  101:f2d             
	//   75  102:ldc2w           #36  <Double 6.2831853071795862D>
	//   76  105:dmul            
	//   77  106:ldc1            #20  <Float 0.45F>
	//   78  108:f2d             
	//   79  109:ddiv            
	//   80  110:invokestatic    #40  <Method double Math.sin(double)>
	//   81  113:d2f             
	//   82  114:fmul            
	//   83  115:ldc1            #19  <Float 0.5F>
	//   84  117:fmul            
	//   85  118:fconst_1        
	//   86  119:fadd            
	//   87  120:freturn         
		}
	}

	Easing$EasingFunctions$22()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
