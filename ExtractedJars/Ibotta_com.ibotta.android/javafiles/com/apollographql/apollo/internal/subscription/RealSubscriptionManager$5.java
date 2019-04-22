// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.subscription;

import com.apollographql.apollo.exception.ApolloNetworkException;

// Referenced classes of package com.apollographql.apollo.internal.subscription:
//			RealSubscriptionManager

class RealSubscriptionManager$5
	implements Runnable
{

	public void run()
	{
		onTransportFailure(((Throwable) (new ApolloNetworkException("Subscription server is not responding"))));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RealSubscriptionManager this$0>
	//    2    4:new             #23  <Class ApolloNetworkException>
	//    3    7:dup             
	//    4    8:ldc1            #25  <String "Subscription server is not responding">
	//    5   10:invokespecial   #28  <Method void ApolloNetworkException(String)>
	//    6   13:invokevirtual   #32  <Method void RealSubscriptionManager.onTransportFailure(Throwable)>
	//    7   16:return          
	}

	final RealSubscriptionManager this$0;

	RealSubscriptionManager$5()
	{
		this$0 = RealSubscriptionManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field RealSubscriptionManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
