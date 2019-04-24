// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.okhttp;

import com.facebook.stetho.inspector.network.*;
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
		{
			return mBody.contentLength();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ResponseBody mBody>
		//    2    4:invokevirtual   #35  <Method long ResponseBody.contentLength()>
		//    3    7:lreturn         
		}

		public MediaType contentType()
		{
			return mBody.contentType();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ResponseBody mBody>
		//    2    4:invokevirtual   #39  <Method MediaType ResponseBody.contentType()>
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

		private byte[] generateBody()
			throws IOException
		{
			RequestBody requestbody = mRequest.body();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Request mRequest>
		//    2    4:invokevirtual   #37  <Method RequestBody Request.body()>
		//    3    7:astore_1        
			if(requestbody == null)
		//*   4    8:aload_1         
		//*   5    9:ifnonnull       14
			{
				return null;
		//    6   12:aconst_null     
		//    7   13:areturn         
			} else
			{
				Buffer buffer = new Buffer();
		//    8   14:new             #39  <Class Buffer>
		//    9   17:dup             
		//   10   18:invokespecial   #40  <Method void Buffer()>
		//   11   21:astore_2        
				requestbody.writeTo(((okio.BufferedSink) (buffer)));
		//   12   22:aload_1         
		//   13   23:aload_2         
		//   14   24:invokevirtual   #46  <Method void RequestBody.writeTo(okio.BufferedSink)>
				return buffer.readByteArray();
		//   15   27:aload_2         
		//   16   28:invokevirtual   #49  <Method byte[] Buffer.readByteArray()>
		//   17   31:areturn         
			}
		}

		public byte[] body()
			throws IOException
		{
			if(!mBodyGenerated)
		//*   0    0:aload_0         
		//*   1    1:getfield        #53  <Field boolean mBodyGenerated>
		//*   2    4:ifne            20
			{
				mBodyGenerated = true;
		//    3    7:aload_0         
		//    4    8:iconst_1        
		//    5    9:putfield        #53  <Field boolean mBodyGenerated>
				mBody = generateBody();
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:invokespecial   #55  <Method byte[] generateBody()>
		//    9   17:putfield        #57  <Field byte[] mBody>
			}
			return mBody;
		//   10   20:aload_0         
		//   11   21:getfield        #57  <Field byte[] mBody>
		//   12   24:areturn         
		}

		public String firstHeaderValue(String s)
		{
			return mRequest.header(s);
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Request mRequest>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #63  <Method String Request.header(String)>
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
		//    1    1:getfield        #26  <Field Request mRequest>
		//    2    4:invokevirtual   #73  <Method Headers Request.headers()>
		//    3    7:invokevirtual   #78  <Method int Headers.size()>
		//    4   10:ireturn         
		}

		public String headerName(int i)
		{
			return mRequest.headers().name(i);
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Request mRequest>
		//    2    4:invokevirtual   #73  <Method Headers Request.headers()>
		//    3    7:iload_1         
		//    4    8:invokevirtual   #83  <Method String Headers.name(int)>
		//    5   11:areturn         
		}

		public String headerValue(int i)
		{
			return mRequest.headers().value(i);
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Request mRequest>
		//    2    4:invokevirtual   #73  <Method Headers Request.headers()>
		//    3    7:iload_1         
		//    4    8:invokevirtual   #87  <Method String Headers.value(int)>
		//    5   11:areturn         
		}

		public String id()
		{
			return mRequestId;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field String mRequestId>
		//    2    4:areturn         
		}

		public String method()
		{
			return mRequest.method();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Request mRequest>
		//    2    4:invokevirtual   #91  <Method String Request.method()>
		//    3    7:areturn         
		}

		public String url()
		{
			return mRequest.urlString();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Request mRequest>
		//    2    4:invokevirtual   #95  <Method String Request.urlString()>
		//    3    7:areturn         
		}

		private byte mBody[];
		private boolean mBodyGenerated;
		private final Request mRequest;
		private final String mRequestId;

		public OkHttpInspectorRequest(String s, Request request)
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
		//    8   14:return          
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
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #29  <Method NetworkEventReporter NetworkEventReporterImpl.get()>
	//    4    8:putfield        #31  <Field NetworkEventReporter mEventReporter>
	//    5   11:aload_0         
	//    6   12:new             #33  <Class AtomicInteger>
	//    7   15:dup             
	//    8   16:iconst_0        
	//    9   17:invokespecial   #36  <Method void AtomicInteger(int)>
	//   10   20:putfield        #38  <Field AtomicInteger mNextRequestId>
	//   11   23:return          
	}

	public Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
		throws IOException
	{
		String s = String.valueOf(mNextRequestId.getAndIncrement());
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field AtomicInteger mNextRequestId>
	//    2    4:invokevirtual   #47  <Method int AtomicInteger.getAndIncrement()>
	//    3    7:invokestatic    #53  <Method String String.valueOf(int)>
	//    4   10:astore          8
		Object obj1 = ((Object) (chain.request()));
	//    5   12:aload_1         
	//    6   13:invokeinterface #59  <Method Request com.squareup.okhttp.Interceptor$Chain.request()>
	//    7   18:astore          6
		boolean flag1 = mEventReporter.isEnabled();
	//    8   20:aload_0         
	//    9   21:getfield        #31  <Field NetworkEventReporter mEventReporter>
	//   10   24:invokeinterface #65  <Method boolean NetworkEventReporter.isEnabled()>
	//   11   29:istore          4
		boolean flag = false;
	//   12   31:iconst_0        
	//   13   32:istore_3        
		int i = ((int) (flag));
	//   14   33:iload_3         
	//   15   34:istore_2        
		if(flag1)
	//*  16   35:iload           4
	//*  17   37:ifeq            84
		{
			OkHttpInspectorRequest okhttpinspectorrequest = new OkHttpInspectorRequest(s, ((Request) (obj1)));
	//   18   40:new             #11  <Class StethoInterceptor$OkHttpInspectorRequest>
	//   19   43:dup             
	//   20   44:aload           8
	//   21   46:aload           6
	//   22   48:invokespecial   #68  <Method void StethoInterceptor$OkHttpInspectorRequest(String, Request)>
	//   23   51:astore          5
			mEventReporter.requestWillBeSent(((com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorRequest) (okhttpinspectorrequest)));
	//   24   53:aload_0         
	//   25   54:getfield        #31  <Field NetworkEventReporter mEventReporter>
	//   26   57:aload           5
	//   27   59:invokeinterface #72  <Method void NetworkEventReporter.requestWillBeSent(com.facebook.stetho.inspector.network.NetworkEventReporter$InspectorRequest)>
			byte abyte0[] = okhttpinspectorrequest.body();
	//   28   64:aload           5
	//   29   66:invokevirtual   #76  <Method byte[] StethoInterceptor$OkHttpInspectorRequest.body()>
	//   30   69:astore          5
			i = ((int) (flag));
	//   31   71:iload_3         
	//   32   72:istore_2        
			if(abyte0 != null)
	//*  33   73:aload           5
	//*  34   75:ifnull          84
				i = 0 + abyte0.length;
	//   35   78:iconst_0        
	//   36   79:aload           5
	//   37   81:arraylength     
	//   38   82:iadd            
	//   39   83:istore_2        
		}
		Object obj;
		Response response;
		try
		{
			response = chain.proceed(((Request) (obj1)));
	//   40   84:aload_1         
	//   41   85:aload           6
	//   42   87:invokeinterface #80  <Method Response com.squareup.okhttp.Interceptor$Chain.proceed(Request)>
	//   43   92:astore          7
		}
	//*  44   94:aload           7
	//*  45   96:astore          5
	//*  46   98:aload_0         
	//*  47   99:getfield        #31  <Field NetworkEventReporter mEventReporter>
	//*  48  102:invokeinterface #65  <Method boolean NetworkEventReporter.isEnabled()>
	//*  49  107:ifeq            276
	//*  50  110:iload_2         
	//*  51  111:ifle            127
	//*  52  114:aload_0         
	//*  53  115:getfield        #31  <Field NetworkEventReporter mEventReporter>
	//*  54  118:aload           8
	//*  55  120:iload_2         
	//*  56  121:iload_2         
	//*  57  122:invokeinterface #84  <Method void NetworkEventReporter.dataSent(String, int, int)>
	//*  58  127:aload_1         
	//*  59  128:invokeinterface #88  <Method Connection com.squareup.okhttp.Interceptor$Chain.connection()>
	//*  60  133:astore_1        
	//*  61  134:aload_0         
	//*  62  135:getfield        #31  <Field NetworkEventReporter mEventReporter>
	//*  63  138:new             #14  <Class StethoInterceptor$OkHttpInspectorResponse>
	//*  64  141:dup             
	//*  65  142:aload           8
	//*  66  144:aload           6
	//*  67  146:aload           7
	//*  68  148:aload_1         
	//*  69  149:invokespecial   #91  <Method void StethoInterceptor$OkHttpInspectorResponse(String, Request, Response, Connection)>
	//*  70  152:invokeinterface #95  <Method void NetworkEventReporter.responseHeadersReceived(com.facebook.stetho.inspector.network.NetworkEventReporter$InspectorResponse)>
	//*  71  157:aload           7
	//*  72  159:invokevirtual   #100 <Method ResponseBody Response.body()>
	//*  73  162:astore          9
	//*  74  164:aconst_null     
	//*  75  165:astore          6
	//*  76  167:aload           9
	//*  77  169:ifnull          188
	//*  78  172:aload           9
	//*  79  174:invokevirtual   #106 <Method MediaType ResponseBody.contentType()>
	//*  80  177:astore          5
	//*  81  179:aload           9
	//*  82  181:invokevirtual   #110 <Method InputStream ResponseBody.byteStream()>
	//*  83  184:astore_1        
	//*  84  185:goto            194
	//*  85  188:aconst_null     
	//*  86  189:astore          5
	//*  87  191:aload           5
	//*  88  193:astore_1        
	//*  89  194:aload_0         
	//*  90  195:getfield        #31  <Field NetworkEventReporter mEventReporter>
	//*  91  198:astore          10
	//*  92  200:aload           5
	//*  93  202:ifnull          212
	//*  94  205:aload           5
	//*  95  207:invokevirtual   #116 <Method String MediaType.toString()>
	//*  96  210:astore          6
	//*  97  212:aload           10
	//*  98  214:aload           8
	//*  99  216:aload           6
	//* 100  218:aload           7
	//* 101  220:ldc1            #118 <String "Content-Encoding">
	//* 102  222:invokevirtual   #122 <Method String Response.header(String)>
	//* 103  225:aload_1         
	//* 104  226:new             #124 <Class DefaultResponseHandler>
	//* 105  229:dup             
	//* 106  230:aload_0         
	//* 107  231:getfield        #31  <Field NetworkEventReporter mEventReporter>
	//* 108  234:aload           8
	//* 109  236:invokespecial   #127 <Method void DefaultResponseHandler(NetworkEventReporter, String)>
	//* 110  239:invokeinterface #131 <Method InputStream NetworkEventReporter.interpretResponseStream(String, String, String, InputStream, com.facebook.stetho.inspector.network.ResponseHandler)>
	//* 111  244:astore_1        
	//* 112  245:aload           7
	//* 113  247:astore          5
	//* 114  249:aload_1         
	//* 115  250:ifnull          276
	//* 116  253:aload           7
	//* 117  255:invokevirtual   #135 <Method com.squareup.okhttp.Response$Builder Response.newBuilder()>
	//* 118  258:new             #8   <Class StethoInterceptor$ForwardingResponseBody>
	//* 119  261:dup             
	//* 120  262:aload           9
	//* 121  264:aload_1         
	//* 122  265:invokespecial   #138 <Method void StethoInterceptor$ForwardingResponseBody(ResponseBody, InputStream)>
	//* 123  268:invokevirtual   #143 <Method com.squareup.okhttp.Response$Builder com.squareup.okhttp.Response$Builder.body(ResponseBody)>
	//* 124  271:invokevirtual   #147 <Method Response com.squareup.okhttp.Response$Builder.build()>
	//* 125  274:astore          5
	//* 126  276:aload           5
	//* 127  278:areturn         
		// Misplaced declaration of an exception variable
		catch(com.squareup.okhttp.Interceptor.Chain chain)
	//* 128  279:astore_1        
		{
			if(mEventReporter.isEnabled())
	//* 129  280:aload_0         
	//* 130  281:getfield        #31  <Field NetworkEventReporter mEventReporter>
	//* 131  284:invokeinterface #65  <Method boolean NetworkEventReporter.isEnabled()>
	//* 132  289:ifeq            307
				mEventReporter.httpExchangeFailed(s, ((IOException) (chain)).toString());
	//  133  292:aload_0         
	//  134  293:getfield        #31  <Field NetworkEventReporter mEventReporter>
	//  135  296:aload           8
	//  136  298:aload_1         
	//  137  299:invokevirtual   #148 <Method String IOException.toString()>
	//  138  302:invokeinterface #152 <Method void NetworkEventReporter.httpExchangeFailed(String, String)>
			throw chain;
	//  139  307:aload_1         
	//  140  308:athrow          
		}
		obj = ((Object) (response));
		if(mEventReporter.isEnabled())
		{
			if(i > 0)
				mEventReporter.dataSent(s, i, i);
			chain = ((com.squareup.okhttp.Interceptor.Chain) (chain.connection()));
			mEventReporter.responseHeadersReceived(((com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorResponse) (new OkHttpInspectorResponse(s, ((Request) (obj1)), response, ((Connection) (chain))))));
			ResponseBody responsebody = response.body();
			obj1 = null;
			if(responsebody != null)
			{
				obj = ((Object) (responsebody.contentType()));
				chain = ((com.squareup.okhttp.Interceptor.Chain) (responsebody.byteStream()));
			} else
			{
				obj = null;
				chain = ((com.squareup.okhttp.Interceptor.Chain) (obj));
			}
			NetworkEventReporter networkeventreporter = mEventReporter;
			if(obj != null)
				obj1 = ((Object) (((MediaType) (obj)).toString()));
			chain = ((com.squareup.okhttp.Interceptor.Chain) (networkeventreporter.interpretResponseStream(s, ((String) (obj1)), response.header("Content-Encoding"), ((InputStream) (chain)), ((com.facebook.stetho.inspector.network.ResponseHandler) (new DefaultResponseHandler(mEventReporter, s))))));
			obj = ((Object) (response));
			if(chain != null)
				obj = ((Object) (response.newBuilder().body(((ResponseBody) (new ForwardingResponseBody(responsebody, ((InputStream) (chain)))))).build()));
		}
		return ((Response) (obj));
	}

	private final NetworkEventReporter mEventReporter = NetworkEventReporterImpl.get();
	private final AtomicInteger mNextRequestId = new AtomicInteger(0);
}
