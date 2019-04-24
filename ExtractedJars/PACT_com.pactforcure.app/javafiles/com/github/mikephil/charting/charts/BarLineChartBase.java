// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.*;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.components.*;
import com.github.mikephil.charting.data.*;
import com.github.mikephil.charting.highlight.*;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.jobs.*;
import com.github.mikephil.charting.listener.*;
import com.github.mikephil.charting.renderer.*;
import com.github.mikephil.charting.utils.*;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.charts:
//			Chart, BarChart, HorizontalBarChart

public abstract class BarLineChartBase extends Chart
	implements BarLineScatterCandleBubbleDataProvider
{

	public BarLineChartBase(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #55  <Method void Chart(Context)>
		mMaxVisibleCount = 100;
	//    3    5:aload_0         
	//    4    6:bipush          100
	//    5    8:putfield        #57  <Field int mMaxVisibleCount>
		mAutoScaleMinMaxEnabled = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #59  <Field boolean mAutoScaleMinMaxEnabled>
		mAutoScaleLastLowestVisibleXIndex = null;
	//    9   16:aload_0         
	//   10   17:aconst_null     
	//   11   18:putfield        #61  <Field Integer mAutoScaleLastLowestVisibleXIndex>
		mAutoScaleLastHighestVisibleXIndex = null;
	//   12   21:aload_0         
	//   13   22:aconst_null     
	//   14   23:putfield        #63  <Field Integer mAutoScaleLastHighestVisibleXIndex>
		mPinchZoomEnabled = false;
	//   15   26:aload_0         
	//   16   27:iconst_0        
	//   17   28:putfield        #65  <Field boolean mPinchZoomEnabled>
		mDoubleTapToZoomEnabled = true;
	//   18   31:aload_0         
	//   19   32:iconst_1        
	//   20   33:putfield        #67  <Field boolean mDoubleTapToZoomEnabled>
		mHighlightPerDragEnabled = true;
	//   21   36:aload_0         
	//   22   37:iconst_1        
	//   23   38:putfield        #69  <Field boolean mHighlightPerDragEnabled>
		mDragEnabled = true;
	//   24   41:aload_0         
	//   25   42:iconst_1        
	//   26   43:putfield        #71  <Field boolean mDragEnabled>
		mScaleXEnabled = true;
	//   27   46:aload_0         
	//   28   47:iconst_1        
	//   29   48:putfield        #73  <Field boolean mScaleXEnabled>
		mScaleYEnabled = true;
	//   30   51:aload_0         
	//   31   52:iconst_1        
	//   32   53:putfield        #75  <Field boolean mScaleYEnabled>
		mDrawGridBackground = false;
	//   33   56:aload_0         
	//   34   57:iconst_0        
	//   35   58:putfield        #77  <Field boolean mDrawGridBackground>
		mDrawBorders = false;
	//   36   61:aload_0         
	//   37   62:iconst_0        
	//   38   63:putfield        #79  <Field boolean mDrawBorders>
		mMinOffset = 15F;
	//   39   66:aload_0         
	//   40   67:ldc1            #80  <Float 15F>
	//   41   69:putfield        #82  <Field float mMinOffset>
		totalTime = 0L;
	//   42   72:aload_0         
	//   43   73:lconst_0        
	//   44   74:putfield        #84  <Field long totalTime>
		drawCycles = 0L;
	//   45   77:aload_0         
	//   46   78:lconst_0        
	//   47   79:putfield        #86  <Field long drawCycles>
		mCustomViewPortEnabled = false;
	//   48   82:aload_0         
	//   49   83:iconst_0        
	//   50   84:putfield        #88  <Field boolean mCustomViewPortEnabled>
	//   51   87:return          
	}

	public BarLineChartBase(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #92  <Method void Chart(Context, AttributeSet)>
		mMaxVisibleCount = 100;
	//    4    6:aload_0         
	//    5    7:bipush          100
	//    6    9:putfield        #57  <Field int mMaxVisibleCount>
		mAutoScaleMinMaxEnabled = false;
	//    7   12:aload_0         
	//    8   13:iconst_0        
	//    9   14:putfield        #59  <Field boolean mAutoScaleMinMaxEnabled>
		mAutoScaleLastLowestVisibleXIndex = null;
	//   10   17:aload_0         
	//   11   18:aconst_null     
	//   12   19:putfield        #61  <Field Integer mAutoScaleLastLowestVisibleXIndex>
		mAutoScaleLastHighestVisibleXIndex = null;
	//   13   22:aload_0         
	//   14   23:aconst_null     
	//   15   24:putfield        #63  <Field Integer mAutoScaleLastHighestVisibleXIndex>
		mPinchZoomEnabled = false;
	//   16   27:aload_0         
	//   17   28:iconst_0        
	//   18   29:putfield        #65  <Field boolean mPinchZoomEnabled>
		mDoubleTapToZoomEnabled = true;
	//   19   32:aload_0         
	//   20   33:iconst_1        
	//   21   34:putfield        #67  <Field boolean mDoubleTapToZoomEnabled>
		mHighlightPerDragEnabled = true;
	//   22   37:aload_0         
	//   23   38:iconst_1        
	//   24   39:putfield        #69  <Field boolean mHighlightPerDragEnabled>
		mDragEnabled = true;
	//   25   42:aload_0         
	//   26   43:iconst_1        
	//   27   44:putfield        #71  <Field boolean mDragEnabled>
		mScaleXEnabled = true;
	//   28   47:aload_0         
	//   29   48:iconst_1        
	//   30   49:putfield        #73  <Field boolean mScaleXEnabled>
		mScaleYEnabled = true;
	//   31   52:aload_0         
	//   32   53:iconst_1        
	//   33   54:putfield        #75  <Field boolean mScaleYEnabled>
		mDrawGridBackground = false;
	//   34   57:aload_0         
	//   35   58:iconst_0        
	//   36   59:putfield        #77  <Field boolean mDrawGridBackground>
		mDrawBorders = false;
	//   37   62:aload_0         
	//   38   63:iconst_0        
	//   39   64:putfield        #79  <Field boolean mDrawBorders>
		mMinOffset = 15F;
	//   40   67:aload_0         
	//   41   68:ldc1            #80  <Float 15F>
	//   42   70:putfield        #82  <Field float mMinOffset>
		totalTime = 0L;
	//   43   73:aload_0         
	//   44   74:lconst_0        
	//   45   75:putfield        #84  <Field long totalTime>
		drawCycles = 0L;
	//   46   78:aload_0         
	//   47   79:lconst_0        
	//   48   80:putfield        #86  <Field long drawCycles>
		mCustomViewPortEnabled = false;
	//   49   83:aload_0         
	//   50   84:iconst_0        
	//   51   85:putfield        #88  <Field boolean mCustomViewPortEnabled>
	//   52   88:return          
	}

	public BarLineChartBase(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #95  <Method void Chart(Context, AttributeSet, int)>
		mMaxVisibleCount = 100;
	//    5    7:aload_0         
	//    6    8:bipush          100
	//    7   10:putfield        #57  <Field int mMaxVisibleCount>
		mAutoScaleMinMaxEnabled = false;
	//    8   13:aload_0         
	//    9   14:iconst_0        
	//   10   15:putfield        #59  <Field boolean mAutoScaleMinMaxEnabled>
		mAutoScaleLastLowestVisibleXIndex = null;
	//   11   18:aload_0         
	//   12   19:aconst_null     
	//   13   20:putfield        #61  <Field Integer mAutoScaleLastLowestVisibleXIndex>
		mAutoScaleLastHighestVisibleXIndex = null;
	//   14   23:aload_0         
	//   15   24:aconst_null     
	//   16   25:putfield        #63  <Field Integer mAutoScaleLastHighestVisibleXIndex>
		mPinchZoomEnabled = false;
	//   17   28:aload_0         
	//   18   29:iconst_0        
	//   19   30:putfield        #65  <Field boolean mPinchZoomEnabled>
		mDoubleTapToZoomEnabled = true;
	//   20   33:aload_0         
	//   21   34:iconst_1        
	//   22   35:putfield        #67  <Field boolean mDoubleTapToZoomEnabled>
		mHighlightPerDragEnabled = true;
	//   23   38:aload_0         
	//   24   39:iconst_1        
	//   25   40:putfield        #69  <Field boolean mHighlightPerDragEnabled>
		mDragEnabled = true;
	//   26   43:aload_0         
	//   27   44:iconst_1        
	//   28   45:putfield        #71  <Field boolean mDragEnabled>
		mScaleXEnabled = true;
	//   29   48:aload_0         
	//   30   49:iconst_1        
	//   31   50:putfield        #73  <Field boolean mScaleXEnabled>
		mScaleYEnabled = true;
	//   32   53:aload_0         
	//   33   54:iconst_1        
	//   34   55:putfield        #75  <Field boolean mScaleYEnabled>
		mDrawGridBackground = false;
	//   35   58:aload_0         
	//   36   59:iconst_0        
	//   37   60:putfield        #77  <Field boolean mDrawGridBackground>
		mDrawBorders = false;
	//   38   63:aload_0         
	//   39   64:iconst_0        
	//   40   65:putfield        #79  <Field boolean mDrawBorders>
		mMinOffset = 15F;
	//   41   68:aload_0         
	//   42   69:ldc1            #80  <Float 15F>
	//   43   71:putfield        #82  <Field float mMinOffset>
		totalTime = 0L;
	//   44   74:aload_0         
	//   45   75:lconst_0        
	//   46   76:putfield        #84  <Field long totalTime>
		drawCycles = 0L;
	//   47   79:aload_0         
	//   48   80:lconst_0        
	//   49   81:putfield        #86  <Field long drawCycles>
		mCustomViewPortEnabled = false;
	//   50   84:aload_0         
	//   51   85:iconst_0        
	//   52   86:putfield        #88  <Field boolean mCustomViewPortEnabled>
	//   53   89:return          
	}

	protected void calcMinMax()
	{
		if(mAutoScaleMinMaxEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field boolean mAutoScaleMinMaxEnabled>
	//*   2    4:ifeq            25
			((BarLineScatterCandleBubbleData)mData).calcMinMax(getLowestVisibleXIndex(), getHighestVisibleXIndex());
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field com.github.mikephil.charting.data.ChartData mData>
	//    5   11:checkcast       #103 <Class BarLineScatterCandleBubbleData>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #107 <Method int getLowestVisibleXIndex()>
	//    8   18:aload_0         
	//    9   19:invokevirtual   #110 <Method int getHighestVisibleXIndex()>
	//   10   22:invokevirtual   #113 <Method void BarLineScatterCandleBubbleData.calcMinMax(int, int)>
		float f;
		float f1;
		float f2;
		float f3;
		float f4;
		float f5;
		float f6;
		float f7;
		float f8;
		float f9;
		float f10;
		float f11;
		YAxis yaxis;
		if(!Float.isNaN(mAxisLeft.getAxisMinValue()))
	//*  11   25:aload_0         
	//*  12   26:getfield        #115 <Field YAxis mAxisLeft>
	//*  13   29:invokevirtual   #121 <Method float YAxis.getAxisMinValue()>
	//*  14   32:invokestatic    #127 <Method boolean Float.isNaN(float)>
	//*  15   35:ifne            455
			f = mAxisLeft.getAxisMinValue();
	//   16   38:aload_0         
	//   17   39:getfield        #115 <Field YAxis mAxisLeft>
	//   18   42:invokevirtual   #121 <Method float YAxis.getAxisMinValue()>
	//   19   45:fstore_1        
		else
	//*  20   46:aload_0         
	//*  21   47:getfield        #115 <Field YAxis mAxisLeft>
	//*  22   50:invokevirtual   #130 <Method float YAxis.getAxisMaxValue()>
	//*  23   53:invokestatic    #127 <Method boolean Float.isNaN(float)>
	//*  24   56:ifne            472
	//*  25   59:aload_0         
	//*  26   60:getfield        #115 <Field YAxis mAxisLeft>
	//*  27   63:invokevirtual   #130 <Method float YAxis.getAxisMaxValue()>
	//*  28   66:fstore_3        
	//*  29   67:aload_0         
	//*  30   68:getfield        #132 <Field YAxis mAxisRight>
	//*  31   71:invokevirtual   #121 <Method float YAxis.getAxisMinValue()>
	//*  32   74:invokestatic    #127 <Method boolean Float.isNaN(float)>
	//*  33   77:ifne            489
	//*  34   80:aload_0         
	//*  35   81:getfield        #132 <Field YAxis mAxisRight>
	//*  36   84:invokevirtual   #121 <Method float YAxis.getAxisMinValue()>
	//*  37   87:fstore_2        
	//*  38   88:aload_0         
	//*  39   89:getfield        #132 <Field YAxis mAxisRight>
	//*  40   92:invokevirtual   #130 <Method float YAxis.getAxisMaxValue()>
	//*  41   95:invokestatic    #127 <Method boolean Float.isNaN(float)>
	//*  42   98:ifne            506
	//*  43  101:aload_0         
	//*  44  102:getfield        #132 <Field YAxis mAxisRight>
	//*  45  105:invokevirtual   #130 <Method float YAxis.getAxisMaxValue()>
	//*  46  108:fstore          4
	//*  47  110:fload_3         
	//*  48  111:fload_1         
	//*  49  112:fsub            
	//*  50  113:invokestatic    #138 <Method float Math.abs(float)>
	//*  51  116:fstore          9
	//*  52  118:fload           4
	//*  53  120:fload_2         
	//*  54  121:fsub            
	//*  55  122:invokestatic    #138 <Method float Math.abs(float)>
	//*  56  125:fstore          8
	//*  57  127:fload_3         
	//*  58  128:fstore          5
	//*  59  130:fload_1         
	//*  60  131:fstore          6
	//*  61  133:fload           9
	//*  62  135:fconst_0        
	//*  63  136:fcmpl           
	//*  64  137:ifne            150
	//*  65  140:fload_3         
	//*  66  141:fconst_1        
	//*  67  142:fadd            
	//*  68  143:fstore          5
	//*  69  145:fload_1         
	//*  70  146:fconst_1        
	//*  71  147:fsub            
	//*  72  148:fstore          6
	//*  73  150:fload           4
	//*  74  152:fstore_1        
	//*  75  153:fload_2         
	//*  76  154:fstore_3        
	//*  77  155:fload           8
	//*  78  157:fconst_0        
	//*  79  158:fcmpl           
	//*  80  159:ifne            171
	//*  81  162:fload           4
	//*  82  164:fconst_1        
	//*  83  165:fadd            
	//*  84  166:fstore_1        
	//*  85  167:fload_2         
	//*  86  168:fconst_1        
	//*  87  169:fsub            
	//*  88  170:fstore_3        
	//*  89  171:fload           9
	//*  90  173:ldc1            #139 <Float 100F>
	//*  91  175:fdiv            
	//*  92  176:fstore          10
	//*  93  178:aload_0         
	//*  94  179:getfield        #115 <Field YAxis mAxisLeft>
	//*  95  182:invokevirtual   #142 <Method float YAxis.getSpaceTop()>
	//*  96  185:fstore          11
	//*  97  187:fload           8
	//*  98  189:ldc1            #139 <Float 100F>
	//*  99  191:fdiv            
	//* 100  192:fstore          4
	//* 101  194:aload_0         
	//* 102  195:getfield        #132 <Field YAxis mAxisRight>
	//* 103  198:invokevirtual   #142 <Method float YAxis.getSpaceTop()>
	//* 104  201:fstore          7
	//* 105  203:fload           9
	//* 106  205:ldc1            #139 <Float 100F>
	//* 107  207:fdiv            
	//* 108  208:fstore_2        
	//* 109  209:aload_0         
	//* 110  210:getfield        #115 <Field YAxis mAxisLeft>
	//* 111  213:invokevirtual   #145 <Method float YAxis.getSpaceBottom()>
	//* 112  216:fstore          12
	//* 113  218:fload           8
	//* 114  220:ldc1            #139 <Float 100F>
	//* 115  222:fdiv            
	//* 116  223:fstore          8
	//* 117  225:aload_0         
	//* 118  226:getfield        #132 <Field YAxis mAxisRight>
	//* 119  229:invokevirtual   #145 <Method float YAxis.getSpaceBottom()>
	//* 120  232:fstore          9
	//* 121  234:aload_0         
	//* 122  235:aload_0         
	//* 123  236:getfield        #101 <Field com.github.mikephil.charting.data.ChartData mData>
	//* 124  239:checkcast       #103 <Class BarLineScatterCandleBubbleData>
	//* 125  242:invokevirtual   #149 <Method List BarLineScatterCandleBubbleData.getXVals()>
	//* 126  245:invokeinterface #154 <Method int List.size()>
	//* 127  250:iconst_1        
	//* 128  251:isub            
	//* 129  252:i2f             
	//* 130  253:putfield        #157 <Field float mXChartMax>
	//* 131  256:aload_0         
	//* 132  257:aload_0         
	//* 133  258:getfield        #157 <Field float mXChartMax>
	//* 134  261:aload_0         
	//* 135  262:getfield        #160 <Field float mXChartMin>
	//* 136  265:fsub            
	//* 137  266:invokestatic    #138 <Method float Math.abs(float)>
	//* 138  269:putfield        #163 <Field float mDeltaX>
	//* 139  272:aload_0         
	//* 140  273:getfield        #115 <Field YAxis mAxisLeft>
	//* 141  276:astore          13
	//* 142  278:aload_0         
	//* 143  279:getfield        #115 <Field YAxis mAxisLeft>
	//* 144  282:invokevirtual   #121 <Method float YAxis.getAxisMinValue()>
	//* 145  285:invokestatic    #127 <Method boolean Float.isNaN(float)>
	//* 146  288:ifne            524
	//* 147  291:aload_0         
	//* 148  292:getfield        #115 <Field YAxis mAxisLeft>
	//* 149  295:invokevirtual   #121 <Method float YAxis.getAxisMinValue()>
	//* 150  298:fstore_2        
	//* 151  299:aload           13
	//* 152  301:fload_2         
	//* 153  302:putfield        #166 <Field float YAxis.mAxisMinimum>
	//* 154  305:aload_0         
	//* 155  306:getfield        #115 <Field YAxis mAxisLeft>
	//* 156  309:astore          13
	//* 157  311:aload_0         
	//* 158  312:getfield        #115 <Field YAxis mAxisLeft>
	//* 159  315:invokevirtual   #130 <Method float YAxis.getAxisMaxValue()>
	//* 160  318:invokestatic    #127 <Method boolean Float.isNaN(float)>
	//* 161  321:ifne            535
	//* 162  324:aload_0         
	//* 163  325:getfield        #115 <Field YAxis mAxisLeft>
	//* 164  328:invokevirtual   #130 <Method float YAxis.getAxisMaxValue()>
	//* 165  331:fstore_2        
	//* 166  332:aload           13
	//* 167  334:fload_2         
	//* 168  335:putfield        #169 <Field float YAxis.mAxisMaximum>
	//* 169  338:aload_0         
	//* 170  339:getfield        #132 <Field YAxis mAxisRight>
	//* 171  342:astore          13
	//* 172  344:aload_0         
	//* 173  345:getfield        #132 <Field YAxis mAxisRight>
	//* 174  348:invokevirtual   #121 <Method float YAxis.getAxisMinValue()>
	//* 175  351:invokestatic    #127 <Method boolean Float.isNaN(float)>
	//* 176  354:ifne            547
	//* 177  357:aload_0         
	//* 178  358:getfield        #132 <Field YAxis mAxisRight>
	//* 179  361:invokevirtual   #121 <Method float YAxis.getAxisMinValue()>
	//* 180  364:fstore_2        
	//* 181  365:aload           13
	//* 182  367:fload_2         
	//* 183  368:putfield        #166 <Field float YAxis.mAxisMinimum>
	//* 184  371:aload_0         
	//* 185  372:getfield        #132 <Field YAxis mAxisRight>
	//* 186  375:astore          13
	//* 187  377:aload_0         
	//* 188  378:getfield        #132 <Field YAxis mAxisRight>
	//* 189  381:invokevirtual   #130 <Method float YAxis.getAxisMaxValue()>
	//* 190  384:invokestatic    #127 <Method boolean Float.isNaN(float)>
	//* 191  387:ifne            558
	//* 192  390:aload_0         
	//* 193  391:getfield        #132 <Field YAxis mAxisRight>
	//* 194  394:invokevirtual   #130 <Method float YAxis.getAxisMaxValue()>
	//* 195  397:fstore_1        
	//* 196  398:aload           13
	//* 197  400:fload_1         
	//* 198  401:putfield        #169 <Field float YAxis.mAxisMaximum>
	//* 199  404:aload_0         
	//* 200  405:getfield        #115 <Field YAxis mAxisLeft>
	//* 201  408:aload_0         
	//* 202  409:getfield        #115 <Field YAxis mAxisLeft>
	//* 203  412:getfield        #169 <Field float YAxis.mAxisMaximum>
	//* 204  415:aload_0         
	//* 205  416:getfield        #115 <Field YAxis mAxisLeft>
	//* 206  419:getfield        #166 <Field float YAxis.mAxisMinimum>
	//* 207  422:fsub            
	//* 208  423:invokestatic    #138 <Method float Math.abs(float)>
	//* 209  426:putfield        #172 <Field float YAxis.mAxisRange>
	//* 210  429:aload_0         
	//* 211  430:getfield        #132 <Field YAxis mAxisRight>
	//* 212  433:aload_0         
	//* 213  434:getfield        #132 <Field YAxis mAxisRight>
	//* 214  437:getfield        #169 <Field float YAxis.mAxisMaximum>
	//* 215  440:aload_0         
	//* 216  441:getfield        #132 <Field YAxis mAxisRight>
	//* 217  444:getfield        #166 <Field float YAxis.mAxisMinimum>
	//* 218  447:fsub            
	//* 219  448:invokestatic    #138 <Method float Math.abs(float)>
	//* 220  451:putfield        #172 <Field float YAxis.mAxisRange>
	//* 221  454:return          
			f = ((BarLineScatterCandleBubbleData)mData).getYMin(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT);
	//  222  455:aload_0         
	//  223  456:getfield        #101 <Field com.github.mikephil.charting.data.ChartData mData>
	//  224  459:checkcast       #103 <Class BarLineScatterCandleBubbleData>
	//  225  462:getstatic       #178 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//  226  465:invokevirtual   #182 <Method float BarLineScatterCandleBubbleData.getYMin(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//  227  468:fstore_1        
		if(!Float.isNaN(mAxisLeft.getAxisMaxValue()))
			f2 = mAxisLeft.getAxisMaxValue();
		else
	//* 228  469:goto            46
			f2 = ((BarLineScatterCandleBubbleData)mData).getYMax(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT);
	//  229  472:aload_0         
	//  230  473:getfield        #101 <Field com.github.mikephil.charting.data.ChartData mData>
	//  231  476:checkcast       #103 <Class BarLineScatterCandleBubbleData>
	//  232  479:getstatic       #178 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//  233  482:invokevirtual   #185 <Method float BarLineScatterCandleBubbleData.getYMax(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//  234  485:fstore_3        
		if(!Float.isNaN(mAxisRight.getAxisMinValue()))
			f1 = mAxisRight.getAxisMinValue();
		else
	//* 235  486:goto            67
			f1 = ((BarLineScatterCandleBubbleData)mData).getYMin(com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT);
	//  236  489:aload_0         
	//  237  490:getfield        #101 <Field com.github.mikephil.charting.data.ChartData mData>
	//  238  493:checkcast       #103 <Class BarLineScatterCandleBubbleData>
	//  239  496:getstatic       #188 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.RIGHT>
	//  240  499:invokevirtual   #182 <Method float BarLineScatterCandleBubbleData.getYMin(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//  241  502:fstore_2        
		if(!Float.isNaN(mAxisRight.getAxisMaxValue()))
			f3 = mAxisRight.getAxisMaxValue();
		else
	//* 242  503:goto            88
			f3 = ((BarLineScatterCandleBubbleData)mData).getYMax(com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT);
	//  243  506:aload_0         
	//  244  507:getfield        #101 <Field com.github.mikephil.charting.data.ChartData mData>
	//  245  510:checkcast       #103 <Class BarLineScatterCandleBubbleData>
	//  246  513:getstatic       #188 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.RIGHT>
	//  247  516:invokevirtual   #185 <Method float BarLineScatterCandleBubbleData.getYMax(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//  248  519:fstore          4
		f8 = Math.abs(f2 - f);
		f7 = Math.abs(f3 - f1);
		f4 = f2;
		f5 = f;
		if(f8 == 0.0F)
		{
			f4 = f2 + 1.0F;
			f5 = f - 1.0F;
		}
		f = f3;
		f2 = f1;
		if(f7 == 0.0F)
		{
			f = f3 + 1.0F;
			f2 = f1 - 1.0F;
		}
		f9 = f8 / 100F;
		f10 = mAxisLeft.getSpaceTop();
		f3 = f7 / 100F;
		f6 = mAxisRight.getSpaceTop();
		f1 = f8 / 100F;
		f11 = mAxisLeft.getSpaceBottom();
		f7 /= 100F;
		f8 = mAxisRight.getSpaceBottom();
		mXChartMax = ((BarLineScatterCandleBubbleData)mData).getXVals().size() - 1;
		mDeltaX = Math.abs(mXChartMax - mXChartMin);
		yaxis = mAxisLeft;
		if(!Float.isNaN(mAxisLeft.getAxisMinValue()))
			f1 = mAxisLeft.getAxisMinValue();
		else
	//* 249  521:goto            110
			f1 = f5 - f1 * f11;
	//  250  524:fload           6
	//  251  526:fload_2         
	//  252  527:fload           12
	//  253  529:fmul            
	//  254  530:fsub            
	//  255  531:fstore_2        
		yaxis.mAxisMinimum = f1;
		yaxis = mAxisLeft;
		if(!Float.isNaN(mAxisLeft.getAxisMaxValue()))
			f1 = mAxisLeft.getAxisMaxValue();
		else
	//* 256  532:goto            299
			f1 = f4 + f9 * f10;
	//  257  535:fload           5
	//  258  537:fload           10
	//  259  539:fload           11
	//  260  541:fmul            
	//  261  542:fadd            
	//  262  543:fstore_2        
		yaxis.mAxisMaximum = f1;
		yaxis = mAxisRight;
		if(!Float.isNaN(mAxisRight.getAxisMinValue()))
			f1 = mAxisRight.getAxisMinValue();
		else
	//* 263  544:goto            332
			f1 = f2 - f7 * f8;
	//  264  547:fload_3         
	//  265  548:fload           8
	//  266  550:fload           9
	//  267  552:fmul            
	//  268  553:fsub            
	//  269  554:fstore_2        
		yaxis.mAxisMinimum = f1;
		yaxis = mAxisRight;
		if(!Float.isNaN(mAxisRight.getAxisMaxValue()))
			f = mAxisRight.getAxisMaxValue();
		else
	//* 270  555:goto            365
			f += f3 * f6;
	//  271  558:fload_1         
	//  272  559:fload           4
	//  273  561:fload           7
	//  274  563:fmul            
	//  275  564:fadd            
	//  276  565:fstore_1        
		yaxis.mAxisMaximum = f;
		mAxisLeft.mAxisRange = Math.abs(mAxisLeft.mAxisMaximum - mAxisLeft.mAxisMinimum);
		mAxisRight.mAxisRange = Math.abs(mAxisRight.mAxisMaximum - mAxisRight.mAxisMinimum);
	//* 277  566:goto            398
	}

	protected void calcModulus()
	{
		if(mXAxis != null && mXAxis.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #191 <Field XAxis mXAxis>
	//*   2    4:ifnull          17
	//*   3    7:aload_0         
	//*   4    8:getfield        #191 <Field XAxis mXAxis>
	//*   5   11:invokevirtual   #197 <Method boolean XAxis.isEnabled()>
	//*   6   14:ifne            18
	//*   7   17:return          
		{
			if(!mXAxis.isAxisModulusCustom())
	//*   8   18:aload_0         
	//*   9   19:getfield        #191 <Field XAxis mXAxis>
	//*  10   22:invokevirtual   #200 <Method boolean XAxis.isAxisModulusCustom()>
	//*  11   25:ifne            87
			{
				float af[] = new float[9];
	//   12   28:bipush          9
	//   13   30:newarray        float[]
	//   14   32:astore_1        
				mViewPortHandler.getMatrixTouch().getValues(af);
	//   15   33:aload_0         
	//   16   34:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   17   37:invokevirtual   #210 <Method Matrix ViewPortHandler.getMatrixTouch()>
	//   18   40:aload_1         
	//   19   41:invokevirtual   #216 <Method void Matrix.getValues(float[])>
				mXAxis.mAxisLabelModulus = (int)Math.ceil((float)(((BarLineScatterCandleBubbleData)mData).getXValCount() * mXAxis.mLabelRotatedWidth) / (mViewPortHandler.contentWidth() * af[0]));
	//   20   44:aload_0         
	//   21   45:getfield        #191 <Field XAxis mXAxis>
	//   22   48:aload_0         
	//   23   49:getfield        #101 <Field com.github.mikephil.charting.data.ChartData mData>
	//   24   52:checkcast       #103 <Class BarLineScatterCandleBubbleData>
	//   25   55:invokevirtual   #219 <Method int BarLineScatterCandleBubbleData.getXValCount()>
	//   26   58:aload_0         
	//   27   59:getfield        #191 <Field XAxis mXAxis>
	//   28   62:getfield        #222 <Field int XAxis.mLabelRotatedWidth>
	//   29   65:imul            
	//   30   66:i2f             
	//   31   67:aload_0         
	//   32   68:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   33   71:invokevirtual   #225 <Method float ViewPortHandler.contentWidth()>
	//   34   74:aload_1         
	//   35   75:iconst_0        
	//   36   76:faload          
	//   37   77:fmul            
	//   38   78:fdiv            
	//   39   79:f2d             
	//   40   80:invokestatic    #229 <Method double Math.ceil(double)>
	//   41   83:d2i             
	//   42   84:putfield        #232 <Field int XAxis.mAxisLabelModulus>
			}
			if(mLogEnabled)
	//*  43   87:aload_0         
	//*  44   88:getfield        #235 <Field boolean mLogEnabled>
	//*  45   91:ifeq            172
				Log.i("MPAndroidChart", (new StringBuilder()).append("X-Axis modulus: ").append(mXAxis.mAxisLabelModulus).append(", x-axis label width: ").append(mXAxis.mLabelWidth).append(", x-axis label rotated width: ").append(mXAxis.mLabelRotatedWidth).append(", content width: ").append(mViewPortHandler.contentWidth()).toString());
	//   46   94:ldc1            #237 <String "MPAndroidChart">
	//   47   96:new             #239 <Class StringBuilder>
	//   48   99:dup             
	//   49  100:invokespecial   #241 <Method void StringBuilder()>
	//   50  103:ldc1            #243 <String "X-Axis modulus: ">
	//   51  105:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   52  108:aload_0         
	//   53  109:getfield        #191 <Field XAxis mXAxis>
	//   54  112:getfield        #232 <Field int XAxis.mAxisLabelModulus>
	//   55  115:invokevirtual   #250 <Method StringBuilder StringBuilder.append(int)>
	//   56  118:ldc1            #252 <String ", x-axis label width: ">
	//   57  120:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   58  123:aload_0         
	//   59  124:getfield        #191 <Field XAxis mXAxis>
	//   60  127:getfield        #255 <Field int XAxis.mLabelWidth>
	//   61  130:invokevirtual   #250 <Method StringBuilder StringBuilder.append(int)>
	//   62  133:ldc2            #257 <String ", x-axis label rotated width: ">
	//   63  136:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   64  139:aload_0         
	//   65  140:getfield        #191 <Field XAxis mXAxis>
	//   66  143:getfield        #222 <Field int XAxis.mLabelRotatedWidth>
	//   67  146:invokevirtual   #250 <Method StringBuilder StringBuilder.append(int)>
	//   68  149:ldc2            #259 <String ", content width: ">
	//   69  152:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   70  155:aload_0         
	//   71  156:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   72  159:invokevirtual   #225 <Method float ViewPortHandler.contentWidth()>
	//   73  162:invokevirtual   #262 <Method StringBuilder StringBuilder.append(float)>
	//   74  165:invokevirtual   #266 <Method String StringBuilder.toString()>
	//   75  168:invokestatic    #272 <Method int Log.i(String, String)>
	//   76  171:pop             
			if(mXAxis.mAxisLabelModulus < 1)
	//*  77  172:aload_0         
	//*  78  173:getfield        #191 <Field XAxis mXAxis>
	//*  79  176:getfield        #232 <Field int XAxis.mAxisLabelModulus>
	//*  80  179:iconst_1        
	//*  81  180:icmpge          17
			{
				mXAxis.mAxisLabelModulus = 1;
	//   82  183:aload_0         
	//   83  184:getfield        #191 <Field XAxis mXAxis>
	//   84  187:iconst_1        
	//   85  188:putfield        #232 <Field int XAxis.mAxisLabelModulus>
				return;
	//   86  191:return          
			}
		}
	}

	public void calculateOffsets()
	{
		if(mCustomViewPortEnabled) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field boolean mCustomViewPortEnabled>
	//    2    4:ifne            441
_L1:
		float f;
		float f1;
		float f2;
		float f3;
		float f4;
		float f5;
		float f6;
		float f7;
		f4 = 0.0F;
	//    3    7:fconst_0        
	//    4    8:fstore          5
		f5 = 0.0F;
	//    5   10:fconst_0        
	//    6   11:fstore          6
		f6 = 0.0F;
	//    7   13:fconst_0        
	//    8   14:fstore          7
		f7 = 0.0F;
	//    9   16:fconst_0        
	//   10   17:fstore          8
		f = f7;
	//   11   19:fload           8
	//   12   21:fstore_1        
		f3 = f4;
	//   13   22:fload           5
	//   14   24:fstore          4
		f2 = f5;
	//   15   26:fload           6
	//   16   28:fstore_3        
		f1 = f6;
	//   17   29:fload           7
	//   18   31:fstore_2        
		if(mLegend != null)
	//*  19   32:aload_0         
	//*  20   33:getfield        #277 <Field Legend mLegend>
	//*  21   36:ifnull          136
		{
			f = f7;
	//   22   39:fload           8
	//   23   41:fstore_1        
			f3 = f4;
	//   24   42:fload           5
	//   25   44:fstore          4
			f2 = f5;
	//   26   46:fload           6
	//   27   48:fstore_3        
			f1 = f6;
	//   28   49:fload           7
	//   29   51:fstore_2        
			if(mLegend.isEnabled())
	//*  30   52:aload_0         
	//*  31   53:getfield        #277 <Field Legend mLegend>
	//*  32   56:invokevirtual   #280 <Method boolean Legend.isEnabled()>
	//*  33   59:ifeq            136
				if(mLegend.getPosition() == com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART || mLegend.getPosition() == com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART_CENTER)
	//*  34   62:aload_0         
	//*  35   63:getfield        #277 <Field Legend mLegend>
	//*  36   66:invokevirtual   #284 <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//*  37   69:getstatic       #290 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.RIGHT_OF_CHART>
	//*  38   72:if_acmpeq       88
	//*  39   75:aload_0         
	//*  40   76:getfield        #277 <Field Legend mLegend>
	//*  41   79:invokevirtual   #284 <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//*  42   82:getstatic       #293 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.RIGHT_OF_CHART_CENTER>
	//*  43   85:if_acmpne       450
				{
					f2 = 0.0F + (Math.min(mLegend.mNeededWidth, mViewPortHandler.getChartWidth() * mLegend.getMaxSizePercent()) + mLegend.getXOffset() * 2.0F);
	//   44   88:fconst_0        
	//   45   89:aload_0         
	//   46   90:getfield        #277 <Field Legend mLegend>
	//   47   93:getfield        #296 <Field float Legend.mNeededWidth>
	//   48   96:aload_0         
	//   49   97:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   50  100:invokevirtual   #299 <Method float ViewPortHandler.getChartWidth()>
	//   51  103:aload_0         
	//   52  104:getfield        #277 <Field Legend mLegend>
	//   53  107:invokevirtual   #302 <Method float Legend.getMaxSizePercent()>
	//   54  110:fmul            
	//   55  111:invokestatic    #306 <Method float Math.min(float, float)>
	//   56  114:aload_0         
	//   57  115:getfield        #277 <Field Legend mLegend>
	//   58  118:invokevirtual   #309 <Method float Legend.getXOffset()>
	//   59  121:fconst_2        
	//   60  122:fmul            
	//   61  123:fadd            
	//   62  124:fadd            
	//   63  125:fstore_3        
					f1 = f6;
	//   64  126:fload           7
	//   65  128:fstore_2        
					f3 = f4;
	//   66  129:fload           5
	//   67  131:fstore          4
					f = f7;
	//   68  133:fload           8
	//   69  135:fstore_1        
				} else
	//*  70  136:fload           4
	//*  71  138:fstore          5
	//*  72  140:aload_0         
	//*  73  141:getfield        #115 <Field YAxis mAxisLeft>
	//*  74  144:invokevirtual   #312 <Method boolean YAxis.needsOffset()>
	//*  75  147:ifeq            169
	//*  76  150:fload           4
	//*  77  152:aload_0         
	//*  78  153:getfield        #115 <Field YAxis mAxisLeft>
	//*  79  156:aload_0         
	//*  80  157:getfield        #314 <Field YAxisRenderer mAxisRendererLeft>
	//*  81  160:invokevirtual   #320 <Method Paint YAxisRenderer.getPaintAxisLabels()>
	//*  82  163:invokevirtual   #324 <Method float YAxis.getRequiredWidthSpace(Paint)>
	//*  83  166:fadd            
	//*  84  167:fstore          5
	//*  85  169:fload_3         
	//*  86  170:fstore          6
	//*  87  172:aload_0         
	//*  88  173:getfield        #132 <Field YAxis mAxisRight>
	//*  89  176:invokevirtual   #312 <Method boolean YAxis.needsOffset()>
	//*  90  179:ifeq            200
	//*  91  182:fload_3         
	//*  92  183:aload_0         
	//*  93  184:getfield        #132 <Field YAxis mAxisRight>
	//*  94  187:aload_0         
	//*  95  188:getfield        #326 <Field YAxisRenderer mAxisRendererRight>
	//*  96  191:invokevirtual   #320 <Method Paint YAxisRenderer.getPaintAxisLabels()>
	//*  97  194:invokevirtual   #324 <Method float YAxis.getRequiredWidthSpace(Paint)>
	//*  98  197:fadd            
	//*  99  198:fstore          6
	//* 100  200:fload_1         
	//* 101  201:fstore_3        
	//* 102  202:fload_2         
	//* 103  203:fstore          4
	//* 104  205:aload_0         
	//* 105  206:getfield        #191 <Field XAxis mXAxis>
	//* 106  209:invokevirtual   #197 <Method boolean XAxis.isEnabled()>
	//* 107  212:ifeq            269
	//* 108  215:fload_1         
	//* 109  216:fstore_3        
	//* 110  217:fload_2         
	//* 111  218:fstore          4
	//* 112  220:aload_0         
	//* 113  221:getfield        #191 <Field XAxis mXAxis>
	//* 114  224:invokevirtual   #329 <Method boolean XAxis.isDrawLabelsEnabled()>
	//* 115  227:ifeq            269
	//* 116  230:aload_0         
	//* 117  231:getfield        #191 <Field XAxis mXAxis>
	//* 118  234:getfield        #332 <Field int XAxis.mLabelRotatedHeight>
	//* 119  237:i2f             
	//* 120  238:aload_0         
	//* 121  239:getfield        #191 <Field XAxis mXAxis>
	//* 122  242:invokevirtual   #335 <Method float XAxis.getYOffset()>
	//* 123  245:fadd            
	//* 124  246:fstore          7
	//* 125  248:aload_0         
	//* 126  249:getfield        #191 <Field XAxis mXAxis>
	//* 127  252:invokevirtual   #338 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//* 128  255:getstatic       #344 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.BOTTOM>
	//* 129  258:if_acmpne       720
	//* 130  261:fload_1         
	//* 131  262:fload           7
	//* 132  264:fadd            
	//* 133  265:fstore_3        
	//* 134  266:fload_2         
	//* 135  267:fstore          4
	//* 136  269:fload           4
	//* 137  271:aload_0         
	//* 138  272:invokevirtual   #347 <Method float getExtraTopOffset()>
	//* 139  275:fadd            
	//* 140  276:fstore_1        
	//* 141  277:fload           6
	//* 142  279:aload_0         
	//* 143  280:invokevirtual   #350 <Method float getExtraRightOffset()>
	//* 144  283:fadd            
	//* 145  284:fstore_2        
	//* 146  285:fload_3         
	//* 147  286:aload_0         
	//* 148  287:invokevirtual   #353 <Method float getExtraBottomOffset()>
	//* 149  290:fadd            
	//* 150  291:fstore_3        
	//* 151  292:fload           5
	//* 152  294:aload_0         
	//* 153  295:invokevirtual   #356 <Method float getExtraLeftOffset()>
	//* 154  298:fadd            
	//* 155  299:fstore          4
	//* 156  301:aload_0         
	//* 157  302:getfield        #82  <Field float mMinOffset>
	//* 158  305:invokestatic    #361 <Method float Utils.convertDpToPixel(float)>
	//* 159  308:fstore          5
	//* 160  310:aload_0         
	//* 161  311:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//* 162  314:fload           5
	//* 163  316:fload           4
	//* 164  318:invokestatic    #364 <Method float Math.max(float, float)>
	//* 165  321:fload           5
	//* 166  323:fload_1         
	//* 167  324:invokestatic    #364 <Method float Math.max(float, float)>
	//* 168  327:fload           5
	//* 169  329:fload_2         
	//* 170  330:invokestatic    #364 <Method float Math.max(float, float)>
	//* 171  333:fload           5
	//* 172  335:fload_3         
	//* 173  336:invokestatic    #364 <Method float Math.max(float, float)>
	//* 174  339:invokevirtual   #368 <Method void ViewPortHandler.restrainViewPort(float, float, float, float)>
	//* 175  342:aload_0         
	//* 176  343:getfield        #235 <Field boolean mLogEnabled>
	//* 177  346:ifeq            441
	//* 178  349:ldc1            #237 <String "MPAndroidChart">
	//* 179  351:new             #239 <Class StringBuilder>
	//* 180  354:dup             
	//* 181  355:invokespecial   #241 <Method void StringBuilder()>
	//* 182  358:ldc2            #370 <String "offsetLeft: ">
	//* 183  361:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//* 184  364:fload           4
	//* 185  366:invokevirtual   #262 <Method StringBuilder StringBuilder.append(float)>
	//* 186  369:ldc2            #372 <String ", offsetTop: ">
	//* 187  372:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//* 188  375:fload_1         
	//* 189  376:invokevirtual   #262 <Method StringBuilder StringBuilder.append(float)>
	//* 190  379:ldc2            #374 <String ", offsetRight: ">
	//* 191  382:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//* 192  385:fload_2         
	//* 193  386:invokevirtual   #262 <Method StringBuilder StringBuilder.append(float)>
	//* 194  389:ldc2            #376 <String ", offsetBottom: ">
	//* 195  392:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//* 196  395:fload_3         
	//* 197  396:invokevirtual   #262 <Method StringBuilder StringBuilder.append(float)>
	//* 198  399:invokevirtual   #266 <Method String StringBuilder.toString()>
	//* 199  402:invokestatic    #272 <Method int Log.i(String, String)>
	//* 200  405:pop             
	//* 201  406:ldc1            #237 <String "MPAndroidChart">
	//* 202  408:new             #239 <Class StringBuilder>
	//* 203  411:dup             
	//* 204  412:invokespecial   #241 <Method void StringBuilder()>
	//* 205  415:ldc2            #378 <String "Content: ">
	//* 206  418:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//* 207  421:aload_0         
	//* 208  422:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//* 209  425:invokevirtual   #382 <Method RectF ViewPortHandler.getContentRect()>
	//* 210  428:invokevirtual   #385 <Method String RectF.toString()>
	//* 211  431:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//* 212  434:invokevirtual   #266 <Method String StringBuilder.toString()>
	//* 213  437:invokestatic    #272 <Method int Log.i(String, String)>
	//* 214  440:pop             
	//* 215  441:aload_0         
	//* 216  442:invokevirtual   #388 <Method void prepareOffsetMatrix()>
	//* 217  445:aload_0         
	//* 218  446:invokevirtual   #391 <Method void prepareValuePxMatrix()>
	//* 219  449:return          
				if(mLegend.getPosition() == com.github.mikephil.charting.components.Legend.LegendPosition.LEFT_OF_CHART || mLegend.getPosition() == com.github.mikephil.charting.components.Legend.LegendPosition.LEFT_OF_CHART_CENTER)
	//* 220  450:aload_0         
	//* 221  451:getfield        #277 <Field Legend mLegend>
	//* 222  454:invokevirtual   #284 <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//* 223  457:getstatic       #394 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.LEFT_OF_CHART>
	//* 224  460:if_acmpeq       476
	//* 225  463:aload_0         
	//* 226  464:getfield        #277 <Field Legend mLegend>
	//* 227  467:invokevirtual   #284 <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//* 228  470:getstatic       #397 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.LEFT_OF_CHART_CENTER>
	//* 229  473:if_acmpne       527
				{
					f3 = 0.0F + (Math.min(mLegend.mNeededWidth, mViewPortHandler.getChartWidth() * mLegend.getMaxSizePercent()) + mLegend.getXOffset() * 2.0F);
	//  230  476:fconst_0        
	//  231  477:aload_0         
	//  232  478:getfield        #277 <Field Legend mLegend>
	//  233  481:getfield        #296 <Field float Legend.mNeededWidth>
	//  234  484:aload_0         
	//  235  485:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//  236  488:invokevirtual   #299 <Method float ViewPortHandler.getChartWidth()>
	//  237  491:aload_0         
	//  238  492:getfield        #277 <Field Legend mLegend>
	//  239  495:invokevirtual   #302 <Method float Legend.getMaxSizePercent()>
	//  240  498:fmul            
	//  241  499:invokestatic    #306 <Method float Math.min(float, float)>
	//  242  502:aload_0         
	//  243  503:getfield        #277 <Field Legend mLegend>
	//  244  506:invokevirtual   #309 <Method float Legend.getXOffset()>
	//  245  509:fconst_2        
	//  246  510:fmul            
	//  247  511:fadd            
	//  248  512:fadd            
	//  249  513:fstore          4
					f = f7;
	//  250  515:fload           8
	//  251  517:fstore_1        
					f2 = f5;
	//  252  518:fload           6
	//  253  520:fstore_3        
					f1 = f6;
	//  254  521:fload           7
	//  255  523:fstore_2        
				} else
	//* 256  524:goto            136
				{
label0:
					{
						if(mLegend.getPosition() != com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_LEFT && mLegend.getPosition() != com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_RIGHT && mLegend.getPosition() != com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_CENTER)
							break label0;
	//  257  527:aload_0         
	//  258  528:getfield        #277 <Field Legend mLegend>
	//  259  531:invokevirtual   #284 <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//  260  534:getstatic       #400 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.BELOW_CHART_LEFT>
	//  261  537:if_acmpeq       566
	//  262  540:aload_0         
	//  263  541:getfield        #277 <Field Legend mLegend>
	//  264  544:invokevirtual   #284 <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//  265  547:getstatic       #403 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.BELOW_CHART_RIGHT>
	//  266  550:if_acmpeq       566
	//  267  553:aload_0         
	//  268  554:getfield        #277 <Field Legend mLegend>
	//  269  557:invokevirtual   #284 <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//  270  560:getstatic       #406 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.BELOW_CHART_CENTER>
	//  271  563:if_acmpne       617
						f = mLegend.mTextHeightMax;
	//  272  566:aload_0         
	//  273  567:getfield        #277 <Field Legend mLegend>
	//  274  570:getfield        #409 <Field float Legend.mTextHeightMax>
	//  275  573:fstore_1        
						f = 0.0F + Math.min(mLegend.mNeededHeight + f, mViewPortHandler.getChartHeight() * mLegend.getMaxSizePercent());
	//  276  574:fconst_0        
	//  277  575:aload_0         
	//  278  576:getfield        #277 <Field Legend mLegend>
	//  279  579:getfield        #412 <Field float Legend.mNeededHeight>
	//  280  582:fload_1         
	//  281  583:fadd            
	//  282  584:aload_0         
	//  283  585:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//  284  588:invokevirtual   #415 <Method float ViewPortHandler.getChartHeight()>
	//  285  591:aload_0         
	//  286  592:getfield        #277 <Field Legend mLegend>
	//  287  595:invokevirtual   #302 <Method float Legend.getMaxSizePercent()>
	//  288  598:fmul            
	//  289  599:invokestatic    #306 <Method float Math.min(float, float)>
	//  290  602:fadd            
	//  291  603:fstore_1        
						f3 = f4;
	//  292  604:fload           5
	//  293  606:fstore          4
						f2 = f5;
	//  294  608:fload           6
	//  295  610:fstore_3        
						f1 = f6;
	//  296  611:fload           7
	//  297  613:fstore_2        
					}
				}
		}
_L5:
		f4 = f3;
		if(mAxisLeft.needsOffset())
			f4 = f3 + mAxisLeft.getRequiredWidthSpace(mAxisRendererLeft.getPaintAxisLabels());
		f5 = f2;
		if(mAxisRight.needsOffset())
			f5 = f2 + mAxisRight.getRequiredWidthSpace(mAxisRendererRight.getPaintAxisLabels());
		f2 = f;
		f3 = f1;
		if(mXAxis.isEnabled())
		{
			f2 = f;
			f3 = f1;
			if(mXAxis.isDrawLabelsEnabled())
			{
				f6 = (float)mXAxis.mLabelRotatedHeight + mXAxis.getYOffset();
				if(mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM)
				{
					f2 = f + f6;
					f3 = f1;
				} else
	//* 298  614:goto            136
	//* 299  617:aload_0         
	//* 300  618:getfield        #277 <Field Legend mLegend>
	//* 301  621:invokevirtual   #284 <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//* 302  624:getstatic       #418 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.ABOVE_CHART_LEFT>
	//* 303  627:if_acmpeq       669
	//* 304  630:aload_0         
	//* 305  631:getfield        #277 <Field Legend mLegend>
	//* 306  634:invokevirtual   #284 <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//* 307  637:getstatic       #421 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.ABOVE_CHART_RIGHT>
	//* 308  640:if_acmpeq       669
	//* 309  643:fload           8
	//* 310  645:fstore_1        
	//* 311  646:fload           5
	//* 312  648:fstore          4
	//* 313  650:fload           6
	//* 314  652:fstore_3        
	//* 315  653:fload           7
	//* 316  655:fstore_2        
	//* 317  656:aload_0         
	//* 318  657:getfield        #277 <Field Legend mLegend>
	//* 319  660:invokevirtual   #284 <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//* 320  663:getstatic       #424 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.ABOVE_CHART_CENTER>
	//* 321  666:if_acmpne       136
	//* 322  669:aload_0         
	//* 323  670:getfield        #277 <Field Legend mLegend>
	//* 324  673:getfield        #409 <Field float Legend.mTextHeightMax>
	//* 325  676:fstore_1        
	//* 326  677:fconst_0        
	//* 327  678:aload_0         
	//* 328  679:getfield        #277 <Field Legend mLegend>
	//* 329  682:getfield        #412 <Field float Legend.mNeededHeight>
	//* 330  685:fload_1         
	//* 331  686:fadd            
	//* 332  687:aload_0         
	//* 333  688:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//* 334  691:invokevirtual   #415 <Method float ViewPortHandler.getChartHeight()>
	//* 335  694:aload_0         
	//* 336  695:getfield        #277 <Field Legend mLegend>
	//* 337  698:invokevirtual   #302 <Method float Legend.getMaxSizePercent()>
	//* 338  701:fmul            
	//* 339  702:invokestatic    #306 <Method float Math.min(float, float)>
	//* 340  705:fadd            
	//* 341  706:fstore_2        
	//* 342  707:fload           8
	//* 343  709:fstore_1        
	//* 344  710:fload           5
	//* 345  712:fstore          4
	//* 346  714:fload           6
	//* 347  716:fstore_3        
	//* 348  717:goto            136
				if(mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP)
	//* 349  720:aload_0         
	//* 350  721:getfield        #191 <Field XAxis mXAxis>
	//* 351  724:invokevirtual   #338 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//* 352  727:getstatic       #427 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.TOP>
	//* 353  730:if_acmpne       744
				{
					f3 = f1 + f6;
	//  354  733:fload_2         
	//  355  734:fload           7
	//  356  736:fadd            
	//  357  737:fstore          4
					f2 = f;
	//  358  739:fload_1         
	//  359  740:fstore_3        
				} else
	//* 360  741:goto            269
				{
					f2 = f;
	//  361  744:fload_1         
	//  362  745:fstore_3        
					f3 = f1;
	//  363  746:fload_2         
	//  364  747:fstore          4
					if(mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTH_SIDED)
	//* 365  749:aload_0         
	//* 366  750:getfield        #191 <Field XAxis mXAxis>
	//* 367  753:invokevirtual   #338 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//* 368  756:getstatic       #430 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.BOTH_SIDED>
	//* 369  759:if_acmpne       269
					{
						f2 = f + f6;
	//  370  762:fload_1         
	//  371  763:fload           7
	//  372  765:fadd            
	//  373  766:fstore_3        
						f3 = f1 + f6;
	//  374  767:fload_2         
	//  375  768:fload           7
	//  376  770:fadd            
	//  377  771:fstore          4
					}
				}
			}
		}
		f = f3 + getExtraTopOffset();
		f1 = f5 + getExtraRightOffset();
		f2 += getExtraBottomOffset();
		f3 = f4 + getExtraLeftOffset();
		f4 = Utils.convertDpToPixel(mMinOffset);
		mViewPortHandler.restrainViewPort(Math.max(f4, f3), Math.max(f4, f), Math.max(f4, f1), Math.max(f4, f2));
		if(mLogEnabled)
		{
			Log.i("MPAndroidChart", (new StringBuilder()).append("offsetLeft: ").append(f3).append(", offsetTop: ").append(f).append(", offsetRight: ").append(f1).append(", offsetBottom: ").append(f2).toString());
			Log.i("MPAndroidChart", (new StringBuilder()).append("Content: ").append(mViewPortHandler.getContentRect().toString()).toString());
		}
_L2:
		prepareOffsetMatrix();
		prepareValuePxMatrix();
		return;
		if(mLegend.getPosition() == com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_LEFT || mLegend.getPosition() == com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_RIGHT) goto _L4; else goto _L3
_L3:
		f = f7;
		f3 = f4;
		f2 = f5;
		f1 = f6;
		if(mLegend.getPosition() != com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_CENTER) goto _L5; else goto _L4
_L4:
		f = mLegend.mTextHeightMax;
		f1 = 0.0F + Math.min(mLegend.mNeededHeight + f, mViewPortHandler.getChartHeight() * mLegend.getMaxSizePercent());
		f = f7;
		f3 = f4;
		f2 = f5;
		  goto _L5
	//* 378  773:goto            269
	}

	public void centerViewTo(float f, float f1, com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency)
	{
		float f2 = getDeltaY(axisdependency) / mViewPortHandler.getScaleY();
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokevirtual   #435 <Method float getDeltaY(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//    3    5:aload_0         
	//    4    6:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    5    9:invokevirtual   #438 <Method float ViewPortHandler.getScaleY()>
	//    6   12:fdiv            
	//    7   13:fstore          4
		float f3 = (float)getXAxis().getValues().size() / mViewPortHandler.getScaleX();
	//    8   15:aload_0         
	//    9   16:invokevirtual   #442 <Method XAxis getXAxis()>
	//   10   19:invokevirtual   #444 <Method List XAxis.getValues()>
	//   11   22:invokeinterface #154 <Method int List.size()>
	//   12   27:i2f             
	//   13   28:aload_0         
	//   14   29:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   15   32:invokevirtual   #447 <Method float ViewPortHandler.getScaleX()>
	//   16   35:fdiv            
	//   17   36:fstore          5
		addViewportJob(((Runnable) (new MoveViewJob(mViewPortHandler, f - f3 / 2.0F, f2 / 2.0F + f1, getTransformer(axisdependency), ((android.view.View) (this))))));
	//   18   38:aload_0         
	//   19   39:new             #449 <Class MoveViewJob>
	//   20   42:dup             
	//   21   43:aload_0         
	//   22   44:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   23   47:fload_1         
	//   24   48:fload           5
	//   25   50:fconst_2        
	//   26   51:fdiv            
	//   27   52:fsub            
	//   28   53:fload           4
	//   29   55:fconst_2        
	//   30   56:fdiv            
	//   31   57:fload_2         
	//   32   58:fadd            
	//   33   59:aload_0         
	//   34   60:aload_3         
	//   35   61:invokevirtual   #453 <Method Transformer getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   36   64:aload_0         
	//   37   65:invokespecial   #456 <Method void MoveViewJob(ViewPortHandler, float, float, Transformer, android.view.View)>
	//   38   68:invokevirtual   #460 <Method void addViewportJob(Runnable)>
	//   39   71:return          
	}

	public void centerViewToAnimated(float f, float f1, com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency, long l)
	{
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   0    0:getstatic       #469 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmplt          115
		{
			PointD pointd = getValuesByTouchPoint(mViewPortHandler.contentLeft(), mViewPortHandler.contentTop(), axisdependency);
	//    3    8:aload_0         
	//    4    9:aload_0         
	//    5   10:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    6   13:invokevirtual   #472 <Method float ViewPortHandler.contentLeft()>
	//    7   16:aload_0         
	//    8   17:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    9   20:invokevirtual   #475 <Method float ViewPortHandler.contentTop()>
	//   10   23:aload_3         
	//   11   24:invokevirtual   #479 <Method PointD getValuesByTouchPoint(float, float, com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   12   27:astore          8
			float f2 = getDeltaY(axisdependency) / mViewPortHandler.getScaleY();
	//   13   29:aload_0         
	//   14   30:aload_3         
	//   15   31:invokevirtual   #435 <Method float getDeltaY(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   16   34:aload_0         
	//   17   35:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   18   38:invokevirtual   #438 <Method float ViewPortHandler.getScaleY()>
	//   19   41:fdiv            
	//   20   42:fstore          6
			float f3 = (float)getXAxis().getValues().size() / mViewPortHandler.getScaleX();
	//   21   44:aload_0         
	//   22   45:invokevirtual   #442 <Method XAxis getXAxis()>
	//   23   48:invokevirtual   #444 <Method List XAxis.getValues()>
	//   24   51:invokeinterface #154 <Method int List.size()>
	//   25   56:i2f             
	//   26   57:aload_0         
	//   27   58:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   28   61:invokevirtual   #447 <Method float ViewPortHandler.getScaleX()>
	//   29   64:fdiv            
	//   30   65:fstore          7
			addViewportJob(((Runnable) (new AnimatedMoveViewJob(mViewPortHandler, f - f3 / 2.0F, f2 / 2.0F + f1, getTransformer(axisdependency), ((android.view.View) (this)), (float)pointd.x, (float)pointd.y, l))));
	//   31   67:aload_0         
	//   32   68:new             #481 <Class AnimatedMoveViewJob>
	//   33   71:dup             
	//   34   72:aload_0         
	//   35   73:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   36   76:fload_1         
	//   37   77:fload           7
	//   38   79:fconst_2        
	//   39   80:fdiv            
	//   40   81:fsub            
	//   41   82:fload           6
	//   42   84:fconst_2        
	//   43   85:fdiv            
	//   44   86:fload_2         
	//   45   87:fadd            
	//   46   88:aload_0         
	//   47   89:aload_3         
	//   48   90:invokevirtual   #453 <Method Transformer getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   49   93:aload_0         
	//   50   94:aload           8
	//   51   96:getfield        #487 <Field double PointD.x>
	//   52   99:d2f             
	//   53  100:aload           8
	//   54  102:getfield        #490 <Field double PointD.y>
	//   55  105:d2f             
	//   56  106:lload           4
	//   57  108:invokespecial   #493 <Method void AnimatedMoveViewJob(ViewPortHandler, float, float, Transformer, android.view.View, float, float, long)>
	//   58  111:invokevirtual   #460 <Method void addViewportJob(Runnable)>
			return;
	//   59  114:return          
		} else
		{
			Log.e("MPAndroidChart", "Unable to execute centerViewToAnimated(...) on API level < 11");
	//   60  115:ldc1            #237 <String "MPAndroidChart">
	//   61  117:ldc2            #495 <String "Unable to execute centerViewToAnimated(...) on API level < 11">
	//   62  120:invokestatic    #498 <Method int Log.e(String, String)>
	//   63  123:pop             
			return;
	//   64  124:return          
		}
	}

	public void computeScroll()
	{
		if(mChartTouchListener instanceof BarLineChartTouchListener)
	//*   0    0:aload_0         
	//*   1    1:getfield        #504 <Field ChartTouchListener mChartTouchListener>
	//*   2    4:instanceof      #506 <Class BarLineChartTouchListener>
	//*   3    7:ifeq            20
			((BarLineChartTouchListener)mChartTouchListener).computeScroll();
	//    4   10:aload_0         
	//    5   11:getfield        #504 <Field ChartTouchListener mChartTouchListener>
	//    6   14:checkcast       #506 <Class BarLineChartTouchListener>
	//    7   17:invokevirtual   #508 <Method void BarLineChartTouchListener.computeScroll()>
	//    8   20:return          
	}

	protected void drawGridBackground(Canvas canvas)
	{
		if(mDrawGridBackground)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field boolean mDrawGridBackground>
	//*   2    4:ifeq            22
			canvas.drawRect(mViewPortHandler.getContentRect(), mGridBackgroundPaint);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    6   12:invokevirtual   #382 <Method RectF ViewPortHandler.getContentRect()>
	//    7   15:aload_0         
	//    8   16:getfield        #512 <Field Paint mGridBackgroundPaint>
	//    9   19:invokevirtual   #518 <Method void Canvas.drawRect(RectF, Paint)>
		if(mDrawBorders)
	//*  10   22:aload_0         
	//*  11   23:getfield        #79  <Field boolean mDrawBorders>
	//*  12   26:ifeq            44
			canvas.drawRect(mViewPortHandler.getContentRect(), mBorderPaint);
	//   13   29:aload_1         
	//   14   30:aload_0         
	//   15   31:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   16   34:invokevirtual   #382 <Method RectF ViewPortHandler.getContentRect()>
	//   17   37:aload_0         
	//   18   38:getfield        #520 <Field Paint mBorderPaint>
	//   19   41:invokevirtual   #518 <Method void Canvas.drawRect(RectF, Paint)>
	//   20   44:return          
	}

	public void fitScreen()
	{
		Matrix matrix = mViewPortHandler.fitScreen();
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    2    4:invokevirtual   #523 <Method Matrix ViewPortHandler.fitScreen()>
	//    3    7:astore_1        
		mViewPortHandler.refresh(matrix, ((android.view.View) (this)), false);
	//    4    8:aload_0         
	//    5    9:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #527 <Method Matrix ViewPortHandler.refresh(Matrix, android.view.View, boolean)>
	//   10   18:pop             
		calculateOffsets();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #529 <Method void calculateOffsets()>
		postInvalidate();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #532 <Method void postInvalidate()>
	//   15   27:return          
	}

	public YAxis getAxis(com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency)
	{
		if(axisdependency == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #178 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//*   2    4:if_acmpne       12
			return mAxisLeft;
	//    3    7:aload_0         
	//    4    8:getfield        #115 <Field YAxis mAxisLeft>
	//    5   11:areturn         
		else
			return mAxisRight;
	//    6   12:aload_0         
	//    7   13:getfield        #132 <Field YAxis mAxisRight>
	//    8   16:areturn         
	}

	public YAxis getAxisLeft()
	{
		return mAxisLeft;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field YAxis mAxisLeft>
	//    2    4:areturn         
	}

	public YAxis getAxisRight()
	{
		return mAxisRight;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field YAxis mAxisRight>
	//    2    4:areturn         
	}

	public volatile BarLineScatterCandleBubbleData getData()
	{
		return (BarLineScatterCandleBubbleData)super.getData();
	//    0    0:aload_0         
	//    1    1:invokespecial   #542 <Method com.github.mikephil.charting.data.ChartData Chart.getData()>
	//    2    4:checkcast       #103 <Class BarLineScatterCandleBubbleData>
	//    3    7:areturn         
	}

	public IBarLineScatterCandleBubbleDataSet getDataSetByTouchPoint(float f, float f1)
	{
		Highlight highlight = getHighlightByTouchPoint(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokevirtual   #548 <Method Highlight getHighlightByTouchPoint(float, float)>
	//    4    6:astore_3        
		if(highlight != null)
	//*   5    7:aload_3         
	//*   6    8:ifnull          29
			return (IBarLineScatterCandleBubbleDataSet)((BarLineScatterCandleBubbleData)mData).getDataSetByIndex(highlight.getDataSetIndex());
	//    7   11:aload_0         
	//    8   12:getfield        #101 <Field com.github.mikephil.charting.data.ChartData mData>
	//    9   15:checkcast       #103 <Class BarLineScatterCandleBubbleData>
	//   10   18:aload_3         
	//   11   19:invokevirtual   #553 <Method int Highlight.getDataSetIndex()>
	//   12   22:invokevirtual   #557 <Method com.github.mikephil.charting.interfaces.datasets.IDataSet BarLineScatterCandleBubbleData.getDataSetByIndex(int)>
	//   13   25:checkcast       #559 <Class IBarLineScatterCandleBubbleDataSet>
	//   14   28:areturn         
		else
			return null;
	//   15   29:aconst_null     
	//   16   30:areturn         
	}

	public float getDeltaY(com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency)
	{
		if(axisdependency == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #178 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//*   2    4:if_acmpne       15
			return mAxisLeft.mAxisRange;
	//    3    7:aload_0         
	//    4    8:getfield        #115 <Field YAxis mAxisLeft>
	//    5   11:getfield        #172 <Field float YAxis.mAxisRange>
	//    6   14:freturn         
		else
			return mAxisRight.mAxisRange;
	//    7   15:aload_0         
	//    8   16:getfield        #132 <Field YAxis mAxisRight>
	//    9   19:getfield        #172 <Field float YAxis.mAxisRange>
	//   10   22:freturn         
	}

	public OnDrawListener getDrawListener()
	{
		return mDrawListener;
	//    0    0:aload_0         
	//    1    1:getfield        #563 <Field OnDrawListener mDrawListener>
	//    2    4:areturn         
	}

	public Entry getEntryByTouchPoint(float f, float f1)
	{
		Highlight highlight = getHighlightByTouchPoint(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokevirtual   #548 <Method Highlight getHighlightByTouchPoint(float, float)>
	//    4    6:astore_3        
		if(highlight != null)
	//*   5    7:aload_3         
	//*   6    8:ifnull          23
			return ((BarLineScatterCandleBubbleData)mData).getEntryForHighlight(highlight);
	//    7   11:aload_0         
	//    8   12:getfield        #101 <Field com.github.mikephil.charting.data.ChartData mData>
	//    9   15:checkcast       #103 <Class BarLineScatterCandleBubbleData>
	//   10   18:aload_3         
	//   11   19:invokevirtual   #569 <Method Entry BarLineScatterCandleBubbleData.getEntryForHighlight(Highlight)>
	//   12   22:areturn         
		else
			return null;
	//   13   23:aconst_null     
	//   14   24:areturn         
	}

	public int getHighestVisibleXIndex()
	{
		float af[] = new float[2];
	//    0    0:iconst_2        
	//    1    1:newarray        float[]
	//    2    3:astore_1        
		af[0] = mViewPortHandler.contentRight();
	//    3    4:aload_1         
	//    4    5:iconst_0        
	//    5    6:aload_0         
	//    6    7:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    7   10:invokevirtual   #572 <Method float ViewPortHandler.contentRight()>
	//    8   13:fastore         
		af[1] = mViewPortHandler.contentBottom();
	//    9   14:aload_1         
	//   10   15:iconst_1        
	//   11   16:aload_0         
	//   12   17:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   13   20:invokevirtual   #575 <Method float ViewPortHandler.contentBottom()>
	//   14   23:fastore         
		getTransformer(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT).pixelsToValue(af);
	//   15   24:aload_0         
	//   16   25:getstatic       #178 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//   17   28:invokevirtual   #453 <Method Transformer getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   18   31:aload_1         
	//   19   32:invokevirtual   #580 <Method void Transformer.pixelsToValue(float[])>
		if(af[0] >= (float)((BarLineScatterCandleBubbleData)mData).getXValCount())
	//*  20   35:aload_1         
	//*  21   36:iconst_0        
	//*  22   37:faload          
	//*  23   38:aload_0         
	//*  24   39:getfield        #101 <Field com.github.mikephil.charting.data.ChartData mData>
	//*  25   42:checkcast       #103 <Class BarLineScatterCandleBubbleData>
	//*  26   45:invokevirtual   #219 <Method int BarLineScatterCandleBubbleData.getXValCount()>
	//*  27   48:i2f             
	//*  28   49:fcmpl           
	//*  29   50:iflt            66
			return ((BarLineScatterCandleBubbleData)mData).getXValCount() - 1;
	//   30   53:aload_0         
	//   31   54:getfield        #101 <Field com.github.mikephil.charting.data.ChartData mData>
	//   32   57:checkcast       #103 <Class BarLineScatterCandleBubbleData>
	//   33   60:invokevirtual   #219 <Method int BarLineScatterCandleBubbleData.getXValCount()>
	//   34   63:iconst_1        
	//   35   64:isub            
	//   36   65:ireturn         
		else
			return (int)af[0];
	//   37   66:aload_1         
	//   38   67:iconst_0        
	//   39   68:faload          
	//   40   69:f2i             
	//   41   70:ireturn         
	}

	public Highlight getHighlightByTouchPoint(float f, float f1)
	{
		if(mData == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field com.github.mikephil.charting.data.ChartData mData>
	//*   2    4:ifnonnull       18
		{
			Log.e("MPAndroidChart", "Can't select by touch. No data set.");
	//    3    7:ldc1            #237 <String "MPAndroidChart">
	//    4    9:ldc2            #582 <String "Can't select by touch. No data set.">
	//    5   12:invokestatic    #498 <Method int Log.e(String, String)>
	//    6   15:pop             
			return null;
	//    7   16:aconst_null     
	//    8   17:areturn         
		} else
		{
			return getHighlighter().getHighlight(f, f1);
	//    9   18:aload_0         
	//   10   19:invokevirtual   #586 <Method ChartHighlighter getHighlighter()>
	//   11   22:fload_1         
	//   12   23:fload_2         
	//   13   24:invokevirtual   #591 <Method Highlight ChartHighlighter.getHighlight(float, float)>
	//   14   27:areturn         
		}
	}

	public int getLowestVisibleXIndex()
	{
		float af[] = new float[2];
	//    0    0:iconst_2        
	//    1    1:newarray        float[]
	//    2    3:astore_1        
		af[0] = mViewPortHandler.contentLeft();
	//    3    4:aload_1         
	//    4    5:iconst_0        
	//    5    6:aload_0         
	//    6    7:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    7   10:invokevirtual   #472 <Method float ViewPortHandler.contentLeft()>
	//    8   13:fastore         
		af[1] = mViewPortHandler.contentBottom();
	//    9   14:aload_1         
	//   10   15:iconst_1        
	//   11   16:aload_0         
	//   12   17:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   13   20:invokevirtual   #575 <Method float ViewPortHandler.contentBottom()>
	//   14   23:fastore         
		getTransformer(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT).pixelsToValue(af);
	//   15   24:aload_0         
	//   16   25:getstatic       #178 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//   17   28:invokevirtual   #453 <Method Transformer getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   18   31:aload_1         
	//   19   32:invokevirtual   #580 <Method void Transformer.pixelsToValue(float[])>
		if(af[0] <= 0.0F)
	//*  20   35:aload_1         
	//*  21   36:iconst_0        
	//*  22   37:faload          
	//*  23   38:fconst_0        
	//*  24   39:fcmpg           
	//*  25   40:ifgt            45
			return 0;
	//   26   43:iconst_0        
	//   27   44:ireturn         
		else
			return (int)(af[0] + 1.0F);
	//   28   45:aload_1         
	//   29   46:iconst_0        
	//   30   47:faload          
	//   31   48:fconst_1        
	//   32   49:fadd            
	//   33   50:f2i             
	//   34   51:ireturn         
	}

	protected float[] getMarkerPosition(Entry entry, Highlight highlight)
	{
		int i = highlight.getDataSetIndex();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #553 <Method int Highlight.getDataSetIndex()>
	//    2    4:istore          6
		float f = entry.getXIndex();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #598 <Method int Entry.getXIndex()>
	//    5   10:i2f             
	//    6   11:fstore_3        
		float f1 = entry.getVal();
	//    7   12:aload_1         
	//    8   13:invokevirtual   #601 <Method float Entry.getVal()>
	//    9   16:fstore          4
		if(this instanceof BarChart)
	//*  10   18:aload_0         
	//*  11   19:instanceof      #603 <Class BarChart>
	//*  12   22:ifeq            239
		{
			f = ((BarData)mData).getGroupSpace();
	//   13   25:aload_0         
	//   14   26:getfield        #101 <Field com.github.mikephil.charting.data.ChartData mData>
	//   15   29:checkcast       #605 <Class BarData>
	//   16   32:invokevirtual   #608 <Method float BarData.getGroupSpace()>
	//   17   35:fstore_3        
			int j = ((BarLineScatterCandleBubbleData)mData).getDataSetCount();
	//   18   36:aload_0         
	//   19   37:getfield        #101 <Field com.github.mikephil.charting.data.ChartData mData>
	//   20   40:checkcast       #103 <Class BarLineScatterCandleBubbleData>
	//   21   43:invokevirtual   #611 <Method int BarLineScatterCandleBubbleData.getDataSetCount()>
	//   22   46:istore          7
			int k = entry.getXIndex();
	//   23   48:aload_1         
	//   24   49:invokevirtual   #598 <Method int Entry.getXIndex()>
	//   25   52:istore          8
			if(this instanceof HorizontalBarChart)
	//*  26   54:aload_0         
	//*  27   55:instanceof      #613 <Class HorizontalBarChart>
	//*  28   58:ifeq            166
			{
				f1 = (float)((j - 1) * k + k + i) + (float)k * f + f / 2.0F;
	//   29   61:iload           7
	//   30   63:iconst_1        
	//   31   64:isub            
	//   32   65:iload           8
	//   33   67:imul            
	//   34   68:iload           8
	//   35   70:iadd            
	//   36   71:iload           6
	//   37   73:iadd            
	//   38   74:i2f             
	//   39   75:iload           8
	//   40   77:i2f             
	//   41   78:fload_3         
	//   42   79:fmul            
	//   43   80:fadd            
	//   44   81:fload_3         
	//   45   82:fconst_2        
	//   46   83:fdiv            
	//   47   84:fadd            
	//   48   85:fstore          4
				if(((BarEntry)entry).getVals() != null)
	//*  49   87:aload_1         
	//*  50   88:checkcast       #615 <Class BarEntry>
	//*  51   91:invokevirtual   #619 <Method float[] BarEntry.getVals()>
	//*  52   94:ifnull          158
					f = highlight.getRange().to;
	//   53   97:aload_2         
	//   54   98:invokevirtual   #623 <Method Range Highlight.getRange()>
	//   55  101:getfield        #628 <Field float Range.to>
	//   56  104:fstore_3        
				else
	//*  57  105:fload_3         
	//*  58  106:aload_0         
	//*  59  107:getfield        #632 <Field ChartAnimator mAnimator>
	//*  60  110:invokevirtual   #637 <Method float ChartAnimator.getPhaseY()>
	//*  61  113:fmul            
	//*  62  114:fstore_3        
	//*  63  115:iconst_2        
	//*  64  116:newarray        float[]
	//*  65  118:astore_1        
	//*  66  119:aload_1         
	//*  67  120:iconst_0        
	//*  68  121:fload_3         
	//*  69  122:fastore         
	//*  70  123:aload_1         
	//*  71  124:iconst_1        
	//*  72  125:fload           4
	//*  73  127:fastore         
	//*  74  128:aload_0         
	//*  75  129:aload_0         
	//*  76  130:getfield        #101 <Field com.github.mikephil.charting.data.ChartData mData>
	//*  77  133:checkcast       #103 <Class BarLineScatterCandleBubbleData>
	//*  78  136:iload           6
	//*  79  138:invokevirtual   #557 <Method com.github.mikephil.charting.interfaces.datasets.IDataSet BarLineScatterCandleBubbleData.getDataSetByIndex(int)>
	//*  80  141:checkcast       #559 <Class IBarLineScatterCandleBubbleDataSet>
	//*  81  144:invokeinterface #641 <Method com.github.mikephil.charting.components.YAxis$AxisDependency IBarLineScatterCandleBubbleDataSet.getAxisDependency()>
	//*  82  149:invokevirtual   #453 <Method Transformer getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//*  83  152:aload_1         
	//*  84  153:invokevirtual   #644 <Method void Transformer.pointValuesToPixel(float[])>
	//*  85  156:aload_1         
	//*  86  157:areturn         
					f = entry.getVal();
	//   87  158:aload_1         
	//   88  159:invokevirtual   #601 <Method float Entry.getVal()>
	//   89  162:fstore_3        
				f *= mAnimator.getPhaseY();
			} else
	//*  90  163:goto            105
			{
				f1 = (float)((j - 1) * k + k + i) + (float)k * f + f / 2.0F;
	//   91  166:iload           7
	//   92  168:iconst_1        
	//   93  169:isub            
	//   94  170:iload           8
	//   95  172:imul            
	//   96  173:iload           8
	//   97  175:iadd            
	//   98  176:iload           6
	//   99  178:iadd            
	//  100  179:i2f             
	//  101  180:iload           8
	//  102  182:i2f             
	//  103  183:fload_3         
	//  104  184:fmul            
	//  105  185:fadd            
	//  106  186:fload_3         
	//  107  187:fconst_2        
	//  108  188:fdiv            
	//  109  189:fadd            
	//  110  190:fstore          4
				float f2;
				if(((BarEntry)entry).getVals() != null)
	//* 111  192:aload_1         
	//* 112  193:checkcast       #615 <Class BarEntry>
	//* 113  196:invokevirtual   #619 <Method float[] BarEntry.getVals()>
	//* 114  199:ifnull          231
					f = highlight.getRange().to;
	//  115  202:aload_2         
	//  116  203:invokevirtual   #623 <Method Range Highlight.getRange()>
	//  117  206:getfield        #628 <Field float Range.to>
	//  118  209:fstore_3        
				else
	//* 119  210:fload_3         
	//* 120  211:aload_0         
	//* 121  212:getfield        #632 <Field ChartAnimator mAnimator>
	//* 122  215:invokevirtual   #637 <Method float ChartAnimator.getPhaseY()>
	//* 123  218:fmul            
	//* 124  219:fstore          5
	//* 125  221:fload           4
	//* 126  223:fstore_3        
	//* 127  224:fload           5
	//* 128  226:fstore          4
	//* 129  228:goto            115
					f = entry.getVal();
	//  130  231:aload_1         
	//  131  232:invokevirtual   #601 <Method float Entry.getVal()>
	//  132  235:fstore_3        
				f2 = f * mAnimator.getPhaseY();
				f = f1;
				f1 = f2;
			}
		} else
	//* 133  236:goto            210
		{
			f1 *= mAnimator.getPhaseY();
	//  134  239:fload           4
	//  135  241:aload_0         
	//  136  242:getfield        #632 <Field ChartAnimator mAnimator>
	//  137  245:invokevirtual   #637 <Method float ChartAnimator.getPhaseY()>
	//  138  248:fmul            
	//  139  249:fstore          4
		}
		entry = ((Entry) (new float[2]));
		entry[0] = f;
		entry[1] = f1;
		getTransformer(((IBarLineScatterCandleBubbleDataSet)((BarLineScatterCandleBubbleData)mData).getDataSetByIndex(i)).getAxisDependency()).pointValuesToPixel(((float []) (entry)));
		return ((float []) (entry));
	//* 140  251:goto            115
	}

	public int getMaxVisibleCount()
	{
		return mMaxVisibleCount;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int mMaxVisibleCount>
	//    2    4:ireturn         
	}

	public float getMinOffset()
	{
		return mMinOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field float mMinOffset>
	//    2    4:freturn         
	}

	public Paint getPaint(int i)
	{
		Paint paint = super.getPaint(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #650 <Method Paint Chart.getPaint(int)>
	//    3    5:astore_2        
		if(paint != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          12
			return paint;
	//    6   10:aload_2         
	//    7   11:areturn         
		switch(i)
	//*   8   12:iload_1         
		{
	//*   9   13:tableswitch     4 4: default 32
	//	               4 34
		default:
			return null;
	//   10   32:aconst_null     
	//   11   33:areturn         

		case 4: // '\004'
			return mGridBackgroundPaint;
	//   12   34:aload_0         
	//   13   35:getfield        #512 <Field Paint mGridBackgroundPaint>
	//   14   38:areturn         
		}
	}

	public PointD getPixelsForValues(float f, float f1, com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency)
	{
		float af[] = new float[2];
	//    0    0:iconst_2        
	//    1    1:newarray        float[]
	//    2    3:astore          4
		af[0] = f;
	//    3    5:aload           4
	//    4    7:iconst_0        
	//    5    8:fload_1         
	//    6    9:fastore         
		af[1] = f1;
	//    7   10:aload           4
	//    8   12:iconst_1        
	//    9   13:fload_2         
	//   10   14:fastore         
		getTransformer(axisdependency).pointValuesToPixel(af);
	//   11   15:aload_0         
	//   12   16:aload_3         
	//   13   17:invokevirtual   #453 <Method Transformer getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   14   20:aload           4
	//   15   22:invokevirtual   #644 <Method void Transformer.pointValuesToPixel(float[])>
		return new PointD(af[0], af[1]);
	//   16   25:new             #483 <Class PointD>
	//   17   28:dup             
	//   18   29:aload           4
	//   19   31:iconst_0        
	//   20   32:faload          
	//   21   33:f2d             
	//   22   34:aload           4
	//   23   36:iconst_1        
	//   24   37:faload          
	//   25   38:f2d             
	//   26   39:invokespecial   #654 <Method void PointD(double, double)>
	//   27   42:areturn         
	}

	public PointF getPosition(Entry entry, com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency)
	{
		if(entry == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
		{
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		} else
		{
			float af[] = new float[2];
	//    4    6:iconst_2        
	//    5    7:newarray        float[]
	//    6    9:astore_3        
			af[0] = entry.getXIndex();
	//    7   10:aload_3         
	//    8   11:iconst_0        
	//    9   12:aload_1         
	//   10   13:invokevirtual   #598 <Method int Entry.getXIndex()>
	//   11   16:i2f             
	//   12   17:fastore         
			af[1] = entry.getVal();
	//   13   18:aload_3         
	//   14   19:iconst_1        
	//   15   20:aload_1         
	//   16   21:invokevirtual   #601 <Method float Entry.getVal()>
	//   17   24:fastore         
			getTransformer(axisdependency).pointValuesToPixel(af);
	//   18   25:aload_0         
	//   19   26:aload_2         
	//   20   27:invokevirtual   #453 <Method Transformer getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   21   30:aload_3         
	//   22   31:invokevirtual   #644 <Method void Transformer.pointValuesToPixel(float[])>
			return new PointF(af[0], af[1]);
	//   23   34:new             #657 <Class PointF>
	//   24   37:dup             
	//   25   38:aload_3         
	//   26   39:iconst_0        
	//   27   40:faload          
	//   28   41:aload_3         
	//   29   42:iconst_1        
	//   30   43:faload          
	//   31   44:invokespecial   #660 <Method void PointF(float, float)>
	//   32   47:areturn         
		}
	}

	public YAxisRenderer getRendererLeftYAxis()
	{
		return mAxisRendererLeft;
	//    0    0:aload_0         
	//    1    1:getfield        #314 <Field YAxisRenderer mAxisRendererLeft>
	//    2    4:areturn         
	}

	public YAxisRenderer getRendererRightYAxis()
	{
		return mAxisRendererRight;
	//    0    0:aload_0         
	//    1    1:getfield        #326 <Field YAxisRenderer mAxisRendererRight>
	//    2    4:areturn         
	}

	public XAxisRenderer getRendererXAxis()
	{
		return mXAxisRenderer;
	//    0    0:aload_0         
	//    1    1:getfield        #667 <Field XAxisRenderer mXAxisRenderer>
	//    2    4:areturn         
	}

	public float getScaleX()
	{
		if(mViewPortHandler == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//*   2    4:ifnonnull       9
			return 1.0F;
	//    3    7:fconst_1        
	//    4    8:freturn         
		else
			return mViewPortHandler.getScaleX();
	//    5    9:aload_0         
	//    6   10:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    7   13:invokevirtual   #447 <Method float ViewPortHandler.getScaleX()>
	//    8   16:freturn         
	}

	public float getScaleY()
	{
		if(mViewPortHandler == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//*   2    4:ifnonnull       9
			return 1.0F;
	//    3    7:fconst_1        
	//    4    8:freturn         
		else
			return mViewPortHandler.getScaleY();
	//    5    9:aload_0         
	//    6   10:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    7   13:invokevirtual   #438 <Method float ViewPortHandler.getScaleY()>
	//    8   16:freturn         
	}

	public Transformer getTransformer(com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency)
	{
		if(axisdependency == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #178 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//*   2    4:if_acmpne       12
			return mLeftAxisTransformer;
	//    3    7:aload_0         
	//    4    8:getfield        #669 <Field Transformer mLeftAxisTransformer>
	//    5   11:areturn         
		else
			return mRightAxisTransformer;
	//    6   12:aload_0         
	//    7   13:getfield        #671 <Field Transformer mRightAxisTransformer>
	//    8   16:areturn         
	}

	public PointD getValuesByTouchPoint(float f, float f1, com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency)
	{
		float af[] = new float[2];
	//    0    0:iconst_2        
	//    1    1:newarray        float[]
	//    2    3:astore          4
		af[0] = f;
	//    3    5:aload           4
	//    4    7:iconst_0        
	//    5    8:fload_1         
	//    6    9:fastore         
		af[1] = f1;
	//    7   10:aload           4
	//    8   12:iconst_1        
	//    9   13:fload_2         
	//   10   14:fastore         
		getTransformer(axisdependency).pixelsToValue(af);
	//   11   15:aload_0         
	//   12   16:aload_3         
	//   13   17:invokevirtual   #453 <Method Transformer getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   14   20:aload           4
	//   15   22:invokevirtual   #580 <Method void Transformer.pixelsToValue(float[])>
		return new PointD(af[0], af[1]);
	//   16   25:new             #483 <Class PointD>
	//   17   28:dup             
	//   18   29:aload           4
	//   19   31:iconst_0        
	//   20   32:faload          
	//   21   33:f2d             
	//   22   34:aload           4
	//   23   36:iconst_1        
	//   24   37:faload          
	//   25   38:f2d             
	//   26   39:invokespecial   #654 <Method void PointD(double, double)>
	//   27   42:areturn         
	}

	public XAxis getXAxis()
	{
		return mXAxis;
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field XAxis mXAxis>
	//    2    4:areturn         
	}

	public float getYChartMax()
	{
		return Math.max(mAxisLeft.mAxisMaximum, mAxisRight.mAxisMaximum);
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field YAxis mAxisLeft>
	//    2    4:getfield        #169 <Field float YAxis.mAxisMaximum>
	//    3    7:aload_0         
	//    4    8:getfield        #132 <Field YAxis mAxisRight>
	//    5   11:getfield        #169 <Field float YAxis.mAxisMaximum>
	//    6   14:invokestatic    #364 <Method float Math.max(float, float)>
	//    7   17:freturn         
	}

	public float getYChartMin()
	{
		return Math.min(mAxisLeft.mAxisMinimum, mAxisRight.mAxisMinimum);
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field YAxis mAxisLeft>
	//    2    4:getfield        #166 <Field float YAxis.mAxisMinimum>
	//    3    7:aload_0         
	//    4    8:getfield        #132 <Field YAxis mAxisRight>
	//    5   11:getfield        #166 <Field float YAxis.mAxisMinimum>
	//    6   14:invokestatic    #306 <Method float Math.min(float, float)>
	//    7   17:freturn         
	}

	public float getYValueByTouchPoint(float f, float f1, com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency)
	{
		return (float)getValuesByTouchPoint(f, f1, axisdependency).y;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #479 <Method PointD getValuesByTouchPoint(float, float, com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//    5    7:getfield        #490 <Field double PointD.y>
	//    6   10:d2f             
	//    7   11:freturn         
	}

	public boolean hasNoDragOffset()
	{
		return mViewPortHandler.hasNoDragOffset();
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    2    4:invokevirtual   #678 <Method boolean ViewPortHandler.hasNoDragOffset()>
	//    3    7:ireturn         
	}

	protected void init()
	{
		super.init();
	//    0    0:aload_0         
	//    1    1:invokespecial   #681 <Method void Chart.init()>
		mAxisLeft = new YAxis(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT);
	//    2    4:aload_0         
	//    3    5:new             #117 <Class YAxis>
	//    4    8:dup             
	//    5    9:getstatic       #178 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//    6   12:invokespecial   #684 <Method void YAxis(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//    7   15:putfield        #115 <Field YAxis mAxisLeft>
		mAxisRight = new YAxis(com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT);
	//    8   18:aload_0         
	//    9   19:new             #117 <Class YAxis>
	//   10   22:dup             
	//   11   23:getstatic       #188 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.RIGHT>
	//   12   26:invokespecial   #684 <Method void YAxis(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   13   29:putfield        #132 <Field YAxis mAxisRight>
		mXAxis = new XAxis();
	//   14   32:aload_0         
	//   15   33:new             #193 <Class XAxis>
	//   16   36:dup             
	//   17   37:invokespecial   #685 <Method void XAxis()>
	//   18   40:putfield        #191 <Field XAxis mXAxis>
		mLeftAxisTransformer = new Transformer(mViewPortHandler);
	//   19   43:aload_0         
	//   20   44:new             #577 <Class Transformer>
	//   21   47:dup             
	//   22   48:aload_0         
	//   23   49:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   24   52:invokespecial   #688 <Method void Transformer(ViewPortHandler)>
	//   25   55:putfield        #669 <Field Transformer mLeftAxisTransformer>
		mRightAxisTransformer = new Transformer(mViewPortHandler);
	//   26   58:aload_0         
	//   27   59:new             #577 <Class Transformer>
	//   28   62:dup             
	//   29   63:aload_0         
	//   30   64:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   31   67:invokespecial   #688 <Method void Transformer(ViewPortHandler)>
	//   32   70:putfield        #671 <Field Transformer mRightAxisTransformer>
		mAxisRendererLeft = new YAxisRenderer(mViewPortHandler, mAxisLeft, mLeftAxisTransformer);
	//   33   73:aload_0         
	//   34   74:new             #316 <Class YAxisRenderer>
	//   35   77:dup             
	//   36   78:aload_0         
	//   37   79:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   38   82:aload_0         
	//   39   83:getfield        #115 <Field YAxis mAxisLeft>
	//   40   86:aload_0         
	//   41   87:getfield        #669 <Field Transformer mLeftAxisTransformer>
	//   42   90:invokespecial   #691 <Method void YAxisRenderer(ViewPortHandler, YAxis, Transformer)>
	//   43   93:putfield        #314 <Field YAxisRenderer mAxisRendererLeft>
		mAxisRendererRight = new YAxisRenderer(mViewPortHandler, mAxisRight, mRightAxisTransformer);
	//   44   96:aload_0         
	//   45   97:new             #316 <Class YAxisRenderer>
	//   46  100:dup             
	//   47  101:aload_0         
	//   48  102:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   49  105:aload_0         
	//   50  106:getfield        #132 <Field YAxis mAxisRight>
	//   51  109:aload_0         
	//   52  110:getfield        #671 <Field Transformer mRightAxisTransformer>
	//   53  113:invokespecial   #691 <Method void YAxisRenderer(ViewPortHandler, YAxis, Transformer)>
	//   54  116:putfield        #326 <Field YAxisRenderer mAxisRendererRight>
		mXAxisRenderer = new XAxisRenderer(mViewPortHandler, mXAxis, mLeftAxisTransformer);
	//   55  119:aload_0         
	//   56  120:new             #693 <Class XAxisRenderer>
	//   57  123:dup             
	//   58  124:aload_0         
	//   59  125:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   60  128:aload_0         
	//   61  129:getfield        #191 <Field XAxis mXAxis>
	//   62  132:aload_0         
	//   63  133:getfield        #669 <Field Transformer mLeftAxisTransformer>
	//   64  136:invokespecial   #696 <Method void XAxisRenderer(ViewPortHandler, XAxis, Transformer)>
	//   65  139:putfield        #667 <Field XAxisRenderer mXAxisRenderer>
		setHighlighter(new ChartHighlighter(((BarLineScatterCandleBubbleDataProvider) (this))));
	//   66  142:aload_0         
	//   67  143:new             #588 <Class ChartHighlighter>
	//   68  146:dup             
	//   69  147:aload_0         
	//   70  148:invokespecial   #699 <Method void ChartHighlighter(BarLineScatterCandleBubbleDataProvider)>
	//   71  151:invokevirtual   #703 <Method void setHighlighter(ChartHighlighter)>
		mChartTouchListener = ((ChartTouchListener) (new BarLineChartTouchListener(this, mViewPortHandler.getMatrixTouch())));
	//   72  154:aload_0         
	//   73  155:new             #506 <Class BarLineChartTouchListener>
	//   74  158:dup             
	//   75  159:aload_0         
	//   76  160:aload_0         
	//   77  161:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   78  164:invokevirtual   #210 <Method Matrix ViewPortHandler.getMatrixTouch()>
	//   79  167:invokespecial   #706 <Method void BarLineChartTouchListener(BarLineChartBase, Matrix)>
	//   80  170:putfield        #504 <Field ChartTouchListener mChartTouchListener>
		mGridBackgroundPaint = new Paint();
	//   81  173:aload_0         
	//   82  174:new             #708 <Class Paint>
	//   83  177:dup             
	//   84  178:invokespecial   #709 <Method void Paint()>
	//   85  181:putfield        #512 <Field Paint mGridBackgroundPaint>
		mGridBackgroundPaint.setStyle(android.graphics.Paint.Style.FILL);
	//   86  184:aload_0         
	//   87  185:getfield        #512 <Field Paint mGridBackgroundPaint>
	//   88  188:getstatic       #715 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   89  191:invokevirtual   #719 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		mGridBackgroundPaint.setColor(Color.rgb(240, 240, 240));
	//   90  194:aload_0         
	//   91  195:getfield        #512 <Field Paint mGridBackgroundPaint>
	//   92  198:sipush          240
	//   93  201:sipush          240
	//   94  204:sipush          240
	//   95  207:invokestatic    #725 <Method int Color.rgb(int, int, int)>
	//   96  210:invokevirtual   #729 <Method void Paint.setColor(int)>
		mBorderPaint = new Paint();
	//   97  213:aload_0         
	//   98  214:new             #708 <Class Paint>
	//   99  217:dup             
	//  100  218:invokespecial   #709 <Method void Paint()>
	//  101  221:putfield        #520 <Field Paint mBorderPaint>
		mBorderPaint.setStyle(android.graphics.Paint.Style.STROKE);
	//  102  224:aload_0         
	//  103  225:getfield        #520 <Field Paint mBorderPaint>
	//  104  228:getstatic       #732 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//  105  231:invokevirtual   #719 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		mBorderPaint.setColor(0xff000000);
	//  106  234:aload_0         
	//  107  235:getfield        #520 <Field Paint mBorderPaint>
	//  108  238:ldc2            #733 <Int 0xff000000>
	//  109  241:invokevirtual   #729 <Method void Paint.setColor(int)>
		mBorderPaint.setStrokeWidth(Utils.convertDpToPixel(1.0F));
	//  110  244:aload_0         
	//  111  245:getfield        #520 <Field Paint mBorderPaint>
	//  112  248:fconst_1        
	//  113  249:invokestatic    #361 <Method float Utils.convertDpToPixel(float)>
	//  114  252:invokevirtual   #737 <Method void Paint.setStrokeWidth(float)>
	//  115  255:return          
	}

	public boolean isAnyAxisInverted()
	{
		while(mAxisLeft.isInverted() || mAxisRight.isInverted()) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field YAxis mAxisLeft>
	//*   2    4:invokevirtual   #741 <Method boolean YAxis.isInverted()>
	//*   3    7:ifeq            12
			return true;
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:aload_0         
	//    7   13:getfield        #132 <Field YAxis mAxisRight>
	//    8   16:invokevirtual   #741 <Method boolean YAxis.isInverted()>
	//    9   19:ifne            10
		return false;
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public boolean isAutoScaleMinMaxEnabled()
	{
		return mAutoScaleMinMaxEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field boolean mAutoScaleMinMaxEnabled>
	//    2    4:ireturn         
	}

	public boolean isDoubleTapToZoomEnabled()
	{
		return mDoubleTapToZoomEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field boolean mDoubleTapToZoomEnabled>
	//    2    4:ireturn         
	}

	public boolean isDragEnabled()
	{
		return mDragEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field boolean mDragEnabled>
	//    2    4:ireturn         
	}

	public boolean isFullyZoomedOut()
	{
		return mViewPortHandler.isFullyZoomedOut();
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    2    4:invokevirtual   #747 <Method boolean ViewPortHandler.isFullyZoomedOut()>
	//    3    7:ireturn         
	}

	public boolean isHighlightPerDragEnabled()
	{
		return mHighlightPerDragEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field boolean mHighlightPerDragEnabled>
	//    2    4:ireturn         
	}

	public boolean isInverted(com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency)
	{
		return getAxis(axisdependency).isInverted();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #751 <Method YAxis getAxis(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//    3    5:invokevirtual   #741 <Method boolean YAxis.isInverted()>
	//    4    8:ireturn         
	}

	public boolean isPinchZoomEnabled()
	{
		return mPinchZoomEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field boolean mPinchZoomEnabled>
	//    2    4:ireturn         
	}

	public boolean isScaleXEnabled()
	{
		return mScaleXEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field boolean mScaleXEnabled>
	//    2    4:ireturn         
	}

	public boolean isScaleYEnabled()
	{
		return mScaleYEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field boolean mScaleYEnabled>
	//    2    4:ireturn         
	}

	public void moveViewTo(float f, float f1, com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency)
	{
		float f2 = getDeltaY(axisdependency) / mViewPortHandler.getScaleY();
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokevirtual   #435 <Method float getDeltaY(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//    3    5:aload_0         
	//    4    6:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    5    9:invokevirtual   #438 <Method float ViewPortHandler.getScaleY()>
	//    6   12:fdiv            
	//    7   13:fstore          4
		addViewportJob(((Runnable) (new MoveViewJob(mViewPortHandler, f, f1 + f2 / 2.0F, getTransformer(axisdependency), ((android.view.View) (this))))));
	//    8   15:aload_0         
	//    9   16:new             #449 <Class MoveViewJob>
	//   10   19:dup             
	//   11   20:aload_0         
	//   12   21:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   13   24:fload_1         
	//   14   25:fload_2         
	//   15   26:fload           4
	//   16   28:fconst_2        
	//   17   29:fdiv            
	//   18   30:fadd            
	//   19   31:aload_0         
	//   20   32:aload_3         
	//   21   33:invokevirtual   #453 <Method Transformer getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   22   36:aload_0         
	//   23   37:invokespecial   #456 <Method void MoveViewJob(ViewPortHandler, float, float, Transformer, android.view.View)>
	//   24   40:invokevirtual   #460 <Method void addViewportJob(Runnable)>
	//   25   43:return          
	}

	public void moveViewToAnimated(float f, float f1, com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency, long l)
	{
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   0    0:getstatic       #469 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmplt          87
		{
			PointD pointd = getValuesByTouchPoint(mViewPortHandler.contentLeft(), mViewPortHandler.contentTop(), axisdependency);
	//    3    8:aload_0         
	//    4    9:aload_0         
	//    5   10:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    6   13:invokevirtual   #472 <Method float ViewPortHandler.contentLeft()>
	//    7   16:aload_0         
	//    8   17:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    9   20:invokevirtual   #475 <Method float ViewPortHandler.contentTop()>
	//   10   23:aload_3         
	//   11   24:invokevirtual   #479 <Method PointD getValuesByTouchPoint(float, float, com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   12   27:astore          7
			float f2 = getDeltaY(axisdependency) / mViewPortHandler.getScaleY();
	//   13   29:aload_0         
	//   14   30:aload_3         
	//   15   31:invokevirtual   #435 <Method float getDeltaY(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   16   34:aload_0         
	//   17   35:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   18   38:invokevirtual   #438 <Method float ViewPortHandler.getScaleY()>
	//   19   41:fdiv            
	//   20   42:fstore          6
			addViewportJob(((Runnable) (new AnimatedMoveViewJob(mViewPortHandler, f, f1 + f2 / 2.0F, getTransformer(axisdependency), ((android.view.View) (this)), (float)pointd.x, (float)pointd.y, l))));
	//   21   44:aload_0         
	//   22   45:new             #481 <Class AnimatedMoveViewJob>
	//   23   48:dup             
	//   24   49:aload_0         
	//   25   50:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   26   53:fload_1         
	//   27   54:fload_2         
	//   28   55:fload           6
	//   29   57:fconst_2        
	//   30   58:fdiv            
	//   31   59:fadd            
	//   32   60:aload_0         
	//   33   61:aload_3         
	//   34   62:invokevirtual   #453 <Method Transformer getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   35   65:aload_0         
	//   36   66:aload           7
	//   37   68:getfield        #487 <Field double PointD.x>
	//   38   71:d2f             
	//   39   72:aload           7
	//   40   74:getfield        #490 <Field double PointD.y>
	//   41   77:d2f             
	//   42   78:lload           4
	//   43   80:invokespecial   #493 <Method void AnimatedMoveViewJob(ViewPortHandler, float, float, Transformer, android.view.View, float, float, long)>
	//   44   83:invokevirtual   #460 <Method void addViewportJob(Runnable)>
			return;
	//   45   86:return          
		} else
		{
			Log.e("MPAndroidChart", "Unable to execute moveViewToAnimated(...) on API level < 11");
	//   46   87:ldc1            #237 <String "MPAndroidChart">
	//   47   89:ldc2            #758 <String "Unable to execute moveViewToAnimated(...) on API level < 11">
	//   48   92:invokestatic    #498 <Method int Log.e(String, String)>
	//   49   95:pop             
			return;
	//   50   96:return          
		}
	}

	public void moveViewToX(float f)
	{
		addViewportJob(((Runnable) (new MoveViewJob(mViewPortHandler, f, 0.0F, getTransformer(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT), ((android.view.View) (this))))));
	//    0    0:aload_0         
	//    1    1:new             #449 <Class MoveViewJob>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    5    9:fload_1         
	//    6   10:fconst_0        
	//    7   11:aload_0         
	//    8   12:getstatic       #178 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//    9   15:invokevirtual   #453 <Method Transformer getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   10   18:aload_0         
	//   11   19:invokespecial   #456 <Method void MoveViewJob(ViewPortHandler, float, float, Transformer, android.view.View)>
	//   12   22:invokevirtual   #460 <Method void addViewportJob(Runnable)>
	//   13   25:return          
	}

	public void moveViewToY(float f, com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency)
	{
		float f1 = getDeltaY(axisdependency) / mViewPortHandler.getScaleY();
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #435 <Method float getDeltaY(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//    3    5:aload_0         
	//    4    6:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    5    9:invokevirtual   #438 <Method float ViewPortHandler.getScaleY()>
	//    6   12:fdiv            
	//    7   13:fstore_3        
		addViewportJob(((Runnable) (new MoveViewJob(mViewPortHandler, 0.0F, f1 / 2.0F + f, getTransformer(axisdependency), ((android.view.View) (this))))));
	//    8   14:aload_0         
	//    9   15:new             #449 <Class MoveViewJob>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   13   23:fconst_0        
	//   14   24:fload_3         
	//   15   25:fconst_2        
	//   16   26:fdiv            
	//   17   27:fload_1         
	//   18   28:fadd            
	//   19   29:aload_0         
	//   20   30:aload_2         
	//   21   31:invokevirtual   #453 <Method Transformer getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   22   34:aload_0         
	//   23   35:invokespecial   #456 <Method void MoveViewJob(ViewPortHandler, float, float, Transformer, android.view.View)>
	//   24   38:invokevirtual   #460 <Method void addViewportJob(Runnable)>
	//   25   41:return          
	}

	public void notifyDataSetChanged()
	{
		if(mData == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field com.github.mikephil.charting.data.ChartData mData>
	//*   2    4:ifnonnull       24
		{
			if(mLogEnabled)
	//*   3    7:aload_0         
	//*   4    8:getfield        #235 <Field boolean mLogEnabled>
	//*   5   11:ifeq            23
				Log.i("MPAndroidChart", "Preparing... DATA NOT SET.");
	//    6   14:ldc1            #237 <String "MPAndroidChart">
	//    7   16:ldc2            #764 <String "Preparing... DATA NOT SET.">
	//    8   19:invokestatic    #272 <Method int Log.i(String, String)>
	//    9   22:pop             
			return;
	//   10   23:return          
		}
		if(mLogEnabled)
	//*  11   24:aload_0         
	//*  12   25:getfield        #235 <Field boolean mLogEnabled>
	//*  13   28:ifeq            40
			Log.i("MPAndroidChart", "Preparing...");
	//   14   31:ldc1            #237 <String "MPAndroidChart">
	//   15   33:ldc2            #766 <String "Preparing...">
	//   16   36:invokestatic    #272 <Method int Log.i(String, String)>
	//   17   39:pop             
		if(mRenderer != null)
	//*  18   40:aload_0         
	//*  19   41:getfield        #770 <Field DataRenderer mRenderer>
	//*  20   44:ifnull          54
			mRenderer.initBuffers();
	//   21   47:aload_0         
	//   22   48:getfield        #770 <Field DataRenderer mRenderer>
	//   23   51:invokevirtual   #775 <Method void DataRenderer.initBuffers()>
		calcMinMax();
	//   24   54:aload_0         
	//   25   55:invokevirtual   #777 <Method void calcMinMax()>
		mAxisRendererLeft.computeAxis(mAxisLeft.mAxisMinimum, mAxisLeft.mAxisMaximum);
	//   26   58:aload_0         
	//   27   59:getfield        #314 <Field YAxisRenderer mAxisRendererLeft>
	//   28   62:aload_0         
	//   29   63:getfield        #115 <Field YAxis mAxisLeft>
	//   30   66:getfield        #166 <Field float YAxis.mAxisMinimum>
	//   31   69:aload_0         
	//   32   70:getfield        #115 <Field YAxis mAxisLeft>
	//   33   73:getfield        #169 <Field float YAxis.mAxisMaximum>
	//   34   76:invokevirtual   #780 <Method void YAxisRenderer.computeAxis(float, float)>
		mAxisRendererRight.computeAxis(mAxisRight.mAxisMinimum, mAxisRight.mAxisMaximum);
	//   35   79:aload_0         
	//   36   80:getfield        #326 <Field YAxisRenderer mAxisRendererRight>
	//   37   83:aload_0         
	//   38   84:getfield        #132 <Field YAxis mAxisRight>
	//   39   87:getfield        #166 <Field float YAxis.mAxisMinimum>
	//   40   90:aload_0         
	//   41   91:getfield        #132 <Field YAxis mAxisRight>
	//   42   94:getfield        #169 <Field float YAxis.mAxisMaximum>
	//   43   97:invokevirtual   #780 <Method void YAxisRenderer.computeAxis(float, float)>
		mXAxisRenderer.computeAxis(((BarLineScatterCandleBubbleData)mData).getXValMaximumLength(), ((BarLineScatterCandleBubbleData)mData).getXVals());
	//   44  100:aload_0         
	//   45  101:getfield        #667 <Field XAxisRenderer mXAxisRenderer>
	//   46  104:aload_0         
	//   47  105:getfield        #101 <Field com.github.mikephil.charting.data.ChartData mData>
	//   48  108:checkcast       #103 <Class BarLineScatterCandleBubbleData>
	//   49  111:invokevirtual   #783 <Method float BarLineScatterCandleBubbleData.getXValMaximumLength()>
	//   50  114:aload_0         
	//   51  115:getfield        #101 <Field com.github.mikephil.charting.data.ChartData mData>
	//   52  118:checkcast       #103 <Class BarLineScatterCandleBubbleData>
	//   53  121:invokevirtual   #149 <Method List BarLineScatterCandleBubbleData.getXVals()>
	//   54  124:invokevirtual   #786 <Method void XAxisRenderer.computeAxis(float, List)>
		if(mLegend != null)
	//*  55  127:aload_0         
	//*  56  128:getfield        #277 <Field Legend mLegend>
	//*  57  131:ifnull          145
			mLegendRenderer.computeLegend(mData);
	//   58  134:aload_0         
	//   59  135:getfield        #790 <Field LegendRenderer mLegendRenderer>
	//   60  138:aload_0         
	//   61  139:getfield        #101 <Field com.github.mikephil.charting.data.ChartData mData>
	//   62  142:invokevirtual   #796 <Method void LegendRenderer.computeLegend(com.github.mikephil.charting.data.ChartData)>
		calculateOffsets();
	//   63  145:aload_0         
	//   64  146:invokevirtual   #529 <Method void calculateOffsets()>
	//   65  149:return          
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #799 <Method void Chart.onDraw(Canvas)>
		if(mData != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #101 <Field com.github.mikephil.charting.data.ChartData mData>
	//*   5    9:ifnonnull       13
	//*   6   12:return          
		{
			long l = System.currentTimeMillis();
	//    7   13:invokestatic    #805 <Method long System.currentTimeMillis()>
	//    8   16:lstore          4
			calcModulus();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #807 <Method void calcModulus()>
			mXAxisRenderer.calcXBounds(((BarLineScatterCandleBubbleDataProvider) (this)), mXAxis.mAxisLabelModulus);
	//   11   22:aload_0         
	//   12   23:getfield        #667 <Field XAxisRenderer mXAxisRenderer>
	//   13   26:aload_0         
	//   14   27:aload_0         
	//   15   28:getfield        #191 <Field XAxis mXAxis>
	//   16   31:getfield        #232 <Field int XAxis.mAxisLabelModulus>
	//   17   34:invokevirtual   #811 <Method void XAxisRenderer.calcXBounds(BarLineScatterCandleBubbleDataProvider, int)>
			mRenderer.calcXBounds(((BarLineScatterCandleBubbleDataProvider) (this)), mXAxis.mAxisLabelModulus);
	//   18   37:aload_0         
	//   19   38:getfield        #770 <Field DataRenderer mRenderer>
	//   20   41:aload_0         
	//   21   42:aload_0         
	//   22   43:getfield        #191 <Field XAxis mXAxis>
	//   23   46:getfield        #232 <Field int XAxis.mAxisLabelModulus>
	//   24   49:invokevirtual   #812 <Method void DataRenderer.calcXBounds(BarLineScatterCandleBubbleDataProvider, int)>
			drawGridBackground(canvas);
	//   25   52:aload_0         
	//   26   53:aload_1         
	//   27   54:invokevirtual   #814 <Method void drawGridBackground(Canvas)>
			if(mAxisLeft.isEnabled())
	//*  28   57:aload_0         
	//*  29   58:getfield        #115 <Field YAxis mAxisLeft>
	//*  30   61:invokevirtual   #815 <Method boolean YAxis.isEnabled()>
	//*  31   64:ifeq            88
				mAxisRendererLeft.computeAxis(mAxisLeft.mAxisMinimum, mAxisLeft.mAxisMaximum);
	//   32   67:aload_0         
	//   33   68:getfield        #314 <Field YAxisRenderer mAxisRendererLeft>
	//   34   71:aload_0         
	//   35   72:getfield        #115 <Field YAxis mAxisLeft>
	//   36   75:getfield        #166 <Field float YAxis.mAxisMinimum>
	//   37   78:aload_0         
	//   38   79:getfield        #115 <Field YAxis mAxisLeft>
	//   39   82:getfield        #169 <Field float YAxis.mAxisMaximum>
	//   40   85:invokevirtual   #780 <Method void YAxisRenderer.computeAxis(float, float)>
			if(mAxisRight.isEnabled())
	//*  41   88:aload_0         
	//*  42   89:getfield        #132 <Field YAxis mAxisRight>
	//*  43   92:invokevirtual   #815 <Method boolean YAxis.isEnabled()>
	//*  44   95:ifeq            119
				mAxisRendererRight.computeAxis(mAxisRight.mAxisMinimum, mAxisRight.mAxisMaximum);
	//   45   98:aload_0         
	//   46   99:getfield        #326 <Field YAxisRenderer mAxisRendererRight>
	//   47  102:aload_0         
	//   48  103:getfield        #132 <Field YAxis mAxisRight>
	//   49  106:getfield        #166 <Field float YAxis.mAxisMinimum>
	//   50  109:aload_0         
	//   51  110:getfield        #132 <Field YAxis mAxisRight>
	//   52  113:getfield        #169 <Field float YAxis.mAxisMaximum>
	//   53  116:invokevirtual   #780 <Method void YAxisRenderer.computeAxis(float, float)>
			mXAxisRenderer.renderAxisLine(canvas);
	//   54  119:aload_0         
	//   55  120:getfield        #667 <Field XAxisRenderer mXAxisRenderer>
	//   56  123:aload_1         
	//   57  124:invokevirtual   #818 <Method void XAxisRenderer.renderAxisLine(Canvas)>
			mAxisRendererLeft.renderAxisLine(canvas);
	//   58  127:aload_0         
	//   59  128:getfield        #314 <Field YAxisRenderer mAxisRendererLeft>
	//   60  131:aload_1         
	//   61  132:invokevirtual   #819 <Method void YAxisRenderer.renderAxisLine(Canvas)>
			mAxisRendererRight.renderAxisLine(canvas);
	//   62  135:aload_0         
	//   63  136:getfield        #326 <Field YAxisRenderer mAxisRendererRight>
	//   64  139:aload_1         
	//   65  140:invokevirtual   #819 <Method void YAxisRenderer.renderAxisLine(Canvas)>
			if(mAutoScaleMinMaxEnabled)
	//*  66  143:aload_0         
	//*  67  144:getfield        #59  <Field boolean mAutoScaleMinMaxEnabled>
	//*  68  147:ifeq            220
			{
				int i = getLowestVisibleXIndex();
	//   69  150:aload_0         
	//   70  151:invokevirtual   #107 <Method int getLowestVisibleXIndex()>
	//   71  154:istore_2        
				int k = getHighestVisibleXIndex();
	//   72  155:aload_0         
	//   73  156:invokevirtual   #110 <Method int getHighestVisibleXIndex()>
	//   74  159:istore_3        
				if(mAutoScaleLastLowestVisibleXIndex == null || mAutoScaleLastLowestVisibleXIndex.intValue() != i || mAutoScaleLastHighestVisibleXIndex == null || mAutoScaleLastHighestVisibleXIndex.intValue() != k)
	//*  75  160:aload_0         
	//*  76  161:getfield        #61  <Field Integer mAutoScaleLastLowestVisibleXIndex>
	//*  77  164:ifnull          196
	//*  78  167:aload_0         
	//*  79  168:getfield        #61  <Field Integer mAutoScaleLastLowestVisibleXIndex>
	//*  80  171:invokevirtual   #824 <Method int Integer.intValue()>
	//*  81  174:iload_2         
	//*  82  175:icmpne          196
	//*  83  178:aload_0         
	//*  84  179:getfield        #63  <Field Integer mAutoScaleLastHighestVisibleXIndex>
	//*  85  182:ifnull          196
	//*  86  185:aload_0         
	//*  87  186:getfield        #63  <Field Integer mAutoScaleLastHighestVisibleXIndex>
	//*  88  189:invokevirtual   #824 <Method int Integer.intValue()>
	//*  89  192:iload_3         
	//*  90  193:icmpeq          220
				{
					calcMinMax();
	//   91  196:aload_0         
	//   92  197:invokevirtual   #777 <Method void calcMinMax()>
					calculateOffsets();
	//   93  200:aload_0         
	//   94  201:invokevirtual   #529 <Method void calculateOffsets()>
					mAutoScaleLastLowestVisibleXIndex = Integer.valueOf(i);
	//   95  204:aload_0         
	//   96  205:iload_2         
	//   97  206:invokestatic    #828 <Method Integer Integer.valueOf(int)>
	//   98  209:putfield        #61  <Field Integer mAutoScaleLastLowestVisibleXIndex>
					mAutoScaleLastHighestVisibleXIndex = Integer.valueOf(k);
	//   99  212:aload_0         
	//  100  213:iload_3         
	//  101  214:invokestatic    #828 <Method Integer Integer.valueOf(int)>
	//  102  217:putfield        #63  <Field Integer mAutoScaleLastHighestVisibleXIndex>
				}
			}
			int j = canvas.save();
	//  103  220:aload_1         
	//  104  221:invokevirtual   #831 <Method int Canvas.save()>
	//  105  224:istore_2        
			canvas.clipRect(mViewPortHandler.getContentRect());
	//  106  225:aload_1         
	//  107  226:aload_0         
	//  108  227:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//  109  230:invokevirtual   #382 <Method RectF ViewPortHandler.getContentRect()>
	//  110  233:invokevirtual   #835 <Method boolean Canvas.clipRect(RectF)>
	//  111  236:pop             
			mXAxisRenderer.renderGridLines(canvas);
	//  112  237:aload_0         
	//  113  238:getfield        #667 <Field XAxisRenderer mXAxisRenderer>
	//  114  241:aload_1         
	//  115  242:invokevirtual   #838 <Method void XAxisRenderer.renderGridLines(Canvas)>
			mAxisRendererLeft.renderGridLines(canvas);
	//  116  245:aload_0         
	//  117  246:getfield        #314 <Field YAxisRenderer mAxisRendererLeft>
	//  118  249:aload_1         
	//  119  250:invokevirtual   #839 <Method void YAxisRenderer.renderGridLines(Canvas)>
			mAxisRendererRight.renderGridLines(canvas);
	//  120  253:aload_0         
	//  121  254:getfield        #326 <Field YAxisRenderer mAxisRendererRight>
	//  122  257:aload_1         
	//  123  258:invokevirtual   #839 <Method void YAxisRenderer.renderGridLines(Canvas)>
			if(mXAxis.isDrawLimitLinesBehindDataEnabled())
	//* 124  261:aload_0         
	//* 125  262:getfield        #191 <Field XAxis mXAxis>
	//* 126  265:invokevirtual   #842 <Method boolean XAxis.isDrawLimitLinesBehindDataEnabled()>
	//* 127  268:ifeq            279
				mXAxisRenderer.renderLimitLines(canvas);
	//  128  271:aload_0         
	//  129  272:getfield        #667 <Field XAxisRenderer mXAxisRenderer>
	//  130  275:aload_1         
	//  131  276:invokevirtual   #845 <Method void XAxisRenderer.renderLimitLines(Canvas)>
			if(mAxisLeft.isDrawLimitLinesBehindDataEnabled())
	//* 132  279:aload_0         
	//* 133  280:getfield        #115 <Field YAxis mAxisLeft>
	//* 134  283:invokevirtual   #846 <Method boolean YAxis.isDrawLimitLinesBehindDataEnabled()>
	//* 135  286:ifeq            297
				mAxisRendererLeft.renderLimitLines(canvas);
	//  136  289:aload_0         
	//  137  290:getfield        #314 <Field YAxisRenderer mAxisRendererLeft>
	//  138  293:aload_1         
	//  139  294:invokevirtual   #847 <Method void YAxisRenderer.renderLimitLines(Canvas)>
			if(mAxisRight.isDrawLimitLinesBehindDataEnabled())
	//* 140  297:aload_0         
	//* 141  298:getfield        #132 <Field YAxis mAxisRight>
	//* 142  301:invokevirtual   #846 <Method boolean YAxis.isDrawLimitLinesBehindDataEnabled()>
	//* 143  304:ifeq            315
				mAxisRendererRight.renderLimitLines(canvas);
	//  144  307:aload_0         
	//  145  308:getfield        #326 <Field YAxisRenderer mAxisRendererRight>
	//  146  311:aload_1         
	//  147  312:invokevirtual   #847 <Method void YAxisRenderer.renderLimitLines(Canvas)>
			mRenderer.drawData(canvas);
	//  148  315:aload_0         
	//  149  316:getfield        #770 <Field DataRenderer mRenderer>
	//  150  319:aload_1         
	//  151  320:invokevirtual   #850 <Method void DataRenderer.drawData(Canvas)>
			if(!mXAxis.isDrawLimitLinesBehindDataEnabled())
	//* 152  323:aload_0         
	//* 153  324:getfield        #191 <Field XAxis mXAxis>
	//* 154  327:invokevirtual   #842 <Method boolean XAxis.isDrawLimitLinesBehindDataEnabled()>
	//* 155  330:ifne            341
				mXAxisRenderer.renderLimitLines(canvas);
	//  156  333:aload_0         
	//  157  334:getfield        #667 <Field XAxisRenderer mXAxisRenderer>
	//  158  337:aload_1         
	//  159  338:invokevirtual   #845 <Method void XAxisRenderer.renderLimitLines(Canvas)>
			if(!mAxisLeft.isDrawLimitLinesBehindDataEnabled())
	//* 160  341:aload_0         
	//* 161  342:getfield        #115 <Field YAxis mAxisLeft>
	//* 162  345:invokevirtual   #846 <Method boolean YAxis.isDrawLimitLinesBehindDataEnabled()>
	//* 163  348:ifne            359
				mAxisRendererLeft.renderLimitLines(canvas);
	//  164  351:aload_0         
	//  165  352:getfield        #314 <Field YAxisRenderer mAxisRendererLeft>
	//  166  355:aload_1         
	//  167  356:invokevirtual   #847 <Method void YAxisRenderer.renderLimitLines(Canvas)>
			if(!mAxisRight.isDrawLimitLinesBehindDataEnabled())
	//* 168  359:aload_0         
	//* 169  360:getfield        #132 <Field YAxis mAxisRight>
	//* 170  363:invokevirtual   #846 <Method boolean YAxis.isDrawLimitLinesBehindDataEnabled()>
	//* 171  366:ifne            377
				mAxisRendererRight.renderLimitLines(canvas);
	//  172  369:aload_0         
	//  173  370:getfield        #326 <Field YAxisRenderer mAxisRendererRight>
	//  174  373:aload_1         
	//  175  374:invokevirtual   #847 <Method void YAxisRenderer.renderLimitLines(Canvas)>
			if(valuesToHighlight())
	//* 176  377:aload_0         
	//* 177  378:invokevirtual   #853 <Method boolean valuesToHighlight()>
	//* 178  381:ifeq            396
				mRenderer.drawHighlighted(canvas, mIndicesToHighlight);
	//  179  384:aload_0         
	//  180  385:getfield        #770 <Field DataRenderer mRenderer>
	//  181  388:aload_1         
	//  182  389:aload_0         
	//  183  390:getfield        #857 <Field Highlight[] mIndicesToHighlight>
	//  184  393:invokevirtual   #861 <Method void DataRenderer.drawHighlighted(Canvas, Highlight[])>
			canvas.restoreToCount(j);
	//  185  396:aload_1         
	//  186  397:iload_2         
	//  187  398:invokevirtual   #864 <Method void Canvas.restoreToCount(int)>
			mRenderer.drawExtras(canvas);
	//  188  401:aload_0         
	//  189  402:getfield        #770 <Field DataRenderer mRenderer>
	//  190  405:aload_1         
	//  191  406:invokevirtual   #867 <Method void DataRenderer.drawExtras(Canvas)>
			mXAxisRenderer.renderAxisLabels(canvas);
	//  192  409:aload_0         
	//  193  410:getfield        #667 <Field XAxisRenderer mXAxisRenderer>
	//  194  413:aload_1         
	//  195  414:invokevirtual   #870 <Method void XAxisRenderer.renderAxisLabels(Canvas)>
			mAxisRendererLeft.renderAxisLabels(canvas);
	//  196  417:aload_0         
	//  197  418:getfield        #314 <Field YAxisRenderer mAxisRendererLeft>
	//  198  421:aload_1         
	//  199  422:invokevirtual   #871 <Method void YAxisRenderer.renderAxisLabels(Canvas)>
			mAxisRendererRight.renderAxisLabels(canvas);
	//  200  425:aload_0         
	//  201  426:getfield        #326 <Field YAxisRenderer mAxisRendererRight>
	//  202  429:aload_1         
	//  203  430:invokevirtual   #871 <Method void YAxisRenderer.renderAxisLabels(Canvas)>
			mRenderer.drawValues(canvas);
	//  204  433:aload_0         
	//  205  434:getfield        #770 <Field DataRenderer mRenderer>
	//  206  437:aload_1         
	//  207  438:invokevirtual   #874 <Method void DataRenderer.drawValues(Canvas)>
			mLegendRenderer.renderLegend(canvas);
	//  208  441:aload_0         
	//  209  442:getfield        #790 <Field LegendRenderer mLegendRenderer>
	//  210  445:aload_1         
	//  211  446:invokevirtual   #877 <Method void LegendRenderer.renderLegend(Canvas)>
			drawMarkers(canvas);
	//  212  449:aload_0         
	//  213  450:aload_1         
	//  214  451:invokevirtual   #880 <Method void drawMarkers(Canvas)>
			drawDescription(canvas);
	//  215  454:aload_0         
	//  216  455:aload_1         
	//  217  456:invokevirtual   #883 <Method void drawDescription(Canvas)>
			if(mLogEnabled)
	//* 218  459:aload_0         
	//* 219  460:getfield        #235 <Field boolean mLogEnabled>
	//* 220  463:ifeq            12
			{
				l = System.currentTimeMillis() - l;
	//  221  466:invokestatic    #805 <Method long System.currentTimeMillis()>
	//  222  469:lload           4
	//  223  471:lsub            
	//  224  472:lstore          4
				totalTime = totalTime + l;
	//  225  474:aload_0         
	//  226  475:aload_0         
	//  227  476:getfield        #84  <Field long totalTime>
	//  228  479:lload           4
	//  229  481:ladd            
	//  230  482:putfield        #84  <Field long totalTime>
				drawCycles = drawCycles + 1L;
	//  231  485:aload_0         
	//  232  486:aload_0         
	//  233  487:getfield        #86  <Field long drawCycles>
	//  234  490:lconst_1        
	//  235  491:ladd            
	//  236  492:putfield        #86  <Field long drawCycles>
				long l1 = totalTime / drawCycles;
	//  237  495:aload_0         
	//  238  496:getfield        #84  <Field long totalTime>
	//  239  499:aload_0         
	//  240  500:getfield        #86  <Field long drawCycles>
	//  241  503:ldiv            
	//  242  504:lstore          6
				Log.i("MPAndroidChart", (new StringBuilder()).append("Drawtime: ").append(l).append(" ms, average: ").append(l1).append(" ms, cycles: ").append(drawCycles).toString());
	//  243  506:ldc1            #237 <String "MPAndroidChart">
	//  244  508:new             #239 <Class StringBuilder>
	//  245  511:dup             
	//  246  512:invokespecial   #241 <Method void StringBuilder()>
	//  247  515:ldc2            #885 <String "Drawtime: ">
	//  248  518:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//  249  521:lload           4
	//  250  523:invokevirtual   #888 <Method StringBuilder StringBuilder.append(long)>
	//  251  526:ldc2            #890 <String " ms, average: ">
	//  252  529:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//  253  532:lload           6
	//  254  534:invokevirtual   #888 <Method StringBuilder StringBuilder.append(long)>
	//  255  537:ldc2            #892 <String " ms, cycles: ">
	//  256  540:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//  257  543:aload_0         
	//  258  544:getfield        #86  <Field long drawCycles>
	//  259  547:invokevirtual   #888 <Method StringBuilder StringBuilder.append(long)>
	//  260  550:invokevirtual   #266 <Method String StringBuilder.toString()>
	//  261  553:invokestatic    #272 <Method int Log.i(String, String)>
	//  262  556:pop             
				return;
	//  263  557:return          
			}
		}
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		super.onTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #896 <Method boolean Chart.onTouchEvent(MotionEvent)>
	//    3    5:pop             
		while(mChartTouchListener == null || mData == null || !mTouchEnabled) 
	//*   4    6:aload_0         
	//*   5    7:getfield        #504 <Field ChartTouchListener mChartTouchListener>
	//*   6   10:ifnull          20
	//*   7   13:aload_0         
	//*   8   14:getfield        #101 <Field com.github.mikephil.charting.data.ChartData mData>
	//*   9   17:ifnonnull       22
			return false;
	//   10   20:iconst_0        
	//   11   21:ireturn         
	//   12   22:aload_0         
	//   13   23:getfield        #899 <Field boolean mTouchEnabled>
	//   14   26:ifeq            20
		return mChartTouchListener.onTouch(((android.view.View) (this)), motionevent);
	//   15   29:aload_0         
	//   16   30:getfield        #504 <Field ChartTouchListener mChartTouchListener>
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #905 <Method boolean ChartTouchListener.onTouch(android.view.View, MotionEvent)>
	//   20   38:ireturn         
	}

	protected void prepareOffsetMatrix()
	{
		mRightAxisTransformer.prepareMatrixOffset(mAxisRight.isInverted());
	//    0    0:aload_0         
	//    1    1:getfield        #671 <Field Transformer mRightAxisTransformer>
	//    2    4:aload_0         
	//    3    5:getfield        #132 <Field YAxis mAxisRight>
	//    4    8:invokevirtual   #741 <Method boolean YAxis.isInverted()>
	//    5   11:invokevirtual   #909 <Method void Transformer.prepareMatrixOffset(boolean)>
		mLeftAxisTransformer.prepareMatrixOffset(mAxisLeft.isInverted());
	//    6   14:aload_0         
	//    7   15:getfield        #669 <Field Transformer mLeftAxisTransformer>
	//    8   18:aload_0         
	//    9   19:getfield        #115 <Field YAxis mAxisLeft>
	//   10   22:invokevirtual   #741 <Method boolean YAxis.isInverted()>
	//   11   25:invokevirtual   #909 <Method void Transformer.prepareMatrixOffset(boolean)>
	//   12   28:return          
	}

	protected void prepareValuePxMatrix()
	{
		if(mLogEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #235 <Field boolean mLogEnabled>
	//*   2    4:ifeq            62
			Log.i("MPAndroidChart", (new StringBuilder()).append("Preparing Value-Px Matrix, xmin: ").append(mXChartMin).append(", xmax: ").append(mXChartMax).append(", xdelta: ").append(mDeltaX).toString());
	//    3    7:ldc1            #237 <String "MPAndroidChart">
	//    4    9:new             #239 <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #241 <Method void StringBuilder()>
	//    7   16:ldc2            #911 <String "Preparing Value-Px Matrix, xmin: ">
	//    8   19:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//    9   22:aload_0         
	//   10   23:getfield        #160 <Field float mXChartMin>
	//   11   26:invokevirtual   #262 <Method StringBuilder StringBuilder.append(float)>
	//   12   29:ldc2            #913 <String ", xmax: ">
	//   13   32:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   14   35:aload_0         
	//   15   36:getfield        #157 <Field float mXChartMax>
	//   16   39:invokevirtual   #262 <Method StringBuilder StringBuilder.append(float)>
	//   17   42:ldc2            #915 <String ", xdelta: ">
	//   18   45:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//   19   48:aload_0         
	//   20   49:getfield        #163 <Field float mDeltaX>
	//   21   52:invokevirtual   #262 <Method StringBuilder StringBuilder.append(float)>
	//   22   55:invokevirtual   #266 <Method String StringBuilder.toString()>
	//   23   58:invokestatic    #272 <Method int Log.i(String, String)>
	//   24   61:pop             
		mRightAxisTransformer.prepareMatrixValuePx(mXChartMin, mDeltaX, mAxisRight.mAxisRange, mAxisRight.mAxisMinimum);
	//   25   62:aload_0         
	//   26   63:getfield        #671 <Field Transformer mRightAxisTransformer>
	//   27   66:aload_0         
	//   28   67:getfield        #160 <Field float mXChartMin>
	//   29   70:aload_0         
	//   30   71:getfield        #163 <Field float mDeltaX>
	//   31   74:aload_0         
	//   32   75:getfield        #132 <Field YAxis mAxisRight>
	//   33   78:getfield        #172 <Field float YAxis.mAxisRange>
	//   34   81:aload_0         
	//   35   82:getfield        #132 <Field YAxis mAxisRight>
	//   36   85:getfield        #166 <Field float YAxis.mAxisMinimum>
	//   37   88:invokevirtual   #918 <Method void Transformer.prepareMatrixValuePx(float, float, float, float)>
		mLeftAxisTransformer.prepareMatrixValuePx(mXChartMin, mDeltaX, mAxisLeft.mAxisRange, mAxisLeft.mAxisMinimum);
	//   38   91:aload_0         
	//   39   92:getfield        #669 <Field Transformer mLeftAxisTransformer>
	//   40   95:aload_0         
	//   41   96:getfield        #160 <Field float mXChartMin>
	//   42   99:aload_0         
	//   43  100:getfield        #163 <Field float mDeltaX>
	//   44  103:aload_0         
	//   45  104:getfield        #115 <Field YAxis mAxisLeft>
	//   46  107:getfield        #172 <Field float YAxis.mAxisRange>
	//   47  110:aload_0         
	//   48  111:getfield        #115 <Field YAxis mAxisLeft>
	//   49  114:getfield        #166 <Field float YAxis.mAxisMinimum>
	//   50  117:invokevirtual   #918 <Method void Transformer.prepareMatrixValuePx(float, float, float, float)>
	//   51  120:return          
	}

	public void resetTracking()
	{
		totalTime = 0L;
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:putfield        #84  <Field long totalTime>
		drawCycles = 0L;
	//    3    5:aload_0         
	//    4    6:lconst_0        
	//    5    7:putfield        #86  <Field long drawCycles>
	//    6   10:return          
	}

	public void resetViewPortOffsets()
	{
		mCustomViewPortEnabled = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #88  <Field boolean mCustomViewPortEnabled>
		calculateOffsets();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #529 <Method void calculateOffsets()>
	//    5    9:return          
	}

	public void setAutoScaleMinMaxEnabled(boolean flag)
	{
		mAutoScaleMinMaxEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #59  <Field boolean mAutoScaleMinMaxEnabled>
	//    3    5:return          
	}

	public void setBorderColor(int i)
	{
		mBorderPaint.setColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #520 <Field Paint mBorderPaint>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #729 <Method void Paint.setColor(int)>
	//    4    8:return          
	}

	public void setBorderWidth(float f)
	{
		mBorderPaint.setStrokeWidth(Utils.convertDpToPixel(f));
	//    0    0:aload_0         
	//    1    1:getfield        #520 <Field Paint mBorderPaint>
	//    2    4:fload_1         
	//    3    5:invokestatic    #361 <Method float Utils.convertDpToPixel(float)>
	//    4    8:invokevirtual   #737 <Method void Paint.setStrokeWidth(float)>
	//    5   11:return          
	}

	public void setDoubleTapToZoomEnabled(boolean flag)
	{
		mDoubleTapToZoomEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #67  <Field boolean mDoubleTapToZoomEnabled>
	//    3    5:return          
	}

	public void setDragEnabled(boolean flag)
	{
		mDragEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #71  <Field boolean mDragEnabled>
	//    3    5:return          
	}

	public void setDragOffsetX(float f)
	{
		mViewPortHandler.setDragOffsetX(f);
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #928 <Method void ViewPortHandler.setDragOffsetX(float)>
	//    4    8:return          
	}

	public void setDragOffsetY(float f)
	{
		mViewPortHandler.setDragOffsetY(f);
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #931 <Method void ViewPortHandler.setDragOffsetY(float)>
	//    4    8:return          
	}

	public void setDrawBorders(boolean flag)
	{
		mDrawBorders = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #79  <Field boolean mDrawBorders>
	//    3    5:return          
	}

	public void setDrawGridBackground(boolean flag)
	{
		mDrawGridBackground = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #77  <Field boolean mDrawGridBackground>
	//    3    5:return          
	}

	public void setGridBackgroundColor(int i)
	{
		mGridBackgroundPaint.setColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #512 <Field Paint mGridBackgroundPaint>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #729 <Method void Paint.setColor(int)>
	//    4    8:return          
	}

	public void setHighlightPerDragEnabled(boolean flag)
	{
		mHighlightPerDragEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #69  <Field boolean mHighlightPerDragEnabled>
	//    3    5:return          
	}

	public void setMaxVisibleValueCount(int i)
	{
		mMaxVisibleCount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #57  <Field int mMaxVisibleCount>
	//    3    5:return          
	}

	public void setMinOffset(float f)
	{
		mMinOffset = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #82  <Field float mMinOffset>
	//    3    5:return          
	}

	public void setOnDrawListener(OnDrawListener ondrawlistener)
	{
		mDrawListener = ondrawlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #563 <Field OnDrawListener mDrawListener>
	//    3    5:return          
	}

	public void setPaint(Paint paint, int i)
	{
		super.setPaint(paint, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #943 <Method void Chart.setPaint(Paint, int)>
		switch(i)
	//*   4    6:iload_2         
		{
	//*   5    7:tableswitch     4 4: default 24
	//	               4 25
		default:
			return;
	//    6   24:return          

		case 4: // '\004'
			mGridBackgroundPaint = paint;
	//    7   25:aload_0         
	//    8   26:aload_1         
	//    9   27:putfield        #512 <Field Paint mGridBackgroundPaint>
			break;
		}
	//   10   30:return          
	}

	public void setPinchZoom(boolean flag)
	{
		mPinchZoomEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #65  <Field boolean mPinchZoomEnabled>
	//    3    5:return          
	}

	public void setRendererLeftYAxis(YAxisRenderer yaxisrenderer)
	{
		mAxisRendererLeft = yaxisrenderer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #314 <Field YAxisRenderer mAxisRendererLeft>
	//    3    5:return          
	}

	public void setRendererRightYAxis(YAxisRenderer yaxisrenderer)
	{
		mAxisRendererRight = yaxisrenderer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #326 <Field YAxisRenderer mAxisRendererRight>
	//    3    5:return          
	}

	public void setScaleEnabled(boolean flag)
	{
		mScaleXEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #73  <Field boolean mScaleXEnabled>
		mScaleYEnabled = flag;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #75  <Field boolean mScaleYEnabled>
	//    6   10:return          
	}

	public void setScaleMinima(float f, float f1)
	{
		mViewPortHandler.setMinimumScaleX(f);
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #952 <Method void ViewPortHandler.setMinimumScaleX(float)>
		mViewPortHandler.setMinimumScaleY(f1);
	//    4    8:aload_0         
	//    5    9:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    6   12:fload_2         
	//    7   13:invokevirtual   #955 <Method void ViewPortHandler.setMinimumScaleY(float)>
	//    8   16:return          
	}

	public void setScaleXEnabled(boolean flag)
	{
		mScaleXEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #73  <Field boolean mScaleXEnabled>
	//    3    5:return          
	}

	public void setScaleYEnabled(boolean flag)
	{
		mScaleYEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #75  <Field boolean mScaleYEnabled>
	//    3    5:return          
	}

	public void setViewPortOffsets(final float left, final float top, final float right, final float bottom)
	{
		mCustomViewPortEnabled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #88  <Field boolean mCustomViewPortEnabled>
		post(new Runnable() {

			public void run()
			{
				mViewPortHandler.restrainViewPort(left, top, right, bottom);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field BarLineChartBase this$0>
			//    2    4:getfield        #39  <Field ViewPortHandler BarLineChartBase.mViewPortHandler>
			//    3    7:aload_0         
			//    4    8:getfield        #24  <Field float val$left>
			//    5   11:aload_0         
			//    6   12:getfield        #26  <Field float val$top>
			//    7   15:aload_0         
			//    8   16:getfield        #28  <Field float val$right>
			//    9   19:aload_0         
			//   10   20:getfield        #30  <Field float val$bottom>
			//   11   23:invokevirtual   #44  <Method void ViewPortHandler.restrainViewPort(float, float, float, float)>
				prepareOffsetMatrix();
			//   12   26:aload_0         
			//   13   27:getfield        #22  <Field BarLineChartBase this$0>
			//   14   30:invokevirtual   #47  <Method void BarLineChartBase.prepareOffsetMatrix()>
				prepareValuePxMatrix();
			//   15   33:aload_0         
			//   16   34:getfield        #22  <Field BarLineChartBase this$0>
			//   17   37:invokevirtual   #50  <Method void BarLineChartBase.prepareValuePxMatrix()>
			//   18   40:return          
			}

			final BarLineChartBase this$0;
			final float val$bottom;
			final float val$left;
			final float val$right;
			final float val$top;

			
			{
				this$0 = BarLineChartBase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field BarLineChartBase this$0>
				left = f;
			//    3    5:aload_0         
			//    4    6:fload_2         
			//    5    7:putfield        #24  <Field float val$left>
				top = f1;
			//    6   10:aload_0         
			//    7   11:fload_3         
			//    8   12:putfield        #26  <Field float val$top>
				right = f2;
			//    9   15:aload_0         
			//   10   16:fload           4
			//   11   18:putfield        #28  <Field float val$right>
				bottom = f3;
			//   12   21:aload_0         
			//   13   22:fload           5
			//   14   24:putfield        #30  <Field float val$bottom>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #33  <Method void Object()>
			//   17   31:return          
			}
		}
);
	//    3    5:aload_0         
	//    4    6:new             #9   <Class BarLineChartBase$1>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:fload_1         
	//    8   12:fload_2         
	//    9   13:fload_3         
	//   10   14:fload           4
	//   11   16:invokespecial   #961 <Method void BarLineChartBase$1(BarLineChartBase, float, float, float, float)>
	//   12   19:invokevirtual   #965 <Method boolean post(Runnable)>
	//   13   22:pop             
	//   14   23:return          
	}

	public void setVisibleXRange(float f, float f1)
	{
		f = mDeltaX / f;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field float mDeltaX>
	//    2    4:fload_1         
	//    3    5:fdiv            
	//    4    6:fstore_1        
		f1 = mDeltaX / f1;
	//    5    7:aload_0         
	//    6    8:getfield        #163 <Field float mDeltaX>
	//    7   11:fload_2         
	//    8   12:fdiv            
	//    9   13:fstore_2        
		mViewPortHandler.setMinMaxScaleX(f1, f);
	//   10   14:aload_0         
	//   11   15:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   12   18:fload_2         
	//   13   19:fload_1         
	//   14   20:invokevirtual   #969 <Method void ViewPortHandler.setMinMaxScaleX(float, float)>
	//   15   23:return          
	}

	public void setVisibleXRangeMaximum(float f)
	{
		f = mDeltaX / f;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field float mDeltaX>
	//    2    4:fload_1         
	//    3    5:fdiv            
	//    4    6:fstore_1        
		mViewPortHandler.setMinimumScaleX(f);
	//    5    7:aload_0         
	//    6    8:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    7   11:fload_1         
	//    8   12:invokevirtual   #952 <Method void ViewPortHandler.setMinimumScaleX(float)>
	//    9   15:return          
	}

	public void setVisibleXRangeMinimum(float f)
	{
		f = mDeltaX / f;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field float mDeltaX>
	//    2    4:fload_1         
	//    3    5:fdiv            
	//    4    6:fstore_1        
		mViewPortHandler.setMaximumScaleX(f);
	//    5    7:aload_0         
	//    6    8:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    7   11:fload_1         
	//    8   12:invokevirtual   #974 <Method void ViewPortHandler.setMaximumScaleX(float)>
	//    9   15:return          
	}

	public void setVisibleYRangeMaximum(float f, com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency)
	{
		f = getDeltaY(axisdependency) / f;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #435 <Method float getDeltaY(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//    3    5:fload_1         
	//    4    6:fdiv            
	//    5    7:fstore_1        
		mViewPortHandler.setMinimumScaleY(f);
	//    6    8:aload_0         
	//    7    9:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    8   12:fload_1         
	//    9   13:invokevirtual   #955 <Method void ViewPortHandler.setMinimumScaleY(float)>
	//   10   16:return          
	}

	public void setXAxisRenderer(XAxisRenderer xaxisrenderer)
	{
		mXAxisRenderer = xaxisrenderer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #667 <Field XAxisRenderer mXAxisRenderer>
	//    3    5:return          
	}

	public void zoom(float f, float f1, float f2, float f3)
	{
		Matrix matrix = mViewPortHandler.zoom(f, f1, f2, -f3);
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:fload_3         
	//    5    7:fload           4
	//    6    9:fneg            
	//    7   10:invokevirtual   #981 <Method Matrix ViewPortHandler.zoom(float, float, float, float)>
	//    8   13:astore          5
		mViewPortHandler.refresh(matrix, ((android.view.View) (this)), false);
	//    9   15:aload_0         
	//   10   16:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   11   19:aload           5
	//   12   21:aload_0         
	//   13   22:iconst_0        
	//   14   23:invokevirtual   #527 <Method Matrix ViewPortHandler.refresh(Matrix, android.view.View, boolean)>
	//   15   26:pop             
		calculateOffsets();
	//   16   27:aload_0         
	//   17   28:invokevirtual   #529 <Method void calculateOffsets()>
		postInvalidate();
	//   18   31:aload_0         
	//   19   32:invokevirtual   #532 <Method void postInvalidate()>
	//   20   35:return          
	}

	public void zoom(float f, float f1, float f2, float f3, com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency)
	{
		addViewportJob(((Runnable) (new ZoomJob(mViewPortHandler, f, f1, f2, f3, getTransformer(axisdependency), axisdependency, ((android.view.View) (this))))));
	//    0    0:aload_0         
	//    1    1:new             #984 <Class ZoomJob>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    5    9:fload_1         
	//    6   10:fload_2         
	//    7   11:fload_3         
	//    8   12:fload           4
	//    9   14:aload_0         
	//   10   15:aload           5
	//   11   17:invokevirtual   #453 <Method Transformer getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   12   20:aload           5
	//   13   22:aload_0         
	//   14   23:invokespecial   #987 <Method void ZoomJob(ViewPortHandler, float, float, float, float, Transformer, com.github.mikephil.charting.components.YAxis$AxisDependency, android.view.View)>
	//   15   26:invokevirtual   #460 <Method void addViewportJob(Runnable)>
	//   16   29:return          
	}

	public void zoomAndCenterAnimated(float f, float f1, float f2, float f3, com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency, long l)
	{
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   0    0:getstatic       #469 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmplt          105
		{
			PointD pointd = getValuesByTouchPoint(mViewPortHandler.contentLeft(), mViewPortHandler.contentTop(), axisdependency);
	//    3    8:aload_0         
	//    4    9:aload_0         
	//    5   10:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    6   13:invokevirtual   #472 <Method float ViewPortHandler.contentLeft()>
	//    7   16:aload_0         
	//    8   17:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    9   20:invokevirtual   #475 <Method float ViewPortHandler.contentTop()>
	//   10   23:aload           5
	//   11   25:invokevirtual   #479 <Method PointD getValuesByTouchPoint(float, float, com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   12   28:astore          8
			addViewportJob(((Runnable) (new AnimatedZoomJob(mViewPortHandler, ((android.view.View) (this)), getTransformer(axisdependency), getAxis(axisdependency), mXAxis.getValues().size(), f, f1, mViewPortHandler.getScaleX(), mViewPortHandler.getScaleY(), f2, f3, (float)pointd.x, (float)pointd.y, l))));
	//   13   30:aload_0         
	//   14   31:new             #991 <Class AnimatedZoomJob>
	//   15   34:dup             
	//   16   35:aload_0         
	//   17   36:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   18   39:aload_0         
	//   19   40:aload_0         
	//   20   41:aload           5
	//   21   43:invokevirtual   #453 <Method Transformer getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   22   46:aload_0         
	//   23   47:aload           5
	//   24   49:invokevirtual   #751 <Method YAxis getAxis(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   25   52:aload_0         
	//   26   53:getfield        #191 <Field XAxis mXAxis>
	//   27   56:invokevirtual   #444 <Method List XAxis.getValues()>
	//   28   59:invokeinterface #154 <Method int List.size()>
	//   29   64:i2f             
	//   30   65:fload_1         
	//   31   66:fload_2         
	//   32   67:aload_0         
	//   33   68:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   34   71:invokevirtual   #447 <Method float ViewPortHandler.getScaleX()>
	//   35   74:aload_0         
	//   36   75:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   37   78:invokevirtual   #438 <Method float ViewPortHandler.getScaleY()>
	//   38   81:fload_3         
	//   39   82:fload           4
	//   40   84:aload           8
	//   41   86:getfield        #487 <Field double PointD.x>
	//   42   89:d2f             
	//   43   90:aload           8
	//   44   92:getfield        #490 <Field double PointD.y>
	//   45   95:d2f             
	//   46   96:lload           6
	//   47   98:invokespecial   #994 <Method void AnimatedZoomJob(ViewPortHandler, android.view.View, Transformer, YAxis, float, float, float, float, float, float, float, float, float, long)>
	//   48  101:invokevirtual   #460 <Method void addViewportJob(Runnable)>
			return;
	//   49  104:return          
		} else
		{
			Log.e("MPAndroidChart", "Unable to execute zoomAndCenterAnimated(...) on API level < 11");
	//   50  105:ldc1            #237 <String "MPAndroidChart">
	//   51  107:ldc2            #996 <String "Unable to execute zoomAndCenterAnimated(...) on API level < 11">
	//   52  110:invokestatic    #498 <Method int Log.e(String, String)>
	//   53  113:pop             
			return;
	//   54  114:return          
		}
	}

	public void zoomIn()
	{
		Object obj = ((Object) (mViewPortHandler.getContentCenter()));
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    2    4:invokevirtual   #1001 <Method PointF ViewPortHandler.getContentCenter()>
	//    3    7:astore_1        
		obj = ((Object) (mViewPortHandler.zoomIn(((PointF) (obj)).x, -((PointF) (obj)).y)));
	//    4    8:aload_0         
	//    5    9:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    6   12:aload_1         
	//    7   13:getfield        #1003 <Field float PointF.x>
	//    8   16:aload_1         
	//    9   17:getfield        #1005 <Field float PointF.y>
	//   10   20:fneg            
	//   11   21:invokevirtual   #1008 <Method Matrix ViewPortHandler.zoomIn(float, float)>
	//   12   24:astore_1        
		mViewPortHandler.refresh(((Matrix) (obj)), ((android.view.View) (this)), false);
	//   13   25:aload_0         
	//   14   26:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #527 <Method Matrix ViewPortHandler.refresh(Matrix, android.view.View, boolean)>
	//   19   35:pop             
		calculateOffsets();
	//   20   36:aload_0         
	//   21   37:invokevirtual   #529 <Method void calculateOffsets()>
		postInvalidate();
	//   22   40:aload_0         
	//   23   41:invokevirtual   #532 <Method void postInvalidate()>
	//   24   44:return          
	}

	public void zoomOut()
	{
		Object obj = ((Object) (mViewPortHandler.getContentCenter()));
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    2    4:invokevirtual   #1001 <Method PointF ViewPortHandler.getContentCenter()>
	//    3    7:astore_1        
		obj = ((Object) (mViewPortHandler.zoomOut(((PointF) (obj)).x, -((PointF) (obj)).y)));
	//    4    8:aload_0         
	//    5    9:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//    6   12:aload_1         
	//    7   13:getfield        #1003 <Field float PointF.x>
	//    8   16:aload_1         
	//    9   17:getfield        #1005 <Field float PointF.y>
	//   10   20:fneg            
	//   11   21:invokevirtual   #1011 <Method Matrix ViewPortHandler.zoomOut(float, float)>
	//   12   24:astore_1        
		mViewPortHandler.refresh(((Matrix) (obj)), ((android.view.View) (this)), false);
	//   13   25:aload_0         
	//   14   26:getfield        #204 <Field ViewPortHandler mViewPortHandler>
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #527 <Method Matrix ViewPortHandler.refresh(Matrix, android.view.View, boolean)>
	//   19   35:pop             
		calculateOffsets();
	//   20   36:aload_0         
	//   21   37:invokevirtual   #529 <Method void calculateOffsets()>
		postInvalidate();
	//   22   40:aload_0         
	//   23   41:invokevirtual   #532 <Method void postInvalidate()>
	//   24   44:return          
	}

	private long drawCycles;
	private Integer mAutoScaleLastHighestVisibleXIndex;
	private Integer mAutoScaleLastLowestVisibleXIndex;
	private boolean mAutoScaleMinMaxEnabled;
	protected YAxis mAxisLeft;
	protected YAxisRenderer mAxisRendererLeft;
	protected YAxisRenderer mAxisRendererRight;
	protected YAxis mAxisRight;
	protected Paint mBorderPaint;
	private boolean mCustomViewPortEnabled;
	protected boolean mDoubleTapToZoomEnabled;
	private boolean mDragEnabled;
	protected boolean mDrawBorders;
	protected boolean mDrawGridBackground;
	protected OnDrawListener mDrawListener;
	protected Paint mGridBackgroundPaint;
	protected boolean mHighlightPerDragEnabled;
	protected Transformer mLeftAxisTransformer;
	protected int mMaxVisibleCount;
	protected float mMinOffset;
	protected boolean mPinchZoomEnabled;
	protected Transformer mRightAxisTransformer;
	private boolean mScaleXEnabled;
	private boolean mScaleYEnabled;
	protected XAxis mXAxis;
	protected XAxisRenderer mXAxisRenderer;
	private long totalTime;
}
