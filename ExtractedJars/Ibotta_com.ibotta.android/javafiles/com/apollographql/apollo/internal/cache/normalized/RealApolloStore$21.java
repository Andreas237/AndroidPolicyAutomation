// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.cache.normalized;

import com.apollographql.apollo.api.GraphqlFragment;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.cache.CacheHeaders;
import com.apollographql.apollo.cache.normalized.CacheKey;
import com.apollographql.apollo.internal.response.RealResponseWriter;
import java.util.Set;

// Referenced classes of package com.apollographql.apollo.internal.cache.normalized:
//			Transaction, RealApolloStore, WriteableStore, ResponseNormalizer

class RealApolloStore$21
	implements Transaction
{

	public volatile Object execute(Object obj)
	{
		return ((Object) (execute((WriteableStore)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #38  <Class WriteableStore>
	//    3    5:invokevirtual   #41  <Method Set execute(WriteableStore)>
	//    4    8:areturn         
	}

	public Set execute(WriteableStore writeablestore)
	{
		writeablestore = ((WriteableStore) (new RealResponseWriter(val$variables, scalarTypeAdapters)));
	//    0    0:new             #43  <Class RealResponseWriter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field com.apollographql.apollo.api.Operation$Variables val$variables>
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field RealApolloStore this$0>
	//    6   12:getfield        #47  <Field com.apollographql.apollo.response.ScalarTypeAdapters RealApolloStore.scalarTypeAdapters>
	//    7   15:invokespecial   #50  <Method void RealResponseWriter(com.apollographql.apollo.api.Operation$Variables, com.apollographql.apollo.response.ScalarTypeAdapters)>
	//    8   18:astore_1        
		val$fragment.marshaller().marshal(((com.apollographql.apollo.api.ResponseWriter) (writeablestore)));
	//    9   19:aload_0         
	//   10   20:getfield        #28  <Field GraphqlFragment val$fragment>
	//   11   23:invokeinterface #56  <Method ResponseFieldMarshaller GraphqlFragment.marshaller()>
	//   12   28:aload_1         
	//   13   29:invokeinterface #62  <Method void ResponseFieldMarshaller.marshal(com.apollographql.apollo.api.ResponseWriter)>
		ResponseNormalizer responsenormalizer = networkResponseNormalizer();
	//   14   34:aload_0         
	//   15   35:getfield        #24  <Field RealApolloStore this$0>
	//   16   38:invokevirtual   #66  <Method ResponseNormalizer RealApolloStore.networkResponseNormalizer()>
	//   17   41:astore_2        
		responsenormalizer.willResolveRecord(val$cacheKey);
	//   18   42:aload_2         
	//   19   43:aload_0         
	//   20   44:getfield        #30  <Field CacheKey val$cacheKey>
	//   21   47:invokevirtual   #72  <Method void ResponseNormalizer.willResolveRecord(CacheKey)>
		((RealResponseWriter) (writeablestore)).resolveFields(((com.apollographql.apollo.internal.response.ResolveDelegate) (responsenormalizer)));
	//   22   50:aload_1         
	//   23   51:aload_2         
	//   24   52:invokevirtual   #76  <Method void RealResponseWriter.resolveFields(com.apollographql.apollo.internal.response.ResolveDelegate)>
		return merge(responsenormalizer.records(), CacheHeaders.NONE);
	//   25   55:aload_0         
	//   26   56:getfield        #24  <Field RealApolloStore this$0>
	//   27   59:aload_2         
	//   28   60:invokevirtual   #80  <Method java.util.Collection ResponseNormalizer.records()>
	//   29   63:getstatic       #86  <Field CacheHeaders CacheHeaders.NONE>
	//   30   66:invokevirtual   #90  <Method Set RealApolloStore.merge(java.util.Collection, CacheHeaders)>
	//   31   69:areturn         
	}

	final RealApolloStore this$0;
	final CacheKey val$cacheKey;
	final GraphqlFragment val$fragment;
	final com.apollographql.apollo.api. val$variables;

	RealApolloStore$21()
	{
		this$0 = final_realapollostore;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field RealApolloStore this$0>
		val$variables = ;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field com.apollographql.apollo.api.Operation$Variables val$variables>
		val$fragment = graphqlfragment;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field GraphqlFragment val$fragment>
		val$cacheKey = CacheKey.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #30  <Field CacheKey val$cacheKey>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #33  <Method void Object()>
	//   14   25:return          
	}
}
