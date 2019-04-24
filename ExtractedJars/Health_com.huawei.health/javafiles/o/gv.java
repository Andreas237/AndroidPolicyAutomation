// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.net.*;
import android.text.TextUtils;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;

// Referenced classes of package o:
//			gs

public final class gv
{

	public gv(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		if(context != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          19
			c = context.getApplicationContext();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #19  <Method Context Context.getApplicationContext()>
	//    7   13:putfield        #21  <Field Context c>
		else
	//*   8   16:goto            24
			c = context;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #21  <Field Context c>
		a = s;
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:putfield        #23  <Field String a>
	//   15   29:return          
	}

	private String a()
	{
		int i;
		Object obj;
		try
		{
			obj = ((Object) (b()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method NetworkInfo b()>
	//    2    4:astore_2        
		}
	//*   3    5:aload_2         
	//*   4    6:ifnull          39
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #37  <Method boolean NetworkInfo.isAvailable()>
	//*   7   13:ifeq            39
	//*   8   16:aload_2         
	//*   9   17:invokevirtual   #41  <Method int NetworkInfo.getType()>
	//*  10   20:istore_1        
	//*  11   21:iload_1         
	//*  12   22:iconst_1        
	//*  13   23:icmpne          29
	//*  14   26:ldc1            #43  <String "wifi">
	//*  15   28:areturn         
	//*  16   29:aload_2         
	//*  17   30:invokevirtual   #46  <Method String NetworkInfo.getExtraInfo()>
	//*  18   33:invokevirtual   #51  <Method String String.toLowerCase()>
	//*  19   36:astore_2        
	//*  20   37:aload_2         
	//*  21   38:areturn         
	//*  22   39:ldc1            #53  <String "none">
	//*  23   41:areturn         
	//*  24   42:ldc1            #53  <String "none">
	//*  25   44:areturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			return "none";
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_39;
		if(!((NetworkInfo) (obj)).isAvailable())
			break MISSING_BLOCK_LABEL_39;
		i = ((NetworkInfo) (obj)).getType();
		if(i == 1)
			return "wifi";
		obj = ((Object) (((NetworkInfo) (obj)).getExtraInfo().toLowerCase()));
		return ((String) (obj));
		Exception exception;
		return "none";
	//*  26   45:astore_2        
	//*  27   46:goto            42
	}

	private NetworkInfo b()
	{
		NetworkInfo networkinfo;
		try
		{
			networkinfo = ((ConnectivityManager)c.getSystemService("connectivity")).getActiveNetworkInfo();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Context c>
	//    2    4:ldc1            #55  <String "connectivity">
	//    3    6:invokevirtual   #59  <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #61  <Class ConnectivityManager>
	//    5   12:invokevirtual   #64  <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//    6   15:astore_1        
		}
	//*   7   16:aload_1         
	//*   8   17:areturn         
		catch(Exception exception)
	//*   9   18:astore_1        
		{
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
		}
		return networkinfo;
	}

	private URL c()
	{
		URL url;
		try
		{
			url = new URL(a);
	//    0    0:new             #67  <Class URL>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field String a>
	//    4    8:invokespecial   #70  <Method void URL(String)>
	//    5   11:astore_1        
		}
	//*   6   12:aload_1         
	//*   7   13:areturn         
		catch(Exception exception)
	//*   8   14:astore_1        
		{
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		}
		return url;
	}

	public final HttpResponse e(byte abyte0[], List list)
		throws Throwable
	{
		gs gs1;
		(new StringBuilder("requestUrl : ")).append(a);
	//    0    0:new             #76  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #78  <String "requestUrl : ">
	//    3    6:invokespecial   #79  <Method void StringBuilder(String)>
	//    4    9:aload_0         
	//    5   10:getfield        #23  <Field String a>
	//    6   13:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		gs1 = gs.a();
	//    8   17:invokestatic    #88  <Method gs gs.a()>
	//    9   20:astore          6
		if(gs1 == null)
	//*  10   22:aload           6
	//*  11   24:ifnonnull       29
			return null;
	//   12   27:aconst_null     
	//   13   28:areturn         
		HttpParams httpparams = gs1.a.getParams();
	//   14   29:aload           6
	//   15   31:getfield        #91  <Field DefaultHttpClient gs.a>
	//   16   34:invokevirtual   #97  <Method HttpParams DefaultHttpClient.getParams()>
	//   17   37:astore          7
		if(android.os.Build.VERSION.SDK_INT < 11) goto _L2; else goto _L1
	//   18   39:getstatic       #103 <Field int android.os.Build$VERSION.SDK_INT>
	//   19   42:bipush          11
	//   20   44:icmplt          148
_L1:
		Object obj1 = null;
	//   21   47:aconst_null     
	//   22   48:astore          5
		Object obj = ((Object) (a()));
	//   23   50:aload_0         
	//   24   51:invokespecial   #105 <Method String a()>
	//   25   54:astore          4
		if(obj == null)
			break MISSING_BLOCK_LABEL_77;
	//   26   56:aload           4
	//   27   58:ifnull          77
		if(!((String) (obj)).contains("wap"))
	//*  28   61:aload           4
	//*  29   63:ldc1            #107 <String "wap">
	//*  30   65:invokevirtual   #111 <Method boolean String.contains(CharSequence)>
	//*  31   68:ifne            77
		{
			obj = null;
	//   32   71:aconst_null     
	//   33   72:astore          4
			break MISSING_BLOCK_LABEL_223;
	//   34   74:goto            223
		}
		Object obj2 = ((Object) (c()));
	//   35   77:aload_0         
	//   36   78:invokespecial   #113 <Method URL c()>
	//   37   81:astore          8
		obj = ((Object) (obj1));
	//   38   83:aload           5
	//   39   85:astore          4
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_223;
	//   40   87:aload           8
	//   41   89:ifnull          495
		String s;
		"https".equalsIgnoreCase(((URL) (obj2)).getProtocol());
	//   42   92:ldc1            #115 <String "https">
	//   43   94:aload           8
	//   44   96:invokevirtual   #118 <Method String URL.getProtocol()>
	//   45   99:invokevirtual   #122 <Method boolean String.equalsIgnoreCase(String)>
	//   46  102:pop             
		obj2 = ((Object) (System.getProperty("https.proxyHost")));
	//   47  103:ldc1            #124 <String "https.proxyHost">
	//   48  105:invokestatic    #130 <Method String System.getProperty(String)>
	//   49  108:astore          8
		s = System.getProperty("https.proxyPort");
	//   50  110:ldc1            #132 <String "https.proxyPort">
	//   51  112:invokestatic    #130 <Method String System.getProperty(String)>
	//   52  115:astore          9
		obj = ((Object) (obj1));
	//   53  117:aload           5
	//   54  119:astore          4
		int i;
		try
		{
			if(!TextUtils.isEmpty(((CharSequence) (obj2))))
	//*  55  121:aload           8
	//*  56  123:invokestatic    #137 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  57  126:ifne            495
				obj = ((Object) (new HttpHost(((String) (obj2)), Integer.parseInt(s))));
	//   58  129:new             #139 <Class HttpHost>
	//   59  132:dup             
	//   60  133:aload           8
	//   61  135:aload           9
	//   62  137:invokestatic    #145 <Method int Integer.parseInt(String)>
	//   63  140:invokespecial   #148 <Method void HttpHost(String, int)>
	//   64  143:astore          4
			break MISSING_BLOCK_LABEL_223;
	//   65  145:goto            495
		}
	//*  66  148:aconst_null     
	//*  67  149:astore          5
	//*  68  151:aload_0         
	//*  69  152:invokespecial   #31  <Method NetworkInfo b()>
	//*  70  155:astore          8
	//*  71  157:aload           5
	//*  72  159:astore          4
	//*  73  161:aload           8
	//*  74  163:ifnull          498
	//*  75  166:aload           5
	//*  76  168:astore          4
	//*  77  170:aload           8
	//*  78  172:invokevirtual   #37  <Method boolean NetworkInfo.isAvailable()>
	//*  79  175:ifeq            498
	//*  80  178:aload           5
	//*  81  180:astore          4
	//*  82  182:aload           8
	//*  83  184:invokevirtual   #41  <Method int NetworkInfo.getType()>
	//*  84  187:ifne            498
	//*  85  190:invokestatic    #153 <Method String Proxy.getDefaultHost()>
	//*  86  193:astore          8
	//*  87  195:invokestatic    #156 <Method int Proxy.getDefaultPort()>
	//*  88  198:istore_3        
	//*  89  199:aload           5
	//*  90  201:astore          4
	//*  91  203:aload           8
	//*  92  205:ifnull          498
	//*  93  208:new             #139 <Class HttpHost>
	//*  94  211:dup             
	//*  95  212:aload           8
	//*  96  214:iload_3         
	//*  97  215:invokespecial   #148 <Method void HttpHost(String, int)>
	//*  98  218:astore          4
	//*  99  220:goto            498
	//* 100  223:aload           4
	//* 101  225:ifnull          240
	//* 102  228:aload           7
	//* 103  230:ldc1            #158 <String "http.route.default-proxy">
	//* 104  232:aload           4
	//* 105  234:invokeinterface #164 <Method HttpParams HttpParams.setParameter(String, Object)>
	//* 106  239:pop             
	//* 107  240:aload_1         
	//* 108  241:ifnull          249
	//* 109  244:aload_1         
	//* 110  245:arraylength     
	//* 111  246:ifne            264
	//* 112  249:new             #166 <Class HttpGet>
	//* 113  252:dup             
	//* 114  253:aload_0         
	//* 115  254:getfield        #23  <Field String a>
	//* 116  257:invokespecial   #167 <Method void HttpGet(String)>
	//* 117  260:astore_1        
	//* 118  261:goto            337
	//* 119  264:new             #169 <Class HttpPost>
	//* 120  267:dup             
	//* 121  268:aload_0         
	//* 122  269:getfield        #23  <Field String a>
	//* 123  272:invokespecial   #170 <Method void HttpPost(String)>
	//* 124  275:astore          4
	//* 125  277:new             #172 <Class ByteArrayEntity>
	//* 126  280:dup             
	//* 127  281:aload_1         
	//* 128  282:invokespecial   #175 <Method void ByteArrayEntity(byte[])>
	//* 129  285:astore_1        
	//* 130  286:aload_1         
	//* 131  287:ldc1            #177 <String "application/octet-stream;binary/octet-stream">
	//* 132  289:invokevirtual   #180 <Method void ByteArrayEntity.setContentType(String)>
	//* 133  292:aload           4
	//* 134  294:checkcast       #169 <Class HttpPost>
	//* 135  297:aload_1         
	//* 136  298:invokevirtual   #184 <Method void HttpPost.setEntity(org.apache.http.HttpEntity)>
	//* 137  301:aload           4
	//* 138  303:ldc1            #186 <String "Accept-Charset">
	//* 139  305:ldc1            #188 <String "UTF-8">
	//* 140  307:invokeinterface #194 <Method void HttpUriRequest.addHeader(String, String)>
	//* 141  312:aload           4
	//* 142  314:ldc1            #196 <String "Connection">
	//* 143  316:ldc1            #198 <String "Keep-Alive">
	//* 144  318:invokeinterface #194 <Method void HttpUriRequest.addHeader(String, String)>
	//* 145  323:aload           4
	//* 146  325:ldc1            #198 <String "Keep-Alive">
	//* 147  327:ldc1            #200 <String "timeout=180, max=100">
	//* 148  329:invokeinterface #194 <Method void HttpUriRequest.addHeader(String, String)>
	//* 149  334:aload           4
	//* 150  336:astore_1        
	//* 151  337:aload_2         
	//* 152  338:ifnull          375
	//* 153  341:aload_2         
	//* 154  342:invokeinterface #206 <Method Iterator List.iterator()>
	//* 155  347:astore_2        
	//* 156  348:aload_2         
	//* 157  349:invokeinterface #211 <Method boolean Iterator.hasNext()>
	//* 158  354:ifeq            375
	//* 159  357:aload_1         
	//* 160  358:aload_2         
	//* 161  359:invokeinterface #215 <Method Object Iterator.next()>
	//* 162  364:checkcast       #217 <Class Header>
	//* 163  367:invokeinterface #220 <Method void HttpUriRequest.addHeader(Header)>
	//* 164  372:goto            348
	//* 165  375:aload           6
	//* 166  377:aload_1         
	//* 167  378:invokevirtual   #224 <Method HttpResponse gs.d(HttpUriRequest)>
	//* 168  381:astore_1        
	//* 169  382:aload_1         
	//* 170  383:ldc1            #226 <String "X-Hostname">
	//* 171  385:invokeinterface #232 <Method Header[] HttpResponse.getHeaders(String)>
	//* 172  390:astore_2        
	//* 173  391:aload_2         
	//* 174  392:ifnull          420
	//* 175  395:aload_2         
	//* 176  396:arraylength     
	//* 177  397:ifle            420
	//* 178  400:aload_2         
	//* 179  401:iconst_0        
	//* 180  402:aaload          
	//* 181  403:ifnull          420
	//* 182  406:aload_1         
	//* 183  407:ldc1            #226 <String "X-Hostname">
	//* 184  409:invokeinterface #232 <Method Header[] HttpResponse.getHeaders(String)>
	//* 185  414:iconst_0        
	//* 186  415:aaload          
	//* 187  416:invokevirtual   #235 <Method String Object.toString()>
	//* 188  419:pop             
	//* 189  420:aload_1         
	//* 190  421:ldc1            #237 <String "X-ExecuteTime">
	//* 191  423:invokeinterface #232 <Method Header[] HttpResponse.getHeaders(String)>
	//* 192  428:astore_2        
	//* 193  429:aload_2         
	//* 194  430:ifnull          458
	//* 195  433:aload_2         
	//* 196  434:arraylength     
	//* 197  435:ifle            458
	//* 198  438:aload_2         
	//* 199  439:iconst_0        
	//* 200  440:aaload          
	//* 201  441:ifnull          458
	//* 202  444:aload_1         
	//* 203  445:ldc1            #237 <String "X-ExecuteTime">
	//* 204  447:invokeinterface #232 <Method Header[] HttpResponse.getHeaders(String)>
	//* 205  452:iconst_0        
	//* 206  453:aaload          
	//* 207  454:invokevirtual   #235 <Method String Object.toString()>
	//* 208  457:pop             
	//* 209  458:aload_1         
	//* 210  459:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//* 211  460:astore_1        
		{
			if(gs1 == null)
				break MISSING_BLOCK_LABEL_489;
	//  212  461:aload           6
	//  213  463:ifnull          489
		}
		  goto _L3
_L2:
		obj1 = null;
		obj2 = ((Object) (b()));
		obj = ((Object) (obj1));
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_223;
		obj = ((Object) (obj1));
		if(!((NetworkInfo) (obj2)).isAvailable())
			break MISSING_BLOCK_LABEL_223;
		obj = ((Object) (obj1));
		if(((NetworkInfo) (obj2)).getType() != 0)
			break MISSING_BLOCK_LABEL_223;
		obj2 = ((Object) (Proxy.getDefaultHost()));
		i = Proxy.getDefaultPort();
		obj = ((Object) (obj1));
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_223;
		obj = ((Object) (new HttpHost(((String) (obj2)), i)));
		if(obj == null)
			break MISSING_BLOCK_LABEL_240;
		httpparams.setParameter("http.route.default-proxy", obj);
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_249;
		if(abyte0.length != 0)
			break MISSING_BLOCK_LABEL_264;
		abyte0 = ((byte []) (new HttpGet(a)));
		break MISSING_BLOCK_LABEL_337;
		obj = ((Object) (new HttpPost(a)));
		abyte0 = ((byte []) (new ByteArrayEntity(abyte0)));
		((ByteArrayEntity) (abyte0)).setContentType("application/octet-stream;binary/octet-stream");
		((HttpPost)obj).setEntity(((org.apache.http.HttpEntity) (abyte0)));
		((HttpUriRequest) (obj)).addHeader("Accept-Charset", "UTF-8");
		((HttpUriRequest) (obj)).addHeader("Connection", "Keep-Alive");
		((HttpUriRequest) (obj)).addHeader("Keep-Alive", "timeout=180, max=100");
		abyte0 = ((byte []) (obj));
		if(list == null)
			break MISSING_BLOCK_LABEL_375;
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((HttpUriRequest) (abyte0)).addHeader((Header)((Iterator) (list)).next()));
		abyte0 = ((byte []) (gs1.d(((HttpUriRequest) (abyte0)))));
		list = ((List) (((HttpResponse) (abyte0)).getHeaders("X-Hostname")));
		if(list == null)
			break MISSING_BLOCK_LABEL_420;
		if(list.length <= 0 || list[0] == null)
			break MISSING_BLOCK_LABEL_420;
		((Object) (((HttpResponse) (abyte0)).getHeaders("X-Hostname")[0])).toString();
		list = ((List) (((HttpResponse) (abyte0)).getHeaders("X-ExecuteTime")));
		if(list == null)
			break MISSING_BLOCK_LABEL_458;
		if(list.length <= 0 || list[0] == null)
			break MISSING_BLOCK_LABEL_458;
		((Object) (((HttpResponse) (abyte0)).getHeaders("X-ExecuteTime")[0])).toString();
		return ((HttpResponse) (abyte0));
_L3:
		list = ((List) (gs1.a.getConnectionManager()));
	//  214  466:aload           6
	//  215  468:getfield        #91  <Field DefaultHttpClient gs.a>
	//  216  471:invokevirtual   #241 <Method ClientConnectionManager DefaultHttpClient.getConnectionManager()>
	//  217  474:astore_2        
		if(list != null)
	//* 218  475:aload_2         
	//* 219  476:ifnull          489
			try
			{
				((ClientConnectionManager) (list)).shutdown();
	//  220  479:aload_2         
	//  221  480:invokeinterface #246 <Method void ClientConnectionManager.shutdown()>
				gs.e = null;
	//  222  485:aconst_null     
	//  223  486:putstatic       #249 <Field gs gs.e>
			}
	//* 224  489:aload_1         
	//* 225  490:athrow          
			// Misplaced declaration of an exception variable
			catch(List list) { }
	//  226  491:astore_2        
		throw abyte0;
	//* 227  492:goto            489
	//* 228  495:goto            223
	//* 229  498:goto            223
	}

	public String a;
	private Context c;
}
