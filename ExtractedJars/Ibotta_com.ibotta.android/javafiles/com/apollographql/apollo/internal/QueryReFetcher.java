// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal;

import com.apollographql.apollo.ApolloQueryWatcher;
import com.apollographql.apollo.api.*;
import com.apollographql.apollo.api.cache.http.HttpCachePolicy;
import com.apollographql.apollo.cache.CacheHeaders;
import com.apollographql.apollo.cache.normalized.ApolloStore;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.fetcher.ApolloResponseFetchers;
import com.apollographql.apollo.response.ScalarTypeAdapters;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.HttpUrl;

// Referenced classes of package com.apollographql.apollo.internal:
//			RealApolloCall, ApolloCallTracker, ApolloLogger, ResponseFieldMapperFactory

final class QueryReFetcher
{
	static final class Builder
	{

		Builder apolloStore(ApolloStore apollostore)
		{
			apolloStore = apollostore;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #48  <Field ApolloStore apolloStore>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		Builder applicationInterceptors(List list)
		{
			applicationInterceptors = list;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #51  <Field List applicationInterceptors>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		QueryReFetcher build()
		{
			return new QueryReFetcher(this);
		//    0    0:new             #6   <Class QueryReFetcher>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #58  <Method void QueryReFetcher(QueryReFetcher$Builder)>
		//    4    8:areturn         
		}

		Builder callTracker(ApolloCallTracker apollocalltracker)
		{
			callTracker = apollocalltracker;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #61  <Field ApolloCallTracker callTracker>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		Builder dispatcher(Executor executor)
		{
			dispatcher = executor;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #64  <Field Executor dispatcher>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		Builder httpCallFactory(okhttp3.Call.Factory factory)
		{
			httpCallFactory = factory;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #67  <Field okhttp3.Call$Factory httpCallFactory>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		Builder logger(ApolloLogger apollologger)
		{
			logger = apollologger;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #70  <Field ApolloLogger logger>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		Builder queries(List list)
		{
			if(list == null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          7
		//*   2    4:goto            11
				list = Collections.emptyList();
		//    3    7:invokestatic    #40  <Method List Collections.emptyList()>
		//    4   10:astore_1        
			queries = list;
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:putfield        #42  <Field List queries>
			return this;
		//    8   16:aload_0         
		//    9   17:areturn         
		}

		public Builder queryWatchers(List list)
		{
			if(list == null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          7
		//*   2    4:goto            11
				list = Collections.emptyList();
		//    3    7:invokestatic    #40  <Method List Collections.emptyList()>
		//    4   10:astore_1        
			queryWatchers = list;
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:putfield        #44  <Field List queryWatchers>
			return this;
		//    8   16:aload_0         
		//    9   17:areturn         
		}

		Builder responseFieldMapperFactory(ResponseFieldMapperFactory responsefieldmapperfactory)
		{
			responseFieldMapperFactory = responsefieldmapperfactory;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #75  <Field ResponseFieldMapperFactory responseFieldMapperFactory>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		Builder scalarTypeAdapters(ScalarTypeAdapters scalartypeadapters)
		{
			scalarTypeAdapters = scalartypeadapters;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #78  <Field ScalarTypeAdapters scalarTypeAdapters>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		Builder serverUrl(HttpUrl httpurl)
		{
			serverUrl = httpurl;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #81  <Field HttpUrl serverUrl>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		ApolloStore apolloStore;
		List applicationInterceptors;
		ApolloCallTracker callTracker;
		Executor dispatcher;
		okhttp3.Call.Factory httpCallFactory;
		ApolloLogger logger;
		List queries;
		List queryWatchers;
		ResponseFieldMapperFactory responseFieldMapperFactory;
		ScalarTypeAdapters scalarTypeAdapters;
		HttpUrl serverUrl;

		Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #34  <Method void Object()>
			queries = Collections.emptyList();
		//    2    4:aload_0         
		//    3    5:invokestatic    #40  <Method List Collections.emptyList()>
		//    4    8:putfield        #42  <Field List queries>
			queryWatchers = Collections.emptyList();
		//    5   11:aload_0         
		//    6   12:invokestatic    #40  <Method List Collections.emptyList()>
		//    7   15:putfield        #44  <Field List queryWatchers>
		//    8   18:return          
		}
	}

	static interface OnCompleteCallback
	{

		public abstract void onFetchComplete();
	}


	QueryReFetcher(Builder builder1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #32  <Class AtomicBoolean>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void AtomicBoolean()>
	//    6   12:putfield        #35  <Field AtomicBoolean executed>
		logger = builder1.logger;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:getfield        #37  <Field ApolloLogger QueryReFetcher$Builder.logger>
	//   10   20:putfield        #38  <Field ApolloLogger logger>
		calls = ((List) (new ArrayList(builder1.queries.size())));
	//   11   23:aload_0         
	//   12   24:new             #40  <Class ArrayList>
	//   13   27:dup             
	//   14   28:aload_1         
	//   15   29:getfield        #43  <Field List QueryReFetcher$Builder.queries>
	//   16   32:invokeinterface #49  <Method int List.size()>
	//   17   37:invokespecial   #52  <Method void ArrayList(int)>
	//   18   40:putfield        #54  <Field List calls>
		Query query;
		for(Iterator iterator = builder1.queries.iterator(); iterator.hasNext(); calls.add(((Object) (RealApolloCall.builder().operation(((com.apollographql.apollo.api.Operation) (query))).serverUrl(builder1.serverUrl).httpCallFactory(builder1.httpCallFactory).responseFieldMapperFactory(builder1.responseFieldMapperFactory).scalarTypeAdapters(builder1.scalarTypeAdapters).apolloStore(builder1.apolloStore).httpCachePolicy(HttpCachePolicy.NETWORK_ONLY).responseFetcher(ApolloResponseFetchers.NETWORK_ONLY).cacheHeaders(CacheHeaders.NONE).logger(builder1.logger).applicationInterceptors(builder1.applicationInterceptors).tracker(builder1.callTracker).dispatcher(builder1.dispatcher).build()))))
	//*  19   43:aload_1         
	//*  20   44:getfield        #43  <Field List QueryReFetcher$Builder.queries>
	//*  21   47:invokeinterface #58  <Method Iterator List.iterator()>
	//*  22   52:astore_2        
	//*  23   53:aload_2         
	//*  24   54:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//*  25   59:ifeq            176
			query = (Query)iterator.next();
	//   26   62:aload_2         
	//   27   63:invokeinterface #68  <Method Object Iterator.next()>
	//   28   68:checkcast       #70  <Class Query>
	//   29   71:astore_3        

	//   30   72:aload_0         
	//   31   73:getfield        #54  <Field List calls>
	//   32   76:invokestatic    #76  <Method RealApolloCall$Builder RealApolloCall.builder()>
	//   33   79:aload_3         
	//   34   80:invokevirtual   #82  <Method RealApolloCall$Builder RealApolloCall$Builder.operation(com.apollographql.apollo.api.Operation)>
	//   35   83:aload_1         
	//   36   84:getfield        #86  <Field HttpUrl QueryReFetcher$Builder.serverUrl>
	//   37   87:invokevirtual   #89  <Method RealApolloCall$Builder RealApolloCall$Builder.serverUrl(HttpUrl)>
	//   38   90:aload_1         
	//   39   91:getfield        #93  <Field okhttp3.Call$Factory QueryReFetcher$Builder.httpCallFactory>
	//   40   94:invokevirtual   #96  <Method RealApolloCall$Builder RealApolloCall$Builder.httpCallFactory(okhttp3.Call$Factory)>
	//   41   97:aload_1         
	//   42   98:getfield        #100 <Field ResponseFieldMapperFactory QueryReFetcher$Builder.responseFieldMapperFactory>
	//   43  101:invokevirtual   #103 <Method RealApolloCall$Builder RealApolloCall$Builder.responseFieldMapperFactory(ResponseFieldMapperFactory)>
	//   44  104:aload_1         
	//   45  105:getfield        #107 <Field ScalarTypeAdapters QueryReFetcher$Builder.scalarTypeAdapters>
	//   46  108:invokevirtual   #110 <Method RealApolloCall$Builder RealApolloCall$Builder.scalarTypeAdapters(ScalarTypeAdapters)>
	//   47  111:aload_1         
	//   48  112:getfield        #114 <Field ApolloStore QueryReFetcher$Builder.apolloStore>
	//   49  115:invokevirtual   #117 <Method RealApolloCall$Builder RealApolloCall$Builder.apolloStore(ApolloStore)>
	//   50  118:getstatic       #123 <Field com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy HttpCachePolicy.NETWORK_ONLY>
	//   51  121:invokevirtual   #127 <Method RealApolloCall$Builder RealApolloCall$Builder.httpCachePolicy(com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy)>
	//   52  124:getstatic       #132 <Field com.apollographql.apollo.fetcher.ResponseFetcher ApolloResponseFetchers.NETWORK_ONLY>
	//   53  127:invokevirtual   #136 <Method RealApolloCall$Builder RealApolloCall$Builder.responseFetcher(com.apollographql.apollo.fetcher.ResponseFetcher)>
	//   54  130:getstatic       #142 <Field CacheHeaders CacheHeaders.NONE>
	//   55  133:invokevirtual   #146 <Method RealApolloCall$Builder RealApolloCall$Builder.cacheHeaders(CacheHeaders)>
	//   56  136:aload_1         
	//   57  137:getfield        #37  <Field ApolloLogger QueryReFetcher$Builder.logger>
	//   58  140:invokevirtual   #149 <Method RealApolloCall$Builder RealApolloCall$Builder.logger(ApolloLogger)>
	//   59  143:aload_1         
	//   60  144:getfield        #152 <Field List QueryReFetcher$Builder.applicationInterceptors>
	//   61  147:invokevirtual   #155 <Method RealApolloCall$Builder RealApolloCall$Builder.applicationInterceptors(List)>
	//   62  150:aload_1         
	//   63  151:getfield        #157 <Field ApolloCallTracker QueryReFetcher$Builder.callTracker>
	//   64  154:invokevirtual   #161 <Method RealApolloCall$Builder RealApolloCall$Builder.tracker(ApolloCallTracker)>
	//   65  157:aload_1         
	//   66  158:getfield        #165 <Field Executor QueryReFetcher$Builder.dispatcher>
	//   67  161:invokevirtual   #168 <Method RealApolloCall$Builder RealApolloCall$Builder.dispatcher(Executor)>
	//   68  164:invokevirtual   #172 <Method RealApolloCall RealApolloCall$Builder.build()>
	//   69  167:invokeinterface #176 <Method boolean List.add(Object)>
	//   70  172:pop             
	//*  71  173:goto            53
		queryWatchers = builder1.queryWatchers;
	//   72  176:aload_0         
	//   73  177:aload_1         
	//   74  178:getfield        #178 <Field List QueryReFetcher$Builder.queryWatchers>
	//   75  181:putfield        #179 <Field List queryWatchers>
		callTracker = builder1.callTracker;
	//   76  184:aload_0         
	//   77  185:aload_1         
	//   78  186:getfield        #157 <Field ApolloCallTracker QueryReFetcher$Builder.callTracker>
	//   79  189:putfield        #180 <Field ApolloCallTracker callTracker>
	//   80  192:return          
	}

	static Builder builder()
	{
		return new Builder();
	//    0    0:new             #8   <Class QueryReFetcher$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #183 <Method void QueryReFetcher$Builder()>
	//    3    7:areturn         
	}

	private void refetchQueries()
	{
		final OnCompleteCallback completeCallback = onCompleteCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field QueryReFetcher$OnCompleteCallback onCompleteCallback>
	//    2    4:astore_1        
		final AtomicInteger callsLeft = new AtomicInteger(calls.size());
	//    3    5:new             #188 <Class AtomicInteger>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:getfield        #54  <Field List calls>
	//    7   13:invokeinterface #49  <Method int List.size()>
	//    8   18:invokespecial   #189 <Method void AtomicInteger(int)>
	//    9   21:astore_2        
		final RealApolloCall call;
		for(Iterator iterator = calls.iterator(); iterator.hasNext(); call.enqueue(((com.apollographql.apollo.ApolloCall.Callback) (new com.apollographql.apollo.ApolloCall.Callback() {

		public void onFailure(ApolloException apolloexception)
		{
			if(logger != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field QueryReFetcher this$0>
		//*   2    4:getfield        #37  <Field ApolloLogger QueryReFetcher.logger>
		//*   3    7:ifnull          37
				logger.e(((Throwable) (apolloexception)), "Failed to fetch query: %s", new Object[] {
					call.operation
				});
		//    4   10:aload_0         
		//    5   11:getfield        #21  <Field QueryReFetcher this$0>
		//    6   14:getfield        #37  <Field ApolloLogger QueryReFetcher.logger>
		//    7   17:aload_1         
		//    8   18:ldc1            #39  <String "Failed to fetch query: %s">
		//    9   20:iconst_1        
		//   10   21:anewarray       Object[]
		//   11   24:dup             
		//   12   25:iconst_0        
		//   13   26:aload_0         
		//   14   27:getfield        #27  <Field RealApolloCall val$call>
		//   15   30:getfield        #47  <Field com.apollographql.apollo.api.Operation RealApolloCall.operation>
		//   16   33:aastore         
		//   17   34:invokevirtual   #53  <Method void ApolloLogger.e(Throwable, String, Object[])>
			if(callsLeft.decrementAndGet() == 0)
		//*  18   37:aload_0         
		//*  19   38:getfield        #23  <Field AtomicInteger val$callsLeft>
		//*  20   41:invokevirtual   #59  <Method int AtomicInteger.decrementAndGet()>
		//*  21   44:ifne            62
			{
				apolloexception = ((ApolloException) (completeCallback));
		//   22   47:aload_0         
		//   23   48:getfield        #25  <Field QueryReFetcher$OnCompleteCallback val$completeCallback>
		//   24   51:astore_1        
				if(apolloexception != null)
		//*  25   52:aload_1         
		//*  26   53:ifnull          62
					((OnCompleteCallback) (apolloexception)).onFetchComplete();
		//   27   56:aload_1         
		//   28   57:invokeinterface #64  <Method void QueryReFetcher$OnCompleteCallback.onFetchComplete()>
			}
		//   29   62:return          
		}

		public void onResponse(Response response)
		{
			if(callsLeft.decrementAndGet() == 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field AtomicInteger val$callsLeft>
		//*   2    4:invokevirtual   #59  <Method int AtomicInteger.decrementAndGet()>
		//*   3    7:ifne            25
			{
				response = ((Response) (completeCallback));
		//    4   10:aload_0         
		//    5   11:getfield        #25  <Field QueryReFetcher$OnCompleteCallback val$completeCallback>
		//    6   14:astore_1        
				if(response != null)
		//*   7   15:aload_1         
		//*   8   16:ifnull          25
					((OnCompleteCallback) (response)).onFetchComplete();
		//    9   19:aload_1         
		//   10   20:invokeinterface #64  <Method void QueryReFetcher$OnCompleteCallback.onFetchComplete()>
			}
		//   11   25:return          
		}

		final QueryReFetcher this$0;
		final RealApolloCall val$call;
		final AtomicInteger val$callsLeft;
		final OnCompleteCallback val$completeCallback;

			
			{
				this$0 = QueryReFetcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field QueryReFetcher this$0>
				callsLeft = atomicinteger;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field AtomicInteger val$callsLeft>
				completeCallback = oncompletecallback;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field QueryReFetcher$OnCompleteCallback val$completeCallback>
				call = realapollocall;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #27  <Field RealApolloCall val$call>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #29  <Method void com.apollographql.apollo.ApolloCall$Callback()>
			//   14   25:return          
			}
	}
))))
	//*  10   22:aload_0         
	//*  11   23:getfield        #54  <Field List calls>
	//*  12   26:invokeinterface #58  <Method Iterator List.iterator()>
	//*  13   31:astore_3        
	//*  14   32:aload_3         
	//*  15   33:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//*  16   38:ifeq            72
			call = (RealApolloCall)iterator.next();
	//   17   41:aload_3         
	//   18   42:invokeinterface #68  <Method Object Iterator.next()>
	//   19   47:checkcast       #72  <Class RealApolloCall>
	//   20   50:astore          4

	//   21   52:aload           4
	//   22   54:new             #6   <Class QueryReFetcher$1>
	//   23   57:dup             
	//   24   58:aload_0         
	//   25   59:aload_2         
	//   26   60:aload_1         
	//   27   61:aload           4
	//   28   63:invokespecial   #192 <Method void QueryReFetcher$1(QueryReFetcher, AtomicInteger, QueryReFetcher$OnCompleteCallback, RealApolloCall)>
	//   29   66:invokevirtual   #196 <Method void RealApolloCall.enqueue(com.apollographql.apollo.ApolloCall$Callback)>
	//*  30   69:goto            32
	//   31   72:return          
	}

	private void refetchQueryWatchers()
	{
		try
		{
			for(Iterator iterator = queryWatchers.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field List queryWatchers>
	//*   2    4:invokeinterface #58  <Method Iterator List.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            84
			{
				Object obj = ((Object) ((OperationName)iterator.next()));
	//    7   19:aload_1         
	//    8   20:invokeinterface #68  <Method Object Iterator.next()>
	//    9   25:checkcast       #201 <Class OperationName>
	//   10   28:astore_2        
				obj = ((Object) (callTracker.activeQueryWatchers(((OperationName) (obj))).iterator()));
	//   11   29:aload_0         
	//   12   30:getfield        #180 <Field ApolloCallTracker callTracker>
	//   13   33:aload_2         
	//   14   34:invokevirtual   #207 <Method Set ApolloCallTracker.activeQueryWatchers(OperationName)>
	//   15   37:invokeinterface #210 <Method Iterator Set.iterator()>
	//   16   42:astore_2        
				while(((Iterator) (obj)).hasNext()) 
	//*  17   43:aload_2         
	//*  18   44:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//*  19   49:ifeq            10
					((ApolloQueryWatcher)((Iterator) (obj)).next()).refetch();
	//   20   52:aload_2         
	//   21   53:invokeinterface #68  <Method Object Iterator.next()>
	//   22   58:checkcast       #212 <Class ApolloQueryWatcher>
	//   23   61:invokeinterface #215 <Method void ApolloQueryWatcher.refetch()>
			}

		}
	//*  24   66:goto            43
		catch(Exception exception)
	//*  25   69:astore_1        
		{
			logger.e(((Throwable) (exception)), "Failed to re-fetch query watcher", new Object[0]);
	//   26   70:aload_0         
	//   27   71:getfield        #38  <Field ApolloLogger logger>
	//   28   74:aload_1         
	//   29   75:ldc1            #217 <String "Failed to re-fetch query watcher">
	//   30   77:iconst_0        
	//   31   78:anewarray       Object[]
	//   32   81:invokevirtual   #223 <Method void ApolloLogger.e(Throwable, String, Object[])>
		}
	//   33   84:return          
	}

	void cancel()
	{
		for(Iterator iterator = calls.iterator(); iterator.hasNext(); ((RealApolloCall)iterator.next()).cancel());
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field List calls>
	//    2    4:invokeinterface #58  <Method Iterator List.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            34
	//    7   19:aload_1         
	//    8   20:invokeinterface #68  <Method Object Iterator.next()>
	//    9   25:checkcast       #72  <Class RealApolloCall>
	//   10   28:invokevirtual   #226 <Method void RealApolloCall.cancel()>
	//*  11   31:goto            10
	//   12   34:return          
	}

	void refetch()
	{
		if(executed.compareAndSet(false, true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field AtomicBoolean executed>
	//*   2    4:iconst_0        
	//*   3    5:iconst_1        
	//*   4    6:invokevirtual   #230 <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//*   5    9:ifeq            21
		{
			refetchQueryWatchers();
	//    6   12:aload_0         
	//    7   13:invokespecial   #232 <Method void refetchQueryWatchers()>
			refetchQueries();
	//    8   16:aload_0         
	//    9   17:invokespecial   #234 <Method void refetchQueries()>
			return;
	//   10   20:return          
		} else
		{
			throw new IllegalStateException("Already Executed");
	//   11   21:new             #236 <Class IllegalStateException>
	//   12   24:dup             
	//   13   25:ldc1            #238 <String "Already Executed">
	//   14   27:invokespecial   #241 <Method void IllegalStateException(String)>
	//   15   30:athrow          
		}
	}

	private ApolloCallTracker callTracker;
	private final List calls;
	private final AtomicBoolean executed = new AtomicBoolean();
	final ApolloLogger logger;
	OnCompleteCallback onCompleteCallback;
	private List queryWatchers;
}
