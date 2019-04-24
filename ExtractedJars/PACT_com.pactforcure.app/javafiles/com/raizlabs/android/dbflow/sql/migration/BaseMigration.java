// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.migration;

import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;

// Referenced classes of package com.raizlabs.android.dbflow.sql.migration:
//			Migration

public abstract class BaseMigration
	implements Migration
{

	public BaseMigration()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public abstract void migrate(DatabaseWrapper databasewrapper);

	public void onPostMigrate()
	{
	//    0    0:return          
	}

	public void onPreMigrate()
	{
	//    0    0:return          
	}
}
