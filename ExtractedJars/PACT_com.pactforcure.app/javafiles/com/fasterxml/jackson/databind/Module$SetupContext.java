// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
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

// Referenced classes of package com.fasterxml.jackson.databind:
//			Module, AbstractTypeResolver, AnnotationIntrospector, DeserializationFeature, 
//			MapperFeature, SerializationFeature, PropertyNamingStrategy

public static interface Module$SetupContext
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

	public abstract Version getMapperVersion();

	public abstract ObjectCodec getOwner();

	public abstract TypeFactory getTypeFactory();

	public abstract void insertAnnotationIntrospector(AnnotationIntrospector annotationintrospector);

	public abstract boolean isEnabled(com.fasterxml.jackson.core.JsonFactory$Feature jsonfactory$feature);

	public abstract boolean isEnabled(com.fasterxml.jackson.core.e e);

	public abstract boolean isEnabled(com.fasterxml.jackson.core.JsonParser.Feature feature);

	public abstract boolean isEnabled(DeserializationFeature deserializationfeature);

	public abstract boolean isEnabled(MapperFeature mapperfeature);

	public abstract boolean isEnabled(SerializationFeature serializationfeature);

	public transient abstract void registerSubtypes(NamedType anamedtype[]);

	public transient abstract void registerSubtypes(Class aclass[]);

	public abstract void setClassIntrospector(ClassIntrospector classintrospector);

	public abstract void setMixInAnnotations(Class class1, Class class2);

	public abstract void setNamingStrategy(PropertyNamingStrategy propertynamingstrategy);
}
