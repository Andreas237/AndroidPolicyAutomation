// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.Annotations;
import java.lang.annotation.Annotation;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotationCollector, AnnotationMap

static class AnnotationCollector$EmptyCollector extends AnnotationCollector
{

	public AnnotationCollector addOrOverride(Annotation annotation)
	{
		return ((AnnotationCollector) (new AnnotationCollector.OneCollector(_data, annotation.annotationType(), annotation)));
	//    0    0:new             #21  <Class AnnotationCollector$OneCollector>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field Object _data>
	//    4    8:aload_1         
	//    5    9:invokeinterface #31  <Method Class Annotation.annotationType()>
	//    6   14:aload_1         
	//    7   15:invokespecial   #34  <Method void AnnotationCollector$OneCollector(Object, Class, Annotation)>
	//    8   18:areturn         
	}

	public AnnotationMap asAnnotationMap()
	{
		return new AnnotationMap();
	//    0    0:new             #38  <Class AnnotationMap>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void AnnotationMap()>
	//    3    7:areturn         
	}

	public Annotations asAnnotations()
	{
		return NO_ANNOTATIONS;
	//    0    0:getstatic       #46  <Field Annotations NO_ANNOTATIONS>
	//    1    3:areturn         
	}

	public boolean isPresent(Annotation annotation)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public static final AnnotationCollector$EmptyCollector instance = new AnnotationCollector$EmptyCollector(((Object) (null)));

	static 
	{
	//    0    0:new             #2   <Class AnnotationCollector$EmptyCollector>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #13  <Method void AnnotationCollector$EmptyCollector(Object)>
	//    4    8:putstatic       #15  <Field AnnotationCollector$EmptyCollector instance>
	//*   5   11:return          
	}

	AnnotationCollector$EmptyCollector(Object obj)
	{
		super(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void AnnotationCollector(Object)>
	//    3    5:return          
	}
}
