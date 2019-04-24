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
label0:
		{
label1:
			{
label2:
				{
					float f;
					float f1;
					int i;
					{
						Rect rect = getBounds();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #204 <Method Rect getBounds()>
	//    2    4:astore          10
						float f2;
						float f3;
						float f4;
						float f5;
						float f6;
						switch(mDirection)
	//*   3    6:aload_0         
	//*   4    7:getfield        #64  <Field int mDirection>
						{
	//*   5   10:tableswitch     0 3: default 40
	//	               0 418
	//	               1 424
	//	               2 40
	//	               3 430
						case 2: // '\002'
						default:
							if(DrawableCompat.getLayoutDirection(((Drawable) (this))) == 1)
	//*   6   40:aload_0         
	//*   7   41:invokestatic    #210 <Method int DrawableCompat.getLayoutDirection(Drawable)>
	//*   8   44:iconst_1        
	//*   9   45:icmpne          449
								i = 1;
	//   10   48:iconst_1        
	//   11   49:istore          9
							else
	//*  12   51:aload_0         
	//*  13   52:getfield        #188 <Field float mArrowHeadLength>
	//*  14   55:aload_0         
	//*  15   56:getfield        #188 <Field float mArrowHeadLength>
	//*  16   59:fmul            
	//*  17   60:fconst_2        
	//*  18   61:fmul            
	//*  19   62:f2d             
	//*  20   63:invokestatic    #213 <Method double Math.sqrt(double)>
	//*  21   66:d2f             
	//*  22   67:fstore_2        
	//*  23   68:aload_0         
	//*  24   69:getfield        #183 <Field float mBarLength>
	//*  25   72:fload_2         
	//*  26   73:aload_0         
	//*  27   74:getfield        #215 <Field float mProgress>
	//*  28   77:invokestatic    #217 <Method float lerp(float, float, float)>
	//*  29   80:fstore          6
	//*  30   82:aload_0         
	//*  31   83:getfield        #183 <Field float mBarLength>
	//*  32   86:aload_0         
	//*  33   87:getfield        #193 <Field float mArrowShaftLength>
	//*  34   90:aload_0         
	//*  35   91:getfield        #215 <Field float mProgress>
	//*  36   94:invokestatic    #217 <Method float lerp(float, float, float)>
	//*  37   97:fstore          4
	//*  38   99:fconst_0        
	//*  39  100:aload_0         
	//*  40  101:getfield        #219 <Field float mMaxCutForBarSize>
	//*  41  104:aload_0         
	//*  42  105:getfield        #215 <Field float mProgress>
	//*  43  108:invokestatic    #217 <Method float lerp(float, float, float)>
	//*  44  111:invokestatic    #167 <Method int Math.round(float)>
	//*  45  114:i2f             
	//*  46  115:fstore          5
	//*  47  117:fconst_0        
	//*  48  118:getstatic       #45  <Field float ARROW_HEAD_ANGLE>
	//*  49  121:aload_0         
	//*  50  122:getfield        #215 <Field float mProgress>
	//*  51  125:invokestatic    #217 <Method float lerp(float, float, float)>
	//*  52  128:fstore          7
	//*  53  130:iload           9
	//*  54  132:ifeq            455
	//*  55  135:fconst_0        
	//*  56  136:fstore_2        
	//*  57  137:iload           9
	//*  58  139:ifeq            462
	//*  59  142:ldc1            #220 <Float 180F>
	//*  60  144:fstore_3        
	//*  61  145:fload_2         
	//*  62  146:fload_3         
	//*  63  147:aload_0         
	//*  64  148:getfield        #215 <Field float mProgress>
	//*  65  151:invokestatic    #217 <Method float lerp(float, float, float)>
	//*  66  154:fstore_2        
	//*  67  155:fload           6
	//*  68  157:f2d             
	//*  69  158:fload           7
	//*  70  160:f2d             
	//*  71  161:invokestatic    #223 <Method double Math.cos(double)>
	//*  72  164:dmul            
	//*  73  165:invokestatic    #226 <Method long Math.round(double)>
	//*  74  168:l2f             
	//*  75  169:fstore_3        
	//*  76  170:fload           6
	//*  77  172:f2d             
	//*  78  173:fload           7
	//*  79  175:f2d             
	//*  80  176:invokestatic    #229 <Method double Math.sin(double)>
	//*  81  179:dmul            
	//*  82  180:invokestatic    #226 <Method long Math.round(double)>
	//*  83  183:l2f             
	//*  84  184:fstore          6
	//*  85  186:aload_0         
	//*  86  187:getfield        #60  <Field Path mPath>
	//*  87  190:invokevirtual   #232 <Method void Path.rewind()>
	//*  88  193:aload_0         
	//*  89  194:getfield        #234 <Field float mBarGap>
	//*  90  197:aload_0         
	//*  91  198:getfield        #55  <Field Paint mPaint>
	//*  92  201:invokevirtual   #238 <Method float Paint.getStrokeWidth()>
	//*  93  204:fadd            
	//*  94  205:aload_0         
	//*  95  206:getfield        #219 <Field float mMaxCutForBarSize>
	//*  96  209:fneg            
	//*  97  210:aload_0         
	//*  98  211:getfield        #215 <Field float mProgress>
	//*  99  214:invokestatic    #217 <Method float lerp(float, float, float)>
	//* 100  217:fstore          7
	//* 101  219:fload           4
	//* 102  221:fneg            
	//* 103  222:fconst_2        
	//* 104  223:fdiv            
	//* 105  224:fstore          8
	//* 106  226:aload_0         
	//* 107  227:getfield        #60  <Field Path mPath>
	//* 108  230:fload           8
	//* 109  232:fload           5
	//* 110  234:fadd            
	//* 111  235:fconst_0        
	//* 112  236:invokevirtual   #242 <Method void Path.moveTo(float, float)>
	//* 113  239:aload_0         
	//* 114  240:getfield        #60  <Field Path mPath>
	//* 115  243:fload           4
	//* 116  245:fconst_2        
	//* 117  246:fload           5
	//* 118  248:fmul            
	//* 119  249:fsub            
	//* 120  250:fconst_0        
	//* 121  251:invokevirtual   #245 <Method void Path.rLineTo(float, float)>
	//* 122  254:aload_0         
	//* 123  255:getfield        #60  <Field Path mPath>
	//* 124  258:fload           8
	//* 125  260:fload           7
	//* 126  262:invokevirtual   #242 <Method void Path.moveTo(float, float)>
	//* 127  265:aload_0         
	//* 128  266:getfield        #60  <Field Path mPath>
	//* 129  269:fload_3         
	//* 130  270:fload           6
	//* 131  272:invokevirtual   #245 <Method void Path.rLineTo(float, float)>
	//* 132  275:aload_0         
	//* 133  276:getfield        #60  <Field Path mPath>
	//* 134  279:fload           8
	//* 135  281:fload           7
	//* 136  283:fneg            
	//* 137  284:invokevirtual   #242 <Method void Path.moveTo(float, float)>
	//* 138  287:aload_0         
	//* 139  288:getfield        #60  <Field Path mPath>
	//* 140  291:fload_3         
	//* 141  292:fload           6
	//* 142  294:fneg            
	//* 143  295:invokevirtual   #245 <Method void Path.rLineTo(float, float)>
	//* 144  298:aload_0         
	//* 145  299:getfield        #60  <Field Path mPath>
	//* 146  302:invokevirtual   #248 <Method void Path.close()>
	//* 147  305:aload_1         
	//* 148  306:invokevirtual   #254 <Method int Canvas.save()>
	//* 149  309:pop             
	//* 150  310:aload_0         
	//* 151  311:getfield        #55  <Field Paint mPaint>
	//* 152  314:invokevirtual   #238 <Method float Paint.getStrokeWidth()>
	//* 153  317:fstore_3        
	//* 154  318:aload           10
	//* 155  320:invokevirtual   #259 <Method int Rect.height()>
	//* 156  323:i2f             
	//* 157  324:ldc2            #260 <Float 3F>
	//* 158  327:fload_3         
	//* 159  328:fmul            
	//* 160  329:fsub            
	//* 161  330:aload_0         
	//* 162  331:getfield        #234 <Field float mBarGap>
	//* 163  334:fconst_2        
	//* 164  335:fmul            
	//* 165  336:fsub            
	//* 166  337:f2i             
	//* 167  338:iconst_4        
	//* 168  339:idiv            
	//* 169  340:iconst_2        
	//* 170  341:imul            
	//* 171  342:i2f             
	//* 172  343:fstore          4
	//* 173  345:aload_0         
	//* 174  346:getfield        #234 <Field float mBarGap>
	//* 175  349:fstore          5
	//* 176  351:aload_1         
	//* 177  352:aload           10
	//* 178  354:invokevirtual   #263 <Method int Rect.centerX()>
	//* 179  357:i2f             
	//* 180  358:fload           4
	//* 181  360:ldc2            #264 <Float 1.5F>
	//* 182  363:fload_3         
	//* 183  364:fmul            
	//* 184  365:fload           5
	//* 185  367:fadd            
	//* 186  368:fadd            
	//* 187  369:invokevirtual   #267 <Method void Canvas.translate(float, float)>
	//* 188  372:aload_0         
	//* 189  373:getfield        #269 <Field boolean mSpin>
	//* 190  376:ifeq            473
	//* 191  379:aload_0         
	//* 192  380:getfield        #62  <Field boolean mVerticalMirror>
	//* 193  383:iload           9
	//* 194  385:ixor            
	//* 195  386:ifeq            467
	//* 196  389:iconst_m1       
	//* 197  390:istore          9
	//* 198  392:aload_1         
	//* 199  393:iload           9
	//* 200  395:i2f             
	//* 201  396:fload_2         
	//* 202  397:fmul            
	//* 203  398:invokevirtual   #272 <Method void Canvas.rotate(float)>
	//* 204  401:aload_1         
	//* 205  402:aload_0         
	//* 206  403:getfield        #60  <Field Path mPath>
	//* 207  406:aload_0         
	//* 208  407:getfield        #55  <Field Paint mPaint>
	//* 209  410:invokevirtual   #276 <Method void Canvas.drawPath(Path, Paint)>
	//* 210  413:aload_1         
	//* 211  414:invokevirtual   #279 <Method void Canvas.restore()>
	//* 212  417:return          
	//* 213  418:iconst_0        
	//* 214  419:istore          9
	//* 215  421:goto            51
	//* 216  424:iconst_1        
	//* 217  425:istore          9
	//* 218  427:goto            51
	//* 219  430:aload_0         
	//* 220  431:invokestatic    #210 <Method int DrawableCompat.getLayoutDirection(Drawable)>
	//* 221  434:ifne            443
	//* 222  437:iconst_1        
	//* 223  438:istore          9
	//* 224  440:goto            51
	//* 225  443:iconst_0        
	//* 226  444:istore          9
	//* 227  446:goto            440
								i = 0;
	//  228  449:iconst_0        
	//  229  450:istore          9
							break;

						case 0: // '\0'
							break label2;

						case 1: // '\001'
							break label1;

						case 3: // '\003'
							break label0;
						}
					}
					f = (float)Math.sqrt(mArrowHeadLength * mArrowHeadLength * 2.0F);
					f4 = lerp(mBarLength, f, mProgress);
					f2 = lerp(mBarLength, mArrowShaftLength, mProgress);
					f3 = Math.round(lerp(0.0F, mMaxCutForBarSize, mProgress));
					f5 = lerp(0.0F, ARROW_HEAD_ANGLE, mProgress);
					if(i != 0)
						f = 0.0F;
					else
	//* 230  452:goto            51
						f = -180F;
	//  231  455:ldc2            #280 <Float -180F>
	//  232  458:fstore_2        
					if(i != 0)
						f1 = 180F;
					else
	//* 233  459:goto            137
						f1 = 0.0F;
	//  234  462:fconst_0        
	//  235  463:fstore_3        
					f = lerp(f, f1, mProgress);
					f1 = Math.round((double)f4 * Math.cos(f5));
					f4 = Math.round((double)f4 * Math.sin(f5));
					mPath.rewind();
					f5 = lerp(mBarGap + mPaint.getStrokeWidth(), -mMaxCutForBarSize, mProgress);
					f6 = -f2 / 2.0F;
					mPath.moveTo(f6 + f3, 0.0F);
					mPath.rLineTo(f2 - 2.0F * f3, 0.0F);
					mPath.moveTo(f6, f5);
					mPath.rLineTo(f1, f4);
					mPath.moveTo(f6, -f5);
					mPath.rLineTo(f1, -f4);
					mPath.close();
					canvas.save();
					f1 = mPaint.getStrokeWidth();
					f2 = ((int)((float)rect.height() - 3F * f1 - mBarGap * 2.0F) / 4) * 2;
					f3 = mBarGap;
					canvas.translate(rect.centerX(), f2 + (1.5F * f1 + f3));
					if(mSpin)
					{
						if((mVerticalMirror ^ i) != 0)
							i = -1;
						else
	//* 236  464:goto            145
							i = 1;
	//  237  467:iconst_1        
	//  238  468:istore          9
						canvas.rotate((float)i * f);
					} else
	//* 239  470:goto            392
					if(i != 0)
	//* 240  473:iload           9
	//* 241  475:ifeq            401
						canvas.rotate(180F);
	//  242  478:aload_1         
	//  243  479:ldc1            #220 <Float 180F>
	//  244  481:invokevirtual   #272 <Method void Canvas.rotate(float)>
					canvas.drawPath(mPath, mPaint);
					canvas.restore();
					return;
				}
				i = 0;
				break MISSING_BLOCK_LABEL_51;
			}
			i = 1;
			break MISSING_BLOCK_LABEL_51;
		}
		if(DrawableCompat.getLayoutDirection(((Drawable) (this))) == 0)
			i = 1;
		else
			i = 0;
		break MISSING_BLOCK_LABEL_51;
	//* 245  484:goto            401
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
	//    2    4:invokevirtual   #238 <Method float Paint.getStrokeWidth()>
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
	//    1    1:getfield        #234 <Field float mBarGap>
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
	//    1    1:getfield        #269 <Field boolean mSpin>
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
	//*   2    4:invokevirtual   #238 <Method float Paint.getStrokeWidth()>
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
	//   17   29:invokestatic    #223 <Method double Math.cos(double)>
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
	//*   2    2:getfield        #234 <Field float mBarGap>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mBarGap = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #234 <Field float mBarGap>
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
	//*   1    1:getfield        #269 <Field boolean mSpin>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			mSpin = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #269 <Field boolean mSpin>
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
