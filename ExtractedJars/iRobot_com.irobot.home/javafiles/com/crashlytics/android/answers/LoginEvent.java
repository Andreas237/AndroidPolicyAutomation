// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;


// Referenced classes of package com.crashlytics.android.answers:
//			PredefinedEvent, AnswersAttributes

public class LoginEvent extends PredefinedEvent
{

	public LoginEvent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void PredefinedEvent()>
	//    2    4:return          
	}

	String getPredefinedType()
	{
		return "login";
	//    0    0:ldc1            #15  <String "login">
	//    1    2:areturn         
	}

	public LoginEvent putMethod(String s)
	{
		predefinedAttributes.put("method", s);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field AnswersAttributes predefinedAttributes>
	//    2    4:ldc1            #9   <String "method">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #34  <Method void AnswersAttributes.put(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public LoginEvent putSuccess(boolean flag)
	{
		predefinedAttributes.put("success", Boolean.toString(flag));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field AnswersAttributes predefinedAttributes>
	//    2    4:ldc1            #12  <String "success">
	//    3    6:iload_1         
	//    4    7:invokestatic    #42  <Method String Boolean.toString(boolean)>
	//    5   10:invokevirtual   #34  <Method void AnswersAttributes.put(String, String)>
		return this;
	//    6   13:aload_0         
	//    7   14:areturn         
	}

	static final String METHOD_ATTRIBUTE = "method";
	static final String SUCCESS_ATTRIBUTE = "success";
	static final String TYPE = "login";
}
