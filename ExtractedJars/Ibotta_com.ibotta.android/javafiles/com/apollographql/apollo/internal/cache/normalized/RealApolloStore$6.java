// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.cache.normalized;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.cache.normalized.ApolloStoreOperation;
import java.util.concurrent.Executor;

// Referenced classes of package com.apollographql.apollo.internal.cache.normalized:
//			RealApolloStore

class RealApolloStore$6 extends ApolloStoreOperation
{

	protected Object perform()
	{
		return doRead(val$operation);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field RealApolloStore this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Operation val$operation>
	//    4    8:invokevirtual   #30  <Method Object RealApolloStore.doRead(Operation)>
	//    5   11:areturn         
	}

	final RealApolloStore this$0;
	final Operation val$operation;

	RealApolloStore$6(Operation operation1)
	{
		this$0 = final_realapollostore;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field RealApolloStore this$0>
		val$operation = operation1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #20  <Field Operation val$operation>
		super(Executor.this);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #23  <Method void ApolloStoreOperation(Executor)>
	//    9   15:return          
	}
}
