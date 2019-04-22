// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.fetcher;

import com.apollographql.apollo.fetcher.ResponseFetcher;
import com.apollographql.apollo.interceptor.ApolloInterceptor;
import com.apollographql.apollo.interceptor.ApolloInterceptorChain;
import com.apollographql.apollo.internal.ApolloLogger;
import java.util.concurrent.Executor;

public final class NetworkOnlyFetcher
	implements ResponseFetcher
{
	private static final class NetworkOnlyInterceptor
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

		private NetworkOnlyInterceptor()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}


	public NetworkOnlyFetcher()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public ApolloInterceptor provideInterceptor(ApolloLogger apollologger)
	{
		return ((ApolloInterceptor) (new NetworkOnlyInterceptor()));
	//    0    0:new             #10  <Class NetworkOnlyFetcher$NetworkOnlyInterceptor>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #21  <Method void NetworkOnlyFetcher$NetworkOnlyInterceptor(NetworkOnlyFetcher$1)>
	//    4    8:areturn         
	}
}
