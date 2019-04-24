// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.util;

import java.lang.reflect.Method;

public class MethodDescriptor
{

	public MethodDescriptor(String s, Method method1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field String name>
		method = method1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field Method method>
	//    8   14:return          
	}

	public Method getMethod()
	{
		return method;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Method method>
	//    2    4:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field String name>
	//    2    4:areturn         
	}

	private Method method;
	private String name;
}
