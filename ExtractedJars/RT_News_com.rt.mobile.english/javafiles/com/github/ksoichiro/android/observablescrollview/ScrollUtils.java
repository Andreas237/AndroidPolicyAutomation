// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.ksoichiro.android.observablescrollview;

import android.view.View;
import android.view.ViewTreeObserver;

public final class ScrollUtils
{

	private ScrollUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static void addOnGlobalLayoutListener(View view, Runnable runnable)
	{
		view.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener(view, runnable) {

			public void onGlobalLayout()
			{
				if(android.os.Build.VERSION.SDK_INT < 16)
			//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
			//*   1    3:bipush          16
			//*   2    5:icmpge          22
					view.getViewTreeObserver().removeGlobalOnLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
			//    3    8:aload_0         
			//    4    9:getfield        #18  <Field View val$view>
			//    5   12:invokevirtual   #37  <Method ViewTreeObserver View.getViewTreeObserver()>
			//    6   15:aload_0         
			//    7   16:invokevirtual   #43  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
				else
			//*   8   19:goto            33
					view.getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
			//    9   22:aload_0         
			//   10   23:getfield        #18  <Field View val$view>
			//   11   26:invokevirtual   #37  <Method ViewTreeObserver View.getViewTreeObserver()>
			//   12   29:aload_0         
			//   13   30:invokevirtual   #46  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
				runnable.run();
			//   14   33:aload_0         
			//   15   34:getfield        #20  <Field Runnable val$runnable>
			//   16   37:invokeinterface #51  <Method void Runnable.run()>
			//   17   42:return          
			}

			final Runnable val$runnable;
			final View val$view;

			
			{
				view = view1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field View val$view>
				runnable = runnable1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field Runnable val$runnable>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #19  <Method ViewTreeObserver View.getViewTreeObserver()>
	//    2    4:new             #6   <Class ScrollUtils$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #21  <Method void ScrollUtils$1(View, Runnable)>
	//    7   13:invokevirtual   #26  <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//    8   16:return          
	}

	public static float[] cmykFromRgb(int i)
	{
		float f = (float)((0xff0000 & i) >> 16) / 255F;
	//    0    0:ldc1            #29  <Int 0xff0000>
	//    1    2:iload_0         
	//    2    3:iand            
	//    3    4:bipush          16
	//    4    6:ishr            
	//    5    7:i2f             
	//    6    8:ldc1            #30  <Float 255F>
	//    7   10:fdiv            
	//    8   11:fstore_1        
		float f2 = 1.0F;
	//    9   12:fconst_1        
	//   10   13:fstore_3        
		f = 1.0F - f;
	//   11   14:fconst_1        
	//   12   15:fload_1         
	//   13   16:fsub            
	//   14   17:fstore_1        
		float f1 = 1.0F - (float)((0xff00 & i) >> 8) / 255F;
	//   15   18:fconst_1        
	//   16   19:ldc1            #31  <Int 65280>
	//   17   21:iload_0         
	//   18   22:iand            
	//   19   23:bipush          8
	//   20   25:ishr            
	//   21   26:i2f             
	//   22   27:ldc1            #30  <Float 255F>
	//   23   29:fdiv            
	//   24   30:fsub            
	//   25   31:fstore_2        
		float f4 = 1.0F - (float)(i & 0xff) / 255F;
	//   26   32:fconst_1        
	//   27   33:iload_0         
	//   28   34:sipush          255
	//   29   37:iand            
	//   30   38:i2f             
	//   31   39:ldc1            #30  <Float 255F>
	//   32   41:fdiv            
	//   33   42:fsub            
	//   34   43:fstore          5
		float f3 = Math.min(f, Math.min(f1, f4));
	//   35   45:fload_1         
	//   36   46:fload_2         
	//   37   47:fload           5
	//   38   49:invokestatic    #37  <Method float Math.min(float, float)>
	//   39   52:invokestatic    #37  <Method float Math.min(float, float)>
	//   40   55:fstore          4
		if(f3 != 1.0F)
	//*  41   57:fload           4
	//*  42   59:fconst_1        
	//*  43   60:fcmpl           
	//*  44   61:ifeq            94
		{
			f2 = 1.0F - f3;
	//   45   64:fconst_1        
	//   46   65:fload           4
	//   47   67:fsub            
	//   48   68:fstore_3        
			f = (f - f3) / f2;
	//   49   69:fload_1         
	//   50   70:fload           4
	//   51   72:fsub            
	//   52   73:fload_3         
	//   53   74:fdiv            
	//   54   75:fstore_1        
			f1 = (f1 - f3) / f2;
	//   55   76:fload_2         
	//   56   77:fload           4
	//   57   79:fsub            
	//   58   80:fload_3         
	//   59   81:fdiv            
	//   60   82:fstore_2        
			f2 = (f4 - f3) / f2;
	//   61   83:fload           5
	//   62   85:fload           4
	//   63   87:fsub            
	//   64   88:fload_3         
	//   65   89:fdiv            
	//   66   90:fstore_3        
		} else
	//*  67   91:goto            98
		{
			f = 1.0F;
	//   68   94:fconst_1        
	//   69   95:fstore_1        
			f1 = f;
	//   70   96:fload_1         
	//   71   97:fstore_2        
		}
		return (new float[] {
			f, f1, f2, f3
		});
	//   72   98:iconst_4        
	//   73   99:newarray        float[]
	//   74  101:dup             
	//   75  102:iconst_0        
	//   76  103:fload_1         
	//   77  104:fastore         
	//   78  105:dup             
	//   79  106:iconst_1        
	//   80  107:fload_2         
	//   81  108:fastore         
	//   82  109:dup             
	//   83  110:iconst_2        
	//   84  111:fload_3         
	//   85  112:fastore         
	//   86  113:dup             
	//   87  114:iconst_3        
	//   88  115:fload           4
	//   89  117:fastore         
	//   90  118:areturn         
	}

	public static int getColorWithAlpha(float f, int i)
	{
		return (Math.min(255, Math.max(0, (int)(f * 255F))) << 24) + (i & 0xffffff);
	//    0    0:sipush          255
	//    1    3:iconst_0        
	//    2    4:fload_0         
	//    3    5:ldc1            #30  <Float 255F>
	//    4    7:fmul            
	//    5    8:f2i             
	//    6    9:invokestatic    #43  <Method int Math.max(int, int)>
	//    7   12:invokestatic    #45  <Method int Math.min(int, int)>
	//    8   15:bipush          24
	//    9   17:ishl            
	//   10   18:iload_1         
	//   11   19:ldc1            #46  <Int 0xffffff>
	//   12   21:iand            
	//   13   22:iadd            
	//   14   23:ireturn         
	}

	public static float getFloat(float f, float f1, float f2)
	{
		return Math.min(f2, Math.max(f1, f));
	//    0    0:fload_2         
	//    1    1:fload_1         
	//    2    2:fload_0         
	//    3    3:invokestatic    #50  <Method float Math.max(float, float)>
	//    4    6:invokestatic    #37  <Method float Math.min(float, float)>
	//    5    9:freturn         
	}

	public static int mixColors(int i, int j, float f)
	{
		float af[] = cmykFromRgb(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #54  <Method float[] cmykFromRgb(int)>
	//    2    4:astore_3        
		float af1[] = cmykFromRgb(j);
	//    3    5:iload_1         
	//    4    6:invokestatic    #54  <Method float[] cmykFromRgb(int)>
	//    5    9:astore          4
		float af2[] = new float[4];
	//    6   11:iconst_4        
	//    7   12:newarray        float[]
	//    8   14:astore          5
		for(i = 0; i < 4; i++)
	//*   9   16:iconst_0        
	//*  10   17:istore_0        
	//*  11   18:iload_0         
	//*  12   19:iconst_4        
	//*  13   20:icmpge          52
			af2[i] = Math.min(1.0F, af[i] * (1.0F - f) + af1[i] * f);
	//   14   23:aload           5
	//   15   25:iload_0         
	//   16   26:fconst_1        
	//   17   27:aload_3         
	//   18   28:iload_0         
	//   19   29:faload          
	//   20   30:fconst_1        
	//   21   31:fload_2         
	//   22   32:fsub            
	//   23   33:fmul            
	//   24   34:aload           4
	//   25   36:iload_0         
	//   26   37:faload          
	//   27   38:fload_2         
	//   28   39:fmul            
	//   29   40:fadd            
	//   30   41:invokestatic    #37  <Method float Math.min(float, float)>
	//   31   44:fastore         

	//   32   45:iload_0         
	//   33   46:iconst_1        
	//   34   47:iadd            
	//   35   48:istore_0        
	//*  36   49:goto            18
		return 0xff000000 + (0xffffff & rgbFromCmyk(af2));
	//   37   52:ldc1            #55  <Int 0xff000000>
	//   38   54:ldc1            #46  <Int 0xffffff>
	//   39   56:aload           5
	//   40   58:invokestatic    #59  <Method int rgbFromCmyk(float[])>
	//   41   61:iand            
	//   42   62:iadd            
	//   43   63:ireturn         
	}

	public static int rgbFromCmyk(float af[])
	{
		float f = af[0];
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:faload          
	//    3    3:fstore_1        
		float f1 = af[1];
	//    4    4:aload_0         
	//    5    5:iconst_1        
	//    6    6:faload          
	//    7    7:fstore_2        
		float f2 = af[2];
	//    8    8:aload_0         
	//    9    9:iconst_2        
	//   10   10:faload          
	//   11   11:fstore_3        
		float f3 = af[3];
	//   12   12:aload_0         
	//   13   13:iconst_3        
	//   14   14:faload          
	//   15   15:fstore          4
		float f4 = 1.0F - f3;
	//   16   17:fconst_1        
	//   17   18:fload           4
	//   18   20:fsub            
	//   19   21:fstore          5
		return (((int)((1.0F - Math.min(1.0F, f * f4 + f3)) * 255F) & 0xff) << 16) + (((int)((1.0F - Math.min(1.0F, f1 * f4 + f3)) * 255F) & 0xff) << 8) + ((int)((1.0F - Math.min(1.0F, f2 * f4 + f3)) * 255F) & 0xff);
	//   20   23:fconst_1        
	//   21   24:fconst_1        
	//   22   25:fload_1         
	//   23   26:fload           5
	//   24   28:fmul            
	//   25   29:fload           4
	//   26   31:fadd            
	//   27   32:invokestatic    #37  <Method float Math.min(float, float)>
	//   28   35:fsub            
	//   29   36:ldc1            #30  <Float 255F>
	//   30   38:fmul            
	//   31   39:f2i             
	//   32   40:sipush          255
	//   33   43:iand            
	//   34   44:bipush          16
	//   35   46:ishl            
	//   36   47:fconst_1        
	//   37   48:fconst_1        
	//   38   49:fload_2         
	//   39   50:fload           5
	//   40   52:fmul            
	//   41   53:fload           4
	//   42   55:fadd            
	//   43   56:invokestatic    #37  <Method float Math.min(float, float)>
	//   44   59:fsub            
	//   45   60:ldc1            #30  <Float 255F>
	//   46   62:fmul            
	//   47   63:f2i             
	//   48   64:sipush          255
	//   49   67:iand            
	//   50   68:bipush          8
	//   51   70:ishl            
	//   52   71:iadd            
	//   53   72:fconst_1        
	//   54   73:fconst_1        
	//   55   74:fload_3         
	//   56   75:fload           5
	//   57   77:fmul            
	//   58   78:fload           4
	//   59   80:fadd            
	//   60   81:invokestatic    #37  <Method float Math.min(float, float)>
	//   61   84:fsub            
	//   62   85:ldc1            #30  <Float 255F>
	//   63   87:fmul            
	//   64   88:f2i             
	//   65   89:sipush          255
	//   66   92:iand            
	//   67   93:iadd            
	//   68   94:ireturn         
	}
}
