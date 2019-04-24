// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.*;

// Referenced classes of package com.fasterxml.jackson.databind.jsonFormatVisitors:
//			JsonFormatVisitorWrapper, JsonAnyFormatVisitor, JsonArrayFormatVisitor, JsonBooleanFormatVisitor, 
//			JsonIntegerFormatVisitor, JsonMapFormatVisitor, JsonNullFormatVisitor, JsonNumberFormatVisitor, 
//			JsonObjectFormatVisitor, JsonStringFormatVisitor

public static class JsonFormatVisitorWrapper$Base
	implements JsonFormatVisitorWrapper
{

	public JsonAnyFormatVisitor expectAnyFormat(JavaType javatype)
		throws JsonMappingException
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public JsonArrayFormatVisitor expectArrayFormat(JavaType javatype)
		throws JsonMappingException
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public JsonBooleanFormatVisitor expectBooleanFormat(JavaType javatype)
		throws JsonMappingException
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public JsonIntegerFormatVisitor expectIntegerFormat(JavaType javatype)
		throws JsonMappingException
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public JsonMapFormatVisitor expectMapFormat(JavaType javatype)
		throws JsonMappingException
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public JsonNullFormatVisitor expectNullFormat(JavaType javatype)
		throws JsonMappingException
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public JsonNumberFormatVisitor expectNumberFormat(JavaType javatype)
		throws JsonMappingException
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public JsonObjectFormatVisitor expectObjectFormat(JavaType javatype)
		throws JsonMappingException
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public JsonStringFormatVisitor expectStringFormat(JavaType javatype)
		throws JsonMappingException
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public SerializerProvider getProvider()
	{
		return _provider;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SerializerProvider _provider>
	//    2    4:areturn         
	}

	public void setProvider(SerializerProvider serializerprovider)
	{
		_provider = serializerprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field SerializerProvider _provider>
	//    3    5:return          
	}

	protected SerializerProvider _provider;

	public JsonFormatVisitorWrapper$Base()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public JsonFormatVisitorWrapper$Base(SerializerProvider serializerprovider)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		_provider = serializerprovider;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field SerializerProvider _provider>
	//    5    9:return          
	}
}
