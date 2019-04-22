// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public abstract class Annotated
{

	protected Annotated()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public abstract boolean equals(Object obj);

	public abstract AnnotatedElement getAnnotated();

	public abstract Annotation getAnnotation(Class class1);

	public abstract String getName();

	public abstract Class getRawType();

	public abstract JavaType getType();

	public abstract boolean hasAnnotation(Class class1);

	public abstract boolean hasOneOf(Class aclass[]);

	public abstract int hashCode();

	public abstract String toString();
}
