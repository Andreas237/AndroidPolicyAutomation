// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;

// Referenced classes of package com.fasterxml.jackson.databind.exc:
//			MismatchedInputException

public class InvalidTypeIdException extends MismatchedInputException
{

	public InvalidTypeIdException(JsonParser jsonparser, String s, JavaType javatype, String s1)
	{
		super(jsonparser, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #17  <Method void MismatchedInputException(JsonParser, String)>
		_baseType = javatype;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #19  <Field JavaType _baseType>
		_typeId = s1;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #21  <Field String _typeId>
	//   10   17:return          
	}

	public static InvalidTypeIdException from(JsonParser jsonparser, String s, JavaType javatype, String s1)
	{
		return new InvalidTypeIdException(jsonparser, s, javatype, s1);
	//    0    0:new             #2   <Class InvalidTypeIdException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #26  <Method void InvalidTypeIdException(JsonParser, String, JavaType, String)>
	//    7   11:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final JavaType _baseType;
	protected final String _typeId;
}
