// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.utils.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.highlight:
//			Highlight

public class ChartHighlighter
{

	public ChartHighlighter(BarLineScatterCandleBubbleDataProvider barlinescattercandlebubbledataprovider)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mChart = barlinescattercandlebubbledataprovider;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field BarLineScatterCandleBubbleDataProvider mChart>
	//    5    9:return          
	}

	protected int getDataSetIndex(int i, float f, float f1)
	{
		List list = getSelectionDetailsAtIndex(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #24  <Method List getSelectionDetailsAtIndex(int)>
	//    3    5:astore          5
		com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency;
		if(Utils.getMinimumDistance(list, f1, com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT) < Utils.getMinimumDistance(list, f1, com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT))
	//*   4    7:aload           5
	//*   5    9:fload_3         
	//*   6   10:getstatic       #30  <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//*   7   13:invokestatic    #36  <Method float Utils.getMinimumDistance(List, float, com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//*   8   16:aload           5
	//*   9   18:fload_3         
	//*  10   19:getstatic       #39  <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.RIGHT>
	//*  11   22:invokestatic    #36  <Method float Utils.getMinimumDistance(List, float, com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//*  12   25:fcmpg           
	//*  13   26:ifge            43
			axisdependency = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT;
	//   14   29:getstatic       #30  <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//   15   32:astore          4
		else
	//*  16   34:aload           5
	//*  17   36:fload_3         
	//*  18   37:aload           4
	//*  19   39:invokestatic    #43  <Method int Utils.getClosestDataSetIndex(List, float, com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//*  20   42:ireturn         
			axisdependency = com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT;
	//   21   43:getstatic       #39  <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.RIGHT>
	//   22   46:astore          4
		return Utils.getClosestDataSetIndex(list, f1, axisdependency);
	//*  23   48:goto            34
	}

	public Highlight getHighlight(float f, float f1)
	{
		int i = getXIndex(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #49  <Method int getXIndex(float)>
	//    3    5:istore_3        
		int j;
		if(i != 0x80000001)
	//*   4    6:iload_3         
	//*   5    7:ldc1            #50  <Int 0x80000001>
	//*   6    9:icmpne          14
	//*   7   12:aconst_null     
	//*   8   13:areturn         
	//*   9   14:aload_0         
	//*  10   15:iload_3         
	//*  11   16:fload_1         
	//*  12   17:fload_2         
	//*  13   18:invokevirtual   #52  <Method int getDataSetIndex(int, float, float)>
	//*  14   21:istore          4
			if((j = getDataSetIndex(i, f, f1)) != 0x80000001)
	//*  15   23:iload           4
	//*  16   25:ldc1            #50  <Int 0x80000001>
	//*  17   27:icmpeq          12
				return new Highlight(i, j);
	//   18   30:new             #54  <Class Highlight>
	//   19   33:dup             
	//   20   34:iload_3         
	//   21   35:iload           4
	//   22   37:invokespecial   #57  <Method void Highlight(int, int)>
	//   23   40:areturn         
		return null;
	}

	protected List getSelectionDetailsAtIndex(int i)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #59  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void ArrayList()>
	//    3    7:astore          4
		float af[] = new float[2];
	//    4    9:iconst_2        
	//    5   10:newarray        float[]
	//    6   12:astore          5
		int j = 0;
	//    7   14:iconst_0        
	//    8   15:istore_3        
		while(j < mChart.getData().getDataSetCount()) 
	//*   9   16:iload_3         
	//*  10   17:aload_0         
	//*  11   18:getfield        #15  <Field BarLineScatterCandleBubbleDataProvider mChart>
	//*  12   21:invokeinterface #66  <Method BarLineScatterCandleBubbleData BarLineScatterCandleBubbleDataProvider.getData()>
	//*  13   26:invokevirtual   #72  <Method int BarLineScatterCandleBubbleData.getDataSetCount()>
	//*  14   29:icmpge          141
		{
			IDataSet idataset = mChart.getData().getDataSetByIndex(j);
	//   15   32:aload_0         
	//   16   33:getfield        #15  <Field BarLineScatterCandleBubbleDataProvider mChart>
	//   17   36:invokeinterface #66  <Method BarLineScatterCandleBubbleData BarLineScatterCandleBubbleDataProvider.getData()>
	//   18   41:iload_3         
	//   19   42:invokevirtual   #76  <Method IDataSet BarLineScatterCandleBubbleData.getDataSetByIndex(int)>
	//   20   45:astore          6
			if(idataset.isHighlightEnabled())
	//*  21   47:aload           6
	//*  22   49:invokeinterface #82  <Method boolean IDataSet.isHighlightEnabled()>
	//*  23   54:ifne            64
	//*  24   57:iload_3         
	//*  25   58:iconst_1        
	//*  26   59:iadd            
	//*  27   60:istore_3        
	//*  28   61:goto            16
			{
				float f = idataset.getYValForXIndex(i);
	//   29   64:aload           6
	//   30   66:iload_1         
	//   31   67:invokeinterface #86  <Method float IDataSet.getYValForXIndex(int)>
	//   32   72:fstore_2        
				if(f != (0.0F / 0.0F))
	//*  33   73:fload_2         
	//*  34   74:ldc1            #87  <Float (0.0F / 0.0F)>
	//*  35   76:fcmpl           
	//*  36   77:ifeq            57
				{
					af[1] = f;
	//   37   80:aload           5
	//   38   82:iconst_1        
	//   39   83:fload_2         
	//   40   84:fastore         
					mChart.getTransformer(idataset.getAxisDependency()).pointValuesToPixel(af);
	//   41   85:aload_0         
	//   42   86:getfield        #15  <Field BarLineScatterCandleBubbleDataProvider mChart>
	//   43   89:aload           6
	//   44   91:invokeinterface #91  <Method com.github.mikephil.charting.components.YAxis$AxisDependency IDataSet.getAxisDependency()>
	//   45   96:invokeinterface #95  <Method Transformer BarLineScatterCandleBubbleDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   46  101:aload           5
	//   47  103:invokevirtual   #101 <Method void Transformer.pointValuesToPixel(float[])>
					if(!Float.isNaN(af[1]))
	//*  48  106:aload           5
	//*  49  108:iconst_1        
	//*  50  109:faload          
	//*  51  110:invokestatic    #107 <Method boolean Float.isNaN(float)>
	//*  52  113:ifne            57
						((List) (arraylist)).add(((Object) (new SelectionDetail(af[1], j, idataset))));
	//   53  116:aload           4
	//   54  118:new             #109 <Class SelectionDetail>
	//   55  121:dup             
	//   56  122:aload           5
	//   57  124:iconst_1        
	//   58  125:faload          
	//   59  126:iload_3         
	//   60  127:aload           6
	//   61  129:invokespecial   #112 <Method void SelectionDetail(float, int, IDataSet)>
	//   62  132:invokeinterface #118 <Method boolean List.add(Object)>
	//   63  137:pop             
				}
			}
			j++;
		}
	//*  64  138:goto            57
		return ((List) (arraylist));
	//   65  141:aload           4
	//   66  143:areturn         
	}

	protected int getXIndex(float f)
	{
		float af[] = new float[2];
	//    0    0:iconst_2        
	//    1    1:newarray        float[]
	//    2    3:astore_2        
		af[0] = f;
	//    3    4:aload_2         
	//    4    5:iconst_0        
	//    5    6:fload_1         
	//    6    7:fastore         
		mChart.getTransformer(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT).pixelsToValue(af);
	//    7    8:aload_0         
	//    8    9:getfield        #15  <Field BarLineScatterCandleBubbleDataProvider mChart>
	//    9   12:getstatic       #30  <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//   10   15:invokeinterface #95  <Method Transformer BarLineScatterCandleBubbleDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   11   20:aload_2         
	//   12   21:invokevirtual   #122 <Method void Transformer.pixelsToValue(float[])>
		return Math.round(af[0]);
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:faload          
	//   16   27:invokestatic    #127 <Method int Math.round(float)>
	//   17   30:ireturn         
	}

	protected BarLineScatterCandleBubbleDataProvider mChart;
}
