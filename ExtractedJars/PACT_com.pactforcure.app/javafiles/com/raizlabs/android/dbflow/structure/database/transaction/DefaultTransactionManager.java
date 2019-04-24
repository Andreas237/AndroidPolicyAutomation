// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database.transaction;

import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.runtime.BaseTransactionManager;

// Referenced classes of package com.raizlabs.android.dbflow.structure.database.transaction:
//			DefaultTransactionQueue, ITransactionQueue

public class DefaultTransactionManager extends BaseTransactionManager
{

	public DefaultTransactionManager(DatabaseDefinition databasedefinition)
	{
		super(((ITransactionQueue) (new DefaultTransactionQueue("DBFlow Transaction Queue"))), databasedefinition);
	//    0    0:aload_0         
	//    1    1:new             #8   <Class DefaultTransactionQueue>
	//    2    4:dup             
	//    3    5:ldc1            #10  <String "DBFlow Transaction Queue">
	//    4    7:invokespecial   #13  <Method void DefaultTransactionQueue(String)>
	//    5   10:aload_1         
	//    6   11:invokespecial   #16  <Method void BaseTransactionManager(ITransactionQueue, DatabaseDefinition)>
	//    7   14:return          
	}

	public DefaultTransactionManager(ITransactionQueue itransactionqueue, DatabaseDefinition databasedefinition)
	{
		super(itransactionqueue, databasedefinition);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #16  <Method void BaseTransactionManager(ITransactionQueue, DatabaseDefinition)>
	//    4    6:return          
	}
}
