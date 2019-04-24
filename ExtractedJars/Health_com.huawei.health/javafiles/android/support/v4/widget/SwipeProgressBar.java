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
		int i = mBounds.width();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Rect mBounds>
	//    2    4:invokevirtual   #115 <Method int Rect.width()>
	//    3    7:istore          4
		int i1 = mBounds.height();
	//    4    9:aload_0         
	//    5   10:getfield        #65  <Field Rect mBounds>
	//    6   13:invokevirtual   #118 <Method int Rect.height()>
	//    7   16:istore          9
		int k = i / 2;
	//    8   18:iload           4
	//    9   20:iconst_2        
	//   10   21:idiv            
	//   11   22:istore          7
		int l = i1 / 2;
	//   12   24:iload           9
	//   13   26:iconst_2        
	//   14   27:idiv            
	//   15   28:istore          8
		boolean flag = false;
	//   16   30:iconst_0        
	//   17   31:istore          6
		int j = canvas.save();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #87  <Method int Canvas.save()>
	//   20   37:istore          5
		canvas.clipRect(mBounds);
	//   21   39:aload_1         
	//   22   40:aload_0         
	//   23   41:getfield        #65  <Field Rect mBounds>
	//   24   44:invokevirtual   #122 <Method boolean Canvas.clipRect(Rect)>
	//   25   47:pop             
		if(mRunning || mFinishTime > 0L)
	//*  26   48:aload_0         
	//*  27   49:getfield        #124 <Field boolean mRunning>
	//*  28   52:ifne            64
	//*  29   55:aload_0         
	//*  30   56:getfield        #126 <Field long mFinishTime>
	//*  31   59:lconst_0        
	//*  32   60:lcmp            
	//*  33   61:ifle            584
		{
			long l1 = AnimationUtils.currentAnimationTimeMillis();
	//   34   64:invokestatic    #132 <Method long AnimationUtils.currentAnimationTimeMillis()>
	//   35   67:lstore          10
			long l2 = mStartTime;
	//   36   69:aload_0         
	//   37   70:getfield        #134 <Field long mStartTime>
	//   38   73:lstore          12
			long l3 = (l1 - mStartTime) / 2000L;
	//   39   75:lload           10
	//   40   77:aload_0         
	//   41   78:getfield        #134 <Field long mStartTime>
	//   42   81:lsub            
	//   43   82:ldc2w           #135 <Long 2000L>
	//   44   85:ldiv            
	//   45   86:lstore          14
			float f = (float)((l1 - l2) % 2000L) / 20F;
	//   46   88:lload           10
	//   47   90:lload           12
	//   48   92:lsub            
	//   49   93:ldc2w           #135 <Long 2000L>
	//   50   96:lrem            
	//   51   97:l2f             
	//   52   98:ldc1            #137 <Float 20F>
	//   53  100:fdiv            
	//   54  101:fstore_2        
			if(!mRunning)
	//*  55  102:aload_0         
	//*  56  103:getfield        #124 <Field boolean mRunning>
	//*  57  106:ifne            199
			{
				if(l1 - mFinishTime >= 1000L)
	//*  58  109:lload           10
	//*  59  111:aload_0         
	//*  60  112:getfield        #126 <Field long mFinishTime>
	//*  61  115:lsub            
	//*  62  116:ldc2w           #138 <Long 1000L>
	//*  63  119:lcmp            
	//*  64  120:iflt            129
				{
					mFinishTime = 0L;
	//   65  123:aload_0         
	//   66  124:lconst_0        
	//   67  125:putfield        #126 <Field long mFinishTime>
					return;
	//   68  128:return          
				}
				float f1 = (float)((l1 - mFinishTime) % 1000L) / 10F / 100F;
	//   69  129:lload           10
	//   70  131:aload_0         
	//   71  132:getfield        #126 <Field long mFinishTime>
	//   72  135:lsub            
	//   73  136:ldc2w           #138 <Long 1000L>
	//   74  139:lrem            
	//   75  140:l2f             
	//   76  141:ldc1            #140 <Float 10F>
	//   77  143:fdiv            
	//   78  144:ldc1            #141 <Float 100F>
	//   79  146:fdiv            
	//   80  147:fstore_3        
				f1 = (float)(i / 2) * INTERPOLATOR.getInterpolation(f1);
	//   81  148:iload           4
	//   82  150:iconst_2        
	//   83  151:idiv            
	//   84  152:i2f             
	//   85  153:getstatic       #47  <Field Interpolator INTERPOLATOR>
	//   86  156:fload_3         
	//   87  157:invokeinterface #97  <Method float Interpolator.getInterpolation(float)>
	//   88  162:fmul            
	//   89  163:fstore_3        
				mClipRect.set((float)k - f1, 0.0F, (float)k + f1, i1);
	//   90  164:aload_0         
	//   91  165:getfield        #60  <Field RectF mClipRect>
	//   92  168:iload           7
	//   93  170:i2f             
	//   94  171:fload_3         
	//   95  172:fsub            
	//   96  173:fconst_0        
	//   97  174:iload           7
	//   98  176:i2f             
	//   99  177:fload_3         
	//  100  178:fadd            
	//  101  179:iload           9
	//  102  181:i2f             
	//  103  182:invokevirtual   #145 <Method void RectF.set(float, float, float, float)>
				canvas.saveLayerAlpha(mClipRect, 0, 0);
	//  104  185:aload_1         
	//  105  186:aload_0         
	//  106  187:getfield        #60  <Field RectF mClipRect>
	//  107  190:iconst_0        
	//  108  191:iconst_0        
	//  109  192:invokevirtual   #149 <Method int Canvas.saveLayerAlpha(RectF, int, int)>
	//  110  195:pop             
				flag = true;
	//  111  196:iconst_1        
	//  112  197:istore          6
			}
			if(l3 == 0L)
	//* 113  199:lload           14
	//* 114  201:lconst_0        
	//* 115  202:lcmp            
	//* 116  203:ifne            217
				canvas.drawColor(mColor1);
	//  117  206:aload_1         
	//  118  207:aload_0         
	//  119  208:getfield        #69  <Field int mColor1>
	//  120  211:invokevirtual   #152 <Method void Canvas.drawColor(int)>
			else
	//* 121  214:goto            299
			if(f >= 0.0F && f < 25F)
	//* 122  217:fload_2         
	//* 123  218:fconst_0        
	//* 124  219:fcmpl           
	//* 125  220:iflt            241
	//* 126  223:fload_2         
	//* 127  224:ldc1            #153 <Float 25F>
	//* 128  226:fcmpg           
	//* 129  227:ifge            241
				canvas.drawColor(mColor4);
	//  130  230:aload_1         
	//  131  231:aload_0         
	//  132  232:getfield        #75  <Field int mColor4>
	//  133  235:invokevirtual   #152 <Method void Canvas.drawColor(int)>
			else
	//* 134  238:goto            299
			if(f >= 25F && f < 50F)
	//* 135  241:fload_2         
	//* 136  242:ldc1            #153 <Float 25F>
	//* 137  244:fcmpl           
	//* 138  245:iflt            266
	//* 139  248:fload_2         
	//* 140  249:ldc1            #154 <Float 50F>
	//* 141  251:fcmpg           
	//* 142  252:ifge            266
				canvas.drawColor(mColor1);
	//  143  255:aload_1         
	//  144  256:aload_0         
	//  145  257:getfield        #69  <Field int mColor1>
	//  146  260:invokevirtual   #152 <Method void Canvas.drawColor(int)>
			else
	//* 147  263:goto            299
			if(f >= 50F && f < 75F)
	//* 148  266:fload_2         
	//* 149  267:ldc1            #154 <Float 50F>
	//* 150  269:fcmpl           
	//* 151  270:iflt            291
	//* 152  273:fload_2         
	//* 153  274:ldc1            #155 <Float 75F>
	//* 154  276:fcmpg           
	//* 155  277:ifge            291
				canvas.drawColor(mColor2);
	//  156  280:aload_1         
	//  157  281:aload_0         
	//  158  282:getfield        #71  <Field int mColor2>
	//  159  285:invokevirtual   #152 <Method void Canvas.drawColor(int)>
			else
	//* 160  288:goto            299
				canvas.drawColor(mColor3);
	//  161  291:aload_1         
	//  162  292:aload_0         
	//  163  293:getfield        #73  <Field int mColor3>
	//  164  296:invokevirtual   #152 <Method void Canvas.drawColor(int)>
			if(f >= 0.0F && f <= 25F)
	//* 165  299:fload_2         
	//* 166  300:fconst_0        
	//* 167  301:fcmpl           
	//* 168  302:iflt            338
	//* 169  305:fload_2         
	//* 170  306:ldc1            #153 <Float 25F>
	//* 171  308:fcmpg           
	//* 172  309:ifgt            338
			{
				float f2 = ((25F + f) * 2.0F) / 100F;
	//  173  312:ldc1            #153 <Float 25F>
	//  174  314:fload_2         
	//  175  315:fadd            
	//  176  316:fconst_2        
	//  177  317:fmul            
	//  178  318:ldc1            #141 <Float 100F>
	//  179  320:fdiv            
	//  180  321:fstore_3        
				drawCircle(canvas, k, l, mColor1, f2);
	//  181  322:aload_0         
	//  182  323:aload_1         
	//  183  324:iload           7
	//  184  326:i2f             
	//  185  327:iload           8
	//  186  329:i2f             
	//  187  330:aload_0         
	//  188  331:getfield        #69  <Field int mColor1>
	//  189  334:fload_3         
	//  190  335:invokespecial   #157 <Method void drawCircle(Canvas, float, float, int, float)>
			}
			if(f >= 0.0F && f <= 50F)
	//* 191  338:fload_2         
	//* 192  339:fconst_0        
	//* 193  340:fcmpl           
	//* 194  341:iflt            374
	//* 195  344:fload_2         
	//* 196  345:ldc1            #154 <Float 50F>
	//* 197  347:fcmpg           
	//* 198  348:ifgt            374
			{
				float f3 = (2.0F * f) / 100F;
	//  199  351:fconst_2        
	//  200  352:fload_2         
	//  201  353:fmul            
	//  202  354:ldc1            #141 <Float 100F>
	//  203  356:fdiv            
	//  204  357:fstore_3        
				drawCircle(canvas, k, l, mColor2, f3);
	//  205  358:aload_0         
	//  206  359:aload_1         
	//  207  360:iload           7
	//  208  362:i2f             
	//  209  363:iload           8
	//  210  365:i2f             
	//  211  366:aload_0         
	//  212  367:getfield        #71  <Field int mColor2>
	//  213  370:fload_3         
	//  214  371:invokespecial   #157 <Method void drawCircle(Canvas, float, float, int, float)>
			}
			if(f >= 25F && f <= 75F)
	//* 215  374:fload_2         
	//* 216  375:ldc1            #153 <Float 25F>
	//* 217  377:fcmpl           
	//* 218  378:iflt            414
	//* 219  381:fload_2         
	//* 220  382:ldc1            #155 <Float 75F>
	//* 221  384:fcmpg           
	//* 222  385:ifgt            414
			{
				float f4 = ((f - 25F) * 2.0F) / 100F;
	//  223  388:fload_2         
	//  224  389:ldc1            #153 <Float 25F>
	//  225  391:fsub            
	//  226  392:fconst_2        
	//  227  393:fmul            
	//  228  394:ldc1            #141 <Float 100F>
	//  229  396:fdiv            
	//  230  397:fstore_3        
				drawCircle(canvas, k, l, mColor3, f4);
	//  231  398:aload_0         
	//  232  399:aload_1         
	//  233  400:iload           7
	//  234  402:i2f             
	//  235  403:iload           8
	//  236  405:i2f             
	//  237  406:aload_0         
	//  238  407:getfield        #73  <Field int mColor3>
	//  239  410:fload_3         
	//  240  411:invokespecial   #157 <Method void drawCircle(Canvas, float, float, int, float)>
			}
			if(f >= 50F && f <= 100F)
	//* 241  414:fload_2         
	//* 242  415:ldc1            #154 <Float 50F>
	//* 243  417:fcmpl           
	//* 244  418:iflt            454
	//* 245  421:fload_2         
	//* 246  422:ldc1            #141 <Float 100F>
	//* 247  424:fcmpg           
	//* 248  425:ifgt            454
			{
				float f5 = ((f - 50F) * 2.0F) / 100F;
	//  249  428:fload_2         
	//  250  429:ldc1            #154 <Float 50F>
	//  251  431:fsub            
	//  252  432:fconst_2        
	//  253  433:fmul            
	//  254  434:ldc1            #141 <Float 100F>
	//  255  436:fdiv            
	//  256  437:fstore_3        
				drawCircle(canvas, k, l, mColor4, f5);
	//  257  438:aload_0         
	//  258  439:aload_1         
	//  259  440:iload           7
	//  260  442:i2f             
	//  261  443:iload           8
	//  262  445:i2f             
	//  263  446:aload_0         
	//  264  447:getfield        #75  <Field int mColor4>
	//  265  450:fload_3         
	//  266  451:invokespecial   #157 <Method void drawCircle(Canvas, float, float, int, float)>
			}
			if(f >= 75F && f <= 100F)
	//* 267  454:fload_2         
	//* 268  455:ldc1            #155 <Float 75F>
	//* 269  457:fcmpl           
	//* 270  458:iflt            494
	//* 271  461:fload_2         
	//* 272  462:ldc1            #141 <Float 100F>
	//* 273  464:fcmpg           
	//* 274  465:ifgt            494
			{
				f = ((f - 75F) * 2.0F) / 100F;
	//  275  468:fload_2         
	//  276  469:ldc1            #155 <Float 75F>
	//  277  471:fsub            
	//  278  472:fconst_2        
	//  279  473:fmul            
	//  280  474:ldc1            #141 <Float 100F>
	//  281  476:fdiv            
	//  282  477:fstore_2        
				drawCircle(canvas, k, l, mColor1, f);
	//  283  478:aload_0         
	//  284  479:aload_1         
	//  285  480:iload           7
	//  286  482:i2f             
	//  287  483:iload           8
	//  288  485:i2f             
	//  289  486:aload_0         
	//  290  487:getfield        #69  <Field int mColor1>
	//  291  490:fload_2         
	//  292  491:invokespecial   #157 <Method void drawCircle(Canvas, float, float, int, float)>
			}
			i = j;
	//  293  494:iload           5
	//  294  496:istore          4
			if(mTriggerPercentage > 0.0F)
	//* 295  498:aload_0         
	//* 296  499:getfield        #110 <Field float mTriggerPercentage>
	//* 297  502:fconst_0        
	//* 298  503:fcmpl           
	//* 299  504:ifle            546
			{
				i = j;
	//  300  507:iload           5
	//  301  509:istore          4
				if(flag)
	//* 302  511:iload           6
	//* 303  513:ifeq            546
				{
					canvas.restoreToCount(j);
	//  304  516:aload_1         
	//  305  517:iload           5
	//  306  519:invokevirtual   #160 <Method void Canvas.restoreToCount(int)>
					i = canvas.save();
	//  307  522:aload_1         
	//  308  523:invokevirtual   #87  <Method int Canvas.save()>
	//  309  526:istore          4
					canvas.clipRect(mBounds);
	//  310  528:aload_1         
	//  311  529:aload_0         
	//  312  530:getfield        #65  <Field Rect mBounds>
	//  313  533:invokevirtual   #122 <Method boolean Canvas.clipRect(Rect)>
	//  314  536:pop             
					drawTrigger(canvas, k, l);
	//  315  537:aload_0         
	//  316  538:aload_1         
	//  317  539:iload           7
	//  318  541:iload           8
	//  319  543:invokespecial   #162 <Method void drawTrigger(Canvas, int, int)>
				}
			}
			ViewCompat.postInvalidateOnAnimation(mParent, mBounds.left, mBounds.top, mBounds.right, mBounds.bottom);
	//  320  546:aload_0         
	//  321  547:getfield        #67  <Field View mParent>
	//  322  550:aload_0         
	//  323  551:getfield        #65  <Field Rect mBounds>
	//  324  554:getfield        #165 <Field int Rect.left>
	//  325  557:aload_0         
	//  326  558:getfield        #65  <Field Rect mBounds>
	//  327  561:getfield        #168 <Field int Rect.top>
	//  328  564:aload_0         
	//  329  565:getfield        #65  <Field Rect mBounds>
	//  330  568:getfield        #171 <Field int Rect.right>
	//  331  571:aload_0         
	//  332  572:getfield        #65  <Field Rect mBounds>
	//  333  575:getfield        #174 <Field int Rect.bottom>
	//  334  578:invokestatic    #180 <Method void ViewCompat.postInvalidateOnAnimation(View, int, int, int, int)>
		} else
	//* 335  581:goto            624
		{
			i = j;
	//  336  584:iload           5
	//  337  586:istore          4
			if(mTriggerPercentage > 0.0F)
	//* 338  588:aload_0         
	//* 339  589:getfield        #110 <Field float mTriggerPercentage>
	//* 340  592:fconst_0        
	//* 341  593:fcmpl           
	//* 342  594:ifle            624
			{
				i = j;
	//  343  597:iload           5
	//  344  599:istore          4
				if((double)mTriggerPercentage <= 1.0D)
	//* 345  601:aload_0         
	//* 346  602:getfield        #110 <Field float mTriggerPercentage>
	//* 347  605:f2d             
	//* 348  606:dconst_1        
	//* 349  607:dcmpg           
	//* 350  608:ifgt            624
				{
					drawTrigger(canvas, k, l);
	//  351  611:aload_0         
	//  352  612:aload_1         
	//  353  613:iload           7
	//  354  615:iload           8
	//  355  617:invokespecial   #162 <Method void drawTrigger(Canvas, int, int)>
					i = j;
	//  356  620:iload           5
	//  357  622:istore          4
				}
			}
		}
		canvas.restoreToCount(i);
	//  358  624:aload_1         
	//  359  625:iload           4
	//  360  627:invokevirtual   #160 <Method void Canvas.restoreToCount(int)>
	//  361  630:return          
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
