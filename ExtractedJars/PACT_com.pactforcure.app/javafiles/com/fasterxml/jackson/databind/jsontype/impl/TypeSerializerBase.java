// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public abstract class TypeSerializerBase extends TypeSerializer
{

	protected TypeSerializerBase(TypeIdResolver typeidresolver, BeanProperty beanproperty)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void TypeSerializer()>
		_idResolver = typeidresolver;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field TypeIdResolver _idResolver>
		_property = beanproperty;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field BeanProperty _property>
	//    8   14:return          
	}

	public String getPropertyName()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public TypeIdResolver getTypeIdResolver()
	{
		return _idResolver;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field TypeIdResolver _idResolver>
	//    2    4:areturn         
	}

	public abstract com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion();

	protected void handleMissingId(Object obj)
	{
	//    0    0:return          
	}

	protected String idFromValue(Object obj)
	{
		String s = _idResolver.idFromValue(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field TypeIdResolver _idResolver>
	//    2    4:aload_1         
	//    3    5:invokeinterface #32  <Method String TypeIdResolver.idFromValue(Object)>
	//    4   10:astore_2        
		if(s == null)
	//*   5   11:aload_2         
	//*   6   12:ifnonnull       20
			handleMissingId(obj);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #34  <Method void handleMissingId(Object)>
		return s;
	//   10   20:aload_2         
	//   11   21:areturn         
	}

	protected String idFromValueAndType(Object obj, Class class1)
	{
		class1 = ((Class) (_idResolver.idFromValueAndType(obj, class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field TypeIdResolver _idResolver>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #38  <Method String TypeIdResolver.idFromValueAndType(Object, Class)>
	//    5   11:astore_2        
		if(class1 == null)
	//*   6   12:aload_2         
	//*   7   13:ifnonnull       21
			handleMissingId(obj);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #34  <Method void handleMissingId(Object)>
		return ((String) (class1));
	//   11   21:aload_2         
	//   12   22:areturn         
	}

	protected final TypeIdResolver _idResolver;
	protected final BeanProperty _property;
}
