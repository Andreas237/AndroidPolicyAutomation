// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.db;

import ch.qos.logback.classic.db.names.ColumnName;
import ch.qos.logback.classic.db.names.DBNameResolver;
import ch.qos.logback.classic.db.names.TableName;

public class SQLBuilder
{

	public SQLBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String buildCreateExceptionTableSQL(DBNameResolver dbnameresolver)
	{
		StringBuilder stringbuilder = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
	//    0    0:new             #13  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #15  <String "CREATE TABLE IF NOT EXISTS ">
	//    3    6:invokespecial   #18  <Method void StringBuilder(String)>
	//    4    9:astore_1        
		stringbuilder.append(dbnameresolver.getTableName(((Enum) (TableName.LOGGING_EVENT_EXCEPTION))));
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:getstatic       #24  <Field TableName TableName.LOGGING_EVENT_EXCEPTION>
	//    8   15:invokeinterface #30  <Method String DBNameResolver.getTableName(Enum)>
	//    9   20:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:pop             
		stringbuilder.append(" (");
	//   11   24:aload_1         
	//   12   25:ldc1            #36  <String " (">
	//   13   27:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.EVENT_ID))));
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getstatic       #42  <Field ColumnName ColumnName.EVENT_ID>
	//   18   36:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   19   41:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   20   44:pop             
		stringbuilder.append(" BIGINT NOT NULL, ");
	//   21   45:aload_1         
	//   22   46:ldc1            #47  <String " BIGINT NOT NULL, ">
	//   23   48:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   24   51:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.I))));
	//   25   52:aload_1         
	//   26   53:aload_0         
	//   27   54:getstatic       #50  <Field ColumnName ColumnName.I>
	//   28   57:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   29   62:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   30   65:pop             
		stringbuilder.append(" SMALLINT NOT NULL, ");
	//   31   66:aload_1         
	//   32   67:ldc1            #52  <String " SMALLINT NOT NULL, ">
	//   33   69:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   34   72:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.TRACE_LINE))));
	//   35   73:aload_1         
	//   36   74:aload_0         
	//   37   75:getstatic       #55  <Field ColumnName ColumnName.TRACE_LINE>
	//   38   78:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   39   83:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   40   86:pop             
		stringbuilder.append(" VARCHAR(254) NOT NULL, ");
	//   41   87:aload_1         
	//   42   88:ldc1            #57  <String " VARCHAR(254) NOT NULL, ">
	//   43   90:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   44   93:pop             
		stringbuilder.append("PRIMARY KEY (");
	//   45   94:aload_1         
	//   46   95:ldc1            #59  <String "PRIMARY KEY (">
	//   47   97:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   48  100:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.EVENT_ID))));
	//   49  101:aload_1         
	//   50  102:aload_0         
	//   51  103:getstatic       #42  <Field ColumnName ColumnName.EVENT_ID>
	//   52  106:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   53  111:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   54  114:pop             
		stringbuilder.append(", ");
	//   55  115:aload_1         
	//   56  116:ldc1            #61  <String ", ">
	//   57  118:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   58  121:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.I))));
	//   59  122:aload_1         
	//   60  123:aload_0         
	//   61  124:getstatic       #50  <Field ColumnName ColumnName.I>
	//   62  127:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   63  132:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   64  135:pop             
		stringbuilder.append("), ");
	//   65  136:aload_1         
	//   66  137:ldc1            #63  <String "), ">
	//   67  139:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   68  142:pop             
		stringbuilder.append("FOREIGN KEY (");
	//   69  143:aload_1         
	//   70  144:ldc1            #65  <String "FOREIGN KEY (">
	//   71  146:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   72  149:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.EVENT_ID))));
	//   73  150:aload_1         
	//   74  151:aload_0         
	//   75  152:getstatic       #42  <Field ColumnName ColumnName.EVENT_ID>
	//   76  155:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   77  160:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   78  163:pop             
		stringbuilder.append(") ");
	//   79  164:aload_1         
	//   80  165:ldc1            #67  <String ") ">
	//   81  167:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   82  170:pop             
		stringbuilder.append("REFERENCES ");
	//   83  171:aload_1         
	//   84  172:ldc1            #69  <String "REFERENCES ">
	//   85  174:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   86  177:pop             
		stringbuilder.append(dbnameresolver.getTableName(((Enum) (TableName.LOGGING_EVENT))));
	//   87  178:aload_1         
	//   88  179:aload_0         
	//   89  180:getstatic       #72  <Field TableName TableName.LOGGING_EVENT>
	//   90  183:invokeinterface #30  <Method String DBNameResolver.getTableName(Enum)>
	//   91  188:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   92  191:pop             
		stringbuilder.append(" (");
	//   93  192:aload_1         
	//   94  193:ldc1            #36  <String " (">
	//   95  195:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   96  198:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.EVENT_ID))));
	//   97  199:aload_1         
	//   98  200:aload_0         
	//   99  201:getstatic       #42  <Field ColumnName ColumnName.EVENT_ID>
	//  100  204:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//  101  209:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  102  212:pop             
		stringbuilder.append(") ");
	//  103  213:aload_1         
	//  104  214:ldc1            #67  <String ") ">
	//  105  216:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  106  219:pop             
		stringbuilder.append(")");
	//  107  220:aload_1         
	//  108  221:ldc1            #74  <String ")">
	//  109  223:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  110  226:pop             
		return stringbuilder.toString();
	//  111  227:aload_1         
	//  112  228:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  113  231:areturn         
	}

