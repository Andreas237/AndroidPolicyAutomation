// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream.cache;

import java.util.Comparator;
import java.util.TreeSet;

// Referenced classes of package com.google.android.exoplayer.upstream.cache:
//			CacheEvictor, CacheSpan, Cache

public final class LeastRecentlyUsedCacheEvictor
	implements CacheEvictor, Comparator
{

	public LeastRecentlyUsedCacheEvictor(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		maxBytes = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #22  <Field long maxBytes>
	//    5    9:aload_0         
	//    6   10:new             #24  <Class TreeSet>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #27  <Method void TreeSet(Comparator)>
	//   10   18:putfield        #29  <Field TreeSet leastRecentlyUsed>
	//   11   21:return          
	}

	private void evictCache(Cache cache, long l)
	{
		while(currentSize + l > maxBytes) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field long currentSize>
	//*   2    4:lload_2         
	//*   3    5:ladd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #22  <Field long maxBytes>
	//*   6   10:lcmp            
	//*   7   11:ifle            33
			try
			{
				cache.removeSpan((CacheSpan)leastRecentlyUsed.first());
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #29  <Field TreeSet leastRecentlyUsed>
	//   11   19:invokevirtual   #40  <Method Object TreeSet.first()>
	//   12   22:checkcast       #42  <Class CacheSpan>
	//   13   25:invokeinterface #48  <Method void Cache.removeSpan(CacheSpan)>
			}
	//*  14   30:goto            0
	//*  15   33:return          
			catch(Cache.CacheException cacheexception) { }
	//   16   34:astore          4
	//*  17   36:goto            0
	}

	public int compare(CacheSpan cachespan, CacheSpan cachespan1)
	{
		if(cachespan.lastAccessTimestamp - cachespan1.lastAccessTimestamp == 0L)
	//*   0    0:aload_1         
	//*   1    1:getfield        #53  <Field long CacheSpan.lastAccessTimestamp>
	//*   2    4:aload_2         
	//*   3    5:getfield        #53  <Field long CacheSpan.lastAccessTimestamp>
	//*   4    8:lsub            
	//*   5    9:lconst_0        
	//*   6   10:lcmp            
	//*   7   11:ifne            20
			return cachespan.compareTo(cachespan1);
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #57  <Method int CacheSpan.compareTo(CacheSpan)>
	//   11   19:ireturn         
		return cachespan.lastAccessTimestamp >= cachespan1.lastAccessTimestamp ? 1 : -1;
	//   12   20:aload_1         
	//   13   21:getfield        #53  <Field long CacheSpan.lastAccessTimestamp>
	//   14   24:aload_2         
	//   15   25:getfield        #53  <Field long CacheSpan.lastAccessTimestamp>
	//   16   28:lcmp            
	//   17   29:ifge            34
	//   18   32:iconst_m1       
	//   19   33:ireturn         
	//   20   34:iconst_1        
	//   21   35:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((CacheSpan)obj, (CacheSpan)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #42  <Class CacheSpan>
	//    3    5:aload_2         
	//    4    6:checkcast       #42  <Class CacheSpan>
	//    5    9:invokevirtual   #60  <Method int compare(CacheSpan, CacheSpan)>
	//    6   12:ireturn         
	}

	public void onCacheInitialized()
	{
	//    0    0:return          
	}

	public void onSpanAdded(Cache cache, CacheSpan cachespan)
	{
		leastRecentlyUsed.add(((Object) (cachespan)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field TreeSet leastRecentlyUsed>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #67  <Method boolean TreeSet.add(Object)>
	//    4    8:pop             
		currentSize = currentSize + cachespan.length;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #36  <Field long currentSize>
	//    8   14:aload_2         
	//    9   15:getfield        #70  <Field long CacheSpan.length>
	//   10   18:ladd            
	//   11   19:putfield        #36  <Field long currentSize>
		evictCache(cache, 0L);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:lconst_0        
	//   15   25:invokespecial   #72  <Method void evictCache(Cache, long)>
	//   16   28:return          
	}

	public void onSpanRemoved(Cache cache, CacheSpan cachespan)
	{
		leastRecentlyUsed.remove(((Object) (cachespan)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field TreeSet leastRecentlyUsed>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #76  <Method boolean TreeSet.remove(Object)>
	//    4    8:pop             
		currentSize = currentSize - cachespan.length;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #36  <Field long currentSize>
	//    8   14:aload_2         
	//    9   15:getfield        #70  <Field long CacheSpan.length>
	//   10   18:lsub            
	//   11   19:putfield        #36  <Field long currentSize>
	//   12   22:return          
	}

	public void onSpanTouched(Cache cache, CacheSpan cachespan, CacheSpan cachespan1)
	{
		onSpanRemoved(cache, cachespan);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #80  <Method void onSpanRemoved(Cache, CacheSpan)>
		onSpanAdded(cache, cachespan1);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_3         
	//    7    9:invokevirtual   #82  <Method void onSpanAdded(Cache, CacheSpan)>
	//    8   12:return          
	}

	public void onStartFile(Cache cache, String s, long l, long l1)
	{
		evictCache(cache, l1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload           5
	//    3    4:invokespecial   #72  <Method void evictCache(Cache, long)>
	//    4    7:return          
	}

	private long currentSize;
	private final TreeSet leastRecentlyUsed = new TreeSet(((Comparator) (this)));
	private final long maxBytes;
}
