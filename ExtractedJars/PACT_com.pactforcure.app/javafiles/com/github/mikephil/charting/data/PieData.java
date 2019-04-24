// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.data:
//			ChartData, Entry

public class PieData extends ChartData
{

	public PieData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void ChartData()>
	//    2    4:return          
	}

	public PieData(List list)
	{
		super(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void ChartData(List)>
	//    3    5:return          
	}

	public PieData(List list, IPieDataSet ipiedataset)
	{
		super(list, toList(ipiedataset));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #20  <Method List toList(IPieDataSet)>
	//    4    6:invokespecial   #23  <Method void ChartData(List, List)>
	//    5    9:return          
	}

	public PieData(String as[])
	{
		super(as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void ChartData(String[])>
	//    3    5:return          
	}

	public PieData(String as[], IPieDataSet ipiedataset)
	{
		super(as, toList(ipiedataset));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #20  <Method List toList(IPieDataSet)>
	//    4    6:invokespecial   #31  <Method void ChartData(String[], List)>
	//    5    9:return          
	}

	private static List toList(IPieDataSet ipiedataset)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #33  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void ArrayList()>
	//    3    7:astore_1        
		((List) (arraylist)).add(((Object) (ipiedataset)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokeinterface #40  <Method boolean List.add(Object)>
	//    7   15:pop             
		return ((List) (arraylist));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public IPieDataSet getDataSet()
	{
		return (IPieDataSet)mDataSets.get(0);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field List mDataSets>
	//    2    4:iconst_0        
	//    3    5:invokeinterface #51  <Method Object List.get(int)>
	//    4   10:checkcast       #53  <Class IPieDataSet>
	//    5   13:areturn         
	}

	public volatile IDataSet getDataSetByIndex(int i)
	{
		return ((IDataSet) (getDataSetByIndex(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #58  <Method IPieDataSet getDataSetByIndex(int)>
	//    3    5:areturn         
	}

	public IPieDataSet getDataSetByIndex(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            9
			return getDataSet();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #60  <Method IPieDataSet getDataSet()>
	//    4    8:areturn         
		else
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
	}

	public volatile IDataSet getDataSetByLabel(String s, boolean flag)
	{
		return ((IDataSet) (getDataSetByLabel(s, flag)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #65  <Method IPieDataSet getDataSetByLabel(String, boolean)>
	//    4    6:areturn         
	}

	public IPieDataSet getDataSetByLabel(String s, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            45
			if(s.equalsIgnoreCase(((IPieDataSet)mDataSets.get(0)).getLabel()))
	//*   2    4:aload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #47  <Field List mDataSets>
	//*   5    9:iconst_0        
	//*   6   10:invokeinterface #51  <Method Object List.get(int)>
	//*   7   15:checkcast       #53  <Class IPieDataSet>
	//*   8   18:invokeinterface #69  <Method String IPieDataSet.getLabel()>
	//*   9   23:invokevirtual   #75  <Method boolean String.equalsIgnoreCase(String)>
	//*  10   26:ifeq            43
				return (IPieDataSet)mDataSets.get(0);
	//   11   29:aload_0         
	//   12   30:getfield        #47  <Field List mDataSets>
	//   13   33:iconst_0        
	//   14   34:invokeinterface #51  <Method Object List.get(int)>
	//   15   39:checkcast       #53  <Class IPieDataSet>
	//   16   42:areturn         
			else
				return null;
	//   17   43:aconst_null     
	//   18   44:areturn         
		if(s.equals(((Object) (((IPieDataSet)mDataSets.get(0)).getLabel()))))
	//*  19   45:aload_1         
	//*  20   46:aload_0         
	//*  21   47:getfield        #47  <Field List mDataSets>
	//*  22   50:iconst_0        
	//*  23   51:invokeinterface #51  <Method Object List.get(int)>
	//*  24   56:checkcast       #53  <Class IPieDataSet>
	//*  25   59:invokeinterface #69  <Method String IPieDataSet.getLabel()>
	//*  26   64:invokevirtual   #78  <Method boolean String.equals(Object)>
	//*  27   67:ifeq            84
			return (IPieDataSet)mDataSets.get(0);
	//   28   70:aload_0         
	//   29   71:getfield        #47  <Field List mDataSets>
	//   30   74:iconst_0        
	//   31   75:invokeinterface #51  <Method Object List.get(int)>
	//   32   80:checkcast       #53  <Class IPieDataSet>
	//   33   83:areturn         
		else
			return null;
	//   34   84:aconst_null     
	//   35   85:areturn         
	}

	public float getYValueSum()
	{
		float f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_1        
		for(int i = 0; i < getDataSet().getEntryCount(); i++)
	//*   2    2:iconst_0        
	//*   3    3:istore_2        
	//*   4    4:iload_2         
	//*   5    5:aload_0         
	//*   6    6:invokevirtual   #60  <Method IPieDataSet getDataSet()>
	//*   7    9:invokeinterface #84  <Method int IPieDataSet.getEntryCount()>
	//*   8   14:icmpge          40
			f += getDataSet().getEntryForIndex(i).getVal();
	//    9   17:fload_1         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #60  <Method IPieDataSet getDataSet()>
	//   12   22:iload_2         
	//   13   23:invokeinterface #88  <Method Entry IPieDataSet.getEntryForIndex(int)>
	//   14   28:invokevirtual   #93  <Method float Entry.getVal()>
	//   15   31:fadd            
	//   16   32:fstore_1        

	//   17   33:iload_2         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:istore_2        
	//*  21   37:goto            4
		return f;
	//   22   40:fload_1         
	//   23   41:freturn         
	}

	public void setDataSet(IPieDataSet ipiedataset)
	{
		mDataSets.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field List mDataSets>
	//    2    4:invokeinterface #98  <Method void List.clear()>
		mDataSets.add(((Object) (ipiedataset)));
	//    3    9:aload_0         
	//    4   10:getfield        #47  <Field List mDataSets>
	//    5   13:aload_1         
	//    6   14:invokeinterface #40  <Method boolean List.add(Object)>
	//    7   19:pop             
		init();
	//    8   20:aload_0         
	//    9   21:invokevirtual   #101 <Method void init()>
	//   10   24:return          
	}
}
