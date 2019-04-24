// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database;

import android.content.Context;
import android.content.res.AssetManager;
import android.database.sqlite.SQLiteException;
import com.raizlabs.android.dbflow.config.*;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.migration.Migration;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.ModelViewAdapter;
import java.io.*;
import java.util.*;

// Referenced classes of package com.raizlabs.android.dbflow.structure.database:
//			DatabaseWrapper

public class BaseDatabaseHelper
{

	public BaseDatabaseHelper(DatabaseDefinition databasedefinition)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		databaseDefinition = databasedefinition;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field DatabaseDefinition databaseDefinition>
	//    5    9:return          
	}

	private void executeSqlScript(DatabaseWrapper databasewrapper, String s)
	{
		Object obj;
		BufferedReader bufferedreader;
		bufferedreader = new BufferedReader(((java.io.Reader) (new InputStreamReader(FlowManager.getContext().getAssets().open((new StringBuilder()).append("migrations/").append(getDatabaseDefinition().getDatabaseName()).append("/").append(s).toString())))));
	//    0    0:new             #24  <Class BufferedReader>
	//    1    3:dup             
	//    2    4:new             #26  <Class InputStreamReader>
	//    3    7:dup             
	//    4    8:invokestatic    #32  <Method Context FlowManager.getContext()>
	//    5   11:invokevirtual   #38  <Method AssetManager Context.getAssets()>
	//    6   14:new             #40  <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #41  <Method void StringBuilder()>
	//    9   21:ldc1            #43  <String "migrations/">
	//   10   23:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   11   26:aload_0         
	//   12   27:invokevirtual   #51  <Method DatabaseDefinition getDatabaseDefinition()>
	//   13   30:invokevirtual   #57  <Method String DatabaseDefinition.getDatabaseName()>
	//   14   33:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:ldc1            #59  <String "/">
	//   16   38:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   17   41:aload_2         
	//   18   42:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   19   45:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   20   48:invokevirtual   #68  <Method java.io.InputStream AssetManager.open(String)>
	//   21   51:invokespecial   #71  <Method void InputStreamReader(java.io.InputStream)>
	//   22   54:invokespecial   #74  <Method void BufferedReader(java.io.Reader)>
	//   23   57:astore          7
		obj = ((Object) (new StringBuffer()));
	//   24   59:new             #76  <Class StringBuffer>
	//   25   62:dup             
	//   26   63:invokespecial   #77  <Method void StringBuffer()>
	//   27   66:astore          4
_L2:
		String s1 = bufferedreader.readLine();
	//   28   68:aload           7
	//   29   70:invokevirtual   #80  <Method String BufferedReader.readLine()>
	//   30   73:astore          5
		if(s1 == null)
			break MISSING_BLOCK_LABEL_172;
	//   31   75:aload           5
	//   32   77:ifnull          172
		boolean flag;
		String s2;
		s2 = s1.trim();
	//   33   80:aload           5
	//   34   82:invokevirtual   #85  <Method String String.trim()>
	//   35   85:astore          6
		flag = s2.endsWith(";");
	//   36   87:aload           6
	//   37   89:ldc1            #87  <String ";">
	//   38   91:invokevirtual   #91  <Method boolean String.endsWith(String)>
	//   39   94:istore_3        
		if(s2.startsWith("--")) goto _L2; else goto _L1
	//   40   95:aload           6
	//   41   97:ldc1            #93  <String "--">
	//   42   99:invokevirtual   #96  <Method boolean String.startsWith(String)>
	//   43  102:ifne            68
_L1:
		s1 = s2;
	//   44  105:aload           6
	//   45  107:astore          5
		if(!flag)
			break MISSING_BLOCK_LABEL_132;
	//   46  109:iload_3         
	//   47  110:ifeq            132
		s1 = s2.substring(0, s2.length() - ";".length());
	//   48  113:aload           6
	//   49  115:iconst_0        
	//   50  116:aload           6
	//   51  118:invokevirtual   #100 <Method int String.length()>
	//   52  121:ldc1            #87  <String ";">
	//   53  123:invokevirtual   #100 <Method int String.length()>
	//   54  126:isub            
	//   55  127:invokevirtual   #104 <Method String String.substring(int, int)>
	//   56  130:astore          5
		((StringBuffer) (obj)).append(" ").append(s1);
	//   57  132:aload           4
	//   58  134:ldc1            #106 <String " ">
	//   59  136:invokevirtual   #109 <Method StringBuffer StringBuffer.append(String)>
	//   60  139:aload           5
	//   61  141:invokevirtual   #109 <Method StringBuffer StringBuffer.append(String)>
	//   62  144:pop             
		if(!flag) goto _L2; else goto _L3
	//   63  145:iload_3         
	//   64  146:ifeq            68
_L3:
		databasewrapper.execSQL(((StringBuffer) (obj)).toString());
	//   65  149:aload_1         
	//   66  150:aload           4
	//   67  152:invokevirtual   #110 <Method String StringBuffer.toString()>
	//   68  155:invokeinterface #116 <Method void DatabaseWrapper.execSQL(String)>
		obj = ((Object) (new StringBuffer()));
	//   69  160:new             #76  <Class StringBuffer>
	//   70  163:dup             
	//   71  164:invokespecial   #77  <Method void StringBuffer()>
	//   72  167:astore          4
		  goto _L2
	//*  73  169:goto            68
		try
		{
			obj = ((Object) (((StringBuffer) (obj)).toString()));
	//   74  172:aload           4
	//   75  174:invokevirtual   #110 <Method String StringBuffer.toString()>
	//   76  177:astore          4
			if(((String) (obj)).trim().length() > 0)
	//*  77  179:aload           4
	//*  78  181:invokevirtual   #85  <Method String String.trim()>
	//*  79  184:invokevirtual   #100 <Method int String.length()>
	//*  80  187:ifle            198
				databasewrapper.execSQL(((String) (obj)));
	//   81  190:aload_1         
	//   82  191:aload           4
	//   83  193:invokeinterface #116 <Method void DatabaseWrapper.execSQL(String)>
			return;
	//   84  198:return          
		}
		// Misplaced declaration of an exception variable
		catch(DatabaseWrapper databasewrapper)
	//*  85  199:astore_1        
		{
			FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.E, (new StringBuilder()).append("Failed to execute ").append(s).toString(), ((Throwable) (databasewrapper)));
	//   86  200:getstatic       #122 <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.E>
	//   87  203:new             #40  <Class StringBuilder>
	//   88  206:dup             
	//   89  207:invokespecial   #41  <Method void StringBuilder()>
	//   90  210:ldc1            #124 <String "Failed to execute ">
	//   91  212:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   92  215:aload_2         
	//   93  216:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   94  219:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   95  222:aload_1         
	//   96  223:invokestatic    #130 <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, String, Throwable)>
		}
		return;
	//   97  226:return          
	}

	protected void checkForeignKeySupport(DatabaseWrapper databasewrapper)
	{
		if(databaseDefinition.isForeignKeysSupported())
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field DatabaseDefinition databaseDefinition>
	//*   2    4:invokevirtual   #136 <Method boolean DatabaseDefinition.isForeignKeysSupported()>
	//*   3    7:ifeq            26
		{
			databasewrapper.execSQL("PRAGMA foreign_keys=ON;");
	//    4   10:aload_1         
	//    5   11:ldc1            #138 <String "PRAGMA foreign_keys=ON;">
	//    6   13:invokeinterface #116 <Method void DatabaseWrapper.execSQL(String)>
			FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.I, "Foreign Keys supported. Enabling foreign key features.");
	//    7   18:getstatic       #141 <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.I>
	//    8   21:ldc1            #143 <String "Foreign Keys supported. Enabling foreign key features.">
	//    9   23:invokestatic    #146 <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, String)>
		}
	//   10   26:return          
	}

	protected void executeCreations(DatabaseWrapper databasewrapper)
	{
		Iterator iterator;
		databasewrapper.beginTransaction();
	//    0    0:aload_1         
	//    1    1:invokeinterface #152 <Method void DatabaseWrapper.beginTransaction()>
		iterator = databaseDefinition.getModelAdapters().iterator();
	//    2    6:aload_0         
	//    3    7:getfield        #17  <Field DatabaseDefinition databaseDefinition>
	//    4   10:invokevirtual   #156 <Method List DatabaseDefinition.getModelAdapters()>
	//    5   13:invokeinterface #162 <Method Iterator List.iterator()>
	//    6   18:astore_2        
_L1:
		Object obj;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_68;
	//    7   19:aload_2         
	//    8   20:invokeinterface #167 <Method boolean Iterator.hasNext()>
	//    9   25:ifeq            68
		obj = ((Object) ((ModelAdapter)iterator.next()));
	//   10   28:aload_2         
	//   11   29:invokeinterface #171 <Method Object Iterator.next()>
	//   12   34:checkcast       #173 <Class ModelAdapter>
	//   13   37:astore_3        
		databasewrapper.execSQL(((ModelAdapter) (obj)).getCreationQuery());
	//   14   38:aload_1         
	//   15   39:aload_3         
	//   16   40:invokevirtual   #176 <Method String ModelAdapter.getCreationQuery()>
	//   17   43:invokeinterface #116 <Method void DatabaseWrapper.execSQL(String)>
		  goto _L1
	//*  18   48:goto            19
		SQLiteException sqliteexception;
		sqliteexception;
	//   19   51:astore_3        
		FlowLog.logError(((Throwable) (sqliteexception)));
	//   20   52:aload_3         
	//   21   53:invokestatic    #180 <Method void FlowLog.logError(Throwable)>
		  goto _L1
	//*  22   56:goto            19
		Exception exception;
		exception;
	//   23   59:astore_2        
		databasewrapper.endTransaction();
	//   24   60:aload_1         
	//   25   61:invokeinterface #183 <Method void DatabaseWrapper.endTransaction()>
		throw exception;
	//   26   66:aload_2         
	//   27   67:athrow          
		exception = ((Exception) (databaseDefinition.getModelViewAdapters().iterator()));
	//   28   68:aload_0         
	//   29   69:getfield        #17  <Field DatabaseDefinition databaseDefinition>
	//   30   72:invokevirtual   #186 <Method List DatabaseDefinition.getModelViewAdapters()>
	//   31   75:invokeinterface #162 <Method Iterator List.iterator()>
	//   32   80:astore_2        
_L2:
		if(!((Iterator) (exception)).hasNext())
			break MISSING_BLOCK_LABEL_153;
	//   33   81:aload_2         
	//   34   82:invokeinterface #167 <Method boolean Iterator.hasNext()>
	//   35   87:ifeq            153
		sqliteexception = ((SQLiteException) ((ModelViewAdapter)((Iterator) (exception)).next()));
	//   36   90:aload_2         
	//   37   91:invokeinterface #171 <Method Object Iterator.next()>
	//   38   96:checkcast       #188 <Class ModelViewAdapter>
	//   39   99:astore_3        
		sqliteexception = ((SQLiteException) ((new QueryBuilder()).append("CREATE VIEW IF NOT EXISTS").appendSpaceSeparated(((Object) (((ModelViewAdapter) (sqliteexception)).getViewName()))).append("AS ").append(((Object) (((ModelViewAdapter) (sqliteexception)).getCreationQuery())))));
	//   40  100:new             #190 <Class QueryBuilder>
	//   41  103:dup             
	//   42  104:invokespecial   #191 <Method void QueryBuilder()>
	//   43  107:ldc1            #193 <String "CREATE VIEW IF NOT EXISTS">
	//   44  109:invokevirtual   #196 <Method QueryBuilder QueryBuilder.append(Object)>
	//   45  112:aload_3         
	//   46  113:invokevirtual   #199 <Method String ModelViewAdapter.getViewName()>
	//   47  116:invokevirtual   #202 <Method QueryBuilder QueryBuilder.appendSpaceSeparated(Object)>
	//   48  119:ldc1            #204 <String "AS ">
	//   49  121:invokevirtual   #196 <Method QueryBuilder QueryBuilder.append(Object)>
	//   50  124:aload_3         
	//   51  125:invokevirtual   #205 <Method String ModelViewAdapter.getCreationQuery()>
	//   52  128:invokevirtual   #196 <Method QueryBuilder QueryBuilder.append(Object)>
	//   53  131:astore_3        
		databasewrapper.execSQL(((QueryBuilder) (sqliteexception)).getQuery());
	//   54  132:aload_1         
	//   55  133:aload_3         
	//   56  134:invokevirtual   #208 <Method String QueryBuilder.getQuery()>
	//   57  137:invokeinterface #116 <Method void DatabaseWrapper.execSQL(String)>
		  goto _L2
	//*  58  142:goto            81
		sqliteexception;
	//   59  145:astore_3        
		FlowLog.logError(((Throwable) (sqliteexception)));
	//   60  146:aload_3         
	//   61  147:invokestatic    #180 <Method void FlowLog.logError(Throwable)>
		  goto _L2
	//*  62  150:goto            81
		databasewrapper.setTransactionSuccessful();
	//   63  153:aload_1         
	//   64  154:invokeinterface #211 <Method void DatabaseWrapper.setTransactionSuccessful()>
		databasewrapper.endTransaction();
	//   65  159:aload_1         
	//   66  160:invokeinterface #183 <Method void DatabaseWrapper.endTransaction()>
		return;
	//   67  165:return          
	}

	protected void executeMigrations(DatabaseWrapper databasewrapper, int i, int j)
	{
		HashMap hashmap;
		Iterator iterator;
		List list = Arrays.asList(((Object []) (FlowManager.getContext().getAssets().list((new StringBuilder()).append("migrations/").append(databaseDefinition.getDatabaseName()).toString()))));
	//    0    0:invokestatic    #32  <Method Context FlowManager.getContext()>
	//    1    3:invokevirtual   #38  <Method AssetManager Context.getAssets()>
	//    2    6:new             #40  <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #41  <Method void StringBuilder()>
	//    5   13:ldc1            #43  <String "migrations/">
	//    6   15:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//    7   18:aload_0         
	//    8   19:getfield        #17  <Field DatabaseDefinition databaseDefinition>
	//    9   22:invokevirtual   #57  <Method String DatabaseDefinition.getDatabaseName()>
	//   10   25:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   11   28:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   12   31:invokevirtual   #219 <Method String[] AssetManager.list(String)>
	//   13   34:invokestatic    #225 <Method List Arrays.asList(Object[])>
	//   14   37:astore          4
		Collections.sort(list, ((java.util.Comparator) (new NaturalOrderComparator())));
	//   15   39:aload           4
	//   16   41:new             #227 <Class NaturalOrderComparator>
	//   17   44:dup             
	//   18   45:invokespecial   #228 <Method void NaturalOrderComparator()>
	//   19   48:invokestatic    #234 <Method void Collections.sort(List, java.util.Comparator)>
		hashmap = new HashMap();
	//   20   51:new             #236 <Class HashMap>
	//   21   54:dup             
	//   22   55:invokespecial   #237 <Method void HashMap()>
	//   23   58:astore          6
		iterator = list.iterator();
	//   24   60:aload           4
	//   25   62:invokeinterface #162 <Method Iterator List.iterator()>
	//   26   67:astore          7
_L1:
		String s1;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_208;
	//   27   69:aload           7
	//   28   71:invokeinterface #167 <Method boolean Iterator.hasNext()>
	//   29   76:ifeq            208
		s1 = (String)iterator.next();
	//   30   79:aload           7
	//   31   81:invokeinterface #171 <Method Object Iterator.next()>
	//   32   86:checkcast       #82  <Class String>
	//   33   89:astore          8
		Object obj1;
		Integer integer;
		integer = Integer.valueOf(s1.replace(".sql", ""));
	//   34   91:aload           8
	//   35   93:ldc1            #239 <String ".sql">
	//   36   95:ldc1            #241 <String "">
	//   37   97:invokevirtual   #245 <Method String String.replace(CharSequence, CharSequence)>
	//   38  100:invokestatic    #251 <Method Integer Integer.valueOf(String)>
	//   39  103:astore          9
		obj1 = ((Object) ((List)((Map) (hashmap)).get(((Object) (integer)))));
	//   40  105:aload           6
	//   41  107:aload           9
	//   42  109:invokeinterface #257 <Method Object Map.get(Object)>
	//   43  114:checkcast       #158 <Class List>
	//   44  117:astore          5
		Object obj;
		obj = obj1;
	//   45  119:aload           5
	//   46  121:astore          4
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_149;
	//   47  123:aload           5
	//   48  125:ifnonnull       149
		obj = ((Object) (new ArrayList()));
	//   49  128:new             #259 <Class ArrayList>
	//   50  131:dup             
	//   51  132:invokespecial   #260 <Method void ArrayList()>
	//   52  135:astore          4
		((Map) (hashmap)).put(((Object) (integer)), obj);
	//   53  137:aload           6
	//   54  139:aload           9
	//   55  141:aload           4
	//   56  143:invokeinterface #264 <Method Object Map.put(Object, Object)>
	//   57  148:pop             
		((List) (obj)).add(((Object) (s1)));
	//   58  149:aload           4
	//   59  151:aload           8
	//   60  153:invokeinterface #268 <Method boolean List.add(Object)>
	//   61  158:pop             
		  goto _L1
	//*  62  159:goto            69
		NumberFormatException numberformatexception;
		numberformatexception;
	//   63  162:astore          4
		try
		{
			FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.W, (new StringBuilder()).append("Skipping invalidly named file: ").append(s1).toString(), ((Throwable) (numberformatexception)));
	//   64  164:getstatic       #271 <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.W>
	//   65  167:new             #40  <Class StringBuilder>
	//   66  170:dup             
	//   67  171:invokespecial   #41  <Method void StringBuilder()>
	//   68  174:ldc2            #273 <String "Skipping invalidly named file: ">
	//   69  177:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   70  180:aload           8
	//   71  182:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   72  185:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   73  188:aload           4
	//   74  190:invokestatic    #130 <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, String, Throwable)>
		}
	//*  75  193:goto            69
		// Misplaced declaration of an exception variable
		catch(DatabaseWrapper databasewrapper)
	//*  76  196:astore_1        
		{
			FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.E, "Failed to execute migrations.", ((Throwable) (databasewrapper)));
	//   77  197:getstatic       #122 <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.E>
	//   78  200:ldc2            #275 <String "Failed to execute migrations.">
	//   79  203:aload_1         
	//   80  204:invokestatic    #130 <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, String, Throwable)>
			return;
	//   81  207:return          
		}
		  goto _L1
		numberformatexception = ((NumberFormatException) (databaseDefinition.getMigrations()));
	//   82  208:aload_0         
	//   83  209:getfield        #17  <Field DatabaseDefinition databaseDefinition>
	//   84  212:invokevirtual   #279 <Method Map DatabaseDefinition.getMigrations()>
	//   85  215:astore          4
		databasewrapper.beginTransaction();
	//   86  217:aload_1         
	//   87  218:invokeinterface #152 <Method void DatabaseWrapper.beginTransaction()>
		i++;
	//   88  223:iload_2         
	//   89  224:iconst_1        
	//   90  225:iadd            
	//   91  226:istore_2        
