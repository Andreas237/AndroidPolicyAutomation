// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.migration.Migration;

// Referenced classes of package androidx.work.impl:
//			WorkDatabaseMigrations

static final class WorkDatabaseMigrations$3 extends Migration
{

	public void migrate(SupportSQLiteDatabase supportsqlitedatabase)
	{
		supportsqlitedatabase.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
	//    0    0:aload_1         
	//    1    1:ldc1            #16  <String "ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1">
	//    2    3:invokeinterface #22  <Method void SupportSQLiteDatabase.execSQL(String)>
		supportsqlitedatabase.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
	//    3    8:aload_1         
	//    4    9:ldc1            #24  <String "ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1">
	//    5   11:invokeinterface #22  <Method void SupportSQLiteDatabase.execSQL(String)>
	//    6   16:return          
	}

	WorkDatabaseMigrations$3(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #10  <Method void Migration(int, int)>
	//    4    6:return          
	}
}
