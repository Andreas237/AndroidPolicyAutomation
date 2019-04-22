// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.ArraySerializerBase;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.lang.reflect.Type;

public class StringArraySerializer extends ArraySerializerBase
	implements ContextualSerializer
{

	protected StringArraySerializer()
	{
		super([Ljava/lang/String;);
	//    0    0:aload_0         
	//    1    1:ldc1            #39  <Class String[]>
	//    2    3:invokespecial   #42  <Method void ArraySerializerBase(Class)>
		_elementSerializer = null;
	//    3    6:aload_0         
	//    4    7:aconst_null     
	//    5    8:putfield        #44  <Field JsonSerializer _elementSerializer>
	//    6   11:return          
	}

	public StringArraySerializer(StringArraySerializer stringarrayserializer, BeanProperty beanproperty, JsonSerializer jsonserializer, Boolean boolean1)
	{
		super(((ArraySerializerBase) (stringarrayserializer)), beanproperty, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload           4
	//    4    5:invokespecial   #48  <Method void ArraySerializerBase(ArraySerializerBase, BeanProperty, Boolean)>
		_elementSerializer = jsonserializer;
	//    5    8:aload_0         
	//    6    9:aload_3         
	//    7   10:putfield        #44  <Field JsonSerializer _elementSerializer>
	//    8   13:return          
	}

	private void serializeContentsSlow(String as[], JsonGenerator jsongenerator, SerializerProvider serializerprovider, JsonSerializer jsonserializer)
		throws IOException
	{
		int j = as.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          6
		for(int i = 0; i < j; i++)
	//*   3    4:iconst_0        
	//*   4    5:istore          5
	//*   5    7:iload           5
	//*   6    9:iload           6
	//*   7   11:icmpge          49
			if(as[i] == null)
	//*   8   14:aload_1         
	//*   9   15:iload           5
	//*  10   17:aaload          
	//*  11   18:ifnonnull       29
				serializerprovider.defaultSerializeNull(jsongenerator);
	//   12   21:aload_3         
	//   13   22:aload_2         
	//   14   23:invokevirtual   #60  <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
			else
	//*  15   26:goto            40
				jsonserializer.serialize(((Object) (as[i])), jsongenerator, serializerprovider);
	//   16   29:aload           4
	//   17   31:aload_1         
	//   18   32:iload           5
	//   19   34:aaload          
	//   20   35:aload_2         
	//   21   36:aload_3         
	//   22   37:invokevirtual   #66  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>

	//   23   40:iload           5
	//   24   42:iconst_1        
	//   25   43:iadd            
	//   26   44:istore          5
	//*  27   46:goto            7
	//   28   49:return          
	}

	public JsonSerializer _withResolved(BeanProperty beanproperty, Boolean boolean1)
	{
		return ((JsonSerializer) (new StringArraySerializer(this, beanproperty, _elementSerializer, boolean1)));
	//    0    0:new             #2   <Class StringArraySerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #44  <Field JsonSerializer _elementSerializer>
	//    6   10:aload_2         
	//    7   11:invokespecial   #72  <Method void StringArraySerializer(StringArraySerializer, BeanProperty, JsonSerializer, Boolean)>
	//    8   14:areturn         
	}

	public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
	{
		return ((ContainerSerializer) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		visitArrayFormat(jsonformatvisitorwrapper, javatype, JsonFormatTypes.STRING);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #86  <Field JsonFormatTypes JsonFormatTypes.STRING>
	//    4    6:invokevirtual   #90  <Method void visitArrayFormat(JsonFormatVisitorWrapper, JavaType, JsonFormatTypes)>
	//    5    9:return          
	}

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj;
label0:
		{
			if(beanproperty != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          45
			{
				Object obj1 = ((Object) (serializerprovider.getAnnotationIntrospector()));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #96  <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//    4    8:astore          4
				obj = ((Object) (beanproperty.getMember()));
	//    5   10:aload_2         
	//    6   11:invokeinterface #102 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//    7   16:astore_3        
				if(obj != null)
	//*   8   17:aload_3         
	//*   9   18:ifnull          45
				{
					obj1 = ((AnnotationIntrospector) (obj1)).findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)));
	//   10   21:aload           4
	//   11   23:aload_3         
	//   12   24:invokevirtual   #108 <Method Object AnnotationIntrospector.findContentSerializer(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   13   27:astore          4
					if(obj1 != null)
	//*  14   29:aload           4
	//*  15   31:ifnull          45
					{
						obj = ((Object) (serializerprovider.serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)), obj1)));
	//   16   34:aload_1         
	//   17   35:aload_3         
	//   18   36:aload           4
	//   19   38:invokevirtual   #112 <Method JsonSerializer SerializerProvider.serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, Object)>
	//   20   41:astore_3        
						break label0;
	//   21   42:goto            47
					}
				}
			}
			obj = null;
	//   22   45:aconst_null     
	//   23   46:astore_3        
		}
		Boolean boolean1 = findFormatFeature(serializerprovider, beanproperty, [Ljava/lang/String;, com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
	//   24   47:aload_0         
	//   25   48:aload_1         
	//   26   49:aload_2         
	//   27   50:ldc1            #39  <Class String[]>
	//   28   52:getstatic       #118 <Field com.fasterxml.jackson.annotation.JsonFormat$Feature com.fasterxml.jackson.annotation.JsonFormat$Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//   29   55:invokevirtual   #122 <Method Boolean findFormatFeature(SerializerProvider, BeanProperty, Class, com.fasterxml.jackson.annotation.JsonFormat$Feature)>
	//   30   58:astore          5
		JsonSerializer jsonserializer = ((JsonSerializer) (obj));
	//   31   60:aload_3         
	//   32   61:astore          4
		if(obj == null)
	//*  33   63:aload_3         
	//*  34   64:ifnonnull       73
			jsonserializer = _elementSerializer;
	//   35   67:aload_0         
	//   36   68:getfield        #44  <Field JsonSerializer _elementSerializer>
	//   37   71:astore          4
		obj = ((Object) (findContextualConvertingSerializer(serializerprovider, beanproperty, jsonserializer)));
	//   38   73:aload_0         
	//   39   74:aload_1         
	//   40   75:aload_2         
	//   41   76:aload           4
	//   42   78:invokevirtual   #126 <Method JsonSerializer findContextualConvertingSerializer(SerializerProvider, BeanProperty, JsonSerializer)>
	//   43   81:astore_3        
		if(obj == null)
	//*  44   82:aload_3         
	//*  45   83:ifnonnull       97
			serializerprovider = ((SerializerProvider) (serializerprovider.findValueSerializer(java/lang/String, beanproperty)));
	//   46   86:aload_1         
	//   47   87:ldc1            #25  <Class String>
	//   48   89:aload_2         
	//   49   90:invokevirtual   #130 <Method JsonSerializer SerializerProvider.findValueSerializer(Class, BeanProperty)>
	//   50   93:astore_1        
		else
	//*  51   94:goto            99
			serializerprovider = ((SerializerProvider) (obj));
	//   52   97:aload_3         
	//   53   98:astore_1        
		obj = ((Object) (serializerprovider));
	//   54   99:aload_1         
	//   55  100:astore_3        
		if(isDefaultSerializer(((JsonSerializer) (serializerprovider))))
	//*  56  101:aload_0         
	//*  57  102:aload_1         
	//*  58  103:invokevirtual   #134 <Method boolean isDefaultSerializer(JsonSerializer)>
	//*  59  106:ifeq            111
			obj = null;
	//   60  109:aconst_null     
	//   61  110:astore_3        
		if(obj == _elementSerializer && boolean1 == _unwrapSingle)
	//*  62  111:aload_3         
	//*  63  112:aload_0         
	//*  64  113:getfield        #44  <Field JsonSerializer _elementSerializer>
	//*  65  116:if_acmpne       130
	//*  66  119:aload           5
	//*  67  121:aload_0         
	//*  68  122:getfield        #138 <Field Boolean _unwrapSingle>
	//*  69  125:if_acmpne       130
			return ((JsonSerializer) (this));
	//   70  128:aload_0         
	//   71  129:areturn         
		else
			return ((JsonSerializer) (new StringArraySerializer(this, beanproperty, ((JsonSerializer) (obj)), boolean1)));
	//   72  130:new             #2   <Class StringArraySerializer>
	//   73  133:dup             
	//   74  134:aload_0         
	//   75  135:aload_2         
	//   76  136:aload_3         
	//   77  137:aload           5
	//   78  139:invokespecial   #72  <Method void StringArraySerializer(StringArraySerializer, BeanProperty, JsonSerializer, Boolean)>
	//   79  142:areturn         
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		return createSchemaNode("array", true).set("items", ((JsonNode) (createSchemaNode("string"))));
	//    0    0:aload_0         
	//    1    1:ldc1            #143 <String "array">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #147 <Method ObjectNode createSchemaNode(String, boolean)>
	//    4    7:ldc1            #149 <String "items">
	//    5    9:aload_0         
	//    6   10:ldc1            #151 <String "string">
	//    7   12:invokevirtual   #154 <Method ObjectNode createSchemaNode(String)>
	//    8   15:invokevirtual   #160 <Method JsonNode ObjectNode.set(String, JsonNode)>
	//    9   18:areturn         
	}

	public volatile boolean hasSingleElement(Object obj)
	{
		return hasSingleElement((String[])obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #39  <Class String[]>
	//    3    5:invokevirtual   #165 <Method boolean hasSingleElement(String[])>
	//    4    8:ireturn         
	}

	public boolean hasSingleElement(String as[])
	{
		return as.length == 1;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:iconst_1        
	//    3    3:icmpne          8
	//    4    6:iconst_1        
	//    5    7:ireturn         
	//    6    8:iconst_0        
	//    7    9:ireturn         
	}

	public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return isEmpty(serializerprovider, (String[])obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #39  <Class String[]>
	//    4    6:invokevirtual   #170 <Method boolean isEmpty(SerializerProvider, String[])>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, String as[])
	{
		return as.length == 0;
	//    0    0:aload_2         
	//    1    1:arraylength     
	//    2    2:ifne            7
	//    3    5:iconst_1        
	//    4    6:ireturn         
	//    5    7:iconst_0        
	//    6    8:ireturn         
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((String[])obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #39  <Class String[]>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #173 <Method void serialize(String[], JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public final void serialize(String as[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int i = as.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          4
		if(i == 1 && (_unwrapSingle == null && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) || _unwrapSingle == Boolean.TRUE))
	//*   3    4:iload           4
	//*   4    6:iconst_1        
	//*   5    7:icmpne          45
	//*   6   10:aload_0         
	//*   7   11:getfield        #138 <Field Boolean _unwrapSingle>
	//*   8   14:ifnonnull       27
	//*   9   17:aload_3         
	//*  10   18:getstatic       #178 <Field SerializationFeature SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//*  11   21:invokevirtual   #182 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  12   24:ifne            37
	//*  13   27:aload_0         
	//*  14   28:getfield        #138 <Field Boolean _unwrapSingle>
	//*  15   31:getstatic       #187 <Field Boolean Boolean.TRUE>
	//*  16   34:if_acmpne       45
		{
			serializeContents(as, jsongenerator, serializerprovider);
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:aload_2         
	//   20   40:aload_3         
	//   21   41:invokevirtual   #190 <Method void serializeContents(String[], JsonGenerator, SerializerProvider)>
			return;
	//   22   44:return          
		} else
		{
			jsongenerator.writeStartArray(i);
	//   23   45:aload_2         
	//   24   46:iload           4
	//   25   48:invokevirtual   #196 <Method void JsonGenerator.writeStartArray(int)>
			serializeContents(as, jsongenerator, serializerprovider);
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:aload_2         
	//   29   54:aload_3         
	//   30   55:invokevirtual   #190 <Method void serializeContents(String[], JsonGenerator, SerializerProvider)>
			jsongenerator.writeEndArray();
	//   31   58:aload_2         
	//   32   59:invokevirtual   #199 <Method void JsonGenerator.writeEndArray()>
			return;
	//   33   62:return          
		}
	}

	public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serializeContents((String[])obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #39  <Class String[]>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #190 <Method void serializeContents(String[], JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serializeContents(String as[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int j = as.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          5
		if(j == 0)
	//*   3    4:iload           5
	//*   4    6:ifne            10
			return;
	//    5    9:return          
		JsonSerializer jsonserializer = _elementSerializer;
	//    6   10:aload_0         
	//    7   11:getfield        #44  <Field JsonSerializer _elementSerializer>
	//    8   14:astore          6
		if(jsonserializer != null)
	//*   9   16:aload           6
	//*  10   18:ifnull          31
		{
			serializeContentsSlow(as, jsongenerator, serializerprovider, jsonserializer);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:aload_3         
	//   15   25:aload           6
	//   16   27:invokespecial   #201 <Method void serializeContentsSlow(String[], JsonGenerator, SerializerProvider, JsonSerializer)>
			return;
	//   17   30:return          
		}
		for(int i = 0; i < j; i++)
	//*  18   31:iconst_0        
	//*  19   32:istore          4
	//*  20   34:iload           4
	//*  21   36:iload           5
	//*  22   38:icmpge          72
			if(as[i] == null)
	//*  23   41:aload_1         
	//*  24   42:iload           4
	//*  25   44:aaload          
	//*  26   45:ifnonnull       55
				jsongenerator.writeNull();
	//   27   48:aload_2         
	//   28   49:invokevirtual   #204 <Method void JsonGenerator.writeNull()>
			else
	//*  29   52:goto            63
				jsongenerator.writeString(as[i]);
	//   30   55:aload_2         
	//   31   56:aload_1         
	//   32   57:iload           4
	//   33   59:aaload          
	//   34   60:invokevirtual   #208 <Method void JsonGenerator.writeString(String)>

	//   35   63:iload           4
	//   36   65:iconst_1        
	//   37   66:iadd            
	//   38   67:istore          4
	//*  39   69:goto            34
	//   40   72:return          
	}

	private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(java/lang/String);
	public static final StringArraySerializer instance = new StringArraySerializer();
	protected final JsonSerializer _elementSerializer;

	static 
	{
	//    0    0:invokestatic    #23  <Method TypeFactory TypeFactory.defaultInstance()>
	//    1    3:ldc1            #25  <Class String>
	//    2    5:invokevirtual   #29  <Method JavaType TypeFactory.uncheckedSimpleType(Class)>
	//    3    8:putstatic       #31  <Field JavaType VALUE_TYPE>
	//    4   11:new             #2   <Class StringArraySerializer>
	//    5   14:dup             
	//    6   15:invokespecial   #34  <Method void StringArraySerializer()>
	//    7   18:putstatic       #36  <Field StringArraySerializer instance>
	//*   8   21:return          
	}
}
