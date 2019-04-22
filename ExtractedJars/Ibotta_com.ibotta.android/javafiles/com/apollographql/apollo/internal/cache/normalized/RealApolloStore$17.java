// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.cache.normalized;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.cache.CacheHeaders;
import com.apollographql.apollo.cache.normalized.CacheKey;
import com.apollographql.apollo.cache.normalized.CacheKeyResolver;
import com.apollographql.apollo.internal.field.CacheFieldValueResolver;
import com.apollographql.apollo.internal.response.RealResponseReader;

// Referenced classes of package com.apollographql.apollo.internal.cache.normalized:
//			Transaction, RealApolloStore, ReadableStore, ResponseNormalizer

class RealApolloStore$17
	implements Transaction
{

	public Object execute(ReadableStore readablestore)
	{
		com.apollographql.apollo.cache.normalized.Record record = readablestore.read(CacheKeyResolver.rootKeyForOperation(val$operation).key(), CacheHeaders.NONE);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field Operation val$operation>
	//    3    5:invokestatic    #35  <Method CacheKey CacheKeyResolver.rootKeyForOperation(Operation)>
	//    4    8:invokevirtual   #41  <Method String CacheKey.key()>
	//    5   11:getstatic       #47  <Field CacheHeaders CacheHeaders.NONE>
	//    6   14:invokeinterface #53  <Method com.apollographql.apollo.cache.normalized.Record ReadableStore.read(String, CacheHeaders)>
	//    7   19:astore_3        
		if(record == null)
	//*   8   20:aload_3         
	//*   9   21:ifnonnull       26
		{
			return ((Object) (null));
	//   10   24:aconst_null     
	//   11   25:areturn         
		} else
		{
			ResponseFieldMapper responsefieldmapper = val$operation.responseFieldMapper();
	//   12   26:aload_0         
	//   13   27:getfield        #22  <Field Operation val$operation>
	//   14   30:invokeinterface #59  <Method ResponseFieldMapper Operation.responseFieldMapper()>
	//   15   35:astore_2        
			readablestore = ((ReadableStore) (new CacheFieldValueResolver(readablestore, val$operation.variables(), cacheKeyResolver(), CacheHeaders.NONE)));
	//   16   36:new             #61  <Class CacheFieldValueResolver>
	//   17   39:dup             
	//   18   40:aload_1         
	//   19   41:aload_0         
	//   20   42:getfield        #22  <Field Operation val$operation>
	//   21   45:invokeinterface #65  <Method com.apollographql.apollo.api.Operation$Variables Operation.variables()>
	//   22   50:aload_0         
	//   23   51:getfield        #20  <Field RealApolloStore this$0>
	//   24   54:invokevirtual   #69  <Method CacheKeyResolver RealApolloStore.cacheKeyResolver()>
	//   25   57:getstatic       #47  <Field CacheHeaders CacheHeaders.NONE>
	//   26   60:invokespecial   #72  <Method void CacheFieldValueResolver(ReadableStore, com.apollographql.apollo.api.Operation$Variables, CacheKeyResolver, CacheHeaders)>
	//   27   63:astore_1        
			readablestore = ((ReadableStore) (new RealResponseReader(val$operation.variables(), ((Object) (record)), ((com.apollographql.apollo.internal.field.FieldValueResolver) (readablestore)), scalarTypeAdapters, ((com.apollographql.apollo.internal.response.ResolveDelegate) (ResponseNormalizer.NO_OP_NORMALIZER)))));
	//   28   64:new             #74  <Class RealResponseReader>
	//   29   67:dup             
	//   30   68:aload_0         
	//   31   69:getfield        #22  <Field Operation val$operation>
	//   32   72:invokeinterface #65  <Method com.apollographql.apollo.api.Operation$Variables Operation.variables()>
	//   33   77:aload_3         
	//   34   78:aload_1         
	//   35   79:aload_0         
	//   36   80:getfield        #20  <Field RealApolloStore this$0>
	//   37   83:getfield        #78  <Field com.apollographql.apollo.response.ScalarTypeAdapters RealApolloStore.scalarTypeAdapters>
	//   38   86:getstatic       #84  <Field ResponseNormalizer ResponseNormalizer.NO_OP_NORMALIZER>
	//   39   89:invokespecial   #87  <Method void RealResponseReader(com.apollographql.apollo.api.Operation$Variables, Object, com.apollographql.apollo.internal.field.FieldValueResolver, com.apollographql.apollo.response.ScalarTypeAdapters, com.apollographql.apollo.internal.response.ResolveDelegate)>
	//   40   92:astore_1        
			return val$operation.wrapData((com.apollographql.apollo.api.Operation.Data)responsefieldmapper.map(((com.apollographql.apollo.api.ResponseReader) (readablestore))));
	//   41   93:aload_0         
	//   42   94:getfield        #22  <Field Operation val$operation>
	//   43   97:aload_2         
	//   44   98:aload_1         
	//   45   99:invokeinterface #93  <Method Object ResponseFieldMapper.map(com.apollographql.apollo.api.ResponseReader)>
	//   46  104:checkcast       #95  <Class com.apollographql.apollo.api.Operation$Data>
	//   47  107:invokeinterface #99  <Method Object Operation.wrapData(com.apollographql.apollo.api.Operation$Data)>
	//   48  112:areturn         
		}
	}

	public volatile Object execute(Object obj)
	{
		return execute((ReadableStore)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #49  <Class ReadableStore>
	//    3    5:invokevirtual   #105 <Method Object execute(ReadableStore)>
	//    4    8:areturn         
	}

	final RealApolloStore this$0;
	final Operation val$operation;

	RealApolloStore$17()
	{
		this$0 = final_realapollostore;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field RealApolloStore this$0>
		val$operation = Operation.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field Operation val$operation>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
