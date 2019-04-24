// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data.realm.implementation;

import com.github.mikephil.charting.data.ScatterData;
import com.github.mikephil.charting.data.realm.base.RealmUtils;
import io.realm.RealmResults;
import java.util.List;

public class RealmScatterData extends ScatterData
{

	public RealmScatterData(RealmResults realmresults, String s, List list)
	{
		super(RealmUtils.toXVals(realmresults, s), list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #12  <Method List RealmUtils.toXVals(RealmResults, String)>
	//    4    6:aload_3         
	//    5    7:invokespecial   #15  <Method void ScatterData(List, List)>
	//    6   10:return          
	}
}
