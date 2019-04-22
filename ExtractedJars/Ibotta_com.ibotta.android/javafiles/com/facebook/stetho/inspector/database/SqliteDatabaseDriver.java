// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.*;
import com.facebook.stetho.common.Util;
import com.newrelic.agent.android.instrumentation.SQLiteInstrumentation;
import java.io.File;
import java.util.*;

// Referenced classes of package com.facebook.stetho.inspector.database:
//			DefaultDatabaseFilesProvider, DatabaseFilesProvider

public class SqliteDatabaseDriver extends com.facebook.stetho.inspector.protocol.module.Database.DatabaseDriver
{

	public SqliteDatabaseDriver(Context context)
	{
		this(context, ((DatabaseFilesProvider) (new DefaultDatabaseFilesProvider(context))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #33  <Class DefaultDatabaseFilesProvider>
	//    3    5:dup             
	//    4    6:aload_1         
	//    5    7:invokespecial   #35  <Method void DefaultDatabaseFilesProvider(Context)>
	//    6   10:invokespecial   #38  <Method void SqliteDatabaseDriver(Context, DatabaseFilesProvider)>
	//    7   13:return          
	}

	public SqliteDatabaseDriver(Context context, DatabaseFilesProvider databasefilesprovider)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #40  <Method void com.facebook.stetho.inspector.protocol.module.Database$DatabaseDriver(Context)>
		mDatabaseFilesProvider = databasefilesprovider;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #42  <Field DatabaseFilesProvider mDatabaseFilesProvider>
	//    6   10:return          
	}

	private Object executeInsert(SQLiteDatabase sqlitedatabase, String s, com.facebook.stetho.inspector.protocol.module.Database.DatabaseDriver.ExecuteResultHandler executeresulthandler)
	{
		return executeresulthandler.handleInsert(sqlitedatabase.compileStatement(s).executeInsert());
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #50  <Method SQLiteStatement SQLiteDatabase.compileStatement(String)>
	//    4    6:invokevirtual   #55  <Method long SQLiteStatement.executeInsert()>
	//    5    9:invokeinterface #61  <Method Object com.facebook.stetho.inspector.protocol.module.Database$DatabaseDriver$ExecuteResultHandler.handleInsert(long)>
	//    6   14:areturn         
	}

	private Object executeRawQuery(SQLiteDatabase sqlitedatabase, String s, com.facebook.stetho.inspector.protocol.module.Database.DatabaseDriver.ExecuteResultHandler executeresulthandler)
	{
		if(!(sqlitedatabase instanceof SQLiteDatabase))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #46  <Class SQLiteDatabase>
	//*   2    4:ifne            15
			sqlitedatabase.execSQL(s);
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #68  <Method void SQLiteDatabase.execSQL(String)>
		else
	//*   6   12:goto            23
			SQLiteInstrumentation.execSQL((SQLiteDatabase)sqlitedatabase, s);
	//    7   15:aload_1         
	//    8   16:checkcast       #46  <Class SQLiteDatabase>
	//    9   19:aload_2         
	//   10   20:invokestatic    #73  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
		return executeresulthandler.handleRawQuery();
	//   11   23:aload_3         
	//   12   24:invokeinterface #77  <Method Object com.facebook.stetho.inspector.protocol.module.Database$DatabaseDriver$ExecuteResultHandler.handleRawQuery()>
	//   13   29:areturn         
	}

	private Object executeSelect(SQLiteDatabase sqlitedatabase, String s, com.facebook.stetho.inspector.protocol.module.Database.DatabaseDriver.ExecuteResultHandler executeresulthandler)
	{
		if(!(sqlitedatabase instanceof SQLiteDatabase))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #46  <Class SQLiteDatabase>
	//*   2    4:ifne            17
			sqlitedatabase = ((SQLiteDatabase) (sqlitedatabase.rawQuery(s, ((String []) (null)))));
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #82  <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//    7   13:astore_1        
		else
	//*   8   14:goto            27
			sqlitedatabase = ((SQLiteDatabase) (SQLiteInstrumentation.rawQuery((SQLiteDatabase)sqlitedatabase, s, ((String []) (null)))));
	//    9   17:aload_1         
	//   10   18:checkcast       #46  <Class SQLiteDatabase>
	//   11   21:aload_2         
	//   12   22:aconst_null     
	//   13   23:invokestatic    #85  <Method Cursor SQLiteInstrumentation.rawQuery(SQLiteDatabase, String, String[])>
	//   14   26:astore_1        
		s = ((String) (executeresulthandler.handleSelect(((Cursor) (sqlitedatabase)))));
	//   15   27:aload_3         
	//   16   28:aload_1         
	//   17   29:invokeinterface #89  <Method Object com.facebook.stetho.inspector.protocol.module.Database$DatabaseDriver$ExecuteResultHandler.handleSelect(Cursor)>
	//   18   34:astore_2        
		((Cursor) (sqlitedatabase)).close();
	//   19   35:aload_1         
	//   20   36:invokeinterface #94  <Method void Cursor.close()>
		return ((Object) (s));
	//   21   41:aload_2         
	//   22   42:areturn         
		s;
	//   23   43:astore_2        
		((Cursor) (sqlitedatabase)).close();
	//   24   44:aload_1         
	//   25   45:invokeinterface #94  <Method void Cursor.close()>
		throw s;
	//   26   50:aload_2         
	//   27   51:athrow          
	}

	private Object executeUpdateDelete(SQLiteDatabase sqlitedatabase, String s, com.facebook.stetho.inspector.protocol.module.Database.DatabaseDriver.ExecuteResultHandler executeresulthandler)
	{
		return executeresulthandler.handleUpdateDelete(sqlitedatabase.compileStatement(s).executeUpdateDelete());
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #50  <Method SQLiteStatement SQLiteDatabase.compileStatement(String)>
	//    4    6:invokevirtual   #101 <Method int SQLiteStatement.executeUpdateDelete()>
	//    5    9:invokeinterface #105 <Method Object com.facebook.stetho.inspector.protocol.module.Database$DatabaseDriver$ExecuteResultHandler.handleUpdateDelete(int)>
	//    6   14:areturn         
	}

	private static String getFirstWord(String s)
	{
		String s1 = s.trim();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method String String.trim()>
	//    2    4:astore_2        
		int i = s1.indexOf(' ');
	//    3    5:aload_2         
	//    4    6:bipush          32
	//    5    8:invokevirtual   #116 <Method int String.indexOf(int)>
	//    6   11:istore_1        
		s = s1;
	//    7   12:aload_2         
	//    8   13:astore_0        
		if(i >= 0)
	//*   9   14:iload_1         
	//*  10   15:iflt            25
			s = s1.substring(0, i);
	//   11   18:aload_2         
	//   12   19:iconst_0        
	//   13   20:iload_1         
	//   14   21:invokevirtual   #120 <Method String String.substring(int, int)>
	//   15   24:astore_0        
		return s;
	//   16   25:aload_0         
	//   17   26:areturn         
	}

	private SQLiteDatabase openDatabase(String s)
		throws SQLiteException
	{
		Util.throwIfNull(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #130 <Method Object Util.throwIfNull(Object)>
	//    2    4:pop             
		return SQLiteDatabase.openDatabase(mContext.getDatabasePath(s).getAbsolutePath(), ((android.database.sqlite.SQLiteDatabase.CursorFactory) (null)), 0);
	//    3    5:aload_0         
	//    4    6:getfield        #134 <Field Context mContext>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #140 <Method File Context.getDatabasePath(String)>
	//    7   13:invokevirtual   #145 <Method String File.getAbsolutePath()>
	//    8   16:aconst_null     
	//    9   17:iconst_0        
	//   10   18:invokestatic    #148 <Method SQLiteDatabase SQLiteDatabase.openDatabase(String, android.database.sqlite.SQLiteDatabase$CursorFactory, int)>
	//   11   21:areturn         
	}

	private static String removeSuffix(String s, String as[])
	{
		int j = as.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          47
		{
			String s1 = as[i];
	//    8   10:aload_1         
	//    9   11:iload_2         
	//   10   12:aaload          
	//   11   13:astore          4
			if(s.endsWith(s1))
	//*  12   15:aload_0         
	//*  13   16:aload           4
	//*  14   18:invokevirtual   #155 <Method boolean String.endsWith(String)>
	//*  15   21:ifeq            40
				return s.substring(0, s.length() - s1.length());
	//   16   24:aload_0         
	//   17   25:iconst_0        
	//   18   26:aload_0         
	//   19   27:invokevirtual   #158 <Method int String.length()>
	//   20   30:aload           4
	//   21   32:invokevirtual   #158 <Method int String.length()>
	//   22   35:isub            
	//   23   36:invokevirtual   #120 <Method String String.substring(int, int)>
	//   24   39:areturn         
		}

	//   25   40:iload_2         
	//   26   41:iconst_1        
	//   27   42:iadd            
	//   28   43:istore_2        
	//*  29   44:goto            5
		return s;
	//   30   47:aload_0         
	//   31   48:areturn         
	}

	static List tidyDatabaseList(List list)
	{
		HashSet hashset = new HashSet(((java.util.Collection) (list)));
	//    0    0:new             #162 <Class HashSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #165 <Method void HashSet(java.util.Collection)>
	//    4    8:astore_1        
		ArrayList arraylist = new ArrayList();
	//    5    9:new             #167 <Class ArrayList>
	//    6   12:dup             
	//    7   13:invokespecial   #169 <Method void ArrayList()>
	//    8   16:astore_2        
		list = ((List) (list.iterator()));
	//    9   17:aload_0         
	//   10   18:invokeinterface #175 <Method Iterator List.iterator()>
	//   11   23:astore_0        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//   12   24:aload_0         
	//   13   25:invokeinterface #181 <Method boolean Iterator.hasNext()>
	//   14   30:ifeq            98
			File file = (File)((Iterator) (list)).next();
	//   15   33:aload_0         
	//   16   34:invokeinterface #184 <Method Object Iterator.next()>
	//   17   39:checkcast       #142 <Class File>
	//   18   42:astore_3        
			String s = file.getPath();
	//   19   43:aload_3         
	//   20   44:invokevirtual   #187 <Method String File.getPath()>
	//   21   47:astore          4
			String s1 = removeSuffix(s, UNINTERESTING_FILENAME_SUFFIXES);
	//   22   49:aload           4
	//   23   51:getstatic       #27  <Field String[] UNINTERESTING_FILENAME_SUFFIXES>
	//   24   54:invokestatic    #189 <Method String removeSuffix(String, String[])>
	//   25   57:astore          5
			if(s1.equals(((Object) (s))) || !((Set) (hashset)).contains(((Object) (new File(s1)))))
	//*  26   59:aload           5
	//*  27   61:aload           4
	//*  28   63:invokevirtual   #193 <Method boolean String.equals(Object)>
	//*  29   66:ifne            87
	//*  30   69:aload_1         
	//*  31   70:new             #142 <Class File>
	//*  32   73:dup             
	//*  33   74:aload           5
	//*  34   76:invokespecial   #195 <Method void File(String)>
	//*  35   79:invokeinterface #200 <Method boolean Set.contains(Object)>
	//*  36   84:ifne            24
				((List) (arraylist)).add(((Object) (file)));
	//   37   87:aload_2         
	//   38   88:aload_3         
	//   39   89:invokeinterface #203 <Method boolean List.add(Object)>
	//   40   94:pop             
		} while(true);
	//   41   95:goto            24
		return ((List) (arraylist));
	//   42   98:aload_2         
	//   43   99:areturn         
	}

	public com.facebook.stetho.inspector.protocol.module.Database.ExecuteSQLResponse executeSQL(String s, String s1, com.facebook.stetho.inspector.protocol.module.Database.DatabaseDriver.ExecuteResultHandler executeresulthandler)
		throws SQLiteException
	{
		Util.throwIfNull(((Object) (s1)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #130 <Method Object Util.throwIfNull(Object)>
	//    2    4:pop             
		Util.throwIfNull(((Object) (executeresulthandler)));
	//    3    5:aload_3         
	//    4    6:invokestatic    #130 <Method Object Util.throwIfNull(Object)>
	//    5    9:pop             
		s = ((String) (openDatabase(s)));
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #208 <Method SQLiteDatabase openDatabase(String)>
	//    9   15:astore_1        
		String s2 = getFirstWord(s1).toUpperCase();
	//   10   16:aload_2         
	//   11   17:invokestatic    #210 <Method String getFirstWord(String)>
	//   12   20:invokevirtual   #213 <Method String String.toUpperCase()>
	//   13   23:astore          5
		byte byte0 = -1;
	//   14   25:iconst_m1       
	//   15   26:istore          4
		s2.hashCode();
	//   16   28:aload           5
	//   17   30:invokevirtual   #216 <Method int String.hashCode()>
		JVM INSTR lookupswitch 6: default 268
	//	               -2130463047: 172
	//	               -1926899396: 156
	//	               -1852692228: 140
	//	               -1785516855: 124
	//	               -591179561: 108
	//	               2012838315: 92;
	//   18   33:lookupswitch    6: default 268
	//	               -2130463047: 172
	//	               -1926899396: 156
	//	               -1852692228: 140
	//	               -1785516855: 124
	//	               -591179561: 108
	//	               2012838315: 92
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L7:
		if(s2.equals("DELETE"))
	//*  19   92:aload           5
	//*  20   94:ldc1            #218 <String "DELETE">
	//*  21   96:invokevirtual   #193 <Method boolean String.equals(Object)>
	//*  22   99:ifeq            268
			byte0 = 1;
	//   23  102:iconst_1        
	//   24  103:istore          4
		  goto _L1
	//*  25  105:goto            268
_L6:
		if(s2.equals("EXPLAIN"))
	//*  26  108:aload           5
	//*  27  110:ldc1            #220 <String "EXPLAIN">
	//*  28  112:invokevirtual   #193 <Method boolean String.equals(Object)>
	//*  29  115:ifeq            268
			byte0 = 5;
	//   30  118:iconst_5        
	//   31  119:istore          4
		  goto _L1
	//*  32  121:goto            268
_L5:
		if(s2.equals("UPDATE"))
	//*  33  124:aload           5
	//*  34  126:ldc1            #222 <String "UPDATE">
	//*  35  128:invokevirtual   #193 <Method boolean String.equals(Object)>
	//*  36  131:ifeq            268
			byte0 = 0;
	//   37  134:iconst_0        
	//   38  135:istore          4
		  goto _L1
	//*  39  137:goto            268
_L4:
		if(s2.equals("SELECT"))
	//*  40  140:aload           5
	//*  41  142:ldc1            #224 <String "SELECT">
	//*  42  144:invokevirtual   #193 <Method boolean String.equals(Object)>
	//*  43  147:ifeq            268
			byte0 = 3;
	//   44  150:iconst_3        
	//   45  151:istore          4
		  goto _L1
	//*  46  153:goto            268
_L3:
		if(s2.equals("PRAGMA"))
	//*  47  156:aload           5
	//*  48  158:ldc1            #226 <String "PRAGMA">
	//*  49  160:invokevirtual   #193 <Method boolean String.equals(Object)>
	//*  50  163:ifeq            268
			byte0 = 4;
	//   51  166:iconst_4        
	//   52  167:istore          4
		  goto _L1
	//*  53  169:goto            268
_L2:
		if(s2.equals("INSERT"))
	//*  54  172:aload           5
	//*  55  174:ldc1            #228 <String "INSERT">
	//*  56  176:invokevirtual   #193 <Method boolean String.equals(Object)>
	//*  57  179:ifeq            268
			byte0 = 2;
	//   58  182:iconst_2        
	//   59  183:istore          4
		  goto _L1
	//*  60  185:goto            268
_L9:
		s1 = ((String) (executeRawQuery(((SQLiteDatabase) (s)), s1, executeresulthandler)));
	//   61  188:aload_0         
	//   62  189:aload_1         
	//   63  190:aload_2         
	//   64  191:aload_3         
	//   65  192:invokespecial   #230 <Method Object executeRawQuery(SQLiteDatabase, String, com.facebook.stetho.inspector.protocol.module.Database$DatabaseDriver$ExecuteResultHandler)>
	//   66  195:astore_2        
		  goto _L8
	//*  67  196:goto            250
_L12:
		s1 = ((String) ((com.facebook.stetho.inspector.protocol.module.Database.ExecuteSQLResponse)executeSelect(((SQLiteDatabase) (s)), s1, executeresulthandler)));
	//   68  199:aload_0         
	//   69  200:aload_1         
	//   70  201:aload_2         
	//   71  202:aload_3         
	//   72  203:invokespecial   #232 <Method Object executeSelect(SQLiteDatabase, String, com.facebook.stetho.inspector.protocol.module.Database$DatabaseDriver$ExecuteResultHandler)>
	//   73  206:checkcast       #234 <Class com.facebook.stetho.inspector.protocol.module.Database$ExecuteSQLResponse>
	//   74  209:astore_2        
		((SQLiteDatabase) (s)).close();
	//   75  210:aload_1         
	//   76  211:invokevirtual   #235 <Method void SQLiteDatabase.close()>
		return ((com.facebook.stetho.inspector.protocol.module.Database.ExecuteSQLResponse) (s1));
	//   77  214:aload_2         
	//   78  215:areturn         
_L11:
		s1 = ((String) ((com.facebook.stetho.inspector.protocol.module.Database.ExecuteSQLResponse)executeInsert(((SQLiteDatabase) (s)), s1, executeresulthandler)));
	//   79  216:aload_0         
	//   80  217:aload_1         
	//   81  218:aload_2         
	//   82  219:aload_3         
	//   83  220:invokespecial   #237 <Method Object executeInsert(SQLiteDatabase, String, com.facebook.stetho.inspector.protocol.module.Database$DatabaseDriver$ExecuteResultHandler)>
	//   84  223:checkcast       #234 <Class com.facebook.stetho.inspector.protocol.module.Database$ExecuteSQLResponse>
	//   85  226:astore_2        
		((SQLiteDatabase) (s)).close();
	//   86  227:aload_1         
	//   87  228:invokevirtual   #235 <Method void SQLiteDatabase.close()>
		return ((com.facebook.stetho.inspector.protocol.module.Database.ExecuteSQLResponse) (s1));
	//   88  231:aload_2         
	//   89  232:areturn         
_L10:
		s1 = ((String) ((com.facebook.stetho.inspector.protocol.module.Database.ExecuteSQLResponse)executeUpdateDelete(((SQLiteDatabase) (s)), s1, executeresulthandler)));
	//   90  233:aload_0         
	//   91  234:aload_1         
	//   92  235:aload_2         
	//   93  236:aload_3         
	//   94  237:invokespecial   #239 <Method Object executeUpdateDelete(SQLiteDatabase, String, com.facebook.stetho.inspector.protocol.module.Database$DatabaseDriver$ExecuteResultHandler)>
	//   95  240:checkcast       #234 <Class com.facebook.stetho.inspector.protocol.module.Database$ExecuteSQLResponse>
	//   96  243:astore_2        
		((SQLiteDatabase) (s)).close();
	//   97  244:aload_1         
	//   98  245:invokevirtual   #235 <Method void SQLiteDatabase.close()>
		return ((com.facebook.stetho.inspector.protocol.module.Database.ExecuteSQLResponse) (s1));
	//   99  248:aload_2         
	//  100  249:areturn         
_L8:
		s1 = ((String) ((com.facebook.stetho.inspector.protocol.module.Database.ExecuteSQLResponse)s1));
	//  101  250:aload_2         
	//  102  251:checkcast       #234 <Class com.facebook.stetho.inspector.protocol.module.Database$ExecuteSQLResponse>
	//  103  254:astore_2        
		((SQLiteDatabase) (s)).close();
	//  104  255:aload_1         
	//  105  256:invokevirtual   #235 <Method void SQLiteDatabase.close()>
		return ((com.facebook.stetho.inspector.protocol.module.Database.ExecuteSQLResponse) (s1));
	//  106  259:aload_2         
	//  107  260:areturn         
		s1;
	//  108  261:astore_2        
		((SQLiteDatabase) (s)).close();
	//  109  262:aload_1         
	//  110  263:invokevirtual   #235 <Method void SQLiteDatabase.close()>
		throw s1;
	//  111  266:aload_2         
	//  112  267:athrow          
_L1:
		byte0;
	//  113  268:iload           4
		JVM INSTR tableswitch 0 5: default 308
	//	               0 233
	//	               1 233
	//	               2 216
	//	               3 199
	//	               4 199
	//	               5 199;
	//  114  270:tableswitch     0 5: default 308
	//	               0 233
	//	               1 233
	//	               2 216
	//	               3 199
	//	               4 199
	//	               5 199
		   goto _L9 _L10 _L10 _L11 _L12 _L12 _L12
	//* 115  308:goto            188
	}

	public List getDatabaseNames()
	{
		if(mDatabases == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #244 <Field List mDatabases>
	//*   2    4:ifnonnull       78
		{
			mDatabases = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #167 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #169 <Method void ArrayList()>
	//    7   15:putfield        #244 <Field List mDatabases>
			Object obj = ((Object) (mDatabaseFilesProvider.getDatabaseFiles()));
	//    8   18:aload_0         
	//    9   19:getfield        #42  <Field DatabaseFilesProvider mDatabaseFilesProvider>
	//   10   22:invokeinterface #249 <Method List DatabaseFilesProvider.getDatabaseFiles()>
	//   11   27:astore_1        
			Collections.sort(((List) (obj)));
	//   12   28:aload_1         
	//   13   29:invokestatic    #255 <Method void Collections.sort(List)>
			String s;
			for(obj = ((Object) (((Iterable) (tidyDatabaseList(((List) (obj))))).iterator())); ((Iterator) (obj)).hasNext(); mDatabases.add(((Object) (s))))
	//*  14   32:aload_1         
	//*  15   33:invokestatic    #257 <Method List tidyDatabaseList(List)>
	//*  16   36:invokeinterface #260 <Method Iterator Iterable.iterator()>
	//*  17   41:astore_1        
	//*  18   42:aload_1         
	//*  19   43:invokeinterface #181 <Method boolean Iterator.hasNext()>
	//*  20   48:ifeq            78
				s = ((File)((Iterator) (obj)).next()).getName();
	//   21   51:aload_1         
	//   22   52:invokeinterface #184 <Method Object Iterator.next()>
	//   23   57:checkcast       #142 <Class File>
	//   24   60:invokevirtual   #263 <Method String File.getName()>
	//   25   63:astore_2        

	//   26   64:aload_0         
	//   27   65:getfield        #244 <Field List mDatabases>
	//   28   68:aload_2         
	//   29   69:invokeinterface #203 <Method boolean List.add(Object)>
	//   30   74:pop             
		}
	//*  31   75:goto            42
		return mDatabases;
	//   32   78:aload_0         
	//   33   79:getfield        #244 <Field List mDatabases>
	//   34   82:areturn         
	}

	public List getTableNames(String s)
		throws SQLiteException
	{
		SQLiteDatabase sqlitedatabase = openDatabase(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #208 <Method SQLiteDatabase openDatabase(String)>
	//    3    5:astore_2        
		s = ((String) (new String[2]));
	//    4    6:iconst_2        
	//    5    7:anewarray       String[]
	//    6   10:astore_1        
		s[0] = "table";
	//    7   11:aload_1         
	//    8   12:iconst_0        
	//    9   13:ldc2            #268 <String "table">
	//   10   16:aastore         
		s[1] = "view";
	//   11   17:aload_1         
	//   12   18:iconst_1        
	//   13   19:ldc2            #270 <String "view">
	//   14   22:aastore         
		if(!(sqlitedatabase instanceof SQLiteDatabase))
	//*  15   23:aload_2         
	//*  16   24:instanceof      #46  <Class SQLiteDatabase>
	//*  17   27:ifne            42
		{
			s = ((String) (sqlitedatabase.rawQuery("SELECT name FROM sqlite_master WHERE type IN (?, ?)", ((String []) (s)))));
	//   18   30:aload_2         
	//   19   31:ldc2            #272 <String "SELECT name FROM sqlite_master WHERE type IN (?, ?)">
	//   20   34:aload_1         
	//   21   35:invokevirtual   #82  <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//   22   38:astore_1        
			break MISSING_BLOCK_LABEL_54;
	//   23   39:goto            54
		}
		s = ((String) (SQLiteInstrumentation.rawQuery((SQLiteDatabase)sqlitedatabase, "SELECT name FROM sqlite_master WHERE type IN (?, ?)", ((String []) (s)))));
	//   24   42:aload_2         
	//   25   43:checkcast       #46  <Class SQLiteDatabase>
	//   26   46:ldc2            #272 <String "SELECT name FROM sqlite_master WHERE type IN (?, ?)">
	//   27   49:aload_1         
	//   28   50:invokestatic    #85  <Method Cursor SQLiteInstrumentation.rawQuery(SQLiteDatabase, String, String[])>
	//   29   53:astore_1        
		ArrayList arraylist;
		arraylist = new ArrayList();
	//   30   54:new             #167 <Class ArrayList>
	//   31   57:dup             
	//   32   58:invokespecial   #169 <Method void ArrayList()>
	//   33   61:astore_3        
		for(; ((Cursor) (s)).moveToNext(); ((List) (arraylist)).add(((Object) (((Cursor) (s)).getString(0)))));
	//   34   62:aload_1         
	//   35   63:invokeinterface #275 <Method boolean Cursor.moveToNext()>
	//   36   68:ifeq            88
	//   37   71:aload_3         
	//   38   72:aload_1         
	//   39   73:iconst_0        
	//   40   74:invokeinterface #279 <Method String Cursor.getString(int)>
	//   41   79:invokeinterface #203 <Method boolean List.add(Object)>
	//   42   84:pop             
	//*  43   85:goto            62
		((Cursor) (s)).close();
	//   44   88:aload_1         
	//   45   89:invokeinterface #94  <Method void Cursor.close()>
		sqlitedatabase.close();
	//   46   94:aload_2         
	//   47   95:invokevirtual   #235 <Method void SQLiteDatabase.close()>
		return ((List) (arraylist));
	//   48   98:aload_3         
	//   49   99:areturn         
		Exception exception;
		exception;
	//   50  100:astore_3        
		((Cursor) (s)).close();
	//   51  101:aload_1         
	//   52  102:invokeinterface #94  <Method void Cursor.close()>
		throw exception;
	//   53  107:aload_3         
	//   54  108:athrow          
		s;
	//   55  109:astore_1        
		sqlitedatabase.close();
	//   56  110:aload_2         
	//   57  111:invokevirtual   #235 <Method void SQLiteDatabase.close()>
		throw s;
	//   58  114:aload_1         
	//   59  115:athrow          
	}

	private static final String UNINTERESTING_FILENAME_SUFFIXES[] = {
		"-journal", "-shm", "-uid", "-wal"
	};
	private final DatabaseFilesProvider mDatabaseFilesProvider;
	private List mDatabases;

	static 
	{
	//    0    0:iconst_4        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #19  <String "-journal">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #21  <String "-shm">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #23  <String "-uid">
	//   13   18:aastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #25  <String "-wal">
	//   17   23:aastore         
	//   18   24:putstatic       #27  <Field String[] UNINTERESTING_FILENAME_SUFFIXES>
	//*  19   27:return          
	}
}
