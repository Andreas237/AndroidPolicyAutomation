// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.FileDataSourceFactory;

// Referenced classes of package com.google.android.exoplayer2.upstream.cache:
//			CacheDataSinkFactory, CacheDataSource, Cache

public final class CacheDataSourceFactory
	implements com.google.android.exoplayer2.upstream.DataSource.Factory
{

	public CacheDataSourceFactory(Cache cache1, com.google.android.exoplayer2.upstream.DataSource.Factory factory)
	{
		this(cache1, factory, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #22  <Method void CacheDataSourceFactory(Cache, com.google.android.exoplayer2.upstream.DataSource$Factory, int)>
	//    5    7:return          
	}

	public CacheDataSourceFactory(Cache cache1, com.google.android.exoplayer2.upstream.DataSource.Factory factory, int i)
	{
		this(cache1, factory, i, 0x200000L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:ldc2w           #24  <Long 0x200000L>
	//    5    7:invokespecial   #28  <Method void CacheDataSourceFactory(Cache, com.google.android.exoplayer2.upstream.DataSource$Factory, int, long)>
	//    6   10:return          
	}

	public CacheDataSourceFactory(Cache cache1, com.google.android.exoplayer2.upstream.DataSource.Factory factory, int i, long l)
	{
		this(cache1, factory, ((com.google.android.exoplayer2.upstream.DataSource.Factory) (new FileDataSourceFactory())), ((com.google.android.exoplayer2.upstream.DataSink.Factory) (new CacheDataSinkFactory(cache1, l))), i, ((CacheDataSource.EventListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #30  <Class FileDataSourceFactory>
	//    4    6:dup             
	//    5    7:invokespecial   #33  <Method void FileDataSourceFactory()>
	//    6   10:new             #35  <Class CacheDataSinkFactory>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:lload           4
	//   10   17:invokespecial   #38  <Method void CacheDataSinkFactory(Cache, long)>
	//   11   20:iload_3         
	//   12   21:aconst_null     
	//   13   22:invokespecial   #41  <Method void CacheDataSourceFactory(Cache, com.google.android.exoplayer2.upstream.DataSource$Factory, com.google.android.exoplayer2.upstream.DataSource$Factory, com.google.android.exoplayer2.upstream.DataSink$Factory, int, CacheDataSource$EventListener)>
	//   14   25:return          
	}

	public CacheDataSourceFactory(Cache cache1, com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.upstream.DataSource.Factory factory1, com.google.android.exoplayer2.upstream.DataSink.Factory factory2, int i, CacheDataSource.EventListener eventlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		cache = cache1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #44  <Field Cache cache>
		upstreamFactory = factory;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #46  <Field com.google.android.exoplayer2.upstream.DataSource$Factory upstreamFactory>
		cacheReadDataSourceFactory = factory1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #48  <Field com.google.android.exoplayer2.upstream.DataSource$Factory cacheReadDataSourceFactory>
		cacheWriteDataSinkFactory = factory2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #50  <Field com.google.android.exoplayer2.upstream.DataSink$Factory cacheWriteDataSinkFactory>
		flags = i;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #52  <Field int flags>
		eventListener = eventlistener;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #54  <Field CacheDataSource$EventListener eventListener>
	//   20   37:return          
	}

	public volatile DataSource createDataSource()
	{
		return ((DataSource) (createDataSource()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #59  <Method CacheDataSource createDataSource()>
	//    2    4:areturn         
	}

	public CacheDataSource createDataSource()
	{
		Cache cache1 = cache;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Cache cache>
	//    2    4:astore_2        
		DataSource datasource = upstreamFactory.createDataSource();
	//    3    5:aload_0         
	//    4    6:getfield        #46  <Field com.google.android.exoplayer2.upstream.DataSource$Factory upstreamFactory>
	//    5    9:invokeinterface #61  <Method DataSource com.google.android.exoplayer2.upstream.DataSource$Factory.createDataSource()>
	//    6   14:astore_3        
		DataSource datasource1 = cacheReadDataSourceFactory.createDataSource();
	//    7   15:aload_0         
	//    8   16:getfield        #48  <Field com.google.android.exoplayer2.upstream.DataSource$Factory cacheReadDataSourceFactory>
	//    9   19:invokeinterface #61  <Method DataSource com.google.android.exoplayer2.upstream.DataSource$Factory.createDataSource()>
	//   10   24:astore          4
		com.google.android.exoplayer2.upstream.DataSink datasink;
		if(cacheWriteDataSinkFactory != null)
	//*  11   26:aload_0         
	//*  12   27:getfield        #50  <Field com.google.android.exoplayer2.upstream.DataSink$Factory cacheWriteDataSinkFactory>
	//*  13   30:ifnull          46
			datasink = cacheWriteDataSinkFactory.createDataSink();
	//   14   33:aload_0         
	//   15   34:getfield        #50  <Field com.google.android.exoplayer2.upstream.DataSink$Factory cacheWriteDataSinkFactory>
	//   16   37:invokeinterface #67  <Method com.google.android.exoplayer2.upstream.DataSink com.google.android.exoplayer2.upstream.DataSink$Factory.createDataSink()>
	//   17   42:astore_1        
		else
	//*  18   43:goto            51
			datasink = null;
	//   19   46:aconst_null     
	//   20   47:astore_1        
	//*  21   48:goto            43
		return new CacheDataSource(cache1, datasource, datasource1, datasink, flags, eventListener);
	//   22   51:new             #69  <Class CacheDataSource>
	//   23   54:dup             
	//   24   55:aload_2         
	//   25   56:aload_3         
	//   26   57:aload           4
	//   27   59:aload_1         
	//   28   60:aload_0         
	//   29   61:getfield        #52  <Field int flags>
	//   30   64:aload_0         
	//   31   65:getfield        #54  <Field CacheDataSource$EventListener eventListener>
	//   32   68:invokespecial   #72  <Method void CacheDataSource(Cache, DataSource, DataSource, com.google.android.exoplayer2.upstream.DataSink, int, CacheDataSource$EventListener)>
	//   33   71:areturn         
	}

	private final Cache cache;
	private final com.google.android.exoplayer2.upstream.DataSource.Factory cacheReadDataSourceFactory;
	private final com.google.android.exoplayer2.upstream.DataSink.Factory cacheWriteDataSinkFactory;
	private final CacheDataSource.EventListener eventListener;
	private final int flags;
	private final com.google.android.exoplayer2.upstream.DataSource.Factory upstreamFactory;
}
