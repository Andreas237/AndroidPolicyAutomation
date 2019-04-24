// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.table;

import co.touchlab.squeaky.dao.SqueakyContext;
import co.touchlab.squeaky.db.SQLiteDatabase;
import co.touchlab.squeaky.field.*;
import co.touchlab.squeaky.logger.OLog;
import co.touchlab.squeaky.misc.SqlExceptionUtil;
import java.sql.SQLException;
import java.util.*;

// Referenced classes of package co.touchlab.squeaky.table:
//			GeneratedTableMapper, TableInfo

public class TableUtils
{

	private TableUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	private static void addCreateIndexStatements(GeneratedTableMapper generatedtablemapper, List list, boolean flag, boolean flag1)
		throws SQLException
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #28  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void HashMap()>
	//    3    7:astore          9
		FieldType afieldtype[] = generatedtablemapper.getTableConfig().getFieldTypes();
	//    4    9:aload_0         
	//    5   10:invokeinterface #35  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//    6   15:invokevirtual   #41  <Method FieldType[] TableInfo.getFieldTypes()>
	//    7   18:astore          10
		int j = afieldtype.length;
	//    8   20:aload           10
	//    9   22:arraylength     
	//   10   23:istore          5
		int i = 0;
	//   11   25:iconst_0        
	//   12   26:istore          4
		while(i < j) 
	//*  13   28:iload           4
	//*  14   30:iload           5
	//*  15   32:icmpge          137
		{
			FieldType fieldtype = afieldtype[i];
	//   16   35:aload           10
	//   17   37:iload           4
	//   18   39:aaload          
	//   19   40:astore          11
			String s;
			if(flag1)
	//*  20   42:iload_3         
	//*  21   43:ifeq            67
				s = fieldtype.getUniqueIndexName();
	//   22   46:aload           11
	//   23   48:invokevirtual   #46  <Method String FieldType.getUniqueIndexName()>
	//   24   51:astore          6
			else
	//*  25   53:aload           6
	//*  26   55:ifnonnull       77
	//*  27   58:iload           4
	//*  28   60:iconst_1        
	//*  29   61:iadd            
	//*  30   62:istore          4
	//*  31   64:goto            28
				s = fieldtype.getIndexName();
	//   32   67:aload           11
	//   33   69:invokevirtual   #49  <Method String FieldType.getIndexName()>
	//   34   72:astore          6
			if(s != null)
	//*  35   74:goto            53
			{
				List list1 = (List)((Map) (hashmap)).get(((Object) (s)));
	//   36   77:aload           9
	//   37   79:aload           6
	//   38   81:invokeinterface #55  <Method Object Map.get(Object)>
	//   39   86:checkcast       #57  <Class List>
	//   40   89:astore          8
				Object obj = ((Object) (list1));
	//   41   91:aload           8
	//   42   93:astore          7
				if(list1 == null)
	//*  43   95:aload           8
	//*  44   97:ifnonnull       121
				{
					obj = ((Object) (new ArrayList()));
	//   45  100:new             #59  <Class ArrayList>
	//   46  103:dup             
	//   47  104:invokespecial   #60  <Method void ArrayList()>
	//   48  107:astore          7
					((Map) (hashmap)).put(((Object) (s)), obj);
	//   49  109:aload           9
	//   50  111:aload           6
	//   51  113:aload           7
	//   52  115:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   53  120:pop             
				}
				((List) (obj)).add(((Object) (fieldtype.getColumnName())));
	//   54  121:aload           7
	//   55  123:aload           11
	//   56  125:invokevirtual   #67  <Method String FieldType.getColumnName()>
	//   57  128:invokeinterface #71  <Method boolean List.add(Object)>
	//   58  133:pop             
			}
			i++;
		}
	//*  59  134:goto            58
		StringBuilder stringbuilder = new StringBuilder(128);
	//   60  137:new             #73  <Class StringBuilder>
	//   61  140:dup             
	//   62  141:sipush          128
	//   63  144:invokespecial   #76  <Method void StringBuilder(int)>
	//   64  147:astore          6
		for(Iterator iterator = ((Map) (hashmap)).entrySet().iterator(); iterator.hasNext(); stringbuilder.setLength(0))
	//*  65  149:aload           9
	//*  66  151:invokeinterface #80  <Method Set Map.entrySet()>
	//*  67  156:invokeinterface #86  <Method Iterator Set.iterator()>
	//*  68  161:astore          7
	//*  69  163:aload           7
	//*  70  165:invokeinterface #92  <Method boolean Iterator.hasNext()>
	//*  71  170:ifeq            426
		{
			Object obj1 = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   72  173:aload           7
	//   73  175:invokeinterface #96  <Method Object Iterator.next()>
	//   74  180:checkcast       #98  <Class java.util.Map$Entry>
	//   75  183:astore          8
			OLog.i(TAG, (new StringBuilder()).append("creating index '{").append((String)((java.util.Map.Entry) (obj1)).getKey()).append("}' for table '{").append(generatedtablemapper.getTableConfig().getTableName()).append("}").toString());
	//   76  185:getstatic       #18  <Field String TAG>
	//   77  188:new             #73  <Class StringBuilder>
	//   78  191:dup             
	//   79  192:invokespecial   #99  <Method void StringBuilder()>
	//   80  195:ldc1            #101 <String "creating index '{">
	//   81  197:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   82  200:aload           8
	//   83  202:invokeinterface #108 <Method Object java.util.Map$Entry.getKey()>
	//   84  207:checkcast       #110 <Class String>
	//   85  210:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   86  213:ldc1            #112 <String "}' for table '{">
	//   87  215:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   88  218:aload_0         
	//   89  219:invokeinterface #35  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//   90  224:invokevirtual   #115 <Method String TableInfo.getTableName()>
	//   91  227:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   92  230:ldc1            #117 <String "}">
	//   93  232:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   94  235:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   95  238:invokestatic    #126 <Method void OLog.i(String, String)>
			stringbuilder.append("CREATE ");
	//   96  241:aload           6
	//   97  243:ldc1            #128 <String "CREATE ">
	//   98  245:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   99  248:pop             
			if(flag1)
	//* 100  249:iload_3         
	//* 101  250:ifeq            261
				stringbuilder.append("UNIQUE ");
	//  102  253:aload           6
	//  103  255:ldc1            #130 <String "UNIQUE ">
	//  104  257:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  105  260:pop             
			stringbuilder.append("INDEX ");
	//  106  261:aload           6
	//  107  263:ldc1            #132 <String "INDEX ">
	//  108  265:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  109  268:pop             
			if(flag)
	//* 110  269:iload_2         
	//* 111  270:ifeq            281
				stringbuilder.append("IF NOT EXISTS ");
	//  112  273:aload           6
	//  113  275:ldc1            #134 <String "IF NOT EXISTS ">
	//  114  277:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  115  280:pop             
			appendEscapedEntityName(stringbuilder, (String)((java.util.Map.Entry) (obj1)).getKey());
	//  116  281:aload           6
	//  117  283:aload           8
	//  118  285:invokeinterface #108 <Method Object java.util.Map$Entry.getKey()>
	//  119  290:checkcast       #110 <Class String>
	//  120  293:invokestatic    #138 <Method void appendEscapedEntityName(StringBuilder, String)>
			stringbuilder.append(" ON ");
	//  121  296:aload           6
	//  122  298:ldc1            #140 <String " ON ">
	//  123  300:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  124  303:pop             
			appendEscapedEntityName(stringbuilder, generatedtablemapper.getTableConfig().getTableName());
	//  125  304:aload           6
	//  126  306:aload_0         
	//  127  307:invokeinterface #35  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//  128  312:invokevirtual   #115 <Method String TableInfo.getTableName()>
	//  129  315:invokestatic    #138 <Method void appendEscapedEntityName(StringBuilder, String)>
			stringbuilder.append(" ( ");
	//  130  318:aload           6
	//  131  320:ldc1            #142 <String " ( ">
	//  132  322:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  133  325:pop             
			boolean flag2 = true;
	//  134  326:iconst_1        
	//  135  327:istore          4
			obj1 = ((Object) (((List)((java.util.Map.Entry) (obj1)).getValue()).iterator()));
	//  136  329:aload           8
	//  137  331:invokeinterface #145 <Method Object java.util.Map$Entry.getValue()>
	//  138  336:checkcast       #57  <Class List>
	//  139  339:invokeinterface #146 <Method Iterator List.iterator()>
	//  140  344:astore          8
			while(((Iterator) (obj1)).hasNext()) 
	//* 141  346:aload           8
	//* 142  348:invokeinterface #92  <Method boolean Iterator.hasNext()>
	//* 143  353:ifeq            397
			{
				String s1 = (String)((Iterator) (obj1)).next();
	//  144  356:aload           8
	//  145  358:invokeinterface #96  <Method Object Iterator.next()>
	//  146  363:checkcast       #110 <Class String>
	//  147  366:astore          9
				if(flag2)
	//* 148  368:iload           4
	//* 149  370:ifeq            386
					flag2 = false;
	//  150  373:iconst_0        
	//  151  374:istore          4
				else
	//* 152  376:aload           6
	//* 153  378:aload           9
	//* 154  380:invokestatic    #138 <Method void appendEscapedEntityName(StringBuilder, String)>
	//* 155  383:goto            346
					stringbuilder.append(", ");
	//  156  386:aload           6
	//  157  388:ldc1            #148 <String ", ">
	//  158  390:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  159  393:pop             
				appendEscapedEntityName(stringbuilder, s1);
			}
	//* 160  394:goto            376
			stringbuilder.append(" )");
	//  161  397:aload           6
	//  162  399:ldc1            #150 <String " )">
	//  163  401:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  164  404:pop             
			list.add(((Object) (stringbuilder.toString())));
	//  165  405:aload_1         
	//  166  406:aload           6
	//  167  408:invokevirtual   #120 <Method String StringBuilder.toString()>
	//  168  411:invokeinterface #71  <Method boolean List.add(Object)>
	//  169  416:pop             
		}

