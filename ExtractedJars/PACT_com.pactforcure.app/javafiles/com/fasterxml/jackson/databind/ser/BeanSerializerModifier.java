// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.*;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//			BeanSerializerBuilder

public abstract class BeanSerializerModifier
{

	public BeanSerializerModifier()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public List changeProperties(SerializationConfig serializationconfig, BeanDescription beandescription, List list)
	{
		return list;
	//    0    0:aload_3         
	//    1    1:areturn         
	}

	public JsonSerializer modifyArraySerializer(SerializationConfig serializationconfig, ArrayType arraytype, BeanDescription beandescription, JsonSerializer jsonserializer)
	{
		return jsonserializer;
	//    0    0:aload           4
	//    1    2:areturn         
	}

	public JsonSerializer modifyCollectionLikeSerializer(SerializationConfig serializationconfig, CollectionLikeType collectionliketype, BeanDescription beandescription, JsonSerializer jsonserializer)
	{
		return jsonserializer;
	//    0    0:aload           4
	//    1    2:areturn         
	}

	public JsonSerializer modifyCollectionSerializer(SerializationConfig serializationconfig, CollectionType collectiontype, BeanDescription beandescription, JsonSerializer jsonserializer)
	{
		return jsonserializer;
	//    0    0:aload           4
	//    1    2:areturn         
	}

	public JsonSerializer modifyEnumSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription, JsonSerializer jsonserializer)
	{
		return jsonserializer;
	//    0    0:aload           4
	//    1    2:areturn         
	}

	public JsonSerializer modifyKeySerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription, JsonSerializer jsonserializer)
	{
		return jsonserializer;
	//    0    0:aload           4
	//    1    2:areturn         
	}

	public JsonSerializer modifyMapLikeSerializer(SerializationConfig serializationconfig, MapLikeType mapliketype, BeanDescription beandescription, JsonSerializer jsonserializer)
	{
		return jsonserializer;
	//    0    0:aload           4
	//    1    2:areturn         
	}

	public JsonSerializer modifyMapSerializer(SerializationConfig serializationconfig, MapType maptype, BeanDescription beandescription, JsonSerializer jsonserializer)
	{
		return jsonserializer;
	//    0    0:aload           4
	//    1    2:areturn         
	}

	public JsonSerializer modifySerializer(SerializationConfig serializationconfig, BeanDescription beandescription, JsonSerializer jsonserializer)
	{
		return jsonserializer;
	//    0    0:aload_3         
	//    1    1:areturn         
	}

	public List orderProperties(SerializationConfig serializationconfig, BeanDescription beandescription, List list)
	{
		return list;
	//    0    0:aload_3         
	//    1    1:areturn         
	}

	public BeanSerializerBuilder updateBuilder(SerializationConfig serializationconfig, BeanDescription beandescription, BeanSerializerBuilder beanserializerbuilder)
	{
		return beanserializerbuilder;
	//    0    0:aload_3         
	//    1    1:areturn         
	}
}
