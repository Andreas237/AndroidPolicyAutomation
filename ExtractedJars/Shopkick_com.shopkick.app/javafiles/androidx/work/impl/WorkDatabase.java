// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.migration.Migration;
import android.content.Context;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import java.util.concurrent.TimeUnit;

// Referenced classes of package androidx.work.impl:
//			WorkDatabaseMigrations

public abstract class WorkDatabase extends RoomDatabase
{

	public WorkDatabase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void RoomDatabase()>
	//    2    4:return          
	}

	public static WorkDatabase create(Context context, boolean flag)
	{
		android.arch.persistence.room.RoomDatabase.Builder builder;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            17
			builder = Room.inMemoryDatabaseBuilder(context, androidx/work/impl/WorkDatabase).allowMainThreadQueries();
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class WorkDatabase>
	//    4    7:invokestatic    #65  <Method android.arch.persistence.room.RoomDatabase$Builder Room.inMemoryDatabaseBuilder(Context, Class)>
	//    5   10:invokevirtual   #71  <Method android.arch.persistence.room.RoomDatabase$Builder android.arch.persistence.room.RoomDatabase$Builder.allowMainThreadQueries()>
	//    6   13:astore_2        
		else
	//*   7   14:goto            26
			builder = Room.databaseBuilder(context, androidx/work/impl/WorkDatabase, "androidx.work.workdb");
	//    8   17:aload_0         
	//    9   18:ldc1            #2   <Class WorkDatabase>
	//   10   20:ldc1            #29  <String "androidx.work.workdb">
	//   11   22:invokestatic    #75  <Method android.arch.persistence.room.RoomDatabase$Builder Room.databaseBuilder(Context, Class, String)>
	//   12   25:astore_2        
		return (WorkDatabase)builder.addCallback(generateCleanupCallback()).addMigrations(new Migration[] {
			WorkDatabaseMigrations.MIGRATION_1_2
		}).addMigrations(new Migration[] {
			new WorkDatabaseMigrations.WorkMigration(context, 2, 3)
		}).addMigrations(new Migration[] {
			WorkDatabaseMigrations.MIGRATION_3_4
		}).addMigrations(new Migration[] {
			WorkDatabaseMigrations.MIGRATION_4_5
		}).fallbackToDestructiveMigration().build();
	//   13   26:aload_2         
	//   14   27:invokestatic    #79  <Method android.arch.persistence.room.RoomDatabase$Callback generateCleanupCallback()>
	//   15   30:invokevirtual   #83  <Method android.arch.persistence.room.RoomDatabase$Builder android.arch.persistence.room.RoomDatabase$Builder.addCallback(android.arch.persistence.room.RoomDatabase$Callback)>
	//   16   33:iconst_1        
	//   17   34:anewarray       Migration[]
	//   18   37:dup             
	//   19   38:iconst_0        
	//   20   39:getstatic       #91  <Field Migration WorkDatabaseMigrations.MIGRATION_1_2>
	//   21   42:aastore         
	//   22   43:invokevirtual   #95  <Method android.arch.persistence.room.RoomDatabase$Builder android.arch.persistence.room.RoomDatabase$Builder.addMigrations(Migration[])>
	//   23   46:iconst_1        
	//   24   47:anewarray       Migration[]
	//   25   50:dup             
	//   26   51:iconst_0        
	//   27   52:new             #97  <Class WorkDatabaseMigrations$WorkMigration>
	//   28   55:dup             
	//   29   56:aload_0         
	//   30   57:iconst_2        
	//   31   58:iconst_3        
	//   32   59:invokespecial   #100 <Method void WorkDatabaseMigrations$WorkMigration(Context, int, int)>
	//   33   62:aastore         
	//   34   63:invokevirtual   #95  <Method android.arch.persistence.room.RoomDatabase$Builder android.arch.persistence.room.RoomDatabase$Builder.addMigrations(Migration[])>
	//   35   66:iconst_1        
	//   36   67:anewarray       Migration[]
	//   37   70:dup             
	//   38   71:iconst_0        
	//   39   72:getstatic       #103 <Field Migration WorkDatabaseMigrations.MIGRATION_3_4>
	//   40   75:aastore         
	//   41   76:invokevirtual   #95  <Method android.arch.persistence.room.RoomDatabase$Builder android.arch.persistence.room.RoomDatabase$Builder.addMigrations(Migration[])>
	//   42   79:iconst_1        
	//   43   80:anewarray       Migration[]
	//   44   83:dup             
	//   45   84:iconst_0        
	//   46   85:getstatic       #106 <Field Migration WorkDatabaseMigrations.MIGRATION_4_5>
	//   47   88:aastore         
	//   48   89:invokevirtual   #95  <Method android.arch.persistence.room.RoomDatabase$Builder android.arch.persistence.room.RoomDatabase$Builder.addMigrations(Migration[])>
	//   49   92:invokevirtual   #109 <Method android.arch.persistence.room.RoomDatabase$Builder android.arch.persistence.room.RoomDatabase$Builder.fallbackToDestructiveMigration()>
	//   50   95:invokevirtual   #113 <Method RoomDatabase android.arch.persistence.room.RoomDatabase$Builder.build()>
	//   51   98:checkcast       #2   <Class WorkDatabase>
	//   52  101:areturn         
	}

	static android.arch.persistence.room.RoomDatabase.Callback generateCleanupCallback()
	{
		return ((android.arch.persistence.room.RoomDatabase.Callback) (new android.arch.persistence.room.RoomDatabase.Callback() {

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

		}
));
	//    0    0:new             #6   <Class WorkDatabase$1>
	//    1    3:dup             
	//    2    4:invokespecial   #114 <Method void WorkDatabase$1()>
	//    3    7:areturn         
	}

	static long getPruneDate()
	{
		return System.currentTimeMillis() - PRUNE_THRESHOLD_MILLIS;
	//    0    0:invokestatic    #121 <Method long System.currentTimeMillis()>
	//    1    3:getstatic       #53  <Field long PRUNE_THRESHOLD_MILLIS>
	//    2    6:lsub            
	//    3    7:lreturn         
	}

	static String getPruneSQL()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #125 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #126 <Method void StringBuilder()>
	//    3    7:astore_0        
		stringbuilder.append("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ");
	//    4    8:aload_0         
	//    5    9:ldc1            #32  <String "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ">
	//    6   11:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(getPruneDate());
	//    8   15:aload_0         
	//    9   16:invokestatic    #132 <Method long getPruneDate()>
	//   10   19:invokevirtual   #135 <Method StringBuilder StringBuilder.append(long)>
	//   11   22:pop             
		stringbuilder.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
	//   12   23:aload_0         
	//   13   24:ldc1            #35  <String " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))">
	//   14   26:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		return stringbuilder.toString();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   18   34:areturn         
	}

	public abstract DependencyDao dependencyDao();

	public abstract SystemIdInfoDao systemIdInfoDao();

	public abstract WorkNameDao workNameDao();

	public abstract WorkSpecDao workSpecDao();

	public abstract WorkTagDao workTagDao();

	private static final String CLEANUP_SQL = "UPDATE workspec SET state=0, schedule_requested_at=-1 WHERE state=1";
	private static final String DB_NAME = "androidx.work.workdb";
	private static final String PRUNE_SQL_FORMAT_PREFIX = "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ";
	private static final String PRUNE_SQL_FORMAT_SUFFIX = " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
	private static final long PRUNE_THRESHOLD_MILLIS;

	static 
	{
		PRUNE_THRESHOLD_MILLIS = TimeUnit.DAYS.toMillis(7L);
	//    0    0:getstatic       #45  <Field TimeUnit TimeUnit.DAYS>
	//    1    3:ldc2w           #46  <Long 7L>
	//    2    6:invokevirtual   #51  <Method long TimeUnit.toMillis(long)>
	//    3    9:putstatic       #53  <Field long PRUNE_THRESHOLD_MILLIS>
	//*   4   12:return          
	}
}
