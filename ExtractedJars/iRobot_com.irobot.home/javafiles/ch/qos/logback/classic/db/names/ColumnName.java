// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.db.names;


public final class ColumnName extends Enum
{

	private ColumnName(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #94  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static ColumnName valueOf(String s)
	{
		return (ColumnName)Enum.valueOf(ch/qos/logback/classic/db/names/ColumnName, s);
	//    0    0:ldc1            #2   <Class ColumnName>
	//    1    2:aload_0         
	//    2    3:invokestatic    #100 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ColumnName>
	//    4    9:areturn         
	}

	public static ColumnName[] values()
	{
		return (ColumnName[])((ColumnName []) ($VALUES)).clone();
	//    0    0:getstatic       #92  <Field ColumnName[] $VALUES>
	//    1    3:invokevirtual   #107 <Method Object _5B_Lch.qos.logback.classic.db.names.ColumnName_3B_.clone()>
	//    2    6:checkcast       #103 <Class ColumnName[]>
	//    3    9:areturn         
	}

	private static final ColumnName $VALUES[];
	public static final ColumnName ARG0;
	public static final ColumnName ARG1;
	public static final ColumnName ARG2;
	public static final ColumnName ARG3;
	public static final ColumnName CALLER_CLASS;
	public static final ColumnName CALLER_FILENAME;
	public static final ColumnName CALLER_LINE;
	public static final ColumnName CALLER_METHOD;
	public static final ColumnName EVENT_ID;
	public static final ColumnName FORMATTED_MESSAGE;
	public static final ColumnName I;
	public static final ColumnName LEVEL_STRING;
	public static final ColumnName LOGGER_NAME;
	public static final ColumnName MAPPED_KEY;
	public static final ColumnName MAPPED_VALUE;
	public static final ColumnName REFERENCE_FLAG;
	public static final ColumnName THREAD_NAME;
	public static final ColumnName TIMESTMP;
	public static final ColumnName TRACE_LINE;

	static 
	{
		EVENT_ID = new ColumnName("EVENT_ID", 0);
	//    0    0:new             #2   <Class ColumnName>
	//    1    3:dup             
	//    2    4:ldc1            #30  <String "EVENT_ID">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #34  <Method void ColumnName(String, int)>
	//    5   10:putstatic       #36  <Field ColumnName EVENT_ID>
		TIMESTMP = new ColumnName("TIMESTMP", 1);
	//    6   13:new             #2   <Class ColumnName>
	//    7   16:dup             
	//    8   17:ldc1            #37  <String "TIMESTMP">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #34  <Method void ColumnName(String, int)>
	//   11   23:putstatic       #39  <Field ColumnName TIMESTMP>
		FORMATTED_MESSAGE = new ColumnName("FORMATTED_MESSAGE", 2);
	//   12   26:new             #2   <Class ColumnName>
	//   13   29:dup             
	//   14   30:ldc1            #40  <String "FORMATTED_MESSAGE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #34  <Method void ColumnName(String, int)>
	//   17   36:putstatic       #42  <Field ColumnName FORMATTED_MESSAGE>
		LOGGER_NAME = new ColumnName("LOGGER_NAME", 3);
	//   18   39:new             #2   <Class ColumnName>
	//   19   42:dup             
	//   20   43:ldc1            #43  <String "LOGGER_NAME">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #34  <Method void ColumnName(String, int)>
	//   23   49:putstatic       #45  <Field ColumnName LOGGER_NAME>
		LEVEL_STRING = new ColumnName("LEVEL_STRING", 4);
	//   24   52:new             #2   <Class ColumnName>
	//   25   55:dup             
	//   26   56:ldc1            #46  <String "LEVEL_STRING">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #34  <Method void ColumnName(String, int)>
	//   29   62:putstatic       #48  <Field ColumnName LEVEL_STRING>
		THREAD_NAME = new ColumnName("THREAD_NAME", 5);
	//   30   65:new             #2   <Class ColumnName>
	//   31   68:dup             
	//   32   69:ldc1            #49  <String "THREAD_NAME">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #34  <Method void ColumnName(String, int)>
	//   35   75:putstatic       #51  <Field ColumnName THREAD_NAME>
		REFERENCE_FLAG = new ColumnName("REFERENCE_FLAG", 6);
	//   36   78:new             #2   <Class ColumnName>
	//   37   81:dup             
	//   38   82:ldc1            #52  <String "REFERENCE_FLAG">
	//   39   84:bipush          6
	//   40   86:invokespecial   #34  <Method void ColumnName(String, int)>
	//   41   89:putstatic       #54  <Field ColumnName REFERENCE_FLAG>
		ARG0 = new ColumnName("ARG0", 7);
	//   42   92:new             #2   <Class ColumnName>
	//   43   95:dup             
	//   44   96:ldc1            #55  <String "ARG0">
	//   45   98:bipush          7
	//   46  100:invokespecial   #34  <Method void ColumnName(String, int)>
	//   47  103:putstatic       #57  <Field ColumnName ARG0>
		ARG1 = new ColumnName("ARG1", 8);
	//   48  106:new             #2   <Class ColumnName>
	//   49  109:dup             
	//   50  110:ldc1            #58  <String "ARG1">
	//   51  112:bipush          8
	//   52  114:invokespecial   #34  <Method void ColumnName(String, int)>
	//   53  117:putstatic       #60  <Field ColumnName ARG1>
		ARG2 = new ColumnName("ARG2", 9);
	//   54  120:new             #2   <Class ColumnName>
	//   55  123:dup             
	//   56  124:ldc1            #61  <String "ARG2">
	//   57  126:bipush          9
	//   58  128:invokespecial   #34  <Method void ColumnName(String, int)>
	//   59  131:putstatic       #63  <Field ColumnName ARG2>
		ARG3 = new ColumnName("ARG3", 10);
	//   60  134:new             #2   <Class ColumnName>
	//   61  137:dup             
	//   62  138:ldc1            #64  <String "ARG3">
	//   63  140:bipush          10
	//   64  142:invokespecial   #34  <Method void ColumnName(String, int)>
	//   65  145:putstatic       #66  <Field ColumnName ARG3>
		CALLER_FILENAME = new ColumnName("CALLER_FILENAME", 11);
	//   66  148:new             #2   <Class ColumnName>
	//   67  151:dup             
	//   68  152:ldc1            #67  <String "CALLER_FILENAME">
	//   69  154:bipush          11
	//   70  156:invokespecial   #34  <Method void ColumnName(String, int)>
	//   71  159:putstatic       #69  <Field ColumnName CALLER_FILENAME>
		CALLER_CLASS = new ColumnName("CALLER_CLASS", 12);
	//   72  162:new             #2   <Class ColumnName>
	//   73  165:dup             
	//   74  166:ldc1            #70  <String "CALLER_CLASS">
	//   75  168:bipush          12
	//   76  170:invokespecial   #34  <Method void ColumnName(String, int)>
	//   77  173:putstatic       #72  <Field ColumnName CALLER_CLASS>
		CALLER_METHOD = new ColumnName("CALLER_METHOD", 13);
	//   78  176:new             #2   <Class ColumnName>
	//   79  179:dup             
	//   80  180:ldc1            #73  <String "CALLER_METHOD">
	//   81  182:bipush          13
	//   82  184:invokespecial   #34  <Method void ColumnName(String, int)>
	//   83  187:putstatic       #75  <Field ColumnName CALLER_METHOD>
		CALLER_LINE = new ColumnName("CALLER_LINE", 14);
	//   84  190:new             #2   <Class ColumnName>
	//   85  193:dup             
	//   86  194:ldc1            #76  <String "CALLER_LINE">
	//   87  196:bipush          14
	//   88  198:invokespecial   #34  <Method void ColumnName(String, int)>
	//   89  201:putstatic       #78  <Field ColumnName CALLER_LINE>
		MAPPED_KEY = new ColumnName("MAPPED_KEY", 15);
	//   90  204:new             #2   <Class ColumnName>
	//   91  207:dup             
	//   92  208:ldc1            #79  <String "MAPPED_KEY">
	//   93  210:bipush          15
	//   94  212:invokespecial   #34  <Method void ColumnName(String, int)>
	//   95  215:putstatic       #81  <Field ColumnName MAPPED_KEY>
		MAPPED_VALUE = new ColumnName("MAPPED_VALUE", 16);
	//   96  218:new             #2   <Class ColumnName>
	//   97  221:dup             
	//   98  222:ldc1            #82  <String "MAPPED_VALUE">
	//   99  224:bipush          16
	//  100  226:invokespecial   #34  <Method void ColumnName(String, int)>
	//  101  229:putstatic       #84  <Field ColumnName MAPPED_VALUE>
		I = new ColumnName("I", 17);
	//  102  232:new             #2   <Class ColumnName>
	//  103  235:dup             
	//  104  236:ldc1            #85  <String "I">
	//  105  238:bipush          17
	//  106  240:invokespecial   #34  <Method void ColumnName(String, int)>
	//  107  243:putstatic       #87  <Field ColumnName I>
		TRACE_LINE = new ColumnName("TRACE_LINE", 18);
	//  108  246:new             #2   <Class ColumnName>
	//  109  249:dup             
	//  110  250:ldc1            #88  <String "TRACE_LINE">
	//  111  252:bipush          18
	//  112  254:invokespecial   #34  <Method void ColumnName(String, int)>
	//  113  257:putstatic       #90  <Field ColumnName TRACE_LINE>
		$VALUES = (new ColumnName[] {
			EVENT_ID, TIMESTMP, FORMATTED_MESSAGE, LOGGER_NAME, LEVEL_STRING, THREAD_NAME, REFERENCE_FLAG, ARG0, ARG1, ARG2, 
			ARG3, CALLER_FILENAME, CALLER_CLASS, CALLER_METHOD, CALLER_LINE, MAPPED_KEY, MAPPED_VALUE, I, TRACE_LINE
		});
	//  114  260:bipush          19
	//  115  262:anewarray       ColumnName[]
	//  116  265:dup             
	//  117  266:iconst_0        
	//  118  267:getstatic       #36  <Field ColumnName EVENT_ID>
	//  119  270:aastore         
	//  120  271:dup             
	//  121  272:iconst_1        
	//  122  273:getstatic       #39  <Field ColumnName TIMESTMP>
	//  123  276:aastore         
	//  124  277:dup             
	//  125  278:iconst_2        
	//  126  279:getstatic       #42  <Field ColumnName FORMATTED_MESSAGE>
	//  127  282:aastore         
	//  128  283:dup             
	//  129  284:iconst_3        
	//  130  285:getstatic       #45  <Field ColumnName LOGGER_NAME>
	//  131  288:aastore         
	//  132  289:dup             
	//  133  290:iconst_4        
	//  134  291:getstatic       #48  <Field ColumnName LEVEL_STRING>
	//  135  294:aastore         
	//  136  295:dup             
	//  137  296:iconst_5        
	//  138  297:getstatic       #51  <Field ColumnName THREAD_NAME>
	//  139  300:aastore         
	//  140  301:dup             
	//  141  302:bipush          6
	//  142  304:getstatic       #54  <Field ColumnName REFERENCE_FLAG>
	//  143  307:aastore         
	//  144  308:dup             
	//  145  309:bipush          7
	//  146  311:getstatic       #57  <Field ColumnName ARG0>
	//  147  314:aastore         
	//  148  315:dup             
	//  149  316:bipush          8
	//  150  318:getstatic       #60  <Field ColumnName ARG1>
	//  151  321:aastore         
	//  152  322:dup             
	//  153  323:bipush          9
	//  154  325:getstatic       #63  <Field ColumnName ARG2>
	//  155  328:aastore         
	//  156  329:dup             
	//  157  330:bipush          10
	//  158  332:getstatic       #66  <Field ColumnName ARG3>
	//  159  335:aastore         
	//  160  336:dup             
	//  161  337:bipush          11
	//  162  339:getstatic       #69  <Field ColumnName CALLER_FILENAME>
	//  163  342:aastore         
	//  164  343:dup             
	//  165  344:bipush          12
	//  166  346:getstatic       #72  <Field ColumnName CALLER_CLASS>
	//  167  349:aastore         
	//  168  350:dup             
	//  169  351:bipush          13
	//  170  353:getstatic       #75  <Field ColumnName CALLER_METHOD>
	//  171  356:aastore         
	//  172  357:dup             
	//  173  358:bipush          14
	//  174  360:getstatic       #78  <Field ColumnName CALLER_LINE>
	//  175  363:aastore         
	//  176  364:dup             
	//  177  365:bipush          15
	//  178  367:getstatic       #81  <Field ColumnName MAPPED_KEY>
	//  179  370:aastore         
	//  180  371:dup             
	//  181  372:bipush          16
	//  182  374:getstatic       #84  <Field ColumnName MAPPED_VALUE>
	//  183  377:aastore         
	//  184  378:dup             
	//  185  379:bipush          17
	//  186  381:getstatic       #87  <Field ColumnName I>
	//  187  384:aastore         
	//  188  385:dup             
	//  189  386:bipush          18
	//  190  388:getstatic       #90  <Field ColumnName TRACE_LINE>
	//  191  391:aastore         
	//  192  392:putstatic       #92  <Field ColumnName[] $VALUES>
	//* 193  395:return          
	}
}