	//  170  417:aload           6
	//  171  419:iconst_0        
	//  172  420:invokevirtual   #153 <Method void StringBuilder.setLength(int)>
	//* 173  423:goto            163
	//  174  426:return          
	}

	private static List addCreateTableStatements(GeneratedTableMapper generatedtablemapper, boolean flag)
		throws SQLException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #59  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void ArrayList()>
	//    3    7:astore_2        
		addCreateTableStatements(generatedtablemapper, ((List) (arraylist)), flag);
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokestatic    #161 <Method void addCreateTableStatements(GeneratedTableMapper, List, boolean)>
		return ((List) (arraylist));
	//    8   14:aload_2         
	//    9   15:areturn         
	}

	private static void addCreateTableStatements(GeneratedTableMapper generatedtablemapper, List list, boolean flag)
		throws SQLException
	{
		StringBuilder stringbuilder = new StringBuilder(256);
	//    0    0:new             #73  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          256
	//    3    7:invokespecial   #76  <Method void StringBuilder(int)>
	//    4   10:astore          6
		stringbuilder.append("CREATE TABLE ");
	//    5   12:aload           6
	//    6   14:ldc1            #164 <String "CREATE TABLE ">
	//    7   16:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    8   19:pop             
		if(flag)
	//*   9   20:iload_2         
	//*  10   21:ifeq            32
			stringbuilder.append("IF NOT EXISTS ");
	//   11   24:aload           6
	//   12   26:ldc1            #134 <String "IF NOT EXISTS ">
	//   13   28:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   14   31:pop             
		appendEscapedEntityName(stringbuilder, generatedtablemapper.getTableConfig().getTableName());
	//   15   32:aload           6
	//   16   34:aload_0         
	//   17   35:invokeinterface #35  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//   18   40:invokevirtual   #115 <Method String TableInfo.getTableName()>
	//   19   43:invokestatic    #138 <Method void appendEscapedEntityName(StringBuilder, String)>
		stringbuilder.append(" (");
	//   20   46:aload           6
	//   21   48:ldc1            #166 <String " (">
	//   22   50:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   23   53:pop             
		Object obj = ((Object) (new ArrayList()));
	//   24   54:new             #59  <Class ArrayList>
	//   25   57:dup             
	//   26   58:invokespecial   #60  <Method void ArrayList()>
	//   27   61:astore          9
		ArrayList arraylist = new ArrayList();
	//   28   63:new             #59  <Class ArrayList>
	//   29   66:dup             
	//   30   67:invokespecial   #60  <Method void ArrayList()>
	//   31   70:astore          7
		ArrayList arraylist1 = new ArrayList();
	//   32   72:new             #59  <Class ArrayList>
	//   33   75:dup             
	//   34   76:invokespecial   #60  <Method void ArrayList()>
	//   35   79:astore          8
		boolean flag1 = true;
	//   36   81:iconst_1        
	//   37   82:istore          4
		FieldType afieldtype[] = generatedtablemapper.getTableConfig().getFieldTypes();
	//   38   84:aload_0         
	//   39   85:invokeinterface #35  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//   40   90:invokevirtual   #41  <Method FieldType[] TableInfo.getFieldTypes()>
	//   41   93:astore          10
		int j = afieldtype.length;
	//   42   95:aload           10
	//   43   97:arraylength     
	//   44   98:istore          5
		int i = 0;
	//   45  100:iconst_0        
	//   46  101:istore_3        
		while(i < j) 
	//*  47  102:iload_3         
	//*  48  103:iload           5
	//*  49  105:icmpge          149
		{
			FieldType fieldtype = afieldtype[i];
	//   50  108:aload           10
	//   51  110:iload_3         
	//   52  111:aaload          
	//   53  112:astore          11
			if(flag1)
	//*  54  114:iload           4
	//*  55  116:ifeq            138
				flag1 = false;
	//   56  119:iconst_0        
	//   57  120:istore          4
			else
	//*  58  122:aload           6
	//*  59  124:aload           11
	//*  60  126:aload           9
	//*  61  128:invokestatic    #170 <Method void appendColumnArg(StringBuilder, FieldType, List)>
	//*  62  131:iload_3         
	//*  63  132:iconst_1        
	//*  64  133:iadd            
	//*  65  134:istore_3        
	//*  66  135:goto            102
				stringbuilder.append(", ");
	//   67  138:aload           6
	//   68  140:ldc1            #148 <String ", ">
	//   69  142:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   70  145:pop             
			appendColumnArg(stringbuilder, fieldtype, ((List) (obj)));
			i++;
		}
	//*  71  146:goto            122
		addPrimaryKeySql(generatedtablemapper.getTableConfig().getFieldTypes(), ((List) (obj)));
	//   72  149:aload_0         
	//   73  150:invokeinterface #35  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//   74  155:invokevirtual   #41  <Method FieldType[] TableInfo.getFieldTypes()>
	//   75  158:aload           9
	//   76  160:invokestatic    #174 <Method void addPrimaryKeySql(FieldType[], List)>
		addUniqueComboSql(generatedtablemapper.getTableConfig().getFieldTypes(), ((List) (obj)));
	//   77  163:aload_0         
	//   78  164:invokeinterface #35  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//   79  169:invokevirtual   #41  <Method FieldType[] TableInfo.getFieldTypes()>
	//   80  172:aload           9
	//   81  174:invokestatic    #177 <Method void addUniqueComboSql(FieldType[], List)>
		String s;
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); stringbuilder.append(", ").append(s))
	//*  82  177:aload           9
	//*  83  179:invokeinterface #146 <Method Iterator List.iterator()>
	//*  84  184:astore          9
	//*  85  186:aload           9
	//*  86  188:invokeinterface #92  <Method boolean Iterator.hasNext()>
	//*  87  193:ifeq            224
			s = (String)((Iterator) (obj)).next();
	//   88  196:aload           9
	//   89  198:invokeinterface #96  <Method Object Iterator.next()>
	//   90  203:checkcast       #110 <Class String>
	//   91  206:astore          10

	//   92  208:aload           6
	//   93  210:ldc1            #148 <String ", ">
	//   94  212:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   95  215:aload           10
	//   96  217:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   97  220:pop             
	//*  98  221:goto            186
		stringbuilder.append(") ");
	//   99  224:aload           6
	//  100  226:ldc1            #179 <String ") ">
	//  101  228:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  102  231:pop             
		list.addAll(((Collection) (arraylist)));
	//  103  232:aload_1         
	//  104  233:aload           7
	//  105  235:invokeinterface #183 <Method boolean List.addAll(Collection)>
	//  106  240:pop             
		list.add(((Object) (stringbuilder.toString())));
	//  107  241:aload_1         
	//  108  242:aload           6
	//  109  244:invokevirtual   #120 <Method String StringBuilder.toString()>
	//  110  247:invokeinterface #71  <Method boolean List.add(Object)>
	//  111  252:pop             
		list.addAll(((Collection) (arraylist1)));
	//  112  253:aload_1         
	//  113  254:aload           8
	//  114  256:invokeinterface #183 <Method boolean List.addAll(Collection)>
	//  115  261:pop             
		addCreateIndexStatements(generatedtablemapper, list, flag, false);
	//  116  262:aload_0         
	//  117  263:aload_1         
	//  118  264:iload_2         
	//  119  265:iconst_0        
	//  120  266:invokestatic    #185 <Method void addCreateIndexStatements(GeneratedTableMapper, List, boolean, boolean)>
		addCreateIndexStatements(generatedtablemapper, list, flag, true);
	//  121  269:aload_0         
	//  122  270:aload_1         
	//  123  271:iload_2         
	//  124  272:iconst_1        
	//  125  273:invokestatic    #185 <Method void addCreateIndexStatements(GeneratedTableMapper, List, boolean, boolean)>
	//  126  276:return          
	}

	private static void addDropIndexStatements(GeneratedTableMapper generatedtablemapper, List list)
		throws SQLException
	{
		Object obj = ((Object) (new HashSet()));
	//    0    0:new             #190 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #191 <Method void HashSet()>
	//    3    7:astore          4
		FieldType afieldtype[] = generatedtablemapper.getTableConfig().getFieldTypes();
	//    4    9:aload_0         
	//    5   10:invokeinterface #35  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//    6   15:invokevirtual   #41  <Method FieldType[] TableInfo.getFieldTypes()>
	//    7   18:astore          5
		int j = afieldtype.length;
	//    8   20:aload           5
	//    9   22:arraylength     
	//   10   23:istore_3        
		for(int i = 0; i < j; i++)
	//*  11   24:iconst_0        
	//*  12   25:istore_2        
	//*  13   26:iload_2         
	//*  14   27:iload_3         
	//*  15   28:icmpge          88
		{
			Object obj1 = ((Object) (afieldtype[i]));
	//   16   31:aload           5
	//   17   33:iload_2         
	//   18   34:aaload          
	//   19   35:astore          6
			String s1 = ((FieldType) (obj1)).getIndexName();
	//   20   37:aload           6
	//   21   39:invokevirtual   #49  <Method String FieldType.getIndexName()>
	//   22   42:astore          7
			if(s1 != null)
	//*  23   44:aload           7
	//*  24   46:ifnull          59
				((Set) (obj)).add(((Object) (s1)));
	//   25   49:aload           4
	//   26   51:aload           7
	//   27   53:invokeinterface #192 <Method boolean Set.add(Object)>
	//   28   58:pop             
			obj1 = ((Object) (((FieldType) (obj1)).getUniqueIndexName()));
	//   29   59:aload           6
	//   30   61:invokevirtual   #46  <Method String FieldType.getUniqueIndexName()>
	//   31   64:astore          6
			if(obj1 != null)
	//*  32   66:aload           6
	//*  33   68:ifnull          81
				((Set) (obj)).add(obj1);
	//   34   71:aload           4
	//   35   73:aload           6
	//   36   75:invokeinterface #192 <Method boolean Set.add(Object)>
	//   37   80:pop             
		}

	//   38   81:iload_2         
	//   39   82:iconst_1        
	//   40   83:iadd            
	//   41   84:istore_2        
	//*  42   85:goto            26
		StringBuilder stringbuilder = new StringBuilder(48);
	//   43   88:new             #73  <Class StringBuilder>
	//   44   91:dup             
	//   45   92:bipush          48
	//   46   94:invokespecial   #76  <Method void StringBuilder(int)>
	//   47   97:astore          5
		for(obj = ((Object) (((Set) (obj)).iterator())); ((Iterator) (obj)).hasNext(); stringbuilder.setLength(0))
	//*  48   99:aload           4
	//*  49  101:invokeinterface #86  <Method Iterator Set.iterator()>
	//*  50  106:astore          4
	//*  51  108:aload           4
	//*  52  110:invokeinterface #92  <Method boolean Iterator.hasNext()>
	//*  53  115:ifeq            214
		{
			String s = (String)((Iterator) (obj)).next();
	//   54  118:aload           4
	//   55  120:invokeinterface #96  <Method Object Iterator.next()>
	//   56  125:checkcast       #110 <Class String>
	//   57  128:astore          6
			OLog.i(TAG, (new StringBuilder()).append("dropping index '{").append(s).append("}' for table '{").append(generatedtablemapper.getTableConfig().getTableName()).append("}").toString());
	//   58  130:getstatic       #18  <Field String TAG>
	//   59  133:new             #73  <Class StringBuilder>
	//   60  136:dup             
	//   61  137:invokespecial   #99  <Method void StringBuilder()>
	//   62  140:ldc1            #194 <String "dropping index '{">
	//   63  142:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   64  145:aload           6
	//   65  147:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   66  150:ldc1            #112 <String "}' for table '{">
	//   67  152:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   68  155:aload_0         
	//   69  156:invokeinterface #35  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//   70  161:invokevirtual   #115 <Method String TableInfo.getTableName()>
	//   71  164:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   72  167:ldc1            #117 <String "}">
	//   73  169:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   74  172:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   75  175:invokestatic    #126 <Method void OLog.i(String, String)>
			stringbuilder.append("DROP INDEX ");
	//   76  178:aload           5
	//   77  180:ldc1            #196 <String "DROP INDEX ">
	//   78  182:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   79  185:pop             
			appendEscapedEntityName(stringbuilder, s);
	//   80  186:aload           5
	//   81  188:aload           6
	//   82  190:invokestatic    #138 <Method void appendEscapedEntityName(StringBuilder, String)>
			list.add(((Object) (stringbuilder.toString())));
	//   83  193:aload_1         
	//   84  194:aload           5
	//   85  196:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   86  199:invokeinterface #71  <Method boolean List.add(Object)>
	//   87  204:pop             
		}

	//   88  205:aload           5
	//   89  207:iconst_0        
	//   90  208:invokevirtual   #153 <Method void StringBuilder.setLength(int)>
	//*  91  211:goto            108
	//   92  214:return          
	}

	private static void addDropTableStatements(GeneratedTableMapper generatedtablemapper, List list)
		throws SQLException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #59  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void ArrayList()>
	//    3    7:astore_2        
		ArrayList arraylist1 = new ArrayList();
	//    4    8:new             #59  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #60  <Method void ArrayList()>
	//    7   15:astore_3        
		StringBuilder stringbuilder = new StringBuilder(64);
	//    8   16:new             #73  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:bipush          64
	//   11   22:invokespecial   #76  <Method void StringBuilder(int)>
	//   12   25:astore          4
		stringbuilder.append("DROP TABLE ");
	//   13   27:aload           4
	//   14   29:ldc1            #200 <String "DROP TABLE ">
	//   15   31:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
		appendEscapedEntityName(stringbuilder, generatedtablemapper.getTableConfig().getTableName());
	//   17   35:aload           4
	//   18   37:aload_0         
	//   19   38:invokeinterface #35  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//   20   43:invokevirtual   #115 <Method String TableInfo.getTableName()>
	//   21   46:invokestatic    #138 <Method void appendEscapedEntityName(StringBuilder, String)>
		stringbuilder.append(' ');
	//   22   49:aload           4
	//   23   51:bipush          32
	//   24   53:invokevirtual   #203 <Method StringBuilder StringBuilder.append(char)>
	//   25   56:pop             
		list.addAll(((Collection) (arraylist)));
	//   26   57:aload_1         
	//   27   58:aload_2         
	//   28   59:invokeinterface #183 <Method boolean List.addAll(Collection)>
	//   29   64:pop             
		list.add(((Object) (stringbuilder.toString())));
	//   30   65:aload_1         
	//   31   66:aload           4
	//   32   68:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   33   71:invokeinterface #71  <Method boolean List.add(Object)>
	//   34   76:pop             
		list.addAll(((Collection) (arraylist1)));
	//   35   77:aload_1         
	//   36   78:aload_3         
	//   37   79:invokeinterface #183 <Method boolean List.addAll(Collection)>
	//   38   84:pop             
	//   39   85:return          
	}

	private static void addDropViewStatements(GeneratedTableMapper generatedtablemapper, List list)
		throws SQLException
	{
		StringBuilder stringbuilder = new StringBuilder(64);
	//    0    0:new             #73  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          64
	//    3    6:invokespecial   #76  <Method void StringBuilder(int)>
	//    4    9:astore_2        
		stringbuilder.append("DROP VIEW ");
	//    5   10:aload_2         
	//    6   11:ldc1            #206 <String "DROP VIEW ">
	//    7   13:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		appendEscapedEntityName(stringbuilder, generatedtablemapper.getTableConfig().getTableName());
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:invokeinterface #35  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//   12   24:invokevirtual   #115 <Method String TableInfo.getTableName()>
	//   13   27:invokestatic    #138 <Method void appendEscapedEntityName(StringBuilder, String)>
		stringbuilder.append(' ');
	//   14   30:aload_2         
	//   15   31:bipush          32
	//   16   33:invokevirtual   #203 <Method StringBuilder StringBuilder.append(char)>
	//   17   36:pop             
		list.add(((Object) (stringbuilder.toString())));
	//   18   37:aload_1         
	//   19   38:aload_2         
	//   20   39:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   21   42:invokeinterface #71  <Method boolean List.add(Object)>
	//   22   47:pop             
	//   23   48:return          
	}

	public static void addPrimaryKeySql(FieldType afieldtype[], List list)
	{
		StringBuilder stringbuilder = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		int j = afieldtype.length;
	//    2    3:aload_0         
	//    3    4:arraylength     
	//    4    5:istore_3        
		int i = 0;
	//    5    6:iconst_0        
	//    6    7:istore_2        
		while(i < j) 
	//*   7    8:iload_2         
	//*   8    9:iload_3         
	//*   9   10:icmpge          105
		{
			FieldType fieldtype = afieldtype[i];
	//   10   13:aload_0         
	//   11   14:iload_2         
	//   12   15:aaload          
	//   13   16:astore          6
			StringBuilder stringbuilder1;
			if(fieldtype.isGeneratedId())
	//*  14   18:aload           6
	//*  15   20:invokevirtual   #209 <Method boolean FieldType.isGeneratedId()>
	//*  16   23:ifeq            41
			{
				stringbuilder1 = stringbuilder;
	//   17   26:aload           4
	//   18   28:astore          5
			} else
	//*  19   30:iload_2         
	//*  20   31:iconst_1        
	//*  21   32:iadd            
	//*  22   33:istore_2        
	//*  23   34:aload           5
	//*  24   36:astore          4
	//*  25   38:goto            8
			{
				stringbuilder1 = stringbuilder;
	//   26   41:aload           4
	//   27   43:astore          5
				if(fieldtype.isId())
	//*  28   45:aload           6
	//*  29   47:invokevirtual   #212 <Method boolean FieldType.isId()>
	//*  30   50:ifeq            30
				{
					if(stringbuilder == null)
	//*  31   53:aload           4
	//*  32   55:ifnonnull       94
					{
						stringbuilder = new StringBuilder(48);
	//   33   58:new             #73  <Class StringBuilder>
	//   34   61:dup             
	//   35   62:bipush          48
	//   36   64:invokespecial   #76  <Method void StringBuilder(int)>
	//   37   67:astore          4
						stringbuilder.append("PRIMARY KEY (");
	//   38   69:aload           4
	//   39   71:ldc1            #214 <String "PRIMARY KEY (">
	//   40   73:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   41   76:pop             
					} else
	//*  42   77:aload           4
	//*  43   79:aload           6
	//*  44   81:invokevirtual   #67  <Method String FieldType.getColumnName()>
	//*  45   84:invokestatic    #138 <Method void appendEscapedEntityName(StringBuilder, String)>
	//*  46   87:aload           4
	//*  47   89:astore          5
	//*  48   91:goto            30
					{
						stringbuilder.append(',');
	//   49   94:aload           4
	//   50   96:bipush          44
	//   51   98:invokevirtual   #203 <Method StringBuilder StringBuilder.append(char)>
	//   52  101:pop             
					}
					appendEscapedEntityName(stringbuilder, fieldtype.getColumnName());
					stringbuilder1 = stringbuilder;
				}
			}
			i++;
			stringbuilder = stringbuilder1;
		}
	//*  53  102:goto            77
		if(stringbuilder != null)
	//*  54  105:aload           4
	//*  55  107:ifnull          130
		{
			stringbuilder.append(") ");
	//   56  110:aload           4
	//   57  112:ldc1            #179 <String ") ">
	//   58  114:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   59  117:pop             
			list.add(((Object) (stringbuilder.toString())));
	//   60  118:aload_1         
	//   61  119:aload           4
	//   62  121:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   63  124:invokeinterface #71  <Method boolean List.add(Object)>
	//   64  129:pop             
		}
	//   65  130:return          
	}

	private static void addSingleUnique(FieldType fieldtype, List list)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #73  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #99  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(" UNIQUE (");
	//    4    8:aload_2         
	//    5    9:ldc1            #219 <String " UNIQUE (">
	//    6   11:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		appendEscapedEntityName(stringbuilder, fieldtype.getColumnName());
	//    8   15:aload_2         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #67  <Method String FieldType.getColumnName()>
	//   11   20:invokestatic    #138 <Method void appendEscapedEntityName(StringBuilder, String)>
		stringbuilder.append(")");
	//   12   23:aload_2         
	//   13   24:ldc1            #221 <String ")">
	//   14   26:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		list.add(((Object) (stringbuilder.toString())));
	//   16   30:aload_1         
	//   17   31:aload_2         
	//   18   32:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   19   35:invokeinterface #71  <Method boolean List.add(Object)>
	//   20   40:pop             
	//   21   41:return          
	}

	public static void addUniqueComboSql(FieldType afieldtype[], List list)
	{
		StringBuilder stringbuilder = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		int j = afieldtype.length;
	//    2    3:aload_0         
	//    3    4:arraylength     
	//    4    5:istore_3        
		int i = 0;
	//    5    6:iconst_0        
	//    6    7:istore_2        
		while(i < j) 
	//*   7    8:iload_2         
	//*   8    9:iload_3         
	//*   9   10:icmpge          90
		{
			FieldType fieldtype = afieldtype[i];
	//   10   13:aload_0         
	//   11   14:iload_2         
	//   12   15:aaload          
	//   13   16:astore          6
			StringBuilder stringbuilder1 = stringbuilder;
	//   14   18:aload           4
	//   15   20:astore          5
			if(fieldtype.isUniqueCombo())
	//*  16   22:aload           6
	//*  17   24:invokevirtual   #225 <Method boolean FieldType.isUniqueCombo()>
	//*  18   27:ifeq            68
			{
				if(stringbuilder == null)
	//*  19   30:aload           4
	//*  20   32:ifnonnull       79
				{
					stringbuilder = new StringBuilder(48);
	//   21   35:new             #73  <Class StringBuilder>
	//   22   38:dup             
	//   23   39:bipush          48
	//   24   41:invokespecial   #76  <Method void StringBuilder(int)>
	//   25   44:astore          4
					stringbuilder.append("UNIQUE (");
	//   26   46:aload           4
	//   27   48:ldc1            #227 <String "UNIQUE (">
	//   28   50:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
				} else
	//*  30   54:aload           4
	//*  31   56:aload           6
	//*  32   58:invokevirtual   #67  <Method String FieldType.getColumnName()>
	//*  33   61:invokestatic    #138 <Method void appendEscapedEntityName(StringBuilder, String)>
	//*  34   64:aload           4
	//*  35   66:astore          5
	//*  36   68:iload_2         
	//*  37   69:iconst_1        
	//*  38   70:iadd            
	//*  39   71:istore_2        
	//*  40   72:aload           5
	//*  41   74:astore          4
	//*  42   76:goto            8
				{
					stringbuilder.append(',');
	//   43   79:aload           4
	//   44   81:bipush          44
	//   45   83:invokevirtual   #203 <Method StringBuilder StringBuilder.append(char)>
	//   46   86:pop             
				}
				appendEscapedEntityName(stringbuilder, fieldtype.getColumnName());
				stringbuilder1 = stringbuilder;
			}
			i++;
			stringbuilder = stringbuilder1;
		}
	//*  47   87:goto            54
		if(stringbuilder != null)
	//*  48   90:aload           4
	//*  49   92:ifnull          115
		{
			stringbuilder.append(") ");
	//   50   95:aload           4
	//   51   97:ldc1            #179 <String ") ">
	//   52   99:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   53  102:pop             
			list.add(((Object) (stringbuilder.toString())));
	//   54  103:aload_1         
	//   55  104:aload           4
	//   56  106:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   57  109:invokeinterface #71  <Method boolean List.add(Object)>
	//   58  114:pop             
		}
	//   59  115:return          
	}

	protected static void appendBigDecimalNumericType(StringBuilder stringbuilder)
	{
		stringbuilder.append("NUMERIC");
	//    0    0:aload_0         
	//    1    1:ldc1            #231 <String "NUMERIC">
	//    2    3:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    3    6:pop             
	//    4    7:return          
	}

	protected static void appendBooleanType(StringBuilder stringbuilder)
	{
		stringbuilder.append("BOOLEAN");
	//    0    0:aload_0         
	//    1    1:ldc1            #234 <String "BOOLEAN">
	//    2    3:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    3    6:pop             
	//    4    7:return          
	}

	protected static void appendByteArrayType(StringBuilder stringbuilder)
	{
		stringbuilder.append("BLOB");
	//    0    0:aload_0         
	//    1    1:ldc1            #237 <String "BLOB">
	//    2    3:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    3    6:pop             
	//    4    7:return          
	}

	protected static void appendByteType(StringBuilder stringbuilder)
	{
		stringbuilder.append("TINYINT");
	//    0    0:aload_0         
	//    1    1:ldc1            #240 <String "TINYINT">
	//    2    3:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    3    6:pop             
	//    4    7:return          
	}

	protected static void appendCharType(StringBuilder stringbuilder)
	{
		stringbuilder.append("CHAR");
	//    0    0:aload_0         
	//    1    1:ldc1            #243 <String "CHAR">
	//    2    3:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    3    6:pop             
	//    4    7:return          
	}

	public static void appendColumnArg(StringBuilder stringbuilder, FieldType fieldtype, List list)
		throws SQLException
	{
		DataPersister datapersister;
		appendEscapedEntityName(stringbuilder, fieldtype.getColumnName());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #67  <Method String FieldType.getColumnName()>
	//    3    5:invokestatic    #138 <Method void appendEscapedEntityName(StringBuilder, String)>
		stringbuilder.append(' ');
	//    4    8:aload_0         
	//    5    9:bipush          32
	//    6   11:invokevirtual   #203 <Method StringBuilder StringBuilder.append(char)>
	//    7   14:pop             
		datapersister = fieldtype.getDataPersister();
	//    8   15:aload_1         
	//    9   16:invokevirtual   #247 <Method DataPersister FieldType.getDataPersister()>
	//   10   19:astore_3        
		static class _cls1
		{

			static final int $SwitchMap$co$touchlab$squeaky$field$SqlType[];

			static 
			{
				$SwitchMap$co$touchlab$squeaky$field$SqlType = new int[SqlType.values().length];
			//    0    0:invokestatic    #18  <Method SqlType[] SqlType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
				try
				{
					$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.STRING.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
			//    5   12:getstatic       #24  <Field SqlType SqlType.STRING>
			//    6   15:invokevirtual   #28  <Method int SqlType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
			//*  10   23:getstatic       #31  <Field SqlType SqlType.LONG_STRING>
			//*  11   26:invokevirtual   #28  <Method int SqlType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
			//*  15   34:getstatic       #34  <Field SqlType SqlType.BOOLEAN>
			//*  16   37:invokevirtual   #28  <Method int SqlType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
			//*  20   45:getstatic       #37  <Field SqlType SqlType.DATE>
			//*  21   48:invokevirtual   #28  <Method int SqlType.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
			//*  25   56:getstatic       #40  <Field SqlType SqlType.CHAR>
			//*  26   59:invokevirtual   #28  <Method int SqlType.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
			//*  30   67:getstatic       #43  <Field SqlType SqlType.BYTE>
			//*  31   70:invokevirtual   #28  <Method int SqlType.ordinal()>
			//*  32   73:bipush          6
			//*  33   75:iastore         
			//*  34   76:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
			//*  35   79:getstatic       #46  <Field SqlType SqlType.BYTE_ARRAY>
			//*  36   82:invokevirtual   #28  <Method int SqlType.ordinal()>
			//*  37   85:bipush          7
			//*  38   87:iastore         
			//*  39   88:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
			//*  40   91:getstatic       #49  <Field SqlType SqlType.SHORT>
			//*  41   94:invokevirtual   #28  <Method int SqlType.ordinal()>
			//*  42   97:bipush          8
			//*  43   99:iastore         
			//*  44  100:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
			//*  45  103:getstatic       #52  <Field SqlType SqlType.INTEGER>
			//*  46  106:invokevirtual   #28  <Method int SqlType.ordinal()>
			//*  47  109:bipush          9
			//*  48  111:iastore         
			//*  49  112:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
			//*  50  115:getstatic       #55  <Field SqlType SqlType.LONG>
			//*  51  118:invokevirtual   #28  <Method int SqlType.ordinal()>
			//*  52  121:bipush          10
			//*  53  123:iastore         
			//*  54  124:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
			//*  55  127:getstatic       #58  <Field SqlType SqlType.FLOAT>
			//*  56  130:invokevirtual   #28  <Method int SqlType.ordinal()>
			//*  57  133:bipush          11
			//*  58  135:iastore         
			//*  59  136:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
			//*  60  139:getstatic       #61  <Field SqlType SqlType.DOUBLE>
			//*  61  142:invokevirtual   #28  <Method int SqlType.ordinal()>
			//*  62  145:bipush          12
			//*  63  147:iastore         
			//*  64  148:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
			//*  65  151:getstatic       #64  <Field SqlType SqlType.SERIALIZABLE>
			//*  66  154:invokevirtual   #28  <Method int SqlType.ordinal()>
			//*  67  157:bipush          13
			//*  68  159:iastore         
			//*  69  160:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
			//*  70  163:getstatic       #67  <Field SqlType SqlType.BIG_DECIMAL>
			//*  71  166:invokevirtual   #28  <Method int SqlType.ordinal()>
			//*  72  169:bipush          14
			//*  73  171:iastore         
			//*  74  172:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
			//*  75  175:getstatic       #70  <Field SqlType SqlType.UNKNOWN>
			//*  76  178:invokevirtual   #28  <Method int SqlType.ordinal()>
			//*  77  181:bipush          15
			//*  78  183:iastore         
			//*  79  184:return          
			//*  80  185:astore_0        
			//*  81  186:return          
			//*  82  187:astore_0        
			//*  83  188:goto            172
			//*  84  191:astore_0        
			//*  85  192:goto            160
			//*  86  195:astore_0        
			//*  87  196:goto            148
			//*  88  199:astore_0        
			//*  89  200:goto            136
			//*  90  203:astore_0        
			//*  91  204:goto            124
			//*  92  207:astore_0        
			//*  93  208:goto            112
			//*  94  211:astore_0        
			//*  95  212:goto            100
			//*  96  215:astore_0        
			//*  97  216:goto            88
			//*  98  219:astore_0        
			//*  99  220:goto            76
			//* 100  223:astore_0        
			//* 101  224:goto            64
			//* 102  227:astore_0        
			//* 103  228:goto            53
			//* 104  231:astore_0        
			//* 105  232:goto            42
			//* 106  235:astore_0        
			//* 107  236:goto            31
				catch(NoSuchFieldError nosuchfielderror14) { }
			//  108  239:astore_0        
				try
				{
					$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.LONG_STRING.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror13) { }
				try
				{
					$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.BOOLEAN.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror12) { }
				try
				{
					$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.DATE.ordinal()] = 4;
				}
				catch(NoSuchFieldError nosuchfielderror11) { }
				try
				{
					$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.CHAR.ordinal()] = 5;
				}
				catch(NoSuchFieldError nosuchfielderror10) { }
				try
				{
					$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.BYTE.ordinal()] = 6;
				}
				catch(NoSuchFieldError nosuchfielderror9) { }
				try
				{
					$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.BYTE_ARRAY.ordinal()] = 7;
				}
				catch(NoSuchFieldError nosuchfielderror8) { }
				try
				{
					$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.SHORT.ordinal()] = 8;
				}
				catch(NoSuchFieldError nosuchfielderror7) { }
				try
				{
					$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.INTEGER.ordinal()] = 9;
				}
				catch(NoSuchFieldError nosuchfielderror6) { }
				try
				{
					$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.LONG.ordinal()] = 10;
				}
				catch(NoSuchFieldError nosuchfielderror5) { }
				try
				{
					$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.FLOAT.ordinal()] = 11;
				}
				catch(NoSuchFieldError nosuchfielderror4) { }
				try
				{
					$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.DOUBLE.ordinal()] = 12;
				}
				catch(NoSuchFieldError nosuchfielderror3) { }
				try
				{
					$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.SERIALIZABLE.ordinal()] = 13;
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
				try
				{
					$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.BIG_DECIMAL.ordinal()] = 14;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.UNKNOWN.ordinal()] = 15;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//* 109  240:goto            20
			}
		}

		_cls1..SwitchMap.co.touchlab.squeaky.field.SqlType[datapersister.getSqlType().ordinal()];
	//   11   20:getstatic       #251 <Field int[] TableUtils$1.$SwitchMap$co$touchlab$squeaky$field$SqlType>
	//   12   23:aload_3         
	//   13   24:invokeinterface #257 <Method SqlType DataPersister.getSqlType()>
	//   14   29:invokevirtual   #263 <Method int SqlType.ordinal()>
	//   15   32:iaload          
		JVM INSTR tableswitch 1 14: default 104
	//	               1 137
	//	               2 225
	//	               3 232
	//	               4 239
	//	               5 246
	//	               6 253
	//	               7 260
	//	               8 267
	//	               9 274
	//	               10 281
	//	               11 289
	//	               12 296
	//	               13 303
	//	               14 310;
	//   16   33:tableswitch     1 14: default 104
	//	               1 137
	//	               2 225
	//	               3 232
	//	               4 239
	//	               5 246
	//	               6 253
	//	               7 260
	//	               8 267
	//	               9 274
	//	               10 281
	//	               11 289
	//	               12 296
	//	               13 303
	//	               14 310
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
		throw new IllegalArgumentException((new StringBuilder()).append("Unknown SQL-type ").append(((Object) (datapersister.getSqlType()))).toString());
	//   17  104:new             #265 <Class IllegalArgumentException>
	//   18  107:dup             
	//   19  108:new             #73  <Class StringBuilder>
	//   20  111:dup             
	//   21  112:invokespecial   #99  <Method void StringBuilder()>
	//   22  115:ldc2            #267 <String "Unknown SQL-type ">
	//   23  118:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   24  121:aload_3         
	//   25  122:invokeinterface #257 <Method SqlType DataPersister.getSqlType()>
	//   26  127:invokevirtual   #270 <Method StringBuilder StringBuilder.append(Object)>
	//   27  130:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   28  133:invokespecial   #273 <Method void IllegalArgumentException(String)>
	//   29  136:athrow          
