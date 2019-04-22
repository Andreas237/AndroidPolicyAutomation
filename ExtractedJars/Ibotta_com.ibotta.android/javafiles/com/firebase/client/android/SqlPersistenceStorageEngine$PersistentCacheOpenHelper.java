// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.android;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.newrelic.agent.android.instrumentation.SQLiteInstrumentation;

// Referenced classes of package com.firebase.client.android:
//			SqlPersistenceStorageEngine

private static class SqlPersistenceStorageEngine$PersistentCacheOpenHelper extends SQLiteOpenHelper
{

	private void dropTable(SQLiteDatabase sqlitedatabase, String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #26  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("DROP TABLE IF EXISTS ");
	//    4    8:aload_3         
	//    5    9:ldc1            #30  <String "DROP TABLE IF EXISTS ">
	//    6   11:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_3         
	//    9   16:aload_2         
	//   10   17:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		s = stringbuilder.toString();
	//   12   21:aload_3         
	//   13   22:invokevirtual   #38  <Method String StringBuilder.toString()>
	//   14   25:astore_2        
		if(!(sqlitedatabase instanceof SQLiteDatabase))
	//*  15   26:aload_1         
	//*  16   27:instanceof      #40  <Class SQLiteDatabase>
	//*  17   30:ifne            39
		{
			sqlitedatabase.execSQL(s);
	//   18   33:aload_1         
	//   19   34:aload_2         
	//   20   35:invokevirtual   #44  <Method void SQLiteDatabase.execSQL(String)>
			return;
	//   21   38:return          
		} else
		{
			SQLiteInstrumentation.execSQL((SQLiteDatabase)sqlitedatabase, s);
	//   22   39:aload_1         
	//   23   40:checkcast       #40  <Class SQLiteDatabase>
	//   24   43:aload_2         
	//   25   44:invokestatic    #48  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
			return;
	//   26   47:return          
		}
	}

