// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.JavaType;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//			ValueInstantiator

public static class ValueInstantiator$Base extends ValueInstantiator
{

	public Class getValueClass()
	{
		return _valueType;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Class _valueType>
	//    2    4:areturn         
	}

	public String getValueTypeDesc()
	{
		return _valueType.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Class _valueType>
	//    2    4:invokevirtual   #34  <Method String Class.getName()>
	//    3    7:areturn         
	}

	protected final Class _valueType;

	public ValueInstantiator$Base(JavaType javatype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void ValueInstantiator()>
		_valueType = javatype.getRawClass();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #19  <Method Class JavaType.getRawClass()>
	//    5    9:putfield        #21  <Field Class _valueType>
	//    6   12:return          
	}

	public ValueInstantiator$Base(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void ValueInstantiator()>
		_valueType = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Class _valueType>
	//    5    9:return          
	}
}