_L2:
		appendStringType(stringbuilder);
	//   30  137:aload_0         
	//   31  138:invokestatic    #276 <Method void appendStringType(StringBuilder)>
_L17:
		stringbuilder.append(' ');
	//   32  141:aload_0         
	//   33  142:bipush          32
	//   34  144:invokevirtual   #203 <Method StringBuilder StringBuilder.append(char)>
	//   35  147:pop             
		if(fieldtype.isGeneratedId())
	//*  36  148:aload_1         
	//*  37  149:invokevirtual   #209 <Method boolean FieldType.isGeneratedId()>
	//*  38  152:ifeq            160
			configureGeneratedId(stringbuilder, fieldtype);
	//   39  155:aload_0         
	//   40  156:aload_1         
	//   41  157:invokestatic    #280 <Method void configureGeneratedId(StringBuilder, FieldType)>
		if(!fieldtype.isGeneratedId())
	//*  42  160:aload_1         
	//*  43  161:invokevirtual   #209 <Method boolean FieldType.isGeneratedId()>
	//*  44  164:ifne            224
		{
			Object obj = fieldtype.getDefaultValue();
	//   45  167:aload_1         
	//   46  168:invokevirtual   #283 <Method Object FieldType.getDefaultValue()>
	//   47  171:astore_3        
			if(obj != null)
	//*  48  172:aload_3         
	//*  49  173:ifnull          197
			{
				stringbuilder.append("DEFAULT ");
	//   50  176:aload_0         
	//   51  177:ldc2            #285 <String "DEFAULT ">
	//   52  180:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   53  183:pop             
				appendDefaultValue(stringbuilder, fieldtype, obj);
	//   54  184:aload_0         
	//   55  185:aload_1         
	//   56  186:aload_3         
	//   57  187:invokestatic    #289 <Method void appendDefaultValue(StringBuilder, FieldType, Object)>
				stringbuilder.append(' ');
	//   58  190:aload_0         
	//   59  191:bipush          32
	//   60  193:invokevirtual   #203 <Method StringBuilder StringBuilder.append(char)>
	//   61  196:pop             
			}
			if(!fieldtype.isCanBeNull())
	//*  62  197:aload_1         
	//*  63  198:invokevirtual   #292 <Method boolean FieldType.isCanBeNull()>
	//*  64  201:ifne            212
				stringbuilder.append("NOT NULL ");
	//   65  204:aload_0         
	//   66  205:ldc2            #294 <String "NOT NULL ">
	//   67  208:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   68  211:pop             
			if(fieldtype.isUnique())
	//*  69  212:aload_1         
	//*  70  213:invokevirtual   #297 <Method boolean FieldType.isUnique()>
	//*  71  216:ifeq            224
				addSingleUnique(fieldtype, list);
	//   72  219:aload_1         
	//   73  220:aload_2         
	//   74  221:invokestatic    #299 <Method void addSingleUnique(FieldType, List)>
		}
		return;
	//   75  224:return          
