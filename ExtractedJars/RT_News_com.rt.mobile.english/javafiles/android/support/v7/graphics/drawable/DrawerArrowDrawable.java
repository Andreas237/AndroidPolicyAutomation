// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
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


	public DrawerArrowDrawable(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Drawable()>
	//    2    4:aload_0         
	//    3    5:new             #52  <Class Paint>
	//    4    8:dup             
	//    5    9:invokespecial   #53  <Method void Paint()>
	//    6   12:putfield        #55  <Field Paint mPaint>
	//    7   15:aload_0         
	//    8   16:new             #57  <Class Path>
	//    9   19:dup             
	//   10   20:invokespecial   #58  <Method void Path()>
	//   11   23:putfield        #60  <Field Path mPath>
		mVerticalMirror = false;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #62  <Field boolean mVerticalMirror>
		mDirection = 2;
	//   15   31:aload_0         
	//   16   32:iconst_2        
	//   17   33:putfield        #64  <Field int mDirection>
		mPaint.setStyle(android.graphics.Paint.Style.STROKE);
	//   18   36:aload_0         
	//   19   37:getfield        #55  <Field Paint mPaint>
	//   20   40:getstatic       #70  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   21   43:invokevirtual   #74  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		mPaint.setStrokeJoin(android.graphics.Paint.Join.MITER);
	//   22   46:aload_0         
	//   23   47:getfield        #55  <Field Paint mPaint>
	//   24   50:getstatic       #80  <Field android.graphics.Paint$Join android.graphics.Paint$Join.MITER>
	//   25   53:invokevirtual   #84  <Method void Paint.setStrokeJoin(android.graphics.Paint$Join)>
		mPaint.setStrokeCap(android.graphics.Paint.Cap.BUTT);
	//   26   56:aload_0         
	//   27   57:getfield        #55  <Field Paint mPaint>
	//   28   60:getstatic       #90  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.BUTT>
	//   29   63:invokevirtual   #94  <Method void Paint.setStrokeCap(android.graphics.Paint$Cap)>
		mPaint.setAntiAlias(true);
	//   30   66:aload_0         
	//   31   67:getfield        #55  <Field Paint mPaint>
	//   32   70:iconst_1        
	//   33   71:invokevirtual   #98  <Method void Paint.setAntiAlias(boolean)>
		context = ((Context) (context.getTheme().obtainStyledAttributes(((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.styleable.DrawerArrowToggle, android.support.v7.appcompat.R.attr.drawerArrowStyle, android.support.v7.appcompat.R.style.Base_Widget_AppCompat_DrawerArrowToggle)));
	//   34   74:aload_1         
	//   35   75:invokevirtual   #104 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   36   78:aconst_null     
	//   37   79:getstatic       #110 <Field int[] android.support.v7.appcompat.R$styleable.DrawerArrowToggle>
	//   38   82:getstatic       #115 <Field int android.support.v7.appcompat.R$attr.drawerArrowStyle>
	//   39   85:getstatic       #120 <Field int android.support.v7.appcompat.R$style.Base_Widget_AppCompat_DrawerArrowToggle>
	//   40   88:invokevirtual   #126 <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(android.util.AttributeSet, int[], int, int)>
	//   41   91:astore_1        
		setColor(((TypedArray) (context)).getColor(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_color, 0));
	//   42   92:aload_0         
	//   43   93:aload_1         
	//   44   94:getstatic       #129 <Field int android.support.v7.appcompat.R$styleable.DrawerArrowToggle_color>
	//   45   97:iconst_0        
	//   46   98:invokevirtual   #135 <Method int TypedArray.getColor(int, int)>
	//   47  101:invokevirtual   #139 <Method void setColor(int)>
		setBarThickness(((TypedArray) (context)).getDimension(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_thickness, 0.0F));
	//   48  104:aload_0         
	//   49  105:aload_1         
	//   50  106:getstatic       #142 <Field int android.support.v7.appcompat.R$styleable.DrawerArrowToggle_thickness>
	//   51  109:fconst_0        
	//   52  110:invokevirtual   #146 <Method float TypedArray.getDimension(int, float)>
	//   53  113:invokevirtual   #150 <Method void setBarThickness(float)>
		setSpinEnabled(((TypedArray) (context)).getBoolean(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_spinBars, true));
	//   54  116:aload_0         
	//   55  117:aload_1         
	//   56  118:getstatic       #153 <Field int android.support.v7.appcompat.R$styleable.DrawerArrowToggle_spinBars>
	//   57  121:iconst_1        
	//   58  122:invokevirtual   #157 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   59  125:invokevirtual   #160 <Method void setSpinEnabled(boolean)>
		setGapSize(Math.round(((TypedArray) (context)).getDimension(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0F)));
	//   60  128:aload_0         
	//   61  129:aload_1         
	//   62  130:getstatic       #163 <Field int android.support.v7.appcompat.R$styleable.DrawerArrowToggle_gapBetweenBars>
	//   63  133:fconst_0        
	//   64  134:invokevirtual   #146 <Method float TypedArray.getDimension(int, float)>
	//   65  137:invokestatic    #167 <Method int Math.round(float)>
	//   66  140:i2f             
	//   67  141:invokevirtual   #170 <Method void setGapSize(float)>
		mSize = ((TypedArray) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_drawableSize, 0);
	//   68  144:aload_0         
	//   69  145:aload_1         
	//   70  146:getstatic       #173 <Field int android.support.v7.appcompat.R$styleable.DrawerArrowToggle_drawableSize>
	//   71  149:iconst_0        
	//   72  150:invokevirtual   #176 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   73  153:putfield        #178 <Field int mSize>
		mBarLength = Math.round(((TypedArray) (context)).getDimension(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_barLength, 0.0F));
	//   74  156:aload_0         
	//   75  157:aload_1         
	//   76  158:getstatic       #181 <Field int android.support.v7.appcompat.R$styleable.DrawerArrowToggle_barLength>
	//   77  161:fconst_0        
	//   78  162:invokevirtual   #146 <Method float TypedArray.getDimension(int, float)>
	//   79  165:invokestatic    #167 <Method int Math.round(float)>
	//   80  168:i2f             
	//   81  169:putfield        #183 <Field float mBarLength>
		mArrowHeadLength = Math.round(((TypedArray) (context)).getDimension(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_arrowHeadLength, 0.0F));
	//   82  172:aload_0         
	//   83  173:aload_1         
	//   84  174:getstatic       #186 <Field int android.support.v7.appcompat.R$styleable.DrawerArrowToggle_arrowHeadLength>
	//   85  177:fconst_0        
	//   86  178:invokevirtual   #146 <Method float TypedArray.getDimension(int, float)>
	//   87  181:invokestatic    #167 <Method int Math.round(float)>
	//   88  184:i2f             
	//   89  185:putfield        #188 <Field float mArrowHeadLength>
		mArrowShaftLength = ((TypedArray) (context)).getDimension(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_arrowShaftLength, 0.0F);
	//   90  188:aload_0         
	//   91  189:aload_1         
	//   92  190:getstatic       #191 <Field int android.support.v7.appcompat.R$styleable.DrawerArrowToggle_arrowShaftLength>
	//   93  193:fconst_0        
	//   94  194:invokevirtual   #146 <Method float TypedArray.getDimension(int, float)>
	//   95  197:putfield        #193 <Field float mArrowShaftLength>
		((TypedArray) (context)).recycle();
	//   96  200:aload_1         
	//   97  201:invokevirtual   #196 <Method void TypedArray.recycle()>
	//   98  204:return          
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
		int i;
		boolean flag1;
		int j;
		Rect rect;
		rect = getBounds();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #204 <Method Rect getBounds()>
	//    2    4:astore          17
		j = mDirection;
	//    3    6:aload_0         
	//    4    7:getfield        #64  <Field int mDirection>
	//    5   10:istore          16
		flag1 = false;
	//    6   12:iconst_0        
	//    7   13:istore          15
		i = 1;
	//    8   15:iconst_1        
	//    9   16:istore          14
		if(j == 3) goto _L2; else goto _L1
	//   10   18:iload           16
	//   11   20:iconst_3        
	//   12   21:icmpeq          70
_L1:
		boolean flag = flag1;
	//   13   24:iload           15
	//   14   26:istore          13
		j;
	//   15   28:iload           16
		JVM INSTR tableswitch 0 1: default 52
	//	               0 84
	//	               1 64;
	//   16   30:tableswitch     0 1: default 52
	//	               0 84
	//	               1 64
		   goto _L3 _L4 _L5
_L3:
		flag = flag1;
	//   17   52:iload           15
	//   18   54:istore          13
		if(DrawableCompat.getLayoutDirection(((Drawable) (this))) != 1) goto _L4; else goto _L5
	//   19   56:aload_0         
	//   20   57:invokestatic    #210 <Method int DrawableCompat.getLayoutDirection(Drawable)>
	//   21   60:iconst_1        
	//   22   61:icmpne          84
_L5:
		flag = true;
	//   23   64:iconst_1        
	//   24   65:istore          13
		break; /* Loop/switch isn't completed */
	//   25   67:goto            84
_L2:
		flag = flag1;
	//   26   70:iload           15
	//   27   72:istore          13
		if(DrawableCompat.getLayoutDirection(((Drawable) (this))) != 0) goto _L4; else goto _L5
	//   28   74:aload_0         
	//   29   75:invokestatic    #210 <Method int DrawableCompat.getLayoutDirection(Drawable)>
	//   30   78:ifne            84
	//*  31   81:goto            64
_L4:
		float f = (float)Math.sqrt(mArrowHeadLength * mArrowHeadLength * 2.0F);
	//   32   84:aload_0         
	//   33   85:getfield        #188 <Field float mArrowHeadLength>
	//   34   88:aload_0         
	//   35   89:getfield        #188 <Field float mArrowHeadLength>
	//   36   92:fmul            
	//   37   93:fconst_2        
	//   38   94:fmul            
	//   39   95:f2d             
	//   40   96:invokestatic    #213 <Method double Math.sqrt(double)>
	//   41   99:d2f             
	//   42  100:fstore          6
		float f4 = lerp(mBarLength, f, mProgress);
	//   43  102:aload_0         
	//   44  103:getfield        #183 <Field float mBarLength>
	//   45  106:fload           6
	//   46  108:aload_0         
	//   47  109:getfield        #215 <Field float mProgress>
	//   48  112:invokestatic    #217 <Method float lerp(float, float, float)>
	//   49  115:fstore          10
		float f2 = lerp(mBarLength, mArrowShaftLength, mProgress);
	//   50  117:aload_0         
	//   51  118:getfield        #183 <Field float mBarLength>
	//   52  121:aload_0         
	//   53  122:getfield        #193 <Field float mArrowShaftLength>
	//   54  125:aload_0         
	//   55  126:getfield        #215 <Field float mProgress>
	//   56  129:invokestatic    #217 <Method float lerp(float, float, float)>
	//   57  132:fstore          8
		float f3 = Math.round(lerp(0.0F, mMaxCutForBarSize, mProgress));
	//   58  134:fconst_0        
	//   59  135:aload_0         
	//   60  136:getfield        #219 <Field float mMaxCutForBarSize>
	//   61  139:aload_0         
	//   62  140:getfield        #215 <Field float mProgress>
	//   63  143:invokestatic    #217 <Method float lerp(float, float, float)>
	//   64  146:invokestatic    #167 <Method int Math.round(float)>
	//   65  149:i2f             
	//   66  150:fstore          9
		float f5 = lerp(0.0F, ARROW_HEAD_ANGLE, mProgress);
	//   67  152:fconst_0        
	//   68  153:getstatic       #45  <Field float ARROW_HEAD_ANGLE>
	//   69  156:aload_0         
	//   70  157:getfield        #215 <Field float mProgress>
	//   71  160:invokestatic    #217 <Method float lerp(float, float, float)>
	//   72  163:fstore          11
		if(flag)
	//*  73  165:iload           13
	//*  74  167:ifeq            176
			f = 0.0F;
	//   75  170:fconst_0        
	//   76  171:fstore          6
		else
	//*  77  173:goto            180
			f = -180F;
	//   78  176:ldc1            #220 <Float -180F>
	//   79  178:fstore          6
		float f1;
		if(flag)
	//*  80  180:iload           13
	//*  81  182:ifeq            192
			f1 = 180F;
	//   82  185:ldc1            #221 <Float 180F>
	//   83  187:fstore          7
		else
	//*  84  189:goto            195
			f1 = 0.0F;
	//   85  192:fconst_0        
	//   86  193:fstore          7
		f = lerp(f, f1, mProgress);
	//   87  195:fload           6
	//   88  197:fload           7
	//   89  199:aload_0         
	//   90  200:getfield        #215 <Field float mProgress>
	//   91  203:invokestatic    #217 <Method float lerp(float, float, float)>
	//   92  206:fstore          6
		double d = f4;
	//   93  208:fload           10
	//   94  210:f2d             
	//   95  211:dstore_2        
		double d1 = f5;
	//   96  212:fload           11
	//   97  214:f2d             
	//   98  215:dstore          4
		f1 = Math.round(d * Math.cos(d1));
	//   99  217:dload_2         
	//  100  218:dload           4
	//  101  220:invokestatic    #224 <Method double Math.cos(double)>
	//  102  223:dmul            
	//  103  224:invokestatic    #227 <Method long Math.round(double)>
	//  104  227:l2f             
	//  105  228:fstore          7
		f4 = Math.round(d * Math.sin(d1));
	//  106  230:dload_2         
	//  107  231:dload           4
	//  108  233:invokestatic    #230 <Method double Math.sin(double)>
	//  109  236:dmul            
	//  110  237:invokestatic    #227 <Method long Math.round(double)>
	//  111  240:l2f             
	//  112  241:fstore          10
		mPath.rewind();
	//  113  243:aload_0         
	//  114  244:getfield        #60  <Field Path mPath>
	//  115  247:invokevirtual   #233 <Method void Path.rewind()>
		f5 = lerp(mBarGap + mPaint.getStrokeWidth(), -mMaxCutForBarSize, mProgress);
	//  116  250:aload_0         
	//  117  251:getfield        #235 <Field float mBarGap>
	//  118  254:aload_0         
	//  119  255:getfield        #55  <Field Paint mPaint>
	//  120  258:invokevirtual   #239 <Method float Paint.getStrokeWidth()>
	//  121  261:fadd            
	//  122  262:aload_0         
	//  123  263:getfield        #219 <Field float mMaxCutForBarSize>
	//  124  266:fneg            
	//  125  267:aload_0         
	//  126  268:getfield        #215 <Field float mProgress>
	//  127  271:invokestatic    #217 <Method float lerp(float, float, float)>
	//  128  274:fstore          11
		float f6 = -f2 / 2.0F;
	//  129  276:fload           8
	//  130  278:fneg            
	//  131  279:fconst_2        
	//  132  280:fdiv            
	//  133  281:fstore          12
		mPath.moveTo(f6 + f3, 0.0F);
	//  134  283:aload_0         
	//  135  284:getfield        #60  <Field Path mPath>
	//  136  287:fload           12
	//  137  289:fload           9
	//  138  291:fadd            
	//  139  292:fconst_0        
	//  140  293:invokevirtual   #243 <Method void Path.moveTo(float, float)>
		mPath.rLineTo(f2 - f3 * 2.0F, 0.0F);
	//  141  296:aload_0         
	//  142  297:getfield        #60  <Field Path mPath>
	//  143  300:fload           8
	//  144  302:fload           9
	//  145  304:fconst_2        
	//  146  305:fmul            
	//  147  306:fsub            
	//  148  307:fconst_0        
	//  149  308:invokevirtual   #246 <Method void Path.rLineTo(float, float)>
		mPath.moveTo(f6, f5);
	//  150  311:aload_0         
	//  151  312:getfield        #60  <Field Path mPath>
	//  152  315:fload           12
	//  153  317:fload           11
	//  154  319:invokevirtual   #243 <Method void Path.moveTo(float, float)>
		mPath.rLineTo(f1, f4);
	//  155  322:aload_0         
	//  156  323:getfield        #60  <Field Path mPath>
	//  157  326:fload           7
	//  158  328:fload           10
	//  159  330:invokevirtual   #246 <Method void Path.rLineTo(float, float)>
		mPath.moveTo(f6, -f5);
	//  160  333:aload_0         
	//  161  334:getfield        #60  <Field Path mPath>
	//  162  337:fload           12
	//  163  339:fload           11
	//  164  341:fneg            
	//  165  342:invokevirtual   #243 <Method void Path.moveTo(float, float)>
		mPath.rLineTo(f1, -f4);
	//  166  345:aload_0         
	//  167  346:getfield        #60  <Field Path mPath>
	//  168  349:fload           7
	//  169  351:fload           10
	//  170  353:fneg            
	//  171  354:invokevirtual   #246 <Method void Path.rLineTo(float, float)>
		mPath.close();
	//  172  357:aload_0         
	//  173  358:getfield        #60  <Field Path mPath>
	//  174  361:invokevirtual   #249 <Method void Path.close()>
		canvas.save();
	//  175  364:aload_1         
	//  176  365:invokevirtual   #255 <Method int Canvas.save()>
	//  177  368:pop             
		f1 = mPaint.getStrokeWidth();
	//  178  369:aload_0         
	//  179  370:getfield        #55  <Field Paint mPaint>
	//  180  373:invokevirtual   #239 <Method float Paint.getStrokeWidth()>
	//  181  376:fstore          7
		f2 = ((int)((float)rect.height() - 3F * f1 - mBarGap * 2.0F) / 4) * 2;
	//  182  378:aload           17
	//  183  380:invokevirtual   #260 <Method int Rect.height()>
	//  184  383:i2f             
	//  185  384:ldc2            #261 <Float 3F>
	//  186  387:fload           7
	//  187  389:fmul            
	//  188  390:fsub            
	//  189  391:aload_0         
	//  190  392:getfield        #235 <Field float mBarGap>
	//  191  395:fconst_2        
	//  192  396:fmul            
	//  193  397:fsub            
	//  194  398:f2i             
	//  195  399:iconst_4        
	//  196  400:idiv            
	//  197  401:iconst_2        
	//  198  402:imul            
	//  199  403:i2f             
	//  200  404:fstore          8
		f3 = mBarGap;
	//  201  406:aload_0         
	//  202  407:getfield        #235 <Field float mBarGap>
	//  203  410:fstore          9
		canvas.translate(rect.centerX(), f2 + (f1 * 1.5F + f3));
	//  204  412:aload_1         
	//  205  413:aload           17
	//  206  415:invokevirtual   #264 <Method int Rect.centerX()>
	//  207  418:i2f             
	//  208  419:fload           8
	//  209  421:fload           7
	//  210  423:ldc2            #265 <Float 1.5F>
	//  211  426:fmul            
	//  212  427:fload           9
	//  213  429:fadd            
	//  214  430:fadd            
	//  215  431:invokevirtual   #268 <Method void Canvas.translate(float, float)>
		if(mSpin)
	//* 216  434:aload_0         
	//* 217  435:getfield        #270 <Field boolean mSpin>
	//* 218  438:ifeq            467
		{
			if(mVerticalMirror ^ flag)
	//* 219  441:aload_0         
	//* 220  442:getfield        #62  <Field boolean mVerticalMirror>
	//* 221  445:iload           13
	//* 222  447:ixor            
	//* 223  448:ifeq            454
				i = -1;
	//  224  451:iconst_m1       
	//  225  452:istore          14
			canvas.rotate(f * (float)i);
	//  226  454:aload_1         
	//  227  455:fload           6
	//  228  457:iload           14
	//  229  459:i2f             
	//  230  460:fmul            
	//  231  461:invokevirtual   #273 <Method void Canvas.rotate(float)>
		} else
	//* 232  464:goto            478
		if(flag)
	//* 233  467:iload           13
	//* 234  469:ifeq            478
			canvas.rotate(180F);
	//  235  472:aload_1         
	//  236  473:ldc1            #221 <Float 180F>
	//  237  475:invokevirtual   #273 <Method void Canvas.rotate(float)>
		canvas.drawPath(mPath, mPaint);
	//  238  478:aload_1         
	//  239  479:aload_0         
	//  240  480:getfield        #60  <Field Path mPath>
	//  241  483:aload_0         
	//  242  484:getfield        #55  <Field Paint mPaint>
	//  243  487:invokevirtual   #277 <Method void Canvas.drawPath(Path, Paint)>
		canvas.restore();
	//  244  490:aload_1         
	//  245  491:invokevirtual   #280 <Method void Canvas.restore()>
		return;
	//  246  494:return          
	}

	public float getArrowHeadLength()
	{
		return mArrowHeadLength;
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field float mArrowHeadLength>
	//    2    4:freturn         
	}

	public float getArrowShaftLength()
	{
		return mArrowShaftLength;
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field float mArrowShaftLength>
	//    2    4:freturn         
	}

	public float getBarLength()
	{
		return mBarLength;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field float mBarLength>
	//    2    4:freturn         
	}

	public float getBarThickness()
	{
		return mPaint.getStrokeWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Paint mPaint>
	//    2    4:invokevirtual   #239 <Method float Paint.getStrokeWidth()>
	//    3    7:freturn         
	}

	public int getColor()
	{
		return mPaint.getColor();
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Paint mPaint>
	//    2    4:invokevirtual   #287 <Method int Paint.getColor()>
	//    3    7:ireturn         
	}

	public int getDirection()
	{
		return mDirection;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int mDirection>
	//    2    4:ireturn         
	}

	public float getGapSize()
	{
		return mBarGap;
	//    0    0:aload_0         
	//    1    1:getfield        #235 <Field float mBarGap>
	//    2    4:freturn         
	}

	public int getIntrinsicHeight()
	{
		return mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #178 <Field int mSize>
	//    2    4:ireturn         
	}

	public int getIntrinsicWidth()
	{
		return mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #178 <Field int mSize>
	//    2    4:ireturn         
	}

	public int getOpacity()
	{
		return -3;
	//    0    0:bipush          -3
	//    1    2:ireturn         
	}

	public final Paint getPaint()
	{
		return mPaint;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Paint mPaint>
	//    2    4:areturn         
	}

	public float getProgress()
	{
		return mProgress;
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field float mProgress>
	//    2    4:freturn         
	}

	public boolean isSpinEnabled()
	{
		return mSpin;
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field boolean mSpin>
	//    2    4:ireturn         
	}

	public void setAlpha(int i)
	{
		if(i != mPaint.getAlpha())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #55  <Field Paint mPaint>
	//*   3    5:invokevirtual   #309 <Method int Paint.getAlpha()>
	//*   4    8:icmpeq          23
		{
			mPaint.setAlpha(i);
	//    5   11:aload_0         
	//    6   12:getfield        #55  <Field Paint mPaint>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #311 <Method void Paint.setAlpha(int)>
			invalidateSelf();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #314 <Method void invalidateSelf()>
		}
	//   11   23:return          
	}

	public void setArrowHeadLength(float f)
	{
		if(mArrowHeadLength != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #188 <Field float mArrowHeadLength>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mArrowHeadLength = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #188 <Field float mArrowHeadLength>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #314 <Method void invalidateSelf()>
		}
	//   10   18:return          
	}

	public void setArrowShaftLength(float f)
	{
		if(mArrowShaftLength != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #193 <Field float mArrowShaftLength>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mArrowShaftLength = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #193 <Field float mArrowShaftLength>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #314 <Method void invalidateSelf()>
		}
	//   10   18:return          
	}

	public void setBarLength(float f)
	{
		if(mBarLength != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #183 <Field float mBarLength>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mBarLength = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #183 <Field float mBarLength>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #314 <Method void invalidateSelf()>
		}
	//   10   18:return          
	}

	public void setBarThickness(float f)
	{
		if(mPaint.getStrokeWidth() != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field Paint mPaint>
	//*   2    4:invokevirtual   #239 <Method float Paint.getStrokeWidth()>
	//*   3    7:fload_1         
	//*   4    8:fcmpl           
	//*   5    9:ifeq            41
		{
			mPaint.setStrokeWidth(f);
	//    6   12:aload_0         
	//    7   13:getfield        #55  <Field Paint mPaint>
	//    8   16:fload_1         
	//    9   17:invokevirtual   #320 <Method void Paint.setStrokeWidth(float)>
			mMaxCutForBarSize = (float)((double)(f / 2.0F) * Math.cos(ARROW_HEAD_ANGLE));
	//   10   20:aload_0         
	//   11   21:fload_1         
	//   12   22:fconst_2        
	//   13   23:fdiv            
	//   14   24:f2d             
	//   15   25:getstatic       #45  <Field float ARROW_HEAD_ANGLE>
	//   16   28:f2d             
	//   17   29:invokestatic    #224 <Method double Math.cos(double)>
	//   18   32:dmul            
	//   19   33:d2f             
	//   20   34:putfield        #219 <Field float mMaxCutForBarSize>
			invalidateSelf();
	//   21   37:aload_0         
	//   22   38:invokevirtual   #314 <Method void invalidateSelf()>
		}
	//   23   41:return          
	}

	public void setColor(int i)
	{
		if(i != mPaint.getColor())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #55  <Field Paint mPaint>
	//*   3    5:invokevirtual   #287 <Method int Paint.getColor()>
	//*   4    8:icmpeq          23
		{
			mPaint.setColor(i);
	//    5   11:aload_0         
	//    6   12:getfield        #55  <Field Paint mPaint>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #321 <Method void Paint.setColor(int)>
			invalidateSelf();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #314 <Method void invalidateSelf()>
		}
	//   11   23:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		mPaint.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Paint mPaint>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #327 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//    4    8:pop             
		invalidateSelf();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #314 <Method void invalidateSelf()>
	//    7   13:return          
	}

	public void setDirection(int i)
	{
		if(i != mDirection)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #64  <Field int mDirection>
	//*   3    5:icmpeq          17
		{
			mDirection = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #64  <Field int mDirection>
			invalidateSelf();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #314 <Method void invalidateSelf()>
		}
	//    9   17:return          
	}

	public void setGapSize(float f)
	{
		if(f != mBarGap)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #235 <Field float mBarGap>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mBarGap = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #235 <Field float mBarGap>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #314 <Method void invalidateSelf()>
		}
	//   10   18:return          
	}

	public void setProgress(float f)
	{
		if(mProgress != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #215 <Field float mProgress>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mProgress = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #215 <Field float mProgress>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #314 <Method void invalidateSelf()>
		}
	//   10   18:return          
	}

	public void setSpinEnabled(boolean flag)
	{
		if(mSpin != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #270 <Field boolean mSpin>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			mSpin = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #270 <Field boolean mSpin>
			invalidateSelf();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #314 <Method void invalidateSelf()>
		}
	//    9   17:return          
	}

	public void setVerticalMirror(boolean flag)
	{
		if(mVerticalMirror != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field boolean mVerticalMirror>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			mVerticalMirror = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #62  <Field boolean mVerticalMirror>
			invalidateSelf();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #314 <Method void invalidateSelf()>
		}
	//    9   17:return          
	}

	public static final int ARROW_DIRECTION_END = 3;
	public static final int ARROW_DIRECTION_LEFT = 0;
	public static final int ARROW_DIRECTION_RIGHT = 1;
	public static final int ARROW_DIRECTION_START = 2;
	private static final float ARROW_HEAD_ANGLE = (float)Math.toRadians(45D);
	private float mArrowHeadLength;
	private float mArrowShaftLength;
	private float mBarGap;
	private float mBarLength;
	private int mDirection;
	private float mMaxCutForBarSize;
	private final Paint mPaint = new Paint();
	private final Path mPath = new Path();
	private float mProgress;
	private final int mSize;
	private boolean mSpin;
	private boolean mVerticalMirror;

	static 
	{
	//    0    0:ldc2w           #36  <Double 45D>
	//    1    3:invokestatic    #43  <Method double Math.toRadians(double)>
	//    2    6:d2f             
	//    3    7:putstatic       #45  <Field float ARROW_HEAD_ANGLE>
	//*   4   10:return          
	}
}
