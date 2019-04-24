// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.config;

import com.raizlabs.android.dbflow.runtime.BaseTransactionManager;

// Referenced classes of package com.raizlabs.android.dbflow.config:
//			DatabaseConfig, DatabaseDefinition

public static interface DatabaseConfig$TransactionManagerCreator
{

	public abstract BaseTransactionManager createManager(DatabaseDefinition databasedefinition);
}
