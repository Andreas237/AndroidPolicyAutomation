// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.subscription;

import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.api.Subscription;

// Referenced classes of package com.apollographql.apollo.internal.subscription:
//			RealSubscriptionManager, ApolloSubscriptionException

private static class RealSubscriptionManager$SubscriptionRecord
{

	void notifyOnCompleted()
	{
		callback.onCompleted();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field SubscriptionManager$Callback callback>
	//    2    4:invokeinterface #31  <Method void SubscriptionManager$Callback.onCompleted()>
	//    3    9:return          
	}

	void notifyOnError(ApolloSubscriptionException apollosubscriptionexception)
	{
		callback.onError(apollosubscriptionexception);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field SubscriptionManager$Callback callback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #36  <Method void SubscriptionManager$Callback.onError(ApolloSubscriptionException)>
	//    4   10:return          
	}

	void notifyOnNetworkError(Throwable throwable)
	{
		callback.onNetworkError(throwable);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field SubscriptionManager$Callback callback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #41  <Method void SubscriptionManager$Callback.onNetworkError(Throwable)>
	//    4   10:return          
	}

	void notifyOnResponse(Response response)
	{
		callback.onResponse(response);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field SubscriptionManager$Callback callback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #46  <Method void SubscriptionManager$Callback.onResponse(Response)>
	//    4   10:return          
	}

	final SubscriptionManager.Callback callback;
	final Subscription subscription;

	RealSubscriptionManager$SubscriptionRecord(Subscription subscription1, SubscriptionManager.Callback callback1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		subscription = subscription1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Subscription subscription>
		callback = callback1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field SubscriptionManager$Callback callback>
	//    8   14:return          
	}
}
