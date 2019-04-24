// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.util.Converter;

// Referenced classes of package com.fasterxml.jackson.databind.cfg:
//			MapperConfig

public abstract class HandlerInstantiator
{

	public HandlerInstantiator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public Converter converterInstance(MapperConfig mapperconfig, Annotated annotated, Class class1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public abstract JsonDeserializer deserializerInstance(DeserializationConfig deserializationconfig, Annotated annotated, Class class1);

	public abstract KeyDeserializer keyDeserializerInstance(DeserializationConfig deserializationconfig, Annotated annotated, Class class1);

	public PropertyNamingStrategy namingStrategyInstance(MapperConfig mapperconfig, Annotated annotated, Class class1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public ObjectIdGenerator objectIdGeneratorInstance(MapperConfig mapperconfig, Annotated annotated, Class class1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public ObjectIdResolver resolverIdGeneratorInstance(MapperConfig mapperconfig, Annotated annotated, Class class1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public abstract JsonSerializer serializerInstance(SerializationConfig serializationconfig, Annotated annotated, Class class1);

	public abstract TypeIdResolver typeIdResolverInstance(MapperConfig mapperconfig, Annotated annotated, Class class1);

	public abstract TypeResolverBuilder typeResolverBuilderInstance(MapperConfig mapperconfig, Annotated annotated, Class class1);

	public ValueInstantiator valueInstantiatorInstance(MapperConfig mapperconfig, Annotated annotated, Class class1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public VirtualBeanPropertyWriter virtualPropertyWriterInstance(MapperConfig mapperconfig, Class class1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}
}
