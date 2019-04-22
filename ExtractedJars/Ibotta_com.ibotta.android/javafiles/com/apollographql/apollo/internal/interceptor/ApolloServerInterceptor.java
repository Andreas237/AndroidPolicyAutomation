// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.interceptor;

import com.apollographql.apollo.api.*;
import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.api.internal.Utils;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.interceptor.ApolloInterceptor;
import com.apollographql.apollo.interceptor.ApolloInterceptorChain;
import com.apollographql.apollo.internal.ApolloLogger;
import com.apollographql.apollo.internal.json.InputFieldJsonWriter;
import com.apollographql.apollo.internal.json.JsonWriter;
import com.apollographql.apollo.response.ScalarTypeAdapters;
import com.newrelic.agent.android.instrumentation.okhttp3.OkHttp3Instrumentation;
import java.io.IOException;
import java.util.concurrent.Executor;
import okhttp3.*;
import okio.Buffer;
import okio.ByteString;

public final class ApolloServerInterceptor
	implements ApolloInterceptor
{

	public ApolloServerInterceptor(HttpUrl httpurl, okhttp3.Call.Factory factory, com.apollographql.apollo.api.cache.http.HttpCachePolicy.Policy policy, boolean flag, ScalarTypeAdapters scalartypeadapters, ApolloLogger apollologger, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		serverUrl = (HttpUrl)Utils.checkNotNull(((Object) (httpurl)), "serverUrl == null");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #51  <String "serverUrl == null">
	//    5    8:invokestatic    #57  <Method Object Utils.checkNotNull(Object, Object)>
	//    6   11:checkcast       #59  <Class HttpUrl>
	//    7   14:putfield        #61  <Field HttpUrl serverUrl>
		httpCallFactory = (okhttp3.Call.Factory)Utils.checkNotNull(((Object) (factory)), "httpCallFactory == null");
	//    8   17:aload_0         
	//    9   18:aload_2         
	//   10   19:ldc1            #63  <String "httpCallFactory == null">
	//   11   21:invokestatic    #57  <Method Object Utils.checkNotNull(Object, Object)>
	//   12   24:checkcast       #65  <Class okhttp3.Call$Factory>
	//   13   27:putfield        #67  <Field okhttp3.Call$Factory httpCallFactory>
		cachePolicy = Optional.fromNullable(((Object) (policy)));
	//   14   30:aload_0         
	//   15   31:aload_3         
	//   16   32:invokestatic    #73  <Method Optional Optional.fromNullable(Object)>
	//   17   35:putfield        #75  <Field Optional cachePolicy>
		prefetch = flag;
	//   18   38:aload_0         
	//   19   39:iload           4
	//   20   41:putfield        #77  <Field boolean prefetch>
		scalarTypeAdapters = (ScalarTypeAdapters)Utils.checkNotNull(((Object) (scalartypeadapters)), "scalarTypeAdapters == null");
	//   21   44:aload_0         
	//   22   45:aload           5
	//   23   47:ldc1            #79  <String "scalarTypeAdapters == null">
	//   24   49:invokestatic    #57  <Method Object Utils.checkNotNull(Object, Object)>
	//   25   52:checkcast       #81  <Class ScalarTypeAdapters>
	//   26   55:putfield        #83  <Field ScalarTypeAdapters scalarTypeAdapters>
		logger = (ApolloLogger)Utils.checkNotNull(((Object) (apollologger)), "logger == null");
	//   27   58:aload_0         
	//   28   59:aload           6
	//   29   61:ldc1            #85  <String "logger == null">
	//   30   63:invokestatic    #57  <Method Object Utils.checkNotNull(Object, Object)>
	//   31   66:checkcast       #87  <Class ApolloLogger>
	//   32   69:putfield        #89  <Field ApolloLogger logger>
		sendOperationIdentifiers = flag1;
	//   33   72:aload_0         
	//   34   73:iload           7
	//   35   75:putfield        #91  <Field boolean sendOperationIdentifiers>
	//   36   78:return          
	}

	public static String cacheKey(RequestBody requestbody)
	{
		Buffer buffer = new Buffer();
	//    0    0:new             #98  <Class Buffer>
	//    1    3:dup             
	//    2    4:invokespecial   #99  <Method void Buffer()>
	//    3    7:astore_1        
		try
		{
			requestbody.writeTo(((okio.BufferedSink) (buffer)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #105 <Method void RequestBody.writeTo(okio.BufferedSink)>
		}
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #109 <Method ByteString Buffer.readByteString()>
	//*   9   17:invokevirtual   #114 <Method ByteString ByteString.md5()>
	//*  10   20:invokevirtual   #118 <Method String ByteString.hex()>
	//*  11   23:areturn         
		// Misplaced declaration of an exception variable
		catch(RequestBody requestbody)
	//*  12   24:astore_0        
		{
			throw new RuntimeException(((Throwable) (requestbody)));
	//   13   25:new             #120 <Class RuntimeException>
	//   14   28:dup             
	//   15   29:aload_0         
	//   16   30:invokespecial   #123 <Method void RuntimeException(Throwable)>
	//   17   33:athrow          
		}
		return buffer.readByteString().md5().hex();
	}

	private RequestBody httpRequestBody(Operation operation)
		throws IOException
	{
		Buffer buffer = new Buffer();
	//    0    0:new             #98  <Class Buffer>
	//    1    3:dup             
	//    2    4:invokespecial   #99  <Method void Buffer()>
	//    3    7:astore_2        
		JsonWriter jsonwriter = JsonWriter.of(((okio.BufferedSink) (buffer)));
	//    4    8:aload_2         
	//    5    9:invokestatic    #131 <Method JsonWriter JsonWriter.of(okio.BufferedSink)>
	//    6   12:astore_3        
		jsonwriter.setSerializeNulls(true);
	//    7   13:aload_3         
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #135 <Method void JsonWriter.setSerializeNulls(boolean)>
		jsonwriter.beginObject();
	//   10   18:aload_3         
	//   11   19:invokevirtual   #139 <Method JsonWriter JsonWriter.beginObject()>
	//   12   22:pop             
		if(sendOperationIdentifiers)
	//*  13   23:aload_0         
	//*  14   24:getfield        #91  <Field boolean sendOperationIdentifiers>
	//*  15   27:ifeq            49
			jsonwriter.name("id").value(operation.operationId());
	//   16   30:aload_3         
	//   17   31:ldc1            #141 <String "id">
	//   18   33:invokevirtual   #145 <Method JsonWriter JsonWriter.name(String)>
	//   19   36:aload_1         
	//   20   37:invokeinterface #150 <Method String Operation.operationId()>
	//   21   42:invokevirtual   #153 <Method JsonWriter JsonWriter.value(String)>
	//   22   45:pop             
		else
	//*  23   46:goto            72
			jsonwriter.name("query").value(operation.queryDocument().replaceAll("\\n", ""));
	//   24   49:aload_3         
	//   25   50:ldc1            #155 <String "query">
	//   26   52:invokevirtual   #145 <Method JsonWriter JsonWriter.name(String)>
	//   27   55:aload_1         
	//   28   56:invokeinterface #158 <Method String Operation.queryDocument()>
	//   29   61:ldc1            #160 <String "\\n">
	//   30   63:ldc1            #162 <String "">
	//   31   65:invokevirtual   #168 <Method String String.replaceAll(String, String)>
	//   32   68:invokevirtual   #153 <Method JsonWriter JsonWriter.value(String)>
	//   33   71:pop             
		jsonwriter.name("variables").beginObject();
	//   34   72:aload_3         
	//   35   73:ldc1            #170 <String "variables">
	//   36   75:invokevirtual   #145 <Method JsonWriter JsonWriter.name(String)>
	//   37   78:invokevirtual   #139 <Method JsonWriter JsonWriter.beginObject()>
	//   38   81:pop             
		operation.variables().marshaller().marshal(((com.apollographql.apollo.api.InputFieldWriter) (new InputFieldJsonWriter(jsonwriter, scalarTypeAdapters))));
	//   39   82:aload_1         
	//   40   83:invokeinterface #173 <Method com.apollographql.apollo.api.Operation$Variables Operation.variables()>
	//   41   88:invokevirtual   #179 <Method InputFieldMarshaller com.apollographql.apollo.api.Operation$Variables.marshaller()>
	//   42   91:new             #181 <Class InputFieldJsonWriter>
	//   43   94:dup             
	//   44   95:aload_3         
	//   45   96:aload_0         
	//   46   97:getfield        #83  <Field ScalarTypeAdapters scalarTypeAdapters>
	//   47  100:invokespecial   #184 <Method void InputFieldJsonWriter(JsonWriter, ScalarTypeAdapters)>
	//   48  103:invokeinterface #190 <Method void InputFieldMarshaller.marshal(com.apollographql.apollo.api.InputFieldWriter)>
		jsonwriter.endObject();
	//   49  108:aload_3         
	//   50  109:invokevirtual   #193 <Method JsonWriter JsonWriter.endObject()>
	//   51  112:pop             
		jsonwriter.endObject();
	//   52  113:aload_3         
	//   53  114:invokevirtual   #193 <Method JsonWriter JsonWriter.endObject()>
	//   54  117:pop             
		jsonwriter.close();
	//   55  118:aload_3         
	//   56  119:invokevirtual   #196 <Method void JsonWriter.close()>
		return RequestBody.create(MEDIA_TYPE, buffer.readByteString());
	//   57  122:getstatic       #42  <Field MediaType MEDIA_TYPE>
	//   58  125:aload_2         
	//   59  126:invokevirtual   #109 <Method ByteString Buffer.readByteString()>
	//   60  129:invokestatic    #200 <Method RequestBody RequestBody.create(MediaType, ByteString)>
	//   61  132:areturn         
	}

	public void dispose()
	{
		disposed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #204 <Field boolean disposed>
		Call call = httpCall;
	//    3    5:aload_0         
	//    4    6:getfield        #206 <Field Call httpCall>
	//    5    9:astore_1        
		if(call != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          20
			call.cancel();
	//    8   14:aload_1         
	//    9   15:invokeinterface #211 <Method void Call.cancel()>
		httpCall = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #206 <Field Call httpCall>
	//   13   25:return          
	}

	Call httpCall(Operation operation)
		throws IOException
	{
		RequestBody requestbody = httpRequestBody(operation);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #214 <Method RequestBody httpRequestBody(Operation)>
	//    3    5:astore_3        
		Object obj = ((Object) ((new okhttp3.Request.Builder()).url(serverUrl).post(requestbody).header("Accept", "application/json").header("CONTENT_TYPE", "application/json").header("X-APOLLO-OPERATION-ID", operation.operationId()).header("X-APOLLO-OPERATION-NAME", operation.name().name()).tag(((Object) (operation.operationId())))));
	//    4    6:new             #216 <Class okhttp3.Request$Builder>
	//    5    9:dup             
	//    6   10:invokespecial   #217 <Method void okhttp3.Request$Builder()>
	//    7   13:aload_0         
	//    8   14:getfield        #61  <Field HttpUrl serverUrl>
	//    9   17:invokevirtual   #221 <Method okhttp3.Request$Builder okhttp3.Request$Builder.url(HttpUrl)>
	//   10   20:aload_3         
	//   11   21:invokevirtual   #225 <Method okhttp3.Request$Builder okhttp3.Request$Builder.post(RequestBody)>
	//   12   24:ldc1            #227 <String "Accept">
	//   13   26:ldc1            #229 <String "application/json">
	//   14   28:invokevirtual   #233 <Method okhttp3.Request$Builder okhttp3.Request$Builder.header(String, String)>
	//   15   31:ldc1            #235 <String "CONTENT_TYPE">
	//   16   33:ldc1            #229 <String "application/json">
	//   17   35:invokevirtual   #233 <Method okhttp3.Request$Builder okhttp3.Request$Builder.header(String, String)>
	//   18   38:ldc1            #237 <String "X-APOLLO-OPERATION-ID">
	//   19   40:aload_1         
	//   20   41:invokeinterface #150 <Method String Operation.operationId()>
	//   21   46:invokevirtual   #233 <Method okhttp3.Request$Builder okhttp3.Request$Builder.header(String, String)>
	//   22   49:ldc1            #239 <String "X-APOLLO-OPERATION-NAME">
	//   23   51:aload_1         
	//   24   52:invokeinterface #242 <Method OperationName Operation.name()>
	//   25   57:invokeinterface #246 <Method String OperationName.name()>
	//   26   62:invokevirtual   #233 <Method okhttp3.Request$Builder okhttp3.Request$Builder.header(String, String)>
	//   27   65:aload_1         
	//   28   66:invokeinterface #150 <Method String Operation.operationId()>
	//   29   71:invokevirtual   #250 <Method okhttp3.Request$Builder okhttp3.Request$Builder.tag(Object)>
	//   30   74:astore_2        
		operation = ((Operation) (obj));
	//   31   75:aload_2         
	//   32   76:astore_1        
		if(cachePolicy.isPresent())
	//*  33   77:aload_0         
	//*  34   78:getfield        #75  <Field Optional cachePolicy>
	//*  35   81:invokevirtual   #254 <Method boolean Optional.isPresent()>
	//*  36   84:ifeq            162
		{
			operation = ((Operation) ((com.apollographql.apollo.api.cache.http.HttpCachePolicy.Policy)cachePolicy.get()));
	//   37   87:aload_0         
	//   38   88:getfield        #75  <Field Optional cachePolicy>
	//   39   91:invokevirtual   #258 <Method Object Optional.get()>
	//   40   94:checkcast       #260 <Class com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy>
	//   41   97:astore_1        
			operation = ((Operation) (((okhttp3.Request.Builder) (obj)).header("X-APOLLO-CACHE-KEY", cacheKey(requestbody)).header("X-APOLLO-CACHE-FETCH-STRATEGY", ((com.apollographql.apollo.api.cache.http.HttpCachePolicy.Policy) (operation)).fetchStrategy.name()).header("X-APOLLO-EXPIRE-TIMEOUT", String.valueOf(((com.apollographql.apollo.api.cache.http.HttpCachePolicy.Policy) (operation)).expireTimeoutMs())).header("X-APOLLO-EXPIRE-AFTER-READ", Boolean.toString(((com.apollographql.apollo.api.cache.http.HttpCachePolicy.Policy) (operation)).expireAfterRead)).header("X-APOLLO-PREFETCH", Boolean.toString(prefetch))));
	//   42   98:aload_2         
	//   43   99:ldc2            #262 <String "X-APOLLO-CACHE-KEY">
	//   44  102:aload_3         
	//   45  103:invokestatic    #264 <Method String cacheKey(RequestBody)>
	//   46  106:invokevirtual   #233 <Method okhttp3.Request$Builder okhttp3.Request$Builder.header(String, String)>
	//   47  109:ldc2            #266 <String "X-APOLLO-CACHE-FETCH-STRATEGY">
	//   48  112:aload_1         
	//   49  113:getfield        #270 <Field com.apollographql.apollo.api.cache.http.HttpCachePolicy$FetchStrategy com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy.fetchStrategy>
	//   50  116:invokevirtual   #273 <Method String com.apollographql.apollo.api.cache.http.HttpCachePolicy$FetchStrategy.name()>
	//   51  119:invokevirtual   #233 <Method okhttp3.Request$Builder okhttp3.Request$Builder.header(String, String)>
	//   52  122:ldc2            #275 <String "X-APOLLO-EXPIRE-TIMEOUT">
	//   53  125:aload_1         
	//   54  126:invokevirtual   #279 <Method long com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy.expireTimeoutMs()>
	//   55  129:invokestatic    #283 <Method String String.valueOf(long)>
	//   56  132:invokevirtual   #233 <Method okhttp3.Request$Builder okhttp3.Request$Builder.header(String, String)>
	//   57  135:ldc2            #285 <String "X-APOLLO-EXPIRE-AFTER-READ">
	//   58  138:aload_1         
	//   59  139:getfield        #288 <Field boolean com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy.expireAfterRead>
	//   60  142:invokestatic    #294 <Method String Boolean.toString(boolean)>
	//   61  145:invokevirtual   #233 <Method okhttp3.Request$Builder okhttp3.Request$Builder.header(String, String)>
	//   62  148:ldc2            #296 <String "X-APOLLO-PREFETCH">
	//   63  151:aload_0         
	//   64  152:getfield        #77  <Field boolean prefetch>
	//   65  155:invokestatic    #294 <Method String Boolean.toString(boolean)>
	//   66  158:invokevirtual   #233 <Method okhttp3.Request$Builder okhttp3.Request$Builder.header(String, String)>
	//   67  161:astore_1        
		}
		obj = ((Object) (httpCallFactory));
	//   68  162:aload_0         
	//   69  163:getfield        #67  <Field okhttp3.Call$Factory httpCallFactory>
	//   70  166:astore_2        
		if(!(operation instanceof okhttp3.Request.Builder))
	//*  71  167:aload_1         
	//*  72  168:instanceof      #216 <Class okhttp3.Request$Builder>
	//*  73  171:ifne            182
			operation = ((Operation) (((okhttp3.Request.Builder) (operation)).build()));
	//   74  174:aload_1         
	//   75  175:invokevirtual   #300 <Method okhttp3.Request okhttp3.Request$Builder.build()>
	//   76  178:astore_1        
		else
	//*  77  179:goto            190
			operation = ((Operation) (OkHttp3Instrumentation.build((okhttp3.Request.Builder)operation)));
	//   78  182:aload_1         
	//   79  183:checkcast       #216 <Class okhttp3.Request$Builder>
	//   80  186:invokestatic    #305 <Method okhttp3.Request OkHttp3Instrumentation.build(okhttp3.Request$Builder)>
	//   81  189:astore_1        
		if(!(obj instanceof OkHttpClient))
	//*  82  190:aload_2         
	//*  83  191:instanceof      #307 <Class OkHttpClient>
	//*  84  194:ifne            205
			return ((okhttp3.Call.Factory) (obj)).newCall(((okhttp3.Request) (operation)));
	//   85  197:aload_2         
	//   86  198:aload_1         
	//   87  199:invokeinterface #311 <Method Call okhttp3.Call$Factory.newCall(okhttp3.Request)>
	//   88  204:areturn         
		else
			return OkHttp3Instrumentation.newCall((OkHttpClient)obj, ((okhttp3.Request) (operation)));
	//   89  205:aload_2         
	//   90  206:checkcast       #307 <Class OkHttpClient>
	//   91  209:aload_1         
	//   92  210:invokestatic    #314 <Method Call OkHttp3Instrumentation.newCall(OkHttpClient, okhttp3.Request)>
	//   93  213:areturn         
	}

	public void interceptAsync(final com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest request, ApolloInterceptorChain apollointerceptorchain, Executor executor, final com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack callBack)
	{
		if(disposed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #204 <Field boolean disposed>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			executor.execute(new Runnable() {

				public void run()
				{
					callBack.onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor.FetchSourceType.NETWORK);
				//    0    0:aload_0         
				//    1    1:getfield        #25  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
				//    2    4:getstatic       #40  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType.NETWORK>
				//    3    7:invokeinterface #46  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType)>
					try
					{
						httpCall = httpCall(request.operation);
				//    4   12:aload_0         
				//    5   13:getfield        #23  <Field ApolloServerInterceptor this$0>
				//    6   16:aload_0         
				//    7   17:getfield        #23  <Field ApolloServerInterceptor this$0>
				//    8   20:aload_0         
				//    9   21:getfield        #27  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
				//   10   24:getfield        #52  <Field Operation com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.operation>
				//   11   27:invokevirtual   #56  <Method Call ApolloServerInterceptor.httpCall(Operation)>
				//   12   30:putfield        #59  <Field Call ApolloServerInterceptor.httpCall>
					}
				//*  13   33:aload_0         
				//*  14   34:getfield        #23  <Field ApolloServerInterceptor this$0>
				//*  15   37:getfield        #59  <Field Call ApolloServerInterceptor.httpCall>
				//*  16   40:new             #13  <Class ApolloServerInterceptor$1$1>
				//*  17   43:dup             
				//*  18   44:aload_0         
				//*  19   45:invokespecial   #62  <Method void ApolloServerInterceptor$1$1(ApolloServerInterceptor$1)>
				//*  20   48:invokeinterface #68  <Method void Call.enqueue(Callback)>
				//*  21   53:return          
					catch(IOException ioexception)
				//*  22   54:astore_1        
					{
						logger.e(((Throwable) (ioexception)), "Failed to prepare http call for operation %s", new Object[] {
							request.operation.name().name()
						});
				//   23   55:aload_0         
				//   24   56:getfield        #23  <Field ApolloServerInterceptor this$0>
				//   25   59:getfield        #72  <Field ApolloLogger ApolloServerInterceptor.logger>
				//   26   62:aload_1         
				//   27   63:ldc1            #74  <String "Failed to prepare http call for operation %s">
				//   28   65:iconst_1        
				//   29   66:anewarray       Object[]
				//   30   69:dup             
				//   31   70:iconst_0        
				//   32   71:aload_0         
				//   33   72:getfield        #27  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
				//   34   75:getfield        #52  <Field Operation com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.operation>
				//   35   78:invokeinterface #80  <Method OperationName Operation.name()>
				//   36   83:invokeinterface #85  <Method String OperationName.name()>
				//   37   88:aastore         
				//   38   89:invokevirtual   #91  <Method void ApolloLogger.e(Throwable, String, Object[])>
						callBack.onFailure(((com.apollographql.apollo.exception.ApolloException) (new ApolloNetworkException("Failed to prepare http call", ((Throwable) (ioexception))))));
				//   39   92:aload_0         
				//   40   93:getfield        #25  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
				//   41   96:new             #93  <Class ApolloNetworkException>
				//   42   99:dup             
				//   43  100:ldc1            #95  <String "Failed to prepare http call">
				//   44  102:aload_1         
				//   45  103:invokespecial   #98  <Method void ApolloNetworkException(String, Throwable)>
				//   46  106:invokeinterface #102 <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onFailure(com.apollographql.apollo.exception.ApolloException)>
						return;
				//   47  111:return          
					}
					httpCall.enqueue(new Callback() {

						public void onFailure(Call call, IOException ioexception)
						{
							if(disposed)
						//*   0    0:aload_0         
						//*   1    1:getfield        #17  <Field ApolloServerInterceptor$1 this$1>
						//*   2    4:getfield        #27  <Field ApolloServerInterceptor ApolloServerInterceptor$1.this$0>
						//*   3    7:getfield        #33  <Field boolean ApolloServerInterceptor.disposed>
						//*   4   10:ifeq            14
							{
								return;
						//    5   13:return          
							} else
							{
								logger.e(((Throwable) (ioexception)), "Failed to execute http call for operation %s", new Object[] {
									request.operation.name().name()
								});
						//    6   14:aload_0         
						//    7   15:getfield        #17  <Field ApolloServerInterceptor$1 this$1>
						//    8   18:getfield        #27  <Field ApolloServerInterceptor ApolloServerInterceptor$1.this$0>
						//    9   21:getfield        #37  <Field ApolloLogger ApolloServerInterceptor.logger>
						//   10   24:aload_2         
						//   11   25:ldc1            #39  <String "Failed to execute http call for operation %s">
						//   12   27:iconst_1        
						//   13   28:anewarray       Object[]
						//   14   31:dup             
						//   15   32:iconst_0        
						//   16   33:aload_0         
						//   17   34:getfield        #17  <Field ApolloServerInterceptor$1 this$1>
						//   18   37:getfield        #43  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest ApolloServerInterceptor$1.val$request>
						//   19   40:getfield        #49  <Field Operation com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.operation>
						//   20   43:invokeinterface #55  <Method OperationName Operation.name()>
						//   21   48:invokeinterface #60  <Method String OperationName.name()>
						//   22   53:aastore         
						//   23   54:invokevirtual   #66  <Method void ApolloLogger.e(Throwable, String, Object[])>
								callBack.onFailure(((com.apollographql.apollo.exception.ApolloException) (new ApolloNetworkException("Failed to execute http call", ((Throwable) (ioexception))))));
						//   24   57:aload_0         
						//   25   58:getfield        #17  <Field ApolloServerInterceptor$1 this$1>
						//   26   61:getfield        #70  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack ApolloServerInterceptor$1.val$callBack>
						//   27   64:new             #72  <Class ApolloNetworkException>
						//   28   67:dup             
						//   29   68:ldc1            #74  <String "Failed to execute http call">
						//   30   70:aload_2         
						//   31   71:invokespecial   #77  <Method void ApolloNetworkException(String, Throwable)>
						//   32   74:invokeinterface #82  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onFailure(com.apollographql.apollo.exception.ApolloException)>
								return;
						//   33   79:return          
							}
						}

						public void onResponse(Call call, Response response)
							throws IOException
						{
							if(disposed)
						//*   0    0:aload_0         
						//*   1    1:getfield        #17  <Field ApolloServerInterceptor$1 this$1>
						//*   2    4:getfield        #27  <Field ApolloServerInterceptor ApolloServerInterceptor$1.this$0>
						//*   3    7:getfield        #33  <Field boolean ApolloServerInterceptor.disposed>
						//*   4   10:ifeq            14
							{
								return;
						//    5   13:return          
							} else
							{
								callBack.onResponse(new com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse(response));
						//    6   14:aload_0         
						//    7   15:getfield        #17  <Field ApolloServerInterceptor$1 this$1>
						//    8   18:getfield        #70  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack ApolloServerInterceptor$1.val$callBack>
						//    9   21:new             #89  <Class com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse>
						//   10   24:dup             
						//   11   25:aload_2         
						//   12   26:invokespecial   #92  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse(Response)>
						//   13   29:invokeinterface #95  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse)>
								callBack.onCompleted();
						//   14   34:aload_0         
						//   15   35:getfield        #17  <Field ApolloServerInterceptor$1 this$1>
						//   16   38:getfield        #70  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack ApolloServerInterceptor$1.val$callBack>
						//   17   41:invokeinterface #98  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onCompleted()>
								return;
						//   18   46:return          
							}
						}

						final _cls1 this$1;

			
			{
				this$1 = _cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ApolloServerInterceptor$1 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
					}
);
				}

				final ApolloServerInterceptor this$0;
				final com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack val$callBack;
				final com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest val$request;

			
			{
				this$0 = ApolloServerInterceptor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field ApolloServerInterceptor this$0>
				callBack = callback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
				request = interceptorrequest;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #30  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    4    8:aload_3         
	//    5    9:new             #8   <Class ApolloServerInterceptor$1>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload           4
	//    9   16:aload_1         
	//   10   17:invokespecial   #319 <Method void ApolloServerInterceptor$1(ApolloServerInterceptor, com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack, com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest)>
	//   11   20:invokeinterface #325 <Method void Executor.execute(Runnable)>
			return;
	//   12   25:return          
		}
	}

	static final MediaType MEDIA_TYPE = MediaType.parse("application/json; charset=utf-8");
	final Optional cachePolicy;
	volatile boolean disposed;
	volatile Call httpCall;
	final okhttp3.Call.Factory httpCallFactory;
	final ApolloLogger logger;
	final boolean prefetch;
	final ScalarTypeAdapters scalarTypeAdapters;
	final boolean sendOperationIdentifiers;
	final HttpUrl serverUrl;

	static 
	{
	//    0    0:ldc1            #34  <String "application/json; charset=utf-8">
	//    1    2:invokestatic    #40  <Method MediaType MediaType.parse(String)>
	//    2    5:putstatic       #42  <Field MediaType MEDIA_TYPE>
	//*   3    8:return          
	}
}
