// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.okhttp;

import com.facebook.stetho.inspector.network.*;
import com.newrelic.agent.android.instrumentation.okhttp2.OkHttp2Instrumentation;
import com.squareup.okhttp.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;
import okio.*;

public class StethoInterceptor
	implements Interceptor
{
	private static class ForwardingResponseBody extends ResponseBody
	{

		public long contentLength()
			throws IOException
		{
			return mBody.contentLength();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ResponseBody mBody>
		//    2    4:invokevirtual   #37  <Method long ResponseBody.contentLength()>
		//    3    7:lreturn         
		}

		public MediaType contentType()
		{
			return mBody.contentType();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ResponseBody mBody>
		//    2    4:invokevirtual   #42  <Method MediaType ResponseBody.contentType()>
		//    3    7:areturn         
		}

		public BufferedSource source()
		{
			return mInterceptedSource;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field BufferedSource mInterceptedSource>
		//    2    4:areturn         
		}

		private final ResponseBody mBody;
		private final BufferedSource mInterceptedSource;

		public ForwardingResponseBody(ResponseBody responsebody, InputStream inputstream)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void ResponseBody()>
			mBody = responsebody;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field ResponseBody mBody>
			mInterceptedSource = Okio.buffer(Okio.source(inputstream));
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:invokestatic    #24  <Method okio.Source Okio.source(InputStream)>
		//    8   14:invokestatic    #28  <Method BufferedSource Okio.buffer(okio.Source)>
		//    9   17:putfield        #30  <Field BufferedSource mInterceptedSource>
		//   10   20:return          
		}
	}

	private static class OkHttpInspectorRequest
		implements com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorRequest
	{

		public byte[] body()
			throws IOException
		{
			BufferedSink bufferedsink;
			RequestBody requestbody;
			requestbody = mRequest.body();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field Request mRequest>
		//    2    4:invokevirtual   #37  <Method RequestBody Request.body()>
		//    3    7:astore_2        
			if(requestbody == null)
		//*   4    8:aload_2         
		//*   5    9:ifnonnull       14
				return null;
		//    6   12:aconst_null     
		//    7   13:areturn         
			bufferedsink = Okio.buffer(Okio.sink(mRequestBodyHelper.createBodySink(firstHeaderValue("Content-Encoding"))));
		//    8   14:aload_0         
		//    9   15:getfield        #26  <Field RequestBodyHelper mRequestBodyHelper>
		//   10   18:aload_0         
		//   11   19:ldc1            #39  <String "Content-Encoding">
		//   12   21:invokevirtual   #43  <Method String firstHeaderValue(String)>
		//   13   24:invokevirtual   #49  <Method java.io.OutputStream RequestBodyHelper.createBodySink(String)>
		//   14   27:invokestatic    #55  <Method okio.Sink Okio.sink(java.io.OutputStream)>
		//   15   30:invokestatic    #59  <Method BufferedSink Okio.buffer(okio.Sink)>
		//   16   33:astore_1        
			requestbody.writeTo(bufferedsink);
		//   17   34:aload_2         
		//   18   35:aload_1         
		//   19   36:invokevirtual   #65  <Method void RequestBody.writeTo(BufferedSink)>
			bufferedsink.close();
		//   20   39:aload_1         
		//   21   40:invokeinterface #70  <Method void BufferedSink.close()>
			return mRequestBodyHelper.getDisplayBody();
		//   22   45:aload_0         
		//   23   46:getfield        #26  <Field RequestBodyHelper mRequestBodyHelper>
		//   24   49:invokevirtual   #73  <Method byte[] RequestBodyHelper.getDisplayBody()>
		//   25   52:areturn         
			Exception exception;
			exception;
		//   26   53:astore_2        
			bufferedsink.close();
		//   27   54:aload_1         
		//   28   55:invokeinterface #70  <Method void BufferedSink.close()>
			throw exception;
		//   29   60:aload_2         
		//   30   61:athrow          
		}

		public String firstHeaderValue(String s)
		{
			return mRequest.header(s);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field Request mRequest>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #78  <Method String Request.header(String)>
		//    4    8:areturn         
		}

		public String friendlyName()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public Integer friendlyNameExtra()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public int headerCount()
		{
			return mRequest.headers().size();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field Request mRequest>
		//    2    4:invokevirtual   #88  <Method Headers Request.headers()>
		//    3    7:invokevirtual   #93  <Method int Headers.size()>
		//    4   10:ireturn         
		}

		public String headerName(int i)
		{
			return mRequest.headers().name(i);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field Request mRequest>
		//    2    4:invokevirtual   #88  <Method Headers Request.headers()>
		//    3    7:iload_1         
		//    4    8:invokevirtual   #98  <Method String Headers.name(int)>
		//    5   11:areturn         
		}

		public String headerValue(int i)
		{
			return mRequest.headers().value(i);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field Request mRequest>
		//    2    4:invokevirtual   #88  <Method Headers Request.headers()>
		//    3    7:iload_1         
		//    4    8:invokevirtual   #102 <Method String Headers.value(int)>
		//    5   11:areturn         
		}

		public String id()
		{
			return mRequestId;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field String mRequestId>
		//    2    4:areturn         
		}

		public String method()
		{
			return mRequest.method();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field Request mRequest>
		//    2    4:invokevirtual   #106 <Method String Request.method()>
		//    3    7:areturn         
		}

		public String url()
		{
			return mRequest.urlString();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field Request mRequest>
		//    2    4:invokevirtual   #110 <Method String Request.urlString()>
		//    3    7:areturn         
		}

		private final Request mRequest;
		private RequestBodyHelper mRequestBodyHelper;
		private final String mRequestId;

		public OkHttpInspectorRequest(String s, Request request, RequestBodyHelper requestbodyhelper)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			mRequestId = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field String mRequestId>
			mRequest = request;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field Request mRequest>
			mRequestBodyHelper = requestbodyhelper;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #26  <Field RequestBodyHelper mRequestBodyHelper>
		//   11   19:return          
		}
	}

	private static class OkHttpInspectorResponse
		implements com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorResponse
	{

		public int connectionId()
		{
			return ((Object) (mConnection)).hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field Connection mConnection>
		//    2    4:invokevirtual   #36  <Method int Object.hashCode()>
		//    3    7:ireturn         
		}

		public boolean connectionReused()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public String firstHeaderValue(String s)
		{
			return mResponse.header(s);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Response mResponse>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #46  <Method String Response.header(String)>
		//    4    8:areturn         
		}

		public boolean fromDiskCache()
		{
			return mResponse.cacheResponse() != null;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Response mResponse>
		//    2    4:invokevirtual   #52  <Method Response Response.cacheResponse()>
		//    3    7:ifnull          12
		//    4   10:iconst_1        
		//    5   11:ireturn         
		//    6   12:iconst_0        
		//    7   13:ireturn         
		}

		public int headerCount()
		{
			return mResponse.headers().size();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Response mResponse>
		//    2    4:invokevirtual   #57  <Method Headers Response.headers()>
		//    3    7:invokevirtual   #62  <Method int Headers.size()>
		//    4   10:ireturn         
		}

		public String headerName(int i)
		{
			return mResponse.headers().name(i);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Response mResponse>
		//    2    4:invokevirtual   #57  <Method Headers Response.headers()>
		//    3    7:iload_1         
		//    4    8:invokevirtual   #67  <Method String Headers.name(int)>
		//    5   11:areturn         
		}

		public String headerValue(int i)
		{
			return mResponse.headers().value(i);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Response mResponse>
		//    2    4:invokevirtual   #57  <Method Headers Response.headers()>
		//    3    7:iload_1         
		//    4    8:invokevirtual   #71  <Method String Headers.value(int)>
		//    5   11:areturn         
		}

		public String reasonPhrase()
		{
			return mResponse.message();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Response mResponse>
		//    2    4:invokevirtual   #76  <Method String Response.message()>
		//    3    7:areturn         
		}

		public String requestId()
		{
			return mRequestId;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field String mRequestId>
		//    2    4:areturn         
		}

		public int statusCode()
		{
			return mResponse.code();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Response mResponse>
		//    2    4:invokevirtual   #81  <Method int Response.code()>
		//    3    7:ireturn         
		}

		public String url()
		{
			return mRequest.urlString();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Request mRequest>
		//    2    4:invokevirtual   #87  <Method String Request.urlString()>
		//    3    7:areturn         
		}

		private final Connection mConnection;
		private final Request mRequest;
		private final String mRequestId;
		private final Response mResponse;

		public OkHttpInspectorResponse(String s, Request request, Response response, Connection connection)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			mRequestId = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field String mRequestId>
			mRequest = request;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #26  <Field Request mRequest>
			mResponse = response;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #28  <Field Response mResponse>
			mConnection = connection;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #30  <Field Connection mConnection>
		//   14   25:return          
		}
	}


	public StethoInterceptor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #31  <Method NetworkEventReporter NetworkEventReporterImpl.get()>
	//    4    8:putfield        #33  <Field NetworkEventReporter mEventReporter>
	//    5   11:aload_0         
	//    6   12:new             #35  <Class AtomicInteger>
	//    7   15:dup             
	//    8   16:iconst_0        
	//    9   17:invokespecial   #38  <Method void AtomicInteger(int)>
	//   10   20:putfield        #40  <Field AtomicInteger mNextRequestId>
	//   11   23:return          
	}

	public Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
		throws IOException
	{
		String s1 = String.valueOf(mNextRequestId.getAndIncrement());
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AtomicInteger mNextRequestId>
	//    2    4:invokevirtual   #49  <Method int AtomicInteger.getAndIncrement()>
	//    3    7:invokestatic    #55  <Method String String.valueOf(int)>
	//    4   10:astore          7
		Object obj2 = ((Object) (chain.request()));
	//    5   12:aload_1         
	//    6   13:invokeinterface #61  <Method Request com.squareup.okhttp.Interceptor$Chain.request()>
	//    7   18:astore          8
		boolean flag = mEventReporter.isEnabled();
	//    8   20:aload_0         
	//    9   21:getfield        #33  <Field NetworkEventReporter mEventReporter>
	//   10   24:invokeinterface #67  <Method boolean NetworkEventReporter.isEnabled()>
	//   11   29:istore_2        
		String s = null;
	//   12   30:aconst_null     
	//   13   31:astore          5
		Object obj1;
		if(flag)
	//*  14   33:iload_2         
	//*  15   34:ifeq            79
		{
			obj1 = ((Object) (new RequestBodyHelper(mEventReporter, s1)));
	//   16   37:new             #69  <Class RequestBodyHelper>
	//   17   40:dup             
	//   18   41:aload_0         
	//   19   42:getfield        #33  <Field NetworkEventReporter mEventReporter>
	//   20   45:aload           7
	//   21   47:invokespecial   #72  <Method void RequestBodyHelper(NetworkEventReporter, String)>
	//   22   50:astore          4
			OkHttpInspectorRequest okhttpinspectorrequest = new OkHttpInspectorRequest(s1, ((Request) (obj2)), ((RequestBodyHelper) (obj1)));
	//   23   52:new             #11  <Class StethoInterceptor$OkHttpInspectorRequest>
	//   24   55:dup             
	//   25   56:aload           7
	//   26   58:aload           8
	//   27   60:aload           4
	//   28   62:invokespecial   #75  <Method void StethoInterceptor$OkHttpInspectorRequest(String, Request, RequestBodyHelper)>
	//   29   65:astore_3        
			mEventReporter.requestWillBeSent(((com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorRequest) (okhttpinspectorrequest)));
	//   30   66:aload_0         
	//   31   67:getfield        #33  <Field NetworkEventReporter mEventReporter>
	//   32   70:aload_3         
	//   33   71:invokeinterface #79  <Method void NetworkEventReporter.requestWillBeSent(com.facebook.stetho.inspector.network.NetworkEventReporter$InspectorRequest)>
		} else
	//*  34   76:goto            82
		{
			obj1 = null;
	//   35   79:aconst_null     
	//   36   80:astore          4
		}
		Object obj;
		Response response;
		try
		{
			response = chain.proceed(((Request) (obj2)));
	//   37   82:aload_1         
	//   38   83:aload           8
	//   39   85:invokeinterface #83  <Method Response com.squareup.okhttp.Interceptor$Chain.proceed(Request)>
	//   40   90:astore          6
		}
	//*  41   92:aload           6
	//*  42   94:astore_3        
	//*  43   95:aload_0         
	//*  44   96:getfield        #33  <Field NetworkEventReporter mEventReporter>
	//*  45   99:invokeinterface #67  <Method boolean NetworkEventReporter.isEnabled()>
	//*  46  104:ifeq            332
	//*  47  107:aload           4
	//*  48  109:ifnull          125
	//*  49  112:aload           4
	//*  50  114:invokevirtual   #86  <Method boolean RequestBodyHelper.hasBody()>
	//*  51  117:ifeq            125
	//*  52  120:aload           4
	//*  53  122:invokevirtual   #89  <Method void RequestBodyHelper.reportDataSent()>
	//*  54  125:aload_1         
	//*  55  126:invokeinterface #93  <Method Connection com.squareup.okhttp.Interceptor$Chain.connection()>
	//*  56  131:astore_1        
	//*  57  132:aload_0         
	//*  58  133:getfield        #33  <Field NetworkEventReporter mEventReporter>
	//*  59  136:new             #14  <Class StethoInterceptor$OkHttpInspectorResponse>
	//*  60  139:dup             
	//*  61  140:aload           7
	//*  62  142:aload           8
	//*  63  144:aload           6
	//*  64  146:aload_1         
	//*  65  147:invokespecial   #96  <Method void StethoInterceptor$OkHttpInspectorResponse(String, Request, Response, Connection)>
	//*  66  150:invokeinterface #100 <Method void NetworkEventReporter.responseHeadersReceived(com.facebook.stetho.inspector.network.NetworkEventReporter$InspectorResponse)>
	//*  67  155:aload           6
	//*  68  157:instanceof      #102 <Class Response>
	//*  69  160:ifne            172
	//*  70  163:aload           6
	//*  71  165:invokevirtual   #106 <Method ResponseBody Response.body()>
	//*  72  168:astore_1        
	//*  73  169:goto            181
	//*  74  172:aload           6
	//*  75  174:checkcast       #102 <Class Response>
	//*  76  177:invokestatic    #111 <Method ResponseBody OkHttp2Instrumentation.body(Response)>
	//*  77  180:astore_1        
	//*  78  181:aload_1         
	//*  79  182:ifnull          199
	//*  80  185:aload_1         
	//*  81  186:invokevirtual   #117 <Method MediaType ResponseBody.contentType()>
	//*  82  189:astore          4
	//*  83  191:aload_1         
	//*  84  192:invokevirtual   #121 <Method InputStream ResponseBody.byteStream()>
	//*  85  195:astore_3        
	//*  86  196:goto            205
	//*  87  199:aconst_null     
	//*  88  200:astore          4
	//*  89  202:aload           4
	//*  90  204:astore_3        
	//*  91  205:aload_0         
	//*  92  206:getfield        #33  <Field NetworkEventReporter mEventReporter>
	//*  93  209:astore          8
	//*  94  211:aload           4
	//*  95  213:ifnull          223
	//*  96  216:aload           4
	//*  97  218:invokevirtual   #127 <Method String MediaType.toString()>
	//*  98  221:astore          5
	//*  99  223:aload           8
	//* 100  225:aload           7
	//* 101  227:aload           5
	//* 102  229:aload           6
	//* 103  231:ldc1            #129 <String "Content-Encoding">
	//* 104  233:invokevirtual   #133 <Method String Response.header(String)>
	//* 105  236:aload_3         
	//* 106  237:new             #135 <Class DefaultResponseHandler>
	//* 107  240:dup             
	//* 108  241:aload_0         
	//* 109  242:getfield        #33  <Field NetworkEventReporter mEventReporter>
	//* 110  245:aload           7
	//* 111  247:invokespecial   #136 <Method void DefaultResponseHandler(NetworkEventReporter, String)>
	//* 112  250:invokeinterface #140 <Method InputStream NetworkEventReporter.interpretResponseStream(String, String, String, InputStream, com.facebook.stetho.inspector.network.ResponseHandler)>
	//* 113  255:astore          4
	//* 114  257:aload           6
	//* 115  259:astore_3        
	//* 116  260:aload           4
	//* 117  262:ifnull          332
	//* 118  265:aload           6
	//* 119  267:instanceof      #142 <Class com.squareup.okhttp.Response$Builder>
	//* 120  270:ifne            282
	//* 121  273:aload           6
	//* 122  275:invokevirtual   #146 <Method com.squareup.okhttp.Response$Builder Response.newBuilder()>
	//* 123  278:astore_3        
	//* 124  279:goto            291
	//* 125  282:aload           6
	//* 126  284:checkcast       #142 <Class com.squareup.okhttp.Response$Builder>
	//* 127  287:invokestatic    #149 <Method com.squareup.okhttp.Response$Builder OkHttp2Instrumentation.newBuilder(com.squareup.okhttp.Response$Builder)>
	//* 128  290:astore_3        
	//* 129  291:new             #8   <Class StethoInterceptor$ForwardingResponseBody>
	//* 130  294:dup             
	//* 131  295:aload_1         
	//* 132  296:aload           4
	//* 133  298:invokespecial   #152 <Method void StethoInterceptor$ForwardingResponseBody(ResponseBody, InputStream)>
	//* 134  301:astore_1        
	//* 135  302:aload_3         
	//* 136  303:instanceof      #142 <Class com.squareup.okhttp.Response$Builder>
	//* 137  306:ifne            318
	//* 138  309:aload_3         
	//* 139  310:aload_1         
	//* 140  311:invokevirtual   #155 <Method com.squareup.okhttp.Response$Builder com.squareup.okhttp.Response$Builder.body(ResponseBody)>
	//* 141  314:astore_1        
	//* 142  315:goto            327
	//* 143  318:aload_3         
	//* 144  319:checkcast       #142 <Class com.squareup.okhttp.Response$Builder>
	//* 145  322:aload_1         
	//* 146  323:invokestatic    #158 <Method com.squareup.okhttp.Response$Builder OkHttp2Instrumentation.body(com.squareup.okhttp.Response$Builder, ResponseBody)>
	//* 147  326:astore_1        
	//* 148  327:aload_1         
	//* 149  328:invokevirtual   #162 <Method Response com.squareup.okhttp.Response$Builder.build()>
	//* 150  331:astore_3        
	//* 151  332:aload_3         
	//* 152  333:areturn         
		// Misplaced declaration of an exception variable
		catch(com.squareup.okhttp.Interceptor.Chain chain)
	//* 153  334:astore_1        
		{
			if(mEventReporter.isEnabled())
	//* 154  335:aload_0         
	//* 155  336:getfield        #33  <Field NetworkEventReporter mEventReporter>
	//* 156  339:invokeinterface #67  <Method boolean NetworkEventReporter.isEnabled()>
	//* 157  344:ifeq            362
				mEventReporter.httpExchangeFailed(s1, ((IOException) (chain)).toString());
	//  158  347:aload_0         
	//  159  348:getfield        #33  <Field NetworkEventReporter mEventReporter>
	//  160  351:aload           7
	//  161  353:aload_1         
	//  162  354:invokevirtual   #163 <Method String IOException.toString()>
	//  163  357:invokeinterface #167 <Method void NetworkEventReporter.httpExchangeFailed(String, String)>
			throw chain;
	//  164  362:aload_1         
	//  165  363:athrow          
		}
		obj = ((Object) (response));
		if(mEventReporter.isEnabled())
		{
			if(obj1 != null && ((RequestBodyHelper) (obj1)).hasBody())
				((RequestBodyHelper) (obj1)).reportDataSent();
			chain = ((com.squareup.okhttp.Interceptor.Chain) (chain.connection()));
			mEventReporter.responseHeadersReceived(((com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorResponse) (new OkHttpInspectorResponse(s1, ((Request) (obj2)), response, ((Connection) (chain))))));
			if(!(response instanceof Response))
				chain = ((com.squareup.okhttp.Interceptor.Chain) (response.body()));
			else
				chain = ((com.squareup.okhttp.Interceptor.Chain) (OkHttp2Instrumentation.body((Response)response)));
			if(chain != null)
			{
				obj1 = ((Object) (((ResponseBody) (chain)).contentType()));
				obj = ((Object) (((ResponseBody) (chain)).byteStream()));
			} else
			{
				obj1 = null;
				obj = obj1;
			}
			obj2 = ((Object) (mEventReporter));
			if(obj1 != null)
				s = ((MediaType) (obj1)).toString();
			obj1 = ((Object) (((NetworkEventReporter) (obj2)).interpretResponseStream(s1, s, response.header("Content-Encoding"), ((InputStream) (obj)), ((com.facebook.stetho.inspector.network.ResponseHandler) (new DefaultResponseHandler(mEventReporter, s1))))));
			obj = ((Object) (response));
			if(obj1 != null)
			{
				if(!(response instanceof com.squareup.okhttp.Response.Builder))
					obj = ((Object) (response.newBuilder()));
				else
					obj = ((Object) (OkHttp2Instrumentation.newBuilder((com.squareup.okhttp.Response.Builder)response)));
				chain = ((com.squareup.okhttp.Interceptor.Chain) (new ForwardingResponseBody(((ResponseBody) (chain)), ((InputStream) (obj1)))));
				if(!(obj instanceof com.squareup.okhttp.Response.Builder))
					chain = ((com.squareup.okhttp.Interceptor.Chain) (((com.squareup.okhttp.Response.Builder) (obj)).body(((ResponseBody) (chain)))));
				else
					chain = ((com.squareup.okhttp.Interceptor.Chain) (OkHttp2Instrumentation.body((com.squareup.okhttp.Response.Builder)obj, ((ResponseBody) (chain)))));
				obj = ((Object) (((com.squareup.okhttp.Response.Builder) (chain)).build()));
			}
		}
		return ((Response) (obj));
	}

	private final NetworkEventReporter mEventReporter = NetworkEventReporterImpl.get();
	private final AtomicInteger mNextRequestId = new AtomicInteger(0);
}
