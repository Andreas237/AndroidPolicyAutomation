// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import java.lang.annotation.Annotation;

public interface Annotations
{

	public abstract Annotation get(Class class1);

	public abstract boolean has(Class class1);

	public abstract boolean hasOneOf(Class aclass[]);

	public abstract int size();
}
