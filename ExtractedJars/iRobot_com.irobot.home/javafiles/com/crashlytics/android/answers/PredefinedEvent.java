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
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #36  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("{type:\"");
	//    4    8:aload_1         
	//    5    9:ldc1            #39  <String "{type:\"">
	//    6   11:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(getPredefinedType());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #45  <Method String getPredefinedType()>
	//   11   20:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append('"');
	//   13   24:aload_1         
	//   14   25:bipush          34
	//   15   27:invokevirtual   #48  <Method StringBuilder StringBuilder.append(char)>
	//   16   30:pop             
		stringbuilder.append(", predefinedAttributes:");
	//   17   31:aload_1         
	//   18   32:ldc1            #50  <String ", predefinedAttributes:">
	//   19   34:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append(((Object) (predefinedAttributes)));
	//   21   38:aload_1         
	//   22   39:aload_0         
	//   23   40:getfield        #22  <Field AnswersAttributes predefinedAttributes>
	//   24   43:invokevirtual   #53  <Method StringBuilder StringBuilder.append(Object)>
	//   25   46:pop             
		stringbuilder.append(", customAttributes:");
	//   26   47:aload_1         
	//   27   48:ldc1            #55  <String ", customAttributes:">
	//   28   50:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
		stringbuilder.append(((Object) (customAttributes)));
	//   30   54:aload_1         
	//   31   55:aload_0         
	//   32   56:getfield        #58  <Field AnswersAttributes customAttributes>
	//   33   59:invokevirtual   #53  <Method StringBuilder StringBuilder.append(Object)>
	//   34   62:pop             
		stringbuilder.append("}");
	//   35   63:aload_1         
	//   36   64:ldc1            #60  <String "}">
	//   37   66:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   38   69:pop             
		return stringbuilder.toString();
	//   39   70:aload_1         
	//   40   71:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   41   74:areturn         
	}

	final AnswersAttributes predefinedAttributes;
}
