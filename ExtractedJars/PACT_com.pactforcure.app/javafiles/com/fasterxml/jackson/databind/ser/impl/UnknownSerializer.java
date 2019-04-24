// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.lang.reflect.Type;

public class UnknownSerializer extends StdSerializer
{

	public UnknownSerializer()
	{
		super(java/lang/Object);
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <Class Object>
	//    2    3:invokespecial   #12  <Method void StdSerializer(Class)>
	//    3    6:return          
	}

	public UnknownSerializer(Class class1)
	{
		super(class1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #16  <Method void StdSerializer(Class, boolean)>
	//    4    6:return          
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		jsonformatvisitorwrapper.expectAnyFormat(javatype);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #28  <Method com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor JsonFormatVisitorWrapper.expectAnyFormat(JavaType)>
	//    3    7:pop             
	//    4    8:return          
	}

	protected void failForEmpty(JsonGenerator jsongenerator, Object obj)
		throws JsonMappingException
	{
		throw JsonMappingException.from(jsongenerator, (new StringBuilder()).append("No serializer found for class ").append(obj.getClass().getName()).append(" and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS) )").toString());
	//    0    0:aload_1         
	//    1    1:new             #33  <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #35  <Method void StringBuilder()>
	//    4    8:ldc1            #37  <String "No serializer found for class ">
	//    5   10:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    6   13:aload_2         
	//    7   14:invokevirtual   #45  <Method Class Object.getClass()>
	//    8   17:invokevirtual   #51  <Method String Class.getName()>
	//    9   20:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:ldc1            #53  <String " and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS) )">
	//   11   25:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   12   28:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   13   31:invokestatic    #60  <Method JsonMappingException JsonMappingException.from(JsonGenerator, String)>
	//   14   34:athrow          
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		throws JsonMappingException
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(serializerprovider.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS))
	//*   0    0:aload_3         
	//*   1    1:getstatic       #74  <Field SerializationFeature SerializationFeature.FAIL_ON_EMPTY_BEANS>
	//*   2    4:invokevirtual   #80  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   3    7:ifeq            16
			failForEmpty(jsongenerator, obj);
	//    4   10:aload_0         
	//    5   11:aload_2         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #82  <Method void failForEmpty(JsonGenerator, Object)>
		jsongenerator.writeStartObject();
	//    8   16:aload_2         
	//    9   17:invokevirtual   #87  <Method void JsonGenerator.writeStartObject()>
		jsongenerator.writeEndObject();
	//   10   20:aload_2         
	//   11   21:invokevirtual   #90  <Method void JsonGenerator.writeEndObject()>
	//   12   24:return          
	}

	public final void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		if(serializerprovider.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS))
	//*   0    0:aload_3         
	//*   1    1:getstatic       #74  <Field SerializationFeature SerializationFeature.FAIL_ON_EMPTY_BEANS>
	//*   2    4:invokevirtual   #80  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   3    7:ifeq            16
			failForEmpty(jsongenerator, obj);
	//    4   10:aload_0         
	//    5   11:aload_2         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #82  <Method void failForEmpty(JsonGenerator, Object)>
		typeserializer.writeTypePrefixForObject(obj, jsongenerator);
	//    8   16:aload           4
	//    9   18:aload_1         
	//   10   19:aload_2         
	//   11   20:invokevirtual   #98  <Method void TypeSerializer.writeTypePrefixForObject(Object, JsonGenerator)>
		typeserializer.writeTypeSuffixForObject(obj, jsongenerator);
	//   12   23:aload           4
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:invokevirtual   #101 <Method void TypeSerializer.writeTypeSuffixForObject(Object, JsonGenerator)>
	//   16   30:return          
	}
}
