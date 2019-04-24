// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.*;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.*;

// Referenced classes of package com.android.volley.toolbox:
//			HttpStack

public class HurlStack
	implements HttpStack
{
	public static interface UrlRewriter
	{

		public abstract String rewriteUrl(String s);
	}


	public HurlStack()
	{
		this(((UrlRewriter) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #22  <Method void HurlStack(HurlStack$UrlRewriter)>
	//    3    5:return          
	}

	public HurlStack(UrlRewriter urlrewriter)
	{
		this(urlrewriter, ((SSLSocketFactory) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #26  <Method void HurlStack(HurlStack$UrlRewriter, SSLSocketFactory)>
	//    4    6:return          
	}

	public HurlStack(UrlRewriter urlrewriter, SSLSocketFactory sslsocketfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		mUrlRewriter = urlrewriter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field HurlStack$UrlRewriter mUrlRewriter>
		mSslSocketFactory = sslsocketfactory;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #32  <Field SSLSocketFactory mSslSocketFactory>
	//    8   14:return          
	}

	private static void addBodyIfExists(HttpURLConnection httpurlconnection, Request request)
		throws IOException, AuthFailureError
	{
		byte abyte0[] = request.getBody();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #44  <Method byte[] Request.getBody()>
	//    2    4:astore_2        
		if(abyte0 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          45
		{
			httpurlconnection.setDoOutput(true);
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #50  <Method void HttpURLConnection.setDoOutput(boolean)>
			httpurlconnection.addRequestProperty("Content-Type", request.getBodyContentType());
	//    8   14:aload_0         
	//    9   15:ldc1            #13  <String "Content-Type">
	//   10   17:aload_1         
	//   11   18:invokevirtual   #54  <Method String Request.getBodyContentType()>
	//   12   21:invokevirtual   #58  <Method void HttpURLConnection.addRequestProperty(String, String)>
			httpurlconnection = ((HttpURLConnection) (new DataOutputStream(httpurlconnection.getOutputStream())));
	//   13   24:new             #60  <Class DataOutputStream>
	//   14   27:dup             
	//   15   28:aload_0         
	//   16   29:invokevirtual   #64  <Method java.io.OutputStream HttpURLConnection.getOutputStream()>
	//   17   32:invokespecial   #67  <Method void DataOutputStream(java.io.OutputStream)>
	//   18   35:astore_0        
			((DataOutputStream) (httpurlconnection)).write(abyte0);
	//   19   36:aload_0         
	//   20   37:aload_2         
	//   21   38:invokevirtual   #71  <Method void DataOutputStream.write(byte[])>
			((DataOutputStream) (httpurlconnection)).close();
	//   22   41:aload_0         
	//   23   42:invokevirtual   #74  <Method void DataOutputStream.close()>
		}
	//   24   45:return          
	}

	private static HttpEntity entityFromConnection(HttpURLConnection httpurlconnection)
	{
		BasicHttpEntity basichttpentity = new BasicHttpEntity();
	//    0    0:new             #81  <Class BasicHttpEntity>
	//    1    3:dup             
	//    2    4:invokespecial   #82  <Method void BasicHttpEntity()>
	//    3    7:astore_2        
		Object obj;
		try
		{
			obj = ((Object) (httpurlconnection.getInputStream()));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #86  <Method java.io.InputStream HttpURLConnection.getInputStream()>
	//    6   12:astore_1        
		}
	//*   7   13:goto            22
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   8   16:astore_1        
		{
			obj = ((Object) (httpurlconnection.getErrorStream()));
	//    9   17:aload_0         
	//   10   18:invokevirtual   #89  <Method java.io.InputStream HttpURLConnection.getErrorStream()>
	//   11   21:astore_1        
		}
		basichttpentity.setContent(((java.io.InputStream) (obj)));
	//   12   22:aload_2         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #93  <Method void BasicHttpEntity.setContent(java.io.InputStream)>
		basichttpentity.setContentLength(httpurlconnection.getContentLength());
	//   15   27:aload_2         
	//   16   28:aload_0         
	//   17   29:invokevirtual   #97  <Method int HttpURLConnection.getContentLength()>
	//   18   32:i2l             
	//   19   33:invokevirtual   #101 <Method void BasicHttpEntity.setContentLength(long)>
		basichttpentity.setContentEncoding(httpurlconnection.getContentEncoding());
	//   20   36:aload_2         
	//   21   37:aload_0         
	//   22   38:invokevirtual   #104 <Method String HttpURLConnection.getContentEncoding()>
	//   23   41:invokevirtual   #108 <Method void BasicHttpEntity.setContentEncoding(String)>
		basichttpentity.setContentType(httpurlconnection.getContentType());
	//   24   44:aload_2         
	//   25   45:aload_0         
	//   26   46:invokevirtual   #111 <Method String HttpURLConnection.getContentType()>
	//   27   49:invokevirtual   #114 <Method void BasicHttpEntity.setContentType(String)>
		return ((HttpEntity) (basichttpentity));
	//   28   52:aload_2         
	//   29   53:areturn         
	}

	private HttpURLConnection openConnection(URL url, Request request)
		throws IOException
	{
		HttpURLConnection httpurlconnection = createConnection(url);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #120 <Method HttpURLConnection createConnection(URL)>
	//    3    5:astore          4
		int i = request.getTimeoutMs();
	//    4    7:aload_2         
	//    5    8:invokevirtual   #123 <Method int Request.getTimeoutMs()>
	//    6   11:istore_3        
		httpurlconnection.setConnectTimeout(i);
	//    7   12:aload           4
	//    8   14:iload_3         
	//    9   15:invokevirtual   #127 <Method void HttpURLConnection.setConnectTimeout(int)>
		httpurlconnection.setReadTimeout(i);
	//   10   18:aload           4
	//   11   20:iload_3         
	//   12   21:invokevirtual   #130 <Method void HttpURLConnection.setReadTimeout(int)>
		httpurlconnection.setUseCaches(false);
	//   13   24:aload           4
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #133 <Method void HttpURLConnection.setUseCaches(boolean)>
		httpurlconnection.setDoInput(true);
	//   16   30:aload           4
	//   17   32:iconst_1        
	//   18   33:invokevirtual   #136 <Method void HttpURLConnection.setDoInput(boolean)>
		if("https".equals(((Object) (url.getProtocol()))) && mSslSocketFactory != null)
	//*  19   36:ldc1            #138 <String "https">
	//*  20   38:aload_1         
	//*  21   39:invokevirtual   #143 <Method String URL.getProtocol()>
	//*  22   42:invokevirtual   #149 <Method boolean String.equals(Object)>
	//*  23   45:ifeq            67
	//*  24   48:aload_0         
	//*  25   49:getfield        #32  <Field SSLSocketFactory mSslSocketFactory>
	//*  26   52:ifnull          67
			((HttpsURLConnection)httpurlconnection).setSSLSocketFactory(mSslSocketFactory);
	//   27   55:aload           4
	//   28   57:checkcast       #151 <Class HttpsURLConnection>
	//   29   60:aload_0         
	//   30   61:getfield        #32  <Field SSLSocketFactory mSslSocketFactory>
	//   31   64:invokevirtual   #155 <Method void HttpsURLConnection.setSSLSocketFactory(SSLSocketFactory)>
		return httpurlconnection;
	//   32   67:aload           4
	//   33   69:areturn         
	}

	static void setConnectionParametersForRequest(HttpURLConnection httpurlconnection, Request request)
		throws IOException, AuthFailureError
	{
		switch(request.getMethod())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #160 <Method int Request.getMethod()>
		{
	//*   2    4:tableswitch     -1 7: default 56
	//	               -1 59
	//	               0 111
	//	               1 125
	//	               2 137
	//	               3 118
	//	               4 149
	//	               5 156
	//	               6 163
	//	               7 170
	//*   3   56:goto            182
		case -1: 
			byte abyte0[] = request.getPostBody();
	//    4   59:aload_1         
	//    5   60:invokevirtual   #163 <Method byte[] Request.getPostBody()>
	//    6   63:astore_2        
			if(abyte0 != null)
	//*   7   64:aload_2         
	//*   8   65:ifnull          192
			{
				httpurlconnection.setDoOutput(true);
	//    9   68:aload_0         
	//   10   69:iconst_1        
	//   11   70:invokevirtual   #50  <Method void HttpURLConnection.setDoOutput(boolean)>
				httpurlconnection.setRequestMethod("POST");
	//   12   73:aload_0         
	//   13   74:ldc1            #165 <String "POST">
	//   14   76:invokevirtual   #168 <Method void HttpURLConnection.setRequestMethod(String)>
				httpurlconnection.addRequestProperty("Content-Type", request.getPostBodyContentType());
	//   15   79:aload_0         
	//   16   80:ldc1            #13  <String "Content-Type">
	//   17   82:aload_1         
	//   18   83:invokevirtual   #171 <Method String Request.getPostBodyContentType()>
	//   19   86:invokevirtual   #58  <Method void HttpURLConnection.addRequestProperty(String, String)>
				httpurlconnection = ((HttpURLConnection) (new DataOutputStream(httpurlconnection.getOutputStream())));
	//   20   89:new             #60  <Class DataOutputStream>
	//   21   92:dup             
	//   22   93:aload_0         
	//   23   94:invokevirtual   #64  <Method java.io.OutputStream HttpURLConnection.getOutputStream()>
	//   24   97:invokespecial   #67  <Method void DataOutputStream(java.io.OutputStream)>
	//   25  100:astore_0        
				((DataOutputStream) (httpurlconnection)).write(abyte0);
	//   26  101:aload_0         
	//   27  102:aload_2         
	//   28  103:invokevirtual   #71  <Method void DataOutputStream.write(byte[])>
				((DataOutputStream) (httpurlconnection)).close();
	//   29  106:aload_0         
	//   30  107:invokevirtual   #74  <Method void DataOutputStream.close()>
				return;
	//   31  110:return          
			} else
	//*  32  111:aload_0         
	//*  33  112:ldc1            #173 <String "GET">
	//*  34  114:invokevirtual   #168 <Method void HttpURLConnection.setRequestMethod(String)>
	//*  35  117:return          
	//*  36  118:aload_0         
	//*  37  119:ldc1            #175 <String "DELETE">
	//*  38  121:invokevirtual   #168 <Method void HttpURLConnection.setRequestMethod(String)>
	//*  39  124:return          
	//*  40  125:aload_0         
	//*  41  126:ldc1            #165 <String "POST">
	//*  42  128:invokevirtual   #168 <Method void HttpURLConnection.setRequestMethod(String)>
	//*  43  131:aload_0         
	//*  44  132:aload_1         
	//*  45  133:invokestatic    #177 <Method void addBodyIfExists(HttpURLConnection, Request)>
	//*  46  136:return          
	//*  47  137:aload_0         
	//*  48  138:ldc1            #179 <String "PUT">
	//*  49  140:invokevirtual   #168 <Method void HttpURLConnection.setRequestMethod(String)>
	//*  50  143:aload_0         
	//*  51  144:aload_1         
	//*  52  145:invokestatic    #177 <Method void addBodyIfExists(HttpURLConnection, Request)>
	//*  53  148:return          
	//*  54  149:aload_0         
	//*  55  150:ldc1            #181 <String "HEAD">
	//*  56  152:invokevirtual   #168 <Method void HttpURLConnection.setRequestMethod(String)>
	//*  57  155:return          
	//*  58  156:aload_0         
	//*  59  157:ldc1            #183 <String "OPTIONS">
	//*  60  159:invokevirtual   #168 <Method void HttpURLConnection.setRequestMethod(String)>
	//*  61  162:return          
	//*  62  163:aload_0         
	//*  63  164:ldc1            #185 <String "TRACE">
	//*  64  166:invokevirtual   #168 <Method void HttpURLConnection.setRequestMethod(String)>
	//*  65  169:return          
	//*  66  170:aload_0         
	//*  67  171:ldc1            #187 <String "PATCH">
	//*  68  173:invokevirtual   #168 <Method void HttpURLConnection.setRequestMethod(String)>
	//*  69  176:aload_0         
	//*  70  177:aload_1         
	//*  71  178:invokestatic    #177 <Method void addBodyIfExists(HttpURLConnection, Request)>
	//*  72  181:return          
	//*  73  182:new             #189 <Class IllegalStateException>
	//*  74  185:dup             
	//*  75  186:ldc1            #191 <String "Unknown method type.">
	//*  76  188:invokespecial   #193 <Method void IllegalStateException(String)>
	//*  77  191:athrow          
			{
				return;
	//   78  192:return          
			}

		case 0: // '\0'
			httpurlconnection.setRequestMethod("GET");
			return;

		case 3: // '\003'
			httpurlconnection.setRequestMethod("DELETE");
			return;

		case 1: // '\001'
			httpurlconnection.setRequestMethod("POST");
			addBodyIfExists(httpurlconnection, request);
			return;

		case 2: // '\002'
			httpurlconnection.setRequestMethod("PUT");
			addBodyIfExists(httpurlconnection, request);
			return;

		case 4: // '\004'
			httpurlconnection.setRequestMethod("HEAD");
			return;

		case 5: // '\005'
			httpurlconnection.setRequestMethod("OPTIONS");
			return;

		case 6: // '\006'
			httpurlconnection.setRequestMethod("TRACE");
			return;

		case 7: // '\007'
			httpurlconnection.setRequestMethod("PATCH");
			addBodyIfExists(httpurlconnection, request);
			return;
		}
		throw new IllegalStateException("Unknown method type.");
	}

	protected HttpURLConnection createConnection(URL url)
		throws IOException
	{
		return (HttpURLConnection)url.openConnection();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #196 <Method java.net.URLConnection URL.openConnection()>
	//    2    4:checkcast       #46  <Class HttpURLConnection>
	//    3    7:areturn         
	}

	public HttpResponse performRequest(Request request, Map map)
		throws IOException, AuthFailureError
	{
		String s = request.getUrl();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #201 <Method String Request.getUrl()>
	//    2    4:astore_3        
		HashMap hashmap = new HashMap();
	//    3    5:new             #203 <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #204 <Method void HashMap()>
	//    6   12:astore          4
		hashmap.putAll(request.getHeaders());
	//    7   14:aload           4
	//    8   16:aload_1         
	//    9   17:invokevirtual   #208 <Method Map Request.getHeaders()>
	//   10   20:invokevirtual   #212 <Method void HashMap.putAll(Map)>
		hashmap.putAll(map);
	//   11   23:aload           4
	//   12   25:aload_2         
	//   13   26:invokevirtual   #212 <Method void HashMap.putAll(Map)>
		map = ((Map) (s));
	//   14   29:aload_3         
	//   15   30:astore_2        
		if(mUrlRewriter != null)
	//*  16   31:aload_0         
	//*  17   32:getfield        #30  <Field HurlStack$UrlRewriter mUrlRewriter>
	//*  18   35:ifnull          80
		{
			map = ((Map) (mUrlRewriter.rewriteUrl(s)));
	//   19   38:aload_0         
	//   20   39:getfield        #30  <Field HurlStack$UrlRewriter mUrlRewriter>
	//   21   42:aload_3         
	//   22   43:invokeinterface #216 <Method String HurlStack$UrlRewriter.rewriteUrl(String)>
	//   23   48:astore_2        
			if(map == null)
	//*  24   49:aload_2         
	//*  25   50:ifnonnull       80
				throw new IOException((new StringBuilder()).append("URL blocked by rewriter: ").append(s).toString());
	//   26   53:new             #36  <Class IOException>
	//   27   56:dup             
	//   28   57:new             #218 <Class StringBuilder>
	//   29   60:dup             
	//   30   61:invokespecial   #219 <Method void StringBuilder()>
	//   31   64:ldc1            #221 <String "URL blocked by rewriter: ">
	//   32   66:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   33   69:aload_3         
	//   34   70:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   35   73:invokevirtual   #228 <Method String StringBuilder.toString()>
	//   36   76:invokespecial   #229 <Method void IOException(String)>
	//   37   79:athrow          
		}
		map = ((Map) (openConnection(new URL(((String) (map))), request)));
	//   38   80:aload_0         
	//   39   81:new             #140 <Class URL>
	//   40   84:dup             
	//   41   85:aload_2         
	//   42   86:invokespecial   #230 <Method void URL(String)>
	//   43   89:aload_1         
	//   44   90:invokespecial   #232 <Method HttpURLConnection openConnection(URL, Request)>
	//   45   93:astore_2        
		String s1;
		for(Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); ((HttpURLConnection) (map)).addRequestProperty(s1, (String)hashmap.get(((Object) (s1)))))
	//*  46   94:aload           4
	//*  47   96:invokevirtual   #236 <Method Set HashMap.keySet()>
	//*  48   99:invokeinterface #242 <Method Iterator Set.iterator()>
	//*  49  104:astore_3        
	//*  50  105:aload_3         
	//*  51  106:invokeinterface #248 <Method boolean Iterator.hasNext()>
	//*  52  111:ifeq            144
			s1 = (String)iterator.next();
	//   53  114:aload_3         
	//   54  115:invokeinterface #252 <Method Object Iterator.next()>
	//   55  120:checkcast       #145 <Class String>
	//   56  123:astore          5

	//   57  125:aload_2         
	//   58  126:aload           5
	//   59  128:aload           4
	//   60  130:aload           5
	//   61  132:invokevirtual   #256 <Method Object HashMap.get(Object)>
	//   62  135:checkcast       #145 <Class String>
	//   63  138:invokevirtual   #58  <Method void HttpURLConnection.addRequestProperty(String, String)>
	//*  64  141:goto            105
		setConnectionParametersForRequest(((HttpURLConnection) (map)), request);
	//   65  144:aload_2         
	//   66  145:aload_1         
	//   67  146:invokestatic    #258 <Method void setConnectionParametersForRequest(HttpURLConnection, Request)>
		request = ((Request) (new ProtocolVersion("HTTP", 1, 1)));
	//   68  149:new             #260 <Class ProtocolVersion>
	//   69  152:dup             
	//   70  153:ldc2            #262 <String "HTTP">
	//   71  156:iconst_1        
	//   72  157:iconst_1        
	//   73  158:invokespecial   #265 <Method void ProtocolVersion(String, int, int)>
	//   74  161:astore_1        
		if(((HttpURLConnection) (map)).getResponseCode() == -1)
	//*  75  162:aload_2         
	//*  76  163:invokevirtual   #268 <Method int HttpURLConnection.getResponseCode()>
	//*  77  166:iconst_m1       
	//*  78  167:icmpne          181
			throw new IOException("Could not retrieve response code from HttpUrlConnection.");
	//   79  170:new             #36  <Class IOException>
	//   80  173:dup             
	//   81  174:ldc2            #270 <String "Could not retrieve response code from HttpUrlConnection.">
	//   82  177:invokespecial   #229 <Method void IOException(String)>
	//   83  180:athrow          
		request = ((Request) (new BasicHttpResponse(((org.apache.http.StatusLine) (new BasicStatusLine(((ProtocolVersion) (request)), ((HttpURLConnection) (map)).getResponseCode(), ((HttpURLConnection) (map)).getResponseMessage()))))));
	//   84  181:new             #272 <Class BasicHttpResponse>
	//   85  184:dup             
	//   86  185:new             #274 <Class BasicStatusLine>
	//   87  188:dup             
	//   88  189:aload_1         
	//   89  190:aload_2         
	//   90  191:invokevirtual   #268 <Method int HttpURLConnection.getResponseCode()>
	//   91  194:aload_2         
	//   92  195:invokevirtual   #277 <Method String HttpURLConnection.getResponseMessage()>
	//   93  198:invokespecial   #280 <Method void BasicStatusLine(ProtocolVersion, int, String)>
	//   94  201:invokespecial   #283 <Method void BasicHttpResponse(org.apache.http.StatusLine)>
	//   95  204:astore_1        
		((BasicHttpResponse) (request)).setEntity(entityFromConnection(((HttpURLConnection) (map))));
	//   96  205:aload_1         
	//   97  206:aload_2         
	//   98  207:invokestatic    #285 <Method HttpEntity entityFromConnection(HttpURLConnection)>
	//   99  210:invokevirtual   #289 <Method void BasicHttpResponse.setEntity(HttpEntity)>
		map = ((Map) (((HttpURLConnection) (map)).getHeaderFields().entrySet().iterator()));
	//  100  213:aload_2         
	//  101  214:invokevirtual   #292 <Method Map HttpURLConnection.getHeaderFields()>
	//  102  217:invokeinterface #297 <Method Set Map.entrySet()>
	//  103  222:invokeinterface #242 <Method Iterator Set.iterator()>
	//  104  227:astore_2        
		do
		{
			if(!((Iterator) (map)).hasNext())
				break;
	//  105  228:aload_2         
	//  106  229:invokeinterface #248 <Method boolean Iterator.hasNext()>
	//  107  234:ifeq            297
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//  108  237:aload_2         
	//  109  238:invokeinterface #252 <Method Object Iterator.next()>
	//  110  243:checkcast       #299 <Class java.util.Map$Entry>
	//  111  246:astore_3        
			if(entry.getKey() != null)
	//* 112  247:aload_3         
	//* 113  248:invokeinterface #302 <Method Object java.util.Map$Entry.getKey()>
	//* 114  253:ifnull          294
				((BasicHttpResponse) (request)).addHeader(((org.apache.http.Header) (new BasicHeader((String)entry.getKey(), (String)((List)entry.getValue()).get(0)))));
	//  115  256:aload_1         
	//  116  257:new             #304 <Class BasicHeader>
	//  117  260:dup             
	//  118  261:aload_3         
	//  119  262:invokeinterface #302 <Method Object java.util.Map$Entry.getKey()>
	//  120  267:checkcast       #145 <Class String>
	//  121  270:aload_3         
	//  122  271:invokeinterface #307 <Method Object java.util.Map$Entry.getValue()>
	//  123  276:checkcast       #309 <Class List>
	//  124  279:iconst_0        
	//  125  280:invokeinterface #312 <Method Object List.get(int)>
	//  126  285:checkcast       #145 <Class String>
	//  127  288:invokespecial   #314 <Method void BasicHeader(String, String)>
	//  128  291:invokevirtual   #318 <Method void BasicHttpResponse.addHeader(org.apache.http.Header)>
		} while(true);
	//  129  294:goto            228
		return ((HttpResponse) (request));
	//  130  297:aload_1         
	//  131  298:areturn         
	}

	private static final String HEADER_CONTENT_TYPE = "Content-Type";
	private final SSLSocketFactory mSslSocketFactory;
	private final UrlRewriter mUrlRewriter;
}
