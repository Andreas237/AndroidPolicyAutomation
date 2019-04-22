// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.ClassUtil;

public class MismatchedInputException extends JsonMappingException
{

	protected MismatchedInputException(JsonParser jsonparser, String s)
	{
		this(jsonparser, s, (JavaType)null);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:checkcast       #11  <Class JavaType>
	//    5    7:invokespecial   #14  <Method void MismatchedInputException(JsonParser, String, JavaType)>
	//    6   10:return          
	}

	protected MismatchedInputException(JsonParser jsonparser, String s, JsonLocation jsonlocation)
	{
		super(((java.io.Closeable) (jsonparser)), s, jsonlocation);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #19  <Method void JsonMappingException(java.io.Closeable, String, JsonLocation)>
	//    5    7:return          
	}

	protected MismatchedInputException(JsonParser jsonparser, String s, JavaType javatype)
	{
		super(((java.io.Closeable) (jsonparser)), s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #22  <Method void JsonMappingException(java.io.Closeable, String)>
		_targetType = ClassUtil.rawClass(javatype);
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:invokestatic    #28  <Method Class ClassUtil.rawClass(JavaType)>
	//    7   11:putfield        #30  <Field Class _targetType>
	//    8   14:return          
	}

	protected MismatchedInputException(JsonParser jsonparser, String s, Class class1)
	{
		super(((java.io.Closeable) (jsonparser)), s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #22  <Method void JsonMappingException(java.io.Closeable, String)>
		_targetType = class1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #30  <Field Class _targetType>
	//    7   11:return          
	}

	public static MismatchedInputException from(JsonParser jsonparser, JavaType javatype, String s)
	{
		return new MismatchedInputException(jsonparser, s, javatype);
	//    0    0:new             #2   <Class MismatchedInputException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokespecial   #14  <Method void MismatchedInputException(JsonParser, String, JavaType)>
	//    6   10:areturn         
	}

	public static MismatchedInputException from(JsonParser jsonparser, Class class1, String s)
	{
		return new MismatchedInputException(jsonparser, s, class1);
	//    0    0:new             #2   <Class MismatchedInputException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokespecial   #38  <Method void MismatchedInputException(JsonParser, String, Class)>
	//    6   10:areturn         
	}

	public MismatchedInputException setTargetType(JavaType javatype)
	{
		_targetType = javatype.getRawClass();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #45  <Method Class JavaType.getRawClass()>
	//    3    5:putfield        #30  <Field Class _targetType>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	protected Class _targetType;
}
