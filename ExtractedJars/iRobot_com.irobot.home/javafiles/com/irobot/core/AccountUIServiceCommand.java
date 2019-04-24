// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class AccountUIServiceCommand extends Enum
{

	private AccountUIServiceCommand(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #70  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static AccountUIServiceCommand valueOf(String s)
	{
		return (AccountUIServiceCommand)Enum.valueOf(com/irobot/core/AccountUIServiceCommand, s);
	//    0    0:ldc1            #2   <Class AccountUIServiceCommand>
	//    1    2:aload_0         
	//    2    3:invokestatic    #76  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AccountUIServiceCommand>
	//    4    9:areturn         
	}

	public static AccountUIServiceCommand[] values()
	{
		return (AccountUIServiceCommand[])((AccountUIServiceCommand []) ($VALUES)).clone();
	//    0    0:getstatic       #68  <Field AccountUIServiceCommand[] $VALUES>
	//    1    3:invokevirtual   #83  <Method Object _5B_Lcom.irobot.core.AccountUIServiceCommand_3B_.clone()>
	//    2    6:checkcast       #79  <Class AccountUIServiceCommand[]>
	//    3    9:areturn         
	}

	private static final AccountUIServiceCommand $VALUES[];
	public static final AccountUIServiceCommand BetaEnrollmentChanged;
	public static final AccountUIServiceCommand BetaFeatureStatusChanged;
	public static final AccountUIServiceCommand BetaOptOutConfirmed;
	public static final AccountUIServiceCommand BetaProgramTipDismissed;
	public static final AccountUIServiceCommand DataSecuritySelected;
	public static final AccountUIServiceCommand EULASelected;
	public static final AccountUIServiceCommand LearnMoreSelected;
	public static final AccountUIServiceCommand QueryPrivacySettings;
	public static final AccountUIServiceCommand TermsAndConditionsSelected;
	public static final AccountUIServiceCommand ToggleCleanMap;
	public static final AccountUIServiceCommand UpdateEmailOptIn;
	public static final AccountUIServiceCommand UpdateSetting;
	public static final AccountUIServiceCommand UserAgreementSelected;

	static 
	{
		UpdateSetting = new AccountUIServiceCommand("UpdateSetting", 0);
	//    0    0:new             #2   <Class AccountUIServiceCommand>
	//    1    3:dup             
	//    2    4:ldc1            #24  <String "UpdateSetting">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #28  <Method void AccountUIServiceCommand(String, int)>
	//    5   10:putstatic       #30  <Field AccountUIServiceCommand UpdateSetting>
		UpdateEmailOptIn = new AccountUIServiceCommand("UpdateEmailOptIn", 1);
	//    6   13:new             #2   <Class AccountUIServiceCommand>
	//    7   16:dup             
	//    8   17:ldc1            #31  <String "UpdateEmailOptIn">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #28  <Method void AccountUIServiceCommand(String, int)>
	//   11   23:putstatic       #33  <Field AccountUIServiceCommand UpdateEmailOptIn>
		BetaEnrollmentChanged = new AccountUIServiceCommand("BetaEnrollmentChanged", 2);
	//   12   26:new             #2   <Class AccountUIServiceCommand>
	//   13   29:dup             
	//   14   30:ldc1            #34  <String "BetaEnrollmentChanged">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #28  <Method void AccountUIServiceCommand(String, int)>
	//   17   36:putstatic       #36  <Field AccountUIServiceCommand BetaEnrollmentChanged>
		BetaFeatureStatusChanged = new AccountUIServiceCommand("BetaFeatureStatusChanged", 3);
	//   18   39:new             #2   <Class AccountUIServiceCommand>
	//   19   42:dup             
	//   20   43:ldc1            #37  <String "BetaFeatureStatusChanged">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #28  <Method void AccountUIServiceCommand(String, int)>
	//   23   49:putstatic       #39  <Field AccountUIServiceCommand BetaFeatureStatusChanged>
		BetaOptOutConfirmed = new AccountUIServiceCommand("BetaOptOutConfirmed", 4);
	//   24   52:new             #2   <Class AccountUIServiceCommand>
	//   25   55:dup             
	//   26   56:ldc1            #40  <String "BetaOptOutConfirmed">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #28  <Method void AccountUIServiceCommand(String, int)>
	//   29   62:putstatic       #42  <Field AccountUIServiceCommand BetaOptOutConfirmed>
		BetaProgramTipDismissed = new AccountUIServiceCommand("BetaProgramTipDismissed", 5);
	//   30   65:new             #2   <Class AccountUIServiceCommand>
	//   31   68:dup             
	//   32   69:ldc1            #43  <String "BetaProgramTipDismissed">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #28  <Method void AccountUIServiceCommand(String, int)>
	//   35   75:putstatic       #45  <Field AccountUIServiceCommand BetaProgramTipDismissed>
		QueryPrivacySettings = new AccountUIServiceCommand("QueryPrivacySettings", 6);
	//   36   78:new             #2   <Class AccountUIServiceCommand>
	//   37   81:dup             
	//   38   82:ldc1            #46  <String "QueryPrivacySettings">
	//   39   84:bipush          6
	//   40   86:invokespecial   #28  <Method void AccountUIServiceCommand(String, int)>
	//   41   89:putstatic       #48  <Field AccountUIServiceCommand QueryPrivacySettings>
		LearnMoreSelected = new AccountUIServiceCommand("LearnMoreSelected", 7);
	//   42   92:new             #2   <Class AccountUIServiceCommand>
	//   43   95:dup             
	//   44   96:ldc1            #49  <String "LearnMoreSelected">
	//   45   98:bipush          7
	//   46  100:invokespecial   #28  <Method void AccountUIServiceCommand(String, int)>
	//   47  103:putstatic       #51  <Field AccountUIServiceCommand LearnMoreSelected>
		DataSecuritySelected = new AccountUIServiceCommand("DataSecuritySelected", 8);
	//   48  106:new             #2   <Class AccountUIServiceCommand>
	//   49  109:dup             
	//   50  110:ldc1            #52  <String "DataSecuritySelected">
	//   51  112:bipush          8
	//   52  114:invokespecial   #28  <Method void AccountUIServiceCommand(String, int)>
	//   53  117:putstatic       #54  <Field AccountUIServiceCommand DataSecuritySelected>
		TermsAndConditionsSelected = new AccountUIServiceCommand("TermsAndConditionsSelected", 9);
	//   54  120:new             #2   <Class AccountUIServiceCommand>
	//   55  123:dup             
	//   56  124:ldc1            #55  <String "TermsAndConditionsSelected">
	//   57  126:bipush          9
	//   58  128:invokespecial   #28  <Method void AccountUIServiceCommand(String, int)>
	//   59  131:putstatic       #57  <Field AccountUIServiceCommand TermsAndConditionsSelected>
		EULASelected = new AccountUIServiceCommand("EULASelected", 10);
	//   60  134:new             #2   <Class AccountUIServiceCommand>
	//   61  137:dup             
	//   62  138:ldc1            #58  <String "EULASelected">
	//   63  140:bipush          10
	//   64  142:invokespecial   #28  <Method void AccountUIServiceCommand(String, int)>
	//   65  145:putstatic       #60  <Field AccountUIServiceCommand EULASelected>
		UserAgreementSelected = new AccountUIServiceCommand("UserAgreementSelected", 11);
	//   66  148:new             #2   <Class AccountUIServiceCommand>
	//   67  151:dup             
	//   68  152:ldc1            #61  <String "UserAgreementSelected">
	//   69  154:bipush          11
	//   70  156:invokespecial   #28  <Method void AccountUIServiceCommand(String, int)>
	//   71  159:putstatic       #63  <Field AccountUIServiceCommand UserAgreementSelected>
		ToggleCleanMap = new AccountUIServiceCommand("ToggleCleanMap", 12);
	//   72  162:new             #2   <Class AccountUIServiceCommand>
	//   73  165:dup             
	//   74  166:ldc1            #64  <String "ToggleCleanMap">
	//   75  168:bipush          12
	//   76  170:invokespecial   #28  <Method void AccountUIServiceCommand(String, int)>
	//   77  173:putstatic       #66  <Field AccountUIServiceCommand ToggleCleanMap>
		$VALUES = (new AccountUIServiceCommand[] {
			UpdateSetting, UpdateEmailOptIn, BetaEnrollmentChanged, BetaFeatureStatusChanged, BetaOptOutConfirmed, BetaProgramTipDismissed, QueryPrivacySettings, LearnMoreSelected, DataSecuritySelected, TermsAndConditionsSelected, 
			EULASelected, UserAgreementSelected, ToggleCleanMap
		});
	//   78  176:bipush          13
	//   79  178:anewarray       AccountUIServiceCommand[]
	//   80  181:dup             
	//   81  182:iconst_0        
	//   82  183:getstatic       #30  <Field AccountUIServiceCommand UpdateSetting>
	//   83  186:aastore         
	//   84  187:dup             
	//   85  188:iconst_1        
	//   86  189:getstatic       #33  <Field AccountUIServiceCommand UpdateEmailOptIn>
	//   87  192:aastore         
	//   88  193:dup             
	//   89  194:iconst_2        
	//   90  195:getstatic       #36  <Field AccountUIServiceCommand BetaEnrollmentChanged>
	//   91  198:aastore         
	//   92  199:dup             
	//   93  200:iconst_3        
	//   94  201:getstatic       #39  <Field AccountUIServiceCommand BetaFeatureStatusChanged>
	//   95  204:aastore         
	//   96  205:dup             
	//   97  206:iconst_4        
	//   98  207:getstatic       #42  <Field AccountUIServiceCommand BetaOptOutConfirmed>
	//   99  210:aastore         
	//  100  211:dup             
	//  101  212:iconst_5        
	//  102  213:getstatic       #45  <Field AccountUIServiceCommand BetaProgramTipDismissed>
	//  103  216:aastore         
	//  104  217:dup             
	//  105  218:bipush          6
	//  106  220:getstatic       #48  <Field AccountUIServiceCommand QueryPrivacySettings>
	//  107  223:aastore         
	//  108  224:dup             
	//  109  225:bipush          7
	//  110  227:getstatic       #51  <Field AccountUIServiceCommand LearnMoreSelected>
	//  111  230:aastore         
	//  112  231:dup             
	//  113  232:bipush          8
	//  114  234:getstatic       #54  <Field AccountUIServiceCommand DataSecuritySelected>
	//  115  237:aastore         
	//  116  238:dup             
	//  117  239:bipush          9
	//  118  241:getstatic       #57  <Field AccountUIServiceCommand TermsAndConditionsSelected>
	//  119  244:aastore         
	//  120  245:dup             
	//  121  246:bipush          10
	//  122  248:getstatic       #60  <Field AccountUIServiceCommand EULASelected>
	//  123  251:aastore         
	//  124  252:dup             
	//  125  253:bipush          11
	//  126  255:getstatic       #63  <Field AccountUIServiceCommand UserAgreementSelected>
	//  127  258:aastore         
	//  128  259:dup             
	//  129  260:bipush          12
	//  130  262:getstatic       #66  <Field AccountUIServiceCommand ToggleCleanMap>
	//  131  265:aastore         
	//  132  266:putstatic       #68  <Field AccountUIServiceCommand[] $VALUES>
	//* 133  269:return          
	}
}
