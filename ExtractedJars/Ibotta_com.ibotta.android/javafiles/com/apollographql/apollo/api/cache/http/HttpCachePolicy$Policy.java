// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api.cache.http;

import java.util.concurrent.TimeUnit;

// Referenced classes of package com.apollographql.apollo.api.cache.http:
//			HttpCachePolicy

public static class HttpCachePolicy$Policy
{

	public long expireTimeoutMs()
	{
		TimeUnit timeunit = expireTimeUnit;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field TimeUnit expireTimeUnit>
	//    2    4:astore_1        
		if(timeunit == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0L;
	//    5    9:lconst_0        
	//    6   10:lreturn         
		else
			return timeunit.toMillis(expireTimeout);
	//    7   11:aload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #24  <Field long expireTimeout>
	//   10   16:invokevirtual   #37  <Method long TimeUnit.toMillis(long)>
	//   11   19:lreturn         
	}

	public final boolean expireAfterRead;
	public final TimeUnit expireTimeUnit;
	public final long expireTimeout;
	public final rategy fetchStrategy;

	HttpCachePolicy$Policy(rategy rategy, long l, TimeUnit timeunit, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		fetchStrategy = rategy;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field HttpCachePolicy$FetchStrategy fetchStrategy>
		expireTimeout = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #24  <Field long expireTimeout>
		expireTimeUnit = timeunit;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #26  <Field TimeUnit expireTimeUnit>
		expireAfterRead = flag;
	//   11   20:aload_0         
	//   12   21:iload           5
	//   13   23:putfield        #28  <Field boolean expireAfterRead>
	//   14   26:return          
	}
}
