// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.data.*;
import com.github.mikephil.charting.highlight.CombinedHighlighter;
import com.github.mikephil.charting.interfaces.dataprovider.*;
import com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet;
import com.github.mikephil.charting.renderer.CombinedChartRenderer;
import com.github.mikephil.charting.renderer.DataRenderer;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.charts:
//			BarLineChartBase

public class CombinedChart extends BarLineChartBase
	implements LineDataProvider, BarDataProvider, ScatterDataProvider, CandleDataProvider, BubbleDataProvider
{
	public static final class DrawOrder extends Enum
	{

		public static DrawOrder valueOf(String s)
		{
			return (DrawOrder)Enum.valueOf(com/github/mikephil/charting/charts/CombinedChart$DrawOrder, s);
		//    0    0:ldc1            #2   <Class CombinedChart$DrawOrder>
		//    1    2:aload_0         
		//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class CombinedChart$DrawOrder>
		//    4    9:areturn         
		}

		public static DrawOrder[] values()
		{
			return (DrawOrder[])((DrawOrder []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field CombinedChart$DrawOrder[] $VALUES>
		//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.github.mikephil.charting.charts.CombinedChart$DrawOrder_3B_.clone()>
		//    2    6:checkcast       #50  <Class CombinedChart$DrawOrder[]>
		//    3    9:areturn         
		}

		private static final DrawOrder $VALUES[];
		public static final DrawOrder BAR;
		public static final DrawOrder BUBBLE;
		public static final DrawOrder CANDLE;
		public static final DrawOrder LINE;
		public static final DrawOrder SCATTER;

		static 
		{
			BAR = new DrawOrder("BAR", 0);
		//    0    0:new             #2   <Class CombinedChart$DrawOrder>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "BAR">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void CombinedChart$DrawOrder(String, int)>
		//    5   10:putstatic       #25  <Field CombinedChart$DrawOrder BAR>
			BUBBLE = new DrawOrder("BUBBLE", 1);
		//    6   13:new             #2   <Class CombinedChart$DrawOrder>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "BUBBLE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void CombinedChart$DrawOrder(String, int)>
		//   11   23:putstatic       #28  <Field CombinedChart$DrawOrder BUBBLE>
			LINE = new DrawOrder("LINE", 2);
		//   12   26:new             #2   <Class CombinedChart$DrawOrder>
		//   13   29:dup             
		//   14   30:ldc1            #29  <String "LINE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void CombinedChart$DrawOrder(String, int)>
		//   17   36:putstatic       #31  <Field CombinedChart$DrawOrder LINE>
			CANDLE = new DrawOrder("CANDLE", 3);
		//   18   39:new             #2   <Class CombinedChart$DrawOrder>
		//   19   42:dup             
		//   20   43:ldc1            #32  <String "CANDLE">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void CombinedChart$DrawOrder(String, int)>
		//   23   49:putstatic       #34  <Field CombinedChart$DrawOrder CANDLE>
			SCATTER = new DrawOrder("SCATTER", 4);
		//   24   52:new             #2   <Class CombinedChart$DrawOrder>
		//   25   55:dup             
		//   26   56:ldc1            #35  <String "SCATTER">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #23  <Method void CombinedChart$DrawOrder(String, int)>
		//   29   62:putstatic       #37  <Field CombinedChart$DrawOrder SCATTER>
			$VALUES = (new DrawOrder[] {
				BAR, BUBBLE, LINE, CANDLE, SCATTER
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       DrawOrder[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:getstatic       #25  <Field CombinedChart$DrawOrder BAR>
		//   35   74:aastore         
		//   36   75:dup             
		//   37   76:iconst_1        
		//   38   77:getstatic       #28  <Field CombinedChart$DrawOrder BUBBLE>
		//   39   80:aastore         
		//   40   81:dup             
		//   41   82:iconst_2        
		//   42   83:getstatic       #31  <Field CombinedChart$DrawOrder LINE>
		//   43   86:aastore         
		//   44   87:dup             
		//   45   88:iconst_3        
		//   46   89:getstatic       #34  <Field CombinedChart$DrawOrder CANDLE>
		//   47   92:aastore         
		//   48   93:dup             
		//   49   94:iconst_4        
		//   50   95:getstatic       #37  <Field CombinedChart$DrawOrder SCATTER>
		//   51   98:aastore         
		//   52   99:putstatic       #39  <Field CombinedChart$DrawOrder[] $VALUES>
		//*  53  102:return          
		}

		private DrawOrder(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public CombinedChart(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void BarLineChartBase(Context)>
		mDrawHighlightArrow = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #30  <Field boolean mDrawHighlightArrow>
		mDrawValueAboveBar = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #32  <Field boolean mDrawValueAboveBar>
		mDrawBarShadow = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #34  <Field boolean mDrawBarShadow>
		mDrawOrder = (new DrawOrder[] {
			DrawOrder.BAR, DrawOrder.BUBBLE, DrawOrder.LINE, DrawOrder.CANDLE, DrawOrder.SCATTER
		});
	//   12   20:aload_0         
	//   13   21:iconst_5        
	//   14   22:anewarray       DrawOrder[]
	//   15   25:dup             
	//   16   26:iconst_0        
	//   17   27:getstatic       #38  <Field CombinedChart$DrawOrder CombinedChart$DrawOrder.BAR>
	//   18   30:aastore         
	//   19   31:dup             
	//   20   32:iconst_1        
	//   21   33:getstatic       #41  <Field CombinedChart$DrawOrder CombinedChart$DrawOrder.BUBBLE>
	//   22   36:aastore         
	//   23   37:dup             
	//   24   38:iconst_2        
	//   25   39:getstatic       #44  <Field CombinedChart$DrawOrder CombinedChart$DrawOrder.LINE>
	//   26   42:aastore         
	//   27   43:dup             
	//   28   44:iconst_3        
	//   29   45:getstatic       #47  <Field CombinedChart$DrawOrder CombinedChart$DrawOrder.CANDLE>
	//   30   48:aastore         
	//   31   49:dup             
	//   32   50:iconst_4        
	//   33   51:getstatic       #50  <Field CombinedChart$DrawOrder CombinedChart$DrawOrder.SCATTER>
	//   34   54:aastore         
	//   35   55:putfield        #52  <Field CombinedChart$DrawOrder[] mDrawOrder>
	//   36   58:return          
	}

	public CombinedChart(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #56  <Method void BarLineChartBase(Context, AttributeSet)>
		mDrawHighlightArrow = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #30  <Field boolean mDrawHighlightArrow>
		mDrawValueAboveBar = true;
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:putfield        #32  <Field boolean mDrawValueAboveBar>
		mDrawBarShadow = false;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #34  <Field boolean mDrawBarShadow>
		mDrawOrder = (new DrawOrder[] {
			DrawOrder.BAR, DrawOrder.BUBBLE, DrawOrder.LINE, DrawOrder.CANDLE, DrawOrder.SCATTER
		});
	//   13   21:aload_0         
	//   14   22:iconst_5        
	//   15   23:anewarray       DrawOrder[]
	//   16   26:dup             
	//   17   27:iconst_0        
	//   18   28:getstatic       #38  <Field CombinedChart$DrawOrder CombinedChart$DrawOrder.BAR>
	//   19   31:aastore         
	//   20   32:dup             
	//   21   33:iconst_1        
	//   22   34:getstatic       #41  <Field CombinedChart$DrawOrder CombinedChart$DrawOrder.BUBBLE>
	//   23   37:aastore         
	//   24   38:dup             
	//   25   39:iconst_2        
	//   26   40:getstatic       #44  <Field CombinedChart$DrawOrder CombinedChart$DrawOrder.LINE>
	//   27   43:aastore         
	//   28   44:dup             
	//   29   45:iconst_3        
	//   30   46:getstatic       #47  <Field CombinedChart$DrawOrder CombinedChart$DrawOrder.CANDLE>
	//   31   49:aastore         
	//   32   50:dup             
	//   33   51:iconst_4        
	//   34   52:getstatic       #50  <Field CombinedChart$DrawOrder CombinedChart$DrawOrder.SCATTER>
	//   35   55:aastore         
	//   36   56:putfield        #52  <Field CombinedChart$DrawOrder[] mDrawOrder>
	//   37   59:return          
	}

	public CombinedChart(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #59  <Method void BarLineChartBase(Context, AttributeSet, int)>
		mDrawHighlightArrow = false;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #30  <Field boolean mDrawHighlightArrow>
		mDrawValueAboveBar = true;
	//    8   12:aload_0         
	//    9   13:iconst_1        
	//   10   14:putfield        #32  <Field boolean mDrawValueAboveBar>
		mDrawBarShadow = false;
	//   11   17:aload_0         
	//   12   18:iconst_0        
	//   13   19:putfield        #34  <Field boolean mDrawBarShadow>
		mDrawOrder = (new DrawOrder[] {
			DrawOrder.BAR, DrawOrder.BUBBLE, DrawOrder.LINE, DrawOrder.CANDLE, DrawOrder.SCATTER
		});
	//   14   22:aload_0         
	//   15   23:iconst_5        
	//   16   24:anewarray       DrawOrder[]
	//   17   27:dup             
	//   18   28:iconst_0        
	//   19   29:getstatic       #38  <Field CombinedChart$DrawOrder CombinedChart$DrawOrder.BAR>
	//   20   32:aastore         
	//   21   33:dup             
	//   22   34:iconst_1        
	//   23   35:getstatic       #41  <Field CombinedChart$DrawOrder CombinedChart$DrawOrder.BUBBLE>
	//   24   38:aastore         
	//   25   39:dup             
	//   26   40:iconst_2        
	//   27   41:getstatic       #44  <Field CombinedChart$DrawOrder CombinedChart$DrawOrder.LINE>
	//   28   44:aastore         
	//   29   45:dup             
	//   30   46:iconst_3        
	//   31   47:getstatic       #47  <Field CombinedChart$DrawOrder CombinedChart$DrawOrder.CANDLE>
	//   32   50:aastore         
	//   33   51:dup             
	//   34   52:iconst_4        
	//   35   53:getstatic       #50  <Field CombinedChart$DrawOrder CombinedChart$DrawOrder.SCATTER>
	//   36   56:aastore         
	//   37   57:putfield        #52  <Field CombinedChart$DrawOrder[] mDrawOrder>
	//   38   60:return          
	}

	protected void calcMinMax()
	{
		super.calcMinMax();
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void BarLineChartBase.calcMinMax()>
		if(getBarData() != null || getCandleData() != null || getBubbleData() != null)
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #67  <Method BarData getBarData()>
	//*   4    8:ifnonnull       25
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #71  <Method CandleData getCandleData()>
	//*   7   15:ifnonnull       25
	//*   8   18:aload_0         
	//*   9   19:invokevirtual   #75  <Method BubbleData getBubbleData()>
	//*  10   22:ifnull          141
		{
			mXChartMin = -0.5F;
	//   11   25:aload_0         
	//   12   26:ldc1            #76  <Float -0.5F>
	//   13   28:putfield        #80  <Field float mXChartMin>
			mXChartMax = (float)((CombinedData)mData).getXVals().size() - 0.5F;
	//   14   31:aload_0         
	//   15   32:aload_0         
	//   16   33:getfield        #84  <Field ChartData mData>
	//   17   36:checkcast       #86  <Class CombinedData>
	//   18   39:invokevirtual   #90  <Method List CombinedData.getXVals()>
	//   19   42:invokeinterface #96  <Method int List.size()>
	//   20   47:i2f             
	//   21   48:ldc1            #97  <Float 0.5F>
	//   22   50:fsub            
	//   23   51:putfield        #100 <Field float mXChartMax>
			if(getBubbleData() != null)
	//*  24   54:aload_0         
	//*  25   55:invokevirtual   #75  <Method BubbleData getBubbleData()>
	//*  26   58:ifnull          141
			{
				Iterator iterator = getBubbleData().getDataSets().iterator();
	//   27   61:aload_0         
	//   28   62:invokevirtual   #75  <Method BubbleData getBubbleData()>
	//   29   65:invokevirtual   #105 <Method List BubbleData.getDataSets()>
	//   30   68:invokeinterface #109 <Method Iterator List.iterator()>
	//   31   73:astore_3        
				do
				{
					if(!iterator.hasNext())
						break;
	//   32   74:aload_3         
	//   33   75:invokeinterface #115 <Method boolean Iterator.hasNext()>
	//   34   80:ifeq            141
					IBubbleDataSet ibubbledataset = (IBubbleDataSet)iterator.next();
	//   35   83:aload_3         
	//   36   84:invokeinterface #119 <Method Object Iterator.next()>
	//   37   89:checkcast       #121 <Class IBubbleDataSet>
	//   38   92:astore          4
					float f = ibubbledataset.getXMin();
	//   39   94:aload           4
	//   40   96:invokeinterface #125 <Method float IBubbleDataSet.getXMin()>
	//   41  101:fstore_1        
					float f1 = ibubbledataset.getXMax();
	//   42  102:aload           4
	//   43  104:invokeinterface #128 <Method float IBubbleDataSet.getXMax()>
	//   44  109:fstore_2        
					if(f < mXChartMin)
	//*  45  110:fload_1         
	//*  46  111:aload_0         
	//*  47  112:getfield        #80  <Field float mXChartMin>
	//*  48  115:fcmpg           
	//*  49  116:ifge            124
						mXChartMin = f;
	//   50  119:aload_0         
	//   51  120:fload_1         
	//   52  121:putfield        #80  <Field float mXChartMin>
					if(f1 > mXChartMax)
	//*  53  124:fload_2         
	//*  54  125:aload_0         
	//*  55  126:getfield        #100 <Field float mXChartMax>
	//*  56  129:fcmpl           
	//*  57  130:ifle            74
						mXChartMax = f1;
	//   58  133:aload_0         
	//   59  134:fload_2         
	//   60  135:putfield        #100 <Field float mXChartMax>
				} while(true);
	//   61  138:goto            74
			}
		}
		mDeltaX = Math.abs(mXChartMax - mXChartMin);
	//   62  141:aload_0         
	//   63  142:aload_0         
	//   64  143:getfield        #100 <Field float mXChartMax>
	//   65  146:aload_0         
	//   66  147:getfield        #80  <Field float mXChartMin>
	//   67  150:fsub            
	//   68  151:invokestatic    #134 <Method float Math.abs(float)>
	//   69  154:putfield        #137 <Field float mDeltaX>
		if(mDeltaX == 0.0F && getLineData() != null && getLineData().getYValCount() > 0)
	//*  70  157:aload_0         
	//*  71  158:getfield        #137 <Field float mDeltaX>
	//*  72  161:fconst_0        
	//*  73  162:fcmpl           
	//*  74  163:ifne            188
	//*  75  166:aload_0         
	//*  76  167:invokevirtual   #141 <Method LineData getLineData()>
	//*  77  170:ifnull          188
	//*  78  173:aload_0         
	//*  79  174:invokevirtual   #141 <Method LineData getLineData()>
	//*  80  177:invokevirtual   #146 <Method int LineData.getYValCount()>
	//*  81  180:ifle            188
			mDeltaX = 1.0F;
	//   82  183:aload_0         
	//   83  184:fconst_1        
	//   84  185:putfield        #137 <Field float mDeltaX>
	//   85  188:return          
	}

	public BarData getBarData()
	{
		if(mData == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field ChartData mData>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return ((CombinedData)mData).getBarData();
	//    5    9:aload_0         
	//    6   10:getfield        #84  <Field ChartData mData>
	//    7   13:checkcast       #86  <Class CombinedData>
	//    8   16:invokevirtual   #147 <Method BarData CombinedData.getBarData()>
	//    9   19:areturn         
	}

	public BubbleData getBubbleData()
	{
		if(mData == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field ChartData mData>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return ((CombinedData)mData).getBubbleData();
	//    5    9:aload_0         
	//    6   10:getfield        #84  <Field ChartData mData>
	//    7   13:checkcast       #86  <Class CombinedData>
	//    8   16:invokevirtual   #148 <Method BubbleData CombinedData.getBubbleData()>
	//    9   19:areturn         
	}

	public CandleData getCandleData()
	{
		if(mData == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field ChartData mData>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return ((CombinedData)mData).getCandleData();
	//    5    9:aload_0         
	//    6   10:getfield        #84  <Field ChartData mData>
	//    7   13:checkcast       #86  <Class CombinedData>
	//    8   16:invokevirtual   #149 <Method CandleData CombinedData.getCandleData()>
	//    9   19:areturn         
	}

	public DrawOrder[] getDrawOrder()
	{
		return mDrawOrder;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field CombinedChart$DrawOrder[] mDrawOrder>
	//    2    4:areturn         
	}

	public LineData getLineData()
	{
		if(mData == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field ChartData mData>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return ((CombinedData)mData).getLineData();
	//    5    9:aload_0         
	//    6   10:getfield        #84  <Field ChartData mData>
	//    7   13:checkcast       #86  <Class CombinedData>
	//    8   16:invokevirtual   #152 <Method LineData CombinedData.getLineData()>
	//    9   19:areturn         
	}

	public ScatterData getScatterData()
	{
		if(mData == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field ChartData mData>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return ((CombinedData)mData).getScatterData();
	//    5    9:aload_0         
	//    6   10:getfield        #84  <Field ChartData mData>
	//    7   13:checkcast       #86  <Class CombinedData>
	//    8   16:invokevirtual   #156 <Method ScatterData CombinedData.getScatterData()>
	//    9   19:areturn         
	}

	protected void init()
	{
		super.init();
	//    0    0:aload_0         
	//    1    1:invokespecial   #159 <Method void BarLineChartBase.init()>
		setHighlighter(((com.github.mikephil.charting.highlight.ChartHighlighter) (new CombinedHighlighter(((com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider) (this))))));
	//    2    4:aload_0         
	//    3    5:new             #161 <Class CombinedHighlighter>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #164 <Method void CombinedHighlighter(com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider)>
	//    7   13:invokevirtual   #168 <Method void setHighlighter(com.github.mikephil.charting.highlight.ChartHighlighter)>
	//    8   16:return          
	}

	public boolean isDrawBarShadowEnabled()
	{
		return mDrawBarShadow;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean mDrawBarShadow>
	//    2    4:ireturn         
	}

	public boolean isDrawHighlightArrowEnabled()
	{
		return mDrawHighlightArrow;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field boolean mDrawHighlightArrow>
	//    2    4:ireturn         
	}

	public boolean isDrawValueAboveBarEnabled()
	{
		return mDrawValueAboveBar;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field boolean mDrawValueAboveBar>
	//    2    4:ireturn         
	}

	public volatile void setData(ChartData chartdata)
	{
		setData((CombinedData)chartdata);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #86  <Class CombinedData>
	//    3    5:invokevirtual   #176 <Method void setData(CombinedData)>
	//    4    8:return          
	}

	public void setData(CombinedData combineddata)
	{
		mData = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #84  <Field ChartData mData>
		mRenderer = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #180 <Field DataRenderer mRenderer>
		super.setData(((ChartData) (combineddata)));
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #182 <Method void BarLineChartBase.setData(ChartData)>
		mRenderer = ((DataRenderer) (new CombinedChartRenderer(this, mAnimator, mViewPortHandler)));
	//    9   15:aload_0         
	//   10   16:new             #184 <Class CombinedChartRenderer>
	//   11   19:dup             
	//   12   20:aload_0         
	//   13   21:aload_0         
	//   14   22:getfield        #188 <Field com.github.mikephil.charting.animation.ChartAnimator mAnimator>
	//   15   25:aload_0         
	//   16   26:getfield        #192 <Field com.github.mikephil.charting.utils.ViewPortHandler mViewPortHandler>
	//   17   29:invokespecial   #195 <Method void CombinedChartRenderer(CombinedChart, com.github.mikephil.charting.animation.ChartAnimator, com.github.mikephil.charting.utils.ViewPortHandler)>
	//   18   32:putfield        #180 <Field DataRenderer mRenderer>
		mRenderer.initBuffers();
	//   19   35:aload_0         
	//   20   36:getfield        #180 <Field DataRenderer mRenderer>
	//   21   39:invokevirtual   #200 <Method void DataRenderer.initBuffers()>
	//   22   42:return          
	}

	public void setDrawBarShadow(boolean flag)
	{
		mDrawBarShadow = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #34  <Field boolean mDrawBarShadow>
	//    3    5:return          
	}

	public void setDrawHighlightArrow(boolean flag)
	{
		mDrawHighlightArrow = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field boolean mDrawHighlightArrow>
	//    3    5:return          
	}

	public void setDrawOrder(DrawOrder adraworder[])
	{
		if(adraworder == null || adraworder.length <= 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:ifgt            10
		{
			return;
	//    5    9:return          
		} else
		{
			mDrawOrder = adraworder;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #52  <Field CombinedChart$DrawOrder[] mDrawOrder>
			return;
	//    9   15:return          
		}
	}

	public void setDrawValueAboveBar(boolean flag)
	{
		mDrawValueAboveBar = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #32  <Field boolean mDrawValueAboveBar>
	//    3    5:return          
	}

	private boolean mDrawBarShadow;
	private boolean mDrawHighlightArrow;
	protected DrawOrder mDrawOrder[];
	private boolean mDrawValueAboveBar;
}
