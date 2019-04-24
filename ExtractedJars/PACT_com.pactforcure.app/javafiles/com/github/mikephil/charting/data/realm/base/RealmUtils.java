// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data.realm.base;

import io.realm.*;
import java.util.*;

public final class RealmUtils
{

	public RealmUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static List toXVals(RealmResults realmresults, String s)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #13  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void ArrayList()>
	//    3    7:astore_2        
		for(realmresults = ((RealmResults) (realmresults.iterator())); ((Iterator) (realmresults)).hasNext(); ((List) (arraylist)).add(((Object) ((new DynamicRealmObject((RealmObject)((Iterator) (realmresults)).next())).getString(s)))));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #20  <Method Iterator RealmResults.iterator()>
	//    6   12:astore_0        
	//    7   13:aload_0         
	//    8   14:invokeinterface #26  <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            52
	//   10   22:aload_2         
	//   11   23:new             #28  <Class DynamicRealmObject>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:invokeinterface #32  <Method Object Iterator.next()>
	//   15   33:checkcast       #34  <Class RealmObject>
	//   16   36:invokespecial   #37  <Method void DynamicRealmObject(RealmObject)>
	//   17   39:aload_1         
	//   18   40:invokevirtual   #41  <Method String DynamicRealmObject.getString(String)>
	//   19   43:invokeinterface #47  <Method boolean List.add(Object)>
	//   20   48:pop             
	//*  21   49:goto            13
		return ((List) (arraylist));
	//   22   52:aload_2         
	//   23   53:areturn         
	}
}
