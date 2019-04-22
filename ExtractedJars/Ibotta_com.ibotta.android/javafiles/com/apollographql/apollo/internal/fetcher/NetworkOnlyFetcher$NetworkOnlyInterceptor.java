// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.fetcher;

import com.apollographql.apollo.interceptor.ApolloInterceptor;
import com.apollographql.apollo.interceptor.ApolloInterceptorChain;
import java.util.concurrent.Executor;

// Referenced classes of package com.apollographql.apollo.internal.fetcher:
//			NetworkOnlyFetcher

private static final class NetworkOnlyFetcher$NetworkOnlyInterceptor
	implements ApolloInterceptor
{

	public void dispose()
	{
	//    0    0:return          
	}

	public void interceptAsync(com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest interceptorrequest, ApolloInterceptorChain apollointerceptorchain, Executor executor, com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack callback)
	{
		apollointerceptorchain.proceedAsync(interceptorrequest.toBuilder().fetchFromCache(false).build(), executor, callback);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #26  <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.toBuilder()>
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #32  <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder.fetchFromCache(boolean)>
	//    5    9:invokevirtual   #36  <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder.build()>
	//    6   12:aload_3         
	//    7   13:aload           4
	//    8   15:invokeinterface #42  <Method void ApolloInterceptorChain.proceedAsync(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest, Executor, com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack)>
	//    9   20:return          
	}

	private NetworkOnlyFetcher$NetworkOnlyInterceptor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	NetworkOnlyFetcher$NetworkOnlyInterceptor(NetworkOnlyFetcher._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void NetworkOnlyFetcher$NetworkOnlyInterceptor()>
	//    2    4:return          
	}
}
