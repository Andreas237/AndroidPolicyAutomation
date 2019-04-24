// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

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

// Referenced classes of package com.google.android.gms.internal:
//			zzy, zzk, zza

public class zzz
	implements zzy
{
	public static interface zza
	{

		public abstract String zzh(String s);
	}


	public zzz()
	{
		this(((zza) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #18  <Method void zzz(zzz$zza)>
	//    3    5:return          
	}

	public zzz(zza zza1)
	{
		this(zza1, ((SSLSocketFactory) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #22  <Method void zzz(zzz$zza, SSLSocketFactory)>
	//    4    6:return          
	}

	public zzz(zza zza1, SSLSocketFactory sslsocketfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		zzaD = zza1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field zzz$zza zzaD>
		zzaE = sslsocketfactory;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field SSLSocketFactory zzaE>
	//    8   14:return          
	}

	private HttpURLConnection zza(URL url, zzk zzk1)
		throws IOException
	{
		HttpURLConnection httpurlconnection = zza(url);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #34  <Method HttpURLConnection zza(URL)>
	//    3    5:astore          4
		int i = zzk1.zzp();
	//    4    7:aload_2         
	//    5    8:invokevirtual   #40  <Method int zzk.zzp()>
	//    6   11:istore_3        
		httpurlconnection.setConnectTimeout(i);
	//    7   12:aload           4
	//    8   14:iload_3         
	//    9   15:invokevirtual   #46  <Method void HttpURLConnection.setConnectTimeout(int)>
		httpurlconnection.setReadTimeout(i);
	//   10   18:aload           4
	//   11   20:iload_3         
	//   12   21:invokevirtual   #49  <Method void HttpURLConnection.setReadTimeout(int)>
		httpurlconnection.setUseCaches(false);
	//   13   24:aload           4
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #53  <Method void HttpURLConnection.setUseCaches(boolean)>
		httpurlconnection.setDoInput(true);
	//   16   30:aload           4
	//   17   32:iconst_1        
	//   18   33:invokevirtual   #56  <Method void HttpURLConnection.setDoInput(boolean)>
		if("https".equals(((Object) (url.getProtocol()))) && zzaE != null)
	//*  19   36:ldc1            #58  <String "https">
	//*  20   38:aload_1         
	//*  21   39:invokevirtual   #64  <Method String URL.getProtocol()>
	//*  22   42:invokevirtual   #70  <Method boolean String.equals(Object)>
	//*  23   45:ifeq            67
	//*  24   48:aload_0         
	//*  25   49:getfield        #28  <Field SSLSocketFactory zzaE>
	//*  26   52:ifnull          67
			((HttpsURLConnection)httpurlconnection).setSSLSocketFactory(zzaE);
	//   27   55:aload           4
	//   28   57:checkcast       #72  <Class HttpsURLConnection>
	//   29   60:aload_0         
	//   30   61:getfield        #28  <Field SSLSocketFactory zzaE>
	//   31   64:invokevirtual   #76  <Method void HttpsURLConnection.setSSLSocketFactory(SSLSocketFactory)>
		return httpurlconnection;
	//   32   67:aload           4
	//   33   69:areturn         
	}

	private static HttpEntity zza(HttpURLConnection httpurlconnection)
	{
		BasicHttpEntity basichttpentity = new BasicHttpEntity();
	//    0    0:new             #82  <Class BasicHttpEntity>
	//    1    3:dup             
	//    2    4:invokespecial   #83  <Method void BasicHttpEntity()>
	//    3    7:astore_2        
		java.io.InputStream inputstream;
		try
		{
			inputstream = httpurlconnection.getInputStream();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #87  <Method java.io.InputStream HttpURLConnection.getInputStream()>
	//    6   12:astore_1        
		}
	//*   7   13:aload_2         
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #91  <Method void BasicHttpEntity.setContent(java.io.InputStream)>
	//*  10   18:aload_2         
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #94  <Method int HttpURLConnection.getContentLength()>
	//*  13   23:i2l             
	//*  14   24:invokevirtual   #98  <Method void BasicHttpEntity.setContentLength(long)>
	//*  15   27:aload_2         
	//*  16   28:aload_0         
	//*  17   29:invokevirtual   #101 <Method String HttpURLConnection.getContentEncoding()>
	//*  18   32:invokevirtual   #105 <Method void BasicHttpEntity.setContentEncoding(String)>
	//*  19   35:aload_2         
	//*  20   36:aload_0         
	//*  21   37:invokevirtual   #108 <Method String HttpURLConnection.getContentType()>
	//*  22   40:invokevirtual   #111 <Method void BasicHttpEntity.setContentType(String)>
	//*  23   43:aload_2         
	//*  24   44:areturn         
		catch(IOException ioexception)
	//*  25   45:astore_1        
		{
			ioexception = ((IOException) (httpurlconnection.getErrorStream()));
	//   26   46:aload_0         
	//   27   47:invokevirtual   #114 <Method java.io.InputStream HttpURLConnection.getErrorStream()>
	//   28   50:astore_1        
		}
		basichttpentity.setContent(inputstream);
		basichttpentity.setContentLength(httpurlconnection.getContentLength());
		basichttpentity.setContentEncoding(httpurlconnection.getContentEncoding());
		basichttpentity.setContentType(httpurlconnection.getContentType());
		return ((HttpEntity) (basichttpentity));
	//*  29   51:goto            13
	}

	static void zza(HttpURLConnection httpurlconnection, zzk zzk1)
		throws IOException, com.google.android.gms.internal.zza
	{
		switch(zzk1.getMethod())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #120 <Method int zzk.getMethod()>
		{
	//*   2    4:tableswitch     -1 7: default 56
	//	               -1 66
	//	               0 118
	//	               1 132
	//	               2 144
	//	               3 125
	//	               4 156
	//	               5 163
	//	               6 170
	//	               7 177
		default:
			throw new IllegalStateException("Unknown method type.");
	//    3   56:new             #122 <Class IllegalStateException>
	//    4   59:dup             
	//    5   60:ldc1            #124 <String "Unknown method type.">
	//    6   62:invokespecial   #126 <Method void IllegalStateException(String)>
	//    7   65:athrow          

		case -1: 
			byte abyte0[] = zzk1.zzj();
	//    8   66:aload_1         
	//    9   67:invokevirtual   #130 <Method byte[] zzk.zzj()>
	//   10   70:astore_2        
			if(abyte0 != null)
	//*  11   71:aload_2         
	//*  12   72:ifnull          117
			{
				httpurlconnection.setDoOutput(true);
	//   13   75:aload_0         
	//   14   76:iconst_1        
	//   15   77:invokevirtual   #133 <Method void HttpURLConnection.setDoOutput(boolean)>
				httpurlconnection.setRequestMethod("POST");
	//   16   80:aload_0         
	//   17   81:ldc1            #135 <String "POST">
	//   18   83:invokevirtual   #138 <Method void HttpURLConnection.setRequestMethod(String)>
				httpurlconnection.addRequestProperty("Content-Type", zzk1.zzi());
	//   19   86:aload_0         
	//   20   87:ldc1            #140 <String "Content-Type">
	//   21   89:aload_1         
	//   22   90:invokevirtual   #143 <Method String zzk.zzi()>
	//   23   93:invokevirtual   #147 <Method void HttpURLConnection.addRequestProperty(String, String)>
				httpurlconnection = ((HttpURLConnection) (new DataOutputStream(httpurlconnection.getOutputStream())));
	//   24   96:new             #149 <Class DataOutputStream>
	//   25   99:dup             
	//   26  100:aload_0         
	//   27  101:invokevirtual   #153 <Method java.io.OutputStream HttpURLConnection.getOutputStream()>
	//   28  104:invokespecial   #156 <Method void DataOutputStream(java.io.OutputStream)>
	//   29  107:astore_0        
				((DataOutputStream) (httpurlconnection)).write(abyte0);
	//   30  108:aload_0         
	//   31  109:aload_2         
	//   32  110:invokevirtual   #160 <Method void DataOutputStream.write(byte[])>
				((DataOutputStream) (httpurlconnection)).close();
	//   33  113:aload_0         
	//   34  114:invokevirtual   #163 <Method void DataOutputStream.close()>
			}
			return;
	//   35  117:return          

		case 0: // '\0'
			httpurlconnection.setRequestMethod("GET");
	//   36  118:aload_0         
	//   37  119:ldc1            #165 <String "GET">
	//   38  121:invokevirtual   #138 <Method void HttpURLConnection.setRequestMethod(String)>
			return;
	//   39  124:return          

		case 3: // '\003'
			httpurlconnection.setRequestMethod("DELETE");
	//   40  125:aload_0         
	//   41  126:ldc1            #167 <String "DELETE">
	//   42  128:invokevirtual   #138 <Method void HttpURLConnection.setRequestMethod(String)>
			return;
	//   43  131:return          

		case 1: // '\001'
			httpurlconnection.setRequestMethod("POST");
	//   44  132:aload_0         
	//   45  133:ldc1            #135 <String "POST">
	//   46  135:invokevirtual   #138 <Method void HttpURLConnection.setRequestMethod(String)>
			zzb(httpurlconnection, zzk1);
	//   47  138:aload_0         
	//   48  139:aload_1         
	//   49  140:invokestatic    #170 <Method void zzb(HttpURLConnection, zzk)>
			return;
	//   50  143:return          

		case 2: // '\002'
			httpurlconnection.setRequestMethod("PUT");
	//   51  144:aload_0         
	//   52  145:ldc1            #172 <String "PUT">
	//   53  147:invokevirtual   #138 <Method void HttpURLConnection.setRequestMethod(String)>
			zzb(httpurlconnection, zzk1);
	//   54  150:aload_0         
	//   55  151:aload_1         
	//   56  152:invokestatic    #170 <Method void zzb(HttpURLConnection, zzk)>
			return;
	//   57  155:return          

		case 4: // '\004'
			httpurlconnection.setRequestMethod("HEAD");
	//   58  156:aload_0         
	//   59  157:ldc1            #174 <String "HEAD">
	//   60  159:invokevirtual   #138 <Method void HttpURLConnection.setRequestMethod(String)>
			return;
	//   61  162:return          

		case 5: // '\005'
			httpurlconnection.setRequestMethod("OPTIONS");
	//   62  163:aload_0         
	//   63  164:ldc1            #176 <String "OPTIONS">
	//   64  166:invokevirtual   #138 <Method void HttpURLConnection.setRequestMethod(String)>
			return;
	//   65  169:return          

		case 6: // '\006'
			httpurlconnection.setRequestMethod("TRACE");
	//   66  170:aload_0         
	//   67  171:ldc1            #178 <String "TRACE">
	//   68  173:invokevirtual   #138 <Method void HttpURLConnection.setRequestMethod(String)>
			return;
	//   69  176:return          

		case 7: // '\007'
			httpurlconnection.setRequestMethod("PATCH");
	//   70  177:aload_0         
	//   71  178:ldc1            #180 <String "PATCH">
	//   72  180:invokevirtual   #138 <Method void HttpURLConnection.setRequestMethod(String)>
			zzb(httpurlconnection, zzk1);
	//   73  183:aload_0         
	//   74  184:aload_1         
	//   75  185:invokestatic    #170 <Method void zzb(HttpURLConnection, zzk)>
			return;
	//   76  188:return          
		}
	}

	private static void zzb(HttpURLConnection httpurlconnection, zzk zzk1)
		throws IOException, com.google.android.gms.internal.zza
	{
		byte abyte0[] = zzk1.zzm();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #184 <Method byte[] zzk.zzm()>
	//    2    4:astore_2        
		if(abyte0 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          45
		{
			httpurlconnection.setDoOutput(true);
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #133 <Method void HttpURLConnection.setDoOutput(boolean)>
			httpurlconnection.addRequestProperty("Content-Type", zzk1.zzl());
	//    8   14:aload_0         
	//    9   15:ldc1            #140 <String "Content-Type">
	//   10   17:aload_1         
	//   11   18:invokevirtual   #187 <Method String zzk.zzl()>
	//   12   21:invokevirtual   #147 <Method void HttpURLConnection.addRequestProperty(String, String)>
			httpurlconnection = ((HttpURLConnection) (new DataOutputStream(httpurlconnection.getOutputStream())));
	//   13   24:new             #149 <Class DataOutputStream>
	//   14   27:dup             
	//   15   28:aload_0         
	//   16   29:invokevirtual   #153 <Method java.io.OutputStream HttpURLConnection.getOutputStream()>
	//   17   32:invokespecial   #156 <Method void DataOutputStream(java.io.OutputStream)>
	//   18   35:astore_0        
			((DataOutputStream) (httpurlconnection)).write(abyte0);
	//   19   36:aload_0         
	//   20   37:aload_2         
	//   21   38:invokevirtual   #160 <Method void DataOutputStream.write(byte[])>
			((DataOutputStream) (httpurlconnection)).close();
	//   22   41:aload_0         
	//   23   42:invokevirtual   #163 <Method void DataOutputStream.close()>
		}
	//   24   45:return          
	}

	protected HttpURLConnection zza(URL url)
		throws IOException
	{
		return (HttpURLConnection)url.openConnection();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #191 <Method java.net.URLConnection URL.openConnection()>
	//    2    4:checkcast       #42  <Class HttpURLConnection>
	//    3    7:areturn         
	}

	public HttpResponse zza(zzk zzk1, Map map)
		throws IOException, com.google.android.gms.internal.zza
	{
		String s = zzk1.getUrl();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #195 <Method String zzk.getUrl()>
	//    2    4:astore_3        
		HashMap hashmap = new HashMap();
	//    3    5:new             #197 <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #198 <Method void HashMap()>
	//    6   12:astore          5
		hashmap.putAll(zzk1.getHeaders());
	//    7   14:aload           5
	//    8   16:aload_1         
	//    9   17:invokevirtual   #202 <Method Map zzk.getHeaders()>
	//   10   20:invokevirtual   #206 <Method void HashMap.putAll(Map)>
		hashmap.putAll(map);
	//   11   23:aload           5
	//   12   25:aload_2         
	//   13   26:invokevirtual   #206 <Method void HashMap.putAll(Map)>
		if(zzaD != null)
	//*  14   29:aload_0         
	//*  15   30:getfield        #26  <Field zzz$zza zzaD>
	//*  16   33:ifnull          97
		{
			String s1 = zzaD.zzh(s);
	//   17   36:aload_0         
	//   18   37:getfield        #26  <Field zzz$zza zzaD>
	//   19   40:aload_3         
	//   20   41:invokeinterface #210 <Method String zzz$zza.zzh(String)>
	//   21   46:astore          4
			map = ((Map) (s1));
	//   22   48:aload           4
	//   23   50:astore_2        
			if(s1 == null)
	//*  24   51:aload           4
	//*  25   53:ifnonnull       99
			{
				zzk1 = ((zzk) (String.valueOf(((Object) (s)))));
	//   26   56:aload_3         
	//   27   57:invokestatic    #214 <Method String String.valueOf(Object)>
	//   28   60:astore_1        
				if(((String) (zzk1)).length() != 0)
	//*  29   61:aload_1         
	//*  30   62:invokevirtual   #217 <Method int String.length()>
	//*  31   65:ifeq            84
					zzk1 = ((zzk) ("URL blocked by rewriter: ".concat(((String) (zzk1)))));
	//   32   68:ldc1            #219 <String "URL blocked by rewriter: ">
	//   33   70:aload_1         
	//   34   71:invokevirtual   #222 <Method String String.concat(String)>
	//   35   74:astore_1        
				else
	//*  36   75:new             #31  <Class IOException>
	//*  37   78:dup             
	//*  38   79:aload_1         
	//*  39   80:invokespecial   #223 <Method void IOException(String)>
	//*  40   83:athrow          
					zzk1 = ((zzk) (new String("URL blocked by rewriter: ")));
	//   41   84:new             #66  <Class String>
	//   42   87:dup             
	//   43   88:ldc1            #219 <String "URL blocked by rewriter: ">
	//   44   90:invokespecial   #224 <Method void String(String)>
	//   45   93:astore_1        
				throw new IOException(((String) (zzk1)));
			}
		} else
	//*  46   94:goto            75
		{
			map = ((Map) (s));
	//   47   97:aload_3         
	//   48   98:astore_2        
		}
		map = ((Map) (zza(new URL(((String) (map))), zzk1)));
	//   49   99:aload_0         
	//   50  100:new             #60  <Class URL>
	//   51  103:dup             
	//   52  104:aload_2         
	//   53  105:invokespecial   #225 <Method void URL(String)>
	//   54  108:aload_1         
	//   55  109:invokespecial   #227 <Method HttpURLConnection zza(URL, zzk)>
	//   56  112:astore_2        
		String s2;
		for(Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); ((HttpURLConnection) (map)).addRequestProperty(s2, (String)hashmap.get(((Object) (s2)))))
	//*  57  113:aload           5
	//*  58  115:invokevirtual   #231 <Method Set HashMap.keySet()>
	//*  59  118:invokeinterface #237 <Method Iterator Set.iterator()>
	//*  60  123:astore_3        
	//*  61  124:aload_3         
	//*  62  125:invokeinterface #243 <Method boolean Iterator.hasNext()>
	//*  63  130:ifeq            163
			s2 = (String)iterator.next();
	//   64  133:aload_3         
	//   65  134:invokeinterface #247 <Method Object Iterator.next()>
	//   66  139:checkcast       #66  <Class String>
	//   67  142:astore          4

	//   68  144:aload_2         
	//   69  145:aload           4
	//   70  147:aload           5
	//   71  149:aload           4
	//   72  151:invokevirtual   #251 <Method Object HashMap.get(Object)>
	//   73  154:checkcast       #66  <Class String>
	//   74  157:invokevirtual   #147 <Method void HttpURLConnection.addRequestProperty(String, String)>
	//*  75  160:goto            124
		zza(((HttpURLConnection) (map)), zzk1);
	//   76  163:aload_2         
	//   77  164:aload_1         
	//   78  165:invokestatic    #253 <Method void zza(HttpURLConnection, zzk)>
		zzk1 = ((zzk) (new ProtocolVersion("HTTP", 1, 1)));
	//   79  168:new             #255 <Class ProtocolVersion>
	//   80  171:dup             
	//   81  172:ldc2            #257 <String "HTTP">
	//   82  175:iconst_1        
	//   83  176:iconst_1        
	//   84  177:invokespecial   #260 <Method void ProtocolVersion(String, int, int)>
	//   85  180:astore_1        
		if(((HttpURLConnection) (map)).getResponseCode() == -1)
	//*  86  181:aload_2         
	//*  87  182:invokevirtual   #263 <Method int HttpURLConnection.getResponseCode()>
	//*  88  185:iconst_m1       
	//*  89  186:icmpne          200
			throw new IOException("Could not retrieve response code from HttpUrlConnection.");
	//   90  189:new             #31  <Class IOException>
	//   91  192:dup             
	//   92  193:ldc2            #265 <String "Could not retrieve response code from HttpUrlConnection.">
	//   93  196:invokespecial   #223 <Method void IOException(String)>
	//   94  199:athrow          
		zzk1 = ((zzk) (new BasicHttpResponse(((org.apache.http.StatusLine) (new BasicStatusLine(((ProtocolVersion) (zzk1)), ((HttpURLConnection) (map)).getResponseCode(), ((HttpURLConnection) (map)).getResponseMessage()))))));
	//   95  200:new             #267 <Class BasicHttpResponse>
	//   96  203:dup             
	//   97  204:new             #269 <Class BasicStatusLine>
	//   98  207:dup             
	//   99  208:aload_1         
	//  100  209:aload_2         
	//  101  210:invokevirtual   #263 <Method int HttpURLConnection.getResponseCode()>
	//  102  213:aload_2         
	//  103  214:invokevirtual   #272 <Method String HttpURLConnection.getResponseMessage()>
	//  104  217:invokespecial   #275 <Method void BasicStatusLine(ProtocolVersion, int, String)>
	//  105  220:invokespecial   #278 <Method void BasicHttpResponse(org.apache.http.StatusLine)>
	//  106  223:astore_1        
		((BasicHttpResponse) (zzk1)).setEntity(zza(((HttpURLConnection) (map))));
	//  107  224:aload_1         
	//  108  225:aload_2         
	//  109  226:invokestatic    #280 <Method HttpEntity zza(HttpURLConnection)>
	//  110  229:invokevirtual   #284 <Method void BasicHttpResponse.setEntity(HttpEntity)>
		map = ((Map) (((HttpURLConnection) (map)).getHeaderFields().entrySet().iterator()));
	//  111  232:aload_2         
	//  112  233:invokevirtual   #287 <Method Map HttpURLConnection.getHeaderFields()>
	//  113  236:invokeinterface #292 <Method Set Map.entrySet()>
	//  114  241:invokeinterface #237 <Method Iterator Set.iterator()>
	//  115  246:astore_2        
		do
		{
			if(!((Iterator) (map)).hasNext())
				break;
	//  116  247:aload_2         
	//  117  248:invokeinterface #243 <Method boolean Iterator.hasNext()>
	//  118  253:ifeq            316
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//  119  256:aload_2         
	//  120  257:invokeinterface #247 <Method Object Iterator.next()>
	//  121  262:checkcast       #294 <Class java.util.Map$Entry>
	//  122  265:astore_3        
			if(entry.getKey() != null)
	//* 123  266:aload_3         
	//* 124  267:invokeinterface #297 <Method Object java.util.Map$Entry.getKey()>
	//* 125  272:ifnull          247
				((BasicHttpResponse) (zzk1)).addHeader(((org.apache.http.Header) (new BasicHeader((String)entry.getKey(), (String)((List)entry.getValue()).get(0)))));
	//  126  275:aload_1         
	//  127  276:new             #299 <Class BasicHeader>
	//  128  279:dup             
	//  129  280:aload_3         
	//  130  281:invokeinterface #297 <Method Object java.util.Map$Entry.getKey()>
	//  131  286:checkcast       #66  <Class String>
	//  132  289:aload_3         
	//  133  290:invokeinterface #302 <Method Object java.util.Map$Entry.getValue()>
	//  134  295:checkcast       #304 <Class List>
	//  135  298:iconst_0        
	//  136  299:invokeinterface #307 <Method Object List.get(int)>
	//  137  304:checkcast       #66  <Class String>
	//  138  307:invokespecial   #309 <Method void BasicHeader(String, String)>
	//  139  310:invokevirtual   #313 <Method void BasicHttpResponse.addHeader(org.apache.http.Header)>
		} while(true);
	//  140  313:goto            247
		return ((HttpResponse) (zzk1));
	//  141  316:aload_1         
	//  142  317:areturn         
	}

	private final zza zzaD;
	private final SSLSocketFactory zzaE;
}
