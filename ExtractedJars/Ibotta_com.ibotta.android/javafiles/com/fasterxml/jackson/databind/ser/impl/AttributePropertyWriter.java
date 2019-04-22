// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.util.Annotations;

public class AttributePropertyWriter extends VirtualBeanPropertyWriter
{

	protected AttributePropertyWriter(String s, BeanPropertyDefinition beanpropertydefinition, Annotations annotations, JavaType javatype)
	{
		this(s, beanpropertydefinition, annotations, javatype, beanpropertydefinition.findInclusion());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload_2         
	//    6    7:invokevirtual   #18  <Method com.fasterxml.jackson.annotation.JsonInclude$Value BeanPropertyDefinition.findInclusion()>
	//    7   10:invokespecial   #21  <Method void AttributePropertyWriter(String, BeanPropertyDefinition, Annotations, JavaType, com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//    8   13:return          
	}

	protected AttributePropertyWriter(String s, BeanPropertyDefinition beanpropertydefinition, Annotations annotations, JavaType javatype, com.fasterxml.jackson.annotation.JsonInclude.Value value1)
	{
		super(beanpropertydefinition, annotations, javatype, ((com.fasterxml.jackson.databind.JsonSerializer) (null)), ((com.fasterxml.jackson.databind.jsontype.TypeSerializer) (null)), ((JavaType) (null)), value1, ((Class []) (null)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:aconst_null     
	//    5    6:aconst_null     
	//    6    7:aconst_null     
	//    7    8:aload           5
	//    8   10:aconst_null     
	//    9   11:invokespecial   #25  <Method void VirtualBeanPropertyWriter(BeanPropertyDefinition, Annotations, JavaType, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer, JavaType, com.fasterxml.jackson.annotation.JsonInclude$Value, Class[])>
		_attrName = s;
	//   10   14:aload_0         
	//   11   15:aload_1         
	//   12   16:putfield        #27  <Field String _attrName>
	//   13   19:return          
	}

	public static AttributePropertyWriter construct(String s, BeanPropertyDefinition beanpropertydefinition, Annotations annotations, JavaType javatype)
	{
		return new AttributePropertyWriter(s, beanpropertydefinition, annotations, javatype);
	//    0    0:new             #2   <Class AttributePropertyWriter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #31  <Method void AttributePropertyWriter(String, BeanPropertyDefinition, Annotations, JavaType)>
	//    7   11:areturn         
	}

	protected Object value(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception
	{
		return serializerprovider.getAttribute(((Object) (_attrName)));
	//    0    0:aload_3         
	//    1    1:aload_0         
	//    2    2:getfield        #27  <Field String _attrName>
	//    3    5:invokevirtual   #41  <Method Object SerializerProvider.getAttribute(Object)>
	//    4    8:areturn         
	}

	public VirtualBeanPropertyWriter withConfig(MapperConfig mapperconfig, AnnotatedClass annotatedclass, BeanPropertyDefinition beanpropertydefinition, JavaType javatype)
	{
		throw new IllegalStateException("Should not be called on this type");
	//    0    0:new             #46  <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #48  <String "Should not be called on this type">
	//    3    6:invokespecial   #51  <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	private static final long serialVersionUID = 1L;
	protected final String _attrName;
}
