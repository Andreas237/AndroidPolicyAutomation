// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.io.IOException;

public class ConstantValueInstantiator extends ValueInstantiator
{

	public ConstantValueInstantiator(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void ValueInstantiator()>
		_value = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field Object _value>
	//    5    9:return          
	}

	public boolean canCreateUsingDefault()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean canInstantiate()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public Object createUsingDefault(DeserializationContext deserializationcontext)
		throws IOException
	{
		return _value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Object _value>
	//    2    4:areturn         
	}

	public Class getValueClass()
	{
		return _value.getClass();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Object _value>
	//    2    4:invokevirtual   #29  <Method Class Object.getClass()>
	//    3    7:areturn         
	}

	protected final Object _value;
}
