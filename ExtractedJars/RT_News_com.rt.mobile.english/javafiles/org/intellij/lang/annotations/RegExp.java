// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.intellij.lang.annotations;

import java.lang.annotation.Annotation;

public interface RegExp
	extends Annotation
{

	public abstract String prefix();

	public abstract String suffix();
}
