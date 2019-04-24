// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.upstream.*;
import com.google.android.exoplayer2.upstream.cache.*;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.PriorityTaskManager;

public final class DownloaderConstructorHelper
{

	public DownloaderConstructorHelper(Cache cache1, com.google.android.exoplayer2.upstream.DataSource.Factory factory)
	{
		this(cache1, factory, ((com.google.android.exoplayer2.upstream.DataSource.Factory) (null)), ((com.google.android.exoplayer2.upstream.DataSink.Factory) (null)), ((PriorityTaskManager) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokespecial   #18  <Method void DownloaderConstructorHelper(Cache, com.google.android.exoplayer2.upstream.DataSource$Factory, com.google.android.exoplayer2.upstream.DataSource$Factory, com.google.android.exoplayer2.upstream.DataSink$Factory, PriorityTaskManager)>
	//    7    9:return          
	}

	public DownloaderConstructorHelper(Cache cache1, com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.upstream.DataSource.Factory factory1, com.google.android.exoplayer2.upstream.DataSink.Factory factory2, PriorityTaskManager prioritytaskmanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		Assertions.checkNotNull(((Object) (factory)));
	//    2    4:aload_2         
	//    3    5:invokestatic    #29  <Method Object Assertions.checkNotNull(Object)>
	//    4    8:pop             
		cache = cache1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #31  <Field Cache cache>
		upstreamDataSourceFactory = factory;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #33  <Field com.google.android.exoplayer2.upstream.DataSource$Factory upstreamDataSourceFactory>
		cacheReadDataSourceFactory = factory1;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #35  <Field com.google.android.exoplayer2.upstream.DataSource$Factory cacheReadDataSourceFactory>
		cacheWriteDataSinkFactory = factory2;
	//   14   24:aload_0         
	//   15   25:aload           4
	//   16   27:putfield        #37  <Field com.google.android.exoplayer2.upstream.DataSink$Factory cacheWriteDataSinkFactory>
		priorityTaskManager = prioritytaskmanager;
	//   17   30:aload_0         
	//   18   31:aload           5
	//   19   33:putfield        #39  <Field PriorityTaskManager priorityTaskManager>
	//   20   36:return          
	}

	public CacheDataSource buildCacheDataSource(boolean flag)
	{
		Object obj;
		if(cacheReadDataSourceFactory != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field com.google.android.exoplayer2.upstream.DataSource$Factory cacheReadDataSourceFactory>
	//*   2    4:ifnull          20
			obj = ((Object) (cacheReadDataSourceFactory.createDataSource()));
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field com.google.android.exoplayer2.upstream.DataSource$Factory cacheReadDataSourceFactory>
	//    5   11:invokeinterface #48  <Method com.google.android.exoplayer2.upstream.DataSource com.google.android.exoplayer2.upstream.DataSource$Factory.createDataSource()>
	//    6   16:astore_2        
		else
	//*   7   17:goto            31
			obj = ((Object) (new FileDataSource()));
	//    8   20:new             #50  <Class FileDataSource>
	//    9   23:dup             
	//   10   24:invokespecial   #51  <Method void FileDataSource()>
	//   11   27:astore_2        
	//*  12   28:goto            17
		if(flag)
	//*  13   31:iload_1         
	//*  14   32:ifeq            54
			return new CacheDataSource(cache, ((com.google.android.exoplayer2.upstream.DataSource) (DummyDataSource.INSTANCE)), ((com.google.android.exoplayer2.upstream.DataSource) (obj)), ((com.google.android.exoplayer2.upstream.DataSink) (null)), 1, ((com.google.android.exoplayer2.upstream.cache.CacheDataSource.EventListener) (null)));
	//   15   35:new             #53  <Class CacheDataSource>
	//   16   38:dup             
	//   17   39:aload_0         
	//   18   40:getfield        #31  <Field Cache cache>
	//   19   43:getstatic       #59  <Field DummyDataSource DummyDataSource.INSTANCE>
	//   20   46:aload_2         
	//   21   47:aconst_null     
	//   22   48:iconst_1        
	//   23   49:aconst_null     
	//   24   50:invokespecial   #62  <Method void CacheDataSource(Cache, com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.DataSink, int, com.google.android.exoplayer2.upstream.cache.CacheDataSource$EventListener)>
	//   25   53:areturn         
		Object obj1;
		if(cacheWriteDataSinkFactory != null)
	//*  26   54:aload_0         
	//*  27   55:getfield        #37  <Field com.google.android.exoplayer2.upstream.DataSink$Factory cacheWriteDataSinkFactory>
	//*  28   58:ifnull          74
			obj1 = ((Object) (cacheWriteDataSinkFactory.createDataSink()));
	//   29   61:aload_0         
	//   30   62:getfield        #37  <Field com.google.android.exoplayer2.upstream.DataSink$Factory cacheWriteDataSinkFactory>
	//   31   65:invokeinterface #68  <Method com.google.android.exoplayer2.upstream.DataSink com.google.android.exoplayer2.upstream.DataSink$Factory.createDataSink()>
	//   32   70:astore_3        
		else
	//*  33   71:goto            92
			obj1 = ((Object) (new CacheDataSink(cache, 0x200000L)));
	//   34   74:new             #70  <Class CacheDataSink>
	//   35   77:dup             
	//   36   78:aload_0         
	//   37   79:getfield        #31  <Field Cache cache>
	//   38   82:ldc2w           #71  <Long 0x200000L>
	//   39   85:invokespecial   #75  <Method void CacheDataSink(Cache, long)>
	//   40   88:astore_3        
	//*  41   89:goto            71
		Object obj2 = ((Object) (upstreamDataSourceFactory.createDataSource()));
	//   42   92:aload_0         
	//   43   93:getfield        #33  <Field com.google.android.exoplayer2.upstream.DataSource$Factory upstreamDataSourceFactory>
	//   44   96:invokeinterface #48  <Method com.google.android.exoplayer2.upstream.DataSource com.google.android.exoplayer2.upstream.DataSource$Factory.createDataSource()>
	//   45  101:astore          4
		if(priorityTaskManager != null)
	//*  46  103:aload_0         
	//*  47  104:getfield        #39  <Field PriorityTaskManager priorityTaskManager>
	//*  48  107:ifnonnull       113
	//*  49  110:goto            131
			obj2 = ((Object) (new PriorityDataSource(((com.google.android.exoplayer2.upstream.DataSource) (obj2)), priorityTaskManager, -1000)));
	//   50  113:new             #77  <Class PriorityDataSource>
	//   51  116:dup             
	//   52  117:aload           4
	//   53  119:aload_0         
	//   54  120:getfield        #39  <Field PriorityTaskManager priorityTaskManager>
	//   55  123:sipush          -1000
	//   56  126:invokespecial   #80  <Method void PriorityDataSource(com.google.android.exoplayer2.upstream.DataSource, PriorityTaskManager, int)>
	//   57  129:astore          4
		return new CacheDataSource(cache, ((com.google.android.exoplayer2.upstream.DataSource) (obj2)), ((com.google.android.exoplayer2.upstream.DataSource) (obj)), ((com.google.android.exoplayer2.upstream.DataSink) (obj1)), 1, ((com.google.android.exoplayer2.upstream.cache.CacheDataSource.EventListener) (null)));
	//   58  131:new             #53  <Class CacheDataSource>
	//   59  134:dup             
	//   60  135:aload_0         
	//   61  136:getfield        #31  <Field Cache cache>
	//   62  139:aload           4
	//   63  141:aload_2         
	//   64  142:aload_3         
	//   65  143:iconst_1        
	//   66  144:aconst_null     
	//   67  145:invokespecial   #62  <Method void CacheDataSource(Cache, com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.DataSink, int, com.google.android.exoplayer2.upstream.cache.CacheDataSource$EventListener)>
	//   68  148:areturn         
	}

	public Cache getCache()
	{
		return cache;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Cache cache>
	//    2    4:areturn         
	}

	public PriorityTaskManager getPriorityTaskManager()
	{
		if(priorityTaskManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field PriorityTaskManager priorityTaskManager>
	//*   2    4:ifnull          12
			return priorityTaskManager;
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field PriorityTaskManager priorityTaskManager>
	//    5   11:areturn         
		else
			return new PriorityTaskManager();
	//    6   12:new             #86  <Class PriorityTaskManager>
	//    7   15:dup             
	//    8   16:invokespecial   #87  <Method void PriorityTaskManager()>
	//    9   19:areturn         
	}

	private final Cache cache;
	private final com.google.android.exoplayer2.upstream.DataSource.Factory cacheReadDataSourceFactory;
	private final com.google.android.exoplayer2.upstream.DataSink.Factory cacheWriteDataSinkFactory;
	private final PriorityTaskManager priorityTaskManager;
	private final com.google.android.exoplayer2.upstream.DataSource.Factory upstreamDataSourceFactory;
}
