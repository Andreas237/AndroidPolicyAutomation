// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;

import android.arch.persistence.db.SimpleSQLiteQuery;
import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.migration.Migration;
import android.database.Cursor;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.arch.persistence.room:
//			RoomMasterTable, DatabaseConfiguration

public class RoomOpenHelper extends android.arch.persistence.db.SupportSQLiteOpenHelper.Callback
{
	public static abstract class Delegate
	{

		protected abstract void createAllTables(SupportSQLiteDatabase supportsqlitedatabase);

		protected abstract void dropAllTables(SupportSQLiteDatabase supportsqlitedatabase);

		protected abstract void onCreate(SupportSQLiteDatabase supportsqlitedatabase);

		protected abstract void onOpen(SupportSQLiteDatabase supportsqlitedatabase);

		protected abstract void validateMigration(SupportSQLiteDatabase supportsqlitedatabase);

		public final int version;

		public Delegate(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			version = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #20  <Field int version>
		//    5    9:return          
		}
	}


	public RoomOpenHelper(DatabaseConfiguration databaseconfiguration, Delegate delegate1, String s, String s1)
	{
		super(delegate1.version);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:getfield        #26  <Field int RoomOpenHelper$Delegate.version>
	//    3    5:invokespecial   #29  <Method void android.arch.persistence.db.SupportSQLiteOpenHelper$Callback(int)>
		mConfiguration = databaseconfiguration;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #31  <Field DatabaseConfiguration mConfiguration>
		mDelegate = delegate1;
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:putfield        #33  <Field RoomOpenHelper$Delegate mDelegate>
		mIdentityHash = s;
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:putfield        #35  <Field String mIdentityHash>
		mLegacyHash = s1;
	//   13   23:aload_0         
	//   14   24:aload           4
	//   15   26:putfield        #37  <Field String mLegacyHash>
	//   16   29:return          
	}

	private void checkIdentity(SupportSQLiteDatabase supportsqlitedatabase)
	{
		Object obj;
		boolean flag = hasRoomMasterTable(supportsqlitedatabase);
	//    0    0:aload_1         
	//    1    1:invokestatic    #45  <Method boolean hasRoomMasterTable(SupportSQLiteDatabase)>
	//    2    4:istore_2        
		obj = null;
	//    3    5:aconst_null     
	//    4    6:astore_3        
		Object obj1 = null;
	//    5    7:aconst_null     
	//    6    8:astore          4
		if(!flag)
			break MISSING_BLOCK_LABEL_70;
	//    7   10:iload_2         
	//    8   11:ifeq            70
		obj = ((Object) (supportsqlitedatabase.query(((android.arch.persistence.db.SupportSQLiteQuery) (new SimpleSQLiteQuery("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"))))));
	//    9   14:aload_1         
	//   10   15:new             #47  <Class SimpleSQLiteQuery>
	//   11   18:dup             
	//   12   19:ldc1            #49  <String "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1">
	//   13   21:invokespecial   #52  <Method void SimpleSQLiteQuery(String)>
	//   14   24:invokeinterface #58  <Method Cursor SupportSQLiteDatabase.query(android.arch.persistence.db.SupportSQLiteQuery)>
	//   15   29:astore_3        
		supportsqlitedatabase = ((SupportSQLiteDatabase) (obj1));
	//   16   30:aload           4
	//   17   32:astore_1        
		if(((Cursor) (obj)).moveToFirst())
	//*  18   33:aload_3         
	//*  19   34:invokeinterface #64  <Method boolean Cursor.moveToFirst()>
	//*  20   39:ifeq            50
			supportsqlitedatabase = ((SupportSQLiteDatabase) (((Cursor) (obj)).getString(0)));
	//   21   42:aload_3         
	//   22   43:iconst_0        
	//   23   44:invokeinterface #68  <Method String Cursor.getString(int)>
	//   24   49:astore_1        
		((Cursor) (obj)).close();
	//   25   50:aload_3         
	//   26   51:invokeinterface #72  <Method void Cursor.close()>
		obj = ((Object) (supportsqlitedatabase));
	//   27   56:aload_1         
	//   28   57:astore_3        
		break MISSING_BLOCK_LABEL_70;
	//   29   58:goto            70
		supportsqlitedatabase;
	//   30   61:astore_1        
		((Cursor) (obj)).close();
	//   31   62:aload_3         
	//   32   63:invokeinterface #72  <Method void Cursor.close()>
		throw supportsqlitedatabase;
	//   33   68:aload_1         
	//   34   69:athrow          
		if(!mIdentityHash.equals(obj))
	//*  35   70:aload_0         
	//*  36   71:getfield        #35  <Field String mIdentityHash>
	//*  37   74:aload_3         
	//*  38   75:invokevirtual   #78  <Method boolean String.equals(Object)>
	//*  39   78:ifne            103
		{
			if(mLegacyHash.equals(obj))
	//*  40   81:aload_0         
	//*  41   82:getfield        #37  <Field String mLegacyHash>
	//*  42   85:aload_3         
	//*  43   86:invokevirtual   #78  <Method boolean String.equals(Object)>
	//*  44   89:ifeq            93
				return;
	//   45   92:return          
			else
				throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
	//   46   93:new             #80  <Class IllegalStateException>
	//   47   96:dup             
	//   48   97:ldc1            #82  <String "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.">
	//   49   99:invokespecial   #83  <Method void IllegalStateException(String)>
	//   50  102:athrow          
		} else
		{
			return;
	//   51  103:return          
		}
	}

