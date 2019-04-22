// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.subscription;

import com.apollographql.apollo.api.Subscription;

// Referenced classes of package com.apollographql.apollo.internal.subscription:
//			SubscriptionManager

public final class NoOpSubscriptionManager
	implements SubscriptionManager
{

	public NoOpSubscriptionManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public void subscribe(Subscription subscription, SubscriptionManager.Callback callback)
	{
		throw new IllegalStateException("Subscription manager is not configured");
	//    0    0:new             #16  <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "Subscription manager is not configured">
	//    3    6:invokespecial   #21  <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public void unsubscribe(Subscription subscription)
	{
		throw new IllegalStateException("Subscription manager is not configured");
	//    0    0:new             #16  <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "Subscription manager is not configured">
	//    3    6:invokespecial   #21  <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}
}
