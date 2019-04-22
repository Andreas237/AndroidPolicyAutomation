// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			POJOPropertyBuilder, AnnotatedMember, ObjectIdInfo

class POJOPropertyBuilder$8
	implements thMember
{

	public ObjectIdInfo withMember(AnnotatedMember annotatedmember)
	{
		ObjectIdInfo objectidinfo1 = _annotationIntrospector.findObjectIdInfo(((Annotated) (annotatedmember)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field POJOPropertyBuilder this$0>
	//    2    4:getfield        #28  <Field AnnotationIntrospector POJOPropertyBuilder._annotationIntrospector>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #33  <Method ObjectIdInfo AnnotationIntrospector.findObjectIdInfo(Annotated)>
	//    5   11:astore_3        
		ObjectIdInfo objectidinfo = objectidinfo1;
	//    6   12:aload_3         
	//    7   13:astore_2        
		if(objectidinfo1 != null)
	//*   8   14:aload_3         
	//*   9   15:ifnull          31
			objectidinfo = _annotationIntrospector.findObjectReferenceInfo(((Annotated) (annotatedmember)), objectidinfo1);
	//   10   18:aload_0         
	//   11   19:getfield        #18  <Field POJOPropertyBuilder this$0>
	//   12   22:getfield        #28  <Field AnnotationIntrospector POJOPropertyBuilder._annotationIntrospector>
	//   13   25:aload_1         
	//   14   26:aload_3         
	//   15   27:invokevirtual   #37  <Method ObjectIdInfo AnnotationIntrospector.findObjectReferenceInfo(Annotated, ObjectIdInfo)>
	//   16   30:astore_2        
		return objectidinfo;
	//   17   31:aload_2         
	//   18   32:areturn         
	}

	public volatile Object withMember(AnnotatedMember annotatedmember)
	{
		return ((Object) (withMember(annotatedmember)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #40  <Method ObjectIdInfo withMember(AnnotatedMember)>
	//    3    5:areturn         
	}

	final POJOPropertyBuilder this$0;

	POJOPropertyBuilder$8()
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
