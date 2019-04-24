// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class BraavaMissionStatus extends Enum
{

	private BraavaMissionStatus(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #138 <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static BraavaMissionStatus valueOf(String s)
	{
		return (BraavaMissionStatus)Enum.valueOf(com/irobot/core/BraavaMissionStatus, s);
	//    0    0:ldc1            #2   <Class BraavaMissionStatus>
	//    1    2:aload_0         
	//    2    3:invokestatic    #144 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class BraavaMissionStatus>
	//    4    9:areturn         
	}

	public static BraavaMissionStatus[] values()
	{
		return (BraavaMissionStatus[])((BraavaMissionStatus []) ($VALUES)).clone();
	//    0    0:getstatic       #136 <Field BraavaMissionStatus[] $VALUES>
	//    1    3:invokevirtual   #151 <Method Object _5B_Lcom.irobot.core.BraavaMissionStatus_3B_.clone()>
	//    2    6:checkcast       #147 <Class BraavaMissionStatus[]>
	//    3    9:areturn         
	}

	private static final BraavaMissionStatus $VALUES[];
	public static final BraavaMissionStatus BatteryOverTemp;
	public static final BraavaMissionStatus ConstantCliff;
	public static final BraavaMissionStatus DeadBattery;
	public static final BraavaMissionStatus FailedToGoHome;
	public static final BraavaMissionStatus FailedToMakeProgress;
	public static final BraavaMissionStatus FailedToRelocalize;
	public static final BraavaMissionStatus GyroHardwareFailure;
	public static final BraavaMissionStatus HighMotorCurrent;
	public static final BraavaMissionStatus Kidnap;
	public static final BraavaMissionStatus LowBattery;
	public static final BraavaMissionStatus MaxCoverage;
	public static final BraavaMissionStatus MissionInProgress;
	public static final BraavaMissionStatus OutOfBounds;
	public static final BraavaMissionStatus PadIdError;
	public static final BraavaMissionStatus RobotReset;
	public static final BraavaMissionStatus StartRefuseBumped;
	public static final BraavaMissionStatus StartRefuseCliff;
	public static final BraavaMissionStatus StartRefuseFailedGyroCal;
	public static final BraavaMissionStatus StartRefuseInvalidPad;
	public static final BraavaMissionStatus Stuck;
	public static final BraavaMissionStatus Success;
	public static final BraavaMissionStatus TerminatedByRobot;
	public static final BraavaMissionStatus TerminatedByUser;
	public static final BraavaMissionStatus TimedOut;
	public static final BraavaMissionStatus Trapped;
	public static final BraavaMissionStatus Undefined;
	public static final BraavaMissionStatus UnhandledGenericFailure;
	public static final BraavaMissionStatus UnknownCleaningResult;
	public static final BraavaMissionStatus WatchdogTimedOut;
	public static final BraavaMissionStatus WheelDrop;

	static 
	{
		Undefined = new BraavaMissionStatus("Undefined", 0);
	//    0    0:new             #2   <Class BraavaMissionStatus>
	//    1    3:dup             
	//    2    4:ldc1            #41  <String "Undefined">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//    5   10:putstatic       #47  <Field BraavaMissionStatus Undefined>
		Success = new BraavaMissionStatus("Success", 1);
	//    6   13:new             #2   <Class BraavaMissionStatus>
	//    7   16:dup             
	//    8   17:ldc1            #48  <String "Success">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//   11   23:putstatic       #50  <Field BraavaMissionStatus Success>
		StartRefuseCliff = new BraavaMissionStatus("StartRefuseCliff", 2);
	//   12   26:new             #2   <Class BraavaMissionStatus>
	//   13   29:dup             
	//   14   30:ldc1            #51  <String "StartRefuseCliff">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//   17   36:putstatic       #53  <Field BraavaMissionStatus StartRefuseCliff>
		StartRefuseBumped = new BraavaMissionStatus("StartRefuseBumped", 3);
	//   18   39:new             #2   <Class BraavaMissionStatus>
	//   19   42:dup             
	//   20   43:ldc1            #54  <String "StartRefuseBumped">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//   23   49:putstatic       #56  <Field BraavaMissionStatus StartRefuseBumped>
		StartRefuseInvalidPad = new BraavaMissionStatus("StartRefuseInvalidPad", 4);
	//   24   52:new             #2   <Class BraavaMissionStatus>
	//   25   55:dup             
	//   26   56:ldc1            #57  <String "StartRefuseInvalidPad">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//   29   62:putstatic       #59  <Field BraavaMissionStatus StartRefuseInvalidPad>
		StartRefuseFailedGyroCal = new BraavaMissionStatus("StartRefuseFailedGyroCal", 5);
	//   30   65:new             #2   <Class BraavaMissionStatus>
	//   31   68:dup             
	//   32   69:ldc1            #60  <String "StartRefuseFailedGyroCal">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//   35   75:putstatic       #62  <Field BraavaMissionStatus StartRefuseFailedGyroCal>
		TerminatedByUser = new BraavaMissionStatus("TerminatedByUser", 6);
	//   36   78:new             #2   <Class BraavaMissionStatus>
	//   37   81:dup             
	//   38   82:ldc1            #63  <String "TerminatedByUser">
	//   39   84:bipush          6
	//   40   86:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//   41   89:putstatic       #65  <Field BraavaMissionStatus TerminatedByUser>
		TerminatedByRobot = new BraavaMissionStatus("TerminatedByRobot", 7);
	//   42   92:new             #2   <Class BraavaMissionStatus>
	//   43   95:dup             
	//   44   96:ldc1            #66  <String "TerminatedByRobot">
	//   45   98:bipush          7
	//   46  100:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//   47  103:putstatic       #68  <Field BraavaMissionStatus TerminatedByRobot>
		Kidnap = new BraavaMissionStatus("Kidnap", 8);
	//   48  106:new             #2   <Class BraavaMissionStatus>
	//   49  109:dup             
	//   50  110:ldc1            #69  <String "Kidnap">
	//   51  112:bipush          8
	//   52  114:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//   53  117:putstatic       #71  <Field BraavaMissionStatus Kidnap>
		DeadBattery = new BraavaMissionStatus("DeadBattery", 9);
	//   54  120:new             #2   <Class BraavaMissionStatus>
	//   55  123:dup             
	//   56  124:ldc1            #72  <String "DeadBattery">
	//   57  126:bipush          9
	//   58  128:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//   59  131:putstatic       #74  <Field BraavaMissionStatus DeadBattery>
		BatteryOverTemp = new BraavaMissionStatus("BatteryOverTemp", 10);
	//   60  134:new             #2   <Class BraavaMissionStatus>
	//   61  137:dup             
	//   62  138:ldc1            #75  <String "BatteryOverTemp">
	//   63  140:bipush          10
	//   64  142:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//   65  145:putstatic       #77  <Field BraavaMissionStatus BatteryOverTemp>
		LowBattery = new BraavaMissionStatus("LowBattery", 11);
	//   66  148:new             #2   <Class BraavaMissionStatus>
	//   67  151:dup             
	//   68  152:ldc1            #78  <String "LowBattery">
	//   69  154:bipush          11
	//   70  156:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//   71  159:putstatic       #80  <Field BraavaMissionStatus LowBattery>
		TimedOut = new BraavaMissionStatus("TimedOut", 12);
	//   72  162:new             #2   <Class BraavaMissionStatus>
	//   73  165:dup             
	//   74  166:ldc1            #81  <String "TimedOut">
	//   75  168:bipush          12
	//   76  170:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//   77  173:putstatic       #83  <Field BraavaMissionStatus TimedOut>
		WatchdogTimedOut = new BraavaMissionStatus("WatchdogTimedOut", 13);
	//   78  176:new             #2   <Class BraavaMissionStatus>
	//   79  179:dup             
	//   80  180:ldc1            #84  <String "WatchdogTimedOut">
	//   81  182:bipush          13
	//   82  184:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//   83  187:putstatic       #86  <Field BraavaMissionStatus WatchdogTimedOut>
		FailedToRelocalize = new BraavaMissionStatus("FailedToRelocalize", 14);
	//   84  190:new             #2   <Class BraavaMissionStatus>
	//   85  193:dup             
	//   86  194:ldc1            #87  <String "FailedToRelocalize">
	//   87  196:bipush          14
	//   88  198:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//   89  201:putstatic       #89  <Field BraavaMissionStatus FailedToRelocalize>
		FailedToGoHome = new BraavaMissionStatus("FailedToGoHome", 15);
	//   90  204:new             #2   <Class BraavaMissionStatus>
	//   91  207:dup             
	//   92  208:ldc1            #90  <String "FailedToGoHome">
	//   93  210:bipush          15
	//   94  212:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//   95  215:putstatic       #92  <Field BraavaMissionStatus FailedToGoHome>
		MaxCoverage = new BraavaMissionStatus("MaxCoverage", 16);
	//   96  218:new             #2   <Class BraavaMissionStatus>
	//   97  221:dup             
	//   98  222:ldc1            #93  <String "MaxCoverage">
	//   99  224:bipush          16
	//  100  226:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//  101  229:putstatic       #95  <Field BraavaMissionStatus MaxCoverage>
		PadIdError = new BraavaMissionStatus("PadIdError", 17);
	//  102  232:new             #2   <Class BraavaMissionStatus>
	//  103  235:dup             
	//  104  236:ldc1            #96  <String "PadIdError">
	//  105  238:bipush          17
	//  106  240:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//  107  243:putstatic       #98  <Field BraavaMissionStatus PadIdError>
		ConstantCliff = new BraavaMissionStatus("ConstantCliff", 18);
	//  108  246:new             #2   <Class BraavaMissionStatus>
	//  109  249:dup             
	//  110  250:ldc1            #99  <String "ConstantCliff">
	//  111  252:bipush          18
	//  112  254:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//  113  257:putstatic       #101 <Field BraavaMissionStatus ConstantCliff>
		WheelDrop = new BraavaMissionStatus("WheelDrop", 19);
	//  114  260:new             #2   <Class BraavaMissionStatus>
	//  115  263:dup             
	//  116  264:ldc1            #102 <String "WheelDrop">
	//  117  266:bipush          19
	//  118  268:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//  119  271:putstatic       #104 <Field BraavaMissionStatus WheelDrop>
		Stuck = new BraavaMissionStatus("Stuck", 20);
	//  120  274:new             #2   <Class BraavaMissionStatus>
	//  121  277:dup             
	//  122  278:ldc1            #105 <String "Stuck">
	//  123  280:bipush          20
	//  124  282:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//  125  285:putstatic       #107 <Field BraavaMissionStatus Stuck>
		Trapped = new BraavaMissionStatus("Trapped", 21);
	//  126  288:new             #2   <Class BraavaMissionStatus>
	//  127  291:dup             
	//  128  292:ldc1            #108 <String "Trapped">
	//  129  294:bipush          21
	//  130  296:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//  131  299:putstatic       #110 <Field BraavaMissionStatus Trapped>
		HighMotorCurrent = new BraavaMissionStatus("HighMotorCurrent", 22);
	//  132  302:new             #2   <Class BraavaMissionStatus>
	//  133  305:dup             
	//  134  306:ldc1            #111 <String "HighMotorCurrent">
	//  135  308:bipush          22
	//  136  310:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//  137  313:putstatic       #113 <Field BraavaMissionStatus HighMotorCurrent>
		FailedToMakeProgress = new BraavaMissionStatus("FailedToMakeProgress", 23);
	//  138  316:new             #2   <Class BraavaMissionStatus>
	//  139  319:dup             
	//  140  320:ldc1            #114 <String "FailedToMakeProgress">
	//  141  322:bipush          23
	//  142  324:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//  143  327:putstatic       #116 <Field BraavaMissionStatus FailedToMakeProgress>
		OutOfBounds = new BraavaMissionStatus("OutOfBounds", 24);
	//  144  330:new             #2   <Class BraavaMissionStatus>
	//  145  333:dup             
	//  146  334:ldc1            #117 <String "OutOfBounds">
	//  147  336:bipush          24
	//  148  338:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//  149  341:putstatic       #119 <Field BraavaMissionStatus OutOfBounds>
		GyroHardwareFailure = new BraavaMissionStatus("GyroHardwareFailure", 25);
	//  150  344:new             #2   <Class BraavaMissionStatus>
	//  151  347:dup             
	//  152  348:ldc1            #120 <String "GyroHardwareFailure">
	//  153  350:bipush          25
	//  154  352:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//  155  355:putstatic       #122 <Field BraavaMissionStatus GyroHardwareFailure>
		MissionInProgress = new BraavaMissionStatus("MissionInProgress", 26);
	//  156  358:new             #2   <Class BraavaMissionStatus>
	//  157  361:dup             
	//  158  362:ldc1            #123 <String "MissionInProgress">
	//  159  364:bipush          26
	//  160  366:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//  161  369:putstatic       #125 <Field BraavaMissionStatus MissionInProgress>
		RobotReset = new BraavaMissionStatus("RobotReset", 27);
	//  162  372:new             #2   <Class BraavaMissionStatus>
	//  163  375:dup             
	//  164  376:ldc1            #126 <String "RobotReset">
	//  165  378:bipush          27
	//  166  380:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//  167  383:putstatic       #128 <Field BraavaMissionStatus RobotReset>
		UnknownCleaningResult = new BraavaMissionStatus("UnknownCleaningResult", 28);
	//  168  386:new             #2   <Class BraavaMissionStatus>
	//  169  389:dup             
	//  170  390:ldc1            #129 <String "UnknownCleaningResult">
	//  171  392:bipush          28
	//  172  394:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//  173  397:putstatic       #131 <Field BraavaMissionStatus UnknownCleaningResult>
		UnhandledGenericFailure = new BraavaMissionStatus("UnhandledGenericFailure", 29);
	//  174  400:new             #2   <Class BraavaMissionStatus>
	//  175  403:dup             
	//  176  404:ldc1            #132 <String "UnhandledGenericFailure">
	//  177  406:bipush          29
	//  178  408:invokespecial   #45  <Method void BraavaMissionStatus(String, int)>
	//  179  411:putstatic       #134 <Field BraavaMissionStatus UnhandledGenericFailure>
		$VALUES = (new BraavaMissionStatus[] {
			Undefined, Success, StartRefuseCliff, StartRefuseBumped, StartRefuseInvalidPad, StartRefuseFailedGyroCal, TerminatedByUser, TerminatedByRobot, Kidnap, DeadBattery, 
			BatteryOverTemp, LowBattery, TimedOut, WatchdogTimedOut, FailedToRelocalize, FailedToGoHome, MaxCoverage, PadIdError, ConstantCliff, WheelDrop, 
			Stuck, Trapped, HighMotorCurrent, FailedToMakeProgress, OutOfBounds, GyroHardwareFailure, MissionInProgress, RobotReset, UnknownCleaningResult, UnhandledGenericFailure
		});
	//  180  414:bipush          30
	//  181  416:anewarray       BraavaMissionStatus[]
	//  182  419:dup             
	//  183  420:iconst_0        
	//  184  421:getstatic       #47  <Field BraavaMissionStatus Undefined>
	//  185  424:aastore         
	//  186  425:dup             
	//  187  426:iconst_1        
	//  188  427:getstatic       #50  <Field BraavaMissionStatus Success>
	//  189  430:aastore         
	//  190  431:dup             
	//  191  432:iconst_2        
	//  192  433:getstatic       #53  <Field BraavaMissionStatus StartRefuseCliff>
	//  193  436:aastore         
	//  194  437:dup             
	//  195  438:iconst_3        
	//  196  439:getstatic       #56  <Field BraavaMissionStatus StartRefuseBumped>
	//  197  442:aastore         
	//  198  443:dup             
	//  199  444:iconst_4        
	//  200  445:getstatic       #59  <Field BraavaMissionStatus StartRefuseInvalidPad>
	//  201  448:aastore         
	//  202  449:dup             
	//  203  450:iconst_5        
	//  204  451:getstatic       #62  <Field BraavaMissionStatus StartRefuseFailedGyroCal>
	//  205  454:aastore         
	//  206  455:dup             
	//  207  456:bipush          6
	//  208  458:getstatic       #65  <Field BraavaMissionStatus TerminatedByUser>
	//  209  461:aastore         
	//  210  462:dup             
	//  211  463:bipush          7
	//  212  465:getstatic       #68  <Field BraavaMissionStatus TerminatedByRobot>
	//  213  468:aastore         
	//  214  469:dup             
	//  215  470:bipush          8
	//  216  472:getstatic       #71  <Field BraavaMissionStatus Kidnap>
	//  217  475:aastore         
	//  218  476:dup             
	//  219  477:bipush          9
	//  220  479:getstatic       #74  <Field BraavaMissionStatus DeadBattery>
	//  221  482:aastore         
	//  222  483:dup             
	//  223  484:bipush          10
	//  224  486:getstatic       #77  <Field BraavaMissionStatus BatteryOverTemp>
	//  225  489:aastore         
	//  226  490:dup             
	//  227  491:bipush          11
	//  228  493:getstatic       #80  <Field BraavaMissionStatus LowBattery>
	//  229  496:aastore         
	//  230  497:dup             
	//  231  498:bipush          12
	//  232  500:getstatic       #83  <Field BraavaMissionStatus TimedOut>
	//  233  503:aastore         
	//  234  504:dup             
	//  235  505:bipush          13
	//  236  507:getstatic       #86  <Field BraavaMissionStatus WatchdogTimedOut>
	//  237  510:aastore         
	//  238  511:dup             
	//  239  512:bipush          14
	//  240  514:getstatic       #89  <Field BraavaMissionStatus FailedToRelocalize>
	//  241  517:aastore         
	//  242  518:dup             
	//  243  519:bipush          15
	//  244  521:getstatic       #92  <Field BraavaMissionStatus FailedToGoHome>
	//  245  524:aastore         
	//  246  525:dup             
	//  247  526:bipush          16
	//  248  528:getstatic       #95  <Field BraavaMissionStatus MaxCoverage>
	//  249  531:aastore         
	//  250  532:dup             
	//  251  533:bipush          17
	//  252  535:getstatic       #98  <Field BraavaMissionStatus PadIdError>
	//  253  538:aastore         
	//  254  539:dup             
	//  255  540:bipush          18
	//  256  542:getstatic       #101 <Field BraavaMissionStatus ConstantCliff>
	//  257  545:aastore         
	//  258  546:dup             
	//  259  547:bipush          19
	//  260  549:getstatic       #104 <Field BraavaMissionStatus WheelDrop>
	//  261  552:aastore         
	//  262  553:dup             
	//  263  554:bipush          20
	//  264  556:getstatic       #107 <Field BraavaMissionStatus Stuck>
	//  265  559:aastore         
	//  266  560:dup             
	//  267  561:bipush          21
	//  268  563:getstatic       #110 <Field BraavaMissionStatus Trapped>
	//  269  566:aastore         
	//  270  567:dup             
	//  271  568:bipush          22
	//  272  570:getstatic       #113 <Field BraavaMissionStatus HighMotorCurrent>
	//  273  573:aastore         
	//  274  574:dup             
	//  275  575:bipush          23
	//  276  577:getstatic       #116 <Field BraavaMissionStatus FailedToMakeProgress>
	//  277  580:aastore         
	//  278  581:dup             
	//  279  582:bipush          24
	//  280  584:getstatic       #119 <Field BraavaMissionStatus OutOfBounds>
	//  281  587:aastore         
	//  282  588:dup             
	//  283  589:bipush          25
	//  284  591:getstatic       #122 <Field BraavaMissionStatus GyroHardwareFailure>
	//  285  594:aastore         
	//  286  595:dup             
	//  287  596:bipush          26
	//  288  598:getstatic       #125 <Field BraavaMissionStatus MissionInProgress>
	//  289  601:aastore         
	//  290  602:dup             
	//  291  603:bipush          27
	//  292  605:getstatic       #128 <Field BraavaMissionStatus RobotReset>
	//  293  608:aastore         
	//  294  609:dup             
	//  295  610:bipush          28
	//  296  612:getstatic       #131 <Field BraavaMissionStatus UnknownCleaningResult>
	//  297  615:aastore         
	//  298  616:dup             
	//  299  617:bipush          29
	//  300  619:getstatic       #134 <Field BraavaMissionStatus UnhandledGenericFailure>
	//  301  622:aastore         
	//  302  623:putstatic       #136 <Field BraavaMissionStatus[] $VALUES>
	//* 303  626:return          
	}
}
