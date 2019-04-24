// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;


// Referenced classes of package com.crashlytics.android.answers:
//			PredefinedEvent, AnswersAttributes

public class InviteEvent extends PredefinedEvent
{

	public InviteEvent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PredefinedEvent()>
	//    2    4:return          
	}

	String getPredefinedType()
	{
		return "invite";
	//    0    0:ldc1            #12  <String "invite">
	//    1    2:areturn         
	}

	public InviteEvent putMethod(String s)
	{
		predefinedAttributes.put("method", s);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field AnswersAttributes predefinedAttributes>
	//    2    4:ldc1            #9   <String "method">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #31  <Method void AnswersAttributes.put(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	static final String METHOD_ATTRIBUTE = "method";
	static final String TYPE = "invite";
}
