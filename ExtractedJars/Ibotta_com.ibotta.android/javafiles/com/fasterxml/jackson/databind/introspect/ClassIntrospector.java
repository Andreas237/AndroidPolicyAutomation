// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;

public abstract class ClassIntrospector
{
	public static interface MixInResolver
	{

		public abstract MixInResolver copy();

		public abstract Class findMixInClassFor(Class class1);
	}


	protected ClassIntrospector()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public abstract BeanDescription forClassAnnotations(MapperConfig mapperconfig, JavaType javatype, MixInResolver mixinresolver);

	public abstract BeanDescription forCreation(DeserializationConfig deserializationconfig, JavaType javatype, MixInResolver mixinresolver);

	public abstract BeanDescription forDeserialization(DeserializationConfig deserializationconfig, JavaType javatype, MixInResolver mixinresolver);

	public abstract BeanDescription forDeserializationWithBuilder(DeserializationConfig deserializationconfig, JavaType javatype, MixInResolver mixinresolver);

	public abstract BeanDescription forSerialization(SerializationConfig serializationconfig, JavaType javatype, MixInResolver mixinresolver);
}
