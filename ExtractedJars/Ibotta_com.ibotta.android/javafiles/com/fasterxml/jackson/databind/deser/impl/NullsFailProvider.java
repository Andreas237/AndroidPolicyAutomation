// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.exc.InvalidNullException;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.Serializable;

public class NullsFailProvider
	implements NullValueProvider, Serializable
{

	protected NullsFailProvider(PropertyName propertyname, JavaType javatype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		_name = propertyname;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field PropertyName _name>
		_type = javatype;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field JavaType _type>
	//    8   14:return          
	}

	public static NullsFailProvider constructForProperty(BeanProperty beanproperty)
	{
		return new NullsFailProvider(beanproperty.getFullName(), beanproperty.getType());
	//    0    0:new             #2   <Class NullsFailProvider>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #34  <Method PropertyName BeanProperty.getFullName()>
	//    4   10:aload_0         
	//    5   11:invokeinterface #38  <Method JavaType BeanProperty.getType()>
	//    6   16:invokespecial   #40  <Method void NullsFailProvider(PropertyName, JavaType)>
	//    7   19:areturn         
	}

	public static NullsFailProvider constructForRootValue(JavaType javatype)
	{
		return new NullsFailProvider(((PropertyName) (null)), javatype);
	//    0    0:new             #2   <Class NullsFailProvider>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aload_0         
	//    4    6:invokespecial   #40  <Method void NullsFailProvider(PropertyName, JavaType)>
	//    5    9:areturn         
	}

	public AccessPattern getNullAccessPattern()
	{
		return AccessPattern.DYNAMIC;
	//    0    0:getstatic       #50  <Field AccessPattern AccessPattern.DYNAMIC>
	//    1    3:areturn         
	}

	public Object getNullValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		throw InvalidNullException.from(deserializationcontext, _name, _type);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #23  <Field PropertyName _name>
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field JavaType _type>
	//    5    9:invokestatic    #60  <Method InvalidNullException InvalidNullException.from(DeserializationContext, PropertyName, JavaType)>
	//    6   12:athrow          
	}

	private static final long serialVersionUID = 1L;
	protected final PropertyName _name;
	protected final JavaType _type;
}
