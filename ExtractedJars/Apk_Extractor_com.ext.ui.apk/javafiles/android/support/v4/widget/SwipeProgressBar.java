// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.graphics.*;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

final class SwipeProgressBar
{

	SwipeProgressBar(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #52  <Class Paint>
	//    4    8:dup             
	//    5    9:invokespecial   #53  <Method void Paint()>
	//    6   12:putfield        #55  <Field Paint mPaint>
	//    7   15:aload_0         
	//    8   16:new             #57  <Class RectF>
	//    9   19:dup             
	//   10   20:invokespecial   #58  <Method void RectF()>
	//   11   23:putfield        #60  <Field RectF mClipRect>
		mBounds = new Rect();
	//   12   26:aload_0         
	//   13   27:new             #62  <Class Rect>
	//   14   30:dup             
	//   15   31:invokespecial   #63  <Method void Rect()>
	//   16   34:putfield        #65  <Field Rect mBounds>
		mParent = view;
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:putfield        #67  <Field View mParent>
		mColor1 = 0xb3000000;
	//   20   42:aload_0         
	//   21   43:ldc1            #9   <Int 0xb3000000>
	//   22   45:putfield        #69  <Field int mColor1>
		mColor2 = 0x80000000;
	//   23   48:aload_0         
	//   24   49:ldc1            #11  <Int 0x80000000>
	//   25   51:putfield        #71  <Field int mColor2>
		mColor3 = 0x4d000000;
	//   26   54:aload_0         
	//   27   55:ldc1            #13  <Int 0x4d000000>
	//   28   57:putfield        #73  <Field int mColor3>
		mColor4 = 0x1a000000;
	//   29   60:aload_0         
	//   30   61:ldc1            #15  <Int 0x1a000000>
	//   31   63:putfield        #75  <Field int mColor4>
	//   32   66:return          
	}

	private void drawCircle(Canvas canvas, float f, float f1, int i, float f2)
	{
		mPaint.setColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Paint mPaint>
	//    2    4:iload           4
	//    3    6:invokevirtual   #81  <Method void Paint.setColor(int)>
		canvas.save();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #87  <Method int Canvas.save()>
	//    6   13:pop             
		canvas.translate(f, f1);
	//    7   14:aload_1         
	//    8   15:fload_2         
	//    9   16:fload_3         
	//   10   17:invokevirtual   #91  <Method void Canvas.translate(float, float)>
		f1 = INTERPOLATOR.getInterpolation(f2);
	//   11   20:getstatic       #47  <Field Interpolator INTERPOLATOR>
	//   12   23:fload           5
	//   13   25:invokeinterface #97  <Method float Interpolator.getInterpolation(float)>
	//   14   30:fstore_3        
		canvas.scale(f1, f1);
	//   15   31:aload_1         
	//   16   32:fload_3         
	//   17   33:fload_3         
	//   18   34:invokevirtual   #100 <Method void Canvas.scale(float, float)>
		canvas.drawCircle(0.0F, 0.0F, f, mPaint);
	//   19   37:aload_1         
	//   20   38:fconst_0        
	//   21   39:fconst_0        
	//   22   40:fload_2         
	//   23   41:aload_0         
	//   24   42:getfield        #55  <Field Paint mPaint>
	//   25   45:invokevirtual   #103 <Method void Canvas.drawCircle(float, float, float, Paint)>
		canvas.restore();
	//   26   48:aload_1         
	//   27   49:invokevirtual   #106 <Method void Canvas.restore()>
	//   28   52:return          
	}

	private void drawTrigger(Canvas canvas, int i, int j)
	{
		mPaint.setColor(mColor1);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Paint mPaint>
	//    2    4:aload_0         
	//    3    5:getfield        #69  <Field int mColor1>
	//    4    8:invokevirtual   #81  <Method void Paint.setColor(int)>
		canvas.drawCircle(i, j, (float)i * mTriggerPercentage, mPaint);
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:i2f             
	//    8   14:iload_3         
	//    9   15:i2f             
	//   10   16:iload_2         
	//   11   17:i2f             
	//   12   18:aload_0         
	//   13   19:getfield        #110 <Field float mTriggerPercentage>
	//   14   22:fmul            
	//   15   23:aload_0         
	//   16   24:getfield        #55  <Field Paint mPaint>
	//   17   27:invokevirtual   #103 <Method void Canvas.drawCircle(float, float, float, Paint)>
	//   18   30:return          
	}

