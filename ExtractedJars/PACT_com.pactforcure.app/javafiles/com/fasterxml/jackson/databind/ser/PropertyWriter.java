// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.Serializable;
import java.lang.annotation.Annotation;

public abstract class PropertyWriter extends ConcreteBeanPropertyBase
	implements Serializable
{

	protected PropertyWriter(PropertyMetadata propertymetadata)
	{
		super(propertymetadata);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void ConcreteBeanPropertyBase(PropertyMetadata)>
	//    3    5:return          
	}

	protected PropertyWriter(BeanPropertyDefinition beanpropertydefinition)
	{
		super(beanpropertydefinition.getMetadata());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #22  <Method PropertyMetadata BeanPropertyDefinition.getMetadata()>
	//    3    5:invokespecial   #14  <Method void ConcreteBeanPropertyBase(PropertyMetadata)>
	//    4    8:return          
	}

	protected PropertyWriter(PropertyWriter propertywriter)
	{
		super(((ConcreteBeanPropertyBase) (propertywriter)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void ConcreteBeanPropertyBase(ConcreteBeanPropertyBase)>
	//    3    5:return          
	}

	public abstract void depositSchemaProperty(JsonObjectFormatVisitor jsonobjectformatvisitor, SerializerProvider serializerprovider)
		throws JsonMappingException;

	public abstract void depositSchemaProperty(ObjectNode objectnode, SerializerProvider serializerprovider)
		throws JsonMappingException;

	public Annotation findAnnotation(Class class1)
	{
		Annotation annotation1 = getAnnotation(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #37  <Method Annotation getAnnotation(Class)>
	//    3    5:astore_3        
		Annotation annotation = annotation1;
	//    4    6:aload_3         
	//    5    7:astore_2        
		if(annotation1 == null)
	//*   6    8:aload_3         
	//*   7    9:ifnonnull       18
			annotation = getContextAnnotation(class1);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokevirtual   #40  <Method Annotation getContextAnnotation(Class)>
	//   11   17:astore_2        
		return annotation;
	//   12   18:aload_2         
	//   13   19:areturn         
	}

	public abstract Annotation getAnnotation(Class class1);

	public abstract Annotation getContextAnnotation(Class class1);

	public abstract PropertyName getFullName();

	public abstract String getName();

	public abstract void serializeAsElement(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception;

	public abstract void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception;

	public abstract void serializeAsOmittedField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception;

	public abstract void serializeAsPlaceholder(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception;

	private static final long serialVersionUID = 1L;
}
