// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.renderer;

import android.graphics.*;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.CircleBuffer;
import com.github.mikephil.charting.buffer.LineBuffer;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.formatter.FillFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.renderer:
//			LineRadarRenderer

public class LineChartRenderer extends LineRadarRenderer
{

	public LineChartRenderer(LineDataProvider linedataprovider, ChartAnimator chartanimator, ViewPortHandler viewporthandler)
	{
		super(chartanimator, viewporthandler);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #27  <Method void LineRadarRenderer(ChartAnimator, ViewPortHandler)>
		mBitmapConfig = android.graphics.Bitmap.Config.ARGB_8888;
	//    4    6:aload_0         
	//    5    7:getstatic       #32  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//    6   10:putfield        #34  <Field android.graphics.Bitmap$Config mBitmapConfig>
		cubicPath = new Path();
	//    7   13:aload_0         
	//    8   14:new             #36  <Class Path>
	//    9   17:dup             
	//   10   18:invokespecial   #39  <Method void Path()>
	//   11   21:putfield        #41  <Field Path cubicPath>
		cubicFillPath = new Path();
	//   12   24:aload_0         
	//   13   25:new             #36  <Class Path>
	//   14   28:dup             
	//   15   29:invokespecial   #39  <Method void Path()>
	//   16   32:putfield        #43  <Field Path cubicFillPath>
		mChart = linedataprovider;
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:putfield        #45  <Field LineDataProvider mChart>
		mCirclePaintInner = new Paint(1);
	//   20   40:aload_0         
	//   21   41:new             #47  <Class Paint>
	//   22   44:dup             
	//   23   45:iconst_1        
	//   24   46:invokespecial   #50  <Method void Paint(int)>
	//   25   49:putfield        #52  <Field Paint mCirclePaintInner>
		mCirclePaintInner.setStyle(android.graphics.Paint.Style.FILL);
	//   26   52:aload_0         
	//   27   53:getfield        #52  <Field Paint mCirclePaintInner>
	//   28   56:getstatic       #58  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   29   59:invokevirtual   #62  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		mCirclePaintInner.setColor(-1);
	//   30   62:aload_0         
	//   31   63:getfield        #52  <Field Paint mCirclePaintInner>
	//   32   66:iconst_m1       
	//   33   67:invokevirtual   #65  <Method void Paint.setColor(int)>
	//   34   70:return          
	}

	private Path generateFilledPath(ILineDataSet ilinedataset, int i, int j)
	{
		float f = ilinedataset.getFillFormatter().getFillLinePosition(ilinedataset, mChart);
	//    0    0:aload_1         
	//    1    1:invokeinterface #74  <Method FillFormatter ILineDataSet.getFillFormatter()>
	//    2    6:aload_1         
	//    3    7:aload_0         
	//    4    8:getfield        #45  <Field LineDataProvider mChart>
	//    5   11:invokeinterface #80  <Method float FillFormatter.getFillLinePosition(ILineDataSet, LineDataProvider)>
	//    6   16:fstore          4
		float f1 = mAnimator.getPhaseX();
	//    7   18:aload_0         
	//    8   19:getfield        #84  <Field ChartAnimator mAnimator>
	//    9   22:invokevirtual   #90  <Method float ChartAnimator.getPhaseX()>
	//   10   25:fstore          5
		float f2 = mAnimator.getPhaseY();
	//   11   27:aload_0         
	//   12   28:getfield        #84  <Field ChartAnimator mAnimator>
	//   13   31:invokevirtual   #93  <Method float ChartAnimator.getPhaseY()>
	//   14   34:fstore          6
		Path path = new Path();
	//   15   36:new             #36  <Class Path>
	//   16   39:dup             
	//   17   40:invokespecial   #39  <Method void Path()>
	//   18   43:astore          9
		Entry entry = ilinedataset.getEntryForIndex(i);
	//   19   45:aload_1         
	//   20   46:iload_2         
	//   21   47:invokeinterface #97  <Method Entry ILineDataSet.getEntryForIndex(int)>
	//   22   52:astore          10
		path.moveTo(entry.getXIndex(), f);
	//   23   54:aload           9
	//   24   56:aload           10
	//   25   58:invokevirtual   #103 <Method int Entry.getXIndex()>
	//   26   61:i2f             
	//   27   62:fload           4
	//   28   64:invokevirtual   #107 <Method void Path.moveTo(float, float)>
		path.lineTo(entry.getXIndex(), entry.getVal() * f2);
	//   29   67:aload           9
	//   30   69:aload           10
	//   31   71:invokevirtual   #103 <Method int Entry.getXIndex()>
	//   32   74:i2f             
	//   33   75:aload           10
	//   34   77:invokevirtual   #110 <Method float Entry.getVal()>
	//   35   80:fload           6
	//   36   82:fmul            
	//   37   83:invokevirtual   #113 <Method void Path.lineTo(float, float)>
		int k = i + 1;
	//   38   86:iload_2         
	//   39   87:iconst_1        
	//   40   88:iadd            
	//   41   89:istore          7
		for(int l = (int)Math.ceil((float)(j - i) * f1 + (float)i); k < l; k++)
	//*  42   91:iload_3         
	//*  43   92:iload_2         
	//*  44   93:isub            
	//*  45   94:i2f             
	//*  46   95:fload           5
	//*  47   97:fmul            
	//*  48   98:iload_2         
	//*  49   99:i2f             
	//*  50  100:fadd            
	//*  51  101:f2d             
	//*  52  102:invokestatic    #119 <Method double Math.ceil(double)>
	//*  53  105:d2i             
	//*  54  106:istore          8
	//*  55  108:iload           7
	//*  56  110:iload           8
	//*  57  112:icmpge          153
		{
			Entry entry1 = ilinedataset.getEntryForIndex(k);
	//   58  115:aload_1         
	//   59  116:iload           7
	//   60  118:invokeinterface #97  <Method Entry ILineDataSet.getEntryForIndex(int)>
	//   61  123:astore          10
			path.lineTo(entry1.getXIndex(), entry1.getVal() * f2);
	//   62  125:aload           9
	//   63  127:aload           10
	//   64  129:invokevirtual   #103 <Method int Entry.getXIndex()>
	//   65  132:i2f             
	//   66  133:aload           10
	//   67  135:invokevirtual   #110 <Method float Entry.getVal()>
	//   68  138:fload           6
	//   69  140:fmul            
	//   70  141:invokevirtual   #113 <Method void Path.lineTo(float, float)>
		}

	//   71  144:iload           7
	//   72  146:iconst_1        
	//   73  147:iadd            
	//   74  148:istore          7
	//*  75  150:goto            108
		path.lineTo(ilinedataset.getEntryForIndex(Math.max(Math.min((int)Math.ceil((float)(j - i) * f1 + (float)i) - 1, ilinedataset.getEntryCount() - 1), 0)).getXIndex(), f);
	//   76  153:aload           9
	//   77  155:aload_1         
	//   78  156:iload_3         
	//   79  157:iload_2         
	//   80  158:isub            
	//   81  159:i2f             
	//   82  160:fload           5
	//   83  162:fmul            
	//   84  163:iload_2         
	//   85  164:i2f             
	//   86  165:fadd            
	//   87  166:f2d             
	//   88  167:invokestatic    #119 <Method double Math.ceil(double)>
	//   89  170:d2i             
	//   90  171:iconst_1        
	//   91  172:isub            
	//   92  173:aload_1         
	//   93  174:invokeinterface #122 <Method int ILineDataSet.getEntryCount()>
	//   94  179:iconst_1        
	//   95  180:isub            
	//   96  181:invokestatic    #126 <Method int Math.min(int, int)>
	//   97  184:iconst_0        
	//   98  185:invokestatic    #129 <Method int Math.max(int, int)>
	//   99  188:invokeinterface #97  <Method Entry ILineDataSet.getEntryForIndex(int)>
	//  100  193:invokevirtual   #103 <Method int Entry.getXIndex()>
	//  101  196:i2f             
	//  102  197:fload           4
	//  103  199:invokevirtual   #113 <Method void Path.lineTo(float, float)>
		path.close();
	//  104  202:aload           9
	//  105  204:invokevirtual   #132 <Method void Path.close()>
		return path;
	//  106  207:aload           9
	//  107  209:areturn         
	}

