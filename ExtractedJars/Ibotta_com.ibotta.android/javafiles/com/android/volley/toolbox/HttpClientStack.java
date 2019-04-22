// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.newrelic.agent.android.instrumentation.ApacheInstrumentation;
import java.io.IOException;
import java.net.URI;
import java.util.*;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.*;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.android.volley.toolbox:
//			HttpStack

public class HttpClientStack
	implements HttpStack
{
	public static final class HttpPatch extends HttpEntityEnclosingRequestBase
	{

		public String getMethod()
		{
			return "PATCH";
		//    0    0:ldc1            #27  <String "PATCH">
		//    1    2:areturn         
		}

		public HttpPatch()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void HttpEntityEnclosingRequestBase()>
		//    2    4:return          
		}

		public HttpPatch(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void HttpEntityEnclosingRequestBase()>
			setURI(URI.create(s));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #19  <Method URI URI.create(String)>
		//    5    9:invokevirtual   #23  <Method void setURI(URI)>
		//    6   12:return          
		}
	}


	public HttpClientStack(HttpClient httpclient)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mClient = httpclient;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field HttpClient mClient>
	//    5    9:return          
	}

	private static void addHeaders(HttpUriRequest httpurirequest, Map map)
	{
		String s;
		for(Iterator iterator = map.keySet().iterator(); iterator.hasNext(); httpurirequest.setHeader(s, (String)map.get(((Object) (s)))))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #29  <Method Set Map.keySet()>
	//*   2    6:invokeinterface #35  <Method Iterator Set.iterator()>
	//*   3   11:astore_2        
	//*   4   12:aload_2         
	//*   5   13:invokeinterface #41  <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            51
			s = (String)iterator.next();
	//    7   21:aload_2         
	//    8   22:invokeinterface #45  <Method Object Iterator.next()>
	//    9   27:checkcast       #47  <Class String>
	//   10   30:astore_3        

	//   11   31:aload_0         
	//   12   32:aload_3         
	//   13   33:aload_1         
	//   14   34:aload_3         
	//   15   35:invokeinterface #51  <Method Object Map.get(Object)>
	//   16   40:checkcast       #47  <Class String>
	//   17   43:invokeinterface #57  <Method void HttpUriRequest.setHeader(String, String)>
	//*  18   48:goto            12
	//   19   51:return          
	}

	static HttpUriRequest createHttpRequest(Request request, Map map)
		throws AuthFailureError
	{
		switch(request.getMethod())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #69  <Method int Request.getMethod()>
		{
	//*   2    4:tableswitch     -1 7: default 56
	//	               -1 213
	//	               0 201
	//	               1 172
	//	               2 143
	//	               3 131
	//	               4 119
	//	               5 107
	//	               6 95
	//	               7 66
		default:
			throw new IllegalStateException("Unknown request method.");
	//    3   56:new             #71  <Class IllegalStateException>
	//    4   59:dup             
	//    5   60:ldc1            #73  <String "Unknown request method.">
	//    6   62:invokespecial   #76  <Method void IllegalStateException(String)>
	//    7   65:athrow          

		case 7: // '\007'
			map = ((Map) (new HttpPatch(request.getUrl())));
	//    8   66:new             #8   <Class HttpClientStack$HttpPatch>
	//    9   69:dup             
	//   10   70:aload_0         
	//   11   71:invokevirtual   #80  <Method String Request.getUrl()>
	//   12   74:invokespecial   #81  <Method void HttpClientStack$HttpPatch(String)>
	//   13   77:astore_1        
			((HttpPatch) (map)).addHeader("Content-Type", request.getBodyContentType());
	//   14   78:aload_1         
	//   15   79:ldc1            #83  <String "Content-Type">
	//   16   81:aload_0         
	//   17   82:invokevirtual   #86  <Method String Request.getBodyContentType()>
	//   18   85:invokevirtual   #89  <Method void HttpClientStack$HttpPatch.addHeader(String, String)>
			setEntityIfNonEmptyBody(((HttpEntityEnclosingRequestBase) (map)), request);
	//   19   88:aload_1         
	//   20   89:aload_0         
	//   21   90:invokestatic    #93  <Method void setEntityIfNonEmptyBody(HttpEntityEnclosingRequestBase, Request)>
			return ((HttpUriRequest) (map));
	//   22   93:aload_1         
	//   23   94:areturn         

		case 6: // '\006'
			return ((HttpUriRequest) (new HttpTrace(request.getUrl())));
	//   24   95:new             #95  <Class HttpTrace>
	//   25   98:dup             
	//   26   99:aload_0         
	//   27  100:invokevirtual   #80  <Method String Request.getUrl()>
	//   28  103:invokespecial   #96  <Method void HttpTrace(String)>
	//   29  106:areturn         

		case 5: // '\005'
			return ((HttpUriRequest) (new HttpOptions(request.getUrl())));
	//   30  107:new             #98  <Class HttpOptions>
	//   31  110:dup             
	//   32  111:aload_0         
	//   33  112:invokevirtual   #80  <Method String Request.getUrl()>
	//   34  115:invokespecial   #99  <Method void HttpOptions(String)>
	//   35  118:areturn         

		case 4: // '\004'
			return ((HttpUriRequest) (new HttpHead(request.getUrl())));
	//   36  119:new             #101 <Class HttpHead>
	//   37  122:dup             
	//   38  123:aload_0         
	//   39  124:invokevirtual   #80  <Method String Request.getUrl()>
	//   40  127:invokespecial   #102 <Method void HttpHead(String)>
	//   41  130:areturn         

		case 3: // '\003'
			return ((HttpUriRequest) (new HttpDelete(request.getUrl())));
	//   42  131:new             #104 <Class HttpDelete>
	//   43  134:dup             
	//   44  135:aload_0         
	//   45  136:invokevirtual   #80  <Method String Request.getUrl()>
	//   46  139:invokespecial   #105 <Method void HttpDelete(String)>
	//   47  142:areturn         

		case 2: // '\002'
			map = ((Map) (new HttpPut(request.getUrl())));
	//   48  143:new             #107 <Class HttpPut>
	//   49  146:dup             
	//   50  147:aload_0         
	//   51  148:invokevirtual   #80  <Method String Request.getUrl()>
	//   52  151:invokespecial   #108 <Method void HttpPut(String)>
	//   53  154:astore_1        
			((HttpPut) (map)).addHeader("Content-Type", request.getBodyContentType());
	//   54  155:aload_1         
	//   55  156:ldc1            #83  <String "Content-Type">
	//   56  158:aload_0         
	//   57  159:invokevirtual   #86  <Method String Request.getBodyContentType()>
	//   58  162:invokevirtual   #109 <Method void HttpPut.addHeader(String, String)>
			setEntityIfNonEmptyBody(((HttpEntityEnclosingRequestBase) (map)), request);
	//   59  165:aload_1         
	//   60  166:aload_0         
	//   61  167:invokestatic    #93  <Method void setEntityIfNonEmptyBody(HttpEntityEnclosingRequestBase, Request)>
			return ((HttpUriRequest) (map));
	//   62  170:aload_1         
	//   63  171:areturn         

		case 1: // '\001'
			map = ((Map) (new HttpPost(request.getUrl())));
	//   64  172:new             #111 <Class HttpPost>
	//   65  175:dup             
	//   66  176:aload_0         
	//   67  177:invokevirtual   #80  <Method String Request.getUrl()>
	//   68  180:invokespecial   #112 <Method void HttpPost(String)>
	//   69  183:astore_1        
			((HttpPost) (map)).addHeader("Content-Type", request.getBodyContentType());
	//   70  184:aload_1         
	//   71  185:ldc1            #83  <String "Content-Type">
	//   72  187:aload_0         
	//   73  188:invokevirtual   #86  <Method String Request.getBodyContentType()>
	//   74  191:invokevirtual   #113 <Method void HttpPost.addHeader(String, String)>
			setEntityIfNonEmptyBody(((HttpEntityEnclosingRequestBase) (map)), request);
	//   75  194:aload_1         
	//   76  195:aload_0         
	//   77  196:invokestatic    #93  <Method void setEntityIfNonEmptyBody(HttpEntityEnclosingRequestBase, Request)>
			return ((HttpUriRequest) (map));
	//   78  199:aload_1         
	//   79  200:areturn         

		case 0: // '\0'
			return ((HttpUriRequest) (new HttpGet(request.getUrl())));
	//   80  201:new             #115 <Class HttpGet>
	//   81  204:dup             
	//   82  205:aload_0         
	//   83  206:invokevirtual   #80  <Method String Request.getUrl()>
	//   84  209:invokespecial   #116 <Method void HttpGet(String)>
	//   85  212:areturn         

		case -1: 
			map = ((Map) (request.getPostBody()));
	//   86  213:aload_0         
	//   87  214:invokevirtual   #120 <Method byte[] Request.getPostBody()>
	//   88  217:astore_1        
			break;
		}
		if(map != null)
	//*  89  218:aload_1         
	//*  90  219:ifnull          258
		{
			HttpPost httppost = new HttpPost(request.getUrl());
	//   91  222:new             #111 <Class HttpPost>
	//   92  225:dup             
	//   93  226:aload_0         
	//   94  227:invokevirtual   #80  <Method String Request.getUrl()>
	//   95  230:invokespecial   #112 <Method void HttpPost(String)>
	//   96  233:astore_2        
			httppost.addHeader("Content-Type", request.getPostBodyContentType());
	//   97  234:aload_2         
	//   98  235:ldc1            #83  <String "Content-Type">
	//   99  237:aload_0         
	//  100  238:invokevirtual   #123 <Method String Request.getPostBodyContentType()>
	//  101  241:invokevirtual   #113 <Method void HttpPost.addHeader(String, String)>
			httppost.setEntity(((org.apache.http.HttpEntity) (new ByteArrayEntity(((byte []) (map))))));
	//  102  244:aload_2         
	//  103  245:new             #125 <Class ByteArrayEntity>
	//  104  248:dup             
	//  105  249:aload_1         
	//  106  250:invokespecial   #128 <Method void ByteArrayEntity(byte[])>
	//  107  253:invokevirtual   #132 <Method void HttpPost.setEntity(org.apache.http.HttpEntity)>
			return ((HttpUriRequest) (httppost));
	//  108  256:aload_2         
	//  109  257:areturn         
		} else
		{
			return ((HttpUriRequest) (new HttpGet(request.getUrl())));
	//  110  258:new             #115 <Class HttpGet>
	//  111  261:dup             
	//  112  262:aload_0         
	//  113  263:invokevirtual   #80  <Method String Request.getUrl()>
	//  114  266:invokespecial   #116 <Method void HttpGet(String)>
	//  115  269:areturn         
		}
	}

	private static void setEntityIfNonEmptyBody(HttpEntityEnclosingRequestBase httpentityenclosingrequestbase, Request request)
		throws AuthFailureError
	{
		request = ((Request) (request.getBody()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #137 <Method byte[] Request.getBody()>
	//    2    4:astore_1        
		if(request != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          21
			httpentityenclosingrequestbase.setEntity(((org.apache.http.HttpEntity) (new ByteArrayEntity(((byte []) (request))))));
	//    5    9:aload_0         
	//    6   10:new             #125 <Class ByteArrayEntity>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #128 <Method void ByteArrayEntity(byte[])>
	//   10   18:invokevirtual   #140 <Method void HttpEntityEnclosingRequestBase.setEntity(org.apache.http.HttpEntity)>
	//   11   21:return          
	}

	protected void onPrepareRequest(HttpUriRequest httpurirequest)
		throws IOException
	{
	//    0    0:return          
	}

	public HttpResponse performRequest(Request request, Map map)
		throws IOException, AuthFailureError
	{
		HttpUriRequest httpurirequest = createHttpRequest(request, map);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #149 <Method HttpUriRequest createHttpRequest(Request, Map)>
	//    3    5:astore          4
		addHeaders(httpurirequest, map);
	//    4    7:aload           4
	//    5    9:aload_2         
	//    6   10:invokestatic    #151 <Method void addHeaders(HttpUriRequest, Map)>
		addHeaders(httpurirequest, request.getHeaders());
	//    7   13:aload           4
	//    8   15:aload_1         
	//    9   16:invokevirtual   #155 <Method Map Request.getHeaders()>
	//   10   19:invokestatic    #151 <Method void addHeaders(HttpUriRequest, Map)>
		onPrepareRequest(httpurirequest);
	//   11   22:aload_0         
	//   12   23:aload           4
	//   13   25:invokevirtual   #157 <Method void onPrepareRequest(HttpUriRequest)>
		map = ((Map) (httpurirequest.getParams()));
	//   14   28:aload           4
	//   15   30:invokeinterface #161 <Method org.apache.http.params.HttpParams HttpUriRequest.getParams()>
	//   16   35:astore_2        
		int i = request.getTimeoutMs();
	//   17   36:aload_1         
	//   18   37:invokevirtual   #164 <Method int Request.getTimeoutMs()>
	//   19   40:istore_3        
		HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (map)), 5000);
	//   20   41:aload_2         
	//   21   42:sipush          5000
	//   22   45:invokestatic    #170 <Method void HttpConnectionParams.setConnectionTimeout(org.apache.http.params.HttpParams, int)>
		HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (map)), i);
	//   23   48:aload_2         
	//   24   49:iload_3         
	//   25   50:invokestatic    #173 <Method void HttpConnectionParams.setSoTimeout(org.apache.http.params.HttpParams, int)>
		request = ((Request) (mClient));
	//   26   53:aload_0         
	//   27   54:getfield        #20  <Field HttpClient mClient>
	//   28   57:astore_1        
		if(!(request instanceof HttpClient))
	//*  29   58:aload_1         
	//*  30   59:instanceof      #175 <Class HttpClient>
	//*  31   62:ifne            74
			return ((HttpClient) (request)).execute(httpurirequest);
	//   32   65:aload_1         
	//   33   66:aload           4
	//   34   68:invokeinterface #179 <Method HttpResponse HttpClient.execute(HttpUriRequest)>
	//   35   73:areturn         
		else
			return ApacheInstrumentation.execute((HttpClient)request, httpurirequest);
	//   36   74:aload_1         
	//   37   75:checkcast       #175 <Class HttpClient>
	//   38   78:aload           4
	//   39   80:invokestatic    #184 <Method HttpResponse ApacheInstrumentation.execute(HttpClient, HttpUriRequest)>
	//   40   83:areturn         
	}

	protected final HttpClient mClient;
}
