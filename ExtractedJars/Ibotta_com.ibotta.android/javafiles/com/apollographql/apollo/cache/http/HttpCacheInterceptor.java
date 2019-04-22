// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.http;

import com.apollographql.apollo.api.internal.Utils;
import com.apollographql.apollo.internal.ApolloLogger;
import com.newrelic.agent.android.instrumentation.okhttp3.OkHttp3Instrumentation;
import java.io.IOException;
import okhttp3.*;

// Referenced classes of package com.apollographql.apollo.cache.http:
//			ApolloHttpCache, Utils

final class HttpCacheInterceptor
	implements Interceptor
{

	HttpCacheInterceptor(ApolloHttpCache apollohttpcache, ApolloLogger apollologger)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		cache = (ApolloHttpCache)Utils.checkNotNull(((Object) (apollohttpcache)), "cache == null");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #18  <String "cache == null">
	//    5    8:invokestatic    #24  <Method Object Utils.checkNotNull(Object, Object)>
	//    6   11:checkcast       #26  <Class ApolloHttpCache>
	//    7   14:putfield        #28  <Field ApolloHttpCache cache>
		logger = (ApolloLogger)Utils.checkNotNull(((Object) (apollologger)), "logger == null");
	//    8   17:aload_0         
	//    9   18:aload_2         
	//   10   19:ldc1            #30  <String "logger == null">
	//   11   21:invokestatic    #24  <Method Object Utils.checkNotNull(Object, Object)>
	//   12   24:checkcast       #32  <Class ApolloLogger>
	//   13   27:putfield        #34  <Field ApolloLogger logger>
	//   14   30:return          
	}

	private Response cacheFirst(Request request, okhttp3.Interceptor.Chain chain)
		throws IOException
	{
		Object obj = ((Object) (cachedResponse(request)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #43  <Method Response cachedResponse(Request)>
	//    3    5:astore_3        
		if(obj != null)
	//*   4    6:aload_3         
	//*   5    7:ifnull          54
		{
			logCacheHit(request);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #47  <Method void logCacheHit(Request)>
			if(!(obj instanceof okhttp3.Response.Builder))
	//*   9   15:aload_3         
	//*  10   16:instanceof      #49  <Class okhttp3.Response$Builder>
	//*  11   19:ifne            30
				chain = ((okhttp3.Interceptor.Chain) (((Response) (obj)).newBuilder()));
	//   12   22:aload_3         
	//   13   23:invokevirtual   #55  <Method okhttp3.Response$Builder Response.newBuilder()>
	//   14   26:astore_2        
			else
	//*  15   27:goto            38
				chain = ((okhttp3.Interceptor.Chain) (OkHttp3Instrumentation.newBuilder((okhttp3.Response.Builder)obj)));
	//   16   30:aload_3         
	//   17   31:checkcast       #49  <Class okhttp3.Response$Builder>
	//   18   34:invokestatic    #60  <Method okhttp3.Response$Builder OkHttp3Instrumentation.newBuilder(okhttp3.Response$Builder)>
	//   19   37:astore_2        
			return ((okhttp3.Response.Builder) (chain)).cacheResponse(Utils.strip(((Response) (obj)))).request(request).build();
	//   20   38:aload_2         
	//   21   39:aload_3         
	//   22   40:invokestatic    #66  <Method Response Utils.strip(Response)>
	//   23   43:invokevirtual   #70  <Method okhttp3.Response$Builder okhttp3.Response$Builder.cacheResponse(Response)>
	//   24   46:aload_1         
	//   25   47:invokevirtual   #74  <Method okhttp3.Response$Builder okhttp3.Response$Builder.request(Request)>
	//   26   50:invokevirtual   #78  <Method Response okhttp3.Response$Builder.build()>
	//   27   53:areturn         
		}
		logCacheMiss(request);
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:invokespecial   #81  <Method void logCacheMiss(Request)>
		obj = ((Object) (request.header("X-APOLLO-CACHE-KEY")));
	//   31   59:aload_1         
	//   32   60:ldc1            #83  <String "X-APOLLO-CACHE-KEY">
	//   33   62:invokevirtual   #89  <Method String Request.header(String)>
	//   34   65:astore_3        
		chain = ((okhttp3.Interceptor.Chain) (Utils.withServedDateHeader(chain.proceed(request))));
	//   35   66:aload_2         
	//   36   67:aload_1         
	//   37   68:invokeinterface #94  <Method Response okhttp3.Interceptor$Chain.proceed(Request)>
	//   38   73:invokestatic    #97  <Method Response Utils.withServedDateHeader(Response)>
	//   39   76:astore_2        
		if(Utils.isPrefetchResponse(request))
	//*  40   77:aload_1         
	//*  41   78:invokestatic    #101 <Method boolean Utils.isPrefetchResponse(Request)>
	//*  42   81:ifeq            91
			return prefetch(((Response) (chain)), ((String) (obj)));
	//   43   84:aload_0         
	//   44   85:aload_2         
	//   45   86:aload_3         
	//   46   87:invokespecial   #105 <Method Response prefetch(Response, String)>
	//   47   90:areturn         
		if(((Response) (chain)).isSuccessful())
	//*  48   91:aload_2         
	//*  49   92:invokevirtual   #109 <Method boolean Response.isSuccessful()>
	//*  50   95:ifeq            108
			return cache.cacheProxy(((Response) (chain)), ((String) (obj)));
	//   51   98:aload_0         
	//   52   99:getfield        #28  <Field ApolloHttpCache cache>
	//   53  102:aload_2         
	//   54  103:aload_3         
	//   55  104:invokevirtual   #112 <Method Response ApolloHttpCache.cacheProxy(Response, String)>
	//   56  107:areturn         
		else
			return ((Response) (chain));
	//   57  108:aload_2         
	//   58  109:areturn         
	}

	private Response cacheOnlyResponse(Request request)
		throws IOException
	{
		Response response = cachedResponse(request);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #43  <Method Response cachedResponse(Request)>
	//    3    5:astore_2        
		if(response == null)
	//*   4    6:aload_2         
	//*   5    7:ifnonnull       20
		{
			logCacheMiss(request);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #81  <Method void logCacheMiss(Request)>
			return Utils.unsatisfiableCacheRequest(request);
	//    9   15:aload_1         
	//   10   16:invokestatic    #117 <Method Response Utils.unsatisfiableCacheRequest(Request)>
	//   11   19:areturn         
		}
		logCacheHit(request);
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokespecial   #47  <Method void logCacheHit(Request)>
		if(!(response instanceof okhttp3.Response.Builder))
	//*  15   25:aload_2         
	//*  16   26:instanceof      #49  <Class okhttp3.Response$Builder>
	//*  17   29:ifne            40
			request = ((Request) (response.newBuilder()));
	//   18   32:aload_2         
	//   19   33:invokevirtual   #55  <Method okhttp3.Response$Builder Response.newBuilder()>
	//   20   36:astore_1        
		else
	//*  21   37:goto            48
			request = ((Request) (OkHttp3Instrumentation.newBuilder((okhttp3.Response.Builder)response)));
	//   22   40:aload_2         
	//   23   41:checkcast       #49  <Class okhttp3.Response$Builder>
	//   24   44:invokestatic    #60  <Method okhttp3.Response$Builder OkHttp3Instrumentation.newBuilder(okhttp3.Response$Builder)>
	//   25   47:astore_1        
		return ((okhttp3.Response.Builder) (request)).cacheResponse(Utils.strip(response)).build();
	//   26   48:aload_1         
	//   27   49:aload_2         
	//   28   50:invokestatic    #66  <Method Response Utils.strip(Response)>
	//   29   53:invokevirtual   #70  <Method okhttp3.Response$Builder okhttp3.Response$Builder.cacheResponse(Response)>
	//   30   56:invokevirtual   #78  <Method Response okhttp3.Response$Builder.build()>
	//   31   59:areturn         
	}

	private Response cachedResponse(Request request)
	{
		Object obj = ((Object) (request.header("X-APOLLO-CACHE-KEY")));
	//    0    0:aload_1         
	//    1    1:ldc1            #83  <String "X-APOLLO-CACHE-KEY">
	//    2    3:invokevirtual   #89  <Method String Request.header(String)>
	//    3    6:astore_2        
		obj = ((Object) (cache.read(((String) (obj)), Utils.shouldExpireAfterRead(request))));
	//    4    7:aload_0         
	//    5    8:getfield        #28  <Field ApolloHttpCache cache>
	//    6   11:aload_2         
	//    7   12:aload_1         
	//    8   13:invokestatic    #120 <Method boolean Utils.shouldExpireAfterRead(Request)>
	//    9   16:invokevirtual   #124 <Method Response ApolloHttpCache.read(String, boolean)>
	//   10   19:astore_2        
		if(obj == null)
	//*  11   20:aload_2         
	//*  12   21:ifnonnull       26
			return null;
	//   13   24:aconst_null     
	//   14   25:areturn         
		if(Utils.isStale(request, ((Response) (obj))))
	//*  15   26:aload_1         
	//*  16   27:aload_2         
	//*  17   28:invokestatic    #128 <Method boolean Utils.isStale(Request, Response)>
	//*  18   31:ifeq            40
		{
			Utils.closeQuietly(((Response) (obj)));
	//   19   34:aload_2         
	//   20   35:invokestatic    #132 <Method void Utils.closeQuietly(Response)>
			return null;
	//   21   38:aconst_null     
	//   22   39:areturn         
		} else
		{
			return ((Response) (obj));
	//   23   40:aload_2         
	//   24   41:areturn         
		}
	}

	private void logCacheHit(Request request)
	{
		String s = request.header("X-APOLLO-CACHE-KEY");
	//    0    0:aload_1         
	//    1    1:ldc1            #83  <String "X-APOLLO-CACHE-KEY">
	//    2    3:invokevirtual   #89  <Method String Request.header(String)>
	//    3    6:astore_2        
		logger.d("Cache HIT for request: %s, with cache key: %s", new Object[] {
			request, s
		});
	//    4    7:aload_0         
	//    5    8:getfield        #34  <Field ApolloLogger logger>
	//    6   11:ldc1            #134 <String "Cache HIT for request: %s, with cache key: %s">
	//    7   13:iconst_2        
	//    8   14:anewarray       Object[]
	//    9   17:dup             
	//   10   18:iconst_0        
	//   11   19:aload_1         
	//   12   20:aastore         
	//   13   21:dup             
	//   14   22:iconst_1        
	//   15   23:aload_2         
	//   16   24:aastore         
	//   17   25:invokevirtual   #138 <Method void ApolloLogger.d(String, Object[])>
	//   18   28:return          
	}

	private void logCacheMiss(Request request)
	{
		String s = request.header("X-APOLLO-CACHE-KEY");
	//    0    0:aload_1         
	//    1    1:ldc1            #83  <String "X-APOLLO-CACHE-KEY">
	//    2    3:invokevirtual   #89  <Method String Request.header(String)>
	//    3    6:astore_2        
		logger.d("Cache MISS for request: %s, with cache key: %s", new Object[] {
			request, s
		});
	//    4    7:aload_0         
	//    5    8:getfield        #34  <Field ApolloLogger logger>
	//    6   11:ldc1            #140 <String "Cache MISS for request: %s, with cache key: %s">
	//    7   13:iconst_2        
	//    8   14:anewarray       Object[]
	//    9   17:dup             
	//   10   18:iconst_0        
	//   11   19:aload_1         
	//   12   20:aastore         
	//   13   21:dup             
	//   14   22:iconst_1        
	//   15   23:aload_2         
	//   16   24:aastore         
	//   17   25:invokevirtual   #138 <Method void ApolloLogger.d(String, Object[])>
	//   18   28:return          
	}

	private Response networkFirst(Request request, okhttp3.Interceptor.Chain chain)
		throws IOException
	{
		Response response;
		String s;
		s = request.header("X-APOLLO-CACHE-KEY");
	//    0    0:aload_1         
	//    1    1:ldc1            #83  <String "X-APOLLO-CACHE-KEY">
	//    2    3:invokevirtual   #89  <Method String Request.header(String)>
	//    3    6:astore          5
		response = null;
	//    4    8:aconst_null     
	//    5    9:astore_3        
		Response response1 = Utils.withServedDateHeader(chain.proceed(request));
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokeinterface #94  <Method Response okhttp3.Interceptor$Chain.proceed(Request)>
	//    9   17:invokestatic    #97  <Method Response Utils.withServedDateHeader(Response)>
	//   10   20:astore          4
		chain = ((okhttp3.Interceptor.Chain) (response));
	//   11   22:aload_3         
	//   12   23:astore_2        
		response = response1;
	//   13   24:aload           4
	//   14   26:astore_3        
		try
		{
			if(!response1.isSuccessful())
				break MISSING_BLOCK_LABEL_81;
	//   15   27:aload           4
	//   16   29:invokevirtual   #109 <Method boolean Response.isSuccessful()>
	//   17   32:ifeq            81
			logger.d("Network success, skip http cache for request: %s, with cache key: %s", new Object[] {
				request, s
			});
	//   18   35:aload_0         
	//   19   36:getfield        #34  <Field ApolloLogger logger>
	//   20   39:ldc1            #143 <String "Network success, skip http cache for request: %s, with cache key: %s">
	//   21   41:iconst_2        
	//   22   42:anewarray       Object[]
	//   23   45:dup             
	//   24   46:iconst_0        
	//   25   47:aload_1         
	//   26   48:aastore         
	//   27   49:dup             
	//   28   50:iconst_1        
	//   29   51:aload           5
	//   30   53:aastore         
	//   31   54:invokevirtual   #138 <Method void ApolloLogger.d(String, Object[])>
			chain = ((okhttp3.Interceptor.Chain) (cache.cacheProxy(response1, s)));
	//   32   57:aload_0         
	//   33   58:getfield        #28  <Field ApolloHttpCache cache>
	//   34   61:aload           4
	//   35   63:aload           5
	//   36   65:invokevirtual   #112 <Method Response ApolloHttpCache.cacheProxy(Response, String)>
	//   37   68:astore_2        
		}
	//*  38   69:aload_2         
	//*  39   70:areturn         
		// Misplaced declaration of an exception variable
		catch(okhttp3.Interceptor.Chain chain)
	//*  40   71:astore_2        
		{
			response = response1;
	//   41   72:aload           4
	//   42   74:astore_3        
			break MISSING_BLOCK_LABEL_81;
	//   43   75:goto            81
		}
		return ((Response) (chain));
		chain;
	//   44   78:astore_2        
		response = null;
	//   45   79:aconst_null     
	//   46   80:astore_3        
		Response response2 = cachedResponse(request);
	//   47   81:aload_0         
	//   48   82:aload_1         
	//   49   83:invokespecial   #43  <Method Response cachedResponse(Request)>
	//   50   86:astore          4
		if(response2 == null)
	//*  51   88:aload           4
	//*  52   90:ifnonnull       106
		{
			logCacheMiss(request);
	//   53   93:aload_0         
	//   54   94:aload_1         
	//   55   95:invokespecial   #81  <Method void logCacheMiss(Request)>
			if(chain == null)
	//*  56   98:aload_2         
	//*  57   99:ifnonnull       104
				return response;
	//   58  102:aload_3         
	//   59  103:areturn         
			else
				throw chain;
	//   60  104:aload_2         
	//   61  105:athrow          
		}
		logCacheHit(request);
	//   62  106:aload_0         
	//   63  107:aload_1         
	//   64  108:invokespecial   #47  <Method void logCacheHit(Request)>
		if(!(response2 instanceof okhttp3.Response.Builder))
	//*  65  111:aload           4
	//*  66  113:instanceof      #49  <Class okhttp3.Response$Builder>
	//*  67  116:ifne            128
			chain = ((okhttp3.Interceptor.Chain) (response2.newBuilder()));
	//   68  119:aload           4
	//   69  121:invokevirtual   #55  <Method okhttp3.Response$Builder Response.newBuilder()>
	//   70  124:astore_2        
		else
	//*  71  125:goto            137
			chain = ((okhttp3.Interceptor.Chain) (OkHttp3Instrumentation.newBuilder((okhttp3.Response.Builder)response2)));
	//   72  128:aload           4
	//   73  130:checkcast       #49  <Class okhttp3.Response$Builder>
	//   74  133:invokestatic    #60  <Method okhttp3.Response$Builder OkHttp3Instrumentation.newBuilder(okhttp3.Response$Builder)>
	//   75  136:astore_2        
		return ((okhttp3.Response.Builder) (chain)).cacheResponse(Utils.strip(response2)).networkResponse(Utils.strip(response)).request(request).build();
	//   76  137:aload_2         
	//   77  138:aload           4
	//   78  140:invokestatic    #66  <Method Response Utils.strip(Response)>
	//   79  143:invokevirtual   #70  <Method okhttp3.Response$Builder okhttp3.Response$Builder.cacheResponse(Response)>
	//   80  146:aload_3         
	//   81  147:invokestatic    #66  <Method Response Utils.strip(Response)>
	//   82  150:invokevirtual   #146 <Method okhttp3.Response$Builder okhttp3.Response$Builder.networkResponse(Response)>
	//   83  153:aload_1         
	//   84  154:invokevirtual   #74  <Method okhttp3.Response$Builder okhttp3.Response$Builder.request(Request)>
	//   85  157:invokevirtual   #78  <Method Response okhttp3.Response$Builder.build()>
	//   86  160:areturn         
	}

	private Response networkOnly(Request request, okhttp3.Interceptor.Chain chain)
		throws IOException
	{
		String s = request.header("X-APOLLO-CACHE-KEY");
	//    0    0:aload_1         
	//    1    1:ldc1            #83  <String "X-APOLLO-CACHE-KEY">
	//    2    3:invokevirtual   #89  <Method String Request.header(String)>
	//    3    6:astore_3        
		chain = ((okhttp3.Interceptor.Chain) (Utils.withServedDateHeader(chain.proceed(request))));
	//    4    7:aload_2         
	//    5    8:aload_1         
	//    6    9:invokeinterface #94  <Method Response okhttp3.Interceptor$Chain.proceed(Request)>
	//    7   14:invokestatic    #97  <Method Response Utils.withServedDateHeader(Response)>
	//    8   17:astore_2        
		if(Utils.isPrefetchResponse(request))
	//*   9   18:aload_1         
	//*  10   19:invokestatic    #101 <Method boolean Utils.isPrefetchResponse(Request)>
	//*  11   22:ifeq            32
			return prefetch(((Response) (chain)), s);
	//   12   25:aload_0         
	//   13   26:aload_2         
	//   14   27:aload_3         
	//   15   28:invokespecial   #105 <Method Response prefetch(Response, String)>
	//   16   31:areturn         
		if(((Response) (chain)).isSuccessful())
	//*  17   32:aload_2         
	//*  18   33:invokevirtual   #109 <Method boolean Response.isSuccessful()>
	//*  19   36:ifeq            70
		{
			logger.d("Network success, skip http cache for request: %s, with cache key: %s", new Object[] {
				request, s
			});
	//   20   39:aload_0         
	//   21   40:getfield        #34  <Field ApolloLogger logger>
	//   22   43:ldc1            #143 <String "Network success, skip http cache for request: %s, with cache key: %s">
	//   23   45:iconst_2        
	//   24   46:anewarray       Object[]
	//   25   49:dup             
	//   26   50:iconst_0        
	//   27   51:aload_1         
	//   28   52:aastore         
	//   29   53:dup             
	//   30   54:iconst_1        
	//   31   55:aload_3         
	//   32   56:aastore         
	//   33   57:invokevirtual   #138 <Method void ApolloLogger.d(String, Object[])>
			return cache.cacheProxy(((Response) (chain)), s);
	//   34   60:aload_0         
	//   35   61:getfield        #28  <Field ApolloHttpCache cache>
	//   36   64:aload_2         
	//   37   65:aload_3         
	//   38   66:invokevirtual   #112 <Method Response ApolloHttpCache.cacheProxy(Response, String)>
	//   39   69:areturn         
		} else
		{
			return ((Response) (chain));
	//   40   70:aload_2         
	//   41   71:areturn         
		}
	}

	private Response prefetch(Response response, String s)
		throws IOException
	{
		if(!response.isSuccessful())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #109 <Method boolean Response.isSuccessful()>
	//*   2    4:ifne            9
			return response;
	//    3    7:aload_1         
	//    4    8:areturn         
		cache.write(response, s);
	//    5    9:aload_0         
	//    6   10:getfield        #28  <Field ApolloHttpCache cache>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #151 <Method void ApolloHttpCache.write(Response, String)>
		response.close();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #154 <Method void Response.close()>
		s = ((String) (cache.read(s)));
	//   12   22:aload_0         
	//   13   23:getfield        #28  <Field ApolloHttpCache cache>
	//   14   26:aload_2         
	//   15   27:invokevirtual   #157 <Method Response ApolloHttpCache.read(String)>
	//   16   30:astore_2        
		if(s != null)
	//*  17   31:aload_2         
	//*  18   32:ifnull          70
		{
			if(!(s instanceof okhttp3.Response.Builder))
	//*  19   35:aload_2         
	//*  20   36:instanceof      #49  <Class okhttp3.Response$Builder>
	//*  21   39:ifne            50
				s = ((String) (((Response) (s)).newBuilder()));
	//   22   42:aload_2         
	//   23   43:invokevirtual   #55  <Method okhttp3.Response$Builder Response.newBuilder()>
	//   24   46:astore_2        
			else
	//*  25   47:goto            58
				s = ((String) (OkHttp3Instrumentation.newBuilder((okhttp3.Response.Builder)s)));
	//   26   50:aload_2         
	//   27   51:checkcast       #49  <Class okhttp3.Response$Builder>
	//   28   54:invokestatic    #60  <Method okhttp3.Response$Builder OkHttp3Instrumentation.newBuilder(okhttp3.Response$Builder)>
	//   29   57:astore_2        
			return ((okhttp3.Response.Builder) (s)).networkResponse(Utils.strip(response)).build();
	//   30   58:aload_2         
	//   31   59:aload_1         
	//   32   60:invokestatic    #66  <Method Response Utils.strip(Response)>
	//   33   63:invokevirtual   #146 <Method okhttp3.Response$Builder okhttp3.Response$Builder.networkResponse(Response)>
	//   34   66:invokevirtual   #78  <Method Response okhttp3.Response$Builder.build()>
	//   35   69:areturn         
		} else
		{
			throw new IOException("failed to read prefetch cache response");
	//   36   70:new             #39  <Class IOException>
	//   37   73:dup             
	//   38   74:ldc1            #159 <String "failed to read prefetch cache response">
	//   39   76:invokespecial   #162 <Method void IOException(String)>
	//   40   79:athrow          
		}
		s;
	//   41   80:astore_2        
		response.close();
	//   42   81:aload_1         
	//   43   82:invokevirtual   #154 <Method void Response.close()>
		throw s;
	//   44   85:aload_2         
	//   45   86:athrow          
	}

	public Response intercept(okhttp3.Interceptor.Chain chain)
		throws IOException
	{
		Request request = chain.request();
	//    0    0:aload_1         
	//    1    1:invokeinterface #167 <Method Request okhttp3.Interceptor$Chain.request()>
	//    2    6:astore_2        
		if(Utils.shouldSkipCache(request))
	//*   3    7:aload_2         
	//*   4    8:invokestatic    #170 <Method boolean Utils.shouldSkipCache(Request)>
	//*   5   11:ifeq            39
		{
			logger.d("Skip http cache for request: %s", new Object[] {
				request
			});
	//    6   14:aload_0         
	//    7   15:getfield        #34  <Field ApolloLogger logger>
	//    8   18:ldc1            #172 <String "Skip http cache for request: %s">
	//    9   20:iconst_1        
	//   10   21:anewarray       Object[]
	//   11   24:dup             
	//   12   25:iconst_0        
	//   13   26:aload_2         
	//   14   27:aastore         
	//   15   28:invokevirtual   #138 <Method void ApolloLogger.d(String, Object[])>
			return chain.proceed(request);
	//   16   31:aload_1         
	//   17   32:aload_2         
	//   18   33:invokeinterface #94  <Method Response okhttp3.Interceptor$Chain.proceed(Request)>
	//   19   38:areturn         
		}
		if(Utils.shouldSkipNetwork(request))
	//*  20   39:aload_2         
	//*  21   40:invokestatic    #175 <Method boolean Utils.shouldSkipNetwork(Request)>
	//*  22   43:ifeq            69
		{
			logger.d("Read http cache only for request: %s", new Object[] {
				request
			});
	//   23   46:aload_0         
	//   24   47:getfield        #34  <Field ApolloLogger logger>
	//   25   50:ldc1            #177 <String "Read http cache only for request: %s">
	//   26   52:iconst_1        
	//   27   53:anewarray       Object[]
	//   28   56:dup             
	//   29   57:iconst_0        
	//   30   58:aload_2         
	//   31   59:aastore         
	//   32   60:invokevirtual   #138 <Method void ApolloLogger.d(String, Object[])>
			return cacheOnlyResponse(request);
	//   33   63:aload_0         
	//   34   64:aload_2         
	//   35   65:invokespecial   #179 <Method Response cacheOnlyResponse(Request)>
	//   36   68:areturn         
		}
		if(Utils.isNetworkOnly(request))
	//*  37   69:aload_2         
	//*  38   70:invokestatic    #182 <Method boolean Utils.isNetworkOnly(Request)>
	//*  39   73:ifeq            100
		{
			logger.d("Skip http cache network only request: %s", new Object[] {
				request
			});
	//   40   76:aload_0         
	//   41   77:getfield        #34  <Field ApolloLogger logger>
	//   42   80:ldc1            #184 <String "Skip http cache network only request: %s">
	//   43   82:iconst_1        
	//   44   83:anewarray       Object[]
	//   45   86:dup             
	//   46   87:iconst_0        
	//   47   88:aload_2         
	//   48   89:aastore         
	//   49   90:invokevirtual   #138 <Method void ApolloLogger.d(String, Object[])>
			return networkOnly(request, chain);
	//   50   93:aload_0         
	//   51   94:aload_2         
	//   52   95:aload_1         
	//   53   96:invokespecial   #186 <Method Response networkOnly(Request, okhttp3.Interceptor$Chain)>
	//   54   99:areturn         
		}
		if(Utils.isNetworkFirst(request))
	//*  55  100:aload_2         
	//*  56  101:invokestatic    #189 <Method boolean Utils.isNetworkFirst(Request)>
	//*  57  104:ifeq            131
		{
			logger.d("Network first for request: %s", new Object[] {
				request
			});
	//   58  107:aload_0         
	//   59  108:getfield        #34  <Field ApolloLogger logger>
	//   60  111:ldc1            #191 <String "Network first for request: %s">
	//   61  113:iconst_1        
	//   62  114:anewarray       Object[]
	//   63  117:dup             
	//   64  118:iconst_0        
	//   65  119:aload_2         
	//   66  120:aastore         
	//   67  121:invokevirtual   #138 <Method void ApolloLogger.d(String, Object[])>
			return networkFirst(request, chain);
	//   68  124:aload_0         
	//   69  125:aload_2         
	//   70  126:aload_1         
	//   71  127:invokespecial   #193 <Method Response networkFirst(Request, okhttp3.Interceptor$Chain)>
	//   72  130:areturn         
		} else
		{
			logger.d("Cache first for request: %s", new Object[] {
				request
			});
	//   73  131:aload_0         
	//   74  132:getfield        #34  <Field ApolloLogger logger>
	//   75  135:ldc1            #195 <String "Cache first for request: %s">
	//   76  137:iconst_1        
	//   77  138:anewarray       Object[]
	//   78  141:dup             
	//   79  142:iconst_0        
	//   80  143:aload_2         
	//   81  144:aastore         
	//   82  145:invokevirtual   #138 <Method void ApolloLogger.d(String, Object[])>
			return cacheFirst(request, chain);
	//   83  148:aload_0         
	//   84  149:aload_2         
	//   85  150:aload_1         
	//   86  151:invokespecial   #197 <Method Response cacheFirst(Request, okhttp3.Interceptor$Chain)>
	//   87  154:areturn         
		}
	}

	private final ApolloHttpCache cache;
	private final ApolloLogger logger;
}
