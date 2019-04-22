// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.Converter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind:
//			JavaType

public abstract class BeanDescription
{

	protected BeanDescription(JavaType javatype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		_type = javatype;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field JavaType _type>
	//    5    9:return          
	}

	public abstract AnnotatedMember findAnyGetter();

	public abstract AnnotatedMember findAnySetterAccessor();

	public abstract List findBackReferences();

	public abstract AnnotatedConstructor findDefaultConstructor();

	public abstract Class[] findDefaultViews();

	public abstract Converter findDeserializationConverter();

	public abstract com.fasterxml.jackson.annotation.JsonFormat.Value findExpectedFormat(com.fasterxml.jackson.annotation.JsonFormat.Value value);

	public transient abstract Method findFactoryMethod(Class aclass[]);

	public abstract Map findInjectables();

	public abstract AnnotatedMember findJsonValueAccessor();

	public abstract AnnotatedMethod findMethod(String s, Class aclass[]);

	public abstract Class findPOJOBuilder();

	public abstract com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig();

	public abstract List findProperties();

	public abstract com.fasterxml.jackson.annotation.JsonInclude.Value findPropertyInclusion(com.fasterxml.jackson.annotation.JsonInclude.Value value);

	public abstract Converter findSerializationConverter();

	public transient abstract Constructor findSingleArgConstructor(Class aclass[]);

	public Class getBeanClass()
	{
		return _type.getRawClass();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JavaType _type>
	//    2    4:invokevirtual   #50  <Method Class JavaType.getRawClass()>
	//    3    7:areturn         
	}

	public abstract Annotations getClassAnnotations();

	public abstract AnnotatedClass getClassInfo();

	public abstract List getConstructors();

	public abstract List getFactoryMethods();

	public abstract Set getIgnoredPropertyNames();

	public abstract ObjectIdInfo getObjectIdInfo();

	public JavaType getType()
	{
		return _type;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JavaType _type>
	//    2    4:areturn         
	}

	public abstract boolean hasKnownClassAnnotations();

	public abstract Object instantiateBean(boolean flag);

	public boolean isNonStaticInnerClass()
	{
		return getClassInfo().isNonStaticInnerClass();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method AnnotatedClass getClassInfo()>
	//    2    4:invokevirtual   #75  <Method boolean AnnotatedClass.isNonStaticInnerClass()>
	//    3    7:ireturn         
	}

	protected final JavaType _type;
}
