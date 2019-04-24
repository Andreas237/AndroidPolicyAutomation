// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import b.a.a.a.c;
import java.util.Map;

// Referenced classes of package com.crashlytics.android.answers:
//			AnswersEventValidator, AnswersAttributes

public abstract class AnswersEvent
{

	public AnswersEvent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #20  <Class AnswersEventValidator>
	//    4    8:dup             
	//    5    9:bipush          20
	//    6   11:bipush          100
	//    7   13:invokestatic    #26  <Method boolean c.h()>
	//    8   16:invokespecial   #29  <Method void AnswersEventValidator(int, int, boolean)>
	//    9   19:putfield        #31  <Field AnswersEventValidator validator>
		customAttributes = new AnswersAttributes(validator);
	//   10   22:aload_0         
	//   11   23:new             #33  <Class AnswersAttributes>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:getfield        #31  <Field AnswersEventValidator validator>
	//   15   31:invokespecial   #36  <Method void AnswersAttributes(AnswersEventValidator)>
	//   16   34:putfield        #38  <Field AnswersAttributes customAttributes>
	//   17   37:return          
	}

	Map getCustomAttributes()
	{
		return customAttributes.attributes;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field AnswersAttributes customAttributes>
	//    2    4:getfield        #45  <Field Map AnswersAttributes.attributes>
	//    3    7:areturn         
	}

	public AnswersEvent putCustomAttribute(String s, Number number)
	{
		customAttributes.put(s, number);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field AnswersAttributes customAttributes>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #53  <Method void AnswersAttributes.put(String, Number)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public AnswersEvent putCustomAttribute(String s, String s1)
	{
		customAttributes.put(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field AnswersAttributes customAttributes>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #58  <Method void AnswersAttributes.put(String, String)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public static final int MAX_NUM_ATTRIBUTES = 20;
	public static final int MAX_STRING_LENGTH = 100;
	final AnswersAttributes customAttributes;
	final AnswersEventValidator validator = new AnswersEventValidator(20, 100, c.h());
}
