// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.cache;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.upstream.cache:
//			Cache

public static class Cache$CacheException extends IOException
{

	public Cache$CacheException(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void IOException(String)>
	//    3    5:return          
	}

	public Cache$CacheException(Throwable throwable)
	{
		super(throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void IOException(Throwable)>
	//    3    5:return          
	}
}
