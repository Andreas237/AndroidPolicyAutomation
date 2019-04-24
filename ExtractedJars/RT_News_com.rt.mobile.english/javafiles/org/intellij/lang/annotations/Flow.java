// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.intellij.lang.annotations;

import java.lang.annotation.Annotation;

public interface Flow
	extends Annotation
{

	public abstract String source();

	public abstract boolean sourceIsContainer();

	public abstract String target();

	public abstract boolean targetIsContainer();

	public static final String DEFAULT_SOURCE = "The method argument (if parameter was annotated) or this container (if instance method was annotated)";
	public static final String DEFAULT_TARGET = "This container (if the parameter was annotated) or the return value (if instance method was annotated)";
	public static final String RETURN_METHOD_TARGET = "The return value of this method";
	public static final String THIS_SOURCE = "this";
	public static final String THIS_TARGET = "this";
}
