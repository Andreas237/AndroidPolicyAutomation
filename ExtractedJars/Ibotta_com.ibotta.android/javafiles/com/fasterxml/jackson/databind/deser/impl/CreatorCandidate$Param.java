// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			CreatorCandidate

public static final class CreatorCandidate$Param
{

	public final AnnotatedParameter annotated;
	public final com.fasterxml.jackson.annotation.JacksonInject.Value injection;
	public final BeanPropertyDefinition propDef;

	public CreatorCandidate$Param(AnnotatedParameter annotatedparameter, BeanPropertyDefinition beanpropertydefinition, com.fasterxml.jackson.annotation.JacksonInject.Value value)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		annotated = annotatedparameter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field AnnotatedParameter annotated>
		propDef = beanpropertydefinition;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field BeanPropertyDefinition propDef>
		injection = value;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field com.fasterxml.jackson.annotation.JacksonInject$Value injection>
	//   11   19:return          
	}
}
