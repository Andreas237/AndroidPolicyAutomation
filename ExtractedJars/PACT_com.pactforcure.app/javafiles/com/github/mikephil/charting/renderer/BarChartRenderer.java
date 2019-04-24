// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.renderer;

import android.graphics.*;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.highlight.Range;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.*;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.renderer:
//			DataRenderer

public class BarChartRenderer extends DataRenderer
{

	public BarChartRenderer(BarDataProvider bardataprovider, ChartAnimator chartanimator, ViewPortHandler viewporthandler)
	{
		super(chartanimator, viewporthandler);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #17  <Method void DataRenderer(ChartAnimator, ViewPortHandler)>
		mBarRect = new RectF();
	//    4    6:aload_0         
	//    5    7:new             #19  <Class RectF>
	//    6   10:dup             
	//    7   11:invokespecial   #22  <Method void RectF()>
	//    8   14:putfield        #24  <Field RectF mBarRect>
		mChart = bardataprovider;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #26  <Field BarDataProvider mChart>
		mHighlightPaint = new Paint(1);
	//   12   22:aload_0         
	//   13   23:new             #28  <Class Paint>
	//   14   26:dup             
	//   15   27:iconst_1        
	//   16   28:invokespecial   #31  <Method void Paint(int)>
	//   17   31:putfield        #34  <Field Paint mHighlightPaint>
		mHighlightPaint.setStyle(android.graphics.Paint.Style.FILL);
	//   18   34:aload_0         
	//   19   35:getfield        #34  <Field Paint mHighlightPaint>
	//   20   38:getstatic       #40  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   21   41:invokevirtual   #44  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		mHighlightPaint.setColor(Color.rgb(0, 0, 0));
	//   22   44:aload_0         
	//   23   45:getfield        #34  <Field Paint mHighlightPaint>
	//   24   48:iconst_0        
	//   25   49:iconst_0        
	//   26   50:iconst_0        
	//   27   51:invokestatic    #50  <Method int Color.rgb(int, int, int)>
	//   28   54:invokevirtual   #53  <Method void Paint.setColor(int)>
		mHighlightPaint.setAlpha(120);
	//   29   57:aload_0         
	//   30   58:getfield        #34  <Field Paint mHighlightPaint>
	//   31   61:bipush          120
	//   32   63:invokevirtual   #56  <Method void Paint.setAlpha(int)>
		mShadowPaint = new Paint(1);
	//   33   66:aload_0         
	//   34   67:new             #28  <Class Paint>
	//   35   70:dup             
	//   36   71:iconst_1        
	//   37   72:invokespecial   #31  <Method void Paint(int)>
	//   38   75:putfield        #58  <Field Paint mShadowPaint>
		mShadowPaint.setStyle(android.graphics.Paint.Style.FILL);
	//   39   78:aload_0         
	//   40   79:getfield        #58  <Field Paint mShadowPaint>
	//   41   82:getstatic       #40  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   42   85:invokevirtual   #44  <Method void Paint.setStyle(android.graphics.Paint$Style)>
	//   43   88:return          
	}

	public void drawData(Canvas canvas)
	{
		BarData bardata = mChart.getBarData();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field BarDataProvider mChart>
	//    2    4:invokeinterface #67  <Method BarData BarDataProvider.getBarData()>
	//    3    9:astore_3        
		for(int i = 0; i < bardata.getDataSetCount(); i++)
	//*   4   10:iconst_0        
	//*   5   11:istore_2        
	//*   6   12:iload_2         
	//*   7   13:aload_3         
	//*   8   14:invokevirtual   #73  <Method int BarData.getDataSetCount()>
	//*   9   17:icmpge          65
		{
			IBarDataSet ibardataset = (IBarDataSet)bardata.getDataSetByIndex(i);
	//   10   20:aload_3         
	//   11   21:iload_2         
	//   12   22:invokevirtual   #77  <Method com.github.mikephil.charting.interfaces.datasets.IDataSet BarData.getDataSetByIndex(int)>
	//   13   25:checkcast       #79  <Class IBarDataSet>
	//   14   28:astore          4
			if(ibardataset.isVisible() && ibardataset.getEntryCount() > 0)
	//*  15   30:aload           4
	//*  16   32:invokeinterface #83  <Method boolean IBarDataSet.isVisible()>
	//*  17   37:ifeq            58
	//*  18   40:aload           4
	//*  19   42:invokeinterface #86  <Method int IBarDataSet.getEntryCount()>
	//*  20   47:ifle            58
				drawDataSet(canvas, ibardataset, i);
	//   21   50:aload_0         
	//   22   51:aload_1         
	//   23   52:aload           4
	//   24   54:iload_2         
	//   25   55:invokevirtual   #90  <Method void drawDataSet(Canvas, IBarDataSet, int)>
		}

	//   26   58:iload_2         
	//   27   59:iconst_1        
	//   28   60:iadd            
	//   29   61:istore_2        
	//*  30   62:goto            12
	//   31   65:return          
	}

