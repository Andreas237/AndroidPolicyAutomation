// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal;

import com.apollographql.apollo.*;
import com.apollographql.apollo.api.*;
import com.apollographql.apollo.api.cache.http.HttpCache;
import com.apollographql.apollo.api.internal.*;
import com.apollographql.apollo.cache.CacheHeaders;
import com.apollographql.apollo.cache.normalized.ApolloStore;
import com.apollographql.apollo.exception.*;
import com.apollographql.apollo.fetcher.ResponseFetcher;
import com.apollographql.apollo.interceptor.ApolloInterceptorChain;
import com.apollographql.apollo.internal.interceptor.ApolloCacheInterceptor;
import com.apollographql.apollo.internal.interceptor.ApolloParseInterceptor;
import com.apollographql.apollo.internal.interceptor.ApolloServerInterceptor;
import com.apollographql.apollo.internal.interceptor.RealApolloInterceptorChain;
import com.apollographql.apollo.response.ScalarTypeAdapters;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;

// Referenced classes of package com.apollographql.apollo.internal:
//			CallState, QueryReFetcher, ApolloCallTracker, ResponseFieldMapperFactory, 
//			ApolloLogger, RealApolloQueryWatcher

public final class RealApolloCall
	implements ApolloMutationCall, ApolloQueryCall
{
	public static final class Builder
	{

		public Builder apolloStore(ApolloStore apollostore)
		{
			apolloStore = apollostore;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #72  <Field ApolloStore apolloStore>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder applicationInterceptors(List list)
		{
			applicationInterceptors = list;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #77  <Field List applicationInterceptors>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public RealApolloCall build()
		{
			return new RealApolloCall(this);
		//    0    0:new             #7   <Class RealApolloCall>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #83  <Method void RealApolloCall(RealApolloCall$Builder)>
		//    4    8:areturn         
		}

		public Builder cacheHeaders(CacheHeaders cacheheaders)
		{
			cacheHeaders = cacheheaders;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #87  <Field CacheHeaders cacheHeaders>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder dispatcher(Executor executor)
		{
			dispatcher = executor;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #91  <Field Executor dispatcher>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder httpCache(HttpCache httpcache)
		{
			httpCache = httpcache;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #95  <Field HttpCache httpCache>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder httpCachePolicy(com.apollographql.apollo.api.cache.http.HttpCachePolicy.Policy policy)
		{
			httpCachePolicy = policy;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #99  <Field com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy httpCachePolicy>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder httpCallFactory(okhttp3.Call.Factory factory)
		{
			httpCallFactory = factory;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #103 <Field okhttp3.Call$Factory httpCallFactory>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder logger(ApolloLogger apollologger)
		{
			logger = apollologger;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #107 <Field ApolloLogger logger>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder operation(Operation operation1)
		{
			operation = operation1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #111 <Field Operation operation>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder optimisticUpdates(Optional optional)
		{
			optimisticUpdates = optional;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #68  <Field Optional optimisticUpdates>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder refetchQueries(List list)
		{
			if(list != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          16
				list = ((List) (new ArrayList(((java.util.Collection) (list)))));
		//    2    4:new             #116 <Class ArrayList>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokespecial   #119 <Method void ArrayList(java.util.Collection)>
		//    6   12:astore_1        
			else
		//*   7   13:goto            20
				list = Collections.emptyList();
		//    8   16:invokestatic    #56  <Method List Collections.emptyList()>
		//    9   19:astore_1        
			refetchQueries = list;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #60  <Field List refetchQueries>
			return this;
		//   13   25:aload_0         
		//   14   26:areturn         
		}

		public Builder refetchQueryNames(List list)
		{
			if(list != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          16
				list = ((List) (new ArrayList(((java.util.Collection) (list)))));
		//    2    4:new             #116 <Class ArrayList>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokespecial   #119 <Method void ArrayList(java.util.Collection)>
		//    6   12:astore_1        
			else
		//*   7   13:goto            20
				list = Collections.emptyList();
		//    8   16:invokestatic    #56  <Method List Collections.emptyList()>
		//    9   19:astore_1        
			refetchQueryNames = list;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #58  <Field List refetchQueryNames>
			return this;
		//   13   25:aload_0         
		//   14   26:areturn         
		}

		public Builder responseFetcher(ResponseFetcher responsefetcher)
		{
			responseFetcher = responsefetcher;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #124 <Field ResponseFetcher responseFetcher>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder responseFieldMapperFactory(ResponseFieldMapperFactory responsefieldmapperfactory)
		{
			responseFieldMapperFactory = responsefieldmapperfactory;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #128 <Field ResponseFieldMapperFactory responseFieldMapperFactory>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder scalarTypeAdapters(ScalarTypeAdapters scalartypeadapters)
		{
			scalarTypeAdapters = scalartypeadapters;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #132 <Field ScalarTypeAdapters scalarTypeAdapters>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder sendOperationIdentifiers(boolean flag)
		{
			sendOperationIdentifiers = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #136 <Field boolean sendOperationIdentifiers>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder serverUrl(HttpUrl httpurl)
		{
			serverUrl = httpurl;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #140 <Field HttpUrl serverUrl>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder tracker(ApolloCallTracker apollocalltracker)
		{
			tracker = apollocalltracker;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #144 <Field ApolloCallTracker tracker>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		ApolloStore apolloStore;
		List applicationInterceptors;
		CacheHeaders cacheHeaders;
		Executor dispatcher;
		HttpCache httpCache;
		com.apollographql.apollo.api.cache.http.HttpCachePolicy.Policy httpCachePolicy;
		okhttp3.Call.Factory httpCallFactory;
		ApolloLogger logger;
		Operation operation;
		Optional optimisticUpdates;
		List refetchQueries;
		List refetchQueryNames;
		ResponseFetcher responseFetcher;
		ResponseFieldMapperFactory responseFieldMapperFactory;
		ScalarTypeAdapters scalarTypeAdapters;
		boolean sendOperationIdentifiers;
		HttpUrl serverUrl;
		ApolloCallTracker tracker;

		Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #50  <Method void Object()>
			refetchQueryNames = Collections.emptyList();
		//    2    4:aload_0         
		//    3    5:invokestatic    #56  <Method List Collections.emptyList()>
		//    4    8:putfield        #58  <Field List refetchQueryNames>
			refetchQueries = Collections.emptyList();
		//    5   11:aload_0         
		//    6   12:invokestatic    #56  <Method List Collections.emptyList()>
		//    7   15:putfield        #60  <Field List refetchQueries>
			optimisticUpdates = Optional.absent();
		//    8   18:aload_0         
		//    9   19:invokestatic    #66  <Method Optional Optional.absent()>
		//   10   22:putfield        #68  <Field Optional optimisticUpdates>
		//   11   25:return          
		}
	}


	RealApolloCall(Builder builder1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void Object()>
		state = new AtomicReference(((Object) (CallState.IDLE)));
	//    2    4:aload_0         
	//    3    5:new             #74  <Class AtomicReference>
	//    4    8:dup             
	//    5    9:getstatic       #80  <Field CallState CallState.IDLE>
	//    6   12:invokespecial   #83  <Method void AtomicReference(Object)>
	//    7   15:putfield        #85  <Field AtomicReference state>
	//    8   18:aload_0         
	//    9   19:new             #74  <Class AtomicReference>
	//   10   22:dup             
	//   11   23:invokespecial   #86  <Method void AtomicReference()>
	//   12   26:putfield        #88  <Field AtomicReference originalCallback>
		operation = builder1.operation;
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:getfield        #90  <Field Operation RealApolloCall$Builder.operation>
	//   16   34:putfield        #91  <Field Operation operation>
		serverUrl = builder1.serverUrl;
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:getfield        #93  <Field HttpUrl RealApolloCall$Builder.serverUrl>
	//   20   42:putfield        #94  <Field HttpUrl serverUrl>
		httpCallFactory = builder1.httpCallFactory;
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:getfield        #96  <Field okhttp3.Call$Factory RealApolloCall$Builder.httpCallFactory>
	//   24   50:putfield        #97  <Field okhttp3.Call$Factory httpCallFactory>
		httpCache = builder1.httpCache;
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:getfield        #99  <Field HttpCache RealApolloCall$Builder.httpCache>
	//   28   58:putfield        #100 <Field HttpCache httpCache>
		httpCachePolicy = builder1.httpCachePolicy;
	//   29   61:aload_0         
	//   30   62:aload_1         
	//   31   63:getfield        #102 <Field com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy RealApolloCall$Builder.httpCachePolicy>
	//   32   66:putfield        #103 <Field com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy httpCachePolicy>
		responseFieldMapperFactory = builder1.responseFieldMapperFactory;
	//   33   69:aload_0         
	//   34   70:aload_1         
	//   35   71:getfield        #105 <Field ResponseFieldMapperFactory RealApolloCall$Builder.responseFieldMapperFactory>
	//   36   74:putfield        #106 <Field ResponseFieldMapperFactory responseFieldMapperFactory>
		scalarTypeAdapters = builder1.scalarTypeAdapters;
	//   37   77:aload_0         
	//   38   78:aload_1         
	//   39   79:getfield        #108 <Field ScalarTypeAdapters RealApolloCall$Builder.scalarTypeAdapters>
	//   40   82:putfield        #109 <Field ScalarTypeAdapters scalarTypeAdapters>
		apolloStore = builder1.apolloStore;
	//   41   85:aload_0         
	//   42   86:aload_1         
	//   43   87:getfield        #111 <Field ApolloStore RealApolloCall$Builder.apolloStore>
	//   44   90:putfield        #112 <Field ApolloStore apolloStore>
		responseFetcher = builder1.responseFetcher;
	//   45   93:aload_0         
	//   46   94:aload_1         
	//   47   95:getfield        #114 <Field ResponseFetcher RealApolloCall$Builder.responseFetcher>
	//   48   98:putfield        #115 <Field ResponseFetcher responseFetcher>
		cacheHeaders = builder1.cacheHeaders;
	//   49  101:aload_0         
	//   50  102:aload_1         
	//   51  103:getfield        #117 <Field CacheHeaders RealApolloCall$Builder.cacheHeaders>
	//   52  106:putfield        #118 <Field CacheHeaders cacheHeaders>
		dispatcher = builder1.dispatcher;
	//   53  109:aload_0         
	//   54  110:aload_1         
	//   55  111:getfield        #120 <Field Executor RealApolloCall$Builder.dispatcher>
	//   56  114:putfield        #121 <Field Executor dispatcher>
		logger = builder1.logger;
	//   57  117:aload_0         
	//   58  118:aload_1         
	//   59  119:getfield        #123 <Field ApolloLogger RealApolloCall$Builder.logger>
	//   60  122:putfield        #124 <Field ApolloLogger logger>
		applicationInterceptors = builder1.applicationInterceptors;
	//   61  125:aload_0         
	//   62  126:aload_1         
	//   63  127:getfield        #126 <Field List RealApolloCall$Builder.applicationInterceptors>
	//   64  130:putfield        #127 <Field List applicationInterceptors>
		refetchQueryNames = builder1.refetchQueryNames;
	//   65  133:aload_0         
	//   66  134:aload_1         
	//   67  135:getfield        #129 <Field List RealApolloCall$Builder.refetchQueryNames>
	//   68  138:putfield        #130 <Field List refetchQueryNames>
		refetchQueries = builder1.refetchQueries;
	//   69  141:aload_0         
	//   70  142:aload_1         
	//   71  143:getfield        #132 <Field List RealApolloCall$Builder.refetchQueries>
	//   72  146:putfield        #133 <Field List refetchQueries>
		tracker = builder1.tracker;
	//   73  149:aload_0         
	//   74  150:aload_1         
	//   75  151:getfield        #135 <Field ApolloCallTracker RealApolloCall$Builder.tracker>
	//   76  154:putfield        #136 <Field ApolloCallTracker tracker>
		if(refetchQueries.isEmpty() && refetchQueryNames.isEmpty() || builder1.apolloStore == null)
	//*  77  157:aload_0         
	//*  78  158:getfield        #133 <Field List refetchQueries>
	//*  79  161:invokeinterface #142 <Method boolean List.isEmpty()>
	//*  80  166:ifeq            181
	//*  81  169:aload_0         
	//*  82  170:getfield        #130 <Field List refetchQueryNames>
	//*  83  173:invokeinterface #142 <Method boolean List.isEmpty()>
	//*  84  178:ifne            188
	//*  85  181:aload_1         
	//*  86  182:getfield        #111 <Field ApolloStore RealApolloCall$Builder.apolloStore>
	//*  87  185:ifnonnull       198
			queryReFetcher = Optional.absent();
	//   88  188:aload_0         
	//   89  189:invokestatic    #148 <Method Optional Optional.absent()>
	//   90  192:putfield        #150 <Field Optional queryReFetcher>
		else
	//*  91  195:goto            288
			queryReFetcher = Optional.of(((Object) (QueryReFetcher.builder().queries(builder1.refetchQueries).queryWatchers(refetchQueryNames).serverUrl(builder1.serverUrl).httpCallFactory(builder1.httpCallFactory).responseFieldMapperFactory(builder1.responseFieldMapperFactory).scalarTypeAdapters(builder1.scalarTypeAdapters).apolloStore(builder1.apolloStore).dispatcher(builder1.dispatcher).logger(builder1.logger).applicationInterceptors(builder1.applicationInterceptors).callTracker(builder1.tracker).build())));
	//   92  198:aload_0         
	//   93  199:invokestatic    #156 <Method QueryReFetcher$Builder QueryReFetcher.builder()>
	//   94  202:aload_1         
	//   95  203:getfield        #132 <Field List RealApolloCall$Builder.refetchQueries>
	//   96  206:invokevirtual   #162 <Method QueryReFetcher$Builder QueryReFetcher$Builder.queries(List)>
	//   97  209:aload_0         
	//   98  210:getfield        #130 <Field List refetchQueryNames>
	//   99  213:invokevirtual   #165 <Method QueryReFetcher$Builder QueryReFetcher$Builder.queryWatchers(List)>
	//  100  216:aload_1         
	//  101  217:getfield        #93  <Field HttpUrl RealApolloCall$Builder.serverUrl>
	//  102  220:invokevirtual   #168 <Method QueryReFetcher$Builder QueryReFetcher$Builder.serverUrl(HttpUrl)>
	//  103  223:aload_1         
	//  104  224:getfield        #96  <Field okhttp3.Call$Factory RealApolloCall$Builder.httpCallFactory>
	//  105  227:invokevirtual   #171 <Method QueryReFetcher$Builder QueryReFetcher$Builder.httpCallFactory(okhttp3.Call$Factory)>
	//  106  230:aload_1         
	//  107  231:getfield        #105 <Field ResponseFieldMapperFactory RealApolloCall$Builder.responseFieldMapperFactory>
	//  108  234:invokevirtual   #174 <Method QueryReFetcher$Builder QueryReFetcher$Builder.responseFieldMapperFactory(ResponseFieldMapperFactory)>
	//  109  237:aload_1         
	//  110  238:getfield        #108 <Field ScalarTypeAdapters RealApolloCall$Builder.scalarTypeAdapters>
	//  111  241:invokevirtual   #177 <Method QueryReFetcher$Builder QueryReFetcher$Builder.scalarTypeAdapters(ScalarTypeAdapters)>
	//  112  244:aload_1         
	//  113  245:getfield        #111 <Field ApolloStore RealApolloCall$Builder.apolloStore>
	//  114  248:invokevirtual   #180 <Method QueryReFetcher$Builder QueryReFetcher$Builder.apolloStore(ApolloStore)>
	//  115  251:aload_1         
	//  116  252:getfield        #120 <Field Executor RealApolloCall$Builder.dispatcher>
	//  117  255:invokevirtual   #183 <Method QueryReFetcher$Builder QueryReFetcher$Builder.dispatcher(Executor)>
	//  118  258:aload_1         
	//  119  259:getfield        #123 <Field ApolloLogger RealApolloCall$Builder.logger>
	//  120  262:invokevirtual   #186 <Method QueryReFetcher$Builder QueryReFetcher$Builder.logger(ApolloLogger)>
	//  121  265:aload_1         
	//  122  266:getfield        #126 <Field List RealApolloCall$Builder.applicationInterceptors>
	//  123  269:invokevirtual   #188 <Method QueryReFetcher$Builder QueryReFetcher$Builder.applicationInterceptors(List)>
	//  124  272:aload_1         
	//  125  273:getfield        #135 <Field ApolloCallTracker RealApolloCall$Builder.tracker>
	//  126  276:invokevirtual   #192 <Method QueryReFetcher$Builder QueryReFetcher$Builder.callTracker(ApolloCallTracker)>
	//  127  279:invokevirtual   #196 <Method QueryReFetcher QueryReFetcher$Builder.build()>
	//  128  282:invokestatic    #200 <Method Optional Optional.of(Object)>
	//  129  285:putfield        #150 <Field Optional queryReFetcher>
		sendOperationdIdentifiers = builder1.sendOperationIdentifiers;
	//  130  288:aload_0         
	//  131  289:aload_1         
	//  132  290:getfield        #203 <Field boolean RealApolloCall$Builder.sendOperationIdentifiers>
	//  133  293:putfield        #205 <Field boolean sendOperationdIdentifiers>
		interceptorChain = prepareInterceptorChain(operation);
	//  134  296:aload_0         
	//  135  297:aload_0         
	//  136  298:aload_0         
	//  137  299:getfield        #91  <Field Operation operation>
	//  138  302:invokespecial   #209 <Method ApolloInterceptorChain prepareInterceptorChain(Operation)>
	//  139  305:putfield        #211 <Field ApolloInterceptorChain interceptorChain>
		optimisticUpdates = builder1.optimisticUpdates;
	//  140  308:aload_0         
	//  141  309:aload_1         
	//  142  310:getfield        #213 <Field Optional RealApolloCall$Builder.optimisticUpdates>
	//  143  313:putfield        #214 <Field Optional optimisticUpdates>
	//  144  316:return          
	}

	private void activate(Optional optional)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		static class _cls3
		{

			static final int $SwitchMap$com$apollographql$apollo$interceptor$ApolloInterceptor$FetchSourceType[];
			static final int $SwitchMap$com$apollographql$apollo$internal$CallState[];

			static 
			{
				$SwitchMap$com$apollographql$apollo$interceptor$ApolloInterceptor$FetchSourceType = new int[com.apollographql.apollo.interceptor.ApolloInterceptor.FetchSourceType.values().length];
			//    0    0:invokestatic    #19  <Method com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType[] com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$apollographql$apollo$interceptor$ApolloInterceptor$FetchSourceType>
				try
				{
					$SwitchMap$com$apollographql$apollo$interceptor$ApolloInterceptor$FetchSourceType[com.apollographql.apollo.interceptor.ApolloInterceptor.FetchSourceType.CACHE.ordinal()] = 1;
			//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$apollographql$apollo$interceptor$ApolloInterceptor$FetchSourceType>
			//    5   12:getstatic       #25  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType.CACHE>
			//    6   15:invokevirtual   #29  <Method int com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$apollographql$apollo$interceptor$ApolloInterceptor$FetchSourceType>
			//*  10   23:getstatic       #32  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType.NETWORK>
			//*  11   26:invokevirtual   #29  <Method int com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:invokestatic    #37  <Method CallState[] CallState.values()>
			//*  15   34:arraylength     
			//*  16   35:newarray        int[]
			//*  17   37:putstatic       #39  <Field int[] $SwitchMap$com$apollographql$apollo$internal$CallState>
			//*  18   40:getstatic       #39  <Field int[] $SwitchMap$com$apollographql$apollo$internal$CallState>
			//*  19   43:getstatic       #43  <Field CallState CallState.ACTIVE>
			//*  20   46:invokevirtual   #44  <Method int CallState.ordinal()>
			//*  21   49:iconst_1        
			//*  22   50:iastore         
			//*  23   51:getstatic       #39  <Field int[] $SwitchMap$com$apollographql$apollo$internal$CallState>
			//*  24   54:getstatic       #47  <Field CallState CallState.IDLE>
			//*  25   57:invokevirtual   #44  <Method int CallState.ordinal()>
			//*  26   60:iconst_2        
			//*  27   61:iastore         
			//*  28   62:getstatic       #39  <Field int[] $SwitchMap$com$apollographql$apollo$internal$CallState>
			//*  29   65:getstatic       #50  <Field CallState CallState.CANCELED>
			//*  30   68:invokevirtual   #44  <Method int CallState.ordinal()>
			//*  31   71:iconst_3        
			//*  32   72:iastore         
			//*  33   73:getstatic       #39  <Field int[] $SwitchMap$com$apollographql$apollo$internal$CallState>
			//*  34   76:getstatic       #53  <Field CallState CallState.TERMINATED>
			//*  35   79:invokevirtual   #44  <Method int CallState.ordinal()>
			//*  36   82:iconst_4        
			//*  37   83:iastore         
			//*  38   84:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   39   85:astore_0        
				try
				{
					$SwitchMap$com$apollographql$apollo$interceptor$ApolloInterceptor$FetchSourceType[com.apollographql.apollo.interceptor.ApolloInterceptor.FetchSourceType.NETWORK.ordinal()] = 2;
				}
			//*  40   86:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   41   89:astore_0        
				$SwitchMap$com$apollographql$apollo$internal$CallState = new int[CallState.values().length];
				try
				{
					$SwitchMap$com$apollographql$apollo$internal$CallState[CallState.ACTIVE.ordinal()] = 1;
				}
			//*  42   90:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   43   93:astore_0        
				try
				{
					$SwitchMap$com$apollographql$apollo$internal$CallState[CallState.IDLE.ordinal()] = 2;
				}
			//*  44   94:goto            51
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   45   97:astore_0        
				try
				{
					$SwitchMap$com$apollographql$apollo$internal$CallState[CallState.CANCELED.ordinal()] = 3;
				}
			//*  46   98:goto            62
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   47  101:astore_0        
				try
				{
					$SwitchMap$com$apollographql$apollo$internal$CallState[CallState.TERMINATED.ordinal()] = 4;
				}
			//*  48  102:goto            73
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   49  105:astore_0        
			//*  50  106:return          
			}
		}

		_cls3..SwitchMap.com.apollographql.apollo.internal.CallState[((CallState)state.get()).ordinal()];
	//    2    2:getstatic       #223 <Field int[] RealApolloCall$3.$SwitchMap$com$apollographql$apollo$internal$CallState>
	//    3    5:aload_0         
	//    4    6:getfield        #85  <Field AtomicReference state>
	//    5    9:invokevirtual   #227 <Method Object AtomicReference.get()>
	//    6   12:checkcast       #76  <Class CallState>
	//    7   15:invokevirtual   #231 <Method int CallState.ordinal()>
	//    8   18:iaload          
		JVM INSTR tableswitch 1 4: default 133
	//	               1 106
	//	               2 61
	//	               3 51
	//	               4 106;
	//    9   19:tableswitch     1 4: default 133
	//	               1 106
	//	               2 61
	//	               3 51
	//	               4 106
		   goto _L1 _L2 _L3 _L4 _L2
	//*  10   48:goto            117
_L4:
		throw new ApolloCanceledException("Call is cancelled.");
	//   11   51:new             #233 <Class ApolloCanceledException>
	//   12   54:dup             
	//   13   55:ldc1            #235 <String "Call is cancelled.">
	//   14   57:invokespecial   #238 <Method void ApolloCanceledException(String)>
	//   15   60:athrow          
_L3:
		originalCallback.set(optional.orNull());
	//   16   61:aload_0         
	//   17   62:getfield        #88  <Field AtomicReference originalCallback>
	//   18   65:aload_1         
	//   19   66:invokevirtual   #241 <Method Object Optional.orNull()>
	//   20   69:invokevirtual   #244 <Method void AtomicReference.set(Object)>
		tracker.registerCall(((ApolloCall) (this)));
	//   21   72:aload_0         
	//   22   73:getfield        #136 <Field ApolloCallTracker tracker>
	//   23   76:aload_0         
	//   24   77:invokevirtual   #250 <Method void ApolloCallTracker.registerCall(ApolloCall)>
		optional.apply(new Action() {

			public void apply(com.apollographql.apollo.ApolloCall.Callback callback)
			{
				callback.onStatusEvent(com.apollographql.apollo.ApolloCall.StatusEvent.SCHEDULED);
			//    0    0:aload_1         
			//    1    1:getstatic       #31  <Field com.apollographql.apollo.ApolloCall$StatusEvent com.apollographql.apollo.ApolloCall$StatusEvent.SCHEDULED>
			//    2    4:invokevirtual   #37  <Method void com.apollographql.apollo.ApolloCall$Callback.onStatusEvent(com.apollographql.apollo.ApolloCall$StatusEvent)>
			//    3    7:return          
			}

			public volatile void apply(Object obj)
			{
				apply((com.apollographql.apollo.ApolloCall.Callback)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #33  <Class com.apollographql.apollo.ApolloCall$Callback>
			//    3    5:invokevirtual   #43  <Method void apply(com.apollographql.apollo.ApolloCall$Callback)>
			//    4    8:return          
			}

			final RealApolloCall this$0;

			
			{
				this$0 = RealApolloCall.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field RealApolloCall this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   25   80:aload_1         
	//   26   81:new             #15  <Class RealApolloCall$2>
	//   27   84:dup             
	//   28   85:aload_0         
	//   29   86:invokespecial   #253 <Method void RealApolloCall$2(RealApolloCall)>
	//   30   89:invokevirtual   #257 <Method Optional Optional.apply(Action)>
	//   31   92:pop             
		state.set(((Object) (CallState.ACTIVE)));
	//   32   93:aload_0         
	//   33   94:getfield        #85  <Field AtomicReference state>
	//   34   97:getstatic       #260 <Field CallState CallState.ACTIVE>
	//   35  100:invokevirtual   #244 <Method void AtomicReference.set(Object)>
		this;
	//   36  103:aload_0         
		JVM INSTR monitorexit ;
	//   37  104:monitorexit     
		return;
	//   38  105:return          
_L2:
		throw new IllegalStateException("Already Executed");
	//   39  106:new             #262 <Class IllegalStateException>
	//   40  109:dup             
	//   41  110:ldc2            #264 <String "Already Executed">
	//   42  113:invokespecial   #265 <Method void IllegalStateException(String)>
	//   43  116:athrow          
_L1:
		throw new IllegalStateException("Unknown state");
	//   44  117:new             #262 <Class IllegalStateException>
	//   45  120:dup             
	//   46  121:ldc2            #267 <String "Unknown state">
	//   47  124:invokespecial   #265 <Method void IllegalStateException(String)>
	//   48  127:athrow          
		optional;
	//   49  128:astore_1        
		this;
	//   50  129:aload_0         
		JVM INSTR monitorexit ;
	//   51  130:monitorexit     
		throw optional;
	//   52  131:aload_1         
	//   53  132:athrow          
	//*  54  133:goto            48
	}

	public static Builder builder()
	{
		return new Builder();
	//    0    0:new             #19  <Class RealApolloCall$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #270 <Method void RealApolloCall$Builder()>
	//    3    7:areturn         
	}

	private com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack interceptorCallbackProxy()
	{
		return new com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack() {

			public void onCompleted()
			{
				Optional optional = terminate();
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field RealApolloCall this$0>
			//    2    4:invokevirtual   #28  <Method Optional RealApolloCall.terminate()>
			//    3    7:astore_1        
				if(queryReFetcher.isPresent())
			//*   4    8:aload_0         
			//*   5    9:getfield        #19  <Field RealApolloCall this$0>
			//*   6   12:getfield        #32  <Field Optional RealApolloCall.queryReFetcher>
			//*   7   15:invokevirtual   #38  <Method boolean Optional.isPresent()>
			//*   8   18:ifeq            37
					((QueryReFetcher)queryReFetcher.get()).refetch();
			//    9   21:aload_0         
			//   10   22:getfield        #19  <Field RealApolloCall this$0>
			//   11   25:getfield        #32  <Field Optional RealApolloCall.queryReFetcher>
			//   12   28:invokevirtual   #42  <Method Object Optional.get()>
			//   13   31:checkcast       #44  <Class QueryReFetcher>
			//   14   34:invokevirtual   #47  <Method void QueryReFetcher.refetch()>
				if(!optional.isPresent())
			//*  15   37:aload_1         
			//*  16   38:invokevirtual   #38  <Method boolean Optional.isPresent()>
			//*  17   41:ifne            81
				{
					logger.d("onCompleted for operation: %s. No callback present.", new Object[] {
						operation().name().name()
					});
			//   18   44:aload_0         
			//   19   45:getfield        #19  <Field RealApolloCall this$0>
			//   20   48:getfield        #51  <Field ApolloLogger RealApolloCall.logger>
			//   21   51:ldc1            #53  <String "onCompleted for operation: %s. No callback present.">
			//   22   53:iconst_1        
			//   23   54:anewarray       Object[]
			//   24   57:dup             
			//   25   58:iconst_0        
			//   26   59:aload_0         
			//   27   60:getfield        #19  <Field RealApolloCall this$0>
			//   28   63:invokevirtual   #57  <Method Operation RealApolloCall.operation()>
			//   29   66:invokeinterface #63  <Method OperationName Operation.name()>
			//   30   71:invokeinterface #68  <Method String OperationName.name()>
			//   31   76:aastore         
			//   32   77:invokevirtual   #74  <Method void ApolloLogger.d(String, Object[])>
					return;
			//   33   80:return          
				} else
				{
					((com.apollographql.apollo.ApolloCall.Callback)optional.get()).onStatusEvent(com.apollographql.apollo.ApolloCall.StatusEvent.COMPLETED);
			//   34   81:aload_1         
			//   35   82:invokevirtual   #42  <Method Object Optional.get()>
			//   36   85:checkcast       #76  <Class com.apollographql.apollo.ApolloCall$Callback>
			//   37   88:getstatic       #82  <Field com.apollographql.apollo.ApolloCall$StatusEvent com.apollographql.apollo.ApolloCall$StatusEvent.COMPLETED>
			//   38   91:invokevirtual   #86  <Method void com.apollographql.apollo.ApolloCall$Callback.onStatusEvent(com.apollographql.apollo.ApolloCall$StatusEvent)>
					return;
			//   39   94:return          
				}
			}

			public void onFailure(ApolloException apolloexception)
			{
				Optional optional = terminate();
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field RealApolloCall this$0>
			//    2    4:invokevirtual   #28  <Method Optional RealApolloCall.terminate()>
			//    3    7:astore_2        
				if(!optional.isPresent())
			//*   4    8:aload_2         
			//*   5    9:invokevirtual   #38  <Method boolean Optional.isPresent()>
			//*   6   12:ifne            53
				{
					logger.d(((Throwable) (apolloexception)), "onFailure for operation: %s. No callback present.", new Object[] {
						operation().name().name()
					});
			//    7   15:aload_0         
			//    8   16:getfield        #19  <Field RealApolloCall this$0>
			//    9   19:getfield        #51  <Field ApolloLogger RealApolloCall.logger>
			//   10   22:aload_1         
			//   11   23:ldc1            #91  <String "onFailure for operation: %s. No callback present.">
			//   12   25:iconst_1        
			//   13   26:anewarray       Object[]
			//   14   29:dup             
			//   15   30:iconst_0        
			//   16   31:aload_0         
			//   17   32:getfield        #19  <Field RealApolloCall this$0>
			//   18   35:invokevirtual   #57  <Method Operation RealApolloCall.operation()>
			//   19   38:invokeinterface #63  <Method OperationName Operation.name()>
			//   20   43:invokeinterface #68  <Method String OperationName.name()>
			//   21   48:aastore         
			//   22   49:invokevirtual   #94  <Method void ApolloLogger.d(Throwable, String, Object[])>
					return;
			//   23   52:return          
				}
				if(apolloexception instanceof ApolloHttpException)
			//*  24   53:aload_1         
			//*  25   54:instanceof      #96  <Class ApolloHttpException>
			//*  26   57:ifeq            75
				{
					((com.apollographql.apollo.ApolloCall.Callback)optional.get()).onHttpError((ApolloHttpException)apolloexception);
			//   27   60:aload_2         
			//   28   61:invokevirtual   #42  <Method Object Optional.get()>
			//   29   64:checkcast       #76  <Class com.apollographql.apollo.ApolloCall$Callback>
			//   30   67:aload_1         
			//   31   68:checkcast       #96  <Class ApolloHttpException>
			//   32   71:invokevirtual   #100 <Method void com.apollographql.apollo.ApolloCall$Callback.onHttpError(ApolloHttpException)>
					return;
			//   33   74:return          
				}
				if(apolloexception instanceof ApolloParseException)
			//*  34   75:aload_1         
			//*  35   76:instanceof      #102 <Class ApolloParseException>
			//*  36   79:ifeq            97
				{
					((com.apollographql.apollo.ApolloCall.Callback)optional.get()).onParseError((ApolloParseException)apolloexception);
			//   37   82:aload_2         
			//   38   83:invokevirtual   #42  <Method Object Optional.get()>
			//   39   86:checkcast       #76  <Class com.apollographql.apollo.ApolloCall$Callback>
			//   40   89:aload_1         
			//   41   90:checkcast       #102 <Class ApolloParseException>
			//   42   93:invokevirtual   #106 <Method void com.apollographql.apollo.ApolloCall$Callback.onParseError(ApolloParseException)>
					return;
			//   43   96:return          
				}
				if(apolloexception instanceof ApolloNetworkException)
			//*  44   97:aload_1         
			//*  45   98:instanceof      #108 <Class ApolloNetworkException>
			//*  46  101:ifeq            119
				{
					((com.apollographql.apollo.ApolloCall.Callback)optional.get()).onNetworkError((ApolloNetworkException)apolloexception);
			//   47  104:aload_2         
			//   48  105:invokevirtual   #42  <Method Object Optional.get()>
			//   49  108:checkcast       #76  <Class com.apollographql.apollo.ApolloCall$Callback>
			//   50  111:aload_1         
			//   51  112:checkcast       #108 <Class ApolloNetworkException>
			//   52  115:invokevirtual   #112 <Method void com.apollographql.apollo.ApolloCall$Callback.onNetworkError(ApolloNetworkException)>
					return;
			//   53  118:return          
				} else
				{
					((com.apollographql.apollo.ApolloCall.Callback)optional.get()).onFailure(apolloexception);
			//   54  119:aload_2         
			//   55  120:invokevirtual   #42  <Method Object Optional.get()>
			//   56  123:checkcast       #76  <Class com.apollographql.apollo.ApolloCall$Callback>
			//   57  126:aload_1         
			//   58  127:invokevirtual   #114 <Method void com.apollographql.apollo.ApolloCall$Callback.onFailure(ApolloException)>
					return;
			//   59  130:return          
				}
			}

			public void onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor.FetchSourceType fetchsourcetype)
			{
				responseCallback().apply(((_cls1) (fetchsourcetype)). new Action() {

					public void apply(com.apollographql.apollo.ApolloCall.Callback callback)
					{
						switch(_cls3..SwitchMap.com.apollographql.apollo.interceptor.ApolloInterceptor.FetchSourceType[sourceType.ordinal()])
					//*   0    0:getstatic       #35  <Field int[] RealApolloCall$3.$SwitchMap$com$apollographql$apollo$interceptor$ApolloInterceptor$FetchSourceType>
					//*   1    3:aload_0         
					//*   2    4:getfield        #22  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType val$sourceType>
					//*   3    7:invokevirtual   #41  <Method int com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType.ordinal()>
					//*   4   10:iaload          
						{
					//*   5   11:tableswitch     1 2: default 32
					//					               1 41
					//					               2 33
						default:
							return;
					//    6   32:return          

						case 2: // '\002'
							callback.onStatusEvent(com.apollographql.apollo.ApolloCall.StatusEvent.FETCH_NETWORK);
					//    7   33:aload_1         
					//    8   34:getstatic       #47  <Field com.apollographql.apollo.ApolloCall$StatusEvent com.apollographql.apollo.ApolloCall$StatusEvent.FETCH_NETWORK>
					//    9   37:invokevirtual   #53  <Method void com.apollographql.apollo.ApolloCall$Callback.onStatusEvent(com.apollographql.apollo.ApolloCall$StatusEvent)>
							return;
					//   10   40:return          

						case 1: // '\001'
							callback.onStatusEvent(com.apollographql.apollo.ApolloCall.StatusEvent.FETCH_CACHE);
					//   11   41:aload_1         
					//   12   42:getstatic       #56  <Field com.apollographql.apollo.ApolloCall$StatusEvent com.apollographql.apollo.ApolloCall$StatusEvent.FETCH_CACHE>
					//   13   45:invokevirtual   #53  <Method void com.apollographql.apollo.ApolloCall$Callback.onStatusEvent(com.apollographql.apollo.ApolloCall$StatusEvent)>
							return;
					//   14   48:return          
						}
					}

					public volatile void apply(Object obj)
					{
						apply((com.apollographql.apollo.ApolloCall.Callback)obj);
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:checkcast       #49  <Class com.apollographql.apollo.ApolloCall$Callback>
					//    3    5:invokevirtual   #62  <Method void apply(com.apollographql.apollo.ApolloCall$Callback)>
					//    4    8:return          
					}

					final _cls1 this$1;
					final com.apollographql.apollo.interceptor.ApolloInterceptor.FetchSourceType val$sourceType;

			
			{
				this$1 = final__pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field RealApolloCall$1 this$1>
				sourceType = com.apollographql.apollo.interceptor.ApolloInterceptor.FetchSourceType.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType val$sourceType>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
				}
);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field RealApolloCall this$0>
			//    2    4:invokevirtual   #120 <Method Optional RealApolloCall.responseCallback()>
			//    3    7:new             #13  <Class RealApolloCall$1$1>
			//    4   10:dup             
			//    5   11:aload_0         
			//    6   12:aload_1         
			//    7   13:invokespecial   #123 <Method void RealApolloCall$1$1(RealApolloCall$1, com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType)>
			//    8   16:invokevirtual   #127 <Method Optional Optional.apply(Action)>
			//    9   19:pop             
			//   10   20:return          
			}

			public void onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse interceptorresponse)
			{
				Optional optional = responseCallback();
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field RealApolloCall this$0>
			//    2    4:invokevirtual   #120 <Method Optional RealApolloCall.responseCallback()>
			//    3    7:astore_2        
				if(!optional.isPresent())
			//*   4    8:aload_2         
			//*   5    9:invokevirtual   #38  <Method boolean Optional.isPresent()>
			//*   6   12:ifne            52
				{
					logger.d("onResponse for operation: %s. No callback present.", new Object[] {
						operation().name().name()
					});
			//    7   15:aload_0         
			//    8   16:getfield        #19  <Field RealApolloCall this$0>
			//    9   19:getfield        #51  <Field ApolloLogger RealApolloCall.logger>
			//   10   22:ldc1            #131 <String "onResponse for operation: %s. No callback present.">
			//   11   24:iconst_1        
			//   12   25:anewarray       Object[]
			//   13   28:dup             
			//   14   29:iconst_0        
			//   15   30:aload_0         
			//   16   31:getfield        #19  <Field RealApolloCall this$0>
			//   17   34:invokevirtual   #57  <Method Operation RealApolloCall.operation()>
			//   18   37:invokeinterface #63  <Method OperationName Operation.name()>
			//   19   42:invokeinterface #68  <Method String OperationName.name()>
			//   20   47:aastore         
			//   21   48:invokevirtual   #74  <Method void ApolloLogger.d(String, Object[])>
					return;
			//   22   51:return          
				} else
				{
					((com.apollographql.apollo.ApolloCall.Callback)optional.get()).onResponse((Response)interceptorresponse.parsedResponse.get());
			//   23   52:aload_2         
			//   24   53:invokevirtual   #42  <Method Object Optional.get()>
			//   25   56:checkcast       #76  <Class com.apollographql.apollo.ApolloCall$Callback>
			//   26   59:aload_1         
			//   27   60:getfield        #136 <Field Optional com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse.parsedResponse>
			//   28   63:invokevirtual   #42  <Method Object Optional.get()>
			//   29   66:checkcast       #138 <Class Response>
			//   30   69:invokevirtual   #141 <Method void com.apollographql.apollo.ApolloCall$Callback.onResponse(Response)>
					return;
			//   31   72:return          
				}
			}

			final RealApolloCall this$0;

			
			{
				this$0 = RealApolloCall.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RealApolloCall this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #11  <Class RealApolloCall$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #274 <Method void RealApolloCall$1(RealApolloCall)>
	//    4    8:areturn         
	}

	private ApolloInterceptorChain prepareInterceptorChain(Operation operation1)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #276 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #277 <Method void ArrayList()>
	//    3    7:astore_3        
		com.apollographql.apollo.api.cache.http.HttpCachePolicy.Policy policy;
		if(operation1 instanceof Query)
	//*   4    8:aload_1         
	//*   5    9:instanceof      #279 <Class Query>
	//*   6   12:ifeq            23
			policy = httpCachePolicy;
	//    7   15:aload_0         
	//    8   16:getfield        #103 <Field com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy httpCachePolicy>
	//    9   19:astore_2        
		else
	//*  10   20:goto            25
			policy = null;
	//   11   23:aconst_null     
	//   12   24:astore_2        
		operation1 = ((Operation) (responseFieldMapperFactory.create(operation1)));
	//   13   25:aload_0         
	//   14   26:getfield        #106 <Field ResponseFieldMapperFactory responseFieldMapperFactory>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #285 <Method com.apollographql.apollo.api.ResponseFieldMapper ResponseFieldMapperFactory.create(Operation)>
	//   17   33:astore_1        
		((List) (arraylist)).addAll(((java.util.Collection) (applicationInterceptors)));
	//   18   34:aload_3         
	//   19   35:aload_0         
	//   20   36:getfield        #127 <Field List applicationInterceptors>
	//   21   39:invokeinterface #289 <Method boolean List.addAll(java.util.Collection)>
	//   22   44:pop             
		((List) (arraylist)).add(((Object) (responseFetcher.provideInterceptor(logger))));
	//   23   45:aload_3         
	//   24   46:aload_0         
	//   25   47:getfield        #115 <Field ResponseFetcher responseFetcher>
	//   26   50:aload_0         
	//   27   51:getfield        #124 <Field ApolloLogger logger>
	//   28   54:invokeinterface #295 <Method com.apollographql.apollo.interceptor.ApolloInterceptor ResponseFetcher.provideInterceptor(ApolloLogger)>
	//   29   59:invokeinterface #299 <Method boolean List.add(Object)>
	//   30   64:pop             
		((List) (arraylist)).add(((Object) (new ApolloCacheInterceptor(apolloStore, ((com.apollographql.apollo.api.ResponseFieldMapper) (operation1)), dispatcher, logger))));
	//   31   65:aload_3         
	//   32   66:new             #301 <Class ApolloCacheInterceptor>
	//   33   69:dup             
	//   34   70:aload_0         
	//   35   71:getfield        #112 <Field ApolloStore apolloStore>
	//   36   74:aload_1         
	//   37   75:aload_0         
	//   38   76:getfield        #121 <Field Executor dispatcher>
	//   39   79:aload_0         
	//   40   80:getfield        #124 <Field ApolloLogger logger>
	//   41   83:invokespecial   #304 <Method void ApolloCacheInterceptor(ApolloStore, com.apollographql.apollo.api.ResponseFieldMapper, Executor, ApolloLogger)>
	//   42   86:invokeinterface #299 <Method boolean List.add(Object)>
	//   43   91:pop             
		((List) (arraylist)).add(((Object) (new ApolloParseInterceptor(httpCache, apolloStore.networkResponseNormalizer(), ((com.apollographql.apollo.api.ResponseFieldMapper) (operation1)), scalarTypeAdapters, logger))));
	//   44   92:aload_3         
	//   45   93:new             #306 <Class ApolloParseInterceptor>
	//   46   96:dup             
	//   47   97:aload_0         
	//   48   98:getfield        #100 <Field HttpCache httpCache>
	//   49  101:aload_0         
	//   50  102:getfield        #112 <Field ApolloStore apolloStore>
	//   51  105:invokeinterface #312 <Method com.apollographql.apollo.internal.cache.normalized.ResponseNormalizer ApolloStore.networkResponseNormalizer()>
	//   52  110:aload_1         
	//   53  111:aload_0         
	//   54  112:getfield        #109 <Field ScalarTypeAdapters scalarTypeAdapters>
	//   55  115:aload_0         
	//   56  116:getfield        #124 <Field ApolloLogger logger>
	//   57  119:invokespecial   #315 <Method void ApolloParseInterceptor(HttpCache, com.apollographql.apollo.internal.cache.normalized.ResponseNormalizer, com.apollographql.apollo.api.ResponseFieldMapper, ScalarTypeAdapters, ApolloLogger)>
	//   58  122:invokeinterface #299 <Method boolean List.add(Object)>
	//   59  127:pop             
		((List) (arraylist)).add(((Object) (new ApolloServerInterceptor(serverUrl, httpCallFactory, policy, false, scalarTypeAdapters, logger, sendOperationdIdentifiers))));
	//   60  128:aload_3         
	//   61  129:new             #317 <Class ApolloServerInterceptor>
	//   62  132:dup             
	//   63  133:aload_0         
	//   64  134:getfield        #94  <Field HttpUrl serverUrl>
	//   65  137:aload_0         
	//   66  138:getfield        #97  <Field okhttp3.Call$Factory httpCallFactory>
	//   67  141:aload_2         
	//   68  142:iconst_0        
	//   69  143:aload_0         
	//   70  144:getfield        #109 <Field ScalarTypeAdapters scalarTypeAdapters>
	//   71  147:aload_0         
	//   72  148:getfield        #124 <Field ApolloLogger logger>
	//   73  151:aload_0         
	//   74  152:getfield        #205 <Field boolean sendOperationdIdentifiers>
	//   75  155:invokespecial   #320 <Method void ApolloServerInterceptor(HttpUrl, okhttp3.Call$Factory, com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy, boolean, ScalarTypeAdapters, ApolloLogger, boolean)>
	//   76  158:invokeinterface #299 <Method boolean List.add(Object)>
	//   77  163:pop             
		return ((ApolloInterceptorChain) (new RealApolloInterceptorChain(((List) (arraylist)))));
	//   78  164:new             #322 <Class RealApolloInterceptorChain>
	//   79  167:dup             
	//   80  168:aload_3         
	//   81  169:invokespecial   #325 <Method void RealApolloInterceptorChain(List)>
	//   82  172:areturn         
	}

	public volatile ApolloCall cacheHeaders(CacheHeaders cacheheaders)
	{
		return ((ApolloCall) (cacheHeaders(cacheheaders)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #330 <Method RealApolloCall cacheHeaders(CacheHeaders)>
	//    3    5:areturn         
	}

	public volatile ApolloMutationCall cacheHeaders(CacheHeaders cacheheaders)
	{
		return ((ApolloMutationCall) (cacheHeaders(cacheheaders)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #330 <Method RealApolloCall cacheHeaders(CacheHeaders)>
	//    3    5:areturn         
	}

	public volatile ApolloQueryCall cacheHeaders(CacheHeaders cacheheaders)
	{
		return ((ApolloQueryCall) (cacheHeaders(cacheheaders)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #330 <Method RealApolloCall cacheHeaders(CacheHeaders)>
	//    3    5:areturn         
	}

	public RealApolloCall cacheHeaders(CacheHeaders cacheheaders)
	{
		if(state.get() == CallState.IDLE)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field AtomicReference state>
	//*   2    4:invokevirtual   #227 <Method Object AtomicReference.get()>
	//*   3    7:getstatic       #80  <Field CallState CallState.IDLE>
	//*   4   10:if_acmpne       34
			return toBuilder().cacheHeaders((CacheHeaders)Utils.checkNotNull(((Object) (cacheheaders)), "cacheHeaders == null")).build();
	//    5   13:aload_0         
	//    6   14:invokevirtual   #337 <Method RealApolloCall$Builder toBuilder()>
	//    7   17:aload_1         
	//    8   18:ldc2            #339 <String "cacheHeaders == null">
	//    9   21:invokestatic    #345 <Method Object Utils.checkNotNull(Object, Object)>
	//   10   24:checkcast       #347 <Class CacheHeaders>
	//   11   27:invokevirtual   #350 <Method RealApolloCall$Builder RealApolloCall$Builder.cacheHeaders(CacheHeaders)>
	//   12   30:invokevirtual   #353 <Method RealApolloCall RealApolloCall$Builder.build()>
	//   13   33:areturn         
		else
			throw new IllegalStateException("Already Executed");
	//   14   34:new             #262 <Class IllegalStateException>
	//   15   37:dup             
	//   16   38:ldc2            #264 <String "Already Executed">
	//   17   41:invokespecial   #265 <Method void IllegalStateException(String)>
	//   18   44:athrow          
	}

	public void cancel()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		_cls3..SwitchMap.com.apollographql.apollo.internal.CallState[((CallState)state.get()).ordinal()];
	//    2    2:getstatic       #223 <Field int[] RealApolloCall$3.$SwitchMap$com$apollographql$apollo$internal$CallState>
	//    3    5:aload_0         
	//    4    6:getfield        #85  <Field AtomicReference state>
	//    5    9:invokevirtual   #227 <Method Object AtomicReference.get()>
	//    6   12:checkcast       #76  <Class CallState>
	//    7   15:invokevirtual   #231 <Method int CallState.ordinal()>
	//    8   18:iaload          
		JVM INSTR tableswitch 1 4: default 160
	//	               1 64
	//	               2 51
	//	               3 122
	//	               4 122;
	//    9   19:tableswitch     1 4: default 160
	//	               1 64
	//	               2 51
	//	               3 122
	//	               4 122
		   goto _L1 _L2 _L3 _L4 _L4
	//*  10   48:goto            144
_L3:
		state.set(((Object) (CallState.CANCELED)));
	//   11   51:aload_0         
	//   12   52:getfield        #85  <Field AtomicReference state>
	//   13   55:getstatic       #358 <Field CallState CallState.CANCELED>
	//   14   58:invokevirtual   #244 <Method void AtomicReference.set(Object)>
		  goto _L4
	//*  15   61:goto            122
_L2:
		state.set(((Object) (CallState.CANCELED)));
	//   16   64:aload_0         
	//   17   65:getfield        #85  <Field AtomicReference state>
	//   18   68:getstatic       #358 <Field CallState CallState.CANCELED>
	//   19   71:invokevirtual   #244 <Method void AtomicReference.set(Object)>
		interceptorChain.dispose();
	//   20   74:aload_0         
	//   21   75:getfield        #211 <Field ApolloInterceptorChain interceptorChain>
	//   22   78:invokeinterface #363 <Method void ApolloInterceptorChain.dispose()>
		if(queryReFetcher.isPresent())
	//*  23   83:aload_0         
	//*  24   84:getfield        #150 <Field Optional queryReFetcher>
	//*  25   87:invokevirtual   #366 <Method boolean Optional.isPresent()>
	//*  26   90:ifeq            106
			((QueryReFetcher)queryReFetcher.get()).cancel();
	//   27   93:aload_0         
	//   28   94:getfield        #150 <Field Optional queryReFetcher>
	//   29   97:invokevirtual   #367 <Method Object Optional.get()>
	//   30  100:checkcast       #152 <Class QueryReFetcher>
	//   31  103:invokevirtual   #369 <Method void QueryReFetcher.cancel()>
		tracker.unregisterCall(((ApolloCall) (this)));
	//   32  106:aload_0         
	//   33  107:getfield        #136 <Field ApolloCallTracker tracker>
	//   34  110:aload_0         
	//   35  111:invokevirtual   #372 <Method void ApolloCallTracker.unregisterCall(ApolloCall)>
		originalCallback.set(((Object) (null)));
	//   36  114:aload_0         
	//   37  115:getfield        #88  <Field AtomicReference originalCallback>
	//   38  118:aconst_null     
	//   39  119:invokevirtual   #244 <Method void AtomicReference.set(Object)>
_L4:
		this;
	//   40  122:aload_0         
		JVM INSTR monitorexit ;
	//   41  123:monitorexit     
		return;
	//   42  124:return          
		Exception exception;
		exception;
	//   43  125:astore_1        
		tracker.unregisterCall(((ApolloCall) (this)));
	//   44  126:aload_0         
	//   45  127:getfield        #136 <Field ApolloCallTracker tracker>
	//   46  130:aload_0         
	//   47  131:invokevirtual   #372 <Method void ApolloCallTracker.unregisterCall(ApolloCall)>
		originalCallback.set(((Object) (null)));
	//   48  134:aload_0         
	//   49  135:getfield        #88  <Field AtomicReference originalCallback>
	//   50  138:aconst_null     
	//   51  139:invokevirtual   #244 <Method void AtomicReference.set(Object)>
		throw exception;
	//   52  142:aload_1         
	//   53  143:athrow          
_L1:
		throw new IllegalStateException("Unknown state");
	//   54  144:new             #262 <Class IllegalStateException>
	//   55  147:dup             
	//   56  148:ldc2            #267 <String "Unknown state">
	//   57  151:invokespecial   #265 <Method void IllegalStateException(String)>
	//   58  154:athrow          
		exception;
	//   59  155:astore_1        
		this;
	//   60  156:aload_0         
		JVM INSTR monitorexit ;
	//   61  157:monitorexit     
		throw exception;
	//   62  158:aload_1         
	//   63  159:athrow          
	//*  64  160:goto            48
	}

	public volatile ApolloCall clone()
	{
		return ((ApolloCall) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #376 <Method RealApolloCall clone()>
	//    2    4:areturn         
	}

	public volatile ApolloMutationCall clone()
	{
		return ((ApolloMutationCall) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #376 <Method RealApolloCall clone()>
	//    2    4:areturn         
	}

	public volatile ApolloQueryCall clone()
	{
		return ((ApolloQueryCall) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #376 <Method RealApolloCall clone()>
	//    2    4:areturn         
	}

	public RealApolloCall clone()
	{
		return toBuilder().build();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #337 <Method RealApolloCall$Builder toBuilder()>
	//    2    4:invokevirtual   #353 <Method RealApolloCall RealApolloCall$Builder.build()>
	//    3    7:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #376 <Method RealApolloCall clone()>
	//    2    4:areturn         
	}

	public void enqueue(com.apollographql.apollo.ApolloCall.Callback callback)
	{
		try
		{
			activate(Optional.fromNullable(((Object) (callback))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #388 <Method Optional Optional.fromNullable(Object)>
	//    3    5:invokespecial   #390 <Method void activate(Optional)>
		}
	//*   4    8:aload_0         
	//*   5    9:getfield        #91  <Field Operation operation>
	//*   6   12:invokestatic    #395 <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.builder(Operation)>
	//*   7   15:aload_0         
	//*   8   16:getfield        #118 <Field CacheHeaders cacheHeaders>
	//*   9   19:invokevirtual   #400 <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder.cacheHeaders(CacheHeaders)>
	//*  10   22:iconst_0        
	//*  11   23:invokevirtual   #404 <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder.fetchFromCache(boolean)>
	//*  12   26:aload_0         
	//*  13   27:getfield        #214 <Field Optional optimisticUpdates>
	//*  14   30:invokevirtual   #407 <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder.optimisticUpdates(Optional)>
	//*  15   33:invokevirtual   #410 <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder.build()>
	//*  16   36:astore_1        
	//*  17   37:aload_0         
	//*  18   38:getfield        #211 <Field ApolloInterceptorChain interceptorChain>
	//*  19   41:aload_1         
	//*  20   42:aload_0         
	//*  21   43:getfield        #121 <Field Executor dispatcher>
	//*  22   46:aload_0         
	//*  23   47:invokespecial   #412 <Method com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack interceptorCallbackProxy()>
	//*  24   50:invokeinterface #416 <Method void ApolloInterceptorChain.proceedAsync(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest, Executor, com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack)>
	//*  25   55:return          
		catch(ApolloCanceledException apollocanceledexception)
	//*  26   56:astore_2        
		{
			if(callback != null)
	//*  27   57:aload_1         
	//*  28   58:ifnull          67
			{
				callback.onCanceledError(apollocanceledexception);
	//   29   61:aload_1         
	//   30   62:aload_2         
	//   31   63:invokevirtual   #422 <Method void com.apollographql.apollo.ApolloCall$Callback.onCanceledError(ApolloCanceledException)>
				return;
	//   32   66:return          
			} else
			{
				logger.e(((Throwable) (apollocanceledexception)), "Operation: %s was canceled", new Object[] {
					operation().name().name()
				});
	//   33   67:aload_0         
	//   34   68:getfield        #124 <Field ApolloLogger logger>
	//   35   71:aload_2         
	//   36   72:ldc2            #424 <String "Operation: %s was canceled">
	//   37   75:iconst_1        
	//   38   76:anewarray       Object[]
	//   39   79:dup             
	//   40   80:iconst_0        
	//   41   81:aload_0         
	//   42   82:invokevirtual   #427 <Method Operation operation()>
	//   43   85:invokeinterface #433 <Method OperationName Operation.name()>
	//   44   90:invokeinterface #438 <Method String OperationName.name()>
	//   45   95:aastore         
	//   46   96:invokevirtual   #444 <Method void ApolloLogger.e(Throwable, String, Object[])>
				return;
	//   47   99:return          
			}
		}
		callback = ((com.apollographql.apollo.ApolloCall.Callback) (com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest.builder(operation).cacheHeaders(cacheHeaders).fetchFromCache(false).optimisticUpdates(optimisticUpdates).build()));
		interceptorChain.proceedAsync(((com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest) (callback)), dispatcher, interceptorCallbackProxy());
	}

	public volatile ApolloQueryCall httpCachePolicy(com.apollographql.apollo.api.cache.http.HttpCachePolicy.Policy policy)
	{
		return ((ApolloQueryCall) (httpCachePolicy(policy)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #449 <Method RealApolloCall httpCachePolicy(com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy)>
	//    3    5:areturn         
	}

	public RealApolloCall httpCachePolicy(com.apollographql.apollo.api.cache.http.HttpCachePolicy.Policy policy)
	{
		if(state.get() == CallState.IDLE)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field AtomicReference state>
	//*   2    4:invokevirtual   #227 <Method Object AtomicReference.get()>
	//*   3    7:getstatic       #80  <Field CallState CallState.IDLE>
	//*   4   10:if_acmpne       34
			return toBuilder().httpCachePolicy((com.apollographql.apollo.api.cache.http.HttpCachePolicy.Policy)Utils.checkNotNull(((Object) (policy)), "httpCachePolicy == null")).build();
	//    5   13:aload_0         
	//    6   14:invokevirtual   #337 <Method RealApolloCall$Builder toBuilder()>
	//    7   17:aload_1         
	//    8   18:ldc2            #451 <String "httpCachePolicy == null">
	//    9   21:invokestatic    #345 <Method Object Utils.checkNotNull(Object, Object)>
	//   10   24:checkcast       #453 <Class com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy>
	//   11   27:invokevirtual   #456 <Method RealApolloCall$Builder RealApolloCall$Builder.httpCachePolicy(com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy)>
	//   12   30:invokevirtual   #353 <Method RealApolloCall RealApolloCall$Builder.build()>
	//   13   33:areturn         
		else
			throw new IllegalStateException("Already Executed");
	//   14   34:new             #262 <Class IllegalStateException>
	//   15   37:dup             
	//   16   38:ldc2            #264 <String "Already Executed">
	//   17   41:invokespecial   #265 <Method void IllegalStateException(String)>
	//   18   44:athrow          
	}

	public boolean isCanceled()
	{
		return state.get() == CallState.CANCELED;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field AtomicReference state>
	//    2    4:invokevirtual   #227 <Method Object AtomicReference.get()>
	//    3    7:getstatic       #358 <Field CallState CallState.CANCELED>
	//    4   10:if_acmpne       15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public Operation operation()
	{
		return operation;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field Operation operation>
	//    2    4:areturn         
	}

	public transient ApolloMutationCall refetchQueries(OperationName aoperationname[])
	{
		if(state.get() == CallState.IDLE)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field AtomicReference state>
	//*   2    4:invokevirtual   #227 <Method Object AtomicReference.get()>
	//*   3    7:getstatic       #80  <Field CallState CallState.IDLE>
	//*   4   10:if_acmpne       37
			return ((ApolloMutationCall) (toBuilder().refetchQueryNames(Arrays.asList((Object[])Utils.checkNotNull(((Object) (aoperationname)), "operationNames == null"))).build()));
	//    5   13:aload_0         
	//    6   14:invokevirtual   #337 <Method RealApolloCall$Builder toBuilder()>
	//    7   17:aload_1         
	//    8   18:ldc2            #461 <String "operationNames == null">
	//    9   21:invokestatic    #345 <Method Object Utils.checkNotNull(Object, Object)>
	//   10   24:checkcast       #463 <Class Object[]>
	//   11   27:invokestatic    #469 <Method List Arrays.asList(Object[])>
	//   12   30:invokevirtual   #472 <Method RealApolloCall$Builder RealApolloCall$Builder.refetchQueryNames(List)>
	//   13   33:invokevirtual   #353 <Method RealApolloCall RealApolloCall$Builder.build()>
	//   14   36:areturn         
		else
			throw new IllegalStateException("Already Executed");
	//   15   37:new             #262 <Class IllegalStateException>
	//   16   40:dup             
	//   17   41:ldc2            #264 <String "Already Executed">
	//   18   44:invokespecial   #265 <Method void IllegalStateException(String)>
	//   19   47:athrow          
	}

	public transient ApolloMutationCall refetchQueries(Query aquery[])
	{
		if(state.get() == CallState.IDLE)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field AtomicReference state>
	//*   2    4:invokevirtual   #227 <Method Object AtomicReference.get()>
	//*   3    7:getstatic       #80  <Field CallState CallState.IDLE>
	//*   4   10:if_acmpne       37
			return ((ApolloMutationCall) (toBuilder().refetchQueries(Arrays.asList((Object[])Utils.checkNotNull(((Object) (aquery)), "queries == null"))).build()));
	//    5   13:aload_0         
	//    6   14:invokevirtual   #337 <Method RealApolloCall$Builder toBuilder()>
	//    7   17:aload_1         
	//    8   18:ldc2            #476 <String "queries == null">
	//    9   21:invokestatic    #345 <Method Object Utils.checkNotNull(Object, Object)>
	//   10   24:checkcast       #463 <Class Object[]>
	//   11   27:invokestatic    #469 <Method List Arrays.asList(Object[])>
	//   12   30:invokevirtual   #478 <Method RealApolloCall$Builder RealApolloCall$Builder.refetchQueries(List)>
	//   13   33:invokevirtual   #353 <Method RealApolloCall RealApolloCall$Builder.build()>
	//   14   36:areturn         
		else
			throw new IllegalStateException("Already Executed");
	//   15   37:new             #262 <Class IllegalStateException>
	//   16   40:dup             
	//   17   41:ldc2            #264 <String "Already Executed">
	//   18   44:invokespecial   #265 <Method void IllegalStateException(String)>
	//   19   47:athrow          
	}

	Optional responseCallback()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		_cls3..SwitchMap.com.apollographql.apollo.internal.CallState[((CallState)state.get()).ordinal()];
	//    2    2:getstatic       #223 <Field int[] RealApolloCall$3.$SwitchMap$com$apollographql$apollo$internal$CallState>
	//    3    5:aload_0         
	//    4    6:getfield        #85  <Field AtomicReference state>
	//    5    9:invokevirtual   #227 <Method Object AtomicReference.get()>
	//    6   12:checkcast       #76  <Class CallState>
	//    7   15:invokevirtual   #231 <Method int CallState.ordinal()>
	//    8   18:iaload          
		JVM INSTR tableswitch 1 4: default 122
	//	               1 91
	//	               2 51
	//	               3 91
	//	               4 51;
	//    9   19:tableswitch     1 4: default 122
	//	               1 91
	//	               2 51
	//	               3 91
	//	               4 51
		   goto _L1 _L2 _L3 _L2 _L3
	//*  10   48:goto            106
_L3:
		throw new IllegalStateException(CallState.IllegalStateMessage.forCurrentState((CallState)state.get()).expected(new CallState[] {
			CallState.ACTIVE, CallState.CANCELED
		}));
	//   11   51:new             #262 <Class IllegalStateException>
	//   12   54:dup             
	//   13   55:aload_0         
	//   14   56:getfield        #85  <Field AtomicReference state>
	//   15   59:invokevirtual   #227 <Method Object AtomicReference.get()>
	//   16   62:checkcast       #76  <Class CallState>
	//   17   65:invokestatic    #486 <Method CallState$IllegalStateMessage CallState$IllegalStateMessage.forCurrentState(CallState)>
	//   18   68:iconst_2        
	//   19   69:anewarray       CallState[]
	//   20   72:dup             
	//   21   73:iconst_0        
	//   22   74:getstatic       #260 <Field CallState CallState.ACTIVE>
	//   23   77:aastore         
	//   24   78:dup             
	//   25   79:iconst_1        
	//   26   80:getstatic       #358 <Field CallState CallState.CANCELED>
	//   27   83:aastore         
	//   28   84:invokevirtual   #490 <Method String CallState$IllegalStateMessage.expected(CallState[])>
	//   29   87:invokespecial   #265 <Method void IllegalStateException(String)>
	//   30   90:athrow          
_L2:
		Optional optional = Optional.fromNullable(originalCallback.get());
	//   31   91:aload_0         
	//   32   92:getfield        #88  <Field AtomicReference originalCallback>
	//   33   95:invokevirtual   #227 <Method Object AtomicReference.get()>
	//   34   98:invokestatic    #388 <Method Optional Optional.fromNullable(Object)>
	//   35  101:astore_1        
		this;
	//   36  102:aload_0         
		JVM INSTR monitorexit ;
	//   37  103:monitorexit     
		return optional;
	//   38  104:aload_1         
	//   39  105:areturn         
_L1:
		throw new IllegalStateException("Unknown state");
	//   40  106:new             #262 <Class IllegalStateException>
	//   41  109:dup             
	//   42  110:ldc2            #267 <String "Unknown state">
	//   43  113:invokespecial   #265 <Method void IllegalStateException(String)>
	//   44  116:athrow          
		Exception exception;
		exception;
	//   45  117:astore_1        
		this;
	//   46  118:aload_0         
		JVM INSTR monitorexit ;
	//   47  119:monitorexit     
		throw exception;
	//   48  120:aload_1         
	//   49  121:athrow          
	//*  50  122:goto            48
	}

	public volatile ApolloQueryCall responseFetcher(ResponseFetcher responsefetcher)
	{
		return ((ApolloQueryCall) (responseFetcher(responsefetcher)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #495 <Method RealApolloCall responseFetcher(ResponseFetcher)>
	//    3    5:areturn         
	}

	public RealApolloCall responseFetcher(ResponseFetcher responsefetcher)
	{
		if(state.get() == CallState.IDLE)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field AtomicReference state>
	//*   2    4:invokevirtual   #227 <Method Object AtomicReference.get()>
	//*   3    7:getstatic       #80  <Field CallState CallState.IDLE>
	//*   4   10:if_acmpne       34
			return toBuilder().responseFetcher((ResponseFetcher)Utils.checkNotNull(((Object) (responsefetcher)), "responseFetcher == null")).build();
	//    5   13:aload_0         
	//    6   14:invokevirtual   #337 <Method RealApolloCall$Builder toBuilder()>
	//    7   17:aload_1         
	//    8   18:ldc2            #497 <String "responseFetcher == null">
	//    9   21:invokestatic    #345 <Method Object Utils.checkNotNull(Object, Object)>
	//   10   24:checkcast       #291 <Class ResponseFetcher>
	//   11   27:invokevirtual   #500 <Method RealApolloCall$Builder RealApolloCall$Builder.responseFetcher(ResponseFetcher)>
	//   12   30:invokevirtual   #353 <Method RealApolloCall RealApolloCall$Builder.build()>
	//   13   33:areturn         
		else
			throw new IllegalStateException("Already Executed");
	//   14   34:new             #262 <Class IllegalStateException>
	//   15   37:dup             
	//   16   38:ldc2            #264 <String "Already Executed">
	//   17   41:invokespecial   #265 <Method void IllegalStateException(String)>
	//   18   44:athrow          
	}

	Optional terminate()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		_cls3..SwitchMap.com.apollographql.apollo.internal.CallState[((CallState)state.get()).ordinal()];
	//    2    2:getstatic       #223 <Field int[] RealApolloCall$3.$SwitchMap$com$apollographql$apollo$internal$CallState>
	//    3    5:aload_0         
	//    4    6:getfield        #85  <Field AtomicReference state>
	//    5    9:invokevirtual   #227 <Method Object AtomicReference.get()>
	//    6   12:checkcast       #76  <Class CallState>
	//    7   15:invokevirtual   #231 <Method int CallState.ordinal()>
	//    8   18:iaload          
		JVM INSTR tableswitch 1 4: default 157
	//	               1 107
	//	               2 67
	//	               3 51
	//	               4 67;
	//    9   19:tableswitch     1 4: default 157
	//	               1 107
	//	               2 67
	//	               3 51
	//	               4 67
		   goto _L1 _L2 _L3 _L4 _L3
	//*  10   48:goto            141
_L4:
		Optional optional = Optional.fromNullable(originalCallback.getAndSet(((Object) (null))));
	//   11   51:aload_0         
	//   12   52:getfield        #88  <Field AtomicReference originalCallback>
	//   13   55:aconst_null     
	//   14   56:invokevirtual   #506 <Method Object AtomicReference.getAndSet(Object)>
	//   15   59:invokestatic    #388 <Method Optional Optional.fromNullable(Object)>
	//   16   62:astore_1        
		this;
	//   17   63:aload_0         
		JVM INSTR monitorexit ;
	//   18   64:monitorexit     
		return optional;
	//   19   65:aload_1         
	//   20   66:areturn         
_L3:
		throw new IllegalStateException(CallState.IllegalStateMessage.forCurrentState((CallState)state.get()).expected(new CallState[] {
			CallState.ACTIVE, CallState.CANCELED
		}));
	//   21   67:new             #262 <Class IllegalStateException>
	//   22   70:dup             
	//   23   71:aload_0         
	//   24   72:getfield        #85  <Field AtomicReference state>
	//   25   75:invokevirtual   #227 <Method Object AtomicReference.get()>
	//   26   78:checkcast       #76  <Class CallState>
	//   27   81:invokestatic    #486 <Method CallState$IllegalStateMessage CallState$IllegalStateMessage.forCurrentState(CallState)>
	//   28   84:iconst_2        
	//   29   85:anewarray       CallState[]
	//   30   88:dup             
	//   31   89:iconst_0        
	//   32   90:getstatic       #260 <Field CallState CallState.ACTIVE>
	//   33   93:aastore         
	//   34   94:dup             
	//   35   95:iconst_1        
	//   36   96:getstatic       #358 <Field CallState CallState.CANCELED>
	//   37   99:aastore         
	//   38  100:invokevirtual   #490 <Method String CallState$IllegalStateMessage.expected(CallState[])>
	//   39  103:invokespecial   #265 <Method void IllegalStateException(String)>
	//   40  106:athrow          
_L2:
		tracker.unregisterCall(((ApolloCall) (this)));
	//   41  107:aload_0         
	//   42  108:getfield        #136 <Field ApolloCallTracker tracker>
	//   43  111:aload_0         
	//   44  112:invokevirtual   #372 <Method void ApolloCallTracker.unregisterCall(ApolloCall)>
		state.set(((Object) (CallState.TERMINATED)));
	//   45  115:aload_0         
	//   46  116:getfield        #85  <Field AtomicReference state>
	//   47  119:getstatic       #509 <Field CallState CallState.TERMINATED>
	//   48  122:invokevirtual   #244 <Method void AtomicReference.set(Object)>
		optional = Optional.fromNullable(originalCallback.getAndSet(((Object) (null))));
	//   49  125:aload_0         
	//   50  126:getfield        #88  <Field AtomicReference originalCallback>
	//   51  129:aconst_null     
	//   52  130:invokevirtual   #506 <Method Object AtomicReference.getAndSet(Object)>
	//   53  133:invokestatic    #388 <Method Optional Optional.fromNullable(Object)>
	//   54  136:astore_1        
		this;
	//   55  137:aload_0         
		JVM INSTR monitorexit ;
	//   56  138:monitorexit     
		return optional;
	//   57  139:aload_1         
	//   58  140:areturn         
_L1:
		throw new IllegalStateException("Unknown state");
	//   59  141:new             #262 <Class IllegalStateException>
	//   60  144:dup             
	//   61  145:ldc2            #267 <String "Unknown state">
	//   62  148:invokespecial   #265 <Method void IllegalStateException(String)>
	//   63  151:athrow          
		Exception exception;
		exception;
	//   64  152:astore_1        
		this;
	//   65  153:aload_0         
		JVM INSTR monitorexit ;
	//   66  154:monitorexit     
		throw exception;
	//   67  155:aload_1         
	//   68  156:athrow          
	//*  69  157:goto            48
	}

	public Builder toBuilder()
	{
		return builder().operation(operation).serverUrl(serverUrl).httpCallFactory(httpCallFactory).httpCache(httpCache).httpCachePolicy(httpCachePolicy).responseFieldMapperFactory(responseFieldMapperFactory).scalarTypeAdapters(scalarTypeAdapters).apolloStore(apolloStore).cacheHeaders(cacheHeaders).responseFetcher(responseFetcher).dispatcher(dispatcher).logger(logger).applicationInterceptors(applicationInterceptors).tracker(tracker).refetchQueryNames(refetchQueryNames).refetchQueries(refetchQueries).sendOperationIdentifiers(sendOperationdIdentifiers).optimisticUpdates(optimisticUpdates);
	//    0    0:invokestatic    #511 <Method RealApolloCall$Builder builder()>
	//    1    3:aload_0         
	//    2    4:getfield        #91  <Field Operation operation>
	//    3    7:invokevirtual   #514 <Method RealApolloCall$Builder RealApolloCall$Builder.operation(Operation)>
	//    4   10:aload_0         
	//    5   11:getfield        #94  <Field HttpUrl serverUrl>
	//    6   14:invokevirtual   #517 <Method RealApolloCall$Builder RealApolloCall$Builder.serverUrl(HttpUrl)>
	//    7   17:aload_0         
	//    8   18:getfield        #97  <Field okhttp3.Call$Factory httpCallFactory>
	//    9   21:invokevirtual   #520 <Method RealApolloCall$Builder RealApolloCall$Builder.httpCallFactory(okhttp3.Call$Factory)>
	//   10   24:aload_0         
	//   11   25:getfield        #100 <Field HttpCache httpCache>
	//   12   28:invokevirtual   #523 <Method RealApolloCall$Builder RealApolloCall$Builder.httpCache(HttpCache)>
	//   13   31:aload_0         
	//   14   32:getfield        #103 <Field com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy httpCachePolicy>
	//   15   35:invokevirtual   #456 <Method RealApolloCall$Builder RealApolloCall$Builder.httpCachePolicy(com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy)>
	//   16   38:aload_0         
	//   17   39:getfield        #106 <Field ResponseFieldMapperFactory responseFieldMapperFactory>
	//   18   42:invokevirtual   #526 <Method RealApolloCall$Builder RealApolloCall$Builder.responseFieldMapperFactory(ResponseFieldMapperFactory)>
	//   19   45:aload_0         
	//   20   46:getfield        #109 <Field ScalarTypeAdapters scalarTypeAdapters>
	//   21   49:invokevirtual   #529 <Method RealApolloCall$Builder RealApolloCall$Builder.scalarTypeAdapters(ScalarTypeAdapters)>
	//   22   52:aload_0         
	//   23   53:getfield        #112 <Field ApolloStore apolloStore>
	//   24   56:invokevirtual   #532 <Method RealApolloCall$Builder RealApolloCall$Builder.apolloStore(ApolloStore)>
	//   25   59:aload_0         
	//   26   60:getfield        #118 <Field CacheHeaders cacheHeaders>
	//   27   63:invokevirtual   #350 <Method RealApolloCall$Builder RealApolloCall$Builder.cacheHeaders(CacheHeaders)>
	//   28   66:aload_0         
	//   29   67:getfield        #115 <Field ResponseFetcher responseFetcher>
	//   30   70:invokevirtual   #500 <Method RealApolloCall$Builder RealApolloCall$Builder.responseFetcher(ResponseFetcher)>
	//   31   73:aload_0         
	//   32   74:getfield        #121 <Field Executor dispatcher>
	//   33   77:invokevirtual   #535 <Method RealApolloCall$Builder RealApolloCall$Builder.dispatcher(Executor)>
	//   34   80:aload_0         
	//   35   81:getfield        #124 <Field ApolloLogger logger>
	//   36   84:invokevirtual   #538 <Method RealApolloCall$Builder RealApolloCall$Builder.logger(ApolloLogger)>
	//   37   87:aload_0         
	//   38   88:getfield        #127 <Field List applicationInterceptors>
	//   39   91:invokevirtual   #540 <Method RealApolloCall$Builder RealApolloCall$Builder.applicationInterceptors(List)>
	//   40   94:aload_0         
	//   41   95:getfield        #136 <Field ApolloCallTracker tracker>
	//   42   98:invokevirtual   #543 <Method RealApolloCall$Builder RealApolloCall$Builder.tracker(ApolloCallTracker)>
	//   43  101:aload_0         
	//   44  102:getfield        #130 <Field List refetchQueryNames>
	//   45  105:invokevirtual   #472 <Method RealApolloCall$Builder RealApolloCall$Builder.refetchQueryNames(List)>
	//   46  108:aload_0         
	//   47  109:getfield        #133 <Field List refetchQueries>
	//   48  112:invokevirtual   #478 <Method RealApolloCall$Builder RealApolloCall$Builder.refetchQueries(List)>
	//   49  115:aload_0         
	//   50  116:getfield        #205 <Field boolean sendOperationdIdentifiers>
	//   51  119:invokevirtual   #546 <Method RealApolloCall$Builder RealApolloCall$Builder.sendOperationIdentifiers(boolean)>
	//   52  122:aload_0         
	//   53  123:getfield        #214 <Field Optional optimisticUpdates>
	//   54  126:invokevirtual   #549 <Method RealApolloCall$Builder RealApolloCall$Builder.optimisticUpdates(Optional)>
	//   55  129:areturn         
	}

	public volatile ApolloQueryWatcher watcher()
	{
		return ((ApolloQueryWatcher) (watcher()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #555 <Method RealApolloQueryWatcher watcher()>
	//    2    4:areturn         
	}

	public RealApolloQueryWatcher watcher()
	{
		return new RealApolloQueryWatcher(clone(), apolloStore, logger, tracker);
	//    0    0:new             #557 <Class RealApolloQueryWatcher>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #376 <Method RealApolloCall clone()>
	//    4    8:aload_0         
	//    5    9:getfield        #112 <Field ApolloStore apolloStore>
	//    6   12:aload_0         
	//    7   13:getfield        #124 <Field ApolloLogger logger>
	//    8   16:aload_0         
	//    9   17:getfield        #136 <Field ApolloCallTracker tracker>
	//   10   20:invokespecial   #560 <Method void RealApolloQueryWatcher(RealApolloCall, ApolloStore, ApolloLogger, ApolloCallTracker)>
	//   11   23:areturn         
	}

	final ApolloStore apolloStore;
	final List applicationInterceptors;
	final CacheHeaders cacheHeaders;
	final Executor dispatcher;
	final HttpCache httpCache;
	final com.apollographql.apollo.api.cache.http.HttpCachePolicy.Policy httpCachePolicy;
	final okhttp3.Call.Factory httpCallFactory;
	final ApolloInterceptorChain interceptorChain;
	final ApolloLogger logger;
	final Operation operation;
	final Optional optimisticUpdates;
	final AtomicReference originalCallback = new AtomicReference();
	final Optional queryReFetcher;
	final List refetchQueries;
	final List refetchQueryNames;
	final ResponseFetcher responseFetcher;
	final ResponseFieldMapperFactory responseFieldMapperFactory;
	final ScalarTypeAdapters scalarTypeAdapters;
	final boolean sendOperationdIdentifiers;
	final HttpUrl serverUrl;
	final AtomicReference state;
	final ApolloCallTracker tracker;
}
