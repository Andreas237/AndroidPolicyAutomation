// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.*;

// Referenced classes of package com.github.mikephil.charting.renderer:
//			DataRenderer, BarChartRenderer, BubbleChartRenderer, LineChartRenderer, 
//			CandleStickChartRenderer, ScatterChartRenderer

public class CombinedChartRenderer extends DataRenderer
{

	public CombinedChartRenderer(CombinedChart combinedchart, ChartAnimator chartanimator, ViewPortHandler viewporthandler)
	{
		super(chartanimator, viewporthandler);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #14  <Method void DataRenderer(ChartAnimator, ViewPortHandler)>
		createRenderers(combinedchart, chartanimator, viewporthandler);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:aload_3         
	//    8   10:invokevirtual   #17  <Method void createRenderers(CombinedChart, ChartAnimator, ViewPortHandler)>
	//    9   13:return          
	}

	public void calcXBounds(BarLineScatterCandleBubbleDataProvider barlinescattercandlebubbledataprovider, int i)
	{
		for(Iterator iterator = mRenderers.iterator(); iterator.hasNext(); ((DataRenderer)iterator.next()).calcXBounds(barlinescattercandlebubbledataprovider, i));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field List mRenderers>
	//    2    4:invokeinterface #28  <Method Iterator List.iterator()>
	//    3    9:astore_3        
	//    4   10:aload_3         
	//    5   11:invokeinterface #34  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            36
	//    7   19:aload_3         
	//    8   20:invokeinterface #38  <Method Object Iterator.next()>
	//    9   25:checkcast       #4   <Class DataRenderer>
	//   10   28:aload_1         
	//   11   29:iload_2         
	//   12   30:invokevirtual   #40  <Method void DataRenderer.calcXBounds(BarLineScatterCandleBubbleDataProvider, int)>
	//*  13   33:goto            10
	//   14   36:return          
	}

