// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import java.io.IOException;
import java.net.URI;
import java.util.*;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.*;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.message.BasicNameValuePair;
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
		//    0    0:ldc1            #11  <String "PATCH">
		//    1    2:areturn         
		}

		public static final String METHOD_NAME = "PATCH";

		public HttpPatch()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void HttpEntityEnclosingRequestBase()>
		//    2    4:return          
		}

		public HttpPatch(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void HttpEntityEnclosingRequestBase()>
			setURI(URI.create(s));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #23  <Method URI URI.create(String)>
		//    5    9:invokevirtual   #27  <Method void setURI(URI)>
		//    6   12:return          
		}

		public HttpPatch(URI uri)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void HttpEntityEnclosingRequestBase()>
			setURI(uri);
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #27  <Method void setURI(URI)>
		//    5    9:return          
		}
	}


	public HttpClientStack(HttpClient httpclient)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mClient = httpclient;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field HttpClient mClient>
	//    5    9:return          
	}

	private static void addHeaders(HttpUriRequest httpurirequest, Map map)
	{
		String s;
		for(Iterator iterator = map.keySet().iterator(); iterator.hasNext(); httpurirequest.setHeader(s, (String)map.get(((Object) (s)))))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #31  <Method Set Map.keySet()>
	//*   2    6:invokeinterface #37  <Method Iterator Set.iterator()>
	//*   3   11:astore_2        
	//*   4   12:aload_2         
	//*   5   13:invokeinterface #43  <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            51
			s = (String)iterator.next();
	//    7   21:aload_2         
	//    8   22:invokeinterface #47  <Method Object Iterator.next()>
	//    9   27:checkcast       #49  <Class String>
	//   10   30:astore_3        

	//   11   31:aload_0         
	//   12   32:aload_3         
	//   13   33:aload_1         
	//   14   34:aload_3         
	//   15   35:invokeinterface #53  <Method Object Map.get(Object)>
	//   16   40:checkcast       #49  <Class String>
	//   17   43:invokeinterface #59  <Method void HttpUriRequest.setHeader(String, String)>
	//*  18   48:goto            12
	//   19   51:return          
	}

	static HttpUriRequest createHttpRequest(Request request, Map map)
		throws AuthFailureError
	{
		switch(request.getMethod())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #71  <Method int Request.getMethod()>
		{
	//*   2    4:tableswitch     -1 7: default 56
	//	               -1 59
	//	               0 116
	//	               1 140
	//	               2 169
	//	               3 128
	//	               4 198
	//	               5 210
	//	               6 222
	//	               7 234
	//*   3   56:goto            263
		case -1: 
			map = ((Map) (request.getPostBody()));
	//    4   59:aload_0         
	//    5   60:invokevirtual   #75  <Method byte[] Request.getPostBody()>
	//    6   63:astore_1        
			if(map != null)
	//*   7   64:aload_1         
	//*   8   65:ifnull          104
			{
				HttpPost httppost = new HttpPost(request.getUrl());
	//    9   68:new             #77  <Class HttpPost>
	//   10   71:dup             
	//   11   72:aload_0         
	//   12   73:invokevirtual   #81  <Method String Request.getUrl()>
	//   13   76:invokespecial   #84  <Method void HttpPost(String)>
	//   14   79:astore_2        
				httppost.addHeader("Content-Type", request.getPostBodyContentType());
	//   15   80:aload_2         
	//   16   81:ldc1            #13  <String "Content-Type">
	//   17   83:aload_0         
	//   18   84:invokevirtual   #87  <Method String Request.getPostBodyContentType()>
	//   19   87:invokevirtual   #90  <Method void HttpPost.addHeader(String, String)>
				httppost.setEntity(((org.apache.http.HttpEntity) (new ByteArrayEntity(((byte []) (map))))));
	//   20   90:aload_2         
	//   21   91:new             #92  <Class ByteArrayEntity>
	//   22   94:dup             
	//   23   95:aload_1         
	//   24   96:invokespecial   #95  <Method void ByteArrayEntity(byte[])>
	//   25   99:invokevirtual   #99  <Method void HttpPost.setEntity(org.apache.http.HttpEntity)>
				return ((HttpUriRequest) (httppost));
	//   26  102:aload_2         
	//   27  103:areturn         
			} else
			{
				return ((HttpUriRequest) (new HttpGet(request.getUrl())));
	//   28  104:new             #101 <Class HttpGet>
	//   29  107:dup             
	//   30  108:aload_0         
	//   31  109:invokevirtual   #81  <Method String Request.getUrl()>
	//   32  112:invokespecial   #102 <Method void HttpGet(String)>
	//   33  115:areturn         
			}

		case 0: // '\0'
			return ((HttpUriRequest) (new HttpGet(request.getUrl())));
	//   34  116:new             #101 <Class HttpGet>
	//   35  119:dup             
	//   36  120:aload_0         
	//   37  121:invokevirtual   #81  <Method String Request.getUrl()>
	//   38  124:invokespecial   #102 <Method void HttpGet(String)>
	//   39  127:areturn         

		case 3: // '\003'
			return ((HttpUriRequest) (new HttpDelete(request.getUrl())));
	//   40  128:new             #104 <Class HttpDelete>
	//   41  131:dup             
	//   42  132:aload_0         
	//   43  133:invokevirtual   #81  <Method String Request.getUrl()>
	//   44  136:invokespecial   #105 <Method void HttpDelete(String)>
	//   45  139:areturn         

		case 1: // '\001'
			map = ((Map) (new HttpPost(request.getUrl())));
	//   46  140:new             #77  <Class HttpPost>
	//   47  143:dup             
	//   48  144:aload_0         
	//   49  145:invokevirtual   #81  <Method String Request.getUrl()>
	//   50  148:invokespecial   #84  <Method void HttpPost(String)>
	//   51  151:astore_1        
			((HttpPost) (map)).addHeader("Content-Type", request.getBodyContentType());
	//   52  152:aload_1         
	//   53  153:ldc1            #13  <String "Content-Type">
	//   54  155:aload_0         
	//   55  156:invokevirtual   #108 <Method String Request.getBodyContentType()>
	//   56  159:invokevirtual   #90  <Method void HttpPost.addHeader(String, String)>
			setEntityIfNonEmptyBody(((HttpEntityEnclosingRequestBase) (map)), request);
	//   57  162:aload_1         
	//   58  163:aload_0         
	//   59  164:invokestatic    #112 <Method void setEntityIfNonEmptyBody(HttpEntityEnclosingRequestBase, Request)>
			return ((HttpUriRequest) (map));
	//   60  167:aload_1         
	//   61  168:areturn         

		case 2: // '\002'
			map = ((Map) (new HttpPut(request.getUrl())));
	//   62  169:new             #114 <Class HttpPut>
	//   63  172:dup             
	//   64  173:aload_0         
	//   65  174:invokevirtual   #81  <Method String Request.getUrl()>
	//   66  177:invokespecial   #115 <Method void HttpPut(String)>
	//   67  180:astore_1        
			((HttpPut) (map)).addHeader("Content-Type", request.getBodyContentType());
	//   68  181:aload_1         
	//   69  182:ldc1            #13  <String "Content-Type">
	//   70  184:aload_0         
	//   71  185:invokevirtual   #108 <Method String Request.getBodyContentType()>
	//   72  188:invokevirtual   #116 <Method void HttpPut.addHeader(String, String)>
			setEntityIfNonEmptyBody(((HttpEntityEnclosingRequestBase) (map)), request);
	//   73  191:aload_1         
	//   74  192:aload_0         
	//   75  193:invokestatic    #112 <Method void setEntityIfNonEmptyBody(HttpEntityEnclosingRequestBase, Request)>
			return ((HttpUriRequest) (map));
	//   76  196:aload_1         
	//   77  197:areturn         

		case 4: // '\004'
			return ((HttpUriRequest) (new HttpHead(request.getUrl())));
	//   78  198:new             #118 <Class HttpHead>
	//   79  201:dup             
	//   80  202:aload_0         
	//   81  203:invokevirtual   #81  <Method String Request.getUrl()>
	//   82  206:invokespecial   #119 <Method void HttpHead(String)>
	//   83  209:areturn         

		case 5: // '\005'
			return ((HttpUriRequest) (new HttpOptions(request.getUrl())));
	//   84  210:new             #121 <Class HttpOptions>
	//   85  213:dup             
	//   86  214:aload_0         
	//   87  215:invokevirtual   #81  <Method String Request.getUrl()>
	//   88  218:invokespecial   #122 <Method void HttpOptions(String)>
	//   89  221:areturn         

		case 6: // '\006'
			return ((HttpUriRequest) (new HttpTrace(request.getUrl())));
	//   90  222:new             #124 <Class HttpTrace>
	//   91  225:dup             
	//   92  226:aload_0         
	//   93  227:invokevirtual   #81  <Method String Request.getUrl()>
	//   94  230:invokespecial   #125 <Method void HttpTrace(String)>
	//   95  233:areturn         

		case 7: // '\007'
			map = ((Map) (new HttpPatch(request.getUrl())));
	//   96  234:new             #8   <Class HttpClientStack$HttpPatch>
	//   97  237:dup             
	//   98  238:aload_0         
	//   99  239:invokevirtual   #81  <Method String Request.getUrl()>
	//  100  242:invokespecial   #126 <Method void HttpClientStack$HttpPatch(String)>
	//  101  245:astore_1        
			((HttpPatch) (map)).addHeader("Content-Type", request.getBodyContentType());
	//  102  246:aload_1         
	//  103  247:ldc1            #13  <String "Content-Type">
	//  104  249:aload_0         
	//  105  250:invokevirtual   #108 <Method String Request.getBodyContentType()>
	//  106  253:invokevirtual   #127 <Method void HttpClientStack$HttpPatch.addHeader(String, String)>
			setEntityIfNonEmptyBody(((HttpEntityEnclosingRequestBase) (map)), request);
	//  107  256:aload_1         
	//  108  257:aload_0         
	//  109  258:invokestatic    #112 <Method void setEntityIfNonEmptyBody(HttpEntityEnclosingRequestBase, Request)>
			return ((HttpUriRequest) (map));
	//  110  261:aload_1         
	//  111  262:areturn         
		}
		throw new IllegalStateException("Unknown request method.");
	//  112  263:new             #129 <Class IllegalStateException>
	//  113  266:dup             
	//  114  267:ldc1            #131 <String "Unknown request method.">
	//  115  269:invokespecial   #132 <Method void IllegalStateException(String)>
	//  116  272:athrow          
	}

	private static List getPostParameterPairs(Map map)
	{
		ArrayList arraylist = new ArrayList(map.size());
	//    0    0:new             #138 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #141 <Method int Map.size()>
	//    4   10:invokespecial   #144 <Method void ArrayList(int)>
	//    5   13:astore_1        
		String s;
		for(Iterator iterator = map.keySet().iterator(); iterator.hasNext(); ((List) (arraylist)).add(((Object) (new BasicNameValuePair(s, (String)map.get(((Object) (s))))))))
	//*   6   14:aload_0         
	//*   7   15:invokeinterface #31  <Method Set Map.keySet()>
	//*   8   20:invokeinterface #37  <Method Iterator Set.iterator()>
	//*   9   25:astore_2        
	//*  10   26:aload_2         
	//*  11   27:invokeinterface #43  <Method boolean Iterator.hasNext()>
	//*  12   32:ifeq            73
			s = (String)iterator.next();
	//   13   35:aload_2         
	//   14   36:invokeinterface #47  <Method Object Iterator.next()>
	//   15   41:checkcast       #49  <Class String>
	//   16   44:astore_3        

	//   17   45:aload_1         
	//   18   46:new             #146 <Class BasicNameValuePair>
	//   19   49:dup             
	//   20   50:aload_3         
	//   21   51:aload_0         
	//   22   52:aload_3         
	//   23   53:invokeinterface #53  <Method Object Map.get(Object)>
	//   24   58:checkcast       #49  <Class String>
	//   25   61:invokespecial   #148 <Method void BasicNameValuePair(String, String)>
	//   26   64:invokeinterface #154 <Method boolean List.add(Object)>
	//   27   69:pop             
	//*  28   70:goto            26
		return ((List) (arraylist));
	//   29   73:aload_1         
	//   30   74:areturn         
	}

	private static void setEntityIfNonEmptyBody(HttpEntityEnclosingRequestBase httpentityenclosingrequestbase, Request request)
		throws AuthFailureError
	{
		request = ((Request) (request.getBody()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #158 <Method byte[] Request.getBody()>
	//    2    4:astore_1        
		if(request != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          21
			httpentityenclosingrequestbase.setEntity(((org.apache.http.HttpEntity) (new ByteArrayEntity(((byte []) (request))))));
	//    5    9:aload_0         
	//    6   10:new             #92  <Class ByteArrayEntity>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #95  <Method void ByteArrayEntity(byte[])>
	//   10   18:invokevirtual   #161 <Method void HttpEntityEnclosingRequestBase.setEntity(org.apache.http.HttpEntity)>
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
	//    2    2:invokestatic    #170 <Method HttpUriRequest createHttpRequest(Request, Map)>
	//    3    5:astore          4
		addHeaders(httpurirequest, map);
	//    4    7:aload           4
	//    5    9:aload_2         
	//    6   10:invokestatic    #172 <Method void addHeaders(HttpUriRequest, Map)>
		addHeaders(httpurirequest, request.getHeaders());
	//    7   13:aload           4
	//    8   15:aload_1         
	//    9   16:invokevirtual   #176 <Method Map Request.getHeaders()>
	//   10   19:invokestatic    #172 <Method void addHeaders(HttpUriRequest, Map)>
		onPrepareRequest(httpurirequest);
	//   11   22:aload_0         
	//   12   23:aload           4
	//   13   25:invokevirtual   #178 <Method void onPrepareRequest(HttpUriRequest)>
		map = ((Map) (httpurirequest.getParams()));
	//   14   28:aload           4
	//   15   30:invokeinterface #182 <Method org.apache.http.params.HttpParams HttpUriRequest.getParams()>
	//   16   35:astore_2        
		int i = request.getTimeoutMs();
	//   17   36:aload_1         
	//   18   37:invokevirtual   #185 <Method int Request.getTimeoutMs()>
	//   19   40:istore_3        
		HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (map)), 5000);
	//   20   41:aload_2         
	//   21   42:sipush          5000
	//   22   45:invokestatic    #191 <Method void HttpConnectionParams.setConnectionTimeout(org.apache.http.params.HttpParams, int)>
		HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (map)), i);
	//   23   48:aload_2         
	//   24   49:iload_3         
	//   25   50:invokestatic    #194 <Method void HttpConnectionParams.setSoTimeout(org.apache.http.params.HttpParams, int)>
		return mClient.execute(httpurirequest);
	//   26   53:aload_0         
	//   27   54:getfield        #22  <Field HttpClient mClient>
	//   28   57:aload           4
	//   29   59:invokeinterface #200 <Method HttpResponse HttpClient.execute(HttpUriRequest)>
	//   30   64:areturn         
	}

	private static final String HEADER_CONTENT_TYPE = "Content-Type";
	protected final HttpClient mClient;
}
