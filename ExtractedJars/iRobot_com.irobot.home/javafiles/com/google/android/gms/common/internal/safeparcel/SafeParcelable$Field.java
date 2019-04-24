// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal.safeparcel;

import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.gms.common.internal.safeparcel:
//			SafeParcelable

public static interface SafeParcelable$Field
	extends Annotation
{

	public abstract String defaultValue();

	public abstract String defaultValueUnchecked();

	public abstract String getter();

	public abstract int id();

	public abstract String type();
}
