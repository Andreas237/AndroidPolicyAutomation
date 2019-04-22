// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.migration.Migration;
import android.database.sqlite.SQLiteDatabase;
import com.newrelic.agent.android.instrumentation.SQLiteInstrumentation;

// Referenced classes of package androidx.work.impl:
//			WorkDatabaseMigrations

static final class WorkDatabaseMigrations$2 extends Migration
{

	public void migrate(SupportSQLiteDatabase supportsqlitedatabase)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          33
		{
			if(!(supportsqlitedatabase instanceof SQLiteDatabase))
	//*   3    8:aload_1         
	//*   4    9:instanceof      #23  <Class SQLiteDatabase>
	//*   5   12:ifne            24
			{
				supportsqlitedatabase.execSQL("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
	//    6   15:aload_1         
	//    7   16:ldc1            #25  <String "UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0">
	//    8   18:invokeinterface #31  <Method void SupportSQLiteDatabase.execSQL(String)>
				return;
	//    9   23:return          
			}
			SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
	//   10   24:aload_1         
	//   11   25:checkcast       #23  <Class SQLiteDatabase>
	//   12   28:ldc1            #25  <String "UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0">
	//   13   30:invokestatic    #36  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
		}
	//   14   33:return          
	}

	WorkDatabaseMigrations$2(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #11  <Method void Migration(int, int)>
	//    4    6:return          
	}
}
