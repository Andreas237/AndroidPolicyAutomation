// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal;

import com.apollographql.apollo.cache.normalized.ApolloStore;
import com.apollographql.apollo.response.ScalarTypeAdapters;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import okhttp3.HttpUrl;

// Referenced classes of package com.apollographql.apollo.internal:
//			QueryReFetcher, ApolloCallTracker, ApolloLogger, ResponseFieldMapperFactory

static final class QueryReFetcher$Builder
{

	QueryReFetcher$Builder apolloStore(ApolloStore apollostore)
	{
		apolloStore = apollostore;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field ApolloStore apolloStore>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	QueryReFetcher$Builder applicationInterceptors(List list)
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

	QueryReFetcher$Builder callTracker(ApolloCallTracker apollocalltracker)
	{
		callTracker = apollocalltracker;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #61  <Field ApolloCallTracker callTracker>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	QueryReFetcher$Builder dispatcher(Executor executor)
	{
		dispatcher = executor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field Executor dispatcher>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	QueryReFetcher$Builder httpCallFactory(okhttp3.Call.Factory factory)
	{
		httpCallFactory = factory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field okhttp3.Call$Factory httpCallFactory>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	QueryReFetcher$Builder logger(ApolloLogger apollologger)
	{
		logger = apollologger;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #70  <Field ApolloLogger logger>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	QueryReFetcher$Builder queries(List list)
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

	public QueryReFetcher$Builder queryWatchers(List list)
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

	QueryReFetcher$Builder responseFieldMapperFactory(ResponseFieldMapperFactory responsefieldmapperfactory)
	{
		responseFieldMapperFactory = responsefieldmapperfactory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #75  <Field ResponseFieldMapperFactory responseFieldMapperFactory>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	QueryReFetcher$Builder scalarTypeAdapters(ScalarTypeAdapters scalartypeadapters)
	{
		scalarTypeAdapters = scalartypeadapters;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #78  <Field ScalarTypeAdapters scalarTypeAdapters>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	QueryReFetcher$Builder serverUrl(HttpUrl httpurl)
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

	QueryReFetcher$Builder()
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
