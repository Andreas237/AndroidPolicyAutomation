// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.subscription;

import com.apollographql.apollo.api.Subscription;

// Referenced classes of package com.apollographql.apollo.internal.subscription:
//			RealSubscriptionManager

class RealSubscriptionManager$3
	implements Runnable
{

	public void run()
	{
		doSubscribe(val$subscription, val$callback);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field RealSubscriptionManager this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field Subscription val$subscription>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field SubscriptionManager$Callback val$callback>
	//    6   12:invokevirtual   #33  <Method void RealSubscriptionManager.doSubscribe(Subscription, SubscriptionManager$Callback)>
	//    7   15:return          
	}

	final RealSubscriptionManager this$0;
	final ck val$callback;
	final Subscription val$subscription;

	RealSubscriptionManager$3()
	{
		this$0 = final_realsubscriptionmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field RealSubscriptionManager this$0>
		val$subscription = subscription1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Subscription val$subscription>
		val$callback = ck.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field SubscriptionManager$Callback val$callback>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
