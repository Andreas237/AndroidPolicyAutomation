// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.arch.persistence.db.SupportSQLiteDatabase;

// Referenced classes of package androidx.work.impl:
//			WorkDatabase

static final class WorkDatabase$1 extends android.arch.persistence.room.llback
{

	public void onOpen(SupportSQLiteDatabase supportsqlitedatabase)
	{
		super.onOpen(supportsqlitedatabase);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void android.arch.persistence.room.RoomDatabase$Callback.onOpen(SupportSQLiteDatabase)>
		supportsqlitedatabase.beginTransaction();
	//    3    5:aload_1         
	//    4    6:invokeinterface #24  <Method void SupportSQLiteDatabase.beginTransaction()>
		supportsqlitedatabase.execSQL("UPDATE workspec SET state=0, schedule_requested_at=-1 WHERE state=1");
	//    5   11:aload_1         
	//    6   12:ldc1            #26  <String "UPDATE workspec SET state=0, schedule_requested_at=-1 WHERE state=1">
	//    7   14:invokeinterface #30  <Method void SupportSQLiteDatabase.execSQL(String)>
		supportsqlitedatabase.execSQL(WorkDatabase.getPruneSQL());
	//    8   19:aload_1         
	//    9   20:invokestatic    #34  <Method String WorkDatabase.getPruneSQL()>
	//   10   23:invokeinterface #30  <Method void SupportSQLiteDatabase.execSQL(String)>
		supportsqlitedatabase.setTransactionSuccessful();
	//   11   28:aload_1         
	//   12   29:invokeinterface #37  <Method void SupportSQLiteDatabase.setTransactionSuccessful()>
		supportsqlitedatabase.endTransaction();
	//   13   34:aload_1         
	//   14   35:invokeinterface #40  <Method void SupportSQLiteDatabase.endTransaction()>
		return;
	//   15   40:return          
		Exception exception;
		exception;
	//   16   41:astore_2        
		supportsqlitedatabase.endTransaction();
	//   17   42:aload_1         
	//   18   43:invokeinterface #40  <Method void SupportSQLiteDatabase.endTransaction()>
		throw exception;
	//   19   48:aload_2         
	//   20   49:athrow          
	}

	WorkDatabase$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void android.arch.persistence.room.RoomDatabase$Callback()>
	//    2    4:return          
	}
}
