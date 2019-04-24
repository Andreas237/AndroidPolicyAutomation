// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.*;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.exoplayer2.offline:
//			Downloader, DownloaderConstructorHelper

public final class ProgressiveDownloader
	implements Downloader
{

	public ProgressiveDownloader(Uri uri, String s, DownloaderConstructorHelper downloaderconstructorhelper)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		dataSpec = new DataSpec(uri, 0L, -1L, s, 0);
	//    2    4:aload_0         
	//    3    5:new             #28  <Class DataSpec>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:lconst_0        
	//    7   11:ldc2w           #29  <Long -1L>
	//    8   14:aload_2         
	//    9   15:iconst_0        
	//   10   16:invokespecial   #33  <Method void DataSpec(Uri, long, long, String, int)>
	//   11   19:putfield        #35  <Field DataSpec dataSpec>
		cache = downloaderconstructorhelper.getCache();
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:invokevirtual   #41  <Method Cache DownloaderConstructorHelper.getCache()>
	//   15   27:putfield        #43  <Field Cache cache>
		dataSource = downloaderconstructorhelper.buildCacheDataSource(false);
	//   16   30:aload_0         
	//   17   31:aload_3         
	//   18   32:iconst_0        
	//   19   33:invokevirtual   #47  <Method CacheDataSource DownloaderConstructorHelper.buildCacheDataSource(boolean)>
	//   20   36:putfield        #49  <Field CacheDataSource dataSource>
		priorityTaskManager = downloaderconstructorhelper.getPriorityTaskManager();
	//   21   39:aload_0         
	//   22   40:aload_3         
	//   23   41:invokevirtual   #53  <Method PriorityTaskManager DownloaderConstructorHelper.getPriorityTaskManager()>
	//   24   44:putfield        #55  <Field PriorityTaskManager priorityTaskManager>
	//   25   47:aload_0         
	//   26   48:new             #57  <Class com.google.android.exoplayer2.upstream.cache.CacheUtil$CachingCounters>
	//   27   51:dup             
	//   28   52:invokespecial   #58  <Method void com.google.android.exoplayer2.upstream.cache.CacheUtil$CachingCounters()>
	//   29   55:putfield        #60  <Field com.google.android.exoplayer2.upstream.cache.CacheUtil$CachingCounters cachingCounters>
	//   30   58:aload_0         
	//   31   59:new             #62  <Class AtomicBoolean>
	//   32   62:dup             
	//   33   63:invokespecial   #63  <Method void AtomicBoolean()>
	//   34   66:putfield        #65  <Field AtomicBoolean isCanceled>
	//   35   69:return          
	}

	public void cancel()
	{
		isCanceled.set(true);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field AtomicBoolean isCanceled>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #71  <Method void AtomicBoolean.set(boolean)>
	//    4    8:return          
	}

	public void download()
		throws InterruptedException, IOException
	{
		priorityTaskManager.add(-1000);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field PriorityTaskManager priorityTaskManager>
	//    2    4:sipush          -1000
	//    3    7:invokevirtual   #82  <Method void PriorityTaskManager.add(int)>
		CacheUtil.cache(dataSpec, cache, dataSource, new byte[0x20000], priorityTaskManager, -1000, cachingCounters, isCanceled, true);
	//    4   10:aload_0         
	//    5   11:getfield        #35  <Field DataSpec dataSpec>
	//    6   14:aload_0         
	//    7   15:getfield        #43  <Field Cache cache>
	//    8   18:aload_0         
	//    9   19:getfield        #49  <Field CacheDataSource dataSource>
	//   10   22:ldc1            #9   <Int 0x20000>
	//   11   24:newarray        byte[]
	//   12   26:aload_0         
	//   13   27:getfield        #55  <Field PriorityTaskManager priorityTaskManager>
	//   14   30:sipush          -1000
	//   15   33:aload_0         
	//   16   34:getfield        #60  <Field com.google.android.exoplayer2.upstream.cache.CacheUtil$CachingCounters cachingCounters>
	//   17   37:aload_0         
	//   18   38:getfield        #65  <Field AtomicBoolean isCanceled>
	//   19   41:iconst_1        
	//   20   42:invokestatic    #87  <Method void CacheUtil.cache(DataSpec, Cache, CacheDataSource, byte[], PriorityTaskManager, int, com.google.android.exoplayer2.upstream.cache.CacheUtil$CachingCounters, AtomicBoolean, boolean)>
		priorityTaskManager.remove(-1000);
	//   21   45:aload_0         
	//   22   46:getfield        #55  <Field PriorityTaskManager priorityTaskManager>
	//   23   49:sipush          -1000
	//   24   52:invokevirtual   #90  <Method void PriorityTaskManager.remove(int)>
		return;
	//   25   55:return          
		Exception exception;
		exception;
	//   26   56:astore_1        
		priorityTaskManager.remove(-1000);
	//   27   57:aload_0         
	//   28   58:getfield        #55  <Field PriorityTaskManager priorityTaskManager>
	//   29   61:sipush          -1000
	//   30   64:invokevirtual   #90  <Method void PriorityTaskManager.remove(int)>
		throw exception;
	//   31   67:aload_1         
	//   32   68:athrow          
	}

	public float getDownloadPercentage()
	{
		long l = cachingCounters.contentLength;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field com.google.android.exoplayer2.upstream.cache.CacheUtil$CachingCounters cachingCounters>
	//    2    4:getfield        #97  <Field long com.google.android.exoplayer2.upstream.cache.CacheUtil$CachingCounters.contentLength>
	//    3    7:lstore_1        
		if(l == -1L)
	//*   4    8:lload_1         
	//*   5    9:ldc2w           #29  <Long -1L>
	//*   6   12:lcmp            
	//*   7   13:ifne            19
			return -1F;
	//    8   16:ldc1            #98  <Float -1F>
	//    9   18:freturn         
		else
			return ((float)cachingCounters.totalCachedBytes() * 100F) / (float)l;
	//   10   19:aload_0         
	//   11   20:getfield        #60  <Field com.google.android.exoplayer2.upstream.cache.CacheUtil$CachingCounters cachingCounters>
	//   12   23:invokevirtual   #102 <Method long com.google.android.exoplayer2.upstream.cache.CacheUtil$CachingCounters.totalCachedBytes()>
	//   13   26:l2f             
	//   14   27:ldc1            #103 <Float 100F>
	//   15   29:fmul            
	//   16   30:lload_1         
	//   17   31:l2f             
	//   18   32:fdiv            
	//   19   33:freturn         
	}

	public long getDownloadedBytes()
	{
		return cachingCounters.totalCachedBytes();
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field com.google.android.exoplayer2.upstream.cache.CacheUtil$CachingCounters cachingCounters>
	//    2    4:invokevirtual   #102 <Method long com.google.android.exoplayer2.upstream.cache.CacheUtil$CachingCounters.totalCachedBytes()>
	//    3    7:lreturn         
	}

	public void remove()
	{
		CacheUtil.remove(cache, CacheUtil.getKey(dataSpec));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Cache cache>
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field DataSpec dataSpec>
	//    4    8:invokestatic    #108 <Method String CacheUtil.getKey(DataSpec)>
	//    5   11:invokestatic    #111 <Method void CacheUtil.remove(Cache, String)>
	//    6   14:return          
	}

	private static final int BUFFER_SIZE_BYTES = 0x20000;
	private final Cache cache;
	private final com.google.android.exoplayer2.upstream.cache.CacheUtil.CachingCounters cachingCounters = new com.google.android.exoplayer2.upstream.cache.CacheUtil.CachingCounters();
	private final CacheDataSource dataSource;
	private final DataSpec dataSpec;
	private final AtomicBoolean isCanceled = new AtomicBoolean();
	private final PriorityTaskManager priorityTaskManager;
}
