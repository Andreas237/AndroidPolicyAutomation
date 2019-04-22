// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.IOException;

public class ValueInjector extends com.fasterxml.jackson.databind.BeanProperty.Std
{

	public ValueInjector(PropertyName propertyname, JavaType javatype, AnnotatedMember annotatedmember, Object obj)
	{
		super(propertyname, javatype, ((PropertyName) (null)), annotatedmember, PropertyMetadata.STD_OPTIONAL);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_3         
	//    5    5:getstatic       #18  <Field PropertyMetadata PropertyMetadata.STD_OPTIONAL>
	//    6    8:invokespecial   #21  <Method void com.fasterxml.jackson.databind.BeanProperty$Std(PropertyName, JavaType, PropertyName, AnnotatedMember, PropertyMetadata)>
		_valueId = obj;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #23  <Field Object _valueId>
	//   10   17:return          
	}

	public Object findValue(DeserializationContext deserializationcontext, Object obj)
		throws JsonMappingException
	{
		return deserializationcontext.findInjectableValue(_valueId, ((com.fasterxml.jackson.databind.BeanProperty) (this)), obj);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #23  <Field Object _valueId>
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #34  <Method Object DeserializationContext.findInjectableValue(Object, com.fasterxml.jackson.databind.BeanProperty, Object)>
	//    6   10:areturn         
	}

	public void inject(DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		_member.setValue(obj, findValue(deserializationcontext, obj));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field AnnotatedMember _member>
	//    2    4:aload_2         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #45  <Method Object findValue(DeserializationContext, Object)>
	//    7   11:invokevirtual   #51  <Method void AnnotatedMember.setValue(Object, Object)>
	//    8   14:return          
	}

	private static final long serialVersionUID = 1L;
	protected final Object _valueId;
}
