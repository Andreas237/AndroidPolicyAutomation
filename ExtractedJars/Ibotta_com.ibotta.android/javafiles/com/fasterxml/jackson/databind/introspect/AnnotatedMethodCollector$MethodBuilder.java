// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import java.lang.reflect.Method;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotatedMethodCollector, AnnotatedMethod, AnnotationCollector, TypeResolutionContext

private static final class AnnotatedMethodCollector$MethodBuilder
{

	public AnnotatedMethod build()
	{
		Method method1 = method;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Method method>
	//    2    4:astore_1        
		if(method1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return new AnnotatedMethod(typeContext, method1, annotations.asAnnotationMap(), ((AnnotationMap []) (null)));
	//    7   11:new             #29  <Class AnnotatedMethod>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #20  <Field TypeResolutionContext typeContext>
	//   11   19:aload_1         
	//   12   20:aload_0         
	//   13   21:getfield        #24  <Field AnnotationCollector annotations>
	//   14   24:invokevirtual   #35  <Method AnnotationMap AnnotationCollector.asAnnotationMap()>
	//   15   27:aconst_null     
	//   16   28:invokespecial   #38  <Method void AnnotatedMethod(TypeResolutionContext, Method, AnnotationMap, AnnotationMap[])>
	//   17   31:areturn         
	}

	public AnnotationCollector annotations;
	public Method method;
	public TypeResolutionContext typeContext;

	public AnnotatedMethodCollector$MethodBuilder(TypeResolutionContext typeresolutioncontext, Method method1, AnnotationCollector annotationcollector)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		typeContext = typeresolutioncontext;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field TypeResolutionContext typeContext>
		method = method1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field Method method>
		annotations = annotationcollector;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field AnnotationCollector annotations>
	//   11   19:return          
	}
}
