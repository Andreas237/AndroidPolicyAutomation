// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;

import android.app.ActivityManager;
import android.arch.core.executor.ArchTaskExecutor;
import android.arch.persistence.db.*;
import android.arch.persistence.db.framework.FrameworkSQLiteOpenHelperFactory;
import android.arch.persistence.room.migration.Migration;
import android.content.Context;
import android.database.Cursor;
import android.support.v4.app.ActivityManagerCompat;
import android.support.v4.util.SparseArrayCompat;
import android.util.Log;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package android.arch.persistence.room:
//			InvalidationTracker, DatabaseConfiguration, Room

public abstract class RoomDatabase
{
	public static class Builder
	{

		public Builder addCallback(Callback callback)
		{
			if(mCallbacks == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #66  <Field ArrayList mCallbacks>
		//*   2    4:ifnonnull       18
				mCallbacks = new ArrayList();
		//    3    7:aload_0         
		//    4    8:new             #68  <Class ArrayList>
		//    5   11:dup             
		//    6   12:invokespecial   #69  <Method void ArrayList()>
		//    7   15:putfield        #66  <Field ArrayList mCallbacks>
			mCallbacks.add(((Object) (callback)));
		//    8   18:aload_0         
		//    9   19:getfield        #66  <Field ArrayList mCallbacks>
		//   10   22:aload_1         
		//   11   23:invokevirtual   #73  <Method boolean ArrayList.add(Object)>
		//   12   26:pop             
			return this;
		//   13   27:aload_0         
		//   14   28:areturn         
		}

		public transient Builder addMigrations(Migration amigration[])
		{
			if(mMigrationStartAndEndVersions == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #79  <Field Set mMigrationStartAndEndVersions>
		//*   2    4:ifnonnull       18
				mMigrationStartAndEndVersions = ((Set) (new HashSet()));
		//    3    7:aload_0         
		//    4    8:new             #81  <Class HashSet>
		//    5   11:dup             
		//    6   12:invokespecial   #82  <Method void HashSet()>
		//    7   15:putfield        #79  <Field Set mMigrationStartAndEndVersions>
			int j = amigration.length;
		//    8   18:aload_1         
		//    9   19:arraylength     
		//   10   20:istore_3        
			for(int i = 0; i < j; i++)
		//*  11   21:iconst_0        
		//*  12   22:istore_2        
		//*  13   23:iload_2         
		//*  14   24:iload_3         
		//*  15   25:icmpge          76
			{
				Migration migration = amigration[i];
		//   16   28:aload_1         
		//   17   29:iload_2         
		//   18   30:aaload          
		//   19   31:astore          4
				mMigrationStartAndEndVersions.add(((Object) (Integer.valueOf(migration.startVersion))));
		//   20   33:aload_0         
		//   21   34:getfield        #79  <Field Set mMigrationStartAndEndVersions>
		//   22   37:aload           4
		//   23   39:getfield        #88  <Field int Migration.startVersion>
		//   24   42:invokestatic    #94  <Method Integer Integer.valueOf(int)>
		//   25   45:invokeinterface #97  <Method boolean Set.add(Object)>
		//   26   50:pop             
				mMigrationStartAndEndVersions.add(((Object) (Integer.valueOf(migration.endVersion))));
		//   27   51:aload_0         
		//   28   52:getfield        #79  <Field Set mMigrationStartAndEndVersions>
		//   29   55:aload           4
		//   30   57:getfield        #100 <Field int Migration.endVersion>
		//   31   60:invokestatic    #94  <Method Integer Integer.valueOf(int)>
		//   32   63:invokeinterface #97  <Method boolean Set.add(Object)>
		//   33   68:pop             
			}

		//   34   69:iload_2         
		//   35   70:iconst_1        
		//   36   71:iadd            
		//   37   72:istore_2        
		//*  38   73:goto            23
			mMigrationContainer.addMigrations(amigration);
		//   39   76:aload_0         
		//   40   77:getfield        #58  <Field RoomDatabase$MigrationContainer mMigrationContainer>
		//   41   80:aload_1         
		//   42   81:invokevirtual   #103 <Method void RoomDatabase$MigrationContainer.addMigrations(Migration[])>
			return this;
		//   43   84:aload_0         
		//   44   85:areturn         
		}

		public Builder allowMainThreadQueries()
		{
			mAllowMainThreadQueries = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #108 <Field boolean mAllowMainThreadQueries>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public RoomDatabase build()
		{
label0:
			{
label1:
				{
label2:
					{
						if(mContext == null)
							break label0;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field Context mContext>
		//    2    4:ifnull          203
						if(mDatabaseClass == null)
							break label1;
		//    3    7:aload_0         
		//    4    8:getfield        #42  <Field Class mDatabaseClass>
		//    5   11:ifnull          193
						Object obj = ((Object) (mMigrationStartAndEndVersions));
		//    6   14:aload_0         
		//    7   15:getfield        #79  <Field Set mMigrationStartAndEndVersions>
		//    8   18:astore_1        
						if(obj == null || mMigrationsNotRequiredFrom == null)
							break label2;
		//    9   19:aload_1         
		//   10   20:ifnull          105
		//   11   23:aload_0         
		//   12   24:getfield        #113 <Field Set mMigrationsNotRequiredFrom>
		//   13   27:ifnull          105
						Object obj2 = ((Object) (((Set) (obj)).iterator()));
		//   14   30:aload_1         
		//   15   31:invokeinterface #117 <Method Iterator Set.iterator()>
		//   16   36:astore_2        
						do
						{
							if(!((Iterator) (obj2)).hasNext())
								break label2;
		//   17   37:aload_2         
		//   18   38:invokeinterface #123 <Method boolean Iterator.hasNext()>
		//   19   43:ifeq            105
							obj = ((Object) ((Integer)((Iterator) (obj2)).next()));
		//   20   46:aload_2         
		//   21   47:invokeinterface #127 <Method Object Iterator.next()>
		//   22   52:checkcast       #90  <Class Integer>
		//   23   55:astore_1        
						} while(!mMigrationsNotRequiredFrom.contains(obj));
		//   24   56:aload_0         
		//   25   57:getfield        #113 <Field Set mMigrationsNotRequiredFrom>
		//   26   60:aload_1         
		//   27   61:invokeinterface #130 <Method boolean Set.contains(Object)>
		//   28   66:ifne            72
		//*  29   69:goto            37
						obj2 = ((Object) (new StringBuilder()));
		//   30   72:new             #132 <Class StringBuilder>
		//   31   75:dup             
		//   32   76:invokespecial   #133 <Method void StringBuilder()>
		//   33   79:astore_2        
						((StringBuilder) (obj2)).append("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ");
		//   34   80:aload_2         
		//   35   81:ldc1            #135 <String "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ">
		//   36   83:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
		//   37   86:pop             
						((StringBuilder) (obj2)).append(obj);
		//   38   87:aload_2         
		//   39   88:aload_1         
		//   40   89:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
		//   41   92:pop             
						throw new IllegalArgumentException(((StringBuilder) (obj2)).toString());
		//   42   93:new             #144 <Class IllegalArgumentException>
		//   43   96:dup             
		//   44   97:aload_2         
		//   45   98:invokevirtual   #148 <Method String StringBuilder.toString()>
		//   46  101:invokespecial   #151 <Method void IllegalArgumentException(String)>
		//   47  104:athrow          
					}
					if(mFactory == null)
		//*  48  105:aload_0         
		//*  49  106:getfield        #153 <Field android.arch.persistence.db.SupportSQLiteOpenHelper$Factory mFactory>
		//*  50  109:ifnonnull       123
						mFactory = ((android.arch.persistence.db.SupportSQLiteOpenHelper.Factory) (new FrameworkSQLiteOpenHelperFactory()));
		//   51  112:aload_0         
		//   52  113:new             #155 <Class FrameworkSQLiteOpenHelperFactory>
		//   53  116:dup             
		//   54  117:invokespecial   #156 <Method void FrameworkSQLiteOpenHelperFactory()>
		//   55  120:putfield        #153 <Field android.arch.persistence.db.SupportSQLiteOpenHelper$Factory mFactory>
					Object obj1 = ((Object) (mContext));
		//   56  123:aload_0         
		//   57  124:getfield        #40  <Field Context mContext>
		//   58  127:astore_1        
					obj1 = ((Object) (new DatabaseConfiguration(((Context) (obj1)), mName, mFactory, mMigrationContainer, ((List) (mCallbacks)), mAllowMainThreadQueries, mJournalMode.resolve(((Context) (obj1))), mRequireMigration, mMigrationsNotRequiredFrom)));
		//   59  128:new             #158 <Class DatabaseConfiguration>
		//   60  131:dup             
		//   61  132:aload_1         
		//   62  133:aload_0         
		//   63  134:getfield        #44  <Field String mName>
		//   64  137:aload_0         
		//   65  138:getfield        #153 <Field android.arch.persistence.db.SupportSQLiteOpenHelper$Factory mFactory>
		//   66  141:aload_0         
		//   67  142:getfield        #58  <Field RoomDatabase$MigrationContainer mMigrationContainer>
		//   68  145:aload_0         
		//   69  146:getfield        #66  <Field ArrayList mCallbacks>
		//   70  149:aload_0         
		//   71  150:getfield        #108 <Field boolean mAllowMainThreadQueries>
		//   72  153:aload_0         
		//   73  154:getfield        #51  <Field RoomDatabase$JournalMode mJournalMode>
		//   74  157:aload_1         
		//   75  158:invokevirtual   #162 <Method RoomDatabase$JournalMode RoomDatabase$JournalMode.resolve(Context)>
		//   76  161:aload_0         
		//   77  162:getfield        #53  <Field boolean mRequireMigration>
		//   78  165:aload_0         
		//   79  166:getfield        #113 <Field Set mMigrationsNotRequiredFrom>
		//   80  169:invokespecial   #165 <Method void DatabaseConfiguration(Context, String, android.arch.persistence.db.SupportSQLiteOpenHelper$Factory, RoomDatabase$MigrationContainer, List, boolean, RoomDatabase$JournalMode, boolean, Set)>
		//   81  172:astore_1        
					RoomDatabase roomdatabase = (RoomDatabase)Room.getGeneratedImplementation(mDatabaseClass, "_Impl");
		//   82  173:aload_0         
		//   83  174:getfield        #42  <Field Class mDatabaseClass>
		//   84  177:ldc1            #167 <String "_Impl">
		//   85  179:invokestatic    #173 <Method Object Room.getGeneratedImplementation(Class, String)>
		//   86  182:checkcast       #7   <Class RoomDatabase>
		//   87  185:astore_2        
					roomdatabase.init(((DatabaseConfiguration) (obj1)));
		//   88  186:aload_2         
		//   89  187:aload_1         
		//   90  188:invokevirtual   #177 <Method void RoomDatabase.init(DatabaseConfiguration)>
					return roomdatabase;
		//   91  191:aload_2         
		//   92  192:areturn         
				}
				throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
		//   93  193:new             #144 <Class IllegalArgumentException>
		//   94  196:dup             
		//   95  197:ldc1            #179 <String "Must provide an abstract class that extends RoomDatabase">
		//   96  199:invokespecial   #151 <Method void IllegalArgumentException(String)>
		//   97  202:athrow          
			}
			throw new IllegalArgumentException("Cannot provide null context for the database.");
		//   98  203:new             #144 <Class IllegalArgumentException>
		//   99  206:dup             
		//  100  207:ldc1            #181 <String "Cannot provide null context for the database.">
		//  101  209:invokespecial   #151 <Method void IllegalArgumentException(String)>
		//  102  212:athrow          
		}

		public Builder fallbackToDestructiveMigration()
		{
			mRequireMigration = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #53  <Field boolean mRequireMigration>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public transient Builder fallbackToDestructiveMigrationFrom(int ai[])
		{
			if(mMigrationsNotRequiredFrom == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #113 <Field Set mMigrationsNotRequiredFrom>
		//*   2    4:ifnonnull       20
				mMigrationsNotRequiredFrom = ((Set) (new HashSet(ai.length)));
		//    3    7:aload_0         
		//    4    8:new             #81  <Class HashSet>
		//    5   11:dup             
		//    6   12:aload_1         
		//    7   13:arraylength     
		//    8   14:invokespecial   #188 <Method void HashSet(int)>
		//    9   17:putfield        #113 <Field Set mMigrationsNotRequiredFrom>
			int j = ai.length;
		//   10   20:aload_1         
		//   11   21:arraylength     
		//   12   22:istore_3        
			for(int i = 0; i < j; i++)
		//*  13   23:iconst_0        
		//*  14   24:istore_2        
		//*  15   25:iload_2         
		//*  16   26:iload_3         
		//*  17   27:icmpge          57
			{
				int k = ai[i];
		//   18   30:aload_1         
		//   19   31:iload_2         
		//   20   32:iaload          
		//   21   33:istore          4
				mMigrationsNotRequiredFrom.add(((Object) (Integer.valueOf(k))));
		//   22   35:aload_0         
		//   23   36:getfield        #113 <Field Set mMigrationsNotRequiredFrom>
		//   24   39:iload           4
		//   25   41:invokestatic    #94  <Method Integer Integer.valueOf(int)>
		//   26   44:invokeinterface #97  <Method boolean Set.add(Object)>
		//   27   49:pop             
			}

		//   28   50:iload_2         
		//   29   51:iconst_1        
		//   30   52:iadd            
		//   31   53:istore_2        
		//*  32   54:goto            25
			return this;
		//   33   57:aload_0         
		//   34   58:areturn         
		}

		public Builder openHelperFactory(android.arch.persistence.db.SupportSQLiteOpenHelper.Factory factory)
		{
			mFactory = factory;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #153 <Field android.arch.persistence.db.SupportSQLiteOpenHelper$Factory mFactory>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setJournalMode(JournalMode journalmode)
		{
			mJournalMode = journalmode;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #51  <Field RoomDatabase$JournalMode mJournalMode>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private boolean mAllowMainThreadQueries;
		private ArrayList mCallbacks;
		private final Context mContext;
		private final Class mDatabaseClass;
		private android.arch.persistence.db.SupportSQLiteOpenHelper.Factory mFactory;
		private JournalMode mJournalMode;
		private final MigrationContainer mMigrationContainer = new MigrationContainer();
		private Set mMigrationStartAndEndVersions;
		private Set mMigrationsNotRequiredFrom;
		private final String mName;
		private boolean mRequireMigration;

		Builder(Context context, Class class1, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #38  <Method void Object()>
			mContext = context;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #40  <Field Context mContext>
			mDatabaseClass = class1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #42  <Field Class mDatabaseClass>
			mName = s;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #44  <Field String mName>
			mJournalMode = JournalMode.AUTOMATIC;
		//   11   19:aload_0         
		//   12   20:getstatic       #49  <Field RoomDatabase$JournalMode RoomDatabase$JournalMode.AUTOMATIC>
		//   13   23:putfield        #51  <Field RoomDatabase$JournalMode mJournalMode>
			mRequireMigration = true;
		//   14   26:aload_0         
		//   15   27:iconst_1        
		//   16   28:putfield        #53  <Field boolean mRequireMigration>
		//   17   31:aload_0         
		//   18   32:new             #55  <Class RoomDatabase$MigrationContainer>
		//   19   35:dup             
		//   20   36:invokespecial   #56  <Method void RoomDatabase$MigrationContainer()>
		//   21   39:putfield        #58  <Field RoomDatabase$MigrationContainer mMigrationContainer>
		//   22   42:return          
		}
	}

	public static abstract class Callback
	{

		public void onCreate(SupportSQLiteDatabase supportsqlitedatabase)
		{
		//    0    0:return          
		}

		public void onOpen(SupportSQLiteDatabase supportsqlitedatabase)
		{
		//    0    0:return          
		}

		public Callback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	public static final class JournalMode extends Enum
	{

		public static JournalMode valueOf(String s)
		{
			return (JournalMode)Enum.valueOf(android/arch/persistence/room/RoomDatabase$JournalMode, s);
		//    0    0:ldc1            #2   <Class RoomDatabase$JournalMode>
		//    1    2:aload_0         
		//    2    3:invokestatic    #42  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class RoomDatabase$JournalMode>
		//    4    9:areturn         
		}

		public static JournalMode[] values()
		{
			return (JournalMode[])((JournalMode []) ($VALUES)).clone();
		//    0    0:getstatic       #34  <Field RoomDatabase$JournalMode[] $VALUES>
		//    1    3:invokevirtual   #49  <Method Object _5B_Landroid.arch.persistence.room.RoomDatabase$JournalMode_3B_.clone()>
		//    2    6:checkcast       #45  <Class RoomDatabase$JournalMode[]>
		//    3    9:areturn         
		}

		JournalMode resolve(Context context)
		{
			if(this != AUTOMATIC)
		//*   0    0:aload_0         
		//*   1    1:getstatic       #26  <Field RoomDatabase$JournalMode AUTOMATIC>
		//*   2    4:if_acmpeq       9
				return this;
		//    3    7:aload_0         
		//    4    8:areturn         
			if(android.os.Build.VERSION.SDK_INT >= 16)
		//*   5    9:getstatic       #59  <Field int android.os.Build$VERSION.SDK_INT>
		//*   6   12:bipush          16
		//*   7   14:icmplt          42
			{
				context = ((Context) ((ActivityManager)context.getSystemService("activity")));
		//    8   17:aload_1         
		//    9   18:ldc1            #61  <String "activity">
		//   10   20:invokevirtual   #67  <Method Object Context.getSystemService(String)>
		//   11   23:checkcast       #69  <Class ActivityManager>
		//   12   26:astore_1        
				if(context != null && !ActivityManagerCompat.isLowRamDevice(((ActivityManager) (context))))
		//*  13   27:aload_1         
		//*  14   28:ifnull          42
		//*  15   31:aload_1         
		//*  16   32:invokestatic    #75  <Method boolean ActivityManagerCompat.isLowRamDevice(ActivityManager)>
		//*  17   35:ifne            42
					return WRITE_AHEAD_LOGGING;
		//   18   38:getstatic       #32  <Field RoomDatabase$JournalMode WRITE_AHEAD_LOGGING>
		//   19   41:areturn         
			}
			return TRUNCATE;
		//   20   42:getstatic       #29  <Field RoomDatabase$JournalMode TRUNCATE>
		//   21   45:areturn         
		}

		private static final JournalMode $VALUES[];
		public static final JournalMode AUTOMATIC;
		public static final JournalMode TRUNCATE;
		public static final JournalMode WRITE_AHEAD_LOGGING;

		static 
		{
			AUTOMATIC = new JournalMode("AUTOMATIC", 0);
		//    0    0:new             #2   <Class RoomDatabase$JournalMode>
		//    1    3:dup             
		//    2    4:ldc1            #20  <String "AUTOMATIC">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #24  <Method void RoomDatabase$JournalMode(String, int)>
		//    5   10:putstatic       #26  <Field RoomDatabase$JournalMode AUTOMATIC>
			TRUNCATE = new JournalMode("TRUNCATE", 1);
		//    6   13:new             #2   <Class RoomDatabase$JournalMode>
		//    7   16:dup             
		//    8   17:ldc1            #27  <String "TRUNCATE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #24  <Method void RoomDatabase$JournalMode(String, int)>
		//   11   23:putstatic       #29  <Field RoomDatabase$JournalMode TRUNCATE>
			WRITE_AHEAD_LOGGING = new JournalMode("WRITE_AHEAD_LOGGING", 2);
		//   12   26:new             #2   <Class RoomDatabase$JournalMode>
		//   13   29:dup             
		//   14   30:ldc1            #30  <String "WRITE_AHEAD_LOGGING">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #24  <Method void RoomDatabase$JournalMode(String, int)>
		//   17   36:putstatic       #32  <Field RoomDatabase$JournalMode WRITE_AHEAD_LOGGING>
			$VALUES = (new JournalMode[] {
				AUTOMATIC, TRUNCATE, WRITE_AHEAD_LOGGING
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       JournalMode[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #26  <Field RoomDatabase$JournalMode AUTOMATIC>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #29  <Field RoomDatabase$JournalMode TRUNCATE>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #32  <Field RoomDatabase$JournalMode WRITE_AHEAD_LOGGING>
		//   31   60:aastore         
		//   32   61:putstatic       #34  <Field RoomDatabase$JournalMode[] $VALUES>
		//*  33   64:return          
		}

		private JournalMode(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #36  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static class MigrationContainer
	{

		private void addMigration(Migration migration)
		{
			int i = migration.startVersion;
		//    0    0:aload_1         
		//    1    1:getfield        #28  <Field int Migration.startVersion>
		//    2    4:istore_2        
			int j = migration.endVersion;
		//    3    5:aload_1         
		//    4    6:getfield        #31  <Field int Migration.endVersion>
		//    5    9:istore_3        
			Object obj = ((Object) ((SparseArrayCompat)mMigrations.get(i)));
		//    6   10:aload_0         
		//    7   11:getfield        #19  <Field SparseArrayCompat mMigrations>
		//    8   14:iload_2         
		//    9   15:invokevirtual   #35  <Method Object SparseArrayCompat.get(int)>
		//   10   18:checkcast       #16  <Class SparseArrayCompat>
		//   11   21:astore          5
			SparseArrayCompat sparsearraycompat = ((SparseArrayCompat) (obj));
		//   12   23:aload           5
		//   13   25:astore          4
			if(obj == null)
		//*  14   27:aload           5
		//*  15   29:ifnonnull       51
			{
				sparsearraycompat = new SparseArrayCompat();
		//   16   32:new             #16  <Class SparseArrayCompat>
		//   17   35:dup             
		//   18   36:invokespecial   #17  <Method void SparseArrayCompat()>
		//   19   39:astore          4
				mMigrations.put(i, ((Object) (sparsearraycompat)));
		//   20   41:aload_0         
		//   21   42:getfield        #19  <Field SparseArrayCompat mMigrations>
		//   22   45:iload_2         
		//   23   46:aload           4
		//   24   48:invokevirtual   #39  <Method void SparseArrayCompat.put(int, Object)>
			}
			obj = ((Object) ((Migration)sparsearraycompat.get(j)));
		//   25   51:aload           4
		//   26   53:iload_3         
		//   27   54:invokevirtual   #35  <Method Object SparseArrayCompat.get(int)>
		//   28   57:checkcast       #24  <Class Migration>
		//   29   60:astore          5
			if(obj != null)
		//*  30   62:aload           5
		//*  31   64:ifnull          118
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   32   67:new             #41  <Class StringBuilder>
		//   33   70:dup             
		//   34   71:invokespecial   #42  <Method void StringBuilder()>
		//   35   74:astore          6
				stringbuilder.append("Overriding migration ");
		//   36   76:aload           6
		//   37   78:ldc1            #44  <String "Overriding migration ">
		//   38   80:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
		//   39   83:pop             
				stringbuilder.append(obj);
		//   40   84:aload           6
		//   41   86:aload           5
		//   42   88:invokevirtual   #51  <Method StringBuilder StringBuilder.append(Object)>
		//   43   91:pop             
				stringbuilder.append(" with ");
		//   44   92:aload           6
		//   45   94:ldc1            #53  <String " with ">
		//   46   96:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
		//   47   99:pop             
				stringbuilder.append(((Object) (migration)));
		//   48  100:aload           6
		//   49  102:aload_1         
		//   50  103:invokevirtual   #51  <Method StringBuilder StringBuilder.append(Object)>
		//   51  106:pop             
				Log.w("ROOM", stringbuilder.toString());
		//   52  107:ldc1            #55  <String "ROOM">
		//   53  109:aload           6
		//   54  111:invokevirtual   #59  <Method String StringBuilder.toString()>
		//   55  114:invokestatic    #65  <Method int Log.w(String, String)>
		//   56  117:pop             
			}
			sparsearraycompat.append(j, ((Object) (migration)));
		//   57  118:aload           4
		//   58  120:iload_3         
		//   59  121:aload_1         
		//   60  122:invokevirtual   #67  <Method void SparseArrayCompat.append(int, Object)>
		//   61  125:return          
		}

		private List findUpMigrationPath(List list, boolean flag, int i, int j)
		{
			byte byte0;
			int l;
			if(flag)
		//*   0    0:iload_2         
		//*   1    1:ifeq            13
			{
				byte0 = -1;
		//    2    4:iconst_m1       
		//    3    5:istore          6
				l = i;
		//    4    7:iload_3         
		//    5    8:istore          7
			} else
		//*   6   10:goto            19
			{
				byte0 = 1;
		//    7   13:iconst_1        
		//    8   14:istore          6
				l = i;
		//    9   16:iload_3         
		//   10   17:istore          7
			}
			while(flag ? l < j : l > j) 
		//*  11   19:iload_2         
		//*  12   20:ifeq            33
		//*  13   23:iload           7
		//*  14   25:iload           4
		//*  15   27:icmpge          205
		//*  16   30:goto            40
		//*  17   33:iload           7
		//*  18   35:iload           4
		//*  19   37:icmple          205
			{
				SparseArrayCompat sparsearraycompat = (SparseArrayCompat)mMigrations.get(l);
		//   20   40:aload_0         
		//   21   41:getfield        #19  <Field SparseArrayCompat mMigrations>
		//   22   44:iload           7
		//   23   46:invokevirtual   #35  <Method Object SparseArrayCompat.get(int)>
		//   24   49:checkcast       #16  <Class SparseArrayCompat>
		//   25   52:astore          11
				if(sparsearraycompat == null)
		//*  26   54:aload           11
		//*  27   56:ifnonnull       61
					return null;
		//   28   59:aconst_null     
		//   29   60:areturn         
				int i1 = sparsearraycompat.size();
		//   30   61:aload           11
		//   31   63:invokevirtual   #73  <Method int SparseArrayCompat.size()>
		//   32   66:istore          8
				boolean flag1 = false;
		//   33   68:iconst_0        
		//   34   69:istore          10
				int k;
				if(flag)
		//*  35   71:iload_2         
		//*  36   72:ifeq            87
				{
					k = i1 - 1;
		//   37   75:iload           8
		//   38   77:iconst_1        
		//   39   78:isub            
		//   40   79:istore          5
					i1 = -1;
		//   41   81:iconst_m1       
		//   42   82:istore          8
				} else
		//*  43   84:goto            90
				{
					k = 0;
		//   44   87:iconst_0        
		//   45   88:istore          5
				}
				int j1;
				do
				{
					i = ((int) (flag1));
		//   46   90:iload           10
		//   47   92:istore_3        
					j1 = l;
		//   48   93:iload           7
		//   49   95:istore          9
					if(k == i1)
						break;
		//   50   97:iload           5
		//   51   99:iload           8
		//   52  101:icmpeq          195
					j1 = sparsearraycompat.keyAt(k);
		//   53  104:aload           11
		//   54  106:iload           5
		//   55  108:invokevirtual   #77  <Method int SparseArrayCompat.keyAt(int)>
		//   56  111:istore          9
					if(flag)
		//*  57  113:iload_2         
		//*  58  114:ifeq            141
					{
						if(j1 <= j && j1 > l)
		//*  59  117:iload           9
		//*  60  119:iload           4
		//*  61  121:icmpgt          136
		//*  62  124:iload           9
		//*  63  126:iload           7
		//*  64  128:icmple          136
							i = 1;
		//   65  131:iconst_1        
		//   66  132:istore_3        
						else
		//*  67  133:goto            162
							i = 0;
		//   68  136:iconst_0        
		//   69  137:istore_3        
					} else
		//*  70  138:goto            162
					if(j1 >= j && j1 < l)
		//*  71  141:iload           9
		//*  72  143:iload           4
		//*  73  145:icmplt          160
		//*  74  148:iload           9
		//*  75  150:iload           7
		//*  76  152:icmpge          160
						i = 1;
		//   77  155:iconst_1        
		//   78  156:istore_3        
					else
		//*  79  157:goto            162
						i = 0;
		//   80  160:iconst_0        
		//   81  161:istore_3        
					if(i != 0)
		//*  82  162:iload_3         
		//*  83  163:ifeq            185
					{
						list.add(sparsearraycompat.valueAt(k));
		//   84  166:aload_1         
		//   85  167:aload           11
		//   86  169:iload           5
		//   87  171:invokevirtual   #80  <Method Object SparseArrayCompat.valueAt(int)>
		//   88  174:invokeinterface #86  <Method boolean List.add(Object)>
		//   89  179:pop             
						i = 1;
		//   90  180:iconst_1        
		//   91  181:istore_3        
						break;
		//   92  182:goto            195
					}
					k += ((int) (byte0));
		//   93  185:iload           5
		//   94  187:iload           6
		//   95  189:iadd            
		//   96  190:istore          5
				} while(true);
		//   97  192:goto            90
				l = j1;
		//   98  195:iload           9
		//   99  197:istore          7
				if(i == 0)
		//* 100  199:iload_3         
		//* 101  200:ifne            19
					return null;
		//  102  203:aconst_null     
		//  103  204:areturn         
			}
			return list;
		//  104  205:aload_1         
		//  105  206:areturn         
		}

		public transient void addMigrations(Migration amigration[])
		{
			int j = amigration.length;
		//    0    0:aload_1         
		//    1    1:arraylength     
		//    2    2:istore_3        
			for(int i = 0; i < j; i++)
		//*   3    3:iconst_0        
		//*   4    4:istore_2        
		//*   5    5:iload_2         
		//*   6    6:iload_3         
		//*   7    7:icmpge          24
				addMigration(amigration[i]);
		//    8   10:aload_0         
		//    9   11:aload_1         
		//   10   12:iload_2         
		//   11   13:aaload          
		//   12   14:invokespecial   #93  <Method void addMigration(Migration)>

		//   13   17:iload_2         
		//   14   18:iconst_1        
		//   15   19:iadd            
		//   16   20:istore_2        
		//*  17   21:goto            5
		//   18   24:return          
		}

		public List findMigrationPath(int i, int j)
		{
			if(i == j)
		//*   0    0:iload_1         
		//*   1    1:iload_2         
		//*   2    2:icmpne          9
				return Collections.emptyList();
		//    3    5:invokestatic    #103 <Method List Collections.emptyList()>
		//    4    8:areturn         
			boolean flag;
			if(j > i)
		//*   5    9:iload_2         
		//*   6   10:iload_1         
		//*   7   11:icmple          19
				flag = true;
		//    8   14:iconst_1        
		//    9   15:istore_3        
			else
		//*  10   16:goto            21
				flag = false;
		//   11   19:iconst_0        
		//   12   20:istore_3        
			return findUpMigrationPath(((List) (new ArrayList())), flag, i, j);
		//   13   21:aload_0         
		//   14   22:new             #105 <Class ArrayList>
		//   15   25:dup             
		//   16   26:invokespecial   #106 <Method void ArrayList()>
		//   17   29:iload_3         
		//   18   30:iload_1         
		//   19   31:iload_2         
		//   20   32:invokespecial   #108 <Method List findUpMigrationPath(List, boolean, int, int)>
		//   21   35:areturn         
		}

		private SparseArrayCompat mMigrations;

		public MigrationContainer()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			mMigrations = new SparseArrayCompat();
		//    2    4:aload_0         
		//    3    5:new             #16  <Class SparseArrayCompat>
		//    4    8:dup             
		//    5    9:invokespecial   #17  <Method void SparseArrayCompat()>
		//    6   12:putfield        #19  <Field SparseArrayCompat mMigrations>
		//    7   15:return          
		}
	}


	public RoomDatabase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #48  <Class ReentrantLock>
	//    4    8:dup             
	//    5    9:invokespecial   #49  <Method void ReentrantLock()>
	//    6   12:putfield        #51  <Field ReentrantLock mCloseLock>
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #55  <Method InvalidationTracker createInvalidationTracker()>
	//   10   20:putfield        #57  <Field InvalidationTracker mInvalidationTracker>
	//   11   23:return          
	}

	public void assertNotMainThread()
	{
		if(mAllowMainThreadQueries)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field boolean mAllowMainThreadQueries>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(!ArchTaskExecutor.getInstance().isMainThread())
	//*   4    8:invokestatic    #67  <Method ArchTaskExecutor ArchTaskExecutor.getInstance()>
	//*   5   11:invokevirtual   #71  <Method boolean ArchTaskExecutor.isMainThread()>
	//*   6   14:ifne            18
			return;
	//    7   17:return          
		else
			throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
	//    8   18:new             #73  <Class IllegalStateException>
	//    9   21:dup             
	//   10   22:ldc1            #75  <String "Cannot access database on the main thread since it may potentially lock the UI for a long period of time.">
	//   11   24:invokespecial   #78  <Method void IllegalStateException(String)>
	//   12   27:athrow          
	}

	public void beginTransaction()
	{
		assertNotMainThread();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #82  <Method void assertNotMainThread()>
		SupportSQLiteDatabase supportsqlitedatabase = mOpenHelper.getWritableDatabase();
	//    2    4:aload_0         
	//    3    5:getfield        #84  <Field SupportSQLiteOpenHelper mOpenHelper>
	//    4    8:invokeinterface #90  <Method SupportSQLiteDatabase SupportSQLiteOpenHelper.getWritableDatabase()>
	//    5   13:astore_1        
		mInvalidationTracker.syncTriggers(supportsqlitedatabase);
	//    6   14:aload_0         
	//    7   15:getfield        #57  <Field InvalidationTracker mInvalidationTracker>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #96  <Method void InvalidationTracker.syncTriggers(SupportSQLiteDatabase)>
		supportsqlitedatabase.beginTransaction();
	//   10   22:aload_1         
	//   11   23:invokeinterface #100 <Method void SupportSQLiteDatabase.beginTransaction()>
	//   12   28:return          
	}

	public abstract void clearAllTables();

	public void close()
	{
		if(!isOpen())
			break MISSING_BLOCK_LABEL_41;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #106 <Method boolean isOpen()>
	//    2    4:ifeq            41
		mCloseLock.lock();
	//    3    7:aload_0         
	//    4    8:getfield        #51  <Field ReentrantLock mCloseLock>
	//    5   11:invokevirtual   #109 <Method void ReentrantLock.lock()>
		mOpenHelper.close();
	//    6   14:aload_0         
	//    7   15:getfield        #84  <Field SupportSQLiteOpenHelper mOpenHelper>
	//    8   18:invokeinterface #111 <Method void SupportSQLiteOpenHelper.close()>
		mCloseLock.unlock();
	//    9   23:aload_0         
	//   10   24:getfield        #51  <Field ReentrantLock mCloseLock>
	//   11   27:invokevirtual   #114 <Method void ReentrantLock.unlock()>
		return;
	//   12   30:return          
		Exception exception;
		exception;
	//   13   31:astore_1        
		mCloseLock.unlock();
	//   14   32:aload_0         
	//   15   33:getfield        #51  <Field ReentrantLock mCloseLock>
	//   16   36:invokevirtual   #114 <Method void ReentrantLock.unlock()>
		throw exception;
	//   17   39:aload_1         
	//   18   40:athrow          
	//   19   41:return          
	}

	public SupportSQLiteStatement compileStatement(String s)
	{
		assertNotMainThread();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #82  <Method void assertNotMainThread()>
		return mOpenHelper.getWritableDatabase().compileStatement(s);
	//    2    4:aload_0         
	//    3    5:getfield        #84  <Field SupportSQLiteOpenHelper mOpenHelper>
	//    4    8:invokeinterface #90  <Method SupportSQLiteDatabase SupportSQLiteOpenHelper.getWritableDatabase()>
	//    5   13:aload_1         
	//    6   14:invokeinterface #119 <Method SupportSQLiteStatement SupportSQLiteDatabase.compileStatement(String)>
	//    7   19:areturn         
	}

	protected abstract InvalidationTracker createInvalidationTracker();

	protected abstract SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseconfiguration);

	public void endTransaction()
	{
		mOpenHelper.getWritableDatabase().endTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field SupportSQLiteOpenHelper mOpenHelper>
	//    2    4:invokeinterface #90  <Method SupportSQLiteDatabase SupportSQLiteOpenHelper.getWritableDatabase()>
	//    3    9:invokeinterface #125 <Method void SupportSQLiteDatabase.endTransaction()>
		if(!inTransaction())
	//*   4   14:aload_0         
	//*   5   15:invokevirtual   #128 <Method boolean inTransaction()>
	//*   6   18:ifne            28
			mInvalidationTracker.refreshVersionsAsync();
	//    7   21:aload_0         
	//    8   22:getfield        #57  <Field InvalidationTracker mInvalidationTracker>
	//    9   25:invokevirtual   #131 <Method void InvalidationTracker.refreshVersionsAsync()>
	//   10   28:return          
	}

	Lock getCloseLock()
	{
		return ((Lock) (mCloseLock));
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ReentrantLock mCloseLock>
	//    2    4:areturn         
	}

	public InvalidationTracker getInvalidationTracker()
	{
		return mInvalidationTracker;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field InvalidationTracker mInvalidationTracker>
	//    2    4:areturn         
	}

	public SupportSQLiteOpenHelper getOpenHelper()
	{
		return mOpenHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field SupportSQLiteOpenHelper mOpenHelper>
	//    2    4:areturn         
	}

	public boolean inTransaction()
	{
		return mOpenHelper.getWritableDatabase().inTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field SupportSQLiteOpenHelper mOpenHelper>
	//    2    4:invokeinterface #90  <Method SupportSQLiteDatabase SupportSQLiteOpenHelper.getWritableDatabase()>
	//    3    9:invokeinterface #137 <Method boolean SupportSQLiteDatabase.inTransaction()>
	//    4   14:ireturn         
	}

	public void init(DatabaseConfiguration databaseconfiguration)
	{
		mOpenHelper = createOpenHelper(databaseconfiguration);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #142 <Method SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration)>
	//    4    6:putfield        #84  <Field SupportSQLiteOpenHelper mOpenHelper>
		int i = android.os.Build.VERSION.SDK_INT;
	//    5    9:getstatic       #147 <Field int android.os.Build$VERSION.SDK_INT>
	//    6   12:istore_2        
		boolean flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_3        
		boolean flag1 = false;
	//    9   15:iconst_0        
	//   10   16:istore          4
		if(i >= 16)
	//*  11   18:iload_2         
	//*  12   19:bipush          16
	//*  13   21:icmplt          49
		{
			flag = flag1;
	//   14   24:iload           4
	//   15   26:istore_3        
			if(databaseconfiguration.journalMode == JournalMode.WRITE_AHEAD_LOGGING)
	//*  16   27:aload_1         
	//*  17   28:getfield        #153 <Field RoomDatabase$JournalMode DatabaseConfiguration.journalMode>
	//*  18   31:getstatic       #156 <Field RoomDatabase$JournalMode RoomDatabase$JournalMode.WRITE_AHEAD_LOGGING>
	//*  19   34:if_acmpne       39
				flag = true;
	//   20   37:iconst_1        
	//   21   38:istore_3        
			mOpenHelper.setWriteAheadLoggingEnabled(flag);
	//   22   39:aload_0         
	//   23   40:getfield        #84  <Field SupportSQLiteOpenHelper mOpenHelper>
	//   24   43:iload_3         
	//   25   44:invokeinterface #160 <Method void SupportSQLiteOpenHelper.setWriteAheadLoggingEnabled(boolean)>
		}
		mCallbacks = databaseconfiguration.callbacks;
	//   26   49:aload_0         
	//   27   50:aload_1         
	//   28   51:getfield        #163 <Field List DatabaseConfiguration.callbacks>
	//   29   54:putfield        #165 <Field List mCallbacks>
		mAllowMainThreadQueries = databaseconfiguration.allowMainThreadQueries;
	//   30   57:aload_0         
	//   31   58:aload_1         
	//   32   59:getfield        #168 <Field boolean DatabaseConfiguration.allowMainThreadQueries>
	//   33   62:putfield        #61  <Field boolean mAllowMainThreadQueries>
		mWriteAheadLoggingEnabled = flag;
	//   34   65:aload_0         
	//   35   66:iload_3         
	//   36   67:putfield        #170 <Field boolean mWriteAheadLoggingEnabled>
	//   37   70:return          
	}

	protected void internalInitInvalidationTracker(SupportSQLiteDatabase supportsqlitedatabase)
	{
		mInvalidationTracker.internalInit(supportsqlitedatabase);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field InvalidationTracker mInvalidationTracker>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #174 <Method void InvalidationTracker.internalInit(SupportSQLiteDatabase)>
	//    4    8:return          
	}

	public boolean isOpen()
	{
		SupportSQLiteDatabase supportsqlitedatabase = mDatabase;
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field SupportSQLiteDatabase mDatabase>
	//    2    4:astore_1        
		return supportsqlitedatabase != null && supportsqlitedatabase.isOpen();
	//    3    5:aload_1         
	//    4    6:ifnull          20
	//    5    9:aload_1         
	//    6   10:invokeinterface #177 <Method boolean SupportSQLiteDatabase.isOpen()>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public Cursor query(SupportSQLiteQuery supportsqlitequery)
	{
		assertNotMainThread();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #82  <Method void assertNotMainThread()>
		return mOpenHelper.getWritableDatabase().query(supportsqlitequery);
	//    2    4:aload_0         
	//    3    5:getfield        #84  <Field SupportSQLiteOpenHelper mOpenHelper>
	//    4    8:invokeinterface #90  <Method SupportSQLiteDatabase SupportSQLiteOpenHelper.getWritableDatabase()>
	//    5   13:aload_1         
	//    6   14:invokeinterface #181 <Method Cursor SupportSQLiteDatabase.query(SupportSQLiteQuery)>
	//    7   19:areturn         
	}

	public Cursor query(String s, Object aobj[])
	{
		return mOpenHelper.getWritableDatabase().query(((SupportSQLiteQuery) (new SimpleSQLiteQuery(s, aobj))));
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field SupportSQLiteOpenHelper mOpenHelper>
	//    2    4:invokeinterface #90  <Method SupportSQLiteDatabase SupportSQLiteOpenHelper.getWritableDatabase()>
	//    3    9:new             #184 <Class SimpleSQLiteQuery>
	//    4   12:dup             
	//    5   13:aload_1         
	//    6   14:aload_2         
	//    7   15:invokespecial   #187 <Method void SimpleSQLiteQuery(String, Object[])>
	//    8   18:invokeinterface #181 <Method Cursor SupportSQLiteDatabase.query(SupportSQLiteQuery)>
	//    9   23:areturn         
	}

	public Object runInTransaction(Callable callable)
	{
		beginTransaction();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #194 <Method void beginTransaction()>
		callable = ((Callable) (callable.call()));
	//    2    4:aload_1         
	//    3    5:invokeinterface #200 <Method Object Callable.call()>
	//    4   10:astore_1        
		setTransactionSuccessful();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #203 <Method void setTransactionSuccessful()>
		endTransaction();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #204 <Method void endTransaction()>
		return ((Object) (callable));
	//    9   19:aload_1         
	//   10   20:areturn         
		callable;
	//   11   21:astore_1        
		break MISSING_BLOCK_LABEL_40;
	//   12   22:goto            40
		callable;
	//   13   25:astore_1        
		throw new RuntimeException("Exception in transaction", ((Throwable) (callable)));
	//   14   26:new             #191 <Class RuntimeException>
	//   15   29:dup             
	//   16   30:ldc1            #206 <String "Exception in transaction">
	//   17   32:aload_1         
	//   18   33:invokespecial   #209 <Method void RuntimeException(String, Throwable)>
	//   19   36:athrow          
		callable;
	//   20   37:astore_1        
		throw callable;
	//   21   38:aload_1         
	//   22   39:athrow          
		endTransaction();
	//   23   40:aload_0         
	//   24   41:invokevirtual   #204 <Method void endTransaction()>
		throw callable;
	//   25   44:aload_1         
	//   26   45:athrow          
	}

	public void runInTransaction(Runnable runnable)
	{
		beginTransaction();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #194 <Method void beginTransaction()>
		runnable.run();
	//    2    4:aload_1         
	//    3    5:invokeinterface #217 <Method void Runnable.run()>
		setTransactionSuccessful();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #203 <Method void setTransactionSuccessful()>
		endTransaction();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #204 <Method void endTransaction()>
		return;
	//    8   18:return          
		runnable;
	//    9   19:astore_1        
		endTransaction();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #204 <Method void endTransaction()>
		throw runnable;
	//   12   24:aload_1         
	//   13   25:athrow          
	}

	public void setTransactionSuccessful()
	{
		mOpenHelper.getWritableDatabase().setTransactionSuccessful();
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field SupportSQLiteOpenHelper mOpenHelper>
	//    2    4:invokeinterface #90  <Method SupportSQLiteDatabase SupportSQLiteOpenHelper.getWritableDatabase()>
	//    3    9:invokeinterface #218 <Method void SupportSQLiteDatabase.setTransactionSuccessful()>
	//    4   14:return          
	}

	private static final String DB_IMPL_SUFFIX = "_Impl";
	public static final int MAX_BIND_PARAMETER_CNT = 999;
	private boolean mAllowMainThreadQueries;
	protected List mCallbacks;
	private final ReentrantLock mCloseLock = new ReentrantLock();
	protected volatile SupportSQLiteDatabase mDatabase;
	private final InvalidationTracker mInvalidationTracker = createInvalidationTracker();
	private SupportSQLiteOpenHelper mOpenHelper;
	boolean mWriteAheadLoggingEnabled;
}
