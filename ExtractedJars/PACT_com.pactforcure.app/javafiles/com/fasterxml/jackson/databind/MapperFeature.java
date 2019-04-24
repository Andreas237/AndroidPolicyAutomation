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
	//    3    3:invokespecial   #110 <Method void Enum(String, int)>
		_defaultState = flag;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #112 <Field boolean _defaultState>
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:invokevirtual   #116 <Method int ordinal()>
	//   11   17:ishl            
	//   12   18:putfield        #118 <Field int _mask>
	//   13   21:return          
	}

	public static MapperFeature valueOf(String s)
	{
		return (MapperFeature)Enum.valueOf(com/fasterxml/jackson/databind/MapperFeature, s);
	//    0    0:ldc1            #2   <Class MapperFeature>
	//    1    2:aload_0         
	//    2    3:invokestatic    #125 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class MapperFeature>
	//    4    9:areturn         
	}

	public static MapperFeature[] values()
	{
		return (MapperFeature[])((MapperFeature []) ($VALUES)).clone();
	//    0    0:getstatic       #106 <Field MapperFeature[] $VALUES>
	//    1    3:invokevirtual   #132 <Method Object _5B_Lcom.fasterxml.jackson.databind.MapperFeature_3B_.clone()>
	//    2    6:checkcast       #128 <Class MapperFeature[]>
	//    3    9:areturn         
	}

	public boolean enabledByDefault()
	{
		return _defaultState;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field boolean _defaultState>
	//    2    4:ireturn         
	}

	public boolean enabledIn(int i)
	{
		return (_mask & i) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field int _mask>
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
	//    1    1:getfield        #118 <Field int _mask>
	//    2    4:ireturn         
	}

	private static final MapperFeature $VALUES[];
	public static final MapperFeature ACCEPT_CASE_INSENSITIVE_PROPERTIES;
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
	//    2    4:ldc1            #38  <String "USE_ANNOTATIONS">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:invokespecial   #42  <Method void MapperFeature(String, int, boolean)>
	//    6   11:putstatic       #44  <Field MapperFeature USE_ANNOTATIONS>
		AUTO_DETECT_CREATORS = new MapperFeature("AUTO_DETECT_CREATORS", 1, true);
	//    7   14:new             #2   <Class MapperFeature>
	//    8   17:dup             
	//    9   18:ldc1            #45  <String "AUTO_DETECT_CREATORS">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #42  <Method void MapperFeature(String, int, boolean)>
	//   13   25:putstatic       #47  <Field MapperFeature AUTO_DETECT_CREATORS>
		AUTO_DETECT_FIELDS = new MapperFeature("AUTO_DETECT_FIELDS", 2, true);
	//   14   28:new             #2   <Class MapperFeature>
	//   15   31:dup             
	//   16   32:ldc1            #48  <String "AUTO_DETECT_FIELDS">
	//   17   34:iconst_2        
	//   18   35:iconst_1        
	//   19   36:invokespecial   #42  <Method void MapperFeature(String, int, boolean)>
	//   20   39:putstatic       #50  <Field MapperFeature AUTO_DETECT_FIELDS>
		AUTO_DETECT_GETTERS = new MapperFeature("AUTO_DETECT_GETTERS", 3, true);
	//   21   42:new             #2   <Class MapperFeature>
	//   22   45:dup             
	//   23   46:ldc1            #51  <String "AUTO_DETECT_GETTERS">
	//   24   48:iconst_3        
	//   25   49:iconst_1        
	//   26   50:invokespecial   #42  <Method void MapperFeature(String, int, boolean)>
	//   27   53:putstatic       #53  <Field MapperFeature AUTO_DETECT_GETTERS>
		AUTO_DETECT_IS_GETTERS = new MapperFeature("AUTO_DETECT_IS_GETTERS", 4, true);
	//   28   56:new             #2   <Class MapperFeature>
	//   29   59:dup             
	//   30   60:ldc1            #54  <String "AUTO_DETECT_IS_GETTERS">
	//   31   62:iconst_4        
	//   32   63:iconst_1        
	//   33   64:invokespecial   #42  <Method void MapperFeature(String, int, boolean)>
	//   34   67:putstatic       #56  <Field MapperFeature AUTO_DETECT_IS_GETTERS>
		AUTO_DETECT_SETTERS = new MapperFeature("AUTO_DETECT_SETTERS", 5, true);
	//   35   70:new             #2   <Class MapperFeature>
	//   36   73:dup             
	//   37   74:ldc1            #57  <String "AUTO_DETECT_SETTERS">
	//   38   76:iconst_5        
	//   39   77:iconst_1        
	//   40   78:invokespecial   #42  <Method void MapperFeature(String, int, boolean)>
	//   41   81:putstatic       #59  <Field MapperFeature AUTO_DETECT_SETTERS>
		REQUIRE_SETTERS_FOR_GETTERS = new MapperFeature("REQUIRE_SETTERS_FOR_GETTERS", 6, false);
	//   42   84:new             #2   <Class MapperFeature>
	//   43   87:dup             
	//   44   88:ldc1            #60  <String "REQUIRE_SETTERS_FOR_GETTERS">
	//   45   90:bipush          6
	//   46   92:iconst_0        
	//   47   93:invokespecial   #42  <Method void MapperFeature(String, int, boolean)>
	//   48   96:putstatic       #62  <Field MapperFeature REQUIRE_SETTERS_FOR_GETTERS>
		USE_GETTERS_AS_SETTERS = new MapperFeature("USE_GETTERS_AS_SETTERS", 7, true);
	//   49   99:new             #2   <Class MapperFeature>
	//   50  102:dup             
	//   51  103:ldc1            #63  <String "USE_GETTERS_AS_SETTERS">
	//   52  105:bipush          7
	//   53  107:iconst_1        
	//   54  108:invokespecial   #42  <Method void MapperFeature(String, int, boolean)>
	//   55  111:putstatic       #65  <Field MapperFeature USE_GETTERS_AS_SETTERS>
		CAN_OVERRIDE_ACCESS_MODIFIERS = new MapperFeature("CAN_OVERRIDE_ACCESS_MODIFIERS", 8, true);
	//   56  114:new             #2   <Class MapperFeature>
	//   57  117:dup             
	//   58  118:ldc1            #66  <String "CAN_OVERRIDE_ACCESS_MODIFIERS">
	//   59  120:bipush          8
	//   60  122:iconst_1        
	//   61  123:invokespecial   #42  <Method void MapperFeature(String, int, boolean)>
	//   62  126:putstatic       #68  <Field MapperFeature CAN_OVERRIDE_ACCESS_MODIFIERS>
		OVERRIDE_PUBLIC_ACCESS_MODIFIERS = new MapperFeature("OVERRIDE_PUBLIC_ACCESS_MODIFIERS", 9, true);
	//   63  129:new             #2   <Class MapperFeature>
	//   64  132:dup             
	//   65  133:ldc1            #69  <String "OVERRIDE_PUBLIC_ACCESS_MODIFIERS">
	//   66  135:bipush          9
	//   67  137:iconst_1        
	//   68  138:invokespecial   #42  <Method void MapperFeature(String, int, boolean)>
	//   69  141:putstatic       #71  <Field MapperFeature OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
		INFER_PROPERTY_MUTATORS = new MapperFeature("INFER_PROPERTY_MUTATORS", 10, true);
	//   70  144:new             #2   <Class MapperFeature>
	//   71  147:dup             
	//   72  148:ldc1            #72  <String "INFER_PROPERTY_MUTATORS">
	//   73  150:bipush          10
	//   74  152:iconst_1        
	//   75  153:invokespecial   #42  <Method void MapperFeature(String, int, boolean)>
	//   76  156:putstatic       #74  <Field MapperFeature INFER_PROPERTY_MUTATORS>
		ALLOW_FINAL_FIELDS_AS_MUTATORS = new MapperFeature("ALLOW_FINAL_FIELDS_AS_MUTATORS", 11, true);
	//   77  159:new             #2   <Class MapperFeature>
	//   78  162:dup             
	//   79  163:ldc1            #75  <String "ALLOW_FINAL_FIELDS_AS_MUTATORS">
	//   80  165:bipush          11
	//   81  167:iconst_1        
	//   82  168:invokespecial   #42  <Method void MapperFeature(String, int, boolean)>
	//   83  171:putstatic       #77  <Field MapperFeature ALLOW_FINAL_FIELDS_AS_MUTATORS>
		PROPAGATE_TRANSIENT_MARKER = new MapperFeature("PROPAGATE_TRANSIENT_MARKER", 12, false);
	//   84  174:new             #2   <Class MapperFeature>
	//   85  177:dup             
	//   86  178:ldc1            #78  <String "PROPAGATE_TRANSIENT_MARKER">
	//   87  180:bipush          12
	//   88  182:iconst_0        
	//   89  183:invokespecial   #42  <Method void MapperFeature(String, int, boolean)>
	//   90  186:putstatic       #80  <Field MapperFeature PROPAGATE_TRANSIENT_MARKER>
		USE_STATIC_TYPING = new MapperFeature("USE_STATIC_TYPING", 13, false);
	//   91  189:new             #2   <Class MapperFeature>
	//   92  192:dup             
	//   93  193:ldc1            #81  <String "USE_STATIC_TYPING">
	//   94  195:bipush          13
	//   95  197:iconst_0        
	//   96  198:invokespecial   #42  <Method void MapperFeature(String, int, boolean)>
	//   97  201:putstatic       #83  <Field MapperFeature USE_STATIC_TYPING>
		DEFAULT_VIEW_INCLUSION = new MapperFeature("DEFAULT_VIEW_INCLUSION", 14, true);
	//   98  204:new             #2   <Class MapperFeature>
	//   99  207:dup             
	//  100  208:ldc1            #84  <String "DEFAULT_VIEW_INCLUSION">
	//  101  210:bipush          14
	//  102  212:iconst_1        
	//  103  213:invokespecial   #42  <Method void MapperFeature(String, int, boolean)>
	//  104  216:putstatic       #86  <Field MapperFeature DEFAULT_VIEW_INCLUSION>
		SORT_PROPERTIES_ALPHABETICALLY = new MapperFeature("SORT_PROPERTIES_ALPHABETICALLY", 15, false);
	//  105  219:new             #2   <Class MapperFeature>
	//  106  222:dup             
	//  107  223:ldc1            #87  <String "SORT_PROPERTIES_ALPHABETICALLY">
	//  108  225:bipush          15
	//  109  227:iconst_0        
	//  110  228:invokespecial   #42  <Method void MapperFeature(String, int, boolean)>
	//  111  231:putstatic       #89  <Field MapperFeature SORT_PROPERTIES_ALPHABETICALLY>
		ACCEPT_CASE_INSENSITIVE_PROPERTIES = new MapperFeature("ACCEPT_CASE_INSENSITIVE_PROPERTIES", 16, false);
	//  112  234:new             #2   <Class MapperFeature>
	//  113  237:dup             
	//  114  238:ldc1            #90  <String "ACCEPT_CASE_INSENSITIVE_PROPERTIES">
	//  115  240:bipush          16
	//  116  242:iconst_0        
	//  117  243:invokespecial   #42  <Method void MapperFeature(String, int, boolean)>
	//  118  246:putstatic       #92  <Field MapperFeature ACCEPT_CASE_INSENSITIVE_PROPERTIES>
		USE_WRAPPER_NAME_AS_PROPERTY_NAME = new MapperFeature("USE_WRAPPER_NAME_AS_PROPERTY_NAME", 17, false);
	//  119  249:new             #2   <Class MapperFeature>
	//  120  252:dup             
	//  121  253:ldc1            #93  <String "USE_WRAPPER_NAME_AS_PROPERTY_NAME">
	//  122  255:bipush          17
	//  123  257:iconst_0        
	//  124  258:invokespecial   #42  <Method void MapperFeature(String, int, boolean)>
	//  125  261:putstatic       #95  <Field MapperFeature USE_WRAPPER_NAME_AS_PROPERTY_NAME>
		USE_STD_BEAN_NAMING = new MapperFeature("USE_STD_BEAN_NAMING", 18, false);
	//  126  264:new             #2   <Class MapperFeature>
	//  127  267:dup             
	//  128  268:ldc1            #96  <String "USE_STD_BEAN_NAMING">
	//  129  270:bipush          18
	//  130  272:iconst_0        
	//  131  273:invokespecial   #42  <Method void MapperFeature(String, int, boolean)>
	//  132  276:putstatic       #98  <Field MapperFeature USE_STD_BEAN_NAMING>
		ALLOW_EXPLICIT_PROPERTY_RENAMING = new MapperFeature("ALLOW_EXPLICIT_PROPERTY_RENAMING", 19, false);
	//  133  279:new             #2   <Class MapperFeature>
	//  134  282:dup             
	//  135  283:ldc1            #99  <String "ALLOW_EXPLICIT_PROPERTY_RENAMING">
	//  136  285:bipush          19
	//  137  287:iconst_0        
	//  138  288:invokespecial   #42  <Method void MapperFeature(String, int, boolean)>
	//  139  291:putstatic       #101 <Field MapperFeature ALLOW_EXPLICIT_PROPERTY_RENAMING>
		IGNORE_DUPLICATE_MODULE_REGISTRATIONS = new MapperFeature("IGNORE_DUPLICATE_MODULE_REGISTRATIONS", 20, true);
	//  140  294:new             #2   <Class MapperFeature>
	//  141  297:dup             
	//  142  298:ldc1            #102 <String "IGNORE_DUPLICATE_MODULE_REGISTRATIONS">
	//  143  300:bipush          20
	//  144  302:iconst_1        
	//  145  303:invokespecial   #42  <Method void MapperFeature(String, int, boolean)>
	//  146  306:putstatic       #104 <Field MapperFeature IGNORE_DUPLICATE_MODULE_REGISTRATIONS>
		$VALUES = (new MapperFeature[] {
			USE_ANNOTATIONS, AUTO_DETECT_CREATORS, AUTO_DETECT_FIELDS, AUTO_DETECT_GETTERS, AUTO_DETECT_IS_GETTERS, AUTO_DETECT_SETTERS, REQUIRE_SETTERS_FOR_GETTERS, USE_GETTERS_AS_SETTERS, CAN_OVERRIDE_ACCESS_MODIFIERS, OVERRIDE_PUBLIC_ACCESS_MODIFIERS, 
			INFER_PROPERTY_MUTATORS, ALLOW_FINAL_FIELDS_AS_MUTATORS, PROPAGATE_TRANSIENT_MARKER, USE_STATIC_TYPING, DEFAULT_VIEW_INCLUSION, SORT_PROPERTIES_ALPHABETICALLY, ACCEPT_CASE_INSENSITIVE_PROPERTIES, USE_WRAPPER_NAME_AS_PROPERTY_NAME, USE_STD_BEAN_NAMING, ALLOW_EXPLICIT_PROPERTY_RENAMING, 
			IGNORE_DUPLICATE_MODULE_REGISTRATIONS
		});
	//  147  309:bipush          21
	//  148  311:anewarray       MapperFeature[]
	//  149  314:dup             
	//  150  315:iconst_0        
	//  151  316:getstatic       #44  <Field MapperFeature USE_ANNOTATIONS>
	//  152  319:aastore         
	//  153  320:dup             
	//  154  321:iconst_1        
	//  155  322:getstatic       #47  <Field MapperFeature AUTO_DETECT_CREATORS>
	//  156  325:aastore         
	//  157  326:dup             
	//  158  327:iconst_2        
	//  159  328:getstatic       #50  <Field MapperFeature AUTO_DETECT_FIELDS>
	//  160  331:aastore         
	//  161  332:dup             
	//  162  333:iconst_3        
	//  163  334:getstatic       #53  <Field MapperFeature AUTO_DETECT_GETTERS>
	//  164  337:aastore         
	//  165  338:dup             
	//  166  339:iconst_4        
	//  167  340:getstatic       #56  <Field MapperFeature AUTO_DETECT_IS_GETTERS>
	//  168  343:aastore         
	//  169  344:dup             
	//  170  345:iconst_5        
	//  171  346:getstatic       #59  <Field MapperFeature AUTO_DETECT_SETTERS>
	//  172  349:aastore         
	//  173  350:dup             
	//  174  351:bipush          6
	//  175  353:getstatic       #62  <Field MapperFeature REQUIRE_SETTERS_FOR_GETTERS>
	//  176  356:aastore         
	//  177  357:dup             
	//  178  358:bipush          7
	//  179  360:getstatic       #65  <Field MapperFeature USE_GETTERS_AS_SETTERS>
	//  180  363:aastore         
	//  181  364:dup             
	//  182  365:bipush          8
	//  183  367:getstatic       #68  <Field MapperFeature CAN_OVERRIDE_ACCESS_MODIFIERS>
	//  184  370:aastore         
	//  185  371:dup             
	//  186  372:bipush          9
	//  187  374:getstatic       #71  <Field MapperFeature OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//  188  377:aastore         
	//  189  378:dup             
	//  190  379:bipush          10
	//  191  381:getstatic       #74  <Field MapperFeature INFER_PROPERTY_MUTATORS>
	//  192  384:aastore         
	//  193  385:dup             
	//  194  386:bipush          11
	//  195  388:getstatic       #77  <Field MapperFeature ALLOW_FINAL_FIELDS_AS_MUTATORS>
	//  196  391:aastore         
	//  197  392:dup             
	//  198  393:bipush          12
	//  199  395:getstatic       #80  <Field MapperFeature PROPAGATE_TRANSIENT_MARKER>
	//  200  398:aastore         
	//  201  399:dup             
	//  202  400:bipush          13
	//  203  402:getstatic       #83  <Field MapperFeature USE_STATIC_TYPING>
	//  204  405:aastore         
	//  205  406:dup             
	//  206  407:bipush          14
	//  207  409:getstatic       #86  <Field MapperFeature DEFAULT_VIEW_INCLUSION>
	//  208  412:aastore         
	//  209  413:dup             
	//  210  414:bipush          15
	//  211  416:getstatic       #89  <Field MapperFeature SORT_PROPERTIES_ALPHABETICALLY>
	//  212  419:aastore         
	//  213  420:dup             
	//  214  421:bipush          16
	//  215  423:getstatic       #92  <Field MapperFeature ACCEPT_CASE_INSENSITIVE_PROPERTIES>
	//  216  426:aastore         
	//  217  427:dup             
	//  218  428:bipush          17
	//  219  430:getstatic       #95  <Field MapperFeature USE_WRAPPER_NAME_AS_PROPERTY_NAME>
	//  220  433:aastore         
	//  221  434:dup             
	//  222  435:bipush          18
	//  223  437:getstatic       #98  <Field MapperFeature USE_STD_BEAN_NAMING>
	//  224  440:aastore         
	//  225  441:dup             
	//  226  442:bipush          19
	//  227  444:getstatic       #101 <Field MapperFeature ALLOW_EXPLICIT_PROPERTY_RENAMING>
	//  228  447:aastore         
	//  229  448:dup             
	//  230  449:bipush          20
	//  231  451:getstatic       #104 <Field MapperFeature IGNORE_DUPLICATE_MODULE_REGISTRATIONS>
	//  232  454:aastore         
	//  233  455:putstatic       #106 <Field MapperFeature[] $VALUES>
	//* 234  458:return          
	}
}
