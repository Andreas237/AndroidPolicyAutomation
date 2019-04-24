// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.cache;


// Referenced classes of package com.google.android.exoplayer2.upstream.cache:
//			CacheUtil

public static class CacheUtil$CachingCounters
{

	public long totalCachedBytes()
	{
		return alreadyCachedBytes + newlyCachedBytes;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field long alreadyCachedBytes>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field long newlyCachedBytes>
	//    4    8:ladd            
	//    5    9:lreturn         
	}

	public volatile long alreadyCachedBytes;
	public volatile long contentLength;
	public volatile long newlyCachedBytes;

	public CacheUtil$CachingCounters()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		contentLength = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #16  <Long -1L>
	//    4    8:putfield        #19  <Field long contentLength>
	//    5   11:return          
	}
}
