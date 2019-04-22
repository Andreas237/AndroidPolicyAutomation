// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.subscription;


// Referenced classes of package com.apollographql.apollo.internal.subscription:
//			RealSubscriptionManager

class RealSubscriptionManager$2
	implements Runnable
{

	public void run()
	{
		onInactivityTimeout();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field RealSubscriptionManager this$0>
	//    2    4:invokevirtual   #22  <Method void RealSubscriptionManager.onInactivityTimeout()>
	//    3    7:return          
	}

	final RealSubscriptionManager this$0;

	RealSubscriptionManager$2()
	{
		this$0 = RealSubscriptionManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field RealSubscriptionManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
