// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeModifier;
import java.util.Collection;

// Referenced classes of package com.fasterxml.jackson.databind:
//			AbstractTypeResolver, AnnotationIntrospector, DeserializationFeature, MapperFeature, 
//			SerializationFeature, PropertyNamingStrategy

public abstract class Module
	implements Versioned
{
	public static interface SetupContext
	{

		public abstract void addAbstractTypeResolver(AbstractTypeResolver abstracttyperesolver);

		public abstract void addBeanDeserializerModifier(BeanDeserializerModifier beandeserializermodifier);

		public abstract void addBeanSerializerModifier(BeanSerializerModifier beanserializermodifier);

		public abstract void addDeserializationProblemHandler(DeserializationProblemHandler deserializationproblemhandler);

		public abstract void addDeserializers(Deserializers deserializers);

		public abstract void addKeyDeserializers(KeyDeserializers keydeserializers);

		public abstract void addKeySerializers(Serializers serializers);

		public abstract void addSerializers(Serializers serializers);

		public abstract void addTypeModifier(TypeModifier typemodifier);

		public abstract void addValueInstantiators(ValueInstantiators valueinstantiators);

		public abstract void appendAnnotationIntrospector(AnnotationIntrospector annotationintrospector);

		public abstract MutableConfigOverride configOverride(Class class1);

		public abstract Version getMapperVersion();

		public abstract ObjectCodec getOwner();

		public abstract TypeFactory getTypeFactory();

		public abstract void insertAnnotationIntrospector(AnnotationIntrospector annotationintrospector);

		public abstract boolean isEnabled(com.fasterxml.jackson.core.JsonFactory.Feature feature);

		public abstract boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature feature);

		public abstract boolean isEnabled(com.fasterxml.jackson.core.JsonParser.Feature feature);

		public abstract boolean isEnabled(DeserializationFeature deserializationfeature);

		public abstract boolean isEnabled(MapperFeature mapperfeature);

		public abstract boolean isEnabled(SerializationFeature serializationfeature);

		public abstract void registerSubtypes(Collection collection);

		public transient abstract void registerSubtypes(NamedType anamedtype[]);

		public transient abstract void registerSubtypes(Class aclass[]);

		public abstract void setClassIntrospector(ClassIntrospector classintrospector);

		public abstract void setMixInAnnotations(Class class1, Class class2);

		public abstract void setNamingStrategy(PropertyNamingStrategy propertynamingstrategy);
	}


	public Module()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public abstract String getModuleName();

	public Object getTypeId()
	{
		return ((Object) (((Object)this).getClass().getName()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #27  <Method String Class.getName()>
	//    3    7:areturn         
	}

	public abstract void setupModule(SetupContext setupcontext);

	public abstract Version version();
}
