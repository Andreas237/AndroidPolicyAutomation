// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.fetcher;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.interceptor.ApolloInterceptor;
import com.apollographql.apollo.interceptor.ApolloInterceptorChain;
import java.util.concurrent.Executor;

// Referenced classes of package com.apollographql.apollo.internal.fetcher:
//			CacheOnlyFetcher

private static final class CacheOnlyFetcher$CacheOnlyInterceptor
	implements ApolloInterceptor
{

	com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse cacheMissResponse(Operation operation)
	{
		return new com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse(((okhttp3.Response) (null)), Response.builder(operation).fromCache(true).build(), ((java.util.Collection) (null)));
	//    0    0:new             #22  <Class com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aload_1         
	//    4    6:invokestatic    #28  <Method com.apollographql.apollo.api.Response$Builder Response.builder(Operation)>
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #34  <Method com.apollographql.apollo.api.Response$Builder com.apollographql.apollo.api.Response$Builder.fromCache(boolean)>
	//    7   13:invokevirtual   #38  <Method Response com.apollographql.apollo.api.Response$Builder.build()>
	//    8   16:aconst_null     
	//    9   17:invokespecial   #41  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse(okhttp3.Response, Response, java.util.Collection)>
	//   10   20:areturn         
	}

	public void dispose()
	{
	//    0    0:return          
	}

	public void interceptAsync(final com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest request, ApolloInterceptorChain apollointerceptorchain, Executor executor, final com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack callBack)
	{
		apollointerceptorchain.proceedAsync(request.toBuilder().fetchFromCache(true).build(), executor, new com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack() {

			public void onCompleted()
			{
				callBack.onCompleted();
			//    0    0:aload_0         
			//    1    1:getfield        #26  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
			//    2    4:invokeinterface #35  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onCompleted()>
			//    3    9:return          
			}

			public void onFailure(ApolloException apolloexception)
			{
				callBack.onResponse(cacheMissResponse(request.operation));
			//    0    0:aload_0         
			//    1    1:getfield        #26  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
			//    2    4:aload_0         
			//    3    5:getfield        #24  <Field CacheOnlyFetcher$CacheOnlyInterceptor this$0>
			//    4    8:aload_0         
			//    5    9:getfield        #28  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
			//    6   12:getfield        #44  <Field Operation com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.operation>
			//    7   15:invokevirtual   #48  <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse CacheOnlyFetcher$CacheOnlyInterceptor.cacheMissResponse(Operation)>
			//    8   18:invokeinterface #52  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse)>
				callBack.onCompleted();
			//    9   23:aload_0         
			//   10   24:getfield        #26  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
			//   11   27:invokeinterface #35  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onCompleted()>
			//   12   32:return          
			}

			public void onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor.FetchSourceType fetchsourcetype)
			{
				callBack.onFetch(fetchsourcetype);
			//    0    0:aload_0         
			//    1    1:getfield        #26  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
			//    2    4:aload_1         
			//    3    5:invokeinterface #57  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType)>
			//    4   10:return          
			}

			public void onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse interceptorresponse)
			{
				callBack.onResponse(interceptorresponse);
			//    0    0:aload_0         
			//    1    1:getfield        #26  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
			//    2    4:aload_1         
			//    3    5:invokeinterface #52  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse)>
			//    4   10:return          
			}

			final CacheOnlyFetcher.CacheOnlyInterceptor this$0;
			final com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack val$callBack;
			final com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest val$request;

			
			{
				this$0 = CacheOnlyFetcher.CacheOnlyInterceptor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field CacheOnlyFetcher$CacheOnlyInterceptor this$0>
				callBack = callback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
				request = interceptorrequest;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #31  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #51  <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.toBuilder()>
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #57  <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder.fetchFromCache(boolean)>
	//    5    9:invokevirtual   #60  <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder.build()>
	//    6   12:aload_3         
	//    7   13:new             #11  <Class CacheOnlyFetcher$CacheOnlyInterceptor$1>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:aload           4
	//   11   20:aload_1         
	//   12   21:invokespecial   #63  <Method void CacheOnlyFetcher$CacheOnlyInterceptor$1(CacheOnlyFetcher$CacheOnlyInterceptor, com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack, com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest)>
	//   13   24:invokeinterface #69  <Method void ApolloInterceptorChain.proceedAsync(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest, Executor, com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack)>
	//   14   29:return          
	}

	private CacheOnlyFetcher$CacheOnlyInterceptor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	CacheOnlyFetcher$CacheOnlyInterceptor(CacheOnlyFetcher._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void CacheOnlyFetcher$CacheOnlyInterceptor()>
	//    2    4:return          
	}
}
