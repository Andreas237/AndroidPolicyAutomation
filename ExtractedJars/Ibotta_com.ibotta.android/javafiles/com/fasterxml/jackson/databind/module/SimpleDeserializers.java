// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.*;
import java.io.Serializable;
import java.util.*;

public class SimpleDeserializers
	implements Deserializers, Serializable
{

	public SimpleDeserializers()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		_classMappings = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #23  <Field HashMap _classMappings>
		_hasEnumDeserializer = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #25  <Field boolean _hasEnumDeserializer>
	//    8   14:return          
	}

	public SimpleDeserializers(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		_classMappings = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #23  <Field HashMap _classMappings>
		_hasEnumDeserializer = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #25  <Field boolean _hasEnumDeserializer>
		addDeserializers(map);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #30  <Method void addDeserializers(Map)>
	//   11   19:return          
	}

	private final JsonDeserializer _find(JavaType javatype)
	{
		HashMap hashmap = _classMappings;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field HashMap _classMappings>
	//    2    4:astore_2        
		if(hashmap == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return (JsonDeserializer)hashmap.get(((Object) (new ClassKey(javatype.getRawClass()))));
	//    7   11:aload_2         
	//    8   12:new             #36  <Class ClassKey>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:invokevirtual   #42  <Method Class JavaType.getRawClass()>
	//   12   20:invokespecial   #45  <Method void ClassKey(Class)>
	//   13   23:invokevirtual   #51  <Method Object HashMap.get(Object)>
	//   14   26:checkcast       #53  <Class JsonDeserializer>
	//   15   29:areturn         
	}

	public void addDeserializer(Class class1, JsonDeserializer jsondeserializer)
	{
		ClassKey classkey = new ClassKey(class1);
	//    0    0:new             #36  <Class ClassKey>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #45  <Method void ClassKey(Class)>
	//    4    8:astore_3        
		if(_classMappings == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #23  <Field HashMap _classMappings>
	//*   7   13:ifnonnull       27
			_classMappings = new HashMap();
	//    8   16:aload_0         
	//    9   17:new             #47  <Class HashMap>
	//   10   20:dup             
	//   11   21:invokespecial   #57  <Method void HashMap()>
	//   12   24:putfield        #23  <Field HashMap _classMappings>
		_classMappings.put(((Object) (classkey)), ((Object) (jsondeserializer)));
	//   13   27:aload_0         
	//   14   28:getfield        #23  <Field HashMap _classMappings>
	//   15   31:aload_3         
	//   16   32:aload_2         
	//   17   33:invokevirtual   #61  <Method Object HashMap.put(Object, Object)>
	//   18   36:pop             
		if(class1 == java/lang/Enum)
	//*  19   37:aload_1         
	//*  20   38:ldc1            #63  <Class Enum>
	//*  21   40:if_acmpne       48
			_hasEnumDeserializer = true;
	//   22   43:aload_0         
	//   23   44:iconst_1        
	//   24   45:putfield        #25  <Field boolean _hasEnumDeserializer>
	//   25   48:return          
	}

	public void addDeserializers(Map map)
	{
		java.util.Map.Entry entry;
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); addDeserializer((Class)entry.getKey(), (JsonDeserializer)entry.getValue()))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #70  <Method Set Map.entrySet()>
	//*   2    6:invokeinterface #76  <Method Iterator Set.iterator()>
	//*   3   11:astore_1        
	//*   4   12:aload_1         
	//*   5   13:invokeinterface #82  <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            56
			entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//    7   21:aload_1         
	//    8   22:invokeinterface #86  <Method Object Iterator.next()>
	//    9   27:checkcast       #88  <Class java.util.Map$Entry>
	//   10   30:astore_2        

	//   11   31:aload_0         
	//   12   32:aload_2         
	//   13   33:invokeinterface #91  <Method Object java.util.Map$Entry.getKey()>
	//   14   38:checkcast       #93  <Class Class>
	//   15   41:aload_2         
	//   16   42:invokeinterface #96  <Method Object java.util.Map$Entry.getValue()>
	//   17   47:checkcast       #53  <Class JsonDeserializer>
	//   18   50:invokevirtual   #98  <Method void addDeserializer(Class, JsonDeserializer)>
	//*  19   53:goto            12
	//   20   56:return          
	}

	public JsonDeserializer findArrayDeserializer(ArrayType arraytype, DeserializationConfig deserializationconfig, BeanDescription beandescription, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
		throws JsonMappingException
	{
		return _find(((JavaType) (arraytype)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #104 <Method JsonDeserializer _find(JavaType)>
	//    3    5:areturn         
	}

	public JsonDeserializer findBeanDeserializer(JavaType javatype, DeserializationConfig deserializationconfig, BeanDescription beandescription)
		throws JsonMappingException
	{
		return _find(javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #104 <Method JsonDeserializer _find(JavaType)>
	//    3    5:areturn         
	}

	public JsonDeserializer findCollectionDeserializer(CollectionType collectiontype, DeserializationConfig deserializationconfig, BeanDescription beandescription, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
		throws JsonMappingException
	{
		return _find(((JavaType) (collectiontype)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #104 <Method JsonDeserializer _find(JavaType)>
	//    3    5:areturn         
	}

	public JsonDeserializer findCollectionLikeDeserializer(CollectionLikeType collectionliketype, DeserializationConfig deserializationconfig, BeanDescription beandescription, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
		throws JsonMappingException
	{
		return _find(((JavaType) (collectionliketype)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #104 <Method JsonDeserializer _find(JavaType)>
	//    3    5:areturn         
	}

	public JsonDeserializer findEnumDeserializer(Class class1, DeserializationConfig deserializationconfig, BeanDescription beandescription)
		throws JsonMappingException
	{
		deserializationconfig = ((DeserializationConfig) (_classMappings));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field HashMap _classMappings>
	//    2    4:astore_2        
		if(deserializationconfig == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		beandescription = ((BeanDescription) ((JsonDeserializer)((HashMap) (deserializationconfig)).get(((Object) (new ClassKey(class1))))));
	//    7   11:aload_2         
	//    8   12:new             #36  <Class ClassKey>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:invokespecial   #45  <Method void ClassKey(Class)>
	//   12   20:invokevirtual   #51  <Method Object HashMap.get(Object)>
	//   13   23:checkcast       #53  <Class JsonDeserializer>
	//   14   26:astore_3        
		deserializationconfig = ((DeserializationConfig) (beandescription));
	//   15   27:aload_3         
	//   16   28:astore_2        
		if(beandescription == null)
	//*  17   29:aload_3         
	//*  18   30:ifnonnull       71
		{
			deserializationconfig = ((DeserializationConfig) (beandescription));
	//   19   33:aload_3         
	//   20   34:astore_2        
			if(_hasEnumDeserializer)
	//*  21   35:aload_0         
	//*  22   36:getfield        #25  <Field boolean _hasEnumDeserializer>
	//*  23   39:ifeq            71
			{
				deserializationconfig = ((DeserializationConfig) (beandescription));
	//   24   42:aload_3         
	//   25   43:astore_2        
				if(class1.isEnum())
	//*  26   44:aload_1         
	//*  27   45:invokevirtual   #120 <Method boolean Class.isEnum()>
	//*  28   48:ifeq            71
					deserializationconfig = ((DeserializationConfig) ((JsonDeserializer)_classMappings.get(((Object) (new ClassKey(java/lang/Enum))))));
	//   29   51:aload_0         
	//   30   52:getfield        #23  <Field HashMap _classMappings>
	//   31   55:new             #36  <Class ClassKey>
	//   32   58:dup             
	//   33   59:ldc1            #63  <Class Enum>
	//   34   61:invokespecial   #45  <Method void ClassKey(Class)>
	//   35   64:invokevirtual   #51  <Method Object HashMap.get(Object)>
	//   36   67:checkcast       #53  <Class JsonDeserializer>
	//   37   70:astore_2        
			}
		}
		return ((JsonDeserializer) (deserializationconfig));
	//   38   71:aload_2         
	//   39   72:areturn         
	}

	public JsonDeserializer findMapDeserializer(MapType maptype, DeserializationConfig deserializationconfig, BeanDescription beandescription, KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
		throws JsonMappingException
	{
		return _find(((JavaType) (maptype)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #104 <Method JsonDeserializer _find(JavaType)>
	//    3    5:areturn         
	}

	public JsonDeserializer findMapLikeDeserializer(MapLikeType mapliketype, DeserializationConfig deserializationconfig, BeanDescription beandescription, KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
		throws JsonMappingException
	{
		return _find(((JavaType) (mapliketype)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #104 <Method JsonDeserializer _find(JavaType)>
	//    3    5:areturn         
	}

	public JsonDeserializer findReferenceDeserializer(ReferenceType referencetype, DeserializationConfig deserializationconfig, BeanDescription beandescription, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
		throws JsonMappingException
	{
		return _find(((JavaType) (referencetype)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #104 <Method JsonDeserializer _find(JavaType)>
	//    3    5:areturn         
	}

	public JsonDeserializer findTreeNodeDeserializer(Class class1, DeserializationConfig deserializationconfig, BeanDescription beandescription)
		throws JsonMappingException
	{
		deserializationconfig = ((DeserializationConfig) (_classMappings));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field HashMap _classMappings>
	//    2    4:astore_2        
		if(deserializationconfig == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return (JsonDeserializer)((HashMap) (deserializationconfig)).get(((Object) (new ClassKey(class1))));
	//    7   11:aload_2         
	//    8   12:new             #36  <Class ClassKey>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:invokespecial   #45  <Method void ClassKey(Class)>
	//   12   20:invokevirtual   #51  <Method Object HashMap.get(Object)>
	//   13   23:checkcast       #53  <Class JsonDeserializer>
	//   14   26:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected HashMap _classMappings;
	protected boolean _hasEnumDeserializer;
}
