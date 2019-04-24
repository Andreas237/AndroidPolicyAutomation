// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.renderer;

import android.graphics.*;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.BubbleData;
import com.github.mikephil.charting.data.BubbleEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet;
import com.github.mikephil.charting.utils.*;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.renderer:
//			DataRenderer

public class BubbleChartRenderer extends DataRenderer
{

	public BubbleChartRenderer(BubbleDataProvider bubbledataprovider, ChartAnimator chartanimator, ViewPortHandler viewporthandler)
	{
		super(chartanimator, viewporthandler);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #15  <Method void DataRenderer(ChartAnimator, ViewPortHandler)>
		sizeBuffer = new float[4];
	//    4    6:aload_0         
	//    5    7:iconst_4        
	//    6    8:newarray        float[]
	//    7   10:putfield        #17  <Field float[] sizeBuffer>
		pointBuffer = new float[2];
	//    8   13:aload_0         
	//    9   14:iconst_2        
	//   10   15:newarray        float[]
	//   11   17:putfield        #19  <Field float[] pointBuffer>
		_hsvBuffer = new float[3];
	//   12   20:aload_0         
	//   13   21:iconst_3        
	//   14   22:newarray        float[]
	//   15   24:putfield        #21  <Field float[] _hsvBuffer>
		mChart = bubbledataprovider;
	//   16   27:aload_0         
	//   17   28:aload_1         
	//   18   29:putfield        #23  <Field BubbleDataProvider mChart>
		mRenderPaint.setStyle(android.graphics.Paint.Style.FILL);
	//   19   32:aload_0         
	//   20   33:getfield        #27  <Field Paint mRenderPaint>
	//   21   36:getstatic       #33  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   22   39:invokevirtual   #39  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		mHighlightPaint.setStyle(android.graphics.Paint.Style.STROKE);
	//   23   42:aload_0         
	//   24   43:getfield        #42  <Field Paint mHighlightPaint>
	//   25   46:getstatic       #45  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   26   49:invokevirtual   #39  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		mHighlightPaint.setStrokeWidth(Utils.convertDpToPixel(1.5F));
	//   27   52:aload_0         
	//   28   53:getfield        #42  <Field Paint mHighlightPaint>
	//   29   56:ldc1            #46  <Float 1.5F>
	//   30   58:invokestatic    #52  <Method float Utils.convertDpToPixel(float)>
	//   31   61:invokevirtual   #56  <Method void Paint.setStrokeWidth(float)>
	//   32   64:return          
	}

