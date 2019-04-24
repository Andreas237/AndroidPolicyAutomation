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
		int i;
		int j;
		boolean flag;
		int k;
		int l;
		int i1;
		i = mBounds.width();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Rect mBounds>
	//    2    4:invokevirtual   #115 <Method int Rect.width()>
	//    3    7:istore          4
		i1 = mBounds.height();
	//    4    9:aload_0         
	//    5   10:getfield        #65  <Field Rect mBounds>
	//    6   13:invokevirtual   #118 <Method int Rect.height()>
	//    7   16:istore          9
		k = i / 2;
	//    8   18:iload           4
	//    9   20:iconst_2        
	//   10   21:idiv            
	//   11   22:istore          7
		l = i1 / 2;
	//   12   24:iload           9
	//   13   26:iconst_2        
	//   14   27:idiv            
	//   15   28:istore          8
		flag = false;
	//   16   30:iconst_0        
	//   17   31:istore          6
		j = canvas.save();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #87  <Method int Canvas.save()>
	//   20   37:istore          5
		canvas.clipRect(mBounds);
	//   21   39:aload_1         
	//   22   40:aload_0         
	//   23   41:getfield        #65  <Field Rect mBounds>
	//   24   44:invokevirtual   #122 <Method boolean Canvas.clipRect(Rect)>
	//   25   47:pop             
		if(!mRunning && mFinishTime <= 0L) goto _L2; else goto _L1
	//   26   48:aload_0         
	//   27   49:getfield        #124 <Field boolean mRunning>
	//   28   52:ifne            64
	//   29   55:aload_0         
	//   30   56:getfield        #126 <Field long mFinishTime>
	//   31   59:lconst_0        
	//   32   60:lcmp            
	//   33   61:ifle            588
