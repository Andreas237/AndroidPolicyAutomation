// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.cache.normalized;

import com.apollographql.apollo.cache.normalized.ApolloStoreOperation;
import com.apollographql.apollo.cache.normalized.OptimisticNormalizedCache;
import java.util.concurrent.Executor;

// Referenced classes of package com.apollographql.apollo.internal.cache.normalized:
//			Transaction, RealApolloStore, WriteableStore

class RealApolloStore$3$1
	implements Transaction
{

	public Boolean execute(WriteableStore writeablestore)
	{
		optimisticCache.clearAll();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field RealApolloStore$3 this$1>
	//    2    4:getfield        #28  <Field RealApolloStore RealApolloStore$3.this$0>
	//    3    7:getfield        #34  <Field OptimisticNormalizedCache RealApolloStore.optimisticCache>
	//    4   10:invokevirtual   #39  <Method void OptimisticNormalizedCache.clearAll()>
		return Boolean.TRUE;
	//    5   13:getstatic       #45  <Field Boolean Boolean.TRUE>
	//    6   16:areturn         
	}

	public volatile Object execute(Object obj)
	{
		return ((Object) (execute((WriteableStore)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #48  <Class WriteableStore>
	//    3    5:invokevirtual   #50  <Method Boolean execute(WriteableStore)>
	//    4    8:areturn         
	}

	final RealApolloStore._cls3 this$1;

	RealApolloStore$3$1()
	{
		this$1 = RealApolloStore._cls3.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field RealApolloStore$3 this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/apollographql/apollo/internal/cache/normalized/RealApolloStore$3

/* anonymous class */
	class RealApolloStore._cls3 extends ApolloStoreOperation
	{

		public Boolean perform()
		{
			return (Boolean)writeTransaction(((Transaction) (new RealApolloStore._cls3._cls1())));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field RealApolloStore this$0>
		//    2    4:new             #12  <Class RealApolloStore$3$1>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:invokespecial   #27  <Method void RealApolloStore$3$1(RealApolloStore$3)>
		//    6   12:invokevirtual   #31  <Method Object RealApolloStore.writeTransaction(Transaction)>
		//    7   15:checkcast       #33  <Class Boolean>
		//    8   18:areturn         
		}

		public volatile Object perform()
		{
			return ((Object) (perform()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #36  <Method Boolean perform()>
		//    2    4:areturn         
		}

		final RealApolloStore this$0;

			
			{
				this$0 = RealApolloStore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field RealApolloStore this$0>
				super(executor);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #21  <Method void ApolloStoreOperation(Executor)>
			//    6   10:return          
			}
	}

}
