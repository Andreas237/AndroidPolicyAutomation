// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.cache.normalized;

import com.apollographql.apollo.api.GraphqlFragment;
import com.apollographql.apollo.cache.normalized.ApolloStoreOperation;
import com.apollographql.apollo.cache.normalized.CacheKey;
import java.util.concurrent.Executor;

// Referenced classes of package com.apollographql.apollo.internal.cache.normalized:
//			RealApolloStore

class RealApolloStore$12 extends ApolloStoreOperation
{

	protected Boolean perform()
	{
		java.util.Set set = doWrite(val$fragment, val$cacheKey, val$variables);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field RealApolloStore this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field GraphqlFragment val$fragment>
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field CacheKey val$cacheKey>
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field com.apollographql.apollo.api.Operation$Variables val$variables>
	//    8   16:invokevirtual   #38  <Method java.util.Set RealApolloStore.doWrite(GraphqlFragment, CacheKey, com.apollographql.apollo.api.Operation$Variables)>
	//    9   19:astore_1        
		publish(set);
	//   10   20:aload_0         
	//   11   21:getfield        #22  <Field RealApolloStore this$0>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #42  <Method void RealApolloStore.publish(java.util.Set)>
		return Boolean.TRUE;
	//   14   28:getstatic       #48  <Field Boolean Boolean.TRUE>
	//   15   31:areturn         
	}

	protected volatile Object perform()
	{
		return ((Object) (perform()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #51  <Method Boolean perform()>
	//    2    4:areturn         
	}

	final RealApolloStore this$0;
	final CacheKey val$cacheKey;
	final GraphqlFragment val$fragment;
	final com.apollographql.apollo.api. val$variables;

	RealApolloStore$12(com.apollographql.apollo.api. )
	{
		this$0 = final_realapollostore;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field RealApolloStore this$0>
		val$fragment = graphqlfragment;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #24  <Field GraphqlFragment val$fragment>
		val$cacheKey = CacheKey.this;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #26  <Field CacheKey val$cacheKey>
		val$variables = ;
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
