// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;


// Referenced classes of package com.github.mikephil.charting.animation:
//			EasingFunction

public class Easing
{
	private static class EasingFunctions
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
				return 1.0F - EasingFunctions.EaseOutBounce.getInterpolation(1.0F - f);
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
					return EasingFunctions.EaseInBounce.getInterpolation(2.0F * f) * 0.5F;
			//    4    7:getstatic       #23  <Field EasingFunction Easing$EasingFunctions.EaseInBounce>
			//    5   10:fconst_2        
			//    6   11:fload_1         
			//    7   12:fmul            
			//    8   13:invokeinterface #25  <Method float EasingFunction.getInterpolation(float)>
			//    9   18:ldc1            #19  <Float 0.5F>
			//   10   20:fmul            
			//   11   21:freturn         
				else
					return EasingFunctions.EaseOutBounce.getInterpolation(2.0F * f - 1.0F) * 0.5F + 0.5F;
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

		private EasingFunctions()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #182 <Method void Object()>
		//    2    4:return          
		}
	}

	public static final class EasingOption extends Enum
	{

		public static EasingOption valueOf(String s)
		{
			return (EasingOption)Enum.valueOf(com/github/mikephil/charting/animation/Easing$EasingOption, s);
		//    0    0:ldc1            #2   <Class Easing$EasingOption>
		//    1    2:aload_0         
		//    2    3:invokestatic    #139 <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Easing$EasingOption>
		//    4    9:areturn         
		}

		public static EasingOption[] values()
		{
			return (EasingOption[])((EasingOption []) ($VALUES)).clone();
		//    0    0:getstatic       #131 <Field Easing$EasingOption[] $VALUES>
		//    1    3:invokevirtual   #146 <Method Object _5B_Lcom.github.mikephil.charting.animation.Easing$EasingOption_3B_.clone()>
		//    2    6:checkcast       #142 <Class Easing$EasingOption[]>
		//    3    9:areturn         
		}

		private static final EasingOption $VALUES[];
		public static final EasingOption EaseInBack;
		public static final EasingOption EaseInBounce;
		public static final EasingOption EaseInCirc;
		public static final EasingOption EaseInCubic;
		public static final EasingOption EaseInElastic;
		public static final EasingOption EaseInExpo;
		public static final EasingOption EaseInOutBack;
		public static final EasingOption EaseInOutBounce;
		public static final EasingOption EaseInOutCirc;
		public static final EasingOption EaseInOutCubic;
		public static final EasingOption EaseInOutElastic;
		public static final EasingOption EaseInOutExpo;
		public static final EasingOption EaseInOutQuad;
		public static final EasingOption EaseInOutQuart;
		public static final EasingOption EaseInOutSine;
		public static final EasingOption EaseInQuad;
		public static final EasingOption EaseInQuart;
		public static final EasingOption EaseInSine;
		public static final EasingOption EaseOutBack;
		public static final EasingOption EaseOutBounce;
		public static final EasingOption EaseOutCirc;
		public static final EasingOption EaseOutCubic;
		public static final EasingOption EaseOutElastic;
		public static final EasingOption EaseOutExpo;
		public static final EasingOption EaseOutQuad;
		public static final EasingOption EaseOutQuart;
		public static final EasingOption EaseOutSine;
		public static final EasingOption Linear;

		static 
		{
			Linear = new EasingOption("Linear", 0);
		//    0    0:new             #2   <Class Easing$EasingOption>
		//    1    3:dup             
		//    2    4:ldc1            #42  <String "Linear">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//    5   10:putstatic       #48  <Field Easing$EasingOption Linear>
			EaseInQuad = new EasingOption("EaseInQuad", 1);
		//    6   13:new             #2   <Class Easing$EasingOption>
		//    7   16:dup             
		//    8   17:ldc1            #49  <String "EaseInQuad">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//   11   23:putstatic       #51  <Field Easing$EasingOption EaseInQuad>
			EaseOutQuad = new EasingOption("EaseOutQuad", 2);
		//   12   26:new             #2   <Class Easing$EasingOption>
		//   13   29:dup             
		//   14   30:ldc1            #52  <String "EaseOutQuad">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//   17   36:putstatic       #54  <Field Easing$EasingOption EaseOutQuad>
			EaseInOutQuad = new EasingOption("EaseInOutQuad", 3);
		//   18   39:new             #2   <Class Easing$EasingOption>
		//   19   42:dup             
		//   20   43:ldc1            #55  <String "EaseInOutQuad">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//   23   49:putstatic       #57  <Field Easing$EasingOption EaseInOutQuad>
			EaseInCubic = new EasingOption("EaseInCubic", 4);
		//   24   52:new             #2   <Class Easing$EasingOption>
		//   25   55:dup             
		//   26   56:ldc1            #58  <String "EaseInCubic">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//   29   62:putstatic       #60  <Field Easing$EasingOption EaseInCubic>
			EaseOutCubic = new EasingOption("EaseOutCubic", 5);
		//   30   65:new             #2   <Class Easing$EasingOption>
		//   31   68:dup             
		//   32   69:ldc1            #61  <String "EaseOutCubic">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//   35   75:putstatic       #63  <Field Easing$EasingOption EaseOutCubic>
			EaseInOutCubic = new EasingOption("EaseInOutCubic", 6);
		//   36   78:new             #2   <Class Easing$EasingOption>
		//   37   81:dup             
		//   38   82:ldc1            #64  <String "EaseInOutCubic">
		//   39   84:bipush          6
		//   40   86:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//   41   89:putstatic       #66  <Field Easing$EasingOption EaseInOutCubic>
			EaseInQuart = new EasingOption("EaseInQuart", 7);
		//   42   92:new             #2   <Class Easing$EasingOption>
		//   43   95:dup             
		//   44   96:ldc1            #67  <String "EaseInQuart">
		//   45   98:bipush          7
		//   46  100:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//   47  103:putstatic       #69  <Field Easing$EasingOption EaseInQuart>
			EaseOutQuart = new EasingOption("EaseOutQuart", 8);
		//   48  106:new             #2   <Class Easing$EasingOption>
		//   49  109:dup             
		//   50  110:ldc1            #70  <String "EaseOutQuart">
		//   51  112:bipush          8
		//   52  114:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//   53  117:putstatic       #72  <Field Easing$EasingOption EaseOutQuart>
			EaseInOutQuart = new EasingOption("EaseInOutQuart", 9);
		//   54  120:new             #2   <Class Easing$EasingOption>
		//   55  123:dup             
		//   56  124:ldc1            #73  <String "EaseInOutQuart">
		//   57  126:bipush          9
		//   58  128:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//   59  131:putstatic       #75  <Field Easing$EasingOption EaseInOutQuart>
			EaseInSine = new EasingOption("EaseInSine", 10);
		//   60  134:new             #2   <Class Easing$EasingOption>
		//   61  137:dup             
		//   62  138:ldc1            #76  <String "EaseInSine">
		//   63  140:bipush          10
		//   64  142:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//   65  145:putstatic       #78  <Field Easing$EasingOption EaseInSine>
			EaseOutSine = new EasingOption("EaseOutSine", 11);
		//   66  148:new             #2   <Class Easing$EasingOption>
		//   67  151:dup             
		//   68  152:ldc1            #79  <String "EaseOutSine">
		//   69  154:bipush          11
		//   70  156:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//   71  159:putstatic       #81  <Field Easing$EasingOption EaseOutSine>
			EaseInOutSine = new EasingOption("EaseInOutSine", 12);
		//   72  162:new             #2   <Class Easing$EasingOption>
		//   73  165:dup             
		//   74  166:ldc1            #82  <String "EaseInOutSine">
		//   75  168:bipush          12
		//   76  170:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//   77  173:putstatic       #84  <Field Easing$EasingOption EaseInOutSine>
			EaseInExpo = new EasingOption("EaseInExpo", 13);
		//   78  176:new             #2   <Class Easing$EasingOption>
		//   79  179:dup             
		//   80  180:ldc1            #85  <String "EaseInExpo">
		//   81  182:bipush          13
		//   82  184:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//   83  187:putstatic       #87  <Field Easing$EasingOption EaseInExpo>
			EaseOutExpo = new EasingOption("EaseOutExpo", 14);
		//   84  190:new             #2   <Class Easing$EasingOption>
		//   85  193:dup             
		//   86  194:ldc1            #88  <String "EaseOutExpo">
		//   87  196:bipush          14
		//   88  198:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//   89  201:putstatic       #90  <Field Easing$EasingOption EaseOutExpo>
			EaseInOutExpo = new EasingOption("EaseInOutExpo", 15);
		//   90  204:new             #2   <Class Easing$EasingOption>
		//   91  207:dup             
		//   92  208:ldc1            #91  <String "EaseInOutExpo">
		//   93  210:bipush          15
		//   94  212:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//   95  215:putstatic       #93  <Field Easing$EasingOption EaseInOutExpo>
			EaseInCirc = new EasingOption("EaseInCirc", 16);
		//   96  218:new             #2   <Class Easing$EasingOption>
		//   97  221:dup             
		//   98  222:ldc1            #94  <String "EaseInCirc">
		//   99  224:bipush          16
		//  100  226:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//  101  229:putstatic       #96  <Field Easing$EasingOption EaseInCirc>
			EaseOutCirc = new EasingOption("EaseOutCirc", 17);
		//  102  232:new             #2   <Class Easing$EasingOption>
		//  103  235:dup             
		//  104  236:ldc1            #97  <String "EaseOutCirc">
		//  105  238:bipush          17
		//  106  240:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//  107  243:putstatic       #99  <Field Easing$EasingOption EaseOutCirc>
			EaseInOutCirc = new EasingOption("EaseInOutCirc", 18);
		//  108  246:new             #2   <Class Easing$EasingOption>
		//  109  249:dup             
		//  110  250:ldc1            #100 <String "EaseInOutCirc">
		//  111  252:bipush          18
		//  112  254:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//  113  257:putstatic       #102 <Field Easing$EasingOption EaseInOutCirc>
			EaseInElastic = new EasingOption("EaseInElastic", 19);
		//  114  260:new             #2   <Class Easing$EasingOption>
		//  115  263:dup             
		//  116  264:ldc1            #103 <String "EaseInElastic">
		//  117  266:bipush          19
		//  118  268:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//  119  271:putstatic       #105 <Field Easing$EasingOption EaseInElastic>
			EaseOutElastic = new EasingOption("EaseOutElastic", 20);
		//  120  274:new             #2   <Class Easing$EasingOption>
		//  121  277:dup             
		//  122  278:ldc1            #106 <String "EaseOutElastic">
		//  123  280:bipush          20
		//  124  282:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//  125  285:putstatic       #108 <Field Easing$EasingOption EaseOutElastic>
			EaseInOutElastic = new EasingOption("EaseInOutElastic", 21);
		//  126  288:new             #2   <Class Easing$EasingOption>
		//  127  291:dup             
		//  128  292:ldc1            #109 <String "EaseInOutElastic">
		//  129  294:bipush          21
		//  130  296:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//  131  299:putstatic       #111 <Field Easing$EasingOption EaseInOutElastic>
			EaseInBack = new EasingOption("EaseInBack", 22);
		//  132  302:new             #2   <Class Easing$EasingOption>
		//  133  305:dup             
		//  134  306:ldc1            #112 <String "EaseInBack">
		//  135  308:bipush          22
		//  136  310:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//  137  313:putstatic       #114 <Field Easing$EasingOption EaseInBack>
			EaseOutBack = new EasingOption("EaseOutBack", 23);
		//  138  316:new             #2   <Class Easing$EasingOption>
		//  139  319:dup             
		//  140  320:ldc1            #115 <String "EaseOutBack">
		//  141  322:bipush          23
		//  142  324:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//  143  327:putstatic       #117 <Field Easing$EasingOption EaseOutBack>
			EaseInOutBack = new EasingOption("EaseInOutBack", 24);
		//  144  330:new             #2   <Class Easing$EasingOption>
		//  145  333:dup             
		//  146  334:ldc1            #118 <String "EaseInOutBack">
		//  147  336:bipush          24
		//  148  338:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//  149  341:putstatic       #120 <Field Easing$EasingOption EaseInOutBack>
			EaseInBounce = new EasingOption("EaseInBounce", 25);
		//  150  344:new             #2   <Class Easing$EasingOption>
		//  151  347:dup             
		//  152  348:ldc1            #121 <String "EaseInBounce">
		//  153  350:bipush          25
		//  154  352:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//  155  355:putstatic       #123 <Field Easing$EasingOption EaseInBounce>
			EaseOutBounce = new EasingOption("EaseOutBounce", 26);
		//  156  358:new             #2   <Class Easing$EasingOption>
		//  157  361:dup             
		//  158  362:ldc1            #124 <String "EaseOutBounce">
		//  159  364:bipush          26
		//  160  366:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//  161  369:putstatic       #126 <Field Easing$EasingOption EaseOutBounce>
			EaseInOutBounce = new EasingOption("EaseInOutBounce", 27);
		//  162  372:new             #2   <Class Easing$EasingOption>
		//  163  375:dup             
		//  164  376:ldc1            #127 <String "EaseInOutBounce">
		//  165  378:bipush          27
		//  166  380:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
		//  167  383:putstatic       #129 <Field Easing$EasingOption EaseInOutBounce>
			$VALUES = (new EasingOption[] {
				Linear, EaseInQuad, EaseOutQuad, EaseInOutQuad, EaseInCubic, EaseOutCubic, EaseInOutCubic, EaseInQuart, EaseOutQuart, EaseInOutQuart, 
				EaseInSine, EaseOutSine, EaseInOutSine, EaseInExpo, EaseOutExpo, EaseInOutExpo, EaseInCirc, EaseOutCirc, EaseInOutCirc, EaseInElastic, 
				EaseOutElastic, EaseInOutElastic, EaseInBack, EaseOutBack, EaseInOutBack, EaseInBounce, EaseOutBounce, EaseInOutBounce
			});
		//  168  386:bipush          28
		//  169  388:anewarray       EasingOption[]
		//  170  391:dup             
		//  171  392:iconst_0        
		//  172  393:getstatic       #48  <Field Easing$EasingOption Linear>
		//  173  396:aastore         
		//  174  397:dup             
		//  175  398:iconst_1        
		//  176  399:getstatic       #51  <Field Easing$EasingOption EaseInQuad>
		//  177  402:aastore         
		//  178  403:dup             
		//  179  404:iconst_2        
		//  180  405:getstatic       #54  <Field Easing$EasingOption EaseOutQuad>
		//  181  408:aastore         
		//  182  409:dup             
		//  183  410:iconst_3        
		//  184  411:getstatic       #57  <Field Easing$EasingOption EaseInOutQuad>
		//  185  414:aastore         
		//  186  415:dup             
		//  187  416:iconst_4        
		//  188  417:getstatic       #60  <Field Easing$EasingOption EaseInCubic>
		//  189  420:aastore         
		//  190  421:dup             
		//  191  422:iconst_5        
		//  192  423:getstatic       #63  <Field Easing$EasingOption EaseOutCubic>
		//  193  426:aastore         
		//  194  427:dup             
		//  195  428:bipush          6
		//  196  430:getstatic       #66  <Field Easing$EasingOption EaseInOutCubic>
		//  197  433:aastore         
		//  198  434:dup             
		//  199  435:bipush          7
		//  200  437:getstatic       #69  <Field Easing$EasingOption EaseInQuart>
		//  201  440:aastore         
		//  202  441:dup             
		//  203  442:bipush          8
		//  204  444:getstatic       #72  <Field Easing$EasingOption EaseOutQuart>
		//  205  447:aastore         
		//  206  448:dup             
		//  207  449:bipush          9
		//  208  451:getstatic       #75  <Field Easing$EasingOption EaseInOutQuart>
		//  209  454:aastore         
		//  210  455:dup             
		//  211  456:bipush          10
		//  212  458:getstatic       #78  <Field Easing$EasingOption EaseInSine>
		//  213  461:aastore         
		//  214  462:dup             
		//  215  463:bipush          11
		//  216  465:getstatic       #81  <Field Easing$EasingOption EaseOutSine>
		//  217  468:aastore         
		//  218  469:dup             
		//  219  470:bipush          12
		//  220  472:getstatic       #84  <Field Easing$EasingOption EaseInOutSine>
		//  221  475:aastore         
		//  222  476:dup             
		//  223  477:bipush          13
		//  224  479:getstatic       #87  <Field Easing$EasingOption EaseInExpo>
		//  225  482:aastore         
		//  226  483:dup             
		//  227  484:bipush          14
		//  228  486:getstatic       #90  <Field Easing$EasingOption EaseOutExpo>
		//  229  489:aastore         
		//  230  490:dup             
		//  231  491:bipush          15
		//  232  493:getstatic       #93  <Field Easing$EasingOption EaseInOutExpo>
		//  233  496:aastore         
		//  234  497:dup             
		//  235  498:bipush          16
		//  236  500:getstatic       #96  <Field Easing$EasingOption EaseInCirc>
		//  237  503:aastore         
		//  238  504:dup             
		//  239  505:bipush          17
		//  240  507:getstatic       #99  <Field Easing$EasingOption EaseOutCirc>
		//  241  510:aastore         
		//  242  511:dup             
		//  243  512:bipush          18
		//  244  514:getstatic       #102 <Field Easing$EasingOption EaseInOutCirc>
		//  245  517:aastore         
		//  246  518:dup             
		//  247  519:bipush          19
		//  248  521:getstatic       #105 <Field Easing$EasingOption EaseInElastic>
		//  249  524:aastore         
		//  250  525:dup             
		//  251  526:bipush          20
		//  252  528:getstatic       #108 <Field Easing$EasingOption EaseOutElastic>
		//  253  531:aastore         
		//  254  532:dup             
		//  255  533:bipush          21
		//  256  535:getstatic       #111 <Field Easing$EasingOption EaseInOutElastic>
		//  257  538:aastore         
		//  258  539:dup             
		//  259  540:bipush          22
		//  260  542:getstatic       #114 <Field Easing$EasingOption EaseInBack>
		//  261  545:aastore         
		//  262  546:dup             
		//  263  547:bipush          23
		//  264  549:getstatic       #117 <Field Easing$EasingOption EaseOutBack>
		//  265  552:aastore         
		//  266  553:dup             
		//  267  554:bipush          24
		//  268  556:getstatic       #120 <Field Easing$EasingOption EaseInOutBack>
		//  269  559:aastore         
		//  270  560:dup             
		//  271  561:bipush          25
		//  272  563:getstatic       #123 <Field Easing$EasingOption EaseInBounce>
		//  273  566:aastore         
		//  274  567:dup             
		//  275  568:bipush          26
		//  276  570:getstatic       #126 <Field Easing$EasingOption EaseOutBounce>
		//  277  573:aastore         
		//  278  574:dup             
		//  279  575:bipush          27
		//  280  577:getstatic       #129 <Field Easing$EasingOption EaseInOutBounce>
		//  281  580:aastore         
		//  282  581:putstatic       #131 <Field Easing$EasingOption[] $VALUES>
		//* 283  584:return          
		}

		private EasingOption(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #133 <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public Easing()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void Object()>
	//    2    4:return          
	}

	public static EasingFunction getEasingFunctionFromOption(EasingOption easingoption)
	{
		static class _cls1
		{

			static final int $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[];

			static 
			{
				$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption = new int[EasingOption.values().length];
			//    0    0:invokestatic    #18  <Method Easing$EasingOption[] Easing$EasingOption.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.Linear.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//    5   12:getstatic       #24  <Field Easing$EasingOption Easing$EasingOption.Linear>
			//    6   15:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//*  10   23:getstatic       #31  <Field Easing$EasingOption Easing$EasingOption.EaseInQuad>
			//*  11   26:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//*  15   34:getstatic       #34  <Field Easing$EasingOption Easing$EasingOption.EaseOutQuad>
			//*  16   37:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//*  20   45:getstatic       #37  <Field Easing$EasingOption Easing$EasingOption.EaseInOutQuad>
			//*  21   48:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//*  25   56:getstatic       #40  <Field Easing$EasingOption Easing$EasingOption.EaseInCubic>
			//*  26   59:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//*  30   67:getstatic       #43  <Field Easing$EasingOption Easing$EasingOption.EaseOutCubic>
			//*  31   70:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//*  32   73:bipush          6
			//*  33   75:iastore         
			//*  34   76:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//*  35   79:getstatic       #46  <Field Easing$EasingOption Easing$EasingOption.EaseInOutCubic>
			//*  36   82:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//*  37   85:bipush          7
			//*  38   87:iastore         
			//*  39   88:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//*  40   91:getstatic       #49  <Field Easing$EasingOption Easing$EasingOption.EaseInQuart>
			//*  41   94:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//*  42   97:bipush          8
			//*  43   99:iastore         
			//*  44  100:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//*  45  103:getstatic       #52  <Field Easing$EasingOption Easing$EasingOption.EaseOutQuart>
			//*  46  106:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//*  47  109:bipush          9
			//*  48  111:iastore         
			//*  49  112:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//*  50  115:getstatic       #55  <Field Easing$EasingOption Easing$EasingOption.EaseInOutQuart>
			//*  51  118:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//*  52  121:bipush          10
			//*  53  123:iastore         
			//*  54  124:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//*  55  127:getstatic       #58  <Field Easing$EasingOption Easing$EasingOption.EaseInSine>
			//*  56  130:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//*  57  133:bipush          11
			//*  58  135:iastore         
			//*  59  136:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//*  60  139:getstatic       #61  <Field Easing$EasingOption Easing$EasingOption.EaseOutSine>
			//*  61  142:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//*  62  145:bipush          12
			//*  63  147:iastore         
			//*  64  148:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//*  65  151:getstatic       #64  <Field Easing$EasingOption Easing$EasingOption.EaseInOutSine>
			//*  66  154:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//*  67  157:bipush          13
			//*  68  159:iastore         
			//*  69  160:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//*  70  163:getstatic       #67  <Field Easing$EasingOption Easing$EasingOption.EaseInExpo>
			//*  71  166:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//*  72  169:bipush          14
			//*  73  171:iastore         
			//*  74  172:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//*  75  175:getstatic       #70  <Field Easing$EasingOption Easing$EasingOption.EaseOutExpo>
			//*  76  178:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//*  77  181:bipush          15
			//*  78  183:iastore         
			//*  79  184:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//*  80  187:getstatic       #73  <Field Easing$EasingOption Easing$EasingOption.EaseInOutExpo>
			//*  81  190:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//*  82  193:bipush          16
			//*  83  195:iastore         
			//*  84  196:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//*  85  199:getstatic       #76  <Field Easing$EasingOption Easing$EasingOption.EaseInCirc>
			//*  86  202:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//*  87  205:bipush          17
			//*  88  207:iastore         
			//*  89  208:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//*  90  211:getstatic       #79  <Field Easing$EasingOption Easing$EasingOption.EaseOutCirc>
			//*  91  214:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//*  92  217:bipush          18
			//*  93  219:iastore         
			//*  94  220:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//*  95  223:getstatic       #82  <Field Easing$EasingOption Easing$EasingOption.EaseInOutCirc>
			//*  96  226:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//*  97  229:bipush          19
			//*  98  231:iastore         
			//*  99  232:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//* 100  235:getstatic       #85  <Field Easing$EasingOption Easing$EasingOption.EaseInElastic>
			//* 101  238:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//* 102  241:bipush          20
			//* 103  243:iastore         
			//* 104  244:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//* 105  247:getstatic       #88  <Field Easing$EasingOption Easing$EasingOption.EaseOutElastic>
			//* 106  250:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//* 107  253:bipush          21
			//* 108  255:iastore         
			//* 109  256:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//* 110  259:getstatic       #91  <Field Easing$EasingOption Easing$EasingOption.EaseInOutElastic>
			//* 111  262:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//* 112  265:bipush          22
			//* 113  267:iastore         
			//* 114  268:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//* 115  271:getstatic       #94  <Field Easing$EasingOption Easing$EasingOption.EaseInBack>
			//* 116  274:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//* 117  277:bipush          23
			//* 118  279:iastore         
			//* 119  280:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//* 120  283:getstatic       #97  <Field Easing$EasingOption Easing$EasingOption.EaseOutBack>
			//* 121  286:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//* 122  289:bipush          24
			//* 123  291:iastore         
			//* 124  292:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//* 125  295:getstatic       #100 <Field Easing$EasingOption Easing$EasingOption.EaseInOutBack>
			//* 126  298:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//* 127  301:bipush          25
			//* 128  303:iastore         
			//* 129  304:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//* 130  307:getstatic       #103 <Field Easing$EasingOption Easing$EasingOption.EaseInBounce>
			//* 131  310:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//* 132  313:bipush          26
			//* 133  315:iastore         
			//* 134  316:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//* 135  319:getstatic       #106 <Field Easing$EasingOption Easing$EasingOption.EaseOutBounce>
			//* 136  322:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//* 137  325:bipush          27
			//* 138  327:iastore         
			//* 139  328:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
			//* 140  331:getstatic       #109 <Field Easing$EasingOption Easing$EasingOption.EaseInOutBounce>
			//* 141  334:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
			//* 142  337:bipush          28
			//* 143  339:iastore         
			//* 144  340:return          
			//* 145  341:astore_0        
			//* 146  342:return          
			//* 147  343:astore_0        
			//* 148  344:goto            328
			//* 149  347:astore_0        
			//* 150  348:goto            316
			//* 151  351:astore_0        
			//* 152  352:goto            304
			//* 153  355:astore_0        
			//* 154  356:goto            292
			//* 155  359:astore_0        
			//* 156  360:goto            280
			//* 157  363:astore_0        
			//* 158  364:goto            268
			//* 159  367:astore_0        
			//* 160  368:goto            256
			//* 161  371:astore_0        
			//* 162  372:goto            244
			//* 163  375:astore_0        
			//* 164  376:goto            232
			//* 165  379:astore_0        
			//* 166  380:goto            220
			//* 167  383:astore_0        
			//* 168  384:goto            208
			//* 169  387:astore_0        
			//* 170  388:goto            196
			//* 171  391:astore_0        
			//* 172  392:goto            184
			//* 173  395:astore_0        
			//* 174  396:goto            172
			//* 175  399:astore_0        
			//* 176  400:goto            160
			//* 177  403:astore_0        
			//* 178  404:goto            148
			//* 179  407:astore_0        
			//* 180  408:goto            136
			//* 181  411:astore_0        
			//* 182  412:goto            124
			//* 183  415:astore_0        
			//* 184  416:goto            112
			//* 185  419:astore_0        
			//* 186  420:goto            100
			//* 187  423:astore_0        
			//* 188  424:goto            88
			//* 189  427:astore_0        
			//* 190  428:goto            76
			//* 191  431:astore_0        
			//* 192  432:goto            64
			//* 193  435:astore_0        
			//* 194  436:goto            53
			//* 195  439:astore_0        
			//* 196  440:goto            42
			//* 197  443:astore_0        
			//* 198  444:goto            31
				catch(NoSuchFieldError nosuchfielderror27) { }
			//  199  447:astore_0        
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseInQuad.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror26) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseOutQuad.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror25) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseInOutQuad.ordinal()] = 4;
				}
				catch(NoSuchFieldError nosuchfielderror24) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseInCubic.ordinal()] = 5;
				}
				catch(NoSuchFieldError nosuchfielderror23) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseOutCubic.ordinal()] = 6;
				}
				catch(NoSuchFieldError nosuchfielderror22) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseInOutCubic.ordinal()] = 7;
				}
				catch(NoSuchFieldError nosuchfielderror21) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseInQuart.ordinal()] = 8;
				}
				catch(NoSuchFieldError nosuchfielderror20) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseOutQuart.ordinal()] = 9;
				}
				catch(NoSuchFieldError nosuchfielderror19) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseInOutQuart.ordinal()] = 10;
				}
				catch(NoSuchFieldError nosuchfielderror18) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseInSine.ordinal()] = 11;
				}
				catch(NoSuchFieldError nosuchfielderror17) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseOutSine.ordinal()] = 12;
				}
				catch(NoSuchFieldError nosuchfielderror16) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseInOutSine.ordinal()] = 13;
				}
				catch(NoSuchFieldError nosuchfielderror15) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseInExpo.ordinal()] = 14;
				}
				catch(NoSuchFieldError nosuchfielderror14) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseOutExpo.ordinal()] = 15;
				}
				catch(NoSuchFieldError nosuchfielderror13) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseInOutExpo.ordinal()] = 16;
				}
				catch(NoSuchFieldError nosuchfielderror12) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseInCirc.ordinal()] = 17;
				}
				catch(NoSuchFieldError nosuchfielderror11) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseOutCirc.ordinal()] = 18;
				}
				catch(NoSuchFieldError nosuchfielderror10) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseInOutCirc.ordinal()] = 19;
				}
				catch(NoSuchFieldError nosuchfielderror9) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseInElastic.ordinal()] = 20;
				}
				catch(NoSuchFieldError nosuchfielderror8) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseOutElastic.ordinal()] = 21;
				}
				catch(NoSuchFieldError nosuchfielderror7) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseInOutElastic.ordinal()] = 22;
				}
				catch(NoSuchFieldError nosuchfielderror6) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseInBack.ordinal()] = 23;
				}
				catch(NoSuchFieldError nosuchfielderror5) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseOutBack.ordinal()] = 24;
				}
				catch(NoSuchFieldError nosuchfielderror4) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseInOutBack.ordinal()] = 25;
				}
				catch(NoSuchFieldError nosuchfielderror3) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseInBounce.ordinal()] = 26;
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseOutBounce.ordinal()] = 27;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[EasingOption.EaseInOutBounce.ordinal()] = 28;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//* 200  448:goto            20
			}
		}

		switch(_cls1..SwitchMap.com.github.mikephil.charting.animation.Easing.EasingOption[easingoption.ordinal()])
	//*   0    0:getstatic       #79  <Field int[] Easing$1.$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #83  <Method int Easing$EasingOption.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     2 28: default 132
	//	               2 136
	//	               3 140
	//	               4 144
	//	               5 148
	//	               6 152
	//	               7 156
	//	               8 160
	//	               9 164
	//	               10 168
	//	               11 172
	//	               12 176
	//	               13 180
	//	               14 184
	//	               15 188
	//	               16 192
	//	               17 196
	//	               18 200
	//	               19 204
	//	               20 208
	//	               21 212
	//	               22 216
	//	               23 220
	//	               24 224
	//	               25 228
	//	               26 232
	//	               27 236
	//	               28 240
		default:
			return EasingFunctions.Linear;
	//    5  132:getstatic       #87  <Field EasingFunction Easing$EasingFunctions.Linear>
	//    6  135:areturn         

		case 2: // '\002'
			return EasingFunctions.EaseInQuad;
	//    7  136:getstatic       #90  <Field EasingFunction Easing$EasingFunctions.EaseInQuad>
	//    8  139:areturn         

		case 3: // '\003'
			return EasingFunctions.EaseOutQuad;
	//    9  140:getstatic       #93  <Field EasingFunction Easing$EasingFunctions.EaseOutQuad>
	//   10  143:areturn         

		case 4: // '\004'
			return EasingFunctions.EaseInOutQuad;
	//   11  144:getstatic       #96  <Field EasingFunction Easing$EasingFunctions.EaseInOutQuad>
	//   12  147:areturn         

		case 5: // '\005'
			return EasingFunctions.EaseInCubic;
	//   13  148:getstatic       #99  <Field EasingFunction Easing$EasingFunctions.EaseInCubic>
	//   14  151:areturn         

		case 6: // '\006'
			return EasingFunctions.EaseOutCubic;
	//   15  152:getstatic       #102 <Field EasingFunction Easing$EasingFunctions.EaseOutCubic>
	//   16  155:areturn         

		case 7: // '\007'
			return EasingFunctions.EaseInOutCubic;
	//   17  156:getstatic       #105 <Field EasingFunction Easing$EasingFunctions.EaseInOutCubic>
	//   18  159:areturn         

		case 8: // '\b'
			return EasingFunctions.EaseInQuart;
	//   19  160:getstatic       #108 <Field EasingFunction Easing$EasingFunctions.EaseInQuart>
	//   20  163:areturn         

		case 9: // '\t'
			return EasingFunctions.EaseOutQuart;
	//   21  164:getstatic       #111 <Field EasingFunction Easing$EasingFunctions.EaseOutQuart>
	//   22  167:areturn         

		case 10: // '\n'
			return EasingFunctions.EaseInOutQuart;
	//   23  168:getstatic       #114 <Field EasingFunction Easing$EasingFunctions.EaseInOutQuart>
	//   24  171:areturn         

		case 11: // '\013'
			return EasingFunctions.EaseInSine;
	//   25  172:getstatic       #117 <Field EasingFunction Easing$EasingFunctions.EaseInSine>
	//   26  175:areturn         

		case 12: // '\f'
			return EasingFunctions.EaseOutSine;
	//   27  176:getstatic       #120 <Field EasingFunction Easing$EasingFunctions.EaseOutSine>
	//   28  179:areturn         

		case 13: // '\r'
			return EasingFunctions.EaseInOutSine;
	//   29  180:getstatic       #123 <Field EasingFunction Easing$EasingFunctions.EaseInOutSine>
	//   30  183:areturn         

		case 14: // '\016'
			return EasingFunctions.EaseInExpo;
	//   31  184:getstatic       #126 <Field EasingFunction Easing$EasingFunctions.EaseInExpo>
	//   32  187:areturn         

		case 15: // '\017'
			return EasingFunctions.EaseOutExpo;
	//   33  188:getstatic       #129 <Field EasingFunction Easing$EasingFunctions.EaseOutExpo>
	//   34  191:areturn         

		case 16: // '\020'
			return EasingFunctions.EaseInOutExpo;
	//   35  192:getstatic       #132 <Field EasingFunction Easing$EasingFunctions.EaseInOutExpo>
	//   36  195:areturn         

		case 17: // '\021'
			return EasingFunctions.EaseInCirc;
	//   37  196:getstatic       #135 <Field EasingFunction Easing$EasingFunctions.EaseInCirc>
	//   38  199:areturn         

		case 18: // '\022'
			return EasingFunctions.EaseOutCirc;
	//   39  200:getstatic       #138 <Field EasingFunction Easing$EasingFunctions.EaseOutCirc>
	//   40  203:areturn         

		case 19: // '\023'
			return EasingFunctions.EaseInOutCirc;
	//   41  204:getstatic       #141 <Field EasingFunction Easing$EasingFunctions.EaseInOutCirc>
	//   42  207:areturn         

		case 20: // '\024'
			return EasingFunctions.EaseInElastic;
	//   43  208:getstatic       #144 <Field EasingFunction Easing$EasingFunctions.EaseInElastic>
	//   44  211:areturn         

		case 21: // '\025'
			return EasingFunctions.EaseOutElastic;
	//   45  212:getstatic       #147 <Field EasingFunction Easing$EasingFunctions.EaseOutElastic>
	//   46  215:areturn         

		case 22: // '\026'
			return EasingFunctions.EaseInOutElastic;
	//   47  216:getstatic       #150 <Field EasingFunction Easing$EasingFunctions.EaseInOutElastic>
	//   48  219:areturn         

		case 23: // '\027'
			return EasingFunctions.EaseInBack;
	//   49  220:getstatic       #153 <Field EasingFunction Easing$EasingFunctions.EaseInBack>
	//   50  223:areturn         

		case 24: // '\030'
			return EasingFunctions.EaseOutBack;
	//   51  224:getstatic       #156 <Field EasingFunction Easing$EasingFunctions.EaseOutBack>
	//   52  227:areturn         

		case 25: // '\031'
			return EasingFunctions.EaseInOutBack;
	//   53  228:getstatic       #159 <Field EasingFunction Easing$EasingFunctions.EaseInOutBack>
	//   54  231:areturn         

		case 26: // '\032'
			return EasingFunctions.EaseInBounce;
	//   55  232:getstatic       #162 <Field EasingFunction Easing$EasingFunctions.EaseInBounce>
	//   56  235:areturn         

		case 27: // '\033'
			return EasingFunctions.EaseOutBounce;
	//   57  236:getstatic       #165 <Field EasingFunction Easing$EasingFunctions.EaseOutBounce>
	//   58  239:areturn         

		case 28: // '\034'
			return EasingFunctions.EaseInOutBounce;
	//   59  240:getstatic       #168 <Field EasingFunction Easing$EasingFunctions.EaseInOutBounce>
	//   60  243:areturn         
		}
	}
}