	protected void createRenderers(CombinedChart combinedchart, ChartAnimator chartanimator, ViewPortHandler viewporthandler)
	{
		int i;
		int j;
		com.github.mikephil.charting.charts.CombinedChart.DrawOrder adraworder[];
		mRenderers = ((List) (new ArrayList()));
	//    0    0:aload_0         
	//    1    1:new             #42  <Class ArrayList>
	//    2    4:dup             
	//    3    5:invokespecial   #45  <Method void ArrayList()>
	//    4    8:putfield        #22  <Field List mRenderers>
		adraworder = combinedchart.getDrawOrder();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #51  <Method com.github.mikephil.charting.charts.CombinedChart$DrawOrder[] CombinedChart.getDrawOrder()>
	//    7   15:astore          6
		j = adraworder.length;
	//    8   17:aload           6
	//    9   19:arraylength     
	//   10   20:istore          5
		i = 0;
	//   11   22:iconst_0        
	//   12   23:istore          4
_L8:
		com.github.mikephil.charting.charts.CombinedChart.DrawOrder draworder;
		if(i >= j)
			break MISSING_BLOCK_LABEL_243;
	//   13   25:iload           4
	//   14   27:iload           5
	//   15   29:icmpge          243
		draworder = adraworder[i];
	//   16   32:aload           6
	//   17   34:iload           4
	//   18   36:aaload          
	//   19   37:astore          7
		static class _cls1
		{

			static final int $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder[];

			static 
			{
				$SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder = new int[com.github.mikephil.charting.charts.CombinedChart.DrawOrder.values().length];
			//    0    0:invokestatic    #18  <Method com.github.mikephil.charting.charts.CombinedChart$DrawOrder[] com.github.mikephil.charting.charts.CombinedChart$DrawOrder.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder>
				try
				{
					$SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder[com.github.mikephil.charting.charts.CombinedChart.DrawOrder.BAR.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder>
			//    5   12:getstatic       #24  <Field com.github.mikephil.charting.charts.CombinedChart$DrawOrder com.github.mikephil.charting.charts.CombinedChart$DrawOrder.BAR>
			//    6   15:invokevirtual   #28  <Method int com.github.mikephil.charting.charts.CombinedChart$DrawOrder.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder>
			//*  10   23:getstatic       #31  <Field com.github.mikephil.charting.charts.CombinedChart$DrawOrder com.github.mikephil.charting.charts.CombinedChart$DrawOrder.BUBBLE>
			//*  11   26:invokevirtual   #28  <Method int com.github.mikephil.charting.charts.CombinedChart$DrawOrder.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder>
			//*  15   34:getstatic       #34  <Field com.github.mikephil.charting.charts.CombinedChart$DrawOrder com.github.mikephil.charting.charts.CombinedChart$DrawOrder.LINE>
			//*  16   37:invokevirtual   #28  <Method int com.github.mikephil.charting.charts.CombinedChart$DrawOrder.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder>
			//*  20   45:getstatic       #37  <Field com.github.mikephil.charting.charts.CombinedChart$DrawOrder com.github.mikephil.charting.charts.CombinedChart$DrawOrder.CANDLE>
			//*  21   48:invokevirtual   #28  <Method int com.github.mikephil.charting.charts.CombinedChart$DrawOrder.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder>
			//*  25   56:getstatic       #40  <Field com.github.mikephil.charting.charts.CombinedChart$DrawOrder com.github.mikephil.charting.charts.CombinedChart$DrawOrder.SCATTER>
			//*  26   59:invokevirtual   #28  <Method int com.github.mikephil.charting.charts.CombinedChart$DrawOrder.ordinal()>
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
					$SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder[com.github.mikephil.charting.charts.CombinedChart.DrawOrder.BUBBLE.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror3) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder[com.github.mikephil.charting.charts.CombinedChart.DrawOrder.LINE.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder[com.github.mikephil.charting.charts.CombinedChart.DrawOrder.CANDLE.ordinal()] = 4;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder[com.github.mikephil.charting.charts.CombinedChart.DrawOrder.SCATTER.ordinal()] = 5;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  39   80:goto            20
			}
		}

		_cls1..SwitchMap.com.github.mikephil.charting.charts.CombinedChart.DrawOrder[draworder.ordinal()];
	//   20   39:getstatic       #55  <Field int[] CombinedChartRenderer$1.$SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder>
	//   21   42:aload           7
	//   22   44:invokevirtual   #61  <Method int com.github.mikephil.charting.charts.CombinedChart$DrawOrder.ordinal()>
	//   23   47:iaload          
		JVM INSTR tableswitch 1 5: default 84
	//	               1 93
	//	               2 123
	//	               3 153
	//	               4 183
	//	               5 213;
	//   24   48:tableswitch     1 5: default 84
	//	               1 93
	//	               2 123
	//	               3 153
	//	               4 183
	//	               5 213
		   goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
		break MISSING_BLOCK_LABEL_213;
_L1:
		break; /* Loop/switch isn't completed */
_L2:
		break; /* Loop/switch isn't completed */
_L9:
		i++;
	//   25   84:iload           4
	//   26   86:iconst_1        
	//   27   87:iadd            
	//   28   88:istore          4
		if(true) goto _L8; else goto _L7
	//   29   90:goto            25
_L7:
		if(combinedchart.getBarData() != null)
	//*  30   93:aload_1         
	//*  31   94:invokevirtual   #65  <Method com.github.mikephil.charting.data.BarData CombinedChart.getBarData()>
	//*  32   97:ifnull          84
			mRenderers.add(((Object) (new BarChartRenderer(((com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider) (combinedchart)), chartanimator, viewporthandler))));
	//   33  100:aload_0         
	//   34  101:getfield        #22  <Field List mRenderers>
	//   35  104:new             #67  <Class BarChartRenderer>
	//   36  107:dup             
	//   37  108:aload_1         
	//   38  109:aload_2         
	//   39  110:aload_3         
	//   40  111:invokespecial   #70  <Method void BarChartRenderer(com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider, ChartAnimator, ViewPortHandler)>
	//   41  114:invokeinterface #74  <Method boolean List.add(Object)>
	//   42  119:pop             
		  goto _L9
	//*  43  120:goto            84
_L3:
		if(combinedchart.getBubbleData() != null)
	//*  44  123:aload_1         
	//*  45  124:invokevirtual   #78  <Method com.github.mikephil.charting.data.BubbleData CombinedChart.getBubbleData()>
	//*  46  127:ifnull          84
			mRenderers.add(((Object) (new BubbleChartRenderer(((com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider) (combinedchart)), chartanimator, viewporthandler))));
	//   47  130:aload_0         
	//   48  131:getfield        #22  <Field List mRenderers>
	//   49  134:new             #80  <Class BubbleChartRenderer>
	//   50  137:dup             
	//   51  138:aload_1         
	//   52  139:aload_2         
	//   53  140:aload_3         
	//   54  141:invokespecial   #83  <Method void BubbleChartRenderer(com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider, ChartAnimator, ViewPortHandler)>
	//   55  144:invokeinterface #74  <Method boolean List.add(Object)>
	//   56  149:pop             
		  goto _L9
	//*  57  150:goto            84
_L4:
		if(combinedchart.getLineData() != null)
	//*  58  153:aload_1         
	//*  59  154:invokevirtual   #87  <Method com.github.mikephil.charting.data.LineData CombinedChart.getLineData()>
	//*  60  157:ifnull          84
			mRenderers.add(((Object) (new LineChartRenderer(((com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider) (combinedchart)), chartanimator, viewporthandler))));
	//   61  160:aload_0         
	//   62  161:getfield        #22  <Field List mRenderers>
	//   63  164:new             #89  <Class LineChartRenderer>
	//   64  167:dup             
	//   65  168:aload_1         
	//   66  169:aload_2         
	//   67  170:aload_3         
	//   68  171:invokespecial   #92  <Method void LineChartRenderer(com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider, ChartAnimator, ViewPortHandler)>
	//   69  174:invokeinterface #74  <Method boolean List.add(Object)>
	//   70  179:pop             
		  goto _L9
	//*  71  180:goto            84
_L5:
		if(combinedchart.getCandleData() != null)
	//*  72  183:aload_1         
	//*  73  184:invokevirtual   #96  <Method com.github.mikephil.charting.data.CandleData CombinedChart.getCandleData()>
	//*  74  187:ifnull          84
			mRenderers.add(((Object) (new CandleStickChartRenderer(((com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider) (combinedchart)), chartanimator, viewporthandler))));
	//   75  190:aload_0         
	//   76  191:getfield        #22  <Field List mRenderers>
	//   77  194:new             #98  <Class CandleStickChartRenderer>
	//   78  197:dup             
	//   79  198:aload_1         
	//   80  199:aload_2         
	//   81  200:aload_3         
	//   82  201:invokespecial   #101 <Method void CandleStickChartRenderer(com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider, ChartAnimator, ViewPortHandler)>
	//   83  204:invokeinterface #74  <Method boolean List.add(Object)>
	//   84  209:pop             
		  goto _L9
	//*  85  210:goto            84
		if(combinedchart.getScatterData() != null)
	//*  86  213:aload_1         
	//*  87  214:invokevirtual   #105 <Method com.github.mikephil.charting.data.ScatterData CombinedChart.getScatterData()>
	//*  88  217:ifnull          84
			mRenderers.add(((Object) (new ScatterChartRenderer(((com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider) (combinedchart)), chartanimator, viewporthandler))));
	//   89  220:aload_0         
	//   90  221:getfield        #22  <Field List mRenderers>
	//   91  224:new             #107 <Class ScatterChartRenderer>
	//   92  227:dup             
	//   93  228:aload_1         
	//   94  229:aload_2         
	//   95  230:aload_3         
	//   96  231:invokespecial   #110 <Method void ScatterChartRenderer(com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider, ChartAnimator, ViewPortHandler)>
	//   97  234:invokeinterface #74  <Method boolean List.add(Object)>
	//   98  239:pop             
		  goto _L9
	//*  99  240:goto            84
	//  100  243:return          
	}

	public void drawData(Canvas canvas)
	{
		for(Iterator iterator = mRenderers.iterator(); iterator.hasNext(); ((DataRenderer)iterator.next()).drawData(canvas));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field List mRenderers>
	//    2    4:invokeinterface #28  <Method Iterator List.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #34  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            35
	//    7   19:aload_2         
	//    8   20:invokeinterface #38  <Method Object Iterator.next()>
	//    9   25:checkcast       #4   <Class DataRenderer>
	//   10   28:aload_1         
	//   11   29:invokevirtual   #114 <Method void DataRenderer.drawData(Canvas)>
	//*  12   32:goto            10
	//   13   35:return          
	}

	public void drawExtras(Canvas canvas)
	{
		for(Iterator iterator = mRenderers.iterator(); iterator.hasNext(); ((DataRenderer)iterator.next()).drawExtras(canvas));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field List mRenderers>
	//    2    4:invokeinterface #28  <Method Iterator List.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #34  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            35
	//    7   19:aload_2         
	//    8   20:invokeinterface #38  <Method Object Iterator.next()>
	//    9   25:checkcast       #4   <Class DataRenderer>
	//   10   28:aload_1         
	//   11   29:invokevirtual   #117 <Method void DataRenderer.drawExtras(Canvas)>
	//*  12   32:goto            10
	//   13   35:return          
	}

	public void drawHighlighted(Canvas canvas, Highlight ahighlight[])
	{
		for(Iterator iterator = mRenderers.iterator(); iterator.hasNext(); ((DataRenderer)iterator.next()).drawHighlighted(canvas, ahighlight));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field List mRenderers>
	//    2    4:invokeinterface #28  <Method Iterator List.iterator()>
	//    3    9:astore_3        
	//    4   10:aload_3         
	//    5   11:invokeinterface #34  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            36
	//    7   19:aload_3         
	//    8   20:invokeinterface #38  <Method Object Iterator.next()>
	//    9   25:checkcast       #4   <Class DataRenderer>
	//   10   28:aload_1         
	//   11   29:aload_2         
	//   12   30:invokevirtual   #121 <Method void DataRenderer.drawHighlighted(Canvas, Highlight[])>
	//*  13   33:goto            10
	//   14   36:return          
	}

	public void drawValues(Canvas canvas)
	{
		for(Iterator iterator = mRenderers.iterator(); iterator.hasNext(); ((DataRenderer)iterator.next()).drawValues(canvas));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field List mRenderers>
	//    2    4:invokeinterface #28  <Method Iterator List.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #34  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            35
	//    7   19:aload_2         
	//    8   20:invokeinterface #38  <Method Object Iterator.next()>
	//    9   25:checkcast       #4   <Class DataRenderer>
	//   10   28:aload_1         
	//   11   29:invokevirtual   #124 <Method void DataRenderer.drawValues(Canvas)>
	//*  12   32:goto            10
	//   13   35:return          
	}

	public DataRenderer getSubRenderer(int i)
	{
		if(i >= mRenderers.size() || i < 0)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #22  <Field List mRenderers>
	//*   3    5:invokeinterface #129 <Method int List.size()>
	//*   4   10:icmpge          17
	//*   5   13:iload_1         
	//*   6   14:ifge            19
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
		else
			return (DataRenderer)mRenderers.get(i);
	//    9   19:aload_0         
	//   10   20:getfield        #22  <Field List mRenderers>
	//   11   23:iload_1         
	//   12   24:invokeinterface #133 <Method Object List.get(int)>
	//   13   29:checkcast       #4   <Class DataRenderer>
	//   14   32:areturn         
	}

	public List getSubRenderers()
	{
		return mRenderers;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field List mRenderers>
	//    2    4:areturn         
	}

	public void initBuffers()
	{
		for(Iterator iterator = mRenderers.iterator(); iterator.hasNext(); ((DataRenderer)iterator.next()).initBuffers());
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field List mRenderers>
	//    2    4:invokeinterface #28  <Method Iterator List.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #34  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            34
	//    7   19:aload_1         
	//    8   20:invokeinterface #38  <Method Object Iterator.next()>
	//    9   25:checkcast       #4   <Class DataRenderer>
	//   10   28:invokevirtual   #140 <Method void DataRenderer.initBuffers()>
	//*  11   31:goto            10
	//   12   34:return          
	}

	public void setSubRenderers(List list)
	{
		mRenderers = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field List mRenderers>
	//    3    5:return          
	}

	protected List mRenderers;
}
