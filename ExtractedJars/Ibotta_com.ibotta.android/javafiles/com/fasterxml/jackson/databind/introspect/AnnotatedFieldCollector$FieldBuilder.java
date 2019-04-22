// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import java.lang.reflect.Field;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotatedFieldCollector, AnnotationCollector, AnnotatedField, TypeResolutionContext

private static final class AnnotatedFieldCollector$FieldBuilder
{

	public AnnotatedField build()
	{
		return new AnnotatedField(typeContext, field, annotations.asAnnotationMap());
	//    0    0:new             #35  <Class AnnotatedField>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field TypeResolutionContext typeContext>
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field Field field>
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field AnnotationCollector annotations>
	//    8   16:invokevirtual   #39  <Method AnnotationMap AnnotationCollector.asAnnotationMap()>
	//    9   19:invokespecial   #42  <Method void AnnotatedField(TypeResolutionContext, Field, AnnotationMap)>
	//   10   22:areturn         
	}

	public AnnotationCollector annotations;
	public final Field field;
	public final TypeResolutionContext typeContext;

	public AnnotatedFieldCollector$FieldBuilder(TypeResolutionContext typeresolutioncontext, Field field1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		typeContext = typeresolutioncontext;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field TypeResolutionContext typeContext>
		field = field1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field Field field>
		annotations = AnnotationCollector.emptyCollector();
	//    8   14:aload_0         
	//    9   15:invokestatic    #28  <Method AnnotationCollector AnnotationCollector.emptyCollector()>
	//   10   18:putfield        #30  <Field AnnotationCollector annotations>
	//   11   21:return          
	}
}