	protected void drawDataSet(Canvas canvas, IBarDataSet ibardataset, int i)
	{
		BarBuffer barbuffer;
		Transformer transformer = mChart.getTransformer(ibardataset.getAxisDependency());
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field BarDataProvider mChart>
	//    2    4:aload_2         
	//    3    5:invokeinterface #94  <Method com.github.mikephil.charting.components.YAxis$AxisDependency IBarDataSet.getAxisDependency()>
	//    4   10:invokeinterface #98  <Method Transformer BarDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//    5   15:astore          6
		mShadowPaint.setColor(ibardataset.getBarShadowColor());
	//    6   17:aload_0         
	//    7   18:getfield        #58  <Field Paint mShadowPaint>
	//    8   21:aload_2         
	//    9   22:invokeinterface #101 <Method int IBarDataSet.getBarShadowColor()>
	//   10   27:invokevirtual   #53  <Method void Paint.setColor(int)>
		float f = mAnimator.getPhaseX();
	//   11   30:aload_0         
	//   12   31:getfield        #105 <Field ChartAnimator mAnimator>
	//   13   34:invokevirtual   #111 <Method float ChartAnimator.getPhaseX()>
	//   14   37:fstore          4
		float f1 = mAnimator.getPhaseY();
	//   15   39:aload_0         
	//   16   40:getfield        #105 <Field ChartAnimator mAnimator>
	//   17   43:invokevirtual   #114 <Method float ChartAnimator.getPhaseY()>
	//   18   46:fstore          5
		barbuffer = mBarBuffers[i];
	//   19   48:aload_0         
	//   20   49:getfield        #116 <Field BarBuffer[] mBarBuffers>
	//   21   52:iload_3         
	//   22   53:aaload          
	//   23   54:astore          7
		barbuffer.setPhases(f, f1);
	//   24   56:aload           7
	//   25   58:fload           4
	//   26   60:fload           5
	//   27   62:invokevirtual   #122 <Method void BarBuffer.setPhases(float, float)>
		barbuffer.setBarSpace(ibardataset.getBarSpace());
	//   28   65:aload           7
	//   29   67:aload_2         
	//   30   68:invokeinterface #125 <Method float IBarDataSet.getBarSpace()>
	//   31   73:invokevirtual   #129 <Method void BarBuffer.setBarSpace(float)>
		barbuffer.setDataSet(i);
	//   32   76:aload           7
	//   33   78:iload_3         
	//   34   79:invokevirtual   #132 <Method void BarBuffer.setDataSet(int)>
		barbuffer.setInverted(mChart.isInverted(ibardataset.getAxisDependency()));
	//   35   82:aload           7
	//   36   84:aload_0         
	//   37   85:getfield        #26  <Field BarDataProvider mChart>
	//   38   88:aload_2         
	//   39   89:invokeinterface #94  <Method com.github.mikephil.charting.components.YAxis$AxisDependency IBarDataSet.getAxisDependency()>
	//   40   94:invokeinterface #136 <Method boolean BarDataProvider.isInverted(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   41   99:invokevirtual   #140 <Method void BarBuffer.setInverted(boolean)>
		barbuffer.feed(ibardataset);
	//   42  102:aload           7
	//   43  104:aload_2         
	//   44  105:invokevirtual   #144 <Method void BarBuffer.feed(IBarDataSet)>
		transformer.pointValuesToPixel(barbuffer.buffer);
	//   45  108:aload           6
	//   46  110:aload           7
	//   47  112:getfield        #148 <Field float[] BarBuffer.buffer>
	//   48  115:invokevirtual   #154 <Method void Transformer.pointValuesToPixel(float[])>
		if(ibardataset.getColors().size() <= 1) goto _L2; else goto _L1
	//   49  118:aload_2         
	//   50  119:invokeinterface #158 <Method List IBarDataSet.getColors()>
	//   51  124:invokeinterface #163 <Method int List.size()>
	//   52  129:iconst_1        
	//   53  130:icmple          299
_L1:
		i = 0;
	//   54  133:iconst_0        
	//   55  134:istore_3        
_L7:
		if(i >= barbuffer.size()) goto _L4; else goto _L3
	//   56  135:iload_3         
	//   57  136:aload           7
	//   58  138:invokevirtual   #164 <Method int BarBuffer.size()>
	//   59  141:icmpge          187
_L3:
		if(mViewPortHandler.isInBoundsLeft(barbuffer.buffer[i + 2])) goto _L6; else goto _L5
	//   60  144:aload_0         
	//   61  145:getfield        #168 <Field ViewPortHandler mViewPortHandler>
	//   62  148:aload           7
	//   63  150:getfield        #148 <Field float[] BarBuffer.buffer>
	//   64  153:iload_3         
	//   65  154:iconst_2        
	//   66  155:iadd            
	//   67  156:faload          
	//   68  157:invokevirtual   #174 <Method boolean ViewPortHandler.isInBoundsLeft(float)>
	//   69  160:ifne            170
_L5:
		i += 4;
	//   70  163:iload_3         
	//   71  164:iconst_4        
	//   72  165:iadd            
	//   73  166:istore_3        
		  goto _L7
	//*  74  167:goto            135
_L6:
		if(mViewPortHandler.isInBoundsRight(barbuffer.buffer[i])) goto _L8; else goto _L4
	//   75  170:aload_0         
	//   76  171:getfield        #168 <Field ViewPortHandler mViewPortHandler>
	//   77  174:aload           7
	//   78  176:getfield        #148 <Field float[] BarBuffer.buffer>
	//   79  179:iload_3         
	//   80  180:faload          
	//   81  181:invokevirtual   #177 <Method boolean ViewPortHandler.isInBoundsRight(float)>
	//   82  184:ifne            188
_L4:
		return;
	//   83  187:return          
_L8:
		if(mChart.isDrawBarShadowEnabled())
	//*  84  188:aload_0         
	//*  85  189:getfield        #26  <Field BarDataProvider mChart>
	//*  86  192:invokeinterface #180 <Method boolean BarDataProvider.isDrawBarShadowEnabled()>
	//*  87  197:ifeq            238
			canvas.drawRect(barbuffer.buffer[i], mViewPortHandler.contentTop(), barbuffer.buffer[i + 2], mViewPortHandler.contentBottom(), mShadowPaint);
	//   88  200:aload_1         
	//   89  201:aload           7
	//   90  203:getfield        #148 <Field float[] BarBuffer.buffer>
	//   91  206:iload_3         
	//   92  207:faload          
	//   93  208:aload_0         
	//   94  209:getfield        #168 <Field ViewPortHandler mViewPortHandler>
	//   95  212:invokevirtual   #183 <Method float ViewPortHandler.contentTop()>
	//   96  215:aload           7
	//   97  217:getfield        #148 <Field float[] BarBuffer.buffer>
	//   98  220:iload_3         
	//   99  221:iconst_2        
	//  100  222:iadd            
	//  101  223:faload          
	//  102  224:aload_0         
	//  103  225:getfield        #168 <Field ViewPortHandler mViewPortHandler>
	//  104  228:invokevirtual   #186 <Method float ViewPortHandler.contentBottom()>
	//  105  231:aload_0         
	//  106  232:getfield        #58  <Field Paint mShadowPaint>
	//  107  235:invokevirtual   #192 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		mRenderPaint.setColor(ibardataset.getColor(i / 4));
	//  108  238:aload_0         
	//  109  239:getfield        #195 <Field Paint mRenderPaint>
	//  110  242:aload_2         
	//  111  243:iload_3         
	//  112  244:iconst_4        
	//  113  245:idiv            
	//  114  246:invokeinterface #199 <Method int IBarDataSet.getColor(int)>
	//  115  251:invokevirtual   #53  <Method void Paint.setColor(int)>
		canvas.drawRect(barbuffer.buffer[i], barbuffer.buffer[i + 1], barbuffer.buffer[i + 2], barbuffer.buffer[i + 3], mRenderPaint);
	//  116  254:aload_1         
	//  117  255:aload           7
	//  118  257:getfield        #148 <Field float[] BarBuffer.buffer>
	//  119  260:iload_3         
	//  120  261:faload          
	//  121  262:aload           7
	//  122  264:getfield        #148 <Field float[] BarBuffer.buffer>
	//  123  267:iload_3         
	//  124  268:iconst_1        
	//  125  269:iadd            
	//  126  270:faload          
	//  127  271:aload           7
	//  128  273:getfield        #148 <Field float[] BarBuffer.buffer>
	//  129  276:iload_3         
	//  130  277:iconst_2        
	//  131  278:iadd            
	//  132  279:faload          
	//  133  280:aload           7
	//  134  282:getfield        #148 <Field float[] BarBuffer.buffer>
	//  135  285:iload_3         
	//  136  286:iconst_3        
	//  137  287:iadd            
	//  138  288:faload          
	//  139  289:aload_0         
	//  140  290:getfield        #195 <Field Paint mRenderPaint>
	//  141  293:invokevirtual   #192 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		  goto _L5
	//* 142  296:goto            163
_L2:
		mRenderPaint.setColor(ibardataset.getColor());
	//  143  299:aload_0         
	//  144  300:getfield        #195 <Field Paint mRenderPaint>
	//  145  303:aload_2         
	//  146  304:invokeinterface #201 <Method int IBarDataSet.getColor()>
	//  147  309:invokevirtual   #53  <Method void Paint.setColor(int)>
		i = 0;
	//  148  312:iconst_0        
	//  149  313:istore_3        
_L10:
		if(i >= barbuffer.size()) goto _L4; else goto _L9
	//  150  314:iload_3         
	//  151  315:aload           7
	//  152  317:invokevirtual   #164 <Method int BarBuffer.size()>
	//  153  320:icmpge          187
_L9:
		if(mViewPortHandler.isInBoundsLeft(barbuffer.buffer[i + 2]))
			continue; /* Loop/switch isn't completed */
	//  154  323:aload_0         
	//  155  324:getfield        #168 <Field ViewPortHandler mViewPortHandler>
	//  156  327:aload           7
	//  157  329:getfield        #148 <Field float[] BarBuffer.buffer>
	//  158  332:iload_3         
	//  159  333:iconst_2        
	//  160  334:iadd            
	//  161  335:faload          
	//  162  336:invokevirtual   #174 <Method boolean ViewPortHandler.isInBoundsLeft(float)>
	//  163  339:ifne            349
_L12:
		i += 4;
	//  164  342:iload_3         
	//  165  343:iconst_4        
	//  166  344:iadd            
	//  167  345:istore_3        
		  goto _L10
	//* 168  346:goto            314
		if(!mViewPortHandler.isInBoundsRight(barbuffer.buffer[i])) goto _L4; else goto _L11
	//  169  349:aload_0         
	//  170  350:getfield        #168 <Field ViewPortHandler mViewPortHandler>
	//  171  353:aload           7
	//  172  355:getfield        #148 <Field float[] BarBuffer.buffer>
	//  173  358:iload_3         
	//  174  359:faload          
	//  175  360:invokevirtual   #177 <Method boolean ViewPortHandler.isInBoundsRight(float)>
	//  176  363:ifeq            187
_L11:
		if(mChart.isDrawBarShadowEnabled())
	//* 177  366:aload_0         
	//* 178  367:getfield        #26  <Field BarDataProvider mChart>
	//* 179  370:invokeinterface #180 <Method boolean BarDataProvider.isDrawBarShadowEnabled()>
	//* 180  375:ifeq            416
			canvas.drawRect(barbuffer.buffer[i], mViewPortHandler.contentTop(), barbuffer.buffer[i + 2], mViewPortHandler.contentBottom(), mShadowPaint);
	//  181  378:aload_1         
	//  182  379:aload           7
	//  183  381:getfield        #148 <Field float[] BarBuffer.buffer>
	//  184  384:iload_3         
	//  185  385:faload          
	//  186  386:aload_0         
	//  187  387:getfield        #168 <Field ViewPortHandler mViewPortHandler>
	//  188  390:invokevirtual   #183 <Method float ViewPortHandler.contentTop()>
	//  189  393:aload           7
	//  190  395:getfield        #148 <Field float[] BarBuffer.buffer>
	//  191  398:iload_3         
	//  192  399:iconst_2        
	//  193  400:iadd            
	//  194  401:faload          
	//  195  402:aload_0         
	//  196  403:getfield        #168 <Field ViewPortHandler mViewPortHandler>
	//  197  406:invokevirtual   #186 <Method float ViewPortHandler.contentBottom()>
	//  198  409:aload_0         
	//  199  410:getfield        #58  <Field Paint mShadowPaint>
	//  200  413:invokevirtual   #192 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		canvas.drawRect(barbuffer.buffer[i], barbuffer.buffer[i + 1], barbuffer.buffer[i + 2], barbuffer.buffer[i + 3], mRenderPaint);
	//  201  416:aload_1         
	//  202  417:aload           7
	//  203  419:getfield        #148 <Field float[] BarBuffer.buffer>
	//  204  422:iload_3         
	//  205  423:faload          
	//  206  424:aload           7
	//  207  426:getfield        #148 <Field float[] BarBuffer.buffer>
	//  208  429:iload_3         
	//  209  430:iconst_1        
	//  210  431:iadd            
	//  211  432:faload          
	//  212  433:aload           7
	//  213  435:getfield        #148 <Field float[] BarBuffer.buffer>
	//  214  438:iload_3         
	//  215  439:iconst_2        
	//  216  440:iadd            
	//  217  441:faload          
	//  218  442:aload           7
	//  219  444:getfield        #148 <Field float[] BarBuffer.buffer>
	//  220  447:iload_3         
	//  221  448:iconst_3        
	//  222  449:iadd            
	//  223  450:faload          
	//  224  451:aload_0         
	//  225  452:getfield        #195 <Field Paint mRenderPaint>
	//  226  455:invokevirtual   #192 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		  goto _L12
	//* 227  458:goto            342
	}

