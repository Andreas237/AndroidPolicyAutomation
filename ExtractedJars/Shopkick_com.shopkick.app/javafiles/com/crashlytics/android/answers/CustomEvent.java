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
		if(s != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          21
		{
			eventName = validator.limitStringLength(s);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field AnswersEventValidator validator>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #22  <Method String AnswersEventValidator.limitStringLength(String)>
	//    9   17:putfield        #24  <Field String eventName>
			return;
	//   10   20:return          
		} else
		{
			throw new NullPointerException("eventName must not be null");
	//   11   21:new             #26  <Class NullPointerException>
	//   12   24:dup             
	//   13   25:ldc1            #28  <String "eventName must not be null">
	//   14   27:invokespecial   #30  <Method void NullPointerException(String)>
	//   15   30:athrow          
		}
	}

	String getCustomType()
	{
		return eventName;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String eventName>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #36  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("{eventName:\"");
	//    4    8:aload_1         
	//    5    9:ldc1            #39  <String "{eventName:\"">
	//    6   11:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(eventName);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #24  <Field String eventName>
	//   11   20:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append('"');
	//   13   24:aload_1         
	//   14   25:bipush          34
	//   15   27:invokevirtual   #46  <Method StringBuilder StringBuilder.append(char)>
	//   16   30:pop             
		stringbuilder.append(", customAttributes:");
	//   17   31:aload_1         
	//   18   32:ldc1            #48  <String ", customAttributes:">
	//   19   34:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append(((Object) (customAttributes)));
	//   21   38:aload_1         
	//   22   39:aload_0         
	//   23   40:getfield        #52  <Field AnswersAttributes customAttributes>
	//   24   43:invokevirtual   #55  <Method StringBuilder StringBuilder.append(Object)>
	//   25   46:pop             
		stringbuilder.append("}");
	//   26   47:aload_1         
	//   27   48:ldc1            #57  <String "}">
	//   28   50:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
		return stringbuilder.toString();
	//   30   54:aload_1         
	//   31   55:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   32   58:areturn         
	}

	private final String eventName;
}
