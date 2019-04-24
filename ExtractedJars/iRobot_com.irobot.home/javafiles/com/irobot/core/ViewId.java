// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class ViewId extends Enum
{

	private ViewId(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #342 <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static ViewId valueOf(String s)
	{
		return (ViewId)Enum.valueOf(com/irobot/core/ViewId, s);
	//    0    0:ldc1            #2   <Class ViewId>
	//    1    2:aload_0         
	//    2    3:invokestatic    #348 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ViewId>
	//    4    9:areturn         
	}

	public static ViewId[] values()
	{
		return (ViewId[])((ViewId []) ($VALUES)).clone();
	//    0    0:getstatic       #340 <Field ViewId[] $VALUES>
	//    1    3:invokevirtual   #355 <Method Object _5B_Lcom.irobot.core.ViewId_3B_.clone()>
	//    2    6:checkcast       #351 <Class ViewId[]>
	//    3    9:areturn         
	}

	private static final ViewId $VALUES[];
	public static final ViewId AboutRobot;
	public static final ViewId AboutThisApp;
	public static final ViewId AboutThisAppEula;
	public static final ViewId AccountAndPrivacy;
	public static final ViewId AccountOptions;
	public static final ViewId AdditionalHelp;
	public static final ViewId BetaProgram;
	public static final ViewId BetaProgramIntro;
	public static final ViewId BraavaPadOptions;
	public static final ViewId BraavaSpotClean;
	public static final ViewId Care;
	public static final ViewId CareBin;
	public static final ViewId CareCoreRobot;
	public static final ViewId CarpetBoostSetting;
	public static final ViewId CleanButtonIntro1;
	public static final ViewId CleanButtonIntro2;
	public static final ViewId CleanScheduleTwoChangeLayoutPrompt;
	public static final ViewId CleanScheduleTwoCleaningPreset;
	public static final ViewId CleanScheduleTwoCreate;
	public static final ViewId CleanScheduleTwoExistingSchedule;
	public static final ViewId CleanScheduleTwoScheduleLimit;
	public static final ViewId CleanScheduleTwoWelcome;
	public static final ViewId CleaningPassesSetting;
	public static final ViewId CommonQuestions;
	public static final ViewId ConnectedHome;
	public static final ViewId CountryPicker;
	public static final ViewId CreateAccount;
	public static final ViewId CreateAccountSideMenu;
	public static final ViewId DebrisExtractor;
	public static final ViewId EvacDockAboutDock;
	public static final ViewId EvacDockBagMissingHelpContent;
	public static final ViewId ExpeditedOta;
	public static final ViewId Help;
	public static final ViewId Login;
	public static final ViewId ManageAccount;
	public static final ViewId MissionHistoryDetailBottomSheet;
	public static final ViewId More;
	public static final ViewId NotificationCenter;
	public static final ViewId NotificationCenterNotificationDetail;
	public static final ViewId NotificationSettings;
	public static final ViewId OnDemandOtaFailed;
	public static final ViewId OnDemandOtaSetupComplete;
	public static final ViewId OnDemandOtaSuccess;
	public static final ViewId PMapsChooseRooms;
	public static final ViewId PMapsCustomizeCustomizeComplete;
	public static final ViewId PMapsCustomizeIntro;
	public static final ViewId PMapsCustomizeLabelRooms;
	public static final ViewId PMapsCustomizeNameMap;
	public static final ViewId PMapsCustomizeSetupRooms;
	public static final ViewId PMapsIntro1;
	public static final ViewId PMapsIntro2;
	public static final ViewId PMapsIntro3;
	public static final ViewId PMapsIntro4;
	public static final ViewId PMapsIntro5;
	public static final ViewId PMapsIntroComplete;
	public static final ViewId PMapsList;
	public static final ViewId PMapsMapPreview;
	public static final ViewId PMapsMapReady;
	public static final ViewId PMapsNoMap;
	public static final ViewId PMapsSettingUpInstructions;
	public static final ViewId PMapsTip1;
	public static final ViewId PMapsTip2;
	public static final ViewId PMapsTip3;
	public static final ViewId PMapsTrainingRunPreparation;
	public static final ViewId PMapsTroubleshootingIncomplete;
	public static final ViewId PMapsTroubleshootingList;
	public static final ViewId PMapsTroubleshootingUnderstanding;
	public static final ViewId PMapsTroubleshootingWrong;
	public static final ViewId Privacy;
	public static final ViewId ReducedPowerStandby;
	public static final ViewId RemoveRobot;
	public static final ViewId ResetRobot;
	public static final ViewId Schedule;
	public static final ViewId Settings;
	public static final ViewId UpdatePassword;
	public static final ViewId UpdateProfile;
	public static final ViewId Welcome;
	public static final ViewId WifiCoverageMap;
	public static final ViewId WifiMapBottomSheet;
	public static final ViewId WifiMapTab;
	public static final ViewId WifiSettings;

	static 
	{
		Schedule = new ViewId("Schedule", 0);
	//    0    0:new             #2   <Class ViewId>
	//    1    3:dup             
	//    2    4:ldc1            #92  <String "Schedule">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #96  <Method void ViewId(String, int)>
	//    5   10:putstatic       #98  <Field ViewId Schedule>
		CarpetBoostSetting = new ViewId("CarpetBoostSetting", 1);
	//    6   13:new             #2   <Class ViewId>
	//    7   16:dup             
	//    8   17:ldc1            #99  <String "CarpetBoostSetting">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #96  <Method void ViewId(String, int)>
	//   11   23:putstatic       #101 <Field ViewId CarpetBoostSetting>
		CleaningPassesSetting = new ViewId("CleaningPassesSetting", 2);
	//   12   26:new             #2   <Class ViewId>
	//   13   29:dup             
	//   14   30:ldc1            #102 <String "CleaningPassesSetting">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #96  <Method void ViewId(String, int)>
	//   17   36:putstatic       #104 <Field ViewId CleaningPassesSetting>
		More = new ViewId("More", 3);
	//   18   39:new             #2   <Class ViewId>
	//   19   42:dup             
	//   20   43:ldc1            #105 <String "More">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #96  <Method void ViewId(String, int)>
	//   23   49:putstatic       #107 <Field ViewId More>
		Care = new ViewId("Care", 4);
	//   24   52:new             #2   <Class ViewId>
	//   25   55:dup             
	//   26   56:ldc1            #108 <String "Care">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #96  <Method void ViewId(String, int)>
	//   29   62:putstatic       #110 <Field ViewId Care>
		Help = new ViewId("Help", 5);
	//   30   65:new             #2   <Class ViewId>
	//   31   68:dup             
	//   32   69:ldc1            #111 <String "Help">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #96  <Method void ViewId(String, int)>
	//   35   75:putstatic       #113 <Field ViewId Help>
		Settings = new ViewId("Settings", 6);
	//   36   78:new             #2   <Class ViewId>
	//   37   81:dup             
	//   38   82:ldc1            #114 <String "Settings">
	//   39   84:bipush          6
	//   40   86:invokespecial   #96  <Method void ViewId(String, int)>
	//   41   89:putstatic       #116 <Field ViewId Settings>
		MissionHistoryDetailBottomSheet = new ViewId("MissionHistoryDetailBottomSheet", 7);
	//   42   92:new             #2   <Class ViewId>
	//   43   95:dup             
	//   44   96:ldc1            #117 <String "MissionHistoryDetailBottomSheet">
	//   45   98:bipush          7
	//   46  100:invokespecial   #96  <Method void ViewId(String, int)>
	//   47  103:putstatic       #119 <Field ViewId MissionHistoryDetailBottomSheet>
		Welcome = new ViewId("Welcome", 8);
	//   48  106:new             #2   <Class ViewId>
	//   49  109:dup             
	//   50  110:ldc1            #120 <String "Welcome">
	//   51  112:bipush          8
	//   52  114:invokespecial   #96  <Method void ViewId(String, int)>
	//   53  117:putstatic       #122 <Field ViewId Welcome>
		AccountOptions = new ViewId("AccountOptions", 9);
	//   54  120:new             #2   <Class ViewId>
	//   55  123:dup             
	//   56  124:ldc1            #123 <String "AccountOptions">
	//   57  126:bipush          9
	//   58  128:invokespecial   #96  <Method void ViewId(String, int)>
	//   59  131:putstatic       #125 <Field ViewId AccountOptions>
		CountryPicker = new ViewId("CountryPicker", 10);
	//   60  134:new             #2   <Class ViewId>
	//   61  137:dup             
	//   62  138:ldc1            #126 <String "CountryPicker">
	//   63  140:bipush          10
	//   64  142:invokespecial   #96  <Method void ViewId(String, int)>
	//   65  145:putstatic       #128 <Field ViewId CountryPicker>
		Login = new ViewId("Login", 11);
	//   66  148:new             #2   <Class ViewId>
	//   67  151:dup             
	//   68  152:ldc1            #129 <String "Login">
	//   69  154:bipush          11
	//   70  156:invokespecial   #96  <Method void ViewId(String, int)>
	//   71  159:putstatic       #131 <Field ViewId Login>
		CreateAccount = new ViewId("CreateAccount", 12);
	//   72  162:new             #2   <Class ViewId>
	//   73  165:dup             
	//   74  166:ldc1            #132 <String "CreateAccount">
	//   75  168:bipush          12
	//   76  170:invokespecial   #96  <Method void ViewId(String, int)>
	//   77  173:putstatic       #134 <Field ViewId CreateAccount>
		CreateAccountSideMenu = new ViewId("CreateAccountSideMenu", 13);
	//   78  176:new             #2   <Class ViewId>
	//   79  179:dup             
	//   80  180:ldc1            #135 <String "CreateAccountSideMenu">
	//   81  182:bipush          13
	//   82  184:invokespecial   #96  <Method void ViewId(String, int)>
	//   83  187:putstatic       #137 <Field ViewId CreateAccountSideMenu>
		CareBin = new ViewId("CareBin", 14);
	//   84  190:new             #2   <Class ViewId>
	//   85  193:dup             
	//   86  194:ldc1            #138 <String "CareBin">
	//   87  196:bipush          14
	//   88  198:invokespecial   #96  <Method void ViewId(String, int)>
	//   89  201:putstatic       #140 <Field ViewId CareBin>
		CareCoreRobot = new ViewId("CareCoreRobot", 15);
	//   90  204:new             #2   <Class ViewId>
	//   91  207:dup             
	//   92  208:ldc1            #141 <String "CareCoreRobot">
	//   93  210:bipush          15
	//   94  212:invokespecial   #96  <Method void ViewId(String, int)>
	//   95  215:putstatic       #143 <Field ViewId CareCoreRobot>
		DebrisExtractor = new ViewId("DebrisExtractor", 16);
	//   96  218:new             #2   <Class ViewId>
	//   97  221:dup             
	//   98  222:ldc1            #144 <String "DebrisExtractor">
	//   99  224:bipush          16
	//  100  226:invokespecial   #96  <Method void ViewId(String, int)>
	//  101  229:putstatic       #146 <Field ViewId DebrisExtractor>
		AdditionalHelp = new ViewId("AdditionalHelp", 17);
	//  102  232:new             #2   <Class ViewId>
	//  103  235:dup             
	//  104  236:ldc1            #147 <String "AdditionalHelp">
	//  105  238:bipush          17
	//  106  240:invokespecial   #96  <Method void ViewId(String, int)>
	//  107  243:putstatic       #149 <Field ViewId AdditionalHelp>
		AboutThisApp = new ViewId("AboutThisApp", 18);
	//  108  246:new             #2   <Class ViewId>
	//  109  249:dup             
	//  110  250:ldc1            #150 <String "AboutThisApp">
	//  111  252:bipush          18
	//  112  254:invokespecial   #96  <Method void ViewId(String, int)>
	//  113  257:putstatic       #152 <Field ViewId AboutThisApp>
		AboutThisAppEula = new ViewId("AboutThisAppEula", 19);
	//  114  260:new             #2   <Class ViewId>
	//  115  263:dup             
	//  116  264:ldc1            #153 <String "AboutThisAppEula">
	//  117  266:bipush          19
	//  118  268:invokespecial   #96  <Method void ViewId(String, int)>
	//  119  271:putstatic       #155 <Field ViewId AboutThisAppEula>
		CommonQuestions = new ViewId("CommonQuestions", 20);
	//  120  274:new             #2   <Class ViewId>
	//  121  277:dup             
	//  122  278:ldc1            #156 <String "CommonQuestions">
	//  123  280:bipush          20
	//  124  282:invokespecial   #96  <Method void ViewId(String, int)>
	//  125  285:putstatic       #158 <Field ViewId CommonQuestions>
		WifiSettings = new ViewId("WifiSettings", 21);
	//  126  288:new             #2   <Class ViewId>
	//  127  291:dup             
	//  128  292:ldc1            #159 <String "WifiSettings">
	//  129  294:bipush          21
	//  130  296:invokespecial   #96  <Method void ViewId(String, int)>
	//  131  299:putstatic       #161 <Field ViewId WifiSettings>
		ReducedPowerStandby = new ViewId("ReducedPowerStandby", 22);
	//  132  302:new             #2   <Class ViewId>
	//  133  305:dup             
	//  134  306:ldc1            #162 <String "ReducedPowerStandby">
	//  135  308:bipush          22
	//  136  310:invokespecial   #96  <Method void ViewId(String, int)>
	//  137  313:putstatic       #164 <Field ViewId ReducedPowerStandby>
		AboutRobot = new ViewId("AboutRobot", 23);
	//  138  316:new             #2   <Class ViewId>
	//  139  319:dup             
	//  140  320:ldc1            #165 <String "AboutRobot">
	//  141  322:bipush          23
	//  142  324:invokespecial   #96  <Method void ViewId(String, int)>
	//  143  327:putstatic       #167 <Field ViewId AboutRobot>
		RemoveRobot = new ViewId("RemoveRobot", 24);
	//  144  330:new             #2   <Class ViewId>
	//  145  333:dup             
	//  146  334:ldc1            #168 <String "RemoveRobot">
	//  147  336:bipush          24
	//  148  338:invokespecial   #96  <Method void ViewId(String, int)>
	//  149  341:putstatic       #170 <Field ViewId RemoveRobot>
		ResetRobot = new ViewId("ResetRobot", 25);
	//  150  344:new             #2   <Class ViewId>
	//  151  347:dup             
	//  152  348:ldc1            #171 <String "ResetRobot">
	//  153  350:bipush          25
	//  154  352:invokespecial   #96  <Method void ViewId(String, int)>
	//  155  355:putstatic       #173 <Field ViewId ResetRobot>
		ConnectedHome = new ViewId("ConnectedHome", 26);
	//  156  358:new             #2   <Class ViewId>
	//  157  361:dup             
	//  158  362:ldc1            #174 <String "ConnectedHome">
	//  159  364:bipush          26
	//  160  366:invokespecial   #96  <Method void ViewId(String, int)>
	//  161  369:putstatic       #176 <Field ViewId ConnectedHome>
		BraavaSpotClean = new ViewId("BraavaSpotClean", 27);
	//  162  372:new             #2   <Class ViewId>
	//  163  375:dup             
	//  164  376:ldc1            #177 <String "BraavaSpotClean">
	//  165  378:bipush          27
	//  166  380:invokespecial   #96  <Method void ViewId(String, int)>
	//  167  383:putstatic       #179 <Field ViewId BraavaSpotClean>
		BraavaPadOptions = new ViewId("BraavaPadOptions", 28);
	//  168  386:new             #2   <Class ViewId>
	//  169  389:dup             
	//  170  390:ldc1            #180 <String "BraavaPadOptions">
	//  171  392:bipush          28
	//  172  394:invokespecial   #96  <Method void ViewId(String, int)>
	//  173  397:putstatic       #182 <Field ViewId BraavaPadOptions>
		ExpeditedOta = new ViewId("ExpeditedOta", 29);
	//  174  400:new             #2   <Class ViewId>
	//  175  403:dup             
	//  176  404:ldc1            #183 <String "ExpeditedOta">
	//  177  406:bipush          29
	//  178  408:invokespecial   #96  <Method void ViewId(String, int)>
	//  179  411:putstatic       #185 <Field ViewId ExpeditedOta>
		AccountAndPrivacy = new ViewId("AccountAndPrivacy", 30);
	//  180  414:new             #2   <Class ViewId>
	//  181  417:dup             
	//  182  418:ldc1            #186 <String "AccountAndPrivacy">
	//  183  420:bipush          30
	//  184  422:invokespecial   #96  <Method void ViewId(String, int)>
	//  185  425:putstatic       #188 <Field ViewId AccountAndPrivacy>
		ManageAccount = new ViewId("ManageAccount", 31);
	//  186  428:new             #2   <Class ViewId>
	//  187  431:dup             
	//  188  432:ldc1            #189 <String "ManageAccount">
	//  189  434:bipush          31
	//  190  436:invokespecial   #96  <Method void ViewId(String, int)>
	//  191  439:putstatic       #191 <Field ViewId ManageAccount>
		UpdateProfile = new ViewId("UpdateProfile", 32);
	//  192  442:new             #2   <Class ViewId>
	//  193  445:dup             
	//  194  446:ldc1            #192 <String "UpdateProfile">
	//  195  448:bipush          32
	//  196  450:invokespecial   #96  <Method void ViewId(String, int)>
	//  197  453:putstatic       #194 <Field ViewId UpdateProfile>
		UpdatePassword = new ViewId("UpdatePassword", 33);
	//  198  456:new             #2   <Class ViewId>
	//  199  459:dup             
	//  200  460:ldc1            #195 <String "UpdatePassword">
	//  201  462:bipush          33
	//  202  464:invokespecial   #96  <Method void ViewId(String, int)>
	//  203  467:putstatic       #197 <Field ViewId UpdatePassword>
		NotificationSettings = new ViewId("NotificationSettings", 34);
	//  204  470:new             #2   <Class ViewId>
	//  205  473:dup             
	//  206  474:ldc1            #198 <String "NotificationSettings">
	//  207  476:bipush          34
	//  208  478:invokespecial   #96  <Method void ViewId(String, int)>
	//  209  481:putstatic       #200 <Field ViewId NotificationSettings>
		Privacy = new ViewId("Privacy", 35);
	//  210  484:new             #2   <Class ViewId>
	//  211  487:dup             
	//  212  488:ldc1            #201 <String "Privacy">
	//  213  490:bipush          35
	//  214  492:invokespecial   #96  <Method void ViewId(String, int)>
	//  215  495:putstatic       #203 <Field ViewId Privacy>
		BetaProgram = new ViewId("BetaProgram", 36);
	//  216  498:new             #2   <Class ViewId>
	//  217  501:dup             
	//  218  502:ldc1            #204 <String "BetaProgram">
	//  219  504:bipush          36
	//  220  506:invokespecial   #96  <Method void ViewId(String, int)>
	//  221  509:putstatic       #206 <Field ViewId BetaProgram>
		WifiCoverageMap = new ViewId("WifiCoverageMap", 37);
	//  222  512:new             #2   <Class ViewId>
	//  223  515:dup             
	//  224  516:ldc1            #207 <String "WifiCoverageMap">
	//  225  518:bipush          37
	//  226  520:invokespecial   #96  <Method void ViewId(String, int)>
	//  227  523:putstatic       #209 <Field ViewId WifiCoverageMap>
		WifiMapTab = new ViewId("WifiMapTab", 38);
	//  228  526:new             #2   <Class ViewId>
	//  229  529:dup             
	//  230  530:ldc1            #210 <String "WifiMapTab">
	//  231  532:bipush          38
	//  232  534:invokespecial   #96  <Method void ViewId(String, int)>
	//  233  537:putstatic       #212 <Field ViewId WifiMapTab>
		WifiMapBottomSheet = new ViewId("WifiMapBottomSheet", 39);
	//  234  540:new             #2   <Class ViewId>
	//  235  543:dup             
	//  236  544:ldc1            #213 <String "WifiMapBottomSheet">
	//  237  546:bipush          39
	//  238  548:invokespecial   #96  <Method void ViewId(String, int)>
	//  239  551:putstatic       #215 <Field ViewId WifiMapBottomSheet>
		CleanScheduleTwoWelcome = new ViewId("CleanScheduleTwoWelcome", 40);
	//  240  554:new             #2   <Class ViewId>
	//  241  557:dup             
	//  242  558:ldc1            #216 <String "CleanScheduleTwoWelcome">
	//  243  560:bipush          40
	//  244  562:invokespecial   #96  <Method void ViewId(String, int)>
	//  245  565:putstatic       #218 <Field ViewId CleanScheduleTwoWelcome>
		CleanScheduleTwoCreate = new ViewId("CleanScheduleTwoCreate", 41);
	//  246  568:new             #2   <Class ViewId>
	//  247  571:dup             
	//  248  572:ldc1            #219 <String "CleanScheduleTwoCreate">
	//  249  574:bipush          41
	//  250  576:invokespecial   #96  <Method void ViewId(String, int)>
	//  251  579:putstatic       #221 <Field ViewId CleanScheduleTwoCreate>
		CleanScheduleTwoCleaningPreset = new ViewId("CleanScheduleTwoCleaningPreset", 42);
	//  252  582:new             #2   <Class ViewId>
	//  253  585:dup             
	//  254  586:ldc1            #222 <String "CleanScheduleTwoCleaningPreset">
	//  255  588:bipush          42
	//  256  590:invokespecial   #96  <Method void ViewId(String, int)>
	//  257  593:putstatic       #224 <Field ViewId CleanScheduleTwoCleaningPreset>
		CleanScheduleTwoExistingSchedule = new ViewId("CleanScheduleTwoExistingSchedule", 43);
	//  258  596:new             #2   <Class ViewId>
	//  259  599:dup             
	//  260  600:ldc1            #225 <String "CleanScheduleTwoExistingSchedule">
	//  261  602:bipush          43
	//  262  604:invokespecial   #96  <Method void ViewId(String, int)>
	//  263  607:putstatic       #227 <Field ViewId CleanScheduleTwoExistingSchedule>
		CleanScheduleTwoScheduleLimit = new ViewId("CleanScheduleTwoScheduleLimit", 44);
	//  264  610:new             #2   <Class ViewId>
	//  265  613:dup             
	//  266  614:ldc1            #228 <String "CleanScheduleTwoScheduleLimit">
	//  267  616:bipush          44
	//  268  618:invokespecial   #96  <Method void ViewId(String, int)>
	//  269  621:putstatic       #230 <Field ViewId CleanScheduleTwoScheduleLimit>
		CleanScheduleTwoChangeLayoutPrompt = new ViewId("CleanScheduleTwoChangeLayoutPrompt", 45);
	//  270  624:new             #2   <Class ViewId>
	//  271  627:dup             
	//  272  628:ldc1            #231 <String "CleanScheduleTwoChangeLayoutPrompt">
	//  273  630:bipush          45
	//  274  632:invokespecial   #96  <Method void ViewId(String, int)>
	//  275  635:putstatic       #233 <Field ViewId CleanScheduleTwoChangeLayoutPrompt>
		EvacDockBagMissingHelpContent = new ViewId("EvacDockBagMissingHelpContent", 46);
	//  276  638:new             #2   <Class ViewId>
	//  277  641:dup             
	//  278  642:ldc1            #234 <String "EvacDockBagMissingHelpContent">
	//  279  644:bipush          46
	//  280  646:invokespecial   #96  <Method void ViewId(String, int)>
	//  281  649:putstatic       #236 <Field ViewId EvacDockBagMissingHelpContent>
		EvacDockAboutDock = new ViewId("EvacDockAboutDock", 47);
	//  282  652:new             #2   <Class ViewId>
	//  283  655:dup             
	//  284  656:ldc1            #237 <String "EvacDockAboutDock">
	//  285  658:bipush          47
	//  286  660:invokespecial   #96  <Method void ViewId(String, int)>
	//  287  663:putstatic       #239 <Field ViewId EvacDockAboutDock>
		CleanButtonIntro1 = new ViewId("CleanButtonIntro1", 48);
	//  288  666:new             #2   <Class ViewId>
	//  289  669:dup             
	//  290  670:ldc1            #240 <String "CleanButtonIntro1">
	//  291  672:bipush          48
	//  292  674:invokespecial   #96  <Method void ViewId(String, int)>
	//  293  677:putstatic       #242 <Field ViewId CleanButtonIntro1>
		CleanButtonIntro2 = new ViewId("CleanButtonIntro2", 49);
	//  294  680:new             #2   <Class ViewId>
	//  295  683:dup             
	//  296  684:ldc1            #243 <String "CleanButtonIntro2">
	//  297  686:bipush          49
	//  298  688:invokespecial   #96  <Method void ViewId(String, int)>
	//  299  691:putstatic       #245 <Field ViewId CleanButtonIntro2>
		PMapsIntro1 = new ViewId("PMapsIntro1", 50);
	//  300  694:new             #2   <Class ViewId>
	//  301  697:dup             
	//  302  698:ldc1            #246 <String "PMapsIntro1">
	//  303  700:bipush          50
	//  304  702:invokespecial   #96  <Method void ViewId(String, int)>
	//  305  705:putstatic       #248 <Field ViewId PMapsIntro1>
		PMapsIntro2 = new ViewId("PMapsIntro2", 51);
	//  306  708:new             #2   <Class ViewId>
	//  307  711:dup             
	//  308  712:ldc1            #249 <String "PMapsIntro2">
	//  309  714:bipush          51
	//  310  716:invokespecial   #96  <Method void ViewId(String, int)>
	//  311  719:putstatic       #251 <Field ViewId PMapsIntro2>
		PMapsIntro3 = new ViewId("PMapsIntro3", 52);
	//  312  722:new             #2   <Class ViewId>
	//  313  725:dup             
	//  314  726:ldc1            #252 <String "PMapsIntro3">
	//  315  728:bipush          52
	//  316  730:invokespecial   #96  <Method void ViewId(String, int)>
	//  317  733:putstatic       #254 <Field ViewId PMapsIntro3>
		PMapsIntro4 = new ViewId("PMapsIntro4", 53);
	//  318  736:new             #2   <Class ViewId>
	//  319  739:dup             
	//  320  740:ldc1            #255 <String "PMapsIntro4">
	//  321  742:bipush          53
	//  322  744:invokespecial   #96  <Method void ViewId(String, int)>
	//  323  747:putstatic       #257 <Field ViewId PMapsIntro4>
		PMapsIntro5 = new ViewId("PMapsIntro5", 54);
	//  324  750:new             #2   <Class ViewId>
	//  325  753:dup             
	//  326  754:ldc2            #258 <String "PMapsIntro5">
	//  327  757:bipush          54
	//  328  759:invokespecial   #96  <Method void ViewId(String, int)>
	//  329  762:putstatic       #260 <Field ViewId PMapsIntro5>
		PMapsIntroComplete = new ViewId("PMapsIntroComplete", 55);
	//  330  765:new             #2   <Class ViewId>
	//  331  768:dup             
	//  332  769:ldc2            #261 <String "PMapsIntroComplete">
	//  333  772:bipush          55
	//  334  774:invokespecial   #96  <Method void ViewId(String, int)>
	//  335  777:putstatic       #263 <Field ViewId PMapsIntroComplete>
		PMapsTip1 = new ViewId("PMapsTip1", 56);
	//  336  780:new             #2   <Class ViewId>
	//  337  783:dup             
	//  338  784:ldc2            #264 <String "PMapsTip1">
	//  339  787:bipush          56
	//  340  789:invokespecial   #96  <Method void ViewId(String, int)>
	//  341  792:putstatic       #266 <Field ViewId PMapsTip1>
		PMapsTip2 = new ViewId("PMapsTip2", 57);
	//  342  795:new             #2   <Class ViewId>
	//  343  798:dup             
	//  344  799:ldc2            #267 <String "PMapsTip2">
	//  345  802:bipush          57
	//  346  804:invokespecial   #96  <Method void ViewId(String, int)>
	//  347  807:putstatic       #269 <Field ViewId PMapsTip2>
		PMapsTip3 = new ViewId("PMapsTip3", 58);
	//  348  810:new             #2   <Class ViewId>
	//  349  813:dup             
	//  350  814:ldc2            #270 <String "PMapsTip3">
	//  351  817:bipush          58
	//  352  819:invokespecial   #96  <Method void ViewId(String, int)>
	//  353  822:putstatic       #272 <Field ViewId PMapsTip3>
		PMapsTrainingRunPreparation = new ViewId("PMapsTrainingRunPreparation", 59);
	//  354  825:new             #2   <Class ViewId>
	//  355  828:dup             
	//  356  829:ldc2            #273 <String "PMapsTrainingRunPreparation">
	//  357  832:bipush          59
	//  358  834:invokespecial   #96  <Method void ViewId(String, int)>
	//  359  837:putstatic       #275 <Field ViewId PMapsTrainingRunPreparation>
		PMapsNoMap = new ViewId("PMapsNoMap", 60);
	//  360  840:new             #2   <Class ViewId>
	//  361  843:dup             
	//  362  844:ldc2            #276 <String "PMapsNoMap">
	//  363  847:bipush          60
	//  364  849:invokespecial   #96  <Method void ViewId(String, int)>
	//  365  852:putstatic       #278 <Field ViewId PMapsNoMap>
		PMapsList = new ViewId("PMapsList", 61);
	//  366  855:new             #2   <Class ViewId>
	//  367  858:dup             
	//  368  859:ldc2            #279 <String "PMapsList">
	//  369  862:bipush          61
	//  370  864:invokespecial   #96  <Method void ViewId(String, int)>
	//  371  867:putstatic       #281 <Field ViewId PMapsList>
		PMapsMapPreview = new ViewId("PMapsMapPreview", 62);
	//  372  870:new             #2   <Class ViewId>
	//  373  873:dup             
	//  374  874:ldc2            #282 <String "PMapsMapPreview">
	//  375  877:bipush          62
	//  376  879:invokespecial   #96  <Method void ViewId(String, int)>
	//  377  882:putstatic       #284 <Field ViewId PMapsMapPreview>
		PMapsMapReady = new ViewId("PMapsMapReady", 63);
	//  378  885:new             #2   <Class ViewId>
	//  379  888:dup             
	//  380  889:ldc2            #285 <String "PMapsMapReady">
	//  381  892:bipush          63
	//  382  894:invokespecial   #96  <Method void ViewId(String, int)>
	//  383  897:putstatic       #287 <Field ViewId PMapsMapReady>
		PMapsTroubleshootingList = new ViewId("PMapsTroubleshootingList", 64);
	//  384  900:new             #2   <Class ViewId>
	//  385  903:dup             
	//  386  904:ldc2            #288 <String "PMapsTroubleshootingList">
	//  387  907:bipush          64
	//  388  909:invokespecial   #96  <Method void ViewId(String, int)>
	//  389  912:putstatic       #290 <Field ViewId PMapsTroubleshootingList>
		PMapsTroubleshootingUnderstanding = new ViewId("PMapsTroubleshootingUnderstanding", 65);
	//  390  915:new             #2   <Class ViewId>
	//  391  918:dup             
	//  392  919:ldc2            #291 <String "PMapsTroubleshootingUnderstanding">
	//  393  922:bipush          65
	//  394  924:invokespecial   #96  <Method void ViewId(String, int)>
	//  395  927:putstatic       #293 <Field ViewId PMapsTroubleshootingUnderstanding>
		PMapsTroubleshootingIncomplete = new ViewId("PMapsTroubleshootingIncomplete", 66);
	//  396  930:new             #2   <Class ViewId>
	//  397  933:dup             
	//  398  934:ldc2            #294 <String "PMapsTroubleshootingIncomplete">
	//  399  937:bipush          66
	//  400  939:invokespecial   #96  <Method void ViewId(String, int)>
	//  401  942:putstatic       #296 <Field ViewId PMapsTroubleshootingIncomplete>
		PMapsTroubleshootingWrong = new ViewId("PMapsTroubleshootingWrong", 67);
	//  402  945:new             #2   <Class ViewId>
	//  403  948:dup             
	//  404  949:ldc2            #297 <String "PMapsTroubleshootingWrong">
	//  405  952:bipush          67
	//  406  954:invokespecial   #96  <Method void ViewId(String, int)>
	//  407  957:putstatic       #299 <Field ViewId PMapsTroubleshootingWrong>
		PMapsCustomizeIntro = new ViewId("PMapsCustomizeIntro", 68);
	//  408  960:new             #2   <Class ViewId>
	//  409  963:dup             
	//  410  964:ldc2            #300 <String "PMapsCustomizeIntro">
	//  411  967:bipush          68
	//  412  969:invokespecial   #96  <Method void ViewId(String, int)>
	//  413  972:putstatic       #302 <Field ViewId PMapsCustomizeIntro>
		PMapsCustomizeNameMap = new ViewId("PMapsCustomizeNameMap", 69);
	//  414  975:new             #2   <Class ViewId>
	//  415  978:dup             
	//  416  979:ldc2            #303 <String "PMapsCustomizeNameMap">
	//  417  982:bipush          69
	//  418  984:invokespecial   #96  <Method void ViewId(String, int)>
	//  419  987:putstatic       #305 <Field ViewId PMapsCustomizeNameMap>
		PMapsSettingUpInstructions = new ViewId("PMapsSettingUpInstructions", 70);
	//  420  990:new             #2   <Class ViewId>
	//  421  993:dup             
	//  422  994:ldc2            #306 <String "PMapsSettingUpInstructions">
	//  423  997:bipush          70
	//  424  999:invokespecial   #96  <Method void ViewId(String, int)>
	//  425 1002:putstatic       #308 <Field ViewId PMapsSettingUpInstructions>
		PMapsCustomizeSetupRooms = new ViewId("PMapsCustomizeSetupRooms", 71);
	//  426 1005:new             #2   <Class ViewId>
	//  427 1008:dup             
	//  428 1009:ldc2            #309 <String "PMapsCustomizeSetupRooms">
	//  429 1012:bipush          71
	//  430 1014:invokespecial   #96  <Method void ViewId(String, int)>
	//  431 1017:putstatic       #311 <Field ViewId PMapsCustomizeSetupRooms>
		PMapsCustomizeLabelRooms = new ViewId("PMapsCustomizeLabelRooms", 72);
	//  432 1020:new             #2   <Class ViewId>
	//  433 1023:dup             
	//  434 1024:ldc2            #312 <String "PMapsCustomizeLabelRooms">
	//  435 1027:bipush          72
	//  436 1029:invokespecial   #96  <Method void ViewId(String, int)>
	//  437 1032:putstatic       #314 <Field ViewId PMapsCustomizeLabelRooms>
		PMapsCustomizeCustomizeComplete = new ViewId("PMapsCustomizeCustomizeComplete", 73);
	//  438 1035:new             #2   <Class ViewId>
	//  439 1038:dup             
	//  440 1039:ldc2            #315 <String "PMapsCustomizeCustomizeComplete">
	//  441 1042:bipush          73
	//  442 1044:invokespecial   #96  <Method void ViewId(String, int)>
	//  443 1047:putstatic       #317 <Field ViewId PMapsCustomizeCustomizeComplete>
		PMapsChooseRooms = new ViewId("PMapsChooseRooms", 74);
	//  444 1050:new             #2   <Class ViewId>
	//  445 1053:dup             
	//  446 1054:ldc2            #318 <String "PMapsChooseRooms">
	//  447 1057:bipush          74
	//  448 1059:invokespecial   #96  <Method void ViewId(String, int)>
	//  449 1062:putstatic       #320 <Field ViewId PMapsChooseRooms>
		OnDemandOtaSetupComplete = new ViewId("OnDemandOtaSetupComplete", 75);
	//  450 1065:new             #2   <Class ViewId>
	//  451 1068:dup             
	//  452 1069:ldc2            #321 <String "OnDemandOtaSetupComplete">
	//  453 1072:bipush          75
	//  454 1074:invokespecial   #96  <Method void ViewId(String, int)>
	//  455 1077:putstatic       #323 <Field ViewId OnDemandOtaSetupComplete>
		OnDemandOtaFailed = new ViewId("OnDemandOtaFailed", 76);
	//  456 1080:new             #2   <Class ViewId>
	//  457 1083:dup             
	//  458 1084:ldc2            #324 <String "OnDemandOtaFailed">
	//  459 1087:bipush          76
	//  460 1089:invokespecial   #96  <Method void ViewId(String, int)>
	//  461 1092:putstatic       #326 <Field ViewId OnDemandOtaFailed>
		OnDemandOtaSuccess = new ViewId("OnDemandOtaSuccess", 77);
	//  462 1095:new             #2   <Class ViewId>
	//  463 1098:dup             
	//  464 1099:ldc2            #327 <String "OnDemandOtaSuccess">
	//  465 1102:bipush          77
	//  466 1104:invokespecial   #96  <Method void ViewId(String, int)>
	//  467 1107:putstatic       #329 <Field ViewId OnDemandOtaSuccess>
		NotificationCenter = new ViewId("NotificationCenter", 78);
	//  468 1110:new             #2   <Class ViewId>
	//  469 1113:dup             
	//  470 1114:ldc2            #330 <String "NotificationCenter">
	//  471 1117:bipush          78
	//  472 1119:invokespecial   #96  <Method void ViewId(String, int)>
	//  473 1122:putstatic       #332 <Field ViewId NotificationCenter>
		NotificationCenterNotificationDetail = new ViewId("NotificationCenterNotificationDetail", 79);
	//  474 1125:new             #2   <Class ViewId>
	//  475 1128:dup             
	//  476 1129:ldc2            #333 <String "NotificationCenterNotificationDetail">
	//  477 1132:bipush          79
	//  478 1134:invokespecial   #96  <Method void ViewId(String, int)>
	//  479 1137:putstatic       #335 <Field ViewId NotificationCenterNotificationDetail>
		BetaProgramIntro = new ViewId("BetaProgramIntro", 80);
	//  480 1140:new             #2   <Class ViewId>
	//  481 1143:dup             
	//  482 1144:ldc2            #336 <String "BetaProgramIntro">
	//  483 1147:bipush          80
	//  484 1149:invokespecial   #96  <Method void ViewId(String, int)>
	//  485 1152:putstatic       #338 <Field ViewId BetaProgramIntro>
		$VALUES = (new ViewId[] {
			Schedule, CarpetBoostSetting, CleaningPassesSetting, More, Care, Help, Settings, MissionHistoryDetailBottomSheet, Welcome, AccountOptions, 
			CountryPicker, Login, CreateAccount, CreateAccountSideMenu, CareBin, CareCoreRobot, DebrisExtractor, AdditionalHelp, AboutThisApp, AboutThisAppEula, 
			CommonQuestions, WifiSettings, ReducedPowerStandby, AboutRobot, RemoveRobot, ResetRobot, ConnectedHome, BraavaSpotClean, BraavaPadOptions, ExpeditedOta, 
			AccountAndPrivacy, ManageAccount, UpdateProfile, UpdatePassword, NotificationSettings, Privacy, BetaProgram, WifiCoverageMap, WifiMapTab, WifiMapBottomSheet, 
			CleanScheduleTwoWelcome, CleanScheduleTwoCreate, CleanScheduleTwoCleaningPreset, CleanScheduleTwoExistingSchedule, CleanScheduleTwoScheduleLimit, CleanScheduleTwoChangeLayoutPrompt, EvacDockBagMissingHelpContent, EvacDockAboutDock, CleanButtonIntro1, CleanButtonIntro2, 
			PMapsIntro1, PMapsIntro2, PMapsIntro3, PMapsIntro4, PMapsIntro5, PMapsIntroComplete, PMapsTip1, PMapsTip2, PMapsTip3, PMapsTrainingRunPreparation, 
			PMapsNoMap, PMapsList, PMapsMapPreview, PMapsMapReady, PMapsTroubleshootingList, PMapsTroubleshootingUnderstanding, PMapsTroubleshootingIncomplete, PMapsTroubleshootingWrong, PMapsCustomizeIntro, PMapsCustomizeNameMap, 
			PMapsSettingUpInstructions, PMapsCustomizeSetupRooms, PMapsCustomizeLabelRooms, PMapsCustomizeCustomizeComplete, PMapsChooseRooms, OnDemandOtaSetupComplete, OnDemandOtaFailed, OnDemandOtaSuccess, NotificationCenter, NotificationCenterNotificationDetail, 
			BetaProgramIntro
		});
	//  486 1155:bipush          81
	//  487 1157:anewarray       ViewId[]
	//  488 1160:dup             
	//  489 1161:iconst_0        
	//  490 1162:getstatic       #98  <Field ViewId Schedule>
	//  491 1165:aastore         
	//  492 1166:dup             
	//  493 1167:iconst_1        
	//  494 1168:getstatic       #101 <Field ViewId CarpetBoostSetting>
	//  495 1171:aastore         
	//  496 1172:dup             
	//  497 1173:iconst_2        
	//  498 1174:getstatic       #104 <Field ViewId CleaningPassesSetting>
	//  499 1177:aastore         
	//  500 1178:dup             
	//  501 1179:iconst_3        
	//  502 1180:getstatic       #107 <Field ViewId More>
	//  503 1183:aastore         
	//  504 1184:dup             
	//  505 1185:iconst_4        
	//  506 1186:getstatic       #110 <Field ViewId Care>
	//  507 1189:aastore         
	//  508 1190:dup             
	//  509 1191:iconst_5        
	//  510 1192:getstatic       #113 <Field ViewId Help>
	//  511 1195:aastore         
	//  512 1196:dup             
	//  513 1197:bipush          6
	//  514 1199:getstatic       #116 <Field ViewId Settings>
	//  515 1202:aastore         
	//  516 1203:dup             
	//  517 1204:bipush          7
	//  518 1206:getstatic       #119 <Field ViewId MissionHistoryDetailBottomSheet>
	//  519 1209:aastore         
	//  520 1210:dup             
	//  521 1211:bipush          8
	//  522 1213:getstatic       #122 <Field ViewId Welcome>
	//  523 1216:aastore         
	//  524 1217:dup             
	//  525 1218:bipush          9
	//  526 1220:getstatic       #125 <Field ViewId AccountOptions>
	//  527 1223:aastore         
	//  528 1224:dup             
	//  529 1225:bipush          10
	//  530 1227:getstatic       #128 <Field ViewId CountryPicker>
	//  531 1230:aastore         
	//  532 1231:dup             
	//  533 1232:bipush          11
	//  534 1234:getstatic       #131 <Field ViewId Login>
	//  535 1237:aastore         
	//  536 1238:dup             
	//  537 1239:bipush          12
	//  538 1241:getstatic       #134 <Field ViewId CreateAccount>
	//  539 1244:aastore         
	//  540 1245:dup             
	//  541 1246:bipush          13
	//  542 1248:getstatic       #137 <Field ViewId CreateAccountSideMenu>
	//  543 1251:aastore         
	//  544 1252:dup             
	//  545 1253:bipush          14
	//  546 1255:getstatic       #140 <Field ViewId CareBin>
	//  547 1258:aastore         
	//  548 1259:dup             
	//  549 1260:bipush          15
	//  550 1262:getstatic       #143 <Field ViewId CareCoreRobot>
	//  551 1265:aastore         
	//  552 1266:dup             
	//  553 1267:bipush          16
	//  554 1269:getstatic       #146 <Field ViewId DebrisExtractor>
	//  555 1272:aastore         
	//  556 1273:dup             
	//  557 1274:bipush          17
	//  558 1276:getstatic       #149 <Field ViewId AdditionalHelp>
	//  559 1279:aastore         
	//  560 1280:dup             
	//  561 1281:bipush          18
	//  562 1283:getstatic       #152 <Field ViewId AboutThisApp>
	//  563 1286:aastore         
	//  564 1287:dup             
	//  565 1288:bipush          19
	//  566 1290:getstatic       #155 <Field ViewId AboutThisAppEula>
	//  567 1293:aastore         
	//  568 1294:dup             
	//  569 1295:bipush          20
	//  570 1297:getstatic       #158 <Field ViewId CommonQuestions>
	//  571 1300:aastore         
	//  572 1301:dup             
	//  573 1302:bipush          21
	//  574 1304:getstatic       #161 <Field ViewId WifiSettings>
	//  575 1307:aastore         
	//  576 1308:dup             
	//  577 1309:bipush          22
	//  578 1311:getstatic       #164 <Field ViewId ReducedPowerStandby>
	//  579 1314:aastore         
	//  580 1315:dup             
	//  581 1316:bipush          23
	//  582 1318:getstatic       #167 <Field ViewId AboutRobot>
	//  583 1321:aastore         
	//  584 1322:dup             
	//  585 1323:bipush          24
	//  586 1325:getstatic       #170 <Field ViewId RemoveRobot>
	//  587 1328:aastore         
	//  588 1329:dup             
	//  589 1330:bipush          25
	//  590 1332:getstatic       #173 <Field ViewId ResetRobot>
	//  591 1335:aastore         
	//  592 1336:dup             
	//  593 1337:bipush          26
	//  594 1339:getstatic       #176 <Field ViewId ConnectedHome>
	//  595 1342:aastore         
	//  596 1343:dup             
	//  597 1344:bipush          27
	//  598 1346:getstatic       #179 <Field ViewId BraavaSpotClean>
	//  599 1349:aastore         
	//  600 1350:dup             
	//  601 1351:bipush          28
	//  602 1353:getstatic       #182 <Field ViewId BraavaPadOptions>
	//  603 1356:aastore         
	//  604 1357:dup             
	//  605 1358:bipush          29
	//  606 1360:getstatic       #185 <Field ViewId ExpeditedOta>
	//  607 1363:aastore         
	//  608 1364:dup             
	//  609 1365:bipush          30
	//  610 1367:getstatic       #188 <Field ViewId AccountAndPrivacy>
	//  611 1370:aastore         
	//  612 1371:dup             
	//  613 1372:bipush          31
	//  614 1374:getstatic       #191 <Field ViewId ManageAccount>
	//  615 1377:aastore         
	//  616 1378:dup             
	//  617 1379:bipush          32
	//  618 1381:getstatic       #194 <Field ViewId UpdateProfile>
	//  619 1384:aastore         
	//  620 1385:dup             
	//  621 1386:bipush          33
	//  622 1388:getstatic       #197 <Field ViewId UpdatePassword>
	//  623 1391:aastore         
	//  624 1392:dup             
	//  625 1393:bipush          34
	//  626 1395:getstatic       #200 <Field ViewId NotificationSettings>
	//  627 1398:aastore         
	//  628 1399:dup             
	//  629 1400:bipush          35
	//  630 1402:getstatic       #203 <Field ViewId Privacy>
	//  631 1405:aastore         
	//  632 1406:dup             
	//  633 1407:bipush          36
	//  634 1409:getstatic       #206 <Field ViewId BetaProgram>
	//  635 1412:aastore         
	//  636 1413:dup             
	//  637 1414:bipush          37
	//  638 1416:getstatic       #209 <Field ViewId WifiCoverageMap>
	//  639 1419:aastore         
	//  640 1420:dup             
	//  641 1421:bipush          38
	//  642 1423:getstatic       #212 <Field ViewId WifiMapTab>
	//  643 1426:aastore         
	//  644 1427:dup             
	//  645 1428:bipush          39
	//  646 1430:getstatic       #215 <Field ViewId WifiMapBottomSheet>
	//  647 1433:aastore         
	//  648 1434:dup             
	//  649 1435:bipush          40
	//  650 1437:getstatic       #218 <Field ViewId CleanScheduleTwoWelcome>
	//  651 1440:aastore         
	//  652 1441:dup             
	//  653 1442:bipush          41
	//  654 1444:getstatic       #221 <Field ViewId CleanScheduleTwoCreate>
	//  655 1447:aastore         
	//  656 1448:dup             
	//  657 1449:bipush          42
	//  658 1451:getstatic       #224 <Field ViewId CleanScheduleTwoCleaningPreset>
	//  659 1454:aastore         
	//  660 1455:dup             
	//  661 1456:bipush          43
	//  662 1458:getstatic       #227 <Field ViewId CleanScheduleTwoExistingSchedule>
	//  663 1461:aastore         
	//  664 1462:dup             
	//  665 1463:bipush          44
	//  666 1465:getstatic       #230 <Field ViewId CleanScheduleTwoScheduleLimit>
	//  667 1468:aastore         
	//  668 1469:dup             
	//  669 1470:bipush          45
	//  670 1472:getstatic       #233 <Field ViewId CleanScheduleTwoChangeLayoutPrompt>
	//  671 1475:aastore         
	//  672 1476:dup             
	//  673 1477:bipush          46
	//  674 1479:getstatic       #236 <Field ViewId EvacDockBagMissingHelpContent>
	//  675 1482:aastore         
	//  676 1483:dup             
	//  677 1484:bipush          47
	//  678 1486:getstatic       #239 <Field ViewId EvacDockAboutDock>
	//  679 1489:aastore         
	//  680 1490:dup             
	//  681 1491:bipush          48
	//  682 1493:getstatic       #242 <Field ViewId CleanButtonIntro1>
	//  683 1496:aastore         
	//  684 1497:dup             
	//  685 1498:bipush          49
	//  686 1500:getstatic       #245 <Field ViewId CleanButtonIntro2>
	//  687 1503:aastore         
	//  688 1504:dup             
	//  689 1505:bipush          50
	//  690 1507:getstatic       #248 <Field ViewId PMapsIntro1>
	//  691 1510:aastore         
	//  692 1511:dup             
	//  693 1512:bipush          51
	//  694 1514:getstatic       #251 <Field ViewId PMapsIntro2>
	//  695 1517:aastore         
	//  696 1518:dup             
	//  697 1519:bipush          52
	//  698 1521:getstatic       #254 <Field ViewId PMapsIntro3>
	//  699 1524:aastore         
	//  700 1525:dup             
	//  701 1526:bipush          53
	//  702 1528:getstatic       #257 <Field ViewId PMapsIntro4>
	//  703 1531:aastore         
	//  704 1532:dup             
	//  705 1533:bipush          54
	//  706 1535:getstatic       #260 <Field ViewId PMapsIntro5>
	//  707 1538:aastore         
	//  708 1539:dup             
	//  709 1540:bipush          55
	//  710 1542:getstatic       #263 <Field ViewId PMapsIntroComplete>
	//  711 1545:aastore         
	//  712 1546:dup             
	//  713 1547:bipush          56
	//  714 1549:getstatic       #266 <Field ViewId PMapsTip1>
	//  715 1552:aastore         
	//  716 1553:dup             
	//  717 1554:bipush          57
	//  718 1556:getstatic       #269 <Field ViewId PMapsTip2>
	//  719 1559:aastore         
	//  720 1560:dup             
	//  721 1561:bipush          58
	//  722 1563:getstatic       #272 <Field ViewId PMapsTip3>
	//  723 1566:aastore         
	//  724 1567:dup             
	//  725 1568:bipush          59
	//  726 1570:getstatic       #275 <Field ViewId PMapsTrainingRunPreparation>
	//  727 1573:aastore         
	//  728 1574:dup             
	//  729 1575:bipush          60
	//  730 1577:getstatic       #278 <Field ViewId PMapsNoMap>
	//  731 1580:aastore         
	//  732 1581:dup             
	//  733 1582:bipush          61
	//  734 1584:getstatic       #281 <Field ViewId PMapsList>
	//  735 1587:aastore         
	//  736 1588:dup             
	//  737 1589:bipush          62
	//  738 1591:getstatic       #284 <Field ViewId PMapsMapPreview>
	//  739 1594:aastore         
	//  740 1595:dup             
	//  741 1596:bipush          63
	//  742 1598:getstatic       #287 <Field ViewId PMapsMapReady>
	//  743 1601:aastore         
	//  744 1602:dup             
	//  745 1603:bipush          64
	//  746 1605:getstatic       #290 <Field ViewId PMapsTroubleshootingList>
	//  747 1608:aastore         
	//  748 1609:dup             
	//  749 1610:bipush          65
	//  750 1612:getstatic       #293 <Field ViewId PMapsTroubleshootingUnderstanding>
	//  751 1615:aastore         
	//  752 1616:dup             
	//  753 1617:bipush          66
	//  754 1619:getstatic       #296 <Field ViewId PMapsTroubleshootingIncomplete>
	//  755 1622:aastore         
	//  756 1623:dup             
	//  757 1624:bipush          67
	//  758 1626:getstatic       #299 <Field ViewId PMapsTroubleshootingWrong>
	//  759 1629:aastore         
	//  760 1630:dup             
	//  761 1631:bipush          68
	//  762 1633:getstatic       #302 <Field ViewId PMapsCustomizeIntro>
	//  763 1636:aastore         
	//  764 1637:dup             
	//  765 1638:bipush          69
	//  766 1640:getstatic       #305 <Field ViewId PMapsCustomizeNameMap>
	//  767 1643:aastore         
	//  768 1644:dup             
	//  769 1645:bipush          70
	//  770 1647:getstatic       #308 <Field ViewId PMapsSettingUpInstructions>
	//  771 1650:aastore         
	//  772 1651:dup             
	//  773 1652:bipush          71
	//  774 1654:getstatic       #311 <Field ViewId PMapsCustomizeSetupRooms>
	//  775 1657:aastore         
	//  776 1658:dup             
	//  777 1659:bipush          72
	//  778 1661:getstatic       #314 <Field ViewId PMapsCustomizeLabelRooms>
	//  779 1664:aastore         
	//  780 1665:dup             
	//  781 1666:bipush          73
	//  782 1668:getstatic       #317 <Field ViewId PMapsCustomizeCustomizeComplete>
	//  783 1671:aastore         
	//  784 1672:dup             
	//  785 1673:bipush          74
	//  786 1675:getstatic       #320 <Field ViewId PMapsChooseRooms>
	//  787 1678:aastore         
	//  788 1679:dup             
	//  789 1680:bipush          75
	//  790 1682:getstatic       #323 <Field ViewId OnDemandOtaSetupComplete>
	//  791 1685:aastore         
	//  792 1686:dup             
	//  793 1687:bipush          76
	//  794 1689:getstatic       #326 <Field ViewId OnDemandOtaFailed>
	//  795 1692:aastore         
	//  796 1693:dup             
	//  797 1694:bipush          77
	//  798 1696:getstatic       #329 <Field ViewId OnDemandOtaSuccess>
	//  799 1699:aastore         
	//  800 1700:dup             
	//  801 1701:bipush          78
	//  802 1703:getstatic       #332 <Field ViewId NotificationCenter>
	//  803 1706:aastore         
	//  804 1707:dup             
	//  805 1708:bipush          79
	//  806 1710:getstatic       #335 <Field ViewId NotificationCenterNotificationDetail>
	//  807 1713:aastore         
	//  808 1714:dup             
	//  809 1715:bipush          80
	//  810 1717:getstatic       #338 <Field ViewId BetaProgramIntro>
	//  811 1720:aastore         
	//  812 1721:putstatic       #340 <Field ViewId[] $VALUES>
	//* 813 1724:return          
	}
}
