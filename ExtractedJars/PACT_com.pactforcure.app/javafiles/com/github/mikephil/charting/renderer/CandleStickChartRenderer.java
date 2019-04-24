// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ICandleDataSet;
import com.github.mikephil.charting.utils.*;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.renderer:
//			LineScatterCandleRadarRenderer

public class CandleStickChartRenderer extends LineScatterCandleRadarRenderer
{

	public CandleStickChartRenderer(CandleDataProvider candledataprovider, ChartAnimator chartanimator, ViewPortHandler viewporthandler)
	{
		super(chartanimator, viewporthandler);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #17  <Method void LineScatterCandleRadarRenderer(ChartAnimator, ViewPortHandler)>
		mShadowBuffers = new float[8];
	//    4    6:aload_0         
	//    5    7:bipush          8
	//    6    9:newarray        float[]
	//    7   11:putfield        #19  <Field float[] mShadowBuffers>
		mBodyBuffers = new float[4];
	//    8   14:aload_0         
	//    9   15:iconst_4        
	//   10   16:newarray        float[]
	//   11   18:putfield        #21  <Field float[] mBodyBuffers>
		mRangeBuffers = new float[4];
	//   12   21:aload_0         
	//   13   22:iconst_4        
	//   14   23:newarray        float[]
	//   15   25:putfield        #23  <Field float[] mRangeBuffers>
		mOpenBuffers = new float[4];
	//   16   28:aload_0         
	//   17   29:iconst_4        
	//   18   30:newarray        float[]
	//   19   32:putfield        #25  <Field float[] mOpenBuffers>
		mCloseBuffers = new float[4];
	//   20   35:aload_0         
	//   21   36:iconst_4        
	//   22   37:newarray        float[]
	//   23   39:putfield        #27  <Field float[] mCloseBuffers>
		mChart = candledataprovider;
	//   24   42:aload_0         
	//   25   43:aload_1         
	//   26   44:putfield        #29  <Field CandleDataProvider mChart>
	//   27   47:return          
	}

