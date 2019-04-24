// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.*;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.exoplayer2.offline:
//			Downloader, DownloaderConstructorHelper, FilterableManifest

public abstract class SegmentDownloader
	implements Downloader
{
	protected static class Segment
		implements Comparable
	{

		public int compareTo(Segment segment)
		{
			long l = startTimeUs - segment.startTimeUs;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field long startTimeUs>
		//    2    4:aload_1         
		//    3    5:getfield        #21  <Field long startTimeUs>
		//    4    8:lsub            
		//    5    9:lstore_2        
			if(l == 0L)
		//*   6   10:lload_2         
		//*   7   11:lconst_0        
		//*   8   12:lcmp            
		//*   9   13:ifne            18
				return 0;
		//   10   16:iconst_0        
		//   11   17:ireturn         
			return l >= 0L ? 1 : -1;
		//   12   18:lload_2         
		//   13   19:lconst_0        
		//   14   20:lcmp            
		//   15   21:ifge            26
		//   16   24:iconst_m1       
		//   17   25:ireturn         
		//   18   26:iconst_1        
		//   19   27:ireturn         
		}

		public volatile int compareTo(Object obj)
		{
			return compareTo((Segment)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #2   <Class SegmentDownloader$Segment>
		//    3    5:invokevirtual   #31  <Method int compareTo(SegmentDownloader$Segment)>
		//    4    8:ireturn         
		}

		public final DataSpec dataSpec;
		public final long startTimeUs;

		public Segment(long l, DataSpec dataspec)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			startTimeUs = l;
		//    2    4:aload_0         
		//    3    5:lload_1         
		//    4    6:putfield        #21  <Field long startTimeUs>
			dataSpec = dataspec;
		//    5    9:aload_0         
		//    6   10:aload_3         
		//    7   11:putfield        #23  <Field DataSpec dataSpec>
		//    8   14:return          
		}
	}


	public SegmentDownloader(Uri uri, List list, DownloaderConstructorHelper downloaderconstructorhelper)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		manifestUri = uri;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field Uri manifestUri>
		streamKeys = new ArrayList(((java.util.Collection) (list)));
	//    5    9:aload_0         
	//    6   10:new             #40  <Class ArrayList>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokespecial   #43  <Method void ArrayList(java.util.Collection)>
	//   10   18:putfield        #45  <Field ArrayList streamKeys>
		cache = downloaderconstructorhelper.getCache();
	//   11   21:aload_0         
	//   12   22:aload_3         
	//   13   23:invokevirtual   #51  <Method Cache DownloaderConstructorHelper.getCache()>
	//   14   26:putfield        #53  <Field Cache cache>
		dataSource = downloaderconstructorhelper.buildCacheDataSource(false);
	//   15   29:aload_0         
	//   16   30:aload_3         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #57  <Method CacheDataSource DownloaderConstructorHelper.buildCacheDataSource(boolean)>
	//   19   35:putfield        #59  <Field CacheDataSource dataSource>
		offlineDataSource = downloaderconstructorhelper.buildCacheDataSource(true);
	//   20   38:aload_0         
	//   21   39:aload_3         
	//   22   40:iconst_1        
	//   23   41:invokevirtual   #57  <Method CacheDataSource DownloaderConstructorHelper.buildCacheDataSource(boolean)>
	//   24   44:putfield        #61  <Field CacheDataSource offlineDataSource>
		priorityTaskManager = downloaderconstructorhelper.getPriorityTaskManager();
	//   25   47:aload_0         
	//   26   48:aload_3         
	//   27   49:invokevirtual   #65  <Method PriorityTaskManager DownloaderConstructorHelper.getPriorityTaskManager()>
	//   28   52:putfield        #67  <Field PriorityTaskManager priorityTaskManager>
		totalSegments = -1;
	//   29   55:aload_0         
	//   30   56:iconst_m1       
	//   31   57:putfield        #69  <Field int totalSegments>
	//   32   60:aload_0         
	//   33   61:new             #71  <Class AtomicBoolean>
	//   34   64:dup             
	//   35   65:invokespecial   #72  <Method void AtomicBoolean()>
	//   36   68:putfield        #74  <Field AtomicBoolean isCanceled>
	//   37   71:return          
	}

	private List initDownload()
		throws IOException, InterruptedException
	{
		Object obj1 = ((Object) (getManifest(((DataSource) (dataSource)), manifestUri)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #59  <Field CacheDataSource dataSource>
	//    3    5:aload_0         
	//    4    6:getfield        #38  <Field Uri manifestUri>
	//    5    9:invokevirtual   #87  <Method FilterableManifest getManifest(DataSource, Uri)>
	//    6   12:astore_3        
		Object obj = obj1;
	//    7   13:aload_3         
	//    8   14:astore_2        
		if(!streamKeys.isEmpty())
	//*   9   15:aload_0         
	//*  10   16:getfield        #45  <Field ArrayList streamKeys>
	//*  11   19:invokevirtual   #91  <Method boolean ArrayList.isEmpty()>
	//*  12   22:ifne            39
			obj = ((Object) ((FilterableManifest)((FilterableManifest) (obj1)).copy(((List) (streamKeys)))));
	//   13   25:aload_3         
	//   14   26:aload_0         
	//   15   27:getfield        #45  <Field ArrayList streamKeys>
	//   16   30:invokeinterface #97  <Method Object FilterableManifest.copy(List)>
	//   17   35:checkcast       #93  <Class FilterableManifest>
	//   18   38:astore_2        
		obj = ((Object) (getSegments(((DataSource) (dataSource)), ((FilterableManifest) (obj)), false)));
	//   19   39:aload_0         
	//   20   40:aload_0         
	//   21   41:getfield        #59  <Field CacheDataSource dataSource>
	//   22   44:aload_2         
	//   23   45:iconst_0        
	//   24   46:invokevirtual   #101 <Method List getSegments(DataSource, FilterableManifest, boolean)>
	//   25   49:astore_2        
		obj1 = ((Object) (new com.google.android.exoplayer2.upstream.cache.CacheUtil.CachingCounters()));
	//   26   50:new             #103 <Class com.google.android.exoplayer2.upstream.cache.CacheUtil$CachingCounters>
	//   27   53:dup             
	//   28   54:invokespecial   #104 <Method void com.google.android.exoplayer2.upstream.cache.CacheUtil$CachingCounters()>
	//   29   57:astore_3        
		totalSegments = ((List) (obj)).size();
	//   30   58:aload_0         
	//   31   59:aload_2         
	//   32   60:invokeinterface #110 <Method int List.size()>
	//   33   65:putfield        #69  <Field int totalSegments>
		downloadedSegments = 0;
	//   34   68:aload_0         
	//   35   69:iconst_0        
	//   36   70:putfield        #112 <Field int downloadedSegments>
		downloadedBytes = 0L;
	//   37   73:aload_0         
	//   38   74:lconst_0        
	//   39   75:putfield        #114 <Field long downloadedBytes>
		for(int i = ((List) (obj)).size() - 1; i >= 0; i--)
	//*  40   78:aload_2         
	//*  41   79:invokeinterface #110 <Method int List.size()>
	//*  42   84:iconst_1        
	//*  43   85:isub            
	//*  44   86:istore_1        
	//*  45   87:iload_1         
	//*  46   88:iflt            162
		{
			CacheUtil.getCached(((Segment)((List) (obj)).get(i)).dataSpec, cache, ((com.google.android.exoplayer2.upstream.cache.CacheUtil.CachingCounters) (obj1)));
	//   47   91:aload_2         
	//   48   92:iload_1         
	//   49   93:invokeinterface #118 <Method Object List.get(int)>
	//   50   98:checkcast       #9   <Class SegmentDownloader$Segment>
	//   51  101:getfield        #122 <Field DataSpec SegmentDownloader$Segment.dataSpec>
	//   52  104:aload_0         
	//   53  105:getfield        #53  <Field Cache cache>
	//   54  108:aload_3         
	//   55  109:invokestatic    #128 <Method void CacheUtil.getCached(DataSpec, Cache, com.google.android.exoplayer2.upstream.cache.CacheUtil$CachingCounters)>
			downloadedBytes = downloadedBytes + ((com.google.android.exoplayer2.upstream.cache.CacheUtil.CachingCounters) (obj1)).alreadyCachedBytes;
	//   56  112:aload_0         
	//   57  113:aload_0         
	//   58  114:getfield        #114 <Field long downloadedBytes>
	//   59  117:aload_3         
	//   60  118:getfield        #131 <Field long com.google.android.exoplayer2.upstream.cache.CacheUtil$CachingCounters.alreadyCachedBytes>
	//   61  121:ladd            
	//   62  122:putfield        #114 <Field long downloadedBytes>
			if(((com.google.android.exoplayer2.upstream.cache.CacheUtil.CachingCounters) (obj1)).alreadyCachedBytes == ((com.google.android.exoplayer2.upstream.cache.CacheUtil.CachingCounters) (obj1)).contentLength)
	//*  63  125:aload_3         
	//*  64  126:getfield        #131 <Field long com.google.android.exoplayer2.upstream.cache.CacheUtil$CachingCounters.alreadyCachedBytes>
	//*  65  129:aload_3         
	//*  66  130:getfield        #134 <Field long com.google.android.exoplayer2.upstream.cache.CacheUtil$CachingCounters.contentLength>
	//*  67  133:lcmp            
	//*  68  134:ifne            155
			{
				downloadedSegments = downloadedSegments + 1;
	//   69  137:aload_0         
	//   70  138:aload_0         
	//   71  139:getfield        #112 <Field int downloadedSegments>
	//   72  142:iconst_1        
	//   73  143:iadd            
	//   74  144:putfield        #112 <Field int downloadedSegments>
				((List) (obj)).remove(i);
	//   75  147:aload_2         
	//   76  148:iload_1         
	//   77  149:invokeinterface #137 <Method Object List.remove(int)>
	//   78  154:pop             
			}
		}

	//   79  155:iload_1         
	//   80  156:iconst_1        
	//   81  157:isub            
	//   82  158:istore_1        
	//*  83  159:goto            87
		return ((List) (obj));
	//   84  162:aload_2         
	//   85  163:areturn         
	}

	private void removeUri(Uri uri)
	{
		CacheUtil.remove(cache, CacheUtil.generateKey(uri));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Cache cache>
	//    2    4:aload_1         
	//    3    5:invokestatic    #145 <Method String CacheUtil.generateKey(Uri)>
	//    4    8:invokestatic    #148 <Method void CacheUtil.remove(Cache, String)>
	//    5   11:return          
	}

	public void cancel()
	{
		isCanceled.set(true);
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field AtomicBoolean isCanceled>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #153 <Method void AtomicBoolean.set(boolean)>
	//    4    8:return          
	}

	public final void download()
		throws IOException, InterruptedException
	{
		priorityTaskManager.add(-1000);
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field PriorityTaskManager priorityTaskManager>
	//    2    4:sipush          -1000
	//    3    7:invokevirtual   #160 <Method void PriorityTaskManager.add(int)>
		com.google.android.exoplayer2.upstream.cache.CacheUtil.CachingCounters cachingcounters;
		List list;
		byte abyte0[];
		list = initDownload();
	//    4   10:aload_0         
	//    5   11:invokespecial   #162 <Method List initDownload()>
	//    6   14:astore          4
		Collections.sort(list);
	//    7   16:aload           4
	//    8   18:invokestatic    #168 <Method void Collections.sort(List)>
		abyte0 = new byte[0x20000];
	//    9   21:ldc1            #13  <Int 0x20000>
	//   10   23:newarray        byte[]
	//   11   25:astore          5
		cachingcounters = new com.google.android.exoplayer2.upstream.cache.CacheUtil.CachingCounters();
	//   12   27:new             #103 <Class com.google.android.exoplayer2.upstream.cache.CacheUtil$CachingCounters>
	//   13   30:dup             
	//   14   31:invokespecial   #104 <Method void com.google.android.exoplayer2.upstream.cache.CacheUtil$CachingCounters()>
	//   15   34:astore_3        
		int i = 0;
	//   16   35:iconst_0        
	//   17   36:istore_1        
_L2:
		int j = list.size();
	//   18   37:aload           4
	//   19   39:invokeinterface #110 <Method int List.size()>
	//   20   44:istore_2        
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   21   45:iload_1         
	//   22   46:iload_2         
	//   23   47:icmpge          138
		CacheUtil.cache(((Segment)list.get(i)).dataSpec, cache, dataSource, abyte0, priorityTaskManager, -1000, cachingcounters, isCanceled, true);
	//   24   50:aload           4
	//   25   52:iload_1         
	//   26   53:invokeinterface #118 <Method Object List.get(int)>
	//   27   58:checkcast       #9   <Class SegmentDownloader$Segment>
	//   28   61:getfield        #122 <Field DataSpec SegmentDownloader$Segment.dataSpec>
	//   29   64:aload_0         
	//   30   65:getfield        #53  <Field Cache cache>
	//   31   68:aload_0         
	//   32   69:getfield        #59  <Field CacheDataSource dataSource>
	//   33   72:aload           5
	//   34   74:aload_0         
	//   35   75:getfield        #67  <Field PriorityTaskManager priorityTaskManager>
	//   36   78:sipush          -1000
	//   37   81:aload_3         
	//   38   82:aload_0         
	//   39   83:getfield        #74  <Field AtomicBoolean isCanceled>
	//   40   86:iconst_1        
	//   41   87:invokestatic    #171 <Method void CacheUtil.cache(DataSpec, Cache, CacheDataSource, byte[], PriorityTaskManager, int, com.google.android.exoplayer2.upstream.cache.CacheUtil$CachingCounters, AtomicBoolean, boolean)>
		downloadedSegments = downloadedSegments + 1;
	//   42   90:aload_0         
	//   43   91:aload_0         
	//   44   92:getfield        #112 <Field int downloadedSegments>
	//   45   95:iconst_1        
	//   46   96:iadd            
	//   47   97:putfield        #112 <Field int downloadedSegments>
		downloadedBytes = downloadedBytes + cachingcounters.newlyCachedBytes;
	//   48  100:aload_0         
	//   49  101:aload_0         
	//   50  102:getfield        #114 <Field long downloadedBytes>
	//   51  105:aload_3         
	//   52  106:getfield        #174 <Field long com.google.android.exoplayer2.upstream.cache.CacheUtil$CachingCounters.newlyCachedBytes>
	//   53  109:ladd            
	//   54  110:putfield        #114 <Field long downloadedBytes>
		i++;
	//   55  113:iload_1         
	//   56  114:iconst_1        
	//   57  115:iadd            
	//   58  116:istore_1        
		if(true) goto _L2; else goto _L1
	//   59  117:goto            37
		Exception exception1;
		exception1;
	//   60  120:astore          4
		downloadedBytes = downloadedBytes + cachingcounters.newlyCachedBytes;
	//   61  122:aload_0         
	//   62  123:aload_0         
	//   63  124:getfield        #114 <Field long downloadedBytes>
	//   64  127:aload_3         
	//   65  128:getfield        #174 <Field long com.google.android.exoplayer2.upstream.cache.CacheUtil$CachingCounters.newlyCachedBytes>
	//   66  131:ladd            
	//   67  132:putfield        #114 <Field long downloadedBytes>
		throw exception1;
	//   68  135:aload           4
	//   69  137:athrow          
_L1:
		priorityTaskManager.remove(-1000);
	//   70  138:aload_0         
	//   71  139:getfield        #67  <Field PriorityTaskManager priorityTaskManager>
	//   72  142:sipush          -1000
	//   73  145:invokevirtual   #176 <Method void PriorityTaskManager.remove(int)>
		return;
	//   74  148:return          
		Exception exception;
		exception;
	//   75  149:astore_3        
		priorityTaskManager.remove(-1000);
	//   76  150:aload_0         
	//   77  151:getfield        #67  <Field PriorityTaskManager priorityTaskManager>
	//   78  154:sipush          -1000
	//   79  157:invokevirtual   #176 <Method void PriorityTaskManager.remove(int)>
		throw exception;
	//   80  160:aload_3         
	//   81  161:athrow          
	}

	public final float getDownloadPercentage()
	{
		int i = totalSegments;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int totalSegments>
	//    2    4:istore_1        
		int j = downloadedSegments;
	//    3    5:aload_0         
	//    4    6:getfield        #112 <Field int downloadedSegments>
	//    5    9:istore_2        
		if(i != -1 && j != -1)
	//*   6   10:iload_1         
	//*   7   11:iconst_m1       
	//*   8   12:icmpeq          39
	//*   9   15:iload_2         
	//*  10   16:iconst_m1       
	//*  11   17:icmpne          23
	//*  12   20:goto            39
		{
			if(i == 0)
	//*  13   23:iload_1         
	//*  14   24:ifne            30
				return 100F;
	//   15   27:ldc1            #179 <Float 100F>
	//   16   29:freturn         
			else
				return ((float)j * 100F) / (float)i;
	//   17   30:iload_2         
	//   18   31:i2f             
	//   19   32:ldc1            #179 <Float 100F>
	//   20   34:fmul            
	//   21   35:iload_1         
	//   22   36:i2f             
	//   23   37:fdiv            
	//   24   38:freturn         
		} else
		{
			return -1F;
	//   25   39:ldc1            #180 <Float -1F>
	//   26   41:freturn         
		}
	}

	public final long getDownloadedBytes()
	{
		return downloadedBytes;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field long downloadedBytes>
	//    2    4:lreturn         
	}

	protected abstract FilterableManifest getManifest(DataSource datasource, Uri uri)
		throws IOException;

	protected abstract List getSegments(DataSource datasource, FilterableManifest filterablemanifest, boolean flag)
		throws InterruptedException, IOException;

	public final void remove()
		throws InterruptedException
	{
		Object obj;
		obj = ((Object) (getManifest(((DataSource) (offlineDataSource)), manifestUri)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field CacheDataSource offlineDataSource>
	//    3    5:aload_0         
	//    4    6:getfield        #38  <Field Uri manifestUri>
	//    5    9:invokevirtual   #87  <Method FilterableManifest getManifest(DataSource, Uri)>
	//    6   12:astore_2        
		obj = ((Object) (getSegments(((DataSource) (offlineDataSource)), ((FilterableManifest) (obj)), true)));
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #61  <Field CacheDataSource offlineDataSource>
	//   10   18:aload_2         
	//   11   19:iconst_1        
	//   12   20:invokevirtual   #101 <Method List getSegments(DataSource, FilterableManifest, boolean)>
	//   13   23:astore_2        
		int i = 0;
	//   14   24:iconst_0        
	//   15   25:istore_1        
_L2:
		if(i >= ((List) (obj)).size())
			break; /* Loop/switch isn't completed */
	//   16   26:iload_1         
	//   17   27:aload_2         
	//   18   28:invokeinterface #110 <Method int List.size()>
	//   19   33:icmpge          74
		removeUri(((Segment)((List) (obj)).get(i)).dataSpec.uri);
	//   20   36:aload_0         
	//   21   37:aload_2         
	//   22   38:iload_1         
	//   23   39:invokeinterface #118 <Method Object List.get(int)>
	//   24   44:checkcast       #9   <Class SegmentDownloader$Segment>
	//   25   47:getfield        #122 <Field DataSpec SegmentDownloader$Segment.dataSpec>
	//   26   50:getfield        #187 <Field Uri DataSpec.uri>
	//   27   53:invokespecial   #189 <Method void removeUri(Uri)>
		i++;
	//   28   56:iload_1         
	//   29   57:iconst_1        
	//   30   58:iadd            
	//   31   59:istore_1        
		if(true) goto _L2; else goto _L1
	//   32   60:goto            26
		Object obj1;
		obj1;
	//   33   63:astore_2        
		removeUri(manifestUri);
	//   34   64:aload_0         
	//   35   65:aload_0         
	//   36   66:getfield        #38  <Field Uri manifestUri>
	//   37   69:invokespecial   #189 <Method void removeUri(Uri)>
		throw obj1;
	//   38   72:aload_2         
	//   39   73:athrow          
_L1:
		removeUri(manifestUri);
	//   40   74:aload_0         
	//   41   75:aload_0         
	//   42   76:getfield        #38  <Field Uri manifestUri>
	//   43   79:invokespecial   #189 <Method void removeUri(Uri)>
		return;
	//   44   82:return          
		obj1;
	//   45   83:astore_2        
		if(true) goto _L1; else goto _L3
_L3:
	//*  46   84:goto            74
	}

	private static final int BUFFER_SIZE_BYTES = 0x20000;
	private final Cache cache;
	private final CacheDataSource dataSource;
	private volatile long downloadedBytes;
	private volatile int downloadedSegments;
	private final AtomicBoolean isCanceled = new AtomicBoolean();
	private final Uri manifestUri;
	private final CacheDataSource offlineDataSource;
	private final PriorityTaskManager priorityTaskManager;
	private final ArrayList streamKeys;
	private volatile int totalSegments;
}
