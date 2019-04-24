// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;

public class InvalidFormatException extends JsonMappingException
{

	public InvalidFormatException(JsonParser jsonparser, String s, Object obj, Class class1)
	{
		super(((java.io.Closeable) (jsonparser)), s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #18  <Method void JsonMappingException(java.io.Closeable, String)>
		_value = obj;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #20  <Field Object _value>
		_targetType = class1;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #22  <Field Class _targetType>
	//   10   17:return          
	}

	public InvalidFormatException(String s, JsonLocation jsonlocation, Object obj, Class class1)
	{
		super(((java.io.Closeable) (null)), s, jsonlocation);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokespecial   #30  <Method void JsonMappingException(java.io.Closeable, String, JsonLocation)>
		_value = obj;
	//    5    7:aload_0         
	//    6    8:aload_3         
	//    7    9:putfield        #20  <Field Object _value>
		_targetType = class1;
	//    8   12:aload_0         
	//    9   13:aload           4
	//   10   15:putfield        #22  <Field Class _targetType>
	//   11   18:return          
	}

	public InvalidFormatException(String s, Object obj, Class class1)
	{
		super(((java.io.Closeable) (null)), s);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokespecial   #18  <Method void JsonMappingException(java.io.Closeable, String)>
		_value = obj;
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:putfield        #20  <Field Object _value>
		_targetType = class1;
	//    7   11:aload_0         
	//    8   12:aload_3         
	//    9   13:putfield        #22  <Field Class _targetType>
	//   10   16:return          
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
	//    6    8:invokespecial   #38  <Method void InvalidFormatException(JsonParser, String, Object, Class)>
	//    7   11:areturn         
	}

	public Class getTargetType()
	{
		return _targetType;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Class _targetType>
	//    2    4:areturn         
	}

	public Object getValue()
	{
		return _value;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Object _value>
	//    2    4:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final Class _targetType;
	protected final Object _value;
}
