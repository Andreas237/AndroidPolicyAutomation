// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.interceptor;

import com.apollographql.apollo.api.internal.Function;
import com.apollographql.apollo.cache.normalized.Record;
import java.util.*;

// Referenced classes of package com.apollographql.apollo.internal.interceptor:
//			ApolloCacheInterceptor

class ApolloCacheInterceptor$2
	implements Function
{

	public volatile Object apply(Object obj)
	{
		return ((Object) (apply((Collection)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #31  <Class Collection>
	//    3    5:invokevirtual   #34  <Method List apply(Collection)>
	//    4    8:areturn         
	}

	public List apply(Collection collection)
	{
		ArrayList arraylist = new ArrayList(collection.size());
	//    0    0:new             #38  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokeinterface #42  <Method int Collection.size()>
	//    4   10:invokespecial   #45  <Method void ArrayList(int)>
	//    5   13:astore_2        
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); ((List) (arraylist)).add(((Object) (((Record)((Iterator) (collection)).next()).toBuilder().mutationId(val$request.uniqueId).build()))));
	//    6   14:aload_1         
	//    7   15:invokeinterface #49  <Method Iterator Collection.iterator()>
	//    8   20:astore_1        
	//    9   21:aload_1         
	//   10   22:invokeinterface #55  <Method boolean Iterator.hasNext()>
	//   11   27:ifeq            65
	//   12   30:aload_2         
	//   13   31:aload_1         
	//   14   32:invokeinterface #59  <Method Object Iterator.next()>
	//   15   37:checkcast       #61  <Class Record>
	//   16   40:invokevirtual   #65  <Method com.apollographql.apollo.cache.normalized.Record$Builder Record.toBuilder()>
	//   17   43:aload_0         
	//   18   44:getfield        #22  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
	//   19   47:getfield        #71  <Field java.util.UUID com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.uniqueId>
	//   20   50:invokevirtual   #77  <Method com.apollographql.apollo.cache.normalized.Record$Builder com.apollographql.apollo.cache.normalized.Record$Builder.mutationId(java.util.UUID)>
	//   21   53:invokevirtual   #81  <Method Record com.apollographql.apollo.cache.normalized.Record$Builder.build()>
	//   22   56:invokeinterface #87  <Method boolean List.add(Object)>
	//   23   61:pop             
	//*  24   62:goto            21
		return ((List) (arraylist));
	//   25   65:aload_2         
	//   26   66:areturn         
	}

	final ApolloCacheInterceptor this$0;
	final com.apollographql.apollo.interceptor.ptorRequest val$request;

	ApolloCacheInterceptor$2()
	{
		this$0 = final_apollocacheinterceptor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ApolloCacheInterceptor this$0>
		val$request = com.apollographql.apollo.interceptor.ptorRequest.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
