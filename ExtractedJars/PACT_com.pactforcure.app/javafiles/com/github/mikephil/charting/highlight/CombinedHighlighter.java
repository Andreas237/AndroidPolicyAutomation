// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.utils.SelectionDetail;
import com.github.mikephil.charting.utils.Transformer;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.highlight:
//			ChartHighlighter

public class CombinedHighlighter extends ChartHighlighter
{

	public CombinedHighlighter(BarLineScatterCandleBubbleDataProvider barlinescattercandlebubbledataprovider)
	{
		super(barlinescattercandlebubbledataprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void ChartHighlighter(BarLineScatterCandleBubbleDataProvider)>
	//    3    5:return          
	}

	protected List getSelectionDetailsAtIndex(int i)
	{
		List list = ((CombinedData)mChart.getData()).getAllData();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field BarLineScatterCandleBubbleDataProvider mChart>
	//    2    4:invokeinterface #22  <Method com.github.mikephil.charting.data.BarLineScatterCandleBubbleData BarLineScatterCandleBubbleDataProvider.getData()>
	//    3    9:checkcast       #24  <Class CombinedData>
	//    4   12:invokevirtual   #28  <Method List CombinedData.getAllData()>
	//    5   15:astore          5
		ArrayList arraylist = new ArrayList();
	//    6   17:new             #30  <Class ArrayList>
	//    7   20:dup             
	//    8   21:invokespecial   #33  <Method void ArrayList()>
	//    9   24:astore          6
		float af[] = new float[2];
	//   10   26:iconst_2        
	//   11   27:newarray        float[]
	//   12   29:astore          7
		int j = 0;
	//   13   31:iconst_0        
	//   14   32:istore_3        
		do
		{
			if(j >= list.size())
				break;
	//   15   33:iload_3         
	//   16   34:aload           5
	//   17   36:invokeinterface #39  <Method int List.size()>
	//   18   41:icmpge          188
			int k = 0;
	//   19   44:iconst_0        
	//   20   45:istore          4
			while(k < ((ChartData)list.get(j)).getDataSetCount()) 
	//*  21   47:iload           4
	//*  22   49:aload           5
	//*  23   51:iload_3         
	//*  24   52:invokeinterface #43  <Method Object List.get(int)>
	//*  25   57:checkcast       #45  <Class ChartData>
	//*  26   60:invokevirtual   #48  <Method int ChartData.getDataSetCount()>
	//*  27   63:icmpge          181
			{
				IDataSet idataset = ((ChartData)list.get(j)).getDataSetByIndex(k);
	//   28   66:aload           5
	//   29   68:iload_3         
	//   30   69:invokeinterface #43  <Method Object List.get(int)>
	//   31   74:checkcast       #45  <Class ChartData>
	//   32   77:iload           4
	//   33   79:invokevirtual   #52  <Method IDataSet ChartData.getDataSetByIndex(int)>
	//   34   82:astore          8
				if(idataset.isHighlightEnabled())
	//*  35   84:aload           8
	//*  36   86:invokeinterface #58  <Method boolean IDataSet.isHighlightEnabled()>
	//*  37   91:ifne            103
	//*  38   94:iload           4
	//*  39   96:iconst_1        
	//*  40   97:iadd            
	//*  41   98:istore          4
	//*  42  100:goto            47
				{
					float f = idataset.getYValForXIndex(i);
	//   43  103:aload           8
	//   44  105:iload_1         
	//   45  106:invokeinterface #62  <Method float IDataSet.getYValForXIndex(int)>
	//   46  111:fstore_2        
					if(f != (0.0F / 0.0F))
	//*  47  112:fload_2         
	//*  48  113:ldc1            #63  <Float (0.0F / 0.0F)>
	//*  49  115:fcmpl           
	//*  50  116:ifeq            94
					{
						af[1] = f;
	//   51  119:aload           7
	//   52  121:iconst_1        
	//   53  122:fload_2         
	//   54  123:fastore         
						mChart.getTransformer(idataset.getAxisDependency()).pointValuesToPixel(af);
	//   55  124:aload_0         
	//   56  125:getfield        #16  <Field BarLineScatterCandleBubbleDataProvider mChart>
	//   57  128:aload           8
	//   58  130:invokeinterface #67  <Method com.github.mikephil.charting.components.YAxis$AxisDependency IDataSet.getAxisDependency()>
	//   59  135:invokeinterface #71  <Method Transformer BarLineScatterCandleBubbleDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   60  140:aload           7
	//   61  142:invokevirtual   #77  <Method void Transformer.pointValuesToPixel(float[])>
						if(!Float.isNaN(af[1]))
	//*  62  145:aload           7
	//*  63  147:iconst_1        
	//*  64  148:faload          
	//*  65  149:invokestatic    #83  <Method boolean Float.isNaN(float)>
	//*  66  152:ifne            94
							((List) (arraylist)).add(((Object) (new SelectionDetail(af[1], k, idataset))));
	//   67  155:aload           6
	//   68  157:new             #85  <Class SelectionDetail>
	//   69  160:dup             
	//   70  161:aload           7
	//   71  163:iconst_1        
	//   72  164:faload          
	//   73  165:iload           4
	//   74  167:aload           8
	//   75  169:invokespecial   #88  <Method void SelectionDetail(float, int, IDataSet)>
	//   76  172:invokeinterface #92  <Method boolean List.add(Object)>
	//   77  177:pop             
					}
				}
				k++;
			}
	//*  78  178:goto            94
			j++;
	//   79  181:iload_3         
	//   80  182:iconst_1        
	//   81  183:iadd            
	//   82  184:istore_3        
		} while(true);
	//   83  185:goto            33
		return ((List) (arraylist));
	//   84  188:aload           6
	//   85  190:areturn         
	}
}
