// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class MissionDataState extends Enum
{

	private MissionDataState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #114 <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static MissionDataState valueOf(String s)
	{
		return (MissionDataState)Enum.valueOf(com/irobot/core/MissionDataState, s);
	//    0    0:ldc1            #2   <Class MissionDataState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #120 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class MissionDataState>
	//    4    9:areturn         
	}

	public static MissionDataState[] values()
	{
		return (MissionDataState[])((MissionDataState []) ($VALUES)).clone();
	//    0    0:getstatic       #112 <Field MissionDataState[] $VALUES>
	//    1    3:invokevirtual   #127 <Method Object _5B_Lcom.irobot.core.MissionDataState_3B_.clone()>
	//    2    6:checkcast       #123 <Class MissionDataState[]>
	//    3    9:areturn         
	}

	private static final MissionDataState $VALUES[];
	public static final MissionDataState BatteryLevel;
	public static final MissionDataState Binfull;
	public static final MissionDataState Charging;
	public static final MissionDataState DockInfo;
	public static final MissionDataState EvacDockMode;
	public static final MissionDataState EvacDockTour;
	public static final MissionDataState EvacHelpContentId;
	public static final MissionDataState EvacStatusMessage;
	public static final MissionDataState HelpContentId;
	public static final MissionDataState HelpContentUrl;
	public static final MissionDataState Invalid;
	public static final MissionDataState LogStreamData;
	public static final MissionDataState LogStreamState;
	public static final MissionDataState MissionAction;
	public static final MissionDataState MissionStatus;
	public static final MissionDataState PadCategory;
	public static final MissionDataState PauseExpireTime;
	public static final MissionDataState PauseResumeTime;
	public static final MissionDataState StatusMessage;
	public static final MissionDataState StatusMessageArgs;
	public static final MissionDataState StatusMessageType;
	public static final MissionDataState TankLevel;
	public static final MissionDataState TankLow;
	public static final MissionDataState Training;

	static 
	{
		MissionStatus = new MissionDataState("MissionStatus", 0);
	//    0    0:new             #2   <Class MissionDataState>
	//    1    3:dup             
	//    2    4:ldc1            #35  <String "MissionStatus">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #39  <Method void MissionDataState(String, int)>
	//    5   10:putstatic       #41  <Field MissionDataState MissionStatus>
		Charging = new MissionDataState("Charging", 1);
	//    6   13:new             #2   <Class MissionDataState>
	//    7   16:dup             
	//    8   17:ldc1            #42  <String "Charging">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #39  <Method void MissionDataState(String, int)>
	//   11   23:putstatic       #44  <Field MissionDataState Charging>
		Binfull = new MissionDataState("Binfull", 2);
	//   12   26:new             #2   <Class MissionDataState>
	//   13   29:dup             
	//   14   30:ldc1            #45  <String "Binfull">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #39  <Method void MissionDataState(String, int)>
	//   17   36:putstatic       #47  <Field MissionDataState Binfull>
		TankLow = new MissionDataState("TankLow", 3);
	//   18   39:new             #2   <Class MissionDataState>
	//   19   42:dup             
	//   20   43:ldc1            #48  <String "TankLow">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #39  <Method void MissionDataState(String, int)>
	//   23   49:putstatic       #50  <Field MissionDataState TankLow>
		PauseExpireTime = new MissionDataState("PauseExpireTime", 4);
	//   24   52:new             #2   <Class MissionDataState>
	//   25   55:dup             
	//   26   56:ldc1            #51  <String "PauseExpireTime">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #39  <Method void MissionDataState(String, int)>
	//   29   62:putstatic       #53  <Field MissionDataState PauseExpireTime>
		PauseResumeTime = new MissionDataState("PauseResumeTime", 5);
	//   30   65:new             #2   <Class MissionDataState>
	//   31   68:dup             
	//   32   69:ldc1            #54  <String "PauseResumeTime">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #39  <Method void MissionDataState(String, int)>
	//   35   75:putstatic       #56  <Field MissionDataState PauseResumeTime>
		StatusMessage = new MissionDataState("StatusMessage", 6);
	//   36   78:new             #2   <Class MissionDataState>
	//   37   81:dup             
	//   38   82:ldc1            #57  <String "StatusMessage">
	//   39   84:bipush          6
	//   40   86:invokespecial   #39  <Method void MissionDataState(String, int)>
	//   41   89:putstatic       #59  <Field MissionDataState StatusMessage>
		StatusMessageArgs = new MissionDataState("StatusMessageArgs", 7);
	//   42   92:new             #2   <Class MissionDataState>
	//   43   95:dup             
	//   44   96:ldc1            #60  <String "StatusMessageArgs">
	//   45   98:bipush          7
	//   46  100:invokespecial   #39  <Method void MissionDataState(String, int)>
	//   47  103:putstatic       #62  <Field MissionDataState StatusMessageArgs>
		HelpContentId = new MissionDataState("HelpContentId", 8);
	//   48  106:new             #2   <Class MissionDataState>
	//   49  109:dup             
	//   50  110:ldc1            #63  <String "HelpContentId">
	//   51  112:bipush          8
	//   52  114:invokespecial   #39  <Method void MissionDataState(String, int)>
	//   53  117:putstatic       #65  <Field MissionDataState HelpContentId>
		HelpContentUrl = new MissionDataState("HelpContentUrl", 9);
	//   54  120:new             #2   <Class MissionDataState>
	//   55  123:dup             
	//   56  124:ldc1            #66  <String "HelpContentUrl">
	//   57  126:bipush          9
	//   58  128:invokespecial   #39  <Method void MissionDataState(String, int)>
	//   59  131:putstatic       #68  <Field MissionDataState HelpContentUrl>
		Training = new MissionDataState("Training", 10);
	//   60  134:new             #2   <Class MissionDataState>
	//   61  137:dup             
	//   62  138:ldc1            #69  <String "Training">
	//   63  140:bipush          10
	//   64  142:invokespecial   #39  <Method void MissionDataState(String, int)>
	//   65  145:putstatic       #71  <Field MissionDataState Training>
		MissionAction = new MissionDataState("MissionAction", 11);
	//   66  148:new             #2   <Class MissionDataState>
	//   67  151:dup             
	//   68  152:ldc1            #72  <String "MissionAction">
	//   69  154:bipush          11
	//   70  156:invokespecial   #39  <Method void MissionDataState(String, int)>
	//   71  159:putstatic       #74  <Field MissionDataState MissionAction>
		StatusMessageType = new MissionDataState("StatusMessageType", 12);
	//   72  162:new             #2   <Class MissionDataState>
	//   73  165:dup             
	//   74  166:ldc1            #75  <String "StatusMessageType">
	//   75  168:bipush          12
	//   76  170:invokespecial   #39  <Method void MissionDataState(String, int)>
	//   77  173:putstatic       #77  <Field MissionDataState StatusMessageType>
		BatteryLevel = new MissionDataState("BatteryLevel", 13);
	//   78  176:new             #2   <Class MissionDataState>
	//   79  179:dup             
	//   80  180:ldc1            #78  <String "BatteryLevel">
	//   81  182:bipush          13
	//   82  184:invokespecial   #39  <Method void MissionDataState(String, int)>
	//   83  187:putstatic       #80  <Field MissionDataState BatteryLevel>
		DockInfo = new MissionDataState("DockInfo", 14);
	//   84  190:new             #2   <Class MissionDataState>
	//   85  193:dup             
	//   86  194:ldc1            #81  <String "DockInfo">
	//   87  196:bipush          14
	//   88  198:invokespecial   #39  <Method void MissionDataState(String, int)>
	//   89  201:putstatic       #83  <Field MissionDataState DockInfo>
		TankLevel = new MissionDataState("TankLevel", 15);
	//   90  204:new             #2   <Class MissionDataState>
	//   91  207:dup             
	//   92  208:ldc1            #84  <String "TankLevel">
	//   93  210:bipush          15
	//   94  212:invokespecial   #39  <Method void MissionDataState(String, int)>
	//   95  215:putstatic       #86  <Field MissionDataState TankLevel>
		PadCategory = new MissionDataState("PadCategory", 16);
	//   96  218:new             #2   <Class MissionDataState>
	//   97  221:dup             
	//   98  222:ldc1            #87  <String "PadCategory">
	//   99  224:bipush          16
	//  100  226:invokespecial   #39  <Method void MissionDataState(String, int)>
	//  101  229:putstatic       #89  <Field MissionDataState PadCategory>
		EvacDockMode = new MissionDataState("EvacDockMode", 17);
	//  102  232:new             #2   <Class MissionDataState>
	//  103  235:dup             
	//  104  236:ldc1            #90  <String "EvacDockMode">
	//  105  238:bipush          17
	//  106  240:invokespecial   #39  <Method void MissionDataState(String, int)>
	//  107  243:putstatic       #92  <Field MissionDataState EvacDockMode>
		EvacStatusMessage = new MissionDataState("EvacStatusMessage", 18);
	//  108  246:new             #2   <Class MissionDataState>
	//  109  249:dup             
	//  110  250:ldc1            #93  <String "EvacStatusMessage">
	//  111  252:bipush          18
	//  112  254:invokespecial   #39  <Method void MissionDataState(String, int)>
	//  113  257:putstatic       #95  <Field MissionDataState EvacStatusMessage>
		EvacHelpContentId = new MissionDataState("EvacHelpContentId", 19);
	//  114  260:new             #2   <Class MissionDataState>
	//  115  263:dup             
	//  116  264:ldc1            #96  <String "EvacHelpContentId">
	//  117  266:bipush          19
	//  118  268:invokespecial   #39  <Method void MissionDataState(String, int)>
	//  119  271:putstatic       #98  <Field MissionDataState EvacHelpContentId>
		EvacDockTour = new MissionDataState("EvacDockTour", 20);
	//  120  274:new             #2   <Class MissionDataState>
	//  121  277:dup             
	//  122  278:ldc1            #99  <String "EvacDockTour">
	//  123  280:bipush          20
	//  124  282:invokespecial   #39  <Method void MissionDataState(String, int)>
	//  125  285:putstatic       #101 <Field MissionDataState EvacDockTour>
		LogStreamState = new MissionDataState("LogStreamState", 21);
	//  126  288:new             #2   <Class MissionDataState>
	//  127  291:dup             
	//  128  292:ldc1            #102 <String "LogStreamState">
	//  129  294:bipush          21
	//  130  296:invokespecial   #39  <Method void MissionDataState(String, int)>
	//  131  299:putstatic       #104 <Field MissionDataState LogStreamState>
		LogStreamData = new MissionDataState("LogStreamData", 22);
	//  132  302:new             #2   <Class MissionDataState>
	//  133  305:dup             
	//  134  306:ldc1            #105 <String "LogStreamData">
	//  135  308:bipush          22
	//  136  310:invokespecial   #39  <Method void MissionDataState(String, int)>
	//  137  313:putstatic       #107 <Field MissionDataState LogStreamData>
		Invalid = new MissionDataState("Invalid", 23);
	//  138  316:new             #2   <Class MissionDataState>
	//  139  319:dup             
	//  140  320:ldc1            #108 <String "Invalid">
	//  141  322:bipush          23
	//  142  324:invokespecial   #39  <Method void MissionDataState(String, int)>
	//  143  327:putstatic       #110 <Field MissionDataState Invalid>
		$VALUES = (new MissionDataState[] {
			MissionStatus, Charging, Binfull, TankLow, PauseExpireTime, PauseResumeTime, StatusMessage, StatusMessageArgs, HelpContentId, HelpContentUrl, 
			Training, MissionAction, StatusMessageType, BatteryLevel, DockInfo, TankLevel, PadCategory, EvacDockMode, EvacStatusMessage, EvacHelpContentId, 
			EvacDockTour, LogStreamState, LogStreamData, Invalid
		});
	//  144  330:bipush          24
	//  145  332:anewarray       MissionDataState[]
	//  146  335:dup             
	//  147  336:iconst_0        
	//  148  337:getstatic       #41  <Field MissionDataState MissionStatus>
	//  149  340:aastore         
	//  150  341:dup             
	//  151  342:iconst_1        
	//  152  343:getstatic       #44  <Field MissionDataState Charging>
	//  153  346:aastore         
	//  154  347:dup             
	//  155  348:iconst_2        
	//  156  349:getstatic       #47  <Field MissionDataState Binfull>
	//  157  352:aastore         
	//  158  353:dup             
	//  159  354:iconst_3        
	//  160  355:getstatic       #50  <Field MissionDataState TankLow>
	//  161  358:aastore         
	//  162  359:dup             
	//  163  360:iconst_4        
	//  164  361:getstatic       #53  <Field MissionDataState PauseExpireTime>
	//  165  364:aastore         
	//  166  365:dup             
	//  167  366:iconst_5        
	//  168  367:getstatic       #56  <Field MissionDataState PauseResumeTime>
	//  169  370:aastore         
	//  170  371:dup             
	//  171  372:bipush          6
	//  172  374:getstatic       #59  <Field MissionDataState StatusMessage>
	//  173  377:aastore         
	//  174  378:dup             
	//  175  379:bipush          7
	//  176  381:getstatic       #62  <Field MissionDataState StatusMessageArgs>
	//  177  384:aastore         
	//  178  385:dup             
	//  179  386:bipush          8
	//  180  388:getstatic       #65  <Field MissionDataState HelpContentId>
	//  181  391:aastore         
	//  182  392:dup             
	//  183  393:bipush          9
	//  184  395:getstatic       #68  <Field MissionDataState HelpContentUrl>
	//  185  398:aastore         
	//  186  399:dup             
	//  187  400:bipush          10
	//  188  402:getstatic       #71  <Field MissionDataState Training>
	//  189  405:aastore         
	//  190  406:dup             
	//  191  407:bipush          11
	//  192  409:getstatic       #74  <Field MissionDataState MissionAction>
	//  193  412:aastore         
	//  194  413:dup             
	//  195  414:bipush          12
	//  196  416:getstatic       #77  <Field MissionDataState StatusMessageType>
	//  197  419:aastore         
	//  198  420:dup             
	//  199  421:bipush          13
	//  200  423:getstatic       #80  <Field MissionDataState BatteryLevel>
	//  201  426:aastore         
	//  202  427:dup             
	//  203  428:bipush          14
	//  204  430:getstatic       #83  <Field MissionDataState DockInfo>
	//  205  433:aastore         
	//  206  434:dup             
	//  207  435:bipush          15
	//  208  437:getstatic       #86  <Field MissionDataState TankLevel>
	//  209  440:aastore         
	//  210  441:dup             
	//  211  442:bipush          16
	//  212  444:getstatic       #89  <Field MissionDataState PadCategory>
	//  213  447:aastore         
	//  214  448:dup             
	//  215  449:bipush          17
	//  216  451:getstatic       #92  <Field MissionDataState EvacDockMode>
	//  217  454:aastore         
	//  218  455:dup             
	//  219  456:bipush          18
	//  220  458:getstatic       #95  <Field MissionDataState EvacStatusMessage>
	//  221  461:aastore         
	//  222  462:dup             
	//  223  463:bipush          19
	//  224  465:getstatic       #98  <Field MissionDataState EvacHelpContentId>
	//  225  468:aastore         
	//  226  469:dup             
	//  227  470:bipush          20
	//  228  472:getstatic       #101 <Field MissionDataState EvacDockTour>
	//  229  475:aastore         
	//  230  476:dup             
	//  231  477:bipush          21
	//  232  479:getstatic       #104 <Field MissionDataState LogStreamState>
	//  233  482:aastore         
	//  234  483:dup             
	//  235  484:bipush          22
	//  236  486:getstatic       #107 <Field MissionDataState LogStreamData>
	//  237  489:aastore         
	//  238  490:dup             
	//  239  491:bipush          23
	//  240  493:getstatic       #110 <Field MissionDataState Invalid>
	//  241  496:aastore         
	//  242  497:putstatic       #112 <Field MissionDataState[] $VALUES>
	//* 243  500:return          
	}
}