	public void drawExtras(Canvas canvas)
	{
	//    0    0:return          
	}

	public void drawHighlighted(Canvas canvas, Highlight ahighlight[])
	{
		int j = mChart.getBarData().getDataSetCount();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field BarDataProvider mChart>
	//    2    4:invokeinterface #67  <Method BarData BarDataProvider.getBarData()>
	//    3    9:invokevirtual   #73  <Method int BarData.getDataSetCount()>
	//    4   12:istore          11
		int i = 0;
	//    5   14:iconst_0        
	//    6   15:istore          9
		while(i < ahighlight.length) 
	//*   7   17:iload           9
	//*   8   19:aload_2         
	//*   9   20:arraylength     
	//*  10   21:icmpge          505
		{
			Highlight highlight = ahighlight[i];
	//   11   24:aload_2         
	//   12   25:iload           9
	//   13   27:aaload          
	//   14   28:astore          16
			int k = highlight.getXIndex();
	//   15   30:aload           16
	//   16   32:invokevirtual   #209 <Method int Highlight.getXIndex()>
	//   17   35:istore          12
			int l = highlight.getDataSetIndex();
	//   18   37:aload           16
	//   19   39:invokevirtual   #212 <Method int Highlight.getDataSetIndex()>
	//   20   42:istore          13
			Object obj = ((Object) ((IBarDataSet)mChart.getBarData().getDataSetByIndex(l)));
	//   21   44:aload_0         
	//   22   45:getfield        #26  <Field BarDataProvider mChart>
	//   23   48:invokeinterface #67  <Method BarData BarDataProvider.getBarData()>
	//   24   53:iload           13
	//   25   55:invokevirtual   #77  <Method com.github.mikephil.charting.interfaces.datasets.IDataSet BarData.getDataSetByIndex(int)>
	//   26   58:checkcast       #79  <Class IBarDataSet>
	//   27   61:astore          15
			if(obj != null && ((IBarDataSet) (obj)).isHighlightEnabled())
	//*  28   63:aload           15
	//*  29   65:ifnull          78
	//*  30   68:aload           15
	//*  31   70:invokeinterface #215 <Method boolean IBarDataSet.isHighlightEnabled()>
	//*  32   75:ifne            87
	//*  33   78:iload           9
	//*  34   80:iconst_1        
	//*  35   81:iadd            
	//*  36   82:istore          9
	//*  37   84:goto            17
			{
				float f3 = ((IBarDataSet) (obj)).getBarSpace() / 2.0F;
	//   38   87:aload           15
	//   39   89:invokeinterface #125 <Method float IBarDataSet.getBarSpace()>
	//   40   94:fconst_2        
	//   41   95:fdiv            
	//   42   96:fstore          6
				Transformer transformer = mChart.getTransformer(((IBarDataSet) (obj)).getAxisDependency());
	//   43   98:aload_0         
	//   44   99:getfield        #26  <Field BarDataProvider mChart>
	//   45  102:aload           15
	//   46  104:invokeinterface #94  <Method com.github.mikephil.charting.components.YAxis$AxisDependency IBarDataSet.getAxisDependency()>
	//   47  109:invokeinterface #98  <Method Transformer BarDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   48  114:astore          14
				mHighlightPaint.setColor(((IBarDataSet) (obj)).getHighLightColor());
	//   49  116:aload_0         
	//   50  117:getfield        #34  <Field Paint mHighlightPaint>
	//   51  120:aload           15
	//   52  122:invokeinterface #218 <Method int IBarDataSet.getHighLightColor()>
	//   53  127:invokevirtual   #53  <Method void Paint.setColor(int)>
				mHighlightPaint.setAlpha(((IBarDataSet) (obj)).getHighLightAlpha());
	//   54  130:aload_0         
	//   55  131:getfield        #34  <Field Paint mHighlightPaint>
	//   56  134:aload           15
	//   57  136:invokeinterface #221 <Method int IBarDataSet.getHighLightAlpha()>
	//   58  141:invokevirtual   #56  <Method void Paint.setAlpha(int)>
				if(k >= 0 && (float)k < (mChart.getXChartMax() * mAnimator.getPhaseX()) / (float)j)
	//*  59  144:iload           12
	//*  60  146:iflt            78
	//*  61  149:iload           12
	//*  62  151:i2f             
	//*  63  152:aload_0         
	//*  64  153:getfield        #26  <Field BarDataProvider mChart>
	//*  65  156:invokeinterface #224 <Method float BarDataProvider.getXChartMax()>
	//*  66  161:aload_0         
	//*  67  162:getfield        #105 <Field ChartAnimator mAnimator>
	//*  68  165:invokevirtual   #111 <Method float ChartAnimator.getPhaseX()>
	//*  69  168:fmul            
	//*  70  169:iload           11
	//*  71  171:i2f             
	//*  72  172:fdiv            
	//*  73  173:fcmpg           
	//*  74  174:ifge            78
				{
					BarEntry barentry = (BarEntry)((IBarDataSet) (obj)).getEntryForXIndex(k);
	//   75  177:aload           15
	//   76  179:iload           12
	//   77  181:invokeinterface #228 <Method com.github.mikephil.charting.data.Entry IBarDataSet.getEntryForXIndex(int)>
	//   78  186:checkcast       #230 <Class BarEntry>
	//   79  189:astore          17
					if(barentry != null && barentry.getXIndex() == k)
	//*  80  191:aload           17
	//*  81  193:ifnull          78
	//*  82  196:aload           17
	//*  83  198:invokevirtual   #231 <Method int BarEntry.getXIndex()>
	//*  84  201:iload           12
	//*  85  203:icmpne          78
					{
						float f = mChart.getBarData().getGroupSpace();
	//   86  206:aload_0         
	//   87  207:getfield        #26  <Field BarDataProvider mChart>
	//   88  210:invokeinterface #67  <Method BarData BarDataProvider.getBarData()>
	//   89  215:invokevirtual   #234 <Method float BarData.getGroupSpace()>
	//   90  218:fstore_3        
						float f1;
						float f2;
						boolean flag;
						if(highlight.getStackIndex() < 0)
	//*  91  219:aload           16
	//*  92  221:invokevirtual   #237 <Method int Highlight.getStackIndex()>
	//*  93  224:ifge            487
							flag = false;
	//   94  227:iconst_0        
	//   95  228:istore          10
						else
	//*  96  230:iload           12
	//*  97  232:iload           11
	//*  98  234:imul            
	//*  99  235:iload           13
	//* 100  237:iadd            
	//* 101  238:i2f             
	//* 102  239:fload_3         
	//* 103  240:fconst_2        
	//* 104  241:fdiv            
	//* 105  242:fadd            
	//* 106  243:iload           12
	//* 107  245:i2f             
	//* 108  246:fload_3         
	//* 109  247:fmul            
	//* 110  248:fadd            
	//* 111  249:fstore          5
	//* 112  251:iload           10
	//* 113  253:ifeq            493
	//* 114  256:aload           16
	//* 115  258:invokevirtual   #241 <Method Range Highlight.getRange()>
	//* 116  261:getfield        #247 <Field float Range.from>
	//* 117  264:fstore_3        
	//* 118  265:aload           16
	//* 119  267:invokevirtual   #241 <Method Range Highlight.getRange()>
	//* 120  270:getfield        #250 <Field float Range.to>
	//* 121  273:fstore          4
	//* 122  275:aload_0         
	//* 123  276:fload           5
	//* 124  278:fload_3         
	//* 125  279:fload           4
	//* 126  281:fload           6
	//* 127  283:aload           14
	//* 128  285:invokevirtual   #254 <Method void prepareBarHighlight(float, float, float, float, Transformer)>
	//* 129  288:aload_1         
	//* 130  289:aload_0         
	//* 131  290:getfield        #24  <Field RectF mBarRect>
	//* 132  293:aload_0         
	//* 133  294:getfield        #34  <Field Paint mHighlightPaint>
	//* 134  297:invokevirtual   #257 <Method void Canvas.drawRect(RectF, Paint)>
	//* 135  300:aload_0         
	//* 136  301:getfield        #26  <Field BarDataProvider mChart>
	//* 137  304:invokeinterface #260 <Method boolean BarDataProvider.isDrawHighlightArrowEnabled()>
	//* 138  309:ifeq            78
	//* 139  312:aload_0         
	//* 140  313:getfield        #34  <Field Paint mHighlightPaint>
	//* 141  316:sipush          255
	//* 142  319:invokevirtual   #56  <Method void Paint.setAlpha(int)>
	//* 143  322:aload_0         
	//* 144  323:getfield        #105 <Field ChartAnimator mAnimator>
	//* 145  326:invokevirtual   #114 <Method float ChartAnimator.getPhaseY()>
	//* 146  329:ldc2            #261 <Float 0.07F>
	//* 147  332:fmul            
	//* 148  333:fstore          6
	//* 149  335:bipush          9
	//* 150  337:newarray        float[]
	//* 151  339:astore          16
	//* 152  341:aload           14
	//* 153  343:invokevirtual   #265 <Method Matrix Transformer.getPixelToValueMatrix()>
	//* 154  346:aload           16
	//* 155  348:invokevirtual   #270 <Method void Matrix.getValues(float[])>
	//* 156  351:aload           16
	//* 157  353:iconst_4        
	//* 158  354:faload          
	//* 159  355:aload           16
	//* 160  357:iconst_0        
	//* 161  358:faload          
	//* 162  359:fdiv            
	//* 163  360:invokestatic    #276 <Method float Math.abs(float)>
	//* 164  363:fstore          8
	//* 165  365:aload           15
	//* 166  367:invokeinterface #125 <Method float IBarDataSet.getBarSpace()>
	//* 167  372:fconst_2        
	//* 168  373:fdiv            
	//* 169  374:fstore          7
	//* 170  376:fload           7
	//* 171  378:fload           8
	//* 172  380:fmul            
	//* 173  381:fstore          8
	//* 174  383:fload_3         
	//* 175  384:fload           4
	//* 176  386:fneg            
	//* 177  387:fcmpl           
	//* 178  388:ifle            391
	//* 179  391:fload_3         
	//* 180  392:aload_0         
	//* 181  393:getfield        #105 <Field ChartAnimator mAnimator>
	//* 182  396:invokevirtual   #114 <Method float ChartAnimator.getPhaseY()>
	//* 183  399:fmul            
	//* 184  400:fstore_3        
	//* 185  401:new             #278 <Class Path>
	//* 186  404:dup             
	//* 187  405:invokespecial   #279 <Method void Path()>
	//* 188  408:astore          15
	//* 189  410:aload           15
	//* 190  412:ldc2            #280 <Float 0.4F>
	//* 191  415:fload           5
	//* 192  417:fadd            
	//* 193  418:fload_3         
	//* 194  419:fload           6
	//* 195  421:fadd            
	//* 196  422:invokevirtual   #283 <Method void Path.moveTo(float, float)>
	//* 197  425:aload           15
	//* 198  427:ldc2            #280 <Float 0.4F>
	//* 199  430:fload           5
	//* 200  432:fadd            
	//* 201  433:fload           7
	//* 202  435:fadd            
	//* 203  436:fload_3         
	//* 204  437:fload           6
	//* 205  439:fadd            
	//* 206  440:fload           8
	//* 207  442:fsub            
	//* 208  443:invokevirtual   #286 <Method void Path.lineTo(float, float)>
	//* 209  446:aload           15
	//* 210  448:ldc2            #280 <Float 0.4F>
	//* 211  451:fload           5
	//* 212  453:fadd            
	//* 213  454:fload           7
	//* 214  456:fadd            
	//* 215  457:fload_3         
	//* 216  458:fload           6
	//* 217  460:fadd            
	//* 218  461:fload           8
	//* 219  463:fadd            
	//* 220  464:invokevirtual   #286 <Method void Path.lineTo(float, float)>
	//* 221  467:aload           14
	//* 222  469:aload           15
	//* 223  471:invokevirtual   #290 <Method void Transformer.pathValueToPixel(Path)>
	//* 224  474:aload_1         
	//* 225  475:aload           15
	//* 226  477:aload_0         
	//* 227  478:getfield        #34  <Field Paint mHighlightPaint>
	//* 228  481:invokevirtual   #294 <Method void Canvas.drawPath(Path, Paint)>
	//* 229  484:goto            78
							flag = true;
	//  230  487:iconst_1        
	//  231  488:istore          10
						f2 = (float)(k * j + l) + f / 2.0F + (float)k * f;
						if(flag)
						{
							f = highlight.getRange().from;
							f1 = highlight.getRange().to;
						} else
	//* 232  490:goto            230
						{
							f = barentry.getVal();
	//  233  493:aload           17
	//  234  495:invokevirtual   #297 <Method float BarEntry.getVal()>
	//  235  498:fstore_3        
							f1 = 0.0F;
	//  236  499:fconst_0        
	//  237  500:fstore          4
						}
						prepareBarHighlight(f2, f, f1, f3, transformer);
						canvas.drawRect(mBarRect, mHighlightPaint);
						if(mChart.isDrawHighlightArrowEnabled())
						{
							mHighlightPaint.setAlpha(255);
							float f4 = mAnimator.getPhaseY() * 0.07F;
							float af[] = new float[9];
							transformer.getPixelToValueMatrix().getValues(af);
							float f6 = Math.abs(af[4] / af[0]);
							float f5 = ((IBarDataSet) (obj)).getBarSpace() / 2.0F;
							f6 = f5 * f6;
							if(f <= -f1);
							f *= mAnimator.getPhaseY();
							obj = ((Object) (new Path()));
							((Path) (obj)).moveTo(0.4F + f2, f + f4);
							((Path) (obj)).lineTo(0.4F + f2 + f5, (f + f4) - f6);
							((Path) (obj)).lineTo(0.4F + f2 + f5, f + f4 + f6);
							transformer.pathValueToPixel(((Path) (obj)));
							canvas.drawPath(((Path) (obj)), mHighlightPaint);
						}
					}
				}
			}
			i++;
		}
	//* 238  502:goto            275
	//  239  505:return          
	}

