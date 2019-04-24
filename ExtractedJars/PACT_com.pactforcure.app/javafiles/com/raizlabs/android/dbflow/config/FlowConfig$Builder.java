// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.config;

import android.content.Context;
import java.util.*;

// Referenced classes of package com.raizlabs.android.dbflow.config:
//			FlowConfig, DatabaseConfig

public static class FlowConfig$Builder
{

	public FlowConfig$Builder addDatabaseConfig(DatabaseConfig databaseconfig)
	{
		databaseConfigMap.put(((Object) (databaseconfig.databaseClass())), ((Object) (databaseconfig)));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Map databaseConfigMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #49  <Method Class DatabaseConfig.databaseClass()>
	//    4    8:aload_1         
	//    5    9:invokeinterface #55  <Method Object Map.put(Object, Object)>
	//    6   14:pop             
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public FlowConfig$Builder addDatabaseHolder(Class class1)
	{
		databaseHolders.add(((Object) (class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Set databaseHolders>
	//    2    4:aload_1         
	//    3    5:invokeinterface #63  <Method boolean Set.add(Object)>
	//    4   10:pop             
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public FlowConfig build()
	{
		return new FlowConfig(this);
	//    0    0:new             #6   <Class FlowConfig>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #70  <Method void FlowConfig(FlowConfig$Builder)>
	//    4    8:areturn         
	}

	public FlowConfig$Builder openDatabasesOnInit(boolean flag)
	{
		openDatabasesOnInit = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #73  <Field boolean openDatabasesOnInit>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	final Context context;
	final Map databaseConfigMap = new HashMap();
	Set databaseHolders;
	boolean openDatabasesOnInit;

	public FlowConfig$Builder(Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		databaseHolders = ((Set) (new HashSet()));
	//    2    4:aload_0         
	//    3    5:new             #24  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void HashSet()>
	//    6   12:putfield        #27  <Field Set databaseHolders>
	//    7   15:aload_0         
	//    8   16:new             #29  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #30  <Method void HashMap()>
	//   11   23:putfield        #32  <Field Map databaseConfigMap>
		context = context1.getApplicationContext();
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokevirtual   #38  <Method Context Context.getApplicationContext()>
	//   15   31:putfield        #40  <Field Context context>
	//   16   34:return          
	}
}
