// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.migration.Migration;

// Referenced classes of package androidx.work.impl:
//			WorkDatabaseMigrations

static final class WorkDatabaseMigrations$2 extends Migration
{

	public void migrate(SupportSQLiteDatabase supportsqlitedatabase)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #20  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          16
			supportsqlitedatabase.execSQL("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
	//    3    8:aload_1         
	//    4    9:ldc1            #22  <String "UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0">
	//    5   11:invokeinterface #28  <Method void SupportSQLiteDatabase.execSQL(String)>
	//    6   16:return          
	}

	WorkDatabaseMigrations$2(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #10  <Method void Migration(int, int)>
	//    4    6:return          
	}
}
