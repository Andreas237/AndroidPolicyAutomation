// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database.transaction;

import com.raizlabs.android.dbflow.structure.InternalAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.util.List;

// Referenced classes of package com.raizlabs.android.dbflow.structure.database.transaction:
//			FastStoreModelTransaction

static final class FastStoreModelTransaction$3
	implements ocessModelList
{

	public void processModel(List list, InternalAdapter internaladapter, DatabaseWrapper databasewrapper)
	{
		internaladapter.updateAll(((java.util.Collection) (list)), databasewrapper);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokeinterface #26  <Method void InternalAdapter.updateAll(java.util.Collection, DatabaseWrapper)>
	//    4    8:return          
	}

	FastStoreModelTransaction$3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
