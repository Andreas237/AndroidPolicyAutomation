// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.cache;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.upstream.cache:
//			CacheDataSink

public static class CacheDataSink$CacheDataSinkException extends Cache.CacheException
{

	public CacheDataSink$CacheDataSinkException(IOException ioexception)
	{
		super(((Throwable) (ioexception)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void Cache$CacheException(Throwable)>
	//    3    5:return          
	}
}
