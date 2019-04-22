// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.subscription;


// Referenced classes of package com.apollographql.apollo.internal.subscription:
//			RealSubscriptionManager

class RealSubscriptionManager$SubscriptionTransportCallback$1
	implements Runnable
{

	public void run()
	{
		RealSubscriptionManager.SubscriptionTransportCallback.access$000(RealSubscriptionManager.SubscriptionTransportCallback.this).onTransportConnected();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field RealSubscriptionManager$SubscriptionTransportCallback this$0>
	//    2    4:invokestatic    #28  <Method RealSubscriptionManager RealSubscriptionManager$SubscriptionTransportCallback.access$000(RealSubscriptionManager$SubscriptionTransportCallback)>
	//    3    7:invokevirtual   #31  <Method void RealSubscriptionManager.onTransportConnected()>
	//    4   10:return          
	}

	final RealSubscriptionManager.SubscriptionTransportCallback this$0;

	RealSubscriptionManager$SubscriptionTransportCallback$1()
	{
		this$0 = RealSubscriptionManager.SubscriptionTransportCallback.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field RealSubscriptionManager$SubscriptionTransportCallback this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
	//    5    9:return          
	}
}
