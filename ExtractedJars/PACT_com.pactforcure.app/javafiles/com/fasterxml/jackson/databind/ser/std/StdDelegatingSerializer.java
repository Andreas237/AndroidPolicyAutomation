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
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdSerializer

public class StdDelegatingSerializer extends StdSerializer
	implements ContextualSerializer, ResolvableSerializer, JsonFormatVisitable, SchemaAware
{

	public StdDelegatingSerializer(Converter converter)
	{
		super(java/lang/Object);
	//    0    0:aload_0         
	//    1    1:ldc1            #25  <Class Object>
	//    2    3:invokespecial   #28  <Method void StdSerializer(Class)>
		_converter = converter;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #30  <Field Converter _converter>
		_delegateType = null;
	//    6   11:aload_0         
	//    7   12:aconst_null     
	//    8   13:putfield        #32  <Field JavaType _delegateType>
		_delegateSerializer = null;
	//    9   16:aload_0         
	//   10   17:aconst_null     
	//   11   18:putfield        #34  <Field JsonSerializer _delegateSerializer>
	//   12   21:return          
	}

	public StdDelegatingSerializer(Converter converter, JavaType javatype, JsonSerializer jsonserializer)
	{
		super(javatype);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #41  <Method void StdSerializer(JavaType)>
		_converter = converter;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #30  <Field Converter _converter>
		_delegateType = javatype;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #32  <Field JavaType _delegateType>
		_delegateSerializer = jsonserializer;
	//    9   15:aload_0         
	//   10   16:aload_3         
	//   11   17:putfield        #34  <Field JsonSerializer _delegateSerializer>
	//   12   20:return          
	}

	public StdDelegatingSerializer(Class class1, Converter converter)
	{
		super(class1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #46  <Method void StdSerializer(Class, boolean)>
		_converter = converter;
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:putfield        #30  <Field Converter _converter>
		_delegateType = null;
	//    7   11:aload_0         
	//    8   12:aconst_null     
	//    9   13:putfield        #32  <Field JavaType _delegateType>
		_delegateSerializer = null;
	//   10   16:aload_0         
	//   11   17:aconst_null     
	//   12   18:putfield        #34  <Field JsonSerializer _delegateSerializer>
	//   13   21:return          
	}

	protected JsonSerializer _findSerializer(Object obj, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		return serializerprovider.findValueSerializer(obj.getClass());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #55  <Method Class Object.getClass()>
	//    3    5:invokevirtual   #61  <Method JsonSerializer SerializerProvider.findValueSerializer(Class)>
	//    4    8:areturn         
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		if(_delegateSerializer != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field JsonSerializer _delegateSerializer>
	//*   2    4:ifnull          16
			_delegateSerializer.acceptJsonFormatVisitor(jsonformatvisitorwrapper, javatype);
	//    3    7:aload_0         
	//    4    8:getfield        #34  <Field JsonSerializer _delegateSerializer>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #69  <Method void JsonSerializer.acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType)>
	//    8   16:return          
	}

	protected Object convertValue(Object obj)
	{
		return _converter.convert(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Converter _converter>
	//    2    4:aload_1         
	//    3    5:invokeinterface #76  <Method Object Converter.convert(Object)>
	//    4   10:areturn         
	}

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer2 = _delegateSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field JsonSerializer _delegateSerializer>
	//    2    4:astore          7
		JavaType javatype2 = _delegateType;
	//    3    6:aload_0         
	//    4    7:getfield        #32  <Field JavaType _delegateType>
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
	//   17   34:getfield        #30  <Field Converter _converter>
	//   18   37:aload_1         
	//   19   38:invokevirtual   #82  <Method com.fasterxml.jackson.databind.type.TypeFactory SerializerProvider.getTypeFactory()>
	//   20   41:invokeinterface #86  <Method JavaType Converter.getOutputType(com.fasterxml.jackson.databind.type.TypeFactory)>
	//   21   46:astore_3        
			jsonserializer1 = jsonserializer2;
	//   22   47:aload           7
	//   23   49:astore          4
			javatype1 = javatype;
	//   24   51:aload_3         
	//   25   52:astore          5
			if(!javatype.isJavaLangObject())
	//*  26   54:aload_3         
	//*  27   55:invokevirtual   #92  <Method boolean JavaType.isJavaLangObject()>
	//*  28   58:ifne            71
			{
				jsonserializer1 = serializerprovider.findValueSerializer(javatype);
	//   29   61:aload_1         
	//   30   62:aload_3         
	//   31   63:invokevirtual   #95  <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType)>
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
	//*  38   76:instanceof      #7   <Class ContextualSerializer>
	//*  39   79:ifeq            90
			jsonserializer = serializerprovider.handleSecondaryContextualization(jsonserializer1, beanproperty);
	//   40   82:aload_1         
	//   41   83:aload           4
	//   42   85:aload_2         
	//   43   86:invokevirtual   #99  <Method JsonSerializer SerializerProvider.handleSecondaryContextualization(JsonSerializer, BeanProperty)>
	//   44   89:astore_3        
		if(jsonserializer == _delegateSerializer && javatype1 == _delegateType)
	//*  45   90:aload_3         
	//*  46   91:aload_0         
	//*  47   92:getfield        #34  <Field JsonSerializer _delegateSerializer>
	//*  48   95:if_acmpne       109
	//*  49   98:aload           5
	//*  50  100:aload_0         
	//*  51  101:getfield        #32  <Field JavaType _delegateType>
	//*  52  104:if_acmpne       109
			return ((JsonSerializer) (this));
	//   53  107:aload_0         
	//   54  108:areturn         
		else
			return ((JsonSerializer) (withDelegate(_converter, javatype1, jsonserializer)));
	//   55  109:aload_0         
	//   56  110:aload_0         
	//   57  111:getfield        #30  <Field Converter _converter>
	//   58  114:aload           5
	//   59  116:aload_3         
	//   60  117:invokevirtual   #103 <Method StdDelegatingSerializer withDelegate(Converter, JavaType, JsonSerializer)>
	//   61  120:areturn         
	}

	protected Converter getConverter()
	{
		return _converter;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Converter _converter>
	//    2    4:areturn         
	}

	public JsonSerializer getDelegatee()
	{
		return _delegateSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field JsonSerializer _delegateSerializer>
	//    2    4:areturn         
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		throws JsonMappingException
	{
		if(_delegateSerializer instanceof SchemaAware)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field JsonSerializer _delegateSerializer>
	//*   2    4:instanceof      #13  <Class SchemaAware>
	//*   3    7:ifeq            25
			return ((SchemaAware)_delegateSerializer).getSchema(serializerprovider, type);
	//    4   10:aload_0         
	//    5   11:getfield        #34  <Field JsonSerializer _delegateSerializer>
	//    6   14:checkcast       #13  <Class SchemaAware>
	//    7   17:aload_1         
	//    8   18:aload_2         
	//    9   19:invokeinterface #114 <Method JsonNode SchemaAware.getSchema(SerializerProvider, Type)>
	//   10   24:areturn         
		else
			return super.getSchema(serializerprovider, type);
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:aload_2         
	//   14   28:invokespecial   #115 <Method JsonNode StdSerializer.getSchema(SerializerProvider, Type)>
	//   15   31:areturn         
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type, boolean flag)
		throws JsonMappingException
	{
		if(_delegateSerializer instanceof SchemaAware)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field JsonSerializer _delegateSerializer>
	//*   2    4:instanceof      #13  <Class SchemaAware>
	//*   3    7:ifeq            26
			return ((SchemaAware)_delegateSerializer).getSchema(serializerprovider, type, flag);
	//    4   10:aload_0         
	//    5   11:getfield        #34  <Field JsonSerializer _delegateSerializer>
	//    6   14:checkcast       #13  <Class SchemaAware>
	//    7   17:aload_1         
	//    8   18:aload_2         
	//    9   19:iload_3         
	//   10   20:invokeinterface #118 <Method JsonNode SchemaAware.getSchema(SerializerProvider, Type, boolean)>
	//   11   25:areturn         
		else
			return super.getSchema(serializerprovider, type);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:aload_2         
	//   15   29:invokespecial   #115 <Method JsonNode StdSerializer.getSchema(SerializerProvider, Type)>
	//   16   32:areturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		Object obj1 = convertValue(obj);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #122 <Method Object convertValue(Object)>
	//    3    5:astore_3        
		if(_delegateSerializer == null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #34  <Field JsonSerializer _delegateSerializer>
	//*   6   10:ifnonnull       21
			return obj == null;
	//    7   13:aload_2         
	//    8   14:ifnonnull       19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
		else
			return _delegateSerializer.isEmpty(serializerprovider, obj1);
	//   13   21:aload_0         
	//   14   22:getfield        #34  <Field JsonSerializer _delegateSerializer>
	//   15   25:aload_1         
	//   16   26:aload_3         
	//   17   27:invokevirtual   #124 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//   18   30:ireturn         
	}

	public boolean isEmpty(Object obj)
	{
		return isEmpty(((SerializerProvider) (null)), obj);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokevirtual   #127 <Method boolean isEmpty(SerializerProvider, Object)>
	//    4    6:ireturn         
	}

	public void resolve(SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		if(_delegateSerializer != null && (_delegateSerializer instanceof ResolvableSerializer))
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field JsonSerializer _delegateSerializer>
	//*   2    4:ifnull          30
	//*   3    7:aload_0         
	//*   4    8:getfield        #34  <Field JsonSerializer _delegateSerializer>
	//*   5   11:instanceof      #9   <Class ResolvableSerializer>
	//*   6   14:ifeq            30
			((ResolvableSerializer)_delegateSerializer).resolve(serializerprovider);
	//    7   17:aload_0         
	//    8   18:getfield        #34  <Field JsonSerializer _delegateSerializer>
	//    9   21:checkcast       #9   <Class ResolvableSerializer>
	//   10   24:aload_1         
	//   11   25:invokeinterface #132 <Method void ResolvableSerializer.resolve(SerializerProvider)>
	//   12   30:return          
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		Object obj1 = convertValue(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #122 <Method Object convertValue(Object)>
	//    3    5:astore          5
		if(obj1 == null)
	//*   4    7:aload           5
	//*   5    9:ifnonnull       18
		{
			serializerprovider.defaultSerializeNull(jsongenerator);
	//    6   12:aload_3         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #140 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
			return;
	//    9   17:return          
		}
		JsonSerializer jsonserializer = _delegateSerializer;
	//   10   18:aload_0         
	//   11   19:getfield        #34  <Field JsonSerializer _delegateSerializer>
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
	//   20   36:invokevirtual   #142 <Method JsonSerializer _findSerializer(Object, SerializerProvider)>
	//   21   39:astore_1        
		((JsonSerializer) (obj)).serialize(obj1, jsongenerator, serializerprovider);
	//   22   40:aload_1         
	//   23   41:aload           5
	//   24   43:aload_2         
	//   25   44:aload_3         
	//   26   45:invokevirtual   #144 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//   27   48:return          
	}

	public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		Object obj1 = convertValue(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #122 <Method Object convertValue(Object)>
	//    3    5:astore          7
		JsonSerializer jsonserializer1 = _delegateSerializer;
	//    4    7:aload_0         
	//    5    8:getfield        #34  <Field JsonSerializer _delegateSerializer>
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
	//   14   25:invokevirtual   #142 <Method JsonSerializer _findSerializer(Object, SerializerProvider)>
	//   15   28:astore          5
		jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, typeserializer);
	//   16   30:aload           5
	//   17   32:aload           7
	//   18   34:aload_2         
	//   19   35:aload_3         
	//   20   36:aload           4
	//   21   38:invokevirtual   #148 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
	//   22   41:return          
	}

	protected StdDelegatingSerializer withDelegate(Converter converter, JavaType javatype, JsonSerializer jsonserializer)
	{
		if(((Object)this).getClass() != com/fasterxml/jackson/databind/ser/std/StdDelegatingSerializer)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #55  <Method Class Object.getClass()>
	//*   2    4:ldc1            #2   <Class StdDelegatingSerializer>
	//*   3    6:if_acmpeq       47
			throw new IllegalStateException((new StringBuilder()).append("Sub-class ").append(((Object)this).getClass().getName()).append(" must override 'withDelegate'").toString());
	//    4    9:new             #150 <Class IllegalStateException>
	//    5   12:dup             
	//    6   13:new             #152 <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #155 <Method void StringBuilder()>
	//    9   20:ldc1            #157 <String "Sub-class ">
	//   10   22:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #55  <Method Class Object.getClass()>
	//   13   29:invokevirtual   #167 <Method String Class.getName()>
	//   14   32:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:ldc1            #169 <String " must override 'withDelegate'">
	//   16   37:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   17   40:invokevirtual   #172 <Method String StringBuilder.toString()>
	//   18   43:invokespecial   #175 <Method void IllegalStateException(String)>
	//   19   46:athrow          
		else
			return new StdDelegatingSerializer(converter, javatype, jsonserializer);
	//   20   47:new             #2   <Class StdDelegatingSerializer>
	//   21   50:dup             
	//   22   51:aload_1         
	//   23   52:aload_2         
	//   24   53:aload_3         
	//   25   54:invokespecial   #177 <Method void StdDelegatingSerializer(Converter, JavaType, JsonSerializer)>
	//   26   57:areturn         
	}

	protected final Converter _converter;
	protected final JsonSerializer _delegateSerializer;
	protected final JavaType _delegateType;
}
