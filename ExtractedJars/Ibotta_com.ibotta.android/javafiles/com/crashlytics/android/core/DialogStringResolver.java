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
	//    1    1:invokespecial   #13  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Context context>
		promptData = promptsettingsdata;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field PromptSettingsData promptData>
	//    8   14:return          
	}

	private boolean isNullOrEmpty(String s)
	{
		return s == null || s.length() == 0;
	//    0    0:aload_1         
	//    1    1:ifnull          16
	//    2    4:aload_1         
	//    3    5:invokevirtual   #26  <Method int String.length()>
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
	//    2    2:getfield        #15  <Field Context context>
	//    3    5:aload_1         
	//    4    6:invokestatic    #34  <Method String CommonUtils.getStringsFileValue(Context, String)>
	//    5    9:aload_2         
	//    6   10:invokespecial   #37  <Method String stringOrFallback(String, String)>
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
	//*   4    4:invokespecial   #39  <Method boolean isNullOrEmpty(String)>
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
	//    1    1:ldc1            #43  <String "com.crashlytics.CrashSubmissionAlwaysSendTitle">
	//    2    3:aload_0         
	//    3    4:getfield        #17  <Field PromptSettingsData promptData>
	//    4    7:getfield        #49  <Field String PromptSettingsData.alwaysSendButtonTitle>
	//    5   10:invokespecial   #51  <Method String resourceOrFallbackValue(String, String)>
	//    6   13:areturn         
	}

	public String getCancelButtonTitle()
	{
		return resourceOrFallbackValue("com.crashlytics.CrashSubmissionCancelTitle", promptData.cancelButtonTitle);
	//    0    0:aload_0         
	//    1    1:ldc1            #54  <String "com.crashlytics.CrashSubmissionCancelTitle">
	//    2    3:aload_0         
	//    3    4:getfield        #17  <Field PromptSettingsData promptData>
	//    4    7:getfield        #57  <Field String PromptSettingsData.cancelButtonTitle>
	//    5   10:invokespecial   #51  <Method String resourceOrFallbackValue(String, String)>
	//    6   13:areturn         
	}

	public String getMessage()
	{
		return resourceOrFallbackValue("com.crashlytics.CrashSubmissionPromptMessage", promptData.message);
	//    0    0:aload_0         
	//    1    1:ldc1            #60  <String "com.crashlytics.CrashSubmissionPromptMessage">
	//    2    3:aload_0         
	//    3    4:getfield        #17  <Field PromptSettingsData promptData>
	//    4    7:getfield        #63  <Field String PromptSettingsData.message>
	//    5   10:invokespecial   #51  <Method String resourceOrFallbackValue(String, String)>
	//    6   13:areturn         
	}

	public String getSendButtonTitle()
	{
		return resourceOrFallbackValue("com.crashlytics.CrashSubmissionSendTitle", promptData.sendButtonTitle);
	//    0    0:aload_0         
	//    1    1:ldc1            #66  <String "com.crashlytics.CrashSubmissionSendTitle">
	//    2    3:aload_0         
	//    3    4:getfield        #17  <Field PromptSettingsData promptData>
	//    4    7:getfield        #69  <Field String PromptSettingsData.sendButtonTitle>
	//    5   10:invokespecial   #51  <Method String resourceOrFallbackValue(String, String)>
	//    6   13:areturn         
	}

	public String getTitle()
	{
		return resourceOrFallbackValue("com.crashlytics.CrashSubmissionPromptTitle", promptData.title);
	//    0    0:aload_0         
	//    1    1:ldc1            #72  <String "com.crashlytics.CrashSubmissionPromptTitle">
	//    2    3:aload_0         
	//    3    4:getfield        #17  <Field PromptSettingsData promptData>
	//    4    7:getfield        #75  <Field String PromptSettingsData.title>
	//    5   10:invokespecial   #51  <Method String resourceOrFallbackValue(String, String)>
	//    6   13:areturn         
	}

	private final Context context;
	private final PromptSettingsData promptData;
}
