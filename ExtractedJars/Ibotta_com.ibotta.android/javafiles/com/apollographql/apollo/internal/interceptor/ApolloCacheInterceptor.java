// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.interceptor;

import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.internal.*;
import com.apollographql.apollo.cache.normalized.*;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.interceptor.ApolloInterceptor;
import com.apollographql.apollo.interceptor.ApolloInterceptorChain;
import com.apollographql.apollo.internal.ApolloLogger;
import com.apollographql.apollo.internal.cache.normalized.*;
import java.util.*;
import java.util.concurrent.Executor;

public final class ApolloCacheInterceptor
	implements ApolloInterceptor
{

	public ApolloCacheInterceptor(ApolloStore apollostore, ResponseFieldMapper responsefieldmapper, Executor executor, ApolloLogger apollologger)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		apolloStore = (ApolloStore)Utils.checkNotNull(((Object) (apollostore)), "cache == null");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #38  <String "cache == null">
	//    5    8:invokestatic    #44  <Method Object Utils.checkNotNull(Object, Object)>
	//    6   11:checkcast       #46  <Class ApolloStore>
	//    7   14:putfield        #48  <Field ApolloStore apolloStore>
		responseFieldMapper = (ResponseFieldMapper)Utils.checkNotNull(((Object) (responsefieldmapper)), "responseFieldMapper == null");
	//    8   17:aload_0         
	//    9   18:aload_2         
	//   10   19:ldc1            #50  <String "responseFieldMapper == null">
	//   11   21:invokestatic    #44  <Method Object Utils.checkNotNull(Object, Object)>
	//   12   24:checkcast       #52  <Class ResponseFieldMapper>
	//   13   27:putfield        #54  <Field ResponseFieldMapper responseFieldMapper>
		dispatcher = (Executor)Utils.checkNotNull(((Object) (executor)), "dispatcher == null");
	//   14   30:aload_0         
	//   15   31:aload_3         
	//   16   32:ldc1            #56  <String "dispatcher == null">
	//   17   34:invokestatic    #44  <Method Object Utils.checkNotNull(Object, Object)>
	//   18   37:checkcast       #58  <Class Executor>
	//   19   40:putfield        #60  <Field Executor dispatcher>
		logger = (ApolloLogger)Utils.checkNotNull(((Object) (apollologger)), "logger == null");
	//   20   43:aload_0         
	//   21   44:aload           4
	//   22   46:ldc1            #62  <String "logger == null">
	//   23   48:invokestatic    #44  <Method Object Utils.checkNotNull(Object, Object)>
	//   24   51:checkcast       #64  <Class ApolloLogger>
	//   25   54:putfield        #66  <Field ApolloLogger logger>
	//   26   57:return          
	}

	Set cacheResponse(final com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse records, final com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest request)
	{
		records = ((com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse) (records.cacheRecords.map(new Function() {

			public volatile Object apply(Object obj)
			{
				return ((Object) (apply((Collection)obj)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #31  <Class Collection>
			//    3    5:invokevirtual   #34  <Method List apply(Collection)>
			//    4    8:areturn         
			}

			public List apply(Collection collection)
			{
				ArrayList arraylist = new ArrayList(collection.size());
			//    0    0:new             #38  <Class ArrayList>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokeinterface #42  <Method int Collection.size()>
			//    4   10:invokespecial   #45  <Method void ArrayList(int)>
			//    5   13:astore_2        
				for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); ((List) (arraylist)).add(((Object) (((Record)((Iterator) (collection)).next()).toBuilder().mutationId(request.uniqueId).build()))));
			//    6   14:aload_1         
			//    7   15:invokeinterface #49  <Method Iterator Collection.iterator()>
			//    8   20:astore_1        
			//    9   21:aload_1         
			//   10   22:invokeinterface #55  <Method boolean Iterator.hasNext()>
			//   11   27:ifeq            65
			//   12   30:aload_2         
			//   13   31:aload_1         
			//   14   32:invokeinterface #59  <Method Object Iterator.next()>
			//   15   37:checkcast       #61  <Class Record>
			//   16   40:invokevirtual   #65  <Method com.apollographql.apollo.cache.normalized.Record$Builder Record.toBuilder()>
			//   17   43:aload_0         
			//   18   44:getfield        #22  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
			//   19   47:getfield        #71  <Field java.util.UUID com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.uniqueId>
			//   20   50:invokevirtual   #77  <Method com.apollographql.apollo.cache.normalized.Record$Builder com.apollographql.apollo.cache.normalized.Record$Builder.mutationId(java.util.UUID)>
			//   21   53:invokevirtual   #81  <Method Record com.apollographql.apollo.cache.normalized.Record$Builder.build()>
			//   22   56:invokeinterface #87  <Method boolean List.add(Object)>
			//   23   61:pop             
			//*  24   62:goto            21
				return ((List) (arraylist));
			//   25   65:aload_2         
			//   26   66:areturn         
			}

			final ApolloCacheInterceptor this$0;
			final com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest val$request;

			
			{
				this$0 = ApolloCacheInterceptor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field ApolloCacheInterceptor this$0>
				request = interceptorrequest;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
)));
	//    0    0:aload_1         
	//    1    1:getfield        #78  <Field Optional com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse.cacheRecords>
	//    2    4:new             #12  <Class ApolloCacheInterceptor$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokespecial   #81  <Method void ApolloCacheInterceptor$2(ApolloCacheInterceptor, com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest)>
	//    7   13:invokevirtual   #87  <Method Optional Optional.map(Function)>
	//    8   16:astore_1        
		if(!((Optional) (records)).isPresent())
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #91  <Method boolean Optional.isPresent()>
	//*  11   21:ifne            28
			return Collections.emptySet();
	//   12   24:invokestatic    #97  <Method Set Collections.emptySet()>
	//   13   27:areturn         
		try
		{
			records = ((com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse) ((Set)apolloStore.writeTransaction(new Transaction() {

				public volatile Object execute(Object obj)
				{
					return ((Object) (execute((WriteableStore)obj)));
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #35  <Class WriteableStore>
				//    3    5:invokevirtual   #38  <Method Set execute(WriteableStore)>
				//    4    8:areturn         
				}

				public Set execute(WriteableStore writeablestore)
				{
					return writeablestore.merge((Collection)records.get(), request.cacheHeaders);
				//    0    0:aload_1         
				//    1    1:aload_0         
				//    2    2:getfield        #24  <Field Optional val$records>
				//    3    5:invokevirtual   #45  <Method Object Optional.get()>
				//    4    8:checkcast       #47  <Class Collection>
				//    5   11:aload_0         
				//    6   12:getfield        #26  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
				//    7   15:getfield        #53  <Field com.apollographql.apollo.cache.CacheHeaders com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.cacheHeaders>
				//    8   18:invokeinterface #57  <Method Set WriteableStore.merge(Collection, com.apollographql.apollo.cache.CacheHeaders)>
				//    9   23:areturn         
				}

				final ApolloCacheInterceptor this$0;
				final Optional val$records;
				final com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest val$request;

			
			{
				this$0 = ApolloCacheInterceptor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field ApolloCacheInterceptor this$0>
				records = optional;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field Optional val$records>
				request = interceptorrequest;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #29  <Method void Object()>
			//   11   19:return          
			}
			}
)));
	//   14   28:aload_0         
	//   15   29:getfield        #48  <Field ApolloStore apolloStore>
	//   16   32:new             #14  <Class ApolloCacheInterceptor$3>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:aload_2         
	//   21   39:invokespecial   #100 <Method void ApolloCacheInterceptor$3(ApolloCacheInterceptor, Optional, com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest)>
	//   22   42:invokeinterface #104 <Method Object ApolloStore.writeTransaction(Transaction)>
	//   23   47:checkcast       #106 <Class Set>
	//   24   50:astore_1        
		}
	//*  25   51:aload_1         
	//*  26   52:areturn         
		// Misplaced declaration of an exception variable
		catch(final com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse records)
	//*  27   53:astore_1        
		{
			logger.e("Failed to cache operation response", new Object[] {
				records
			});
	//   28   54:aload_0         
	//   29   55:getfield        #66  <Field ApolloLogger logger>
	//   30   58:ldc1            #108 <String "Failed to cache operation response">
	//   31   60:iconst_1        
	//   32   61:anewarray       Object[]
	//   33   64:dup             
	//   34   65:iconst_0        
	//   35   66:aload_1         
	//   36   67:aastore         
	//   37   68:invokevirtual   #112 <Method void ApolloLogger.e(String, Object[])>
			return Collections.emptySet();
	//   38   71:invokestatic    #97  <Method Set Collections.emptySet()>
	//   39   74:areturn         
		}
		return ((Set) (records));
	}

	public void dispose()
	{
		disposed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #117 <Field boolean disposed>
	//    3    5:return          
	}

	public void interceptAsync(final com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest request, final ApolloInterceptorChain chain, final Executor dispatcher, final com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack callBack)
	{
		dispatcher.execute(new Runnable() {

			public void run()
			{
				if(disposed)
			//*   0    0:aload_0         
			//*   1    1:getfield        #27  <Field ApolloCacheInterceptor this$0>
			//*   2    4:getfield        #46  <Field boolean ApolloCacheInterceptor.disposed>
			//*   3    7:ifeq            11
					return;
			//    4   10:return          
				if(request.fetchFromCache)
			//*   5   11:aload_0         
			//*   6   12:getfield        #29  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
			//*   7   15:getfield        #51  <Field boolean com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.fetchFromCache>
			//*   8   18:ifeq            77
				{
					callBack.onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor.FetchSourceType.CACHE);
			//    9   21:aload_0         
			//   10   22:getfield        #31  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
			//   11   25:getstatic       #57  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType.CACHE>
			//   12   28:invokeinterface #63  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType)>
					try
					{
						com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse interceptorresponse = resolveFromCache(request);
			//   13   33:aload_0         
			//   14   34:getfield        #27  <Field ApolloCacheInterceptor this$0>
			//   15   37:aload_0         
			//   16   38:getfield        #29  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
			//   17   41:invokevirtual   #67  <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse ApolloCacheInterceptor.resolveFromCache(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest)>
			//   18   44:astore_1        
						callBack.onResponse(interceptorresponse);
			//   19   45:aload_0         
			//   20   46:getfield        #31  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
			//   21   49:aload_1         
			//   22   50:invokeinterface #71  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse)>
						callBack.onCompleted();
			//   23   55:aload_0         
			//   24   56:getfield        #31  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
			//   25   59:invokeinterface #74  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onCompleted()>
						return;
			//   26   64:return          
					}
					catch(ApolloException apolloexception)
			//*  27   65:astore_1        
					{
						callBack.onFailure(apolloexception);
			//   28   66:aload_0         
			//   29   67:getfield        #31  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
			//   30   70:aload_1         
			//   31   71:invokeinterface #78  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onFailure(ApolloException)>
					}
					return;
			//   32   76:return          
				} else
				{
					writeOptimisticUpdatesAndPublish(request);
			//   33   77:aload_0         
			//   34   78:getfield        #27  <Field ApolloCacheInterceptor this$0>
			//   35   81:aload_0         
			//   36   82:getfield        #29  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
			//   37   85:invokevirtual   #82  <Method void ApolloCacheInterceptor.writeOptimisticUpdatesAndPublish(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest)>
					chain.proceedAsync(request, dispatcher, new com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack() {

						public void onCompleted()
						{
						//    0    0:return          
						}

						public void onFailure(ApolloException apolloexception)
						{
							rollbackOptimisticUpdatesAndPublish(request);
						//    0    0:aload_0         
						//    1    1:getfield        #17  <Field ApolloCacheInterceptor$1 this$1>
						//    2    4:getfield        #28  <Field ApolloCacheInterceptor ApolloCacheInterceptor$1.this$0>
						//    3    7:aload_0         
						//    4    8:getfield        #17  <Field ApolloCacheInterceptor$1 this$1>
						//    5   11:getfield        #32  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest ApolloCacheInterceptor$1.val$request>
						//    6   14:invokevirtual   #38  <Method void ApolloCacheInterceptor.rollbackOptimisticUpdatesAndPublish(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest)>
							callBack.onFailure(apolloexception);
						//    7   17:aload_0         
						//    8   18:getfield        #17  <Field ApolloCacheInterceptor$1 this$1>
						//    9   21:getfield        #42  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack ApolloCacheInterceptor$1.val$callBack>
						//   10   24:aload_1         
						//   11   25:invokeinterface #44  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onFailure(ApolloException)>
						//   12   30:return          
						}

						public void onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor.FetchSourceType fetchsourcetype)
						{
							callBack.onFetch(fetchsourcetype);
						//    0    0:aload_0         
						//    1    1:getfield        #17  <Field ApolloCacheInterceptor$1 this$1>
						//    2    4:getfield        #42  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack ApolloCacheInterceptor$1.val$callBack>
						//    3    7:aload_1         
						//    4    8:invokeinterface #49  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType)>
						//    5   13:return          
						}

						public void onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse interceptorresponse)
						{
							if(disposed)
						//*   0    0:aload_0         
						//*   1    1:getfield        #17  <Field ApolloCacheInterceptor$1 this$1>
						//*   2    4:getfield        #28  <Field ApolloCacheInterceptor ApolloCacheInterceptor$1.this$0>
						//*   3    7:getfield        #57  <Field boolean ApolloCacheInterceptor.disposed>
						//*   4   10:ifeq            14
								return;
						//    5   13:return          
							try
							{
								Set set = cacheResponse(interceptorresponse, request);
						//    6   14:aload_0         
						//    7   15:getfield        #17  <Field ApolloCacheInterceptor$1 this$1>
						//    8   18:getfield        #28  <Field ApolloCacheInterceptor ApolloCacheInterceptor$1.this$0>
						//    9   21:aload_1         
						//   10   22:aload_0         
						//   11   23:getfield        #17  <Field ApolloCacheInterceptor$1 this$1>
						//   12   26:getfield        #32  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest ApolloCacheInterceptor$1.val$request>
						//   13   29:invokevirtual   #61  <Method Set ApolloCacheInterceptor.cacheResponse(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse, com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest)>
						//   14   32:astore_2        
								Set set1 = rollbackOptimisticUpdates(request);
						//   15   33:aload_0         
						//   16   34:getfield        #17  <Field ApolloCacheInterceptor$1 this$1>
						//   17   37:getfield        #28  <Field ApolloCacheInterceptor ApolloCacheInterceptor$1.this$0>
						//   18   40:aload_0         
						//   19   41:getfield        #17  <Field ApolloCacheInterceptor$1 this$1>
						//   20   44:getfield        #32  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest ApolloCacheInterceptor$1.val$request>
						//   21   47:invokevirtual   #65  <Method Set ApolloCacheInterceptor.rollbackOptimisticUpdates(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest)>
						//   22   50:astore_3        
								HashSet hashset = new HashSet();
						//   23   51:new             #67  <Class HashSet>
						//   24   54:dup             
						//   25   55:invokespecial   #68  <Method void HashSet()>
						//   26   58:astore          4
								((Set) (hashset)).addAll(((Collection) (set1)));
						//   27   60:aload           4
						//   28   62:aload_3         
						//   29   63:invokeinterface #74  <Method boolean Set.addAll(Collection)>
						//   30   68:pop             
								((Set) (hashset)).addAll(((Collection) (set)));
						//   31   69:aload           4
						//   32   71:aload_2         
						//   33   72:invokeinterface #74  <Method boolean Set.addAll(Collection)>
						//   34   77:pop             
								publishCacheKeys(((Set) (hashset)));
						//   35   78:aload_0         
						//   36   79:getfield        #17  <Field ApolloCacheInterceptor$1 this$1>
						//   37   82:getfield        #28  <Field ApolloCacheInterceptor ApolloCacheInterceptor$1.this$0>
						//   38   85:aload           4
						//   39   87:invokevirtual   #78  <Method void ApolloCacheInterceptor.publishCacheKeys(Set)>
							}
						//*  40   90:aload_0         
						//*  41   91:getfield        #17  <Field ApolloCacheInterceptor$1 this$1>
						//*  42   94:getfield        #42  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack ApolloCacheInterceptor$1.val$callBack>
						//*  43   97:aload_1         
						//*  44   98:invokeinterface #80  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse)>
						//*  45  103:aload_0         
						//*  46  104:getfield        #17  <Field ApolloCacheInterceptor$1 this$1>
						//*  47  107:getfield        #42  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack ApolloCacheInterceptor$1.val$callBack>
						//*  48  110:invokeinterface #82  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onCompleted()>
						//*  49  115:return          
							// Misplaced declaration of an exception variable
							catch(com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse interceptorresponse)
						//*  50  116:astore_1        
							{
								rollbackOptimisticUpdatesAndPublish(request);
						//   51  117:aload_0         
						//   52  118:getfield        #17  <Field ApolloCacheInterceptor$1 this$1>
						//   53  121:getfield        #28  <Field ApolloCacheInterceptor ApolloCacheInterceptor$1.this$0>
						//   54  124:aload_0         
						//   55  125:getfield        #17  <Field ApolloCacheInterceptor$1 this$1>
						//   56  128:getfield        #32  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest ApolloCacheInterceptor$1.val$request>
						//   57  131:invokevirtual   #38  <Method void ApolloCacheInterceptor.rollbackOptimisticUpdatesAndPublish(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest)>
								throw interceptorresponse;
						//   58  134:aload_1         
						//   59  135:athrow          
							}
							callBack.onResponse(interceptorresponse);
							callBack.onCompleted();
						}

						final _cls1 this$1;

			
			{
				this$1 = _cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ApolloCacheInterceptor$1 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
					}
);
			//   38   88:aload_0         
			//   39   89:getfield        #33  <Field ApolloInterceptorChain val$chain>
			//   40   92:aload_0         
			//   41   93:getfield        #29  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
			//   42   96:aload_0         
			//   43   97:getfield        #35  <Field Executor val$dispatcher>
			//   44  100:new             #13  <Class ApolloCacheInterceptor$1$1>
			//   45  103:dup             
			//   46  104:aload_0         
			//   47  105:invokespecial   #85  <Method void ApolloCacheInterceptor$1$1(ApolloCacheInterceptor$1)>
			//   48  108:invokeinterface #91  <Method void ApolloInterceptorChain.proceedAsync(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest, Executor, com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack)>
					return;
			//   49  113:return          
				}
			}

			final ApolloCacheInterceptor this$0;
			final com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack val$callBack;
			final ApolloInterceptorChain val$chain;
			final Executor val$dispatcher;
			final com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest val$request;

			
			{
				this$0 = ApolloCacheInterceptor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #27  <Field ApolloCacheInterceptor this$0>
				request = interceptorrequest;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #29  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
				callBack = callback;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #31  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
				chain = apollointerceptorchain;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #33  <Field ApolloInterceptorChain val$chain>
				dispatcher = executor;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #35  <Field Executor val$dispatcher>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #38  <Method void Object()>
			//   17   31:return          
			}
		}
);
	//    0    0:aload_3         
	//    1    1:new             #8   <Class ApolloCacheInterceptor$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload           4
	//    6    9:aload_2         
	//    7   10:aload_3         
	//    8   11:invokespecial   #122 <Method void ApolloCacheInterceptor$1(ApolloCacheInterceptor, com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest, com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack, ApolloInterceptorChain, Executor)>
	//    9   14:invokeinterface #126 <Method void Executor.execute(Runnable)>
	//   10   19:return          
	}

	void publishCacheKeys(final Set cacheKeys)
	{
		dispatcher.execute(new Runnable() {

			public void run()
			{
				try
				{
					apolloStore.publish(cacheKeys);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field ApolloCacheInterceptor this$0>
			//    2    4:getfield        #32  <Field ApolloStore ApolloCacheInterceptor.apolloStore>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field Set val$cacheKeys>
			//    5   11:invokeinterface #37  <Method void ApolloStore.publish(Set)>
					return;
			//    6   16:return          
				}
				catch(Exception exception)
			//*   7   17:astore_1        
				{
					logger.e(((Throwable) (exception)), "Failed to publish cache changes", new Object[0]);
			//    8   18:aload_0         
			//    9   19:getfield        #19  <Field ApolloCacheInterceptor this$0>
			//   10   22:getfield        #41  <Field ApolloLogger ApolloCacheInterceptor.logger>
			//   11   25:aload_1         
			//   12   26:ldc1            #43  <String "Failed to publish cache changes">
			//   13   28:iconst_0        
			//   14   29:anewarray       Object[]
			//   15   32:invokevirtual   #49  <Method void ApolloLogger.e(Throwable, String, Object[])>
				}
			//   16   35:return          
			}

			final ApolloCacheInterceptor this$0;
			final Set val$cacheKeys;

			
			{
				this$0 = ApolloCacheInterceptor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ApolloCacheInterceptor this$0>
				cacheKeys = set;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Set val$cacheKeys>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Executor dispatcher>
	//    2    4:new             #20  <Class ApolloCacheInterceptor$6>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #131 <Method void ApolloCacheInterceptor$6(ApolloCacheInterceptor, Set)>
	//    7   13:invokeinterface #126 <Method void Executor.execute(Runnable)>
	//    8   18:return          
	}

	com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse resolveFromCache(com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest interceptorrequest)
		throws ApolloException
	{
		ResponseNormalizer responsenormalizer = apolloStore.cacheResponseNormalizer();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field ApolloStore apolloStore>
	//    2    4:invokeinterface #140 <Method ResponseNormalizer ApolloStore.cacheResponseNormalizer()>
	//    3    9:astore_2        
		Response response = (Response)apolloStore.read(interceptorrequest.operation, responseFieldMapper, responsenormalizer, interceptorrequest.cacheHeaders).execute();
	//    4   10:aload_0         
	//    5   11:getfield        #48  <Field ApolloStore apolloStore>
	//    6   14:aload_1         
	//    7   15:getfield        #146 <Field com.apollographql.apollo.api.Operation com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.operation>
	//    8   18:aload_0         
	//    9   19:getfield        #54  <Field ResponseFieldMapper responseFieldMapper>
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:getfield        #150 <Field com.apollographql.apollo.cache.CacheHeaders com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.cacheHeaders>
	//   13   27:invokeinterface #154 <Method ApolloStoreOperation ApolloStore.read(com.apollographql.apollo.api.Operation, ResponseFieldMapper, ResponseNormalizer, com.apollographql.apollo.cache.CacheHeaders)>
	//   14   32:invokevirtual   #159 <Method Object ApolloStoreOperation.execute()>
	//   15   35:checkcast       #161 <Class Response>
	//   16   38:astore_3        
		if(response.data() != null)
	//*  17   39:aload_3         
	//*  18   40:invokevirtual   #164 <Method Object Response.data()>
	//*  19   43:ifnull          80
		{
			logger.d("Cache HIT for operation %s", new Object[] {
				interceptorrequest.operation
			});
	//   20   46:aload_0         
	//   21   47:getfield        #66  <Field ApolloLogger logger>
	//   22   50:ldc1            #166 <String "Cache HIT for operation %s">
	//   23   52:iconst_1        
	//   24   53:anewarray       Object[]
	//   25   56:dup             
	//   26   57:iconst_0        
	//   27   58:aload_1         
	//   28   59:getfield        #146 <Field com.apollographql.apollo.api.Operation com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.operation>
	//   29   62:aastore         
	//   30   63:invokevirtual   #169 <Method void ApolloLogger.d(String, Object[])>
			return new com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse(((okhttp3.Response) (null)), response, responsenormalizer.records());
	//   31   66:new             #74  <Class com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse>
	//   32   69:dup             
	//   33   70:aconst_null     
	//   34   71:aload_3         
	//   35   72:aload_2         
	//   36   73:invokevirtual   #175 <Method Collection ResponseNormalizer.records()>
	//   37   76:invokespecial   #178 <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse(okhttp3.Response, Response, Collection)>
	//   38   79:areturn         
		} else
		{
			logger.d("Cache MISS for operation %s", new Object[] {
				interceptorrequest.operation
			});
	//   39   80:aload_0         
	//   40   81:getfield        #66  <Field ApolloLogger logger>
	//   41   84:ldc1            #180 <String "Cache MISS for operation %s">
	//   42   86:iconst_1        
	//   43   87:anewarray       Object[]
	//   44   90:dup             
	//   45   91:iconst_0        
	//   46   92:aload_1         
	//   47   93:getfield        #146 <Field com.apollographql.apollo.api.Operation com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.operation>
	//   48   96:aastore         
	//   49   97:invokevirtual   #169 <Method void ApolloLogger.d(String, Object[])>
			throw new ApolloException(String.format("Cache miss for operation %s", new Object[] {
				interceptorrequest.operation
			}));
	//   50  100:new             #136 <Class ApolloException>
	//   51  103:dup             
	//   52  104:ldc1            #182 <String "Cache miss for operation %s">
	//   53  106:iconst_1        
	//   54  107:anewarray       Object[]
	//   55  110:dup             
	//   56  111:iconst_0        
	//   57  112:aload_1         
	//   58  113:getfield        #146 <Field com.apollographql.apollo.api.Operation com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.operation>
	//   59  116:aastore         
	//   60  117:invokestatic    #188 <Method String String.format(String, Object[])>
	//   61  120:invokespecial   #191 <Method void ApolloException(String)>
	//   62  123:athrow          
		}
	}

	Set rollbackOptimisticUpdates(com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest interceptorrequest)
	{
		Set set;
		try
		{
			set = (Set)apolloStore.rollbackOptimisticUpdates(interceptorrequest.uniqueId).execute();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field ApolloStore apolloStore>
	//    2    4:aload_1         
	//    3    5:getfield        #198 <Field java.util.UUID com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.uniqueId>
	//    4    8:invokeinterface #201 <Method ApolloStoreOperation ApolloStore.rollbackOptimisticUpdates(java.util.UUID)>
	//    5   13:invokevirtual   #159 <Method Object ApolloStoreOperation.execute()>
	//    6   16:checkcast       #106 <Class Set>
	//    7   19:astore_2        
		}
	//*   8   20:aload_2         
	//*   9   21:areturn         
		catch(Exception exception)
	//*  10   22:astore_2        
		{
			logger.e(((Throwable) (exception)), "failed to rollback operation optimistic updates, for: %s", new Object[] {
				interceptorrequest.operation
			});
	//   11   23:aload_0         
	//   12   24:getfield        #66  <Field ApolloLogger logger>
	//   13   27:aload_2         
	//   14   28:ldc1            #203 <String "failed to rollback operation optimistic updates, for: %s">
	//   15   30:iconst_1        
	//   16   31:anewarray       Object[]
	//   17   34:dup             
	//   18   35:iconst_0        
	//   19   36:aload_1         
	//   20   37:getfield        #146 <Field com.apollographql.apollo.api.Operation com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.operation>
	//   21   40:aastore         
	//   22   41:invokevirtual   #206 <Method void ApolloLogger.e(Throwable, String, Object[])>
			return Collections.emptySet();
	//   23   44:invokestatic    #97  <Method Set Collections.emptySet()>
	//   24   47:areturn         
		}
		return set;
	}

	void rollbackOptimisticUpdatesAndPublish(final com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest request)
	{
		dispatcher.execute(new Runnable() {

			public void run()
			{
				try
				{
					apolloStore.rollbackOptimisticUpdatesAndPublish(request.uniqueId).execute();
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field ApolloCacheInterceptor this$0>
			//    2    4:getfield        #32  <Field ApolloStore ApolloCacheInterceptor.apolloStore>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
			//    5   11:getfield        #38  <Field java.util.UUID com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.uniqueId>
			//    6   14:invokeinterface #43  <Method ApolloStoreOperation ApolloStore.rollbackOptimisticUpdatesAndPublish(java.util.UUID)>
			//    7   19:invokevirtual   #49  <Method Object ApolloStoreOperation.execute()>
			//    8   22:pop             
					return;
			//    9   23:return          
				}
				catch(Exception exception)
			//*  10   24:astore_1        
				{
					logger.e(((Throwable) (exception)), "failed to rollback operation optimistic updates, for: %s", new Object[] {
						request.operation
					});
			//   11   25:aload_0         
			//   12   26:getfield        #19  <Field ApolloCacheInterceptor this$0>
			//   13   29:getfield        #53  <Field ApolloLogger ApolloCacheInterceptor.logger>
			//   14   32:aload_1         
			//   15   33:ldc1            #55  <String "failed to rollback operation optimistic updates, for: %s">
			//   16   35:iconst_1        
			//   17   36:anewarray       Object[]
			//   18   39:dup             
			//   19   40:iconst_0        
			//   20   41:aload_0         
			//   21   42:getfield        #21  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
			//   22   45:getfield        #59  <Field com.apollographql.apollo.api.Operation com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.operation>
			//   23   48:aastore         
			//   24   49:invokevirtual   #65  <Method void ApolloLogger.e(Throwable, String, Object[])>
				}
			//   25   52:return          
			}

			final ApolloCacheInterceptor this$0;
			final com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest val$request;

			
			{
				this$0 = ApolloCacheInterceptor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ApolloCacheInterceptor this$0>
				request = interceptorrequest;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Executor dispatcher>
	//    2    4:new             #18  <Class ApolloCacheInterceptor$5>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #210 <Method void ApolloCacheInterceptor$5(ApolloCacheInterceptor, com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest)>
	//    7   13:invokeinterface #126 <Method void Executor.execute(Runnable)>
	//    8   18:return          
	}

	void writeOptimisticUpdatesAndPublish(final com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest request)
	{
		dispatcher.execute(new Runnable() {

			public void run()
			{
				try
				{
					if(request.optimisticUpdates.isPresent())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
			//*   2    4:getfield        #34  <Field Optional com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.optimisticUpdates>
			//*   3    7:invokevirtual   #40  <Method boolean Optional.isPresent()>
			//*   4   10:ifeq            87
					{
						com.apollographql.apollo.api.Operation.Data data = (com.apollographql.apollo.api.Operation.Data)request.optimisticUpdates.get();
			//    5   13:aload_0         
			//    6   14:getfield        #21  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
			//    7   17:getfield        #34  <Field Optional com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.optimisticUpdates>
			//    8   20:invokevirtual   #44  <Method Object Optional.get()>
			//    9   23:checkcast       #46  <Class com.apollographql.apollo.api.Operation$Data>
			//   10   26:astore_1        
						apolloStore.writeOptimisticUpdatesAndPublish(request.operation, data, request.uniqueId).execute();
			//   11   27:aload_0         
			//   12   28:getfield        #19  <Field ApolloCacheInterceptor this$0>
			//   13   31:getfield        #50  <Field ApolloStore ApolloCacheInterceptor.apolloStore>
			//   14   34:aload_0         
			//   15   35:getfield        #21  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
			//   16   38:getfield        #54  <Field com.apollographql.apollo.api.Operation com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.operation>
			//   17   41:aload_1         
			//   18   42:aload_0         
			//   19   43:getfield        #21  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
			//   20   46:getfield        #58  <Field java.util.UUID com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.uniqueId>
			//   21   49:invokeinterface #63  <Method ApolloStoreOperation ApolloStore.writeOptimisticUpdatesAndPublish(com.apollographql.apollo.api.Operation, com.apollographql.apollo.api.Operation$Data, java.util.UUID)>
			//   22   54:invokevirtual   #68  <Method Object ApolloStoreOperation.execute()>
			//   23   57:pop             
						return;
			//   24   58:return          
					}
				}
				catch(Exception exception)
			//*  25   59:astore_1        
				{
					logger.e(((Throwable) (exception)), "failed to write operation optimistic updates, for: %s", new Object[] {
						request.operation
					});
			//   26   60:aload_0         
			//   27   61:getfield        #19  <Field ApolloCacheInterceptor this$0>
			//   28   64:getfield        #72  <Field ApolloLogger ApolloCacheInterceptor.logger>
			//   29   67:aload_1         
			//   30   68:ldc1            #74  <String "failed to write operation optimistic updates, for: %s">
			//   31   70:iconst_1        
			//   32   71:anewarray       Object[]
			//   33   74:dup             
			//   34   75:iconst_0        
			//   35   76:aload_0         
			//   36   77:getfield        #21  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
			//   37   80:getfield        #54  <Field com.apollographql.apollo.api.Operation com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.operation>
			//   38   83:aastore         
			//   39   84:invokevirtual   #80  <Method void ApolloLogger.e(Throwable, String, Object[])>
				}
			//   40   87:return          
			}

			final ApolloCacheInterceptor this$0;
			final com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest val$request;

			
			{
				this$0 = ApolloCacheInterceptor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ApolloCacheInterceptor this$0>
				request = interceptorrequest;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Executor dispatcher>
	//    2    4:new             #16  <Class ApolloCacheInterceptor$4>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #212 <Method void ApolloCacheInterceptor$4(ApolloCacheInterceptor, com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest)>
	//    7   13:invokeinterface #126 <Method void Executor.execute(Runnable)>
	//    8   18:return          
	}

	final ApolloStore apolloStore;
	private final Executor dispatcher;
	volatile boolean disposed;
	final ApolloLogger logger;
	private final ResponseFieldMapper responseFieldMapper;
}