_L3:
		appendLongStringType(stringbuilder);
	//   76  225:aload_0         
	//   77  226:invokestatic    #302 <Method void appendLongStringType(StringBuilder)>
		continue; /* Loop/switch isn't completed */
	//   78  229:goto            141
_L4:
		appendBooleanType(stringbuilder);
	//   79  232:aload_0         
	//   80  233:invokestatic    #304 <Method void appendBooleanType(StringBuilder)>
		continue; /* Loop/switch isn't completed */
	//   81  236:goto            141
_L5:
		appendDateType(stringbuilder);
	//   82  239:aload_0         
	//   83  240:invokestatic    #307 <Method void appendDateType(StringBuilder)>
		continue; /* Loop/switch isn't completed */
	//   84  243:goto            141
_L6:
		appendCharType(stringbuilder);
	//   85  246:aload_0         
	//   86  247:invokestatic    #309 <Method void appendCharType(StringBuilder)>
		continue; /* Loop/switch isn't completed */
	//   87  250:goto            141
_L7:
		appendByteType(stringbuilder);
	//   88  253:aload_0         
	//   89  254:invokestatic    #311 <Method void appendByteType(StringBuilder)>
		continue; /* Loop/switch isn't completed */
	//   90  257:goto            141
_L8:
		appendByteArrayType(stringbuilder);
	//   91  260:aload_0         
	//   92  261:invokestatic    #313 <Method void appendByteArrayType(StringBuilder)>
		continue; /* Loop/switch isn't completed */
	//   93  264:goto            141
