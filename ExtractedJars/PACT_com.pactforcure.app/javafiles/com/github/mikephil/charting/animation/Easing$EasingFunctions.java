// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;


// Referenced classes of package com.github.mikephil.charting.animation:
//			Easing, EasingFunction

private static class Easing$EasingFunctions
{

	public static final EasingFunction EaseInBack = new EasingFunction() {

		public float getInterpolation(float f)
		{
			return f * f * (2.70158F * f - 1.70158F);
		//    0    0:fload_1         
		//    1    1:fload_1         
		//    2    2:fmul            
		//    3    3:ldc1            #19  <Float 2.70158F>
		//    4    5:fload_1         
		//    5    6:fmul            
		//    6    7:ldc1            #20  <Float 1.70158F>
		//    7    9:fsub            
		//    8   10:fmul            
		//    9   11:freturn         
		}

	}
;
	public static final EasingFunction EaseInBounce = new EasingFunction() {

		public float getInterpolation(float f)
		{
			return 1.0F - Easing.EasingFunctions.EaseOutBounce.getInterpolation(1.0F - f);
		//    0    0:fconst_1        
		//    1    1:getstatic       #22  <Field EasingFunction Easing$EasingFunctions.EaseOutBounce>
		//    2    4:fconst_1        
		//    3    5:fload_1         
		//    4    6:fsub            
		//    5    7:invokeinterface #24  <Method float EasingFunction.getInterpolation(float)>
		//    6   12:fsub            
		//    7   13:freturn         
		}

	}
;
	public static final EasingFunction EaseInCirc = new EasingFunction() {

		public float getInterpolation(float f)
		{
			return -((float)Math.sqrt(1.0F - f * f) - 1.0F);
		//    0    0:fconst_1        
		//    1    1:fload_1         
		//    2    2:fload_1         
		//    3    3:fmul            
		//    4    4:fsub            
		//    5    5:f2d             
		//    6    6:invokestatic    #24  <Method double Math.sqrt(double)>
		//    7    9:d2f             
		//    8   10:fconst_1        
		//    9   11:fsub            
		//   10   12:fneg            
		//   11   13:freturn         
		}

	}
;
	public static final EasingFunction EaseInCubic = new EasingFunction() {

		public float getInterpolation(float f)
		{
			return f * f * f;
		//    0    0:fload_1         
		//    1    1:fload_1         
		//    2    2:fmul            
		//    3    3:fload_1         
		//    4    4:fmul            
		//    5    5:freturn         
		}

	}
;
	public static final EasingFunction EaseInElastic = new EasingFunction() {

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

	}
;
	public static final EasingFunction EaseInExpo = new EasingFunction() {

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
			else
				return (float)Math.pow(2D, 10F * (f - 1.0F));
		//    6    8:ldc2w           #19  <Double 2D>
		//    7   11:ldc1            #21  <Float 10F>
		//    8   13:fload_1         
		//    9   14:fconst_1        
		//   10   15:fsub            
		//   11   16:fmul            
		//   12   17:f2d             
		//   13   18:invokestatic    #27  <Method double Math.pow(double, double)>
		//   14   21:d2f             
		//   15   22:freturn         
		}

	}
;
	public static final EasingFunction EaseInOutBack = new EasingFunction() {

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

	}
