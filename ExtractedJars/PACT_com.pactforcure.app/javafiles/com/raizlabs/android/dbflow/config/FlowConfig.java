// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.config;

import android.content.Context;
import java.util.*;

// Referenced classes of package com.raizlabs.android.dbflow.config:
//			DatabaseConfig

public final class FlowConfig
{
	public static class Builder
	{

		public Builder addDatabaseConfig(DatabaseConfig databaseconfig)
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

		public Builder addDatabaseHolder(Class class1)
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

		public Builder openDatabasesOnInit(boolean flag)
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

		public Builder(Context context1)
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


	FlowConfig(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		databaseHolders = Collections.unmodifiableSet(builder.databaseHolders);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #24  <Field Set FlowConfig$Builder.databaseHolders>
	//    5    9:invokestatic    #30  <Method Set Collections.unmodifiableSet(Set)>
	//    6   12:putfield        #31  <Field Set databaseHolders>
		databaseConfigMap = builder.databaseConfigMap;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:getfield        #33  <Field Map FlowConfig$Builder.databaseConfigMap>
	//   10   20:putfield        #34  <Field Map databaseConfigMap>
		context = builder.context;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:getfield        #36  <Field Context FlowConfig$Builder.context>
	//   14   28:putfield        #37  <Field Context context>
		openDatabasesOnInit = builder.openDatabasesOnInit;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:getfield        #39  <Field boolean FlowConfig$Builder.openDatabasesOnInit>
	//   18   36:putfield        #40  <Field boolean openDatabasesOnInit>
	//   19   39:return          
	}

	public Map databaseConfigMap()
	{
		return databaseConfigMap;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Map databaseConfigMap>
	//    2    4:areturn         
	}

	public Set databaseHolders()
	{
		return databaseHolders;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Set databaseHolders>
	//    2    4:areturn         
	}

	public DatabaseConfig getConfigForDatabase(Class class1)
	{
		return (DatabaseConfig)databaseConfigMap().get(((Object) (class1)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #51  <Method Map databaseConfigMap()>
	//    2    4:aload_1         
	//    3    5:invokeinterface #57  <Method Object Map.get(Object)>
	//    4   10:checkcast       #59  <Class DatabaseConfig>
	//    5   13:areturn         
	}

	public Context getContext()
	{
		return context;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Context context>
	//    2    4:areturn         
	}

	public boolean openDatabasesOnInit()
	{
		return openDatabasesOnInit;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field boolean openDatabasesOnInit>
	//    2    4:ireturn         
	}

	private final Context context;
	private final Map databaseConfigMap;
	private final Set databaseHolders;
	private final boolean openDatabasesOnInit;
}
