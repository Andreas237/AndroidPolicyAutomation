// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo;

import com.apollographql.apollo.api.Subscription;

// Referenced classes of package com.apollographql.apollo:
//			ApolloSubscriptionCall

public static interface ApolloSubscriptionCall$Factory
{

	public abstract ApolloSubscriptionCall subscribe(Subscription subscription);
}
