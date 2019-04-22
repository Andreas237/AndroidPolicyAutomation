// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.type.*;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//			Serializers

public static class Serializers$Base
	implements Serializers
{

	public JsonSerializer findArraySerializer(SerializationConfig serializationconfig, ArrayType arraytype, BeanDescription beandescription, TypeSerializer typeserializer, JsonSerializer jsonserializer)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public JsonSerializer findCollectionLikeSerializer(SerializationConfig serializationconfig, CollectionLikeType collectionliketype, BeanDescription beandescription, TypeSerializer typeserializer, JsonSerializer jsonserializer)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public JsonSerializer findCollectionSerializer(SerializationConfig serializationconfig, CollectionType collectiontype, BeanDescription beandescription, TypeSerializer typeserializer, JsonSerializer jsonserializer)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public JsonSerializer findMapLikeSerializer(SerializationConfig serializationconfig, MapLikeType mapliketype, BeanDescription beandescription, JsonSerializer jsonserializer, TypeSerializer typeserializer, JsonSerializer jsonserializer1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public JsonSerializer findMapSerializer(SerializationConfig serializationconfig, MapType maptype, BeanDescription beandescription, JsonSerializer jsonserializer, TypeSerializer typeserializer, JsonSerializer jsonserializer1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public JsonSerializer findReferenceSerializer(SerializationConfig serializationconfig, ReferenceType referencetype, BeanDescription beandescription, TypeSerializer typeserializer, JsonSerializer jsonserializer)
	{
		return findSerializer(serializationconfig, ((JavaType) (referencetype)), beandescription);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #34  <Method JsonSerializer findSerializer(SerializationConfig, JavaType, BeanDescription)>
	//    5    7:areturn         
	}

	public JsonSerializer findSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Serializers$Base()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
