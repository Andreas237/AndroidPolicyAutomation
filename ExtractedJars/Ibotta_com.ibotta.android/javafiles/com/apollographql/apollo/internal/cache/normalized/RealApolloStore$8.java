// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.cache.normalized;

import com.apollographql.apollo.api.GraphqlFragment;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.cache.normalized.ApolloStoreOperation;
import com.apollographql.apollo.cache.normalized.CacheKey;
import java.util.concurrent.Executor;

// Referenced classes of package com.apollographql.apollo.internal.cache.normalized:
//			RealApolloStore

class RealApolloStore$8 extends ApolloStoreOperation
{

	protected GraphqlFragment perform()
	{
		return doRead(val$responseFieldMapper, val$cacheKey, val$variables);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field RealApolloStore this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field ResponseFieldMapper val$responseFieldMapper>
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field CacheKey val$cacheKey>
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field com.apollographql.apollo.api.Operation$Variables val$variables>
	//    8   16:invokevirtual   #38  <Method GraphqlFragment RealApolloStore.doRead(ResponseFieldMapper, CacheKey, com.apollographql.apollo.api.Operation$Variables)>
	//    9   19:areturn         
	}

	protected volatile Object perform()
	{
		return ((Object) (perform()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method GraphqlFragment perform()>
	//    2    4:areturn         
	}

	final RealApolloStore this$0;
	final CacheKey val$cacheKey;
	final ResponseFieldMapper val$responseFieldMapper;
	final com.apollographql.apollo.api.s val$variables;

	RealApolloStore$8(com.apollographql.apollo.api.s s)
	{
		this$0 = final_realapollostore;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field RealApolloStore this$0>
		val$responseFieldMapper = responsefieldmapper;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #24  <Field ResponseFieldMapper val$responseFieldMapper>
		val$cacheKey = CacheKey.this;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #26  <Field CacheKey val$cacheKey>
		val$variables = s;
	//    9   16:aload_0         
	//   10   17:aload           5
	//   11   19:putfield        #28  <Field com.apollographql.apollo.api.Operation$Variables val$variables>
		super(final_executor);
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:invokespecial   #31  <Method void ApolloStoreOperation(Executor)>
	//   15   27:return          
	}
}