_L1:
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
	//* 116  203:ifne            503
			canvas.drawColor(mColor1);
	//  117  206:aload_1         
	//  118  207:aload_0         
	//  119  208:getfield        #69  <Field int mColor1>
	//  120  211:invokevirtual   #152 <Method void Canvas.drawColor(int)>
		else
	//* 121  214:fload_2         
	//* 122  215:fconst_0        
	//* 123  216:fcmpl           
	//* 124  217:iflt            253
	//* 125  220:fload_2         
	//* 126  221:ldc1            #153 <Float 25F>
	//* 127  223:fcmpg           
	//* 128  224:ifgt            253
	//* 129  227:ldc1            #153 <Float 25F>
	//* 130  229:fload_2         
	//* 131  230:fadd            
	//* 132  231:fconst_2        
	//* 133  232:fmul            
	//* 134  233:ldc1            #141 <Float 100F>
	//* 135  235:fdiv            
	//* 136  236:fstore_3        
	//* 137  237:aload_0         
	//* 138  238:aload_1         
	//* 139  239:iload           7
	//* 140  241:i2f             
	//* 141  242:iload           8
	//* 142  244:i2f             
	//* 143  245:aload_0         
	//* 144  246:getfield        #69  <Field int mColor1>
	//* 145  249:fload_3         
	//* 146  250:invokespecial   #155 <Method void drawCircle(Canvas, float, float, int, float)>
	//* 147  253:fload_2         
	//* 148  254:fconst_0        
	//* 149  255:fcmpl           
	//* 150  256:iflt            289
	//* 151  259:fload_2         
	//* 152  260:ldc1            #156 <Float 50F>
	//* 153  262:fcmpg           
	//* 154  263:ifgt            289
	//* 155  266:fconst_2        
	//* 156  267:fload_2         
	//* 157  268:fmul            
	//* 158  269:ldc1            #141 <Float 100F>
	//* 159  271:fdiv            
	//* 160  272:fstore_3        
	//* 161  273:aload_0         
	//* 162  274:aload_1         
	//* 163  275:iload           7
	//* 164  277:i2f             
	//* 165  278:iload           8
	//* 166  280:i2f             
	//* 167  281:aload_0         
	//* 168  282:getfield        #71  <Field int mColor2>
	//* 169  285:fload_3         
	//* 170  286:invokespecial   #155 <Method void drawCircle(Canvas, float, float, int, float)>
	//* 171  289:fload_2         
	//* 172  290:ldc1            #153 <Float 25F>
	//* 173  292:fcmpl           
	//* 174  293:iflt            329
	//* 175  296:fload_2         
	//* 176  297:ldc1            #157 <Float 75F>
	//* 177  299:fcmpg           
	//* 178  300:ifgt            329
	//* 179  303:fload_2         
	//* 180  304:ldc1            #153 <Float 25F>
	//* 181  306:fsub            
	//* 182  307:fconst_2        
	//* 183  308:fmul            
	//* 184  309:ldc1            #141 <Float 100F>
	//* 185  311:fdiv            
	//* 186  312:fstore_3        
	//* 187  313:aload_0         
	//* 188  314:aload_1         
	//* 189  315:iload           7
	//* 190  317:i2f             
	//* 191  318:iload           8
	//* 192  320:i2f             
	//* 193  321:aload_0         
	//* 194  322:getfield        #73  <Field int mColor3>
	//* 195  325:fload_3         
	//* 196  326:invokespecial   #155 <Method void drawCircle(Canvas, float, float, int, float)>
	//* 197  329:fload_2         
	//* 198  330:ldc1            #156 <Float 50F>
	//* 199  332:fcmpl           
	//* 200  333:iflt            369
	//* 201  336:fload_2         
	//* 202  337:ldc1            #141 <Float 100F>
	//* 203  339:fcmpg           
	//* 204  340:ifgt            369
	//* 205  343:fload_2         
	//* 206  344:ldc1            #156 <Float 50F>
	//* 207  346:fsub            
	//* 208  347:fconst_2        
	//* 209  348:fmul            
	//* 210  349:ldc1            #141 <Float 100F>
	//* 211  351:fdiv            
	//* 212  352:fstore_3        
	//* 213  353:aload_0         
	//* 214  354:aload_1         
	//* 215  355:iload           7
	//* 216  357:i2f             
	//* 217  358:iload           8
	//* 218  360:i2f             
	//* 219  361:aload_0         
	//* 220  362:getfield        #75  <Field int mColor4>
	//* 221  365:fload_3         
	//* 222  366:invokespecial   #155 <Method void drawCircle(Canvas, float, float, int, float)>
	//* 223  369:fload_2         
	//* 224  370:ldc1            #157 <Float 75F>
	//* 225  372:fcmpl           
	//* 226  373:iflt            409
	//* 227  376:fload_2         
	//* 228  377:ldc1            #141 <Float 100F>
	//* 229  379:fcmpg           
	//* 230  380:ifgt            409
	//* 231  383:fload_2         
	//* 232  384:ldc1            #157 <Float 75F>
	//* 233  386:fsub            
	//* 234  387:fconst_2        
	//* 235  388:fmul            
	//* 236  389:ldc1            #141 <Float 100F>
	//* 237  391:fdiv            
	//* 238  392:fstore_2        
	//* 239  393:aload_0         
	//* 240  394:aload_1         
	//* 241  395:iload           7
	//* 242  397:i2f             
	//* 243  398:iload           8
	//* 244  400:i2f             
	//* 245  401:aload_0         
	//* 246  402:getfield        #69  <Field int mColor1>
	//* 247  405:fload_2         
	//* 248  406:invokespecial   #155 <Method void drawCircle(Canvas, float, float, int, float)>
	//* 249  409:iload           5
	//* 250  411:istore          4
	//* 251  413:aload_0         
	//* 252  414:getfield        #110 <Field float mTriggerPercentage>
	//* 253  417:fconst_0        
	//* 254  418:fcmpl           
	//* 255  419:ifle            461
	//* 256  422:iload           5
	//* 257  424:istore          4
	//* 258  426:iload           6
	//* 259  428:ifeq            461
	//* 260  431:aload_1         
	//* 261  432:iload           5
	//* 262  434:invokevirtual   #160 <Method void Canvas.restoreToCount(int)>
	//* 263  437:aload_1         
	//* 264  438:invokevirtual   #87  <Method int Canvas.save()>
	//* 265  441:istore          4
	//* 266  443:aload_1         
	//* 267  444:aload_0         
	//* 268  445:getfield        #65  <Field Rect mBounds>
	//* 269  448:invokevirtual   #122 <Method boolean Canvas.clipRect(Rect)>
	//* 270  451:pop             
	//* 271  452:aload_0         
	//* 272  453:aload_1         
	//* 273  454:iload           7
	//* 274  456:iload           8
	//* 275  458:invokespecial   #162 <Method void drawTrigger(Canvas, int, int)>
	//* 276  461:aload_0         
	//* 277  462:getfield        #67  <Field View mParent>
	//* 278  465:aload_0         
	//* 279  466:getfield        #65  <Field Rect mBounds>
	//* 280  469:getfield        #165 <Field int Rect.left>
	//* 281  472:aload_0         
	//* 282  473:getfield        #65  <Field Rect mBounds>
	//* 283  476:getfield        #168 <Field int Rect.top>
	//* 284  479:aload_0         
	//* 285  480:getfield        #65  <Field Rect mBounds>
	//* 286  483:getfield        #171 <Field int Rect.right>
	//* 287  486:aload_0         
	//* 288  487:getfield        #65  <Field Rect mBounds>
	//* 289  490:getfield        #174 <Field int Rect.bottom>
	//* 290  493:invokestatic    #180 <Method void ViewCompat.postInvalidateOnAnimation(View, int, int, int, int)>
	//* 291  496:aload_1         
	//* 292  497:iload           4
	//* 293  499:invokevirtual   #160 <Method void Canvas.restoreToCount(int)>
	//* 294  502:return          
		if(f >= 0.0F && f < 25F)
	//* 295  503:fload_2         
	//* 296  504:fconst_0        
	//* 297  505:fcmpl           
	//* 298  506:iflt            527
	//* 299  509:fload_2         
	//* 300  510:ldc1            #153 <Float 25F>
	//* 301  512:fcmpg           
	//* 302  513:ifge            527
			canvas.drawColor(mColor4);
	//  303  516:aload_1         
	//  304  517:aload_0         
	//  305  518:getfield        #75  <Field int mColor4>
	//  306  521:invokevirtual   #152 <Method void Canvas.drawColor(int)>
		else
	//* 307  524:goto            214
		if(f >= 25F && f < 50F)
	//* 308  527:fload_2         
	//* 309  528:ldc1            #153 <Float 25F>
	//* 310  530:fcmpl           
	//* 311  531:iflt            552
	//* 312  534:fload_2         
	//* 313  535:ldc1            #156 <Float 50F>
	//* 314  537:fcmpg           
	//* 315  538:ifge            552
			canvas.drawColor(mColor1);
	//  316  541:aload_1         
	//  317  542:aload_0         
	//  318  543:getfield        #69  <Field int mColor1>
	//  319  546:invokevirtual   #152 <Method void Canvas.drawColor(int)>
		else
	//* 320  549:goto            214
		if(f >= 50F && f < 75F)
	//* 321  552:fload_2         
	//* 322  553:ldc1            #156 <Float 50F>
	//* 323  555:fcmpl           
	//* 324  556:iflt            577
	//* 325  559:fload_2         
	//* 326  560:ldc1            #157 <Float 75F>
	//* 327  562:fcmpg           
	//* 328  563:ifge            577
			canvas.drawColor(mColor2);
	//  329  566:aload_1         
	//  330  567:aload_0         
	//  331  568:getfield        #71  <Field int mColor2>
	//  332  571:invokevirtual   #152 <Method void Canvas.drawColor(int)>
		else
	//* 333  574:goto            214
			canvas.drawColor(mColor3);
	//  334  577:aload_1         
	//  335  578:aload_0         
	//  336  579:getfield        #73  <Field int mColor3>
	//  337  582:invokevirtual   #152 <Method void Canvas.drawColor(int)>
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
		i = j;
		if(mTriggerPercentage > 0.0F)
		{
			i = j;
			if(flag)
			{
				canvas.restoreToCount(j);
				i = canvas.save();
				canvas.clipRect(mBounds);
				drawTrigger(canvas, k, l);
			}
		}
		ViewCompat.postInvalidateOnAnimation(mParent, mBounds.left, mBounds.top, mBounds.right, mBounds.bottom);
