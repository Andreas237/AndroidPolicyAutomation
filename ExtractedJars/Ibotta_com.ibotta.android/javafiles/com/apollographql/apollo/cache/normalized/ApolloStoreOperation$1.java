// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.normalized;

import java.util.concurrent.Executor;

// Referenced classes of package com.apollographql.apollo.cache.normalized:
//			ApolloStoreOperation

class ApolloStoreOperation$1 extends ApolloStoreOperation
{

	protected Object perform()
	{
		return val$result;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Object val$result>
	//    2    4:areturn         
	}

	final Object val$result;

	ApolloStoreOperation$1(Object obj)
	{
		val$result = obj;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #14  <Field Object val$result>
		super(final_executor);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #17  <Method void ApolloStoreOperation(Executor)>
	//    6   10:return          
	}
}
