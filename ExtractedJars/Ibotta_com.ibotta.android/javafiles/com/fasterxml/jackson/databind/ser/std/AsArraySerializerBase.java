// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import java.io.IOException;
import java.lang.reflect.Type;

public abstract class AsArraySerializerBase extends ContainerSerializer
	implements ContextualSerializer
{

	protected AsArraySerializerBase(AsArraySerializerBase asarrayserializerbase, BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, Boolean boolean1)
	{
		super(((ContainerSerializer) (asarrayserializerbase)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void ContainerSerializer(ContainerSerializer)>
		_elementType = asarrayserializerbase._elementType;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #29  <Field JavaType _elementType>
	//    6   10:putfield        #29  <Field JavaType _elementType>
		_staticTyping = asarrayserializerbase._staticTyping;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #31  <Field boolean _staticTyping>
	//   10   18:putfield        #31  <Field boolean _staticTyping>
		_valueTypeSerializer = typeserializer;
	//   11   21:aload_0         
	//   12   22:aload_3         
	//   13   23:putfield        #33  <Field TypeSerializer _valueTypeSerializer>
		_property = beanproperty;
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:putfield        #35  <Field BeanProperty _property>
		_elementSerializer = jsonserializer;
	//   17   31:aload_0         
	//   18   32:aload           4
	//   19   34:putfield        #37  <Field JsonSerializer _elementSerializer>
		_dynamicSerializers = asarrayserializerbase._dynamicSerializers;
	//   20   37:aload_0         
	//   21   38:aload_1         
	//   22   39:getfield        #39  <Field PropertySerializerMap _dynamicSerializers>
	//   23   42:putfield        #39  <Field PropertySerializerMap _dynamicSerializers>
		_unwrapSingle = boolean1;
	//   24   45:aload_0         
	//   25   46:aload           5
	//   26   48:putfield        #41  <Field Boolean _unwrapSingle>
	//   27   51:return          
	}

	protected AsArraySerializerBase(Class class1, JavaType javatype, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
	{
label0:
		{
			boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
			super(class1, false);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:iconst_0        
	//    5    6:invokespecial   #48  <Method void ContainerSerializer(Class, boolean)>
			_elementType = javatype;
	//    6    9:aload_0         
	//    7   10:aload_2         
	//    8   11:putfield        #29  <Field JavaType _elementType>
			if(!flag)
	//*   9   14:iload_3         
	//*  10   15:ifne            35
			{
				flag = flag1;
	//   11   18:iload           6
	//   12   20:istore_3        
				if(javatype == null)
					break label0;
	//   13   21:aload_2         
	//   14   22:ifnull          37
				flag = flag1;
	//   15   25:iload           6
	//   16   27:istore_3        
				if(!javatype.isFinal())
					break label0;
	//   17   28:aload_2         
	//   18   29:invokevirtual   #54  <Method boolean JavaType.isFinal()>
	//   19   32:ifeq            37
			}
			flag = true;
	//   20   35:iconst_1        
	//   21   36:istore_3        
		}
		_staticTyping = flag;
	//   22   37:aload_0         
	//   23   38:iload_3         
	//   24   39:putfield        #31  <Field boolean _staticTyping>
		_valueTypeSerializer = typeserializer;
	//   25   42:aload_0         
	//   26   43:aload           4
	//   27   45:putfield        #33  <Field TypeSerializer _valueTypeSerializer>
		_property = null;
	//   28   48:aload_0         
	//   29   49:aconst_null     
	//   30   50:putfield        #35  <Field BeanProperty _property>
		_elementSerializer = jsonserializer;
	//   31   53:aload_0         
	//   32   54:aload           5
	//   33   56:putfield        #37  <Field JsonSerializer _elementSerializer>
		_dynamicSerializers = PropertySerializerMap.emptyForProperties();
	//   34   59:aload_0         
	//   35   60:invokestatic    #60  <Method PropertySerializerMap PropertySerializerMap.emptyForProperties()>
	//   36   63:putfield        #39  <Field PropertySerializerMap _dynamicSerializers>
		_unwrapSingle = null;
	//   37   66:aload_0         
	//   38   67:aconst_null     
	//   39   68:putfield        #41  <Field Boolean _unwrapSingle>
	//   40   71:return          
	}

	protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, JavaType javatype, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		javatype = ((JavaType) (propertyserializermap.findAndAddSecondarySerializer(javatype, serializerprovider, _property)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload_0         
	//    4    4:getfield        #35  <Field BeanProperty _property>
	//    5    7:invokevirtual   #69  <Method com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.findAndAddSecondarySerializer(JavaType, SerializerProvider, BeanProperty)>
	//    6   10:astore_2        
		if(propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map)
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:getfield        #74  <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//*  10   16:if_acmpeq       27
			_dynamicSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:getfield        #74  <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//   14   24:putfield        #39  <Field PropertySerializerMap _dynamicSerializers>
		return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).serializer;
	//   15   27:aload_2         
	//   16   28:getfield        #77  <Field JsonSerializer com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.serializer>
	//   17   31:areturn         
	}

	protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, Class class1, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		class1 = ((Class) (propertyserializermap.findAndAddSecondarySerializer(class1, serializerprovider, _property)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload_0         
	//    4    4:getfield        #35  <Field BeanProperty _property>
	//    5    7:invokevirtual   #83  <Method com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.findAndAddSecondarySerializer(Class, SerializerProvider, BeanProperty)>
	//    6   10:astore_2        
		if(propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map)
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:getfield        #74  <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//*  10   16:if_acmpeq       27
			_dynamicSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:getfield        #74  <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//   14   24:putfield        #39  <Field PropertySerializerMap _dynamicSerializers>
		return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).serializer;
	//   15   27:aload_2         
	//   16   28:getfield        #77  <Field JsonSerializer com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.serializer>
	//   17   31:areturn         
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer1 = _elementSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field JsonSerializer _elementSerializer>
	//    2    4:astore          4
		JsonSerializer jsonserializer = jsonserializer1;
	//    3    6:aload           4
	//    4    8:astore_3        
		if(jsonserializer1 == null)
	//*   5    9:aload           4
	//*   6   11:ifnonnull       42
		{
			jsonserializer = jsonserializer1;
	//    7   14:aload           4
	//    8   16:astore_3        
			if(_elementType != null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #29  <Field JavaType _elementType>
	//*  11   21:ifnull          42
				jsonserializer = jsonformatvisitorwrapper.getProvider().findValueSerializer(_elementType, _property);
	//   12   24:aload_1         
	//   13   25:invokeinterface #92  <Method SerializerProvider JsonFormatVisitorWrapper.getProvider()>
	//   14   30:aload_0         
	//   15   31:getfield        #29  <Field JavaType _elementType>
	//   16   34:aload_0         
	//   17   35:getfield        #35  <Field BeanProperty _property>
	//   18   38:invokevirtual   #98  <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, BeanProperty)>
	//   19   41:astore_3        
		}
		visitArrayFormat(jsonformatvisitorwrapper, javatype, jsonserializer, _elementType);
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:aload_2         
	//   23   45:aload_3         
	//   24   46:aload_0         
	//   25   47:getfield        #29  <Field JavaType _elementType>
	//   26   50:invokevirtual   #102 <Method void visitArrayFormat(JsonFormatVisitorWrapper, JavaType, JsonSerializer, JavaType)>
	//   27   53:return          
	}

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj;
		TypeSerializer typeserializer;
		Boolean boolean1;
label0:
		{
			obj = ((Object) (_valueTypeSerializer));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field TypeSerializer _valueTypeSerializer>
	//    2    4:astore_3        
			typeserializer = ((TypeSerializer) (obj));
	//    3    5:aload_3         
	//    4    6:astore          4
			if(obj != null)
	//*   5    8:aload_3         
	//*   6    9:ifnull          19
				typeserializer = ((TypeSerializer) (obj)).forProperty(beanproperty);
	//    7   12:aload_3         
	//    8   13:aload_2         
	//    9   14:invokevirtual   #110 <Method TypeSerializer TypeSerializer.forProperty(BeanProperty)>
	//   10   17:astore          4
			boolean1 = null;
	//   11   19:aconst_null     
	//   12   20:astore          5
			if(beanproperty != null)
	//*  13   22:aload_2         
	//*  14   23:ifnull          67
			{
				Object obj1 = ((Object) (serializerprovider.getAnnotationIntrospector()));
	//   15   26:aload_1         
	//   16   27:invokevirtual   #114 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//   17   30:astore          6
				obj = ((Object) (beanproperty.getMember()));
	//   18   32:aload_2         
	//   19   33:invokeinterface #120 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//   20   38:astore_3        
				if(obj != null)
	//*  21   39:aload_3         
	//*  22   40:ifnull          67
				{
					obj1 = ((AnnotationIntrospector) (obj1)).findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)));
	//   23   43:aload           6
	//   24   45:aload_3         
	//   25   46:invokevirtual   #126 <Method Object AnnotationIntrospector.findContentSerializer(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   26   49:astore          6
					if(obj1 != null)
	//*  27   51:aload           6
	//*  28   53:ifnull          67
					{
						obj = ((Object) (serializerprovider.serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)), obj1)));
	//   29   56:aload_1         
	//   30   57:aload_3         
	//   31   58:aload           6
	//   32   60:invokevirtual   #130 <Method JsonSerializer SerializerProvider.serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, Object)>
	//   33   63:astore_3        
						break label0;
	//   34   64:goto            69
					}
				}
			}
			obj = null;
	//   35   67:aconst_null     
	//   36   68:astore_3        
		}
		Object obj2 = ((Object) (findFormatOverrides(serializerprovider, beanproperty, handledType())));
	//   37   69:aload_0         
	//   38   70:aload_1         
	//   39   71:aload_2         
	//   40   72:aload_0         
	//   41   73:invokevirtual   #134 <Method Class handledType()>
	//   42   76:invokevirtual   #138 <Method com.fasterxml.jackson.annotation.JsonFormat$Value findFormatOverrides(SerializerProvider, BeanProperty, Class)>
	//   43   79:astore          6
		if(obj2 != null)
	//*  44   81:aload           6
	//*  45   83:ifnull          96
			boolean1 = ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj2)).getFeature(com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
	//   46   86:aload           6
	//   47   88:getstatic       #144 <Field com.fasterxml.jackson.annotation.JsonFormat$Feature com.fasterxml.jackson.annotation.JsonFormat$Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//   48   91:invokevirtual   #150 <Method Boolean com.fasterxml.jackson.annotation.JsonFormat$Value.getFeature(com.fasterxml.jackson.annotation.JsonFormat$Feature)>
	//   49   94:astore          5
		obj2 = obj;
	//   50   96:aload_3         
	//   51   97:astore          6
		if(obj == null)
	//*  52   99:aload_3         
	//*  53  100:ifnonnull       109
			obj2 = ((Object) (_elementSerializer));
	//   54  103:aload_0         
	//   55  104:getfield        #37  <Field JsonSerializer _elementSerializer>
	//   56  107:astore          6
		obj2 = ((Object) (findContextualConvertingSerializer(serializerprovider, beanproperty, ((JsonSerializer) (obj2)))));
	//   57  109:aload_0         
	//   58  110:aload_1         
	//   59  111:aload_2         
	//   60  112:aload           6
	//   61  114:invokevirtual   #154 <Method JsonSerializer findContextualConvertingSerializer(SerializerProvider, BeanProperty, JsonSerializer)>
	//   62  117:astore          6
		obj = obj2;
	//   63  119:aload           6
	//   64  121:astore_3        
		if(obj2 == null)
	//*  65  122:aload           6
	//*  66  124:ifnonnull       172
		{
			JavaType javatype = _elementType;
	//   67  127:aload_0         
	//   68  128:getfield        #29  <Field JavaType _elementType>
	//   69  131:astore          7
			obj = obj2;
	//   70  133:aload           6
	//   71  135:astore_3        
			if(javatype != null)
	//*  72  136:aload           7
	//*  73  138:ifnull          172
			{
				obj = obj2;
	//   74  141:aload           6
	//   75  143:astore_3        
				if(_staticTyping)
	//*  76  144:aload_0         
	//*  77  145:getfield        #31  <Field boolean _staticTyping>
	//*  78  148:ifeq            172
				{
					obj = obj2;
	//   79  151:aload           6
	//   80  153:astore_3        
					if(!javatype.isJavaLangObject())
	//*  81  154:aload           7
	//*  82  156:invokevirtual   #157 <Method boolean JavaType.isJavaLangObject()>
	//*  83  159:ifne            172
						obj = ((Object) (serializerprovider.findValueSerializer(_elementType, beanproperty)));
	//   84  162:aload_1         
	//   85  163:aload_0         
	//   86  164:getfield        #29  <Field JavaType _elementType>
	//   87  167:aload_2         
	//   88  168:invokevirtual   #98  <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, BeanProperty)>
	//   89  171:astore_3        
				}
			}
		}
		if(obj == _elementSerializer && beanproperty == _property && _valueTypeSerializer == typeserializer && _unwrapSingle == boolean1)
	//*  90  172:aload_3         
	//*  91  173:aload_0         
	//*  92  174:getfield        #37  <Field JsonSerializer _elementSerializer>
	//*  93  177:if_acmpne       211
	//*  94  180:aload_2         
	//*  95  181:aload_0         
	//*  96  182:getfield        #35  <Field BeanProperty _property>
	//*  97  185:if_acmpne       211
	//*  98  188:aload_0         
	//*  99  189:getfield        #33  <Field TypeSerializer _valueTypeSerializer>
	//* 100  192:aload           4
	//* 101  194:if_acmpne       211
	//* 102  197:aload_0         
	//* 103  198:getfield        #41  <Field Boolean _unwrapSingle>
	//* 104  201:aload           5
	//* 105  203:if_acmpeq       209
	//* 106  206:goto            211
			return ((JsonSerializer) (this));
	//  107  209:aload_0         
	//  108  210:areturn         
		else
			return ((JsonSerializer) (withResolved(beanproperty, typeserializer, ((JsonSerializer) (obj)), boolean1)));
	//  109  211:aload_0         
	//  110  212:aload_2         
	//  111  213:aload           4
	//  112  215:aload_3         
	//  113  216:aload           5
	//  114  218:invokevirtual   #161 <Method AsArraySerializerBase withResolved(BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//  115  221:areturn         
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		throws JsonMappingException
	{
		ObjectNode objectnode = createSchemaNode("array", true);
	//    0    0:aload_0         
	//    1    1:ldc1            #166 <String "array">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #170 <Method ObjectNode createSchemaNode(String, boolean)>
	//    4    7:astore          4
		JsonSerializer jsonserializer = _elementSerializer;
	//    5    9:aload_0         
	//    6   10:getfield        #37  <Field JsonSerializer _elementSerializer>
	//    7   13:astore          5
		if(jsonserializer != null)
	//*   8   15:aload           5
	//*   9   17:ifnull          64
		{
			boolean flag = jsonserializer instanceof SchemaAware;
	//   10   20:aload           5
	//   11   22:instanceof      #172 <Class SchemaAware>
	//   12   25:istore_3        
			type = null;
	//   13   26:aconst_null     
	//   14   27:astore_2        
			if(flag)
	//*  15   28:iload_3         
	//*  16   29:ifeq            45
				type = ((Type) (((SchemaAware)jsonserializer).getSchema(serializerprovider, ((Type) (null)))));
	//   17   32:aload           5
	//   18   34:checkcast       #172 <Class SchemaAware>
	//   19   37:aload_1         
	//   20   38:aconst_null     
	//   21   39:invokeinterface #174 <Method JsonNode SchemaAware.getSchema(SerializerProvider, Type)>
	//   22   44:astore_2        
			serializerprovider = ((SerializerProvider) (type));
	//   23   45:aload_2         
	//   24   46:astore_1        
			if(type == null)
	//*  25   47:aload_2         
	//*  26   48:ifnonnull       55
				serializerprovider = ((SerializerProvider) (JsonSchema.getDefaultSchemaNode()));
	//   27   51:invokestatic    #180 <Method JsonNode JsonSchema.getDefaultSchemaNode()>
	//   28   54:astore_1        
			objectnode.set("items", ((JsonNode) (serializerprovider)));
	//   29   55:aload           4
	//   30   57:ldc1            #182 <String "items">
	//   31   59:aload_1         
	//   32   60:invokevirtual   #188 <Method JsonNode ObjectNode.set(String, JsonNode)>
	//   33   63:pop             
		}
		return ((JsonNode) (objectnode));
	//   34   64:aload           4
	//   35   66:areturn         
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && hasSingleElement(obj))
	//*   0    0:aload_3         
	//*   1    1:getstatic       #197 <Field SerializationFeature SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//*   2    4:invokevirtual   #201 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   3    7:ifeq            26
	//*   4   10:aload_0         
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #205 <Method boolean hasSingleElement(Object)>
	//*   7   15:ifeq            26
		{
			serializeContents(obj, jsongenerator, serializerprovider);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:invokevirtual   #208 <Method void serializeContents(Object, JsonGenerator, SerializerProvider)>
			return;
	//   13   25:return          
		} else
		{
			jsongenerator.writeStartArray();
	//   14   26:aload_2         
	//   15   27:invokevirtual   #214 <Method void JsonGenerator.writeStartArray()>
			jsongenerator.setCurrentValue(obj);
	//   16   30:aload_2         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #218 <Method void JsonGenerator.setCurrentValue(Object)>
			serializeContents(obj, jsongenerator, serializerprovider);
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:aload_2         
	//   22   38:aload_3         
	//   23   39:invokevirtual   #208 <Method void serializeContents(Object, JsonGenerator, SerializerProvider)>
			jsongenerator.writeEndArray();
	//   24   42:aload_2         
	//   25   43:invokevirtual   #221 <Method void JsonGenerator.writeEndArray()>
			return;
	//   26   46:return          
		}
	}

	protected abstract void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException;

	public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		jsongenerator.setCurrentValue(obj);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #218 <Method void JsonGenerator.setCurrentValue(Object)>
		com.fasterxml.jackson.core.type.WritableTypeId writabletypeid = typeserializer.writeTypePrefix(jsongenerator, typeserializer.typeId(obj, JsonToken.START_ARRAY));
	//    3    5:aload           4
	//    4    7:aload_2         
	//    5    8:aload           4
	//    6   10:aload_1         
	//    7   11:getstatic       #230 <Field JsonToken JsonToken.START_ARRAY>
	//    8   14:invokevirtual   #234 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.typeId(Object, JsonToken)>
	//    9   17:invokevirtual   #238 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   10   20:astore          5
		serializeContents(obj, jsongenerator, serializerprovider);
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:invokevirtual   #208 <Method void serializeContents(Object, JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffix(jsongenerator, writabletypeid);
	//   16   29:aload           4
	//   17   31:aload_2         
	//   18   32:aload           5
	//   19   34:invokevirtual   #241 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   20   37:pop             
	//   21   38:return          
	}

	public abstract AsArraySerializerBase withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, Boolean boolean1);

	protected PropertySerializerMap _dynamicSerializers;
	protected final JsonSerializer _elementSerializer;
	protected final JavaType _elementType;
	protected final BeanProperty _property;
	protected final boolean _staticTyping;
	protected final Boolean _unwrapSingle;
	protected final TypeSerializer _valueTypeSerializer;
}
