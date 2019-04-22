// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonParser;

// Referenced classes of package com.fasterxml.jackson.databind.exc:
//			MismatchedInputException

public class InvalidFormatException extends MismatchedInputException
{

	public InvalidFormatException(JsonParser jsonparser, String s, Object obj, Class class1)
	{
		super(jsonparser, s, class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload           4
	//    4    5:invokespecial   #15  <Method void MismatchedInputException(JsonParser, String, Class)>
		_value = obj;
	//    5    8:aload_0         
	//    6    9:aload_3         
	//    7   10:putfield        #17  <Field Object _value>
	//    8   13:return          
	}

	public static InvalidFormatException from(JsonParser jsonparser, String s, Object obj, Class class1)
	{
		return new InvalidFormatException(jsonparser, s, obj, class1);
	//    0    0:new             #2   <Class InvalidFormatException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #24  <Method void InvalidFormatException(JsonParser, String, Object, Class)>
	//    7   11:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final Object _value;
}
