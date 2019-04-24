// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data.realm.implementation;

import com.github.mikephil.charting.data.realm.base.RealmLineRadarDataSet;
import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;
import io.realm.RealmResults;

public class RealmRadarDataSet extends RealmLineRadarDataSet
	implements IRadarDataSet
{

	public RealmRadarDataSet(RealmResults realmresults, String s)
	{
		super(realmresults, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void RealmLineRadarDataSet(RealmResults, String)>
		build(results);
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:getfield        #15  <Field RealmResults results>
	//    7   11:invokevirtual   #19  <Method void build(RealmResults)>
		calcMinMax(0, results.size());
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:aload_0         
	//   11   17:getfield        #15  <Field RealmResults results>
	//   12   20:invokevirtual   #25  <Method int RealmResults.size()>
	//   13   23:invokevirtual   #29  <Method void calcMinMax(int, int)>
	//   14   26:return          
	}

	public RealmRadarDataSet(RealmResults realmresults, String s, String s1)
	{
		super(realmresults, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #35  <Method void RealmLineRadarDataSet(RealmResults, String, String)>
		build(results);
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #15  <Field RealmResults results>
	//    8   12:invokevirtual   #19  <Method void build(RealmResults)>
		calcMinMax(0, results.size());
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:aload_0         
	//   12   18:getfield        #15  <Field RealmResults results>
	//   13   21:invokevirtual   #25  <Method int RealmResults.size()>
	//   14   24:invokevirtual   #29  <Method void calcMinMax(int, int)>
	//   15   27:return          
	}

	public void build(RealmResults realmresults)
	{
		super.build(realmresults);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #37  <Method void RealmLineRadarDataSet.build(RealmResults)>
	//    3    5:return          
	}
}
