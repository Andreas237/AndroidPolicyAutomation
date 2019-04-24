// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.annotation;

import java.lang.annotation.Annotation;

public interface VisibleForTesting
	extends Annotation
{

	public abstract int otherwise();

	public static final int NONE = 5;
	public static final int PACKAGE_PRIVATE = 3;
	public static final int PRIVATE = 2;
	public static final int PROTECTED = 4;
}
