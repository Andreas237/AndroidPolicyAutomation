// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class ResolvedMissionStatus extends Enum
{

	private ResolvedMissionStatus(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #234 <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static ResolvedMissionStatus valueOf(String s)
	{
		return (ResolvedMissionStatus)Enum.valueOf(com/irobot/core/ResolvedMissionStatus, s);
	//    0    0:ldc1            #2   <Class ResolvedMissionStatus>
	//    1    2:aload_0         
	//    2    3:invokestatic    #240 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ResolvedMissionStatus>
	//    4    9:areturn         
	}

	public static ResolvedMissionStatus[] values()
	{
		return (ResolvedMissionStatus[])((ResolvedMissionStatus []) ($VALUES)).clone();
	//    0    0:getstatic       #232 <Field ResolvedMissionStatus[] $VALUES>
	//    1    3:invokevirtual   #247 <Method Object _5B_Lcom.irobot.core.ResolvedMissionStatus_3B_.clone()>
	//    2    6:checkcast       #243 <Class ResolvedMissionStatus[]>
	//    3    9:areturn         
	}

	private static final ResolvedMissionStatus $VALUES[];
	public static final ResolvedMissionStatus Cleaning;
	public static final ResolvedMissionStatus ConnectionConnecting;
	public static final ResolvedMissionStatus ConnectionDisconnected;
	public static final ResolvedMissionStatus ConnectionError;
	public static final ResolvedMissionStatus ConnectionRemoteMissing;
	public static final ResolvedMissionStatus DockEvacuating;
	public static final ResolvedMissionStatus EndJobNoDock;
	public static final ResolvedMissionStatus EndJobWithDock;
	public static final ResolvedMissionStatus ErrorAreaTooLarge;
	public static final ResolvedMissionStatus ErrorBatteryOverTemp;
	public static final ResolvedMissionStatus ErrorBumped;
	public static final ResolvedMissionStatus ErrorCliff;
	public static final ResolvedMissionStatus ErrorDeadBattery;
	public static final ResolvedMissionStatus ErrorFailedToGoHome;
	public static final ResolvedMissionStatus ErrorGyroCal;
	public static final ResolvedMissionStatus ErrorGyroHardwareFailure;
	public static final ResolvedMissionStatus ErrorInvalidPad;
	public static final ResolvedMissionStatus ErrorKidnap;
	public static final ResolvedMissionStatus ErrorLowBattery;
	public static final ResolvedMissionStatus ErrorNoWheelProgress;
	public static final ResolvedMissionStatus ErrorOutOfBounds;
	public static final ResolvedMissionStatus ErrorPadError;
	public static final ResolvedMissionStatus ErrorStuck;
	public static final ResolvedMissionStatus ErrorStuckNoProgress;
	public static final ResolvedMissionStatus ErrorStuckOverEdge;
	public static final ResolvedMissionStatus ErrorTimedOut;
	public static final ResolvedMissionStatus ErrorUnexpectedRobotReset;
	public static final ResolvedMissionStatus ErrorWatchDogTimer;
	public static final ResolvedMissionStatus Idle;
	public static final ResolvedMissionStatus InMission;
	public static final ResolvedMissionStatus Invalid;
	public static final ResolvedMissionStatus JobCanceledByRobot;
	public static final ResolvedMissionStatus JobCanceledByUser;
	public static final ResolvedMissionStatus JobComplete;
	public static final ResolvedMissionStatus JobIncompleteFailedRelocalize;
	public static final ResolvedMissionStatus JobIncompleteResultUnknown;
	public static final ResolvedMissionStatus JobIncompleteUnknownFailure;
	public static final ResolvedMissionStatus MissionStarting;
	public static final ResolvedMissionStatus MissionStopping;
	public static final ResolvedMissionStatus NotReadyStartRefuse;
	public static final ResolvedMissionStatus Paused;
	public static final ResolvedMissionStatus PausedWithError;
	public static final ResolvedMissionStatus PausedWithStartRefuse;
	public static final ResolvedMissionStatus Pausing;
	public static final ResolvedMissionStatus Ready;
	public static final ResolvedMissionStatus ReadyChooseCleanType;
	public static final ResolvedMissionStatus ReadyWithError;
	public static final ResolvedMissionStatus ResumeCleaning;
	public static final ResolvedMissionStatus ReturnToDock;
	public static final ResolvedMissionStatus SpotCleaning;
	public static final ResolvedMissionStatus StartCleaning;
	public static final ResolvedMissionStatus Training;
	public static final ResolvedMissionStatus Unknown;
	public static final ResolvedMissionStatus WetMoppingPausedWithStartRefuse;

	static 
	{
		Invalid = new ResolvedMissionStatus("Invalid", 0);
	//    0    0:new             #2   <Class ResolvedMissionStatus>
	//    1    3:dup             
	//    2    4:ldc1            #65  <String "Invalid">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//    5   10:putstatic       #71  <Field ResolvedMissionStatus Invalid>
		Idle = new ResolvedMissionStatus("Idle", 1);
	//    6   13:new             #2   <Class ResolvedMissionStatus>
	//    7   16:dup             
	//    8   17:ldc1            #72  <String "Idle">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//   11   23:putstatic       #74  <Field ResolvedMissionStatus Idle>
		MissionStarting = new ResolvedMissionStatus("MissionStarting", 2);
	//   12   26:new             #2   <Class ResolvedMissionStatus>
	//   13   29:dup             
	//   14   30:ldc1            #75  <String "MissionStarting">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//   17   36:putstatic       #77  <Field ResolvedMissionStatus MissionStarting>
		MissionStopping = new ResolvedMissionStatus("MissionStopping", 3);
	//   18   39:new             #2   <Class ResolvedMissionStatus>
	//   19   42:dup             
	//   20   43:ldc1            #78  <String "MissionStopping">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//   23   49:putstatic       #80  <Field ResolvedMissionStatus MissionStopping>
		InMission = new ResolvedMissionStatus("InMission", 4);
	//   24   52:new             #2   <Class ResolvedMissionStatus>
	//   25   55:dup             
	//   26   56:ldc1            #81  <String "InMission">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//   29   62:putstatic       #83  <Field ResolvedMissionStatus InMission>
		JobIncompleteResultUnknown = new ResolvedMissionStatus("JobIncompleteResultUnknown", 5);
	//   30   65:new             #2   <Class ResolvedMissionStatus>
	//   31   68:dup             
	//   32   69:ldc1            #84  <String "JobIncompleteResultUnknown">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//   35   75:putstatic       #86  <Field ResolvedMissionStatus JobIncompleteResultUnknown>
		JobIncompleteUnknownFailure = new ResolvedMissionStatus("JobIncompleteUnknownFailure", 6);
	//   36   78:new             #2   <Class ResolvedMissionStatus>
	//   37   81:dup             
	//   38   82:ldc1            #87  <String "JobIncompleteUnknownFailure">
	//   39   84:bipush          6
	//   40   86:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//   41   89:putstatic       #89  <Field ResolvedMissionStatus JobIncompleteUnknownFailure>
		JobIncompleteFailedRelocalize = new ResolvedMissionStatus("JobIncompleteFailedRelocalize", 7);
	//   42   92:new             #2   <Class ResolvedMissionStatus>
	//   43   95:dup             
	//   44   96:ldc1            #90  <String "JobIncompleteFailedRelocalize">
	//   45   98:bipush          7
	//   46  100:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//   47  103:putstatic       #92  <Field ResolvedMissionStatus JobIncompleteFailedRelocalize>
		JobComplete = new ResolvedMissionStatus("JobComplete", 8);
	//   48  106:new             #2   <Class ResolvedMissionStatus>
	//   49  109:dup             
	//   50  110:ldc1            #93  <String "JobComplete">
	//   51  112:bipush          8
	//   52  114:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//   53  117:putstatic       #95  <Field ResolvedMissionStatus JobComplete>
		JobCanceledByUser = new ResolvedMissionStatus("JobCanceledByUser", 9);
	//   54  120:new             #2   <Class ResolvedMissionStatus>
	//   55  123:dup             
	//   56  124:ldc1            #96  <String "JobCanceledByUser">
	//   57  126:bipush          9
	//   58  128:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//   59  131:putstatic       #98  <Field ResolvedMissionStatus JobCanceledByUser>
		JobCanceledByRobot = new ResolvedMissionStatus("JobCanceledByRobot", 10);
	//   60  134:new             #2   <Class ResolvedMissionStatus>
	//   61  137:dup             
	//   62  138:ldc1            #99  <String "JobCanceledByRobot">
	//   63  140:bipush          10
	//   64  142:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//   65  145:putstatic       #101 <Field ResolvedMissionStatus JobCanceledByRobot>
		ErrorCliff = new ResolvedMissionStatus("ErrorCliff", 11);
	//   66  148:new             #2   <Class ResolvedMissionStatus>
	//   67  151:dup             
	//   68  152:ldc1            #102 <String "ErrorCliff">
	//   69  154:bipush          11
	//   70  156:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//   71  159:putstatic       #104 <Field ResolvedMissionStatus ErrorCliff>
		ErrorBumped = new ResolvedMissionStatus("ErrorBumped", 12);
	//   72  162:new             #2   <Class ResolvedMissionStatus>
	//   73  165:dup             
	//   74  166:ldc1            #105 <String "ErrorBumped">
	//   75  168:bipush          12
	//   76  170:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//   77  173:putstatic       #107 <Field ResolvedMissionStatus ErrorBumped>
		ErrorGyroCal = new ResolvedMissionStatus("ErrorGyroCal", 13);
	//   78  176:new             #2   <Class ResolvedMissionStatus>
	//   79  179:dup             
	//   80  180:ldc1            #108 <String "ErrorGyroCal">
	//   81  182:bipush          13
	//   82  184:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//   83  187:putstatic       #110 <Field ResolvedMissionStatus ErrorGyroCal>
		ErrorBatteryOverTemp = new ResolvedMissionStatus("ErrorBatteryOverTemp", 14);
	//   84  190:new             #2   <Class ResolvedMissionStatus>
	//   85  193:dup             
	//   86  194:ldc1            #111 <String "ErrorBatteryOverTemp">
	//   87  196:bipush          14
	//   88  198:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//   89  201:putstatic       #113 <Field ResolvedMissionStatus ErrorBatteryOverTemp>
		ErrorLowBattery = new ResolvedMissionStatus("ErrorLowBattery", 15);
	//   90  204:new             #2   <Class ResolvedMissionStatus>
	//   91  207:dup             
	//   92  208:ldc1            #114 <String "ErrorLowBattery">
	//   93  210:bipush          15
	//   94  212:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//   95  215:putstatic       #116 <Field ResolvedMissionStatus ErrorLowBattery>
		ErrorDeadBattery = new ResolvedMissionStatus("ErrorDeadBattery", 16);
	//   96  218:new             #2   <Class ResolvedMissionStatus>
	//   97  221:dup             
	//   98  222:ldc1            #117 <String "ErrorDeadBattery">
	//   99  224:bipush          16
	//  100  226:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  101  229:putstatic       #119 <Field ResolvedMissionStatus ErrorDeadBattery>
		ErrorTimedOut = new ResolvedMissionStatus("ErrorTimedOut", 17);
	//  102  232:new             #2   <Class ResolvedMissionStatus>
	//  103  235:dup             
	//  104  236:ldc1            #120 <String "ErrorTimedOut">
	//  105  238:bipush          17
	//  106  240:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  107  243:putstatic       #122 <Field ResolvedMissionStatus ErrorTimedOut>
		ErrorPadError = new ResolvedMissionStatus("ErrorPadError", 18);
	//  108  246:new             #2   <Class ResolvedMissionStatus>
	//  109  249:dup             
	//  110  250:ldc1            #123 <String "ErrorPadError">
	//  111  252:bipush          18
	//  112  254:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  113  257:putstatic       #125 <Field ResolvedMissionStatus ErrorPadError>
		ErrorStuckOverEdge = new ResolvedMissionStatus("ErrorStuckOverEdge", 19);
	//  114  260:new             #2   <Class ResolvedMissionStatus>
	//  115  263:dup             
	//  116  264:ldc1            #126 <String "ErrorStuckOverEdge">
	//  117  266:bipush          19
	//  118  268:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  119  271:putstatic       #128 <Field ResolvedMissionStatus ErrorStuckOverEdge>
		ErrorStuck = new ResolvedMissionStatus("ErrorStuck", 20);
	//  120  274:new             #2   <Class ResolvedMissionStatus>
	//  121  277:dup             
	//  122  278:ldc1            #129 <String "ErrorStuck">
	//  123  280:bipush          20
	//  124  282:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  125  285:putstatic       #131 <Field ResolvedMissionStatus ErrorStuck>
		ErrorNoWheelProgress = new ResolvedMissionStatus("ErrorNoWheelProgress", 21);
	//  126  288:new             #2   <Class ResolvedMissionStatus>
	//  127  291:dup             
	//  128  292:ldc1            #132 <String "ErrorNoWheelProgress">
	//  129  294:bipush          21
	//  130  296:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  131  299:putstatic       #134 <Field ResolvedMissionStatus ErrorNoWheelProgress>
		ErrorAreaTooLarge = new ResolvedMissionStatus("ErrorAreaTooLarge", 22);
	//  132  302:new             #2   <Class ResolvedMissionStatus>
	//  133  305:dup             
	//  134  306:ldc1            #135 <String "ErrorAreaTooLarge">
	//  135  308:bipush          22
	//  136  310:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  137  313:putstatic       #137 <Field ResolvedMissionStatus ErrorAreaTooLarge>
		ErrorFailedToGoHome = new ResolvedMissionStatus("ErrorFailedToGoHome", 23);
	//  138  316:new             #2   <Class ResolvedMissionStatus>
	//  139  319:dup             
	//  140  320:ldc1            #138 <String "ErrorFailedToGoHome">
	//  141  322:bipush          23
	//  142  324:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  143  327:putstatic       #140 <Field ResolvedMissionStatus ErrorFailedToGoHome>
		ErrorOutOfBounds = new ResolvedMissionStatus("ErrorOutOfBounds", 24);
	//  144  330:new             #2   <Class ResolvedMissionStatus>
	//  145  333:dup             
	//  146  334:ldc1            #141 <String "ErrorOutOfBounds">
	//  147  336:bipush          24
	//  148  338:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  149  341:putstatic       #143 <Field ResolvedMissionStatus ErrorOutOfBounds>
		ErrorStuckNoProgress = new ResolvedMissionStatus("ErrorStuckNoProgress", 25);
	//  150  344:new             #2   <Class ResolvedMissionStatus>
	//  151  347:dup             
	//  152  348:ldc1            #144 <String "ErrorStuckNoProgress">
	//  153  350:bipush          25
	//  154  352:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  155  355:putstatic       #146 <Field ResolvedMissionStatus ErrorStuckNoProgress>
		ErrorKidnap = new ResolvedMissionStatus("ErrorKidnap", 26);
	//  156  358:new             #2   <Class ResolvedMissionStatus>
	//  157  361:dup             
	//  158  362:ldc1            #147 <String "ErrorKidnap">
	//  159  364:bipush          26
	//  160  366:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  161  369:putstatic       #149 <Field ResolvedMissionStatus ErrorKidnap>
		ErrorInvalidPad = new ResolvedMissionStatus("ErrorInvalidPad", 27);
	//  162  372:new             #2   <Class ResolvedMissionStatus>
	//  163  375:dup             
	//  164  376:ldc1            #150 <String "ErrorInvalidPad">
	//  165  378:bipush          27
	//  166  380:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  167  383:putstatic       #152 <Field ResolvedMissionStatus ErrorInvalidPad>
		ErrorWatchDogTimer = new ResolvedMissionStatus("ErrorWatchDogTimer", 28);
	//  168  386:new             #2   <Class ResolvedMissionStatus>
	//  169  389:dup             
	//  170  390:ldc1            #153 <String "ErrorWatchDogTimer">
	//  171  392:bipush          28
	//  172  394:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  173  397:putstatic       #155 <Field ResolvedMissionStatus ErrorWatchDogTimer>
		ErrorGyroHardwareFailure = new ResolvedMissionStatus("ErrorGyroHardwareFailure", 29);
	//  174  400:new             #2   <Class ResolvedMissionStatus>
	//  175  403:dup             
	//  176  404:ldc1            #156 <String "ErrorGyroHardwareFailure">
	//  177  406:bipush          29
	//  178  408:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  179  411:putstatic       #158 <Field ResolvedMissionStatus ErrorGyroHardwareFailure>
		ErrorUnexpectedRobotReset = new ResolvedMissionStatus("ErrorUnexpectedRobotReset", 30);
	//  180  414:new             #2   <Class ResolvedMissionStatus>
	//  181  417:dup             
	//  182  418:ldc1            #159 <String "ErrorUnexpectedRobotReset">
	//  183  420:bipush          30
	//  184  422:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  185  425:putstatic       #161 <Field ResolvedMissionStatus ErrorUnexpectedRobotReset>
		Unknown = new ResolvedMissionStatus("Unknown", 31);
	//  186  428:new             #2   <Class ResolvedMissionStatus>
	//  187  431:dup             
	//  188  432:ldc1            #162 <String "Unknown">
	//  189  434:bipush          31
	//  190  436:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  191  439:putstatic       #164 <Field ResolvedMissionStatus Unknown>
		Ready = new ResolvedMissionStatus("Ready", 32);
	//  192  442:new             #2   <Class ResolvedMissionStatus>
	//  193  445:dup             
	//  194  446:ldc1            #165 <String "Ready">
	//  195  448:bipush          32
	//  196  450:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  197  453:putstatic       #167 <Field ResolvedMissionStatus Ready>
		ReadyWithError = new ResolvedMissionStatus("ReadyWithError", 33);
	//  198  456:new             #2   <Class ResolvedMissionStatus>
	//  199  459:dup             
	//  200  460:ldc1            #168 <String "ReadyWithError">
	//  201  462:bipush          33
	//  202  464:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  203  467:putstatic       #170 <Field ResolvedMissionStatus ReadyWithError>
		ReadyChooseCleanType = new ResolvedMissionStatus("ReadyChooseCleanType", 34);
	//  204  470:new             #2   <Class ResolvedMissionStatus>
	//  205  473:dup             
	//  206  474:ldc1            #171 <String "ReadyChooseCleanType">
	//  207  476:bipush          34
	//  208  478:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  209  481:putstatic       #173 <Field ResolvedMissionStatus ReadyChooseCleanType>
		NotReadyStartRefuse = new ResolvedMissionStatus("NotReadyStartRefuse", 35);
	//  210  484:new             #2   <Class ResolvedMissionStatus>
	//  211  487:dup             
	//  212  488:ldc1            #174 <String "NotReadyStartRefuse">
	//  213  490:bipush          35
	//  214  492:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  215  495:putstatic       #176 <Field ResolvedMissionStatus NotReadyStartRefuse>
		StartCleaning = new ResolvedMissionStatus("StartCleaning", 36);
	//  216  498:new             #2   <Class ResolvedMissionStatus>
	//  217  501:dup             
	//  218  502:ldc1            #177 <String "StartCleaning">
	//  219  504:bipush          36
	//  220  506:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  221  509:putstatic       #179 <Field ResolvedMissionStatus StartCleaning>
		Cleaning = new ResolvedMissionStatus("Cleaning", 37);
	//  222  512:new             #2   <Class ResolvedMissionStatus>
	//  223  515:dup             
	//  224  516:ldc1            #180 <String "Cleaning">
	//  225  518:bipush          37
	//  226  520:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  227  523:putstatic       #182 <Field ResolvedMissionStatus Cleaning>
		ResumeCleaning = new ResolvedMissionStatus("ResumeCleaning", 38);
	//  228  526:new             #2   <Class ResolvedMissionStatus>
	//  229  529:dup             
	//  230  530:ldc1            #183 <String "ResumeCleaning">
	//  231  532:bipush          38
	//  232  534:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  233  537:putstatic       #185 <Field ResolvedMissionStatus ResumeCleaning>
		Pausing = new ResolvedMissionStatus("Pausing", 39);
	//  234  540:new             #2   <Class ResolvedMissionStatus>
	//  235  543:dup             
	//  236  544:ldc1            #186 <String "Pausing">
	//  237  546:bipush          39
	//  238  548:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  239  551:putstatic       #188 <Field ResolvedMissionStatus Pausing>
		Paused = new ResolvedMissionStatus("Paused", 40);
	//  240  554:new             #2   <Class ResolvedMissionStatus>
	//  241  557:dup             
	//  242  558:ldc1            #189 <String "Paused">
	//  243  560:bipush          40
	//  244  562:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  245  565:putstatic       #191 <Field ResolvedMissionStatus Paused>
		PausedWithError = new ResolvedMissionStatus("PausedWithError", 41);
	//  246  568:new             #2   <Class ResolvedMissionStatus>
	//  247  571:dup             
	//  248  572:ldc1            #192 <String "PausedWithError">
	//  249  574:bipush          41
	//  250  576:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  251  579:putstatic       #194 <Field ResolvedMissionStatus PausedWithError>
		PausedWithStartRefuse = new ResolvedMissionStatus("PausedWithStartRefuse", 42);
	//  252  582:new             #2   <Class ResolvedMissionStatus>
	//  253  585:dup             
	//  254  586:ldc1            #195 <String "PausedWithStartRefuse">
	//  255  588:bipush          42
	//  256  590:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  257  593:putstatic       #197 <Field ResolvedMissionStatus PausedWithStartRefuse>
		WetMoppingPausedWithStartRefuse = new ResolvedMissionStatus("WetMoppingPausedWithStartRefuse", 43);
	//  258  596:new             #2   <Class ResolvedMissionStatus>
	//  259  599:dup             
	//  260  600:ldc1            #198 <String "WetMoppingPausedWithStartRefuse">
	//  261  602:bipush          43
	//  262  604:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  263  607:putstatic       #200 <Field ResolvedMissionStatus WetMoppingPausedWithStartRefuse>
		EndJobNoDock = new ResolvedMissionStatus("EndJobNoDock", 44);
	//  264  610:new             #2   <Class ResolvedMissionStatus>
	//  265  613:dup             
	//  266  614:ldc1            #201 <String "EndJobNoDock">
	//  267  616:bipush          44
	//  268  618:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  269  621:putstatic       #203 <Field ResolvedMissionStatus EndJobNoDock>
		EndJobWithDock = new ResolvedMissionStatus("EndJobWithDock", 45);
	//  270  624:new             #2   <Class ResolvedMissionStatus>
	//  271  627:dup             
	//  272  628:ldc1            #204 <String "EndJobWithDock">
	//  273  630:bipush          45
	//  274  632:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  275  635:putstatic       #206 <Field ResolvedMissionStatus EndJobWithDock>
		ReturnToDock = new ResolvedMissionStatus("ReturnToDock", 46);
	//  276  638:new             #2   <Class ResolvedMissionStatus>
	//  277  641:dup             
	//  278  642:ldc1            #207 <String "ReturnToDock">
	//  279  644:bipush          46
	//  280  646:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  281  649:putstatic       #209 <Field ResolvedMissionStatus ReturnToDock>
		DockEvacuating = new ResolvedMissionStatus("DockEvacuating", 47);
	//  282  652:new             #2   <Class ResolvedMissionStatus>
	//  283  655:dup             
	//  284  656:ldc1            #210 <String "DockEvacuating">
	//  285  658:bipush          47
	//  286  660:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  287  663:putstatic       #212 <Field ResolvedMissionStatus DockEvacuating>
		Training = new ResolvedMissionStatus("Training", 48);
	//  288  666:new             #2   <Class ResolvedMissionStatus>
	//  289  669:dup             
	//  290  670:ldc1            #213 <String "Training">
	//  291  672:bipush          48
	//  292  674:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  293  677:putstatic       #215 <Field ResolvedMissionStatus Training>
		SpotCleaning = new ResolvedMissionStatus("SpotCleaning", 49);
	//  294  680:new             #2   <Class ResolvedMissionStatus>
	//  295  683:dup             
	//  296  684:ldc1            #216 <String "SpotCleaning">
	//  297  686:bipush          49
	//  298  688:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  299  691:putstatic       #218 <Field ResolvedMissionStatus SpotCleaning>
		ConnectionConnecting = new ResolvedMissionStatus("ConnectionConnecting", 50);
	//  300  694:new             #2   <Class ResolvedMissionStatus>
	//  301  697:dup             
	//  302  698:ldc1            #219 <String "ConnectionConnecting">
	//  303  700:bipush          50
	//  304  702:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  305  705:putstatic       #221 <Field ResolvedMissionStatus ConnectionConnecting>
		ConnectionRemoteMissing = new ResolvedMissionStatus("ConnectionRemoteMissing", 51);
	//  306  708:new             #2   <Class ResolvedMissionStatus>
	//  307  711:dup             
	//  308  712:ldc1            #222 <String "ConnectionRemoteMissing">
	//  309  714:bipush          51
	//  310  716:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  311  719:putstatic       #224 <Field ResolvedMissionStatus ConnectionRemoteMissing>
		ConnectionError = new ResolvedMissionStatus("ConnectionError", 52);
	//  312  722:new             #2   <Class ResolvedMissionStatus>
	//  313  725:dup             
	//  314  726:ldc1            #225 <String "ConnectionError">
	//  315  728:bipush          52
	//  316  730:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  317  733:putstatic       #227 <Field ResolvedMissionStatus ConnectionError>
		ConnectionDisconnected = new ResolvedMissionStatus("ConnectionDisconnected", 53);
	//  318  736:new             #2   <Class ResolvedMissionStatus>
	//  319  739:dup             
	//  320  740:ldc1            #228 <String "ConnectionDisconnected">
	//  321  742:bipush          53
	//  322  744:invokespecial   #69  <Method void ResolvedMissionStatus(String, int)>
	//  323  747:putstatic       #230 <Field ResolvedMissionStatus ConnectionDisconnected>
		$VALUES = (new ResolvedMissionStatus[] {
			Invalid, Idle, MissionStarting, MissionStopping, InMission, JobIncompleteResultUnknown, JobIncompleteUnknownFailure, JobIncompleteFailedRelocalize, JobComplete, JobCanceledByUser, 
			JobCanceledByRobot, ErrorCliff, ErrorBumped, ErrorGyroCal, ErrorBatteryOverTemp, ErrorLowBattery, ErrorDeadBattery, ErrorTimedOut, ErrorPadError, ErrorStuckOverEdge, 
			ErrorStuck, ErrorNoWheelProgress, ErrorAreaTooLarge, ErrorFailedToGoHome, ErrorOutOfBounds, ErrorStuckNoProgress, ErrorKidnap, ErrorInvalidPad, ErrorWatchDogTimer, ErrorGyroHardwareFailure, 
			ErrorUnexpectedRobotReset, Unknown, Ready, ReadyWithError, ReadyChooseCleanType, NotReadyStartRefuse, StartCleaning, Cleaning, ResumeCleaning, Pausing, 
			Paused, PausedWithError, PausedWithStartRefuse, WetMoppingPausedWithStartRefuse, EndJobNoDock, EndJobWithDock, ReturnToDock, DockEvacuating, Training, SpotCleaning, 
			ConnectionConnecting, ConnectionRemoteMissing, ConnectionError, ConnectionDisconnected
		});
	//  324  750:bipush          54
	//  325  752:anewarray       ResolvedMissionStatus[]
	//  326  755:dup             
	//  327  756:iconst_0        
	//  328  757:getstatic       #71  <Field ResolvedMissionStatus Invalid>
	//  329  760:aastore         
	//  330  761:dup             
	//  331  762:iconst_1        
	//  332  763:getstatic       #74  <Field ResolvedMissionStatus Idle>
	//  333  766:aastore         
	//  334  767:dup             
	//  335  768:iconst_2        
	//  336  769:getstatic       #77  <Field ResolvedMissionStatus MissionStarting>
	//  337  772:aastore         
	//  338  773:dup             
	//  339  774:iconst_3        
	//  340  775:getstatic       #80  <Field ResolvedMissionStatus MissionStopping>
	//  341  778:aastore         
	//  342  779:dup             
	//  343  780:iconst_4        
	//  344  781:getstatic       #83  <Field ResolvedMissionStatus InMission>
	//  345  784:aastore         
	//  346  785:dup             
	//  347  786:iconst_5        
	//  348  787:getstatic       #86  <Field ResolvedMissionStatus JobIncompleteResultUnknown>
	//  349  790:aastore         
	//  350  791:dup             
	//  351  792:bipush          6
	//  352  794:getstatic       #89  <Field ResolvedMissionStatus JobIncompleteUnknownFailure>
	//  353  797:aastore         
	//  354  798:dup             
	//  355  799:bipush          7
	//  356  801:getstatic       #92  <Field ResolvedMissionStatus JobIncompleteFailedRelocalize>
	//  357  804:aastore         
	//  358  805:dup             
	//  359  806:bipush          8
	//  360  808:getstatic       #95  <Field ResolvedMissionStatus JobComplete>
	//  361  811:aastore         
	//  362  812:dup             
	//  363  813:bipush          9
	//  364  815:getstatic       #98  <Field ResolvedMissionStatus JobCanceledByUser>
	//  365  818:aastore         
	//  366  819:dup             
	//  367  820:bipush          10
	//  368  822:getstatic       #101 <Field ResolvedMissionStatus JobCanceledByRobot>
	//  369  825:aastore         
	//  370  826:dup             
	//  371  827:bipush          11
	//  372  829:getstatic       #104 <Field ResolvedMissionStatus ErrorCliff>
	//  373  832:aastore         
	//  374  833:dup             
	//  375  834:bipush          12
	//  376  836:getstatic       #107 <Field ResolvedMissionStatus ErrorBumped>
	//  377  839:aastore         
	//  378  840:dup             
	//  379  841:bipush          13
	//  380  843:getstatic       #110 <Field ResolvedMissionStatus ErrorGyroCal>
	//  381  846:aastore         
	//  382  847:dup             
	//  383  848:bipush          14
	//  384  850:getstatic       #113 <Field ResolvedMissionStatus ErrorBatteryOverTemp>
	//  385  853:aastore         
	//  386  854:dup             
	//  387  855:bipush          15
	//  388  857:getstatic       #116 <Field ResolvedMissionStatus ErrorLowBattery>
	//  389  860:aastore         
	//  390  861:dup             
	//  391  862:bipush          16
	//  392  864:getstatic       #119 <Field ResolvedMissionStatus ErrorDeadBattery>
	//  393  867:aastore         
	//  394  868:dup             
	//  395  869:bipush          17
	//  396  871:getstatic       #122 <Field ResolvedMissionStatus ErrorTimedOut>
	//  397  874:aastore         
	//  398  875:dup             
	//  399  876:bipush          18
	//  400  878:getstatic       #125 <Field ResolvedMissionStatus ErrorPadError>
	//  401  881:aastore         
	//  402  882:dup             
	//  403  883:bipush          19
	//  404  885:getstatic       #128 <Field ResolvedMissionStatus ErrorStuckOverEdge>
	//  405  888:aastore         
	//  406  889:dup             
	//  407  890:bipush          20
	//  408  892:getstatic       #131 <Field ResolvedMissionStatus ErrorStuck>
	//  409  895:aastore         
	//  410  896:dup             
	//  411  897:bipush          21
	//  412  899:getstatic       #134 <Field ResolvedMissionStatus ErrorNoWheelProgress>
	//  413  902:aastore         
	//  414  903:dup             
	//  415  904:bipush          22
	//  416  906:getstatic       #137 <Field ResolvedMissionStatus ErrorAreaTooLarge>
	//  417  909:aastore         
	//  418  910:dup             
	//  419  911:bipush          23
	//  420  913:getstatic       #140 <Field ResolvedMissionStatus ErrorFailedToGoHome>
	//  421  916:aastore         
	//  422  917:dup             
	//  423  918:bipush          24
	//  424  920:getstatic       #143 <Field ResolvedMissionStatus ErrorOutOfBounds>
	//  425  923:aastore         
	//  426  924:dup             
	//  427  925:bipush          25
	//  428  927:getstatic       #146 <Field ResolvedMissionStatus ErrorStuckNoProgress>
	//  429  930:aastore         
	//  430  931:dup             
	//  431  932:bipush          26
	//  432  934:getstatic       #149 <Field ResolvedMissionStatus ErrorKidnap>
	//  433  937:aastore         
	//  434  938:dup             
	//  435  939:bipush          27
	//  436  941:getstatic       #152 <Field ResolvedMissionStatus ErrorInvalidPad>
	//  437  944:aastore         
	//  438  945:dup             
	//  439  946:bipush          28
	//  440  948:getstatic       #155 <Field ResolvedMissionStatus ErrorWatchDogTimer>
	//  441  951:aastore         
	//  442  952:dup             
	//  443  953:bipush          29
	//  444  955:getstatic       #158 <Field ResolvedMissionStatus ErrorGyroHardwareFailure>
	//  445  958:aastore         
	//  446  959:dup             
	//  447  960:bipush          30
	//  448  962:getstatic       #161 <Field ResolvedMissionStatus ErrorUnexpectedRobotReset>
	//  449  965:aastore         
	//  450  966:dup             
	//  451  967:bipush          31
	//  452  969:getstatic       #164 <Field ResolvedMissionStatus Unknown>
	//  453  972:aastore         
	//  454  973:dup             
	//  455  974:bipush          32
	//  456  976:getstatic       #167 <Field ResolvedMissionStatus Ready>
	//  457  979:aastore         
	//  458  980:dup             
	//  459  981:bipush          33
	//  460  983:getstatic       #170 <Field ResolvedMissionStatus ReadyWithError>
	//  461  986:aastore         
	//  462  987:dup             
	//  463  988:bipush          34
	//  464  990:getstatic       #173 <Field ResolvedMissionStatus ReadyChooseCleanType>
	//  465  993:aastore         
	//  466  994:dup             
	//  467  995:bipush          35
	//  468  997:getstatic       #176 <Field ResolvedMissionStatus NotReadyStartRefuse>
	//  469 1000:aastore         
	//  470 1001:dup             
	//  471 1002:bipush          36
	//  472 1004:getstatic       #179 <Field ResolvedMissionStatus StartCleaning>
	//  473 1007:aastore         
	//  474 1008:dup             
	//  475 1009:bipush          37
	//  476 1011:getstatic       #182 <Field ResolvedMissionStatus Cleaning>
	//  477 1014:aastore         
	//  478 1015:dup             
	//  479 1016:bipush          38
	//  480 1018:getstatic       #185 <Field ResolvedMissionStatus ResumeCleaning>
	//  481 1021:aastore         
	//  482 1022:dup             
	//  483 1023:bipush          39
	//  484 1025:getstatic       #188 <Field ResolvedMissionStatus Pausing>
	//  485 1028:aastore         
	//  486 1029:dup             
	//  487 1030:bipush          40
	//  488 1032:getstatic       #191 <Field ResolvedMissionStatus Paused>
	//  489 1035:aastore         
	//  490 1036:dup             
	//  491 1037:bipush          41
	//  492 1039:getstatic       #194 <Field ResolvedMissionStatus PausedWithError>
	//  493 1042:aastore         
	//  494 1043:dup             
	//  495 1044:bipush          42
	//  496 1046:getstatic       #197 <Field ResolvedMissionStatus PausedWithStartRefuse>
	//  497 1049:aastore         
	//  498 1050:dup             
	//  499 1051:bipush          43
	//  500 1053:getstatic       #200 <Field ResolvedMissionStatus WetMoppingPausedWithStartRefuse>
	//  501 1056:aastore         
	//  502 1057:dup             
	//  503 1058:bipush          44
	//  504 1060:getstatic       #203 <Field ResolvedMissionStatus EndJobNoDock>
	//  505 1063:aastore         
	//  506 1064:dup             
	//  507 1065:bipush          45
	//  508 1067:getstatic       #206 <Field ResolvedMissionStatus EndJobWithDock>
	//  509 1070:aastore         
	//  510 1071:dup             
	//  511 1072:bipush          46
	//  512 1074:getstatic       #209 <Field ResolvedMissionStatus ReturnToDock>
	//  513 1077:aastore         
	//  514 1078:dup             
	//  515 1079:bipush          47
	//  516 1081:getstatic       #212 <Field ResolvedMissionStatus DockEvacuating>
	//  517 1084:aastore         
	//  518 1085:dup             
	//  519 1086:bipush          48
	//  520 1088:getstatic       #215 <Field ResolvedMissionStatus Training>
	//  521 1091:aastore         
	//  522 1092:dup             
	//  523 1093:bipush          49
	//  524 1095:getstatic       #218 <Field ResolvedMissionStatus SpotCleaning>
	//  525 1098:aastore         
	//  526 1099:dup             
	//  527 1100:bipush          50
	//  528 1102:getstatic       #221 <Field ResolvedMissionStatus ConnectionConnecting>
	//  529 1105:aastore         
	//  530 1106:dup             
	//  531 1107:bipush          51
	//  532 1109:getstatic       #224 <Field ResolvedMissionStatus ConnectionRemoteMissing>
	//  533 1112:aastore         
	//  534 1113:dup             
	//  535 1114:bipush          52
	//  536 1116:getstatic       #227 <Field ResolvedMissionStatus ConnectionError>
	//  537 1119:aastore         
	//  538 1120:dup             
	//  539 1121:bipush          53
	//  540 1123:getstatic       #230 <Field ResolvedMissionStatus ConnectionDisconnected>
	//  541 1126:aastore         
	//  542 1127:putstatic       #232 <Field ResolvedMissionStatus[] $VALUES>
	//* 543 1130:return          
	}
}
