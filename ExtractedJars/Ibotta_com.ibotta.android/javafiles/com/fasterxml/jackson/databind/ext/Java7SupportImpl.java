// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.*;
import java.beans.ConstructorProperties;
import java.beans.Transient;
import java.nio.file.Path;

// Referenced classes of package com.fasterxml.jackson.databind.ext:
//			Java7Support, NioPathDeserializer, NioPathSerializer

public class Java7SupportImpl extends Java7Support
{

	public Java7SupportImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Java7Support()>
	//    2    4:aload_0         
	//    3    5:ldc1            #13  <Class ConstructorProperties>
	//    4    7:putfield        #15  <Field Class _bogus>
	//    5   10:return          
	}

	public PropertyName findConstructorName(AnnotatedParameter annotatedparameter)
	{
		Object obj = ((Object) (annotatedparameter.getOwner()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #24  <Method AnnotatedWithParams AnnotatedParameter.getOwner()>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          48
		{
			obj = ((Object) ((ConstructorProperties)((AnnotatedWithParams) (obj)).getAnnotation(java/beans/ConstructorProperties)));
	//    5    9:aload_3         
	//    6   10:ldc1            #13  <Class ConstructorProperties>
	//    7   12:invokevirtual   #30  <Method java.lang.annotation.Annotation AnnotatedWithParams.getAnnotation(Class)>
	//    8   15:checkcast       #13  <Class ConstructorProperties>
	//    9   18:astore_3        
			if(obj != null)
	//*  10   19:aload_3         
	//*  11   20:ifnull          48
			{
				String as[] = ((ConstructorProperties) (obj)).value();
	//   12   23:aload_3         
	//   13   24:invokeinterface #34  <Method String[] ConstructorProperties.value()>
	//   14   29:astore_3        
				int i = annotatedparameter.getIndex();
	//   15   30:aload_1         
	//   16   31:invokevirtual   #38  <Method int AnnotatedParameter.getIndex()>
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
	//   25   44:invokestatic    #44  <Method PropertyName PropertyName.construct(String)>
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
	//    1    1:ldc1            #48  <Class Transient>
	//    2    3:invokevirtual   #51  <Method java.lang.annotation.Annotation Annotated.getAnnotation(Class)>
	//    3    6:checkcast       #48  <Class Transient>
	//    4    9:astore_1        
		if(annotated != null)
	//*   5   10:aload_1         
	//*   6   11:ifnull          24
			return Boolean.valueOf(((Transient) (annotated)).value());
	//    7   14:aload_1         
	//    8   15:invokeinterface #54  <Method boolean Transient.value()>
	//    9   20:invokestatic    #60  <Method Boolean Boolean.valueOf(boolean)>
	//   10   23:areturn         
		else
			return null;
	//   11   24:aconst_null     
	//   12   25:areturn         
	}

	public JsonDeserializer getDeserializerForJavaNioFilePath(Class class1)
	{
		if(class1 == java/nio/file/Path)
	//*   0    0:aload_1         
	//*   1    1:ldc1            #64  <Class Path>
	//*   2    3:if_acmpne       14
			return ((JsonDeserializer) (new NioPathDeserializer()));
	//    3    6:new             #66  <Class NioPathDeserializer>
	//    4    9:dup             
	//    5   10:invokespecial   #67  <Method void NioPathDeserializer()>
	//    6   13:areturn         
		else
			return null;
	//    7   14:aconst_null     
	//    8   15:areturn         
	}

	public JsonSerializer getSerializerForJavaNioFilePath(Class class1)
	{
		if(((Class) (java/nio/file/Path)).isAssignableFrom(class1))
	//*   0    0:ldc1            #64  <Class Path>
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #77  <Method boolean Class.isAssignableFrom(Class)>
	//*   3    6:ifeq            17
			return ((JsonSerializer) (new NioPathSerializer()));
	//    4    9:new             #79  <Class NioPathSerializer>
	//    5   12:dup             
	//    6   13:invokespecial   #80  <Method void NioPathSerializer()>
	//    7   16:areturn         
		else
			return null;
	//    8   17:aconst_null     
	//    9   18:areturn         
	}

	public Boolean hasCreatorAnnotation(Annotated annotated)
	{
		if((ConstructorProperties)annotated.getAnnotation(java/beans/ConstructorProperties) != null)
	//*   0    0:aload_1         
	//*   1    1:ldc1            #13  <Class ConstructorProperties>
	//*   2    3:invokevirtual   #51  <Method java.lang.annotation.Annotation Annotated.getAnnotation(Class)>
	//*   3    6:checkcast       #13  <Class ConstructorProperties>
	//*   4    9:ifnull          16
			return Boolean.TRUE;
	//    5   12:getstatic       #86  <Field Boolean Boolean.TRUE>
	//    6   15:areturn         
		else
			return null;
	//    7   16:aconst_null     
	//    8   17:areturn         
	}

	private final Class _bogus = java/beans/ConstructorProperties;
}
