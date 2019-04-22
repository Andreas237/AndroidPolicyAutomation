// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.cache.normalized;

import com.apollographql.apollo.api.GraphqlFragment;
import com.apollographql.apollo.cache.normalized.ApolloStoreOperation;
import com.apollographql.apollo.cache.normalized.CacheKey;
import java.util.Set;
import java.util.concurrent.Executor;

// Referenced classes of package com.apollographql.apollo.internal.cache.normalized:
//			RealApolloStore, Transaction, WriteableStore

class RealApolloStore$11 extends ApolloStoreOperation
{

	protected volatile Object perform()
	{
		return ((Object) (perform()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method Set perform()>
	//    2    4:areturn         
	}

	protected Set perform()
	{
		return (Set)writeTransaction(new Transaction() {

			public volatile Object execute(Object obj)
			{
				return ((Object) (execute((WriteableStore)obj)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class WriteableStore>
			//    3    5:invokevirtual   #29  <Method Set execute(WriteableStore)>
			//    4    8:areturn         
			}

			public Set execute(WriteableStore writeablestore)
			{
				return doWrite(fragment, cacheKey, variables);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field RealApolloStore$11 this$1>
			//    2    4:getfield        #33  <Field RealApolloStore RealApolloStore$11.this$0>
			//    3    7:aload_0         
			//    4    8:getfield        #18  <Field RealApolloStore$11 this$1>
			//    5   11:getfield        #37  <Field GraphqlFragment RealApolloStore$11.val$fragment>
			//    6   14:aload_0         
			//    7   15:getfield        #18  <Field RealApolloStore$11 this$1>
			//    8   18:getfield        #41  <Field CacheKey RealApolloStore$11.val$cacheKey>
			//    9   21:aload_0         
			//   10   22:getfield        #18  <Field RealApolloStore$11 this$1>
			//   11   25:getfield        #45  <Field com.apollographql.apollo.api.Operation$Variables RealApolloStore$11.val$variables>
			//   12   28:invokevirtual   #51  <Method Set RealApolloStore.doWrite(GraphqlFragment, CacheKey, com.apollographql.apollo.api.Operation$Variables)>
			//   13   31:areturn         
			}

			final RealApolloStore._cls11 this$1;

			
			{
				this$1 = RealApolloStore._cls11.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field RealApolloStore$11 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field RealApolloStore this$0>
	//    2    4:new             #12  <Class RealApolloStore$11$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #42  <Method void RealApolloStore$11$1(RealApolloStore$11)>
	//    6   12:invokevirtual   #46  <Method Object RealApolloStore.writeTransaction(Transaction)>
	//    7   15:checkcast       #48  <Class Set>
	//    8   18:areturn         
	}

	final RealApolloStore this$0;
	final CacheKey val$cacheKey;
	final GraphqlFragment val$fragment;
	final com.apollographql.apollo.api. val$variables;

	RealApolloStore$11(com.apollographql.apollo.api. )
	{
		this$0 = final_realapollostore;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field RealApolloStore this$0>
		val$fragment = graphqlfragment;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #26  <Field GraphqlFragment val$fragment>
		val$cacheKey = CacheKey.this;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #28  <Field CacheKey val$cacheKey>
		val$variables = ;
	//    9   16:aload_0         
	//   10   17:aload           5
	//   11   19:putfield        #30  <Field com.apollographql.apollo.api.Operation$Variables val$variables>
		super(final_executor);
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:invokespecial   #33  <Method void ApolloStoreOperation(Executor)>
	//   15   27:return          
	}
}
