// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.cache.normalized;

import com.apollographql.apollo.cache.normalized.*;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

// Referenced classes of package com.apollographql.apollo.internal.cache.normalized:
//			RealApolloStore, Transaction, WriteableStore

class RealApolloStore$5 extends ApolloStoreOperation
{

	protected Integer perform()
	{
		return (Integer)writeTransaction(new Transaction() {

			public Integer execute(WriteableStore writeablestore)
			{
				writeablestore = ((WriteableStore) (cacheKeys.iterator()));
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field RealApolloStore$5 this$1>
			//    2    4:getfield        #28  <Field List RealApolloStore$5.val$cacheKeys>
			//    3    7:invokeinterface #34  <Method Iterator List.iterator()>
			//    4   12:astore_1        
				int i = 0;
			//    5   13:iconst_0        
			//    6   14:istore_2        
				do
				{
					if(!((Iterator) (writeablestore)).hasNext())
						break;
			//    7   15:aload_1         
			//    8   16:invokeinterface #40  <Method boolean Iterator.hasNext()>
			//    9   21:ifeq            58
					CacheKey cachekey = (CacheKey)((Iterator) (writeablestore)).next();
			//   10   24:aload_1         
			//   11   25:invokeinterface #44  <Method Object Iterator.next()>
			//   12   30:checkcast       #46  <Class CacheKey>
			//   13   33:astore_3        
					if(optimisticCache.remove(cachekey))
			//*  14   34:aload_0         
			//*  15   35:getfield        #18  <Field RealApolloStore$5 this$1>
			//*  16   38:getfield        #50  <Field RealApolloStore RealApolloStore$5.this$0>
			//*  17   41:getfield        #56  <Field OptimisticNormalizedCache RealApolloStore.optimisticCache>
			//*  18   44:aload_3         
			//*  19   45:invokevirtual   #62  <Method boolean OptimisticNormalizedCache.remove(CacheKey)>
			//*  20   48:ifeq            15
						i++;
			//   21   51:iload_2         
			//   22   52:iconst_1        
			//   23   53:iadd            
			//   24   54:istore_2        
				} while(true);
			//   25   55:goto            15
				return Integer.valueOf(i);
			//   26   58:iload_2         
			//   27   59:invokestatic    #68  <Method Integer Integer.valueOf(int)>
			//   28   62:areturn         
			}

			public volatile Object execute(Object obj)
			{
				return ((Object) (execute((WriteableStore)obj)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #71  <Class WriteableStore>
			//    3    5:invokevirtual   #73  <Method Integer execute(WriteableStore)>
			//    4    8:areturn         
			}

			final RealApolloStore._cls5 this$1;

			
			{
				this$1 = RealApolloStore._cls5.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field RealApolloStore$5 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field RealApolloStore this$0>
	//    2    4:new             #12  <Class RealApolloStore$5$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #31  <Method void RealApolloStore$5$1(RealApolloStore$5)>
	//    6   12:invokevirtual   #35  <Method Object RealApolloStore.writeTransaction(Transaction)>
	//    7   15:checkcast       #37  <Class Integer>
	//    8   18:areturn         
	}

	protected volatile Object perform()
	{
		return ((Object) (perform()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method Integer perform()>
	//    2    4:areturn         
	}

	final RealApolloStore this$0;
	final List val$cacheKeys;

	RealApolloStore$5(List list)
	{
		this$0 = final_realapollostore;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field RealApolloStore this$0>
		val$cacheKeys = list;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #22  <Field List val$cacheKeys>
		super(Executor.this);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #25  <Method void ApolloStoreOperation(Executor)>
	//    9   15:return          
	}
}
