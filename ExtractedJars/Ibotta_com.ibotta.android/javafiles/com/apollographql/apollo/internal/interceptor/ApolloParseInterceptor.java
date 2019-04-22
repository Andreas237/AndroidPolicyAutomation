// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.interceptor;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.cache.http.HttpCache;
import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloHttpException;
import com.apollographql.apollo.exception.ApolloParseException;
import com.apollographql.apollo.interceptor.ApolloInterceptor;
import com.apollographql.apollo.interceptor.ApolloInterceptorChain;
import com.apollographql.apollo.internal.ApolloLogger;
import com.apollographql.apollo.internal.cache.normalized.ResponseNormalizer;
import com.apollographql.apollo.response.OperationResponseParser;
import com.apollographql.apollo.response.ScalarTypeAdapters;
import java.io.Closeable;
import java.util.concurrent.Executor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public final class ApolloParseInterceptor
	implements ApolloInterceptor
{

	public ApolloParseInterceptor(HttpCache httpcache, ResponseNormalizer responsenormalizer, ResponseFieldMapper responsefieldmapper, ScalarTypeAdapters scalartypeadapters, ApolloLogger apollologger)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		httpCache = httpcache;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field HttpCache httpCache>
		normalizer = responsenormalizer;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #30  <Field ResponseNormalizer normalizer>
		responseFieldMapper = responsefieldmapper;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #32  <Field ResponseFieldMapper responseFieldMapper>
		scalarTypeAdapters = scalartypeadapters;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #34  <Field ScalarTypeAdapters scalarTypeAdapters>
		logger = apollologger;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #36  <Field ApolloLogger logger>
	//   17   31:return          
	}

	private static void closeQuietly(Closeable closeable)
	{
		if(closeable == null)
			break MISSING_BLOCK_LABEL_10;
	//    0    0:aload_0         
	//    1    1:ifnull          10
		closeable.close();
	//    2    4:aload_0         
	//    3    5:invokeinterface #48  <Method void Closeable.close()>
		return;
	//    4   10:return          
		closeable;
	//    5   11:astore_0        
	//    6   12:return          
	}

	public void dispose()
	{
		disposed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #51  <Field boolean disposed>
	//    3    5:return          
	}

	public void interceptAsync(final com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest request, ApolloInterceptorChain apollointerceptorchain, Executor executor, final com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack callBack)
	{
		if(disposed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field boolean disposed>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			apollointerceptorchain.proceedAsync(request, executor, new com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack() {

				public void onCompleted()
				{
				//    0    0:return          
				}

				public void onFailure(ApolloException apolloexception)
				{
					if(disposed)
				//*   0    0:aload_0         
				//*   1    1:getfield        #21  <Field ApolloParseInterceptor this$0>
				//*   2    4:getfield        #37  <Field boolean ApolloParseInterceptor.disposed>
				//*   3    7:ifeq            11
					{
						return;
				//    4   10:return          
					} else
					{
						callBack.onFailure(apolloexception);
				//    5   11:aload_0         
				//    6   12:getfield        #25  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
				//    7   15:aload_1         
				//    8   16:invokeinterface #39  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onFailure(ApolloException)>
						return;
				//    9   21:return          
					}
				}

				public void onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor.FetchSourceType fetchsourcetype)
				{
					callBack.onFetch(fetchsourcetype);
				//    0    0:aload_0         
				//    1    1:getfield        #25  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
				//    2    4:aload_1         
				//    3    5:invokeinterface #44  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType)>
				//    4   10:return          
				}

				public void onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse interceptorresponse)
				{
					if(disposed)
				//*   0    0:aload_0         
				//*   1    1:getfield        #21  <Field ApolloParseInterceptor this$0>
				//*   2    4:getfield        #37  <Field boolean ApolloParseInterceptor.disposed>
				//*   3    7:ifeq            11
						return;
				//    4   10:return          
					try
					{
						interceptorresponse = parse(request.operation, (Response)interceptorresponse.httpResponse.get());
				//    5   11:aload_0         
				//    6   12:getfield        #21  <Field ApolloParseInterceptor this$0>
				//    7   15:aload_0         
				//    8   16:getfield        #23  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
				//    9   19:getfield        #54  <Field Operation com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.operation>
				//   10   22:aload_1         
				//   11   23:getfield        #60  <Field Optional com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse.httpResponse>
				//   12   26:invokevirtual   #66  <Method Object Optional.get()>
				//   13   29:checkcast       #68  <Class Response>
				//   14   32:invokevirtual   #72  <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse ApolloParseInterceptor.parse(Operation, Response)>
				//   15   35:astore_1        
						callBack.onResponse(interceptorresponse);
				//   16   36:aload_0         
				//   17   37:getfield        #25  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
				//   18   40:aload_1         
				//   19   41:invokeinterface #74  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse)>
						callBack.onCompleted();
				//   20   46:aload_0         
				//   21   47:getfield        #25  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
				//   22   50:invokeinterface #76  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onCompleted()>
						return;
				//   23   55:return          
					}
					// Misplaced declaration of an exception variable
					catch(com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse interceptorresponse)
				//*  24   56:astore_1        
					{
						onFailure(((ApolloException) (interceptorresponse)));
				//   25   57:aload_0         
				//   26   58:aload_1         
				//   27   59:invokevirtual   #77  <Method void onFailure(ApolloException)>
					}
					return;
				//   28   62:return          
				}

				final ApolloParseInterceptor this$0;
				final com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack val$callBack;
				final com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest val$request;

			
			{
				this$0 = ApolloParseInterceptor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field ApolloParseInterceptor this$0>
				request = interceptorrequest;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
				callBack = callback;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:aload_3         
	//    7   11:new             #8   <Class ApolloParseInterceptor$1>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:aload           4
	//   12   19:invokespecial   #57  <Method void ApolloParseInterceptor$1(ApolloParseInterceptor, com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest, com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack)>
	//   13   22:invokeinterface #63  <Method void ApolloInterceptorChain.proceedAsync(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest, Executor, com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack)>
			return;
	//   14   27:return          
		}
	}

	com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse parse(Operation operation, Response response)
		throws ApolloHttpException, ApolloParseException
	{
		String s;
		s = response.request().header("X-APOLLO-CACHE-KEY");
	//    0    0:aload_2         
	//    1    1:invokevirtual   #76  <Method Request Response.request()>
	//    2    4:ldc1            #78  <String "X-APOLLO-CACHE-KEY">
	//    3    6:invokevirtual   #84  <Method String Request.header(String)>
	//    4    9:astore          4
		if(!response.isSuccessful())
			break MISSING_BLOCK_LABEL_178;
	//    5   11:aload_2         
	//    6   12:invokevirtual   #88  <Method boolean Response.isSuccessful()>
	//    7   15:ifeq            178
		Object obj = ((Object) ((new OperationResponseParser(operation, responseFieldMapper, scalarTypeAdapters, normalizer)).parse(response.body().source()).toBuilder()));
	//    8   18:new             #90  <Class OperationResponseParser>
	//    9   21:dup             
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:getfield        #32  <Field ResponseFieldMapper responseFieldMapper>
	//   13   27:aload_0         
	//   14   28:getfield        #34  <Field ScalarTypeAdapters scalarTypeAdapters>
	//   15   31:aload_0         
	//   16   32:getfield        #30  <Field ResponseNormalizer normalizer>
	//   17   35:invokespecial   #93  <Method void OperationResponseParser(Operation, ResponseFieldMapper, ScalarTypeAdapters, ResponseNormalizer)>
	//   18   38:aload_2         
	//   19   39:invokevirtual   #97  <Method ResponseBody Response.body()>
	//   20   42:invokevirtual   #103 <Method okio.BufferedSource ResponseBody.source()>
	//   21   45:invokevirtual   #106 <Method com.apollographql.apollo.api.Response OperationResponseParser.parse(okio.BufferedSource)>
	//   22   48:invokevirtual   #112 <Method com.apollographql.apollo.api.Response$Builder com.apollographql.apollo.api.Response.toBuilder()>
	//   23   51:astore          5
		boolean flag;
		if(response.cacheResponse() != null)
	//*  24   53:aload_2         
	//*  25   54:invokevirtual   #116 <Method Response Response.cacheResponse()>
	//*  26   57:ifnull          204
			flag = true;
	//   27   60:iconst_1        
	//   28   61:istore_3        
		else
	//*  29   62:goto            65
	//*  30   65:aload           5
	//*  31   67:iload_3         
	//*  32   68:invokevirtual   #122 <Method com.apollographql.apollo.api.Response$Builder com.apollographql.apollo.api.Response$Builder.fromCache(boolean)>
	//*  33   71:invokevirtual   #126 <Method com.apollographql.apollo.api.Response com.apollographql.apollo.api.Response$Builder.build()>
	//*  34   74:astore          5
	//*  35   76:aload           5
	//*  36   78:invokevirtual   #129 <Method boolean com.apollographql.apollo.api.Response.hasErrors()>
	//*  37   81:ifeq            102
	//*  38   84:aload_0         
	//*  39   85:getfield        #28  <Field HttpCache httpCache>
	//*  40   88:ifnull          102
	//*  41   91:aload_0         
	//*  42   92:getfield        #28  <Field HttpCache httpCache>
	//*  43   95:aload           4
	//*  44   97:invokeinterface #135 <Method void HttpCache.removeQuietly(String)>
	//*  45  102:new             #137 <Class com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse>
	//*  46  105:dup             
	//*  47  106:aload_2         
	//*  48  107:aload           5
	//*  49  109:aload_0         
	//*  50  110:getfield        #30  <Field ResponseNormalizer normalizer>
	//*  51  113:invokevirtual   #143 <Method java.util.Collection ResponseNormalizer.records()>
	//*  52  116:invokespecial   #146 <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse(Response, com.apollographql.apollo.api.Response, java.util.Collection)>
	//*  53  119:astore          5
	//*  54  121:aload           5
	//*  55  123:areturn         
	//*  56  124:astore          5
	//*  57  126:aload_0         
	//*  58  127:getfield        #36  <Field ApolloLogger logger>
	//*  59  130:aload           5
	//*  60  132:ldc1            #148 <String "Failed to parse network response for operation: %s">
	//*  61  134:iconst_1        
	//*  62  135:anewarray       Object[]
	//*  63  138:dup             
	//*  64  139:iconst_0        
	//*  65  140:aload_1         
	//*  66  141:aastore         
	//*  67  142:invokevirtual   #154 <Method void ApolloLogger.e(Throwable, String, Object[])>
	//*  68  145:aload_2         
	//*  69  146:invokestatic    #156 <Method void closeQuietly(Closeable)>
	//*  70  149:aload_0         
	//*  71  150:getfield        #28  <Field HttpCache httpCache>
	//*  72  153:astore_1        
	//*  73  154:aload_1         
	//*  74  155:ifnull          166
	//*  75  158:aload_1         
	//*  76  159:aload           4
	//*  77  161:invokeinterface #135 <Method void HttpCache.removeQuietly(String)>
	//*  78  166:new             #70  <Class ApolloParseException>
	//*  79  169:dup             
	//*  80  170:ldc1            #158 <String "Failed to parse http response">
	//*  81  172:aload           5
	//*  82  174:invokespecial   #161 <Method void ApolloParseException(String, Throwable)>
	//*  83  177:athrow          
	//*  84  178:aload_0         
	//*  85  179:getfield        #36  <Field ApolloLogger logger>
	//*  86  182:ldc1            #163 <String "Failed to parse network response: %s">
	//*  87  184:iconst_1        
	//*  88  185:anewarray       Object[]
	//*  89  188:dup             
	//*  90  189:iconst_0        
	//*  91  190:aload_2         
	//*  92  191:aastore         
	//*  93  192:invokevirtual   #166 <Method void ApolloLogger.e(String, Object[])>
	//*  94  195:new             #68  <Class ApolloHttpException>
	//*  95  198:dup             
	//*  96  199:aload_2         
	//*  97  200:invokespecial   #169 <Method void ApolloHttpException(Response)>
	//*  98  203:athrow          
			flag = false;
	//   99  204:iconst_0        
	//  100  205:istore_3        
		try
		{
			obj = ((Object) (((com.apollographql.apollo.api.Response.Builder) (obj)).fromCache(flag).build()));
			if(((com.apollographql.apollo.api.Response) (obj)).hasErrors() && httpCache != null)
				httpCache.removeQuietly(s);
			obj = ((Object) (new com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse(response, ((com.apollographql.apollo.api.Response) (obj)), normalizer.records())));
		}
		catch(Exception exception)
		{
			logger.e(((Throwable) (exception)), "Failed to parse network response for operation: %s", new Object[] {
				operation
			});
			closeQuietly(((Closeable) (response)));
			operation = ((Operation) (httpCache));
			if(operation != null)
				((HttpCache) (operation)).removeQuietly(s);
			throw new ApolloParseException("Failed to parse http response", ((Throwable) (exception)));
		}
		return ((com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse) (obj));
		logger.e("Failed to parse network response: %s", new Object[] {
			response
		});
		throw new ApolloHttpException(response);
	//* 101  206:goto            65
	}

	volatile boolean disposed;
	private final HttpCache httpCache;
	private final ApolloLogger logger;
	private final ResponseNormalizer normalizer;
	private final ResponseFieldMapper responseFieldMapper;
	private final ScalarTypeAdapters scalarTypeAdapters;
}
