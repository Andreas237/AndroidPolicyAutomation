// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.interceptor;

import com.apollographql.apollo.cache.normalized.ApolloStore;
import com.apollographql.apollo.internal.ApolloLogger;
import java.util.Set;

// Referenced classes of package com.apollographql.apollo.internal.interceptor:
//			ApolloCacheInterceptor

class ApolloCacheInterceptor$6
	implements Runnable
{

	public void run()
	{
		try
		{
			apolloStore.publish(val$cacheKeys);
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

	ApolloCacheInterceptor$6()
	{
		this$0 = final_apollocacheinterceptor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ApolloCacheInterceptor this$0>
		val$cacheKeys = Set.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Set val$cacheKeys>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
