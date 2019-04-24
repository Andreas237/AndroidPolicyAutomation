// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.renderer.LineChartRenderer;

// Referenced classes of package com.github.mikephil.charting.charts:
//			BarLineChartBase

public class LineChart extends BarLineChartBase
	implements LineDataProvider
{

	public LineChart(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void BarLineChartBase(Context)>
	//    3    5:return          
	}

	public LineChart(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void BarLineChartBase(Context, AttributeSet)>
	//    4    6:return          
	}

	public LineChart(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #18  <Method void BarLineChartBase(Context, AttributeSet, int)>
	//    5    7:return          
	}

	protected void calcMinMax()
	{
		super.calcMinMax();
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void BarLineChartBase.calcMinMax()>
		if(mDeltaX == 0.0F && ((LineData)mData).getYValCount() > 0)
	//*   2    4:aload_0         
	//*   3    5:getfield        #26  <Field float mDeltaX>
	//*   4    8:fconst_0        
	//*   5    9:fcmpl           
	//*   6   10:ifne            31
	//*   7   13:aload_0         
	//*   8   14:getfield        #30  <Field com.github.mikephil.charting.data.ChartData mData>
	//*   9   17:checkcast       #32  <Class LineData>
	//*  10   20:invokevirtual   #36  <Method int LineData.getYValCount()>
	//*  11   23:ifle            31
			mDeltaX = 1.0F;
	//   12   26:aload_0         
	//   13   27:fconst_1        
	//   14   28:putfield        #26  <Field float mDeltaX>
	//   15   31:return          
	}

	public LineData getLineData()
	{
		return (LineData)mData;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field com.github.mikephil.charting.data.ChartData mData>
	//    2    4:checkcast       #32  <Class LineData>
	//    3    7:areturn         
	}

	protected void init()
	{
		super.init();
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void BarLineChartBase.init()>
		mRenderer = ((com.github.mikephil.charting.renderer.DataRenderer) (new LineChartRenderer(((LineDataProvider) (this)), mAnimator, mViewPortHandler)));
	//    2    4:aload_0         
	//    3    5:new             #43  <Class LineChartRenderer>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #47  <Field com.github.mikephil.charting.animation.ChartAnimator mAnimator>
	//    8   14:aload_0         
	//    9   15:getfield        #51  <Field com.github.mikephil.charting.utils.ViewPortHandler mViewPortHandler>
	//   10   18:invokespecial   #54  <Method void LineChartRenderer(LineDataProvider, com.github.mikephil.charting.animation.ChartAnimator, com.github.mikephil.charting.utils.ViewPortHandler)>
	//   11   21:putfield        #58  <Field com.github.mikephil.charting.renderer.DataRenderer mRenderer>
	//   12   24:return          
	}

	protected void onDetachedFromWindow()
	{
		if(mRenderer != null && (mRenderer instanceof LineChartRenderer))
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field com.github.mikephil.charting.renderer.DataRenderer mRenderer>
	//*   2    4:ifnull          27
	//*   3    7:aload_0         
	//*   4    8:getfield        #58  <Field com.github.mikephil.charting.renderer.DataRenderer mRenderer>
	//*   5   11:instanceof      #43  <Class LineChartRenderer>
	//*   6   14:ifeq            27
			((LineChartRenderer)mRenderer).releaseBitmap();
	//    7   17:aload_0         
	//    8   18:getfield        #58  <Field com.github.mikephil.charting.renderer.DataRenderer mRenderer>
	//    9   21:checkcast       #43  <Class LineChartRenderer>
	//   10   24:invokevirtual   #62  <Method void LineChartRenderer.releaseBitmap()>
		super.onDetachedFromWindow();
	//   11   27:aload_0         
	//   12   28:invokespecial   #64  <Method void BarLineChartBase.onDetachedFromWindow()>
	//   13   31:return          
	}
}