	protected void drawCircles(Canvas canvas)
	{
		float f;
		float f1;
		int i;
		List list;
		mRenderPaint.setStyle(android.graphics.Paint.Style.FILL);
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field Paint mRenderPaint>
	//    2    4:getstatic       #58  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//    3    7:invokevirtual   #62  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		f = mAnimator.getPhaseX();
	//    4   10:aload_0         
	//    5   11:getfield        #84  <Field ChartAnimator mAnimator>
	//    6   14:invokevirtual   #90  <Method float ChartAnimator.getPhaseX()>
	//    7   17:fstore_2        
		f1 = mAnimator.getPhaseY();
	//    8   18:aload_0         
	//    9   19:getfield        #84  <Field ChartAnimator mAnimator>
	//   10   22:invokevirtual   #93  <Method float ChartAnimator.getPhaseY()>
	//   11   25:fstore_3        
		list = mChart.getLineData().getDataSets();
	//   12   26:aload_0         
	//   13   27:getfield        #45  <Field LineDataProvider mChart>
	//   14   30:invokeinterface #143 <Method LineData LineDataProvider.getLineData()>
	//   15   35:invokevirtual   #149 <Method List LineData.getDataSets()>
	//   16   38:astore          12
		i = 0;
	//   17   40:iconst_0        
	//   18   41:istore          7
_L2:
		ILineDataSet ilinedataset;
		if(i >= list.size())
			break MISSING_BLOCK_LABEL_470;
	//   19   43:iload           7
	//   20   45:aload           12
	//   21   47:invokeinterface #154 <Method int List.size()>
	//   22   52:icmpge          470
		ilinedataset = (ILineDataSet)list.get(i);
	//   23   55:aload           12
	//   24   57:iload           7
	//   25   59:invokeinterface #158 <Method Object List.get(int)>
	//   26   64:checkcast       #70  <Class ILineDataSet>
	//   27   67:astore          13
		if(ilinedataset.isVisible() && ilinedataset.isDrawCirclesEnabled() && ilinedataset.getEntryCount() != 0)
			break; /* Loop/switch isn't completed */
	//   28   69:aload           13
	//   29   71:invokeinterface #162 <Method boolean ILineDataSet.isVisible()>
	//   30   76:ifeq            99
	//   31   79:aload           13
	//   32   81:invokeinterface #165 <Method boolean ILineDataSet.isDrawCirclesEnabled()>
	//   33   86:ifeq            99
	//   34   89:aload           13
	//   35   91:invokeinterface #122 <Method int ILineDataSet.getEntryCount()>
	//   36   96:ifne            108
_L4:
		i++;
	//   37   99:iload           7
	//   38  101:iconst_1        
	//   39  102:iadd            
	//   40  103:istore          7
		if(true) goto _L2; else goto _L1
	//   41  105:goto            43
_L1:
		float f2;
		float f3;
		float f4;
		int j;
		int k;
		mCirclePaintInner.setColor(ilinedataset.getCircleHoleColor());
	//   42  108:aload_0         
	//   43  109:getfield        #52  <Field Paint mCirclePaintInner>
	//   44  112:aload           13
	//   45  114:invokeinterface #168 <Method int ILineDataSet.getCircleHoleColor()>
	//   46  119:invokevirtual   #65  <Method void Paint.setColor(int)>
		Transformer transformer = mChart.getTransformer(ilinedataset.getAxisDependency());
	//   47  122:aload_0         
	//   48  123:getfield        #45  <Field LineDataProvider mChart>
	//   49  126:aload           13
	//   50  128:invokeinterface #172 <Method com.github.mikephil.charting.components.YAxis$AxisDependency ILineDataSet.getAxisDependency()>
	//   51  133:invokeinterface #176 <Method Transformer LineDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   52  138:astore          14
		int l = ilinedataset.getEntryCount();
	//   53  140:aload           13
	//   54  142:invokeinterface #122 <Method int ILineDataSet.getEntryCount()>
	//   55  147:istore          10
		Object obj;
		Entry entry;
		if(mMinX < 0)
	//*  56  149:aload_0         
	//*  57  150:getfield        #180 <Field int mMinX>
	//*  58  153:ifge            378
			j = 0;
	//   59  156:iconst_0        
	//   60  157:istore          8
		else
	//*  61  159:aload           13
	//*  62  161:iload           8
	//*  63  163:getstatic       #186 <Field com.github.mikephil.charting.data.DataSet$Rounding com.github.mikephil.charting.data.DataSet$Rounding.DOWN>
	//*  64  166:invokeinterface #190 <Method Entry ILineDataSet.getEntryForXIndex(int, com.github.mikephil.charting.data.DataSet$Rounding)>
	//*  65  171:astore          15
	//*  66  173:aload           13
	//*  67  175:aload_0         
	//*  68  176:getfield        #193 <Field int mMaxX>
	//*  69  179:getstatic       #196 <Field com.github.mikephil.charting.data.DataSet$Rounding com.github.mikephil.charting.data.DataSet$Rounding.UP>
	//*  70  182:invokeinterface #190 <Method Entry ILineDataSet.getEntryForXIndex(int, com.github.mikephil.charting.data.DataSet$Rounding)>
	//*  71  187:astore          16
	//*  72  189:aload           13
	//*  73  191:aload           15
	//*  74  193:invokeinterface #200 <Method int ILineDataSet.getEntryIndex(Entry)>
	//*  75  198:iconst_0        
	//*  76  199:invokestatic    #129 <Method int Math.max(int, int)>
	//*  77  202:istore          9
	//*  78  204:aload           13
	//*  79  206:aload           16
	//*  80  208:invokeinterface #200 <Method int ILineDataSet.getEntryIndex(Entry)>
	//*  81  213:iconst_1        
	//*  82  214:iadd            
	//*  83  215:iload           10
	//*  84  217:invokestatic    #126 <Method int Math.min(int, int)>
	//*  85  220:istore          10
	//*  86  222:aload_0         
	//*  87  223:getfield        #202 <Field CircleBuffer[] mCircleBuffers>
	//*  88  226:iload           7
	//*  89  228:aaload          
	//*  90  229:astore          15
	//*  91  231:aload           15
	//*  92  233:fload_2         
	//*  93  234:fload_3         
	//*  94  235:invokevirtual   #207 <Method void CircleBuffer.setPhases(float, float)>
	//*  95  238:aload           15
	//*  96  240:iload           9
	//*  97  242:invokevirtual   #210 <Method void CircleBuffer.limitFrom(int)>
	//*  98  245:aload           15
	//*  99  247:iload           10
	//* 100  249:invokevirtual   #213 <Method void CircleBuffer.limitTo(int)>
	//* 101  252:aload           15
	//* 102  254:aload           13
	//* 103  256:invokevirtual   #217 <Method void CircleBuffer.feed(ILineDataSet)>
	//* 104  259:aload           14
	//* 105  261:aload           15
	//* 106  263:getfield        #221 <Field float[] CircleBuffer.buffer>
	//* 107  266:invokevirtual   #227 <Method void Transformer.pointValuesToPixel(float[])>
	//* 108  269:aload           13
	//* 109  271:invokeinterface #230 <Method float ILineDataSet.getCircleRadius()>
	//* 110  276:fconst_2        
	//* 111  277:fdiv            
	//* 112  278:fstore          4
	//* 113  280:iconst_0        
	//* 114  281:istore          8
	//* 115  283:iload           10
	//* 116  285:iload           9
	//* 117  287:isub            
	//* 118  288:i2f             
	//* 119  289:fload_2         
	//* 120  290:fmul            
	//* 121  291:iload           9
	//* 122  293:i2f             
	//* 123  294:fadd            
	//* 124  295:f2d             
	//* 125  296:invokestatic    #119 <Method double Math.ceil(double)>
	//* 126  299:d2i             
	//* 127  300:istore          10
	//* 128  302:iload           8
	//* 129  304:iload           10
	//* 130  306:iconst_2        
	//* 131  307:imul            
	//* 132  308:icmpge          99
	//* 133  311:aload           15
	//* 134  313:getfield        #221 <Field float[] CircleBuffer.buffer>
	//* 135  316:iload           8
	//* 136  318:faload          
	//* 137  319:fstore          5
	//* 138  321:aload           15
	//* 139  323:getfield        #221 <Field float[] CircleBuffer.buffer>
	//* 140  326:iload           8
	//* 141  328:iconst_1        
	//* 142  329:iadd            
	//* 143  330:faload          
	//* 144  331:fstore          6
	//* 145  333:aload_0         
	//* 146  334:getfield        #234 <Field ViewPortHandler mViewPortHandler>
	//* 147  337:fload           5
	//* 148  339:invokevirtual   #240 <Method boolean ViewPortHandler.isInBoundsRight(float)>
	//* 149  342:ifeq            99
	//* 150  345:aload_0         
	//* 151  346:getfield        #234 <Field ViewPortHandler mViewPortHandler>
	//* 152  349:fload           5
	//* 153  351:invokevirtual   #243 <Method boolean ViewPortHandler.isInBoundsLeft(float)>
	//* 154  354:ifeq            369
	//* 155  357:aload_0         
	//* 156  358:getfield        #234 <Field ViewPortHandler mViewPortHandler>
	//* 157  361:fload           6
	//* 158  363:invokevirtual   #246 <Method boolean ViewPortHandler.isInBoundsY(float)>
	//* 159  366:ifne            387
	//* 160  369:iload           8
	//* 161  371:iconst_2        
	//* 162  372:iadd            
	//* 163  373:istore          8
	//* 164  375:goto            302
			j = mMinX;
	//  165  378:aload_0         
	//  166  379:getfield        #180 <Field int mMinX>
	//  167  382:istore          8
		obj = ((Object) (ilinedataset.getEntryForXIndex(j, com.github.mikephil.charting.data.DataSet.Rounding.DOWN)));
		entry = ilinedataset.getEntryForXIndex(mMaxX, com.github.mikephil.charting.data.DataSet.Rounding.UP);
		k = Math.max(ilinedataset.getEntryIndex(((Entry) (obj))), 0);
		l = Math.min(ilinedataset.getEntryIndex(entry) + 1, l);
		obj = ((Object) (mCircleBuffers[i]));
		((CircleBuffer) (obj)).setPhases(f, f1);
		((CircleBuffer) (obj)).limitFrom(k);
		((CircleBuffer) (obj)).limitTo(l);
		((CircleBuffer) (obj)).feed(ilinedataset);
		transformer.pointValuesToPixel(((CircleBuffer) (obj)).buffer);
		f2 = ilinedataset.getCircleRadius() / 2.0F;
		j = 0;
		l = (int)Math.ceil((float)(l - k) * f + (float)k);
_L6:
		if(j >= l * 2) goto _L4; else goto _L3
_L3:
		f3 = ((CircleBuffer) (obj)).buffer[j];
		f4 = ((CircleBuffer) (obj)).buffer[j + 1];
		if(!mViewPortHandler.isInBoundsRight(f3)) goto _L4; else goto _L5
_L5:
		if(mViewPortHandler.isInBoundsLeft(f3) && mViewPortHandler.isInBoundsY(f4))
	//* 168  384:goto            159
		{
			int i1 = ilinedataset.getCircleColor(j / 2 + k);
	//  169  387:aload           13
	//  170  389:iload           8
	//  171  391:iconst_2        
	//  172  392:idiv            
	//  173  393:iload           9
	//  174  395:iadd            
	//  175  396:invokeinterface #250 <Method int ILineDataSet.getCircleColor(int)>
	//  176  401:istore          11
			mRenderPaint.setColor(i1);
	//  177  403:aload_0         
	//  178  404:getfield        #137 <Field Paint mRenderPaint>
	//  179  407:iload           11
	//  180  409:invokevirtual   #65  <Method void Paint.setColor(int)>
			canvas.drawCircle(f3, f4, ilinedataset.getCircleRadius(), mRenderPaint);
	//  181  412:aload_1         
	//  182  413:fload           5
	//  183  415:fload           6
	//  184  417:aload           13
	//  185  419:invokeinterface #230 <Method float ILineDataSet.getCircleRadius()>
	//  186  424:aload_0         
	//  187  425:getfield        #137 <Field Paint mRenderPaint>
	//  188  428:invokevirtual   #256 <Method void Canvas.drawCircle(float, float, float, Paint)>
			if(ilinedataset.isDrawCircleHoleEnabled() && i1 != mCirclePaintInner.getColor())
	//* 189  431:aload           13
	//* 190  433:invokeinterface #259 <Method boolean ILineDataSet.isDrawCircleHoleEnabled()>
	//* 191  438:ifeq            369
	//* 192  441:iload           11
	//* 193  443:aload_0         
	//* 194  444:getfield        #52  <Field Paint mCirclePaintInner>
	//* 195  447:invokevirtual   #262 <Method int Paint.getColor()>
	//* 196  450:icmpeq          369
				canvas.drawCircle(f3, f4, f2, mCirclePaintInner);
	//  197  453:aload_1         
	//  198  454:fload           5
	//  199  456:fload           6
	//  200  458:fload           4
	//  201  460:aload_0         
	//  202  461:getfield        #52  <Field Paint mCirclePaintInner>
	//  203  464:invokevirtual   #256 <Method void Canvas.drawCircle(float, float, float, Paint)>
		}
		j += 2;
		  goto _L6
	//* 204  467:goto            369
	//  205  470:return          
	}

