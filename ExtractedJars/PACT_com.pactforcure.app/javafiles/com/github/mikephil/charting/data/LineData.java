// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.data:
//			BarLineScatterCandleBubbleData

public class LineData extends BarLineScatterCandleBubbleData
{

	public LineData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void BarLineScatterCandleBubbleData()>
	//    2    4:return          
	}

	public LineData(List list)
	{
		super(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void BarLineScatterCandleBubbleData(List)>
	//    3    5:return          
	}

	public LineData(List list, ILineDataSet ilinedataset)
	{
		super(list, toList(ilinedataset));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #20  <Method List toList(ILineDataSet)>
	//    4    6:invokespecial   #23  <Method void BarLineScatterCandleBubbleData(List, List)>
	//    5    9:return          
	}

	public LineData(List list, List list1)
	{
		super(list, list1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #23  <Method void BarLineScatterCandleBubbleData(List, List)>
	//    4    6:return          
	}

	public LineData(String as[])
	{
		super(as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void BarLineScatterCandleBubbleData(String[])>
	//    3    5:return          
	}

	public LineData(String as[], ILineDataSet ilinedataset)
	{
		super(as, toList(ilinedataset));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #20  <Method List toList(ILineDataSet)>
	//    4    6:invokespecial   #32  <Method void BarLineScatterCandleBubbleData(String[], List)>
	//    5    9:return          
	}

	public LineData(String as[], List list)
	{
		super(as, list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #32  <Method void BarLineScatterCandleBubbleData(String[], List)>
	//    4    6:return          
	}

	private static List toList(ILineDataSet ilinedataset)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #35  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void ArrayList()>
	//    3    7:astore_1        
		((List) (arraylist)).add(((Object) (ilinedataset)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokeinterface #42  <Method boolean List.add(Object)>
	//    7   15:pop             
		return ((List) (arraylist));
	//    8   16:aload_1         
	//    9   17:areturn         
	}
}
