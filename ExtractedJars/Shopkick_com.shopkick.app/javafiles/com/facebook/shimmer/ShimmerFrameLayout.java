// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.shimmer;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.*;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

public class ShimmerFrameLayout extends FrameLayout
{
	private static class Mask
	{

		public int[] getGradientColors()
		{
			static class _cls3
			{

				static final int $SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskAngle[];
				static final int $SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskShape[];

				static 
				{
					$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskAngle = new int[MaskAngle.values().length];
				//    0    0:invokestatic    #19  <Method ShimmerFrameLayout$MaskAngle[] ShimmerFrameLayout$MaskAngle.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskAngle>
					try
					{
						$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskAngle[MaskAngle.CW_0.ordinal()] = 1;
				//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskAngle>
				//    5   12:getstatic       #25  <Field ShimmerFrameLayout$MaskAngle ShimmerFrameLayout$MaskAngle.CW_0>
				//    6   15:invokevirtual   #29  <Method int ShimmerFrameLayout$MaskAngle.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskAngle>
				//*  10   23:getstatic       #32  <Field ShimmerFrameLayout$MaskAngle ShimmerFrameLayout$MaskAngle.CW_90>
				//*  11   26:invokevirtual   #29  <Method int ShimmerFrameLayout$MaskAngle.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:getstatic       #21  <Field int[] $SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskAngle>
				//*  15   34:getstatic       #35  <Field ShimmerFrameLayout$MaskAngle ShimmerFrameLayout$MaskAngle.CW_180>
				//*  16   37:invokevirtual   #29  <Method int ShimmerFrameLayout$MaskAngle.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:getstatic       #21  <Field int[] $SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskAngle>
				//*  20   45:getstatic       #38  <Field ShimmerFrameLayout$MaskAngle ShimmerFrameLayout$MaskAngle.CW_270>
				//*  21   48:invokevirtual   #29  <Method int ShimmerFrameLayout$MaskAngle.ordinal()>
				//*  22   51:iconst_4        
				//*  23   52:iastore         
				//*  24   53:invokestatic    #43  <Method ShimmerFrameLayout$MaskShape[] ShimmerFrameLayout$MaskShape.values()>
				//*  25   56:arraylength     
				//*  26   57:newarray        int[]
				//*  27   59:putstatic       #45  <Field int[] $SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskShape>
				//*  28   62:getstatic       #45  <Field int[] $SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskShape>
				//*  29   65:getstatic       #49  <Field ShimmerFrameLayout$MaskShape ShimmerFrameLayout$MaskShape.LINEAR>
				//*  30   68:invokevirtual   #50  <Method int ShimmerFrameLayout$MaskShape.ordinal()>
				//*  31   71:iconst_1        
				//*  32   72:iastore         
				//*  33   73:getstatic       #45  <Field int[] $SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskShape>
				//*  34   76:getstatic       #53  <Field ShimmerFrameLayout$MaskShape ShimmerFrameLayout$MaskShape.RADIAL>
				//*  35   79:invokevirtual   #50  <Method int ShimmerFrameLayout$MaskShape.ordinal()>
				//*  36   82:iconst_2        
				//*  37   83:iastore         
				//*  38   84:return          
					catch(NoSuchFieldError nosuchfielderror) { }
				//   39   85:astore_0        
					try
					{
						$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskAngle[MaskAngle.CW_90.ordinal()] = 2;
					}
				//*  40   86:goto            20
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   41   89:astore_0        
					try
					{
						$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskAngle[MaskAngle.CW_180.ordinal()] = 3;
					}
				//*  42   90:goto            31
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   43   93:astore_0        
					try
					{
						$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskAngle[MaskAngle.CW_270.ordinal()] = 4;
					}
				//*  44   94:goto            42
					catch(NoSuchFieldError nosuchfielderror3) { }
				//   45   97:astore_0        
					$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskShape = new int[MaskShape.values().length];
					try
					{
						$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskShape[MaskShape.LINEAR.ordinal()] = 1;
					}
				//*  46   98:goto            53
					catch(NoSuchFieldError nosuchfielderror4) { }
				//   47  101:astore_0        
					try
					{
						$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskShape[MaskShape.RADIAL.ordinal()] = 2;
					}
				//*  48  102:goto            73
					catch(NoSuchFieldError nosuchfielderror5) { }
				//   49  105:astore_0        
				//*  50  106:return          
				}
			}

			if(_cls3..SwitchMap.com.facebook.shimmer.ShimmerFrameLayout.MaskShape[shape.ordinal()] != 2)
		//*   0    0:getstatic       #35  <Field int[] ShimmerFrameLayout$3.$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskShape>
		//*   1    3:aload_0         
		//*   2    4:getfield        #37  <Field ShimmerFrameLayout$MaskShape shape>
		//*   3    7:invokevirtual   #43  <Method int ShimmerFrameLayout$MaskShape.ordinal()>
		//*   4   10:iaload          
		//*   5   11:iconst_2        
		//*   6   12:icmpeq          37
				return (new int[] {
					0, 0xff000000, 0xff000000, 0
				});
		//    7   15:iconst_4        
		//    8   16:newarray        int[]
		//    9   18:dup             
		//   10   19:iconst_0        
		//   11   20:iconst_0        
		//   12   21:iastore         
		//   13   22:dup             
		//   14   23:iconst_1        
		//   15   24:ldc1            #44  <Int 0xff000000>
		//   16   26:iastore         
		//   17   27:dup             
		//   18   28:iconst_2        
		//   19   29:ldc1            #44  <Int 0xff000000>
		//   20   31:iastore         
		//   21   32:dup             
		//   22   33:iconst_3        
		//   23   34:iconst_0        
		//   24   35:iastore         
		//   25   36:areturn         
			else
				return (new int[] {
					0xff000000, 0xff000000, 0
				});
		//   26   37:iconst_3        
		//   27   38:newarray        int[]
		//   28   40:dup             
		//   29   41:iconst_0        
		//   30   42:ldc1            #44  <Int 0xff000000>
		//   31   44:iastore         
		//   32   45:dup             
		//   33   46:iconst_1        
		//   34   47:ldc1            #44  <Int 0xff000000>
		//   35   49:iastore         
		//   36   50:dup             
		//   37   51:iconst_2        
		//   38   52:iconst_0        
		//   39   53:iastore         
		//   40   54:areturn         
		}

		public float[] getGradientPositions()
		{
			if(_cls3..SwitchMap.com.facebook.shimmer.ShimmerFrameLayout.MaskShape[shape.ordinal()] != 2)
		//*   0    0:getstatic       #35  <Field int[] ShimmerFrameLayout$3.$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskShape>
		//*   1    3:aload_0         
		//*   2    4:getfield        #37  <Field ShimmerFrameLayout$MaskShape shape>
		//*   3    7:invokevirtual   #43  <Method int ShimmerFrameLayout$MaskShape.ordinal()>
		//*   4   10:iaload          
		//*   5   11:iconst_2        
		//*   6   12:icmpeq          89
				return (new float[] {
					Math.max((1.0F - intensity - dropoff) / 2.0F, 0.0F), Math.max((1.0F - intensity) / 2.0F, 0.0F), Math.min((intensity + 1.0F) / 2.0F, 1.0F), Math.min((intensity + 1.0F + dropoff) / 2.0F, 1.0F)
				});
		//    7   15:iconst_4        
		//    8   16:newarray        float[]
		//    9   18:dup             
		//   10   19:iconst_0        
		//   11   20:fconst_1        
		//   12   21:aload_0         
		//   13   22:getfield        #48  <Field float intensity>
		//   14   25:fsub            
		//   15   26:aload_0         
		//   16   27:getfield        #50  <Field float dropoff>
		//   17   30:fsub            
		//   18   31:fconst_2        
		//   19   32:fdiv            
		//   20   33:fconst_0        
		//   21   34:invokestatic    #56  <Method float Math.max(float, float)>
		//   22   37:fastore         
		//   23   38:dup             
		//   24   39:iconst_1        
		//   25   40:fconst_1        
		//   26   41:aload_0         
		//   27   42:getfield        #48  <Field float intensity>
		//   28   45:fsub            
		//   29   46:fconst_2        
		//   30   47:fdiv            
		//   31   48:fconst_0        
		//   32   49:invokestatic    #56  <Method float Math.max(float, float)>
		//   33   52:fastore         
		//   34   53:dup             
		//   35   54:iconst_2        
		//   36   55:aload_0         
		//   37   56:getfield        #48  <Field float intensity>
		//   38   59:fconst_1        
		//   39   60:fadd            
		//   40   61:fconst_2        
		//   41   62:fdiv            
		//   42   63:fconst_1        
		//   43   64:invokestatic    #59  <Method float Math.min(float, float)>
		//   44   67:fastore         
		//   45   68:dup             
		//   46   69:iconst_3        
		//   47   70:aload_0         
		//   48   71:getfield        #48  <Field float intensity>
		//   49   74:fconst_1        
		//   50   75:fadd            
		//   51   76:aload_0         
		//   52   77:getfield        #50  <Field float dropoff>
		//   53   80:fadd            
		//   54   81:fconst_2        
		//   55   82:fdiv            
		//   56   83:fconst_1        
		//   57   84:invokestatic    #59  <Method float Math.min(float, float)>
		//   58   87:fastore         
		//   59   88:areturn         
			else
				return (new float[] {
					0.0F, Math.min(intensity, 1.0F), Math.min(intensity + dropoff, 1.0F)
				});
		//   60   89:iconst_3        
		//   61   90:newarray        float[]
		//   62   92:dup             
		//   63   93:iconst_0        
		//   64   94:fconst_0        
		//   65   95:fastore         
		//   66   96:dup             
		//   67   97:iconst_1        
		//   68   98:aload_0         
		//   69   99:getfield        #48  <Field float intensity>
		//   70  102:fconst_1        
		//   71  103:invokestatic    #59  <Method float Math.min(float, float)>
		//   72  106:fastore         
		//   73  107:dup             
		//   74  108:iconst_2        
		//   75  109:aload_0         
		//   76  110:getfield        #48  <Field float intensity>
		//   77  113:aload_0         
		//   78  114:getfield        #50  <Field float dropoff>
		//   79  117:fadd            
		//   80  118:fconst_1        
		//   81  119:invokestatic    #59  <Method float Math.min(float, float)>
		//   82  122:fastore         
		//   83  123:areturn         
		}

		public int maskHeight(int i)
		{
			int j = fixedHeight;
		//    0    0:aload_0         
		//    1    1:getfield        #63  <Field int fixedHeight>
		//    2    4:istore_2        
			if(j > 0)
		//*   3    5:iload_2         
		//*   4    6:ifle            11
				return j;
		//    5    9:iload_2         
		//    6   10:ireturn         
			else
				return (int)((float)i * relativeHeight);
		//    7   11:iload_1         
		//    8   12:i2f             
		//    9   13:aload_0         
		//   10   14:getfield        #65  <Field float relativeHeight>
		//   11   17:fmul            
		//   12   18:f2i             
		//   13   19:ireturn         
		}

		public int maskWidth(int i)
		{
			int j = fixedWidth;
		//    0    0:aload_0         
		//    1    1:getfield        #68  <Field int fixedWidth>
		//    2    4:istore_2        
			if(j > 0)
		//*   3    5:iload_2         
		//*   4    6:ifle            11
				return j;
		//    5    9:iload_2         
		//    6   10:ireturn         
			else
				return (int)((float)i * relativeWidth);
		//    7   11:iload_1         
		//    8   12:i2f             
		//    9   13:aload_0         
		//   10   14:getfield        #70  <Field float relativeWidth>
		//   11   17:fmul            
		//   12   18:f2i             
		//   13   19:ireturn         
		}

		public MaskAngle angle;
		public float dropoff;
		public int fixedHeight;
		public int fixedWidth;
		public float intensity;
		public float relativeHeight;
		public float relativeWidth;
		public MaskShape shape;
		public float tilt;

		private Mask()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
		//    2    4:return          
		}

	}

