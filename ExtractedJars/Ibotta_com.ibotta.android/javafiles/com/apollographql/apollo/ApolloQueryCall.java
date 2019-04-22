// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo;

import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.cache.CacheHeaders;
import com.apollographql.apollo.fetcher.ResponseFetcher;

// Referenced classes of package com.apollographql.apollo:
//			ApolloCall, ApolloQueryWatcher

public interface ApolloQueryCall
	extends ApolloCall
{
	public static interface Factory
	{

		public abstract ApolloQueryCall query(Query query1);
	}


	public abstract ApolloQueryCall cacheHeaders(CacheHeaders cacheheaders);

	public abstract ApolloQueryCall clone();

	public abstract ApolloQueryCall httpCachePolicy(com.apollographql.apollo.api.cache.http.HttpCachePolicy.Policy policy);

	public abstract ApolloQueryCall responseFetcher(ResponseFetcher responsefetcher);

	public abstract ApolloQueryWatcher watcher();
}
