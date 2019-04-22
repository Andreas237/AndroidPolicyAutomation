// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics.drawable;

import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import java.lang.annotation.Annotation;

public class DrawerArrowDrawable extends Drawable
{
	public static interface ArrowDirection
		extends Annotation
	{
	}


	private static float lerp(float f, float f1, float f2)
	{
		return f + (f1 - f) * f2;
	//    0    0:fload_0         
	//    1    1:fload_1         
	//    2    2:fload_0         
	//    3    3:fsub            
	//    4    4:fload_2         
	//    5    5:fmul            
	//    6    6:fadd            
	//    7    7:freturn         
	}

	public void draw(Canvas canvas)
	{
		Rect rect = getBounds();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #46  <Method Rect getBounds()>
	//    2    4:astore          16
		int j = mDirection;
	//    3    6:aload_0         
	//    4    7:getfield        #48  <Field int mDirection>
	//    5   10:istore          15
		boolean flag = false;
	//    6   12:iconst_0        
	//    7   13:istore          14
		int i;
		if(j != 3)
	//*   8   15:iload           15
	//*   9   17:iconst_3        
	//*  10   18:icmpeq          72
		{
			i = ((int) (flag));
	//   11   21:iload           14
	//   12   23:istore          13
			switch(j)
	//*  13   25:iload           15
			{
	//*  14   27:tableswitch     0 1: default 48
	//	               0 86
	//	               1 66
			default:
				i = ((int) (flag));
	//   15   48:iload           14
	//   16   50:istore          13
				if(DrawableCompat.getLayoutDirection(((Drawable) (this))) == 1)
	//*  17   52:aload_0         
	//*  18   53:invokestatic    #54  <Method int DrawableCompat.getLayoutDirection(Drawable)>
	//*  19   56:iconst_1        
	//*  20   57:icmpne          86
					i = 1;
	//   21   60:iconst_1        
	//   22   61:istore          13
				break;

	//*  23   63:goto            86
			case 1: // '\001'
				i = 1;
	//   24   66:iconst_1        
	//   25   67:istore          13
				break;

			case 0: // '\0'
				break;
			}
		} else
	//*  26   69:goto            86
		{
			i = ((int) (flag));
	//   27   72:iload           14
	//   28   74:istore          13
			if(DrawableCompat.getLayoutDirection(((Drawable) (this))) == 0)
	//*  29   76:aload_0         
	//*  30   77:invokestatic    #54  <Method int DrawableCompat.getLayoutDirection(Drawable)>
	//*  31   80:ifne            86
				i = 1;
	//   32   83:iconst_1        
	//   33   84:istore          13
		}
		float f = mArrowHeadLength;
	//   34   86:aload_0         
	//   35   87:getfield        #56  <Field float mArrowHeadLength>
	//   36   90:fstore          6
		f = (float)Math.sqrt(f * f * 2.0F);
	//   37   92:fload           6
	//   38   94:fload           6
	//   39   96:fmul            
	//   40   97:fconst_2        
	//   41   98:fmul            
	//   42   99:f2d             
	//   43  100:invokestatic    #59  <Method double Math.sqrt(double)>
	//   44  103:d2f             
	//   45  104:fstore          6
		float f4 = lerp(mBarLength, f, mProgress);
	//   46  106:aload_0         
	//   47  107:getfield        #61  <Field float mBarLength>
	//   48  110:fload           6
	//   49  112:aload_0         
	//   50  113:getfield        #63  <Field float mProgress>
	//   51  116:invokestatic    #65  <Method float lerp(float, float, float)>
	//   52  119:fstore          10
		float f2 = lerp(mBarLength, mArrowShaftLength, mProgress);
	//   53  121:aload_0         
	//   54  122:getfield        #61  <Field float mBarLength>
	//   55  125:aload_0         
	//   56  126:getfield        #67  <Field float mArrowShaftLength>
	//   57  129:aload_0         
	//   58  130:getfield        #63  <Field float mProgress>
	//   59  133:invokestatic    #65  <Method float lerp(float, float, float)>
	//   60  136:fstore          8
		float f3 = Math.round(lerp(0.0F, mMaxCutForBarSize, mProgress));
	//   61  138:fconst_0        
	//   62  139:aload_0         
	//   63  140:getfield        #69  <Field float mMaxCutForBarSize>
	//   64  143:aload_0         
	//   65  144:getfield        #63  <Field float mProgress>
	//   66  147:invokestatic    #65  <Method float lerp(float, float, float)>
	//   67  150:invokestatic    #73  <Method int Math.round(float)>
	//   68  153:i2f             
	//   69  154:fstore          9
		float f5 = lerp(0.0F, ARROW_HEAD_ANGLE, mProgress);
	//   70  156:fconst_0        
	//   71  157:getstatic       #37  <Field float ARROW_HEAD_ANGLE>
	//   72  160:aload_0         
	//   73  161:getfield        #63  <Field float mProgress>
	//   74  164:invokestatic    #65  <Method float lerp(float, float, float)>
	//   75  167:fstore          11
		if(i != 0)
	//*  76  169:iload           13
	//*  77  171:ifeq            180
			f = 0.0F;
	//   78  174:fconst_0        
	//   79  175:fstore          6
		else
	//*  80  177:goto            184
			f = -180F;
	//   81  180:ldc1            #74  <Float -180F>
	//   82  182:fstore          6
		float f1;
		if(i != 0)
	//*  83  184:iload           13
	//*  84  186:ifeq            196
			f1 = 180F;
	//   85  189:ldc1            #75  <Float 180F>
	//   86  191:fstore          7
		else
	//*  87  193:goto            199
			f1 = 0.0F;
	//   88  196:fconst_0        
	//   89  197:fstore          7
		f = lerp(f, f1, mProgress);
	//   90  199:fload           6
	//   91  201:fload           7
	//   92  203:aload_0         
	//   93  204:getfield        #63  <Field float mProgress>
	//   94  207:invokestatic    #65  <Method float lerp(float, float, float)>
	//   95  210:fstore          6
		double d = f4;
	//   96  212:fload           10
	//   97  214:f2d             
	//   98  215:dstore_2        
		double d1 = f5;
	//   99  216:fload           11
	//  100  218:f2d             
	//  101  219:dstore          4
		f1 = Math.round(Math.cos(d1) * d);
	//  102  221:dload           4
	//  103  223:invokestatic    #78  <Method double Math.cos(double)>
	//  104  226:dload_2         
	//  105  227:dmul            
	//  106  228:invokestatic    #81  <Method long Math.round(double)>
	//  107  231:l2f             
	//  108  232:fstore          7
		f4 = Math.round(d * Math.sin(d1));
	//  109  234:dload_2         
	//  110  235:dload           4
	//  111  237:invokestatic    #84  <Method double Math.sin(double)>
	//  112  240:dmul            
	//  113  241:invokestatic    #81  <Method long Math.round(double)>
	//  114  244:l2f             
	//  115  245:fstore          10
		mPath.rewind();
	//  116  247:aload_0         
	//  117  248:getfield        #86  <Field Path mPath>
	//  118  251:invokevirtual   #91  <Method void Path.rewind()>
		f5 = lerp(mBarGap + mPaint.getStrokeWidth(), -mMaxCutForBarSize, mProgress);
	//  119  254:aload_0         
	//  120  255:getfield        #93  <Field float mBarGap>
	//  121  258:aload_0         
	//  122  259:getfield        #95  <Field Paint mPaint>
	//  123  262:invokevirtual   #101 <Method float Paint.getStrokeWidth()>
	//  124  265:fadd            
	//  125  266:aload_0         
	//  126  267:getfield        #69  <Field float mMaxCutForBarSize>
	//  127  270:fneg            
	//  128  271:aload_0         
	//  129  272:getfield        #63  <Field float mProgress>
	//  130  275:invokestatic    #65  <Method float lerp(float, float, float)>
	//  131  278:fstore          11
		float f6 = -f2 / 2.0F;
	//  132  280:fload           8
	//  133  282:fneg            
	//  134  283:fconst_2        
	//  135  284:fdiv            
	//  136  285:fstore          12
		mPath.moveTo(f6 + f3, 0.0F);
	//  137  287:aload_0         
	//  138  288:getfield        #86  <Field Path mPath>
	//  139  291:fload           12
	//  140  293:fload           9
	//  141  295:fadd            
	//  142  296:fconst_0        
	//  143  297:invokevirtual   #105 <Method void Path.moveTo(float, float)>
		mPath.rLineTo(f2 - f3 * 2.0F, 0.0F);
	//  144  300:aload_0         
	//  145  301:getfield        #86  <Field Path mPath>
	//  146  304:fload           8
	//  147  306:fload           9
	//  148  308:fconst_2        
	//  149  309:fmul            
	//  150  310:fsub            
	//  151  311:fconst_0        
	//  152  312:invokevirtual   #108 <Method void Path.rLineTo(float, float)>
		mPath.moveTo(f6, f5);
	//  153  315:aload_0         
	//  154  316:getfield        #86  <Field Path mPath>
	//  155  319:fload           12
	//  156  321:fload           11
	//  157  323:invokevirtual   #105 <Method void Path.moveTo(float, float)>
		mPath.rLineTo(f1, f4);
	//  158  326:aload_0         
	//  159  327:getfield        #86  <Field Path mPath>
	//  160  330:fload           7
	//  161  332:fload           10
	//  162  334:invokevirtual   #108 <Method void Path.rLineTo(float, float)>
		mPath.moveTo(f6, -f5);
	//  163  337:aload_0         
	//  164  338:getfield        #86  <Field Path mPath>
	//  165  341:fload           12
	//  166  343:fload           11
	//  167  345:fneg            
	//  168  346:invokevirtual   #105 <Method void Path.moveTo(float, float)>
		mPath.rLineTo(f1, -f4);
	//  169  349:aload_0         
	//  170  350:getfield        #86  <Field Path mPath>
	//  171  353:fload           7
	//  172  355:fload           10
	//  173  357:fneg            
	//  174  358:invokevirtual   #108 <Method void Path.rLineTo(float, float)>
		mPath.close();
	//  175  361:aload_0         
	//  176  362:getfield        #86  <Field Path mPath>
	//  177  365:invokevirtual   #111 <Method void Path.close()>
		canvas.save();
	//  178  368:aload_1         
	//  179  369:invokevirtual   #117 <Method int Canvas.save()>
	//  180  372:pop             
		f1 = mPaint.getStrokeWidth();
	//  181  373:aload_0         
	//  182  374:getfield        #95  <Field Paint mPaint>
	//  183  377:invokevirtual   #101 <Method float Paint.getStrokeWidth()>
	//  184  380:fstore          7
		f3 = rect.height();
	//  185  382:aload           16
	//  186  384:invokevirtual   #122 <Method int Rect.height()>
	//  187  387:i2f             
	//  188  388:fstore          9
		f2 = mBarGap;
	//  189  390:aload_0         
	//  190  391:getfield        #93  <Field float mBarGap>
	//  191  394:fstore          8
		f3 = ((int)(f3 - 3F * f1 - 2.0F * f2) / 4) * 2;
	//  192  396:fload           9
	//  193  398:ldc1            #123 <Float 3F>
	//  194  400:fload           7
	//  195  402:fmul            
	//  196  403:fsub            
	//  197  404:fconst_2        
	//  198  405:fload           8
	//  199  407:fmul            
	//  200  408:fsub            
	//  201  409:f2i             
	//  202  410:iconst_4        
	//  203  411:idiv            
	//  204  412:iconst_2        
	//  205  413:imul            
	//  206  414:i2f             
	//  207  415:fstore          9
		canvas.translate(rect.centerX(), f3 + (f1 * 1.5F + f2));
	//  208  417:aload_1         
	//  209  418:aload           16
	//  210  420:invokevirtual   #126 <Method int Rect.centerX()>
	//  211  423:i2f             
	//  212  424:fload           9
	//  213  426:fload           7
	//  214  428:ldc1            #127 <Float 1.5F>
	//  215  430:fmul            
	//  216  431:fload           8
	//  217  433:fadd            
	//  218  434:fadd            
	//  219  435:invokevirtual   #130 <Method void Canvas.translate(float, float)>
		if(mSpin)
	//* 220  438:aload_0         
	//* 221  439:getfield        #132 <Field boolean mSpin>
	//* 222  442:ifeq            477
		{
			if((mVerticalMirror ^ i) != 0)
	//* 223  445:aload_0         
	//* 224  446:getfield        #134 <Field boolean mVerticalMirror>
	//* 225  449:iload           13
	//* 226  451:ixor            
	//* 227  452:ifeq            461
				i = -1;
	//  228  455:iconst_m1       
	//  229  456:istore          13
			else
	//* 230  458:goto            464
				i = 1;
	//  231  461:iconst_1        
	//  232  462:istore          13
			canvas.rotate(f * (float)i);
	//  233  464:aload_1         
	//  234  465:fload           6
	//  235  467:iload           13
	//  236  469:i2f             
	//  237  470:fmul            
	//  238  471:invokevirtual   #138 <Method void Canvas.rotate(float)>
		} else
	//* 239  474:goto            488
		if(i != 0)
	//* 240  477:iload           13
	//* 241  479:ifeq            488
			canvas.rotate(180F);
	//  242  482:aload_1         
	//  243  483:ldc1            #75  <Float 180F>
	//  244  485:invokevirtual   #138 <Method void Canvas.rotate(float)>
		canvas.drawPath(mPath, mPaint);
	//  245  488:aload_1         
	//  246  489:aload_0         
	//  247  490:getfield        #86  <Field Path mPath>
	//  248  493:aload_0         
	//  249  494:getfield        #95  <Field Paint mPaint>
	//  250  497:invokevirtual   #142 <Method void Canvas.drawPath(Path, Paint)>
		canvas.restore();
	//  251  500:aload_1         
	//  252  501:invokevirtual   #145 <Method void Canvas.restore()>
	//  253  504:return          
	}

