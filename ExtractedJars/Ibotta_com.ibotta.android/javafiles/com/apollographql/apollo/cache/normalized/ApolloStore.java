// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.normalized;

import com.apollographql.apollo.api.*;
import com.apollographql.apollo.cache.CacheHeaders;
import com.apollographql.apollo.internal.cache.normalized.*;
import java.util.*;

// Referenced classes of package com.apollographql.apollo.cache.normalized:
//			CacheKeyResolver, ApolloStoreOperation, NormalizedCache, CacheKey

public interface ApolloStore
{
	public static interface RecordChangeSubscriber
	{

		public abstract void onCacheRecordsChanged(Set set);
	}


	public abstract CacheKeyResolver cacheKeyResolver();

	public abstract ResponseNormalizer cacheResponseNormalizer();

	public abstract ApolloStoreOperation clearAll();

	public abstract ResponseNormalizer networkResponseNormalizer();

	public abstract NormalizedCache normalizedCache();

	public abstract void publish(Set set);

	public abstract ApolloStoreOperation read(Operation operation);

	public abstract ApolloStoreOperation read(Operation operation, ResponseFieldMapper responsefieldmapper, ResponseNormalizer responsenormalizer, CacheHeaders cacheheaders);

	public abstract ApolloStoreOperation read(ResponseFieldMapper responsefieldmapper, CacheKey cachekey, com.apollographql.apollo.api.Operation.Variables variables);

	public abstract Object readTransaction(Transaction transaction);

	public abstract ApolloStoreOperation remove(CacheKey cachekey);

	public abstract ApolloStoreOperation remove(List list);

	public abstract ApolloStoreOperation rollbackOptimisticUpdates(UUID uuid);

	public abstract ApolloStoreOperation rollbackOptimisticUpdatesAndPublish(UUID uuid);

	public abstract void subscribe(RecordChangeSubscriber recordchangesubscriber);

	public abstract void unsubscribe(RecordChangeSubscriber recordchangesubscriber);

	public abstract ApolloStoreOperation write(GraphqlFragment graphqlfragment, CacheKey cachekey, com.apollographql.apollo.api.Operation.Variables variables);

	public abstract ApolloStoreOperation write(Operation operation, com.apollographql.apollo.api.Operation.Data data);

	public abstract ApolloStoreOperation writeAndPublish(GraphqlFragment graphqlfragment, CacheKey cachekey, com.apollographql.apollo.api.Operation.Variables variables);

	public abstract ApolloStoreOperation writeAndPublish(Operation operation, com.apollographql.apollo.api.Operation.Data data);

	public abstract ApolloStoreOperation writeOptimisticUpdates(Operation operation, com.apollographql.apollo.api.Operation.Data data, UUID uuid);

	public abstract ApolloStoreOperation writeOptimisticUpdatesAndPublish(Operation operation, com.apollographql.apollo.api.Operation.Data data, UUID uuid);

	public abstract Object writeTransaction(Transaction transaction);

	public static final ApolloStore NO_APOLLO_STORE = new NoOpApolloStore();

	/* static  */
	/* { */
	//    0    0:new             #13  <Class NoOpApolloStore>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void NoOpApolloStore()>
	//    3    7:putstatic       #18  <Field ApolloStore NO_APOLLO_STORE>
	//*   4   10:return          
	/* } */
}
