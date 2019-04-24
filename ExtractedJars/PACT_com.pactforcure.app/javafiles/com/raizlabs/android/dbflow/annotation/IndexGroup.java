// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.annotation;

import java.lang.annotation.Annotation;

public interface IndexGroup
	extends Annotation
{

	public abstract String name();

	public abstract int number();

	public abstract boolean unique();

	public static final int GENERIC = -1;
}