	public void drawData(Canvas canvas)
	{
		Iterator iterator = mChart.getBubbleData().getDataSets().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field BubbleDataProvider mChart>
	//    2    4:invokeinterface #65  <Method BubbleData BubbleDataProvider.getBubbleData()>
	//    3    9:invokevirtual   #71  <Method List BubbleData.getDataSets()>
	//    4   12:invokeinterface #77  <Method Iterator List.iterator()>
	//    5   17:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    6   18:aload_2         
	//    7   19:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//    8   24:ifeq            64
			IBubbleDataSet ibubbledataset = (IBubbleDataSet)iterator.next();
	//    9   27:aload_2         
	//   10   28:invokeinterface #87  <Method Object Iterator.next()>
	//   11   33:checkcast       #89  <Class IBubbleDataSet>
	//   12   36:astore_3        
			if(ibubbledataset.isVisible() && ibubbledataset.getEntryCount() > 0)
	//*  13   37:aload_3         
	//*  14   38:invokeinterface #92  <Method boolean IBubbleDataSet.isVisible()>
	//*  15   43:ifeq            18
	//*  16   46:aload_3         
	//*  17   47:invokeinterface #96  <Method int IBubbleDataSet.getEntryCount()>
	//*  18   52:ifle            18
				drawDataSet(canvas, ibubbledataset);
	//   19   55:aload_0         
	//   20   56:aload_1         
	//   21   57:aload_3         
	//   22   58:invokevirtual   #100 <Method void drawDataSet(Canvas, IBubbleDataSet)>
		} while(true);
	//   23   61:goto            18
	//   24   64:return          
	}

	protected void drawDataSet(Canvas canvas, IBubbleDataSet ibubbledataset)
	{
		float f;
		float f1;
		float f2;
		int i;
		int j;
		int k;
		Transformer transformer;
		transformer = mChart.getTransformer(ibubbledataset.getAxisDependency());
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field BubbleDataProvider mChart>
	//    2    4:aload_2         
	//    3    5:invokeinterface #104 <Method com.github.mikephil.charting.components.YAxis$AxisDependency IBubbleDataSet.getAxisDependency()>
	//    4   10:invokeinterface #108 <Method Transformer BubbleDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//    5   15:astore          11
		f = mAnimator.getPhaseX();
	//    6   17:aload_0         
	//    7   18:getfield        #112 <Field ChartAnimator mAnimator>
	//    8   21:invokevirtual   #118 <Method float ChartAnimator.getPhaseX()>
	//    9   24:fstore_3        
		f1 = mAnimator.getPhaseY();
	//   10   25:aload_0         
	//   11   26:getfield        #112 <Field ChartAnimator mAnimator>
	//   12   29:invokevirtual   #121 <Method float ChartAnimator.getPhaseY()>
	//   13   32:fstore          4
		BubbleEntry bubbleentry = (BubbleEntry)ibubbledataset.getEntryForXIndex(mMinX);
	//   14   34:aload_2         
	//   15   35:aload_0         
	//   16   36:getfield        #125 <Field int mMinX>
	//   17   39:invokeinterface #129 <Method com.github.mikephil.charting.data.Entry IBubbleDataSet.getEntryForXIndex(int)>
	//   18   44:checkcast       #131 <Class BubbleEntry>
	//   19   47:astore          12
		BubbleEntry bubbleentry2 = (BubbleEntry)ibubbledataset.getEntryForXIndex(mMaxX);
	//   20   49:aload_2         
	//   21   50:aload_0         
	//   22   51:getfield        #134 <Field int mMaxX>
	//   23   54:invokeinterface #129 <Method com.github.mikephil.charting.data.Entry IBubbleDataSet.getEntryForXIndex(int)>
	//   24   59:checkcast       #131 <Class BubbleEntry>
	//   25   62:astore          13
		j = Math.max(ibubbledataset.getEntryIndex(((com.github.mikephil.charting.data.Entry) (bubbleentry))), 0);
	//   26   64:aload_2         
	//   27   65:aload           12
	//   28   67:invokeinterface #138 <Method int IBubbleDataSet.getEntryIndex(com.github.mikephil.charting.data.Entry)>
	//   29   72:iconst_0        
	//   30   73:invokestatic    #144 <Method int Math.max(int, int)>
	//   31   76:istore          8
		k = Math.min(ibubbledataset.getEntryIndex(((com.github.mikephil.charting.data.Entry) (bubbleentry2))) + 1, ibubbledataset.getEntryCount());
	//   32   78:aload_2         
	//   33   79:aload           13
	//   34   81:invokeinterface #138 <Method int IBubbleDataSet.getEntryIndex(com.github.mikephil.charting.data.Entry)>
	//   35   86:iconst_1        
	//   36   87:iadd            
	//   37   88:aload_2         
	//   38   89:invokeinterface #96  <Method int IBubbleDataSet.getEntryCount()>
	//   39   94:invokestatic    #147 <Method int Math.min(int, int)>
	//   40   97:istore          9
		sizeBuffer[0] = 0.0F;
	//   41   99:aload_0         
	//   42  100:getfield        #17  <Field float[] sizeBuffer>
	//   43  103:iconst_0        
	//   44  104:fconst_0        
	//   45  105:fastore         
		sizeBuffer[2] = 1.0F;
	//   46  106:aload_0         
	//   47  107:getfield        #17  <Field float[] sizeBuffer>
	//   48  110:iconst_2        
	//   49  111:fconst_1        
	//   50  112:fastore         
		transformer.pointValuesToPixel(sizeBuffer);
	//   51  113:aload           11
	//   52  115:aload_0         
	//   53  116:getfield        #17  <Field float[] sizeBuffer>
	//   54  119:invokevirtual   #153 <Method void Transformer.pointValuesToPixel(float[])>
		f2 = Math.abs(sizeBuffer[2] - sizeBuffer[0]);
	//   55  122:aload_0         
	//   56  123:getfield        #17  <Field float[] sizeBuffer>
	//   57  126:iconst_2        
	//   58  127:faload          
	//   59  128:aload_0         
	//   60  129:getfield        #17  <Field float[] sizeBuffer>
	//   61  132:iconst_0        
	//   62  133:faload          
	//   63  134:fsub            
	//   64  135:invokestatic    #156 <Method float Math.abs(float)>
	//   65  138:fstore          5
		f2 = Math.min(Math.abs(mViewPortHandler.contentBottom() - mViewPortHandler.contentTop()), f2);
	//   66  140:aload_0         
	//   67  141:getfield        #160 <Field ViewPortHandler mViewPortHandler>
	//   68  144:invokevirtual   #165 <Method float ViewPortHandler.contentBottom()>
	//   69  147:aload_0         
	//   70  148:getfield        #160 <Field ViewPortHandler mViewPortHandler>
	//   71  151:invokevirtual   #168 <Method float ViewPortHandler.contentTop()>
	//   72  154:fsub            
	//   73  155:invokestatic    #156 <Method float Math.abs(float)>
	//   74  158:fload           5
	//   75  160:invokestatic    #171 <Method float Math.min(float, float)>
	//   76  163:fstore          5
		i = j;
	//   77  165:iload           8
	//   78  167:istore          7
_L3:
		float f3;
		BubbleEntry bubbleentry1;
		if(i >= k)
			break; /* Loop/switch isn't completed */
	//   79  169:iload           7
	//   80  171:iload           9
	//   81  173:icmpge          339
		bubbleentry1 = (BubbleEntry)ibubbledataset.getEntryForIndex(i);
	//   82  176:aload_2         
	//   83  177:iload           7
	//   84  179:invokeinterface #174 <Method com.github.mikephil.charting.data.Entry IBubbleDataSet.getEntryForIndex(int)>
	//   85  184:checkcast       #131 <Class BubbleEntry>
	//   86  187:astore          12
		pointBuffer[0] = (float)(bubbleentry1.getXIndex() - j) * f + (float)j;
	//   87  189:aload_0         
	//   88  190:getfield        #19  <Field float[] pointBuffer>
	//   89  193:iconst_0        
	//   90  194:aload           12
	//   91  196:invokevirtual   #177 <Method int BubbleEntry.getXIndex()>
	//   92  199:iload           8
	//   93  201:isub            
	//   94  202:i2f             
	//   95  203:fload_3         
	//   96  204:fmul            
	//   97  205:iload           8
	//   98  207:i2f             
	//   99  208:fadd            
	//  100  209:fastore         
		pointBuffer[1] = bubbleentry1.getVal() * f1;
	//  101  210:aload_0         
	//  102  211:getfield        #19  <Field float[] pointBuffer>
	//  103  214:iconst_1        
	//  104  215:aload           12
	//  105  217:invokevirtual   #180 <Method float BubbleEntry.getVal()>
	//  106  220:fload           4
	//  107  222:fmul            
	//  108  223:fastore         
		transformer.pointValuesToPixel(pointBuffer);
	//  109  224:aload           11
	//  110  226:aload_0         
	//  111  227:getfield        #19  <Field float[] pointBuffer>
	//  112  230:invokevirtual   #153 <Method void Transformer.pointValuesToPixel(float[])>
		f3 = getShapeSize(bubbleentry1.getSize(), ibubbledataset.getMaxSize(), f2) / 2.0F;
	//  113  233:aload_0         
	//  114  234:aload           12
	//  115  236:invokevirtual   #183 <Method float BubbleEntry.getSize()>
	//  116  239:aload_2         
	//  117  240:invokeinterface #186 <Method float IBubbleDataSet.getMaxSize()>
	//  118  245:fload           5
	//  119  247:invokevirtual   #190 <Method float getShapeSize(float, float, float)>
	//  120  250:fconst_2        
	//  121  251:fdiv            
	//  122  252:fstore          6
		  goto _L1
	//* 123  254:aload_0         
	//* 124  255:getfield        #160 <Field ViewPortHandler mViewPortHandler>
	//* 125  258:aload_0         
	//* 126  259:getfield        #19  <Field float[] pointBuffer>
	//* 127  262:iconst_1        
	//* 128  263:faload          
	//* 129  264:fload           6
	//* 130  266:fadd            
	//* 131  267:invokevirtual   #194 <Method boolean ViewPortHandler.isInBoundsTop(float)>
	//* 132  270:ifeq            292
	//* 133  273:aload_0         
	//* 134  274:getfield        #160 <Field ViewPortHandler mViewPortHandler>
	//* 135  277:aload_0         
	//* 136  278:getfield        #19  <Field float[] pointBuffer>
	//* 137  281:iconst_1        
	//* 138  282:faload          
	//* 139  283:fload           6
	//* 140  285:fsub            
	//* 141  286:invokevirtual   #197 <Method boolean ViewPortHandler.isInBoundsBottom(float)>
	//* 142  289:ifne            301
_L5:
		i++;
	//  143  292:iload           7
	//  144  294:iconst_1        
	//  145  295:iadd            
	//  146  296:istore          7
		if(true) goto _L3; else goto _L2
	//  147  298:goto            169
_L1:
		if(!mViewPortHandler.isInBoundsTop(pointBuffer[1] + f3) || !mViewPortHandler.isInBoundsBottom(pointBuffer[1] - f3) || !mViewPortHandler.isInBoundsLeft(pointBuffer[0] + f3)) goto _L5; else goto _L4
	//  148  301:aload_0         
	//  149  302:getfield        #160 <Field ViewPortHandler mViewPortHandler>
	//  150  305:aload_0         
	//  151  306:getfield        #19  <Field float[] pointBuffer>
	//  152  309:iconst_0        
	//  153  310:faload          
	//  154  311:fload           6
	//  155  313:fadd            
	//  156  314:invokevirtual   #200 <Method boolean ViewPortHandler.isInBoundsLeft(float)>
	//  157  317:ifeq            292
_L4:
		if(mViewPortHandler.isInBoundsRight(pointBuffer[0] - f3))
			break MISSING_BLOCK_LABEL_340;
	//  158  320:aload_0         
	//  159  321:getfield        #160 <Field ViewPortHandler mViewPortHandler>
	//  160  324:aload_0         
	//  161  325:getfield        #19  <Field float[] pointBuffer>
	//  162  328:iconst_0        
	//  163  329:faload          
	//  164  330:fload           6
	//  165  332:fsub            
	//  166  333:invokevirtual   #203 <Method boolean ViewPortHandler.isInBoundsRight(float)>
	//  167  336:ifne            340
_L2:
		return;
	//  168  339:return          
		int l = ibubbledataset.getColor(bubbleentry1.getXIndex());
	//  169  340:aload_2         
	//  170  341:aload           12
	//  171  343:invokevirtual   #177 <Method int BubbleEntry.getXIndex()>
	//  172  346:invokeinterface #207 <Method int IBubbleDataSet.getColor(int)>
	//  173  351:istore          10
		mRenderPaint.setColor(l);
	//  174  353:aload_0         
	//  175  354:getfield        #27  <Field Paint mRenderPaint>
	//  176  357:iload           10
	//  177  359:invokevirtual   #211 <Method void Paint.setColor(int)>
		canvas.drawCircle(pointBuffer[0], pointBuffer[1], f3, mRenderPaint);
	//  178  362:aload_1         
	//  179  363:aload_0         
	//  180  364:getfield        #19  <Field float[] pointBuffer>
	//  181  367:iconst_0        
	//  182  368:faload          
	//  183  369:aload_0         
	//  184  370:getfield        #19  <Field float[] pointBuffer>
	//  185  373:iconst_1        
	//  186  374:faload          
	//  187  375:fload           6
	//  188  377:aload_0         
	//  189  378:getfield        #27  <Field Paint mRenderPaint>
	//  190  381:invokevirtual   #217 <Method void Canvas.drawCircle(float, float, float, Paint)>
		  goto _L5
	//* 191  384:goto            292
	}

	public void drawExtras(Canvas canvas)
	{
	//    0    0:return          
	}

	public void drawHighlighted(Canvas canvas, Highlight ahighlight[])
	{
		float f;
		float f1;
		int i;
		int j;
		BubbleData bubbledata;
		bubbledata = mChart.getBubbleData();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field BubbleDataProvider mChart>
	//    2    4:invokeinterface #65  <Method BubbleData BubbleDataProvider.getBubbleData()>
	//    3    9:astore          10
		f = mAnimator.getPhaseX();
	//    4   11:aload_0         
	//    5   12:getfield        #112 <Field ChartAnimator mAnimator>
	//    6   15:invokevirtual   #118 <Method float ChartAnimator.getPhaseX()>
	//    7   18:fstore_3        
		f1 = mAnimator.getPhaseY();
	//    8   19:aload_0         
	//    9   20:getfield        #112 <Field ChartAnimator mAnimator>
	//   10   23:invokevirtual   #121 <Method float ChartAnimator.getPhaseY()>
	//   11   26:fstore          4
		j = ahighlight.length;
	//   12   28:aload_2         
	//   13   29:arraylength     
	//   14   30:istore          7
		i = 0;
	//   15   32:iconst_0        
	//   16   33:istore          6
_L5:
		if(i >= j) goto _L2; else goto _L1
	//   17   35:iload           6
	//   18   37:iload           7
	//   19   39:icmpge          409
_L1:
		IBubbleDataSet ibubbledataset;
		Highlight highlight;
		highlight = ahighlight[i];
	//   20   42:aload_2         
	//   21   43:iload           6
	//   22   45:aaload          
	//   23   46:astore          12
		ibubbledataset = (IBubbleDataSet)bubbledata.getDataSetByIndex(highlight.getDataSetIndex());
	//   24   48:aload           10
	//   25   50:aload           12
	//   26   52:invokevirtual   #225 <Method int Highlight.getDataSetIndex()>
	//   27   55:invokevirtual   #229 <Method com.github.mikephil.charting.interfaces.datasets.IDataSet BubbleData.getDataSetByIndex(int)>
	//   28   58:checkcast       #89  <Class IBubbleDataSet>
	//   29   61:astore          11
		if(ibubbledataset != null && ibubbledataset.isHighlightEnabled()) goto _L4; else goto _L3
	//   30   63:aload           11
	//   31   65:ifnull          78
	//   32   68:aload           11
	//   33   70:invokeinterface #232 <Method boolean IBubbleDataSet.isHighlightEnabled()>
	//   34   75:ifne            87
_L3:
		i++;
	//   35   78:iload           6
	//   36   80:iconst_1        
	//   37   81:iadd            
	//   38   82:istore          6
		  goto _L5
	//*  39   84:goto            35
_L4:
		int k;
		int i1;
		BubbleEntry bubbleentry;
		bubbleentry = (BubbleEntry)ibubbledataset.getEntryForXIndex(mMinX);
	//   40   87:aload           11
	//   41   89:aload_0         
	//   42   90:getfield        #125 <Field int mMinX>
	//   43   93:invokeinterface #129 <Method com.github.mikephil.charting.data.Entry IBubbleDataSet.getEntryForXIndex(int)>
	//   44   98:checkcast       #131 <Class BubbleEntry>
	//   45  101:astore          13
		BubbleEntry bubbleentry1 = (BubbleEntry)ibubbledataset.getEntryForXIndex(mMaxX);
	//   46  103:aload           11
	//   47  105:aload_0         
	//   48  106:getfield        #134 <Field int mMaxX>
	//   49  109:invokeinterface #129 <Method com.github.mikephil.charting.data.Entry IBubbleDataSet.getEntryForXIndex(int)>
	//   50  114:checkcast       #131 <Class BubbleEntry>
	//   51  117:astore          14
		k = ibubbledataset.getEntryIndex(((com.github.mikephil.charting.data.Entry) (bubbleentry)));
	//   52  119:aload           11
	//   53  121:aload           13
	//   54  123:invokeinterface #138 <Method int IBubbleDataSet.getEntryIndex(com.github.mikephil.charting.data.Entry)>
	//   55  128:istore          8
		i1 = Math.min(ibubbledataset.getEntryIndex(((com.github.mikephil.charting.data.Entry) (bubbleentry1))) + 1, ibubbledataset.getEntryCount());
	//   56  130:aload           11
	//   57  132:aload           14
	//   58  134:invokeinterface #138 <Method int IBubbleDataSet.getEntryIndex(com.github.mikephil.charting.data.Entry)>
	//   59  139:iconst_1        
	//   60  140:iadd            
	//   61  141:aload           11
	//   62  143:invokeinterface #96  <Method int IBubbleDataSet.getEntryCount()>
	//   63  148:invokestatic    #147 <Method int Math.min(int, int)>
	//   64  151:istore          9
		bubbleentry = (BubbleEntry)bubbledata.getEntryForHighlight(highlight);
	//   65  153:aload           10
	//   66  155:aload           12
	//   67  157:invokevirtual   #236 <Method com.github.mikephil.charting.data.Entry BubbleData.getEntryForHighlight(Highlight)>
	//   68  160:checkcast       #131 <Class BubbleEntry>
	//   69  163:astore          13
		if(bubbleentry == null || bubbleentry.getXIndex() != highlight.getXIndex()) goto _L3; else goto _L6
	//   70  165:aload           13
	//   71  167:ifnull          78
	//   72  170:aload           13
	//   73  172:invokevirtual   #177 <Method int BubbleEntry.getXIndex()>
	//   74  175:aload           12
	//   75  177:invokevirtual   #237 <Method int Highlight.getXIndex()>
	//   76  180:icmpne          78
_L6:
		float f2;
		Transformer transformer = mChart.getTransformer(ibubbledataset.getAxisDependency());
	//   77  183:aload_0         
	//   78  184:getfield        #23  <Field BubbleDataProvider mChart>
	//   79  187:aload           11
	//   80  189:invokeinterface #104 <Method com.github.mikephil.charting.components.YAxis$AxisDependency IBubbleDataSet.getAxisDependency()>
	//   81  194:invokeinterface #108 <Method Transformer BubbleDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   82  199:astore          14
		sizeBuffer[0] = 0.0F;
	//   83  201:aload_0         
	//   84  202:getfield        #17  <Field float[] sizeBuffer>
	//   85  205:iconst_0        
	//   86  206:fconst_0        
	//   87  207:fastore         
		sizeBuffer[2] = 1.0F;
	//   88  208:aload_0         
	//   89  209:getfield        #17  <Field float[] sizeBuffer>
	//   90  212:iconst_2        
	//   91  213:fconst_1        
	//   92  214:fastore         
		transformer.pointValuesToPixel(sizeBuffer);
	//   93  215:aload           14
	//   94  217:aload_0         
	//   95  218:getfield        #17  <Field float[] sizeBuffer>
	//   96  221:invokevirtual   #153 <Method void Transformer.pointValuesToPixel(float[])>
		f2 = Math.abs(sizeBuffer[2] - sizeBuffer[0]);
	//   97  224:aload_0         
	//   98  225:getfield        #17  <Field float[] sizeBuffer>
	//   99  228:iconst_2        
	//  100  229:faload          
	//  101  230:aload_0         
	//  102  231:getfield        #17  <Field float[] sizeBuffer>
	//  103  234:iconst_0        
	//  104  235:faload          
	//  105  236:fsub            
	//  106  237:invokestatic    #156 <Method float Math.abs(float)>
	//  107  240:fstore          5
		f2 = Math.min(Math.abs(mViewPortHandler.contentBottom() - mViewPortHandler.contentTop()), f2);
	//  108  242:aload_0         
	//  109  243:getfield        #160 <Field ViewPortHandler mViewPortHandler>
	//  110  246:invokevirtual   #165 <Method float ViewPortHandler.contentBottom()>
	//  111  249:aload_0         
	//  112  250:getfield        #160 <Field ViewPortHandler mViewPortHandler>
	//  113  253:invokevirtual   #168 <Method float ViewPortHandler.contentTop()>
	//  114  256:fsub            
	//  115  257:invokestatic    #156 <Method float Math.abs(float)>
	//  116  260:fload           5
	//  117  262:invokestatic    #171 <Method float Math.min(float, float)>
	//  118  265:fstore          5
		pointBuffer[0] = (float)(bubbleentry.getXIndex() - k) * f + (float)k;
	//  119  267:aload_0         
	//  120  268:getfield        #19  <Field float[] pointBuffer>
	//  121  271:iconst_0        
	//  122  272:aload           13
	//  123  274:invokevirtual   #177 <Method int BubbleEntry.getXIndex()>
	//  124  277:iload           8
	//  125  279:isub            
	//  126  280:i2f             
	//  127  281:fload_3         
	//  128  282:fmul            
	//  129  283:iload           8
	//  130  285:i2f             
	//  131  286:fadd            
	//  132  287:fastore         
		pointBuffer[1] = bubbleentry.getVal() * f1;
	//  133  288:aload_0         
	//  134  289:getfield        #19  <Field float[] pointBuffer>
	//  135  292:iconst_1        
	//  136  293:aload           13
	//  137  295:invokevirtual   #180 <Method float BubbleEntry.getVal()>
	//  138  298:fload           4
	//  139  300:fmul            
	//  140  301:fastore         
		transformer.pointValuesToPixel(pointBuffer);
	//  141  302:aload           14
	//  142  304:aload_0         
	//  143  305:getfield        #19  <Field float[] pointBuffer>
	//  144  308:invokevirtual   #153 <Method void Transformer.pointValuesToPixel(float[])>
		f2 = getShapeSize(bubbleentry.getSize(), ibubbledataset.getMaxSize(), f2) / 2.0F;
	//  145  311:aload_0         
	//  146  312:aload           13
	//  147  314:invokevirtual   #183 <Method float BubbleEntry.getSize()>
	//  148  317:aload           11
	//  149  319:invokeinterface #186 <Method float IBubbleDataSet.getMaxSize()>
	//  150  324:fload           5
	//  151  326:invokevirtual   #190 <Method float getShapeSize(float, float, float)>
	//  152  329:fconst_2        
	//  153  330:fdiv            
	//  154  331:fstore          5
		if(!mViewPortHandler.isInBoundsTop(pointBuffer[1] + f2) || !mViewPortHandler.isInBoundsBottom(pointBuffer[1] - f2) || !mViewPortHandler.isInBoundsLeft(pointBuffer[0] + f2)) goto _L3; else goto _L7
	//  155  333:aload_0         
	//  156  334:getfield        #160 <Field ViewPortHandler mViewPortHandler>
	//  157  337:aload_0         
	//  158  338:getfield        #19  <Field float[] pointBuffer>
	//  159  341:iconst_1        
	//  160  342:faload          
	//  161  343:fload           5
	//  162  345:fadd            
	//  163  346:invokevirtual   #194 <Method boolean ViewPortHandler.isInBoundsTop(float)>
	//  164  349:ifeq            78
	//  165  352:aload_0         
	//  166  353:getfield        #160 <Field ViewPortHandler mViewPortHandler>
	//  167  356:aload_0         
	//  168  357:getfield        #19  <Field float[] pointBuffer>
	//  169  360:iconst_1        
	//  170  361:faload          
	//  171  362:fload           5
	//  172  364:fsub            
	//  173  365:invokevirtual   #197 <Method boolean ViewPortHandler.isInBoundsBottom(float)>
	//  174  368:ifeq            78
	//  175  371:aload_0         
	//  176  372:getfield        #160 <Field ViewPortHandler mViewPortHandler>
	//  177  375:aload_0         
	//  178  376:getfield        #19  <Field float[] pointBuffer>
	//  179  379:iconst_0        
	//  180  380:faload          
	//  181  381:fload           5
	//  182  383:fadd            
	//  183  384:invokevirtual   #200 <Method boolean ViewPortHandler.isInBoundsLeft(float)>
	//  184  387:ifeq            78
_L7:
		if(mViewPortHandler.isInBoundsRight(pointBuffer[0] - f2))
			break MISSING_BLOCK_LABEL_410;
	//  185  390:aload_0         
	//  186  391:getfield        #160 <Field ViewPortHandler mViewPortHandler>
	//  187  394:aload_0         
	//  188  395:getfield        #19  <Field float[] pointBuffer>
	//  189  398:iconst_0        
	//  190  399:faload          
	//  191  400:fload           5
	//  192  402:fsub            
	//  193  403:invokevirtual   #203 <Method boolean ViewPortHandler.isInBoundsRight(float)>
	//  194  406:ifne            410
_L2:
		return;
	//  195  409:return          
		if(highlight.getXIndex() >= k && highlight.getXIndex() < i1)
	//* 196  410:aload           12
	//* 197  412:invokevirtual   #237 <Method int Highlight.getXIndex()>
	//* 198  415:iload           8
	//* 199  417:icmplt          78
	//* 200  420:aload           12
	//* 201  422:invokevirtual   #237 <Method int Highlight.getXIndex()>
	//* 202  425:iload           9
	//* 203  427:icmpge          78
		{
			int l = ibubbledataset.getColor(bubbleentry.getXIndex());
	//  204  430:aload           11
	//  205  432:aload           13
	//  206  434:invokevirtual   #177 <Method int BubbleEntry.getXIndex()>
	//  207  437:invokeinterface #207 <Method int IBubbleDataSet.getColor(int)>
	//  208  442:istore          8
			Color.RGBToHSV(Color.red(l), Color.green(l), Color.blue(l), _hsvBuffer);
	//  209  444:iload           8
	//  210  446:invokestatic    #242 <Method int Color.red(int)>
	//  211  449:iload           8
	//  212  451:invokestatic    #245 <Method int Color.green(int)>
	//  213  454:iload           8
	//  214  456:invokestatic    #248 <Method int Color.blue(int)>
	//  215  459:aload_0         
	//  216  460:getfield        #21  <Field float[] _hsvBuffer>
	//  217  463:invokestatic    #252 <Method void Color.RGBToHSV(int, int, int, float[])>
			float af[] = _hsvBuffer;
	//  218  466:aload_0         
	//  219  467:getfield        #21  <Field float[] _hsvBuffer>
	//  220  470:astore          12
			af[2] = af[2] * 0.5F;
	//  221  472:aload           12
	//  222  474:iconst_2        
	//  223  475:aload           12
	//  224  477:iconst_2        
	//  225  478:faload          
	//  226  479:ldc1            #253 <Float 0.5F>
	//  227  481:fmul            
	//  228  482:fastore         
			l = Color.HSVToColor(Color.alpha(l), _hsvBuffer);
	//  229  483:iload           8
	//  230  485:invokestatic    #256 <Method int Color.alpha(int)>
	//  231  488:aload_0         
	//  232  489:getfield        #21  <Field float[] _hsvBuffer>
	//  233  492:invokestatic    #260 <Method int Color.HSVToColor(int, float[])>
	//  234  495:istore          8
			mHighlightPaint.setColor(l);
	//  235  497:aload_0         
	//  236  498:getfield        #42  <Field Paint mHighlightPaint>
	//  237  501:iload           8
	//  238  503:invokevirtual   #211 <Method void Paint.setColor(int)>
			mHighlightPaint.setStrokeWidth(ibubbledataset.getHighlightCircleWidth());
	//  239  506:aload_0         
	//  240  507:getfield        #42  <Field Paint mHighlightPaint>
	//  241  510:aload           11
	//  242  512:invokeinterface #263 <Method float IBubbleDataSet.getHighlightCircleWidth()>
	//  243  517:invokevirtual   #56  <Method void Paint.setStrokeWidth(float)>
			canvas.drawCircle(pointBuffer[0], pointBuffer[1], f2, mHighlightPaint);
	//  244  520:aload_1         
	//  245  521:aload_0         
	//  246  522:getfield        #19  <Field float[] pointBuffer>
	//  247  525:iconst_0        
	//  248  526:faload          
	//  249  527:aload_0         
	//  250  528:getfield        #19  <Field float[] pointBuffer>
	//  251  531:iconst_1        
	//  252  532:faload          
	//  253  533:fload           5
	//  254  535:aload_0         
	//  255  536:getfield        #42  <Field Paint mHighlightPaint>
	//  256  539:invokevirtual   #217 <Method void Canvas.drawCircle(float, float, float, Paint)>
		}
		  goto _L3
	//* 257  542:goto            78
	}

	public void drawValues(Canvas canvas)
	{
		Object obj;
		obj = ((Object) (mChart.getBubbleData()));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field BubbleDataProvider mChart>
	//    2    4:invokeinterface #65  <Method BubbleData BubbleDataProvider.getBubbleData()>
	//    3    9:astore          10
		break MISSING_BLOCK_LABEL_11;
_L2:
		float f3;
		int i;
		IBubbleDataSet ibubbledataset;
		while(i >= ((List) (obj)).size()) 
		{
			do
	//*   4   11:aload           10
	//*   5   13:ifnonnull       17
				return;
	//    6   16:return          
			while(obj == null || ((BubbleData) (obj)).getYValCount() >= (int)Math.ceil((float)mChart.getMaxVisibleCount() * mViewPortHandler.getScaleX()));
	//    7   17:aload           10
	//    8   19:invokevirtual   #267 <Method int BubbleData.getYValCount()>
	//    9   22:aload_0         
	//   10   23:getfield        #23  <Field BubbleDataProvider mChart>
	//   11   26:invokeinterface #270 <Method int BubbleDataProvider.getMaxVisibleCount()>
	//   12   31:i2f             
	//   13   32:aload_0         
	//   14   33:getfield        #160 <Field ViewPortHandler mViewPortHandler>
	//   15   36:invokevirtual   #273 <Method float ViewPortHandler.getScaleX()>
	//   16   39:fmul            
	//   17   40:f2d             
	//   18   41:invokestatic    #277 <Method double Math.ceil(double)>
	//   19   44:d2i             
	//   20   45:icmpge          16
			obj = ((Object) (((BubbleData) (obj)).getDataSets()));
	//   21   48:aload           10
	//   22   50:invokevirtual   #71  <Method List BubbleData.getDataSets()>
	//   23   53:astore          10
			f3 = Utils.calcTextHeight(mValuePaint, "1");
	//   24   55:aload_0         
	//   25   56:getfield        #280 <Field Paint mValuePaint>
	//   26   59:ldc2            #282 <String "1">
	//   27   62:invokestatic    #286 <Method int Utils.calcTextHeight(Paint, String)>
	//   28   65:i2f             
	//   29   66:fstore          4
			i = 0;
	//   30   68:iconst_0        
	//   31   69:istore          6
		}
	//   32   71:iload           6
	//   33   73:aload           10
	//   34   75:invokeinterface #289 <Method int List.size()>
	//   35   80:icmpge          16
		ibubbledataset = (IBubbleDataSet)((List) (obj)).get(i);
	//   36   83:aload           10
	//   37   85:iload           6
	//   38   87:invokeinterface #293 <Method Object List.get(int)>
	//   39   92:checkcast       #89  <Class IBubbleDataSet>
	//   40   95:astore          11
		if(ibubbledataset.isDrawValuesEnabled() && ibubbledataset.getEntryCount() != 0)
			break; /* Loop/switch isn't completed */
	//   41   97:aload           11
	//   42   99:invokeinterface #296 <Method boolean IBubbleDataSet.isDrawValuesEnabled()>
	//   43  104:ifeq            117
	//   44  107:aload           11
	//   45  109:invokeinterface #96  <Method int IBubbleDataSet.getEntryCount()>
	//   46  114:ifne            126
_L4:
		i++;
	//   47  117:iload           6
	//   48  119:iconst_1        
	//   49  120:iadd            
	//   50  121:istore          6
		if(true) goto _L2; else goto _L1
	//   51  123:goto            71
_L1:
		float f;
		int j;
		int k;
		float af[];
		applyValueTextStyle(((com.github.mikephil.charting.interfaces.datasets.IDataSet) (ibubbledataset)));
	//   52  126:aload_0         
	//   53  127:aload           11
	//   54  129:invokevirtual   #300 <Method void applyValueTextStyle(com.github.mikephil.charting.interfaces.datasets.IDataSet)>
		f = mAnimator.getPhaseX();
	//   55  132:aload_0         
	//   56  133:getfield        #112 <Field ChartAnimator mAnimator>
	//   57  136:invokevirtual   #118 <Method float ChartAnimator.getPhaseX()>
	//   58  139:fstore_2        
		float f1 = mAnimator.getPhaseY();
	//   59  140:aload_0         
	//   60  141:getfield        #112 <Field ChartAnimator mAnimator>
	//   61  144:invokevirtual   #121 <Method float ChartAnimator.getPhaseY()>
	//   62  147:fstore_3        
		BubbleEntry bubbleentry = (BubbleEntry)ibubbledataset.getEntryForXIndex(mMinX);
	//   63  148:aload           11
	//   64  150:aload_0         
	//   65  151:getfield        #125 <Field int mMinX>
	//   66  154:invokeinterface #129 <Method com.github.mikephil.charting.data.Entry IBubbleDataSet.getEntryForXIndex(int)>
	//   67  159:checkcast       #131 <Class BubbleEntry>
	//   68  162:astore          12
		BubbleEntry bubbleentry1 = (BubbleEntry)ibubbledataset.getEntryForXIndex(mMaxX);
	//   69  164:aload           11
	//   70  166:aload_0         
	//   71  167:getfield        #134 <Field int mMaxX>
	//   72  170:invokeinterface #129 <Method com.github.mikephil.charting.data.Entry IBubbleDataSet.getEntryForXIndex(int)>
	//   73  175:checkcast       #131 <Class BubbleEntry>
	//   74  178:astore          13
		k = ibubbledataset.getEntryIndex(((com.github.mikephil.charting.data.Entry) (bubbleentry)));
	//   75  180:aload           11
	//   76  182:aload           12
	//   77  184:invokeinterface #138 <Method int IBubbleDataSet.getEntryIndex(com.github.mikephil.charting.data.Entry)>
	//   78  189:istore          8
		j = Math.min(ibubbledataset.getEntryIndex(((com.github.mikephil.charting.data.Entry) (bubbleentry1))) + 1, ibubbledataset.getEntryCount());
	//   79  191:aload           11
	//   80  193:aload           13
	//   81  195:invokeinterface #138 <Method int IBubbleDataSet.getEntryIndex(com.github.mikephil.charting.data.Entry)>
	//   82  200:iconst_1        
	//   83  201:iadd            
	//   84  202:aload           11
	//   85  204:invokeinterface #96  <Method int IBubbleDataSet.getEntryCount()>
	//   86  209:invokestatic    #147 <Method int Math.min(int, int)>
	//   87  212:istore          7
		af = mChart.getTransformer(ibubbledataset.getAxisDependency()).generateTransformedValuesBubble(ibubbledataset, f, f1, k, j);
	//   88  214:aload_0         
	//   89  215:getfield        #23  <Field BubbleDataProvider mChart>
	//   90  218:aload           11
	//   91  220:invokeinterface #104 <Method com.github.mikephil.charting.components.YAxis$AxisDependency IBubbleDataSet.getAxisDependency()>
	//   92  225:invokeinterface #108 <Method Transformer BubbleDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   93  230:aload           11
	//   94  232:fload_2         
	//   95  233:fload_3         
	//   96  234:iload           8
	//   97  236:iload           7
	//   98  238:invokevirtual   #304 <Method float[] Transformer.generateTransformedValuesBubble(IBubbleDataSet, float, float, int, int)>
	//   99  241:astore          12
		if(f == 1.0F)
	//* 100  243:fload_2         
	//* 101  244:fconst_1        
	//* 102  245:fcmpl           
	//* 103  246:ifne            364
			f = f1;
	//  104  249:fload_3         
	//  105  250:fstore_2        
		j = 0;
	//  106  251:iconst_0        
	//  107  252:istore          7
_L6:
		if(j >= af.length) goto _L4; else goto _L3
	//  108  254:iload           7
	//  109  256:aload           12
	//  110  258:arraylength     
	//  111  259:icmpge          117
_L3:
		float f2;
		float f4;
		int l;
		l = ibubbledataset.getValueTextColor(j / 2 + k);
	//  112  262:aload           11
	//  113  264:iload           7
	//  114  266:iconst_2        
	//  115  267:idiv            
	//  116  268:iload           8
	//  117  270:iadd            
	//  118  271:invokeinterface #307 <Method int IBubbleDataSet.getValueTextColor(int)>
	//  119  276:istore          9
		l = Color.argb(Math.round(255F * f), Color.red(l), Color.green(l), Color.blue(l));
	//  120  278:ldc2            #308 <Float 255F>
	//  121  281:fload_2         
	//  122  282:fmul            
	//  123  283:invokestatic    #312 <Method int Math.round(float)>
	//  124  286:iload           9
	//  125  288:invokestatic    #242 <Method int Color.red(int)>
	//  126  291:iload           9
	//  127  293:invokestatic    #245 <Method int Color.green(int)>
	//  128  296:iload           9
	//  129  298:invokestatic    #248 <Method int Color.blue(int)>
	//  130  301:invokestatic    #316 <Method int Color.argb(int, int, int, int)>
	//  131  304:istore          9
		f2 = af[j];
	//  132  306:aload           12
	//  133  308:iload           7
	//  134  310:faload          
	//  135  311:fstore_3        
		f4 = af[j + 1];
	//  136  312:aload           12
	//  137  314:iload           7
	//  138  316:iconst_1        
	//  139  317:iadd            
	//  140  318:faload          
	//  141  319:fstore          5
		if(!mViewPortHandler.isInBoundsRight(f2)) goto _L4; else goto _L5
	//  142  321:aload_0         
	//  143  322:getfield        #160 <Field ViewPortHandler mViewPortHandler>
	//  144  325:fload_3         
	//  145  326:invokevirtual   #203 <Method boolean ViewPortHandler.isInBoundsRight(float)>
	//  146  329:ifeq            117
_L5:
		if(mViewPortHandler.isInBoundsLeft(f2) && mViewPortHandler.isInBoundsY(f4))
	//* 147  332:aload_0         
	//* 148  333:getfield        #160 <Field ViewPortHandler mViewPortHandler>
	//* 149  336:fload_3         
	//* 150  337:invokevirtual   #200 <Method boolean ViewPortHandler.isInBoundsLeft(float)>
	//* 151  340:ifeq            355
	//* 152  343:aload_0         
	//* 153  344:getfield        #160 <Field ViewPortHandler mViewPortHandler>
	//* 154  347:fload           5
	//* 155  349:invokevirtual   #319 <Method boolean ViewPortHandler.isInBoundsY(float)>
	//* 156  352:ifne            367
	//* 157  355:iload           7
	//* 158  357:iconst_2        
	//* 159  358:iadd            
	//* 160  359:istore          7
	//* 161  361:goto            254
	//* 162  364:goto            251
		{
			BubbleEntry bubbleentry2 = (BubbleEntry)ibubbledataset.getEntryForIndex(j / 2 + k);
	//  163  367:aload           11
	//  164  369:iload           7
	//  165  371:iconst_2        
	//  166  372:idiv            
	//  167  373:iload           8
	//  168  375:iadd            
	//  169  376:invokeinterface #174 <Method com.github.mikephil.charting.data.Entry IBubbleDataSet.getEntryForIndex(int)>
	//  170  381:checkcast       #131 <Class BubbleEntry>
	//  171  384:astore          13
			drawValue(canvas, ibubbledataset.getValueFormatter(), bubbleentry2.getSize(), ((com.github.mikephil.charting.data.Entry) (bubbleentry2)), i, f2, f4 + 0.5F * f3, l);
	//  172  386:aload_0         
	//  173  387:aload_1         
	//  174  388:aload           11
	//  175  390:invokeinterface #323 <Method com.github.mikephil.charting.formatter.ValueFormatter IBubbleDataSet.getValueFormatter()>
	//  176  395:aload           13
	//  177  397:invokevirtual   #183 <Method float BubbleEntry.getSize()>
	//  178  400:aload           13
	//  179  402:iload           6
	//  180  404:fload_3         
	//  181  405:fload           5
	//  182  407:ldc1            #253 <Float 0.5F>
	//  183  409:fload           4
	//  184  411:fmul            
	//  185  412:fadd            
	//  186  413:iload           9
	//  187  415:invokevirtual   #327 <Method void drawValue(Canvas, com.github.mikephil.charting.formatter.ValueFormatter, float, com.github.mikephil.charting.data.Entry, int, float, float, int)>
		}
		j += 2;
		  goto _L6
	//* 188  418:goto            355
	}

	protected float getShapeSize(float f, float f1, float f2)
	{
		if(f1 == 0.0F)
	//*   0    0:fload_2         
	//*   1    1:fconst_0        
	//*   2    2:fcmpl           
	//*   3    3:ifne            12
			f = 1.0F;
	//    4    6:fconst_1        
	//    5    7:fstore_1        
		else
	//*   6    8:fload_3         
	//*   7    9:fload_1         
	//*   8   10:fmul            
	//*   9   11:freturn         
			f = (float)Math.sqrt(f / f1);
	//   10   12:fload_1         
	//   11   13:fload_2         
	//   12   14:fdiv            
	//   13   15:f2d             
	//   14   16:invokestatic    #330 <Method double Math.sqrt(double)>
	//   15   19:d2f             
	//   16   20:fstore_1        
		return f2 * f;
	//*  17   21:goto            8
	}

	public void initBuffers()
	{
	//    0    0:return          
	}

	private float _hsvBuffer[];
	protected BubbleDataProvider mChart;
	private float pointBuffer[];
	private float sizeBuffer[];
}
