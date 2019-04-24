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
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		int j = as.length;
	//    2    3:aload_1         
	//    3    4:arraylength     
	//    4    5:istore          6
		while(i < j) 
	//*   5    7:iload           5
	//*   6    9:iload           6
	//*   7   11:icmpge          49
		{
			if(as[i] == null)
	//*   8   14:aload_1         
	//*   9   15:iload           5
	//*  10   17:aaload          
	//*  11   18:ifnonnull       35
				serializerprovider.defaultSerializeNull(jsongenerator);
	//   12   21:aload_3         
	//   13   22:aload_2         
	//   14   23:invokevirtual   #60  <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
			else
	//*  15   26:iload           5
	//*  16   28:iconst_1        
	//*  17   29:iadd            
	//*  18   30:istore          5
	//*  19   32:goto            7
				jsonserializer.serialize(((Object) (as[i])), jsongenerator, serializerprovider);
	//   20   35:aload           4
	//   21   37:aload_1         
	//   22   38:iload           5
	//   23   40:aaload          
	//   24   41:aload_2         
	//   25   42:aload_3         
	//   26   43:invokevirtual   #66  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			i++;
		}
	//*  27   46:goto            26
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
		JsonSerializer jsonserializer = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		Object obj = ((Object) (jsonserializer));
	//    2    3:aload           4
	//    3    5:astore_3        
		if(beanproperty != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          58
		{
			Object obj1 = ((Object) (serializerprovider.getAnnotationIntrospector()));
	//    6   10:aload_1         
	//    7   11:invokevirtual   #96  <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//    8   14:astore          6
			com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedmember = beanproperty.getMember();
	//    9   16:aload_2         
	//   10   17:invokeinterface #102 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//   11   22:astore          5
			obj = ((Object) (jsonserializer));
	//   12   24:aload           4
	//   13   26:astore_3        
			if(annotatedmember != null)
	//*  14   27:aload           5
	//*  15   29:ifnull          58
			{
				obj1 = ((AnnotationIntrospector) (obj1)).findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated) (annotatedmember)));
	//   16   32:aload           6
	//   17   34:aload           5
	//   18   36:invokevirtual   #108 <Method Object AnnotationIntrospector.findContentSerializer(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   19   39:astore          6
				obj = ((Object) (jsonserializer));
	//   20   41:aload           4
	//   21   43:astore_3        
				if(obj1 != null)
	//*  22   44:aload           6
	//*  23   46:ifnull          58
					obj = ((Object) (serializerprovider.serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (annotatedmember)), obj1)));
	//   24   49:aload_1         
	//   25   50:aload           5
	//   26   52:aload           6
	//   27   54:invokevirtual   #112 <Method JsonSerializer SerializerProvider.serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, Object)>
	//   28   57:astore_3        
			}
		}
		Boolean boolean1 = findFormatFeature(serializerprovider, beanproperty, [Ljava/lang/String;, com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
	//   29   58:aload_0         
	//   30   59:aload_1         
	//   31   60:aload_2         
	//   32   61:ldc1            #39  <Class String[]>
	//   33   63:getstatic       #118 <Field com.fasterxml.jackson.annotation.JsonFormat$Feature com.fasterxml.jackson.annotation.JsonFormat$Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//   34   66:invokevirtual   #122 <Method Boolean findFormatFeature(SerializerProvider, BeanProperty, Class, com.fasterxml.jackson.annotation.JsonFormat$Feature)>
	//   35   69:astore          5
		jsonserializer = ((JsonSerializer) (obj));
	//   36   71:aload_3         
	//   37   72:astore          4
		if(obj == null)
	//*  38   74:aload_3         
	//*  39   75:ifnonnull       84
			jsonserializer = _elementSerializer;
	//   40   78:aload_0         
	//   41   79:getfield        #44  <Field JsonSerializer _elementSerializer>
	//   42   82:astore          4
		obj = ((Object) (findConvertingContentSerializer(serializerprovider, beanproperty, jsonserializer)));
	//   43   84:aload_0         
	//   44   85:aload_1         
	//   45   86:aload_2         
	//   46   87:aload           4
	//   47   89:invokevirtual   #126 <Method JsonSerializer findConvertingContentSerializer(SerializerProvider, BeanProperty, JsonSerializer)>
	//   48   92:astore_3        
		if(obj == null)
	//*  49   93:aload_3         
	//*  50   94:ifnonnull       136
			serializerprovider = ((SerializerProvider) (serializerprovider.findValueSerializer(java/lang/String, beanproperty)));
	//   51   97:aload_1         
	//   52   98:ldc1            #25  <Class String>
	//   53  100:aload_2         
	//   54  101:invokevirtual   #130 <Method JsonSerializer SerializerProvider.findValueSerializer(Class, BeanProperty)>
	//   55  104:astore_1        
		else
	//*  56  105:aload_1         
	//*  57  106:astore_3        
	//*  58  107:aload_0         
	//*  59  108:aload_1         
	//*  60  109:invokevirtual   #134 <Method boolean isDefaultSerializer(JsonSerializer)>
	//*  61  112:ifeq            117
	//*  62  115:aconst_null     
	//*  63  116:astore_3        
	//*  64  117:aload_3         
	//*  65  118:aload_0         
	//*  66  119:getfield        #44  <Field JsonSerializer _elementSerializer>
	//*  67  122:if_acmpne       146
	//*  68  125:aload           5
	//*  69  127:aload_0         
	//*  70  128:getfield        #138 <Field Boolean _unwrapSingle>
	//*  71  131:if_acmpne       146
	//*  72  134:aload_0         
	//*  73  135:areturn         
			serializerprovider = ((SerializerProvider) (serializerprovider.handleSecondaryContextualization(((JsonSerializer) (obj)), beanproperty)));
	//   74  136:aload_1         
	//   75  137:aload_3         
	//   76  138:aload_2         
	//   77  139:invokevirtual   #142 <Method JsonSerializer SerializerProvider.handleSecondaryContextualization(JsonSerializer, BeanProperty)>
	//   78  142:astore_1        
		obj = ((Object) (serializerprovider));
		if(isDefaultSerializer(((JsonSerializer) (serializerprovider))))
			obj = null;
		if(obj == _elementSerializer && boolean1 == _unwrapSingle)
			return ((JsonSerializer) (this));
		else
	//*  79  143:goto            105
			return ((JsonSerializer) (new StringArraySerializer(this, beanproperty, ((JsonSerializer) (obj)), boolean1)));
	//   80  146:new             #2   <Class StringArraySerializer>
	//   81  149:dup             
	//   82  150:aload_0         
	//   83  151:aload_2         
	//   84  152:aload_3         
	//   85  153:aload           5
	//   86  155:invokespecial   #72  <Method void StringArraySerializer(StringArraySerializer, BeanProperty, JsonSerializer, Boolean)>
	//   87  158:areturn         
	}

	public JsonSerializer getContentSerializer()
	{
		return _elementSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field JsonSerializer _elementSerializer>
	//    2    4:areturn         
	}

	public JavaType getContentType()
	{
		return VALUE_TYPE;
	//    0    0:getstatic       #31  <Field JavaType VALUE_TYPE>
	//    1    3:areturn         
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		return createSchemaNode("array", true).set("items", ((JsonNode) (createSchemaNode("string"))));
	//    0    0:aload_0         
	//    1    1:ldc1            #152 <String "array">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #156 <Method ObjectNode createSchemaNode(String, boolean)>
	//    4    7:ldc1            #158 <String "items">
	//    5    9:aload_0         
	//    6   10:ldc1            #160 <String "string">
	//    7   12:invokevirtual   #163 <Method ObjectNode createSchemaNode(String)>
	//    8   15:invokevirtual   #169 <Method JsonNode ObjectNode.set(String, JsonNode)>
	//    9   18:areturn         
	}

	public volatile boolean hasSingleElement(Object obj)
	{
		return hasSingleElement((String[])obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #39  <Class String[]>
	//    3    5:invokevirtual   #174 <Method boolean hasSingleElement(String[])>
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
	//    4    6:invokevirtual   #179 <Method boolean isEmpty(SerializerProvider, String[])>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, String as[])
	{
		return as == null || as.length == 0;
	//    0    0:aload_2         
	//    1    1:ifnull          9
	//    2    4:aload_2         
	//    3    5:arraylength     
	//    4    6:ifne            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
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
	//    5    7:invokevirtual   #182 <Method void serialize(String[], JsonGenerator, SerializerProvider)>
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
	//*  10   18:getstatic       #187 <Field SerializationFeature SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//*  11   21:invokevirtual   #191 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  12   24:ifne            37
	//*  13   27:aload_0         
	//*  14   28:getfield        #138 <Field Boolean _unwrapSingle>
	//*  15   31:getstatic       #196 <Field Boolean Boolean.TRUE>
	//*  16   34:if_acmpne       45
		{
			serializeContents(as, jsongenerator, serializerprovider);
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:aload_2         
	//   20   40:aload_3         
	//   21   41:invokevirtual   #199 <Method void serializeContents(String[], JsonGenerator, SerializerProvider)>
			return;
	//   22   44:return          
		} else
		{
			jsongenerator.writeStartArray(i);
	//   23   45:aload_2         
	//   24   46:iload           4
	//   25   48:invokevirtual   #205 <Method void JsonGenerator.writeStartArray(int)>
			serializeContents(as, jsongenerator, serializerprovider);
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:aload_2         
	//   29   54:aload_3         
	//   30   55:invokevirtual   #199 <Method void serializeContents(String[], JsonGenerator, SerializerProvider)>
			jsongenerator.writeEndArray();
	//   31   58:aload_2         
	//   32   59:invokevirtual   #208 <Method void JsonGenerator.writeEndArray()>
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
	//    5    7:invokevirtual   #199 <Method void serializeContents(String[], JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serializeContents(String as[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int j = as.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          5
		if(j != 0)
	//*   3    4:iload           5
	//*   4    6:ifne            10
	//*   5    9:return          
		{
			if(_elementSerializer != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #44  <Field JsonSerializer _elementSerializer>
	//*   8   14:ifnull          29
			{
				serializeContentsSlow(as, jsongenerator, serializerprovider, _elementSerializer);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:aload_3         
	//   13   21:aload_0         
	//   14   22:getfield        #44  <Field JsonSerializer _elementSerializer>
	//   15   25:invokespecial   #210 <Method void serializeContentsSlow(String[], JsonGenerator, SerializerProvider, JsonSerializer)>
				return;
	//   16   28:return          
			}
			int i = 0;
	//   17   29:iconst_0        
	//   18   30:istore          4
			while(i < j) 
	//*  19   32:iload           4
	//*  20   34:iload           5
	//*  21   36:icmpge          9
			{
				if(as[i] == null)
	//*  22   39:aload_1         
	//*  23   40:iload           4
	//*  24   42:aaload          
	//*  25   43:ifnonnull       59
					jsongenerator.writeNull();
	//   26   46:aload_2         
	//   27   47:invokevirtual   #213 <Method void JsonGenerator.writeNull()>
				else
	//*  28   50:iload           4
	//*  29   52:iconst_1        
	//*  30   53:iadd            
	//*  31   54:istore          4
	//*  32   56:goto            32
					jsongenerator.writeString(as[i]);
	//   33   59:aload_2         
	//   34   60:aload_1         
	//   35   61:iload           4
	//   36   63:aaload          
	//   37   64:invokevirtual   #217 <Method void JsonGenerator.writeString(String)>
				i++;
			}
		}
	//*  38   67:goto            50
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
