// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonMapFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.*;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			MapProperty

public class MapSerializer extends ContainerSerializer
	implements ContextualSerializer
{

	protected MapSerializer(MapSerializer mapserializer, BeanProperty beanproperty, JsonSerializer jsonserializer, JsonSerializer jsonserializer1, HashSet hashset)
	{
		super(java/util/Map, false);
	//    0    0:aload_0         
	//    1    1:ldc1            #50  <Class Map>
	//    2    3:iconst_0        
	//    3    4:invokespecial   #53  <Method void ContainerSerializer(Class, boolean)>
		_ignoredEntries = hashset;
	//    4    7:aload_0         
	//    5    8:aload           5
	//    6   10:putfield        #55  <Field HashSet _ignoredEntries>
		_keyType = mapserializer._keyType;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #57  <Field JavaType _keyType>
	//   10   18:putfield        #57  <Field JavaType _keyType>
		_valueType = mapserializer._valueType;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:getfield        #59  <Field JavaType _valueType>
	//   14   26:putfield        #59  <Field JavaType _valueType>
		_valueTypeIsStatic = mapserializer._valueTypeIsStatic;
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:getfield        #61  <Field boolean _valueTypeIsStatic>
	//   18   34:putfield        #61  <Field boolean _valueTypeIsStatic>
		_valueTypeSerializer = mapserializer._valueTypeSerializer;
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:getfield        #63  <Field TypeSerializer _valueTypeSerializer>
	//   22   42:putfield        #63  <Field TypeSerializer _valueTypeSerializer>
		_keySerializer = jsonserializer;
	//   23   45:aload_0         
	//   24   46:aload_3         
	//   25   47:putfield        #65  <Field JsonSerializer _keySerializer>
		_valueSerializer = jsonserializer1;
	//   26   50:aload_0         
	//   27   51:aload           4
	//   28   53:putfield        #67  <Field JsonSerializer _valueSerializer>
		_dynamicValueSerializers = mapserializer._dynamicValueSerializers;
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:getfield        #69  <Field PropertySerializerMap _dynamicValueSerializers>
	//   32   61:putfield        #69  <Field PropertySerializerMap _dynamicValueSerializers>
		_property = beanproperty;
	//   33   64:aload_0         
	//   34   65:aload_2         
	//   35   66:putfield        #71  <Field BeanProperty _property>
		_filterId = mapserializer._filterId;
	//   36   69:aload_0         
	//   37   70:aload_1         
	//   38   71:getfield        #73  <Field Object _filterId>
	//   39   74:putfield        #73  <Field Object _filterId>
		_sortKeys = mapserializer._sortKeys;
	//   40   77:aload_0         
	//   41   78:aload_1         
	//   42   79:getfield        #75  <Field boolean _sortKeys>
	//   43   82:putfield        #75  <Field boolean _sortKeys>
		_suppressableValue = mapserializer._suppressableValue;
	//   44   85:aload_0         
	//   45   86:aload_1         
	//   46   87:getfield        #77  <Field Object _suppressableValue>
	//   47   90:putfield        #77  <Field Object _suppressableValue>
	//   48   93:return          
	}

	protected MapSerializer(MapSerializer mapserializer, TypeSerializer typeserializer)
	{
		this(mapserializer, typeserializer, mapserializer._suppressableValue);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:getfield        #77  <Field Object _suppressableValue>
	//    5    7:invokespecial   #84  <Method void MapSerializer(MapSerializer, TypeSerializer, Object)>
	//    6   10:return          
	}

	protected MapSerializer(MapSerializer mapserializer, TypeSerializer typeserializer, Object obj)
	{
		super(java/util/Map, false);
	//    0    0:aload_0         
	//    1    1:ldc1            #50  <Class Map>
	//    2    3:iconst_0        
	//    3    4:invokespecial   #53  <Method void ContainerSerializer(Class, boolean)>
		_ignoredEntries = mapserializer._ignoredEntries;
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:getfield        #55  <Field HashSet _ignoredEntries>
	//    7   12:putfield        #55  <Field HashSet _ignoredEntries>
		_keyType = mapserializer._keyType;
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:getfield        #57  <Field JavaType _keyType>
	//   11   20:putfield        #57  <Field JavaType _keyType>
		_valueType = mapserializer._valueType;
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:getfield        #59  <Field JavaType _valueType>
	//   15   28:putfield        #59  <Field JavaType _valueType>
		_valueTypeIsStatic = mapserializer._valueTypeIsStatic;
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:getfield        #61  <Field boolean _valueTypeIsStatic>
	//   19   36:putfield        #61  <Field boolean _valueTypeIsStatic>
		_valueTypeSerializer = typeserializer;
	//   20   39:aload_0         
	//   21   40:aload_2         
	//   22   41:putfield        #63  <Field TypeSerializer _valueTypeSerializer>
		_keySerializer = mapserializer._keySerializer;
	//   23   44:aload_0         
	//   24   45:aload_1         
	//   25   46:getfield        #65  <Field JsonSerializer _keySerializer>
	//   26   49:putfield        #65  <Field JsonSerializer _keySerializer>
		_valueSerializer = mapserializer._valueSerializer;
	//   27   52:aload_0         
	//   28   53:aload_1         
	//   29   54:getfield        #67  <Field JsonSerializer _valueSerializer>
	//   30   57:putfield        #67  <Field JsonSerializer _valueSerializer>
		_dynamicValueSerializers = mapserializer._dynamicValueSerializers;
	//   31   60:aload_0         
	//   32   61:aload_1         
	//   33   62:getfield        #69  <Field PropertySerializerMap _dynamicValueSerializers>
	//   34   65:putfield        #69  <Field PropertySerializerMap _dynamicValueSerializers>
		_property = mapserializer._property;
	//   35   68:aload_0         
	//   36   69:aload_1         
	//   37   70:getfield        #71  <Field BeanProperty _property>
	//   38   73:putfield        #71  <Field BeanProperty _property>
		_filterId = mapserializer._filterId;
	//   39   76:aload_0         
	//   40   77:aload_1         
	//   41   78:getfield        #73  <Field Object _filterId>
	//   42   81:putfield        #73  <Field Object _filterId>
		_sortKeys = mapserializer._sortKeys;
	//   43   84:aload_0         
	//   44   85:aload_1         
	//   45   86:getfield        #75  <Field boolean _sortKeys>
	//   46   89:putfield        #75  <Field boolean _sortKeys>
		mapserializer = ((MapSerializer) (obj));
	//   47   92:aload_3         
	//   48   93:astore_1        
		if(obj == com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	//*  49   94:aload_3         
	//*  50   95:getstatic       #91  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_ABSENT>
	//*  51   98:if_acmpne       115
			if(_valueType.isReferenceType())
	//*  52  101:aload_0         
	//*  53  102:getfield        #59  <Field JavaType _valueType>
	//*  54  105:invokevirtual   #97  <Method boolean JavaType.isReferenceType()>
	//*  55  108:ifeq            121
				mapserializer = ((MapSerializer) (com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY));
	//   56  111:getstatic       #100 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_EMPTY>
	//   57  114:astore_1        
			else
	//*  58  115:aload_0         
	//*  59  116:aload_1         
	//*  60  117:putfield        #77  <Field Object _suppressableValue>
	//*  61  120:return          
				mapserializer = ((MapSerializer) (com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL));
	//   62  121:getstatic       #103 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_NULL>
	//   63  124:astore_1        
		_suppressableValue = ((Object) (mapserializer));
	//*  64  125:goto            115
	}

	protected MapSerializer(MapSerializer mapserializer, Object obj, boolean flag)
	{
		super(java/util/Map, false);
	//    0    0:aload_0         
	//    1    1:ldc1            #50  <Class Map>
	//    2    3:iconst_0        
	//    3    4:invokespecial   #53  <Method void ContainerSerializer(Class, boolean)>
		_ignoredEntries = mapserializer._ignoredEntries;
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:getfield        #55  <Field HashSet _ignoredEntries>
	//    7   12:putfield        #55  <Field HashSet _ignoredEntries>
		_keyType = mapserializer._keyType;
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:getfield        #57  <Field JavaType _keyType>
	//   11   20:putfield        #57  <Field JavaType _keyType>
		_valueType = mapserializer._valueType;
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:getfield        #59  <Field JavaType _valueType>
	//   15   28:putfield        #59  <Field JavaType _valueType>
		_valueTypeIsStatic = mapserializer._valueTypeIsStatic;
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:getfield        #61  <Field boolean _valueTypeIsStatic>
	//   19   36:putfield        #61  <Field boolean _valueTypeIsStatic>
		_valueTypeSerializer = mapserializer._valueTypeSerializer;
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:getfield        #63  <Field TypeSerializer _valueTypeSerializer>
	//   23   44:putfield        #63  <Field TypeSerializer _valueTypeSerializer>
		_keySerializer = mapserializer._keySerializer;
	//   24   47:aload_0         
	//   25   48:aload_1         
	//   26   49:getfield        #65  <Field JsonSerializer _keySerializer>
	//   27   52:putfield        #65  <Field JsonSerializer _keySerializer>
		_valueSerializer = mapserializer._valueSerializer;
	//   28   55:aload_0         
	//   29   56:aload_1         
	//   30   57:getfield        #67  <Field JsonSerializer _valueSerializer>
	//   31   60:putfield        #67  <Field JsonSerializer _valueSerializer>
		_dynamicValueSerializers = mapserializer._dynamicValueSerializers;
	//   32   63:aload_0         
	//   33   64:aload_1         
	//   34   65:getfield        #69  <Field PropertySerializerMap _dynamicValueSerializers>
	//   35   68:putfield        #69  <Field PropertySerializerMap _dynamicValueSerializers>
		_property = mapserializer._property;
	//   36   71:aload_0         
	//   37   72:aload_1         
	//   38   73:getfield        #71  <Field BeanProperty _property>
	//   39   76:putfield        #71  <Field BeanProperty _property>
		_filterId = obj;
	//   40   79:aload_0         
	//   41   80:aload_2         
	//   42   81:putfield        #73  <Field Object _filterId>
		_sortKeys = flag;
	//   43   84:aload_0         
	//   44   85:iload_3         
	//   45   86:putfield        #75  <Field boolean _sortKeys>
		_suppressableValue = mapserializer._suppressableValue;
	//   46   89:aload_0         
	//   47   90:aload_1         
	//   48   91:getfield        #77  <Field Object _suppressableValue>
	//   49   94:putfield        #77  <Field Object _suppressableValue>
	//   50   97:return          
	}

	protected MapSerializer(HashSet hashset, JavaType javatype, JavaType javatype1, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer, JsonSerializer jsonserializer1)
	{
		super(java/util/Map, false);
	//    0    0:aload_0         
	//    1    1:ldc1            #50  <Class Map>
	//    2    3:iconst_0        
	//    3    4:invokespecial   #53  <Method void ContainerSerializer(Class, boolean)>
		_ignoredEntries = hashset;
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:putfield        #55  <Field HashSet _ignoredEntries>
		_keyType = javatype;
	//    7   12:aload_0         
	//    8   13:aload_2         
	//    9   14:putfield        #57  <Field JavaType _keyType>
		_valueType = javatype1;
	//   10   17:aload_0         
	//   11   18:aload_3         
	//   12   19:putfield        #59  <Field JavaType _valueType>
		_valueTypeIsStatic = flag;
	//   13   22:aload_0         
	//   14   23:iload           4
	//   15   25:putfield        #61  <Field boolean _valueTypeIsStatic>
		_valueTypeSerializer = typeserializer;
	//   16   28:aload_0         
	//   17   29:aload           5
	//   18   31:putfield        #63  <Field TypeSerializer _valueTypeSerializer>
		_keySerializer = jsonserializer;
	//   19   34:aload_0         
	//   20   35:aload           6
	//   21   37:putfield        #65  <Field JsonSerializer _keySerializer>
		_valueSerializer = jsonserializer1;
	//   22   40:aload_0         
	//   23   41:aload           7
	//   24   43:putfield        #67  <Field JsonSerializer _valueSerializer>
		_dynamicValueSerializers = PropertySerializerMap.emptyForProperties();
	//   25   46:aload_0         
	//   26   47:invokestatic    #111 <Method PropertySerializerMap PropertySerializerMap.emptyForProperties()>
	//   27   50:putfield        #69  <Field PropertySerializerMap _dynamicValueSerializers>
		_property = null;
	//   28   53:aload_0         
	//   29   54:aconst_null     
	//   30   55:putfield        #71  <Field BeanProperty _property>
		_filterId = null;
	//   31   58:aload_0         
	//   32   59:aconst_null     
	//   33   60:putfield        #73  <Field Object _filterId>
		_sortKeys = false;
	//   34   63:aload_0         
	//   35   64:iconst_0        
	//   36   65:putfield        #75  <Field boolean _sortKeys>
		_suppressableValue = null;
	//   37   68:aload_0         
	//   38   69:aconst_null     
	//   39   70:putfield        #77  <Field Object _suppressableValue>
	//   40   73:return          
	}

	public static MapSerializer construct(String as[], JavaType javatype, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer, JsonSerializer jsonserializer1, Object obj)
	{
		JavaType javatype1;
		if(as == null || as.length == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          9
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifne            76
			as = null;
	//    5    9:aconst_null     
	//    6   10:astore_0        
		else
	//*   7   11:aload_1         
	//*   8   12:ifnonnull       84
	//*   9   15:getstatic       #45  <Field JavaType UNSPECIFIED_TYPE>
	//*  10   18:astore          7
	//*  11   20:aload           7
	//*  12   22:astore_1        
	//*  13   23:iload_2         
	//*  14   24:ifne            111
	//*  15   27:aload           7
	//*  16   29:ifnull          106
	//*  17   32:aload           7
	//*  18   34:invokevirtual   #117 <Method boolean JavaType.isFinal()>
	//*  19   37:ifeq            106
	//*  20   40:iconst_1        
	//*  21   41:istore_2        
	//*  22   42:new             #2   <Class MapSerializer>
	//*  23   45:dup             
	//*  24   46:aload_0         
	//*  25   47:aload_1         
	//*  26   48:aload           7
	//*  27   50:iload_2         
	//*  28   51:aload_3         
	//*  29   52:aload           4
	//*  30   54:aload           5
	//*  31   56:invokespecial   #119 <Method void MapSerializer(HashSet, JavaType, JavaType, boolean, TypeSerializer, JsonSerializer, JsonSerializer)>
	//*  32   59:astore_1        
	//*  33   60:aload_1         
	//*  34   61:astore_0        
	//*  35   62:aload           6
	//*  36   64:ifnull          74
	//*  37   67:aload_1         
	//*  38   68:aload           6
	//*  39   70:invokevirtual   #123 <Method MapSerializer withFilterId(Object)>
	//*  40   73:astore_0        
	//*  41   74:aload_0         
	//*  42   75:areturn         
			as = ((String []) (ArrayBuilders.arrayToSet(((Object []) (as)))));
	//   43   76:aload_0         
	//   44   77:invokestatic    #129 <Method HashSet ArrayBuilders.arrayToSet(Object[])>
	//   45   80:astore_0        
		if(javatype == null)
		{
			javatype1 = UNSPECIFIED_TYPE;
			javatype = javatype1;
		} else
	//*  46   81:goto            11
		{
			javatype1 = javatype.getKeyType();
	//   47   84:aload_1         
	//   48   85:invokevirtual   #132 <Method JavaType JavaType.getKeyType()>
	//   49   88:astore          7
			JavaType javatype2 = javatype.getContentType();
	//   50   90:aload_1         
	//   51   91:invokevirtual   #135 <Method JavaType JavaType.getContentType()>
	//   52   94:astore          8
			javatype = javatype1;
	//   53   96:aload           7
	//   54   98:astore_1        
			javatype1 = javatype2;
	//   55   99:aload           8
	//   56  101:astore          7
		}
		if(flag) goto _L2; else goto _L1
_L1:
		if(javatype1 != null && javatype1.isFinal())
			flag = true;
		else
	//*  57  103:goto            23
			flag = false;
	//   58  106:iconst_0        
	//   59  107:istore_2        
_L4:
		javatype = ((JavaType) (new MapSerializer(((HashSet) (as)), javatype, javatype1, flag, typeserializer, jsonserializer, jsonserializer1)));
		as = ((String []) (javatype));
		if(obj != null)
			as = ((String []) (((MapSerializer) (javatype)).withFilterId(obj)));
		return ((MapSerializer) (as));
	//*  60  108:goto            42
_L2:
		if(javatype1.getRawClass() == java/lang/Object)
	//*  61  111:aload           7
	//*  62  113:invokevirtual   #139 <Method Class JavaType.getRawClass()>
	//*  63  116:ldc1            #141 <Class Object>
	//*  64  118:if_acmpne       42
			flag = false;
	//   65  121:iconst_0        
	//   66  122:istore_2        
		if(true) goto _L4; else goto _L3
	//   67  123:goto            42
_L3:
	}

	protected void _ensureOverride()
	{
		if(((Object)this).getClass() != com/fasterxml/jackson/databind/ser/std/MapSerializer)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #146 <Method Class Object.getClass()>
	//*   2    4:ldc1            #2   <Class MapSerializer>
	//*   3    6:if_acmpeq       42
			throw new IllegalStateException((new StringBuilder()).append("Missing override in class ").append(((Object)this).getClass().getName()).toString());
	//    4    9:new             #148 <Class IllegalStateException>
	//    5   12:dup             
	//    6   13:new             #150 <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #152 <Method void StringBuilder()>
	//    9   20:ldc1            #154 <String "Missing override in class ">
	//   10   22:invokevirtual   #158 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #146 <Method Class Object.getClass()>
	//   13   29:invokevirtual   #164 <Method String Class.getName()>
	//   14   32:invokevirtual   #158 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:invokevirtual   #167 <Method String StringBuilder.toString()>
	//   16   38:invokespecial   #170 <Method void IllegalStateException(String)>
	//   17   41:athrow          
		else
			return;
	//   18   42:return          
	}

	protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, JavaType javatype, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		javatype = ((JavaType) (propertyserializermap.findAndAddSecondarySerializer(javatype, serializerprovider, _property)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload_0         
	//    4    4:getfield        #71  <Field BeanProperty _property>
	//    5    7:invokevirtual   #178 <Method com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.findAndAddSecondarySerializer(JavaType, SerializerProvider, BeanProperty)>
	//    6   10:astore_2        
		if(propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map)
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:getfield        #183 <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//*  10   16:if_acmpeq       27
			_dynamicValueSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:getfield        #183 <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//   14   24:putfield        #69  <Field PropertySerializerMap _dynamicValueSerializers>
		return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).serializer;
	//   15   27:aload_2         
	//   16   28:getfield        #186 <Field JsonSerializer com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.serializer>
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
	//    4    4:getfield        #71  <Field BeanProperty _property>
	//    5    7:invokevirtual   #192 <Method com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.findAndAddSecondarySerializer(Class, SerializerProvider, BeanProperty)>
	//    6   10:astore_2        
		if(propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map)
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:getfield        #183 <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//*  10   16:if_acmpeq       27
			_dynamicValueSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:getfield        #183 <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//   14   24:putfield        #69  <Field PropertySerializerMap _dynamicValueSerializers>
		return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).serializer;
	//   15   27:aload_2         
	//   16   28:getfield        #186 <Field JsonSerializer com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.serializer>
	//   17   31:areturn         
	}

	protected Map _orderEntries(Map map)
	{
		if(map instanceof SortedMap)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #197 <Class SortedMap>
	//*   2    4:ifeq            9
			return map;
	//    3    7:aload_1         
	//    4    8:areturn         
		else
			return ((Map) (new TreeMap(map)));
	//    5    9:new             #199 <Class TreeMap>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #202 <Method void TreeMap(Map)>
	//    9   17:areturn         
	}

	public volatile ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
	{
		return ((ContainerSerializer) (_withValueTypeSerializer(typeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #208 <Method MapSerializer _withValueTypeSerializer(TypeSerializer)>
	//    3    5:areturn         
	}

	public MapSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
	{
		if(_valueTypeSerializer == typeserializer)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field TypeSerializer _valueTypeSerializer>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
		{
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		} else
		{
			_ensureOverride();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #210 <Method void _ensureOverride()>
			return new MapSerializer(this, typeserializer, ((Object) (null)));
	//    8   14:new             #2   <Class MapSerializer>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aconst_null     
	//   13   21:invokespecial   #84  <Method void MapSerializer(MapSerializer, TypeSerializer, Object)>
	//   14   24:areturn         
		}
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		if(jsonformatvisitorwrapper == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       69
			javatype = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:aload_2         
	//*   5    7:ifnull          68
	//*   6   10:aload_2         
	//*   7   11:aload_0         
	//*   8   12:getfield        #65  <Field JsonSerializer _keySerializer>
	//*   9   15:aload_0         
	//*  10   16:getfield        #57  <Field JavaType _keyType>
	//*  11   19:invokeinterface #218 <Method void JsonMapFormatVisitor.keyFormat(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable, JavaType)>
	//*  12   24:aload_0         
	//*  13   25:getfield        #67  <Field JsonSerializer _valueSerializer>
	//*  14   28:astore          4
	//*  15   30:aload           4
	//*  16   32:astore_3        
	//*  17   33:aload           4
	//*  18   35:ifnonnull       57
	//*  19   38:aload_0         
	//*  20   39:aload_0         
	//*  21   40:getfield        #69  <Field PropertySerializerMap _dynamicValueSerializers>
	//*  22   43:aload_0         
	//*  23   44:getfield        #59  <Field JavaType _valueType>
	//*  24   47:aload_1         
	//*  25   48:invokeinterface #224 <Method SerializerProvider JsonFormatVisitorWrapper.getProvider()>
	//*  26   53:invokevirtual   #226 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, JavaType, SerializerProvider)>
	//*  27   56:astore_3        
	//*  28   57:aload_2         
	//*  29   58:aload_3         
	//*  30   59:aload_0         
	//*  31   60:getfield        #59  <Field JavaType _valueType>
	//*  32   63:invokeinterface #229 <Method void JsonMapFormatVisitor.valueFormat(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable, JavaType)>
	//*  33   68:return          
			javatype = ((JavaType) (jsonformatvisitorwrapper.expectMapFormat(javatype)));
	//   34   69:aload_1         
	//   35   70:aload_2         
	//   36   71:invokeinterface #233 <Method JsonMapFormatVisitor JsonFormatVisitorWrapper.expectMapFormat(JavaType)>
	//   37   76:astore_2        
		if(javatype != null)
		{
			((JsonMapFormatVisitor) (javatype)).keyFormat(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable) (_keySerializer)), _keyType);
			JsonSerializer jsonserializer1 = _valueSerializer;
			JsonSerializer jsonserializer = jsonserializer1;
			if(jsonserializer1 == null)
				jsonserializer = _findAndAddDynamic(_dynamicValueSerializers, _valueType, jsonformatvisitorwrapper.getProvider());
			((JsonMapFormatVisitor) (javatype)).valueFormat(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable) (jsonserializer)), _valueType);
		}
	//*  38   77:goto            6
	}

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj5 = null;
	//    0    0:aconst_null     
	//    1    1:astore          12
		Object obj6 = null;
	//    2    3:aconst_null     
	//    3    4:astore          13
		Object obj2 = null;
	//    4    6:aconst_null     
	//    5    7:astore          9
		AnnotationIntrospector annotationintrospector = serializerprovider.getAnnotationIntrospector();
	//    6    9:aload_1         
	//    7   10:invokevirtual   #241 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//    8   13:astore          14
		boolean flag;
		boolean flag1;
		Object obj;
		Object obj1;
		Object obj3;
		Object obj4;
		if(beanproperty == null)
	//*   9   15:aload_2         
	//*  10   16:ifnonnull       359
			obj3 = null;
	//   11   19:aconst_null     
	//   12   20:astore          10
		else
	//*  13   22:aload_0         
	//*  14   23:getfield        #77  <Field Object _suppressableValue>
	//*  15   26:astore          11
	//*  16   28:aload           13
	//*  17   30:astore          7
	//*  18   32:aload           12
	//*  19   34:astore          8
	//*  20   36:aload           10
	//*  21   38:ifnull          114
	//*  22   41:aload           13
	//*  23   43:astore          7
	//*  24   45:aload           12
	//*  25   47:astore          8
	//*  26   49:aload           14
	//*  27   51:ifnull          114
	//*  28   54:aload           14
	//*  29   56:aload           10
	//*  30   58:invokevirtual   #247 <Method Object AnnotationIntrospector.findKeySerializer(com.fasterxml.jackson.databind.introspect.Annotated)>
	//*  31   61:astore          7
	//*  32   63:aload           7
	//*  33   65:ifnull          78
	//*  34   68:aload_1         
	//*  35   69:aload           10
	//*  36   71:aload           7
	//*  37   73:invokevirtual   #251 <Method JsonSerializer SerializerProvider.serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, Object)>
	//*  38   76:astore          9
	//*  39   78:aload           14
	//*  40   80:aload           10
	//*  41   82:invokevirtual   #254 <Method Object AnnotationIntrospector.findContentSerializer(com.fasterxml.jackson.databind.introspect.Annotated)>
	//*  42   85:astore          13
	//*  43   87:aload           9
	//*  44   89:astore          7
	//*  45   91:aload           12
	//*  46   93:astore          8
	//*  47   95:aload           13
	//*  48   97:ifnull          114
	//*  49  100:aload_1         
	//*  50  101:aload           10
	//*  51  103:aload           13
	//*  52  105:invokevirtual   #251 <Method JsonSerializer SerializerProvider.serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, Object)>
	//*  53  108:astore          8
	//*  54  110:aload           9
	//*  55  112:astore          7
	//*  56  114:aload           11
	//*  57  116:astore          9
	//*  58  118:aload_2         
	//*  59  119:ifnull          164
	//*  60  122:aload_2         
	//*  61  123:aload_1         
	//*  62  124:invokevirtual   #258 <Method com.fasterxml.jackson.databind.SerializationConfig SerializerProvider.getConfig()>
	//*  63  127:ldc1            #50  <Class Map>
	//*  64  129:invokeinterface #264 <Method com.fasterxml.jackson.annotation.JsonInclude$Value BeanProperty.findPropertyInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig, Class)>
	//*  65  134:invokevirtual   #270 <Method com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Value.getContentInclusion()>
	//*  66  137:astore          12
	//*  67  139:aload           11
	//*  68  141:astore          9
	//*  69  143:aload           12
	//*  70  145:ifnull          164
	//*  71  148:aload           11
	//*  72  150:astore          9
	//*  73  152:aload           12
	//*  74  154:getstatic       #273 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//*  75  157:if_acmpeq       164
	//*  76  160:aload           12
	//*  77  162:astore          9
	//*  78  164:aload           8
	//*  79  166:astore          11
	//*  80  168:aload           8
	//*  81  170:ifnonnull       179
	//*  82  173:aload_0         
	//*  83  174:getfield        #67  <Field JsonSerializer _valueSerializer>
	//*  84  177:astore          11
	//*  85  179:aload_0         
	//*  86  180:aload_1         
	//*  87  181:aload_2         
	//*  88  182:aload           11
	//*  89  184:invokevirtual   #277 <Method JsonSerializer findConvertingContentSerializer(SerializerProvider, BeanProperty, JsonSerializer)>
	//*  90  187:astore          11
	//*  91  189:aload           11
	//*  92  191:ifnonnull       370
	//*  93  194:aload           11
	//*  94  196:astore          8
	//*  95  198:aload_0         
	//*  96  199:getfield        #61  <Field boolean _valueTypeIsStatic>
	//*  97  202:ifeq            230
	//*  98  205:aload           11
	//*  99  207:astore          8
	//* 100  209:aload_0         
	//* 101  210:getfield        #59  <Field JavaType _valueType>
	//* 102  213:invokevirtual   #280 <Method boolean JavaType.isJavaLangObject()>
	//* 103  216:ifne            230
	//* 104  219:aload_1         
	//* 105  220:aload_0         
	//* 106  221:getfield        #59  <Field JavaType _valueType>
	//* 107  224:aload_2         
	//* 108  225:invokevirtual   #284 <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, BeanProperty)>
	//* 109  228:astore          8
	//* 110  230:aload           7
	//* 111  232:astore          11
	//* 112  234:aload           7
	//* 113  236:ifnonnull       245
	//* 114  239:aload_0         
	//* 115  240:getfield        #65  <Field JsonSerializer _keySerializer>
	//* 116  243:astore          11
	//* 117  245:aload           11
	//* 118  247:ifnonnull       382
	//* 119  250:aload_1         
	//* 120  251:aload_0         
	//* 121  252:getfield        #57  <Field JavaType _keyType>
	//* 122  255:aload_2         
	//* 123  256:invokevirtual   #286 <Method JsonSerializer SerializerProvider.findKeySerializer(JavaType, BeanProperty)>
	//* 124  259:astore          11
	//* 125  261:aload_0         
	//* 126  262:getfield        #55  <Field HashSet _ignoredEntries>
	//* 127  265:astore          7
	//* 128  267:iconst_0        
	//* 129  268:istore          6
	//* 130  270:aload           7
	//* 131  272:astore_1        
	//* 132  273:iload           6
	//* 133  275:istore          5
	//* 134  277:aload           14
	//* 135  279:ifnull          433
	//* 136  282:aload           7
	//* 137  284:astore_1        
	//* 138  285:iload           6
	//* 139  287:istore          5
	//* 140  289:aload           10
	//* 141  291:ifnull          433
	//* 142  294:aload           14
	//* 143  296:aload           10
	//* 144  298:iconst_1        
	//* 145  299:invokevirtual   #290 <Method String[] AnnotationIntrospector.findPropertiesToIgnore(com.fasterxml.jackson.databind.introspect.Annotated, boolean)>
	//* 146  302:astore          12
	//* 147  304:aload           7
	//* 148  306:astore_1        
	//* 149  307:aload           12
	//* 150  309:ifnull          408
	//* 151  312:aload           7
	//* 152  314:ifnonnull       394
	//* 153  317:new             #292 <Class HashSet>
	//* 154  320:dup             
	//* 155  321:invokespecial   #293 <Method void HashSet()>
	//* 156  324:astore          7
	//* 157  326:aload           12
	//* 158  328:arraylength     
	//* 159  329:istore          4
	//* 160  331:iconst_0        
	//* 161  332:istore_3        
	//* 162  333:aload           7
	//* 163  335:astore_1        
	//* 164  336:iload_3         
	//* 165  337:iload           4
	//* 166  339:icmpge          408
	//* 167  342:aload           7
	//* 168  344:aload           12
	//* 169  346:iload_3         
	//* 170  347:aaload          
	//* 171  348:invokevirtual   #297 <Method boolean HashSet.add(Object)>
	//* 172  351:pop             
	//* 173  352:iload_3         
	//* 174  353:iconst_1        
	//* 175  354:iadd            
	//* 176  355:istore_3        
	//* 177  356:goto            333
			obj3 = ((Object) (beanproperty.getMember()));
	//  178  359:aload_2         
	//  179  360:invokeinterface #301 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//  180  365:astore          10
		obj4 = _suppressableValue;
		obj = ((Object) (obj6));
		obj1 = ((Object) (obj5));
		if(obj3 != null)
		{
			obj = ((Object) (obj6));
			obj1 = ((Object) (obj5));
			if(annotationintrospector != null)
			{
				obj = annotationintrospector.findKeySerializer(((com.fasterxml.jackson.databind.introspect.Annotated) (obj3)));
				if(obj != null)
					obj2 = ((Object) (serializerprovider.serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj3)), obj)));
				Object obj7 = annotationintrospector.findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated) (obj3)));
				obj = obj2;
				obj1 = ((Object) (obj5));
				if(obj7 != null)
				{
					obj1 = ((Object) (serializerprovider.serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj3)), obj7)));
					obj = obj2;
				}
			}
		}
		obj2 = obj4;
		if(beanproperty != null)
		{
			com.fasterxml.jackson.annotation.JsonInclude.Include include = beanproperty.findPropertyInclusion(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializerprovider.getConfig())), java/util/Map).getContentInclusion();
			obj2 = obj4;
			if(include != null)
			{
				obj2 = obj4;
				if(include != com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS)
					obj2 = ((Object) (include));
			}
		}
		obj4 = obj1;
		if(obj1 == null)
			obj4 = ((Object) (_valueSerializer));
		obj4 = ((Object) (findConvertingContentSerializer(serializerprovider, beanproperty, ((JsonSerializer) (obj4)))));
		if(obj4 == null)
		{
			obj1 = obj4;
			if(_valueTypeIsStatic)
			{
				obj1 = obj4;
				if(!_valueType.isJavaLangObject())
					obj1 = ((Object) (serializerprovider.findValueSerializer(_valueType, beanproperty)));
			}
		} else
	//* 181  367:goto            22
		{
			obj1 = ((Object) (serializerprovider.handleSecondaryContextualization(((JsonSerializer) (obj4)), beanproperty)));
	//  182  370:aload_1         
	//  183  371:aload           11
	//  184  373:aload_2         
	//  185  374:invokevirtual   #305 <Method JsonSerializer SerializerProvider.handleSecondaryContextualization(JsonSerializer, BeanProperty)>
	//  186  377:astore          8
		}
		obj4 = obj;
		if(obj == null)
			obj4 = ((Object) (_keySerializer));
		if(obj4 == null)
			obj4 = ((Object) (serializerprovider.findKeySerializer(_keyType, beanproperty)));
		else
	//* 187  379:goto            230
			obj4 = ((Object) (serializerprovider.handleSecondaryContextualization(((JsonSerializer) (obj4)), beanproperty)));
	//  188  382:aload_1         
	//  189  383:aload           11
	//  190  385:aload_2         
	//  191  386:invokevirtual   #305 <Method JsonSerializer SerializerProvider.handleSecondaryContextualization(JsonSerializer, BeanProperty)>
	//  192  389:astore          11
		obj = ((Object) (_ignoredEntries));
		flag1 = false;
		serializerprovider = ((SerializerProvider) (obj));
		flag = flag1;
		if(annotationintrospector != null)
		{
			serializerprovider = ((SerializerProvider) (obj));
			flag = flag1;
			if(obj3 != null)
			{
				String as[] = annotationintrospector.findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated) (obj3)), true);
				serializerprovider = ((SerializerProvider) (obj));
				if(as != null)
				{
					int i;
					int j;
					if(obj == null)
						obj = ((Object) (new HashSet()));
					else
	//* 193  391:goto            261
						obj = ((Object) (new HashSet(((Collection) (obj)))));
	//  194  394:new             #292 <Class HashSet>
	//  195  397:dup             
	//  196  398:aload           7
	//  197  400:invokespecial   #308 <Method void HashSet(Collection)>
	//  198  403:astore          7
					j = as.length;
					i = 0;
					do
					{
						serializerprovider = ((SerializerProvider) (obj));
						if(i >= j)
							break;
						((HashSet) (obj)).add(((Object) (as[i])));
						i++;
					} while(true);
				}
	//* 199  405:goto            326
				obj = ((Object) (annotationintrospector.findSerializationSortAlphabetically(((com.fasterxml.jackson.databind.introspect.Annotated) (obj3)))));
	//  200  408:aload           14
	//  201  410:aload           10
	//  202  412:invokevirtual   #312 <Method Boolean AnnotationIntrospector.findSerializationSortAlphabetically(com.fasterxml.jackson.databind.introspect.Annotated)>
	//  203  415:astore          7
				if(obj != null && ((Boolean) (obj)).booleanValue())
	//* 204  417:aload           7
	//* 205  419:ifnull          512
	//* 206  422:aload           7
	//* 207  424:invokevirtual   #317 <Method boolean Boolean.booleanValue()>
	//* 208  427:ifeq            512
					flag = true;
	//  209  430:iconst_1        
	//  210  431:istore          5
				else
	//* 211  433:aload_0         
	//* 212  434:aload_2         
	//* 213  435:aload           11
	//* 214  437:aload           8
	//* 215  439:aload_1         
	//* 216  440:iload           5
	//* 217  442:invokevirtual   #321 <Method MapSerializer withResolved(BeanProperty, JsonSerializer, JsonSerializer, HashSet, boolean)>
	//* 218  445:astore          7
	//* 219  447:aload           7
	//* 220  449:astore_1        
	//* 221  450:aload           9
	//* 222  452:aload_0         
	//* 223  453:getfield        #77  <Field Object _suppressableValue>
	//* 224  456:if_acmpeq       467
	//* 225  459:aload           7
	//* 226  461:aload           9
	//* 227  463:invokevirtual   #324 <Method MapSerializer withContentInclusion(Object)>
	//* 228  466:astore_1        
	//* 229  467:aload_1         
	//* 230  468:astore          7
	//* 231  470:aload_2         
	//* 232  471:ifnull          509
	//* 233  474:aload_2         
	//* 234  475:invokeinterface #301 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//* 235  480:astore_2        
	//* 236  481:aload_1         
	//* 237  482:astore          7
	//* 238  484:aload_2         
	//* 239  485:ifnull          509
	//* 240  488:aload           14
	//* 241  490:aload_2         
	//* 242  491:invokevirtual   #327 <Method Object AnnotationIntrospector.findFilterId(com.fasterxml.jackson.databind.introspect.Annotated)>
	//* 243  494:astore_2        
	//* 244  495:aload_1         
	//* 245  496:astore          7
	//* 246  498:aload_2         
	//* 247  499:ifnull          509
	//* 248  502:aload_1         
	//* 249  503:aload_2         
	//* 250  504:invokevirtual   #123 <Method MapSerializer withFilterId(Object)>
	//* 251  507:astore          7
	//* 252  509:aload           7
	//* 253  511:areturn         
					flag = false;
	//  254  512:iconst_0        
	//  255  513:istore          5
			}
		}
		obj = ((Object) (withResolved(beanproperty, ((JsonSerializer) (obj4)), ((JsonSerializer) (obj1)), ((HashSet) (serializerprovider)), flag)));
		serializerprovider = ((SerializerProvider) (obj));
		if(obj2 != _suppressableValue)
			serializerprovider = ((SerializerProvider) (((MapSerializer) (obj)).withContentInclusion(obj2)));
		obj = ((Object) (serializerprovider));
		if(beanproperty != null)
		{
			beanproperty = ((BeanProperty) (beanproperty.getMember()));
			obj = ((Object) (serializerprovider));
			if(beanproperty != null)
			{
				beanproperty = ((BeanProperty) (annotationintrospector.findFilterId(((com.fasterxml.jackson.databind.introspect.Annotated) (beanproperty)))));
				obj = ((Object) (serializerprovider));
				if(beanproperty != null)
					obj = ((Object) (((MapSerializer) (serializerprovider)).withFilterId(((Object) (beanproperty)))));
			}
		}
		return ((JsonSerializer) (obj));
	//* 256  515:goto            433
	}

	public JsonSerializer getContentSerializer()
	{
		return _valueSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field JsonSerializer _valueSerializer>
	//    2    4:areturn         
	}

	public JavaType getContentType()
	{
		return _valueType;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field JavaType _valueType>
	//    2    4:areturn         
	}

	public JsonSerializer getKeySerializer()
	{
		return _keySerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field JsonSerializer _keySerializer>
	//    2    4:areturn         
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		return ((JsonNode) (createSchemaNode("object", true)));
	//    0    0:aload_0         
	//    1    1:ldc2            #336 <String "object">
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #340 <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
	//    4    8:areturn         
	}

	public volatile boolean hasSingleElement(Object obj)
	{
		return hasSingleElement((Map)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #50  <Class Map>
	//    3    5:invokevirtual   #344 <Method boolean hasSingleElement(Map)>
	//    4    8:ireturn         
	}

	public boolean hasSingleElement(Map map)
	{
		return map.size() == 1;
	//    0    0:aload_1         
	//    1    1:invokeinterface #348 <Method int Map.size()>
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
	//    3    3:checkcast       #50  <Class Map>
	//    4    6:invokevirtual   #354 <Method boolean isEmpty(SerializerProvider, Map)>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, Map map)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		boolean flag;
		if(map == null || map.isEmpty())
	//*   2    3:aload_2         
	//*   3    4:ifnull          16
	//*   4    7:aload_2         
	//*   5    8:invokeinterface #356 <Method boolean Map.isEmpty()>
	//*   6   13:ifeq            20
		{
			flag = true;
	//    7   16:iconst_1        
	//    8   17:istore_3        
		} else
	//*   9   18:iload_3         
	//*  10   19:ireturn         
		{
			Object obj = _suppressableValue;
	//   11   20:aload_0         
	//   12   21:getfield        #77  <Field Object _suppressableValue>
	//   13   24:astore          5
			flag = flag1;
	//   14   26:iload           4
	//   15   28:istore_3        
			if(obj != null)
	//*  16   29:aload           5
	//*  17   31:ifnull          18
			{
				flag = flag1;
	//   18   34:iload           4
	//   19   36:istore_3        
				if(obj != com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	//*  20   37:aload           5
	//*  21   39:getstatic       #359 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.ALWAYS>
	//*  22   42:if_acmpeq       18
				{
					Object obj1 = ((Object) (_valueSerializer));
	//   23   45:aload_0         
	//   24   46:getfield        #67  <Field JsonSerializer _valueSerializer>
	//   25   49:astore          5
					if(obj1 != null)
	//*  26   51:aload           5
	//*  27   53:ifnull          105
					{
						for(map = ((Map) (map.values().iterator())); ((Iterator) (map)).hasNext();)
	//*  28   56:aload_2         
	//*  29   57:invokeinterface #363 <Method Collection Map.values()>
	//*  30   62:invokeinterface #369 <Method Iterator Collection.iterator()>
	//*  31   67:astore_2        
	//*  32   68:aload_2         
	//*  33   69:invokeinterface #374 <Method boolean Iterator.hasNext()>
	//*  34   74:ifeq            103
						{
							Object obj2 = ((Iterator) (map)).next();
	//   35   77:aload_2         
	//   36   78:invokeinterface #378 <Method Object Iterator.next()>
	//   37   83:astore          6
							if(obj2 != null && !((JsonSerializer) (obj1)).isEmpty(serializerprovider, obj2))
	//*  38   85:aload           6
	//*  39   87:ifnull          68
	//*  40   90:aload           5
	//*  41   92:aload_1         
	//*  42   93:aload           6
	//*  43   95:invokevirtual   #382 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//*  44   98:ifne            68
								return false;
	//   45  101:iconst_0        
	//   46  102:ireturn         
						}

						return true;
	//   47  103:iconst_1        
	//   48  104:ireturn         
					}
					obj1 = ((Object) (_dynamicValueSerializers));
	//   49  105:aload_0         
	//   50  106:getfield        #69  <Field PropertySerializerMap _dynamicValueSerializers>
	//   51  109:astore          5
					for(Iterator iterator = map.values().iterator(); iterator.hasNext();)
	//*  52  111:aload_2         
	//*  53  112:invokeinterface #363 <Method Collection Map.values()>
	//*  54  117:invokeinterface #369 <Method Iterator Collection.iterator()>
	//*  55  122:astore          8
	//*  56  124:aload           8
	//*  57  126:invokeinterface #374 <Method boolean Iterator.hasNext()>
	//*  58  131:ifeq            211
					{
						Object obj3 = iterator.next();
	//   59  134:aload           8
	//   60  136:invokeinterface #378 <Method Object Iterator.next()>
	//   61  141:astore          9
						if(obj3 != null)
	//*  62  143:aload           9
	//*  63  145:ifnull          124
						{
							Class class1 = obj3.getClass();
	//   64  148:aload           9
	//   65  150:invokevirtual   #146 <Method Class Object.getClass()>
	//   66  153:astore          10
							JsonSerializer jsonserializer = ((PropertySerializerMap) (obj1)).serializerFor(class1);
	//   67  155:aload           5
	//   68  157:aload           10
	//   69  159:invokevirtual   #386 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//   70  162:astore          7
							PropertySerializerMap propertyserializermap = ((PropertySerializerMap) (obj1));
	//   71  164:aload           5
	//   72  166:astore          6
							map = ((Map) (jsonserializer));
	//   73  168:aload           7
	//   74  170:astore_2        
							if(jsonserializer == null)
	//*  75  171:aload           7
	//*  76  173:ifnonnull       192
							{
								try
								{
									map = ((Map) (_findAndAddDynamic(((PropertySerializerMap) (obj1)), class1, serializerprovider)));
	//   77  176:aload_0         
	//   78  177:aload           5
	//   79  179:aload           10
	//   80  181:aload_1         
	//   81  182:invokevirtual   #388 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//   82  185:astore_2        
								}
	//*  83  186:aload_0         
	//*  84  187:getfield        #69  <Field PropertySerializerMap _dynamicValueSerializers>
	//*  85  190:astore          6
	//*  86  192:aload           6
	//*  87  194:astore          5
	//*  88  196:aload_2         
	//*  89  197:aload_1         
	//*  90  198:aload           9
	//*  91  200:invokevirtual   #382 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//*  92  203:ifne            124
	//*  93  206:iconst_0        
	//*  94  207:ireturn         
								// Misplaced declaration of an exception variable
								catch(SerializerProvider serializerprovider)
	//*  95  208:astore_1        
								{
									return false;
	//   96  209:iconst_0        
	//   97  210:ireturn         
								}
								propertyserializermap = _dynamicValueSerializers;
							}
							obj1 = ((Object) (propertyserializermap));
							if(!((JsonSerializer) (map)).isEmpty(serializerprovider, obj3))
								return false;
						}
					}

					return true;
	//   98  211:iconst_1        
	//   99  212:ireturn         
				}
			}
		}
		return flag;
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((Map)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #50  <Class Map>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #396 <Method void serialize(Map, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.writeStartObject();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #401 <Method void JsonGenerator.writeStartObject()>
		jsongenerator.setCurrentValue(((Object) (map)));
	//    2    4:aload_2         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #405 <Method void JsonGenerator.setCurrentValue(Object)>
		if(map.isEmpty()) goto _L2; else goto _L1
	//    5    9:aload_1         
	//    6   10:invokeinterface #356 <Method boolean Map.isEmpty()>
	//    7   15:ifne            90
_L1:
		Object obj1 = _suppressableValue;
	//    8   18:aload_0         
	//    9   19:getfield        #77  <Field Object _suppressableValue>
	//   10   22:astore          5
		if(obj1 != com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS) goto _L4; else goto _L3
	//   11   24:aload           5
	//   12   26:getstatic       #359 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.ALWAYS>
	//   13   29:if_acmpne       95
_L3:
		Object obj = null;
	//   14   32:aconst_null     
	//   15   33:astore          4
_L6:
label0:
		{
			if(!_sortKeys)
	//*  16   35:aload_0         
	//*  17   36:getfield        #75  <Field boolean _sortKeys>
	//*  18   39:ifne            55
			{
				obj1 = ((Object) (map));
	//   19   42:aload_1         
	//   20   43:astore          5
				if(!serializerprovider.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS))
					break label0;
	//   21   45:aload_3         
	//   22   46:getstatic       #411 <Field SerializationFeature SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS>
	//   23   49:invokevirtual   #415 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//   24   52:ifeq            62
			}
			obj1 = ((Object) (_orderEntries(map)));
	//   25   55:aload_0         
	//   26   56:aload_1         
	//   27   57:invokevirtual   #417 <Method Map _orderEntries(Map)>
	//   28   60:astore          5
		}
		if(_filterId != null)
	//*  29   62:aload_0         
	//*  30   63:getfield        #73  <Field Object _filterId>
	//*  31   66:ifnull          126
			serializeFilteredFields(((Map) (obj1)), jsongenerator, serializerprovider, findPropertyFilter(serializerprovider, _filterId, obj1), obj);
	//   32   69:aload_0         
	//   33   70:aload           5
	//   34   72:aload_2         
	//   35   73:aload_3         
	//   36   74:aload_0         
	//   37   75:aload_3         
	//   38   76:aload_0         
	//   39   77:getfield        #73  <Field Object _filterId>
	//   40   80:aload           5
	//   41   82:invokevirtual   #421 <Method PropertyFilter findPropertyFilter(SerializerProvider, Object, Object)>
	//   42   85:aload           4
	//   43   87:invokevirtual   #425 <Method void serializeFilteredFields(Map, JsonGenerator, SerializerProvider, PropertyFilter, Object)>
		else
	//*  44   90:aload_2         
	//*  45   91:invokevirtual   #428 <Method void JsonGenerator.writeEndObject()>
	//*  46   94:return          
	//*  47   95:aload           5
	//*  48   97:astore          4
	//*  49   99:aload           5
	//*  50  101:ifnonnull       35
	//*  51  104:aload           5
	//*  52  106:astore          4
	//*  53  108:aload_3         
	//*  54  109:getstatic       #431 <Field SerializationFeature SerializationFeature.WRITE_NULL_MAP_VALUES>
	//*  55  112:invokevirtual   #415 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  56  115:ifne            35
	//*  57  118:getstatic       #103 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_NULL>
	//*  58  121:astore          4
	//*  59  123:goto            35
		if(obj != null)
	//*  60  126:aload           4
	//*  61  128:ifnull          144
			serializeOptionalFields(((Map) (obj1)), jsongenerator, serializerprovider, obj);
	//   62  131:aload_0         
	//   63  132:aload           5
	//   64  134:aload_2         
	//   65  135:aload_3         
	//   66  136:aload           4
	//   67  138:invokevirtual   #435 <Method void serializeOptionalFields(Map, JsonGenerator, SerializerProvider, Object)>
		else
	//*  68  141:goto            90
		if(_valueSerializer != null)
	//*  69  144:aload_0         
	//*  70  145:getfield        #67  <Field JsonSerializer _valueSerializer>
	//*  71  148:ifnull          166
			serializeFieldsUsing(((Map) (obj1)), jsongenerator, serializerprovider, _valueSerializer);
	//   72  151:aload_0         
	//   73  152:aload           5
	//   74  154:aload_2         
	//   75  155:aload_3         
	//   76  156:aload_0         
	//   77  157:getfield        #67  <Field JsonSerializer _valueSerializer>
	//   78  160:invokevirtual   #439 <Method void serializeFieldsUsing(Map, JsonGenerator, SerializerProvider, JsonSerializer)>
		else
	//*  79  163:goto            90
			serializeFields(((Map) (obj1)), jsongenerator, serializerprovider);
	//   80  166:aload_0         
	//   81  167:aload           5
	//   82  169:aload_2         
	//   83  170:aload_3         
	//   84  171:invokevirtual   #442 <Method void serializeFields(Map, JsonGenerator, SerializerProvider)>
_L2:
		jsongenerator.writeEndObject();
		return;
_L4:
		obj = obj1;
		if(obj1 == null)
		{
			obj = obj1;
			if(!serializerprovider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES))
				obj = ((Object) (com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL));
		}
		if(true) goto _L6; else goto _L5
_L5:
	//*  85  174:goto            90
	}

	public void serializeFields(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(_valueTypeSerializer == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field TypeSerializer _valueTypeSerializer>
	//    2    4:ifnull          16
_L1:
		serializeTypedFields(map, jsongenerator, serializerprovider, ((Object) (null)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aconst_null     
	//    8   12:invokevirtual   #448 <Method void serializeTypedFields(Map, JsonGenerator, SerializerProvider, Object)>
_L6:
		return;
	//    9   15:return          
_L2:
		PropertySerializerMap propertyserializermap1;
		JsonSerializer jsonserializer2;
		HashSet hashset;
		Iterator iterator;
		jsonserializer2 = _keySerializer;
	//   10   16:aload_0         
	//   11   17:getfield        #65  <Field JsonSerializer _keySerializer>
	//   12   20:astore          8
		hashset = _ignoredEntries;
	//   13   22:aload_0         
	//   14   23:getfield        #55  <Field HashSet _ignoredEntries>
	//   15   26:astore          9
		propertyserializermap1 = _dynamicValueSerializers;
	//   16   28:aload_0         
	//   17   29:getfield        #69  <Field PropertySerializerMap _dynamicValueSerializers>
	//   18   32:astore          6
		iterator = map.entrySet().iterator();
	//   19   34:aload_1         
	//   20   35:invokeinterface #452 <Method Set Map.entrySet()>
	//   21   40:invokeinterface #455 <Method Iterator Set.iterator()>
	//   22   45:astore          10
_L4:
		if(!iterator.hasNext())
			continue; /* Loop/switch isn't completed */
	//   23   47:aload           10
	//   24   49:invokeinterface #374 <Method boolean Iterator.hasNext()>
	//   25   54:ifeq            15
		Object obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   26   57:aload           10
	//   27   59:invokeinterface #378 <Method Object Iterator.next()>
	//   28   64:checkcast       #457 <Class java.util.Map$Entry>
	//   29   67:astore          4
		Object obj1 = ((java.util.Map.Entry) (obj)).getValue();
	//   30   69:aload           4
	//   31   71:invokeinterface #460 <Method Object java.util.Map$Entry.getValue()>
	//   32   76:astore          11
		Object obj2 = ((java.util.Map.Entry) (obj)).getKey();
	//   33   78:aload           4
	//   34   80:invokeinterface #463 <Method Object java.util.Map$Entry.getKey()>
	//   35   85:astore          12
		if(obj2 == null)
	//*  36   87:aload           12
	//*  37   89:ifnonnull       123
		{
			serializerprovider.findNullKeySerializer(_keyType, _property).serialize(((Object) (null)), jsongenerator, serializerprovider);
	//   38   92:aload_3         
	//   39   93:aload_0         
	//   40   94:getfield        #57  <Field JavaType _keyType>
	//   41   97:aload_0         
	//   42   98:getfield        #71  <Field BeanProperty _property>
	//   43  101:invokevirtual   #466 <Method JsonSerializer SerializerProvider.findNullKeySerializer(JavaType, BeanProperty)>
	//   44  104:aconst_null     
	//   45  105:aload_2         
	//   46  106:aload_3         
	//   47  107:invokevirtual   #468 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
		} else
	//*  48  110:aload           11
	//*  49  112:ifnonnull       150
	//*  50  115:aload_3         
	//*  51  116:aload_2         
	//*  52  117:invokevirtual   #472 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
	//*  53  120:goto            47
		{
			if(hashset != null && hashset.contains(obj2))
				break; /* Loop/switch isn't completed */
	//   54  123:aload           9
	//   55  125:ifnull          138
	//   56  128:aload           9
	//   57  130:aload           12
	//   58  132:invokevirtual   #475 <Method boolean HashSet.contains(Object)>
	//   59  135:ifne            47
			jsonserializer2.serialize(obj2, jsongenerator, serializerprovider);
	//   60  138:aload           8
	//   61  140:aload           12
	//   62  142:aload_2         
	//   63  143:aload_3         
	//   64  144:invokevirtual   #468 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
		}
		if(obj1 == null)
		{
			serializerprovider.defaultSerializeNull(jsongenerator);
			break; /* Loop/switch isn't completed */
		}
	//*  65  147:goto            110
		JsonSerializer jsonserializer = _valueSerializer;
	//   66  150:aload_0         
	//   67  151:getfield        #67  <Field JsonSerializer _valueSerializer>
	//   68  154:astore          7
		obj = ((Object) (jsonserializer));
	//   69  156:aload           7
	//   70  158:astore          4
		PropertySerializerMap propertyserializermap = propertyserializermap1;
	//   71  160:aload           6
	//   72  162:astore          5
		if(jsonserializer == null)
	//*  73  164:aload           7
	//*  74  166:ifnonnull       233
		{
			Class class1 = obj1.getClass();
	//   75  169:aload           11
	//   76  171:invokevirtual   #146 <Method Class Object.getClass()>
	//   77  174:astore          13
			JsonSerializer jsonserializer1 = propertyserializermap1.serializerFor(class1);
	//   78  176:aload           6
	//   79  178:aload           13
	//   80  180:invokevirtual   #386 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//   81  183:astore          7
			obj = ((Object) (jsonserializer1));
	//   82  185:aload           7
	//   83  187:astore          4
			propertyserializermap = propertyserializermap1;
	//   84  189:aload           6
	//   85  191:astore          5
			if(jsonserializer1 == null)
	//*  86  193:aload           7
	//*  87  195:ifnonnull       233
			{
				if(_valueType.hasGenericTypes())
	//*  88  198:aload_0         
	//*  89  199:getfield        #59  <Field JavaType _valueType>
	//*  90  202:invokevirtual   #478 <Method boolean JavaType.hasGenericTypes()>
	//*  91  205:ifeq            287
					obj = ((Object) (_findAndAddDynamic(propertyserializermap1, serializerprovider.constructSpecializedType(_valueType, class1), serializerprovider)));
	//   92  208:aload_0         
	//   93  209:aload           6
	//   94  211:aload_3         
	//   95  212:aload_0         
	//   96  213:getfield        #59  <Field JavaType _valueType>
	//   97  216:aload           13
	//   98  218:invokevirtual   #482 <Method JavaType SerializerProvider.constructSpecializedType(JavaType, Class)>
	//   99  221:aload_3         
	//  100  222:invokevirtual   #226 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, JavaType, SerializerProvider)>
	//  101  225:astore          4
				else
	//* 102  227:aload_0         
	//* 103  228:getfield        #69  <Field PropertySerializerMap _dynamicValueSerializers>
	//* 104  231:astore          5
	//* 105  233:aload           4
	//* 106  235:aload           11
	//* 107  237:aload_2         
	//* 108  238:aload_3         
	//* 109  239:invokevirtual   #468 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//* 110  242:aload           5
	//* 111  244:astore          6
	//* 112  246:goto            47
	//* 113  249:astore          4
	//* 114  251:aload_0         
	//* 115  252:aload_3         
	//* 116  253:aload           4
	//* 117  255:aload_1         
	//* 118  256:new             #150 <Class StringBuilder>
	//* 119  259:dup             
	//* 120  260:invokespecial   #152 <Method void StringBuilder()>
	//* 121  263:ldc2            #484 <String "">
	//* 122  266:invokevirtual   #158 <Method StringBuilder StringBuilder.append(String)>
	//* 123  269:aload           12
	//* 124  271:invokevirtual   #487 <Method StringBuilder StringBuilder.append(Object)>
	//* 125  274:invokevirtual   #167 <Method String StringBuilder.toString()>
	//* 126  277:invokevirtual   #491 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, String)>
	//* 127  280:aload           5
	//* 128  282:astore          6
	//* 129  284:goto            47
					obj = ((Object) (_findAndAddDynamic(propertyserializermap1, class1, serializerprovider)));
	//  130  287:aload_0         
	//  131  288:aload           6
	//  132  290:aload           13
	//  133  292:aload_3         
	//  134  293:invokevirtual   #388 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//  135  296:astore          4
				propertyserializermap = _dynamicValueSerializers;
			}
		}
		((JsonSerializer) (obj)).serialize(obj1, jsongenerator, serializerprovider);
		propertyserializermap1 = propertyserializermap;
		break; /* Loop/switch isn't completed */
		obj;
		wrapAndThrow(serializerprovider, ((Throwable) (obj)), ((Object) (map)), (new StringBuilder()).append("").append(obj2).toString());
		propertyserializermap1 = propertyserializermap;
		if(true) goto _L4; else goto _L3
_L3:
		if(true) goto _L6; else goto _L5
_L5:
	//* 136  298:goto            227
	}

	public void serializeFieldsUsing(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider, JsonSerializer jsonserializer)
		throws IOException
	{
		JsonSerializer jsonserializer1;
		HashSet hashset;
		TypeSerializer typeserializer;
		Iterator iterator;
		jsonserializer1 = _keySerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field JsonSerializer _keySerializer>
	//    2    4:astore          5
		hashset = _ignoredEntries;
	//    3    6:aload_0         
	//    4    7:getfield        #55  <Field HashSet _ignoredEntries>
	//    5   10:astore          6
		typeserializer = _valueTypeSerializer;
	//    6   12:aload_0         
	//    7   13:getfield        #63  <Field TypeSerializer _valueTypeSerializer>
	//    8   16:astore          7
		iterator = map.entrySet().iterator();
	//    9   18:aload_1         
	//   10   19:invokeinterface #452 <Method Set Map.entrySet()>
	//   11   24:invokeinterface #455 <Method Iterator Set.iterator()>
	//   12   29:astore          8
_L2:
		Object obj1;
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//   13   31:aload           8
	//   14   33:invokeinterface #374 <Method boolean Iterator.hasNext()>
	//   15   38:ifeq            199
		obj1 = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   16   41:aload           8
	//   17   43:invokeinterface #378 <Method Object Iterator.next()>
	//   18   48:checkcast       #457 <Class java.util.Map$Entry>
	//   19   51:astore          10
		Object obj = ((java.util.Map.Entry) (obj1)).getKey();
	//   20   53:aload           10
	//   21   55:invokeinterface #463 <Method Object java.util.Map$Entry.getKey()>
	//   22   60:astore          9
		if(hashset != null && hashset.contains(obj))
			continue; /* Loop/switch isn't completed */
	//   23   62:aload           6
	//   24   64:ifnull          77
	//   25   67:aload           6
	//   26   69:aload           9
	//   27   71:invokevirtual   #475 <Method boolean HashSet.contains(Object)>
	//   28   74:ifne            31
		if(obj == null)
	//*  29   77:aload           9
	//*  30   79:ifnonnull       122
			serializerprovider.findNullKeySerializer(_keyType, _property).serialize(((Object) (null)), jsongenerator, serializerprovider);
	//   31   82:aload_3         
	//   32   83:aload_0         
	//   33   84:getfield        #57  <Field JavaType _keyType>
	//   34   87:aload_0         
	//   35   88:getfield        #71  <Field BeanProperty _property>
	//   36   91:invokevirtual   #466 <Method JsonSerializer SerializerProvider.findNullKeySerializer(JavaType, BeanProperty)>
	//   37   94:aconst_null     
	//   38   95:aload_2         
	//   39   96:aload_3         
	//   40   97:invokevirtual   #468 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
		else
	//*  41  100:aload           10
	//*  42  102:invokeinterface #460 <Method Object java.util.Map$Entry.getValue()>
	//*  43  107:astore          10
	//*  44  109:aload           10
	//*  45  111:ifnonnull       134
	//*  46  114:aload_3         
	//*  47  115:aload_2         
	//*  48  116:invokevirtual   #472 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
	//*  49  119:goto            31
			jsonserializer1.serialize(obj, jsongenerator, serializerprovider);
	//   50  122:aload           5
	//   51  124:aload           9
	//   52  126:aload_2         
	//   53  127:aload_3         
	//   54  128:invokevirtual   #468 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
		obj1 = ((java.util.Map.Entry) (obj1)).getValue();
		if(obj1 == null)
		{
			serializerprovider.defaultSerializeNull(jsongenerator);
			continue; /* Loop/switch isn't completed */
		}
	//*  55  131:goto            100
		if(typeserializer == null)
	//*  56  134:aload           7
	//*  57  136:ifnonnull       185
		{
			try
			{
				jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
	//   58  139:aload           4
	//   59  141:aload           10
	//   60  143:aload_2         
	//   61  144:aload_3         
	//   62  145:invokevirtual   #468 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			}
	//*  63  148:goto            31
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//*  64  151:astore          10
			{
				wrapAndThrow(serializerprovider, ((Throwable) (obj1)), ((Object) (map)), (new StringBuilder()).append("").append(obj).toString());
	//   65  153:aload_0         
	//   66  154:aload_3         
	//   67  155:aload           10
	//   68  157:aload_1         
	//   69  158:new             #150 <Class StringBuilder>
	//   70  161:dup             
	//   71  162:invokespecial   #152 <Method void StringBuilder()>
	//   72  165:ldc2            #484 <String "">
	//   73  168:invokevirtual   #158 <Method StringBuilder StringBuilder.append(String)>
	//   74  171:aload           9
	//   75  173:invokevirtual   #487 <Method StringBuilder StringBuilder.append(Object)>
	//   76  176:invokevirtual   #167 <Method String StringBuilder.toString()>
	//   77  179:invokevirtual   #491 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, String)>
			}
			continue; /* Loop/switch isn't completed */
	//   78  182:goto            31
		}
		jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, typeserializer);
	//   79  185:aload           4
	//   80  187:aload           10
	//   81  189:aload_2         
	//   82  190:aload_3         
	//   83  191:aload           7
	//   84  193:invokevirtual   #495 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
		if(true) goto _L2; else goto _L1
	//   85  196:goto            31
_L1:
	//   86  199:return          
	}

	public void serializeFilteredFields(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider, PropertyFilter propertyfilter)
		throws IOException
	{
		com.fasterxml.jackson.annotation.JsonInclude.Include include;
		if(serializerprovider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES))
	//*   0    0:aload_3         
	//*   1    1:getstatic       #431 <Field SerializationFeature SerializationFeature.WRITE_NULL_MAP_VALUES>
	//*   2    4:invokevirtual   #415 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   3    7:ifeq            25
			include = null;
	//    4   10:aconst_null     
	//    5   11:astore          5
		else
	//*   6   13:aload_0         
	//*   7   14:aload_1         
	//*   8   15:aload_2         
	//*   9   16:aload_3         
	//*  10   17:aload           4
	//*  11   19:aload           5
	//*  12   21:invokevirtual   #425 <Method void serializeFilteredFields(Map, JsonGenerator, SerializerProvider, PropertyFilter, Object)>
	//*  13   24:return          
			include = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
	//   14   25:getstatic       #103 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_NULL>
	//   15   28:astore          5
		serializeFilteredFields(map, jsongenerator, serializerprovider, propertyfilter, ((Object) (include)));
	//*  16   30:goto            13
	}

	public void serializeFilteredFields(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider, PropertyFilter propertyfilter, Object obj)
		throws IOException
	{
		PropertySerializerMap propertyserializermap;
		HashSet hashset;
		MapProperty mapproperty;
		Iterator iterator;
		hashset = _ignoredEntries;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field HashSet _ignoredEntries>
	//    2    4:astore          11
		propertyserializermap = _dynamicValueSerializers;
	//    3    6:aload_0         
	//    4    7:getfield        #69  <Field PropertySerializerMap _dynamicValueSerializers>
	//    5   10:astore          7
		mapproperty = new MapProperty(_valueTypeSerializer, _property);
	//    6   12:new             #500 <Class MapProperty>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #63  <Field TypeSerializer _valueTypeSerializer>
	//   10   20:aload_0         
	//   11   21:getfield        #71  <Field BeanProperty _property>
	//   12   24:invokespecial   #503 <Method void MapProperty(TypeSerializer, BeanProperty)>
	//   13   27:astore          12
		iterator = map.entrySet().iterator();
	//   14   29:aload_1         
	//   15   30:invokeinterface #452 <Method Set Map.entrySet()>
	//   16   35:invokeinterface #455 <Method Iterator Set.iterator()>
	//   17   40:astore          13
_L7:
		JsonSerializer jsonserializer2;
		Object obj2;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_341;
	//   18   42:aload           13
	//   19   44:invokeinterface #374 <Method boolean Iterator.hasNext()>
	//   20   49:ifeq            341
		java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   21   52:aload           13
	//   22   54:invokeinterface #378 <Method Object Iterator.next()>
	//   23   59:checkcast       #457 <Class java.util.Map$Entry>
	//   24   62:astore          6
		Object obj1 = entry.getKey();
	//   25   64:aload           6
	//   26   66:invokeinterface #463 <Method Object java.util.Map$Entry.getKey()>
	//   27   71:astore          14
		if(hashset != null && hashset.contains(obj1))
			continue; /* Loop/switch isn't completed */
	//   28   73:aload           11
	//   29   75:ifnull          88
	//   30   78:aload           11
	//   31   80:aload           14
	//   32   82:invokevirtual   #475 <Method boolean HashSet.contains(Object)>
	//   33   85:ifne            42
		Exception exception;
		JsonSerializer jsonserializer1;
		if(obj1 == null)
	//*  34   88:aload           14
	//*  35   90:ifnonnull       193
			jsonserializer1 = serializerprovider.findNullKeySerializer(_keyType, _property);
	//   36   93:aload_3         
	//   37   94:aload_0         
	//   38   95:getfield        #57  <Field JavaType _keyType>
	//   39   98:aload_0         
	//   40   99:getfield        #71  <Field BeanProperty _property>
	//   41  102:invokevirtual   #466 <Method JsonSerializer SerializerProvider.findNullKeySerializer(JavaType, BeanProperty)>
	//   42  105:astore          9
		else
	//*  43  107:aload           6
	//*  44  109:invokeinterface #460 <Method Object java.util.Map$Entry.getValue()>
	//*  45  114:astore          15
	//*  46  116:aload           15
	//*  47  118:ifnonnull       202
	//*  48  121:aload           5
	//*  49  123:ifnonnull       42
	//*  50  126:aload_3         
	//*  51  127:invokevirtual   #506 <Method JsonSerializer SerializerProvider.getDefaultNullValueSerializer()>
	//*  52  130:astore          10
	//*  53  132:aload           12
	//*  54  134:aload           14
	//*  55  136:aload           9
	//*  56  138:aload           10
	//*  57  140:invokevirtual   #510 <Method void MapProperty.reset(Object, JsonSerializer, JsonSerializer)>
	//*  58  143:aload           4
	//*  59  145:aload           15
	//*  60  147:aload_2         
	//*  61  148:aload_3         
	//*  62  149:aload           12
	//*  63  151:invokeinterface #516 <Method void PropertyFilter.serializeAsField(Object, JsonGenerator, SerializerProvider, com.fasterxml.jackson.databind.ser.PropertyWriter)>
	//*  64  156:goto            42
	//*  65  159:astore          6
	//*  66  161:aload_0         
	//*  67  162:aload_3         
	//*  68  163:aload           6
	//*  69  165:aload_1         
	//*  70  166:new             #150 <Class StringBuilder>
	//*  71  169:dup             
	//*  72  170:invokespecial   #152 <Method void StringBuilder()>
	//*  73  173:ldc2            #484 <String "">
	//*  74  176:invokevirtual   #158 <Method StringBuilder StringBuilder.append(String)>
	//*  75  179:aload           14
	//*  76  181:invokevirtual   #487 <Method StringBuilder StringBuilder.append(Object)>
	//*  77  184:invokevirtual   #167 <Method String StringBuilder.toString()>
	//*  78  187:invokevirtual   #491 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, String)>
	//*  79  190:goto            42
			jsonserializer1 = _keySerializer;
	//   80  193:aload_0         
	//   81  194:getfield        #65  <Field JsonSerializer _keySerializer>
	//   82  197:astore          9
		obj2 = entry.getValue();
		if(obj2 != null) goto _L2; else goto _L1
_L1:
		if(obj != null)
			continue; /* Loop/switch isn't completed */
		jsonserializer2 = serializerprovider.getDefaultNullValueSerializer();
_L4:
		mapproperty.reset(obj1, jsonserializer1, jsonserializer2);
		try
		{
			propertyfilter.serializeAsField(obj2, jsongenerator, serializerprovider, ((com.fasterxml.jackson.databind.ser.PropertyWriter) (mapproperty)));
		}
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			wrapAndThrow(serializerprovider, ((Throwable) (exception)), ((Object) (map)), (new StringBuilder()).append("").append(obj1).toString());
		}
		continue; /* Loop/switch isn't completed */
	//*  83  199:goto            107
_L2:
		jsonserializer2 = _valueSerializer;
	//   84  202:aload_0         
	//   85  203:getfield        #67  <Field JsonSerializer _valueSerializer>
	//   86  206:astore          10
		PropertySerializerMap propertyserializermap1 = propertyserializermap;
	//   87  208:aload           7
	//   88  210:astore          8
		JsonSerializer jsonserializer = jsonserializer2;
	//   89  212:aload           10
	//   90  214:astore          6
		if(jsonserializer2 == null)
	//*  91  216:aload           10
	//*  92  218:ifnonnull       285
		{
			Class class1 = obj2.getClass();
	//   93  221:aload           15
	//   94  223:invokevirtual   #146 <Method Class Object.getClass()>
	//   95  226:astore          16
			jsonserializer2 = propertyserializermap.serializerFor(class1);
	//   96  228:aload           7
	//   97  230:aload           16
	//   98  232:invokevirtual   #386 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//   99  235:astore          10
			propertyserializermap1 = propertyserializermap;
	//  100  237:aload           7
	//  101  239:astore          8
			jsonserializer = jsonserializer2;
	//  102  241:aload           10
	//  103  243:astore          6
			if(jsonserializer2 == null)
	//* 104  245:aload           10
	//* 105  247:ifnonnull       285
			{
				if(_valueType.hasGenericTypes())
	//* 106  250:aload_0         
	//* 107  251:getfield        #59  <Field JavaType _valueType>
	//* 108  254:invokevirtual   #478 <Method boolean JavaType.hasGenericTypes()>
	//* 109  257:ifeq            327
					jsonserializer = _findAndAddDynamic(propertyserializermap, serializerprovider.constructSpecializedType(_valueType, class1), serializerprovider);
	//  110  260:aload_0         
	//  111  261:aload           7
	//  112  263:aload_3         
	//  113  264:aload_0         
	//  114  265:getfield        #59  <Field JavaType _valueType>
	//  115  268:aload           16
	//  116  270:invokevirtual   #482 <Method JavaType SerializerProvider.constructSpecializedType(JavaType, Class)>
	//  117  273:aload_3         
	//  118  274:invokevirtual   #226 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, JavaType, SerializerProvider)>
	//  119  277:astore          6
				else
	//* 120  279:aload_0         
	//* 121  280:getfield        #69  <Field PropertySerializerMap _dynamicValueSerializers>
	//* 122  283:astore          8
	//* 123  285:aload           8
	//* 124  287:astore          7
	//* 125  289:aload           6
	//* 126  291:astore          10
	//* 127  293:aload           5
	//* 128  295:getstatic       #100 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_EMPTY>
	//* 129  298:if_acmpne       132
	//* 130  301:aload           8
	//* 131  303:astore          7
	//* 132  305:aload           6
	//* 133  307:astore          10
	//* 134  309:aload           6
	//* 135  311:aload_3         
	//* 136  312:aload           15
	//* 137  314:invokevirtual   #382 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//* 138  317:ifeq            132
	//* 139  320:aload           8
	//* 140  322:astore          7
	//* 141  324:goto            42
					jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
	//  142  327:aload_0         
	//  143  328:aload           7
	//  144  330:aload           16
	//  145  332:aload_3         
	//  146  333:invokevirtual   #388 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//  147  336:astore          6
				propertyserializermap1 = _dynamicValueSerializers;
			}
		}
		propertyserializermap = propertyserializermap1;
		jsonserializer2 = jsonserializer;
		if(obj != com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY) goto _L4; else goto _L3
_L3:
		propertyserializermap = propertyserializermap1;
		jsonserializer2 = jsonserializer;
		if(!jsonserializer.isEmpty(serializerprovider, obj2)) goto _L4; else goto _L5
_L5:
		propertyserializermap = propertyserializermap1;
		continue; /* Loop/switch isn't completed */
	//* 148  338:goto            279
		return;
	//  149  341:return          
		if(true) goto _L7; else goto _L6
_L6:
	}

	public void serializeOptionalFields(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider, Object obj)
		throws IOException
	{
		if(_valueTypeSerializer == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field TypeSerializer _valueTypeSerializer>
	//    2    4:ifnull          17
_L1:
		serializeTypedFields(map, jsongenerator, serializerprovider, obj);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:invokevirtual   #448 <Method void serializeTypedFields(Map, JsonGenerator, SerializerProvider, Object)>
_L11:
		return;
	//    9   16:return          
_L2:
		PropertySerializerMap propertyserializermap;
		HashSet hashset;
		Iterator iterator;
		hashset = _ignoredEntries;
	//   10   17:aload_0         
	//   11   18:getfield        #55  <Field HashSet _ignoredEntries>
	//   12   21:astore          10
		propertyserializermap = _dynamicValueSerializers;
	//   13   23:aload_0         
	//   14   24:getfield        #69  <Field PropertySerializerMap _dynamicValueSerializers>
	//   15   27:astore          6
		iterator = map.entrySet().iterator();
	//   16   29:aload_1         
	//   17   30:invokeinterface #452 <Method Set Map.entrySet()>
	//   18   35:invokeinterface #455 <Method Iterator Set.iterator()>
	//   19   40:astore          11
_L9:
		JsonSerializer jsonserializer2;
		Object obj2;
		if(!iterator.hasNext())
			continue; /* Loop/switch isn't completed */
	//   20   42:aload           11
	//   21   44:invokeinterface #374 <Method boolean Iterator.hasNext()>
	//   22   49:ifeq            16
		java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   23   52:aload           11
	//   24   54:invokeinterface #378 <Method Object Iterator.next()>
	//   25   59:checkcast       #457 <Class java.util.Map$Entry>
	//   26   62:astore          5
		Object obj1 = entry.getKey();
	//   27   64:aload           5
	//   28   66:invokeinterface #463 <Method Object java.util.Map$Entry.getKey()>
	//   29   71:astore          12
		Exception exception;
		JsonSerializer jsonserializer1;
		if(obj1 == null)
	//*  30   73:aload           12
	//*  31   75:ifnonnull       172
		{
			jsonserializer1 = serializerprovider.findNullKeySerializer(_keyType, _property);
	//   32   78:aload_3         
	//   33   79:aload_0         
	//   34   80:getfield        #57  <Field JavaType _keyType>
	//   35   83:aload_0         
	//   36   84:getfield        #71  <Field BeanProperty _property>
	//   37   87:invokevirtual   #466 <Method JsonSerializer SerializerProvider.findNullKeySerializer(JavaType, BeanProperty)>
	//   38   90:astore          8
		} else
	//*  39   92:aload           5
	//*  40   94:invokeinterface #460 <Method Object java.util.Map$Entry.getValue()>
	//*  41   99:astore          13
	//*  42  101:aload           13
	//*  43  103:ifnonnull       196
	//*  44  106:aload           4
	//*  45  108:ifnonnull       42
	//*  46  111:aload_3         
	//*  47  112:invokevirtual   #506 <Method JsonSerializer SerializerProvider.getDefaultNullValueSerializer()>
	//*  48  115:astore          9
	//*  49  117:aload           8
	//*  50  119:aload           12
	//*  51  121:aload_2         
	//*  52  122:aload_3         
	//*  53  123:invokevirtual   #468 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//*  54  126:aload           9
	//*  55  128:aload           13
	//*  56  130:aload_2         
	//*  57  131:aload_3         
	//*  58  132:invokevirtual   #468 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//*  59  135:goto            42
	//*  60  138:astore          5
	//*  61  140:aload_0         
	//*  62  141:aload_3         
	//*  63  142:aload           5
	//*  64  144:aload_1         
	//*  65  145:new             #150 <Class StringBuilder>
	//*  66  148:dup             
	//*  67  149:invokespecial   #152 <Method void StringBuilder()>
	//*  68  152:ldc2            #484 <String "">
	//*  69  155:invokevirtual   #158 <Method StringBuilder StringBuilder.append(String)>
	//*  70  158:aload           12
	//*  71  160:invokevirtual   #487 <Method StringBuilder StringBuilder.append(Object)>
	//*  72  163:invokevirtual   #167 <Method String StringBuilder.toString()>
	//*  73  166:invokevirtual   #491 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, String)>
	//*  74  169:goto            42
		{
			if(hashset != null && hashset.contains(obj1))
				break; /* Loop/switch isn't completed */
	//   75  172:aload           10
	//   76  174:ifnull          187
	//   77  177:aload           10
	//   78  179:aload           12
	//   79  181:invokevirtual   #475 <Method boolean HashSet.contains(Object)>
	//   80  184:ifne            42
			jsonserializer1 = _keySerializer;
	//   81  187:aload_0         
	//   82  188:getfield        #65  <Field JsonSerializer _keySerializer>
	//   83  191:astore          8
		}
		obj2 = entry.getValue();
		if(obj2 != null) goto _L4; else goto _L3
_L3:
		if(obj != null)
			break; /* Loop/switch isn't completed */
		jsonserializer2 = serializerprovider.getDefaultNullValueSerializer();
_L6:
		try
		{
			jsonserializer1.serialize(obj1, jsongenerator, serializerprovider);
			jsonserializer2.serialize(obj2, jsongenerator, serializerprovider);
		}
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			wrapAndThrow(serializerprovider, ((Throwable) (exception)), ((Object) (map)), (new StringBuilder()).append("").append(obj1).toString());
		}
		break; /* Loop/switch isn't completed */
	//*  84  193:goto            92
_L4:
		jsonserializer2 = _valueSerializer;
	//   85  196:aload_0         
	//   86  197:getfield        #67  <Field JsonSerializer _valueSerializer>
	//   87  200:astore          9
		PropertySerializerMap propertyserializermap1 = propertyserializermap;
	//   88  202:aload           6
	//   89  204:astore          7
		JsonSerializer jsonserializer = jsonserializer2;
	//   90  206:aload           9
	//   91  208:astore          5
		if(jsonserializer2 == null)
	//*  92  210:aload           9
	//*  93  212:ifnonnull       279
		{
			Class class1 = obj2.getClass();
	//   94  215:aload           13
	//   95  217:invokevirtual   #146 <Method Class Object.getClass()>
	//   96  220:astore          14
			jsonserializer2 = propertyserializermap.serializerFor(class1);
	//   97  222:aload           6
	//   98  224:aload           14
	//   99  226:invokevirtual   #386 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//  100  229:astore          9
			propertyserializermap1 = propertyserializermap;
	//  101  231:aload           6
	//  102  233:astore          7
			jsonserializer = jsonserializer2;
	//  103  235:aload           9
	//  104  237:astore          5
			if(jsonserializer2 == null)
	//* 105  239:aload           9
	//* 106  241:ifnonnull       279
			{
				if(_valueType.hasGenericTypes())
	//* 107  244:aload_0         
	//* 108  245:getfield        #59  <Field JavaType _valueType>
	//* 109  248:invokevirtual   #478 <Method boolean JavaType.hasGenericTypes()>
	//* 110  251:ifeq            321
					jsonserializer = _findAndAddDynamic(propertyserializermap, serializerprovider.constructSpecializedType(_valueType, class1), serializerprovider);
	//  111  254:aload_0         
	//  112  255:aload           6
	//  113  257:aload_3         
	//  114  258:aload_0         
	//  115  259:getfield        #59  <Field JavaType _valueType>
	//  116  262:aload           14
	//  117  264:invokevirtual   #482 <Method JavaType SerializerProvider.constructSpecializedType(JavaType, Class)>
	//  118  267:aload_3         
	//  119  268:invokevirtual   #226 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, JavaType, SerializerProvider)>
	//  120  271:astore          5
				else
	//* 121  273:aload_0         
	//* 122  274:getfield        #69  <Field PropertySerializerMap _dynamicValueSerializers>
	//* 123  277:astore          7
	//* 124  279:aload           7
	//* 125  281:astore          6
	//* 126  283:aload           5
	//* 127  285:astore          9
	//* 128  287:aload           4
	//* 129  289:getstatic       #100 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_EMPTY>
	//* 130  292:if_acmpne       117
	//* 131  295:aload           7
	//* 132  297:astore          6
	//* 133  299:aload           5
	//* 134  301:astore          9
	//* 135  303:aload           5
	//* 136  305:aload_3         
	//* 137  306:aload           13
	//* 138  308:invokevirtual   #382 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//* 139  311:ifeq            117
	//* 140  314:aload           7
	//* 141  316:astore          6
	//* 142  318:goto            42
					jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
	//  143  321:aload_0         
	//  144  322:aload           6
	//  145  324:aload           14
	//  146  326:aload_3         
	//  147  327:invokevirtual   #388 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//  148  330:astore          5
				propertyserializermap1 = _dynamicValueSerializers;
			}
		}
		propertyserializermap = propertyserializermap1;
		jsonserializer2 = jsonserializer;
		if(obj != com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY) goto _L6; else goto _L5
_L5:
		propertyserializermap = propertyserializermap1;
		jsonserializer2 = jsonserializer;
		if(!jsonserializer.isEmpty(serializerprovider, obj2)) goto _L6; else goto _L7
_L7:
		propertyserializermap = propertyserializermap1;
		if(true) goto _L9; else goto _L8
_L8:
		if(true) goto _L11; else goto _L10
_L10:
	//* 149  332:goto            273
	}

	protected void serializeTypedFields(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		com.fasterxml.jackson.annotation.JsonInclude.Include include;
		if(serializerprovider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES))
	//*   0    0:aload_3         
	//*   1    1:getstatic       #431 <Field SerializationFeature SerializationFeature.WRITE_NULL_MAP_VALUES>
	//*   2    4:invokevirtual   #415 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   3    7:ifeq            23
			include = null;
	//    4   10:aconst_null     
	//    5   11:astore          4
		else
	//*   6   13:aload_0         
	//*   7   14:aload_1         
	//*   8   15:aload_2         
	//*   9   16:aload_3         
	//*  10   17:aload           4
	//*  11   19:invokevirtual   #448 <Method void serializeTypedFields(Map, JsonGenerator, SerializerProvider, Object)>
	//*  12   22:return          
			include = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
	//   13   23:getstatic       #103 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_NULL>
	//   14   26:astore          4
		serializeTypedFields(map, jsongenerator, serializerprovider, ((Object) (include)));
	//*  15   28:goto            13
	}

	public void serializeTypedFields(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider, Object obj)
		throws IOException
	{
		PropertySerializerMap propertyserializermap;
		HashSet hashset;
		Iterator iterator;
		hashset = _ignoredEntries;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field HashSet _ignoredEntries>
	//    2    4:astore          10
		propertyserializermap = _dynamicValueSerializers;
	//    3    6:aload_0         
	//    4    7:getfield        #69  <Field PropertySerializerMap _dynamicValueSerializers>
	//    5   10:astore          5
		iterator = map.entrySet().iterator();
	//    6   12:aload_1         
	//    7   13:invokeinterface #452 <Method Set Map.entrySet()>
	//    8   18:invokeinterface #455 <Method Iterator Set.iterator()>
	//    9   23:astore          11
_L7:
		JsonSerializer jsonserializer2;
		Object obj2;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_309;
	//   10   25:aload           11
	//   11   27:invokeinterface #374 <Method boolean Iterator.hasNext()>
	//   12   32:ifeq            309
		java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   13   35:aload           11
	//   14   37:invokeinterface #378 <Method Object Iterator.next()>
	//   15   42:checkcast       #457 <Class java.util.Map$Entry>
	//   16   45:astore          6
		Object obj1 = entry.getKey();
	//   17   47:aload           6
	//   18   49:invokeinterface #463 <Method Object java.util.Map$Entry.getKey()>
	//   19   54:astore          12
		Exception exception;
		JsonSerializer jsonserializer1;
		if(obj1 == null)
	//*  20   56:aload           12
	//*  21   58:ifnonnull       159
		{
			jsonserializer1 = serializerprovider.findNullKeySerializer(_keyType, _property);
	//   22   61:aload_3         
	//   23   62:aload_0         
	//   24   63:getfield        #57  <Field JavaType _keyType>
	//   25   66:aload_0         
	//   26   67:getfield        #71  <Field BeanProperty _property>
	//   27   70:invokevirtual   #466 <Method JsonSerializer SerializerProvider.findNullKeySerializer(JavaType, BeanProperty)>
	//   28   73:astore          8
		} else
	//*  29   75:aload           6
	//*  30   77:invokeinterface #460 <Method Object java.util.Map$Entry.getValue()>
	//*  31   82:astore          13
	//*  32   84:aload           13
	//*  33   86:ifnonnull       183
	//*  34   89:aload           4
	//*  35   91:ifnonnull       25
	//*  36   94:aload_3         
	//*  37   95:invokevirtual   #506 <Method JsonSerializer SerializerProvider.getDefaultNullValueSerializer()>
	//*  38   98:astore          9
	//*  39  100:aload           8
	//*  40  102:aload           12
	//*  41  104:aload_2         
	//*  42  105:aload_3         
	//*  43  106:invokevirtual   #468 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//*  44  109:aload           9
	//*  45  111:aload           13
	//*  46  113:aload_2         
	//*  47  114:aload_3         
	//*  48  115:aload_0         
	//*  49  116:getfield        #63  <Field TypeSerializer _valueTypeSerializer>
	//*  50  119:invokevirtual   #495 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
	//*  51  122:goto            25
	//*  52  125:astore          6
	//*  53  127:aload_0         
	//*  54  128:aload_3         
	//*  55  129:aload           6
	//*  56  131:aload_1         
	//*  57  132:new             #150 <Class StringBuilder>
	//*  58  135:dup             
	//*  59  136:invokespecial   #152 <Method void StringBuilder()>
	//*  60  139:ldc2            #484 <String "">
	//*  61  142:invokevirtual   #158 <Method StringBuilder StringBuilder.append(String)>
	//*  62  145:aload           12
	//*  63  147:invokevirtual   #487 <Method StringBuilder StringBuilder.append(Object)>
	//*  64  150:invokevirtual   #167 <Method String StringBuilder.toString()>
	//*  65  153:invokevirtual   #491 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, String)>
	//*  66  156:goto            25
		{
			if(hashset != null && hashset.contains(obj1))
				continue; /* Loop/switch isn't completed */
	//   67  159:aload           10
	//   68  161:ifnull          174
	//   69  164:aload           10
	//   70  166:aload           12
	//   71  168:invokevirtual   #475 <Method boolean HashSet.contains(Object)>
	//   72  171:ifne            25
			jsonserializer1 = _keySerializer;
	//   73  174:aload_0         
	//   74  175:getfield        #65  <Field JsonSerializer _keySerializer>
	//   75  178:astore          8
		}
		obj2 = entry.getValue();
		if(obj2 != null) goto _L2; else goto _L1
_L1:
		if(obj != null)
			continue; /* Loop/switch isn't completed */
		jsonserializer2 = serializerprovider.getDefaultNullValueSerializer();
_L4:
		jsonserializer1.serialize(obj1, jsongenerator, serializerprovider);
		try
		{
			jsonserializer2.serializeWithType(obj2, jsongenerator, serializerprovider, _valueTypeSerializer);
		}
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			wrapAndThrow(serializerprovider, ((Throwable) (exception)), ((Object) (map)), (new StringBuilder()).append("").append(obj1).toString());
		}
		continue; /* Loop/switch isn't completed */
	//*  76  180:goto            75
_L2:
		JsonSerializer jsonserializer = _valueSerializer;
	//   77  183:aload_0         
	//   78  184:getfield        #67  <Field JsonSerializer _valueSerializer>
	//   79  187:astore          6
		Class class1 = obj2.getClass();
	//   80  189:aload           13
	//   81  191:invokevirtual   #146 <Method Class Object.getClass()>
	//   82  194:astore          14
		jsonserializer2 = propertyserializermap.serializerFor(class1);
	//   83  196:aload           5
	//   84  198:aload           14
	//   85  200:invokevirtual   #386 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//   86  203:astore          9
		PropertySerializerMap propertyserializermap1 = propertyserializermap;
	//   87  205:aload           5
	//   88  207:astore          7
		jsonserializer = jsonserializer2;
	//   89  209:aload           9
	//   90  211:astore          6
		if(jsonserializer2 == null)
	//*  91  213:aload           9
	//*  92  215:ifnonnull       253
		{
			if(_valueType.hasGenericTypes())
	//*  93  218:aload_0         
	//*  94  219:getfield        #59  <Field JavaType _valueType>
	//*  95  222:invokevirtual   #478 <Method boolean JavaType.hasGenericTypes()>
	//*  96  225:ifeq            295
				jsonserializer = _findAndAddDynamic(propertyserializermap, serializerprovider.constructSpecializedType(_valueType, class1), serializerprovider);
	//   97  228:aload_0         
	//   98  229:aload           5
	//   99  231:aload_3         
	//  100  232:aload_0         
	//  101  233:getfield        #59  <Field JavaType _valueType>
	//  102  236:aload           14
	//  103  238:invokevirtual   #482 <Method JavaType SerializerProvider.constructSpecializedType(JavaType, Class)>
	//  104  241:aload_3         
	//  105  242:invokevirtual   #226 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, JavaType, SerializerProvider)>
	//  106  245:astore          6
			else
	//* 107  247:aload_0         
	//* 108  248:getfield        #69  <Field PropertySerializerMap _dynamicValueSerializers>
	//* 109  251:astore          7
	//* 110  253:aload           7
	//* 111  255:astore          5
	//* 112  257:aload           6
	//* 113  259:astore          9
	//* 114  261:aload           4
	//* 115  263:getstatic       #100 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_EMPTY>
	//* 116  266:if_acmpne       100
	//* 117  269:aload           7
	//* 118  271:astore          5
	//* 119  273:aload           6
	//* 120  275:astore          9
	//* 121  277:aload           6
	//* 122  279:aload_3         
	//* 123  280:aload           13
	//* 124  282:invokevirtual   #382 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//* 125  285:ifeq            100
	//* 126  288:aload           7
	//* 127  290:astore          5
	//* 128  292:goto            25
				jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
	//  129  295:aload_0         
	//  130  296:aload           5
	//  131  298:aload           14
	//  132  300:aload_3         
	//  133  301:invokevirtual   #388 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//  134  304:astore          6
			propertyserializermap1 = _dynamicValueSerializers;
		}
		propertyserializermap = propertyserializermap1;
		jsonserializer2 = jsonserializer;
		if(obj != com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY) goto _L4; else goto _L3
_L3:
		propertyserializermap = propertyserializermap1;
		jsonserializer2 = jsonserializer;
		if(!jsonserializer.isEmpty(serializerprovider, obj2)) goto _L4; else goto _L5
_L5:
		propertyserializermap = propertyserializermap1;
		continue; /* Loop/switch isn't completed */
	//* 135  306:goto            247
		return;
	//  136  309:return          
		if(true) goto _L7; else goto _L6
_L6:
	}

	public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		serializeWithType((Map)obj, jsongenerator, serializerprovider, typeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #50  <Class Map>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #521 <Method void serializeWithType(Map, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}

	public void serializeWithType(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		Object obj1;
		typeserializer.writeTypePrefixForObject(((Object) (map)), jsongenerator);
	//    0    0:aload           4
	//    1    2:aload_1         
	//    2    3:aload_2         
	//    3    4:invokevirtual   #527 <Method void TypeSerializer.writeTypePrefixForObject(Object, JsonGenerator)>
		jsongenerator.setCurrentValue(((Object) (map)));
	//    4    7:aload_2         
	//    5    8:aload_1         
	//    6    9:invokevirtual   #405 <Method void JsonGenerator.setCurrentValue(Object)>
		obj1 = ((Object) (map));
	//    7   12:aload_1         
	//    8   13:astore          6
		if(map.isEmpty()) goto _L2; else goto _L1
	//    9   15:aload_1         
	//   10   16:invokeinterface #356 <Method boolean Map.isEmpty()>
	//   11   21:ifne            96
_L1:
		obj1 = _suppressableValue;
	//   12   24:aload_0         
	//   13   25:getfield        #77  <Field Object _suppressableValue>
	//   14   28:astore          6
		if(obj1 != com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS) goto _L4; else goto _L3
	//   15   30:aload           6
	//   16   32:getstatic       #359 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.ALWAYS>
	//   17   35:if_acmpne       105
_L3:
		Object obj = null;
	//   18   38:aconst_null     
	//   19   39:astore          5
_L6:
label0:
		{
			if(!_sortKeys)
	//*  20   41:aload_0         
	//*  21   42:getfield        #75  <Field boolean _sortKeys>
	//*  22   45:ifne            61
			{
				obj1 = ((Object) (map));
	//   23   48:aload_1         
	//   24   49:astore          6
				if(!serializerprovider.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS))
					break label0;
	//   25   51:aload_3         
	//   26   52:getstatic       #411 <Field SerializationFeature SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS>
	//   27   55:invokevirtual   #415 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//   28   58:ifeq            68
			}
			obj1 = ((Object) (_orderEntries(map)));
	//   29   61:aload_0         
	//   30   62:aload_1         
	//   31   63:invokevirtual   #417 <Method Map _orderEntries(Map)>
	//   32   66:astore          6
		}
		if(_filterId != null)
	//*  33   68:aload_0         
	//*  34   69:getfield        #73  <Field Object _filterId>
	//*  35   72:ifnull          136
			serializeFilteredFields(((Map) (obj1)), jsongenerator, serializerprovider, findPropertyFilter(serializerprovider, _filterId, obj1), obj);
	//   36   75:aload_0         
	//   37   76:aload           6
	//   38   78:aload_2         
	//   39   79:aload_3         
	//   40   80:aload_0         
	//   41   81:aload_3         
	//   42   82:aload_0         
	//   43   83:getfield        #73  <Field Object _filterId>
	//   44   86:aload           6
	//   45   88:invokevirtual   #421 <Method PropertyFilter findPropertyFilter(SerializerProvider, Object, Object)>
	//   46   91:aload           5
	//   47   93:invokevirtual   #425 <Method void serializeFilteredFields(Map, JsonGenerator, SerializerProvider, PropertyFilter, Object)>
		else
	//*  48   96:aload           4
	//*  49   98:aload           6
	//*  50  100:aload_2         
	//*  51  101:invokevirtual   #530 <Method void TypeSerializer.writeTypeSuffixForObject(Object, JsonGenerator)>
	//*  52  104:return          
	//*  53  105:aload           6
	//*  54  107:astore          5
	//*  55  109:aload           6
	//*  56  111:ifnonnull       41
	//*  57  114:aload           6
	//*  58  116:astore          5
	//*  59  118:aload_3         
	//*  60  119:getstatic       #431 <Field SerializationFeature SerializationFeature.WRITE_NULL_MAP_VALUES>
	//*  61  122:invokevirtual   #415 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  62  125:ifne            41
	//*  63  128:getstatic       #103 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_NULL>
	//*  64  131:astore          5
	//*  65  133:goto            41
		if(obj != null)
	//*  66  136:aload           5
	//*  67  138:ifnull          154
			serializeOptionalFields(((Map) (obj1)), jsongenerator, serializerprovider, obj);
	//   68  141:aload_0         
	//   69  142:aload           6
	//   70  144:aload_2         
	//   71  145:aload_3         
	//   72  146:aload           5
	//   73  148:invokevirtual   #435 <Method void serializeOptionalFields(Map, JsonGenerator, SerializerProvider, Object)>
		else
	//*  74  151:goto            96
		if(_valueSerializer != null)
	//*  75  154:aload_0         
	//*  76  155:getfield        #67  <Field JsonSerializer _valueSerializer>
	//*  77  158:ifnull          176
			serializeFieldsUsing(((Map) (obj1)), jsongenerator, serializerprovider, _valueSerializer);
	//   78  161:aload_0         
	//   79  162:aload           6
	//   80  164:aload_2         
	//   81  165:aload_3         
	//   82  166:aload_0         
	//   83  167:getfield        #67  <Field JsonSerializer _valueSerializer>
	//   84  170:invokevirtual   #439 <Method void serializeFieldsUsing(Map, JsonGenerator, SerializerProvider, JsonSerializer)>
		else
	//*  85  173:goto            96
			serializeFields(((Map) (obj1)), jsongenerator, serializerprovider);
	//   86  176:aload_0         
	//   87  177:aload           6
	//   88  179:aload_2         
	//   89  180:aload_3         
	//   90  181:invokevirtual   #442 <Method void serializeFields(Map, JsonGenerator, SerializerProvider)>
_L2:
		typeserializer.writeTypeSuffixForObject(obj1, jsongenerator);
		return;
_L4:
		obj = obj1;
		if(obj1 == null)
		{
			obj = obj1;
			if(!serializerprovider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES))
				obj = ((Object) (com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL));
		}
		if(true) goto _L6; else goto _L5