	public void drawValues(Canvas canvas)
	{
		float f20;
		int i;
		boolean flag;
		List list;
		if(!passesCheck())
			break MISSING_BLOCK_LABEL_899;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #301 <Method boolean passesCheck()>
	//    2    4:ifeq            899
		list = mChart.getBarData().getDataSets();
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field BarDataProvider mChart>
	//    5   11:invokeinterface #67  <Method BarData BarDataProvider.getBarData()>
	//    6   16:invokevirtual   #304 <Method List BarData.getDataSets()>
	//    7   19:astore          16
		f20 = Utils.convertDpToPixel(4.5F);
	//    8   21:ldc2            #305 <Float 4.5F>
	//    9   24:invokestatic    #310 <Method float Utils.convertDpToPixel(float)>
	//   10   27:fstore          8
		flag = mChart.isDrawValueAboveBarEnabled();
	//   11   29:aload_0         
	//   12   30:getfield        #26  <Field BarDataProvider mChart>
	//   13   33:invokeinterface #313 <Method boolean BarDataProvider.isDrawValueAboveBarEnabled()>
	//   14   38:istore          14
		i = 0;
	//   15   40:iconst_0        
	//   16   41:istore          9
_L2:
		IBarDataSet ibardataset;
		if(i >= mChart.getBarData().getDataSetCount())
			break MISSING_BLOCK_LABEL_899;
	//   17   43:iload           9
	//   18   45:aload_0         
	//   19   46:getfield        #26  <Field BarDataProvider mChart>
	//   20   49:invokeinterface #67  <Method BarData BarDataProvider.getBarData()>
	//   21   54:invokevirtual   #73  <Method int BarData.getDataSetCount()>
	//   22   57:icmpge          899
		ibardataset = (IBarDataSet)list.get(i);
	//   23   60:aload           16
	//   24   62:iload           9
	//   25   64:invokeinterface #317 <Method Object List.get(int)>
	//   26   69:checkcast       #79  <Class IBarDataSet>
	//   27   72:astore          17
		if(ibardataset.isDrawValuesEnabled() && ibardataset.getEntryCount() != 0)
			break; /* Loop/switch isn't completed */
	//   28   74:aload           17
	//   29   76:invokeinterface #320 <Method boolean IBarDataSet.isDrawValuesEnabled()>
	//   30   81:ifeq            94
	//   31   84:aload           17
	//   32   86:invokeinterface #86  <Method int IBarDataSet.getEntryCount()>
	//   33   91:ifne            103
_L3:
		i++;
	//   34   94:iload           9
	//   35   96:iconst_1        
	//   36   97:iadd            
	//   37   98:istore          9
		if(true) goto _L2; else goto _L1
	//   38  100:goto            43
_L1:
		float f;
		float f1;
		float af[];
		Object obj;
label0:
		{
			applyValueTextStyle(((com.github.mikephil.charting.interfaces.datasets.IDataSet) (ibardataset)));
	//   39  103:aload_0         
	//   40  104:aload           17
	//   41  106:invokevirtual   #324 <Method void applyValueTextStyle(com.github.mikephil.charting.interfaces.datasets.IDataSet)>
			boolean flag1 = mChart.isInverted(ibardataset.getAxisDependency());
	//   42  109:aload_0         
	//   43  110:getfield        #26  <Field BarDataProvider mChart>
	//   44  113:aload           17
	//   45  115:invokeinterface #94  <Method com.github.mikephil.charting.components.YAxis$AxisDependency IBarDataSet.getAxisDependency()>
	//   46  120:invokeinterface #136 <Method boolean BarDataProvider.isInverted(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   47  125:istore          15
			float f12 = Utils.calcTextHeight(mValuePaint, "8");
	//   48  127:aload_0         
	//   49  128:getfield        #327 <Field Paint mValuePaint>
	//   50  131:ldc2            #329 <String "8">
	//   51  134:invokestatic    #333 <Method int Utils.calcTextHeight(Paint, String)>
	//   52  137:i2f             
	//   53  138:fstore          6
			float f2;
			float f7;
			int j;
			if(flag)
	//*  54  140:iload           14
	//*  55  142:ifeq            305
				f2 = -f20;
	//   56  145:fload           8
	//   57  147:fneg            
	//   58  148:fstore          4
			else
	//*  59  150:iload           14
	//*  60  152:ifeq            315
	//*  61  155:fload           6
	//*  62  157:fload           8
	//*  63  159:fadd            
	//*  64  160:fstore          5
	//*  65  162:fload           5
	//*  66  164:fstore_3        
	//*  67  165:fload           4
	//*  68  167:fstore_2        
	//*  69  168:iload           15
	//*  70  170:ifeq            187
	//*  71  173:fload           4
	//*  72  175:fneg            
	//*  73  176:fload           6
	//*  74  178:fsub            
	//*  75  179:fstore_2        
	//*  76  180:fload           5
	//*  77  182:fneg            
	//*  78  183:fload           6
	//*  79  185:fsub            
	//*  80  186:fstore_3        
	//*  81  187:aload_0         
	//*  82  188:getfield        #26  <Field BarDataProvider mChart>
	//*  83  191:aload           17
	//*  84  193:invokeinterface #94  <Method com.github.mikephil.charting.components.YAxis$AxisDependency IBarDataSet.getAxisDependency()>
	//*  85  198:invokeinterface #98  <Method Transformer BarDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//*  86  203:astore          19
	//*  87  205:aload_0         
	//*  88  206:aload           19
	//*  89  208:aload           17
	//*  90  210:iload           9
	//*  91  212:invokevirtual   #337 <Method float[] getTransformedValues(Transformer, IBarDataSet, int)>
	//*  92  215:astore          18
	//*  93  217:aload           17
	//*  94  219:invokeinterface #340 <Method boolean IBarDataSet.isStacked()>
	//*  95  224:ifne            421
	//*  96  227:iconst_0        
	//*  97  228:istore          10
	//*  98  230:iload           10
	//*  99  232:i2f             
	//* 100  233:aload           18
	//* 101  235:arraylength     
	//* 102  236:i2f             
	//* 103  237:aload_0         
	//* 104  238:getfield        #105 <Field ChartAnimator mAnimator>
	//* 105  241:invokevirtual   #111 <Method float ChartAnimator.getPhaseX()>
	//* 106  244:fmul            
	//* 107  245:fcmpg           
	//* 108  246:ifge            94
	//* 109  249:aload_0         
	//* 110  250:getfield        #168 <Field ViewPortHandler mViewPortHandler>
	//* 111  253:aload           18
	//* 112  255:iload           10
	//* 113  257:faload          
	//* 114  258:invokevirtual   #177 <Method boolean ViewPortHandler.isInBoundsRight(float)>
	//* 115  261:ifeq            94
	//* 116  264:aload_0         
	//* 117  265:getfield        #168 <Field ViewPortHandler mViewPortHandler>
	//* 118  268:aload           18
	//* 119  270:iload           10
	//* 120  272:iconst_1        
	//* 121  273:iadd            
	//* 122  274:faload          
	//* 123  275:invokevirtual   #343 <Method boolean ViewPortHandler.isInBoundsY(float)>
	//* 124  278:ifeq            296
	//* 125  281:aload_0         
	//* 126  282:getfield        #168 <Field ViewPortHandler mViewPortHandler>
	//* 127  285:aload           18
	//* 128  287:iload           10
	//* 129  289:faload          
	//* 130  290:invokevirtual   #174 <Method boolean ViewPortHandler.isInBoundsLeft(float)>
	//* 131  293:ifne            323
	//* 132  296:iload           10
	//* 133  298:iconst_2        
	//* 134  299:iadd            
	//* 135  300:istore          10
	//* 136  302:goto            230
				f2 = f12 + f20;
	//  137  305:fload           6
	//  138  307:fload           8
	//  139  309:fadd            
	//  140  310:fstore          4
			if(flag)
				f7 = f12 + f20;
			else
	//* 141  312:goto            150
				f7 = -f20;
	//  142  315:fload           8
	//  143  317:fneg            
	//  144  318:fstore          5
			f1 = f7;
			f = f2;
			if(flag1)
			{
				f = -f2 - f12;
				f1 = -f7 - f12;
			}
			obj = ((Object) (mChart.getTransformer(ibardataset.getAxisDependency())));
			af = getTransformedValues(((Transformer) (obj)), ibardataset, i);
			if(ibardataset.isStacked())
				break label0;
			j = 0;
			while((float)j < (float)af.length * mAnimator.getPhaseX() && mViewPortHandler.isInBoundsRight(af[j])) 
			{
				if(mViewPortHandler.isInBoundsY(af[j + 1]) && mViewPortHandler.isInBoundsLeft(af[j]))
	//* 145  320:goto            162
				{
					obj = ((Object) ((BarEntry)ibardataset.getEntryForIndex(j / 2)));
	//  146  323:aload           17
	//  147  325:iload           10
	//  148  327:iconst_2        
	//  149  328:idiv            
	//  150  329:invokeinterface #346 <Method com.github.mikephil.charting.data.Entry IBarDataSet.getEntryForIndex(int)>
	//  151  334:checkcast       #230 <Class BarEntry>
	//  152  337:astore          19
					float f8 = ((BarEntry) (obj)).getVal();
	//  153  339:aload           19
	//  154  341:invokevirtual   #297 <Method float BarEntry.getVal()>
	//  155  344:fstore          5
					com.github.mikephil.charting.formatter.ValueFormatter valueformatter = ibardataset.getValueFormatter();
	//  156  346:aload           17
	//  157  348:invokeinterface #350 <Method com.github.mikephil.charting.formatter.ValueFormatter IBarDataSet.getValueFormatter()>
	//  158  353:astore          20
					float f13 = af[j];
	//  159  355:aload           18
	//  160  357:iload           10
	//  161  359:faload          
	//  162  360:fstore          6
					float f17 = af[j + 1];
	//  163  362:aload           18
	//  164  364:iload           10
	//  165  366:iconst_1        
	//  166  367:iadd            
	//  167  368:faload          
	//  168  369:fstore          7
					float f3;
					if(f8 >= 0.0F)
	//* 169  371:fload           5
	//* 170  373:fconst_0        
	//* 171  374:fcmpl           
	//* 172  375:iflt            415
						f3 = f;
	//  173  378:fload_2         
	//  174  379:fstore          4
					else
	//* 175  381:aload_0         
	//* 176  382:aload_1         
	//* 177  383:aload           20
	//* 178  385:fload           5
	//* 179  387:aload           19
	//* 180  389:iload           9
	//* 181  391:fload           6
	//* 182  393:fload           7
	//* 183  395:fload           4
	//* 184  397:fadd            
	//* 185  398:aload           17
	//* 186  400:iload           10
	//* 187  402:iconst_2        
	//* 188  403:idiv            
	//* 189  404:invokeinterface #353 <Method int IBarDataSet.getValueTextColor(int)>
	//* 190  409:invokevirtual   #357 <Method void drawValue(Canvas, com.github.mikephil.charting.formatter.ValueFormatter, float, com.github.mikephil.charting.data.Entry, int, float, float, int)>
	//* 191  412:goto            296
						f3 = f1;
	//  192  415:fload_3         
	//  193  416:fstore          4
					drawValue(canvas, valueformatter, f8, ((com.github.mikephil.charting.data.Entry) (obj)), i, f13, f17 + f3, ibardataset.getValueTextColor(j / 2));
				}
				j += 2;
			}
		}
		  goto _L3
		continue; /* Loop/switch isn't completed */
	//  194  418:goto            381
		int k = 0;
	//  195  421:iconst_0        
	//  196  422:istore          10
_L8:
		if((float)k >= (float)(af.length - 1) * mAnimator.getPhaseX()) goto _L3; else goto _L4
	//  197  424:iload           10
	//  198  426:i2f             
	//  199  427:aload           18
	//  200  429:arraylength     
	//  201  430:iconst_1        
	//  202  431:isub            
	//  203  432:i2f             
	//  204  433:aload_0         
	//  205  434:getfield        #105 <Field ChartAnimator mAnimator>
	//  206  437:invokevirtual   #111 <Method float ChartAnimator.getPhaseX()>
	//  207  440:fmul            
	//  208  441:fcmpg           
	//  209  442:ifge            94
_L4:
		BarEntry barentry;
		Object obj1;
		barentry = (BarEntry)ibardataset.getEntryForIndex(k / 2);
	//  210  445:aload           17
	//  211  447:iload           10
	//  212  449:iconst_2        
	//  213  450:idiv            
	//  214  451:invokeinterface #346 <Method com.github.mikephil.charting.data.Entry IBarDataSet.getEntryForIndex(int)>
	//  215  456:checkcast       #230 <Class BarEntry>
	//  216  459:astore          20
		obj1 = ((Object) (barentry.getVals()));
	//  217  461:aload           20
	//  218  463:invokevirtual   #361 <Method float[] BarEntry.getVals()>
	//  219  466:astore          21
		if(obj1 != null) goto _L6; else goto _L5
	//  220  468:aload           21
	//  221  470:ifnonnull       614
_L5:
		if(!mViewPortHandler.isInBoundsRight(af[k])) goto _L3; else goto _L7
	//  222  473:aload_0         
	//  223  474:getfield        #168 <Field ViewPortHandler mViewPortHandler>
	//  224  477:aload           18
	//  225  479:iload           10
	//  226  481:faload          
	//  227  482:invokevirtual   #177 <Method boolean ViewPortHandler.isInBoundsRight(float)>
	//  228  485:ifeq            94
_L7:
		if(mViewPortHandler.isInBoundsY(af[k + 1]) && mViewPortHandler.isInBoundsLeft(af[k]))
	//* 229  488:aload_0         
	//* 230  489:getfield        #168 <Field ViewPortHandler mViewPortHandler>
	//* 231  492:aload           18
	//* 232  494:iload           10
	//* 233  496:iconst_1        
	//* 234  497:iadd            
	//* 235  498:faload          
	//* 236  499:invokevirtual   #343 <Method boolean ViewPortHandler.isInBoundsY(float)>
	//* 237  502:ifeq            520
	//* 238  505:aload_0         
	//* 239  506:getfield        #168 <Field ViewPortHandler mViewPortHandler>
	//* 240  509:aload           18
	//* 241  511:iload           10
	//* 242  513:faload          
	//* 243  514:invokevirtual   #174 <Method boolean ViewPortHandler.isInBoundsLeft(float)>
	//* 244  517:ifne            529
	//* 245  520:iload           10
	//* 246  522:iconst_2        
	//* 247  523:iadd            
	//* 248  524:istore          10
	//* 249  526:goto            424
		{
			obj1 = ((Object) (ibardataset.getValueFormatter()));
	//  250  529:aload           17
	//  251  531:invokeinterface #350 <Method com.github.mikephil.charting.formatter.ValueFormatter IBarDataSet.getValueFormatter()>
	//  252  536:astore          21
			float f9 = barentry.getVal();
	//  253  538:aload           20
	//  254  540:invokevirtual   #297 <Method float BarEntry.getVal()>
	//  255  543:fstore          5
			float f14 = af[k];
	//  256  545:aload           18
	//  257  547:iload           10
	//  258  549:faload          
	//  259  550:fstore          6
			float f18 = af[k + 1];
	//  260  552:aload           18
	//  261  554:iload           10
	//  262  556:iconst_1        
	//  263  557:iadd            
	//  264  558:faload          
	//  265  559:fstore          7
			float f4;
			if(barentry.getVal() >= 0.0F)
	//* 266  561:aload           20
	//* 267  563:invokevirtual   #297 <Method float BarEntry.getVal()>
	//* 268  566:fconst_0        
	//* 269  567:fcmpl           
	//* 270  568:iflt            608
				f4 = f;
	//  271  571:fload_2         
	//  272  572:fstore          4
			else
	//* 273  574:aload_0         
	//* 274  575:aload_1         
	//* 275  576:aload           21
	//* 276  578:fload           5
	//* 277  580:aload           20
	//* 278  582:iload           9
	//* 279  584:fload           6
	//* 280  586:fload           7
	//* 281  588:fload           4
	//* 282  590:fadd            
	//* 283  591:aload           17
	//* 284  593:iload           10
	//* 285  595:iconst_2        
	//* 286  596:idiv            
	//* 287  597:invokeinterface #353 <Method int IBarDataSet.getValueTextColor(int)>
	//* 288  602:invokevirtual   #357 <Method void drawValue(Canvas, com.github.mikephil.charting.formatter.ValueFormatter, float, com.github.mikephil.charting.data.Entry, int, float, float, int)>
	//* 289  605:goto            520
				f4 = f1;
	//  290  608:fload_3         
	//  291  609:fstore          4
			drawValue(canvas, ((com.github.mikephil.charting.formatter.ValueFormatter) (obj1)), f9, ((com.github.mikephil.charting.data.Entry) (barentry)), i, f14, f18 + f4, ibardataset.getValueTextColor(k / 2));
		}
_L10:
		k += 2;
		  goto _L8
	//* 292  611:goto            574
_L6:
		int l;
		int j1;
		float af1[];
		j1 = ibardataset.getValueTextColor(k / 2);
	//  293  614:aload           17
	//  294  616:iload           10
	//  295  618:iconst_2        
	//  296  619:idiv            
	//  297  620:invokeinterface #353 <Method int IBarDataSet.getValueTextColor(int)>
	//  298  625:istore          13
		af1 = new float[obj1.length * 2];
	//  299  627:aload           21
	//  300  629:arraylength     
	//  301  630:iconst_2        
	//  302  631:imul            
	//  303  632:newarray        float[]
	//  304  634:astore          22
		float f10 = 0.0F;
	//  305  636:fconst_0        
	//  306  637:fstore          5
		float f5 = -barentry.getNegativeSum();
	//  307  639:aload           20
	//  308  641:invokevirtual   #364 <Method float BarEntry.getNegativeSum()>
	//  309  644:fneg            
	//  310  645:fstore          4
		int i1 = 0;
	//  311  647:iconst_0        
	//  312  648:istore          12
		l = 0;
	//  313  650:iconst_0        
	//  314  651:istore          11
		while(i1 < af1.length) 
	//* 315  653:iload           12
	//* 316  655:aload           22
	//* 317  657:arraylength     
	//* 318  658:icmpge          760
		{
			float f19 = obj1[l];
	//  319  661:aload           21
	//  320  663:iload           11
	//  321  665:faload          
	//  322  666:fstore          7
			float f15;
			if(f19 >= 0.0F)
	//* 323  668:fload           7
	//* 324  670:fconst_0        
	//* 325  671:fcmpl           
	//* 326  672:iflt            734
			{
				f19 = f10 + f19;
	//  327  675:fload           5
	//  328  677:fload           7
	//  329  679:fadd            
	//  330  680:fstore          7
				f10 = f19;
	//  331  682:fload           7
	//  332  684:fstore          5
				f15 = f5;
	//  333  686:fload           4
	//  334  688:fstore          6
				f5 = f10;
	//  335  690:fload           5
	//  336  692:fstore          4
			} else
	//* 337  694:aload           22
	//* 338  696:iload           12
	//* 339  698:iconst_1        
	//* 340  699:iadd            
	//* 341  700:aload_0         
	//* 342  701:getfield        #105 <Field ChartAnimator mAnimator>
	//* 343  704:invokevirtual   #114 <Method float ChartAnimator.getPhaseY()>
	//* 344  707:fload           4
	//* 345  709:fmul            
	//* 346  710:fastore         
	//* 347  711:iload           12
	//* 348  713:iconst_2        
	//* 349  714:iadd            
	//* 350  715:istore          12
	//* 351  717:iload           11
	//* 352  719:iconst_1        
	//* 353  720:iadd            
	//* 354  721:istore          11
	//* 355  723:fload           6
	//* 356  725:fstore          4
	//* 357  727:fload           7
	//* 358  729:fstore          5
	//* 359  731:goto            653
			{
				f15 = f5;
	//  360  734:fload           4
	//  361  736:fstore          6
				f19 = f5 - f19;
	//  362  738:fload           4
	//  363  740:fload           7
	//  364  742:fsub            
	//  365  743:fstore          7
				f5 = f15;
	//  366  745:fload           6
	//  367  747:fstore          4
				f15 = f19;
	//  368  749:fload           7
	//  369  751:fstore          6
				f19 = f10;
	//  370  753:fload           5
	//  371  755:fstore          7
			}
			af1[i1 + 1] = mAnimator.getPhaseY() * f5;
			i1 += 2;
			l++;
			f5 = f15;
			f10 = f19;
		}
	//* 372  757:goto            694
		((Transformer) (obj)).pointValuesToPixel(af1);
	//  373  760:aload           19
	//  374  762:aload           22
	//  375  764:invokevirtual   #154 <Method void Transformer.pointValuesToPixel(float[])>
		l = 0;
	//  376  767:iconst_0        
	//  377  768:istore          11
_L12:
		if(l >= af1.length) goto _L10; else goto _L9
	//  378  770:iload           11
	//  379  772:aload           22
	//  380  774:arraylength     
	//  381  775:icmpge          520
_L9:
		float f6;
		float f11;
		f11 = af[k];
	//  382  778:aload           18
	//  383  780:iload           10
	//  384  782:faload          
	//  385  783:fstore          5
		float f16 = af1[l + 1];
	//  386  785:aload           22
	//  387  787:iload           11
	//  388  789:iconst_1        
	//  389  790:iadd            
	//  390  791:faload          
	//  391  792:fstore          6
		if(obj1[l / 2] >= 0.0F)
	//* 392  794:aload           21
	//* 393  796:iload           11
	//* 394  798:iconst_2        
	//* 395  799:idiv            
	//* 396  800:faload          
	//* 397  801:fconst_0        
	//* 398  802:fcmpl           
	//* 399  803:iflt            861
			f6 = f;
	//  400  806:fload_2         
	//  401  807:fstore          4
		else
	//* 402  809:fload           6
	//* 403  811:fload           4
	//* 404  813:fadd            
	//* 405  814:fstore          4
	//* 406  816:aload_0         
	//* 407  817:getfield        #168 <Field ViewPortHandler mViewPortHandler>
	//* 408  820:fload           5
	//* 409  822:invokevirtual   #177 <Method boolean ViewPortHandler.isInBoundsRight(float)>
	//* 410  825:ifeq            520
	//* 411  828:aload_0         
	//* 412  829:getfield        #168 <Field ViewPortHandler mViewPortHandler>
	//* 413  832:fload           4
	//* 414  834:invokevirtual   #343 <Method boolean ViewPortHandler.isInBoundsY(float)>
	//* 415  837:ifeq            852
	//* 416  840:aload_0         
	//* 417  841:getfield        #168 <Field ViewPortHandler mViewPortHandler>
	//* 418  844:fload           5
	//* 419  846:invokevirtual   #174 <Method boolean ViewPortHandler.isInBoundsLeft(float)>
	//* 420  849:ifne            867
	//* 421  852:iload           11
	//* 422  854:iconst_2        
	//* 423  855:iadd            
	//* 424  856:istore          11
	//* 425  858:goto            770
			f6 = f1;
	//  426  861:fload_3         
	//  427  862:fstore          4
		f6 = f16 + f6;
		if(!mViewPortHandler.isInBoundsRight(f11)) goto _L10; else goto _L11
_L11:
		if(mViewPortHandler.isInBoundsY(f6) && mViewPortHandler.isInBoundsLeft(f11))
	//* 428  864:goto            809
			drawValue(canvas, ibardataset.getValueFormatter(), obj1[l / 2], ((com.github.mikephil.charting.data.Entry) (barentry)), i, f11, f6, j1);
	//  429  867:aload_0         
	//  430  868:aload_1         
	//  431  869:aload           17
	//  432  871:invokeinterface #350 <Method com.github.mikephil.charting.formatter.ValueFormatter IBarDataSet.getValueFormatter()>
	//  433  876:aload           21
	//  434  878:iload           11
	//  435  880:iconst_2        
	//  436  881:idiv            
	//  437  882:faload          
	//  438  883:aload           20
	//  439  885:iload           9
	//  440  887:fload           5
	//  441  889:fload           4
	//  442  891:iload           13
	//  443  893:invokevirtual   #357 <Method void drawValue(Canvas, com.github.mikephil.charting.formatter.ValueFormatter, float, com.github.mikephil.charting.data.Entry, int, float, float, int)>
		l += 2;
		  goto _L12
	//* 444  896:goto            852
		return;
	//  445  899:return          
		if(true) goto _L2; else goto _L13
_L13:
	}

