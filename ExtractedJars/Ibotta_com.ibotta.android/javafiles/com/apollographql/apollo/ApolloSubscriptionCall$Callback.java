// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo;

import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.exception.ApolloException;

// Referenced classes of package com.apollographql.apollo:
//			ApolloSubscriptionCall

public static interface ApolloSubscriptionCall$Callback
{

	public abstract void onCompleted();

	public abstract void onFailure(ApolloException apolloexception);

	public abstract void onResponse(Response response);
}
