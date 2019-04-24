// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeModifier;

// Referenced classes of package com.fasterxml.jackson.databind:
//			ObjectMapper, DeserializationConfig, SerializationConfig, AbstractTypeResolver, 
//			AnnotationIntrospector, DeserializationFeature, MapperFeature, SerializationFeature, 
//			PropertyNamingStrategy

class ObjectMapper$1
	implements text
{

	public void addAbstractTypeResolver(AbstractTypeResolver abstracttyperesolver)
	{
		abstracttyperesolver = ((AbstractTypeResolver) (val$mapper._deserializationContext._factory.withAbstractTypeResolver(abstracttyperesolver)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
	//    2    4:getfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//    3    7:getfield        #36  <Field DeserializerFactory DefaultDeserializationContext._factory>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #42  <Method DeserializerFactory DeserializerFactory.withAbstractTypeResolver(AbstractTypeResolver)>
	//    6   14:astore_1        
		val$mapper._deserializationContext = val$mapper._deserializationContext.with(((DeserializerFactory) (abstracttyperesolver)));
	//    7   15:aload_0         
	//    8   16:getfield        #20  <Field ObjectMapper val$mapper>
	//    9   19:aload_0         
	//   10   20:getfield        #20  <Field ObjectMapper val$mapper>
	//   11   23:getfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #46  <Method DefaultDeserializationContext DefaultDeserializationContext.with(DeserializerFactory)>
	//   14   30:putfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//   15   33:return          
	}

	public void addBeanDeserializerModifier(BeanDeserializerModifier beandeserializermodifier)
	{
		beandeserializermodifier = ((BeanDeserializerModifier) (val$mapper._deserializationContext._factory.withDeserializerModifier(beandeserializermodifier)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
	//    2    4:getfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//    3    7:getfield        #36  <Field DeserializerFactory DefaultDeserializationContext._factory>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #52  <Method DeserializerFactory DeserializerFactory.withDeserializerModifier(BeanDeserializerModifier)>
	//    6   14:astore_1        
		val$mapper._deserializationContext = val$mapper._deserializationContext.with(((DeserializerFactory) (beandeserializermodifier)));
	//    7   15:aload_0         
	//    8   16:getfield        #20  <Field ObjectMapper val$mapper>
	//    9   19:aload_0         
	//   10   20:getfield        #20  <Field ObjectMapper val$mapper>
	//   11   23:getfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #46  <Method DefaultDeserializationContext DefaultDeserializationContext.with(DeserializerFactory)>
	//   14   30:putfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//   15   33:return          
	}

	public void addBeanSerializerModifier(BeanSerializerModifier beanserializermodifier)
	{
		val$mapper._serializerFactory = val$mapper._serializerFactory.withSerializerModifier(beanserializermodifier);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field ObjectMapper val$mapper>
	//    4    8:getfield        #58  <Field SerializerFactory ObjectMapper._serializerFactory>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #64  <Method SerializerFactory SerializerFactory.withSerializerModifier(BeanSerializerModifier)>
	//    7   15:putfield        #58  <Field SerializerFactory ObjectMapper._serializerFactory>
	//    8   18:return          
	}

	public void addDeserializationProblemHandler(DeserializationProblemHandler deserializationproblemhandler)
	{
		val$mapper.addHandler(deserializationproblemhandler);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #70  <Method ObjectMapper ObjectMapper.addHandler(DeserializationProblemHandler)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void addDeserializers(Deserializers deserializers)
	{
		deserializers = ((Deserializers) (val$mapper._deserializationContext._factory.withAdditionalDeserializers(deserializers)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
	//    2    4:getfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//    3    7:getfield        #36  <Field DeserializerFactory DefaultDeserializationContext._factory>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #76  <Method DeserializerFactory DeserializerFactory.withAdditionalDeserializers(Deserializers)>
	//    6   14:astore_1        
		val$mapper._deserializationContext = val$mapper._deserializationContext.with(((DeserializerFactory) (deserializers)));
	//    7   15:aload_0         
	//    8   16:getfield        #20  <Field ObjectMapper val$mapper>
	//    9   19:aload_0         
	//   10   20:getfield        #20  <Field ObjectMapper val$mapper>
	//   11   23:getfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #46  <Method DefaultDeserializationContext DefaultDeserializationContext.with(DeserializerFactory)>
	//   14   30:putfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//   15   33:return          
	}

	public void addKeyDeserializers(KeyDeserializers keydeserializers)
	{
		keydeserializers = ((KeyDeserializers) (val$mapper._deserializationContext._factory.withAdditionalKeyDeserializers(keydeserializers)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
	//    2    4:getfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//    3    7:getfield        #36  <Field DeserializerFactory DefaultDeserializationContext._factory>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #82  <Method DeserializerFactory DeserializerFactory.withAdditionalKeyDeserializers(KeyDeserializers)>
	//    6   14:astore_1        
		val$mapper._deserializationContext = val$mapper._deserializationContext.with(((DeserializerFactory) (keydeserializers)));
	//    7   15:aload_0         
	//    8   16:getfield        #20  <Field ObjectMapper val$mapper>
	//    9   19:aload_0         
	//   10   20:getfield        #20  <Field ObjectMapper val$mapper>
	//   11   23:getfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #46  <Method DefaultDeserializationContext DefaultDeserializationContext.with(DeserializerFactory)>
	//   14   30:putfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//   15   33:return          
	}

	public void addKeySerializers(Serializers serializers)
	{
		val$mapper._serializerFactory = val$mapper._serializerFactory.withAdditionalKeySerializers(serializers);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field ObjectMapper val$mapper>
	//    4    8:getfield        #58  <Field SerializerFactory ObjectMapper._serializerFactory>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #88  <Method SerializerFactory SerializerFactory.withAdditionalKeySerializers(Serializers)>
	//    7   15:putfield        #58  <Field SerializerFactory ObjectMapper._serializerFactory>
	//    8   18:return          
	}

	public void addSerializers(Serializers serializers)
	{
		val$mapper._serializerFactory = val$mapper._serializerFactory.withAdditionalSerializers(serializers);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field ObjectMapper val$mapper>
	//    4    8:getfield        #58  <Field SerializerFactory ObjectMapper._serializerFactory>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #92  <Method SerializerFactory SerializerFactory.withAdditionalSerializers(Serializers)>
	//    7   15:putfield        #58  <Field SerializerFactory ObjectMapper._serializerFactory>
	//    8   18:return          
	}

	public void addTypeModifier(TypeModifier typemodifier)
	{
		typemodifier = ((TypeModifier) (val$mapper._typeFactory.withModifier(typemodifier)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
	//    2    4:getfield        #98  <Field TypeFactory ObjectMapper._typeFactory>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #104 <Method TypeFactory TypeFactory.withModifier(TypeModifier)>
	//    5   11:astore_1        
		val$mapper.setTypeFactory(((TypeFactory) (typemodifier)));
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field ObjectMapper val$mapper>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #108 <Method ObjectMapper ObjectMapper.setTypeFactory(TypeFactory)>
	//   10   20:pop             
	//   11   21:return          
	}

	public void addValueInstantiators(ValueInstantiators valueinstantiators)
	{
		valueinstantiators = ((ValueInstantiators) (val$mapper._deserializationContext._factory.withValueInstantiators(valueinstantiators)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
	//    2    4:getfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//    3    7:getfield        #36  <Field DeserializerFactory DefaultDeserializationContext._factory>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #114 <Method DeserializerFactory DeserializerFactory.withValueInstantiators(ValueInstantiators)>
	//    6   14:astore_1        
		val$mapper._deserializationContext = val$mapper._deserializationContext.with(((DeserializerFactory) (valueinstantiators)));
	//    7   15:aload_0         
	//    8   16:getfield        #20  <Field ObjectMapper val$mapper>
	//    9   19:aload_0         
	//   10   20:getfield        #20  <Field ObjectMapper val$mapper>
	//   11   23:getfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #46  <Method DefaultDeserializationContext DefaultDeserializationContext.with(DeserializerFactory)>
	//   14   30:putfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//   15   33:return          
	}

	public void appendAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
	{
		val$mapper._deserializationConfig = val$mapper._deserializationConfig.withAppendedAnnotationIntrospector(annotationintrospector);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field ObjectMapper val$mapper>
	//    4    8:getfield        #120 <Field DeserializationConfig ObjectMapper._deserializationConfig>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #126 <Method DeserializationConfig DeserializationConfig.withAppendedAnnotationIntrospector(AnnotationIntrospector)>
	//    7   15:putfield        #120 <Field DeserializationConfig ObjectMapper._deserializationConfig>
		val$mapper._serializationConfig = val$mapper._serializationConfig.withAppendedAnnotationIntrospector(annotationintrospector);
	//    8   18:aload_0         
	//    9   19:getfield        #20  <Field ObjectMapper val$mapper>
	//   10   22:aload_0         
	//   11   23:getfield        #20  <Field ObjectMapper val$mapper>
	//   12   26:getfield        #130 <Field SerializationConfig ObjectMapper._serializationConfig>
	//   13   29:aload_1         
	//   14   30:invokevirtual   #135 <Method SerializationConfig SerializationConfig.withAppendedAnnotationIntrospector(AnnotationIntrospector)>
	//   15   33:putfield        #130 <Field SerializationConfig ObjectMapper._serializationConfig>
	//   16   36:return          
	}

	public Version getMapperVersion()
	{
		return version();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ObjectMapper this$0>
	//    2    4:invokevirtual   #140 <Method Version ObjectMapper.version()>
	//    3    7:areturn         
	}

	public ObjectCodec getOwner()
	{
		return ((ObjectCodec) (val$mapper));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
	//    2    4:areturn         
	}

	public TypeFactory getTypeFactory()
	{
		return _typeFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ObjectMapper this$0>
	//    2    4:getfield        #98  <Field TypeFactory ObjectMapper._typeFactory>
	//    3    7:areturn         
	}

	public void insertAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
	{
		val$mapper._deserializationConfig = val$mapper._deserializationConfig.withInsertedAnnotationIntrospector(annotationintrospector);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field ObjectMapper val$mapper>
	//    4    8:getfield        #120 <Field DeserializationConfig ObjectMapper._deserializationConfig>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #150 <Method DeserializationConfig DeserializationConfig.withInsertedAnnotationIntrospector(AnnotationIntrospector)>
	//    7   15:putfield        #120 <Field DeserializationConfig ObjectMapper._deserializationConfig>
		val$mapper._serializationConfig = val$mapper._serializationConfig.withInsertedAnnotationIntrospector(annotationintrospector);
	//    8   18:aload_0         
	//    9   19:getfield        #20  <Field ObjectMapper val$mapper>
	//   10   22:aload_0         
	//   11   23:getfield        #20  <Field ObjectMapper val$mapper>
	//   12   26:getfield        #130 <Field SerializationConfig ObjectMapper._serializationConfig>
	//   13   29:aload_1         
	//   14   30:invokevirtual   #152 <Method SerializationConfig SerializationConfig.withInsertedAnnotationIntrospector(AnnotationIntrospector)>
	//   15   33:putfield        #130 <Field SerializationConfig ObjectMapper._serializationConfig>
	//   16   36:return          
	}

	public boolean isEnabled(com.fasterxml.jackson.core.ture ture)
	{
		return val$mapper.isEnabled(ture);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #156 <Method boolean ObjectMapper.isEnabled(com.fasterxml.jackson.core.JsonFactory$Feature)>
	//    4    8:ireturn         
	}

	public boolean isEnabled(com.fasterxml.jackson.core.eature eature)
	{
		return val$mapper.isEnabled(eature);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #159 <Method boolean ObjectMapper.isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//    4    8:ireturn         
	}

	public boolean isEnabled(com.fasterxml.jackson.core.ure ure)
	{
		return val$mapper.isEnabled(ure);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #162 <Method boolean ObjectMapper.isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//    4    8:ireturn         
	}

	public boolean isEnabled(DeserializationFeature deserializationfeature)
	{
		return val$mapper.isEnabled(deserializationfeature);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #165 <Method boolean ObjectMapper.isEnabled(DeserializationFeature)>
	//    4    8:ireturn         
	}

	public boolean isEnabled(MapperFeature mapperfeature)
	{
		return val$mapper.isEnabled(mapperfeature);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #168 <Method boolean ObjectMapper.isEnabled(MapperFeature)>
	//    4    8:ireturn         
	}

	public boolean isEnabled(SerializationFeature serializationfeature)
	{
		return val$mapper.isEnabled(serializationfeature);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #171 <Method boolean ObjectMapper.isEnabled(SerializationFeature)>
	//    4    8:ireturn         
	}

	public transient void registerSubtypes(NamedType anamedtype[])
	{
		val$mapper.registerSubtypes(anamedtype);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #175 <Method void ObjectMapper.registerSubtypes(NamedType[])>
	//    4    8:return          
	}

	public transient void registerSubtypes(Class aclass[])
	{
		val$mapper.registerSubtypes(aclass);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #178 <Method void ObjectMapper.registerSubtypes(Class[])>
	//    4    8:return          
	}

	public void setClassIntrospector(ClassIntrospector classintrospector)
	{
		val$mapper._deserializationConfig = val$mapper._deserializationConfig.with(classintrospector);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field ObjectMapper val$mapper>
	//    4    8:getfield        #120 <Field DeserializationConfig ObjectMapper._deserializationConfig>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #184 <Method DeserializationConfig DeserializationConfig.with(ClassIntrospector)>
	//    7   15:putfield        #120 <Field DeserializationConfig ObjectMapper._deserializationConfig>
		val$mapper._serializationConfig = val$mapper._serializationConfig.with(classintrospector);
	//    8   18:aload_0         
	//    9   19:getfield        #20  <Field ObjectMapper val$mapper>
	//   10   22:aload_0         
	//   11   23:getfield        #20  <Field ObjectMapper val$mapper>
	//   12   26:getfield        #130 <Field SerializationConfig ObjectMapper._serializationConfig>
	//   13   29:aload_1         
	//   14   30:invokevirtual   #187 <Method SerializationConfig SerializationConfig.with(ClassIntrospector)>
	//   15   33:putfield        #130 <Field SerializationConfig ObjectMapper._serializationConfig>
	//   16   36:return          
	}

	public void setMixInAnnotations(Class class1, Class class2)
	{
		val$mapper.addMixIn(class1, class2);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #193 <Method ObjectMapper ObjectMapper.addMixIn(Class, Class)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void setNamingStrategy(PropertyNamingStrategy propertynamingstrategy)
	{
		val$mapper.setPropertyNamingStrategy(propertynamingstrategy);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #200 <Method ObjectMapper ObjectMapper.setPropertyNamingStrategy(PropertyNamingStrategy)>
	//    4    8:pop             
	//    5    9:return          
	}

	final ObjectMapper this$0;
	final ObjectMapper val$mapper;

	ObjectMapper$1()
	{
		this$0 = final_objectmapper;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ObjectMapper this$0>
		val$mapper = ObjectMapper.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field ObjectMapper val$mapper>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
