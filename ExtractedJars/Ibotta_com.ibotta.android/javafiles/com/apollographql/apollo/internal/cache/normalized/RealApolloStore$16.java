// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.cache.normalized;

import com.apollographql.apollo.cache.normalized.ApolloStoreOperation;
import com.apollographql.apollo.cache.normalized.OptimisticNormalizedCache;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

// Referenced classes of package com.apollographql.apollo.internal.cache.normalized:
//			RealApolloStore, Transaction, WriteableStore

class RealApolloStore$16 extends ApolloStoreOperation
{

	protected Boolean perform()
	{
		Set set = (Set)writeTransaction(new Transaction() {

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
				return optimisticCache.removeOptimisticUpdates(mutationId);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field RealApolloStore$16 this$1>
			//    2    4:getfield        #33  <Field RealApolloStore RealApolloStore$16.this$0>
			//    3    7:getfield        #39  <Field OptimisticNormalizedCache RealApolloStore.optimisticCache>
			//    4   10:aload_0         
			//    5   11:getfield        #18  <Field RealApolloStore$16 this$1>
			//    6   14:getfield        #43  <Field UUID RealApolloStore$16.val$mutationId>
			//    7   17:invokevirtual   #49  <Method Set OptimisticNormalizedCache.removeOptimisticUpdates(UUID)>
			//    8   20:areturn         
			}

			final RealApolloStore._cls16 this$1;

			
			{
				this$1 = RealApolloStore._cls16.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field RealApolloStore$16 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field RealApolloStore this$0>
	//    2    4:new             #12  <Class RealApolloStore$16$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #31  <Method void RealApolloStore$16$1(RealApolloStore$16)>
	//    6   12:invokevirtual   #35  <Method Object RealApolloStore.writeTransaction(Transaction)>
	//    7   15:checkcast       #37  <Class Set>
	//    8   18:astore_1        
		publish(set);
	//    9   19:aload_0         
	//   10   20:getfield        #20  <Field RealApolloStore this$0>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #41  <Method void RealApolloStore.publish(Set)>
		return Boolean.TRUE;
	//   13   27:getstatic       #47  <Field Boolean Boolean.TRUE>
	//   14   30:areturn         
	}

	protected volatile Object perform()
	{
		return ((Object) (perform()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method Boolean perform()>
	//    2    4:areturn         
	}

	final RealApolloStore this$0;
	final UUID val$mutationId;

	RealApolloStore$16(UUID uuid)
	{
		this$0 = final_realapollostore;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field RealApolloStore this$0>
		val$mutationId = uuid;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #22  <Field UUID val$mutationId>
		super(Executor.this);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #25  <Method void ApolloStoreOperation(Executor)>
	//    9   15:return          
	}
}
