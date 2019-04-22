// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.BeanUtil;
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
	//    2    2:invokespecial   #46  <Method void ContainerSerializer(JavaType)>
		_entryType = javatype;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #48  <Field JavaType _entryType>
		_keyType = javatype1;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #50  <Field JavaType _keyType>
		_valueType = javatype2;
	//    9   15:aload_0         
	//   10   16:aload_3         
	//   11   17:putfield        #52  <Field JavaType _valueType>
		_valueTypeIsStatic = flag;
	//   12   20:aload_0         
	//   13   21:iload           4
	//   14   23:putfield        #54  <Field boolean _valueTypeIsStatic>
		_valueTypeSerializer = typeserializer;
	//   15   26:aload_0         
	//   16   27:aload           5
	//   17   29:putfield        #56  <Field TypeSerializer _valueTypeSerializer>
		_property = beanproperty;
	//   18   32:aload_0         
	//   19   33:aload           6
	//   20   35:putfield        #58  <Field BeanProperty _property>
		_dynamicValueSerializers = PropertySerializerMap.emptyForProperties();
	//   21   38:aload_0         
	//   22   39:invokestatic    #64  <Method PropertySerializerMap PropertySerializerMap.emptyForProperties()>
	//   23   42:putfield        #66  <Field PropertySerializerMap _dynamicValueSerializers>
		_suppressableValue = null;
	//   24   45:aload_0         
	//   25   46:aconst_null     
	//   26   47:putfield        #68  <Field Object _suppressableValue>
		_suppressNulls = false;
	//   27   50:aload_0         
	//   28   51:iconst_0        
	//   29   52:putfield        #70  <Field boolean _suppressNulls>
	//   30   55:return          
	}

	protected MapEntrySerializer(MapEntrySerializer mapentryserializer, BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, JsonSerializer jsonserializer1, Object obj, boolean flag)
	{
		super(java/util/Map, false);
	//    0    0:aload_0         
	//    1    1:ldc1            #73  <Class Map>
	//    2    3:iconst_0        
	//    3    4:invokespecial   #76  <Method void ContainerSerializer(Class, boolean)>
		_entryType = mapentryserializer._entryType;
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:getfield        #48  <Field JavaType _entryType>
	//    7   12:putfield        #48  <Field JavaType _entryType>
		_keyType = mapentryserializer._keyType;
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:getfield        #50  <Field JavaType _keyType>
	//   11   20:putfield        #50  <Field JavaType _keyType>
		_valueType = mapentryserializer._valueType;
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:getfield        #52  <Field JavaType _valueType>
	//   15   28:putfield        #52  <Field JavaType _valueType>
		_valueTypeIsStatic = mapentryserializer._valueTypeIsStatic;
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:getfield        #54  <Field boolean _valueTypeIsStatic>
	//   19   36:putfield        #54  <Field boolean _valueTypeIsStatic>
		_valueTypeSerializer = mapentryserializer._valueTypeSerializer;
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:getfield        #56  <Field TypeSerializer _valueTypeSerializer>
	//   23   44:putfield        #56  <Field TypeSerializer _valueTypeSerializer>
		_keySerializer = jsonserializer;
	//   24   47:aload_0         
	//   25   48:aload           4
	//   26   50:putfield        #78  <Field JsonSerializer _keySerializer>
		_valueSerializer = jsonserializer1;
	//   27   53:aload_0         
	//   28   54:aload           5
	//   29   56:putfield        #80  <Field JsonSerializer _valueSerializer>
		_dynamicValueSerializers = mapentryserializer._dynamicValueSerializers;
	//   30   59:aload_0         
	//   31   60:aload_1         
	//   32   61:getfield        #66  <Field PropertySerializerMap _dynamicValueSerializers>
	//   33   64:putfield        #66  <Field PropertySerializerMap _dynamicValueSerializers>
		_property = mapentryserializer._property;
	//   34   67:aload_0         
	//   35   68:aload_1         
	//   36   69:getfield        #58  <Field BeanProperty _property>
	//   37   72:putfield        #58  <Field BeanProperty _property>
		_suppressableValue = obj;
	//   38   75:aload_0         
	//   39   76:aload           6
	//   40   78:putfield        #68  <Field Object _suppressableValue>
		_suppressNulls = flag;
	//   41   81:aload_0         
	//   42   82:iload           7
	//   43   84:putfield        #70  <Field boolean _suppressNulls>
	//   44   87:return          
	}

	protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, JavaType javatype, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		javatype = ((JavaType) (propertyserializermap.findAndAddSecondarySerializer(javatype, serializerprovider, _property)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload_0         
	//    4    4:getfield        #58  <Field BeanProperty _property>
	//    5    7:invokevirtual   #90  <Method PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.findAndAddSecondarySerializer(JavaType, SerializerProvider, BeanProperty)>
	//    6   10:astore_2        
		if(propertyserializermap != ((PropertySerializerMap.SerializerAndMapResult) (javatype)).map)
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:getfield        #95  <Field PropertySerializerMap PropertySerializerMap$SerializerAndMapResult.map>
	//*  10   16:if_acmpeq       27
			_dynamicValueSerializers = ((PropertySerializerMap.SerializerAndMapResult) (javatype)).map;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:getfield        #95  <Field PropertySerializerMap PropertySerializerMap$SerializerAndMapResult.map>
	//   14   24:putfield        #66  <Field PropertySerializerMap _dynamicValueSerializers>
		return ((PropertySerializerMap.SerializerAndMapResult) (javatype)).serializer;
	//   15   27:aload_2         
	//   16   28:getfield        #98  <Field JsonSerializer PropertySerializerMap$SerializerAndMapResult.serializer>
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
	//    4    4:getfield        #58  <Field BeanProperty _property>
	//    5    7:invokevirtual   #104 <Method PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.findAndAddSecondarySerializer(Class, SerializerProvider, BeanProperty)>
	//    6   10:astore_2        
		if(propertyserializermap != ((PropertySerializerMap.SerializerAndMapResult) (class1)).map)
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:getfield        #95  <Field PropertySerializerMap PropertySerializerMap$SerializerAndMapResult.map>
	//*  10   16:if_acmpeq       27
			_dynamicValueSerializers = ((PropertySerializerMap.SerializerAndMapResult) (class1)).map;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:getfield        #95  <Field PropertySerializerMap PropertySerializerMap$SerializerAndMapResult.map>
	//   14   24:putfield        #66  <Field PropertySerializerMap _dynamicValueSerializers>
		return ((PropertySerializerMap.SerializerAndMapResult) (class1)).serializer;
	//   15   27:aload_2         
	//   16   28:getfield        #98  <Field JsonSerializer PropertySerializerMap$SerializerAndMapResult.serializer>
	//   17   31:areturn         
	}

	public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
	{
		return ((ContainerSerializer) (new MapEntrySerializer(this, _property, typeserializer, _keySerializer, _valueSerializer, _suppressableValue, _suppressNulls)));
	//    0    0:new             #2   <Class MapEntrySerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field BeanProperty _property>
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #78  <Field JsonSerializer _keySerializer>
	//    8   14:aload_0         
	//    9   15:getfield        #80  <Field JsonSerializer _valueSerializer>
	//   10   18:aload_0         
	//   11   19:getfield        #68  <Field Object _suppressableValue>
	//   12   22:aload_0         
	//   13   23:getfield        #70  <Field boolean _suppressNulls>
	//   14   26:invokespecial   #109 <Method void MapEntrySerializer(MapEntrySerializer, BeanProperty, TypeSerializer, JsonSerializer, JsonSerializer, Object, boolean)>
	//   15   29:areturn         
	}

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		boolean flag;
		Object obj;
		Object obj1;
label0:
		{
			Object obj2 = ((Object) (serializerprovider.getAnnotationIntrospector()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #118 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//    2    4:astore          6
			Object obj3 = null;
	//    3    6:aconst_null     
	//    4    7:astore          7
			if(beanproperty == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       19
				obj = null;
	//    7   13:aconst_null     
	//    8   14:astore          4
			else
	//*   9   16:goto            27
				obj = ((Object) (beanproperty.getMember()));
	//   10   19:aload_2         
	//   11   20:invokeinterface #124 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//   12   25:astore          4
			if(obj != null && obj2 != null)
	//*  13   27:aload           4
	//*  14   29:ifnull          100
	//*  15   32:aload           6
	//*  16   34:ifnull          100
			{
				obj1 = ((AnnotationIntrospector) (obj2)).findKeySerializer(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)));
	//   17   37:aload           6
	//   18   39:aload           4
	//   19   41:invokevirtual   #130 <Method Object AnnotationIntrospector.findKeySerializer(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   20   44:astore          5
				if(obj1 != null)
	//*  21   46:aload           5
	//*  22   48:ifnull          64
					obj1 = ((Object) (serializerprovider.serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)), obj1)));
	//   23   51:aload_1         
	//   24   52:aload           4
	//   25   54:aload           5
	//   26   56:invokevirtual   #134 <Method JsonSerializer SerializerProvider.serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, Object)>
	//   27   59:astore          5
				else
	//*  28   61:goto            67
					obj1 = null;
	//   29   64:aconst_null     
	//   30   65:astore          5
				obj2 = ((AnnotationIntrospector) (obj2)).findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)));
	//   31   67:aload           6
	//   32   69:aload           4
	//   33   71:invokevirtual   #137 <Method Object AnnotationIntrospector.findContentSerializer(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   34   74:astore          6
				if(obj2 != null)
	//*  35   76:aload           6
	//*  36   78:ifnull          94
					obj = ((Object) (serializerprovider.serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)), obj2)));
	//   37   81:aload_1         
	//   38   82:aload           4
	//   39   84:aload           6
	//   40   86:invokevirtual   #134 <Method JsonSerializer SerializerProvider.serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, Object)>
	//   41   89:astore          4
				else
	//*  42   91:goto            107
					obj = null;
	//   43   94:aconst_null     
	//   44   95:astore          4
			} else
	//*  45   97:goto            107
			{
				obj = null;
	//   46  100:aconst_null     
	//   47  101:astore          4
				obj1 = obj;
	//   48  103:aload           4
	//   49  105:astore          5
			}
			obj2 = obj;
	//   50  107:aload           4
	//   51  109:astore          6
			if(obj == null)
	//*  52  111:aload           4
	//*  53  113:ifnonnull       122
				obj2 = ((Object) (_valueSerializer));
	//   54  116:aload_0         
	//   55  117:getfield        #80  <Field JsonSerializer _valueSerializer>
	//   56  120:astore          6
			obj = ((Object) (findContextualConvertingSerializer(serializerprovider, beanproperty, ((JsonSerializer) (obj2)))));
	//   57  122:aload_0         
	//   58  123:aload_1         
	//   59  124:aload_2         
	//   60  125:aload           6
	//   61  127:invokevirtual   #141 <Method JsonSerializer findContextualConvertingSerializer(SerializerProvider, BeanProperty, JsonSerializer)>
	//   62  130:astore          4
			if(obj == null && _valueTypeIsStatic && !_valueType.isJavaLangObject())
	//*  63  132:aload           4
	//*  64  134:ifnonnull       168
	//*  65  137:aload_0         
	//*  66  138:getfield        #54  <Field boolean _valueTypeIsStatic>
	//*  67  141:ifeq            168
	//*  68  144:aload_0         
	//*  69  145:getfield        #52  <Field JavaType _valueType>
	//*  70  148:invokevirtual   #147 <Method boolean JavaType.isJavaLangObject()>
	//*  71  151:ifne            168
				obj = ((Object) (serializerprovider.findValueSerializer(_valueType, beanproperty)));
	//   72  154:aload_1         
	//   73  155:aload_0         
	//   74  156:getfield        #52  <Field JavaType _valueType>
	//   75  159:aload_2         
	//   76  160:invokevirtual   #151 <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, BeanProperty)>
	//   77  163:astore          4
	//*  78  165:goto            168
			obj2 = obj1;
	//   79  168:aload           5
	//   80  170:astore          6
			if(obj1 == null)
	//*  81  172:aload           5
	//*  82  174:ifnonnull       183
				obj2 = ((Object) (_keySerializer));
	//   83  177:aload_0         
	//   84  178:getfield        #78  <Field JsonSerializer _keySerializer>
	//   85  181:astore          6
			if(obj2 == null)
	//*  86  183:aload           6
	//*  87  185:ifnonnull       202
				obj1 = ((Object) (serializerprovider.findKeySerializer(_keyType, beanproperty)));
	//   88  188:aload_1         
	//   89  189:aload_0         
	//   90  190:getfield        #50  <Field JavaType _keyType>
	//   91  193:aload_2         
	//   92  194:invokevirtual   #153 <Method JsonSerializer SerializerProvider.findKeySerializer(JavaType, BeanProperty)>
	//   93  197:astore          5
			else
	//*  94  199:goto            211
				obj1 = ((Object) (serializerprovider.handleSecondaryContextualization(((JsonSerializer) (obj2)), beanproperty)));
	//   95  202:aload_1         
	//   96  203:aload           6
	//   97  205:aload_2         
	//   98  206:invokevirtual   #157 <Method JsonSerializer SerializerProvider.handleSecondaryContextualization(JsonSerializer, BeanProperty)>
	//   99  209:astore          5
			obj2 = _suppressableValue;
	//  100  211:aload_0         
	//  101  212:getfield        #68  <Field Object _suppressableValue>
	//  102  215:astore          6
			flag = _suppressNulls;
	//  103  217:aload_0         
	//  104  218:getfield        #70  <Field boolean _suppressNulls>
	//  105  221:istore_3        
			if(beanproperty != null)
	//* 106  222:aload_2         
	//* 107  223:ifnull          424
			{
				com.fasterxml.jackson.annotation.JsonInclude.Value value = beanproperty.findPropertyInclusion(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializerprovider.getConfig())), ((Class) (null)));
	//  108  226:aload_2         
	//  109  227:aload_1         
	//  110  228:invokevirtual   #161 <Method com.fasterxml.jackson.databind.SerializationConfig SerializerProvider.getConfig()>
	//  111  231:aconst_null     
	//  112  232:invokeinterface #165 <Method com.fasterxml.jackson.annotation.JsonInclude$Value BeanProperty.findPropertyInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig, Class)>
	//  113  237:astore          8
				if(value != null)
	//* 114  239:aload           8
	//* 115  241:ifnull          424
				{
					com.fasterxml.jackson.annotation.JsonInclude.Include include = value.getContentInclusion();
	//  116  244:aload           8
	//  117  246:invokevirtual   #171 <Method com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Value.getContentInclusion()>
	//  118  249:astore          9
					if(include != com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS)
	//* 119  251:aload           9
	//* 120  253:getstatic       #174 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//* 121  256:if_acmpeq       424
					{
						static class _cls1
						{

							static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[];

							static 
							{
								$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include = new int[com.fasterxml.jackson.annotation.JsonInclude.Include.values().length];
							//    0    0:invokestatic    #18  <Method com.fasterxml.jackson.annotation.JsonInclude$Include[] com.fasterxml.jackson.annotation.JsonInclude$Include.values()>
							//    1    3:arraylength     
							//    2    4:newarray        int[]
							//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
								try
								{
									$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
							//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
							//    5   12:getstatic       #24  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_DEFAULT>
							//    6   15:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
							//    7   18:iconst_1        
							//    8   19:iastore         
								}
							//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
							//*  10   23:getstatic       #31  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_ABSENT>
							//*  11   26:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
							//*  12   29:iconst_2        
							//*  13   30:iastore         
							//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
							//*  15   34:getstatic       #34  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_EMPTY>
							//*  16   37:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
							//*  17   40:iconst_3        
							//*  18   41:iastore         
							//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
							//*  20   45:getstatic       #37  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.CUSTOM>
							//*  21   48:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
							//*  22   51:iconst_4        
							//*  23   52:iastore         
							//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
							//*  25   56:getstatic       #40  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_NULL>
							//*  26   59:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
							//*  27   62:iconst_5        
							//*  28   63:iastore         
							//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
							//*  30   67:getstatic       #43  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.ALWAYS>
							//*  31   70:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
							//*  32   73:bipush          6
							//*  33   75:iastore         
							//*  34   76:return          
								catch(NoSuchFieldError nosuchfielderror) { }
							//   35   77:astore_0        
								try
								{
									$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
								}
							//*  36   78:goto            20
								catch(NoSuchFieldError nosuchfielderror1) { }
							//   37   81:astore_0        
								try
								{
									$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
								}
							//*  38   82:goto            31
								catch(NoSuchFieldError nosuchfielderror2) { }
							//   39   85:astore_0        
								try
								{
									$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.CUSTOM.ordinal()] = 4;
								}
							//*  40   86:goto            42
								catch(NoSuchFieldError nosuchfielderror3) { }
							//   41   89:astore_0        
								try
								{
									$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL.ordinal()] = 5;
								}
							//*  42   90:goto            53
								catch(NoSuchFieldError nosuchfielderror4) { }
							//   43   93:astore_0        
								try
								{
									$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS.ordinal()] = 6;
								}
							//*  44   94:goto            64
								catch(NoSuchFieldError nosuchfielderror5) { }
							//   45   97:astore_0        
							//*  46   98:return          
							}
						}

						switch(_cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonInclude.Include[include.ordinal()])
	//* 122  259:getstatic       #178 <Field int[] MapEntrySerializer$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
	//* 123  262:aload           9
	//* 124  264:invokevirtual   #182 <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
	//* 125  267:iaload          
						{
	//* 126  268:tableswitch     1 5: default 304
	//	               1 387
	//	               2 365
	//	               3 356
	//	               4 318
	//	               5 311
						default:
							serializerprovider = null;
	//  127  304:aconst_null     
	//  128  305:astore_1        
							flag = false;
	//  129  306:iconst_0        
	//  130  307:istore_3        
							break;

	//* 131  308:goto            427
						case 5: // '\005'
							serializerprovider = null;
	//  132  311:aconst_null     
	//  133  312:astore_1        
							flag = true;
	//  134  313:iconst_1        
	//  135  314:istore_3        
							break;

	//* 136  315:goto            427
						case 4: // '\004'
							obj2 = serializerprovider.includeFilterInstance(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition) (null)), value.getContentFilter());
	//  137  318:aload_1         
	//  138  319:aconst_null     
	//  139  320:aload           8
	//  140  322:invokevirtual   #186 <Method Class com.fasterxml.jackson.annotation.JsonInclude$Value.getContentFilter()>
	//  141  325:invokevirtual   #190 <Method Object SerializerProvider.includeFilterInstance(com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, Class)>
	//  142  328:astore          6
							if(obj2 == null)
	//* 143  330:aload           6
	//* 144  332:ifnonnull       343
							{
								serializerprovider = ((SerializerProvider) (obj2));
	//  145  335:aload           6
	//  146  337:astore_1        
								flag = true;
	//  147  338:iconst_1        
	//  148  339:istore_3        
							} else
	//* 149  340:goto            427
							{
								flag = serializerprovider.includeFilterSuppressNulls(obj2);
	//  150  343:aload_1         
	//  151  344:aload           6
	//  152  346:invokevirtual   #194 <Method boolean SerializerProvider.includeFilterSuppressNulls(Object)>
	//  153  349:istore_3        
								serializerprovider = ((SerializerProvider) (obj2));
	//  154  350:aload           6
	//  155  352:astore_1        
							}
							break;

	//* 156  353:goto            427
						case 3: // '\003'
							serializerprovider = ((SerializerProvider) (MARKER_FOR_EMPTY));
	//  157  356:getstatic       #40  <Field Object MARKER_FOR_EMPTY>
	//  158  359:astore_1        
							flag = true;
	//  159  360:iconst_1        
	//  160  361:istore_3        
							break;

	//* 161  362:goto            427
						case 2: // '\002'
							serializerprovider = ((SerializerProvider) (obj3));
	//  162  365:aload           7
	//  163  367:astore_1        
							if(_valueType.isReferenceType())
	//* 164  368:aload_0         
	//* 165  369:getfield        #52  <Field JavaType _valueType>
	//* 166  372:invokevirtual   #197 <Method boolean JavaType.isReferenceType()>
	//* 167  375:ifeq            382
								serializerprovider = ((SerializerProvider) (MARKER_FOR_EMPTY));
	//  168  378:getstatic       #40  <Field Object MARKER_FOR_EMPTY>
	//  169  381:astore_1        
							flag = true;
	//  170  382:iconst_1        
	//  171  383:istore_3        
							break;

	//* 172  384:goto            427
						case 1: // '\001'
							serializerprovider = ((SerializerProvider) (BeanUtil.getDefaultValue(_valueType)));
	//  173  387:aload_0         
	//  174  388:getfield        #52  <Field JavaType _valueType>
	//  175  391:invokestatic    #203 <Method Object BeanUtil.getDefaultValue(JavaType)>
	//  176  394:astore_1        
							if(serializerprovider != null && ((Object) (serializerprovider)).getClass().isArray())
	//* 177  395:aload_1         
	//* 178  396:ifnull          419
	//* 179  399:aload_1         
	//* 180  400:invokevirtual   #208 <Method Class Object.getClass()>
	//* 181  403:invokevirtual   #213 <Method boolean Class.isArray()>
	//* 182  406:ifeq            419
							{
								serializerprovider = ((SerializerProvider) (ArrayBuilders.getArrayComparator(((Object) (serializerprovider)))));
	//  183  409:aload_1         
	//  184  410:invokestatic    #219 <Method Object ArrayBuilders.getArrayComparator(Object)>
	//  185  413:astore_1        
								flag = true;
	//  186  414:iconst_1        
	//  187  415:istore_3        
							} else
	//* 188  416:goto            427
							{
								flag = true;
	//  189  419:iconst_1        
	//  190  420:istore_3        
							}
							break;
						}
						break label0;
	//  191  421:goto            427
					}
				}
			}
			serializerprovider = ((SerializerProvider) (obj2));
	//  192  424:aload           6
	//  193  426:astore_1        
		}
		return ((JsonSerializer) (withResolved(beanproperty, ((JsonSerializer) (obj1)), ((JsonSerializer) (obj)), ((Object) (serializerprovider)), flag)));
	//  194  427:aload_0         
	//  195  428:aload_2         
	//  196  429:aload           5
	//  197  431:aload           4
	//  198  433:aload_1         
	//  199  434:iload_3         
	//  200  435:invokevirtual   #223 <Method MapEntrySerializer withResolved(BeanProperty, JsonSerializer, JsonSerializer, Object, boolean)>
	//  201  438:areturn         
	}

	public JavaType getContentType()
	{
		return _valueType;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field JavaType _valueType>
	//    2    4:areturn         
	}

	public volatile boolean hasSingleElement(Object obj)
	{
		return hasSingleElement((java.util.Map.Entry)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #229 <Class java.util.Map$Entry>
	//    3    5:invokevirtual   #232 <Method boolean hasSingleElement(java.util.Map$Entry)>
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
	//    3    3:checkcast       #229 <Class java.util.Map$Entry>
	//    4    6:invokevirtual   #238 <Method boolean isEmpty(SerializerProvider, java.util.Map$Entry)>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, java.util.Map.Entry entry)
	{
		Object obj1 = entry.getValue();
	//    0    0:aload_2         
	//    1    1:invokeinterface #242 <Method Object java.util.Map$Entry.getValue()>
	//    2    6:astore          4
		if(obj1 == null)
	//*   3    8:aload           4
	//*   4   10:ifnonnull       18
			return _suppressNulls;
	//    5   13:aload_0         
	//    6   14:getfield        #70  <Field boolean _suppressNulls>
	//    7   17:ireturn         
		if(_suppressableValue == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #68  <Field Object _suppressableValue>
	//*  10   22:ifnonnull       27
			return false;
	//   11   25:iconst_0        
	//   12   26:ireturn         
		JsonSerializer jsonserializer = _valueSerializer;
	//   13   27:aload_0         
	//   14   28:getfield        #80  <Field JsonSerializer _valueSerializer>
	//   15   31:astore_3        
		entry = ((java.util.Map.Entry) (jsonserializer));
	//   16   32:aload_3         
	//   17   33:astore_2        
		if(jsonserializer == null)
	//*  18   34:aload_3         
	//*  19   35:ifnonnull       74
		{
			Object obj = ((Object) (obj1.getClass()));
	//   20   38:aload           4
	//   21   40:invokevirtual   #208 <Method Class Object.getClass()>
	//   22   43:astore_3        
			entry = ((java.util.Map.Entry) (_dynamicValueSerializers.serializerFor(obj.getClass())));
	//   23   44:aload_0         
	//   24   45:getfield        #66  <Field PropertySerializerMap _dynamicValueSerializers>
	//   25   48:aload_3         
	//   26   49:invokevirtual   #208 <Method Class Object.getClass()>
	//   27   52:invokevirtual   #246 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//   28   55:astore_2        
			if(entry == null)
	//*  29   56:aload_2         
	//*  30   57:ifnonnull       74
				try
				{
					entry = ((java.util.Map.Entry) (_findAndAddDynamic(_dynamicValueSerializers, ((Class) (obj)), serializerprovider)));
	//   31   60:aload_0         
	//   32   61:aload_0         
	//   33   62:getfield        #66  <Field PropertySerializerMap _dynamicValueSerializers>
	//   34   65:aload_3         
	//   35   66:aload_1         
	//   36   67:invokevirtual   #248 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//   37   70:astore_2        
				}
	//*  38   71:goto            74
	//*  39   74:aload_0         
	//*  40   75:getfield        #68  <Field Object _suppressableValue>
	//*  41   78:astore_3        
	//*  42   79:aload_3         
	//*  43   80:getstatic       #40  <Field Object MARKER_FOR_EMPTY>
	//*  44   83:if_acmpne       94
	//*  45   86:aload_2         
	//*  46   87:aload_1         
	//*  47   88:aload           4
	//*  48   90:invokevirtual   #252 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//*  49   93:ireturn         
	//*  50   94:aload_3         
	//*  51   95:aload           4
	//*  52   97:invokevirtual   #255 <Method boolean Object.equals(Object)>
	//*  53  100:ireturn         
				// Misplaced declaration of an exception variable
				catch(SerializerProvider serializerprovider)
	//*  54  101:astore_1        
				{
					return false;
	//   55  102:iconst_0        
	//   56  103:ireturn         
				}
		}
		obj = _suppressableValue;
		if(obj == MARKER_FOR_EMPTY)
			return ((JsonSerializer) (entry)).isEmpty(serializerprovider, obj1);
		else
			return obj.equals(obj1);
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((java.util.Map.Entry)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #229 <Class java.util.Map$Entry>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #263 <Method void serialize(java.util.Map$Entry, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(java.util.Map.Entry entry, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.writeStartObject(((Object) (entry)));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #269 <Method void JsonGenerator.writeStartObject(Object)>
		serializeDynamic(entry, jsongenerator, serializerprovider);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokevirtual   #272 <Method void serializeDynamic(java.util.Map$Entry, JsonGenerator, SerializerProvider)>
		jsongenerator.writeEndObject();
	//    8   12:aload_2         
	//    9   13:invokevirtual   #275 <Method void JsonGenerator.writeEndObject()>
	//   10   16:return          
	}

	protected void serializeDynamic(java.util.Map.Entry entry, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		StringBuilder stringbuilder;
		Object obj2;
		TypeSerializer typeserializer = _valueTypeSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field TypeSerializer _valueTypeSerializer>
	//    2    4:astore          8
		obj2 = entry.getKey();
	//    3    6:aload_1         
	//    4    7:invokeinterface #281 <Method Object java.util.Map$Entry.getKey()>
	//    5   12:astore          7
		JsonSerializer jsonserializer;
		if(obj2 == null)
	//*   6   14:aload           7
	//*   7   16:ifnonnull       36
			jsonserializer = serializerprovider.findNullKeySerializer(_keyType, _property);
	//    8   19:aload_3         
	//    9   20:aload_0         
	//   10   21:getfield        #50  <Field JavaType _keyType>
	//   11   24:aload_0         
	//   12   25:getfield        #58  <Field BeanProperty _property>
	//   13   28:invokevirtual   #284 <Method JsonSerializer SerializerProvider.findNullKeySerializer(JavaType, BeanProperty)>
	//   14   31:astore          5
		else
	//*  15   33:goto            42
			jsonserializer = _keySerializer;
	//   16   36:aload_0         
	//   17   37:getfield        #78  <Field JsonSerializer _keySerializer>
	//   18   40:astore          5
		Object obj3 = entry.getValue();
	//   19   42:aload_1         
	//   20   43:invokeinterface #242 <Method Object java.util.Map$Entry.getValue()>
	//   21   48:astore          9
		Object obj1;
		if(obj3 == null)
	//*  22   50:aload           9
	//*  23   52:ifnonnull       72
		{
			if(_suppressNulls)
	//*  24   55:aload_0         
	//*  25   56:getfield        #70  <Field boolean _suppressNulls>
	//*  26   59:ifeq            63
				return;
	//   27   62:return          
			obj1 = ((Object) (serializerprovider.getDefaultNullValueSerializer()));
	//   28   63:aload_3         
	//   29   64:invokevirtual   #288 <Method JsonSerializer SerializerProvider.getDefaultNullValueSerializer()>
	//   30   67:astore          6
		} else
	//*  31   69:goto            212
		{
			obj1 = ((Object) (_valueSerializer));
	//   32   72:aload_0         
	//   33   73:getfield        #80  <Field JsonSerializer _valueSerializer>
	//   34   76:astore          6
			Object obj = obj1;
	//   35   78:aload           6
	//   36   80:astore          4
			if(obj1 == null)
	//*  37   82:aload           6
	//*  38   84:ifnonnull       160
			{
				obj1 = ((Object) (obj3.getClass()));
	//   39   87:aload           9
	//   40   89:invokevirtual   #208 <Method Class Object.getClass()>
	//   41   92:astore          6
				obj = ((Object) (_dynamicValueSerializers.serializerFor(((Class) (obj1)))));
	//   42   94:aload_0         
	//   43   95:getfield        #66  <Field PropertySerializerMap _dynamicValueSerializers>
	//   44   98:aload           6
	//   45  100:invokevirtual   #246 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//   46  103:astore          4
				if(obj == null)
	//*  47  105:aload           4
	//*  48  107:ifnonnull       160
					if(_valueType.hasGenericTypes())
	//*  49  110:aload_0         
	//*  50  111:getfield        #52  <Field JavaType _valueType>
	//*  51  114:invokevirtual   #291 <Method boolean JavaType.hasGenericTypes()>
	//*  52  117:ifeq            144
						obj = ((Object) (_findAndAddDynamic(_dynamicValueSerializers, serializerprovider.constructSpecializedType(_valueType, ((Class) (obj1))), serializerprovider)));
	//   53  120:aload_0         
	//   54  121:aload_0         
	//   55  122:getfield        #66  <Field PropertySerializerMap _dynamicValueSerializers>
	//   56  125:aload_3         
	//   57  126:aload_0         
	//   58  127:getfield        #52  <Field JavaType _valueType>
	//   59  130:aload           6
	//   60  132:invokevirtual   #295 <Method JavaType SerializerProvider.constructSpecializedType(JavaType, Class)>
	//   61  135:aload_3         
	//   62  136:invokevirtual   #297 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, JavaType, SerializerProvider)>
	//   63  139:astore          4
					else
	//*  64  141:goto            160
						obj = ((Object) (_findAndAddDynamic(_dynamicValueSerializers, ((Class) (obj1)), serializerprovider)));
	//   65  144:aload_0         
	//   66  145:aload_0         
	//   67  146:getfield        #66  <Field PropertySerializerMap _dynamicValueSerializers>
	//   68  149:aload           6
	//   69  151:aload_3         
	//   70  152:invokevirtual   #248 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//   71  155:astore          4
			}
	//*  72  157:goto            160
			Object obj4 = _suppressableValue;
	//   73  160:aload_0         
	//   74  161:getfield        #68  <Field Object _suppressableValue>
	//   75  164:astore          10
			obj1 = obj;
	//   76  166:aload           4
	//   77  168:astore          6
			if(obj4 != null)
	//*  78  170:aload           10
	//*  79  172:ifnull          212
			{
				if(obj4 == MARKER_FOR_EMPTY && ((JsonSerializer) (obj)).isEmpty(serializerprovider, obj3))
	//*  80  175:aload           10
	//*  81  177:getstatic       #40  <Field Object MARKER_FOR_EMPTY>
	//*  82  180:if_acmpne       195
	//*  83  183:aload           4
	//*  84  185:aload_3         
	//*  85  186:aload           9
	//*  86  188:invokevirtual   #252 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//*  87  191:ifeq            195
					return;
	//   88  194:return          
				obj1 = obj;
	//   89  195:aload           4
	//   90  197:astore          6
				if(_suppressableValue.equals(obj3))
	//*  91  199:aload_0         
	//*  92  200:getfield        #68  <Field Object _suppressableValue>
	//*  93  203:aload           9
	//*  94  205:invokevirtual   #255 <Method boolean Object.equals(Object)>
	//*  95  208:ifeq            212
					return;
	//   96  211:return          
			}
		}
		jsonserializer.serialize(obj2, jsongenerator, serializerprovider);
	//   97  212:aload           5
	//   98  214:aload           7
	//   99  216:aload_2         
	//  100  217:aload_3         
	//  101  218:invokevirtual   #299 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
		if(typeserializer == null)
	//* 102  221:aload           8
	//* 103  223:ifnonnull       236
		{
			try
			{
				((JsonSerializer) (obj1)).serialize(obj3, jsongenerator, serializerprovider);
	//  104  226:aload           6
	//  105  228:aload           9
	//  106  230:aload_2         
	//  107  231:aload_3         
	//  108  232:invokevirtual   #299 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
				return;
	//  109  235:return          
			}
	//* 110  236:aload           6
	//* 111  238:aload           9
	//* 112  240:aload_2         
	//* 113  241:aload_3         
	//* 114  242:aload           8
	//* 115  244:invokevirtual   #303 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
	//* 116  247:return          
			// Misplaced declaration of an exception variable
			catch(JsonGenerator jsongenerator)
	//* 117  248:astore_2        
			{
				stringbuilder = new StringBuilder();
	//  118  249:new             #305 <Class StringBuilder>
	//  119  252:dup             
	//  120  253:invokespecial   #307 <Method void StringBuilder()>
	//  121  256:astore          4
			}
			break MISSING_BLOCK_LABEL_258;
		}
		((JsonSerializer) (obj1)).serializeWithType(obj3, jsongenerator, serializerprovider, typeserializer);
		return;
		stringbuilder.append("");
	//  122  258:aload           4
	//  123  260:ldc2            #309 <String "">
	//  124  263:invokevirtual   #313 <Method StringBuilder StringBuilder.append(String)>
	//  125  266:pop             
		stringbuilder.append(obj2);
	//  126  267:aload           4
	//  127  269:aload           7
	//  128  271:invokevirtual   #316 <Method StringBuilder StringBuilder.append(Object)>
	//  129  274:pop             
		wrapAndThrow(serializerprovider, ((Throwable) (jsongenerator)), ((Object) (entry)), stringbuilder.toString());
	//  130  275:aload_0         
	//  131  276:aload_3         
	//  132  277:aload_2         
	//  133  278:aload_1         
	//  134  279:aload           4
	//  135  281:invokevirtual   #320 <Method String StringBuilder.toString()>
	//  136  284:invokevirtual   #324 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, String)>
		return;
	//  137  287:return          
	}

	public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		serializeWithType((java.util.Map.Entry)obj, jsongenerator, serializerprovider, typeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #229 <Class java.util.Map$Entry>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #327 <Method void serializeWithType(java.util.Map$Entry, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}

	public void serializeWithType(java.util.Map.Entry entry, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		jsongenerator.setCurrentValue(((Object) (entry)));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #330 <Method void JsonGenerator.setCurrentValue(Object)>
		com.fasterxml.jackson.core.type.WritableTypeId writabletypeid = typeserializer.writeTypePrefix(jsongenerator, typeserializer.typeId(((Object) (entry)), JsonToken.START_OBJECT));
	//    3    5:aload           4
	//    4    7:aload_2         
	//    5    8:aload           4
	//    6   10:aload_1         
	//    7   11:getstatic       #336 <Field JsonToken JsonToken.START_OBJECT>
	//    8   14:invokevirtual   #342 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.typeId(Object, JsonToken)>
	//    9   17:invokevirtual   #346 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   10   20:astore          5
		serializeDynamic(entry, jsongenerator, serializerprovider);
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:invokevirtual   #272 <Method void serializeDynamic(java.util.Map$Entry, JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffix(jsongenerator, writabletypeid);
	//   16   29:aload           4
	//   17   31:aload_2         
	//   18   32:aload           5
	//   19   34:invokevirtual   #349 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   20   37:pop             
	//   21   38:return          
	}

	public MapEntrySerializer withContentInclusion(Object obj, boolean flag)
	{
		if(_suppressableValue == obj && _suppressNulls == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field Object _suppressableValue>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       18
	//*   4    8:aload_0         
	//*   5    9:getfield        #70  <Field boolean _suppressNulls>
	//*   6   12:iload_2         
	//*   7   13:icmpne          18
			return this;
	//    8   16:aload_0         
	//    9   17:areturn         
		else
			return new MapEntrySerializer(this, _property, _valueTypeSerializer, _keySerializer, _valueSerializer, obj, flag);
	//   10   18:new             #2   <Class MapEntrySerializer>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #58  <Field BeanProperty _property>
	//   15   27:aload_0         
	//   16   28:getfield        #56  <Field TypeSerializer _valueTypeSerializer>
	//   17   31:aload_0         
	//   18   32:getfield        #78  <Field JsonSerializer _keySerializer>
	//   19   35:aload_0         
	//   20   36:getfield        #80  <Field JsonSerializer _valueSerializer>
	//   21   39:aload_1         
	//   22   40:iload_2         
	//   23   41:invokespecial   #109 <Method void MapEntrySerializer(MapEntrySerializer, BeanProperty, TypeSerializer, JsonSerializer, JsonSerializer, Object, boolean)>
	//   24   44:areturn         
	}

	public MapEntrySerializer withResolved(BeanProperty beanproperty, JsonSerializer jsonserializer, JsonSerializer jsonserializer1, Object obj, boolean flag)
	{
		return new MapEntrySerializer(this, beanproperty, _valueTypeSerializer, jsonserializer, jsonserializer1, obj, flag);
	//    0    0:new             #2   <Class MapEntrySerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #56  <Field TypeSerializer _valueTypeSerializer>
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:aload           4
	//    9   14:iload           5
	//   10   16:invokespecial   #109 <Method void MapEntrySerializer(MapEntrySerializer, BeanProperty, TypeSerializer, JsonSerializer, JsonSerializer, Object, boolean)>
	//   11   19:areturn         
	}

	public static final Object MARKER_FOR_EMPTY;
	protected PropertySerializerMap _dynamicValueSerializers;
	protected final JavaType _entryType;
	protected JsonSerializer _keySerializer;
	protected final JavaType _keyType;
	protected final BeanProperty _property;
	protected final boolean _suppressNulls;
	protected final Object _suppressableValue;
	protected JsonSerializer _valueSerializer;
	protected final JavaType _valueType;
	protected final boolean _valueTypeIsStatic;
	protected final TypeSerializer _valueTypeSerializer;

	static 
	{
		MARKER_FOR_EMPTY = ((Object) (com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY));
	//    0    0:getstatic       #38  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_EMPTY>
	//    1    3:putstatic       #40  <Field Object MARKER_FOR_EMPTY>
	//*   2    6:return          
	}
}
