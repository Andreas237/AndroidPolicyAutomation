// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.cache.normalized;

import com.apollographql.apollo.api.*;
import com.apollographql.apollo.cache.CacheHeaders;
import com.apollographql.apollo.cache.normalized.CacheKey;
import com.apollographql.apollo.cache.normalized.CacheKeyResolver;
import com.apollographql.apollo.internal.ApolloLogger;
import com.apollographql.apollo.internal.field.CacheFieldValueResolver;
import com.apollographql.apollo.internal.response.RealResponseReader;

// Referenced classes of package com.apollographql.apollo.internal.cache.normalized:
//			Transaction, RealApolloStore, ReadableStore, ResponseNormalizer

class RealApolloStore$18
	implements Transaction
{

	public Response execute(ReadableStore readablestore)
	{
		com.apollographql.apollo.cache.normalized.Record record = readablestore.read(CacheKeyResolver.rootKeyForOperation(val$operation).key(), val$cacheHeaders);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #28  <Field Operation val$operation>
	//    3    5:invokestatic    #49  <Method CacheKey CacheKeyResolver.rootKeyForOperation(Operation)>
	//    4    8:invokevirtual   #55  <Method String CacheKey.key()>
	//    5   11:aload_0         
	//    6   12:getfield        #30  <Field CacheHeaders val$cacheHeaders>
	//    7   15:invokeinterface #61  <Method com.apollographql.apollo.cache.normalized.Record ReadableStore.read(String, CacheHeaders)>
	//    8   20:astore_2        
		if(record == null)
	//*   9   21:aload_2         
	//*  10   22:ifnonnull       40
			return Response.builder(val$operation).fromCache(true).build();
	//   11   25:aload_0         
	//   12   26:getfield        #28  <Field Operation val$operation>
	//   13   29:invokestatic    #67  <Method com.apollographql.apollo.api.Response$Builder Response.builder(Operation)>
	//   14   32:iconst_1        
	//   15   33:invokevirtual   #73  <Method com.apollographql.apollo.api.Response$Builder com.apollographql.apollo.api.Response$Builder.fromCache(boolean)>
	//   16   36:invokevirtual   #77  <Method Response com.apollographql.apollo.api.Response$Builder.build()>
	//   17   39:areturn         
		readablestore = ((ReadableStore) (new CacheFieldValueResolver(readablestore, val$operation.variables(), cacheKeyResolver(), val$cacheHeaders)));
	//   18   40:new             #79  <Class CacheFieldValueResolver>
	//   19   43:dup             
	//   20   44:aload_1         
	//   21   45:aload_0         
	//   22   46:getfield        #28  <Field Operation val$operation>
	//   23   49:invokeinterface #85  <Method com.apollographql.apollo.api.Operation$Variables Operation.variables()>
	//   24   54:aload_0         
	//   25   55:getfield        #26  <Field RealApolloStore this$0>
	//   26   58:invokevirtual   #89  <Method CacheKeyResolver RealApolloStore.cacheKeyResolver()>
	//   27   61:aload_0         
	//   28   62:getfield        #30  <Field CacheHeaders val$cacheHeaders>
	//   29   65:invokespecial   #92  <Method void CacheFieldValueResolver(ReadableStore, com.apollographql.apollo.api.Operation$Variables, CacheKeyResolver, CacheHeaders)>
	//   30   68:astore_1        
		readablestore = ((ReadableStore) (new RealResponseReader(val$operation.variables(), ((Object) (record)), ((com.apollographql.apollo.internal.field.FieldValueResolver) (readablestore)), scalarTypeAdapters, ((com.apollographql.apollo.internal.response.ResolveDelegate) (val$responseNormalizer)))));
	//   31   69:new             #94  <Class RealResponseReader>
	//   32   72:dup             
	//   33   73:aload_0         
	//   34   74:getfield        #28  <Field Operation val$operation>
	//   35   77:invokeinterface #85  <Method com.apollographql.apollo.api.Operation$Variables Operation.variables()>
	//   36   82:aload_2         
	//   37   83:aload_1         
	//   38   84:aload_0         
	//   39   85:getfield        #26  <Field RealApolloStore this$0>
	//   40   88:getfield        #98  <Field com.apollographql.apollo.response.ScalarTypeAdapters RealApolloStore.scalarTypeAdapters>
	//   41   91:aload_0         
	//   42   92:getfield        #32  <Field ResponseNormalizer val$responseNormalizer>
	//   43   95:invokespecial   #101 <Method void RealResponseReader(com.apollographql.apollo.api.Operation$Variables, Object, com.apollographql.apollo.internal.field.FieldValueResolver, com.apollographql.apollo.response.ScalarTypeAdapters, com.apollographql.apollo.internal.response.ResolveDelegate)>
	//   44   98:astore_1        
		try
		{
			val$responseNormalizer.willResolveRootQuery(val$operation);
	//   45   99:aload_0         
	//   46  100:getfield        #32  <Field ResponseNormalizer val$responseNormalizer>
	//   47  103:aload_0         
	//   48  104:getfield        #28  <Field Operation val$operation>
	//   49  107:invokevirtual   #107 <Method void ResponseNormalizer.willResolveRootQuery(Operation)>
			readablestore = ((ReadableStore) (val$operation.wrapData((com.apollographql.apollo.api.Operation.Data)val$responseFieldMapper.map(((com.apollographql.apollo.api.ResponseReader) (readablestore))))));
	//   50  110:aload_0         
	//   51  111:getfield        #28  <Field Operation val$operation>
	//   52  114:aload_0         
	//   53  115:getfield        #34  <Field ResponseFieldMapper val$responseFieldMapper>
	//   54  118:aload_1         
	//   55  119:invokeinterface #113 <Method Object ResponseFieldMapper.map(com.apollographql.apollo.api.ResponseReader)>
	//   56  124:checkcast       #115 <Class com.apollographql.apollo.api.Operation$Data>
	//   57  127:invokeinterface #119 <Method Object Operation.wrapData(com.apollographql.apollo.api.Operation$Data)>
	//   58  132:astore_1        
			readablestore = ((ReadableStore) (Response.builder(val$operation).data(((Object) (readablestore))).fromCache(true).dependentKeys(val$responseNormalizer.dependentKeys()).build()));
	//   59  133:aload_0         
	//   60  134:getfield        #28  <Field Operation val$operation>
	//   61  137:invokestatic    #67  <Method com.apollographql.apollo.api.Response$Builder Response.builder(Operation)>
	//   62  140:aload_1         
	//   63  141:invokevirtual   #123 <Method com.apollographql.apollo.api.Response$Builder com.apollographql.apollo.api.Response$Builder.data(Object)>
	//   64  144:iconst_1        
	//   65  145:invokevirtual   #73  <Method com.apollographql.apollo.api.Response$Builder com.apollographql.apollo.api.Response$Builder.fromCache(boolean)>
	//   66  148:aload_0         
	//   67  149:getfield        #32  <Field ResponseNormalizer val$responseNormalizer>
	//   68  152:invokevirtual   #127 <Method java.util.Set ResponseNormalizer.dependentKeys()>
	//   69  155:invokevirtual   #130 <Method com.apollographql.apollo.api.Response$Builder com.apollographql.apollo.api.Response$Builder.dependentKeys(java.util.Set)>
	//   70  158:invokevirtual   #77  <Method Response com.apollographql.apollo.api.Response$Builder.build()>
	//   71  161:astore_1        
		}
	//*  72  162:aload_1         
	//*  73  163:areturn         
		// Misplaced declaration of an exception variable
		catch(ReadableStore readablestore)
	//*  74  164:astore_1        
		{
			logger.e(((Throwable) (readablestore)), "Failed to read cache response", new Object[0]);
	//   75  165:aload_0         
	//   76  166:getfield        #26  <Field RealApolloStore this$0>
	//   77  169:getfield        #134 <Field ApolloLogger RealApolloStore.logger>
	//   78  172:aload_1         
	//   79  173:ldc1            #136 <String "Failed to read cache response">
	//   80  175:iconst_0        
	//   81  176:anewarray       Object[]
	//   82  179:invokevirtual   #142 <Method void ApolloLogger.e(Throwable, String, Object[])>
			return Response.builder(val$operation).fromCache(true).build();
	//   83  182:aload_0         
	//   84  183:getfield        #28  <Field Operation val$operation>
	//   85  186:invokestatic    #67  <Method com.apollographql.apollo.api.Response$Builder Response.builder(Operation)>
	//   86  189:iconst_1        
	//   87  190:invokevirtual   #73  <Method com.apollographql.apollo.api.Response$Builder com.apollographql.apollo.api.Response$Builder.fromCache(boolean)>
	//   88  193:invokevirtual   #77  <Method Response com.apollographql.apollo.api.Response$Builder.build()>
	//   89  196:areturn         
		}
		return ((Response) (readablestore));
	}

	public volatile Object execute(Object obj)
	{
		return ((Object) (execute((ReadableStore)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #57  <Class ReadableStore>
	//    3    5:invokevirtual   #148 <Method Response execute(ReadableStore)>
	//    4    8:areturn         
	}

	final RealApolloStore this$0;
	final CacheHeaders val$cacheHeaders;
	final Operation val$operation;
	final ResponseFieldMapper val$responseFieldMapper;
	final ResponseNormalizer val$responseNormalizer;

	RealApolloStore$18()
	{
		this$0 = final_realapollostore;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field RealApolloStore this$0>
		val$operation = operation1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field Operation val$operation>
		val$cacheHeaders = cacheheaders;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field CacheHeaders val$cacheHeaders>
		val$responseNormalizer = responsenormalizer;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #32  <Field ResponseNormalizer val$responseNormalizer>
		val$responseFieldMapper = ResponseFieldMapper.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #34  <Field ResponseFieldMapper val$responseFieldMapper>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #37  <Method void Object()>
	//   17   31:return          
	}
}
