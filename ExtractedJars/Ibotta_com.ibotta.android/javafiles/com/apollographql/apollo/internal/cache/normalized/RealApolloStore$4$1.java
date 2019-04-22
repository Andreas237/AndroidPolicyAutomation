// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.cache.normalized;

import com.apollographql.apollo.cache.normalized.*;
import java.util.concurrent.Executor;

// Referenced classes of package com.apollographql.apollo.internal.cache.normalized:
//			Transaction, RealApolloStore, WriteableStore

class RealApolloStore$4$1
	implements Transaction
{

	public Boolean execute(WriteableStore writeablestore)
	{
		return Boolean.valueOf(optimisticCache.remove(val$cacheKey));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field RealApolloStore$4 this$1>
	//    2    4:getfield        #28  <Field RealApolloStore RealApolloStore$4.this$0>
	//    3    7:getfield        #34  <Field OptimisticNormalizedCache RealApolloStore.optimisticCache>
	//    4   10:aload_0         
	//    5   11:getfield        #18  <Field RealApolloStore$4 this$1>
	//    6   14:getfield        #38  <Field CacheKey RealApolloStore$4.val$cacheKey>
	//    7   17:invokevirtual   #44  <Method boolean OptimisticNormalizedCache.remove(CacheKey)>
	//    8   20:invokestatic    #50  <Method Boolean Boolean.valueOf(boolean)>
	//    9   23:areturn         
	}

	public volatile Object execute(Object obj)
	{
		return ((Object) (execute((WriteableStore)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #53  <Class WriteableStore>
	//    3    5:invokevirtual   #55  <Method Boolean execute(WriteableStore)>
	//    4    8:areturn         
	}

	final RealApolloStore._cls4 this$1;

	RealApolloStore$4$1()
	{
		this$1 = RealApolloStore._cls4.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field RealApolloStore$4 this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/apollographql/apollo/internal/cache/normalized/RealApolloStore$4

/* anonymous class */
	class RealApolloStore._cls4 extends ApolloStoreOperation
	{

		protected Boolean perform()
		{
			return (Boolean)writeTransaction(((Transaction) (new RealApolloStore._cls4._cls1())));
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field RealApolloStore this$0>
		//    2    4:new             #12  <Class RealApolloStore$4$1>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:invokespecial   #31  <Method void RealApolloStore$4$1(RealApolloStore$4)>
		//    6   12:invokevirtual   #35  <Method Object RealApolloStore.writeTransaction(Transaction)>
		//    7   15:checkcast       #37  <Class Boolean>
		//    8   18:areturn         
		}

		protected volatile Object perform()
		{
			return ((Object) (perform()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method Boolean perform()>
		//    2    4:areturn         
		}

		final RealApolloStore this$0;
		final CacheKey val$cacheKey;

			
			{
				this$0 = final_realapollostore;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field RealApolloStore this$0>
				cacheKey = cachekey;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #22  <Field CacheKey val$cacheKey>
				super(Executor.this);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #25  <Method void ApolloStoreOperation(Executor)>
			//    9   15:return          
			}
	}

}
