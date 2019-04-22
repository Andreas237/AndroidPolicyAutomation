// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.subscription;


// Referenced classes of package com.apollographql.apollo.subscription:
//			SubscriptionTransport, OperationServerMessage

public static interface SubscriptionTransport$Callback
{

	public abstract void onConnected();

	public abstract void onFailure(Throwable throwable);

	public abstract void onMessage(OperationServerMessage operationservermessage);
}