	public static String buildCreateLoggingEventTableSQL(DBNameResolver dbnameresolver)
	{
		StringBuilder stringbuilder = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
	//    0    0:new             #13  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #15  <String "CREATE TABLE IF NOT EXISTS ">
	//    3    6:invokespecial   #18  <Method void StringBuilder(String)>
	//    4    9:astore_1        
		stringbuilder.append(dbnameresolver.getTableName(((Enum) (TableName.LOGGING_EVENT))));
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:getstatic       #72  <Field TableName TableName.LOGGING_EVENT>
	//    8   15:invokeinterface #30  <Method String DBNameResolver.getTableName(Enum)>
	//    9   20:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:pop             
		stringbuilder.append(" (");
	//   11   24:aload_1         
	//   12   25:ldc1            #36  <String " (">
	//   13   27:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.TIMESTMP))));
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getstatic       #82  <Field ColumnName ColumnName.TIMESTMP>
	//   18   36:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   19   41:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   20   44:pop             
		stringbuilder.append(" BIGINT NOT NULL, ");
	//   21   45:aload_1         
	//   22   46:ldc1            #47  <String " BIGINT NOT NULL, ">
	//   23   48:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   24   51:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.FORMATTED_MESSAGE))));
	//   25   52:aload_1         
	//   26   53:aload_0         
	//   27   54:getstatic       #85  <Field ColumnName ColumnName.FORMATTED_MESSAGE>
	//   28   57:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   29   62:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   30   65:pop             
		stringbuilder.append(" TEXT NOT NULL, ");
	//   31   66:aload_1         
	//   32   67:ldc1            #87  <String " TEXT NOT NULL, ">
	//   33   69:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   34   72:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.LOGGER_NAME))));
	//   35   73:aload_1         
	//   36   74:aload_0         
	//   37   75:getstatic       #90  <Field ColumnName ColumnName.LOGGER_NAME>
	//   38   78:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   39   83:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   40   86:pop             
		stringbuilder.append(" VARCHAR(254) NOT NULL, ");
	//   41   87:aload_1         
	//   42   88:ldc1            #57  <String " VARCHAR(254) NOT NULL, ">
	//   43   90:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   44   93:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.LEVEL_STRING))));
	//   45   94:aload_1         
	//   46   95:aload_0         
	//   47   96:getstatic       #93  <Field ColumnName ColumnName.LEVEL_STRING>
	//   48   99:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   49  104:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   50  107:pop             
		stringbuilder.append(" VARCHAR(254) NOT NULL, ");
	//   51  108:aload_1         
	//   52  109:ldc1            #57  <String " VARCHAR(254) NOT NULL, ">
	//   53  111:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   54  114:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.THREAD_NAME))));
	//   55  115:aload_1         
	//   56  116:aload_0         
	//   57  117:getstatic       #96  <Field ColumnName ColumnName.THREAD_NAME>
	//   58  120:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   59  125:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   60  128:pop             
		stringbuilder.append(" VARCHAR(254), ");
	//   61  129:aload_1         
	//   62  130:ldc1            #98  <String " VARCHAR(254), ">
	//   63  132:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   64  135:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.REFERENCE_FLAG))));
	//   65  136:aload_1         
	//   66  137:aload_0         
	//   67  138:getstatic       #101 <Field ColumnName ColumnName.REFERENCE_FLAG>
	//   68  141:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   69  146:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   70  149:pop             
		stringbuilder.append(" SMALLINT, ");
	//   71  150:aload_1         
	//   72  151:ldc1            #103 <String " SMALLINT, ">
	//   73  153:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   74  156:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.ARG0))));
	//   75  157:aload_1         
	//   76  158:aload_0         
	//   77  159:getstatic       #106 <Field ColumnName ColumnName.ARG0>
	//   78  162:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   79  167:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   80  170:pop             
		stringbuilder.append(" VARCHAR(254), ");
	//   81  171:aload_1         
	//   82  172:ldc1            #98  <String " VARCHAR(254), ">
	//   83  174:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   84  177:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.ARG1))));
	//   85  178:aload_1         
	//   86  179:aload_0         
	//   87  180:getstatic       #109 <Field ColumnName ColumnName.ARG1>
	//   88  183:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   89  188:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   90  191:pop             
		stringbuilder.append(" VARCHAR(254), ");
	//   91  192:aload_1         
	//   92  193:ldc1            #98  <String " VARCHAR(254), ">
	//   93  195:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   94  198:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.ARG2))));
	//   95  199:aload_1         
	//   96  200:aload_0         
	//   97  201:getstatic       #112 <Field ColumnName ColumnName.ARG2>
	//   98  204:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   99  209:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  100  212:pop             
		stringbuilder.append(" VARCHAR(254), ");
	//  101  213:aload_1         
	//  102  214:ldc1            #98  <String " VARCHAR(254), ">
	//  103  216:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  104  219:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.ARG3))));
	//  105  220:aload_1         
	//  106  221:aload_0         
	//  107  222:getstatic       #115 <Field ColumnName ColumnName.ARG3>
	//  108  225:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//  109  230:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  110  233:pop             
		stringbuilder.append(" VARCHAR(254), ");
	//  111  234:aload_1         
	//  112  235:ldc1            #98  <String " VARCHAR(254), ">
	//  113  237:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  114  240:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.CALLER_FILENAME))));
	//  115  241:aload_1         
	//  116  242:aload_0         
	//  117  243:getstatic       #118 <Field ColumnName ColumnName.CALLER_FILENAME>
	//  118  246:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//  119  251:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  120  254:pop             
		stringbuilder.append(" VARCHAR(254), ");
	//  121  255:aload_1         
	//  122  256:ldc1            #98  <String " VARCHAR(254), ">
	//  123  258:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  124  261:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.CALLER_CLASS))));
	//  125  262:aload_1         
	//  126  263:aload_0         
	//  127  264:getstatic       #121 <Field ColumnName ColumnName.CALLER_CLASS>
	//  128  267:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//  129  272:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  130  275:pop             
		stringbuilder.append(" VARCHAR(254), ");
	//  131  276:aload_1         
	//  132  277:ldc1            #98  <String " VARCHAR(254), ">
	//  133  279:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  134  282:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.CALLER_METHOD))));
	//  135  283:aload_1         
	//  136  284:aload_0         
	//  137  285:getstatic       #124 <Field ColumnName ColumnName.CALLER_METHOD>
	//  138  288:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//  139  293:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  140  296:pop             
		stringbuilder.append(" VARCHAR(254), ");
	//  141  297:aload_1         
	//  142  298:ldc1            #98  <String " VARCHAR(254), ">
	//  143  300:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  144  303:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.CALLER_LINE))));
	//  145  304:aload_1         
	//  146  305:aload_0         
	//  147  306:getstatic       #127 <Field ColumnName ColumnName.CALLER_LINE>
	//  148  309:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//  149  314:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  150  317:pop             
		stringbuilder.append(" CHAR(4), ");
	//  151  318:aload_1         
	//  152  319:ldc1            #129 <String " CHAR(4), ">
	//  153  321:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  154  324:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.EVENT_ID))));
	//  155  325:aload_1         
	//  156  326:aload_0         
	//  157  327:getstatic       #42  <Field ColumnName ColumnName.EVENT_ID>
	//  158  330:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//  159  335:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  160  338:pop             
		stringbuilder.append(" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT");
	//  161  339:aload_1         
	//  162  340:ldc1            #131 <String " INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT">
	//  163  342:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  164  345:pop             
		stringbuilder.append(")");
	//  165  346:aload_1         
	//  166  347:ldc1            #74  <String ")">
	//  167  349:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  168  352:pop             
		return stringbuilder.toString();
	//  169  353:aload_1         
	//  170  354:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  171  357:areturn         
	}

