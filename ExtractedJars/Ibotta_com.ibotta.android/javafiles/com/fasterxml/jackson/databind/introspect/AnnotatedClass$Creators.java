// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotatedClass, AnnotatedConstructor

public static final class AnnotatedClass$Creators
{

	public final List constructors;
	public final List creatorMethods;
	public final AnnotatedConstructor defaultConstructor;

	public AnnotatedClass$Creators(AnnotatedConstructor annotatedconstructor, List list, List list1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		defaultConstructor = annotatedconstructor;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field AnnotatedConstructor defaultConstructor>
		constructors = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field List constructors>
		creatorMethods = list1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field List creatorMethods>
	//   11   19:return          
	}
}