_L5:
	//*  91  184:goto            96
	}

	public MapSerializer withContentInclusion(Object obj)
	{
		if(obj == _suppressableValue)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #77  <Field Object _suppressableValue>
	//*   3    5:if_acmpne       10
		{
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		} else
		{
			_ensureOverride();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #210 <Method void _ensureOverride()>
			return new MapSerializer(this, _valueTypeSerializer, obj);
	//    8   14:new             #2   <Class MapSerializer>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #63  <Field TypeSerializer _valueTypeSerializer>
	//   13   23:aload_1         
	//   14   24:invokespecial   #84  <Method void MapSerializer(MapSerializer, TypeSerializer, Object)>
	//   15   27:areturn         
		}
	}

	public volatile JsonSerializer withFilterId(Object obj)
	{
		return ((JsonSerializer) (withFilterId(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #123 <Method MapSerializer withFilterId(Object)>
	//    3    5:areturn         
	}

	public MapSerializer withFilterId(Object obj)
	{
		if(_filterId == obj)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field Object _filterId>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
		{
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		} else
		{
			_ensureOverride();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #210 <Method void _ensureOverride()>
			return new MapSerializer(this, obj, _sortKeys);
	//    8   14:new             #2   <Class MapSerializer>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_0         
	//   13   21:getfield        #75  <Field boolean _sortKeys>
	//   14   24:invokespecial   #534 <Method void MapSerializer(MapSerializer, Object, boolean)>
	//   15   27:areturn         
		}
	}

	public MapSerializer withResolved(BeanProperty beanproperty, JsonSerializer jsonserializer, JsonSerializer jsonserializer1, HashSet hashset, boolean flag)
	{
		_ensureOverride();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #210 <Method void _ensureOverride()>
		jsonserializer = ((JsonSerializer) (new MapSerializer(this, beanproperty, jsonserializer, jsonserializer1, hashset)));
	//    2    4:new             #2   <Class MapSerializer>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:aload           4
	//    9   14:invokespecial   #536 <Method void MapSerializer(MapSerializer, BeanProperty, JsonSerializer, JsonSerializer, HashSet)>
	//   10   17:astore_2        
		beanproperty = ((BeanProperty) (jsonserializer));
	//   11   18:aload_2         
	//   12   19:astore_1        
		if(flag != ((MapSerializer) (jsonserializer))._sortKeys)
	//*  13   20:iload           5
	//*  14   22:aload_2         
	//*  15   23:getfield        #75  <Field boolean _sortKeys>
	//*  16   26:icmpeq          44
			beanproperty = ((BeanProperty) (new MapSerializer(((MapSerializer) (jsonserializer)), _filterId, flag)));
	//   17   29:new             #2   <Class MapSerializer>
	//   18   32:dup             
	//   19   33:aload_2         
	//   20   34:aload_0         
	//   21   35:getfield        #73  <Field Object _filterId>
	//   22   38:iload           5
	//   23   40:invokespecial   #534 <Method void MapSerializer(MapSerializer, Object, boolean)>
	//   24   43:astore_1        
		return ((MapSerializer) (beanproperty));
	//   25   44:aload_1         
	//   26   45:areturn         
	}

	protected static final JavaType UNSPECIFIED_TYPE = TypeFactory.unknownType();
	private static final long serialVersionUID = 1L;
	protected PropertySerializerMap _dynamicValueSerializers;
	protected final Object _filterId;
	protected final HashSet _ignoredEntries;
	protected JsonSerializer _keySerializer;
	protected final JavaType _keyType;
	protected final BeanProperty _property;
	protected final boolean _sortKeys;
	protected final Object _suppressableValue;
	protected JsonSerializer _valueSerializer;
	protected final JavaType _valueType;
	protected final boolean _valueTypeIsStatic;
	protected final TypeSerializer _valueTypeSerializer;

	static 
	{
	//    0    0:invokestatic    #43  <Method JavaType TypeFactory.unknownType()>
	//    1    3:putstatic       #45  <Field JavaType UNSPECIFIED_TYPE>
	//*   2    6:return          
	}
}
