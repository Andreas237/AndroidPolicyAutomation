// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			POJOPropertyBuilder, AnnotatedMember

class POJOPropertyBuilder$4
	implements thMember
{

	public Boolean withMember(AnnotatedMember annotatedmember)
	{
		return _annotationIntrospector.hasRequiredMarker(annotatedmember);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field POJOPropertyBuilder this$0>
	//    2    4:getfield        #28  <Field AnnotationIntrospector POJOPropertyBuilder._annotationIntrospector>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #33  <Method Boolean AnnotationIntrospector.hasRequiredMarker(AnnotatedMember)>
	//    5   11:areturn         
	}

	public volatile Object withMember(AnnotatedMember annotatedmember)
	{
		return ((Object) (withMember(annotatedmember)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #36  <Method Boolean withMember(AnnotatedMember)>
	//    3    5:areturn         
	}

	final POJOPropertyBuilder this$0;

	POJOPropertyBuilder$4()
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
