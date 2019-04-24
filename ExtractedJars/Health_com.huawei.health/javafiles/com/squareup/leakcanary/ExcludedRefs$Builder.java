// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;


// Referenced classes of package com.squareup.leakcanary:
//			ExcludedRefs

public static interface ExcludedRefs$Builder
{

	public abstract ExcludedRefs build();

	public abstract ithParams clazz(String s);

	public abstract ithParams instanceField(String s, String s1);

	public abstract ithParams staticField(String s, String s1);

	public abstract ithParams thread(String s);
}
