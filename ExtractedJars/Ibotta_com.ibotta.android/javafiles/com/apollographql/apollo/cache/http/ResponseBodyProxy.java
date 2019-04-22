// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.http;

import com.apollographql.apollo.api.cache.http.HttpCacheRecordEditor;
import com.apollographql.apollo.api.internal.Utils;
import com.apollographql.apollo.internal.ApolloLogger;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.*;
import okhttp3.internal.Util;
import okio.*;

// Referenced classes of package com.apollographql.apollo.cache.http:
//			ResponseBodyCacheSink

final class ResponseBodyProxy extends ResponseBody
{
	private static class ProxySource
		implements Source
	{

		private void commitCache()
		{
			try
			{
				responseBodyCacheSink.close();
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field ResponseBodyCacheSink responseBodyCacheSink>
		//    2    4:invokevirtual   #58  <Method void ResponseBodyCacheSink.close()>
				cacheRecordEditor.commit();
		//    3    7:aload_0         
		//    4    8:getfield        #28  <Field HttpCacheRecordEditor cacheRecordEditor>
		//    5   11:invokeinterface #61  <Method void HttpCacheRecordEditor.commit()>
				return;
		//    6   16:return          
			}
			catch(Exception exception)
		//*   7   17:astore_1        
			{
				Util.closeQuietly(((java.io.Closeable) (responseBodyCacheSink)));
		//    8   18:aload_0         
		//    9   19:getfield        #49  <Field ResponseBodyCacheSink responseBodyCacheSink>
		//   10   22:invokestatic    #67  <Method void Util.closeQuietly(java.io.Closeable)>
				abortCacheQuietly();
		//   11   25:aload_0         
		//   12   26:invokevirtual   #70  <Method void abortCacheQuietly()>
				logger.e(((Throwable) (exception)), "Failed to commit cache changes", new Object[0]);
		//   13   29:aload_0         
		//   14   30:getfield        #32  <Field ApolloLogger logger>
		//   15   33:aload_1         
		//   16   34:ldc1            #72  <String "Failed to commit cache changes">
		//   17   36:iconst_0        
		//   18   37:anewarray       Object[]
		//   19   40:invokevirtual   #78  <Method void ApolloLogger.e(Throwable, String, Object[])>
				return;
		//   20   43:return          
			}
		}

		void abortCacheQuietly()
		{
			Util.closeQuietly(((java.io.Closeable) (responseBodyCacheSink)));
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field ResponseBodyCacheSink responseBodyCacheSink>
		//    2    4:invokestatic    #67  <Method void Util.closeQuietly(java.io.Closeable)>
			try
			{
				cacheRecordEditor.abort();
		//    3    7:aload_0         
		//    4    8:getfield        #28  <Field HttpCacheRecordEditor cacheRecordEditor>
		//    5   11:invokeinterface #81  <Method void HttpCacheRecordEditor.abort()>
				return;
		//    6   16:return          
			}
			catch(Exception exception)
		//*   7   17:astore_1        
			{
				logger.w(((Throwable) (exception)), "Failed to abort cache edit", new Object[0]);
		//    8   18:aload_0         
		//    9   19:getfield        #32  <Field ApolloLogger logger>
		//   10   22:aload_1         
		//   11   23:ldc1            #83  <String "Failed to abort cache edit">
		//   12   25:iconst_0        
		//   13   26:anewarray       Object[]
		//   14   29:invokevirtual   #86  <Method void ApolloLogger.w(Throwable, String, Object[])>
			}
		//   15   32:return          
		}

		public void close()
			throws IOException
		{
			if(closed)
		//*   0    0:aload_0         
		//*   1    1:getfield        #90  <Field boolean closed>
		//*   2    4:ifeq            8
				return;
		//    3    7:return          
			closed = true;
		//    4    8:aload_0         
		//    5    9:iconst_1        
		//    6   10:putfield        #90  <Field boolean closed>
			if(Util.discard(((Source) (this)), 100, TimeUnit.MILLISECONDS))
		//*   7   13:aload_0         
		//*   8   14:bipush          100
		//*   9   16:getstatic       #96  <Field TimeUnit TimeUnit.MILLISECONDS>
		//*  10   19:invokestatic    #100 <Method boolean Util.discard(Source, int, TimeUnit)>
		//*  11   22:ifeq            39
			{
				responseBodySource.close();
		//   12   25:aload_0         
		//   13   26:getfield        #30  <Field Source responseBodySource>
		//   14   29:invokeinterface #101 <Method void Source.close()>
				commitCache();
		//   15   34:aload_0         
		//   16   35:invokespecial   #103 <Method void commitCache()>
				return;
		//   17   38:return          
			} else
			{
				responseBodySource.close();
		//   18   39:aload_0         
		//   19   40:getfield        #30  <Field Source responseBodySource>
		//   20   43:invokeinterface #101 <Method void Source.close()>
				abortCacheQuietly();
		//   21   48:aload_0         
		//   22   49:invokevirtual   #70  <Method void abortCacheQuietly()>
				return;
		//   23   52:return          
			}
		}

		public long read(Buffer buffer, long l)
			throws IOException
		{
			try
			{
				l = responseBodySource.read(buffer, l);
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field Source responseBodySource>
		//    2    4:aload_1         
		//    3    5:lload_2         
		//    4    6:invokeinterface #108 <Method long Source.read(Buffer, long)>
		//    5   11:lstore_2        
			}
		//*   6   12:lload_2         
		//*   7   13:ldc2w           #109 <Long -1L>
		//*   8   16:lcmp            
		//*   9   17:ifne            40
		//*  10   20:aload_0         
		//*  11   21:getfield        #90  <Field boolean closed>
		//*  12   24:ifne            36
		//*  13   27:aload_0         
		//*  14   28:iconst_1        
		//*  15   29:putfield        #90  <Field boolean closed>
		//*  16   32:aload_0         
		//*  17   33:invokespecial   #103 <Method void commitCache()>
		//*  18   36:ldc2w           #109 <Long -1L>
		//*  19   39:lreturn         
		//*  20   40:aload_0         
		//*  21   41:getfield        #49  <Field ResponseBodyCacheSink responseBodyCacheSink>
		//*  22   44:aload_1         
		//*  23   45:aload_1         
		//*  24   46:invokevirtual   #116 <Method long Buffer.size()>
		//*  25   49:lload_2         
		//*  26   50:lsub            
		//*  27   51:lload_2         
		//*  28   52:invokevirtual   #120 <Method void ResponseBodyCacheSink.copyFrom(Buffer, long, long)>
		//*  29   55:lload_2         
		//*  30   56:lreturn         
			// Misplaced declaration of an exception variable
			catch(Buffer buffer)
		//*  31   57:astore_1        
			{
				if(!closed)
		//*  32   58:aload_0         
		//*  33   59:getfield        #90  <Field boolean closed>
		//*  34   62:ifne            74
				{
					closed = true;
		//   35   65:aload_0         
		//   36   66:iconst_1        
		//   37   67:putfield        #90  <Field boolean closed>
					abortCacheQuietly();
		//   38   70:aload_0         
		//   39   71:invokevirtual   #70  <Method void abortCacheQuietly()>
				}
				throw buffer;
		//   40   74:aload_1         
		//   41   75:athrow          
			}
			if(l == -1L)
			{
				if(!closed)
				{
					closed = true;
					commitCache();
				}
				return -1L;
			} else
			{
				responseBodyCacheSink.copyFrom(buffer, buffer.size() - l, l);
				return l;
			}
		}

		public Timeout timeout()
		{
			return responseBodySource.timeout();
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field Source responseBodySource>
		//    2    4:invokeinterface #124 <Method Timeout Source.timeout()>
		//    3    9:areturn         
		}

		final HttpCacheRecordEditor cacheRecordEditor;
		boolean closed;
		final ApolloLogger logger;
		final ResponseBodyCacheSink responseBodyCacheSink;
		final Source responseBodySource;

		ProxySource(HttpCacheRecordEditor httpcacherecordeditor, Source source1, ApolloLogger apollologger)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			cacheRecordEditor = httpcacherecordeditor;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #28  <Field HttpCacheRecordEditor cacheRecordEditor>
			responseBodySource = source1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #30  <Field Source responseBodySource>
			logger = apollologger;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #32  <Field ApolloLogger logger>
			responseBodyCacheSink = ((ResponseBodyCacheSink) (((_cls1) (Okio.buffer(httpcacherecordeditor.bodySink()))). new _cls1(apollologger)));
		//   11   19:aload_0         
		//   12   20:new             #11  <Class ResponseBodyProxy$ProxySource$1>
		//   13   23:dup             
		//   14   24:aload_0         
		//   15   25:aload_1         
		//   16   26:invokeinterface #38  <Method okio.Sink HttpCacheRecordEditor.bodySink()>
		//   17   31:invokestatic    #44  <Method BufferedSink Okio.buffer(okio.Sink)>
		//   18   34:aload_3         
		//   19   35:invokespecial   #47  <Method void ResponseBodyProxy$ProxySource$1(ResponseBodyProxy$ProxySource, BufferedSink, ApolloLogger)>
		//   20   38:putfield        #49  <Field ResponseBodyCacheSink responseBodyCacheSink>
		//   21   41:return          
		}
	}


	ResponseBodyProxy(HttpCacheRecordEditor httpcacherecordeditor, Response response, ApolloLogger apollologger)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void ResponseBody()>
		Utils.checkNotNull(((Object) (httpcacherecordeditor)), "cacheRecordEditor == null");
	//    2    4:aload_1         
	//    3    5:ldc1            #22  <String "cacheRecordEditor == null">
	//    4    7:invokestatic    #28  <Method Object Utils.checkNotNull(Object, Object)>
	//    5   10:pop             
		Utils.checkNotNull(((Object) (response)), "sourceResponse == null");
	//    6   11:aload_2         
	//    7   12:ldc1            #30  <String "sourceResponse == null">
	//    8   14:invokestatic    #28  <Method Object Utils.checkNotNull(Object, Object)>
	//    9   17:pop             
		Utils.checkNotNull(((Object) (apollologger)), "logger == null");
	//   10   18:aload_3         
	//   11   19:ldc1            #32  <String "logger == null">
	//   12   21:invokestatic    #28  <Method Object Utils.checkNotNull(Object, Object)>
	//   13   24:pop             
		contentType = response.header("Content-Type");
	//   14   25:aload_0         
	//   15   26:aload_2         
	//   16   27:ldc1            #34  <String "Content-Type">
	//   17   29:invokevirtual   #40  <Method String Response.header(String)>
	//   18   32:putfield        #42  <Field String contentType>
		contentLength = response.header("Content-Length");
	//   19   35:aload_0         
	//   20   36:aload_2         
	//   21   37:ldc1            #44  <String "Content-Length">
	//   22   39:invokevirtual   #40  <Method String Response.header(String)>
	//   23   42:putfield        #46  <Field String contentLength>
		responseBodySource = ((Source) (new ProxySource(httpcacherecordeditor, ((Source) (response.body().source())), apollologger)));
	//   24   45:aload_0         
	//   25   46:new             #6   <Class ResponseBodyProxy$ProxySource>
	//   26   49:dup             
	//   27   50:aload_1         
	//   28   51:aload_2         
	//   29   52:invokevirtual   #50  <Method ResponseBody Response.body()>
	//   30   55:invokevirtual   #54  <Method BufferedSource ResponseBody.source()>
	//   31   58:aload_3         
	//   32   59:invokespecial   #57  <Method void ResponseBodyProxy$ProxySource(HttpCacheRecordEditor, Source, ApolloLogger)>
	//   33   62:putfield        #59  <Field Source responseBodySource>
	//   34   65:return          
	}

	public long contentLength()
	{
		long l = -1L;
	//    0    0:ldc2w           #65  <Long -1L>
	//    1    3:lstore_1        
		try
		{
			if(contentLength != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #46  <Field String contentLength>
	//*   4    8:ifnull          19
				l = Long.parseLong(contentLength);
	//    5   11:aload_0         
	//    6   12:getfield        #46  <Field String contentLength>
	//    7   15:invokestatic    #72  <Method long Long.parseLong(String)>
	//    8   18:lstore_1        
		}
	//*   9   19:lload_1         
	//*  10   20:lreturn         
		catch(NumberFormatException numberformatexception)
	//*  11   21:astore_3        
		{
			return -1L;
	//   12   22:ldc2w           #65  <Long -1L>
	//   13   25:lreturn         
		}
		return l;
	}

	public MediaType contentType()
	{
		String s = contentType;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String contentType>
	//    2    4:astore_1        
		if(s != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return MediaType.parse(s);
	//    5    9:aload_1         
	//    6   10:invokestatic    #79  <Method MediaType MediaType.parse(String)>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public BufferedSource source()
	{
		return Okio.buffer(responseBodySource);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Source responseBodySource>
	//    2    4:invokestatic    #85  <Method BufferedSource Okio.buffer(Source)>
	//    3    7:areturn         
	}

	private final String contentLength;
	private final String contentType;
	private final Source responseBodySource;

	// Unreferenced inner class com/apollographql/apollo/cache/http/ResponseBodyProxy$ProxySource$1

/* anonymous class */
	class ProxySource._cls1 extends ResponseBodyCacheSink
	{

		void onException(Exception exception)
		{
			abortCacheQuietly();
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field ResponseBodyProxy$ProxySource this$0>
		//    2    4:invokevirtual   #31  <Method void ResponseBodyProxy$ProxySource.abortCacheQuietly()>
			logger.w(((Throwable) (exception)), "Operation failed", new Object[0]);
		//    3    7:aload_0         
		//    4    8:getfield        #21  <Field ApolloLogger val$logger>
		//    5   11:aload_1         
		//    6   12:ldc1            #33  <String "Operation failed">
		//    7   14:iconst_0        
		//    8   15:anewarray       Object[]
		//    9   18:invokevirtual   #41  <Method void ApolloLogger.w(Throwable, String, Object[])>
		//   10   21:return          
		}

		final ProxySource this$0;
		final ApolloLogger val$logger;

			
			{
				this$0 = final_proxysource;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ResponseBodyProxy$ProxySource this$0>
				logger = apollologger;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #21  <Field ApolloLogger val$logger>
				super(BufferedSink.this);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #24  <Method void ResponseBodyCacheSink(BufferedSink)>
			//    9   15:return          
			}
	}

}
