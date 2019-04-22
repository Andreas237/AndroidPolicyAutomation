// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.interceptor;

import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.cache.normalized.ApolloStore;
import com.apollographql.apollo.cache.normalized.ApolloStoreOperation;
import com.apollographql.apollo.internal.ApolloLogger;

// Referenced classes of package com.apollographql.apollo.internal.interceptor:
//			ApolloCacheInterceptor

class ApolloCacheInterceptor$4
	implements Runnable
{

	public void run()
	{
		try
		{
			if(val$request.optimisticUpdates.isPresent())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
	//*   2    4:getfield        #34  <Field Optional com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.optimisticUpdates>
	//*   3    7:invokevirtual   #40  <Method boolean Optional.isPresent()>
	//*   4   10:ifeq            87
			{
				com.apollographql.apollo.api.Operation.Data data = (com.apollographql.apollo.api.Operation.Data)val$request.optimisticUpdates.get();
	//    5   13:aload_0         
	//    6   14:getfield        #21  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
	//    7   17:getfield        #34  <Field Optional com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.optimisticUpdates>
	//    8   20:invokevirtual   #44  <Method Object Optional.get()>
	//    9   23:checkcast       #46  <Class com.apollographql.apollo.api.Operation$Data>
	//   10   26:astore_1        
				apolloStore.writeOptimisticUpdatesAndPublish(val$request.operation, data, val$request.uniqueId).execute();
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
				val$request.operation
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
	final com.apollographql.apollo.interceptor.ptorRequest val$request;

	ApolloCacheInterceptor$4()
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