	protected void drawCubic(Canvas canvas, ILineDataSet ilinedataset)
	{
		canvas = ((Canvas) (mChart.getTransformer(ilinedataset.getAxisDependency())));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field LineDataProvider mChart>
	//    2    4:aload_2         
	//    3    5:invokeinterface #172 <Method com.github.mikephil.charting.components.YAxis$AxisDependency ILineDataSet.getAxisDependency()>
	//    4   10:invokeinterface #176 <Method Transformer LineDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//    5   15:astore_1        
		int i1 = ilinedataset.getEntryCount();
	//    6   16:aload_2         
	//    7   17:invokeinterface #122 <Method int ILineDataSet.getEntryCount()>
	//    8   22:istore          13
		float f;
		float f1;
		float f2;
		int i;
		int k;
		int j1;
		Entry entry;
		Entry entry1;
		if(mMinX < 0)
	//*   9   24:aload_0         
	//*  10   25:getfield        #180 <Field int mMinX>
	//*  11   28:ifge            561
			i = 0;
	//   12   31:iconst_0        
	//   13   32:istore          11
		else
	//*  14   34:aload_2         
	//*  15   35:iload           11
	//*  16   37:getstatic       #186 <Field com.github.mikephil.charting.data.DataSet$Rounding com.github.mikephil.charting.data.DataSet$Rounding.DOWN>
	//*  17   40:invokeinterface #190 <Method Entry ILineDataSet.getEntryForXIndex(int, com.github.mikephil.charting.data.DataSet$Rounding)>
	//*  18   45:astore          16
	//*  19   47:aload_2         
	//*  20   48:aload_0         
	//*  21   49:getfield        #193 <Field int mMaxX>
	//*  22   52:getstatic       #196 <Field com.github.mikephil.charting.data.DataSet$Rounding com.github.mikephil.charting.data.DataSet$Rounding.UP>
	//*  23   55:invokeinterface #190 <Method Entry ILineDataSet.getEntryForXIndex(int, com.github.mikephil.charting.data.DataSet$Rounding)>
	//*  24   60:astore          17
	//*  25   62:aload           16
	//*  26   64:aload           17
	//*  27   66:if_acmpne       570
	//*  28   69:iconst_1        
	//*  29   70:istore          11
	//*  30   72:aload_2         
	//*  31   73:aload           16
	//*  32   75:invokeinterface #200 <Method int ILineDataSet.getEntryIndex(Entry)>
	//*  33   80:iload           11
	//*  34   82:isub            
	//*  35   83:iconst_1        
	//*  36   84:isub            
	//*  37   85:iconst_0        
	//*  38   86:invokestatic    #129 <Method int Math.max(int, int)>
	//*  39   89:istore          11
	//*  40   91:aload_2         
	//*  41   92:aload           17
	//*  42   94:invokeinterface #200 <Method int ILineDataSet.getEntryIndex(Entry)>
	//*  43   99:iconst_1        
	//*  44  100:iadd            
	//*  45  101:iload           13
	//*  46  103:invokestatic    #126 <Method int Math.min(int, int)>
	//*  47  106:istore          12
	//*  48  108:aload_0         
	//*  49  109:getfield        #84  <Field ChartAnimator mAnimator>
	//*  50  112:invokevirtual   #90  <Method float ChartAnimator.getPhaseX()>
	//*  51  115:fstore          5
	//*  52  117:aload_0         
	//*  53  118:getfield        #84  <Field ChartAnimator mAnimator>
	//*  54  121:invokevirtual   #93  <Method float ChartAnimator.getPhaseY()>
	//*  55  124:fstore_3        
	//*  56  125:aload_2         
	//*  57  126:invokeinterface #267 <Method float ILineDataSet.getCubicIntensity()>
	//*  58  131:fstore          4
	//*  59  133:aload_0         
	//*  60  134:getfield        #41  <Field Path cubicPath>
	//*  61  137:invokevirtual   #270 <Method void Path.reset()>
	//*  62  140:iload           12
	//*  63  142:iload           11
	//*  64  144:isub            
	//*  65  145:i2f             
	//*  66  146:fload           5
	//*  67  148:fmul            
	//*  68  149:iload           11
	//*  69  151:i2f             
	//*  70  152:fadd            
	//*  71  153:f2d             
	//*  72  154:invokestatic    #119 <Method double Math.ceil(double)>
	//*  73  157:d2i             
	//*  74  158:istore          14
	//*  75  160:iload           14
	//*  76  162:iload           11
	//*  77  164:isub            
	//*  78  165:iconst_2        
	//*  79  166:icmplt          772
	//*  80  169:aload_2         
	//*  81  170:iload           11
	//*  82  172:invokeinterface #97  <Method Entry ILineDataSet.getEntryForIndex(int)>
	//*  83  177:astore          17
	//*  84  179:aload_2         
	//*  85  180:iload           11
	//*  86  182:iconst_1        
	//*  87  183:iadd            
	//*  88  184:invokeinterface #97  <Method Entry ILineDataSet.getEntryForIndex(int)>
	//*  89  189:astore          18
	//*  90  191:aload_0         
	//*  91  192:getfield        #41  <Field Path cubicPath>
	//*  92  195:aload           17
	//*  93  197:invokevirtual   #103 <Method int Entry.getXIndex()>
	//*  94  200:i2f             
	//*  95  201:aload           17
	//*  96  203:invokevirtual   #110 <Method float Entry.getVal()>
	//*  97  206:fload_3         
	//*  98  207:fmul            
	//*  99  208:invokevirtual   #107 <Method void Path.moveTo(float, float)>
	//* 100  211:aload           17
	//* 101  213:invokevirtual   #103 <Method int Entry.getXIndex()>
	//* 102  216:aload           17
	//* 103  218:invokevirtual   #103 <Method int Entry.getXIndex()>
	//* 104  221:isub            
	//* 105  222:i2f             
	//* 106  223:fstore          5
	//* 107  225:aload           17
	//* 108  227:invokevirtual   #110 <Method float Entry.getVal()>
	//* 109  230:fstore          6
	//* 110  232:aload           17
	//* 111  234:invokevirtual   #110 <Method float Entry.getVal()>
	//* 112  237:fstore          7
	//* 113  239:aload           18
	//* 114  241:invokevirtual   #103 <Method int Entry.getXIndex()>
	//* 115  244:aload           17
	//* 116  246:invokevirtual   #103 <Method int Entry.getXIndex()>
	//* 117  249:isub            
	//* 118  250:i2f             
	//* 119  251:fstore          8
	//* 120  253:aload           18
	//* 121  255:invokevirtual   #110 <Method float Entry.getVal()>
	//* 122  258:fstore          9
	//* 123  260:aload           17
	//* 124  262:invokevirtual   #110 <Method float Entry.getVal()>
	//* 125  265:fstore          10
	//* 126  267:aload_0         
	//* 127  268:getfield        #41  <Field Path cubicPath>
	//* 128  271:aload           17
	//* 129  273:invokevirtual   #103 <Method int Entry.getXIndex()>
	//* 130  276:i2f             
	//* 131  277:fload           5
	//* 132  279:fload           4
	//* 133  281:fmul            
	//* 134  282:fadd            
	//* 135  283:aload           17
	//* 136  285:invokevirtual   #110 <Method float Entry.getVal()>
	//* 137  288:fload           6
	//* 138  290:fload           7
	//* 139  292:fsub            
	//* 140  293:fload           4
	//* 141  295:fmul            
	//* 142  296:fadd            
	//* 143  297:fload_3         
	//* 144  298:fmul            
	//* 145  299:aload           17
	//* 146  301:invokevirtual   #103 <Method int Entry.getXIndex()>
	//* 147  304:i2f             
	//* 148  305:fload           8
	//* 149  307:fload           4
	//* 150  309:fmul            
	//* 151  310:fsub            
	//* 152  311:aload           17
	//* 153  313:invokevirtual   #110 <Method float Entry.getVal()>
	//* 154  316:fload           9
	//* 155  318:fload           10
	//* 156  320:fsub            
	//* 157  321:fload           4
	//* 158  323:fmul            
	//* 159  324:fsub            
	//* 160  325:fload_3         
	//* 161  326:fmul            
	//* 162  327:aload           17
	//* 163  329:invokevirtual   #103 <Method int Entry.getXIndex()>
	//* 164  332:i2f             
	//* 165  333:aload           17
	//* 166  335:invokevirtual   #110 <Method float Entry.getVal()>
	//* 167  338:fload_3         
	//* 168  339:fmul            
	//* 169  340:invokevirtual   #274 <Method void Path.cubicTo(float, float, float, float, float, float)>
	//* 170  343:iload           11
	//* 171  345:iconst_1        
	//* 172  346:iadd            
	//* 173  347:istore          11
	//* 174  349:iload           14
	//* 175  351:iload           13
	//* 176  353:iconst_1        
	//* 177  354:isub            
	//* 178  355:invokestatic    #126 <Method int Math.min(int, int)>
	//* 179  358:istore          15
	//* 180  360:iload           11
	//* 181  362:iload           15
	//* 182  364:icmpge          585
	//* 183  367:iload           11
	//* 184  369:iconst_1        
	//* 185  370:icmpne          576
	//* 186  373:iconst_0        
	//* 187  374:istore          12
	//* 188  376:aload_2         
	//* 189  377:iload           12
	//* 190  379:invokeinterface #97  <Method Entry ILineDataSet.getEntryForIndex(int)>
	//* 191  384:astore          17
	//* 192  386:aload_2         
	//* 193  387:iload           11
	//* 194  389:iconst_1        
	//* 195  390:isub            
	//* 196  391:invokeinterface #97  <Method Entry ILineDataSet.getEntryForIndex(int)>
	//* 197  396:astore          18
	//* 198  398:aload_2         
	//* 199  399:iload           11
	//* 200  401:invokeinterface #97  <Method Entry ILineDataSet.getEntryForIndex(int)>
	//* 201  406:astore          19
	//* 202  408:aload_2         
	//* 203  409:iload           11
	//* 204  411:iconst_1        
	//* 205  412:iadd            
	//* 206  413:invokeinterface #97  <Method Entry ILineDataSet.getEntryForIndex(int)>
	//* 207  418:astore          20
	//* 208  420:aload           19
	//* 209  422:invokevirtual   #103 <Method int Entry.getXIndex()>
	//* 210  425:aload           17
	//* 211  427:invokevirtual   #103 <Method int Entry.getXIndex()>
	//* 212  430:isub            
	//* 213  431:i2f             
	//* 214  432:fstore          5
	//* 215  434:aload           19
	//* 216  436:invokevirtual   #110 <Method float Entry.getVal()>
	//* 217  439:fstore          6
	//* 218  441:aload           17
	//* 219  443:invokevirtual   #110 <Method float Entry.getVal()>
	//* 220  446:fstore          7
	//* 221  448:aload           20
	//* 222  450:invokevirtual   #103 <Method int Entry.getXIndex()>
	//* 223  453:aload           18
	//* 224  455:invokevirtual   #103 <Method int Entry.getXIndex()>
	//* 225  458:isub            
	//* 226  459:i2f             
	//* 227  460:fstore          8
	//* 228  462:aload           20
	//* 229  464:invokevirtual   #110 <Method float Entry.getVal()>
	//* 230  467:fstore          9
	//* 231  469:aload           18
	//* 232  471:invokevirtual   #110 <Method float Entry.getVal()>
	//* 233  474:fstore          10
	//* 234  476:aload_0         
	//* 235  477:getfield        #41  <Field Path cubicPath>
	//* 236  480:aload           18
	//* 237  482:invokevirtual   #103 <Method int Entry.getXIndex()>
	//* 238  485:i2f             
	//* 239  486:fload           5
	//* 240  488:fload           4
	//* 241  490:fmul            
	//* 242  491:fadd            
	//* 243  492:aload           18
	//* 244  494:invokevirtual   #110 <Method float Entry.getVal()>
	//* 245  497:fload           6
	//* 246  499:fload           7
	//* 247  501:fsub            
	//* 248  502:fload           4
	//* 249  504:fmul            
	//* 250  505:fadd            
	//* 251  506:fload_3         
	//* 252  507:fmul            
	//* 253  508:aload           19
	//* 254  510:invokevirtual   #103 <Method int Entry.getXIndex()>
	//* 255  513:i2f             
	//* 256  514:fload           8
	//* 257  516:fload           4
	//* 258  518:fmul            
	//* 259  519:fsub            
	//* 260  520:aload           19
	//* 261  522:invokevirtual   #110 <Method float Entry.getVal()>
	//* 262  525:fload           9
	//* 263  527:fload           10
	//* 264  529:fsub            
	//* 265  530:fload           4
	//* 266  532:fmul            
	//* 267  533:fsub            
	//* 268  534:fload_3         
	//* 269  535:fmul            
	//* 270  536:aload           19
	//* 271  538:invokevirtual   #103 <Method int Entry.getXIndex()>
	//* 272  541:i2f             
	//* 273  542:aload           19
	//* 274  544:invokevirtual   #110 <Method float Entry.getVal()>
	//* 275  547:fload_3         
	//* 276  548:fmul            
	//* 277  549:invokevirtual   #274 <Method void Path.cubicTo(float, float, float, float, float, float)>
	//* 278  552:iload           11
	//* 279  554:iconst_1        
	//* 280  555:iadd            
	//* 281  556:istore          11
	//* 282  558:goto            360
			i = mMinX;
	//  283  561:aload_0         
	//  284  562:getfield        #180 <Field int mMinX>
	//  285  565:istore          11
		entry = ilinedataset.getEntryForXIndex(i, com.github.mikephil.charting.data.DataSet.Rounding.DOWN);
		entry1 = ilinedataset.getEntryForXIndex(mMaxX, com.github.mikephil.charting.data.DataSet.Rounding.UP);
		if(entry == entry1)
			i = 1;
		else
	//* 286  567:goto            34
			i = 0;
	//  287  570:iconst_0        
	//  288  571:istore          11
		i = Math.max(ilinedataset.getEntryIndex(entry) - i - 1, 0);
		k = Math.min(ilinedataset.getEntryIndex(entry1) + 1, i1);
		f2 = mAnimator.getPhaseX();
		f = mAnimator.getPhaseY();
		f1 = ilinedataset.getCubicIntensity();
		cubicPath.reset();
		j1 = (int)Math.ceil((float)(k - i) * f2 + (float)i);
		if(j1 - i >= 2)
		{
			Entry entry2 = ilinedataset.getEntryForIndex(i);
			Entry entry5 = ilinedataset.getEntryForIndex(i + 1);
			cubicPath.moveTo(entry2.getXIndex(), entry2.getVal() * f);
			float f3 = entry2.getXIndex() - entry2.getXIndex();
			float f6 = entry2.getVal();
			float f9 = entry2.getVal();
			float f12 = entry5.getXIndex() - entry2.getXIndex();
			float f15 = entry5.getVal();
			float f18 = entry2.getVal();
			cubicPath.cubicTo((float)entry2.getXIndex() + f3 * f1, (entry2.getVal() + (f6 - f9) * f1) * f, (float)entry2.getXIndex() - f12 * f1, (entry2.getVal() - (f15 - f18) * f1) * f, entry2.getXIndex(), entry2.getVal() * f);
			i++;
			int k1 = Math.min(j1, i1 - 1);
			while(i < k1) 
			{
				float f4;
				float f7;
				float f10;
				float f13;
				float f16;
				float f19;
				int l;
				Entry entry3;
				Entry entry6;
				Entry entry8;
				Entry entry10;
				if(i == 1)
					l = 0;
				else
	//* 289  573:goto            72
					l = i - 2;
	//  290  576:iload           11
	//  291  578:iconst_2        
	//  292  579:isub            
	//  293  580:istore          12
				entry3 = ilinedataset.getEntryForIndex(l);
				entry6 = ilinedataset.getEntryForIndex(i - 1);
				entry8 = ilinedataset.getEntryForIndex(i);
				entry10 = ilinedataset.getEntryForIndex(i + 1);
				f4 = entry8.getXIndex() - entry3.getXIndex();
				f7 = entry8.getVal();
				f10 = entry3.getVal();
				f13 = entry10.getXIndex() - entry6.getXIndex();
				f16 = entry10.getVal();
				f19 = entry6.getVal();
				cubicPath.cubicTo((float)entry6.getXIndex() + f4 * f1, (entry6.getVal() + (f7 - f10) * f1) * f, (float)entry8.getXIndex() - f13 * f1, (entry8.getVal() - (f16 - f19) * f1) * f, entry8.getXIndex(), entry8.getVal() * f);
				i++;
			}
	//* 294  582:goto            376
			if(j1 > i1 - 1)
	//* 295  585:iload           14
	//* 296  587:iload           13
	//* 297  589:iconst_1        
	//* 298  590:isub            
	//* 299  591:icmple          772
			{
				float f5;
				float f8;
				float f11;
				float f14;
				float f17;
				float f20;
				int j;
				Entry entry4;
				Entry entry7;
				Entry entry9;
				if(i1 >= 3)
	//* 300  594:iload           13
	//* 301  596:iconst_3        
	//* 302  597:icmplt          882
					j = i1 - 3;
	//  303  600:iload           13
	//  304  602:iconst_3        
	//  305  603:isub            
	//  306  604:istore          11
				else
	//* 307  606:aload_2         
	//* 308  607:iload           11
	//* 309  609:invokeinterface #97  <Method Entry ILineDataSet.getEntryForIndex(int)>
	//* 310  614:astore          17
	//* 311  616:aload_2         
	//* 312  617:iload           13
	//* 313  619:iconst_2        
	//* 314  620:isub            
	//* 315  621:invokeinterface #97  <Method Entry ILineDataSet.getEntryForIndex(int)>
	//* 316  626:astore          18
	//* 317  628:aload_2         
	//* 318  629:iload           13
	//* 319  631:iconst_1        
	//* 320  632:isub            
	//* 321  633:invokeinterface #97  <Method Entry ILineDataSet.getEntryForIndex(int)>
	//* 322  638:astore          19
	//* 323  640:aload           19
	//* 324  642:invokevirtual   #103 <Method int Entry.getXIndex()>
	//* 325  645:aload           17
	//* 326  647:invokevirtual   #103 <Method int Entry.getXIndex()>
	//* 327  650:isub            
	//* 328  651:i2f             
	//* 329  652:fstore          5
	//* 330  654:aload           19
	//* 331  656:invokevirtual   #110 <Method float Entry.getVal()>
	//* 332  659:fstore          6
	//* 333  661:aload           17
	//* 334  663:invokevirtual   #110 <Method float Entry.getVal()>
	//* 335  666:fstore          7
	//* 336  668:aload           19
	//* 337  670:invokevirtual   #103 <Method int Entry.getXIndex()>
	//* 338  673:aload           18
	//* 339  675:invokevirtual   #103 <Method int Entry.getXIndex()>
	//* 340  678:isub            
	//* 341  679:i2f             
	//* 342  680:fstore          8
	//* 343  682:aload           19
	//* 344  684:invokevirtual   #110 <Method float Entry.getVal()>
	//* 345  687:fstore          9
	//* 346  689:aload           18
	//* 347  691:invokevirtual   #110 <Method float Entry.getVal()>
	//* 348  694:fstore          10
	//* 349  696:aload_0         
	//* 350  697:getfield        #41  <Field Path cubicPath>
	//* 351  700:aload           18
	//* 352  702:invokevirtual   #103 <Method int Entry.getXIndex()>
	//* 353  705:i2f             
	//* 354  706:fload           5
	//* 355  708:fload           4
	//* 356  710:fmul            
	//* 357  711:fadd            
	//* 358  712:aload           18
	//* 359  714:invokevirtual   #110 <Method float Entry.getVal()>
	//* 360  717:fload           6
	//* 361  719:fload           7
	//* 362  721:fsub            
	//* 363  722:fload           4
	//* 364  724:fmul            
	//* 365  725:fadd            
	//* 366  726:fload_3         
	//* 367  727:fmul            
	//* 368  728:aload           19
	//* 369  730:invokevirtual   #103 <Method int Entry.getXIndex()>
	//* 370  733:i2f             
	//* 371  734:fload           8
	//* 372  736:fload           4
	//* 373  738:fmul            
	//* 374  739:fsub            
	//* 375  740:aload           19
	//* 376  742:invokevirtual   #110 <Method float Entry.getVal()>
	//* 377  745:fload           9
	//* 378  747:fload           10
	//* 379  749:fsub            
	//* 380  750:fload           4
	//* 381  752:fmul            
	//* 382  753:fsub            
	//* 383  754:fload_3         
	//* 384  755:fmul            
	//* 385  756:aload           19
	//* 386  758:invokevirtual   #103 <Method int Entry.getXIndex()>
	//* 387  761:i2f             
	//* 388  762:aload           19
	//* 389  764:invokevirtual   #110 <Method float Entry.getVal()>
	//* 390  767:fload_3         
	//* 391  768:fmul            
	//* 392  769:invokevirtual   #274 <Method void Path.cubicTo(float, float, float, float, float, float)>
	//* 393  772:aload_2         
	//* 394  773:invokeinterface #277 <Method boolean ILineDataSet.isDrawFilledEnabled()>
	//* 395  778:ifeq            826
	//* 396  781:aload_0         
	//* 397  782:getfield        #43  <Field Path cubicFillPath>
	//* 398  785:invokevirtual   #270 <Method void Path.reset()>
	//* 399  788:aload_0         
	//* 400  789:getfield        #43  <Field Path cubicFillPath>
	//* 401  792:aload_0         
	//* 402  793:getfield        #41  <Field Path cubicPath>
	//* 403  796:invokevirtual   #281 <Method void Path.addPath(Path)>
	//* 404  799:aload_0         
	//* 405  800:aload_0         
	//* 406  801:getfield        #283 <Field Canvas mBitmapCanvas>
	//* 407  804:aload_2         
	//* 408  805:aload_0         
	//* 409  806:getfield        #43  <Field Path cubicFillPath>
	//* 410  809:aload_1         
	//* 411  810:aload           16
	//* 412  812:invokevirtual   #103 <Method int Entry.getXIndex()>
	//* 413  815:aload           16
	//* 414  817:invokevirtual   #103 <Method int Entry.getXIndex()>
	//* 415  820:iload           14
	//* 416  822:iadd            
	//* 417  823:invokevirtual   #287 <Method void drawCubicFill(Canvas, ILineDataSet, Path, Transformer, int, int)>
	//* 418  826:aload_0         
	//* 419  827:getfield        #137 <Field Paint mRenderPaint>
	//* 420  830:aload_2         
	//* 421  831:invokeinterface #288 <Method int ILineDataSet.getColor()>
	//* 422  836:invokevirtual   #65  <Method void Paint.setColor(int)>
	//* 423  839:aload_0         
	//* 424  840:getfield        #137 <Field Paint mRenderPaint>
	//* 425  843:getstatic       #291 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//* 426  846:invokevirtual   #62  <Method void Paint.setStyle(android.graphics.Paint$Style)>
	//* 427  849:aload_1         
	//* 428  850:aload_0         
	//* 429  851:getfield        #41  <Field Path cubicPath>
	//* 430  854:invokevirtual   #294 <Method void Transformer.pathValueToPixel(Path)>
	//* 431  857:aload_0         
	//* 432  858:getfield        #283 <Field Canvas mBitmapCanvas>
	//* 433  861:aload_0         
	//* 434  862:getfield        #41  <Field Path cubicPath>
	//* 435  865:aload_0         
	//* 436  866:getfield        #137 <Field Paint mRenderPaint>
	//* 437  869:invokevirtual   #298 <Method void Canvas.drawPath(Path, Paint)>
	//* 438  872:aload_0         
	//* 439  873:getfield        #137 <Field Paint mRenderPaint>
	//* 440  876:aconst_null     
	//* 441  877:invokevirtual   #302 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//* 442  880:pop             
	//* 443  881:return          
					j = i1 - 2;
	//  444  882:iload           13
	//  445  884:iconst_2        
	//  446  885:isub            
	//  447  886:istore          11
				entry4 = ilinedataset.getEntryForIndex(j);
				entry7 = ilinedataset.getEntryForIndex(i1 - 2);
				entry9 = ilinedataset.getEntryForIndex(i1 - 1);
				f5 = entry9.getXIndex() - entry4.getXIndex();
				f8 = entry9.getVal();
				f11 = entry4.getVal();
				f14 = entry9.getXIndex() - entry7.getXIndex();
				f17 = entry9.getVal();
				f20 = entry7.getVal();
				cubicPath.cubicTo((float)entry7.getXIndex() + f5 * f1, (entry7.getVal() + (f8 - f11) * f1) * f, (float)entry9.getXIndex() - f14 * f1, (entry9.getVal() - (f17 - f20) * f1) * f, entry9.getXIndex(), entry9.getVal() * f);
			}
		}
		if(ilinedataset.isDrawFilledEnabled())
		{
			cubicFillPath.reset();
			cubicFillPath.addPath(cubicPath);
			drawCubicFill(mBitmapCanvas, ilinedataset, cubicFillPath, ((Transformer) (canvas)), entry.getXIndex(), entry.getXIndex() + j1);
		}
		mRenderPaint.setColor(ilinedataset.getColor());
		mRenderPaint.setStyle(android.graphics.Paint.Style.STROKE);
		((Transformer) (canvas)).pathValueToPixel(cubicPath);
		mBitmapCanvas.drawPath(cubicPath, mRenderPaint);
		mRenderPaint.setPathEffect(((android.graphics.PathEffect) (null)));
	//* 448  888:goto            606
	}

