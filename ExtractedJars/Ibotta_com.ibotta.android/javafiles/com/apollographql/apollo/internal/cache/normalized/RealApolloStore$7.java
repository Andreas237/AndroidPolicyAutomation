// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.cache.normalized;

import com.apollographql.apollo.api.*;
import com.apollographql.apollo.cache.CacheHeaders;
import com.apollographql.apollo.cache.normalized.ApolloStoreOperation;
import java.util.concurrent.Executor;

// Referenced classes of package com.apollographql.apollo.internal.cache.normalized:
//			RealApolloStore, ResponseNormalizer

class RealApolloStore$7 extends ApolloStoreOperation
{

	protected Response perform()
	{
		return doRead(val$operation, val$responseFieldMapper, val$responseNormalizer, val$cacheHeaders);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field RealApolloStore this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field Operation val$operation>
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field ResponseFieldMapper val$responseFieldMapper>
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field ResponseNormalizer val$responseNormalizer>
	//    8   16:aload_0         
	//    9   17:getfield        #32  <Field CacheHeaders val$cacheHeaders>
	//   10   20:invokevirtual   #42  <Method Response RealApolloStore.doRead(Operation, ResponseFieldMapper, ResponseNormalizer, CacheHeaders)>
	//   11   23:areturn         
	}

	protected volatile Object perform()
	{
		return ((Object) (perform()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method Response perform()>
	//    2    4:areturn         
	}

	final RealApolloStore this$0;
	final CacheHeaders val$cacheHeaders;
	final Operation val$operation;
	final ResponseFieldMapper val$responseFieldMapper;
	final ResponseNormalizer val$responseNormalizer;

	RealApolloStore$7(CacheHeaders cacheheaders)
	{
		this$0 = final_realapollostore;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field RealApolloStore this$0>
		val$operation = operation1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #26  <Field Operation val$operation>
		val$responseFieldMapper = responsefieldmapper;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #28  <Field ResponseFieldMapper val$responseFieldMapper>
		val$responseNormalizer = ResponseNormalizer.this;
	//    9   16:aload_0         
	//   10   17:aload           5
	//   11   19:putfield        #30  <Field ResponseNormalizer val$responseNormalizer>
		val$cacheHeaders = cacheheaders;
	//   12   22:aload_0         
	//   13   23:aload           6
	//   14   25:putfield        #32  <Field CacheHeaders val$cacheHeaders>
		super(final_executor);
	//   15   28:aload_0         
	//   16   29:aload_2         
	//   17   30:invokespecial   #35  <Method void ApolloStoreOperation(Executor)>
	//   18   33:return          
	}
}
