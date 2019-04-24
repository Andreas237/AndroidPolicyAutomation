// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database;


// Referenced classes of package com.raizlabs.android.dbflow.structure.database:
//			DatabaseWrapper, DatabaseHelperDelegate, DatabaseHelperListener

public interface OpenHelper
{

	public abstract void backupDB();

	public abstract void closeDB();

	public abstract DatabaseWrapper getDatabase();

	public abstract DatabaseHelperDelegate getDelegate();

	public abstract boolean isDatabaseIntegrityOk();

	public abstract void performRestoreFromBackup();

	public abstract void setDatabaseListener(DatabaseHelperListener databasehelperlistener);
}
