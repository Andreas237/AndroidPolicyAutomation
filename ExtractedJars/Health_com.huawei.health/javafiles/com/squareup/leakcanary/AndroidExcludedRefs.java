// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;

import android.os.Build;
import java.util.EnumSet;
import java.util.Iterator;

// Referenced classes of package com.squareup.leakcanary:
//			ExcludedRefs

public abstract class AndroidExcludedRefs extends Enum
{

	private AndroidExcludedRefs(String s, int i)
	{
		this(s, i, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #310 <Method void AndroidExcludedRefs(String, int, boolean)>
	//    5    7:return          
	}

	AndroidExcludedRefs(String s, int i, _cls1 _pcls1)
	{
		this(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #313 <Method void AndroidExcludedRefs(String, int)>
	//    4    6:return          
	}

	private AndroidExcludedRefs(String s, int i, boolean flag)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #314 <Method void Enum(String, int)>
		applies = flag;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #316 <Field boolean applies>
	//    7   11:return          
	}

	AndroidExcludedRefs(String s, int i, boolean flag, _cls1 _pcls1)
	{
		this(s, i, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #310 <Method void AndroidExcludedRefs(String, int, boolean)>
	//    5    7:return          
	}

	public static ExcludedRefs.Builder createAndroidDefaults()
	{
		return createBuilder(EnumSet.of(((Enum) (SOFT_REFERENCES)), ((Enum) (FINALIZER_WATCHDOG_DAEMON)), ((Enum) (MAIN)), ((Enum) (LEAK_CANARY_THREAD)), ((Enum) (EVENT_RECEIVER__MMESSAGE_QUEUE))));
	//    0    0:getstatic       #282 <Field AndroidExcludedRefs SOFT_REFERENCES>
	//    1    3:getstatic       #288 <Field AndroidExcludedRefs FINALIZER_WATCHDOG_DAEMON>
	//    2    6:getstatic       #294 <Field AndroidExcludedRefs MAIN>
	//    3    9:getstatic       #300 <Field AndroidExcludedRefs LEAK_CANARY_THREAD>
	//    4   12:getstatic       #306 <Field AndroidExcludedRefs EVENT_RECEIVER__MMESSAGE_QUEUE>
	//    5   15:invokestatic    #326 <Method EnumSet EnumSet.of(Enum, Enum, Enum, Enum, Enum)>
	//    6   18:invokestatic    #330 <Method ExcludedRefs$Builder createBuilder(EnumSet)>
	//    7   21:areturn         
	}

	public static ExcludedRefs.Builder createAppDefaults()
	{
		return createBuilder(EnumSet.allOf(com/squareup/leakcanary/AndroidExcludedRefs));
	//    0    0:ldc1            #2   <Class AndroidExcludedRefs>
	//    1    2:invokestatic    #335 <Method EnumSet EnumSet.allOf(Class)>
	//    2    5:invokestatic    #330 <Method ExcludedRefs$Builder createBuilder(EnumSet)>
	//    3    8:areturn         
	}

	public static ExcludedRefs.Builder createBuilder(EnumSet enumset)
	{
		ExcludedRefs.Builder builder = ExcludedRefs.builder();
	//    0    0:invokestatic    #340 <Method ExcludedRefs$Builder ExcludedRefs.builder()>
	//    1    3:astore_1        
		enumset = ((EnumSet) (enumset.iterator()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #344 <Method Iterator EnumSet.iterator()>
	//    4    8:astore_0        
		do
		{
			if(!((Iterator) (enumset)).hasNext())
				break;
	//    5    9:aload_0         
	//    6   10:invokeinterface #350 <Method boolean Iterator.hasNext()>
	//    7   15:ifeq            55
			AndroidExcludedRefs androidexcludedrefs = (AndroidExcludedRefs)((Iterator) (enumset)).next();
	//    8   18:aload_0         
	//    9   19:invokeinterface #354 <Method Object Iterator.next()>
	//   10   24:checkcast       #2   <Class AndroidExcludedRefs>
	//   11   27:astore_2        
			if(androidexcludedrefs.applies)
	//*  12   28:aload_2         
	//*  13   29:getfield        #316 <Field boolean applies>
	//*  14   32:ifeq            52
			{
				androidexcludedrefs.add(builder);
	//   15   35:aload_2         
	//   16   36:aload_1         
	//   17   37:invokevirtual   #358 <Method void add(ExcludedRefs$Builder)>
				((ExcludedRefs.BuilderWithParams)builder).named(androidexcludedrefs.name());
	//   18   40:aload_1         
	//   19   41:checkcast       #360 <Class ExcludedRefs$BuilderWithParams>
	//   20   44:aload_2         
	//   21   45:invokevirtual   #364 <Method String name()>
	//   22   48:invokevirtual   #368 <Method ExcludedRefs$BuilderWithParams ExcludedRefs$BuilderWithParams.named(String)>
	//   23   51:pop             
			}
		} while(true);
	//   24   52:goto            9
		return builder;
	//   25   55:aload_1         
	//   26   56:areturn         
	}

	public static AndroidExcludedRefs valueOf(String s)
	{
		return (AndroidExcludedRefs)Enum.valueOf(com/squareup/leakcanary/AndroidExcludedRefs, s);
	//    0    0:ldc1            #2   <Class AndroidExcludedRefs>
	//    1    2:aload_0         
	//    2    3:invokestatic    #374 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AndroidExcludedRefs>
	//    4    9:areturn         
	}

	public static AndroidExcludedRefs[] values()
	{
		return (AndroidExcludedRefs[])((AndroidExcludedRefs []) ($VALUES)).clone();
	//    0    0:getstatic       #308 <Field AndroidExcludedRefs[] $VALUES>
	//    1    3:invokevirtual   #380 <Method Object _5B_Lcom.squareup.leakcanary.AndroidExcludedRefs_3B_.clone()>
	//    2    6:checkcast       #377 <Class AndroidExcludedRefs[]>
	//    3    9:areturn         
	}

	abstract void add(ExcludedRefs.Builder builder);

	private static final AndroidExcludedRefs $VALUES[];
	public static final AndroidExcludedRefs ACCOUNT_MANAGER;
	public static final AndroidExcludedRefs ACTIVITY_CHOOSE_MODEL;
	public static final AndroidExcludedRefs ACTIVITY_CLIENT_RECORD__NEXT_IDLE;
	public static final AndroidExcludedRefs ACTIVITY_MANAGER_MCONTEXT;
	public static final AndroidExcludedRefs APP_WIDGET_HOST_CALLBACKS;
	public static final AndroidExcludedRefs AUDIO_MANAGER;
	public static final AndroidExcludedRefs AUDIO_MANAGER__MCONTEXT_STATIC;
	public static final AndroidExcludedRefs AW_RESOURCE__SRESOURCES;
	public static final AndroidExcludedRefs BLOCKING_QUEUE;
	public static final AndroidExcludedRefs BUBBLE_POPUP_HELPER__SHELPER;
	public static final AndroidExcludedRefs CLIPBOARD_UI_MANAGER__SINSTANCE;
	public static final AndroidExcludedRefs CONNECTIVITY_MANAGER__SINSTANCE;
	public static final AndroidExcludedRefs DEVICE_POLICY_MANAGER__SETTINGS_OBSERVER;
	public static final AndroidExcludedRefs EDITTEXT_BLINK_MESSAGEQUEUE;
	public static final AndroidExcludedRefs EVENT_RECEIVER__MMESSAGE_QUEUE;
	public static final AndroidExcludedRefs FINALIZER_WATCHDOG_DAEMON;
	public static final AndroidExcludedRefs INPUT_METHOD_MANAGER__ROOT_VIEW;
	public static final AndroidExcludedRefs INPUT_METHOD_MANAGER__SERVED_VIEW;
	public static final AndroidExcludedRefs INSTRUMENTATION_RECOMMEND_ACTIVITY;
	public static final AndroidExcludedRefs LAYOUT_TRANSITION;
	public static final AndroidExcludedRefs LEAK_CANARY_THREAD;
	public static final AndroidExcludedRefs MAIN;
	public static final AndroidExcludedRefs MAPPER_CLIENT;
	public static final AndroidExcludedRefs MEDIA_SCANNER_CONNECTION;
	public static final AndroidExcludedRefs MEDIA_SESSION_LEGACY_HELPER__SINSTANCE;
	public static final AndroidExcludedRefs PERSONA_MANAGER;
	public static final AndroidExcludedRefs RESOURCES__MCONTEXT;
	public static final AndroidExcludedRefs SOFT_REFERENCES;
	public static final AndroidExcludedRefs SPAN_CONTROLLER;
	public static final AndroidExcludedRefs SPEECH_RECOGNIZER;
	public static final AndroidExcludedRefs SPELL_CHECKER_SESSION;
	public static final AndroidExcludedRefs SPEN_GESTURE_MANAGER;
	public static final AndroidExcludedRefs SYSTEM_SENSOR_MANAGER_LENOVO;
	public static final AndroidExcludedRefs TEXT_LINE__SCACHED;
	public static final AndroidExcludedRefs TEXT_VIEW__MLAST_HOVERED_VIEW;
	public static final AndroidExcludedRefs USER_MANAGER__SINSTANCE;
	public static final AndroidExcludedRefs VIEW_CONFIGURATION__MCONTEXT;
	final boolean applies;

	static 
	{
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 19 && android.os.Build.VERSION.SDK_INT <= 21)
	//*   0    0:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          21
	//*   3    8:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   11:bipush          21
	//*   5   13:icmpgt          21
			flag = true;
	//    6   16:iconst_1        
	//    7   17:istore_0        
		else
	//*   8   18:goto            23
			flag = false;
	//    9   21:iconst_0        
	//   10   22:istore_0        
		ACTIVITY_CLIENT_RECORD__NEXT_IDLE = ((AndroidExcludedRefs) (new _cls1("ACTIVITY_CLIENT_RECORD__NEXT_IDLE", 0, flag)));
	//   11   23:new             #57  <Class AndroidExcludedRefs$1>
	//   12   26:dup             
	//   13   27:ldc1            #58  <String "ACTIVITY_CLIENT_RECORD__NEXT_IDLE">
	//   14   29:iconst_0        
	//   15   30:iload_0         
	//   16   31:invokespecial   #62  <Method void AndroidExcludedRefs$1(String, int, boolean)>
	//   17   34:putstatic       #64  <Field AndroidExcludedRefs ACTIVITY_CLIENT_RECORD__NEXT_IDLE>
		if(android.os.Build.VERSION.SDK_INT <= 19)
	//*  18   37:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//*  19   40:bipush          19
	//*  20   42:icmpgt          50
			flag = true;
	//   21   45:iconst_1        
	//   22   46:istore_0        
		else
	//*  23   47:goto            52
			flag = false;
	//   24   50:iconst_0        
	//   25   51:istore_0        
		SPAN_CONTROLLER = ((AndroidExcludedRefs) (new _cls2("SPAN_CONTROLLER", 1, flag)));
	//   26   52:new             #66  <Class AndroidExcludedRefs$2>
	//   27   55:dup             
	//   28   56:ldc1            #67  <String "SPAN_CONTROLLER">
	//   29   58:iconst_1        
	//   30   59:iload_0         
	//   31   60:invokespecial   #68  <Method void AndroidExcludedRefs$2(String, int, boolean)>
	//   32   63:putstatic       #70  <Field AndroidExcludedRefs SPAN_CONTROLLER>
		if(android.os.Build.VERSION.SDK_INT == 21)
	//*  33   66:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//*  34   69:bipush          21
	//*  35   71:icmpne          79
			flag = true;
	//   36   74:iconst_1        
	//   37   75:istore_0        
		else
	//*  38   76:goto            81
			flag = false;
	//   39   79:iconst_0        
	//   40   80:istore_0        
		MEDIA_SESSION_LEGACY_HELPER__SINSTANCE = ((AndroidExcludedRefs) (new _cls3("MEDIA_SESSION_LEGACY_HELPER__SINSTANCE", 2, flag)));
	//   41   81:new             #72  <Class AndroidExcludedRefs$3>
	//   42   84:dup             
	//   43   85:ldc1            #73  <String "MEDIA_SESSION_LEGACY_HELPER__SINSTANCE">
	//   44   87:iconst_2        
	//   45   88:iload_0         
	//   46   89:invokespecial   #74  <Method void AndroidExcludedRefs$3(String, int, boolean)>
	//   47   92:putstatic       #76  <Field AndroidExcludedRefs MEDIA_SESSION_LEGACY_HELPER__SINSTANCE>
		if(android.os.Build.VERSION.SDK_INT <= 22)
	//*  48   95:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//*  49   98:bipush          22
	//*  50  100:icmpgt          108
			flag = true;
	//   51  103:iconst_1        
	//   52  104:istore_0        
		else
	//*  53  105:goto            110
			flag = false;
	//   54  108:iconst_0        
	//   55  109:istore_0        
		TEXT_LINE__SCACHED = ((AndroidExcludedRefs) (new _cls4("TEXT_LINE__SCACHED", 3, flag)));
	//   56  110:new             #78  <Class AndroidExcludedRefs$4>
	//   57  113:dup             
	//   58  114:ldc1            #79  <String "TEXT_LINE__SCACHED">
	//   59  116:iconst_3        
	//   60  117:iload_0         
	//   61  118:invokespecial   #80  <Method void AndroidExcludedRefs$4(String, int, boolean)>
	//   62  121:putstatic       #82  <Field AndroidExcludedRefs TEXT_LINE__SCACHED>
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*  63  124:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//*  64  127:bipush          21
	//*  65  129:icmpge          137
			flag = true;
	//   66  132:iconst_1        
	//   67  133:istore_0        
		else
	//*  68  134:goto            139
			flag = false;
	//   69  137:iconst_0        
	//   70  138:istore_0        
		BLOCKING_QUEUE = ((AndroidExcludedRefs) (new _cls5("BLOCKING_QUEUE", 4, flag)));
	//   71  139:new             #84  <Class AndroidExcludedRefs$5>
	//   72  142:dup             
	//   73  143:ldc1            #85  <String "BLOCKING_QUEUE">
	//   74  145:iconst_4        
	//   75  146:iload_0         
	//   76  147:invokespecial   #86  <Method void AndroidExcludedRefs$5(String, int, boolean)>
	//   77  150:putstatic       #88  <Field AndroidExcludedRefs BLOCKING_QUEUE>
		if(android.os.Build.VERSION.SDK_INT >= 15 && android.os.Build.VERSION.SDK_INT <= 23)
	//*  78  153:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//*  79  156:bipush          15
	//*  80  158:icmplt          174
	//*  81  161:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//*  82  164:bipush          23
	//*  83  166:icmpgt          174
			flag = true;
	//   84  169:iconst_1        
	//   85  170:istore_0        
		else
	//*  86  171:goto            176
			flag = false;
	//   87  174:iconst_0        
	//   88  175:istore_0        
		INPUT_METHOD_MANAGER__SERVED_VIEW = ((AndroidExcludedRefs) (new _cls6("INPUT_METHOD_MANAGER__SERVED_VIEW", 5, flag)));
	//   89  176:new             #90  <Class AndroidExcludedRefs$6>
	//   90  179:dup             
	//   91  180:ldc1            #91  <String "INPUT_METHOD_MANAGER__SERVED_VIEW">
	//   92  182:iconst_5        
	//   93  183:iload_0         
	//   94  184:invokespecial   #92  <Method void AndroidExcludedRefs$6(String, int, boolean)>
	//   95  187:putstatic       #94  <Field AndroidExcludedRefs INPUT_METHOD_MANAGER__SERVED_VIEW>
		if(android.os.Build.VERSION.SDK_INT >= 15 && android.os.Build.VERSION.SDK_INT <= 23)
	//*  96  190:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//*  97  193:bipush          15
	//*  98  195:icmplt          211
	//*  99  198:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 100  201:bipush          23
	//* 101  203:icmpgt          211
			flag = true;
	//  102  206:iconst_1        
	//  103  207:istore_0        
		else
	//* 104  208:goto            213
			flag = false;
	//  105  211:iconst_0        
	//  106  212:istore_0        
		INPUT_METHOD_MANAGER__ROOT_VIEW = ((AndroidExcludedRefs) (new _cls7("INPUT_METHOD_MANAGER__ROOT_VIEW", 6, flag)));
	//  107  213:new             #96  <Class AndroidExcludedRefs$7>
	//  108  216:dup             
	//  109  217:ldc1            #97  <String "INPUT_METHOD_MANAGER__ROOT_VIEW">
	//  110  219:bipush          6
	//  111  221:iload_0         
	//  112  222:invokespecial   #98  <Method void AndroidExcludedRefs$7(String, int, boolean)>
	//  113  225:putstatic       #100 <Field AndroidExcludedRefs INPUT_METHOD_MANAGER__ROOT_VIEW>
		if(android.os.Build.VERSION.SDK_INT >= 14 && android.os.Build.VERSION.SDK_INT <= 22)
	//* 114  228:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 115  231:bipush          14
	//* 116  233:icmplt          249
	//* 117  236:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 118  239:bipush          22
	//* 119  241:icmpgt          249
			flag = true;
	//  120  244:iconst_1        
	//  121  245:istore_0        
		else
	//* 122  246:goto            251
			flag = false;
	//  123  249:iconst_0        
	//  124  250:istore_0        
		LAYOUT_TRANSITION = ((AndroidExcludedRefs) (new _cls8("LAYOUT_TRANSITION", 7, flag)));
	//  125  251:new             #102 <Class AndroidExcludedRefs$8>
	//  126  254:dup             
	//  127  255:ldc1            #103 <String "LAYOUT_TRANSITION">
	//  128  257:bipush          7
	//  129  259:iload_0         
	//  130  260:invokespecial   #104 <Method void AndroidExcludedRefs$8(String, int, boolean)>
	//  131  263:putstatic       #106 <Field AndroidExcludedRefs LAYOUT_TRANSITION>
		if(android.os.Build.VERSION.SDK_INT >= 16 && android.os.Build.VERSION.SDK_INT <= 22 || android.os.Build.VERSION.SDK_INT >= 24)
	//* 132  266:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 133  269:bipush          16
	//* 134  271:icmplt          282
	//* 135  274:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 136  277:bipush          22
	//* 137  279:icmple          290
	//* 138  282:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 139  285:bipush          24
	//* 140  287:icmplt          295
			flag = true;
	//  141  290:iconst_1        
	//  142  291:istore_0        
		else
	//* 143  292:goto            297
			flag = false;
	//  144  295:iconst_0        
	//  145  296:istore_0        
		SPELL_CHECKER_SESSION = ((AndroidExcludedRefs) (new _cls9("SPELL_CHECKER_SESSION", 8, flag)));
	//  146  297:new             #108 <Class AndroidExcludedRefs$9>
	//  147  300:dup             
	//  148  301:ldc1            #109 <String "SPELL_CHECKER_SESSION">
	//  149  303:bipush          8
	//  150  305:iload_0         
	//  151  306:invokespecial   #110 <Method void AndroidExcludedRefs$9(String, int, boolean)>
	//  152  309:putstatic       #112 <Field AndroidExcludedRefs SPELL_CHECKER_SESSION>
		if(android.os.Build.VERSION.SDK_INT > 14 && android.os.Build.VERSION.SDK_INT <= 22)
	//* 153  312:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 154  315:bipush          14
	//* 155  317:icmple          333
	//* 156  320:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 157  323:bipush          22
	//* 158  325:icmpgt          333
			flag = true;
	//  159  328:iconst_1        
	//  160  329:istore_0        
		else
	//* 161  330:goto            335
			flag = false;
	//  162  333:iconst_0        
	//  163  334:istore_0        
		ACTIVITY_CHOOSE_MODEL = ((AndroidExcludedRefs) (new _cls10("ACTIVITY_CHOOSE_MODEL", 9, flag)));
	//  164  335:new             #114 <Class AndroidExcludedRefs$10>
	//  165  338:dup             
	//  166  339:ldc1            #115 <String "ACTIVITY_CHOOSE_MODEL">
	//  167  341:bipush          9
	//  168  343:iload_0         
	//  169  344:invokespecial   #116 <Method void AndroidExcludedRefs$10(String, int, boolean)>
	//  170  347:putstatic       #118 <Field AndroidExcludedRefs ACTIVITY_CHOOSE_MODEL>
		if(android.os.Build.VERSION.SDK_INT < 21)
	//* 171  350:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 172  353:bipush          21
	//* 173  355:icmpge          363
			flag = true;
	//  174  358:iconst_1        
	//  175  359:istore_0        
		else
	//* 176  360:goto            365
			flag = false;
	//  177  363:iconst_0        
	//  178  364:istore_0        
		SPEECH_RECOGNIZER = ((AndroidExcludedRefs) (new _cls11("SPEECH_RECOGNIZER", 10, flag)));
	//  179  365:new             #120 <Class AndroidExcludedRefs$11>
	//  180  368:dup             
	//  181  369:ldc1            #121 <String "SPEECH_RECOGNIZER">
	//  182  371:bipush          10
	//  183  373:iload_0         
	//  184  374:invokespecial   #122 <Method void AndroidExcludedRefs$11(String, int, boolean)>
	//  185  377:putstatic       #124 <Field AndroidExcludedRefs SPEECH_RECOGNIZER>
		if(android.os.Build.VERSION.SDK_INT <= 22)
	//* 186  380:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 187  383:bipush          22
	//* 188  385:icmpgt          393
			flag = true;
	//  189  388:iconst_1        
	//  190  389:istore_0        
		else
	//* 191  390:goto            395
			flag = false;
	//  192  393:iconst_0        
	//  193  394:istore_0        
		ACCOUNT_MANAGER = ((AndroidExcludedRefs) (new _cls12("ACCOUNT_MANAGER", 11, flag)));
	//  194  395:new             #126 <Class AndroidExcludedRefs$12>
	//  195  398:dup             
	//  196  399:ldc1            #127 <String "ACCOUNT_MANAGER">
	//  197  401:bipush          11
	//  198  403:iload_0         
	//  199  404:invokespecial   #128 <Method void AndroidExcludedRefs$12(String, int, boolean)>
	//  200  407:putstatic       #130 <Field AndroidExcludedRefs ACCOUNT_MANAGER>
		if(android.os.Build.VERSION.SDK_INT <= 22)
	//* 201  410:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 202  413:bipush          22
	//* 203  415:icmpgt          423
			flag = true;
	//  204  418:iconst_1        
	//  205  419:istore_0        
		else
	//* 206  420:goto            425
			flag = false;
	//  207  423:iconst_0        
	//  208  424:istore_0        
		MEDIA_SCANNER_CONNECTION = ((AndroidExcludedRefs) (new _cls13("MEDIA_SCANNER_CONNECTION", 12, flag)));
	//  209  425:new             #132 <Class AndroidExcludedRefs$13>
	//  210  428:dup             
	//  211  429:ldc1            #133 <String "MEDIA_SCANNER_CONNECTION">
	//  212  431:bipush          12
	//  213  433:iload_0         
	//  214  434:invokespecial   #134 <Method void AndroidExcludedRefs$13(String, int, boolean)>
	//  215  437:putstatic       #136 <Field AndroidExcludedRefs MEDIA_SCANNER_CONNECTION>
		if(android.os.Build.VERSION.SDK_INT >= 16 && android.os.Build.VERSION.SDK_INT <= 23)
	//* 216  440:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 217  443:bipush          16
	//* 218  445:icmplt          461
	//* 219  448:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 220  451:bipush          23
	//* 221  453:icmpgt          461
			flag = true;
	//  222  456:iconst_1        
	//  223  457:istore_0        
		else
	//* 224  458:goto            463
			flag = false;
	//  225  461:iconst_0        
	//  226  462:istore_0        
		USER_MANAGER__SINSTANCE = ((AndroidExcludedRefs) (new _cls14("USER_MANAGER__SINSTANCE", 13, flag)));
	//  227  463:new             #138 <Class AndroidExcludedRefs$14>
	//  228  466:dup             
	//  229  467:ldc1            #139 <String "USER_MANAGER__SINSTANCE">
	//  230  469:bipush          13
	//  231  471:iload_0         
	//  232  472:invokespecial   #140 <Method void AndroidExcludedRefs$14(String, int, boolean)>
	//  233  475:putstatic       #142 <Field AndroidExcludedRefs USER_MANAGER__SINSTANCE>
		if(android.os.Build.VERSION.SDK_INT < 22)
	//* 234  478:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 235  481:bipush          22
	//* 236  483:icmpge          491
			flag = true;
	//  237  486:iconst_1        
	//  238  487:istore_0        
		else
	//* 239  488:goto            493
			flag = false;
	//  240  491:iconst_0        
	//  241  492:istore_0        
		APP_WIDGET_HOST_CALLBACKS = ((AndroidExcludedRefs) (new _cls15("APP_WIDGET_HOST_CALLBACKS", 14, flag)));
	//  242  493:new             #144 <Class AndroidExcludedRefs$15>
	//  243  496:dup             
	//  244  497:ldc1            #145 <String "APP_WIDGET_HOST_CALLBACKS">
	//  245  499:bipush          14
	//  246  501:iload_0         
	//  247  502:invokespecial   #146 <Method void AndroidExcludedRefs$15(String, int, boolean)>
	//  248  505:putstatic       #148 <Field AndroidExcludedRefs APP_WIDGET_HOST_CALLBACKS>
		if(android.os.Build.VERSION.SDK_INT <= 22)
	//* 249  508:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 250  511:bipush          22
	//* 251  513:icmpgt          521
			flag = true;
	//  252  516:iconst_1        
	//  253  517:istore_0        
		else
	//* 254  518:goto            523
			flag = false;
	//  255  521:iconst_0        
	//  256  522:istore_0        
		AUDIO_MANAGER = ((AndroidExcludedRefs) (new _cls16("AUDIO_MANAGER", 15, flag)));
	//  257  523:new             #150 <Class AndroidExcludedRefs$16>
	//  258  526:dup             
	//  259  527:ldc1            #151 <String "AUDIO_MANAGER">
	//  260  529:bipush          15
	//  261  531:iload_0         
	//  262  532:invokespecial   #152 <Method void AndroidExcludedRefs$16(String, int, boolean)>
	//  263  535:putstatic       #154 <Field AndroidExcludedRefs AUDIO_MANAGER>
		if(android.os.Build.VERSION.SDK_INT <= 22)
	//* 264  538:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 265  541:bipush          22
	//* 266  543:icmpgt          551
			flag = true;
	//  267  546:iconst_1        
	//  268  547:istore_0        
		else
	//* 269  548:goto            553
			flag = false;
	//  270  551:iconst_0        
	//  271  552:istore_0        
		EDITTEXT_BLINK_MESSAGEQUEUE = ((AndroidExcludedRefs) (new _cls17("EDITTEXT_BLINK_MESSAGEQUEUE", 16, flag)));
	//  272  553:new             #156 <Class AndroidExcludedRefs$17>
	//  273  556:dup             
	//  274  557:ldc1            #157 <String "EDITTEXT_BLINK_MESSAGEQUEUE">
	//  275  559:bipush          16
	//  276  561:iload_0         
	//  277  562:invokespecial   #158 <Method void AndroidExcludedRefs$17(String, int, boolean)>
	//  278  565:putstatic       #160 <Field AndroidExcludedRefs EDITTEXT_BLINK_MESSAGEQUEUE>
		if(android.os.Build.VERSION.SDK_INT <= 23)
	//* 279  568:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 280  571:bipush          23
	//* 281  573:icmpgt          581
			flag = true;
	//  282  576:iconst_1        
	//  283  577:istore_0        
		else
	//* 284  578:goto            583
			flag = false;
	//  285  581:iconst_0        
	//  286  582:istore_0        
		CONNECTIVITY_MANAGER__SINSTANCE = ((AndroidExcludedRefs) (new _cls18("CONNECTIVITY_MANAGER__SINSTANCE", 17, flag)));
	//  287  583:new             #162 <Class AndroidExcludedRefs$18>
	//  288  586:dup             
	//  289  587:ldc1            #163 <String "CONNECTIVITY_MANAGER__SINSTANCE">
	//  290  589:bipush          17
	//  291  591:iload_0         
	//  292  592:invokespecial   #164 <Method void AndroidExcludedRefs$18(String, int, boolean)>
	//  293  595:putstatic       #166 <Field AndroidExcludedRefs CONNECTIVITY_MANAGER__SINSTANCE>
		if("Meizu".equals(((Object) (Build.MANUFACTURER))) && android.os.Build.VERSION.SDK_INT >= 21 && android.os.Build.VERSION.SDK_INT <= 22)
	//* 294  598:ldc1            #168 <String "Meizu">
	//* 295  600:getstatic       #174 <Field String Build.MANUFACTURER>
	//* 296  603:invokevirtual   #180 <Method boolean String.equals(Object)>
	//* 297  606:ifeq            630
	//* 298  609:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 299  612:bipush          21
	//* 300  614:icmplt          630
	//* 301  617:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 302  620:bipush          22
	//* 303  622:icmpgt          630
			flag = true;
	//  304  625:iconst_1        
	//  305  626:istore_0        
		else
	//* 306  627:goto            632
			flag = false;
	//  307  630:iconst_0        
	//  308  631:istore_0        
		INSTRUMENTATION_RECOMMEND_ACTIVITY = ((AndroidExcludedRefs) (new _cls19("INSTRUMENTATION_RECOMMEND_ACTIVITY", 18, flag)));
	//  309  632:new             #182 <Class AndroidExcludedRefs$19>
	//  310  635:dup             
	//  311  636:ldc1            #183 <String "INSTRUMENTATION_RECOMMEND_ACTIVITY">
	//  312  638:bipush          18
	//  313  640:iload_0         
	//  314  641:invokespecial   #184 <Method void AndroidExcludedRefs$19(String, int, boolean)>
	//  315  644:putstatic       #186 <Field AndroidExcludedRefs INSTRUMENTATION_RECOMMEND_ACTIVITY>
		if("motorola".equals(((Object) (Build.MANUFACTURER))) && android.os.Build.VERSION.SDK_INT >= 19 && android.os.Build.VERSION.SDK_INT <= 22)
	//* 316  647:ldc1            #188 <String "motorola">
	//* 317  649:getstatic       #174 <Field String Build.MANUFACTURER>
	//* 318  652:invokevirtual   #180 <Method boolean String.equals(Object)>
	//* 319  655:ifeq            679
	//* 320  658:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 321  661:bipush          19
	//* 322  663:icmplt          679
	//* 323  666:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 324  669:bipush          22
	//* 325  671:icmpgt          679
			flag = true;
	//  326  674:iconst_1        
	//  327  675:istore_0        
		else
	//* 328  676:goto            681
			flag = false;
	//  329  679:iconst_0        
	//  330  680:istore_0        
		DEVICE_POLICY_MANAGER__SETTINGS_OBSERVER = ((AndroidExcludedRefs) (new _cls20("DEVICE_POLICY_MANAGER__SETTINGS_OBSERVER", 19, flag)));
	//  331  681:new             #190 <Class AndroidExcludedRefs$20>
	//  332  684:dup             
	//  333  685:ldc1            #191 <String "DEVICE_POLICY_MANAGER__SETTINGS_OBSERVER">
	//  334  687:bipush          19
	//  335  689:iload_0         
	//  336  690:invokespecial   #192 <Method void AndroidExcludedRefs$20(String, int, boolean)>
	//  337  693:putstatic       #194 <Field AndroidExcludedRefs DEVICE_POLICY_MANAGER__SETTINGS_OBSERVER>
		if("samsung".equals(((Object) (Build.MANUFACTURER))) && android.os.Build.VERSION.SDK_INT == 19)
	//* 338  696:ldc1            #196 <String "samsung">
	//* 339  698:getstatic       #174 <Field String Build.MANUFACTURER>
	//* 340  701:invokevirtual   #180 <Method boolean String.equals(Object)>
	//* 341  704:ifeq            720
	//* 342  707:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 343  710:bipush          19
	//* 344  712:icmpne          720
			flag = true;
	//  345  715:iconst_1        
	//  346  716:istore_0        
		else
	//* 347  717:goto            722
			flag = false;
	//  348  720:iconst_0        
	//  349  721:istore_0        
		SPEN_GESTURE_MANAGER = ((AndroidExcludedRefs) (new _cls21("SPEN_GESTURE_MANAGER", 20, flag)));
	//  350  722:new             #198 <Class AndroidExcludedRefs$21>
	//  351  725:dup             
	//  352  726:ldc1            #199 <String "SPEN_GESTURE_MANAGER">
	//  353  728:bipush          20
	//  354  730:iload_0         
	//  355  731:invokespecial   #200 <Method void AndroidExcludedRefs$21(String, int, boolean)>
	//  356  734:putstatic       #202 <Field AndroidExcludedRefs SPEN_GESTURE_MANAGER>
		if("samsung".equals(((Object) (Build.MANUFACTURER))) && android.os.Build.VERSION.SDK_INT >= 19 && android.os.Build.VERSION.SDK_INT <= 21)
	//* 357  737:ldc1            #196 <String "samsung">
	//* 358  739:getstatic       #174 <Field String Build.MANUFACTURER>
	//* 359  742:invokevirtual   #180 <Method boolean String.equals(Object)>
	//* 360  745:ifeq            769
	//* 361  748:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 362  751:bipush          19
	//* 363  753:icmplt          769
	//* 364  756:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 365  759:bipush          21
	//* 366  761:icmpgt          769
			flag = true;
	//  367  764:iconst_1        
	//  368  765:istore_0        
		else
	//* 369  766:goto            771
			flag = false;
	//  370  769:iconst_0        
	//  371  770:istore_0        
		CLIPBOARD_UI_MANAGER__SINSTANCE = ((AndroidExcludedRefs) (new _cls22("CLIPBOARD_UI_MANAGER__SINSTANCE", 21, flag)));
	//  372  771:new             #204 <Class AndroidExcludedRefs$22>
	//  373  774:dup             
	//  374  775:ldc1            #205 <String "CLIPBOARD_UI_MANAGER__SINSTANCE">
	//  375  777:bipush          21
	//  376  779:iload_0         
	//  377  780:invokespecial   #206 <Method void AndroidExcludedRefs$22(String, int, boolean)>
	//  378  783:putstatic       #208 <Field AndroidExcludedRefs CLIPBOARD_UI_MANAGER__SINSTANCE>
		if("LGE".equals(((Object) (Build.MANUFACTURER))) && android.os.Build.VERSION.SDK_INT >= 19 && android.os.Build.VERSION.SDK_INT <= 21)
	//* 379  786:ldc1            #210 <String "LGE">
	//* 380  788:getstatic       #174 <Field String Build.MANUFACTURER>
	//* 381  791:invokevirtual   #180 <Method boolean String.equals(Object)>
	//* 382  794:ifeq            818
	//* 383  797:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 384  800:bipush          19
	//* 385  802:icmplt          818
	//* 386  805:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 387  808:bipush          21
	//* 388  810:icmpgt          818
			flag = true;
	//  389  813:iconst_1        
	//  390  814:istore_0        
		else
	//* 391  815:goto            820
			flag = false;
	//  392  818:iconst_0        
	//  393  819:istore_0        
		BUBBLE_POPUP_HELPER__SHELPER = ((AndroidExcludedRefs) (new _cls23("BUBBLE_POPUP_HELPER__SHELPER", 22, flag)));
	//  394  820:new             #212 <Class AndroidExcludedRefs$23>
	//  395  823:dup             
	//  396  824:ldc1            #213 <String "BUBBLE_POPUP_HELPER__SHELPER">
	//  397  826:bipush          22
	//  398  828:iload_0         
	//  399  829:invokespecial   #214 <Method void AndroidExcludedRefs$23(String, int, boolean)>
	//  400  832:putstatic       #216 <Field AndroidExcludedRefs BUBBLE_POPUP_HELPER__SHELPER>
		if("samsung".equals(((Object) (Build.MANUFACTURER))) && android.os.Build.VERSION.SDK_INT == 19)
	//* 401  835:ldc1            #196 <String "samsung">
	//* 402  837:getstatic       #174 <Field String Build.MANUFACTURER>
	//* 403  840:invokevirtual   #180 <Method boolean String.equals(Object)>
	//* 404  843:ifeq            859
	//* 405  846:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 406  849:bipush          19
	//* 407  851:icmpne          859
			flag = true;
	//  408  854:iconst_1        
	//  409  855:istore_0        
		else
	//* 410  856:goto            861
			flag = false;
	//  411  859:iconst_0        
	//  412  860:istore_0        
		AW_RESOURCE__SRESOURCES = ((AndroidExcludedRefs) (new _cls24("AW_RESOURCE__SRESOURCES", 23, flag)));
	//  413  861:new             #218 <Class AndroidExcludedRefs$24>
	//  414  864:dup             
	//  415  865:ldc1            #219 <String "AW_RESOURCE__SRESOURCES">
	//  416  867:bipush          23
	//  417  869:iload_0         
	//  418  870:invokespecial   #220 <Method void AndroidExcludedRefs$24(String, int, boolean)>
	//  419  873:putstatic       #222 <Field AndroidExcludedRefs AW_RESOURCE__SRESOURCES>
		if("NVIDIA".equals(((Object) (Build.MANUFACTURER))) && android.os.Build.VERSION.SDK_INT == 19)
	//* 420  876:ldc1            #224 <String "NVIDIA">
	//* 421  878:getstatic       #174 <Field String Build.MANUFACTURER>
	//* 422  881:invokevirtual   #180 <Method boolean String.equals(Object)>
	//* 423  884:ifeq            900
	//* 424  887:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 425  890:bipush          19
	//* 426  892:icmpne          900
			flag = true;
	//  427  895:iconst_1        
	//  428  896:istore_0        
		else
	//* 429  897:goto            902
			flag = false;
	//  430  900:iconst_0        
	//  431  901:istore_0        
		MAPPER_CLIENT = ((AndroidExcludedRefs) (new _cls25("MAPPER_CLIENT", 24, flag)));
	//  432  902:new             #226 <Class AndroidExcludedRefs$25>
	//  433  905:dup             
	//  434  906:ldc1            #227 <String "MAPPER_CLIENT">
	//  435  908:bipush          24
	//  436  910:iload_0         
	//  437  911:invokespecial   #228 <Method void AndroidExcludedRefs$25(String, int, boolean)>
	//  438  914:putstatic       #230 <Field AndroidExcludedRefs MAPPER_CLIENT>
		if("samsung".equals(((Object) (Build.MANUFACTURER))) && android.os.Build.VERSION.SDK_INT >= 19 && android.os.Build.VERSION.SDK_INT <= 22)
	//* 439  917:ldc1            #196 <String "samsung">
	//* 440  919:getstatic       #174 <Field String Build.MANUFACTURER>
	//* 441  922:invokevirtual   #180 <Method boolean String.equals(Object)>
	//* 442  925:ifeq            949
	//* 443  928:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 444  931:bipush          19
	//* 445  933:icmplt          949
	//* 446  936:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 447  939:bipush          22
	//* 448  941:icmpgt          949
			flag = true;
	//  449  944:iconst_1        
	//  450  945:istore_0        
		else
	//* 451  946:goto            951
			flag = false;
	//  452  949:iconst_0        
	//  453  950:istore_0        
		TEXT_VIEW__MLAST_HOVERED_VIEW = ((AndroidExcludedRefs) (new _cls26("TEXT_VIEW__MLAST_HOVERED_VIEW", 25, flag)));
	//  454  951:new             #232 <Class AndroidExcludedRefs$26>
	//  455  954:dup             
	//  456  955:ldc1            #233 <String "TEXT_VIEW__MLAST_HOVERED_VIEW">
	//  457  957:bipush          25
	//  458  959:iload_0         
	//  459  960:invokespecial   #234 <Method void AndroidExcludedRefs$26(String, int, boolean)>
	//  460  963:putstatic       #236 <Field AndroidExcludedRefs TEXT_VIEW__MLAST_HOVERED_VIEW>
		if("samsung".equals(((Object) (Build.MANUFACTURER))) && android.os.Build.VERSION.SDK_INT == 19)
	//* 461  966:ldc1            #196 <String "samsung">
	//* 462  968:getstatic       #174 <Field String Build.MANUFACTURER>
	//* 463  971:invokevirtual   #180 <Method boolean String.equals(Object)>
	//* 464  974:ifeq            990
	//* 465  977:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 466  980:bipush          19
	//* 467  982:icmpne          990
			flag = true;
	//  468  985:iconst_1        
	//  469  986:istore_0        
		else
	//* 470  987:goto            992
			flag = false;
	//  471  990:iconst_0        
	//  472  991:istore_0        
		PERSONA_MANAGER = ((AndroidExcludedRefs) (new _cls27("PERSONA_MANAGER", 26, flag)));
	//  473  992:new             #238 <Class AndroidExcludedRefs$27>
	//  474  995:dup             
	//  475  996:ldc1            #239 <String "PERSONA_MANAGER">
	//  476  998:bipush          26
	//  477 1000:iload_0         
	//  478 1001:invokespecial   #240 <Method void AndroidExcludedRefs$27(String, int, boolean)>
	//  479 1004:putstatic       #242 <Field AndroidExcludedRefs PERSONA_MANAGER>
		if("samsung".equals(((Object) (Build.MANUFACTURER))) && android.os.Build.VERSION.SDK_INT == 19)
	//* 480 1007:ldc1            #196 <String "samsung">
	//* 481 1009:getstatic       #174 <Field String Build.MANUFACTURER>
	//* 482 1012:invokevirtual   #180 <Method boolean String.equals(Object)>
	//* 483 1015:ifeq            1031
	//* 484 1018:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 485 1021:bipush          19
	//* 486 1023:icmpne          1031
			flag = true;
	//  487 1026:iconst_1        
	//  488 1027:istore_0        
		else
	//* 489 1028:goto            1033
			flag = false;
	//  490 1031:iconst_0        
	//  491 1032:istore_0        
		RESOURCES__MCONTEXT = ((AndroidExcludedRefs) (new _cls28("RESOURCES__MCONTEXT", 27, flag)));
	//  492 1033:new             #244 <Class AndroidExcludedRefs$28>
	//  493 1036:dup             
	//  494 1037:ldc1            #245 <String "RESOURCES__MCONTEXT">
	//  495 1039:bipush          27
	//  496 1041:iload_0         
	//  497 1042:invokespecial   #246 <Method void AndroidExcludedRefs$28(String, int, boolean)>
	//  498 1045:putstatic       #248 <Field AndroidExcludedRefs RESOURCES__MCONTEXT>
		if("samsung".equals(((Object) (Build.MANUFACTURER))) && android.os.Build.VERSION.SDK_INT == 19)
	//* 499 1048:ldc1            #196 <String "samsung">
	//* 500 1050:getstatic       #174 <Field String Build.MANUFACTURER>
	//* 501 1053:invokevirtual   #180 <Method boolean String.equals(Object)>
	//* 502 1056:ifeq            1072
	//* 503 1059:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 504 1062:bipush          19
	//* 505 1064:icmpne          1072
			flag = true;
	//  506 1067:iconst_1        
	//  507 1068:istore_0        
		else
	//* 508 1069:goto            1074
			flag = false;
	//  509 1072:iconst_0        
	//  510 1073:istore_0        
		VIEW_CONFIGURATION__MCONTEXT = ((AndroidExcludedRefs) (new _cls29("VIEW_CONFIGURATION__MCONTEXT", 28, flag)));
	//  511 1074:new             #250 <Class AndroidExcludedRefs$29>
	//  512 1077:dup             
	//  513 1078:ldc1            #251 <String "VIEW_CONFIGURATION__MCONTEXT">
	//  514 1080:bipush          28
	//  515 1082:iload_0         
	//  516 1083:invokespecial   #252 <Method void AndroidExcludedRefs$29(String, int, boolean)>
	//  517 1086:putstatic       #254 <Field AndroidExcludedRefs VIEW_CONFIGURATION__MCONTEXT>
		if("LENOVO".equals(((Object) (Build.MANUFACTURER))) && android.os.Build.VERSION.SDK_INT == 19)
	//* 518 1089:ldc2            #256 <String "LENOVO">
	//* 519 1092:getstatic       #174 <Field String Build.MANUFACTURER>
	//* 520 1095:invokevirtual   #180 <Method boolean String.equals(Object)>
	//* 521 1098:ifeq            1114
	//* 522 1101:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 523 1104:bipush          19
	//* 524 1106:icmpne          1114
			flag = true;
	//  525 1109:iconst_1        
	//  526 1110:istore_0        
		else
	//* 527 1111:goto            1116
			flag = false;
	//  528 1114:iconst_0        
	//  529 1115:istore_0        
		SYSTEM_SENSOR_MANAGER_LENOVO = ((AndroidExcludedRefs) (new _cls30("SYSTEM_SENSOR_MANAGER_LENOVO", 29, flag)));
	//  530 1116:new             #258 <Class AndroidExcludedRefs$30>
	//  531 1119:dup             
	//  532 1120:ldc2            #259 <String "SYSTEM_SENSOR_MANAGER_LENOVO">
	//  533 1123:bipush          29
	//  534 1125:iload_0         
	//  535 1126:invokespecial   #260 <Method void AndroidExcludedRefs$30(String, int, boolean)>
	//  536 1129:putstatic       #262 <Field AndroidExcludedRefs SYSTEM_SENSOR_MANAGER_LENOVO>
		if("samsung".equals(((Object) (Build.MANUFACTURER))) && android.os.Build.VERSION.SDK_INT == 19)
	//* 537 1132:ldc1            #196 <String "samsung">
	//* 538 1134:getstatic       #174 <Field String Build.MANUFACTURER>
	//* 539 1137:invokevirtual   #180 <Method boolean String.equals(Object)>
	//* 540 1140:ifeq            1156
	//* 541 1143:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 542 1146:bipush          19
	//* 543 1148:icmpne          1156
			flag = true;
	//  544 1151:iconst_1        
	//  545 1152:istore_0        
		else
	//* 546 1153:goto            1158
			flag = false;
	//  547 1156:iconst_0        
	//  548 1157:istore_0        
		AUDIO_MANAGER__MCONTEXT_STATIC = ((AndroidExcludedRefs) (new _cls31("AUDIO_MANAGER__MCONTEXT_STATIC", 30, flag)));
	//  549 1158:new             #264 <Class AndroidExcludedRefs$31>
	//  550 1161:dup             
	//  551 1162:ldc2            #265 <String "AUDIO_MANAGER__MCONTEXT_STATIC">
	//  552 1165:bipush          30
	//  553 1167:iload_0         
	//  554 1168:invokespecial   #266 <Method void AndroidExcludedRefs$31(String, int, boolean)>
	//  555 1171:putstatic       #268 <Field AndroidExcludedRefs AUDIO_MANAGER__MCONTEXT_STATIC>
		if("samsung".equals(((Object) (Build.MANUFACTURER))) && android.os.Build.VERSION.SDK_INT == 22)
	//* 556 1174:ldc1            #196 <String "samsung">
	//* 557 1176:getstatic       #174 <Field String Build.MANUFACTURER>
	//* 558 1179:invokevirtual   #180 <Method boolean String.equals(Object)>
	//* 559 1182:ifeq            1198
	//* 560 1185:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//* 561 1188:bipush          22
	//* 562 1190:icmpne          1198
			flag = true;
	//  563 1193:iconst_1        
	//  564 1194:istore_0        
		else
	//* 565 1195:goto            1200
			flag = false;
	//  566 1198:iconst_0        
	//  567 1199:istore_0        
		ACTIVITY_MANAGER_MCONTEXT = ((AndroidExcludedRefs) (new _cls32("ACTIVITY_MANAGER_MCONTEXT", 31, flag)));
	//  568 1200:new             #270 <Class AndroidExcludedRefs$32>
	//  569 1203:dup             
	//  570 1204:ldc2            #271 <String "ACTIVITY_MANAGER_MCONTEXT">
	//  571 1207:bipush          31
	//  572 1209:iload_0         
	//  573 1210:invokespecial   #272 <Method void AndroidExcludedRefs$32(String, int, boolean)>
	//  574 1213:putstatic       #274 <Field AndroidExcludedRefs ACTIVITY_MANAGER_MCONTEXT>
		SOFT_REFERENCES = ((AndroidExcludedRefs) (new _cls33("SOFT_REFERENCES", 32)));
	//  575 1216:new             #276 <Class AndroidExcludedRefs$33>
	//  576 1219:dup             
	//  577 1220:ldc2            #277 <String "SOFT_REFERENCES">
	//  578 1223:bipush          32
	//  579 1225:invokespecial   #280 <Method void AndroidExcludedRefs$33(String, int)>
	//  580 1228:putstatic       #282 <Field AndroidExcludedRefs SOFT_REFERENCES>
		FINALIZER_WATCHDOG_DAEMON = ((AndroidExcludedRefs) (new _cls34("FINALIZER_WATCHDOG_DAEMON", 33)));
	//  581 1231:new             #284 <Class AndroidExcludedRefs$34>
	//  582 1234:dup             
	//  583 1235:ldc2            #285 <String "FINALIZER_WATCHDOG_DAEMON">
	//  584 1238:bipush          33
	//  585 1240:invokespecial   #286 <Method void AndroidExcludedRefs$34(String, int)>
	//  586 1243:putstatic       #288 <Field AndroidExcludedRefs FINALIZER_WATCHDOG_DAEMON>
		MAIN = ((AndroidExcludedRefs) (new _cls35("MAIN", 34)));
	//  587 1246:new             #290 <Class AndroidExcludedRefs$35>
	//  588 1249:dup             
	//  589 1250:ldc2            #291 <String "MAIN">
	//  590 1253:bipush          34
	//  591 1255:invokespecial   #292 <Method void AndroidExcludedRefs$35(String, int)>
	//  592 1258:putstatic       #294 <Field AndroidExcludedRefs MAIN>
		LEAK_CANARY_THREAD = ((AndroidExcludedRefs) (new _cls36("LEAK_CANARY_THREAD", 35)));
	//  593 1261:new             #296 <Class AndroidExcludedRefs$36>
	//  594 1264:dup             
	//  595 1265:ldc2            #297 <String "LEAK_CANARY_THREAD">
	//  596 1268:bipush          35
	//  597 1270:invokespecial   #298 <Method void AndroidExcludedRefs$36(String, int)>
	//  598 1273:putstatic       #300 <Field AndroidExcludedRefs LEAK_CANARY_THREAD>
		EVENT_RECEIVER__MMESSAGE_QUEUE = ((AndroidExcludedRefs) (new _cls37("EVENT_RECEIVER__MMESSAGE_QUEUE", 36)));
	//  599 1276:new             #302 <Class AndroidExcludedRefs$37>
	//  600 1279:dup             
	//  601 1280:ldc2            #303 <String "EVENT_RECEIVER__MMESSAGE_QUEUE">
	//  602 1283:bipush          36
	//  603 1285:invokespecial   #304 <Method void AndroidExcludedRefs$37(String, int)>
	//  604 1288:putstatic       #306 <Field AndroidExcludedRefs EVENT_RECEIVER__MMESSAGE_QUEUE>
		$VALUES = (new AndroidExcludedRefs[] {
			ACTIVITY_CLIENT_RECORD__NEXT_IDLE, SPAN_CONTROLLER, MEDIA_SESSION_LEGACY_HELPER__SINSTANCE, TEXT_LINE__SCACHED, BLOCKING_QUEUE, INPUT_METHOD_MANAGER__SERVED_VIEW, INPUT_METHOD_MANAGER__ROOT_VIEW, LAYOUT_TRANSITION, SPELL_CHECKER_SESSION, ACTIVITY_CHOOSE_MODEL, 
			SPEECH_RECOGNIZER, ACCOUNT_MANAGER, MEDIA_SCANNER_CONNECTION, USER_MANAGER__SINSTANCE, APP_WIDGET_HOST_CALLBACKS, AUDIO_MANAGER, EDITTEXT_BLINK_MESSAGEQUEUE, CONNECTIVITY_MANAGER__SINSTANCE, INSTRUMENTATION_RECOMMEND_ACTIVITY, DEVICE_POLICY_MANAGER__SETTINGS_OBSERVER, 
			SPEN_GESTURE_MANAGER, CLIPBOARD_UI_MANAGER__SINSTANCE, BUBBLE_POPUP_HELPER__SHELPER, AW_RESOURCE__SRESOURCES, MAPPER_CLIENT, TEXT_VIEW__MLAST_HOVERED_VIEW, PERSONA_MANAGER, RESOURCES__MCONTEXT, VIEW_CONFIGURATION__MCONTEXT, SYSTEM_SENSOR_MANAGER_LENOVO, 
			AUDIO_MANAGER__MCONTEXT_STATIC, ACTIVITY_MANAGER_MCONTEXT, SOFT_REFERENCES, FINALIZER_WATCHDOG_DAEMON, MAIN, LEAK_CANARY_THREAD, EVENT_RECEIVER__MMESSAGE_QUEUE
		});
	//  605 1291:bipush          37
	//  606 1293:anewarray       AndroidExcludedRefs[]
	//  607 1296:dup             
	//  608 1297:iconst_0        
	//  609 1298:getstatic       #64  <Field AndroidExcludedRefs ACTIVITY_CLIENT_RECORD__NEXT_IDLE>
	//  610 1301:aastore         
	//  611 1302:dup             
	//  612 1303:iconst_1        
	//  613 1304:getstatic       #70  <Field AndroidExcludedRefs SPAN_CONTROLLER>
	//  614 1307:aastore         
	//  615 1308:dup             
	//  616 1309:iconst_2        
	//  617 1310:getstatic       #76  <Field AndroidExcludedRefs MEDIA_SESSION_LEGACY_HELPER__SINSTANCE>
	//  618 1313:aastore         
	//  619 1314:dup             
	//  620 1315:iconst_3        
	//  621 1316:getstatic       #82  <Field AndroidExcludedRefs TEXT_LINE__SCACHED>
	//  622 1319:aastore         
	//  623 1320:dup             
	//  624 1321:iconst_4        
	//  625 1322:getstatic       #88  <Field AndroidExcludedRefs BLOCKING_QUEUE>
	//  626 1325:aastore         
	//  627 1326:dup             
	//  628 1327:iconst_5        
	//  629 1328:getstatic       #94  <Field AndroidExcludedRefs INPUT_METHOD_MANAGER__SERVED_VIEW>
	//  630 1331:aastore         
	//  631 1332:dup             
	//  632 1333:bipush          6
	//  633 1335:getstatic       #100 <Field AndroidExcludedRefs INPUT_METHOD_MANAGER__ROOT_VIEW>
	//  634 1338:aastore         
	//  635 1339:dup             
	//  636 1340:bipush          7
	//  637 1342:getstatic       #106 <Field AndroidExcludedRefs LAYOUT_TRANSITION>
	//  638 1345:aastore         
	//  639 1346:dup             
	//  640 1347:bipush          8
	//  641 1349:getstatic       #112 <Field AndroidExcludedRefs SPELL_CHECKER_SESSION>
	//  642 1352:aastore         
	//  643 1353:dup             
	//  644 1354:bipush          9
	//  645 1356:getstatic       #118 <Field AndroidExcludedRefs ACTIVITY_CHOOSE_MODEL>
	//  646 1359:aastore         
	//  647 1360:dup             
	//  648 1361:bipush          10
	//  649 1363:getstatic       #124 <Field AndroidExcludedRefs SPEECH_RECOGNIZER>
	//  650 1366:aastore         
	//  651 1367:dup             
	//  652 1368:bipush          11
	//  653 1370:getstatic       #130 <Field AndroidExcludedRefs ACCOUNT_MANAGER>
	//  654 1373:aastore         
	//  655 1374:dup             
	//  656 1375:bipush          12
	//  657 1377:getstatic       #136 <Field AndroidExcludedRefs MEDIA_SCANNER_CONNECTION>
	//  658 1380:aastore         
	//  659 1381:dup             
	//  660 1382:bipush          13
	//  661 1384:getstatic       #142 <Field AndroidExcludedRefs USER_MANAGER__SINSTANCE>
	//  662 1387:aastore         
	//  663 1388:dup             
	//  664 1389:bipush          14
	//  665 1391:getstatic       #148 <Field AndroidExcludedRefs APP_WIDGET_HOST_CALLBACKS>
	//  666 1394:aastore         
	//  667 1395:dup             
	//  668 1396:bipush          15
	//  669 1398:getstatic       #154 <Field AndroidExcludedRefs AUDIO_MANAGER>
	//  670 1401:aastore         
	//  671 1402:dup             
	//  672 1403:bipush          16
	//  673 1405:getstatic       #160 <Field AndroidExcludedRefs EDITTEXT_BLINK_MESSAGEQUEUE>
	//  674 1408:aastore         
	//  675 1409:dup             
	//  676 1410:bipush          17
	//  677 1412:getstatic       #166 <Field AndroidExcludedRefs CONNECTIVITY_MANAGER__SINSTANCE>
	//  678 1415:aastore         
	//  679 1416:dup             
	//  680 1417:bipush          18
	//  681 1419:getstatic       #186 <Field AndroidExcludedRefs INSTRUMENTATION_RECOMMEND_ACTIVITY>
	//  682 1422:aastore         
	//  683 1423:dup             
	//  684 1424:bipush          19
	//  685 1426:getstatic       #194 <Field AndroidExcludedRefs DEVICE_POLICY_MANAGER__SETTINGS_OBSERVER>
	//  686 1429:aastore         
	//  687 1430:dup             
	//  688 1431:bipush          20
	//  689 1433:getstatic       #202 <Field AndroidExcludedRefs SPEN_GESTURE_MANAGER>
	//  690 1436:aastore         
	//  691 1437:dup             
	//  692 1438:bipush          21
	//  693 1440:getstatic       #208 <Field AndroidExcludedRefs CLIPBOARD_UI_MANAGER__SINSTANCE>
	//  694 1443:aastore         
	//  695 1444:dup             
	//  696 1445:bipush          22
	//  697 1447:getstatic       #216 <Field AndroidExcludedRefs BUBBLE_POPUP_HELPER__SHELPER>
	//  698 1450:aastore         
	//  699 1451:dup             
	//  700 1452:bipush          23
	//  701 1454:getstatic       #222 <Field AndroidExcludedRefs AW_RESOURCE__SRESOURCES>
	//  702 1457:aastore         
	//  703 1458:dup             
	//  704 1459:bipush          24
	//  705 1461:getstatic       #230 <Field AndroidExcludedRefs MAPPER_CLIENT>
	//  706 1464:aastore         
	//  707 1465:dup             
	//  708 1466:bipush          25
	//  709 1468:getstatic       #236 <Field AndroidExcludedRefs TEXT_VIEW__MLAST_HOVERED_VIEW>
	//  710 1471:aastore         
	//  711 1472:dup             
	//  712 1473:bipush          26
	//  713 1475:getstatic       #242 <Field AndroidExcludedRefs PERSONA_MANAGER>
	//  714 1478:aastore         
	//  715 1479:dup             
	//  716 1480:bipush          27
	//  717 1482:getstatic       #248 <Field AndroidExcludedRefs RESOURCES__MCONTEXT>
	//  718 1485:aastore         
	//  719 1486:dup             
	//  720 1487:bipush          28
	//  721 1489:getstatic       #254 <Field AndroidExcludedRefs VIEW_CONFIGURATION__MCONTEXT>
	//  722 1492:aastore         
	//  723 1493:dup             
	//  724 1494:bipush          29
	//  725 1496:getstatic       #262 <Field AndroidExcludedRefs SYSTEM_SENSOR_MANAGER_LENOVO>
	//  726 1499:aastore         
	//  727 1500:dup             
	//  728 1501:bipush          30
	//  729 1503:getstatic       #268 <Field AndroidExcludedRefs AUDIO_MANAGER__MCONTEXT_STATIC>
	//  730 1506:aastore         
	//  731 1507:dup             
	//  732 1508:bipush          31
	//  733 1510:getstatic       #274 <Field AndroidExcludedRefs ACTIVITY_MANAGER_MCONTEXT>
	//  734 1513:aastore         
	//  735 1514:dup             
	//  736 1515:bipush          32
	//  737 1517:getstatic       #282 <Field AndroidExcludedRefs SOFT_REFERENCES>
	//  738 1520:aastore         
	//  739 1521:dup             
	//  740 1522:bipush          33
	//  741 1524:getstatic       #288 <Field AndroidExcludedRefs FINALIZER_WATCHDOG_DAEMON>
	//  742 1527:aastore         
	//  743 1528:dup             
	//  744 1529:bipush          34
	//  745 1531:getstatic       #294 <Field AndroidExcludedRefs MAIN>
	//  746 1534:aastore         
	//  747 1535:dup             
	//  748 1536:bipush          35
	//  749 1538:getstatic       #300 <Field AndroidExcludedRefs LEAK_CANARY_THREAD>
	//  750 1541:aastore         
	//  751 1542:dup             
	//  752 1543:bipush          36
	//  753 1545:getstatic       #306 <Field AndroidExcludedRefs EVENT_RECEIVER__MMESSAGE_QUEUE>
	//  754 1548:aastore         
	//  755 1549:putstatic       #308 <Field AndroidExcludedRefs[] $VALUES>
	//* 756 1552:return          
	}

	/* member class not found */
	class _cls1 {}


	/* member class not found */
	class _cls2 {}


	/* member class not found */
	class _cls3 {}


	/* member class not found */
	class _cls4 {}


	/* member class not found */
	class _cls5 {}


	/* member class not found */
	class _cls6 {}


	/* member class not found */
	class _cls7 {}


	/* member class not found */
	class _cls8 {}


	/* member class not found */
	class _cls9 {}


	/* member class not found */
	class _cls10 {}


	/* member class not found */
	class _cls11 {}


	/* member class not found */
	class _cls12 {}


	/* member class not found */
	class _cls13 {}


	/* member class not found */
	class _cls14 {}


	/* member class not found */
	class _cls15 {}


	/* member class not found */
	class _cls16 {}


	/* member class not found */
	class _cls17 {}


	/* member class not found */
	class _cls18 {}


	/* member class not found */
	class _cls19 {}


	/* member class not found */
	class _cls20 {}


	/* member class not found */
	class _cls21 {}


	/* member class not found */
	class _cls22 {}


	/* member class not found */
	class _cls23 {}


	/* member class not found */
	class _cls24 {}


	/* member class not found */
	class _cls25 {}


	/* member class not found */
	class _cls26 {}


	/* member class not found */
	class _cls27 {}


	/* member class not found */
	class _cls28 {}


	/* member class not found */
	class _cls29 {}


	/* member class not found */
	class _cls30 {}


	/* member class not found */
	class _cls31 {}


	/* member class not found */
	class _cls32 {}


	/* member class not found */
	class _cls33 {}


	/* member class not found */
	class _cls34 {}


	/* member class not found */
	class _cls35 {}


	/* member class not found */
	class _cls36 {}


	/* member class not found */
	class _cls37 {}

}
