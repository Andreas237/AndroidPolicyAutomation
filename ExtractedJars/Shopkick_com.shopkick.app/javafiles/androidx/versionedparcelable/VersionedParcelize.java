// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.versionedparcelable;

import java.lang.annotation.Annotation;

public interface VersionedParcelize
	extends Annotation
{

	public abstract boolean allowSerialization();

	public abstract int[] deprecatedIds();

	public abstract boolean ignoreParcelables();

	public abstract boolean isCustom();

	public abstract String jetifyAs();
}