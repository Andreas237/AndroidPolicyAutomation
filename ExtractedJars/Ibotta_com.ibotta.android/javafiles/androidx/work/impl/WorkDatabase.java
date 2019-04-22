// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.migration.Migration;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import com.newrelic.agent.android.instrumentation.SQLiteInstrumentation;
import java.util.concurrent.TimeUnit;

// Referenced classes of package androidx.work.impl:
//			WorkDatabaseMigrations

public abstract class WorkDatabase extends RoomDatabase
{

	public WorkDatabase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void RoomDatabase()>
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
	//    4    7:invokestatic    #52  <Method android.arch.persistence.room.RoomDatabase$Builder Room.inMemoryDatabaseBuilder(Context, Class)>
	//    5   10:invokevirtual   #58  <Method android.arch.persistence.room.RoomDatabase$Builder android.arch.persistence.room.RoomDatabase$Builder.allowMainThreadQueries()>
	//    6   13:astore_2        
		else
	//*   7   14:goto            26
			builder = Room.databaseBuilder(context, androidx/work/impl/WorkDatabase, "androidx.work.workdb");
	//    8   17:aload_0         
	//    9   18:ldc1            #2   <Class WorkDatabase>
	//   10   20:ldc1            #60  <String "androidx.work.workdb">
	//   11   22:invokestatic    #64  <Method android.arch.persistence.room.RoomDatabase$Builder Room.databaseBuilder(Context, Class, String)>
	//   12   25:astore_2        
		return (WorkDatabase)builder.addCallback(generateCleanupCallback()).addMigrations(new Migration[] {
			WorkDatabaseMigrations.MIGRATION_1_2
		}).addMigrations(new Migration[] {
			new WorkDatabaseMigrations.WorkMigration(context, 2, 3)
		}).addMigrations(new Migration[] {
			WorkDatabaseMigrations.MIGRATION_3_4
		}).fallbackToDestructiveMigration().build();
	//   13   26:aload_2         
	//   14   27:invokestatic    #68  <Method android.arch.persistence.room.RoomDatabase$Callback generateCleanupCallback()>
	//   15   30:invokevirtual   #72  <Method android.arch.persistence.room.RoomDatabase$Builder android.arch.persistence.room.RoomDatabase$Builder.addCallback(android.arch.persistence.room.RoomDatabase$Callback)>
	//   16   33:iconst_1        
	//   17   34:anewarray       Migration[]
	//   18   37:dup             
	//   19   38:iconst_0        
	//   20   39:getstatic       #80  <Field Migration WorkDatabaseMigrations.MIGRATION_1_2>
	//   21   42:aastore         
	//   22   43:invokevirtual   #84  <Method android.arch.persistence.room.RoomDatabase$Builder android.arch.persistence.room.RoomDatabase$Builder.addMigrations(Migration[])>
	//   23   46:iconst_1        
	//   24   47:anewarray       Migration[]
	//   25   50:dup             
	//   26   51:iconst_0        
	//   27   52:new             #86  <Class WorkDatabaseMigrations$WorkMigration>
	//   28   55:dup             
	//   29   56:aload_0         
	//   30   57:iconst_2        
	//   31   58:iconst_3        
	//   32   59:invokespecial   #89  <Method void WorkDatabaseMigrations$WorkMigration(Context, int, int)>
	//   33   62:aastore         
	//   34   63:invokevirtual   #84  <Method android.arch.persistence.room.RoomDatabase$Builder android.arch.persistence.room.RoomDatabase$Builder.addMigrations(Migration[])>
	//   35   66:iconst_1        
	//   36   67:anewarray       Migration[]
	//   37   70:dup             
	//   38   71:iconst_0        
	//   39   72:getstatic       #92  <Field Migration WorkDatabaseMigrations.MIGRATION_3_4>
	//   40   75:aastore         
	//   41   76:invokevirtual   #84  <Method android.arch.persistence.room.RoomDatabase$Builder android.arch.persistence.room.RoomDatabase$Builder.addMigrations(Migration[])>
	//   42   79:invokevirtual   #95  <Method android.arch.persistence.room.RoomDatabase$Builder android.arch.persistence.room.RoomDatabase$Builder.fallbackToDestructiveMigration()>
	//   43   82:invokevirtual   #99  <Method RoomDatabase android.arch.persistence.room.RoomDatabase$Builder.build()>
	//   44   85:checkcast       #2   <Class WorkDatabase>
	//   45   88:areturn         
	}

	static android.arch.persistence.room.RoomDatabase.Callback generateCleanupCallback()
	{
		return ((android.arch.persistence.room.RoomDatabase.Callback) (new android.arch.persistence.room.RoomDatabase.Callback() {

			public void onOpen(SupportSQLiteDatabase supportsqlitedatabase)
			{
				super.onOpen(supportsqlitedatabase);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokespecial   #20  <Method void android.arch.persistence.room.RoomDatabase$Callback.onOpen(SupportSQLiteDatabase)>
				supportsqlitedatabase.beginTransaction();
			//    3    5:aload_1         
			//    4    6:invokeinterface #25  <Method void SupportSQLiteDatabase.beginTransaction()>
				if(!(supportsqlitedatabase instanceof SQLiteDatabase))
			//*   5   11:aload_1         
			//*   6   12:instanceof      #27  <Class SQLiteDatabase>
			//*   7   15:ifne            29
				{
					supportsqlitedatabase.execSQL("UPDATE workspec SET state=0, schedule_requested_at=-1 WHERE state=1");
			//    8   18:aload_1         
			//    9   19:ldc1            #29  <String "UPDATE workspec SET state=0, schedule_requested_at=-1 WHERE state=1">
			//   10   21:invokeinterface #33  <Method void SupportSQLiteDatabase.execSQL(String)>
					break MISSING_BLOCK_LABEL_38;
			//   11   26:goto            38
				}
				SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, "UPDATE workspec SET state=0, schedule_requested_at=-1 WHERE state=1");
			//   12   29:aload_1         
			//   13   30:checkcast       #27  <Class SQLiteDatabase>
			//   14   33:ldc1            #29  <String "UPDATE workspec SET state=0, schedule_requested_at=-1 WHERE state=1">
			//   15   35:invokestatic    #38  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
				String s;
				s = WorkDatabase.getPruneSQL();
			//   16   38:invokestatic    #42  <Method String WorkDatabase.getPruneSQL()>
			//   17   41:astore_2        
				if(!(supportsqlitedatabase instanceof SQLiteDatabase))
			//*  18   42:aload_1         
			//*  19   43:instanceof      #27  <Class SQLiteDatabase>
			//*  20   46:ifne            59
				{
					supportsqlitedatabase.execSQL(s);
			//   21   49:aload_1         
			//   22   50:aload_2         
			//   23   51:invokeinterface #33  <Method void SupportSQLiteDatabase.execSQL(String)>
					break MISSING_BLOCK_LABEL_67;
			//   24   56:goto            67
				}
				SQLiteInstrumentation.execSQL((SQLiteDatabase)supportsqlitedatabase, s);
			//   25   59:aload_1         
			//   26   60:checkcast       #27  <Class SQLiteDatabase>
			//   27   63:aload_2         
			//   28   64:invokestatic    #38  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
				supportsqlitedatabase.setTransactionSuccessful();
			//   29   67:aload_1         
			//   30   68:invokeinterface #45  <Method void SupportSQLiteDatabase.setTransactionSuccessful()>
				supportsqlitedatabase.endTransaction();
			//   31   73:aload_1         
			//   32   74:invokeinterface #48  <Method void SupportSQLiteDatabase.endTransaction()>
				return;
			//   33   79:return          
				Exception exception;
				exception;
			//   34   80:astore_2        
				supportsqlitedatabase.endTransaction();
			//   35   81:aload_1         
			//   36   82:invokeinterface #48  <Method void SupportSQLiteDatabase.endTransaction()>
				throw exception;
			//   37   87:aload_2         
			//   38   88:athrow          
			}

		}
));
	//    0    0:new             #6   <Class WorkDatabase$1>
	//    1    3:dup             
	//    2    4:invokespecial   #100 <Method void WorkDatabase$1()>
	//    3    7:areturn         
	}

	static long getPruneDate()
	{
		return System.currentTimeMillis() - PRUNE_THRESHOLD_MILLIS;
	//    0    0:invokestatic    #107 <Method long System.currentTimeMillis()>
	//    1    3:getstatic       #40  <Field long PRUNE_THRESHOLD_MILLIS>
	//    2    6:lsub            
	//    3    7:lreturn         
	}

	static String getPruneSQL()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #111 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #112 <Method void StringBuilder()>
	//    3    7:astore_0        
		stringbuilder.append("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ");
	//    4    8:aload_0         
	//    5    9:ldc1            #114 <String "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ">
	//    6   11:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(getPruneDate());
	//    8   15:aload_0         
	//    9   16:invokestatic    #120 <Method long getPruneDate()>
	//   10   19:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//   11   22:pop             
		stringbuilder.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
	//   12   23:aload_0         
	//   13   24:ldc1            #125 <String " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))">
	//   14   26:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		return stringbuilder.toString();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   18   34:areturn         
	}

	public abstract DependencyDao dependencyDao();

	public abstract SystemIdInfoDao systemIdInfoDao();

	public abstract WorkNameDao workNameDao();

	public abstract WorkSpecDao workSpecDao();

	public abstract WorkTagDao workTagDao();

	private static final long PRUNE_THRESHOLD_MILLIS;

	static 
	{
		PRUNE_THRESHOLD_MILLIS = TimeUnit.DAYS.toMillis(7L);
	//    0    0:getstatic       #32  <Field TimeUnit TimeUnit.DAYS>
	//    1    3:ldc2w           #33  <Long 7L>
	//    2    6:invokevirtual   #38  <Method long TimeUnit.toMillis(long)>
	//    3    9:putstatic       #40  <Field long PRUNE_THRESHOLD_MILLIS>
	//*   4   12:return          
	}
}
