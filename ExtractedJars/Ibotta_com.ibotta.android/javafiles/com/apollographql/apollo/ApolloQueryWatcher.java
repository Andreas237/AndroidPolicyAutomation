// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.fetcher.ResponseFetcher;
import com.apollographql.apollo.internal.util.Cancelable;

public interface ApolloQueryWatcher
	extends Cancelable
{

	public abstract void cancel();

	public abstract ApolloQueryWatcher enqueueAndWatch(ApolloCall.Callback callback);

	public abstract Operation operation();

	public abstract void refetch();

	public abstract ApolloQueryWatcher refetchResponseFetcher(ResponseFetcher responsefetcher);
}
