// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.interceptor;

import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.internal.cache.normalized.Transaction;
import com.apollographql.apollo.internal.cache.normalized.WriteableStore;
import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.apollographql.apollo.internal.interceptor:
//			ApolloCacheInterceptor

class ApolloCacheInterceptor$3
	implements Transaction
{

	public volatile Object execute(Object obj)
	{
		return ((Object) (execute((WriteableStore)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class WriteableStore>
	//    3    5:invokevirtual   #38  <Method Set execute(WriteableStore)>
	//    4    8:areturn         
	}

	public Set execute(WriteableStore writeablestore)
	{
		return writeablestore.merge((Collection)val$records.get(), val$request.cacheHeaders);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #24  <Field Optional val$records>
	//    3    5:invokevirtual   #45  <Method Object Optional.get()>
	//    4    8:checkcast       #47  <Class Collection>
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
	//    7   15:getfield        #53  <Field com.apollographql.apollo.cache.CacheHeaders com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.cacheHeaders>
	//    8   18:invokeinterface #57  <Method Set WriteableStore.merge(Collection, com.apollographql.apollo.cache.CacheHeaders)>
	//    9   23:areturn         
	}

	final ApolloCacheInterceptor this$0;
	final Optional val$records;
	final com.apollographql.apollo.interceptor.ptorRequest val$request;

	ApolloCacheInterceptor$3()
	{
		this$0 = final_apollocacheinterceptor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field ApolloCacheInterceptor this$0>
		val$records = optional;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field Optional val$records>
		val$request = com.apollographql.apollo.interceptor.ptorRequest.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #29  <Method void Object()>
	//   11   19:return          
	}
}
