// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.http;

import com.apollographql.apollo.Logger;
import com.apollographql.apollo.api.cache.http.*;
import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.api.internal.Utils;
import com.apollographql.apollo.internal.ApolloLogger;
import com.newrelic.agent.android.instrumentation.okhttp3.OkHttp3Instrumentation;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;
import okio.*;

// Referenced classes of package com.apollographql.apollo.cache.http:
//			ResponseHeaderRecord, ResponseBodyProxy, HttpCacheInterceptor, CacheResponseBody, 
//			Utils

public final class ApolloHttpCache
	implements HttpCache
{

	public ApolloHttpCache(HttpCacheStore httpcachestore)
	{
		this(httpcachestore, ((Logger) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #19  <Method void ApolloHttpCache(HttpCacheStore, Logger)>
	//    4    6:return          
	}

	public ApolloHttpCache(HttpCacheStore httpcachestore, Logger logger1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		cacheStore = (HttpCacheStore)Utils.checkNotNull(((Object) (httpcachestore)), "cacheStore == null");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #27  <String "cacheStore == null">
	//    5    8:invokestatic    #33  <Method Object Utils.checkNotNull(Object, Object)>
	//    6   11:checkcast       #35  <Class HttpCacheStore>
	//    7   14:putfield        #37  <Field HttpCacheStore cacheStore>
		logger = new ApolloLogger(Optional.fromNullable(((Object) (logger1))));
	//    8   17:aload_0         
	//    9   18:new             #39  <Class ApolloLogger>
	//   10   21:dup             
	//   11   22:aload_2         
	//   12   23:invokestatic    #45  <Method Optional Optional.fromNullable(Object)>
	//   13   26:invokespecial   #48  <Method void ApolloLogger(Optional)>
	//   14   29:putfield        #50  <Field ApolloLogger logger>
	//   15   32:return          
	}

	private void abortQuietly(HttpCacheRecordEditor httpcacherecordeditor)
	{
		if(httpcacherecordeditor != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          26
			try
			{
				httpcacherecordeditor.abort();
	//    2    4:aload_1         
	//    3    5:invokeinterface #59  <Method void HttpCacheRecordEditor.abort()>
				return;
	//    4   10:return          
			}
			// Misplaced declaration of an exception variable
			catch(HttpCacheRecordEditor httpcacherecordeditor)
	//*   5   11:astore_1        
			{
				logger.w(((Throwable) (httpcacherecordeditor)), "Failed to abort cache record edit", new Object[0]);
	//    6   12:aload_0         
	//    7   13:getfield        #50  <Field ApolloLogger logger>
	//    8   16:aload_1         
	//    9   17:ldc1            #61  <String "Failed to abort cache record edit">
	//   10   19:iconst_0        
	//   11   20:anewarray       Object[]
	//   12   23:invokevirtual   #65  <Method void ApolloLogger.w(Throwable, String, Object[])>
			}
	//   13   26:return          
	}

	private void closeQuietly(Sink sink)
	{
		try
		{
			sink.close();
	//    0    0:aload_1         
	//    1    1:invokeinterface #72  <Method void Sink.close()>
			return;
	//    2    6:return          
		}
		// Misplaced declaration of an exception variable
		catch(Sink sink)
	//*   3    7:astore_1        
		{
			logger.w(((Throwable) (sink)), "Failed to close sink", new Object[0]);
	//    4    8:aload_0         
	//    5    9:getfield        #50  <Field ApolloLogger logger>
	//    6   12:aload_1         
	//    7   13:ldc1            #74  <String "Failed to close sink">
	//    8   15:iconst_0        
	//    9   16:anewarray       Object[]
	//   10   19:invokevirtual   #65  <Method void ApolloLogger.w(Throwable, String, Object[])>
		}
	//   11   22:return          
	}

	Response cacheProxy(Response response, String s)
	{
		HttpCacheRecordEditor httpcacherecordeditor = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		HttpCacheRecordEditor httpcacherecordeditor1 = cacheStore.cacheRecordEditor(s);
	//    2    2:aload_0         
	//    3    3:getfield        #37  <Field HttpCacheStore cacheStore>
	//    4    6:aload_2         
	//    5    7:invokeinterface #80  <Method HttpCacheRecordEditor HttpCacheStore.cacheRecordEditor(String)>
	//    6   12:astore          5
		if(httpcacherecordeditor1 == null)
			break MISSING_BLOCK_LABEL_199;
	//    7   14:aload           5
	//    8   16:ifnull          199
		httpcacherecordeditor = httpcacherecordeditor1;
	//    9   19:aload           5
	//   10   21:astore_3        
		Object obj = ((Object) (httpcacherecordeditor1.headerSink()));
	//   11   22:aload           5
	//   12   24:invokeinterface #84  <Method Sink HttpCacheRecordEditor.headerSink()>
	//   13   29:astore          4
		(new ResponseHeaderRecord(response)).writeTo(((Sink) (obj)));
	//   14   31:new             #86  <Class ResponseHeaderRecord>
	//   15   34:dup             
	//   16   35:aload_1         
	//   17   36:invokespecial   #89  <Method void ResponseHeaderRecord(Response)>
	//   18   39:aload           4
	//   19   41:invokevirtual   #92  <Method void ResponseHeaderRecord.writeTo(Sink)>
		httpcacherecordeditor = httpcacherecordeditor1;
	//   20   44:aload           5
	//   21   46:astore_3        
		closeQuietly(((Sink) (obj)));
	//   22   47:aload_0         
	//   23   48:aload           4
	//   24   50:invokespecial   #94  <Method void closeQuietly(Sink)>
		httpcacherecordeditor = httpcacherecordeditor1;
	//   25   53:aload           5
	//   26   55:astore_3        
		if(response instanceof okhttp3.Response.Builder)
			break MISSING_BLOCK_LABEL_75;
	//   27   56:aload_1         
	//   28   57:instanceof      #96  <Class okhttp3.Response$Builder>
	//   29   60:ifne            75
		httpcacherecordeditor = httpcacherecordeditor1;
	//   30   63:aload           5
	//   31   65:astore_3        
		obj = ((Object) (response.newBuilder()));
	//   32   66:aload_1         
	//   33   67:invokevirtual   #102 <Method okhttp3.Response$Builder Response.newBuilder()>
	//   34   70:astore          4
		break MISSING_BLOCK_LABEL_87;
	//   35   72:goto            87
		httpcacherecordeditor = httpcacherecordeditor1;
	//   36   75:aload           5
	//   37   77:astore_3        
		obj = ((Object) (OkHttp3Instrumentation.newBuilder((okhttp3.Response.Builder)response)));
	//   38   78:aload_1         
	//   39   79:checkcast       #96  <Class okhttp3.Response$Builder>
	//   40   82:invokestatic    #107 <Method okhttp3.Response$Builder OkHttp3Instrumentation.newBuilder(okhttp3.Response$Builder)>
	//   41   85:astore          4
		httpcacherecordeditor = httpcacherecordeditor1;
	//   42   87:aload           5
	//   43   89:astore_3        
		ResponseBodyProxy responsebodyproxy = new ResponseBodyProxy(httpcacherecordeditor1, response, logger);
	//   44   90:new             #109 <Class ResponseBodyProxy>
	//   45   93:dup             
	//   46   94:aload           5
	//   47   96:aload_1         
	//   48   97:aload_0         
	//   49   98:getfield        #50  <Field ApolloLogger logger>
	//   50  101:invokespecial   #112 <Method void ResponseBodyProxy(HttpCacheRecordEditor, Response, ApolloLogger)>
	//   51  104:astore          6
		httpcacherecordeditor = httpcacherecordeditor1;
	//   52  106:aload           5
	//   53  108:astore_3        
		if(obj instanceof okhttp3.Response.Builder)
			break MISSING_BLOCK_LABEL_132;
	//   54  109:aload           4
	//   55  111:instanceof      #96  <Class okhttp3.Response$Builder>
	//   56  114:ifne            132
		httpcacherecordeditor = httpcacherecordeditor1;
	//   57  117:aload           5
	//   58  119:astore_3        
		obj = ((Object) (((okhttp3.Response.Builder) (obj)).body(((okhttp3.ResponseBody) (responsebodyproxy)))));
	//   59  120:aload           4
	//   60  122:aload           6
	//   61  124:invokevirtual   #116 <Method okhttp3.Response$Builder okhttp3.Response$Builder.body(okhttp3.ResponseBody)>
	//   62  127:astore          4
		break MISSING_BLOCK_LABEL_147;
	//   63  129:goto            147
		httpcacherecordeditor = httpcacherecordeditor1;
	//   64  132:aload           5
	//   65  134:astore_3        
		obj = ((Object) (OkHttp3Instrumentation.body((okhttp3.Response.Builder)obj, ((okhttp3.ResponseBody) (responsebodyproxy)))));
	//   66  135:aload           4
	//   67  137:checkcast       #96  <Class okhttp3.Response$Builder>
	//   68  140:aload           6
	//   69  142:invokestatic    #119 <Method okhttp3.Response$Builder OkHttp3Instrumentation.body(okhttp3.Response$Builder, okhttp3.ResponseBody)>
	//   70  145:astore          4
		httpcacherecordeditor = httpcacherecordeditor1;
	//   71  147:aload           5
	//   72  149:astore_3        
		Exception exception1;
		try
		{
			return ((okhttp3.Response.Builder) (obj)).build();
	//   73  150:aload           4
	//   74  152:invokevirtual   #123 <Method Response okhttp3.Response$Builder.build()>
	//   75  155:areturn         
		}
	//*  76  156:astore          6
	//*  77  158:aload           5
	//*  78  160:astore_3        
	//*  79  161:aload_0         
	//*  80  162:aload           4
	//*  81  164:invokespecial   #94  <Method void closeQuietly(Sink)>
	//*  82  167:aload           5
	//*  83  169:astore_3        
	//*  84  170:aload           6
	//*  85  172:athrow          
		catch(Exception exception)
	//*  86  173:astore          4
		{
			abortQuietly(httpcacherecordeditor);
	//   87  175:aload_0         
	//   88  176:aload_3         
	//   89  177:invokespecial   #125 <Method void abortQuietly(HttpCacheRecordEditor)>
			logger.e(((Throwable) (exception)), "Failed to proxy http response for key: %s", new Object[] {
				s
			});
	//   90  180:aload_0         
	//   91  181:getfield        #50  <Field ApolloLogger logger>
	//   92  184:aload           4
	//   93  186:ldc1            #127 <String "Failed to proxy http response for key: %s">
	//   94  188:iconst_1        
	//   95  189:anewarray       Object[]
	//   96  192:dup             
	//   97  193:iconst_0        
	//   98  194:aload_2         
	//   99  195:aastore         
	//  100  196:invokevirtual   #130 <Method void ApolloLogger.e(Throwable, String, Object[])>
		}
		break MISSING_BLOCK_LABEL_199;
		exception1;
		httpcacherecordeditor = httpcacherecordeditor1;
		closeQuietly(((Sink) (obj)));
		httpcacherecordeditor = httpcacherecordeditor1;
		throw exception1;
		return response;
	//  101  199:aload_1         
	//  102  200:areturn         
	}

	public void clear()
	{
		try
		{
			cacheStore.delete();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field HttpCacheStore cacheStore>
	//    2    4:invokeinterface #136 <Method void HttpCacheStore.delete()>
			return;
	//    3    9:return          
		}
		catch(IOException ioexception)
	//*   4   10:astore_1        
		{
			logger.e(((Throwable) (ioexception)), "Failed to clear http cache", new Object[0]);
	//    5   11:aload_0         
	//    6   12:getfield        #50  <Field ApolloLogger logger>
	//    7   15:aload_1         
	//    8   16:ldc1            #138 <String "Failed to clear http cache">
	//    9   18:iconst_0        
	//   10   19:anewarray       Object[]
	//   11   22:invokevirtual   #130 <Method void ApolloLogger.e(Throwable, String, Object[])>
		}
	//   12   25:return          
	}

	void closeQuietly(HttpCacheRecord httpcacherecord)
	{
		if(httpcacherecord != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          26
			try
			{
				httpcacherecord.close();
	//    2    4:aload_1         
	//    3    5:invokeinterface #142 <Method void HttpCacheRecord.close()>
				return;
	//    4   10:return          
			}
			// Misplaced declaration of an exception variable
			catch(HttpCacheRecord httpcacherecord)
	//*   5   11:astore_1        
			{
				logger.w(((Throwable) (httpcacherecord)), "Failed to close cache record", new Object[0]);
	//    6   12:aload_0         
	//    7   13:getfield        #50  <Field ApolloLogger logger>
	//    8   16:aload_1         
	//    9   17:ldc1            #144 <String "Failed to close cache record">
	//   10   19:iconst_0        
	//   11   20:anewarray       Object[]
	//   12   23:invokevirtual   #65  <Method void ApolloLogger.w(Throwable, String, Object[])>
			}
	//   13   26:return          
	}

	public Interceptor interceptor()
	{
		return ((Interceptor) (new HttpCacheInterceptor(this, logger)));
	//    0    0:new             #148 <Class HttpCacheInterceptor>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #50  <Field ApolloLogger logger>
	//    5    9:invokespecial   #151 <Method void HttpCacheInterceptor(ApolloHttpCache, ApolloLogger)>
	//    6   12:areturn         
	}

	public Response read(String s)
	{
		return read(s, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #156 <Method Response read(String, boolean)>
	//    4    6:areturn         
	}

	public Response read(String s, boolean flag)
	{
		HttpCacheRecord httpcacherecord = cacheStore.cacheRecord(s);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field HttpCacheStore cacheStore>
	//    2    4:aload_1         
	//    3    5:invokeinterface #160 <Method HttpCacheRecord HttpCacheStore.cacheRecord(String)>
	//    4   10:astore          4
		Object obj;
		Exception exception;
		if(httpcacherecord == null)
	//*   5   12:aload           4
	//*   6   14:ifnonnull       19
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
		Object obj1;
		String s1;
		String s2;
		try
		{
			obj1 = ((Object) (new ForwardingSource(s) {

				public void close()
					throws IOException
				{
					super.close();
				//    0    0:aload_0         
				//    1    1:invokespecial   #37  <Method void ForwardingSource.close()>
					closeQuietly(cacheRecord);
				//    2    4:aload_0         
				//    3    5:getfield        #21  <Field ApolloHttpCache this$0>
				//    4    8:aload_0         
				//    5    9:getfield        #23  <Field HttpCacheRecord val$cacheRecord>
				//    6   12:invokevirtual   #41  <Method void ApolloHttpCache.closeQuietly(HttpCacheRecord)>
					if(expireAfterRead)
				//*   7   15:aload_0         
				//*   8   16:getfield        #25  <Field boolean val$expireAfterRead>
				//*   9   19:ifeq            33
						removeQuietly(cacheKey);
				//   10   22:aload_0         
				//   11   23:getfield        #21  <Field ApolloHttpCache this$0>
				//   12   26:aload_0         
				//   13   27:getfield        #27  <Field String val$cacheKey>
				//   14   30:invokevirtual   #45  <Method void ApolloHttpCache.removeQuietly(String)>
				//   15   33:return          
				}

				final ApolloHttpCache this$0;
				final String val$cacheKey;
				final HttpCacheRecord val$cacheRecord;
				final boolean val$expireAfterRead;

			
			{
				this$0 = ApolloHttpCache.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field ApolloHttpCache this$0>
				cacheRecord = httpcacherecord;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #23  <Field HttpCacheRecord val$cacheRecord>
				expireAfterRead = flag;
			//    6   10:aload_0         
			//    7   11:iload           4
			//    8   13:putfield        #25  <Field boolean val$expireAfterRead>
				cacheKey = s;
			//    9   16:aload_0         
			//   10   17:aload           5
			//   11   19:putfield        #27  <Field String val$cacheKey>
				super(final_source);
			//   12   22:aload_0         
			//   13   23:aload_2         
			//   14   24:invokespecial   #30  <Method void ForwardingSource(Source)>
			//   15   27:return          
			}
			}
));
	//    9   19:new             #8   <Class ApolloHttpCache$1>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:aload           4
	//   13   26:invokeinterface #164 <Method Source HttpCacheRecord.bodySource()>
	//   14   31:aload           4
	//   15   33:iload_2         
	//   16   34:aload_1         
	//   17   35:invokespecial   #167 <Method void ApolloHttpCache$1(ApolloHttpCache, Source, HttpCacheRecord, boolean, String)>
	//   18   38:astore          5
			obj = ((Object) ((new ResponseHeaderRecord(httpcacherecord.headerSource())).response()));
	//   19   40:new             #86  <Class ResponseHeaderRecord>
	//   20   43:dup             
	//   21   44:aload           4
	//   22   46:invokeinterface #170 <Method Source HttpCacheRecord.headerSource()>
	//   23   51:invokespecial   #173 <Method void ResponseHeaderRecord(Source)>
	//   24   54:invokevirtual   #176 <Method Response ResponseHeaderRecord.response()>
	//   25   57:astore_3        
			s1 = ((Response) (obj)).header("Content-Type");
	//   26   58:aload_3         
	//   27   59:ldc1            #178 <String "Content-Type">
	//   28   61:invokevirtual   #182 <Method String Response.header(String)>
	//   29   64:astore          6
			s2 = ((Response) (obj)).header("Content-Length");
	//   30   66:aload_3         
	//   31   67:ldc1            #184 <String "Content-Length">
	//   32   69:invokevirtual   #182 <Method String Response.header(String)>
	//   33   72:astore          7
			if(!(obj instanceof okhttp3.Response.Builder))
	//*  34   74:aload_3         
	//*  35   75:instanceof      #96  <Class okhttp3.Response$Builder>
	//*  36   78:ifne            89
			{
				obj = ((Object) (((Response) (obj)).newBuilder()));
	//   37   81:aload_3         
	//   38   82:invokevirtual   #102 <Method okhttp3.Response$Builder Response.newBuilder()>
	//   39   85:astore_3        
				break MISSING_BLOCK_LABEL_97;
	//   40   86:goto            97
			}
		}
	//*  41   89:aload_3         
	//*  42   90:checkcast       #96  <Class okhttp3.Response$Builder>
	//*  43   93:invokestatic    #107 <Method okhttp3.Response$Builder OkHttp3Instrumentation.newBuilder(okhttp3.Response$Builder)>
	//*  44   96:astore_3        
	//*  45   97:new             #186 <Class CacheResponseBody>
	//*  46  100:dup             
	//*  47  101:aload           5
	//*  48  103:aload           6
	//*  49  105:aload           7
	//*  50  107:invokespecial   #189 <Method void CacheResponseBody(Source, String, String)>
	//*  51  110:astore          5
	//*  52  112:aload_3         
	//*  53  113:instanceof      #96  <Class okhttp3.Response$Builder>
	//*  54  116:ifne            129
	//*  55  119:aload_3         
	//*  56  120:aload           5
	//*  57  122:invokevirtual   #116 <Method okhttp3.Response$Builder okhttp3.Response$Builder.body(okhttp3.ResponseBody)>
	//*  58  125:astore_3        
	//*  59  126:goto            139
	//*  60  129:aload_3         
	//*  61  130:checkcast       #96  <Class okhttp3.Response$Builder>
	//*  62  133:aload           5
	//*  63  135:invokestatic    #119 <Method okhttp3.Response$Builder OkHttp3Instrumentation.body(okhttp3.Response$Builder, okhttp3.ResponseBody)>
	//*  64  138:astore_3        
	//*  65  139:aload_3         
	//*  66  140:invokevirtual   #123 <Method Response okhttp3.Response$Builder.build()>
	//*  67  143:astore_3        
	//*  68  144:aload_3         
	//*  69  145:areturn         
		catch(Exception exception1)
	//*  70  146:astore          5
		{
			obj = ((Object) (httpcacherecord));
	//   71  148:aload           4
	//   72  150:astore_3        
			exception = exception1;
	//   73  151:aload           5
	//   74  153:astore          4
			break MISSING_BLOCK_LABEL_162;
	//   75  155:goto            162
		}
		obj = ((Object) (OkHttp3Instrumentation.newBuilder((okhttp3.Response.Builder)obj)));
		obj1 = ((Object) (new CacheResponseBody(((Source) (obj1)), s1, s2)));
		if(!(obj instanceof okhttp3.Response.Builder))
		{
			obj = ((Object) (((okhttp3.Response.Builder) (obj)).body(((okhttp3.ResponseBody) (obj1)))));
			break MISSING_BLOCK_LABEL_139;
		}
		obj = ((Object) (OkHttp3Instrumentation.body((okhttp3.Response.Builder)obj, ((okhttp3.ResponseBody) (obj1)))));
		obj = ((Object) (((okhttp3.Response.Builder) (obj)).build()));
		return ((Response) (obj));
		exception;
	//   76  158:astore          4
		obj = null;
	//   77  160:aconst_null     
	//   78  161:astore_3        
		closeQuietly(((HttpCacheRecord) (obj)));
	//   79  162:aload_0         
	//   80  163:aload_3         
	//   81  164:invokevirtual   #191 <Method void closeQuietly(HttpCacheRecord)>
		logger.e(((Throwable) (exception)), "Failed to read http cache entry for key: %s", new Object[] {
			s
		});
	//   82  167:aload_0         
	//   83  168:getfield        #50  <Field ApolloLogger logger>
	//   84  171:aload           4
	//   85  173:ldc1            #193 <String "Failed to read http cache entry for key: %s">
	//   86  175:iconst_1        
	//   87  176:anewarray       Object[]
	//   88  179:dup             
	//   89  180:iconst_0        
	//   90  181:aload_1         
	//   91  182:aastore         
	//   92  183:invokevirtual   #130 <Method void ApolloLogger.e(Throwable, String, Object[])>
		return null;
	//   93  186:aconst_null     
	//   94  187:areturn         
	}

	public void remove(String s)
		throws IOException
	{
		cacheStore.remove(s);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field HttpCacheStore cacheStore>
	//    2    4:aload_1         
	//    3    5:invokeinterface #197 <Method void HttpCacheStore.remove(String)>
	//    4   10:return          
	}

	public void removeQuietly(String s)
	{
		try
		{
			remove(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #200 <Method void remove(String)>
			return;
	//    3    5:return          
		}
		catch(Exception exception)
	//*   4    6:astore_2        
		{
			logger.w(((Throwable) (exception)), "Failed to remove cached record for key: %s", new Object[] {
				s
			});
	//    5    7:aload_0         
	//    6    8:getfield        #50  <Field ApolloLogger logger>
	//    7   11:aload_2         
	//    8   12:ldc1            #202 <String "Failed to remove cached record for key: %s">
	//    9   14:iconst_1        
	//   10   15:anewarray       Object[]
	//   11   18:dup             
	//   12   19:iconst_0        
	//   13   20:aload_1         
	//   14   21:aastore         
	//   15   22:invokevirtual   #65  <Method void ApolloLogger.w(Throwable, String, Object[])>
		}
	//   16   25:return          
	}

	void write(Response response, String s)
	{
		HttpCacheRecordEditor httpcacherecordeditor = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		HttpCacheRecordEditor httpcacherecordeditor1 = cacheStore.cacheRecordEditor(s);
	//    2    2:aload_0         
	//    3    3:getfield        #37  <Field HttpCacheStore cacheStore>
	//    4    6:aload_2         
	//    5    7:invokeinterface #80  <Method HttpCacheRecordEditor HttpCacheStore.cacheRecordEditor(String)>
	//    6   12:astore          4
		if(httpcacherecordeditor1 == null)
			break MISSING_BLOCK_LABEL_145;
	//    7   14:aload           4
	//    8   16:ifnull          145
		httpcacherecordeditor = httpcacherecordeditor1;
	//    9   19:aload           4
	//   10   21:astore_3        
		Sink sink = httpcacherecordeditor1.headerSink();
	//   11   22:aload           4
	//   12   24:invokeinterface #84  <Method Sink HttpCacheRecordEditor.headerSink()>
	//   13   29:astore          5
		(new ResponseHeaderRecord(response)).writeTo(sink);
	//   14   31:new             #86  <Class ResponseHeaderRecord>
	//   15   34:dup             
	//   16   35:aload_1         
	//   17   36:invokespecial   #89  <Method void ResponseHeaderRecord(Response)>
	//   18   39:aload           5
	//   19   41:invokevirtual   #92  <Method void ResponseHeaderRecord.writeTo(Sink)>
		httpcacherecordeditor = httpcacherecordeditor1;
	//   20   44:aload           4
	//   21   46:astore_3        
		closeQuietly(sink);
	//   22   47:aload_0         
	//   23   48:aload           5
	//   24   50:invokespecial   #94  <Method void closeQuietly(Sink)>
		httpcacherecordeditor = httpcacherecordeditor1;
	//   25   53:aload           4
	//   26   55:astore_3        
		sink = httpcacherecordeditor1.bodySink();
	//   27   56:aload           4
	//   28   58:invokeinterface #207 <Method Sink HttpCacheRecordEditor.bodySink()>
	//   29   63:astore          5
		Utils.copyResponseBody(response, sink);
	//   30   65:aload_1         
	//   31   66:aload           5
	//   32   68:invokestatic    #213 <Method void Utils.copyResponseBody(Response, Sink)>
		httpcacherecordeditor = httpcacherecordeditor1;
	//   33   71:aload           4
	//   34   73:astore_3        
		closeQuietly(sink);
	//   35   74:aload_0         
	//   36   75:aload           5
	//   37   77:invokespecial   #94  <Method void closeQuietly(Sink)>
		httpcacherecordeditor = httpcacherecordeditor1;
	//   38   80:aload           4
	//   39   82:astore_3        
		try
		{
			httpcacherecordeditor1.commit();
	//   40   83:aload           4
	//   41   85:invokeinterface #216 <Method void HttpCacheRecordEditor.commit()>
			return;
	//   42   90:return          
		}
	//*  43   91:astore_1        
	//*  44   92:aload           4
	//*  45   94:astore_3        
	//*  46   95:aload_0         
	//*  47   96:aload           5
	//*  48   98:invokespecial   #94  <Method void closeQuietly(Sink)>
	//*  49  101:aload           4
	//*  50  103:astore_3        
	//*  51  104:aload_1         
	//*  52  105:athrow          
	//*  53  106:astore_1        
	//*  54  107:aload           4
	//*  55  109:astore_3        
	//*  56  110:aload_0         
	//*  57  111:aload           5
	//*  58  113:invokespecial   #94  <Method void closeQuietly(Sink)>
	//*  59  116:aload           4
	//*  60  118:astore_3        
	//*  61  119:aload_1         
	//*  62  120:athrow          
		// Misplaced declaration of an exception variable
		catch(Response response)
	//*  63  121:astore_1        
		{
			abortQuietly(httpcacherecordeditor);
	//   64  122:aload_0         
	//   65  123:aload_3         
	//   66  124:invokespecial   #125 <Method void abortQuietly(HttpCacheRecordEditor)>
		}
		break MISSING_BLOCK_LABEL_127;
		response;
		httpcacherecordeditor = httpcacherecordeditor1;
		closeQuietly(sink);
		httpcacherecordeditor = httpcacherecordeditor1;
		throw response;
		response;
		httpcacherecordeditor = httpcacherecordeditor1;
		closeQuietly(sink);
		httpcacherecordeditor = httpcacherecordeditor1;
		throw response;
		logger.e(((Throwable) (response)), "Failed to cache http response for key: %s", new Object[] {
			s
		});
	//   67  127:aload_0         
	//   68  128:getfield        #50  <Field ApolloLogger logger>
	//   69  131:aload_1         
	//   70  132:ldc1            #218 <String "Failed to cache http response for key: %s">
	//   71  134:iconst_1        
	//   72  135:anewarray       Object[]
	//   73  138:dup             
	//   74  139:iconst_0        
	//   75  140:aload_2         
	//   76  141:aastore         
	//   77  142:invokevirtual   #130 <Method void ApolloLogger.e(Throwable, String, Object[])>
	//   78  145:return          
	}

	private final HttpCacheStore cacheStore;
	private final ApolloLogger logger;
}
