// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.subscription;

import com.apollographql.apollo.api.Subscription;

// Referenced classes of package com.apollographql.apollo.internal.subscription:
//			RealSubscriptionManager

class RealSubscriptionManager$4
	implements Runnable
{

	public void run()
	{
		doUnsubscribe(val$subscription);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RealSubscriptionManager this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Subscription val$subscription>
	//    4    8:invokevirtual   #29  <Method void RealSubscriptionManager.doUnsubscribe(Subscription)>
	//    5   11:return          
	}

	final RealSubscriptionManager this$0;
	final Subscription val$subscription;

	RealSubscriptionManager$4()
	{
		this$0 = final_realsubscriptionmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field RealSubscriptionManager this$0>
		val$subscription = Subscription.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Subscription val$subscription>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
