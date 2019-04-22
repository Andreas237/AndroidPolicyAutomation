// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.migration.Migration;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.work.impl.utils.Preferences;
import com.newrelic.agent.android.instrumentation.SQLiteInstrumentation;

public class WorkDatabaseMigrations
{
	public static class WorkMigration extends Migration
	{

		public void migrate(SupportSQLiteDatabase supportsqlitedatabase)
		{
			(new Preferences(mContext)).setNeedsReschedule(true);
		//    0    0:new             #23  <Class Preferences>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #17  <Field Context mContext>
		//    4    8:invokespecial   #26  <Method void Preferences(Context)>
		//    5   11:iconst_1        
		//    6   12:invokevirtual   #30  <Method void Preferences.setNeedsReschedule(boolean)>
		//    7   15:return          
		}

		final Context mContext;

		public WorkMigration(Context context, int i, int j)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_2         
		//    2    2:iload_3         
		//    3    3:invokespecial   #15  <Method void Migration(int, int)>
			mContext = context;
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:putfield        #17  <Field Context mContext>
		//    7   11:return          
		}
	}


	public static Migration MIGRATION_1_2 = new Migration(1, 2) {

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

			
			{
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:iload_2         
			//    3    3:invokespecial   #11  <Method void Migration(int, int)>
			//    4    6:return          
			}
	}
;
	public static Migration MIGRATION_3_4 = new Migration(3, 4) {

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

			
			{
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:iload_2         
			//    3    3:invokespecial   #11  <Method void Migration(int, int)>
			//    4    6:return          
			}
	}
;

	static 
	{
	//    0    0:new             #6   <Class WorkDatabaseMigrations$1>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:iconst_2        
	//    4    6:invokespecial   #24  <Method void WorkDatabaseMigrations$1(int, int)>
	//    5    9:putstatic       #26  <Field Migration MIGRATION_1_2>
	//    6   12:new             #8   <Class WorkDatabaseMigrations$2>
	//    7   15:dup             
	//    8   16:iconst_3        
	//    9   17:iconst_4        
	//   10   18:invokespecial   #27  <Method void WorkDatabaseMigrations$2(int, int)>
	//   11   21:putstatic       #29  <Field Migration MIGRATION_3_4>
	//*  12   24:return          
	}
}
