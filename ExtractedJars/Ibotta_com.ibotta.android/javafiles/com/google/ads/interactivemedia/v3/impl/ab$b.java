// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import java.util.List;
import java.util.SortedSet;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			ab, ad

public static interface ab$b
{

	public abstract void a(String s, com.google.ads.interactivemedia.v3.api.or.AdErrorType aderrortype, int i, String s1);

	public abstract void a(String s, com.google.ads.interactivemedia.v3.api.or.AdErrorType aderrortype, com.google.ads.interactivemedia.v3.api.or.AdErrorCode aderrorcode, String s1);

	public abstract void a(String s, ad ad, String s1, boolean flag);

	public abstract void a(String s, ad ad, List list, SortedSet sortedset, boolean flag);
}
