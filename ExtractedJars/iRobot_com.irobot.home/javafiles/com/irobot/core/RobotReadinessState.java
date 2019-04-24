// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class RobotReadinessState extends Enum
{

	private RobotReadinessState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #166 <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static RobotReadinessState valueOf(String s)
	{
		return (RobotReadinessState)Enum.valueOf(com/irobot/core/RobotReadinessState, s);
	//    0    0:ldc1            #2   <Class RobotReadinessState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #172 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class RobotReadinessState>
	//    4    9:areturn         
	}

	public static RobotReadinessState[] values()
	{
		return (RobotReadinessState[])((RobotReadinessState []) ($VALUES)).clone();
	//    0    0:getstatic       #164 <Field RobotReadinessState[] $VALUES>
	//    1    3:invokevirtual   #179 <Method Object _5B_Lcom.irobot.core.RobotReadinessState_3B_.clone()>
	//    2    6:checkcast       #175 <Class RobotReadinessState[]>
	//    3    9:areturn         
	}

	private static final RobotReadinessState $VALUES[];
	public static final RobotReadinessState AutoEvacuationClogged;
	public static final RobotReadinessState BatteryAuthError;
	public static final RobotReadinessState BinFull;
	public static final RobotReadinessState BrushStall;
	public static final RobotReadinessState Bumped;
	public static final RobotReadinessState BumperOffline;
	public static final RobotReadinessState ChargeTimeout;
	public static final RobotReadinessState ChargingSleep;
	public static final RobotReadinessState Cliff;
	public static final RobotReadinessState FinalDocking;
	public static final RobotReadinessState Gyro;
	public static final RobotReadinessState InCloudUpgrade;
	public static final RobotReadinessState InRcon;
	public static final RobotReadinessState InsufficientCharge;
	public static final RobotReadinessState InvalidCal;
	public static final RobotReadinessState InvalidCommand;
	public static final RobotReadinessState InvalidPad;
	public static final RobotReadinessState LidOpen;
	public static final RobotReadinessState MapVersionMisMatch;
	public static final RobotReadinessState Misconfigured;
	public static final RobotReadinessState MobilityOffline;
	public static final RobotReadinessState NavCommsDown;
	public static final RobotReadinessState NavCrash;
	public static final RobotReadinessState NoBin;
	public static final RobotReadinessState NoPad;
	public static final RobotReadinessState None;
	public static final RobotReadinessState PadDetectionTimeout;
	public static final RobotReadinessState PowerOffline;
	public static final RobotReadinessState SMBusPermanentFailure;
	public static final RobotReadinessState SafetyOffline;
	public static final RobotReadinessState SavingMap;
	public static final RobotReadinessState ScheduleNoClock;
	public static final RobotReadinessState TankLow;
	public static final RobotReadinessState Unknown;
	public static final RobotReadinessState WheelDropBoth;
	public static final RobotReadinessState WheelDropLeft;
	public static final RobotReadinessState WheelDropRight;

	static 
	{
		None = new RobotReadinessState("None", 0);
	//    0    0:new             #2   <Class RobotReadinessState>
	//    1    3:dup             
	//    2    4:ldc1            #48  <String "None">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//    5   10:putstatic       #54  <Field RobotReadinessState None>
		Cliff = new RobotReadinessState("Cliff", 1);
	//    6   13:new             #2   <Class RobotReadinessState>
	//    7   16:dup             
	//    8   17:ldc1            #55  <String "Cliff">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//   11   23:putstatic       #57  <Field RobotReadinessState Cliff>
		WheelDropBoth = new RobotReadinessState("WheelDropBoth", 2);
	//   12   26:new             #2   <Class RobotReadinessState>
	//   13   29:dup             
	//   14   30:ldc1            #58  <String "WheelDropBoth">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//   17   36:putstatic       #60  <Field RobotReadinessState WheelDropBoth>
		WheelDropLeft = new RobotReadinessState("WheelDropLeft", 3);
	//   18   39:new             #2   <Class RobotReadinessState>
	//   19   42:dup             
	//   20   43:ldc1            #61  <String "WheelDropLeft">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//   23   49:putstatic       #63  <Field RobotReadinessState WheelDropLeft>
		WheelDropRight = new RobotReadinessState("WheelDropRight", 4);
	//   24   52:new             #2   <Class RobotReadinessState>
	//   25   55:dup             
	//   26   56:ldc1            #64  <String "WheelDropRight">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//   29   62:putstatic       #66  <Field RobotReadinessState WheelDropRight>
		FinalDocking = new RobotReadinessState("FinalDocking", 5);
	//   30   65:new             #2   <Class RobotReadinessState>
	//   31   68:dup             
	//   32   69:ldc1            #67  <String "FinalDocking">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//   35   75:putstatic       #69  <Field RobotReadinessState FinalDocking>
		BrushStall = new RobotReadinessState("BrushStall", 6);
	//   36   78:new             #2   <Class RobotReadinessState>
	//   37   81:dup             
	//   38   82:ldc1            #70  <String "BrushStall">
	//   39   84:bipush          6
	//   40   86:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//   41   89:putstatic       #72  <Field RobotReadinessState BrushStall>
		NoBin = new RobotReadinessState("NoBin", 7);
	//   42   92:new             #2   <Class RobotReadinessState>
	//   43   95:dup             
	//   44   96:ldc1            #73  <String "NoBin">
	//   45   98:bipush          7
	//   46  100:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//   47  103:putstatic       #75  <Field RobotReadinessState NoBin>
		NavCrash = new RobotReadinessState("NavCrash", 8);
	//   48  106:new             #2   <Class RobotReadinessState>
	//   49  109:dup             
	//   50  110:ldc1            #76  <String "NavCrash">
	//   51  112:bipush          8
	//   52  114:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//   53  117:putstatic       #78  <Field RobotReadinessState NavCrash>
		Misconfigured = new RobotReadinessState("Misconfigured", 9);
	//   54  120:new             #2   <Class RobotReadinessState>
	//   55  123:dup             
	//   56  124:ldc1            #79  <String "Misconfigured">
	//   57  126:bipush          9
	//   58  128:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//   59  131:putstatic       #81  <Field RobotReadinessState Misconfigured>
		InRcon = new RobotReadinessState("InRcon", 10);
	//   60  134:new             #2   <Class RobotReadinessState>
	//   61  137:dup             
	//   62  138:ldc1            #82  <String "InRcon">
	//   63  140:bipush          10
	//   64  142:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//   65  145:putstatic       #84  <Field RobotReadinessState InRcon>
		InvalidCommand = new RobotReadinessState("InvalidCommand", 11);
	//   66  148:new             #2   <Class RobotReadinessState>
	//   67  151:dup             
	//   68  152:ldc1            #85  <String "InvalidCommand">
	//   69  154:bipush          11
	//   70  156:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//   71  159:putstatic       #87  <Field RobotReadinessState InvalidCommand>
		InsufficientCharge = new RobotReadinessState("InsufficientCharge", 12);
	//   72  162:new             #2   <Class RobotReadinessState>
	//   73  165:dup             
	//   74  166:ldc1            #88  <String "InsufficientCharge">
	//   75  168:bipush          12
	//   76  170:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//   77  173:putstatic       #90  <Field RobotReadinessState InsufficientCharge>
		BinFull = new RobotReadinessState("BinFull", 13);
	//   78  176:new             #2   <Class RobotReadinessState>
	//   79  179:dup             
	//   80  180:ldc1            #91  <String "BinFull">
	//   81  182:bipush          13
	//   82  184:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//   83  187:putstatic       #93  <Field RobotReadinessState BinFull>
		NavCommsDown = new RobotReadinessState("NavCommsDown", 14);
	//   84  190:new             #2   <Class RobotReadinessState>
	//   85  193:dup             
	//   86  194:ldc1            #94  <String "NavCommsDown">
	//   87  196:bipush          14
	//   88  198:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//   89  201:putstatic       #96  <Field RobotReadinessState NavCommsDown>
		InCloudUpgrade = new RobotReadinessState("InCloudUpgrade", 15);
	//   90  204:new             #2   <Class RobotReadinessState>
	//   91  207:dup             
	//   92  208:ldc1            #97  <String "InCloudUpgrade">
	//   93  210:bipush          15
	//   94  212:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//   95  215:putstatic       #99  <Field RobotReadinessState InCloudUpgrade>
		ChargingSleep = new RobotReadinessState("ChargingSleep", 16);
	//   96  218:new             #2   <Class RobotReadinessState>
	//   97  221:dup             
	//   98  222:ldc1            #100 <String "ChargingSleep">
	//   99  224:bipush          16
	//  100  226:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//  101  229:putstatic       #102 <Field RobotReadinessState ChargingSleep>
		InvalidPad = new RobotReadinessState("InvalidPad", 17);
	//  102  232:new             #2   <Class RobotReadinessState>
	//  103  235:dup             
	//  104  236:ldc1            #103 <String "InvalidPad">
	//  105  238:bipush          17
	//  106  240:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//  107  243:putstatic       #105 <Field RobotReadinessState InvalidPad>
		SafetyOffline = new RobotReadinessState("SafetyOffline", 18);
	//  108  246:new             #2   <Class RobotReadinessState>
	//  109  249:dup             
	//  110  250:ldc1            #106 <String "SafetyOffline">
	//  111  252:bipush          18
	//  112  254:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//  113  257:putstatic       #108 <Field RobotReadinessState SafetyOffline>
		Gyro = new RobotReadinessState("Gyro", 19);
	//  114  260:new             #2   <Class RobotReadinessState>
	//  115  263:dup             
	//  116  264:ldc1            #109 <String "Gyro">
	//  117  266:bipush          19
	//  118  268:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//  119  271:putstatic       #111 <Field RobotReadinessState Gyro>
		LidOpen = new RobotReadinessState("LidOpen", 20);
	//  120  274:new             #2   <Class RobotReadinessState>
	//  121  277:dup             
	//  122  278:ldc1            #112 <String "LidOpen">
	//  123  280:bipush          20
	//  124  282:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//  125  285:putstatic       #114 <Field RobotReadinessState LidOpen>
		Bumped = new RobotReadinessState("Bumped", 21);
	//  126  288:new             #2   <Class RobotReadinessState>
	//  127  291:dup             
	//  128  292:ldc1            #115 <String "Bumped">
	//  129  294:bipush          21
	//  130  296:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//  131  299:putstatic       #117 <Field RobotReadinessState Bumped>
		MapVersionMisMatch = new RobotReadinessState("MapVersionMisMatch", 22);
	//  132  302:new             #2   <Class RobotReadinessState>
	//  133  305:dup             
	//  134  306:ldc1            #118 <String "MapVersionMisMatch">
	//  135  308:bipush          22
	//  136  310:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//  137  313:putstatic       #120 <Field RobotReadinessState MapVersionMisMatch>
		TankLow = new RobotReadinessState("TankLow", 23);
	//  138  316:new             #2   <Class RobotReadinessState>
	//  139  319:dup             
	//  140  320:ldc1            #121 <String "TankLow">
	//  141  322:bipush          23
	//  142  324:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//  143  327:putstatic       #123 <Field RobotReadinessState TankLow>
		NoPad = new RobotReadinessState("NoPad", 24);
	//  144  330:new             #2   <Class RobotReadinessState>
	//  145  333:dup             
	//  146  334:ldc1            #124 <String "NoPad">
	//  147  336:bipush          24
	//  148  338:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//  149  341:putstatic       #126 <Field RobotReadinessState NoPad>
		BumperOffline = new RobotReadinessState("BumperOffline", 25);
	//  150  344:new             #2   <Class RobotReadinessState>
	//  151  347:dup             
	//  152  348:ldc1            #127 <String "BumperOffline">
	//  153  350:bipush          25
	//  154  352:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//  155  355:putstatic       #129 <Field RobotReadinessState BumperOffline>
		PowerOffline = new RobotReadinessState("PowerOffline", 26);
	//  156  358:new             #2   <Class RobotReadinessState>
	//  157  361:dup             
	//  158  362:ldc1            #130 <String "PowerOffline">
	//  159  364:bipush          26
	//  160  366:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//  161  369:putstatic       #132 <Field RobotReadinessState PowerOffline>
		ScheduleNoClock = new RobotReadinessState("ScheduleNoClock", 27);
	//  162  372:new             #2   <Class RobotReadinessState>
	//  163  375:dup             
	//  164  376:ldc1            #133 <String "ScheduleNoClock">
	//  165  378:bipush          27
	//  166  380:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//  167  383:putstatic       #135 <Field RobotReadinessState ScheduleNoClock>
		BatteryAuthError = new RobotReadinessState("BatteryAuthError", 28);
	//  168  386:new             #2   <Class RobotReadinessState>
	//  169  389:dup             
	//  170  390:ldc1            #136 <String "BatteryAuthError">
	//  171  392:bipush          28
	//  172  394:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//  173  397:putstatic       #138 <Field RobotReadinessState BatteryAuthError>
		MobilityOffline = new RobotReadinessState("MobilityOffline", 29);
	//  174  400:new             #2   <Class RobotReadinessState>
	//  175  403:dup             
	//  176  404:ldc1            #139 <String "MobilityOffline">
	//  177  406:bipush          29
	//  178  408:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//  179  411:putstatic       #141 <Field RobotReadinessState MobilityOffline>
		InvalidCal = new RobotReadinessState("InvalidCal", 30);
	//  180  414:new             #2   <Class RobotReadinessState>
	//  181  417:dup             
	//  182  418:ldc1            #142 <String "InvalidCal">
	//  183  420:bipush          30
	//  184  422:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//  185  425:putstatic       #144 <Field RobotReadinessState InvalidCal>
		PadDetectionTimeout = new RobotReadinessState("PadDetectionTimeout", 31);
	//  186  428:new             #2   <Class RobotReadinessState>
	//  187  431:dup             
	//  188  432:ldc1            #145 <String "PadDetectionTimeout">
	//  189  434:bipush          31
	//  190  436:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//  191  439:putstatic       #147 <Field RobotReadinessState PadDetectionTimeout>
		AutoEvacuationClogged = new RobotReadinessState("AutoEvacuationClogged", 32);
	//  192  442:new             #2   <Class RobotReadinessState>
	//  193  445:dup             
	//  194  446:ldc1            #148 <String "AutoEvacuationClogged">
	//  195  448:bipush          32
	//  196  450:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//  197  453:putstatic       #150 <Field RobotReadinessState AutoEvacuationClogged>
		SMBusPermanentFailure = new RobotReadinessState("SMBusPermanentFailure", 33);
	//  198  456:new             #2   <Class RobotReadinessState>
	//  199  459:dup             
	//  200  460:ldc1            #151 <String "SMBusPermanentFailure">
	//  201  462:bipush          33
	//  202  464:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//  203  467:putstatic       #153 <Field RobotReadinessState SMBusPermanentFailure>
		ChargeTimeout = new RobotReadinessState("ChargeTimeout", 34);
	//  204  470:new             #2   <Class RobotReadinessState>
	//  205  473:dup             
	//  206  474:ldc1            #154 <String "ChargeTimeout">
	//  207  476:bipush          34
	//  208  478:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//  209  481:putstatic       #156 <Field RobotReadinessState ChargeTimeout>
		SavingMap = new RobotReadinessState("SavingMap", 35);
	//  210  484:new             #2   <Class RobotReadinessState>
	//  211  487:dup             
	//  212  488:ldc1            #157 <String "SavingMap">
	//  213  490:bipush          35
	//  214  492:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//  215  495:putstatic       #159 <Field RobotReadinessState SavingMap>
		Unknown = new RobotReadinessState("Unknown", 36);
	//  216  498:new             #2   <Class RobotReadinessState>
	//  217  501:dup             
	//  218  502:ldc1            #160 <String "Unknown">
	//  219  504:bipush          36
	//  220  506:invokespecial   #52  <Method void RobotReadinessState(String, int)>
	//  221  509:putstatic       #162 <Field RobotReadinessState Unknown>
		$VALUES = (new RobotReadinessState[] {
			None, Cliff, WheelDropBoth, WheelDropLeft, WheelDropRight, FinalDocking, BrushStall, NoBin, NavCrash, Misconfigured, 
			InRcon, InvalidCommand, InsufficientCharge, BinFull, NavCommsDown, InCloudUpgrade, ChargingSleep, InvalidPad, SafetyOffline, Gyro, 
			LidOpen, Bumped, MapVersionMisMatch, TankLow, NoPad, BumperOffline, PowerOffline, ScheduleNoClock, BatteryAuthError, MobilityOffline, 
			InvalidCal, PadDetectionTimeout, AutoEvacuationClogged, SMBusPermanentFailure, ChargeTimeout, SavingMap, Unknown
		});
	//  222  512:bipush          37
	//  223  514:anewarray       RobotReadinessState[]
	//  224  517:dup             
	//  225  518:iconst_0        
	//  226  519:getstatic       #54  <Field RobotReadinessState None>
	//  227  522:aastore         
	//  228  523:dup             
	//  229  524:iconst_1        
	//  230  525:getstatic       #57  <Field RobotReadinessState Cliff>
	//  231  528:aastore         
	//  232  529:dup             
	//  233  530:iconst_2        
	//  234  531:getstatic       #60  <Field RobotReadinessState WheelDropBoth>
	//  235  534:aastore         
	//  236  535:dup             
	//  237  536:iconst_3        
	//  238  537:getstatic       #63  <Field RobotReadinessState WheelDropLeft>
	//  239  540:aastore         
	//  240  541:dup             
	//  241  542:iconst_4        
	//  242  543:getstatic       #66  <Field RobotReadinessState WheelDropRight>
	//  243  546:aastore         
	//  244  547:dup             
	//  245  548:iconst_5        
	//  246  549:getstatic       #69  <Field RobotReadinessState FinalDocking>
	//  247  552:aastore         
	//  248  553:dup             
	//  249  554:bipush          6
	//  250  556:getstatic       #72  <Field RobotReadinessState BrushStall>
	//  251  559:aastore         
	//  252  560:dup             
	//  253  561:bipush          7
	//  254  563:getstatic       #75  <Field RobotReadinessState NoBin>
	//  255  566:aastore         
	//  256  567:dup             
	//  257  568:bipush          8
	//  258  570:getstatic       #78  <Field RobotReadinessState NavCrash>
	//  259  573:aastore         
	//  260  574:dup             
	//  261  575:bipush          9
	//  262  577:getstatic       #81  <Field RobotReadinessState Misconfigured>
	//  263  580:aastore         
	//  264  581:dup             
	//  265  582:bipush          10
	//  266  584:getstatic       #84  <Field RobotReadinessState InRcon>
	//  267  587:aastore         
	//  268  588:dup             
	//  269  589:bipush          11
	//  270  591:getstatic       #87  <Field RobotReadinessState InvalidCommand>
	//  271  594:aastore         
	//  272  595:dup             
	//  273  596:bipush          12
	//  274  598:getstatic       #90  <Field RobotReadinessState InsufficientCharge>
	//  275  601:aastore         
	//  276  602:dup             
	//  277  603:bipush          13
	//  278  605:getstatic       #93  <Field RobotReadinessState BinFull>
	//  279  608:aastore         
	//  280  609:dup             
	//  281  610:bipush          14
	//  282  612:getstatic       #96  <Field RobotReadinessState NavCommsDown>
	//  283  615:aastore         
	//  284  616:dup             
	//  285  617:bipush          15
	//  286  619:getstatic       #99  <Field RobotReadinessState InCloudUpgrade>
	//  287  622:aastore         
	//  288  623:dup             
	//  289  624:bipush          16
	//  290  626:getstatic       #102 <Field RobotReadinessState ChargingSleep>
	//  291  629:aastore         
	//  292  630:dup             
	//  293  631:bipush          17
	//  294  633:getstatic       #105 <Field RobotReadinessState InvalidPad>
	//  295  636:aastore         
	//  296  637:dup             
	//  297  638:bipush          18
	//  298  640:getstatic       #108 <Field RobotReadinessState SafetyOffline>
	//  299  643:aastore         
	//  300  644:dup             
	//  301  645:bipush          19
	//  302  647:getstatic       #111 <Field RobotReadinessState Gyro>
	//  303  650:aastore         
	//  304  651:dup             
	//  305  652:bipush          20
	//  306  654:getstatic       #114 <Field RobotReadinessState LidOpen>
	//  307  657:aastore         
	//  308  658:dup             
	//  309  659:bipush          21
	//  310  661:getstatic       #117 <Field RobotReadinessState Bumped>
	//  311  664:aastore         
	//  312  665:dup             
	//  313  666:bipush          22
	//  314  668:getstatic       #120 <Field RobotReadinessState MapVersionMisMatch>
	//  315  671:aastore         
	//  316  672:dup             
	//  317  673:bipush          23
	//  318  675:getstatic       #123 <Field RobotReadinessState TankLow>
	//  319  678:aastore         
	//  320  679:dup             
	//  321  680:bipush          24
	//  322  682:getstatic       #126 <Field RobotReadinessState NoPad>
	//  323  685:aastore         
	//  324  686:dup             
	//  325  687:bipush          25
	//  326  689:getstatic       #129 <Field RobotReadinessState BumperOffline>
	//  327  692:aastore         
	//  328  693:dup             
	//  329  694:bipush          26
	//  330  696:getstatic       #132 <Field RobotReadinessState PowerOffline>
	//  331  699:aastore         
	//  332  700:dup             
	//  333  701:bipush          27
	//  334  703:getstatic       #135 <Field RobotReadinessState ScheduleNoClock>
	//  335  706:aastore         
	//  336  707:dup             
	//  337  708:bipush          28
	//  338  710:getstatic       #138 <Field RobotReadinessState BatteryAuthError>
	//  339  713:aastore         
	//  340  714:dup             
	//  341  715:bipush          29
	//  342  717:getstatic       #141 <Field RobotReadinessState MobilityOffline>
	//  343  720:aastore         
	//  344  721:dup             
	//  345  722:bipush          30
	//  346  724:getstatic       #144 <Field RobotReadinessState InvalidCal>
	//  347  727:aastore         
	//  348  728:dup             
	//  349  729:bipush          31
	//  350  731:getstatic       #147 <Field RobotReadinessState PadDetectionTimeout>
	//  351  734:aastore         
	//  352  735:dup             
	//  353  736:bipush          32
	//  354  738:getstatic       #150 <Field RobotReadinessState AutoEvacuationClogged>
	//  355  741:aastore         
	//  356  742:dup             
	//  357  743:bipush          33
	//  358  745:getstatic       #153 <Field RobotReadinessState SMBusPermanentFailure>
	//  359  748:aastore         
	//  360  749:dup             
	//  361  750:bipush          34
	//  362  752:getstatic       #156 <Field RobotReadinessState ChargeTimeout>
	//  363  755:aastore         
	//  364  756:dup             
	//  365  757:bipush          35
	//  366  759:getstatic       #159 <Field RobotReadinessState SavingMap>
	//  367  762:aastore         
	//  368  763:dup             
	//  369  764:bipush          36
	//  370  766:getstatic       #162 <Field RobotReadinessState Unknown>
	//  371  769:aastore         
	//  372  770:putstatic       #164 <Field RobotReadinessState[] $VALUES>
	//* 373  773:return          
	}
}
