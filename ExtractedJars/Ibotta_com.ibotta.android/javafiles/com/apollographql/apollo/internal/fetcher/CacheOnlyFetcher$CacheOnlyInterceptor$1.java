// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.fetcher;

import com.apollographql.apollo.exception.ApolloException;

// Referenced classes of package com.apollographql.apollo.internal.fetcher:
//			CacheOnlyFetcher

class CacheOnlyFetcher$CacheOnlyInterceptor$1
	implements com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack
{

	public void onCompleted()
	{
		val$callBack.onCompleted();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
	//    2    4:invokeinterface #35  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onCompleted()>
	//    3    9:return          
	}

	public void onFailure(ApolloException apolloexception)
	{
		val$callBack.onResponse(cacheMissResponse(val$request.operation));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field CacheOnlyFetcher$CacheOnlyInterceptor this$0>
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
	//    6   12:getfield        #44  <Field com.apollographql.apollo.api.Operation com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.operation>
	//    7   15:invokevirtual   #48  <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse CacheOnlyFetcher$CacheOnlyInterceptor.cacheMissResponse(com.apollographql.apollo.api.Operation)>
	//    8   18:invokeinterface #52  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse)>
		val$callBack.onCompleted();
	//    9   23:aload_0         
	//   10   24:getfield        #26  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
	//   11   27:invokeinterface #35  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onCompleted()>
	//   12   32:return          
	}

	public void onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor.FetchSourceType fetchsourcetype)
	{
		val$callBack.onFetch(fetchsourcetype);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
	//    2    4:aload_1         
	//    3    5:invokeinterface #57  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType)>
	//    4   10:return          
	}

	public void onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse interceptorresponse)
	{
		val$callBack.onResponse(interceptorresponse);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
	//    2    4:aload_1         
	//    3    5:invokeinterface #52  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse)>
	//    4   10:return          
	}

	final CacheOnlyFetcher.CacheOnlyInterceptor this$0;
	final com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack val$callBack;
	final com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest val$request;

	CacheOnlyFetcher$CacheOnlyInterceptor$1()
	{
		this$0 = final_cacheonlyinterceptor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field CacheOnlyFetcher$CacheOnlyInterceptor this$0>
		val$callBack = callback;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
		val$request = com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #31  <Method void Object()>
	//   11   19:return          
	}
}