	public static String buildCreatePropertyTableSQL(DBNameResolver dbnameresolver)
	{
		StringBuilder stringbuilder = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
	//    0    0:new             #13  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #15  <String "CREATE TABLE IF NOT EXISTS ">
	//    3    6:invokespecial   #18  <Method void StringBuilder(String)>
	//    4    9:astore_1        
		stringbuilder.append(dbnameresolver.getTableName(((Enum) (TableName.LOGGING_EVENT_PROPERTY))));
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:getstatic       #135 <Field TableName TableName.LOGGING_EVENT_PROPERTY>
	//    8   15:invokeinterface #30  <Method String DBNameResolver.getTableName(Enum)>
	//    9   20:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:pop             
		stringbuilder.append(" (");
	//   11   24:aload_1         
	//   12   25:ldc1            #36  <String " (">
	//   13   27:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.EVENT_ID))));
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getstatic       #42  <Field ColumnName ColumnName.EVENT_ID>
	//   18   36:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   19   41:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   20   44:pop             
		stringbuilder.append(" BIGINT NOT NULL, ");
	//   21   45:aload_1         
	//   22   46:ldc1            #47  <String " BIGINT NOT NULL, ">
	//   23   48:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   24   51:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.MAPPED_KEY))));
	//   25   52:aload_1         
	//   26   53:aload_0         
	//   27   54:getstatic       #138 <Field ColumnName ColumnName.MAPPED_KEY>
	//   28   57:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   29   62:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   30   65:pop             
		stringbuilder.append(" VARCHAR(254) NOT NULL, ");
	//   31   66:aload_1         
	//   32   67:ldc1            #57  <String " VARCHAR(254) NOT NULL, ">
	//   33   69:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   34   72:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.MAPPED_VALUE))));
	//   35   73:aload_1         
	//   36   74:aload_0         
	//   37   75:getstatic       #141 <Field ColumnName ColumnName.MAPPED_VALUE>
	//   38   78:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   39   83:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   40   86:pop             
		stringbuilder.append(" VARCHAR(254) NOT NULL, ");
	//   41   87:aload_1         
	//   42   88:ldc1            #57  <String " VARCHAR(254) NOT NULL, ">
	//   43   90:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   44   93:pop             
		stringbuilder.append("PRIMARY KEY (");
	//   45   94:aload_1         
	//   46   95:ldc1            #59  <String "PRIMARY KEY (">
	//   47   97:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   48  100:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.EVENT_ID))));
	//   49  101:aload_1         
	//   50  102:aload_0         
	//   51  103:getstatic       #42  <Field ColumnName ColumnName.EVENT_ID>
	//   52  106:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   53  111:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   54  114:pop             
		stringbuilder.append(", ");
	//   55  115:aload_1         
	//   56  116:ldc1            #61  <String ", ">
	//   57  118:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   58  121:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.MAPPED_KEY))));
	//   59  122:aload_1         
	//   60  123:aload_0         
	//   61  124:getstatic       #138 <Field ColumnName ColumnName.MAPPED_KEY>
	//   62  127:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   63  132:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   64  135:pop             
		stringbuilder.append("), ");
	//   65  136:aload_1         
	//   66  137:ldc1            #63  <String "), ">
	//   67  139:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   68  142:pop             
		stringbuilder.append("FOREIGN KEY (");
	//   69  143:aload_1         
	//   70  144:ldc1            #65  <String "FOREIGN KEY (">
	//   71  146:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   72  149:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.EVENT_ID))));
	//   73  150:aload_1         
	//   74  151:aload_0         
	//   75  152:getstatic       #42  <Field ColumnName ColumnName.EVENT_ID>
	//   76  155:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   77  160:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   78  163:pop             
		stringbuilder.append(") ");
	//   79  164:aload_1         
	//   80  165:ldc1            #67  <String ") ">
	//   81  167:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   82  170:pop             
		stringbuilder.append("REFERENCES ");
	//   83  171:aload_1         
	//   84  172:ldc1            #69  <String "REFERENCES ">
	//   85  174:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   86  177:pop             
		stringbuilder.append(dbnameresolver.getTableName(((Enum) (TableName.LOGGING_EVENT))));
	//   87  178:aload_1         
	//   88  179:aload_0         
	//   89  180:getstatic       #72  <Field TableName TableName.LOGGING_EVENT>
	//   90  183:invokeinterface #30  <Method String DBNameResolver.getTableName(Enum)>
	//   91  188:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   92  191:pop             
		stringbuilder.append(" (");
	//   93  192:aload_1         
	//   94  193:ldc1            #36  <String " (">
	//   95  195:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   96  198:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.EVENT_ID))));
	//   97  199:aload_1         
	//   98  200:aload_0         
	//   99  201:getstatic       #42  <Field ColumnName ColumnName.EVENT_ID>
	//  100  204:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//  101  209:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  102  212:pop             
		stringbuilder.append(") ");
	//  103  213:aload_1         
	//  104  214:ldc1            #67  <String ") ">
	//  105  216:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  106  219:pop             
		stringbuilder.append(")");
	//  107  220:aload_1         
	//  108  221:ldc1            #74  <String ")">
	//  109  223:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  110  226:pop             
		return stringbuilder.toString();
	//  111  227:aload_1         
	//  112  228:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  113  231:areturn         
	}

