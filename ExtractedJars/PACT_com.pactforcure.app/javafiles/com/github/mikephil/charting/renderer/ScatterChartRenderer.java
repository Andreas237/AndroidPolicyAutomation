// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.renderer;

import android.graphics.*;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.ScatterBuffer;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.ScatterData;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.utils.*;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.renderer:
//			LineScatterCandleRadarRenderer

public class ScatterChartRenderer extends LineScatterCandleRadarRenderer
{

	public ScatterChartRenderer(ScatterDataProvider scatterdataprovider, ChartAnimator chartanimator, ViewPortHandler viewporthandler)
	{
		super(chartanimator, viewporthandler);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #15  <Method void LineScatterCandleRadarRenderer(ChartAnimator, ViewPortHandler)>
		mChart = scatterdataprovider;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #17  <Field ScatterDataProvider mChart>
	//    7   11:return          
	}

	public void drawData(Canvas canvas)
	{
		Iterator iterator = mChart.getScatterData().getDataSets().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ScatterDataProvider mChart>
	//    2    4:invokeinterface #26  <Method ScatterData ScatterDataProvider.getScatterData()>
	//    3    9:invokevirtual   #32  <Method List ScatterData.getDataSets()>
	//    4   12:invokeinterface #38  <Method Iterator List.iterator()>
	//    5   17:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    6   18:aload_2         
	//    7   19:invokeinterface #44  <Method boolean Iterator.hasNext()>
	//    8   24:ifeq            55
			IScatterDataSet iscatterdataset = (IScatterDataSet)iterator.next();
	//    9   27:aload_2         
	//   10   28:invokeinterface #48  <Method Object Iterator.next()>
	//   11   33:checkcast       #50  <Class IScatterDataSet>
	//   12   36:astore_3        
			if(iscatterdataset.isVisible())
	//*  13   37:aload_3         
	//*  14   38:invokeinterface #53  <Method boolean IScatterDataSet.isVisible()>
	//*  15   43:ifeq            18
				drawDataSet(canvas, iscatterdataset);
	//   16   46:aload_0         
	//   17   47:aload_1         
	//   18   48:aload_3         
	//   19   49:invokevirtual   #57  <Method void drawDataSet(Canvas, IScatterDataSet)>
		} while(true);
	//   20   52:goto            18
	//   21   55:return          
	}

	protected void drawDataSet(Canvas canvas, IScatterDataSet iscatterdataset)
	{
		float f2;
		float f3;
		float f4;
		float f5;
		float f6;
		int l;
		ScatterBuffer scatterbuffer;
		com.github.mikephil.charting.charts.ScatterChart.ScatterShape scattershape;
		Transformer transformer = mChart.getTransformer(iscatterdataset.getAxisDependency());
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ScatterDataProvider mChart>
	//    2    4:aload_2         
	//    3    5:invokeinterface #61  <Method com.github.mikephil.charting.components.YAxis$AxisDependency IScatterDataSet.getAxisDependency()>
	//    4   10:invokeinterface #65  <Method Transformer ScatterDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//    5   15:astore          13
		float f = mAnimator.getPhaseX();
	//    6   17:aload_0         
	//    7   18:getfield        #69  <Field ChartAnimator mAnimator>
	//    8   21:invokevirtual   #75  <Method float ChartAnimator.getPhaseX()>
	//    9   24:fstore_3        
		float f1 = mAnimator.getPhaseY();
	//   10   25:aload_0         
	//   11   26:getfield        #69  <Field ChartAnimator mAnimator>
	//   12   29:invokevirtual   #78  <Method float ChartAnimator.getPhaseY()>
	//   13   32:fstore          4
		f5 = Utils.convertDpToPixel(iscatterdataset.getScatterShapeSize());
	//   14   34:aload_2         
	//   15   35:invokeinterface #81  <Method float IScatterDataSet.getScatterShapeSize()>
	//   16   40:invokestatic    #87  <Method float Utils.convertDpToPixel(float)>
	//   17   43:fstore          8
		f2 = f5 / 2.0F;
	//   18   45:fload           8
	//   19   47:fconst_2        
	//   20   48:fdiv            
	//   21   49:fstore          5
		f3 = Utils.convertDpToPixel(iscatterdataset.getScatterShapeHoleRadius());
	//   22   51:aload_2         
	//   23   52:invokeinterface #90  <Method float IScatterDataSet.getScatterShapeHoleRadius()>
	//   24   57:invokestatic    #87  <Method float Utils.convertDpToPixel(float)>
	//   25   60:fstore          6
		f4 = f3 * 2.0F;
	//   26   62:fload           6
	//   27   64:fconst_2        
	//   28   65:fmul            
	//   29   66:fstore          7
		l = iscatterdataset.getScatterShapeHoleColor();
	//   30   68:aload_2         
	//   31   69:invokeinterface #94  <Method int IScatterDataSet.getScatterShapeHoleColor()>
	//   32   74:istore          11
		f5 = (f5 - f4) / 2.0F;
	//   33   76:fload           8
	//   34   78:fload           7
	//   35   80:fsub            
	//   36   81:fconst_2        
	//   37   82:fdiv            
	//   38   83:fstore          8
		f6 = f5 / 2.0F;
	//   39   85:fload           8
	//   40   87:fconst_2        
	//   41   88:fdiv            
	//   42   89:fstore          9
		scattershape = iscatterdataset.getScatterShape();
	//   43   91:aload_2         
	//   44   92:invokeinterface #98  <Method com.github.mikephil.charting.charts.ScatterChart$ScatterShape IScatterDataSet.getScatterShape()>
	//   45   97:astore          14
		scatterbuffer = mScatterBuffers[mChart.getScatterData().getIndexOfDataSet(((com.github.mikephil.charting.interfaces.datasets.IDataSet) (iscatterdataset)))];
	//   46   99:aload_0         
	//   47  100:getfield        #100 <Field ScatterBuffer[] mScatterBuffers>
	//   48  103:aload_0         
	//   49  104:getfield        #17  <Field ScatterDataProvider mChart>
	//   50  107:invokeinterface #26  <Method ScatterData ScatterDataProvider.getScatterData()>
	//   51  112:aload_2         
	//   52  113:invokevirtual   #104 <Method int ScatterData.getIndexOfDataSet(com.github.mikephil.charting.interfaces.datasets.IDataSet)>
	//   53  116:aaload          
	//   54  117:astore          12
		scatterbuffer.setPhases(f, f1);
	//   55  119:aload           12
	//   56  121:fload_3         
	//   57  122:fload           4
	//   58  124:invokevirtual   #110 <Method void ScatterBuffer.setPhases(float, float)>
		scatterbuffer.feed(iscatterdataset);
	//   59  127:aload           12
	//   60  129:aload_2         
	//   61  130:invokevirtual   #114 <Method void ScatterBuffer.feed(IScatterDataSet)>
		transformer.pointValuesToPixel(scatterbuffer.buffer);
	//   62  133:aload           13
	//   63  135:aload           12
	//   64  137:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//   65  140:invokevirtual   #124 <Method void Transformer.pointValuesToPixel(float[])>
		static class _cls1
		{

			static final int $SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape[];

			static 
			{
				$SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape = new int[com.github.mikephil.charting.charts.ScatterChart.ScatterShape.values().length];
			//    0    0:invokestatic    #18  <Method com.github.mikephil.charting.charts.ScatterChart$ScatterShape[] com.github.mikephil.charting.charts.ScatterChart$ScatterShape.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape>
				try
				{
					$SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape[com.github.mikephil.charting.charts.ScatterChart.ScatterShape.SQUARE.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape>
			//    5   12:getstatic       #24  <Field com.github.mikephil.charting.charts.ScatterChart$ScatterShape com.github.mikephil.charting.charts.ScatterChart$ScatterShape.SQUARE>
			//    6   15:invokevirtual   #28  <Method int com.github.mikephil.charting.charts.ScatterChart$ScatterShape.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape>
			//*  10   23:getstatic       #31  <Field com.github.mikephil.charting.charts.ScatterChart$ScatterShape com.github.mikephil.charting.charts.ScatterChart$ScatterShape.CIRCLE>
			//*  11   26:invokevirtual   #28  <Method int com.github.mikephil.charting.charts.ScatterChart$ScatterShape.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape>
			//*  15   34:getstatic       #34  <Field com.github.mikephil.charting.charts.ScatterChart$ScatterShape com.github.mikephil.charting.charts.ScatterChart$ScatterShape.TRIANGLE>
			//*  16   37:invokevirtual   #28  <Method int com.github.mikephil.charting.charts.ScatterChart$ScatterShape.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape>
			//*  20   45:getstatic       #37  <Field com.github.mikephil.charting.charts.ScatterChart$ScatterShape com.github.mikephil.charting.charts.ScatterChart$ScatterShape.CROSS>
			//*  21   48:invokevirtual   #28  <Method int com.github.mikephil.charting.charts.ScatterChart$ScatterShape.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape>
			//*  25   56:getstatic       #40  <Field com.github.mikephil.charting.charts.ScatterChart$ScatterShape com.github.mikephil.charting.charts.ScatterChart$ScatterShape.X>
			//*  26   59:invokevirtual   #28  <Method int com.github.mikephil.charting.charts.ScatterChart$ScatterShape.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:return          
			//*  30   65:astore_0        
			//*  31   66:return          
			//*  32   67:astore_0        
			//*  33   68:goto            53
			//*  34   71:astore_0        
			//*  35   72:goto            42
			//*  36   75:astore_0        
			//*  37   76:goto            31
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   38   79:astore_0        
				try
				{
					$SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape[com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CIRCLE.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror3) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape[com.github.mikephil.charting.charts.ScatterChart.ScatterShape.TRIANGLE.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape[com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CROSS.ordinal()] = 4;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape[com.github.mikephil.charting.charts.ScatterChart.ScatterShape.X.ordinal()] = 5;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  39   80:goto            20
			}
		}

		_cls1..SwitchMap.com.github.mikephil.charting.charts.ScatterChart.ScatterShape[scattershape.ordinal()];
	//   66  143:getstatic       #128 <Field int[] ScatterChartRenderer$1.$SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape>
	//   67  146:aload           14
	//   68  148:invokevirtual   #133 <Method int com.github.mikephil.charting.charts.ScatterChart$ScatterShape.ordinal()>
	//   69  151:iaload          
		JVM INSTR tableswitch 1 5: default 188
	//	               1 189
	//	               2 532
	//	               3 782
	//	               4 1313
	//	               5 1532;
	//   70  152:tableswitch     1 5: default 188
	//	               1 189
	//	               2 532
	//	               3 782
	//	               4 1313
	//	               5 1532
		   goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
		return;
	//   71  188:return          
_L2:
		int i = 0;
	//   72  189:iconst_0        
	//   73  190:istore          10
_L8:
		if(i >= scatterbuffer.size() || !mViewPortHandler.isInBoundsRight(scatterbuffer.buffer[i]))
			continue; /* Loop/switch isn't completed */
	//   74  192:iload           10
	//   75  194:aload           12
	//   76  196:invokevirtual   #136 <Method int ScatterBuffer.size()>
	//   77  199:icmpge          188
	//   78  202:aload_0         
	//   79  203:getfield        #140 <Field ViewPortHandler mViewPortHandler>
	//   80  206:aload           12
	//   81  208:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//   82  211:iload           10
	//   83  213:faload          
	//   84  214:invokevirtual   #146 <Method boolean ViewPortHandler.isInBoundsRight(float)>
	//   85  217:ifeq            188
		if(mViewPortHandler.isInBoundsLeft(scatterbuffer.buffer[i]) && mViewPortHandler.isInBoundsY(scatterbuffer.buffer[i + 1]))
			break; /* Loop/switch isn't completed */
	//   86  220:aload_0         
	//   87  221:getfield        #140 <Field ViewPortHandler mViewPortHandler>
	//   88  224:aload           12
	//   89  226:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//   90  229:iload           10
	//   91  231:faload          
	//   92  232:invokevirtual   #149 <Method boolean ViewPortHandler.isInBoundsLeft(float)>
	//   93  235:ifeq            258
	//   94  238:aload_0         
	//   95  239:getfield        #140 <Field ViewPortHandler mViewPortHandler>
	//   96  242:aload           12
	//   97  244:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//   98  247:iload           10
	//   99  249:iconst_1        
	//  100  250:iadd            
	//  101  251:faload          
	//  102  252:invokevirtual   #152 <Method boolean ViewPortHandler.isInBoundsY(float)>
	//  103  255:ifne            267
_L9:
		i += 2;
	//  104  258:iload           10
	//  105  260:iconst_2        
	//  106  261:iadd            
	//  107  262:istore          10
		if(true) goto _L8; else goto _L7
	//  108  264:goto            192
_L7:
		mRenderPaint.setColor(iscatterdataset.getColor(i / 2));
	//  109  267:aload_0         
	//  110  268:getfield        #156 <Field Paint mRenderPaint>
	//  111  271:aload_2         
	//  112  272:iload           10
	//  113  274:iconst_2        
	//  114  275:idiv            
	//  115  276:invokeinterface #160 <Method int IScatterDataSet.getColor(int)>
	//  116  281:invokevirtual   #166 <Method void Paint.setColor(int)>
		if((double)f4 > 0.0D)
	//* 117  284:fload           7
	//* 118  286:f2d             
	//* 119  287:dconst_0        
	//* 120  288:dcmpl           
	//* 121  289:ifle            463
		{
			mRenderPaint.setStyle(android.graphics.Paint.Style.STROKE);
	//  122  292:aload_0         
	//  123  293:getfield        #156 <Field Paint mRenderPaint>
	//  124  296:getstatic       #172 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//  125  299:invokevirtual   #176 <Method void Paint.setStyle(android.graphics.Paint$Style)>
			mRenderPaint.setStrokeWidth(f5);
	//  126  302:aload_0         
	//  127  303:getfield        #156 <Field Paint mRenderPaint>
	//  128  306:fload           8
	//  129  308:invokevirtual   #180 <Method void Paint.setStrokeWidth(float)>
			canvas.drawRect(scatterbuffer.buffer[i] - f3 - f6, scatterbuffer.buffer[i + 1] - f3 - f6, scatterbuffer.buffer[i] + f3 + f6, scatterbuffer.buffer[i + 1] + f3 + f6, mRenderPaint);
	//  130  311:aload_1         
	//  131  312:aload           12
	//  132  314:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  133  317:iload           10
	//  134  319:faload          
	//  135  320:fload           6
	//  136  322:fsub            
	//  137  323:fload           9
	//  138  325:fsub            
	//  139  326:aload           12
	//  140  328:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  141  331:iload           10
	//  142  333:iconst_1        
	//  143  334:iadd            
	//  144  335:faload          
	//  145  336:fload           6
	//  146  338:fsub            
	//  147  339:fload           9
	//  148  341:fsub            
	//  149  342:aload           12
	//  150  344:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  151  347:iload           10
	//  152  349:faload          
	//  153  350:fload           6
	//  154  352:fadd            
	//  155  353:fload           9
	//  156  355:fadd            
	//  157  356:aload           12
	//  158  358:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  159  361:iload           10
	//  160  363:iconst_1        
	//  161  364:iadd            
	//  162  365:faload          
	//  163  366:fload           6
	//  164  368:fadd            
	//  165  369:fload           9
	//  166  371:fadd            
	//  167  372:aload_0         
	//  168  373:getfield        #156 <Field Paint mRenderPaint>
	//  169  376:invokevirtual   #186 <Method void Canvas.drawRect(float, float, float, float, Paint)>
			if(l != -1)
	//* 170  379:iload           11
	//* 171  381:iconst_m1       
	//* 172  382:icmpeq          258
			{
				mRenderPaint.setStyle(android.graphics.Paint.Style.FILL);
	//  173  385:aload_0         
	//  174  386:getfield        #156 <Field Paint mRenderPaint>
	//  175  389:getstatic       #189 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//  176  392:invokevirtual   #176 <Method void Paint.setStyle(android.graphics.Paint$Style)>
				mRenderPaint.setColor(l);
	//  177  395:aload_0         
	//  178  396:getfield        #156 <Field Paint mRenderPaint>
	//  179  399:iload           11
	//  180  401:invokevirtual   #166 <Method void Paint.setColor(int)>
				canvas.drawRect(scatterbuffer.buffer[i] - f3, scatterbuffer.buffer[i + 1] - f3, scatterbuffer.buffer[i] + f3, scatterbuffer.buffer[i + 1] + f3, mRenderPaint);
	//  181  404:aload_1         
	//  182  405:aload           12
	//  183  407:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  184  410:iload           10
	//  185  412:faload          
	//  186  413:fload           6
	//  187  415:fsub            
	//  188  416:aload           12
	//  189  418:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  190  421:iload           10
	//  191  423:iconst_1        
	//  192  424:iadd            
	//  193  425:faload          
	//  194  426:fload           6
	//  195  428:fsub            
	//  196  429:aload           12
	//  197  431:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  198  434:iload           10
	//  199  436:faload          
	//  200  437:fload           6
	//  201  439:fadd            
	//  202  440:aload           12
	//  203  442:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  204  445:iload           10
	//  205  447:iconst_1        
	//  206  448:iadd            
	//  207  449:faload          
	//  208  450:fload           6
	//  209  452:fadd            
	//  210  453:aload_0         
	//  211  454:getfield        #156 <Field Paint mRenderPaint>
	//  212  457:invokevirtual   #186 <Method void Canvas.drawRect(float, float, float, float, Paint)>
			}
		} else
	//* 213  460:goto            258
		{
			mRenderPaint.setStyle(android.graphics.Paint.Style.FILL);
	//  214  463:aload_0         
	//  215  464:getfield        #156 <Field Paint mRenderPaint>
	//  216  467:getstatic       #189 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//  217  470:invokevirtual   #176 <Method void Paint.setStyle(android.graphics.Paint$Style)>
			canvas.drawRect(scatterbuffer.buffer[i] - f2, scatterbuffer.buffer[i + 1] - f2, scatterbuffer.buffer[i] + f2, scatterbuffer.buffer[i + 1] + f2, mRenderPaint);
	//  218  473:aload_1         
	//  219  474:aload           12
	//  220  476:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  221  479:iload           10
	//  222  481:faload          
	//  223  482:fload           5
	//  224  484:fsub            
	//  225  485:aload           12
	//  226  487:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  227  490:iload           10
	//  228  492:iconst_1        
	//  229  493:iadd            
	//  230  494:faload          
	//  231  495:fload           5
	//  232  497:fsub            
	//  233  498:aload           12
	//  234  500:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  235  503:iload           10
	//  236  505:faload          
	//  237  506:fload           5
	//  238  508:fadd            
	//  239  509:aload           12
	//  240  511:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  241  514:iload           10
	//  242  516:iconst_1        
	//  243  517:iadd            
	//  244  518:faload          
	//  245  519:fload           5
	//  246  521:fadd            
	//  247  522:aload_0         
	//  248  523:getfield        #156 <Field Paint mRenderPaint>
	//  249  526:invokevirtual   #186 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
		  goto _L9
		if(true) goto _L8; else goto _L3
	//* 250  529:goto            258
_L3:
		i = 0;
	//  251  532:iconst_0        
	//  252  533:istore          10
_L11:
		if(i >= scatterbuffer.size() || !mViewPortHandler.isInBoundsRight(scatterbuffer.buffer[i]))
			continue; /* Loop/switch isn't completed */
	//  253  535:iload           10
	//  254  537:aload           12
	//  255  539:invokevirtual   #136 <Method int ScatterBuffer.size()>
	//  256  542:icmpge          188
	//  257  545:aload_0         
	//  258  546:getfield        #140 <Field ViewPortHandler mViewPortHandler>
	//  259  549:aload           12
	//  260  551:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  261  554:iload           10
	//  262  556:faload          
	//  263  557:invokevirtual   #146 <Method boolean ViewPortHandler.isInBoundsRight(float)>
	//  264  560:ifeq            188
		if(mViewPortHandler.isInBoundsLeft(scatterbuffer.buffer[i]) && mViewPortHandler.isInBoundsY(scatterbuffer.buffer[i + 1]))
			break; /* Loop/switch isn't completed */
	//  265  563:aload_0         
	//  266  564:getfield        #140 <Field ViewPortHandler mViewPortHandler>
	//  267  567:aload           12
	//  268  569:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  269  572:iload           10
	//  270  574:faload          
	//  271  575:invokevirtual   #149 <Method boolean ViewPortHandler.isInBoundsLeft(float)>
	//  272  578:ifeq            601
	//  273  581:aload_0         
	//  274  582:getfield        #140 <Field ViewPortHandler mViewPortHandler>
	//  275  585:aload           12
	//  276  587:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  277  590:iload           10
	//  278  592:iconst_1        
	//  279  593:iadd            
	//  280  594:faload          
	//  281  595:invokevirtual   #152 <Method boolean ViewPortHandler.isInBoundsY(float)>
	//  282  598:ifne            610
_L12:
		i += 2;
	//  283  601:iload           10
	//  284  603:iconst_2        
	//  285  604:iadd            
	//  286  605:istore          10
		if(true) goto _L11; else goto _L10
	//  287  607:goto            535
_L10:
		mRenderPaint.setColor(iscatterdataset.getColor(i / 2));
	//  288  610:aload_0         
	//  289  611:getfield        #156 <Field Paint mRenderPaint>
	//  290  614:aload_2         
	//  291  615:iload           10
	//  292  617:iconst_2        
	//  293  618:idiv            
	//  294  619:invokeinterface #160 <Method int IScatterDataSet.getColor(int)>
	//  295  624:invokevirtual   #166 <Method void Paint.setColor(int)>
		if((double)f4 > 0.0D)
	//* 296  627:fload           7
	//* 297  629:f2d             
	//* 298  630:dconst_0        
	//* 299  631:dcmpl           
	//* 300  632:ifle            741
		{
			mRenderPaint.setStyle(android.graphics.Paint.Style.STROKE);
	//  301  635:aload_0         
	//  302  636:getfield        #156 <Field Paint mRenderPaint>
	//  303  639:getstatic       #172 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//  304  642:invokevirtual   #176 <Method void Paint.setStyle(android.graphics.Paint$Style)>
			mRenderPaint.setStrokeWidth(f5);
	//  305  645:aload_0         
	//  306  646:getfield        #156 <Field Paint mRenderPaint>
	//  307  649:fload           8
	//  308  651:invokevirtual   #180 <Method void Paint.setStrokeWidth(float)>
			canvas.drawCircle(scatterbuffer.buffer[i], scatterbuffer.buffer[i + 1], f3 + f6, mRenderPaint);
	//  309  654:aload_1         
	//  310  655:aload           12
	//  311  657:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  312  660:iload           10
	//  313  662:faload          
	//  314  663:aload           12
	//  315  665:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  316  668:iload           10
	//  317  670:iconst_1        
	//  318  671:iadd            
	//  319  672:faload          
	//  320  673:fload           6
	//  321  675:fload           9
	//  322  677:fadd            
	//  323  678:aload_0         
	//  324  679:getfield        #156 <Field Paint mRenderPaint>
	//  325  682:invokevirtual   #193 <Method void Canvas.drawCircle(float, float, float, Paint)>
			if(l != -1)
	//* 326  685:iload           11
	//* 327  687:iconst_m1       
	//* 328  688:icmpeq          601
			{
				mRenderPaint.setStyle(android.graphics.Paint.Style.FILL);
	//  329  691:aload_0         
	//  330  692:getfield        #156 <Field Paint mRenderPaint>
	//  331  695:getstatic       #189 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//  332  698:invokevirtual   #176 <Method void Paint.setStyle(android.graphics.Paint$Style)>
				mRenderPaint.setColor(l);
	//  333  701:aload_0         
	//  334  702:getfield        #156 <Field Paint mRenderPaint>
	//  335  705:iload           11
	//  336  707:invokevirtual   #166 <Method void Paint.setColor(int)>
				canvas.drawCircle(scatterbuffer.buffer[i], scatterbuffer.buffer[i + 1], f3, mRenderPaint);
	//  337  710:aload_1         
	//  338  711:aload           12
	//  339  713:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  340  716:iload           10
	//  341  718:faload          
	//  342  719:aload           12
	//  343  721:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  344  724:iload           10
	//  345  726:iconst_1        
	//  346  727:iadd            
	//  347  728:faload          
	//  348  729:fload           6
	//  349  731:aload_0         
	//  350  732:getfield        #156 <Field Paint mRenderPaint>
	//  351  735:invokevirtual   #193 <Method void Canvas.drawCircle(float, float, float, Paint)>
			}
		} else
	//* 352  738:goto            601
		{
			mRenderPaint.setStyle(android.graphics.Paint.Style.FILL);
	//  353  741:aload_0         
	//  354  742:getfield        #156 <Field Paint mRenderPaint>
	//  355  745:getstatic       #189 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//  356  748:invokevirtual   #176 <Method void Paint.setStyle(android.graphics.Paint$Style)>
			canvas.drawCircle(scatterbuffer.buffer[i], scatterbuffer.buffer[i + 1], f2, mRenderPaint);
	//  357  751:aload_1         
	//  358  752:aload           12
	//  359  754:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  360  757:iload           10
	//  361  759:faload          
	//  362  760:aload           12
	//  363  762:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  364  765:iload           10
	//  365  767:iconst_1        
	//  366  768:iadd            
	//  367  769:faload          
	//  368  770:fload           5
	//  369  772:aload_0         
	//  370  773:getfield        #156 <Field Paint mRenderPaint>
	//  371  776:invokevirtual   #193 <Method void Canvas.drawCircle(float, float, float, Paint)>
		}
		  goto _L12
		if(true) goto _L11; else goto _L4
	//* 372  779:goto            601
_L4:
		Path path;
		mRenderPaint.setStyle(android.graphics.Paint.Style.FILL);
	//  373  782:aload_0         
	//  374  783:getfield        #156 <Field Paint mRenderPaint>
	//  375  786:getstatic       #189 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//  376  789:invokevirtual   #176 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		path = new Path();
	//  377  792:new             #195 <Class Path>
	//  378  795:dup             
	//  379  796:invokespecial   #198 <Method void Path()>
	//  380  799:astore          13
		i = 0;
	//  381  801:iconst_0        
	//  382  802:istore          10
_L14:
		if(i >= scatterbuffer.size() || !mViewPortHandler.isInBoundsRight(scatterbuffer.buffer[i]))
			continue; /* Loop/switch isn't completed */
	//  383  804:iload           10
	//  384  806:aload           12
	//  385  808:invokevirtual   #136 <Method int ScatterBuffer.size()>
	//  386  811:icmpge          188
	//  387  814:aload_0         
	//  388  815:getfield        #140 <Field ViewPortHandler mViewPortHandler>
	//  389  818:aload           12
	//  390  820:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  391  823:iload           10
	//  392  825:faload          
	//  393  826:invokevirtual   #146 <Method boolean ViewPortHandler.isInBoundsRight(float)>
	//  394  829:ifeq            188
		if(mViewPortHandler.isInBoundsLeft(scatterbuffer.buffer[i]) && mViewPortHandler.isInBoundsY(scatterbuffer.buffer[i + 1]))
			break; /* Loop/switch isn't completed */
	//  395  832:aload_0         
	//  396  833:getfield        #140 <Field ViewPortHandler mViewPortHandler>
	//  397  836:aload           12
	//  398  838:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  399  841:iload           10
	//  400  843:faload          
	//  401  844:invokevirtual   #149 <Method boolean ViewPortHandler.isInBoundsLeft(float)>
	//  402  847:ifeq            870
	//  403  850:aload_0         
	//  404  851:getfield        #140 <Field ViewPortHandler mViewPortHandler>
	//  405  854:aload           12
	//  406  856:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  407  859:iload           10
	//  408  861:iconst_1        
	//  409  862:iadd            
	//  410  863:faload          
	//  411  864:invokevirtual   #152 <Method boolean ViewPortHandler.isInBoundsY(float)>
	//  412  867:ifne            879
_L15:
		i += 2;
	//  413  870:iload           10
	//  414  872:iconst_2        
	//  415  873:iadd            
	//  416  874:istore          10
		if(true) goto _L14; else goto _L13
	//  417  876:goto            804
_L13:
		mRenderPaint.setColor(iscatterdataset.getColor(i / 2));
	//  418  879:aload_0         
	//  419  880:getfield        #156 <Field Paint mRenderPaint>
	//  420  883:aload_2         
	//  421  884:iload           10
	//  422  886:iconst_2        
	//  423  887:idiv            
	//  424  888:invokeinterface #160 <Method int IScatterDataSet.getColor(int)>
	//  425  893:invokevirtual   #166 <Method void Paint.setColor(int)>
		path.moveTo(scatterbuffer.buffer[i], scatterbuffer.buffer[i + 1] - f2);
	//  426  896:aload           13
	//  427  898:aload           12
	//  428  900:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  429  903:iload           10
	//  430  905:faload          
	//  431  906:aload           12
	//  432  908:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  433  911:iload           10
	//  434  913:iconst_1        
	//  435  914:iadd            
	//  436  915:faload          
	//  437  916:fload           5
	//  438  918:fsub            
	//  439  919:invokevirtual   #201 <Method void Path.moveTo(float, float)>
		path.lineTo(scatterbuffer.buffer[i] + f2, scatterbuffer.buffer[i + 1] + f2);
	//  440  922:aload           13
	//  441  924:aload           12
	//  442  926:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  443  929:iload           10
	//  444  931:faload          
	//  445  932:fload           5
	//  446  934:fadd            
	//  447  935:aload           12
	//  448  937:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  449  940:iload           10
	//  450  942:iconst_1        
	//  451  943:iadd            
	//  452  944:faload          
	//  453  945:fload           5
	//  454  947:fadd            
	//  455  948:invokevirtual   #204 <Method void Path.lineTo(float, float)>
		path.lineTo(scatterbuffer.buffer[i] - f2, scatterbuffer.buffer[i + 1] + f2);
	//  456  951:aload           13
	//  457  953:aload           12
	//  458  955:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  459  958:iload           10
	//  460  960:faload          
	//  461  961:fload           5
	//  462  963:fsub            
	//  463  964:aload           12
	//  464  966:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  465  969:iload           10
	//  466  971:iconst_1        
	//  467  972:iadd            
	//  468  973:faload          
	//  469  974:fload           5
	//  470  976:fadd            
	//  471  977:invokevirtual   #204 <Method void Path.lineTo(float, float)>
		if((double)f4 > 0.0D)
	//* 472  980:fload           7
	//* 473  982:f2d             
	//* 474  983:dconst_0        
	//* 475  984:dcmpl           
	//* 476  985:ifle            1148
		{
			path.lineTo(scatterbuffer.buffer[i], scatterbuffer.buffer[i + 1] - f2);
	//  477  988:aload           13
	//  478  990:aload           12
	//  479  992:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  480  995:iload           10
	//  481  997:faload          
	//  482  998:aload           12
	//  483 1000:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  484 1003:iload           10
	//  485 1005:iconst_1        
	//  486 1006:iadd            
	//  487 1007:faload          
	//  488 1008:fload           5
	//  489 1010:fsub            
	//  490 1011:invokevirtual   #204 <Method void Path.lineTo(float, float)>
			path.moveTo((scatterbuffer.buffer[i] - f2) + f5, (scatterbuffer.buffer[i + 1] + f2) - f5);
	//  491 1014:aload           13
	//  492 1016:aload           12
	//  493 1018:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  494 1021:iload           10
	//  495 1023:faload          
	//  496 1024:fload           5
	//  497 1026:fsub            
	//  498 1027:fload           8
	//  499 1029:fadd            
	//  500 1030:aload           12
	//  501 1032:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  502 1035:iload           10
	//  503 1037:iconst_1        
	//  504 1038:iadd            
	//  505 1039:faload          
	//  506 1040:fload           5
	//  507 1042:fadd            
	//  508 1043:fload           8
	//  509 1045:fsub            
	//  510 1046:invokevirtual   #201 <Method void Path.moveTo(float, float)>
			path.lineTo((scatterbuffer.buffer[i] + f2) - f5, (scatterbuffer.buffer[i + 1] + f2) - f5);
	//  511 1049:aload           13
	//  512 1051:aload           12
	//  513 1053:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  514 1056:iload           10
	//  515 1058:faload          
	//  516 1059:fload           5
	//  517 1061:fadd            
	//  518 1062:fload           8
	//  519 1064:fsub            
	//  520 1065:aload           12
	//  521 1067:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  522 1070:iload           10
	//  523 1072:iconst_1        
	//  524 1073:iadd            
	//  525 1074:faload          
	//  526 1075:fload           5
	//  527 1077:fadd            
	//  528 1078:fload           8
	//  529 1080:fsub            
	//  530 1081:invokevirtual   #204 <Method void Path.lineTo(float, float)>
			path.lineTo(scatterbuffer.buffer[i], (scatterbuffer.buffer[i + 1] - f2) + f5);
	//  531 1084:aload           13
	//  532 1086:aload           12
	//  533 1088:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  534 1091:iload           10
	//  535 1093:faload          
	//  536 1094:aload           12
	//  537 1096:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  538 1099:iload           10
	//  539 1101:iconst_1        
	//  540 1102:iadd            
	//  541 1103:faload          
	//  542 1104:fload           5
	//  543 1106:fsub            
	//  544 1107:fload           8
	//  545 1109:fadd            
	//  546 1110:invokevirtual   #204 <Method void Path.lineTo(float, float)>
			path.lineTo((scatterbuffer.buffer[i] - f2) + f5, (scatterbuffer.buffer[i + 1] + f2) - f5);
	//  547 1113:aload           13
	//  548 1115:aload           12
	//  549 1117:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  550 1120:iload           10
	//  551 1122:faload          
	//  552 1123:fload           5
	//  553 1125:fsub            
	//  554 1126:fload           8
	//  555 1128:fadd            
	//  556 1129:aload           12
	//  557 1131:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  558 1134:iload           10
	//  559 1136:iconst_1        
	//  560 1137:iadd            
	//  561 1138:faload          
	//  562 1139:fload           5
	//  563 1141:fadd            
	//  564 1142:fload           8
	//  565 1144:fsub            
	//  566 1145:invokevirtual   #204 <Method void Path.lineTo(float, float)>
		}
		path.close();
	//  567 1148:aload           13
	//  568 1150:invokevirtual   #207 <Method void Path.close()>
		canvas.drawPath(path, mRenderPaint);
	//  569 1153:aload_1         
	//  570 1154:aload           13
	//  571 1156:aload_0         
	//  572 1157:getfield        #156 <Field Paint mRenderPaint>
	//  573 1160:invokevirtual   #211 <Method void Canvas.drawPath(Path, Paint)>
		path.reset();
	//  574 1163:aload           13
	//  575 1165:invokevirtual   #214 <Method void Path.reset()>
		if((double)f4 > 0.0D && l != -1)
	//* 576 1168:fload           7
	//* 577 1170:f2d             
	//* 578 1171:dconst_0        
	//* 579 1172:dcmpl           
	//* 580 1173:ifle            870
	//* 581 1176:iload           11
	//* 582 1178:iconst_m1       
	//* 583 1179:icmpeq          870
		{
			mRenderPaint.setColor(l);
	//  584 1182:aload_0         
	//  585 1183:getfield        #156 <Field Paint mRenderPaint>
	//  586 1186:iload           11
	//  587 1188:invokevirtual   #166 <Method void Paint.setColor(int)>
			path.moveTo(scatterbuffer.buffer[i], (scatterbuffer.buffer[i + 1] - f2) + f5);
	//  588 1191:aload           13
	//  589 1193:aload           12
	//  590 1195:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  591 1198:iload           10
	//  592 1200:faload          
	//  593 1201:aload           12
	//  594 1203:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  595 1206:iload           10
	//  596 1208:iconst_1        
	//  597 1209:iadd            
	//  598 1210:faload          
	//  599 1211:fload           5
	//  600 1213:fsub            
	//  601 1214:fload           8
	//  602 1216:fadd            
	//  603 1217:invokevirtual   #201 <Method void Path.moveTo(float, float)>
			path.lineTo((scatterbuffer.buffer[i] + f2) - f5, (scatterbuffer.buffer[i + 1] + f2) - f5);
	//  604 1220:aload           13
	//  605 1222:aload           12
	//  606 1224:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  607 1227:iload           10
	//  608 1229:faload          
	//  609 1230:fload           5
	//  610 1232:fadd            
	//  611 1233:fload           8
	//  612 1235:fsub            
	//  613 1236:aload           12
	//  614 1238:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  615 1241:iload           10
	//  616 1243:iconst_1        
	//  617 1244:iadd            
	//  618 1245:faload          
	//  619 1246:fload           5
	//  620 1248:fadd            
	//  621 1249:fload           8
	//  622 1251:fsub            
	//  623 1252:invokevirtual   #204 <Method void Path.lineTo(float, float)>
			path.lineTo((scatterbuffer.buffer[i] - f2) + f5, (scatterbuffer.buffer[i + 1] + f2) - f5);
	//  624 1255:aload           13
	//  625 1257:aload           12
	//  626 1259:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  627 1262:iload           10
	//  628 1264:faload          
	//  629 1265:fload           5
	//  630 1267:fsub            
	//  631 1268:fload           8
	//  632 1270:fadd            
	//  633 1271:aload           12
	//  634 1273:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  635 1276:iload           10
	//  636 1278:iconst_1        
	//  637 1279:iadd            
	//  638 1280:faload          
	//  639 1281:fload           5
	//  640 1283:fadd            
	//  641 1284:fload           8
	//  642 1286:fsub            
	//  643 1287:invokevirtual   #204 <Method void Path.lineTo(float, float)>
			path.close();
	//  644 1290:aload           13
	//  645 1292:invokevirtual   #207 <Method void Path.close()>
			canvas.drawPath(path, mRenderPaint);
	//  646 1295:aload_1         
	//  647 1296:aload           13
	//  648 1298:aload_0         
	//  649 1299:getfield        #156 <Field Paint mRenderPaint>
	//  650 1302:invokevirtual   #211 <Method void Canvas.drawPath(Path, Paint)>
			path.reset();
	//  651 1305:aload           13
	//  652 1307:invokevirtual   #214 <Method void Path.reset()>
		}
		  goto _L15
		if(true) goto _L14; else goto _L5
	//* 653 1310:goto            870
_L5:
		mRenderPaint.setStyle(android.graphics.Paint.Style.STROKE);
	//  654 1313:aload_0         
	//  655 1314:getfield        #156 <Field Paint mRenderPaint>
	//  656 1317:getstatic       #172 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//  657 1320:invokevirtual   #176 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		mRenderPaint.setStrokeWidth(Utils.convertDpToPixel(1.0F));
	//  658 1323:aload_0         
	//  659 1324:getfield        #156 <Field Paint mRenderPaint>
	//  660 1327:fconst_1        
	//  661 1328:invokestatic    #87  <Method float Utils.convertDpToPixel(float)>
	//  662 1331:invokevirtual   #180 <Method void Paint.setStrokeWidth(float)>
		int j = 0;
	//  663 1334:iconst_0        
	//  664 1335:istore          10
		while(j < scatterbuffer.size() && mViewPortHandler.isInBoundsRight(scatterbuffer.buffer[j])) 
	//* 665 1337:iload           10
	//* 666 1339:aload           12
	//* 667 1341:invokevirtual   #136 <Method int ScatterBuffer.size()>
	//* 668 1344:icmpge          188
	//* 669 1347:aload_0         
	//* 670 1348:getfield        #140 <Field ViewPortHandler mViewPortHandler>
	//* 671 1351:aload           12
	//* 672 1353:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//* 673 1356:iload           10
	//* 674 1358:faload          
	//* 675 1359:invokevirtual   #146 <Method boolean ViewPortHandler.isInBoundsRight(float)>
	//* 676 1362:ifeq            188
		{
			if(mViewPortHandler.isInBoundsLeft(scatterbuffer.buffer[j]) && mViewPortHandler.isInBoundsY(scatterbuffer.buffer[j + 1]))
	//* 677 1365:aload_0         
	//* 678 1366:getfield        #140 <Field ViewPortHandler mViewPortHandler>
	//* 679 1369:aload           12
	//* 680 1371:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//* 681 1374:iload           10
	//* 682 1376:faload          
	//* 683 1377:invokevirtual   #149 <Method boolean ViewPortHandler.isInBoundsLeft(float)>
	//* 684 1380:ifeq            1403
	//* 685 1383:aload_0         
	//* 686 1384:getfield        #140 <Field ViewPortHandler mViewPortHandler>
	//* 687 1387:aload           12
	//* 688 1389:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//* 689 1392:iload           10
	//* 690 1394:iconst_1        
	//* 691 1395:iadd            
	//* 692 1396:faload          
	//* 693 1397:invokevirtual   #152 <Method boolean ViewPortHandler.isInBoundsY(float)>
	//* 694 1400:ifne            1412
	//* 695 1403:iload           10
	//* 696 1405:iconst_2        
	//* 697 1406:iadd            
	//* 698 1407:istore          10
	//* 699 1409:goto            1337
			{
				mRenderPaint.setColor(iscatterdataset.getColor(j / 2));
	//  700 1412:aload_0         
	//  701 1413:getfield        #156 <Field Paint mRenderPaint>
	//  702 1416:aload_2         
	//  703 1417:iload           10
	//  704 1419:iconst_2        
	//  705 1420:idiv            
	//  706 1421:invokeinterface #160 <Method int IScatterDataSet.getColor(int)>
	//  707 1426:invokevirtual   #166 <Method void Paint.setColor(int)>
				canvas.drawLine(scatterbuffer.buffer[j] - f2, scatterbuffer.buffer[j + 1], scatterbuffer.buffer[j] + f2, scatterbuffer.buffer[j + 1], mRenderPaint);
	//  708 1429:aload_1         
	//  709 1430:aload           12
	//  710 1432:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  711 1435:iload           10
	//  712 1437:faload          
	//  713 1438:fload           5
	//  714 1440:fsub            
	//  715 1441:aload           12
	//  716 1443:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  717 1446:iload           10
	//  718 1448:iconst_1        
	//  719 1449:iadd            
	//  720 1450:faload          
	//  721 1451:aload           12
	//  722 1453:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  723 1456:iload           10
	//  724 1458:faload          
	//  725 1459:fload           5
	//  726 1461:fadd            
	//  727 1462:aload           12
	//  728 1464:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  729 1467:iload           10
	//  730 1469:iconst_1        
	//  731 1470:iadd            
	//  732 1471:faload          
	//  733 1472:aload_0         
	//  734 1473:getfield        #156 <Field Paint mRenderPaint>
	//  735 1476:invokevirtual   #217 <Method void Canvas.drawLine(float, float, float, float, Paint)>
				canvas.drawLine(scatterbuffer.buffer[j], scatterbuffer.buffer[j + 1] - f2, scatterbuffer.buffer[j], scatterbuffer.buffer[j + 1] + f2, mRenderPaint);
	//  736 1479:aload_1         
	//  737 1480:aload           12
	//  738 1482:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  739 1485:iload           10
	//  740 1487:faload          
	//  741 1488:aload           12
	//  742 1490:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  743 1493:iload           10
	//  744 1495:iconst_1        
	//  745 1496:iadd            
	//  746 1497:faload          
	//  747 1498:fload           5
	//  748 1500:fsub            
	//  749 1501:aload           12
	//  750 1503:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  751 1506:iload           10
	//  752 1508:faload          
	//  753 1509:aload           12
	//  754 1511:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  755 1514:iload           10
	//  756 1516:iconst_1        
	//  757 1517:iadd            
	//  758 1518:faload          
	//  759 1519:fload           5
	//  760 1521:fadd            
	//  761 1522:aload_0         
	//  762 1523:getfield        #156 <Field Paint mRenderPaint>
	//  763 1526:invokevirtual   #217 <Method void Canvas.drawLine(float, float, float, float, Paint)>
			}
			j += 2;
		}
		continue; /* Loop/switch isn't completed */
	//  764 1529:goto            1403
_L6:
		mRenderPaint.setStyle(android.graphics.Paint.Style.STROKE);
	//  765 1532:aload_0         
	//  766 1533:getfield        #156 <Field Paint mRenderPaint>
	//  767 1536:getstatic       #172 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//  768 1539:invokevirtual   #176 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		mRenderPaint.setStrokeWidth(Utils.convertDpToPixel(1.0F));
	//  769 1542:aload_0         
	//  770 1543:getfield        #156 <Field Paint mRenderPaint>
	//  771 1546:fconst_1        
	//  772 1547:invokestatic    #87  <Method float Utils.convertDpToPixel(float)>
	//  773 1550:invokevirtual   #180 <Method void Paint.setStrokeWidth(float)>
		int k = 0;
	//  774 1553:iconst_0        
	//  775 1554:istore          10
		while(k < scatterbuffer.size() && mViewPortHandler.isInBoundsRight(scatterbuffer.buffer[k])) 
	//* 776 1556:iload           10
	//* 777 1558:aload           12
	//* 778 1560:invokevirtual   #136 <Method int ScatterBuffer.size()>
	//* 779 1563:icmpge          188
	//* 780 1566:aload_0         
	//* 781 1567:getfield        #140 <Field ViewPortHandler mViewPortHandler>
	//* 782 1570:aload           12
	//* 783 1572:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//* 784 1575:iload           10
	//* 785 1577:faload          
	//* 786 1578:invokevirtual   #146 <Method boolean ViewPortHandler.isInBoundsRight(float)>
	//* 787 1581:ifeq            188
		{
			if(mViewPortHandler.isInBoundsLeft(scatterbuffer.buffer[k]) && mViewPortHandler.isInBoundsY(scatterbuffer.buffer[k + 1]))
	//* 788 1584:aload_0         
	//* 789 1585:getfield        #140 <Field ViewPortHandler mViewPortHandler>
	//* 790 1588:aload           12
	//* 791 1590:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//* 792 1593:iload           10
	//* 793 1595:faload          
	//* 794 1596:invokevirtual   #149 <Method boolean ViewPortHandler.isInBoundsLeft(float)>
	//* 795 1599:ifeq            1622
	//* 796 1602:aload_0         
	//* 797 1603:getfield        #140 <Field ViewPortHandler mViewPortHandler>
	//* 798 1606:aload           12
	//* 799 1608:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//* 800 1611:iload           10
	//* 801 1613:iconst_1        
	//* 802 1614:iadd            
	//* 803 1615:faload          
	//* 804 1616:invokevirtual   #152 <Method boolean ViewPortHandler.isInBoundsY(float)>
	//* 805 1619:ifne            1631
	//* 806 1622:iload           10
	//* 807 1624:iconst_2        
	//* 808 1625:iadd            
	//* 809 1626:istore          10
	//* 810 1628:goto            1556
			{
				mRenderPaint.setColor(iscatterdataset.getColor(k / 2));
	//  811 1631:aload_0         
	//  812 1632:getfield        #156 <Field Paint mRenderPaint>
	//  813 1635:aload_2         
	//  814 1636:iload           10
	//  815 1638:iconst_2        
	//  816 1639:idiv            
	//  817 1640:invokeinterface #160 <Method int IScatterDataSet.getColor(int)>
	//  818 1645:invokevirtual   #166 <Method void Paint.setColor(int)>
				canvas.drawLine(scatterbuffer.buffer[k] - f2, scatterbuffer.buffer[k + 1] - f2, scatterbuffer.buffer[k] + f2, scatterbuffer.buffer[k + 1] + f2, mRenderPaint);
	//  819 1648:aload_1         
	//  820 1649:aload           12
	//  821 1651:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  822 1654:iload           10
	//  823 1656:faload          
	//  824 1657:fload           5
	//  825 1659:fsub            
	//  826 1660:aload           12
	//  827 1662:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  828 1665:iload           10
	//  829 1667:iconst_1        
	//  830 1668:iadd            
	//  831 1669:faload          
	//  832 1670:fload           5
	//  833 1672:fsub            
	//  834 1673:aload           12
	//  835 1675:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  836 1678:iload           10
	//  837 1680:faload          
	//  838 1681:fload           5
	//  839 1683:fadd            
	//  840 1684:aload           12
	//  841 1686:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  842 1689:iload           10
	//  843 1691:iconst_1        
	//  844 1692:iadd            
	//  845 1693:faload          
	//  846 1694:fload           5
	//  847 1696:fadd            
	//  848 1697:aload_0         
	//  849 1698:getfield        #156 <Field Paint mRenderPaint>
	//  850 1701:invokevirtual   #217 <Method void Canvas.drawLine(float, float, float, float, Paint)>
				canvas.drawLine(scatterbuffer.buffer[k] + f2, scatterbuffer.buffer[k + 1] - f2, scatterbuffer.buffer[k] - f2, scatterbuffer.buffer[k + 1] + f2, mRenderPaint);
	//  851 1704:aload_1         
	//  852 1705:aload           12
	//  853 1707:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  854 1710:iload           10
	//  855 1712:faload          
	//  856 1713:fload           5
	//  857 1715:fadd            
	//  858 1716:aload           12
	//  859 1718:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  860 1721:iload           10
	//  861 1723:iconst_1        
	//  862 1724:iadd            
	//  863 1725:faload          
	//  864 1726:fload           5
	//  865 1728:fsub            
	//  866 1729:aload           12
	//  867 1731:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  868 1734:iload           10
	//  869 1736:faload          
	//  870 1737:fload           5
	//  871 1739:fsub            
	//  872 1740:aload           12
	//  873 1742:getfield        #118 <Field float[] ScatterBuffer.buffer>
	//  874 1745:iload           10
	//  875 1747:iconst_1        
	//  876 1748:iadd            
	//  877 1749:faload          
	//  878 1750:fload           5
	//  879 1752:fadd            
	//  880 1753:aload_0         
	//  881 1754:getfield        #156 <Field Paint mRenderPaint>
	//  882 1757:invokevirtual   #217 <Method void Canvas.drawLine(float, float, float, float, Paint)>
			}
			k += 2;
		}
		if(true) goto _L1; else goto _L16
	//  883 1760:goto            1622
_L16:
	}

	public void drawExtras(Canvas canvas)
	{
	//    0    0:return          
	}

	public void drawHighlighted(Canvas canvas, Highlight ahighlight[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		while(i < ahighlight.length) 
	//*   2    3:iload           5
	//*   3    5:aload_2         
	//*   4    6:arraylength     
	//*   5    7:icmpge          170
		{
			IScatterDataSet iscatterdataset = (IScatterDataSet)mChart.getScatterData().getDataSetByIndex(ahighlight[i].getDataSetIndex());
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field ScatterDataProvider mChart>
	//    8   14:invokeinterface #26  <Method ScatterData ScatterDataProvider.getScatterData()>
	//    9   19:aload_2         
	//   10   20:iload           5
	//   11   22:aaload          
	//   12   23:invokevirtual   #225 <Method int Highlight.getDataSetIndex()>
	//   13   26:invokevirtual   #229 <Method com.github.mikephil.charting.interfaces.datasets.IDataSet ScatterData.getDataSetByIndex(int)>
	//   14   29:checkcast       #50  <Class IScatterDataSet>
	//   15   32:astore          7
			if(iscatterdataset != null && iscatterdataset.isHighlightEnabled())
	//*  16   34:aload           7
	//*  17   36:ifnull          49
	//*  18   39:aload           7
	//*  19   41:invokeinterface #232 <Method boolean IScatterDataSet.isHighlightEnabled()>
	//*  20   46:ifne            58
	//*  21   49:iload           5
	//*  22   51:iconst_1        
	//*  23   52:iadd            
	//*  24   53:istore          5
	//*  25   55:goto            3
			{
				int j = ahighlight[i].getXIndex();
	//   26   58:aload_2         
	//   27   59:iload           5
	//   28   61:aaload          
	//   29   62:invokevirtual   #235 <Method int Highlight.getXIndex()>
	//   30   65:istore          6
				if((float)j <= mChart.getXChartMax() * mAnimator.getPhaseX())
	//*  31   67:iload           6
	//*  32   69:i2f             
	//*  33   70:aload_0         
	//*  34   71:getfield        #17  <Field ScatterDataProvider mChart>
	//*  35   74:invokeinterface #238 <Method float ScatterDataProvider.getXChartMax()>
	//*  36   79:aload_0         
	//*  37   80:getfield        #69  <Field ChartAnimator mAnimator>
	//*  38   83:invokevirtual   #75  <Method float ChartAnimator.getPhaseX()>
	//*  39   86:fmul            
	//*  40   87:fcmpl           
	//*  41   88:ifgt            49
				{
					float f = iscatterdataset.getYValForXIndex(j);
	//   42   91:aload           7
	//   43   93:iload           6
	//   44   95:invokeinterface #242 <Method float IScatterDataSet.getYValForXIndex(int)>
	//   45  100:fstore_3        
					if(f != (0.0F / 0.0F))
	//*  46  101:fload_3         
	//*  47  102:ldc1            #243 <Float (0.0F / 0.0F)>
	//*  48  104:fcmpl           
	//*  49  105:ifeq            49
					{
						float f1 = mAnimator.getPhaseY();
	//   50  108:aload_0         
	//   51  109:getfield        #69  <Field ChartAnimator mAnimator>
	//   52  112:invokevirtual   #78  <Method float ChartAnimator.getPhaseY()>
	//   53  115:fstore          4
						float af[] = new float[2];
	//   54  117:iconst_2        
	//   55  118:newarray        float[]
	//   56  120:astore          8
						af[0] = j;
	//   57  122:aload           8
	//   58  124:iconst_0        
	//   59  125:iload           6
	//   60  127:i2f             
	//   61  128:fastore         
						af[1] = f * f1;
	//   62  129:aload           8
	//   63  131:iconst_1        
	//   64  132:fload_3         
	//   65  133:fload           4
	//   66  135:fmul            
	//   67  136:fastore         
						mChart.getTransformer(iscatterdataset.getAxisDependency()).pointValuesToPixel(af);
	//   68  137:aload_0         
	//   69  138:getfield        #17  <Field ScatterDataProvider mChart>
	//   70  141:aload           7
	//   71  143:invokeinterface #61  <Method com.github.mikephil.charting.components.YAxis$AxisDependency IScatterDataSet.getAxisDependency()>
	//   72  148:invokeinterface #65  <Method Transformer ScatterDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   73  153:aload           8
	//   74  155:invokevirtual   #124 <Method void Transformer.pointValuesToPixel(float[])>
						drawHighlightLines(canvas, af, ((com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet) (iscatterdataset)));
	//   75  158:aload_0         
	//   76  159:aload_1         
	//   77  160:aload           8
	//   78  162:aload           7
	//   79  164:invokevirtual   #247 <Method void drawHighlightLines(Canvas, float[], com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet)>
					}
				}
			}
			i++;
		}
	//*  80  167:goto            49
	//   81  170:return          
	}

	public void drawValues(Canvas canvas)
	{
		if((float)mChart.getScatterData().getYValCount() < (float)mChart.getMaxVisibleCount() * mViewPortHandler.getScaleX())
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field ScatterDataProvider mChart>
	//*   2    4:invokeinterface #26  <Method ScatterData ScatterDataProvider.getScatterData()>
	//*   3    9:invokevirtual   #251 <Method int ScatterData.getYValCount()>
	//*   4   12:i2f             
	//*   5   13:aload_0         
	//*   6   14:getfield        #17  <Field ScatterDataProvider mChart>
	//*   7   17:invokeinterface #254 <Method int ScatterDataProvider.getMaxVisibleCount()>
	//*   8   22:i2f             
	//*   9   23:aload_0         
	//*  10   24:getfield        #140 <Field ViewPortHandler mViewPortHandler>
	//*  11   27:invokevirtual   #257 <Method float ViewPortHandler.getScaleX()>
	//*  12   30:fmul            
	//*  13   31:fcmpg           
	//*  14   32:ifge            293
		{
			List list = mChart.getScatterData().getDataSets();
	//   15   35:aload_0         
	//   16   36:getfield        #17  <Field ScatterDataProvider mChart>
	//   17   39:invokeinterface #26  <Method ScatterData ScatterDataProvider.getScatterData()>
	//   18   44:invokevirtual   #32  <Method List ScatterData.getDataSets()>
	//   19   47:astore          5
			int i = 0;
	//   20   49:iconst_0        
	//   21   50:istore_3        
			while(i < mChart.getScatterData().getDataSetCount()) 
	//*  22   51:iload_3         
	//*  23   52:aload_0         
	//*  24   53:getfield        #17  <Field ScatterDataProvider mChart>
	//*  25   56:invokeinterface #26  <Method ScatterData ScatterDataProvider.getScatterData()>
	//*  26   61:invokevirtual   #260 <Method int ScatterData.getDataSetCount()>
	//*  27   64:icmpge          293
			{
				IScatterDataSet iscatterdataset = (IScatterDataSet)list.get(i);
	//   28   67:aload           5
	//   29   69:iload_3         
	//   30   70:invokeinterface #264 <Method Object List.get(int)>
	//   31   75:checkcast       #50  <Class IScatterDataSet>
	//   32   78:astore          6
				if(iscatterdataset.isDrawValuesEnabled() && iscatterdataset.getEntryCount() != 0)
	//*  33   80:aload           6
	//*  34   82:invokeinterface #267 <Method boolean IScatterDataSet.isDrawValuesEnabled()>
	//*  35   87:ifeq            100
	//*  36   90:aload           6
	//*  37   92:invokeinterface #270 <Method int IScatterDataSet.getEntryCount()>
	//*  38   97:ifne            107
	//*  39  100:iload_3         
	//*  40  101:iconst_1        
	//*  41  102:iadd            
	//*  42  103:istore_3        
	//*  43  104:goto            51
				{
					applyValueTextStyle(((com.github.mikephil.charting.interfaces.datasets.IDataSet) (iscatterdataset)));
	//   44  107:aload_0         
	//   45  108:aload           6
	//   46  110:invokevirtual   #274 <Method void applyValueTextStyle(com.github.mikephil.charting.interfaces.datasets.IDataSet)>
					float af[] = mChart.getTransformer(iscatterdataset.getAxisDependency()).generateTransformedValuesScatter(iscatterdataset, mAnimator.getPhaseY());
	//   47  113:aload_0         
	//   48  114:getfield        #17  <Field ScatterDataProvider mChart>
	//   49  117:aload           6
	//   50  119:invokeinterface #61  <Method com.github.mikephil.charting.components.YAxis$AxisDependency IScatterDataSet.getAxisDependency()>
	//   51  124:invokeinterface #65  <Method Transformer ScatterDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   52  129:aload           6
	//   53  131:aload_0         
	//   54  132:getfield        #69  <Field ChartAnimator mAnimator>
	//   55  135:invokevirtual   #78  <Method float ChartAnimator.getPhaseY()>
	//   56  138:invokevirtual   #278 <Method float[] Transformer.generateTransformedValuesScatter(IScatterDataSet, float)>
	//   57  141:astore          7
					float f = Utils.convertDpToPixel(iscatterdataset.getScatterShapeSize());
	//   58  143:aload           6
	//   59  145:invokeinterface #81  <Method float IScatterDataSet.getScatterShapeSize()>
	//   60  150:invokestatic    #87  <Method float Utils.convertDpToPixel(float)>
	//   61  153:fstore_2        
					int j = 0;
	//   62  154:iconst_0        
	//   63  155:istore          4
					while((float)j < (float)af.length * mAnimator.getPhaseX() && mViewPortHandler.isInBoundsRight(af[j])) 
	//*  64  157:iload           4
	//*  65  159:i2f             
	//*  66  160:aload           7
	//*  67  162:arraylength     
	//*  68  163:i2f             
	//*  69  164:aload_0         
	//*  70  165:getfield        #69  <Field ChartAnimator mAnimator>
	//*  71  168:invokevirtual   #75  <Method float ChartAnimator.getPhaseX()>
	//*  72  171:fmul            
	//*  73  172:fcmpg           
	//*  74  173:ifge            100
	//*  75  176:aload_0         
	//*  76  177:getfield        #140 <Field ViewPortHandler mViewPortHandler>
	//*  77  180:aload           7
	//*  78  182:iload           4
	//*  79  184:faload          
	//*  80  185:invokevirtual   #146 <Method boolean ViewPortHandler.isInBoundsRight(float)>
	//*  81  188:ifeq            100
					{
						if(mViewPortHandler.isInBoundsLeft(af[j]) && mViewPortHandler.isInBoundsY(af[j + 1]))
	//*  82  191:aload_0         
	//*  83  192:getfield        #140 <Field ViewPortHandler mViewPortHandler>
	//*  84  195:aload           7
	//*  85  197:iload           4
	//*  86  199:faload          
	//*  87  200:invokevirtual   #149 <Method boolean ViewPortHandler.isInBoundsLeft(float)>
	//*  88  203:ifeq            223
	//*  89  206:aload_0         
	//*  90  207:getfield        #140 <Field ViewPortHandler mViewPortHandler>
	//*  91  210:aload           7
	//*  92  212:iload           4
	//*  93  214:iconst_1        
	//*  94  215:iadd            
	//*  95  216:faload          
	//*  96  217:invokevirtual   #152 <Method boolean ViewPortHandler.isInBoundsY(float)>
	//*  97  220:ifne            232
	//*  98  223:iload           4
	//*  99  225:iconst_2        
	//* 100  226:iadd            
	//* 101  227:istore          4
	//* 102  229:goto            157
						{
							Entry entry = iscatterdataset.getEntryForIndex(j / 2);
	//  103  232:aload           6
	//  104  234:iload           4
	//  105  236:iconst_2        
	//  106  237:idiv            
	//  107  238:invokeinterface #282 <Method Entry IScatterDataSet.getEntryForIndex(int)>
	//  108  243:astore          8
							drawValue(canvas, iscatterdataset.getValueFormatter(), entry.getVal(), entry, i, af[j], af[j + 1] - f, iscatterdataset.getValueTextColor(j / 2));
	//  109  245:aload_0         
	//  110  246:aload_1         
	//  111  247:aload           6
	//  112  249:invokeinterface #286 <Method com.github.mikephil.charting.formatter.ValueFormatter IScatterDataSet.getValueFormatter()>
	//  113  254:aload           8
	//  114  256:invokevirtual   #291 <Method float Entry.getVal()>
	//  115  259:aload           8
	//  116  261:iload_3         
	//  117  262:aload           7
	//  118  264:iload           4
	//  119  266:faload          
	//  120  267:aload           7
	//  121  269:iload           4
	//  122  271:iconst_1        
	//  123  272:iadd            
	//  124  273:faload          
	//  125  274:fload_2         
	//  126  275:fsub            
	//  127  276:aload           6
	//  128  278:iload           4
	//  129  280:iconst_2        
	//  130  281:idiv            
	//  131  282:invokeinterface #294 <Method int IScatterDataSet.getValueTextColor(int)>
	//  132  287:invokevirtual   #298 <Method void drawValue(Canvas, com.github.mikephil.charting.formatter.ValueFormatter, float, Entry, int, float, float, int)>
						}
						j += 2;
					}
				}
				i++;
			}
		}
	//* 133  290:goto            223
	//  134  293:return          
	}

	public void initBuffers()
	{
		ScatterData scatterdata = mChart.getScatterData();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ScatterDataProvider mChart>
	//    2    4:invokeinterface #26  <Method ScatterData ScatterDataProvider.getScatterData()>
	//    3    9:astore_2        
		mScatterBuffers = new ScatterBuffer[scatterdata.getDataSetCount()];
	//    4   10:aload_0         
	//    5   11:aload_2         
	//    6   12:invokevirtual   #260 <Method int ScatterData.getDataSetCount()>
	//    7   15:anewarray       ScatterBuffer[]
	//    8   18:putfield        #100 <Field ScatterBuffer[] mScatterBuffers>
		for(int i = 0; i < mScatterBuffers.length; i++)
	//*   9   21:iconst_0        
	//*  10   22:istore_1        
	//*  11   23:iload_1         
	//*  12   24:aload_0         
	//*  13   25:getfield        #100 <Field ScatterBuffer[] mScatterBuffers>
	//*  14   28:arraylength     
	//*  15   29:icmpge          69
		{
			IScatterDataSet iscatterdataset = (IScatterDataSet)scatterdata.getDataSetByIndex(i);
	//   16   32:aload_2         
	//   17   33:iload_1         
	//   18   34:invokevirtual   #229 <Method com.github.mikephil.charting.interfaces.datasets.IDataSet ScatterData.getDataSetByIndex(int)>
	//   19   37:checkcast       #50  <Class IScatterDataSet>
	//   20   40:astore_3        
			mScatterBuffers[i] = new ScatterBuffer(iscatterdataset.getEntryCount() * 2);
	//   21   41:aload_0         
	//   22   42:getfield        #100 <Field ScatterBuffer[] mScatterBuffers>
	//   23   45:iload_1         
	//   24   46:new             #106 <Class ScatterBuffer>
	//   25   49:dup             
	//   26   50:aload_3         
	//   27   51:invokeinterface #270 <Method int IScatterDataSet.getEntryCount()>
	//   28   56:iconst_2        
	//   29   57:imul            
	//   30   58:invokespecial   #301 <Method void ScatterBuffer(int)>
	//   31   61:aastore         
		}

	//   32   62:iload_1         
	//   33   63:iconst_1        
	//   34   64:iadd            
	//   35   65:istore_1        
	//*  36   66:goto            23
	//   37   69:return          
	}

	protected ScatterDataProvider mChart;
	protected ScatterBuffer mScatterBuffers[];
}