	protected void drawCubicFill(Canvas canvas, ILineDataSet ilinedataset, Path path, Transformer transformer, int i, int j)
	{
		float f1 = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore          8
		if(j - i <= 1)
	//*   2    3:iload           6
	//*   3    5:iload           5
	//*   4    7:isub            
	//*   5    8:iconst_1        
	//*   6    9:icmpgt          13
			return;
	//    7   12:return          
		float f2 = ilinedataset.getFillFormatter().getFillLinePosition(ilinedataset, mChart);
	//    8   13:aload_2         
	//    9   14:invokeinterface #74  <Method FillFormatter ILineDataSet.getFillFormatter()>
	//   10   19:aload_2         
	//   11   20:aload_0         
	//   12   21:getfield        #45  <Field LineDataProvider mChart>
	//   13   24:invokeinterface #80  <Method float FillFormatter.getFillLinePosition(ILineDataSet, LineDataProvider)>
	//   14   29:fstore          9
		Entry entry = ilinedataset.getEntryForIndex(j - 1);
	//   15   31:aload_2         
	//   16   32:iload           6
	//   17   34:iconst_1        
	//   18   35:isub            
	//   19   36:invokeinterface #97  <Method Entry ILineDataSet.getEntryForIndex(int)>
	//   20   41:astore          10
		Entry entry1 = ilinedataset.getEntryForIndex(i);
	//   21   43:aload_2         
	//   22   44:iload           5
	//   23   46:invokeinterface #97  <Method Entry ILineDataSet.getEntryForIndex(int)>
	//   24   51:astore          11
		float f;
		if(entry == null)
	//*  25   53:aload           10
	//*  26   55:ifnonnull       114
			f = 0.0F;
	//   27   58:fconst_0        
	//   28   59:fstore          7
		else
	//*  29   61:aload           11
	//*  30   63:ifnonnull       125
	//*  31   66:aload_3         
	//*  32   67:fload           7
	//*  33   69:fload           9
	//*  34   71:invokevirtual   #113 <Method void Path.lineTo(float, float)>
	//*  35   74:aload_3         
	//*  36   75:fload           8
	//*  37   77:fload           9
	//*  38   79:invokevirtual   #113 <Method void Path.lineTo(float, float)>
	//*  39   82:aload_3         
	//*  40   83:invokevirtual   #132 <Method void Path.close()>
	//*  41   86:aload           4
	//*  42   88:aload_3         
	//*  43   89:invokevirtual   #294 <Method void Transformer.pathValueToPixel(Path)>
	//*  44   92:aload_2         
	//*  45   93:invokeinterface #306 <Method android.graphics.drawable.Drawable ILineDataSet.getFillDrawable()>
	//*  46   98:astore          4
	//*  47  100:aload           4
	//*  48  102:ifnull          136
	//*  49  105:aload_0         
	//*  50  106:aload_1         
	//*  51  107:aload_3         
	//*  52  108:aload           4
	//*  53  110:invokevirtual   #310 <Method void drawFilledPath(Canvas, Path, android.graphics.drawable.Drawable)>
	//*  54  113:return          
			f = entry.getXIndex();
	//   55  114:aload           10
	//   56  116:invokevirtual   #103 <Method int Entry.getXIndex()>
	//   57  119:i2f             
	//   58  120:fstore          7
		if(entry1 != null)
	//*  59  122:goto            61
			f1 = entry1.getXIndex();
	//   60  125:aload           11
	//   61  127:invokevirtual   #103 <Method int Entry.getXIndex()>
	//   62  130:i2f             
	//   63  131:fstore          8
		path.lineTo(f, f2);
		path.lineTo(f1, f2);
		path.close();
		transformer.pathValueToPixel(path);
		transformer = ((Transformer) (ilinedataset.getFillDrawable()));
		if(transformer != null)
		{
			drawFilledPath(canvas, path, ((android.graphics.drawable.Drawable) (transformer)));
			return;
		} else
	//*  64  133:goto            66
		{
			drawFilledPath(canvas, path, ilinedataset.getFillColor(), ilinedataset.getFillAlpha());
	//   65  136:aload_0         
	//   66  137:aload_1         
	//   67  138:aload_3         
	//   68  139:aload_2         
	//   69  140:invokeinterface #313 <Method int ILineDataSet.getFillColor()>
	//   70  145:aload_2         
	//   71  146:invokeinterface #316 <Method int ILineDataSet.getFillAlpha()>
	//   72  151:invokevirtual   #319 <Method void drawFilledPath(Canvas, Path, int, int)>
			return;
	//   73  154:return          
		}
	}