_L3:
		if(i > j)
			break MISSING_BLOCK_LABEL_444;
	//   92  227:iload_2         
	//   93  228:iload_3         
	//   94  229:icmpgt          444
		obj1 = ((Object) ((List)((Map) (hashmap)).get(((Object) (Integer.valueOf(i))))));
	//   95  232:aload           6
	//   96  234:iload_2         
	//   97  235:invokestatic    #282 <Method Integer Integer.valueOf(int)>
	//   98  238:invokeinterface #257 <Method Object Map.get(Object)>
	//   99  243:checkcast       #158 <Class List>
	//  100  246:astore          5
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_332;
	//  101  248:aload           5
	//  102  250:ifnull          332
		String s;
		for(obj1 = ((Object) (((List) (obj1)).iterator())); ((Iterator) (obj1)).hasNext(); FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.I, (new StringBuilder()).append(s).append(" executed successfully.").toString()))
	//* 103  253:aload           5
	//* 104  255:invokeinterface #162 <Method Iterator List.iterator()>
	//* 105  260:astore          5
	//* 106  262:aload           5
	//* 107  264:invokeinterface #167 <Method boolean Iterator.hasNext()>
	//* 108  269:ifeq            332
		{
			s = (String)((Iterator) (obj1)).next();
	//  109  272:aload           5
	//  110  274:invokeinterface #171 <Method Object Iterator.next()>
	//  111  279:checkcast       #82  <Class String>
	//  112  282:astore          7
			executeSqlScript(databasewrapper, s);
	//  113  284:aload_0         
	//  114  285:aload_1         
	//  115  286:aload           7
	//  116  288:invokespecial   #284 <Method void executeSqlScript(DatabaseWrapper, String)>
		}

	//  117  291:getstatic       #141 <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.I>
	//  118  294:new             #40  <Class StringBuilder>
	//  119  297:dup             
	//  120  298:invokespecial   #41  <Method void StringBuilder()>
	//  121  301:aload           7
	//  122  303:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//  123  306:ldc2            #286 <String " executed successfully.">
	//  124  309:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//  125  312:invokevirtual   #62  <Method String StringBuilder.toString()>
	//  126  315:invokestatic    #146 <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, String)>
		break MISSING_BLOCK_LABEL_332;
	//  127  318:goto            262
		numberformatexception;
	//  128  321:astore          4
		databasewrapper.endTransaction();
	//  129  323:aload_1         
	//  130  324:invokeinterface #183 <Method void DatabaseWrapper.endTransaction()>
		throw numberformatexception;
	//  131  329:aload           4
	//  132  331:athrow          
		if(numberformatexception == null)
			break MISSING_BLOCK_LABEL_457;
	//  133  332:aload           4
	//  134  334:ifnull          457
		obj1 = ((Object) ((List)((Map) (numberformatexception)).get(((Object) (Integer.valueOf(i))))));
	//  135  337:aload           4
	//  136  339:iload_2         
	//  137  340:invokestatic    #282 <Method Integer Integer.valueOf(int)>
	//  138  343:invokeinterface #257 <Method Object Map.get(Object)>
	//  139  348:checkcast       #158 <Class List>
	//  140  351:astore          5
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_457;
	//  141  353:aload           5
	//  142  355:ifnull          457
		Migration migration;
		for(obj1 = ((Object) (((List) (obj1)).iterator())); ((Iterator) (obj1)).hasNext(); FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.I, (new StringBuilder()).append(((Object) (((Object) (migration)).getClass()))).append(" executed successfully.").toString()))
	//* 143  358:aload           5
	//* 144  360:invokeinterface #162 <Method Iterator List.iterator()>
	//* 145  365:astore          5
	//* 146  367:aload           5
	//* 147  369:invokeinterface #167 <Method boolean Iterator.hasNext()>
	//* 148  374:ifeq            457
		{
			migration = (Migration)((Iterator) (obj1)).next();
	//  149  377:aload           5
	//  150  379:invokeinterface #171 <Method Object Iterator.next()>
	//  151  384:checkcast       #288 <Class Migration>
	//  152  387:astore          7
			migration.onPreMigrate();
	//  153  389:aload           7
	//  154  391:invokeinterface #291 <Method void Migration.onPreMigrate()>
			migration.migrate(databasewrapper);
	//  155  396:aload           7
	//  156  398:aload_1         
	//  157  399:invokeinterface #294 <Method void Migration.migrate(DatabaseWrapper)>
			migration.onPostMigrate();
	//  158  404:aload           7
	//  159  406:invokeinterface #297 <Method void Migration.onPostMigrate()>
		}

	//  160  411:getstatic       #141 <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.I>
	//  161  414:new             #40  <Class StringBuilder>
	//  162  417:dup             
	//  163  418:invokespecial   #41  <Method void StringBuilder()>
	//  164  421:aload           7
	//  165  423:invokevirtual   #301 <Method Class Object.getClass()>
	//  166  426:invokevirtual   #304 <Method StringBuilder StringBuilder.append(Object)>
	//  167  429:ldc2            #286 <String " executed successfully.">
	//  168  432:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//  169  435:invokevirtual   #62  <Method String StringBuilder.toString()>
	//  170  438:invokestatic    #146 <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, String)>
		break MISSING_BLOCK_LABEL_457;
	//  171  441:goto            367
		databasewrapper.setTransactionSuccessful();
	//  172  444:aload_1         
	//  173  445:invokeinterface #211 <Method void DatabaseWrapper.setTransactionSuccessful()>
		databasewrapper.endTransaction();
	//  174  450:aload_1         
	//  175  451:invokeinterface #183 <Method void DatabaseWrapper.endTransaction()>
		return;
	//  176  456:return          
		i++;
	//  177  457:iload_2         
	//  178  458:iconst_1        
	//  179  459:iadd            
	//  180  460:istore_2        
		if(true) goto _L3; else goto _L2
	//  181  461:goto            227
