// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo;

import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.Subscription;
import com.apollographql.apollo.api.cache.http.HttpCache;
import com.apollographql.apollo.api.cache.http.HttpCachePolicy;
import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.api.internal.Utils;
import com.apollographql.apollo.cache.CacheHeaders;
import com.apollographql.apollo.cache.normalized.ApolloStore;
import com.apollographql.apollo.cache.normalized.CacheKeyResolver;
import com.apollographql.apollo.cache.normalized.NormalizedCacheFactory;
import com.apollographql.apollo.cache.normalized.RecordFieldJsonAdapter;
import com.apollographql.apollo.fetcher.ApolloResponseFetchers;
import com.apollographql.apollo.fetcher.ResponseFetcher;
import com.apollographql.apollo.internal.ApolloCallTracker;
import com.apollographql.apollo.internal.ApolloLogger;
import com.apollographql.apollo.internal.RealApolloCall;
import com.apollographql.apollo.internal.RealApolloPrefetch;
import com.apollographql.apollo.internal.RealApolloSubscriptionCall;
import com.apollographql.apollo.internal.ResponseFieldMapperFactory;
import com.apollographql.apollo.internal.cache.normalized.RealApolloStore;
import com.apollographql.apollo.internal.subscription.NoOpSubscriptionManager;
import com.apollographql.apollo.internal.subscription.RealSubscriptionManager;
import com.apollographql.apollo.internal.subscription.SubscriptionManager;
import com.apollographql.apollo.response.ScalarTypeAdapters;
import java.util.*;
import java.util.concurrent.*;
import okhttp3.*;

// Referenced classes of package com.apollographql.apollo:
//			ApolloMutationCall, ApolloPrefetch, ApolloQueryCall, ApolloSubscriptionCall, 
//			Logger

