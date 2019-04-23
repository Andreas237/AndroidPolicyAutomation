// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.annotation;

import java.lang.annotation.Annotation;

public interface RequiresApi
	extends Annotation
{

	public abstract int api();

	public abstract int value();
}
