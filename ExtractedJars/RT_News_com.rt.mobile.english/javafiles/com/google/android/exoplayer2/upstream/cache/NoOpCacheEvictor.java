// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.cache;


// Referenced classes of package com.google.android.exoplayer2.upstream.cache:
//			CacheEvictor, Cache, CacheSpan

public final class NoOpCacheEvictor
	implements CacheEvictor
{

	public NoOpCacheEvictor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public void onCacheInitialized()
	{
	//    0    0:return          
	}

	public void onSpanAdded(Cache cache, CacheSpan cachespan)
	{
	//    0    0:return          
	}

	public void onSpanRemoved(Cache cache, CacheSpan cachespan)
	{
	//    0    0:return          
	}

	public void onSpanTouched(Cache cache, CacheSpan cachespan, CacheSpan cachespan1)
	{
	//    0    0:return          
	}

	public void onStartFile(Cache cache, String s, long l, long l1)
	{
	//    0    0:return          
	}
}