_L9:
		appendShortType(stringbuilder);
	//   94  267:aload_0         
	//   95  268:invokestatic    #316 <Method void appendShortType(StringBuilder)>
		continue; /* Loop/switch isn't completed */
	//   96  271:goto            141
_L10:
		appendIntegerType(stringbuilder);
	//   97  274:aload_0         
	//   98  275:invokestatic    #319 <Method void appendIntegerType(StringBuilder)>
		continue; /* Loop/switch isn't completed */
	//   99  278:goto            141
_L11:
		appendLongType(stringbuilder, fieldtype);
	//  100  281:aload_0         
	//  101  282:aload_1         
	//  102  283:invokestatic    #322 <Method void appendLongType(StringBuilder, FieldType)>
		continue; /* Loop/switch isn't completed */
	//  103  286:goto            141
_L12:
		appendFloatType(stringbuilder);
	//  104  289:aload_0         
	//  105  290:invokestatic    #325 <Method void appendFloatType(StringBuilder)>
		continue; /* Loop/switch isn't completed */
	//  106  293:goto            141
_L13:
		appendDoubleType(stringbuilder);
	//  107  296:aload_0         
	//  108  297:invokestatic    #328 <Method void appendDoubleType(StringBuilder)>
		continue; /* Loop/switch isn't completed */
	//  109  300:goto            141
