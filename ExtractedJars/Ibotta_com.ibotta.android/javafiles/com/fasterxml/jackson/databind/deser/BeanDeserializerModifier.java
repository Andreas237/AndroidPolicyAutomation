// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.*;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//			BeanDeserializerBuilder

public abstract class BeanDeserializerModifier
{

	public BeanDeserializerModifier()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public JsonDeserializer modifyArrayDeserializer(DeserializationConfig deserializationconfig, ArrayType arraytype, BeanDescription beandescription, JsonDeserializer jsondeserializer)
	{
		return jsondeserializer;
	//    0    0:aload           4
	//    1    2:areturn         
	}

	public JsonDeserializer modifyCollectionDeserializer(DeserializationConfig deserializationconfig, CollectionType collectiontype, BeanDescription beandescription, JsonDeserializer jsondeserializer)
	{
		return jsondeserializer;
	//    0    0:aload           4
	//    1    2:areturn         
	}

	public JsonDeserializer modifyCollectionLikeDeserializer(DeserializationConfig deserializationconfig, CollectionLikeType collectionliketype, BeanDescription beandescription, JsonDeserializer jsondeserializer)
	{
		return jsondeserializer;
	//    0    0:aload           4
	//    1    2:areturn         
	}

	public JsonDeserializer modifyDeserializer(DeserializationConfig deserializationconfig, BeanDescription beandescription, JsonDeserializer jsondeserializer)
	{
		return jsondeserializer;
	//    0    0:aload_3         
	//    1    1:areturn         
	}

	public JsonDeserializer modifyEnumDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, BeanDescription beandescription, JsonDeserializer jsondeserializer)
	{
		return jsondeserializer;
	//    0    0:aload           4
	//    1    2:areturn         
	}

	public KeyDeserializer modifyKeyDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, KeyDeserializer keydeserializer)
	{
		return keydeserializer;
	//    0    0:aload_3         
	//    1    1:areturn         
	}

	public JsonDeserializer modifyMapDeserializer(DeserializationConfig deserializationconfig, MapType maptype, BeanDescription beandescription, JsonDeserializer jsondeserializer)
	{
		return jsondeserializer;
	//    0    0:aload           4
	//    1    2:areturn         
	}

	public JsonDeserializer modifyMapLikeDeserializer(DeserializationConfig deserializationconfig, MapLikeType mapliketype, BeanDescription beandescription, JsonDeserializer jsondeserializer)
	{
		return jsondeserializer;
	//    0    0:aload           4
	//    1    2:areturn         
	}

	public JsonDeserializer modifyReferenceDeserializer(DeserializationConfig deserializationconfig, ReferenceType referencetype, BeanDescription beandescription, JsonDeserializer jsondeserializer)
	{
		return jsondeserializer;
	//    0    0:aload           4
	//    1    2:areturn         
	}

	public BeanDeserializerBuilder updateBuilder(DeserializationConfig deserializationconfig, BeanDescription beandescription, BeanDeserializerBuilder beandeserializerbuilder)
	{
		return beandeserializerbuilder;
	//    0    0:aload_3         
	//    1    1:areturn         
	}

	public List updateProperties(DeserializationConfig deserializationconfig, BeanDescription beandescription, List list)
	{
		return list;
	//    0    0:aload_3         
	//    1    1:areturn         
	}
}
