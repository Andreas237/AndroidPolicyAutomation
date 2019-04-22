// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.*;
import android.arch.persistence.room.util.TableInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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
import com.newrelic.agent.android.instrumentation.SQLiteInstrumentation;
import java.util.*;

// Referenced classes of package androidx.work.impl:
//			WorkDatabase

public class WorkDatabase_Impl extends WorkDatabase
{

	public WorkDatabase_Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void WorkDatabase()>
	//    2    4:return          
	}

	public void clearAllTables()
	{
		boolean flag;
		SupportSQLiteDatabase supportsqlitedatabase;
		super.assertNotMainThread();
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void WorkDatabase.assertNotMainThread()>
		supportsqlitedatabase = super.getOpenHelper().getWritableDatabase();
	//    2    4:aload_0         
	//    3    5:invokespecial   #53  <Method SupportSQLiteOpenHelper WorkDatabase.getOpenHelper()>
	//    4    8:invokeinterface #59  <Method SupportSQLiteDatabase SupportSQLiteOpenHelper.getWritableDatabase()>
	//    5   13:astore_2        
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   6   14:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
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
			break MISSING_BLOCK_LABEL_60;
	//   14   29:iload_1         
	//   15   30:ifne            60
		if(!(supportsqlitedatabase instanceof SQLiteDatabase))
	//*  16   33:aload_2         
	//*  17   34:instanceof      #67  <Class SQLiteDatabase>
	//*  18   37:ifne            51
		{
			supportsqlitedatabase.execSQL("PRAGMA foreign_keys = FALSE");
	//   19   40:aload_2         
	//   20   41:ldc1            #69  <String "PRAGMA foreign_keys = FALSE">
	//   21   43:invokeinterface #75  <Method void SupportSQLiteDatabase.execSQL(String)>
			break MISSING_BLOCK_LABEL_60;
	//   22   48:goto            60
		}
		SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "PRAGMA foreign_keys = FALSE");
	//   23   51:aload_2         
	//   24   52:checkcast       #67  <Class SQLiteDatabase>
	//   25   55:ldc1            #69  <String "PRAGMA foreign_keys = FALSE">
	//   26   57:invokestatic    #80  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
		super.beginTransaction();
	//   27   60:aload_0         
	//   28   61:invokespecial   #83  <Method void WorkDatabase.beginTransaction()>
		if(!flag)
			break MISSING_BLOCK_LABEL_95;
	//   29   64:iload_1         
	//   30   65:ifeq            95
		if(!(supportsqlitedatabase instanceof SQLiteDatabase))
	//*  31   68:aload_2         
	//*  32   69:instanceof      #67  <Class SQLiteDatabase>
	//*  33   72:ifne            86
		{
			supportsqlitedatabase.execSQL("PRAGMA defer_foreign_keys = TRUE");
	//   34   75:aload_2         
	//   35   76:ldc1            #85  <String "PRAGMA defer_foreign_keys = TRUE">
	//   36   78:invokeinterface #75  <Method void SupportSQLiteDatabase.execSQL(String)>
			break MISSING_BLOCK_LABEL_95;
	//   37   83:goto            95
		}
		SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "PRAGMA defer_foreign_keys = TRUE");
	//   38   86:aload_2         
	//   39   87:checkcast       #67  <Class SQLiteDatabase>
	//   40   90:ldc1            #85  <String "PRAGMA defer_foreign_keys = TRUE">
	//   41   92:invokestatic    #80  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
		if(!(supportsqlitedatabase instanceof SQLiteDatabase))
	//*  42   95:aload_2         
	//*  43   96:instanceof      #67  <Class SQLiteDatabase>
	//*  44   99:ifne            113
		{
			supportsqlitedatabase.execSQL("DELETE FROM `Dependency`");
	//   45  102:aload_2         
	//   46  103:ldc1            #87  <String "DELETE FROM `Dependency`">
	//   47  105:invokeinterface #75  <Method void SupportSQLiteDatabase.execSQL(String)>
			break MISSING_BLOCK_LABEL_122;
	//   48  110:goto            122
		}
		SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "DELETE FROM `Dependency`");
	//   49  113:aload_2         
	//   50  114:checkcast       #67  <Class SQLiteDatabase>
	//   51  117:ldc1            #87  <String "DELETE FROM `Dependency`">
	//   52  119:invokestatic    #80  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
		if(!(supportsqlitedatabase instanceof SQLiteDatabase))
	//*  53  122:aload_2         
	//*  54  123:instanceof      #67  <Class SQLiteDatabase>
	//*  55  126:ifne            140
		{
			supportsqlitedatabase.execSQL("DELETE FROM `WorkSpec`");
	//   56  129:aload_2         
	//   57  130:ldc1            #89  <String "DELETE FROM `WorkSpec`">
	//   58  132:invokeinterface #75  <Method void SupportSQLiteDatabase.execSQL(String)>
			break MISSING_BLOCK_LABEL_149;
	//   59  137:goto            149
		}
		SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "DELETE FROM `WorkSpec`");
	//   60  140:aload_2         
	//   61  141:checkcast       #67  <Class SQLiteDatabase>
	//   62  144:ldc1            #89  <String "DELETE FROM `WorkSpec`">
	//   63  146:invokestatic    #80  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
		if(!(supportsqlitedatabase instanceof SQLiteDatabase))
	//*  64  149:aload_2         
	//*  65  150:instanceof      #67  <Class SQLiteDatabase>
	//*  66  153:ifne            167
		{
			supportsqlitedatabase.execSQL("DELETE FROM `WorkTag`");
	//   67  156:aload_2         
	//   68  157:ldc1            #91  <String "DELETE FROM `WorkTag`">
	//   69  159:invokeinterface #75  <Method void SupportSQLiteDatabase.execSQL(String)>
			break MISSING_BLOCK_LABEL_176;
	//   70  164:goto            176
		}
		SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "DELETE FROM `WorkTag`");
	//   71  167:aload_2         
	//   72  168:checkcast       #67  <Class SQLiteDatabase>
	//   73  171:ldc1            #91  <String "DELETE FROM `WorkTag`">
	//   74  173:invokestatic    #80  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
		if(!(supportsqlitedatabase instanceof SQLiteDatabase))
	//*  75  176:aload_2         
	//*  76  177:instanceof      #67  <Class SQLiteDatabase>
	//*  77  180:ifne            194
		{
			supportsqlitedatabase.execSQL("DELETE FROM `SystemIdInfo`");
	//   78  183:aload_2         
	//   79  184:ldc1            #93  <String "DELETE FROM `SystemIdInfo`">
	//   80  186:invokeinterface #75  <Method void SupportSQLiteDatabase.execSQL(String)>
			break MISSING_BLOCK_LABEL_203;
	//   81  191:goto            203
		}
		SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "DELETE FROM `SystemIdInfo`");
	//   82  194:aload_2         
	//   83  195:checkcast       #67  <Class SQLiteDatabase>
	//   84  198:ldc1            #93  <String "DELETE FROM `SystemIdInfo`">
	//   85  200:invokestatic    #80  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
		if(!(supportsqlitedatabase instanceof SQLiteDatabase))
	//*  86  203:aload_2         
	//*  87  204:instanceof      #67  <Class SQLiteDatabase>
	//*  88  207:ifne            221
		{
			supportsqlitedatabase.execSQL("DELETE FROM `WorkName`");
	//   89  210:aload_2         
	//   90  211:ldc1            #95  <String "DELETE FROM `WorkName`">
	//   91  213:invokeinterface #75  <Method void SupportSQLiteDatabase.execSQL(String)>
			break MISSING_BLOCK_LABEL_230;
	//   92  218:goto            230
		}
		SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "DELETE FROM `WorkName`");
	//   93  221:aload_2         
	//   94  222:checkcast       #67  <Class SQLiteDatabase>
	//   95  225:ldc1            #95  <String "DELETE FROM `WorkName`">
	//   96  227:invokestatic    #80  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
		super.setTransactionSuccessful();
	//   97  230:aload_0         
	//   98  231:invokespecial   #98  <Method void WorkDatabase.setTransactionSuccessful()>
		super.endTransaction();
	//   99  234:aload_0         
	//  100  235:invokespecial   #101 <Method void WorkDatabase.endTransaction()>
		if(!flag)
	//* 101  238:iload_1         
	//* 102  239:ifne            269
			if(!(supportsqlitedatabase instanceof SQLiteDatabase))
	//* 103  242:aload_2         
	//* 104  243:instanceof      #67  <Class SQLiteDatabase>
	//* 105  246:ifne            260
				supportsqlitedatabase.execSQL("PRAGMA foreign_keys = TRUE");
	//  106  249:aload_2         
	//  107  250:ldc1            #103 <String "PRAGMA foreign_keys = TRUE">
	//  108  252:invokeinterface #75  <Method void SupportSQLiteDatabase.execSQL(String)>
			else
	//* 109  257:goto            269
				SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "PRAGMA foreign_keys = TRUE");
	//  110  260:aload_2         
	//  111  261:checkcast       #67  <Class SQLiteDatabase>
	//  112  264:ldc1            #103 <String "PRAGMA foreign_keys = TRUE">
	//  113  266:invokestatic    #80  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
		supportsqlitedatabase.query("PRAGMA wal_checkpoint(FULL)").close();
	//  114  269:aload_2         
	//  115  270:ldc1            #105 <String "PRAGMA wal_checkpoint(FULL)">
	//  116  272:invokeinterface #109 <Method Cursor SupportSQLiteDatabase.query(String)>
	//  117  277:invokeinterface #114 <Method void Cursor.close()>
		if(!supportsqlitedatabase.inTransaction())
	//* 118  282:aload_2         
	//* 119  283:invokeinterface #118 <Method boolean SupportSQLiteDatabase.inTransaction()>
	//* 120  288:ifne            316
		{
			if(!(supportsqlitedatabase instanceof SQLiteDatabase))
	//* 121  291:aload_2         
	//* 122  292:instanceof      #67  <Class SQLiteDatabase>
	//* 123  295:ifne            307
			{
				supportsqlitedatabase.execSQL("VACUUM");
	//  124  298:aload_2         
	//  125  299:ldc1            #120 <String "VACUUM">
	//  126  301:invokeinterface #75  <Method void SupportSQLiteDatabase.execSQL(String)>
				return;
	//  127  306:return          
			}
			SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "VACUUM");
	//  128  307:aload_2         
	//  129  308:checkcast       #67  <Class SQLiteDatabase>
	//  130  311:ldc1            #120 <String "VACUUM">
	//  131  313:invokestatic    #80  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
		}
		return;
	//  132  316:return          
		Exception exception;
		exception;
	//  133  317:astore_3        
		super.endTransaction();
	//  134  318:aload_0         
	//  135  319:invokespecial   #101 <Method void WorkDatabase.endTransaction()>
		if(!flag)
	//* 136  322:iload_1         
	//* 137  323:ifne            353
			if(!(supportsqlitedatabase instanceof SQLiteDatabase))
	//* 138  326:aload_2         
	//* 139  327:instanceof      #67  <Class SQLiteDatabase>
	//* 140  330:ifne            344
				supportsqlitedatabase.execSQL("PRAGMA foreign_keys = TRUE");
	//  141  333:aload_2         
	//  142  334:ldc1            #103 <String "PRAGMA foreign_keys = TRUE">
	//  143  336:invokeinterface #75  <Method void SupportSQLiteDatabase.execSQL(String)>
			else
	//* 144  341:goto            353
				SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "PRAGMA foreign_keys = TRUE");
	//  145  344:aload_2         
	//  146  345:checkcast       #67  <Class SQLiteDatabase>
	//  147  348:ldc1            #103 <String "PRAGMA foreign_keys = TRUE">
	//  148  350:invokestatic    #80  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
		supportsqlitedatabase.query("PRAGMA wal_checkpoint(FULL)").close();
	//  149  353:aload_2         
	//  150  354:ldc1            #105 <String "PRAGMA wal_checkpoint(FULL)">
	//  151  356:invokeinterface #109 <Method Cursor SupportSQLiteDatabase.query(String)>
	//  152  361:invokeinterface #114 <Method void Cursor.close()>
		if(!supportsqlitedatabase.inTransaction())
	//* 153  366:aload_2         
	//* 154  367:invokeinterface #118 <Method boolean SupportSQLiteDatabase.inTransaction()>
	//* 155  372:ifne            402
			if(!(supportsqlitedatabase instanceof SQLiteDatabase))
	//* 156  375:aload_2         
	//* 157  376:instanceof      #67  <Class SQLiteDatabase>
	//* 158  379:ifne            393
				supportsqlitedatabase.execSQL("VACUUM");
	//  159  382:aload_2         
	//  160  383:ldc1            #120 <String "VACUUM">
	//  161  385:invokeinterface #75  <Method void SupportSQLiteDatabase.execSQL(String)>
			else
	//* 162  390:goto            402
				SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "VACUUM");
	//  163  393:aload_2         
	//  164  394:checkcast       #67  <Class SQLiteDatabase>
	//  165  397:ldc1            #120 <String "VACUUM">
	//  166  399:invokestatic    #80  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
		throw exception;
	//  167  402:aload_3         
	//  168  403:athrow          
	}

	protected InvalidationTracker createInvalidationTracker()
	{
		return new InvalidationTracker(((android.arch.persistence.room.RoomDatabase) (this)), new String[] {
			"Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName"
		});
	//    0    0:new             #124 <Class InvalidationTracker>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_5        
	//    4    6:anewarray       String[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:ldc1            #128 <String "Dependency">
	//    8   13:aastore         
	//    9   14:dup             
	//   10   15:iconst_1        
	//   11   16:ldc1            #130 <String "WorkSpec">
	//   12   18:aastore         
	//   13   19:dup             
	//   14   20:iconst_2        
	//   15   21:ldc1            #132 <String "WorkTag">
	//   16   23:aastore         
	//   17   24:dup             
	//   18   25:iconst_3        
	//   19   26:ldc1            #134 <String "SystemIdInfo">
	//   20   28:aastore         
	//   21   29:dup             
	//   22   30:iconst_4        
	//   23   31:ldc1            #136 <String "WorkName">
	//   24   33:aastore         
	//   25   34:invokespecial   #139 <Method void InvalidationTracker(android.arch.persistence.room.RoomDatabase, String[])>
	//   26   37:areturn         
	}

	protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseconfiguration)
	{
		Object obj = ((Object) (new RoomOpenHelper(databaseconfiguration, ((android.arch.persistence.room.RoomOpenHelper.Delegate) (new android.arch.persistence.room.RoomOpenHelper.Delegate(4) {

			public void createAllTables(SupportSQLiteDatabase supportsqlitedatabase)
			{
				boolean flag = supportsqlitedatabase instanceof SQLiteDatabase;
			//    0    0:aload_1         
			//    1    1:instanceof      #24  <Class SQLiteDatabase>
			//    2    4:istore_2        
				if(!flag)
			//*   3    5:iload_2         
			//*   4    6:ifne            20
					supportsqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
			//    5    9:aload_1         
			//    6   10:ldc1            #26  <String "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )">
			//    7   12:invokeinterface #32  <Method void SupportSQLiteDatabase.execSQL(String)>
				else
			//*   8   17:goto            29
					SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
			//    9   20:aload_1         
			//   10   21:checkcast       #24  <Class SQLiteDatabase>
			//   11   24:ldc1            #26  <String "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )">
			//   12   26:invokestatic    #37  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
				if(!flag)
			//*  13   29:iload_2         
			//*  14   30:ifne            44
					supportsqlitedatabase.execSQL("CREATE  INDEX `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
			//   15   33:aload_1         
			//   16   34:ldc1            #39  <String "CREATE  INDEX `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)">
			//   17   36:invokeinterface #32  <Method void SupportSQLiteDatabase.execSQL(String)>
				else
			//*  18   41:goto            53
					SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "CREATE  INDEX `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
			//   19   44:aload_1         
			//   20   45:checkcast       #24  <Class SQLiteDatabase>
			//   21   48:ldc1            #39  <String "CREATE  INDEX `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)">
			//   22   50:invokestatic    #37  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
				if(!flag)
			//*  23   53:iload_2         
			//*  24   54:ifne            68
					supportsqlitedatabase.execSQL("CREATE  INDEX `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
			//   25   57:aload_1         
			//   26   58:ldc1            #41  <String "CREATE  INDEX `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)">
			//   27   60:invokeinterface #32  <Method void SupportSQLiteDatabase.execSQL(String)>
				else
			//*  28   65:goto            77
					SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "CREATE  INDEX `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
			//   29   68:aload_1         
			//   30   69:checkcast       #24  <Class SQLiteDatabase>
			//   31   72:ldc1            #41  <String "CREATE  INDEX `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)">
			//   32   74:invokestatic    #37  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
				if(!flag)
			//*  33   77:iload_2         
			//*  34   78:ifne            92
					supportsqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
			//   35   81:aload_1         
			//   36   82:ldc1            #43  <String "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))">
			//   37   84:invokeinterface #32  <Method void SupportSQLiteDatabase.execSQL(String)>
				else
			//*  38   89:goto            101
					SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
			//   39   92:aload_1         
			//   40   93:checkcast       #24  <Class SQLiteDatabase>
			//   41   96:ldc1            #43  <String "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))">
			//   42   98:invokestatic    #37  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
				if(!flag)
			//*  43  101:iload_2         
			//*  44  102:ifne            116
					supportsqlitedatabase.execSQL("CREATE  INDEX `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
			//   45  105:aload_1         
			//   46  106:ldc1            #45  <String "CREATE  INDEX `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)">
			//   47  108:invokeinterface #32  <Method void SupportSQLiteDatabase.execSQL(String)>
				else
			//*  48  113:goto            125
					SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "CREATE  INDEX `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
			//   49  116:aload_1         
			//   50  117:checkcast       #24  <Class SQLiteDatabase>
			//   51  120:ldc1            #45  <String "CREATE  INDEX `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)">
			//   52  122:invokestatic    #37  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
				if(!flag)
			//*  53  125:iload_2         
			//*  54  126:ifne            140
					supportsqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
			//   55  129:aload_1         
			//   56  130:ldc1            #47  <String "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )">
			//   57  132:invokeinterface #32  <Method void SupportSQLiteDatabase.execSQL(String)>
				else
			//*  58  137:goto            149
					SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
			//   59  140:aload_1         
			//   60  141:checkcast       #24  <Class SQLiteDatabase>
			//   61  144:ldc1            #47  <String "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )">
			//   62  146:invokestatic    #37  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
				if(!flag)
			//*  63  149:iload_2         
			//*  64  150:ifne            164
					supportsqlitedatabase.execSQL("CREATE  INDEX `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
			//   65  153:aload_1         
			//   66  154:ldc1            #49  <String "CREATE  INDEX `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)">
			//   67  156:invokeinterface #32  <Method void SupportSQLiteDatabase.execSQL(String)>
				else
			//*  68  161:goto            173
					SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "CREATE  INDEX `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
			//   69  164:aload_1         
			//   70  165:checkcast       #24  <Class SQLiteDatabase>
			//   71  168:ldc1            #49  <String "CREATE  INDEX `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)">
			//   72  170:invokestatic    #37  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
				if(!flag)
			//*  73  173:iload_2         
			//*  74  174:ifne            188
					supportsqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
			//   75  177:aload_1         
			//   76  178:ldc1            #51  <String "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )">
			//   77  180:invokeinterface #32  <Method void SupportSQLiteDatabase.execSQL(String)>
				else
			//*  78  185:goto            197
					SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
			//   79  188:aload_1         
			//   80  189:checkcast       #24  <Class SQLiteDatabase>
			//   81  192:ldc1            #51  <String "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )">
			//   82  194:invokestatic    #37  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
				if(!flag)
			//*  83  197:iload_2         
			//*  84  198:ifne            212
					supportsqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
			//   85  201:aload_1         
			//   86  202:ldc1            #53  <String "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )">
			//   87  204:invokeinterface #32  <Method void SupportSQLiteDatabase.execSQL(String)>
				else
			//*  88  209:goto            221
					SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
			//   89  212:aload_1         
			//   90  213:checkcast       #24  <Class SQLiteDatabase>
			//   91  216:ldc1            #53  <String "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )">
			//   92  218:invokestatic    #37  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
				if(!flag)
			//*  93  221:iload_2         
			//*  94  222:ifne            236
					supportsqlitedatabase.execSQL("CREATE  INDEX `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
			//   95  225:aload_1         
			//   96  226:ldc1            #55  <String "CREATE  INDEX `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)">
			//   97  228:invokeinterface #32  <Method void SupportSQLiteDatabase.execSQL(String)>
				else
			//*  98  233:goto            245
					SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "CREATE  INDEX `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
			//   99  236:aload_1         
			//  100  237:checkcast       #24  <Class SQLiteDatabase>
			//  101  240:ldc1            #55  <String "CREATE  INDEX `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)">
			//  102  242:invokestatic    #37  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
				if(!flag)
			//* 103  245:iload_2         
			//* 104  246:ifne            260
					supportsqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
			//  105  249:aload_1         
			//  106  250:ldc1            #57  <String "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)">
			//  107  252:invokeinterface #32  <Method void SupportSQLiteDatabase.execSQL(String)>
				else
			//* 108  257:goto            269
					SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
			//  109  260:aload_1         
			//  110  261:checkcast       #24  <Class SQLiteDatabase>
			//  111  264:ldc1            #57  <String "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)">
			//  112  266:invokestatic    #37  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
				if(!flag)
			//* 113  269:iload_2         
			//* 114  270:ifne            282
				{
					supportsqlitedatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"c45e5fcbdf3824dead9778f19e2fd8af\")");
			//  115  273:aload_1         
			//  116  274:ldc1            #59  <String "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"c45e5fcbdf3824dead9778f19e2fd8af\")">
			//  117  276:invokeinterface #32  <Method void SupportSQLiteDatabase.execSQL(String)>
					return;
			//  118  281:return          
				} else
				{
					SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"c45e5fcbdf3824dead9778f19e2fd8af\")");
			//  119  282:aload_1         
			//  120  283:checkcast       #24  <Class SQLiteDatabase>
			//  121  286:ldc1            #59  <String "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"c45e5fcbdf3824dead9778f19e2fd8af\")">
			//  122  288:invokestatic    #37  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
					return;
			//  123  291:return          
				}
			}

			public void dropAllTables(SupportSQLiteDatabase supportsqlitedatabase)
			{
				boolean flag = supportsqlitedatabase instanceof SQLiteDatabase;
			//    0    0:aload_1         
			//    1    1:instanceof      #24  <Class SQLiteDatabase>
			//    2    4:istore_2        
				if(!flag)
			//*   3    5:iload_2         
			//*   4    6:ifne            20
					supportsqlitedatabase.execSQL("DROP TABLE IF EXISTS `Dependency`");
			//    5    9:aload_1         
			//    6   10:ldc1            #62  <String "DROP TABLE IF EXISTS `Dependency`">
			//    7   12:invokeinterface #32  <Method void SupportSQLiteDatabase.execSQL(String)>
				else
			//*   8   17:goto            29
					SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "DROP TABLE IF EXISTS `Dependency`");
			//    9   20:aload_1         
			//   10   21:checkcast       #24  <Class SQLiteDatabase>
			//   11   24:ldc1            #62  <String "DROP TABLE IF EXISTS `Dependency`">
			//   12   26:invokestatic    #37  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
				if(!flag)
			//*  13   29:iload_2         
			//*  14   30:ifne            44
					supportsqlitedatabase.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
			//   15   33:aload_1         
			//   16   34:ldc1            #64  <String "DROP TABLE IF EXISTS `WorkSpec`">
			//   17   36:invokeinterface #32  <Method void SupportSQLiteDatabase.execSQL(String)>
				else
			//*  18   41:goto            53
					SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "DROP TABLE IF EXISTS `WorkSpec`");
			//   19   44:aload_1         
			//   20   45:checkcast       #24  <Class SQLiteDatabase>
			//   21   48:ldc1            #64  <String "DROP TABLE IF EXISTS `WorkSpec`">
			//   22   50:invokestatic    #37  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
				if(!flag)
			//*  23   53:iload_2         
			//*  24   54:ifne            68
					supportsqlitedatabase.execSQL("DROP TABLE IF EXISTS `WorkTag`");
			//   25   57:aload_1         
			//   26   58:ldc1            #66  <String "DROP TABLE IF EXISTS `WorkTag`">
			//   27   60:invokeinterface #32  <Method void SupportSQLiteDatabase.execSQL(String)>
				else
			//*  28   65:goto            77
					SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "DROP TABLE IF EXISTS `WorkTag`");
			//   29   68:aload_1         
			//   30   69:checkcast       #24  <Class SQLiteDatabase>
			//   31   72:ldc1            #66  <String "DROP TABLE IF EXISTS `WorkTag`">
			//   32   74:invokestatic    #37  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
				if(!flag)
			//*  33   77:iload_2         
			//*  34   78:ifne            92
					supportsqlitedatabase.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
			//   35   81:aload_1         
			//   36   82:ldc1            #68  <String "DROP TABLE IF EXISTS `SystemIdInfo`">
			//   37   84:invokeinterface #32  <Method void SupportSQLiteDatabase.execSQL(String)>
				else
			//*  38   89:goto            101
					SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "DROP TABLE IF EXISTS `SystemIdInfo`");
			//   39   92:aload_1         
			//   40   93:checkcast       #24  <Class SQLiteDatabase>
			//   41   96:ldc1            #68  <String "DROP TABLE IF EXISTS `SystemIdInfo`">
			//   42   98:invokestatic    #37  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
				if(!flag)
			//*  43  101:iload_2         
			//*  44  102:ifne            114
				{
					supportsqlitedatabase.execSQL("DROP TABLE IF EXISTS `WorkName`");
			//   45  105:aload_1         
			//   46  106:ldc1            #70  <String "DROP TABLE IF EXISTS `WorkName`">
			//   47  108:invokeinterface #32  <Method void SupportSQLiteDatabase.execSQL(String)>
					return;
			//   48  113:return          
				} else
				{
					SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "DROP TABLE IF EXISTS `WorkName`");
			//   49  114:aload_1         
			//   50  115:checkcast       #24  <Class SQLiteDatabase>
			//   51  118:ldc1            #70  <String "DROP TABLE IF EXISTS `WorkName`">
			//   52  120:invokestatic    #37  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
					return;
			//   53  123:return          
				}
			}

			protected void onCreate(SupportSQLiteDatabase supportsqlitedatabase)
			{
				if( != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #16  <Field WorkDatabase_Impl this$0>
			//*   2    4:invokestatic    #75  <Method List WorkDatabase_Impl.access$000(WorkDatabase_Impl)>
			//*   3    7:ifnull          57
				{
					int i = 0;
			//    4   10:iconst_0        
			//    5   11:istore_2        
					for(int j = .size(); i < j; i++)
			//*   6   12:aload_0         
			//*   7   13:getfield        #16  <Field WorkDatabase_Impl this$0>
			//*   8   16:invokestatic    #78  <Method List WorkDatabase_Impl.access$100(WorkDatabase_Impl)>
			//*   9   19:invokeinterface #84  <Method int List.size()>
			//*  10   24:istore_3        
			//*  11   25:iload_2         
			//*  12   26:iload_3         
			//*  13   27:icmpge          57
						((android.arch.persistence.room.RoomDatabase.Callback).get(i)).onCreate(supportsqlitedatabase);
			//   14   30:aload_0         
			//   15   31:getfield        #16  <Field WorkDatabase_Impl this$0>
			//   16   34:invokestatic    #87  <Method List WorkDatabase_Impl.access$200(WorkDatabase_Impl)>
			//   17   37:iload_2         
			//   18   38:invokeinterface #91  <Method Object List.get(int)>
			//   19   43:checkcast       #93  <Class android.arch.persistence.room.RoomDatabase$Callback>
			//   20   46:aload_1         
			//   21   47:invokevirtual   #95  <Method void android.arch.persistence.room.RoomDatabase$Callback.onCreate(SupportSQLiteDatabase)>

			//   22   50:iload_2         
			//   23   51:iconst_1        
			//   24   52:iadd            
			//   25   53:istore_2        
				}
			//*  26   54:goto            25
			//   27   57:return          
			}

			public void onOpen(SupportSQLiteDatabase supportsqlitedatabase)
			{
				supportsqlitedatabase.execSQL = supportsqlitedatabase;
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field WorkDatabase_Impl this$0>
			//    2    4:aload_1         
			//    3    5:invokestatic    #100 <Method SupportSQLiteDatabase WorkDatabase_Impl.access$302(WorkDatabase_Impl, SupportSQLiteDatabase)>
			//    4    8:pop             
				if(!(supportsqlitedatabase instanceof SQLiteDatabase))
			//*   5    9:aload_1         
			//*   6   10:instanceof      #24  <Class SQLiteDatabase>
			//*   7   13:ifne            27
					supportsqlitedatabase.execSQL("PRAGMA foreign_keys = ON");
			//    8   16:aload_1         
			//    9   17:ldc1            #102 <String "PRAGMA foreign_keys = ON">
			//   10   19:invokeinterface #32  <Method void SupportSQLiteDatabase.execSQL(String)>
				else
			//*  11   24:goto            36
					SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "PRAGMA foreign_keys = ON");
			//   12   27:aload_1         
			//   13   28:checkcast       #24  <Class SQLiteDatabase>
			//   14   31:ldc1            #102 <String "PRAGMA foreign_keys = ON">
			//   15   33:invokestatic    #37  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
				internalInitInvalidationTracker(supportsqlitedatabase);
			//   16   36:aload_0         
			//   17   37:getfield        #16  <Field WorkDatabase_Impl this$0>
			//   18   40:aload_1         
			//   19   41:invokestatic    #106 <Method void WorkDatabase_Impl.access$400(WorkDatabase_Impl, SupportSQLiteDatabase)>
				if( != null)
			//*  20   44:aload_0         
			//*  21   45:getfield        #16  <Field WorkDatabase_Impl this$0>
			//*  22   48:invokestatic    #109 <Method List WorkDatabase_Impl.access$500(WorkDatabase_Impl)>
			//*  23   51:ifnull          101
				{
					int i = 0;
			//   24   54:iconst_0        
			//   25   55:istore_2        
					for(int j = .size(); i < j; i++)
			//*  26   56:aload_0         
			//*  27   57:getfield        #16  <Field WorkDatabase_Impl this$0>
			//*  28   60:invokestatic    #112 <Method List WorkDatabase_Impl.access$600(WorkDatabase_Impl)>
			//*  29   63:invokeinterface #84  <Method int List.size()>
			//*  30   68:istore_3        
			//*  31   69:iload_2         
			//*  32   70:iload_3         
			//*  33   71:icmpge          101
						((android.arch.persistence.room.RoomDatabase.Callback).get(i)).onOpen(supportsqlitedatabase);
			//   34   74:aload_0         
			//   35   75:getfield        #16  <Field WorkDatabase_Impl this$0>
			//   36   78:invokestatic    #115 <Method List WorkDatabase_Impl.access$700(WorkDatabase_Impl)>
			//   37   81:iload_2         
			//   38   82:invokeinterface #91  <Method Object List.get(int)>
			//   39   87:checkcast       #93  <Class android.arch.persistence.room.RoomDatabase$Callback>
			//   40   90:aload_1         
			//   41   91:invokevirtual   #117 <Method void android.arch.persistence.room.RoomDatabase$Callback.onOpen(SupportSQLiteDatabase)>

			//   42   94:iload_2         
			//   43   95:iconst_1        
			//   44   96:iadd            
			//   45   97:istore_2        
				}
			//*  46   98:goto            69
			//   47  101:return          
			}

			protected void validateMigration(SupportSQLiteDatabase supportsqlitedatabase)
			{
				Object obj1 = ((Object) (new HashMap(2)));
			//    0    0:new             #120 <Class HashMap>
			//    1    3:dup             
			//    2    4:iconst_2        
			//    3    5:invokespecial   #121 <Method void HashMap(int)>
			//    4    8:astore_2        
				((HashMap) (obj1)).put("work_spec_id", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("work_spec_id", "TEXT", true, 1))));
			//    5    9:aload_2         
			//    6   10:ldc1            #123 <String "work_spec_id">
			//    7   12:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//    8   15:dup             
			//    9   16:ldc1            #123 <String "work_spec_id">
			//   10   18:ldc1            #127 <String "TEXT">
			//   11   20:iconst_1        
			//   12   21:iconst_1        
			//   13   22:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//   14   25:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//   15   28:pop             
				((HashMap) (obj1)).put("prerequisite_id", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("prerequisite_id", "TEXT", true, 2))));
			//   16   29:aload_2         
			//   17   30:ldc1            #136 <String "prerequisite_id">
			//   18   32:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//   19   35:dup             
			//   20   36:ldc1            #136 <String "prerequisite_id">
			//   21   38:ldc1            #127 <String "TEXT">
			//   22   40:iconst_1        
			//   23   41:iconst_2        
			//   24   42:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//   25   45:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//   26   48:pop             
				Object obj2 = ((Object) (new HashSet(2)));
			//   27   49:new             #138 <Class HashSet>
			//   28   52:dup             
			//   29   53:iconst_2        
			//   30   54:invokespecial   #139 <Method void HashSet(int)>
			//   31   57:astore_3        
				((HashSet) (obj2)).add(((Object) (new android.arch.persistence.room.util.TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(((Object []) (new String[] {
					"work_spec_id"
				}))), Arrays.asList(((Object []) (new String[] {
					"id"
				})))))));
			//   32   58:aload_3         
			//   33   59:new             #141 <Class android.arch.persistence.room.util.TableInfo$ForeignKey>
			//   34   62:dup             
			//   35   63:ldc1            #143 <String "WorkSpec">
			//   36   65:ldc1            #145 <String "CASCADE">
			//   37   67:ldc1            #145 <String "CASCADE">
			//   38   69:iconst_1        
			//   39   70:anewarray       String[]
			//   40   73:dup             
			//   41   74:iconst_0        
			//   42   75:ldc1            #123 <String "work_spec_id">
			//   43   77:aastore         
			//   44   78:invokestatic    #153 <Method List Arrays.asList(Object[])>
			//   45   81:iconst_1        
			//   46   82:anewarray       String[]
			//   47   85:dup             
			//   48   86:iconst_0        
			//   49   87:ldc1            #155 <String "id">
			//   50   89:aastore         
			//   51   90:invokestatic    #153 <Method List Arrays.asList(Object[])>
			//   52   93:invokespecial   #158 <Method void android.arch.persistence.room.util.TableInfo$ForeignKey(String, String, String, List, List)>
			//   53   96:invokevirtual   #162 <Method boolean HashSet.add(Object)>
			//   54   99:pop             
				((HashSet) (obj2)).add(((Object) (new android.arch.persistence.room.util.TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(((Object []) (new String[] {
					"prerequisite_id"
				}))), Arrays.asList(((Object []) (new String[] {
					"id"
				})))))));
			//   55  100:aload_3         
			//   56  101:new             #141 <Class android.arch.persistence.room.util.TableInfo$ForeignKey>
			//   57  104:dup             
			//   58  105:ldc1            #143 <String "WorkSpec">
			//   59  107:ldc1            #145 <String "CASCADE">
			//   60  109:ldc1            #145 <String "CASCADE">
			//   61  111:iconst_1        
			//   62  112:anewarray       String[]
			//   63  115:dup             
			//   64  116:iconst_0        
			//   65  117:ldc1            #136 <String "prerequisite_id">
			//   66  119:aastore         
			//   67  120:invokestatic    #153 <Method List Arrays.asList(Object[])>
			//   68  123:iconst_1        
			//   69  124:anewarray       String[]
			//   70  127:dup             
			//   71  128:iconst_0        
			//   72  129:ldc1            #155 <String "id">
			//   73  131:aastore         
			//   74  132:invokestatic    #153 <Method List Arrays.asList(Object[])>
			//   75  135:invokespecial   #158 <Method void android.arch.persistence.room.util.TableInfo$ForeignKey(String, String, String, List, List)>
			//   76  138:invokevirtual   #162 <Method boolean HashSet.add(Object)>
			//   77  141:pop             
				HashSet hashset = new HashSet(2);
			//   78  142:new             #138 <Class HashSet>
			//   79  145:dup             
			//   80  146:iconst_2        
			//   81  147:invokespecial   #139 <Method void HashSet(int)>
			//   82  150:astore          4
				hashset.add(((Object) (new android.arch.persistence.room.util.TableInfo.Index("index_Dependency_work_spec_id", false, Arrays.asList(((Object []) (new String[] {
					"work_spec_id"
				})))))));
			//   83  152:aload           4
			//   84  154:new             #164 <Class android.arch.persistence.room.util.TableInfo$Index>
			//   85  157:dup             
			//   86  158:ldc1            #166 <String "index_Dependency_work_spec_id">
			//   87  160:iconst_0        
			//   88  161:iconst_1        
			//   89  162:anewarray       String[]
			//   90  165:dup             
			//   91  166:iconst_0        
			//   92  167:ldc1            #123 <String "work_spec_id">
			//   93  169:aastore         
			//   94  170:invokestatic    #153 <Method List Arrays.asList(Object[])>
			//   95  173:invokespecial   #169 <Method void android.arch.persistence.room.util.TableInfo$Index(String, boolean, List)>
			//   96  176:invokevirtual   #162 <Method boolean HashSet.add(Object)>
			//   97  179:pop             
				hashset.add(((Object) (new android.arch.persistence.room.util.TableInfo.Index("index_Dependency_prerequisite_id", false, Arrays.asList(((Object []) (new String[] {
					"prerequisite_id"
				})))))));
			//   98  180:aload           4
			//   99  182:new             #164 <Class android.arch.persistence.room.util.TableInfo$Index>
			//  100  185:dup             
			//  101  186:ldc1            #171 <String "index_Dependency_prerequisite_id">
			//  102  188:iconst_0        
			//  103  189:iconst_1        
			//  104  190:anewarray       String[]
			//  105  193:dup             
			//  106  194:iconst_0        
			//  107  195:ldc1            #136 <String "prerequisite_id">
			//  108  197:aastore         
			//  109  198:invokestatic    #153 <Method List Arrays.asList(Object[])>
			//  110  201:invokespecial   #169 <Method void android.arch.persistence.room.util.TableInfo$Index(String, boolean, List)>
			//  111  204:invokevirtual   #162 <Method boolean HashSet.add(Object)>
			//  112  207:pop             
				obj1 = ((Object) (new TableInfo("Dependency", ((java.util.Map) (obj1)), ((java.util.Set) (obj2)), ((java.util.Set) (hashset)))));
			//  113  208:new             #173 <Class TableInfo>
			//  114  211:dup             
			//  115  212:ldc1            #175 <String "Dependency">
			//  116  214:aload_2         
			//  117  215:aload_3         
			//  118  216:aload           4
			//  119  218:invokespecial   #178 <Method void TableInfo(String, java.util.Map, java.util.Set, java.util.Set)>
			//  120  221:astore_2        
				obj2 = ((Object) (TableInfo.read(supportsqlitedatabase, "Dependency")));
			//  121  222:aload_1         
			//  122  223:ldc1            #175 <String "Dependency">
			//  123  225:invokestatic    #182 <Method TableInfo TableInfo.read(SupportSQLiteDatabase, String)>
			//  124  228:astore_3        
				if(((TableInfo) (obj1)).equals(obj2))
			//* 125  229:aload_2         
			//* 126  230:aload_3         
			//* 127  231:invokevirtual   #185 <Method boolean TableInfo.equals(Object)>
			//* 128  234:ifeq            1436
				{
					obj1 = ((Object) (new HashMap(21)));
			//  129  237:new             #120 <Class HashMap>
			//  130  240:dup             
			//  131  241:bipush          21
			//  132  243:invokespecial   #121 <Method void HashMap(int)>
			//  133  246:astore_2        
					((HashMap) (obj1)).put("id", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("id", "TEXT", true, 1))));
			//  134  247:aload_2         
			//  135  248:ldc1            #155 <String "id">
			//  136  250:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  137  253:dup             
			//  138  254:ldc1            #155 <String "id">
			//  139  256:ldc1            #127 <String "TEXT">
			//  140  258:iconst_1        
			//  141  259:iconst_1        
			//  142  260:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  143  263:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  144  266:pop             
					((HashMap) (obj1)).put("state", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("state", "INTEGER", true, 0))));
			//  145  267:aload_2         
			//  146  268:ldc1            #187 <String "state">
			//  147  270:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  148  273:dup             
			//  149  274:ldc1            #187 <String "state">
			//  150  276:ldc1            #189 <String "INTEGER">
			//  151  278:iconst_1        
			//  152  279:iconst_0        
			//  153  280:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  154  283:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  155  286:pop             
					((HashMap) (obj1)).put("worker_class_name", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("worker_class_name", "TEXT", true, 0))));
			//  156  287:aload_2         
			//  157  288:ldc1            #191 <String "worker_class_name">
			//  158  290:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  159  293:dup             
			//  160  294:ldc1            #191 <String "worker_class_name">
			//  161  296:ldc1            #127 <String "TEXT">
			//  162  298:iconst_1        
			//  163  299:iconst_0        
			//  164  300:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  165  303:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  166  306:pop             
					((HashMap) (obj1)).put("input_merger_class_name", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("input_merger_class_name", "TEXT", false, 0))));
			//  167  307:aload_2         
			//  168  308:ldc1            #193 <String "input_merger_class_name">
			//  169  310:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  170  313:dup             
			//  171  314:ldc1            #193 <String "input_merger_class_name">
			//  172  316:ldc1            #127 <String "TEXT">
			//  173  318:iconst_0        
			//  174  319:iconst_0        
			//  175  320:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  176  323:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  177  326:pop             
					((HashMap) (obj1)).put("input", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("input", "BLOB", true, 0))));
			//  178  327:aload_2         
			//  179  328:ldc1            #195 <String "input">
			//  180  330:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  181  333:dup             
			//  182  334:ldc1            #195 <String "input">
			//  183  336:ldc1            #197 <String "BLOB">
			//  184  338:iconst_1        
			//  185  339:iconst_0        
			//  186  340:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  187  343:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  188  346:pop             
					((HashMap) (obj1)).put("output", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("output", "BLOB", true, 0))));
			//  189  347:aload_2         
			//  190  348:ldc1            #199 <String "output">
			//  191  350:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  192  353:dup             
			//  193  354:ldc1            #199 <String "output">
			//  194  356:ldc1            #197 <String "BLOB">
			//  195  358:iconst_1        
			//  196  359:iconst_0        
			//  197  360:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  198  363:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  199  366:pop             
					((HashMap) (obj1)).put("initial_delay", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("initial_delay", "INTEGER", true, 0))));
			//  200  367:aload_2         
			//  201  368:ldc1            #201 <String "initial_delay">
			//  202  370:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  203  373:dup             
			//  204  374:ldc1            #201 <String "initial_delay">
			//  205  376:ldc1            #189 <String "INTEGER">
			//  206  378:iconst_1        
			//  207  379:iconst_0        
			//  208  380:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  209  383:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  210  386:pop             
					((HashMap) (obj1)).put("interval_duration", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("interval_duration", "INTEGER", true, 0))));
			//  211  387:aload_2         
			//  212  388:ldc1            #203 <String "interval_duration">
			//  213  390:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  214  393:dup             
			//  215  394:ldc1            #203 <String "interval_duration">
			//  216  396:ldc1            #189 <String "INTEGER">
			//  217  398:iconst_1        
			//  218  399:iconst_0        
			//  219  400:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  220  403:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  221  406:pop             
					((HashMap) (obj1)).put("flex_duration", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("flex_duration", "INTEGER", true, 0))));
			//  222  407:aload_2         
			//  223  408:ldc1            #205 <String "flex_duration">
			//  224  410:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  225  413:dup             
			//  226  414:ldc1            #205 <String "flex_duration">
			//  227  416:ldc1            #189 <String "INTEGER">
			//  228  418:iconst_1        
			//  229  419:iconst_0        
			//  230  420:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  231  423:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  232  426:pop             
					((HashMap) (obj1)).put("run_attempt_count", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("run_attempt_count", "INTEGER", true, 0))));
			//  233  427:aload_2         
			//  234  428:ldc1            #207 <String "run_attempt_count">
			//  235  430:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  236  433:dup             
			//  237  434:ldc1            #207 <String "run_attempt_count">
			//  238  436:ldc1            #189 <String "INTEGER">
			//  239  438:iconst_1        
			//  240  439:iconst_0        
			//  241  440:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  242  443:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  243  446:pop             
					((HashMap) (obj1)).put("backoff_policy", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("backoff_policy", "INTEGER", true, 0))));
			//  244  447:aload_2         
			//  245  448:ldc1            #209 <String "backoff_policy">
			//  246  450:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  247  453:dup             
			//  248  454:ldc1            #209 <String "backoff_policy">
			//  249  456:ldc1            #189 <String "INTEGER">
			//  250  458:iconst_1        
			//  251  459:iconst_0        
			//  252  460:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  253  463:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  254  466:pop             
					((HashMap) (obj1)).put("backoff_delay_duration", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("backoff_delay_duration", "INTEGER", true, 0))));
			//  255  467:aload_2         
			//  256  468:ldc1            #211 <String "backoff_delay_duration">
			//  257  470:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  258  473:dup             
			//  259  474:ldc1            #211 <String "backoff_delay_duration">
			//  260  476:ldc1            #189 <String "INTEGER">
			//  261  478:iconst_1        
			//  262  479:iconst_0        
			//  263  480:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  264  483:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  265  486:pop             
					((HashMap) (obj1)).put("period_start_time", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("period_start_time", "INTEGER", true, 0))));
			//  266  487:aload_2         
			//  267  488:ldc1            #213 <String "period_start_time">
			//  268  490:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  269  493:dup             
			//  270  494:ldc1            #213 <String "period_start_time">
			//  271  496:ldc1            #189 <String "INTEGER">
			//  272  498:iconst_1        
			//  273  499:iconst_0        
			//  274  500:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  275  503:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  276  506:pop             
					((HashMap) (obj1)).put("minimum_retention_duration", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("minimum_retention_duration", "INTEGER", true, 0))));
			//  277  507:aload_2         
			//  278  508:ldc1            #215 <String "minimum_retention_duration">
			//  279  510:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  280  513:dup             
			//  281  514:ldc1            #215 <String "minimum_retention_duration">
			//  282  516:ldc1            #189 <String "INTEGER">
			//  283  518:iconst_1        
			//  284  519:iconst_0        
			//  285  520:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  286  523:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  287  526:pop             
					((HashMap) (obj1)).put("schedule_requested_at", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("schedule_requested_at", "INTEGER", true, 0))));
			//  288  527:aload_2         
			//  289  528:ldc1            #217 <String "schedule_requested_at">
			//  290  530:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  291  533:dup             
			//  292  534:ldc1            #217 <String "schedule_requested_at">
			//  293  536:ldc1            #189 <String "INTEGER">
			//  294  538:iconst_1        
			//  295  539:iconst_0        
			//  296  540:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  297  543:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  298  546:pop             
					((HashMap) (obj1)).put("required_network_type", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("required_network_type", "INTEGER", false, 0))));
			//  299  547:aload_2         
			//  300  548:ldc1            #219 <String "required_network_type">
			//  301  550:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  302  553:dup             
			//  303  554:ldc1            #219 <String "required_network_type">
			//  304  556:ldc1            #189 <String "INTEGER">
			//  305  558:iconst_0        
			//  306  559:iconst_0        
			//  307  560:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  308  563:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  309  566:pop             
					((HashMap) (obj1)).put("requires_charging", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("requires_charging", "INTEGER", true, 0))));
			//  310  567:aload_2         
			//  311  568:ldc1            #221 <String "requires_charging">
			//  312  570:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  313  573:dup             
			//  314  574:ldc1            #221 <String "requires_charging">
			//  315  576:ldc1            #189 <String "INTEGER">
			//  316  578:iconst_1        
			//  317  579:iconst_0        
			//  318  580:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  319  583:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  320  586:pop             
					((HashMap) (obj1)).put("requires_device_idle", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("requires_device_idle", "INTEGER", true, 0))));
			//  321  587:aload_2         
			//  322  588:ldc1            #223 <String "requires_device_idle">
			//  323  590:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  324  593:dup             
			//  325  594:ldc1            #223 <String "requires_device_idle">
			//  326  596:ldc1            #189 <String "INTEGER">
			//  327  598:iconst_1        
			//  328  599:iconst_0        
			//  329  600:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  330  603:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  331  606:pop             
					((HashMap) (obj1)).put("requires_battery_not_low", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("requires_battery_not_low", "INTEGER", true, 0))));
			//  332  607:aload_2         
			//  333  608:ldc1            #225 <String "requires_battery_not_low">
			//  334  610:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  335  613:dup             
			//  336  614:ldc1            #225 <String "requires_battery_not_low">
			//  337  616:ldc1            #189 <String "INTEGER">
			//  338  618:iconst_1        
			//  339  619:iconst_0        
			//  340  620:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  341  623:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  342  626:pop             
					((HashMap) (obj1)).put("requires_storage_not_low", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("requires_storage_not_low", "INTEGER", true, 0))));
			//  343  627:aload_2         
			//  344  628:ldc1            #227 <String "requires_storage_not_low">
			//  345  630:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  346  633:dup             
			//  347  634:ldc1            #227 <String "requires_storage_not_low">
			//  348  636:ldc1            #189 <String "INTEGER">
			//  349  638:iconst_1        
			//  350  639:iconst_0        
			//  351  640:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  352  643:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  353  646:pop             
					((HashMap) (obj1)).put("content_uri_triggers", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("content_uri_triggers", "BLOB", false, 0))));
			//  354  647:aload_2         
			//  355  648:ldc1            #229 <String "content_uri_triggers">
			//  356  650:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  357  653:dup             
			//  358  654:ldc1            #229 <String "content_uri_triggers">
			//  359  656:ldc1            #197 <String "BLOB">
			//  360  658:iconst_0        
			//  361  659:iconst_0        
			//  362  660:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  363  663:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  364  666:pop             
					obj2 = ((Object) (new HashSet(0)));
			//  365  667:new             #138 <Class HashSet>
			//  366  670:dup             
			//  367  671:iconst_0        
			//  368  672:invokespecial   #139 <Method void HashSet(int)>
			//  369  675:astore_3        
					HashSet hashset1 = new HashSet(1);
			//  370  676:new             #138 <Class HashSet>
			//  371  679:dup             
			//  372  680:iconst_1        
			//  373  681:invokespecial   #139 <Method void HashSet(int)>
			//  374  684:astore          4
					hashset1.add(((Object) (new android.arch.persistence.room.util.TableInfo.Index("index_WorkSpec_schedule_requested_at", false, Arrays.asList(((Object []) (new String[] {
						"schedule_requested_at"
					})))))));
			//  375  686:aload           4
			//  376  688:new             #164 <Class android.arch.persistence.room.util.TableInfo$Index>
			//  377  691:dup             
			//  378  692:ldc1            #231 <String "index_WorkSpec_schedule_requested_at">
			//  379  694:iconst_0        
			//  380  695:iconst_1        
			//  381  696:anewarray       String[]
			//  382  699:dup             
			//  383  700:iconst_0        
			//  384  701:ldc1            #217 <String "schedule_requested_at">
			//  385  703:aastore         
			//  386  704:invokestatic    #153 <Method List Arrays.asList(Object[])>
			//  387  707:invokespecial   #169 <Method void android.arch.persistence.room.util.TableInfo$Index(String, boolean, List)>
			//  388  710:invokevirtual   #162 <Method boolean HashSet.add(Object)>
			//  389  713:pop             
					obj1 = ((Object) (new TableInfo("WorkSpec", ((java.util.Map) (obj1)), ((java.util.Set) (obj2)), ((java.util.Set) (hashset1)))));
			//  390  714:new             #173 <Class TableInfo>
			//  391  717:dup             
			//  392  718:ldc1            #143 <String "WorkSpec">
			//  393  720:aload_2         
			//  394  721:aload_3         
			//  395  722:aload           4
			//  396  724:invokespecial   #178 <Method void TableInfo(String, java.util.Map, java.util.Set, java.util.Set)>
			//  397  727:astore_2        
					obj2 = ((Object) (TableInfo.read(supportsqlitedatabase, "WorkSpec")));
			//  398  728:aload_1         
			//  399  729:ldc1            #143 <String "WorkSpec">
			//  400  731:invokestatic    #182 <Method TableInfo TableInfo.read(SupportSQLiteDatabase, String)>
			//  401  734:astore_3        
					if(((TableInfo) (obj1)).equals(obj2))
			//* 402  735:aload_2         
			//* 403  736:aload_3         
			//* 404  737:invokevirtual   #185 <Method boolean TableInfo.equals(Object)>
			//* 405  740:ifeq            1380
					{
						obj1 = ((Object) (new HashMap(2)));
			//  406  743:new             #120 <Class HashMap>
			//  407  746:dup             
			//  408  747:iconst_2        
			//  409  748:invokespecial   #121 <Method void HashMap(int)>
			//  410  751:astore_2        
						((HashMap) (obj1)).put("tag", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("tag", "TEXT", true, 1))));
			//  411  752:aload_2         
			//  412  753:ldc1            #233 <String "tag">
			//  413  755:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  414  758:dup             
			//  415  759:ldc1            #233 <String "tag">
			//  416  761:ldc1            #127 <String "TEXT">
			//  417  763:iconst_1        
			//  418  764:iconst_1        
			//  419  765:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  420  768:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  421  771:pop             
						((HashMap) (obj1)).put("work_spec_id", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("work_spec_id", "TEXT", true, 2))));
			//  422  772:aload_2         
			//  423  773:ldc1            #123 <String "work_spec_id">
			//  424  775:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  425  778:dup             
			//  426  779:ldc1            #123 <String "work_spec_id">
			//  427  781:ldc1            #127 <String "TEXT">
			//  428  783:iconst_1        
			//  429  784:iconst_2        
			//  430  785:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  431  788:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  432  791:pop             
						obj2 = ((Object) (new HashSet(1)));
			//  433  792:new             #138 <Class HashSet>
			//  434  795:dup             
			//  435  796:iconst_1        
			//  436  797:invokespecial   #139 <Method void HashSet(int)>
			//  437  800:astore_3        
						((HashSet) (obj2)).add(((Object) (new android.arch.persistence.room.util.TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(((Object []) (new String[] {
							"work_spec_id"
						}))), Arrays.asList(((Object []) (new String[] {
							"id"
						})))))));
			//  438  801:aload_3         
			//  439  802:new             #141 <Class android.arch.persistence.room.util.TableInfo$ForeignKey>
			//  440  805:dup             
			//  441  806:ldc1            #143 <String "WorkSpec">
			//  442  808:ldc1            #145 <String "CASCADE">
			//  443  810:ldc1            #145 <String "CASCADE">
			//  444  812:iconst_1        
			//  445  813:anewarray       String[]
			//  446  816:dup             
			//  447  817:iconst_0        
			//  448  818:ldc1            #123 <String "work_spec_id">
			//  449  820:aastore         
			//  450  821:invokestatic    #153 <Method List Arrays.asList(Object[])>
			//  451  824:iconst_1        
			//  452  825:anewarray       String[]
			//  453  828:dup             
			//  454  829:iconst_0        
			//  455  830:ldc1            #155 <String "id">
			//  456  832:aastore         
			//  457  833:invokestatic    #153 <Method List Arrays.asList(Object[])>
			//  458  836:invokespecial   #158 <Method void android.arch.persistence.room.util.TableInfo$ForeignKey(String, String, String, List, List)>
			//  459  839:invokevirtual   #162 <Method boolean HashSet.add(Object)>
			//  460  842:pop             
						HashSet hashset2 = new HashSet(1);
			//  461  843:new             #138 <Class HashSet>
			//  462  846:dup             
			//  463  847:iconst_1        
			//  464  848:invokespecial   #139 <Method void HashSet(int)>
			//  465  851:astore          4
						hashset2.add(((Object) (new android.arch.persistence.room.util.TableInfo.Index("index_WorkTag_work_spec_id", false, Arrays.asList(((Object []) (new String[] {
							"work_spec_id"
						})))))));
			//  466  853:aload           4
			//  467  855:new             #164 <Class android.arch.persistence.room.util.TableInfo$Index>
			//  468  858:dup             
			//  469  859:ldc1            #235 <String "index_WorkTag_work_spec_id">
			//  470  861:iconst_0        
			//  471  862:iconst_1        
			//  472  863:anewarray       String[]
			//  473  866:dup             
			//  474  867:iconst_0        
			//  475  868:ldc1            #123 <String "work_spec_id">
			//  476  870:aastore         
			//  477  871:invokestatic    #153 <Method List Arrays.asList(Object[])>
			//  478  874:invokespecial   #169 <Method void android.arch.persistence.room.util.TableInfo$Index(String, boolean, List)>
			//  479  877:invokevirtual   #162 <Method boolean HashSet.add(Object)>
			//  480  880:pop             
						obj1 = ((Object) (new TableInfo("WorkTag", ((java.util.Map) (obj1)), ((java.util.Set) (obj2)), ((java.util.Set) (hashset2)))));
			//  481  881:new             #173 <Class TableInfo>
			//  482  884:dup             
			//  483  885:ldc1            #237 <String "WorkTag">
			//  484  887:aload_2         
			//  485  888:aload_3         
			//  486  889:aload           4
			//  487  891:invokespecial   #178 <Method void TableInfo(String, java.util.Map, java.util.Set, java.util.Set)>
			//  488  894:astore_2        
						obj2 = ((Object) (TableInfo.read(supportsqlitedatabase, "WorkTag")));
			//  489  895:aload_1         
			//  490  896:ldc1            #237 <String "WorkTag">
			//  491  898:invokestatic    #182 <Method TableInfo TableInfo.read(SupportSQLiteDatabase, String)>
			//  492  901:astore_3        
						if(((TableInfo) (obj1)).equals(obj2))
			//* 493  902:aload_2         
			//* 494  903:aload_3         
			//* 495  904:invokevirtual   #185 <Method boolean TableInfo.equals(Object)>
			//* 496  907:ifeq            1324
						{
							obj1 = ((Object) (new HashMap(2)));
			//  497  910:new             #120 <Class HashMap>
			//  498  913:dup             
			//  499  914:iconst_2        
			//  500  915:invokespecial   #121 <Method void HashMap(int)>
			//  501  918:astore_2        
							((HashMap) (obj1)).put("work_spec_id", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("work_spec_id", "TEXT", true, 1))));
			//  502  919:aload_2         
			//  503  920:ldc1            #123 <String "work_spec_id">
			//  504  922:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  505  925:dup             
			//  506  926:ldc1            #123 <String "work_spec_id">
			//  507  928:ldc1            #127 <String "TEXT">
			//  508  930:iconst_1        
			//  509  931:iconst_1        
			//  510  932:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  511  935:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  512  938:pop             
							((HashMap) (obj1)).put("system_id", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("system_id", "INTEGER", true, 0))));
			//  513  939:aload_2         
			//  514  940:ldc1            #239 <String "system_id">
			//  515  942:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  516  945:dup             
			//  517  946:ldc1            #239 <String "system_id">
			//  518  948:ldc1            #189 <String "INTEGER">
			//  519  950:iconst_1        
			//  520  951:iconst_0        
			//  521  952:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  522  955:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  523  958:pop             
							obj2 = ((Object) (new HashSet(1)));
			//  524  959:new             #138 <Class HashSet>
			//  525  962:dup             
			//  526  963:iconst_1        
			//  527  964:invokespecial   #139 <Method void HashSet(int)>
			//  528  967:astore_3        
							((HashSet) (obj2)).add(((Object) (new android.arch.persistence.room.util.TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(((Object []) (new String[] {
								"work_spec_id"
							}))), Arrays.asList(((Object []) (new String[] {
								"id"
							})))))));
			//  529  968:aload_3         
			//  530  969:new             #141 <Class android.arch.persistence.room.util.TableInfo$ForeignKey>
			//  531  972:dup             
			//  532  973:ldc1            #143 <String "WorkSpec">
			//  533  975:ldc1            #145 <String "CASCADE">
			//  534  977:ldc1            #145 <String "CASCADE">
			//  535  979:iconst_1        
			//  536  980:anewarray       String[]
			//  537  983:dup             
			//  538  984:iconst_0        
			//  539  985:ldc1            #123 <String "work_spec_id">
			//  540  987:aastore         
			//  541  988:invokestatic    #153 <Method List Arrays.asList(Object[])>
			//  542  991:iconst_1        
			//  543  992:anewarray       String[]
			//  544  995:dup             
			//  545  996:iconst_0        
			//  546  997:ldc1            #155 <String "id">
			//  547  999:aastore         
			//  548 1000:invokestatic    #153 <Method List Arrays.asList(Object[])>
			//  549 1003:invokespecial   #158 <Method void android.arch.persistence.room.util.TableInfo$ForeignKey(String, String, String, List, List)>
			//  550 1006:invokevirtual   #162 <Method boolean HashSet.add(Object)>
			//  551 1009:pop             
							obj1 = ((Object) (new TableInfo("SystemIdInfo", ((java.util.Map) (obj1)), ((java.util.Set) (obj2)), ((java.util.Set) (new HashSet(0))))));
			//  552 1010:new             #173 <Class TableInfo>
			//  553 1013:dup             
			//  554 1014:ldc1            #241 <String "SystemIdInfo">
			//  555 1016:aload_2         
			//  556 1017:aload_3         
			//  557 1018:new             #138 <Class HashSet>
			//  558 1021:dup             
			//  559 1022:iconst_0        
			//  560 1023:invokespecial   #139 <Method void HashSet(int)>
			//  561 1026:invokespecial   #178 <Method void TableInfo(String, java.util.Map, java.util.Set, java.util.Set)>
			//  562 1029:astore_2        
							obj2 = ((Object) (TableInfo.read(supportsqlitedatabase, "SystemIdInfo")));
			//  563 1030:aload_1         
			//  564 1031:ldc1            #241 <String "SystemIdInfo">
			//  565 1033:invokestatic    #182 <Method TableInfo TableInfo.read(SupportSQLiteDatabase, String)>
			//  566 1036:astore_3        
							if(((TableInfo) (obj1)).equals(obj2))
			//* 567 1037:aload_2         
			//* 568 1038:aload_3         
			//* 569 1039:invokevirtual   #185 <Method boolean TableInfo.equals(Object)>
			//* 570 1042:ifeq            1268
							{
								obj1 = ((Object) (new HashMap(2)));
			//  571 1045:new             #120 <Class HashMap>
			//  572 1048:dup             
			//  573 1049:iconst_2        
			//  574 1050:invokespecial   #121 <Method void HashMap(int)>
			//  575 1053:astore_2        
								((HashMap) (obj1)).put("name", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("name", "TEXT", true, 1))));
			//  576 1054:aload_2         
			//  577 1055:ldc1            #243 <String "name">
			//  578 1057:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  579 1060:dup             
			//  580 1061:ldc1            #243 <String "name">
			//  581 1063:ldc1            #127 <String "TEXT">
			//  582 1065:iconst_1        
			//  583 1066:iconst_1        
			//  584 1067:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  585 1070:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  586 1073:pop             
								((HashMap) (obj1)).put("work_spec_id", ((Object) (new android.arch.persistence.room.util.TableInfo.Column("work_spec_id", "TEXT", true, 2))));
			//  587 1074:aload_2         
			//  588 1075:ldc1            #123 <String "work_spec_id">
			//  589 1077:new             #125 <Class android.arch.persistence.room.util.TableInfo$Column>
			//  590 1080:dup             
			//  591 1081:ldc1            #123 <String "work_spec_id">
			//  592 1083:ldc1            #127 <String "TEXT">
			//  593 1085:iconst_1        
			//  594 1086:iconst_2        
			//  595 1087:invokespecial   #130 <Method void android.arch.persistence.room.util.TableInfo$Column(String, String, boolean, int)>
			//  596 1090:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
			//  597 1093:pop             
								obj2 = ((Object) (new HashSet(1)));
			//  598 1094:new             #138 <Class HashSet>
			//  599 1097:dup             
			//  600 1098:iconst_1        
			//  601 1099:invokespecial   #139 <Method void HashSet(int)>
			//  602 1102:astore_3        
								((HashSet) (obj2)).add(((Object) (new android.arch.persistence.room.util.TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(((Object []) (new String[] {
									"work_spec_id"
								}))), Arrays.asList(((Object []) (new String[] {
									"id"
								})))))));
			//  603 1103:aload_3         
			//  604 1104:new             #141 <Class android.arch.persistence.room.util.TableInfo$ForeignKey>
			//  605 1107:dup             
			//  606 1108:ldc1            #143 <String "WorkSpec">
			//  607 1110:ldc1            #145 <String "CASCADE">
			//  608 1112:ldc1            #145 <String "CASCADE">
			//  609 1114:iconst_1        
			//  610 1115:anewarray       String[]
			//  611 1118:dup             
			//  612 1119:iconst_0        
			//  613 1120:ldc1            #123 <String "work_spec_id">
			//  614 1122:aastore         
			//  615 1123:invokestatic    #153 <Method List Arrays.asList(Object[])>
			//  616 1126:iconst_1        
			//  617 1127:anewarray       String[]
			//  618 1130:dup             
			//  619 1131:iconst_0        
			//  620 1132:ldc1            #155 <String "id">
			//  621 1134:aastore         
			//  622 1135:invokestatic    #153 <Method List Arrays.asList(Object[])>
			//  623 1138:invokespecial   #158 <Method void android.arch.persistence.room.util.TableInfo$ForeignKey(String, String, String, List, List)>
			//  624 1141:invokevirtual   #162 <Method boolean HashSet.add(Object)>
			//  625 1144:pop             
								HashSet hashset3 = new HashSet(1);
			//  626 1145:new             #138 <Class HashSet>
			//  627 1148:dup             
			//  628 1149:iconst_1        
			//  629 1150:invokespecial   #139 <Method void HashSet(int)>
			//  630 1153:astore          4
								hashset3.add(((Object) (new android.arch.persistence.room.util.TableInfo.Index("index_WorkName_work_spec_id", false, Arrays.asList(((Object []) (new String[] {
									"work_spec_id"
								})))))));
			//  631 1155:aload           4
			//  632 1157:new             #164 <Class android.arch.persistence.room.util.TableInfo$Index>
			//  633 1160:dup             
			//  634 1161:ldc1            #245 <String "index_WorkName_work_spec_id">
			//  635 1163:iconst_0        
			//  636 1164:iconst_1        
			//  637 1165:anewarray       String[]
			//  638 1168:dup             
			//  639 1169:iconst_0        
			//  640 1170:ldc1            #123 <String "work_spec_id">
			//  641 1172:aastore         
			//  642 1173:invokestatic    #153 <Method List Arrays.asList(Object[])>
			//  643 1176:invokespecial   #169 <Method void android.arch.persistence.room.util.TableInfo$Index(String, boolean, List)>
			//  644 1179:invokevirtual   #162 <Method boolean HashSet.add(Object)>
			//  645 1182:pop             
								obj1 = ((Object) (new TableInfo("WorkName", ((java.util.Map) (obj1)), ((java.util.Set) (obj2)), ((java.util.Set) (hashset3)))));
			//  646 1183:new             #173 <Class TableInfo>
			//  647 1186:dup             
			//  648 1187:ldc1            #247 <String "WorkName">
			//  649 1189:aload_2         
			//  650 1190:aload_3         
			//  651 1191:aload           4
			//  652 1193:invokespecial   #178 <Method void TableInfo(String, java.util.Map, java.util.Set, java.util.Set)>
			//  653 1196:astore_2        
								supportsqlitedatabase = ((SupportSQLiteDatabase) (TableInfo.read(supportsqlitedatabase, "WorkName")));
			//  654 1197:aload_1         
			//  655 1198:ldc1            #247 <String "WorkName">
			//  656 1200:invokestatic    #182 <Method TableInfo TableInfo.read(SupportSQLiteDatabase, String)>
			//  657 1203:astore_1        
								if(((TableInfo) (obj1)).equals(((Object) (supportsqlitedatabase))))
			//* 658 1204:aload_2         
			//* 659 1205:aload_1         
			//* 660 1206:invokevirtual   #185 <Method boolean TableInfo.equals(Object)>
			//* 661 1209:ifeq            1213
								{
									return;
			//  662 1212:return          
								} else
								{
									obj2 = ((Object) (new StringBuilder()));
			//  663 1213:new             #249 <Class StringBuilder>
			//  664 1216:dup             
			//  665 1217:invokespecial   #252 <Method void StringBuilder()>
			//  666 1220:astore_3        
									((StringBuilder) (obj2)).append("Migration didn't properly handle WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
			//  667 1221:aload_3         
			//  668 1222:ldc1            #254 <String "Migration didn't properly handle WorkName(androidx.work.impl.model.WorkName).\n Expected:\n">
			//  669 1224:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
			//  670 1227:pop             
									((StringBuilder) (obj2)).append(obj1);
			//  671 1228:aload_3         
			//  672 1229:aload_2         
			//  673 1230:invokevirtual   #261 <Method StringBuilder StringBuilder.append(Object)>
			//  674 1233:pop             
									((StringBuilder) (obj2)).append("\n");
			//  675 1234:aload_3         
			//  676 1235:ldc2            #263 <String "\n">
			//  677 1238:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
			//  678 1241:pop             
									((StringBuilder) (obj2)).append(" Found:\n");
			//  679 1242:aload_3         
			//  680 1243:ldc2            #265 <String " Found:\n">
			//  681 1246:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
			//  682 1249:pop             
									((StringBuilder) (obj2)).append(((Object) (supportsqlitedatabase)));
			//  683 1250:aload_3         
			//  684 1251:aload_1         
			//  685 1252:invokevirtual   #261 <Method StringBuilder StringBuilder.append(Object)>
			//  686 1255:pop             
									throw new IllegalStateException(((StringBuilder) (obj2)).toString());
			//  687 1256:new             #267 <Class IllegalStateException>
			//  688 1259:dup             
			//  689 1260:aload_3         
			//  690 1261:invokevirtual   #271 <Method String StringBuilder.toString()>
			//  691 1264:invokespecial   #273 <Method void IllegalStateException(String)>
			//  692 1267:athrow          
								}
							} else
							{
								supportsqlitedatabase = ((SupportSQLiteDatabase) (new StringBuilder()));
			//  693 1268:new             #249 <Class StringBuilder>
			//  694 1271:dup             
			//  695 1272:invokespecial   #252 <Method void StringBuilder()>
			//  696 1275:astore_1        
								((StringBuilder) (supportsqlitedatabase)).append("Migration didn't properly handle SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
			//  697 1276:aload_1         
			//  698 1277:ldc2            #275 <String "Migration didn't properly handle SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n">
			//  699 1280:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
			//  700 1283:pop             
								((StringBuilder) (supportsqlitedatabase)).append(obj1);
			//  701 1284:aload_1         
			//  702 1285:aload_2         
			//  703 1286:invokevirtual   #261 <Method StringBuilder StringBuilder.append(Object)>
			//  704 1289:pop             
								((StringBuilder) (supportsqlitedatabase)).append("\n");
			//  705 1290:aload_1         
			//  706 1291:ldc2            #263 <String "\n">
			//  707 1294:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
			//  708 1297:pop             
								((StringBuilder) (supportsqlitedatabase)).append(" Found:\n");
			//  709 1298:aload_1         
			//  710 1299:ldc2            #265 <String " Found:\n">
			//  711 1302:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
			//  712 1305:pop             
								((StringBuilder) (supportsqlitedatabase)).append(obj2);
			//  713 1306:aload_1         
			//  714 1307:aload_3         
			//  715 1308:invokevirtual   #261 <Method StringBuilder StringBuilder.append(Object)>
			//  716 1311:pop             
								throw new IllegalStateException(((StringBuilder) (supportsqlitedatabase)).toString());
			//  717 1312:new             #267 <Class IllegalStateException>
			//  718 1315:dup             
			//  719 1316:aload_1         
			//  720 1317:invokevirtual   #271 <Method String StringBuilder.toString()>
			//  721 1320:invokespecial   #273 <Method void IllegalStateException(String)>
			//  722 1323:athrow          
							}
						} else
						{
							supportsqlitedatabase = ((SupportSQLiteDatabase) (new StringBuilder()));
			//  723 1324:new             #249 <Class StringBuilder>
			//  724 1327:dup             
			//  725 1328:invokespecial   #252 <Method void StringBuilder()>
			//  726 1331:astore_1        
							((StringBuilder) (supportsqlitedatabase)).append("Migration didn't properly handle WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
			//  727 1332:aload_1         
			//  728 1333:ldc2            #277 <String "Migration didn't properly handle WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n">
			//  729 1336:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
			//  730 1339:pop             
							((StringBuilder) (supportsqlitedatabase)).append(obj1);
			//  731 1340:aload_1         
			//  732 1341:aload_2         
			//  733 1342:invokevirtual   #261 <Method StringBuilder StringBuilder.append(Object)>
			//  734 1345:pop             
							((StringBuilder) (supportsqlitedatabase)).append("\n");
			//  735 1346:aload_1         
			//  736 1347:ldc2            #263 <String "\n">
			//  737 1350:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
			//  738 1353:pop             
							((StringBuilder) (supportsqlitedatabase)).append(" Found:\n");
			//  739 1354:aload_1         
			//  740 1355:ldc2            #265 <String " Found:\n">
			//  741 1358:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
			//  742 1361:pop             
							((StringBuilder) (supportsqlitedatabase)).append(obj2);
			//  743 1362:aload_1         
			//  744 1363:aload_3         
			//  745 1364:invokevirtual   #261 <Method StringBuilder StringBuilder.append(Object)>
			//  746 1367:pop             
							throw new IllegalStateException(((StringBuilder) (supportsqlitedatabase)).toString());
			//  747 1368:new             #267 <Class IllegalStateException>
			//  748 1371:dup             
			//  749 1372:aload_1         
			//  750 1373:invokevirtual   #271 <Method String StringBuilder.toString()>
			//  751 1376:invokespecial   #273 <Method void IllegalStateException(String)>
			//  752 1379:athrow          
						}
					} else
					{
						supportsqlitedatabase = ((SupportSQLiteDatabase) (new StringBuilder()));
			//  753 1380:new             #249 <Class StringBuilder>
			//  754 1383:dup             
			//  755 1384:invokespecial   #252 <Method void StringBuilder()>
			//  756 1387:astore_1        
						((StringBuilder) (supportsqlitedatabase)).append("Migration didn't properly handle WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
			//  757 1388:aload_1         
			//  758 1389:ldc2            #279 <String "Migration didn't properly handle WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n">
			//  759 1392:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
			//  760 1395:pop             
						((StringBuilder) (supportsqlitedatabase)).append(obj1);
			//  761 1396:aload_1         
			//  762 1397:aload_2         
			//  763 1398:invokevirtual   #261 <Method StringBuilder StringBuilder.append(Object)>
			//  764 1401:pop             
						((StringBuilder) (supportsqlitedatabase)).append("\n");
			//  765 1402:aload_1         
			//  766 1403:ldc2            #263 <String "\n">
			//  767 1406:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
			//  768 1409:pop             
						((StringBuilder) (supportsqlitedatabase)).append(" Found:\n");
			//  769 1410:aload_1         
			//  770 1411:ldc2            #265 <String " Found:\n">
			//  771 1414:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
			//  772 1417:pop             
						((StringBuilder) (supportsqlitedatabase)).append(obj2);
			//  773 1418:aload_1         
			//  774 1419:aload_3         
			//  775 1420:invokevirtual   #261 <Method StringBuilder StringBuilder.append(Object)>
			//  776 1423:pop             
						throw new IllegalStateException(((StringBuilder) (supportsqlitedatabase)).toString());
			//  777 1424:new             #267 <Class IllegalStateException>
			//  778 1427:dup             
			//  779 1428:aload_1         
			//  780 1429:invokevirtual   #271 <Method String StringBuilder.toString()>
			//  781 1432:invokespecial   #273 <Method void IllegalStateException(String)>
			//  782 1435:athrow          
					}
				} else
				{
					supportsqlitedatabase = ((SupportSQLiteDatabase) (new StringBuilder()));
			//  783 1436:new             #249 <Class StringBuilder>
			//  784 1439:dup             
			//  785 1440:invokespecial   #252 <Method void StringBuilder()>
			//  786 1443:astore_1        
					((StringBuilder) (supportsqlitedatabase)).append("Migration didn't properly handle Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
			//  787 1444:aload_1         
			//  788 1445:ldc2            #281 <String "Migration didn't properly handle Dependency(androidx.work.impl.model.Dependency).\n Expected:\n">
			//  789 1448:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
			//  790 1451:pop             
					((StringBuilder) (supportsqlitedatabase)).append(obj1);
			//  791 1452:aload_1         
			//  792 1453:aload_2         
			//  793 1454:invokevirtual   #261 <Method StringBuilder StringBuilder.append(Object)>
			//  794 1457:pop             
					((StringBuilder) (supportsqlitedatabase)).append("\n");
			//  795 1458:aload_1         
			//  796 1459:ldc2            #263 <String "\n">
			//  797 1462:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
			//  798 1465:pop             
					((StringBuilder) (supportsqlitedatabase)).append(" Found:\n");
			//  799 1466:aload_1         
			//  800 1467:ldc2            #265 <String " Found:\n">
			//  801 1470:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
			//  802 1473:pop             
					((StringBuilder) (supportsqlitedatabase)).append(obj2);
			//  803 1474:aload_1         
			//  804 1475:aload_3         
			//  805 1476:invokevirtual   #261 <Method StringBuilder StringBuilder.append(Object)>
			//  806 1479:pop             
					throw new IllegalStateException(((StringBuilder) (supportsqlitedatabase)).toString());
			//  807 1480:new             #267 <Class IllegalStateException>
			//  808 1483:dup             
			//  809 1484:aload_1         
			//  810 1485:invokevirtual   #271 <Method String StringBuilder.toString()>
			//  811 1488:invokespecial   #273 <Method void IllegalStateException(String)>
			//  812 1491:athrow          
				}
			}

			final WorkDatabase_Impl this$0;

			
			{
				this$0 = WorkDatabase_Impl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field WorkDatabase_Impl this$0>
				super(i);
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:invokespecial   #19  <Method void android.arch.persistence.room.RoomOpenHelper$Delegate(int)>
			//    6   10:return          
			}
		}
)), "c45e5fcbdf3824dead9778f19e2fd8af", "433431a854c108416da77d9b397eaeec")));
	//    0    0:new             #143 <Class RoomOpenHelper>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:new             #6   <Class WorkDatabase_Impl$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:iconst_4        
	//    7   11:invokespecial   #146 <Method void WorkDatabase_Impl$1(WorkDatabase_Impl, int)>
	//    8   14:ldc1            #148 <String "c45e5fcbdf3824dead9778f19e2fd8af">
	//    9   16:ldc1            #150 <String "433431a854c108416da77d9b397eaeec">
	//   10   18:invokespecial   #153 <Method void RoomOpenHelper(DatabaseConfiguration, android.arch.persistence.room.RoomOpenHelper$Delegate, String, String)>
	//   11   21:astore_2        
		obj = ((Object) (android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration.builder(databaseconfiguration.context).name(databaseconfiguration.name).callback(((android.arch.persistence.db.SupportSQLiteOpenHelper.Callback) (obj))).build()));
	//   12   22:aload_1         
	//   13   23:getfield        #159 <Field android.content.Context DatabaseConfiguration.context>
	//   14   26:invokestatic    #165 <Method android.arch.persistence.db.SupportSQLiteOpenHelper$Configuration$Builder android.arch.persistence.db.SupportSQLiteOpenHelper$Configuration.builder(android.content.Context)>
	//   15   29:aload_1         
	//   16   30:getfield        #169 <Field String DatabaseConfiguration.name>
	//   17   33:invokevirtual   #174 <Method android.arch.persistence.db.SupportSQLiteOpenHelper$Configuration$Builder android.arch.persistence.db.SupportSQLiteOpenHelper$Configuration$Builder.name(String)>
	//   18   36:aload_2         
	//   19   37:invokevirtual   #178 <Method android.arch.persistence.db.SupportSQLiteOpenHelper$Configuration$Builder android.arch.persistence.db.SupportSQLiteOpenHelper$Configuration$Builder.callback(android.arch.persistence.db.SupportSQLiteOpenHelper$Callback)>
	//   20   40:invokevirtual   #182 <Method android.arch.persistence.db.SupportSQLiteOpenHelper$Configuration android.arch.persistence.db.SupportSQLiteOpenHelper$Configuration$Builder.build()>
	//   21   43:astore_2        
		return databaseconfiguration.sqliteOpenHelperFactory.create(((android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration) (obj)));
	//   22   44:aload_1         
	//   23   45:getfield        #186 <Field android.arch.persistence.db.SupportSQLiteOpenHelper$Factory DatabaseConfiguration.sqliteOpenHelperFactory>
	//   24   48:aload_2         
	//   25   49:invokeinterface #192 <Method SupportSQLiteOpenHelper android.arch.persistence.db.SupportSQLiteOpenHelper$Factory.create(android.arch.persistence.db.SupportSQLiteOpenHelper$Configuration)>
	//   26   54:areturn         
	}

	public DependencyDao dependencyDao()
	{
		if(_dependencyDao != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #196 <Field DependencyDao _dependencyDao>
	//*   2    4:ifnull          12
			return _dependencyDao;
	//    3    7:aload_0         
	//    4    8:getfield        #196 <Field DependencyDao _dependencyDao>
	//    5   11:areturn         
		this;
	//    6   12:aload_0         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		DependencyDao dependencydao;
		if(_dependencyDao == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #196 <Field DependencyDao _dependencyDao>
	//*  10   18:ifnonnull       33
			_dependencyDao = ((DependencyDao) (new DependencyDao_Impl(((android.arch.persistence.room.RoomDatabase) (this)))));
	//   11   21:aload_0         
	//   12   22:new             #198 <Class DependencyDao_Impl>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #201 <Method void DependencyDao_Impl(android.arch.persistence.room.RoomDatabase)>
	//   16   30:putfield        #196 <Field DependencyDao _dependencyDao>
		dependencydao = _dependencyDao;
	//   17   33:aload_0         
	//   18   34:getfield        #196 <Field DependencyDao _dependencyDao>
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
	//*   1    1:getfield        #205 <Field SystemIdInfoDao _systemIdInfoDao>
	//*   2    4:ifnull          12
			return _systemIdInfoDao;
	//    3    7:aload_0         
	//    4    8:getfield        #205 <Field SystemIdInfoDao _systemIdInfoDao>
	//    5   11:areturn         
		this;
	//    6   12:aload_0         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		SystemIdInfoDao systemidinfodao;
		if(_systemIdInfoDao == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #205 <Field SystemIdInfoDao _systemIdInfoDao>
	//*  10   18:ifnonnull       33
			_systemIdInfoDao = ((SystemIdInfoDao) (new SystemIdInfoDao_Impl(((android.arch.persistence.room.RoomDatabase) (this)))));
	//   11   21:aload_0         
	//   12   22:new             #207 <Class SystemIdInfoDao_Impl>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #208 <Method void SystemIdInfoDao_Impl(android.arch.persistence.room.RoomDatabase)>
	//   16   30:putfield        #205 <Field SystemIdInfoDao _systemIdInfoDao>
		systemidinfodao = _systemIdInfoDao;
	//   17   33:aload_0         
	//   18   34:getfield        #205 <Field SystemIdInfoDao _systemIdInfoDao>
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
	//*   1    1:getfield        #212 <Field WorkNameDao _workNameDao>
	//*   2    4:ifnull          12
			return _workNameDao;
	//    3    7:aload_0         
	//    4    8:getfield        #212 <Field WorkNameDao _workNameDao>
	//    5   11:areturn         
		this;
	//    6   12:aload_0         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		WorkNameDao worknamedao;
		if(_workNameDao == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #212 <Field WorkNameDao _workNameDao>
	//*  10   18:ifnonnull       33
			_workNameDao = ((WorkNameDao) (new WorkNameDao_Impl(((android.arch.persistence.room.RoomDatabase) (this)))));
	//   11   21:aload_0         
	//   12   22:new             #214 <Class WorkNameDao_Impl>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #215 <Method void WorkNameDao_Impl(android.arch.persistence.room.RoomDatabase)>
	//   16   30:putfield        #212 <Field WorkNameDao _workNameDao>
		worknamedao = _workNameDao;
	//   17   33:aload_0         
	//   18   34:getfield        #212 <Field WorkNameDao _workNameDao>
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
	//*   1    1:getfield        #219 <Field WorkSpecDao _workSpecDao>
	//*   2    4:ifnull          12
			return _workSpecDao;
	//    3    7:aload_0         
	//    4    8:getfield        #219 <Field WorkSpecDao _workSpecDao>
	//    5   11:areturn         
		this;
	//    6   12:aload_0         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		WorkSpecDao workspecdao;
		if(_workSpecDao == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #219 <Field WorkSpecDao _workSpecDao>
	//*  10   18:ifnonnull       33
			_workSpecDao = ((WorkSpecDao) (new WorkSpecDao_Impl(((android.arch.persistence.room.RoomDatabase) (this)))));
	//   11   21:aload_0         
	//   12   22:new             #221 <Class WorkSpecDao_Impl>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #222 <Method void WorkSpecDao_Impl(android.arch.persistence.room.RoomDatabase)>
	//   16   30:putfield        #219 <Field WorkSpecDao _workSpecDao>
		workspecdao = _workSpecDao;
	//   17   33:aload_0         
	//   18   34:getfield        #219 <Field WorkSpecDao _workSpecDao>
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
	//*   1    1:getfield        #226 <Field WorkTagDao _workTagDao>
	//*   2    4:ifnull          12
			return _workTagDao;
	//    3    7:aload_0         
	//    4    8:getfield        #226 <Field WorkTagDao _workTagDao>
	//    5   11:areturn         
		this;
	//    6   12:aload_0         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		WorkTagDao worktagdao;
		if(_workTagDao == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #226 <Field WorkTagDao _workTagDao>
	//*  10   18:ifnonnull       33
			_workTagDao = ((WorkTagDao) (new WorkTagDao_Impl(((android.arch.persistence.room.RoomDatabase) (this)))));
	//   11   21:aload_0         
	//   12   22:new             #228 <Class WorkTagDao_Impl>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #229 <Method void WorkTagDao_Impl(android.arch.persistence.room.RoomDatabase)>
	//   16   30:putfield        #226 <Field WorkTagDao _workTagDao>
		worktagdao = _workTagDao;
	//   17   33:aload_0         
	//   18   34:getfield        #226 <Field WorkTagDao _workTagDao>
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
	//    1    1:getfield        #28  <Field List mCallbacks>
	//    2    4:areturn         
	}

*/


/*
	static List access$100(WorkDatabase_Impl workdatabase_impl)
	{
		return workdatabase_impl.mCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List mCallbacks>
	//    2    4:areturn         
	}

*/


/*
	static List access$200(WorkDatabase_Impl workdatabase_impl)
	{
		return workdatabase_impl.mCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List mCallbacks>
	//    2    4:areturn         
	}

*/


/*
	static SupportSQLiteDatabase access$302(WorkDatabase_Impl workdatabase_impl, SupportSQLiteDatabase supportsqlitedatabase)
	{
		workdatabase_impl.mDatabase = supportsqlitedatabase;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field SupportSQLiteDatabase mDatabase>
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
	//    2    2:invokevirtual   #42  <Method void internalInitInvalidationTracker(SupportSQLiteDatabase)>
		return;
	//    3    5:return          
	}

*/


/*
	static List access$500(WorkDatabase_Impl workdatabase_impl)
	{
		return workdatabase_impl.mCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List mCallbacks>
	//    2    4:areturn         
	}

*/


/*
	static List access$600(WorkDatabase_Impl workdatabase_impl)
	{
		return workdatabase_impl.mCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List mCallbacks>
	//    2    4:areturn         
	}

*/


/*
	static List access$700(WorkDatabase_Impl workdatabase_impl)
	{
		return workdatabase_impl.mCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List mCallbacks>
	//    2    4:areturn         
	}

*/
}
