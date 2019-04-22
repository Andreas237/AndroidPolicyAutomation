// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdSerializer

public class StdDelegatingSerializer extends StdSerializer
	implements JsonFormatVisitable, SchemaAware, ContextualSerializer, ResolvableSerializer
{

	public StdDelegatingSerializer(Converter converter, JavaType javatype, JsonSerializer jsonserializer)
	{
		super(javatype);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #26  <Method void StdSerializer(JavaType)>
		_converter = converter;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #28  <Field Converter _converter>
		_delegateType = javatype;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #30  <Field JavaType _delegateType>
		_delegateSerializer = jsonserializer;
	//    9   15:aload_0         
	//   10   16:aload_3         
	//   11   17:putfield        #32  <Field JsonSerializer _delegateSerializer>
	//   12   20:return          
	}

	protected JsonSerializer _findSerializer(Object obj, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		return serializerprovider.findValueSerializer(obj.getClass());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #45  <Method Class Object.getClass()>
	//    3    5:invokevirtual   #51  <Method JsonSerializer SerializerProvider.findValueSerializer(Class)>
	//    4    8:areturn         
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer = _delegateSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field JsonSerializer _delegateSerializer>
	//    2    4:astore_3        
		if(jsonserializer != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          15
			jsonserializer.acceptJsonFormatVisitor(jsonformatvisitorwrapper, javatype);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #59  <Method void JsonSerializer.acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType)>
	//    9   15:return          
	}

	protected Object convertValue(Object obj)
	{
		return _converter.convert(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Converter _converter>
	//    2    4:aload_1         
	//    3    5:invokeinterface #66  <Method Object Converter.convert(Object)>
	//    4   10:areturn         
	}

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer2 = _delegateSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field JsonSerializer _delegateSerializer>
	//    2    4:astore          7
		JavaType javatype2 = _delegateType;
	//    3    6:aload_0         
	//    4    7:getfield        #30  <Field JavaType _delegateType>
	//    5   10:astore          6
		JsonSerializer jsonserializer1 = jsonserializer2;
	//    6   12:aload           7
	//    7   14:astore          4
		JavaType javatype1 = javatype2;
	//    8   16:aload           6
	//    9   18:astore          5
		if(jsonserializer2 == null)
	//*  10   20:aload           7
	//*  11   22:ifnonnull       71
		{
			JavaType javatype = javatype2;
	//   12   25:aload           6
	//   13   27:astore_3        
			if(javatype2 == null)
	//*  14   28:aload           6
	//*  15   30:ifnonnull       47
				javatype = _converter.getOutputType(serializerprovider.getTypeFactory());
	//   16   33:aload_0         
	//   17   34:getfield        #28  <Field Converter _converter>
	//   18   37:aload_1         
	//   19   38:invokevirtual   #72  <Method com.fasterxml.jackson.databind.type.TypeFactory SerializerProvider.getTypeFactory()>
	//   20   41:invokeinterface #76  <Method JavaType Converter.getOutputType(com.fasterxml.jackson.databind.type.TypeFactory)>
	//   21   46:astore_3        
			jsonserializer1 = jsonserializer2;
	//   22   47:aload           7
	//   23   49:astore          4
			javatype1 = javatype;
	//   24   51:aload_3         
	//   25   52:astore          5
			if(!javatype.isJavaLangObject())
	//*  26   54:aload_3         
	//*  27   55:invokevirtual   #82  <Method boolean JavaType.isJavaLangObject()>
	//*  28   58:ifne            71
			{
				jsonserializer1 = serializerprovider.findValueSerializer(javatype);
	//   29   61:aload_1         
	//   30   62:aload_3         
	//   31   63:invokevirtual   #85  <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType)>
	//   32   66:astore          4
				javatype1 = javatype;
	//   33   68:aload_3         
	//   34   69:astore          5
			}
		}
		JsonSerializer jsonserializer = jsonserializer1;
	//   35   71:aload           4
	//   36   73:astore_3        
		if(jsonserializer1 instanceof ContextualSerializer)
	//*  37   74:aload           4
	//*  38   76:instanceof      #11  <Class ContextualSerializer>
	//*  39   79:ifeq            90
			jsonserializer = serializerprovider.handleSecondaryContextualization(jsonserializer1, beanproperty);
	//   40   82:aload_1         
	//   41   83:aload           4
	//   42   85:aload_2         
	//   43   86:invokevirtual   #89  <Method JsonSerializer SerializerProvider.handleSecondaryContextualization(JsonSerializer, BeanProperty)>
	//   44   89:astore_3        
		if(jsonserializer == _delegateSerializer && javatype1 == _delegateType)
	//*  45   90:aload_3         
	//*  46   91:aload_0         
	//*  47   92:getfield        #32  <Field JsonSerializer _delegateSerializer>
	//*  48   95:if_acmpne       109
	//*  49   98:aload           5
	//*  50  100:aload_0         
	//*  51  101:getfield        #30  <Field JavaType _delegateType>
	//*  52  104:if_acmpne       109
			return ((JsonSerializer) (this));
	//   53  107:aload_0         
	//   54  108:areturn         
		else
			return ((JsonSerializer) (withDelegate(_converter, javatype1, jsonserializer)));
	//   55  109:aload_0         
	//   56  110:aload_0         
	//   57  111:getfield        #28  <Field Converter _converter>
	//   58  114:aload           5
	//   59  116:aload_3         
	//   60  117:invokevirtual   #93  <Method StdDelegatingSerializer withDelegate(Converter, JavaType, JsonSerializer)>
	//   61  120:areturn         
	}

	public JsonSerializer getDelegatee()
	{
		return _delegateSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field JsonSerializer _delegateSerializer>
	//    2    4:areturn         
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer = _delegateSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field JsonSerializer _delegateSerializer>
	//    2    4:astore_3        
		if(jsonserializer instanceof SchemaAware)
	//*   3    5:aload_3         
	//*   4    6:instanceof      #9   <Class SchemaAware>
	//*   5    9:ifeq            24
			return ((SchemaAware)jsonserializer).getSchema(serializerprovider, type);
	//    6   12:aload_3         
	//    7   13:checkcast       #9   <Class SchemaAware>
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokeinterface #101 <Method JsonNode SchemaAware.getSchema(SerializerProvider, Type)>
	//   11   23:areturn         
		else
			return super.getSchema(serializerprovider, type);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:invokespecial   #102 <Method JsonNode StdSerializer.getSchema(SerializerProvider, Type)>
	//   16   30:areturn         
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type, boolean flag)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer = _delegateSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field JsonSerializer _delegateSerializer>
	//    2    4:astore          4
		if(jsonserializer instanceof SchemaAware)
	//*   3    6:aload           4
	//*   4    8:instanceof      #9   <Class SchemaAware>
	//*   5   11:ifeq            28
			return ((SchemaAware)jsonserializer).getSchema(serializerprovider, type, flag);
	//    6   14:aload           4
	//    7   16:checkcast       #9   <Class SchemaAware>
	//    8   19:aload_1         
	//    9   20:aload_2         
	//   10   21:iload_3         
	//   11   22:invokeinterface #105 <Method JsonNode SchemaAware.getSchema(SerializerProvider, Type, boolean)>
	//   12   27:areturn         
		else
			return super.getSchema(serializerprovider, type);
	//   13   28:aload_0         
	//   14   29:aload_1         
	//   15   30:aload_2         
	//   16   31:invokespecial   #102 <Method JsonNode StdSerializer.getSchema(SerializerProvider, Type)>
	//   17   34:areturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		Object obj1 = convertValue(obj);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #109 <Method Object convertValue(Object)>
	//    3    5:astore_3        
		if(obj1 == null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       12
			return true;
	//    6   10:iconst_1        
	//    7   11:ireturn         
		JsonSerializer jsonserializer = _delegateSerializer;
	//    8   12:aload_0         
	//    9   13:getfield        #32  <Field JsonSerializer _delegateSerializer>
	//   10   16:astore          4
		if(jsonserializer == null)
	//*  11   18:aload           4
	//*  12   20:ifnonnull       31
			return obj == null;
	//   13   23:aload_2         
	//   14   24:ifnonnull       29
	//   15   27:iconst_1        
	//   16   28:ireturn         
	//   17   29:iconst_0        
	//   18   30:ireturn         
		else
			return jsonserializer.isEmpty(serializerprovider, obj1);
	//   19   31:aload           4
	//   20   33:aload_1         
	//   21   34:aload_3         
	//   22   35:invokevirtual   #111 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//   23   38:ireturn         
	}

	public void resolve(SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer = _delegateSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field JsonSerializer _delegateSerializer>
	//    2    4:astore_2        
		if(jsonserializer != null && (jsonserializer instanceof ResolvableSerializer))
	//*   3    5:aload_2         
	//*   4    6:ifnull          26
	//*   5    9:aload_2         
	//*   6   10:instanceof      #13  <Class ResolvableSerializer>
	//*   7   13:ifeq            26
			((ResolvableSerializer)jsonserializer).resolve(serializerprovider);
	//    8   16:aload_2         
	//    9   17:checkcast       #13  <Class ResolvableSerializer>
	//   10   20:aload_1         
	//   11   21:invokeinterface #115 <Method void ResolvableSerializer.resolve(SerializerProvider)>
	//   12   26:return          
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		Object obj1 = convertValue(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #109 <Method Object convertValue(Object)>
	//    3    5:astore          5
		if(obj1 == null)
	//*   4    7:aload           5
	//*   5    9:ifnonnull       18
		{
			serializerprovider.defaultSerializeNull(jsongenerator);
	//    6   12:aload_3         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #123 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
			return;
	//    9   17:return          
		}
		JsonSerializer jsonserializer = _delegateSerializer;
	//   10   18:aload_0         
	//   11   19:getfield        #32  <Field JsonSerializer _delegateSerializer>
	//   12   22:astore          4
		obj = ((Object) (jsonserializer));
	//   13   24:aload           4
	//   14   26:astore_1        
		if(jsonserializer == null)
	//*  15   27:aload           4
	//*  16   29:ifnonnull       40
			obj = ((Object) (_findSerializer(obj1, serializerprovider)));
	//   17   32:aload_0         
	//   18   33:aload           5
	//   19   35:aload_3         
	//   20   36:invokevirtual   #125 <Method JsonSerializer _findSerializer(Object, SerializerProvider)>
	//   21   39:astore_1        
		((JsonSerializer) (obj)).serialize(obj1, jsongenerator, serializerprovider);
	//   22   40:aload_1         
	//   23   41:aload           5
	//   24   43:aload_2         
	//   25   44:aload_3         
	//   26   45:invokevirtual   #127 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//   27   48:return          
	}

	public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		Object obj1 = convertValue(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #109 <Method Object convertValue(Object)>
	//    3    5:astore          7
		JsonSerializer jsonserializer1 = _delegateSerializer;
	//    4    7:aload_0         
	//    5    8:getfield        #32  <Field JsonSerializer _delegateSerializer>
	//    6   11:astore          6
		JsonSerializer jsonserializer = jsonserializer1;
	//    7   13:aload           6
	//    8   15:astore          5
		if(jsonserializer1 == null)
	//*   9   17:aload           6
	//*  10   19:ifnonnull       30
			jsonserializer = _findSerializer(obj, serializerprovider);
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:aload_3         
	//   14   25:invokevirtual   #125 <Method JsonSerializer _findSerializer(Object, SerializerProvider)>
	//   15   28:astore          5
		jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, typeserializer);
	//   16   30:aload           5
	//   17   32:aload           7
	//   18   34:aload_2         
	//   19   35:aload_3         
	//   20   36:aload           4
	//   21   38:invokevirtual   #131 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
	//   22   41:return          
	}

	protected StdDelegatingSerializer withDelegate(Converter converter, JavaType javatype, JsonSerializer jsonserializer)
	{
		ClassUtil.verifyMustOverride(com/fasterxml/jackson/databind/ser/std/StdDelegatingSerializer, ((Object) (this)), "withDelegate");
	//    0    0:ldc1            #2   <Class StdDelegatingSerializer>
	//    1    2:aload_0         
	//    2    3:ldc1            #132 <String "withDelegate">
	//    3    5:invokestatic    #138 <Method void ClassUtil.verifyMustOverride(Class, Object, String)>
		return new StdDelegatingSerializer(converter, javatype, jsonserializer);
	//    4    8:new             #2   <Class StdDelegatingSerializer>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:invokespecial   #140 <Method void StdDelegatingSerializer(Converter, JavaType, JsonSerializer)>
	//   10   18:areturn         
	}

	protected final Converter _converter;
	protected final JsonSerializer _delegateSerializer;
	protected final JavaType _delegateType;
}
