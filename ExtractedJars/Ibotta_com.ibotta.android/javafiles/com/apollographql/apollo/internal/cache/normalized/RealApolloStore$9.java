// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.cache.normalized;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.cache.normalized.ApolloStoreOperation;
import java.util.Set;
import java.util.concurrent.Executor;

// Referenced classes of package com.apollographql.apollo.internal.cache.normalized:
//			RealApolloStore

class RealApolloStore$9 extends ApolloStoreOperation
{

	protected volatile Object perform()
	{
		return ((Object) (perform()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method Set perform()>
	//    2    4:areturn         
	}

	protected Set perform()
	{
		return doWrite(val$operation, val$operationData, false, ((java.util.UUID) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field RealApolloStore this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field Operation val$operation>
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field com.apollographql.apollo.api.Operation$Data val$operationData>
	//    6   12:iconst_0        
	//    7   13:aconst_null     
	//    8   14:invokevirtual   #37  <Method Set RealApolloStore.doWrite(Operation, com.apollographql.apollo.api.Operation$Data, boolean, java.util.UUID)>
	//    9   17:areturn         
	}

	final RealApolloStore this$0;
	final Operation val$operation;
	final com.apollographql.apollo.api.Operation.Data val$operationData;

	RealApolloStore$9(com.apollographql.apollo.api.Operation.Data data)
	{
		this$0 = final_realapollostore;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field RealApolloStore this$0>
		val$operation = Operation.this;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #22  <Field Operation val$operation>
		val$operationData = data;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #24  <Field com.apollographql.apollo.api.Operation$Data val$operationData>
		super(final_executor);
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:invokespecial   #27  <Method void ApolloStoreOperation(Executor)>
	//   12   21:return          
	}
}