_L14:
		appendSerializableType(stringbuilder);
	//  110  303:aload_0         
	//  111  304:invokestatic    #331 <Method void appendSerializableType(StringBuilder)>
		continue; /* Loop/switch isn't completed */
	//  112  307:goto            141
_L15:
		appendBigDecimalNumericType(stringbuilder);
	//  113  310:aload_0         
	//  114  311:invokestatic    #333 <Method void appendBigDecimalNumericType(StringBuilder)>
		if(true) goto _L17; else goto _L16
	//  115  314:goto            141
_L16:
	}

	protected static void appendDateType(StringBuilder stringbuilder)
	{
		stringbuilder.append("TIMESTAMP");
	//    0    0:aload_0         
	//    1    1:ldc2            #336 <String "TIMESTAMP">
	//    2    4:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    3    7:pop             
	//    4    8:return          
	}

	private static void appendDefaultValue(StringBuilder stringbuilder, FieldType fieldtype, Object obj)
	{
		if(fieldtype.isEscapedDefaultValue())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #339 <Method boolean FieldType.isEscapedDefaultValue()>
	//*   2    4:ifeq            16
		{
			appendEscapedWord(stringbuilder, obj.toString());
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #340 <Method String Object.toString()>
	//    6   12:invokestatic    #343 <Method void appendEscapedWord(StringBuilder, String)>
			return;
	//    7   15:return          
		} else
		{
			stringbuilder.append(obj);
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #270 <Method StringBuilder StringBuilder.append(Object)>
	//   11   21:pop             
			return;
	//   12   22:return          
		}
	}

	private static void appendDoubleType(StringBuilder stringbuilder)
	{
		stringbuilder.append("DOUBLE PRECISION");
	//    0    0:aload_0         
	//    1    1:ldc2            #345 <String "DOUBLE PRECISION">
	//    2    4:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    3    7:pop             
	//    4    8:return          
	}

	public static void appendEscapedEntityName(StringBuilder stringbuilder, String s)
	{
		stringbuilder.append('`').append(s).append('`');
	//    0    0:aload_0         
	//    1    1:bipush          96
	//    2    3:invokevirtual   #203 <Method StringBuilder StringBuilder.append(char)>
	//    3    6:aload_1         
	//    4    7:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    5   10:bipush          96
	//    6   12:invokevirtual   #203 <Method StringBuilder StringBuilder.append(char)>
	//    7   15:pop             
	//    8   16:return          
	}

	public static void appendEscapedWord(StringBuilder stringbuilder, String s)
	{
		stringbuilder.append('\'').append(s).append('\'');
	//    0    0:aload_0         
	//    1    1:bipush          39
	//    2    3:invokevirtual   #203 <Method StringBuilder StringBuilder.append(char)>
	//    3    6:aload_1         
	//    4    7:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    5   10:bipush          39
	//    6   12:invokevirtual   #203 <Method StringBuilder StringBuilder.append(char)>
	//    7   15:pop             
	//    8   16:return          
	}

	private static void appendFloatType(StringBuilder stringbuilder)
	{
		stringbuilder.append("FLOAT");
	//    0    0:aload_0         
	//    1    1:ldc2            #347 <String "FLOAT">
	//    2    4:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    3    7:pop             
	//    4    8:return          
	}

	private static void appendIntegerType(StringBuilder stringbuilder)
	{
		stringbuilder.append("INTEGER");
	//    0    0:aload_0         
	//    1    1:ldc2            #349 <String "INTEGER">
	//    2    4:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    3    7:pop             
	//    4    8:return          
	}

	protected static void appendLongStringType(StringBuilder stringbuilder)
	{
		stringbuilder.append("TEXT");
	//    0    0:aload_0         
	//    1    1:ldc2            #351 <String "TEXT">
	//    2    4:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    3    7:pop             
	//    4    8:return          
	}

	protected static void appendLongType(StringBuilder stringbuilder, FieldType fieldtype)
	{
		if(fieldtype.getSqlType() == SqlType.LONG && fieldtype.isGeneratedId())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #352 <Method SqlType FieldType.getSqlType()>
	//*   2    4:getstatic       #356 <Field SqlType SqlType.LONG>
	//*   3    7:if_acmpne       26
	//*   4   10:aload_1         
	//*   5   11:invokevirtual   #209 <Method boolean FieldType.isGeneratedId()>
	//*   6   14:ifeq            26
		{
			stringbuilder.append("INTEGER");
	//    7   17:aload_0         
	//    8   18:ldc2            #349 <String "INTEGER">
	//    9   21:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:pop             
			return;
	//   11   25:return          
		} else
		{
			stringbuilder.append("BIGINT");
	//   12   26:aload_0         
	//   13   27:ldc2            #358 <String "BIGINT">
	//   14   30:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
			return;
	//   16   34:return          
		}
	}

	protected static void appendSerializableType(StringBuilder stringbuilder)
	{
		stringbuilder.append("BLOB");
	//    0    0:aload_0         
	//    1    1:ldc1            #237 <String "BLOB">
	//    2    3:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    3    6:pop             
	//    4    7:return          
	}

	protected static void appendShortType(StringBuilder stringbuilder)
	{
		stringbuilder.append("SMALLINT");
	//    0    0:aload_0         
	//    1    1:ldc2            #360 <String "SMALLINT">
	//    2    4:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    3    7:pop             
	//    4    8:return          
	}

	protected static void appendStringType(StringBuilder stringbuilder)
	{
		stringbuilder.append("VARCHAR");
	//    0    0:aload_0         
	//    1    1:ldc2            #362 <String "VARCHAR">
	//    2    4:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    3    7:pop             
	//    4    8:return          
	}

	public static void clearTable(SQLiteDatabase sqlitedatabase, Class class1)
		throws SQLException
	{
		clearTable(sqlitedatabase, loadTableMapper(class1).getTableConfig().getTableName());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #368 <Method GeneratedTableMapper loadTableMapper(Class)>
	//    3    5:invokeinterface #35  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//    4   10:invokevirtual   #115 <Method String TableInfo.getTableName()>
	//    5   13:invokestatic    #371 <Method void clearTable(SQLiteDatabase, String)>
	//    6   16:return          
	}

	private static void clearTable(SQLiteDatabase sqlitedatabase, String s)
		throws SQLException
	{
		StringBuilder stringbuilder = new StringBuilder(48);
	//    0    0:new             #73  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          48
	//    3    6:invokespecial   #76  <Method void StringBuilder(int)>
	//    4    9:astore_2        
		stringbuilder.append("DELETE FROM ");
	//    5   10:aload_2         
	//    6   11:ldc2            #374 <String "DELETE FROM ">
	//    7   14:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		appendEscapedEntityName(stringbuilder, s);
	//    9   18:aload_2         
	//   10   19:aload_1         
	//   11   20:invokestatic    #138 <Method void appendEscapedEntityName(StringBuilder, String)>
		String s1 = stringbuilder.toString();
	//   12   23:aload_2         
	//   13   24:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   14   27:astore_3        
		OLog.i(TAG, (new StringBuilder()).append("clearing table '{").append(s).append("}' with '{").append(s1).append("}").toString());
	//   15   28:getstatic       #18  <Field String TAG>
	//   16   31:new             #73  <Class StringBuilder>
	//   17   34:dup             
	//   18   35:invokespecial   #99  <Method void StringBuilder()>
	//   19   38:ldc2            #376 <String "clearing table '{">
	//   20   41:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   21   44:aload_1         
	//   22   45:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   23   48:ldc2            #378 <String "}' with '{">
	//   24   51:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   25   54:aload_3         
	//   26   55:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   27   58:ldc1            #117 <String "}">
	//   28   60:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   29   63:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   30   66:invokestatic    #126 <Method void OLog.i(String, String)>
		sqlitedatabase.execSQL(stringbuilder.toString());
	//   31   69:aload_0         
	//   32   70:aload_2         
	//   33   71:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   34   74:invokeinterface #383 <Method void SQLiteDatabase.execSQL(String)>
	//   35   79:return          
	}

	protected static void configureGeneratedId(StringBuilder stringbuilder, FieldType fieldtype)
	{
		if(fieldtype.getSqlType() != SqlType.INTEGER && fieldtype.getSqlType() != SqlType.LONG)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #352 <Method SqlType FieldType.getSqlType()>
	//*   2    4:getstatic       #385 <Field SqlType SqlType.INTEGER>
	//*   3    7:if_acmpeq       31
	//*   4   10:aload_1         
	//*   5   11:invokevirtual   #352 <Method SqlType FieldType.getSqlType()>
	//*   6   14:getstatic       #356 <Field SqlType SqlType.LONG>
	//*   7   17:if_acmpeq       31
		{
			throw new IllegalArgumentException("Sqlite requires that auto-increment generated-id be integer or long type");
	//    8   20:new             #265 <Class IllegalArgumentException>
	//    9   23:dup             
	//   10   24:ldc2            #387 <String "Sqlite requires that auto-increment generated-id be integer or long type">
	//   11   27:invokespecial   #273 <Method void IllegalArgumentException(String)>
	//   12   30:athrow          
		} else
		{
			stringbuilder.append("PRIMARY KEY AUTOINCREMENT ");
	//   13   31:aload_0         
	//   14   32:ldc2            #389 <String "PRIMARY KEY AUTOINCREMENT ">
	//   15   35:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   16   38:pop             
			return;
	//   17   39:return          
		}
	}

	private static int createTable(SQLiteDatabase sqlitedatabase, Class class1, boolean flag)
		throws SQLException
	{
		return doCreateTable(sqlitedatabase, loadTableMapper(class1), flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #368 <Method GeneratedTableMapper loadTableMapper(Class)>
	//    3    5:iload_2         
	//    4    6:invokestatic    #395 <Method int doCreateTable(SQLiteDatabase, GeneratedTableMapper, boolean)>
	//    5    9:ireturn         
	}

	public static transient int createTables(SQLiteDatabase sqlitedatabase, Class aclass[])
		throws SQLException
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int k = aclass.length;
	//    2    2:aload_1         
	//    3    3:arraylength     
	//    4    4:istore          4
		for(int i = 0; i < k; i++)
	//*   5    6:iconst_0        
	//*   6    7:istore_2        
	//*   7    8:iload_2         
	//*   8    9:iload           4
	//*   9   11:icmpge          32
			j += createTable(sqlitedatabase, aclass[i], false);
	//   10   14:iload_3         
	//   11   15:aload_0         
	//   12   16:aload_1         
	//   13   17:iload_2         
	//   14   18:aaload          
	//   15   19:iconst_0        
	//   16   20:invokestatic    #400 <Method int createTable(SQLiteDatabase, Class, boolean)>
	//   17   23:iadd            
	//   18   24:istore_3        

	//   19   25:iload_2         
	//   20   26:iconst_1        
	//   21   27:iadd            
	//   22   28:istore_2        
	//*  23   29:goto            8
		return j;
	//   24   32:iload_3         
	//   25   33:ireturn         
	}

	public static transient int createTablesIfNotExists(SQLiteDatabase sqlitedatabase, Class aclass[])
		throws SQLException
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int k = aclass.length;
	//    2    2:aload_1         
	//    3    3:arraylength     
	//    4    4:istore          4
		for(int i = 0; i < k; i++)
	//*   5    6:iconst_0        
	//*   6    7:istore_2        
	//*   7    8:iload_2         
	//*   8    9:iload           4
	//*   9   11:icmpge          32
			j += createTable(sqlitedatabase, aclass[i], true);
	//   10   14:iload_3         
	//   11   15:aload_0         
	//   12   16:aload_1         
	//   13   17:iload_2         
	//   14   18:aaload          
	//   15   19:iconst_1        
	//   16   20:invokestatic    #400 <Method int createTable(SQLiteDatabase, Class, boolean)>
	//   17   23:iadd            
	//   18   24:istore_3        

	//   19   25:iload_2         
	//   20   26:iconst_1        
	//   21   27:iadd            
	//   22   28:istore_2        
	//*  23   29:goto            8
		return j;
	//   24   32:iload_3         
	//   25   33:ireturn         
	}

	private static int doCreateTable(SQLiteDatabase sqlitedatabase, GeneratedTableMapper generatedtablemapper, boolean flag)
		throws SQLException
	{
		OLog.i(TAG, (new StringBuilder()).append("creating table '{").append(generatedtablemapper.getTableConfig().getTableName()).append("}'").toString());
	//    0    0:getstatic       #18  <Field String TAG>
	//    1    3:new             #73  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #99  <Method void StringBuilder()>
	//    4   10:ldc2            #404 <String "creating table '{">
	//    5   13:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    6   16:aload_1         
	//    7   17:invokeinterface #35  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//    8   22:invokevirtual   #115 <Method String TableInfo.getTableName()>
	//    9   25:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   10   28:ldc2            #406 <String "}'">
	//   11   31:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   12   34:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   13   37:invokestatic    #126 <Method void OLog.i(String, String)>
		ArrayList arraylist = new ArrayList();
	//   14   40:new             #59  <Class ArrayList>
	//   15   43:dup             
	//   16   44:invokespecial   #60  <Method void ArrayList()>
	//   17   47:astore_3        
		addCreateTableStatements(generatedtablemapper, ((List) (arraylist)), flag);
	//   18   48:aload_1         
	//   19   49:aload_3         
	//   20   50:iload_2         
	//   21   51:invokestatic    #161 <Method void addCreateTableStatements(GeneratedTableMapper, List, boolean)>
		return doStatements(sqlitedatabase, "create", ((Collection) (arraylist)), false, false, false);
	//   22   54:aload_0         
	//   23   55:ldc2            #408 <String "create">
	//   24   58:aload_3         
	//   25   59:iconst_0        
	//   26   60:iconst_0        
	//   27   61:iconst_0        
	//   28   62:invokestatic    #412 <Method int doStatements(SQLiteDatabase, String, Collection, boolean, boolean, boolean)>
	//   29   65:ireturn         
	}

	private static int doDropTable(SQLiteDatabase sqlitedatabase, GeneratedTableMapper generatedtablemapper, boolean flag)
		throws SQLException
	{
		OLog.i(TAG, (new StringBuilder()).append("dropping table '{").append(generatedtablemapper.getTableConfig().getTableName()).append("}'").toString());
	//    0    0:getstatic       #18  <Field String TAG>
	//    1    3:new             #73  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #99  <Method void StringBuilder()>
	//    4   10:ldc2            #416 <String "dropping table '{">
	//    5   13:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    6   16:aload_1         
	//    7   17:invokeinterface #35  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//    8   22:invokevirtual   #115 <Method String TableInfo.getTableName()>
	//    9   25:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   10   28:ldc2            #406 <String "}'">
	//   11   31:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   12   34:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   13   37:invokestatic    #126 <Method void OLog.i(String, String)>
		ArrayList arraylist = new ArrayList();
	//   14   40:new             #59  <Class ArrayList>
	//   15   43:dup             
	//   16   44:invokespecial   #60  <Method void ArrayList()>
	//   17   47:astore_3        
		addDropIndexStatements(generatedtablemapper, ((List) (arraylist)));
	//   18   48:aload_1         
	//   19   49:aload_3         
	//   20   50:invokestatic    #418 <Method void addDropIndexStatements(GeneratedTableMapper, List)>
		addDropTableStatements(generatedtablemapper, ((List) (arraylist)));
	//   21   53:aload_1         
	//   22   54:aload_3         
	//   23   55:invokestatic    #420 <Method void addDropTableStatements(GeneratedTableMapper, List)>
		return doStatements(sqlitedatabase, "drop", ((Collection) (arraylist)), flag, false, false);
	//   24   58:aload_0         
	//   25   59:ldc2            #422 <String "drop">
	//   26   62:aload_3         
	//   27   63:iload_2         
	//   28   64:iconst_0        
	//   29   65:iconst_0        
	//   30   66:invokestatic    #412 <Method int doStatements(SQLiteDatabase, String, Collection, boolean, boolean, boolean)>
	//   31   69:ireturn         
	}

	private static int doDropView(SQLiteDatabase sqlitedatabase, GeneratedTableMapper generatedtablemapper, boolean flag)
		throws SQLException
	{
		OLog.i(TAG, (new StringBuilder()).append("dropping table '{").append(generatedtablemapper.getTableConfig().getTableName()).append("}'").toString());
	//    0    0:getstatic       #18  <Field String TAG>
	//    1    3:new             #73  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #99  <Method void StringBuilder()>
	//    4   10:ldc2            #416 <String "dropping table '{">
	//    5   13:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    6   16:aload_1         
	//    7   17:invokeinterface #35  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//    8   22:invokevirtual   #115 <Method String TableInfo.getTableName()>
	//    9   25:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   10   28:ldc2            #406 <String "}'">
	//   11   31:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   12   34:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   13   37:invokestatic    #126 <Method void OLog.i(String, String)>
		ArrayList arraylist = new ArrayList();
	//   14   40:new             #59  <Class ArrayList>
	//   15   43:dup             
	//   16   44:invokespecial   #60  <Method void ArrayList()>
	//   17   47:astore_3        
		addDropViewStatements(generatedtablemapper, ((List) (arraylist)));
	//   18   48:aload_1         
	//   19   49:aload_3         
	//   20   50:invokestatic    #425 <Method void addDropViewStatements(GeneratedTableMapper, List)>
		return doStatements(sqlitedatabase, "drop", ((Collection) (arraylist)), flag, false, false);
	//   21   53:aload_0         
	//   22   54:ldc2            #422 <String "drop">
	//   23   57:aload_3         
	//   24   58:iload_2         
	//   25   59:iconst_0        
	//   26   60:iconst_0        
	//   27   61:invokestatic    #412 <Method int doStatements(SQLiteDatabase, String, Collection, boolean, boolean, boolean)>
	//   28   64:ireturn         
	}

	private static int doStatements(SQLiteDatabase sqlitedatabase, String s, Collection collection, boolean flag, boolean flag1, boolean flag2)
		throws SQLException
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          6
		collection = ((Collection) (collection.iterator()));
	//    2    3:aload_2         
	//    3    4:invokeinterface #430 <Method Iterator Collection.iterator()>
	//    4    9:astore_2        
		do
		{
			if(!((Iterator) (collection)).hasNext())
				break;
	//    5   10:aload_2         
	//    6   11:invokeinterface #92  <Method boolean Iterator.hasNext()>
	//    7   16:ifeq            169
			String s1 = (String)((Iterator) (collection)).next();
	//    8   19:aload_2         
	//    9   20:invokeinterface #96  <Method Object Iterator.next()>
	//   10   25:checkcast       #110 <Class String>
	//   11   28:astore          7
			try
			{
				sqlitedatabase.execSQL(s1);
	//   12   30:aload_0         
	//   13   31:aload           7
	//   14   33:invokeinterface #383 <Method void SQLiteDatabase.execSQL(String)>
				OLog.i(TAG, (new StringBuilder()).append("executed {").append(s).append("} table statement changed: {").append(s1).append("}").toString());
	//   15   38:getstatic       #18  <Field String TAG>
	//   16   41:new             #73  <Class StringBuilder>
	//   17   44:dup             
	//   18   45:invokespecial   #99  <Method void StringBuilder()>
	//   19   48:ldc2            #432 <String "executed {">
	//   20   51:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   21   54:aload_1         
	//   22   55:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   23   58:ldc2            #434 <String "} table statement changed: {">
	//   24   61:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   25   64:aload           7
	//   26   66:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   27   69:ldc1            #117 <String "}">
	//   28   71:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   29   74:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   30   77:invokestatic    #126 <Method void OLog.i(String, String)>
			}
	//*  31   80:iload           6
	//*  32   82:iconst_1        
	//*  33   83:iadd            
	//*  34   84:istore          6
	//*  35   86:goto            10
			catch(Exception exception)
	//*  36   89:astore          8
			{
				if(flag)
	//*  37   91:iload_3         
	//*  38   92:ifeq            142
					OLog.i(TAG, (new StringBuilder()).append("ignoring {").append(s).append("} error for statement: {").append(s1).append("}").toString(), ((Throwable) (exception)));
	//   39   95:getstatic       #18  <Field String TAG>
	//   40   98:new             #73  <Class StringBuilder>
	//   41  101:dup             
	//   42  102:invokespecial   #99  <Method void StringBuilder()>
	//   43  105:ldc2            #436 <String "ignoring {">
	//   44  108:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   45  111:aload_1         
	//   46  112:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   47  115:ldc2            #438 <String "} error for statement: {">
	//   48  118:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   49  121:aload           7
	//   50  123:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   51  126:ldc1            #117 <String "}">
	//   52  128:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   53  131:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   54  134:aload           8
	//   55  136:invokestatic    #441 <Method void OLog.i(String, String, Throwable)>
				else
	//*  56  139:goto            80
					throw SqlExceptionUtil.create((new StringBuilder()).append("SQL statement failed: ").append(s1).toString(), ((Throwable) (exception)));
	//   57  142:new             #73  <Class StringBuilder>
	//   58  145:dup             
	//   59  146:invokespecial   #99  <Method void StringBuilder()>
	//   60  149:ldc2            #443 <String "SQL statement failed: ">
	//   61  152:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   62  155:aload           7
	//   63  157:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   64  160:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   65  163:aload           8
	//   66  165:invokestatic    #448 <Method SQLException SqlExceptionUtil.create(String, Throwable)>
	//   67  168:athrow          
			}
			i++;
		} while(true);
		return i;
	//   68  169:iload           6
	//   69  171:ireturn         
	}

	public static transient int dropTables(SQLiteDatabase sqlitedatabase, boolean flag, Class aclass[])
		throws SQLException
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		int k = aclass.length;
	//    2    3:aload_2         
	//    3    4:arraylength     
	//    4    5:istore          5
		for(int i = 0; i < k; i++)
	//*   5    7:iconst_0        
	//*   6    8:istore_3        
	//*   7    9:iload_3         
	//*   8   10:iload           5
	//*   9   12:icmpge          38
			j += doDropTable(sqlitedatabase, loadTableMapper(aclass[i]), flag);
	//   10   15:iload           4
	//   11   17:aload_0         
	//   12   18:aload_2         
	//   13   19:iload_3         
	//   14   20:aaload          
	//   15   21:invokestatic    #368 <Method GeneratedTableMapper loadTableMapper(Class)>
	//   16   24:iload_1         
	//   17   25:invokestatic    #453 <Method int doDropTable(SQLiteDatabase, GeneratedTableMapper, boolean)>
	//   18   28:iadd            
	//   19   29:istore          4

	//   20   31:iload_3         
	//   21   32:iconst_1        
	//   22   33:iadd            
	//   23   34:istore_3        
	//*  24   35:goto            9
		return j;
	//   25   38:iload           4
	//   26   40:ireturn         
	}

	public static transient int dropViews(SQLiteDatabase sqlitedatabase, boolean flag, Class aclass[])
		throws SQLException
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		int k = aclass.length;
	//    2    3:aload_2         
	//    3    4:arraylength     
	//    4    5:istore          5
		for(int i = 0; i < k; i++)
	//*   5    7:iconst_0        
	//*   6    8:istore_3        
	//*   7    9:iload_3         
	//*   8   10:iload           5
	//*   9   12:icmpge          38
			j += doDropView(sqlitedatabase, loadTableMapper(aclass[i]), flag);
	//   10   15:iload           4
	//   11   17:aload_0         
	//   12   18:aload_2         
	//   13   19:iload_3         
	//   14   20:aaload          
	//   15   21:invokestatic    #368 <Method GeneratedTableMapper loadTableMapper(Class)>
	//   16   24:iload_1         
	//   17   25:invokestatic    #457 <Method int doDropView(SQLiteDatabase, GeneratedTableMapper, boolean)>
	//   18   28:iadd            
	//   19   29:istore          4

	//   20   31:iload_3         
	//   21   32:iconst_1        
	//   22   33:iadd            
	//   23   34:istore_3        
	//*  24   35:goto            9
		return j;
	//   25   38:iload           4
	//   26   40:ireturn         
	}

	public static List getCreateTableStatements(SQLiteDatabase sqlitedatabase, Class class1)
		throws SQLException
	{
		return addCreateTableStatements(loadTableMapper(class1), false);
	//    0    0:aload_1         
	//    1    1:invokestatic    #368 <Method GeneratedTableMapper loadTableMapper(Class)>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #461 <Method List addCreateTableStatements(GeneratedTableMapper, boolean)>
	//    4    8:areturn         
	}

	private static GeneratedTableMapper loadTableMapper(Class class1)
	{
		return SqueakyContext.loadGeneratedTableMapper(class1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #467 <Method GeneratedTableMapper SqueakyContext.loadGeneratedTableMapper(Class)>
	//    2    4:areturn         
	}

	public static final String TAG = ((Class) (co/touchlab/squeaky/table/TableUtils)).getSimpleName();

	static 
	{
	//    0    0:ldc1            #2   <Class TableUtils>
	//    1    2:invokevirtual   #16  <Method String Class.getSimpleName()>
	//    2    5:putstatic       #18  <Field String TAG>
	//*   3    8:return          
	}
}
