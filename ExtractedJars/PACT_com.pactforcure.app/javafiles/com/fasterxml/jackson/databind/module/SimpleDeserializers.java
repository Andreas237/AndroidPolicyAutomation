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

	public void addDeserializer(Class class1, JsonDeserializer jsondeserializer)
	{
		ClassKey classkey = new ClassKey(class1);
	//    0    0:new             #36  <Class ClassKey>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #39  <Method void ClassKey(Class)>
	//    4    8:astore_3        
		if(_classMappings == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #23  <Field HashMap _classMappings>
	//*   7   13:ifnonnull       27
			_classMappings = new HashMap();
	//    8   16:aload_0         
	//    9   17:new             #41  <Class HashMap>
	//   10   20:dup             
	//   11   21:invokespecial   #42  <Method void HashMap()>
	//   12   24:putfield        #23  <Field HashMap _classMappings>
		_classMappings.put(((Object) (classkey)), ((Object) (jsondeserializer)));
	//   13   27:aload_0         
	//   14   28:getfield        #23  <Field HashMap _classMappings>
	//   15   31:aload_3         
	//   16   32:aload_2         
	//   17   33:invokevirtual   #46  <Method Object HashMap.put(Object, Object)>
	//   18   36:pop             
		if(class1 == java/lang/Enum)
	//*  19   37:aload_1         
	//*  20   38:ldc1            #48  <Class Enum>
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
	//*   1    1:invokeinterface #55  <Method Set Map.entrySet()>
	//*   2    6:invokeinterface #61  <Method Iterator Set.iterator()>
	//*   3   11:astore_1        
	//*   4   12:aload_1         
	//*   5   13:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            56
			entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//    7   21:aload_1         
	//    8   22:invokeinterface #71  <Method Object Iterator.next()>
	//    9   27:checkcast       #73  <Class java.util.Map$Entry>
	//   10   30:astore_2        

	//   11   31:aload_0         
	//   12   32:aload_2         
	//   13   33:invokeinterface #76  <Method Object java.util.Map$Entry.getKey()>
	//   14   38:checkcast       #78  <Class Class>
	//   15   41:aload_2         
	//   16   42:invokeinterface #81  <Method Object java.util.Map$Entry.getValue()>
	//   17   47:checkcast       #83  <Class JsonDeserializer>
	//   18   50:invokevirtual   #85  <Method void addDeserializer(Class, JsonDeserializer)>
	//*  19   53:goto            12
	//   20   56:return          
	}

	public JsonDeserializer findArrayDeserializer(ArrayType arraytype, DeserializationConfig deserializationconfig, BeanDescription beandescription, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
		throws JsonMappingException
	{
		if(_classMappings == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field HashMap _classMappings>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (JsonDeserializer)_classMappings.get(((Object) (new ClassKey(arraytype.getRawClass()))));
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field HashMap _classMappings>
	//    7   13:new             #36  <Class ClassKey>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokevirtual   #95  <Method Class ArrayType.getRawClass()>
	//   11   21:invokespecial   #39  <Method void ClassKey(Class)>
	//   12   24:invokevirtual   #99  <Method Object HashMap.get(Object)>
	//   13   27:checkcast       #83  <Class JsonDeserializer>
	//   14   30:areturn         
	}

	public JsonDeserializer findBeanDeserializer(JavaType javatype, DeserializationConfig deserializationconfig, BeanDescription beandescription)
		throws JsonMappingException
	{
		if(_classMappings == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field HashMap _classMappings>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (JsonDeserializer)_classMappings.get(((Object) (new ClassKey(javatype.getRawClass()))));
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field HashMap _classMappings>
	//    7   13:new             #36  <Class ClassKey>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokevirtual   #106 <Method Class JavaType.getRawClass()>
	//   11   21:invokespecial   #39  <Method void ClassKey(Class)>
	//   12   24:invokevirtual   #99  <Method Object HashMap.get(Object)>
	//   13   27:checkcast       #83  <Class JsonDeserializer>
	//   14   30:areturn         
	}

	public JsonDeserializer findCollectionDeserializer(CollectionType collectiontype, DeserializationConfig deserializationconfig, BeanDescription beandescription, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
		throws JsonMappingException
	{
		if(_classMappings == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field HashMap _classMappings>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (JsonDeserializer)_classMappings.get(((Object) (new ClassKey(collectiontype.getRawClass()))));
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field HashMap _classMappings>
	//    7   13:new             #36  <Class ClassKey>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokevirtual   #112 <Method Class CollectionType.getRawClass()>
	//   11   21:invokespecial   #39  <Method void ClassKey(Class)>
	//   12   24:invokevirtual   #99  <Method Object HashMap.get(Object)>
	//   13   27:checkcast       #83  <Class JsonDeserializer>
	//   14   30:areturn         
	}

	public JsonDeserializer findCollectionLikeDeserializer(CollectionLikeType collectionliketype, DeserializationConfig deserializationconfig, BeanDescription beandescription, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
		throws JsonMappingException
	{
		if(_classMappings == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field HashMap _classMappings>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (JsonDeserializer)_classMappings.get(((Object) (new ClassKey(collectionliketype.getRawClass()))));
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field HashMap _classMappings>
	//    7   13:new             #36  <Class ClassKey>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokevirtual   #118 <Method Class CollectionLikeType.getRawClass()>
	//   11   21:invokespecial   #39  <Method void ClassKey(Class)>
	//   12   24:invokevirtual   #99  <Method Object HashMap.get(Object)>
	//   13   27:checkcast       #83  <Class JsonDeserializer>
	//   14   30:areturn         
	}

	public JsonDeserializer findEnumDeserializer(Class class1, DeserializationConfig deserializationconfig, BeanDescription beandescription)
		throws JsonMappingException
	{
		if(_classMappings == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field HashMap _classMappings>
	//*   2    4:ifnonnull       11
		{
			deserializationconfig = null;
	//    3    7:aconst_null     
	//    4    8:astore_2        
		} else
	//*   5    9:aload_2         
	//*   6   10:areturn         
		{
			beandescription = ((BeanDescription) ((JsonDeserializer)_classMappings.get(((Object) (new ClassKey(class1))))));
	//    7   11:aload_0         
	//    8   12:getfield        #23  <Field HashMap _classMappings>
	//    9   15:new             #36  <Class ClassKey>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:invokespecial   #39  <Method void ClassKey(Class)>
	//   13   23:invokevirtual   #99  <Method Object HashMap.get(Object)>
	//   14   26:checkcast       #83  <Class JsonDeserializer>
	//   15   29:astore_3        
			deserializationconfig = ((DeserializationConfig) (beandescription));
	//   16   30:aload_3         
	//   17   31:astore_2        
			if(beandescription == null)
	//*  18   32:aload_3         
	//*  19   33:ifnonnull       9
			{
				deserializationconfig = ((DeserializationConfig) (beandescription));
	//   20   36:aload_3         
	//   21   37:astore_2        
				if(_hasEnumDeserializer)
	//*  22   38:aload_0         
	//*  23   39:getfield        #25  <Field boolean _hasEnumDeserializer>
	//*  24   42:ifeq            9
				{
					deserializationconfig = ((DeserializationConfig) (beandescription));
	//   25   45:aload_3         
	//   26   46:astore_2        
					if(class1.isEnum())
	//*  27   47:aload_1         
	//*  28   48:invokevirtual   #124 <Method boolean Class.isEnum()>
	//*  29   51:ifeq            9
						return (JsonDeserializer)_classMappings.get(((Object) (new ClassKey(java/lang/Enum))));
	//   30   54:aload_0         
	//   31   55:getfield        #23  <Field HashMap _classMappings>
	//   32   58:new             #36  <Class ClassKey>
	//   33   61:dup             
	//   34   62:ldc1            #48  <Class Enum>
	//   35   64:invokespecial   #39  <Method void ClassKey(Class)>
	//   36   67:invokevirtual   #99  <Method Object HashMap.get(Object)>
	//   37   70:checkcast       #83  <Class JsonDeserializer>
	//   38   73:areturn         
				}
			}
		}
		return ((JsonDeserializer) (deserializationconfig));
	}

	public JsonDeserializer findMapDeserializer(MapType maptype, DeserializationConfig deserializationconfig, BeanDescription beandescription, KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
		throws JsonMappingException
	{
		if(_classMappings == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field HashMap _classMappings>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (JsonDeserializer)_classMappings.get(((Object) (new ClassKey(maptype.getRawClass()))));
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field HashMap _classMappings>
	//    7   13:new             #36  <Class ClassKey>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokevirtual   #130 <Method Class MapType.getRawClass()>
	//   11   21:invokespecial   #39  <Method void ClassKey(Class)>
	//   12   24:invokevirtual   #99  <Method Object HashMap.get(Object)>
	//   13   27:checkcast       #83  <Class JsonDeserializer>
	//   14   30:areturn         
	}

	public JsonDeserializer findMapLikeDeserializer(MapLikeType mapliketype, DeserializationConfig deserializationconfig, BeanDescription beandescription, KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
		throws JsonMappingException
	{
		if(_classMappings == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field HashMap _classMappings>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (JsonDeserializer)_classMappings.get(((Object) (new ClassKey(mapliketype.getRawClass()))));
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field HashMap _classMappings>
	//    7   13:new             #36  <Class ClassKey>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokevirtual   #136 <Method Class MapLikeType.getRawClass()>
	//   11   21:invokespecial   #39  <Method void ClassKey(Class)>
	//   12   24:invokevirtual   #99  <Method Object HashMap.get(Object)>
	//   13   27:checkcast       #83  <Class JsonDeserializer>
	//   14   30:areturn         
	}

	public JsonDeserializer findReferenceDeserializer(ReferenceType referencetype, DeserializationConfig deserializationconfig, BeanDescription beandescription, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
		throws JsonMappingException
	{
		if(_classMappings == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field HashMap _classMappings>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (JsonDeserializer)_classMappings.get(((Object) (new ClassKey(referencetype.getRawClass()))));
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field HashMap _classMappings>
	//    7   13:new             #36  <Class ClassKey>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokevirtual   #142 <Method Class ReferenceType.getRawClass()>
	//   11   21:invokespecial   #39  <Method void ClassKey(Class)>
	//   12   24:invokevirtual   #99  <Method Object HashMap.get(Object)>
	//   13   27:checkcast       #83  <Class JsonDeserializer>
	//   14   30:areturn         
	}

	public JsonDeserializer findTreeNodeDeserializer(Class class1, DeserializationConfig deserializationconfig, BeanDescription beandescription)
		throws JsonMappingException
	{
		if(_classMappings == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field HashMap _classMappings>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (JsonDeserializer)_classMappings.get(((Object) (new ClassKey(class1))));
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field HashMap _classMappings>
	//    7   13:new             #36  <Class ClassKey>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #39  <Method void ClassKey(Class)>
	//   11   21:invokevirtual   #99  <Method Object HashMap.get(Object)>
	//   12   24:checkcast       #83  <Class JsonDeserializer>
	//   13   27:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected HashMap _classMappings;
	protected boolean _hasEnumDeserializer;
}
