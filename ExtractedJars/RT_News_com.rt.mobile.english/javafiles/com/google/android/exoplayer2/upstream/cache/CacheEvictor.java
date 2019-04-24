// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.cache;


// Referenced classes of package com.google.android.exoplayer2.upstream.cache:
//			Cache

public interface CacheEvictor
	extends Cache.Listener
{

	public abstract void onCacheInitialized();

	public abstract void onStartFile(Cache cache, String s, long l, long l1);
}
