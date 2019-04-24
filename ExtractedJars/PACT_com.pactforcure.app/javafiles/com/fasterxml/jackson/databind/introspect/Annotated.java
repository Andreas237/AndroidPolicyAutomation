// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotationMap

public abstract class Annotated
{

	protected Annotated()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public abstract Iterable annotations();

	public abstract boolean equals(Object obj);

	protected abstract AnnotationMap getAllAnnotations();

	public abstract AnnotatedElement getAnnotated();

	public abstract Annotation getAnnotation(Class class1);

	public Type getGenericType()
	{
		return ((Type) (getRawType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Class getRawType()>
	//    2    4:areturn         
	}

	protected abstract int getModifiers();

	public abstract String getName();

	public abstract Class getRawType();

	public abstract JavaType getType();

	public final JavaType getType(TypeBindings typebindings)
	{
		return getType();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #36  <Method JavaType getType()>
	//    2    4:areturn         
	}

	public abstract boolean hasAnnotation(Class class1);

	public abstract boolean hasOneOf(Class aclass[]);

	public abstract int hashCode();

	public final boolean isPublic()
	{
		return Modifier.isPublic(getModifiers());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method int getModifiers()>
	//    2    4:invokestatic    #50  <Method boolean Modifier.isPublic(int)>
	//    3    7:ireturn         
	}

	public abstract String toString();

	public abstract Annotated withAnnotations(AnnotationMap annotationmap);

	public final Annotated withFallBackAnnotationsFrom(Annotated annotated)
	{
		return withAnnotations(AnnotationMap.merge(getAllAnnotations(), annotated.getAllAnnotations()));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #57  <Method AnnotationMap getAllAnnotations()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #57  <Method AnnotationMap getAllAnnotations()>
	//    5    9:invokestatic    #63  <Method AnnotationMap AnnotationMap.merge(AnnotationMap, AnnotationMap)>
	//    6   12:invokevirtual   #65  <Method Annotated withAnnotations(AnnotationMap)>
	//    7   15:areturn         
	}
}
