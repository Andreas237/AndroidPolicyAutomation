// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.interceptor;

import com.apollographql.apollo.cache.normalized.ApolloStore;
import com.apollographql.apollo.cache.normalized.ApolloStoreOperation;
import com.apollographql.apollo.internal.ApolloLogger;

// Referenced classes of package com.apollographql.apollo.internal.interceptor:
//			ApolloCacheInterceptor

class ApolloCacheInterceptor$5
	implements Runnable
{

	public void run()
	{
		try
		{
			apolloStore.rollbackOptimisticUpdatesAndPublish(val$request.uniqueId).execute();
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
				val$request.operation
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
	final com.apollographql.apollo.interceptor.ptorRequest val$request;

	ApolloCacheInterceptor$5()
	{
		this$0 = final_apollocacheinterceptor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ApolloCacheInterceptor this$0>
		val$request = com.apollographql.apollo.interceptor.ptorRequest.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
