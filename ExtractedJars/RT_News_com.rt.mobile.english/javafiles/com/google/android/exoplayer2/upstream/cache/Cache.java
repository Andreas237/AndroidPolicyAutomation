// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.cache;

import java.io.File;
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Set;

// Referenced classes of package com.google.android.exoplayer2.upstream.cache:
//			ContentMetadataMutations, ContentMetadata, CacheSpan

public interface Cache
{
	public static class CacheException extends IOException
	{

		public CacheException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void IOException(String)>
		//    3    5:return          
		}

		public CacheException(Throwable throwable)
		{
			super(throwable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #15  <Method void IOException(Throwable)>
		//    3    5:return          
		}
	}

	public static interface Listener
	{

		public abstract void onSpanAdded(Cache cache, CacheSpan cachespan);

		public abstract void onSpanRemoved(Cache cache, CacheSpan cachespan);

		public abstract void onSpanTouched(Cache cache, CacheSpan cachespan, CacheSpan cachespan1);
	}


	public abstract NavigableSet addListener(String s, Listener listener);

	public abstract void applyContentMetadataMutations(String s, ContentMetadataMutations contentmetadatamutations)
		throws CacheException;

	public abstract void commitFile(File file)
		throws CacheException;

	public abstract long getCacheSpace();

	public abstract long getCachedLength(String s, long l, long l1);

	public abstract NavigableSet getCachedSpans(String s);

	public abstract long getContentLength(String s);

	public abstract ContentMetadata getContentMetadata(String s);

	public abstract Set getKeys();

	public abstract boolean isCached(String s, long l, long l1);

	public abstract void release()
		throws CacheException;

	public abstract void releaseHoleSpan(CacheSpan cachespan);

	public abstract void removeListener(String s, Listener listener);

	public abstract void removeSpan(CacheSpan cachespan)
		throws CacheException;

	public abstract void setContentLength(String s, long l)
		throws CacheException;

	public abstract File startFile(String s, long l, long l1)
		throws CacheException;

	public abstract CacheSpan startReadWrite(String s, long l)
		throws InterruptedException, CacheException;

	public abstract CacheSpan startReadWriteNonBlocking(String s, long l)
		throws CacheException;
}