	void draw(Canvas canvas)
	{
label0:
		{
			{
				int j = mBounds.width();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Rect mBounds>
	//    2    4:invokevirtual   #115 <Method int Rect.width()>
	//    3    7:istore          6
				int i1 = mBounds.height();
	//    4    9:aload_0         
	//    5   10:getfield        #65  <Field Rect mBounds>
	//    6   13:invokevirtual   #118 <Method int Rect.height()>
	//    7   16:istore          9
				int k = j / 2;
	//    8   18:iload           6
	//    9   20:iconst_2        
	//   10   21:idiv            
	//   11   22:istore          7
				int l = i1 / 2;
	//   12   24:iload           9
	//   13   26:iconst_2        
	//   14   27:idiv            
	//   15   28:istore          8
				int i = canvas.save();
	//   16   30:aload_1         
	//   17   31:invokevirtual   #87  <Method int Canvas.save()>
	//   18   34:istore          5
				canvas.clipRect(mBounds);
	//   19   36:aload_1         
	//   20   37:aload_0         
	//   21   38:getfield        #65  <Field Rect mBounds>
	//   22   41:invokevirtual   #122 <Method boolean Canvas.clipRect(Rect)>
	//   23   44:pop             
				if(!mRunning && mFinishTime <= 0L)
					break label0;
	//   24   45:aload_0         
	//   25   46:getfield        #124 <Field boolean mRunning>
	//   26   49:ifne            61
	//   27   52:aload_0         
	//   28   53:getfield        #126 <Field long mFinishTime>
	//   29   56:lconst_0        
	//   30   57:lcmp            
	//   31   58:ifle            585
				long l1 = AnimationUtils.currentAnimationTimeMillis();
	//   32   61:invokestatic    #132 <Method long AnimationUtils.currentAnimationTimeMillis()>
	//   33   64:lstore          10
				long l2 = mStartTime;
	//   34   66:aload_0         
	//   35   67:getfield        #134 <Field long mStartTime>
	//   36   70:lstore          12
				long l3 = (l1 - mStartTime) / 2000L;
	//   37   72:lload           10
	//   38   74:aload_0         
	//   39   75:getfield        #134 <Field long mStartTime>
	//   40   78:lsub            
	//   41   79:ldc2w           #135 <Long 2000L>
	//   42   82:ldiv            
	//   43   83:lstore          14
				float f = (float)((l1 - l2) % 2000L) / 20F;
	//   44   85:lload           10
	//   45   87:lload           12
	//   46   89:lsub            
	//   47   90:ldc2w           #135 <Long 2000L>
	//   48   93:lrem            
	//   49   94:l2f             
	//   50   95:ldc1            #137 <Float 20F>
	//   51   97:fdiv            
	//   52   98:fstore_2        
				if(!mRunning)
	//*  53   99:aload_0         
	//*  54  100:getfield        #124 <Field boolean mRunning>
	//*  55  103:ifne            631
				{
					if(l1 - mFinishTime >= 1000L)
	//*  56  106:lload           10
	//*  57  108:aload_0         
	//*  58  109:getfield        #126 <Field long mFinishTime>
	//*  59  112:lsub            
	//*  60  113:ldc2w           #138 <Long 1000L>
	//*  61  116:lcmp            
	//*  62  117:iflt            126
					{
						mFinishTime = 0L;
	//   63  120:aload_0         
	//   64  121:lconst_0        
	//   65  122:putfield        #126 <Field long mFinishTime>
						return;
	//   66  125:return          
					}
					float f1 = (float)((l1 - mFinishTime) % 1000L) / 10F / 100F;
	//   67  126:lload           10
	//   68  128:aload_0         
	//   69  129:getfield        #126 <Field long mFinishTime>
	//   70  132:lsub            
	//   71  133:ldc2w           #138 <Long 1000L>
	//   72  136:lrem            
	//   73  137:l2f             
	//   74  138:ldc1            #140 <Float 10F>
	//   75  140:fdiv            
	//   76  141:ldc1            #141 <Float 100F>
	//   77  143:fdiv            
	//   78  144:fstore_3        
					float f6 = j / 2;
	//   79  145:iload           6
	//   80  147:iconst_2        
	//   81  148:idiv            
	//   82  149:i2f             
	//   83  150:fstore          4
					f1 = INTERPOLATOR.getInterpolation(f1) * f6;
	//   84  152:getstatic       #47  <Field Interpolator INTERPOLATOR>
	//   85  155:fload_3         
	//   86  156:invokeinterface #97  <Method float Interpolator.getInterpolation(float)>
	//   87  161:fload           4
	//   88  163:fmul            
	//   89  164:fstore_3        
					mClipRect.set((float)k - f1, 0.0F, f1 + (float)k, i1);
	//   90  165:aload_0         
	//   91  166:getfield        #60  <Field RectF mClipRect>
	//   92  169:iload           7
	//   93  171:i2f             
	//   94  172:fload_3         
	//   95  173:fsub            
	//   96  174:fconst_0        
	//   97  175:fload_3         
	//   98  176:iload           7
	//   99  178:i2f             
	//  100  179:fadd            
	//  101  180:iload           9
	//  102  182:i2f             
	//  103  183:invokevirtual   #145 <Method void RectF.set(float, float, float, float)>
					canvas.saveLayerAlpha(mClipRect, 0, 0);
	//  104  186:aload_1         
	//  105  187:aload_0         
	//  106  188:getfield        #60  <Field RectF mClipRect>
	//  107  191:iconst_0        
	//  108  192:iconst_0        
	//  109  193:invokevirtual   #149 <Method int Canvas.saveLayerAlpha(RectF, int, int)>
	//  110  196:pop             
					j = 1;
	//  111  197:iconst_1        
	//  112  198:istore          6
				} else
	//* 113  200:lload           14
	//* 114  202:lconst_0        
	//* 115  203:lcmp            
	//* 116  204:ifne            500
	//* 117  207:aload_1         
	//* 118  208:aload_0         
	//* 119  209:getfield        #69  <Field int mColor1>
	//* 120  212:invokevirtual   #152 <Method void Canvas.drawColor(int)>
	//* 121  215:fload_2         
	//* 122  216:fconst_0        
	//* 123  217:fcmpl           
	//* 124  218:iflt            254
	//* 125  221:fload_2         
	//* 126  222:ldc1            #153 <Float 25F>
	//* 127  224:fcmpg           
	//* 128  225:ifgt            254
	//* 129  228:ldc1            #153 <Float 25F>
	//* 130  230:fload_2         
	//* 131  231:fadd            
	//* 132  232:fconst_2        
	//* 133  233:fmul            
	//* 134  234:ldc1            #141 <Float 100F>
	//* 135  236:fdiv            
	//* 136  237:fstore_3        
	//* 137  238:aload_0         
	//* 138  239:aload_1         
	//* 139  240:iload           7
	//* 140  242:i2f             
	//* 141  243:iload           8
	//* 142  245:i2f             
	//* 143  246:aload_0         
	//* 144  247:getfield        #69  <Field int mColor1>
	//* 145  250:fload_3         
	//* 146  251:invokespecial   #155 <Method void drawCircle(Canvas, float, float, int, float)>
	//* 147  254:fload_2         
	//* 148  255:fconst_0        
	//* 149  256:fcmpl           
	//* 150  257:iflt            290
	//* 151  260:fload_2         
	//* 152  261:ldc1            #156 <Float 50F>
	//* 153  263:fcmpg           
	//* 154  264:ifgt            290
	//* 155  267:fconst_2        
	//* 156  268:fload_2         
	//* 157  269:fmul            
	//* 158  270:ldc1            #141 <Float 100F>
	//* 159  272:fdiv            
	//* 160  273:fstore_3        
	//* 161  274:aload_0         
	//* 162  275:aload_1         
	//* 163  276:iload           7
	//* 164  278:i2f             
	//* 165  279:iload           8
	//* 166  281:i2f             
	//* 167  282:aload_0         
	//* 168  283:getfield        #71  <Field int mColor2>
	//* 169  286:fload_3         
	//* 170  287:invokespecial   #155 <Method void drawCircle(Canvas, float, float, int, float)>
	//* 171  290:fload_2         
	//* 172  291:ldc1            #153 <Float 25F>
	//* 173  293:fcmpl           
	//* 174  294:iflt            330
	//* 175  297:fload_2         
	//* 176  298:ldc1            #157 <Float 75F>
	//* 177  300:fcmpg           
	//* 178  301:ifgt            330
	//* 179  304:fload_2         
	//* 180  305:ldc1            #153 <Float 25F>
	//* 181  307:fsub            
	//* 182  308:fconst_2        
	//* 183  309:fmul            
	//* 184  310:ldc1            #141 <Float 100F>
	//* 185  312:fdiv            
	//* 186  313:fstore_3        
	//* 187  314:aload_0         
	//* 188  315:aload_1         
	//* 189  316:iload           7
	//* 190  318:i2f             
	//* 191  319:iload           8
	//* 192  321:i2f             
	//* 193  322:aload_0         
	//* 194  323:getfield        #73  <Field int mColor3>
	//* 195  326:fload_3         
	//* 196  327:invokespecial   #155 <Method void drawCircle(Canvas, float, float, int, float)>
	//* 197  330:fload_2         
	//* 198  331:ldc1            #156 <Float 50F>
	//* 199  333:fcmpl           
	//* 200  334:iflt            370
	//* 201  337:fload_2         
	//* 202  338:ldc1            #141 <Float 100F>
	//* 203  340:fcmpg           
	//* 204  341:ifgt            370
	//* 205  344:fload_2         
	//* 206  345:ldc1            #156 <Float 50F>
	//* 207  347:fsub            
	//* 208  348:fconst_2        
	//* 209  349:fmul            
	//* 210  350:ldc1            #141 <Float 100F>
	//* 211  352:fdiv            
	//* 212  353:fstore_3        
	//* 213  354:aload_0         
	//* 214  355:aload_1         
	//* 215  356:iload           7
	//* 216  358:i2f             
	//* 217  359:iload           8
	//* 218  361:i2f             
	//* 219  362:aload_0         
	//* 220  363:getfield        #75  <Field int mColor4>
	//* 221  366:fload_3         
	//* 222  367:invokespecial   #155 <Method void drawCircle(Canvas, float, float, int, float)>
	//* 223  370:fload_2         
	//* 224  371:ldc1            #157 <Float 75F>
	//* 225  373:fcmpl           
	//* 226  374:iflt            410
	//* 227  377:fload_2         
	//* 228  378:ldc1            #141 <Float 100F>
	//* 229  380:fcmpg           
	//* 230  381:ifgt            410
	//* 231  384:fload_2         
	//* 232  385:ldc1            #157 <Float 75F>
	//* 233  387:fsub            
	//* 234  388:fconst_2        
	//* 235  389:fmul            
	//* 236  390:ldc1            #141 <Float 100F>
	//* 237  392:fdiv            
	//* 238  393:fstore_2        
	//* 239  394:aload_0         
	//* 240  395:aload_1         
	//* 241  396:iload           7
	//* 242  398:i2f             
	//* 243  399:iload           8
	//* 244  401:i2f             
	//* 245  402:aload_0         
	//* 246  403:getfield        #69  <Field int mColor1>
	//* 247  406:fload_2         
	//* 248  407:invokespecial   #155 <Method void drawCircle(Canvas, float, float, int, float)>
	//* 249  410:aload_0         
	//* 250  411:getfield        #110 <Field float mTriggerPercentage>
	//* 251  414:fconst_0        
	//* 252  415:fcmpl           
	//* 253  416:ifle            628
	//* 254  419:iload           6
	//* 255  421:ifeq            628
	//* 256  424:aload_1         
	//* 257  425:iload           5
	//* 258  427:invokevirtual   #160 <Method void Canvas.restoreToCount(int)>
	//* 259  430:aload_1         
	//* 260  431:invokevirtual   #87  <Method int Canvas.save()>
	//* 261  434:istore          5
	//* 262  436:aload_1         
	//* 263  437:aload_0         
	//* 264  438:getfield        #65  <Field Rect mBounds>
	//* 265  441:invokevirtual   #122 <Method boolean Canvas.clipRect(Rect)>
	//* 266  444:pop             
	//* 267  445:aload_0         
	//* 268  446:aload_1         
	//* 269  447:iload           7
	//* 270  449:iload           8
	//* 271  451:invokespecial   #162 <Method void drawTrigger(Canvas, int, int)>
	//* 272  454:aload_0         
	//* 273  455:getfield        #67  <Field View mParent>
	//* 274  458:aload_0         
	//* 275  459:getfield        #65  <Field Rect mBounds>
	//* 276  462:getfield        #165 <Field int Rect.left>
	//* 277  465:aload_0         
	//* 278  466:getfield        #65  <Field Rect mBounds>
	//* 279  469:getfield        #168 <Field int Rect.top>
	//* 280  472:aload_0         
	//* 281  473:getfield        #65  <Field Rect mBounds>
	//* 282  476:getfield        #171 <Field int Rect.right>
	//* 283  479:aload_0         
	//* 284  480:getfield        #65  <Field Rect mBounds>
	//* 285  483:getfield        #174 <Field int Rect.bottom>
	//* 286  486:invokestatic    #180 <Method void ViewCompat.postInvalidateOnAnimation(View, int, int, int, int)>
	//* 287  489:iload           5
	//* 288  491:istore          6
	//* 289  493:aload_1         
	//* 290  494:iload           6
	//* 291  496:invokevirtual   #160 <Method void Canvas.restoreToCount(int)>
	//* 292  499:return          
	//* 293  500:fload_2         
	//* 294  501:fconst_0        
	//* 295  502:fcmpl           
	//* 296  503:iflt            524
	//* 297  506:fload_2         
	//* 298  507:ldc1            #153 <Float 25F>
	//* 299  509:fcmpg           
	//* 300  510:ifge            524
	//* 301  513:aload_1         
	//* 302  514:aload_0         
	//* 303  515:getfield        #75  <Field int mColor4>
	//* 304  518:invokevirtual   #152 <Method void Canvas.drawColor(int)>
	//* 305  521:goto            215
	//* 306  524:fload_2         
	//* 307  525:ldc1            #153 <Float 25F>
	//* 308  527:fcmpl           
	//* 309  528:iflt            549
	//* 310  531:fload_2         
	//* 311  532:ldc1            #156 <Float 50F>
	//* 312  534:fcmpg           
	//* 313  535:ifge            549
	//* 314  538:aload_1         
	//* 315  539:aload_0         
	//* 316  540:getfield        #69  <Field int mColor1>
	//* 317  543:invokevirtual   #152 <Method void Canvas.drawColor(int)>
	//* 318  546:goto            215
	//* 319  549:fload_2         
	//* 320  550:ldc1            #156 <Float 50F>
	//* 321  552:fcmpl           
	//* 322  553:iflt            574
	//* 323  556:fload_2         
	//* 324  557:ldc1            #157 <Float 75F>
	//* 325  559:fcmpg           
	//* 326  560:ifge            574
	//* 327  563:aload_1         
	//* 328  564:aload_0         
	//* 329  565:getfield        #71  <Field int mColor2>
	//* 330  568:invokevirtual   #152 <Method void Canvas.drawColor(int)>
	//* 331  571:goto            215
	//* 332  574:aload_1         
	//* 333  575:aload_0         
	//* 334  576:getfield        #73  <Field int mColor3>
	//* 335  579:invokevirtual   #152 <Method void Canvas.drawColor(int)>
	//* 336  582:goto            215
	//* 337  585:iload           5
	//* 338  587:istore          6
	//* 339  589:aload_0         
	//* 340  590:getfield        #110 <Field float mTriggerPercentage>
	//* 341  593:fconst_0        
	//* 342  594:fcmpl           
	//* 343  595:ifle            493
	//* 344  598:iload           5
	//* 345  600:istore          6
	//* 346  602:aload_0         
	//* 347  603:getfield        #110 <Field float mTriggerPercentage>
	//* 348  606:f2d             
	//* 349  607:dconst_1        
	//* 350  608:dcmpg           
	//* 351  609:ifgt            493
	//* 352  612:aload_0         
	//* 353  613:aload_1         
	//* 354  614:iload           7
	//* 355  616:iload           8
	//* 356  618:invokespecial   #162 <Method void drawTrigger(Canvas, int, int)>
	//* 357  621:iload           5
	//* 358  623:istore          6
	//* 359  625:goto            493
	//* 360  628:goto            454
				{
					j = 0;
	//  361  631:iconst_0        
	//  362  632:istore          6
				}
				if(l3 == 0L)
					canvas.drawColor(mColor1);
				else
				if(f >= 0.0F && f < 25F)
					canvas.drawColor(mColor4);
				else
				if(f >= 25F && f < 50F)
					canvas.drawColor(mColor1);
				else
				if(f >= 50F && f < 75F)
					canvas.drawColor(mColor2);
				else
					canvas.drawColor(mColor3);
				if(f >= 0.0F && f <= 25F)
				{
					float f2 = ((25F + f) * 2.0F) / 100F;
					drawCircle(canvas, k, l, mColor1, f2);
				}
				if(f >= 0.0F && f <= 50F)
				{
					float f3 = (2.0F * f) / 100F;
					drawCircle(canvas, k, l, mColor2, f3);
				}
				if(f >= 25F && f <= 75F)
				{
					float f4 = ((f - 25F) * 2.0F) / 100F;
					drawCircle(canvas, k, l, mColor3, f4);
				}
				if(f >= 50F && f <= 100F)
				{
					float f5 = ((f - 50F) * 2.0F) / 100F;
					drawCircle(canvas, k, l, mColor4, f5);
				}
				if(f >= 75F && f <= 100F)
				{
					f = ((f - 75F) * 2.0F) / 100F;
					drawCircle(canvas, k, l, mColor1, f);
				}
				if(mTriggerPercentage > 0.0F && j != 0)
				{
					canvas.restoreToCount(i);
					i = canvas.save();
					canvas.clipRect(mBounds);
					drawTrigger(canvas, k, l);
				}
				ViewCompat.postInvalidateOnAnimation(mParent, mBounds.left, mBounds.top, mBounds.right, mBounds.bottom);
				j = i;
			}
			canvas.restoreToCount(j);
			return;
		}
		j = i;
		if(mTriggerPercentage > 0.0F)
		{
			j = i;
			if((double)mTriggerPercentage <= 1.0D)
			{
				drawTrigger(canvas, k, l);
				j = i;
			}
		}
		if(false)
			;
		else
			break MISSING_BLOCK_LABEL_493;
	//* 363  634:goto            200
	}

