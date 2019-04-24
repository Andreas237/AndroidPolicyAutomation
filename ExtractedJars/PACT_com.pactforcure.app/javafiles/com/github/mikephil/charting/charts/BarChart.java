// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.highlight.*;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.renderer.BarChartRenderer;
import com.github.mikephil.charting.renderer.XAxisRendererBarChart;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;

// Referenced classes of package com.github.mikephil.charting.charts:
//			BarLineChartBase

public class BarChart extends BarLineChartBase
	implements BarDataProvider
{

	public BarChart(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void BarLineChartBase(Context)>
		mDrawHighlightArrow = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #17  <Field boolean mDrawHighlightArrow>
		mDrawValueAboveBar = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #19  <Field boolean mDrawValueAboveBar>
		mDrawBarShadow = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #21  <Field boolean mDrawBarShadow>
	//   12   20:return          
	}

	public BarChart(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #25  <Method void BarLineChartBase(Context, AttributeSet)>
		mDrawHighlightArrow = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #17  <Field boolean mDrawHighlightArrow>
		mDrawValueAboveBar = true;
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:putfield        #19  <Field boolean mDrawValueAboveBar>
		mDrawBarShadow = false;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #21  <Field boolean mDrawBarShadow>
	//   13   21:return          
	}

	public BarChart(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #28  <Method void BarLineChartBase(Context, AttributeSet, int)>
		mDrawHighlightArrow = false;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #17  <Field boolean mDrawHighlightArrow>
		mDrawValueAboveBar = true;
	//    8   12:aload_0         
	//    9   13:iconst_1        
	//   10   14:putfield        #19  <Field boolean mDrawValueAboveBar>
		mDrawBarShadow = false;
	//   11   17:aload_0         
	//   12   18:iconst_0        
	//   13   19:putfield        #21  <Field boolean mDrawBarShadow>
	//   14   22:return          
	}

	protected void calcMinMax()
	{
		super.calcMinMax();
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void BarLineChartBase.calcMinMax()>
		mDeltaX = mDeltaX + 0.5F;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field float mDeltaX>
	//    5    9:ldc1            #37  <Float 0.5F>
	//    6   11:fadd            
	//    7   12:putfield        #36  <Field float mDeltaX>
		float f = mDeltaX;
	//    8   15:aload_0         
	//    9   16:getfield        #36  <Field float mDeltaX>
	//   10   19:fstore_1        
		mDeltaX = (float)((BarData)mData).getDataSetCount() * f;
	//   11   20:aload_0         
	//   12   21:aload_0         
	//   13   22:getfield        #41  <Field com.github.mikephil.charting.data.ChartData mData>
	//   14   25:checkcast       #43  <Class BarData>
	//   15   28:invokevirtual   #47  <Method int BarData.getDataSetCount()>
	//   16   31:i2f             
	//   17   32:fload_1         
	//   18   33:fmul            
	//   19   34:putfield        #36  <Field float mDeltaX>
		f = ((BarData)mData).getGroupSpace();
	//   20   37:aload_0         
	//   21   38:getfield        #41  <Field com.github.mikephil.charting.data.ChartData mData>
	//   22   41:checkcast       #43  <Class BarData>
	//   23   44:invokevirtual   #51  <Method float BarData.getGroupSpace()>
	//   24   47:fstore_1        
		float f1 = mDeltaX;
	//   25   48:aload_0         
	//   26   49:getfield        #36  <Field float mDeltaX>
	//   27   52:fstore_2        
		mDeltaX = (float)((BarData)mData).getXValCount() * f + f1;
	//   28   53:aload_0         
	//   29   54:aload_0         
	//   30   55:getfield        #41  <Field com.github.mikephil.charting.data.ChartData mData>
	//   31   58:checkcast       #43  <Class BarData>
	//   32   61:invokevirtual   #54  <Method int BarData.getXValCount()>
	//   33   64:i2f             
	//   34   65:fload_1         
	//   35   66:fmul            
	//   36   67:fload_2         
	//   37   68:fadd            
	//   38   69:putfield        #36  <Field float mDeltaX>
		mXChartMax = mDeltaX - mXChartMin;
	//   39   72:aload_0         
	//   40   73:aload_0         
	//   41   74:getfield        #36  <Field float mDeltaX>
	//   42   77:aload_0         
	//   43   78:getfield        #57  <Field float mXChartMin>
	//   44   81:fsub            
	//   45   82:putfield        #60  <Field float mXChartMax>
	//   46   85:return          
	}

	public RectF getBarBounds(BarEntry barentry)
	{
		float f2 = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore          4
		IBarDataSet ibardataset = (IBarDataSet)((BarData)mData).getDataSetForEntry(((com.github.mikephil.charting.data.Entry) (barentry)));
	//    2    3:aload_0         
	//    3    4:getfield        #41  <Field com.github.mikephil.charting.data.ChartData mData>
	//    4    7:checkcast       #43  <Class BarData>
	//    5   10:aload_1         
	//    6   11:invokevirtual   #66  <Method com.github.mikephil.charting.interfaces.datasets.IDataSet BarData.getDataSetForEntry(com.github.mikephil.charting.data.Entry)>
	//    7   14:checkcast       #68  <Class IBarDataSet>
	//    8   17:astore          7
		if(ibardataset == null)
	//*   9   19:aload           7
	//*  10   21:ifnonnull       26
			return null;
	//   11   24:aconst_null     
	//   12   25:areturn         
		float f1 = ibardataset.getBarSpace();
	//   13   26:aload           7
	//   14   28:invokeinterface #71  <Method float IBarDataSet.getBarSpace()>
	//   15   33:fstore_3        
		float f = barentry.getVal();
	//   16   34:aload_1         
	//   17   35:invokevirtual   #76  <Method float BarEntry.getVal()>
	//   18   38:fstore_2        
		float f3 = barentry.getXIndex();
	//   19   39:aload_1         
	//   20   40:invokevirtual   #79  <Method int BarEntry.getXIndex()>
	//   21   43:i2f             
	//   22   44:fstore          5
		float f4 = f1 / 2.0F;
	//   23   46:fload_3         
	//   24   47:fconst_2        
	//   25   48:fdiv            
	//   26   49:fstore          6
		if(f >= 0.0F)
	//*  27   51:fload_2         
	//*  28   52:fconst_0        
	//*  29   53:fcmpl           
	//*  30   54:iflt            112
			f1 = f;
	//   31   57:fload_2         
	//   32   58:fstore_3        
		else
	//*  33   59:fload_2         
	//*  34   60:fconst_0        
	//*  35   61:fcmpg           
	//*  36   62:ifgt            68
	//*  37   65:fload_2         
	//*  38   66:fstore          4
	//*  39   68:new             #81  <Class RectF>
	//*  40   71:dup             
	//*  41   72:fload           5
	//*  42   74:ldc1            #37  <Float 0.5F>
	//*  43   76:fsub            
	//*  44   77:fload           6
	//*  45   79:fadd            
	//*  46   80:fload_3         
	//*  47   81:fload           5
	//*  48   83:ldc1            #37  <Float 0.5F>
	//*  49   85:fadd            
	//*  50   86:fload           6
	//*  51   88:fsub            
	//*  52   89:fload           4
	//*  53   91:invokespecial   #84  <Method void RectF(float, float, float, float)>
	//*  54   94:astore_1        
	//*  55   95:aload_0         
	//*  56   96:aload           7
	//*  57   98:invokeinterface #88  <Method com.github.mikephil.charting.components.YAxis$AxisDependency IBarDataSet.getAxisDependency()>
	//*  58  103:invokevirtual   #92  <Method Transformer getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//*  59  106:aload_1         
	//*  60  107:invokevirtual   #98  <Method void Transformer.rectValueToPixel(RectF)>
	//*  61  110:aload_1         
	//*  62  111:areturn         
			f1 = 0.0F;
	//   63  112:fconst_0        
	//   64  113:fstore_3        
		if(f <= 0.0F)
			f2 = f;
		barentry = ((BarEntry) (new RectF((f3 - 0.5F) + f4, f1, (f3 + 0.5F) - f4, f2)));
		getTransformer(ibardataset.getAxisDependency()).rectValueToPixel(((RectF) (barentry)));
		return ((RectF) (barentry));
	//*  65  114:goto            59
	}

	public BarData getBarData()
	{
		return (BarData)mData;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field com.github.mikephil.charting.data.ChartData mData>
	//    2    4:checkcast       #43  <Class BarData>
	//    3    7:areturn         
	}

	public int getHighestVisibleXIndex()
	{
		float f = 1.0F;
	//    0    0:fconst_1        
	//    1    1:fstore_1        
		float f1 = ((BarData)mData).getDataSetCount();
	//    2    2:aload_0         
	//    3    3:getfield        #41  <Field com.github.mikephil.charting.data.ChartData mData>
	//    4    6:checkcast       #43  <Class BarData>
	//    5    9:invokevirtual   #47  <Method int BarData.getDataSetCount()>
	//    6   12:i2f             
	//    7   13:fstore_2        
		float af[];
		if(f1 > 1.0F)
	//*   8   14:fload_2         
	//*   9   15:fconst_1        
	//*  10   16:fcmpg           
	//*  11   17:ifgt            76
	//*  12   20:iconst_2        
	//*  13   21:newarray        float[]
	//*  14   23:astore_3        
	//*  15   24:aload_3         
	//*  16   25:iconst_0        
	//*  17   26:aload_0         
	//*  18   27:getfield        #105 <Field ViewPortHandler mViewPortHandler>
	//*  19   30:invokevirtual   #110 <Method float ViewPortHandler.contentRight()>
	//*  20   33:fastore         
	//*  21   34:aload_3         
	//*  22   35:iconst_1        
	//*  23   36:aload_0         
	//*  24   37:getfield        #105 <Field ViewPortHandler mViewPortHandler>
	//*  25   40:invokevirtual   #113 <Method float ViewPortHandler.contentBottom()>
	//*  26   43:fastore         
	//*  27   44:aload_0         
	//*  28   45:getstatic       #119 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//*  29   48:invokevirtual   #92  <Method Transformer getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//*  30   51:aload_3         
	//*  31   52:invokevirtual   #123 <Method void Transformer.pixelsToValue(float[])>
	//*  32   55:aload_3         
	//*  33   56:iconst_0        
	//*  34   57:faload          
	//*  35   58:aload_0         
	//*  36   59:invokevirtual   #126 <Method float getXChartMax()>
	//*  37   62:fcmpl           
	//*  38   63:iflt            92
	//*  39   66:aload_0         
	//*  40   67:invokevirtual   #126 <Method float getXChartMax()>
	//*  41   70:fload_1         
	//*  42   71:fdiv            
	//*  43   72:fstore_1        
	//*  44   73:fload_1         
	//*  45   74:f2i             
	//*  46   75:ireturn         
			f = f1 + ((BarData)mData).getGroupSpace();
	//   47   76:fload_2         
	//   48   77:aload_0         
	//   49   78:getfield        #41  <Field com.github.mikephil.charting.data.ChartData mData>
	//   50   81:checkcast       #43  <Class BarData>
	//   51   84:invokevirtual   #51  <Method float BarData.getGroupSpace()>
	//   52   87:fadd            
	//   53   88:fstore_1        
		af = new float[2];
		af[0] = mViewPortHandler.contentRight();
		af[1] = mViewPortHandler.contentBottom();
		getTransformer(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT).pixelsToValue(af);
		if(af[0] >= getXChartMax())
			f = getXChartMax() / f;
		else
	//*  54   89:goto            20
			f = af[0] / f;
	//   55   92:aload_3         
	//   56   93:iconst_0        
	//   57   94:faload          
	//   58   95:fload_1         
	//   59   96:fdiv            
	//   60   97:fstore_1        
		return (int)f;
	//*  61   98:goto            73
	}

	public Highlight getHighlightByTouchPoint(float f, float f1)
	{
		if(mData == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field com.github.mikephil.charting.data.ChartData mData>
	//*   2    4:ifnonnull       17
		{
			Log.e("MPAndroidChart", "Can't select by touch. No data set.");
	//    3    7:ldc1            #130 <String "MPAndroidChart">
	//    4    9:ldc1            #132 <String "Can't select by touch. No data set.">
	//    5   11:invokestatic    #138 <Method int Log.e(String, String)>
	//    6   14:pop             
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
		} else
		{
			return getHighlighter().getHighlight(f, f1);
	//    9   17:aload_0         
	//   10   18:invokevirtual   #142 <Method ChartHighlighter getHighlighter()>
	//   11   21:fload_1         
	//   12   22:fload_2         
	//   13   23:invokevirtual   #147 <Method Highlight ChartHighlighter.getHighlight(float, float)>
	//   14   26:areturn         
		}
	}

	public int getLowestVisibleXIndex()
	{
		float f = ((BarData)mData).getDataSetCount();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field com.github.mikephil.charting.data.ChartData mData>
	//    2    4:checkcast       #43  <Class BarData>
	//    3    7:invokevirtual   #47  <Method int BarData.getDataSetCount()>
	//    4   10:i2f             
	//    5   11:fstore_1        
		float af[];
		if(f <= 1.0F)
	//*   6   12:fload_1         
	//*   7   13:fconst_1        
	//*   8   14:fcmpg           
	//*   9   15:ifgt            71
			f = 1.0F;
	//   10   18:fconst_1        
	//   11   19:fstore_1        
		else
	//*  12   20:iconst_2        
	//*  13   21:newarray        float[]
	//*  14   23:astore_2        
	//*  15   24:aload_2         
	//*  16   25:iconst_0        
	//*  17   26:aload_0         
	//*  18   27:getfield        #105 <Field ViewPortHandler mViewPortHandler>
	//*  19   30:invokevirtual   #151 <Method float ViewPortHandler.contentLeft()>
	//*  20   33:fastore         
	//*  21   34:aload_2         
	//*  22   35:iconst_1        
	//*  23   36:aload_0         
	//*  24   37:getfield        #105 <Field ViewPortHandler mViewPortHandler>
	//*  25   40:invokevirtual   #113 <Method float ViewPortHandler.contentBottom()>
	//*  26   43:fastore         
	//*  27   44:aload_0         
	//*  28   45:getstatic       #119 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//*  29   48:invokevirtual   #92  <Method Transformer getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//*  30   51:aload_2         
	//*  31   52:invokevirtual   #123 <Method void Transformer.pixelsToValue(float[])>
	//*  32   55:aload_2         
	//*  33   56:iconst_0        
	//*  34   57:faload          
	//*  35   58:aload_0         
	//*  36   59:invokevirtual   #154 <Method float getXChartMin()>
	//*  37   62:fcmpg           
	//*  38   63:ifgt            87
	//*  39   66:fconst_0        
	//*  40   67:fstore_1        
	//*  41   68:fload_1         
	//*  42   69:f2i             
	//*  43   70:ireturn         
			f += ((BarData)mData).getGroupSpace();
	//   44   71:fload_1         
	//   45   72:aload_0         
	//   46   73:getfield        #41  <Field com.github.mikephil.charting.data.ChartData mData>
	//   47   76:checkcast       #43  <Class BarData>
	//   48   79:invokevirtual   #51  <Method float BarData.getGroupSpace()>
	//   49   82:fadd            
	//   50   83:fstore_1        
		af = new float[2];
		af[0] = mViewPortHandler.contentLeft();
		af[1] = mViewPortHandler.contentBottom();
		getTransformer(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT).pixelsToValue(af);
		if(af[0] <= getXChartMin())
			f = 0.0F;
		else
	//*  51   84:goto            20
			f = af[0] / f + 1.0F;
	//   52   87:aload_2         
	//   53   88:iconst_0        
	//   54   89:faload          
	//   55   90:fload_1         
	//   56   91:fdiv            
	//   57   92:fconst_1        
	//   58   93:fadd            
	//   59   94:fstore_1        
		return (int)f;
	//*  60   95:goto            68
	}

	protected void init()
	{
		super.init();
	//    0    0:aload_0         
	//    1    1:invokespecial   #157 <Method void BarLineChartBase.init()>
		mRenderer = ((com.github.mikephil.charting.renderer.DataRenderer) (new BarChartRenderer(((BarDataProvider) (this)), mAnimator, mViewPortHandler)));
	//    2    4:aload_0         
	//    3    5:new             #159 <Class BarChartRenderer>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #163 <Field com.github.mikephil.charting.animation.ChartAnimator mAnimator>
	//    8   14:aload_0         
	//    9   15:getfield        #105 <Field ViewPortHandler mViewPortHandler>
	//   10   18:invokespecial   #166 <Method void BarChartRenderer(BarDataProvider, com.github.mikephil.charting.animation.ChartAnimator, ViewPortHandler)>
	//   11   21:putfield        #170 <Field com.github.mikephil.charting.renderer.DataRenderer mRenderer>
		mXAxisRenderer = ((com.github.mikephil.charting.renderer.XAxisRenderer) (new XAxisRendererBarChart(mViewPortHandler, mXAxis, mLeftAxisTransformer, this)));
	//   12   24:aload_0         
	//   13   25:new             #172 <Class XAxisRendererBarChart>
	//   14   28:dup             
	//   15   29:aload_0         
	//   16   30:getfield        #105 <Field ViewPortHandler mViewPortHandler>
	//   17   33:aload_0         
	//   18   34:getfield        #176 <Field com.github.mikephil.charting.components.XAxis mXAxis>
	//   19   37:aload_0         
	//   20   38:getfield        #180 <Field Transformer mLeftAxisTransformer>
	//   21   41:aload_0         
	//   22   42:invokespecial   #183 <Method void XAxisRendererBarChart(ViewPortHandler, com.github.mikephil.charting.components.XAxis, Transformer, BarChart)>
	//   23   45:putfield        #187 <Field com.github.mikephil.charting.renderer.XAxisRenderer mXAxisRenderer>
		setHighlighter(((ChartHighlighter) (new BarHighlighter(((BarDataProvider) (this))))));
	//   24   48:aload_0         
	//   25   49:new             #189 <Class BarHighlighter>
	//   26   52:dup             
	//   27   53:aload_0         
	//   28   54:invokespecial   #192 <Method void BarHighlighter(BarDataProvider)>
	//   29   57:invokevirtual   #196 <Method void setHighlighter(ChartHighlighter)>
		mXChartMin = -0.5F;
	//   30   60:aload_0         
	//   31   61:ldc1            #197 <Float -0.5F>
	//   32   63:putfield        #57  <Field float mXChartMin>
	//   33   66:return          
	}

	public boolean isDrawBarShadowEnabled()
	{
		return mDrawBarShadow;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field boolean mDrawBarShadow>
	//    2    4:ireturn         
	}

	public boolean isDrawHighlightArrowEnabled()
	{
		return mDrawHighlightArrow;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field boolean mDrawHighlightArrow>
	//    2    4:ireturn         
	}

	public boolean isDrawValueAboveBarEnabled()
	{
		return mDrawValueAboveBar;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field boolean mDrawValueAboveBar>
	//    2    4:ireturn         
	}

	public void setDrawBarShadow(boolean flag)
	{
		mDrawBarShadow = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #21  <Field boolean mDrawBarShadow>
	//    3    5:return          
	}

	public void setDrawHighlightArrow(boolean flag)
	{
		mDrawHighlightArrow = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #17  <Field boolean mDrawHighlightArrow>
	//    3    5:return          
	}

	public void setDrawValueAboveBar(boolean flag)
	{
		mDrawValueAboveBar = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #19  <Field boolean mDrawValueAboveBar>
	//    3    5:return          
	}

	private boolean mDrawBarShadow;
	private boolean mDrawHighlightArrow;
	private boolean mDrawValueAboveBar;
}
