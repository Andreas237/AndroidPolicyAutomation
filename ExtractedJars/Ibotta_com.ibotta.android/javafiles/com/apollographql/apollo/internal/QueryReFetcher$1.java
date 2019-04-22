// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal;

import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.exception.ApolloException;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.apollographql.apollo.internal:
//			QueryReFetcher, RealApolloCall, ApolloLogger

class QueryReFetcher$1 extends com.apollographql.apollo.ck
{

	public void onFailure(ApolloException apolloexception)
	{
		if(logger != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field QueryReFetcher this$0>
	//*   2    4:getfield        #37  <Field ApolloLogger QueryReFetcher.logger>
	//*   3    7:ifnull          37
			logger.e(((Throwable) (apolloexception)), "Failed to fetch query: %s", new Object[] {
				val$call.operation
			});
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field QueryReFetcher this$0>
	//    6   14:getfield        #37  <Field ApolloLogger QueryReFetcher.logger>
	//    7   17:aload_1         
	//    8   18:ldc1            #39  <String "Failed to fetch query: %s">
	//    9   20:iconst_1        
	//   10   21:anewarray       Object[]
	//   11   24:dup             
	//   12   25:iconst_0        
	//   13   26:aload_0         
	//   14   27:getfield        #27  <Field RealApolloCall val$call>
	//   15   30:getfield        #47  <Field com.apollographql.apollo.api.Operation RealApolloCall.operation>
	//   16   33:aastore         
	//   17   34:invokevirtual   #53  <Method void ApolloLogger.e(Throwable, String, Object[])>
		if(val$callsLeft.decrementAndGet() == 0)
	//*  18   37:aload_0         
	//*  19   38:getfield        #23  <Field AtomicInteger val$callsLeft>
	//*  20   41:invokevirtual   #59  <Method int AtomicInteger.decrementAndGet()>
	//*  21   44:ifne            62
		{
			apolloexception = ((ApolloException) (val$completeCallback));
	//   22   47:aload_0         
	//   23   48:getfield        #25  <Field QueryReFetcher$OnCompleteCallback val$completeCallback>
	//   24   51:astore_1        
			if(apolloexception != null)
	//*  25   52:aload_1         
	//*  26   53:ifnull          62
				((CompleteCallback) (apolloexception)).onFetchComplete();
	//   27   56:aload_1         
	//   28   57:invokeinterface #64  <Method void QueryReFetcher$OnCompleteCallback.onFetchComplete()>
		}
	//   29   62:return          
	}

	public void onResponse(Response response)
	{
		if(val$callsLeft.decrementAndGet() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field AtomicInteger val$callsLeft>
	//*   2    4:invokevirtual   #59  <Method int AtomicInteger.decrementAndGet()>
	//*   3    7:ifne            25
		{
			response = ((Response) (val$completeCallback));
	//    4   10:aload_0         
	//    5   11:getfield        #25  <Field QueryReFetcher$OnCompleteCallback val$completeCallback>
	//    6   14:astore_1        
			if(response != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          25
				((CompleteCallback) (response)).onFetchComplete();
	//    9   19:aload_1         
	//   10   20:invokeinterface #64  <Method void QueryReFetcher$OnCompleteCallback.onFetchComplete()>
		}
	//   11   25:return          
	}

	final QueryReFetcher this$0;
	final RealApolloCall val$call;
	final AtomicInteger val$callsLeft;
	final CompleteCallback val$completeCallback;

	QueryReFetcher$1()
	{
		this$0 = final_queryrefetcher;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field QueryReFetcher this$0>
		val$callsLeft = atomicinteger;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field AtomicInteger val$callsLeft>
		val$completeCallback = completecallback;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field QueryReFetcher$OnCompleteCallback val$completeCallback>
		val$call = RealApolloCall.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #27  <Field RealApolloCall val$call>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #29  <Method void com.apollographql.apollo.ApolloCall$Callback()>
	//   14   25:return          
	}
}
