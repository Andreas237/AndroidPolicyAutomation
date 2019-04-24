// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

public class JSONPObject
	implements JsonSerializable
{

	public JSONPObject(String s, Object obj)
	{
		this(s, obj, (JavaType)null);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:checkcast       #16  <Class JavaType>
	//    5    7:invokespecial   #19  <Method void JSONPObject(String, Object, JavaType)>
	//    6   10:return          
	}

	public JSONPObject(String s, Object obj, JavaType javatype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		_function = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field String _function>
		_value = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field Object _value>
		_serializationType = javatype;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field JavaType _serializationType>
	//   11   19:return          
	}

	public String getFunction()
	{
		return _function;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String _function>
	//    2    4:areturn         
	}

	public JavaType getSerializationType()
	{
		return _serializationType;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field JavaType _serializationType>
	//    2    4:areturn         
	}

	public Object getValue()
	{
		return _value;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Object _value>
	//    2    4:areturn         
	}

	public void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonProcessingException
	{
		jsongenerator.writeRaw(_function);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #25  <Field String _function>
	//    3    5:invokevirtual   #47  <Method void JsonGenerator.writeRaw(String)>
		jsongenerator.writeRaw('(');
	//    4    8:aload_1         
	//    5    9:bipush          40
	//    6   11:invokevirtual   #50  <Method void JsonGenerator.writeRaw(char)>
		if(_value == null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #27  <Field Object _value>
	//*   9   18:ifnonnull       33
			serializerprovider.defaultSerializeNull(jsongenerator);
	//   10   21:aload_2         
	//   11   22:aload_1         
	//   12   23:invokevirtual   #56  <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
		else
	//*  13   26:aload_1         
	//*  14   27:bipush          41
	//*  15   29:invokevirtual   #50  <Method void JsonGenerator.writeRaw(char)>
	//*  16   32:return          
		if(_serializationType != null)
	//*  17   33:aload_0         
	//*  18   34:getfield        #29  <Field JavaType _serializationType>
	//*  19   37:ifnull          62
			serializerprovider.findTypedValueSerializer(_serializationType, true, ((com.fasterxml.jackson.databind.BeanProperty) (null))).serialize(_value, jsongenerator, serializerprovider);
	//   20   40:aload_2         
	//   21   41:aload_0         
	//   22   42:getfield        #29  <Field JavaType _serializationType>
	//   23   45:iconst_1        
	//   24   46:aconst_null     
	//   25   47:invokevirtual   #60  <Method JsonSerializer SerializerProvider.findTypedValueSerializer(JavaType, boolean, com.fasterxml.jackson.databind.BeanProperty)>
	//   26   50:aload_0         
	//   27   51:getfield        #27  <Field Object _value>
	//   28   54:aload_1         
	//   29   55:aload_2         
	//   30   56:invokevirtual   #65  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
		else
	//*  31   59:goto            26
			serializerprovider.findTypedValueSerializer(_value.getClass(), true, ((com.fasterxml.jackson.databind.BeanProperty) (null))).serialize(_value, jsongenerator, serializerprovider);
	//   32   62:aload_2         
	//   33   63:aload_0         
	//   34   64:getfield        #27  <Field Object _value>
	//   35   67:invokevirtual   #69  <Method Class Object.getClass()>
	//   36   70:iconst_1        
	//   37   71:aconst_null     
	//   38   72:invokevirtual   #72  <Method JsonSerializer SerializerProvider.findTypedValueSerializer(Class, boolean, com.fasterxml.jackson.databind.BeanProperty)>
	//   39   75:aload_0         
	//   40   76:getfield        #27  <Field Object _value>
	//   41   79:aload_1         
	//   42   80:aload_2         
	//   43   81:invokevirtual   #65  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
		jsongenerator.writeRaw(')');
	//*  44   84:goto            26
	}

	public void serializeWithType(JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException, JsonProcessingException
	{
		serialize(jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #77  <Method void serialize(JsonGenerator, SerializerProvider)>
	//    4    6:return          
	}

	protected final String _function;
	protected final JavaType _serializationType;
	protected final Object _value;
}
