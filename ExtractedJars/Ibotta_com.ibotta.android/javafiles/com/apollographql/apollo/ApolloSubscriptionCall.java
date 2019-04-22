// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo;

import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.api.Subscription;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.internal.util.Cancelable;

public interface ApolloSubscriptionCall
	extends Cancelable
{
	public static interface Callback
	{

		public abstract void onCompleted();

		public abstract void onFailure(ApolloException apolloexception);

		public abstract void onResponse(Response response);
	}

	public static interface Factory
	{

		public abstract ApolloSubscriptionCall subscribe(Subscription subscription);
	}


	public abstract ApolloSubscriptionCall clone();

	public abstract void execute(Callback callback);
}
