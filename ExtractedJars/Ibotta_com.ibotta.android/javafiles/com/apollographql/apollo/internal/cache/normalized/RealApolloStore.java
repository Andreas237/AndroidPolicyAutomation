// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.cache.normalized;

import com.apollographql.apollo.api.*;
import com.apollographql.apollo.api.internal.Utils;
import com.apollographql.apollo.cache.CacheHeaders;
import com.apollographql.apollo.cache.normalized.*;
import com.apollographql.apollo.internal.ApolloLogger;
import com.apollographql.apollo.internal.field.CacheFieldValueResolver;
import com.apollographql.apollo.internal.response.RealResponseReader;
import com.apollographql.apollo.internal.response.RealResponseWriter;
import com.apollographql.apollo.response.ScalarTypeAdapters;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.*;

// Referenced classes of package com.apollographql.apollo.internal.cache.normalized:
//			ReadableStore, WriteableStore, Transaction, ResponseNormalizer

public final class RealApolloStore
	implements ApolloStore, ReadableStore, WriteableStore
{

	public RealApolloStore(NormalizedCache normalizedcache, CacheKeyResolver cachekeyresolver, ScalarTypeAdapters scalartypeadapters, Executor executor, ApolloLogger apollologger)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void Object()>
		Utils.checkNotNull(((Object) (normalizedcache)), "cacheStore == null");
	//    2    4:aload_1         
	//    3    5:ldc1            #87  <String "cacheStore == null">
	//    4    7:invokestatic    #93  <Method Object Utils.checkNotNull(Object, Object)>
	//    5   10:pop             
		optimisticCache = (OptimisticNormalizedCache)(new OptimisticNormalizedCache()).chain(normalizedcache);
	//    6   11:aload_0         
	//    7   12:new             #95  <Class OptimisticNormalizedCache>
	//    8   15:dup             
	//    9   16:invokespecial   #96  <Method void OptimisticNormalizedCache()>
	//   10   19:aload_1         
	//   11   20:invokevirtual   #100 <Method NormalizedCache OptimisticNormalizedCache.chain(NormalizedCache)>
	//   12   23:checkcast       #95  <Class OptimisticNormalizedCache>
	//   13   26:putfield        #102 <Field OptimisticNormalizedCache optimisticCache>
		cacheKeyResolver = (CacheKeyResolver)Utils.checkNotNull(((Object) (cachekeyresolver)), "cacheKeyResolver == null");
	//   14   29:aload_0         
	//   15   30:aload_2         
	//   16   31:ldc1            #104 <String "cacheKeyResolver == null">
	//   17   33:invokestatic    #93  <Method Object Utils.checkNotNull(Object, Object)>
	//   18   36:checkcast       #106 <Class CacheKeyResolver>
	//   19   39:putfield        #108 <Field CacheKeyResolver cacheKeyResolver>
		scalarTypeAdapters = (ScalarTypeAdapters)Utils.checkNotNull(((Object) (scalartypeadapters)), "scalarTypeAdapters == null");
	//   20   42:aload_0         
	//   21   43:aload_3         
	//   22   44:ldc1            #110 <String "scalarTypeAdapters == null">
	//   23   46:invokestatic    #93  <Method Object Utils.checkNotNull(Object, Object)>
	//   24   49:checkcast       #112 <Class ScalarTypeAdapters>
	//   25   52:putfield        #114 <Field ScalarTypeAdapters scalarTypeAdapters>
		dispatcher = (Executor)Utils.checkNotNull(((Object) (executor)), "dispatcher == null");
	//   26   55:aload_0         
	//   27   56:aload           4
	//   28   58:ldc1            #116 <String "dispatcher == null">
	//   29   60:invokestatic    #93  <Method Object Utils.checkNotNull(Object, Object)>
	//   30   63:checkcast       #118 <Class Executor>
	//   31   66:putfield        #120 <Field Executor dispatcher>
		logger = (ApolloLogger)Utils.checkNotNull(((Object) (apollologger)), "logger == null");
	//   32   69:aload_0         
	//   33   70:aload           5
	//   34   72:ldc1            #122 <String "logger == null">
	//   35   74:invokestatic    #93  <Method Object Utils.checkNotNull(Object, Object)>
	//   36   77:checkcast       #124 <Class ApolloLogger>
	//   37   80:putfield        #126 <Field ApolloLogger logger>
	//   38   83:aload_0         
	//   39   84:new             #128 <Class ReentrantReadWriteLock>
	//   40   87:dup             
	//   41   88:invokespecial   #129 <Method void ReentrantReadWriteLock()>
	//   42   91:putfield        #131 <Field ReadWriteLock lock>
	//   43   94:aload_0         
	//   44   95:new             #133 <Class WeakHashMap>
	//   45   98:dup             
	//   46   99:invokespecial   #134 <Method void WeakHashMap()>
	//   47  102:invokestatic    #140 <Method Set Collections.newSetFromMap(Map)>
	//   48  105:putfield        #142 <Field Set subscribers>
	//   49  108:return          
	}

	public CacheKeyResolver cacheKeyResolver()
	{
		return cacheKeyResolver;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field CacheKeyResolver cacheKeyResolver>
	//    2    4:areturn         
	}

	public ResponseNormalizer cacheResponseNormalizer()
	{
		return ((ResponseNormalizer) (new ResponseNormalizer() {

			public CacheKey resolveCacheKey(ResponseField responsefield, Record record)
			{
				return CacheKey.from(record.key());
			//    0    0:aload_2         
			//    1    1:invokevirtual   #29  <Method String Record.key()>
			//    2    4:invokestatic    #35  <Method CacheKey CacheKey.from(String)>
			//    3    7:areturn         
			}

			public volatile CacheKey resolveCacheKey(ResponseField responsefield, Object obj)
			{
				return resolveCacheKey(responsefield, (Record)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #25  <Class Record>
			//    4    6:invokevirtual   #40  <Method CacheKey resolveCacheKey(ResponseField, Record)>
			//    5    9:areturn         
			}

			final RealApolloStore this$0;

			
			{
				this$0 = RealApolloStore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RealApolloStore this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void ResponseNormalizer()>
			//    5    9:return          
			}
		}
));
	//    0    0:new             #40  <Class RealApolloStore$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #150 <Method void RealApolloStore$2(RealApolloStore)>
	//    4    8:areturn         
	}

	public ApolloStoreOperation clearAll()
	{
		return ((ApolloStoreOperation) (new ApolloStoreOperation(dispatcher) {

			public Boolean perform()
			{
				return (Boolean)writeTransaction(new Transaction() {

					public Boolean execute(WriteableStore writeablestore)
					{
						optimisticCache.clearAll();
					//    0    0:aload_0         
					//    1    1:getfield        #18  <Field RealApolloStore$3 this$1>
					//    2    4:getfield        #28  <Field RealApolloStore RealApolloStore$3.this$0>
					//    3    7:getfield        #34  <Field OptimisticNormalizedCache RealApolloStore.optimisticCache>
					//    4   10:invokevirtual   #39  <Method void OptimisticNormalizedCache.clearAll()>
						return Boolean.TRUE;
					//    5   13:getstatic       #45  <Field Boolean Boolean.TRUE>
					//    6   16:areturn         
					}

					public volatile Object execute(Object obj)
					{
						return ((Object) (execute((WriteableStore)obj)));
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:checkcast       #48  <Class WriteableStore>
					//    3    5:invokevirtual   #50  <Method Boolean execute(WriteableStore)>
					//    4    8:areturn         
					}

					final _cls3 this$1;

			
			{
				this$1 = _cls3.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field RealApolloStore$3 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
				}
);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field RealApolloStore this$0>
			//    2    4:new             #12  <Class RealApolloStore$3$1>
			//    3    7:dup             
			//    4    8:aload_0         
			//    5    9:invokespecial   #27  <Method void RealApolloStore$3$1(RealApolloStore$3)>
			//    6   12:invokevirtual   #31  <Method Object RealApolloStore.writeTransaction(Transaction)>
			//    7   15:checkcast       #33  <Class Boolean>
			//    8   18:areturn         
			}

			public volatile Object perform()
			{
				return ((Object) (perform()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #36  <Method Boolean perform()>
			//    2    4:areturn         
			}

			final RealApolloStore this$0;

			
			{
				this$0 = RealApolloStore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field RealApolloStore this$0>
				super(executor);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #21  <Method void ApolloStoreOperation(Executor)>
			//    6   10:return          
			}
		}
));
	//    0    0:new             #46  <Class RealApolloStore$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #120 <Field Executor dispatcher>
	//    5    9:invokespecial   #157 <Method void RealApolloStore$3(RealApolloStore, Executor)>
	//    6   12:areturn         
	}

	GraphqlFragment doRead(final ResponseFieldMapper responseFieldMapper, final CacheKey cacheKey, final com.apollographql.apollo.api.Operation.Variables variables)
	{
		return (GraphqlFragment)readTransaction(new Transaction() {

			public GraphqlFragment execute(ReadableStore readablestore)
			{
				Record record = readablestore.read(cacheKey.key(), CacheHeaders.NONE);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #26  <Field CacheKey val$cacheKey>
			//    3    5:invokevirtual   #43  <Method String CacheKey.key()>
			//    4    8:getstatic       #49  <Field CacheHeaders CacheHeaders.NONE>
			//    5   11:invokeinterface #55  <Method Record ReadableStore.read(String, CacheHeaders)>
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
					readablestore = ((ReadableStore) (new CacheFieldValueResolver(readablestore, variables, cacheKeyResolver(), CacheHeaders.NONE)));
			//   11   23:new             #57  <Class CacheFieldValueResolver>
			//   12   26:dup             
			//   13   27:aload_1         
			//   14   28:aload_0         
			//   15   29:getfield        #28  <Field com.apollographql.apollo.api.Operation$Variables val$variables>
			//   16   32:aload_0         
			//   17   33:getfield        #24  <Field RealApolloStore this$0>
			//   18   36:invokevirtual   #61  <Method CacheKeyResolver RealApolloStore.cacheKeyResolver()>
			//   19   39:getstatic       #49  <Field CacheHeaders CacheHeaders.NONE>
			//   20   42:invokespecial   #64  <Method void CacheFieldValueResolver(ReadableStore, com.apollographql.apollo.api.Operation$Variables, CacheKeyResolver, CacheHeaders)>
			//   21   45:astore_1        
					readablestore = ((ReadableStore) (new RealResponseReader(variables, ((Object) (record)), ((com.apollographql.apollo.internal.field.FieldValueResolver) (readablestore)), scalarTypeAdapters, ((com.apollographql.apollo.internal.response.ResolveDelegate) (ResponseNormalizer.NO_OP_NORMALIZER)))));
			//   22   46:new             #66  <Class RealResponseReader>
			//   23   49:dup             
			//   24   50:aload_0         
			//   25   51:getfield        #28  <Field com.apollographql.apollo.api.Operation$Variables val$variables>
			//   26   54:aload_2         
			//   27   55:aload_1         
			//   28   56:aload_0         
			//   29   57:getfield        #24  <Field RealApolloStore this$0>
			//   30   60:getfield        #70  <Field ScalarTypeAdapters RealApolloStore.scalarTypeAdapters>
			//   31   63:getstatic       #76  <Field ResponseNormalizer ResponseNormalizer.NO_OP_NORMALIZER>
			//   32   66:invokespecial   #79  <Method void RealResponseReader(com.apollographql.apollo.api.Operation$Variables, Object, com.apollographql.apollo.internal.field.FieldValueResolver, ScalarTypeAdapters, com.apollographql.apollo.internal.response.ResolveDelegate)>
			//   33   69:astore_1        
					return (GraphqlFragment)responseFieldMapper.map(((com.apollographql.apollo.api.ResponseReader) (readablestore)));
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
			final com.apollographql.apollo.api.Operation.Variables val$variables;

			
			{
				this$0 = RealApolloStore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field RealApolloStore this$0>
				cacheKey = cachekey;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field CacheKey val$cacheKey>
				variables = variables1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field com.apollographql.apollo.api.Operation$Variables val$variables>
				responseFieldMapper = responsefieldmapper;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #30  <Field ResponseFieldMapper val$responseFieldMapper>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #33  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #38  <Class RealApolloStore$19>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload_1         
	//    7    9:invokespecial   #164 <Method void RealApolloStore$19(RealApolloStore, CacheKey, com.apollographql.apollo.api.Operation$Variables, ResponseFieldMapper)>
	//    8   12:invokevirtual   #168 <Method Object readTransaction(Transaction)>
	//    9   15:checkcast       #170 <Class GraphqlFragment>
	//   10   18:areturn         
	}

	Response doRead(final Operation operation, final ResponseFieldMapper responseFieldMapper, final ResponseNormalizer responseNormalizer, final CacheHeaders cacheHeaders)
	{
		return (Response)readTransaction(new Transaction() {

			public Response execute(ReadableStore readablestore)
			{
				Record record = readablestore.read(CacheKeyResolver.rootKeyForOperation(operation).key(), cacheHeaders);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #28  <Field Operation val$operation>
			//    3    5:invokestatic    #49  <Method CacheKey CacheKeyResolver.rootKeyForOperation(Operation)>
			//    4    8:invokevirtual   #55  <Method String CacheKey.key()>
			//    5   11:aload_0         
			//    6   12:getfield        #30  <Field CacheHeaders val$cacheHeaders>
			//    7   15:invokeinterface #61  <Method Record ReadableStore.read(String, CacheHeaders)>
			//    8   20:astore_2        
				if(record == null)
			//*   9   21:aload_2         
			//*  10   22:ifnonnull       40
					return Response.builder(operation).fromCache(true).build();
			//   11   25:aload_0         
			//   12   26:getfield        #28  <Field Operation val$operation>
			//   13   29:invokestatic    #67  <Method com.apollographql.apollo.api.Response$Builder Response.builder(Operation)>
			//   14   32:iconst_1        
			//   15   33:invokevirtual   #73  <Method com.apollographql.apollo.api.Response$Builder com.apollographql.apollo.api.Response$Builder.fromCache(boolean)>
			//   16   36:invokevirtual   #77  <Method Response com.apollographql.apollo.api.Response$Builder.build()>
			//   17   39:areturn         
				readablestore = ((ReadableStore) (new CacheFieldValueResolver(readablestore, operation.variables(), cacheKeyResolver(), cacheHeaders)));
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
				readablestore = ((ReadableStore) (new RealResponseReader(operation.variables(), ((Object) (record)), ((com.apollographql.apollo.internal.field.FieldValueResolver) (readablestore)), scalarTypeAdapters, ((com.apollographql.apollo.internal.response.ResolveDelegate) (responseNormalizer)))));
			//   31   69:new             #94  <Class RealResponseReader>
			//   32   72:dup             
			//   33   73:aload_0         
			//   34   74:getfield        #28  <Field Operation val$operation>
			//   35   77:invokeinterface #85  <Method com.apollographql.apollo.api.Operation$Variables Operation.variables()>
			//   36   82:aload_2         
			//   37   83:aload_1         
			//   38   84:aload_0         
			//   39   85:getfield        #26  <Field RealApolloStore this$0>
			//   40   88:getfield        #98  <Field ScalarTypeAdapters RealApolloStore.scalarTypeAdapters>
			//   41   91:aload_0         
			//   42   92:getfield        #32  <Field ResponseNormalizer val$responseNormalizer>
			//   43   95:invokespecial   #101 <Method void RealResponseReader(com.apollographql.apollo.api.Operation$Variables, Object, com.apollographql.apollo.internal.field.FieldValueResolver, ScalarTypeAdapters, com.apollographql.apollo.internal.response.ResolveDelegate)>
			//   44   98:astore_1        
				try
				{
					responseNormalizer.willResolveRootQuery(operation);
			//   45   99:aload_0         
			//   46  100:getfield        #32  <Field ResponseNormalizer val$responseNormalizer>
			//   47  103:aload_0         
			//   48  104:getfield        #28  <Field Operation val$operation>
			//   49  107:invokevirtual   #107 <Method void ResponseNormalizer.willResolveRootQuery(Operation)>
					readablestore = ((ReadableStore) (operation.wrapData((com.apollographql.apollo.api.Operation.Data)responseFieldMapper.map(((com.apollographql.apollo.api.ResponseReader) (readablestore))))));
			//   50  110:aload_0         
			//   51  111:getfield        #28  <Field Operation val$operation>
			//   52  114:aload_0         
			//   53  115:getfield        #34  <Field ResponseFieldMapper val$responseFieldMapper>
			//   54  118:aload_1         
			//   55  119:invokeinterface #113 <Method Object ResponseFieldMapper.map(com.apollographql.apollo.api.ResponseReader)>
			//   56  124:checkcast       #115 <Class com.apollographql.apollo.api.Operation$Data>
			//   57  127:invokeinterface #119 <Method Object Operation.wrapData(com.apollographql.apollo.api.Operation$Data)>
			//   58  132:astore_1        
					readablestore = ((ReadableStore) (Response.builder(operation).data(((Object) (readablestore))).fromCache(true).dependentKeys(responseNormalizer.dependentKeys()).build()));
			//   59  133:aload_0         
			//   60  134:getfield        #28  <Field Operation val$operation>
			//   61  137:invokestatic    #67  <Method com.apollographql.apollo.api.Response$Builder Response.builder(Operation)>
			//   62  140:aload_1         
			//   63  141:invokevirtual   #123 <Method com.apollographql.apollo.api.Response$Builder com.apollographql.apollo.api.Response$Builder.data(Object)>
			//   64  144:iconst_1        
			//   65  145:invokevirtual   #73  <Method com.apollographql.apollo.api.Response$Builder com.apollographql.apollo.api.Response$Builder.fromCache(boolean)>
			//   66  148:aload_0         
			//   67  149:getfield        #32  <Field ResponseNormalizer val$responseNormalizer>
			//   68  152:invokevirtual   #127 <Method Set ResponseNormalizer.dependentKeys()>
			//   69  155:invokevirtual   #130 <Method com.apollographql.apollo.api.Response$Builder com.apollographql.apollo.api.Response$Builder.dependentKeys(Set)>
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
					return Response.builder(operation).fromCache(true).build();
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

			
			{
				this$0 = RealApolloStore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field RealApolloStore this$0>
				operation = operation1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field Operation val$operation>
				cacheHeaders = cacheheaders;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field CacheHeaders val$cacheHeaders>
				responseNormalizer = responsenormalizer;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field ResponseNormalizer val$responseNormalizer>
				responseFieldMapper = responsefieldmapper;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #34  <Field ResponseFieldMapper val$responseFieldMapper>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #37  <Method void Object()>
			//   17   31:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #36  <Class RealApolloStore$18>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload           4
	//    6    9:aload_3         
	//    7   10:aload_2         
	//    8   11:invokespecial   #175 <Method void RealApolloStore$18(RealApolloStore, Operation, CacheHeaders, ResponseNormalizer, ResponseFieldMapper)>
	//    9   14:invokevirtual   #168 <Method Object readTransaction(Transaction)>
	//   10   17:checkcast       #177 <Class Response>
	//   11   20:areturn         
	}

	Object doRead(final Operation operation)
	{
		return readTransaction(new Transaction() {

			public Object execute(ReadableStore readablestore)
			{
				Record record = readablestore.read(CacheKeyResolver.rootKeyForOperation(operation).key(), CacheHeaders.NONE);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #22  <Field Operation val$operation>
			//    3    5:invokestatic    #35  <Method CacheKey CacheKeyResolver.rootKeyForOperation(Operation)>
			//    4    8:invokevirtual   #41  <Method String CacheKey.key()>
			//    5   11:getstatic       #47  <Field CacheHeaders CacheHeaders.NONE>
			//    6   14:invokeinterface #53  <Method Record ReadableStore.read(String, CacheHeaders)>
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
					ResponseFieldMapper responsefieldmapper = operation.responseFieldMapper();
			//   12   26:aload_0         
			//   13   27:getfield        #22  <Field Operation val$operation>
			//   14   30:invokeinterface #59  <Method ResponseFieldMapper Operation.responseFieldMapper()>
			//   15   35:astore_2        
					readablestore = ((ReadableStore) (new CacheFieldValueResolver(readablestore, operation.variables(), cacheKeyResolver(), CacheHeaders.NONE)));
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
					readablestore = ((ReadableStore) (new RealResponseReader(operation.variables(), ((Object) (record)), ((com.apollographql.apollo.internal.field.FieldValueResolver) (readablestore)), scalarTypeAdapters, ((com.apollographql.apollo.internal.response.ResolveDelegate) (ResponseNormalizer.NO_OP_NORMALIZER)))));
			//   28   64:new             #74  <Class RealResponseReader>
			//   29   67:dup             
			//   30   68:aload_0         
			//   31   69:getfield        #22  <Field Operation val$operation>
			//   32   72:invokeinterface #65  <Method com.apollographql.apollo.api.Operation$Variables Operation.variables()>
			//   33   77:aload_3         
			//   34   78:aload_1         
			//   35   79:aload_0         
			//   36   80:getfield        #20  <Field RealApolloStore this$0>
			//   37   83:getfield        #78  <Field ScalarTypeAdapters RealApolloStore.scalarTypeAdapters>
			//   38   86:getstatic       #84  <Field ResponseNormalizer ResponseNormalizer.NO_OP_NORMALIZER>
			//   39   89:invokespecial   #87  <Method void RealResponseReader(com.apollographql.apollo.api.Operation$Variables, Object, com.apollographql.apollo.internal.field.FieldValueResolver, ScalarTypeAdapters, com.apollographql.apollo.internal.response.ResolveDelegate)>
			//   40   92:astore_1        
					return operation.wrapData((com.apollographql.apollo.api.Operation.Data)responsefieldmapper.map(((com.apollographql.apollo.api.ResponseReader) (readablestore))));
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

			
			{
				this$0 = RealApolloStore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field RealApolloStore this$0>
				operation = operation1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Operation val$operation>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #34  <Class RealApolloStore$17>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #182 <Method void RealApolloStore$17(RealApolloStore, Operation)>
	//    6   10:invokevirtual   #168 <Method Object readTransaction(Transaction)>
	//    7   13:areturn         
	}

	Set doWrite(final GraphqlFragment fragment, final CacheKey cacheKey, final com.apollographql.apollo.api.Operation.Variables variables)
	{
		return (Set)writeTransaction(new Transaction() {

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
				writeablestore = ((WriteableStore) (new RealResponseWriter(variables, scalarTypeAdapters)));
			//    0    0:new             #43  <Class RealResponseWriter>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:getfield        #26  <Field com.apollographql.apollo.api.Operation$Variables val$variables>
			//    4    8:aload_0         
			//    5    9:getfield        #24  <Field RealApolloStore this$0>
			//    6   12:getfield        #47  <Field ScalarTypeAdapters RealApolloStore.scalarTypeAdapters>
			//    7   15:invokespecial   #50  <Method void RealResponseWriter(com.apollographql.apollo.api.Operation$Variables, ScalarTypeAdapters)>
			//    8   18:astore_1        
				fragment.marshaller().marshal(((com.apollographql.apollo.api.ResponseWriter) (writeablestore)));
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
				responsenormalizer.willResolveRecord(cacheKey);
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
			//   28   60:invokevirtual   #80  <Method Collection ResponseNormalizer.records()>
			//   29   63:getstatic       #86  <Field CacheHeaders CacheHeaders.NONE>
			//   30   66:invokevirtual   #90  <Method Set RealApolloStore.merge(Collection, CacheHeaders)>
			//   31   69:areturn         
			}

			final RealApolloStore this$0;
			final CacheKey val$cacheKey;
			final GraphqlFragment val$fragment;
			final com.apollographql.apollo.api.Operation.Variables val$variables;

			
			{
				this$0 = RealApolloStore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field RealApolloStore this$0>
				variables = variables1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field com.apollographql.apollo.api.Operation$Variables val$variables>
				fragment = graphqlfragment;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field GraphqlFragment val$fragment>
				cacheKey = cachekey;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #30  <Field CacheKey val$cacheKey>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #33  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #44  <Class RealApolloStore$21>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokespecial   #188 <Method void RealApolloStore$21(RealApolloStore, com.apollographql.apollo.api.Operation$Variables, GraphqlFragment, CacheKey)>
	//    8   12:invokevirtual   #191 <Method Object writeTransaction(Transaction)>
	//    9   15:checkcast       #193 <Class Set>
	//   10   18:areturn         
	}

	Set doWrite(final Operation operation, final com.apollographql.apollo.api.Operation.Data operationData, final boolean optimistic, final UUID mutationId)
	{
		return (Set)writeTransaction(new Transaction() {

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
				RealResponseWriter realresponsewriter = new RealResponseWriter(operation.variables(), scalarTypeAdapters);
			//    0    0:new             #47  <Class RealResponseWriter>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:getfield        #28  <Field Operation val$operation>
			//    4    8:invokeinterface #53  <Method com.apollographql.apollo.api.Operation$Variables Operation.variables()>
			//    5   13:aload_0         
			//    6   14:getfield        #26  <Field RealApolloStore this$0>
			//    7   17:getfield        #57  <Field ScalarTypeAdapters RealApolloStore.scalarTypeAdapters>
			//    8   20:invokespecial   #60  <Method void RealResponseWriter(com.apollographql.apollo.api.Operation$Variables, ScalarTypeAdapters)>
			//    9   23:astore_2        
				operationData.marshaller().marshal(((com.apollographql.apollo.api.ResponseWriter) (realresponsewriter)));
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
				((ResponseNormalizer) (writeablestore)).willResolveRootQuery(operation);
			//   19   47:aload_1         
			//   20   48:aload_0         
			//   21   49:getfield        #28  <Field Operation val$operation>
			//   22   52:invokevirtual   #82  <Method void ResponseNormalizer.willResolveRootQuery(Operation)>
				realresponsewriter.resolveFields(((com.apollographql.apollo.internal.response.ResolveDelegate) (writeablestore)));
			//   23   55:aload_2         
			//   24   56:aload_1         
			//   25   57:invokevirtual   #86  <Method void RealResponseWriter.resolveFields(com.apollographql.apollo.internal.response.ResolveDelegate)>
				if(optimistic)
			//*  26   60:aload_0         
			//*  27   61:getfield        #32  <Field boolean val$optimistic>
			//*  28   64:ifeq            138
				{
					ArrayList arraylist = new ArrayList();
			//   29   67:new             #88  <Class ArrayList>
			//   30   70:dup             
			//   31   71:invokespecial   #89  <Method void ArrayList()>
			//   32   74:astore_2        
					for(writeablestore = ((WriteableStore) (((ResponseNormalizer) (writeablestore)).records().iterator())); ((Iterator) (writeablestore)).hasNext(); ((List) (arraylist)).add(((Object) (((Record)((Iterator) (writeablestore)).next()).toBuilder().mutationId(mutationId).build()))));
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

			
			{
				this$0 = RealApolloStore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field RealApolloStore this$0>
				operation = operation1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field Operation val$operation>
				operationData = data;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field com.apollographql.apollo.api.Operation$Data val$operationData>
				optimistic = flag;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #32  <Field boolean val$optimistic>
				mutationId = uuid;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #34  <Field UUID val$mutationId>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #37  <Method void Object()>
			//   17   31:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #42  <Class RealApolloStore$20>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:iload_3         
	//    7    9:aload           4
	//    8   11:invokespecial   #198 <Method void RealApolloStore$20(RealApolloStore, Operation, com.apollographql.apollo.api.Operation$Data, boolean, UUID)>
	//    9   14:invokevirtual   #191 <Method Object writeTransaction(Transaction)>
	//   10   17:checkcast       #193 <Class Set>
	//   11   20:areturn         
	}

	public Set merge(Record record, CacheHeaders cacheheaders)
	{
		return optimisticCache.merge((Record)Utils.checkNotNull(((Object) (record)), "record == null"), cacheheaders);
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field OptimisticNormalizedCache optimisticCache>
	//    2    4:aload_1         
	//    3    5:ldc1            #203 <String "record == null">
	//    4    7:invokestatic    #93  <Method Object Utils.checkNotNull(Object, Object)>
	//    5   10:checkcast       #205 <Class Record>
	//    6   13:aload_2         
	//    7   14:invokevirtual   #207 <Method Set OptimisticNormalizedCache.merge(Record, CacheHeaders)>
	//    8   17:areturn         
	}

	public Set merge(Collection collection, CacheHeaders cacheheaders)
	{
		return optimisticCache.merge((Collection)Utils.checkNotNull(((Object) (collection)), "recordSet == null"), cacheheaders);
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field OptimisticNormalizedCache optimisticCache>
	//    2    4:aload_1         
	//    3    5:ldc1            #211 <String "recordSet == null">
	//    4    7:invokestatic    #93  <Method Object Utils.checkNotNull(Object, Object)>
	//    5   10:checkcast       #213 <Class Collection>
	//    6   13:aload_2         
	//    7   14:invokevirtual   #215 <Method Set OptimisticNormalizedCache.merge(Collection, CacheHeaders)>
	//    8   17:areturn         
	}

	public ResponseNormalizer networkResponseNormalizer()
	{
		return ((ResponseNormalizer) (new ResponseNormalizer() {

			public volatile CacheKey resolveCacheKey(ResponseField responsefield, Object obj)
			{
				return resolveCacheKey(responsefield, (Map)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #25  <Class Map>
			//    4    6:invokevirtual   #28  <Method CacheKey resolveCacheKey(ResponseField, Map)>
			//    5    9:areturn         
			}

			public CacheKey resolveCacheKey(ResponseField responsefield, Map map)
			{
				return cacheKeyResolver.fromFieldRecordSet(responsefield, map);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field RealApolloStore this$0>
			//    2    4:getfield        #34  <Field CacheKeyResolver RealApolloStore.cacheKeyResolver>
			//    3    7:aload_1         
			//    4    8:aload_2         
			//    5    9:invokevirtual   #39  <Method CacheKey CacheKeyResolver.fromFieldRecordSet(ResponseField, Map)>
			//    6   12:areturn         
			}

			final RealApolloStore this$0;

			
			{
				this$0 = RealApolloStore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field RealApolloStore this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void ResponseNormalizer()>
			//    5    9:return          
			}
		}
));
	//    0    0:new             #12  <Class RealApolloStore$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #218 <Method void RealApolloStore$1(RealApolloStore)>
	//    4    8:areturn         
	}

	public NormalizedCache normalizedCache()
	{
		return ((NormalizedCache) (optimisticCache));
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field OptimisticNormalizedCache optimisticCache>
	//    2    4:areturn         
	}

	public void publish(Set set)
	{
		Utils.checkNotNull(((Object) (set)), "changedKeys == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #225 <String "changedKeys == null">
	//    2    3:invokestatic    #93  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		if(set.isEmpty())
	//*   4    7:aload_1         
	//*   5    8:invokeinterface #229 <Method boolean Set.isEmpty()>
	//*   6   13:ifeq            17
			return;
	//    7   16:return          
		this;
	//    8   17:aload_0         
		JVM INSTR monitorenter ;
	//    9   18:monitorenter    
		Object obj = ((Object) (new LinkedHashSet(((Collection) (subscribers)))));
	//   10   19:new             #231 <Class LinkedHashSet>
	//   11   22:dup             
	//   12   23:aload_0         
	//   13   24:getfield        #142 <Field Set subscribers>
	//   14   27:invokespecial   #234 <Method void LinkedHashSet(Collection)>
	//   15   30:astore_2        
		this;
	//   16   31:aload_0         
		JVM INSTR monitorexit ;
	//   17   32:monitorexit     
		for(obj = ((Object) (((Set) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((com.apollographql.apollo.cache.normalized.ApolloStore.RecordChangeSubscriber)((Iterator) (obj)).next()).onCacheRecordsChanged(set));
	//   18   33:aload_2         
	//   19   34:invokeinterface #238 <Method Iterator Set.iterator()>
	//   20   39:astore_2        
	//   21   40:aload_2         
	//   22   41:invokeinterface #243 <Method boolean Iterator.hasNext()>
	//   23   46:ifeq            67
	//   24   49:aload_2         
	//   25   50:invokeinterface #247 <Method Object Iterator.next()>
	//   26   55:checkcast       #249 <Class com.apollographql.apollo.cache.normalized.ApolloStore$RecordChangeSubscriber>
	//   27   58:aload_1         
	//   28   59:invokeinterface #252 <Method void com.apollographql.apollo.cache.normalized.ApolloStore$RecordChangeSubscriber.onCacheRecordsChanged(Set)>
	//*  29   64:goto            40
		return;
	//   30   67:return          
		set;
	//   31   68:astore_1        
		this;
	//   32   69:aload_0         
		JVM INSTR monitorexit ;
	//   33   70:monitorexit     
		throw set;
	//   34   71:aload_1         
	//   35   72:athrow          
	}

	public ApolloStoreOperation read(Operation operation)
	{
		Utils.checkNotNull(((Object) (operation)), "operation == null");
	//    0    0:aload_1         
	//    1    1:ldc2            #257 <String "operation == null">
	//    2    4:invokestatic    #93  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    7:pop             
		return ((ApolloStoreOperation) (new ApolloStoreOperation(operation) {

			protected Object perform()
			{
				return doRead(operation);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field RealApolloStore this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field Operation val$operation>
			//    4    8:invokevirtual   #30  <Method Object RealApolloStore.doRead(Operation)>
			//    5   11:areturn         
			}

			final RealApolloStore this$0;
			final Operation val$operation;

			
			{
				this$0 = RealApolloStore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field RealApolloStore this$0>
				operation = operation1;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #20  <Field Operation val$operation>
				super(final_executor);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #23  <Method void ApolloStoreOperation(Executor)>
			//    9   15:return          
			}
		}
));
	//    4    8:new             #58  <Class RealApolloStore$6>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #120 <Field Executor dispatcher>
	//    9   17:aload_1         
	//   10   18:invokespecial   #260 <Method void RealApolloStore$6(RealApolloStore, Executor, Operation)>
	//   11   21:areturn         
	}

	public ApolloStoreOperation read(Operation operation, ResponseFieldMapper responsefieldmapper, ResponseNormalizer responsenormalizer, CacheHeaders cacheheaders)
	{
		Utils.checkNotNull(((Object) (operation)), "operation == null");
	//    0    0:aload_1         
	//    1    1:ldc2            #257 <String "operation == null">
	//    2    4:invokestatic    #93  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    7:pop             
		Utils.checkNotNull(((Object) (responsenormalizer)), "responseNormalizer == null");
	//    4    8:aload_3         
	//    5    9:ldc2            #264 <String "responseNormalizer == null">
	//    6   12:invokestatic    #93  <Method Object Utils.checkNotNull(Object, Object)>
	//    7   15:pop             
		return ((ApolloStoreOperation) (new ApolloStoreOperation(cacheheaders) {

			protected Response perform()
			{
				return doRead(operation, responseFieldMapper, responseNormalizer, cacheHeaders);
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

			
			{
				this$0 = RealApolloStore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field RealApolloStore this$0>
				operation = operation1;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #26  <Field Operation val$operation>
				responseFieldMapper = responsefieldmapper;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #28  <Field ResponseFieldMapper val$responseFieldMapper>
				responseNormalizer = responsenormalizer;
			//    9   16:aload_0         
			//   10   17:aload           5
			//   11   19:putfield        #30  <Field ResponseNormalizer val$responseNormalizer>
				cacheHeaders = cacheheaders;
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
));
	//    8   16:new             #60  <Class RealApolloStore$7>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:getfield        #120 <Field Executor dispatcher>
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:aload_3         
	//   16   28:aload           4
	//   17   30:invokespecial   #267 <Method void RealApolloStore$7(RealApolloStore, Executor, Operation, ResponseFieldMapper, ResponseNormalizer, CacheHeaders)>
	//   18   33:areturn         
	}

	public ApolloStoreOperation read(ResponseFieldMapper responsefieldmapper, CacheKey cachekey, com.apollographql.apollo.api.Operation.Variables variables)
	{
		Utils.checkNotNull(((Object) (responsefieldmapper)), "responseFieldMapper == null");
	//    0    0:aload_1         
	//    1    1:ldc2            #271 <String "responseFieldMapper == null">
	//    2    4:invokestatic    #93  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    7:pop             
		Utils.checkNotNull(((Object) (cachekey)), "cacheKey == null");
	//    4    8:aload_2         
	//    5    9:ldc2            #273 <String "cacheKey == null">
	//    6   12:invokestatic    #93  <Method Object Utils.checkNotNull(Object, Object)>
	//    7   15:pop             
		Utils.checkNotNull(((Object) (variables)), "variables == null");
	//    8   16:aload_3         
	//    9   17:ldc2            #275 <String "variables == null">
	//   10   20:invokestatic    #93  <Method Object Utils.checkNotNull(Object, Object)>
	//   11   23:pop             
		return ((ApolloStoreOperation) (new ApolloStoreOperation(variables) {

			protected GraphqlFragment perform()
			{
				return doRead(responseFieldMapper, cacheKey, variables);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field RealApolloStore this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #24  <Field ResponseFieldMapper val$responseFieldMapper>
			//    4    8:aload_0         
			//    5    9:getfield        #26  <Field CacheKey val$cacheKey>
			//    6   12:aload_0         
			//    7   13:getfield        #28  <Field com.apollographql.apollo.api.Operation$Variables val$variables>
			//    8   16:invokevirtual   #38  <Method GraphqlFragment RealApolloStore.doRead(ResponseFieldMapper, CacheKey, com.apollographql.apollo.api.Operation$Variables)>
			//    9   19:areturn         
			}

			protected volatile Object perform()
			{
				return ((Object) (perform()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #43  <Method GraphqlFragment perform()>
			//    2    4:areturn         
			}

			final RealApolloStore this$0;
			final CacheKey val$cacheKey;
			final ResponseFieldMapper val$responseFieldMapper;
			final com.apollographql.apollo.api.Operation.Variables val$variables;

			
			{
				this$0 = RealApolloStore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field RealApolloStore this$0>
				responseFieldMapper = responsefieldmapper;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #24  <Field ResponseFieldMapper val$responseFieldMapper>
				cacheKey = cachekey;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #26  <Field CacheKey val$cacheKey>
				variables = variables1;
			//    9   16:aload_0         
			//   10   17:aload           5
			//   11   19:putfield        #28  <Field com.apollographql.apollo.api.Operation$Variables val$variables>
				super(final_executor);
			//   12   22:aload_0         
			//   13   23:aload_2         
			//   14   24:invokespecial   #31  <Method void ApolloStoreOperation(Executor)>
			//   15   27:return          
			}
		}
));
	//   12   24:new             #62  <Class RealApolloStore$8>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #120 <Field Executor dispatcher>
	//   17   33:aload_1         
	//   18   34:aload_2         
	//   19   35:aload_3         
	//   20   36:invokespecial   #278 <Method void RealApolloStore$8(RealApolloStore, Executor, ResponseFieldMapper, CacheKey, com.apollographql.apollo.api.Operation$Variables)>
	//   21   39:areturn         
	}

	public Record read(String s, CacheHeaders cacheheaders)
	{
		return optimisticCache.loadRecord((String)Utils.checkNotNull(((Object) (s)), "key == null"), cacheheaders);
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field OptimisticNormalizedCache optimisticCache>
	//    2    4:aload_1         
	//    3    5:ldc2            #283 <String "key == null">
	//    4    8:invokestatic    #93  <Method Object Utils.checkNotNull(Object, Object)>
	//    5   11:checkcast       #285 <Class String>
	//    6   14:aload_2         
	//    7   15:invokevirtual   #288 <Method Record OptimisticNormalizedCache.loadRecord(String, CacheHeaders)>
	//    8   18:areturn         
	}

	public Collection read(Collection collection, CacheHeaders cacheheaders)
	{
		return optimisticCache.loadRecords((Collection)Utils.checkNotNull(((Object) (collection)), "keys == null"), cacheheaders);
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field OptimisticNormalizedCache optimisticCache>
	//    2    4:aload_1         
	//    3    5:ldc2            #291 <String "keys == null">
	//    4    8:invokestatic    #93  <Method Object Utils.checkNotNull(Object, Object)>
	//    5   11:checkcast       #213 <Class Collection>
	//    6   14:aload_2         
	//    7   15:invokevirtual   #294 <Method Collection OptimisticNormalizedCache.loadRecords(Collection, CacheHeaders)>
	//    8   18:areturn         
	}

	public Object readTransaction(Transaction transaction)
	{
		lock.readLock().lock();
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field ReadWriteLock lock>
	//    2    4:invokeinterface #301 <Method Lock ReadWriteLock.readLock()>
	//    3    9:invokeinterface #305 <Method void Lock.lock()>
		transaction = ((Transaction) (transaction.execute(((Object) (this)))));
	//    4   14:aload_1         
	//    5   15:aload_0         
	//    6   16:invokeinterface #311 <Method Object Transaction.execute(Object)>
	//    7   21:astore_1        
		lock.readLock().unlock();
	//    8   22:aload_0         
	//    9   23:getfield        #131 <Field ReadWriteLock lock>
	//   10   26:invokeinterface #301 <Method Lock ReadWriteLock.readLock()>
	//   11   31:invokeinterface #314 <Method void Lock.unlock()>
		return ((Object) (transaction));
	//   12   36:aload_1         
	//   13   37:areturn         
		transaction;
	//   14   38:astore_1        
		lock.readLock().unlock();
	//   15   39:aload_0         
	//   16   40:getfield        #131 <Field ReadWriteLock lock>
	//   17   43:invokeinterface #301 <Method Lock ReadWriteLock.readLock()>
	//   18   48:invokeinterface #314 <Method void Lock.unlock()>
		throw transaction;
	//   19   53:aload_1         
	//   20   54:athrow          
	}

	public ApolloStoreOperation remove(CacheKey cachekey)
	{
		Utils.checkNotNull(((Object) (cachekey)), "cacheKey == null");
	//    0    0:aload_1         
	//    1    1:ldc2            #273 <String "cacheKey == null">
	//    2    4:invokestatic    #93  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    7:pop             
		return ((ApolloStoreOperation) (new ApolloStoreOperation(cachekey) {

			protected Boolean perform()
			{
				return (Boolean)writeTransaction(new Transaction() {

					public Boolean execute(WriteableStore writeablestore)
					{
						return Boolean.valueOf(optimisticCache.remove(cacheKey));
					//    0    0:aload_0         
					//    1    1:getfield        #18  <Field RealApolloStore$4 this$1>
					//    2    4:getfield        #28  <Field RealApolloStore RealApolloStore$4.this$0>
					//    3    7:getfield        #34  <Field OptimisticNormalizedCache RealApolloStore.optimisticCache>
					//    4   10:aload_0         
					//    5   11:getfield        #18  <Field RealApolloStore$4 this$1>
					//    6   14:getfield        #38  <Field CacheKey RealApolloStore$4.val$cacheKey>
					//    7   17:invokevirtual   #44  <Method boolean OptimisticNormalizedCache.remove(CacheKey)>
					//    8   20:invokestatic    #50  <Method Boolean Boolean.valueOf(boolean)>
					//    9   23:areturn         
					}

					public volatile Object execute(Object obj)
					{
						return ((Object) (execute((WriteableStore)obj)));
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:checkcast       #53  <Class WriteableStore>
					//    3    5:invokevirtual   #55  <Method Boolean execute(WriteableStore)>
					//    4    8:areturn         
					}

					final _cls4 this$1;

			
			{
				this$1 = _cls4.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field RealApolloStore$4 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
				}
);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field RealApolloStore this$0>
			//    2    4:new             #12  <Class RealApolloStore$4$1>
			//    3    7:dup             
			//    4    8:aload_0         
			//    5    9:invokespecial   #31  <Method void RealApolloStore$4$1(RealApolloStore$4)>
			//    6   12:invokevirtual   #35  <Method Object RealApolloStore.writeTransaction(Transaction)>
			//    7   15:checkcast       #37  <Class Boolean>
			//    8   18:areturn         
			}

			protected volatile Object perform()
			{
				return ((Object) (perform()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #40  <Method Boolean perform()>
			//    2    4:areturn         
			}

			final RealApolloStore this$0;
			final CacheKey val$cacheKey;

			
			{
				this$0 = RealApolloStore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field RealApolloStore this$0>
				cacheKey = cachekey;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #22  <Field CacheKey val$cacheKey>
				super(final_executor);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #25  <Method void ApolloStoreOperation(Executor)>
			//    9   15:return          
			}
		}
));
	//    4    8:new             #50  <Class RealApolloStore$4>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #120 <Field Executor dispatcher>
	//    9   17:aload_1         
	//   10   18:invokespecial   #320 <Method void RealApolloStore$4(RealApolloStore, Executor, CacheKey)>
	//   11   21:areturn         
	}

	public ApolloStoreOperation remove(List list)
	{
		Utils.checkNotNull(((Object) (list)), "cacheKey == null");
	//    0    0:aload_1         
	//    1    1:ldc2            #273 <String "cacheKey == null">
	//    2    4:invokestatic    #93  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    7:pop             
		return ((ApolloStoreOperation) (new ApolloStoreOperation(list) {

			protected Integer perform()
			{
				return (Integer)writeTransaction(new Transaction() {

					public Integer execute(WriteableStore writeablestore)
					{
						writeablestore = ((WriteableStore) (cacheKeys.iterator()));
					//    0    0:aload_0         
					//    1    1:getfield        #18  <Field RealApolloStore$5 this$1>
					//    2    4:getfield        #28  <Field List RealApolloStore$5.val$cacheKeys>
					//    3    7:invokeinterface #34  <Method Iterator List.iterator()>
					//    4   12:astore_1        
						int i = 0;
					//    5   13:iconst_0        
					//    6   14:istore_2        
						do
						{
							if(!((Iterator) (writeablestore)).hasNext())
								break;
					//    7   15:aload_1         
					//    8   16:invokeinterface #40  <Method boolean Iterator.hasNext()>
					//    9   21:ifeq            58
							CacheKey cachekey = (CacheKey)((Iterator) (writeablestore)).next();
					//   10   24:aload_1         
					//   11   25:invokeinterface #44  <Method Object Iterator.next()>
					//   12   30:checkcast       #46  <Class CacheKey>
					//   13   33:astore_3        
							if(optimisticCache.remove(cachekey))
					//*  14   34:aload_0         
					//*  15   35:getfield        #18  <Field RealApolloStore$5 this$1>
					//*  16   38:getfield        #50  <Field RealApolloStore RealApolloStore$5.this$0>
					//*  17   41:getfield        #56  <Field OptimisticNormalizedCache RealApolloStore.optimisticCache>
					//*  18   44:aload_3         
					//*  19   45:invokevirtual   #62  <Method boolean OptimisticNormalizedCache.remove(CacheKey)>
					//*  20   48:ifeq            15
								i++;
					//   21   51:iload_2         
					//   22   52:iconst_1        
					//   23   53:iadd            
					//   24   54:istore_2        
						} while(true);
					//   25   55:goto            15
						return Integer.valueOf(i);
					//   26   58:iload_2         
					//   27   59:invokestatic    #68  <Method Integer Integer.valueOf(int)>
					//   28   62:areturn         
					}

					public volatile Object execute(Object obj)
					{
						return ((Object) (execute((WriteableStore)obj)));
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:checkcast       #71  <Class WriteableStore>
					//    3    5:invokevirtual   #73  <Method Integer execute(WriteableStore)>
					//    4    8:areturn         
					}

					final _cls5 this$1;

			
			{
				this$1 = _cls5.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field RealApolloStore$5 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
				}
);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field RealApolloStore this$0>
			//    2    4:new             #12  <Class RealApolloStore$5$1>
			//    3    7:dup             
			//    4    8:aload_0         
			//    5    9:invokespecial   #31  <Method void RealApolloStore$5$1(RealApolloStore$5)>
			//    6   12:invokevirtual   #35  <Method Object RealApolloStore.writeTransaction(Transaction)>
			//    7   15:checkcast       #37  <Class Integer>
			//    8   18:areturn         
			}

			protected volatile Object perform()
			{
				return ((Object) (perform()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #40  <Method Integer perform()>
			//    2    4:areturn         
			}

			final RealApolloStore this$0;
			final List val$cacheKeys;

			
			{
				this$0 = RealApolloStore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field RealApolloStore this$0>
				cacheKeys = list;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #22  <Field List val$cacheKeys>
				super(final_executor);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #25  <Method void ApolloStoreOperation(Executor)>
			//    9   15:return          
			}
		}
));
	//    4    8:new             #54  <Class RealApolloStore$5>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #120 <Field Executor dispatcher>
	//    9   17:aload_1         
	//   10   18:invokespecial   #325 <Method void RealApolloStore$5(RealApolloStore, Executor, List)>
	//   11   21:areturn         
	}

	public ApolloStoreOperation rollbackOptimisticUpdates(UUID uuid)
	{
		return ((ApolloStoreOperation) (new ApolloStoreOperation(uuid) {

			protected volatile Object perform()
			{
				return ((Object) (perform()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #31  <Method Set perform()>
			//    2    4:areturn         
			}

			protected Set perform()
			{
				return (Set)writeTransaction(new Transaction() {

					public volatile Object execute(Object obj)
					{
						return ((Object) (execute((WriteableStore)obj)));
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:checkcast       #26  <Class WriteableStore>
					//    3    5:invokevirtual   #29  <Method Set execute(WriteableStore)>
					//    4    8:areturn         
					}

					public Set execute(WriteableStore writeablestore)
					{
						return optimisticCache.removeOptimisticUpdates(mutationId);
					//    0    0:aload_0         
					//    1    1:getfield        #18  <Field RealApolloStore$15 this$1>
					//    2    4:getfield        #33  <Field RealApolloStore RealApolloStore$15.this$0>
					//    3    7:getfield        #39  <Field OptimisticNormalizedCache RealApolloStore.optimisticCache>
					//    4   10:aload_0         
					//    5   11:getfield        #18  <Field RealApolloStore$15 this$1>
					//    6   14:getfield        #43  <Field UUID RealApolloStore$15.val$mutationId>
					//    7   17:invokevirtual   #49  <Method Set OptimisticNormalizedCache.removeOptimisticUpdates(UUID)>
					//    8   20:areturn         
					}

					final _cls15 this$1;

			
			{
				this$1 = _cls15.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field RealApolloStore$15 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
				}
);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field RealApolloStore this$0>
			//    2    4:new             #12  <Class RealApolloStore$15$1>
			//    3    7:dup             
			//    4    8:aload_0         
			//    5    9:invokespecial   #34  <Method void RealApolloStore$15$1(RealApolloStore$15)>
			//    6   12:invokevirtual   #38  <Method Object RealApolloStore.writeTransaction(Transaction)>
			//    7   15:checkcast       #40  <Class Set>
			//    8   18:areturn         
			}

			final RealApolloStore this$0;
			final UUID val$mutationId;

			
			{
				this$0 = RealApolloStore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field RealApolloStore this$0>
				mutationId = uuid;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #22  <Field UUID val$mutationId>
				super(final_executor);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #25  <Method void ApolloStoreOperation(Executor)>
			//    9   15:return          
			}
		}
));
	//    0    0:new             #26  <Class RealApolloStore$15>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #120 <Field Executor dispatcher>
	//    5    9:aload_1         
	//    6   10:invokespecial   #331 <Method void RealApolloStore$15(RealApolloStore, Executor, UUID)>
	//    7   13:areturn         
	}

	public ApolloStoreOperation rollbackOptimisticUpdatesAndPublish(UUID uuid)
	{
		return ((ApolloStoreOperation) (new ApolloStoreOperation(uuid) {

			protected Boolean perform()
			{
				Set set = (Set)writeTransaction(new Transaction() {

					public volatile Object execute(Object obj)
					{
						return ((Object) (execute((WriteableStore)obj)));
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:checkcast       #26  <Class WriteableStore>
					//    3    5:invokevirtual   #29  <Method Set execute(WriteableStore)>
					//    4    8:areturn         
					}

					public Set execute(WriteableStore writeablestore)
					{
						return optimisticCache.removeOptimisticUpdates(mutationId);
					//    0    0:aload_0         
					//    1    1:getfield        #18  <Field RealApolloStore$16 this$1>
					//    2    4:getfield        #33  <Field RealApolloStore RealApolloStore$16.this$0>
					//    3    7:getfield        #39  <Field OptimisticNormalizedCache RealApolloStore.optimisticCache>
					//    4   10:aload_0         
					//    5   11:getfield        #18  <Field RealApolloStore$16 this$1>
					//    6   14:getfield        #43  <Field UUID RealApolloStore$16.val$mutationId>
					//    7   17:invokevirtual   #49  <Method Set OptimisticNormalizedCache.removeOptimisticUpdates(UUID)>
					//    8   20:areturn         
					}

					final _cls16 this$1;

			
			{
				this$1 = _cls16.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field RealApolloStore$16 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
				}
);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field RealApolloStore this$0>
			//    2    4:new             #12  <Class RealApolloStore$16$1>
			//    3    7:dup             
			//    4    8:aload_0         
			//    5    9:invokespecial   #31  <Method void RealApolloStore$16$1(RealApolloStore$16)>
			//    6   12:invokevirtual   #35  <Method Object RealApolloStore.writeTransaction(Transaction)>
			//    7   15:checkcast       #37  <Class Set>
			//    8   18:astore_1        
				publish(set);
			//    9   19:aload_0         
			//   10   20:getfield        #20  <Field RealApolloStore this$0>
			//   11   23:aload_1         
			//   12   24:invokevirtual   #41  <Method void RealApolloStore.publish(Set)>
				return Boolean.TRUE;
			//   13   27:getstatic       #47  <Field Boolean Boolean.TRUE>
			//   14   30:areturn         
			}

			protected volatile Object perform()
			{
				return ((Object) (perform()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #50  <Method Boolean perform()>
			//    2    4:areturn         
			}

			final RealApolloStore this$0;
			final UUID val$mutationId;

			
			{
				this$0 = RealApolloStore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field RealApolloStore this$0>
				mutationId = uuid;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #22  <Field UUID val$mutationId>
				super(final_executor);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #25  <Method void ApolloStoreOperation(Executor)>
			//    9   15:return          
			}
		}
));
	//    0    0:new             #30  <Class RealApolloStore$16>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #120 <Field Executor dispatcher>
	//    5    9:aload_1         
	//    6   10:invokespecial   #334 <Method void RealApolloStore$16(RealApolloStore, Executor, UUID)>
	//    7   13:areturn         
	}

	public void subscribe(com.apollographql.apollo.cache.normalized.ApolloStore.RecordChangeSubscriber recordchangesubscriber)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		subscribers.add(((Object) (recordchangesubscriber)));
	//    2    2:aload_0         
	//    3    3:getfield        #142 <Field Set subscribers>
	//    4    6:aload_1         
	//    5    7:invokeinterface #341 <Method boolean Set.add(Object)>
	//    6   12:pop             
		this;
	//    7   13:aload_0         
		JVM INSTR monitorexit ;
	//    8   14:monitorexit     
		return;
	//    9   15:return          
		recordchangesubscriber;
	//   10   16:astore_1        
	//*  11   17:aload_0         
		throw recordchangesubscriber;
	//   12   18:monitorexit     
	//   13   19:aload_1         
	//   14   20:athrow          
	}

	public void unsubscribe(com.apollographql.apollo.cache.normalized.ApolloStore.RecordChangeSubscriber recordchangesubscriber)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		subscribers.remove(((Object) (recordchangesubscriber)));
	//    2    2:aload_0         
	//    3    3:getfield        #142 <Field Set subscribers>
	//    4    6:aload_1         
	//    5    7:invokeinterface #344 <Method boolean Set.remove(Object)>
	//    6   12:pop             
		this;
	//    7   13:aload_0         
		JVM INSTR monitorexit ;
	//    8   14:monitorexit     
		return;
	//    9   15:return          
		recordchangesubscriber;
	//   10   16:astore_1        
	//*  11   17:aload_0         
		throw recordchangesubscriber;
	//   12   18:monitorexit     
	//   13   19:aload_1         
	//   14   20:athrow          
	}

	public ApolloStoreOperation write(GraphqlFragment graphqlfragment, CacheKey cachekey, com.apollographql.apollo.api.Operation.Variables variables)
	{
		Utils.checkNotNull(((Object) (graphqlfragment)), "fragment == null");
	//    0    0:aload_1         
	//    1    1:ldc2            #348 <String "fragment == null">
	//    2    4:invokestatic    #93  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    7:pop             
		Utils.checkNotNull(((Object) (cachekey)), "cacheKey == null");
	//    4    8:aload_2         
	//    5    9:ldc2            #273 <String "cacheKey == null">
	//    6   12:invokestatic    #93  <Method Object Utils.checkNotNull(Object, Object)>
	//    7   15:pop             
		Utils.checkNotNull(((Object) (variables)), "operation == null");
	//    8   16:aload_3         
	//    9   17:ldc2            #257 <String "operation == null">
	//   10   20:invokestatic    #93  <Method Object Utils.checkNotNull(Object, Object)>
	//   11   23:pop             
		if(!cachekey.equals(((Object) (CacheKey.NO_KEY))))
	//*  12   24:aload_2         
	//*  13   25:getstatic       #354 <Field CacheKey CacheKey.NO_KEY>
	//*  14   28:invokevirtual   #357 <Method boolean CacheKey.equals(Object)>
	//*  15   31:ifne            50
			return ((ApolloStoreOperation) (new ApolloStoreOperation(variables) {

				protected volatile Object perform()
				{
					return ((Object) (perform()));
				//    0    0:aload_0         
				//    1    1:invokevirtual   #39  <Method Set perform()>
				//    2    4:areturn         
				}

				protected Set perform()
				{
					return (Set)writeTransaction(new Transaction() {

						public volatile Object execute(Object obj)
						{
							return ((Object) (execute((WriteableStore)obj)));
						//    0    0:aload_0         
						//    1    1:aload_1         
						//    2    2:checkcast       #26  <Class WriteableStore>
						//    3    5:invokevirtual   #29  <Method Set execute(WriteableStore)>
						//    4    8:areturn         
						}

						public Set execute(WriteableStore writeablestore)
						{
							return doWrite(fragment, cacheKey, variables);
						//    0    0:aload_0         
						//    1    1:getfield        #18  <Field RealApolloStore$11 this$1>
						//    2    4:getfield        #33  <Field RealApolloStore RealApolloStore$11.this$0>
						//    3    7:aload_0         
						//    4    8:getfield        #18  <Field RealApolloStore$11 this$1>
						//    5   11:getfield        #37  <Field GraphqlFragment RealApolloStore$11.val$fragment>
						//    6   14:aload_0         
						//    7   15:getfield        #18  <Field RealApolloStore$11 this$1>
						//    8   18:getfield        #41  <Field CacheKey RealApolloStore$11.val$cacheKey>
						//    9   21:aload_0         
						//   10   22:getfield        #18  <Field RealApolloStore$11 this$1>
						//   11   25:getfield        #45  <Field com.apollographql.apollo.api.Operation$Variables RealApolloStore$11.val$variables>
						//   12   28:invokevirtual   #51  <Method Set RealApolloStore.doWrite(GraphqlFragment, CacheKey, com.apollographql.apollo.api.Operation$Variables)>
						//   13   31:areturn         
						}

						final _cls11 this$1;

			
			{
				this$1 = _cls11.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field RealApolloStore$11 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
					}
);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field RealApolloStore this$0>
				//    2    4:new             #12  <Class RealApolloStore$11$1>
				//    3    7:dup             
				//    4    8:aload_0         
				//    5    9:invokespecial   #42  <Method void RealApolloStore$11$1(RealApolloStore$11)>
				//    6   12:invokevirtual   #46  <Method Object RealApolloStore.writeTransaction(Transaction)>
				//    7   15:checkcast       #48  <Class Set>
				//    8   18:areturn         
				}

				final RealApolloStore this$0;
				final CacheKey val$cacheKey;
				final GraphqlFragment val$fragment;
				final com.apollographql.apollo.api.Operation.Variables val$variables;

			
			{
				this$0 = RealApolloStore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field RealApolloStore this$0>
				fragment = graphqlfragment;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #26  <Field GraphqlFragment val$fragment>
				cacheKey = cachekey;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #28  <Field CacheKey val$cacheKey>
				variables = variables1;
			//    9   16:aload_0         
			//   10   17:aload           5
			//   11   19:putfield        #30  <Field com.apollographql.apollo.api.Operation$Variables val$variables>
				super(final_executor);
			//   12   22:aload_0         
			//   13   23:aload_2         
			//   14   24:invokespecial   #33  <Method void ApolloStoreOperation(Executor)>
			//   15   27:return          
			}
			}
));
	//   16   34:new             #16  <Class RealApolloStore$11>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:aload_0         
	//   20   40:getfield        #120 <Field Executor dispatcher>
	//   21   43:aload_1         
	//   22   44:aload_2         
	//   23   45:aload_3         
	//   24   46:invokespecial   #360 <Method void RealApolloStore$11(RealApolloStore, Executor, GraphqlFragment, CacheKey, com.apollographql.apollo.api.Operation$Variables)>
	//   25   49:areturn         
		else
			throw new IllegalArgumentException("undefined cache key");
	//   26   50:new             #362 <Class IllegalArgumentException>
	//   27   53:dup             
	//   28   54:ldc2            #364 <String "undefined cache key">
	//   29   57:invokespecial   #367 <Method void IllegalArgumentException(String)>
	//   30   60:athrow          
	}

	public ApolloStoreOperation write(Operation operation, com.apollographql.apollo.api.Operation.Data data)
	{
		Utils.checkNotNull(((Object) (operation)), "operation == null");
	//    0    0:aload_1         
	//    1    1:ldc2            #257 <String "operation == null">
	//    2    4:invokestatic    #93  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    7:pop             
		Utils.checkNotNull(((Object) (data)), "operationData == null");
	//    4    8:aload_2         
	//    5    9:ldc2            #371 <String "operationData == null">
	//    6   12:invokestatic    #93  <Method Object Utils.checkNotNull(Object, Object)>
	//    7   15:pop             
		return ((ApolloStoreOperation) (new ApolloStoreOperation(data) {

			protected volatile Object perform()
			{
				return ((Object) (perform()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #33  <Method Set perform()>
			//    2    4:areturn         
			}

			protected Set perform()
			{
				return doWrite(operation, operationData, false, ((UUID) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field RealApolloStore this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #22  <Field Operation val$operation>
			//    4    8:aload_0         
			//    5    9:getfield        #24  <Field com.apollographql.apollo.api.Operation$Data val$operationData>
			//    6   12:iconst_0        
			//    7   13:aconst_null     
			//    8   14:invokevirtual   #37  <Method Set RealApolloStore.doWrite(Operation, com.apollographql.apollo.api.Operation$Data, boolean, UUID)>
			//    9   17:areturn         
			}

			final RealApolloStore this$0;
			final Operation val$operation;
			final com.apollographql.apollo.api.Operation.Data val$operationData;

			
			{
				this$0 = RealApolloStore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field RealApolloStore this$0>
				operation = operation1;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #22  <Field Operation val$operation>
				operationData = data;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #24  <Field com.apollographql.apollo.api.Operation$Data val$operationData>
				super(final_executor);
			//    9   16:aload_0         
			//   10   17:aload_2         
			//   11   18:invokespecial   #27  <Method void ApolloStoreOperation(Executor)>
			//   12   21:return          
			}
		}
));
	//    8   16:new             #64  <Class RealApolloStore$9>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:getfield        #120 <Field Executor dispatcher>
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:invokespecial   #374 <Method void RealApolloStore$9(RealApolloStore, Executor, Operation, com.apollographql.apollo.api.Operation$Data)>
	//   16   30:areturn         
	}

	public ApolloStoreOperation writeAndPublish(GraphqlFragment graphqlfragment, CacheKey cachekey, com.apollographql.apollo.api.Operation.Variables variables)
	{
		return ((ApolloStoreOperation) (new ApolloStoreOperation(variables) {

			protected Boolean perform()
			{
				Set set = doWrite(fragment, cacheKey, variables);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field RealApolloStore this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #24  <Field GraphqlFragment val$fragment>
			//    4    8:aload_0         
			//    5    9:getfield        #26  <Field CacheKey val$cacheKey>
			//    6   12:aload_0         
			//    7   13:getfield        #28  <Field com.apollographql.apollo.api.Operation$Variables val$variables>
			//    8   16:invokevirtual   #38  <Method Set RealApolloStore.doWrite(GraphqlFragment, CacheKey, com.apollographql.apollo.api.Operation$Variables)>
			//    9   19:astore_1        
				publish(set);
			//   10   20:aload_0         
			//   11   21:getfield        #22  <Field RealApolloStore this$0>
			//   12   24:aload_1         
			//   13   25:invokevirtual   #42  <Method void RealApolloStore.publish(Set)>
				return Boolean.TRUE;
			//   14   28:getstatic       #48  <Field Boolean Boolean.TRUE>
			//   15   31:areturn         
			}

			protected volatile Object perform()
			{
				return ((Object) (perform()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #51  <Method Boolean perform()>
			//    2    4:areturn         
			}

			final RealApolloStore this$0;
			final CacheKey val$cacheKey;
			final GraphqlFragment val$fragment;
			final com.apollographql.apollo.api.Operation.Variables val$variables;

			
			{
				this$0 = RealApolloStore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field RealApolloStore this$0>
				fragment = graphqlfragment;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #24  <Field GraphqlFragment val$fragment>
				cacheKey = cachekey;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #26  <Field CacheKey val$cacheKey>
				variables = variables1;
			//    9   16:aload_0         
			//   10   17:aload           5
			//   11   19:putfield        #28  <Field com.apollographql.apollo.api.Operation$Variables val$variables>
				super(final_executor);
			//   12   22:aload_0         
			//   13   23:aload_2         
			//   14   24:invokespecial   #31  <Method void ApolloStoreOperation(Executor)>
			//   15   27:return          
			}
		}
));
	//    0    0:new             #20  <Class RealApolloStore$12>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #120 <Field Executor dispatcher>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #377 <Method void RealApolloStore$12(RealApolloStore, Executor, GraphqlFragment, CacheKey, com.apollographql.apollo.api.Operation$Variables)>
	//    9   15:areturn         
	}

	public ApolloStoreOperation writeAndPublish(Operation operation, com.apollographql.apollo.api.Operation.Data data)
	{
		return ((ApolloStoreOperation) (new ApolloStoreOperation(data) {

			protected Boolean perform()
			{
				Set set = doWrite(operation, operationData, false, ((UUID) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field RealApolloStore this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #22  <Field Operation val$operation>
			//    4    8:aload_0         
			//    5    9:getfield        #24  <Field com.apollographql.apollo.api.Operation$Data val$operationData>
			//    6   12:iconst_0        
			//    7   13:aconst_null     
			//    8   14:invokevirtual   #34  <Method Set RealApolloStore.doWrite(Operation, com.apollographql.apollo.api.Operation$Data, boolean, UUID)>
			//    9   17:astore_1        
				publish(set);
			//   10   18:aload_0         
			//   11   19:getfield        #20  <Field RealApolloStore this$0>
			//   12   22:aload_1         
			//   13   23:invokevirtual   #38  <Method void RealApolloStore.publish(Set)>
				return Boolean.TRUE;
			//   14   26:getstatic       #44  <Field Boolean Boolean.TRUE>
			//   15   29:areturn         
			}

			protected volatile Object perform()
			{
				return ((Object) (perform()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #47  <Method Boolean perform()>
			//    2    4:areturn         
			}

			final RealApolloStore this$0;
			final Operation val$operation;
			final com.apollographql.apollo.api.Operation.Data val$operationData;

			
			{
				this$0 = RealApolloStore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field RealApolloStore this$0>
				operation = operation1;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #22  <Field Operation val$operation>
				operationData = data;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #24  <Field com.apollographql.apollo.api.Operation$Data val$operationData>
				super(final_executor);
			//    9   16:aload_0         
			//   10   17:aload_2         
			//   11   18:invokespecial   #27  <Method void ApolloStoreOperation(Executor)>
			//   12   21:return          
			}
		}
));
	//    0    0:new             #14  <Class RealApolloStore$10>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #120 <Field Executor dispatcher>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #379 <Method void RealApolloStore$10(RealApolloStore, Executor, Operation, com.apollographql.apollo.api.Operation$Data)>
	//    8   14:areturn         
	}

	public ApolloStoreOperation writeOptimisticUpdates(Operation operation, com.apollographql.apollo.api.Operation.Data data, UUID uuid)
	{
		return ((ApolloStoreOperation) (new ApolloStoreOperation(uuid) {

			protected volatile Object perform()
			{
				return ((Object) (perform()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #37  <Method Set perform()>
			//    2    4:areturn         
			}

			protected Set perform()
			{
				return doWrite(operation, operationData, true, mutationId);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field RealApolloStore this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #24  <Field Operation val$operation>
			//    4    8:aload_0         
			//    5    9:getfield        #26  <Field com.apollographql.apollo.api.Operation$Data val$operationData>
			//    6   12:iconst_1        
			//    7   13:aload_0         
			//    8   14:getfield        #28  <Field UUID val$mutationId>
			//    9   17:invokevirtual   #41  <Method Set RealApolloStore.doWrite(Operation, com.apollographql.apollo.api.Operation$Data, boolean, UUID)>
			//   10   20:areturn         
			}

			final RealApolloStore this$0;
			final UUID val$mutationId;
			final Operation val$operation;
			final com.apollographql.apollo.api.Operation.Data val$operationData;

			
			{
				this$0 = RealApolloStore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field RealApolloStore this$0>
				operation = operation1;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #24  <Field Operation val$operation>
				operationData = data;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #26  <Field com.apollographql.apollo.api.Operation$Data val$operationData>
				mutationId = uuid;
			//    9   16:aload_0         
			//   10   17:aload           5
			//   11   19:putfield        #28  <Field UUID val$mutationId>
				super(final_executor);
			//   12   22:aload_0         
			//   13   23:aload_2         
			//   14   24:invokespecial   #31  <Method void ApolloStoreOperation(Executor)>
			//   15   27:return          
			}
		}
));
	//    0    0:new             #22  <Class RealApolloStore$13>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #120 <Field Executor dispatcher>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #385 <Method void RealApolloStore$13(RealApolloStore, Executor, Operation, com.apollographql.apollo.api.Operation$Data, UUID)>
	//    9   15:areturn         
	}

	public ApolloStoreOperation writeOptimisticUpdatesAndPublish(Operation operation, com.apollographql.apollo.api.Operation.Data data, UUID uuid)
	{
		return ((ApolloStoreOperation) (new ApolloStoreOperation(uuid) {

			protected Boolean perform()
			{
				Set set = doWrite(operation, operationData, true, mutationId);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field RealApolloStore this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #24  <Field Operation val$operation>
			//    4    8:aload_0         
			//    5    9:getfield        #26  <Field com.apollographql.apollo.api.Operation$Data val$operationData>
			//    6   12:iconst_1        
			//    7   13:aload_0         
			//    8   14:getfield        #28  <Field UUID val$mutationId>
			//    9   17:invokevirtual   #38  <Method Set RealApolloStore.doWrite(Operation, com.apollographql.apollo.api.Operation$Data, boolean, UUID)>
			//   10   20:astore_1        
				publish(set);
			//   11   21:aload_0         
			//   12   22:getfield        #22  <Field RealApolloStore this$0>
			//   13   25:aload_1         
			//   14   26:invokevirtual   #42  <Method void RealApolloStore.publish(Set)>
				return Boolean.TRUE;
			//   15   29:getstatic       #48  <Field Boolean Boolean.TRUE>
			//   16   32:areturn         
			}

			protected volatile Object perform()
			{
				return ((Object) (perform()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #51  <Method Boolean perform()>
			//    2    4:areturn         
			}

			final RealApolloStore this$0;
			final UUID val$mutationId;
			final Operation val$operation;
			final com.apollographql.apollo.api.Operation.Data val$operationData;

			
			{
				this$0 = RealApolloStore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field RealApolloStore this$0>
				operation = operation1;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #24  <Field Operation val$operation>
				operationData = data;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #26  <Field com.apollographql.apollo.api.Operation$Data val$operationData>
				mutationId = uuid;
			//    9   16:aload_0         
			//   10   17:aload           5
			//   11   19:putfield        #28  <Field UUID val$mutationId>
				super(final_executor);
			//   12   22:aload_0         
			//   13   23:aload_2         
			//   14   24:invokespecial   #31  <Method void ApolloStoreOperation(Executor)>
			//   15   27:return          
			}
		}
));
	//    0    0:new             #24  <Class RealApolloStore$14>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #120 <Field Executor dispatcher>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #388 <Method void RealApolloStore$14(RealApolloStore, Executor, Operation, com.apollographql.apollo.api.Operation$Data, UUID)>
	//    9   15:areturn         
	}

	public Object writeTransaction(Transaction transaction)
	{
		lock.writeLock().lock();
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field ReadWriteLock lock>
	//    2    4:invokeinterface #392 <Method Lock ReadWriteLock.writeLock()>
	//    3    9:invokeinterface #305 <Method void Lock.lock()>
		transaction = ((Transaction) (transaction.execute(((Object) (this)))));
	//    4   14:aload_1         
	//    5   15:aload_0         
	//    6   16:invokeinterface #311 <Method Object Transaction.execute(Object)>
	//    7   21:astore_1        
		lock.writeLock().unlock();
	//    8   22:aload_0         
	//    9   23:getfield        #131 <Field ReadWriteLock lock>
	//   10   26:invokeinterface #392 <Method Lock ReadWriteLock.writeLock()>
	//   11   31:invokeinterface #314 <Method void Lock.unlock()>
		return ((Object) (transaction));
	//   12   36:aload_1         
	//   13   37:areturn         
		transaction;
	//   14   38:astore_1        
		lock.writeLock().unlock();
	//   15   39:aload_0         
	//   16   40:getfield        #131 <Field ReadWriteLock lock>
	//   17   43:invokeinterface #392 <Method Lock ReadWriteLock.writeLock()>
	//   18   48:invokeinterface #314 <Method void Lock.unlock()>
		throw transaction;
	//   19   53:aload_1         
	//   20   54:athrow          
	}

	final CacheKeyResolver cacheKeyResolver;
	private final Executor dispatcher;
	private final ReadWriteLock lock = new ReentrantReadWriteLock();
	final ApolloLogger logger;
	final OptimisticNormalizedCache optimisticCache;
	final ScalarTypeAdapters scalarTypeAdapters;
	private final Set subscribers = Collections.newSetFromMap(((Map) (new WeakHashMap())));
}