	public static final class MaskAngle extends Enum
	{

		public static MaskAngle valueOf(String s)
		{
			return (MaskAngle)Enum.valueOf(com/facebook/shimmer/ShimmerFrameLayout$MaskAngle, s);
		//    0    0:ldc1            #2   <Class ShimmerFrameLayout$MaskAngle>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ShimmerFrameLayout$MaskAngle>
		//    4    9:areturn         
		}

		public static MaskAngle[] values()
		{
			return (MaskAngle[])((MaskAngle []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field ShimmerFrameLayout$MaskAngle[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.facebook.shimmer.ShimmerFrameLayout$MaskAngle_3B_.clone()>
		//    2    6:checkcast       #46  <Class ShimmerFrameLayout$MaskAngle[]>
		//    3    9:areturn         
		}

		private static final MaskAngle $VALUES[];
		public static final MaskAngle CW_0;
		public static final MaskAngle CW_180;
		public static final MaskAngle CW_270;
		public static final MaskAngle CW_90;

		static 
		{
			CW_0 = new MaskAngle("CW_0", 0);
		//    0    0:new             #2   <Class ShimmerFrameLayout$MaskAngle>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "CW_0">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void ShimmerFrameLayout$MaskAngle(String, int)>
		//    5   10:putstatic       #24  <Field ShimmerFrameLayout$MaskAngle CW_0>
			CW_90 = new MaskAngle("CW_90", 1);
		//    6   13:new             #2   <Class ShimmerFrameLayout$MaskAngle>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "CW_90">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void ShimmerFrameLayout$MaskAngle(String, int)>
		//   11   23:putstatic       #27  <Field ShimmerFrameLayout$MaskAngle CW_90>
			CW_180 = new MaskAngle("CW_180", 2);
		//   12   26:new             #2   <Class ShimmerFrameLayout$MaskAngle>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "CW_180">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void ShimmerFrameLayout$MaskAngle(String, int)>
		//   17   36:putstatic       #30  <Field ShimmerFrameLayout$MaskAngle CW_180>
			CW_270 = new MaskAngle("CW_270", 3);
		//   18   39:new             #2   <Class ShimmerFrameLayout$MaskAngle>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "CW_270">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void ShimmerFrameLayout$MaskAngle(String, int)>
		//   23   49:putstatic       #33  <Field ShimmerFrameLayout$MaskAngle CW_270>
			$VALUES = (new MaskAngle[] {
				CW_0, CW_90, CW_180, CW_270
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       MaskAngle[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field ShimmerFrameLayout$MaskAngle CW_0>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field ShimmerFrameLayout$MaskAngle CW_90>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field ShimmerFrameLayout$MaskAngle CW_180>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field ShimmerFrameLayout$MaskAngle CW_270>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field ShimmerFrameLayout$MaskAngle[] $VALUES>
		//*  43   83:return          
		}

		private MaskAngle(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class MaskShape extends Enum
	{

		public static MaskShape valueOf(String s)
		{
			return (MaskShape)Enum.valueOf(com/facebook/shimmer/ShimmerFrameLayout$MaskShape, s);
		//    0    0:ldc1            #2   <Class ShimmerFrameLayout$MaskShape>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ShimmerFrameLayout$MaskShape>
		//    4    9:areturn         
		}

		public static MaskShape[] values()
		{
			return (MaskShape[])((MaskShape []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field ShimmerFrameLayout$MaskShape[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.shimmer.ShimmerFrameLayout$MaskShape_3B_.clone()>
		//    2    6:checkcast       #38  <Class ShimmerFrameLayout$MaskShape[]>
		//    3    9:areturn         
		}

		private static final MaskShape $VALUES[];
		public static final MaskShape LINEAR;
		public static final MaskShape RADIAL;

		static 
		{
			LINEAR = new MaskShape("LINEAR", 0);
		//    0    0:new             #2   <Class ShimmerFrameLayout$MaskShape>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "LINEAR">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void ShimmerFrameLayout$MaskShape(String, int)>
		//    5   10:putstatic       #22  <Field ShimmerFrameLayout$MaskShape LINEAR>
			RADIAL = new MaskShape("RADIAL", 1);
		//    6   13:new             #2   <Class ShimmerFrameLayout$MaskShape>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "RADIAL">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void ShimmerFrameLayout$MaskShape(String, int)>
		//   11   23:putstatic       #25  <Field ShimmerFrameLayout$MaskShape RADIAL>
			$VALUES = (new MaskShape[] {
				LINEAR, RADIAL
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       MaskShape[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field ShimmerFrameLayout$MaskShape LINEAR>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field ShimmerFrameLayout$MaskShape RADIAL>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field ShimmerFrameLayout$MaskShape[] $VALUES>
		//*  23   45:return          
		}

		private MaskShape(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	private static class MaskTranslation
	{

		public void set(int i, int j, int k, int l)
		{
			fromX = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #23  <Field int fromX>
			fromY = j;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #25  <Field int fromY>
			toX = k;
		//    6   10:aload_0         
		//    7   11:iload_3         
		//    8   12:putfield        #27  <Field int toX>
			toY = l;
		//    9   15:aload_0         
		//   10   16:iload           4
		//   11   18:putfield        #29  <Field int toY>
		//   12   21:return          
		}

		public int fromX;
		public int fromY;
		public int toX;
		public int toY;

		private MaskTranslation()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}

	}


	public ShimmerFrameLayout(Context context)
	{
		this(context, ((AttributeSet) (null)), 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_0        
	//    4    4:invokespecial   #74  <Method void ShimmerFrameLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public ShimmerFrameLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #74  <Method void ShimmerFrameLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public ShimmerFrameLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #76  <Method void FrameLayout(Context, AttributeSet, int)>
		setWillNotDraw(false);
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #80  <Method void setWillNotDraw(boolean)>
		mMask = new Mask();
	//    8   12:aload_0         
	//    9   13:new             #12  <Class ShimmerFrameLayout$Mask>
	//   10   16:dup             
	//   11   17:aconst_null     
	//   12   18:invokespecial   #83  <Method void ShimmerFrameLayout$Mask(ShimmerFrameLayout$1)>
	//   13   21:putfield        #85  <Field ShimmerFrameLayout$Mask mMask>
		mAlphaPaint = new Paint();
	//   14   24:aload_0         
	//   15   25:new             #87  <Class Paint>
	//   16   28:dup             
	//   17   29:invokespecial   #89  <Method void Paint()>
	//   18   32:putfield        #91  <Field Paint mAlphaPaint>
		mMaskPaint = new Paint();
	//   19   35:aload_0         
	//   20   36:new             #87  <Class Paint>
	//   21   39:dup             
	//   22   40:invokespecial   #89  <Method void Paint()>
	//   23   43:putfield        #93  <Field Paint mMaskPaint>
		mMaskPaint.setAntiAlias(true);
	//   24   46:aload_0         
	//   25   47:getfield        #93  <Field Paint mMaskPaint>
	//   26   50:iconst_1        
	//   27   51:invokevirtual   #96  <Method void Paint.setAntiAlias(boolean)>
		mMaskPaint.setDither(true);
	//   28   54:aload_0         
	//   29   55:getfield        #93  <Field Paint mMaskPaint>
	//   30   58:iconst_1        
	//   31   59:invokevirtual   #99  <Method void Paint.setDither(boolean)>
		mMaskPaint.setFilterBitmap(true);
	//   32   62:aload_0         
	//   33   63:getfield        #93  <Field Paint mMaskPaint>
	//   34   66:iconst_1        
	//   35   67:invokevirtual   #102 <Method void Paint.setFilterBitmap(boolean)>
		mMaskPaint.setXfermode(((android.graphics.Xfermode) (DST_IN_PORTER_DUFF_XFERMODE)));
	//   36   70:aload_0         
	//   37   71:getfield        #93  <Field Paint mMaskPaint>
	//   38   74:getstatic       #69  <Field PorterDuffXfermode DST_IN_PORTER_DUFF_XFERMODE>
	//   39   77:invokevirtual   #106 <Method android.graphics.Xfermode Paint.setXfermode(android.graphics.Xfermode)>
	//   40   80:pop             
		useDefaults();
	//   41   81:aload_0         
	//   42   82:invokevirtual   #109 <Method void useDefaults()>
		if(attributeset == null)
			break MISSING_BLOCK_LABEL_510;
	//   43   85:aload_2         
	//   44   86:ifnull          510
		context = ((Context) (context.obtainStyledAttributes(attributeset, R.styleable.ShimmerFrameLayout, 0, 0)));
	//   45   89:aload_1         
	//   46   90:aload_2         
	//   47   91:getstatic       #114 <Field int[] R$styleable.ShimmerFrameLayout>
	//   48   94:iconst_0        
	//   49   95:iconst_0        
	//   50   96:invokevirtual   #120 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   51   99:astore_1        
		if(((TypedArray) (context)).hasValue(0))
	//*  52  100:aload_1         
	//*  53  101:iconst_0        
	//*  54  102:invokevirtual   #126 <Method boolean TypedArray.hasValue(int)>
	//*  55  105:ifeq            118
			setAutoStart(((TypedArray) (context)).getBoolean(0, false));
	//   56  108:aload_0         
	//   57  109:aload_1         
	//   58  110:iconst_0        
	//   59  111:iconst_0        
	//   60  112:invokevirtual   #130 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   61  115:invokevirtual   #133 <Method void setAutoStart(boolean)>
		if(((TypedArray) (context)).hasValue(1))
	//*  62  118:aload_1         
	//*  63  119:iconst_1        
	//*  64  120:invokevirtual   #126 <Method boolean TypedArray.hasValue(int)>
	//*  65  123:ifeq            136
			setBaseAlpha(((TypedArray) (context)).getFloat(1, 0.0F));
	//   66  126:aload_0         
	//   67  127:aload_1         
	//   68  128:iconst_1        
	//   69  129:fconst_0        
	//   70  130:invokevirtual   #137 <Method float TypedArray.getFloat(int, float)>
	//   71  133:invokevirtual   #141 <Method void setBaseAlpha(float)>
		if(((TypedArray) (context)).hasValue(2))
	//*  72  136:aload_1         
	//*  73  137:iconst_2        
	//*  74  138:invokevirtual   #126 <Method boolean TypedArray.hasValue(int)>
	//*  75  141:ifeq            154
			setDuration(((TypedArray) (context)).getInt(2, 0));
	//   76  144:aload_0         
	//   77  145:aload_1         
	//   78  146:iconst_2        
	//   79  147:iconst_0        
	//   80  148:invokevirtual   #145 <Method int TypedArray.getInt(int, int)>
	//   81  151:invokevirtual   #149 <Method void setDuration(int)>
		if(((TypedArray) (context)).hasValue(3))
	//*  82  154:aload_1         
	//*  83  155:iconst_3        
	//*  84  156:invokevirtual   #126 <Method boolean TypedArray.hasValue(int)>
	//*  85  159:ifeq            172
			setRepeatCount(((TypedArray) (context)).getInt(3, 0));
	//   86  162:aload_0         
	//   87  163:aload_1         
	//   88  164:iconst_3        
	//   89  165:iconst_0        
	//   90  166:invokevirtual   #145 <Method int TypedArray.getInt(int, int)>
	//   91  169:invokevirtual   #152 <Method void setRepeatCount(int)>
		if(((TypedArray) (context)).hasValue(4))
	//*  92  172:aload_1         
	//*  93  173:iconst_4        
	//*  94  174:invokevirtual   #126 <Method boolean TypedArray.hasValue(int)>
	//*  95  177:ifeq            190
			setRepeatDelay(((TypedArray) (context)).getInt(4, 0));
	//   96  180:aload_0         
	//   97  181:aload_1         
	//   98  182:iconst_4        
	//   99  183:iconst_0        
	//  100  184:invokevirtual   #145 <Method int TypedArray.getInt(int, int)>
	//  101  187:invokevirtual   #155 <Method void setRepeatDelay(int)>
		if(((TypedArray) (context)).hasValue(5))
	//* 102  190:aload_1         
	//* 103  191:iconst_5        
	//* 104  192:invokevirtual   #126 <Method boolean TypedArray.hasValue(int)>
	//* 105  195:ifeq            208
			setRepeatMode(((TypedArray) (context)).getInt(5, 0));
	//  106  198:aload_0         
	//  107  199:aload_1         
	//  108  200:iconst_5        
	//  109  201:iconst_0        
	//  110  202:invokevirtual   #145 <Method int TypedArray.getInt(int, int)>
	//  111  205:invokevirtual   #158 <Method void setRepeatMode(int)>
		if(!((TypedArray) (context)).hasValue(6))
			break MISSING_BLOCK_LABEL_294;
	//  112  208:aload_1         
	//  113  209:bipush          6
	//  114  211:invokevirtual   #126 <Method boolean TypedArray.hasValue(int)>
	//  115  214:ifeq            294
		i = ((TypedArray) (context)).getInt(6, 0);
	//  116  217:aload_1         
	//  117  218:bipush          6
	//  118  220:iconst_0        
	//  119  221:invokevirtual   #145 <Method int TypedArray.getInt(int, int)>
	//  120  224:istore_3        
		if(i == 90)
			break MISSING_BLOCK_LABEL_284;
	//  121  225:iload_3         
	//  122  226:bipush          90
	//  123  228:icmpeq          284
		if(i == 180)
			break MISSING_BLOCK_LABEL_271;
	//  124  231:iload_3         
	//  125  232:sipush          180
	//  126  235:icmpeq          271
		if(i == 270)
			break MISSING_BLOCK_LABEL_258;
	//  127  238:iload_3         
	//  128  239:sipush          270
	//  129  242:icmpeq          258
		mMask.angle = MaskAngle.CW_0;
	//  130  245:aload_0         
	//  131  246:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//  132  249:getstatic       #162 <Field ShimmerFrameLayout$MaskAngle ShimmerFrameLayout$MaskAngle.CW_0>
	//  133  252:putfield        #165 <Field ShimmerFrameLayout$MaskAngle ShimmerFrameLayout$Mask.angle>
		break MISSING_BLOCK_LABEL_294;
	//  134  255:goto            294
		mMask.angle = MaskAngle.CW_270;
	//  135  258:aload_0         
	//  136  259:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//  137  262:getstatic       #168 <Field ShimmerFrameLayout$MaskAngle ShimmerFrameLayout$MaskAngle.CW_270>
	//  138  265:putfield        #165 <Field ShimmerFrameLayout$MaskAngle ShimmerFrameLayout$Mask.angle>
		break MISSING_BLOCK_LABEL_294;
	//  139  268:goto            294
		mMask.angle = MaskAngle.CW_180;
	//  140  271:aload_0         
	//  141  272:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//  142  275:getstatic       #171 <Field ShimmerFrameLayout$MaskAngle ShimmerFrameLayout$MaskAngle.CW_180>
	//  143  278:putfield        #165 <Field ShimmerFrameLayout$MaskAngle ShimmerFrameLayout$Mask.angle>
		break MISSING_BLOCK_LABEL_294;
	//  144  281:goto            294
		mMask.angle = MaskAngle.CW_90;
	//  145  284:aload_0         
	//  146  285:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//  147  288:getstatic       #174 <Field ShimmerFrameLayout$MaskAngle ShimmerFrameLayout$MaskAngle.CW_90>
	//  148  291:putfield        #165 <Field ShimmerFrameLayout$MaskAngle ShimmerFrameLayout$Mask.angle>
		if(!((TypedArray) (context)).hasValue(13))
			break MISSING_BLOCK_LABEL_337;
	//  149  294:aload_1         
	//  150  295:bipush          13
	//  151  297:invokevirtual   #126 <Method boolean TypedArray.hasValue(int)>
	//  152  300:ifeq            337
		if(((TypedArray) (context)).getInt(13, 0) != 1)
	//* 153  303:aload_1         
	//* 154  304:bipush          13
	//* 155  306:iconst_0        
	//* 156  307:invokevirtual   #145 <Method int TypedArray.getInt(int, int)>
	//* 157  310:iconst_1        
	//* 158  311:icmpeq          327
		{
			mMask.shape = MaskShape.LINEAR;
	//  159  314:aload_0         
	//  160  315:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//  161  318:getstatic       #178 <Field ShimmerFrameLayout$MaskShape ShimmerFrameLayout$MaskShape.LINEAR>
	//  162  321:putfield        #181 <Field ShimmerFrameLayout$MaskShape ShimmerFrameLayout$Mask.shape>
			break MISSING_BLOCK_LABEL_337;
	//  163  324:goto            337
		}
		mMask.shape = MaskShape.RADIAL;
	//  164  327:aload_0         
	//  165  328:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//  166  331:getstatic       #184 <Field ShimmerFrameLayout$MaskShape ShimmerFrameLayout$MaskShape.RADIAL>
	//  167  334:putfield        #181 <Field ShimmerFrameLayout$MaskShape ShimmerFrameLayout$Mask.shape>
		if(((TypedArray) (context)).hasValue(7))
	//* 168  337:aload_1         
	//* 169  338:bipush          7
	//* 170  340:invokevirtual   #126 <Method boolean TypedArray.hasValue(int)>
	//* 171  343:ifeq            360
			mMask.dropoff = ((TypedArray) (context)).getFloat(7, 0.0F);
	//  172  346:aload_0         
	//  173  347:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//  174  350:aload_1         
	//  175  351:bipush          7
	//  176  353:fconst_0        
	//  177  354:invokevirtual   #137 <Method float TypedArray.getFloat(int, float)>
	//  178  357:putfield        #188 <Field float ShimmerFrameLayout$Mask.dropoff>
		if(((TypedArray) (context)).hasValue(8))
	//* 179  360:aload_1         
	//* 180  361:bipush          8
	//* 181  363:invokevirtual   #126 <Method boolean TypedArray.hasValue(int)>
	//* 182  366:ifeq            383
			mMask.fixedWidth = ((TypedArray) (context)).getDimensionPixelSize(8, 0);
	//  183  369:aload_0         
	//  184  370:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//  185  373:aload_1         
	//  186  374:bipush          8
	//  187  376:iconst_0        
	//  188  377:invokevirtual   #191 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  189  380:putfield        #194 <Field int ShimmerFrameLayout$Mask.fixedWidth>
		if(((TypedArray) (context)).hasValue(9))
	//* 190  383:aload_1         
	//* 191  384:bipush          9
	//* 192  386:invokevirtual   #126 <Method boolean TypedArray.hasValue(int)>
	//* 193  389:ifeq            406
			mMask.fixedHeight = ((TypedArray) (context)).getDimensionPixelSize(9, 0);
	//  194  392:aload_0         
	//  195  393:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//  196  396:aload_1         
	//  197  397:bipush          9
	//  198  399:iconst_0        
	//  199  400:invokevirtual   #191 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  200  403:putfield        #197 <Field int ShimmerFrameLayout$Mask.fixedHeight>
		if(((TypedArray) (context)).hasValue(10))
	//* 201  406:aload_1         
	//* 202  407:bipush          10
	//* 203  409:invokevirtual   #126 <Method boolean TypedArray.hasValue(int)>
	//* 204  412:ifeq            429
			mMask.intensity = ((TypedArray) (context)).getFloat(10, 0.0F);
	//  205  415:aload_0         
	//  206  416:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//  207  419:aload_1         
	//  208  420:bipush          10
	//  209  422:fconst_0        
	//  210  423:invokevirtual   #137 <Method float TypedArray.getFloat(int, float)>
	//  211  426:putfield        #200 <Field float ShimmerFrameLayout$Mask.intensity>
		if(((TypedArray) (context)).hasValue(11))
	//* 212  429:aload_1         
	//* 213  430:bipush          11
	//* 214  432:invokevirtual   #126 <Method boolean TypedArray.hasValue(int)>
	//* 215  435:ifeq            452
			mMask.relativeWidth = ((TypedArray) (context)).getFloat(11, 0.0F);
	//  216  438:aload_0         
	//  217  439:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//  218  442:aload_1         
	//  219  443:bipush          11
	//  220  445:fconst_0        
	//  221  446:invokevirtual   #137 <Method float TypedArray.getFloat(int, float)>
	//  222  449:putfield        #203 <Field float ShimmerFrameLayout$Mask.relativeWidth>
		if(((TypedArray) (context)).hasValue(12))
	//* 223  452:aload_1         
	//* 224  453:bipush          12
	//* 225  455:invokevirtual   #126 <Method boolean TypedArray.hasValue(int)>
	//* 226  458:ifeq            475
			mMask.relativeHeight = ((TypedArray) (context)).getFloat(12, 0.0F);
	//  227  461:aload_0         
	//  228  462:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//  229  465:aload_1         
	//  230  466:bipush          12
	//  231  468:fconst_0        
	//  232  469:invokevirtual   #137 <Method float TypedArray.getFloat(int, float)>
	//  233  472:putfield        #206 <Field float ShimmerFrameLayout$Mask.relativeHeight>
		if(((TypedArray) (context)).hasValue(14))
	//* 234  475:aload_1         
	//* 235  476:bipush          14
	//* 236  478:invokevirtual   #126 <Method boolean TypedArray.hasValue(int)>
	//* 237  481:ifeq            498
			mMask.tilt = ((TypedArray) (context)).getFloat(14, 0.0F);
	//  238  484:aload_0         
	//  239  485:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//  240  488:aload_1         
	//  241  489:bipush          14
	//  242  491:fconst_0        
	//  243  492:invokevirtual   #137 <Method float TypedArray.getFloat(int, float)>
	//  244  495:putfield        #209 <Field float ShimmerFrameLayout$Mask.tilt>
		((TypedArray) (context)).recycle();
	//  245  498:aload_1         
	//  246  499:invokevirtual   #212 <Method void TypedArray.recycle()>
		return;
	//  247  502:return          
		attributeset;
	//  248  503:astore_2        
		((TypedArray) (context)).recycle();
	//  249  504:aload_1         
	//  250  505:invokevirtual   #212 <Method void TypedArray.recycle()>
		throw attributeset;
	//  251  508:aload_2         
	//  252  509:athrow          
	//  253  510:return          
	}

	private static float clamp(float f, float f1, float f2)
	{
		return Math.min(f1, Math.max(f, f2));
	//    0    0:fload_1         
	//    1    1:fload_0         
	//    2    2:fload_2         
	//    3    3:invokestatic    #245 <Method float Math.max(float, float)>
	//    4    6:invokestatic    #248 <Method float Math.min(float, float)>
	//    5    9:freturn         
	}

	protected static Bitmap createBitmapAndGcIfNecessary(int i, int j)
	{
		OutOfMemoryError outofmemoryerror;
		Bitmap bitmap;
		try
		{
			bitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:getstatic       #258 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//    3    5:invokestatic    #264 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//    4    8:astore_2        
		}
	//*   5    9:aload_2         
	//*   6   10:areturn         
	//*   7   11:invokestatic    #269 <Method void System.gc()>
	//*   8   14:iload_0         
	//*   9   15:iload_1         
	//*  10   16:getstatic       #258 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//*  11   19:invokestatic    #264 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//*  12   22:areturn         
		// Misplaced declaration of an exception variable
		catch(OutOfMemoryError outofmemoryerror)
		{
			System.gc();
			return Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
		}
		return bitmap;
	//*  13   23:astore_2        
	//*  14   24:goto            11
	}

	private boolean dispatchDrawUsingBitmap(Canvas canvas)
	{
		Bitmap bitmap = tryObtainRenderUnmaskBitmap();
	//    0    0:aload_0         
	//    1    1:invokespecial   #275 <Method Bitmap tryObtainRenderUnmaskBitmap()>
	//    2    4:astore_2        
		Bitmap bitmap1 = tryObtainRenderMaskBitmap();
	//    3    5:aload_0         
	//    4    6:invokespecial   #278 <Method Bitmap tryObtainRenderMaskBitmap()>
	//    5    9:astore_3        
		if(bitmap != null && bitmap1 != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          66
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       21
	//*  10   18:goto            66
		{
			drawUnmasked(new Canvas(bitmap));
	//   11   21:aload_0         
	//   12   22:new             #280 <Class Canvas>
	//   13   25:dup             
	//   14   26:aload_2         
	//   15   27:invokespecial   #283 <Method void Canvas(Bitmap)>
	//   16   30:invokespecial   #287 <Method void drawUnmasked(Canvas)>
			canvas.drawBitmap(bitmap, 0.0F, 0.0F, mAlphaPaint);
	//   17   33:aload_1         
	//   18   34:aload_2         
	//   19   35:fconst_0        
	//   20   36:fconst_0        
	//   21   37:aload_0         
	//   22   38:getfield        #91  <Field Paint mAlphaPaint>
	//   23   41:invokevirtual   #291 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
			drawMasked(new Canvas(bitmap1));
	//   24   44:aload_0         
	//   25   45:new             #280 <Class Canvas>
	//   26   48:dup             
	//   27   49:aload_3         
	//   28   50:invokespecial   #283 <Method void Canvas(Bitmap)>
	//   29   53:invokespecial   #294 <Method void drawMasked(Canvas)>
			canvas.drawBitmap(bitmap1, 0.0F, 0.0F, ((Paint) (null)));
	//   30   56:aload_1         
	//   31   57:aload_3         
	//   32   58:fconst_0        
	//   33   59:fconst_0        
	//   34   60:aconst_null     
	//   35   61:invokevirtual   #291 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
			return true;
	//   36   64:iconst_1        
	//   37   65:ireturn         
		} else
		{
			return false;
	//   38   66:iconst_0        
	//   39   67:ireturn         
		}
	}

	private void drawMasked(Canvas canvas)
	{
		Bitmap bitmap = getMaskBitmap();
	//    0    0:aload_0         
	//    1    1:invokespecial   #297 <Method Bitmap getMaskBitmap()>
	//    2    4:astore_3        
		if(bitmap == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			int i = mMaskOffsetX;
	//    6   10:aload_0         
	//    7   11:getfield        #299 <Field int mMaskOffsetX>
	//    8   14:istore_2        
			canvas.clipRect(i, mMaskOffsetY, bitmap.getWidth() + i, mMaskOffsetY + bitmap.getHeight());
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:aload_0         
	//   12   18:getfield        #301 <Field int mMaskOffsetY>
	//   13   21:aload_3         
	//   14   22:invokevirtual   #305 <Method int Bitmap.getWidth()>
	//   15   25:iload_2         
	//   16   26:iadd            
	//   17   27:aload_0         
	//   18   28:getfield        #301 <Field int mMaskOffsetY>
	//   19   31:aload_3         
	//   20   32:invokevirtual   #308 <Method int Bitmap.getHeight()>
	//   21   35:iadd            
	//   22   36:invokevirtual   #312 <Method boolean Canvas.clipRect(int, int, int, int)>
	//   23   39:pop             
			super.dispatchDraw(canvas);
	//   24   40:aload_0         
	//   25   41:aload_1         
	//   26   42:invokespecial   #315 <Method void FrameLayout.dispatchDraw(Canvas)>
			canvas.drawBitmap(bitmap, mMaskOffsetX, mMaskOffsetY, mMaskPaint);
	//   27   45:aload_1         
	//   28   46:aload_3         
	//   29   47:aload_0         
	//   30   48:getfield        #299 <Field int mMaskOffsetX>
	//   31   51:i2f             
	//   32   52:aload_0         
	//   33   53:getfield        #301 <Field int mMaskOffsetY>
	//   34   56:i2f             
	//   35   57:aload_0         
	//   36   58:getfield        #93  <Field Paint mMaskPaint>
	//   37   61:invokevirtual   #291 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
			return;
	//   38   64:return          
		}
	}

	private void drawUnmasked(Canvas canvas)
	{
		super.dispatchDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #315 <Method void FrameLayout.dispatchDraw(Canvas)>
	//    3    5:return          
	}

	private android.view.ViewTreeObserver.OnGlobalLayoutListener getLayoutListener()
	{
		return new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

			public void onGlobalLayout()
			{
				boolean flag = mAnimationStarted;
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ShimmerFrameLayout this$0>
			//    2    4:invokestatic    #26  <Method boolean ShimmerFrameLayout.access$200(ShimmerFrameLayout)>
			//    3    7:istore_1        
				resetAll();
			//    4    8:aload_0         
			//    5    9:getfield        #17  <Field ShimmerFrameLayout this$0>
			//    6   12:invokestatic    #29  <Method void ShimmerFrameLayout.access$300(ShimmerFrameLayout)>
				if(mAutoStart || flag)
			//*   7   15:aload_0         
			//*   8   16:getfield        #17  <Field ShimmerFrameLayout this$0>
			//*   9   19:invokestatic    #32  <Method boolean ShimmerFrameLayout.access$400(ShimmerFrameLayout)>
			//*  10   22:ifne            29
			//*  11   25:iload_1         
			//*  12   26:ifeq            36
					startShimmerAnimation();
			//   13   29:aload_0         
			//   14   30:getfield        #17  <Field ShimmerFrameLayout this$0>
			//   15   33:invokevirtual   #35  <Method void ShimmerFrameLayout.startShimmerAnimation()>
			//   16   36:return          
			}

			final ShimmerFrameLayout this$0;

			
			{
				this$0 = ShimmerFrameLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ShimmerFrameLayout this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #6   <Class ShimmerFrameLayout$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #319 <Method void ShimmerFrameLayout$1(ShimmerFrameLayout)>
	//    4    8:areturn         
	}

	private Bitmap getMaskBitmap()
	{
		Object obj = ((Object) (mMaskBitmap));
	//    0    0:aload_0         
	//    1    1:getfield        #321 <Field Bitmap mMaskBitmap>
	//    2    4:astore          8
		if(obj != null)
	//*   3    6:aload           8
	//*   4    8:ifnull          14
			return ((Bitmap) (obj));
	//    5   11:aload           8
	//    6   13:areturn         
		int k1 = mMask.maskWidth(getWidth());
	//    7   14:aload_0         
	//    8   15:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//    9   18:aload_0         
	//   10   19:invokevirtual   #322 <Method int getWidth()>
	//   11   22:invokevirtual   #326 <Method int ShimmerFrameLayout$Mask.maskWidth(int)>
	//   12   25:istore          5
		int l1 = mMask.maskHeight(getHeight());
	//   13   27:aload_0         
	//   14   28:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//   15   31:aload_0         
	//   16   32:invokevirtual   #327 <Method int getHeight()>
	//   17   35:invokevirtual   #330 <Method int ShimmerFrameLayout$Mask.maskHeight(int)>
	//   18   38:istore          6
		mMaskBitmap = createBitmapAndGcIfNecessary(k1, l1);
	//   19   40:aload_0         
	//   20   41:iload           5
	//   21   43:iload           6
	//   22   45:invokestatic    #332 <Method Bitmap createBitmapAndGcIfNecessary(int, int)>
	//   23   48:putfield        #321 <Field Bitmap mMaskBitmap>
		Canvas canvas = new Canvas(mMaskBitmap);
	//   24   51:new             #280 <Class Canvas>
	//   25   54:dup             
	//   26   55:aload_0         
	//   27   56:getfield        #321 <Field Bitmap mMaskBitmap>
	//   28   59:invokespecial   #283 <Method void Canvas(Bitmap)>
	//   29   62:astore          9
		if(_cls3..SwitchMap.com.facebook.shimmer.ShimmerFrameLayout.MaskShape[mMask.shape.ordinal()] != 2)
	//*  30   64:getstatic       #335 <Field int[] ShimmerFrameLayout$3.$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskShape>
	//*  31   67:aload_0         
	//*  32   68:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//*  33   71:getfield        #181 <Field ShimmerFrameLayout$MaskShape ShimmerFrameLayout$Mask.shape>
	//*  34   74:invokevirtual   #338 <Method int ShimmerFrameLayout$MaskShape.ordinal()>
	//*  35   77:iaload          
	//*  36   78:iconst_2        
	//*  37   79:icmpeq          211
		{
			int i = _cls3..SwitchMap.com.facebook.shimmer.ShimmerFrameLayout.MaskAngle[mMask.angle.ordinal()];
	//   38   82:getstatic       #341 <Field int[] ShimmerFrameLayout$3.$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskAngle>
	//   39   85:aload_0         
	//   40   86:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//   41   89:getfield        #165 <Field ShimmerFrameLayout$MaskAngle ShimmerFrameLayout$Mask.angle>
	//   42   92:invokevirtual   #342 <Method int ShimmerFrameLayout$MaskAngle.ordinal()>
	//   43   95:iaload          
	//   44   96:istore_2        
			int i2 = 0;
	//   45   97:iconst_0        
	//   46   98:istore          7
			int l;
			int j1;
			switch(i)
	//*  47  100:iload_2         
			{
	//*  48  101:tableswitch     2 4: default 128
	//	               2 164
	//	               3 150
	//	               4 139
			default:
				l = k1;
	//   49  128:iload           5
	//   50  130:istore_3        
				i = 0;
	//   51  131:iconst_0        
	//   52  132:istore_2        
				j1 = i;
	//   53  133:iload_2         
	//   54  134:istore          4
				break;

	//*  55  136:goto            172
			case 4: // '\004'
				i = l1;
	//   56  139:iload           6
	//   57  141:istore_2        
				l = 0;
	//   58  142:iconst_0        
	//   59  143:istore_3        
				j1 = l;
	//   60  144:iload_3         
	//   61  145:istore          4
				break;

	//*  62  147:goto            172
			case 3: // '\003'
				i = 0;
	//   63  150:iconst_0        
	//   64  151:istore_2        
				l = i;
	//   65  152:iload_2         
	//   66  153:istore_3        
				j1 = l;
	//   67  154:iload_3         
	//   68  155:istore          4
				i2 = k1;
	//   69  157:iload           5
	//   70  159:istore          7
				break;

	//*  71  161:goto            172
			case 2: // '\002'
				j1 = l1;
	//   72  164:iload           6
	//   73  166:istore          4
				i = 0;
	//   74  168:iconst_0        
	//   75  169:istore_2        
				l = i;
	//   76  170:iload_2         
	//   77  171:istore_3        
				break;
			}
			obj = ((Object) (new LinearGradient(i2, i, l, j1, mMask.getGradientColors(), mMask.getGradientPositions(), android.graphics.Shader.TileMode.REPEAT)));
	//   78  172:new             #344 <Class LinearGradient>
	//   79  175:dup             
	//   80  176:iload           7
	//   81  178:i2f             
	//   82  179:iload_2         
	//   83  180:i2f             
	//   84  181:iload_3         
	//   85  182:i2f             
	//   86  183:iload           4
	//   87  185:i2f             
	//   88  186:aload_0         
	//   89  187:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//   90  190:invokevirtual   #348 <Method int[] ShimmerFrameLayout$Mask.getGradientColors()>
	//   91  193:aload_0         
	//   92  194:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//   93  197:invokevirtual   #352 <Method float[] ShimmerFrameLayout$Mask.getGradientPositions()>
	//   94  200:getstatic       #358 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.REPEAT>
	//   95  203:invokespecial   #361 <Method void LinearGradient(float, float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//   96  206:astore          8
		} else
	//*  97  208:goto            267
		{
			int j = k1 / 2;
	//   98  211:iload           5
	//   99  213:iconst_2        
	//  100  214:idiv            
	//  101  215:istore_2        
			int i1 = l1 / 2;
	//  102  216:iload           6
	//  103  218:iconst_2        
	//  104  219:idiv            
	//  105  220:istore_3        
			obj = ((Object) (new RadialGradient(j, i1, (float)((double)Math.max(k1, l1) / Math.sqrt(2D)), mMask.getGradientColors(), mMask.getGradientPositions(), android.graphics.Shader.TileMode.REPEAT)));
	//  106  221:new             #363 <Class RadialGradient>
	//  107  224:dup             
	//  108  225:iload_2         
	//  109  226:i2f             
	//  110  227:iload_3         
	//  111  228:i2f             
	//  112  229:iload           5
	//  113  231:iload           6
	//  114  233:invokestatic    #365 <Method int Math.max(int, int)>
	//  115  236:i2d             
	//  116  237:ldc2w           #366 <Double 2D>
	//  117  240:invokestatic    #371 <Method double Math.sqrt(double)>
	//  118  243:ddiv            
	//  119  244:d2f             
	//  120  245:aload_0         
	//  121  246:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//  122  249:invokevirtual   #348 <Method int[] ShimmerFrameLayout$Mask.getGradientColors()>
	//  123  252:aload_0         
	//  124  253:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//  125  256:invokevirtual   #352 <Method float[] ShimmerFrameLayout$Mask.getGradientPositions()>
	//  126  259:getstatic       #358 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.REPEAT>
	//  127  262:invokespecial   #374 <Method void RadialGradient(float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//  128  265:astore          8
		}
		canvas.rotate(mMask.tilt, k1 / 2, l1 / 2);
	//  129  267:aload           9
	//  130  269:aload_0         
	//  131  270:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//  132  273:getfield        #209 <Field float ShimmerFrameLayout$Mask.tilt>
	//  133  276:iload           5
	//  134  278:iconst_2        
	//  135  279:idiv            
	//  136  280:i2f             
	//  137  281:iload           6
	//  138  283:iconst_2        
	//  139  284:idiv            
	//  140  285:i2f             
	//  141  286:invokevirtual   #378 <Method void Canvas.rotate(float, float, float)>
		Paint paint = new Paint();
	//  142  289:new             #87  <Class Paint>
	//  143  292:dup             
	//  144  293:invokespecial   #89  <Method void Paint()>
	//  145  296:astore          10
		paint.setShader(((android.graphics.Shader) (obj)));
	//  146  298:aload           10
	//  147  300:aload           8
	//  148  302:invokevirtual   #382 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//  149  305:pop             
		int k = (int)(Math.sqrt(2D) * (double)Math.max(k1, l1)) / 2;
	//  150  306:ldc2w           #366 <Double 2D>
	//  151  309:invokestatic    #371 <Method double Math.sqrt(double)>
	//  152  312:iload           5
	//  153  314:iload           6
	//  154  316:invokestatic    #365 <Method int Math.max(int, int)>
	//  155  319:i2d             
	//  156  320:dmul            
	//  157  321:d2i             
	//  158  322:iconst_2        
	//  159  323:idiv            
	//  160  324:istore_2        
		float f = -k;
	//  161  325:iload_2         
	//  162  326:ineg            
	//  163  327:i2f             
	//  164  328:fstore_1        
		canvas.drawRect(f, f, k1 + k, l1 + k, paint);
	//  165  329:aload           9
	//  166  331:fload_1         
	//  167  332:fload_1         
	//  168  333:iload           5
	//  169  335:iload_2         
	//  170  336:iadd            
	//  171  337:i2f             
	//  172  338:iload           6
	//  173  340:iload_2         
	//  174  341:iadd            
	//  175  342:i2f             
	//  176  343:aload           10
	//  177  345:invokevirtual   #386 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		return mMaskBitmap;
	//  178  348:aload_0         
	//  179  349:getfield        #321 <Field Bitmap mMaskBitmap>
	//  180  352:areturn         
	}

	private Animator getShimmerAnimation()
	{
		ValueAnimator valueanimator = mAnimator;
	//    0    0:aload_0         
	//    1    1:getfield        #390 <Field ValueAnimator mAnimator>
	//    2    4:astore          4
		if(valueanimator != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          14
			return ((Animator) (valueanimator));
	//    5   11:aload           4
	//    6   13:areturn         
		int i = getWidth();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #322 <Method int getWidth()>
	//    9   18:istore_1        
		int j = getHeight();
	//   10   19:aload_0         
	//   11   20:invokevirtual   #327 <Method int getHeight()>
	//   12   23:istore_2        
		int k = _cls3..SwitchMap.com.facebook.shimmer.ShimmerFrameLayout.MaskShape[mMask.shape.ordinal()];
	//   13   24:getstatic       #335 <Field int[] ShimmerFrameLayout$3.$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskShape>
	//   14   27:aload_0         
	//   15   28:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//   16   31:getfield        #181 <Field ShimmerFrameLayout$MaskShape ShimmerFrameLayout$Mask.shape>
	//   17   34:invokevirtual   #338 <Method int ShimmerFrameLayout$MaskShape.ordinal()>
	//   18   37:iaload          
	//   19   38:istore_3        
		switch(_cls3..SwitchMap.com.facebook.shimmer.ShimmerFrameLayout.MaskAngle[mMask.angle.ordinal()])
	//*  20   39:getstatic       #341 <Field int[] ShimmerFrameLayout$3.$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskAngle>
	//*  21   42:aload_0         
	//*  22   43:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//*  23   46:getfield        #165 <Field ShimmerFrameLayout$MaskAngle ShimmerFrameLayout$Mask.angle>
	//*  24   49:invokevirtual   #342 <Method int ShimmerFrameLayout$MaskAngle.ordinal()>
	//*  25   52:iaload          
		{
	//*  26   53:tableswitch     2 4: default 80
	//	               2 125
	//	               3 110
	//	               4 95
		default:
			mMaskTranslation.set(-i, 0, i, 0);
	//   27   80:aload_0         
	//   28   81:getfield        #228 <Field ShimmerFrameLayout$MaskTranslation mMaskTranslation>
	//   29   84:iload_1         
	//   30   85:ineg            
	//   31   86:iconst_0        
	//   32   87:iload_1         
	//   33   88:iconst_0        
	//   34   89:invokevirtual   #394 <Method void ShimmerFrameLayout$MaskTranslation.set(int, int, int, int)>
			break;

	//*  35   92:goto            137
		case 4: // '\004'
			mMaskTranslation.set(0, j, 0, -j);
	//   36   95:aload_0         
	//   37   96:getfield        #228 <Field ShimmerFrameLayout$MaskTranslation mMaskTranslation>
	//   38   99:iconst_0        
	//   39  100:iload_2         
	//   40  101:iconst_0        
	//   41  102:iload_2         
	//   42  103:ineg            
	//   43  104:invokevirtual   #394 <Method void ShimmerFrameLayout$MaskTranslation.set(int, int, int, int)>
			break;

	//*  44  107:goto            137
		case 3: // '\003'
			mMaskTranslation.set(i, 0, -i, 0);
	//   45  110:aload_0         
	//   46  111:getfield        #228 <Field ShimmerFrameLayout$MaskTranslation mMaskTranslation>
	//   47  114:iload_1         
	//   48  115:iconst_0        
	//   49  116:iload_1         
	//   50  117:ineg            
	//   51  118:iconst_0        
	//   52  119:invokevirtual   #394 <Method void ShimmerFrameLayout$MaskTranslation.set(int, int, int, int)>
			break;

	//*  53  122:goto            137
		case 2: // '\002'
			mMaskTranslation.set(0, -j, 0, j);
	//   54  125:aload_0         
	//   55  126:getfield        #228 <Field ShimmerFrameLayout$MaskTranslation mMaskTranslation>
	//   56  129:iconst_0        
	//   57  130:iload_2         
	//   58  131:ineg            
	//   59  132:iconst_0        
	//   60  133:iload_2         
	//   61  134:invokevirtual   #394 <Method void ShimmerFrameLayout$MaskTranslation.set(int, int, int, int)>
			break;
		}
		mAnimator = ValueAnimator.ofFloat(new float[] {
			0.0F, (float)mRepeatDelay / (float)mDuration + 1.0F
		});
	//   62  137:aload_0         
	//   63  138:iconst_2        
	//   64  139:newarray        float[]
	//   65  141:dup             
	//   66  142:iconst_0        
	//   67  143:fconst_0        
	//   68  144:fastore         
	//   69  145:dup             
	//   70  146:iconst_1        
	//   71  147:aload_0         
	//   72  148:getfield        #396 <Field int mRepeatDelay>
	//   73  151:i2f             
	//   74  152:aload_0         
	//   75  153:getfield        #398 <Field int mDuration>
	//   76  156:i2f             
	//   77  157:fdiv            
	//   78  158:fconst_1        
	//   79  159:fadd            
	//   80  160:fastore         
	//   81  161:invokestatic    #404 <Method ValueAnimator ValueAnimator.ofFloat(float[])>
	//   82  164:putfield        #390 <Field ValueAnimator mAnimator>
		mAnimator.setDuration(mDuration + mRepeatDelay);
	//   83  167:aload_0         
	//   84  168:getfield        #390 <Field ValueAnimator mAnimator>
	//   85  171:aload_0         
	//   86  172:getfield        #398 <Field int mDuration>
	//   87  175:aload_0         
	//   88  176:getfield        #396 <Field int mRepeatDelay>
	//   89  179:iadd            
	//   90  180:i2l             
	//   91  181:invokevirtual   #407 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   92  184:pop             
		mAnimator.setRepeatCount(mRepeatCount);
	//   93  185:aload_0         
	//   94  186:getfield        #390 <Field ValueAnimator mAnimator>
	//   95  189:aload_0         
	//   96  190:getfield        #409 <Field int mRepeatCount>
	//   97  193:invokevirtual   #410 <Method void ValueAnimator.setRepeatCount(int)>
		mAnimator.setRepeatMode(mRepeatMode);
	//   98  196:aload_0         
	//   99  197:getfield        #390 <Field ValueAnimator mAnimator>
	//  100  200:aload_0         
	//  101  201:getfield        #412 <Field int mRepeatMode>
	//  102  204:invokevirtual   #413 <Method void ValueAnimator.setRepeatMode(int)>
		mAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

			public void onAnimationUpdate(ValueAnimator valueanimator1)
			{
				float f = Math.max(0.0F, Math.min(1.0F, ((Float)valueanimator1.getAnimatedValue()).floatValue()));
			//    0    0:fconst_0        
			//    1    1:fconst_1        
			//    2    2:aload_1         
			//    3    3:invokevirtual   #29  <Method Object ValueAnimator.getAnimatedValue()>
			//    4    6:checkcast       #31  <Class Float>
			//    5    9:invokevirtual   #35  <Method float Float.floatValue()>
			//    6   12:invokestatic    #41  <Method float Math.min(float, float)>
			//    7   15:invokestatic    #44  <Method float Math.max(float, float)>
			//    8   18:fstore_2        
				valueanimator1 = ((ValueAnimator) (ShimmerFrameLayout.this));
			//    9   19:aload_0         
			//   10   20:getfield        #17  <Field ShimmerFrameLayout this$0>
			//   11   23:astore_1        
				float f1 = ((ShimmerFrameLayout) (valueanimator1)).mMaskTranslation.fromX;
			//   12   24:aload_1         
			//   13   25:invokestatic    #48  <Method ShimmerFrameLayout$MaskTranslation ShimmerFrameLayout.access$500(ShimmerFrameLayout)>
			//   14   28:getfield        #54  <Field int ShimmerFrameLayout$MaskTranslation.fromX>
			//   15   31:i2f             
			//   16   32:fstore_3        
				float f2 = 1.0F - f;
			//   17   33:fconst_1        
			//   18   34:fload_2         
			//   19   35:fsub            
			//   20   36:fstore          4
				((ShimmerFrameLayout) (valueanimator1)).setMaskOffsetX((int)(f1 * f2 + (float)mMaskTranslation.toX * f));
			//   21   38:aload_1         
			//   22   39:fload_3         
			//   23   40:fload           4
			//   24   42:fmul            
			//   25   43:aload_0         
			//   26   44:getfield        #17  <Field ShimmerFrameLayout this$0>
			//   27   47:invokestatic    #48  <Method ShimmerFrameLayout$MaskTranslation ShimmerFrameLayout.access$500(ShimmerFrameLayout)>
			//   28   50:getfield        #57  <Field int ShimmerFrameLayout$MaskTranslation.toX>
			//   29   53:i2f             
			//   30   54:fload_2         
			//   31   55:fmul            
			//   32   56:fadd            
			//   33   57:f2i             
			//   34   58:invokestatic    #61  <Method void ShimmerFrameLayout.access$600(ShimmerFrameLayout, int)>
				valueanimator1 = ((ValueAnimator) (ShimmerFrameLayout.this));
			//   35   61:aload_0         
			//   36   62:getfield        #17  <Field ShimmerFrameLayout this$0>
			//   37   65:astore_1        
				((ShimmerFrameLayout) (valueanimator1)).setMaskOffsetY((int)((float)((ShimmerFrameLayout) (valueanimator1)).mMaskTranslation.fromY * f2 + (float)mMaskTranslation.toY * f));
			//   38   66:aload_1         
			//   39   67:aload_1         
			//   40   68:invokestatic    #48  <Method ShimmerFrameLayout$MaskTranslation ShimmerFrameLayout.access$500(ShimmerFrameLayout)>
			//   41   71:getfield        #64  <Field int ShimmerFrameLayout$MaskTranslation.fromY>
			//   42   74:i2f             
			//   43   75:fload           4
			//   44   77:fmul            
			//   45   78:aload_0         
			//   46   79:getfield        #17  <Field ShimmerFrameLayout this$0>
			//   47   82:invokestatic    #48  <Method ShimmerFrameLayout$MaskTranslation ShimmerFrameLayout.access$500(ShimmerFrameLayout)>
			//   48   85:getfield        #67  <Field int ShimmerFrameLayout$MaskTranslation.toY>
			//   49   88:i2f             
			//   50   89:fload_2         
			//   51   90:fmul            
			//   52   91:fadd            
			//   53   92:f2i             
			//   54   93:invokestatic    #70  <Method void ShimmerFrameLayout.access$700(ShimmerFrameLayout, int)>
			//   55   96:return          
			}

			final ShimmerFrameLayout this$0;

			
			{
				this$0 = ShimmerFrameLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ShimmerFrameLayout this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  103  207:aload_0         
	//  104  208:getfield        #390 <Field ValueAnimator mAnimator>
	//  105  211:new             #8   <Class ShimmerFrameLayout$2>
	//  106  214:dup             
	//  107  215:aload_0         
	//  108  216:invokespecial   #414 <Method void ShimmerFrameLayout$2(ShimmerFrameLayout)>
	//  109  219:invokevirtual   #418 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		return ((Animator) (mAnimator));
	//  110  222:aload_0         
	//  111  223:getfield        #390 <Field ValueAnimator mAnimator>
	//  112  226:areturn         
	}

	private void resetAll()
	{
		stopShimmerAnimation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #421 <Method void stopShimmerAnimation()>
		resetMaskBitmap();
	//    2    4:aload_0         
	//    3    5:invokespecial   #424 <Method void resetMaskBitmap()>
		resetRenderedView();
	//    4    8:aload_0         
	//    5    9:invokespecial   #427 <Method void resetRenderedView()>
	//    6   12:return          
	}

	private void resetMaskBitmap()
	{
		Bitmap bitmap = mMaskBitmap;
	//    0    0:aload_0         
	//    1    1:getfield        #321 <Field Bitmap mMaskBitmap>
	//    2    4:astore_1        
		if(bitmap != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			bitmap.recycle();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #428 <Method void Bitmap.recycle()>
			mMaskBitmap = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #321 <Field Bitmap mMaskBitmap>
		}
	//   10   18:return          
	}

	private void resetRenderedView()
	{
		Bitmap bitmap = mRenderUnmaskBitmap;
	//    0    0:aload_0         
	//    1    1:getfield        #430 <Field Bitmap mRenderUnmaskBitmap>
	//    2    4:astore_1        
		if(bitmap != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			bitmap.recycle();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #428 <Method void Bitmap.recycle()>
			mRenderUnmaskBitmap = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #430 <Field Bitmap mRenderUnmaskBitmap>
		}
		bitmap = mRenderMaskBitmap;
	//   10   18:aload_0         
	//   11   19:getfield        #432 <Field Bitmap mRenderMaskBitmap>
	//   12   22:astore_1        
		if(bitmap != null)
	//*  13   23:aload_1         
	//*  14   24:ifnull          36
		{
			bitmap.recycle();
	//   15   27:aload_1         
	//   16   28:invokevirtual   #428 <Method void Bitmap.recycle()>
			mRenderMaskBitmap = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #432 <Field Bitmap mRenderMaskBitmap>
		}
	//   20   36:return          
	}

	private void setMaskOffsetX(int i)
	{
		if(mMaskOffsetX == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #299 <Field int mMaskOffsetX>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
		{
			return;
	//    4    8:return          
		} else
		{
			mMaskOffsetX = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #299 <Field int mMaskOffsetX>
			invalidate();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #435 <Method void invalidate()>
			return;
	//   10   18:return          
		}
	}

	private void setMaskOffsetY(int i)
	{
		if(mMaskOffsetY == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #301 <Field int mMaskOffsetY>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
		{
			return;
	//    4    8:return          
		} else
		{
			mMaskOffsetY = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #301 <Field int mMaskOffsetY>
			invalidate();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #435 <Method void invalidate()>
			return;
	//   10   18:return          
		}
	}

	private Bitmap tryCreateRenderBitmap()
	{
		OutOfMemoryError outofmemoryerror;
		int i = getWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #322 <Method int getWidth()>
	//    2    4:istore_1        
		int j = getHeight();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #327 <Method int getHeight()>
	//    5    9:istore_2        
		Object obj;
		StackTraceElement astacktraceelement[];
		try
		{
			obj = ((Object) (createBitmapAndGcIfNecessary(i, j)));
	//    6   10:iload_1         
	//    7   11:iload_2         
	//    8   12:invokestatic    #332 <Method Bitmap createBitmapAndGcIfNecessary(int, int)>
	//    9   15:astore_3        
		}
	//*  10   16:aload_3         
	//*  11   17:areturn         
	//*  12   18:new             #438 <Class StringBuilder>
	//*  13   21:dup             
	//*  14   22:ldc2            #440 <String "ShimmerFrameLayout failed to create working bitmap">
	//*  15   25:invokespecial   #443 <Method void StringBuilder(String)>
	//*  16   28:astore_3        
	//*  17   29:aload_3         
	//*  18   30:ldc2            #445 <String " (width = ">
	//*  19   33:invokevirtual   #449 <Method StringBuilder StringBuilder.append(String)>
	//*  20   36:pop             
	//*  21   37:aload_3         
	//*  22   38:iload_1         
	//*  23   39:invokevirtual   #452 <Method StringBuilder StringBuilder.append(int)>
	//*  24   42:pop             
	//*  25   43:aload_3         
	//*  26   44:ldc2            #454 <String ", height = ">
	//*  27   47:invokevirtual   #449 <Method StringBuilder StringBuilder.append(String)>
	//*  28   50:pop             
	//*  29   51:aload_3         
	//*  30   52:iload_2         
	//*  31   53:invokevirtual   #452 <Method StringBuilder StringBuilder.append(int)>
	//*  32   56:pop             
	//*  33   57:aload_3         
	//*  34   58:ldc2            #456 <String ")\n\n">
	//*  35   61:invokevirtual   #449 <Method StringBuilder StringBuilder.append(String)>
	//*  36   64:pop             
	//*  37   65:invokestatic    #462 <Method Thread Thread.currentThread()>
	//*  38   68:invokevirtual   #466 <Method StackTraceElement[] Thread.getStackTrace()>
	//*  39   71:astore          4
	//*  40   73:aload           4
	//*  41   75:arraylength     
	//*  42   76:istore_2        
	//*  43   77:iconst_0        
	//*  44   78:istore_1        
	//*  45   79:iload_1         
	//*  46   80:iload_2         
	//*  47   81:icmpge          111
	//*  48   84:aload_3         
	//*  49   85:aload           4
	//*  50   87:iload_1         
	//*  51   88:aaload          
	//*  52   89:invokevirtual   #472 <Method String StackTraceElement.toString()>
	//*  53   92:invokevirtual   #449 <Method StringBuilder StringBuilder.append(String)>
	//*  54   95:pop             
	//*  55   96:aload_3         
	//*  56   97:ldc2            #474 <String "\n">
	//*  57  100:invokevirtual   #449 <Method StringBuilder StringBuilder.append(String)>
	//*  58  103:pop             
	//*  59  104:iload_1         
	//*  60  105:iconst_1        
	//*  61  106:iadd            
	//*  62  107:istore_1        
	//*  63  108:goto            79
	//*  64  111:ldc1            #28  <String "ShimmerFrameLayout">
	//*  65  113:aload_3         
	//*  66  114:invokevirtual   #475 <Method String StringBuilder.toString()>
	//*  67  117:invokestatic    #481 <Method int Log.d(String, String)>
	//*  68  120:pop             
	//*  69  121:aconst_null     
	//*  70  122:areturn         
		// Misplaced declaration of an exception variable
		catch(OutOfMemoryError outofmemoryerror)
		{
			obj = ((Object) (new StringBuilder("ShimmerFrameLayout failed to create working bitmap")));
			((StringBuilder) (obj)).append(" (width = ");
			((StringBuilder) (obj)).append(i);
			((StringBuilder) (obj)).append(", height = ");
			((StringBuilder) (obj)).append(j);
			((StringBuilder) (obj)).append(")\n\n");
			astacktraceelement = Thread.currentThread().getStackTrace();
			j = astacktraceelement.length;
			for(i = 0; i < j; i++)
			{
				((StringBuilder) (obj)).append(astacktraceelement[i].toString());
				((StringBuilder) (obj)).append("\n");
			}

			Log.d("ShimmerFrameLayout", ((StringBuilder) (obj)).toString());
			return null;
		}
		return ((Bitmap) (obj));
	//*  71  123:astore_3        
	//*  72  124:goto            18
	}

	private Bitmap tryObtainRenderMaskBitmap()
	{
		if(mRenderMaskBitmap == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #432 <Field Bitmap mRenderMaskBitmap>
	//*   2    4:ifnonnull       15
			mRenderMaskBitmap = tryCreateRenderBitmap();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #483 <Method Bitmap tryCreateRenderBitmap()>
	//    6   12:putfield        #432 <Field Bitmap mRenderMaskBitmap>
		return mRenderMaskBitmap;
	//    7   15:aload_0         
	//    8   16:getfield        #432 <Field Bitmap mRenderMaskBitmap>
	//    9   19:areturn         
	}

	private Bitmap tryObtainRenderUnmaskBitmap()
	{
		if(mRenderUnmaskBitmap == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #430 <Field Bitmap mRenderUnmaskBitmap>
	//*   2    4:ifnonnull       15
			mRenderUnmaskBitmap = tryCreateRenderBitmap();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #483 <Method Bitmap tryCreateRenderBitmap()>
	//    6   12:putfield        #430 <Field Bitmap mRenderUnmaskBitmap>
		return mRenderUnmaskBitmap;
	//    7   15:aload_0         
	//    8   16:getfield        #430 <Field Bitmap mRenderUnmaskBitmap>
	//    9   19:areturn         
	}

	protected void dispatchDraw(Canvas canvas)
	{
		if(mAnimationStarted && getWidth() > 0 && getHeight() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #216 <Field boolean mAnimationStarted>
	//*   2    4:ifeq            31
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #322 <Method int getWidth()>
	//*   5   11:ifle            31
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #327 <Method int getHeight()>
	//*   8   18:ifgt            24
	//*   9   21:goto            31
		{
			dispatchDrawUsingBitmap(canvas);
	//   10   24:aload_0         
	//   11   25:aload_1         
	//   12   26:invokespecial   #485 <Method boolean dispatchDrawUsingBitmap(Canvas)>
	//   13   29:pop             
			return;
	//   14   30:return          
		} else
		{
			super.dispatchDraw(canvas);
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokespecial   #315 <Method void FrameLayout.dispatchDraw(Canvas)>
			return;
	//   18   36:return          
		}
	}

	public MaskAngle getAngle()
	{
		return mMask.angle;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//    2    4:getfield        #165 <Field ShimmerFrameLayout$MaskAngle ShimmerFrameLayout$Mask.angle>
	//    3    7:areturn         
	}

	public float getBaseAlpha()
	{
		return (float)mAlphaPaint.getAlpha() / 255F;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field Paint mAlphaPaint>
	//    2    4:invokevirtual   #492 <Method int Paint.getAlpha()>
	//    3    7:i2f             
	//    4    8:ldc2            #493 <Float 255F>
	//    5   11:fdiv            
	//    6   12:freturn         
	}

	public float getDropoff()
	{
		return mMask.dropoff;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//    2    4:getfield        #188 <Field float ShimmerFrameLayout$Mask.dropoff>
	//    3    7:freturn         
	}

	public int getDuration()
	{
		return mDuration;
	//    0    0:aload_0         
	//    1    1:getfield        #398 <Field int mDuration>
	//    2    4:ireturn         
	}

	public int getFixedHeight()
	{
		return mMask.fixedHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//    2    4:getfield        #197 <Field int ShimmerFrameLayout$Mask.fixedHeight>
	//    3    7:ireturn         
	}

	public int getFixedWidth()
	{
		return mMask.fixedWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//    2    4:getfield        #194 <Field int ShimmerFrameLayout$Mask.fixedWidth>
	//    3    7:ireturn         
	}

	public float getIntensity()
	{
		return mMask.intensity;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//    2    4:getfield        #200 <Field float ShimmerFrameLayout$Mask.intensity>
	//    3    7:freturn         
	}

	public MaskShape getMaskShape()
	{
		return mMask.shape;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//    2    4:getfield        #181 <Field ShimmerFrameLayout$MaskShape ShimmerFrameLayout$Mask.shape>
	//    3    7:areturn         
	}

	public float getRelativeHeight()
	{
		return mMask.relativeHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//    2    4:getfield        #206 <Field float ShimmerFrameLayout$Mask.relativeHeight>
	//    3    7:freturn         
	}

	public float getRelativeWidth()
	{
		return mMask.relativeWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//    2    4:getfield        #203 <Field float ShimmerFrameLayout$Mask.relativeWidth>
	//    3    7:freturn         
	}

	public int getRepeatCount()
	{
		return mRepeatCount;
	//    0    0:aload_0         
	//    1    1:getfield        #409 <Field int mRepeatCount>
	//    2    4:ireturn         
	}

	public int getRepeatDelay()
	{
		return mRepeatDelay;
	//    0    0:aload_0         
	//    1    1:getfield        #396 <Field int mRepeatDelay>
	//    2    4:ireturn         
	}

	public int getRepeatMode()
	{
		return mRepeatMode;
	//    0    0:aload_0         
	//    1    1:getfield        #412 <Field int mRepeatMode>
	//    2    4:ireturn         
	}

	public float getTilt()
	{
		return mMask.tilt;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//    2    4:getfield        #209 <Field float ShimmerFrameLayout$Mask.tilt>
	//    3    7:freturn         
	}

	public boolean isAnimationStarted()
	{
		return mAnimationStarted;
	//    0    0:aload_0         
	//    1    1:getfield        #216 <Field boolean mAnimationStarted>
	//    2    4:ireturn         
	}

	public boolean isAutoStart()
	{
		return mAutoStart;
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field boolean mAutoStart>
	//    2    4:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #512 <Method void FrameLayout.onAttachedToWindow()>
		if(mGlobalLayoutListener == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #514 <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//*   4    8:ifnonnull       19
			mGlobalLayoutListener = getLayoutListener();
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:invokespecial   #516 <Method android.view.ViewTreeObserver$OnGlobalLayoutListener getLayoutListener()>
	//    8   16:putfield        #514 <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
		getViewTreeObserver().addOnGlobalLayoutListener(mGlobalLayoutListener);
	//    9   19:aload_0         
	//   10   20:invokevirtual   #520 <Method ViewTreeObserver getViewTreeObserver()>
	//   11   23:aload_0         
	//   12   24:getfield        #514 <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//   13   27:invokevirtual   #526 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//   14   30:return          
	}

	protected void onDetachedFromWindow()
	{
		stopShimmerAnimation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #421 <Method void stopShimmerAnimation()>
		if(mGlobalLayoutListener != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #514 <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//*   4    8:ifnull          27
		{
			getViewTreeObserver().removeGlobalOnLayoutListener(mGlobalLayoutListener);
	//    5   11:aload_0         
	//    6   12:invokevirtual   #520 <Method ViewTreeObserver getViewTreeObserver()>
	//    7   15:aload_0         
	//    8   16:getfield        #514 <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//    9   19:invokevirtual   #530 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			mGlobalLayoutListener = null;
	//   10   22:aload_0         
	//   11   23:aconst_null     
	//   12   24:putfield        #514 <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
		}
		super.onDetachedFromWindow();
	//   13   27:aload_0         
	//   14   28:invokespecial   #532 <Method void FrameLayout.onDetachedFromWindow()>
	//   15   31:return          
	}

	public void setAngle(MaskAngle maskangle)
	{
		mMask.angle = maskangle;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//    2    4:aload_1         
	//    3    5:putfield        #165 <Field ShimmerFrameLayout$MaskAngle ShimmerFrameLayout$Mask.angle>
		resetAll();
	//    4    8:aload_0         
	//    5    9:invokespecial   #221 <Method void resetAll()>
	//    6   12:return          
	}

	public void setAutoStart(boolean flag)
	{
		mAutoStart = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #224 <Field boolean mAutoStart>
		resetAll();
	//    3    5:aload_0         
	//    4    6:invokespecial   #221 <Method void resetAll()>
	//    5    9:return          
	}

	public void setBaseAlpha(float f)
	{
		mAlphaPaint.setAlpha((int)(clamp(0.0F, 1.0F, f) * 255F));
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field Paint mAlphaPaint>
	//    2    4:fconst_0        
	//    3    5:fconst_1        
	//    4    6:fload_1         
	//    5    7:invokestatic    #536 <Method float clamp(float, float, float)>
	//    6   10:ldc2            #493 <Float 255F>
	//    7   13:fmul            
	//    8   14:f2i             
	//    9   15:invokevirtual   #539 <Method void Paint.setAlpha(int)>
		resetAll();
	//   10   18:aload_0         
	//   11   19:invokespecial   #221 <Method void resetAll()>
	//   12   22:return          
	}

	public void setDropoff(float f)
	{
		mMask.dropoff = f;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//    2    4:fload_1         
	//    3    5:putfield        #188 <Field float ShimmerFrameLayout$Mask.dropoff>
		resetAll();
	//    4    8:aload_0         
	//    5    9:invokespecial   #221 <Method void resetAll()>
	//    6   12:return          
	}

	public void setDuration(int i)
	{
		mDuration = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #398 <Field int mDuration>
		resetAll();
	//    3    5:aload_0         
	//    4    6:invokespecial   #221 <Method void resetAll()>
	//    5    9:return          
	}

	public void setFixedHeight(int i)
	{
		mMask.fixedHeight = i;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//    2    4:iload_1         
	//    3    5:putfield        #197 <Field int ShimmerFrameLayout$Mask.fixedHeight>
		resetAll();
	//    4    8:aload_0         
	//    5    9:invokespecial   #221 <Method void resetAll()>
	//    6   12:return          
	}

	public void setFixedWidth(int i)
	{
		mMask.fixedWidth = i;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//    2    4:iload_1         
	//    3    5:putfield        #194 <Field int ShimmerFrameLayout$Mask.fixedWidth>
		resetAll();
	//    4    8:aload_0         
	//    5    9:invokespecial   #221 <Method void resetAll()>
	//    6   12:return          
	}

	public void setIntensity(float f)
	{
		mMask.intensity = f;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//    2    4:fload_1         
	//    3    5:putfield        #200 <Field float ShimmerFrameLayout$Mask.intensity>
		resetAll();
	//    4    8:aload_0         
	//    5    9:invokespecial   #221 <Method void resetAll()>
	//    6   12:return          
	}

	public void setMaskShape(MaskShape maskshape)
	{
		mMask.shape = maskshape;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//    2    4:aload_1         
	//    3    5:putfield        #181 <Field ShimmerFrameLayout$MaskShape ShimmerFrameLayout$Mask.shape>
		resetAll();
	//    4    8:aload_0         
	//    5    9:invokespecial   #221 <Method void resetAll()>
	//    6   12:return          
	}

	public void setRelativeHeight(int i)
	{
		mMask.relativeHeight = i;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//    2    4:iload_1         
	//    3    5:i2f             
	//    4    6:putfield        #206 <Field float ShimmerFrameLayout$Mask.relativeHeight>
		resetAll();
	//    5    9:aload_0         
	//    6   10:invokespecial   #221 <Method void resetAll()>
	//    7   13:return          
	}

	public void setRelativeWidth(int i)
	{
		mMask.relativeWidth = i;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//    2    4:iload_1         
	//    3    5:i2f             
	//    4    6:putfield        #203 <Field float ShimmerFrameLayout$Mask.relativeWidth>
		resetAll();
	//    5    9:aload_0         
	//    6   10:invokespecial   #221 <Method void resetAll()>
	//    7   13:return          
	}

	public void setRepeatCount(int i)
	{
		mRepeatCount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #409 <Field int mRepeatCount>
		resetAll();
	//    3    5:aload_0         
	//    4    6:invokespecial   #221 <Method void resetAll()>
	//    5    9:return          
	}

	public void setRepeatDelay(int i)
	{
		mRepeatDelay = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #396 <Field int mRepeatDelay>
		resetAll();
	//    3    5:aload_0         
	//    4    6:invokespecial   #221 <Method void resetAll()>
	//    5    9:return          
	}

	public void setRepeatMode(int i)
	{
		mRepeatMode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #412 <Field int mRepeatMode>
		resetAll();
	//    3    5:aload_0         
	//    4    6:invokespecial   #221 <Method void resetAll()>
	//    5    9:return          
	}

	public void setTilt(float f)
	{
		mMask.tilt = f;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//    2    4:fload_1         
	//    3    5:putfield        #209 <Field float ShimmerFrameLayout$Mask.tilt>
		resetAll();
	//    4    8:aload_0         
	//    5    9:invokespecial   #221 <Method void resetAll()>
	//    6   12:return          
	}

	public void startShimmerAnimation()
	{
		if(mAnimationStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #216 <Field boolean mAnimationStarted>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			getShimmerAnimation().start();
	//    4    8:aload_0         
	//    5    9:invokespecial   #551 <Method Animator getShimmerAnimation()>
	//    6   12:invokevirtual   #556 <Method void Animator.start()>
			mAnimationStarted = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #216 <Field boolean mAnimationStarted>
			return;
	//   10   20:return          
		}
	}

	public void stopShimmerAnimation()
	{
		ValueAnimator valueanimator = mAnimator;
	//    0    0:aload_0         
	//    1    1:getfield        #390 <Field ValueAnimator mAnimator>
	//    2    4:astore_1        
		if(valueanimator != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          27
		{
			valueanimator.end();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #559 <Method void ValueAnimator.end()>
			mAnimator.removeAllUpdateListeners();
	//    7   13:aload_0         
	//    8   14:getfield        #390 <Field ValueAnimator mAnimator>
	//    9   17:invokevirtual   #562 <Method void ValueAnimator.removeAllUpdateListeners()>
			mAnimator.cancel();
	//   10   20:aload_0         
	//   11   21:getfield        #390 <Field ValueAnimator mAnimator>
	//   12   24:invokevirtual   #565 <Method void ValueAnimator.cancel()>
		}
		mAnimator = null;
	//   13   27:aload_0         
	//   14   28:aconst_null     
	//   15   29:putfield        #390 <Field ValueAnimator mAnimator>
		mAnimationStarted = false;
	//   16   32:aload_0         
	//   17   33:iconst_0        
	//   18   34:putfield        #216 <Field boolean mAnimationStarted>
	//   19   37:return          
	}

	public void useDefaults()
	{
		setAutoStart(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #133 <Method void setAutoStart(boolean)>
		setDuration(1000);
	//    3    5:aload_0         
	//    4    6:sipush          1000
	//    5    9:invokevirtual   #149 <Method void setDuration(int)>
		setRepeatCount(-1);
	//    6   12:aload_0         
	//    7   13:iconst_m1       
	//    8   14:invokevirtual   #152 <Method void setRepeatCount(int)>
		setRepeatDelay(0);
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #155 <Method void setRepeatDelay(int)>
		setRepeatMode(1);
	//   12   22:aload_0         
	//   13   23:iconst_1        
	//   14   24:invokevirtual   #158 <Method void setRepeatMode(int)>
		mMask.angle = MaskAngle.CW_0;
	//   15   27:aload_0         
	//   16   28:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//   17   31:getstatic       #162 <Field ShimmerFrameLayout$MaskAngle ShimmerFrameLayout$MaskAngle.CW_0>
	//   18   34:putfield        #165 <Field ShimmerFrameLayout$MaskAngle ShimmerFrameLayout$Mask.angle>
		mMask.shape = MaskShape.LINEAR;
	//   19   37:aload_0         
	//   20   38:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//   21   41:getstatic       #178 <Field ShimmerFrameLayout$MaskShape ShimmerFrameLayout$MaskShape.LINEAR>
	//   22   44:putfield        #181 <Field ShimmerFrameLayout$MaskShape ShimmerFrameLayout$Mask.shape>
		Mask mask = mMask;
	//   23   47:aload_0         
	//   24   48:getfield        #85  <Field ShimmerFrameLayout$Mask mMask>
	//   25   51:astore_1        
		mask.dropoff = 0.5F;
	//   26   52:aload_1         
	//   27   53:ldc2            #566 <Float 0.5F>
	//   28   56:putfield        #188 <Field float ShimmerFrameLayout$Mask.dropoff>
		mask.fixedWidth = 0;
	//   29   59:aload_1         
	//   30   60:iconst_0        
	//   31   61:putfield        #194 <Field int ShimmerFrameLayout$Mask.fixedWidth>
		mask.fixedHeight = 0;
	//   32   64:aload_1         
	//   33   65:iconst_0        
	//   34   66:putfield        #197 <Field int ShimmerFrameLayout$Mask.fixedHeight>
		mask.intensity = 0.0F;
	//   35   69:aload_1         
	//   36   70:fconst_0        
	//   37   71:putfield        #200 <Field float ShimmerFrameLayout$Mask.intensity>
		mask.relativeWidth = 1.0F;
	//   38   74:aload_1         
	//   39   75:fconst_1        
	//   40   76:putfield        #203 <Field float ShimmerFrameLayout$Mask.relativeWidth>
		mask.relativeHeight = 1.0F;
	//   41   79:aload_1         
	//   42   80:fconst_1        
	//   43   81:putfield        #206 <Field float ShimmerFrameLayout$Mask.relativeHeight>
		mask.tilt = 20F;
	//   44   84:aload_1         
	//   45   85:ldc2            #567 <Float 20F>
	//   46   88:putfield        #209 <Field float ShimmerFrameLayout$Mask.tilt>
		mMaskTranslation = new MaskTranslation();
	//   47   91:aload_0         
	//   48   92:new             #21  <Class ShimmerFrameLayout$MaskTranslation>
	//   49   95:dup             
	//   50   96:aconst_null     
	//   51   97:invokespecial   #568 <Method void ShimmerFrameLayout$MaskTranslation(ShimmerFrameLayout$1)>
	//   52  100:putfield        #228 <Field ShimmerFrameLayout$MaskTranslation mMaskTranslation>
		setBaseAlpha(0.3F);
	//   53  103:aload_0         
	//   54  104:ldc2            #569 <Float 0.3F>
	//   55  107:invokevirtual   #141 <Method void setBaseAlpha(float)>
		resetAll();
	//   56  110:aload_0         
	//   57  111:invokespecial   #221 <Method void resetAll()>
	//   58  114:return          
	}

	private static final PorterDuffXfermode DST_IN_PORTER_DUFF_XFERMODE;
	private static final String TAG = "ShimmerFrameLayout";
	private Paint mAlphaPaint;
	private boolean mAnimationStarted;
	protected ValueAnimator mAnimator;
	private boolean mAutoStart;
	private int mDuration;
	private android.view.ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener;
	private Mask mMask;
	protected Bitmap mMaskBitmap;
	private int mMaskOffsetX;
	private int mMaskOffsetY;
	private Paint mMaskPaint;
	private MaskTranslation mMaskTranslation;
	private Bitmap mRenderMaskBitmap;
	private Bitmap mRenderUnmaskBitmap;
	private int mRepeatCount;
	private int mRepeatDelay;
	private int mRepeatMode;

	static 
	{
		DST_IN_PORTER_DUFF_XFERMODE = new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN);
	//    0    0:new             #57  <Class PorterDuffXfermode>
	//    1    3:dup             
	//    2    4:getstatic       #63  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.DST_IN>
	//    3    7:invokespecial   #67  <Method void PorterDuffXfermode(android.graphics.PorterDuff$Mode)>
	//    4   10:putstatic       #69  <Field PorterDuffXfermode DST_IN_PORTER_DUFF_XFERMODE>
	//*   5   13:return          
	}


/*
	static boolean access$200(ShimmerFrameLayout shimmerframelayout)
	{
		return shimmerframelayout.mAnimationStarted;
	//    0    0:aload_0         
	//    1    1:getfield        #216 <Field boolean mAnimationStarted>
	//    2    4:ireturn         
	}

*/


/*
	static void access$300(ShimmerFrameLayout shimmerframelayout)
	{
		shimmerframelayout.resetAll();
	//    0    0:aload_0         
	//    1    1:invokespecial   #221 <Method void resetAll()>
		return;
	//    2    4:return          
	}

*/


/*
	static boolean access$400(ShimmerFrameLayout shimmerframelayout)
	{
		return shimmerframelayout.mAutoStart;
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field boolean mAutoStart>
	//    2    4:ireturn         
	}

*/


/*
	static MaskTranslation access$500(ShimmerFrameLayout shimmerframelayout)
	{
		return shimmerframelayout.mMaskTranslation;
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field ShimmerFrameLayout$MaskTranslation mMaskTranslation>
	//    2    4:areturn         
	}

*/


/*
	static void access$600(ShimmerFrameLayout shimmerframelayout, int i)
	{
		shimmerframelayout.setMaskOffsetX(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #233 <Method void setMaskOffsetX(int)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$700(ShimmerFrameLayout shimmerframelayout, int i)
	{
		shimmerframelayout.setMaskOffsetY(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #237 <Method void setMaskOffsetY(int)>
		return;
	//    3    5:return          
	}

*/
}
