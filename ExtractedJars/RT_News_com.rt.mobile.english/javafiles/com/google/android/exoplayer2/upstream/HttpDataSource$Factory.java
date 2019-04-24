// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;


// Referenced classes of package com.google.android.exoplayer2.upstream:
//			HttpDataSource

public static interface HttpDataSource$Factory
	extends DataSource.Factory
{

	public abstract void clearAllDefaultRequestProperties();

	public abstract void clearDefaultRequestProperty(String s);

	public abstract HttpDataSource createDataSource();

	public abstract roperties getDefaultRequestProperties();

	public abstract void setDefaultRequestProperty(String s, String s1);
}
