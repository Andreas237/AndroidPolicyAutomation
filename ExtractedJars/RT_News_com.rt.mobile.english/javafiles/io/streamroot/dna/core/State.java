// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.streamroot.dna.core;

import kotlin.jvm.internal.Intrinsics;

public final class State extends Enum
{

	protected State(String s, int i, String s1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "description");
	//    0    0:aload_3         
	//    1    1:ldc1            #153 <String "description">
	//    2    3:invokestatic    #159 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super(s, i);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:iload_2         
	//    6    9:invokespecial   #162 <Method void Enum(String, int)>
		description = s1;
	//    7   12:aload_0         
	//    8   13:aload_3         
	//    9   14:putfield        #164 <Field String description>
	//   10   17:return          
	}

	public static State valueOf(String s)
	{
		return (State)Enum.valueOf(io/streamroot/dna/core/State, s);
	//    0    0:ldc1            #2   <Class State>
	//    1    2:aload_0         
	//    2    3:invokestatic    #172 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class State>
	//    4    9:areturn         
	}

	public static State[] values()
	{
		return (State[])((State []) ($VALUES)).clone();
	//    0    0:getstatic       #151 <Field State[] $VALUES>
	//    1    3:invokevirtual   #179 <Method Object _5B_Lio.streamroot.dna.core.State_3B_.clone()>
	//    2    6:checkcast       #175 <Class State[]>
	//    3    9:areturn         
	}

	public final String getDescription()
	{
		return description;
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field String description>
	//    2    4:areturn         
	}

	private static final State $VALUES[];
	public static final State ACTIVATION_FAILED;
	public static final State DEFINITELY_DISABLED;
	public static final State DELEGATED;
	public static final State DISABLED_BY_ACTIVATION_RATIO;
	public static final State DISABLED_BY_ACTIVATION_THRESHOLD;
	public static final State DISABLED_BY_BYPASS;
	public static final State DISABLED_FOR_INSUFFICIENT_CAPACITY;
	public static final State DNA_ACCESS_GRANTED;
	public static final State DNA_ACCESS_REQUESTED;
	public static final State INVALID_STREAMROOT_KEY;
	public static final State LOADING;
	public static final State LOADING_FAILED;
	public static final State QOS_TESTER;
	public static final State RUNNING;
	public static final State STARTING;
	public static final State TEMPORARY_DISABLED;
	public static final State TERMINATED;
	public static final State UNAUTHORISED_STREAMROOT_KEY;
	public static final State USAGE_QUOTA_REACHED;
	private final String description;

	static 
	{
		State state = new State("STARTING", 0, "DNA Starting");
	//    0    0:new             #2   <Class State>
	//    1    3:dup             
	//    2    4:ldc1            #52  <String "STARTING">
	//    3    6:iconst_0        
	//    4    7:ldc1            #54  <String "DNA Starting">
	//    5    9:invokespecial   #57  <Method void State(String, int, String)>
	//    6   12:astore_0        
		STARTING = state;
	//    7   13:aload_0         
	//    8   14:putstatic       #59  <Field State STARTING>
		State state1 = new State("DNA_ACCESS_REQUESTED", 1, "Access to Streamroot DNA requested");
	//    9   17:new             #2   <Class State>
	//   10   20:dup             
	//   11   21:ldc1            #60  <String "DNA_ACCESS_REQUESTED">
	//   12   23:iconst_1        
	//   13   24:ldc1            #62  <String "Access to Streamroot DNA requested">
	//   14   26:invokespecial   #57  <Method void State(String, int, String)>
	//   15   29:astore_1        
		DNA_ACCESS_REQUESTED = state1;
	//   16   30:aload_1         
	//   17   31:putstatic       #64  <Field State DNA_ACCESS_REQUESTED>
		State state2 = new State("DNA_ACCESS_GRANTED", 2, "Access to Streamroot DNA granted");
	//   18   34:new             #2   <Class State>
	//   19   37:dup             
	//   20   38:ldc1            #65  <String "DNA_ACCESS_GRANTED">
	//   21   40:iconst_2        
	//   22   41:ldc1            #67  <String "Access to Streamroot DNA granted">
	//   23   43:invokespecial   #57  <Method void State(String, int, String)>
	//   24   46:astore_2        
		DNA_ACCESS_GRANTED = state2;
	//   25   47:aload_2         
	//   26   48:putstatic       #69  <Field State DNA_ACCESS_GRANTED>
		State state3 = new State("LOADING", 3, "Streamroot DNA loading");
	//   27   51:new             #2   <Class State>
	//   28   54:dup             
	//   29   55:ldc1            #70  <String "LOADING">
	//   30   57:iconst_3        
	//   31   58:ldc1            #72  <String "Streamroot DNA loading">
	//   32   60:invokespecial   #57  <Method void State(String, int, String)>
	//   33   63:astore_3        
		LOADING = state3;
	//   34   64:aload_3         
	//   35   65:putstatic       #74  <Field State LOADING>
		State state4 = new State("RUNNING", 4, "Streamroot DNA enabled");
	//   36   68:new             #2   <Class State>
	//   37   71:dup             
	//   38   72:ldc1            #75  <String "RUNNING">
	//   39   74:iconst_4        
	//   40   75:ldc1            #77  <String "Streamroot DNA enabled">
	//   41   77:invokespecial   #57  <Method void State(String, int, String)>
	//   42   80:astore          4
		RUNNING = state4;
	//   43   82:aload           4
	//   44   84:putstatic       #79  <Field State RUNNING>
		State state5 = new State("TEMPORARY_DISABLED", 5, "Streamroot DNA temporary disabled");
	//   45   87:new             #2   <Class State>
	//   46   90:dup             
	//   47   91:ldc1            #80  <String "TEMPORARY_DISABLED">
	//   48   93:iconst_5        
	//   49   94:ldc1            #82  <String "Streamroot DNA temporary disabled">
	//   50   96:invokespecial   #57  <Method void State(String, int, String)>
	//   51   99:astore          5
		TEMPORARY_DISABLED = state5;
	//   52  101:aload           5
	//   53  103:putstatic       #84  <Field State TEMPORARY_DISABLED>
		State state6 = new State("ACTIVATION_FAILED", 6, "Access to Streamroot DNA denied, failed to reach Streamroot");
	//   54  106:new             #2   <Class State>
	//   55  109:dup             
	//   56  110:ldc1            #85  <String "ACTIVATION_FAILED">
	//   57  112:bipush          6
	//   58  114:ldc1            #87  <String "Access to Streamroot DNA denied, failed to reach Streamroot">
	//   59  116:invokespecial   #57  <Method void State(String, int, String)>
	//   60  119:astore          6
		ACTIVATION_FAILED = state6;
	//   61  121:aload           6
	//   62  123:putstatic       #89  <Field State ACTIVATION_FAILED>
		State state7 = new State("DISABLED_BY_BYPASS", 7, "Access to Streamroot DNA denied, mobile has been bypassed");
	//   63  126:new             #2   <Class State>
	//   64  129:dup             
	//   65  130:ldc1            #90  <String "DISABLED_BY_BYPASS">
	//   66  132:bipush          7
	//   67  134:ldc1            #92  <String "Access to Streamroot DNA denied, mobile has been bypassed">
	//   68  136:invokespecial   #57  <Method void State(String, int, String)>
	//   69  139:astore          7
		DISABLED_BY_BYPASS = state7;
	//   70  141:aload           7
	//   71  143:putstatic       #94  <Field State DISABLED_BY_BYPASS>
		State state8 = new State("DISABLED_BY_ACTIVATION_THRESHOLD", 8, "Access to Streamroot DNA denied, content is not activated");
	//   72  146:new             #2   <Class State>
	//   73  149:dup             
	//   74  150:ldc1            #95  <String "DISABLED_BY_ACTIVATION_THRESHOLD">
	//   75  152:bipush          8
	//   76  154:ldc1            #97  <String "Access to Streamroot DNA denied, content is not activated">
	//   77  156:invokespecial   #57  <Method void State(String, int, String)>
	//   78  159:astore          8
		DISABLED_BY_ACTIVATION_THRESHOLD = state8;
	//   79  161:aload           8
	//   80  163:putstatic       #99  <Field State DISABLED_BY_ACTIVATION_THRESHOLD>
		State state9 = new State("USAGE_QUOTA_REACHED", 9, "Access to Streamroot DNA denied, usage quota reached");
	//   81  166:new             #2   <Class State>
	//   82  169:dup             
	//   83  170:ldc1            #100 <String "USAGE_QUOTA_REACHED">
	//   84  172:bipush          9
	//   85  174:ldc1            #102 <String "Access to Streamroot DNA denied, usage quota reached">
	//   86  176:invokespecial   #57  <Method void State(String, int, String)>
	//   87  179:astore          9
		USAGE_QUOTA_REACHED = state9;
	//   88  181:aload           9
	//   89  183:putstatic       #104 <Field State USAGE_QUOTA_REACHED>
		State state10 = new State("DISABLED_BY_ACTIVATION_RATIO", 10, "Access to Streamroot DNA denied, activation ratio failed");
	//   90  186:new             #2   <Class State>
	//   91  189:dup             
	//   92  190:ldc1            #105 <String "DISABLED_BY_ACTIVATION_RATIO">
	//   93  192:bipush          10
	//   94  194:ldc1            #107 <String "Access to Streamroot DNA denied, activation ratio failed">
	//   95  196:invokespecial   #57  <Method void State(String, int, String)>
	//   96  199:astore          10
		DISABLED_BY_ACTIVATION_RATIO = state10;
	//   97  201:aload           10
	//   98  203:putstatic       #109 <Field State DISABLED_BY_ACTIVATION_RATIO>
		State state11 = new State("DISABLED_FOR_INSUFFICIENT_CAPACITY", 11, "Streamroot DNA aborted its loading because the device does not have sufficient resources");
	//   99  206:new             #2   <Class State>
	//  100  209:dup             
	//  101  210:ldc1            #110 <String "DISABLED_FOR_INSUFFICIENT_CAPACITY">
	//  102  212:bipush          11
	//  103  214:ldc1            #112 <String "Streamroot DNA aborted its loading because the device does not have sufficient resources">
	//  104  216:invokespecial   #57  <Method void State(String, int, String)>
	//  105  219:astore          11
		DISABLED_FOR_INSUFFICIENT_CAPACITY = state11;
	//  106  221:aload           11
	//  107  223:putstatic       #114 <Field State DISABLED_FOR_INSUFFICIENT_CAPACITY>
		State state12 = new State("INVALID_STREAMROOT_KEY", 12, "Access to Streamroot DNA denied, invalid Streamroot Key");
	//  108  226:new             #2   <Class State>
	//  109  229:dup             
	//  110  230:ldc1            #115 <String "INVALID_STREAMROOT_KEY">
	//  111  232:bipush          12
	//  112  234:ldc1            #117 <String "Access to Streamroot DNA denied, invalid Streamroot Key">
	//  113  236:invokespecial   #57  <Method void State(String, int, String)>
	//  114  239:astore          12
		INVALID_STREAMROOT_KEY = state12;
	//  115  241:aload           12
	//  116  243:putstatic       #119 <Field State INVALID_STREAMROOT_KEY>
		State state13 = new State("UNAUTHORISED_STREAMROOT_KEY", 13, "Access to Streamroot DNA denied, security violation");
	//  117  246:new             #2   <Class State>
	//  118  249:dup             
	//  119  250:ldc1            #120 <String "UNAUTHORISED_STREAMROOT_KEY">
	//  120  252:bipush          13
	//  121  254:ldc1            #122 <String "Access to Streamroot DNA denied, security violation">
	//  122  256:invokespecial   #57  <Method void State(String, int, String)>
	//  123  259:astore          13
		UNAUTHORISED_STREAMROOT_KEY = state13;
	//  124  261:aload           13
	//  125  263:putstatic       #124 <Field State UNAUTHORISED_STREAMROOT_KEY>
		State state14 = new State("QOS_TESTER", 14, "Your device is used to measure vanilla Qos");
	//  126  266:new             #2   <Class State>
	//  127  269:dup             
	//  128  270:ldc1            #125 <String "QOS_TESTER">
	//  129  272:bipush          14
	//  130  274:ldc1            #127 <String "Your device is used to measure vanilla Qos">
	//  131  276:invokespecial   #57  <Method void State(String, int, String)>
	//  132  279:astore          14
		QOS_TESTER = state14;
	//  133  281:aload           14
	//  134  283:putstatic       #129 <Field State QOS_TESTER>
		State state15 = new State("LOADING_FAILED", 15, "Streamroot DNA failed to load properly");
	//  135  286:new             #2   <Class State>
	//  136  289:dup             
	//  137  290:ldc1            #130 <String "LOADING_FAILED">
	//  138  292:bipush          15
	//  139  294:ldc1            #132 <String "Streamroot DNA failed to load properly">
	//  140  296:invokespecial   #57  <Method void State(String, int, String)>
	//  141  299:astore          15
		LOADING_FAILED = state15;
	//  142  301:aload           15
	//  143  303:putstatic       #134 <Field State LOADING_FAILED>
		State state16 = new State("DEFINITELY_DISABLED", 16, "Streamroot DNA disabled, default playback restored");
	//  144  306:new             #2   <Class State>
	//  145  309:dup             
	//  146  310:ldc1            #135 <String "DEFINITELY_DISABLED">
	//  147  312:bipush          16
	//  148  314:ldc1            #137 <String "Streamroot DNA disabled, default playback restored">
	//  149  316:invokespecial   #57  <Method void State(String, int, String)>
	//  150  319:astore          16
		DEFINITELY_DISABLED = state16;
	//  151  321:aload           16
	//  152  323:putstatic       #139 <Field State DEFINITELY_DISABLED>
		State state17 = new State("TERMINATED", 17, "Streamroot DNA Terminated");
	//  153  326:new             #2   <Class State>
	//  154  329:dup             
	//  155  330:ldc1            #140 <String "TERMINATED">
	//  156  332:bipush          17
	//  157  334:ldc1            #142 <String "Streamroot DNA Terminated">
	//  158  336:invokespecial   #57  <Method void State(String, int, String)>
	//  159  339:astore          17
		TERMINATED = state17;
	//  160  341:aload           17
	//  161  343:putstatic       #144 <Field State TERMINATED>
		State state18 = new State("DELEGATED", 18, "DNA Disabled");
	//  162  346:new             #2   <Class State>
	//  163  349:dup             
	//  164  350:ldc1            #145 <String "DELEGATED">
	//  165  352:bipush          18
	//  166  354:ldc1            #147 <String "DNA Disabled">
	//  167  356:invokespecial   #57  <Method void State(String, int, String)>
	//  168  359:astore          18
		DELEGATED = state18;
	//  169  361:aload           18
	//  170  363:putstatic       #149 <Field State DELEGATED>
		$VALUES = (new State[] {
			state, state1, state2, state3, state4, state5, state6, state7, state8, state9, 
			state10, state11, state12, state13, state14, state15, state16, state17, state18
		});
	//  171  366:bipush          19
	//  172  368:anewarray       State[]
	//  173  371:dup             
	//  174  372:iconst_0        
	//  175  373:aload_0         
	//  176  374:aastore         
	//  177  375:dup             
	//  178  376:iconst_1        
	//  179  377:aload_1         
	//  180  378:aastore         
	//  181  379:dup             
	//  182  380:iconst_2        
	//  183  381:aload_2         
	//  184  382:aastore         
	//  185  383:dup             
	//  186  384:iconst_3        
	//  187  385:aload_3         
	//  188  386:aastore         
	//  189  387:dup             
	//  190  388:iconst_4        
	//  191  389:aload           4
	//  192  391:aastore         
	//  193  392:dup             
	//  194  393:iconst_5        
	//  195  394:aload           5
	//  196  396:aastore         
	//  197  397:dup             
	//  198  398:bipush          6
	//  199  400:aload           6
	//  200  402:aastore         
	//  201  403:dup             
	//  202  404:bipush          7
	//  203  406:aload           7
	//  204  408:aastore         
	//  205  409:dup             
	//  206  410:bipush          8
	//  207  412:aload           8
	//  208  414:aastore         
	//  209  415:dup             
	//  210  416:bipush          9
	//  211  418:aload           9
	//  212  420:aastore         
	//  213  421:dup             
	//  214  422:bipush          10
	//  215  424:aload           10
	//  216  426:aastore         
	//  217  427:dup             
	//  218  428:bipush          11
	//  219  430:aload           11
	//  220  432:aastore         
	//  221  433:dup             
	//  222  434:bipush          12
	//  223  436:aload           12
	//  224  438:aastore         
	//  225  439:dup             
	//  226  440:bipush          13
	//  227  442:aload           13
	//  228  444:aastore         
	//  229  445:dup             
	//  230  446:bipush          14
	//  231  448:aload           14
	//  232  450:aastore         
	//  233  451:dup             
	//  234  452:bipush          15
	//  235  454:aload           15
	//  236  456:aastore         
	//  237  457:dup             
	//  238  458:bipush          16
	//  239  460:aload           16
	//  240  462:aastore         
	//  241  463:dup             
	//  242  464:bipush          17
	//  243  466:aload           17
	//  244  468:aastore         
	//  245  469:dup             
	//  246  470:bipush          18
	//  247  472:aload           18
	//  248  474:aastore         
	//  249  475:putstatic       #151 <Field State[] $VALUES>
	//* 250  478:return          
	}
}
