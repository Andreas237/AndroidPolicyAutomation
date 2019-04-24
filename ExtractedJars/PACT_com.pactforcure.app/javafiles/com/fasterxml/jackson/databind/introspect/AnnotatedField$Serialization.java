// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;
import java.lang.reflect.Field;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotatedField

private static final class AnnotatedField$Serialization
	implements Serializable
{

	private static final long serialVersionUID = 1L;
	protected Class clazz;
	protected String name;

	public AnnotatedField$Serialization(Field field)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		clazz = field.getDeclaringClass();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #29  <Method Class Field.getDeclaringClass()>
	//    5    9:putfield        #31  <Field Class clazz>
		name = field.getName();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #35  <Method String Field.getName()>
	//    9   17:putfield        #37  <Field String name>
	//   10   20:return          
	}
}
