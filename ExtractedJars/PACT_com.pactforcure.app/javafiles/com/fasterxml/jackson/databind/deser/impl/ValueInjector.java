// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.util.Annotations;
import java.io.IOException;

public class ValueInjector extends com.fasterxml.jackson.databind.BeanProperty.Std
{

	public ValueInjector(PropertyName propertyname, JavaType javatype, Annotations annotations, AnnotatedMember annotatedmember, Object obj)
	{
		super(propertyname, javatype, ((PropertyName) (null)), annotations, annotatedmember, PropertyMetadata.STD_OPTIONAL);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_3         
	//    5    5:aload           4
	//    6    7:getstatic       #14  <Field PropertyMetadata PropertyMetadata.STD_OPTIONAL>
	//    7   10:invokespecial   #17  <Method void com.fasterxml.jackson.databind.BeanProperty$Std(PropertyName, JavaType, PropertyName, Annotations, AnnotatedMember, PropertyMetadata)>
		_valueId = obj;
	//    8   13:aload_0         
	//    9   14:aload           5
	//   10   16:putfield        #19  <Field Object _valueId>
	//   11   19:return          
	}

	public ValueInjector(String s, JavaType javatype, Annotations annotations, AnnotatedMember annotatedmember, Object obj)
	{
		this(new PropertyName(s), javatype, annotations, annotatedmember, obj);
	//    0    0:aload_0         
	//    1    1:new             #24  <Class PropertyName>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #27  <Method void PropertyName(String)>
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:aload           5
	//    9   15:invokespecial   #29  <Method void ValueInjector(PropertyName, JavaType, Annotations, AnnotatedMember, Object)>
	//   10   18:return          
	}

	public Object findValue(DeserializationContext deserializationcontext, Object obj)
	{
		return deserializationcontext.findInjectableValue(_valueId, ((com.fasterxml.jackson.databind.BeanProperty) (this)), obj);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #19  <Field Object _valueId>
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #38  <Method Object DeserializationContext.findInjectableValue(Object, com.fasterxml.jackson.databind.BeanProperty, Object)>
	//    6   10:areturn         
	}

	public void inject(DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		_member.setValue(obj, findValue(deserializationcontext, obj));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field AnnotatedMember _member>
	//    2    4:aload_2         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #48  <Method Object findValue(DeserializationContext, Object)>
	//    7   11:invokevirtual   #54  <Method void AnnotatedMember.setValue(Object, Object)>
	//    8   14:return          
	}

	protected final Object _valueId;
}
