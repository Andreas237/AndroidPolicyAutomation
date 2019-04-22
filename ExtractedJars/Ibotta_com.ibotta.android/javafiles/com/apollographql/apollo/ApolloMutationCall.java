// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo;

import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.cache.CacheHeaders;

// Referenced classes of package com.apollographql.apollo:
//			ApolloCall

public interface ApolloMutationCall
	extends ApolloCall
{
	public static interface Factory
	{

		public abstract ApolloMutationCall mutate(Mutation mutation);

		public abstract ApolloMutationCall mutate(Mutation mutation, com.apollographql.apollo.api.Operation.Data data);
	}


	public abstract ApolloMutationCall cacheHeaders(CacheHeaders cacheheaders);

	public abstract ApolloMutationCall clone();

	public transient abstract ApolloMutationCall refetchQueries(OperationName aoperationname[]);

	public transient abstract ApolloMutationCall refetchQueries(Query aquery[]);
}