_L4:
		canvas.restoreToCount(i);
		return;
	//* 338  585:goto            214
_L2:
		i = j;
	//  339  588:iload           5
	//  340  590:istore          4
		if(mTriggerPercentage > 0.0F)
	//* 341  592:aload_0         
	//* 342  593:getfield        #110 <Field float mTriggerPercentage>
	//* 343  596:fconst_0        
	//* 344  597:fcmpl           
	//* 345  598:ifle            496
		{
			i = j;
	//  346  601:iload           5
	//  347  603:istore          4
			if((double)mTriggerPercentage <= 1.0D)
	//* 348  605:aload_0         
	//* 349  606:getfield        #110 <Field float mTriggerPercentage>
	//* 350  609:f2d             
	//* 351  610:dconst_1        
	//* 352  611:dcmpg           
	//* 353  612:ifgt            496
			{
				drawTrigger(canvas, k, l);
	//  354  615:aload_0         
	//  355  616:aload_1         
	//  356  617:iload           7
	//  357  619:iload           8
	//  358  621:invokespecial   #162 <Method void drawTrigger(Canvas, int, int)>
				i = j;
	//  359  624:iload           5
	//  360  626:istore          4
			}
		}
		if(true) goto _L4; else goto _L3
	//  361  628:goto            496
_L3:
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
