// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field;

import java.lang.annotation.Annotation;

public interface ForeignCollectionField
	extends Annotation
{

	public abstract boolean eager();

	public abstract String foreignFieldName();

	public abstract int maxEagerLevel();

	public abstract String orderBy();

	public static final int DEFAULT_MAX_EAGER_LEVEL = 1;
}