	public void drawData(Canvas canvas)
	{
		Iterator iterator = mChart.getCandleData().getDataSets().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field CandleDataProvider mChart>
	//    2    4:invokeinterface #38  <Method CandleData CandleDataProvider.getCandleData()>
	//    3    9:invokevirtual   #44  <Method List CandleData.getDataSets()>
	//    4   12:invokeinterface #50  <Method Iterator List.iterator()>
	//    5   17:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    6   18:aload_2         
	//    7   19:invokeinterface #56  <Method boolean Iterator.hasNext()>
	//    8   24:ifeq            64
			ICandleDataSet icandledataset = (ICandleDataSet)iterator.next();
	//    9   27:aload_2         
	//   10   28:invokeinterface #60  <Method Object Iterator.next()>
	//   11   33:checkcast       #62  <Class ICandleDataSet>
	//   12   36:astore_3        
			if(icandledataset.isVisible() && icandledataset.getEntryCount() > 0)
	//*  13   37:aload_3         
	//*  14   38:invokeinterface #65  <Method boolean ICandleDataSet.isVisible()>
	//*  15   43:ifeq            18
	//*  16   46:aload_3         
	//*  17   47:invokeinterface #69  <Method int ICandleDataSet.getEntryCount()>
	//*  18   52:ifle            18
				drawDataSet(canvas, icandledataset);
	//   19   55:aload_0         
	//   20   56:aload_1         
	//   21   57:aload_3         
	//   22   58:invokevirtual   #73  <Method void drawDataSet(Canvas, ICandleDataSet)>
		} while(true);
	//   23   61:goto            18
	//   24   64:return          
	}

	protected void drawDataSet(Canvas canvas, ICandleDataSet icandledataset)
	{
		Transformer transformer = mChart.getTransformer(icandledataset.getAxisDependency());
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field CandleDataProvider mChart>
	//    2    4:aload_2         
	//    3    5:invokeinterface #77  <Method com.github.mikephil.charting.components.YAxis$AxisDependency ICandleDataSet.getAxisDependency()>
	//    4   10:invokeinterface #81  <Method Transformer CandleDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//    5   15:astore          16
		float f2 = mAnimator.getPhaseX();
	//    6   17:aload_0         
	//    7   18:getfield        #85  <Field ChartAnimator mAnimator>
	//    8   21:invokevirtual   #91  <Method float ChartAnimator.getPhaseX()>
	//    9   24:fstore          5
		float f = mAnimator.getPhaseY();
	//   10   26:aload_0         
	//   11   27:getfield        #85  <Field ChartAnimator mAnimator>
	//   12   30:invokevirtual   #94  <Method float ChartAnimator.getPhaseY()>
	//   13   33:fstore_3        
		float f1 = icandledataset.getBarSpace();
	//   14   34:aload_2         
	//   15   35:invokeinterface #97  <Method float ICandleDataSet.getBarSpace()>
	//   16   40:fstore          4
		boolean flag = icandledataset.getShowCandleBar();
	//   17   42:aload_2         
	//   18   43:invokeinterface #100 <Method boolean ICandleDataSet.getShowCandleBar()>
	//   19   48:istore          15
		int k1 = Math.max(mMinX, 0);
	//   20   50:aload_0         
	//   21   51:getfield        #104 <Field int mMinX>
	//   22   54:iconst_0        
	//   23   55:invokestatic    #110 <Method int Math.max(int, int)>
	//   24   58:istore          11
		int l1 = Math.min(mMaxX + 1, icandledataset.getEntryCount());
	//   25   60:aload_0         
	//   26   61:getfield        #113 <Field int mMaxX>
	//   27   64:iconst_1        
	//   28   65:iadd            
	//   29   66:aload_2         
	//   30   67:invokeinterface #69  <Method int ICandleDataSet.getEntryCount()>
	//   31   72:invokestatic    #116 <Method int Math.min(int, int)>
	//   32   75:istore          12
		mRenderPaint.setStrokeWidth(icandledataset.getShadowWidth());
	//   33   77:aload_0         
	//   34   78:getfield        #120 <Field Paint mRenderPaint>
	//   35   81:aload_2         
	//   36   82:invokeinterface #123 <Method float ICandleDataSet.getShadowWidth()>
	//   37   87:invokevirtual   #129 <Method void Paint.setStrokeWidth(float)>
		int j1 = k1;
	//   38   90:iload           11
	//   39   92:istore          10
		int i2 = (int)Math.ceil((float)(l1 - k1) * f2 + (float)k1);
	//   40   94:iload           12
	//   41   96:iload           11
	//   42   98:isub            
	//   43   99:i2f             
	//   44  100:fload           5
	//   45  102:fmul            
	//   46  103:iload           11
	//   47  105:i2f             
	//   48  106:fadd            
	//   49  107:f2d             
	//   50  108:invokestatic    #133 <Method double Math.ceil(double)>
	//   51  111:d2i             
	//   52  112:istore          13
		do
		{
			if(j1 < i2)
	//*  53  114:iload           10
	//*  54  116:iload           13
	//*  55  118:icmpge          1327
			{
				CandleEntry candleentry = (CandleEntry)icandledataset.getEntryForIndex(j1);
	//   56  121:aload_2         
	//   57  122:iload           10
	//   58  124:invokeinterface #137 <Method com.github.mikephil.charting.data.Entry ICandleDataSet.getEntryForIndex(int)>
	//   59  129:checkcast       #139 <Class CandleEntry>
	//   60  132:astore          17
				int j2 = candleentry.getXIndex();
	//   61  134:aload           17
	//   62  136:invokevirtual   #142 <Method int CandleEntry.getXIndex()>
	//   63  139:istore          14
				if(j2 >= k1 && j2 < l1)
	//*  64  141:iload           14
	//*  65  143:iload           11
	//*  66  145:icmplt          155
	//*  67  148:iload           14
	//*  68  150:iload           12
	//*  69  152:icmplt          164
	//*  70  155:iload           10
	//*  71  157:iconst_1        
	//*  72  158:iadd            
	//*  73  159:istore          10
	//*  74  161:goto            114
				{
					float f3 = candleentry.getOpen();
	//   75  164:aload           17
	//   76  166:invokevirtual   #145 <Method float CandleEntry.getOpen()>
	//   77  169:fstore          5
					float f4 = candleentry.getClose();
	//   78  171:aload           17
	//   79  173:invokevirtual   #148 <Method float CandleEntry.getClose()>
	//   80  176:fstore          6
					float f5 = candleentry.getHigh();
	//   81  178:aload           17
	//   82  180:invokevirtual   #151 <Method float CandleEntry.getHigh()>
	//   83  183:fstore          7
					float f6 = candleentry.getLow();
	//   84  185:aload           17
	//   85  187:invokevirtual   #154 <Method float CandleEntry.getLow()>
	//   86  190:fstore          8
					if(flag)
	//*  87  192:iload           15
	//*  88  194:ifeq            951
					{
						mShadowBuffers[0] = j2;
	//   89  197:aload_0         
	//   90  198:getfield        #19  <Field float[] mShadowBuffers>
	//   91  201:iconst_0        
	//   92  202:iload           14
	//   93  204:i2f             
	//   94  205:fastore         
						mShadowBuffers[2] = j2;
	//   95  206:aload_0         
	//   96  207:getfield        #19  <Field float[] mShadowBuffers>
	//   97  210:iconst_2        
	//   98  211:iload           14
	//   99  213:i2f             
	//  100  214:fastore         
						mShadowBuffers[4] = j2;
	//  101  215:aload_0         
	//  102  216:getfield        #19  <Field float[] mShadowBuffers>
	//  103  219:iconst_4        
	//  104  220:iload           14
	//  105  222:i2f             
	//  106  223:fastore         
						mShadowBuffers[6] = j2;
	//  107  224:aload_0         
	//  108  225:getfield        #19  <Field float[] mShadowBuffers>
	//  109  228:bipush          6
	//  110  230:iload           14
	//  111  232:i2f             
	//  112  233:fastore         
						if(f3 > f4)
	//* 113  234:fload           5
	//* 114  236:fload           6
	//* 115  238:fcmpl           
	//* 116  239:ifle            504
						{
							mShadowBuffers[1] = f5 * f;
	//  117  242:aload_0         
	//  118  243:getfield        #19  <Field float[] mShadowBuffers>
	//  119  246:iconst_1        
	//  120  247:fload           7
	//  121  249:fload_3         
	//  122  250:fmul            
	//  123  251:fastore         
							mShadowBuffers[3] = f3 * f;
	//  124  252:aload_0         
	//  125  253:getfield        #19  <Field float[] mShadowBuffers>
	//  126  256:iconst_3        
	//  127  257:fload           5
	//  128  259:fload_3         
	//  129  260:fmul            
	//  130  261:fastore         
							mShadowBuffers[5] = f6 * f;
	//  131  262:aload_0         
	//  132  263:getfield        #19  <Field float[] mShadowBuffers>
	//  133  266:iconst_5        
	//  134  267:fload           8
	//  135  269:fload_3         
	//  136  270:fmul            
	//  137  271:fastore         
							mShadowBuffers[7] = f4 * f;
	//  138  272:aload_0         
	//  139  273:getfield        #19  <Field float[] mShadowBuffers>
	//  140  276:bipush          7
	//  141  278:fload           6
	//  142  280:fload_3         
	//  143  281:fmul            
	//  144  282:fastore         
						} else
	//* 145  283:aload           16
	//* 146  285:aload_0         
	//* 147  286:getfield        #19  <Field float[] mShadowBuffers>
	//* 148  289:invokevirtual   #160 <Method void Transformer.pointValuesToPixel(float[])>
	//* 149  292:aload_2         
	//* 150  293:invokeinterface #163 <Method boolean ICandleDataSet.getShadowColorSameAsCandle()>
	//* 151  298:ifeq            715
	//* 152  301:fload           5
	//* 153  303:fload           6
	//* 154  305:fcmpl           
	//* 155  306:ifle            613
	//* 156  309:aload_0         
	//* 157  310:getfield        #120 <Field Paint mRenderPaint>
	//* 158  313:astore          17
	//* 159  315:aload_2         
	//* 160  316:invokeinterface #166 <Method int ICandleDataSet.getDecreasingColor()>
	//* 161  321:iconst_m1       
	//* 162  322:icmpne          602
	//* 163  325:aload_2         
	//* 164  326:iload           10
	//* 165  328:invokeinterface #170 <Method int ICandleDataSet.getColor(int)>
	//* 166  333:istore          9
	//* 167  335:aload           17
	//* 168  337:iload           9
	//* 169  339:invokevirtual   #174 <Method void Paint.setColor(int)>
	//* 170  342:aload_0         
	//* 171  343:getfield        #120 <Field Paint mRenderPaint>
	//* 172  346:getstatic       #180 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//* 173  349:invokevirtual   #184 <Method void Paint.setStyle(android.graphics.Paint$Style)>
	//* 174  352:aload_1         
	//* 175  353:aload_0         
	//* 176  354:getfield        #19  <Field float[] mShadowBuffers>
	//* 177  357:aload_0         
	//* 178  358:getfield        #120 <Field Paint mRenderPaint>
	//* 179  361:invokevirtual   #190 <Method void Canvas.drawLines(float[], Paint)>
	//* 180  364:aload_0         
	//* 181  365:getfield        #21  <Field float[] mBodyBuffers>
	//* 182  368:iconst_0        
	//* 183  369:iload           14
	//* 184  371:i2f             
	//* 185  372:ldc1            #191 <Float 0.5F>
	//* 186  374:fsub            
	//* 187  375:fload           4
	//* 188  377:fadd            
	//* 189  378:fastore         
	//* 190  379:aload_0         
	//* 191  380:getfield        #21  <Field float[] mBodyBuffers>
	//* 192  383:iconst_1        
	//* 193  384:fload           6
	//* 194  386:fload_3         
	//* 195  387:fmul            
	//* 196  388:fastore         
	//* 197  389:aload_0         
	//* 198  390:getfield        #21  <Field float[] mBodyBuffers>
	//* 199  393:iconst_2        
	//* 200  394:iload           14
	//* 201  396:i2f             
	//* 202  397:ldc1            #191 <Float 0.5F>
	//* 203  399:fadd            
	//* 204  400:fload           4
	//* 205  402:fsub            
	//* 206  403:fastore         
	//* 207  404:aload_0         
	//* 208  405:getfield        #21  <Field float[] mBodyBuffers>
	//* 209  408:iconst_3        
	//* 210  409:fload           5
	//* 211  411:fload_3         
	//* 212  412:fmul            
	//* 213  413:fastore         
	//* 214  414:aload           16
	//* 215  416:aload_0         
	//* 216  417:getfield        #21  <Field float[] mBodyBuffers>
	//* 217  420:invokevirtual   #160 <Method void Transformer.pointValuesToPixel(float[])>
	//* 218  423:fload           5
	//* 219  425:fload           6
	//* 220  427:fcmpl           
	//* 221  428:ifle            778
	//* 222  431:aload_2         
	//* 223  432:invokeinterface #166 <Method int ICandleDataSet.getDecreasingColor()>
	//* 224  437:iconst_m1       
	//* 225  438:icmpne          762
	//* 226  441:aload_0         
	//* 227  442:getfield        #120 <Field Paint mRenderPaint>
	//* 228  445:aload_2         
	//* 229  446:iload           10
	//* 230  448:invokeinterface #170 <Method int ICandleDataSet.getColor(int)>
	//* 231  453:invokevirtual   #174 <Method void Paint.setColor(int)>
	//* 232  456:aload_0         
	//* 233  457:getfield        #120 <Field Paint mRenderPaint>
	//* 234  460:aload_2         
	//* 235  461:invokeinterface #195 <Method android.graphics.Paint$Style ICandleDataSet.getDecreasingPaintStyle()>
	//* 236  466:invokevirtual   #184 <Method void Paint.setStyle(android.graphics.Paint$Style)>
	//* 237  469:aload_1         
	//* 238  470:aload_0         
	//* 239  471:getfield        #21  <Field float[] mBodyBuffers>
	//* 240  474:iconst_0        
	//* 241  475:faload          
	//* 242  476:aload_0         
	//* 243  477:getfield        #21  <Field float[] mBodyBuffers>
	//* 244  480:iconst_3        
	//* 245  481:faload          
	//* 246  482:aload_0         
	//* 247  483:getfield        #21  <Field float[] mBodyBuffers>
	//* 248  486:iconst_2        
	//* 249  487:faload          
	//* 250  488:aload_0         
	//* 251  489:getfield        #21  <Field float[] mBodyBuffers>
	//* 252  492:iconst_1        
	//* 253  493:faload          
	//* 254  494:aload_0         
	//* 255  495:getfield        #120 <Field Paint mRenderPaint>
	//* 256  498:invokevirtual   #199 <Method void Canvas.drawRect(float, float, float, float, Paint)>
	//* 257  501:goto            155
						if(f3 < f4)
	//* 258  504:fload           5
	//* 259  506:fload           6
	//* 260  508:fcmpg           
	//* 261  509:ifge            556
						{
							mShadowBuffers[1] = f5 * f;
	//  262  512:aload_0         
	//  263  513:getfield        #19  <Field float[] mShadowBuffers>
	//  264  516:iconst_1        
	//  265  517:fload           7
	//  266  519:fload_3         
	//  267  520:fmul            
	//  268  521:fastore         
							mShadowBuffers[3] = f4 * f;
	//  269  522:aload_0         
	//  270  523:getfield        #19  <Field float[] mShadowBuffers>
	//  271  526:iconst_3        
	//  272  527:fload           6
	//  273  529:fload_3         
	//  274  530:fmul            
	//  275  531:fastore         
							mShadowBuffers[5] = f6 * f;
	//  276  532:aload_0         
	//  277  533:getfield        #19  <Field float[] mShadowBuffers>
	//  278  536:iconst_5        
	//  279  537:fload           8
	//  280  539:fload_3         
	//  281  540:fmul            
	//  282  541:fastore         
							mShadowBuffers[7] = f3 * f;
	//  283  542:aload_0         
	//  284  543:getfield        #19  <Field float[] mShadowBuffers>
	//  285  546:bipush          7
	//  286  548:fload           5
	//  287  550:fload_3         
	//  288  551:fmul            
	//  289  552:fastore         
						} else
	//* 290  553:goto            283
						{
							mShadowBuffers[1] = f5 * f;
	//  291  556:aload_0         
	//  292  557:getfield        #19  <Field float[] mShadowBuffers>
	//  293  560:iconst_1        
	//  294  561:fload           7
	//  295  563:fload_3         
	//  296  564:fmul            
	//  297  565:fastore         
							mShadowBuffers[3] = f3 * f;
	//  298  566:aload_0         
	//  299  567:getfield        #19  <Field float[] mShadowBuffers>
	//  300  570:iconst_3        
	//  301  571:fload           5
	//  302  573:fload_3         
	//  303  574:fmul            
	//  304  575:fastore         
							mShadowBuffers[5] = f6 * f;
	//  305  576:aload_0         
	//  306  577:getfield        #19  <Field float[] mShadowBuffers>
	//  307  580:iconst_5        
	//  308  581:fload           8
	//  309  583:fload_3         
	//  310  584:fmul            
	//  311  585:fastore         
							mShadowBuffers[7] = mShadowBuffers[3];
	//  312  586:aload_0         
	//  313  587:getfield        #19  <Field float[] mShadowBuffers>
	//  314  590:bipush          7
	//  315  592:aload_0         
	//  316  593:getfield        #19  <Field float[] mShadowBuffers>
	//  317  596:iconst_3        
	//  318  597:faload          
	//  319  598:fastore         
						}
						transformer.pointValuesToPixel(mShadowBuffers);
						if(icandledataset.getShadowColorSameAsCandle())
						{
							if(f3 > f4)
							{
								Paint paint = mRenderPaint;
								int i;
								if(icandledataset.getDecreasingColor() == -1)
									i = icandledataset.getColor(j1);
								else
	//* 320  599:goto            283
									i = icandledataset.getDecreasingColor();
	//  321  602:aload_2         
	//  322  603:invokeinterface #166 <Method int ICandleDataSet.getDecreasingColor()>
	//  323  608:istore          9
								paint.setColor(i);
							} else
	//* 324  610:goto            335
							if(f3 < f4)
	//* 325  613:fload           5
	//* 326  615:fload           6
	//* 327  617:fcmpg           
	//* 328  618:ifge            668
							{
								Paint paint1 = mRenderPaint;
	//  329  621:aload_0         
	//  330  622:getfield        #120 <Field Paint mRenderPaint>
	//  331  625:astore          17
								int j;
								if(icandledataset.getIncreasingColor() == -1)
	//* 332  627:aload_2         
	//* 333  628:invokeinterface #202 <Method int ICandleDataSet.getIncreasingColor()>
	//* 334  633:iconst_m1       
	//* 335  634:icmpne          657
									j = icandledataset.getColor(j1);
	//  336  637:aload_2         
	//  337  638:iload           10
	//  338  640:invokeinterface #170 <Method int ICandleDataSet.getColor(int)>
	//  339  645:istore          9
								else
	//* 340  647:aload           17
	//* 341  649:iload           9
	//* 342  651:invokevirtual   #174 <Method void Paint.setColor(int)>
	//* 343  654:goto            342
									j = icandledataset.getIncreasingColor();
	//  344  657:aload_2         
	//  345  658:invokeinterface #202 <Method int ICandleDataSet.getIncreasingColor()>
	//  346  663:istore          9
								paint1.setColor(j);
							} else
	//* 347  665:goto            647
							{
								Paint paint2 = mRenderPaint;
	//  348  668:aload_0         
	//  349  669:getfield        #120 <Field Paint mRenderPaint>
	//  350  672:astore          17
								int k;
								if(icandledataset.getNeutralColor() == -1)
	//* 351  674:aload_2         
	//* 352  675:invokeinterface #205 <Method int ICandleDataSet.getNeutralColor()>
	//* 353  680:iconst_m1       
	//* 354  681:icmpne          704
									k = icandledataset.getColor(j1);
	//  355  684:aload_2         
	//  356  685:iload           10
	//  357  687:invokeinterface #170 <Method int ICandleDataSet.getColor(int)>
	//  358  692:istore          9
								else
	//* 359  694:aload           17
	//* 360  696:iload           9
	//* 361  698:invokevirtual   #174 <Method void Paint.setColor(int)>
	//* 362  701:goto            342
									k = icandledataset.getNeutralColor();
	//  363  704:aload_2         
	//  364  705:invokeinterface #205 <Method int ICandleDataSet.getNeutralColor()>
	//  365  710:istore          9
								paint2.setColor(k);
							}
						} else
	//* 366  712:goto            694
						{
							Paint paint3 = mRenderPaint;
	//  367  715:aload_0         
	//  368  716:getfield        #120 <Field Paint mRenderPaint>
	//  369  719:astore          17
							int l;
							if(icandledataset.getShadowColor() == -1)
	//* 370  721:aload_2         
	//* 371  722:invokeinterface #208 <Method int ICandleDataSet.getShadowColor()>
	//* 372  727:iconst_m1       
	//* 373  728:icmpne          751
								l = icandledataset.getColor(j1);
	//  374  731:aload_2         
	//  375  732:iload           10
	//  376  734:invokeinterface #170 <Method int ICandleDataSet.getColor(int)>
	//  377  739:istore          9
							else
	//* 378  741:aload           17
	//* 379  743:iload           9
	//* 380  745:invokevirtual   #174 <Method void Paint.setColor(int)>
	//* 381  748:goto            342
								l = icandledataset.getShadowColor();
	//  382  751:aload_2         
	//  383  752:invokeinterface #208 <Method int ICandleDataSet.getShadowColor()>
	//  384  757:istore          9
							paint3.setColor(l);
						}
						mRenderPaint.setStyle(android.graphics.Paint.Style.STROKE);
						canvas.drawLines(mShadowBuffers, mRenderPaint);
						mBodyBuffers[0] = ((float)j2 - 0.5F) + f1;
						mBodyBuffers[1] = f4 * f;
						mBodyBuffers[2] = ((float)j2 + 0.5F) - f1;
						mBodyBuffers[3] = f3 * f;
						transformer.pointValuesToPixel(mBodyBuffers);
						if(f3 > f4)
						{
							if(icandledataset.getDecreasingColor() == -1)
								mRenderPaint.setColor(icandledataset.getColor(j1));
							else
	//* 385  759:goto            741
								mRenderPaint.setColor(icandledataset.getDecreasingColor());
	//  386  762:aload_0         
	//  387  763:getfield        #120 <Field Paint mRenderPaint>
	//  388  766:aload_2         
	//  389  767:invokeinterface #166 <Method int ICandleDataSet.getDecreasingColor()>
	//  390  772:invokevirtual   #174 <Method void Paint.setColor(int)>
							mRenderPaint.setStyle(icandledataset.getDecreasingPaintStyle());
							canvas.drawRect(mBodyBuffers[0], mBodyBuffers[3], mBodyBuffers[2], mBodyBuffers[1], mRenderPaint);
						} else
	//* 391  775:goto            456
						if(f3 < f4)
	//* 392  778:fload           5
	//* 393  780:fload           6
	//* 394  782:fcmpg           
	//* 395  783:ifge            875
						{
							if(icandledataset.getIncreasingColor() == -1)
	//* 396  786:aload_2         
	//* 397  787:invokeinterface #202 <Method int ICandleDataSet.getIncreasingColor()>
	//* 398  792:iconst_m1       
	//* 399  793:icmpne          859
								mRenderPaint.setColor(icandledataset.getColor(j1));
	//  400  796:aload_0         
	//  401  797:getfield        #120 <Field Paint mRenderPaint>
	//  402  800:aload_2         
	//  403  801:iload           10
	//  404  803:invokeinterface #170 <Method int ICandleDataSet.getColor(int)>
	//  405  808:invokevirtual   #174 <Method void Paint.setColor(int)>
							else
	//* 406  811:aload_0         
	//* 407  812:getfield        #120 <Field Paint mRenderPaint>
	//* 408  815:aload_2         
	//* 409  816:invokeinterface #211 <Method android.graphics.Paint$Style ICandleDataSet.getIncreasingPaintStyle()>
	//* 410  821:invokevirtual   #184 <Method void Paint.setStyle(android.graphics.Paint$Style)>
	//* 411  824:aload_1         
	//* 412  825:aload_0         
	//* 413  826:getfield        #21  <Field float[] mBodyBuffers>
	//* 414  829:iconst_0        
	//* 415  830:faload          
	//* 416  831:aload_0         
	//* 417  832:getfield        #21  <Field float[] mBodyBuffers>
	//* 418  835:iconst_1        
	//* 419  836:faload          
	//* 420  837:aload_0         
	//* 421  838:getfield        #21  <Field float[] mBodyBuffers>
	//* 422  841:iconst_2        
	//* 423  842:faload          
	//* 424  843:aload_0         
	//* 425  844:getfield        #21  <Field float[] mBodyBuffers>
	//* 426  847:iconst_3        
	//* 427  848:faload          
	//* 428  849:aload_0         
	//* 429  850:getfield        #120 <Field Paint mRenderPaint>
	//* 430  853:invokevirtual   #199 <Method void Canvas.drawRect(float, float, float, float, Paint)>
	//* 431  856:goto            155
								mRenderPaint.setColor(icandledataset.getIncreasingColor());
	//  432  859:aload_0         
	//  433  860:getfield        #120 <Field Paint mRenderPaint>
	//  434  863:aload_2         
	//  435  864:invokeinterface #202 <Method int ICandleDataSet.getIncreasingColor()>
	//  436  869:invokevirtual   #174 <Method void Paint.setColor(int)>
							mRenderPaint.setStyle(icandledataset.getIncreasingPaintStyle());
							canvas.drawRect(mBodyBuffers[0], mBodyBuffers[1], mBodyBuffers[2], mBodyBuffers[3], mRenderPaint);
						} else
	//* 437  872:goto            811
						{
							if(icandledataset.getNeutralColor() == -1)
	//* 438  875:aload_2         
	//* 439  876:invokeinterface #205 <Method int ICandleDataSet.getNeutralColor()>
	//* 440  881:iconst_m1       
	//* 441  882:icmpne          935
								mRenderPaint.setColor(icandledataset.getColor(j1));
	//  442  885:aload_0         
	//  443  886:getfield        #120 <Field Paint mRenderPaint>
	//  444  889:aload_2         
	//  445  890:iload           10
	//  446  892:invokeinterface #170 <Method int ICandleDataSet.getColor(int)>
	//  447  897:invokevirtual   #174 <Method void Paint.setColor(int)>
							else
	//* 448  900:aload_1         
	//* 449  901:aload_0         
	//* 450  902:getfield        #21  <Field float[] mBodyBuffers>
	//* 451  905:iconst_0        
	//* 452  906:faload          
	//* 453  907:aload_0         
	//* 454  908:getfield        #21  <Field float[] mBodyBuffers>
	//* 455  911:iconst_1        
	//* 456  912:faload          
	//* 457  913:aload_0         
	//* 458  914:getfield        #21  <Field float[] mBodyBuffers>
	//* 459  917:iconst_2        
	//* 460  918:faload          
	//* 461  919:aload_0         
	//* 462  920:getfield        #21  <Field float[] mBodyBuffers>
	//* 463  923:iconst_3        
	//* 464  924:faload          
	//* 465  925:aload_0         
	//* 466  926:getfield        #120 <Field Paint mRenderPaint>
	//* 467  929:invokevirtual   #214 <Method void Canvas.drawLine(float, float, float, float, Paint)>
	//* 468  932:goto            155
								mRenderPaint.setColor(icandledataset.getNeutralColor());
	//  469  935:aload_0         
	//  470  936:getfield        #120 <Field Paint mRenderPaint>
	//  471  939:aload_2         
	//  472  940:invokeinterface #205 <Method int ICandleDataSet.getNeutralColor()>
	//  473  945:invokevirtual   #174 <Method void Paint.setColor(int)>
							canvas.drawLine(mBodyBuffers[0], mBodyBuffers[1], mBodyBuffers[2], mBodyBuffers[3], mRenderPaint);
						}
					} else
	//* 474  948:goto            900
					{
						mRangeBuffers[0] = j2;
	//  475  951:aload_0         
	//  476  952:getfield        #23  <Field float[] mRangeBuffers>
	//  477  955:iconst_0        
	//  478  956:iload           14
	//  479  958:i2f             
	//  480  959:fastore         
						mRangeBuffers[1] = f5 * f;
	//  481  960:aload_0         
	//  482  961:getfield        #23  <Field float[] mRangeBuffers>
	//  483  964:iconst_1        
	//  484  965:fload           7
	//  485  967:fload_3         
	//  486  968:fmul            
	//  487  969:fastore         
						mRangeBuffers[2] = j2;
	//  488  970:aload_0         
	//  489  971:getfield        #23  <Field float[] mRangeBuffers>
	//  490  974:iconst_2        
	//  491  975:iload           14
	//  492  977:i2f             
	//  493  978:fastore         
						mRangeBuffers[3] = f6 * f;
	//  494  979:aload_0         
	//  495  980:getfield        #23  <Field float[] mRangeBuffers>
	//  496  983:iconst_3        
	//  497  984:fload           8
	//  498  986:fload_3         
	//  499  987:fmul            
	//  500  988:fastore         
						mOpenBuffers[0] = ((float)j2 - 0.5F) + f1;
	//  501  989:aload_0         
	//  502  990:getfield        #25  <Field float[] mOpenBuffers>
	//  503  993:iconst_0        
	//  504  994:iload           14
	//  505  996:i2f             
	//  506  997:ldc1            #191 <Float 0.5F>
	//  507  999:fsub            
	//  508 1000:fload           4
	//  509 1002:fadd            
	//  510 1003:fastore         
						mOpenBuffers[1] = f3 * f;
	//  511 1004:aload_0         
	//  512 1005:getfield        #25  <Field float[] mOpenBuffers>
	//  513 1008:iconst_1        
	//  514 1009:fload           5
	//  515 1011:fload_3         
	//  516 1012:fmul            
	//  517 1013:fastore         
						mOpenBuffers[2] = j2;
	//  518 1014:aload_0         
	//  519 1015:getfield        #25  <Field float[] mOpenBuffers>
	//  520 1018:iconst_2        
	//  521 1019:iload           14
	//  522 1021:i2f             
	//  523 1022:fastore         
						mOpenBuffers[3] = f3 * f;
	//  524 1023:aload_0         
	//  525 1024:getfield        #25  <Field float[] mOpenBuffers>
	//  526 1027:iconst_3        
	//  527 1028:fload           5
	//  528 1030:fload_3         
	//  529 1031:fmul            
	//  530 1032:fastore         
						mCloseBuffers[0] = ((float)j2 + 0.5F) - f1;
	//  531 1033:aload_0         
	//  532 1034:getfield        #27  <Field float[] mCloseBuffers>
	//  533 1037:iconst_0        
	//  534 1038:iload           14
	//  535 1040:i2f             
	//  536 1041:ldc1            #191 <Float 0.5F>
	//  537 1043:fadd            
	//  538 1044:fload           4
	//  539 1046:fsub            
	//  540 1047:fastore         
						mCloseBuffers[1] = f4 * f;
	//  541 1048:aload_0         
	//  542 1049:getfield        #27  <Field float[] mCloseBuffers>
	//  543 1052:iconst_1        
	//  544 1053:fload           6
	//  545 1055:fload_3         
	//  546 1056:fmul            
	//  547 1057:fastore         
						mCloseBuffers[2] = j2;
	//  548 1058:aload_0         
	//  549 1059:getfield        #27  <Field float[] mCloseBuffers>
	//  550 1062:iconst_2        
	//  551 1063:iload           14
	//  552 1065:i2f             
	//  553 1066:fastore         
						mCloseBuffers[3] = f4 * f;
	//  554 1067:aload_0         
	//  555 1068:getfield        #27  <Field float[] mCloseBuffers>
	//  556 1071:iconst_3        
	//  557 1072:fload           6
	//  558 1074:fload_3         
	//  559 1075:fmul            
	//  560 1076:fastore         
						transformer.pointValuesToPixel(mRangeBuffers);
	//  561 1077:aload           16
	//  562 1079:aload_0         
	//  563 1080:getfield        #23  <Field float[] mRangeBuffers>
	//  564 1083:invokevirtual   #160 <Method void Transformer.pointValuesToPixel(float[])>
						transformer.pointValuesToPixel(mOpenBuffers);
	//  565 1086:aload           16
	//  566 1088:aload_0         
	//  567 1089:getfield        #25  <Field float[] mOpenBuffers>
	//  568 1092:invokevirtual   #160 <Method void Transformer.pointValuesToPixel(float[])>
						transformer.pointValuesToPixel(mCloseBuffers);
	//  569 1095:aload           16
	//  570 1097:aload_0         
	//  571 1098:getfield        #27  <Field float[] mCloseBuffers>
	//  572 1101:invokevirtual   #160 <Method void Transformer.pointValuesToPixel(float[])>
						int i1;
						if(f3 > f4)
	//* 573 1104:fload           5
	//* 574 1106:fload           6
	//* 575 1108:fcmpl           
	//* 576 1109:ifle            1251
						{
							if(icandledataset.getDecreasingColor() == -1)
	//* 577 1112:aload_2         
	//* 578 1113:invokeinterface #166 <Method int ICandleDataSet.getDecreasingColor()>
	//* 579 1118:iconst_m1       
	//* 580 1119:icmpne          1240
								i1 = icandledataset.getColor(j1);
	//  581 1122:aload_2         
	//  582 1123:iload           10
	//  583 1125:invokeinterface #170 <Method int ICandleDataSet.getColor(int)>
	//  584 1130:istore          9
							else
	//* 585 1132:aload_0         
	//* 586 1133:getfield        #120 <Field Paint mRenderPaint>
	//* 587 1136:iload           9
	//* 588 1138:invokevirtual   #174 <Method void Paint.setColor(int)>
	//* 589 1141:aload_1         
	//* 590 1142:aload_0         
	//* 591 1143:getfield        #23  <Field float[] mRangeBuffers>
	//* 592 1146:iconst_0        
	//* 593 1147:faload          
	//* 594 1148:aload_0         
	//* 595 1149:getfield        #23  <Field float[] mRangeBuffers>
	//* 596 1152:iconst_1        
	//* 597 1153:faload          
	//* 598 1154:aload_0         
	//* 599 1155:getfield        #23  <Field float[] mRangeBuffers>
	//* 600 1158:iconst_2        
	//* 601 1159:faload          
	//* 602 1160:aload_0         
	//* 603 1161:getfield        #23  <Field float[] mRangeBuffers>
	//* 604 1164:iconst_3        
	//* 605 1165:faload          
	//* 606 1166:aload_0         
	//* 607 1167:getfield        #120 <Field Paint mRenderPaint>
	//* 608 1170:invokevirtual   #214 <Method void Canvas.drawLine(float, float, float, float, Paint)>
	//* 609 1173:aload_1         
	//* 610 1174:aload_0         
	//* 611 1175:getfield        #25  <Field float[] mOpenBuffers>
	//* 612 1178:iconst_0        
	//* 613 1179:faload          
	//* 614 1180:aload_0         
	//* 615 1181:getfield        #25  <Field float[] mOpenBuffers>
	//* 616 1184:iconst_1        
	//* 617 1185:faload          
	//* 618 1186:aload_0         
	//* 619 1187:getfield        #25  <Field float[] mOpenBuffers>
	//* 620 1190:iconst_2        
	//* 621 1191:faload          
	//* 622 1192:aload_0         
	//* 623 1193:getfield        #25  <Field float[] mOpenBuffers>
	//* 624 1196:iconst_3        
	//* 625 1197:faload          
	//* 626 1198:aload_0         
	//* 627 1199:getfield        #120 <Field Paint mRenderPaint>
	//* 628 1202:invokevirtual   #214 <Method void Canvas.drawLine(float, float, float, float, Paint)>
	//* 629 1205:aload_1         
	//* 630 1206:aload_0         
	//* 631 1207:getfield        #27  <Field float[] mCloseBuffers>
	//* 632 1210:iconst_0        
	//* 633 1211:faload          
	//* 634 1212:aload_0         
	//* 635 1213:getfield        #27  <Field float[] mCloseBuffers>
	//* 636 1216:iconst_1        
	//* 637 1217:faload          
	//* 638 1218:aload_0         
	//* 639 1219:getfield        #27  <Field float[] mCloseBuffers>
	//* 640 1222:iconst_2        
	//* 641 1223:faload          
	//* 642 1224:aload_0         
	//* 643 1225:getfield        #27  <Field float[] mCloseBuffers>
	//* 644 1228:iconst_3        
	//* 645 1229:faload          
	//* 646 1230:aload_0         
	//* 647 1231:getfield        #120 <Field Paint mRenderPaint>
	//* 648 1234:invokevirtual   #214 <Method void Canvas.drawLine(float, float, float, float, Paint)>
	//* 649 1237:goto            155
								i1 = icandledataset.getDecreasingColor();
	//  650 1240:aload_2         
	//  651 1241:invokeinterface #166 <Method int ICandleDataSet.getDecreasingColor()>
	//  652 1246:istore          9
						} else
	//* 653 1248:goto            1132
						if(f3 < f4)
	//* 654 1251:fload           5
	//* 655 1253:fload           6
	//* 656 1255:fcmpg           
	//* 657 1256:ifge            1293
						{
							if(icandledataset.getIncreasingColor() == -1)
	//* 658 1259:aload_2         
	//* 659 1260:invokeinterface #202 <Method int ICandleDataSet.getIncreasingColor()>
	//* 660 1265:iconst_m1       
	//* 661 1266:icmpne          1282
								i1 = icandledataset.getColor(j1);
	//  662 1269:aload_2         
	//  663 1270:iload           10
	//  664 1272:invokeinterface #170 <Method int ICandleDataSet.getColor(int)>
	//  665 1277:istore          9
							else
	//* 666 1279:goto            1132
								i1 = icandledataset.getIncreasingColor();
	//  667 1282:aload_2         
	//  668 1283:invokeinterface #202 <Method int ICandleDataSet.getIncreasingColor()>
	//  669 1288:istore          9
						} else
	//* 670 1290:goto            1279
						if(icandledataset.getNeutralColor() == -1)
	//* 671 1293:aload_2         
	//* 672 1294:invokeinterface #205 <Method int ICandleDataSet.getNeutralColor()>
	//* 673 1299:iconst_m1       
	//* 674 1300:icmpne          1316
							i1 = icandledataset.getColor(j1);
	//  675 1303:aload_2         
	//  676 1304:iload           10
	//  677 1306:invokeinterface #170 <Method int ICandleDataSet.getColor(int)>
	//  678 1311:istore          9
						else
	//* 679 1313:goto            1132
							i1 = icandledataset.getNeutralColor();
	//  680 1316:aload_2         
	//  681 1317:invokeinterface #205 <Method int ICandleDataSet.getNeutralColor()>
	//  682 1322:istore          9
						mRenderPaint.setColor(i1);
						canvas.drawLine(mRangeBuffers[0], mRangeBuffers[1], mRangeBuffers[2], mRangeBuffers[3], mRenderPaint);
						canvas.drawLine(mOpenBuffers[0], mOpenBuffers[1], mOpenBuffers[2], mOpenBuffers[3], mRenderPaint);
						canvas.drawLine(mCloseBuffers[0], mCloseBuffers[1], mCloseBuffers[2], mCloseBuffers[3], mRenderPaint);
					}
				}
			} else
	//* 683 1324:goto            1313
			{
				return;
	//  684 1327:return          
			}
			j1++;
		} while(true);
	}

	public void drawExtras(Canvas canvas)
	{
	//    0    0:return          
	}

	public void drawHighlighted(Canvas canvas, Highlight ahighlight[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		while(i < ahighlight.length) 
	//*   2    3:iload           4
	//*   3    5:aload_2         
	//*   4    6:arraylength     
	//*   5    7:icmpge          196
		{
			int j = ahighlight[i].getXIndex();
	//    6   10:aload_2         
	//    7   11:iload           4
	//    8   13:aaload          
	//    9   14:invokevirtual   #220 <Method int Highlight.getXIndex()>
	//   10   17:istore          5
			ICandleDataSet icandledataset = (ICandleDataSet)mChart.getCandleData().getDataSetByIndex(ahighlight[i].getDataSetIndex());
	//   11   19:aload_0         
	//   12   20:getfield        #29  <Field CandleDataProvider mChart>
	//   13   23:invokeinterface #38  <Method CandleData CandleDataProvider.getCandleData()>
	//   14   28:aload_2         
	//   15   29:iload           4
	//   16   31:aaload          
	//   17   32:invokevirtual   #223 <Method int Highlight.getDataSetIndex()>
	//   18   35:invokevirtual   #227 <Method com.github.mikephil.charting.interfaces.datasets.IDataSet CandleData.getDataSetByIndex(int)>
	//   19   38:checkcast       #62  <Class ICandleDataSet>
	//   20   41:astore          6
			if(icandledataset != null && icandledataset.isHighlightEnabled())
	//*  21   43:aload           6
	//*  22   45:ifnull          58
	//*  23   48:aload           6
	//*  24   50:invokeinterface #230 <Method boolean ICandleDataSet.isHighlightEnabled()>
	//*  25   55:ifne            67
	//*  26   58:iload           4
	//*  27   60:iconst_1        
	//*  28   61:iadd            
	//*  29   62:istore          4
	//*  30   64:goto            3
			{
				CandleEntry candleentry = (CandleEntry)icandledataset.getEntryForXIndex(j);
	//   31   67:aload           6
	//   32   69:iload           5
	//   33   71:invokeinterface #233 <Method com.github.mikephil.charting.data.Entry ICandleDataSet.getEntryForXIndex(int)>
	//   34   76:checkcast       #139 <Class CandleEntry>
	//   35   79:astore          7
				if(candleentry != null && candleentry.getXIndex() == j)
	//*  36   81:aload           7
	//*  37   83:ifnull          58
	//*  38   86:aload           7
	//*  39   88:invokevirtual   #142 <Method int CandleEntry.getXIndex()>
	//*  40   91:iload           5
	//*  41   93:icmpne          58
				{
					float f = (candleentry.getLow() * mAnimator.getPhaseY() + candleentry.getHigh() * mAnimator.getPhaseY()) / 2.0F;
	//   42   96:aload           7
	//   43   98:invokevirtual   #154 <Method float CandleEntry.getLow()>
	//   44  101:aload_0         
	//   45  102:getfield        #85  <Field ChartAnimator mAnimator>
	//   46  105:invokevirtual   #94  <Method float ChartAnimator.getPhaseY()>
	//   47  108:fmul            
	//   48  109:aload           7
	//   49  111:invokevirtual   #151 <Method float CandleEntry.getHigh()>
	//   50  114:aload_0         
	//   51  115:getfield        #85  <Field ChartAnimator mAnimator>
	//   52  118:invokevirtual   #94  <Method float ChartAnimator.getPhaseY()>
	//   53  121:fmul            
	//   54  122:fadd            
	//   55  123:fconst_2        
	//   56  124:fdiv            
	//   57  125:fstore_3        
					mChart.getYChartMin();
	//   58  126:aload_0         
	//   59  127:getfield        #29  <Field CandleDataProvider mChart>
	//   60  130:invokeinterface #236 <Method float CandleDataProvider.getYChartMin()>
	//   61  135:pop             
					mChart.getYChartMax();
	//   62  136:aload_0         
	//   63  137:getfield        #29  <Field CandleDataProvider mChart>
	//   64  140:invokeinterface #239 <Method float CandleDataProvider.getYChartMax()>
	//   65  145:pop             
					float af[] = new float[2];
	//   66  146:iconst_2        
	//   67  147:newarray        float[]
	//   68  149:astore          7
					af[0] = j;
	//   69  151:aload           7
	//   70  153:iconst_0        
	//   71  154:iload           5
	//   72  156:i2f             
	//   73  157:fastore         
					af[1] = f;
	//   74  158:aload           7
	//   75  160:iconst_1        
	//   76  161:fload_3         
	//   77  162:fastore         
					mChart.getTransformer(icandledataset.getAxisDependency()).pointValuesToPixel(af);
	//   78  163:aload_0         
	//   79  164:getfield        #29  <Field CandleDataProvider mChart>
	//   80  167:aload           6
	//   81  169:invokeinterface #77  <Method com.github.mikephil.charting.components.YAxis$AxisDependency ICandleDataSet.getAxisDependency()>
	//   82  174:invokeinterface #81  <Method Transformer CandleDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   83  179:aload           7
	//   84  181:invokevirtual   #160 <Method void Transformer.pointValuesToPixel(float[])>
					drawHighlightLines(canvas, af, ((com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet) (icandledataset)));
	//   85  184:aload_0         
	//   86  185:aload_1         
	//   87  186:aload           7
	//   88  188:aload           6
	//   89  190:invokevirtual   #243 <Method void drawHighlightLines(Canvas, float[], com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet)>
				}
			}
			i++;
		}
	//*  90  193:goto            58
	//   91  196:return          
	}

	public void drawValues(Canvas canvas)
	{
		int i;
		List list;
		if((float)mChart.getCandleData().getYValCount() >= (float)mChart.getMaxVisibleCount() * mViewPortHandler.getScaleX())
			break MISSING_BLOCK_LABEL_321;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field CandleDataProvider mChart>
	//    2    4:invokeinterface #38  <Method CandleData CandleDataProvider.getCandleData()>
	//    3    9:invokevirtual   #247 <Method int CandleData.getYValCount()>
	//    4   12:i2f             
	//    5   13:aload_0         
	//    6   14:getfield        #29  <Field CandleDataProvider mChart>
	//    7   17:invokeinterface #250 <Method int CandleDataProvider.getMaxVisibleCount()>
	//    8   22:i2f             
	//    9   23:aload_0         
	//   10   24:getfield        #254 <Field ViewPortHandler mViewPortHandler>
	//   11   27:invokevirtual   #259 <Method float ViewPortHandler.getScaleX()>
	//   12   30:fmul            
	//   13   31:fcmpg           
	//   14   32:ifge            321
		list = mChart.getCandleData().getDataSets();
	//   15   35:aload_0         
	//   16   36:getfield        #29  <Field CandleDataProvider mChart>
	//   17   39:invokeinterface #38  <Method CandleData CandleDataProvider.getCandleData()>
	//   18   44:invokevirtual   #44  <Method List CandleData.getDataSets()>
	//   19   47:astore          8
		i = 0;
	//   20   49:iconst_0        
	//   21   50:istore          5
_L2:
		ICandleDataSet icandledataset;
		if(i >= list.size())
			break MISSING_BLOCK_LABEL_321;
	//   22   52:iload           5
	//   23   54:aload           8
	//   24   56:invokeinterface #262 <Method int List.size()>
	//   25   61:icmpge          321
		icandledataset = (ICandleDataSet)list.get(i);
	//   26   64:aload           8
	//   27   66:iload           5
	//   28   68:invokeinterface #266 <Method Object List.get(int)>
	//   29   73:checkcast       #62  <Class ICandleDataSet>
	//   30   76:astore          9
		if(icandledataset.isDrawValuesEnabled() && icandledataset.getEntryCount() != 0)
			break; /* Loop/switch isn't completed */
	//   31   78:aload           9
	//   32   80:invokeinterface #269 <Method boolean ICandleDataSet.isDrawValuesEnabled()>
	//   33   85:ifeq            98
	//   34   88:aload           9
	//   35   90:invokeinterface #69  <Method int ICandleDataSet.getEntryCount()>
	//   36   95:ifne            107
_L4:
		i++;
	//   37   98:iload           5
	//   38  100:iconst_1        
	//   39  101:iadd            
	//   40  102:istore          5
		if(true) goto _L2; else goto _L1
	//   41  104:goto            52
_L1:
		float f;
		int j;
		int k;
		float af[];
		applyValueTextStyle(((com.github.mikephil.charting.interfaces.datasets.IDataSet) (icandledataset)));
	//   42  107:aload_0         
	//   43  108:aload           9
	//   44  110:invokevirtual   #273 <Method void applyValueTextStyle(com.github.mikephil.charting.interfaces.datasets.IDataSet)>
		Transformer transformer = mChart.getTransformer(icandledataset.getAxisDependency());
	//   45  113:aload_0         
	//   46  114:getfield        #29  <Field CandleDataProvider mChart>
	//   47  117:aload           9
	//   48  119:invokeinterface #77  <Method com.github.mikephil.charting.components.YAxis$AxisDependency ICandleDataSet.getAxisDependency()>
	//   49  124:invokeinterface #81  <Method Transformer CandleDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   50  129:astore          10
		k = Math.max(mMinX, 0);
	//   51  131:aload_0         
	//   52  132:getfield        #104 <Field int mMinX>
	//   53  135:iconst_0        
	//   54  136:invokestatic    #110 <Method int Math.max(int, int)>
	//   55  139:istore          7
		j = Math.min(mMaxX + 1, icandledataset.getEntryCount());
	//   56  141:aload_0         
	//   57  142:getfield        #113 <Field int mMaxX>
	//   58  145:iconst_1        
	//   59  146:iadd            
	//   60  147:aload           9
	//   61  149:invokeinterface #69  <Method int ICandleDataSet.getEntryCount()>
	//   62  154:invokestatic    #116 <Method int Math.min(int, int)>
	//   63  157:istore          6
		af = transformer.generateTransformedValuesCandle(icandledataset, mAnimator.getPhaseX(), mAnimator.getPhaseY(), k, j);
	//   64  159:aload           10
	//   65  161:aload           9
	//   66  163:aload_0         
	//   67  164:getfield        #85  <Field ChartAnimator mAnimator>
	//   68  167:invokevirtual   #91  <Method float ChartAnimator.getPhaseX()>
	//   69  170:aload_0         
	//   70  171:getfield        #85  <Field ChartAnimator mAnimator>
	//   71  174:invokevirtual   #94  <Method float ChartAnimator.getPhaseY()>
	//   72  177:iload           7
	//   73  179:iload           6
	//   74  181:invokevirtual   #277 <Method float[] Transformer.generateTransformedValuesCandle(ICandleDataSet, float, float, int, int)>
	//   75  184:astore          10
		f = Utils.convertDpToPixel(5F);
	//   76  186:ldc2            #278 <Float 5F>
	//   77  189:invokestatic    #284 <Method float Utils.convertDpToPixel(float)>
	//   78  192:fstore_2        
		j = 0;
	//   79  193:iconst_0        
	//   80  194:istore          6
_L6:
		if(j >= af.length) goto _L4; else goto _L3
	//   81  196:iload           6
	//   82  198:aload           10
	//   83  200:arraylength     
	//   84  201:icmpge          98
_L3:
		float f1;
		float f2;
		f1 = af[j];
	//   85  204:aload           10
	//   86  206:iload           6
	//   87  208:faload          
	//   88  209:fstore_3        
		f2 = af[j + 1];
	//   89  210:aload           10
	//   90  212:iload           6
	//   91  214:iconst_1        
	//   92  215:iadd            
	//   93  216:faload          
	//   94  217:fstore          4
		if(!mViewPortHandler.isInBoundsRight(f1)) goto _L4; else goto _L5
	//   95  219:aload_0         
	//   96  220:getfield        #254 <Field ViewPortHandler mViewPortHandler>
	//   97  223:fload_3         
	//   98  224:invokevirtual   #288 <Method boolean ViewPortHandler.isInBoundsRight(float)>
	//   99  227:ifeq            98
_L5:
		if(mViewPortHandler.isInBoundsLeft(f1) && mViewPortHandler.isInBoundsY(f2))
	//* 100  230:aload_0         
	//* 101  231:getfield        #254 <Field ViewPortHandler mViewPortHandler>
	//* 102  234:fload_3         
	//* 103  235:invokevirtual   #291 <Method boolean ViewPortHandler.isInBoundsLeft(float)>
	//* 104  238:ifeq            253
	//* 105  241:aload_0         
	//* 106  242:getfield        #254 <Field ViewPortHandler mViewPortHandler>
	//* 107  245:fload           4
	//* 108  247:invokevirtual   #294 <Method boolean ViewPortHandler.isInBoundsY(float)>
	//* 109  250:ifne            262
	//* 110  253:iload           6
	//* 111  255:iconst_2        
	//* 112  256:iadd            
	//* 113  257:istore          6
	//* 114  259:goto            196
		{
			CandleEntry candleentry = (CandleEntry)icandledataset.getEntryForIndex(j / 2 + k);
	//  115  262:aload           9
	//  116  264:iload           6
	//  117  266:iconst_2        
	//  118  267:idiv            
	//  119  268:iload           7
	//  120  270:iadd            
	//  121  271:invokeinterface #137 <Method com.github.mikephil.charting.data.Entry ICandleDataSet.getEntryForIndex(int)>
	//  122  276:checkcast       #139 <Class CandleEntry>
	//  123  279:astore          11
			drawValue(canvas, icandledataset.getValueFormatter(), candleentry.getHigh(), ((com.github.mikephil.charting.data.Entry) (candleentry)), i, f1, f2 - f, icandledataset.getValueTextColor(j / 2));
	//  124  281:aload_0         
	//  125  282:aload_1         
	//  126  283:aload           9
	//  127  285:invokeinterface #298 <Method com.github.mikephil.charting.formatter.ValueFormatter ICandleDataSet.getValueFormatter()>
	//  128  290:aload           11
	//  129  292:invokevirtual   #151 <Method float CandleEntry.getHigh()>
	//  130  295:aload           11
	//  131  297:iload           5
	//  132  299:fload_3         
	//  133  300:fload           4
	//  134  302:fload_2         
	//  135  303:fsub            
	//  136  304:aload           9
	//  137  306:iload           6
	//  138  308:iconst_2        
	//  139  309:idiv            
	//  140  310:invokeinterface #301 <Method int ICandleDataSet.getValueTextColor(int)>
	//  141  315:invokevirtual   #305 <Method void drawValue(Canvas, com.github.mikephil.charting.formatter.ValueFormatter, float, com.github.mikephil.charting.data.Entry, int, float, float, int)>
		}
		j += 2;
		  goto _L6
	//* 142  318:goto            253
	//  143  321:return          
	}

	public void initBuffers()
	{
	//    0    0:return          
	}

	private float mBodyBuffers[];
	protected CandleDataProvider mChart;
	private float mCloseBuffers[];
	private float mOpenBuffers[];
	private float mRangeBuffers[];
	private float mShadowBuffers[];
}
