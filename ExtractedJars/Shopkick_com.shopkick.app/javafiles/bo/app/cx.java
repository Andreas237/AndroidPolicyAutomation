// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.Map;

public final class cx extends SQLiteOpenHelper
{

	private cx(Context context, String s)
	{
		super(context, s, ((android.database.sqlite.SQLiteDatabase.CursorFactory) (null)), 3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:iconst_3        
	//    5    5:invokespecial   #47  <Method void SQLiteOpenHelper(Context, String, android.database.sqlite.SQLiteDatabase$CursorFactory, int)>
	//    6    8:return          
	}

	public static cx a(Context context, String s, String s1)
	{
		s = b(context, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #51  <Method String b(Context, String, String)>
	//    4    6:astore_1        
		if(b.containsKey(((Object) (s))))
			break MISSING_BLOCK_LABEL_72;
	//    5    7:getstatic       #30  <Field Map b>
	//    6   10:aload_1         
	//    7   11:invokeinterface #57  <Method boolean Map.containsKey(Object)>
	//    8   16:ifne            72
		bo/app/cx;
	//    9   19:ldc1            #2   <Class cx>
		JVM INSTR monitorenter ;
	//   10   21:monitorenter    
		if(b.containsKey(((Object) (s))))
			break MISSING_BLOCK_LABEL_60;
	//   11   22:getstatic       #30  <Field Map b>
	//   12   25:aload_1         
	//   13   26:invokeinterface #57  <Method boolean Map.containsKey(Object)>
	//   14   31:ifne            60
		context = ((Context) (new cx(context, s)));
	//   15   34:new             #2   <Class cx>
	//   16   37:dup             
	//   17   38:aload_0         
	//   18   39:aload_1         
	//   19   40:invokespecial   #59  <Method void cx(Context, String)>
	//   20   43:astore_0        
		b.put(((Object) (s)), ((Object) (context)));
	//   21   44:getstatic       #30  <Field Map b>
	//   22   47:aload_1         
	//   23   48:aload_0         
	//   24   49:invokeinterface #63  <Method Object Map.put(Object, Object)>
	//   25   54:pop             
		bo/app/cx;
	//   26   55:ldc1            #2   <Class cx>
		JVM INSTR monitorexit ;
	//   27   57:monitorexit     
		return ((cx) (context));
	//   28   58:aload_0         
	//   29   59:areturn         
		bo/app/cx;
	//   30   60:ldc1            #2   <Class cx>
		JVM INSTR monitorexit ;
	//   31   62:monitorexit     
		break MISSING_BLOCK_LABEL_72;
	//   32   63:goto            72
		context;
	//   33   66:astore_0        
		bo/app/cx;
	//   34   67:ldc1            #2   <Class cx>
		JVM INSTR monitorexit ;
	//   35   69:monitorexit     
		throw context;
	//   36   70:aload_0         
	//   37   71:athrow          
		return (cx)b.get(((Object) (s)));
	//   38   72:getstatic       #30  <Field Map b>
	//   39   75:aload_1         
	//   40   76:invokeinterface #67  <Method Object Map.get(Object)>
	//   41   81:checkcast       #2   <Class cx>
	//   42   84:areturn         
	}

	public static void a(Context context)
	{
		File file = context.getDatabasePath(" ").getParentFile();
	//    0    0:aload_0         
	//    1    1:ldc1            #70  <String " ">
	//    2    3:invokevirtual   #76  <Method File Context.getDatabasePath(String)>
	//    3    6:invokevirtual   #82  <Method File File.getParentFile()>
	//    4    9:astore_3        
		if(file.exists() && file.isDirectory())
	//*   5   10:aload_3         
	//*   6   11:invokevirtual   #86  <Method boolean File.exists()>
	//*   7   14:ifeq            112
	//*   8   17:aload_3         
	//*   9   18:invokevirtual   #89  <Method boolean File.isDirectory()>
	//*  10   21:ifeq            112
		{
			File afile[] = file.listFiles(new FilenameFilter() {

				public boolean accept(File file2, String s1)
				{
					return s1.startsWith("appboy.db");
				//    0    0:aload_2         
				//    1    1:ldc1            #20  <String "appboy.db">
				//    2    3:invokevirtual   #26  <Method boolean String.startsWith(String)>
				//    3    6:ireturn         
				}

			}
);
	//   11   24:aload_3         
	//   12   25:new             #6   <Class cx$1>
	//   13   28:dup             
	//   14   29:invokespecial   #90  <Method void cx$1()>
	//   15   32:invokevirtual   #94  <Method File[] File.listFiles(FilenameFilter)>
	//   16   35:astore_3        
			int j = afile.length;
	//   17   36:aload_3         
	//   18   37:arraylength     
	//   19   38:istore_2        
			for(int i = 0; i < j; i++)
	//*  20   39:iconst_0        
	//*  21   40:istore_1        
	//*  22   41:iload_1         
	//*  23   42:iload_2         
	//*  24   43:icmpge          112
			{
				File file1 = afile[i];
	//   25   46:aload_3         
	//   26   47:iload_1         
	//   27   48:aaload          
	//   28   49:astore          4
				String s = a;
	//   29   51:getstatic       #23  <Field String a>
	//   30   54:astore          5
				StringBuilder stringbuilder = new StringBuilder();
	//   31   56:new             #96  <Class StringBuilder>
	//   32   59:dup             
	//   33   60:invokespecial   #97  <Method void StringBuilder()>
	//   34   63:astore          6
				stringbuilder.append("Deleting database file at: ");
	//   35   65:aload           6
	//   36   67:ldc1            #99  <String "Deleting database file at: ">
	//   37   69:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   38   72:pop             
				stringbuilder.append(file1.getAbsolutePath());
	//   39   73:aload           6
	//   40   75:aload           4
	//   41   77:invokevirtual   #107 <Method String File.getAbsolutePath()>
	//   42   80:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   43   83:pop             
				AppboyLogger.v(s, stringbuilder.toString());
	//   44   84:aload           5
	//   45   86:aload           6
	//   46   88:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   47   91:invokestatic    #114 <Method int AppboyLogger.v(String, String)>
	//   48   94:pop             
				context.deleteDatabase(file1.getName());
	//   49   95:aload_0         
	//   50   96:aload           4
	//   51   98:invokevirtual   #117 <Method String File.getName()>
	//   52  101:invokevirtual   #121 <Method boolean Context.deleteDatabase(String)>
	//   53  104:pop             
			}

	//   54  105:iload_1         
	//   55  106:iconst_1        
	//   56  107:iadd            
	//   57  108:istore_1        
		}
	//*  58  109:goto            41
	//   59  112:return          
	}

	private static void a(SQLiteDatabase sqlitedatabase)
	{
		String as[] = c;
	//    0    0:getstatic       #42  <Field String[] c>
	//    1    3:astore_3        
		int j = as.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int i = 0; i < j; i++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:iload_1         
	//*   8   10:iload_2         
	//*   9   11:icmpge          101
		{
			String s = as[i];
	//   10   14:aload_3         
	//   11   15:iload_1         
	//   12   16:aaload          
	//   13   17:astore          4
			Object obj = ((Object) (new StringBuilder()));
	//   14   19:new             #96  <Class StringBuilder>
	//   15   22:dup             
	//   16   23:invokespecial   #97  <Method void StringBuilder()>
	//   17   26:astore          5
			((StringBuilder) (obj)).append("DROP TABLE IF EXISTS ");
	//   18   28:aload           5
	//   19   30:ldc1            #124 <String "DROP TABLE IF EXISTS ">
	//   20   32:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   21   35:pop             
			((StringBuilder) (obj)).append(s);
	//   22   36:aload           5
	//   23   38:aload           4
	//   24   40:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   25   43:pop             
			sqlitedatabase.execSQL(((StringBuilder) (obj)).toString());
	//   26   44:aload_0         
	//   27   45:aload           5
	//   28   47:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   29   50:invokevirtual   #130 <Method void SQLiteDatabase.execSQL(String)>
			obj = ((Object) (a));
	//   30   53:getstatic       #23  <Field String a>
	//   31   56:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//   32   58:new             #96  <Class StringBuilder>
	//   33   61:dup             
	//   34   62:invokespecial   #97  <Method void StringBuilder()>
	//   35   65:astore          6
			stringbuilder.append("Dropped table with name: ");
	//   36   67:aload           6
	//   37   69:ldc1            #132 <String "Dropped table with name: ">
	//   38   71:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   39   74:pop             
			stringbuilder.append(s);
	//   40   75:aload           6
	//   41   77:aload           4
	//   42   79:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   43   82:pop             
			AppboyLogger.d(((String) (obj)), stringbuilder.toString());
	//   44   83:aload           5
	//   45   85:aload           6
	//   46   87:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   47   90:invokestatic    #135 <Method int AppboyLogger.d(String, String)>
	//   48   93:pop             
		}

	//   49   94:iload_1         
	//   50   95:iconst_1        
	//   51   96:iadd            
	//   52   97:istore_1        
	//*  53   98:goto            9
	//   54  101:return          
	}

	static String b(Context context, String s, String s1)
	{
		if(StringUtils.isNullOrBlank(s))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #140 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   2    4:ifeq            10
		{
			return "appboy.db";
	//    3    7:ldc1            #142 <String "appboy.db">
	//    4    9:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   10:new             #96  <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #97  <Method void StringBuilder()>
	//    8   17:astore_3        
			stringbuilder.append("appboy.db");
	//    9   18:aload_3         
	//   10   19:ldc1            #142 <String "appboy.db">
	//   11   21:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
			stringbuilder.append(StringUtils.getCacheFileSuffix(context, s, s1));
	//   13   25:aload_3         
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:invokestatic    #145 <Method String StringUtils.getCacheFileSuffix(Context, String, String)>
	//   18   32:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
			return stringbuilder.toString();
	//   20   36:aload_3         
	//   21   37:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   22   40:areturn         
		}
	}

	public void onCreate(SQLiteDatabase sqlitedatabase)
	{
		AppboyLogger.i(a, "Creating ab_events table");
	//    0    0:getstatic       #23  <Field String a>
	//    1    3:ldc1            #148 <String "Creating ab_events table">
	//    2    5:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//    3    8:pop             
		sqlitedatabase.execSQL("CREATE TABLE ab_events (_id INTEGER PRIMARY KEY AUTOINCREMENT, session_id TEXT, user_id TEXT, event_type TEXT NOT NULL, event_data TEXT NOT NULL, event_guid TEXT NOT NULL, timestamp INTEGER NOT NULL);");
	//    4    9:aload_1         
	//    5   10:ldc1            #153 <String "CREATE TABLE ab_events (_id INTEGER PRIMARY KEY AUTOINCREMENT, session_id TEXT, user_id TEXT, event_type TEXT NOT NULL, event_data TEXT NOT NULL, event_guid TEXT NOT NULL, timestamp INTEGER NOT NULL);">
	//    6   12:invokevirtual   #130 <Method void SQLiteDatabase.execSQL(String)>
	//    7   15:return          
	}

	public void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
	{
		String s = a;
	//    0    0:getstatic       #23  <Field String a>
	//    1    3:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//    2    5:new             #96  <Class StringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #97  <Method void StringBuilder()>
	//    5   12:astore          5
		stringbuilder.append("Downgrading storage from version ");
	//    6   14:aload           5
	//    7   16:ldc1            #157 <String "Downgrading storage from version ">
	//    8   18:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
		stringbuilder.append(i);
	//   10   22:aload           5
	//   11   24:iload_2         
	//   12   25:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//   13   28:pop             
		stringbuilder.append(" to ");
	//   14   29:aload           5
	//   15   31:ldc1            #162 <String " to ">
	//   16   33:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   17   36:pop             
		stringbuilder.append(j);
	//   18   37:aload           5
	//   19   39:iload_3         
	//   20   40:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//   21   43:pop             
		stringbuilder.append(". Dropping all current tables.");
	//   22   44:aload           5
	//   23   46:ldc1            #164 <String ". Dropping all current tables.">
	//   24   48:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
		AppboyLogger.i(s, stringbuilder.toString());
	//   26   52:aload           4
	//   27   54:aload           5
	//   28   56:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   29   59:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//   30   62:pop             
		a(sqlitedatabase);
	//   31   63:aload_1         
	//   32   64:invokestatic    #166 <Method void a(SQLiteDatabase)>
		onCreate(sqlitedatabase);
	//   33   67:aload_0         
	//   34   68:aload_1         
	//   35   69:invokevirtual   #168 <Method void onCreate(SQLiteDatabase)>
	//   36   72:return          
	}

	public void onOpen(SQLiteDatabase sqlitedatabase)
	{
		super.onOpen(sqlitedatabase);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #174 <Method void SQLiteOpenHelper.onOpen(SQLiteDatabase)>
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   3    5:getstatic       #180 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          16
	//*   5   10:icmplt          19
		{
			sqlitedatabase.setForeignKeyConstraintsEnabled(true);
	//    6   13:aload_1         
	//    7   14:iconst_1        
	//    8   15:invokevirtual   #184 <Method void SQLiteDatabase.setForeignKeyConstraintsEnabled(boolean)>
			return;
	//    9   18:return          
		}
		if(!sqlitedatabase.isReadOnly())
	//*  10   19:aload_1         
	//*  11   20:invokevirtual   #187 <Method boolean SQLiteDatabase.isReadOnly()>
	//*  12   23:ifne            32
			sqlitedatabase.execSQL("PRAGMA foreign_keys = ON;");
	//   13   26:aload_1         
	//   14   27:ldc1            #189 <String "PRAGMA foreign_keys = ON;">
	//   15   29:invokevirtual   #130 <Method void SQLiteDatabase.execSQL(String)>
	//   16   32:return          
	}

	public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
	{
		String s = a;
	//    0    0:getstatic       #23  <Field String a>
	//    1    3:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//    2    5:new             #96  <Class StringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #97  <Method void StringBuilder()>
	//    5   12:astore          5
		stringbuilder.append("Upgrading storage from version ");
	//    6   14:aload           5
	//    7   16:ldc1            #193 <String "Upgrading storage from version ">
	//    8   18:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
		stringbuilder.append(i);
	//   10   22:aload           5
	//   11   24:iload_2         
	//   12   25:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//   13   28:pop             
		stringbuilder.append(" to ");
	//   14   29:aload           5
	//   15   31:ldc1            #162 <String " to ">
	//   16   33:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   17   36:pop             
		stringbuilder.append(j);
	//   18   37:aload           5
	//   19   39:iload_3         
	//   20   40:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//   21   43:pop             
		stringbuilder.append(". Dropping all current tables.");
	//   22   44:aload           5
	//   23   46:ldc1            #164 <String ". Dropping all current tables.">
	//   24   48:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
		AppboyLogger.i(s, stringbuilder.toString());
	//   26   52:aload           4
	//   27   54:aload           5
	//   28   56:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   29   59:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//   30   62:pop             
		a(sqlitedatabase);
	//   31   63:aload_1         
	//   32   64:invokestatic    #166 <Method void a(SQLiteDatabase)>
		onCreate(sqlitedatabase);
	//   33   67:aload_0         
	//   34   68:aload_1         
	//   35   69:invokevirtual   #168 <Method void onCreate(SQLiteDatabase)>
	//   36   72:return          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/cx);
	private static volatile Map b = new HashMap();
	private static final String c[] = {
		"ab_events", "ab_sessions", "sessions", "appboy_events"
	};

	static 
	{
	//    0    0:ldc1            #2   <Class cx>
	//    1    2:invokestatic    #21  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #23  <Field String a>
	//    3    8:new             #25  <Class HashMap>
	//    4   11:dup             
	//    5   12:invokespecial   #28  <Method void HashMap()>
	//    6   15:putstatic       #30  <Field Map b>
	//    7   18:iconst_4        
	//    8   19:anewarray       String[]
	//    9   22:dup             
	//   10   23:iconst_0        
	//   11   24:ldc1            #34  <String "ab_events">
	//   12   26:aastore         
	//   13   27:dup             
	//   14   28:iconst_1        
	//   15   29:ldc1            #36  <String "ab_sessions">
	//   16   31:aastore         
	//   17   32:dup             
	//   18   33:iconst_2        
	//   19   34:ldc1            #38  <String "sessions">
	//   20   36:aastore         
	//   21   37:dup             
	//   22   38:iconst_3        
	//   23   39:ldc1            #40  <String "appboy_events">
	//   24   41:aastore         
	//   25   42:putstatic       #42  <Field String[] c>
	//*  26   45:return          
	}
}