	public void drawData(Canvas canvas)
	{
label0:
		{
			int i = (int)mViewPortHandler.getChartWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #234 <Field ViewPortHandler mViewPortHandler>
	//    2    4:invokevirtual   #323 <Method float ViewPortHandler.getChartWidth()>
	//    3    7:f2i             
	//    4    8:istore_2        
			int j = (int)mViewPortHandler.getChartHeight();
	//    5    9:aload_0         
	//    6   10:getfield        #234 <Field ViewPortHandler mViewPortHandler>
	//    7   13:invokevirtual   #326 <Method float ViewPortHandler.getChartHeight()>
	//    8   16:f2i             
	//    9   17:istore_3        
			if(mDrawBitmap == null || ((Bitmap)mDrawBitmap.get()).getWidth() != i || ((Bitmap)mDrawBitmap.get()).getHeight() != j)
	//*  10   18:aload_0         
	//*  11   19:getfield        #328 <Field WeakReference mDrawBitmap>
	//*  12   22:ifnull          59
	//*  13   25:aload_0         
	//*  14   26:getfield        #328 <Field WeakReference mDrawBitmap>
	//*  15   29:invokevirtual   #333 <Method Object WeakReference.get()>
	//*  16   32:checkcast       #335 <Class Bitmap>
	//*  17   35:invokevirtual   #338 <Method int Bitmap.getWidth()>
	//*  18   38:iload_2         
	//*  19   39:icmpne          59
	//*  20   42:aload_0         
	//*  21   43:getfield        #328 <Field WeakReference mDrawBitmap>
	//*  22   46:invokevirtual   #333 <Method Object WeakReference.get()>
	//*  23   49:checkcast       #335 <Class Bitmap>
	//*  24   52:invokevirtual   #341 <Method int Bitmap.getHeight()>
	//*  25   55:iload_3         
	//*  26   56:icmpeq          108
			{
				if(i <= 0 || j <= 0)
					break label0;
	//   27   59:iload_2         
	//   28   60:ifle            213
	//   29   63:iload_3         
	//   30   64:ifle            213
				mDrawBitmap = new WeakReference(((Object) (Bitmap.createBitmap(i, j, mBitmapConfig))));
	//   31   67:aload_0         
	//   32   68:new             #330 <Class WeakReference>
	//   33   71:dup             
	//   34   72:iload_2         
	//   35   73:iload_3         
	//   36   74:aload_0         
	//   37   75:getfield        #34  <Field android.graphics.Bitmap$Config mBitmapConfig>
	//   38   78:invokestatic    #345 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   39   81:invokespecial   #348 <Method void WeakReference(Object)>
	//   40   84:putfield        #328 <Field WeakReference mDrawBitmap>
				mBitmapCanvas = new Canvas((Bitmap)mDrawBitmap.get());
	//   41   87:aload_0         
	//   42   88:new             #252 <Class Canvas>
	//   43   91:dup             
	//   44   92:aload_0         
	//   45   93:getfield        #328 <Field WeakReference mDrawBitmap>
	//   46   96:invokevirtual   #333 <Method Object WeakReference.get()>
	//   47   99:checkcast       #335 <Class Bitmap>
	//   48  102:invokespecial   #351 <Method void Canvas(Bitmap)>
	//   49  105:putfield        #283 <Field Canvas mBitmapCanvas>
			}
			((Bitmap)mDrawBitmap.get()).eraseColor(0);
	//   50  108:aload_0         
	//   51  109:getfield        #328 <Field WeakReference mDrawBitmap>
	//   52  112:invokevirtual   #333 <Method Object WeakReference.get()>
	//   53  115:checkcast       #335 <Class Bitmap>
	//   54  118:iconst_0        
	//   55  119:invokevirtual   #354 <Method void Bitmap.eraseColor(int)>
			Iterator iterator = mChart.getLineData().getDataSets().iterator();
	//   56  122:aload_0         
	//   57  123:getfield        #45  <Field LineDataProvider mChart>
	//   58  126:invokeinterface #143 <Method LineData LineDataProvider.getLineData()>
	//   59  131:invokevirtual   #149 <Method List LineData.getDataSets()>
	//   60  134:invokeinterface #358 <Method Iterator List.iterator()>
	//   61  139:astore          4
			do
			{
				if(!iterator.hasNext())
					break;
	//   62  141:aload           4
	//   63  143:invokeinterface #363 <Method boolean Iterator.hasNext()>
	//   64  148:ifeq            193
				ILineDataSet ilinedataset = (ILineDataSet)iterator.next();
	//   65  151:aload           4
	//   66  153:invokeinterface #366 <Method Object Iterator.next()>
	//   67  158:checkcast       #70  <Class ILineDataSet>
	//   68  161:astore          5
				if(ilinedataset.isVisible() && ilinedataset.getEntryCount() > 0)
	//*  69  163:aload           5
	//*  70  165:invokeinterface #162 <Method boolean ILineDataSet.isVisible()>
	//*  71  170:ifeq            141
	//*  72  173:aload           5
	//*  73  175:invokeinterface #122 <Method int ILineDataSet.getEntryCount()>
	//*  74  180:ifle            141
					drawDataSet(canvas, ilinedataset);
	//   75  183:aload_0         
	//   76  184:aload_1         
	//   77  185:aload           5
	//   78  187:invokevirtual   #369 <Method void drawDataSet(Canvas, ILineDataSet)>
			} while(true);
	//   79  190:goto            141
			canvas.drawBitmap((Bitmap)mDrawBitmap.get(), 0.0F, 0.0F, mRenderPaint);
	//   80  193:aload_1         
	//   81  194:aload_0         
	//   82  195:getfield        #328 <Field WeakReference mDrawBitmap>
	//   83  198:invokevirtual   #333 <Method Object WeakReference.get()>
	//   84  201:checkcast       #335 <Class Bitmap>
	//   85  204:fconst_0        
	//   86  205:fconst_0        
	//   87  206:aload_0         
	//   88  207:getfield        #137 <Field Paint mRenderPaint>
	//   89  210:invokevirtual   #373 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
		}
	//   90  213:return          
	}

	protected void drawDataSet(Canvas canvas, ILineDataSet ilinedataset)
	{
		if(ilinedataset.getEntryCount() < 1)
	//*   0    0:aload_2         
	//*   1    1:invokeinterface #122 <Method int ILineDataSet.getEntryCount()>
	//*   2    6:iconst_1        
	//*   3    7:icmpge          11
			return;
	//    4   10:return          
		mRenderPaint.setStrokeWidth(ilinedataset.getLineWidth());
	//    5   11:aload_0         
	//    6   12:getfield        #137 <Field Paint mRenderPaint>
	//    7   15:aload_2         
	//    8   16:invokeinterface #376 <Method float ILineDataSet.getLineWidth()>
	//    9   21:invokevirtual   #380 <Method void Paint.setStrokeWidth(float)>
		mRenderPaint.setPathEffect(((android.graphics.PathEffect) (ilinedataset.getDashPathEffect())));
	//   10   24:aload_0         
	//   11   25:getfield        #137 <Field Paint mRenderPaint>
	//   12   28:aload_2         
	//   13   29:invokeinterface #384 <Method android.graphics.DashPathEffect ILineDataSet.getDashPathEffect()>
	//   14   34:invokevirtual   #302 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//   15   37:pop             
		if(ilinedataset.isDrawCubicEnabled())
	//*  16   38:aload_2         
	//*  17   39:invokeinterface #387 <Method boolean ILineDataSet.isDrawCubicEnabled()>
	//*  18   44:ifeq            63
			drawCubic(canvas, ilinedataset);
	//   19   47:aload_0         
	//   20   48:aload_1         
	//   21   49:aload_2         
	//   22   50:invokevirtual   #389 <Method void drawCubic(Canvas, ILineDataSet)>
		else
	//*  23   53:aload_0         
	//*  24   54:getfield        #137 <Field Paint mRenderPaint>
	//*  25   57:aconst_null     
	//*  26   58:invokevirtual   #302 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//*  27   61:pop             
	//*  28   62:return          
			drawLinear(canvas, ilinedataset);
	//   29   63:aload_0         
	//   30   64:aload_1         
	//   31   65:aload_2         
	//   32   66:invokevirtual   #392 <Method void drawLinear(Canvas, ILineDataSet)>
		mRenderPaint.setPathEffect(((android.graphics.PathEffect) (null)));
	//*  33   69:goto            53
	}

