// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.intellij.lang.annotations;

import java.lang.annotation.Annotation;

public interface MagicConstant
	extends Annotation
{

	public abstract long[] flags();

	public abstract Class flagsFromClass();

	public abstract long[] intValues();

	public abstract String[] stringValues();

	public abstract Class valuesFromClass();
}