;
	public static final EasingFunction EaseInOutBounce = new EasingFunction() {

		public float getInterpolation(float f)
		{
			if(f < 0.5F)
		//*   0    0:fload_1         
		//*   1    1:ldc1            #19  <Float 0.5F>
		//*   2    3:fcmpg           
		//*   3    4:ifge            22
				return Easing.EasingFunctions.EaseInBounce.getInterpolation(2.0F * f) * 0.5F;
		//    4    7:getstatic       #23  <Field EasingFunction Easing$EasingFunctions.EaseInBounce>
		//    5   10:fconst_2        
		//    6   11:fload_1         
		//    7   12:fmul            
		//    8   13:invokeinterface #25  <Method float EasingFunction.getInterpolation(float)>
		//    9   18:ldc1            #19  <Float 0.5F>
		//   10   20:fmul            
		//   11   21:freturn         
			else
				return Easing.EasingFunctions.EaseOutBounce.getInterpolation(2.0F * f - 1.0F) * 0.5F + 0.5F;
		//   12   22:getstatic       #28  <Field EasingFunction Easing$EasingFunctions.EaseOutBounce>
		//   13   25:fconst_2        
		//   14   26:fload_1         
		//   15   27:fmul            
		//   16   28:fconst_1        
		//   17   29:fsub            
		//   18   30:invokeinterface #25  <Method float EasingFunction.getInterpolation(float)>
		//   19   35:ldc1            #19  <Float 0.5F>
		//   20   37:fmul            
		//   21   38:ldc1            #19  <Float 0.5F>
		//   22   40:fadd            
		//   23   41:freturn         
		}

	}
;
	public static final EasingFunction EaseInOutCirc = new EasingFunction() {

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

	}
;
	public static final EasingFunction EaseInOutCubic = new EasingFunction() {

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

	}
;
	public static final EasingFunction EaseInOutElastic = new EasingFunction() {

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

	}
;
	public static final EasingFunction EaseInOutExpo = new EasingFunction() {

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

	}
;
	public static final EasingFunction EaseInOutQuad = new EasingFunction() {

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

	}
;
	public static final EasingFunction EaseInOutQuart = new EasingFunction() {

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

	}
;
	public static final EasingFunction EaseInOutSine = new EasingFunction() {

		public float getInterpolation(float f)
		{
			return -0.5F * ((float)Math.cos(3.1415926535897931D * (double)f) - 1.0F);
		//    0    0:ldc1            #19  <Float -0.5F>
		//    1    2:ldc2w           #20  <Double 3.1415926535897931D>
		//    2    5:fload_1         
		//    3    6:f2d             
		//    4    7:dmul            
		//    5    8:invokestatic    #27  <Method double Math.cos(double)>
		//    6   11:d2f             
		//    7   12:fconst_1        
		//    8   13:fsub            
		//    9   14:fmul            
		//   10   15:freturn         
		}

	}
;
	public static final EasingFunction EaseInQuad = new EasingFunction() {

		public float getInterpolation(float f)
		{
			return f * f;
		//    0    0:fload_1         
		//    1    1:fload_1         
		//    2    2:fmul            
		//    3    3:freturn         
		}

	}
;
	public static final EasingFunction EaseInQuart = new EasingFunction() {

		public float getInterpolation(float f)
		{
			return f * f * f * f;
		//    0    0:fload_1         
		//    1    1:fload_1         
		//    2    2:fmul            
		//    3    3:fload_1         
		//    4    4:fmul            
		//    5    5:fload_1         
		//    6    6:fmul            
		//    7    7:freturn         
		}

	}
;
	public static final EasingFunction EaseInSine = new EasingFunction() {

		public float getInterpolation(float f)
		{
			return -(float)Math.cos((double)f * 1.5707963267948966D) + 1.0F;
		//    0    0:fload_1         
		//    1    1:f2d             
		//    2    2:ldc2w           #19  <Double 1.5707963267948966D>
		//    3    5:dmul            
		//    4    6:invokestatic    #26  <Method double Math.cos(double)>
		//    5    9:d2f             
		//    6   10:fneg            
		//    7   11:fconst_1        
		//    8   12:fadd            
		//    9   13:freturn         
		}

	}
;
	public static final EasingFunction EaseOutBack = new EasingFunction() {

		public float getInterpolation(float f)
		{
			f--;
		//    0    0:fload_1         
		//    1    1:fconst_1        
		//    2    2:fsub            
		//    3    3:fstore_1        
			return f * f * (2.70158F * f + 1.70158F) + 1.0F;
		//    4    4:fload_1         
		//    5    5:fload_1         
		//    6    6:fmul            
		//    7    7:ldc1            #19  <Float 2.70158F>
		//    8    9:fload_1         
		//    9   10:fmul            
		//   10   11:ldc1            #20  <Float 1.70158F>
		//   11   13:fadd            
		//   12   14:fmul            
		//   13   15:fconst_1        
		//   14   16:fadd            
		//   15   17:freturn         
		}

	}
