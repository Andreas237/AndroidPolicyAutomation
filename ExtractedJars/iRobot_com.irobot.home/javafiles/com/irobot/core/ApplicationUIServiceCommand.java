// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class ApplicationUIServiceCommand extends Enum
{

	private ApplicationUIServiceCommand(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #90  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static ApplicationUIServiceCommand valueOf(String s)
	{
		return (ApplicationUIServiceCommand)Enum.valueOf(com/irobot/core/ApplicationUIServiceCommand, s);
	//    0    0:ldc1            #2   <Class ApplicationUIServiceCommand>
	//    1    2:aload_0         
	//    2    3:invokestatic    #96  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ApplicationUIServiceCommand>
	//    4    9:areturn         
	}

	public static ApplicationUIServiceCommand[] values()
	{
		return (ApplicationUIServiceCommand[])((ApplicationUIServiceCommand []) ($VALUES)).clone();
	//    0    0:getstatic       #88  <Field ApplicationUIServiceCommand[] $VALUES>
	//    1    3:invokevirtual   #103 <Method Object _5B_Lcom.irobot.core.ApplicationUIServiceCommand_3B_.clone()>
	//    2    6:checkcast       #99  <Class ApplicationUIServiceCommand[]>
	//    3    9:areturn         
	}

	private static final ApplicationUIServiceCommand $VALUES[];
	public static final ApplicationUIServiceCommand AcknowledgeResetOrRemovalSuccessHandled;
	public static final ApplicationUIServiceCommand AppRatingFeedbackCancelled;
	public static final ApplicationUIServiceCommand AppRatingFeedbackResponseDeferred;
	public static final ApplicationUIServiceCommand AppRatingSubmitted;
	public static final ApplicationUIServiceCommand AppVersionViewed;
	public static final ApplicationUIServiceCommand AssetResetOrRemovalCancelled;
	public static final ApplicationUIServiceCommand BeginAppRatingFlow;
	public static final ApplicationUIServiceCommand ClearAppReviewFeedbackData;
	public static final ApplicationUIServiceCommand ConfirmResetOrRemoveAsset;
	public static final ApplicationUIServiceCommand ContinueWithLocalResetOrRemove;
	public static final ApplicationUIServiceCommand InitiateResetOrRemoveAsset;
	public static final ApplicationUIServiceCommand RequestLatestAppVersion;
	public static final ApplicationUIServiceCommand SetNegativeResponseForAppRating;
	public static final ApplicationUIServiceCommand SetPositiveResponseForAppRating;
	public static final ApplicationUIServiceCommand SubmitBetaProgramFeedback;
	public static final ApplicationUIServiceCommand SubmitBugReport;
	public static final ApplicationUIServiceCommand SubmitPersistentMapFeedback;
	public static final ApplicationUIServiceCommand UpdateApplicationData;

	static 
	{
		UpdateApplicationData = new ApplicationUIServiceCommand("UpdateApplicationData", 0);
	//    0    0:new             #2   <Class ApplicationUIServiceCommand>
	//    1    3:dup             
	//    2    4:ldc1            #29  <String "UpdateApplicationData">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #33  <Method void ApplicationUIServiceCommand(String, int)>
	//    5   10:putstatic       #35  <Field ApplicationUIServiceCommand UpdateApplicationData>
		RequestLatestAppVersion = new ApplicationUIServiceCommand("RequestLatestAppVersion", 1);
	//    6   13:new             #2   <Class ApplicationUIServiceCommand>
	//    7   16:dup             
	//    8   17:ldc1            #36  <String "RequestLatestAppVersion">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #33  <Method void ApplicationUIServiceCommand(String, int)>
	//   11   23:putstatic       #38  <Field ApplicationUIServiceCommand RequestLatestAppVersion>
		AppVersionViewed = new ApplicationUIServiceCommand("AppVersionViewed", 2);
	//   12   26:new             #2   <Class ApplicationUIServiceCommand>
	//   13   29:dup             
	//   14   30:ldc1            #39  <String "AppVersionViewed">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #33  <Method void ApplicationUIServiceCommand(String, int)>
	//   17   36:putstatic       #41  <Field ApplicationUIServiceCommand AppVersionViewed>
		SubmitPersistentMapFeedback = new ApplicationUIServiceCommand("SubmitPersistentMapFeedback", 3);
	//   18   39:new             #2   <Class ApplicationUIServiceCommand>
	//   19   42:dup             
	//   20   43:ldc1            #42  <String "SubmitPersistentMapFeedback">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #33  <Method void ApplicationUIServiceCommand(String, int)>
	//   23   49:putstatic       #44  <Field ApplicationUIServiceCommand SubmitPersistentMapFeedback>
		SubmitBugReport = new ApplicationUIServiceCommand("SubmitBugReport", 4);
	//   24   52:new             #2   <Class ApplicationUIServiceCommand>
	//   25   55:dup             
	//   26   56:ldc1            #45  <String "SubmitBugReport">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #33  <Method void ApplicationUIServiceCommand(String, int)>
	//   29   62:putstatic       #47  <Field ApplicationUIServiceCommand SubmitBugReport>
		SubmitBetaProgramFeedback = new ApplicationUIServiceCommand("SubmitBetaProgramFeedback", 5);
	//   30   65:new             #2   <Class ApplicationUIServiceCommand>
	//   31   68:dup             
	//   32   69:ldc1            #48  <String "SubmitBetaProgramFeedback">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #33  <Method void ApplicationUIServiceCommand(String, int)>
	//   35   75:putstatic       #50  <Field ApplicationUIServiceCommand SubmitBetaProgramFeedback>
		BeginAppRatingFlow = new ApplicationUIServiceCommand("BeginAppRatingFlow", 6);
	//   36   78:new             #2   <Class ApplicationUIServiceCommand>
	//   37   81:dup             
	//   38   82:ldc1            #51  <String "BeginAppRatingFlow">
	//   39   84:bipush          6
	//   40   86:invokespecial   #33  <Method void ApplicationUIServiceCommand(String, int)>
	//   41   89:putstatic       #53  <Field ApplicationUIServiceCommand BeginAppRatingFlow>
		SetPositiveResponseForAppRating = new ApplicationUIServiceCommand("SetPositiveResponseForAppRating", 7);
	//   42   92:new             #2   <Class ApplicationUIServiceCommand>
	//   43   95:dup             
	//   44   96:ldc1            #54  <String "SetPositiveResponseForAppRating">
	//   45   98:bipush          7
	//   46  100:invokespecial   #33  <Method void ApplicationUIServiceCommand(String, int)>
	//   47  103:putstatic       #56  <Field ApplicationUIServiceCommand SetPositiveResponseForAppRating>
		SetNegativeResponseForAppRating = new ApplicationUIServiceCommand("SetNegativeResponseForAppRating", 8);
	//   48  106:new             #2   <Class ApplicationUIServiceCommand>
	//   49  109:dup             
	//   50  110:ldc1            #57  <String "SetNegativeResponseForAppRating">
	//   51  112:bipush          8
	//   52  114:invokespecial   #33  <Method void ApplicationUIServiceCommand(String, int)>
	//   53  117:putstatic       #59  <Field ApplicationUIServiceCommand SetNegativeResponseForAppRating>
		AppRatingSubmitted = new ApplicationUIServiceCommand("AppRatingSubmitted", 9);
	//   54  120:new             #2   <Class ApplicationUIServiceCommand>
	//   55  123:dup             
	//   56  124:ldc1            #60  <String "AppRatingSubmitted">
	//   57  126:bipush          9
	//   58  128:invokespecial   #33  <Method void ApplicationUIServiceCommand(String, int)>
	//   59  131:putstatic       #62  <Field ApplicationUIServiceCommand AppRatingSubmitted>
		AppRatingFeedbackCancelled = new ApplicationUIServiceCommand("AppRatingFeedbackCancelled", 10);
	//   60  134:new             #2   <Class ApplicationUIServiceCommand>
	//   61  137:dup             
	//   62  138:ldc1            #63  <String "AppRatingFeedbackCancelled">
	//   63  140:bipush          10
	//   64  142:invokespecial   #33  <Method void ApplicationUIServiceCommand(String, int)>
	//   65  145:putstatic       #65  <Field ApplicationUIServiceCommand AppRatingFeedbackCancelled>
		AppRatingFeedbackResponseDeferred = new ApplicationUIServiceCommand("AppRatingFeedbackResponseDeferred", 11);
	//   66  148:new             #2   <Class ApplicationUIServiceCommand>
	//   67  151:dup             
	//   68  152:ldc1            #66  <String "AppRatingFeedbackResponseDeferred">
	//   69  154:bipush          11
	//   70  156:invokespecial   #33  <Method void ApplicationUIServiceCommand(String, int)>
	//   71  159:putstatic       #68  <Field ApplicationUIServiceCommand AppRatingFeedbackResponseDeferred>
		ClearAppReviewFeedbackData = new ApplicationUIServiceCommand("ClearAppReviewFeedbackData", 12);
	//   72  162:new             #2   <Class ApplicationUIServiceCommand>
	//   73  165:dup             
	//   74  166:ldc1            #69  <String "ClearAppReviewFeedbackData">
	//   75  168:bipush          12
	//   76  170:invokespecial   #33  <Method void ApplicationUIServiceCommand(String, int)>
	//   77  173:putstatic       #71  <Field ApplicationUIServiceCommand ClearAppReviewFeedbackData>
		InitiateResetOrRemoveAsset = new ApplicationUIServiceCommand("InitiateResetOrRemoveAsset", 13);
	//   78  176:new             #2   <Class ApplicationUIServiceCommand>
	//   79  179:dup             
	//   80  180:ldc1            #72  <String "InitiateResetOrRemoveAsset">
	//   81  182:bipush          13
	//   82  184:invokespecial   #33  <Method void ApplicationUIServiceCommand(String, int)>
	//   83  187:putstatic       #74  <Field ApplicationUIServiceCommand InitiateResetOrRemoveAsset>
		ConfirmResetOrRemoveAsset = new ApplicationUIServiceCommand("ConfirmResetOrRemoveAsset", 14);
	//   84  190:new             #2   <Class ApplicationUIServiceCommand>
	//   85  193:dup             
	//   86  194:ldc1            #75  <String "ConfirmResetOrRemoveAsset">
	//   87  196:bipush          14
	//   88  198:invokespecial   #33  <Method void ApplicationUIServiceCommand(String, int)>
	//   89  201:putstatic       #77  <Field ApplicationUIServiceCommand ConfirmResetOrRemoveAsset>
		AssetResetOrRemovalCancelled = new ApplicationUIServiceCommand("AssetResetOrRemovalCancelled", 15);
	//   90  204:new             #2   <Class ApplicationUIServiceCommand>
	//   91  207:dup             
	//   92  208:ldc1            #78  <String "AssetResetOrRemovalCancelled">
	//   93  210:bipush          15
	//   94  212:invokespecial   #33  <Method void ApplicationUIServiceCommand(String, int)>
	//   95  215:putstatic       #80  <Field ApplicationUIServiceCommand AssetResetOrRemovalCancelled>
		ContinueWithLocalResetOrRemove = new ApplicationUIServiceCommand("ContinueWithLocalResetOrRemove", 16);
	//   96  218:new             #2   <Class ApplicationUIServiceCommand>
	//   97  221:dup             
	//   98  222:ldc1            #81  <String "ContinueWithLocalResetOrRemove">
	//   99  224:bipush          16
	//  100  226:invokespecial   #33  <Method void ApplicationUIServiceCommand(String, int)>
	//  101  229:putstatic       #83  <Field ApplicationUIServiceCommand ContinueWithLocalResetOrRemove>
		AcknowledgeResetOrRemovalSuccessHandled = new ApplicationUIServiceCommand("AcknowledgeResetOrRemovalSuccessHandled", 17);
	//  102  232:new             #2   <Class ApplicationUIServiceCommand>
	//  103  235:dup             
	//  104  236:ldc1            #84  <String "AcknowledgeResetOrRemovalSuccessHandled">
	//  105  238:bipush          17
	//  106  240:invokespecial   #33  <Method void ApplicationUIServiceCommand(String, int)>
	//  107  243:putstatic       #86  <Field ApplicationUIServiceCommand AcknowledgeResetOrRemovalSuccessHandled>
		$VALUES = (new ApplicationUIServiceCommand[] {
			UpdateApplicationData, RequestLatestAppVersion, AppVersionViewed, SubmitPersistentMapFeedback, SubmitBugReport, SubmitBetaProgramFeedback, BeginAppRatingFlow, SetPositiveResponseForAppRating, SetNegativeResponseForAppRating, AppRatingSubmitted, 
			AppRatingFeedbackCancelled, AppRatingFeedbackResponseDeferred, ClearAppReviewFeedbackData, InitiateResetOrRemoveAsset, ConfirmResetOrRemoveAsset, AssetResetOrRemovalCancelled, ContinueWithLocalResetOrRemove, AcknowledgeResetOrRemovalSuccessHandled
		});
	//  108  246:bipush          18
	//  109  248:anewarray       ApplicationUIServiceCommand[]
	//  110  251:dup             
	//  111  252:iconst_0        
	//  112  253:getstatic       #35  <Field ApplicationUIServiceCommand UpdateApplicationData>
	//  113  256:aastore         
	//  114  257:dup             
	//  115  258:iconst_1        
	//  116  259:getstatic       #38  <Field ApplicationUIServiceCommand RequestLatestAppVersion>
	//  117  262:aastore         
	//  118  263:dup             
	//  119  264:iconst_2        
	//  120  265:getstatic       #41  <Field ApplicationUIServiceCommand AppVersionViewed>
	//  121  268:aastore         
	//  122  269:dup             
	//  123  270:iconst_3        
	//  124  271:getstatic       #44  <Field ApplicationUIServiceCommand SubmitPersistentMapFeedback>
	//  125  274:aastore         
	//  126  275:dup             
	//  127  276:iconst_4        
	//  128  277:getstatic       #47  <Field ApplicationUIServiceCommand SubmitBugReport>
	//  129  280:aastore         
	//  130  281:dup             
	//  131  282:iconst_5        
	//  132  283:getstatic       #50  <Field ApplicationUIServiceCommand SubmitBetaProgramFeedback>
	//  133  286:aastore         
	//  134  287:dup             
	//  135  288:bipush          6
	//  136  290:getstatic       #53  <Field ApplicationUIServiceCommand BeginAppRatingFlow>
	//  137  293:aastore         
	//  138  294:dup             
	//  139  295:bipush          7
	//  140  297:getstatic       #56  <Field ApplicationUIServiceCommand SetPositiveResponseForAppRating>
	//  141  300:aastore         
	//  142  301:dup             
	//  143  302:bipush          8
	//  144  304:getstatic       #59  <Field ApplicationUIServiceCommand SetNegativeResponseForAppRating>
	//  145  307:aastore         
	//  146  308:dup             
	//  147  309:bipush          9
	//  148  311:getstatic       #62  <Field ApplicationUIServiceCommand AppRatingSubmitted>
	//  149  314:aastore         
	//  150  315:dup             
	//  151  316:bipush          10
	//  152  318:getstatic       #65  <Field ApplicationUIServiceCommand AppRatingFeedbackCancelled>
	//  153  321:aastore         
	//  154  322:dup             
	//  155  323:bipush          11
	//  156  325:getstatic       #68  <Field ApplicationUIServiceCommand AppRatingFeedbackResponseDeferred>
	//  157  328:aastore         
	//  158  329:dup             
	//  159  330:bipush          12
	//  160  332:getstatic       #71  <Field ApplicationUIServiceCommand ClearAppReviewFeedbackData>
	//  161  335:aastore         
	//  162  336:dup             
	//  163  337:bipush          13
	//  164  339:getstatic       #74  <Field ApplicationUIServiceCommand InitiateResetOrRemoveAsset>
	//  165  342:aastore         
	//  166  343:dup             
	//  167  344:bipush          14
	//  168  346:getstatic       #77  <Field ApplicationUIServiceCommand ConfirmResetOrRemoveAsset>
	//  169  349:aastore         
	//  170  350:dup             
	//  171  351:bipush          15
	//  172  353:getstatic       #80  <Field ApplicationUIServiceCommand AssetResetOrRemovalCancelled>
	//  173  356:aastore         
	//  174  357:dup             
	//  175  358:bipush          16
	//  176  360:getstatic       #83  <Field ApplicationUIServiceCommand ContinueWithLocalResetOrRemove>
	//  177  363:aastore         
	//  178  364:dup             
	//  179  365:bipush          17
	//  180  367:getstatic       #86  <Field ApplicationUIServiceCommand AcknowledgeResetOrRemovalSuccessHandled>
	//  181  370:aastore         
	//  182  371:putstatic       #88  <Field ApplicationUIServiceCommand[] $VALUES>
	//* 183  374:return          
	}
}
