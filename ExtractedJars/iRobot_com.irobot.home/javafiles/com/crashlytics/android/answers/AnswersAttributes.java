// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.answers:
//			AnswersEventValidator

class AnswersAttributes
{

	public AnswersAttributes(AnswersEventValidator answerseventvalidator)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ConcurrentHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void ConcurrentHashMap()>
	//    6   12:putfield        #19  <Field Map attributes>
		validator = answerseventvalidator;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #21  <Field AnswersEventValidator validator>
	//   10   20:return          
	}

	void put(String s, Number number)
	{
		if(!validator.isNull(((Object) (s)), "key"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field AnswersEventValidator validator>
	//*   2    4:aload_1         
	//*   3    5:ldc1            #26  <String "key">
	//*   4    7:invokevirtual   #32  <Method boolean AnswersEventValidator.isNull(Object, String)>
	//*   5   10:ifne            40
		{
			if(validator.isNull(((Object) (number)), "value"))
	//*   6   13:aload_0         
	//*   7   14:getfield        #21  <Field AnswersEventValidator validator>
	//*   8   17:aload_2         
	//*   9   18:ldc1            #34  <String "value">
	//*  10   20:invokevirtual   #32  <Method boolean AnswersEventValidator.isNull(Object, String)>
	//*  11   23:ifeq            27
				return;
	//   12   26:return          
			putAttribute(validator.limitStringLength(s), ((Object) (number)));
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #21  <Field AnswersEventValidator validator>
	//   16   32:aload_1         
	//   17   33:invokevirtual   #38  <Method String AnswersEventValidator.limitStringLength(String)>
	//   18   36:aload_2         
	//   19   37:invokevirtual   #42  <Method void putAttribute(String, Object)>
		}
	//   20   40:return          
	}

	void put(String s, String s1)
	{
		if(!validator.isNull(((Object) (s)), "key"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field AnswersEventValidator validator>
	//*   2    4:aload_1         
	//*   3    5:ldc1            #26  <String "key">
	//*   4    7:invokevirtual   #32  <Method boolean AnswersEventValidator.isNull(Object, String)>
	//*   5   10:ifne            47
		{
			if(validator.isNull(((Object) (s1)), "value"))
	//*   6   13:aload_0         
	//*   7   14:getfield        #21  <Field AnswersEventValidator validator>
	//*   8   17:aload_2         
	//*   9   18:ldc1            #34  <String "value">
	//*  10   20:invokevirtual   #32  <Method boolean AnswersEventValidator.isNull(Object, String)>
	//*  11   23:ifeq            27
				return;
	//   12   26:return          
			putAttribute(validator.limitStringLength(s), ((Object) (validator.limitStringLength(s1))));
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #21  <Field AnswersEventValidator validator>
	//   16   32:aload_1         
	//   17   33:invokevirtual   #38  <Method String AnswersEventValidator.limitStringLength(String)>
	//   18   36:aload_0         
	//   19   37:getfield        #21  <Field AnswersEventValidator validator>
	//   20   40:aload_2         
	//   21   41:invokevirtual   #38  <Method String AnswersEventValidator.limitStringLength(String)>
	//   22   44:invokevirtual   #42  <Method void putAttribute(String, Object)>
		}
	//   23   47:return          
	}

	void putAttribute(String s, Object obj)
	{
		if(!validator.isFullMap(attributes, s))
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field AnswersEventValidator validator>
	//*   2    4:aload_0         
	//*   3    5:getfield        #19  <Field Map attributes>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #47  <Method boolean AnswersEventValidator.isFullMap(Map, String)>
	//*   6   12:ifne            27
			attributes.put(((Object) (s)), obj);
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field Map attributes>
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokeinterface #52  <Method Object Map.put(Object, Object)>
	//   12   26:pop             
	//   13   27:return          
	}

	public String toString()
	{
		return (new JSONObject(attributes)).toString();
	//    0    0:new             #56  <Class JSONObject>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Map attributes>
	//    4    8:invokespecial   #59  <Method void JSONObject(Map)>
	//    5   11:invokevirtual   #61  <Method String JSONObject.toString()>
	//    6   14:areturn         
	}

	final Map attributes = new ConcurrentHashMap();
	final AnswersEventValidator validator;
}
