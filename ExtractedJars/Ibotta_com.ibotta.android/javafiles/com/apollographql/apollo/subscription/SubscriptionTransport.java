// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.subscription;


// Referenced classes of package com.apollographql.apollo.subscription:
//			OperationClientMessage, OperationServerMessage

public interface SubscriptionTransport
{
	public static interface Callback
	{

		public abstract void onConnected();

		public abstract void onFailure(Throwable throwable);

		public abstract void onMessage(OperationServerMessage operationservermessage);
	}

	public static interface Factory
	{

		public abstract SubscriptionTransport create(Callback callback);
	}


	public abstract void connect();

	public abstract void disconnect(OperationClientMessage operationclientmessage);

	public abstract void send(OperationClientMessage operationclientmessage);
}