	boolean isRunning()
	{
		return mRunning || mFinishTime > 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field boolean mRunning>
	//    2    4:ifne            16
	//    3    7:aload_0         
	//    4    8:getfield        #126 <Field long mFinishTime>
	//    5   11:lconst_0        
	//    6   12:lcmp            
	//    7   13:ifle            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	void setBounds(int i, int j, int k, int l)
	{
		mBounds.left = i;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Rect mBounds>
	//    2    4:iload_1         
	//    3    5:putfield        #165 <Field int Rect.left>
		mBounds.top = j;
	//    4    8:aload_0         
	//    5    9:getfield        #65  <Field Rect mBounds>
	//    6   12:iload_2         
	//    7   13:putfield        #168 <Field int Rect.top>
		mBounds.right = k;
	//    8   16:aload_0         
	//    9   17:getfield        #65  <Field Rect mBounds>
	//   10   20:iload_3         
	//   11   21:putfield        #171 <Field int Rect.right>
		mBounds.bottom = l;
	//   12   24:aload_0         
	//   13   25:getfield        #65  <Field Rect mBounds>
	//   14   28:iload           4
	//   15   30:putfield        #174 <Field int Rect.bottom>
	//   16   33:return          
	}

	void setColorScheme(int i, int j, int k, int l)
	{
		mColor1 = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #69  <Field int mColor1>
		mColor2 = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #71  <Field int mColor2>
		mColor3 = k;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #73  <Field int mColor3>
		mColor4 = l;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #75  <Field int mColor4>
	//   12   21:return          
	}

	void setTriggerPercentage(float f)
	{
		mTriggerPercentage = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #110 <Field float mTriggerPercentage>
		mStartTime = 0L;
	//    3    5:aload_0         
	//    4    6:lconst_0        
	//    5    7:putfield        #134 <Field long mStartTime>
		ViewCompat.postInvalidateOnAnimation(mParent, mBounds.left, mBounds.top, mBounds.right, mBounds.bottom);
	//    6   10:aload_0         
	//    7   11:getfield        #67  <Field View mParent>
	//    8   14:aload_0         
	//    9   15:getfield        #65  <Field Rect mBounds>
	//   10   18:getfield        #165 <Field int Rect.left>
	//   11   21:aload_0         
	//   12   22:getfield        #65  <Field Rect mBounds>
	//   13   25:getfield        #168 <Field int Rect.top>
	//   14   28:aload_0         
	//   15   29:getfield        #65  <Field Rect mBounds>
	//   16   32:getfield        #171 <Field int Rect.right>
	//   17   35:aload_0         
	//   18   36:getfield        #65  <Field Rect mBounds>
	//   19   39:getfield        #174 <Field int Rect.bottom>
	//   20   42:invokestatic    #180 <Method void ViewCompat.postInvalidateOnAnimation(View, int, int, int, int)>
	//   21   45:return          
	}

	void start()
	{
		if(!mRunning)
	//*   0    0:aload_0         
	//*   1    1:getfield        #124 <Field boolean mRunning>
	//*   2    4:ifne            31
		{
			mTriggerPercentage = 0.0F;
	//    3    7:aload_0         
	//    4    8:fconst_0        
	//    5    9:putfield        #110 <Field float mTriggerPercentage>
			mStartTime = AnimationUtils.currentAnimationTimeMillis();
	//    6   12:aload_0         
	//    7   13:invokestatic    #132 <Method long AnimationUtils.currentAnimationTimeMillis()>
	//    8   16:putfield        #134 <Field long mStartTime>
			mRunning = true;
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:putfield        #124 <Field boolean mRunning>
			mParent.postInvalidate();
	//   12   24:aload_0         
	//   13   25:getfield        #67  <Field View mParent>
	//   14   28:invokevirtual   #193 <Method void View.postInvalidate()>
		}
	//   15   31:return          
	}

	void stop()
	{
		if(mRunning)
	//*   0    0:aload_0         
	//*   1    1:getfield        #124 <Field boolean mRunning>
	//*   2    4:ifeq            31
		{
			mTriggerPercentage = 0.0F;
	//    3    7:aload_0         
	//    4    8:fconst_0        
	//    5    9:putfield        #110 <Field float mTriggerPercentage>
			mFinishTime = AnimationUtils.currentAnimationTimeMillis();
	//    6   12:aload_0         
	//    7   13:invokestatic    #132 <Method long AnimationUtils.currentAnimationTimeMillis()>
	//    8   16:putfield        #126 <Field long mFinishTime>
			mRunning = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #124 <Field boolean mRunning>
			mParent.postInvalidate();
	//   12   24:aload_0         
	//   13   25:getfield        #67  <Field View mParent>
	//   14   28:invokevirtual   #193 <Method void View.postInvalidate()>
		}
	//   15   31:return          
	}

	private static final int ANIMATION_DURATION_MS = 2000;
	private static final int COLOR1 = 0xb3000000;
	private static final int COLOR2 = 0x80000000;
	private static final int COLOR3 = 0x4d000000;
	private static final int COLOR4 = 0x1a000000;
	private static final int FINISH_ANIMATION_DURATION_MS = 1000;
	private static final Interpolator INTERPOLATOR = new FastOutSlowInInterpolator();
	private Rect mBounds;
	private final RectF mClipRect = new RectF();
	private int mColor1;
	private int mColor2;
	private int mColor3;
	private int mColor4;
	private long mFinishTime;
	private final Paint mPaint = new Paint();
	private View mParent;
	private boolean mRunning;
	private long mStartTime;
	private float mTriggerPercentage;

	static 
	{
	//    0    0:new             #42  <Class FastOutSlowInInterpolator>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void FastOutSlowInInterpolator()>
	//    3    7:putstatic       #47  <Field Interpolator INTERPOLATOR>
	//*   4   10:return          
	}
}
