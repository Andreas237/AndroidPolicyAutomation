// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.FlowManager;

// Referenced classes of package com.raizlabs.android.dbflow.structure.database:
//			OpenHelper, DatabaseHelperDelegate, AndroidDatabase, DatabaseHelperListener, 
//			DatabaseWrapper, BaseDatabaseHelper

public class FlowSQLiteOpenHelper extends SQLiteOpenHelper
	implements OpenHelper
{
	private class BackupHelper extends SQLiteOpenHelper
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

		public BackupHelper(Context context, String s, int i, DatabaseDefinition databasedefinition)
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


	public FlowSQLiteOpenHelper(DatabaseDefinition databasedefinition, DatabaseHelperListener databasehelperlistener)
	{
		Context context = FlowManager.getContext();
	//    0    0:invokestatic    #21  <Method Context FlowManager.getContext()>
	//    1    3:astore          4
		Object obj;
		if(databasedefinition.isInMemory())
	//*   2    5:aload_1         
	//*   3    6:invokevirtual   #27  <Method boolean DatabaseDefinition.isInMemory()>
	//*   4    9:ifeq            71
			obj = null;
	//    5   12:aconst_null     
	//    6   13:astore_3        
		else
	//*   7   14:aload_0         
	//*   8   15:aload           4
	//*   9   17:aload_3         
	//*  10   18:aconst_null     
	//*  11   19:aload_1         
	//*  12   20:invokevirtual   #31  <Method int DatabaseDefinition.getDatabaseVersion()>
	//*  13   23:invokespecial   #34  <Method void SQLiteOpenHelper(Context, String, android.database.sqlite.SQLiteDatabase$CursorFactory, int)>
	//*  14   26:aconst_null     
	//*  15   27:astore_3        
	//*  16   28:aload_1         
	//*  17   29:invokevirtual   #37  <Method boolean DatabaseDefinition.backupEnabled()>
	//*  18   32:ifeq            56
	//*  19   35:new             #8   <Class FlowSQLiteOpenHelper$BackupHelper>
	//*  20   38:dup             
	//*  21   39:aload_0         
	//*  22   40:invokestatic    #21  <Method Context FlowManager.getContext()>
	//*  23   43:aload_1         
	//*  24   44:invokestatic    #43  <Method String DatabaseHelperDelegate.getTempDbFileName(DatabaseDefinition)>
	//*  25   47:aload_1         
	//*  26   48:invokevirtual   #31  <Method int DatabaseDefinition.getDatabaseVersion()>
	//*  27   51:aload_1         
	//*  28   52:invokespecial   #46  <Method void FlowSQLiteOpenHelper$BackupHelper(FlowSQLiteOpenHelper, Context, String, int, DatabaseDefinition)>
	//*  29   55:astore_3        
	//*  30   56:aload_0         
	//*  31   57:new             #39  <Class DatabaseHelperDelegate>
	//*  32   60:dup             
	//*  33   61:aload_2         
	//*  34   62:aload_1         
	//*  35   63:aload_3         
	//*  36   64:invokespecial   #49  <Method void DatabaseHelperDelegate(DatabaseHelperListener, DatabaseDefinition, OpenHelper)>
	//*  37   67:putfield        #51  <Field DatabaseHelperDelegate databaseHelperDelegate>
	//*  38   70:return          
			obj = ((Object) (databasedefinition.getDatabaseFileName()));
	//   39   71:aload_1         
	//   40   72:invokevirtual   #55  <Method String DatabaseDefinition.getDatabaseFileName()>
	//   41   75:astore_3        
		super(context, ((String) (obj)), ((android.database.sqlite.SQLiteDatabase.CursorFactory) (null)), databasedefinition.getDatabaseVersion());
		obj = null;
		if(databasedefinition.backupEnabled())
			obj = ((Object) (new BackupHelper(FlowManager.getContext(), DatabaseHelperDelegate.getTempDbFileName(databasedefinition), databasedefinition.getDatabaseVersion(), databasedefinition)));
		databaseHelperDelegate = new DatabaseHelperDelegate(databasehelperlistener, databasedefinition, ((OpenHelper) (obj)));
	//*  42   76:goto            14
	}

	public void backupDB()
	{
		databaseHelperDelegate.backupDB();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field DatabaseHelperDelegate databaseHelperDelegate>
	//    2    4:invokevirtual   #60  <Method void DatabaseHelperDelegate.backupDB()>
	//    3    7:return          
	}

	public void closeDB()
	{
		getDatabase();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method DatabaseWrapper getDatabase()>
	//    2    4:pop             
		androidDatabase.getDatabase().close();
	//    3    5:aload_0         
	//    4    6:getfield        #67  <Field AndroidDatabase androidDatabase>
	//    5    9:invokevirtual   #72  <Method SQLiteDatabase AndroidDatabase.getDatabase()>
	//    6   12:invokevirtual   #77  <Method void SQLiteDatabase.close()>
	//    7   15:return          
	}

	public DatabaseWrapper getDatabase()
	{
		if(androidDatabase == null || !androidDatabase.getDatabase().isOpen())
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field AndroidDatabase androidDatabase>
	//*   2    4:ifnull          20
	//*   3    7:aload_0         
	//*   4    8:getfield        #67  <Field AndroidDatabase androidDatabase>
	//*   5   11:invokevirtual   #72  <Method SQLiteDatabase AndroidDatabase.getDatabase()>
	//*   6   14:invokevirtual   #80  <Method boolean SQLiteDatabase.isOpen()>
	//*   7   17:ifne            31
			androidDatabase = AndroidDatabase.from(getWritableDatabase());
	//    8   20:aload_0         
	//    9   21:aload_0         
	//   10   22:invokevirtual   #83  <Method SQLiteDatabase getWritableDatabase()>
	//   11   25:invokestatic    #87  <Method AndroidDatabase AndroidDatabase.from(SQLiteDatabase)>
	//   12   28:putfield        #67  <Field AndroidDatabase androidDatabase>
		return ((DatabaseWrapper) (androidDatabase));
	//   13   31:aload_0         
	//   14   32:getfield        #67  <Field AndroidDatabase androidDatabase>
	//   15   35:areturn         
	}

	public DatabaseHelperDelegate getDelegate()
	{
		return databaseHelperDelegate;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field DatabaseHelperDelegate databaseHelperDelegate>
	//    2    4:areturn         
	}

	public boolean isDatabaseIntegrityOk()
	{
		return databaseHelperDelegate.isDatabaseIntegrityOk();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field DatabaseHelperDelegate databaseHelperDelegate>
	//    2    4:invokevirtual   #92  <Method boolean DatabaseHelperDelegate.isDatabaseIntegrityOk()>
	//    3    7:ireturn         
	}

	public void onCreate(SQLiteDatabase sqlitedatabase)
	{
		databaseHelperDelegate.onCreate(((DatabaseWrapper) (AndroidDatabase.from(sqlitedatabase))));
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field DatabaseHelperDelegate databaseHelperDelegate>
	//    2    4:aload_1         
	//    3    5:invokestatic    #87  <Method AndroidDatabase AndroidDatabase.from(SQLiteDatabase)>
	//    4    8:invokevirtual   #97  <Method void DatabaseHelperDelegate.onCreate(DatabaseWrapper)>
	//    5   11:return          
	}

	public void onOpen(SQLiteDatabase sqlitedatabase)
	{
		databaseHelperDelegate.onOpen(((DatabaseWrapper) (AndroidDatabase.from(sqlitedatabase))));
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field DatabaseHelperDelegate databaseHelperDelegate>
	//    2    4:aload_1         
	//    3    5:invokestatic    #87  <Method AndroidDatabase AndroidDatabase.from(SQLiteDatabase)>
	//    4    8:invokevirtual   #100 <Method void DatabaseHelperDelegate.onOpen(DatabaseWrapper)>
	//    5   11:return          
	}

	public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
	{
		databaseHelperDelegate.onUpgrade(((DatabaseWrapper) (AndroidDatabase.from(sqlitedatabase))), i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field DatabaseHelperDelegate databaseHelperDelegate>
	//    2    4:aload_1         
	//    3    5:invokestatic    #87  <Method AndroidDatabase AndroidDatabase.from(SQLiteDatabase)>
	//    4    8:iload_2         
	//    5    9:iload_3         
	//    6   10:invokevirtual   #105 <Method void DatabaseHelperDelegate.onUpgrade(DatabaseWrapper, int, int)>
	//    7   13:return          
	}

	public void performRestoreFromBackup()
	{
		databaseHelperDelegate.performRestoreFromBackup();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field DatabaseHelperDelegate databaseHelperDelegate>
	//    2    4:invokevirtual   #108 <Method void DatabaseHelperDelegate.performRestoreFromBackup()>
	//    3    7:return          
	}

	public void setDatabaseListener(DatabaseHelperListener databasehelperlistener)
	{
		databaseHelperDelegate.setDatabaseHelperListener(databasehelperlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field DatabaseHelperDelegate databaseHelperDelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #113 <Method void DatabaseHelperDelegate.setDatabaseHelperListener(DatabaseHelperListener)>
	//    4    8:return          
	}

	private AndroidDatabase androidDatabase;
	private DatabaseHelperDelegate databaseHelperDelegate;
}
