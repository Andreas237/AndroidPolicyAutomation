// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
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

	protected AsArraySerializerBase(AsArraySerializerBase asarrayserializerbase, BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer)
	{
		this(asarrayserializerbase, beanproperty, typeserializer, jsonserializer, asarrayserializerbase._unwrapSingle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload_1         
	//    6    7:getfield        #27  <Field Boolean _unwrapSingle>
	//    7   10:invokespecial   #30  <Method void AsArraySerializerBase(AsArraySerializerBase, BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//    8   13:return          
	}

	protected AsArraySerializerBase(AsArraySerializerBase asarrayserializerbase, BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, Boolean boolean1)
	{
		super(((ContainerSerializer) (asarrayserializerbase)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #37  <Method void ContainerSerializer(ContainerSerializer)>
		_elementType = asarrayserializerbase._elementType;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #39  <Field JavaType _elementType>
	//    6   10:putfield        #39  <Field JavaType _elementType>
		_staticTyping = asarrayserializerbase._staticTyping;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #41  <Field boolean _staticTyping>
	//   10   18:putfield        #41  <Field boolean _staticTyping>
		_valueTypeSerializer = typeserializer;
	//   11   21:aload_0         
	//   12   22:aload_3         
	//   13   23:putfield        #43  <Field TypeSerializer _valueTypeSerializer>
		_property = beanproperty;
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:putfield        #45  <Field BeanProperty _property>
		_elementSerializer = jsonserializer;
	//   17   31:aload_0         
	//   18   32:aload           4
	//   19   34:putfield        #47  <Field JsonSerializer _elementSerializer>
		_dynamicSerializers = asarrayserializerbase._dynamicSerializers;
	//   20   37:aload_0         
	//   21   38:aload_1         
	//   22   39:getfield        #49  <Field PropertySerializerMap _dynamicSerializers>
	//   23   42:putfield        #49  <Field PropertySerializerMap _dynamicSerializers>
		_unwrapSingle = boolean1;
	//   24   45:aload_0         
	//   25   46:aload           5
	//   26   48:putfield        #27  <Field Boolean _unwrapSingle>
	//   27   51:return          
	}

	protected AsArraySerializerBase(Class class1, JavaType javatype, boolean flag, TypeSerializer typeserializer, BeanProperty beanproperty, JsonSerializer jsonserializer)
	{
label0:
		{
			boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
			super(class1, false);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:iconst_0        
	//    5    6:invokespecial   #54  <Method void ContainerSerializer(Class, boolean)>
			_elementType = javatype;
	//    6    9:aload_0         
	//    7   10:aload_2         
	//    8   11:putfield        #39  <Field JavaType _elementType>
			if(!flag)
	//*   9   14:iload_3         
	//*  10   15:ifne            35
			{
				flag = flag1;
	//   11   18:iload           7
	//   12   20:istore_3        
				if(javatype == null)
					break label0;
	//   13   21:aload_2         
	//   14   22:ifnull          37
				flag = flag1;
	//   15   25:iload           7
	//   16   27:istore_3        
				if(!javatype.isFinal())
					break label0;
	//   17   28:aload_2         
	//   18   29:invokevirtual   #60  <Method boolean JavaType.isFinal()>
	//   19   32:ifeq            37
			}
			flag = true;
	//   20   35:iconst_1        
	//   21   36:istore_3        
		}
		_staticTyping = flag;
	//   22   37:aload_0         
	//   23   38:iload_3         
	//   24   39:putfield        #41  <Field boolean _staticTyping>
		_valueTypeSerializer = typeserializer;
	//   25   42:aload_0         
	//   26   43:aload           4
	//   27   45:putfield        #43  <Field TypeSerializer _valueTypeSerializer>
		_property = beanproperty;
	//   28   48:aload_0         
	//   29   49:aload           5
	//   30   51:putfield        #45  <Field BeanProperty _property>
		_elementSerializer = jsonserializer;
	//   31   54:aload_0         
	//   32   55:aload           6
	//   33   57:putfield        #47  <Field JsonSerializer _elementSerializer>
		_dynamicSerializers = PropertySerializerMap.emptyForProperties();
	//   34   60:aload_0         
	//   35   61:invokestatic    #66  <Method PropertySerializerMap PropertySerializerMap.emptyForProperties()>
	//   36   64:putfield        #49  <Field PropertySerializerMap _dynamicSerializers>
		_unwrapSingle = null;
	//   37   67:aload_0         
	//   38   68:aconst_null     
	//   39   69:putfield        #27  <Field Boolean _unwrapSingle>
	//   40   72:return          
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
	//    5    6:invokespecial   #54  <Method void ContainerSerializer(Class, boolean)>
			_elementType = javatype;
	//    6    9:aload_0         
	//    7   10:aload_2         
	//    8   11:putfield        #39  <Field JavaType _elementType>
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
	//   18   29:invokevirtual   #60  <Method boolean JavaType.isFinal()>
	//   19   32:ifeq            37
			}
			flag = true;
	//   20   35:iconst_1        
	//   21   36:istore_3        
		}
		_staticTyping = flag;
	//   22   37:aload_0         
	//   23   38:iload_3         
	//   24   39:putfield        #41  <Field boolean _staticTyping>
		_valueTypeSerializer = typeserializer;
	//   25   42:aload_0         
	//   26   43:aload           4
	//   27   45:putfield        #43  <Field TypeSerializer _valueTypeSerializer>
		_property = null;
	//   28   48:aload_0         
	//   29   49:aconst_null     
	//   30   50:putfield        #45  <Field BeanProperty _property>
		_elementSerializer = jsonserializer;
	//   31   53:aload_0         
	//   32   54:aload           5
	//   33   56:putfield        #47  <Field JsonSerializer _elementSerializer>
		_dynamicSerializers = PropertySerializerMap.emptyForProperties();
	//   34   59:aload_0         
	//   35   60:invokestatic    #66  <Method PropertySerializerMap PropertySerializerMap.emptyForProperties()>
	//   36   63:putfield        #49  <Field PropertySerializerMap _dynamicSerializers>
		_unwrapSingle = null;
	//   37   66:aload_0         
	//   38   67:aconst_null     
	//   39   68:putfield        #27  <Field Boolean _unwrapSingle>
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
	//    4    4:getfield        #45  <Field BeanProperty _property>
	//    5    7:invokevirtual   #77  <Method com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.findAndAddSecondarySerializer(JavaType, SerializerProvider, BeanProperty)>
	//    6   10:astore_2        
		if(propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map)
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:getfield        #82  <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//*  10   16:if_acmpeq       27
			_dynamicSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:getfield        #82  <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//   14   24:putfield        #49  <Field PropertySerializerMap _dynamicSerializers>
		return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).serializer;
	//   15   27:aload_2         
	//   16   28:getfield        #85  <Field JsonSerializer com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.serializer>
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
	//    4    4:getfield        #45  <Field BeanProperty _property>
	//    5    7:invokevirtual   #91  <Method com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.findAndAddSecondarySerializer(Class, SerializerProvider, BeanProperty)>
	//    6   10:astore_2        
		if(propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map)
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:getfield        #82  <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//*  10   16:if_acmpeq       27
			_dynamicSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:getfield        #82  <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//   14   24:putfield        #49  <Field PropertySerializerMap _dynamicSerializers>
		return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).serializer;
	//   15   27:aload_2         
	//   16   28:getfield        #85  <Field JsonSerializer com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.serializer>
	//   17   31:areturn         
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer1 = _elementSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field JsonSerializer _elementSerializer>
	//    2    4:astore          4
		JsonSerializer jsonserializer = jsonserializer1;
	//    3    6:aload           4
	//    4    8:astore_3        
		if(jsonserializer1 == null)
	//*   5    9:aload           4
	//*   6   11:ifnonnull       32
			jsonserializer = jsonformatvisitorwrapper.getProvider().findValueSerializer(_elementType, _property);
	//    7   14:aload_1         
	//    8   15:invokeinterface #100 <Method SerializerProvider JsonFormatVisitorWrapper.getProvider()>
	//    9   20:aload_0         
	//   10   21:getfield        #39  <Field JavaType _elementType>
	//   11   24:aload_0         
	//   12   25:getfield        #45  <Field BeanProperty _property>
	//   13   28:invokevirtual   #106 <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, BeanProperty)>
	//   14   31:astore_3        
		visitArrayFormat(jsonformatvisitorwrapper, javatype, jsonserializer, _elementType);
	//   15   32:aload_0         
	//   16   33:aload_1         
	//   17   34:aload_2         
	//   18   35:aload_3         
	//   19   36:aload_0         
	//   20   37:getfield        #39  <Field JavaType _elementType>
	//   21   40:invokevirtual   #110 <Method void visitArrayFormat(JsonFormatVisitorWrapper, JavaType, JsonSerializer, JavaType)>
	//   22   43:return          
	}

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
label0:
		{
			Object obj = ((Object) (_valueTypeSerializer));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field TypeSerializer _valueTypeSerializer>
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
	//    9   14:invokevirtual   #118 <Method TypeSerializer TypeSerializer.forProperty(BeanProperty)>
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
				obj2 = ((Object) (serializerprovider.getAnnotationIntrospector()));
	//   21   36:aload_1         
	//   22   37:invokevirtual   #122 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//   23   40:astore          6
				obj1 = ((Object) (beanproperty.getMember()));
	//   24   42:aload_2         
	//   25   43:invokeinterface #128 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//   26   48:astore          4
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
	//   33   62:invokevirtual   #134 <Method Object AnnotationIntrospector.findContentSerializer(com.fasterxml.jackson.databind.introspect.Annotated)>
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
	//   42   80:invokevirtual   #138 <Method JsonSerializer SerializerProvider.serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, Object)>
	//   43   83:astore_3        
				}
				value = beanproperty.findPropertyFormat(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializerprovider.getConfig())), _handledType);
	//   44   84:aload_2         
	//   45   85:aload_1         
	//   46   86:invokevirtual   #142 <Method com.fasterxml.jackson.databind.SerializationConfig SerializerProvider.getConfig()>
	//   47   89:aload_0         
	//   48   90:getfield        #146 <Field Class _handledType>
	//   49   93:invokeinterface #150 <Method com.fasterxml.jackson.annotation.JsonFormat$Value BeanProperty.findPropertyFormat(com.fasterxml.jackson.databind.cfg.MapperConfig, Class)>
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
	//   58  114:getstatic       #156 <Field com.fasterxml.jackson.annotation.JsonFormat$Feature com.fasterxml.jackson.annotation.JsonFormat$Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//   59  117:invokevirtual   #162 <Method Boolean com.fasterxml.jackson.annotation.JsonFormat$Value.getFeature(com.fasterxml.jackson.annotation.JsonFormat$Feature)>
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
	//   68  134:getfield        #47  <Field JsonSerializer _elementSerializer>
	//   69  137:astore_3        
			obj1 = ((Object) (findConvertingContentSerializer(serializerprovider, beanproperty, ((JsonSerializer) (obj)))));
	//   70  138:aload_0         
	//   71  139:aload_1         
	//   72  140:aload_2         
	//   73  141:aload_3         
	//   74  142:invokevirtual   #166 <Method JsonSerializer findConvertingContentSerializer(SerializerProvider, BeanProperty, JsonSerializer)>
	//   75  145:astore          4
			if(obj1 == null)
	//*  76  147:aload           4
	//*  77  149:ifnonnull       244
			{
				obj = obj1;
	//   78  152:aload           4
	//   79  154:astore_3        
				if(_elementType != null)
	//*  80  155:aload_0         
	//*  81  156:getfield        #39  <Field JavaType _elementType>
	//*  82  159:ifnull          195
				{
					obj = obj1;
	//   83  162:aload           4
	//   84  164:astore_3        
					if(_staticTyping)
	//*  85  165:aload_0         
	//*  86  166:getfield        #41  <Field boolean _staticTyping>
	//*  87  169:ifeq            195
					{
						obj = obj1;
	//   88  172:aload           4
	//   89  174:astore_3        
						if(!_elementType.isJavaLangObject())
	//*  90  175:aload_0         
	//*  91  176:getfield        #39  <Field JavaType _elementType>
	//*  92  179:invokevirtual   #169 <Method boolean JavaType.isJavaLangObject()>
	//*  93  182:ifne            195
							obj = ((Object) (serializerprovider.findValueSerializer(_elementType, beanproperty)));
	//   94  185:aload_1         
	//   95  186:aload_0         
	//   96  187:getfield        #39  <Field JavaType _elementType>
	//   97  190:aload_2         
	//   98  191:invokevirtual   #106 <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, BeanProperty)>
	//   99  194:astore_3        
					}
				}
			} else
	//* 100  195:aload_3         
	//* 101  196:aload_0         
	//* 102  197:getfield        #47  <Field JsonSerializer _elementSerializer>
	//* 103  200:if_acmpne       231
	//* 104  203:aload_2         
	//* 105  204:aload_0         
	//* 106  205:getfield        #45  <Field BeanProperty _property>
	//* 107  208:if_acmpne       231
	//* 108  211:aload_0         
	//* 109  212:getfield        #43  <Field TypeSerializer _valueTypeSerializer>
	//* 110  215:aload           5
	//* 111  217:if_acmpne       231
	//* 112  220:aload_0         
	//* 113  221:astore_1        
	//* 114  222:aload_0         
	//* 115  223:getfield        #27  <Field Boolean _unwrapSingle>
	//* 116  226:aload           6
	//* 117  228:if_acmpeq       242
	//* 118  231:aload_0         
	//* 119  232:aload_2         
	//* 120  233:aload           5
	//* 121  235:aload_3         
	//* 122  236:aload           6
	//* 123  238:invokevirtual   #173 <Method AsArraySerializerBase withResolved(BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//* 124  241:astore_1        
	//* 125  242:aload_1         
	//* 126  243:areturn         
			{
				obj = ((Object) (serializerprovider.handleSecondaryContextualization(((JsonSerializer) (obj1)), beanproperty)));
	//  127  244:aload_1         
	//  128  245:aload           4
	//  129  247:aload_2         
	//  130  248:invokevirtual   #177 <Method JsonSerializer SerializerProvider.handleSecondaryContextualization(JsonSerializer, BeanProperty)>
	//  131  251:astore_3        
			}
			if(obj == _elementSerializer && beanproperty == _property && _valueTypeSerializer == typeserializer)
			{
				serializerprovider = ((SerializerProvider) (this));
				if(_unwrapSingle == obj2)
					break label0;
			}
			serializerprovider = ((SerializerProvider) (withResolved(beanproperty, typeserializer, ((JsonSerializer) (obj)), ((Boolean) (obj2)))));
		}
		return ((JsonSerializer) (serializerprovider));
	//* 132  252:goto            195
	}

	public JsonSerializer getContentSerializer()
	{
		return _elementSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field JsonSerializer _elementSerializer>
	//    2    4:areturn         
	}

	public JavaType getContentType()
	{
		return _elementType;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field JavaType _elementType>
	//    2    4:areturn         
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		throws JsonMappingException
	{
		ObjectNode objectnode = createSchemaNode("array", true);
	//    0    0:aload_0         
	//    1    1:ldc1            #187 <String "array">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #191 <Method ObjectNode createSchemaNode(String, boolean)>
	//    4    7:astore          4
		Object obj1 = ((Object) (_elementType));
	//    5    9:aload_0         
	//    6   10:getfield        #39  <Field JavaType _elementType>
	//    7   13:astore          5
		if(obj1 != null)
	//*   8   15:aload           5
	//*   9   17:ifnull          88
		{
			Object obj = null;
	//   10   20:aconst_null     
	//   11   21:astore_3        
			type = ((Type) (obj));
	//   12   22:aload_3         
	//   13   23:astore_2        
			if(((JavaType) (obj1)).getRawClass() != java/lang/Object)
	//*  14   24:aload           5
	//*  15   26:invokevirtual   #195 <Method Class JavaType.getRawClass()>
	//*  16   29:ldc1            #197 <Class Object>
	//*  17   31:if_acmpeq       69
			{
				obj1 = ((Object) (serializerprovider.findValueSerializer(((JavaType) (obj1)), _property)));
	//   18   34:aload_1         
	//   19   35:aload           5
	//   20   37:aload_0         
	//   21   38:getfield        #45  <Field BeanProperty _property>
	//   22   41:invokevirtual   #106 <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, BeanProperty)>
	//   23   44:astore          5
				type = ((Type) (obj));
	//   24   46:aload_3         
	//   25   47:astore_2        
				if(obj1 instanceof SchemaAware)
	//*  26   48:aload           5
	//*  27   50:instanceof      #199 <Class SchemaAware>
	//*  28   53:ifeq            69
					type = ((Type) (((SchemaAware)obj1).getSchema(serializerprovider, ((Type) (null)))));
	//   29   56:aload           5
	//   30   58:checkcast       #199 <Class SchemaAware>
	//   31   61:aload_1         
	//   32   62:aconst_null     
	//   33   63:invokeinterface #201 <Method JsonNode SchemaAware.getSchema(SerializerProvider, Type)>
	//   34   68:astore_2        
			}
			serializerprovider = ((SerializerProvider) (type));
	//   35   69:aload_2         
	//   36   70:astore_1        
			if(type == null)
	//*  37   71:aload_2         
	//*  38   72:ifnonnull       79
				serializerprovider = ((SerializerProvider) (JsonSchema.getDefaultSchemaNode()));
	//   39   75:invokestatic    #207 <Method JsonNode JsonSchema.getDefaultSchemaNode()>
	//   40   78:astore_1        
			objectnode.set("items", ((JsonNode) (serializerprovider)));
	//   41   79:aload           4
	//   42   81:ldc1            #209 <String "items">
	//   43   83:aload_1         
	//   44   84:invokevirtual   #215 <Method JsonNode ObjectNode.set(String, JsonNode)>
	//   45   87:pop             
		}
		return ((JsonNode) (objectnode));
	//   46   88:aload           4
	//   47   90:areturn         
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && hasSingleElement(obj))
	//*   0    0:aload_3         
	//*   1    1:getstatic       #224 <Field SerializationFeature SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//*   2    4:invokevirtual   #228 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   3    7:ifeq            26
	//*   4   10:aload_0         
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #232 <Method boolean hasSingleElement(Object)>
	//*   7   15:ifeq            26
		{
			serializeContents(obj, jsongenerator, serializerprovider);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:invokevirtual   #235 <Method void serializeContents(Object, JsonGenerator, SerializerProvider)>
			return;
	//   13   25:return          
		} else
		{
			jsongenerator.writeStartArray();
	//   14   26:aload_2         
	//   15   27:invokevirtual   #241 <Method void JsonGenerator.writeStartArray()>
			jsongenerator.setCurrentValue(obj);
	//   16   30:aload_2         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #245 <Method void JsonGenerator.setCurrentValue(Object)>
			serializeContents(obj, jsongenerator, serializerprovider);
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:aload_2         
	//   22   38:aload_3         
	//   23   39:invokevirtual   #235 <Method void serializeContents(Object, JsonGenerator, SerializerProvider)>
			jsongenerator.writeEndArray();
	//   24   42:aload_2         
	//   25   43:invokevirtual   #248 <Method void JsonGenerator.writeEndArray()>
			return;
	//   26   46:return          
		}
	}

	protected abstract void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException;

	public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		typeserializer.writeTypePrefixForArray(obj, jsongenerator);
	//    0    0:aload           4
	//    1    2:aload_1         
	//    2    3:aload_2         
	//    3    4:invokevirtual   #255 <Method void TypeSerializer.writeTypePrefixForArray(Object, JsonGenerator)>
		jsongenerator.setCurrentValue(obj);
	//    4    7:aload_2         
	//    5    8:aload_1         
	//    6    9:invokevirtual   #245 <Method void JsonGenerator.setCurrentValue(Object)>
		serializeContents(obj, jsongenerator, serializerprovider);
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:aload_2         
	//   10   15:aload_3         
	//   11   16:invokevirtual   #235 <Method void serializeContents(Object, JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffixForArray(obj, jsongenerator);
	//   12   19:aload           4
	//   13   21:aload_1         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #258 <Method void TypeSerializer.writeTypeSuffixForArray(Object, JsonGenerator)>
	//   16   26:return          
	}

	public final AsArraySerializerBase withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer)
	{
		return withResolved(beanproperty, typeserializer, jsonserializer, _unwrapSingle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload_0         
	//    5    5:getfield        #27  <Field Boolean _unwrapSingle>
	//    6    8:invokevirtual   #173 <Method AsArraySerializerBase withResolved(BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//    7   11:areturn         
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
