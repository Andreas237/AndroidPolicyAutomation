// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.http;

import com.apollographql.apollo.internal.ApolloLogger;
import okio.BufferedSink;

// Referenced classes of package com.apollographql.apollo.cache.http:
//			ResponseBodyCacheSink, ResponseBodyProxy

class ResponseBodyProxy$ProxySource$1 extends ResponseBodyCacheSink
{

	void onException(Exception exception)
	{
		abortCacheQuietly();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ResponseBodyProxy$ProxySource this$0>
	//    2    4:invokevirtual   #31  <Method void ResponseBodyProxy$ProxySource.abortCacheQuietly()>
		val$logger.w(((Throwable) (exception)), "Operation failed", new Object[0]);
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field ApolloLogger val$logger>
	//    5   11:aload_1         
	//    6   12:ldc1            #33  <String "Operation failed">
	//    7   14:iconst_0        
	//    8   15:anewarray       Object[]
	//    9   18:invokevirtual   #41  <Method void ApolloLogger.w(Throwable, String, Object[])>
	//   10   21:return          
	}

	final ResponseBodyProxy.ProxySource this$0;
	final ApolloLogger val$logger;

	ResponseBodyProxy$ProxySource$1(ApolloLogger apollologger)
	{
		this$0 = final_proxysource;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ResponseBodyProxy$ProxySource this$0>
		val$logger = apollologger;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #21  <Field ApolloLogger val$logger>
		super(BufferedSink.this);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #24  <Method void ResponseBodyCacheSink(BufferedSink)>
	//    9   15:return          
	}
}
