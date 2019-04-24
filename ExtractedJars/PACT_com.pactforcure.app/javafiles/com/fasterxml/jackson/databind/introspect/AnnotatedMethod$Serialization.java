// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;
import java.lang.reflect.Method;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotatedMethod

private static final class AnnotatedMethod$Serialization
	implements Serializable
{

	private static final long serialVersionUID = 1L;
	protected Class args[];
	protected Class clazz;
	protected String name;

	public AnnotatedMethod$Serialization(Method method)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		clazz = method.getDeclaringClass();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #32  <Method Class Method.getDeclaringClass()>
	//    5    9:putfield        #34  <Field Class clazz>
		name = method.getName();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #38  <Method String Method.getName()>
	//    9   17:putfield        #40  <Field String name>
		args = method.getParameterTypes();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #44  <Method Class[] Method.getParameterTypes()>
	//   13   25:putfield        #46  <Field Class[] args>
	//   14   28:return          
	}
}
