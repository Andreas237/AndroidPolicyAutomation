// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.database.sqlite.SQLiteDatabase;
import com.newrelic.agent.android.instrumentation.SQLiteInstrumentation;

// Referenced classes of package androidx.work.impl:
//			WorkDatabase

static final class WorkDatabase$1 extends android.arch.persistence.room.llback
{

	public void onOpen(SupportSQLiteDatabase supportsqlitedatabase)
	{
		super.onOpen(supportsqlitedatabase);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void android.arch.persistence.room.RoomDatabase$Callback.onOpen(SupportSQLiteDatabase)>
		supportsqlitedatabase.beginTransaction();
	//    3    5:aload_1         
	//    4    6:invokeinterface #25  <Method void SupportSQLiteDatabase.beginTransaction()>
		if(!(supportsqlitedatabase instanceof SQLiteDatabase))
	//*   5   11:aload_1         
	//*   6   12:instanceof      #27  <Class SQLiteDatabase>
	//*   7   15:ifne            29
		{
			supportsqlitedatabase.execSQL("UPDATE workspec SET state=0, schedule_requested_at=-1 WHERE state=1");
	//    8   18:aload_1         
	//    9   19:ldc1            #29  <String "UPDATE workspec SET state=0, schedule_requested_at=-1 WHERE state=1">
	//   10   21:invokeinterface #33  <Method void SupportSQLiteDatabase.execSQL(String)>
			break MISSING_BLOCK_LABEL_38;
	//   11   26:goto            38
		}
		SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "UPDATE workspec SET state=0, schedule_requested_at=-1 WHERE state=1");
	//   12   29:aload_1         
	//   13   30:checkcast       #27  <Class SQLiteDatabase>
	//   14   33:ldc1            #29  <String "UPDATE workspec SET state=0, schedule_requested_at=-1 WHERE state=1">
	//   15   35:invokestatic    #38  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
		String s;
		s = WorkDatabase.getPruneSQL();
	//   16   38:invokestatic    #42  <Method String WorkDatabase.getPruneSQL()>
	//   17   41:astore_2        
		if(!(supportsqlitedatabase instanceof SQLiteDatabase))
	//*  18   42:aload_1         
	//*  19   43:instanceof      #27  <Class SQLiteDatabase>
	//*  20   46:ifne            59
		{
			supportsqlitedatabase.execSQL(s);
	//   21   49:aload_1         
	//   22   50:aload_2         
	//   23   51:invokeinterface #33  <Method void SupportSQLiteDatabase.execSQL(String)>
			break MISSING_BLOCK_LABEL_67;
	//   24   56:goto            67
		}
		SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, s);
	//   25   59:aload_1         
	//   26   60:checkcast       #27  <Class SQLiteDatabase>
	//   27   63:aload_2         
	//   28   64:invokestatic    #38  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
		supportsqlitedatabase.setTransactionSuccessful();
	//   29   67:aload_1         
	//   30   68:invokeinterface #45  <Method void SupportSQLiteDatabase.setTransactionSuccessful()>
		supportsqlitedatabase.endTransaction();
	//   31   73:aload_1         
	//   32   74:invokeinterface #48  <Method void SupportSQLiteDatabase.endTransaction()>
		return;
	//   33   79:return          
		Exception exception;
		exception;
	//   34   80:astore_2        
		supportsqlitedatabase.endTransaction();
	//   35   81:aload_1         
	//   36   82:invokeinterface #48  <Method void SupportSQLiteDatabase.endTransaction()>
		throw exception;
	//   37   87:aload_2         
	//   38   88:athrow          
	}

	WorkDatabase$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void android.arch.persistence.room.RoomDatabase$Callback()>
	//    2    4:return          
	}
}
