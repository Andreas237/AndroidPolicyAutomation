// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.DataSink;

// Referenced classes of package com.google.android.exoplayer2.upstream.cache:
//			CacheDataSink, Cache

public final class CacheDataSinkFactory
	implements com.google.android.exoplayer2.upstream.DataSink.Factory
{

	public CacheDataSinkFactory(Cache cache1, long l)
	{
		this(cache1, l, 20480);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:sipush          20480
	//    4    6:invokespecial   #17  <Method void CacheDataSinkFactory(Cache, long, int)>
	//    5    9:return          
	}

	public CacheDataSinkFactory(Cache cache1, long l, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		cache = cache1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Cache cache>
		maxCacheFileSize = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #25  <Field long maxCacheFileSize>
		bufferSize = i;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #27  <Field int bufferSize>
	//   11   20:return          
	}

	public DataSink createDataSink()
	{
		return ((DataSink) (new CacheDataSink(cache, maxCacheFileSize, bufferSize)));
	//    0    0:new             #31  <Class CacheDataSink>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field Cache cache>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field long maxCacheFileSize>
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field int bufferSize>
	//    8   16:invokespecial   #32  <Method void CacheDataSink(Cache, long, int)>
	//    9   19:areturn         
	}

	private final int bufferSize;
	private final Cache cache;
	private final long maxCacheFileSize;
}