_L2:
	}

	public DatabaseDefinition getDatabaseDefinition()
	{
		return databaseDefinition;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field DatabaseDefinition databaseDefinition>
	//    2    4:areturn         
	}

	public void onCreate(DatabaseWrapper databasewrapper)
	{
		checkForeignKeySupport(databasewrapper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #307 <Method void checkForeignKeySupport(DatabaseWrapper)>
		executeCreations(databasewrapper);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #309 <Method void executeCreations(DatabaseWrapper)>
		executeMigrations(databasewrapper, -1, databasewrapper.getVersion());
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:iconst_m1       
	//    9   13:aload_1         
	//   10   14:invokeinterface #312 <Method int DatabaseWrapper.getVersion()>
	//   11   19:invokevirtual   #314 <Method void executeMigrations(DatabaseWrapper, int, int)>
	//   12   22:return          
	}

	public void onOpen(DatabaseWrapper databasewrapper)
	{
		checkForeignKeySupport(databasewrapper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #307 <Method void checkForeignKeySupport(DatabaseWrapper)>
	//    3    5:return          
	}

	public void onUpgrade(DatabaseWrapper databasewrapper, int i, int j)
	{
		checkForeignKeySupport(databasewrapper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #307 <Method void checkForeignKeySupport(DatabaseWrapper)>
		executeCreations(databasewrapper);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #309 <Method void executeCreations(DatabaseWrapper)>
		executeMigrations(databasewrapper, i, j);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:iload_2         
	//    9   13:iload_3         
	//   10   14:invokevirtual   #314 <Method void executeMigrations(DatabaseWrapper, int, int)>
	//   11   17:return          
	}

	public static final String MIGRATION_PATH = "migrations";
	private final DatabaseDefinition databaseDefinition;
}
