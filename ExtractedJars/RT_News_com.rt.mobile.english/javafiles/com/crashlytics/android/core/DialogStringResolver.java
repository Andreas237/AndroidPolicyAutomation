// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.settings.PromptSettingsData;

class DialogStringResolver
{

	public DialogStringResolver(Context context1, PromptSettingsData promptsettingsdata)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #31  <Field Context context>
		promptData = promptsettingsdata;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #33  <Field PromptSettingsData promptData>
	//    8   14:return          
	}

	private boolean isNullOrEmpty(String s)
	{
		return s == null || s.length() == 0;
	//    0    0:aload_1         
	//    1    1:ifnull          16
	//    2    4:aload_1         
	//    3    5:invokevirtual   #42  <Method int String.length()>
	//    4    8:ifne            14
	//    5   11:goto            16
	//    6   14:iconst_0        
	//    7   15:ireturn         
	//    8   16:iconst_1        
	//    9   17:ireturn         
	}

	private String resourceOrFallbackValue(String s, String s1)
	{
		return stringOrFallback(CommonUtils.getStringsFileValue(context, s), s1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field Context context>
	//    3    5:aload_1         
	//    4    6:invokestatic    #50  <Method String CommonUtils.getStringsFileValue(Context, String)>
	//    5    9:aload_2         
	//    6   10:invokespecial   #53  <Method String stringOrFallback(String, String)>
	//    7   13:areturn         
	}

	private String stringOrFallback(String s, String s1)
	{
		String s2 = s;
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(isNullOrEmpty(s))
	//*   2    2:aload_0         
	//*   3    3:aload_1         
	//*   4    4:invokespecial   #55  <Method boolean isNullOrEmpty(String)>
	//*   5    7:ifeq            12
			s2 = s1;
	//    6   10:aload_2         
	//    7   11:astore_3        
		return s2;
	//    8   12:aload_3         
	//    9   13:areturn         
	}

	public String getAlwaysSendButtonTitle()
	{
		return resourceOrFallbackValue("com.crashlytics.CrashSubmissionAlwaysSendTitle", promptData.alwaysSendButtonTitle);
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <String "com.crashlytics.CrashSubmissionAlwaysSendTitle">
	//    2    3:aload_0         
	//    3    4:getfield        #33  <Field PromptSettingsData promptData>
	//    4    7:getfield        #62  <Field String PromptSettingsData.alwaysSendButtonTitle>
	//    5   10:invokespecial   #64  <Method String resourceOrFallbackValue(String, String)>
	//    6   13:areturn         
	}

	public String getCancelButtonTitle()
	{
		return resourceOrFallbackValue("com.crashlytics.CrashSubmissionCancelTitle", promptData.cancelButtonTitle);
	//    0    0:aload_0         
	//    1    1:ldc1            #17  <String "com.crashlytics.CrashSubmissionCancelTitle">
	//    2    3:aload_0         
	//    3    4:getfield        #33  <Field PromptSettingsData promptData>
	//    4    7:getfield        #68  <Field String PromptSettingsData.cancelButtonTitle>
	//    5   10:invokespecial   #64  <Method String resourceOrFallbackValue(String, String)>
	//    6   13:areturn         
	}

	public String getMessage()
	{
		return resourceOrFallbackValue("com.crashlytics.CrashSubmissionPromptMessage", promptData.message);
	//    0    0:aload_0         
	//    1    1:ldc1            #8   <String "com.crashlytics.CrashSubmissionPromptMessage">
	//    2    3:aload_0         
	//    3    4:getfield        #33  <Field PromptSettingsData promptData>
	//    4    7:getfield        #72  <Field String PromptSettingsData.message>
	//    5   10:invokespecial   #64  <Method String resourceOrFallbackValue(String, String)>
	//    6   13:areturn         
	}

	public String getSendButtonTitle()
	{
		return resourceOrFallbackValue("com.crashlytics.CrashSubmissionSendTitle", promptData.sendButtonTitle);
	//    0    0:aload_0         
	//    1    1:ldc1            #20  <String "com.crashlytics.CrashSubmissionSendTitle">
	//    2    3:aload_0         
	//    3    4:getfield        #33  <Field PromptSettingsData promptData>
	//    4    7:getfield        #76  <Field String PromptSettingsData.sendButtonTitle>
	//    5   10:invokespecial   #64  <Method String resourceOrFallbackValue(String, String)>
	//    6   13:areturn         
	}

	public String getTitle()
	{
		return resourceOrFallbackValue("com.crashlytics.CrashSubmissionPromptTitle", promptData.title);
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "com.crashlytics.CrashSubmissionPromptTitle">
	//    2    3:aload_0         
	//    3    4:getfield        #33  <Field PromptSettingsData promptData>
	//    4    7:getfield        #80  <Field String PromptSettingsData.title>
	//    5   10:invokespecial   #64  <Method String resourceOrFallbackValue(String, String)>
	//    6   13:areturn         
	}

	private static final String PROMPT_MESSAGE_RES_NAME = "com.crashlytics.CrashSubmissionPromptMessage";
	private static final String PROMPT_TITLE_RES_NAME = "com.crashlytics.CrashSubmissionPromptTitle";
	private static final String SUBMISSION_ALWAYS_SEND_RES_NAME = "com.crashlytics.CrashSubmissionAlwaysSendTitle";
	private static final String SUBMISSION_CANCEL_RES_NAME = "com.crashlytics.CrashSubmissionCancelTitle";
	private static final String SUBMISSION_SEND_RES_NAME = "com.crashlytics.CrashSubmissionSendTitle";
	private final Context context;
	private final PromptSettingsData promptData;
}
