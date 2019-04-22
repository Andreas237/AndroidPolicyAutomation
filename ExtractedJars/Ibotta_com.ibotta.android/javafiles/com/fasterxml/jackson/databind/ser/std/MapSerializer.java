// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonMapFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.*;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.*;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			MapProperty

public class MapSerializer extends ContainerSerializer
	implements ContextualSerializer
{

	protected MapSerializer(MapSerializer mapserializer, BeanProperty beanproperty, JsonSerializer jsonserializer, JsonSerializer jsonserializer1, Set set)
	{
		Set set1;
label0:
		{
			super(java/util/Map, false);
	//    0    0:aload_0         
	//    1    1:ldc1            #62  <Class Map>
	//    2    3:iconst_0        
	//    3    4:invokespecial   #65  <Method void ContainerSerializer(Class, boolean)>
			if(set != null)
	//*   4    7:aload           5
	//*   5    9:ifnull          26
			{
				set1 = set;
	//    6   12:aload           5
	//    7   14:astore          6
				if(!set.isEmpty())
					break label0;
	//    8   16:aload           5
	//    9   18:invokeinterface #71  <Method boolean Set.isEmpty()>
	//   10   23:ifeq            29
			}
			set1 = null;
	//   11   26:aconst_null     
	//   12   27:astore          6
		}
		_ignoredEntries = set1;
	//   13   29:aload_0         
	//   14   30:aload           6
	//   15   32:putfield        #73  <Field Set _ignoredEntries>
		_keyType = mapserializer._keyType;
	//   16   35:aload_0         
	//   17   36:aload_1         
	//   18   37:getfield        #75  <Field JavaType _keyType>
	//   19   40:putfield        #75  <Field JavaType _keyType>
		_valueType = mapserializer._valueType;
	//   20   43:aload_0         
	//   21   44:aload_1         
	//   22   45:getfield        #77  <Field JavaType _valueType>
	//   23   48:putfield        #77  <Field JavaType _valueType>
		_valueTypeIsStatic = mapserializer._valueTypeIsStatic;
	//   24   51:aload_0         
	//   25   52:aload_1         
	//   26   53:getfield        #79  <Field boolean _valueTypeIsStatic>
	//   27   56:putfield        #79  <Field boolean _valueTypeIsStatic>
		_valueTypeSerializer = mapserializer._valueTypeSerializer;
	//   28   59:aload_0         
	//   29   60:aload_1         
	//   30   61:getfield        #81  <Field TypeSerializer _valueTypeSerializer>
	//   31   64:putfield        #81  <Field TypeSerializer _valueTypeSerializer>
		_keySerializer = jsonserializer;
	//   32   67:aload_0         
	//   33   68:aload_3         
	//   34   69:putfield        #83  <Field JsonSerializer _keySerializer>
		_valueSerializer = jsonserializer1;
	//   35   72:aload_0         
	//   36   73:aload           4
	//   37   75:putfield        #85  <Field JsonSerializer _valueSerializer>
		_dynamicValueSerializers = mapserializer._dynamicValueSerializers;
	//   38   78:aload_0         
	//   39   79:aload_1         
	//   40   80:getfield        #87  <Field PropertySerializerMap _dynamicValueSerializers>
	//   41   83:putfield        #87  <Field PropertySerializerMap _dynamicValueSerializers>
		_property = beanproperty;
	//   42   86:aload_0         
	//   43   87:aload_2         
	//   44   88:putfield        #89  <Field BeanProperty _property>
		_filterId = mapserializer._filterId;
	//   45   91:aload_0         
	//   46   92:aload_1         
	//   47   93:getfield        #91  <Field Object _filterId>
	//   48   96:putfield        #91  <Field Object _filterId>
		_sortKeys = mapserializer._sortKeys;
	//   49   99:aload_0         
	//   50  100:aload_1         
	//   51  101:getfield        #93  <Field boolean _sortKeys>
	//   52  104:putfield        #93  <Field boolean _sortKeys>
		_suppressableValue = mapserializer._suppressableValue;
	//   53  107:aload_0         
	//   54  108:aload_1         
	//   55  109:getfield        #95  <Field Object _suppressableValue>
	//   56  112:putfield        #95  <Field Object _suppressableValue>
		_suppressNulls = mapserializer._suppressNulls;
	//   57  115:aload_0         
	//   58  116:aload_1         
	//   59  117:getfield        #97  <Field boolean _suppressNulls>
	//   60  120:putfield        #97  <Field boolean _suppressNulls>
	//   61  123:return          
	}

	protected MapSerializer(MapSerializer mapserializer, TypeSerializer typeserializer, Object obj, boolean flag)
	{
		super(java/util/Map, false);
	//    0    0:aload_0         
	//    1    1:ldc1            #62  <Class Map>
	//    2    3:iconst_0        
	//    3    4:invokespecial   #65  <Method void ContainerSerializer(Class, boolean)>
		_ignoredEntries = mapserializer._ignoredEntries;
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:getfield        #73  <Field Set _ignoredEntries>
	//    7   12:putfield        #73  <Field Set _ignoredEntries>
		_keyType = mapserializer._keyType;
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:getfield        #75  <Field JavaType _keyType>
	//   11   20:putfield        #75  <Field JavaType _keyType>
		_valueType = mapserializer._valueType;
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:getfield        #77  <Field JavaType _valueType>
	//   15   28:putfield        #77  <Field JavaType _valueType>
		_valueTypeIsStatic = mapserializer._valueTypeIsStatic;
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:getfield        #79  <Field boolean _valueTypeIsStatic>
	//   19   36:putfield        #79  <Field boolean _valueTypeIsStatic>
		_valueTypeSerializer = typeserializer;
	//   20   39:aload_0         
	//   21   40:aload_2         
	//   22   41:putfield        #81  <Field TypeSerializer _valueTypeSerializer>
		_keySerializer = mapserializer._keySerializer;
	//   23   44:aload_0         
	//   24   45:aload_1         
	//   25   46:getfield        #83  <Field JsonSerializer _keySerializer>
	//   26   49:putfield        #83  <Field JsonSerializer _keySerializer>
		_valueSerializer = mapserializer._valueSerializer;
	//   27   52:aload_0         
	//   28   53:aload_1         
	//   29   54:getfield        #85  <Field JsonSerializer _valueSerializer>
	//   30   57:putfield        #85  <Field JsonSerializer _valueSerializer>
		_dynamicValueSerializers = mapserializer._dynamicValueSerializers;
	//   31   60:aload_0         
	//   32   61:aload_1         
	//   33   62:getfield        #87  <Field PropertySerializerMap _dynamicValueSerializers>
	//   34   65:putfield        #87  <Field PropertySerializerMap _dynamicValueSerializers>
		_property = mapserializer._property;
	//   35   68:aload_0         
	//   36   69:aload_1         
	//   37   70:getfield        #89  <Field BeanProperty _property>
	//   38   73:putfield        #89  <Field BeanProperty _property>
		_filterId = mapserializer._filterId;
	//   39   76:aload_0         
	//   40   77:aload_1         
	//   41   78:getfield        #91  <Field Object _filterId>
	//   42   81:putfield        #91  <Field Object _filterId>
		_sortKeys = mapserializer._sortKeys;
	//   43   84:aload_0         
	//   44   85:aload_1         
	//   45   86:getfield        #93  <Field boolean _sortKeys>
	//   46   89:putfield        #93  <Field boolean _sortKeys>
		_suppressableValue = obj;
	//   47   92:aload_0         
	//   48   93:aload_3         
	//   49   94:putfield        #95  <Field Object _suppressableValue>
		_suppressNulls = flag;
	//   50   97:aload_0         
	//   51   98:iload           4
	//   52  100:putfield        #97  <Field boolean _suppressNulls>
	//   53  103:return          
	}

	protected MapSerializer(MapSerializer mapserializer, Object obj, boolean flag)
	{
		super(java/util/Map, false);
	//    0    0:aload_0         
	//    1    1:ldc1            #62  <Class Map>
	//    2    3:iconst_0        
	//    3    4:invokespecial   #65  <Method void ContainerSerializer(Class, boolean)>
		_ignoredEntries = mapserializer._ignoredEntries;
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:getfield        #73  <Field Set _ignoredEntries>
	//    7   12:putfield        #73  <Field Set _ignoredEntries>
		_keyType = mapserializer._keyType;
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:getfield        #75  <Field JavaType _keyType>
	//   11   20:putfield        #75  <Field JavaType _keyType>
		_valueType = mapserializer._valueType;
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:getfield        #77  <Field JavaType _valueType>
	//   15   28:putfield        #77  <Field JavaType _valueType>
		_valueTypeIsStatic = mapserializer._valueTypeIsStatic;
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:getfield        #79  <Field boolean _valueTypeIsStatic>
	//   19   36:putfield        #79  <Field boolean _valueTypeIsStatic>
		_valueTypeSerializer = mapserializer._valueTypeSerializer;
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:getfield        #81  <Field TypeSerializer _valueTypeSerializer>
	//   23   44:putfield        #81  <Field TypeSerializer _valueTypeSerializer>
		_keySerializer = mapserializer._keySerializer;
	//   24   47:aload_0         
	//   25   48:aload_1         
	//   26   49:getfield        #83  <Field JsonSerializer _keySerializer>
	//   27   52:putfield        #83  <Field JsonSerializer _keySerializer>
		_valueSerializer = mapserializer._valueSerializer;
	//   28   55:aload_0         
	//   29   56:aload_1         
	//   30   57:getfield        #85  <Field JsonSerializer _valueSerializer>
	//   31   60:putfield        #85  <Field JsonSerializer _valueSerializer>
		_dynamicValueSerializers = mapserializer._dynamicValueSerializers;
	//   32   63:aload_0         
	//   33   64:aload_1         
	//   34   65:getfield        #87  <Field PropertySerializerMap _dynamicValueSerializers>
	//   35   68:putfield        #87  <Field PropertySerializerMap _dynamicValueSerializers>
		_property = mapserializer._property;
	//   36   71:aload_0         
	//   37   72:aload_1         
	//   38   73:getfield        #89  <Field BeanProperty _property>
	//   39   76:putfield        #89  <Field BeanProperty _property>
		_filterId = obj;
	//   40   79:aload_0         
	//   41   80:aload_2         
	//   42   81:putfield        #91  <Field Object _filterId>
		_sortKeys = flag;
	//   43   84:aload_0         
	//   44   85:iload_3         
	//   45   86:putfield        #93  <Field boolean _sortKeys>
		_suppressableValue = mapserializer._suppressableValue;
	//   46   89:aload_0         
	//   47   90:aload_1         
	//   48   91:getfield        #95  <Field Object _suppressableValue>
	//   49   94:putfield        #95  <Field Object _suppressableValue>
		_suppressNulls = mapserializer._suppressNulls;
	//   50   97:aload_0         
	//   51   98:aload_1         
	//   52   99:getfield        #97  <Field boolean _suppressNulls>
	//   53  102:putfield        #97  <Field boolean _suppressNulls>
	//   54  105:return          
	}

	protected MapSerializer(Set set, JavaType javatype, JavaType javatype1, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer, JsonSerializer jsonserializer1)
	{
		Set set1;
label0:
		{
			super(java/util/Map, false);
	//    0    0:aload_0         
	//    1    1:ldc1            #62  <Class Map>
	//    2    3:iconst_0        
	//    3    4:invokespecial   #65  <Method void ContainerSerializer(Class, boolean)>
			if(set != null)
	//*   4    7:aload_1         
	//*   5    8:ifnull          23
			{
				set1 = set;
	//    6   11:aload_1         
	//    7   12:astore          8
				if(!set.isEmpty())
					break label0;
	//    8   14:aload_1         
	//    9   15:invokeinterface #71  <Method boolean Set.isEmpty()>
	//   10   20:ifeq            26
			}
			set1 = null;
	//   11   23:aconst_null     
	//   12   24:astore          8
		}
		_ignoredEntries = set1;
	//   13   26:aload_0         
	//   14   27:aload           8
	//   15   29:putfield        #73  <Field Set _ignoredEntries>
		_keyType = javatype;
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:putfield        #75  <Field JavaType _keyType>
		_valueType = javatype1;
	//   19   37:aload_0         
	//   20   38:aload_3         
	//   21   39:putfield        #77  <Field JavaType _valueType>
		_valueTypeIsStatic = flag;
	//   22   42:aload_0         
	//   23   43:iload           4
	//   24   45:putfield        #79  <Field boolean _valueTypeIsStatic>
		_valueTypeSerializer = typeserializer;
	//   25   48:aload_0         
	//   26   49:aload           5
	//   27   51:putfield        #81  <Field TypeSerializer _valueTypeSerializer>
		_keySerializer = jsonserializer;
	//   28   54:aload_0         
	//   29   55:aload           6
	//   30   57:putfield        #83  <Field JsonSerializer _keySerializer>
		_valueSerializer = jsonserializer1;
	//   31   60:aload_0         
	//   32   61:aload           7
	//   33   63:putfield        #85  <Field JsonSerializer _valueSerializer>
		_dynamicValueSerializers = PropertySerializerMap.emptyForProperties();
	//   34   66:aload_0         
	//   35   67:invokestatic    #108 <Method PropertySerializerMap PropertySerializerMap.emptyForProperties()>
	//   36   70:putfield        #87  <Field PropertySerializerMap _dynamicValueSerializers>
		_property = null;
	//   37   73:aload_0         
	//   38   74:aconst_null     
	//   39   75:putfield        #89  <Field BeanProperty _property>
		_filterId = null;
	//   40   78:aload_0         
	//   41   79:aconst_null     
	//   42   80:putfield        #91  <Field Object _filterId>
		_sortKeys = false;
	//   43   83:aload_0         
	//   44   84:iconst_0        
	//   45   85:putfield        #93  <Field boolean _sortKeys>
		_suppressableValue = null;
	//   46   88:aload_0         
	//   47   89:aconst_null     
	//   48   90:putfield        #95  <Field Object _suppressableValue>
		_suppressNulls = false;
	//   49   93:aload_0         
	//   50   94:iconst_0        
	//   51   95:putfield        #97  <Field boolean _suppressNulls>
	//   52   98:return          
	}

	private final JsonSerializer _findSerializer(SerializerProvider serializerprovider, Object obj)
		throws JsonMappingException
	{
		obj = ((Object) (obj.getClass()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #119 <Method Class Object.getClass()>
	//    2    4:astore_2        
		JsonSerializer jsonserializer = _dynamicValueSerializers.serializerFor(((Class) (obj)));
	//    3    5:aload_0         
	//    4    6:getfield        #87  <Field PropertySerializerMap _dynamicValueSerializers>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #123 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//    7   13:astore_3        
		if(jsonserializer != null)
	//*   8   14:aload_3         
	//*   9   15:ifnull          20
			return jsonserializer;
	//   10   18:aload_3         
	//   11   19:areturn         
		if(_valueType.hasGenericTypes())
	//*  12   20:aload_0         
	//*  13   21:getfield        #77  <Field JavaType _valueType>
	//*  14   24:invokevirtual   #128 <Method boolean JavaType.hasGenericTypes()>
	//*  15   27:ifeq            49
			return _findAndAddDynamic(_dynamicValueSerializers, serializerprovider.constructSpecializedType(_valueType, ((Class) (obj))), serializerprovider);
	//   16   30:aload_0         
	//   17   31:aload_0         
	//   18   32:getfield        #87  <Field PropertySerializerMap _dynamicValueSerializers>
	//   19   35:aload_1         
	//   20   36:aload_0         
	//   21   37:getfield        #77  <Field JavaType _valueType>
	//   22   40:aload_2         
	//   23   41:invokevirtual   #134 <Method JavaType SerializerProvider.constructSpecializedType(JavaType, Class)>
	//   24   44:aload_1         
	//   25   45:invokevirtual   #138 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, JavaType, SerializerProvider)>
	//   26   48:areturn         
		else
			return _findAndAddDynamic(_dynamicValueSerializers, ((Class) (obj)), serializerprovider);
	//   27   49:aload_0         
	//   28   50:aload_0         
	//   29   51:getfield        #87  <Field PropertySerializerMap _dynamicValueSerializers>
	//   30   54:aload_2         
	//   31   55:aload_1         
	//   32   56:invokevirtual   #141 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//   33   59:areturn         
	}

	public static MapSerializer construct(Set set, JavaType javatype, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer, JsonSerializer jsonserializer1, Object obj)
	{
		JavaType javatype1;
		JavaType javatype2;
		if(javatype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       18
		{
			javatype1 = UNSPECIFIED_TYPE;
	//    2    4:getstatic       #49  <Field JavaType UNSPECIFIED_TYPE>
	//    3    7:astore          7
			javatype = javatype1;
	//    4    9:aload           7
	//    5   11:astore_1        
			javatype2 = javatype;
	//    6   12:aload_1         
	//    7   13:astore          8
		} else
	//*   8   15:goto            36
		{
			javatype1 = javatype.getKeyType();
	//    9   18:aload_1         
	//   10   19:invokevirtual   #148 <Method JavaType JavaType.getKeyType()>
	//   11   22:astore          7
			javatype2 = javatype.getContentType();
	//   12   24:aload_1         
	//   13   25:invokevirtual   #151 <Method JavaType JavaType.getContentType()>
	//   14   28:astore          8
			javatype = javatype1;
	//   15   30:aload           7
	//   16   32:astore_1        
			javatype1 = javatype;
	//   17   33:aload_1         
	//   18   34:astore          7
		}
		if(!flag)
	//*  19   36:iload_2         
	//*  20   37:ifne            63
		{
			if(javatype2 != null && javatype2.isFinal())
	//*  21   40:aload           8
	//*  22   42:ifnull          58
	//*  23   45:aload           8
	//*  24   47:invokevirtual   #154 <Method boolean JavaType.isFinal()>
	//*  25   50:ifeq            58
				flag = true;
	//   26   53:iconst_1        
	//   27   54:istore_2        
			else
	//*  28   55:goto            60
				flag = false;
	//   29   58:iconst_0        
	//   30   59:istore_2        
		} else
	//*  31   60:goto            78
		if(javatype2.getRawClass() == java/lang/Object)
	//*  32   63:aload           8
	//*  33   65:invokevirtual   #157 <Method Class JavaType.getRawClass()>
	//*  34   68:ldc1            #115 <Class Object>
	//*  35   70:if_acmpne       78
			flag = false;
	//   36   73:iconst_0        
	//   37   74:istore_2        
	//*  38   75:goto            78
		javatype = ((JavaType) (new MapSerializer(set, javatype1, javatype2, flag, typeserializer, jsonserializer, jsonserializer1)));
	//   39   78:new             #2   <Class MapSerializer>
	//   40   81:dup             
	//   41   82:aload_0         
	//   42   83:aload           7
	//   43   85:aload           8
	//   44   87:iload_2         
	//   45   88:aload_3         
	//   46   89:aload           4
	//   47   91:aload           5
	//   48   93:invokespecial   #159 <Method void MapSerializer(Set, JavaType, JavaType, boolean, TypeSerializer, JsonSerializer, JsonSerializer)>
	//   49   96:astore_1        
		set = ((Set) (javatype));
	//   50   97:aload_1         
	//   51   98:astore_0        
		if(obj != null)
	//*  52   99:aload           6
	//*  53  101:ifnull          111
			set = ((Set) (((MapSerializer) (javatype)).withFilterId(obj)));
	//   54  104:aload_1         
	//   55  105:aload           6
	//   56  107:invokevirtual   #163 <Method MapSerializer withFilterId(Object)>
	//   57  110:astore_0        
		return ((MapSerializer) (set));
	//   58  111:aload_0         
	//   59  112:areturn         
	}

	protected void _ensureOverride(String s)
	{
		ClassUtil.verifyMustOverride(com/fasterxml/jackson/databind/ser/std/MapSerializer, ((Object) (this)), s);
	//    0    0:ldc1            #2   <Class MapSerializer>
	//    1    2:aload_0         
	//    2    3:aload_1         
	//    3    4:invokestatic    #172 <Method void ClassUtil.verifyMustOverride(Class, Object, String)>
	//    4    7:return          
	}

	protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, JavaType javatype, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		javatype = ((JavaType) (propertyserializermap.findAndAddSecondarySerializer(javatype, serializerprovider, _property)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload_0         
	//    4    4:getfield        #89  <Field BeanProperty _property>
	//    5    7:invokevirtual   #176 <Method com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.findAndAddSecondarySerializer(JavaType, SerializerProvider, BeanProperty)>
	//    6   10:astore_2        
		if(propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map)
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:getfield        #181 <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//*  10   16:if_acmpeq       27
			_dynamicValueSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:getfield        #181 <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//   14   24:putfield        #87  <Field PropertySerializerMap _dynamicValueSerializers>
		return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).serializer;
	//   15   27:aload_2         
	//   16   28:getfield        #184 <Field JsonSerializer com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.serializer>
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
	//    4    4:getfield        #89  <Field BeanProperty _property>
	//    5    7:invokevirtual   #188 <Method com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.findAndAddSecondarySerializer(Class, SerializerProvider, BeanProperty)>
	//    6   10:astore_2        
		if(propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map)
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:getfield        #181 <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//*  10   16:if_acmpeq       27
			_dynamicValueSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:getfield        #181 <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//   14   24:putfield        #87  <Field PropertySerializerMap _dynamicValueSerializers>
		return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).serializer;
	//   15   27:aload_2         
	//   16   28:getfield        #184 <Field JsonSerializer com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.serializer>
	//   17   31:areturn         
	}

	protected boolean _hasNullKey(Map map)
	{
		return (map instanceof HashMap) && map.containsKey(((Object) (null)));
	//    0    0:aload_1         
	//    1    1:instanceof      #193 <Class HashMap>
	//    2    4:ifeq            19
	//    3    7:aload_1         
	//    4    8:aconst_null     
	//    5    9:invokeinterface #197 <Method boolean Map.containsKey(Object)>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	protected Map _orderEntries(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(map instanceof SortedMap)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #204 <Class SortedMap>
	//*   2    4:ifeq            9
			return map;
	//    3    7:aload_1         
	//    4    8:areturn         
		if(_hasNullKey(map))
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #206 <Method boolean _hasNullKey(Map)>
	//*   8   14:ifeq            109
		{
			TreeMap treemap = new TreeMap();
	//    9   17:new             #208 <Class TreeMap>
	//   10   20:dup             
	//   11   21:invokespecial   #210 <Method void TreeMap()>
	//   12   24:astore          4
			for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext();)
	//*  13   26:aload_1         
	//*  14   27:invokeinterface #214 <Method Set Map.entrySet()>
	//*  15   32:invokeinterface #218 <Method Iterator Set.iterator()>
	//*  16   37:astore_1        
	//*  17   38:aload_1         
	//*  18   39:invokeinterface #223 <Method boolean Iterator.hasNext()>
	//*  19   44:ifeq            106
			{
				java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   20   47:aload_1         
	//   21   48:invokeinterface #227 <Method Object Iterator.next()>
	//   22   53:checkcast       #229 <Class java.util.Map$Entry>
	//   23   56:astore          5
				Object obj = entry.getKey();
	//   24   58:aload           5
	//   25   60:invokeinterface #232 <Method Object java.util.Map$Entry.getKey()>
	//   26   65:astore          6
				if(obj == null)
	//*  27   67:aload           6
	//*  28   69:ifnonnull       88
					_writeNullKeyedEntry(jsongenerator, serializerprovider, entry.getValue());
	//   29   72:aload_0         
	//   30   73:aload_2         
	//   31   74:aload_3         
	//   32   75:aload           5
	//   33   77:invokeinterface #235 <Method Object java.util.Map$Entry.getValue()>
	//   34   82:invokevirtual   #239 <Method void _writeNullKeyedEntry(JsonGenerator, SerializerProvider, Object)>
				else
	//*  35   85:goto            38
					treemap.put(obj, entry.getValue());
	//   36   88:aload           4
	//   37   90:aload           6
	//   38   92:aload           5
	//   39   94:invokeinterface #235 <Method Object java.util.Map$Entry.getValue()>
	//   40   99:invokevirtual   #243 <Method Object TreeMap.put(Object, Object)>
	//   41  102:pop             
			}

	//*  42  103:goto            38
			return ((Map) (treemap));
	//   43  106:aload           4
	//   44  108:areturn         
		} else
		{
			return ((Map) (new TreeMap(map)));
	//   45  109:new             #208 <Class TreeMap>
	//   46  112:dup             
	//   47  113:aload_1         
	//   48  114:invokespecial   #246 <Method void TreeMap(Map)>
	//   49  117:areturn         
		}
	}

	public volatile ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
	{
		return ((ContainerSerializer) (_withValueTypeSerializer(typeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #252 <Method MapSerializer _withValueTypeSerializer(TypeSerializer)>
	//    3    5:areturn         
	}

	public MapSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
	{
		if(_valueTypeSerializer == typeserializer)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field TypeSerializer _valueTypeSerializer>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
		{
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		} else
		{
			_ensureOverride("_withValueTypeSerializer");
	//    6   10:aload_0         
	//    7   11:ldc1            #253 <String "_withValueTypeSerializer">
	//    8   13:invokevirtual   #255 <Method void _ensureOverride(String)>
			return new MapSerializer(this, typeserializer, _suppressableValue, _suppressNulls);
	//    9   16:new             #2   <Class MapSerializer>
	//   10   19:dup             
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:aload_0         
	//   14   23:getfield        #95  <Field Object _suppressableValue>
	//   15   26:aload_0         
	//   16   27:getfield        #97  <Field boolean _suppressNulls>
	//   17   30:invokespecial   #257 <Method void MapSerializer(MapSerializer, TypeSerializer, Object, boolean)>
	//   18   33:areturn         
		}
	}

	protected void _writeNullKeyedEntry(JsonGenerator jsongenerator, SerializerProvider serializerprovider, Object obj)
		throws IOException
	{
		JsonSerializer jsonserializer2 = serializerprovider.findNullKeySerializer(_keyType, _property);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #75  <Field JavaType _keyType>
	//    3    5:aload_0         
	//    4    6:getfield        #89  <Field BeanProperty _property>
	//    5    9:invokevirtual   #263 <Method JsonSerializer SerializerProvider.findNullKeySerializer(JavaType, BeanProperty)>
	//    6   12:astore          6
		JsonSerializer jsonserializer1;
		if(obj == null)
	//*   7   14:aload_3         
	//*   8   15:ifnonnull       35
		{
			if(_suppressNulls)
	//*   9   18:aload_0         
	//*  10   19:getfield        #97  <Field boolean _suppressNulls>
	//*  11   22:ifeq            26
				return;
	//   12   25:return          
			jsonserializer1 = serializerprovider.getDefaultNullValueSerializer();
	//   13   26:aload_2         
	//   14   27:invokevirtual   #267 <Method JsonSerializer SerializerProvider.getDefaultNullValueSerializer()>
	//   15   30:astore          5
		} else
	//*  16   32:goto            110
		{
			jsonserializer1 = _valueSerializer;
	//   17   35:aload_0         
	//   18   36:getfield        #85  <Field JsonSerializer _valueSerializer>
	//   19   39:astore          5
			JsonSerializer jsonserializer = jsonserializer1;
	//   20   41:aload           5
	//   21   43:astore          4
			if(jsonserializer1 == null)
	//*  22   45:aload           5
	//*  23   47:ifnonnull       58
				jsonserializer = _findSerializer(serializerprovider, obj);
	//   24   50:aload_0         
	//   25   51:aload_2         
	//   26   52:aload_3         
	//   27   53:invokespecial   #269 <Method JsonSerializer _findSerializer(SerializerProvider, Object)>
	//   28   56:astore          4
			Object obj1 = _suppressableValue;
	//   29   58:aload_0         
	//   30   59:getfield        #95  <Field Object _suppressableValue>
	//   31   62:astore          7
			if(obj1 == MARKER_FOR_EMPTY)
	//*  32   64:aload           7
	//*  33   66:getstatic       #57  <Field Object MARKER_FOR_EMPTY>
	//*  34   69:if_acmpne       87
			{
				jsonserializer1 = jsonserializer;
	//   35   72:aload           4
	//   36   74:astore          5
				if(jsonserializer.isEmpty(serializerprovider, obj))
	//*  37   76:aload           4
	//*  38   78:aload_2         
	//*  39   79:aload_3         
	//*  40   80:invokevirtual   #274 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//*  41   83:ifeq            110
					return;
	//   42   86:return          
			} else
			{
				jsonserializer1 = jsonserializer;
	//   43   87:aload           4
	//   44   89:astore          5
				if(obj1 != null)
	//*  45   91:aload           7
	//*  46   93:ifnull          110
				{
					jsonserializer1 = jsonserializer;
	//   47   96:aload           4
	//   48   98:astore          5
					if(obj1.equals(obj))
	//*  49  100:aload           7
	//*  50  102:aload_3         
	//*  51  103:invokevirtual   #277 <Method boolean Object.equals(Object)>
	//*  52  106:ifeq            110
						return;
	//   53  109:return          
				}
			}
		}
		try
		{
			jsonserializer2.serialize(((Object) (null)), jsongenerator, serializerprovider);
	//   54  110:aload           6
	//   55  112:aconst_null     
	//   56  113:aload_1         
	//   57  114:aload_2         
	//   58  115:invokevirtual   #281 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			jsonserializer1.serialize(obj, jsongenerator, serializerprovider);
	//   59  118:aload           5
	//   60  120:aload_3         
	//   61  121:aload_1         
	//   62  122:aload_2         
	//   63  123:invokevirtual   #281 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//   64  126:return          
		}
		// Misplaced declaration of an exception variable
		catch(JsonGenerator jsongenerator)
	//*  65  127:astore_1        
		{
			wrapAndThrow(serializerprovider, ((Throwable) (jsongenerator)), obj, "");
	//   66  128:aload_0         
	//   67  129:aload_2         
	//   68  130:aload_1         
	//   69  131:aload_3         
	//   70  132:ldc2            #283 <String "">
	//   71  135:invokevirtual   #287 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, String)>
		}
	//   72  138:return          
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		JsonMapFormatVisitor jsonmapformatvisitor = jsonformatvisitorwrapper.expectMapFormat(javatype);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #295 <Method JsonMapFormatVisitor JsonFormatVisitorWrapper.expectMapFormat(JavaType)>
	//    3    7:astore          4
		if(jsonmapformatvisitor != null)
	//*   4    9:aload           4
	//*   5   11:ifnull          71
		{
			jsonmapformatvisitor.keyFormat(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable) (_keySerializer)), _keyType);
	//    6   14:aload           4
	//    7   16:aload_0         
	//    8   17:getfield        #83  <Field JsonSerializer _keySerializer>
	//    9   20:aload_0         
	//   10   21:getfield        #75  <Field JavaType _keyType>
	//   11   24:invokeinterface #301 <Method void JsonMapFormatVisitor.keyFormat(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable, JavaType)>
			JsonSerializer jsonserializer = _valueSerializer;
	//   12   29:aload_0         
	//   13   30:getfield        #85  <Field JsonSerializer _valueSerializer>
	//   14   33:astore_3        
			javatype = ((JavaType) (jsonserializer));
	//   15   34:aload_3         
	//   16   35:astore_2        
			if(jsonserializer == null)
	//*  17   36:aload_3         
	//*  18   37:ifnonnull       59
				javatype = ((JavaType) (_findAndAddDynamic(_dynamicValueSerializers, _valueType, jsonformatvisitorwrapper.getProvider())));
	//   19   40:aload_0         
	//   20   41:aload_0         
	//   21   42:getfield        #87  <Field PropertySerializerMap _dynamicValueSerializers>
	//   22   45:aload_0         
	//   23   46:getfield        #77  <Field JavaType _valueType>
	//   24   49:aload_1         
	//   25   50:invokeinterface #305 <Method SerializerProvider JsonFormatVisitorWrapper.getProvider()>
	//   26   55:invokevirtual   #138 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, JavaType, SerializerProvider)>
	//   27   58:astore_2        
			jsonmapformatvisitor.valueFormat(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable) (javatype)), _valueType);
	//   28   59:aload           4
	//   29   61:aload_2         
	//   30   62:aload_0         
	//   31   63:getfield        #77  <Field JavaType _valueType>
	//   32   66:invokeinterface #308 <Method void JsonMapFormatVisitor.valueFormat(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable, JavaType)>
		}
	//   33   71:return          
	}

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		AnnotationIntrospector annotationintrospector = serializerprovider.getAnnotationIntrospector();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #314 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//    2    4:astore          12
		Object obj3 = null;
	//    3    6:aconst_null     
	//    4    7:astore          11
		Object obj2;
		if(beanproperty == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       19
			obj2 = null;
	//    7   13:aconst_null     
	//    8   14:astore          8
		else
	//*   9   16:goto            27
			obj2 = ((Object) (beanproperty.getMember()));
	//   10   19:aload_2         
	//   11   20:invokeinterface #320 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//   12   25:astore          8
		Object obj;
		Object obj1;
		if(_neitherNull(obj2, ((Object) (annotationintrospector))))
	//*  13   27:aload           8
	//*  14   29:aload           12
	//*  15   31:invokestatic    #324 <Method boolean _neitherNull(Object, Object)>
	//*  16   34:ifeq            100
		{
			obj = annotationintrospector.findKeySerializer(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)));
	//   17   37:aload           12
	//   18   39:aload           8
	//   19   41:invokevirtual   #330 <Method Object AnnotationIntrospector.findKeySerializer(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   20   44:astore          6
			if(obj != null)
	//*  21   46:aload           6
	//*  22   48:ifnull          64
				obj1 = ((Object) (serializerprovider.serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)), obj)));
	//   23   51:aload_1         
	//   24   52:aload           8
	//   25   54:aload           6
	//   26   56:invokevirtual   #334 <Method JsonSerializer SerializerProvider.serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, Object)>
	//   27   59:astore          7
			else
	//*  28   61:goto            67
				obj1 = null;
	//   29   64:aconst_null     
	//   30   65:astore          7
			obj = annotationintrospector.findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)));
	//   31   67:aload           12
	//   32   69:aload           8
	//   33   71:invokevirtual   #337 <Method Object AnnotationIntrospector.findContentSerializer(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   34   74:astore          6
			if(obj != null)
	//*  35   76:aload           6
	//*  36   78:ifnull          94
				obj = ((Object) (serializerprovider.serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)), obj)));
	//   37   81:aload_1         
	//   38   82:aload           8
	//   39   84:aload           6
	//   40   86:invokevirtual   #334 <Method JsonSerializer SerializerProvider.serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, Object)>
	//   41   89:astore          6
			else
	//*  42   91:goto            107
				obj = null;
	//   43   94:aconst_null     
	//   44   95:astore          6
		} else
	//*  45   97:goto            107
		{
			obj1 = null;
	//   46  100:aconst_null     
	//   47  101:astore          7
			obj = obj1;
	//   48  103:aload           7
	//   49  105:astore          6
		}
		JsonSerializer jsonserializer = ((JsonSerializer) (obj));
	//   50  107:aload           6
	//   51  109:astore          9
		if(obj == null)
	//*  52  111:aload           6
	//*  53  113:ifnonnull       122
			jsonserializer = _valueSerializer;
	//   54  116:aload_0         
	//   55  117:getfield        #85  <Field JsonSerializer _valueSerializer>
	//   56  120:astore          9
		jsonserializer = findContextualConvertingSerializer(serializerprovider, beanproperty, jsonserializer);
	//   57  122:aload_0         
	//   58  123:aload_1         
	//   59  124:aload_2         
	//   60  125:aload           9
	//   61  127:invokevirtual   #341 <Method JsonSerializer findContextualConvertingSerializer(SerializerProvider, BeanProperty, JsonSerializer)>
	//   62  130:astore          9
		if(jsonserializer == null && _valueTypeIsStatic && !_valueType.isJavaLangObject())
	//*  63  132:aload           9
	//*  64  134:ifnonnull       168
	//*  65  137:aload_0         
	//*  66  138:getfield        #79  <Field boolean _valueTypeIsStatic>
	//*  67  141:ifeq            168
	//*  68  144:aload_0         
	//*  69  145:getfield        #77  <Field JavaType _valueType>
	//*  70  148:invokevirtual   #344 <Method boolean JavaType.isJavaLangObject()>
	//*  71  151:ifne            168
			jsonserializer = serializerprovider.findValueSerializer(_valueType, beanproperty);
	//   72  154:aload_1         
	//   73  155:aload_0         
	//   74  156:getfield        #77  <Field JavaType _valueType>
	//   75  159:aload_2         
	//   76  160:invokevirtual   #347 <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, BeanProperty)>
	//   77  163:astore          9
	//*  78  165:goto            168
		obj = obj1;
	//   79  168:aload           7
	//   80  170:astore          6
		if(obj1 == null)
	//*  81  172:aload           7
	//*  82  174:ifnonnull       183
			obj = ((Object) (_keySerializer));
	//   83  177:aload_0         
	//   84  178:getfield        #83  <Field JsonSerializer _keySerializer>
	//   85  181:astore          6
		JsonSerializer jsonserializer1;
		if(obj == null)
	//*  86  183:aload           6
	//*  87  185:ifnonnull       202
			jsonserializer1 = serializerprovider.findKeySerializer(_keyType, beanproperty);
	//   88  188:aload_1         
	//   89  189:aload_0         
	//   90  190:getfield        #75  <Field JavaType _keyType>
	//   91  193:aload_2         
	//   92  194:invokevirtual   #349 <Method JsonSerializer SerializerProvider.findKeySerializer(JavaType, BeanProperty)>
	//   93  197:astore          10
		else
	//*  94  199:goto            211
			jsonserializer1 = serializerprovider.handleSecondaryContextualization(((JsonSerializer) (obj)), beanproperty);
	//   95  202:aload_1         
	//   96  203:aload           6
	//   97  205:aload_2         
	//   98  206:invokevirtual   #353 <Method JsonSerializer SerializerProvider.handleSecondaryContextualization(JsonSerializer, BeanProperty)>
	//   99  209:astore          10
		obj1 = ((Object) (_ignoredEntries));
	//  100  211:aload_0         
	//  101  212:getfield        #73  <Field Set _ignoredEntries>
	//  102  215:astore          7
		boolean flag;
		if(_neitherNull(obj2, ((Object) (annotationintrospector))))
	//* 103  217:aload           8
	//* 104  219:aload           12
	//* 105  221:invokestatic    #324 <Method boolean _neitherNull(Object, Object)>
	//* 106  224:ifeq            358
		{
			Object obj4 = ((Object) (annotationintrospector.findPropertyIgnorals(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)))));
	//  107  227:aload           12
	//  108  229:aload           8
	//  109  231:invokevirtual   #357 <Method com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value AnnotationIntrospector.findPropertyIgnorals(com.fasterxml.jackson.databind.introspect.Annotated)>
	//  110  234:astore          13
			obj = obj1;
	//  111  236:aload           7
	//  112  238:astore          6
			if(obj4 != null)
	//* 113  240:aload           13
	//* 114  242:ifnull          336
			{
				obj4 = ((Object) (((com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value) (obj4)).findIgnoredForSerialization()));
	//  115  245:aload           13
	//  116  247:invokevirtual   #362 <Method Set com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value.findIgnoredForSerialization()>
	//  117  250:astore          13
				obj = obj1;
	//  118  252:aload           7
	//  119  254:astore          6
				if(_nonEmpty(((Collection) (obj4))))
	//* 120  256:aload           13
	//* 121  258:invokestatic    #366 <Method boolean _nonEmpty(Collection)>
	//* 122  261:ifeq            336
				{
					if(obj1 == null)
	//* 123  264:aload           7
	//* 124  266:ifnonnull       281
						obj1 = ((Object) (new HashSet()));
	//  125  269:new             #368 <Class HashSet>
	//  126  272:dup             
	//  127  273:invokespecial   #369 <Method void HashSet()>
	//  128  276:astore          7
					else
	//* 129  278:goto            292
						obj1 = ((Object) (new HashSet(((Collection) (obj1)))));
	//  130  281:new             #368 <Class HashSet>
	//  131  284:dup             
	//  132  285:aload           7
	//  133  287:invokespecial   #372 <Method void HashSet(Collection)>
	//  134  290:astore          7
					obj4 = ((Object) (((Set) (obj4)).iterator()));
	//  135  292:aload           13
	//  136  294:invokeinterface #218 <Method Iterator Set.iterator()>
	//  137  299:astore          13
					do
					{
						obj = obj1;
	//  138  301:aload           7
	//  139  303:astore          6
						if(!((Iterator) (obj4)).hasNext())
							break;
	//  140  305:aload           13
	//  141  307:invokeinterface #223 <Method boolean Iterator.hasNext()>
	//  142  312:ifeq            336
						((Set) (obj1)).add(((Object) ((String)((Iterator) (obj4)).next())));
	//  143  315:aload           7
	//  144  317:aload           13
	//  145  319:invokeinterface #227 <Method Object Iterator.next()>
	//  146  324:checkcast       #374 <Class String>
	//  147  327:invokeinterface #377 <Method boolean Set.add(Object)>
	//  148  332:pop             
					} while(true);
	//  149  333:goto            301
				}
			}
			obj1 = ((Object) (annotationintrospector.findSerializationSortAlphabetically(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)))));
	//  150  336:aload           12
	//  151  338:aload           8
	//  152  340:invokevirtual   #381 <Method Boolean AnnotationIntrospector.findSerializationSortAlphabetically(com.fasterxml.jackson.databind.introspect.Annotated)>
	//  153  343:astore          7
			flag = Boolean.TRUE.equals(obj1);
	//  154  345:getstatic       #387 <Field Boolean Boolean.TRUE>
	//  155  348:aload           7
	//  156  350:invokevirtual   #388 <Method boolean Boolean.equals(Object)>
	//  157  353:istore          4
		} else
	//* 158  355:goto            365
		{
			obj = obj1;
	//  159  358:aload           7
	//  160  360:astore          6
			flag = false;
	//  161  362:iconst_0        
	//  162  363:istore          4
		}
		obj1 = ((Object) (findFormatOverrides(serializerprovider, beanproperty, java/util/Map)));
	//  163  365:aload_0         
	//  164  366:aload_1         
	//  165  367:aload_2         
	//  166  368:ldc1            #62  <Class Map>
	//  167  370:invokevirtual   #392 <Method com.fasterxml.jackson.annotation.JsonFormat$Value findFormatOverrides(SerializerProvider, BeanProperty, Class)>
	//  168  373:astore          7
		if(obj1 != null)
	//* 169  375:aload           7
	//* 170  377:ifnull          405
		{
			obj1 = ((Object) (((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj1)).getFeature(com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SORTED_MAP_ENTRIES)));
	//  171  380:aload           7
	//  172  382:getstatic       #398 <Field com.fasterxml.jackson.annotation.JsonFormat$Feature com.fasterxml.jackson.annotation.JsonFormat$Feature.WRITE_SORTED_MAP_ENTRIES>
	//  173  385:invokevirtual   #404 <Method Boolean com.fasterxml.jackson.annotation.JsonFormat$Value.getFeature(com.fasterxml.jackson.annotation.JsonFormat$Feature)>
	//  174  388:astore          7
			if(obj1 != null)
	//* 175  390:aload           7
	//* 176  392:ifnull          405
				flag = ((Boolean) (obj1)).booleanValue();
	//  177  395:aload           7
	//  178  397:invokevirtual   #407 <Method boolean Boolean.booleanValue()>
	//  179  400:istore          4
		}
	//* 180  402:goto            405
		obj2 = ((Object) (withResolved(beanproperty, jsonserializer1, jsonserializer, ((Set) (obj)), flag)));
	//  181  405:aload_0         
	//  182  406:aload_2         
	//  183  407:aload           10
	//  184  409:aload           9
	//  185  411:aload           6
	//  186  413:iload           4
	//  187  415:invokevirtual   #411 <Method MapSerializer withResolved(BeanProperty, JsonSerializer, JsonSerializer, Set, boolean)>
	//  188  418:astore          8
		obj1 = obj2;
	//  189  420:aload           8
	//  190  422:astore          7
		if(beanproperty != null)
	//* 191  424:aload_2         
	//* 192  425:ifnull          697
		{
			obj1 = ((Object) (beanproperty.getMember()));
	//  193  428:aload_2         
	//  194  429:invokeinterface #320 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//  195  434:astore          7
			MapSerializer mapserializer = ((MapSerializer) (obj2));
	//  196  436:aload           8
	//  197  438:astore          6
			if(obj1 != null)
	//* 198  440:aload           7
	//* 199  442:ifnull          472
			{
				obj1 = annotationintrospector.findFilterId(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)));
	//  200  445:aload           12
	//  201  447:aload           7
	//  202  449:invokevirtual   #414 <Method Object AnnotationIntrospector.findFilterId(com.fasterxml.jackson.databind.introspect.Annotated)>
	//  203  452:astore          7
				mapserializer = ((MapSerializer) (obj2));
	//  204  454:aload           8
	//  205  456:astore          6
				if(obj1 != null)
	//* 206  458:aload           7
	//* 207  460:ifnull          472
					mapserializer = ((MapSerializer) (obj2)).withFilterId(obj1);
	//  208  463:aload           8
	//  209  465:aload           7
	//  210  467:invokevirtual   #163 <Method MapSerializer withFilterId(Object)>
	//  211  470:astore          6
			}
			obj2 = ((Object) (beanproperty.findPropertyInclusion(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializerprovider.getConfig())), ((Class) (null)))));
	//  212  472:aload_2         
	//  213  473:aload_1         
	//  214  474:invokevirtual   #418 <Method com.fasterxml.jackson.databind.SerializationConfig SerializerProvider.getConfig()>
	//  215  477:aconst_null     
	//  216  478:invokeinterface #422 <Method com.fasterxml.jackson.annotation.JsonInclude$Value BeanProperty.findPropertyInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig, Class)>
	//  217  483:astore          8
			obj1 = ((Object) (mapserializer));
	//  218  485:aload           6
	//  219  487:astore          7
			if(obj2 != null)
	//* 220  489:aload           8
	//* 221  491:ifnull          697
			{
				beanproperty = ((BeanProperty) (((com.fasterxml.jackson.annotation.JsonInclude.Value) (obj2)).getContentInclusion()));
	//  222  494:aload           8
	//  223  496:invokevirtual   #428 <Method com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Value.getContentInclusion()>
	//  224  499:astore_2        
				obj1 = ((Object) (mapserializer));
	//  225  500:aload           6
	//  226  502:astore          7
				if(beanproperty != com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS)
	//* 227  504:aload_2         
	//* 228  505:getstatic       #431 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//* 229  508:if_acmpeq       697
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

					int i = _cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonInclude.Include[((com.fasterxml.jackson.annotation.JsonInclude.Include) (beanproperty)).ordinal()];
	//  230  511:getstatic       #435 <Field int[] MapSerializer$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
	//  231  514:aload_2         
	//  232  515:invokevirtual   #439 <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
	//  233  518:iaload          
	//  234  519:istore_3        
					boolean flag2 = true;
	//  235  520:iconst_1        
	//  236  521:istore          5
					beanproperty = ((BeanProperty) (obj3));
	//  237  523:aload           11
	//  238  525:astore_2        
					boolean flag1 = flag2;
	//  239  526:iload           5
	//  240  528:istore          4
					switch(i)
	//* 241  530:iload_3         
					{
	//* 242  531:tableswitch     1 5: default 564
	//	               1 644
	//	               2 616
	//	               3 605
	//	               4 573
	//	               5 687
					default:
						flag1 = false;
	//  243  564:iconst_0        
	//  244  565:istore          4
						beanproperty = ((BeanProperty) (obj3));
	//  245  567:aload           11
	//  246  569:astore_2        
						break;
	//  247  570:goto            687

					case 5: // '\005'
						break;

					case 4: // '\004'
						beanproperty = ((BeanProperty) (serializerprovider.includeFilterInstance(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition) (null)), ((com.fasterxml.jackson.annotation.JsonInclude.Value) (obj2)).getContentFilter())));
	//  248  573:aload_1         
	//  249  574:aconst_null     
	//  250  575:aload           8
	//  251  577:invokevirtual   #442 <Method Class com.fasterxml.jackson.annotation.JsonInclude$Value.getContentFilter()>
	//  252  580:invokevirtual   #446 <Method Object SerializerProvider.includeFilterInstance(com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, Class)>
	//  253  583:astore_2        
						if(beanproperty == null)
	//* 254  584:aload_2         
	//* 255  585:ifnonnull       595
							flag1 = flag2;
	//  256  588:iload           5
	//  257  590:istore          4
						else
	//* 258  592:goto            687
							flag1 = serializerprovider.includeFilterSuppressNulls(((Object) (beanproperty)));
	//  259  595:aload_1         
	//  260  596:aload_2         
	//  261  597:invokevirtual   #449 <Method boolean SerializerProvider.includeFilterSuppressNulls(Object)>
	//  262  600:istore          4
						break;
	//  263  602:goto            687

					case 3: // '\003'
						beanproperty = ((BeanProperty) (MARKER_FOR_EMPTY));
	//  264  605:getstatic       #57  <Field Object MARKER_FOR_EMPTY>
	//  265  608:astore_2        
						flag1 = flag2;
	//  266  609:iload           5
	//  267  611:istore          4
						break;
	//  268  613:goto            687

					case 2: // '\002'
						beanproperty = ((BeanProperty) (obj3));
	//  269  616:aload           11
	//  270  618:astore_2        
						flag1 = flag2;
	//  271  619:iload           5
	//  272  621:istore          4
						if(_valueType.isReferenceType())
	//* 273  623:aload_0         
	//* 274  624:getfield        #77  <Field JavaType _valueType>
	//* 275  627:invokevirtual   #452 <Method boolean JavaType.isReferenceType()>
	//* 276  630:ifeq            687
						{
							beanproperty = ((BeanProperty) (MARKER_FOR_EMPTY));
	//  277  633:getstatic       #57  <Field Object MARKER_FOR_EMPTY>
	//  278  636:astore_2        
							flag1 = flag2;
	//  279  637:iload           5
	//  280  639:istore          4
						}
						break;
	//  281  641:goto            687

					case 1: // '\001'
						serializerprovider = ((SerializerProvider) (BeanUtil.getDefaultValue(_valueType)));
	//  282  644:aload_0         
	//  283  645:getfield        #77  <Field JavaType _valueType>
	//  284  648:invokestatic    #458 <Method Object BeanUtil.getDefaultValue(JavaType)>
	//  285  651:astore_1        
						beanproperty = ((BeanProperty) (serializerprovider));
	//  286  652:aload_1         
	//  287  653:astore_2        
						flag1 = flag2;
	//  288  654:iload           5
	//  289  656:istore          4
						if(serializerprovider == null)
							break;
	//  290  658:aload_1         
	//  291  659:ifnull          687
						beanproperty = ((BeanProperty) (serializerprovider));
	//  292  662:aload_1         
	//  293  663:astore_2        
						flag1 = flag2;
	//  294  664:iload           5
	//  295  666:istore          4
						if(((Object) (serializerprovider)).getClass().isArray())
	//* 296  668:aload_1         
	//* 297  669:invokevirtual   #119 <Method Class Object.getClass()>
	//* 298  672:invokevirtual   #463 <Method boolean Class.isArray()>
	//* 299  675:ifeq            687
						{
							beanproperty = ((BeanProperty) (ArrayBuilders.getArrayComparator(((Object) (serializerprovider)))));
	//  300  678:aload_1         
	//  301  679:invokestatic    #469 <Method Object ArrayBuilders.getArrayComparator(Object)>
	//  302  682:astore_2        
							flag1 = flag2;
	//  303  683:iload           5
	//  304  685:istore          4
						}
						break;
					}
					obj1 = ((Object) (mapserializer.withContentInclusion(((Object) (beanproperty)), flag1)));
	//  305  687:aload           6
	//  306  689:aload_2         
	//  307  690:iload           4
	//  308  692:invokevirtual   #473 <Method MapSerializer withContentInclusion(Object, boolean)>
	//  309  695:astore          7
				}
			}
		}
		return ((JsonSerializer) (obj1));
	//  310  697:aload           7
	//  311  699:areturn         
	}

	public JavaType getContentType()
	{
		return _valueType;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field JavaType _valueType>
	//    2    4:areturn         
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		return ((JsonNode) (createSchemaNode("object", true)));
	//    0    0:aload_0         
	//    1    1:ldc2            #478 <String "object">
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #482 <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
	//    4    8:areturn         
	}

	public volatile boolean hasSingleElement(Object obj)
	{
		return hasSingleElement((Map)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #62  <Class Map>
	//    3    5:invokevirtual   #485 <Method boolean hasSingleElement(Map)>
	//    4    8:ireturn         
	}

	public boolean hasSingleElement(Map map)
	{
		return map.size() == 1;
	//    0    0:aload_1         
	//    1    1:invokeinterface #488 <Method int Map.size()>
	//    2    6:iconst_1        
	//    3    7:icmpne          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return isEmpty(serializerprovider, (Map)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #62  <Class Map>
	//    4    6:invokevirtual   #491 <Method boolean isEmpty(SerializerProvider, Map)>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, Map map)
	{
		boolean flag;
		Object obj;
label0:
		{
label1:
			{
				if(map.isEmpty())
	//*   0    0:aload_2         
	//*   1    1:invokeinterface #492 <Method boolean Map.isEmpty()>
	//*   2    6:ifeq            11
					return true;
	//    3    9:iconst_1        
	//    4   10:ireturn         
				obj = _suppressableValue;
	//    5   11:aload_0         
	//    6   12:getfield        #95  <Field Object _suppressableValue>
	//    7   15:astore          4
				if(obj == null && !_suppressNulls)
	//*   8   17:aload           4
	//*   9   19:ifnonnull       31
	//*  10   22:aload_0         
	//*  11   23:getfield        #97  <Field boolean _suppressNulls>
	//*  12   26:ifne            31
					return false;
	//   13   29:iconst_0        
	//   14   30:ireturn         
				JsonSerializer jsonserializer = _valueSerializer;
	//   15   31:aload_0         
	//   16   32:getfield        #85  <Field JsonSerializer _valueSerializer>
	//   17   35:astore          5
				if(MARKER_FOR_EMPTY == obj)
	//*  18   37:getstatic       #57  <Field Object MARKER_FOR_EMPTY>
	//*  19   40:aload           4
	//*  20   42:if_acmpne       50
					flag = true;
	//   21   45:iconst_1        
	//   22   46:istore_3        
				else
	//*  23   47:goto            52
					flag = false;
	//   24   50:iconst_0        
	//   25   51:istore_3        
				if(jsonserializer == null)
					break label0;
	//   26   52:aload           5
	//   27   54:ifnull          141
				Iterator iterator1 = map.values().iterator();
	//   28   57:aload_2         
	//   29   58:invokeinterface #496 <Method Collection Map.values()>
	//   30   63:invokeinterface #499 <Method Iterator Collection.iterator()>
	//   31   68:astore          6
label2:
				do
				{
					Object obj2;
					do
					{
						do
						{
							if(!iterator1.hasNext())
								break label1;
	//   32   70:aload           6
	//   33   72:invokeinterface #223 <Method boolean Iterator.hasNext()>
	//   34   77:ifeq            139
							obj2 = iterator1.next();
	//   35   80:aload           6
	//   36   82:invokeinterface #227 <Method Object Iterator.next()>
	//   37   87:astore          7
							if(obj2 != null)
								break;
	//   38   89:aload           7
	//   39   91:ifnonnull       106
							if(!_suppressNulls)
	//*  40   94:aload_0         
	//*  41   95:getfield        #97  <Field boolean _suppressNulls>
	//*  42   98:ifeq            104
	//*  43  101:goto            70
								return false;
	//   44  104:iconst_0        
	//   45  105:ireturn         
						} while(true);
						if(!flag)
							continue label2;
	//   46  106:iload_3         
	//   47  107:ifeq            123
					} while(jsonserializer.isEmpty(serializerprovider, obj2));
	//   48  110:aload           5
	//   49  112:aload_1         
	//   50  113:aload           7
	//   51  115:invokevirtual   #274 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//   52  118:ifne            70
					return false;
	//   53  121:iconst_0        
	//   54  122:ireturn         
				} while(obj != null && obj.equals(((Object) (map))));
	//   55  123:aload           4
	//   56  125:ifnull          137
	//   57  128:aload           4
	//   58  130:aload_2         
	//   59  131:invokevirtual   #277 <Method boolean Object.equals(Object)>
	//   60  134:ifne            70
				return false;
	//   61  137:iconst_0        
	//   62  138:ireturn         
			}
			return true;
	//   63  139:iconst_1        
	//   64  140:ireturn         
		}
label3:
		{
			Iterator iterator = map.values().iterator();
	//   65  141:aload_2         
	//   66  142:invokeinterface #496 <Method Collection Map.values()>
	//   67  147:invokeinterface #499 <Method Iterator Collection.iterator()>
	//   68  152:astore          5
label4:
			do
			{
				do
				{
					Object obj1;
					do
					{
						if(!iterator.hasNext())
							break label3;
	//   69  154:aload           5
	//   70  156:invokeinterface #223 <Method boolean Iterator.hasNext()>
	//   71  161:ifeq            232
						obj1 = iterator.next();
	//   72  164:aload           5
	//   73  166:invokeinterface #227 <Method Object Iterator.next()>
	//   74  171:astore          6
						if(obj1 != null)
							break;
	//   75  173:aload           6
	//   76  175:ifnonnull       190
						if(!_suppressNulls)
	//*  77  178:aload_0         
	//*  78  179:getfield        #97  <Field boolean _suppressNulls>
	//*  79  182:ifeq            188
	//*  80  185:goto            154
							return false;
	//   81  188:iconst_0        
	//   82  189:ireturn         
					} while(true);
					JsonSerializer jsonserializer1;
					try
					{
						jsonserializer1 = _findSerializer(serializerprovider, obj1);
	//   83  190:aload_0         
	//   84  191:aload_1         
	//   85  192:aload           6
	//   86  194:invokespecial   #269 <Method JsonSerializer _findSerializer(SerializerProvider, Object)>
	//   87  197:astore          7
					}
	//*  88  199:iload_3         
	//*  89  200:ifeq            216
	//*  90  203:aload           7
	//*  91  205:aload_1         
	//*  92  206:aload           6
	//*  93  208:invokevirtual   #274 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//*  94  211:ifne            154
	//*  95  214:iconst_0        
	//*  96  215:ireturn         
	//*  97  216:aload           4
	//*  98  218:ifnull          230
	//*  99  221:aload           4
	//* 100  223:aload_2         
	//* 101  224:invokevirtual   #277 <Method boolean Object.equals(Object)>
	//* 102  227:ifne            154
	//* 103  230:iconst_0        
	//* 104  231:ireturn         
	//* 105  232:iconst_1        
	//* 106  233:ireturn         
					// Misplaced declaration of an exception variable
					catch(SerializerProvider serializerprovider)
	//* 107  234:astore_1        
					{
						return false;
	//  108  235:iconst_0        
	//  109  236:ireturn         
					}
					if(!flag)
						continue label4;
				} while(jsonserializer1.isEmpty(serializerprovider, obj1));
				return false;
			} while(obj != null && obj.equals(((Object) (map))));
			return false;
		}
		return true;
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((Map)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #62  <Class Map>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #503 <Method void serialize(Map, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
label0:
		{
			jsongenerator.writeStartObject(((Object) (map)));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #509 <Method void JsonGenerator.writeStartObject(Object)>
			if(map.isEmpty())
				break label0;
	//    3    5:aload_1         
	//    4    6:invokeinterface #492 <Method boolean Map.isEmpty()>
	//    5   11:ifne            148
			if(_sortKeys || serializerprovider.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS))
	//*   6   14:aload_0         
	//*   7   15:getfield        #93  <Field boolean _sortKeys>
	//*   8   18:ifne            37
	//*   9   21:aload_3         
	//*  10   22:getstatic       #515 <Field SerializationFeature SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS>
	//*  11   25:invokevirtual   #519 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  12   28:ifeq            34
	//*  13   31:goto            37
	//*  14   34:goto            45
				map = _orderEntries(map, jsongenerator, serializerprovider);
	//   15   37:aload_0         
	//   16   38:aload_1         
	//   17   39:aload_2         
	//   18   40:aload_3         
	//   19   41:invokevirtual   #521 <Method Map _orderEntries(Map, JsonGenerator, SerializerProvider)>
	//   20   44:astore_1        
			Object obj = _filterId;
	//   21   45:aload_0         
	//   22   46:getfield        #91  <Field Object _filterId>
	//   23   49:astore          4
			if(obj != null)
	//*  24   51:aload           4
	//*  25   53:ifnull          87
			{
				obj = ((Object) (findPropertyFilter(serializerprovider, obj, ((Object) (map)))));
	//   26   56:aload_0         
	//   27   57:aload_3         
	//   28   58:aload           4
	//   29   60:aload_1         
	//   30   61:invokevirtual   #525 <Method PropertyFilter findPropertyFilter(SerializerProvider, Object, Object)>
	//   31   64:astore          4
				if(obj != null)
	//*  32   66:aload           4
	//*  33   68:ifnull          87
				{
					serializeFilteredFields(map, jsongenerator, serializerprovider, ((PropertyFilter) (obj)), _suppressableValue);
	//   34   71:aload_0         
	//   35   72:aload_1         
	//   36   73:aload_2         
	//   37   74:aload_3         
	//   38   75:aload           4
	//   39   77:aload_0         
	//   40   78:getfield        #95  <Field Object _suppressableValue>
	//   41   81:invokevirtual   #529 <Method void serializeFilteredFields(Map, JsonGenerator, SerializerProvider, PropertyFilter, Object)>
					break label0;
	//   42   84:goto            148
				}
			}
			if(_suppressableValue == null && !_suppressNulls)
	//*  43   87:aload_0         
	//*  44   88:getfield        #95  <Field Object _suppressableValue>
	//*  45   91:ifnonnull       137
	//*  46   94:aload_0         
	//*  47   95:getfield        #97  <Field boolean _suppressNulls>
	//*  48   98:ifeq            104
	//*  49  101:goto            137
			{
				JsonSerializer jsonserializer = _valueSerializer;
	//   50  104:aload_0         
	//   51  105:getfield        #85  <Field JsonSerializer _valueSerializer>
	//   52  108:astore          4
				if(jsonserializer != null)
	//*  53  110:aload           4
	//*  54  112:ifnull          127
					serializeFieldsUsing(map, jsongenerator, serializerprovider, jsonserializer);
	//   55  115:aload_0         
	//   56  116:aload_1         
	//   57  117:aload_2         
	//   58  118:aload_3         
	//   59  119:aload           4
	//   60  121:invokevirtual   #533 <Method void serializeFieldsUsing(Map, JsonGenerator, SerializerProvider, JsonSerializer)>
				else
	//*  61  124:goto            148
					serializeFields(map, jsongenerator, serializerprovider);
	//   62  127:aload_0         
	//   63  128:aload_1         
	//   64  129:aload_2         
	//   65  130:aload_3         
	//   66  131:invokevirtual   #536 <Method void serializeFields(Map, JsonGenerator, SerializerProvider)>
			} else
	//*  67  134:goto            148
			{
				serializeOptionalFields(map, jsongenerator, serializerprovider, _suppressableValue);
	//   68  137:aload_0         
	//   69  138:aload_1         
	//   70  139:aload_2         
	//   71  140:aload_3         
	//   72  141:aload_0         
	//   73  142:getfield        #95  <Field Object _suppressableValue>
	//   74  145:invokevirtual   #540 <Method void serializeOptionalFields(Map, JsonGenerator, SerializerProvider, Object)>
			}
		}
		jsongenerator.writeEndObject();
	//   75  148:aload_2         
	//   76  149:invokevirtual   #543 <Method void JsonGenerator.writeEndObject()>
	//   77  152:return          
	}

	public void serializeFields(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		JsonSerializer jsonserializer1;
		Set set;
		if(_valueTypeSerializer != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field TypeSerializer _valueTypeSerializer>
	//*   2    4:ifnull          16
		{
			serializeTypedFields(map, jsongenerator, serializerprovider, ((Object) (null)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aconst_null     
	//    8   12:invokevirtual   #547 <Method void serializeTypedFields(Map, JsonGenerator, SerializerProvider, Object)>
			return;
	//    9   15:return          
		}
		jsonserializer1 = _keySerializer;
	//   10   16:aload_0         
	//   11   17:getfield        #83  <Field JsonSerializer _keySerializer>
	//   12   20:astore          8
		set = _ignoredEntries;
	//   13   22:aload_0         
	//   14   23:getfield        #73  <Field Set _ignoredEntries>
	//   15   26:astore          9
		Iterator iterator = map.entrySet().iterator();
	//   16   28:aload_1         
	//   17   29:invokeinterface #214 <Method Set Map.entrySet()>
	//   18   34:invokeinterface #218 <Method Iterator Set.iterator()>
	//   19   39:astore          10
		Object obj1 = null;
	//   20   41:aconst_null     
	//   21   42:astore          5
_L3:
		Object obj;
		obj = obj1;
	//   22   44:aload           5
	//   23   46:astore          4
		Object obj2;
		JsonSerializer jsonserializer;
		Object obj3;
		try
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_252;
	//   24   48:aload           10
	//   25   50:invokeinterface #223 <Method boolean Iterator.hasNext()>
	//   26   55:ifeq            252
		}
	//*  27   58:aload           5
	//*  28   60:astore          4
	//*  29   62:aload           10
	//*  30   64:invokeinterface #227 <Method Object Iterator.next()>
	//*  31   69:checkcast       #229 <Class java.util.Map$Entry>
	//*  32   72:astore          6
	//*  33   74:aload           5
	//*  34   76:astore          4
	//*  35   78:aload           6
	//*  36   80:invokeinterface #235 <Method Object java.util.Map$Entry.getValue()>
	//*  37   85:astore          11
	//*  38   87:aload           5
	//*  39   89:astore          4
	//*  40   91:aload           6
	//*  41   93:invokeinterface #232 <Method Object java.util.Map$Entry.getKey()>
	//*  42   98:astore          5
	//*  43  100:aload           5
	//*  44  102:ifnonnull       130
	//*  45  105:aload           5
	//*  46  107:astore          4
	//*  47  109:aload_3         
	//*  48  110:aload_0         
	//*  49  111:getfield        #75  <Field JavaType _keyType>
	//*  50  114:aload_0         
	//*  51  115:getfield        #89  <Field BeanProperty _property>
	//*  52  118:invokevirtual   #263 <Method JsonSerializer SerializerProvider.findNullKeySerializer(JavaType, BeanProperty)>
	//*  53  121:aconst_null     
	//*  54  122:aload_2         
	//*  55  123:aload_3         
	//*  56  124:invokevirtual   #281 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//*  57  127:goto            167
	//*  58  130:aload           9
	//*  59  132:ifnull          154
	//*  60  135:aload           5
	//*  61  137:astore          4
	//*  62  139:aload           9
	//*  63  141:aload           5
	//*  64  143:invokeinterface #550 <Method boolean Set.contains(Object)>
	//*  65  148:ifeq            154
	//*  66  151:goto            44
	//*  67  154:aload           5
	//*  68  156:astore          4
	//*  69  158:aload           8
	//*  70  160:aload           5
	//*  71  162:aload_2         
	//*  72  163:aload_3         
	//*  73  164:invokevirtual   #281 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//*  74  167:aload           11
	//*  75  169:ifnonnull       184
	//*  76  172:aload           5
	//*  77  174:astore          4
	//*  78  176:aload_3         
	//*  79  177:aload_2         
	//*  80  178:invokevirtual   #554 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
	//*  81  181:goto            44
	//*  82  184:aload           5
	//*  83  186:astore          4
	//*  84  188:aload_0         
	//*  85  189:getfield        #85  <Field JsonSerializer _valueSerializer>
	//*  86  192:astore          7
	//*  87  194:aload           7
	//*  88  196:astore          6
	//*  89  198:aload           7
	//*  90  200:ifnonnull       216
	//*  91  203:aload           5
	//*  92  205:astore          4
	//*  93  207:aload_0         
	//*  94  208:aload_3         
	//*  95  209:aload           11
	//*  96  211:invokespecial   #269 <Method JsonSerializer _findSerializer(SerializerProvider, Object)>
	//*  97  214:astore          6
	//*  98  216:aload           5
	//*  99  218:astore          4
	//* 100  220:aload           6
	//* 101  222:aload           11
	//* 102  224:aload_2         
	//* 103  225:aload_3         
	//* 104  226:invokevirtual   #281 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//* 105  229:goto            44
		// Misplaced declaration of an exception variable
		catch(JsonGenerator jsongenerator)
	//* 106  232:astore_2        
		{
			break MISSING_BLOCK_LABEL_240;
	//  107  233:goto            240
		}
		obj = obj1;
		obj2 = ((Object) ((java.util.Map.Entry)iterator.next()));
		obj = obj1;
		obj3 = ((java.util.Map.Entry) (obj2)).getValue();
		obj = obj1;
		obj1 = ((java.util.Map.Entry) (obj2)).getKey();
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_130;
		obj = obj1;
		serializerprovider.findNullKeySerializer(_keyType, _property).serialize(((Object) (null)), jsongenerator, serializerprovider);
		break MISSING_BLOCK_LABEL_167;
		if(set == null) goto _L2; else goto _L1
_L1:
		obj = obj1;
		if(!set.contains(obj1)) goto _L2; else goto _L3
_L2:
		obj = obj1;
		jsonserializer1.serialize(obj1, jsongenerator, serializerprovider);
		if(obj3 != null)
			break MISSING_BLOCK_LABEL_184;
		obj = obj1;
		serializerprovider.defaultSerializeNull(jsongenerator);
		  goto _L3
		obj = obj1;
		jsonserializer = _valueSerializer;
		obj2 = ((Object) (jsonserializer));
		if(jsonserializer != null)
			break MISSING_BLOCK_LABEL_216;
		obj = obj1;
		obj2 = ((Object) (_findSerializer(serializerprovider, obj3)));
		obj = obj1;
		((JsonSerializer) (obj2)).serialize(obj3, jsongenerator, serializerprovider);
		  goto _L3
		jsongenerator;
	//  108  236:astore_2        
		obj = null;
	//  109  237:aconst_null     
	//  110  238:astore          4
		wrapAndThrow(serializerprovider, ((Throwable) (jsongenerator)), ((Object) (map)), String.valueOf(obj));
	//  111  240:aload_0         
	//  112  241:aload_3         
	//  113  242:aload_2         
	//  114  243:aload_1         
	//  115  244:aload           4
	//  116  246:invokestatic    #558 <Method String String.valueOf(Object)>
	//  117  249:invokevirtual   #287 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, String)>
	//  118  252:return          
	}

	public void serializeFieldsUsing(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider, JsonSerializer jsonserializer)
		throws IOException
	{
		JsonSerializer jsonserializer1;
		Set set;
		TypeSerializer typeserializer;
		Iterator iterator;
		jsonserializer1 = _keySerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field JsonSerializer _keySerializer>
	//    2    4:astore          5
		set = _ignoredEntries;
	//    3    6:aload_0         
	//    4    7:getfield        #73  <Field Set _ignoredEntries>
	//    5   10:astore          6
		typeserializer = _valueTypeSerializer;
	//    6   12:aload_0         
	//    7   13:getfield        #81  <Field TypeSerializer _valueTypeSerializer>
	//    8   16:astore          7
		iterator = map.entrySet().iterator();
	//    9   18:aload_1         
	//   10   19:invokeinterface #214 <Method Set Map.entrySet()>
	//   11   24:invokeinterface #218 <Method Iterator Set.iterator()>
	//   12   29:astore          8
_L2:
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//   13   31:aload           8
	//   14   33:invokeinterface #223 <Method boolean Iterator.hasNext()>
	//   15   38:ifeq            188
		Object obj1 = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   16   41:aload           8
	//   17   43:invokeinterface #227 <Method Object Iterator.next()>
	//   18   48:checkcast       #229 <Class java.util.Map$Entry>
	//   19   51:astore          10
		Object obj = ((java.util.Map.Entry) (obj1)).getKey();
	//   20   53:aload           10
	//   21   55:invokeinterface #232 <Method Object java.util.Map$Entry.getKey()>
	//   22   60:astore          9
		if(set != null && set.contains(obj))
	//*  23   62:aload           6
	//*  24   64:ifnull          82
	//*  25   67:aload           6
	//*  26   69:aload           9
	//*  27   71:invokeinterface #550 <Method boolean Set.contains(Object)>
	//*  28   76:ifeq            82
			continue; /* Loop/switch isn't completed */
	//   29   79:goto            31
		if(obj == null)
	//*  30   82:aload           9
	//*  31   84:ifnonnull       108
			serializerprovider.findNullKeySerializer(_keyType, _property).serialize(((Object) (null)), jsongenerator, serializerprovider);
	//   32   87:aload_3         
	//   33   88:aload_0         
	//   34   89:getfield        #75  <Field JavaType _keyType>
	//   35   92:aload_0         
	//   36   93:getfield        #89  <Field BeanProperty _property>
	//   37   96:invokevirtual   #263 <Method JsonSerializer SerializerProvider.findNullKeySerializer(JavaType, BeanProperty)>
	//   38   99:aconst_null     
	//   39  100:aload_2         
	//   40  101:aload_3         
	//   41  102:invokevirtual   #281 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
		else
	//*  42  105:goto            117
			jsonserializer1.serialize(obj, jsongenerator, serializerprovider);
	//   43  108:aload           5
	//   44  110:aload           9
	//   45  112:aload_2         
	//   46  113:aload_3         
	//   47  114:invokevirtual   #281 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
		obj1 = ((java.util.Map.Entry) (obj1)).getValue();
	//   48  117:aload           10
	//   49  119:invokeinterface #235 <Method Object java.util.Map$Entry.getValue()>
	//   50  124:astore          10
		if(obj1 == null)
	//*  51  126:aload           10
	//*  52  128:ifnonnull       139
		{
			serializerprovider.defaultSerializeNull(jsongenerator);
	//   53  131:aload_3         
	//   54  132:aload_2         
	//   55  133:invokevirtual   #554 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
			continue; /* Loop/switch isn't completed */
	//   56  136:goto            31
		}
		if(typeserializer == null)
	//*  57  139:aload           7
	//*  58  141:ifnonnull       156
		{
			try
			{
				jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
	//   59  144:aload           4
	//   60  146:aload           10
	//   61  148:aload_2         
	//   62  149:aload_3         
	//   63  150:invokevirtual   #281 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			}
	//*  64  153:goto            31
	//*  65  156:aload           4
	//*  66  158:aload           10
	//*  67  160:aload_2         
	//*  68  161:aload_3         
	//*  69  162:aload           7
	//*  70  164:invokevirtual   #562 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
	//*  71  167:goto            31
			catch(Exception exception)
	//*  72  170:astore          10
			{
				wrapAndThrow(serializerprovider, ((Throwable) (exception)), ((Object) (map)), String.valueOf(obj));
	//   73  172:aload_0         
	//   74  173:aload_3         
	//   75  174:aload           10
	//   76  176:aload_1         
	//   77  177:aload           9
	//   78  179:invokestatic    #558 <Method String String.valueOf(Object)>
	//   79  182:invokevirtual   #287 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, String)>
			}
			continue; /* Loop/switch isn't completed */
	//   80  185:goto            31
		}
		jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, typeserializer);
		if(true) goto _L2; else goto _L1
_L1:
	//   81  188:return          
	}

	public void serializeFilteredAnyProperties(SerializerProvider serializerprovider, JsonGenerator jsongenerator, Object obj, Map map, PropertyFilter propertyfilter, Object obj1)
		throws IOException
	{
		Set set = _ignoredEntries;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field Set _ignoredEntries>
	//    2    4:astore          11
		MapProperty mapproperty = new MapProperty(_valueTypeSerializer, _property);
	//    3    6:new             #567 <Class MapProperty>
	//    4    9:dup             
	//    5   10:aload_0         
	//    6   11:getfield        #81  <Field TypeSerializer _valueTypeSerializer>
	//    7   14:aload_0         
	//    8   15:getfield        #89  <Field BeanProperty _property>
	//    9   18:invokespecial   #570 <Method void MapProperty(TypeSerializer, BeanProperty)>
	//   10   21:astore          12
		boolean flag;
		if(MARKER_FOR_EMPTY == obj1)
	//*  11   23:getstatic       #57  <Field Object MARKER_FOR_EMPTY>
	//*  12   26:aload           6
	//*  13   28:if_acmpne       37
			flag = true;
	//   14   31:iconst_1        
	//   15   32:istore          7
		else
	//*  16   34:goto            40
			flag = false;
	//   17   37:iconst_0        
	//   18   38:istore          7
		Iterator iterator = map.entrySet().iterator();
	//   19   40:aload           4
	//   20   42:invokeinterface #214 <Method Set Map.entrySet()>
	//   21   47:invokeinterface #218 <Method Iterator Set.iterator()>
	//   22   52:astore          13
		do
		{
			if(!iterator.hasNext())
				break;
	//   23   54:aload           13
	//   24   56:invokeinterface #223 <Method boolean Iterator.hasNext()>
	//   25   61:ifeq            286
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   26   64:aload           13
	//   27   66:invokeinterface #227 <Method Object Iterator.next()>
	//   28   71:checkcast       #229 <Class java.util.Map$Entry>
	//   29   74:astore          8
			Object obj2 = entry.getKey();
	//   30   76:aload           8
	//   31   78:invokeinterface #232 <Method Object java.util.Map$Entry.getKey()>
	//   32   83:astore          14
			if(set != null && set.contains(obj2))
	//*  33   85:aload           11
	//*  34   87:ifnull          105
	//*  35   90:aload           11
	//*  36   92:aload           14
	//*  37   94:invokeinterface #550 <Method boolean Set.contains(Object)>
	//*  38   99:ifeq            105
				continue;
	//   39  102:goto            54
			JsonSerializer jsonserializer1;
			if(obj2 == null)
	//*  40  105:aload           14
	//*  41  107:ifnonnull       127
				jsonserializer1 = serializerprovider.findNullKeySerializer(_keyType, _property);
	//   42  110:aload_1         
	//   43  111:aload_0         
	//   44  112:getfield        #75  <Field JavaType _keyType>
	//   45  115:aload_0         
	//   46  116:getfield        #89  <Field BeanProperty _property>
	//   47  119:invokevirtual   #263 <Method JsonSerializer SerializerProvider.findNullKeySerializer(JavaType, BeanProperty)>
	//   48  122:astore          9
			else
	//*  49  124:goto            133
				jsonserializer1 = _keySerializer;
	//   50  127:aload_0         
	//   51  128:getfield        #83  <Field JsonSerializer _keySerializer>
	//   52  131:astore          9
			Object obj3 = entry.getValue();
	//   53  133:aload           8
	//   54  135:invokeinterface #235 <Method Object java.util.Map$Entry.getValue()>
	//   55  140:astore          15
			JsonSerializer jsonserializer2;
			if(obj3 == null)
	//*  56  142:aload           15
	//*  57  144:ifnonnull       166
			{
				if(_suppressNulls)
	//*  58  147:aload_0         
	//*  59  148:getfield        #97  <Field boolean _suppressNulls>
	//*  60  151:ifeq            157
					continue;
	//   61  154:goto            54
				jsonserializer2 = serializerprovider.getDefaultNullValueSerializer();
	//   62  157:aload_1         
	//   63  158:invokevirtual   #267 <Method JsonSerializer SerializerProvider.getDefaultNullValueSerializer()>
	//   64  161:astore          10
			} else
	//*  65  163:goto            239
			{
				jsonserializer2 = _valueSerializer;
	//   66  166:aload_0         
	//   67  167:getfield        #85  <Field JsonSerializer _valueSerializer>
	//   68  170:astore          10
				JsonSerializer jsonserializer = jsonserializer2;
	//   69  172:aload           10
	//   70  174:astore          8
				if(jsonserializer2 == null)
	//*  71  176:aload           10
	//*  72  178:ifnonnull       190
					jsonserializer = _findSerializer(serializerprovider, obj3);
	//   73  181:aload_0         
	//   74  182:aload_1         
	//   75  183:aload           15
	//   76  185:invokespecial   #269 <Method JsonSerializer _findSerializer(SerializerProvider, Object)>
	//   77  188:astore          8
				if(flag)
	//*  78  190:iload           7
	//*  79  192:ifeq            213
				{
					jsonserializer2 = jsonserializer;
	//   80  195:aload           8
	//   81  197:astore          10
					if(jsonserializer.isEmpty(serializerprovider, obj3))
	//*  82  199:aload           8
	//*  83  201:aload_1         
	//*  84  202:aload           15
	//*  85  204:invokevirtual   #274 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//*  86  207:ifeq            239
						continue;
	//   87  210:goto            54
				} else
				{
					jsonserializer2 = jsonserializer;
	//   88  213:aload           8
	//   89  215:astore          10
					if(obj1 != null)
	//*  90  217:aload           6
	//*  91  219:ifnull          239
					{
						jsonserializer2 = jsonserializer;
	//   92  222:aload           8
	//   93  224:astore          10
						if(obj1.equals(obj3))
	//*  94  226:aload           6
	//*  95  228:aload           15
	//*  96  230:invokevirtual   #277 <Method boolean Object.equals(Object)>
	//*  97  233:ifeq            239
							continue;
	//   98  236:goto            54
					}
				}
			}
			mapproperty.reset(obj2, obj3, jsonserializer1, jsonserializer2);
	//   99  239:aload           12
	//  100  241:aload           14
	//  101  243:aload           15
	//  102  245:aload           9
	//  103  247:aload           10
	//  104  249:invokevirtual   #574 <Method void MapProperty.reset(Object, Object, JsonSerializer, JsonSerializer)>
			try
			{
				propertyfilter.serializeAsField(obj, jsongenerator, serializerprovider, ((com.fasterxml.jackson.databind.ser.PropertyWriter) (mapproperty)));
	//  105  252:aload           5
	//  106  254:aload_3         
	//  107  255:aload_2         
	//  108  256:aload_1         
	//  109  257:aload           12
	//  110  259:invokeinterface #580 <Method void PropertyFilter.serializeAsField(Object, JsonGenerator, SerializerProvider, com.fasterxml.jackson.databind.ser.PropertyWriter)>
			}
	//* 111  264:goto            54
			catch(Exception exception)
	//* 112  267:astore          8
			{
				wrapAndThrow(serializerprovider, ((Throwable) (exception)), ((Object) (map)), String.valueOf(obj2));
	//  113  269:aload_0         
	//  114  270:aload_1         
	//  115  271:aload           8
	//  116  273:aload           4
	//  117  275:aload           14
	//  118  277:invokestatic    #558 <Method String String.valueOf(Object)>
	//  119  280:invokevirtual   #287 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, String)>
			}
		} while(true);
	//  120  283:goto            54
	//  121  286:return          
	}

	public void serializeFilteredFields(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider, PropertyFilter propertyfilter, Object obj)
		throws IOException
	{
		Set set = _ignoredEntries;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field Set _ignoredEntries>
	//    2    4:astore          10
		MapProperty mapproperty = new MapProperty(_valueTypeSerializer, _property);
	//    3    6:new             #567 <Class MapProperty>
	//    4    9:dup             
	//    5   10:aload_0         
	//    6   11:getfield        #81  <Field TypeSerializer _valueTypeSerializer>
	//    7   14:aload_0         
	//    8   15:getfield        #89  <Field BeanProperty _property>
	//    9   18:invokespecial   #570 <Method void MapProperty(TypeSerializer, BeanProperty)>
	//   10   21:astore          11
		boolean flag;
		if(MARKER_FOR_EMPTY == obj)
	//*  11   23:getstatic       #57  <Field Object MARKER_FOR_EMPTY>
	//*  12   26:aload           5
	//*  13   28:if_acmpne       37
			flag = true;
	//   14   31:iconst_1        
	//   15   32:istore          6
		else
	//*  16   34:goto            40
			flag = false;
	//   17   37:iconst_0        
	//   18   38:istore          6
		Iterator iterator = map.entrySet().iterator();
	//   19   40:aload_1         
	//   20   41:invokeinterface #214 <Method Set Map.entrySet()>
	//   21   46:invokeinterface #218 <Method Iterator Set.iterator()>
	//   22   51:astore          12
		do
		{
			if(!iterator.hasNext())
				break;
	//   23   53:aload           12
	//   24   55:invokeinterface #223 <Method boolean Iterator.hasNext()>
	//   25   60:ifeq            284
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   26   63:aload           12
	//   27   65:invokeinterface #227 <Method Object Iterator.next()>
	//   28   70:checkcast       #229 <Class java.util.Map$Entry>
	//   29   73:astore          7
			Object obj1 = entry.getKey();
	//   30   75:aload           7
	//   31   77:invokeinterface #232 <Method Object java.util.Map$Entry.getKey()>
	//   32   82:astore          13
			if(set != null && set.contains(obj1))
	//*  33   84:aload           10
	//*  34   86:ifnull          104
	//*  35   89:aload           10
	//*  36   91:aload           13
	//*  37   93:invokeinterface #550 <Method boolean Set.contains(Object)>
	//*  38   98:ifeq            104
				continue;
	//   39  101:goto            53
			JsonSerializer jsonserializer1;
			if(obj1 == null)
	//*  40  104:aload           13
	//*  41  106:ifnonnull       126
				jsonserializer1 = serializerprovider.findNullKeySerializer(_keyType, _property);
	//   42  109:aload_3         
	//   43  110:aload_0         
	//   44  111:getfield        #75  <Field JavaType _keyType>
	//   45  114:aload_0         
	//   46  115:getfield        #89  <Field BeanProperty _property>
	//   47  118:invokevirtual   #263 <Method JsonSerializer SerializerProvider.findNullKeySerializer(JavaType, BeanProperty)>
	//   48  121:astore          8
			else
	//*  49  123:goto            132
				jsonserializer1 = _keySerializer;
	//   50  126:aload_0         
	//   51  127:getfield        #83  <Field JsonSerializer _keySerializer>
	//   52  130:astore          8
			Object obj2 = entry.getValue();
	//   53  132:aload           7
	//   54  134:invokeinterface #235 <Method Object java.util.Map$Entry.getValue()>
	//   55  139:astore          14
			JsonSerializer jsonserializer2;
			if(obj2 == null)
	//*  56  141:aload           14
	//*  57  143:ifnonnull       165
			{
				if(_suppressNulls)
	//*  58  146:aload_0         
	//*  59  147:getfield        #97  <Field boolean _suppressNulls>
	//*  60  150:ifeq            156
					continue;
	//   61  153:goto            53
				jsonserializer2 = serializerprovider.getDefaultNullValueSerializer();
	//   62  156:aload_3         
	//   63  157:invokevirtual   #267 <Method JsonSerializer SerializerProvider.getDefaultNullValueSerializer()>
	//   64  160:astore          9
			} else
	//*  65  162:goto            238
			{
				jsonserializer2 = _valueSerializer;
	//   66  165:aload_0         
	//   67  166:getfield        #85  <Field JsonSerializer _valueSerializer>
	//   68  169:astore          9
				JsonSerializer jsonserializer = jsonserializer2;
	//   69  171:aload           9
	//   70  173:astore          7
				if(jsonserializer2 == null)
	//*  71  175:aload           9
	//*  72  177:ifnonnull       189
					jsonserializer = _findSerializer(serializerprovider, obj2);
	//   73  180:aload_0         
	//   74  181:aload_3         
	//   75  182:aload           14
	//   76  184:invokespecial   #269 <Method JsonSerializer _findSerializer(SerializerProvider, Object)>
	//   77  187:astore          7
				if(flag)
	//*  78  189:iload           6
	//*  79  191:ifeq            212
				{
					jsonserializer2 = jsonserializer;
	//   80  194:aload           7
	//   81  196:astore          9
					if(jsonserializer.isEmpty(serializerprovider, obj2))
	//*  82  198:aload           7
	//*  83  200:aload_3         
	//*  84  201:aload           14
	//*  85  203:invokevirtual   #274 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//*  86  206:ifeq            238
						continue;
	//   87  209:goto            53
				} else
				{
					jsonserializer2 = jsonserializer;
	//   88  212:aload           7
	//   89  214:astore          9
					if(obj != null)
	//*  90  216:aload           5
	//*  91  218:ifnull          238
					{
						jsonserializer2 = jsonserializer;
	//   92  221:aload           7
	//   93  223:astore          9
						if(obj.equals(obj2))
	//*  94  225:aload           5
	//*  95  227:aload           14
	//*  96  229:invokevirtual   #277 <Method boolean Object.equals(Object)>
	//*  97  232:ifeq            238
							continue;
	//   98  235:goto            53
					}
				}
			}
			mapproperty.reset(obj1, obj2, jsonserializer1, jsonserializer2);
	//   99  238:aload           11
	//  100  240:aload           13
	//  101  242:aload           14
	//  102  244:aload           8
	//  103  246:aload           9
	//  104  248:invokevirtual   #574 <Method void MapProperty.reset(Object, Object, JsonSerializer, JsonSerializer)>
			try
			{
				propertyfilter.serializeAsField(((Object) (map)), jsongenerator, serializerprovider, ((com.fasterxml.jackson.databind.ser.PropertyWriter) (mapproperty)));
	//  105  251:aload           4
	//  106  253:aload_1         
	//  107  254:aload_2         
	//  108  255:aload_3         
	//  109  256:aload           11
	//  110  258:invokeinterface #580 <Method void PropertyFilter.serializeAsField(Object, JsonGenerator, SerializerProvider, com.fasterxml.jackson.databind.ser.PropertyWriter)>
			}
	//* 111  263:goto            53
			catch(Exception exception)
	//* 112  266:astore          7
			{
				wrapAndThrow(serializerprovider, ((Throwable) (exception)), ((Object) (map)), String.valueOf(obj1));
	//  113  268:aload_0         
	//  114  269:aload_3         
	//  115  270:aload           7
	//  116  272:aload_1         
	//  117  273:aload           13
	//  118  275:invokestatic    #558 <Method String String.valueOf(Object)>
	//  119  278:invokevirtual   #287 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, String)>
			}
		} while(true);
	//  120  281:goto            53
	//  121  284:return          
	}

	public void serializeOptionalFields(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider, Object obj)
		throws IOException
	{
		if(_valueTypeSerializer != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field TypeSerializer _valueTypeSerializer>
	//*   2    4:ifnull          17
		{
			serializeTypedFields(map, jsongenerator, serializerprovider, obj);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:invokevirtual   #547 <Method void serializeTypedFields(Map, JsonGenerator, SerializerProvider, Object)>
			return;
	//    9   16:return          
		}
		Set set = _ignoredEntries;
	//   10   17:aload_0         
	//   11   18:getfield        #73  <Field Set _ignoredEntries>
	//   12   21:astore          9
		boolean flag;
		if(MARKER_FOR_EMPTY == obj)
	//*  13   23:getstatic       #57  <Field Object MARKER_FOR_EMPTY>
	//*  14   26:aload           4
	//*  15   28:if_acmpne       37
			flag = true;
	//   16   31:iconst_1        
	//   17   32:istore          5
		else
	//*  18   34:goto            40
			flag = false;
	//   19   37:iconst_0        
	//   20   38:istore          5
		Iterator iterator = map.entrySet().iterator();
	//   21   40:aload_1         
	//   22   41:invokeinterface #214 <Method Set Map.entrySet()>
	//   23   46:invokeinterface #218 <Method Iterator Set.iterator()>
	//   24   51:astore          10
		do
		{
			if(!iterator.hasNext())
				break;
	//   25   53:aload           10
	//   26   55:invokeinterface #223 <Method boolean Iterator.hasNext()>
	//   27   60:ifeq            277
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   28   63:aload           10
	//   29   65:invokeinterface #227 <Method Object Iterator.next()>
	//   30   70:checkcast       #229 <Class java.util.Map$Entry>
	//   31   73:astore          6
			Object obj1 = entry.getKey();
	//   32   75:aload           6
	//   33   77:invokeinterface #232 <Method Object java.util.Map$Entry.getKey()>
	//   34   82:astore          11
			JsonSerializer jsonserializer1;
			if(obj1 == null)
	//*  35   84:aload           11
	//*  36   86:ifnonnull       106
			{
				jsonserializer1 = serializerprovider.findNullKeySerializer(_keyType, _property);
	//   37   89:aload_3         
	//   38   90:aload_0         
	//   39   91:getfield        #75  <Field JavaType _keyType>
	//   40   94:aload_0         
	//   41   95:getfield        #89  <Field BeanProperty _property>
	//   42   98:invokevirtual   #263 <Method JsonSerializer SerializerProvider.findNullKeySerializer(JavaType, BeanProperty)>
	//   43  101:astore          7
			} else
	//*  44  103:goto            132
			{
				if(set != null && set.contains(obj1))
	//*  45  106:aload           9
	//*  46  108:ifnull          126
	//*  47  111:aload           9
	//*  48  113:aload           11
	//*  49  115:invokeinterface #550 <Method boolean Set.contains(Object)>
	//*  50  120:ifeq            126
					continue;
	//   51  123:goto            53
				jsonserializer1 = _keySerializer;
	//   52  126:aload_0         
	//   53  127:getfield        #83  <Field JsonSerializer _keySerializer>
	//   54  130:astore          7
			}
			Object obj2 = entry.getValue();
	//   55  132:aload           6
	//   56  134:invokeinterface #235 <Method Object java.util.Map$Entry.getValue()>
	//   57  139:astore          12
			JsonSerializer jsonserializer2;
			if(obj2 == null)
	//*  58  141:aload           12
	//*  59  143:ifnonnull       165
			{
				if(_suppressNulls)
	//*  60  146:aload_0         
	//*  61  147:getfield        #97  <Field boolean _suppressNulls>
	//*  62  150:ifeq            156
					continue;
	//   63  153:goto            53
				jsonserializer2 = serializerprovider.getDefaultNullValueSerializer();
	//   64  156:aload_3         
	//   65  157:invokevirtual   #267 <Method JsonSerializer SerializerProvider.getDefaultNullValueSerializer()>
	//   66  160:astore          8
			} else
	//*  67  162:goto            238
			{
				jsonserializer2 = _valueSerializer;
	//   68  165:aload_0         
	//   69  166:getfield        #85  <Field JsonSerializer _valueSerializer>
	//   70  169:astore          8
				JsonSerializer jsonserializer = jsonserializer2;
	//   71  171:aload           8
	//   72  173:astore          6
				if(jsonserializer2 == null)
	//*  73  175:aload           8
	//*  74  177:ifnonnull       189
					jsonserializer = _findSerializer(serializerprovider, obj2);
	//   75  180:aload_0         
	//   76  181:aload_3         
	//   77  182:aload           12
	//   78  184:invokespecial   #269 <Method JsonSerializer _findSerializer(SerializerProvider, Object)>
	//   79  187:astore          6
				if(flag)
	//*  80  189:iload           5
	//*  81  191:ifeq            212
				{
					jsonserializer2 = jsonserializer;
	//   82  194:aload           6
	//   83  196:astore          8
					if(jsonserializer.isEmpty(serializerprovider, obj2))
	//*  84  198:aload           6
	//*  85  200:aload_3         
	//*  86  201:aload           12
	//*  87  203:invokevirtual   #274 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//*  88  206:ifeq            238
						continue;
	//   89  209:goto            53
				} else
				{
					jsonserializer2 = jsonserializer;
	//   90  212:aload           6
	//   91  214:astore          8
					if(obj != null)
	//*  92  216:aload           4
	//*  93  218:ifnull          238
					{
						jsonserializer2 = jsonserializer;
	//   94  221:aload           6
	//   95  223:astore          8
						if(obj.equals(obj2))
	//*  96  225:aload           4
	//*  97  227:aload           12
	//*  98  229:invokevirtual   #277 <Method boolean Object.equals(Object)>
	//*  99  232:ifeq            238
							continue;
	//  100  235:goto            53
					}
				}
			}
			try
			{
				jsonserializer1.serialize(obj1, jsongenerator, serializerprovider);
	//  101  238:aload           7
	//  102  240:aload           11
	//  103  242:aload_2         
	//  104  243:aload_3         
	//  105  244:invokevirtual   #281 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
				jsonserializer2.serialize(obj2, jsongenerator, serializerprovider);
	//  106  247:aload           8
	//  107  249:aload           12
	//  108  251:aload_2         
	//  109  252:aload_3         
	//  110  253:invokevirtual   #281 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			}
	//* 111  256:goto            53
			catch(Exception exception)
	//* 112  259:astore          6
			{
				wrapAndThrow(serializerprovider, ((Throwable) (exception)), ((Object) (map)), String.valueOf(obj1));
	//  113  261:aload_0         
	//  114  262:aload_3         
	//  115  263:aload           6
	//  116  265:aload_1         
	//  117  266:aload           11
	//  118  268:invokestatic    #558 <Method String String.valueOf(Object)>
	//  119  271:invokevirtual   #287 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, String)>
			}
		} while(true);
	//  120  274:goto            53
	//  121  277:return          
	}

	public void serializeTypedFields(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider, Object obj)
		throws IOException
	{
		Set set = _ignoredEntries;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field Set _ignoredEntries>
	//    2    4:astore          9
		boolean flag;
		if(MARKER_FOR_EMPTY == obj)
	//*   3    6:getstatic       #57  <Field Object MARKER_FOR_EMPTY>
	//*   4    9:aload           4
	//*   5   11:if_acmpne       20
			flag = true;
	//    6   14:iconst_1        
	//    7   15:istore          5
		else
	//*   8   17:goto            23
			flag = false;
	//    9   20:iconst_0        
	//   10   21:istore          5
		Iterator iterator = map.entrySet().iterator();
	//   11   23:aload_1         
	//   12   24:invokeinterface #214 <Method Set Map.entrySet()>
	//   13   29:invokeinterface #218 <Method Iterator Set.iterator()>
	//   14   34:astore          10
		do
		{
			if(!iterator.hasNext())
				break;
	//   15   36:aload           10
	//   16   38:invokeinterface #223 <Method boolean Iterator.hasNext()>
	//   17   43:ifeq            264
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   18   46:aload           10
	//   19   48:invokeinterface #227 <Method Object Iterator.next()>
	//   20   53:checkcast       #229 <Class java.util.Map$Entry>
	//   21   56:astore          6
			Object obj1 = entry.getKey();
	//   22   58:aload           6
	//   23   60:invokeinterface #232 <Method Object java.util.Map$Entry.getKey()>
	//   24   65:astore          11
			JsonSerializer jsonserializer1;
			if(obj1 == null)
	//*  25   67:aload           11
	//*  26   69:ifnonnull       89
			{
				jsonserializer1 = serializerprovider.findNullKeySerializer(_keyType, _property);
	//   27   72:aload_3         
	//   28   73:aload_0         
	//   29   74:getfield        #75  <Field JavaType _keyType>
	//   30   77:aload_0         
	//   31   78:getfield        #89  <Field BeanProperty _property>
	//   32   81:invokevirtual   #263 <Method JsonSerializer SerializerProvider.findNullKeySerializer(JavaType, BeanProperty)>
	//   33   84:astore          7
			} else
	//*  34   86:goto            115
			{
				if(set != null && set.contains(obj1))
	//*  35   89:aload           9
	//*  36   91:ifnull          109
	//*  37   94:aload           9
	//*  38   96:aload           11
	//*  39   98:invokeinterface #550 <Method boolean Set.contains(Object)>
	//*  40  103:ifeq            109
					continue;
	//   41  106:goto            36
				jsonserializer1 = _keySerializer;
	//   42  109:aload_0         
	//   43  110:getfield        #83  <Field JsonSerializer _keySerializer>
	//   44  113:astore          7
			}
			Object obj2 = entry.getValue();
	//   45  115:aload           6
	//   46  117:invokeinterface #235 <Method Object java.util.Map$Entry.getValue()>
	//   47  122:astore          12
			JsonSerializer jsonserializer2;
			if(obj2 == null)
	//*  48  124:aload           12
	//*  49  126:ifnonnull       148
			{
				if(_suppressNulls)
	//*  50  129:aload_0         
	//*  51  130:getfield        #97  <Field boolean _suppressNulls>
	//*  52  133:ifeq            139
					continue;
	//   53  136:goto            36
				jsonserializer2 = serializerprovider.getDefaultNullValueSerializer();
	//   54  139:aload_3         
	//   55  140:invokevirtual   #267 <Method JsonSerializer SerializerProvider.getDefaultNullValueSerializer()>
	//   56  143:astore          8
			} else
	//*  57  145:goto            221
			{
				jsonserializer2 = _valueSerializer;
	//   58  148:aload_0         
	//   59  149:getfield        #85  <Field JsonSerializer _valueSerializer>
	//   60  152:astore          8
				JsonSerializer jsonserializer = jsonserializer2;
	//   61  154:aload           8
	//   62  156:astore          6
				if(jsonserializer2 == null)
	//*  63  158:aload           8
	//*  64  160:ifnonnull       172
					jsonserializer = _findSerializer(serializerprovider, obj2);
	//   65  163:aload_0         
	//   66  164:aload_3         
	//   67  165:aload           12
	//   68  167:invokespecial   #269 <Method JsonSerializer _findSerializer(SerializerProvider, Object)>
	//   69  170:astore          6
				if(flag)
	//*  70  172:iload           5
	//*  71  174:ifeq            195
				{
					jsonserializer2 = jsonserializer;
	//   72  177:aload           6
	//   73  179:astore          8
					if(jsonserializer.isEmpty(serializerprovider, obj2))
	//*  74  181:aload           6
	//*  75  183:aload_3         
	//*  76  184:aload           12
	//*  77  186:invokevirtual   #274 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//*  78  189:ifeq            221
						continue;
	//   79  192:goto            36
				} else
				{
					jsonserializer2 = jsonserializer;
	//   80  195:aload           6
	//   81  197:astore          8
					if(obj != null)
	//*  82  199:aload           4
	//*  83  201:ifnull          221
					{
						jsonserializer2 = jsonserializer;
	//   84  204:aload           6
	//   85  206:astore          8
						if(obj.equals(obj2))
	//*  86  208:aload           4
	//*  87  210:aload           12
	//*  88  212:invokevirtual   #277 <Method boolean Object.equals(Object)>
	//*  89  215:ifeq            221
							continue;
	//   90  218:goto            36
					}
				}
			}
			jsonserializer1.serialize(obj1, jsongenerator, serializerprovider);
	//   91  221:aload           7
	//   92  223:aload           11
	//   93  225:aload_2         
	//   94  226:aload_3         
	//   95  227:invokevirtual   #281 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			try
			{
				jsonserializer2.serializeWithType(obj2, jsongenerator, serializerprovider, _valueTypeSerializer);
	//   96  230:aload           8
	//   97  232:aload           12
	//   98  234:aload_2         
	//   99  235:aload_3         
	//  100  236:aload_0         
	//  101  237:getfield        #81  <Field TypeSerializer _valueTypeSerializer>
	//  102  240:invokevirtual   #562 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
			}
	//* 103  243:goto            36
			catch(Exception exception)
	//* 104  246:astore          6
			{
				wrapAndThrow(serializerprovider, ((Throwable) (exception)), ((Object) (map)), String.valueOf(obj1));
	//  105  248:aload_0         
	//  106  249:aload_3         
	//  107  250:aload           6
	//  108  252:aload_1         
	//  109  253:aload           11
	//  110  255:invokestatic    #558 <Method String String.valueOf(Object)>
	//  111  258:invokevirtual   #287 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, String)>
			}
		} while(true);
	//  112  261:goto            36
	//  113  264:return          
	}

	public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		serializeWithType((Map)obj, jsongenerator, serializerprovider, typeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #62  <Class Map>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #586 <Method void serializeWithType(Map, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}

	public void serializeWithType(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		com.fasterxml.jackson.core.type.WritableTypeId writabletypeid;
label0:
		{
			jsongenerator.setCurrentValue(((Object) (map)));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #589 <Method void JsonGenerator.setCurrentValue(Object)>
			writabletypeid = typeserializer.writeTypePrefix(jsongenerator, typeserializer.typeId(((Object) (map)), JsonToken.START_OBJECT));
	//    3    5:aload           4
	//    4    7:aload_2         
	//    5    8:aload           4
	//    6   10:aload_1         
	//    7   11:getstatic       #595 <Field JsonToken JsonToken.START_OBJECT>
	//    8   14:invokevirtual   #601 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.typeId(Object, JsonToken)>
	//    9   17:invokevirtual   #605 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   10   20:astore          5
			if(map.isEmpty())
				break label0;
	//   11   22:aload_1         
	//   12   23:invokeinterface #492 <Method boolean Map.isEmpty()>
	//   13   28:ifne            165
			if(_sortKeys || serializerprovider.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS))
	//*  14   31:aload_0         
	//*  15   32:getfield        #93  <Field boolean _sortKeys>
	//*  16   35:ifne            54
	//*  17   38:aload_3         
	//*  18   39:getstatic       #515 <Field SerializationFeature SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS>
	//*  19   42:invokevirtual   #519 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  20   45:ifeq            51
	//*  21   48:goto            54
	//*  22   51:goto            62
				map = _orderEntries(map, jsongenerator, serializerprovider);
	//   23   54:aload_0         
	//   24   55:aload_1         
	//   25   56:aload_2         
	//   26   57:aload_3         
	//   27   58:invokevirtual   #521 <Method Map _orderEntries(Map, JsonGenerator, SerializerProvider)>
	//   28   61:astore_1        
			Object obj = _filterId;
	//   29   62:aload_0         
	//   30   63:getfield        #91  <Field Object _filterId>
	//   31   66:astore          6
			if(obj != null)
	//*  32   68:aload           6
	//*  33   70:ifnull          104
			{
				obj = ((Object) (findPropertyFilter(serializerprovider, obj, ((Object) (map)))));
	//   34   73:aload_0         
	//   35   74:aload_3         
	//   36   75:aload           6
	//   37   77:aload_1         
	//   38   78:invokevirtual   #525 <Method PropertyFilter findPropertyFilter(SerializerProvider, Object, Object)>
	//   39   81:astore          6
				if(obj != null)
	//*  40   83:aload           6
	//*  41   85:ifnull          104
				{
					serializeFilteredFields(map, jsongenerator, serializerprovider, ((PropertyFilter) (obj)), _suppressableValue);
	//   42   88:aload_0         
	//   43   89:aload_1         
	//   44   90:aload_2         
	//   45   91:aload_3         
	//   46   92:aload           6
	//   47   94:aload_0         
	//   48   95:getfield        #95  <Field Object _suppressableValue>
	//   49   98:invokevirtual   #529 <Method void serializeFilteredFields(Map, JsonGenerator, SerializerProvider, PropertyFilter, Object)>
					break label0;
	//   50  101:goto            165
				}
			}
			if(_suppressableValue == null && !_suppressNulls)
	//*  51  104:aload_0         
	//*  52  105:getfield        #95  <Field Object _suppressableValue>
	//*  53  108:ifnonnull       154
	//*  54  111:aload_0         
	//*  55  112:getfield        #97  <Field boolean _suppressNulls>
	//*  56  115:ifeq            121
	//*  57  118:goto            154
			{
				JsonSerializer jsonserializer = _valueSerializer;
	//   58  121:aload_0         
	//   59  122:getfield        #85  <Field JsonSerializer _valueSerializer>
	//   60  125:astore          6
				if(jsonserializer != null)
	//*  61  127:aload           6
	//*  62  129:ifnull          144
					serializeFieldsUsing(map, jsongenerator, serializerprovider, jsonserializer);
	//   63  132:aload_0         
	//   64  133:aload_1         
	//   65  134:aload_2         
	//   66  135:aload_3         
	//   67  136:aload           6
	//   68  138:invokevirtual   #533 <Method void serializeFieldsUsing(Map, JsonGenerator, SerializerProvider, JsonSerializer)>
				else
	//*  69  141:goto            165
					serializeFields(map, jsongenerator, serializerprovider);
	//   70  144:aload_0         
	//   71  145:aload_1         
	//   72  146:aload_2         
	//   73  147:aload_3         
	//   74  148:invokevirtual   #536 <Method void serializeFields(Map, JsonGenerator, SerializerProvider)>
			} else
	//*  75  151:goto            165
			{
				serializeOptionalFields(map, jsongenerator, serializerprovider, _suppressableValue);
	//   76  154:aload_0         
	//   77  155:aload_1         
	//   78  156:aload_2         
	//   79  157:aload_3         
	//   80  158:aload_0         
	//   81  159:getfield        #95  <Field Object _suppressableValue>
	//   82  162:invokevirtual   #540 <Method void serializeOptionalFields(Map, JsonGenerator, SerializerProvider, Object)>
			}
		}
		typeserializer.writeTypeSuffix(jsongenerator, writabletypeid);
	//   83  165:aload           4
	//   84  167:aload_2         
	//   85  168:aload           5
	//   86  170:invokevirtual   #608 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   87  173:pop             
	//   88  174:return          
	}

	public MapSerializer withContentInclusion(Object obj, boolean flag)
	{
		if(obj == _suppressableValue && flag == _suppressNulls)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #95  <Field Object _suppressableValue>
	//*   3    5:if_acmpne       18
	//*   4    8:iload_2         
	//*   5    9:aload_0         
	//*   6   10:getfield        #97  <Field boolean _suppressNulls>
	//*   7   13:icmpne          18
		{
			return this;
	//    8   16:aload_0         
	//    9   17:areturn         
		} else
		{
			_ensureOverride("withContentInclusion");
	//   10   18:aload_0         
	//   11   19:ldc2            #610 <String "withContentInclusion">
	//   12   22:invokevirtual   #255 <Method void _ensureOverride(String)>
			return new MapSerializer(this, _valueTypeSerializer, obj, flag);
	//   13   25:new             #2   <Class MapSerializer>
	//   14   28:dup             
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #81  <Field TypeSerializer _valueTypeSerializer>
	//   18   34:aload_1         
	//   19   35:iload_2         
	//   20   36:invokespecial   #257 <Method void MapSerializer(MapSerializer, TypeSerializer, Object, boolean)>
	//   21   39:areturn         
		}
	}

	public volatile JsonSerializer withFilterId(Object obj)
	{
		return ((JsonSerializer) (withFilterId(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #163 <Method MapSerializer withFilterId(Object)>
	//    3    5:areturn         
	}

	public MapSerializer withFilterId(Object obj)
	{
		if(_filterId == obj)
	//*   0    0:aload_0         
	//*   1    1:getfield        #91  <Field Object _filterId>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
		{
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		} else
		{
			_ensureOverride("withFilterId");
	//    6   10:aload_0         
	//    7   11:ldc2            #612 <String "withFilterId">
	//    8   14:invokevirtual   #255 <Method void _ensureOverride(String)>
			return new MapSerializer(this, obj, _sortKeys);
	//    9   17:new             #2   <Class MapSerializer>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #93  <Field boolean _sortKeys>
	//   15   27:invokespecial   #614 <Method void MapSerializer(MapSerializer, Object, boolean)>
	//   16   30:areturn         
		}
	}

	public MapSerializer withResolved(BeanProperty beanproperty, JsonSerializer jsonserializer, JsonSerializer jsonserializer1, Set set, boolean flag)
	{
		_ensureOverride("withResolved");
	//    0    0:aload_0         
	//    1    1:ldc2            #615 <String "withResolved">
	//    2    4:invokevirtual   #255 <Method void _ensureOverride(String)>
		beanproperty = ((BeanProperty) (new MapSerializer(this, beanproperty, jsonserializer, jsonserializer1, set)));
	//    3    7:new             #2   <Class MapSerializer>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:aload           4
	//   10   17:invokespecial   #617 <Method void MapSerializer(MapSerializer, BeanProperty, JsonSerializer, JsonSerializer, Set)>
	//   11   20:astore_1        
		if(flag != ((MapSerializer) (beanproperty))._sortKeys)
	//*  12   21:iload           5
	//*  13   23:aload_1         
	//*  14   24:getfield        #93  <Field boolean _sortKeys>
	//*  15   27:icmpeq          45
			return new MapSerializer(((MapSerializer) (beanproperty)), _filterId, flag);
	//   16   30:new             #2   <Class MapSerializer>
	//   17   33:dup             
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #91  <Field Object _filterId>
	//   21   39:iload           5
	//   22   41:invokespecial   #614 <Method void MapSerializer(MapSerializer, Object, boolean)>
	//   23   44:areturn         
		else
			return ((MapSerializer) (beanproperty));
	//   24   45:aload_1         
	//   25   46:areturn         
	}

	public static final Object MARKER_FOR_EMPTY;
	protected static final JavaType UNSPECIFIED_TYPE = TypeFactory.unknownType();
	private static final long serialVersionUID = 1L;
	protected PropertySerializerMap _dynamicValueSerializers;
	protected final Object _filterId;
	protected final Set _ignoredEntries;
	protected JsonSerializer _keySerializer;
	protected final JavaType _keyType;
	protected final BeanProperty _property;
	protected final boolean _sortKeys;
	protected final boolean _suppressNulls;
	protected final Object _suppressableValue;
	protected JsonSerializer _valueSerializer;
	protected final JavaType _valueType;
	protected final boolean _valueTypeIsStatic;
	protected final TypeSerializer _valueTypeSerializer;

	static 
	{
	//    0    0:invokestatic    #47  <Method JavaType TypeFactory.unknownType()>
	//    1    3:putstatic       #49  <Field JavaType UNSPECIFIED_TYPE>
		MARKER_FOR_EMPTY = ((Object) (com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY));
	//    2    6:getstatic       #55  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_EMPTY>
	//    3    9:putstatic       #57  <Field Object MARKER_FOR_EMPTY>
	//*   4   12:return          
	}
}
