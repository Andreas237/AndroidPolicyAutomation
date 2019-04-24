// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class AccountDataState extends Enum
{

	private AccountDataState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #102 <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static AccountDataState valueOf(String s)
	{
		return (AccountDataState)Enum.valueOf(com/irobot/core/AccountDataState, s);
	//    0    0:ldc1            #2   <Class AccountDataState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #108 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AccountDataState>
	//    4    9:areturn         
	}

	public static AccountDataState[] values()
	{
		return (AccountDataState[])((AccountDataState []) ($VALUES)).clone();
	//    0    0:getstatic       #100 <Field AccountDataState[] $VALUES>
	//    1    3:invokevirtual   #115 <Method Object _5B_Lcom.irobot.core.AccountDataState_3B_.clone()>
	//    2    6:checkcast       #111 <Class AccountDataState[]>
	//    3    9:areturn         
	}

	private static final AccountDataState $VALUES[];
	public static final AccountDataState BetaFeatureStatus;
	public static final AccountDataState BetaFeatureType;
	public static final AccountDataState BetaProgramEnrollmentChanged;
	public static final AccountDataState BetaProgramFeatures;
	public static final AccountDataState CleanMapReportsAvailable;
	public static final AccountDataState CleanMapReportsEnabled;
	public static final AccountDataState CountryCode;
	public static final AccountDataState DataSecurityUrl;
	public static final AccountDataState EULAConsentDate;
	public static final AccountDataState EULAUrl;
	public static final AccountDataState LanguageCode;
	public static final AccountDataState MappingRobotsUrl;
	public static final AccountDataState PrivacyConsentDate;
	public static final AccountDataState PrivacyPolicyUrl;
	public static final AccountDataState PushNotificationEmailOptIn;
	public static final AccountDataState PushNotificationSetting;
	public static final AccountDataState PushNotificationSettingsFailed;
	public static final AccountDataState PushNotificationSettingsUpdated;
	public static final AccountDataState PushNotificationType;
	public static final AccountDataState TermsAndConditionsUrl;
	public static final AccountDataState TermsConsentDate;

	static 
	{
		PushNotificationSettingsFailed = new AccountDataState("PushNotificationSettingsFailed", 0);
	//    0    0:new             #2   <Class AccountDataState>
	//    1    3:dup             
	//    2    4:ldc1            #32  <String "PushNotificationSettingsFailed">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #36  <Method void AccountDataState(String, int)>
	//    5   10:putstatic       #38  <Field AccountDataState PushNotificationSettingsFailed>
		PushNotificationSettingsUpdated = new AccountDataState("PushNotificationSettingsUpdated", 1);
	//    6   13:new             #2   <Class AccountDataState>
	//    7   16:dup             
	//    8   17:ldc1            #39  <String "PushNotificationSettingsUpdated">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #36  <Method void AccountDataState(String, int)>
	//   11   23:putstatic       #41  <Field AccountDataState PushNotificationSettingsUpdated>
		PushNotificationType = new AccountDataState("PushNotificationType", 2);
	//   12   26:new             #2   <Class AccountDataState>
	//   13   29:dup             
	//   14   30:ldc1            #42  <String "PushNotificationType">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #36  <Method void AccountDataState(String, int)>
	//   17   36:putstatic       #44  <Field AccountDataState PushNotificationType>
		PushNotificationSetting = new AccountDataState("PushNotificationSetting", 3);
	//   18   39:new             #2   <Class AccountDataState>
	//   19   42:dup             
	//   20   43:ldc1            #45  <String "PushNotificationSetting">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #36  <Method void AccountDataState(String, int)>
	//   23   49:putstatic       #47  <Field AccountDataState PushNotificationSetting>
		PushNotificationEmailOptIn = new AccountDataState("PushNotificationEmailOptIn", 4);
	//   24   52:new             #2   <Class AccountDataState>
	//   25   55:dup             
	//   26   56:ldc1            #48  <String "PushNotificationEmailOptIn">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #36  <Method void AccountDataState(String, int)>
	//   29   62:putstatic       #50  <Field AccountDataState PushNotificationEmailOptIn>
		BetaProgramEnrollmentChanged = new AccountDataState("BetaProgramEnrollmentChanged", 5);
	//   30   65:new             #2   <Class AccountDataState>
	//   31   68:dup             
	//   32   69:ldc1            #51  <String "BetaProgramEnrollmentChanged">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #36  <Method void AccountDataState(String, int)>
	//   35   75:putstatic       #53  <Field AccountDataState BetaProgramEnrollmentChanged>
		BetaFeatureType = new AccountDataState("BetaFeatureType", 6);
	//   36   78:new             #2   <Class AccountDataState>
	//   37   81:dup             
	//   38   82:ldc1            #54  <String "BetaFeatureType">
	//   39   84:bipush          6
	//   40   86:invokespecial   #36  <Method void AccountDataState(String, int)>
	//   41   89:putstatic       #56  <Field AccountDataState BetaFeatureType>
		BetaFeatureStatus = new AccountDataState("BetaFeatureStatus", 7);
	//   42   92:new             #2   <Class AccountDataState>
	//   43   95:dup             
	//   44   96:ldc1            #57  <String "BetaFeatureStatus">
	//   45   98:bipush          7
	//   46  100:invokespecial   #36  <Method void AccountDataState(String, int)>
	//   47  103:putstatic       #59  <Field AccountDataState BetaFeatureStatus>
		BetaProgramFeatures = new AccountDataState("BetaProgramFeatures", 8);
	//   48  106:new             #2   <Class AccountDataState>
	//   49  109:dup             
	//   50  110:ldc1            #60  <String "BetaProgramFeatures">
	//   51  112:bipush          8
	//   52  114:invokespecial   #36  <Method void AccountDataState(String, int)>
	//   53  117:putstatic       #62  <Field AccountDataState BetaProgramFeatures>
		LanguageCode = new AccountDataState("LanguageCode", 9);
	//   54  120:new             #2   <Class AccountDataState>
	//   55  123:dup             
	//   56  124:ldc1            #63  <String "LanguageCode">
	//   57  126:bipush          9
	//   58  128:invokespecial   #36  <Method void AccountDataState(String, int)>
	//   59  131:putstatic       #65  <Field AccountDataState LanguageCode>
		CountryCode = new AccountDataState("CountryCode", 10);
	//   60  134:new             #2   <Class AccountDataState>
	//   61  137:dup             
	//   62  138:ldc1            #66  <String "CountryCode">
	//   63  140:bipush          10
	//   64  142:invokespecial   #36  <Method void AccountDataState(String, int)>
	//   65  145:putstatic       #68  <Field AccountDataState CountryCode>
		CleanMapReportsEnabled = new AccountDataState("CleanMapReportsEnabled", 11);
	//   66  148:new             #2   <Class AccountDataState>
	//   67  151:dup             
	//   68  152:ldc1            #69  <String "CleanMapReportsEnabled">
	//   69  154:bipush          11
	//   70  156:invokespecial   #36  <Method void AccountDataState(String, int)>
	//   71  159:putstatic       #71  <Field AccountDataState CleanMapReportsEnabled>
		CleanMapReportsAvailable = new AccountDataState("CleanMapReportsAvailable", 12);
	//   72  162:new             #2   <Class AccountDataState>
	//   73  165:dup             
	//   74  166:ldc1            #72  <String "CleanMapReportsAvailable">
	//   75  168:bipush          12
	//   76  170:invokespecial   #36  <Method void AccountDataState(String, int)>
	//   77  173:putstatic       #74  <Field AccountDataState CleanMapReportsAvailable>
		TermsAndConditionsUrl = new AccountDataState("TermsAndConditionsUrl", 13);
	//   78  176:new             #2   <Class AccountDataState>
	//   79  179:dup             
	//   80  180:ldc1            #75  <String "TermsAndConditionsUrl">
	//   81  182:bipush          13
	//   82  184:invokespecial   #36  <Method void AccountDataState(String, int)>
	//   83  187:putstatic       #77  <Field AccountDataState TermsAndConditionsUrl>
		EULAUrl = new AccountDataState("EULAUrl", 14);
	//   84  190:new             #2   <Class AccountDataState>
	//   85  193:dup             
	//   86  194:ldc1            #78  <String "EULAUrl">
	//   87  196:bipush          14
	//   88  198:invokespecial   #36  <Method void AccountDataState(String, int)>
	//   89  201:putstatic       #80  <Field AccountDataState EULAUrl>
		PrivacyPolicyUrl = new AccountDataState("PrivacyPolicyUrl", 15);
	//   90  204:new             #2   <Class AccountDataState>
	//   91  207:dup             
	//   92  208:ldc1            #81  <String "PrivacyPolicyUrl">
	//   93  210:bipush          15
	//   94  212:invokespecial   #36  <Method void AccountDataState(String, int)>
	//   95  215:putstatic       #83  <Field AccountDataState PrivacyPolicyUrl>
		DataSecurityUrl = new AccountDataState("DataSecurityUrl", 16);
	//   96  218:new             #2   <Class AccountDataState>
	//   97  221:dup             
	//   98  222:ldc1            #84  <String "DataSecurityUrl">
	//   99  224:bipush          16
	//  100  226:invokespecial   #36  <Method void AccountDataState(String, int)>
	//  101  229:putstatic       #86  <Field AccountDataState DataSecurityUrl>
		MappingRobotsUrl = new AccountDataState("MappingRobotsUrl", 17);
	//  102  232:new             #2   <Class AccountDataState>
	//  103  235:dup             
	//  104  236:ldc1            #87  <String "MappingRobotsUrl">
	//  105  238:bipush          17
	//  106  240:invokespecial   #36  <Method void AccountDataState(String, int)>
	//  107  243:putstatic       #89  <Field AccountDataState MappingRobotsUrl>
		TermsConsentDate = new AccountDataState("TermsConsentDate", 18);
	//  108  246:new             #2   <Class AccountDataState>
	//  109  249:dup             
	//  110  250:ldc1            #90  <String "TermsConsentDate">
	//  111  252:bipush          18
	//  112  254:invokespecial   #36  <Method void AccountDataState(String, int)>
	//  113  257:putstatic       #92  <Field AccountDataState TermsConsentDate>
		EULAConsentDate = new AccountDataState("EULAConsentDate", 19);
	//  114  260:new             #2   <Class AccountDataState>
	//  115  263:dup             
	//  116  264:ldc1            #93  <String "EULAConsentDate">
	//  117  266:bipush          19
	//  118  268:invokespecial   #36  <Method void AccountDataState(String, int)>
	//  119  271:putstatic       #95  <Field AccountDataState EULAConsentDate>
		PrivacyConsentDate = new AccountDataState("PrivacyConsentDate", 20);
	//  120  274:new             #2   <Class AccountDataState>
	//  121  277:dup             
	//  122  278:ldc1            #96  <String "PrivacyConsentDate">
	//  123  280:bipush          20
	//  124  282:invokespecial   #36  <Method void AccountDataState(String, int)>
	//  125  285:putstatic       #98  <Field AccountDataState PrivacyConsentDate>
		$VALUES = (new AccountDataState[] {
			PushNotificationSettingsFailed, PushNotificationSettingsUpdated, PushNotificationType, PushNotificationSetting, PushNotificationEmailOptIn, BetaProgramEnrollmentChanged, BetaFeatureType, BetaFeatureStatus, BetaProgramFeatures, LanguageCode, 
			CountryCode, CleanMapReportsEnabled, CleanMapReportsAvailable, TermsAndConditionsUrl, EULAUrl, PrivacyPolicyUrl, DataSecurityUrl, MappingRobotsUrl, TermsConsentDate, EULAConsentDate, 
			PrivacyConsentDate
		});
	//  126  288:bipush          21
	//  127  290:anewarray       AccountDataState[]
	//  128  293:dup             
	//  129  294:iconst_0        
	//  130  295:getstatic       #38  <Field AccountDataState PushNotificationSettingsFailed>
	//  131  298:aastore         
	//  132  299:dup             
	//  133  300:iconst_1        
	//  134  301:getstatic       #41  <Field AccountDataState PushNotificationSettingsUpdated>
	//  135  304:aastore         
	//  136  305:dup             
	//  137  306:iconst_2        
	//  138  307:getstatic       #44  <Field AccountDataState PushNotificationType>
	//  139  310:aastore         
	//  140  311:dup             
	//  141  312:iconst_3        
	//  142  313:getstatic       #47  <Field AccountDataState PushNotificationSetting>
	//  143  316:aastore         
	//  144  317:dup             
	//  145  318:iconst_4        
	//  146  319:getstatic       #50  <Field AccountDataState PushNotificationEmailOptIn>
	//  147  322:aastore         
	//  148  323:dup             
	//  149  324:iconst_5        
	//  150  325:getstatic       #53  <Field AccountDataState BetaProgramEnrollmentChanged>
	//  151  328:aastore         
	//  152  329:dup             
	//  153  330:bipush          6
	//  154  332:getstatic       #56  <Field AccountDataState BetaFeatureType>
	//  155  335:aastore         
	//  156  336:dup             
	//  157  337:bipush          7
	//  158  339:getstatic       #59  <Field AccountDataState BetaFeatureStatus>
	//  159  342:aastore         
	//  160  343:dup             
	//  161  344:bipush          8
	//  162  346:getstatic       #62  <Field AccountDataState BetaProgramFeatures>
	//  163  349:aastore         
	//  164  350:dup             
	//  165  351:bipush          9
	//  166  353:getstatic       #65  <Field AccountDataState LanguageCode>
	//  167  356:aastore         
	//  168  357:dup             
	//  169  358:bipush          10
	//  170  360:getstatic       #68  <Field AccountDataState CountryCode>
	//  171  363:aastore         
	//  172  364:dup             
	//  173  365:bipush          11
	//  174  367:getstatic       #71  <Field AccountDataState CleanMapReportsEnabled>
	//  175  370:aastore         
	//  176  371:dup             
	//  177  372:bipush          12
	//  178  374:getstatic       #74  <Field AccountDataState CleanMapReportsAvailable>
	//  179  377:aastore         
	//  180  378:dup             
	//  181  379:bipush          13
	//  182  381:getstatic       #77  <Field AccountDataState TermsAndConditionsUrl>
	//  183  384:aastore         
	//  184  385:dup             
	//  185  386:bipush          14
	//  186  388:getstatic       #80  <Field AccountDataState EULAUrl>
	//  187  391:aastore         
	//  188  392:dup             
	//  189  393:bipush          15
	//  190  395:getstatic       #83  <Field AccountDataState PrivacyPolicyUrl>
	//  191  398:aastore         
	//  192  399:dup             
	//  193  400:bipush          16
	//  194  402:getstatic       #86  <Field AccountDataState DataSecurityUrl>
	//  195  405:aastore         
	//  196  406:dup             
	//  197  407:bipush          17
	//  198  409:getstatic       #89  <Field AccountDataState MappingRobotsUrl>
	//  199  412:aastore         
	//  200  413:dup             
	//  201  414:bipush          18
	//  202  416:getstatic       #92  <Field AccountDataState TermsConsentDate>
	//  203  419:aastore         
	//  204  420:dup             
	//  205  421:bipush          19
	//  206  423:getstatic       #95  <Field AccountDataState EULAConsentDate>
	//  207  426:aastore         
	//  208  427:dup             
	//  209  428:bipush          20
	//  210  430:getstatic       #98  <Field AccountDataState PrivacyConsentDate>
	//  211  433:aastore         
	//  212  434:putstatic       #100 <Field AccountDataState[] $VALUES>
	//* 213  437:return          
	}
}