	public void onCreate(SQLiteDatabase sqlitedatabase)
	{
		boolean flag = sqlitedatabase instanceof SQLiteDatabase;
	//    0    0:aload_1         
	//    1    1:instanceof      #40  <Class SQLiteDatabase>
	//    2    4:istore_2        
		if(!flag)
	//*   3    5:iload_2         
	//*   4    6:ifne            18
			sqlitedatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
	//    5    9:aload_1         
	//    6   10:ldc1            #52  <String "CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);">
	//    7   12:invokevirtual   #44  <Method void SQLiteDatabase.execSQL(String)>
		else
	//*   8   15:goto            27
			SQLiteInstrumentation.execSQL((SQLiteDatabase)sqlitedatabase, "CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
	//    9   18:aload_1         
	//   10   19:checkcast       #40  <Class SQLiteDatabase>
	//   11   22:ldc1            #52  <String "CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);">
	//   12   24:invokestatic    #48  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
		if(!flag)
	//*  13   27:iload_2         
	//*  14   28:ifne            40
			sqlitedatabase.execSQL("CREATE TABLE writes (id INTEGER, path TEXT, type TEXT, part INTEGER, node BLOB, UNIQUE (id, part));");
	//   15   31:aload_1         
	//   16   32:ldc1            #54  <String "CREATE TABLE writes (id INTEGER, path TEXT, type TEXT, part INTEGER, node BLOB, UNIQUE (id, part));">
	//   17   34:invokevirtual   #44  <Method void SQLiteDatabase.execSQL(String)>
		else
	//*  18   37:goto            49
			SQLiteInstrumentation.execSQL((SQLiteDatabase)sqlitedatabase, "CREATE TABLE writes (id INTEGER, path TEXT, type TEXT, part INTEGER, node BLOB, UNIQUE (id, part));");
	//   19   40:aload_1         
	//   20   41:checkcast       #40  <Class SQLiteDatabase>
	//   21   44:ldc1            #54  <String "CREATE TABLE writes (id INTEGER, path TEXT, type TEXT, part INTEGER, node BLOB, UNIQUE (id, part));">
	//   22   46:invokestatic    #48  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
		if(!flag)
	//*  23   49:iload_2         
	//*  24   50:ifne            62
			sqlitedatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
	//   25   53:aload_1         
	//   26   54:ldc1            #56  <String "CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);">
	//   27   56:invokevirtual   #44  <Method void SQLiteDatabase.execSQL(String)>
		else
	//*  28   59:goto            71
			SQLiteInstrumentation.execSQL((SQLiteDatabase)sqlitedatabase, "CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
	//   29   62:aload_1         
	//   30   63:checkcast       #40  <Class SQLiteDatabase>
	//   31   66:ldc1            #56  <String "CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);">
	//   32   68:invokestatic    #48  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
		if(!flag)
	//*  33   71:iload_2         
	//*  34   72:ifne            82
		{
			sqlitedatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
	//   35   75:aload_1         
	//   36   76:ldc1            #58  <String "CREATE TABLE trackedKeys (id INTEGER, key TEXT);">
	//   37   78:invokevirtual   #44  <Method void SQLiteDatabase.execSQL(String)>
			return;
	//   38   81:return          
		} else
		{
			SQLiteInstrumentation.execSQL((SQLiteDatabase)sqlitedatabase, "CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
	//   39   82:aload_1         
	//   40   83:checkcast       #40  <Class SQLiteDatabase>
	//   41   86:ldc1            #58  <String "CREATE TABLE trackedKeys (id INTEGER, key TEXT);">
	//   42   88:invokestatic    #48  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
			return;
	//   43   91:return          
		}
	}

	public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
	{
		if(i <= 1)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:icmpgt          93
		{
			dropTable(sqlitedatabase, "serverCache");
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #62  <String "serverCache">
	//    6    9:invokespecial   #64  <Method void dropTable(SQLiteDatabase, String)>
			boolean flag = sqlitedatabase instanceof SQLiteDatabase;
	//    7   12:aload_1         
	//    8   13:instanceof      #40  <Class SQLiteDatabase>
	//    9   16:istore          4
			if(!flag)
	//*  10   18:iload           4
	//*  11   20:ifne            32
				sqlitedatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
	//   12   23:aload_1         
	//   13   24:ldc1            #52  <String "CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);">
	//   14   26:invokevirtual   #44  <Method void SQLiteDatabase.execSQL(String)>
			else
	//*  15   29:goto            41
				SQLiteInstrumentation.execSQL((SQLiteDatabase)sqlitedatabase, "CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
	//   16   32:aload_1         
	//   17   33:checkcast       #40  <Class SQLiteDatabase>
	//   18   36:ldc1            #52  <String "CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);">
	//   19   38:invokestatic    #48  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
			dropTable(sqlitedatabase, "complete");
	//   20   41:aload_0         
	//   21   42:aload_1         
	//   22   43:ldc1            #66  <String "complete">
	//   23   45:invokespecial   #64  <Method void dropTable(SQLiteDatabase, String)>
			if(!flag)
	//*  24   48:iload           4
	//*  25   50:ifne            62
				sqlitedatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
	//   26   53:aload_1         
	//   27   54:ldc1            #58  <String "CREATE TABLE trackedKeys (id INTEGER, key TEXT);">
	//   28   56:invokevirtual   #44  <Method void SQLiteDatabase.execSQL(String)>
			else
	//*  29   59:goto            71
				SQLiteInstrumentation.execSQL((SQLiteDatabase)sqlitedatabase, "CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
	//   30   62:aload_1         
	//   31   63:checkcast       #40  <Class SQLiteDatabase>
	//   32   66:ldc1            #58  <String "CREATE TABLE trackedKeys (id INTEGER, key TEXT);">
	//   33   68:invokestatic    #48  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
			if(!flag)
	//*  34   71:iload           4
	//*  35   73:ifne            83
			{
				sqlitedatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
	//   36   76:aload_1         
	//   37   77:ldc1            #56  <String "CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);">
	//   38   79:invokevirtual   #44  <Method void SQLiteDatabase.execSQL(String)>
				return;
	//   39   82:return          
			} else
			{
				SQLiteInstrumentation.execSQL((SQLiteDatabase)sqlitedatabase, "CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
	//   40   83:aload_1         
	//   41   84:checkcast       #40  <Class SQLiteDatabase>
	//   42   87:ldc1            #56  <String "CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);">
	//   43   89:invokestatic    #48  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
				return;
	//   44   92:return          
			}
		} else
		{
			sqlitedatabase = ((SQLiteDatabase) (new StringBuilder()));
	//   45   93:new             #26  <Class StringBuilder>
	//   46   96:dup             
	//   47   97:invokespecial   #28  <Method void StringBuilder()>
	//   48  100:astore_1        
			((StringBuilder) (sqlitedatabase)).append("We don't handle upgrading to ");
	//   49  101:aload_1         
	//   50  102:ldc1            #68  <String "We don't handle upgrading to ">
	//   51  104:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   52  107:pop             
			((StringBuilder) (sqlitedatabase)).append(j);
	//   53  108:aload_1         
	//   54  109:iload_3         
	//   55  110:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   56  113:pop             
			throw new AssertionError(((Object) (((StringBuilder) (sqlitedatabase)).toString())));
	//   57  114:new             #73  <Class AssertionError>
	//   58  117:dup             
	//   59  118:aload_1         
	//   60  119:invokevirtual   #38  <Method String StringBuilder.toString()>
	//   61  122:invokespecial   #76  <Method void AssertionError(Object)>
	//   62  125:athrow          
		}
	}

	static final boolean $assertionsDisabled = false;
	private static final int DATABASE_VERSION = 2;

	static 
	{
	//    0    0:return          
	}

	public SqlPersistenceStorageEngine$PersistentCacheOpenHelper(Context context, String s)
	{
		super(context, s, ((android.database.sqlite.SQLiteDatabase.CursorFactory) (null)), 2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:iconst_2        
	//    5    5:invokespecial   #22  <Method void SQLiteOpenHelper(Context, String, android.database.sqlite.SQLiteDatabase$CursorFactory, int)>
	//    6    8:return          
	}
}
