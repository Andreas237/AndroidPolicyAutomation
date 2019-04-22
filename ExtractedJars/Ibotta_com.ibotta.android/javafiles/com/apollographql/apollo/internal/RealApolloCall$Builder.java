// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.cache.http.HttpCache;
import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.cache.CacheHeaders;
import com.apollographql.apollo.cache.normalized.ApolloStore;
import com.apollographql.apollo.fetcher.ResponseFetcher;
import com.apollographql.apollo.response.ScalarTypeAdapters;
import java.util.*;
import java.util.concurrent.Executor;
import okhttp3.HttpUrl;

// Referenced classes of package com.apollographql.apollo.internal:
//			RealApolloCall, ApolloLogger, ResponseFieldMapperFactory, ApolloCallTracker

public static final class RealApolloCall$Builder
{

	public RealApolloCall$Builder apolloStore(ApolloStore apollostore)
	{
		apolloStore = apollostore;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field ApolloStore apolloStore>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RealApolloCall$Builder applicationInterceptors(List list)
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

	public RealApolloCall$Builder cacheHeaders(CacheHeaders cacheheaders)
	{
		cacheHeaders = cacheheaders;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #87  <Field CacheHeaders cacheHeaders>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RealApolloCall$Builder dispatcher(Executor executor)
	{
		dispatcher = executor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #91  <Field Executor dispatcher>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RealApolloCall$Builder httpCache(HttpCache httpcache)
	{
		httpCache = httpcache;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #95  <Field HttpCache httpCache>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RealApolloCall$Builder httpCachePolicy(com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy httpcachepolicy$policy)
	{
		httpCachePolicy = httpcachepolicy$policy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #99  <Field com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy httpCachePolicy>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RealApolloCall$Builder httpCallFactory(okhttp3.Call.Factory factory)
	{
		httpCallFactory = factory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #103 <Field okhttp3.Call$Factory httpCallFactory>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RealApolloCall$Builder logger(ApolloLogger apollologger)
	{
		logger = apollologger;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #107 <Field ApolloLogger logger>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RealApolloCall$Builder operation(Operation operation1)
	{
		operation = operation1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #111 <Field Operation operation>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RealApolloCall$Builder optimisticUpdates(Optional optional)
	{
		optimisticUpdates = optional;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #68  <Field Optional optimisticUpdates>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RealApolloCall$Builder refetchQueries(List list)
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

	public RealApolloCall$Builder refetchQueryNames(List list)
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

	public RealApolloCall$Builder responseFetcher(ResponseFetcher responsefetcher)
	{
		responseFetcher = responsefetcher;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #124 <Field ResponseFetcher responseFetcher>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RealApolloCall$Builder responseFieldMapperFactory(ResponseFieldMapperFactory responsefieldmapperfactory)
	{
		responseFieldMapperFactory = responsefieldmapperfactory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #128 <Field ResponseFieldMapperFactory responseFieldMapperFactory>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RealApolloCall$Builder scalarTypeAdapters(ScalarTypeAdapters scalartypeadapters)
	{
		scalarTypeAdapters = scalartypeadapters;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #132 <Field ScalarTypeAdapters scalarTypeAdapters>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RealApolloCall$Builder sendOperationIdentifiers(boolean flag)
	{
		sendOperationIdentifiers = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #136 <Field boolean sendOperationIdentifiers>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RealApolloCall$Builder serverUrl(HttpUrl httpurl)
	{
		serverUrl = httpurl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #140 <Field HttpUrl serverUrl>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RealApolloCall$Builder tracker(ApolloCallTracker apollocalltracker)
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
	com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy httpCachePolicy;
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

	RealApolloCall$Builder()
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