public final class ApolloClient
	implements ApolloMutationCall.Factory, ApolloPrefetch.Factory, ApolloQueryCall.Factory, ApolloSubscriptionCall.Factory
{
	public static class Builder
	{

		private static okhttp3.Call.Factory addHttpCacheInterceptorIfNeeded(okhttp3.Call.Factory factory, Interceptor interceptor)
		{
			if(factory instanceof OkHttpClient)
		//*   0    0:aload_0         
		//*   1    1:instanceof      #103 <Class OkHttpClient>
		//*   2    4:ifeq            67
			{
				OkHttpClient okhttpclient = (OkHttpClient)factory;
		//    3    7:aload_0         
		//    4    8:checkcast       #103 <Class OkHttpClient>
		//    5   11:astore_2        
				for(Iterator iterator = okhttpclient.interceptors().iterator(); iterator.hasNext();)
		//*   6   12:aload_2         
		//*   7   13:invokevirtual   #107 <Method List OkHttpClient.interceptors()>
		//*   8   16:invokeinterface #113 <Method Iterator List.iterator()>
		//*   9   21:astore_3        
		//*  10   22:aload_3         
		//*  11   23:invokeinterface #119 <Method boolean Iterator.hasNext()>
		//*  12   28:ifeq            55
					if(((Object) (((Object) ((Interceptor)iterator.next())).getClass())).equals(((Object) (((Object) (interceptor)).getClass()))))
		//*  13   31:aload_3         
		//*  14   32:invokeinterface #123 <Method Object Iterator.next()>
		//*  15   37:checkcast       #125 <Class Interceptor>
		//*  16   40:invokevirtual   #129 <Method Class Object.getClass()>
		//*  17   43:aload_1         
		//*  18   44:invokevirtual   #129 <Method Class Object.getClass()>
		//*  19   47:invokevirtual   #133 <Method boolean Object.equals(Object)>
		//*  20   50:ifeq            22
						return factory;
		//   21   53:aload_0         
		//   22   54:areturn         

				return ((okhttp3.Call.Factory) (okhttpclient.newBuilder().addInterceptor(interceptor).build()));
		//   23   55:aload_2         
		//   24   56:invokevirtual   #137 <Method okhttp3.OkHttpClient$Builder OkHttpClient.newBuilder()>
		//   25   59:aload_1         
		//   26   60:invokevirtual   #143 <Method okhttp3.OkHttpClient$Builder okhttp3.OkHttpClient$Builder.addInterceptor(Interceptor)>
		//   27   63:invokevirtual   #147 <Method OkHttpClient okhttp3.OkHttpClient$Builder.build()>
		//   28   66:areturn         
			} else
			{
				return factory;
		//   29   67:aload_0         
		//   30   68:areturn         
			}
		}

		private Executor defaultDispatcher()
		{
			return ((Executor) (new ThreadPoolExecutor(0, 0x7fffffff, 60L, TimeUnit.SECONDS, ((java.util.concurrent.BlockingQueue) (new SynchronousQueue())), new ThreadFactory() {

				public Thread newThread(Runnable runnable)
				{
					return new Thread(runnable, "Apollo Dispatcher");
				//    0    0:new             #29  <Class Thread>
				//    1    3:dup             
				//    2    4:aload_1         
				//    3    5:ldc1            #31  <String "Apollo Dispatcher">
				//    4    7:invokespecial   #34  <Method void Thread(Runnable, String)>
				//    5   10:areturn         
				}

				final Builder this$0;

			
			{
				this$0 = Builder.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field ApolloClient$Builder this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
			}
)));
		//    0    0:new             #151 <Class ThreadPoolExecutor>
		//    1    3:dup             
		//    2    4:iconst_0        
		//    3    5:ldc1            #152 <Int 0x7fffffff>
		//    4    7:ldc2w           #153 <Long 60L>
		//    5   10:getstatic       #160 <Field TimeUnit TimeUnit.SECONDS>
		//    6   13:new             #162 <Class SynchronousQueue>
		//    7   16:dup             
		//    8   17:invokespecial   #163 <Method void SynchronousQueue()>
		//    9   20:new             #9   <Class ApolloClient$Builder$1>
		//   10   23:dup             
		//   11   24:aload_0         
		//   12   25:invokespecial   #166 <Method void ApolloClient$Builder$1(ApolloClient$Builder)>
		//   13   28:invokespecial   #169 <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue, ThreadFactory)>
		//   14   31:areturn         
		}

		public ApolloClient build()
		{
			Utils.checkNotNull(((Object) (serverUrl)), "serverUrl is null");
		//    0    0:aload_0         
		//    1    1:getfield        #172 <Field HttpUrl serverUrl>
		//    2    4:ldc1            #174 <String "serverUrl is null">
		//    3    6:invokestatic    #180 <Method Object Utils.checkNotNull(Object, Object)>
		//    4    9:pop             
			ApolloLogger apollologger = new ApolloLogger(logger);
		//    5   10:new             #182 <Class ApolloLogger>
		//    6   13:dup             
		//    7   14:aload_0         
		//    8   15:getfield        #91  <Field Optional logger>
		//    9   18:invokespecial   #185 <Method void ApolloLogger(Optional)>
		//   10   21:astore          5
			Object obj1 = ((Object) (callFactory));
		//   11   23:aload_0         
		//   12   24:getfield        #187 <Field okhttp3.Call$Factory callFactory>
		//   13   27:astore_2        
			Object obj = obj1;
		//   14   28:aload_2         
		//   15   29:astore_1        
			if(obj1 == null)
		//*  16   30:aload_2         
		//*  17   31:ifnonnull       42
				obj = ((Object) (new OkHttpClient()));
		//   18   34:new             #103 <Class OkHttpClient>
		//   19   37:dup             
		//   20   38:invokespecial   #188 <Method void OkHttpClient()>
		//   21   41:astore_1        
			HttpCache httpcache = httpCache;
		//   22   42:aload_0         
		//   23   43:getfield        #190 <Field HttpCache httpCache>
		//   24   46:astore          6
			obj1 = obj;
		//   25   48:aload_1         
		//   26   49:astore_2        
			if(httpcache != null)
		//*  27   50:aload           6
		//*  28   52:ifnull          67
				obj1 = ((Object) (addHttpCacheInterceptorIfNeeded(((okhttp3.Call.Factory) (obj)), httpcache.interceptor())));
		//   29   55:aload_1         
		//   30   56:aload           6
		//   31   58:invokeinterface #196 <Method Interceptor HttpCache.interceptor()>
		//   32   63:invokestatic    #198 <Method okhttp3.Call$Factory addHttpCacheInterceptorIfNeeded(okhttp3.Call$Factory, Interceptor)>
		//   33   66:astore_2        
			obj = ((Object) (dispatcher));
		//   34   67:aload_0         
		//   35   68:getfield        #200 <Field Executor dispatcher>
		//   36   71:astore_1        
			if(obj == null)
		//*  37   72:aload_1         
		//*  38   73:ifnonnull       84
				obj = ((Object) (defaultDispatcher()));
		//   39   76:aload_0         
		//   40   77:invokespecial   #202 <Method Executor defaultDispatcher()>
		//   41   80:astore_1        
		//*  42   81:goto            84
			ScalarTypeAdapters scalartypeadapters = new ScalarTypeAdapters(customTypeAdapters);
		//   43   84:new             #204 <Class ScalarTypeAdapters>
		//   44   87:dup             
		//   45   88:aload_0         
		//   46   89:getfield        #89  <Field Map customTypeAdapters>
		//   47   92:invokespecial   #207 <Method void ScalarTypeAdapters(Map)>
		//   48   95:astore          7
			Object obj2 = ((Object) (apolloStore));
		//   49   97:aload_0         
		//   50   98:getfield        #53  <Field ApolloStore apolloStore>
		//   51  101:astore_3        
			Object obj3 = ((Object) (cacheFactory));
		//   52  102:aload_0         
		//   53  103:getfield        #61  <Field Optional cacheFactory>
		//   54  106:astore          4
			Optional optional = cacheKeyResolver;
		//   55  108:aload_0         
		//   56  109:getfield        #63  <Field Optional cacheKeyResolver>
		//   57  112:astore          8
			if(((Optional) (obj3)).isPresent() && optional.isPresent())
		//*  58  114:aload           4
		//*  59  116:invokevirtual   #210 <Method boolean Optional.isPresent()>
		//*  60  119:ifeq            168
		//*  61  122:aload           8
		//*  62  124:invokevirtual   #210 <Method boolean Optional.isPresent()>
		//*  63  127:ifeq            168
				obj2 = ((Object) (new RealApolloStore(((NormalizedCacheFactory)((Optional) (obj3)).get()).createChain(RecordFieldJsonAdapter.create()), (CacheKeyResolver)optional.get(), scalartypeadapters, ((Executor) (obj)), apollologger)));
		//   64  130:new             #212 <Class RealApolloStore>
		//   65  133:dup             
		//   66  134:aload           4
		//   67  136:invokevirtual   #215 <Method Object Optional.get()>
		//   68  139:checkcast       #217 <Class NormalizedCacheFactory>
		//   69  142:invokestatic    #223 <Method RecordFieldJsonAdapter RecordFieldJsonAdapter.create()>
		//   70  145:invokevirtual   #227 <Method com.apollographql.apollo.cache.normalized.NormalizedCache NormalizedCacheFactory.createChain(RecordFieldJsonAdapter)>
		//   71  148:aload           8
		//   72  150:invokevirtual   #215 <Method Object Optional.get()>
		//   73  153:checkcast       #229 <Class CacheKeyResolver>
		//   74  156:aload           7
		//   75  158:aload_1         
		//   76  159:aload           5
		//   77  161:invokespecial   #232 <Method void RealApolloStore(com.apollographql.apollo.cache.normalized.NormalizedCache, CacheKeyResolver, ScalarTypeAdapters, Executor, ApolloLogger)>
		//   78  164:astore_3        
		//*  79  165:goto            168
			obj3 = ((Object) (new NoOpSubscriptionManager()));
		//   80  168:new             #234 <Class NoOpSubscriptionManager>
		//   81  171:dup             
		//   82  172:invokespecial   #235 <Method void NoOpSubscriptionManager()>
		//   83  175:astore          4
			optional = subscriptionTransportFactory;
		//   84  177:aload_0         
		//   85  178:getfield        #98  <Field Optional subscriptionTransportFactory>
		//   86  181:astore          8
			if(optional.isPresent())
		//*  87  183:aload           8
		//*  88  185:invokevirtual   #210 <Method boolean Optional.isPresent()>
		//*  89  188:ifeq            214
				obj3 = ((Object) (new RealSubscriptionManager(scalartypeadapters, (com.apollographql.apollo.subscription.SubscriptionTransport.Factory)optional.get(), ((Executor) (obj)))));
		//   90  191:new             #237 <Class RealSubscriptionManager>
		//   91  194:dup             
		//   92  195:aload           7
		//   93  197:aload           8
		//   94  199:invokevirtual   #215 <Method Object Optional.get()>
		//   95  202:checkcast       #239 <Class com.apollographql.apollo.subscription.SubscriptionTransport$Factory>
		//   96  205:aload_1         
		//   97  206:invokespecial   #242 <Method void RealSubscriptionManager(ScalarTypeAdapters, com.apollographql.apollo.subscription.SubscriptionTransport$Factory, Executor)>
		//   98  209:astore          4
		//*  99  211:goto            214
			return new ApolloClient(serverUrl, ((okhttp3.Call.Factory) (obj1)), httpcache, ((ApolloStore) (obj2)), scalartypeadapters, ((Executor) (obj)), defaultHttpCachePolicy, defaultResponseFetcher, defaultCacheHeaders, apollologger, applicationInterceptors, sendOperationIdentifiers, ((SubscriptionManager) (obj3)));
		//  100  214:new             #6   <Class ApolloClient>
		//  101  217:dup             
		//  102  218:aload_0         
		//  103  219:getfield        #172 <Field HttpUrl serverUrl>
		//  104  222:aload_2         
		//  105  223:aload           6
		//  106  225:aload_3         
		//  107  226:aload           7
		//  108  228:aload_1         
		//  109  229:aload_0         
		//  110  230:getfield        #70  <Field com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy defaultHttpCachePolicy>
		//  111  233:aload_0         
		//  112  234:getfield        #77  <Field ResponseFetcher defaultResponseFetcher>
		//  113  237:aload_0         
		//  114  238:getfield        #84  <Field CacheHeaders defaultCacheHeaders>
		//  115  241:aload           5
		//  116  243:aload_0         
		//  117  244:getfield        #96  <Field List applicationInterceptors>
		//  118  247:aload_0         
		//  119  248:getfield        #244 <Field boolean sendOperationIdentifiers>
		//  120  251:aload           4
		//  121  253:invokespecial   #247 <Method void ApolloClient(HttpUrl, okhttp3.Call$Factory, HttpCache, ApolloStore, ScalarTypeAdapters, Executor, com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy, ResponseFetcher, CacheHeaders, ApolloLogger, List, boolean, SubscriptionManager)>
		//  122  256:areturn         
		}

		public Builder callFactory(okhttp3.Call.Factory factory)
		{
			callFactory = (okhttp3.Call.Factory)Utils.checkNotNull(((Object) (factory)), "factory == null");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #251 <String "factory == null">
		//    3    4:invokestatic    #180 <Method Object Utils.checkNotNull(Object, Object)>
		//    4    7:checkcast       #253 <Class okhttp3.Call$Factory>
		//    5   10:putfield        #187 <Field okhttp3.Call$Factory callFactory>
			return this;
		//    6   13:aload_0         
		//    7   14:areturn         
		}

		public Builder defaultResponseFetcher(ResponseFetcher responsefetcher)
		{
			defaultResponseFetcher = (ResponseFetcher)Utils.checkNotNull(((Object) (responsefetcher)), "defaultResponseFetcher == null");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc2            #257 <String "defaultResponseFetcher == null">
		//    3    5:invokestatic    #180 <Method Object Utils.checkNotNull(Object, Object)>
		//    4    8:checkcast       #259 <Class ResponseFetcher>
		//    5   11:putfield        #77  <Field ResponseFetcher defaultResponseFetcher>
			return this;
		//    6   14:aload_0         
		//    7   15:areturn         
		}

		public Builder httpCache(HttpCache httpcache)
		{
			httpCache = (HttpCache)Utils.checkNotNull(((Object) (httpcache)), "httpCache == null");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc2            #262 <String "httpCache == null">
		//    3    5:invokestatic    #180 <Method Object Utils.checkNotNull(Object, Object)>
		//    4    8:checkcast       #192 <Class HttpCache>
		//    5   11:putfield        #190 <Field HttpCache httpCache>
			return this;
		//    6   14:aload_0         
		//    7   15:areturn         
		}

		public Builder logger(Logger logger1)
		{
			logger = Optional.fromNullable(((Object) (logger1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #268 <Method Optional Optional.fromNullable(Object)>
		//    3    5:putfield        #91  <Field Optional logger>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder normalizedCache(NormalizedCacheFactory normalizedcachefactory, CacheKeyResolver cachekeyresolver)
		{
			cacheFactory = Optional.fromNullable(Utils.checkNotNull(((Object) (normalizedcachefactory)), "normalizedCacheFactory == null"));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc2            #272 <String "normalizedCacheFactory == null">
		//    3    5:invokestatic    #180 <Method Object Utils.checkNotNull(Object, Object)>
		//    4    8:invokestatic    #268 <Method Optional Optional.fromNullable(Object)>
		//    5   11:putfield        #61  <Field Optional cacheFactory>
			cacheKeyResolver = Optional.fromNullable(Utils.checkNotNull(((Object) (cachekeyresolver)), "cacheKeyResolver == null"));
		//    6   14:aload_0         
		//    7   15:aload_2         
		//    8   16:ldc2            #274 <String "cacheKeyResolver == null">
		//    9   19:invokestatic    #180 <Method Object Utils.checkNotNull(Object, Object)>
		//   10   22:invokestatic    #268 <Method Optional Optional.fromNullable(Object)>
		//   11   25:putfield        #63  <Field Optional cacheKeyResolver>
			return this;
		//   12   28:aload_0         
		//   13   29:areturn         
		}

		public Builder okHttpClient(OkHttpClient okhttpclient)
		{
			return callFactory((okhttp3.Call.Factory)Utils.checkNotNull(((Object) (okhttpclient)), "okHttpClient is null"));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc2            #278 <String "okHttpClient is null">
		//    3    5:invokestatic    #180 <Method Object Utils.checkNotNull(Object, Object)>
		//    4    8:checkcast       #253 <Class okhttp3.Call$Factory>
		//    5   11:invokevirtual   #280 <Method ApolloClient$Builder callFactory(okhttp3.Call$Factory)>
		//    6   14:areturn         
		}

		public Builder serverUrl(String s)
		{
			serverUrl = HttpUrl.parse((String)Utils.checkNotNull(((Object) (s)), "serverUrl == null"));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc2            #283 <String "serverUrl == null">
		//    3    5:invokestatic    #180 <Method Object Utils.checkNotNull(Object, Object)>
		//    4    8:checkcast       #285 <Class String>
		//    5   11:invokestatic    #291 <Method HttpUrl HttpUrl.parse(String)>
		//    6   14:putfield        #172 <Field HttpUrl serverUrl>
			return this;
		//    7   17:aload_0         
		//    8   18:areturn         
		}

		ApolloStore apolloStore;
		final List applicationInterceptors = new ArrayList();
		Optional cacheFactory;
		Optional cacheKeyResolver;
		okhttp3.Call.Factory callFactory;
		final Map customTypeAdapters = new LinkedHashMap();
		CacheHeaders defaultCacheHeaders;
		com.apollographql.apollo.api.cache.http.HttpCachePolicy.Policy defaultHttpCachePolicy;
		ResponseFetcher defaultResponseFetcher;
		Executor dispatcher;
		HttpCache httpCache;
		Optional logger;
		boolean sendOperationIdentifiers;
		HttpUrl serverUrl;
		Optional subscriptionTransportFactory;

		Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #46  <Method void Object()>
			apolloStore = ApolloStore.NO_APOLLO_STORE;
		//    2    4:aload_0         
		//    3    5:getstatic       #51  <Field ApolloStore ApolloStore.NO_APOLLO_STORE>
		//    4    8:putfield        #53  <Field ApolloStore apolloStore>
			cacheFactory = Optional.absent();
		//    5   11:aload_0         
		//    6   12:invokestatic    #59  <Method Optional Optional.absent()>
		//    7   15:putfield        #61  <Field Optional cacheFactory>
			cacheKeyResolver = Optional.absent();
		//    8   18:aload_0         
		//    9   19:invokestatic    #59  <Method Optional Optional.absent()>
		//   10   22:putfield        #63  <Field Optional cacheKeyResolver>
			defaultHttpCachePolicy = HttpCachePolicy.NETWORK_ONLY;
		//   11   25:aload_0         
		//   12   26:getstatic       #68  <Field com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy HttpCachePolicy.NETWORK_ONLY>
		//   13   29:putfield        #70  <Field com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy defaultHttpCachePolicy>
			defaultResponseFetcher = ApolloResponseFetchers.CACHE_FIRST;
		//   14   32:aload_0         
		//   15   33:getstatic       #75  <Field ResponseFetcher ApolloResponseFetchers.CACHE_FIRST>
		//   16   36:putfield        #77  <Field ResponseFetcher defaultResponseFetcher>
			defaultCacheHeaders = CacheHeaders.NONE;
		//   17   39:aload_0         
		//   18   40:getstatic       #82  <Field CacheHeaders CacheHeaders.NONE>
		//   19   43:putfield        #84  <Field CacheHeaders defaultCacheHeaders>
		//   20   46:aload_0         
		//   21   47:new             #86  <Class LinkedHashMap>
		//   22   50:dup             
		//   23   51:invokespecial   #87  <Method void LinkedHashMap()>
		//   24   54:putfield        #89  <Field Map customTypeAdapters>
			logger = Optional.absent();
		//   25   57:aload_0         
		//   26   58:invokestatic    #59  <Method Optional Optional.absent()>
		//   27   61:putfield        #91  <Field Optional logger>
		//   28   64:aload_0         
		//   29   65:new             #93  <Class ArrayList>
		//   30   68:dup             
		//   31   69:invokespecial   #94  <Method void ArrayList()>
		//   32   72:putfield        #96  <Field List applicationInterceptors>
			subscriptionTransportFactory = Optional.absent();
		//   33   75:aload_0         
		//   34   76:invokestatic    #59  <Method Optional Optional.absent()>
		//   35   79:putfield        #98  <Field Optional subscriptionTransportFactory>
		//   36   82:return          
		}
	}


	ApolloClient(HttpUrl httpurl, okhttp3.Call.Factory factory, HttpCache httpcache, ApolloStore apollostore, ScalarTypeAdapters scalartypeadapters, Executor executor, com.apollographql.apollo.api.cache.http.HttpCachePolicy.Policy policy, 
			ResponseFetcher responsefetcher, CacheHeaders cacheheaders, ApolloLogger apollologger, List list, boolean flag, SubscriptionManager subscriptionmanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #55  <Class ResponseFieldMapperFactory>
	//    4    8:dup             
	//    5    9:invokespecial   #56  <Method void ResponseFieldMapperFactory()>
	//    6   12:putfield        #58  <Field ResponseFieldMapperFactory responseFieldMapperFactory>
	//    7   15:aload_0         
	//    8   16:new             #60  <Class ApolloCallTracker>
	//    9   19:dup             
	//   10   20:invokespecial   #61  <Method void ApolloCallTracker()>
	//   11   23:putfield        #63  <Field ApolloCallTracker tracker>
		serverUrl = httpurl;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #65  <Field HttpUrl serverUrl>
		httpCallFactory = factory;
	//   15   31:aload_0         
	//   16   32:aload_2         
	//   17   33:putfield        #67  <Field okhttp3.Call$Factory httpCallFactory>
		httpCache = httpcache;
	//   18   36:aload_0         
	//   19   37:aload_3         
	//   20   38:putfield        #69  <Field HttpCache httpCache>
		apolloStore = apollostore;
	//   21   41:aload_0         
	//   22   42:aload           4
	//   23   44:putfield        #71  <Field ApolloStore apolloStore>
		scalarTypeAdapters = scalartypeadapters;
	//   24   47:aload_0         
	//   25   48:aload           5
	//   26   50:putfield        #73  <Field ScalarTypeAdapters scalarTypeAdapters>
		dispatcher = executor;
	//   27   53:aload_0         
	//   28   54:aload           6
	//   29   56:putfield        #75  <Field Executor dispatcher>
		defaultHttpCachePolicy = policy;
	//   30   59:aload_0         
	//   31   60:aload           7
	//   32   62:putfield        #77  <Field com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy defaultHttpCachePolicy>
		defaultResponseFetcher = responsefetcher;
	//   33   65:aload_0         
	//   34   66:aload           8
	//   35   68:putfield        #79  <Field ResponseFetcher defaultResponseFetcher>
		defaultCacheHeaders = cacheheaders;
	//   36   71:aload_0         
	//   37   72:aload           9
	//   38   74:putfield        #81  <Field CacheHeaders defaultCacheHeaders>
		logger = apollologger;
	//   39   77:aload_0         
	//   40   78:aload           10
	//   41   80:putfield        #83  <Field ApolloLogger logger>
		applicationInterceptors = list;
	//   42   83:aload_0         
	//   43   84:aload           11
	//   44   86:putfield        #85  <Field List applicationInterceptors>
		sendOperationIdentifiers = flag;
	//   45   89:aload_0         
	//   46   90:iload           12
	//   47   92:putfield        #87  <Field boolean sendOperationIdentifiers>
		subscriptionManager = subscriptionmanager;
	//   48   95:aload_0         
	//   49   96:aload           13
	//   50   98:putfield        #89  <Field SubscriptionManager subscriptionManager>
	//   51  101:return          
	}

	public static Builder builder()
	{
		return new Builder();
	//    0    0:new             #14  <Class ApolloClient$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #95  <Method void ApolloClient$Builder()>
	//    3    7:areturn         
	}

	private RealApolloCall newCall(Operation operation)
	{
		return RealApolloCall.builder().operation(operation).serverUrl(serverUrl).httpCallFactory(httpCallFactory).httpCache(httpCache).httpCachePolicy(defaultHttpCachePolicy).responseFieldMapperFactory(responseFieldMapperFactory).scalarTypeAdapters(scalarTypeAdapters).apolloStore(apolloStore).responseFetcher(defaultResponseFetcher).cacheHeaders(defaultCacheHeaders).dispatcher(dispatcher).logger(logger).applicationInterceptors(applicationInterceptors).tracker(tracker).refetchQueries(Collections.emptyList()).refetchQueryNames(Collections.emptyList()).sendOperationIdentifiers(sendOperationIdentifiers).build();
	//    0    0:invokestatic    #103 <Method com.apollographql.apollo.internal.RealApolloCall$Builder RealApolloCall.builder()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #109 <Method com.apollographql.apollo.internal.RealApolloCall$Builder com.apollographql.apollo.internal.RealApolloCall$Builder.operation(Operation)>
	//    3    7:aload_0         
	//    4    8:getfield        #65  <Field HttpUrl serverUrl>
	//    5   11:invokevirtual   #112 <Method com.apollographql.apollo.internal.RealApolloCall$Builder com.apollographql.apollo.internal.RealApolloCall$Builder.serverUrl(HttpUrl)>
	//    6   14:aload_0         
	//    7   15:getfield        #67  <Field okhttp3.Call$Factory httpCallFactory>
	//    8   18:invokevirtual   #115 <Method com.apollographql.apollo.internal.RealApolloCall$Builder com.apollographql.apollo.internal.RealApolloCall$Builder.httpCallFactory(okhttp3.Call$Factory)>
	//    9   21:aload_0         
	//   10   22:getfield        #69  <Field HttpCache httpCache>
	//   11   25:invokevirtual   #118 <Method com.apollographql.apollo.internal.RealApolloCall$Builder com.apollographql.apollo.internal.RealApolloCall$Builder.httpCache(HttpCache)>
	//   12   28:aload_0         
	//   13   29:getfield        #77  <Field com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy defaultHttpCachePolicy>
	//   14   32:invokevirtual   #122 <Method com.apollographql.apollo.internal.RealApolloCall$Builder com.apollographql.apollo.internal.RealApolloCall$Builder.httpCachePolicy(com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy)>
	//   15   35:aload_0         
	//   16   36:getfield        #58  <Field ResponseFieldMapperFactory responseFieldMapperFactory>
	//   17   39:invokevirtual   #125 <Method com.apollographql.apollo.internal.RealApolloCall$Builder com.apollographql.apollo.internal.RealApolloCall$Builder.responseFieldMapperFactory(ResponseFieldMapperFactory)>
	//   18   42:aload_0         
	//   19   43:getfield        #73  <Field ScalarTypeAdapters scalarTypeAdapters>
	//   20   46:invokevirtual   #128 <Method com.apollographql.apollo.internal.RealApolloCall$Builder com.apollographql.apollo.internal.RealApolloCall$Builder.scalarTypeAdapters(ScalarTypeAdapters)>
	//   21   49:aload_0         
	//   22   50:getfield        #71  <Field ApolloStore apolloStore>
	//   23   53:invokevirtual   #131 <Method com.apollographql.apollo.internal.RealApolloCall$Builder com.apollographql.apollo.internal.RealApolloCall$Builder.apolloStore(ApolloStore)>
	//   24   56:aload_0         
	//   25   57:getfield        #79  <Field ResponseFetcher defaultResponseFetcher>
	//   26   60:invokevirtual   #135 <Method com.apollographql.apollo.internal.RealApolloCall$Builder com.apollographql.apollo.internal.RealApolloCall$Builder.responseFetcher(ResponseFetcher)>
	//   27   63:aload_0         
	//   28   64:getfield        #81  <Field CacheHeaders defaultCacheHeaders>
	//   29   67:invokevirtual   #139 <Method com.apollographql.apollo.internal.RealApolloCall$Builder com.apollographql.apollo.internal.RealApolloCall$Builder.cacheHeaders(CacheHeaders)>
	//   30   70:aload_0         
	//   31   71:getfield        #75  <Field Executor dispatcher>
	//   32   74:invokevirtual   #142 <Method com.apollographql.apollo.internal.RealApolloCall$Builder com.apollographql.apollo.internal.RealApolloCall$Builder.dispatcher(Executor)>
	//   33   77:aload_0         
	//   34   78:getfield        #83  <Field ApolloLogger logger>
	//   35   81:invokevirtual   #145 <Method com.apollographql.apollo.internal.RealApolloCall$Builder com.apollographql.apollo.internal.RealApolloCall$Builder.logger(ApolloLogger)>
	//   36   84:aload_0         
	//   37   85:getfield        #85  <Field List applicationInterceptors>
	//   38   88:invokevirtual   #148 <Method com.apollographql.apollo.internal.RealApolloCall$Builder com.apollographql.apollo.internal.RealApolloCall$Builder.applicationInterceptors(List)>
	//   39   91:aload_0         
	//   40   92:getfield        #63  <Field ApolloCallTracker tracker>
	//   41   95:invokevirtual   #151 <Method com.apollographql.apollo.internal.RealApolloCall$Builder com.apollographql.apollo.internal.RealApolloCall$Builder.tracker(ApolloCallTracker)>
	//   42   98:invokestatic    #157 <Method List Collections.emptyList()>
	//   43  101:invokevirtual   #160 <Method com.apollographql.apollo.internal.RealApolloCall$Builder com.apollographql.apollo.internal.RealApolloCall$Builder.refetchQueries(List)>
	//   44  104:invokestatic    #157 <Method List Collections.emptyList()>
	//   45  107:invokevirtual   #163 <Method com.apollographql.apollo.internal.RealApolloCall$Builder com.apollographql.apollo.internal.RealApolloCall$Builder.refetchQueryNames(List)>
	//   46  110:aload_0         
	//   47  111:getfield        #87  <Field boolean sendOperationIdentifiers>
	//   48  114:invokevirtual   #166 <Method com.apollographql.apollo.internal.RealApolloCall$Builder com.apollographql.apollo.internal.RealApolloCall$Builder.sendOperationIdentifiers(boolean)>
	//   49  117:invokevirtual   #170 <Method RealApolloCall com.apollographql.apollo.internal.RealApolloCall$Builder.build()>
	//   50  120:areturn         
	}

	public ApolloMutationCall mutate(Mutation mutation)
	{
		return ((ApolloMutationCall) (newCall(((Operation) (mutation))).responseFetcher(ApolloResponseFetchers.NETWORK_ONLY)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #176 <Method RealApolloCall newCall(Operation)>
	//    3    5:getstatic       #181 <Field ResponseFetcher ApolloResponseFetchers.NETWORK_ONLY>
	//    4    8:invokevirtual   #184 <Method RealApolloCall RealApolloCall.responseFetcher(ResponseFetcher)>
	//    5   11:areturn         
	}

	public ApolloMutationCall mutate(Mutation mutation, com.apollographql.apollo.api.Operation.Data data)
	{
		Utils.checkNotNull(((Object) (data)), "withOptimisticUpdate == null");
	//    0    0:aload_2         
	//    1    1:ldc1            #188 <String "withOptimisticUpdate == null">
	//    2    3:invokestatic    #194 <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		return ((ApolloMutationCall) (newCall(((Operation) (mutation))).toBuilder().responseFetcher(ApolloResponseFetchers.NETWORK_ONLY).optimisticUpdates(Optional.fromNullable(((Object) (data)))).build()));
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:invokespecial   #176 <Method RealApolloCall newCall(Operation)>
	//    7   12:invokevirtual   #197 <Method com.apollographql.apollo.internal.RealApolloCall$Builder RealApolloCall.toBuilder()>
	//    8   15:getstatic       #181 <Field ResponseFetcher ApolloResponseFetchers.NETWORK_ONLY>
	//    9   18:invokevirtual   #135 <Method com.apollographql.apollo.internal.RealApolloCall$Builder com.apollographql.apollo.internal.RealApolloCall$Builder.responseFetcher(ResponseFetcher)>
	//   10   21:aload_2         
	//   11   22:invokestatic    #203 <Method Optional Optional.fromNullable(Object)>
	//   12   25:invokevirtual   #207 <Method com.apollographql.apollo.internal.RealApolloCall$Builder com.apollographql.apollo.internal.RealApolloCall$Builder.optimisticUpdates(Optional)>
	//   13   28:invokevirtual   #170 <Method RealApolloCall com.apollographql.apollo.internal.RealApolloCall$Builder.build()>
	//   14   31:areturn         
	}

	public ApolloPrefetch prefetch(Operation operation)
	{
		return ((ApolloPrefetch) (new RealApolloPrefetch(operation, serverUrl, httpCallFactory, scalarTypeAdapters, dispatcher, logger, tracker, sendOperationIdentifiers)));
	//    0    0:new             #212 <Class RealApolloPrefetch>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #65  <Field HttpUrl serverUrl>
	//    5    9:aload_0         
	//    6   10:getfield        #67  <Field okhttp3.Call$Factory httpCallFactory>
	//    7   13:aload_0         
	//    8   14:getfield        #73  <Field ScalarTypeAdapters scalarTypeAdapters>
	//    9   17:aload_0         
	//   10   18:getfield        #75  <Field Executor dispatcher>
	//   11   21:aload_0         
	//   12   22:getfield        #83  <Field ApolloLogger logger>
	//   13   25:aload_0         
	//   14   26:getfield        #63  <Field ApolloCallTracker tracker>
	//   15   29:aload_0         
	//   16   30:getfield        #87  <Field boolean sendOperationIdentifiers>
	//   17   33:invokespecial   #215 <Method void RealApolloPrefetch(Operation, HttpUrl, okhttp3.Call$Factory, ScalarTypeAdapters, Executor, ApolloLogger, ApolloCallTracker, boolean)>
	//   18   36:areturn         
	}

	public ApolloQueryCall query(Query query1)
	{
		return ((ApolloQueryCall) (newCall(((Operation) (query1)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #176 <Method RealApolloCall newCall(Operation)>
	//    3    5:areturn         
	}

	public ApolloSubscriptionCall subscribe(Subscription subscription)
	{
		return ((ApolloSubscriptionCall) (new RealApolloSubscriptionCall(subscription, subscriptionManager)));
	//    0    0:new             #223 <Class RealApolloSubscriptionCall>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #89  <Field SubscriptionManager subscriptionManager>
	//    5    9:invokespecial   #226 <Method void RealApolloSubscriptionCall(Subscription, SubscriptionManager)>
	//    6   12:areturn         
	}

	private final ApolloStore apolloStore;
	private final List applicationInterceptors;
	private final CacheHeaders defaultCacheHeaders;
	private final com.apollographql.apollo.api.cache.http.HttpCachePolicy.Policy defaultHttpCachePolicy;
	private final ResponseFetcher defaultResponseFetcher;
	private final Executor dispatcher;
	private final HttpCache httpCache;
	private final okhttp3.Call.Factory httpCallFactory;
	private final ApolloLogger logger;
	private final ResponseFieldMapperFactory responseFieldMapperFactory = new ResponseFieldMapperFactory();
	private final ScalarTypeAdapters scalarTypeAdapters;
	private final boolean sendOperationIdentifiers;
	private final HttpUrl serverUrl;
	private final SubscriptionManager subscriptionManager;
	private final ApolloCallTracker tracker = new ApolloCallTracker();
}
