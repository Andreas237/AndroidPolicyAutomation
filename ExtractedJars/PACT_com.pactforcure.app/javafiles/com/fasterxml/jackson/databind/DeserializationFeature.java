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
	//    3    3:invokespecial   #122 <Method void Enum(String, int)>
		_defaultState = flag;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #124 <Field boolean _defaultState>
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:invokevirtual   #128 <Method int ordinal()>
	//   11   17:ishl            
	//   12   18:putfield        #130 <Field int _mask>
	//   13   21:return          
	}

	public static DeserializationFeature valueOf(String s)
	{
		return (DeserializationFeature)Enum.valueOf(com/fasterxml/jackson/databind/DeserializationFeature, s);
	//    0    0:ldc1            #2   <Class DeserializationFeature>
	//    1    2:aload_0         
	//    2    3:invokestatic    #137 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class DeserializationFeature>
	//    4    9:areturn         
	}

	public static DeserializationFeature[] values()
	{
		return (DeserializationFeature[])((DeserializationFeature []) ($VALUES)).clone();
	//    0    0:getstatic       #118 <Field DeserializationFeature[] $VALUES>
	//    1    3:invokevirtual   #144 <Method Object _5B_Lcom.fasterxml.jackson.databind.DeserializationFeature_3B_.clone()>
	//    2    6:checkcast       #140 <Class DeserializationFeature[]>
	//    3    9:areturn         
	}

	public boolean enabledByDefault()
	{
		return _defaultState;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field boolean _defaultState>
	//    2    4:ireturn         
	}

	public boolean enabledIn(int i)
	{
		return (_mask & i) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field int _mask>
	//    2    4:iload_1         
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
	//    1    1:getfield        #130 <Field int _mask>
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
	public static final DeserializationFeature FAIL_ON_NULL_FOR_PRIMITIVES;
	public static final DeserializationFeature FAIL_ON_NUMBERS_FOR_ENUMS;
	public static final DeserializationFeature FAIL_ON_READING_DUP_TREE_KEY;
	public static final DeserializationFeature FAIL_ON_UNKNOWN_PROPERTIES;
	public static final DeserializationFeature FAIL_ON_UNRESOLVED_OBJECT_IDS;
	public static final DeserializationFeature READ_DATE_TIMESTAMPS_AS_NANOSECONDS;
	public static final DeserializationFeature READ_ENUMS_USING_TO_STRING;
	public static final DeserializationFeature READ_UNKNOWN_ENUM_VALUES_AS_NULL;
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
	//    2    4:ldc1            #41  <String "USE_BIG_DECIMAL_FOR_FLOATS">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #45  <Method void DeserializationFeature(String, int, boolean)>
	//    6   11:putstatic       #47  <Field DeserializationFeature USE_BIG_DECIMAL_FOR_FLOATS>
		USE_BIG_INTEGER_FOR_INTS = new DeserializationFeature("USE_BIG_INTEGER_FOR_INTS", 1, false);
	//    7   14:new             #2   <Class DeserializationFeature>
	//    8   17:dup             
	//    9   18:ldc1            #48  <String "USE_BIG_INTEGER_FOR_INTS">
	//   10   20:iconst_1        
	//   11   21:iconst_0        
	//   12   22:invokespecial   #45  <Method void DeserializationFeature(String, int, boolean)>
	//   13   25:putstatic       #50  <Field DeserializationFeature USE_BIG_INTEGER_FOR_INTS>
		USE_LONG_FOR_INTS = new DeserializationFeature("USE_LONG_FOR_INTS", 2, false);
	//   14   28:new             #2   <Class DeserializationFeature>
	//   15   31:dup             
	//   16   32:ldc1            #51  <String "USE_LONG_FOR_INTS">
	//   17   34:iconst_2        
	//   18   35:iconst_0        
	//   19   36:invokespecial   #45  <Method void DeserializationFeature(String, int, boolean)>
	//   20   39:putstatic       #53  <Field DeserializationFeature USE_LONG_FOR_INTS>
		USE_JAVA_ARRAY_FOR_JSON_ARRAY = new DeserializationFeature("USE_JAVA_ARRAY_FOR_JSON_ARRAY", 3, false);
	//   21   42:new             #2   <Class DeserializationFeature>
	//   22   45:dup             
	//   23   46:ldc1            #54  <String "USE_JAVA_ARRAY_FOR_JSON_ARRAY">
	//   24   48:iconst_3        
	//   25   49:iconst_0        
	//   26   50:invokespecial   #45  <Method void DeserializationFeature(String, int, boolean)>
	//   27   53:putstatic       #56  <Field DeserializationFeature USE_JAVA_ARRAY_FOR_JSON_ARRAY>
		READ_ENUMS_USING_TO_STRING = new DeserializationFeature("READ_ENUMS_USING_TO_STRING", 4, false);
	//   28   56:new             #2   <Class DeserializationFeature>
	//   29   59:dup             
	//   30   60:ldc1            #57  <String "READ_ENUMS_USING_TO_STRING">
	//   31   62:iconst_4        
	//   32   63:iconst_0        
	//   33   64:invokespecial   #45  <Method void DeserializationFeature(String, int, boolean)>
	//   34   67:putstatic       #59  <Field DeserializationFeature READ_ENUMS_USING_TO_STRING>
		FAIL_ON_UNKNOWN_PROPERTIES = new DeserializationFeature("FAIL_ON_UNKNOWN_PROPERTIES", 5, true);
	//   35   70:new             #2   <Class DeserializationFeature>
	//   36   73:dup             
	//   37   74:ldc1            #60  <String "FAIL_ON_UNKNOWN_PROPERTIES">
	//   38   76:iconst_5        
	//   39   77:iconst_1        
	//   40   78:invokespecial   #45  <Method void DeserializationFeature(String, int, boolean)>
	//   41   81:putstatic       #62  <Field DeserializationFeature FAIL_ON_UNKNOWN_PROPERTIES>
		FAIL_ON_NULL_FOR_PRIMITIVES = new DeserializationFeature("FAIL_ON_NULL_FOR_PRIMITIVES", 6, false);
	//   42   84:new             #2   <Class DeserializationFeature>
	//   43   87:dup             
	//   44   88:ldc1            #63  <String "FAIL_ON_NULL_FOR_PRIMITIVES">
	//   45   90:bipush          6
	//   46   92:iconst_0        
	//   47   93:invokespecial   #45  <Method void DeserializationFeature(String, int, boolean)>
	//   48   96:putstatic       #65  <Field DeserializationFeature FAIL_ON_NULL_FOR_PRIMITIVES>
		FAIL_ON_NUMBERS_FOR_ENUMS = new DeserializationFeature("FAIL_ON_NUMBERS_FOR_ENUMS", 7, false);
	//   49   99:new             #2   <Class DeserializationFeature>
	//   50  102:dup             
	//   51  103:ldc1            #66  <String "FAIL_ON_NUMBERS_FOR_ENUMS">
	//   52  105:bipush          7
	//   53  107:iconst_0        
	//   54  108:invokespecial   #45  <Method void DeserializationFeature(String, int, boolean)>
	//   55  111:putstatic       #68  <Field DeserializationFeature FAIL_ON_NUMBERS_FOR_ENUMS>
		FAIL_ON_INVALID_SUBTYPE = new DeserializationFeature("FAIL_ON_INVALID_SUBTYPE", 8, true);
	//   56  114:new             #2   <Class DeserializationFeature>
	//   57  117:dup             
	//   58  118:ldc1            #69  <String "FAIL_ON_INVALID_SUBTYPE">
	//   59  120:bipush          8
	//   60  122:iconst_1        
	//   61  123:invokespecial   #45  <Method void DeserializationFeature(String, int, boolean)>
	//   62  126:putstatic       #71  <Field DeserializationFeature FAIL_ON_INVALID_SUBTYPE>
		FAIL_ON_READING_DUP_TREE_KEY = new DeserializationFeature("FAIL_ON_READING_DUP_TREE_KEY", 9, false);
	//   63  129:new             #2   <Class DeserializationFeature>
	//   64  132:dup             
	//   65  133:ldc1            #72  <String "FAIL_ON_READING_DUP_TREE_KEY">
	//   66  135:bipush          9
	//   67  137:iconst_0        
	//   68  138:invokespecial   #45  <Method void DeserializationFeature(String, int, boolean)>
	//   69  141:putstatic       #74  <Field DeserializationFeature FAIL_ON_READING_DUP_TREE_KEY>
		FAIL_ON_IGNORED_PROPERTIES = new DeserializationFeature("FAIL_ON_IGNORED_PROPERTIES", 10, false);
	//   70  144:new             #2   <Class DeserializationFeature>
	//   71  147:dup             
	//   72  148:ldc1            #75  <String "FAIL_ON_IGNORED_PROPERTIES">
	//   73  150:bipush          10
	//   74  152:iconst_0        
	//   75  153:invokespecial   #45  <Method void DeserializationFeature(String, int, boolean)>
	//   76  156:putstatic       #77  <Field DeserializationFeature FAIL_ON_IGNORED_PROPERTIES>
		FAIL_ON_UNRESOLVED_OBJECT_IDS = new DeserializationFeature("FAIL_ON_UNRESOLVED_OBJECT_IDS", 11, true);
	//   77  159:new             #2   <Class DeserializationFeature>
	//   78  162:dup             
	//   79  163:ldc1            #78  <String "FAIL_ON_UNRESOLVED_OBJECT_IDS">
	//   80  165:bipush          11
	//   81  167:iconst_1        
	//   82  168:invokespecial   #45  <Method void DeserializationFeature(String, int, boolean)>
	//   83  171:putstatic       #80  <Field DeserializationFeature FAIL_ON_UNRESOLVED_OBJECT_IDS>
		FAIL_ON_MISSING_CREATOR_PROPERTIES = new DeserializationFeature("FAIL_ON_MISSING_CREATOR_PROPERTIES", 12, false);
	//   84  174:new             #2   <Class DeserializationFeature>
	//   85  177:dup             
	//   86  178:ldc1            #81  <String "FAIL_ON_MISSING_CREATOR_PROPERTIES">
	//   87  180:bipush          12
	//   88  182:iconst_0        
	//   89  183:invokespecial   #45  <Method void DeserializationFeature(String, int, boolean)>
	//   90  186:putstatic       #83  <Field DeserializationFeature FAIL_ON_MISSING_CREATOR_PROPERTIES>
		WRAP_EXCEPTIONS = new DeserializationFeature("WRAP_EXCEPTIONS", 13, true);
	//   91  189:new             #2   <Class DeserializationFeature>
	//   92  192:dup             
	//   93  193:ldc1            #84  <String "WRAP_EXCEPTIONS">
	//   94  195:bipush          13
	//   95  197:iconst_1        
	//   96  198:invokespecial   #45  <Method void DeserializationFeature(String, int, boolean)>
	//   97  201:putstatic       #86  <Field DeserializationFeature WRAP_EXCEPTIONS>
		ACCEPT_SINGLE_VALUE_AS_ARRAY = new DeserializationFeature("ACCEPT_SINGLE_VALUE_AS_ARRAY", 14, false);
	//   98  204:new             #2   <Class DeserializationFeature>
	//   99  207:dup             
	//  100  208:ldc1            #87  <String "ACCEPT_SINGLE_VALUE_AS_ARRAY">
	//  101  210:bipush          14
	//  102  212:iconst_0        
	//  103  213:invokespecial   #45  <Method void DeserializationFeature(String, int, boolean)>
	//  104  216:putstatic       #89  <Field DeserializationFeature ACCEPT_SINGLE_VALUE_AS_ARRAY>
		UNWRAP_SINGLE_VALUE_ARRAYS = new DeserializationFeature("UNWRAP_SINGLE_VALUE_ARRAYS", 15, false);
	//  105  219:new             #2   <Class DeserializationFeature>
	//  106  222:dup             
	//  107  223:ldc1            #90  <String "UNWRAP_SINGLE_VALUE_ARRAYS">
	//  108  225:bipush          15
	//  109  227:iconst_0        
	//  110  228:invokespecial   #45  <Method void DeserializationFeature(String, int, boolean)>
	//  111  231:putstatic       #92  <Field DeserializationFeature UNWRAP_SINGLE_VALUE_ARRAYS>
		UNWRAP_ROOT_VALUE = new DeserializationFeature("UNWRAP_ROOT_VALUE", 16, false);
	//  112  234:new             #2   <Class DeserializationFeature>
	//  113  237:dup             
	//  114  238:ldc1            #93  <String "UNWRAP_ROOT_VALUE">
	//  115  240:bipush          16
	//  116  242:iconst_0        
	//  117  243:invokespecial   #45  <Method void DeserializationFeature(String, int, boolean)>
	//  118  246:putstatic       #95  <Field DeserializationFeature UNWRAP_ROOT_VALUE>
		ACCEPT_EMPTY_STRING_AS_NULL_OBJECT = new DeserializationFeature("ACCEPT_EMPTY_STRING_AS_NULL_OBJECT", 17, false);
	//  119  249:new             #2   <Class DeserializationFeature>
	//  120  252:dup             
	//  121  253:ldc1            #96  <String "ACCEPT_EMPTY_STRING_AS_NULL_OBJECT">
	//  122  255:bipush          17
	//  123  257:iconst_0        
	//  124  258:invokespecial   #45  <Method void DeserializationFeature(String, int, boolean)>
	//  125  261:putstatic       #98  <Field DeserializationFeature ACCEPT_EMPTY_STRING_AS_NULL_OBJECT>
		ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT = new DeserializationFeature("ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT", 18, false);
	//  126  264:new             #2   <Class DeserializationFeature>
	//  127  267:dup             
	//  128  268:ldc1            #99  <String "ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT">
	//  129  270:bipush          18
	//  130  272:iconst_0        
	//  131  273:invokespecial   #45  <Method void DeserializationFeature(String, int, boolean)>
	//  132  276:putstatic       #101 <Field DeserializationFeature ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT>
		ACCEPT_FLOAT_AS_INT = new DeserializationFeature("ACCEPT_FLOAT_AS_INT", 19, true);
	//  133  279:new             #2   <Class DeserializationFeature>
	//  134  282:dup             
	//  135  283:ldc1            #102 <String "ACCEPT_FLOAT_AS_INT">
	//  136  285:bipush          19
	//  137  287:iconst_1        
	//  138  288:invokespecial   #45  <Method void DeserializationFeature(String, int, boolean)>
	//  139  291:putstatic       #104 <Field DeserializationFeature ACCEPT_FLOAT_AS_INT>
		READ_UNKNOWN_ENUM_VALUES_AS_NULL = new DeserializationFeature("READ_UNKNOWN_ENUM_VALUES_AS_NULL", 20, false);
	//  140  294:new             #2   <Class DeserializationFeature>
	//  141  297:dup             
	//  142  298:ldc1            #105 <String "READ_UNKNOWN_ENUM_VALUES_AS_NULL">
	//  143  300:bipush          20
	//  144  302:iconst_0        
	//  145  303:invokespecial   #45  <Method void DeserializationFeature(String, int, boolean)>
	//  146  306:putstatic       #107 <Field DeserializationFeature READ_UNKNOWN_ENUM_VALUES_AS_NULL>
		READ_DATE_TIMESTAMPS_AS_NANOSECONDS = new DeserializationFeature("READ_DATE_TIMESTAMPS_AS_NANOSECONDS", 21, true);
	//  147  309:new             #2   <Class DeserializationFeature>
	//  148  312:dup             
	//  149  313:ldc1            #108 <String "READ_DATE_TIMESTAMPS_AS_NANOSECONDS">
	//  150  315:bipush          21
	//  151  317:iconst_1        
	//  152  318:invokespecial   #45  <Method void DeserializationFeature(String, int, boolean)>
	//  153  321:putstatic       #110 <Field DeserializationFeature READ_DATE_TIMESTAMPS_AS_NANOSECONDS>
		ADJUST_DATES_TO_CONTEXT_TIME_ZONE = new DeserializationFeature("ADJUST_DATES_TO_CONTEXT_TIME_ZONE", 22, true);
	//  154  324:new             #2   <Class DeserializationFeature>
	//  155  327:dup             
	//  156  328:ldc1            #111 <String "ADJUST_DATES_TO_CONTEXT_TIME_ZONE">
	//  157  330:bipush          22
	//  158  332:iconst_1        
	//  159  333:invokespecial   #45  <Method void DeserializationFeature(String, int, boolean)>
	//  160  336:putstatic       #113 <Field DeserializationFeature ADJUST_DATES_TO_CONTEXT_TIME_ZONE>
		EAGER_DESERIALIZER_FETCH = new DeserializationFeature("EAGER_DESERIALIZER_FETCH", 23, true);
	//  161  339:new             #2   <Class DeserializationFeature>
	//  162  342:dup             
	//  163  343:ldc1            #114 <String "EAGER_DESERIALIZER_FETCH">
	//  164  345:bipush          23
	//  165  347:iconst_1        
	//  166  348:invokespecial   #45  <Method void DeserializationFeature(String, int, boolean)>
	//  167  351:putstatic       #116 <Field DeserializationFeature EAGER_DESERIALIZER_FETCH>
		$VALUES = (new DeserializationFeature[] {
			USE_BIG_DECIMAL_FOR_FLOATS, USE_BIG_INTEGER_FOR_INTS, USE_LONG_FOR_INTS, USE_JAVA_ARRAY_FOR_JSON_ARRAY, READ_ENUMS_USING_TO_STRING, FAIL_ON_UNKNOWN_PROPERTIES, FAIL_ON_NULL_FOR_PRIMITIVES, FAIL_ON_NUMBERS_FOR_ENUMS, FAIL_ON_INVALID_SUBTYPE, FAIL_ON_READING_DUP_TREE_KEY, 
			FAIL_ON_IGNORED_PROPERTIES, FAIL_ON_UNRESOLVED_OBJECT_IDS, FAIL_ON_MISSING_CREATOR_PROPERTIES, WRAP_EXCEPTIONS, ACCEPT_SINGLE_VALUE_AS_ARRAY, UNWRAP_SINGLE_VALUE_ARRAYS, UNWRAP_ROOT_VALUE, ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, ACCEPT_FLOAT_AS_INT, 
			READ_UNKNOWN_ENUM_VALUES_AS_NULL, READ_DATE_TIMESTAMPS_AS_NANOSECONDS, ADJUST_DATES_TO_CONTEXT_TIME_ZONE, EAGER_DESERIALIZER_FETCH
		});
	//  168  354:bipush          24
	//  169  356:anewarray       DeserializationFeature[]
	//  170  359:dup             
	//  171  360:iconst_0        
	//  172  361:getstatic       #47  <Field DeserializationFeature USE_BIG_DECIMAL_FOR_FLOATS>
	//  173  364:aastore         
	//  174  365:dup             
	//  175  366:iconst_1        
	//  176  367:getstatic       #50  <Field DeserializationFeature USE_BIG_INTEGER_FOR_INTS>
	//  177  370:aastore         
	//  178  371:dup             
	//  179  372:iconst_2        
	//  180  373:getstatic       #53  <Field DeserializationFeature USE_LONG_FOR_INTS>
	//  181  376:aastore         
	//  182  377:dup             
	//  183  378:iconst_3        
	//  184  379:getstatic       #56  <Field DeserializationFeature USE_JAVA_ARRAY_FOR_JSON_ARRAY>
	//  185  382:aastore         
	//  186  383:dup             
	//  187  384:iconst_4        
	//  188  385:getstatic       #59  <Field DeserializationFeature READ_ENUMS_USING_TO_STRING>
	//  189  388:aastore         
	//  190  389:dup             
	//  191  390:iconst_5        
	//  192  391:getstatic       #62  <Field DeserializationFeature FAIL_ON_UNKNOWN_PROPERTIES>
	//  193  394:aastore         
	//  194  395:dup             
	//  195  396:bipush          6
	//  196  398:getstatic       #65  <Field DeserializationFeature FAIL_ON_NULL_FOR_PRIMITIVES>
	//  197  401:aastore         
	//  198  402:dup             
	//  199  403:bipush          7
	//  200  405:getstatic       #68  <Field DeserializationFeature FAIL_ON_NUMBERS_FOR_ENUMS>
	//  201  408:aastore         
	//  202  409:dup             
	//  203  410:bipush          8
	//  204  412:getstatic       #71  <Field DeserializationFeature FAIL_ON_INVALID_SUBTYPE>
	//  205  415:aastore         
	//  206  416:dup             
	//  207  417:bipush          9
	//  208  419:getstatic       #74  <Field DeserializationFeature FAIL_ON_READING_DUP_TREE_KEY>
	//  209  422:aastore         
	//  210  423:dup             
	//  211  424:bipush          10
	//  212  426:getstatic       #77  <Field DeserializationFeature FAIL_ON_IGNORED_PROPERTIES>
	//  213  429:aastore         
	//  214  430:dup             
	//  215  431:bipush          11
	//  216  433:getstatic       #80  <Field DeserializationFeature FAIL_ON_UNRESOLVED_OBJECT_IDS>
	//  217  436:aastore         
	//  218  437:dup             
	//  219  438:bipush          12
	//  220  440:getstatic       #83  <Field DeserializationFeature FAIL_ON_MISSING_CREATOR_PROPERTIES>
	//  221  443:aastore         
	//  222  444:dup             
	//  223  445:bipush          13
	//  224  447:getstatic       #86  <Field DeserializationFeature WRAP_EXCEPTIONS>
	//  225  450:aastore         
	//  226  451:dup             
	//  227  452:bipush          14
	//  228  454:getstatic       #89  <Field DeserializationFeature ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//  229  457:aastore         
	//  230  458:dup             
	//  231  459:bipush          15
	//  232  461:getstatic       #92  <Field DeserializationFeature UNWRAP_SINGLE_VALUE_ARRAYS>
	//  233  464:aastore         
	//  234  465:dup             
	//  235  466:bipush          16
	//  236  468:getstatic       #95  <Field DeserializationFeature UNWRAP_ROOT_VALUE>
	//  237  471:aastore         
	//  238  472:dup             
	//  239  473:bipush          17
	//  240  475:getstatic       #98  <Field DeserializationFeature ACCEPT_EMPTY_STRING_AS_NULL_OBJECT>
	//  241  478:aastore         
	//  242  479:dup             
	//  243  480:bipush          18
	//  244  482:getstatic       #101 <Field DeserializationFeature ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT>
	//  245  485:aastore         
	//  246  486:dup             
	//  247  487:bipush          19
	//  248  489:getstatic       #104 <Field DeserializationFeature ACCEPT_FLOAT_AS_INT>
	//  249  492:aastore         
	//  250  493:dup             
	//  251  494:bipush          20
	//  252  496:getstatic       #107 <Field DeserializationFeature READ_UNKNOWN_ENUM_VALUES_AS_NULL>
	//  253  499:aastore         
	//  254  500:dup             
	//  255  501:bipush          21
	//  256  503:getstatic       #110 <Field DeserializationFeature READ_DATE_TIMESTAMPS_AS_NANOSECONDS>
	//  257  506:aastore         
	//  258  507:dup             
	//  259  508:bipush          22
	//  260  510:getstatic       #113 <Field DeserializationFeature ADJUST_DATES_TO_CONTEXT_TIME_ZONE>
	//  261  513:aastore         
	//  262  514:dup             
	//  263  515:bipush          23
	//  264  517:getstatic       #116 <Field DeserializationFeature EAGER_DESERIALIZER_FETCH>
	//  265  520:aastore         
	//  266  521:putstatic       #118 <Field DeserializationFeature[] $VALUES>
	//* 267  524:return          
	}
}