	public float[] getTransformedValues(Transformer transformer, IBarDataSet ibardataset, int i)
	{
		return transformer.generateTransformedValuesBarChart(ibardataset, i, mChart.getBarData(), mAnimator.getPhaseY());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:aload_0         
	//    4    4:getfield        #26  <Field BarDataProvider mChart>
	//    5    7:invokeinterface #67  <Method BarData BarDataProvider.getBarData()>
	//    6   12:aload_0         
	//    7   13:getfield        #105 <Field ChartAnimator mAnimator>
	//    8   16:invokevirtual   #114 <Method float ChartAnimator.getPhaseY()>
	//    9   19:invokevirtual   #368 <Method float[] Transformer.generateTransformedValuesBarChart(IBarDataSet, int, BarData, float)>
	//   10   22:areturn         
	}

	public void initBuffers()
	{
		BarData bardata = mChart.getBarData();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field BarDataProvider mChart>
	//    2    4:invokeinterface #67  <Method BarData BarDataProvider.getBarData()>
	//    3    9:astore          4
		mBarBuffers = new BarBuffer[bardata.getDataSetCount()];
	//    4   11:aload_0         
	//    5   12:aload           4
	//    6   14:invokevirtual   #73  <Method int BarData.getDataSetCount()>
	//    7   17:anewarray       BarBuffer[]
	//    8   20:putfield        #116 <Field BarBuffer[] mBarBuffers>
		int i = 0;
	//    9   23:iconst_0        
	//   10   24:istore_1        
		while(i < mBarBuffers.length) 
	//*  11   25:iload_1         
	//*  12   26:aload_0         
	//*  13   27:getfield        #116 <Field BarBuffer[] mBarBuffers>
	//*  14   30:arraylength     
	//*  15   31:icmpge          122
		{
			IBarDataSet ibardataset = (IBarDataSet)bardata.getDataSetByIndex(i);
	//   16   34:aload           4
	//   17   36:iload_1         
	//   18   37:invokevirtual   #77  <Method com.github.mikephil.charting.interfaces.datasets.IDataSet BarData.getDataSetByIndex(int)>
	//   19   40:checkcast       #79  <Class IBarDataSet>
	//   20   43:astore          5
			BarBuffer abarbuffer[] = mBarBuffers;
	//   21   45:aload_0         
	//   22   46:getfield        #116 <Field BarBuffer[] mBarBuffers>
	//   23   49:astore          6
			int k = ibardataset.getEntryCount();
	//   24   51:aload           5
	//   25   53:invokeinterface #86  <Method int IBarDataSet.getEntryCount()>
	//   26   58:istore_3        
			int j;
			if(ibardataset.isStacked())
	//*  27   59:aload           5
	//*  28   61:invokeinterface #340 <Method boolean IBarDataSet.isStacked()>
	//*  29   66:ifeq            117
				j = ibardataset.getStackSize();
	//   30   69:aload           5
	//   31   71:invokeinterface #372 <Method int IBarDataSet.getStackSize()>
	//   32   76:istore_2        
			else
	//*  33   77:aload           6
	//*  34   79:iload_1         
	//*  35   80:new             #118 <Class BarBuffer>
	//*  36   83:dup             
	//*  37   84:iload_2         
	//*  38   85:iload_3         
	//*  39   86:iconst_4        
	//*  40   87:imul            
	//*  41   88:imul            
	//*  42   89:aload           4
	//*  43   91:invokevirtual   #234 <Method float BarData.getGroupSpace()>
	//*  44   94:aload           4
	//*  45   96:invokevirtual   #73  <Method int BarData.getDataSetCount()>
	//*  46   99:aload           5
	//*  47  101:invokeinterface #340 <Method boolean IBarDataSet.isStacked()>
	//*  48  106:invokespecial   #375 <Method void BarBuffer(int, float, int, boolean)>
	//*  49  109:aastore         
	//*  50  110:iload_1         
	//*  51  111:iconst_1        
	//*  52  112:iadd            
	//*  53  113:istore_1        
	//*  54  114:goto            25
				j = 1;
	//   55  117:iconst_1        
	//   56  118:istore_2        
			abarbuffer[i] = new BarBuffer(j * (k * 4), bardata.getGroupSpace(), bardata.getDataSetCount(), ibardataset.isStacked());
			i++;
		}
	//*  57  119:goto            77
	//   58  122:return          
	}

