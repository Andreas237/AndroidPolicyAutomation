// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.annotation;

import java.lang.annotation.Annotation;

// Referenced classes of package com.raizlabs.android.dbflow.annotation:
//			Collate

public interface Column
	extends Annotation
{

	public abstract Collate collate();

	public abstract String defaultValue();

	public abstract String getterName();

	public abstract int length();

	public abstract String name();

	public abstract String setterName();

	public abstract Class typeConverter();
}
