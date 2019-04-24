// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			ArraySerializerBase

public class ObjectArraySerializer extends ArraySerializerBase
	implements ContextualSerializer
{

	public ObjectArraySerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
	{
		super([Ljava/lang/Object;);
	//    0    0:aload_0         
	//    1    1:ldc1            #23  <Class Object[]>
	//    2    3:invokespecial   #26  <Method void ArraySerializerBase(Class)>
		_elementType = javatype;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #28  <Field JavaType _elementType>
		_staticTyping = flag;
	//    6   11:aload_0         
	//    7   12:iload_2         
	//    8   13:putfield        #30  <Field boolean _staticTyping>
		_valueTypeSerializer = typeserializer;
	//    9   16:aload_0         
	//   10   17:aload_3         
	//   11   18:putfield        #32  <Field TypeSerializer _valueTypeSerializer>
		_dynamicSerializers = PropertySerializerMap.emptyForProperties();
	//   12   21:aload_0         
	//   13   22:invokestatic    #38  <Method PropertySerializerMap PropertySerializerMap.emptyForProperties()>
	//   14   25:putfield        #40  <Field PropertySerializerMap _dynamicSerializers>
		_elementSerializer = jsonserializer;
	//   15   28:aload_0         
	//   16   29:aload           4
	//   17   31:putfield        #42  <Field JsonSerializer _elementSerializer>
	//   18   34:return          
	}

	public ObjectArraySerializer(ObjectArraySerializer objectarrayserializer, BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, Boolean boolean1)
	{
		super(((ArraySerializerBase) (objectarrayserializer)), beanproperty, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload           5
	//    4    5:invokespecial   #49  <Method void ArraySerializerBase(ArraySerializerBase, BeanProperty, Boolean)>
		_elementType = objectarrayserializer._elementType;
	//    5    8:aload_0         
	//    6    9:aload_1         
	//    7   10:getfield        #28  <Field JavaType _elementType>
	//    8   13:putfield        #28  <Field JavaType _elementType>
		_valueTypeSerializer = typeserializer;
	//    9   16:aload_0         
	//   10   17:aload_3         
	//   11   18:putfield        #32  <Field TypeSerializer _valueTypeSerializer>
		_staticTyping = objectarrayserializer._staticTyping;
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:getfield        #30  <Field boolean _staticTyping>
	//   15   26:putfield        #30  <Field boolean _staticTyping>
		_dynamicSerializers = objectarrayserializer._dynamicSerializers;
	//   16   29:aload_0         
	//   17   30:aload_1         
	//   18   31:getfield        #40  <Field PropertySerializerMap _dynamicSerializers>
	//   19   34:putfield        #40  <Field PropertySerializerMap _dynamicSerializers>
		_elementSerializer = jsonserializer;
	//   20   37:aload_0         
	//   21   38:aload           4
	//   22   40:putfield        #42  <Field JsonSerializer _elementSerializer>
	//   23   43:return          
	}

	public ObjectArraySerializer(ObjectArraySerializer objectarrayserializer, TypeSerializer typeserializer)
	{
		super(((ArraySerializerBase) (objectarrayserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #54  <Method void ArraySerializerBase(ArraySerializerBase)>
		_elementType = objectarrayserializer._elementType;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #28  <Field JavaType _elementType>
	//    6   10:putfield        #28  <Field JavaType _elementType>
		_valueTypeSerializer = typeserializer;
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:putfield        #32  <Field TypeSerializer _valueTypeSerializer>
		_staticTyping = objectarrayserializer._staticTyping;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:getfield        #30  <Field boolean _staticTyping>
	//   13   23:putfield        #30  <Field boolean _staticTyping>
		_dynamicSerializers = objectarrayserializer._dynamicSerializers;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #40  <Field PropertySerializerMap _dynamicSerializers>
	//   17   31:putfield        #40  <Field PropertySerializerMap _dynamicSerializers>
		_elementSerializer = objectarrayserializer._elementSerializer;
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:getfield        #42  <Field JsonSerializer _elementSerializer>
	//   21   39:putfield        #42  <Field JsonSerializer _elementSerializer>
	//   22   42:return          
	}

	protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, JavaType javatype, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		javatype = ((JavaType) (propertyserializermap.findAndAddSecondarySerializer(javatype, serializerprovider, _property)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload_0         
	//    4    4:getfield        #62  <Field BeanProperty _property>
	//    5    7:invokevirtual   #66  <Method com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.findAndAddSecondarySerializer(JavaType, SerializerProvider, BeanProperty)>
	//    6   10:astore_2        
		if(propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map)
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:getfield        #71  <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//*  10   16:if_acmpeq       27
			_dynamicSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:getfield        #71  <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//   14   24:putfield        #40  <Field PropertySerializerMap _dynamicSerializers>
		return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).serializer;
	//   15   27:aload_2         
	//   16   28:getfield        #74  <Field JsonSerializer com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.serializer>
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
	//    4    4:getfield        #62  <Field BeanProperty _property>
	//    5    7:invokevirtual   #80  <Method com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.findAndAddSecondarySerializer(Class, SerializerProvider, BeanProperty)>
	//    6   10:astore_2        
		if(propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map)
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:getfield        #71  <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//*  10   16:if_acmpeq       27
			_dynamicSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:getfield        #71  <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//   14   24:putfield        #40  <Field PropertySerializerMap _dynamicSerializers>
		return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).serializer;
	//   15   27:aload_2         
	//   16   28:getfield        #74  <Field JsonSerializer com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.serializer>
	//   17   31:areturn         
	}

	public JsonSerializer _withResolved(BeanProperty beanproperty, Boolean boolean1)
	{
		return ((JsonSerializer) (new ObjectArraySerializer(this, beanproperty, _valueTypeSerializer, _elementSerializer, boolean1)));
	//    0    0:new             #2   <Class ObjectArraySerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #32  <Field TypeSerializer _valueTypeSerializer>
	//    6   10:aload_0         
	//    7   11:getfield        #42  <Field JsonSerializer _elementSerializer>
	//    8   14:aload_2         
	//    9   15:invokespecial   #85  <Method void ObjectArraySerializer(ObjectArraySerializer, BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//   10   18:areturn         
	}

	public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
	{
		return ((ContainerSerializer) (new ObjectArraySerializer(_elementType, _staticTyping, typeserializer, _elementSerializer)));
	//    0    0:new             #2   <Class ObjectArraySerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field JavaType _elementType>
	//    4    8:aload_0         
	//    5    9:getfield        #30  <Field boolean _staticTyping>
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #42  <Field JsonSerializer _elementSerializer>
	//    9   17:invokespecial   #90  <Method void ObjectArraySerializer(JavaType, boolean, TypeSerializer, JsonSerializer)>
	//   10   20:areturn         
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		JsonArrayFormatVisitor jsonarrayformatvisitor = jsonformatvisitorwrapper.expectArrayFormat(javatype);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #99  <Method JsonArrayFormatVisitor JsonFormatVisitorWrapper.expectArrayFormat(JavaType)>
	//    3    7:astore          4
		if(jsonarrayformatvisitor != null)
	//*   4    9:aload           4
	//*   5   11:ifnull          90
		{
			JavaType javatype1 = jsonformatvisitorwrapper.getProvider().getTypeFactory().moreSpecificType(_elementType, javatype.getContentType());
	//    6   14:aload_1         
	//    7   15:invokeinterface #103 <Method SerializerProvider JsonFormatVisitorWrapper.getProvider()>
	//    8   20:invokevirtual   #109 <Method TypeFactory SerializerProvider.getTypeFactory()>
	//    9   23:aload_0         
	//   10   24:getfield        #28  <Field JavaType _elementType>
	//   11   27:aload_2         
	//   12   28:invokevirtual   #115 <Method JavaType JavaType.getContentType()>
	//   13   31:invokevirtual   #121 <Method JavaType TypeFactory.moreSpecificType(JavaType, JavaType)>
	//   14   34:astore          5
			if(javatype1 == null)
	//*  15   36:aload           5
	//*  16   38:ifnonnull       53
				throw JsonMappingException.from(jsonformatvisitorwrapper.getProvider(), "Could not resolve type");
	//   17   41:aload_1         
	//   18   42:invokeinterface #103 <Method SerializerProvider JsonFormatVisitorWrapper.getProvider()>
	//   19   47:ldc1            #123 <String "Could not resolve type">
	//   20   49:invokestatic    #127 <Method JsonMappingException JsonMappingException.from(SerializerProvider, String)>
	//   21   52:athrow          
			JsonSerializer jsonserializer = _elementSerializer;
	//   22   53:aload_0         
	//   23   54:getfield        #42  <Field JsonSerializer _elementSerializer>
	//   24   57:astore_3        
			javatype = ((JavaType) (jsonserializer));
	//   25   58:aload_3         
	//   26   59:astore_2        
			if(jsonserializer == null)
	//*  27   60:aload_3         
	//*  28   61:ifnonnull       80
				javatype = ((JavaType) (jsonformatvisitorwrapper.getProvider().findValueSerializer(javatype1, _property)));
	//   29   64:aload_1         
	//   30   65:invokeinterface #103 <Method SerializerProvider JsonFormatVisitorWrapper.getProvider()>
	//   31   70:aload           5
	//   32   72:aload_0         
	//   33   73:getfield        #62  <Field BeanProperty _property>
	//   34   76:invokevirtual   #131 <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, BeanProperty)>
	//   35   79:astore_2        
			jsonarrayformatvisitor.itemsFormat(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable) (javatype)), javatype1);
	//   36   80:aload           4
	//   37   82:aload_2         
	//   38   83:aload           5
	//   39   85:invokeinterface #137 <Method void JsonArrayFormatVisitor.itemsFormat(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable, JavaType)>
		}
	//   40   90:return          
	}

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj = ((Object) (_valueTypeSerializer));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field TypeSerializer _valueTypeSerializer>
	//    2    4:astore_3        
		TypeSerializer typeserializer = ((TypeSerializer) (obj));
	//    3    5:aload_3         
	//    4    6:astore          5
		if(obj != null)
	//*   5    8:aload_3         
	//*   6    9:ifnull          19
			typeserializer = ((TypeSerializer) (obj)).forProperty(beanproperty);
	//    7   12:aload_3         
	//    8   13:aload_2         
	//    9   14:invokevirtual   #145 <Method TypeSerializer TypeSerializer.forProperty(BeanProperty)>
	//   10   17:astore          5
		Object obj1 = null;
	//   11   19:aconst_null     
	//   12   20:astore          4
		com.fasterxml.jackson.annotation.JsonFormat.Value value = null;
	//   13   22:aconst_null     
	//   14   23:astore          8
		Object obj3 = null;
	//   15   25:aconst_null     
	//   16   26:astore          7
		Object obj2 = ((Object) (obj3));
	//   17   28:aload           7
	//   18   30:astore          6
		if(beanproperty != null)
	//*  19   32:aload_2         
	//*  20   33:ifnull          125
		{
			obj1 = ((Object) (beanproperty.getMember()));
	//   21   36:aload_2         
	//   22   37:invokeinterface #151 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//   23   42:astore          4
			obj2 = ((Object) (serializerprovider.getAnnotationIntrospector()));
	//   24   44:aload_1         
	//   25   45:invokevirtual   #155 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//   26   48:astore          6
			obj = ((Object) (value));
	//   27   50:aload           8
	//   28   52:astore_3        
			if(obj1 != null)
	//*  29   53:aload           4
	//*  30   55:ifnull          84
			{
				obj2 = ((AnnotationIntrospector) (obj2)).findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)));
	//   31   58:aload           6
	//   32   60:aload           4
	//   33   62:invokevirtual   #161 <Method Object AnnotationIntrospector.findContentSerializer(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   34   65:astore          6
				obj = ((Object) (value));
	//   35   67:aload           8
	//   36   69:astore_3        
				if(obj2 != null)
	//*  37   70:aload           6
	//*  38   72:ifnull          84
					obj = ((Object) (serializerprovider.serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)), obj2)));
	//   39   75:aload_1         
	//   40   76:aload           4
	//   41   78:aload           6
	//   42   80:invokevirtual   #165 <Method JsonSerializer SerializerProvider.serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, Object)>
	//   43   83:astore_3        
			}
			value = beanproperty.findPropertyFormat(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializerprovider.getConfig())), _handledType);
	//   44   84:aload_2         
	//   45   85:aload_1         
	//   46   86:invokevirtual   #169 <Method com.fasterxml.jackson.databind.SerializationConfig SerializerProvider.getConfig()>
	//   47   89:aload_0         
	//   48   90:getfield        #173 <Field Class _handledType>
	//   49   93:invokeinterface #177 <Method com.fasterxml.jackson.annotation.JsonFormat$Value BeanProperty.findPropertyFormat(com.fasterxml.jackson.databind.cfg.MapperConfig, Class)>
	//   50   98:astore          8
			obj1 = obj;
	//   51  100:aload_3         
	//   52  101:astore          4
			obj2 = ((Object) (obj3));
	//   53  103:aload           7
	//   54  105:astore          6
			if(value != null)
	//*  55  107:aload           8
	//*  56  109:ifnull          125
			{
				obj2 = ((Object) (value.getFeature(com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)));
	//   57  112:aload           8
	//   58  114:getstatic       #183 <Field com.fasterxml.jackson.annotation.JsonFormat$Feature com.fasterxml.jackson.annotation.JsonFormat$Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//   59  117:invokevirtual   #189 <Method Boolean com.fasterxml.jackson.annotation.JsonFormat$Value.getFeature(com.fasterxml.jackson.annotation.JsonFormat$Feature)>
	//   60  120:astore          6
				obj1 = obj;
	//   61  122:aload_3         
	//   62  123:astore          4
			}
		}
		obj = obj1;
	//   63  125:aload           4
	//   64  127:astore_3        
		if(obj1 == null)
	//*  65  128:aload           4
	//*  66  130:ifnonnull       138
			obj = ((Object) (_elementSerializer));
	//   67  133:aload_0         
	//   68  134:getfield        #42  <Field JsonSerializer _elementSerializer>
	//   69  137:astore_3        
		obj1 = ((Object) (findConvertingContentSerializer(serializerprovider, beanproperty, ((JsonSerializer) (obj)))));
	//   70  138:aload_0         
	//   71  139:aload_1         
	//   72  140:aload_2         
	//   73  141:aload_3         
	//   74  142:invokevirtual   #193 <Method JsonSerializer findConvertingContentSerializer(SerializerProvider, BeanProperty, JsonSerializer)>
	//   75  145:astore          4
		if(obj1 == null)
	//*  76  147:aload           4
	//*  77  149:ifnonnull       206
		{
			obj = obj1;
	//   78  152:aload           4
	//   79  154:astore_3        
			if(_elementType != null)
	//*  80  155:aload_0         
	//*  81  156:getfield        #28  <Field JavaType _elementType>
	//*  82  159:ifnull          195
			{
				obj = obj1;
	//   83  162:aload           4
	//   84  164:astore_3        
				if(_staticTyping)
	//*  85  165:aload_0         
	//*  86  166:getfield        #30  <Field boolean _staticTyping>
	//*  87  169:ifeq            195
				{
					obj = obj1;
	//   88  172:aload           4
	//   89  174:astore_3        
					if(!_elementType.isJavaLangObject())
	//*  90  175:aload_0         
	//*  91  176:getfield        #28  <Field JavaType _elementType>
	//*  92  179:invokevirtual   #197 <Method boolean JavaType.isJavaLangObject()>
	//*  93  182:ifne            195
						obj = ((Object) (serializerprovider.findValueSerializer(_elementType, beanproperty)));
	//   94  185:aload_1         
	//   95  186:aload_0         
	//   96  187:getfield        #28  <Field JavaType _elementType>
	//   97  190:aload_2         
	//   98  191:invokevirtual   #131 <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, BeanProperty)>
	//   99  194:astore_3        
				}
			}
		} else
	//* 100  195:aload_0         
	//* 101  196:aload_2         
	//* 102  197:aload           5
	//* 103  199:aload_3         
	//* 104  200:aload           6
	//* 105  202:invokevirtual   #201 <Method ObjectArraySerializer withResolved(BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//* 106  205:areturn         
		{
			obj = ((Object) (serializerprovider.handleSecondaryContextualization(((JsonSerializer) (obj1)), beanproperty)));
	//  107  206:aload_1         
	//  108  207:aload           4
	//  109  209:aload_2         
	//  110  210:invokevirtual   #205 <Method JsonSerializer SerializerProvider.handleSecondaryContextualization(JsonSerializer, BeanProperty)>
	//  111  213:astore_3        
		}
		return ((JsonSerializer) (withResolved(beanproperty, typeserializer, ((JsonSerializer) (obj)), ((Boolean) (obj2)))));
	//* 112  214:goto            195
	}

	public JsonSerializer getContentSerializer()
	{
		return _elementSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field JsonSerializer _elementSerializer>
	//    2    4:areturn         
	}

	public JavaType getContentType()
	{
		return _elementType;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field JavaType _elementType>
	//    2    4:areturn         
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		throws JsonMappingException
	{
		ObjectNode objectnode;
label0:
		{
			objectnode = createSchemaNode("array", true);
	//    0    0:aload_0         
	//    1    1:ldc1            #213 <String "array">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #217 <Method ObjectNode createSchemaNode(String, boolean)>
	//    4    7:astore_3        
			if(type != null)
	//*   5    8:aload_2         
	//*   6    9:ifnull          52
			{
				type = ((Type) (serializerprovider.constructType(type)));
	//    7   12:aload_1         
	//    8   13:aload_2         
	//    9   14:invokevirtual   #221 <Method JavaType SerializerProvider.constructType(Type)>
	//   10   17:astore_2        
				if(((JavaType) (type)).isArrayType())
	//*  11   18:aload_2         
	//*  12   19:invokevirtual   #224 <Method boolean JavaType.isArrayType()>
	//*  13   22:ifeq            52
				{
					type = ((Type) (((ArrayType)type).getContentType().getRawClass()));
	//   14   25:aload_2         
	//   15   26:checkcast       #226 <Class ArrayType>
	//   16   29:invokevirtual   #227 <Method JavaType ArrayType.getContentType()>
	//   17   32:invokevirtual   #231 <Method Class JavaType.getRawClass()>
	//   18   35:astore_2        
					if(type != java/lang/Object)
						break label0;
	//   19   36:aload_2         
	//   20   37:ldc1            #233 <Class Object>
	//   21   39:if_acmpne       54
					objectnode.set("items", JsonSchema.getDefaultSchemaNode());
	//   22   42:aload_3         
	//   23   43:ldc1            #235 <String "items">
	//   24   45:invokestatic    #241 <Method JsonNode JsonSchema.getDefaultSchemaNode()>
	//   25   48:invokevirtual   #247 <Method JsonNode ObjectNode.set(String, JsonNode)>
	//   26   51:pop             
				}
			}
			return ((JsonNode) (objectnode));
	//   27   52:aload_3         
	//   28   53:areturn         
		}
		type = ((Type) (serializerprovider.findValueSerializer(((Class) (type)), _property)));
	//   29   54:aload_1         
	//   30   55:aload_2         
	//   31   56:aload_0         
	//   32   57:getfield        #62  <Field BeanProperty _property>
	//   33   60:invokevirtual   #250 <Method JsonSerializer SerializerProvider.findValueSerializer(Class, BeanProperty)>
	//   34   63:astore_2        
		if(type instanceof SchemaAware)
	//*  35   64:aload_2         
	//*  36   65:instanceof      #252 <Class SchemaAware>
	//*  37   68:ifeq            93
			serializerprovider = ((SerializerProvider) (((SchemaAware)type).getSchema(serializerprovider, ((Type) (null)))));
	//   38   71:aload_2         
	//   39   72:checkcast       #252 <Class SchemaAware>
	//   40   75:aload_1         
	//   41   76:aconst_null     
	//   42   77:invokeinterface #254 <Method JsonNode SchemaAware.getSchema(SerializerProvider, Type)>
	//   43   82:astore_1        
		else
	//*  44   83:aload_3         
	//*  45   84:ldc1            #235 <String "items">
	//*  46   86:aload_1         
	//*  47   87:invokevirtual   #247 <Method JsonNode ObjectNode.set(String, JsonNode)>
	//*  48   90:pop             
	//*  49   91:aload_3         
	//*  50   92:areturn         
			serializerprovider = ((SerializerProvider) (JsonSchema.getDefaultSchemaNode()));
	//   51   93:invokestatic    #241 <Method JsonNode JsonSchema.getDefaultSchemaNode()>
	//   52   96:astore_1        
		objectnode.set("items", ((JsonNode) (serializerprovider)));
		return ((JsonNode) (objectnode));
	//*  53   97:goto            83
	}

	public volatile boolean hasSingleElement(Object obj)
	{
		return hasSingleElement((Object[])obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #23  <Class Object[]>
	//    3    5:invokevirtual   #259 <Method boolean hasSingleElement(Object[])>
	//    4    8:ireturn         
	}

	public boolean hasSingleElement(Object aobj[])
	{
		return aobj.length == 1;
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
		return isEmpty(serializerprovider, (Object[])obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #23  <Class Object[]>
	//    4    6:invokevirtual   #264 <Method boolean isEmpty(SerializerProvider, Object[])>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, Object aobj[])
	{
		return aobj == null || aobj.length == 0;
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
		serialize((Object[])obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #23  <Class Object[]>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #271 <Method void serialize(Object[], JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public final void serialize(Object aobj[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int i = aobj.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          4
		if(i == 1 && (_unwrapSingle == null && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) || _unwrapSingle == Boolean.TRUE))
	//*   3    4:iload           4
	//*   4    6:iconst_1        
	//*   5    7:icmpne          45
	//*   6   10:aload_0         
	//*   7   11:getfield        #275 <Field Boolean _unwrapSingle>
	//*   8   14:ifnonnull       27
	//*   9   17:aload_3         
	//*  10   18:getstatic       #280 <Field SerializationFeature SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//*  11   21:invokevirtual   #284 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  12   24:ifne            37
	//*  13   27:aload_0         
	//*  14   28:getfield        #275 <Field Boolean _unwrapSingle>
	//*  15   31:getstatic       #289 <Field Boolean Boolean.TRUE>
	//*  16   34:if_acmpne       45
		{
			serializeContents(aobj, jsongenerator, serializerprovider);
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:aload_2         
	//   20   40:aload_3         
	//   21   41:invokevirtual   #292 <Method void serializeContents(Object[], JsonGenerator, SerializerProvider)>
			return;
	//   22   44:return          
		} else
		{
			jsongenerator.writeStartArray(i);
	//   23   45:aload_2         
	//   24   46:iload           4
	//   25   48:invokevirtual   #298 <Method void JsonGenerator.writeStartArray(int)>
			serializeContents(aobj, jsongenerator, serializerprovider);
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:aload_2         
	//   29   54:aload_3         
	//   30   55:invokevirtual   #292 <Method void serializeContents(Object[], JsonGenerator, SerializerProvider)>
			jsongenerator.writeEndArray();
	//   31   58:aload_2         
	//   32   59:invokevirtual   #302 <Method void JsonGenerator.writeEndArray()>
			return;
	//   33   62:return          
		}
	}

	public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serializeContents((Object[])obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #23  <Class Object[]>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #292 <Method void serializeContents(Object[], JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serializeContents(Object aobj[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int k = aobj.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          6
		if(k != 0) goto _L2; else goto _L1
	//    3    4:iload           6
	//    4    6:ifne            10
_L1:
		return;
	//    5    9:return          
_L2:
		int i;
		if(_elementSerializer != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #42  <Field JsonSerializer _elementSerializer>
	//*   8   14:ifnull          29
		{
			serializeContentsUsing(aobj, jsongenerator, serializerprovider, _elementSerializer);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:aload_3         
	//   13   21:aload_0         
	//   14   22:getfield        #42  <Field JsonSerializer _elementSerializer>
	//   15   25:invokevirtual   #308 <Method void serializeContentsUsing(Object[], JsonGenerator, SerializerProvider, JsonSerializer)>
			return;
	//   16   28:return          
		}
		if(_valueTypeSerializer != null)
	//*  17   29:aload_0         
	//*  18   30:getfield        #32  <Field TypeSerializer _valueTypeSerializer>
	//*  19   33:ifnull          44
		{
			serializeTypedContents(aobj, jsongenerator, serializerprovider);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:aload_2         
	//   23   39:aload_3         
	//   24   40:invokevirtual   #311 <Method void serializeTypedContents(Object[], JsonGenerator, SerializerProvider)>
			return;
	//   25   43:return          
		}
		int j = 0;
	//   26   44:iconst_0        
	//   27   45:istore          5
		i = 0;
	//   28   47:iconst_0        
	//   29   48:istore          4
		Object obj = null;
	//   30   50:aconst_null     
	//   31   51:astore          8
		JsonSerializer jsonserializer;
		Object obj1;
		JsonSerializer jsonserializer1;
		PropertySerializerMap propertyserializermap;
		Class class1;
		try
		{
			propertyserializermap = _dynamicSerializers;
	//   32   53:aload_0         
	//   33   54:getfield        #40  <Field PropertySerializerMap _dynamicSerializers>
	//   34   57:astore          11
		}
	//*  35   59:iload           4
	//*  36   61:iload           6
	//*  37   63:icmpge          9
	//*  38   66:aload_1         
	//*  39   67:iload           4
	//*  40   69:aaload          
	//*  41   70:astore          9
	//*  42   72:aload           9
	//*  43   74:ifnonnull       93
	//*  44   77:aload           9
	//*  45   79:astore          8
	//*  46   81:iload           4
	//*  47   83:istore          5
	//*  48   85:aload_3         
	//*  49   86:aload_2         
	//*  50   87:invokevirtual   #315 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
	//*  51   90:goto            268
	//*  52   93:aload           9
	//*  53   95:astore          8
	//*  54   97:iload           4
	//*  55   99:istore          5
	//*  56  101:aload           9
	//*  57  103:invokevirtual   #318 <Method Class Object.getClass()>
	//*  58  106:astore          12
	//*  59  108:aload           9
	//*  60  110:astore          8
	//*  61  112:iload           4
	//*  62  114:istore          5
	//*  63  116:aload           11
	//*  64  118:aload           12
	//*  65  120:invokevirtual   #322 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//*  66  123:astore          10
	//*  67  125:aload           10
	//*  68  127:astore          7
	//*  69  129:aload           10
	//*  70  131:ifnonnull       179
	//*  71  134:aload           9
	//*  72  136:astore          8
	//*  73  138:iload           4
	//*  74  140:istore          5
	//*  75  142:aload_0         
	//*  76  143:getfield        #28  <Field JavaType _elementType>
	//*  77  146:invokevirtual   #325 <Method boolean JavaType.hasGenericTypes()>
	//*  78  149:ifeq            202
	//*  79  152:aload           9
	//*  80  154:astore          8
	//*  81  156:iload           4
	//*  82  158:istore          5
	//*  83  160:aload_0         
	//*  84  161:aload           11
	//*  85  163:aload_3         
	//*  86  164:aload_0         
	//*  87  165:getfield        #28  <Field JavaType _elementType>
	//*  88  168:aload           12
	//*  89  170:invokevirtual   #329 <Method JavaType SerializerProvider.constructSpecializedType(JavaType, Class)>
	//*  90  173:aload_3         
	//*  91  174:invokevirtual   #331 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, JavaType, SerializerProvider)>
	//*  92  177:astore          7
	//*  93  179:aload           9
	//*  94  181:astore          8
	//*  95  183:iload           4
	//*  96  185:istore          5
	//*  97  187:aload           7
	//*  98  189:aload           9
	//*  99  191:aload_2         
	//* 100  192:aload_3         
	//* 101  193:invokevirtual   #335 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//* 102  196:goto            268
		// Misplaced declaration of an exception variable
		catch(Object aobj[])
	//* 103  199:astore_1        
		{
			throw aobj;
	//  104  200:aload_1         
	//  105  201:athrow          
		}
	//* 106  202:aload           9
	//* 107  204:astore          8
	//* 108  206:iload           4
	//* 109  208:istore          5
	//* 110  210:aload_0         
	//* 111  211:aload           11
	//* 112  213:aload           12
	//* 113  215:aload_3         
	//* 114  216:invokevirtual   #337 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//* 115  219:astore          7
	//* 116  221:goto            179
		// Misplaced declaration of an exception variable
		catch(Object aobj[])
	//* 117  224:astore_1        
		{
			for(; (aobj instanceof InvocationTargetException) && ((Throwable) (aobj)).getCause() != null; aobj = ((Object []) (((Throwable) (aobj)).getCause())));
	//  118  225:aload_1         
	//  119  226:instanceof      #339 <Class InvocationTargetException>
	//  120  229:ifeq            247
	//  121  232:aload_1         
	//  122  233:invokevirtual   #345 <Method Throwable Throwable.getCause()>
	//  123  236:ifnull          247
	//  124  239:aload_1         
	//  125  240:invokevirtual   #345 <Method Throwable Throwable.getCause()>
	//  126  243:astore_1        
	//* 127  244:goto            225
			if(aobj instanceof Error)
	//* 128  247:aload_1         
	//* 129  248:instanceof      #347 <Class Error>
	//* 130  251:ifeq            259
				throw (Error)aobj;
	//  131  254:aload_1         
	//  132  255:checkcast       #347 <Class Error>
	//  133  258:athrow          
			else
				throw JsonMappingException.wrapWithPath(((Throwable) (aobj)), obj, j);
	//  134  259:aload_1         
	//  135  260:aload           8
	//  136  262:iload           5
	//  137  264:invokestatic    #351 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//  138  267:athrow          
		}
_L11:
		if(i >= k)
			continue; /* Loop/switch isn't completed */
		obj1 = aobj[i];
		if(obj1 != null) goto _L4; else goto _L3
_L3:
		obj = obj1;
		j = i;
		serializerprovider.defaultSerializeNull(jsongenerator);
		  goto _L5
_L4:
		obj = obj1;
		j = i;
		class1 = obj1.getClass();
		obj = obj1;
		j = i;
		jsonserializer1 = propertyserializermap.serializerFor(class1);
		jsonserializer = jsonserializer1;
		if(jsonserializer1 != null) goto _L7; else goto _L6
_L6:
		obj = obj1;
		j = i;
		if(!_elementType.hasGenericTypes()) goto _L9; else goto _L8
_L8:
		obj = obj1;
		j = i;
		jsonserializer = _findAndAddDynamic(propertyserializermap, serializerprovider.constructSpecializedType(_elementType, class1), serializerprovider);
_L7:
		obj = obj1;
		j = i;
		jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
		break; /* Loop/switch isn't completed */
_L9:
		obj = obj1;
		j = i;
		jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
		if(true) goto _L7; else goto _L5
_L5:
		i++;
	//  139  268:iload           4
	//  140  270:iconst_1        
	//  141  271:iadd            
	//  142  272:istore          4
		if(true) goto _L11; else goto _L10
	//  143  274:goto            59
_L10:
		if(true) goto _L1; else goto _L12
_L12:
	}

	public void serializeContentsUsing(Object aobj[], JsonGenerator jsongenerator, SerializerProvider serializerprovider, JsonSerializer jsonserializer)
		throws IOException
	{
		int i;
		int j;
		TypeSerializer typeserializer;
		j = aobj.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          6
		typeserializer = _valueTypeSerializer;
	//    3    4:aload_0         
	//    4    5:getfield        #32  <Field TypeSerializer _valueTypeSerializer>
	//    5    8:astore          8
		i = 0;
	//    6   10:iconst_0        
	//    7   11:istore          5
_L2:
		if(i >= j)
			break MISSING_BLOCK_LABEL_117;
	//    8   13:iload           5
	//    9   15:iload           6
	//   10   17:icmpge          117
		Object obj = aobj[i];
	//   11   20:aload_1         
	//   12   21:iload           5
	//   13   23:aaload          
	//   14   24:astore          7
		if(obj == null)
	//*  15   26:aload           7
	//*  16   28:ifnonnull       39
		{
			try
			{
				serializerprovider.defaultSerializeNull(jsongenerator);
	//   17   31:aload_3         
	//   18   32:aload_2         
	//   19   33:invokevirtual   #315 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
			}
	//*  20   36:goto            118
	//*  21   39:aload           8
	//*  22   41:ifnonnull       59
	//*  23   44:aload           4
	//*  24   46:aload           7
	//*  25   48:aload_2         
	//*  26   49:aload_3         
	//*  27   50:invokevirtual   #335 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//*  28   53:goto            118
			// Misplaced declaration of an exception variable
			catch(Object aobj[])
	//*  29   56:astore_1        
			{
				throw aobj;
	//   30   57:aload_1         
	//   31   58:athrow          
			}
	//*  32   59:aload           4
	//*  33   61:aload           7
	//*  34   63:aload_2         
	//*  35   64:aload_3         
	//*  36   65:aload           8
	//*  37   67:invokevirtual   #355 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
	//*  38   70:goto            118
			// Misplaced declaration of an exception variable
			catch(Object aobj[])
	//*  39   73:astore_1        
			{
				for(; (aobj instanceof InvocationTargetException) && ((Throwable) (aobj)).getCause() != null; aobj = ((Object []) (((Throwable) (aobj)).getCause())));
	//   40   74:aload_1         
	//   41   75:instanceof      #339 <Class InvocationTargetException>
	//   42   78:ifeq            96
	//   43   81:aload_1         
	//   44   82:invokevirtual   #345 <Method Throwable Throwable.getCause()>
	//   45   85:ifnull          96
	//   46   88:aload_1         
	//   47   89:invokevirtual   #345 <Method Throwable Throwable.getCause()>
	//   48   92:astore_1        
	//*  49   93:goto            74
				if(aobj instanceof Error)
	//*  50   96:aload_1         
	//*  51   97:instanceof      #347 <Class Error>
	//*  52  100:ifeq            108
					throw (Error)aobj;
	//   53  103:aload_1         
	//   54  104:checkcast       #347 <Class Error>
	//   55  107:athrow          
				else
					throw JsonMappingException.wrapWithPath(((Throwable) (aobj)), obj, i);
	//   56  108:aload_1         
	//   57  109:aload           7
	//   58  111:iload           5
	//   59  113:invokestatic    #351 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//   60  116:athrow          
			}
			break MISSING_BLOCK_LABEL_118;
		}
		if(typeserializer != null)
			break MISSING_BLOCK_LABEL_59;
		jsonserializer.serialize(obj, jsongenerator, serializerprovider);
		break MISSING_BLOCK_LABEL_118;
		jsonserializer.serializeWithType(obj, jsongenerator, serializerprovider, typeserializer);
		break MISSING_BLOCK_LABEL_118;
		return;
	//   61  117:return          
		i++;
	//   62  118:iload           5
	//   63  120:iconst_1        
	//   64  121:iadd            
	//   65  122:istore          5
		if(true) goto _L2; else goto _L1
	//   66  124:goto            13
_L1:
	}

	public void serializeTypedContents(Object aobj[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int i;
		int k = aobj.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          6
		TypeSerializer typeserializer = _valueTypeSerializer;
	//    3    4:aload_0         
	//    4    5:getfield        #32  <Field TypeSerializer _valueTypeSerializer>
	//    5    8:astore          11
		int j = 0;
	//    6   10:iconst_0        
	//    7   11:istore          5
		i = 0;
	//    8   13:iconst_0        
	//    9   14:istore          4
		Object obj = null;
	//   10   16:aconst_null     
	//   11   17:astore          7
		JsonSerializer jsonserializer;
		Object obj1;
		JsonSerializer jsonserializer1;
		PropertySerializerMap propertyserializermap;
		Class class1;
		try
		{
			propertyserializermap = _dynamicSerializers;
	//   12   19:aload_0         
	//   13   20:getfield        #40  <Field PropertySerializerMap _dynamicSerializers>
	//   14   23:astore          12
		}
	//*  15   25:iload           4
	//*  16   27:iload           6
	//*  17   29:icmpge          188
	//*  18   32:aload_1         
	//*  19   33:iload           4
	//*  20   35:aaload          
	//*  21   36:astore          9
	//*  22   38:aload           9
	//*  23   40:ifnonnull       59
	//*  24   43:aload           9
	//*  25   45:astore          7
	//*  26   47:iload           4
	//*  27   49:istore          5
	//*  28   51:aload_3         
	//*  29   52:aload_2         
	//*  30   53:invokevirtual   #315 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
	//*  31   56:goto            189
	//*  32   59:aload           9
	//*  33   61:astore          7
	//*  34   63:iload           4
	//*  35   65:istore          5
	//*  36   67:aload           9
	//*  37   69:invokevirtual   #318 <Method Class Object.getClass()>
	//*  38   72:astore          13
	//*  39   74:aload           9
	//*  40   76:astore          7
	//*  41   78:iload           4
	//*  42   80:istore          5
	//*  43   82:aload           12
	//*  44   84:aload           13
	//*  45   86:invokevirtual   #322 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//*  46   89:astore          10
	//*  47   91:aload           10
	//*  48   93:astore          8
	//*  49   95:aload           10
	//*  50   97:ifnonnull       119
	//*  51  100:aload           9
	//*  52  102:astore          7
	//*  53  104:iload           4
	//*  54  106:istore          5
	//*  55  108:aload_0         
	//*  56  109:aload           12
	//*  57  111:aload           13
	//*  58  113:aload_3         
	//*  59  114:invokevirtual   #337 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//*  60  117:astore          8
	//*  61  119:aload           9
	//*  62  121:astore          7
	//*  63  123:iload           4
	//*  64  125:istore          5
	//*  65  127:aload           8
	//*  66  129:aload           9
	//*  67  131:aload_2         
	//*  68  132:aload_3         
	//*  69  133:aload           11
	//*  70  135:invokevirtual   #355 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
	//*  71  138:goto            189
		// Misplaced declaration of an exception variable
		catch(Object aobj[])
	//*  72  141:astore_1        
		{
			throw aobj;
	//   73  142:aload_1         
	//   74  143:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object aobj[])
	//*  75  144:astore_1        
		{
			for(; (aobj instanceof InvocationTargetException) && ((Throwable) (aobj)).getCause() != null; aobj = ((Object []) (((Throwable) (aobj)).getCause())));
	//   76  145:aload_1         
	//   77  146:instanceof      #339 <Class InvocationTargetException>
	//   78  149:ifeq            167
	//   79  152:aload_1         
	//   80  153:invokevirtual   #345 <Method Throwable Throwable.getCause()>
	//   81  156:ifnull          167
	//   82  159:aload_1         
	//   83  160:invokevirtual   #345 <Method Throwable Throwable.getCause()>
	//   84  163:astore_1        
	//*  85  164:goto            145
			if(aobj instanceof Error)
	//*  86  167:aload_1         
	//*  87  168:instanceof      #347 <Class Error>
	//*  88  171:ifeq            179
				throw (Error)aobj;
	//   89  174:aload_1         
	//   90  175:checkcast       #347 <Class Error>
	//   91  178:athrow          
			else
				throw JsonMappingException.wrapWithPath(((Throwable) (aobj)), obj, j);
	//   92  179:aload_1         
	//   93  180:aload           7
	//   94  182:iload           5
	//   95  184:invokestatic    #351 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//   96  187:athrow          
		}
_L2:
		if(i >= k)
			break MISSING_BLOCK_LABEL_188;
		obj1 = aobj[i];
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_59;
		obj = obj1;
		j = i;
		serializerprovider.defaultSerializeNull(jsongenerator);
		break MISSING_BLOCK_LABEL_189;
		obj = obj1;
		j = i;
		class1 = obj1.getClass();
		obj = obj1;
		j = i;
		jsonserializer1 = propertyserializermap.serializerFor(class1);
		jsonserializer = jsonserializer1;
		if(jsonserializer1 != null)
			break MISSING_BLOCK_LABEL_119;
		obj = obj1;
		j = i;
		jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
		obj = obj1;
		j = i;
		jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, typeserializer);
		break MISSING_BLOCK_LABEL_189;
		return;
	//   97  188:return          
		i++;
	//   98  189:iload           4
	//   99  191:iconst_1        
	//  100  192:iadd            
	//  101  193:istore          4
		if(true) goto _L2; else goto _L1
	//  102  195:goto            25
_L1:
	}

	public ObjectArraySerializer withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, Boolean boolean1)
	{
		if(_property == beanproperty && jsonserializer == _elementSerializer && _valueTypeSerializer == typeserializer && _unwrapSingle == boolean1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field BeanProperty _property>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       35
	//*   4    8:aload_3         
	//*   5    9:aload_0         
	//*   6   10:getfield        #42  <Field JsonSerializer _elementSerializer>
	//*   7   13:if_acmpne       35
	//*   8   16:aload_0         
	//*   9   17:getfield        #32  <Field TypeSerializer _valueTypeSerializer>
	//*  10   20:aload_2         
	//*  11   21:if_acmpne       35
	//*  12   24:aload_0         
	//*  13   25:getfield        #275 <Field Boolean _unwrapSingle>
	//*  14   28:aload           4
	//*  15   30:if_acmpne       35
			return this;
	//   16   33:aload_0         
	//   17   34:areturn         
		else
			return new ObjectArraySerializer(this, beanproperty, typeserializer, jsonserializer, boolean1);
	//   18   35:new             #2   <Class ObjectArraySerializer>
	//   19   38:dup             
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:aload_2         
	//   23   42:aload_3         
	//   24   43:aload           4
	//   25   45:invokespecial   #85  <Method void ObjectArraySerializer(ObjectArraySerializer, BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//   26   48:areturn         
	}

	protected PropertySerializerMap _dynamicSerializers;
	protected JsonSerializer _elementSerializer;
	protected final JavaType _elementType;
	protected final boolean _staticTyping;
	protected final TypeSerializer _valueTypeSerializer;
}
