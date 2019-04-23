// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.a;

public class DrawerArrowDrawable extends Drawable
{

	public DrawerArrowDrawable(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Drawable()>
	//    2    4:aload_0         
	//    3    5:new             #49  <Class Paint>
	//    4    8:dup             
	//    5    9:invokespecial   #50  <Method void Paint()>
	//    6   12:putfield        #52  <Field Paint mPaint>
	//    7   15:aload_0         
	//    8   16:new             #54  <Class Path>
	//    9   19:dup             
	//   10   20:invokespecial   #55  <Method void Path()>
	//   11   23:putfield        #57  <Field Path mPath>
		mVerticalMirror = false;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #59  <Field boolean mVerticalMirror>
		mDirection = 2;
	//   15   31:aload_0         
	//   16   32:iconst_2        
	//   17   33:putfield        #61  <Field int mDirection>
		mPaint.setStyle(android.graphics.Paint.Style.STROKE);
	//   18   36:aload_0         
	//   19   37:getfield        #52  <Field Paint mPaint>
	//   20   40:getstatic       #67  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   21   43:invokevirtual   #71  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		mPaint.setStrokeJoin(android.graphics.Paint.Join.MITER);
	//   22   46:aload_0         
	//   23   47:getfield        #52  <Field Paint mPaint>
	//   24   50:getstatic       #77  <Field android.graphics.Paint$Join android.graphics.Paint$Join.MITER>
	//   25   53:invokevirtual   #81  <Method void Paint.setStrokeJoin(android.graphics.Paint$Join)>
		mPaint.setStrokeCap(android.graphics.Paint.Cap.BUTT);
	//   26   56:aload_0         
	//   27   57:getfield        #52  <Field Paint mPaint>
	//   28   60:getstatic       #87  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.BUTT>
	//   29   63:invokevirtual   #91  <Method void Paint.setStrokeCap(android.graphics.Paint$Cap)>
		mPaint.setAntiAlias(true);
	//   30   66:aload_0         
	//   31   67:getfield        #52  <Field Paint mPaint>
	//   32   70:iconst_1        
	//   33   71:invokevirtual   #95  <Method void Paint.setAntiAlias(boolean)>
		context = ((Context) (context.getTheme().obtainStyledAttributes(((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.styleable.DrawerArrowToggle, android.support.v7.appcompat.R.attr.drawerArrowStyle, android.support.v7.appcompat.R.style.Base_Widget_AppCompat_DrawerArrowToggle)));
	//   34   74:aload_1         
	//   35   75:invokevirtual   #101 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   36   78:aconst_null     
	//   37   79:getstatic       #107 <Field int[] android.support.v7.appcompat.R$styleable.DrawerArrowToggle>
	//   38   82:getstatic       #112 <Field int android.support.v7.appcompat.R$attr.drawerArrowStyle>
	//   39   85:getstatic       #117 <Field int android.support.v7.appcompat.R$style.Base_Widget_AppCompat_DrawerArrowToggle>
	//   40   88:invokevirtual   #123 <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(android.util.AttributeSet, int[], int, int)>
	//   41   91:astore_1        
		setColor(((TypedArray) (context)).getColor(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_color, 0));
	//   42   92:aload_0         
	//   43   93:aload_1         
	//   44   94:getstatic       #126 <Field int android.support.v7.appcompat.R$styleable.DrawerArrowToggle_color>
	//   45   97:iconst_0        
	//   46   98:invokevirtual   #132 <Method int TypedArray.getColor(int, int)>
	//   47  101:invokevirtual   #136 <Method void setColor(int)>
		setBarThickness(((TypedArray) (context)).getDimension(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_thickness, 0.0F));
	//   48  104:aload_0         
	//   49  105:aload_1         
	//   50  106:getstatic       #139 <Field int android.support.v7.appcompat.R$styleable.DrawerArrowToggle_thickness>
	//   51  109:fconst_0        
	//   52  110:invokevirtual   #143 <Method float TypedArray.getDimension(int, float)>
	//   53  113:invokevirtual   #147 <Method void setBarThickness(float)>
		setSpinEnabled(((TypedArray) (context)).getBoolean(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_spinBars, true));
	//   54  116:aload_0         
	//   55  117:aload_1         
	//   56  118:getstatic       #150 <Field int android.support.v7.appcompat.R$styleable.DrawerArrowToggle_spinBars>
	//   57  121:iconst_1        
	//   58  122:invokevirtual   #154 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   59  125:invokevirtual   #157 <Method void setSpinEnabled(boolean)>
		setGapSize(Math.round(((TypedArray) (context)).getDimension(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0F)));
	//   60  128:aload_0         
	//   61  129:aload_1         
	//   62  130:getstatic       #160 <Field int android.support.v7.appcompat.R$styleable.DrawerArrowToggle_gapBetweenBars>
	//   63  133:fconst_0        
	//   64  134:invokevirtual   #143 <Method float TypedArray.getDimension(int, float)>
	//   65  137:invokestatic    #164 <Method int Math.round(float)>
	//   66  140:i2f             
	//   67  141:invokevirtual   #167 <Method void setGapSize(float)>
		mSize = ((TypedArray) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_drawableSize, 0);
	//   68  144:aload_0         
	//   69  145:aload_1         
	//   70  146:getstatic       #170 <Field int android.support.v7.appcompat.R$styleable.DrawerArrowToggle_drawableSize>
	//   71  149:iconst_0        
	//   72  150:invokevirtual   #173 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   73  153:putfield        #175 <Field int mSize>
		mBarLength = Math.round(((TypedArray) (context)).getDimension(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_barLength, 0.0F));
	//   74  156:aload_0         
	//   75  157:aload_1         
	//   76  158:getstatic       #178 <Field int android.support.v7.appcompat.R$styleable.DrawerArrowToggle_barLength>
	//   77  161:fconst_0        
	//   78  162:invokevirtual   #143 <Method float TypedArray.getDimension(int, float)>
	//   79  165:invokestatic    #164 <Method int Math.round(float)>
	//   80  168:i2f             
	//   81  169:putfield        #180 <Field float mBarLength>
		mArrowHeadLength = Math.round(((TypedArray) (context)).getDimension(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_arrowHeadLength, 0.0F));
	//   82  172:aload_0         
	//   83  173:aload_1         
	//   84  174:getstatic       #183 <Field int android.support.v7.appcompat.R$styleable.DrawerArrowToggle_arrowHeadLength>
	//   85  177:fconst_0        
	//   86  178:invokevirtual   #143 <Method float TypedArray.getDimension(int, float)>
	//   87  181:invokestatic    #164 <Method int Math.round(float)>
	//   88  184:i2f             
	//   89  185:putfield        #185 <Field float mArrowHeadLength>
		mArrowShaftLength = ((TypedArray) (context)).getDimension(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_arrowShaftLength, 0.0F);
	//   90  188:aload_0         
	//   91  189:aload_1         
	//   92  190:getstatic       #188 <Field int android.support.v7.appcompat.R$styleable.DrawerArrowToggle_arrowShaftLength>
	//   93  193:fconst_0        
	//   94  194:invokevirtual   #143 <Method float TypedArray.getDimension(int, float)>
	//   95  197:putfield        #190 <Field float mArrowShaftLength>
		((TypedArray) (context)).recycle();
	//   96  200:aload_1         
	//   97  201:invokevirtual   #193 <Method void TypedArray.recycle()>
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
	//    1    1:invokevirtual   #201 <Method Rect getBounds()>
	//    2    4:astore          18
		int j = mDirection;
	//    3    6:aload_0         
	//    4    7:getfield        #61  <Field int mDirection>
	//    5   10:istore          17
		boolean flag = false;
	//    6   12:iconst_0        
	//    7   13:istore          16
		int i;
		if(j != 3)
	//*   8   15:iload           17
	//*   9   17:iconst_3        
	//*  10   18:icmpeq          72
		{
			i = ((int) (flag));
	//   11   21:iload           16
	//   12   23:istore          15
			switch(j)
	//*  13   25:iload           17
			{
	//*  14   27:tableswitch     0 1: default 48
	//	               0 86
	//	               1 66
			default:
				i = ((int) (flag));
	//   15   48:iload           16
	//   16   50:istore          15
				if(a.i(((Drawable) (this))) == 1)
	//*  17   52:aload_0         
	//*  18   53:invokestatic    #207 <Method int a.i(Drawable)>
	//*  19   56:iconst_1        
	//*  20   57:icmpne          86
					i = 1;
	//   21   60:iconst_1        
	//   22   61:istore          15
				break;

	//*  23   63:goto            86
			case 1: // '\001'
				i = 1;
	//   24   66:iconst_1        
	//   25   67:istore          15
				break;

			case 0: // '\0'
				break;
			}
		} else
	//*  26   69:goto            86
		{
			i = ((int) (flag));
	//   27   72:iload           16
	//   28   74:istore          15
			if(a.i(((Drawable) (this))) == 0)
	//*  29   76:aload_0         
	//*  30   77:invokestatic    #207 <Method int a.i(Drawable)>
	//*  31   80:ifne            86
				i = 1;
	//   32   83:iconst_1        
	//   33   84:istore          15
		}
		float f = mArrowHeadLength;
	//   34   86:aload_0         
	//   35   87:getfield        #185 <Field float mArrowHeadLength>
	//   36   90:fstore          8
		f = (float)Math.sqrt(f * f * 2.0F);
	//   37   92:fload           8
	//   38   94:fload           8
	//   39   96:fmul            
	//   40   97:fconst_2        
	//   41   98:fmul            
	//   42   99:f2d             
	//   43  100:invokestatic    #210 <Method double Math.sqrt(double)>
	//   44  103:d2f             
	//   45  104:fstore          8
		float f4 = lerp(mBarLength, f, mProgress);
	//   46  106:aload_0         
	//   47  107:getfield        #180 <Field float mBarLength>
	//   48  110:fload           8
	//   49  112:aload_0         
	//   50  113:getfield        #212 <Field float mProgress>
	//   51  116:invokestatic    #214 <Method float lerp(float, float, float)>
	//   52  119:fstore          12
		float f2 = lerp(mBarLength, mArrowShaftLength, mProgress);
	//   53  121:aload_0         
	//   54  122:getfield        #180 <Field float mBarLength>
	//   55  125:aload_0         
	//   56  126:getfield        #190 <Field float mArrowShaftLength>
	//   57  129:aload_0         
	//   58  130:getfield        #212 <Field float mProgress>
	//   59  133:invokestatic    #214 <Method float lerp(float, float, float)>
	//   60  136:fstore          10
		float f3 = Math.round(lerp(0.0F, mMaxCutForBarSize, mProgress));
	//   61  138:fconst_0        
	//   62  139:aload_0         
	//   63  140:getfield        #216 <Field float mMaxCutForBarSize>
	//   64  143:aload_0         
	//   65  144:getfield        #212 <Field float mProgress>
	//   66  147:invokestatic    #214 <Method float lerp(float, float, float)>
	//   67  150:invokestatic    #164 <Method int Math.round(float)>
	//   68  153:i2f             
	//   69  154:fstore          11
		float f5 = lerp(0.0F, ARROW_HEAD_ANGLE, mProgress);
	//   70  156:fconst_0        
	//   71  157:getstatic       #42  <Field float ARROW_HEAD_ANGLE>
	//   72  160:aload_0         
	//   73  161:getfield        #212 <Field float mProgress>
	//   74  164:invokestatic    #214 <Method float lerp(float, float, float)>
	//   75  167:fstore          13
		if(i != 0)
	//*  76  169:iload           15
	//*  77  171:ifeq            180
			f = 0.0F;
	//   78  174:fconst_0        
	//   79  175:fstore          8
		else
	//*  80  177:goto            184
			f = -180F;
	//   81  180:ldc1            #217 <Float -180F>
	//   82  182:fstore          8
		float f1;
		if(i != 0)
	//*  83  184:iload           15
	//*  84  186:ifeq            196
			f1 = 180F;
	//   85  189:ldc1            #218 <Float 180F>
	//   86  191:fstore          9
		else
	//*  87  193:goto            199
			f1 = 0.0F;
	//   88  196:fconst_0        
	//   89  197:fstore          9
		f = lerp(f, f1, mProgress);
	//   90  199:fload           8
	//   91  201:fload           9
	//   92  203:aload_0         
	//   93  204:getfield        #212 <Field float mProgress>
	//   94  207:invokestatic    #214 <Method float lerp(float, float, float)>
	//   95  210:fstore          8
		double d = f4;
	//   96  212:fload           12
	//   97  214:f2d             
	//   98  215:dstore_2        
		double d1 = f5;
	//   99  216:fload           13
	//  100  218:f2d             
	//  101  219:dstore          4
		double d2 = Math.cos(d1);
	//  102  221:dload           4
	//  103  223:invokestatic    #221 <Method double Math.cos(double)>
	//  104  226:dstore          6
		Double.isNaN(d);
	//  105  228:dload_2         
	//  106  229:invokestatic    #227 <Method boolean Double.isNaN(double)>
	//  107  232:pop             
		f1 = Math.round(d2 * d);
	//  108  233:dload           6
	//  109  235:dload_2         
	//  110  236:dmul            
	//  111  237:invokestatic    #230 <Method long Math.round(double)>
	//  112  240:l2f             
	//  113  241:fstore          9
		d1 = Math.sin(d1);
	//  114  243:dload           4
	//  115  245:invokestatic    #233 <Method double Math.sin(double)>
	//  116  248:dstore          4
		Double.isNaN(d);
	//  117  250:dload_2         
	//  118  251:invokestatic    #227 <Method boolean Double.isNaN(double)>
	//  119  254:pop             
		f4 = Math.round(d * d1);
	//  120  255:dload_2         
	//  121  256:dload           4
	//  122  258:dmul            
	//  123  259:invokestatic    #230 <Method long Math.round(double)>
	//  124  262:l2f             
	//  125  263:fstore          12
		mPath.rewind();
	//  126  265:aload_0         
	//  127  266:getfield        #57  <Field Path mPath>
	//  128  269:invokevirtual   #236 <Method void Path.rewind()>
		f5 = lerp(mBarGap + mPaint.getStrokeWidth(), -mMaxCutForBarSize, mProgress);
	//  129  272:aload_0         
	//  130  273:getfield        #238 <Field float mBarGap>
	//  131  276:aload_0         
	//  132  277:getfield        #52  <Field Paint mPaint>
	//  133  280:invokevirtual   #242 <Method float Paint.getStrokeWidth()>
	//  134  283:fadd            
	//  135  284:aload_0         
	//  136  285:getfield        #216 <Field float mMaxCutForBarSize>
	//  137  288:fneg            
	//  138  289:aload_0         
	//  139  290:getfield        #212 <Field float mProgress>
	//  140  293:invokestatic    #214 <Method float lerp(float, float, float)>
	//  141  296:fstore          13
		float f6 = -f2 / 2.0F;
	//  142  298:fload           10
	//  143  300:fneg            
	//  144  301:fconst_2        
	//  145  302:fdiv            
	//  146  303:fstore          14
		mPath.moveTo(f6 + f3, 0.0F);
	//  147  305:aload_0         
	//  148  306:getfield        #57  <Field Path mPath>
	//  149  309:fload           14
	//  150  311:fload           11
	//  151  313:fadd            
	//  152  314:fconst_0        
	//  153  315:invokevirtual   #246 <Method void Path.moveTo(float, float)>
		mPath.rLineTo(f2 - f3 * 2.0F, 0.0F);
	//  154  318:aload_0         
	//  155  319:getfield        #57  <Field Path mPath>
	//  156  322:fload           10
	//  157  324:fload           11
	//  158  326:fconst_2        
	//  159  327:fmul            
	//  160  328:fsub            
	//  161  329:fconst_0        
	//  162  330:invokevirtual   #249 <Method void Path.rLineTo(float, float)>
		mPath.moveTo(f6, f5);
	//  163  333:aload_0         
	//  164  334:getfield        #57  <Field Path mPath>
	//  165  337:fload           14
	//  166  339:fload           13
	//  167  341:invokevirtual   #246 <Method void Path.moveTo(float, float)>
		mPath.rLineTo(f1, f4);
	//  168  344:aload_0         
	//  169  345:getfield        #57  <Field Path mPath>
	//  170  348:fload           9
	//  171  350:fload           12
	//  172  352:invokevirtual   #249 <Method void Path.rLineTo(float, float)>
		mPath.moveTo(f6, -f5);
	//  173  355:aload_0         
	//  174  356:getfield        #57  <Field Path mPath>
	//  175  359:fload           14
	//  176  361:fload           13
	//  177  363:fneg            
	//  178  364:invokevirtual   #246 <Method void Path.moveTo(float, float)>
		mPath.rLineTo(f1, -f4);
	//  179  367:aload_0         
	//  180  368:getfield        #57  <Field Path mPath>
	//  181  371:fload           9
	//  182  373:fload           12
	//  183  375:fneg            
	//  184  376:invokevirtual   #249 <Method void Path.rLineTo(float, float)>
		mPath.close();
	//  185  379:aload_0         
	//  186  380:getfield        #57  <Field Path mPath>
	//  187  383:invokevirtual   #252 <Method void Path.close()>
		canvas.save();
	//  188  386:aload_1         
	//  189  387:invokevirtual   #258 <Method int Canvas.save()>
	//  190  390:pop             
		f1 = mPaint.getStrokeWidth();
	//  191  391:aload_0         
	//  192  392:getfield        #52  <Field Paint mPaint>
	//  193  395:invokevirtual   #242 <Method float Paint.getStrokeWidth()>
	//  194  398:fstore          9
		f3 = rect.height();
	//  195  400:aload           18
	//  196  402:invokevirtual   #263 <Method int Rect.height()>
	//  197  405:i2f             
	//  198  406:fstore          11
		f2 = mBarGap;
	//  199  408:aload_0         
	//  200  409:getfield        #238 <Field float mBarGap>
	//  201  412:fstore          10
		f3 = ((int)(f3 - 3F * f1 - 2.0F * f2) / 4) * 2;
	//  202  414:fload           11
	//  203  416:ldc2            #264 <Float 3F>
	//  204  419:fload           9
	//  205  421:fmul            
	//  206  422:fsub            
	//  207  423:fconst_2        
	//  208  424:fload           10
	//  209  426:fmul            
	//  210  427:fsub            
	//  211  428:f2i             
	//  212  429:iconst_4        
	//  213  430:idiv            
	//  214  431:iconst_2        
	//  215  432:imul            
	//  216  433:i2f             
	//  217  434:fstore          11
		canvas.translate(rect.centerX(), f3 + (f1 * 1.5F + f2));
	//  218  436:aload_1         
	//  219  437:aload           18
	//  220  439:invokevirtual   #267 <Method int Rect.centerX()>
	//  221  442:i2f             
	//  222  443:fload           11
	//  223  445:fload           9
	//  224  447:ldc2            #268 <Float 1.5F>
	//  225  450:fmul            
	//  226  451:fload           10
	//  227  453:fadd            
	//  228  454:fadd            
	//  229  455:invokevirtual   #271 <Method void Canvas.translate(float, float)>
		if(mSpin)
	//* 230  458:aload_0         
	//* 231  459:getfield        #273 <Field boolean mSpin>
	//* 232  462:ifeq            497
		{
			if((mVerticalMirror ^ i) != 0)
	//* 233  465:aload_0         
	//* 234  466:getfield        #59  <Field boolean mVerticalMirror>
	//* 235  469:iload           15
	//* 236  471:ixor            
	//* 237  472:ifeq            481
				i = -1;
	//  238  475:iconst_m1       
	//  239  476:istore          15
			else
	//* 240  478:goto            484
				i = 1;
	//  241  481:iconst_1        
	//  242  482:istore          15
			canvas.rotate(f * (float)i);
	//  243  484:aload_1         
	//  244  485:fload           8
	//  245  487:iload           15
	//  246  489:i2f             
	//  247  490:fmul            
	//  248  491:invokevirtual   #276 <Method void Canvas.rotate(float)>
		} else
	//* 249  494:goto            508
		if(i != 0)
	//* 250  497:iload           15
	//* 251  499:ifeq            508
			canvas.rotate(180F);
	//  252  502:aload_1         
	//  253  503:ldc1            #218 <Float 180F>
	//  254  505:invokevirtual   #276 <Method void Canvas.rotate(float)>
		canvas.drawPath(mPath, mPaint);
	//  255  508:aload_1         
	//  256  509:aload_0         
	//  257  510:getfield        #57  <Field Path mPath>
	//  258  513:aload_0         
	//  259  514:getfield        #52  <Field Paint mPaint>
	//  260  517:invokevirtual   #280 <Method void Canvas.drawPath(Path, Paint)>
		canvas.restore();
	//  261  520:aload_1         
	//  262  521:invokevirtual   #283 <Method void Canvas.restore()>
	//  263  524:return          
	}

	public float getArrowHeadLength()
	{
		return mArrowHeadLength;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field float mArrowHeadLength>
	//    2    4:freturn         
	}

	public float getArrowShaftLength()
	{
		return mArrowShaftLength;
	//    0    0:aload_0         
	//    1    1:getfield        #190 <Field float mArrowShaftLength>
	//    2    4:freturn         
	}

	public float getBarLength()
	{
		return mBarLength;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field float mBarLength>
	//    2    4:freturn         
	}

	public float getBarThickness()
	{
		return mPaint.getStrokeWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Paint mPaint>
	//    2    4:invokevirtual   #242 <Method float Paint.getStrokeWidth()>
	//    3    7:freturn         
	}

	public int getColor()
	{
		return mPaint.getColor();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Paint mPaint>
	//    2    4:invokevirtual   #289 <Method int Paint.getColor()>
	//    3    7:ireturn         
	}

	public int getDirection()
	{
		return mDirection;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int mDirection>
	//    2    4:ireturn         
	}

	public float getGapSize()
	{
		return mBarGap;
	//    0    0:aload_0         
	//    1    1:getfield        #238 <Field float mBarGap>
	//    2    4:freturn         
	}

	public int getIntrinsicHeight()
	{
		return mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field int mSize>
	//    2    4:ireturn         
	}

	public int getIntrinsicWidth()
	{
		return mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field int mSize>
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
	//    1    1:getfield        #52  <Field Paint mPaint>
	//    2    4:areturn         
	}

	public float getProgress()
	{
		return mProgress;
	//    0    0:aload_0         
	//    1    1:getfield        #212 <Field float mProgress>
	//    2    4:freturn         
	}

	public boolean isSpinEnabled()
	{
		return mSpin;
	//    0    0:aload_0         
	//    1    1:getfield        #273 <Field boolean mSpin>
	//    2    4:ireturn         
	}

	public void setAlpha(int i)
	{
		if(i != mPaint.getAlpha())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #52  <Field Paint mPaint>
	//*   3    5:invokevirtual   #303 <Method int Paint.getAlpha()>
	//*   4    8:icmpeq          23
		{
			mPaint.setAlpha(i);
	//    5   11:aload_0         
	//    6   12:getfield        #52  <Field Paint mPaint>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #305 <Method void Paint.setAlpha(int)>
			invalidateSelf();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #308 <Method void invalidateSelf()>
		}
	//   11   23:return          
	}

	public void setArrowHeadLength(float f)
	{
		if(mArrowHeadLength != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #185 <Field float mArrowHeadLength>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mArrowHeadLength = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #185 <Field float mArrowHeadLength>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #308 <Method void invalidateSelf()>
		}
	//   10   18:return          
	}

	public void setArrowShaftLength(float f)
	{
		if(mArrowShaftLength != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #190 <Field float mArrowShaftLength>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mArrowShaftLength = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #190 <Field float mArrowShaftLength>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #308 <Method void invalidateSelf()>
		}
	//   10   18:return          
	}

	public void setBarLength(float f)
	{
		if(mBarLength != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #180 <Field float mBarLength>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mBarLength = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #180 <Field float mBarLength>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #308 <Method void invalidateSelf()>
		}
	//   10   18:return          
	}

	public void setBarThickness(float f)
	{
		if(mPaint.getStrokeWidth() != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field Paint mPaint>
	//*   2    4:invokevirtual   #242 <Method float Paint.getStrokeWidth()>
	//*   3    7:fload_1         
	//*   4    8:fcmpl           
	//*   5    9:ifeq            52
		{
			mPaint.setStrokeWidth(f);
	//    6   12:aload_0         
	//    7   13:getfield        #52  <Field Paint mPaint>
	//    8   16:fload_1         
	//    9   17:invokevirtual   #314 <Method void Paint.setStrokeWidth(float)>
			double d = f / 2.0F;
	//   10   20:fload_1         
	//   11   21:fconst_2        
	//   12   22:fdiv            
	//   13   23:f2d             
	//   14   24:dstore_2        
			double d1 = Math.cos(ARROW_HEAD_ANGLE);
	//   15   25:getstatic       #42  <Field float ARROW_HEAD_ANGLE>
	//   16   28:f2d             
	//   17   29:invokestatic    #221 <Method double Math.cos(double)>
	//   18   32:dstore          4
			Double.isNaN(d);
	//   19   34:dload_2         
	//   20   35:invokestatic    #227 <Method boolean Double.isNaN(double)>
	//   21   38:pop             
			mMaxCutForBarSize = (float)(d * d1);
	//   22   39:aload_0         
	//   23   40:dload_2         
	//   24   41:dload           4
	//   25   43:dmul            
	//   26   44:d2f             
	//   27   45:putfield        #216 <Field float mMaxCutForBarSize>
			invalidateSelf();
	//   28   48:aload_0         
	//   29   49:invokevirtual   #308 <Method void invalidateSelf()>
		}
	//   30   52:return          
	}

	public void setColor(int i)
	{
		if(i != mPaint.getColor())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #52  <Field Paint mPaint>
	//*   3    5:invokevirtual   #289 <Method int Paint.getColor()>
	//*   4    8:icmpeq          23
		{
			mPaint.setColor(i);
	//    5   11:aload_0         
	//    6   12:getfield        #52  <Field Paint mPaint>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #315 <Method void Paint.setColor(int)>
			invalidateSelf();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #308 <Method void invalidateSelf()>
		}
	//   11   23:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		mPaint.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Paint mPaint>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #320 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//    4    8:pop             
		invalidateSelf();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #308 <Method void invalidateSelf()>
	//    7   13:return          
	}

	public void setDirection(int i)
	{
		if(i != mDirection)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #61  <Field int mDirection>
	//*   3    5:icmpeq          17
		{
			mDirection = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #61  <Field int mDirection>
			invalidateSelf();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #308 <Method void invalidateSelf()>
		}
	//    9   17:return          
	}

	public void setGapSize(float f)
	{
		if(f != mBarGap)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #238 <Field float mBarGap>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mBarGap = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #238 <Field float mBarGap>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #308 <Method void invalidateSelf()>
		}
	//   10   18:return          
	}

	public void setProgress(float f)
	{
		if(mProgress != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #212 <Field float mProgress>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mProgress = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #212 <Field float mProgress>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #308 <Method void invalidateSelf()>
		}
	//   10   18:return          
	}

	public void setSpinEnabled(boolean flag)
	{
		if(mSpin != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #273 <Field boolean mSpin>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			mSpin = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #273 <Field boolean mSpin>
			invalidateSelf();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #308 <Method void invalidateSelf()>
		}
	//    9   17:return          
	}

	public void setVerticalMirror(boolean flag)
	{
		if(mVerticalMirror != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field boolean mVerticalMirror>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			mVerticalMirror = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #59  <Field boolean mVerticalMirror>
			invalidateSelf();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #308 <Method void invalidateSelf()>
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
	//    0    0:ldc2w           #33  <Double 45D>
	//    1    3:invokestatic    #40  <Method double Math.toRadians(double)>
	//    2    6:d2f             
	//    3    7:putstatic       #42  <Field float ARROW_HEAD_ANGLE>
	//*   4   10:return          
	}
}
