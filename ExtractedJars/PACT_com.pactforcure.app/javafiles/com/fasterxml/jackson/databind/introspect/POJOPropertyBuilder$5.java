// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			POJOPropertyBuilder, AnnotatedMember

class POJOPropertyBuilder$5
	implements thMember
{

	public volatile Object withMember(AnnotatedMember annotatedmember)
	{
		return ((Object) (withMember(annotatedmember)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #27  <Method String withMember(AnnotatedMember)>
	//    3    5:areturn         
	}

	public String withMember(AnnotatedMember annotatedmember)
	{
		return _annotationIntrospector.findPropertyDescription(((Annotated) (annotatedmember)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field POJOPropertyBuilder this$0>
	//    2    4:getfield        #31  <Field AnnotationIntrospector POJOPropertyBuilder._annotationIntrospector>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #37  <Method String AnnotationIntrospector.findPropertyDescription(Annotated)>
	//    5   11:areturn         
	}

	final POJOPropertyBuilder this$0;

	POJOPropertyBuilder$5()
	{
		this$0 = POJOPropertyBuilder.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field POJOPropertyBuilder this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
