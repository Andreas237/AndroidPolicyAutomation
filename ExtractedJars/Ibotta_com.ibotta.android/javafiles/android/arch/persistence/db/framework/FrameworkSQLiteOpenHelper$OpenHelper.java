// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.db.framework;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

// Referenced classes of package android.arch.persistence.db.framework:
//			FrameworkSQLiteOpenHelper, FrameworkSQLiteDatabase

static class FrameworkSQLiteOpenHelper$OpenHelper extends SQLiteOpenHelper
{

	public void close()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		super.close();
	//    2    2:aload_0         
	//    3    3:invokespecial   #38  <Method void SQLiteOpenHelper.close()>
		mDbRef[0] = null;
	//    4    6:aload_0         
	//    5    7:getfield        #33  <Field FrameworkSQLiteDatabase[] mDbRef>
	//    6   10:iconst_0        
	//    7   11:aconst_null     
	//    8   12:aastore         
		this;
	//    9   13:aload_0         
		JVM INSTR monitorexit ;
	//   10   14:monitorexit     
		return;
	//   11   15:return          
		Exception exception;
		exception;
	//   12   16:astore_1        
	//*  13   17:aload_0         
		throw exception;
	//   14   18:monitorexit     
	//   15   19:aload_1         
	//   16   20:athrow          
	}

	SupportSQLiteDatabase getReadableSupportDatabase()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj;
		mMigrated = false;
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:putfield        #42  <Field boolean mMigrated>
		obj = ((Object) (super.getReadableDatabase()));
	//    5    7:aload_0         
	//    6    8:invokespecial   #46  <Method SQLiteDatabase SQLiteOpenHelper.getReadableDatabase()>
	//    7   11:astore_1        
		if(!mMigrated)
			break MISSING_BLOCK_LABEL_32;
	//    8   12:aload_0         
	//    9   13:getfield        #42  <Field boolean mMigrated>
	//   10   16:ifeq            32
		close();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #47  <Method void close()>
		obj = ((Object) (getReadableSupportDatabase()));
	//   13   23:aload_0         
	//   14   24:invokevirtual   #49  <Method SupportSQLiteDatabase getReadableSupportDatabase()>
	//   15   27:astore_1        
		this;
	//   16   28:aload_0         
		JVM INSTR monitorexit ;
	//   17   29:monitorexit     
		return ((SupportSQLiteDatabase) (obj));
	//   18   30:aload_1         
	//   19   31:areturn         
		obj = ((Object) (getWrappedDb(((SQLiteDatabase) (obj)))));
	//   20   32:aload_0         
	//   21   33:aload_1         
	//   22   34:invokevirtual   #53  <Method FrameworkSQLiteDatabase getWrappedDb(SQLiteDatabase)>
	//   23   37:astore_1        
		this;
	//   24   38:aload_0         
		JVM INSTR monitorexit ;
	//   25   39:monitorexit     
		return ((SupportSQLiteDatabase) (obj));
	//   26   40:aload_1         
	//   27   41:areturn         
		Exception exception;
		exception;
	//   28   42:astore_1        
	//*  29   43:aload_0         
		throw exception;
	//   30   44:monitorexit     
	//   31   45:aload_1         
	//   32   46:athrow          
	}

	FrameworkSQLiteDatabase getWrappedDb(SQLiteDatabase sqlitedatabase)
	{
		if(mDbRef[0] == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field FrameworkSQLiteDatabase[] mDbRef>
	//*   2    4:iconst_0        
	//*   3    5:aaload          
	//*   4    6:ifnonnull       25
		{
			sqlitedatabase = ((SQLiteDatabase) (new FrameworkSQLiteDatabase(sqlitedatabase)));
	//    5    9:new             #55  <Class FrameworkSQLiteDatabase>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #58  <Method void FrameworkSQLiteDatabase(SQLiteDatabase)>
	//    9   17:astore_1        
			mDbRef[0] = ((FrameworkSQLiteDatabase) (sqlitedatabase));
	//   10   18:aload_0         
	//   11   19:getfield        #33  <Field FrameworkSQLiteDatabase[] mDbRef>
	//   12   22:iconst_0        
	//   13   23:aload_1         
	//   14   24:aastore         
		}
		return mDbRef[0];
	//   15   25:aload_0         
	//   16   26:getfield        #33  <Field FrameworkSQLiteDatabase[] mDbRef>
	//   17   29:iconst_0        
	//   18   30:aaload          
	//   19   31:areturn         
	}

	SupportSQLiteDatabase getWritableSupportDatabase()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj;
		mMigrated = false;
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:putfield        #42  <Field boolean mMigrated>
		obj = ((Object) (super.getWritableDatabase()));
	//    5    7:aload_0         
	//    6    8:invokespecial   #62  <Method SQLiteDatabase SQLiteOpenHelper.getWritableDatabase()>
	//    7   11:astore_1        
		if(!mMigrated)
			break MISSING_BLOCK_LABEL_32;
	//    8   12:aload_0         
	//    9   13:getfield        #42  <Field boolean mMigrated>
	//   10   16:ifeq            32
		close();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #47  <Method void close()>
		obj = ((Object) (getWritableSupportDatabase()));
	//   13   23:aload_0         
	//   14   24:invokevirtual   #64  <Method SupportSQLiteDatabase getWritableSupportDatabase()>
	//   15   27:astore_1        
		this;
	//   16   28:aload_0         
		JVM INSTR monitorexit ;
	//   17   29:monitorexit     
		return ((SupportSQLiteDatabase) (obj));
	//   18   30:aload_1         
	//   19   31:areturn         
		obj = ((Object) (getWrappedDb(((SQLiteDatabase) (obj)))));
	//   20   32:aload_0         
	//   21   33:aload_1         
	//   22   34:invokevirtual   #53  <Method FrameworkSQLiteDatabase getWrappedDb(SQLiteDatabase)>
	//   23   37:astore_1        
		this;
	//   24   38:aload_0         
		JVM INSTR monitorexit ;
	//   25   39:monitorexit     
		return ((SupportSQLiteDatabase) (obj));
	//   26   40:aload_1         
	//   27   41:areturn         
		Exception exception;
		exception;
	//   28   42:astore_1        
	//*  29   43:aload_0         
		throw exception;
	//   30   44:monitorexit     
	//   31   45:aload_1         
	//   32   46:athrow          
	}

	public void onConfigure(SQLiteDatabase sqlitedatabase)
	{
		mCallback.onConfigure(((SupportSQLiteDatabase) (getWrappedDb(sqlitedatabase))));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field android.arch.persistence.db.SupportSQLiteOpenHelper$Callback mCallback>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #53  <Method FrameworkSQLiteDatabase getWrappedDb(SQLiteDatabase)>
	//    5    9:invokevirtual   #68  <Method void android.arch.persistence.db.SupportSQLiteOpenHelper$Callback.onConfigure(SupportSQLiteDatabase)>
	//    6   12:return          
	}

	public void onCreate(SQLiteDatabase sqlitedatabase)
	{
		mCallback.onCreate(((SupportSQLiteDatabase) (getWrappedDb(sqlitedatabase))));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field android.arch.persistence.db.SupportSQLiteOpenHelper$Callback mCallback>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #53  <Method FrameworkSQLiteDatabase getWrappedDb(SQLiteDatabase)>
	//    5    9:invokevirtual   #71  <Method void android.arch.persistence.db.SupportSQLiteOpenHelper$Callback.onCreate(SupportSQLiteDatabase)>
	//    6   12:return          
	}

	public void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
	{
		mMigrated = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #42  <Field boolean mMigrated>
		mCallback.onDowngrade(((SupportSQLiteDatabase) (getWrappedDb(sqlitedatabase))), i, j);
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field android.arch.persistence.db.SupportSQLiteOpenHelper$Callback mCallback>
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #53  <Method FrameworkSQLiteDatabase getWrappedDb(SQLiteDatabase)>
	//    8   14:iload_2         
	//    9   15:iload_3         
	//   10   16:invokevirtual   #76  <Method void android.arch.persistence.db.SupportSQLiteOpenHelper$Callback.onDowngrade(SupportSQLiteDatabase, int, int)>
	//   11   19:return          
	}

	public void onOpen(SQLiteDatabase sqlitedatabase)
	{
		if(!mMigrated)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field boolean mMigrated>
	//*   2    4:ifne            19
			mCallback.onOpen(((SupportSQLiteDatabase) (getWrappedDb(sqlitedatabase))));
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field android.arch.persistence.db.SupportSQLiteOpenHelper$Callback mCallback>
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #53  <Method FrameworkSQLiteDatabase getWrappedDb(SQLiteDatabase)>
	//    8   16:invokevirtual   #79  <Method void android.arch.persistence.db.SupportSQLiteOpenHelper$Callback.onOpen(SupportSQLiteDatabase)>
	//    9   19:return          
	}

	public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
	{
		mMigrated = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #42  <Field boolean mMigrated>
		mCallback.onUpgrade(((SupportSQLiteDatabase) (getWrappedDb(sqlitedatabase))), i, j);
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field android.arch.persistence.db.SupportSQLiteOpenHelper$Callback mCallback>
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #53  <Method FrameworkSQLiteDatabase getWrappedDb(SQLiteDatabase)>
	//    8   14:iload_2         
	//    9   15:iload_3         
	//   10   16:invokevirtual   #82  <Method void android.arch.persistence.db.SupportSQLiteOpenHelper$Callback.onUpgrade(SupportSQLiteDatabase, int, int)>
	//   11   19:return          
	}

	final android.arch.persistence.db.SupportSQLiteOpenHelper.Callback mCallback;
	final FrameworkSQLiteDatabase mDbRef[];
	private boolean mMigrated;

	FrameworkSQLiteOpenHelper$OpenHelper(Context context, String s, final FrameworkSQLiteDatabase dbRef[], final android.arch.persistence.db.SupportSQLiteOpenHelper.Callback callback)
	{
		super(context, s, ((android.database.sqlite.SQLiteDatabase.CursorFactory) (null)), callback.version, new DatabaseErrorHandler() {

			public void onCorruption(SQLiteDatabase sqlitedatabase)
			{
				sqlitedatabase = ((SQLiteDatabase) (dbRef[0]));
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field FrameworkSQLiteDatabase[] val$dbRef>
			//    2    4:iconst_0        
			//    3    5:aaload          
			//    4    6:astore_1        
				if(sqlitedatabase != null)
			//*   5    7:aload_1         
			//*   6    8:ifnull          19
					callback.onCorruption(((SupportSQLiteDatabase) (sqlitedatabase)));
			//    7   11:aload_0         
			//    8   12:getfield        #23  <Field android.arch.persistence.db.SupportSQLiteOpenHelper$Callback val$callback>
			//    9   15:aload_1         
			//   10   16:invokevirtual   #34  <Method void android.arch.persistence.db.SupportSQLiteOpenHelper$Callback.onCorruption(SupportSQLiteDatabase)>
			//   11   19:return          
			}

			final android.arch.persistence.db.SupportSQLiteOpenHelper.Callback val$callback;
			final FrameworkSQLiteDatabase val$dbRef[];

			
			{
				dbRef = aframeworksqlitedatabase;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field FrameworkSQLiteDatabase[] val$dbRef>
				callback = callback1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field android.arch.persistence.db.SupportSQLiteOpenHelper$Callback val$callback>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload           4
	//    5    6:getfield        #23  <Field int android.arch.persistence.db.SupportSQLiteOpenHelper$Callback.version>
	//    6    9:new             #9   <Class FrameworkSQLiteOpenHelper$OpenHelper$1>
	//    7   12:dup             
	//    8   13:aload_3         
	//    9   14:aload           4
	//   10   16:invokespecial   #26  <Method void FrameworkSQLiteOpenHelper$OpenHelper$1(FrameworkSQLiteDatabase[], android.arch.persistence.db.SupportSQLiteOpenHelper$Callback)>
	//   11   19:invokespecial   #29  <Method void SQLiteOpenHelper(Context, String, android.database.sqlite.SQLiteDatabase$CursorFactory, int, DatabaseErrorHandler)>
		mCallback = callback;
	//   12   22:aload_0         
	//   13   23:aload           4
	//   14   25:putfield        #31  <Field android.arch.persistence.db.SupportSQLiteOpenHelper$Callback mCallback>
		mDbRef = dbRef;
	//   15   28:aload_0         
	//   16   29:aload_3         
	//   17   30:putfield        #33  <Field FrameworkSQLiteDatabase[] mDbRef>
	//   18   33:return          
	}
}