	public static String buildDeleteExpiredLogsSQL(DBNameResolver dbnameresolver, long l)
	{
		StringBuilder stringbuilder = new StringBuilder("DELETE FROM ");
	//    0    0:new             #13  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #145 <String "DELETE FROM ">
	//    3    6:invokespecial   #18  <Method void StringBuilder(String)>
	//    4    9:astore_3        
		stringbuilder.append(dbnameresolver.getTableName(((Enum) (TableName.LOGGING_EVENT))));
	//    5   10:aload_3         
	//    6   11:aload_0         
	//    7   12:getstatic       #72  <Field TableName TableName.LOGGING_EVENT>
	//    8   15:invokeinterface #30  <Method String DBNameResolver.getTableName(Enum)>
	//    9   20:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:pop             
		stringbuilder.append(" WHERE ");
	//   11   24:aload_3         
	//   12   25:ldc1            #147 <String " WHERE ">
	//   13   27:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.TIMESTMP))));
	//   15   31:aload_3         
	//   16   32:aload_0         
	//   17   33:getstatic       #82  <Field ColumnName ColumnName.TIMESTMP>
	//   18   36:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   19   41:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   20   44:pop             
		stringbuilder.append(" <= ");
	//   21   45:aload_3         
	//   22   46:ldc1            #149 <String " <= ">
	//   23   48:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   24   51:pop             
		stringbuilder.append(l);
	//   25   52:aload_3         
	//   26   53:lload_1         
	//   27   54:invokevirtual   #152 <Method StringBuilder StringBuilder.append(long)>
	//   28   57:pop             
		stringbuilder.append(";");
	//   29   58:aload_3         
	//   30   59:ldc1            #154 <String ";">
	//   31   61:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   32   64:pop             
		return stringbuilder.toString();
	//   33   65:aload_3         
	//   34   66:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   35   69:areturn         
	}

