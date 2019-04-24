// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import java.util.*;

// Referenced classes of package com.github.mikephil.charting.data:
//			BarLineScatterCandleBubbleData

public class ScatterData extends BarLineScatterCandleBubbleData
{

	public ScatterData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void BarLineScatterCandleBubbleData()>
	//    2    4:return          
	}

	public ScatterData(List list)
	{
		super(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void BarLineScatterCandleBubbleData(List)>
	//    3    5:return          
	}

	public ScatterData(List list, IScatterDataSet iscatterdataset)
	{
		super(list, toList(iscatterdataset));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #20  <Method List toList(IScatterDataSet)>
	//    4    6:invokespecial   #23  <Method void BarLineScatterCandleBubbleData(List, List)>
	//    5    9:return          
	}

	public ScatterData(List list, List list1)
	{
		super(list, list1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #23  <Method void BarLineScatterCandleBubbleData(List, List)>
	//    4    6:return          
	}

	public ScatterData(String as[])
	{
		super(as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void BarLineScatterCandleBubbleData(String[])>
	//    3    5:return          
	}

	public ScatterData(String as[], IScatterDataSet iscatterdataset)
	{
		super(as, toList(iscatterdataset));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #20  <Method List toList(IScatterDataSet)>
	//    4    6:invokespecial   #32  <Method void BarLineScatterCandleBubbleData(String[], List)>
	//    5    9:return          
	}

	public ScatterData(String as[], List list)
	{
		super(as, list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #32  <Method void BarLineScatterCandleBubbleData(String[], List)>
	//    4    6:return          
	}

	private static List toList(IScatterDataSet iscatterdataset)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #35  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void ArrayList()>
	//    3    7:astore_1        
		((List) (arraylist)).add(((Object) (iscatterdataset)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokeinterface #42  <Method boolean List.add(Object)>
	//    7   15:pop             
		return ((List) (arraylist));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public float getGreatestShapeSize()
	{
		float f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_1        
		Iterator iterator = mDataSets.iterator();
	//    2    2:aload_0         
	//    3    3:getfield        #49  <Field List mDataSets>
	//    4    6:invokeinterface #53  <Method Iterator List.iterator()>
	//    5   11:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    6   12:aload_3         
	//    7   13:invokeinterface #59  <Method boolean Iterator.hasNext()>
	//    8   18:ifeq            47
			float f1 = ((IScatterDataSet)iterator.next()).getScatterShapeSize();
	//    9   21:aload_3         
	//   10   22:invokeinterface #63  <Method Object Iterator.next()>
	//   11   27:checkcast       #65  <Class IScatterDataSet>
	//   12   30:invokeinterface #68  <Method float IScatterDataSet.getScatterShapeSize()>
	//   13   35:fstore_2        
			if(f1 > f)
	//*  14   36:fload_2         
	//*  15   37:fload_1         
	//*  16   38:fcmpl           
	//*  17   39:ifle            12
				f = f1;
	//   18   42:fload_2         
	//   19   43:fstore_1        
		} while(true);
	//   20   44:goto            12
		return f;
	//   21   47:fload_1         
	//   22   48:freturn         
	}
}
