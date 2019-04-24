// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class ApplicationUIState extends Enum
{

	private ApplicationUIState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #90  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static ApplicationUIState valueOf(String s)
	{
		return (ApplicationUIState)Enum.valueOf(com/irobot/core/ApplicationUIState, s);
	//    0    0:ldc1            #2   <Class ApplicationUIState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #96  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ApplicationUIState>
	//    4    9:areturn         
	}

	public static ApplicationUIState[] values()
	{
		return (ApplicationUIState[])((ApplicationUIState []) ($VALUES)).clone();
	//    0    0:getstatic       #88  <Field ApplicationUIState[] $VALUES>
	//    1    3:invokevirtual   #103 <Method Object _5B_Lcom.irobot.core.ApplicationUIState_3B_.clone()>
	//    2    6:checkcast       #99  <Class ApplicationUIState[]>
	//    3    9:areturn         
	}

	private static final ApplicationUIState $VALUES[];
	public static final ApplicationUIState AppVersionUnavailable;
	public static final ApplicationUIState AssetRemovalSuccessful;
	public static final ApplicationUIState AssetResetOrRemovalStarted;
	public static final ApplicationUIState BetaProgramFeedbackSubmissionSucceeded;
	public static final ApplicationUIState BugReportDescriptionFieldEmpty;
	public static final ApplicationUIState BugReportSubmissionFailed;
	public static final ApplicationUIState BugReportSubmissionSucceeded;
	public static final ApplicationUIState DisplayAppRatingFeedbackForm;
	public static final ApplicationUIState DisplayAssetResetFailedOnLocal;
	public static final ApplicationUIState DisplayAssetResetOrRemoveFailedOnRemote;
	public static final ApplicationUIState DisplayConfirmAssetResetOrRemovalUI;
	public static final ApplicationUIState DisplayPreAppRatingQuestionnaire;
	public static final ApplicationUIState DisplayResetOrRemoveSuccessDialog;
	public static final ApplicationUIState Invalid;
	public static final ApplicationUIState NewAppVersionAvailable;
	public static final ApplicationUIState NewAppVersionRequired;
	public static final ApplicationUIState PromptUserForAppRating;
	public static final ApplicationUIState RemoveAssetFromPlatform;

	static 
	{
		AppVersionUnavailable = new ApplicationUIState("AppVersionUnavailable", 0);
	//    0    0:new             #2   <Class ApplicationUIState>
	//    1    3:dup             
	//    2    4:ldc1            #29  <String "AppVersionUnavailable">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #33  <Method void ApplicationUIState(String, int)>
	//    5   10:putstatic       #35  <Field ApplicationUIState AppVersionUnavailable>
		NewAppVersionAvailable = new ApplicationUIState("NewAppVersionAvailable", 1);
	//    6   13:new             #2   <Class ApplicationUIState>
	//    7   16:dup             
	//    8   17:ldc1            #36  <String "NewAppVersionAvailable">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #33  <Method void ApplicationUIState(String, int)>
	//   11   23:putstatic       #38  <Field ApplicationUIState NewAppVersionAvailable>
		NewAppVersionRequired = new ApplicationUIState("NewAppVersionRequired", 2);
	//   12   26:new             #2   <Class ApplicationUIState>
	//   13   29:dup             
	//   14   30:ldc1            #39  <String "NewAppVersionRequired">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #33  <Method void ApplicationUIState(String, int)>
	//   17   36:putstatic       #41  <Field ApplicationUIState NewAppVersionRequired>
		BugReportDescriptionFieldEmpty = new ApplicationUIState("BugReportDescriptionFieldEmpty", 3);
	//   18   39:new             #2   <Class ApplicationUIState>
	//   19   42:dup             
	//   20   43:ldc1            #42  <String "BugReportDescriptionFieldEmpty">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #33  <Method void ApplicationUIState(String, int)>
	//   23   49:putstatic       #44  <Field ApplicationUIState BugReportDescriptionFieldEmpty>
		BugReportSubmissionSucceeded = new ApplicationUIState("BugReportSubmissionSucceeded", 4);
	//   24   52:new             #2   <Class ApplicationUIState>
	//   25   55:dup             
	//   26   56:ldc1            #45  <String "BugReportSubmissionSucceeded">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #33  <Method void ApplicationUIState(String, int)>
	//   29   62:putstatic       #47  <Field ApplicationUIState BugReportSubmissionSucceeded>
		BugReportSubmissionFailed = new ApplicationUIState("BugReportSubmissionFailed", 5);
	//   30   65:new             #2   <Class ApplicationUIState>
	//   31   68:dup             
	//   32   69:ldc1            #48  <String "BugReportSubmissionFailed">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #33  <Method void ApplicationUIState(String, int)>
	//   35   75:putstatic       #50  <Field ApplicationUIState BugReportSubmissionFailed>
		BetaProgramFeedbackSubmissionSucceeded = new ApplicationUIState("BetaProgramFeedbackSubmissionSucceeded", 6);
	//   36   78:new             #2   <Class ApplicationUIState>
	//   37   81:dup             
	//   38   82:ldc1            #51  <String "BetaProgramFeedbackSubmissionSucceeded">
	//   39   84:bipush          6
	//   40   86:invokespecial   #33  <Method void ApplicationUIState(String, int)>
	//   41   89:putstatic       #53  <Field ApplicationUIState BetaProgramFeedbackSubmissionSucceeded>
		DisplayPreAppRatingQuestionnaire = new ApplicationUIState("DisplayPreAppRatingQuestionnaire", 7);
	//   42   92:new             #2   <Class ApplicationUIState>
	//   43   95:dup             
	//   44   96:ldc1            #54  <String "DisplayPreAppRatingQuestionnaire">
	//   45   98:bipush          7
	//   46  100:invokespecial   #33  <Method void ApplicationUIState(String, int)>
	//   47  103:putstatic       #56  <Field ApplicationUIState DisplayPreAppRatingQuestionnaire>
		DisplayAppRatingFeedbackForm = new ApplicationUIState("DisplayAppRatingFeedbackForm", 8);
	//   48  106:new             #2   <Class ApplicationUIState>
	//   49  109:dup             
	//   50  110:ldc1            #57  <String "DisplayAppRatingFeedbackForm">
	//   51  112:bipush          8
	//   52  114:invokespecial   #33  <Method void ApplicationUIState(String, int)>
	//   53  117:putstatic       #59  <Field ApplicationUIState DisplayAppRatingFeedbackForm>
		PromptUserForAppRating = new ApplicationUIState("PromptUserForAppRating", 9);
	//   54  120:new             #2   <Class ApplicationUIState>
	//   55  123:dup             
	//   56  124:ldc1            #60  <String "PromptUserForAppRating">
	//   57  126:bipush          9
	//   58  128:invokespecial   #33  <Method void ApplicationUIState(String, int)>
	//   59  131:putstatic       #62  <Field ApplicationUIState PromptUserForAppRating>
		DisplayConfirmAssetResetOrRemovalUI = new ApplicationUIState("DisplayConfirmAssetResetOrRemovalUI", 10);
	//   60  134:new             #2   <Class ApplicationUIState>
	//   61  137:dup             
	//   62  138:ldc1            #63  <String "DisplayConfirmAssetResetOrRemovalUI">
	//   63  140:bipush          10
	//   64  142:invokespecial   #33  <Method void ApplicationUIState(String, int)>
	//   65  145:putstatic       #65  <Field ApplicationUIState DisplayConfirmAssetResetOrRemovalUI>
		AssetResetOrRemovalStarted = new ApplicationUIState("AssetResetOrRemovalStarted", 11);
	//   66  148:new             #2   <Class ApplicationUIState>
	//   67  151:dup             
	//   68  152:ldc1            #66  <String "AssetResetOrRemovalStarted">
	//   69  154:bipush          11
	//   70  156:invokespecial   #33  <Method void ApplicationUIState(String, int)>
	//   71  159:putstatic       #68  <Field ApplicationUIState AssetResetOrRemovalStarted>
		DisplayResetOrRemoveSuccessDialog = new ApplicationUIState("DisplayResetOrRemoveSuccessDialog", 12);
	//   72  162:new             #2   <Class ApplicationUIState>
	//   73  165:dup             
	//   74  166:ldc1            #69  <String "DisplayResetOrRemoveSuccessDialog">
	//   75  168:bipush          12
	//   76  170:invokespecial   #33  <Method void ApplicationUIState(String, int)>
	//   77  173:putstatic       #71  <Field ApplicationUIState DisplayResetOrRemoveSuccessDialog>
		DisplayAssetResetOrRemoveFailedOnRemote = new ApplicationUIState("DisplayAssetResetOrRemoveFailedOnRemote", 13);
	//   78  176:new             #2   <Class ApplicationUIState>
	//   79  179:dup             
	//   80  180:ldc1            #72  <String "DisplayAssetResetOrRemoveFailedOnRemote">
	//   81  182:bipush          13
	//   82  184:invokespecial   #33  <Method void ApplicationUIState(String, int)>
	//   83  187:putstatic       #74  <Field ApplicationUIState DisplayAssetResetOrRemoveFailedOnRemote>
		RemoveAssetFromPlatform = new ApplicationUIState("RemoveAssetFromPlatform", 14);
	//   84  190:new             #2   <Class ApplicationUIState>
	//   85  193:dup             
	//   86  194:ldc1            #75  <String "RemoveAssetFromPlatform">
	//   87  196:bipush          14
	//   88  198:invokespecial   #33  <Method void ApplicationUIState(String, int)>
	//   89  201:putstatic       #77  <Field ApplicationUIState RemoveAssetFromPlatform>
		AssetRemovalSuccessful = new ApplicationUIState("AssetRemovalSuccessful", 15);
	//   90  204:new             #2   <Class ApplicationUIState>
	//   91  207:dup             
	//   92  208:ldc1            #78  <String "AssetRemovalSuccessful">
	//   93  210:bipush          15
	//   94  212:invokespecial   #33  <Method void ApplicationUIState(String, int)>
	//   95  215:putstatic       #80  <Field ApplicationUIState AssetRemovalSuccessful>
		DisplayAssetResetFailedOnLocal = new ApplicationUIState("DisplayAssetResetFailedOnLocal", 16);
	//   96  218:new             #2   <Class ApplicationUIState>
	//   97  221:dup             
	//   98  222:ldc1            #81  <String "DisplayAssetResetFailedOnLocal">
	//   99  224:bipush          16
	//  100  226:invokespecial   #33  <Method void ApplicationUIState(String, int)>
	//  101  229:putstatic       #83  <Field ApplicationUIState DisplayAssetResetFailedOnLocal>
		Invalid = new ApplicationUIState("Invalid", 17);
	//  102  232:new             #2   <Class ApplicationUIState>
	//  103  235:dup             
	//  104  236:ldc1            #84  <String "Invalid">
	//  105  238:bipush          17
	//  106  240:invokespecial   #33  <Method void ApplicationUIState(String, int)>
	//  107  243:putstatic       #86  <Field ApplicationUIState Invalid>
		$VALUES = (new ApplicationUIState[] {
			AppVersionUnavailable, NewAppVersionAvailable, NewAppVersionRequired, BugReportDescriptionFieldEmpty, BugReportSubmissionSucceeded, BugReportSubmissionFailed, BetaProgramFeedbackSubmissionSucceeded, DisplayPreAppRatingQuestionnaire, DisplayAppRatingFeedbackForm, PromptUserForAppRating, 
			DisplayConfirmAssetResetOrRemovalUI, AssetResetOrRemovalStarted, DisplayResetOrRemoveSuccessDialog, DisplayAssetResetOrRemoveFailedOnRemote, RemoveAssetFromPlatform, AssetRemovalSuccessful, DisplayAssetResetFailedOnLocal, Invalid
		});
	//  108  246:bipush          18
	//  109  248:anewarray       ApplicationUIState[]
	//  110  251:dup             
	//  111  252:iconst_0        
	//  112  253:getstatic       #35  <Field ApplicationUIState AppVersionUnavailable>
	//  113  256:aastore         
	//  114  257:dup             
	//  115  258:iconst_1        
	//  116  259:getstatic       #38  <Field ApplicationUIState NewAppVersionAvailable>
	//  117  262:aastore         
	//  118  263:dup             
	//  119  264:iconst_2        
	//  120  265:getstatic       #41  <Field ApplicationUIState NewAppVersionRequired>
	//  121  268:aastore         
	//  122  269:dup             
	//  123  270:iconst_3        
	//  124  271:getstatic       #44  <Field ApplicationUIState BugReportDescriptionFieldEmpty>
	//  125  274:aastore         
	//  126  275:dup             
	//  127  276:iconst_4        
	//  128  277:getstatic       #47  <Field ApplicationUIState BugReportSubmissionSucceeded>
	//  129  280:aastore         
	//  130  281:dup             
	//  131  282:iconst_5        
	//  132  283:getstatic       #50  <Field ApplicationUIState BugReportSubmissionFailed>
	//  133  286:aastore         
	//  134  287:dup             
	//  135  288:bipush          6
	//  136  290:getstatic       #53  <Field ApplicationUIState BetaProgramFeedbackSubmissionSucceeded>
	//  137  293:aastore         
	//  138  294:dup             
	//  139  295:bipush          7
	//  140  297:getstatic       #56  <Field ApplicationUIState DisplayPreAppRatingQuestionnaire>
	//  141  300:aastore         
	//  142  301:dup             
	//  143  302:bipush          8
	//  144  304:getstatic       #59  <Field ApplicationUIState DisplayAppRatingFeedbackForm>
	//  145  307:aastore         
	//  146  308:dup             
	//  147  309:bipush          9
	//  148  311:getstatic       #62  <Field ApplicationUIState PromptUserForAppRating>
	//  149  314:aastore         
	//  150  315:dup             
	//  151  316:bipush          10
	//  152  318:getstatic       #65  <Field ApplicationUIState DisplayConfirmAssetResetOrRemovalUI>
	//  153  321:aastore         
	//  154  322:dup             
	//  155  323:bipush          11
	//  156  325:getstatic       #68  <Field ApplicationUIState AssetResetOrRemovalStarted>
	//  157  328:aastore         
	//  158  329:dup             
	//  159  330:bipush          12
	//  160  332:getstatic       #71  <Field ApplicationUIState DisplayResetOrRemoveSuccessDialog>
	//  161  335:aastore         
	//  162  336:dup             
	//  163  337:bipush          13
	//  164  339:getstatic       #74  <Field ApplicationUIState DisplayAssetResetOrRemoveFailedOnRemote>
	//  165  342:aastore         
	//  166  343:dup             
	//  167  344:bipush          14
	//  168  346:getstatic       #77  <Field ApplicationUIState RemoveAssetFromPlatform>
	//  169  349:aastore         
	//  170  350:dup             
	//  171  351:bipush          15
	//  172  353:getstatic       #80  <Field ApplicationUIState AssetRemovalSuccessful>
	//  173  356:aastore         
	//  174  357:dup             
	//  175  358:bipush          16
	//  176  360:getstatic       #83  <Field ApplicationUIState DisplayAssetResetFailedOnLocal>
	//  177  363:aastore         
	//  178  364:dup             
	//  179  365:bipush          17
	//  180  367:getstatic       #86  <Field ApplicationUIState Invalid>
	//  181  370:aastore         
	//  182  371:putstatic       #88  <Field ApplicationUIState[] $VALUES>
	//* 183  374:return          
	}
}
