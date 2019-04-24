// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.content.Context;
import b.a.a.a.a.b.i;
import b.a.a.a.a.g.o;

class DialogStringResolver
{

	public DialogStringResolver(Context context1, o o1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #31  <Field Context context>
		promptData = o1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #33  <Field o promptData>
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
		return stringOrFallback(i.b(context, s), s1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field Context context>
	//    3    5:aload_1         
	//    4    6:invokestatic    #50  <Method String i.b(Context, String)>
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
		return resourceOrFallbackValue("com.crashlytics.CrashSubmissionAlwaysSendTitle", promptData.g);
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <String "com.crashlytics.CrashSubmissionAlwaysSendTitle">
	//    2    3:aload_0         
	//    3    4:getfield        #33  <Field o promptData>
	//    4    7:getfield        #62  <Field String o.g>
	//    5   10:invokespecial   #64  <Method String resourceOrFallbackValue(String, String)>
	//    6   13:areturn         
	}

	public String getCancelButtonTitle()
	{
		return resourceOrFallbackValue("com.crashlytics.CrashSubmissionCancelTitle", promptData.e);
	//    0    0:aload_0         
	//    1    1:ldc1            #17  <String "com.crashlytics.CrashSubmissionCancelTitle">
	//    2    3:aload_0         
	//    3    4:getfield        #33  <Field o promptData>
	//    4    7:getfield        #68  <Field String o.e>
	//    5   10:invokespecial   #64  <Method String resourceOrFallbackValue(String, String)>
	//    6   13:areturn         
	}

	public String getMessage()
	{
		return resourceOrFallbackValue("com.crashlytics.CrashSubmissionPromptMessage", promptData.b);
	//    0    0:aload_0         
	//    1    1:ldc1            #8   <String "com.crashlytics.CrashSubmissionPromptMessage">
	//    2    3:aload_0         
	//    3    4:getfield        #33  <Field o promptData>
	//    4    7:getfield        #71  <Field String o.b>
	//    5   10:invokespecial   #64  <Method String resourceOrFallbackValue(String, String)>
	//    6   13:areturn         
	}

	public String getSendButtonTitle()
	{
		return resourceOrFallbackValue("com.crashlytics.CrashSubmissionSendTitle", promptData.c);
	//    0    0:aload_0         
	//    1    1:ldc1            #20  <String "com.crashlytics.CrashSubmissionSendTitle">
	//    2    3:aload_0         
	//    3    4:getfield        #33  <Field o promptData>
	//    4    7:getfield        #75  <Field String o.c>
	//    5   10:invokespecial   #64  <Method String resourceOrFallbackValue(String, String)>
	//    6   13:areturn         
	}

	public String getTitle()
	{
		return resourceOrFallbackValue("com.crashlytics.CrashSubmissionPromptTitle", promptData.a);
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "com.crashlytics.CrashSubmissionPromptTitle">
	//    2    3:aload_0         
	//    3    4:getfield        #33  <Field o promptData>
	//    4    7:getfield        #79  <Field String o.a>
	//    5   10:invokespecial   #64  <Method String resourceOrFallbackValue(String, String)>
	//    6   13:areturn         
	}

	private static final String PROMPT_MESSAGE_RES_NAME = "com.crashlytics.CrashSubmissionPromptMessage";
	private static final String PROMPT_TITLE_RES_NAME = "com.crashlytics.CrashSubmissionPromptTitle";
	private static final String SUBMISSION_ALWAYS_SEND_RES_NAME = "com.crashlytics.CrashSubmissionAlwaysSendTitle";
	private static final String SUBMISSION_CANCEL_RES_NAME = "com.crashlytics.CrashSubmissionCancelTitle";
	private static final String SUBMISSION_SEND_RES_NAME = "com.crashlytics.CrashSubmissionSendTitle";
	private final Context context;
	private final o promptData;
}
