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
		Rect rect = getBounds();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #204 <Method Rect getBounds()>
	//    2    4:astore          16
		int j = mDirection;
	//    3    6:aload_0         
	//    4    7:getfield        #64  <Field int mDirection>
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
	//*  18   53:invokestatic    #210 <Method int DrawableCompat.getLayoutDirection(Drawable)>
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
	//*  30   77:invokestatic    #210 <Method int DrawableCompat.getLayoutDirection(Drawable)>
	//*  31   80:ifne            86
				i = 1;
	//   32   83:iconst_1        
	//   33   84:istore          13
		}
		float f = mArrowHeadLength;
	//   34   86:aload_0         
	//   35   87:getfield        #188 <Field float mArrowHeadLength>
	//   36   90:fstore          6
		f = (float)Math.sqrt(f * f * 2.0F);
	//   37   92:fload           6
	//   38   94:fload           6
	//   39   96:fmul            
	//   40   97:fconst_2        
	//   41   98:fmul            
	//   42   99:f2d             
	//   43  100:invokestatic    #213 <Method double Math.sqrt(double)>
	//   44  103:d2f             
	//   45  104:fstore          6
		float f4 = lerp(mBarLength, f, mProgress);
	//   46  106:aload_0         
	//   47  107:getfield        #183 <Field float mBarLength>
	//   48  110:fload           6
	//   49  112:aload_0         
	//   50  113:getfield        #215 <Field float mProgress>
	//   51  116:invokestatic    #217 <Method float lerp(float, float, float)>
	//   52  119:fstore          10
		float f2 = lerp(mBarLength, mArrowShaftLength, mProgress);
	//   53  121:aload_0         
	//   54  122:getfield        #183 <Field float mBarLength>
	//   55  125:aload_0         
	//   56  126:getfield        #193 <Field float mArrowShaftLength>
	//   57  129:aload_0         
	//   58  130:getfield        #215 <Field float mProgress>
	//   59  133:invokestatic    #217 <Method float lerp(float, float, float)>
	//   60  136:fstore          8
		float f3 = Math.round(lerp(0.0F, mMaxCutForBarSize, mProgress));
	//   61  138:fconst_0        
	//   62  139:aload_0         
	//   63  140:getfield        #219 <Field float mMaxCutForBarSize>
	//   64  143:aload_0         
	//   65  144:getfield        #215 <Field float mProgress>
	//   66  147:invokestatic    #217 <Method float lerp(float, float, float)>
	//   67  150:invokestatic    #167 <Method int Math.round(float)>
	//   68  153:i2f             
	//   69  154:fstore          9
		float f5 = lerp(0.0F, ARROW_HEAD_ANGLE, mProgress);
	//   70  156:fconst_0        
	//   71  157:getstatic       #45  <Field float ARROW_HEAD_ANGLE>
	//   72  160:aload_0         
	//   73  161:getfield        #215 <Field float mProgress>
	//   74  164:invokestatic    #217 <Method float lerp(float, float, float)>
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
	//   81  180:ldc1            #220 <Float -180F>
	//   82  182:fstore          6
		float f1;
		if(i != 0)
	//*  83  184:iload           13
	//*  84  186:ifeq            196
			f1 = 180F;
	//   85  189:ldc1            #221 <Float 180F>
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
	//   93  204:getfield        #215 <Field float mProgress>
	//   94  207:invokestatic    #217 <Method float lerp(float, float, float)>
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
	//  103  223:invokestatic    #224 <Method double Math.cos(double)>
	//  104  226:dload_2         
	//  105  227:dmul            
	//  106  228:invokestatic    #227 <Method long Math.round(double)>
	//  107  231:l2f             
	//  108  232:fstore          7
		f4 = Math.round(d * Math.sin(d1));
	//  109  234:dload_2         
	//  110  235:dload           4
	//  111  237:invokestatic    #230 <Method double Math.sin(double)>
	//  112  240:dmul            
	//  113  241:invokestatic    #227 <Method long Math.round(double)>
	//  114  244:l2f             
	//  115  245:fstore          10
		mPath.rewind();
	//  116  247:aload_0         
	//  117  248:getfield        #60  <Field Path mPath>
	//  118  251:invokevirtual   #233 <Method void Path.rewind()>
		f5 = lerp(mBarGap + mPaint.getStrokeWidth(), -mMaxCutForBarSize, mProgress);
	//  119  254:aload_0         
	//  120  255:getfield        #235 <Field float mBarGap>
	//  121  258:aload_0         
	//  122  259:getfield        #55  <Field Paint mPaint>
	//  123  262:invokevirtual   #239 <Method float Paint.getStrokeWidth()>
	//  124  265:fadd            
	//  125  266:aload_0         
	//  126  267:getfield        #219 <Field float mMaxCutForBarSize>
	//  127  270:fneg            
	//  128  271:aload_0         
	//  129  272:getfield        #215 <Field float mProgress>
	//  130  275:invokestatic    #217 <Method float lerp(float, float, float)>
	//  131  278:fstore          11
		float f6 = -f2 / 2.0F;
	//  132  280:fload           8
	//  133  282:fneg            
	//  134  283:fconst_2        
	//  135  284:fdiv            
	//  136  285:fstore          12
		mPath.moveTo(f6 + f3, 0.0F);
	//  137  287:aload_0         
	//  138  288:getfield        #60  <Field Path mPath>
	//  139  291:fload           12
	//  140  293:fload           9
	//  141  295:fadd            
	//  142  296:fconst_0        
	//  143  297:invokevirtual   #243 <Method void Path.moveTo(float, float)>
		mPath.rLineTo(f2 - f3 * 2.0F, 0.0F);
	//  144  300:aload_0         
	//  145  301:getfield        #60  <Field Path mPath>
	//  146  304:fload           8
	//  147  306:fload           9
	//  148  308:fconst_2        
	//  149  309:fmul            
	//  150  310:fsub            
	//  151  311:fconst_0        
	//  152  312:invokevirtual   #246 <Method void Path.rLineTo(float, float)>
		mPath.moveTo(f6, f5);
	//  153  315:aload_0         
	//  154  316:getfield        #60  <Field Path mPath>
	//  155  319:fload           12
	//  156  321:fload           11
	//  157  323:invokevirtual   #243 <Method void Path.moveTo(float, float)>
		mPath.rLineTo(f1, f4);
	//  158  326:aload_0         
	//  159  327:getfield        #60  <Field Path mPath>
	//  160  330:fload           7
	//  161  332:fload           10
	//  162  334:invokevirtual   #246 <Method void Path.rLineTo(float, float)>
		mPath.moveTo(f6, -f5);
	//  163  337:aload_0         
	//  164  338:getfield        #60  <Field Path mPath>
	//  165  341:fload           12
	//  166  343:fload           11
	//  167  345:fneg            
	//  168  346:invokevirtual   #243 <Method void Path.moveTo(float, float)>
		mPath.rLineTo(f1, -f4);
	//  169  349:aload_0         
	//  170  350:getfield        #60  <Field Path mPath>
	//  171  353:fload           7
	//  172  355:fload           10
	//  173  357:fneg            
	//  174  358:invokevirtual   #246 <Method void Path.rLineTo(float, float)>
		mPath.close();
	//  175  361:aload_0         
	//  176  362:getfield        #60  <Field Path mPath>
	//  177  365:invokevirtual   #249 <Method void Path.close()>
		canvas.save();
	//  178  368:aload_1         
	//  179  369:invokevirtual   #255 <Method int Canvas.save()>
	//  180  372:pop             
		f1 = mPaint.getStrokeWidth();
	//  181  373:aload_0         
	//  182  374:getfield        #55  <Field Paint mPaint>
	//  183  377:invokevirtual   #239 <Method float Paint.getStrokeWidth()>
	//  184  380:fstore          7
		f3 = rect.height();
	//  185  382:aload           16
	//  186  384:invokevirtual   #260 <Method int Rect.height()>
	//  187  387:i2f             
	//  188  388:fstore          9
		f2 = mBarGap;
	//  189  390:aload_0         
	//  190  391:getfield        #235 <Field float mBarGap>
	//  191  394:fstore          8
		f3 = ((int)(f3 - 3F * f1 - 2.0F * f2) / 4) * 2;
	//  192  396:fload           9
	//  193  398:ldc2            #261 <Float 3F>
	//  194  401:fload           7
	//  195  403:fmul            
	//  196  404:fsub            
	//  197  405:fconst_2        
	//  198  406:fload           8
	//  199  408:fmul            
	//  200  409:fsub            
	//  201  410:f2i             
	//  202  411:iconst_4        
	//  203  412:idiv            
	//  204  413:iconst_2        
	//  205  414:imul            
	//  206  415:i2f             
	//  207  416:fstore          9
		canvas.translate(rect.centerX(), f3 + (f1 * 1.5F + f2));
	//  208  418:aload_1         
	//  209  419:aload           16
	//  210  421:invokevirtual   #264 <Method int Rect.centerX()>
	//  211  424:i2f             
	//  212  425:fload           9
	//  213  427:fload           7
	//  214  429:ldc2            #265 <Float 1.5F>
	//  215  432:fmul            
	//  216  433:fload           8
	//  217  435:fadd            
	//  218  436:fadd            
	//  219  437:invokevirtual   #268 <Method void Canvas.translate(float, float)>
		if(mSpin)
	//* 220  440:aload_0         
	//* 221  441:getfield        #270 <Field boolean mSpin>
	//* 222  444:ifeq            479
		{
			if((mVerticalMirror ^ i) != 0)
	//* 223  447:aload_0         
	//* 224  448:getfield        #62  <Field boolean mVerticalMirror>
	//* 225  451:iload           13
	//* 226  453:ixor            
	//* 227  454:ifeq            463
				i = -1;
	//  228  457:iconst_m1       
	//  229  458:istore          13
			else
	//* 230  460:goto            466
				i = 1;
	//  231  463:iconst_1        
	//  232  464:istore          13
			canvas.rotate(f * (float)i);
	//  233  466:aload_1         
	//  234  467:fload           6
	//  235  469:iload           13
	//  236  471:i2f             
	//  237  472:fmul            
	//  238  473:invokevirtual   #273 <Method void Canvas.rotate(float)>
		} else
	//* 239  476:goto            490
		if(i != 0)
	//* 240  479:iload           13
	//* 241  481:ifeq            490
			canvas.rotate(180F);
	//  242  484:aload_1         
	//  243  485:ldc1            #221 <Float 180F>
	//  244  487:invokevirtual   #273 <Method void Canvas.rotate(float)>
		canvas.drawPath(mPath, mPaint);
	//  245  490:aload_1         
	//  246  491:aload_0         
	//  247  492:getfield        #60  <Field Path mPath>
	//  248  495:aload_0         
	//  249  496:getfield        #55  <Field Paint mPaint>
	//  250  499:invokevirtual   #277 <Method void Canvas.drawPath(Path, Paint)>
		canvas.restore();
	//  251  502:aload_1         
	//  252  503:invokevirtual   #280 <Method void Canvas.restore()>
	//  253  506:return          
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
