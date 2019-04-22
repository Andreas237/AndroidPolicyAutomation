// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.cache.normalized;

import com.apollographql.apollo.api.*;
import com.apollographql.apollo.cache.CacheHeaders;
import com.apollographql.apollo.cache.normalized.*;
import java.util.*;

// Referenced classes of package com.apollographql.apollo.internal.cache.normalized:
//			ReadableStore, WriteableStore, ResponseNormalizer, Transaction

public final class NoOpApolloStore
	implements ApolloStore, ReadableStore, WriteableStore
{

	public NoOpApolloStore()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public CacheKeyResolver cacheKeyResolver()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public ResponseNormalizer cacheResponseNormalizer()
	{
		return ResponseNormalizer.NO_OP_NORMALIZER;
	//    0    0:getstatic       #25  <Field ResponseNormalizer ResponseNormalizer.NO_OP_NORMALIZER>
	//    1    3:areturn         
	}

	public ApolloStoreOperation clearAll()
	{
		return ApolloStoreOperation.emptyOperation(((Object) (Boolean.FALSE)));
	//    0    0:getstatic       #36  <Field Boolean Boolean.FALSE>
	//    1    3:invokestatic    #42  <Method ApolloStoreOperation ApolloStoreOperation.emptyOperation(Object)>
	//    2    6:areturn         
	}

	public Set merge(Record record, CacheHeaders cacheheaders)
	{
		return Collections.emptySet();
	//    0    0:invokestatic    #52  <Method Set Collections.emptySet()>
	//    1    3:areturn         
	}

	public Set merge(Collection collection, CacheHeaders cacheheaders)
	{
		return Collections.emptySet();
	//    0    0:invokestatic    #52  <Method Set Collections.emptySet()>
	//    1    3:areturn         
	}

	public ResponseNormalizer networkResponseNormalizer()
	{
		return ResponseNormalizer.NO_OP_NORMALIZER;
	//    0    0:getstatic       #25  <Field ResponseNormalizer ResponseNormalizer.NO_OP_NORMALIZER>
	//    1    3:areturn         
	}

	public NormalizedCache normalizedCache()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void publish(Set set)
	{
	//    0    0:return          
	}

	public ApolloStoreOperation read(Operation operation)
	{
		return ApolloStoreOperation.emptyOperation(((Object) (null)));
	//    0    0:aconst_null     
	//    1    1:invokestatic    #42  <Method ApolloStoreOperation ApolloStoreOperation.emptyOperation(Object)>
	//    2    4:areturn         
	}

	public ApolloStoreOperation read(Operation operation, ResponseFieldMapper responsefieldmapper, ResponseNormalizer responsenormalizer, CacheHeaders cacheheaders)
	{
		return ApolloStoreOperation.emptyOperation(((Object) (Response.builder(operation).build())));
	//    0    0:aload_1         
	//    1    1:invokestatic    #73  <Method com.apollographql.apollo.api.Response$Builder Response.builder(Operation)>
	//    2    4:invokevirtual   #79  <Method Response com.apollographql.apollo.api.Response$Builder.build()>
	//    3    7:invokestatic    #42  <Method ApolloStoreOperation ApolloStoreOperation.emptyOperation(Object)>
	//    4   10:areturn         
	}

	public ApolloStoreOperation read(ResponseFieldMapper responsefieldmapper, CacheKey cachekey, com.apollographql.apollo.api.Operation.Variables variables)
	{
		return ApolloStoreOperation.emptyOperation(((Object) (null)));
	//    0    0:aconst_null     
	//    1    1:invokestatic    #42  <Method ApolloStoreOperation ApolloStoreOperation.emptyOperation(Object)>
	//    2    4:areturn         
	}

	public Record read(String s, CacheHeaders cacheheaders)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Collection read(Collection collection, CacheHeaders cacheheaders)
	{
		return ((Collection) (Collections.emptySet()));
	//    0    0:invokestatic    #52  <Method Set Collections.emptySet()>
	//    1    3:areturn         
	}

	public Object readTransaction(Transaction transaction)
	{
		return transaction.execute(((Object) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #94  <Method Object Transaction.execute(Object)>
	//    3    7:areturn         
	}

	public ApolloStoreOperation remove(CacheKey cachekey)
	{
		return ApolloStoreOperation.emptyOperation(((Object) (Boolean.FALSE)));
	//    0    0:getstatic       #36  <Field Boolean Boolean.FALSE>
	//    1    3:invokestatic    #42  <Method ApolloStoreOperation ApolloStoreOperation.emptyOperation(Object)>
	//    2    6:areturn         
	}

	public ApolloStoreOperation remove(List list)
	{
		return ApolloStoreOperation.emptyOperation(((Object) (Integer.valueOf(0))));
	//    0    0:iconst_0        
	//    1    1:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//    2    4:invokestatic    #42  <Method ApolloStoreOperation ApolloStoreOperation.emptyOperation(Object)>
	//    3    7:areturn         
	}

	public ApolloStoreOperation rollbackOptimisticUpdates(UUID uuid)
	{
		return ApolloStoreOperation.emptyOperation(((Object) (Collections.emptySet())));
	//    0    0:invokestatic    #52  <Method Set Collections.emptySet()>
	//    1    3:invokestatic    #42  <Method ApolloStoreOperation ApolloStoreOperation.emptyOperation(Object)>
	//    2    6:areturn         
	}

	public ApolloStoreOperation rollbackOptimisticUpdatesAndPublish(UUID uuid)
	{
		return ApolloStoreOperation.emptyOperation(((Object) (Boolean.FALSE)));
	//    0    0:getstatic       #36  <Field Boolean Boolean.FALSE>
	//    1    3:invokestatic    #42  <Method ApolloStoreOperation ApolloStoreOperation.emptyOperation(Object)>
	//    2    6:areturn         
	}

	public void subscribe(com.apollographql.apollo.cache.normalized.ApolloStore.RecordChangeSubscriber recordchangesubscriber)
	{
	//    0    0:return          
	}

	public void unsubscribe(com.apollographql.apollo.cache.normalized.ApolloStore.RecordChangeSubscriber recordchangesubscriber)
	{
	//    0    0:return          
	}

	public ApolloStoreOperation write(GraphqlFragment graphqlfragment, CacheKey cachekey, com.apollographql.apollo.api.Operation.Variables variables)
	{
		return ApolloStoreOperation.emptyOperation(((Object) (Collections.emptySet())));
	//    0    0:invokestatic    #52  <Method Set Collections.emptySet()>
	//    1    3:invokestatic    #42  <Method ApolloStoreOperation ApolloStoreOperation.emptyOperation(Object)>
	//    2    6:areturn         
	}

	public ApolloStoreOperation write(Operation operation, com.apollographql.apollo.api.Operation.Data data)
	{
		return ApolloStoreOperation.emptyOperation(((Object) (Collections.emptySet())));
	//    0    0:invokestatic    #52  <Method Set Collections.emptySet()>
	//    1    3:invokestatic    #42  <Method ApolloStoreOperation ApolloStoreOperation.emptyOperation(Object)>
	//    2    6:areturn         
	}

	public ApolloStoreOperation writeAndPublish(GraphqlFragment graphqlfragment, CacheKey cachekey, com.apollographql.apollo.api.Operation.Variables variables)
	{
		return ApolloStoreOperation.emptyOperation(((Object) (Boolean.FALSE)));
	//    0    0:getstatic       #36  <Field Boolean Boolean.FALSE>
	//    1    3:invokestatic    #42  <Method ApolloStoreOperation ApolloStoreOperation.emptyOperation(Object)>
	//    2    6:areturn         
	}

	public ApolloStoreOperation writeAndPublish(Operation operation, com.apollographql.apollo.api.Operation.Data data)
	{
		return ApolloStoreOperation.emptyOperation(((Object) (Boolean.FALSE)));
	//    0    0:getstatic       #36  <Field Boolean Boolean.FALSE>
	//    1    3:invokestatic    #42  <Method ApolloStoreOperation ApolloStoreOperation.emptyOperation(Object)>
	//    2    6:areturn         
	}

	public ApolloStoreOperation writeOptimisticUpdates(Operation operation, com.apollographql.apollo.api.Operation.Data data, UUID uuid)
	{
		return ApolloStoreOperation.emptyOperation(((Object) (Collections.emptySet())));
	//    0    0:invokestatic    #52  <Method Set Collections.emptySet()>
	//    1    3:invokestatic    #42  <Method ApolloStoreOperation ApolloStoreOperation.emptyOperation(Object)>
	//    2    6:areturn         
	}

	public ApolloStoreOperation writeOptimisticUpdatesAndPublish(Operation operation, com.apollographql.apollo.api.Operation.Data data, UUID uuid)
	{
		return ApolloStoreOperation.emptyOperation(((Object) (Boolean.FALSE)));
	//    0    0:getstatic       #36  <Field Boolean Boolean.FALSE>
	//    1    3:invokestatic    #42  <Method ApolloStoreOperation ApolloStoreOperation.emptyOperation(Object)>
	//    2    6:areturn         
	}

	public Object writeTransaction(Transaction transaction)
	{
		return transaction.execute(((Object) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #94  <Method Object Transaction.execute(Object)>
	//    3    7:areturn         
	}
}
