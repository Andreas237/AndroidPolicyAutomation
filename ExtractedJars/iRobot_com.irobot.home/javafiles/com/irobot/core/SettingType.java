// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class SettingType extends Enum
{

	private SettingType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #186 <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static SettingType valueOf(String s)
	{
		return (SettingType)Enum.valueOf(com/irobot/core/SettingType, s);
	//    0    0:ldc1            #2   <Class SettingType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #192 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class SettingType>
	//    4    9:areturn         
	}

	public static SettingType[] values()
	{
		return (SettingType[])((SettingType []) ($VALUES)).clone();
	//    0    0:getstatic       #184 <Field SettingType[] $VALUES>
	//    1    3:invokevirtual   #199 <Method Object _5B_Lcom.irobot.core.SettingType_3B_.clone()>
	//    2    6:checkcast       #195 <Class SettingType[]>
	//    3    9:areturn         
	}

	private static final SettingType $VALUES[];
	public static final SettingType AlexaAuthToken;
	public static final SettingType AreaCleaned;
	public static final SettingType CarpetBoost;
	public static final SettingType CarpetBoostModesAvailable;
	public static final SettingType CleaningPreferenceAvailable;
	public static final SettingType CleaningPresets;
	public static final SettingType CloudHost;
	public static final SettingType CombinedHelpVideo;
	public static final SettingType ContinuousLearningAndKOZ;
	public static final SettingType DockCommunication;
	public static final SettingType EdgeClean;
	public static final SettingType LogUpload;
	public static final SettingType MapUploadAllowed;
	public static final SettingType Maps;
	public static final SettingType MapsWithFwUpdate;
	public static final SettingType MultiLanguageOta;
	public static final SettingType MultiPass;
	public static final SettingType MultiPassModesAvailable;
	public static final SettingType Name;
	public static final SettingType PMapLearningAllowed;
	public static final SettingType PauseOnBinFull;
	public static final SettingType PersistentMaps;
	public static final SettingType PushRegistrationToken;
	public static final SettingType Registered;
	public static final SettingType RegistrationDate;
	public static final SettingType RemoteRemove;
	public static final SettingType RemoteReset;
	public static final SettingType RobotLanguage;
	public static final SettingType RobotLanguagesAvailable;
	public static final SettingType RobotPadWetness;
	public static final SettingType RobotRankOverlap;
	public static final SettingType RoomConfinement;
	public static final SettingType Schedule;
	public static final SettingType ScheduleSettingsSupported;
	public static final SettingType SerialNumber;
	public static final SettingType SingleLanguageOta;
	public static final SettingType StaticMaps;
	public static final SettingType Timezone;
	public static final SettingType VeryLowPowerMode;
	public static final SettingType Volume;
	public static final SettingType WetnessLevel;
	public static final SettingType WifiMaps;

	static 
	{
		AlexaAuthToken = new SettingType("AlexaAuthToken", 0);
	//    0    0:new             #2   <Class SettingType>
	//    1    3:dup             
	//    2    4:ldc1            #53  <String "AlexaAuthToken">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #57  <Method void SettingType(String, int)>
	//    5   10:putstatic       #59  <Field SettingType AlexaAuthToken>
		Name = new SettingType("Name", 1);
	//    6   13:new             #2   <Class SettingType>
	//    7   16:dup             
	//    8   17:ldc1            #60  <String "Name">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #57  <Method void SettingType(String, int)>
	//   11   23:putstatic       #62  <Field SettingType Name>
		WetnessLevel = new SettingType("WetnessLevel", 2);
	//   12   26:new             #2   <Class SettingType>
	//   13   29:dup             
	//   14   30:ldc1            #63  <String "WetnessLevel">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #57  <Method void SettingType(String, int)>
	//   17   36:putstatic       #65  <Field SettingType WetnessLevel>
		RoomConfinement = new SettingType("RoomConfinement", 3);
	//   18   39:new             #2   <Class SettingType>
	//   19   42:dup             
	//   20   43:ldc1            #66  <String "RoomConfinement">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #57  <Method void SettingType(String, int)>
	//   23   49:putstatic       #68  <Field SettingType RoomConfinement>
		Volume = new SettingType("Volume", 4);
	//   24   52:new             #2   <Class SettingType>
	//   25   55:dup             
	//   26   56:ldc1            #69  <String "Volume">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #57  <Method void SettingType(String, int)>
	//   29   62:putstatic       #71  <Field SettingType Volume>
		AreaCleaned = new SettingType("AreaCleaned", 5);
	//   30   65:new             #2   <Class SettingType>
	//   31   68:dup             
	//   32   69:ldc1            #72  <String "AreaCleaned">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #57  <Method void SettingType(String, int)>
	//   35   75:putstatic       #74  <Field SettingType AreaCleaned>
		CarpetBoost = new SettingType("CarpetBoost", 6);
	//   36   78:new             #2   <Class SettingType>
	//   37   81:dup             
	//   38   82:ldc1            #75  <String "CarpetBoost">
	//   39   84:bipush          6
	//   40   86:invokespecial   #57  <Method void SettingType(String, int)>
	//   41   89:putstatic       #77  <Field SettingType CarpetBoost>
		CarpetBoostModesAvailable = new SettingType("CarpetBoostModesAvailable", 7);
	//   42   92:new             #2   <Class SettingType>
	//   43   95:dup             
	//   44   96:ldc1            #78  <String "CarpetBoostModesAvailable">
	//   45   98:bipush          7
	//   46  100:invokespecial   #57  <Method void SettingType(String, int)>
	//   47  103:putstatic       #80  <Field SettingType CarpetBoostModesAvailable>
		CleaningPreferenceAvailable = new SettingType("CleaningPreferenceAvailable", 8);
	//   48  106:new             #2   <Class SettingType>
	//   49  109:dup             
	//   50  110:ldc1            #81  <String "CleaningPreferenceAvailable">
	//   51  112:bipush          8
	//   52  114:invokespecial   #57  <Method void SettingType(String, int)>
	//   53  117:putstatic       #83  <Field SettingType CleaningPreferenceAvailable>
		MultiPass = new SettingType("MultiPass", 9);
	//   54  120:new             #2   <Class SettingType>
	//   55  123:dup             
	//   56  124:ldc1            #84  <String "MultiPass">
	//   57  126:bipush          9
	//   58  128:invokespecial   #57  <Method void SettingType(String, int)>
	//   59  131:putstatic       #86  <Field SettingType MultiPass>
		MultiPassModesAvailable = new SettingType("MultiPassModesAvailable", 10);
	//   60  134:new             #2   <Class SettingType>
	//   61  137:dup             
	//   62  138:ldc1            #87  <String "MultiPassModesAvailable">
	//   63  140:bipush          10
	//   64  142:invokespecial   #57  <Method void SettingType(String, int)>
	//   65  145:putstatic       #89  <Field SettingType MultiPassModesAvailable>
		PauseOnBinFull = new SettingType("PauseOnBinFull", 11);
	//   66  148:new             #2   <Class SettingType>
	//   67  151:dup             
	//   68  152:ldc1            #90  <String "PauseOnBinFull">
	//   69  154:bipush          11
	//   70  156:invokespecial   #57  <Method void SettingType(String, int)>
	//   71  159:putstatic       #92  <Field SettingType PauseOnBinFull>
		CloudHost = new SettingType("CloudHost", 12);
	//   72  162:new             #2   <Class SettingType>
	//   73  165:dup             
	//   74  166:ldc1            #93  <String "CloudHost">
	//   75  168:bipush          12
	//   76  170:invokespecial   #57  <Method void SettingType(String, int)>
	//   77  173:putstatic       #95  <Field SettingType CloudHost>
		Timezone = new SettingType("Timezone", 13);
	//   78  176:new             #2   <Class SettingType>
	//   79  179:dup             
	//   80  180:ldc1            #96  <String "Timezone">
	//   81  182:bipush          13
	//   82  184:invokespecial   #57  <Method void SettingType(String, int)>
	//   83  187:putstatic       #98  <Field SettingType Timezone>
		Registered = new SettingType("Registered", 14);
	//   84  190:new             #2   <Class SettingType>
	//   85  193:dup             
	//   86  194:ldc1            #99  <String "Registered">
	//   87  196:bipush          14
	//   88  198:invokespecial   #57  <Method void SettingType(String, int)>
	//   89  201:putstatic       #101 <Field SettingType Registered>
		RobotLanguagesAvailable = new SettingType("RobotLanguagesAvailable", 15);
	//   90  204:new             #2   <Class SettingType>
	//   91  207:dup             
	//   92  208:ldc1            #102 <String "RobotLanguagesAvailable">
	//   93  210:bipush          15
	//   94  212:invokespecial   #57  <Method void SettingType(String, int)>
	//   95  215:putstatic       #104 <Field SettingType RobotLanguagesAvailable>
		RobotLanguage = new SettingType("RobotLanguage", 16);
	//   96  218:new             #2   <Class SettingType>
	//   97  221:dup             
	//   98  222:ldc1            #105 <String "RobotLanguage">
	//   99  224:bipush          16
	//  100  226:invokespecial   #57  <Method void SettingType(String, int)>
	//  101  229:putstatic       #107 <Field SettingType RobotLanguage>
		RegistrationDate = new SettingType("RegistrationDate", 17);
	//  102  232:new             #2   <Class SettingType>
	//  103  235:dup             
	//  104  236:ldc1            #108 <String "RegistrationDate">
	//  105  238:bipush          17
	//  106  240:invokespecial   #57  <Method void SettingType(String, int)>
	//  107  243:putstatic       #110 <Field SettingType RegistrationDate>
		PushRegistrationToken = new SettingType("PushRegistrationToken", 18);
	//  108  246:new             #2   <Class SettingType>
	//  109  249:dup             
	//  110  250:ldc1            #111 <String "PushRegistrationToken">
	//  111  252:bipush          18
	//  112  254:invokespecial   #57  <Method void SettingType(String, int)>
	//  113  257:putstatic       #113 <Field SettingType PushRegistrationToken>
		EdgeClean = new SettingType("EdgeClean", 19);
	//  114  260:new             #2   <Class SettingType>
	//  115  263:dup             
	//  116  264:ldc1            #114 <String "EdgeClean">
	//  117  266:bipush          19
	//  118  268:invokespecial   #57  <Method void SettingType(String, int)>
	//  119  271:putstatic       #116 <Field SettingType EdgeClean>
		MapUploadAllowed = new SettingType("MapUploadAllowed", 20);
	//  120  274:new             #2   <Class SettingType>
	//  121  277:dup             
	//  122  278:ldc1            #117 <String "MapUploadAllowed">
	//  123  280:bipush          20
	//  124  282:invokespecial   #57  <Method void SettingType(String, int)>
	//  125  285:putstatic       #119 <Field SettingType MapUploadAllowed>
		Maps = new SettingType("Maps", 21);
	//  126  288:new             #2   <Class SettingType>
	//  127  291:dup             
	//  128  292:ldc1            #120 <String "Maps">
	//  129  294:bipush          21
	//  130  296:invokespecial   #57  <Method void SettingType(String, int)>
	//  131  299:putstatic       #122 <Field SettingType Maps>
		StaticMaps = new SettingType("StaticMaps", 22);
	//  132  302:new             #2   <Class SettingType>
	//  133  305:dup             
	//  134  306:ldc1            #123 <String "StaticMaps">
	//  135  308:bipush          22
	//  136  310:invokespecial   #57  <Method void SettingType(String, int)>
	//  137  313:putstatic       #125 <Field SettingType StaticMaps>
		PersistentMaps = new SettingType("PersistentMaps", 23);
	//  138  316:new             #2   <Class SettingType>
	//  139  319:dup             
	//  140  320:ldc1            #126 <String "PersistentMaps">
	//  141  322:bipush          23
	//  142  324:invokespecial   #57  <Method void SettingType(String, int)>
	//  143  327:putstatic       #128 <Field SettingType PersistentMaps>
		WifiMaps = new SettingType("WifiMaps", 24);
	//  144  330:new             #2   <Class SettingType>
	//  145  333:dup             
	//  146  334:ldc1            #129 <String "WifiMaps">
	//  147  336:bipush          24
	//  148  338:invokespecial   #57  <Method void SettingType(String, int)>
	//  149  341:putstatic       #131 <Field SettingType WifiMaps>
		SingleLanguageOta = new SettingType("SingleLanguageOta", 25);
	//  150  344:new             #2   <Class SettingType>
	//  151  347:dup             
	//  152  348:ldc1            #132 <String "SingleLanguageOta">
	//  153  350:bipush          25
	//  154  352:invokespecial   #57  <Method void SettingType(String, int)>
	//  155  355:putstatic       #134 <Field SettingType SingleLanguageOta>
		MultiLanguageOta = new SettingType("MultiLanguageOta", 26);
	//  156  358:new             #2   <Class SettingType>
	//  157  361:dup             
	//  158  362:ldc1            #135 <String "MultiLanguageOta">
	//  159  364:bipush          26
	//  160  366:invokespecial   #57  <Method void SettingType(String, int)>
	//  161  369:putstatic       #137 <Field SettingType MultiLanguageOta>
		RemoteRemove = new SettingType("RemoteRemove", 27);
	//  162  372:new             #2   <Class SettingType>
	//  163  375:dup             
	//  164  376:ldc1            #138 <String "RemoteRemove">
	//  165  378:bipush          27
	//  166  380:invokespecial   #57  <Method void SettingType(String, int)>
	//  167  383:putstatic       #140 <Field SettingType RemoteRemove>
		RemoteReset = new SettingType("RemoteReset", 28);
	//  168  386:new             #2   <Class SettingType>
	//  169  389:dup             
	//  170  390:ldc1            #141 <String "RemoteReset">
	//  171  392:bipush          28
	//  172  394:invokespecial   #57  <Method void SettingType(String, int)>
	//  173  397:putstatic       #143 <Field SettingType RemoteReset>
		VeryLowPowerMode = new SettingType("VeryLowPowerMode", 29);
	//  174  400:new             #2   <Class SettingType>
	//  175  403:dup             
	//  176  404:ldc1            #144 <String "VeryLowPowerMode">
	//  177  406:bipush          29
	//  178  408:invokespecial   #57  <Method void SettingType(String, int)>
	//  179  411:putstatic       #146 <Field SettingType VeryLowPowerMode>
		CombinedHelpVideo = new SettingType("CombinedHelpVideo", 30);
	//  180  414:new             #2   <Class SettingType>
	//  181  417:dup             
	//  182  418:ldc1            #147 <String "CombinedHelpVideo">
	//  183  420:bipush          30
	//  184  422:invokespecial   #57  <Method void SettingType(String, int)>
	//  185  425:putstatic       #149 <Field SettingType CombinedHelpVideo>
		CleaningPresets = new SettingType("CleaningPresets", 31);
	//  186  428:new             #2   <Class SettingType>
	//  187  431:dup             
	//  188  432:ldc1            #150 <String "CleaningPresets">
	//  189  434:bipush          31
	//  190  436:invokespecial   #57  <Method void SettingType(String, int)>
	//  191  439:putstatic       #152 <Field SettingType CleaningPresets>
		MapsWithFwUpdate = new SettingType("MapsWithFwUpdate", 32);
	//  192  442:new             #2   <Class SettingType>
	//  193  445:dup             
	//  194  446:ldc1            #153 <String "MapsWithFwUpdate">
	//  195  448:bipush          32
	//  196  450:invokespecial   #57  <Method void SettingType(String, int)>
	//  197  453:putstatic       #155 <Field SettingType MapsWithFwUpdate>
		RobotPadWetness = new SettingType("RobotPadWetness", 33);
	//  198  456:new             #2   <Class SettingType>
	//  199  459:dup             
	//  200  460:ldc1            #156 <String "RobotPadWetness">
	//  201  462:bipush          33
	//  202  464:invokespecial   #57  <Method void SettingType(String, int)>
	//  203  467:putstatic       #158 <Field SettingType RobotPadWetness>
		RobotRankOverlap = new SettingType("RobotRankOverlap", 34);
	//  204  470:new             #2   <Class SettingType>
	//  205  473:dup             
	//  206  474:ldc1            #159 <String "RobotRankOverlap">
	//  207  476:bipush          34
	//  208  478:invokespecial   #57  <Method void SettingType(String, int)>
	//  209  481:putstatic       #161 <Field SettingType RobotRankOverlap>
		LogUpload = new SettingType("LogUpload", 35);
	//  210  484:new             #2   <Class SettingType>
	//  211  487:dup             
	//  212  488:ldc1            #162 <String "LogUpload">
	//  213  490:bipush          35
	//  214  492:invokespecial   #57  <Method void SettingType(String, int)>
	//  215  495:putstatic       #164 <Field SettingType LogUpload>
		Schedule = new SettingType("Schedule", 36);
	//  216  498:new             #2   <Class SettingType>
	//  217  501:dup             
	//  218  502:ldc1            #165 <String "Schedule">
	//  219  504:bipush          36
	//  220  506:invokespecial   #57  <Method void SettingType(String, int)>
	//  221  509:putstatic       #167 <Field SettingType Schedule>
		ScheduleSettingsSupported = new SettingType("ScheduleSettingsSupported", 37);
	//  222  512:new             #2   <Class SettingType>
	//  223  515:dup             
	//  224  516:ldc1            #168 <String "ScheduleSettingsSupported">
	//  225  518:bipush          37
	//  226  520:invokespecial   #57  <Method void SettingType(String, int)>
	//  227  523:putstatic       #170 <Field SettingType ScheduleSettingsSupported>
		PMapLearningAllowed = new SettingType("PMapLearningAllowed", 38);
	//  228  526:new             #2   <Class SettingType>
	//  229  529:dup             
	//  230  530:ldc1            #171 <String "PMapLearningAllowed">
	//  231  532:bipush          38
	//  232  534:invokespecial   #57  <Method void SettingType(String, int)>
	//  233  537:putstatic       #173 <Field SettingType PMapLearningAllowed>
		DockCommunication = new SettingType("DockCommunication", 39);
	//  234  540:new             #2   <Class SettingType>
	//  235  543:dup             
	//  236  544:ldc1            #174 <String "DockCommunication">
	//  237  546:bipush          39
	//  238  548:invokespecial   #57  <Method void SettingType(String, int)>
	//  239  551:putstatic       #176 <Field SettingType DockCommunication>
		ContinuousLearningAndKOZ = new SettingType("ContinuousLearningAndKOZ", 40);
	//  240  554:new             #2   <Class SettingType>
	//  241  557:dup             
	//  242  558:ldc1            #177 <String "ContinuousLearningAndKOZ">
	//  243  560:bipush          40
	//  244  562:invokespecial   #57  <Method void SettingType(String, int)>
	//  245  565:putstatic       #179 <Field SettingType ContinuousLearningAndKOZ>
		SerialNumber = new SettingType("SerialNumber", 41);
	//  246  568:new             #2   <Class SettingType>
	//  247  571:dup             
	//  248  572:ldc1            #180 <String "SerialNumber">
	//  249  574:bipush          41
	//  250  576:invokespecial   #57  <Method void SettingType(String, int)>
	//  251  579:putstatic       #182 <Field SettingType SerialNumber>
		$VALUES = (new SettingType[] {
			AlexaAuthToken, Name, WetnessLevel, RoomConfinement, Volume, AreaCleaned, CarpetBoost, CarpetBoostModesAvailable, CleaningPreferenceAvailable, MultiPass, 
			MultiPassModesAvailable, PauseOnBinFull, CloudHost, Timezone, Registered, RobotLanguagesAvailable, RobotLanguage, RegistrationDate, PushRegistrationToken, EdgeClean, 
			MapUploadAllowed, Maps, StaticMaps, PersistentMaps, WifiMaps, SingleLanguageOta, MultiLanguageOta, RemoteRemove, RemoteReset, VeryLowPowerMode, 
			CombinedHelpVideo, CleaningPresets, MapsWithFwUpdate, RobotPadWetness, RobotRankOverlap, LogUpload, Schedule, ScheduleSettingsSupported, PMapLearningAllowed, DockCommunication, 
			ContinuousLearningAndKOZ, SerialNumber
		});
	//  252  582:bipush          42
	//  253  584:anewarray       SettingType[]
	//  254  587:dup             
	//  255  588:iconst_0        
	//  256  589:getstatic       #59  <Field SettingType AlexaAuthToken>
	//  257  592:aastore         
	//  258  593:dup             
	//  259  594:iconst_1        
	//  260  595:getstatic       #62  <Field SettingType Name>
	//  261  598:aastore         
	//  262  599:dup             
	//  263  600:iconst_2        
	//  264  601:getstatic       #65  <Field SettingType WetnessLevel>
	//  265  604:aastore         
	//  266  605:dup             
	//  267  606:iconst_3        
	//  268  607:getstatic       #68  <Field SettingType RoomConfinement>
	//  269  610:aastore         
	//  270  611:dup             
	//  271  612:iconst_4        
	//  272  613:getstatic       #71  <Field SettingType Volume>
	//  273  616:aastore         
	//  274  617:dup             
	//  275  618:iconst_5        
	//  276  619:getstatic       #74  <Field SettingType AreaCleaned>
	//  277  622:aastore         
	//  278  623:dup             
	//  279  624:bipush          6
	//  280  626:getstatic       #77  <Field SettingType CarpetBoost>
	//  281  629:aastore         
	//  282  630:dup             
	//  283  631:bipush          7
	//  284  633:getstatic       #80  <Field SettingType CarpetBoostModesAvailable>
	//  285  636:aastore         
	//  286  637:dup             
	//  287  638:bipush          8
	//  288  640:getstatic       #83  <Field SettingType CleaningPreferenceAvailable>
	//  289  643:aastore         
	//  290  644:dup             
	//  291  645:bipush          9
	//  292  647:getstatic       #86  <Field SettingType MultiPass>
	//  293  650:aastore         
	//  294  651:dup             
	//  295  652:bipush          10
	//  296  654:getstatic       #89  <Field SettingType MultiPassModesAvailable>
	//  297  657:aastore         
	//  298  658:dup             
	//  299  659:bipush          11
	//  300  661:getstatic       #92  <Field SettingType PauseOnBinFull>
	//  301  664:aastore         
	//  302  665:dup             
	//  303  666:bipush          12
	//  304  668:getstatic       #95  <Field SettingType CloudHost>
	//  305  671:aastore         
	//  306  672:dup             
	//  307  673:bipush          13
	//  308  675:getstatic       #98  <Field SettingType Timezone>
	//  309  678:aastore         
	//  310  679:dup             
	//  311  680:bipush          14
	//  312  682:getstatic       #101 <Field SettingType Registered>
	//  313  685:aastore         
	//  314  686:dup             
	//  315  687:bipush          15
	//  316  689:getstatic       #104 <Field SettingType RobotLanguagesAvailable>
	//  317  692:aastore         
	//  318  693:dup             
	//  319  694:bipush          16
	//  320  696:getstatic       #107 <Field SettingType RobotLanguage>
	//  321  699:aastore         
	//  322  700:dup             
	//  323  701:bipush          17
	//  324  703:getstatic       #110 <Field SettingType RegistrationDate>
	//  325  706:aastore         
	//  326  707:dup             
	//  327  708:bipush          18
	//  328  710:getstatic       #113 <Field SettingType PushRegistrationToken>
	//  329  713:aastore         
	//  330  714:dup             
	//  331  715:bipush          19
	//  332  717:getstatic       #116 <Field SettingType EdgeClean>
	//  333  720:aastore         
	//  334  721:dup             
	//  335  722:bipush          20
	//  336  724:getstatic       #119 <Field SettingType MapUploadAllowed>
	//  337  727:aastore         
	//  338  728:dup             
	//  339  729:bipush          21
	//  340  731:getstatic       #122 <Field SettingType Maps>
	//  341  734:aastore         
	//  342  735:dup             
	//  343  736:bipush          22
	//  344  738:getstatic       #125 <Field SettingType StaticMaps>
	//  345  741:aastore         
	//  346  742:dup             
	//  347  743:bipush          23
	//  348  745:getstatic       #128 <Field SettingType PersistentMaps>
	//  349  748:aastore         
	//  350  749:dup             
	//  351  750:bipush          24
	//  352  752:getstatic       #131 <Field SettingType WifiMaps>
	//  353  755:aastore         
	//  354  756:dup             
	//  355  757:bipush          25
	//  356  759:getstatic       #134 <Field SettingType SingleLanguageOta>
	//  357  762:aastore         
	//  358  763:dup             
	//  359  764:bipush          26
	//  360  766:getstatic       #137 <Field SettingType MultiLanguageOta>
	//  361  769:aastore         
	//  362  770:dup             
	//  363  771:bipush          27
	//  364  773:getstatic       #140 <Field SettingType RemoteRemove>
	//  365  776:aastore         
	//  366  777:dup             
	//  367  778:bipush          28
	//  368  780:getstatic       #143 <Field SettingType RemoteReset>
	//  369  783:aastore         
	//  370  784:dup             
	//  371  785:bipush          29
	//  372  787:getstatic       #146 <Field SettingType VeryLowPowerMode>
	//  373  790:aastore         
	//  374  791:dup             
	//  375  792:bipush          30
	//  376  794:getstatic       #149 <Field SettingType CombinedHelpVideo>
	//  377  797:aastore         
	//  378  798:dup             
	//  379  799:bipush          31
	//  380  801:getstatic       #152 <Field SettingType CleaningPresets>
	//  381  804:aastore         
	//  382  805:dup             
	//  383  806:bipush          32
	//  384  808:getstatic       #155 <Field SettingType MapsWithFwUpdate>
	//  385  811:aastore         
	//  386  812:dup             
	//  387  813:bipush          33
	//  388  815:getstatic       #158 <Field SettingType RobotPadWetness>
	//  389  818:aastore         
	//  390  819:dup             
	//  391  820:bipush          34
	//  392  822:getstatic       #161 <Field SettingType RobotRankOverlap>
	//  393  825:aastore         
	//  394  826:dup             
	//  395  827:bipush          35
	//  396  829:getstatic       #164 <Field SettingType LogUpload>
	//  397  832:aastore         
	//  398  833:dup             
	//  399  834:bipush          36
	//  400  836:getstatic       #167 <Field SettingType Schedule>
	//  401  839:aastore         
	//  402  840:dup             
	//  403  841:bipush          37
	//  404  843:getstatic       #170 <Field SettingType ScheduleSettingsSupported>
	//  405  846:aastore         
	//  406  847:dup             
	//  407  848:bipush          38
	//  408  850:getstatic       #173 <Field SettingType PMapLearningAllowed>
	//  409  853:aastore         
	//  410  854:dup             
	//  411  855:bipush          39
	//  412  857:getstatic       #176 <Field SettingType DockCommunication>
	//  413  860:aastore         
	//  414  861:dup             
	//  415  862:bipush          40
	//  416  864:getstatic       #179 <Field SettingType ContinuousLearningAndKOZ>
	//  417  867:aastore         
	//  418  868:dup             
	//  419  869:bipush          41
	//  420  871:getstatic       #182 <Field SettingType SerialNumber>
	//  421  874:aastore         
	//  422  875:putstatic       #184 <Field SettingType[] $VALUES>
	//* 423  878:return          
	}
}