	protected boolean passesCheck()
	{
		return (float)mChart.getBarData().getYValCount() < (float)mChart.getMaxVisibleCount() * mViewPortHandler.getScaleX();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field BarDataProvider mChart>
	//    2    4:invokeinterface #67  <Method BarData BarDataProvider.getBarData()>
	//    3    9:invokevirtual   #378 <Method int BarData.getYValCount()>
	//    4   12:i2f             
	//    5   13:aload_0         
	//    6   14:getfield        #26  <Field BarDataProvider mChart>
	//    7   17:invokeinterface #381 <Method int BarDataProvider.getMaxVisibleCount()>
	//    8   22:i2f             
	//    9   23:aload_0         
	//   10   24:getfield        #168 <Field ViewPortHandler mViewPortHandler>
	//   11   27:invokevirtual   #384 <Method float ViewPortHandler.getScaleX()>
	//   12   30:fmul            
	//   13   31:fcmpg           
	//   14   32:ifge            37
	//   15   35:iconst_1        
	//   16   36:ireturn         
	//   17   37:iconst_0        
	//   18   38:ireturn         
	}

	protected void prepareBarHighlight(float f, float f1, float f2, float f3, Transformer transformer)
	{
		mBarRect.set((f - 0.5F) + f3, f1, (f + 0.5F) - f3, f2);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field RectF mBarRect>
	//    2    4:fload_1         
	//    3    5:ldc2            #385 <Float 0.5F>
	//    4    8:fsub            
	//    5    9:fload           4
	//    6   11:fadd            
	//    7   12:fload_2         
	//    8   13:fload_1         
	//    9   14:ldc2            #385 <Float 0.5F>
	//   10   17:fadd            
	//   11   18:fload           4
	//   12   20:fsub            
	//   13   21:fload_3         
	//   14   22:invokevirtual   #389 <Method void RectF.set(float, float, float, float)>
		transformer.rectValueToPixel(mBarRect, mAnimator.getPhaseY());
	//   15   25:aload           5
	//   16   27:aload_0         
	//   17   28:getfield        #24  <Field RectF mBarRect>
	//   18   31:aload_0         
	//   19   32:getfield        #105 <Field ChartAnimator mAnimator>
	//   20   35:invokevirtual   #114 <Method float ChartAnimator.getPhaseY()>
	//   21   38:invokevirtual   #393 <Method void Transformer.rectValueToPixel(RectF, float)>
	//   22   41:return          
	}

	protected BarBuffer mBarBuffers[];
	protected RectF mBarRect;
	protected BarDataProvider mChart;
	protected Paint mShadowPaint;
}
