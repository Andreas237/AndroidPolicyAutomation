// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.config;

import com.raizlabs.android.dbflow.runtime.BaseTransactionManager;
import com.raizlabs.android.dbflow.structure.database.DatabaseHelperListener;
import com.raizlabs.android.dbflow.structure.database.OpenHelper;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.raizlabs.android.dbflow.config:
//			TableConfig, DatabaseDefinition

public final class DatabaseConfig
{
	public static final class Builder
	{

		public Builder addTableConfig(TableConfig tableconfig)
		{
			tableConfigMap.put(((Object) (tableconfig.tableClass())), ((Object) (tableconfig)));
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field Map tableConfigMap>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #42  <Method Class TableConfig.tableClass()>
		//    4    8:aload_1         
		//    5    9:invokeinterface #48  <Method Object Map.put(Object, Object)>
		//    6   14:pop             
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public DatabaseConfig build()
		{
			return new DatabaseConfig(this);
		//    0    0:new             #6   <Class DatabaseConfig>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #54  <Method void DatabaseConfig(DatabaseConfig$Builder)>
		//    4    8:areturn         
		}

		public Builder helperListener(DatabaseHelperListener databasehelperlistener)
		{
			helperListener = databasehelperlistener;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #57  <Field DatabaseHelperListener helperListener>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder openHelper(OpenHelperCreator openhelpercreator)
		{
			openHelperCreator = openhelpercreator;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #61  <Field DatabaseConfig$OpenHelperCreator openHelperCreator>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder transactionManagerCreator(TransactionManagerCreator transactionmanagercreator)
		{
			transactionManagerCreator = transactionmanagercreator;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #64  <Field DatabaseConfig$TransactionManagerCreator transactionManagerCreator>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		final Class databaseClass;
		DatabaseHelperListener helperListener;
		OpenHelperCreator openHelperCreator;
		final Map tableConfigMap = new HashMap();
		TransactionManagerCreator transactionManagerCreator;

		public Builder(Class class1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #26  <Class HashMap>
		//    4    8:dup             
		//    5    9:invokespecial   #27  <Method void HashMap()>
		//    6   12:putfield        #29  <Field Map tableConfigMap>
			databaseClass = class1;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #31  <Field Class databaseClass>
		//   10   20:return          
		}
	}

	public static interface OpenHelperCreator
	{

		public abstract OpenHelper createHelper(DatabaseDefinition databasedefinition, DatabaseHelperListener databasehelperlistener);
	}

	public static interface TransactionManagerCreator
	{

		public abstract BaseTransactionManager createManager(DatabaseDefinition databasedefinition);
	}


	DatabaseConfig(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		openHelperCreator = builder.openHelperCreator;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #32  <Field DatabaseConfig$OpenHelperCreator DatabaseConfig$Builder.openHelperCreator>
	//    5    9:putfield        #33  <Field DatabaseConfig$OpenHelperCreator openHelperCreator>
		databaseClass = builder.databaseClass;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #35  <Field Class DatabaseConfig$Builder.databaseClass>
	//    9   17:putfield        #36  <Field Class databaseClass>
		transactionManagerCreator = builder.transactionManagerCreator;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #38  <Field DatabaseConfig$TransactionManagerCreator DatabaseConfig$Builder.transactionManagerCreator>
	//   13   25:putfield        #39  <Field DatabaseConfig$TransactionManagerCreator transactionManagerCreator>
		helperListener = builder.helperListener;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #41  <Field DatabaseHelperListener DatabaseConfig$Builder.helperListener>
	//   17   33:putfield        #42  <Field DatabaseHelperListener helperListener>
		tableConfigMap = builder.tableConfigMap;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:getfield        #44  <Field Map DatabaseConfig$Builder.tableConfigMap>
	//   21   41:putfield        #45  <Field Map tableConfigMap>
	//   22   44:return          
	}

	public Class databaseClass()
	{
		return databaseClass;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Class databaseClass>
	//    2    4:areturn         
	}

	public TableConfig getTableConfigForTable(Class class1)
	{
		return (TableConfig)tableConfigMap().get(((Object) (class1)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #54  <Method Map tableConfigMap()>
	//    2    4:aload_1         
	//    3    5:invokeinterface #60  <Method Object Map.get(Object)>
	//    4   10:checkcast       #62  <Class TableConfig>
	//    5   13:areturn         
	}

	public OpenHelperCreator helperCreator()
	{
		return openHelperCreator;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field DatabaseConfig$OpenHelperCreator openHelperCreator>
	//    2    4:areturn         
	}

	public DatabaseHelperListener helperListener()
	{
		return helperListener;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field DatabaseHelperListener helperListener>
	//    2    4:areturn         
	}

	public Map tableConfigMap()
	{
		return tableConfigMap;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Map tableConfigMap>
	//    2    4:areturn         
	}

	public TransactionManagerCreator transactionManagerCreator()
	{
		return transactionManagerCreator;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field DatabaseConfig$TransactionManagerCreator transactionManagerCreator>
	//    2    4:areturn         
	}

	private final Class databaseClass;
	private final DatabaseHelperListener helperListener;
	private final OpenHelperCreator openHelperCreator;
	private final Map tableConfigMap;
	private final TransactionManagerCreator transactionManagerCreator;
}