;
	public static final EasingFunction EaseOutBounce = new EasingFunction() {

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

	}
;
	public static final EasingFunction EaseOutCirc = new EasingFunction() {

		public float getInterpolation(float f)
		{
			f--;
		//    0    0:fload_1         
		//    1    1:fconst_1        
		//    2    2:fsub            
		//    3    3:fstore_1        
			return (float)Math.sqrt(1.0F - f * f);
		//    4    4:fconst_1        
		//    5    5:fload_1         
		//    6    6:fload_1         
		//    7    7:fmul            
		//    8    8:fsub            
		//    9    9:f2d             
		//   10   10:invokestatic    #24  <Method double Math.sqrt(double)>
		//   11   13:d2f             
		//   12   14:freturn         
		}

	}
;
	public static final EasingFunction EaseOutCubic = new EasingFunction() {

		public float getInterpolation(float f)
		{
			f--;
		//    0    0:fload_1         
		//    1    1:fconst_1        
		//    2    2:fsub            
		//    3    3:fstore_1        
			return f * f * f + 1.0F;
		//    4    4:fload_1         
		//    5    5:fload_1         
		//    6    6:fmul            
		//    7    7:fload_1         
		//    8    8:fmul            
		//    9    9:fconst_1        
		//   10   10:fadd            
		//   11   11:freturn         
		}

	}
;
	public static final EasingFunction EaseOutElastic = new EasingFunction() {

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

	}
;
	public static final EasingFunction EaseOutExpo = new EasingFunction() {

		public float getInterpolation(float f)
		{
			if(f == 1.0F)
		//*   0    0:fload_1         
		//*   1    1:fconst_1        
		//*   2    2:fcmpl           
		//*   3    3:ifne            8
				return 1.0F;
		//    4    6:fconst_1        
		//    5    7:freturn         
			else
				return -(float)Math.pow(2D, (1.0F + f) * -10F);
		//    6    8:ldc2w           #19  <Double 2D>
		//    7   11:fconst_1        
		//    8   12:fload_1         
		//    9   13:fadd            
		//   10   14:ldc1            #21  <Float -10F>
		//   11   16:fmul            
		//   12   17:f2d             
		//   13   18:invokestatic    #27  <Method double Math.pow(double, double)>
		//   14   21:d2f             
		//   15   22:fneg            
		//   16   23:freturn         
		}

	}
;
	public static final EasingFunction EaseOutQuad = new EasingFunction() {

		public float getInterpolation(float f)
		{
			return -f * (f - 2.0F);
		//    0    0:fload_1         
		//    1    1:fneg            
		//    2    2:fload_1         
		//    3    3:fconst_2        
		//    4    4:fsub            
		//    5    5:fmul            
		//    6    6:freturn         
		}

	}
;
	public static final EasingFunction EaseOutQuart = new EasingFunction() {

		public float getInterpolation(float f)
		{
			f--;
		//    0    0:fload_1         
		//    1    1:fconst_1        
		//    2    2:fsub            
		//    3    3:fstore_1        
			return -(f * f * f * f - 1.0F);
		//    4    4:fload_1         
		//    5    5:fload_1         
		//    6    6:fmul            
		//    7    7:fload_1         
		//    8    8:fmul            
		//    9    9:fload_1         
		//   10   10:fmul            
		//   11   11:fconst_1        
		//   12   12:fsub            
		//   13   13:fneg            
		//   14   14:freturn         
		}

	}
;
	public static final EasingFunction EaseOutSine = new EasingFunction() {

		public float getInterpolation(float f)
		{
			return (float)Math.sin((double)f * 1.5707963267948966D);
		//    0    0:fload_1         
		//    1    1:f2d             
		//    2    2:ldc2w           #19  <Double 1.5707963267948966D>
		//    3    5:dmul            
		//    4    6:invokestatic    #26  <Method double Math.sin(double)>
		//    5    9:d2f             
		//    6   10:freturn         
		}

	}
