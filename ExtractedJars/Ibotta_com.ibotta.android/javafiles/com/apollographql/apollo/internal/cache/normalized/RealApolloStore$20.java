// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.cache.normalized;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.cache.CacheHeaders;
import com.apollographql.apollo.cache.normalized.OptimisticNormalizedCache;
import com.apollographql.apollo.cache.normalized.Record;
import com.apollographql.apollo.internal.response.RealResponseWriter;
import java.util.*;

// Referenced classes of package com.apollographql.apollo.internal.cache.normalized:
//			Transaction, RealApolloStore, WriteableStore, ResponseNormalizer

class RealApolloStore$20
	implements Transaction
{

	public volatile Object execute(Object obj)
	{
		return ((Object) (execute((WriteableStore)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #42  <Class WriteableStore>
	//    3    5:invokevirtual   #45  <Method Set execute(WriteableStore)>
	//    4    8:areturn         
	}

	public Set execute(WriteableStore writeablestore)
	{
		RealResponseWriter realresponsewriter = new RealResponseWriter(val$operation.variables(), scalarTypeAdapters);
	//    0    0:new             #47  <Class RealResponseWriter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field Operation val$operation>
	//    4    8:invokeinterface #53  <Method com.apollographql.apollo.api.Operation$Variables Operation.variables()>
	//    5   13:aload_0         
	//    6   14:getfield        #26  <Field RealApolloStore this$0>
	//    7   17:getfield        #57  <Field com.apollographql.apollo.response.ScalarTypeAdapters RealApolloStore.scalarTypeAdapters>
	//    8   20:invokespecial   #60  <Method void RealResponseWriter(com.apollographql.apollo.api.Operation$Variables, com.apollographql.apollo.response.ScalarTypeAdapters)>
	//    9   23:astore_2        
		val$operationData.marshaller().marshal(((com.apollographql.apollo.api.ResponseWriter) (realresponsewriter)));
	//   10   24:aload_0         
	//   11   25:getfield        #30  <Field com.apollographql.apollo.api.Operation$Data val$operationData>
	//   12   28:invokeinterface #66  <Method ResponseFieldMarshaller com.apollographql.apollo.api.Operation$Data.marshaller()>
	//   13   33:aload_2         
	//   14   34:invokeinterface #72  <Method void ResponseFieldMarshaller.marshal(com.apollographql.apollo.api.ResponseWriter)>
		writeablestore = ((WriteableStore) (networkResponseNormalizer()));
	//   15   39:aload_0         
	//   16   40:getfield        #26  <Field RealApolloStore this$0>
	//   17   43:invokevirtual   #76  <Method ResponseNormalizer RealApolloStore.networkResponseNormalizer()>
	//   18   46:astore_1        
		((ResponseNormalizer) (writeablestore)).willResolveRootQuery(val$operation);
	//   19   47:aload_1         
	//   20   48:aload_0         
	//   21   49:getfield        #28  <Field Operation val$operation>
	//   22   52:invokevirtual   #82  <Method void ResponseNormalizer.willResolveRootQuery(Operation)>
		realresponsewriter.resolveFields(((com.apollographql.apollo.internal.response.ResolveDelegate) (writeablestore)));
	//   23   55:aload_2         
	//   24   56:aload_1         
	//   25   57:invokevirtual   #86  <Method void RealResponseWriter.resolveFields(com.apollographql.apollo.internal.response.ResolveDelegate)>
		if(val$optimistic)
	//*  26   60:aload_0         
	//*  27   61:getfield        #32  <Field boolean val$optimistic>
	//*  28   64:ifeq            138
		{
			ArrayList arraylist = new ArrayList();
	//   29   67:new             #88  <Class ArrayList>
	//   30   70:dup             
	//   31   71:invokespecial   #89  <Method void ArrayList()>
	//   32   74:astore_2        
			for(writeablestore = ((WriteableStore) (((ResponseNormalizer) (writeablestore)).records().iterator())); ((Iterator) (writeablestore)).hasNext(); ((List) (arraylist)).add(((Object) (((Record)((Iterator) (writeablestore)).next()).toBuilder().mutationId(val$mutationId).build()))));
	//   33   75:aload_1         
	//   34   76:invokevirtual   #93  <Method Collection ResponseNormalizer.records()>
	//   35   79:invokeinterface #99  <Method Iterator Collection.iterator()>
	//   36   84:astore_1        
	//   37   85:aload_1         
	//   38   86:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//   39   91:ifeq            126
	//   40   94:aload_2         
	//   41   95:aload_1         
	//   42   96:invokeinterface #109 <Method Object Iterator.next()>
	//   43  101:checkcast       #111 <Class Record>
	//   44  104:invokevirtual   #115 <Method com.apollographql.apollo.cache.normalized.Record$Builder Record.toBuilder()>
	//   45  107:aload_0         
	//   46  108:getfield        #34  <Field UUID val$mutationId>
	//   47  111:invokevirtual   #121 <Method com.apollographql.apollo.cache.normalized.Record$Builder com.apollographql.apollo.cache.normalized.Record$Builder.mutationId(UUID)>
	//   48  114:invokevirtual   #125 <Method Record com.apollographql.apollo.cache.normalized.Record$Builder.build()>
	//   49  117:invokeinterface #131 <Method boolean List.add(Object)>
	//   50  122:pop             
	//*  51  123:goto            85
			return optimisticCache.mergeOptimisticUpdates(((Collection) (arraylist)));
	//   52  126:aload_0         
	//   53  127:getfield        #26  <Field RealApolloStore this$0>
	//   54  130:getfield        #135 <Field OptimisticNormalizedCache RealApolloStore.optimisticCache>
	//   55  133:aload_2         
	//   56  134:invokevirtual   #141 <Method Set OptimisticNormalizedCache.mergeOptimisticUpdates(Collection)>
	//   57  137:areturn         
		} else
		{
			return optimisticCache.merge(((ResponseNormalizer) (writeablestore)).records(), CacheHeaders.NONE);
	//   58  138:aload_0         
	//   59  139:getfield        #26  <Field RealApolloStore this$0>
	//   60  142:getfield        #135 <Field OptimisticNormalizedCache RealApolloStore.optimisticCache>
	//   61  145:aload_1         
	//   62  146:invokevirtual   #93  <Method Collection ResponseNormalizer.records()>
	//   63  149:getstatic       #147 <Field CacheHeaders CacheHeaders.NONE>
	//   64  152:invokevirtual   #151 <Method Set OptimisticNormalizedCache.merge(Collection, CacheHeaders)>
	//   65  155:areturn         
		}
	}

	final RealApolloStore this$0;
	final UUID val$mutationId;
	final Operation val$operation;
	final com.apollographql.apollo.api.Operation.Data val$operationData;
	final boolean val$optimistic;

	RealApolloStore$20()
	{
		this$0 = final_realapollostore;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field RealApolloStore this$0>
		val$operation = operation1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field Operation val$operation>
		val$operationData = data;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field com.apollographql.apollo.api.Operation$Data val$operationData>
		val$optimistic = flag;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #32  <Field boolean val$optimistic>
		val$mutationId = UUID.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #34  <Field UUID val$mutationId>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #37  <Method void Object()>
	//   17   31:return          
	}
}
