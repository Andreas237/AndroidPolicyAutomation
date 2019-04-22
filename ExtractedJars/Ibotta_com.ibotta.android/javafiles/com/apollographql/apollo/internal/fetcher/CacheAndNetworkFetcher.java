// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.fetcher;

import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.fetcher.ResponseFetcher;
import com.apollographql.apollo.interceptor.ApolloInterceptor;
import com.apollographql.apollo.interceptor.ApolloInterceptorChain;
import com.apollographql.apollo.internal.ApolloLogger;
import java.util.concurrent.Executor;

public final class CacheAndNetworkFetcher
	implements ResponseFetcher
{
	private static final class CacheAndNetworkInterceptor
		implements ApolloInterceptor
	{

		private void dispatch()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			boolean flag = disposed;
		//    2    2:aload_0         
		//    3    3:getfield        #49  <Field boolean disposed>
		//    4    6:istore_1        
			if(!flag)
				break MISSING_BLOCK_LABEL_14;
		//    5    7:iload_1         
		//    6    8:ifeq            14
			this;
		//    7   11:aload_0         
			JVM INSTR monitorexit ;
		//    8   12:monitorexit     
			return;
		//    9   13:return          
			if(dispatchedCacheResult)
				break MISSING_BLOCK_LABEL_73;
		//   10   14:aload_0         
		//   11   15:getfield        #51  <Field boolean dispatchedCacheResult>
		//   12   18:ifne            73
			if(cacheResponse.isPresent())
		//*  13   21:aload_0         
		//*  14   22:getfield        #37  <Field Optional cacheResponse>
		//*  15   25:invokevirtual   #55  <Method boolean Optional.isPresent()>
		//*  16   28:ifeq            58
			{
				originalCallback.onResponse((com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse)cacheResponse.get());
		//   17   31:aload_0         
		//   18   32:getfield        #57  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack originalCallback>
		//   19   35:aload_0         
		//   20   36:getfield        #37  <Field Optional cacheResponse>
		//   21   39:invokevirtual   #61  <Method Object Optional.get()>
		//   22   42:checkcast       #63  <Class com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse>
		//   23   45:invokeinterface #69  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse)>
				dispatchedCacheResult = true;
		//   24   50:aload_0         
		//   25   51:iconst_1        
		//   26   52:putfield        #51  <Field boolean dispatchedCacheResult>
				break MISSING_BLOCK_LABEL_73;
		//   27   55:goto            73
			}
			if(cacheException.isPresent())
		//*  28   58:aload_0         
		//*  29   59:getfield        #41  <Field Optional cacheException>
		//*  30   62:invokevirtual   #55  <Method boolean Optional.isPresent()>
		//*  31   65:ifeq            73
				dispatchedCacheResult = true;
		//   32   68:aload_0         
		//   33   69:iconst_1        
		//   34   70:putfield        #51  <Field boolean dispatchedCacheResult>
			if(!dispatchedCacheResult)
				break MISSING_BLOCK_LABEL_172;
		//   35   73:aload_0         
		//   36   74:getfield        #51  <Field boolean dispatchedCacheResult>
		//   37   77:ifeq            172
			if(networkResponse.isPresent())
		//*  38   80:aload_0         
		//*  39   81:getfield        #39  <Field Optional networkResponse>
		//*  40   84:invokevirtual   #55  <Method boolean Optional.isPresent()>
		//*  41   87:ifeq            121
			{
				originalCallback.onResponse((com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse)networkResponse.get());
		//   42   90:aload_0         
		//   43   91:getfield        #57  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack originalCallback>
		//   44   94:aload_0         
		//   45   95:getfield        #39  <Field Optional networkResponse>
		//   46   98:invokevirtual   #61  <Method Object Optional.get()>
		//   47  101:checkcast       #63  <Class com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse>
		//   48  104:invokeinterface #69  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse)>
				originalCallback.onCompleted();
		//   49  109:aload_0         
		//   50  110:getfield        #57  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack originalCallback>
		//   51  113:invokeinterface #72  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onCompleted()>
				break MISSING_BLOCK_LABEL_172;
		//   52  118:goto            172
			}
			if(!networkException.isPresent())
				break MISSING_BLOCK_LABEL_172;
		//   53  121:aload_0         
		//   54  122:getfield        #43  <Field Optional networkException>
		//   55  125:invokevirtual   #55  <Method boolean Optional.isPresent()>
		//   56  128:ifeq            172
			if(cacheException.isPresent())
		//*  57  131:aload_0         
		//*  58  132:getfield        #41  <Field Optional cacheException>
		//*  59  135:invokevirtual   #55  <Method boolean Optional.isPresent()>
		//*  60  138:ifeq            163
			{
				originalCallback.onFailure((ApolloException)networkException.get());
		//   61  141:aload_0         
		//   62  142:getfield        #57  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack originalCallback>
		//   63  145:aload_0         
		//   64  146:getfield        #43  <Field Optional networkException>
		//   65  149:invokevirtual   #61  <Method Object Optional.get()>
		//   66  152:checkcast       #74  <Class ApolloException>
		//   67  155:invokeinterface #78  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onFailure(ApolloException)>
				break MISSING_BLOCK_LABEL_172;
		//   68  160:goto            172
			}
			originalCallback.onCompleted();
		//   69  163:aload_0         
		//   70  164:getfield        #57  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack originalCallback>
		//   71  167:invokeinterface #72  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onCompleted()>
			this;
		//   72  172:aload_0         
			JVM INSTR monitorexit ;
		//   73  173:monitorexit     
			return;
		//   74  174:return          
			Exception exception;
			exception;
		//   75  175:astore_2        
		//*  76  176:aload_0         
			throw exception;
		//   77  177:monitorexit     
		//   78  178:aload_2         
		//   79  179:athrow          
		}

		public void dispose()
		{
			disposed = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #49  <Field boolean disposed>
		//    3    5:return          
		}

		void handleCacheError(ApolloException apolloexception)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			cacheException = Optional.of(((Object) (apolloexception)));
		//    2    2:aload_0         
		//    3    3:aload_1         
		//    4    4:invokestatic    #84  <Method Optional Optional.of(Object)>
		//    5    7:putfield        #41  <Field Optional cacheException>
			dispatch();
		//    6   10:aload_0         
		//    7   11:invokespecial   #86  <Method void dispatch()>
			this;
		//    8   14:aload_0         
			JVM INSTR monitorexit ;
		//    9   15:monitorexit     
			return;
		//   10   16:return          
			apolloexception;
		//   11   17:astore_1        
		//*  12   18:aload_0         
			throw apolloexception;
		//   13   19:monitorexit     
		//   14   20:aload_1         
		//   15   21:athrow          
		}

		void handleCacheResponse(com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse interceptorresponse)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			cacheResponse = Optional.of(((Object) (interceptorresponse)));
		//    2    2:aload_0         
		//    3    3:aload_1         
		//    4    4:invokestatic    #84  <Method Optional Optional.of(Object)>
		//    5    7:putfield        #37  <Field Optional cacheResponse>
			dispatch();
		//    6   10:aload_0         
		//    7   11:invokespecial   #86  <Method void dispatch()>
			this;
		//    8   14:aload_0         
			JVM INSTR monitorexit ;
		//    9   15:monitorexit     
			return;
		//   10   16:return          
			interceptorresponse;
		//   11   17:astore_1        
		//*  12   18:aload_0         
			throw interceptorresponse;
		//   13   19:monitorexit     
		//   14   20:aload_1         
		//   15   21:athrow          
		}

		void handleNetworkError(ApolloException apolloexception)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			networkException = Optional.of(((Object) (apolloexception)));
		//    2    2:aload_0         
		//    3    3:aload_1         
		//    4    4:invokestatic    #84  <Method Optional Optional.of(Object)>
		//    5    7:putfield        #43  <Field Optional networkException>
			dispatch();
		//    6   10:aload_0         
		//    7   11:invokespecial   #86  <Method void dispatch()>
			this;
		//    8   14:aload_0         
			JVM INSTR monitorexit ;
		//    9   15:monitorexit     
			return;
		//   10   16:return          
			apolloexception;
		//   11   17:astore_1        
		//*  12   18:aload_0         
			throw apolloexception;
		//   13   19:monitorexit     
		//   14   20:aload_1         
		//   15   21:athrow          
		}

		void handleNetworkResponse(com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse interceptorresponse)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			networkResponse = Optional.of(((Object) (interceptorresponse)));
		//    2    2:aload_0         
		//    3    3:aload_1         
		//    4    4:invokestatic    #84  <Method Optional Optional.of(Object)>
		//    5    7:putfield        #39  <Field Optional networkResponse>
			dispatch();
		//    6   10:aload_0         
		//    7   11:invokespecial   #86  <Method void dispatch()>
			this;
		//    8   14:aload_0         
			JVM INSTR monitorexit ;
		//    9   15:monitorexit     
			return;
		//   10   16:return          
			interceptorresponse;
		//   11   17:astore_1        
		//*  12   18:aload_0         
			throw interceptorresponse;
		//   13   19:monitorexit     
		//   14   20:aload_1         
		//   15   21:athrow          
		}

		public void interceptAsync(com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest interceptorrequest, ApolloInterceptorChain apollointerceptorchain, Executor executor, com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack callback)
		{
			if(disposed)
		//*   0    0:aload_0         
		//*   1    1:getfield        #49  <Field boolean disposed>
		//*   2    4:ifeq            8
			{
				return;
		//    3    7:return          
			} else
			{
				originalCallback = callback;
		//    4    8:aload_0         
		//    5    9:aload           4
		//    6   11:putfield        #57  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack originalCallback>
				apollointerceptorchain.proceedAsync(interceptorrequest.toBuilder().fetchFromCache(true).build(), executor, ((_cls1) (callback)). new com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack() {

					public void onCompleted()
					{
					//    0    0:return          
					}

					public void onFailure(ApolloException apolloexception)
					{
						handleCacheError(apolloexception);
					//    0    0:aload_0         
					//    1    1:getfield        #22  <Field CacheAndNetworkFetcher$CacheAndNetworkInterceptor this$0>
					//    2    4:aload_1         
					//    3    5:invokevirtual   #35  <Method void CacheAndNetworkFetcher$CacheAndNetworkInterceptor.handleCacheError(ApolloException)>
					//    4    8:return          
					}

					public void onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor.FetchSourceType fetchsourcetype)
					{
						callBack.onFetch(fetchsourcetype);
					//    0    0:aload_0         
					//    1    1:getfield        #24  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
					//    2    4:aload_1         
					//    3    5:invokeinterface #40  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType)>
					//    4   10:return          
					}

					public void onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse interceptorresponse)
					{
						handleCacheResponse(interceptorresponse);
					//    0    0:aload_0         
					//    1    1:getfield        #22  <Field CacheAndNetworkFetcher$CacheAndNetworkInterceptor this$0>
					//    2    4:aload_1         
					//    3    5:invokevirtual   #45  <Method void CacheAndNetworkFetcher$CacheAndNetworkInterceptor.handleCacheResponse(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse)>
					//    4    8:return          
					}

					final CacheAndNetworkInterceptor this$0;
					final com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack val$callBack;

			
			{
				this$0 = final_cacheandnetworkinterceptor;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field CacheAndNetworkFetcher$CacheAndNetworkInterceptor this$0>
				callBack = com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
				}
);
		//    7   14:aload_2         
		//    8   15:aload_1         
		//    9   16:invokevirtual   #98  <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.toBuilder()>
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #104 <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder.fetchFromCache(boolean)>
		//   12   23:invokevirtual   #108 <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder.build()>
		//   13   26:aload_3         
		//   14   27:new             #11  <Class CacheAndNetworkFetcher$CacheAndNetworkInterceptor$1>
		//   15   30:dup             
		//   16   31:aload_0         
		//   17   32:aload           4
		//   18   34:invokespecial   #111 <Method void CacheAndNetworkFetcher$CacheAndNetworkInterceptor$1(CacheAndNetworkFetcher$CacheAndNetworkInterceptor, com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack)>
		//   19   37:invokeinterface #117 <Method void ApolloInterceptorChain.proceedAsync(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest, Executor, com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack)>
				apollointerceptorchain.proceedAsync(interceptorrequest.toBuilder().fetchFromCache(false).build(), executor, ((_cls2) (callback)). new com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack() {

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
						callBack.onFetch(fetchsourcetype);
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

					final CacheAndNetworkInterceptor this$0;
					final com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack val$callBack;

			
			{
				this$0 = final_cacheandnetworkinterceptor;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field CacheAndNetworkFetcher$CacheAndNetworkInterceptor this$0>
				callBack = com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
				}
);
		//   20   42:aload_2         
		//   21   43:aload_1         
		//   22   44:invokevirtual   #98  <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.toBuilder()>
		//   23   47:iconst_0        
		//   24   48:invokevirtual   #104 <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder.fetchFromCache(boolean)>
		//   25   51:invokevirtual   #108 <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder.build()>
		//   26   54:aload_3         
		//   27   55:new             #13  <Class CacheAndNetworkFetcher$CacheAndNetworkInterceptor$2>
		//   28   58:dup             
		//   29   59:aload_0         
		//   30   60:aload           4
		//   31   62:invokespecial   #118 <Method void CacheAndNetworkFetcher$CacheAndNetworkInterceptor$2(CacheAndNetworkFetcher$CacheAndNetworkInterceptor, com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack)>
		//   32   65:invokeinterface #117 <Method void ApolloInterceptorChain.proceedAsync(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest, Executor, com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack)>
				return;
		//   33   70:return          
			}
		}

		private Optional cacheException;
		private Optional cacheResponse;
		private boolean dispatchedCacheResult;
		private volatile boolean disposed;
		private Optional networkException;
		private Optional networkResponse;
		private com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack originalCallback;

		private CacheAndNetworkInterceptor()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #29  <Method void Object()>
			cacheResponse = Optional.absent();
		//    2    4:aload_0         
		//    3    5:invokestatic    #35  <Method Optional Optional.absent()>
		//    4    8:putfield        #37  <Field Optional cacheResponse>
			networkResponse = Optional.absent();
		//    5   11:aload_0         
		//    6   12:invokestatic    #35  <Method Optional Optional.absent()>
		//    7   15:putfield        #39  <Field Optional networkResponse>
			cacheException = Optional.absent();
		//    8   18:aload_0         
		//    9   19:invokestatic    #35  <Method Optional Optional.absent()>
		//   10   22:putfield        #41  <Field Optional cacheException>
			networkException = Optional.absent();
		//   11   25:aload_0         
		//   12   26:invokestatic    #35  <Method Optional Optional.absent()>
		//   13   29:putfield        #43  <Field Optional networkException>
		//   14   32:return          
		}

	}


	public CacheAndNetworkFetcher()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	public ApolloInterceptor provideInterceptor(ApolloLogger apollologger)
	{
		return ((ApolloInterceptor) (new CacheAndNetworkInterceptor()));
	//    0    0:new             #10  <Class CacheAndNetworkFetcher$CacheAndNetworkInterceptor>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #25  <Method void CacheAndNetworkFetcher$CacheAndNetworkInterceptor(CacheAndNetworkFetcher$1)>
	//    4    8:areturn         
	}
}