	public static String buildInsertExceptionSQL(DBNameResolver dbnameresolver)
	{
		StringBuilder stringbuilder = new StringBuilder("INSERT INTO ");
	//    0    0:new             #13  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #157 <String "INSERT INTO ">
	//    3    6:invokespecial   #18  <Method void StringBuilder(String)>
	//    4    9:astore_1        
		stringbuilder.append(dbnameresolver.getTableName(((Enum) (TableName.LOGGING_EVENT_EXCEPTION))));
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:getstatic       #24  <Field TableName TableName.LOGGING_EVENT_EXCEPTION>
	//    8   15:invokeinterface #30  <Method String DBNameResolver.getTableName(Enum)>
	//    9   20:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:pop             
		stringbuilder.append(" (");
	//   11   24:aload_1         
	//   12   25:ldc1            #36  <String " (">
	//   13   27:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.EVENT_ID))));
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getstatic       #42  <Field ColumnName ColumnName.EVENT_ID>
	//   18   36:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   19   41:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   20   44:pop             
		stringbuilder.append(", ");
	//   21   45:aload_1         
	//   22   46:ldc1            #61  <String ", ">
	//   23   48:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   24   51:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.I))));
	//   25   52:aload_1         
	//   26   53:aload_0         
	//   27   54:getstatic       #50  <Field ColumnName ColumnName.I>
	//   28   57:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   29   62:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   30   65:pop             
		stringbuilder.append(", ");
	//   31   66:aload_1         
	//   32   67:ldc1            #61  <String ", ">
	//   33   69:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   34   72:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.TRACE_LINE))));
	//   35   73:aload_1         
	//   36   74:aload_0         
	//   37   75:getstatic       #55  <Field ColumnName ColumnName.TRACE_LINE>
	//   38   78:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   39   83:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   40   86:pop             
		stringbuilder.append(") ");
	//   41   87:aload_1         
	//   42   88:ldc1            #67  <String ") ">
	//   43   90:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   44   93:pop             
		stringbuilder.append("VALUES (?, ?, ?)");
	//   45   94:aload_1         
	//   46   95:ldc1            #159 <String "VALUES (?, ?, ?)">
	//   47   97:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   48  100:pop             
		return stringbuilder.toString();
	//   49  101:aload_1         
	//   50  102:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   51  105:areturn         
	}

