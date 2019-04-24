// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.config;

import com.raizlabs.android.dbflow.structure.database.DatabaseHelperListener;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.raizlabs.android.dbflow.config:
//			DatabaseConfig, TableConfig

public static final class DatabaseConfig$Builder
{

	public DatabaseConfig$Builder addTableConfig(TableConfig tableconfig)
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

	public DatabaseConfig$Builder helperListener(DatabaseHelperListener databasehelperlistener)
	{
		helperListener = databasehelperlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field DatabaseHelperListener helperListener>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DatabaseConfig$Builder openHelper(erCreator ercreator)
	{
		openHelperCreator = ercreator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #61  <Field DatabaseConfig$OpenHelperCreator openHelperCreator>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public DatabaseConfig$Builder transactionManagerCreator(ionManagerCreator ionmanagercreator)
	{
		transactionManagerCreator = ionmanagercreator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field DatabaseConfig$TransactionManagerCreator transactionManagerCreator>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	final Class databaseClass;
	DatabaseHelperListener helperListener;
	erCreator openHelperCreator;
	final Map tableConfigMap = new HashMap();
	ionManagerCreator transactionManagerCreator;

	public DatabaseConfig$Builder(Class class1)
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
