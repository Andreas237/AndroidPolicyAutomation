// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.data:
//			LineRadarDataSet, Entry, DataSet

public class RadarDataSet extends LineRadarDataSet
	implements IRadarDataSet
{

	public RadarDataSet(List list, String s)
	{
		super(list, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void LineRadarDataSet(List, String)>
	//    4    6:return          
	}

	public DataSet copy()
	{
		Object obj = ((Object) (new ArrayList()));
	//    0    0:new             #18  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void ArrayList()>
	//    3    7:astore_2        
		for(int i = 0; i < mYVals.size(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #25  <Field List mYVals>
	//*   9   15:invokeinterface #31  <Method int List.size()>
	//*  10   20:icmpge          53
			((List) (obj)).add(((Object) (((Entry)mYVals.get(i)).copy())));
	//   11   23:aload_2         
	//   12   24:aload_0         
	//   13   25:getfield        #25  <Field List mYVals>
	//   14   28:iload_1         
	//   15   29:invokeinterface #35  <Method Object List.get(int)>
	//   16   34:checkcast       #37  <Class Entry>
	//   17   37:invokevirtual   #40  <Method Entry Entry.copy()>
	//   18   40:invokeinterface #44  <Method boolean List.add(Object)>
	//   19   45:pop             

	//   20   46:iload_1         
	//   21   47:iconst_1        
	//   22   48:iadd            
	//   23   49:istore_1        
	//*  24   50:goto            10
		obj = ((Object) (new RadarDataSet(((List) (obj)), getLabel())));
	//   25   53:new             #2   <Class RadarDataSet>
	//   26   56:dup             
	//   27   57:aload_2         
	//   28   58:aload_0         
	//   29   59:invokevirtual   #48  <Method String getLabel()>
	//   30   62:invokespecial   #49  <Method void RadarDataSet(List, String)>
	//   31   65:astore_2        
		obj.mColors = mColors;
	//   32   66:aload_2         
	//   33   67:aload_0         
	//   34   68:getfield        #52  <Field List mColors>
	//   35   71:putfield        #52  <Field List mColors>
		obj.mHighLightColor = mHighLightColor;
	//   36   74:aload_2         
	//   37   75:aload_0         
	//   38   76:getfield        #56  <Field int mHighLightColor>
	//   39   79:putfield        #56  <Field int mHighLightColor>
		return ((DataSet) (obj));
	//   40   82:aload_2         
	//   41   83:areturn         
	}
}
