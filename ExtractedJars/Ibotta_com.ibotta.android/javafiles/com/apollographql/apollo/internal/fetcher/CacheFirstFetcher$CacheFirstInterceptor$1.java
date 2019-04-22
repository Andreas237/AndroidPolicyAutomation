// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.fetcher;

import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.interceptor.ApolloInterceptorChain;
import java.util.concurrent.Executor;

// Referenced classes of package com.apollographql.apollo.internal.fetcher:
//			CacheFirstFetcher

class CacheFirstFetcher$CacheFirstInterceptor$1
	implements com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack
{

	public void onCompleted()
	{
		val$callBack.onCompleted();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
	//    2    4:invokeinterface #43  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onCompleted()>
	//    3    9:return          
	}

	public void onFailure(ApolloException apolloexception)
	{
		if(!disposed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field CacheFirstFetcher$CacheFirstInterceptor this$0>
	//*   2    4:getfield        #50  <Field boolean CacheFirstFetcher$CacheFirstInterceptor.disposed>
	//*   3    7:ifne            43
		{
			apolloexception = ((ApolloException) (val$request.toBuilder().fetchFromCache(false).build()));
	//    4   10:aload_0         
	//    5   11:getfield        #32  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
	//    6   14:invokevirtual   #56  <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.toBuilder()>
	//    7   17:iconst_0        
	//    8   18:invokevirtual   #62  <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder.fetchFromCache(boolean)>
	//    9   21:invokevirtual   #66  <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder.build()>
	//   10   24:astore_1        
			val$chain.proceedAsync(((com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest) (apolloexception)), val$dispatcher, val$callBack);
	//   11   25:aload_0         
	//   12   26:getfield        #34  <Field ApolloInterceptorChain val$chain>
	//   13   29:aload_1         
	//   14   30:aload_0         
	//   15   31:getfield        #36  <Field Executor val$dispatcher>
	//   16   34:aload_0         
	//   17   35:getfield        #30  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
	//   18   38:invokeinterface #72  <Method void ApolloInterceptorChain.proceedAsync(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest, Executor, com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack)>
		}
	//   19   43:return          
	}

	public void onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor.FetchSourceType fetchsourcetype)
	{
		val$callBack.onFetch(fetchsourcetype);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
	//    2    4:aload_1         
	//    3    5:invokeinterface #77  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType)>
	//    4   10:return          
	}

	public void onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse interceptorresponse)
	{
		val$callBack.onResponse(interceptorresponse);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
	//    2    4:aload_1         
	//    3    5:invokeinterface #81  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse)>
	//    4   10:return          
	}

	final CacheFirstFetcher.CacheFirstInterceptor this$0;
	final com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack val$callBack;
	final ApolloInterceptorChain val$chain;
	final Executor val$dispatcher;
	final com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest val$request;

	CacheFirstFetcher$CacheFirstInterceptor$1()
	{
		this$0 = final_cachefirstinterceptor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field CacheFirstFetcher$CacheFirstInterceptor this$0>
		val$callBack = callback;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #30  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
		val$request = interceptorrequest;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #32  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
		val$chain = apollointerceptorchain;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #34  <Field ApolloInterceptorChain val$chain>
		val$dispatcher = Executor.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #36  <Field Executor val$dispatcher>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #39  <Method void Object()>
	//   17   31:return          
	}
}