	public void drawExtras(Canvas canvas)
	{
		drawCircles(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #395 <Method void drawCircles(Canvas)>
	//    3    5:return          
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
	//*   5    7:icmpge          171
		{
			ILineDataSet ilinedataset = (ILineDataSet)mChart.getLineData().getDataSetByIndex(ahighlight[i].getDataSetIndex());
	//    6   10:aload_0         
	//    7   11:getfield        #45  <Field LineDataProvider mChart>
	//    8   14:invokeinterface #143 <Method LineData LineDataProvider.getLineData()>
	//    9   19:aload_2         
	//   10   20:iload           5
	//   11   22:aaload          
	//   12   23:invokevirtual   #402 <Method int Highlight.getDataSetIndex()>
	//   13   26:invokevirtual   #406 <Method com.github.mikephil.charting.interfaces.datasets.IDataSet LineData.getDataSetByIndex(int)>
	//   14   29:checkcast       #70  <Class ILineDataSet>
	//   15   32:astore          7
			if(ilinedataset != null && ilinedataset.isHighlightEnabled())
	//*  16   34:aload           7
	//*  17   36:ifnull          49
	//*  18   39:aload           7
	//*  19   41:invokeinterface #409 <Method boolean ILineDataSet.isHighlightEnabled()>
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
	//   29   62:invokevirtual   #410 <Method int Highlight.getXIndex()>
	//   30   65:istore          6
				if((float)j <= mChart.getXChartMax() * mAnimator.getPhaseX())
	//*  31   67:iload           6
	//*  32   69:i2f             
	//*  33   70:aload_0         
	//*  34   71:getfield        #45  <Field LineDataProvider mChart>
	//*  35   74:invokeinterface #413 <Method float LineDataProvider.getXChartMax()>
	//*  36   79:aload_0         
	//*  37   80:getfield        #84  <Field ChartAnimator mAnimator>
	//*  38   83:invokevirtual   #90  <Method float ChartAnimator.getPhaseX()>
	//*  39   86:fmul            
	//*  40   87:fcmpl           
	//*  41   88:ifgt            49
				{
					float f = ilinedataset.getYValForXIndex(j);
	//   42   91:aload           7
	//   43   93:iload           6
	//   44   95:invokeinterface #417 <Method float ILineDataSet.getYValForXIndex(int)>
	//   45  100:fstore_3        
					if(f != (0.0F / 0.0F))
	//*  46  101:fload_3         
	//*  47  102:ldc2            #418 <Float (0.0F / 0.0F)>
	//*  48  105:fcmpl           
	//*  49  106:ifeq            49
					{
						float f1 = mAnimator.getPhaseY();
	//   50  109:aload_0         
	//   51  110:getfield        #84  <Field ChartAnimator mAnimator>
	//   52  113:invokevirtual   #93  <Method float ChartAnimator.getPhaseY()>
	//   53  116:fstore          4
						float af[] = new float[2];
	//   54  118:iconst_2        
	//   55  119:newarray        float[]
	//   56  121:astore          8
						af[0] = j;
	//   57  123:aload           8
	//   58  125:iconst_0        
	//   59  126:iload           6
	//   60  128:i2f             
	//   61  129:fastore         
						af[1] = f * f1;
	//   62  130:aload           8
	//   63  132:iconst_1        
	//   64  133:fload_3         
	//   65  134:fload           4
	//   66  136:fmul            
	//   67  137:fastore         
						mChart.getTransformer(ilinedataset.getAxisDependency()).pointValuesToPixel(af);
	//   68  138:aload_0         
	//   69  139:getfield        #45  <Field LineDataProvider mChart>
	//   70  142:aload           7
	//   71  144:invokeinterface #172 <Method com.github.mikephil.charting.components.YAxis$AxisDependency ILineDataSet.getAxisDependency()>
	//   72  149:invokeinterface #176 <Method Transformer LineDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   73  154:aload           8
	//   74  156:invokevirtual   #227 <Method void Transformer.pointValuesToPixel(float[])>
						drawHighlightLines(canvas, af, ((com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet) (ilinedataset)));
	//   75  159:aload_0         
	//   76  160:aload_1         
	//   77  161:aload           8
	//   78  163:aload           7
	//   79  165:invokevirtual   #422 <Method void drawHighlightLines(Canvas, float[], com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet)>
					}
				}
			}
			i++;
		}
	//*  80  168:goto            49
	//   81  171:return          
	}

	protected void drawLinear(Canvas canvas, ILineDataSet ilinedataset)
	{
		int i;
		int l;
		int j1;
		Canvas canvas1;
		Object obj;
		int j = ilinedataset.getEntryCount();
	//    0    0:aload_2         
	//    1    1:invokeinterface #122 <Method int ILineDataSet.getEntryCount()>
	//    2    6:istore          6
		int k = mChart.getLineData().getIndexOfDataSet(((com.github.mikephil.charting.interfaces.datasets.IDataSet) (ilinedataset)));
	//    3    8:aload_0         
	//    4    9:getfield        #45  <Field LineDataProvider mChart>
	//    5   12:invokeinterface #143 <Method LineData LineDataProvider.getLineData()>
	//    6   17:aload_2         
	//    7   18:invokevirtual   #426 <Method int LineData.getIndexOfDataSet(com.github.mikephil.charting.interfaces.datasets.IDataSet)>
	//    8   21:istore          7
		Transformer transformer = mChart.getTransformer(ilinedataset.getAxisDependency());
	//    9   23:aload_0         
	//   10   24:getfield        #45  <Field LineDataProvider mChart>
	//   11   27:aload_2         
	//   12   28:invokeinterface #172 <Method com.github.mikephil.charting.components.YAxis$AxisDependency ILineDataSet.getAxisDependency()>
	//   13   33:invokeinterface #176 <Method Transformer LineDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   14   38:astore          12
		float f = mAnimator.getPhaseX();
	//   15   40:aload_0         
	//   16   41:getfield        #84  <Field ChartAnimator mAnimator>
	//   17   44:invokevirtual   #90  <Method float ChartAnimator.getPhaseX()>
	//   18   47:fstore_3        
		float f1 = mAnimator.getPhaseY();
	//   19   48:aload_0         
	//   20   49:getfield        #84  <Field ChartAnimator mAnimator>
	//   21   52:invokevirtual   #93  <Method float ChartAnimator.getPhaseY()>
	//   22   55:fstore          4
		mRenderPaint.setStyle(android.graphics.Paint.Style.STROKE);
	//   23   57:aload_0         
	//   24   58:getfield        #137 <Field Paint mRenderPaint>
	//   25   61:getstatic       #291 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   26   64:invokevirtual   #62  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		int i1;
		Entry entry;
		if(ilinedataset.isDashedLineEnabled())
	//*  27   67:aload_2         
	//*  28   68:invokeinterface #429 <Method boolean ILineDataSet.isDashedLineEnabled()>
	//*  29   73:ifeq            288
			canvas1 = mBitmapCanvas;
	//   30   76:aload_0         
	//   31   77:getfield        #283 <Field Canvas mBitmapCanvas>
	//   32   80:astore          11
		else
	//*  33   82:aload_0         
	//*  34   83:getfield        #180 <Field int mMinX>
	//*  35   86:ifge            294
	//*  36   89:iconst_0        
	//*  37   90:istore          5
	//*  38   92:aload_2         
	//*  39   93:iload           5
	//*  40   95:getstatic       #186 <Field com.github.mikephil.charting.data.DataSet$Rounding com.github.mikephil.charting.data.DataSet$Rounding.DOWN>
	//*  41   98:invokeinterface #190 <Method Entry ILineDataSet.getEntryForXIndex(int, com.github.mikephil.charting.data.DataSet$Rounding)>
	//*  42  103:astore          13
	//*  43  105:aload_2         
	//*  44  106:aload_0         
	//*  45  107:getfield        #193 <Field int mMaxX>
	//*  46  110:getstatic       #196 <Field com.github.mikephil.charting.data.DataSet$Rounding com.github.mikephil.charting.data.DataSet$Rounding.UP>
	//*  47  113:invokeinterface #190 <Method Entry ILineDataSet.getEntryForXIndex(int, com.github.mikephil.charting.data.DataSet$Rounding)>
	//*  48  118:astore          14
	//*  49  120:aload_2         
	//*  50  121:aload           13
	//*  51  123:invokeinterface #200 <Method int ILineDataSet.getEntryIndex(Entry)>
	//*  52  128:iconst_0        
	//*  53  129:invokestatic    #129 <Method int Math.max(int, int)>
	//*  54  132:istore          8
	//*  55  134:aload_2         
	//*  56  135:aload           14
	//*  57  137:invokeinterface #200 <Method int ILineDataSet.getEntryIndex(Entry)>
	//*  58  142:iconst_1        
	//*  59  143:iadd            
	//*  60  144:iload           6
	//*  61  146:invokestatic    #126 <Method int Math.min(int, int)>
	//*  62  149:istore          9
	//*  63  151:iload           9
	//*  64  153:iload           8
	//*  65  155:isub            
	//*  66  156:iconst_4        
	//*  67  157:imul            
	//*  68  158:iconst_4        
	//*  69  159:isub            
	//*  70  160:istore          10
	//*  71  162:aload_0         
	//*  72  163:getfield        #431 <Field LineBuffer[] mLineBuffers>
	//*  73  166:iload           7
	//*  74  168:aaload          
	//*  75  169:astore          13
	//*  76  171:aload           13
	//*  77  173:fload_3         
	//*  78  174:fload           4
	//*  79  176:invokevirtual   #434 <Method void LineBuffer.setPhases(float, float)>
	//*  80  179:aload           13
	//*  81  181:iload           8
	//*  82  183:invokevirtual   #435 <Method void LineBuffer.limitFrom(int)>
	//*  83  186:aload           13
	//*  84  188:iload           9
	//*  85  190:invokevirtual   #436 <Method void LineBuffer.limitTo(int)>
	//*  86  193:aload           13
	//*  87  195:aload_2         
	//*  88  196:invokevirtual   #437 <Method void LineBuffer.feed(ILineDataSet)>
	//*  89  199:aload           12
	//*  90  201:aload           13
	//*  91  203:getfield        #438 <Field float[] LineBuffer.buffer>
	//*  92  206:invokevirtual   #227 <Method void Transformer.pointValuesToPixel(float[])>
	//*  93  209:aload_2         
	//*  94  210:invokeinterface #441 <Method List ILineDataSet.getColors()>
	//*  95  215:invokeinterface #154 <Method int List.size()>
	//*  96  220:iconst_1        
	//*  97  221:icmple          482
	//*  98  224:iconst_0        
	//*  99  225:istore          5
	//* 100  227:iload           5
	//* 101  229:iload           10
	//* 102  231:icmpge          252
	//* 103  234:aload_0         
	//* 104  235:getfield        #234 <Field ViewPortHandler mViewPortHandler>
	//* 105  238:aload           13
	//* 106  240:getfield        #438 <Field float[] LineBuffer.buffer>
	//* 107  243:iload           5
	//* 108  245:faload          
	//* 109  246:invokevirtual   #240 <Method boolean ViewPortHandler.isInBoundsRight(float)>
	//* 110  249:ifne            303
	//* 111  252:aload_0         
	//* 112  253:getfield        #137 <Field Paint mRenderPaint>
	//* 113  256:aconst_null     
	//* 114  257:invokevirtual   #302 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//* 115  260:pop             
	//* 116  261:aload_2         
	//* 117  262:invokeinterface #277 <Method boolean ILineDataSet.isDrawFilledEnabled()>
	//* 118  267:ifeq            287
	//* 119  270:iload           6
	//* 120  272:ifle            287
	//* 121  275:aload_0         
	//* 122  276:aload_1         
	//* 123  277:aload_2         
	//* 124  278:iload           8
	//* 125  280:iload           9
	//* 126  282:aload           12
	//* 127  284:invokevirtual   #445 <Method void drawLinearFill(Canvas, ILineDataSet, int, int, Transformer)>
	//* 128  287:return          
			canvas1 = canvas;
	//  129  288:aload_1         
	//  130  289:astore          11
		if(mMinX < 0)
			i = 0;
		else
	//* 131  291:goto            82
			i = mMinX;
	//  132  294:aload_0         
	//  133  295:getfield        #180 <Field int mMinX>
	//  134  298:istore          5
		obj = ((Object) (ilinedataset.getEntryForXIndex(i, com.github.mikephil.charting.data.DataSet.Rounding.DOWN)));
		entry = ilinedataset.getEntryForXIndex(mMaxX, com.github.mikephil.charting.data.DataSet.Rounding.UP);
		l = Math.max(ilinedataset.getEntryIndex(((Entry) (obj))), 0);
		i1 = Math.min(ilinedataset.getEntryIndex(entry) + 1, j);
		j1 = (i1 - l) * 4 - 4;
		obj = ((Object) (mLineBuffers[k]));
		((LineBuffer) (obj)).setPhases(f, f1);
		((LineBuffer) (obj)).limitFrom(l);
		((LineBuffer) (obj)).limitTo(i1);
		((LineBuffer) (obj)).feed(ilinedataset);
		transformer.pointValuesToPixel(((LineBuffer) (obj)).buffer);
		if(ilinedataset.getColors().size() <= 1)
			break MISSING_BLOCK_LABEL_482;
		i = 0;
_L3:
		if(i < j1 && mViewPortHandler.isInBoundsRight(((LineBuffer) (obj)).buffer[i])) goto _L2; else goto _L1
_L1:
		mRenderPaint.setPathEffect(((android.graphics.PathEffect) (null)));
		if(ilinedataset.isDrawFilledEnabled() && j > 0)
			drawLinearFill(canvas, ilinedataset, l, i1, transformer);
		return;
	//* 135  300:goto            92
_L2:
		if(mViewPortHandler.isInBoundsLeft(((LineBuffer) (obj)).buffer[i + 2]) && (mViewPortHandler.isInBoundsTop(((LineBuffer) (obj)).buffer[i + 1]) || mViewPortHandler.isInBoundsBottom(((LineBuffer) (obj)).buffer[i + 3])) && (mViewPortHandler.isInBoundsTop(((LineBuffer) (obj)).buffer[i + 1]) || mViewPortHandler.isInBoundsBottom(((LineBuffer) (obj)).buffer[i + 3])))
	//* 136  303:aload_0         
	//* 137  304:getfield        #234 <Field ViewPortHandler mViewPortHandler>
	//* 138  307:aload           13
	//* 139  309:getfield        #438 <Field float[] LineBuffer.buffer>
	//* 140  312:iload           5
	//* 141  314:iconst_2        
	//* 142  315:iadd            
	//* 143  316:faload          
	//* 144  317:invokevirtual   #243 <Method boolean ViewPortHandler.isInBoundsLeft(float)>
	//* 145  320:ifeq            403
	//* 146  323:aload_0         
	//* 147  324:getfield        #234 <Field ViewPortHandler mViewPortHandler>
	//* 148  327:aload           13
	//* 149  329:getfield        #438 <Field float[] LineBuffer.buffer>
	//* 150  332:iload           5
	//* 151  334:iconst_1        
	//* 152  335:iadd            
	//* 153  336:faload          
	//* 154  337:invokevirtual   #448 <Method boolean ViewPortHandler.isInBoundsTop(float)>
	//* 155  340:ifne            363
	//* 156  343:aload_0         
	//* 157  344:getfield        #234 <Field ViewPortHandler mViewPortHandler>
	//* 158  347:aload           13
	//* 159  349:getfield        #438 <Field float[] LineBuffer.buffer>
	//* 160  352:iload           5
	//* 161  354:iconst_3        
	//* 162  355:iadd            
	//* 163  356:faload          
	//* 164  357:invokevirtual   #451 <Method boolean ViewPortHandler.isInBoundsBottom(float)>
	//* 165  360:ifeq            403
	//* 166  363:aload_0         
	//* 167  364:getfield        #234 <Field ViewPortHandler mViewPortHandler>
	//* 168  367:aload           13
	//* 169  369:getfield        #438 <Field float[] LineBuffer.buffer>
	//* 170  372:iload           5
	//* 171  374:iconst_1        
	//* 172  375:iadd            
	//* 173  376:faload          
	//* 174  377:invokevirtual   #448 <Method boolean ViewPortHandler.isInBoundsTop(float)>
	//* 175  380:ifne            412
	//* 176  383:aload_0         
	//* 177  384:getfield        #234 <Field ViewPortHandler mViewPortHandler>
	//* 178  387:aload           13
	//* 179  389:getfield        #438 <Field float[] LineBuffer.buffer>
	//* 180  392:iload           5
	//* 181  394:iconst_3        
	//* 182  395:iadd            
	//* 183  396:faload          
	//* 184  397:invokevirtual   #451 <Method boolean ViewPortHandler.isInBoundsBottom(float)>
	//* 185  400:ifne            412
	//* 186  403:iload           5
	//* 187  405:iconst_4        
	//* 188  406:iadd            
	//* 189  407:istore          5
	//* 190  409:goto            227
		{
			mRenderPaint.setColor(ilinedataset.getColor(i / 4 + l));
	//  191  412:aload_0         
	//  192  413:getfield        #137 <Field Paint mRenderPaint>
	//  193  416:aload_2         
	//  194  417:iload           5
	//  195  419:iconst_4        
	//  196  420:idiv            
	//  197  421:iload           8
	//  198  423:iadd            
	//  199  424:invokeinterface #453 <Method int ILineDataSet.getColor(int)>
	//  200  429:invokevirtual   #65  <Method void Paint.setColor(int)>
			canvas1.drawLine(((LineBuffer) (obj)).buffer[i], ((LineBuffer) (obj)).buffer[i + 1], ((LineBuffer) (obj)).buffer[i + 2], ((LineBuffer) (obj)).buffer[i + 3], mRenderPaint);
	//  201  432:aload           11
	//  202  434:aload           13
	//  203  436:getfield        #438 <Field float[] LineBuffer.buffer>
	//  204  439:iload           5
	//  205  441:faload          
	//  206  442:aload           13
	//  207  444:getfield        #438 <Field float[] LineBuffer.buffer>
	//  208  447:iload           5
	//  209  449:iconst_1        
	//  210  450:iadd            
	//  211  451:faload          
	//  212  452:aload           13
	//  213  454:getfield        #438 <Field float[] LineBuffer.buffer>
	//  214  457:iload           5
	//  215  459:iconst_2        
	//  216  460:iadd            
	//  217  461:faload          
	//  218  462:aload           13
	//  219  464:getfield        #438 <Field float[] LineBuffer.buffer>
	//  220  467:iload           5
	//  221  469:iconst_3        
	//  222  470:iadd            
	//  223  471:faload          
	//  224  472:aload_0         
	//  225  473:getfield        #137 <Field Paint mRenderPaint>
	//  226  476:invokevirtual   #457 <Method void Canvas.drawLine(float, float, float, float, Paint)>
		}
		i += 4;
		  goto _L3
	//* 227  479:goto            403
		mRenderPaint.setColor(ilinedataset.getColor());
	//  228  482:aload_0         
	//  229  483:getfield        #137 <Field Paint mRenderPaint>
	//  230  486:aload_2         
	//  231  487:invokeinterface #288 <Method int ILineDataSet.getColor()>
	//  232  492:invokevirtual   #65  <Method void Paint.setColor(int)>
		canvas1.drawLines(((LineBuffer) (obj)).buffer, 0, j1, mRenderPaint);
	//  233  495:aload           11
	//  234  497:aload           13
	//  235  499:getfield        #438 <Field float[] LineBuffer.buffer>
	//  236  502:iconst_0        
	//  237  503:iload           10
	//  238  505:aload_0         
	//  239  506:getfield        #137 <Field Paint mRenderPaint>
	//  240  509:invokevirtual   #461 <Method void Canvas.drawLines(float[], int, int, Paint)>
		  goto _L1
	//* 241  512:goto            252
	}

