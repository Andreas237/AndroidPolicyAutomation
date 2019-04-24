// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.*;
import org.apache.http.*;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.cookie.DateUtils;

// Referenced classes of package com.android.volley.toolbox:
//			ByteArrayPool, PoolingByteArrayOutputStream, HttpStack

public class BasicNetwork
	implements Network
{

	public BasicNetwork(HttpStack httpstack)
	{
		this(httpstack, new ByteArrayPool(DEFAULT_POOL_SIZE));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #31  <Class ByteArrayPool>
	//    3    5:dup             
	//    4    6:getstatic       #26  <Field int DEFAULT_POOL_SIZE>
	//    5    9:invokespecial   #34  <Method void ByteArrayPool(int)>
	//    6   12:invokespecial   #37  <Method void BasicNetwork(HttpStack, ByteArrayPool)>
	//    7   15:return          
	}

	public BasicNetwork(HttpStack httpstack, ByteArrayPool bytearraypool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		mHttpStack = httpstack;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #41  <Field HttpStack mHttpStack>
		mPool = bytearraypool;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #43  <Field ByteArrayPool mPool>
	//    8   14:return          
	}

	private void addCacheHeaders(Map map, com.android.volley.Cache.Entry entry)
	{
		if(entry == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(entry.etag != null)
	//*   3    5:aload_2         
	//*   4    6:getfield        #51  <Field String com.android.volley.Cache$Entry.etag>
	//*   5    9:ifnull          25
			map.put("If-None-Match", ((Object) (entry.etag)));
	//    6   12:aload_1         
	//    7   13:ldc1            #53  <String "If-None-Match">
	//    8   15:aload_2         
	//    9   16:getfield        #51  <Field String com.android.volley.Cache$Entry.etag>
	//   10   19:invokeinterface #59  <Method Object Map.put(Object, Object)>
	//   11   24:pop             
		if(entry.lastModified > 0L)
	//*  12   25:aload_2         
	//*  13   26:getfield        #63  <Field long com.android.volley.Cache$Entry.lastModified>
	//*  14   29:lconst_0        
	//*  15   30:lcmp            
	//*  16   31:ifle            57
			map.put("If-Modified-Since", ((Object) (DateUtils.formatDate(new Date(entry.lastModified)))));
	//   17   34:aload_1         
	//   18   35:ldc1            #65  <String "If-Modified-Since">
	//   19   37:new             #67  <Class Date>
	//   20   40:dup             
	//   21   41:aload_2         
	//   22   42:getfield        #63  <Field long com.android.volley.Cache$Entry.lastModified>
	//   23   45:invokespecial   #70  <Method void Date(long)>
	//   24   48:invokestatic    #76  <Method String DateUtils.formatDate(Date)>
	//   25   51:invokeinterface #59  <Method Object Map.put(Object, Object)>
	//   26   56:pop             
	//   27   57:return          
	}

	private static void attemptRetryOnException(String s, Request request, VolleyError volleyerror)
		throws VolleyError
	{
		RetryPolicy retrypolicy = request.getRetryPolicy();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #88  <Method RetryPolicy Request.getRetryPolicy()>
	//    2    4:astore          4
		int i = request.getTimeoutMs();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #92  <Method int Request.getTimeoutMs()>
	//    5   10:istore_3        
		try
		{
			retrypolicy.retry(volleyerror);
	//    6   11:aload           4
	//    7   13:aload_2         
	//    8   14:invokeinterface #98  <Method void RetryPolicy.retry(VolleyError)>
		}
	//*   9   19:goto            49
		// Misplaced declaration of an exception variable
		catch(VolleyError volleyerror)
	//*  10   22:astore_2        
		{
			request.addMarker(String.format("%s-timeout-giveup [timeout=%s]", new Object[] {
				s, Integer.valueOf(i)
			}));
	//   11   23:aload_1         
	//   12   24:ldc1            #100 <String "%s-timeout-giveup [timeout=%s]">
	//   13   26:iconst_2        
	//   14   27:anewarray       Object[]
	//   15   30:dup             
	//   16   31:iconst_0        
	//   17   32:aload_0         
	//   18   33:aastore         
	//   19   34:dup             
	//   20   35:iconst_1        
	//   21   36:iload_3         
	//   22   37:invokestatic    #106 <Method Integer Integer.valueOf(int)>
	//   23   40:aastore         
	//   24   41:invokestatic    #112 <Method String String.format(String, Object[])>
	//   25   44:invokevirtual   #116 <Method void Request.addMarker(String)>
			throw volleyerror;
	//   26   47:aload_2         
	//   27   48:athrow          
		}
		request.addMarker(String.format("%s-retry [timeout=%s]", new Object[] {
			s, Integer.valueOf(i)
		}));
	//   28   49:aload_1         
	//   29   50:ldc1            #118 <String "%s-retry [timeout=%s]">
	//   30   52:iconst_2        
	//   31   53:anewarray       Object[]
	//   32   56:dup             
	//   33   57:iconst_0        
	//   34   58:aload_0         
	//   35   59:aastore         
	//   36   60:dup             
	//   37   61:iconst_1        
	//   38   62:iload_3         
	//   39   63:invokestatic    #106 <Method Integer Integer.valueOf(int)>
	//   40   66:aastore         
	//   41   67:invokestatic    #112 <Method String String.format(String, Object[])>
	//   42   70:invokevirtual   #116 <Method void Request.addMarker(String)>
	//   43   73:return          
	}

	protected static Map convertHeaders(Header aheader[])
	{
		TreeMap treemap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
	//    0    0:new             #124 <Class TreeMap>
	//    1    3:dup             
	//    2    4:getstatic       #128 <Field java.util.Comparator String.CASE_INSENSITIVE_ORDER>
	//    3    7:invokespecial   #131 <Method void TreeMap(java.util.Comparator)>
	//    4   10:astore_2        
		for(int i = 0; i < aheader.length; i++)
	//*   5   11:iconst_0        
	//*   6   12:istore_1        
	//*   7   13:iload_1         
	//*   8   14:aload_0         
	//*   9   15:arraylength     
	//*  10   16:icmpge          49
			((Map) (treemap)).put(((Object) (aheader[i].getName())), ((Object) (aheader[i].getValue())));
	//   11   19:aload_2         
	//   12   20:aload_0         
	//   13   21:iload_1         
	//   14   22:aaload          
	//   15   23:invokeinterface #137 <Method String Header.getName()>
	//   16   28:aload_0         
	//   17   29:iload_1         
	//   18   30:aaload          
	//   19   31:invokeinterface #140 <Method String Header.getValue()>
	//   20   36:invokeinterface #59  <Method Object Map.put(Object, Object)>
	//   21   41:pop             

	//   22   42:iload_1         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore_1        
	//*  26   46:goto            13
		return ((Map) (treemap));
	//   27   49:aload_2         
	//   28   50:areturn         
	}

	private byte[] entityToBytes(HttpEntity httpentity)
		throws IOException, ServerError
	{
		byte abyte0[];
		byte abyte1[];
		PoolingByteArrayOutputStream poolingbytearrayoutputstream;
		poolingbytearrayoutputstream = new PoolingByteArrayOutputStream(mPool, (int)httpentity.getContentLength());
	//    0    0:new             #149 <Class PoolingByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field ByteArrayPool mPool>
	//    4    8:aload_1         
	//    5    9:invokeinterface #155 <Method long HttpEntity.getContentLength()>
	//    6   14:l2i             
	//    7   15:invokespecial   #158 <Method void PoolingByteArrayOutputStream(ByteArrayPool, int)>
	//    8   18:astore          5
		abyte1 = null;
	//    9   20:aconst_null     
	//   10   21:astore          4
		abyte0 = abyte1;
	//   11   23:aload           4
	//   12   25:astore_3        
		InputStream inputstream = httpentity.getContent();
	//   13   26:aload_1         
	//   14   27:invokeinterface #162 <Method InputStream HttpEntity.getContent()>
	//   15   32:astore          6
		if(inputstream != null)
			break MISSING_BLOCK_LABEL_50;
	//   16   34:aload           6
	//   17   36:ifnonnull       50
		abyte0 = abyte1;
	//   18   39:aload           4
	//   19   41:astore_3        
		throw new ServerError();
	//   20   42:new             #147 <Class ServerError>
	//   21   45:dup             
	//   22   46:invokespecial   #163 <Method void ServerError()>
	//   23   49:athrow          
		abyte0 = abyte1;
	//   24   50:aload           4
	//   25   52:astore_3        
		abyte1 = mPool.getBuf(1024);
	//   26   53:aload_0         
	//   27   54:getfield        #43  <Field ByteArrayPool mPool>
	//   28   57:sipush          1024
	//   29   60:invokevirtual   #167 <Method byte[] ByteArrayPool.getBuf(int)>
	//   30   63:astore          4
_L2:
		abyte0 = abyte1;
	//   31   65:aload           4
	//   32   67:astore_3        
		int i = inputstream.read(abyte1);
	//   33   68:aload           6
	//   34   70:aload           4
	//   35   72:invokevirtual   #173 <Method int InputStream.read(byte[])>
	//   36   75:istore_2        
		if(i == -1)
			break; /* Loop/switch isn't completed */
	//   37   76:iload_2         
	//   38   77:iconst_m1       
	//   39   78:icmpeq          96
		abyte0 = abyte1;
	//   40   81:aload           4
	//   41   83:astore_3        
		poolingbytearrayoutputstream.write(abyte1, 0, i);
	//   42   84:aload           5
	//   43   86:aload           4
	//   44   88:iconst_0        
	//   45   89:iload_2         
	//   46   90:invokevirtual   #177 <Method void PoolingByteArrayOutputStream.write(byte[], int, int)>
		if(true) goto _L2; else goto _L1
	//   47   93:goto            65
_L1:
		abyte0 = abyte1;
	//   48   96:aload           4
	//   49   98:astore_3        
		byte abyte2[] = poolingbytearrayoutputstream.toByteArray();
	//   50   99:aload           5
	//   51  101:invokevirtual   #181 <Method byte[] PoolingByteArrayOutputStream.toByteArray()>
	//   52  104:astore          6
		try
		{
			httpentity.consumeContent();
	//   53  106:aload_1         
	//   54  107:invokeinterface #184 <Method void HttpEntity.consumeContent()>
		}
	//*  55  112:goto            125
		// Misplaced declaration of an exception variable
		catch(HttpEntity httpentity)
	//*  56  115:astore_1        
		{
			VolleyLog.v("Error occured when calling consumingContent", new Object[0]);
	//   57  116:ldc1            #186 <String "Error occured when calling consumingContent">
	//   58  118:iconst_0        
	//   59  119:anewarray       Object[]
	//   60  122:invokestatic    #190 <Method void VolleyLog.v(String, Object[])>
		}
		mPool.returnBuf(abyte1);
	//   61  125:aload_0         
	//   62  126:getfield        #43  <Field ByteArrayPool mPool>
	//   63  129:aload           4
	//   64  131:invokevirtual   #194 <Method void ByteArrayPool.returnBuf(byte[])>
		poolingbytearrayoutputstream.close();
	//   65  134:aload           5
	//   66  136:invokevirtual   #197 <Method void PoolingByteArrayOutputStream.close()>
		return abyte2;
	//   67  139:aload           6
	//   68  141:areturn         
		Exception exception;
		exception;
	//   69  142:astore          4
		try
		{
			httpentity.consumeContent();
	//   70  144:aload_1         
	//   71  145:invokeinterface #184 <Method void HttpEntity.consumeContent()>
		}
	//*  72  150:goto            163
		// Misplaced declaration of an exception variable
		catch(HttpEntity httpentity)
	//*  73  153:astore_1        
		{
			VolleyLog.v("Error occured when calling consumingContent", new Object[0]);
	//   74  154:ldc1            #186 <String "Error occured when calling consumingContent">
	//   75  156:iconst_0        
	//   76  157:anewarray       Object[]
	//   77  160:invokestatic    #190 <Method void VolleyLog.v(String, Object[])>
		}
		mPool.returnBuf(abyte0);
	//   78  163:aload_0         
	//   79  164:getfield        #43  <Field ByteArrayPool mPool>
	//   80  167:aload_3         
	//   81  168:invokevirtual   #194 <Method void ByteArrayPool.returnBuf(byte[])>
		poolingbytearrayoutputstream.close();
	//   82  171:aload           5
	//   83  173:invokevirtual   #197 <Method void PoolingByteArrayOutputStream.close()>
		throw exception;
	//   84  176:aload           4
	//   85  178:athrow          
	}

	private void logSlowRequests(long l, Request request, byte abyte0[], StatusLine statusline)
	{
		if(DEBUG || l > (long)SLOW_REQUEST_THRESHOLD_MS)
	//*   0    0:getstatic       #22  <Field boolean DEBUG>
	//*   1    3:ifne            15
	//*   2    6:lload_1         
	//*   3    7:getstatic       #24  <Field int SLOW_REQUEST_THRESHOLD_MS>
	//*   4   10:i2l             
	//*   5   11:lcmp            
	//*   6   12:ifle            88
		{
			if(abyte0 != null)
	//*   7   15:aload           4
	//*   8   17:ifnull          31
				abyte0 = ((byte []) (Integer.valueOf(abyte0.length)));
	//    9   20:aload           4
	//   10   22:arraylength     
	//   11   23:invokestatic    #106 <Method Integer Integer.valueOf(int)>
	//   12   26:astore          4
			else
	//*  13   28:goto            35
				abyte0 = "null";
	//   14   31:ldc1            #201 <String "null">
	//   15   33:astore          4
			VolleyLog.d("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] {
				request, Long.valueOf(l), abyte0, Integer.valueOf(statusline.getStatusCode()), Integer.valueOf(request.getRetryPolicy().getCurrentRetryCount())
			});
	//   16   35:ldc1            #203 <String "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]">
	//   17   37:iconst_5        
	//   18   38:anewarray       Object[]
	//   19   41:dup             
	//   20   42:iconst_0        
	//   21   43:aload_3         
	//   22   44:aastore         
	//   23   45:dup             
	//   24   46:iconst_1        
	//   25   47:lload_1         
	//   26   48:invokestatic    #208 <Method Long Long.valueOf(long)>
	//   27   51:aastore         
	//   28   52:dup             
	//   29   53:iconst_2        
	//   30   54:aload           4
	//   31   56:aastore         
	//   32   57:dup             
	//   33   58:iconst_3        
	//   34   59:aload           5
	//   35   61:invokeinterface #213 <Method int StatusLine.getStatusCode()>
	//   36   66:invokestatic    #106 <Method Integer Integer.valueOf(int)>
	//   37   69:aastore         
	//   38   70:dup             
	//   39   71:iconst_4        
	//   40   72:aload_3         
	//   41   73:invokevirtual   #88  <Method RetryPolicy Request.getRetryPolicy()>
	//   42   76:invokeinterface #216 <Method int RetryPolicy.getCurrentRetryCount()>
	//   43   81:invokestatic    #106 <Method Integer Integer.valueOf(int)>
	//   44   84:aastore         
	//   45   85:invokestatic    #219 <Method void VolleyLog.d(String, Object[])>
		}
	//   46   88:return          
	}

	protected void logError(String s, String s1, long l)
	{
		VolleyLog.v("HTTP ERROR(%s) %d ms to fetch %s", new Object[] {
			s, Long.valueOf(SystemClock.elapsedRealtime() - l), s1
		});
	//    0    0:ldc1            #224 <String "HTTP ERROR(%s) %d ms to fetch %s">
	//    1    2:iconst_3        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_1         
	//    6    9:aastore         
	//    7   10:dup             
	//    8   11:iconst_1        
	//    9   12:invokestatic    #229 <Method long SystemClock.elapsedRealtime()>
	//   10   15:lload_3         
	//   11   16:lsub            
	//   12   17:invokestatic    #208 <Method Long Long.valueOf(long)>
	//   13   20:aastore         
	//   14   21:dup             
	//   15   22:iconst_2        
	//   16   23:aload_2         
	//   17   24:aastore         
	//   18   25:invokestatic    #190 <Method void VolleyLog.v(String, Object[])>
	//   19   28:return          
	}

	public NetworkResponse performRequest(Request request)
		throws VolleyError
	{
		long l = SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #229 <Method long SystemClock.elapsedRealtime()>
	//    1    3:lstore_3        
_L3:
		NetworkResponse networkresponse;
		HttpResponse httpresponse;
		byte abyte0[];
		Map map;
		HttpResponse httpresponse1;
		Map map1;
		httpresponse1 = null;
	//    2    4:aconst_null     
	//    3    5:astore          9
		networkresponse = null;
	//    4    7:aconst_null     
	//    5    8:astore          5
		map1 = Collections.emptyMap();
	//    6   10:invokestatic    #243 <Method Map Collections.emptyMap()>
	//    7   13:astore          10
		httpresponse = httpresponse1;
	//    8   15:aload           9
	//    9   17:astore          6
		abyte0 = ((byte []) (networkresponse));
	//   10   19:aload           5
	//   11   21:astore          7
		map = map1;
	//   12   23:aload           10
	//   13   25:astore          8
		Object obj = ((Object) (new HashMap()));
	//   14   27:new             #245 <Class HashMap>
	//   15   30:dup             
	//   16   31:invokespecial   #246 <Method void HashMap()>
	//   17   34:astore          11
		httpresponse = httpresponse1;
	//   18   36:aload           9
	//   19   38:astore          6
		abyte0 = ((byte []) (networkresponse));
	//   20   40:aload           5
	//   21   42:astore          7
		map = map1;
	//   22   44:aload           10
	//   23   46:astore          8
		addCacheHeaders(((Map) (obj)), request.getCacheEntry());
	//   24   48:aload_0         
	//   25   49:aload           11
	//   26   51:aload_1         
	//   27   52:invokevirtual   #250 <Method com.android.volley.Cache$Entry Request.getCacheEntry()>
	//   28   55:invokespecial   #252 <Method void addCacheHeaders(Map, com.android.volley.Cache$Entry)>
		httpresponse = httpresponse1;
	//   29   58:aload           9
	//   30   60:astore          6
		abyte0 = ((byte []) (networkresponse));
	//   31   62:aload           5
	//   32   64:astore          7
		map = map1;
	//   33   66:aload           10
	//   34   68:astore          8
		httpresponse1 = mHttpStack.performRequest(request, ((Map) (obj)));
	//   35   70:aload_0         
	//   36   71:getfield        #41  <Field HttpStack mHttpStack>
	//   37   74:aload_1         
	//   38   75:aload           11
	//   39   77:invokeinterface #257 <Method HttpResponse HttpStack.performRequest(Request, Map)>
	//   40   82:astore          9
		httpresponse = httpresponse1;
	//   41   84:aload           9
	//   42   86:astore          6
		abyte0 = ((byte []) (networkresponse));
	//   43   88:aload           5
	//   44   90:astore          7
		map = map1;
	//   45   92:aload           10
	//   46   94:astore          8
		obj = ((Object) (httpresponse1.getStatusLine()));
	//   47   96:aload           9
	//   48   98:invokeinterface #263 <Method StatusLine HttpResponse.getStatusLine()>
	//   49  103:astore          11
		httpresponse = httpresponse1;
	//   50  105:aload           9
	//   51  107:astore          6
		abyte0 = ((byte []) (networkresponse));
	//   52  109:aload           5
	//   53  111:astore          7
		map = map1;
	//   54  113:aload           10
	//   55  115:astore          8
		int i = ((StatusLine) (obj)).getStatusCode();
	//   56  117:aload           11
	//   57  119:invokeinterface #213 <Method int StatusLine.getStatusCode()>
	//   58  124:istore_2        
		httpresponse = httpresponse1;
	//   59  125:aload           9
	//   60  127:astore          6
		abyte0 = ((byte []) (networkresponse));
	//   61  129:aload           5
	//   62  131:astore          7
		map = map1;
	//   63  133:aload           10
	//   64  135:astore          8
		map1 = convertHeaders(httpresponse1.getAllHeaders());
	//   65  137:aload           9
	//   66  139:invokeinterface #267 <Method Header[] HttpResponse.getAllHeaders()>
	//   67  144:invokestatic    #269 <Method Map convertHeaders(Header[])>
	//   68  147:astore          10
		if(i != 304)
			break MISSING_BLOCK_LABEL_282;
	//   69  149:iload_2         
	//   70  150:sipush          304
	//   71  153:icmpne          282
		httpresponse = httpresponse1;
	//   72  156:aload           9
	//   73  158:astore          6
		abyte0 = ((byte []) (networkresponse));
	//   74  160:aload           5
	//   75  162:astore          7
		map = map1;
	//   76  164:aload           10
	//   77  166:astore          8
		obj = ((Object) (request.getCacheEntry()));
	//   78  168:aload_1         
	//   79  169:invokevirtual   #250 <Method com.android.volley.Cache$Entry Request.getCacheEntry()>
	//   80  172:astore          11
		if(obj != null)
			break MISSING_BLOCK_LABEL_215;
	//   81  174:aload           11
	//   82  176:ifnonnull       215
		httpresponse = httpresponse1;
	//   83  179:aload           9
	//   84  181:astore          6
		abyte0 = ((byte []) (networkresponse));
	//   85  183:aload           5
	//   86  185:astore          7
		map = map1;
	//   87  187:aload           10
	//   88  189:astore          8
		networkresponse = new NetworkResponse(304, ((byte []) (null)), map1, true, SystemClock.elapsedRealtime() - l);
	//   89  191:new             #271 <Class NetworkResponse>
	//   90  194:dup             
	//   91  195:sipush          304
	//   92  198:aconst_null     
	//   93  199:aload           10
	//   94  201:iconst_1        
	//   95  202:invokestatic    #229 <Method long SystemClock.elapsedRealtime()>
	//   96  205:lload_3         
	//   97  206:lsub            
	//   98  207:invokespecial   #274 <Method void NetworkResponse(int, byte[], Map, boolean, long)>
	//   99  210:astore          5
		return networkresponse;
	//  100  212:aload           5
	//  101  214:areturn         
		httpresponse = httpresponse1;
	//  102  215:aload           9
	//  103  217:astore          6
		abyte0 = ((byte []) (networkresponse));
	//  104  219:aload           5
	//  105  221:astore          7
		map = map1;
	//  106  223:aload           10
	//  107  225:astore          8
		((com.android.volley.Cache.Entry) (obj)).responseHeaders.putAll(map1);
	//  108  227:aload           11
	//  109  229:getfield        #278 <Field Map com.android.volley.Cache$Entry.responseHeaders>
	//  110  232:aload           10
	//  111  234:invokeinterface #282 <Method void Map.putAll(Map)>
		httpresponse = httpresponse1;
	//  112  239:aload           9
	//  113  241:astore          6
		abyte0 = ((byte []) (networkresponse));
	//  114  243:aload           5
	//  115  245:astore          7
		map = map1;
	//  116  247:aload           10
	//  117  249:astore          8
		networkresponse = new NetworkResponse(304, ((com.android.volley.Cache.Entry) (obj)).data, ((com.android.volley.Cache.Entry) (obj)).responseHeaders, true, SystemClock.elapsedRealtime() - l);
	//  118  251:new             #271 <Class NetworkResponse>
	//  119  254:dup             
	//  120  255:sipush          304
	//  121  258:aload           11
	//  122  260:getfield        #286 <Field byte[] com.android.volley.Cache$Entry.data>
	//  123  263:aload           11
	//  124  265:getfield        #278 <Field Map com.android.volley.Cache$Entry.responseHeaders>
	//  125  268:iconst_1        
	//  126  269:invokestatic    #229 <Method long SystemClock.elapsedRealtime()>
	//  127  272:lload_3         
	//  128  273:lsub            
	//  129  274:invokespecial   #274 <Method void NetworkResponse(int, byte[], Map, boolean, long)>
	//  130  277:astore          5
		return networkresponse;
	//  131  279:aload           5
	//  132  281:areturn         
		if(i != 301 && i != 302)
			break MISSING_BLOCK_LABEL_325;
	//  133  282:iload_2         
	//  134  283:sipush          301
	//  135  286:icmpeq          296
	//  136  289:iload_2         
	//  137  290:sipush          302
	//  138  293:icmpne          325
		httpresponse = httpresponse1;
	//  139  296:aload           9
	//  140  298:astore          6
		abyte0 = ((byte []) (networkresponse));
	//  141  300:aload           5
	//  142  302:astore          7
		map = map1;
	//  143  304:aload           10
	//  144  306:astore          8
		request.setRedirectUrl((String)map1.get("Location"));
	//  145  308:aload_1         
	//  146  309:aload           10
	//  147  311:ldc2            #288 <String "Location">
	//  148  314:invokeinterface #292 <Method Object Map.get(Object)>
	//  149  319:checkcast       #108 <Class String>
	//  150  322:invokevirtual   #295 <Method void Request.setRedirectUrl(String)>
		httpresponse = httpresponse1;
	//  151  325:aload           9
	//  152  327:astore          6
		abyte0 = ((byte []) (networkresponse));
	//  153  329:aload           5
	//  154  331:astore          7
		map = map1;
	//  155  333:aload           10
	//  156  335:astore          8
		if(httpresponse1.getEntity() == null)
			break MISSING_BLOCK_LABEL_375;
	//  157  337:aload           9
	//  158  339:invokeinterface #299 <Method HttpEntity HttpResponse.getEntity()>
	//  159  344:ifnull          375
		httpresponse = httpresponse1;
	//  160  347:aload           9
	//  161  349:astore          6
		abyte0 = ((byte []) (networkresponse));
	//  162  351:aload           5
	//  163  353:astore          7
		map = map1;
	//  164  355:aload           10
	//  165  357:astore          8
		networkresponse = ((NetworkResponse) (entityToBytes(httpresponse1.getEntity())));
	//  166  359:aload_0         
	//  167  360:aload           9
	//  168  362:invokeinterface #299 <Method HttpEntity HttpResponse.getEntity()>
	//  169  367:invokespecial   #301 <Method byte[] entityToBytes(HttpEntity)>
	//  170  370:astore          5
		break MISSING_BLOCK_LABEL_392;
	//  171  372:goto            392
		httpresponse = httpresponse1;
	//  172  375:aload           9
	//  173  377:astore          6
		abyte0 = ((byte []) (networkresponse));
	//  174  379:aload           5
	//  175  381:astore          7
		map = map1;
	//  176  383:aload           10
	//  177  385:astore          8
		networkresponse = ((NetworkResponse) (new byte[0]));
	//  178  387:iconst_0        
	//  179  388:newarray        byte[]
	//  180  390:astore          5
		httpresponse = httpresponse1;
	//  181  392:aload           9
	//  182  394:astore          6
		abyte0 = ((byte []) (networkresponse));
	//  183  396:aload           5
	//  184  398:astore          7
		map = map1;
	//  185  400:aload           10
	//  186  402:astore          8
		logSlowRequests(SystemClock.elapsedRealtime() - l, request, ((byte []) (networkresponse)), ((StatusLine) (obj)));
	//  187  404:aload_0         
	//  188  405:invokestatic    #229 <Method long SystemClock.elapsedRealtime()>
	//  189  408:lload_3         
	//  190  409:lsub            
	//  191  410:aload_1         
	//  192  411:aload           5
	//  193  413:aload           11
	//  194  415:invokespecial   #303 <Method void logSlowRequests(long, Request, byte[], StatusLine)>
		if(i >= 200 && i <= 299) goto _L2; else goto _L1
	//  195  418:iload_2         
	//  196  419:sipush          200
	//  197  422:icmplt          432
	//  198  425:iload_2         
	//  199  426:sipush          299
	//  200  429:icmple          452
_L1:
		httpresponse = httpresponse1;
	//  201  432:aload           9
	//  202  434:astore          6
		abyte0 = ((byte []) (networkresponse));
	//  203  436:aload           5
	//  204  438:astore          7
		map = map1;
	//  205  440:aload           10
	//  206  442:astore          8
		try
		{
			throw new IOException();
	//  207  444:new             #145 <Class IOException>
	//  208  447:dup             
	//  209  448:invokespecial   #304 <Method void IOException()>
	//  210  451:athrow          
		}
	//* 211  452:aload           9
	//* 212  454:astore          6
	//* 213  456:aload           5
	//* 214  458:astore          7
	//* 215  460:aload           10
	//* 216  462:astore          8
	//* 217  464:new             #271 <Class NetworkResponse>
	//* 218  467:dup             
	//* 219  468:iload_2         
	//* 220  469:aload           5
	//* 221  471:aload           10
	//* 222  473:iconst_0        
	//* 223  474:invokestatic    #229 <Method long SystemClock.elapsedRealtime()>
	//* 224  477:lload_3         
	//* 225  478:lsub            
	//* 226  479:invokespecial   #274 <Method void NetworkResponse(int, byte[], Map, boolean, long)>
	//* 227  482:astore          5
	//* 228  484:aload           5
	//* 229  486:areturn         
		catch(SocketTimeoutException sockettimeoutexception)
	//* 230  487:astore          5
		{
			attemptRetryOnException("socket", request, ((VolleyError) (new TimeoutError())));
	//  231  489:ldc2            #306 <String "socket">
	//  232  492:aload_1         
	//  233  493:new             #308 <Class TimeoutError>
	//  234  496:dup             
	//  235  497:invokespecial   #309 <Method void TimeoutError()>
	//  236  500:invokestatic    #311 <Method void attemptRetryOnException(String, Request, VolleyError)>
		}
	//* 237  503:goto            768
		catch(ConnectTimeoutException connecttimeoutexception)
	//* 238  506:astore          5
		{
			attemptRetryOnException("connection", request, ((VolleyError) (new TimeoutError())));
	//  239  508:ldc2            #313 <String "connection">
	//  240  511:aload_1         
	//  241  512:new             #308 <Class TimeoutError>
	//  242  515:dup             
	//  243  516:invokespecial   #309 <Method void TimeoutError()>
	//  244  519:invokestatic    #311 <Method void attemptRetryOnException(String, Request, VolleyError)>
		}
	//* 245  522:goto            768
		catch(MalformedURLException malformedurlexception)
	//* 246  525:astore          5
		{
			throw new RuntimeException((new StringBuilder()).append("Bad URL ").append(request.getUrl()).toString(), ((Throwable) (malformedurlexception)));
	//  247  527:new             #315 <Class RuntimeException>
	//  248  530:dup             
	//  249  531:new             #317 <Class StringBuilder>
	//  250  534:dup             
	//  251  535:invokespecial   #318 <Method void StringBuilder()>
	//  252  538:ldc2            #320 <String "Bad URL ">
	//  253  541:invokevirtual   #324 <Method StringBuilder StringBuilder.append(String)>
	//  254  544:aload_1         
	//  255  545:invokevirtual   #327 <Method String Request.getUrl()>
	//  256  548:invokevirtual   #324 <Method StringBuilder StringBuilder.append(String)>
	//  257  551:invokevirtual   #330 <Method String StringBuilder.toString()>
	//  258  554:aload           5
	//  259  556:invokespecial   #333 <Method void RuntimeException(String, Throwable)>
	//  260  559:athrow          
		}
		catch(IOException ioexception)
	//* 261  560:astore          5
		{
			int j;
			if(httpresponse != null)
	//* 262  562:aload           6
	//* 263  564:ifnull          583
				j = httpresponse.getStatusLine().getStatusCode();
	//  264  567:aload           6
	//  265  569:invokeinterface #263 <Method StatusLine HttpResponse.getStatusLine()>
	//  266  574:invokeinterface #213 <Method int StatusLine.getStatusCode()>
	//  267  579:istore_2        
			else
	//* 268  580:goto            593
				throw new NoConnectionError(((Throwable) (ioexception)));
	//  269  583:new             #335 <Class NoConnectionError>
	//  270  586:dup             
	//  271  587:aload           5
	//  272  589:invokespecial   #338 <Method void NoConnectionError(Throwable)>
	//  273  592:athrow          
			if(j == 301 || j == 302)
	//* 274  593:iload_2         
	//* 275  594:sipush          301
	//* 276  597:icmpeq          607
	//* 277  600:iload_2         
	//* 278  601:sipush          302
	//* 279  604:icmpne          634
				VolleyLog.e("Request at %s has been redirected to %s", new Object[] {
					request.getOriginUrl(), request.getUrl()
				});
	//  280  607:ldc2            #340 <String "Request at %s has been redirected to %s">
	//  281  610:iconst_2        
	//  282  611:anewarray       Object[]
	//  283  614:dup             
	//  284  615:iconst_0        
	//  285  616:aload_1         
	//  286  617:invokevirtual   #343 <Method String Request.getOriginUrl()>
	//  287  620:aastore         
	//  288  621:dup             
	//  289  622:iconst_1        
	//  290  623:aload_1         
	//  291  624:invokevirtual   #327 <Method String Request.getUrl()>
	//  292  627:aastore         
	//  293  628:invokestatic    #346 <Method void VolleyLog.e(String, Object[])>
			else
	//* 294  631:goto            658
				VolleyLog.e("Unexpected response code %d for %s", new Object[] {
					Integer.valueOf(j), request.getUrl()
				});
	//  295  634:ldc2            #348 <String "Unexpected response code %d for %s">
	//  296  637:iconst_2        
	//  297  638:anewarray       Object[]
	//  298  641:dup             
	//  299  642:iconst_0        
	//  300  643:iload_2         
	//  301  644:invokestatic    #106 <Method Integer Integer.valueOf(int)>
	//  302  647:aastore         
	//  303  648:dup             
	//  304  649:iconst_1        
	//  305  650:aload_1         
	//  306  651:invokevirtual   #327 <Method String Request.getUrl()>
	//  307  654:aastore         
	//  308  655:invokestatic    #346 <Method void VolleyLog.e(String, Object[])>
			if(abyte0 != null)
	//* 309  658:aload           7
	//* 310  660:ifnull          759
			{
				NetworkResponse networkresponse1 = new NetworkResponse(j, abyte0, map, false, SystemClock.elapsedRealtime() - l);
	//  311  663:new             #271 <Class NetworkResponse>
	//  312  666:dup             
	//  313  667:iload_2         
	//  314  668:aload           7
	//  315  670:aload           8
	//  316  672:iconst_0        
	//  317  673:invokestatic    #229 <Method long SystemClock.elapsedRealtime()>
	//  318  676:lload_3         
	//  319  677:lsub            
	//  320  678:invokespecial   #274 <Method void NetworkResponse(int, byte[], Map, boolean, long)>
	//  321  681:astore          5
				if(j == 401 || j == 403)
	//* 322  683:iload_2         
	//* 323  684:sipush          401
	//* 324  687:icmpeq          697
	//* 325  690:iload_2         
	//* 326  691:sipush          403
	//* 327  694:icmpne          716
					attemptRetryOnException("auth", request, ((VolleyError) (new AuthFailureError(networkresponse1))));
	//  328  697:ldc2            #350 <String "auth">
	//  329  700:aload_1         
	//  330  701:new             #352 <Class AuthFailureError>
	//  331  704:dup             
	//  332  705:aload           5
	//  333  707:invokespecial   #355 <Method void AuthFailureError(NetworkResponse)>
	//  334  710:invokestatic    #311 <Method void attemptRetryOnException(String, Request, VolleyError)>
				else
	//* 335  713:goto            768
				if(j == 301 || j == 302)
	//* 336  716:iload_2         
	//* 337  717:sipush          301
	//* 338  720:icmpeq          730
	//* 339  723:iload_2         
	//* 340  724:sipush          302
	//* 341  727:icmpne          749
					attemptRetryOnException("redirect", request, ((VolleyError) (new AuthFailureError(networkresponse1))));
	//  342  730:ldc2            #357 <String "redirect">
	//  343  733:aload_1         
	//  344  734:new             #352 <Class AuthFailureError>
	//  345  737:dup             
	//  346  738:aload           5
	//  347  740:invokespecial   #355 <Method void AuthFailureError(NetworkResponse)>
	//  348  743:invokestatic    #311 <Method void attemptRetryOnException(String, Request, VolleyError)>
				else
	//* 349  746:goto            768
					throw new ServerError(networkresponse1);
	//  350  749:new             #147 <Class ServerError>
	//  351  752:dup             
	//  352  753:aload           5
	//  353  755:invokespecial   #358 <Method void ServerError(NetworkResponse)>
	//  354  758:athrow          
			} else
			{
				throw new NetworkError(((NetworkResponse) (null)));
	//  355  759:new             #360 <Class NetworkError>
	//  356  762:dup             
	//  357  763:aconst_null     
	//  358  764:invokespecial   #361 <Method void NetworkError(NetworkResponse)>
	//  359  767:athrow          
			}
		}
		if(true) goto _L3; else goto _L2
	//  360  768:goto            4
_L2:
		httpresponse = httpresponse1;
		abyte0 = ((byte []) (networkresponse));
		map = map1;
		networkresponse = new NetworkResponse(i, ((byte []) (networkresponse)), map1, false, SystemClock.elapsedRealtime() - l);
		return networkresponse;
	}

	protected static final boolean DEBUG;
	private static int DEFAULT_POOL_SIZE = 4096;
	private static int SLOW_REQUEST_THRESHOLD_MS = 3000;
	protected final HttpStack mHttpStack;
	protected final ByteArrayPool mPool;

	static 
	{
		DEBUG = VolleyLog.DEBUG;
	//    0    0:getstatic       #21  <Field boolean VolleyLog.DEBUG>
	//    1    3:putstatic       #22  <Field boolean DEBUG>
	//    2    6:sipush          3000
	//    3    9:putstatic       #24  <Field int SLOW_REQUEST_THRESHOLD_MS>
	//    4   12:sipush          4096
	//    5   15:putstatic       #26  <Field int DEFAULT_POOL_SIZE>
	//*   6   18:return          
	}
}
