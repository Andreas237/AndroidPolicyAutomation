// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo;

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
import com.apollographql.apollo.internal.ApolloLogger;
import com.apollographql.apollo.internal.cache.normalized.RealApolloStore;
import com.apollographql.apollo.internal.subscription.NoOpSubscriptionManager;
import com.apollographql.apollo.internal.subscription.RealSubscriptionManager;
import com.apollographql.apollo.response.ScalarTypeAdapters;
import java.util.*;
import java.util.concurrent.*;
import okhttp3.*;

// Referenced classes of package com.apollographql.apollo:
//			ApolloClient, Logger

public static class ApolloClient$Builder
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

			final ApolloClient.Builder this$0;

			
			{
				this$0 = ApolloClient.Builder.this;
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
			obj3 = ((Object) (new RealSubscriptionManager(scalartypeadapters, (com.apollographql.apollo.subscription..Factory)optional.get(), ((Executor) (obj)))));
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
		return new ApolloClient(serverUrl, ((okhttp3.Call.Factory) (obj1)), httpcache, ((ApolloStore) (obj2)), scalartypeadapters, ((Executor) (obj)), defaultHttpCachePolicy, defaultResponseFetcher, defaultCacheHeaders, apollologger, applicationInterceptors, sendOperationIdentifiers, ((com.apollographql.apollo.internal.subscription.SubscriptionManager) (obj3)));
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
	//  121  253:invokespecial   #247 <Method void ApolloClient(HttpUrl, okhttp3.Call$Factory, HttpCache, ApolloStore, ScalarTypeAdapters, Executor, com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy, ResponseFetcher, CacheHeaders, ApolloLogger, List, boolean, com.apollographql.apollo.internal.subscription.SubscriptionManager)>
	//  122  256:areturn         
	}

	public ApolloClient$Builder callFactory(okhttp3.Call.Factory factory)
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

	public ApolloClient$Builder defaultResponseFetcher(ResponseFetcher responsefetcher)
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

	public ApolloClient$Builder httpCache(HttpCache httpcache)
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

	public ApolloClient$Builder logger(Logger logger1)
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

	public ApolloClient$Builder normalizedCache(NormalizedCacheFactory normalizedcachefactory, CacheKeyResolver cachekeyresolver)
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

	public ApolloClient$Builder okHttpClient(OkHttpClient okhttpclient)
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

	public ApolloClient$Builder serverUrl(String s)
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
	com.apollographql.apollo.api.cache.http.y defaultHttpCachePolicy;
	ResponseFetcher defaultResponseFetcher;
	Executor dispatcher;
	HttpCache httpCache;
	Optional logger;
	boolean sendOperationIdentifiers;
	HttpUrl serverUrl;
	Optional subscriptionTransportFactory;

	ApolloClient$Builder()
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
