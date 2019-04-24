// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.data.BubbleData;
import com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet;
import com.github.mikephil.charting.renderer.BubbleChartRenderer;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.charts:
//			BarLineChartBase

public class BubbleChart extends BarLineChartBase
	implements BubbleDataProvider
{

	public BubbleChart(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void BarLineChartBase(Context)>
	//    3    5:return          
	}

	public BubbleChart(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void BarLineChartBase(Context, AttributeSet)>
	//    4    6:return          
	}

	public BubbleChart(Context context, AttributeSet attributeset, int i)
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
		if(mDeltaX == 0.0F && ((BubbleData)mData).getYValCount() > 0)
	//*   2    4:aload_0         
	//*   3    5:getfield        #26  <Field float mDeltaX>
	//*   4    8:fconst_0        
	//*   5    9:fcmpl           
	//*   6   10:ifne            31
	//*   7   13:aload_0         
	//*   8   14:getfield        #30  <Field com.github.mikephil.charting.data.ChartData mData>
	//*   9   17:checkcast       #32  <Class BubbleData>
	//*  10   20:invokevirtual   #36  <Method int BubbleData.getYValCount()>
	//*  11   23:ifle            31
			mDeltaX = 1.0F;
	//   12   26:aload_0         
	//   13   27:fconst_1        
	//   14   28:putfield        #26  <Field float mDeltaX>
		mXChartMin = -0.5F;
	//   15   31:aload_0         
	//   16   32:ldc1            #37  <Float -0.5F>
	//   17   34:putfield        #40  <Field float mXChartMin>
		mXChartMax = (float)((BubbleData)mData).getXValCount() - 0.5F;
	//   18   37:aload_0         
	//   19   38:aload_0         
	//   20   39:getfield        #30  <Field com.github.mikephil.charting.data.ChartData mData>
	//   21   42:checkcast       #32  <Class BubbleData>
	//   22   45:invokevirtual   #43  <Method int BubbleData.getXValCount()>
	//   23   48:i2f             
	//   24   49:ldc1            #44  <Float 0.5F>
	//   25   51:fsub            
	//   26   52:putfield        #47  <Field float mXChartMax>
		if(mRenderer != null)
	//*  27   55:aload_0         
	//*  28   56:getfield        #51  <Field com.github.mikephil.charting.renderer.DataRenderer mRenderer>
	//*  29   59:ifnull          145
		{
			Iterator iterator = ((BubbleData)mData).getDataSets().iterator();
	//   30   62:aload_0         
	//   31   63:getfield        #30  <Field com.github.mikephil.charting.data.ChartData mData>
	//   32   66:checkcast       #32  <Class BubbleData>
	//   33   69:invokevirtual   #55  <Method List BubbleData.getDataSets()>
	//   34   72:invokeinterface #61  <Method Iterator List.iterator()>
	//   35   77:astore_3        
			do
			{
				if(!iterator.hasNext())
					break;
	//   36   78:aload_3         
	//   37   79:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//   38   84:ifeq            145
				IBubbleDataSet ibubbledataset = (IBubbleDataSet)iterator.next();
	//   39   87:aload_3         
	//   40   88:invokeinterface #71  <Method Object Iterator.next()>
	//   41   93:checkcast       #73  <Class IBubbleDataSet>
	//   42   96:astore          4
				float f = ibubbledataset.getXMin();
	//   43   98:aload           4
	//   44  100:invokeinterface #77  <Method float IBubbleDataSet.getXMin()>
	//   45  105:fstore_1        
				float f1 = ibubbledataset.getXMax();
	//   46  106:aload           4
	//   47  108:invokeinterface #80  <Method float IBubbleDataSet.getXMax()>
	//   48  113:fstore_2        
				if(f < mXChartMin)
	//*  49  114:fload_1         
	//*  50  115:aload_0         
	//*  51  116:getfield        #40  <Field float mXChartMin>
	//*  52  119:fcmpg           
	//*  53  120:ifge            128
					mXChartMin = f;
	//   54  123:aload_0         
	//   55  124:fload_1         
	//   56  125:putfield        #40  <Field float mXChartMin>
				if(f1 > mXChartMax)
	//*  57  128:fload_2         
	//*  58  129:aload_0         
	//*  59  130:getfield        #47  <Field float mXChartMax>
	//*  60  133:fcmpl           
	//*  61  134:ifle            78
					mXChartMax = f1;
	//   62  137:aload_0         
	//   63  138:fload_2         
	//   64  139:putfield        #47  <Field float mXChartMax>
			} while(true);
	//   65  142:goto            78
		}
		mDeltaX = Math.abs(mXChartMax - mXChartMin);
	//   66  145:aload_0         
	//   67  146:aload_0         
	//   68  147:getfield        #47  <Field float mXChartMax>
	//   69  150:aload_0         
	//   70  151:getfield        #40  <Field float mXChartMin>
	//   71  154:fsub            
	//   72  155:invokestatic    #86  <Method float Math.abs(float)>
	//   73  158:putfield        #26  <Field float mDeltaX>
	//   74  161:return          
	}

	public BubbleData getBubbleData()
	{
		return (BubbleData)mData;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field com.github.mikephil.charting.data.ChartData mData>
	//    2    4:checkcast       #32  <Class BubbleData>
	//    3    7:areturn         
	}

	protected void init()
	{
		super.init();
	//    0    0:aload_0         
	//    1    1:invokespecial   #91  <Method void BarLineChartBase.init()>
		mRenderer = ((com.github.mikephil.charting.renderer.DataRenderer) (new BubbleChartRenderer(((BubbleDataProvider) (this)), mAnimator, mViewPortHandler)));
	//    2    4:aload_0         
	//    3    5:new             #93  <Class BubbleChartRenderer>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #97  <Field com.github.mikephil.charting.animation.ChartAnimator mAnimator>
	//    8   14:aload_0         
	//    9   15:getfield        #101 <Field com.github.mikephil.charting.utils.ViewPortHandler mViewPortHandler>
	//   10   18:invokespecial   #104 <Method void BubbleChartRenderer(BubbleDataProvider, com.github.mikephil.charting.animation.ChartAnimator, com.github.mikephil.charting.utils.ViewPortHandler)>
	//   11   21:putfield        #51  <Field com.github.mikephil.charting.renderer.DataRenderer mRenderer>
	//   12   24:return          
	}
}
