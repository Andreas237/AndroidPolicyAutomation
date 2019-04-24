// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.*;

public interface Deserializers
{
	public static class Base
		implements Deserializers
	{

		public JsonDeserializer findArrayDeserializer(ArrayType arraytype, DeserializationConfig deserializationconfig, BeanDescription beandescription, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
			throws JsonMappingException
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public JsonDeserializer findBeanDeserializer(JavaType javatype, DeserializationConfig deserializationconfig, BeanDescription beandescription)
			throws JsonMappingException
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public JsonDeserializer findCollectionDeserializer(CollectionType collectiontype, DeserializationConfig deserializationconfig, BeanDescription beandescription, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
			throws JsonMappingException
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public JsonDeserializer findCollectionLikeDeserializer(CollectionLikeType collectionliketype, DeserializationConfig deserializationconfig, BeanDescription beandescription, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
			throws JsonMappingException
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public JsonDeserializer findEnumDeserializer(Class class1, DeserializationConfig deserializationconfig, BeanDescription beandescription)
			throws JsonMappingException
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public JsonDeserializer findMapDeserializer(MapType maptype, DeserializationConfig deserializationconfig, BeanDescription beandescription, KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
			throws JsonMappingException
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public JsonDeserializer findMapLikeDeserializer(MapLikeType mapliketype, DeserializationConfig deserializationconfig, BeanDescription beandescription, KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
			throws JsonMappingException
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public JsonDeserializer findReferenceDeserializer(ReferenceType referencetype, DeserializationConfig deserializationconfig, BeanDescription beandescription, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
			throws JsonMappingException
		{
			return findBeanDeserializer(((JavaType) (referencetype)), deserializationconfig, beandescription);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #41  <Method JsonDeserializer findBeanDeserializer(JavaType, DeserializationConfig, BeanDescription)>
		//    5    7:areturn         
		}

		public JsonDeserializer findTreeNodeDeserializer(Class class1, DeserializationConfig deserializationconfig, BeanDescription beandescription)
			throws JsonMappingException
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public Base()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	public abstract JsonDeserializer findArrayDeserializer(ArrayType arraytype, DeserializationConfig deserializationconfig, BeanDescription beandescription, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
		throws JsonMappingException;

	public abstract JsonDeserializer findBeanDeserializer(JavaType javatype, DeserializationConfig deserializationconfig, BeanDescription beandescription)
		throws JsonMappingException;

	public abstract JsonDeserializer findCollectionDeserializer(CollectionType collectiontype, DeserializationConfig deserializationconfig, BeanDescription beandescription, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
		throws JsonMappingException;

	public abstract JsonDeserializer findCollectionLikeDeserializer(CollectionLikeType collectionliketype, DeserializationConfig deserializationconfig, BeanDescription beandescription, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
		throws JsonMappingException;

	public abstract JsonDeserializer findEnumDeserializer(Class class1, DeserializationConfig deserializationconfig, BeanDescription beandescription)
		throws JsonMappingException;

	public abstract JsonDeserializer findMapDeserializer(MapType maptype, DeserializationConfig deserializationconfig, BeanDescription beandescription, KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
		throws JsonMappingException;

	public abstract JsonDeserializer findMapLikeDeserializer(MapLikeType mapliketype, DeserializationConfig deserializationconfig, BeanDescription beandescription, KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
		throws JsonMappingException;

	public abstract JsonDeserializer findReferenceDeserializer(ReferenceType referencetype, DeserializationConfig deserializationconfig, BeanDescription beandescription, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
		throws JsonMappingException;

	public abstract JsonDeserializer findTreeNodeDeserializer(Class class1, DeserializationConfig deserializationconfig, BeanDescription beandescription)
		throws JsonMappingException;
}
