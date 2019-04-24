// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.config;

import java.util.Map;

// Referenced classes of package com.raizlabs.android.dbflow.config:
//			DatabaseHolder, FlowManager

private static class FlowManager$GlobalDatabaseHolder extends DatabaseHolder
{

	public void add(DatabaseHolder databaseholder)
	{
		databaseDefinitionMap.putAll(databaseholder.databaseDefinitionMap);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Map databaseDefinitionMap>
	//    2    4:aload_1         
	//    3    5:getfield        #21  <Field Map DatabaseHolder.databaseDefinitionMap>
	//    4    8:invokeinterface #27  <Method void Map.putAll(Map)>
		databaseNameMap.putAll(databaseholder.databaseNameMap);
	//    5   13:aload_0         
	//    6   14:getfield        #30  <Field Map databaseNameMap>
	//    7   17:aload_1         
	//    8   18:getfield        #31  <Field Map DatabaseHolder.databaseNameMap>
	//    9   21:invokeinterface #27  <Method void Map.putAll(Map)>
		typeConverters.putAll(databaseholder.typeConverters);
	//   10   26:aload_0         
	//   11   27:getfield        #34  <Field Map typeConverters>
	//   12   30:aload_1         
	//   13   31:getfield        #35  <Field Map DatabaseHolder.typeConverters>
	//   14   34:invokeinterface #27  <Method void Map.putAll(Map)>
		databaseClassLookupMap.putAll(databaseholder.databaseClassLookupMap);
	//   15   39:aload_0         
	//   16   40:getfield        #38  <Field Map databaseClassLookupMap>
	//   17   43:aload_1         
	//   18   44:getfield        #39  <Field Map DatabaseHolder.databaseClassLookupMap>
	//   19   47:invokeinterface #27  <Method void Map.putAll(Map)>
	//   20   52:return          
	}

	private FlowManager$GlobalDatabaseHolder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void DatabaseHolder()>
	//    2    4:return          
	}

	FlowManager$GlobalDatabaseHolder(FlowManager._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void FlowManager$GlobalDatabaseHolder()>
	//    2    4:return          
	}
}
