// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;

import android.arch.persistence.db.framework.FrameworkSQLiteOpenHelperFactory;
import android.arch.persistence.room.migration.Migration;
import android.content.Context;
import java.util.*;

// Referenced classes of package android.arch.persistence.room:
//			RoomDatabase, DatabaseConfiguration, Room

public static class RoomDatabase$Builder
{

	public RoomDatabase$Builder addCallback( )
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
		mCallbacks.add(((Object) ()));
	//    8   18:aload_0         
	//    9   19:getfield        #66  <Field ArrayList mCallbacks>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #73  <Method boolean ArrayList.add(Object)>
	//   12   26:pop             
		return this;
	//   13   27:aload_0         
	//   14   28:areturn         
	}

	public transient RoomDatabase$Builder addMigrations(Migration amigration[])
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

	public RoomDatabase$Builder allowMainThreadQueries()
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
					mFactory = ((android.arch.persistence.db.er.Factory) (new FrameworkSQLiteOpenHelperFactory()));
	//   51  112:aload_0         
	//   52  113:new             #155 <Class FrameworkSQLiteOpenHelperFactory>
	//   53  116:dup             
	//   54  117:invokespecial   #156 <Method void FrameworkSQLiteOpenHelperFactory()>
	//   55  120:putfield        #153 <Field android.arch.persistence.db.SupportSQLiteOpenHelper$Factory mFactory>
				Object obj1 = ((Object) (mContext));
	//   56  123:aload_0         
	//   57  124:getfield        #40  <Field Context mContext>
	//   58  127:astore_1        
				obj1 = ((Object) (new DatabaseConfiguration(((Context) (obj1)), mName, mFactory, mMigrationContainer, ((java.util.List) (mCallbacks)), mAllowMainThreadQueries, mJournalMode.resolve(((Context) (obj1))), mRequireMigration, mMigrationsNotRequiredFrom)));
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
	//   80  169:invokespecial   #165 <Method void DatabaseConfiguration(Context, String, android.arch.persistence.db.SupportSQLiteOpenHelper$Factory, RoomDatabase$MigrationContainer, java.util.List, boolean, RoomDatabase$JournalMode, boolean, Set)>
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

	public RoomDatabase$Builder fallbackToDestructiveMigration()
	{
		mRequireMigration = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #53  <Field boolean mRequireMigration>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public transient RoomDatabase$Builder fallbackToDestructiveMigrationFrom(int ai[])
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

	public RoomDatabase$Builder openHelperFactory(android.arch.persistence.db.er.Factory factory)
	{
		mFactory = factory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #153 <Field android.arch.persistence.db.SupportSQLiteOpenHelper$Factory mFactory>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RoomDatabase$Builder setJournalMode(ode ode)
	{
		mJournalMode = ode;
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
	private android.arch.persistence.db.er.Factory mFactory;
	private ode mJournalMode;
	private final nContainer mMigrationContainer = new nContainer();
	private Set mMigrationStartAndEndVersions;
	private Set mMigrationsNotRequiredFrom;
	private final String mName;
	private boolean mRequireMigration;

	RoomDatabase$Builder(Context context, Class class1, String s)
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
		mJournalMode = ode.AUTOMATIC;
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
