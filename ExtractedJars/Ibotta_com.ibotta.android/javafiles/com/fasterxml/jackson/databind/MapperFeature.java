// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.ConfigFeature;

public final class MapperFeature extends Enum
	implements ConfigFeature
{

	private MapperFeature(String s, int i, boolean flag)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #126 <Method void Enum(String, int)>
		_defaultState = flag;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #128 <Field boolean _defaultState>
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:invokevirtual   #132 <Method int ordinal()>
	//   11   17:ishl            
	//   12   18:putfield        #134 <Field int _mask>
	//   13   21:return          
	}

	public static MapperFeature valueOf(String s)
	{
		return (MapperFeature)Enum.valueOf(com/fasterxml/jackson/databind/MapperFeature, s);
	//    0    0:ldc1            #2   <Class MapperFeature>
	//    1    2:aload_0         
	//    2    3:invokestatic    #141 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class MapperFeature>
	//    4    9:areturn         
	}

	public static MapperFeature[] values()
	{
		return (MapperFeature[])((MapperFeature []) ($VALUES)).clone();
	//    0    0:getstatic       #122 <Field MapperFeature[] $VALUES>
	//    1    3:invokevirtual   #148 <Method Object _5B_Lcom.fasterxml.jackson.databind.MapperFeature_3B_.clone()>
	//    2    6:checkcast       #144 <Class MapperFeature[]>
	//    3    9:areturn         
	}

	public boolean enabledByDefault()
	{
		return _defaultState;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field boolean _defaultState>
	//    2    4:ireturn         
	}

	public boolean enabledIn(int i)
	{
		return (i & _mask) != 0;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #134 <Field int _mask>
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
	//    1    1:getfield        #134 <Field int _mask>
	//    2    4:ireturn         
	}

	private static final MapperFeature $VALUES[];
	public static final MapperFeature ACCEPT_CASE_INSENSITIVE_ENUMS;
	public static final MapperFeature ACCEPT_CASE_INSENSITIVE_PROPERTIES;
	public static final MapperFeature ALLOW_COERCION_OF_SCALARS;
	public static final MapperFeature ALLOW_EXPLICIT_PROPERTY_RENAMING;
	public static final MapperFeature ALLOW_FINAL_FIELDS_AS_MUTATORS;
	public static final MapperFeature AUTO_DETECT_CREATORS;
	public static final MapperFeature AUTO_DETECT_FIELDS;
	public static final MapperFeature AUTO_DETECT_GETTERS;
	public static final MapperFeature AUTO_DETECT_IS_GETTERS;
	public static final MapperFeature AUTO_DETECT_SETTERS;
	public static final MapperFeature CAN_OVERRIDE_ACCESS_MODIFIERS;
	public static final MapperFeature DEFAULT_VIEW_INCLUSION;
	public static final MapperFeature IGNORE_DUPLICATE_MODULE_REGISTRATIONS;
	public static final MapperFeature IGNORE_MERGE_FOR_UNMERGEABLE;
	public static final MapperFeature INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES;
	public static final MapperFeature INFER_PROPERTY_MUTATORS;
	public static final MapperFeature OVERRIDE_PUBLIC_ACCESS_MODIFIERS;
	public static final MapperFeature PROPAGATE_TRANSIENT_MARKER;
	public static final MapperFeature REQUIRE_SETTERS_FOR_GETTERS;
	public static final MapperFeature SORT_PROPERTIES_ALPHABETICALLY;
	public static final MapperFeature USE_ANNOTATIONS;
	public static final MapperFeature USE_GETTERS_AS_SETTERS;
	public static final MapperFeature USE_STATIC_TYPING;
	public static final MapperFeature USE_STD_BEAN_NAMING;
	public static final MapperFeature USE_WRAPPER_NAME_AS_PROPERTY_NAME;
	private final boolean _defaultState;
	private final int _mask = 1 << ordinal();

	static 
	{
		USE_ANNOTATIONS = new MapperFeature("USE_ANNOTATIONS", 0, true);
	//    0    0:new             #2   <Class MapperFeature>
	//    1    3:dup             
	//    2    4:ldc1            #42  <String "USE_ANNOTATIONS">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:invokespecial   #46  <Method void MapperFeature(String, int, boolean)>
	//    6   11:putstatic       #48  <Field MapperFeature USE_ANNOTATIONS>
		USE_GETTERS_AS_SETTERS = new MapperFeature("USE_GETTERS_AS_SETTERS", 1, true);
	//    7   14:new             #2   <Class MapperFeature>
	//    8   17:dup             
	//    9   18:ldc1            #49  <String "USE_GETTERS_AS_SETTERS">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #46  <Method void MapperFeature(String, int, boolean)>
	//   13   25:putstatic       #51  <Field MapperFeature USE_GETTERS_AS_SETTERS>
		PROPAGATE_TRANSIENT_MARKER = new MapperFeature("PROPAGATE_TRANSIENT_MARKER", 2, false);
	//   14   28:new             #2   <Class MapperFeature>
	//   15   31:dup             
	//   16   32:ldc1            #52  <String "PROPAGATE_TRANSIENT_MARKER">
	//   17   34:iconst_2        
	//   18   35:iconst_0        
	//   19   36:invokespecial   #46  <Method void MapperFeature(String, int, boolean)>
	//   20   39:putstatic       #54  <Field MapperFeature PROPAGATE_TRANSIENT_MARKER>
		AUTO_DETECT_CREATORS = new MapperFeature("AUTO_DETECT_CREATORS", 3, true);
	//   21   42:new             #2   <Class MapperFeature>
	//   22   45:dup             
	//   23   46:ldc1            #55  <String "AUTO_DETECT_CREATORS">
	//   24   48:iconst_3        
	//   25   49:iconst_1        
	//   26   50:invokespecial   #46  <Method void MapperFeature(String, int, boolean)>
	//   27   53:putstatic       #57  <Field MapperFeature AUTO_DETECT_CREATORS>
		AUTO_DETECT_FIELDS = new MapperFeature("AUTO_DETECT_FIELDS", 4, true);
	//   28   56:new             #2   <Class MapperFeature>
	//   29   59:dup             
	//   30   60:ldc1            #58  <String "AUTO_DETECT_FIELDS">
	//   31   62:iconst_4        
	//   32   63:iconst_1        
	//   33   64:invokespecial   #46  <Method void MapperFeature(String, int, boolean)>
	//   34   67:putstatic       #60  <Field MapperFeature AUTO_DETECT_FIELDS>
		AUTO_DETECT_GETTERS = new MapperFeature("AUTO_DETECT_GETTERS", 5, true);
	//   35   70:new             #2   <Class MapperFeature>
	//   36   73:dup             
	//   37   74:ldc1            #61  <String "AUTO_DETECT_GETTERS">
	//   38   76:iconst_5        
	//   39   77:iconst_1        
	//   40   78:invokespecial   #46  <Method void MapperFeature(String, int, boolean)>
	//   41   81:putstatic       #63  <Field MapperFeature AUTO_DETECT_GETTERS>
		AUTO_DETECT_IS_GETTERS = new MapperFeature("AUTO_DETECT_IS_GETTERS", 6, true);
	//   42   84:new             #2   <Class MapperFeature>
	//   43   87:dup             
	//   44   88:ldc1            #64  <String "AUTO_DETECT_IS_GETTERS">
	//   45   90:bipush          6
	//   46   92:iconst_1        
	//   47   93:invokespecial   #46  <Method void MapperFeature(String, int, boolean)>
	//   48   96:putstatic       #66  <Field MapperFeature AUTO_DETECT_IS_GETTERS>
		AUTO_DETECT_SETTERS = new MapperFeature("AUTO_DETECT_SETTERS", 7, true);
	//   49   99:new             #2   <Class MapperFeature>
	//   50  102:dup             
	//   51  103:ldc1            #67  <String "AUTO_DETECT_SETTERS">
	//   52  105:bipush          7
	//   53  107:iconst_1        
	//   54  108:invokespecial   #46  <Method void MapperFeature(String, int, boolean)>
	//   55  111:putstatic       #69  <Field MapperFeature AUTO_DETECT_SETTERS>
		REQUIRE_SETTERS_FOR_GETTERS = new MapperFeature("REQUIRE_SETTERS_FOR_GETTERS", 8, false);
	//   56  114:new             #2   <Class MapperFeature>
	//   57  117:dup             
	//   58  118:ldc1            #70  <String "REQUIRE_SETTERS_FOR_GETTERS">
	//   59  120:bipush          8
	//   60  122:iconst_0        
	//   61  123:invokespecial   #46  <Method void MapperFeature(String, int, boolean)>
	//   62  126:putstatic       #72  <Field MapperFeature REQUIRE_SETTERS_FOR_GETTERS>
		ALLOW_FINAL_FIELDS_AS_MUTATORS = new MapperFeature("ALLOW_FINAL_FIELDS_AS_MUTATORS", 9, true);
	//   63  129:new             #2   <Class MapperFeature>
	//   64  132:dup             
	//   65  133:ldc1            #73  <String "ALLOW_FINAL_FIELDS_AS_MUTATORS">
	//   66  135:bipush          9
	//   67  137:iconst_1        
	//   68  138:invokespecial   #46  <Method void MapperFeature(String, int, boolean)>
	//   69  141:putstatic       #75  <Field MapperFeature ALLOW_FINAL_FIELDS_AS_MUTATORS>
		INFER_PROPERTY_MUTATORS = new MapperFeature("INFER_PROPERTY_MUTATORS", 10, true);
	//   70  144:new             #2   <Class MapperFeature>
	//   71  147:dup             
	//   72  148:ldc1            #76  <String "INFER_PROPERTY_MUTATORS">
	//   73  150:bipush          10
	//   74  152:iconst_1        
	//   75  153:invokespecial   #46  <Method void MapperFeature(String, int, boolean)>
	//   76  156:putstatic       #78  <Field MapperFeature INFER_PROPERTY_MUTATORS>
		INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES = new MapperFeature("INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES", 11, true);
	//   77  159:new             #2   <Class MapperFeature>
	//   78  162:dup             
	//   79  163:ldc1            #79  <String "INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES">
	//   80  165:bipush          11
	//   81  167:iconst_1        
	//   82  168:invokespecial   #46  <Method void MapperFeature(String, int, boolean)>
	//   83  171:putstatic       #81  <Field MapperFeature INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES>
		CAN_OVERRIDE_ACCESS_MODIFIERS = new MapperFeature("CAN_OVERRIDE_ACCESS_MODIFIERS", 12, true);
	//   84  174:new             #2   <Class MapperFeature>
	//   85  177:dup             
	//   86  178:ldc1            #82  <String "CAN_OVERRIDE_ACCESS_MODIFIERS">
	//   87  180:bipush          12
	//   88  182:iconst_1        
	//   89  183:invokespecial   #46  <Method void MapperFeature(String, int, boolean)>
	//   90  186:putstatic       #84  <Field MapperFeature CAN_OVERRIDE_ACCESS_MODIFIERS>
		OVERRIDE_PUBLIC_ACCESS_MODIFIERS = new MapperFeature("OVERRIDE_PUBLIC_ACCESS_MODIFIERS", 13, true);
	//   91  189:new             #2   <Class MapperFeature>
	//   92  192:dup             
	//   93  193:ldc1            #85  <String "OVERRIDE_PUBLIC_ACCESS_MODIFIERS">
	//   94  195:bipush          13
	//   95  197:iconst_1        
	//   96  198:invokespecial   #46  <Method void MapperFeature(String, int, boolean)>
	//   97  201:putstatic       #87  <Field MapperFeature OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
		USE_STATIC_TYPING = new MapperFeature("USE_STATIC_TYPING", 14, false);
	//   98  204:new             #2   <Class MapperFeature>
	//   99  207:dup             
	//  100  208:ldc1            #88  <String "USE_STATIC_TYPING">
	//  101  210:bipush          14
	//  102  212:iconst_0        
	//  103  213:invokespecial   #46  <Method void MapperFeature(String, int, boolean)>
	//  104  216:putstatic       #90  <Field MapperFeature USE_STATIC_TYPING>
		DEFAULT_VIEW_INCLUSION = new MapperFeature("DEFAULT_VIEW_INCLUSION", 15, true);
	//  105  219:new             #2   <Class MapperFeature>
	//  106  222:dup             
	//  107  223:ldc1            #91  <String "DEFAULT_VIEW_INCLUSION">
	//  108  225:bipush          15
	//  109  227:iconst_1        
	//  110  228:invokespecial   #46  <Method void MapperFeature(String, int, boolean)>
	//  111  231:putstatic       #93  <Field MapperFeature DEFAULT_VIEW_INCLUSION>
		SORT_PROPERTIES_ALPHABETICALLY = new MapperFeature("SORT_PROPERTIES_ALPHABETICALLY", 16, false);
	//  112  234:new             #2   <Class MapperFeature>
	//  113  237:dup             
	//  114  238:ldc1            #94  <String "SORT_PROPERTIES_ALPHABETICALLY">
	//  115  240:bipush          16
	//  116  242:iconst_0        
	//  117  243:invokespecial   #46  <Method void MapperFeature(String, int, boolean)>
	//  118  246:putstatic       #96  <Field MapperFeature SORT_PROPERTIES_ALPHABETICALLY>
		ACCEPT_CASE_INSENSITIVE_PROPERTIES = new MapperFeature("ACCEPT_CASE_INSENSITIVE_PROPERTIES", 17, false);
	//  119  249:new             #2   <Class MapperFeature>
	//  120  252:dup             
	//  121  253:ldc1            #97  <String "ACCEPT_CASE_INSENSITIVE_PROPERTIES">
	//  122  255:bipush          17
	//  123  257:iconst_0        
	//  124  258:invokespecial   #46  <Method void MapperFeature(String, int, boolean)>
	//  125  261:putstatic       #99  <Field MapperFeature ACCEPT_CASE_INSENSITIVE_PROPERTIES>
		ACCEPT_CASE_INSENSITIVE_ENUMS = new MapperFeature("ACCEPT_CASE_INSENSITIVE_ENUMS", 18, false);
	//  126  264:new             #2   <Class MapperFeature>
	//  127  267:dup             
	//  128  268:ldc1            #100 <String "ACCEPT_CASE_INSENSITIVE_ENUMS">
	//  129  270:bipush          18
	//  130  272:iconst_0        
	//  131  273:invokespecial   #46  <Method void MapperFeature(String, int, boolean)>
	//  132  276:putstatic       #102 <Field MapperFeature ACCEPT_CASE_INSENSITIVE_ENUMS>
		USE_WRAPPER_NAME_AS_PROPERTY_NAME = new MapperFeature("USE_WRAPPER_NAME_AS_PROPERTY_NAME", 19, false);
	//  133  279:new             #2   <Class MapperFeature>
	//  134  282:dup             
	//  135  283:ldc1            #103 <String "USE_WRAPPER_NAME_AS_PROPERTY_NAME">
	//  136  285:bipush          19
	//  137  287:iconst_0        
	//  138  288:invokespecial   #46  <Method void MapperFeature(String, int, boolean)>
	//  139  291:putstatic       #105 <Field MapperFeature USE_WRAPPER_NAME_AS_PROPERTY_NAME>
		USE_STD_BEAN_NAMING = new MapperFeature("USE_STD_BEAN_NAMING", 20, false);
	//  140  294:new             #2   <Class MapperFeature>
	//  141  297:dup             
	//  142  298:ldc1            #106 <String "USE_STD_BEAN_NAMING">
	//  143  300:bipush          20
	//  144  302:iconst_0        
	//  145  303:invokespecial   #46  <Method void MapperFeature(String, int, boolean)>
	//  146  306:putstatic       #108 <Field MapperFeature USE_STD_BEAN_NAMING>
		ALLOW_EXPLICIT_PROPERTY_RENAMING = new MapperFeature("ALLOW_EXPLICIT_PROPERTY_RENAMING", 21, false);
	//  147  309:new             #2   <Class MapperFeature>
	//  148  312:dup             
	//  149  313:ldc1            #109 <String "ALLOW_EXPLICIT_PROPERTY_RENAMING">
	//  150  315:bipush          21
	//  151  317:iconst_0        
	//  152  318:invokespecial   #46  <Method void MapperFeature(String, int, boolean)>
	//  153  321:putstatic       #111 <Field MapperFeature ALLOW_EXPLICIT_PROPERTY_RENAMING>
		ALLOW_COERCION_OF_SCALARS = new MapperFeature("ALLOW_COERCION_OF_SCALARS", 22, true);
	//  154  324:new             #2   <Class MapperFeature>
	//  155  327:dup             
	//  156  328:ldc1            #112 <String "ALLOW_COERCION_OF_SCALARS">
	//  157  330:bipush          22
	//  158  332:iconst_1        
	//  159  333:invokespecial   #46  <Method void MapperFeature(String, int, boolean)>
	//  160  336:putstatic       #114 <Field MapperFeature ALLOW_COERCION_OF_SCALARS>
		IGNORE_DUPLICATE_MODULE_REGISTRATIONS = new MapperFeature("IGNORE_DUPLICATE_MODULE_REGISTRATIONS", 23, true);
	//  161  339:new             #2   <Class MapperFeature>
	//  162  342:dup             
	//  163  343:ldc1            #115 <String "IGNORE_DUPLICATE_MODULE_REGISTRATIONS">
	//  164  345:bipush          23
	//  165  347:iconst_1        
	//  166  348:invokespecial   #46  <Method void MapperFeature(String, int, boolean)>
	//  167  351:putstatic       #117 <Field MapperFeature IGNORE_DUPLICATE_MODULE_REGISTRATIONS>
		IGNORE_MERGE_FOR_UNMERGEABLE = new MapperFeature("IGNORE_MERGE_FOR_UNMERGEABLE", 24, true);
	//  168  354:new             #2   <Class MapperFeature>
	//  169  357:dup             
	//  170  358:ldc1            #118 <String "IGNORE_MERGE_FOR_UNMERGEABLE">
	//  171  360:bipush          24
	//  172  362:iconst_1        
	//  173  363:invokespecial   #46  <Method void MapperFeature(String, int, boolean)>
	//  174  366:putstatic       #120 <Field MapperFeature IGNORE_MERGE_FOR_UNMERGEABLE>
		$VALUES = (new MapperFeature[] {
			USE_ANNOTATIONS, USE_GETTERS_AS_SETTERS, PROPAGATE_TRANSIENT_MARKER, AUTO_DETECT_CREATORS, AUTO_DETECT_FIELDS, AUTO_DETECT_GETTERS, AUTO_DETECT_IS_GETTERS, AUTO_DETECT_SETTERS, REQUIRE_SETTERS_FOR_GETTERS, ALLOW_FINAL_FIELDS_AS_MUTATORS, 
			INFER_PROPERTY_MUTATORS, INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES, CAN_OVERRIDE_ACCESS_MODIFIERS, OVERRIDE_PUBLIC_ACCESS_MODIFIERS, USE_STATIC_TYPING, DEFAULT_VIEW_INCLUSION, SORT_PROPERTIES_ALPHABETICALLY, ACCEPT_CASE_INSENSITIVE_PROPERTIES, ACCEPT_CASE_INSENSITIVE_ENUMS, USE_WRAPPER_NAME_AS_PROPERTY_NAME, 
			USE_STD_BEAN_NAMING, ALLOW_EXPLICIT_PROPERTY_RENAMING, ALLOW_COERCION_OF_SCALARS, IGNORE_DUPLICATE_MODULE_REGISTRATIONS, IGNORE_MERGE_FOR_UNMERGEABLE
		});
	//  175  369:bipush          25
	//  176  371:anewarray       MapperFeature[]
	//  177  374:dup             
	//  178  375:iconst_0        
	//  179  376:getstatic       #48  <Field MapperFeature USE_ANNOTATIONS>
	//  180  379:aastore         
	//  181  380:dup             
	//  182  381:iconst_1        
	//  183  382:getstatic       #51  <Field MapperFeature USE_GETTERS_AS_SETTERS>
	//  184  385:aastore         
	//  185  386:dup             
	//  186  387:iconst_2        
	//  187  388:getstatic       #54  <Field MapperFeature PROPAGATE_TRANSIENT_MARKER>
	//  188  391:aastore         
	//  189  392:dup             
	//  190  393:iconst_3        
	//  191  394:getstatic       #57  <Field MapperFeature AUTO_DETECT_CREATORS>
	//  192  397:aastore         
	//  193  398:dup             
	//  194  399:iconst_4        
	//  195  400:getstatic       #60  <Field MapperFeature AUTO_DETECT_FIELDS>
	//  196  403:aastore         
	//  197  404:dup             
	//  198  405:iconst_5        
	//  199  406:getstatic       #63  <Field MapperFeature AUTO_DETECT_GETTERS>
	//  200  409:aastore         
	//  201  410:dup             
	//  202  411:bipush          6
	//  203  413:getstatic       #66  <Field MapperFeature AUTO_DETECT_IS_GETTERS>
	//  204  416:aastore         
	//  205  417:dup             
	//  206  418:bipush          7
	//  207  420:getstatic       #69  <Field MapperFeature AUTO_DETECT_SETTERS>
	//  208  423:aastore         
	//  209  424:dup             
	//  210  425:bipush          8
	//  211  427:getstatic       #72  <Field MapperFeature REQUIRE_SETTERS_FOR_GETTERS>
	//  212  430:aastore         
	//  213  431:dup             
	//  214  432:bipush          9
	//  215  434:getstatic       #75  <Field MapperFeature ALLOW_FINAL_FIELDS_AS_MUTATORS>
	//  216  437:aastore         
	//  217  438:dup             
	//  218  439:bipush          10
	//  219  441:getstatic       #78  <Field MapperFeature INFER_PROPERTY_MUTATORS>
	//  220  444:aastore         
	//  221  445:dup             
	//  222  446:bipush          11
	//  223  448:getstatic       #81  <Field MapperFeature INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES>
	//  224  451:aastore         
	//  225  452:dup             
	//  226  453:bipush          12
	//  227  455:getstatic       #84  <Field MapperFeature CAN_OVERRIDE_ACCESS_MODIFIERS>
	//  228  458:aastore         
	//  229  459:dup             
	//  230  460:bipush          13
	//  231  462:getstatic       #87  <Field MapperFeature OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//  232  465:aastore         
	//  233  466:dup             
	//  234  467:bipush          14
	//  235  469:getstatic       #90  <Field MapperFeature USE_STATIC_TYPING>
	//  236  472:aastore         
	//  237  473:dup             
	//  238  474:bipush          15
	//  239  476:getstatic       #93  <Field MapperFeature DEFAULT_VIEW_INCLUSION>
	//  240  479:aastore         
	//  241  480:dup             
	//  242  481:bipush          16
	//  243  483:getstatic       #96  <Field MapperFeature SORT_PROPERTIES_ALPHABETICALLY>
	//  244  486:aastore         
	//  245  487:dup             
	//  246  488:bipush          17
	//  247  490:getstatic       #99  <Field MapperFeature ACCEPT_CASE_INSENSITIVE_PROPERTIES>
	//  248  493:aastore         
	//  249  494:dup             
	//  250  495:bipush          18
	//  251  497:getstatic       #102 <Field MapperFeature ACCEPT_CASE_INSENSITIVE_ENUMS>
	//  252  500:aastore         
	//  253  501:dup             
	//  254  502:bipush          19
	//  255  504:getstatic       #105 <Field MapperFeature USE_WRAPPER_NAME_AS_PROPERTY_NAME>
	//  256  507:aastore         
	//  257  508:dup             
	//  258  509:bipush          20
	//  259  511:getstatic       #108 <Field MapperFeature USE_STD_BEAN_NAMING>
	//  260  514:aastore         
	//  261  515:dup             
	//  262  516:bipush          21
	//  263  518:getstatic       #111 <Field MapperFeature ALLOW_EXPLICIT_PROPERTY_RENAMING>
	//  264  521:aastore         
	//  265  522:dup             
	//  266  523:bipush          22
	//  267  525:getstatic       #114 <Field MapperFeature ALLOW_COERCION_OF_SCALARS>
	//  268  528:aastore         
	//  269  529:dup             
	//  270  530:bipush          23
	//  271  532:getstatic       #117 <Field MapperFeature IGNORE_DUPLICATE_MODULE_REGISTRATIONS>
	//  272  535:aastore         
	//  273  536:dup             
	//  274  537:bipush          24
	//  275  539:getstatic       #120 <Field MapperFeature IGNORE_MERGE_FOR_UNMERGEABLE>
	//  276  542:aastore         
	//  277  543:putstatic       #122 <Field MapperFeature[] $VALUES>
	//* 278  546:return          
	}
}
