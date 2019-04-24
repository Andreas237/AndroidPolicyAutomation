// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

public class JSONWrappedObject
	implements JsonSerializable
{

	public JSONWrappedObject(String s, String s1, Object obj)
	{
		this(s, s1, obj, (JavaType)null);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:checkcast       #17  <Class JavaType>
	//    6    8:invokespecial   #20  <Method void JSONWrappedObject(String, String, Object, JavaType)>
	//    7   11:return          
	}

	public JSONWrappedObject(String s, String s1, Object obj, JavaType javatype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		_prefix = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field String _prefix>
		_suffix = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field String _suffix>
		_value = obj;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #30  <Field Object _value>
		_serializationType = javatype;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #32  <Field JavaType _serializationType>
	//   14   25:return          
	}

	public String getPrefix()
	{
		return _prefix;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String _prefix>
	//    2    4:areturn         
	}

	public JavaType getSerializationType()
	{
		return _serializationType;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field JavaType _serializationType>
	//    2    4:areturn         
	}

	public String getSuffix()
	{
		return _suffix;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String _suffix>
	//    2    4:areturn         
	}

	public Object getValue()
	{
		return _value;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Object _value>
	//    2    4:areturn         
	}

	public void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonProcessingException
	{
		if(_prefix != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field String _prefix>
	//*   2    4:ifnull          15
			jsongenerator.writeRaw(_prefix);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field String _prefix>
	//    6   12:invokevirtual   #51  <Method void JsonGenerator.writeRaw(String)>
		if(_value == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #30  <Field Object _value>
	//*   9   19:ifnonnull       43
			serializerprovider.defaultSerializeNull(jsongenerator);
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #57  <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
		else
	//*  13   27:aload_0         
	//*  14   28:getfield        #28  <Field String _suffix>
	//*  15   31:ifnull          42
	//*  16   34:aload_1         
	//*  17   35:aload_0         
	//*  18   36:getfield        #28  <Field String _suffix>
	//*  19   39:invokevirtual   #51  <Method void JsonGenerator.writeRaw(String)>
	//*  20   42:return          
		if(_serializationType != null)
	//*  21   43:aload_0         
	//*  22   44:getfield        #32  <Field JavaType _serializationType>
	//*  23   47:ifnull          72
			serializerprovider.findTypedValueSerializer(_serializationType, true, ((com.fasterxml.jackson.databind.BeanProperty) (null))).serialize(_value, jsongenerator, serializerprovider);
	//   24   50:aload_2         
	//   25   51:aload_0         
	//   26   52:getfield        #32  <Field JavaType _serializationType>
	//   27   55:iconst_1        
	//   28   56:aconst_null     
	//   29   57:invokevirtual   #61  <Method JsonSerializer SerializerProvider.findTypedValueSerializer(JavaType, boolean, com.fasterxml.jackson.databind.BeanProperty)>
	//   30   60:aload_0         
	//   31   61:getfield        #30  <Field Object _value>
	//   32   64:aload_1         
	//   33   65:aload_2         
	//   34   66:invokevirtual   #66  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
		else
	//*  35   69:goto            27
			serializerprovider.findTypedValueSerializer(_value.getClass(), true, ((com.fasterxml.jackson.databind.BeanProperty) (null))).serialize(_value, jsongenerator, serializerprovider);
	//   36   72:aload_2         
	//   37   73:aload_0         
	//   38   74:getfield        #30  <Field Object _value>
	//   39   77:invokevirtual   #70  <Method Class Object.getClass()>
	//   40   80:iconst_1        
	//   41   81:aconst_null     
	//   42   82:invokevirtual   #73  <Method JsonSerializer SerializerProvider.findTypedValueSerializer(Class, boolean, com.fasterxml.jackson.databind.BeanProperty)>
	//   43   85:aload_0         
	//   44   86:getfield        #30  <Field Object _value>
	//   45   89:aload_1         
	//   46   90:aload_2         
	//   47   91:invokevirtual   #66  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
		if(_suffix != null)
			jsongenerator.writeRaw(_suffix);
	//*  48   94:goto            27
	}

	public void serializeWithType(JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException, JsonProcessingException
	{
		serialize(jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #78  <Method void serialize(JsonGenerator, SerializerProvider)>
	//    4    6:return          
	}

	protected final String _prefix;
	protected final JavaType _serializationType;
	protected final String _suffix;
	protected final Object _value;
}
