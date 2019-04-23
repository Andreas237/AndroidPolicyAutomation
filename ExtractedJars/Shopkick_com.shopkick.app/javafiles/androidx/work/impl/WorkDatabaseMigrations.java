// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.migration.Migration;
import android.content.Context;
import androidx.work.impl.utils.Preferences;

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


	private WorkDatabaseMigrations()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void Object()>
	//    2    4:return          
	}

	private static final String CREATE_SYSTEM_ID_INFO = "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )";
	private static final String MIGRATE_ALARM_INFO_TO_SYSTEM_ID_INFO = "INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo";
	public static Migration MIGRATION_1_2 = new Migration(1, 2) {

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

			
			{
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:iload_2         
			//    3    3:invokespecial   #10  <Method void Migration(int, int)>
			//    4    6:return          
			}
	}
;
	public static Migration MIGRATION_3_4 = new Migration(3, 4) {

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

			
			{
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:iload_2         
			//    3    3:invokespecial   #10  <Method void Migration(int, int)>
			//    4    6:return          
			}
	}
;
	public static Migration MIGRATION_4_5 = new Migration(4, 5) {

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

			
			{
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:iload_2         
			//    3    3:invokespecial   #10  <Method void Migration(int, int)>
			//    4    6:return          
			}
	}
;
	private static final String PERIODIC_WORK_SET_SCHEDULE_REQUESTED_AT = "UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0";
	private static final String REMOVE_ALARM_INFO = "DROP TABLE IF EXISTS alarmInfo";
	public static final int VERSION_1 = 1;
	public static final int VERSION_2 = 2;
	public static final int VERSION_3 = 3;
	public static final int VERSION_4 = 4;
	public static final int VERSION_5 = 5;
	private static final String WORKSPEC_ADD_TRIGGER_MAX_CONTENT_DELAY = "ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1";
	private static final String WORKSPEC_ADD_TRIGGER_UPDATE_DELAY = "ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1";

	static 
	{
	//    0    0:new             #6   <Class WorkDatabaseMigrations$1>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:iconst_2        
	//    4    6:invokespecial   #57  <Method void WorkDatabaseMigrations$1(int, int)>
	//    5    9:putstatic       #59  <Field Migration MIGRATION_1_2>
	//    6   12:new             #8   <Class WorkDatabaseMigrations$2>
	//    7   15:dup             
	//    8   16:iconst_3        
	//    9   17:iconst_4        
	//   10   18:invokespecial   #60  <Method void WorkDatabaseMigrations$2(int, int)>
	//   11   21:putstatic       #62  <Field Migration MIGRATION_3_4>
	//   12   24:new             #10  <Class WorkDatabaseMigrations$3>
	//   13   27:dup             
	//   14   28:iconst_4        
	//   15   29:iconst_5        
	//   16   30:invokespecial   #63  <Method void WorkDatabaseMigrations$3(int, int)>
	//   17   33:putstatic       #65  <Field Migration MIGRATION_4_5>
	//*  18   36:return          
	}
}
