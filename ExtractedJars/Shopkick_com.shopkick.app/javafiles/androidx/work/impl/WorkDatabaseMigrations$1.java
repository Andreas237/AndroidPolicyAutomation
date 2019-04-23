// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.migration.Migration;

// Referenced classes of package androidx.work.impl:
//			WorkDatabaseMigrations

static final class WorkDatabaseMigrations$1 extends Migration
{

	public void migrate(SupportSQLiteDatabase supportsqlitedatabase)
	{
		supportsqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
	//    0    0:aload_1         
	//    1    1:ldc1            #16  <String "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )">
	//    2    3:invokeinterface #22  <Method void SupportSQLiteDatabase.execSQL(String)>
		supportsqlitedatabase.execSQL("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
	//    3    8:aload_1         
	//    4    9:ldc1            #24  <String "INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo">
	//    5   11:invokeinterface #22  <Method void SupportSQLiteDatabase.execSQL(String)>
		supportsqlitedatabase.execSQL("DROP TABLE IF EXISTS alarmInfo");
	//    6   16:aload_1         
	//    7   17:ldc1            #26  <String "DROP TABLE IF EXISTS alarmInfo">
	//    8   19:invokeinterface #22  <Method void SupportSQLiteDatabase.execSQL(String)>
		supportsqlitedatabase.execSQL("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
	//    9   24:aload_1         
	//   10   25:ldc1            #28  <String "INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec">
	//   11   27:invokeinterface #22  <Method void SupportSQLiteDatabase.execSQL(String)>
	//   12   32:return          
	}

	WorkDatabaseMigrations$1(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #10  <Method void Migration(int, int)>
	//    4    6:return          
	}
}
