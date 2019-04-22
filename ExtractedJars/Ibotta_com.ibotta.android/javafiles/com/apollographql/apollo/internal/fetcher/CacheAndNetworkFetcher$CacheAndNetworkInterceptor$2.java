// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.fetcher;

import com.apollographql.apollo.exception.ApolloException;

// Referenced classes of package com.apollographql.apollo.internal.fetcher:
//			CacheAndNetworkFetcher

class CacheAndNetworkFetcher$CacheAndNetworkInterceptor$2
	implements com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack
{

	public void onCompleted()
	{
	//    0    0:return          
	}

	public void onFailure(ApolloException apolloexception)
	{
		handleNetworkError(apolloexception);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field CacheAndNetworkFetcher$CacheAndNetworkInterceptor this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #35  <Method void CacheAndNetworkFetcher$CacheAndNetworkInterceptor.handleNetworkError(ApolloException)>
	//    4    8:return          
	}

	public void onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor.FetchSourceType fetchsourcetype)
	{
		val$callBack.onFetch(fetchsourcetype);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
	//    2    4:aload_1         
	//    3    5:invokeinterface #40  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType)>
	//    4   10:return          
	}

	public void onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse interceptorresponse)
	{
		handleNetworkResponse(interceptorresponse);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field CacheAndNetworkFetcher$CacheAndNetworkInterceptor this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #45  <Method void CacheAndNetworkFetcher$CacheAndNetworkInterceptor.handleNetworkResponse(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse)>
	//    4    8:return          
	}

	final CacheAndNetworkFetcher.CacheAndNetworkInterceptor this$0;
	final com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack val$callBack;

	CacheAndNetworkFetcher$CacheAndNetworkInterceptor$2()
	{
		this$0 = final_cacheandnetworkinterceptor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field CacheAndNetworkFetcher$CacheAndNetworkInterceptor this$0>
		val$callBack = com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
