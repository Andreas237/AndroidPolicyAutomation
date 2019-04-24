// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.annotation.provider;

import java.lang.annotation.Annotation;

// Referenced classes of package com.raizlabs.android.dbflow.annotation.provider:
//			ContentUri

public static interface ContentUri$PathSegment
	extends Annotation
{

	public abstract String column();

	public abstract int segment();
}
