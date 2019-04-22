// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;
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
import java.util.Collection;

// Referenced classes of package com.fasterxml.jackson.databind:
//			ObjectMapper, DeserializationConfig, SerializationConfig, AbstractTypeResolver, 
//			AnnotationIntrospector, DeserializationFeature, MapperFeature, SerializationFeature, 
//			PropertyNamingStrategy

class ObjectMapper$1
	implements text
{

	public void addAbstractTypeResolver(AbstractTypeResolver abstracttyperesolver)
	{
		abstracttyperesolver = ((AbstractTypeResolver) (_deserializationContext._factory.withAbstractTypeResolver(abstracttyperesolver)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:getfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//    3    7:getfield        #33  <Field DeserializerFactory DefaultDeserializationContext._factory>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #39  <Method DeserializerFactory DeserializerFactory.withAbstractTypeResolver(AbstractTypeResolver)>
	//    6   14:astore_1        
		ObjectMapper objectmapper = ObjectMapper.this;
	//    7   15:aload_0         
	//    8   16:getfield        #17  <Field ObjectMapper this$0>
	//    9   19:astore_2        
		objectmapper._deserializationContext = objectmapper._deserializationContext.with(((DeserializerFactory) (abstracttyperesolver)));
	//   10   20:aload_2         
	//   11   21:aload_2         
	//   12   22:getfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #43  <Method DefaultDeserializationContext DefaultDeserializationContext.with(DeserializerFactory)>
	//   15   29:putfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//   16   32:return          
	}

	public void addBeanDeserializerModifier(BeanDeserializerModifier beandeserializermodifier)
	{
		beandeserializermodifier = ((BeanDeserializerModifier) (_deserializationContext._factory.withDeserializerModifier(beandeserializermodifier)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:getfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//    3    7:getfield        #33  <Field DeserializerFactory DefaultDeserializationContext._factory>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #49  <Method DeserializerFactory DeserializerFactory.withDeserializerModifier(BeanDeserializerModifier)>
	//    6   14:astore_1        
		ObjectMapper objectmapper = ObjectMapper.this;
	//    7   15:aload_0         
	//    8   16:getfield        #17  <Field ObjectMapper this$0>
	//    9   19:astore_2        
		objectmapper._deserializationContext = objectmapper._deserializationContext.with(((DeserializerFactory) (beandeserializermodifier)));
	//   10   20:aload_2         
	//   11   21:aload_2         
	//   12   22:getfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #43  <Method DefaultDeserializationContext DefaultDeserializationContext.with(DeserializerFactory)>
	//   15   29:putfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//   16   32:return          
	}

	public void addBeanSerializerModifier(BeanSerializerModifier beanserializermodifier)
	{
		ObjectMapper objectmapper = ObjectMapper.this;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:astore_2        
		objectmapper._serializerFactory = objectmapper._serializerFactory.withSerializerModifier(beanserializermodifier);
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:getfield        #55  <Field SerializerFactory ObjectMapper._serializerFactory>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #61  <Method SerializerFactory SerializerFactory.withSerializerModifier(BeanSerializerModifier)>
	//    8   14:putfield        #55  <Field SerializerFactory ObjectMapper._serializerFactory>
	//    9   17:return          
	}

	public void addDeserializationProblemHandler(DeserializationProblemHandler deserializationproblemhandler)
	{
		addHandler(deserializationproblemhandler);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #67  <Method ObjectMapper ObjectMapper.addHandler(DeserializationProblemHandler)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void addDeserializers(Deserializers deserializers)
	{
		deserializers = ((Deserializers) (_deserializationContext._factory.withAdditionalDeserializers(deserializers)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:getfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//    3    7:getfield        #33  <Field DeserializerFactory DefaultDeserializationContext._factory>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #73  <Method DeserializerFactory DeserializerFactory.withAdditionalDeserializers(Deserializers)>
	//    6   14:astore_1        
		ObjectMapper objectmapper = ObjectMapper.this;
	//    7   15:aload_0         
	//    8   16:getfield        #17  <Field ObjectMapper this$0>
	//    9   19:astore_2        
		objectmapper._deserializationContext = objectmapper._deserializationContext.with(((DeserializerFactory) (deserializers)));
	//   10   20:aload_2         
	//   11   21:aload_2         
	//   12   22:getfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #43  <Method DefaultDeserializationContext DefaultDeserializationContext.with(DeserializerFactory)>
	//   15   29:putfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//   16   32:return          
	}

	public void addKeyDeserializers(KeyDeserializers keydeserializers)
	{
		keydeserializers = ((KeyDeserializers) (_deserializationContext._factory.withAdditionalKeyDeserializers(keydeserializers)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:getfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//    3    7:getfield        #33  <Field DeserializerFactory DefaultDeserializationContext._factory>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #79  <Method DeserializerFactory DeserializerFactory.withAdditionalKeyDeserializers(KeyDeserializers)>
	//    6   14:astore_1        
		ObjectMapper objectmapper = ObjectMapper.this;
	//    7   15:aload_0         
	//    8   16:getfield        #17  <Field ObjectMapper this$0>
	//    9   19:astore_2        
		objectmapper._deserializationContext = objectmapper._deserializationContext.with(((DeserializerFactory) (keydeserializers)));
	//   10   20:aload_2         
	//   11   21:aload_2         
	//   12   22:getfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #43  <Method DefaultDeserializationContext DefaultDeserializationContext.with(DeserializerFactory)>
	//   15   29:putfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//   16   32:return          
	}

	public void addKeySerializers(Serializers serializers)
	{
		ObjectMapper objectmapper = ObjectMapper.this;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:astore_2        
		objectmapper._serializerFactory = objectmapper._serializerFactory.withAdditionalKeySerializers(serializers);
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:getfield        #55  <Field SerializerFactory ObjectMapper._serializerFactory>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #85  <Method SerializerFactory SerializerFactory.withAdditionalKeySerializers(Serializers)>
	//    8   14:putfield        #55  <Field SerializerFactory ObjectMapper._serializerFactory>
	//    9   17:return          
	}

	public void addSerializers(Serializers serializers)
	{
		ObjectMapper objectmapper = ObjectMapper.this;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:astore_2        
		objectmapper._serializerFactory = objectmapper._serializerFactory.withAdditionalSerializers(serializers);
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:getfield        #55  <Field SerializerFactory ObjectMapper._serializerFactory>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #89  <Method SerializerFactory SerializerFactory.withAdditionalSerializers(Serializers)>
	//    8   14:putfield        #55  <Field SerializerFactory ObjectMapper._serializerFactory>
	//    9   17:return          
	}

	public void addTypeModifier(TypeModifier typemodifier)
	{
		typemodifier = ((TypeModifier) (_typeFactory.withModifier(typemodifier)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:getfield        #95  <Field TypeFactory ObjectMapper._typeFactory>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #101 <Method TypeFactory TypeFactory.withModifier(TypeModifier)>
	//    5   11:astore_1        
		setTypeFactory(((TypeFactory) (typemodifier)));
	//    6   12:aload_0         
	//    7   13:getfield        #17  <Field ObjectMapper this$0>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #105 <Method ObjectMapper ObjectMapper.setTypeFactory(TypeFactory)>
	//   10   20:pop             
	//   11   21:return          
	}

	public void addValueInstantiators(ValueInstantiators valueinstantiators)
	{
		valueinstantiators = ((ValueInstantiators) (_deserializationContext._factory.withValueInstantiators(valueinstantiators)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:getfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//    3    7:getfield        #33  <Field DeserializerFactory DefaultDeserializationContext._factory>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #111 <Method DeserializerFactory DeserializerFactory.withValueInstantiators(ValueInstantiators)>
	//    6   14:astore_1        
		ObjectMapper objectmapper = ObjectMapper.this;
	//    7   15:aload_0         
	//    8   16:getfield        #17  <Field ObjectMapper this$0>
	//    9   19:astore_2        
		objectmapper._deserializationContext = objectmapper._deserializationContext.with(((DeserializerFactory) (valueinstantiators)));
	//   10   20:aload_2         
	//   11   21:aload_2         
	//   12   22:getfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #43  <Method DefaultDeserializationContext DefaultDeserializationContext.with(DeserializerFactory)>
	//   15   29:putfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
	//   16   32:return          
	}

	public void appendAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
	{
		ObjectMapper objectmapper = ObjectMapper.this;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:astore_2        
		objectmapper._deserializationConfig = (DeserializationConfig)objectmapper._deserializationConfig.withAppendedAnnotationIntrospector(annotationintrospector);
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:getfield        #117 <Field DeserializationConfig ObjectMapper._deserializationConfig>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #123 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase DeserializationConfig.withAppendedAnnotationIntrospector(AnnotationIntrospector)>
	//    8   14:checkcast       #119 <Class DeserializationConfig>
	//    9   17:putfield        #117 <Field DeserializationConfig ObjectMapper._deserializationConfig>
		objectmapper = ObjectMapper.this;
	//   10   20:aload_0         
	//   11   21:getfield        #17  <Field ObjectMapper this$0>
	//   12   24:astore_2        
		objectmapper._serializationConfig = (SerializationConfig)objectmapper._serializationConfig.withAppendedAnnotationIntrospector(annotationintrospector);
	//   13   25:aload_2         
	//   14   26:aload_2         
	//   15   27:getfield        #127 <Field SerializationConfig ObjectMapper._serializationConfig>
	//   16   30:aload_1         
	//   17   31:invokevirtual   #130 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase SerializationConfig.withAppendedAnnotationIntrospector(AnnotationIntrospector)>
	//   18   34:checkcast       #129 <Class SerializationConfig>
	//   19   37:putfield        #127 <Field SerializationConfig ObjectMapper._serializationConfig>
	//   20   40:return          
	}

	public MutableConfigOverride configOverride(Class class1)
	{
		return ObjectMapper.this.configOverride(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #134 <Method MutableConfigOverride ObjectMapper.configOverride(Class)>
	//    4    8:areturn         
	}

	public Version getMapperVersion()
	{
		return version();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:invokevirtual   #141 <Method Version ObjectMapper.version()>
	//    3    7:areturn         
	}

	public ObjectCodec getOwner()
	{
		return ((ObjectCodec) (ObjectMapper.this));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:areturn         
	}

	public TypeFactory getTypeFactory()
	{
		return _typeFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:getfield        #95  <Field TypeFactory ObjectMapper._typeFactory>
	//    3    7:areturn         
	}

	public void insertAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
	{
		ObjectMapper objectmapper = ObjectMapper.this;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:astore_2        
		objectmapper._deserializationConfig = (DeserializationConfig)objectmapper._deserializationConfig.withInsertedAnnotationIntrospector(annotationintrospector);
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:getfield        #117 <Field DeserializationConfig ObjectMapper._deserializationConfig>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #150 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase DeserializationConfig.withInsertedAnnotationIntrospector(AnnotationIntrospector)>
	//    8   14:checkcast       #119 <Class DeserializationConfig>
	//    9   17:putfield        #117 <Field DeserializationConfig ObjectMapper._deserializationConfig>
		objectmapper = ObjectMapper.this;
	//   10   20:aload_0         
	//   11   21:getfield        #17  <Field ObjectMapper this$0>
	//   12   24:astore_2        
		objectmapper._serializationConfig = (SerializationConfig)objectmapper._serializationConfig.withInsertedAnnotationIntrospector(annotationintrospector);
	//   13   25:aload_2         
	//   14   26:aload_2         
	//   15   27:getfield        #127 <Field SerializationConfig ObjectMapper._serializationConfig>
	//   16   30:aload_1         
	//   17   31:invokevirtual   #151 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase SerializationConfig.withInsertedAnnotationIntrospector(AnnotationIntrospector)>
	//   18   34:checkcast       #129 <Class SerializationConfig>
	//   19   37:putfield        #127 <Field SerializationConfig ObjectMapper._serializationConfig>
	//   20   40:return          
	}

	public boolean isEnabled(com.fasterxml.jackson.core.ture ture)
	{
		return ObjectMapper.this.isEnabled(ture);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #155 <Method boolean ObjectMapper.isEnabled(com.fasterxml.jackson.core.JsonFactory$Feature)>
	//    4    8:ireturn         
	}

	public boolean isEnabled(com.fasterxml.jackson.core.eature eature)
	{
		return ObjectMapper.this.isEnabled(eature);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #158 <Method boolean ObjectMapper.isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//    4    8:ireturn         
	}

	public boolean isEnabled(com.fasterxml.jackson.core.ure ure)
	{
		return ObjectMapper.this.isEnabled(ure);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #161 <Method boolean ObjectMapper.isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//    4    8:ireturn         
	}

	public boolean isEnabled(DeserializationFeature deserializationfeature)
	{
		return ObjectMapper.this.isEnabled(deserializationfeature);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #164 <Method boolean ObjectMapper.isEnabled(DeserializationFeature)>
	//    4    8:ireturn         
	}

	public boolean isEnabled(MapperFeature mapperfeature)
	{
		return ObjectMapper.this.isEnabled(mapperfeature);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #167 <Method boolean ObjectMapper.isEnabled(MapperFeature)>
	//    4    8:ireturn         
	}

	public boolean isEnabled(SerializationFeature serializationfeature)
	{
		return ObjectMapper.this.isEnabled(serializationfeature);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #170 <Method boolean ObjectMapper.isEnabled(SerializationFeature)>
	//    4    8:ireturn         
	}

	public void registerSubtypes(Collection collection)
	{
		ObjectMapper.this.registerSubtypes(collection);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #174 <Method void ObjectMapper.registerSubtypes(Collection)>
	//    4    8:return          
	}

	public transient void registerSubtypes(NamedType anamedtype[])
	{
		ObjectMapper.this.registerSubtypes(anamedtype);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #178 <Method void ObjectMapper.registerSubtypes(NamedType[])>
	//    4    8:return          
	}

	public transient void registerSubtypes(Class aclass[])
	{
		ObjectMapper.this.registerSubtypes(aclass);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #181 <Method void ObjectMapper.registerSubtypes(Class[])>
	//    4    8:return          
	}

	public void setClassIntrospector(ClassIntrospector classintrospector)
	{
		ObjectMapper objectmapper = ObjectMapper.this;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:astore_2        
		objectmapper._deserializationConfig = (DeserializationConfig)objectmapper._deserializationConfig.with(classintrospector);
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:getfield        #117 <Field DeserializationConfig ObjectMapper._deserializationConfig>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #187 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase DeserializationConfig.with(ClassIntrospector)>
	//    8   14:checkcast       #119 <Class DeserializationConfig>
	//    9   17:putfield        #117 <Field DeserializationConfig ObjectMapper._deserializationConfig>
		objectmapper = ObjectMapper.this;
	//   10   20:aload_0         
	//   11   21:getfield        #17  <Field ObjectMapper this$0>
	//   12   24:astore_2        
		objectmapper._serializationConfig = (SerializationConfig)objectmapper._serializationConfig.with(classintrospector);
	//   13   25:aload_2         
	//   14   26:aload_2         
	//   15   27:getfield        #127 <Field SerializationConfig ObjectMapper._serializationConfig>
	//   16   30:aload_1         
	//   17   31:invokevirtual   #188 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase SerializationConfig.with(ClassIntrospector)>
	//   18   34:checkcast       #129 <Class SerializationConfig>
	//   19   37:putfield        #127 <Field SerializationConfig ObjectMapper._serializationConfig>
	//   20   40:return          
	}

	public void setMixInAnnotations(Class class1, Class class2)
	{
		addMixIn(class1, class2);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #194 <Method ObjectMapper ObjectMapper.addMixIn(Class, Class)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void setNamingStrategy(PropertyNamingStrategy propertynamingstrategy)
	{
		setPropertyNamingStrategy(propertynamingstrategy);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ObjectMapper this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #201 <Method ObjectMapper ObjectMapper.setPropertyNamingStrategy(PropertyNamingStrategy)>
	//    4    8:pop             
	//    5    9:return          
	}

	final ObjectMapper this$0;

	ObjectMapper$1()
	{
		this$0 = ObjectMapper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ObjectMapper this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
