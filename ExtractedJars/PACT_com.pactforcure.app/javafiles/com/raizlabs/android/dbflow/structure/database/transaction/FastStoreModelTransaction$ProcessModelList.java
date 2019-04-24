// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database.transaction;

import com.raizlabs.android.dbflow.structure.InternalAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.util.List;

// Referenced classes of package com.raizlabs.android.dbflow.structure.database.transaction:
//			FastStoreModelTransaction

static interface FastStoreModelTransaction$ProcessModelList
{

	public abstract void processModel(List list, InternalAdapter internaladapter, DatabaseWrapper databasewrapper);
}
