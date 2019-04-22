// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.ConfigFeature;

public final class DeserializationFeature extends Enum
	implements ConfigFeature
{

	private DeserializationFeature(String s, int i, boolean flag)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #138 <Method void Enum(String, int)>
		_defaultState = flag;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #140 <Field boolean _defaultState>
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:invokevirtual   #144 <Method int ordinal()>
	//   11   17:ishl            
	//   12   18:putfield        #146 <Field int _mask>
	//   13   21:return          
	}

	public static DeserializationFeature valueOf(String s)
	{
		return (DeserializationFeature)Enum.valueOf(com/fasterxml/jackson/databind/DeserializationFeature, s);
	//    0    0:ldc1            #2   <Class DeserializationFeature>
	//    1    2:aload_0         
	//    2    3:invokestatic    #153 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class DeserializationFeature>
	//    4    9:areturn         
	}

	public static DeserializationFeature[] values()
	{
		return (DeserializationFeature[])((DeserializationFeature []) ($VALUES)).clone();
	//    0    0:getstatic       #134 <Field DeserializationFeature[] $VALUES>
	//    1    3:invokevirtual   #160 <Method Object _5B_Lcom.fasterxml.jackson.databind.DeserializationFeature_3B_.clone()>
	//    2    6:checkcast       #156 <Class DeserializationFeature[]>
	//    3    9:areturn         
	}

	public boolean enabledByDefault()
	{
		return _defaultState;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field boolean _defaultState>
	//    2    4:ireturn         
	}

	public boolean enabledIn(int i)
	{
		return (i & _mask) != 0;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #146 <Field int _mask>
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public int getMask()
	{
		return _mask;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field int _mask>
	//    2    4:ireturn         
	}

	private static final DeserializationFeature $VALUES[];
	public static final DeserializationFeature ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT;
	public static final DeserializationFeature ACCEPT_EMPTY_STRING_AS_NULL_OBJECT;
	public static final DeserializationFeature ACCEPT_FLOAT_AS_INT;
	public static final DeserializationFeature ACCEPT_SINGLE_VALUE_AS_ARRAY;
	public static final DeserializationFeature ADJUST_DATES_TO_CONTEXT_TIME_ZONE;
	public static final DeserializationFeature EAGER_DESERIALIZER_FETCH;
	public static final DeserializationFeature FAIL_ON_IGNORED_PROPERTIES;
	public static final DeserializationFeature FAIL_ON_INVALID_SUBTYPE;
	public static final DeserializationFeature FAIL_ON_MISSING_CREATOR_PROPERTIES;
	public static final DeserializationFeature FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY;
	public static final DeserializationFeature FAIL_ON_NULL_CREATOR_PROPERTIES;
	public static final DeserializationFeature FAIL_ON_NULL_FOR_PRIMITIVES;
	public static final DeserializationFeature FAIL_ON_NUMBERS_FOR_ENUMS;
	public static final DeserializationFeature FAIL_ON_READING_DUP_TREE_KEY;
	public static final DeserializationFeature FAIL_ON_TRAILING_TOKENS;
	public static final DeserializationFeature FAIL_ON_UNKNOWN_PROPERTIES;
	public static final DeserializationFeature FAIL_ON_UNRESOLVED_OBJECT_IDS;
	public static final DeserializationFeature READ_DATE_TIMESTAMPS_AS_NANOSECONDS;
	public static final DeserializationFeature READ_ENUMS_USING_TO_STRING;
	public static final DeserializationFeature READ_UNKNOWN_ENUM_VALUES_AS_NULL;
	public static final DeserializationFeature READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE;
	public static final DeserializationFeature UNWRAP_ROOT_VALUE;
	public static final DeserializationFeature UNWRAP_SINGLE_VALUE_ARRAYS;
	public static final DeserializationFeature USE_BIG_DECIMAL_FOR_FLOATS;
	public static final DeserializationFeature USE_BIG_INTEGER_FOR_INTS;
	public static final DeserializationFeature USE_JAVA_ARRAY_FOR_JSON_ARRAY;
	public static final DeserializationFeature USE_LONG_FOR_INTS;
	public static final DeserializationFeature WRAP_EXCEPTIONS;
	private final boolean _defaultState;
	private final int _mask = 1 << ordinal();

	static 
	{
		USE_BIG_DECIMAL_FOR_FLOATS = new DeserializationFeature("USE_BIG_DECIMAL_FOR_FLOATS", 0, false);
	//    0    0:new             #2   <Class DeserializationFeature>
	//    1    3:dup             
	//    2    4:ldc1            #45  <String "USE_BIG_DECIMAL_FOR_FLOATS">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//    6   11:putstatic       #51  <Field DeserializationFeature USE_BIG_DECIMAL_FOR_FLOATS>
		USE_BIG_INTEGER_FOR_INTS = new DeserializationFeature("USE_BIG_INTEGER_FOR_INTS", 1, false);
	//    7   14:new             #2   <Class DeserializationFeature>
	//    8   17:dup             
	//    9   18:ldc1            #52  <String "USE_BIG_INTEGER_FOR_INTS">
	//   10   20:iconst_1        
	//   11   21:iconst_0        
	//   12   22:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//   13   25:putstatic       #54  <Field DeserializationFeature USE_BIG_INTEGER_FOR_INTS>
		USE_LONG_FOR_INTS = new DeserializationFeature("USE_LONG_FOR_INTS", 2, false);
	//   14   28:new             #2   <Class DeserializationFeature>
	//   15   31:dup             
	//   16   32:ldc1            #55  <String "USE_LONG_FOR_INTS">
	//   17   34:iconst_2        
	//   18   35:iconst_0        
	//   19   36:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//   20   39:putstatic       #57  <Field DeserializationFeature USE_LONG_FOR_INTS>
		USE_JAVA_ARRAY_FOR_JSON_ARRAY = new DeserializationFeature("USE_JAVA_ARRAY_FOR_JSON_ARRAY", 3, false);
	//   21   42:new             #2   <Class DeserializationFeature>
	//   22   45:dup             
	//   23   46:ldc1            #58  <String "USE_JAVA_ARRAY_FOR_JSON_ARRAY">
	//   24   48:iconst_3        
	//   25   49:iconst_0        
	//   26   50:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//   27   53:putstatic       #60  <Field DeserializationFeature USE_JAVA_ARRAY_FOR_JSON_ARRAY>
		FAIL_ON_UNKNOWN_PROPERTIES = new DeserializationFeature("FAIL_ON_UNKNOWN_PROPERTIES", 4, true);
	//   28   56:new             #2   <Class DeserializationFeature>
	//   29   59:dup             
	//   30   60:ldc1            #61  <String "FAIL_ON_UNKNOWN_PROPERTIES">
	//   31   62:iconst_4        
	//   32   63:iconst_1        
	//   33   64:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//   34   67:putstatic       #63  <Field DeserializationFeature FAIL_ON_UNKNOWN_PROPERTIES>
		FAIL_ON_NULL_FOR_PRIMITIVES = new DeserializationFeature("FAIL_ON_NULL_FOR_PRIMITIVES", 5, false);
	//   35   70:new             #2   <Class DeserializationFeature>
	//   36   73:dup             
	//   37   74:ldc1            #64  <String "FAIL_ON_NULL_FOR_PRIMITIVES">
	//   38   76:iconst_5        
	//   39   77:iconst_0        
	//   40   78:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//   41   81:putstatic       #66  <Field DeserializationFeature FAIL_ON_NULL_FOR_PRIMITIVES>
		FAIL_ON_NUMBERS_FOR_ENUMS = new DeserializationFeature("FAIL_ON_NUMBERS_FOR_ENUMS", 6, false);
	//   42   84:new             #2   <Class DeserializationFeature>
	//   43   87:dup             
	//   44   88:ldc1            #67  <String "FAIL_ON_NUMBERS_FOR_ENUMS">
	//   45   90:bipush          6
	//   46   92:iconst_0        
	//   47   93:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//   48   96:putstatic       #69  <Field DeserializationFeature FAIL_ON_NUMBERS_FOR_ENUMS>
		FAIL_ON_INVALID_SUBTYPE = new DeserializationFeature("FAIL_ON_INVALID_SUBTYPE", 7, true);
	//   49   99:new             #2   <Class DeserializationFeature>
	//   50  102:dup             
	//   51  103:ldc1            #70  <String "FAIL_ON_INVALID_SUBTYPE">
	//   52  105:bipush          7
	//   53  107:iconst_1        
	//   54  108:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//   55  111:putstatic       #72  <Field DeserializationFeature FAIL_ON_INVALID_SUBTYPE>
		FAIL_ON_READING_DUP_TREE_KEY = new DeserializationFeature("FAIL_ON_READING_DUP_TREE_KEY", 8, false);
	//   56  114:new             #2   <Class DeserializationFeature>
	//   57  117:dup             
	//   58  118:ldc1            #73  <String "FAIL_ON_READING_DUP_TREE_KEY">
	//   59  120:bipush          8
	//   60  122:iconst_0        
	//   61  123:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//   62  126:putstatic       #75  <Field DeserializationFeature FAIL_ON_READING_DUP_TREE_KEY>
		FAIL_ON_IGNORED_PROPERTIES = new DeserializationFeature("FAIL_ON_IGNORED_PROPERTIES", 9, false);
	//   63  129:new             #2   <Class DeserializationFeature>
	//   64  132:dup             
	//   65  133:ldc1            #76  <String "FAIL_ON_IGNORED_PROPERTIES">
	//   66  135:bipush          9
	//   67  137:iconst_0        
	//   68  138:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//   69  141:putstatic       #78  <Field DeserializationFeature FAIL_ON_IGNORED_PROPERTIES>
		FAIL_ON_UNRESOLVED_OBJECT_IDS = new DeserializationFeature("FAIL_ON_UNRESOLVED_OBJECT_IDS", 10, true);
	//   70  144:new             #2   <Class DeserializationFeature>
	//   71  147:dup             
	//   72  148:ldc1            #79  <String "FAIL_ON_UNRESOLVED_OBJECT_IDS">
	//   73  150:bipush          10
	//   74  152:iconst_1        
	//   75  153:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//   76  156:putstatic       #81  <Field DeserializationFeature FAIL_ON_UNRESOLVED_OBJECT_IDS>
		FAIL_ON_MISSING_CREATOR_PROPERTIES = new DeserializationFeature("FAIL_ON_MISSING_CREATOR_PROPERTIES", 11, false);
	//   77  159:new             #2   <Class DeserializationFeature>
	//   78  162:dup             
	//   79  163:ldc1            #82  <String "FAIL_ON_MISSING_CREATOR_PROPERTIES">
	//   80  165:bipush          11
	//   81  167:iconst_0        
	//   82  168:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//   83  171:putstatic       #84  <Field DeserializationFeature FAIL_ON_MISSING_CREATOR_PROPERTIES>
		FAIL_ON_NULL_CREATOR_PROPERTIES = new DeserializationFeature("FAIL_ON_NULL_CREATOR_PROPERTIES", 12, false);
	//   84  174:new             #2   <Class DeserializationFeature>
	//   85  177:dup             
	//   86  178:ldc1            #85  <String "FAIL_ON_NULL_CREATOR_PROPERTIES">
	//   87  180:bipush          12
	//   88  182:iconst_0        
	//   89  183:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//   90  186:putstatic       #87  <Field DeserializationFeature FAIL_ON_NULL_CREATOR_PROPERTIES>
		FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY = new DeserializationFeature("FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY", 13, true);
	//   91  189:new             #2   <Class DeserializationFeature>
	//   92  192:dup             
	//   93  193:ldc1            #88  <String "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY">
	//   94  195:bipush          13
	//   95  197:iconst_1        
	//   96  198:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//   97  201:putstatic       #90  <Field DeserializationFeature FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY>
		FAIL_ON_TRAILING_TOKENS = new DeserializationFeature("FAIL_ON_TRAILING_TOKENS", 14, false);
	//   98  204:new             #2   <Class DeserializationFeature>
	//   99  207:dup             
	//  100  208:ldc1            #91  <String "FAIL_ON_TRAILING_TOKENS">
	//  101  210:bipush          14
	//  102  212:iconst_0        
	//  103  213:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//  104  216:putstatic       #93  <Field DeserializationFeature FAIL_ON_TRAILING_TOKENS>
		WRAP_EXCEPTIONS = new DeserializationFeature("WRAP_EXCEPTIONS", 15, true);
	//  105  219:new             #2   <Class DeserializationFeature>
	//  106  222:dup             
	//  107  223:ldc1            #94  <String "WRAP_EXCEPTIONS">
	//  108  225:bipush          15
	//  109  227:iconst_1        
	//  110  228:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//  111  231:putstatic       #96  <Field DeserializationFeature WRAP_EXCEPTIONS>
		ACCEPT_SINGLE_VALUE_AS_ARRAY = new DeserializationFeature("ACCEPT_SINGLE_VALUE_AS_ARRAY", 16, false);
	//  112  234:new             #2   <Class DeserializationFeature>
	//  113  237:dup             
	//  114  238:ldc1            #97  <String "ACCEPT_SINGLE_VALUE_AS_ARRAY">
	//  115  240:bipush          16
	//  116  242:iconst_0        
	//  117  243:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//  118  246:putstatic       #99  <Field DeserializationFeature ACCEPT_SINGLE_VALUE_AS_ARRAY>
		UNWRAP_SINGLE_VALUE_ARRAYS = new DeserializationFeature("UNWRAP_SINGLE_VALUE_ARRAYS", 17, false);
	//  119  249:new             #2   <Class DeserializationFeature>
	//  120  252:dup             
	//  121  253:ldc1            #100 <String "UNWRAP_SINGLE_VALUE_ARRAYS">
	//  122  255:bipush          17
	//  123  257:iconst_0        
	//  124  258:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//  125  261:putstatic       #102 <Field DeserializationFeature UNWRAP_SINGLE_VALUE_ARRAYS>
		UNWRAP_ROOT_VALUE = new DeserializationFeature("UNWRAP_ROOT_VALUE", 18, false);
	//  126  264:new             #2   <Class DeserializationFeature>
	//  127  267:dup             
	//  128  268:ldc1            #103 <String "UNWRAP_ROOT_VALUE">
	//  129  270:bipush          18
	//  130  272:iconst_0        
	//  131  273:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//  132  276:putstatic       #105 <Field DeserializationFeature UNWRAP_ROOT_VALUE>
		ACCEPT_EMPTY_STRING_AS_NULL_OBJECT = new DeserializationFeature("ACCEPT_EMPTY_STRING_AS_NULL_OBJECT", 19, false);
	//  133  279:new             #2   <Class DeserializationFeature>
	//  134  282:dup             
	//  135  283:ldc1            #106 <String "ACCEPT_EMPTY_STRING_AS_NULL_OBJECT">
	//  136  285:bipush          19
	//  137  287:iconst_0        
	//  138  288:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//  139  291:putstatic       #108 <Field DeserializationFeature ACCEPT_EMPTY_STRING_AS_NULL_OBJECT>
		ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT = new DeserializationFeature("ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT", 20, false);
	//  140  294:new             #2   <Class DeserializationFeature>
	//  141  297:dup             
	//  142  298:ldc1            #109 <String "ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT">
	//  143  300:bipush          20
	//  144  302:iconst_0        
	//  145  303:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//  146  306:putstatic       #111 <Field DeserializationFeature ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT>
		ACCEPT_FLOAT_AS_INT = new DeserializationFeature("ACCEPT_FLOAT_AS_INT", 21, true);
	//  147  309:new             #2   <Class DeserializationFeature>
	//  148  312:dup             
	//  149  313:ldc1            #112 <String "ACCEPT_FLOAT_AS_INT">
	//  150  315:bipush          21
	//  151  317:iconst_1        
	//  152  318:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//  153  321:putstatic       #114 <Field DeserializationFeature ACCEPT_FLOAT_AS_INT>
		READ_ENUMS_USING_TO_STRING = new DeserializationFeature("READ_ENUMS_USING_TO_STRING", 22, false);
	//  154  324:new             #2   <Class DeserializationFeature>
	//  155  327:dup             
	//  156  328:ldc1            #115 <String "READ_ENUMS_USING_TO_STRING">
	//  157  330:bipush          22
	//  158  332:iconst_0        
	//  159  333:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//  160  336:putstatic       #117 <Field DeserializationFeature READ_ENUMS_USING_TO_STRING>
		READ_UNKNOWN_ENUM_VALUES_AS_NULL = new DeserializationFeature("READ_UNKNOWN_ENUM_VALUES_AS_NULL", 23, false);
	//  161  339:new             #2   <Class DeserializationFeature>
	//  162  342:dup             
	//  163  343:ldc1            #118 <String "READ_UNKNOWN_ENUM_VALUES_AS_NULL">
	//  164  345:bipush          23
	//  165  347:iconst_0        
	//  166  348:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//  167  351:putstatic       #120 <Field DeserializationFeature READ_UNKNOWN_ENUM_VALUES_AS_NULL>
		READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE = new DeserializationFeature("READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE", 24, false);
	//  168  354:new             #2   <Class DeserializationFeature>
	//  169  357:dup             
	//  170  358:ldc1            #121 <String "READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE">
	//  171  360:bipush          24
	//  172  362:iconst_0        
	//  173  363:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//  174  366:putstatic       #123 <Field DeserializationFeature READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE>
		READ_DATE_TIMESTAMPS_AS_NANOSECONDS = new DeserializationFeature("READ_DATE_TIMESTAMPS_AS_NANOSECONDS", 25, true);
	//  175  369:new             #2   <Class DeserializationFeature>
	//  176  372:dup             
	//  177  373:ldc1            #124 <String "READ_DATE_TIMESTAMPS_AS_NANOSECONDS">
	//  178  375:bipush          25
	//  179  377:iconst_1        
	//  180  378:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//  181  381:putstatic       #126 <Field DeserializationFeature READ_DATE_TIMESTAMPS_AS_NANOSECONDS>
		ADJUST_DATES_TO_CONTEXT_TIME_ZONE = new DeserializationFeature("ADJUST_DATES_TO_CONTEXT_TIME_ZONE", 26, true);
	//  182  384:new             #2   <Class DeserializationFeature>
	//  183  387:dup             
	//  184  388:ldc1            #127 <String "ADJUST_DATES_TO_CONTEXT_TIME_ZONE">
	//  185  390:bipush          26
	//  186  392:iconst_1        
	//  187  393:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//  188  396:putstatic       #129 <Field DeserializationFeature ADJUST_DATES_TO_CONTEXT_TIME_ZONE>
		EAGER_DESERIALIZER_FETCH = new DeserializationFeature("EAGER_DESERIALIZER_FETCH", 27, true);
	//  189  399:new             #2   <Class DeserializationFeature>
	//  190  402:dup             
	//  191  403:ldc1            #130 <String "EAGER_DESERIALIZER_FETCH">
	//  192  405:bipush          27
	//  193  407:iconst_1        
	//  194  408:invokespecial   #49  <Method void DeserializationFeature(String, int, boolean)>
	//  195  411:putstatic       #132 <Field DeserializationFeature EAGER_DESERIALIZER_FETCH>
		$VALUES = (new DeserializationFeature[] {
			USE_BIG_DECIMAL_FOR_FLOATS, USE_BIG_INTEGER_FOR_INTS, USE_LONG_FOR_INTS, USE_JAVA_ARRAY_FOR_JSON_ARRAY, FAIL_ON_UNKNOWN_PROPERTIES, FAIL_ON_NULL_FOR_PRIMITIVES, FAIL_ON_NUMBERS_FOR_ENUMS, FAIL_ON_INVALID_SUBTYPE, FAIL_ON_READING_DUP_TREE_KEY, FAIL_ON_IGNORED_PROPERTIES, 
			FAIL_ON_UNRESOLVED_OBJECT_IDS, FAIL_ON_MISSING_CREATOR_PROPERTIES, FAIL_ON_NULL_CREATOR_PROPERTIES, FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY, FAIL_ON_TRAILING_TOKENS, WRAP_EXCEPTIONS, ACCEPT_SINGLE_VALUE_AS_ARRAY, UNWRAP_SINGLE_VALUE_ARRAYS, UNWRAP_ROOT_VALUE, ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, 
			ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, ACCEPT_FLOAT_AS_INT, READ_ENUMS_USING_TO_STRING, READ_UNKNOWN_ENUM_VALUES_AS_NULL, READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE, READ_DATE_TIMESTAMPS_AS_NANOSECONDS, ADJUST_DATES_TO_CONTEXT_TIME_ZONE, EAGER_DESERIALIZER_FETCH
		});
	//  196  414:bipush          28
	//  197  416:anewarray       DeserializationFeature[]
	//  198  419:dup             
	//  199  420:iconst_0        
	//  200  421:getstatic       #51  <Field DeserializationFeature USE_BIG_DECIMAL_FOR_FLOATS>
	//  201  424:aastore         
	//  202  425:dup             
	//  203  426:iconst_1        
	//  204  427:getstatic       #54  <Field DeserializationFeature USE_BIG_INTEGER_FOR_INTS>
	//  205  430:aastore         
	//  206  431:dup             
	//  207  432:iconst_2        
	//  208  433:getstatic       #57  <Field DeserializationFeature USE_LONG_FOR_INTS>
	//  209  436:aastore         
	//  210  437:dup             
	//  211  438:iconst_3        
	//  212  439:getstatic       #60  <Field DeserializationFeature USE_JAVA_ARRAY_FOR_JSON_ARRAY>
	//  213  442:aastore         
	//  214  443:dup             
	//  215  444:iconst_4        
	//  216  445:getstatic       #63  <Field DeserializationFeature FAIL_ON_UNKNOWN_PROPERTIES>
	//  217  448:aastore         
	//  218  449:dup             
	//  219  450:iconst_5        
	//  220  451:getstatic       #66  <Field DeserializationFeature FAIL_ON_NULL_FOR_PRIMITIVES>
	//  221  454:aastore         
	//  222  455:dup             
	//  223  456:bipush          6
	//  224  458:getstatic       #69  <Field DeserializationFeature FAIL_ON_NUMBERS_FOR_ENUMS>
	//  225  461:aastore         
	//  226  462:dup             
	//  227  463:bipush          7
	//  228  465:getstatic       #72  <Field DeserializationFeature FAIL_ON_INVALID_SUBTYPE>
	//  229  468:aastore         
	//  230  469:dup             
	//  231  470:bipush          8
	//  232  472:getstatic       #75  <Field DeserializationFeature FAIL_ON_READING_DUP_TREE_KEY>
	//  233  475:aastore         
	//  234  476:dup             
	//  235  477:bipush          9
	//  236  479:getstatic       #78  <Field DeserializationFeature FAIL_ON_IGNORED_PROPERTIES>
	//  237  482:aastore         
	//  238  483:dup             
	//  239  484:bipush          10
	//  240  486:getstatic       #81  <Field DeserializationFeature FAIL_ON_UNRESOLVED_OBJECT_IDS>
	//  241  489:aastore         
	//  242  490:dup             
	//  243  491:bipush          11
	//  244  493:getstatic       #84  <Field DeserializationFeature FAIL_ON_MISSING_CREATOR_PROPERTIES>
	//  245  496:aastore         
	//  246  497:dup             
	//  247  498:bipush          12
	//  248  500:getstatic       #87  <Field DeserializationFeature FAIL_ON_NULL_CREATOR_PROPERTIES>
	//  249  503:aastore         
	//  250  504:dup             
	//  251  505:bipush          13
	//  252  507:getstatic       #90  <Field DeserializationFeature FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY>
	//  253  510:aastore         
	//  254  511:dup             
	//  255  512:bipush          14
	//  256  514:getstatic       #93  <Field DeserializationFeature FAIL_ON_TRAILING_TOKENS>
	//  257  517:aastore         
	//  258  518:dup             
	//  259  519:bipush          15
	//  260  521:getstatic       #96  <Field DeserializationFeature WRAP_EXCEPTIONS>
	//  261  524:aastore         
	//  262  525:dup             
	//  263  526:bipush          16
	//  264  528:getstatic       #99  <Field DeserializationFeature ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//  265  531:aastore         
	//  266  532:dup             
	//  267  533:bipush          17
	//  268  535:getstatic       #102 <Field DeserializationFeature UNWRAP_SINGLE_VALUE_ARRAYS>
	//  269  538:aastore         
	//  270  539:dup             
	//  271  540:bipush          18
	//  272  542:getstatic       #105 <Field DeserializationFeature UNWRAP_ROOT_VALUE>
	//  273  545:aastore         
	//  274  546:dup             
	//  275  547:bipush          19
	//  276  549:getstatic       #108 <Field DeserializationFeature ACCEPT_EMPTY_STRING_AS_NULL_OBJECT>
	//  277  552:aastore         
	//  278  553:dup             
	//  279  554:bipush          20
	//  280  556:getstatic       #111 <Field DeserializationFeature ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT>
	//  281  559:aastore         
	//  282  560:dup             
	//  283  561:bipush          21
	//  284  563:getstatic       #114 <Field DeserializationFeature ACCEPT_FLOAT_AS_INT>
	//  285  566:aastore         
	//  286  567:dup             
	//  287  568:bipush          22
	//  288  570:getstatic       #117 <Field DeserializationFeature READ_ENUMS_USING_TO_STRING>
	//  289  573:aastore         
	//  290  574:dup             
	//  291  575:bipush          23
	//  292  577:getstatic       #120 <Field DeserializationFeature READ_UNKNOWN_ENUM_VALUES_AS_NULL>
	//  293  580:aastore         
	//  294  581:dup             
	//  295  582:bipush          24
	//  296  584:getstatic       #123 <Field DeserializationFeature READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE>
	//  297  587:aastore         
	//  298  588:dup             
	//  299  589:bipush          25
	//  300  591:getstatic       #126 <Field DeserializationFeature READ_DATE_TIMESTAMPS_AS_NANOSECONDS>
	//  301  594:aastore         
	//  302  595:dup             
	//  303  596:bipush          26
	//  304  598:getstatic       #129 <Field DeserializationFeature ADJUST_DATES_TO_CONTEXT_TIME_ZONE>
	//  305  601:aastore         
	//  306  602:dup             
	//  307  603:bipush          27
	//  308  605:getstatic       #132 <Field DeserializationFeature EAGER_DESERIALIZER_FETCH>
	//  309  608:aastore         
	//  310  609:putstatic       #134 <Field DeserializationFeature[] $VALUES>
	//* 311  612:return          
	}
}