	protected void drawLinearFill(Canvas canvas, ILineDataSet ilinedataset, int i, int j, Transformer transformer)
	{
		Path path = generateFilledPath(ilinedataset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:invokespecial   #463 <Method Path generateFilledPath(ILineDataSet, int, int)>
	//    5    8:astore          6
		transformer.pathValueToPixel(path);
	//    6   10:aload           5
	//    7   12:aload           6
	//    8   14:invokevirtual   #294 <Method void Transformer.pathValueToPixel(Path)>
		transformer = ((Transformer) (ilinedataset.getFillDrawable()));
	//    9   17:aload_2         
	//   10   18:invokeinterface #306 <Method android.graphics.drawable.Drawable ILineDataSet.getFillDrawable()>
	//   11   23:astore          5
		if(transformer != null)
	//*  12   25:aload           5
	//*  13   27:ifnull          40
		{
			drawFilledPath(canvas, path, ((android.graphics.drawable.Drawable) (transformer)));
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:aload           6
	//   17   34:aload           5
	//   18   36:invokevirtual   #310 <Method void drawFilledPath(Canvas, Path, android.graphics.drawable.Drawable)>
			return;
	//   19   39:return          
		} else
		{
			drawFilledPath(canvas, path, ilinedataset.getFillColor(), ilinedataset.getFillAlpha());
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:aload           6
	//   23   44:aload_2         
	//   24   45:invokeinterface #313 <Method int ILineDataSet.getFillColor()>
	//   25   50:aload_2         
	//   26   51:invokeinterface #316 <Method int ILineDataSet.getFillAlpha()>
	//   27   56:invokevirtual   #319 <Method void drawFilledPath(Canvas, Path, int, int)>
			return;
	//   28   59:return          
		}
	}

	public void drawValues(Canvas canvas)
	{
		int i;
		List list;
		if((float)mChart.getLineData().getYValCount() >= (float)mChart.getMaxVisibleCount() * mViewPortHandler.getScaleX())
			break MISSING_BLOCK_LABEL_407;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field LineDataProvider mChart>
	//    2    4:invokeinterface #143 <Method LineData LineDataProvider.getLineData()>
	//    3    9:invokevirtual   #467 <Method int LineData.getYValCount()>
	//    4   12:i2f             
	//    5   13:aload_0         
	//    6   14:getfield        #45  <Field LineDataProvider mChart>
	//    7   17:invokeinterface #470 <Method int LineDataProvider.getMaxVisibleCount()>
	//    8   22:i2f             
	//    9   23:aload_0         
	//   10   24:getfield        #234 <Field ViewPortHandler mViewPortHandler>
	//   11   27:invokevirtual   #473 <Method float ViewPortHandler.getScaleX()>
	//   12   30:fmul            
	//   13   31:fcmpg           
	//   14   32:ifge            407
		list = mChart.getLineData().getDataSets();
	//   15   35:aload_0         
	//   16   36:getfield        #45  <Field LineDataProvider mChart>
	//   17   39:invokeinterface #143 <Method LineData LineDataProvider.getLineData()>
	//   18   44:invokevirtual   #149 <Method List LineData.getDataSets()>
	//   19   47:astore          9
		i = 0;
	//   20   49:iconst_0        
	//   21   50:istore          4
_L2:
		ILineDataSet ilinedataset;
		if(i >= list.size())
			break MISSING_BLOCK_LABEL_407;
	//   22   52:iload           4
	//   23   54:aload           9
	//   24   56:invokeinterface #154 <Method int List.size()>
	//   25   61:icmpge          407
		ilinedataset = (ILineDataSet)list.get(i);
	//   26   64:aload           9
	//   27   66:iload           4
	//   28   68:invokeinterface #158 <Method Object List.get(int)>
	//   29   73:checkcast       #70  <Class ILineDataSet>
	//   30   76:astore          10
		if(ilinedataset.isDrawValuesEnabled() && ilinedataset.getEntryCount() != 0)
			break; /* Loop/switch isn't completed */
	//   31   78:aload           10
	//   32   80:invokeinterface #476 <Method boolean ILineDataSet.isDrawValuesEnabled()>
	//   33   85:ifeq            98
	//   34   88:aload           10
	//   35   90:invokeinterface #122 <Method int ILineDataSet.getEntryCount()>
	//   36   95:ifne            107
_L4:
		i++;
	//   37   98:iload           4
	//   38  100:iconst_1        
	//   39  101:iadd            
	//   40  102:istore          4
		if(true) goto _L2; else goto _L1
	//   41  104:goto            52
_L1:
		float f;
		float f1;
		int j;
		int k;
		int l;
		applyValueTextStyle(((com.github.mikephil.charting.interfaces.datasets.IDataSet) (ilinedataset)));
	//   42  107:aload_0         
	//   43  108:aload           10
	//   44  110:invokevirtual   #480 <Method void applyValueTextStyle(com.github.mikephil.charting.interfaces.datasets.IDataSet)>
		Transformer transformer = mChart.getTransformer(ilinedataset.getAxisDependency());
	//   45  113:aload_0         
	//   46  114:getfield        #45  <Field LineDataProvider mChart>
	//   47  117:aload           10
	//   48  119:invokeinterface #172 <Method com.github.mikephil.charting.components.YAxis$AxisDependency ILineDataSet.getAxisDependency()>
	//   49  124:invokeinterface #176 <Method Transformer LineDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   50  129:astore          11
		k = (int)(ilinedataset.getCircleRadius() * 1.75F);
	//   51  131:aload           10
	//   52  133:invokeinterface #230 <Method float ILineDataSet.getCircleRadius()>
	//   53  138:ldc2            #481 <Float 1.75F>
	//   54  141:fmul            
	//   55  142:f2i             
	//   56  143:istore          6
		j = k;
	//   57  145:iload           6
	//   58  147:istore          5
		if(!ilinedataset.isDrawCirclesEnabled())
	//*  59  149:aload           10
	//*  60  151:invokeinterface #165 <Method boolean ILineDataSet.isDrawCirclesEnabled()>
	//*  61  156:ifne            165
			j = k / 2;
	//   62  159:iload           6
	//   63  161:iconst_2        
	//   64  162:idiv            
	//   65  163:istore          5
		int i1 = ilinedataset.getEntryCount();
	//   66  165:aload           10
	//   67  167:invokeinterface #122 <Method int ILineDataSet.getEntryCount()>
	//   68  172:istore          8
		float af[];
		Entry entry;
		Entry entry2;
		if(mMinX < 0)
	//*  69  174:aload_0         
	//*  70  175:getfield        #180 <Field int mMinX>
	//*  71  178:ifge            341
			k = 0;
	//   72  181:iconst_0        
	//   73  182:istore          6
		else
	//*  74  184:aload           10
	//*  75  186:iload           6
	//*  76  188:getstatic       #186 <Field com.github.mikephil.charting.data.DataSet$Rounding com.github.mikephil.charting.data.DataSet$Rounding.DOWN>
	//*  77  191:invokeinterface #190 <Method Entry ILineDataSet.getEntryForXIndex(int, com.github.mikephil.charting.data.DataSet$Rounding)>
	//*  78  196:astore          12
	//*  79  198:aload           10
	//*  80  200:aload_0         
	//*  81  201:getfield        #193 <Field int mMaxX>
	//*  82  204:getstatic       #196 <Field com.github.mikephil.charting.data.DataSet$Rounding com.github.mikephil.charting.data.DataSet$Rounding.UP>
	//*  83  207:invokeinterface #190 <Method Entry ILineDataSet.getEntryForXIndex(int, com.github.mikephil.charting.data.DataSet$Rounding)>
	//*  84  212:astore          13
	//*  85  214:aload           10
	//*  86  216:aload           12
	//*  87  218:invokeinterface #200 <Method int ILineDataSet.getEntryIndex(Entry)>
	//*  88  223:iconst_0        
	//*  89  224:invokestatic    #129 <Method int Math.max(int, int)>
	//*  90  227:istore          7
	//*  91  229:aload           10
	//*  92  231:aload           13
	//*  93  233:invokeinterface #200 <Method int ILineDataSet.getEntryIndex(Entry)>
	//*  94  238:iconst_1        
	//*  95  239:iadd            
	//*  96  240:iload           8
	//*  97  242:invokestatic    #126 <Method int Math.min(int, int)>
	//*  98  245:istore          6
	//*  99  247:aload           11
	//* 100  249:aload           10
	//* 101  251:aload_0         
	//* 102  252:getfield        #84  <Field ChartAnimator mAnimator>
	//* 103  255:invokevirtual   #90  <Method float ChartAnimator.getPhaseX()>
	//* 104  258:aload_0         
	//* 105  259:getfield        #84  <Field ChartAnimator mAnimator>
	//* 106  262:invokevirtual   #93  <Method float ChartAnimator.getPhaseY()>
	//* 107  265:iload           7
	//* 108  267:iload           6
	//* 109  269:invokevirtual   #485 <Method float[] Transformer.generateTransformedValuesLine(ILineDataSet, float, float, int, int)>
	//* 110  272:astore          11
	//* 111  274:iconst_0        
	//* 112  275:istore          6
	//* 113  277:iload           6
	//* 114  279:aload           11
	//* 115  281:arraylength     
	//* 116  282:icmpge          98
	//* 117  285:aload           11
	//* 118  287:iload           6
	//* 119  289:faload          
	//* 120  290:fstore_2        
	//* 121  291:aload           11
	//* 122  293:iload           6
	//* 123  295:iconst_1        
	//* 124  296:iadd            
	//* 125  297:faload          
	//* 126  298:fstore_3        
	//* 127  299:aload_0         
	//* 128  300:getfield        #234 <Field ViewPortHandler mViewPortHandler>
	//* 129  303:fload_2         
	//* 130  304:invokevirtual   #240 <Method boolean ViewPortHandler.isInBoundsRight(float)>
	//* 131  307:ifeq            98
	//* 132  310:aload_0         
	//* 133  311:getfield        #234 <Field ViewPortHandler mViewPortHandler>
	//* 134  314:fload_2         
	//* 135  315:invokevirtual   #243 <Method boolean ViewPortHandler.isInBoundsLeft(float)>
	//* 136  318:ifeq            332
	//* 137  321:aload_0         
	//* 138  322:getfield        #234 <Field ViewPortHandler mViewPortHandler>
	//* 139  325:fload_3         
	//* 140  326:invokevirtual   #246 <Method boolean ViewPortHandler.isInBoundsY(float)>
	//* 141  329:ifne            350
	//* 142  332:iload           6
	//* 143  334:iconst_2        
	//* 144  335:iadd            
	//* 145  336:istore          6
	//* 146  338:goto            277
			k = mMinX;
	//  147  341:aload_0         
	//  148  342:getfield        #180 <Field int mMinX>
	//  149  345:istore          6
		entry = ilinedataset.getEntryForXIndex(k, com.github.mikephil.charting.data.DataSet.Rounding.DOWN);
		entry2 = ilinedataset.getEntryForXIndex(mMaxX, com.github.mikephil.charting.data.DataSet.Rounding.UP);
		l = Math.max(ilinedataset.getEntryIndex(entry), 0);
		k = Math.min(ilinedataset.getEntryIndex(entry2) + 1, i1);
		af = transformer.generateTransformedValuesLine(ilinedataset, mAnimator.getPhaseX(), mAnimator.getPhaseY(), l, k);
		k = 0;
_L6:
		if(k >= af.length) goto _L4; else goto _L3
_L3:
		f = af[k];
		f1 = af[k + 1];
		if(!mViewPortHandler.isInBoundsRight(f)) goto _L4; else goto _L5
_L5:
		if(mViewPortHandler.isInBoundsLeft(f) && mViewPortHandler.isInBoundsY(f1))
	//* 150  347:goto            184
		{
			Entry entry1 = ilinedataset.getEntryForIndex(k / 2 + l);
	//  151  350:aload           10
	//  152  352:iload           6
	//  153  354:iconst_2        
	//  154  355:idiv            
	//  155  356:iload           7
	//  156  358:iadd            
	//  157  359:invokeinterface #97  <Method Entry ILineDataSet.getEntryForIndex(int)>
	//  158  364:astore          12
			drawValue(canvas, ilinedataset.getValueFormatter(), entry1.getVal(), entry1, i, f, f1 - (float)j, ilinedataset.getValueTextColor(k / 2));
	//  159  366:aload_0         
	//  160  367:aload_1         
	//  161  368:aload           10
	//  162  370:invokeinterface #489 <Method com.github.mikephil.charting.formatter.ValueFormatter ILineDataSet.getValueFormatter()>
	//  163  375:aload           12
	//  164  377:invokevirtual   #110 <Method float Entry.getVal()>
	//  165  380:aload           12
	//  166  382:iload           4
	//  167  384:fload_2         
	//  168  385:fload_3         
	//  169  386:iload           5
	//  170  388:i2f             
	//  171  389:fsub            
	//  172  390:aload           10
	//  173  392:iload           6
	//  174  394:iconst_2        
	//  175  395:idiv            
	//  176  396:invokeinterface #492 <Method int ILineDataSet.getValueTextColor(int)>
	//  177  401:invokevirtual   #496 <Method void drawValue(Canvas, com.github.mikephil.charting.formatter.ValueFormatter, float, Entry, int, float, float, int)>
		}
		k += 2;
		  goto _L6
	//* 178  404:goto            332
	//  179  407:return          
	}

	public android.graphics.Bitmap.Config getBitmapConfig()
	{
		return mBitmapConfig;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field android.graphics.Bitmap$Config mBitmapConfig>
	//    2    4:areturn         
	}

	public void initBuffers()
	{
		LineData linedata = mChart.getLineData();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field LineDataProvider mChart>
	//    2    4:invokeinterface #143 <Method LineData LineDataProvider.getLineData()>
	//    3    9:astore_2        
		mLineBuffers = new LineBuffer[linedata.getDataSetCount()];
	//    4   10:aload_0         
	//    5   11:aload_2         
	//    6   12:invokevirtual   #502 <Method int LineData.getDataSetCount()>
	//    7   15:anewarray       LineBuffer[]
	//    8   18:putfield        #431 <Field LineBuffer[] mLineBuffers>
		mCircleBuffers = new CircleBuffer[linedata.getDataSetCount()];
	//    9   21:aload_0         
	//   10   22:aload_2         
	//   11   23:invokevirtual   #502 <Method int LineData.getDataSetCount()>
	//   12   26:anewarray       CircleBuffer[]
	//   13   29:putfield        #202 <Field CircleBuffer[] mCircleBuffers>
		for(int i = 0; i < mLineBuffers.length; i++)
	//*  14   32:iconst_0        
	//*  15   33:istore_1        
	//*  16   34:iload_1         
	//*  17   35:aload_0         
	//*  18   36:getfield        #431 <Field LineBuffer[] mLineBuffers>
	//*  19   39:arraylength     
	//*  20   40:icmpge          103
		{
			ILineDataSet ilinedataset = (ILineDataSet)linedata.getDataSetByIndex(i);
	//   21   43:aload_2         
	//   22   44:iload_1         
	//   23   45:invokevirtual   #406 <Method com.github.mikephil.charting.interfaces.datasets.IDataSet LineData.getDataSetByIndex(int)>
	//   24   48:checkcast       #70  <Class ILineDataSet>
	//   25   51:astore_3        
			mLineBuffers[i] = new LineBuffer(ilinedataset.getEntryCount() * 4 - 4);
	//   26   52:aload_0         
	//   27   53:getfield        #431 <Field LineBuffer[] mLineBuffers>
	//   28   56:iload_1         
	//   29   57:new             #433 <Class LineBuffer>
	//   30   60:dup             
	//   31   61:aload_3         
	//   32   62:invokeinterface #122 <Method int ILineDataSet.getEntryCount()>
	//   33   67:iconst_4        
	//   34   68:imul            
	//   35   69:iconst_4        
	//   36   70:isub            
	//   37   71:invokespecial   #503 <Method void LineBuffer(int)>
	//   38   74:aastore         
			mCircleBuffers[i] = new CircleBuffer(ilinedataset.getEntryCount() * 2);
	//   39   75:aload_0         
	//   40   76:getfield        #202 <Field CircleBuffer[] mCircleBuffers>
	//   41   79:iload_1         
	//   42   80:new             #204 <Class CircleBuffer>
	//   43   83:dup             
	//   44   84:aload_3         
	//   45   85:invokeinterface #122 <Method int ILineDataSet.getEntryCount()>
	//   46   90:iconst_2        
	//   47   91:imul            
	//   48   92:invokespecial   #504 <Method void CircleBuffer(int)>
	//   49   95:aastore         
		}

	//   50   96:iload_1         
	//   51   97:iconst_1        
	//   52   98:iadd            
	//   53   99:istore_1        
	//*  54  100:goto            34
	//   55  103:return          
	}

	public void releaseBitmap()
	{
		if(mDrawBitmap != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #328 <Field WeakReference mDrawBitmap>
	//*   2    4:ifnull          32
		{
			((Bitmap)mDrawBitmap.get()).recycle();
	//    3    7:aload_0         
	//    4    8:getfield        #328 <Field WeakReference mDrawBitmap>
	//    5   11:invokevirtual   #333 <Method Object WeakReference.get()>
	//    6   14:checkcast       #335 <Class Bitmap>
	//    7   17:invokevirtual   #508 <Method void Bitmap.recycle()>
			mDrawBitmap.clear();
	//    8   20:aload_0         
	//    9   21:getfield        #328 <Field WeakReference mDrawBitmap>
	//   10   24:invokevirtual   #511 <Method void WeakReference.clear()>
			mDrawBitmap = null;
	//   11   27:aload_0         
	//   12   28:aconst_null     
	//   13   29:putfield        #328 <Field WeakReference mDrawBitmap>
		}
	//   14   32:return          
	}

	public void setBitmapConfig(android.graphics.Bitmap.Config config)
	{
		mBitmapConfig = config;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field android.graphics.Bitmap$Config mBitmapConfig>
		releaseBitmap();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #515 <Method void releaseBitmap()>
	//    5    9:return          
	}

	protected Path cubicFillPath;
	protected Path cubicPath;
	protected Canvas mBitmapCanvas;
	protected android.graphics.Bitmap.Config mBitmapConfig;
	protected LineDataProvider mChart;
	protected CircleBuffer mCircleBuffers[];
	protected Paint mCirclePaintInner;
	protected WeakReference mDrawBitmap;
	protected LineBuffer mLineBuffers[];
}
