// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import com.android.volley.*;
import com.newrelic.agent.android.instrumentation.URLConnectionInstrumentation;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

// Referenced classes of package com.android.volley.toolbox:
//			BaseHttpStack, HttpResponse

public class HurlStack extends BaseHttpStack
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
	//    2    2:invokespecial   #17  <Method void HurlStack(HurlStack$UrlRewriter)>
	//    3    5:return          
	}

	public HurlStack(UrlRewriter urlrewriter)
	{
		this(urlrewriter, ((SSLSocketFactory) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #21  <Method void HurlStack(HurlStack$UrlRewriter, SSLSocketFactory)>
	//    4    6:return          
	}

	public HurlStack(UrlRewriter urlrewriter, SSLSocketFactory sslsocketfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void BaseHttpStack()>
		mUrlRewriter = urlrewriter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field HurlStack$UrlRewriter mUrlRewriter>
		mSslSocketFactory = sslsocketfactory;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field SSLSocketFactory mSslSocketFactory>
	//    8   14:return          
	}

	private static void addBody(HttpURLConnection httpurlconnection, Request request, byte abyte0[])
		throws IOException, AuthFailureError
	{
		httpurlconnection.setDoOutput(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #39  <Method void HttpURLConnection.setDoOutput(boolean)>
		httpurlconnection.addRequestProperty("Content-Type", request.getBodyContentType());
	//    3    5:aload_0         
	//    4    6:ldc1            #41  <String "Content-Type">
	//    5    8:aload_1         
	//    6    9:invokevirtual   #47  <Method String Request.getBodyContentType()>
	//    7   12:invokevirtual   #51  <Method void HttpURLConnection.addRequestProperty(String, String)>
		httpurlconnection = ((HttpURLConnection) (new DataOutputStream(httpurlconnection.getOutputStream())));
	//    8   15:new             #53  <Class DataOutputStream>
	//    9   18:dup             
	//   10   19:aload_0         
	//   11   20:invokevirtual   #57  <Method java.io.OutputStream HttpURLConnection.getOutputStream()>
	//   12   23:invokespecial   #60  <Method void DataOutputStream(java.io.OutputStream)>
	//   13   26:astore_0        
		((DataOutputStream) (httpurlconnection)).write(abyte0);
	//   14   27:aload_0         
	//   15   28:aload_2         
	//   16   29:invokevirtual   #64  <Method void DataOutputStream.write(byte[])>
		((DataOutputStream) (httpurlconnection)).close();
	//   17   32:aload_0         
	//   18   33:invokevirtual   #67  <Method void DataOutputStream.close()>
	//   19   36:return          
	}

	private static void addBodyIfExists(HttpURLConnection httpurlconnection, Request request)
		throws IOException, AuthFailureError
	{
		byte abyte0[] = request.getBody();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #76  <Method byte[] Request.getBody()>
	//    2    4:astore_2        
		if(abyte0 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			addBody(httpurlconnection, request, abyte0);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokestatic    #78  <Method void addBody(HttpURLConnection, Request, byte[])>
	//    9   15:return          
	}

	static List convertHeaders(Map map)
	{
		ArrayList arraylist = new ArrayList(map.size());
	//    0    0:new             #83  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #89  <Method int Map.size()>
	//    4   10:invokespecial   #92  <Method void ArrayList(int)>
	//    5   13:astore_1        
		map = ((Map) (map.entrySet().iterator()));
	//    6   14:aload_0         
	//    7   15:invokeinterface #96  <Method Set Map.entrySet()>
	//    8   20:invokeinterface #102 <Method Iterator Set.iterator()>
	//    9   25:astore_0        
		do
		{
			if(!((Iterator) (map)).hasNext())
				break;
	//   10   26:aload_0         
	//   11   27:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//   12   32:ifeq            117
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   13   35:aload_0         
	//   14   36:invokeinterface #112 <Method Object Iterator.next()>
	//   15   41:checkcast       #114 <Class java.util.Map$Entry>
	//   16   44:astore_2        
			if(entry.getKey() != null)
	//*  17   45:aload_2         
	//*  18   46:invokeinterface #117 <Method Object java.util.Map$Entry.getKey()>
	//*  19   51:ifnull          26
			{
				Iterator iterator = ((List)entry.getValue()).iterator();
	//   20   54:aload_2         
	//   21   55:invokeinterface #120 <Method Object java.util.Map$Entry.getValue()>
	//   22   60:checkcast       #122 <Class List>
	//   23   63:invokeinterface #123 <Method Iterator List.iterator()>
	//   24   68:astore_3        
				while(iterator.hasNext()) 
	//*  25   69:aload_3         
	//*  26   70:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//*  27   75:ifeq            26
				{
					String s = (String)iterator.next();
	//   28   78:aload_3         
	//   29   79:invokeinterface #112 <Method Object Iterator.next()>
	//   30   84:checkcast       #125 <Class String>
	//   31   87:astore          4
					((List) (arraylist)).add(((Object) (new Header((String)entry.getKey(), s))));
	//   32   89:aload_1         
	//   33   90:new             #127 <Class Header>
	//   34   93:dup             
	//   35   94:aload_2         
	//   36   95:invokeinterface #117 <Method Object java.util.Map$Entry.getKey()>
	//   37  100:checkcast       #125 <Class String>
	//   38  103:aload           4
	//   39  105:invokespecial   #129 <Method void Header(String, String)>
	//   40  108:invokeinterface #133 <Method boolean List.add(Object)>
	//   41  113:pop             
				}
			}
		} while(true);
	//   42  114:goto            69
		return ((List) (arraylist));
	//   43  117:aload_1         
	//   44  118:areturn         
	}

	private static boolean hasResponseBody(int i, int j)
	{
		return i != 4 && (100 > j || j >= 200) && j != 204 && j != 304;
	//    0    0:iload_0         
	//    1    1:iconst_4        
	//    2    2:icmpeq          34
	//    3    5:bipush          100
	//    4    7:iload_1         
	//    5    8:icmpgt          18
	//    6   11:iload_1         
	//    7   12:sipush          200
	//    8   15:icmplt          34
	//    9   18:iload_1         
	//   10   19:sipush          204
	//   11   22:icmpeq          34
	//   12   25:iload_1         
	//   13   26:sipush          304
	//   14   29:icmpeq          34
	//   15   32:iconst_1        
	//   16   33:ireturn         
	//   17   34:iconst_0        
	//   18   35:ireturn         
	}

	private static InputStream inputStreamFromConnection(HttpURLConnection httpurlconnection)
	{
		IOException ioexception;
		InputStream inputstream;
		try
		{
			inputstream = httpurlconnection.getInputStream();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #142 <Method InputStream HttpURLConnection.getInputStream()>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #145 <Method InputStream HttpURLConnection.getErrorStream()>
	//*   7   11:areturn         
		// Misplaced declaration of an exception variable
		catch(IOException ioexception)
		{
			return httpurlconnection.getErrorStream();
		}
		return inputstream;
	//*   8   12:astore_1        
	//*   9   13:goto            7
	}

	private HttpURLConnection openConnection(URL url, Request request)
		throws IOException
	{
		HttpURLConnection httpurlconnection = createConnection(url);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #151 <Method HttpURLConnection createConnection(URL)>
	//    3    5:astore          4
		int i = request.getTimeoutMs();
	//    4    7:aload_2         
	//    5    8:invokevirtual   #154 <Method int Request.getTimeoutMs()>
	//    6   11:istore_3        
		httpurlconnection.setConnectTimeout(i);
	//    7   12:aload           4
	//    8   14:iload_3         
	//    9   15:invokevirtual   #157 <Method void HttpURLConnection.setConnectTimeout(int)>
		httpurlconnection.setReadTimeout(i);
	//   10   18:aload           4
	//   11   20:iload_3         
	//   12   21:invokevirtual   #160 <Method void HttpURLConnection.setReadTimeout(int)>
		httpurlconnection.setUseCaches(false);
	//   13   24:aload           4
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #163 <Method void HttpURLConnection.setUseCaches(boolean)>
		httpurlconnection.setDoInput(true);
	//   16   30:aload           4
	//   17   32:iconst_1        
	//   18   33:invokevirtual   #166 <Method void HttpURLConnection.setDoInput(boolean)>
		if("https".equals(((Object) (url.getProtocol()))))
	//*  19   36:ldc1            #168 <String "https">
	//*  20   38:aload_1         
	//*  21   39:invokevirtual   #173 <Method String URL.getProtocol()>
	//*  22   42:invokevirtual   #176 <Method boolean String.equals(Object)>
	//*  23   45:ifeq            66
		{
			url = ((URL) (mSslSocketFactory));
	//   24   48:aload_0         
	//   25   49:getfield        #27  <Field SSLSocketFactory mSslSocketFactory>
	//   26   52:astore_1        
			if(url != null)
	//*  27   53:aload_1         
	//*  28   54:ifnull          66
				((HttpsURLConnection)httpurlconnection).setSSLSocketFactory(((SSLSocketFactory) (url)));
	//   29   57:aload           4
	//   30   59:checkcast       #178 <Class HttpsURLConnection>
	//   31   62:aload_1         
	//   32   63:invokevirtual   #182 <Method void HttpsURLConnection.setSSLSocketFactory(SSLSocketFactory)>
		}
		return httpurlconnection;
	//   33   66:aload           4
	//   34   68:areturn         
	}

	static void setConnectionParametersForRequest(HttpURLConnection httpurlconnection, Request request)
		throws IOException, AuthFailureError
	{
		byte abyte0[];
		switch(request.getMethod())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #187 <Method int Request.getMethod()>
		{
	//*   2    4:tableswitch     -1 7: default 56
	//	               -1 137
	//	               0 130
	//	               1 118
	//	               2 106
	//	               3 99
	//	               4 92
	//	               5 85
	//	               6 78
	//	               7 66
		default:
			throw new IllegalStateException("Unknown method type.");
	//    3   56:new             #189 <Class IllegalStateException>
	//    4   59:dup             
	//    5   60:ldc1            #191 <String "Unknown method type.">
	//    6   62:invokespecial   #194 <Method void IllegalStateException(String)>
	//    7   65:athrow          

		case 7: // '\007'
			httpurlconnection.setRequestMethod("PATCH");
	//    8   66:aload_0         
	//    9   67:ldc1            #196 <String "PATCH">
	//   10   69:invokevirtual   #199 <Method void HttpURLConnection.setRequestMethod(String)>
			addBodyIfExists(httpurlconnection, request);
	//   11   72:aload_0         
	//   12   73:aload_1         
	//   13   74:invokestatic    #201 <Method void addBodyIfExists(HttpURLConnection, Request)>
			return;
	//   14   77:return          

		case 6: // '\006'
			httpurlconnection.setRequestMethod("TRACE");
	//   15   78:aload_0         
	//   16   79:ldc1            #203 <String "TRACE">
	//   17   81:invokevirtual   #199 <Method void HttpURLConnection.setRequestMethod(String)>
			return;
	//   18   84:return          

		case 5: // '\005'
			httpurlconnection.setRequestMethod("OPTIONS");
	//   19   85:aload_0         
	//   20   86:ldc1            #205 <String "OPTIONS">
	//   21   88:invokevirtual   #199 <Method void HttpURLConnection.setRequestMethod(String)>
			return;
	//   22   91:return          

		case 4: // '\004'
			httpurlconnection.setRequestMethod("HEAD");
	//   23   92:aload_0         
	//   24   93:ldc1            #207 <String "HEAD">
	//   25   95:invokevirtual   #199 <Method void HttpURLConnection.setRequestMethod(String)>
			return;
	//   26   98:return          

		case 3: // '\003'
			httpurlconnection.setRequestMethod("DELETE");
	//   27   99:aload_0         
	//   28  100:ldc1            #209 <String "DELETE">
	//   29  102:invokevirtual   #199 <Method void HttpURLConnection.setRequestMethod(String)>
			return;
	//   30  105:return          

		case 2: // '\002'
			httpurlconnection.setRequestMethod("PUT");
	//   31  106:aload_0         
	//   32  107:ldc1            #211 <String "PUT">
	//   33  109:invokevirtual   #199 <Method void HttpURLConnection.setRequestMethod(String)>
			addBodyIfExists(httpurlconnection, request);
	//   34  112:aload_0         
	//   35  113:aload_1         
	//   36  114:invokestatic    #201 <Method void addBodyIfExists(HttpURLConnection, Request)>
			return;
	//   37  117:return          

		case 1: // '\001'
			httpurlconnection.setRequestMethod("POST");
	//   38  118:aload_0         
	//   39  119:ldc1            #213 <String "POST">
	//   40  121:invokevirtual   #199 <Method void HttpURLConnection.setRequestMethod(String)>
			addBodyIfExists(httpurlconnection, request);
	//   41  124:aload_0         
	//   42  125:aload_1         
	//   43  126:invokestatic    #201 <Method void addBodyIfExists(HttpURLConnection, Request)>
			return;
	//   44  129:return          

		case 0: // '\0'
			httpurlconnection.setRequestMethod("GET");
	//   45  130:aload_0         
	//   46  131:ldc1            #215 <String "GET">
	//   47  133:invokevirtual   #199 <Method void HttpURLConnection.setRequestMethod(String)>
			return;
	//   48  136:return          

		case -1: 
			abyte0 = request.getPostBody();
	//   49  137:aload_1         
	//   50  138:invokevirtual   #218 <Method byte[] Request.getPostBody()>
	//   51  141:astore_2        
			break;
		}
		if(abyte0 != null)
	//*  52  142:aload_2         
	//*  53  143:ifnull          158
		{
			httpurlconnection.setRequestMethod("POST");
	//   54  146:aload_0         
	//   55  147:ldc1            #213 <String "POST">
	//   56  149:invokevirtual   #199 <Method void HttpURLConnection.setRequestMethod(String)>
			addBody(httpurlconnection, request, abyte0);
	//   57  152:aload_0         
	//   58  153:aload_1         
	//   59  154:aload_2         
	//   60  155:invokestatic    #78  <Method void addBody(HttpURLConnection, Request, byte[])>
		}
	//   61  158:return          
	}

	protected HttpURLConnection createConnection(URL url)
		throws IOException
	{
		url = ((URL) ((HttpURLConnection)URLConnectionInstrumentation.openConnection(url.openConnection())));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #221 <Method java.net.URLConnection URL.openConnection()>
	//    2    4:invokestatic    #226 <Method java.net.URLConnection URLConnectionInstrumentation.openConnection(java.net.URLConnection)>
	//    3    7:checkcast       #35  <Class HttpURLConnection>
	//    4   10:astore_1        
		((HttpURLConnection) (url)).setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
	//    5   11:aload_1         
	//    6   12:invokestatic    #229 <Method boolean HttpURLConnection.getFollowRedirects()>
	//    7   15:invokevirtual   #232 <Method void HttpURLConnection.setInstanceFollowRedirects(boolean)>
		return ((HttpURLConnection) (url));
	//    8   18:aload_1         
	//    9   19:areturn         
	}

	public HttpResponse executeRequest(Request request, Map map)
		throws IOException, AuthFailureError
	{
		String s = request.getUrl();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #237 <Method String Request.getUrl()>
	//    2    4:astore          4
		HashMap hashmap = new HashMap();
	//    3    6:new             #239 <Class HashMap>
	//    4    9:dup             
	//    5   10:invokespecial   #240 <Method void HashMap()>
	//    6   13:astore          5
		hashmap.putAll(request.getHeaders());
	//    7   15:aload           5
	//    8   17:aload_1         
	//    9   18:invokevirtual   #244 <Method Map Request.getHeaders()>
	//   10   21:invokevirtual   #248 <Method void HashMap.putAll(Map)>
		hashmap.putAll(map);
	//   11   24:aload           5
	//   12   26:aload_2         
	//   13   27:invokevirtual   #248 <Method void HashMap.putAll(Map)>
		map = ((Map) (mUrlRewriter));
	//   14   30:aload_0         
	//   15   31:getfield        #25  <Field HurlStack$UrlRewriter mUrlRewriter>
	//   16   34:astore_2        
		if(map != null)
	//*  17   35:aload_2         
	//*  18   36:ifnull          90
		{
			map = ((Map) (((UrlRewriter) (map)).rewriteUrl(s)));
	//   19   39:aload_2         
	//   20   40:aload           4
	//   21   42:invokeinterface #252 <Method String HurlStack$UrlRewriter.rewriteUrl(String)>
	//   22   47:astore_2        
			if(map == null)
	//*  23   48:aload_2         
	//*  24   49:ifnull          55
	//*  25   52:goto            93
			{
				request = ((Request) (new StringBuilder()));
	//   26   55:new             #254 <Class StringBuilder>
	//   27   58:dup             
	//   28   59:invokespecial   #255 <Method void StringBuilder()>
	//   29   62:astore_1        
				((StringBuilder) (request)).append("URL blocked by rewriter: ");
	//   30   63:aload_1         
	//   31   64:ldc2            #257 <String "URL blocked by rewriter: ">
	//   32   67:invokevirtual   #261 <Method StringBuilder StringBuilder.append(String)>
	//   33   70:pop             
				((StringBuilder) (request)).append(s);
	//   34   71:aload_1         
	//   35   72:aload           4
	//   36   74:invokevirtual   #261 <Method StringBuilder StringBuilder.append(String)>
	//   37   77:pop             
				throw new IOException(((StringBuilder) (request)).toString());
	//   38   78:new             #31  <Class IOException>
	//   39   81:dup             
	//   40   82:aload_1         
	//   41   83:invokevirtual   #264 <Method String StringBuilder.toString()>
	//   42   86:invokespecial   #265 <Method void IOException(String)>
	//   43   89:athrow          
			}
		} else
		{
			map = ((Map) (s));
	//   44   90:aload           4
	//   45   92:astore_2        
		}
		map = ((Map) (openConnection(new URL(((String) (map))), request)));
	//   46   93:aload_0         
	//   47   94:new             #170 <Class URL>
	//   48   97:dup             
	//   49   98:aload_2         
	//   50   99:invokespecial   #266 <Method void URL(String)>
	//   51  102:aload_1         
	//   52  103:invokespecial   #268 <Method HttpURLConnection openConnection(URL, Request)>
	//   53  106:astore_2        
		String s1;
		for(Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); ((HttpURLConnection) (map)).addRequestProperty(s1, (String)hashmap.get(((Object) (s1)))))
	//*  54  107:aload           5
	//*  55  109:invokevirtual   #271 <Method Set HashMap.keySet()>
	//*  56  112:invokeinterface #102 <Method Iterator Set.iterator()>
	//*  57  117:astore          4
	//*  58  119:aload           4
	//*  59  121:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//*  60  126:ifeq            160
			s1 = (String)iterator.next();
	//   61  129:aload           4
	//   62  131:invokeinterface #112 <Method Object Iterator.next()>
	//   63  136:checkcast       #125 <Class String>
	//   64  139:astore          6

	//   65  141:aload_2         
	//   66  142:aload           6
	//   67  144:aload           5
	//   68  146:aload           6
	//   69  148:invokevirtual   #275 <Method Object HashMap.get(Object)>
	//   70  151:checkcast       #125 <Class String>
	//   71  154:invokevirtual   #51  <Method void HttpURLConnection.addRequestProperty(String, String)>
	//*  72  157:goto            119
		setConnectionParametersForRequest(((HttpURLConnection) (map)), request);
	//   73  160:aload_2         
	//   74  161:aload_1         
	//   75  162:invokestatic    #277 <Method void setConnectionParametersForRequest(HttpURLConnection, Request)>
		int i = ((HttpURLConnection) (map)).getResponseCode();
	//   76  165:aload_2         
	//   77  166:invokevirtual   #280 <Method int HttpURLConnection.getResponseCode()>
	//   78  169:istore_3        
		if(i != -1)
	//*  79  170:iload_3         
	//*  80  171:iconst_m1       
	//*  81  172:icmpeq          226
		{
			if(!hasResponseBody(request.getMethod(), i))
	//*  82  175:aload_1         
	//*  83  176:invokevirtual   #187 <Method int Request.getMethod()>
	//*  84  179:iload_3         
	//*  85  180:invokestatic    #282 <Method boolean hasResponseBody(int, int)>
	//*  86  183:ifne            202
				return new HttpResponse(i, convertHeaders(((HttpURLConnection) (map)).getHeaderFields()));
	//   87  186:new             #284 <Class HttpResponse>
	//   88  189:dup             
	//   89  190:iload_3         
	//   90  191:aload_2         
	//   91  192:invokevirtual   #287 <Method Map HttpURLConnection.getHeaderFields()>
	//   92  195:invokestatic    #289 <Method List convertHeaders(Map)>
	//   93  198:invokespecial   #292 <Method void HttpResponse(int, List)>
	//   94  201:areturn         
			else
				return new HttpResponse(i, convertHeaders(((HttpURLConnection) (map)).getHeaderFields()), ((HttpURLConnection) (map)).getContentLength(), inputStreamFromConnection(((HttpURLConnection) (map))));
	//   95  202:new             #284 <Class HttpResponse>
	//   96  205:dup             
	//   97  206:iload_3         
	//   98  207:aload_2         
	//   99  208:invokevirtual   #287 <Method Map HttpURLConnection.getHeaderFields()>
	//  100  211:invokestatic    #289 <Method List convertHeaders(Map)>
	//  101  214:aload_2         
	//  102  215:invokevirtual   #295 <Method int HttpURLConnection.getContentLength()>
	//  103  218:aload_2         
	//  104  219:invokestatic    #297 <Method InputStream inputStreamFromConnection(HttpURLConnection)>
	//  105  222:invokespecial   #300 <Method void HttpResponse(int, List, int, InputStream)>
	//  106  225:areturn         
		} else
		{
			throw new IOException("Could not retrieve response code from HttpUrlConnection.");
	//  107  226:new             #31  <Class IOException>
	//  108  229:dup             
	//  109  230:ldc2            #302 <String "Could not retrieve response code from HttpUrlConnection.">
	//  110  233:invokespecial   #265 <Method void IOException(String)>
	//  111  236:athrow          
		}
	}

	private final SSLSocketFactory mSslSocketFactory;
	private final UrlRewriter mUrlRewriter;
}
