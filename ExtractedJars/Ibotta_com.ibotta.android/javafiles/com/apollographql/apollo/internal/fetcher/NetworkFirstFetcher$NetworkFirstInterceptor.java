// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.fetcher;

import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.interceptor.ApolloInterceptor;
import com.apollographql.apollo.interceptor.ApolloInterceptorChain;
import com.apollographql.apollo.internal.ApolloLogger;
import java.util.concurrent.Executor;

// Referenced classes of package com.apollographql.apollo.internal.fetcher:
//			NetworkFirstFetcher

private static final class NetworkFirstFetcher$NetworkFirstInterceptor
	implements ApolloInterceptor
{

	public void dispose()
	{
		disposed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #28  <Field boolean disposed>
	//    3    5:return          
	}

	public void interceptAsync(final com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest request, final ApolloInterceptorChain chain, final Executor dispatcher, final com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack callBack)
	{
		chain.proceedAsync(request.toBuilder().fetchFromCache(false).build(), dispatcher, new com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack() {

			public void onCompleted()
			{
				callBack.onCompleted();
			//    0    0:aload_0         
			//    1    1:getfield        #32  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
			//    2    4:invokeinterface #45  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onCompleted()>
			//    3    9:return          
			}

			public void onFailure(ApolloException apolloexception)
			{
				logger.d(((Throwable) (apolloexception)), "Failed to fetch network response for operation %s, trying to return cached one", new Object[] {
					request.operation
				});
			//    0    0:aload_0         
			//    1    1:getfield        #30  <Field NetworkFirstFetcher$NetworkFirstInterceptor this$0>
			//    2    4:getfield        #52  <Field ApolloLogger NetworkFirstFetcher$NetworkFirstInterceptor.logger>
			//    3    7:aload_1         
			//    4    8:ldc1            #54  <String "Failed to fetch network response for operation %s, trying to return cached one">
			//    5   10:iconst_1        
			//    6   11:anewarray       Object[]
			//    7   14:dup             
			//    8   15:iconst_0        
			//    9   16:aload_0         
			//   10   17:getfield        #34  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
			//   11   20:getfield        #60  <Field com.apollographql.apollo.api.Operation com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.operation>
			//   12   23:aastore         
			//   13   24:invokevirtual   #66  <Method void ApolloLogger.d(Throwable, String, Object[])>
				if(!disposed)
			//*  14   27:aload_0         
			//*  15   28:getfield        #30  <Field NetworkFirstFetcher$NetworkFirstInterceptor this$0>
			//*  16   31:getfield        #70  <Field boolean NetworkFirstFetcher$NetworkFirstInterceptor.disposed>
			//*  17   34:ifne            75
				{
					com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest interceptorrequest = request.toBuilder().fetchFromCache(true).build();
			//   18   37:aload_0         
			//   19   38:getfield        #34  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
			//   20   41:invokevirtual   #74  <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.toBuilder()>
			//   21   44:iconst_1        
			//   22   45:invokevirtual   #80  <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder.fetchFromCache(boolean)>
			//   23   48:invokevirtual   #84  <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder.build()>
			//   24   51:astore_2        
					chain.proceedAsync(interceptorrequest, dispatcher, ((_cls1) (apolloexception)). new com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack() {

						public void onCompleted()
						{
							callBack.onCompleted();
						//    0    0:aload_0         
						//    1    1:getfield        #24  <Field NetworkFirstFetcher$NetworkFirstInterceptor$1 this$1>
						//    2    4:getfield        #35  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack NetworkFirstFetcher$NetworkFirstInterceptor$1.val$callBack>
						//    3    7:invokeinterface #37  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onCompleted()>
						//    4   12:return          
						}

						public void onFailure(ApolloException apolloexception)
						{
							callBack.onFailure(networkException);
						//    0    0:aload_0         
						//    1    1:getfield        #24  <Field NetworkFirstFetcher$NetworkFirstInterceptor$1 this$1>
						//    2    4:getfield        #35  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack NetworkFirstFetcher$NetworkFirstInterceptor$1.val$callBack>
						//    3    7:aload_0         
						//    4    8:getfield        #26  <Field ApolloException val$networkException>
						//    5   11:invokeinterface #39  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onFailure(ApolloException)>
						//    6   16:return          
						}

						public void onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor.FetchSourceType fetchsourcetype)
						{
							callBack.onFetch(fetchsourcetype);
						//    0    0:aload_0         
						//    1    1:getfield        #24  <Field NetworkFirstFetcher$NetworkFirstInterceptor$1 this$1>
						//    2    4:getfield        #35  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack NetworkFirstFetcher$NetworkFirstInterceptor$1.val$callBack>
						//    3    7:aload_1         
						//    4    8:invokeinterface #44  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType)>
						//    5   13:return          
						}

						public void onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse interceptorresponse)
						{
							callBack.onResponse(interceptorresponse);
						//    0    0:aload_0         
						//    1    1:getfield        #24  <Field NetworkFirstFetcher$NetworkFirstInterceptor$1 this$1>
						//    2    4:getfield        #35  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack NetworkFirstFetcher$NetworkFirstInterceptor$1.val$callBack>
						//    3    7:aload_1         
						//    4    8:invokeinterface #48  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse)>
						//    5   13:return          
						}

						final _cls1 this$1;
						final ApolloException val$networkException;

			
			{
				this$1 = final__pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field NetworkFirstFetcher$NetworkFirstInterceptor$1 this$1>
				networkException = ApolloException.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field ApolloException val$networkException>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #29  <Method void Object()>
			//    8   14:return          
			}
					}
);
			//   25   52:aload_0         
			//   26   53:getfield        #36  <Field ApolloInterceptorChain val$chain>
			//   27   56:aload_2         
			//   28   57:aload_0         
			//   29   58:getfield        #38  <Field Executor val$dispatcher>
			//   30   61:new             #16  <Class NetworkFirstFetcher$NetworkFirstInterceptor$1$1>
			//   31   64:dup             
			//   32   65:aload_0         
			//   33   66:aload_1         
			//   34   67:invokespecial   #87  <Method void NetworkFirstFetcher$NetworkFirstInterceptor$1$1(NetworkFirstFetcher$NetworkFirstInterceptor$1, ApolloException)>
			//   35   70:invokeinterface #93  <Method void ApolloInterceptorChain.proceedAsync(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest, Executor, com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack)>
				}
			//   36   75:return          
			}

			public void onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor.FetchSourceType fetchsourcetype)
			{
				callBack.onFetch(fetchsourcetype);
			//    0    0:aload_0         
			//    1    1:getfield        #32  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
			//    2    4:aload_1         
			//    3    5:invokeinterface #98  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType)>
			//    4   10:return          
			}

			public void onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse interceptorresponse)
			{
				callBack.onResponse(interceptorresponse);
			//    0    0:aload_0         
			//    1    1:getfield        #32  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
			//    2    4:aload_1         
			//    3    5:invokeinterface #102 <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse)>
			//    4   10:return          
			}

			final NetworkFirstFetcher.NetworkFirstInterceptor this$0;
			final com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack val$callBack;
			final ApolloInterceptorChain val$chain;
			final Executor val$dispatcher;
			final com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest val$request;

			
			{
				this$0 = NetworkFirstFetcher.NetworkFirstInterceptor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #30  <Field NetworkFirstFetcher$NetworkFirstInterceptor this$0>
				callBack = callback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #32  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
				request = interceptorrequest;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #34  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
				chain = apollointerceptorchain;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #36  <Field ApolloInterceptorChain val$chain>
				dispatcher = executor;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #38  <Field Executor val$dispatcher>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #41  <Method void Object()>
			//   17   31:return          
			}
		}
);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #37  <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.toBuilder()>
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #43  <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder.fetchFromCache(boolean)>
	//    5    9:invokevirtual   #47  <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder.build()>
	//    6   12:aload_3         
	//    7   13:new             #11  <Class NetworkFirstFetcher$NetworkFirstInterceptor$1>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:aload           4
	//   11   20:aload_1         
	//   12   21:aload_2         
	//   13   22:aload_3         
	//   14   23:invokespecial   #50  <Method void NetworkFirstFetcher$NetworkFirstInterceptor$1(NetworkFirstFetcher$NetworkFirstInterceptor, com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack, com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest, ApolloInterceptorChain, Executor)>
	//   15   26:invokeinterface #56  <Method void ApolloInterceptorChain.proceedAsync(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest, Executor, com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack)>
	//   16   31:return          
	}

	volatile boolean disposed;
	final ApolloLogger logger;

	NetworkFirstFetcher$NetworkFirstInterceptor(ApolloLogger apollologger)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		logger = apollologger;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field ApolloLogger logger>
	//    5    9:return          
	}
}