;
	public static final EasingFunction Linear = new EasingFunction() {

		public float getInterpolation(float f)
		{
			return f;
		//    0    0:fload_1         
		//    1    1:freturn         
		}

	}
;

	static 
	{
	//    0    0:new             #9   <Class Easing$EasingFunctions$1>
	//    1    3:dup             
	//    2    4:invokespecial   #97  <Method void Easing$EasingFunctions$1()>
	//    3    7:putstatic       #99  <Field EasingFunction Linear>
	//    4   10:new             #31  <Class Easing$EasingFunctions$2>
	//    5   13:dup             
	//    6   14:invokespecial   #100 <Method void Easing$EasingFunctions$2()>
	//    7   17:putstatic       #102 <Field EasingFunction EaseInQuad>
	//    8   20:new             #51  <Class Easing$EasingFunctions$3>
	//    9   23:dup             
	//   10   24:invokespecial   #103 <Method void Easing$EasingFunctions$3()>
	//   11   27:putstatic       #105 <Field EasingFunction EaseOutQuad>
	//   12   30:new             #53  <Class Easing$EasingFunctions$4>
	//   13   33:dup             
	//   14   34:invokespecial   #106 <Method void Easing$EasingFunctions$4()>
	//   15   37:putstatic       #108 <Field EasingFunction EaseInOutQuad>
	//   16   40:new             #55  <Class Easing$EasingFunctions$5>
	//   17   43:dup             
	//   18   44:invokespecial   #109 <Method void Easing$EasingFunctions$5()>
	//   19   47:putstatic       #111 <Field EasingFunction EaseInCubic>
	//   20   50:new             #57  <Class Easing$EasingFunctions$6>
	//   21   53:dup             
	//   22   54:invokespecial   #112 <Method void Easing$EasingFunctions$6()>
	//   23   57:putstatic       #114 <Field EasingFunction EaseOutCubic>
	//   24   60:new             #59  <Class Easing$EasingFunctions$7>
	//   25   63:dup             
	//   26   64:invokespecial   #115 <Method void Easing$EasingFunctions$7()>
	//   27   67:putstatic       #117 <Field EasingFunction EaseInOutCubic>
	//   28   70:new             #61  <Class Easing$EasingFunctions$8>
	//   29   73:dup             
	//   30   74:invokespecial   #118 <Method void Easing$EasingFunctions$8()>
	//   31   77:putstatic       #120 <Field EasingFunction EaseInQuart>
	//   32   80:new             #63  <Class Easing$EasingFunctions$9>
	//   33   83:dup             
	//   34   84:invokespecial   #121 <Method void Easing$EasingFunctions$9()>
	//   35   87:putstatic       #123 <Field EasingFunction EaseOutQuart>
	//   36   90:new             #11  <Class Easing$EasingFunctions$10>
	//   37   93:dup             
	//   38   94:invokespecial   #124 <Method void Easing$EasingFunctions$10()>
	//   39   97:putstatic       #126 <Field EasingFunction EaseInOutQuart>
	//   40  100:new             #13  <Class Easing$EasingFunctions$11>
	//   41  103:dup             
	//   42  104:invokespecial   #127 <Method void Easing$EasingFunctions$11()>
	//   43  107:putstatic       #129 <Field EasingFunction EaseInSine>
	//   44  110:new             #15  <Class Easing$EasingFunctions$12>
	//   45  113:dup             
	//   46  114:invokespecial   #130 <Method void Easing$EasingFunctions$12()>
	//   47  117:putstatic       #132 <Field EasingFunction EaseOutSine>
	//   48  120:new             #17  <Class Easing$EasingFunctions$13>
	//   49  123:dup             
	//   50  124:invokespecial   #133 <Method void Easing$EasingFunctions$13()>
	//   51  127:putstatic       #135 <Field EasingFunction EaseInOutSine>
	//   52  130:new             #19  <Class Easing$EasingFunctions$14>
	//   53  133:dup             
	//   54  134:invokespecial   #136 <Method void Easing$EasingFunctions$14()>
	//   55  137:putstatic       #138 <Field EasingFunction EaseInExpo>
	//   56  140:new             #21  <Class Easing$EasingFunctions$15>
	//   57  143:dup             
	//   58  144:invokespecial   #139 <Method void Easing$EasingFunctions$15()>
	//   59  147:putstatic       #141 <Field EasingFunction EaseOutExpo>
	//   60  150:new             #23  <Class Easing$EasingFunctions$16>
	//   61  153:dup             
	//   62  154:invokespecial   #142 <Method void Easing$EasingFunctions$16()>
	//   63  157:putstatic       #144 <Field EasingFunction EaseInOutExpo>
	//   64  160:new             #25  <Class Easing$EasingFunctions$17>
	//   65  163:dup             
	//   66  164:invokespecial   #145 <Method void Easing$EasingFunctions$17()>
	//   67  167:putstatic       #147 <Field EasingFunction EaseInCirc>
	//   68  170:new             #27  <Class Easing$EasingFunctions$18>
	//   69  173:dup             
	//   70  174:invokespecial   #148 <Method void Easing$EasingFunctions$18()>
	//   71  177:putstatic       #150 <Field EasingFunction EaseOutCirc>
	//   72  180:new             #29  <Class Easing$EasingFunctions$19>
	//   73  183:dup             
	//   74  184:invokespecial   #151 <Method void Easing$EasingFunctions$19()>
	//   75  187:putstatic       #153 <Field EasingFunction EaseInOutCirc>
	//   76  190:new             #33  <Class Easing$EasingFunctions$20>
	//   77  193:dup             
	//   78  194:invokespecial   #154 <Method void Easing$EasingFunctions$20()>
	//   79  197:putstatic       #156 <Field EasingFunction EaseInElastic>
	//   80  200:new             #35  <Class Easing$EasingFunctions$21>
	//   81  203:dup             
	//   82  204:invokespecial   #157 <Method void Easing$EasingFunctions$21()>
	//   83  207:putstatic       #159 <Field EasingFunction EaseOutElastic>
	//   84  210:new             #37  <Class Easing$EasingFunctions$22>
	//   85  213:dup             
	//   86  214:invokespecial   #160 <Method void Easing$EasingFunctions$22()>
	//   87  217:putstatic       #162 <Field EasingFunction EaseInOutElastic>
	//   88  220:new             #39  <Class Easing$EasingFunctions$23>
	//   89  223:dup             
	//   90  224:invokespecial   #163 <Method void Easing$EasingFunctions$23()>
	//   91  227:putstatic       #165 <Field EasingFunction EaseInBack>
	//   92  230:new             #41  <Class Easing$EasingFunctions$24>
	//   93  233:dup             
	//   94  234:invokespecial   #166 <Method void Easing$EasingFunctions$24()>
	//   95  237:putstatic       #168 <Field EasingFunction EaseOutBack>
	//   96  240:new             #43  <Class Easing$EasingFunctions$25>
	//   97  243:dup             
	//   98  244:invokespecial   #169 <Method void Easing$EasingFunctions$25()>
	//   99  247:putstatic       #171 <Field EasingFunction EaseInOutBack>
	//  100  250:new             #45  <Class Easing$EasingFunctions$26>
	//  101  253:dup             
	//  102  254:invokespecial   #172 <Method void Easing$EasingFunctions$26()>
	//  103  257:putstatic       #174 <Field EasingFunction EaseInBounce>
	//  104  260:new             #47  <Class Easing$EasingFunctions$27>
	//  105  263:dup             
	//  106  264:invokespecial   #175 <Method void Easing$EasingFunctions$27()>
	//  107  267:putstatic       #177 <Field EasingFunction EaseOutBounce>
	//  108  270:new             #49  <Class Easing$EasingFunctions$28>
	//  109  273:dup             
	//  110  274:invokespecial   #178 <Method void Easing$EasingFunctions$28()>
	//  111  277:putstatic       #180 <Field EasingFunction EaseInOutBounce>
	//* 112  280:return          
	}

	private Easing$EasingFunctions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #182 <Method void Object()>
	//    2    4:return          
	}
}
