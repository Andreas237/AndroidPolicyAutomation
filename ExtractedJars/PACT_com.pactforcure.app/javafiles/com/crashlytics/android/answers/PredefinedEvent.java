// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import java.util.Map;

// Referenced classes of package com.crashlytics.android.answers:
//			AnswersEvent, AnswersAttributes

public abstract class PredefinedEvent extends AnswersEvent
{

	public PredefinedEvent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AnswersEvent()>
		predefinedAttributes = new AnswersAttributes(validator);
	//    2    4:aload_0         
	//    3    5:new             #13  <Class AnswersAttributes>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field AnswersEventValidator validator>
	//    7   13:invokespecial   #20  <Method void AnswersAttributes(AnswersEventValidator)>
	//    8   16:putfield        #22  <Field AnswersAttributes predefinedAttributes>
	//    9   19:return          
	}

	Map getPredefinedAttributes()
	{
		return predefinedAttributes.attributes;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AnswersAttributes predefinedAttributes>
	//    2    4:getfield        #29  <Field Map AnswersAttributes.attributes>
	//    3    7:areturn         
	}

	abstract String getPredefinedType();

	public String toString()
	{
		return (new StringBuilder()).append("{type:\"").append(getPredefinedType()).append('"').append(", predefinedAttributes:").append(((Object) (predefinedAttributes))).append(", customAttributes:").append(((Object) (customAttributes))).append("}").toString();
	//    0    0:new             #36  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void StringBuilder()>
	//    3    7:ldc1            #39  <String "{type:\"">
	//    4    9:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #45  <Method String getPredefinedType()>
	//    7   16:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:bipush          34
	//    9   21:invokevirtual   #48  <Method StringBuilder StringBuilder.append(char)>
	//   10   24:ldc1            #50  <String ", predefinedAttributes:">
	//   11   26:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   12   29:aload_0         
	//   13   30:getfield        #22  <Field AnswersAttributes predefinedAttributes>
	//   14   33:invokevirtual   #53  <Method StringBuilder StringBuilder.append(Object)>
	//   15   36:ldc1            #55  <String ", customAttributes:">
	//   16   38:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   17   41:aload_0         
	//   18   42:getfield        #58  <Field AnswersAttributes customAttributes>
	//   19   45:invokevirtual   #53  <Method StringBuilder StringBuilder.append(Object)>
	//   20   48:ldc1            #60  <String "}">
	//   21   50:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   22   53:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   23   56:areturn         
	}

	final AnswersAttributes predefinedAttributes;
}