	private void createMasterTableIfNotExists(SupportSQLiteDatabase supportsqlitedatabase)
	{
		supportsqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
	//    0    0:aload_1         
	//    1    1:ldc1            #86  <String "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)">
	//    2    3:invokeinterface #89  <Method void SupportSQLiteDatabase.execSQL(String)>
	//    3    8:return          
	}

	private static boolean hasRoomMasterTable(SupportSQLiteDatabase supportsqlitedatabase)
	{
		supportsqlitedatabase = ((SupportSQLiteDatabase) (supportsqlitedatabase.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'")));
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'">
	//    2    3:invokeinterface #94  <Method Cursor SupportSQLiteDatabase.query(String)>
	//    3    8:astore_0        
		boolean flag2 = ((Cursor) (supportsqlitedatabase)).moveToFirst();
	//    4    9:aload_0         
	//    5   10:invokeinterface #64  <Method boolean Cursor.moveToFirst()>
	//    6   15:istore          4
		boolean flag;
		boolean flag1;
		flag1 = false;
	//    7   17:iconst_0        
	//    8   18:istore_3        
		flag = flag1;
	//    9   19:iload_3         
	//   10   20:istore_2        
		if(!flag2)
			break MISSING_BLOCK_LABEL_42;
	//   11   21:iload           4
	//   12   23:ifeq            42
		int i = ((Cursor) (supportsqlitedatabase)).getInt(0);
	//   13   26:aload_0         
	//   14   27:iconst_0        
	//   15   28:invokeinterface #98  <Method int Cursor.getInt(int)>
	//   16   33:istore_1        
		flag = flag1;
	//   17   34:iload_3         
	//   18   35:istore_2        
		if(i != 0)
	//*  19   36:iload_1         
	//*  20   37:ifeq            42
			flag = true;
	//   21   40:iconst_1        
	//   22   41:istore_2        
		((Cursor) (supportsqlitedatabase)).close();
	//   23   42:aload_0         
	//   24   43:invokeinterface #72  <Method void Cursor.close()>
		return flag;
	//   25   48:iload_2         
	//   26   49:ireturn         
		Exception exception;
		exception;
	//   27   50:astore          5
		((Cursor) (supportsqlitedatabase)).close();
	//   28   52:aload_0         
	//   29   53:invokeinterface #72  <Method void Cursor.close()>
		throw exception;
	//   30   58:aload           5
	//   31   60:athrow          
	}

	private void updateIdentity(SupportSQLiteDatabase supportsqlitedatabase)
	{
		createMasterTableIfNotExists(supportsqlitedatabase);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #101 <Method void createMasterTableIfNotExists(SupportSQLiteDatabase)>
		supportsqlitedatabase.execSQL(RoomMasterTable.createInsertQuery(mIdentityHash));
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #35  <Field String mIdentityHash>
	//    6   10:invokestatic    #107 <Method String RoomMasterTable.createInsertQuery(String)>
	//    7   13:invokeinterface #89  <Method void SupportSQLiteDatabase.execSQL(String)>
	//    8   18:return          
	}

	public void onConfigure(SupportSQLiteDatabase supportsqlitedatabase)
	{
		super.onConfigure(supportsqlitedatabase);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #110 <Method void android.arch.persistence.db.SupportSQLiteOpenHelper$Callback.onConfigure(SupportSQLiteDatabase)>
	//    3    5:return          
	}

	public void onCreate(SupportSQLiteDatabase supportsqlitedatabase)
	{
		updateIdentity(supportsqlitedatabase);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #113 <Method void updateIdentity(SupportSQLiteDatabase)>
		mDelegate.createAllTables(supportsqlitedatabase);
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field RoomOpenHelper$Delegate mDelegate>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #116 <Method void RoomOpenHelper$Delegate.createAllTables(SupportSQLiteDatabase)>
		mDelegate.onCreate(supportsqlitedatabase);
	//    7   13:aload_0         
	//    8   14:getfield        #33  <Field RoomOpenHelper$Delegate mDelegate>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #118 <Method void RoomOpenHelper$Delegate.onCreate(SupportSQLiteDatabase)>
	//   11   21:return          
	}

	public void onDowngrade(SupportSQLiteDatabase supportsqlitedatabase, int i, int j)
	{
		onUpgrade(supportsqlitedatabase, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #123 <Method void onUpgrade(SupportSQLiteDatabase, int, int)>
	//    5    7:return          
	}

	public void onOpen(SupportSQLiteDatabase supportsqlitedatabase)
	{
		super.onOpen(supportsqlitedatabase);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #126 <Method void android.arch.persistence.db.SupportSQLiteOpenHelper$Callback.onOpen(SupportSQLiteDatabase)>
		checkIdentity(supportsqlitedatabase);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #128 <Method void checkIdentity(SupportSQLiteDatabase)>
		mDelegate.onOpen(supportsqlitedatabase);
	//    6   10:aload_0         
	//    7   11:getfield        #33  <Field RoomOpenHelper$Delegate mDelegate>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #129 <Method void RoomOpenHelper$Delegate.onOpen(SupportSQLiteDatabase)>
		mConfiguration = null;
	//   10   18:aload_0         
	//   11   19:aconst_null     
	//   12   20:putfield        #31  <Field DatabaseConfiguration mConfiguration>
	//   13   23:return          
	}

	public void onUpgrade(SupportSQLiteDatabase supportsqlitedatabase, int i, int j)
	{
		boolean flag;
label0:
		{
			Object obj = ((Object) (mConfiguration));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field DatabaseConfiguration mConfiguration>
	//    2    4:astore          5
			if(obj != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          83
			{
				obj = ((Object) (((DatabaseConfiguration) (obj)).migrationContainer.findMigrationPath(i, j)));
	//    5   11:aload           5
	//    6   13:getfield        #135 <Field RoomDatabase$MigrationContainer DatabaseConfiguration.migrationContainer>
	//    7   16:iload_2         
	//    8   17:iload_3         
	//    9   18:invokevirtual   #141 <Method List RoomDatabase$MigrationContainer.findMigrationPath(int, int)>
	//   10   21:astore          5
				if(obj != null)
	//*  11   23:aload           5
	//*  12   25:ifnull          83
				{
					for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((Migration)((Iterator) (obj)).next()).migrate(supportsqlitedatabase));
	//   13   28:aload           5
	//   14   30:invokeinterface #147 <Method Iterator List.iterator()>
	//   15   35:astore          5
	//   16   37:aload           5
	//   17   39:invokeinterface #152 <Method boolean Iterator.hasNext()>
	//   18   44:ifeq            64
	//   19   47:aload           5
	//   20   49:invokeinterface #156 <Method Object Iterator.next()>
	//   21   54:checkcast       #158 <Class Migration>
	//   22   57:aload_1         
	//   23   58:invokevirtual   #161 <Method void Migration.migrate(SupportSQLiteDatabase)>
	//*  24   61:goto            37
					mDelegate.validateMigration(supportsqlitedatabase);
	//   25   64:aload_0         
	//   26   65:getfield        #33  <Field RoomOpenHelper$Delegate mDelegate>
	//   27   68:aload_1         
	//   28   69:invokevirtual   #164 <Method void RoomOpenHelper$Delegate.validateMigration(SupportSQLiteDatabase)>
					updateIdentity(supportsqlitedatabase);
	//   29   72:aload_0         
	//   30   73:aload_1         
	//   31   74:invokespecial   #113 <Method void updateIdentity(SupportSQLiteDatabase)>
					flag = true;
	//   32   77:iconst_1        
	//   33   78:istore          4
					break label0;
	//   34   80:goto            86
				}
			}
			flag = false;
	//   35   83:iconst_0        
	//   36   84:istore          4
		}
		if(!flag)
	//*  37   86:iload           4
	//*  38   88:ifne            209
		{
			DatabaseConfiguration databaseconfiguration = mConfiguration;
	//   39   91:aload_0         
	//   40   92:getfield        #31  <Field DatabaseConfiguration mConfiguration>
	//   41   95:astore          5
			if(databaseconfiguration != null && !databaseconfiguration.isMigrationRequiredFrom(i))
	//*  42   97:aload           5
	//*  43   99:ifnull          128
	//*  44  102:aload           5
	//*  45  104:iload_2         
	//*  46  105:invokevirtual   #168 <Method boolean DatabaseConfiguration.isMigrationRequiredFrom(int)>
	//*  47  108:ifne            128
			{
				mDelegate.dropAllTables(supportsqlitedatabase);
	//   48  111:aload_0         
	//   49  112:getfield        #33  <Field RoomOpenHelper$Delegate mDelegate>
	//   50  115:aload_1         
	//   51  116:invokevirtual   #171 <Method void RoomOpenHelper$Delegate.dropAllTables(SupportSQLiteDatabase)>
				mDelegate.createAllTables(supportsqlitedatabase);
	//   52  119:aload_0         
	//   53  120:getfield        #33  <Field RoomOpenHelper$Delegate mDelegate>
	//   54  123:aload_1         
	//   55  124:invokevirtual   #116 <Method void RoomOpenHelper$Delegate.createAllTables(SupportSQLiteDatabase)>
				return;
	//   56  127:return          
			} else
			{
				supportsqlitedatabase = ((SupportSQLiteDatabase) (new StringBuilder()));
	//   57  128:new             #173 <Class StringBuilder>
	//   58  131:dup             
	//   59  132:invokespecial   #175 <Method void StringBuilder()>
	//   60  135:astore_1        
				((StringBuilder) (supportsqlitedatabase)).append("A migration from ");
	//   61  136:aload_1         
	//   62  137:ldc1            #177 <String "A migration from ">
	//   63  139:invokevirtual   #181 <Method StringBuilder StringBuilder.append(String)>
	//   64  142:pop             
				((StringBuilder) (supportsqlitedatabase)).append(i);
	//   65  143:aload_1         
	//   66  144:iload_2         
	//   67  145:invokevirtual   #184 <Method StringBuilder StringBuilder.append(int)>
	//   68  148:pop             
				((StringBuilder) (supportsqlitedatabase)).append(" to ");
	//   69  149:aload_1         
	//   70  150:ldc1            #186 <String " to ">
	//   71  152:invokevirtual   #181 <Method StringBuilder StringBuilder.append(String)>
	//   72  155:pop             
				((StringBuilder) (supportsqlitedatabase)).append(j);
	//   73  156:aload_1         
	//   74  157:iload_3         
	//   75  158:invokevirtual   #184 <Method StringBuilder StringBuilder.append(int)>
	//   76  161:pop             
				((StringBuilder) (supportsqlitedatabase)).append(" was required but not found. Please provide the ");
	//   77  162:aload_1         
	//   78  163:ldc1            #188 <String " was required but not found. Please provide the ">
	//   79  165:invokevirtual   #181 <Method StringBuilder StringBuilder.append(String)>
	//   80  168:pop             
				((StringBuilder) (supportsqlitedatabase)).append("necessary Migration path via ");
	//   81  169:aload_1         
	//   82  170:ldc1            #190 <String "necessary Migration path via ">
	//   83  172:invokevirtual   #181 <Method StringBuilder StringBuilder.append(String)>
	//   84  175:pop             
				((StringBuilder) (supportsqlitedatabase)).append("RoomDatabase.Builder.addMigration(Migration ...) or allow for ");
	//   85  176:aload_1         
	//   86  177:ldc1            #192 <String "RoomDatabase.Builder.addMigration(Migration ...) or allow for ">
	//   87  179:invokevirtual   #181 <Method StringBuilder StringBuilder.append(String)>
	//   88  182:pop             
				((StringBuilder) (supportsqlitedatabase)).append("destructive migrations via one of the ");
	//   89  183:aload_1         
	//   90  184:ldc1            #194 <String "destructive migrations via one of the ">
	//   91  186:invokevirtual   #181 <Method StringBuilder StringBuilder.append(String)>
	//   92  189:pop             
				((StringBuilder) (supportsqlitedatabase)).append("RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
	//   93  190:aload_1         
	//   94  191:ldc1            #196 <String "RoomDatabase.Builder.fallbackToDestructiveMigration* methods.">
	//   95  193:invokevirtual   #181 <Method StringBuilder StringBuilder.append(String)>
	//   96  196:pop             
				throw new IllegalStateException(((StringBuilder) (supportsqlitedatabase)).toString());
	//   97  197:new             #80  <Class IllegalStateException>
	//   98  200:dup             
	//   99  201:aload_1         
	//  100  202:invokevirtual   #200 <Method String StringBuilder.toString()>
	//  101  205:invokespecial   #83  <Method void IllegalStateException(String)>
	//  102  208:athrow          
			}
		} else
		{
			return;
	//  103  209:return          
		}
	}

	private DatabaseConfiguration mConfiguration;
	private final Delegate mDelegate;
	private final String mIdentityHash;
	private final String mLegacyHash;
}
