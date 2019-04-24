// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.data:
//			BarLineScatterCandleBubbleData

public class BarData extends BarLineScatterCandleBubbleData
{

	public BarData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void BarLineScatterCandleBubbleData()>
		mGroupSpace = 0.8F;
	//    2    4:aload_0         
	//    3    5:ldc1            #12  <Float 0.8F>
	//    4    7:putfield        #14  <Field float mGroupSpace>
	//    5   10:return          
	}

	public BarData(List list)
	{
		super(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void BarLineScatterCandleBubbleData(List)>
		mGroupSpace = 0.8F;
	//    3    5:aload_0         
	//    4    6:ldc1            #12  <Float 0.8F>
	//    5    8:putfield        #14  <Field float mGroupSpace>
	//    6   11:return          
	}

	public BarData(List list, IBarDataSet ibardataset)
	{
		super(list, toList(ibardataset));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #25  <Method List toList(IBarDataSet)>
	//    4    6:invokespecial   #28  <Method void BarLineScatterCandleBubbleData(List, List)>
		mGroupSpace = 0.8F;
	//    5    9:aload_0         
	//    6   10:ldc1            #12  <Float 0.8F>
	//    7   12:putfield        #14  <Field float mGroupSpace>
	//    8   15:return          
	}

	public BarData(List list, List list1)
	{
		super(list, list1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #28  <Method void BarLineScatterCandleBubbleData(List, List)>
		mGroupSpace = 0.8F;
	//    4    6:aload_0         
	//    5    7:ldc1            #12  <Float 0.8F>
	//    6    9:putfield        #14  <Field float mGroupSpace>
	//    7   12:return          
	}

	public BarData(String as[])
	{
		super(as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #33  <Method void BarLineScatterCandleBubbleData(String[])>
		mGroupSpace = 0.8F;
	//    3    5:aload_0         
	//    4    6:ldc1            #12  <Float 0.8F>
	//    5    8:putfield        #14  <Field float mGroupSpace>
	//    6   11:return          
	}

	public BarData(String as[], IBarDataSet ibardataset)
	{
		super(as, toList(ibardataset));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #25  <Method List toList(IBarDataSet)>
	//    4    6:invokespecial   #37  <Method void BarLineScatterCandleBubbleData(String[], List)>
		mGroupSpace = 0.8F;
	//    5    9:aload_0         
	//    6   10:ldc1            #12  <Float 0.8F>
	//    7   12:putfield        #14  <Field float mGroupSpace>
	//    8   15:return          
	}

	public BarData(String as[], List list)
	{
		super(as, list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #37  <Method void BarLineScatterCandleBubbleData(String[], List)>
		mGroupSpace = 0.8F;
	//    4    6:aload_0         
	//    5    7:ldc1            #12  <Float 0.8F>
	//    6    9:putfield        #14  <Field float mGroupSpace>
	//    7   12:return          
	}

	private static List toList(IBarDataSet ibardataset)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #40  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void ArrayList()>
	//    3    7:astore_1        
		((List) (arraylist)).add(((Object) (ibardataset)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokeinterface #47  <Method boolean List.add(Object)>
	//    7   15:pop             
		return ((List) (arraylist));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public float getGroupSpace()
	{
		if(mDataSets.size() <= 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field List mDataSets>
	//*   2    4:invokeinterface #58  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:icmpgt          15
			return 0.0F;
	//    5   13:fconst_0        
	//    6   14:freturn         
		else
			return mGroupSpace;
	//    7   15:aload_0         
	//    8   16:getfield        #14  <Field float mGroupSpace>
	//    9   19:freturn         
	}

	public boolean isGrouped()
	{
		return mDataSets.size() > 1;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field List mDataSets>
	//    2    4:invokeinterface #58  <Method int List.size()>
	//    3    9:iconst_1        
	//    4   10:icmple          15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public void setGroupSpace(float f)
	{
		mGroupSpace = f / 100F;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:ldc1            #63  <Float 100F>
	//    3    4:fdiv            
	//    4    5:putfield        #14  <Field float mGroupSpace>
	//    5    8:return          
	}

	private float mGroupSpace;
}
