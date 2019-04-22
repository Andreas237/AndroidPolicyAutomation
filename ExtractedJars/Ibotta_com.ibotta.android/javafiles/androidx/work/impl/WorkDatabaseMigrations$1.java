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

static final class WorkDatabaseMigrations$1 extends Migration
{

	public void migrate(SupportSQLiteDatabase supportsqlitedatabase)
	{
		boolean flag = supportsqlitedatabase instanceof SQLiteDatabase;
	//    0    0:aload_1         
	//    1    1:instanceof      #17  <Class SQLiteDatabase>
	//    2    4:istore_2        
		if(!flag)
	//*   3    5:iload_2         
	//*   4    6:ifne            20
			supportsqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
	//    5    9:aload_1         
	//    6   10:ldc1            #19  <String "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )">
	//    7   12:invokeinterface #25  <Method void SupportSQLiteDatabase.execSQL(String)>
		else
	//*   8   17:goto            29
			SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
	//    9   20:aload_1         
	//   10   21:checkcast       #17  <Class SQLiteDatabase>
	//   11   24:ldc1            #19  <String "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )">
	//   12   26:invokestatic    #30  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
		if(!flag)
	//*  13   29:iload_2         
	//*  14   30:ifne            44
			supportsqlitedatabase.execSQL("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
	//   15   33:aload_1         
	//   16   34:ldc1            #32  <String "INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo">
	//   17   36:invokeinterface #25  <Method void SupportSQLiteDatabase.execSQL(String)>
		else
	//*  18   41:goto            53
			SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
	//   19   44:aload_1         
	//   20   45:checkcast       #17  <Class SQLiteDatabase>
	//   21   48:ldc1            #32  <String "INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo">
	//   22   50:invokestatic    #30  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
		if(!flag)
	//*  23   53:iload_2         
	//*  24   54:ifne            68
			supportsqlitedatabase.execSQL("DROP TABLE IF EXISTS alarmInfo");
	//   25   57:aload_1         
	//   26   58:ldc1            #34  <String "DROP TABLE IF EXISTS alarmInfo">
	//   27   60:invokeinterface #25  <Method void SupportSQLiteDatabase.execSQL(String)>
		else
	//*  28   65:goto            77
			SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "DROP TABLE IF EXISTS alarmInfo");
	//   29   68:aload_1         
	//   30   69:checkcast       #17  <Class SQLiteDatabase>
	//   31   72:ldc1            #34  <String "DROP TABLE IF EXISTS alarmInfo">
	//   32   74:invokestatic    #30  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
		if(!flag)
	//*  33   77:iload_2         
	//*  34   78:ifne            90
		{
			supportsqlitedatabase.execSQL("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
	//   35   81:aload_1         
	//   36   82:ldc1            #36  <String "INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec">
	//   37   84:invokeinterface #25  <Method void SupportSQLiteDatabase.execSQL(String)>
			return;
	//   38   89:return          
		} else
		{
			SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
	//   39   90:aload_1         
	//   40   91:checkcast       #17  <Class SQLiteDatabase>
	//   41   94:ldc1            #36  <String "INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec">
	//   42   96:invokestatic    #30  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
			return;
	//   43   99:return          
		}
	}

	WorkDatabaseMigrations$1(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #11  <Method void Migration(int, int)>
	//    4    6:return          
	}
}
