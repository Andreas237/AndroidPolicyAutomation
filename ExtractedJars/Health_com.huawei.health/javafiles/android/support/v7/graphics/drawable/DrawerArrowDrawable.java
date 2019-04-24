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
		return (f1 - f) * f2 + f;
	//    0    0:fload_1         
	//    1    1:fload_0         
	//    2    2:fsub            
	//    3    3:fload_2         
	//    4    4:fmul            
	//    5    5:fload_0         
	//    6    6:fadd            
	//    7    7:freturn         
	}

	public void draw(Canvas canvas)
	{
		Rect rect = getBounds();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #204 <Method Rect getBounds()>
	//    2    4:astore          10
		int i;
		switch(mDirection)
	//*   3    6:aload_0         
	//*   4    7:getfield        #64  <Field int mDirection>
		{
	//*   5   10:tableswitch     0 3: default 40
	//	               0 43
	//	               1 49
	//	               2 74
	//	               3 55
	//*   6   40:goto            74
		case 0: // '\0'
			i = 0;
	//    7   43:iconst_0        
	//    8   44:istore          9
			break;
	//    9   46:goto            91

		case 1: // '\001'
			i = 1;
	//   10   49:iconst_1        
	//   11   50:istore          9
			break;
	//   12   52:goto            91

		case 3: // '\003'
			if(DrawableCompat.getLayoutDirection(((Drawable) (this))) == 0)
	//*  13   55:aload_0         
	//*  14   56:invokestatic    #210 <Method int DrawableCompat.getLayoutDirection(Drawable)>
	//*  15   59:ifne            68
				i = 1;
	//   16   62:iconst_1        
	//   17   63:istore          9
			else
	//*  18   65:goto            71
				i = 0;
	//   19   68:iconst_0        
	//   20   69:istore          9
			break;
	//   21   71:goto            91

		case 2: // '\002'
		default:
			if(DrawableCompat.getLayoutDirection(((Drawable) (this))) == 1)
	//*  22   74:aload_0         
	//*  23   75:invokestatic    #210 <Method int DrawableCompat.getLayoutDirection(Drawable)>
	//*  24   78:iconst_1        
	//*  25   79:icmpne          88
				i = 1;
	//   26   82:iconst_1        
	//   27   83:istore          9
			else
	//*  28   85:goto            91
				i = 0;
	//   29   88:iconst_0        
	//   30   89:istore          9
			break;
		}
		float f = (float)Math.sqrt(mArrowHeadLength * mArrowHeadLength * 2.0F);
	//   31   91:aload_0         
	//   32   92:getfield        #188 <Field float mArrowHeadLength>
	//   33   95:aload_0         
	//   34   96:getfield        #188 <Field float mArrowHeadLength>
	//   35   99:fmul            
	//   36  100:fconst_2        
	//   37  101:fmul            
	//   38  102:f2d             
	//   39  103:invokestatic    #213 <Method double Math.sqrt(double)>
	//   40  106:d2f             
	//   41  107:fstore_2        
		float f4 = lerp(mBarLength, f, mProgress);
	//   42  108:aload_0         
	//   43  109:getfield        #183 <Field float mBarLength>
	//   44  112:fload_2         
	//   45  113:aload_0         
	//   46  114:getfield        #215 <Field float mProgress>
	//   47  117:invokestatic    #217 <Method float lerp(float, float, float)>
	//   48  120:fstore          6
		float f2 = lerp(mBarLength, mArrowShaftLength, mProgress);
	//   49  122:aload_0         
	//   50  123:getfield        #183 <Field float mBarLength>
	//   51  126:aload_0         
	//   52  127:getfield        #193 <Field float mArrowShaftLength>
	//   53  130:aload_0         
	//   54  131:getfield        #215 <Field float mProgress>
	//   55  134:invokestatic    #217 <Method float lerp(float, float, float)>
	//   56  137:fstore          4
		float f3 = Math.round(lerp(0.0F, mMaxCutForBarSize, mProgress));
	//   57  139:fconst_0        
	//   58  140:aload_0         
	//   59  141:getfield        #219 <Field float mMaxCutForBarSize>
	//   60  144:aload_0         
	//   61  145:getfield        #215 <Field float mProgress>
	//   62  148:invokestatic    #217 <Method float lerp(float, float, float)>
	//   63  151:invokestatic    #167 <Method int Math.round(float)>
	//   64  154:i2f             
	//   65  155:fstore          5
		float f5 = lerp(0.0F, ARROW_HEAD_ANGLE, mProgress);
	//   66  157:fconst_0        
	//   67  158:getstatic       #45  <Field float ARROW_HEAD_ANGLE>
	//   68  161:aload_0         
	//   69  162:getfield        #215 <Field float mProgress>
	//   70  165:invokestatic    #217 <Method float lerp(float, float, float)>
	//   71  168:fstore          7
		if(i != 0)
	//*  72  170:iload           9
	//*  73  172:ifeq            180
			f = 0.0F;
	//   74  175:fconst_0        
	//   75  176:fstore_2        
		else
	//*  76  177:goto            183
			f = -180F;
	//   77  180:ldc1            #220 <Float -180F>
	//   78  182:fstore_2        
		float f1;
		if(i != 0)
	//*  79  183:iload           9
	//*  80  185:ifeq            194
			f1 = 180F;
	//   81  188:ldc1            #221 <Float 180F>
	//   82  190:fstore_3        
		else
	//*  83  191:goto            196
			f1 = 0.0F;
	//   84  194:fconst_0        
	//   85  195:fstore_3        
		f = lerp(f, f1, mProgress);
	//   86  196:fload_2         
	//   87  197:fload_3         
	//   88  198:aload_0         
	//   89  199:getfield        #215 <Field float mProgress>
	//   90  202:invokestatic    #217 <Method float lerp(float, float, float)>
	//   91  205:fstore_2        
		f1 = Math.round((double)f4 * Math.cos(f5));
	//   92  206:fload           6
	//   93  208:f2d             
	//   94  209:fload           7
	//   95  211:f2d             
	//   96  212:invokestatic    #224 <Method double Math.cos(double)>
	//   97  215:dmul            
	//   98  216:invokestatic    #227 <Method long Math.round(double)>
	//   99  219:l2f             
	//  100  220:fstore_3        
		f4 = Math.round((double)f4 * Math.sin(f5));
	//  101  221:fload           6
	//  102  223:f2d             
	//  103  224:fload           7
	//  104  226:f2d             
	//  105  227:invokestatic    #230 <Method double Math.sin(double)>
	//  106  230:dmul            
	//  107  231:invokestatic    #227 <Method long Math.round(double)>
	//  108  234:l2f             
	//  109  235:fstore          6
		mPath.rewind();
	//  110  237:aload_0         
	//  111  238:getfield        #60  <Field Path mPath>
	//  112  241:invokevirtual   #233 <Method void Path.rewind()>
		f5 = lerp(mBarGap + mPaint.getStrokeWidth(), -mMaxCutForBarSize, mProgress);
	//  113  244:aload_0         
	//  114  245:getfield        #235 <Field float mBarGap>
	//  115  248:aload_0         
	//  116  249:getfield        #55  <Field Paint mPaint>
	//  117  252:invokevirtual   #239 <Method float Paint.getStrokeWidth()>
	//  118  255:fadd            
	//  119  256:aload_0         
	//  120  257:getfield        #219 <Field float mMaxCutForBarSize>
	//  121  260:fneg            
	//  122  261:aload_0         
	//  123  262:getfield        #215 <Field float mProgress>
	//  124  265:invokestatic    #217 <Method float lerp(float, float, float)>
	//  125  268:fstore          7
		float f6 = -f2 / 2.0F;
	//  126  270:fload           4
	//  127  272:fneg            
	//  128  273:fconst_2        
	//  129  274:fdiv            
	//  130  275:fstore          8
		mPath.moveTo(f6 + f3, 0.0F);
	//  131  277:aload_0         
	//  132  278:getfield        #60  <Field Path mPath>
	//  133  281:fload           8
	//  134  283:fload           5
	//  135  285:fadd            
	//  136  286:fconst_0        
	//  137  287:invokevirtual   #243 <Method void Path.moveTo(float, float)>
		mPath.rLineTo(f2 - 2.0F * f3, 0.0F);
	//  138  290:aload_0         
	//  139  291:getfield        #60  <Field Path mPath>
	//  140  294:fload           4
	//  141  296:fconst_2        
	//  142  297:fload           5
	//  143  299:fmul            
	//  144  300:fsub            
	//  145  301:fconst_0        
	//  146  302:invokevirtual   #246 <Method void Path.rLineTo(float, float)>
		mPath.moveTo(f6, f5);
	//  147  305:aload_0         
	//  148  306:getfield        #60  <Field Path mPath>
	//  149  309:fload           8
	//  150  311:fload           7
	//  151  313:invokevirtual   #243 <Method void Path.moveTo(float, float)>
		mPath.rLineTo(f1, f4);
	//  152  316:aload_0         
	//  153  317:getfield        #60  <Field Path mPath>
	//  154  320:fload_3         
	//  155  321:fload           6
	//  156  323:invokevirtual   #246 <Method void Path.rLineTo(float, float)>
		mPath.moveTo(f6, -f5);
	//  157  326:aload_0         
	//  158  327:getfield        #60  <Field Path mPath>
	//  159  330:fload           8
	//  160  332:fload           7
	//  161  334:fneg            
	//  162  335:invokevirtual   #243 <Method void Path.moveTo(float, float)>
		mPath.rLineTo(f1, -f4);
	//  163  338:aload_0         
	//  164  339:getfield        #60  <Field Path mPath>
	//  165  342:fload_3         
	//  166  343:fload           6
	//  167  345:fneg            
	//  168  346:invokevirtual   #246 <Method void Path.rLineTo(float, float)>
		mPath.close();
	//  169  349:aload_0         
	//  170  350:getfield        #60  <Field Path mPath>
	//  171  353:invokevirtual   #249 <Method void Path.close()>
		canvas.save();
	//  172  356:aload_1         
	//  173  357:invokevirtual   #255 <Method int Canvas.save()>
	//  174  360:pop             
		f1 = mPaint.getStrokeWidth();
	//  175  361:aload_0         
	//  176  362:getfield        #55  <Field Paint mPaint>
	//  177  365:invokevirtual   #239 <Method float Paint.getStrokeWidth()>
	//  178  368:fstore_3        
		f1 = (float)((double)(float)(((int)((float)rect.height() - 3F * f1 - mBarGap * 2.0F) / 4) * 2) + ((double)f1 * 1.5D + (double)mBarGap));
	//  179  369:aload           10
	//  180  371:invokevirtual   #260 <Method int Rect.height()>
	//  181  374:i2f             
	//  182  375:ldc2            #261 <Float 3F>
	//  183  378:fload_3         
	//  184  379:fmul            
	//  185  380:fsub            
	//  186  381:aload_0         
	//  187  382:getfield        #235 <Field float mBarGap>
	//  188  385:fconst_2        
	//  189  386:fmul            
	//  190  387:fsub            
	//  191  388:f2i             
	//  192  389:iconst_4        
	//  193  390:idiv            
	//  194  391:iconst_2        
	//  195  392:imul            
	//  196  393:i2f             
	//  197  394:f2d             
	//  198  395:fload_3         
	//  199  396:f2d             
	//  200  397:ldc2w           #262 <Double 1.5D>
	//  201  400:dmul            
	//  202  401:aload_0         
	//  203  402:getfield        #235 <Field float mBarGap>
	//  204  405:f2d             
	//  205  406:dadd            
	//  206  407:dadd            
	//  207  408:d2f             
	//  208  409:fstore_3        
		canvas.translate(rect.centerX(), f1);
	//  209  410:aload_1         
	//  210  411:aload           10
	//  211  413:invokevirtual   #266 <Method int Rect.centerX()>
	//  212  416:i2f             
	//  213  417:fload_3         
	//  214  418:invokevirtual   #269 <Method void Canvas.translate(float, float)>
		if(mSpin)
	//* 215  421:aload_0         
	//* 216  422:getfield        #271 <Field boolean mSpin>
	//* 217  425:ifeq            459
		{
			if((mVerticalMirror ^ i) != 0)
	//* 218  428:aload_0         
	//* 219  429:getfield        #62  <Field boolean mVerticalMirror>
	//* 220  432:iload           9
	//* 221  434:ixor            
	//* 222  435:ifeq            444
				i = -1;
	//  223  438:iconst_m1       
	//  224  439:istore          9
			else
	//* 225  441:goto            447
				i = 1;
	//  226  444:iconst_1        
	//  227  445:istore          9
			canvas.rotate((float)i * f);
	//  228  447:aload_1         
	//  229  448:iload           9
	//  230  450:i2f             
	//  231  451:fload_2         
	//  232  452:fmul            
	//  233  453:invokevirtual   #274 <Method void Canvas.rotate(float)>
		} else
	//* 234  456:goto            470
		if(i != 0)
	//* 235  459:iload           9
	//* 236  461:ifeq            470
			canvas.rotate(180F);
	//  237  464:aload_1         
	//  238  465:ldc1            #221 <Float 180F>
	//  239  467:invokevirtual   #274 <Method void Canvas.rotate(float)>
		canvas.drawPath(mPath, mPaint);
	//  240  470:aload_1         
	//  241  471:aload_0         
	//  242  472:getfield        #60  <Field Path mPath>
	//  243  475:aload_0         
	//  244  476:getfield        #55  <Field Paint mPaint>
	//  245  479:invokevirtual   #278 <Method void Canvas.drawPath(Path, Paint)>
		canvas.restore();
	//  246  482:aload_1         
	//  247  483:invokevirtual   #281 <Method void Canvas.restore()>
	//  248  486:return          
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
	//    2    4:invokevirtual   #288 <Method int Paint.getColor()>
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
	//    1    1:getfield        #271 <Field boolean mSpin>
	//    2    4:ireturn         
	}

	public void setAlpha(int i)
	{
		if(i != mPaint.getAlpha())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #55  <Field Paint mPaint>
	//*   3    5:invokevirtual   #310 <Method int Paint.getAlpha()>
	//*   4    8:icmpeq          23
		{
			mPaint.setAlpha(i);
	//    5   11:aload_0         
	//    6   12:getfield        #55  <Field Paint mPaint>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #312 <Method void Paint.setAlpha(int)>
			invalidateSelf();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #315 <Method void invalidateSelf()>
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
	//    9   15:invokevirtual   #315 <Method void invalidateSelf()>
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
	//    9   15:invokevirtual   #315 <Method void invalidateSelf()>
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
	//    9   15:invokevirtual   #315 <Method void invalidateSelf()>
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
	//    9   17:invokevirtual   #321 <Method void Paint.setStrokeWidth(float)>
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
	//   22   38:invokevirtual   #315 <Method void invalidateSelf()>
		}
	//   23   41:return          
	}

	public void setColor(int i)
	{
		if(i != mPaint.getColor())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #55  <Field Paint mPaint>
	//*   3    5:invokevirtual   #288 <Method int Paint.getColor()>
	//*   4    8:icmpeq          23
		{
			mPaint.setColor(i);
	//    5   11:aload_0         
	//    6   12:getfield        #55  <Field Paint mPaint>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #322 <Method void Paint.setColor(int)>
			invalidateSelf();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #315 <Method void invalidateSelf()>
		}
	//   11   23:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		mPaint.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Paint mPaint>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #328 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//    4    8:pop             
		invalidateSelf();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #315 <Method void invalidateSelf()>
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
	//    8   14:invokevirtual   #315 <Method void invalidateSelf()>
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
	//    9   15:invokevirtual   #315 <Method void invalidateSelf()>
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
	//    9   15:invokevirtual   #315 <Method void invalidateSelf()>
		}
	//   10   18:return          
	}

	public void setSpinEnabled(boolean flag)
	{
		if(mSpin != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #271 <Field boolean mSpin>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			mSpin = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #271 <Field boolean mSpin>
			invalidateSelf();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #315 <Method void invalidateSelf()>
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
	//    8   14:invokevirtual   #315 <Method void invalidateSelf()>
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
