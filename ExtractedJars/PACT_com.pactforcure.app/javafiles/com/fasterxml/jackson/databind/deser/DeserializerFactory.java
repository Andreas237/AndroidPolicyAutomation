// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.*;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//			Deserializers, ValueInstantiator, KeyDeserializers, BeanDeserializerModifier, 
//			ValueInstantiators

public abstract class DeserializerFactory
{

	public DeserializerFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public abstract JsonDeserializer createArrayDeserializer(DeserializationContext deserializationcontext, ArrayType arraytype, BeanDescription beandescription)
		throws JsonMappingException;

	public abstract JsonDeserializer createBeanDeserializer(DeserializationContext deserializationcontext, JavaType javatype, BeanDescription beandescription)
		throws JsonMappingException;

	public abstract JsonDeserializer createBuilderBasedDeserializer(DeserializationContext deserializationcontext, JavaType javatype, BeanDescription beandescription, Class class1)
		throws JsonMappingException;

	public abstract JsonDeserializer createCollectionDeserializer(DeserializationContext deserializationcontext, CollectionType collectiontype, BeanDescription beandescription)
		throws JsonMappingException;

	public abstract JsonDeserializer createCollectionLikeDeserializer(DeserializationContext deserializationcontext, CollectionLikeType collectionliketype, BeanDescription beandescription)
		throws JsonMappingException;

	public abstract JsonDeserializer createEnumDeserializer(DeserializationContext deserializationcontext, JavaType javatype, BeanDescription beandescription)
		throws JsonMappingException;

	public abstract KeyDeserializer createKeyDeserializer(DeserializationContext deserializationcontext, JavaType javatype)
		throws JsonMappingException;

	public abstract JsonDeserializer createMapDeserializer(DeserializationContext deserializationcontext, MapType maptype, BeanDescription beandescription)
		throws JsonMappingException;

	public abstract JsonDeserializer createMapLikeDeserializer(DeserializationContext deserializationcontext, MapLikeType mapliketype, BeanDescription beandescription)
		throws JsonMappingException;

	public abstract JsonDeserializer createReferenceDeserializer(DeserializationContext deserializationcontext, ReferenceType referencetype, BeanDescription beandescription)
		throws JsonMappingException;

	public abstract JsonDeserializer createTreeDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, BeanDescription beandescription)
		throws JsonMappingException;

	public abstract TypeDeserializer findTypeDeserializer(DeserializationConfig deserializationconfig, JavaType javatype)
		throws JsonMappingException;

	public abstract ValueInstantiator findValueInstantiator(DeserializationContext deserializationcontext, BeanDescription beandescription)
		throws JsonMappingException;

	public abstract JavaType mapAbstractType(DeserializationConfig deserializationconfig, JavaType javatype)
		throws JsonMappingException;

	public abstract DeserializerFactory withAbstractTypeResolver(AbstractTypeResolver abstracttyperesolver);

	public abstract DeserializerFactory withAdditionalDeserializers(Deserializers deserializers);

	public abstract DeserializerFactory withAdditionalKeyDeserializers(KeyDeserializers keydeserializers);

	public abstract DeserializerFactory withDeserializerModifier(BeanDeserializerModifier beandeserializermodifier);

	public abstract DeserializerFactory withValueInstantiators(ValueInstantiators valueinstantiators);

	protected static final Deserializers NO_DESERIALIZERS[] = new Deserializers[0];

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       Deserializers[]
	//    2    4:putstatic       #12  <Field Deserializers[] NO_DESERIALIZERS>
	//*   3    7:return          
	}
}
