// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;


// Referenced classes of package com.crashlytics.android.answers:
//			AnswersEvent, AnswersEventValidator

public class CustomEvent extends AnswersEvent
{

	public CustomEvent(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void AnswersEvent()>
		if(s == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
		{
			throw new NullPointerException("eventName must not be null");
	//    4    8:new             #14  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:ldc1            #16  <String "eventName must not be null">
	//    7   14:invokespecial   #18  <Method void NullPointerException(String)>
	//    8   17:athrow          
		} else
		{
			eventName = validator.limitStringLength(s);
	//    9   18:aload_0         
	//   10   19:aload_0         
	//   11   20:getfield        #22  <Field AnswersEventValidator validator>
	//   12   23:aload_1         
	//   13   24:invokevirtual   #28  <Method String AnswersEventValidator.limitStringLength(String)>
	//   14   27:putfield        #30  <Field String eventName>
			return;
	//   15   30:return          
		}
	}

	String getCustomType()
	{
		return eventName;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String eventName>
	//    2    4:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("{eventName:\"").append(eventName).append('"').append(", customAttributes:").append(((Object) (customAttributes))).append("}").toString();
	//    0    0:new             #36  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void StringBuilder()>
	//    3    7:ldc1            #39  <String "{eventName:\"">
	//    4    9:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #30  <Field String eventName>
	//    7   16:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:bipush          34
	//    9   21:invokevirtual   #46  <Method StringBuilder StringBuilder.append(char)>
	//   10   24:ldc1            #48  <String ", customAttributes:">
	//   11   26:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   12   29:aload_0         
	//   13   30:getfield        #52  <Field AnswersAttributes customAttributes>
	//   14   33:invokevirtual   #55  <Method StringBuilder StringBuilder.append(Object)>
	//   15   36:ldc1            #57  <String "}">
	//   16   38:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   17   41:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   18   44:areturn         
	}

	private final String eventName;
}
