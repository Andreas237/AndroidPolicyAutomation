// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field;


public final class SqlType extends Enum
{

	private SqlType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #86  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static SqlType valueOf(String s)
	{
		return (SqlType)Enum.valueOf(co/touchlab/squeaky/field/SqlType, s);
	//    0    0:ldc1            #2   <Class SqlType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #92  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class SqlType>
	//    4    9:areturn         
	}

	public static SqlType[] values()
	{
		return (SqlType[])((SqlType []) ($VALUES)).clone();
	//    0    0:getstatic       #84  <Field SqlType[] $VALUES>
	//    1    3:invokevirtual   #99  <Method Object _5B_Lco.touchlab.squeaky.field.SqlType_3B_.clone()>
	//    2    6:checkcast       #95  <Class SqlType[]>
	//    3    9:areturn         
	}

	private static final SqlType $VALUES[];
	public static final SqlType BIG_DECIMAL;
	public static final SqlType BLOB;
	public static final SqlType BOOLEAN;
	public static final SqlType BYTE;
	public static final SqlType BYTE_ARRAY;
	public static final SqlType CHAR;
	public static final SqlType DATE;
	public static final SqlType DOUBLE;
	public static final SqlType FLOAT;
	public static final SqlType INTEGER;
	public static final SqlType LONG;
	public static final SqlType LONG_STRING;
	public static final SqlType OTHER;
	public static final SqlType SERIALIZABLE;
	public static final SqlType SHORT;
	public static final SqlType STRING;
	public static final SqlType UNKNOWN;

