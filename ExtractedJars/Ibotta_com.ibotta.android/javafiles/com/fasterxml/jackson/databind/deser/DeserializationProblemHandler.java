// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//			ValueInstantiator

public abstract class DeserializationProblemHandler
{

	public DeserializationProblemHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public Object handleInstantiationProblem(DeserializationContext deserializationcontext, Class class1, Object obj, Throwable throwable)
		throws IOException
	{
		return NOT_HANDLED;
	//    0    0:getstatic       #13  <Field Object NOT_HANDLED>
	//    1    3:areturn         
	}

	public Object handleMissingInstantiator(DeserializationContext deserializationcontext, Class class1, JsonParser jsonparser, String s)
		throws IOException
	{
		return NOT_HANDLED;
	//    0    0:getstatic       #13  <Field Object NOT_HANDLED>
	//    1    3:areturn         
	}

	public Object handleMissingInstantiator(DeserializationContext deserializationcontext, Class class1, ValueInstantiator valueinstantiator, JsonParser jsonparser, String s)
		throws IOException
	{
		return handleMissingInstantiator(deserializationcontext, class1, jsonparser, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:invokevirtual   #29  <Method Object handleMissingInstantiator(DeserializationContext, Class, JsonParser, String)>
	//    6   10:areturn         
	}

	public JavaType handleMissingTypeId(DeserializationContext deserializationcontext, JavaType javatype, TypeIdResolver typeidresolver, String s)
		throws IOException
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object handleUnexpectedToken(DeserializationContext deserializationcontext, Class class1, JsonToken jsontoken, JsonParser jsonparser, String s)
		throws IOException
	{
		return NOT_HANDLED;
	//    0    0:getstatic       #13  <Field Object NOT_HANDLED>
	//    1    3:areturn         
	}

	public boolean handleUnknownProperty(DeserializationContext deserializationcontext, JsonParser jsonparser, JsonDeserializer jsondeserializer, Object obj, String s)
		throws IOException
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public JavaType handleUnknownTypeId(DeserializationContext deserializationcontext, JavaType javatype, String s, TypeIdResolver typeidresolver, String s1)
		throws IOException
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object handleWeirdKey(DeserializationContext deserializationcontext, Class class1, String s, String s1)
		throws IOException
	{
		return NOT_HANDLED;
	//    0    0:getstatic       #13  <Field Object NOT_HANDLED>
	//    1    3:areturn         
	}

	public Object handleWeirdNativeValue(DeserializationContext deserializationcontext, JavaType javatype, Object obj, JsonParser jsonparser)
		throws IOException
	{
		return NOT_HANDLED;
	//    0    0:getstatic       #13  <Field Object NOT_HANDLED>
	//    1    3:areturn         
	}

	public Object handleWeirdNumberValue(DeserializationContext deserializationcontext, Class class1, Number number, String s)
		throws IOException
	{
		return NOT_HANDLED;
	//    0    0:getstatic       #13  <Field Object NOT_HANDLED>
	//    1    3:areturn         
	}

	public Object handleWeirdStringValue(DeserializationContext deserializationcontext, Class class1, String s, String s1)
		throws IOException
	{
		return NOT_HANDLED;
	//    0    0:getstatic       #13  <Field Object NOT_HANDLED>
	//    1    3:areturn         
	}

	public static final Object NOT_HANDLED = new Object();

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void Object()>
	//    3    7:putstatic       #13  <Field Object NOT_HANDLED>
	//*   4   10:return          
	}
}
