// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider;
import com.github.mikephil.charting.renderer.CandleStickChartRenderer;

// Referenced classes of package com.github.mikephil.charting.charts:
//			BarLineChartBase

public class CandleStickChart extends BarLineChartBase
	implements CandleDataProvider
{

	public CandleStickChart(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void BarLineChartBase(Context)>
	//    3    5:return          
	}

	public CandleStickChart(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void BarLineChartBase(Context, AttributeSet)>
	//    4    6:return          
	}

	public CandleStickChart(Context context, AttributeSet attributeset, int i)
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
		mXChartMax = mXChartMax + 0.5F;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field float mXChartMax>
	//    5    9:ldc1            #27  <Float 0.5F>
	//    6   11:fadd            
	//    7   12:putfield        #26  <Field float mXChartMax>
		mDeltaX = Math.abs(mXChartMax - mXChartMin);
	//    8   15:aload_0         
	//    9   16:aload_0         
	//   10   17:getfield        #26  <Field float mXChartMax>
	//   11   20:aload_0         
	//   12   21:getfield        #30  <Field float mXChartMin>
	//   13   24:fsub            
	//   14   25:invokestatic    #36  <Method float Math.abs(float)>
	//   15   28:putfield        #39  <Field float mDeltaX>
	//   16   31:return          
	}

	public CandleData getCandleData()
	{
		return (CandleData)mData;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field com.github.mikephil.charting.data.ChartData mData>
	//    2    4:checkcast       #47  <Class CandleData>
	//    3    7:areturn         
	}

	protected void init()
	{
		super.init();
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void BarLineChartBase.init()>
		mRenderer = ((com.github.mikephil.charting.renderer.DataRenderer) (new CandleStickChartRenderer(((CandleDataProvider) (this)), mAnimator, mViewPortHandler)));
	//    2    4:aload_0         
	//    3    5:new             #52  <Class CandleStickChartRenderer>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #56  <Field com.github.mikephil.charting.animation.ChartAnimator mAnimator>
	//    8   14:aload_0         
	//    9   15:getfield        #60  <Field com.github.mikephil.charting.utils.ViewPortHandler mViewPortHandler>
	//   10   18:invokespecial   #63  <Method void CandleStickChartRenderer(CandleDataProvider, com.github.mikephil.charting.animation.ChartAnimator, com.github.mikephil.charting.utils.ViewPortHandler)>
	//   11   21:putfield        #67  <Field com.github.mikephil.charting.renderer.DataRenderer mRenderer>
		mXChartMin = -0.5F;
	//   12   24:aload_0         
	//   13   25:ldc1            #68  <Float -0.5F>
	//   14   27:putfield        #30  <Field float mXChartMin>
	//   15   30:return          
	}
}
