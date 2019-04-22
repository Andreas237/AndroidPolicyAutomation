// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.subscription;

import com.apollographql.apollo.api.Response;

// Referenced classes of package com.apollographql.apollo.internal.subscription:
//			SubscriptionManager, ApolloSubscriptionException

public static interface SubscriptionManager$Callback
{

	public abstract void onCompleted();

	public abstract void onError(ApolloSubscriptionException apollosubscriptionexception);

	public abstract void onNetworkError(Throwable throwable);

	public abstract void onResponse(Response response);
}