	public static String buildInsertPropertiesSQL(DBNameResolver dbnameresolver)
	{
		StringBuilder stringbuilder = new StringBuilder("INSERT INTO ");
	//    0    0:new             #13  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #157 <String "INSERT INTO ">
	//    3    6:invokespecial   #18  <Method void StringBuilder(String)>
	//    4    9:astore_1        
		stringbuilder.append(dbnameresolver.getTableName(((Enum) (TableName.LOGGING_EVENT_PROPERTY))));
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:getstatic       #135 <Field TableName TableName.LOGGING_EVENT_PROPERTY>
	//    8   15:invokeinterface #30  <Method String DBNameResolver.getTableName(Enum)>
	//    9   20:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:pop             
		stringbuilder.append(" (");
	//   11   24:aload_1         
	//   12   25:ldc1            #36  <String " (">
	//   13   27:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.EVENT_ID))));
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getstatic       #42  <Field ColumnName ColumnName.EVENT_ID>
	//   18   36:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   19   41:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   20   44:pop             
		stringbuilder.append(", ");
	//   21   45:aload_1         
	//   22   46:ldc1            #61  <String ", ">
	//   23   48:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   24   51:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.MAPPED_KEY))));
	//   25   52:aload_1         
	//   26   53:aload_0         
	//   27   54:getstatic       #138 <Field ColumnName ColumnName.MAPPED_KEY>
	//   28   57:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   29   62:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   30   65:pop             
		stringbuilder.append(", ");
	//   31   66:aload_1         
	//   32   67:ldc1            #61  <String ", ">
	//   33   69:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   34   72:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.MAPPED_VALUE))));
	//   35   73:aload_1         
	//   36   74:aload_0         
	//   37   75:getstatic       #141 <Field ColumnName ColumnName.MAPPED_VALUE>
	//   38   78:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   39   83:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   40   86:pop             
		stringbuilder.append(") ");
	//   41   87:aload_1         
	//   42   88:ldc1            #67  <String ") ">
	//   43   90:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   44   93:pop             
		stringbuilder.append("VALUES (?, ?, ?)");
	//   45   94:aload_1         
	//   46   95:ldc1            #159 <String "VALUES (?, ?, ?)">
	//   47   97:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   48  100:pop             
		return stringbuilder.toString();
	//   49  101:aload_1         
	//   50  102:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   51  105:areturn         
	}

