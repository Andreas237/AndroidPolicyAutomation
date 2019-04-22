// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;

import android.content.Context;
import java.util.List;
import java.util.Set;

public class DatabaseConfiguration
{

	public DatabaseConfiguration(Context context1, String s, android.arch.persistence.db.SupportSQLiteOpenHelper.Factory factory, RoomDatabase.MigrationContainer migrationcontainer, List list, boolean flag, RoomDatabase.JournalMode journalmode, 
			boolean flag1, Set set)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		sqliteOpenHelperFactory = factory;
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:putfield        #36  <Field android.arch.persistence.db.SupportSQLiteOpenHelper$Factory sqliteOpenHelperFactory>
		context = context1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #38  <Field Context context>
		name = s;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #40  <Field String name>
		migrationContainer = migrationcontainer;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #42  <Field RoomDatabase$MigrationContainer migrationContainer>
		callbacks = list;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #44  <Field List callbacks>
		allowMainThreadQueries = flag;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #46  <Field boolean allowMainThreadQueries>
		journalMode = journalmode;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #48  <Field RoomDatabase$JournalMode journalMode>
		requireMigration = flag1;
	//   23   43:aload_0         
	//   24   44:iload           8
	//   25   46:putfield        #50  <Field boolean requireMigration>
		mMigrationNotRequiredFrom = set;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #52  <Field Set mMigrationNotRequiredFrom>
	//   29   55:return          
	}

	public boolean isMigrationRequiredFrom(int i)
	{
		if(requireMigration)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field boolean requireMigration>
	//*   2    4:ifeq            31
		{
			Set set = mMigrationNotRequiredFrom;
	//    3    7:aload_0         
	//    4    8:getfield        #52  <Field Set mMigrationNotRequiredFrom>
	//    5   11:astore_2        
			if(set == null || !set.contains(((Object) (Integer.valueOf(i)))))
	//*   6   12:aload_2         
	//*   7   13:ifnull          29
	//*   8   16:aload_2         
	//*   9   17:iload_1         
	//*  10   18:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//*  11   21:invokeinterface #71  <Method boolean Set.contains(Object)>
	//*  12   26:ifne            31
				return true;
	//   13   29:iconst_1        
	//   14   30:ireturn         
		}
		return false;
	//   15   31:iconst_0        
	//   16   32:ireturn         
	}

	public final boolean allowMainThreadQueries;
	public final List callbacks;
	public final Context context;
	public final RoomDatabase.JournalMode journalMode;
	private final Set mMigrationNotRequiredFrom;
	public final RoomDatabase.MigrationContainer migrationContainer;
	public final String name;
	public final boolean requireMigration;
	public final android.arch.persistence.db.SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory;
}
