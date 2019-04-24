// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.*;

// Referenced classes of package o:
//			nr, nz, me, ml

public abstract class oc
{

	public oc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void Object()>
	//    2    4:return          
	}

	public static float a(float f1)
	{
		if(d == null)
	//*   0    0:getstatic       #84  <Field DisplayMetrics d>
	//*   1    3:ifnonnull       16
		{
			Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertPixelsToDp(...). Otherwise conversion does not take place.");
	//    2    6:ldc1            #86  <String "MPChartLib-Utils">
	//    3    8:ldc1            #88  <String "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertPixelsToDp(...). Otherwise conversion does not take place.">
	//    4   10:invokestatic    #93  <Method int Log.e(String, String)>
	//    5   13:pop             
			return f1;
	//    6   14:fload_0         
	//    7   15:freturn         
		} else
		{
			return f1 / d.density;
	//    8   16:fload_0         
	//    9   17:getstatic       #84  <Field DisplayMetrics d>
	//   10   20:getfield        #98  <Field float DisplayMetrics.density>
	//   11   23:fdiv            
	//   12   24:freturn         
		}
	}

	public static float a(Paint paint)
	{
		return c(paint, g);
	//    0    0:aload_0         
	//    1    1:getstatic       #59  <Field android.graphics.Paint$FontMetrics g>
	//    2    4:invokestatic    #102 <Method float c(Paint, android.graphics.Paint$FontMetrics)>
	//    3    7:freturn         
	}

	public static int a()
	{
		return android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #108 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:ireturn         
	}

	public static nr a(Paint paint, String s)
	{
		nr nr1 = nr.c(0.0F, 0.0F);
	//    0    0:fconst_0        
	//    1    1:fconst_0        
	//    2    2:invokestatic    #114 <Method nr nr.c(float, float)>
	//    3    5:astore_2        
		e(paint, s, nr1);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokestatic    #117 <Method void e(Paint, String, nr)>
		return nr1;
	//    8   12:aload_2         
	//    9   13:areturn         
	}

	public static double b(double d1)
	{
		if(d1 == (1.0D / 0.0D))
	//*   0    0:dload_0         
	//*   1    1:ldc2w           #119 <Double (1.0D / 0.0D)>
	//*   2    4:dcmpl           
	//*   3    5:ifne            10
			return d1;
	//    4    8:dload_0         
	//    5    9:dreturn         
		d1 += 0.0D;
	//    6   10:dload_0         
	//    7   11:dconst_0        
	//    8   12:dadd            
	//    9   13:dstore_0        
		long l2 = Double.doubleToRawLongBits(d1);
	//   10   14:dload_0         
	//   11   15:invokestatic    #124 <Method long Double.doubleToRawLongBits(double)>
	//   12   18:lstore          4
		long l1;
		if(d1 >= 0.0D)
	//*  13   20:dload_0         
	//*  14   21:dconst_0        
	//*  15   22:dcmpl           
	//*  16   23:iflt            31
			l1 = 1L;
	//   17   26:lconst_1        
	//   18   27:lstore_2        
		else
	//*  19   28:goto            35
			l1 = -1L;
	//   20   31:ldc2w           #125 <Long -1L>
	//   21   34:lstore_2        
		return Double.longBitsToDouble(l2 + l1);
	//   22   35:lload           4
	//   23   37:lload_2         
	//   24   38:ladd            
	//   25   39:invokestatic    #37  <Method double Double.longBitsToDouble(long)>
	//   26   42:dreturn         
	}

	public static float b(float f1)
	{
		if(d == null)
	//*   0    0:getstatic       #84  <Field DisplayMetrics d>
	//*   1    3:ifnonnull       16
		{
			Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertDpToPixel(...). Otherwise conversion does not take place.");
	//    2    6:ldc1            #86  <String "MPChartLib-Utils">
	//    3    8:ldc1            #128 <String "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertDpToPixel(...). Otherwise conversion does not take place.">
	//    4   10:invokestatic    #93  <Method int Log.e(String, String)>
	//    5   13:pop             
			return f1;
	//    6   14:fload_0         
	//    7   15:freturn         
		} else
		{
			return d.density * f1;
	//    8   16:getstatic       #84  <Field DisplayMetrics d>
	//    9   19:getfield        #98  <Field float DisplayMetrics.density>
	//   10   22:fload_0         
	//   11   23:fmul            
	//   12   24:freturn         
		}
	}

	public static int b()
	{
		return c;
	//    0    0:getstatic       #29  <Field int c>
	//    1    3:ireturn         
	}

	public static nr b(float f1, float f2, float f3)
	{
		return nr.c(Math.abs((float)Math.cos(f3) * f1) + Math.abs((float)Math.sin(f3) * f2), Math.abs((float)Math.sin(f3) * f1) + Math.abs((float)Math.cos(f3) * f2));
	//    0    0:fload_2         
	//    1    1:f2d             
	//    2    2:invokestatic    #134 <Method double Math.cos(double)>
	//    3    5:d2f             
	//    4    6:fload_0         
	//    5    7:fmul            
	//    6    8:invokestatic    #137 <Method float Math.abs(float)>
	//    7   11:fload_2         
	//    8   12:f2d             
	//    9   13:invokestatic    #140 <Method double Math.sin(double)>
	//   10   16:d2f             
	//   11   17:fload_1         
	//   12   18:fmul            
	//   13   19:invokestatic    #137 <Method float Math.abs(float)>
	//   14   22:fadd            
	//   15   23:fload_2         
	//   16   24:f2d             
	//   17   25:invokestatic    #140 <Method double Math.sin(double)>
	//   18   28:d2f             
	//   19   29:fload_0         
	//   20   30:fmul            
	//   21   31:invokestatic    #137 <Method float Math.abs(float)>
	//   22   34:fload_2         
	//   23   35:f2d             
	//   24   36:invokestatic    #134 <Method double Math.cos(double)>
	//   25   39:d2f             
	//   26   40:fload_1         
	//   27   41:fmul            
	//   28   42:invokestatic    #137 <Method float Math.abs(float)>
	//   29   45:fadd            
	//   30   46:invokestatic    #114 <Method nr nr.c(float, float)>
	//   31   49:areturn         
	}

	public static void b(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       25
		{
			c = ViewConfiguration.getMinimumFlingVelocity();
	//    2    4:invokestatic    #146 <Method int ViewConfiguration.getMinimumFlingVelocity()>
	//    3    7:putstatic       #29  <Field int c>
			a = ViewConfiguration.getMaximumFlingVelocity();
	//    4   10:invokestatic    #149 <Method int ViewConfiguration.getMaximumFlingVelocity()>
	//    5   13:putstatic       #31  <Field int a>
			Log.e("MPChartLib-Utils", "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL");
	//    6   16:ldc1            #86  <String "MPChartLib-Utils">
	//    7   18:ldc1            #151 <String "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL">
	//    8   20:invokestatic    #93  <Method int Log.e(String, String)>
	//    9   23:pop             
			return;
	//   10   24:return          
		} else
		{
			ViewConfiguration viewconfiguration = ViewConfiguration.get(context);
	//   11   25:aload_0         
	//   12   26:invokestatic    #155 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   13   29:astore_1        
			c = viewconfiguration.getScaledMinimumFlingVelocity();
	//   14   30:aload_1         
	//   15   31:invokevirtual   #158 <Method int ViewConfiguration.getScaledMinimumFlingVelocity()>
	//   16   34:putstatic       #29  <Field int c>
			a = viewconfiguration.getScaledMaximumFlingVelocity();
	//   17   37:aload_1         
	//   18   38:invokevirtual   #161 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
	//   19   41:putstatic       #31  <Field int a>
			d = context.getResources().getDisplayMetrics();
	//   20   44:aload_0         
	//   21   45:invokevirtual   #167 <Method Resources Context.getResources()>
	//   22   48:invokevirtual   #173 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   23   51:putstatic       #84  <Field DisplayMetrics d>
			return;
	//   24   54:return          
		}
	}

	public static float c(Paint paint, android.graphics.Paint.FontMetrics fontmetrics)
	{
		paint.getFontMetrics(fontmetrics);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #179 <Method float Paint.getFontMetrics(android.graphics.Paint$FontMetrics)>
	//    3    5:pop             
		return fontmetrics.descent - fontmetrics.ascent;
	//    4    6:aload_1         
	//    5    7:getfield        #182 <Field float android.graphics.Paint$FontMetrics.descent>
	//    6   10:aload_1         
	//    7   11:getfield        #185 <Field float android.graphics.Paint$FontMetrics.ascent>
	//    8   14:fsub            
	//    9   15:freturn         
	}

	public static ml c()
	{
		return i;
	//    0    0:getstatic       #73  <Field ml i>
	//    1    3:areturn         
	}

	public static int d()
	{
		return a;
	//    0    0:getstatic       #31  <Field int a>
	//    1    3:ireturn         
	}

	public static int d(Paint paint, String s)
	{
		return (int)paint.measureText(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #190 <Method float Paint.measureText(String)>
	//    3    5:f2i             
	//    4    6:ireturn         
	}

	public static nr d(float f1, float f2, float f3)
	{
		return b(f1, f2, f3 * 0.01745329F);
	//    0    0:fload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:ldc1            #191 <Float 0.01745329F>
	//    4    5:fmul            
	//    5    6:invokestatic    #193 <Method nr b(float, float, float)>
	//    6    9:areturn         
	}

	public static void d(Canvas canvas, Drawable drawable, int j, int i1, int j1, int k1)
	{
		nz nz1 = nz.b();
	//    0    0:invokestatic    #199 <Method nz nz.b()>
	//    1    3:astore          6
		nz1.e = j - j1 / 2;
	//    2    5:aload           6
	//    3    7:iload_2         
	//    4    8:iload           4
	//    5   10:iconst_2        
	//    6   11:idiv            
	//    7   12:isub            
	//    8   13:i2f             
	//    9   14:putfield        #201 <Field float nz.e>
		nz1.c = i1 - k1 / 2;
	//   10   17:aload           6
	//   11   19:iload_3         
	//   12   20:iload           5
	//   13   22:iconst_2        
	//   14   23:idiv            
	//   15   24:isub            
	//   16   25:i2f             
	//   17   26:putfield        #203 <Field float nz.c>
		drawable.copyBounds(n);
	//   18   29:aload_1         
	//   19   30:getstatic       #75  <Field Rect n>
	//   20   33:invokevirtual   #209 <Method void Drawable.copyBounds(Rect)>
		drawable.setBounds(n.left, n.top, n.left + j1, n.top + j1);
	//   21   36:aload_1         
	//   22   37:getstatic       #75  <Field Rect n>
	//   23   40:getfield        #212 <Field int Rect.left>
	//   24   43:getstatic       #75  <Field Rect n>
	//   25   46:getfield        #215 <Field int Rect.top>
	//   26   49:getstatic       #75  <Field Rect n>
	//   27   52:getfield        #212 <Field int Rect.left>
	//   28   55:iload           4
	//   29   57:iadd            
	//   30   58:getstatic       #75  <Field Rect n>
	//   31   61:getfield        #215 <Field int Rect.top>
	//   32   64:iload           4
	//   33   66:iadd            
	//   34   67:invokevirtual   #219 <Method void Drawable.setBounds(int, int, int, int)>
		j = canvas.save();
	//   35   70:aload_0         
	//   36   71:invokevirtual   #224 <Method int Canvas.save()>
	//   37   74:istore_2        
		canvas.translate(nz1.e, nz1.c);
	//   38   75:aload_0         
	//   39   76:aload           6
	//   40   78:getfield        #201 <Field float nz.e>
	//   41   81:aload           6
	//   42   83:getfield        #203 <Field float nz.c>
	//   43   86:invokevirtual   #228 <Method void Canvas.translate(float, float)>
		drawable.draw(canvas);
	//   44   89:aload_1         
	//   45   90:aload_0         
	//   46   91:invokevirtual   #232 <Method void Drawable.draw(Canvas)>
		canvas.restoreToCount(j);
	//   47   94:aload_0         
	//   48   95:iload_2         
	//   49   96:invokevirtual   #236 <Method void Canvas.restoreToCount(int)>
	//   50   99:return          
	}

	public static void d(Canvas canvas, String s, float f1, float f2, Paint paint, nz nz1, float f3)
	{
		android.graphics.Paint.Align align;
label0:
		{
			float f7;
			float f8;
			float f9;
label1:
			{
				float f4;
				float f6;
				float f10;
label2:
				{
					f9 = paint.getFontMetrics(l);
	//    0    0:aload           4
	//    1    2:getstatic       #79  <Field android.graphics.Paint$FontMetrics l>
	//    2    5:invokevirtual   #179 <Method float Paint.getFontMetrics(android.graphics.Paint$FontMetrics)>
	//    3    8:fstore          11
					paint.getTextBounds(s, 0, s.length(), m);
	//    4   10:aload           4
	//    5   12:aload_1         
	//    6   13:iconst_0        
	//    7   14:aload_1         
	//    8   15:invokevirtual   #242 <Method int String.length()>
	//    9   18:getstatic       #77  <Field Rect m>
	//   10   21:invokevirtual   #246 <Method void Paint.getTextBounds(String, int, int, Rect)>
					f8 = 0.0F - (float)m.left;
	//   11   24:fconst_0        
	//   12   25:getstatic       #77  <Field Rect m>
	//   13   28:getfield        #212 <Field int Rect.left>
	//   14   31:i2f             
	//   15   32:fsub            
	//   16   33:fstore          10
					f7 = 0.0F + -l.ascent;
	//   17   35:fconst_0        
	//   18   36:getstatic       #79  <Field android.graphics.Paint$FontMetrics l>
	//   19   39:getfield        #185 <Field float android.graphics.Paint$FontMetrics.ascent>
	//   20   42:fneg            
	//   21   43:fadd            
	//   22   44:fstore          9
					align = paint.getTextAlign();
	//   23   46:aload           4
	//   24   48:invokevirtual   #250 <Method android.graphics.Paint$Align Paint.getTextAlign()>
	//   25   51:astore          13
					paint.setTextAlign(android.graphics.Paint.Align.LEFT);
	//   26   53:aload           4
	//   27   55:getstatic       #256 <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//   28   58:invokevirtual   #260 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
					if(f3 == 0.0F)
						break label1;
	//   29   61:fload           6
	//   30   63:fconst_0        
	//   31   64:fcmpl           
	//   32   65:ifeq            217
					f10 = m.width();
	//   33   68:getstatic       #77  <Field Rect m>
	//   34   71:invokevirtual   #263 <Method int Rect.width()>
	//   35   74:i2f             
	//   36   75:fstore          12
					if(nz1.e == 0.5F)
	//*  37   77:aload           5
	//*  38   79:getfield        #201 <Field float nz.e>
	//*  39   82:ldc2            #264 <Float 0.5F>
	//*  40   85:fcmpl           
	//*  41   86:ifne            107
					{
						f6 = f1;
	//   42   89:fload_2         
	//   43   90:fstore          8
						f4 = f2;
	//   44   92:fload_3         
	//   45   93:fstore          7
						if(nz1.c == 0.5F)
							break label2;
	//   46   95:aload           5
	//   47   97:getfield        #203 <Field float nz.c>
	//   48  100:ldc2            #264 <Float 0.5F>
	//   49  103:fcmpl           
	//   50  104:ifeq            166
					}
					nr nr1 = d(m.width(), f9, f3);
	//   51  107:getstatic       #77  <Field Rect m>
	//   52  110:invokevirtual   #263 <Method int Rect.width()>
	//   53  113:i2f             
	//   54  114:fload           11
	//   55  116:fload           6
	//   56  118:invokestatic    #266 <Method nr d(float, float, float)>
	//   57  121:astore          14
					f6 = f1 - nr1.a * (nz1.e - 0.5F);
	//   58  123:fload_2         
	//   59  124:aload           14
	//   60  126:getfield        #268 <Field float nr.a>
	//   61  129:aload           5
	//   62  131:getfield        #201 <Field float nz.e>
	//   63  134:ldc2            #264 <Float 0.5F>
	//   64  137:fsub            
	//   65  138:fmul            
	//   66  139:fsub            
	//   67  140:fstore          8
					f4 = f2 - nr1.d * (nz1.c - 0.5F);
	//   68  142:fload_3         
	//   69  143:aload           14
	//   70  145:getfield        #270 <Field float nr.d>
	//   71  148:aload           5
	//   72  150:getfield        #203 <Field float nz.c>
	//   73  153:ldc2            #264 <Float 0.5F>
	//   74  156:fsub            
	//   75  157:fmul            
	//   76  158:fsub            
	//   77  159:fstore          7
					nr.b(nr1);
	//   78  161:aload           14
	//   79  163:invokestatic    #273 <Method void nr.b(nr)>
				}
				canvas.save();
	//   80  166:aload_0         
	//   81  167:invokevirtual   #224 <Method int Canvas.save()>
	//   82  170:pop             
				canvas.translate(f6, f4);
	//   83  171:aload_0         
	//   84  172:fload           8
	//   85  174:fload           7
	//   86  176:invokevirtual   #228 <Method void Canvas.translate(float, float)>
				canvas.rotate(f3);
	//   87  179:aload_0         
	//   88  180:fload           6
	//   89  182:invokevirtual   #277 <Method void Canvas.rotate(float)>
				canvas.drawText(s, f8 - f10 * 0.5F, f7 - 0.5F * f9, paint);
	//   90  185:aload_0         
	//   91  186:aload_1         
	//   92  187:fload           10
	//   93  189:fload           12
	//   94  191:ldc2            #264 <Float 0.5F>
	//   95  194:fmul            
	//   96  195:fsub            
	//   97  196:fload           9
	//   98  198:ldc2            #264 <Float 0.5F>
	//   99  201:fload           11
	//  100  203:fmul            
	//  101  204:fsub            
	//  102  205:aload           4
	//  103  207:invokevirtual   #281 <Method void Canvas.drawText(String, float, float, Paint)>
				canvas.restore();
	//  104  210:aload_0         
	//  105  211:invokevirtual   #284 <Method void Canvas.restore()>
				break label0;
	//  106  214:goto            291
			}
			float f5;
label3:
			{
				if(nz1.e == 0.0F)
	//* 107  217:aload           5
	//* 108  219:getfield        #201 <Field float nz.e>
	//* 109  222:fconst_0        
	//* 110  223:fcmpl           
	//* 111  224:ifne            245
				{
					f5 = f8;
	//  112  227:fload           10
	//  113  229:fstore          7
					f3 = f7;
	//  114  231:fload           9
	//  115  233:fstore          6
					if(nz1.c == 0.0F)
						break label3;
	//  116  235:aload           5
	//  117  237:getfield        #203 <Field float nz.c>
	//  118  240:fconst_0        
	//  119  241:fcmpl           
	//  120  242:ifeq            276
				}
				f5 = f8 - (float)m.width() * nz1.e;
	//  121  245:fload           10
	//  122  247:getstatic       #77  <Field Rect m>
	//  123  250:invokevirtual   #263 <Method int Rect.width()>
	//  124  253:i2f             
	//  125  254:aload           5
	//  126  256:getfield        #201 <Field float nz.e>
	//  127  259:fmul            
	//  128  260:fsub            
	//  129  261:fstore          7
				f3 = f7 - nz1.c * f9;
	//  130  263:fload           9
	//  131  265:aload           5
	//  132  267:getfield        #203 <Field float nz.c>
	//  133  270:fload           11
	//  134  272:fmul            
	//  135  273:fsub            
	//  136  274:fstore          6
			}
			canvas.drawText(s, f5 + f1, f3 + f2, paint);
	//  137  276:aload_0         
	//  138  277:aload_1         
	//  139  278:fload           7
	//  140  280:fload_2         
	//  141  281:fadd            
	//  142  282:fload           6
	//  143  284:fload_3         
	//  144  285:fadd            
	//  145  286:aload           4
	//  146  288:invokevirtual   #281 <Method void Canvas.drawText(String, float, float, Paint)>
		}
		paint.setTextAlign(align);
	//  147  291:aload           4
	//  148  293:aload           13
	//  149  295:invokevirtual   #260 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
	//  150  298:return          
	}

	public static void d(MotionEvent motionevent, VelocityTracker velocitytracker)
	{
		velocitytracker.computeCurrentVelocity(1000, a);
	//    0    0:aload_1         
	//    1    1:sipush          1000
	//    2    4:getstatic       #31  <Field int a>
	//    3    7:i2f             
	//    4    8:invokevirtual   #291 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
		int i1 = motionevent.getActionIndex();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #296 <Method int MotionEvent.getActionIndex()>
	//    7   15:istore          5
		int j = motionevent.getPointerId(i1);
	//    8   17:aload_0         
	//    9   18:iload           5
	//   10   20:invokevirtual   #300 <Method int MotionEvent.getPointerId(int)>
	//   11   23:istore          4
		float f1 = velocitytracker.getXVelocity(j);
	//   12   25:aload_1         
	//   13   26:iload           4
	//   14   28:invokevirtual   #303 <Method float VelocityTracker.getXVelocity(int)>
	//   15   31:fstore_2        
		float f2 = velocitytracker.getYVelocity(j);
	//   16   32:aload_1         
	//   17   33:iload           4
	//   18   35:invokevirtual   #306 <Method float VelocityTracker.getYVelocity(int)>
	//   19   38:fstore_3        
		j = 0;
	//   20   39:iconst_0        
	//   21   40:istore          4
		for(int j1 = motionevent.getPointerCount(); j < j1; j++)
	//*  22   42:aload_0         
	//*  23   43:invokevirtual   #309 <Method int MotionEvent.getPointerCount()>
	//*  24   46:istore          6
	//*  25   48:iload           4
	//*  26   50:iload           6
	//*  27   52:icmpge          109
		{
			if(j == i1)
	//*  28   55:iload           4
	//*  29   57:iload           5
	//*  30   59:icmpne          65
				continue;
	//   31   62:goto            100
			int k1 = motionevent.getPointerId(j);
	//   32   65:aload_0         
	//   33   66:iload           4
	//   34   68:invokevirtual   #300 <Method int MotionEvent.getPointerId(int)>
	//   35   71:istore          7
			if(f1 * velocitytracker.getXVelocity(k1) + f2 * velocitytracker.getYVelocity(k1) < 0.0F)
	//*  36   73:fload_2         
	//*  37   74:aload_1         
	//*  38   75:iload           7
	//*  39   77:invokevirtual   #303 <Method float VelocityTracker.getXVelocity(int)>
	//*  40   80:fmul            
	//*  41   81:fload_3         
	//*  42   82:aload_1         
	//*  43   83:iload           7
	//*  44   85:invokevirtual   #306 <Method float VelocityTracker.getYVelocity(int)>
	//*  45   88:fmul            
	//*  46   89:fadd            
	//*  47   90:fconst_0        
	//*  48   91:fcmpg           
	//*  49   92:ifge            100
			{
				velocitytracker.clear();
	//   50   95:aload_1         
	//   51   96:invokevirtual   #312 <Method void VelocityTracker.clear()>
				return;
	//   52   99:return          
			}
		}

	//   53  100:iload           4
	//   54  102:iconst_1        
	//   55  103:iadd            
	//   56  104:istore          4
	//*  57  106:goto            48
	//   58  109:return          
	}

	public static float e(double d1)
	{
		if(Double.isInfinite(d1) || Double.isNaN(d1) || d1 == 0.0D)
	//*   0    0:dload_0         
	//*   1    1:invokestatic    #317 <Method boolean Double.isInfinite(double)>
	//*   2    4:ifne            20
	//*   3    7:dload_0         
	//*   4    8:invokestatic    #320 <Method boolean Double.isNaN(double)>
	//*   5   11:ifne            20
	//*   6   14:dload_0         
	//*   7   15:dconst_0        
	//*   8   16:dcmpl           
	//*   9   17:ifne            22
			return 0.0F;
	//   10   20:fconst_0        
	//   11   21:freturn         
		double d2;
		if(d1 < 0.0D)
	//*  12   22:dload_0         
	//*  13   23:dconst_0        
	//*  14   24:dcmpg           
	//*  15   25:ifge            34
			d2 = -d1;
	//   16   28:dload_0         
	//   17   29:dneg            
	//   18   30:dstore_2        
		else
	//*  19   31:goto            36
			d2 = d1;
	//   20   34:dload_0         
	//   21   35:dstore_2        
		float f1 = (float)Math.pow(10D, 1 - (int)(float)Math.ceil((float)Math.log10(d2)));
	//   22   36:ldc2w           #321 <Double 10D>
	//   23   39:iconst_1        
	//   24   40:dload_2         
	//   25   41:invokestatic    #325 <Method double Math.log10(double)>
	//   26   44:d2f             
	//   27   45:f2d             
	//   28   46:invokestatic    #328 <Method double Math.ceil(double)>
	//   29   49:d2f             
	//   30   50:f2i             
	//   31   51:isub            
	//   32   52:i2d             
	//   33   53:invokestatic    #332 <Method double Math.pow(double, double)>
	//   34   56:d2f             
	//   35   57:fstore          4
		return (float)Math.round((double)f1 * d1) / f1;
	//   36   59:fload           4
	//   37   61:f2d             
	//   38   62:dload_0         
	//   39   63:dmul            
	//   40   64:invokestatic    #335 <Method long Math.round(double)>
	//   41   67:l2f             
	//   42   68:fload           4
	//   43   70:fdiv            
	//   44   71:freturn         
	}

	public static float e(Paint paint)
	{
		return e(paint, g);
	//    0    0:aload_0         
	//    1    1:getstatic       #59  <Field android.graphics.Paint$FontMetrics g>
	//    2    4:invokestatic    #337 <Method float e(Paint, android.graphics.Paint$FontMetrics)>
	//    3    7:freturn         
	}

	public static float e(Paint paint, android.graphics.Paint.FontMetrics fontmetrics)
	{
		paint.getFontMetrics(fontmetrics);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #179 <Method float Paint.getFontMetrics(android.graphics.Paint$FontMetrics)>
	//    3    5:pop             
		return (fontmetrics.ascent - fontmetrics.top) + fontmetrics.bottom;
	//    4    6:aload_1         
	//    5    7:getfield        #185 <Field float android.graphics.Paint$FontMetrics.ascent>
	//    6   10:aload_1         
	//    7   11:getfield        #339 <Field float android.graphics.Paint$FontMetrics.top>
	//    8   14:fsub            
	//    9   15:aload_1         
	//   10   16:getfield        #342 <Field float android.graphics.Paint$FontMetrics.bottom>
	//   11   19:fadd            
	//   12   20:freturn         
	}

	public static int e(float f1)
	{
		f1 = e(f1);
	//    0    0:fload_0         
	//    1    1:f2d             
	//    2    2:invokestatic    #345 <Method float e(double)>
	//    3    5:fstore_0        
		if(Float.isInfinite(f1))
	//*   4    6:fload_0         
	//*   5    7:invokestatic    #348 <Method boolean Float.isInfinite(float)>
	//*   6   10:ifeq            15
			return 0;
	//    7   13:iconst_0        
	//    8   14:ireturn         
		else
			return (int)Math.ceil(-Math.log10(f1)) + 2;
	//    9   15:fload_0         
	//   10   16:f2d             
	//   11   17:invokestatic    #325 <Method double Math.log10(double)>
	//   12   20:dneg            
	//   13   21:invokestatic    #328 <Method double Math.ceil(double)>
	//   14   24:d2i             
	//   15   25:iconst_2        
	//   16   26:iadd            
	//   17   27:ireturn         
	}

	public static int e(Paint paint, String s)
	{
		Rect rect = f;
	//    0    0:getstatic       #54  <Field Rect f>
	//    1    3:astore_2        
		rect.set(0, 0, 0, 0);
	//    2    4:aload_2         
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #351 <Method void Rect.set(int, int, int, int)>
		paint.getTextBounds(s, 0, s.length(), rect);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:iconst_0        
	//   11   15:aload_1         
	//   12   16:invokevirtual   #242 <Method int String.length()>
	//   13   19:aload_2         
	//   14   20:invokevirtual   #246 <Method void Paint.getTextBounds(String, int, int, Rect)>
		return rect.height();
	//   15   23:aload_2         
	//   16   24:invokevirtual   #354 <Method int Rect.height()>
	//   17   27:ireturn         
	}

	private static ml e()
	{
		return ((ml) (new me(1)));
	//    0    0:new             #356 <Class me>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #358 <Method void me(int)>
	//    4    8:areturn         
	}

	public static void e(Paint paint, String s, nr nr1)
	{
		Rect rect = h;
	//    0    0:getstatic       #61  <Field Rect h>
	//    1    3:astore_3        
		rect.set(0, 0, 0, 0);
	//    2    4:aload_3         
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #351 <Method void Rect.set(int, int, int, int)>
		paint.getTextBounds(s, 0, s.length(), rect);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:iconst_0        
	//   11   15:aload_1         
	//   12   16:invokevirtual   #242 <Method int String.length()>
	//   13   19:aload_3         
	//   14   20:invokevirtual   #246 <Method void Paint.getTextBounds(String, int, int, Rect)>
		nr1.a = rect.width();
	//   15   23:aload_2         
	//   16   24:aload_3         
	//   17   25:invokevirtual   #263 <Method int Rect.width()>
	//   18   28:i2f             
	//   19   29:putfield        #268 <Field float nr.a>
		nr1.d = rect.height();
	//   20   32:aload_2         
	//   21   33:aload_3         
	//   22   34:invokevirtual   #354 <Method int Rect.height()>
	//   23   37:i2f             
	//   24   38:putfield        #270 <Field float nr.d>
	//   25   41:return          
	}

	public static void e(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #108 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
		{
			view.postInvalidateOnAnimation();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #367 <Method void View.postInvalidateOnAnimation()>
			return;
	//    5   12:return          
		} else
		{
			view.postInvalidateDelayed(10L);
	//    6   13:aload_0         
	//    7   14:ldc2w           #368 <Long 10L>
	//    8   17:invokevirtual   #373 <Method void View.postInvalidateDelayed(long)>
			return;
	//    9   20:return          
		}
	}

	private static int a = 8000;
	public static final float b = Float.intBitsToFloat(1);
	private static int c = 50;
	private static DisplayMetrics d;
	public static final double e = Double.longBitsToDouble(1L);
	private static Rect f = new Rect();
	private static android.graphics.Paint.FontMetrics g = new android.graphics.Paint.FontMetrics();
	private static Rect h = new Rect();
	private static ml i = e();
	private static final int k[] = {
		1, 10, 100, 1000, 10000, 0x186a0, 0xf4240, 0x989680, 0x5f5e100, 0x3b9aca00
	};
	private static android.graphics.Paint.FontMetrics l = new android.graphics.Paint.FontMetrics();
	private static Rect m = new Rect();
	private static Rect n = new Rect();

	static 
	{
	//    0    0:bipush          50
	//    1    2:putstatic       #29  <Field int c>
	//    2    5:sipush          8000
	//    3    8:putstatic       #31  <Field int a>
	//    4   11:lconst_1        
	//    5   12:invokestatic    #37  <Method double Double.longBitsToDouble(long)>
	//    6   15:putstatic       #39  <Field double e>
	//    7   18:iconst_1        
	//    8   19:invokestatic    #45  <Method float Float.intBitsToFloat(int)>
	//    9   22:putstatic       #47  <Field float b>
	//   10   25:new             #49  <Class Rect>
	//   11   28:dup             
	//   12   29:invokespecial   #52  <Method void Rect()>
	//   13   32:putstatic       #54  <Field Rect f>
	//   14   35:new             #56  <Class android.graphics.Paint$FontMetrics>
	//   15   38:dup             
	//   16   39:invokespecial   #57  <Method void android.graphics.Paint$FontMetrics()>
	//   17   42:putstatic       #59  <Field android.graphics.Paint$FontMetrics g>
	//   18   45:new             #49  <Class Rect>
	//   19   48:dup             
	//   20   49:invokespecial   #52  <Method void Rect()>
	//   21   52:putstatic       #61  <Field Rect h>
	//   22   55:bipush          10
	//   23   57:newarray        int[]
	//   24   59:dup             
	//   25   60:iconst_0        
	//   26   61:iconst_1        
	//   27   62:iastore         
	//   28   63:dup             
	//   29   64:iconst_1        
	//   30   65:bipush          10
	//   31   67:iastore         
	//   32   68:dup             
	//   33   69:iconst_2        
	//   34   70:bipush          100
	//   35   72:iastore         
	//   36   73:dup             
	//   37   74:iconst_3        
	//   38   75:sipush          1000
	//   39   78:iastore         
	//   40   79:dup             
	//   41   80:iconst_4        
	//   42   81:sipush          10000
	//   43   84:iastore         
	//   44   85:dup             
	//   45   86:iconst_5        
	//   46   87:ldc1            #62  <Int 0x186a0>
	//   47   89:iastore         
	//   48   90:dup             
	//   49   91:bipush          6
	//   50   93:ldc1            #63  <Int 0xf4240>
	//   51   95:iastore         
	//   52   96:dup             
	//   53   97:bipush          7
	//   54   99:ldc1            #64  <Int 0x989680>
	//   55  101:iastore         
	//   56  102:dup             
	//   57  103:bipush          8
	//   58  105:ldc1            #65  <Int 0x5f5e100>
	//   59  107:iastore         
	//   60  108:dup             
	//   61  109:bipush          9
	//   62  111:ldc1            #66  <Int 0x3b9aca00>
	//   63  113:iastore         
	//   64  114:putstatic       #68  <Field int[] k>
	//   65  117:invokestatic    #71  <Method ml e()>
	//   66  120:putstatic       #73  <Field ml i>
	//   67  123:new             #49  <Class Rect>
	//   68  126:dup             
	//   69  127:invokespecial   #52  <Method void Rect()>
	//   70  130:putstatic       #75  <Field Rect n>
	//   71  133:new             #49  <Class Rect>
	//   72  136:dup             
	//   73  137:invokespecial   #52  <Method void Rect()>
	//   74  140:putstatic       #77  <Field Rect m>
	//   75  143:new             #56  <Class android.graphics.Paint$FontMetrics>
	//   76  146:dup             
	//   77  147:invokespecial   #57  <Method void android.graphics.Paint$FontMetrics()>
	//   78  150:putstatic       #79  <Field android.graphics.Paint$FontMetrics l>
	//*  79  153:return          
	}
}
