// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//			Serializers, BeanSerializerModifier

public abstract class SerializerFactory
{

	public SerializerFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public abstract JsonSerializer createKeySerializer(SerializationConfig serializationconfig, JavaType javatype, JsonSerializer jsonserializer)
		throws JsonMappingException;

	public abstract JsonSerializer createSerializer(SerializerProvider serializerprovider, JavaType javatype)
		throws JsonMappingException;

	public abstract TypeSerializer createTypeSerializer(SerializationConfig serializationconfig, JavaType javatype)
		throws JsonMappingException;

	public abstract SerializerFactory withAdditionalKeySerializers(Serializers serializers);

	public abstract SerializerFactory withAdditionalSerializers(Serializers serializers);

	public abstract SerializerFactory withSerializerModifier(BeanSerializerModifier beanserializermodifier);
}
