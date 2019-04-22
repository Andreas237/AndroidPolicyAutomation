// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.api.internal.Utils;
import com.apollographql.apollo.cache.CacheHeaders;

// Referenced classes of package com.apollographql.apollo.interceptor:
//			ApolloInterceptor

public static final class ApolloInterceptor$InterceptorRequest$Builder
{

	public ApolloInterceptor.InterceptorRequest build()
	{
		return new ApolloInterceptor.InterceptorRequest(operation, cacheHeaders, optimisticUpdates, fetchFromCache);
	//    0    0:new             #6   <Class ApolloInterceptor$InterceptorRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #52  <Field Operation operation>
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field CacheHeaders cacheHeaders>
	//    6   12:aload_0         
	//    7   13:getfield        #40  <Field Optional optimisticUpdates>
	//    8   16:aload_0         
	//    9   17:getfield        #58  <Field boolean fetchFromCache>
	//   10   20:invokespecial   #61  <Method void ApolloInterceptor$InterceptorRequest(Operation, CacheHeaders, Optional, boolean)>
	//   11   23:areturn         
	}

	public ApolloInterceptor$InterceptorRequest$Builder cacheHeaders(CacheHeaders cacheheaders)
	{
		cacheHeaders = (CacheHeaders)Utils.checkNotNull(((Object) (cacheheaders)), "cacheHeaders == null");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #64  <String "cacheHeaders == null">
	//    3    4:invokestatic    #48  <Method Object Utils.checkNotNull(Object, Object)>
	//    4    7:checkcast       #27  <Class CacheHeaders>
	//    5   10:putfield        #32  <Field CacheHeaders cacheHeaders>
		return this;
	//    6   13:aload_0         
	//    7   14:areturn         
	}

	public ApolloInterceptor$InterceptorRequest$Builder fetchFromCache(boolean flag)
	{
		fetchFromCache = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #58  <Field boolean fetchFromCache>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ApolloInterceptor$InterceptorRequest$Builder optimisticUpdates(com.apollographql.apollo.api.Operation.Data data)
	{
		optimisticUpdates = Optional.fromNullable(((Object) (data)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #70  <Method Optional Optional.fromNullable(Object)>
	//    3    5:putfield        #40  <Field Optional optimisticUpdates>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public ApolloInterceptor$InterceptorRequest$Builder optimisticUpdates(Optional optional)
	{
		optimisticUpdates = (Optional)Utils.checkNotNull(((Object) (optional)), "optimisticUpdates == null");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #73  <String "optimisticUpdates == null">
	//    3    4:invokestatic    #48  <Method Object Utils.checkNotNull(Object, Object)>
	//    4    7:checkcast       #34  <Class Optional>
	//    5   10:putfield        #40  <Field Optional optimisticUpdates>
		return this;
	//    6   13:aload_0         
	//    7   14:areturn         
	}

	private CacheHeaders cacheHeaders;
	private boolean fetchFromCache;
	private final Operation operation;
	private Optional optimisticUpdates;

	ApolloInterceptor$InterceptorRequest$Builder(Operation operation1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		cacheHeaders = CacheHeaders.NONE;
	//    2    4:aload_0         
	//    3    5:getstatic       #30  <Field CacheHeaders CacheHeaders.NONE>
	//    4    8:putfield        #32  <Field CacheHeaders cacheHeaders>
		optimisticUpdates = Optional.absent();
	//    5   11:aload_0         
	//    6   12:invokestatic    #38  <Method Optional Optional.absent()>
	//    7   15:putfield        #40  <Field Optional optimisticUpdates>
		operation = (Operation)Utils.checkNotNull(((Object) (operation1)), "operation == null");
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:ldc1            #42  <String "operation == null">
	//   11   22:invokestatic    #48  <Method Object Utils.checkNotNull(Object, Object)>
	//   12   25:checkcast       #50  <Class Operation>
	//   13   28:putfield        #52  <Field Operation operation>
	//   14   31:return          
	}
}
