// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.interceptor;

import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.interceptor.ApolloInterceptorChain;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

// Referenced classes of package com.apollographql.apollo.internal.interceptor:
//			ApolloCacheInterceptor

class ApolloCacheInterceptor$1
	implements Runnable
{

	public void run()
	{
		if(disposed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field ApolloCacheInterceptor this$0>
	//*   2    4:getfield        #46  <Field boolean ApolloCacheInterceptor.disposed>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		if(val$request.fetchFromCache)
	//*   5   11:aload_0         
	//*   6   12:getfield        #29  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
	//*   7   15:getfield        #51  <Field boolean com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.fetchFromCache>
	//*   8   18:ifeq            77
		{
			val$callBack.onFetch(com.apollographql.apollo.interceptor.urceType.CACHE);
	//    9   21:aload_0         
	//   10   22:getfield        #31  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
	//   11   25:getstatic       #57  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType.CACHE>
	//   12   28:invokeinterface #63  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType)>
			try
			{
				com.apollographql.apollo.interceptor.ptorResponse ptorresponse = resolveFromCache(val$request);
	//   13   33:aload_0         
	//   14   34:getfield        #27  <Field ApolloCacheInterceptor this$0>
	//   15   37:aload_0         
	//   16   38:getfield        #29  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
	//   17   41:invokevirtual   #67  <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse ApolloCacheInterceptor.resolveFromCache(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest)>
	//   18   44:astore_1        
				val$callBack.onResponse(ptorresponse);
	//   19   45:aload_0         
	//   20   46:getfield        #31  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
	//   21   49:aload_1         
	//   22   50:invokeinterface #71  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse)>
				val$callBack.onCompleted();
	//   23   55:aload_0         
	//   24   56:getfield        #31  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
	//   25   59:invokeinterface #74  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onCompleted()>
				return;
	//   26   64:return          
			}
			catch(ApolloException apolloexception)
	//*  27   65:astore_1        
			{
				val$callBack.onFailure(apolloexception);
	//   28   66:aload_0         
	//   29   67:getfield        #31  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
	//   30   70:aload_1         
	//   31   71:invokeinterface #78  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onFailure(ApolloException)>
			}
			return;
	//   32   76:return          
		} else
		{
			writeOptimisticUpdatesAndPublish(val$request);
	//   33   77:aload_0         
	//   34   78:getfield        #27  <Field ApolloCacheInterceptor this$0>
	//   35   81:aload_0         
	//   36   82:getfield        #29  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
	//   37   85:invokevirtual   #82  <Method void ApolloCacheInterceptor.writeOptimisticUpdatesAndPublish(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest)>
			val$chain.proceedAsync(val$request, val$dispatcher, new com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack() {

				public void onCompleted()
				{
				//    0    0:return          
				}

				public void onFailure(ApolloException apolloexception1)
				{
					rollbackOptimisticUpdatesAndPublish(request);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field ApolloCacheInterceptor$1 this$1>
				//    2    4:getfield        #28  <Field ApolloCacheInterceptor ApolloCacheInterceptor$1.this$0>
				//    3    7:aload_0         
				//    4    8:getfield        #17  <Field ApolloCacheInterceptor$1 this$1>
				//    5   11:getfield        #32  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest ApolloCacheInterceptor$1.val$request>
				//    6   14:invokevirtual   #38  <Method void ApolloCacheInterceptor.rollbackOptimisticUpdatesAndPublish(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest)>
					callBack.onFailure(apolloexception1);
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
						((Set) (hashset)).addAll(((java.util.Collection) (set1)));
				//   27   60:aload           4
				//   28   62:aload_3         
				//   29   63:invokeinterface #74  <Method boolean Set.addAll(java.util.Collection)>
				//   30   68:pop             
						((Set) (hashset)).addAll(((java.util.Collection) (set)));
				//   31   69:aload           4
				//   32   71:aload_2         
				//   33   72:invokeinterface #74  <Method boolean Set.addAll(java.util.Collection)>
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

				final ApolloCacheInterceptor._cls1 this$1;

			
			{
				this$1 = ApolloCacheInterceptor._cls1.this;
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
	final com.apollographql.apollo.interceptor.k val$callBack;
	final ApolloInterceptorChain val$chain;
	final Executor val$dispatcher;
	final com.apollographql.apollo.interceptor.ptorRequest val$request;

	ApolloCacheInterceptor$1()
	{
		this$0 = final_apollocacheinterceptor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field ApolloCacheInterceptor this$0>
		val$request = ptorrequest;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #29  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
		val$callBack = k;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #31  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
		val$chain = apollointerceptorchain;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #33  <Field ApolloInterceptorChain val$chain>
		val$dispatcher = Executor.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #35  <Field Executor val$dispatcher>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #38  <Method void Object()>
	//   17   31:return          
	}
}
