// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//			PropertySerializerMap

public class MapEntrySerializer extends ContainerSerializer
	implements ContextualSerializer
{

	public MapEntrySerializer(JavaType javatype, JavaType javatype1, JavaType javatype2, boolean flag, TypeSerializer typeserializer, BeanProperty beanproperty)
	{
		super(javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method void ContainerSerializer(JavaType)>
		_entryType = javatype;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #31  <Field JavaType _entryType>
		_keyType = javatype1;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #33  <Field JavaType _keyType>
		_valueType = javatype2;
	//    9   15:aload_0         
	//   10   16:aload_3         
	//   11   17:putfield        #35  <Field JavaType _valueType>
		_valueTypeIsStatic = flag;
	//   12   20:aload_0         
	//   13   21:iload           4
	//   14   23:putfield        #37  <Field boolean _valueTypeIsStatic>
		_valueTypeSerializer = typeserializer;
	//   15   26:aload_0         
	//   16   27:aload           5
	//   17   29:putfield        #39  <Field TypeSerializer _valueTypeSerializer>
		_property = beanproperty;
	//   18   32:aload_0         
	//   19   33:aload           6
	//   20   35:putfield        #41  <Field BeanProperty _property>
		_dynamicValueSerializers = PropertySerializerMap.emptyForProperties();
	//   21   38:aload_0         
	//   22   39:invokestatic    #47  <Method PropertySerializerMap PropertySerializerMap.emptyForProperties()>
	//   23   42:putfield        #49  <Field PropertySerializerMap _dynamicValueSerializers>
	//   24   45:return          
	}

	protected MapEntrySerializer(MapEntrySerializer mapentryserializer, BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, JsonSerializer jsonserializer1)
	{
		super(java/util/Map, false);
	//    0    0:aload_0         
	//    1    1:ldc1            #53  <Class Map>
	//    2    3:iconst_0        
	//    3    4:invokespecial   #56  <Method void ContainerSerializer(Class, boolean)>
		_entryType = mapentryserializer._entryType;
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:getfield        #31  <Field JavaType _entryType>
	//    7   12:putfield        #31  <Field JavaType _entryType>
		_keyType = mapentryserializer._keyType;
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:getfield        #33  <Field JavaType _keyType>
	//   11   20:putfield        #33  <Field JavaType _keyType>
		_valueType = mapentryserializer._valueType;
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:getfield        #35  <Field JavaType _valueType>
	//   15   28:putfield        #35  <Field JavaType _valueType>
		_valueTypeIsStatic = mapentryserializer._valueTypeIsStatic;
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:getfield        #37  <Field boolean _valueTypeIsStatic>
	//   19   36:putfield        #37  <Field boolean _valueTypeIsStatic>
		_valueTypeSerializer = mapentryserializer._valueTypeSerializer;
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:getfield        #39  <Field TypeSerializer _valueTypeSerializer>
	//   23   44:putfield        #39  <Field TypeSerializer _valueTypeSerializer>
		_keySerializer = jsonserializer;
	//   24   47:aload_0         
	//   25   48:aload           4
	//   26   50:putfield        #58  <Field JsonSerializer _keySerializer>
		_valueSerializer = jsonserializer1;
	//   27   53:aload_0         
	//   28   54:aload           5
	//   29   56:putfield        #60  <Field JsonSerializer _valueSerializer>
		_dynamicValueSerializers = mapentryserializer._dynamicValueSerializers;
	//   30   59:aload_0         
	//   31   60:aload_1         
	//   32   61:getfield        #49  <Field PropertySerializerMap _dynamicValueSerializers>
	//   33   64:putfield        #49  <Field PropertySerializerMap _dynamicValueSerializers>
		_property = mapentryserializer._property;
	//   34   67:aload_0         
	//   35   68:aload_1         
	//   36   69:getfield        #41  <Field BeanProperty _property>
	//   37   72:putfield        #41  <Field BeanProperty _property>
	//   38   75:return          
	}

	protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, JavaType javatype, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		javatype = ((JavaType) (propertyserializermap.findAndAddSecondarySerializer(javatype, serializerprovider, _property)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload_0         
	//    4    4:getfield        #41  <Field BeanProperty _property>
	//    5    7:invokevirtual   #70  <Method PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.findAndAddSecondarySerializer(JavaType, SerializerProvider, BeanProperty)>
	//    6   10:astore_2        
		if(propertyserializermap != ((PropertySerializerMap.SerializerAndMapResult) (javatype)).map)
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:getfield        #75  <Field PropertySerializerMap PropertySerializerMap$SerializerAndMapResult.map>
	//*  10   16:if_acmpeq       27
			_dynamicValueSerializers = ((PropertySerializerMap.SerializerAndMapResult) (javatype)).map;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:getfield        #75  <Field PropertySerializerMap PropertySerializerMap$SerializerAndMapResult.map>
	//   14   24:putfield        #49  <Field PropertySerializerMap _dynamicValueSerializers>
		return ((PropertySerializerMap.SerializerAndMapResult) (javatype)).serializer;
	//   15   27:aload_2         
	//   16   28:getfield        #78  <Field JsonSerializer PropertySerializerMap$SerializerAndMapResult.serializer>
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
	//    4    4:getfield        #41  <Field BeanProperty _property>
	//    5    7:invokevirtual   #84  <Method PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.findAndAddSecondarySerializer(Class, SerializerProvider, BeanProperty)>
	//    6   10:astore_2        
		if(propertyserializermap != ((PropertySerializerMap.SerializerAndMapResult) (class1)).map)
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:getfield        #75  <Field PropertySerializerMap PropertySerializerMap$SerializerAndMapResult.map>
	//*  10   16:if_acmpeq       27
			_dynamicValueSerializers = ((PropertySerializerMap.SerializerAndMapResult) (class1)).map;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:getfield        #75  <Field PropertySerializerMap PropertySerializerMap$SerializerAndMapResult.map>
	//   14   24:putfield        #49  <Field PropertySerializerMap _dynamicValueSerializers>
		return ((PropertySerializerMap.SerializerAndMapResult) (class1)).serializer;
	//   15   27:aload_2         
	//   16   28:getfield        #78  <Field JsonSerializer PropertySerializerMap$SerializerAndMapResult.serializer>
	//   17   31:areturn         
	}

	public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
	{
		return ((ContainerSerializer) (new MapEntrySerializer(this, _property, typeserializer, _keySerializer, _valueSerializer)));
	//    0    0:new             #2   <Class MapEntrySerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #41  <Field BeanProperty _property>
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #58  <Field JsonSerializer _keySerializer>
	//    8   14:aload_0         
	//    9   15:getfield        #60  <Field JsonSerializer _valueSerializer>
	//   10   18:invokespecial   #89  <Method void MapEntrySerializer(MapEntrySerializer, BeanProperty, TypeSerializer, JsonSerializer, JsonSerializer)>
	//   11   21:areturn         
	}

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj4 = null;
	//    0    0:aconst_null     
	//    1    1:astore          7
		Object obj5 = null;
	//    2    3:aconst_null     
	//    3    4:astore          8
		Object obj2 = null;
	//    4    6:aconst_null     
	//    5    7:astore          5
		AnnotationIntrospector annotationintrospector = serializerprovider.getAnnotationIntrospector();
	//    6    9:aload_1         
	//    7   10:invokevirtual   #98  <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//    8   13:astore          9
		Object obj;
		Object obj1;
		Object obj3;
		if(beanproperty == null)
	//*   9   15:aload_2         
	//*  10   16:ifnonnull       204
			obj3 = null;
	//   11   19:aconst_null     
	//   12   20:astore          6
		else
	//*  13   22:aload           8
	//*  14   24:astore_3        
	//*  15   25:aload           7
	//*  16   27:astore          4
	//*  17   29:aload           6
	//*  18   31:ifnull          101
	//*  19   34:aload           8
	//*  20   36:astore_3        
	//*  21   37:aload           7
	//*  22   39:astore          4
	//*  23   41:aload           9
	//*  24   43:ifnull          101
	//*  25   46:aload           9
	//*  26   48:aload           6
	//*  27   50:invokevirtual   #104 <Method Object AnnotationIntrospector.findKeySerializer(com.fasterxml.jackson.databind.introspect.Annotated)>
	//*  28   53:astore_3        
	//*  29   54:aload_3         
	//*  30   55:ifnull          67
	//*  31   58:aload_1         
	//*  32   59:aload           6
	//*  33   61:aload_3         
	//*  34   62:invokevirtual   #108 <Method JsonSerializer SerializerProvider.serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, Object)>
	//*  35   65:astore          5
	//*  36   67:aload           9
	//*  37   69:aload           6
	//*  38   71:invokevirtual   #111 <Method Object AnnotationIntrospector.findContentSerializer(com.fasterxml.jackson.databind.introspect.Annotated)>
	//*  39   74:astore          8
	//*  40   76:aload           5
	//*  41   78:astore_3        
	//*  42   79:aload           7
	//*  43   81:astore          4
	//*  44   83:aload           8
	//*  45   85:ifnull          101
	//*  46   88:aload_1         
	//*  47   89:aload           6
	//*  48   91:aload           8
	//*  49   93:invokevirtual   #108 <Method JsonSerializer SerializerProvider.serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, Object)>
	//*  50   96:astore          4
	//*  51   98:aload           5
	//*  52  100:astore_3        
	//*  53  101:aload           4
	//*  54  103:astore          5
	//*  55  105:aload           4
	//*  56  107:ifnonnull       116
	//*  57  110:aload_0         
	//*  58  111:getfield        #60  <Field JsonSerializer _valueSerializer>
	//*  59  114:astore          5
	//*  60  116:aload_0         
	//*  61  117:aload_1         
	//*  62  118:aload_2         
	//*  63  119:aload           5
	//*  64  121:invokevirtual   #115 <Method JsonSerializer findConvertingContentSerializer(SerializerProvider, BeanProperty, JsonSerializer)>
	//*  65  124:astore          5
	//*  66  126:aload           5
	//*  67  128:ifnonnull       215
	//*  68  131:aload           5
	//*  69  133:astore          4
	//*  70  135:aload_0         
	//*  71  136:getfield        #37  <Field boolean _valueTypeIsStatic>
	//*  72  139:ifeq            167
	//*  73  142:aload           5
	//*  74  144:astore          4
	//*  75  146:aload_0         
	//*  76  147:getfield        #35  <Field JavaType _valueType>
	//*  77  150:invokevirtual   #121 <Method boolean JavaType.isJavaLangObject()>
	//*  78  153:ifne            167
	//*  79  156:aload_1         
	//*  80  157:aload_0         
	//*  81  158:getfield        #35  <Field JavaType _valueType>
	//*  82  161:aload_2         
	//*  83  162:invokevirtual   #125 <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, BeanProperty)>
	//*  84  165:astore          4
	//*  85  167:aload_3         
	//*  86  168:astore          5
	//*  87  170:aload_3         
	//*  88  171:ifnonnull       180
	//*  89  174:aload_0         
	//*  90  175:getfield        #58  <Field JsonSerializer _keySerializer>
	//*  91  178:astore          5
	//*  92  180:aload           5
	//*  93  182:ifnonnull       227
	//*  94  185:aload_1         
	//*  95  186:aload_0         
	//*  96  187:getfield        #33  <Field JavaType _keyType>
	//*  97  190:aload_2         
	//*  98  191:invokevirtual   #127 <Method JsonSerializer SerializerProvider.findKeySerializer(JavaType, BeanProperty)>
	//*  99  194:astore_1        
	//* 100  195:aload_0         
	//* 101  196:aload_2         
	//* 102  197:aload_1         
	//* 103  198:aload           4
	//* 104  200:invokevirtual   #131 <Method MapEntrySerializer withResolved(BeanProperty, JsonSerializer, JsonSerializer)>
	//* 105  203:areturn         
			obj3 = ((Object) (beanproperty.getMember()));
	//  106  204:aload_2         
	//  107  205:invokeinterface #137 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//  108  210:astore          6
		obj = ((Object) (obj5));
		obj1 = ((Object) (obj4));
		if(obj3 != null)
		{
			obj = ((Object) (obj5));
			obj1 = ((Object) (obj4));
			if(annotationintrospector != null)
			{
				obj = annotationintrospector.findKeySerializer(((com.fasterxml.jackson.databind.introspect.Annotated) (obj3)));
				if(obj != null)
					obj2 = ((Object) (serializerprovider.serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj3)), obj)));
				Object obj6 = annotationintrospector.findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated) (obj3)));
				obj = obj2;
				obj1 = ((Object) (obj4));
				if(obj6 != null)
				{
					obj1 = ((Object) (serializerprovider.serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj3)), obj6)));
					obj = obj2;
				}
			}
		}
		obj2 = obj1;
		if(obj1 == null)
			obj2 = ((Object) (_valueSerializer));
		obj2 = ((Object) (findConvertingContentSerializer(serializerprovider, beanproperty, ((JsonSerializer) (obj2)))));
		if(obj2 == null)
		{
			obj1 = obj2;
			if(_valueTypeIsStatic)
			{
				obj1 = obj2;
				if(!_valueType.isJavaLangObject())
					obj1 = ((Object) (serializerprovider.findValueSerializer(_valueType, beanproperty)));
			}
		} else
	//* 109  212:goto            22
		{
			obj1 = ((Object) (serializerprovider.handleSecondaryContextualization(((JsonSerializer) (obj2)), beanproperty)));
	//  110  215:aload_1         
	//  111  216:aload           5
	//  112  218:aload_2         
	//  113  219:invokevirtual   #141 <Method JsonSerializer SerializerProvider.handleSecondaryContextualization(JsonSerializer, BeanProperty)>
	//  114  222:astore          4
		}
		obj2 = obj;
		if(obj == null)
			obj2 = ((Object) (_keySerializer));
		if(obj2 == null)
			serializerprovider = ((SerializerProvider) (serializerprovider.findKeySerializer(_keyType, beanproperty)));
		else
	//* 115  224:goto            167
			serializerprovider = ((SerializerProvider) (serializerprovider.handleSecondaryContextualization(((JsonSerializer) (obj2)), beanproperty)));
	//  116  227:aload_1         
	//  117  228:aload           5
	//  118  230:aload_2         
	//  119  231:invokevirtual   #141 <Method JsonSerializer SerializerProvider.handleSecondaryContextualization(JsonSerializer, BeanProperty)>
	//  120  234:astore_1        
		return ((JsonSerializer) (withResolved(beanproperty, ((JsonSerializer) (serializerprovider)), ((JsonSerializer) (obj1)))));
	//* 121  235:goto            195
	}

	public JsonSerializer getContentSerializer()
	{
		return _valueSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field JsonSerializer _valueSerializer>
	//    2    4:areturn         
	}

	public JavaType getContentType()
	{
		return _valueType;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field JavaType _valueType>
	//    2    4:areturn         
	}

	public volatile boolean hasSingleElement(Object obj)
	{
		return hasSingleElement((java.util.Map.Entry)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #151 <Class java.util.Map$Entry>
	//    3    5:invokevirtual   #154 <Method boolean hasSingleElement(java.util.Map$Entry)>
	//    4    8:ireturn         
	}

	public boolean hasSingleElement(java.util.Map.Entry entry)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return isEmpty(serializerprovider, (java.util.Map.Entry)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #151 <Class java.util.Map$Entry>
	//    4    6:invokevirtual   #160 <Method boolean isEmpty(SerializerProvider, java.util.Map$Entry)>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, java.util.Map.Entry entry)
	{
		return entry == null;
	//    0    0:aload_2         
	//    1    1:ifnonnull       6
	//    2    4:iconst_1        
	//    3    5:ireturn         
	//    4    6:iconst_0        
	//    5    7:ireturn         
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((java.util.Map.Entry)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #151 <Class java.util.Map$Entry>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #168 <Method void serialize(java.util.Map$Entry, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(java.util.Map.Entry entry, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.writeStartObject();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #174 <Method void JsonGenerator.writeStartObject()>
		jsongenerator.setCurrentValue(((Object) (entry)));
	//    2    4:aload_2         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #178 <Method void JsonGenerator.setCurrentValue(Object)>
		if(_valueSerializer != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #60  <Field JsonSerializer _valueSerializer>
	//*   7   13:ifnull          32
			serializeUsing(entry, jsongenerator, serializerprovider, _valueSerializer);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:aload_3         
	//   12   20:aload_0         
	//   13   21:getfield        #60  <Field JsonSerializer _valueSerializer>
	//   14   24:invokevirtual   #182 <Method void serializeUsing(java.util.Map$Entry, JsonGenerator, SerializerProvider, JsonSerializer)>
		else
	//*  15   27:aload_2         
	//*  16   28:invokevirtual   #185 <Method void JsonGenerator.writeEndObject()>
	//*  17   31:return          
			serializeDynamic(entry, jsongenerator, serializerprovider);
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:aload_2         
	//   21   35:aload_3         
	//   22   36:invokevirtual   #188 <Method void serializeDynamic(java.util.Map$Entry, JsonGenerator, SerializerProvider)>
		jsongenerator.writeEndObject();
	//*  23   39:goto            27
	}

	protected void serializeDynamic(java.util.Map.Entry entry, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		boolean flag;
		JsonSerializer jsonserializer;
		Object obj;
		TypeSerializer typeserializer;
		Object obj1;
		PropertySerializerMap propertyserializermap1;
		jsonserializer = _keySerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field JsonSerializer _keySerializer>
	//    2    4:astore          5
		if(!serializerprovider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES))
	//*   3    6:aload_3         
	//*   4    7:getstatic       #197 <Field SerializationFeature SerializationFeature.WRITE_NULL_MAP_VALUES>
	//*   5   10:invokevirtual   #201 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   6   13:ifne            81
			flag = true;
	//    7   16:iconst_1        
	//    8   17:istore          4
		else
	//*   9   19:aload_0         
	//*  10   20:getfield        #39  <Field TypeSerializer _valueTypeSerializer>
	//*  11   23:astore          8
	//*  12   25:aload_0         
	//*  13   26:getfield        #49  <Field PropertySerializerMap _dynamicValueSerializers>
	//*  14   29:astore          10
	//*  15   31:aload_1         
	//*  16   32:invokeinterface #205 <Method Object java.util.Map$Entry.getValue()>
	//*  17   37:astore          9
	//*  18   39:aload_1         
	//*  19   40:invokeinterface #208 <Method Object java.util.Map$Entry.getKey()>
	//*  20   45:astore          7
	//*  21   47:aload           7
	//*  22   49:ifnonnull       87
	//*  23   52:aload_3         
	//*  24   53:aload_0         
	//*  25   54:getfield        #33  <Field JavaType _keyType>
	//*  26   57:aload_0         
	//*  27   58:getfield        #41  <Field BeanProperty _property>
	//*  28   61:invokevirtual   #211 <Method JsonSerializer SerializerProvider.findNullKeySerializer(JavaType, BeanProperty)>
	//*  29   64:aconst_null     
	//*  30   65:aload_2         
	//*  31   66:aload_3         
	//*  32   67:invokevirtual   #215 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//*  33   70:aload           9
	//*  34   72:ifnonnull       109
	//*  35   75:aload_3         
	//*  36   76:aload_2         
	//*  37   77:invokevirtual   #219 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
	//*  38   80:return          
			flag = false;
	//   39   81:iconst_0        
	//   40   82:istore          4
		typeserializer = _valueTypeSerializer;
		propertyserializermap1 = _dynamicValueSerializers;
		obj1 = entry.getValue();
		obj = entry.getKey();
		if(obj != null) goto _L2; else goto _L1
_L1:
		serializerprovider.findNullKeySerializer(_keyType, _property).serialize(((Object) (null)), jsongenerator, serializerprovider);
_L6:
		if(obj1 != null)
			break; /* Loop/switch isn't completed */
		serializerprovider.defaultSerializeNull(jsongenerator);
_L4:
		return;
	//*  41   84:goto            19
_L2:
		if(flag && obj1 == null) goto _L4; else goto _L3
	//   42   87:iload           4
	//   43   89:ifeq            97
	//   44   92:aload           9
	//   45   94:ifnull          80
_L3:
		jsonserializer.serialize(obj, jsongenerator, serializerprovider);
	//   46   97:aload           5
	//   47   99:aload           7
	//   48  101:aload_2         
	//   49  102:aload_3         
	//   50  103:invokevirtual   #215 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
		if(true) goto _L6; else goto _L5
	//   51  106:goto            70
_L5:
		Class class1 = obj1.getClass();
	//   52  109:aload           9
	//   53  111:invokevirtual   #225 <Method Class Object.getClass()>
	//   54  114:astore          11
		JsonSerializer jsonserializer1 = propertyserializermap1.serializerFor(class1);
	//   55  116:aload           10
	//   56  118:aload           11
	//   57  120:invokevirtual   #229 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//   58  123:astore          6
		jsonserializer = jsonserializer1;
	//   59  125:aload           6
	//   60  127:astore          5
		if(jsonserializer1 == null)
	//*  61  129:aload           6
	//*  62  131:ifnonnull       169
		{
			PropertySerializerMap propertyserializermap;
			if(_valueType.hasGenericTypes())
	//*  63  134:aload_0         
	//*  64  135:getfield        #35  <Field JavaType _valueType>
	//*  65  138:invokevirtual   #232 <Method boolean JavaType.hasGenericTypes()>
	//*  66  141:ifeq            213
				jsonserializer = _findAndAddDynamic(propertyserializermap1, serializerprovider.constructSpecializedType(_valueType, class1), serializerprovider);
	//   67  144:aload_0         
	//   68  145:aload           10
	//   69  147:aload_3         
	//   70  148:aload_0         
	//   71  149:getfield        #35  <Field JavaType _valueType>
	//   72  152:aload           11
	//   73  154:invokevirtual   #236 <Method JavaType SerializerProvider.constructSpecializedType(JavaType, Class)>
	//   74  157:aload_3         
	//   75  158:invokevirtual   #238 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, JavaType, SerializerProvider)>
	//   76  161:astore          5
			else
	//*  77  163:aload_0         
	//*  78  164:getfield        #49  <Field PropertySerializerMap _dynamicValueSerializers>
	//*  79  167:astore          6
	//*  80  169:aload           8
	//*  81  171:ifnonnull       227
	//*  82  174:aload           5
	//*  83  176:aload           9
	//*  84  178:aload_2         
	//*  85  179:aload_3         
	//*  86  180:invokevirtual   #215 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//*  87  183:return          
	//*  88  184:astore_2        
	//*  89  185:aload_0         
	//*  90  186:aload_3         
	//*  91  187:aload_2         
	//*  92  188:aload_1         
	//*  93  189:new             #240 <Class StringBuilder>
	//*  94  192:dup             
	//*  95  193:invokespecial   #242 <Method void StringBuilder()>
	//*  96  196:ldc1            #244 <String "">
	//*  97  198:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//*  98  201:aload           7
	//*  99  203:invokevirtual   #251 <Method StringBuilder StringBuilder.append(Object)>
	//* 100  206:invokevirtual   #255 <Method String StringBuilder.toString()>
	//* 101  209:invokevirtual   #259 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, String)>
	//* 102  212:return          
				jsonserializer = _findAndAddDynamic(propertyserializermap1, class1, serializerprovider);
	//  103  213:aload_0         
	//  104  214:aload           10
	//  105  216:aload           11
	//  106  218:aload_3         
	//  107  219:invokevirtual   #261 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//  108  222:astore          5
			propertyserializermap = _dynamicValueSerializers;
		}
		if(typeserializer == null)
		{
			try
			{
				jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
				return;
			}
			// Misplaced declaration of an exception variable
			catch(JsonGenerator jsongenerator)
			{
				wrapAndThrow(serializerprovider, ((Throwable) (jsongenerator)), ((Object) (entry)), (new StringBuilder()).append("").append(obj).toString());
			}
			return;
		}
	//* 109  224:goto            163
		jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, typeserializer);
	//  110  227:aload           5
	//  111  229:aload           9
	//  112  231:aload_2         
	//  113  232:aload_3         
	//  114  233:aload           8
	//  115  235:invokevirtual   #265 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
		return;
	//  116  238:return          
	}

	protected void serializeUsing(java.util.Map.Entry entry, JsonGenerator jsongenerator, SerializerProvider serializerprovider, JsonSerializer jsonserializer)
		throws IOException, JsonGenerationException
	{
		boolean flag;
		Object obj;
		JsonSerializer jsonserializer1;
		TypeSerializer typeserializer;
		Object obj1;
		jsonserializer1 = _keySerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field JsonSerializer _keySerializer>
	//    2    4:astore          7
		typeserializer = _valueTypeSerializer;
	//    3    6:aload_0         
	//    4    7:getfield        #39  <Field TypeSerializer _valueTypeSerializer>
	//    5   10:astore          8
		if(!serializerprovider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES))
	//*   6   12:aload_3         
	//*   7   13:getstatic       #197 <Field SerializationFeature SerializationFeature.WRITE_NULL_MAP_VALUES>
	//*   8   16:invokevirtual   #201 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   9   19:ifne            75
			flag = true;
	//   10   22:iconst_1        
	//   11   23:istore          5
		else
	//*  12   25:aload_1         
	//*  13   26:invokeinterface #205 <Method Object java.util.Map$Entry.getValue()>
	//*  14   31:astore          9
	//*  15   33:aload_1         
	//*  16   34:invokeinterface #208 <Method Object java.util.Map$Entry.getKey()>
	//*  17   39:astore          6
	//*  18   41:aload           6
	//*  19   43:ifnonnull       81
	//*  20   46:aload_3         
	//*  21   47:aload_0         
	//*  22   48:getfield        #33  <Field JavaType _keyType>
	//*  23   51:aload_0         
	//*  24   52:getfield        #41  <Field BeanProperty _property>
	//*  25   55:invokevirtual   #211 <Method JsonSerializer SerializerProvider.findNullKeySerializer(JavaType, BeanProperty)>
	//*  26   58:aconst_null     
	//*  27   59:aload_2         
	//*  28   60:aload_3         
	//*  29   61:invokevirtual   #215 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//*  30   64:aload           9
	//*  31   66:ifnonnull       103
	//*  32   69:aload_3         
	//*  33   70:aload_2         
	//*  34   71:invokevirtual   #219 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
	//*  35   74:return          
			flag = false;
	//   36   75:iconst_0        
	//   37   76:istore          5
		obj1 = entry.getValue();
		obj = entry.getKey();
		if(obj != null) goto _L2; else goto _L1
_L1:
		serializerprovider.findNullKeySerializer(_keyType, _property).serialize(((Object) (null)), jsongenerator, serializerprovider);
_L6:
		if(obj1 != null)
			break; /* Loop/switch isn't completed */
		serializerprovider.defaultSerializeNull(jsongenerator);
_L4:
		return;
	//*  38   78:goto            25
_L2:
		if(flag && obj1 == null) goto _L4; else goto _L3
	//   39   81:iload           5
	//   40   83:ifeq            91
	//   41   86:aload           9
	//   42   88:ifnull          74
_L3:
		jsonserializer1.serialize(obj, jsongenerator, serializerprovider);
	//   43   91:aload           7
	//   44   93:aload           6
	//   45   95:aload_2         
	//   46   96:aload_3         
	//   47   97:invokevirtual   #215 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
		if(true) goto _L6; else goto _L5
	//   48  100:goto            64
_L5:
		if(typeserializer == null)
	//*  49  103:aload           8
	//*  50  105:ifnonnull       147
		{
			try
			{
				jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
	//   51  108:aload           4
	//   52  110:aload           9
	//   53  112:aload_2         
	//   54  113:aload_3         
	//   55  114:invokevirtual   #215 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
				return;
	//   56  117:return          
			}
			// Misplaced declaration of an exception variable
			catch(JsonGenerator jsongenerator)
	//*  57  118:astore_2        
			{
				wrapAndThrow(serializerprovider, ((Throwable) (jsongenerator)), ((Object) (entry)), (new StringBuilder()).append("").append(obj).toString());
	//   58  119:aload_0         
	//   59  120:aload_3         
	//   60  121:aload_2         
	//   61  122:aload_1         
	//   62  123:new             #240 <Class StringBuilder>
	//   63  126:dup             
	//   64  127:invokespecial   #242 <Method void StringBuilder()>
	//   65  130:ldc1            #244 <String "">
	//   66  132:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   67  135:aload           6
	//   68  137:invokevirtual   #251 <Method StringBuilder StringBuilder.append(Object)>
	//   69  140:invokevirtual   #255 <Method String StringBuilder.toString()>
	//   70  143:invokevirtual   #259 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, String)>
			}
			return;
	//   71  146:return          
		}
		jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, typeserializer);
	//   72  147:aload           4
	//   73  149:aload           9
	//   74  151:aload_2         
	//   75  152:aload_3         
	//   76  153:aload           8
	//   77  155:invokevirtual   #265 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
		return;
	//   78  158:return          
	}

	public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		serializeWithType((java.util.Map.Entry)obj, jsongenerator, serializerprovider, typeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #151 <Class java.util.Map$Entry>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #271 <Method void serializeWithType(java.util.Map$Entry, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}

	public void serializeWithType(java.util.Map.Entry entry, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		typeserializer.writeTypePrefixForObject(((Object) (entry)), jsongenerator);
	//    0    0:aload           4
	//    1    2:aload_1         
	//    2    3:aload_2         
	//    3    4:invokevirtual   #277 <Method void TypeSerializer.writeTypePrefixForObject(Object, JsonGenerator)>
		jsongenerator.setCurrentValue(((Object) (entry)));
	//    4    7:aload_2         
	//    5    8:aload_1         
	//    6    9:invokevirtual   #178 <Method void JsonGenerator.setCurrentValue(Object)>
		if(_valueSerializer != null)
	//*   7   12:aload_0         
	//*   8   13:getfield        #60  <Field JsonSerializer _valueSerializer>
	//*   9   16:ifnull          38
			serializeUsing(entry, jsongenerator, serializerprovider, _valueSerializer);
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:aload_2         
	//   13   22:aload_3         
	//   14   23:aload_0         
	//   15   24:getfield        #60  <Field JsonSerializer _valueSerializer>
	//   16   27:invokevirtual   #182 <Method void serializeUsing(java.util.Map$Entry, JsonGenerator, SerializerProvider, JsonSerializer)>
		else
	//*  17   30:aload           4
	//*  18   32:aload_1         
	//*  19   33:aload_2         
	//*  20   34:invokevirtual   #280 <Method void TypeSerializer.writeTypeSuffixForObject(Object, JsonGenerator)>
	//*  21   37:return          
			serializeDynamic(entry, jsongenerator, serializerprovider);
	//   22   38:aload_0         
	//   23   39:aload_1         
	//   24   40:aload_2         
	//   25   41:aload_3         
	//   26   42:invokevirtual   #188 <Method void serializeDynamic(java.util.Map$Entry, JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffixForObject(((Object) (entry)), jsongenerator);
	//*  27   45:goto            30
	}

	public MapEntrySerializer withResolved(BeanProperty beanproperty, JsonSerializer jsonserializer, JsonSerializer jsonserializer1)
	{
		return new MapEntrySerializer(this, beanproperty, _valueTypeSerializer, jsonserializer, jsonserializer1);
	//    0    0:new             #2   <Class MapEntrySerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #39  <Field TypeSerializer _valueTypeSerializer>
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #89  <Method void MapEntrySerializer(MapEntrySerializer, BeanProperty, TypeSerializer, JsonSerializer, JsonSerializer)>
	//    9   15:areturn         
	}

	protected PropertySerializerMap _dynamicValueSerializers;
	protected final JavaType _entryType;
	protected JsonSerializer _keySerializer;
	protected final JavaType _keyType;
	protected final BeanProperty _property;
	protected JsonSerializer _valueSerializer;
	protected final JavaType _valueType;
	protected final boolean _valueTypeIsStatic;
	protected final TypeSerializer _valueTypeSerializer;
}