	static 
	{
		STRING = new SqlType("STRING", 0);
	//    0    0:new             #2   <Class SqlType>
	//    1    3:dup             
	//    2    4:ldc1            #28  <String "STRING">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #32  <Method void SqlType(String, int)>
	//    5   10:putstatic       #34  <Field SqlType STRING>
		LONG_STRING = new SqlType("LONG_STRING", 1);
	//    6   13:new             #2   <Class SqlType>
	//    7   16:dup             
	//    8   17:ldc1            #35  <String "LONG_STRING">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #32  <Method void SqlType(String, int)>
	//   11   23:putstatic       #37  <Field SqlType LONG_STRING>
		DATE = new SqlType("DATE", 2);
	//   12   26:new             #2   <Class SqlType>
	//   13   29:dup             
	//   14   30:ldc1            #38  <String "DATE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #32  <Method void SqlType(String, int)>
	//   17   36:putstatic       #40  <Field SqlType DATE>
		BOOLEAN = new SqlType("BOOLEAN", 3);
	//   18   39:new             #2   <Class SqlType>
	//   19   42:dup             
	//   20   43:ldc1            #41  <String "BOOLEAN">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #32  <Method void SqlType(String, int)>
	//   23   49:putstatic       #43  <Field SqlType BOOLEAN>
		CHAR = new SqlType("CHAR", 4);
	//   24   52:new             #2   <Class SqlType>
	//   25   55:dup             
	//   26   56:ldc1            #44  <String "CHAR">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #32  <Method void SqlType(String, int)>
	//   29   62:putstatic       #46  <Field SqlType CHAR>
		BYTE = new SqlType("BYTE", 5);
	//   30   65:new             #2   <Class SqlType>
	//   31   68:dup             
	//   32   69:ldc1            #47  <String "BYTE">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #32  <Method void SqlType(String, int)>
	//   35   75:putstatic       #49  <Field SqlType BYTE>
		BYTE_ARRAY = new SqlType("BYTE_ARRAY", 6);
	//   36   78:new             #2   <Class SqlType>
	//   37   81:dup             
	//   38   82:ldc1            #50  <String "BYTE_ARRAY">
	//   39   84:bipush          6
	//   40   86:invokespecial   #32  <Method void SqlType(String, int)>
	//   41   89:putstatic       #52  <Field SqlType BYTE_ARRAY>
		SHORT = new SqlType("SHORT", 7);
	//   42   92:new             #2   <Class SqlType>
	//   43   95:dup             
	//   44   96:ldc1            #53  <String "SHORT">
	//   45   98:bipush          7
	//   46  100:invokespecial   #32  <Method void SqlType(String, int)>
	//   47  103:putstatic       #55  <Field SqlType SHORT>
		INTEGER = new SqlType("INTEGER", 8);
	//   48  106:new             #2   <Class SqlType>
	//   49  109:dup             
	//   50  110:ldc1            #56  <String "INTEGER">
	//   51  112:bipush          8
	//   52  114:invokespecial   #32  <Method void SqlType(String, int)>
	//   53  117:putstatic       #58  <Field SqlType INTEGER>
		LONG = new SqlType("LONG", 9);
	//   54  120:new             #2   <Class SqlType>
	//   55  123:dup             
	//   56  124:ldc1            #59  <String "LONG">
	//   57  126:bipush          9
	//   58  128:invokespecial   #32  <Method void SqlType(String, int)>
	//   59  131:putstatic       #61  <Field SqlType LONG>
		FLOAT = new SqlType("FLOAT", 10);
	//   60  134:new             #2   <Class SqlType>
	//   61  137:dup             
	//   62  138:ldc1            #62  <String "FLOAT">
	//   63  140:bipush          10
	//   64  142:invokespecial   #32  <Method void SqlType(String, int)>
	//   65  145:putstatic       #64  <Field SqlType FLOAT>
		DOUBLE = new SqlType("DOUBLE", 11);
	//   66  148:new             #2   <Class SqlType>
	//   67  151:dup             
	//   68  152:ldc1            #65  <String "DOUBLE">
	//   69  154:bipush          11
	//   70  156:invokespecial   #32  <Method void SqlType(String, int)>
	//   71  159:putstatic       #67  <Field SqlType DOUBLE>
		SERIALIZABLE = new SqlType("SERIALIZABLE", 12);
	//   72  162:new             #2   <Class SqlType>
	//   73  165:dup             
	//   74  166:ldc1            #68  <String "SERIALIZABLE">
	//   75  168:bipush          12
	//   76  170:invokespecial   #32  <Method void SqlType(String, int)>
	//   77  173:putstatic       #70  <Field SqlType SERIALIZABLE>
		BLOB = new SqlType("BLOB", 13);
	//   78  176:new             #2   <Class SqlType>
	//   79  179:dup             
	//   80  180:ldc1            #71  <String "BLOB">
	//   81  182:bipush          13
	//   82  184:invokespecial   #32  <Method void SqlType(String, int)>
	//   83  187:putstatic       #73  <Field SqlType BLOB>
		BIG_DECIMAL = new SqlType("BIG_DECIMAL", 14);
	//   84  190:new             #2   <Class SqlType>
	//   85  193:dup             
	//   86  194:ldc1            #74  <String "BIG_DECIMAL">
	//   87  196:bipush          14
	//   88  198:invokespecial   #32  <Method void SqlType(String, int)>
	//   89  201:putstatic       #76  <Field SqlType BIG_DECIMAL>
		OTHER = new SqlType("OTHER", 15);
	//   90  204:new             #2   <Class SqlType>
	//   91  207:dup             
	//   92  208:ldc1            #77  <String "OTHER">
	//   93  210:bipush          15
	//   94  212:invokespecial   #32  <Method void SqlType(String, int)>
	//   95  215:putstatic       #79  <Field SqlType OTHER>
		UNKNOWN = new SqlType("UNKNOWN", 16);
	//   96  218:new             #2   <Class SqlType>
	//   97  221:dup             
	//   98  222:ldc1            #80  <String "UNKNOWN">
	//   99  224:bipush          16
	//  100  226:invokespecial   #32  <Method void SqlType(String, int)>
	//  101  229:putstatic       #82  <Field SqlType UNKNOWN>
		$VALUES = (new SqlType[] {
			STRING, LONG_STRING, DATE, BOOLEAN, CHAR, BYTE, BYTE_ARRAY, SHORT, INTEGER, LONG, 
			FLOAT, DOUBLE, SERIALIZABLE, BLOB, BIG_DECIMAL, OTHER, UNKNOWN
		});
	//  102  232:bipush          17
	//  103  234:anewarray       SqlType[]
	//  104  237:dup             
	//  105  238:iconst_0        
	//  106  239:getstatic       #34  <Field SqlType STRING>
	//  107  242:aastore         
	//  108  243:dup             
	//  109  244:iconst_1        
	//  110  245:getstatic       #37  <Field SqlType LONG_STRING>
	//  111  248:aastore         
	//  112  249:dup             
	//  113  250:iconst_2        
	//  114  251:getstatic       #40  <Field SqlType DATE>
	//  115  254:aastore         
	//  116  255:dup             
	//  117  256:iconst_3        
	//  118  257:getstatic       #43  <Field SqlType BOOLEAN>
	//  119  260:aastore         
	//  120  261:dup             
	//  121  262:iconst_4        
	//  122  263:getstatic       #46  <Field SqlType CHAR>
	//  123  266:aastore         
	//  124  267:dup             
	//  125  268:iconst_5        
	//  126  269:getstatic       #49  <Field SqlType BYTE>
	//  127  272:aastore         
	//  128  273:dup             
	//  129  274:bipush          6
	//  130  276:getstatic       #52  <Field SqlType BYTE_ARRAY>
	//  131  279:aastore         
	//  132  280:dup             
	//  133  281:bipush          7
	//  134  283:getstatic       #55  <Field SqlType SHORT>
	//  135  286:aastore         
	//  136  287:dup             
	//  137  288:bipush          8
	//  138  290:getstatic       #58  <Field SqlType INTEGER>
	//  139  293:aastore         
	//  140  294:dup             
	//  141  295:bipush          9
	//  142  297:getstatic       #61  <Field SqlType LONG>
	//  143  300:aastore         
	//  144  301:dup             
	//  145  302:bipush          10
	//  146  304:getstatic       #64  <Field SqlType FLOAT>
	//  147  307:aastore         
	//  148  308:dup             
	//  149  309:bipush          11
	//  150  311:getstatic       #67  <Field SqlType DOUBLE>
	//  151  314:aastore         
	//  152  315:dup             
	//  153  316:bipush          12
	//  154  318:getstatic       #70  <Field SqlType SERIALIZABLE>
	//  155  321:aastore         
	//  156  322:dup             
	//  157  323:bipush          13
	//  158  325:getstatic       #73  <Field SqlType BLOB>
	//  159  328:aastore         
	//  160  329:dup             
	//  161  330:bipush          14
	//  162  332:getstatic       #76  <Field SqlType BIG_DECIMAL>
	//  163  335:aastore         
	//  164  336:dup             
	//  165  337:bipush          15
	//  166  339:getstatic       #79  <Field SqlType OTHER>
	//  167  342:aastore         
	//  168  343:dup             
	//  169  344:bipush          16
	//  170  346:getstatic       #82  <Field SqlType UNKNOWN>
	//  171  349:aastore         
	//  172  350:putstatic       #84  <Field SqlType[] $VALUES>
	//* 173  353:return          
	}
}
