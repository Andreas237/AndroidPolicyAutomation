// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.subscription;


// Referenced classes of package com.apollographql.apollo.internal.subscription:
//			RealSubscriptionManager

class RealSubscriptionManager$SubscriptionTransportCallback$2
	implements Runnable
{

	public void run()
	{
		RealSubscriptionManager.SubscriptionTransportCallback.access$000(RealSubscriptionManager.SubscriptionTransportCallback.this).onTransportFailure(val$t);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field RealSubscriptionManager$SubscriptionTransportCallback this$0>
	//    2    4:invokestatic    #33  <Method RealSubscriptionManager RealSubscriptionManager$SubscriptionTransportCallback.access$000(RealSubscriptionManager$SubscriptionTransportCallback)>
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field Throwable val$t>
	//    5   11:invokevirtual   #36  <Method void RealSubscriptionManager.onTransportFailure(Throwable)>
	//    6   14:return          
	}

	final RealSubscriptionManager.SubscriptionTransportCallback this$0;
	final Throwable val$t;

	RealSubscriptionManager$SubscriptionTransportCallback$2()
	{
		this$0 = final_subscriptiontransportcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field RealSubscriptionManager$SubscriptionTransportCallback this$0>
		val$t = Throwable.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field Throwable val$t>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
