// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.annotation;

import java.lang.annotation.Annotation;

public interface GlideOption
	extends Annotation
{

	public abstract boolean memoizeStaticMethod();

	public abstract int override();

	public abstract boolean skipStaticMethod();

	public abstract String staticMethodName();

	public static final int OVERRIDE_EXTEND = 1;
	public static final int OVERRIDE_NONE = 0;
	public static final int OVERRIDE_REPLACE = 2;
}
