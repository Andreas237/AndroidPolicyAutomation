// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind:
//			BeanProperty, JsonMappingException, PropertyName, PropertyMetadata, 
//			SerializerProvider, AnnotationIntrospector, JavaType

public static class BeanProperty$Bogus
	implements BeanProperty
{

	public void depositSchemaProperty(JsonObjectFormatVisitor jsonobjectformatvisitor, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
	//    0    0:return          
	}

	public List findAliases(MapperConfig mapperconfig)
	{
		return Collections.emptyList();
	//    0    0:invokestatic    #25  <Method List Collections.emptyList()>
	//    1    3:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonFormat.Value findFormatOverrides(AnnotationIntrospector annotationintrospector)
	{
		return com.fasterxml.jackson.annotation.JsonFormat.Value.empty();
	//    0    0:invokestatic    #36  <Method com.fasterxml.jackson.annotation.JsonFormat$Value com.fasterxml.jackson.annotation.JsonFormat$Value.empty()>
	//    1    3:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonFormat.Value findPropertyFormat(MapperConfig mapperconfig, Class class1)
	{
		return com.fasterxml.jackson.annotation.JsonFormat.Value.empty();
	//    0    0:invokestatic    #36  <Method com.fasterxml.jackson.annotation.JsonFormat$Value com.fasterxml.jackson.annotation.JsonFormat$Value.empty()>
	//    1    3:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Value findPropertyInclusion(MapperConfig mapperconfig, Class class1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Annotation getAnnotation(Class class1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Annotation getContextAnnotation(Class class1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public PropertyName getFullName()
	{
		return PropertyName.NO_NAME;
	//    0    0:getstatic       #55  <Field PropertyName PropertyName.NO_NAME>
	//    1    3:areturn         
	}

	public AnnotatedMember getMember()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public PropertyMetadata getMetadata()
	{
		return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
	//    0    0:getstatic       #65  <Field PropertyMetadata PropertyMetadata.STD_REQUIRED_OR_OPTIONAL>
	//    1    3:areturn         
	}

	public String getName()
	{
		return "";
	//    0    0:ldc1            #69  <String "">
	//    1    2:areturn         
	}

	public JavaType getType()
	{
		return TypeFactory.unknownType();
	//    0    0:invokestatic    #76  <Method JavaType TypeFactory.unknownType()>
	//    1    3:areturn         
	}

	public PropertyName getWrapperName()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean isRequired()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isVirtual()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public BeanProperty$Bogus()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