	public int getIntrinsicHeight()
	{
		return mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field int mSize>
	//    2    4:ireturn         
	}

	public int getIntrinsicWidth()
	{
		return mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field int mSize>
	//    2    4:ireturn         
	}

	public int getOpacity()
	{
		return -3;
	//    0    0:bipush          -3
	//    1    2:ireturn         
	}

	public void setAlpha(int i)
	{
		if(i != mPaint.getAlpha())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #95  <Field Paint mPaint>
	//*   3    5:invokevirtual   #155 <Method int Paint.getAlpha()>
	//*   4    8:icmpeq          23
		{
			mPaint.setAlpha(i);
	//    5   11:aload_0         
	//    6   12:getfield        #95  <Field Paint mPaint>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #157 <Method void Paint.setAlpha(int)>
			invalidateSelf();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #160 <Method void invalidateSelf()>
		}
	//   11   23:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		mPaint.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field Paint mPaint>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #165 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//    4    8:pop             
		invalidateSelf();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #160 <Method void invalidateSelf()>
	//    7   13:return          
	}

	public void setProgress(float f)
	{
		if(mProgress != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field float mProgress>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mProgress = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #63  <Field float mProgress>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #160 <Method void invalidateSelf()>
		}
	//   10   18:return          
	}

	public void setVerticalMirror(boolean flag)
	{
		if(mVerticalMirror != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field boolean mVerticalMirror>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			mVerticalMirror = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #134 <Field boolean mVerticalMirror>
			invalidateSelf();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #160 <Method void invalidateSelf()>
		}
	//    9   17:return          
	}

	private static final float ARROW_HEAD_ANGLE = (float)Math.toRadians(45D);
	private float mArrowHeadLength;
	private float mArrowShaftLength;
	private float mBarGap;
	private float mBarLength;
	private int mDirection;
	private float mMaxCutForBarSize;
	private final Paint mPaint;
	private final Path mPath;
	private float mProgress;
	private final int mSize;
	private boolean mSpin;
	private boolean mVerticalMirror;

	static 
	{
	//    0    0:ldc2w           #28  <Double 45D>
	//    1    3:invokestatic    #35  <Method double Math.toRadians(double)>
	//    2    6:d2f             
	//    3    7:putstatic       #37  <Field float ARROW_HEAD_ANGLE>
	//*   4   10:return          
	}
}
