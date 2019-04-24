// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.PropertyName;
import java.beans.ConstructorProperties;
import java.beans.Transient;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			JacksonAnnotationIntrospector, AnnotatedParameter, AnnotatedWithParams, Annotated

private static class JacksonAnnotationIntrospector$Java7Support
{

	public PropertyName findConstructorName(AnnotatedParameter annotatedparameter)
	{
		Object obj = ((Object) (annotatedparameter.getOwner()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method AnnotatedWithParams AnnotatedParameter.getOwner()>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          48
		{
			obj = ((Object) ((ConstructorProperties)((AnnotatedWithParams) (obj)).getAnnotation(java/beans/ConstructorProperties)));
	//    5    9:aload_3         
	//    6   10:ldc1            #16  <Class ConstructorProperties>
	//    7   12:invokevirtual   #33  <Method java.lang.annotation.Annotation AnnotatedWithParams.getAnnotation(Class)>
	//    8   15:checkcast       #16  <Class ConstructorProperties>
	//    9   18:astore_3        
			if(obj != null)
	//*  10   19:aload_3         
	//*  11   20:ifnull          48
			{
				String as[] = ((ConstructorProperties) (obj)).value();
	//   12   23:aload_3         
	//   13   24:invokeinterface #37  <Method String[] ConstructorProperties.value()>
	//   14   29:astore_3        
				int i = annotatedparameter.getIndex();
	//   15   30:aload_1         
	//   16   31:invokevirtual   #41  <Method int AnnotatedParameter.getIndex()>
	//   17   34:istore_2        
				if(i < as.length)
	//*  18   35:iload_2         
	//*  19   36:aload_3         
	//*  20   37:arraylength     
	//*  21   38:icmpge          48
					return PropertyName.construct(as[i]);
	//   22   41:aload_3         
	//   23   42:iload_2         
	//   24   43:aaload          
	//   25   44:invokestatic    #47  <Method PropertyName PropertyName.construct(String)>
	//   26   47:areturn         
			}
		}
		return null;
	//   27   48:aconst_null     
	//   28   49:areturn         
	}

	public Boolean findTransient(Annotated annotated)
	{
		annotated = ((Annotated) ((Transient)annotated.getAnnotation(java/beans/Transient)));
	//    0    0:aload_1         
	//    1    1:ldc1            #51  <Class Transient>
	//    2    3:invokevirtual   #54  <Method java.lang.annotation.Annotation Annotated.getAnnotation(Class)>
	//    3    6:checkcast       #51  <Class Transient>
	//    4    9:astore_1        
		if(annotated != null)
	//*   5   10:aload_1         
	//*   6   11:ifnull          24
			return Boolean.valueOf(((Transient) (annotated)).value());
	//    7   14:aload_1         
	//    8   15:invokeinterface #57  <Method boolean Transient.value()>
	//    9   20:invokestatic    #63  <Method Boolean Boolean.valueOf(boolean)>
	//   10   23:areturn         
		else
			return null;
	//   11   24:aconst_null     
	//   12   25:areturn         
	}

	public Boolean hasCreatorAnnotation(Annotated annotated)
	{
		if((ConstructorProperties)annotated.getAnnotation(java/beans/ConstructorProperties) != null)
	//*   0    0:aload_1         
	//*   1    1:ldc1            #16  <Class ConstructorProperties>
	//*   2    3:invokevirtual   #54  <Method java.lang.annotation.Annotation Annotated.getAnnotation(Class)>
	//*   3    6:checkcast       #16  <Class ConstructorProperties>
	//*   4    9:ifnull          16
			return Boolean.TRUE;
	//    5   12:getstatic       #68  <Field Boolean Boolean.TRUE>
	//    6   15:areturn         
		else
			return null;
	//    7   16:aconst_null     
	//    8   17:areturn         
	}

	private final Class _bogus = java/beans/ConstructorProperties;

	public JacksonAnnotationIntrospector$Java7Support()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:ldc1            #16  <Class ConstructorProperties>
	//    4    7:putfield        #18  <Field Class _bogus>
	//    5   10:return          
	}
}
