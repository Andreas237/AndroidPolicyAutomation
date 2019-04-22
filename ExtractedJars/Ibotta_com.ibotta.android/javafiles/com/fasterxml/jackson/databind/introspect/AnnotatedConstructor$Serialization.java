// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;
import java.lang.reflect.Constructor;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotatedConstructor

private static final class AnnotatedConstructor$Serialization
	implements Serializable
{

	private static final long serialVersionUID = 1L;
	protected Class args[];
	protected Class clazz;

	public AnnotatedConstructor$Serialization(Constructor constructor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		clazz = constructor.getDeclaringClass();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #30  <Method Class Constructor.getDeclaringClass()>
	//    5    9:putfield        #32  <Field Class clazz>
		args = constructor.getParameterTypes();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #36  <Method Class[] Constructor.getParameterTypes()>
	//    9   17:putfield        #38  <Field Class[] args>
	//   10   20:return          
	}
}
