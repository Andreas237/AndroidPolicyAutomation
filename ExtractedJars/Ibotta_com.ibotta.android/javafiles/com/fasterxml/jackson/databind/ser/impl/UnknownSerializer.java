// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
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

	protected void failForEmpty(SerializerProvider serializerprovider, Object obj)
		throws JsonMappingException
	{
		serializerprovider.reportBadDefinition(handledType(), String.format("No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)", new Object[] {
			obj.getClass().getName()
		}));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #35  <Method Class handledType()>
	//    3    5:ldc1            #37  <String "No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)">
	//    4    7:iconst_1        
	//    5    8:anewarray       Object[]
	//    6   11:dup             
	//    7   12:iconst_0        
	//    8   13:aload_2         
	//    9   14:invokevirtual   #40  <Method Class Object.getClass()>
	//   10   17:invokevirtual   #46  <Method String Class.getName()>
	//   11   20:aastore         
	//   12   21:invokestatic    #52  <Method String String.format(String, Object[])>
	//   13   24:invokevirtual   #58  <Method Object SerializerProvider.reportBadDefinition(Class, String)>
	//   14   27:pop             
	//   15   28:return          
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
	//*   1    1:getstatic       #72  <Field SerializationFeature SerializationFeature.FAIL_ON_EMPTY_BEANS>
	//*   2    4:invokevirtual   #76  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   3    7:ifeq            16
			failForEmpty(serializerprovider, obj);
	//    4   10:aload_0         
	//    5   11:aload_3         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #78  <Method void failForEmpty(SerializerProvider, Object)>
		jsongenerator.writeStartObject();
	//    8   16:aload_2         
	//    9   17:invokevirtual   #83  <Method void JsonGenerator.writeStartObject()>
		jsongenerator.writeEndObject();
	//   10   20:aload_2         
	//   11   21:invokevirtual   #86  <Method void JsonGenerator.writeEndObject()>
	//   12   24:return          
	}

	public final void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		if(serializerprovider.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS))
	//*   0    0:aload_3         
	//*   1    1:getstatic       #72  <Field SerializationFeature SerializationFeature.FAIL_ON_EMPTY_BEANS>
	//*   2    4:invokevirtual   #76  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   3    7:ifeq            16
			failForEmpty(serializerprovider, obj);
	//    4   10:aload_0         
	//    5   11:aload_3         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #78  <Method void failForEmpty(SerializerProvider, Object)>
		typeserializer.writeTypeSuffix(jsongenerator, typeserializer.writeTypePrefix(jsongenerator, typeserializer.typeId(obj, JsonToken.START_OBJECT)));
	//    8   16:aload           4
	//    9   18:aload_2         
	//   10   19:aload           4
	//   11   21:aload_2         
	//   12   22:aload           4
	//   13   24:aload_1         
	//   14   25:getstatic       #94  <Field JsonToken JsonToken.START_OBJECT>
	//   15   28:invokevirtual   #100 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.typeId(Object, JsonToken)>
	//   16   31:invokevirtual   #104 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   17   34:invokevirtual   #107 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   18   37:pop             
	//   19   38:return          
	}
}
