// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.util;

import java.lang.reflect.Method;

public class PropertyDescriptor
{

	public PropertyDescriptor(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field String name>
	//    5    9:return          
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String name>
	//    2    4:areturn         
	}

	public Class getPropertyType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Class type>
	//    2    4:areturn         
	}

	public Method getReadMethod()
	{
		return readMethod;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Method readMethod>
	//    2    4:areturn         
	}

	public Method getWriteMethod()
	{
		return writeMethod;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Method writeMethod>
	//    2    4:areturn         
	}

	public void setPropertyType(Class class1)
	{
		type = class1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field Class type>
	//    3    5:return          
	}

	public void setReadMethod(Method method)
	{
		readMethod = method;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field Method readMethod>
	//    3    5:return          
	}

	public void setWriteMethod(Method method)
	{
		writeMethod = method;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field Method writeMethod>
	//    3    5:return          
	}

	private String name;
	private Method readMethod;
	private Class type;
	private Method writeMethod;
}
