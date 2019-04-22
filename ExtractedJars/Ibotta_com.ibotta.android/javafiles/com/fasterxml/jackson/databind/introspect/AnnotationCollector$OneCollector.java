// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.Annotations;
import java.lang.annotation.Annotation;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotationCollector, AnnotationMap

static class AnnotationCollector$OneCollector extends AnnotationCollector
{

	public AnnotationCollector addOrOverride(Annotation annotation)
	{
		Class class1 = annotation.annotationType();
	//    0    0:aload_1         
	//    1    1:invokeinterface #30  <Method Class Annotation.annotationType()>
	//    2    6:astore_2        
		if(_type == class1)
	//*   3    7:aload_0         
	//*   4    8:getfield        #17  <Field Class _type>
	//*   5   11:aload_2         
	//*   6   12:if_acmpne       22
		{
			_value = annotation;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #19  <Field Annotation _value>
			return ((AnnotationCollector) (this));
	//   10   20:aload_0         
	//   11   21:areturn         
		} else
		{
			return ((AnnotationCollector) (new AnnotationCollector.NCollector(_data, _type, _value, class1, annotation)));
	//   12   22:new             #32  <Class AnnotationCollector$NCollector>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:getfield        #36  <Field Object _data>
	//   16   30:aload_0         
	//   17   31:getfield        #17  <Field Class _type>
	//   18   34:aload_0         
	//   19   35:getfield        #19  <Field Annotation _value>
	//   20   38:aload_2         
	//   21   39:aload_1         
	//   22   40:invokespecial   #39  <Method void AnnotationCollector$NCollector(Object, Class, Annotation, Class, Annotation)>
	//   23   43:areturn         
		}
	}

	public AnnotationMap asAnnotationMap()
	{
		return AnnotationMap.of(_type, _value);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Class _type>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Annotation _value>
	//    4    8:invokestatic    #47  <Method AnnotationMap AnnotationMap.of(Class, Annotation)>
	//    5   11:areturn         
	}

	public Annotations asAnnotations()
	{
		return ((Annotations) (new (_type, _value)));
	//    0    0:new             #51  <Class AnnotationCollector$OneAnnotation>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field Class _type>
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field Annotation _value>
	//    6   12:invokespecial   #54  <Method void AnnotationCollector$OneAnnotation(Class, Annotation)>
	//    7   15:areturn         
	}

	public boolean isPresent(Annotation annotation)
	{
		return annotation.annotationType() == _type;
	//    0    0:aload_1         
	//    1    1:invokeinterface #30  <Method Class Annotation.annotationType()>
	//    2    6:aload_0         
	//    3    7:getfield        #17  <Field Class _type>
	//    4   10:if_acmpne       15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	private Class _type;
	private Annotation _value;

	public AnnotationCollector$OneCollector(Object obj, Class class1, Annotation annotation)
	{
		super(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void AnnotationCollector(Object)>
		_type = class1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field Class _type>
		_value = annotation;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #19  <Field Annotation _value>
	//    9   15:return          
	}
}
