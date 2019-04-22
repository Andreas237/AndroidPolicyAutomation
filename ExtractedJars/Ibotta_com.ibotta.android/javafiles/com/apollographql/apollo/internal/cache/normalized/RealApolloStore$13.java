// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.cache.normalized;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.cache.normalized.ApolloStoreOperation;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

// Referenced classes of package com.apollographql.apollo.internal.cache.normalized:
//			RealApolloStore

class RealApolloStore$13 extends ApolloStoreOperation
{

	protected volatile Object perform()
	{
		return ((Object) (perform()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method Set perform()>
	//    2    4:areturn         
	}

	protected Set perform()
	{
		return doWrite(val$operation, val$operationData, true, val$mutationId);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field RealApolloStore this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field Operation val$operation>
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field com.apollographql.apollo.api.Operation$Data val$operationData>
	//    6   12:iconst_1        
	//    7   13:aload_0         
	//    8   14:getfield        #28  <Field UUID val$mutationId>
	//    9   17:invokevirtual   #41  <Method Set RealApolloStore.doWrite(Operation, com.apollographql.apollo.api.Operation$Data, boolean, UUID)>
	//   10   20:areturn         
	}

	final RealApolloStore this$0;
	final UUID val$mutationId;
	final Operation val$operation;
	final com.apollographql.apollo.api.Operation.Data val$operationData;

	RealApolloStore$13(UUID uuid)
	{
		this$0 = final_realapollostore;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field RealApolloStore this$0>
		val$operation = operation1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #24  <Field Operation val$operation>
		val$operationData = com.apollographql.apollo.api.Operation.Data.this;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #26  <Field com.apollographql.apollo.api.Operation$Data val$operationData>
		val$mutationId = uuid;
	//    9   16:aload_0         
	//   10   17:aload           5
	//   11   19:putfield        #28  <Field UUID val$mutationId>
		super(final_executor);
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:invokespecial   #31  <Method void ApolloStoreOperation(Executor)>
	//   15   27:return          
	}
}
