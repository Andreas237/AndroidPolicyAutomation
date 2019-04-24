// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.annotation;

import java.lang.annotation.Annotation;

public interface ModelView
	extends Annotation
{

	public abstract boolean allFields();

	public abstract Class database();

	public abstract String name();

	public abstract int priority();
}
