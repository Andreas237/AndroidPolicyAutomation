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

// Referenced classes of package com.android.volley.toolbox:
//			ByteArrayPool, AdaptedHttpStack, HttpHeaderParser, PoolingByteArrayOutputStream, 
//			BaseHttpStack, HttpResponse, HttpStack

public class BasicNetwork
	implements Network
{

	public BasicNetwork(BaseHttpStack basehttpstack)
	{
		this(basehttpstack, new ByteArrayPool(4096));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #27  <Class ByteArrayPool>
	//    3    5:dup             
	//    4    6:sipush          4096
	//    5    9:invokespecial   #30  <Method void ByteArrayPool(int)>
	//    6   12:invokespecial   #33  <Method void BasicNetwork(BaseHttpStack, ByteArrayPool)>
	//    7   15:return          
	}

	public BasicNetwork(BaseHttpStack basehttpstack, ByteArrayPool bytearraypool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		mBaseHttpStack = basehttpstack;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #37  <Field BaseHttpStack mBaseHttpStack>
		mHttpStack = ((HttpStack) (basehttpstack));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #39  <Field HttpStack mHttpStack>
		mPool = bytearraypool;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #41  <Field ByteArrayPool mPool>
	//   11   19:return          
	}

	public BasicNetwork(HttpStack httpstack)
	{
		this(httpstack, new ByteArrayPool(4096));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #27  <Class ByteArrayPool>
	//    3    5:dup             
	//    4    6:sipush          4096
	//    5    9:invokespecial   #30  <Method void ByteArrayPool(int)>
	//    6   12:invokespecial   #45  <Method void BasicNetwork(HttpStack, ByteArrayPool)>
	//    7   15:return          
	}

	public BasicNetwork(HttpStack httpstack, ByteArrayPool bytearraypool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		mHttpStack = httpstack;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field HttpStack mHttpStack>
		mBaseHttpStack = ((BaseHttpStack) (new AdaptedHttpStack(httpstack)));
	//    5    9:aload_0         
	//    6   10:new             #48  <Class AdaptedHttpStack>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #50  <Method void AdaptedHttpStack(HttpStack)>
	//   10   18:putfield        #37  <Field BaseHttpStack mBaseHttpStack>
		mPool = bytearraypool;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #41  <Field ByteArrayPool mPool>
	//   14   26:return          
	}

	private static void attemptRetryOnException(String s, Request request, VolleyError volleyerror)
		throws VolleyError
	{
		RetryPolicy retrypolicy = request.getRetryPolicy();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #60  <Method RetryPolicy Request.getRetryPolicy()>
	//    2    4:astore          4
		int i = request.getTimeoutMs();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #64  <Method int Request.getTimeoutMs()>
	//    5   10:istore_3        
		try
		{
			retrypolicy.retry(volleyerror);
	//    6   11:aload           4
	//    7   13:aload_2         
	//    8   14:invokeinterface #70  <Method void RetryPolicy.retry(VolleyError)>
		}
	//*   9   19:aload_1         
	//*  10   20:ldc1            #72  <String "%s-retry [timeout=%s]">
	//*  11   22:iconst_2        
	//*  12   23:anewarray       Object[]
	//*  13   26:dup             
	//*  14   27:iconst_0        
	//*  15   28:aload_0         
	//*  16   29:aastore         
	//*  17   30:dup             
	//*  18   31:iconst_1        
	//*  19   32:iload_3         
	//*  20   33:invokestatic    #78  <Method Integer Integer.valueOf(int)>
	//*  21   36:aastore         
	//*  22   37:invokestatic    #84  <Method String String.format(String, Object[])>
	//*  23   40:invokevirtual   #88  <Method void Request.addMarker(String)>
	//*  24   43:return          
		// Misplaced declaration of an exception variable
		catch(VolleyError volleyerror)
	//*  25   44:astore_2        
		{
			request.addMarker(String.format("%s-timeout-giveup [timeout=%s]", new Object[] {
				s, Integer.valueOf(i)
			}));
	//   26   45:aload_1         
	//   27   46:ldc1            #90  <String "%s-timeout-giveup [timeout=%s]">
	//   28   48:iconst_2        
	//   29   49:anewarray       Object[]
	//   30   52:dup             
	//   31   53:iconst_0        
	//   32   54:aload_0         
	//   33   55:aastore         
	//   34   56:dup             
	//   35   57:iconst_1        
	//   36   58:iload_3         
	//   37   59:invokestatic    #78  <Method Integer Integer.valueOf(int)>
	//   38   62:aastore         
	//   39   63:invokestatic    #84  <Method String String.format(String, Object[])>
	//   40   66:invokevirtual   #88  <Method void Request.addMarker(String)>
			throw volleyerror;
	//   41   69:aload_2         
	//   42   70:athrow          
		}
		request.addMarker(String.format("%s-retry [timeout=%s]", new Object[] {
			s, Integer.valueOf(i)
		}));
	}

	private static List combineHeaders(List list, com.android.volley.Cache.Entry entry)
	{
		TreeSet treeset = new TreeSet(String.CASE_INSENSITIVE_ORDER);
	//    0    0:new             #97  <Class TreeSet>
	//    1    3:dup             
	//    2    4:getstatic       #101 <Field java.util.Comparator String.CASE_INSENSITIVE_ORDER>
	//    3    7:invokespecial   #104 <Method void TreeSet(java.util.Comparator)>
	//    4   10:astore_2        
		if(!list.isEmpty())
	//*   5   11:aload_0         
	//*   6   12:invokeinterface #110 <Method boolean List.isEmpty()>
	//*   7   17:ifne            58
		{
			for(Iterator iterator = list.iterator(); iterator.hasNext(); ((Set) (treeset)).add(((Object) (((Header)iterator.next()).getName()))));
	//    8   20:aload_0         
	//    9   21:invokeinterface #114 <Method Iterator List.iterator()>
	//   10   26:astore_3        
	//   11   27:aload_3         
	//   12   28:invokeinterface #119 <Method boolean Iterator.hasNext()>
	//   13   33:ifeq            58
	//   14   36:aload_2         
	//   15   37:aload_3         
	//   16   38:invokeinterface #123 <Method Object Iterator.next()>
	//   17   43:checkcast       #125 <Class Header>
	//   18   46:invokevirtual   #129 <Method String Header.getName()>
	//   19   49:invokeinterface #135 <Method boolean Set.add(Object)>
	//   20   54:pop             
		}
	//*  21   55:goto            27
		list = ((List) (new ArrayList(((java.util.Collection) (list)))));
	//   22   58:new             #137 <Class ArrayList>
	//   23   61:dup             
	//   24   62:aload_0         
	//   25   63:invokespecial   #140 <Method void ArrayList(java.util.Collection)>
	//   26   66:astore_0        
		if(entry.allResponseHeaders != null)
	//*  27   67:aload_1         
	//*  28   68:getfield        #146 <Field List com.android.volley.Cache$Entry.allResponseHeaders>
	//*  29   71:ifnull          139
		{
			if(!entry.allResponseHeaders.isEmpty())
	//*  30   74:aload_1         
	//*  31   75:getfield        #146 <Field List com.android.volley.Cache$Entry.allResponseHeaders>
	//*  32   78:invokeinterface #110 <Method boolean List.isEmpty()>
	//*  33   83:ifne            235
			{
				entry = ((com.android.volley.Cache.Entry) (entry.allResponseHeaders.iterator()));
	//   34   86:aload_1         
	//   35   87:getfield        #146 <Field List com.android.volley.Cache$Entry.allResponseHeaders>
	//   36   90:invokeinterface #114 <Method Iterator List.iterator()>
	//   37   95:astore_1        
				do
				{
					if(!((Iterator) (entry)).hasNext())
						break;
	//   38   96:aload_1         
	//   39   97:invokeinterface #119 <Method boolean Iterator.hasNext()>
	//   40  102:ifeq            235
					Header header = (Header)((Iterator) (entry)).next();
	//   41  105:aload_1         
	//   42  106:invokeinterface #123 <Method Object Iterator.next()>
	//   43  111:checkcast       #125 <Class Header>
	//   44  114:astore_3        
					if(!((Set) (treeset)).contains(((Object) (header.getName()))))
	//*  45  115:aload_2         
	//*  46  116:aload_3         
	//*  47  117:invokevirtual   #129 <Method String Header.getName()>
	//*  48  120:invokeinterface #149 <Method boolean Set.contains(Object)>
	//*  49  125:ifne            96
						list.add(((Object) (header)));
	//   50  128:aload_0         
	//   51  129:aload_3         
	//   52  130:invokeinterface #150 <Method boolean List.add(Object)>
	//   53  135:pop             
				} while(true);
	//   54  136:goto            96
			}
		} else
		if(!entry.responseHeaders.isEmpty())
	//*  55  139:aload_1         
	//*  56  140:getfield        #154 <Field Map com.android.volley.Cache$Entry.responseHeaders>
	//*  57  143:invokeinterface #157 <Method boolean Map.isEmpty()>
	//*  58  148:ifne            235
		{
			entry = ((com.android.volley.Cache.Entry) (entry.responseHeaders.entrySet().iterator()));
	//   59  151:aload_1         
	//   60  152:getfield        #154 <Field Map com.android.volley.Cache$Entry.responseHeaders>
	//   61  155:invokeinterface #161 <Method Set Map.entrySet()>
	//   62  160:invokeinterface #162 <Method Iterator Set.iterator()>
	//   63  165:astore_1        
			do
			{
				if(!((Iterator) (entry)).hasNext())
					break;
	//   64  166:aload_1         
	//   65  167:invokeinterface #119 <Method boolean Iterator.hasNext()>
	//   66  172:ifeq            235
				java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (entry)).next();
	//   67  175:aload_1         
	//   68  176:invokeinterface #123 <Method Object Iterator.next()>
	//   69  181:checkcast       #164 <Class java.util.Map$Entry>
	//   70  184:astore_3        
				if(!((Set) (treeset)).contains(entry1.getKey()))
	//*  71  185:aload_2         
	//*  72  186:aload_3         
	//*  73  187:invokeinterface #167 <Method Object java.util.Map$Entry.getKey()>
	//*  74  192:invokeinterface #149 <Method boolean Set.contains(Object)>
	//*  75  197:ifne            166
					list.add(((Object) (new Header((String)entry1.getKey(), (String)entry1.getValue()))));
	//   76  200:aload_0         
	//   77  201:new             #125 <Class Header>
	//   78  204:dup             
	//   79  205:aload_3         
	//   80  206:invokeinterface #167 <Method Object java.util.Map$Entry.getKey()>
	//   81  211:checkcast       #80  <Class String>
	//   82  214:aload_3         
	//   83  215:invokeinterface #170 <Method Object java.util.Map$Entry.getValue()>
	//   84  220:checkcast       #80  <Class String>
	//   85  223:invokespecial   #173 <Method void Header(String, String)>
	//   86  226:invokeinterface #150 <Method boolean List.add(Object)>
	//   87  231:pop             
			} while(true);
	//   88  232:goto            166
		}
		return list;
	//   89  235:aload_0         
	//   90  236:areturn         
	}

	private Map getCacheHeaders(com.android.volley.Cache.Entry entry)
	{
		if(entry == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       8
			return Collections.emptyMap();
	//    2    4:invokestatic    #182 <Method Map Collections.emptyMap()>
	//    3    7:areturn         
		HashMap hashmap = new HashMap();
	//    4    8:new             #184 <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #185 <Method void HashMap()>
	//    7   15:astore_2        
		if(entry.etag != null)
	//*   8   16:aload_1         
	//*   9   17:getfield        #189 <Field String com.android.volley.Cache$Entry.etag>
	//*  10   20:ifnull          36
			((Map) (hashmap)).put("If-None-Match", ((Object) (entry.etag)));
	//   11   23:aload_2         
	//   12   24:ldc1            #191 <String "If-None-Match">
	//   13   26:aload_1         
	//   14   27:getfield        #189 <Field String com.android.volley.Cache$Entry.etag>
	//   15   30:invokeinterface #195 <Method Object Map.put(Object, Object)>
	//   16   35:pop             
		if(entry.lastModified > 0L)
	//*  17   36:aload_1         
	//*  18   37:getfield        #199 <Field long com.android.volley.Cache$Entry.lastModified>
	//*  19   40:lconst_0        
	//*  20   41:lcmp            
	//*  21   42:ifle            61
			((Map) (hashmap)).put("If-Modified-Since", ((Object) (HttpHeaderParser.formatEpochAsRfc1123(entry.lastModified))));
	//   22   45:aload_2         
	//   23   46:ldc1            #201 <String "If-Modified-Since">
	//   24   48:aload_1         
	//   25   49:getfield        #199 <Field long com.android.volley.Cache$Entry.lastModified>
	//   26   52:invokestatic    #207 <Method String HttpHeaderParser.formatEpochAsRfc1123(long)>
	//   27   55:invokeinterface #195 <Method Object Map.put(Object, Object)>
	//   28   60:pop             
		return ((Map) (hashmap));
	//   29   61:aload_2         
	//   30   62:areturn         
	}

	private byte[] inputStreamToBytes(InputStream inputstream, int i)
		throws IOException, ServerError
	{
		byte abyte0[];
		PoolingByteArrayOutputStream poolingbytearrayoutputstream;
		poolingbytearrayoutputstream = new PoolingByteArrayOutputStream(mPool, i);
	//    0    0:new             #216 <Class PoolingByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field ByteArrayPool mPool>
	//    4    8:iload_2         
	//    5    9:invokespecial   #219 <Method void PoolingByteArrayOutputStream(ByteArrayPool, int)>
	//    6   12:astore          5
		abyte0 = null;
	//    7   14:aconst_null     
	//    8   15:astore_3        
		if(inputstream == null)
			break MISSING_BLOCK_LABEL_114;
	//    9   16:aload_1         
	//   10   17:ifnull          114
		byte abyte1[] = mPool.getBuf(1024);
	//   11   20:aload_0         
	//   12   21:getfield        #41  <Field ByteArrayPool mPool>
	//   13   24:sipush          1024
	//   14   27:invokevirtual   #223 <Method byte[] ByteArrayPool.getBuf(int)>
	//   15   30:astore          4
_L2:
		abyte0 = abyte1;
	//   16   32:aload           4
	//   17   34:astore_3        
		i = inputstream.read(abyte1);
	//   18   35:aload_1         
	//   19   36:aload           4
	//   20   38:invokevirtual   #229 <Method int InputStream.read(byte[])>
	//   21   41:istore_2        
		if(i == -1)
			break; /* Loop/switch isn't completed */
	//   22   42:iload_2         
	//   23   43:iconst_m1       
	//   24   44:icmpeq          62
		abyte0 = abyte1;
	//   25   47:aload           4
	//   26   49:astore_3        
		poolingbytearrayoutputstream.write(abyte1, 0, i);
	//   27   50:aload           5
	//   28   52:aload           4
	//   29   54:iconst_0        
	//   30   55:iload_2         
	//   31   56:invokevirtual   #233 <Method void PoolingByteArrayOutputStream.write(byte[], int, int)>
		if(true) goto _L2; else goto _L1
	//   32   59:goto            32
_L1:
		abyte0 = abyte1;
	//   33   62:aload           4
	//   34   64:astore_3        
		byte abyte2[] = poolingbytearrayoutputstream.toByteArray();
	//   35   65:aload           5
	//   36   67:invokevirtual   #237 <Method byte[] PoolingByteArrayOutputStream.toByteArray()>
	//   37   70:astore          6
		if(inputstream != null)
	//*  38   72:aload_1         
	//*  39   73:ifnull          92
			try
			{
				inputstream.close();
	//   40   76:aload_1         
	//   41   77:invokevirtual   #240 <Method void InputStream.close()>
			}
	//*  42   80:goto            92
	//*  43   83:ldc1            #242 <String "Error occurred when closing InputStream">
	//*  44   85:iconst_0        
	//*  45   86:anewarray       Object[]
	//*  46   89:invokestatic    #246 <Method void VolleyLog.v(String, Object[])>
	//*  47   92:aload_0         
	//*  48   93:getfield        #41  <Field ByteArrayPool mPool>
	//*  49   96:aload           4
	//*  50   98:invokevirtual   #250 <Method void ByteArrayPool.returnBuf(byte[])>
	//*  51  101:aload           5
	//*  52  103:invokevirtual   #251 <Method void PoolingByteArrayOutputStream.close()>
	//*  53  106:aload           6
	//*  54  108:areturn         
	//*  55  109:astore          4
	//*  56  111:goto            122
	//*  57  114:new             #214 <Class ServerError>
	//*  58  117:dup             
	//*  59  118:invokespecial   #252 <Method void ServerError()>
	//*  60  121:athrow          
	//*  61  122:aload_1         
	//*  62  123:ifnull          142
	//*  63  126:aload_1         
	//*  64  127:invokevirtual   #240 <Method void InputStream.close()>
	//*  65  130:goto            142
	//*  66  133:ldc1            #242 <String "Error occurred when closing InputStream">
	//*  67  135:iconst_0        
	//*  68  136:anewarray       Object[]
	//*  69  139:invokestatic    #246 <Method void VolleyLog.v(String, Object[])>
	//*  70  142:aload_0         
	//*  71  143:getfield        #41  <Field ByteArrayPool mPool>
	//*  72  146:aload_3         
	//*  73  147:invokevirtual   #250 <Method void ByteArrayPool.returnBuf(byte[])>
	//*  74  150:aload           5
	//*  75  152:invokevirtual   #251 <Method void PoolingByteArrayOutputStream.close()>
	//*  76  155:aload           4
	//*  77  157:athrow          
			// Misplaced declaration of an exception variable
			catch(InputStream inputstream)
			{
				VolleyLog.v("Error occurred when closing InputStream", new Object[0]);
			}
		mPool.returnBuf(abyte1);
		poolingbytearrayoutputstream.close();
		return abyte2;
		Exception exception;
		exception;
		break MISSING_BLOCK_LABEL_122;
		throw new ServerError();
		if(inputstream != null)
			try
			{
				inputstream.close();
			}
	//*  78  158:astore_1        
	//*  79  159:goto            83
			// Misplaced declaration of an exception variable
			catch(InputStream inputstream)
			{
				VolleyLog.v("Error occurred when closing InputStream", new Object[0]);
			}
		mPool.returnBuf(abyte0);
		poolingbytearrayoutputstream.close();
		throw exception;
	//*  80  162:astore_1        
	//*  81  163:goto            133
	}

	private void logSlowRequests(long l, Request request, byte abyte0[], int i)
	{
		if(DEBUG || l > 3000L)
	//*   0    0:getstatic       #22  <Field boolean DEBUG>
	//*   1    3:ifne            14
	//*   2    6:lload_1         
	//*   3    7:ldc2w           #255 <Long 3000L>
	//*   4   10:lcmp            
	//*   5   11:ifle            84
		{
			if(abyte0 != null)
	//*   6   14:aload           4
	//*   7   16:ifnull          30
				abyte0 = ((byte []) (Integer.valueOf(abyte0.length)));
	//    8   19:aload           4
	//    9   21:arraylength     
	//   10   22:invokestatic    #78  <Method Integer Integer.valueOf(int)>
	//   11   25:astore          4
			else
	//*  12   27:goto            35
				abyte0 = "null";
	//   13   30:ldc2            #258 <String "null">
	//   14   33:astore          4
			VolleyLog.d("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] {
				request, Long.valueOf(l), abyte0, Integer.valueOf(i), Integer.valueOf(request.getRetryPolicy().getCurrentRetryCount())
			});
	//   15   35:ldc2            #260 <String "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]">
	//   16   38:iconst_5        
	//   17   39:anewarray       Object[]
	//   18   42:dup             
	//   19   43:iconst_0        
	//   20   44:aload_3         
	//   21   45:aastore         
	//   22   46:dup             
	//   23   47:iconst_1        
	//   24   48:lload_1         
	//   25   49:invokestatic    #265 <Method Long Long.valueOf(long)>
	//   26   52:aastore         
	//   27   53:dup             
	//   28   54:iconst_2        
	//   29   55:aload           4
	//   30   57:aastore         
	//   31   58:dup             
	//   32   59:iconst_3        
	//   33   60:iload           5
	//   34   62:invokestatic    #78  <Method Integer Integer.valueOf(int)>
	//   35   65:aastore         
	//   36   66:dup             
	//   37   67:iconst_4        
	//   38   68:aload_3         
	//   39   69:invokevirtual   #60  <Method RetryPolicy Request.getRetryPolicy()>
	//   40   72:invokeinterface #268 <Method int RetryPolicy.getCurrentRetryCount()>
	//   41   77:invokestatic    #78  <Method Integer Integer.valueOf(int)>
	//   42   80:aastore         
	//   43   81:invokestatic    #271 <Method void VolleyLog.d(String, Object[])>
		}
	//   44   84:return          
	}

	public NetworkResponse performRequest(Request request)
		throws VolleyError
	{
		long l = SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #284 <Method long SystemClock.elapsedRealtime()>
	//    1    3:lstore_3        
_L2:
		Object obj2 = ((Object) (Collections.emptyList()));
	//    2    4:invokestatic    #288 <Method List Collections.emptyList()>
	//    3    7:astore          8
		HttpResponse httpresponse;
		Map map = getCacheHeaders(request.getCacheEntry());
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokevirtual   #292 <Method com.android.volley.Cache$Entry Request.getCacheEntry()>
	//    7   14:invokespecial   #294 <Method Map getCacheHeaders(com.android.volley.Cache$Entry)>
	//    8   17:astore          7
		httpresponse = mBaseHttpStack.executeRequest(request, map);
	//    9   19:aload_0         
	//   10   20:getfield        #37  <Field BaseHttpStack mBaseHttpStack>
	//   11   23:aload_1         
	//   12   24:aload           7
	//   13   26:invokevirtual   #300 <Method HttpResponse BaseHttpStack.executeRequest(Request, Map)>
	//   14   29:astore          10
		int i;
		Object obj;
		i = httpresponse.getStatusCode();
	//   15   31:aload           10
	//   16   33:invokevirtual   #305 <Method int HttpResponse.getStatusCode()>
	//   17   36:istore_2        
		obj = ((Object) (httpresponse.getHeaders()));
	//   18   37:aload           10
	//   19   39:invokevirtual   #308 <Method List HttpResponse.getHeaders()>
	//   20   42:astore          7
		if(i != 304)
			break MISSING_BLOCK_LABEL_135;
	//   21   44:iload_2         
	//   22   45:sipush          304
	//   23   48:icmpne          135
		obj2 = ((Object) (request.getCacheEntry()));
	//   24   51:aload_1         
	//   25   52:invokevirtual   #292 <Method com.android.volley.Cache$Entry Request.getCacheEntry()>
	//   26   55:astore          8
		if(obj2 != null)
			break MISSING_BLOCK_LABEL_82;
	//   27   57:aload           8
	//   28   59:ifnonnull       82
		return new NetworkResponse(304, ((byte []) (null)), true, SystemClock.elapsedRealtime() - l, ((List) (obj)));
	//   29   62:new             #310 <Class NetworkResponse>
	//   30   65:dup             
	//   31   66:sipush          304
	//   32   69:aconst_null     
	//   33   70:iconst_1        
	//   34   71:invokestatic    #284 <Method long SystemClock.elapsedRealtime()>
	//   35   74:lload_3         
	//   36   75:lsub            
	//   37   76:aload           7
	//   38   78:invokespecial   #313 <Method void NetworkResponse(int, byte[], boolean, long, List)>
	//   39   81:areturn         
		List list = combineHeaders(((List) (obj)), ((com.android.volley.Cache.Entry) (obj2)));
	//   40   82:aload           7
	//   41   84:aload           8
	//   42   86:invokestatic    #315 <Method List combineHeaders(List, com.android.volley.Cache$Entry)>
	//   43   89:astore          9
		obj2 = ((Object) (new NetworkResponse(304, ((com.android.volley.Cache.Entry) (obj2)).data, true, SystemClock.elapsedRealtime() - l, list)));
	//   44   91:new             #310 <Class NetworkResponse>
	//   45   94:dup             
	//   46   95:sipush          304
	//   47   98:aload           8
	//   48  100:getfield        #319 <Field byte[] com.android.volley.Cache$Entry.data>
	//   49  103:iconst_1        
	//   50  104:invokestatic    #284 <Method long SystemClock.elapsedRealtime()>
	//   51  107:lload_3         
	//   52  108:lsub            
	//   53  109:aload           9
	//   54  111:invokespecial   #313 <Method void NetworkResponse(int, byte[], boolean, long, List)>
	//   55  114:astore          8
		Object obj3;
		IOException ioexception;
		return ((NetworkResponse) (obj2));
	//   56  116:aload           8
	//   57  118:areturn         
	//*  58  119:astore          11
	//*  59  121:aconst_null     
	//*  60  122:astore          8
	//*  61  124:aload           7
	//*  62  126:astore          9
	//*  63  128:aload           11
	//*  64  130:astore          7
	//*  65  132:goto            286
		obj2 = ((Object) (httpresponse.getContent()));
	//   66  135:aload           10
	//   67  137:invokevirtual   #323 <Method InputStream HttpResponse.getContent()>
	//   68  140:astore          8
label0:
		{
			if(obj2 != null)
	//*  69  142:aload           8
	//*  70  144:ifnull          163
			{
				long l1;
				Object obj1;
				Object obj4;
				try
				{
					obj2 = ((Object) (inputStreamToBytes(((InputStream) (obj2)), httpresponse.getContentLength())));
	//   71  147:aload_0         
	//   72  148:aload           8
	//   73  150:aload           10
	//   74  152:invokevirtual   #326 <Method int HttpResponse.getContentLength()>
	//   75  155:invokespecial   #328 <Method byte[] inputStreamToBytes(InputStream, int)>
	//   76  158:astore          8
					break label0;
	//   77  160:goto            168
				}
	//*  78  163:iconst_0        
	//*  79  164:newarray        byte[]
	//*  80  166:astore          8
	//*  81  168:aload_0         
	//*  82  169:invokestatic    #284 <Method long SystemClock.elapsedRealtime()>
	//*  83  172:lload_3         
	//*  84  173:lsub            
	//*  85  174:aload_1         
	//*  86  175:aload           8
	//*  87  177:iload_2         
	//*  88  178:invokespecial   #330 <Method void logSlowRequests(long, Request, byte[], int)>
	//*  89  181:iload_2         
	//*  90  182:sipush          200
	//*  91  185:icmplt          218
	//*  92  188:iload_2         
	//*  93  189:sipush          299
	//*  94  192:icmpgt          218
	//*  95  195:invokestatic    #284 <Method long SystemClock.elapsedRealtime()>
	//*  96  198:lstore          5
	//*  97  200:new             #310 <Class NetworkResponse>
	//*  98  203:dup             
	//*  99  204:iload_2         
	//* 100  205:aload           8
	//* 101  207:iconst_0        
	//* 102  208:lload           5
	//* 103  210:lload_3         
	//* 104  211:lsub            
	//* 105  212:aload           7
	//* 106  214:invokespecial   #313 <Method void NetworkResponse(int, byte[], boolean, long, List)>
	//* 107  217:areturn         
	//* 108  218:new             #212 <Class IOException>
	//* 109  221:dup             
	//* 110  222:invokespecial   #331 <Method void IOException()>
	//* 111  225:athrow          
	//* 112  226:astore          9
	//* 113  228:goto            233
	//* 114  231:astore          9
	//* 115  233:aload           7
	//* 116  235:astore          11
	//* 117  237:aload           9
	//* 118  239:astore          7
	//* 119  241:aload           11
	//* 120  243:astore          9
	//* 121  245:goto            286
	//* 122  248:astore          9
	//* 123  250:aload           7
	//* 124  252:astore          8
	//* 125  254:aload           9
	//* 126  256:astore          7
	//* 127  258:goto            263
	//* 128  261:astore          7
	//* 129  263:aload           8
	//* 130  265:astore          9
	//* 131  267:aconst_null     
	//* 132  268:astore          8
	//* 133  270:goto            286
	//* 134  273:astore          7
	//* 135  275:aload           8
	//* 136  277:astore          9
	//* 137  279:aconst_null     
	//* 138  280:astore          10
	//* 139  282:aload           10
	//* 140  284:astore          8
	//* 141  286:aload           10
	//* 142  288:ifnull          486
	//* 143  291:aload           10
	//* 144  293:invokevirtual   #305 <Method int HttpResponse.getStatusCode()>
	//* 145  296:istore_2        
	//* 146  297:ldc2            #333 <String "Unexpected response code %d for %s">
	//* 147  300:iconst_2        
	//* 148  301:anewarray       Object[]
	//* 149  304:dup             
	//* 150  305:iconst_0        
	//* 151  306:iload_2         
	//* 152  307:invokestatic    #78  <Method Integer Integer.valueOf(int)>
	//* 153  310:aastore         
	//* 154  311:dup             
	//* 155  312:iconst_1        
	//* 156  313:aload_1         
	//* 157  314:invokevirtual   #336 <Method String Request.getUrl()>
	//* 158  317:aastore         
	//* 159  318:invokestatic    #339 <Method void VolleyLog.e(String, Object[])>
	//* 160  321:aload           8
	//* 161  323:ifnull          469
	//* 162  326:new             #310 <Class NetworkResponse>
	//* 163  329:dup             
	//* 164  330:iload_2         
	//* 165  331:aload           8
	//* 166  333:iconst_0        
	//* 167  334:invokestatic    #284 <Method long SystemClock.elapsedRealtime()>
	//* 168  337:lload_3         
	//* 169  338:lsub            
	//* 170  339:aload           9
	//* 171  341:invokespecial   #313 <Method void NetworkResponse(int, byte[], boolean, long, List)>
	//* 172  344:astore          7
	//* 173  346:iload_2         
	//* 174  347:sipush          401
	//* 175  350:icmpeq          450
	//* 176  353:iload_2         
	//* 177  354:sipush          403
	//* 178  357:icmpne          363
	//* 179  360:goto            450
	//* 180  363:iload_2         
	//* 181  364:sipush          400
	//* 182  367:icmplt          390
	//* 183  370:iload_2         
	//* 184  371:sipush          499
	//* 185  374:icmple          380
	//* 186  377:goto            390
	//* 187  380:new             #341 <Class ClientError>
	//* 188  383:dup             
	//* 189  384:aload           7
	//* 190  386:invokespecial   #344 <Method void ClientError(NetworkResponse)>
	//* 191  389:athrow          
	//* 192  390:iload_2         
	//* 193  391:sipush          500
	//* 194  394:icmplt          440
	//* 195  397:iload_2         
	//* 196  398:sipush          599
	//* 197  401:icmpgt          440
	//* 198  404:aload_1         
	//* 199  405:invokevirtual   #347 <Method boolean Request.shouldRetryServerErrors()>
	//* 200  408:ifeq            430
	//* 201  411:ldc2            #349 <String "server">
	//* 202  414:aload_1         
	//* 203  415:new             #214 <Class ServerError>
	//* 204  418:dup             
	//* 205  419:aload           7
	//* 206  421:invokespecial   #350 <Method void ServerError(NetworkResponse)>
	//* 207  424:invokestatic    #352 <Method void attemptRetryOnException(String, Request, VolleyError)>
	//* 208  427:goto            4
	//* 209  430:new             #214 <Class ServerError>
	//* 210  433:dup             
	//* 211  434:aload           7
	//* 212  436:invokespecial   #350 <Method void ServerError(NetworkResponse)>
	//* 213  439:athrow          
	//* 214  440:new             #214 <Class ServerError>
	//* 215  443:dup             
	//* 216  444:aload           7
	//* 217  446:invokespecial   #350 <Method void ServerError(NetworkResponse)>
	//* 218  449:athrow          
	//* 219  450:ldc2            #354 <String "auth">
	//* 220  453:aload_1         
	//* 221  454:new             #356 <Class AuthFailureError>
	//* 222  457:dup             
	//* 223  458:aload           7
	//* 224  460:invokespecial   #357 <Method void AuthFailureError(NetworkResponse)>
	//* 225  463:invokestatic    #352 <Method void attemptRetryOnException(String, Request, VolleyError)>
	//* 226  466:goto            4
	//* 227  469:ldc2            #359 <String "network">
	//* 228  472:aload_1         
	//* 229  473:new             #361 <Class NetworkError>
	//* 230  476:dup             
	//* 231  477:invokespecial   #362 <Method void NetworkError()>
	//* 232  480:invokestatic    #352 <Method void attemptRetryOnException(String, Request, VolleyError)>
	//* 233  483:goto            4
	//* 234  486:new             #364 <Class NoConnectionError>
	//* 235  489:dup             
	//* 236  490:aload           7
	//* 237  492:invokespecial   #367 <Method void NoConnectionError(Throwable)>
	//* 238  495:athrow          
	//* 239  496:astore          7
	//* 240  498:new             #369 <Class StringBuilder>
	//* 241  501:dup             
	//* 242  502:invokespecial   #370 <Method void StringBuilder()>
	//* 243  505:astore          8
	//* 244  507:aload           8
	//* 245  509:ldc2            #372 <String "Bad URL ">
	//* 246  512:invokevirtual   #376 <Method StringBuilder StringBuilder.append(String)>
	//* 247  515:pop             
	//* 248  516:aload           8
	//* 249  518:aload_1         
	//* 250  519:invokevirtual   #336 <Method String Request.getUrl()>
	//* 251  522:invokevirtual   #376 <Method StringBuilder StringBuilder.append(String)>
	//* 252  525:pop             
	//* 253  526:new             #378 <Class RuntimeException>
	//* 254  529:dup             
	//* 255  530:aload           8
	//* 256  532:invokevirtual   #381 <Method String StringBuilder.toString()>
	//* 257  535:aload           7
	//* 258  537:invokespecial   #384 <Method void RuntimeException(String, Throwable)>
	//* 259  540:athrow          
	//* 260  541:ldc2            #386 <String "socket">
	//* 261  544:aload_1         
	//* 262  545:new             #388 <Class TimeoutError>
	//* 263  548:dup             
	//* 264  549:invokespecial   #389 <Method void TimeoutError()>
	//* 265  552:invokestatic    #352 <Method void attemptRetryOnException(String, Request, VolleyError)>
	//* 266  555:goto            4
				// Misplaced declaration of an exception variable
				catch(SocketTimeoutException sockettimeoutexception)
				{
					attemptRetryOnException("socket", request, ((VolleyError) (new TimeoutError())));
				}
				catch(MalformedURLException malformedurlexception)
				{
					StringBuilder stringbuilder = new StringBuilder();
					stringbuilder.append("Bad URL ");
					stringbuilder.append(request.getUrl());
					throw new RuntimeException(stringbuilder.toString(), ((Throwable) (malformedurlexception)));
				}
				// Misplaced declaration of an exception variable
				catch(IOException ioexception)
				{
					obj2 = null;
					obj3 = obj;
					obj = ((Object) (ioexception));
					break MISSING_BLOCK_LABEL_286;
				}
				continue; /* Loop/switch isn't completed */
			}
			obj2 = ((Object) (new byte[0]));
		}
		logSlowRequests(SystemClock.elapsedRealtime() - l, request, ((byte []) (obj2)), i);
		if(i < 200 || i > 299)
			break MISSING_BLOCK_LABEL_218;
		l1 = SystemClock.elapsedRealtime();
		return new NetworkResponse(i, ((byte []) (obj2)), false, l1 - l, ((List) (obj)));
		throw new IOException();
		obj3;
		break MISSING_BLOCK_LABEL_233;
		obj3;
		obj4 = obj;
		obj = obj3;
		obj3 = obj4;
		break MISSING_BLOCK_LABEL_286;
		obj3;
		obj2 = obj;
		obj = obj3;
		break MISSING_BLOCK_LABEL_263;
		obj1;
		obj3 = obj2;
		obj2 = null;
		break MISSING_BLOCK_LABEL_286;
		obj1;
		obj3 = obj2;
		httpresponse = null;
		obj2 = ((Object) (httpresponse));
		if(httpresponse != null)
		{
			i = httpresponse.getStatusCode();
			VolleyLog.e("Unexpected response code %d for %s", new Object[] {
				Integer.valueOf(i), request.getUrl()
			});
			if(obj2 != null)
			{
				obj1 = ((Object) (new NetworkResponse(i, ((byte []) (obj2)), false, SystemClock.elapsedRealtime() - l, ((List) (obj3)))));
				if(i != 401 && i != 403)
				{
					if(i >= 400 && i <= 499)
						throw new ClientError(((NetworkResponse) (obj1)));
					if(i >= 500 && i <= 599)
					{
						if(request.shouldRetryServerErrors())
							attemptRetryOnException("server", request, ((VolleyError) (new ServerError(((NetworkResponse) (obj1))))));
						else
							throw new ServerError(((NetworkResponse) (obj1)));
					} else
					{
						throw new ServerError(((NetworkResponse) (obj1)));
					}
				} else
				{
					attemptRetryOnException("auth", request, ((VolleyError) (new AuthFailureError(((NetworkResponse) (obj1))))));
				}
			} else
			{
				attemptRetryOnException("network", request, ((VolleyError) (new NetworkError())));
			}
		} else
		{
			throw new NoConnectionError(((Throwable) (obj1)));
		}
		if(true) goto _L2; else goto _L1
_L1:
		SocketTimeoutException sockettimeoutexception;
	//* 267  558:astore          7
	//* 268  560:goto            541
	}

	protected static final boolean DEBUG;
	private final BaseHttpStack mBaseHttpStack;
	protected final HttpStack mHttpStack;
	protected final ByteArrayPool mPool;

	static 
	{
		DEBUG = VolleyLog.DEBUG;
	//    0    0:getstatic       #21  <Field boolean VolleyLog.DEBUG>
	//    1    3:putstatic       #22  <Field boolean DEBUG>
	//*   2    6:return          
	}
}
