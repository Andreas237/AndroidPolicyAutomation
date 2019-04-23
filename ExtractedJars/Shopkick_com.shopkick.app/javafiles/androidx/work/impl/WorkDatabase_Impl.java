// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.*;
import android.arch.persistence.room.util.TableInfo;
import android.database.Cursor;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.DependencyDao_Impl;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.SystemIdInfoDao_Impl;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkNameDao_Impl;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecDao_Impl;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.model.WorkTagDao_Impl;
import java.util.*;

// Referenced classes of package androidx.work.impl:
//			WorkDatabase

public class WorkDatabase_Impl extends WorkDatabase
{

	public WorkDatabase_Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void WorkDatabase()>
	//    2    4:return          
	}

	public void clearAllTables()
	{
		boolean flag;
		SupportSQLiteDatabase supportsqlitedatabase;
		super.assertNotMainThread();
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void WorkDatabase.assertNotMainThread()>
		supportsqlitedatabase = super.getOpenHelper().getWritableDatabase();
	//    2    4:aload_0         
	//    3    5:invokespecial   #52  <Method SupportSQLiteOpenHelper WorkDatabase.getOpenHelper()>
	//    4    8:invokeinterface #58  <Method SupportSQLiteDatabase SupportSQLiteOpenHelper.getWritableDatabase()>
	//    5   13:astore_2        
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   6   14:getstatic       #64  <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   17:bipush          21
	//*   8   19:icmplt          27
			flag = true;
	//    9   22:iconst_1        
	//   10   23:istore_1        
		else
	//*  11   24:goto            29
			flag = false;
	//   12   27:iconst_0        
	//   13   28:istore_1        
		if(flag)
			break MISSING_BLOCK_LABEL_41;
	//   14   29:iload_1         
	//   15   30:ifne            41
		supportsqlitedatabase.execSQL("PRAGMA foreign_keys = FALSE");
	//   16   33:aload_2         
	//   17   34:ldc1            #66  <String "PRAGMA foreign_keys = FALSE">
	//   18   36:invokeinterface #72  <Method void SupportSQLiteDatabase.execSQL(String)>
		super.beginTransaction();
	//   19   41:aload_0         
	//   20   42:invokespecial   #75  <Method void WorkDatabase.beginTransaction()>
		if(!flag)
			break MISSING_BLOCK_LABEL_57;
	//   21   45:iload_1         
	//   22   46:ifeq            57
		supportsqlitedatabase.execSQL("PRAGMA defer_foreign_keys = TRUE");
	//   23   49:aload_2         
	//   24   50:ldc1            #77  <String "PRAGMA defer_foreign_keys = TRUE">
	//   25   52:invokeinterface #72  <Method void SupportSQLiteDatabase.execSQL(String)>
		supportsqlitedatabase.execSQL("DELETE FROM `Dependency`");
	//   26   57:aload_2         
	//   27   58:ldc1            #79  <String "DELETE FROM `Dependency`">
	//   28   60:invokeinterface #72  <Method void SupportSQLiteDatabase.execSQL(String)>
		supportsqlitedatabase.execSQL("DELETE FROM `WorkSpec`");
	//   29   65:aload_2         
	//   30   66:ldc1            #81  <String "DELETE FROM `WorkSpec`">
	//   31   68:invokeinterface #72  <Method void SupportSQLiteDatabase.execSQL(String)>
		supportsqlitedatabase.execSQL("DELETE FROM `WorkTag`");
	//   32   73:aload_2         
	//   33   74:ldc1            #83  <String "DELETE FROM `WorkTag`">
	//   34   76:invokeinterface #72  <Method void SupportSQLiteDatabase.execSQL(String)>
		supportsqlitedatabase.execSQL("DELETE FROM `SystemIdInfo`");
	//   35   81:aload_2         
	//   36   82:ldc1            #85  <String "DELETE FROM `SystemIdInfo`">
	//   37   84:invokeinterface #72  <Method void SupportSQLiteDatabase.execSQL(String)>
		supportsqlitedatabase.execSQL("DELETE FROM `WorkName`");
	//   38   89:aload_2         
	//   39   90:ldc1            #87  <String "DELETE FROM `WorkName`">
	//   40   92:invokeinterface #72  <Method void SupportSQLiteDatabase.execSQL(String)>
		super.setTransactionSuccessful();
	//   41   97:aload_0         
	//   42   98:invokespecial   #90  <Method void WorkDatabase.setTransactionSuccessful()>
		super.endTransaction();
	//   43  101:aload_0         
	//   44  102:invokespecial   #93  <Method void WorkDatabase.endTransaction()>
		if(!flag)
	//*  45  105:iload_1         
	//*  46  106:ifne            117
			supportsqlitedatabase.execSQL("PRAGMA foreign_keys = TRUE");
	//   47  109:aload_2         
	//   48  110:ldc1            #95  <String "PRAGMA foreign_keys = TRUE">
	//   49  112:invokeinterface #72  <Method void SupportSQLiteDatabase.execSQL(String)>
		supportsqlitedatabase.query("PRAGMA wal_checkpoint(FULL)").close();
	//   50  117:aload_2         
	//   51  118:ldc1            #97  <String "PRAGMA wal_checkpoint(FULL)">
	//   52  120:invokeinterface #101 <Method Cursor SupportSQLiteDatabase.query(String)>
	//   53  125:invokeinterface #106 <Method void Cursor.close()>
		if(!supportsqlitedatabase.inTransaction())
	//*  54  130:aload_2         
	//*  55  131:invokeinterface #110 <Method boolean SupportSQLiteDatabase.inTransaction()>
	//*  56  136:ifne            147
			supportsqlitedatabase.execSQL("VACUUM");
	//   57  139:aload_2         
	//   58  140:ldc1            #112 <String "VACUUM">
	//   59  142:invokeinterface #72  <Method void SupportSQLiteDatabase.execSQL(String)>
		return;
	//   60  147:return          
		Exception exception;
		exception;
	//   61  148:astore_3        
		super.endTransaction();
	//   62  149:aload_0         
	//   63  150:invokespecial   #93  <Method void WorkDatabase.endTransaction()>
		if(!flag)
	//*  64  153:iload_1         
	//*  65  154:ifne            165
			supportsqlitedatabase.execSQL("PRAGMA foreign_keys = TRUE");
	//   66  157:aload_2         
	//   67  158:ldc1            #95  <String "PRAGMA foreign_keys = TRUE">
	//   68  160:invokeinterface #72  <Method void SupportSQLiteDatabase.execSQL(String)>
		supportsqlitedatabase.query("PRAGMA wal_checkpoint(FULL)").close();
	//   69  165:aload_2         
	//   70  166:ldc1            #97  <String "PRAGMA wal_checkpoint(FULL)">
	//   71  168:invokeinterface #101 <Method Cursor SupportSQLiteDatabase.query(String)>
	//   72  173:invokeinterface #106 <Method void Cursor.close()>
		if(!supportsqlitedatabase.inTransaction())
	//*  73  178:aload_2         
	//*  74  179:invokeinterface #110 <Method boolean SupportSQLiteDatabase.inTransaction()>
	//*  75  184:ifne            195
			supportsqlitedatabase.execSQL("VACUUM");
	//   76  187:aload_2         
	//   77  188:ldc1            #112 <String "VACUUM">
	//   78  190:invokeinterface #72  <Method void SupportSQLiteDatabase.execSQL(String)>
		throw exception;
	//   79  195:aload_3         
	//   80  196:athrow          
	}

	protected InvalidationTracker createInvalidationTracker()
	{
		return new InvalidationTracker(((android.arch.persistence.room.RoomDatabase) (this)), new String[] {
			"Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName"
		});
	//    0    0:new             #116 <Class InvalidationTracker>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_5        
	//    4    6:anewarray       String[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:ldc1            #120 <String "Dependency">
	//    8   13:aastore         
	//    9   14:dup             
	//   10   15:iconst_1        
	//   11   16:ldc1            #122 <String "WorkSpec">
	//   12   18:aastore         
	//   13   19:dup             
	//   14   20:iconst_2        
	//   15   21:ldc1            #124 <String "WorkTag">
	//   16   23:aastore         
	//   17   24:dup             
	//   18   25:iconst_3        
	//   19   26:ldc1            #126 <String "SystemIdInfo">
	//   20   28:aastore         
	//   21   29:dup             
	//   22   30:iconst_4        
	//   23   31:ldc1            #128 <String "WorkName">
	//   24   33:aastore         
	//   25   34:invokespecial   #131 <Method void InvalidationTracker(android.arch.persistence.room.RoomDatabase, String[])>
	//   26   37:areturn         
	}

	protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseconfiguration)
	{
		Object obj = ((Object) (new RoomOpenHelper(databaseconfiguration, ((android.arch.persistence.room.RoomOpenHelper.Delegate) (new android.arch.persistence.room.RoomOpenHelper.Delegate(5) {

			public void createAllTables(SupportSQLiteDatabase supportsqlitedatabase)
			{
				supportsqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
			//    0    0:aload_1         
			//    1    1:ldc1            #23  <String "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )">
			//    2    3:invokeinterface #29  <Method void SupportSQLiteDatabase.execSQL(String)>
				supportsqlitedatabase.execSQL("CREATE  INDEX `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
			//    3    8:aload_1         
			//    4    9:ldc1            #31  <String "CREATE  INDEX `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)">
			//    5   11:invokeinterface #29  <Method void SupportSQLiteDatabase.execSQL(String)>
				supportsqlitedatabase.execSQL("CREATE  INDEX `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
			//    6   16:aload_1         
			//    7   17:ldc1            #33  <String "CREATE  INDEX `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)">
			//    8   19:invokeinterface #29  <Method void SupportSQLiteDatabase.execSQL(String)>
				supportsqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
			//    9   24:aload_1         
			//   10   25:ldc1            #35  <String "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))">
			//   11   27:invokeinterface #29  <Method void SupportSQLiteDatabase.execSQL(String)>
				supportsqlitedatabase.execSQL("CREATE  INDEX `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
			//   12   32:aload_1         
			//   13   33:ldc1            #37  <String "CREATE  INDEX `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)">
			//   14   35:invokeinterface #29  <Method void SupportSQLiteDatabase.execSQL(String)>
				supportsqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
			//   15   40:aload_1         
			//   16   41:ldc1            #39  <String "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )">
			//   17   43:invokeinterface #29  <Method void SupportSQLiteDatabase.execSQL(String)>
				supportsqlitedatabase.execSQL("CREATE  INDEX `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
			//   18   48:aload_1         
			//   19   49:ldc1            #41  <String "CREATE  INDEX `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)">
			//   20   51:invokeinterface #29  <Method void SupportSQLiteDatabase.execSQL(String)>
				supportsqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
			//   21   56:aload_1         
			//   22   57:ldc1            #43  <String "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )">
			//   23   59:invokeinterface #29  <Method void SupportSQLiteDatabase.execSQL(String)>
				supportsqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
			//   24   64:aload_1         
			//   25   65:ldc1            #45  <String "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )">
			//   26   67:invokeinterface #29  <Method void SupportSQLiteDatabase.execSQL(String)>
				supportsqlitedatabase.execSQL("CREATE  INDEX `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
			//   27   72:aload_1         
			//   28   73:ldc1            #47  <String "CREATE  INDEX `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)">
			//   29   75:invokeinterface #29  <Method void SupportSQLiteDatabase.execSQL(String)>
				supportsqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
			//   30   80:aload_1         
			//   31   81:ldc1            #49  <String "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)">
			//   32   83:invokeinterface #29  <Method void SupportSQLiteDatabase.execSQL(String)>
				supportsqlitedatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"c84d23ade98552f1cec71088c1f0794c\")");
			//   33   88:aload_1         
			//   34   89:ldc1            #51  <String "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"c84d23ade98552f1cec71088c1f0794c\")">
			//   35   91:invokeinterface #29  <Method void SupportSQLiteDatabase.execSQL(String)>
			//   36   96:return          
			}

			public void dropAllTables(SupportSQLiteDatabase supportsqlitedatabase)
			{
				supportsqlitedatabase.execSQL("DROP TABLE IF EXISTS `Dependency`");
			//    0    0:aload_1         
			//    1    1:ldc1            #54  <String "DROP TABLE IF EXISTS `Dependency`">
			//    2    3:invokeinterface #29  <Method void SupportSQLiteDatabase.execSQL(String)>
				supportsqlitedatabase.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
			//    3    8:aload_1         
			//    4    9:ldc1            #56  <String "DROP TABLE IF EXISTS `WorkSpec`">
			//    5   11:invokeinterface #29  <Method void SupportSQLiteDatabase.execSQL(String)>
				supportsqlitedatabase.execSQL("DROP TABLE IF EXISTS `WorkTag`");
			//    6   16:aload_1         
			//    7   17:ldc1            #58  <String "DROP TABLE IF EXISTS `WorkTag`">
			//    8   19:invokeinterface #29  <Method void SupportSQLiteDatabase.execSQL(String)>
				supportsqlitedatabase.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
			//    9   24:aload_1         
			//   10   25:ldc1            #60  <String "DROP TABLE IF EXISTS `SystemIdInfo`">
			//   11   27:invokeinterface #29  <Method void SupportSQLiteDatabase.execSQL(String)>
				supportsqlitedatabase.execSQL("DROP TABLE IF EXISTS `WorkName`");
			//   12   32:aload_1         
			//   13   33:ldc1            #62  <String "DROP TABLE IF EXISTS `WorkName`">
			//   14   35:invokeinterface #29  <Method void SupportSQLiteDatabase.execSQL(String)>
			//   15   40:return          
			}

			protected void onCreate(SupportSQLiteDatabase supportsqlitedatabase)
			{
				if(
// JavaClassFileOutputException: get_constant: invalid tag

			public void onOpen(SupportSQLiteDatabase supportsqlitedatabase)
			{
				supportsqlitedatabase._22_CREATE_20_TABLE_20_IF_20_NOT_20_EXISTS_20__60_WorkSpec_60__20__28__60_id_60__20_TEXT_20_NOT_20_NULL_2C__20__60_state_60__20_INTEGER_20_NOT_20_NULL_2C__20__60_worker_class_name_60__20_TEXT_20_NOT_20_NULL_2C__20__60_input_merger_class_name_60__20_TEXT_2C__20__60_input_60__20_BLOB_20_NOT_20_NULL_2C__20__60_output_60__20_BLOB_20_NOT_20_NULL_2C__20__60_initial_delay_60__20_INTEGER_20_NOT_20_NULL_2C__20__60_interval_duration_60__20_INTEGER_20_NOT_20_NULL_2C__20__60_flex_duration_60__20_INTEGER_20_NOT_20_NULL_2C__20__60_run_attempt_count_60__20_INTEGER_20_NOT_20_NULL_2C__20__60_backoff_policy_60__20_INTEGER_20_NOT_20_NULL_2C__20__60_backoff_delay_duration_60__20_INTEGER_20_NOT_20_NULL_2C__20__60_period_start_time_60__20_INTEGER_20_NOT_20_NULL_2C__20__60_minimum_retention_duration_60__20_INTEGER_20_NOT_20_NULL_2C__20__60_schedule_requested_at_60__20_INTEGER_20_NOT_20_NULL_2C__20__60_required_network_type_60__20_INTEGER_2C__20__60_requires_charging_60__20_INTEGER_20_NOT_20_NULL_2C__20__60_requires_device_idle_60__20_INTEGER_20_NOT_20_NULL_2C__20__60_requires_battery_not_low_60__20_INTEGER_20_NOT_20_NULL_2C__20__60_requires_storage_not_low_60__20_INTEGER_20_NOT_20_NULL_2C__20__60_trigger_content_update_delay_60__20_INTEGER_20_NOT_20_NULL_2C__20__60_trigger_max_content_delay_60__20_INTEGER_20_NOT_20_NULL_2C__20__60_content_uri_triggers_60__20_BLOB_2C__20_PRIMARY_20_KEY_28__60_id_60__29__29__22_ = supportsqlitedatabase;
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field WorkDatabase_Impl this$0>
			//    2    4:aload_1         
			//    3    5:invokestatic    #92  <Method SupportSQLiteDatabase WorkDatabase_Impl.access$302(WorkDatabase_Impl, SupportSQLiteDatabase)>
			//    4    8:pop             
				supportsqlitedatabase.execSQL("PRAGMA foreign_keys = ON");
			//    5    9:aload_1         
			//    6   10:ldc1            #94  <String "PRAGMA foreign_keys = ON">
			//    7   12:invokeinterface #29  <Method void SupportSQLiteDatabase.execSQL(String)>
				internalInitInvalidationTracker(supportsqlitedatabase);
			//    8   17:aload_0         
			//    9   18:getfield        #15  <Field WorkDatabase_Impl this$0>
			//   10   21:aload_1         
			//   11   22:invokestatic    #98  <Method void WorkDatabase_Impl.access$400(WorkDatabase_Impl, SupportSQLiteDatabase)>
				if(
// JavaClassFileOutputException: get_constant: invalid tag

			protected void validateMigration(SupportSQLiteDatabase supportsqlitedatabase)
			{
				Object obj1 = ((Object) (new HashMap(2)));
			//    0    0:new             #112 <Class HashMap>
			//    1    3:dup             
			//    2    4:iconst_2        
			//    3    5:invokespecial   #113 <Method void HashMap(int)>
			//    4    8:astore_2        
				((HashMap) (obj1)).put("work_spec_id", ((Object) (new Column("work_spec_id", "TEXT", true, 1))));
			//    5    9:aload_2         
			//    6   10:ldc1            #115 <String "work_spec_id">
			//    7   12:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//    8   15:dup             
			//    9   16:ldc1            #115 <String "work_spec_id">
			//   10   18:ldc1            #119 <String "TEXT">
			//   11   20:iconst_1        
			//   12   21:iconst_1        
			//   13   22:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//   14   25:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//   15   28:pop             
				((HashMap) (obj1)).put("prerequisite_id", ((Object) (new Column("prerequisite_id", "TEXT", true, 2))));
			//   16   29:aload_2         
			//   17   30:ldc1            #128 <String "prerequisite_id">
			//   18   32:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//   19   35:dup             
			//   20   36:ldc1            #128 <String "prerequisite_id">
			//   21   38:ldc1            #119 <String "TEXT">
			//   22   40:iconst_1        
			//   23   41:iconst_2        
			//   24   42:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//   25   45:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//   26   48:pop             
				Object obj2 = ((Object) (new HashSet(2)));
			//   27   49:new             #130 <Class HashSet>
			//   28   52:dup             
			//   29   53:iconst_2        
			//   30   54:invokespecial   #131 <Method void HashSet(int)>
			//   31   57:astore_3        
				((HashSet) (obj2)).add(((Object) (new ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(((Object []) (new String[] {
					"work_spec_id"
				}))), Arrays.asList(((Object []) (new String[] {
					"id"
				})))))));
			//   32   58:aload_3         
			//   33   59:new             #133 <Class android.arch.persistence.room.util.TableInfo$ForeignKey>
			//   34   62:dup             
			//   35   63:ldc1            #135 <String "WorkSpec">
			//   36   65:ldc1            #137 <String "CASCADE">
			//   37   67:ldc1            #137 <String "CASCADE">
			//   38   69:iconst_1        
			//   39   70:anewarray       String[]
			//   40   73:dup             
			//   41   74:iconst_0        
			//   42   75:ldc1            #115 <String "work_spec_id">
			//   43   77:aastore         
			//   44   78:invokestatic    #145 <Method List Arrays.asList(Object[])>
			//   45   81:iconst_1        
			//   46   82:anewarray       String[]
			//   47   85:dup             
			//   48   86:iconst_0        
			//   49   87:ldc1            #147 <String "id">
			//   50   89:aastore         
			//   51   90:invokestatic    #145 <Method List Arrays.asList(Object[])>
			//   52   93:invokespecial   #150 <Method void android.arch.persistence.room.util.TableInfo$ForeignKey(String, String, String, List, List)>
			//   53   96:invokevirtual   #154 <Method boolean HashSet.add(Object)>
			//   54   99:pop             
				((HashSet) (obj2)).add(((Object) (new ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(((Object []) (new String[] {
					"prerequisite_id"
				}))), Arrays.asList(((Object []) (new String[] {
					"id"
				})))))));
			//   55  100:aload_3         
			//   56  101:new             #133 <Class android.arch.persistence.room.util.TableInfo$ForeignKey>
			//   57  104:dup             
			//   58  105:ldc1            #135 <String "WorkSpec">
			//   59  107:ldc1            #137 <String "CASCADE">
			//   60  109:ldc1            #137 <String "CASCADE">
			//   61  111:iconst_1        
			//   62  112:anewarray       String[]
			//   63  115:dup             
			//   64  116:iconst_0        
			//   65  117:ldc1            #128 <String "prerequisite_id">
			//   66  119:aastore         
			//   67  120:invokestatic    #145 <Method List Arrays.asList(Object[])>
			//   68  123:iconst_1        
			//   69  124:anewarray       String[]
			//   70  127:dup             
			//   71  128:iconst_0        
			//   72  129:ldc1            #147 <String "id">
			//   73  131:aastore         
			//   74  132:invokestatic    #145 <Method List Arrays.asList(Object[])>
			//   75  135:invokespecial   #150 <Method void android.arch.persistence.room.util.TableInfo$ForeignKey(String, String, String, List, List)>
			//   76  138:invokevirtual   #154 <Method boolean HashSet.add(Object)>
			//   77  141:pop             
				HashSet hashset = new HashSet(2);
			//   78  142:new             #130 <Class HashSet>
			//   79  145:dup             
			//   80  146:iconst_2        
			//   81  147:invokespecial   #131 <Method void HashSet(int)>
			//   82  150:astore          4
				hashset.add(((Object) (new Index("index_Dependency_work_spec_id", false, Arrays.asList(((Object []) (new String[] {
					"work_spec_id"
				})))))));
			//   83  152:aload           4
			//   84  154:new             #156 <Class android.arch.persistence.room.util.TableInfo$Index>
			//   85  157:dup             
			//   86  158:ldc1            #158 <String "index_Dependency_work_spec_id">
			//   87  160:iconst_0        
			//   88  161:iconst_1        
			//   89  162:anewarray       String[]
			//   90  165:dup             
			//   91  166:iconst_0        
			//   92  167:ldc1            #115 <String "work_spec_id">
			//   93  169:aastore         
			//   94  170:invokestatic    #145 <Method List Arrays.asList(Object[])>
			//   95  173:invokespecial   #161 <Method void android.arch.persistence.room.util.TableInfo$Index(String, boolean, List)>
			//   96  176:invokevirtual   #154 <Method boolean HashSet.add(Object)>
			//   97  179:pop             
				hashset.add(((Object) (new Index("index_Dependency_prerequisite_id", false, Arrays.asList(((Object []) (new String[] {
					"prerequisite_id"
				})))))));
			//   98  180:aload           4
			//   99  182:new             #156 <Class android.arch.persistence.room.util.TableInfo$Index>
			//  100  185:dup             
			//  101  186:ldc1            #163 <String "index_Dependency_prerequisite_id">
			//  102  188:iconst_0        
			//  103  189:iconst_1        
			//  104  190:anewarray       String[]
			//  105  193:dup             
			//  106  194:iconst_0        
			//  107  195:ldc1            #128 <String "prerequisite_id">
			//  108  197:aastore         
			//  109  198:invokestatic    #145 <Method List Arrays.asList(Object[])>
			//  110  201:invokespecial   #161 <Method void android.arch.persistence.room.util.TableInfo$Index(String, boolean, List)>
			//  111  204:invokevirtual   #154 <Method boolean HashSet.add(Object)>
			//  112  207:pop             
				obj1 = ((Object) (new TableInfo("Dependency", ((java.util.Map) (obj1)), ((java.util.Set) (obj2)), ((java.util.Set) (hashset)))));
			//  113  208:new             #165 <Class TableInfo>
			//  114  211:dup             
			//  115  212:ldc1            #167 <String "Dependency">
			//  116  214:aload_2         
			//  117  215:aload_3         
			//  118  216:aload           4
			//  119  218:invokespecial   #170 <Method void TableInfo(String, java.util.Map, java.util.Set, java.util.Set)>
			//  120  221:astore_2        
				obj2 = ((Object) (TableInfo.read(supportsqlitedatabase, "Dependency")));
			//  121  222:aload_1         
			//  122  223:ldc1            #167 <String "Dependency">
			//  123  225:invokestatic    #174 <Method TableInfo TableInfo.read(SupportSQLiteDatabase, String)>
			//  124  228:astore_3        
				if(((TableInfo) (obj1)).equals(obj2))
			//* 125  229:aload_2         
			//* 126  230:aload_3         
			//* 127  231:invokevirtual   #177 <Method boolean TableInfo.equals(Object)>
			//* 128  234:ifeq            1444
				{
					obj1 = ((Object) (new HashMap(23)));
			//  129  237:new             #112 <Class HashMap>
			//  130  240:dup             
			//  131  241:bipush          23
			//  132  243:invokespecial   #113 <Method void HashMap(int)>
			//  133  246:astore_2        
					((HashMap) (obj1)).put("id", ((Object) (new Column("id", "TEXT", true, 1))));
			//  134  247:aload_2         
			//  135  248:ldc1            #147 <String "id">
			//  136  250:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  137  253:dup             
			//  138  254:ldc1            #147 <String "id">
			//  139  256:ldc1            #119 <String "TEXT">
			//  140  258:iconst_1        
			//  141  259:iconst_1        
			//  142  260:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  143  263:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  144  266:pop             
					((HashMap) (obj1)).put("state", ((Object) (new Column("state", "INTEGER", true, 0))));
			//  145  267:aload_2         
			//  146  268:ldc1            #179 <String "state">
			//  147  270:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  148  273:dup             
			//  149  274:ldc1            #179 <String "state">
			//  150  276:ldc1            #181 <String "INTEGER">
			//  151  278:iconst_1        
			//  152  279:iconst_0        
			//  153  280:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  154  283:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  155  286:pop             
					((HashMap) (obj1)).put("worker_class_name", ((Object) (new Column("worker_class_name", "TEXT", true, 0))));
			//  156  287:aload_2         
			//  157  288:ldc1            #183 <String "worker_class_name">
			//  158  290:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  159  293:dup             
			//  160  294:ldc1            #183 <String "worker_class_name">
			//  161  296:ldc1            #119 <String "TEXT">
			//  162  298:iconst_1        
			//  163  299:iconst_0        
			//  164  300:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  165  303:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  166  306:pop             
					((HashMap) (obj1)).put("input_merger_class_name", ((Object) (new Column("input_merger_class_name", "TEXT", false, 0))));
			//  167  307:aload_2         
			//  168  308:ldc1            #185 <String "input_merger_class_name">
			//  169  310:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  170  313:dup             
			//  171  314:ldc1            #185 <String "input_merger_class_name">
			//  172  316:ldc1            #119 <String "TEXT">
			//  173  318:iconst_0        
			//  174  319:iconst_0        
			//  175  320:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  176  323:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  177  326:pop             
					((HashMap) (obj1)).put("input", ((Object) (new Column("input", "BLOB", true, 0))));
			//  178  327:aload_2         
			//  179  328:ldc1            #187 <String "input">
			//  180  330:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  181  333:dup             
			//  182  334:ldc1            #187 <String "input">
			//  183  336:ldc1            #189 <String "BLOB">
			//  184  338:iconst_1        
			//  185  339:iconst_0        
			//  186  340:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  187  343:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  188  346:pop             
					((HashMap) (obj1)).put("output", ((Object) (new Column("output", "BLOB", true, 0))));
			//  189  347:aload_2         
			//  190  348:ldc1            #191 <String "output">
			//  191  350:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  192  353:dup             
			//  193  354:ldc1            #191 <String "output">
			//  194  356:ldc1            #189 <String "BLOB">
			//  195  358:iconst_1        
			//  196  359:iconst_0        
			//  197  360:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  198  363:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  199  366:pop             
					((HashMap) (obj1)).put("initial_delay", ((Object) (new Column("initial_delay", "INTEGER", true, 0))));
			//  200  367:aload_2         
			//  201  368:ldc1            #193 <String "initial_delay">
			//  202  370:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  203  373:dup             
			//  204  374:ldc1            #193 <String "initial_delay">
			//  205  376:ldc1            #181 <String "INTEGER">
			//  206  378:iconst_1        
			//  207  379:iconst_0        
			//  208  380:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  209  383:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  210  386:pop             
					((HashMap) (obj1)).put("interval_duration", ((Object) (new Column("interval_duration", "INTEGER", true, 0))));
			//  211  387:aload_2         
			//  212  388:ldc1            #195 <String "interval_duration">
			//  213  390:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  214  393:dup             
			//  215  394:ldc1            #195 <String "interval_duration">
			//  216  396:ldc1            #181 <String "INTEGER">
			//  217  398:iconst_1        
			//  218  399:iconst_0        
			//  219  400:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  220  403:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  221  406:pop             
					((HashMap) (obj1)).put("flex_duration", ((Object) (new Column("flex_duration", "INTEGER", true, 0))));
			//  222  407:aload_2         
			//  223  408:ldc1            #197 <String "flex_duration">
			//  224  410:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  225  413:dup             
			//  226  414:ldc1            #197 <String "flex_duration">
			//  227  416:ldc1            #181 <String "INTEGER">
			//  228  418:iconst_1        
			//  229  419:iconst_0        
			//  230  420:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  231  423:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  232  426:pop             
					((HashMap) (obj1)).put("run_attempt_count", ((Object) (new Column("run_attempt_count", "INTEGER", true, 0))));
			//  233  427:aload_2         
			//  234  428:ldc1            #199 <String "run_attempt_count">
			//  235  430:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  236  433:dup             
			//  237  434:ldc1            #199 <String "run_attempt_count">
			//  238  436:ldc1            #181 <String "INTEGER">
			//  239  438:iconst_1        
			//  240  439:iconst_0        
			//  241  440:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  242  443:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  243  446:pop             
					((HashMap) (obj1)).put("backoff_policy", ((Object) (new Column("backoff_policy", "INTEGER", true, 0))));
			//  244  447:aload_2         
			//  245  448:ldc1            #201 <String "backoff_policy">
			//  246  450:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  247  453:dup             
			//  248  454:ldc1            #201 <String "backoff_policy">
			//  249  456:ldc1            #181 <String "INTEGER">
			//  250  458:iconst_1        
			//  251  459:iconst_0        
			//  252  460:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  253  463:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  254  466:pop             
					((HashMap) (obj1)).put("backoff_delay_duration", ((Object) (new Column("backoff_delay_duration", "INTEGER", true, 0))));
			//  255  467:aload_2         
			//  256  468:ldc1            #203 <String "backoff_delay_duration">
			//  257  470:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  258  473:dup             
			//  259  474:ldc1            #203 <String "backoff_delay_duration">
			//  260  476:ldc1            #181 <String "INTEGER">
			//  261  478:iconst_1        
			//  262  479:iconst_0        
			//  263  480:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  264  483:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  265  486:pop             
					((HashMap) (obj1)).put("period_start_time", ((Object) (new Column("period_start_time", "INTEGER", true, 0))));
			//  266  487:aload_2         
			//  267  488:ldc1            #205 <String "period_start_time">
			//  268  490:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  269  493:dup             
			//  270  494:ldc1            #205 <String "period_start_time">
			//  271  496:ldc1            #181 <String "INTEGER">
			//  272  498:iconst_1        
			//  273  499:iconst_0        
			//  274  500:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  275  503:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  276  506:pop             
					((HashMap) (obj1)).put("minimum_retention_duration", ((Object) (new Column("minimum_retention_duration", "INTEGER", true, 0))));
			//  277  507:aload_2         
			//  278  508:ldc1            #207 <String "minimum_retention_duration">
			//  279  510:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  280  513:dup             
			//  281  514:ldc1            #207 <String "minimum_retention_duration">
			//  282  516:ldc1            #181 <String "INTEGER">
			//  283  518:iconst_1        
			//  284  519:iconst_0        
			//  285  520:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  286  523:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  287  526:pop             
					((HashMap) (obj1)).put("schedule_requested_at", ((Object) (new Column("schedule_requested_at", "INTEGER", true, 0))));
			//  288  527:aload_2         
			//  289  528:ldc1            #209 <String "schedule_requested_at">
			//  290  530:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  291  533:dup             
			//  292  534:ldc1            #209 <String "schedule_requested_at">
			//  293  536:ldc1            #181 <String "INTEGER">
			//  294  538:iconst_1        
			//  295  539:iconst_0        
			//  296  540:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  297  543:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  298  546:pop             
					((HashMap) (obj1)).put("required_network_type", ((Object) (new Column("required_network_type", "INTEGER", false, 0))));
			//  299  547:aload_2         
			//  300  548:ldc1            #211 <String "required_network_type">
			//  301  550:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  302  553:dup             
			//  303  554:ldc1            #211 <String "required_network_type">
			//  304  556:ldc1            #181 <String "INTEGER">
			//  305  558:iconst_0        
			//  306  559:iconst_0        
			//  307  560:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  308  563:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  309  566:pop             
					((HashMap) (obj1)).put("requires_charging", ((Object) (new Column("requires_charging", "INTEGER", true, 0))));
			//  310  567:aload_2         
			//  311  568:ldc1            #213 <String "requires_charging">
			//  312  570:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  313  573:dup             
			//  314  574:ldc1            #213 <String "requires_charging">
			//  315  576:ldc1            #181 <String "INTEGER">
			//  316  578:iconst_1        
			//  317  579:iconst_0        
			//  318  580:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  319  583:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  320  586:pop             
					((HashMap) (obj1)).put("requires_device_idle", ((Object) (new Column("requires_device_idle", "INTEGER", true, 0))));
			//  321  587:aload_2         
			//  322  588:ldc1            #215 <String "requires_device_idle">
			//  323  590:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  324  593:dup             
			//  325  594:ldc1            #215 <String "requires_device_idle">
			//  326  596:ldc1            #181 <String "INTEGER">
			//  327  598:iconst_1        
			//  328  599:iconst_0        
			//  329  600:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  330  603:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  331  606:pop             
					((HashMap) (obj1)).put("requires_battery_not_low", ((Object) (new Column("requires_battery_not_low", "INTEGER", true, 0))));
			//  332  607:aload_2         
			//  333  608:ldc1            #217 <String "requires_battery_not_low">
			//  334  610:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  335  613:dup             
			//  336  614:ldc1            #217 <String "requires_battery_not_low">
			//  337  616:ldc1            #181 <String "INTEGER">
			//  338  618:iconst_1        
			//  339  619:iconst_0        
			//  340  620:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  341  623:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  342  626:pop             
					((HashMap) (obj1)).put("requires_storage_not_low", ((Object) (new Column("requires_storage_not_low", "INTEGER", true, 0))));
			//  343  627:aload_2         
			//  344  628:ldc1            #219 <String "requires_storage_not_low">
			//  345  630:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  346  633:dup             
			//  347  634:ldc1            #219 <String "requires_storage_not_low">
			//  348  636:ldc1            #181 <String "INTEGER">
			//  349  638:iconst_1        
			//  350  639:iconst_0        
			//  351  640:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  352  643:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  353  646:pop             
					((HashMap) (obj1)).put("trigger_content_update_delay", ((Object) (new Column("trigger_content_update_delay", "INTEGER", true, 0))));
			//  354  647:aload_2         
			//  355  648:ldc1            #221 <String "trigger_content_update_delay">
			//  356  650:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  357  653:dup             
			//  358  654:ldc1            #221 <String "trigger_content_update_delay">
			//  359  656:ldc1            #181 <String "INTEGER">
			//  360  658:iconst_1        
			//  361  659:iconst_0        
			//  362  660:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  363  663:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  364  666:pop             
					((HashMap) (obj1)).put("trigger_max_content_delay", ((Object) (new Column("trigger_max_content_delay", "INTEGER", true, 0))));
			//  365  667:aload_2         
			//  366  668:ldc1            #223 <String "trigger_max_content_delay">
			//  367  670:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  368  673:dup             
			//  369  674:ldc1            #223 <String "trigger_max_content_delay">
			//  370  676:ldc1            #181 <String "INTEGER">
			//  371  678:iconst_1        
			//  372  679:iconst_0        
			//  373  680:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  374  683:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  375  686:pop             
					((HashMap) (obj1)).put("content_uri_triggers", ((Object) (new Column("content_uri_triggers", "BLOB", false, 0))));
			//  376  687:aload_2         
			//  377  688:ldc1            #225 <String "content_uri_triggers">
			//  378  690:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  379  693:dup             
			//  380  694:ldc1            #225 <String "content_uri_triggers">
			//  381  696:ldc1            #189 <String "BLOB">
			//  382  698:iconst_0        
			//  383  699:iconst_0        
			//  384  700:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  385  703:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  386  706:pop             
					obj2 = ((Object) (new HashSet(0)));
			//  387  707:new             #130 <Class HashSet>
			//  388  710:dup             
			//  389  711:iconst_0        
			//  390  712:invokespecial   #131 <Method void HashSet(int)>
			//  391  715:astore_3        
					HashSet hashset1 = new HashSet(1);
			//  392  716:new             #130 <Class HashSet>
			//  393  719:dup             
			//  394  720:iconst_1        
			//  395  721:invokespecial   #131 <Method void HashSet(int)>
			//  396  724:astore          4
					hashset1.add(((Object) (new Index("index_WorkSpec_schedule_requested_at", false, Arrays.asList(((Object []) (new String[] {
						"schedule_requested_at"
					})))))));
			//  397  726:aload           4
			//  398  728:new             #156 <Class android.arch.persistence.room.util.TableInfo$Index>
			//  399  731:dup             
			//  400  732:ldc1            #227 <String "index_WorkSpec_schedule_requested_at">
			//  401  734:iconst_0        
			//  402  735:iconst_1        
			//  403  736:anewarray       String[]
			//  404  739:dup             
			//  405  740:iconst_0        
			//  406  741:ldc1            #209 <String "schedule_requested_at">
			//  407  743:aastore         
			//  408  744:invokestatic    #145 <Method List Arrays.asList(Object[])>
			//  409  747:invokespecial   #161 <Method void android.arch.persistence.room.util.TableInfo$Index(String, boolean, List)>
			//  410  750:invokevirtual   #154 <Method boolean HashSet.add(Object)>
			//  411  753:pop             
					obj1 = ((Object) (new TableInfo("WorkSpec", ((java.util.Map) (obj1)), ((java.util.Set) (obj2)), ((java.util.Set) (hashset1)))));
			//  412  754:new             #165 <Class TableInfo>
			//  413  757:dup             
			//  414  758:ldc1            #135 <String "WorkSpec">
			//  415  760:aload_2         
			//  416  761:aload_3         
			//  417  762:aload           4
			//  418  764:invokespecial   #170 <Method void TableInfo(String, java.util.Map, java.util.Set, java.util.Set)>
			//  419  767:astore_2        
					obj2 = ((Object) (TableInfo.read(supportsqlitedatabase, "WorkSpec")));
			//  420  768:aload_1         
			//  421  769:ldc1            #135 <String "WorkSpec">
			//  422  771:invokestatic    #174 <Method TableInfo TableInfo.read(SupportSQLiteDatabase, String)>
			//  423  774:astore_3        
					if(((TableInfo) (obj1)).equals(obj2))
			//* 424  775:aload_2         
			//* 425  776:aload_3         
			//* 426  777:invokevirtual   #177 <Method boolean TableInfo.equals(Object)>
			//* 427  780:ifeq            1396
					{
						obj1 = ((Object) (new HashMap(2)));
			//  428  783:new             #112 <Class HashMap>
			//  429  786:dup             
			//  430  787:iconst_2        
			//  431  788:invokespecial   #113 <Method void HashMap(int)>
			//  432  791:astore_2        
						((HashMap) (obj1)).put("tag", ((Object) (new Column("tag", "TEXT", true, 1))));
			//  433  792:aload_2         
			//  434  793:ldc1            #229 <String "tag">
			//  435  795:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  436  798:dup             
			//  437  799:ldc1            #229 <String "tag">
			//  438  801:ldc1            #119 <String "TEXT">
			//  439  803:iconst_1        
			//  440  804:iconst_1        
			//  441  805:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  442  808:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  443  811:pop             
						((HashMap) (obj1)).put("work_spec_id", ((Object) (new Column("work_spec_id", "TEXT", true, 2))));
			//  444  812:aload_2         
			//  445  813:ldc1            #115 <String "work_spec_id">
			//  446  815:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  447  818:dup             
			//  448  819:ldc1            #115 <String "work_spec_id">
			//  449  821:ldc1            #119 <String "TEXT">
			//  450  823:iconst_1        
			//  451  824:iconst_2        
			//  452  825:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  453  828:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  454  831:pop             
						obj2 = ((Object) (new HashSet(1)));
			//  455  832:new             #130 <Class HashSet>
			//  456  835:dup             
			//  457  836:iconst_1        
			//  458  837:invokespecial   #131 <Method void HashSet(int)>
			//  459  840:astore_3        
						((HashSet) (obj2)).add(((Object) (new ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(((Object []) (new String[] {
							"work_spec_id"
						}))), Arrays.asList(((Object []) (new String[] {
							"id"
						})))))));
			//  460  841:aload_3         
			//  461  842:new             #133 <Class android.arch.persistence.room.util.TableInfo$ForeignKey>
			//  462  845:dup             
			//  463  846:ldc1            #135 <String "WorkSpec">
			//  464  848:ldc1            #137 <String "CASCADE">
			//  465  850:ldc1            #137 <String "CASCADE">
			//  466  852:iconst_1        
			//  467  853:anewarray       String[]
			//  468  856:dup             
			//  469  857:iconst_0        
			//  470  858:ldc1            #115 <String "work_spec_id">
			//  471  860:aastore         
			//  472  861:invokestatic    #145 <Method List Arrays.asList(Object[])>
			//  473  864:iconst_1        
			//  474  865:anewarray       String[]
			//  475  868:dup             
			//  476  869:iconst_0        
			//  477  870:ldc1            #147 <String "id">
			//  478  872:aastore         
			//  479  873:invokestatic    #145 <Method List Arrays.asList(Object[])>
			//  480  876:invokespecial   #150 <Method void android.arch.persistence.room.util.TableInfo$ForeignKey(String, String, String, List, List)>
			//  481  879:invokevirtual   #154 <Method boolean HashSet.add(Object)>
			//  482  882:pop             
						HashSet hashset2 = new HashSet(1);
			//  483  883:new             #130 <Class HashSet>
			//  484  886:dup             
			//  485  887:iconst_1        
			//  486  888:invokespecial   #131 <Method void HashSet(int)>
			//  487  891:astore          4
						hashset2.add(((Object) (new Index("index_WorkTag_work_spec_id", false, Arrays.asList(((Object []) (new String[] {
							"work_spec_id"
						})))))));
			//  488  893:aload           4
			//  489  895:new             #156 <Class android.arch.persistence.room.util.TableInfo$Index>
			//  490  898:dup             
			//  491  899:ldc1            #231 <String "index_WorkTag_work_spec_id">
			//  492  901:iconst_0        
			//  493  902:iconst_1        
			//  494  903:anewarray       String[]
			//  495  906:dup             
			//  496  907:iconst_0        
			//  497  908:ldc1            #115 <String "work_spec_id">
			//  498  910:aastore         
			//  499  911:invokestatic    #145 <Method List Arrays.asList(Object[])>
			//  500  914:invokespecial   #161 <Method void android.arch.persistence.room.util.TableInfo$Index(String, boolean, List)>
			//  501  917:invokevirtual   #154 <Method boolean HashSet.add(Object)>
			//  502  920:pop             
						obj1 = ((Object) (new TableInfo("WorkTag", ((java.util.Map) (obj1)), ((java.util.Set) (obj2)), ((java.util.Set) (hashset2)))));
			//  503  921:new             #165 <Class TableInfo>
			//  504  924:dup             
			//  505  925:ldc1            #233 <String "WorkTag">
			//  506  927:aload_2         
			//  507  928:aload_3         
			//  508  929:aload           4
			//  509  931:invokespecial   #170 <Method void TableInfo(String, java.util.Map, java.util.Set, java.util.Set)>
			//  510  934:astore_2        
						obj2 = ((Object) (TableInfo.read(supportsqlitedatabase, "WorkTag")));
			//  511  935:aload_1         
			//  512  936:ldc1            #233 <String "WorkTag">
			//  513  938:invokestatic    #174 <Method TableInfo TableInfo.read(SupportSQLiteDatabase, String)>
			//  514  941:astore_3        
						if(((TableInfo) (obj1)).equals(obj2))
			//* 515  942:aload_2         
			//* 516  943:aload_3         
			//* 517  944:invokevirtual   #177 <Method boolean TableInfo.equals(Object)>
			//* 518  947:ifeq            1348
						{
							obj1 = ((Object) (new HashMap(2)));
			//  519  950:new             #112 <Class HashMap>
			//  520  953:dup             
			//  521  954:iconst_2        
			//  522  955:invokespecial   #113 <Method void HashMap(int)>
			//  523  958:astore_2        
							((HashMap) (obj1)).put("work_spec_id", ((Object) (new Column("work_spec_id", "TEXT", true, 1))));
			//  524  959:aload_2         
			//  525  960:ldc1            #115 <String "work_spec_id">
			//  526  962:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  527  965:dup             
			//  528  966:ldc1            #115 <String "work_spec_id">
			//  529  968:ldc1            #119 <String "TEXT">
			//  530  970:iconst_1        
			//  531  971:iconst_1        
			//  532  972:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  533  975:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  534  978:pop             
							((HashMap) (obj1)).put("system_id", ((Object) (new Column("system_id", "INTEGER", true, 0))));
			//  535  979:aload_2         
			//  536  980:ldc1            #235 <String "system_id">
			//  537  982:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  538  985:dup             
			//  539  986:ldc1            #235 <String "system_id">
			//  540  988:ldc1            #181 <String "INTEGER">
			//  541  990:iconst_1        
			//  542  991:iconst_0        
			//  543  992:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  544  995:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  545  998:pop             
							obj2 = ((Object) (new HashSet(1)));
			//  546  999:new             #130 <Class HashSet>
			//  547 1002:dup             
			//  548 1003:iconst_1        
			//  549 1004:invokespecial   #131 <Method void HashSet(int)>
			//  550 1007:astore_3        
							((HashSet) (obj2)).add(((Object) (new ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(((Object []) (new String[] {
								"work_spec_id"
							}))), Arrays.asList(((Object []) (new String[] {
								"id"
							})))))));
			//  551 1008:aload_3         
			//  552 1009:new             #133 <Class android.arch.persistence.room.util.TableInfo$ForeignKey>
			//  553 1012:dup             
			//  554 1013:ldc1            #135 <String "WorkSpec">
			//  555 1015:ldc1            #137 <String "CASCADE">
			//  556 1017:ldc1            #137 <String "CASCADE">
			//  557 1019:iconst_1        
			//  558 1020:anewarray       String[]
			//  559 1023:dup             
			//  560 1024:iconst_0        
			//  561 1025:ldc1            #115 <String "work_spec_id">
			//  562 1027:aastore         
			//  563 1028:invokestatic    #145 <Method List Arrays.asList(Object[])>
			//  564 1031:iconst_1        
			//  565 1032:anewarray       String[]
			//  566 1035:dup             
			//  567 1036:iconst_0        
			//  568 1037:ldc1            #147 <String "id">
			//  569 1039:aastore         
			//  570 1040:invokestatic    #145 <Method List Arrays.asList(Object[])>
			//  571 1043:invokespecial   #150 <Method void android.arch.persistence.room.util.TableInfo$ForeignKey(String, String, String, List, List)>
			//  572 1046:invokevirtual   #154 <Method boolean HashSet.add(Object)>
			//  573 1049:pop             
							obj1 = ((Object) (new TableInfo("SystemIdInfo", ((java.util.Map) (obj1)), ((java.util.Set) (obj2)), ((java.util.Set) (new HashSet(0))))));
			//  574 1050:new             #165 <Class TableInfo>
			//  575 1053:dup             
			//  576 1054:ldc1            #237 <String "SystemIdInfo">
			//  577 1056:aload_2         
			//  578 1057:aload_3         
			//  579 1058:new             #130 <Class HashSet>
			//  580 1061:dup             
			//  581 1062:iconst_0        
			//  582 1063:invokespecial   #131 <Method void HashSet(int)>
			//  583 1066:invokespecial   #170 <Method void TableInfo(String, java.util.Map, java.util.Set, java.util.Set)>
			//  584 1069:astore_2        
							obj2 = ((Object) (TableInfo.read(supportsqlitedatabase, "SystemIdInfo")));
			//  585 1070:aload_1         
			//  586 1071:ldc1            #237 <String "SystemIdInfo">
			//  587 1073:invokestatic    #174 <Method TableInfo TableInfo.read(SupportSQLiteDatabase, String)>
			//  588 1076:astore_3        
							if(((TableInfo) (obj1)).equals(obj2))
			//* 589 1077:aload_2         
			//* 590 1078:aload_3         
			//* 591 1079:invokevirtual   #177 <Method boolean TableInfo.equals(Object)>
			//* 592 1082:ifeq            1300
							{
								obj1 = ((Object) (new HashMap(2)));
			//  593 1085:new             #112 <Class HashMap>
			//  594 1088:dup             
			//  595 1089:iconst_2        
			//  596 1090:invokespecial   #113 <Method void HashMap(int)>
			//  597 1093:astore_2        
								((HashMap) (obj1)).put("name", ((Object) (new Column("name", "TEXT", true, 1))));
			//  598 1094:aload_2         
			//  599 1095:ldc1            #239 <String "name">
			//  600 1097:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  601 1100:dup             
			//  602 1101:ldc1            #239 <String "name">
			//  603 1103:ldc1            #119 <String "TEXT">
			//  604 1105:iconst_1        
			//  605 1106:iconst_1        
			//  606 1107:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  607 1110:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  608 1113:pop             
								((HashMap) (obj1)).put("work_spec_id", ((Object) (new Column("work_spec_id", "TEXT", true, 2))));
			//  609 1114:aload_2         
			//  610 1115:ldc1            #115 <String "work_spec_id">
			//  611 1117:new             #117 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  612 1120:dup             
			//  613 1121:ldc1            #115 <String "work_spec_id">
			//  614 1123:ldc1            #119 <String "TEXT">
			//  615 1125:iconst_1        
			//  616 1126:iconst_2        
			//  617 1127:invokespecial   #122 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  618 1130:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
			//  619 1133:pop             
								obj2 = ((Object) (new HashSet(1)));
			//  620 1134:new             #130 <Class HashSet>
			//  621 1137:dup             
			//  622 1138:iconst_1        
			//  623 1139:invokespecial   #131 <Method void HashSet(int)>
			//  624 1142:astore_3        
								((HashSet) (obj2)).add(((Object) (new ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(((Object []) (new String[] {
									"work_spec_id"
								}))), Arrays.asList(((Object []) (new String[] {
									"id"
								})))))));
			//  625 1143:aload_3         
			//  626 1144:new             #133 <Class android.arch.persistence.room.util.TableInfo$ForeignKey>
			//  627 1147:dup             
			//  628 1148:ldc1            #135 <String "WorkSpec">
			//  629 1150:ldc1            #137 <String "CASCADE">
			//  630 1152:ldc1            #137 <String "CASCADE">
			//  631 1154:iconst_1        
			//  632 1155:anewarray       String[]
			//  633 1158:dup             
			//  634 1159:iconst_0        
			//  635 1160:ldc1            #115 <String "work_spec_id">
			//  636 1162:aastore         
			//  637 1163:invokestatic    #145 <Method List Arrays.asList(Object[])>
			//  638 1166:iconst_1        
			//  639 1167:anewarray       String[]
			//  640 1170:dup             
			//  641 1171:iconst_0        
			//  642 1172:ldc1            #147 <String "id">
			//  643 1174:aastore         
			//  644 1175:invokestatic    #145 <Method List Arrays.asList(Object[])>
			//  645 1178:invokespecial   #150 <Method void android.arch.persistence.room.util.TableInfo$ForeignKey(String, String, String, List, List)>
			//  646 1181:invokevirtual   #154 <Method boolean HashSet.add(Object)>
			//  647 1184:pop             
								HashSet hashset3 = new HashSet(1);
			//  648 1185:new             #130 <Class HashSet>
			//  649 1188:dup             
			//  650 1189:iconst_1        
			//  651 1190:invokespecial   #131 <Method void HashSet(int)>
			//  652 1193:astore          4
								hashset3.add(((Object) (new Index("index_WorkName_work_spec_id", false, Arrays.asList(((Object []) (new String[] {
									"work_spec_id"
								})))))));
			//  653 1195:aload           4
			//  654 1197:new             #156 <Class android.arch.persistence.room.util.TableInfo$Index>
			//  655 1200:dup             
			//  656 1201:ldc1            #241 <String "index_WorkName_work_spec_id">
			//  657 1203:iconst_0        
			//  658 1204:iconst_1        
			//  659 1205:anewarray       String[]
			//  660 1208:dup             
			//  661 1209:iconst_0        
			//  662 1210:ldc1            #115 <String "work_spec_id">
			//  663 1212:aastore         
			//  664 1213:invokestatic    #145 <Method List Arrays.asList(Object[])>
			//  665 1216:invokespecial   #161 <Method void android.arch.persistence.room.util.TableInfo$Index(String, boolean, List)>
			//  666 1219:invokevirtual   #154 <Method boolean HashSet.add(Object)>
			//  667 1222:pop             
								obj1 = ((Object) (new TableInfo("WorkName", ((java.util.Map) (obj1)), ((java.util.Set) (obj2)), ((java.util.Set) (hashset3)))));
			//  668 1223:new             #165 <Class TableInfo>
			//  669 1226:dup             
			//  670 1227:ldc1            #243 <String "WorkName">
			//  671 1229:aload_2         
			//  672 1230:aload_3         
			//  673 1231:aload           4
			//  674 1233:invokespecial   #170 <Method void TableInfo(String, java.util.Map, java.util.Set, java.util.Set)>
			//  675 1236:astore_2        
								supportsqlitedatabase = ((SupportSQLiteDatabase) (TableInfo.read(supportsqlitedatabase, "WorkName")));
			//  676 1237:aload_1         
			//  677 1238:ldc1            #243 <String "WorkName">
			//  678 1240:invokestatic    #174 <Method TableInfo TableInfo.read(SupportSQLiteDatabase, String)>
			//  679 1243:astore_1        
								if(((TableInfo) (obj1)).equals(((Object) (supportsqlitedatabase))))
			//* 680 1244:aload_2         
			//* 681 1245:aload_1         
			//* 682 1246:invokevirtual   #177 <Method boolean TableInfo.equals(Object)>
			//* 683 1249:ifeq            1253
								{
									return;
			//  684 1252:return          
								} else
								{
									obj2 = ((Object) (new StringBuilder()));
			//  685 1253:new             #245 <Class StringBuilder>
			//  686 1256:dup             
			//  687 1257:invokespecial   #248 <Method void StringBuilder()>
			//  688 1260:astore_3        
									((StringBuilder) (obj2)).append("Migration didn't properly handle WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
			//  689 1261:aload_3         
			//  690 1262:ldc1            #250 <String "Migration didn't properly handle WorkName(androidx.work.impl.model.WorkName).\n Expected:\n">
			//  691 1264:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
			//  692 1267:pop             
									((StringBuilder) (obj2)).append(obj1);
			//  693 1268:aload_3         
			//  694 1269:aload_2         
			//  695 1270:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
			//  696 1273:pop             
									((StringBuilder) (obj2)).append("\n Found:\n");
			//  697 1274:aload_3         
			//  698 1275:ldc2            #259 <String "\n Found:\n">
			//  699 1278:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
			//  700 1281:pop             
									((StringBuilder) (obj2)).append(((Object) (supportsqlitedatabase)));
			//  701 1282:aload_3         
			//  702 1283:aload_1         
			//  703 1284:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
			//  704 1287:pop             
									throw new IllegalStateException(((StringBuilder) (obj2)).toString());
			//  705 1288:new             #261 <Class IllegalStateException>
			//  706 1291:dup             
			//  707 1292:aload_3         
			//  708 1293:invokevirtual   #265 <Method String StringBuilder.toString()>
			//  709 1296:invokespecial   #267 <Method void IllegalStateException(String)>
			//  710 1299:athrow          
								}
							} else
							{
								supportsqlitedatabase = ((SupportSQLiteDatabase) (new StringBuilder()));
			//  711 1300:new             #245 <Class StringBuilder>
			//  712 1303:dup             
			//  713 1304:invokespecial   #248 <Method void StringBuilder()>
			//  714 1307:astore_1        
								((StringBuilder) (supportsqlitedatabase)).append("Migration didn't properly handle SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
			//  715 1308:aload_1         
			//  716 1309:ldc2            #269 <String "Migration didn't properly handle SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n">
			//  717 1312:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
			//  718 1315:pop             
								((StringBuilder) (supportsqlitedatabase)).append(obj1);
			//  719 1316:aload_1         
			//  720 1317:aload_2         
			//  721 1318:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
			//  722 1321:pop             
								((StringBuilder) (supportsqlitedatabase)).append("\n Found:\n");
			//  723 1322:aload_1         
			//  724 1323:ldc2            #259 <String "\n Found:\n">
			//  725 1326:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
			//  726 1329:pop             
								((StringBuilder) (supportsqlitedatabase)).append(obj2);
			//  727 1330:aload_1         
			//  728 1331:aload_3         
			//  729 1332:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
			//  730 1335:pop             
								throw new IllegalStateException(((StringBuilder) (supportsqlitedatabase)).toString());
			//  731 1336:new             #261 <Class IllegalStateException>
			//  732 1339:dup             
			//  733 1340:aload_1         
			//  734 1341:invokevirtual   #265 <Method String StringBuilder.toString()>
			//  735 1344:invokespecial   #267 <Method void IllegalStateException(String)>
			//  736 1347:athrow          
							}
						} else
						{
							supportsqlitedatabase = ((SupportSQLiteDatabase) (new StringBuilder()));
			//  737 1348:new             #245 <Class StringBuilder>
			//  738 1351:dup             
			//  739 1352:invokespecial   #248 <Method void StringBuilder()>
			//  740 1355:astore_1        
							((StringBuilder) (supportsqlitedatabase)).append("Migration didn't properly handle WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
			//  741 1356:aload_1         
			//  742 1357:ldc2            #271 <String "Migration didn't properly handle WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n">
			//  743 1360:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
			//  744 1363:pop             
							((StringBuilder) (supportsqlitedatabase)).append(obj1);
			//  745 1364:aload_1         
			//  746 1365:aload_2         
			//  747 1366:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
			//  748 1369:pop             
							((StringBuilder) (supportsqlitedatabase)).append("\n Found:\n");
			//  749 1370:aload_1         
			//  750 1371:ldc2            #259 <String "\n Found:\n">
			//  751 1374:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
			//  752 1377:pop             
							((StringBuilder) (supportsqlitedatabase)).append(obj2);
			//  753 1378:aload_1         
			//  754 1379:aload_3         
			//  755 1380:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
			//  756 1383:pop             
							throw new IllegalStateException(((StringBuilder) (supportsqlitedatabase)).toString());
			//  757 1384:new             #261 <Class IllegalStateException>
			//  758 1387:dup             
			//  759 1388:aload_1         
			//  760 1389:invokevirtual   #265 <Method String StringBuilder.toString()>
			//  761 1392:invokespecial   #267 <Method void IllegalStateException(String)>
			//  762 1395:athrow          
						}
					} else
					{
						supportsqlitedatabase = ((SupportSQLiteDatabase) (new StringBuilder()));
			//  763 1396:new             #245 <Class StringBuilder>
			//  764 1399:dup             
			//  765 1400:invokespecial   #248 <Method void StringBuilder()>
			//  766 1403:astore_1        
						((StringBuilder) (supportsqlitedatabase)).append("Migration didn't properly handle WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
			//  767 1404:aload_1         
			//  768 1405:ldc2            #273 <String "Migration didn't properly handle WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n">
			//  769 1408:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
			//  770 1411:pop             
						((StringBuilder) (supportsqlitedatabase)).append(obj1);
			//  771 1412:aload_1         
			//  772 1413:aload_2         
			//  773 1414:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
			//  774 1417:pop             
						((StringBuilder) (supportsqlitedatabase)).append("\n Found:\n");
			//  775 1418:aload_1         
			//  776 1419:ldc2            #259 <String "\n Found:\n">
			//  777 1422:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
			//  778 1425:pop             
						((StringBuilder) (supportsqlitedatabase)).append(obj2);
			//  779 1426:aload_1         
			//  780 1427:aload_3         
			//  781 1428:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
			//  782 1431:pop             
						throw new IllegalStateException(((StringBuilder) (supportsqlitedatabase)).toString());
			//  783 1432:new             #261 <Class IllegalStateException>
			//  784 1435:dup             
			//  785 1436:aload_1         
			//  786 1437:invokevirtual   #265 <Method String StringBuilder.toString()>
			//  787 1440:invokespecial   #267 <Method void IllegalStateException(String)>
			//  788 1443:athrow          
					}
				} else
				{
					supportsqlitedatabase = ((SupportSQLiteDatabase) (new StringBuilder()));
			//  789 1444:new             #245 <Class StringBuilder>
			//  790 1447:dup             
			//  791 1448:invokespecial   #248 <Method void StringBuilder()>
			//  792 1451:astore_1        
					((StringBuilder) (supportsqlitedatabase)).append("Migration didn't properly handle Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
			//  793 1452:aload_1         
			//  794 1453:ldc2            #275 <String "Migration didn't properly handle Dependency(androidx.work.impl.model.Dependency).\n Expected:\n">
			//  795 1456:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
			//  796 1459:pop             
					((StringBuilder) (supportsqlitedatabase)).append(obj1);
			//  797 1460:aload_1         
			//  798 1461:aload_2         
			//  799 1462:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
			//  800 1465:pop             
					((StringBuilder) (supportsqlitedatabase)).append("\n Found:\n");
			//  801 1466:aload_1         
			//  802 1467:ldc2            #259 <String "\n Found:\n">
			//  803 1470:invokevirtual   #254 <Method StringBuilder StringBuilder.append(String)>
			//  804 1473:pop             
					((StringBuilder) (supportsqlitedatabase)).append(obj2);
			//  805 1474:aload_1         
			//  806 1475:aload_3         
			//  807 1476:invokevirtual   #257 <Method StringBuilder StringBuilder.append(Object)>
			//  808 1479:pop             
					throw new IllegalStateException(((StringBuilder) (supportsqlitedatabase)).toString());
			//  809 1480:new             #261 <Class IllegalStateException>
			//  810 1483:dup             
			//  811 1484:aload_1         
			//  812 1485:invokevirtual   #265 <Method String StringBuilder.toString()>
			//  813 1488:invokespecial   #267 <Method void IllegalStateException(String)>
			//  814 1491:athrow          
				}
			}

			final WorkDatabase_Impl this$0;

			
			{
				this$0 = WorkDatabase_Impl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field WorkDatabase_Impl this$0>
				super(i);
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:invokespecial   #18  <Method void android.arch.persistence.room.RoomOpenHelper$Delegate(int)>
			//    6   10:return          
			}
		}
)), "c84d23ade98552f1cec71088c1f0794c", "1db8206f0da6aa81bbdd2d99a82d9e14")));
	//    0    0:new             #135 <Class RoomOpenHelper>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:new             #6   <Class WorkDatabase_Impl$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:iconst_5        
	//    7   11:invokespecial   #138 <Method void WorkDatabase_Impl$1(WorkDatabase_Impl, int)>
	//    8   14:ldc1            #140 <String "c84d23ade98552f1cec71088c1f0794c">
	//    9   16:ldc1            #142 <String "1db8206f0da6aa81bbdd2d99a82d9e14">
	//   10   18:invokespecial   #145 <Method void RoomOpenHelper(DatabaseConfiguration, android.arch.persistence.room.RoomOpenHelper$Delegate, String, String)>
	//   11   21:astore_2        
		obj = ((Object) (android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration.builder(databaseconfiguration.context).name(databaseconfiguration.name).callback(((android.arch.persistence.db.SupportSQLiteOpenHelper.Callback) (obj))).build()));
	//   12   22:aload_1         
	//   13   23:getfield        #151 <Field android.content.Context DatabaseConfiguration.context>
	//   14   26:invokestatic    #157 <Method android.arch.persistence.db.SupportSQLiteOpenHelper$Configuration$Builder android.arch.persistence.db.SupportSQLiteOpenHelper$Configuration.builder(android.content.Context)>
	//   15   29:aload_1         
	//   16   30:getfield        #161 <Field String DatabaseConfiguration.name>
	//   17   33:invokevirtual   #166 <Method android.arch.persistence.db.SupportSQLiteOpenHelper$Configuration$Builder android.arch.persistence.db.SupportSQLiteOpenHelper$Configuration$Builder.name(String)>
	//   18   36:aload_2         
	//   19   37:invokevirtual   #170 <Method android.arch.persistence.db.SupportSQLiteOpenHelper$Configuration$Builder android.arch.persistence.db.SupportSQLiteOpenHelper$Configuration$Builder.callback(android.arch.persistence.db.SupportSQLiteOpenHelper$Callback)>
	//   20   40:invokevirtual   #174 <Method android.arch.persistence.db.SupportSQLiteOpenHelper$Configuration android.arch.persistence.db.SupportSQLiteOpenHelper$Configuration$Builder.build()>
	//   21   43:astore_2        
		return databaseconfiguration.sqliteOpenHelperFactory.create(((android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration) (obj)));
	//   22   44:aload_1         
	//   23   45:getfield        #178 <Field android.arch.persistence.db.SupportSQLiteOpenHelper$Factory DatabaseConfiguration.sqliteOpenHelperFactory>
	//   24   48:aload_2         
	//   25   49:invokeinterface #184 <Method SupportSQLiteOpenHelper android.arch.persistence.db.SupportSQLiteOpenHelper$Factory.create(android.arch.persistence.db.SupportSQLiteOpenHelper$Configuration)>
	//   26   54:areturn         
	}

	public DependencyDao dependencyDao()
	{
		if(_dependencyDao != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #188 <Field DependencyDao _dependencyDao>
	//*   2    4:ifnull          12
			return _dependencyDao;
	//    3    7:aload_0         
	//    4    8:getfield        #188 <Field DependencyDao _dependencyDao>
	//    5   11:areturn         
		this;
	//    6   12:aload_0         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		DependencyDao dependencydao;
		if(_dependencyDao == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #188 <Field DependencyDao _dependencyDao>
	//*  10   18:ifnonnull       33
			_dependencyDao = ((DependencyDao) (new DependencyDao_Impl(((android.arch.persistence.room.RoomDatabase) (this)))));
	//   11   21:aload_0         
	//   12   22:new             #190 <Class DependencyDao_Impl>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #193 <Method void DependencyDao_Impl(android.arch.persistence.room.RoomDatabase)>
	//   16   30:putfield        #188 <Field DependencyDao _dependencyDao>
		dependencydao = _dependencyDao;
	//   17   33:aload_0         
	//   18   34:getfield        #188 <Field DependencyDao _dependencyDao>
	//   19   37:astore_1        
		this;
	//   20   38:aload_0         
		JVM INSTR monitorexit ;
	//   21   39:monitorexit     
		return dependencydao;
	//   22   40:aload_1         
	//   23   41:areturn         
		Exception exception;
		exception;
	//   24   42:astore_1        
		this;
	//   25   43:aload_0         
		JVM INSTR monitorexit ;
	//   26   44:monitorexit     
		throw exception;
	//   27   45:aload_1         
	//   28   46:athrow          
	}

	public SystemIdInfoDao systemIdInfoDao()
	{
		if(_systemIdInfoDao != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #197 <Field SystemIdInfoDao _systemIdInfoDao>
	//*   2    4:ifnull          12
			return _systemIdInfoDao;
	//    3    7:aload_0         
	//    4    8:getfield        #197 <Field SystemIdInfoDao _systemIdInfoDao>
	//    5   11:areturn         
		this;
	//    6   12:aload_0         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		SystemIdInfoDao systemidinfodao;
		if(_systemIdInfoDao == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #197 <Field SystemIdInfoDao _systemIdInfoDao>
	//*  10   18:ifnonnull       33
			_systemIdInfoDao = ((SystemIdInfoDao) (new SystemIdInfoDao_Impl(((android.arch.persistence.room.RoomDatabase) (this)))));
	//   11   21:aload_0         
	//   12   22:new             #199 <Class SystemIdInfoDao_Impl>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #200 <Method void SystemIdInfoDao_Impl(android.arch.persistence.room.RoomDatabase)>
	//   16   30:putfield        #197 <Field SystemIdInfoDao _systemIdInfoDao>
		systemidinfodao = _systemIdInfoDao;
	//   17   33:aload_0         
	//   18   34:getfield        #197 <Field SystemIdInfoDao _systemIdInfoDao>
	//   19   37:astore_1        
		this;
	//   20   38:aload_0         
		JVM INSTR monitorexit ;
	//   21   39:monitorexit     
		return systemidinfodao;
	//   22   40:aload_1         
	//   23   41:areturn         
		Exception exception;
		exception;
	//   24   42:astore_1        
		this;
	//   25   43:aload_0         
		JVM INSTR monitorexit ;
	//   26   44:monitorexit     
		throw exception;
	//   27   45:aload_1         
	//   28   46:athrow          
	}

	public WorkNameDao workNameDao()
	{
		if(_workNameDao != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #204 <Field WorkNameDao _workNameDao>
	//*   2    4:ifnull          12
			return _workNameDao;
	//    3    7:aload_0         
	//    4    8:getfield        #204 <Field WorkNameDao _workNameDao>
	//    5   11:areturn         
		this;
	//    6   12:aload_0         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		WorkNameDao worknamedao;
		if(_workNameDao == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #204 <Field WorkNameDao _workNameDao>
	//*  10   18:ifnonnull       33
			_workNameDao = ((WorkNameDao) (new WorkNameDao_Impl(((android.arch.persistence.room.RoomDatabase) (this)))));
	//   11   21:aload_0         
	//   12   22:new             #206 <Class WorkNameDao_Impl>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #207 <Method void WorkNameDao_Impl(android.arch.persistence.room.RoomDatabase)>
	//   16   30:putfield        #204 <Field WorkNameDao _workNameDao>
		worknamedao = _workNameDao;
	//   17   33:aload_0         
	//   18   34:getfield        #204 <Field WorkNameDao _workNameDao>
	//   19   37:astore_1        
		this;
	//   20   38:aload_0         
		JVM INSTR monitorexit ;
	//   21   39:monitorexit     
		return worknamedao;
	//   22   40:aload_1         
	//   23   41:areturn         
		Exception exception;
		exception;
	//   24   42:astore_1        
		this;
	//   25   43:aload_0         
		JVM INSTR monitorexit ;
	//   26   44:monitorexit     
		throw exception;
	//   27   45:aload_1         
	//   28   46:athrow          
	}

	public WorkSpecDao workSpecDao()
	{
		if(_workSpecDao != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #211 <Field WorkSpecDao _workSpecDao>
	//*   2    4:ifnull          12
			return _workSpecDao;
	//    3    7:aload_0         
	//    4    8:getfield        #211 <Field WorkSpecDao _workSpecDao>
	//    5   11:areturn         
		this;
	//    6   12:aload_0         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		WorkSpecDao workspecdao;
		if(_workSpecDao == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #211 <Field WorkSpecDao _workSpecDao>
	//*  10   18:ifnonnull       33
			_workSpecDao = ((WorkSpecDao) (new WorkSpecDao_Impl(((android.arch.persistence.room.RoomDatabase) (this)))));
	//   11   21:aload_0         
	//   12   22:new             #213 <Class WorkSpecDao_Impl>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #214 <Method void WorkSpecDao_Impl(android.arch.persistence.room.RoomDatabase)>
	//   16   30:putfield        #211 <Field WorkSpecDao _workSpecDao>
		workspecdao = _workSpecDao;
	//   17   33:aload_0         
	//   18   34:getfield        #211 <Field WorkSpecDao _workSpecDao>
	//   19   37:astore_1        
		this;
	//   20   38:aload_0         
		JVM INSTR monitorexit ;
	//   21   39:monitorexit     
		return workspecdao;
	//   22   40:aload_1         
	//   23   41:areturn         
		Exception exception;
		exception;
	//   24   42:astore_1        
		this;
	//   25   43:aload_0         
		JVM INSTR monitorexit ;
	//   26   44:monitorexit     
		throw exception;
	//   27   45:aload_1         
	//   28   46:athrow          
	}

	public WorkTagDao workTagDao()
	{
		if(_workTagDao != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #218 <Field WorkTagDao _workTagDao>
	//*   2    4:ifnull          12
			return _workTagDao;
	//    3    7:aload_0         
	//    4    8:getfield        #218 <Field WorkTagDao _workTagDao>
	//    5   11:areturn         
		this;
	//    6   12:aload_0         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		WorkTagDao worktagdao;
		if(_workTagDao == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #218 <Field WorkTagDao _workTagDao>
	//*  10   18:ifnonnull       33
			_workTagDao = ((WorkTagDao) (new WorkTagDao_Impl(((android.arch.persistence.room.RoomDatabase) (this)))));
	//   11   21:aload_0         
	//   12   22:new             #220 <Class WorkTagDao_Impl>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #221 <Method void WorkTagDao_Impl(android.arch.persistence.room.RoomDatabase)>
	//   16   30:putfield        #218 <Field WorkTagDao _workTagDao>
		worktagdao = _workTagDao;
	//   17   33:aload_0         
	//   18   34:getfield        #218 <Field WorkTagDao _workTagDao>
	//   19   37:astore_1        
		this;
	//   20   38:aload_0         
		JVM INSTR monitorexit ;
	//   21   39:monitorexit     
		return worktagdao;
	//   22   40:aload_1         
	//   23   41:areturn         
		Exception exception;
		exception;
	//   24   42:astore_1        
		this;
	//   25   43:aload_0         
		JVM INSTR monitorexit ;
	//   26   44:monitorexit     
		throw exception;
	//   27   45:aload_1         
	//   28   46:athrow          
	}

	private volatile DependencyDao _dependencyDao;
	private volatile SystemIdInfoDao _systemIdInfoDao;
	private volatile WorkNameDao _workNameDao;
	private volatile WorkSpecDao _workSpecDao;
	private volatile WorkTagDao _workTagDao;


/*
	static List access$000(WorkDatabase_Impl workdatabase_impl)
	{
		return workdatabase_impl.mCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field List mCallbacks>
	//    2    4:areturn         
	}

*/


/*
	static List access$100(WorkDatabase_Impl workdatabase_impl)
	{
		return workdatabase_impl.mCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field List mCallbacks>
	//    2    4:areturn         
	}

*/


/*
	static List access$200(WorkDatabase_Impl workdatabase_impl)
	{
		return workdatabase_impl.mCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field List mCallbacks>
	//    2    4:areturn         
	}

*/


/*
	static SupportSQLiteDatabase access$302(WorkDatabase_Impl workdatabase_impl, SupportSQLiteDatabase supportsqlitedatabase)
	{
		workdatabase_impl.mDatabase = supportsqlitedatabase;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field SupportSQLiteDatabase mDatabase>
		return supportsqlitedatabase;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static void access$400(WorkDatabase_Impl workdatabase_impl, SupportSQLiteDatabase supportsqlitedatabase)
	{
		workdatabase_impl.internalInitInvalidationTracker(supportsqlitedatabase);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #41  <Method void internalInitInvalidationTracker(SupportSQLiteDatabase)>
		return;
	//    3    5:return          
	}

*/


/*
	static List access$500(WorkDatabase_Impl workdatabase_impl)
	{
		return workdatabase_impl.mCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field List mCallbacks>
	//    2    4:areturn         
	}

*/


/*
	static List access$600(WorkDatabase_Impl workdatabase_impl)
	{
		return workdatabase_impl.mCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field List mCallbacks>
	//    2    4:areturn         
	}

*/


/*
	static List access$700(WorkDatabase_Impl workdatabase_impl)
	{
		return workdatabase_impl.mCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field List mCallbacks>
	//    2    4:areturn         
	}

*/
}
