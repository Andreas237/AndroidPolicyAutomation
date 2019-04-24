// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet;
import java.util.*;

// Referenced classes of package com.github.mikephil.charting.data:
//			BarLineScatterCandleBubbleData

public class BubbleData extends BarLineScatterCandleBubbleData
{

	public BubbleData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void BarLineScatterCandleBubbleData()>
	//    2    4:return          
	}

	public BubbleData(List list)
	{
		super(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void BarLineScatterCandleBubbleData(List)>
	//    3    5:return          
	}

	public BubbleData(List list, IBubbleDataSet ibubbledataset)
	{
		super(list, toList(ibubbledataset));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #20  <Method List toList(IBubbleDataSet)>
	//    4    6:invokespecial   #23  <Method void BarLineScatterCandleBubbleData(List, List)>
	//    5    9:return          
	}

	public BubbleData(List list, List list1)
	{
		super(list, list1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #23  <Method void BarLineScatterCandleBubbleData(List, List)>
	//    4    6:return          
	}

	public BubbleData(String as[])
	{
		super(as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void BarLineScatterCandleBubbleData(String[])>
	//    3    5:return          
	}

	public BubbleData(String as[], IBubbleDataSet ibubbledataset)
	{
		super(as, toList(ibubbledataset));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #20  <Method List toList(IBubbleDataSet)>
	//    4    6:invokespecial   #32  <Method void BarLineScatterCandleBubbleData(String[], List)>
	//    5    9:return          
	}

	public BubbleData(String as[], List list)
	{
		super(as, list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #32  <Method void BarLineScatterCandleBubbleData(String[], List)>
	//    4    6:return          
	}

	private static List toList(IBubbleDataSet ibubbledataset)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #35  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void ArrayList()>
	//    3    7:astore_1        
		((List) (arraylist)).add(((Object) (ibubbledataset)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokeinterface #42  <Method boolean List.add(Object)>
	//    7   15:pop             
		return ((List) (arraylist));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public void setHighlightCircleWidth(float f)
	{
		for(Iterator iterator = mDataSets.iterator(); iterator.hasNext(); ((IBubbleDataSet)iterator.next()).setHighlightCircleWidth(f));
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field List mDataSets>
	//    2    4:invokeinterface #53  <Method Iterator List.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #59  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            37
	//    7   19:aload_2         
	//    8   20:invokeinterface #63  <Method Object Iterator.next()>
	//    9   25:checkcast       #65  <Class IBubbleDataSet>
	//   10   28:fload_1         
	//   11   29:invokeinterface #67  <Method void IBubbleDataSet.setHighlightCircleWidth(float)>
	//*  12   34:goto            10
	//   13   37:return          
	}
}