	public static String buildInsertSQL(DBNameResolver dbnameresolver)
	{
		StringBuilder stringbuilder = new StringBuilder("INSERT INTO ");
	//    0    0:new             #13  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #157 <String "INSERT INTO ">
	//    3    6:invokespecial   #18  <Method void StringBuilder(String)>
	//    4    9:astore_1        
		stringbuilder.append(dbnameresolver.getTableName(((Enum) (TableName.LOGGING_EVENT))));
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:getstatic       #72  <Field TableName TableName.LOGGING_EVENT>
	//    8   15:invokeinterface #30  <Method String DBNameResolver.getTableName(Enum)>
	//    9   20:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:pop             
		stringbuilder.append(" (");
	//   11   24:aload_1         
	//   12   25:ldc1            #36  <String " (">
	//   13   27:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.TIMESTMP))));
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getstatic       #82  <Field ColumnName ColumnName.TIMESTMP>
	//   18   36:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   19   41:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   20   44:pop             
		stringbuilder.append(", ");
	//   21   45:aload_1         
	//   22   46:ldc1            #61  <String ", ">
	//   23   48:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   24   51:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.FORMATTED_MESSAGE))));
	//   25   52:aload_1         
	//   26   53:aload_0         
	//   27   54:getstatic       #85  <Field ColumnName ColumnName.FORMATTED_MESSAGE>
	//   28   57:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   29   62:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   30   65:pop             
		stringbuilder.append(", ");
	//   31   66:aload_1         
	//   32   67:ldc1            #61  <String ", ">
	//   33   69:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   34   72:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.LOGGER_NAME))));
	//   35   73:aload_1         
	//   36   74:aload_0         
	//   37   75:getstatic       #90  <Field ColumnName ColumnName.LOGGER_NAME>
	//   38   78:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   39   83:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   40   86:pop             
		stringbuilder.append(", ");
	//   41   87:aload_1         
	//   42   88:ldc1            #61  <String ", ">
	//   43   90:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   44   93:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.LEVEL_STRING))));
	//   45   94:aload_1         
	//   46   95:aload_0         
	//   47   96:getstatic       #93  <Field ColumnName ColumnName.LEVEL_STRING>
	//   48   99:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   49  104:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   50  107:pop             
		stringbuilder.append(", ");
	//   51  108:aload_1         
	//   52  109:ldc1            #61  <String ", ">
	//   53  111:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   54  114:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.THREAD_NAME))));
	//   55  115:aload_1         
	//   56  116:aload_0         
	//   57  117:getstatic       #96  <Field ColumnName ColumnName.THREAD_NAME>
	//   58  120:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   59  125:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   60  128:pop             
		stringbuilder.append(", ");
	//   61  129:aload_1         
	//   62  130:ldc1            #61  <String ", ">
	//   63  132:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   64  135:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.REFERENCE_FLAG))));
	//   65  136:aload_1         
	//   66  137:aload_0         
	//   67  138:getstatic       #101 <Field ColumnName ColumnName.REFERENCE_FLAG>
	//   68  141:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   69  146:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   70  149:pop             
		stringbuilder.append(", ");
	//   71  150:aload_1         
	//   72  151:ldc1            #61  <String ", ">
	//   73  153:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   74  156:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.ARG0))));
	//   75  157:aload_1         
	//   76  158:aload_0         
	//   77  159:getstatic       #106 <Field ColumnName ColumnName.ARG0>
	//   78  162:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   79  167:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   80  170:pop             
		stringbuilder.append(", ");
	//   81  171:aload_1         
	//   82  172:ldc1            #61  <String ", ">
	//   83  174:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   84  177:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.ARG1))));
	//   85  178:aload_1         
	//   86  179:aload_0         
	//   87  180:getstatic       #109 <Field ColumnName ColumnName.ARG1>
	//   88  183:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   89  188:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   90  191:pop             
		stringbuilder.append(", ");
	//   91  192:aload_1         
	//   92  193:ldc1            #61  <String ", ">
	//   93  195:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   94  198:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.ARG2))));
	//   95  199:aload_1         
	//   96  200:aload_0         
	//   97  201:getstatic       #112 <Field ColumnName ColumnName.ARG2>
	//   98  204:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//   99  209:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  100  212:pop             
		stringbuilder.append(", ");
	//  101  213:aload_1         
	//  102  214:ldc1            #61  <String ", ">
	//  103  216:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  104  219:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.ARG3))));
	//  105  220:aload_1         
	//  106  221:aload_0         
	//  107  222:getstatic       #115 <Field ColumnName ColumnName.ARG3>
	//  108  225:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//  109  230:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  110  233:pop             
		stringbuilder.append(", ");
	//  111  234:aload_1         
	//  112  235:ldc1            #61  <String ", ">
	//  113  237:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  114  240:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.CALLER_FILENAME))));
	//  115  241:aload_1         
	//  116  242:aload_0         
	//  117  243:getstatic       #118 <Field ColumnName ColumnName.CALLER_FILENAME>
	//  118  246:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//  119  251:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  120  254:pop             
		stringbuilder.append(", ");
	//  121  255:aload_1         
	//  122  256:ldc1            #61  <String ", ">
	//  123  258:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  124  261:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.CALLER_CLASS))));
	//  125  262:aload_1         
	//  126  263:aload_0         
	//  127  264:getstatic       #121 <Field ColumnName ColumnName.CALLER_CLASS>
	//  128  267:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//  129  272:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  130  275:pop             
		stringbuilder.append(", ");
	//  131  276:aload_1         
	//  132  277:ldc1            #61  <String ", ">
	//  133  279:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  134  282:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.CALLER_METHOD))));
	//  135  283:aload_1         
	//  136  284:aload_0         
	//  137  285:getstatic       #124 <Field ColumnName ColumnName.CALLER_METHOD>
	//  138  288:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//  139  293:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  140  296:pop             
		stringbuilder.append(", ");
	//  141  297:aload_1         
	//  142  298:ldc1            #61  <String ", ">
	//  143  300:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  144  303:pop             
		stringbuilder.append(dbnameresolver.getColumnName(((Enum) (ColumnName.CALLER_LINE))));
	//  145  304:aload_1         
	//  146  305:aload_0         
	//  147  306:getstatic       #127 <Field ColumnName ColumnName.CALLER_LINE>
	//  148  309:invokeinterface #45  <Method String DBNameResolver.getColumnName(Enum)>
	//  149  314:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  150  317:pop             
		stringbuilder.append(") ");
	//  151  318:aload_1         
	//  152  319:ldc1            #67  <String ") ">
	//  153  321:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  154  324:pop             
		stringbuilder.append("VALUES (?, ?, ? ,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
	//  155  325:aload_1         
	//  156  326:ldc1            #163 <String "VALUES (?, ?, ? ,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)">
	//  157  328:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//  158  331:pop             
		return stringbuilder.toString();
	//  159  332:aload_1         
	//  160  333:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  161  336:areturn         
	}
}
