// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.cache.normalized;

import com.apollographql.apollo.api.GraphqlFragment;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.cache.CacheHeaders;
import com.apollographql.apollo.cache.normalized.CacheKey;
import com.apollographql.apollo.internal.field.CacheFieldValueResolver;
import com.apollographql.apollo.internal.response.RealResponseReader;

// Referenced classes of package com.apollographql.apollo.internal.cache.normalized:
//			Transaction, RealApolloStore, ReadableStore, ResponseNormalizer

class RealApolloStore$19
	implements Transaction
{

	public GraphqlFragment execute(ReadableStore readablestore)
	{
		com.apollographql.apollo.cache.normalized.Record record = readablestore.read(val$cacheKey.key(), CacheHeaders.NONE);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #26  <Field CacheKey val$cacheKey>
	//    3    5:invokevirtual   #43  <Method String CacheKey.key()>
	//    4    8:getstatic       #49  <Field CacheHeaders CacheHeaders.NONE>
	//    5   11:invokeinterface #55  <Method com.apollographql.apollo.cache.normalized.Record ReadableStore.read(String, CacheHeaders)>
	//    6   16:astore_2        
		if(record == null)
	//*   7   17:aload_2         
	//*   8   18:ifnonnull       23
		{
			return null;
	//    9   21:aconst_null     
	//   10   22:areturn         
		} else
		{
			readablestore = ((ReadableStore) (new CacheFieldValueResolver(readablestore, val$variables, cacheKeyResolver(), CacheHeaders.NONE)));
	//   11   23:new             #57  <Class CacheFieldValueResolver>
	//   12   26:dup             
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #28  <Field com.apollographql.apollo.api.Operation$Variables val$variables>
	//   16   32:aload_0         
	//   17   33:getfield        #24  <Field RealApolloStore this$0>
	//   18   36:invokevirtual   #61  <Method com.apollographql.apollo.cache.normalized.CacheKeyResolver RealApolloStore.cacheKeyResolver()>
	//   19   39:getstatic       #49  <Field CacheHeaders CacheHeaders.NONE>
	//   20   42:invokespecial   #64  <Method void CacheFieldValueResolver(ReadableStore, com.apollographql.apollo.api.Operation$Variables, com.apollographql.apollo.cache.normalized.CacheKeyResolver, CacheHeaders)>
	//   21   45:astore_1        
			readablestore = ((ReadableStore) (new RealResponseReader(val$variables, ((Object) (record)), ((com.apollographql.apollo.internal.field.FieldValueResolver) (readablestore)), scalarTypeAdapters, ((com.apollographql.apollo.internal.response.ResolveDelegate) (ResponseNormalizer.NO_OP_NORMALIZER)))));
	//   22   46:new             #66  <Class RealResponseReader>
	//   23   49:dup             
	//   24   50:aload_0         
	//   25   51:getfield        #28  <Field com.apollographql.apollo.api.Operation$Variables val$variables>
	//   26   54:aload_2         
	//   27   55:aload_1         
	//   28   56:aload_0         
	//   29   57:getfield        #24  <Field RealApolloStore this$0>
	//   30   60:getfield        #70  <Field com.apollographql.apollo.response.ScalarTypeAdapters RealApolloStore.scalarTypeAdapters>
	//   31   63:getstatic       #76  <Field ResponseNormalizer ResponseNormalizer.NO_OP_NORMALIZER>
	//   32   66:invokespecial   #79  <Method void RealResponseReader(com.apollographql.apollo.api.Operation$Variables, Object, com.apollographql.apollo.internal.field.FieldValueResolver, com.apollographql.apollo.response.ScalarTypeAdapters, com.apollographql.apollo.internal.response.ResolveDelegate)>
	//   33   69:astore_1        
			return (GraphqlFragment)val$responseFieldMapper.map(((com.apollographql.apollo.api.ResponseReader) (readablestore)));
	//   34   70:aload_0         
	//   35   71:getfield        #30  <Field ResponseFieldMapper val$responseFieldMapper>
	//   36   74:aload_1         
	//   37   75:invokeinterface #85  <Method Object ResponseFieldMapper.map(com.apollographql.apollo.api.ResponseReader)>
	//   38   80:checkcast       #87  <Class GraphqlFragment>
	//   39   83:areturn         
		}
	}

	public volatile Object execute(Object obj)
	{
		return ((Object) (execute((ReadableStore)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #51  <Class ReadableStore>
	//    3    5:invokevirtual   #93  <Method GraphqlFragment execute(ReadableStore)>
	//    4    8:areturn         
	}

	final RealApolloStore this$0;
	final CacheKey val$cacheKey;
	final ResponseFieldMapper val$responseFieldMapper;
	final com.apollographql.apollo.api. val$variables;

	RealApolloStore$19()
	{
		this$0 = final_realapollostore;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field RealApolloStore this$0>
		val$cacheKey = cachekey;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field CacheKey val$cacheKey>
		val$variables = ;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field com.apollographql.apollo.api.Operation$Variables val$variables>
		val$responseFieldMapper = ResponseFieldMapper.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #30  <Field ResponseFieldMapper val$responseFieldMapper>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #33  <Method void Object()>
	//   14   25:return          
	}
}
