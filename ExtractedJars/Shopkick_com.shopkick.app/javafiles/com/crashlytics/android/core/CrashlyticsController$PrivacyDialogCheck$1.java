// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController, PreferenceManager

class CrashlyticsController$PrivacyDialogCheck$1
	implements CrashPromptDialog.AlwaysSendCallback
{

	public void sendUserReportsWithoutPrompting(boolean flag)
	{
		CrashlyticsController.PrivacyDialogCheck.access$2100(CrashlyticsController.PrivacyDialogCheck.this).setShouldAlwaysSendReports(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field CrashlyticsController$PrivacyDialogCheck this$0>
	//    2    4:invokestatic    #30  <Method PreferenceManager CrashlyticsController$PrivacyDialogCheck.access$2100(CrashlyticsController$PrivacyDialogCheck)>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #35  <Method void PreferenceManager.setShouldAlwaysSendReports(boolean)>
	//    5   11:return          
	}

	final CrashlyticsController.PrivacyDialogCheck this$0;

	CrashlyticsController$PrivacyDialogCheck$1()
	{
		this$0 = CrashlyticsController.PrivacyDialogCheck.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field CrashlyticsController$PrivacyDialogCheck this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
	//    5    9:return          
	}
}
