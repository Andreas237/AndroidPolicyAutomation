// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class AccountViewState extends Enum
{

	private AccountViewState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #146 <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static AccountViewState valueOf(String s)
	{
		return (AccountViewState)Enum.valueOf(com/irobot/core/AccountViewState, s);
	//    0    0:ldc1            #2   <Class AccountViewState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #152 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AccountViewState>
	//    4    9:areturn         
	}

	public static AccountViewState[] values()
	{
		return (AccountViewState[])((AccountViewState []) ($VALUES)).clone();
	//    0    0:getstatic       #144 <Field AccountViewState[] $VALUES>
	//    1    3:invokevirtual   #159 <Method Object _5B_Lcom.irobot.core.AccountViewState_3B_.clone()>
	//    2    6:checkcast       #155 <Class AccountViewState[]>
	//    3    9:areturn         
	}

	private static final AccountViewState $VALUES[];
	public static final AccountViewState HideBetaProgramTip;
	public static final AccountViewState HideCleanMapReports;
	public static final AccountViewState HideLoadingIndicator;
	public static final AccountViewState HidePrivacySettingsLoadingIndicator;
	public static final AccountViewState HideRobotMapsInfo;
	public static final AccountViewState HideSmartMapReports;
	public static final AccountViewState NavigateToBetaProgramMainPage;
	public static final AccountViewState NavigateToCleanScreen;
	public static final AccountViewState ShowBetaProgramTip;
	public static final AccountViewState ShowCleanMapReports;
	public static final AccountViewState ShowCleanMapReportsSettingUnavailableError;
	public static final AccountViewState ShowDataSecurityUrl;
	public static final AccountViewState ShowEULAConsentDate;
	public static final AccountViewState ShowEULAUrl;
	public static final AccountViewState ShowLoadingIndicator;
	public static final AccountViewState ShowLoadingSpinner;
	public static final AccountViewState ShowMappingRobotsUrl;
	public static final AccountViewState ShowNotificationEmailSetting;
	public static final AccountViewState ShowNotificationSettingsErrorDialog;
	public static final AccountViewState ShowNotificationSettingsFailure;
	public static final AccountViewState ShowNotificationSettingsUpdate;
	public static final AccountViewState ShowOutputConfirmation;
	public static final AccountViewState ShowPrivacyConsentDate;
	public static final AccountViewState ShowPrivacyPolicyUrl;
	public static final AccountViewState ShowPrivacySettingsLoadingIndicator;
	public static final AccountViewState ShowRequestErrorMessage;
	public static final AccountViewState ShowRobotMapsInfo;
	public static final AccountViewState ShowSmartMapReports;
	public static final AccountViewState ShowTermsAndConditionsUrl;
	public static final AccountViewState ShowTermsConsentDate;
	public static final AccountViewState ShowUpdatedBetaProgramFeatures;
	public static final AccountViewState ShowWebcontentUnavailableError;

	static 
	{
		ShowLoadingSpinner = new AccountViewState("ShowLoadingSpinner", 0);
	//    0    0:new             #2   <Class AccountViewState>
	//    1    3:dup             
	//    2    4:ldc1            #43  <String "ShowLoadingSpinner">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #47  <Method void AccountViewState(String, int)>
	//    5   10:putstatic       #49  <Field AccountViewState ShowLoadingSpinner>
		ShowNotificationSettingsErrorDialog = new AccountViewState("ShowNotificationSettingsErrorDialog", 1);
	//    6   13:new             #2   <Class AccountViewState>
	//    7   16:dup             
	//    8   17:ldc1            #50  <String "ShowNotificationSettingsErrorDialog">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #47  <Method void AccountViewState(String, int)>
	//   11   23:putstatic       #52  <Field AccountViewState ShowNotificationSettingsErrorDialog>
		ShowNotificationEmailSetting = new AccountViewState("ShowNotificationEmailSetting", 2);
	//   12   26:new             #2   <Class AccountViewState>
	//   13   29:dup             
	//   14   30:ldc1            #53  <String "ShowNotificationEmailSetting">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #47  <Method void AccountViewState(String, int)>
	//   17   36:putstatic       #55  <Field AccountViewState ShowNotificationEmailSetting>
		ShowNotificationSettingsFailure = new AccountViewState("ShowNotificationSettingsFailure", 3);
	//   18   39:new             #2   <Class AccountViewState>
	//   19   42:dup             
	//   20   43:ldc1            #56  <String "ShowNotificationSettingsFailure">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #47  <Method void AccountViewState(String, int)>
	//   23   49:putstatic       #58  <Field AccountViewState ShowNotificationSettingsFailure>
		ShowNotificationSettingsUpdate = new AccountViewState("ShowNotificationSettingsUpdate", 4);
	//   24   52:new             #2   <Class AccountViewState>
	//   25   55:dup             
	//   26   56:ldc1            #59  <String "ShowNotificationSettingsUpdate">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #47  <Method void AccountViewState(String, int)>
	//   29   62:putstatic       #61  <Field AccountViewState ShowNotificationSettingsUpdate>
		NavigateToBetaProgramMainPage = new AccountViewState("NavigateToBetaProgramMainPage", 5);
	//   30   65:new             #2   <Class AccountViewState>
	//   31   68:dup             
	//   32   69:ldc1            #62  <String "NavigateToBetaProgramMainPage">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #47  <Method void AccountViewState(String, int)>
	//   35   75:putstatic       #64  <Field AccountViewState NavigateToBetaProgramMainPage>
		NavigateToCleanScreen = new AccountViewState("NavigateToCleanScreen", 6);
	//   36   78:new             #2   <Class AccountViewState>
	//   37   81:dup             
	//   38   82:ldc1            #65  <String "NavigateToCleanScreen">
	//   39   84:bipush          6
	//   40   86:invokespecial   #47  <Method void AccountViewState(String, int)>
	//   41   89:putstatic       #67  <Field AccountViewState NavigateToCleanScreen>
		ShowLoadingIndicator = new AccountViewState("ShowLoadingIndicator", 7);
	//   42   92:new             #2   <Class AccountViewState>
	//   43   95:dup             
	//   44   96:ldc1            #68  <String "ShowLoadingIndicator">
	//   45   98:bipush          7
	//   46  100:invokespecial   #47  <Method void AccountViewState(String, int)>
	//   47  103:putstatic       #70  <Field AccountViewState ShowLoadingIndicator>
		HideLoadingIndicator = new AccountViewState("HideLoadingIndicator", 8);
	//   48  106:new             #2   <Class AccountViewState>
	//   49  109:dup             
	//   50  110:ldc1            #71  <String "HideLoadingIndicator">
	//   51  112:bipush          8
	//   52  114:invokespecial   #47  <Method void AccountViewState(String, int)>
	//   53  117:putstatic       #73  <Field AccountViewState HideLoadingIndicator>
		ShowBetaProgramTip = new AccountViewState("ShowBetaProgramTip", 9);
	//   54  120:new             #2   <Class AccountViewState>
	//   55  123:dup             
	//   56  124:ldc1            #74  <String "ShowBetaProgramTip">
	//   57  126:bipush          9
	//   58  128:invokespecial   #47  <Method void AccountViewState(String, int)>
	//   59  131:putstatic       #76  <Field AccountViewState ShowBetaProgramTip>
		HideBetaProgramTip = new AccountViewState("HideBetaProgramTip", 10);
	//   60  134:new             #2   <Class AccountViewState>
	//   61  137:dup             
	//   62  138:ldc1            #77  <String "HideBetaProgramTip">
	//   63  140:bipush          10
	//   64  142:invokespecial   #47  <Method void AccountViewState(String, int)>
	//   65  145:putstatic       #79  <Field AccountViewState HideBetaProgramTip>
		ShowOutputConfirmation = new AccountViewState("ShowOutputConfirmation", 11);
	//   66  148:new             #2   <Class AccountViewState>
	//   67  151:dup             
	//   68  152:ldc1            #80  <String "ShowOutputConfirmation">
	//   69  154:bipush          11
	//   70  156:invokespecial   #47  <Method void AccountViewState(String, int)>
	//   71  159:putstatic       #82  <Field AccountViewState ShowOutputConfirmation>
		ShowRequestErrorMessage = new AccountViewState("ShowRequestErrorMessage", 12);
	//   72  162:new             #2   <Class AccountViewState>
	//   73  165:dup             
	//   74  166:ldc1            #83  <String "ShowRequestErrorMessage">
	//   75  168:bipush          12
	//   76  170:invokespecial   #47  <Method void AccountViewState(String, int)>
	//   77  173:putstatic       #85  <Field AccountViewState ShowRequestErrorMessage>
		ShowUpdatedBetaProgramFeatures = new AccountViewState("ShowUpdatedBetaProgramFeatures", 13);
	//   78  176:new             #2   <Class AccountViewState>
	//   79  179:dup             
	//   80  180:ldc1            #86  <String "ShowUpdatedBetaProgramFeatures">
	//   81  182:bipush          13
	//   82  184:invokespecial   #47  <Method void AccountViewState(String, int)>
	//   83  187:putstatic       #88  <Field AccountViewState ShowUpdatedBetaProgramFeatures>
		ShowPrivacySettingsLoadingIndicator = new AccountViewState("ShowPrivacySettingsLoadingIndicator", 14);
	//   84  190:new             #2   <Class AccountViewState>
	//   85  193:dup             
	//   86  194:ldc1            #89  <String "ShowPrivacySettingsLoadingIndicator">
	//   87  196:bipush          14
	//   88  198:invokespecial   #47  <Method void AccountViewState(String, int)>
	//   89  201:putstatic       #91  <Field AccountViewState ShowPrivacySettingsLoadingIndicator>
		HidePrivacySettingsLoadingIndicator = new AccountViewState("HidePrivacySettingsLoadingIndicator", 15);
	//   90  204:new             #2   <Class AccountViewState>
	//   91  207:dup             
	//   92  208:ldc1            #92  <String "HidePrivacySettingsLoadingIndicator">
	//   93  210:bipush          15
	//   94  212:invokespecial   #47  <Method void AccountViewState(String, int)>
	//   95  215:putstatic       #94  <Field AccountViewState HidePrivacySettingsLoadingIndicator>
		ShowCleanMapReports = new AccountViewState("ShowCleanMapReports", 16);
	//   96  218:new             #2   <Class AccountViewState>
	//   97  221:dup             
	//   98  222:ldc1            #95  <String "ShowCleanMapReports">
	//   99  224:bipush          16
	//  100  226:invokespecial   #47  <Method void AccountViewState(String, int)>
	//  101  229:putstatic       #97  <Field AccountViewState ShowCleanMapReports>
		HideCleanMapReports = new AccountViewState("HideCleanMapReports", 17);
	//  102  232:new             #2   <Class AccountViewState>
	//  103  235:dup             
	//  104  236:ldc1            #98  <String "HideCleanMapReports">
	//  105  238:bipush          17
	//  106  240:invokespecial   #47  <Method void AccountViewState(String, int)>
	//  107  243:putstatic       #100 <Field AccountViewState HideCleanMapReports>
		ShowSmartMapReports = new AccountViewState("ShowSmartMapReports", 18);
	//  108  246:new             #2   <Class AccountViewState>
	//  109  249:dup             
	//  110  250:ldc1            #101 <String "ShowSmartMapReports">
	//  111  252:bipush          18
	//  112  254:invokespecial   #47  <Method void AccountViewState(String, int)>
	//  113  257:putstatic       #103 <Field AccountViewState ShowSmartMapReports>
		HideSmartMapReports = new AccountViewState("HideSmartMapReports", 19);
	//  114  260:new             #2   <Class AccountViewState>
	//  115  263:dup             
	//  116  264:ldc1            #104 <String "HideSmartMapReports">
	//  117  266:bipush          19
	//  118  268:invokespecial   #47  <Method void AccountViewState(String, int)>
	//  119  271:putstatic       #106 <Field AccountViewState HideSmartMapReports>
		ShowRobotMapsInfo = new AccountViewState("ShowRobotMapsInfo", 20);
	//  120  274:new             #2   <Class AccountViewState>
	//  121  277:dup             
	//  122  278:ldc1            #107 <String "ShowRobotMapsInfo">
	//  123  280:bipush          20
	//  124  282:invokespecial   #47  <Method void AccountViewState(String, int)>
	//  125  285:putstatic       #109 <Field AccountViewState ShowRobotMapsInfo>
		HideRobotMapsInfo = new AccountViewState("HideRobotMapsInfo", 21);
	//  126  288:new             #2   <Class AccountViewState>
	//  127  291:dup             
	//  128  292:ldc1            #110 <String "HideRobotMapsInfo">
	//  129  294:bipush          21
	//  130  296:invokespecial   #47  <Method void AccountViewState(String, int)>
	//  131  299:putstatic       #112 <Field AccountViewState HideRobotMapsInfo>
		ShowTermsAndConditionsUrl = new AccountViewState("ShowTermsAndConditionsUrl", 22);
	//  132  302:new             #2   <Class AccountViewState>
	//  133  305:dup             
	//  134  306:ldc1            #113 <String "ShowTermsAndConditionsUrl">
	//  135  308:bipush          22
	//  136  310:invokespecial   #47  <Method void AccountViewState(String, int)>
	//  137  313:putstatic       #115 <Field AccountViewState ShowTermsAndConditionsUrl>
		ShowEULAUrl = new AccountViewState("ShowEULAUrl", 23);
	//  138  316:new             #2   <Class AccountViewState>
	//  139  319:dup             
	//  140  320:ldc1            #116 <String "ShowEULAUrl">
	//  141  322:bipush          23
	//  142  324:invokespecial   #47  <Method void AccountViewState(String, int)>
	//  143  327:putstatic       #118 <Field AccountViewState ShowEULAUrl>
		ShowPrivacyPolicyUrl = new AccountViewState("ShowPrivacyPolicyUrl", 24);
	//  144  330:new             #2   <Class AccountViewState>
	//  145  333:dup             
	//  146  334:ldc1            #119 <String "ShowPrivacyPolicyUrl">
	//  147  336:bipush          24
	//  148  338:invokespecial   #47  <Method void AccountViewState(String, int)>
	//  149  341:putstatic       #121 <Field AccountViewState ShowPrivacyPolicyUrl>
		ShowDataSecurityUrl = new AccountViewState("ShowDataSecurityUrl", 25);
	//  150  344:new             #2   <Class AccountViewState>
	//  151  347:dup             
	//  152  348:ldc1            #122 <String "ShowDataSecurityUrl">
	//  153  350:bipush          25
	//  154  352:invokespecial   #47  <Method void AccountViewState(String, int)>
	//  155  355:putstatic       #124 <Field AccountViewState ShowDataSecurityUrl>
		ShowMappingRobotsUrl = new AccountViewState("ShowMappingRobotsUrl", 26);
	//  156  358:new             #2   <Class AccountViewState>
	//  157  361:dup             
	//  158  362:ldc1            #125 <String "ShowMappingRobotsUrl">
	//  159  364:bipush          26
	//  160  366:invokespecial   #47  <Method void AccountViewState(String, int)>
	//  161  369:putstatic       #127 <Field AccountViewState ShowMappingRobotsUrl>
		ShowTermsConsentDate = new AccountViewState("ShowTermsConsentDate", 27);
	//  162  372:new             #2   <Class AccountViewState>
	//  163  375:dup             
	//  164  376:ldc1            #128 <String "ShowTermsConsentDate">
	//  165  378:bipush          27
	//  166  380:invokespecial   #47  <Method void AccountViewState(String, int)>
	//  167  383:putstatic       #130 <Field AccountViewState ShowTermsConsentDate>
		ShowEULAConsentDate = new AccountViewState("ShowEULAConsentDate", 28);
	//  168  386:new             #2   <Class AccountViewState>
	//  169  389:dup             
	//  170  390:ldc1            #131 <String "ShowEULAConsentDate">
	//  171  392:bipush          28
	//  172  394:invokespecial   #47  <Method void AccountViewState(String, int)>
	//  173  397:putstatic       #133 <Field AccountViewState ShowEULAConsentDate>
		ShowPrivacyConsentDate = new AccountViewState("ShowPrivacyConsentDate", 29);
	//  174  400:new             #2   <Class AccountViewState>
	//  175  403:dup             
	//  176  404:ldc1            #134 <String "ShowPrivacyConsentDate">
	//  177  406:bipush          29
	//  178  408:invokespecial   #47  <Method void AccountViewState(String, int)>
	//  179  411:putstatic       #136 <Field AccountViewState ShowPrivacyConsentDate>
		ShowCleanMapReportsSettingUnavailableError = new AccountViewState("ShowCleanMapReportsSettingUnavailableError", 30);
	//  180  414:new             #2   <Class AccountViewState>
	//  181  417:dup             
	//  182  418:ldc1            #137 <String "ShowCleanMapReportsSettingUnavailableError">
	//  183  420:bipush          30
	//  184  422:invokespecial   #47  <Method void AccountViewState(String, int)>
	//  185  425:putstatic       #139 <Field AccountViewState ShowCleanMapReportsSettingUnavailableError>
		ShowWebcontentUnavailableError = new AccountViewState("ShowWebcontentUnavailableError", 31);
	//  186  428:new             #2   <Class AccountViewState>
	//  187  431:dup             
	//  188  432:ldc1            #140 <String "ShowWebcontentUnavailableError">
	//  189  434:bipush          31
	//  190  436:invokespecial   #47  <Method void AccountViewState(String, int)>
	//  191  439:putstatic       #142 <Field AccountViewState ShowWebcontentUnavailableError>
		$VALUES = (new AccountViewState[] {
			ShowLoadingSpinner, ShowNotificationSettingsErrorDialog, ShowNotificationEmailSetting, ShowNotificationSettingsFailure, ShowNotificationSettingsUpdate, NavigateToBetaProgramMainPage, NavigateToCleanScreen, ShowLoadingIndicator, HideLoadingIndicator, ShowBetaProgramTip, 
			HideBetaProgramTip, ShowOutputConfirmation, ShowRequestErrorMessage, ShowUpdatedBetaProgramFeatures, ShowPrivacySettingsLoadingIndicator, HidePrivacySettingsLoadingIndicator, ShowCleanMapReports, HideCleanMapReports, ShowSmartMapReports, HideSmartMapReports, 
			ShowRobotMapsInfo, HideRobotMapsInfo, ShowTermsAndConditionsUrl, ShowEULAUrl, ShowPrivacyPolicyUrl, ShowDataSecurityUrl, ShowMappingRobotsUrl, ShowTermsConsentDate, ShowEULAConsentDate, ShowPrivacyConsentDate, 
			ShowCleanMapReportsSettingUnavailableError, ShowWebcontentUnavailableError
		});
	//  192  442:bipush          32
	//  193  444:anewarray       AccountViewState[]
	//  194  447:dup             
	//  195  448:iconst_0        
	//  196  449:getstatic       #49  <Field AccountViewState ShowLoadingSpinner>
	//  197  452:aastore         
	//  198  453:dup             
	//  199  454:iconst_1        
	//  200  455:getstatic       #52  <Field AccountViewState ShowNotificationSettingsErrorDialog>
	//  201  458:aastore         
	//  202  459:dup             
	//  203  460:iconst_2        
	//  204  461:getstatic       #55  <Field AccountViewState ShowNotificationEmailSetting>
	//  205  464:aastore         
	//  206  465:dup             
	//  207  466:iconst_3        
	//  208  467:getstatic       #58  <Field AccountViewState ShowNotificationSettingsFailure>
	//  209  470:aastore         
	//  210  471:dup             
	//  211  472:iconst_4        
	//  212  473:getstatic       #61  <Field AccountViewState ShowNotificationSettingsUpdate>
	//  213  476:aastore         
	//  214  477:dup             
	//  215  478:iconst_5        
	//  216  479:getstatic       #64  <Field AccountViewState NavigateToBetaProgramMainPage>
	//  217  482:aastore         
	//  218  483:dup             
	//  219  484:bipush          6
	//  220  486:getstatic       #67  <Field AccountViewState NavigateToCleanScreen>
	//  221  489:aastore         
	//  222  490:dup             
	//  223  491:bipush          7
	//  224  493:getstatic       #70  <Field AccountViewState ShowLoadingIndicator>
	//  225  496:aastore         
	//  226  497:dup             
	//  227  498:bipush          8
	//  228  500:getstatic       #73  <Field AccountViewState HideLoadingIndicator>
	//  229  503:aastore         
	//  230  504:dup             
	//  231  505:bipush          9
	//  232  507:getstatic       #76  <Field AccountViewState ShowBetaProgramTip>
	//  233  510:aastore         
	//  234  511:dup             
	//  235  512:bipush          10
	//  236  514:getstatic       #79  <Field AccountViewState HideBetaProgramTip>
	//  237  517:aastore         
	//  238  518:dup             
	//  239  519:bipush          11
	//  240  521:getstatic       #82  <Field AccountViewState ShowOutputConfirmation>
	//  241  524:aastore         
	//  242  525:dup             
	//  243  526:bipush          12
	//  244  528:getstatic       #85  <Field AccountViewState ShowRequestErrorMessage>
	//  245  531:aastore         
	//  246  532:dup             
	//  247  533:bipush          13
	//  248  535:getstatic       #88  <Field AccountViewState ShowUpdatedBetaProgramFeatures>
	//  249  538:aastore         
	//  250  539:dup             
	//  251  540:bipush          14
	//  252  542:getstatic       #91  <Field AccountViewState ShowPrivacySettingsLoadingIndicator>
	//  253  545:aastore         
	//  254  546:dup             
	//  255  547:bipush          15
	//  256  549:getstatic       #94  <Field AccountViewState HidePrivacySettingsLoadingIndicator>
	//  257  552:aastore         
	//  258  553:dup             
	//  259  554:bipush          16
	//  260  556:getstatic       #97  <Field AccountViewState ShowCleanMapReports>
	//  261  559:aastore         
	//  262  560:dup             
	//  263  561:bipush          17
	//  264  563:getstatic       #100 <Field AccountViewState HideCleanMapReports>
	//  265  566:aastore         
	//  266  567:dup             
	//  267  568:bipush          18
	//  268  570:getstatic       #103 <Field AccountViewState ShowSmartMapReports>
	//  269  573:aastore         
	//  270  574:dup             
	//  271  575:bipush          19
	//  272  577:getstatic       #106 <Field AccountViewState HideSmartMapReports>
	//  273  580:aastore         
	//  274  581:dup             
	//  275  582:bipush          20
	//  276  584:getstatic       #109 <Field AccountViewState ShowRobotMapsInfo>
	//  277  587:aastore         
	//  278  588:dup             
	//  279  589:bipush          21
	//  280  591:getstatic       #112 <Field AccountViewState HideRobotMapsInfo>
	//  281  594:aastore         
	//  282  595:dup             
	//  283  596:bipush          22
	//  284  598:getstatic       #115 <Field AccountViewState ShowTermsAndConditionsUrl>
	//  285  601:aastore         
	//  286  602:dup             
	//  287  603:bipush          23
	//  288  605:getstatic       #118 <Field AccountViewState ShowEULAUrl>
	//  289  608:aastore         
	//  290  609:dup             
	//  291  610:bipush          24
	//  292  612:getstatic       #121 <Field AccountViewState ShowPrivacyPolicyUrl>
	//  293  615:aastore         
	//  294  616:dup             
	//  295  617:bipush          25
	//  296  619:getstatic       #124 <Field AccountViewState ShowDataSecurityUrl>
	//  297  622:aastore         
	//  298  623:dup             
	//  299  624:bipush          26
	//  300  626:getstatic       #127 <Field AccountViewState ShowMappingRobotsUrl>
	//  301  629:aastore         
	//  302  630:dup             
	//  303  631:bipush          27
	//  304  633:getstatic       #130 <Field AccountViewState ShowTermsConsentDate>
	//  305  636:aastore         
	//  306  637:dup             
	//  307  638:bipush          28
	//  308  640:getstatic       #133 <Field AccountViewState ShowEULAConsentDate>
	//  309  643:aastore         
	//  310  644:dup             
	//  311  645:bipush          29
	//  312  647:getstatic       #136 <Field AccountViewState ShowPrivacyConsentDate>
	//  313  650:aastore         
	//  314  651:dup             
	//  315  652:bipush          30
	//  316  654:getstatic       #139 <Field AccountViewState ShowCleanMapReportsSettingUnavailableError>
	//  317  657:aastore         
	//  318  658:dup             
	//  319  659:bipush          31
	//  320  661:getstatic       #142 <Field AccountViewState ShowWebcontentUnavailableError>
	//  321  664:aastore         
	//  322  665:putstatic       #144 <Field AccountViewState[] $VALUES>
	//* 323  668:return          
	}
}
