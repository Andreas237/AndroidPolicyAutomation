// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;

// Referenced classes of package com.raizlabs.android.dbflow.structure.database:
//			OpenHelper, FlowSQLiteOpenHelper, BaseDatabaseHelper, AndroidDatabase, 
//			DatabaseWrapper, DatabaseHelperDelegate, DatabaseHelperListener

private class FlowSQLiteOpenHelper$BackupHelper extends SQLiteOpenHelper
	implements OpenHelper
{

	public void backupDB()
	{
	//    0    0:return          
	}

	public void closeDB()
	{
	//    0    0:return          
	}

	public DatabaseWrapper getDatabase()
	{
		if(androidDatabase == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field AndroidDatabase androidDatabase>
	//*   2    4:ifnonnull       18
			androidDatabase = AndroidDatabase.from(getWritableDatabase());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #41  <Method SQLiteDatabase getWritableDatabase()>
	//    6   12:invokestatic    #47  <Method AndroidDatabase AndroidDatabase.from(SQLiteDatabase)>
	//    7   15:putfield        #37  <Field AndroidDatabase androidDatabase>
		return ((DatabaseWrapper) (androidDatabase));
	//    8   18:aload_0         
	//    9   19:getfield        #37  <Field AndroidDatabase androidDatabase>
	//   10   22:areturn         
	}

	public DatabaseHelperDelegate getDelegate()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean isDatabaseIntegrityOk()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onCreate(SQLiteDatabase sqlitedatabase)
	{
		baseDatabaseHelper.onCreate(((DatabaseWrapper) (AndroidDatabase.from(sqlitedatabase))));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field BaseDatabaseHelper baseDatabaseHelper>
	//    2    4:aload_1         
	//    3    5:invokestatic    #47  <Method AndroidDatabase AndroidDatabase.from(SQLiteDatabase)>
	//    4    8:invokevirtual   #56  <Method void BaseDatabaseHelper.onCreate(DatabaseWrapper)>
	//    5   11:return          
	}

	public void onOpen(SQLiteDatabase sqlitedatabase)
	{
		baseDatabaseHelper.onOpen(((DatabaseWrapper) (AndroidDatabase.from(sqlitedatabase))));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field BaseDatabaseHelper baseDatabaseHelper>
	//    2    4:aload_1         
	//    3    5:invokestatic    #47  <Method AndroidDatabase AndroidDatabase.from(SQLiteDatabase)>
	//    4    8:invokevirtual   #59  <Method void BaseDatabaseHelper.onOpen(DatabaseWrapper)>
	//    5   11:return          
	}

	public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
	{
		baseDatabaseHelper.onUpgrade(((DatabaseWrapper) (AndroidDatabase.from(sqlitedatabase))), i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field BaseDatabaseHelper baseDatabaseHelper>
	//    2    4:aload_1         
	//    3    5:invokestatic    #47  <Method AndroidDatabase AndroidDatabase.from(SQLiteDatabase)>
	//    4    8:iload_2         
	//    5    9:iload_3         
	//    6   10:invokevirtual   #64  <Method void BaseDatabaseHelper.onUpgrade(DatabaseWrapper, int, int)>
	//    7   13:return          
	}

	public void performRestoreFromBackup()
	{
	//    0    0:return          
	}

	public void setDatabaseListener(DatabaseHelperListener databasehelperlistener)
	{
	//    0    0:return          
	}

	private AndroidDatabase androidDatabase;
	private final BaseDatabaseHelper baseDatabaseHelper;
	final FlowSQLiteOpenHelper this$0;

	public FlowSQLiteOpenHelper$BackupHelper(Context context, String s, int i, DatabaseDefinition databasedefinition)
	{
		this$0 = FlowSQLiteOpenHelper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field FlowSQLiteOpenHelper this$0>
		super(context, s, ((android.database.sqlite.SQLiteDatabase.CursorFactory) (null)), i);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aconst_null     
	//    7    9:iload           4
	//    8   11:invokespecial   #22  <Method void SQLiteOpenHelper(Context, String, android.database.sqlite.SQLiteDatabase$CursorFactory, int)>
		baseDatabaseHelper = new BaseDatabaseHelper(databasedefinition);
	//    9   14:aload_0         
	//   10   15:new             #24  <Class BaseDatabaseHelper>
	//   11   18:dup             
	//   12   19:aload           5
	//   13   21:invokespecial   #27  <Method void BaseDatabaseHelper(DatabaseDefinition)>
	//   14   24:putfield        #29  <Field BaseDatabaseHelper baseDatabaseHelper>
	//   15   27:return          
	}
}
