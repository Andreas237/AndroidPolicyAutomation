// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import javax.net.ssl.SSLSocketFactory;

// Referenced classes of package com.google.android.gms.internal.ads:
//			hc, bim, boq, sx, 
//			oz, ry

public final class rb extends hc
{

	public rb()
	{
		this(((sx) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #13  <Method void rb(sx)>
	//    3    5:return          
	}

	private rb(sx sx1)
	{
		this(((sx) (null)), ((SSLSocketFactory) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:invokespecial   #17  <Method void rb(sx, SSLSocketFactory)>
	//    4    6:return          
	}

	private rb(sx sx1, SSLSocketFactory sslsocketfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void hc()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #21  <Field sx a>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #23  <Field SSLSocketFactory b>
	//    8   14:return          
	}

	static InputStream a(HttpURLConnection httpurlconnection)
	{
		return b(httpurlconnection);
	//    0    0:aload_0         
	//    1    1:invokestatic    #26  <Method InputStream b(HttpURLConnection)>
	//    2    4:areturn         
	}

	private static List a(Map map)
	{
		ArrayList arraylist = new ArrayList(map.size());
	//    0    0:new             #29  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #35  <Method int Map.size()>
	//    4   10:invokespecial   #38  <Method void ArrayList(int)>
	//    5   13:astore_1        
		map = ((Map) (map.entrySet().iterator()));
	//    6   14:aload_0         
	//    7   15:invokeinterface #42  <Method Set Map.entrySet()>
	//    8   20:invokeinterface #48  <Method Iterator Set.iterator()>
	//    9   25:astore_0        
		do
		{
			if(!((Iterator) (map)).hasNext())
				break;
	//   10   26:aload_0         
	//   11   27:invokeinterface #54  <Method boolean Iterator.hasNext()>
	//   12   32:ifeq            117
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   13   35:aload_0         
	//   14   36:invokeinterface #58  <Method Object Iterator.next()>
	//   15   41:checkcast       #60  <Class java.util.Map$Entry>
	//   16   44:astore_2        
			if(entry.getKey() != null)
	//*  17   45:aload_2         
	//*  18   46:invokeinterface #63  <Method Object java.util.Map$Entry.getKey()>
	//*  19   51:ifnull          26
			{
				Iterator iterator = ((List)entry.getValue()).iterator();
	//   20   54:aload_2         
	//   21   55:invokeinterface #66  <Method Object java.util.Map$Entry.getValue()>
	//   22   60:checkcast       #68  <Class List>
	//   23   63:invokeinterface #69  <Method Iterator List.iterator()>
	//   24   68:astore_3        
				while(iterator.hasNext()) 
	//*  25   69:aload_3         
	//*  26   70:invokeinterface #54  <Method boolean Iterator.hasNext()>
	//*  27   75:ifeq            26
				{
					String s = (String)iterator.next();
	//   28   78:aload_3         
	//   29   79:invokeinterface #58  <Method Object Iterator.next()>
	//   30   84:checkcast       #71  <Class String>
	//   31   87:astore          4
					((List) (arraylist)).add(((Object) (new bim((String)entry.getKey(), s))));
	//   32   89:aload_1         
	//   33   90:new             #73  <Class bim>
	//   34   93:dup             
	//   35   94:aload_2         
	//   36   95:invokeinterface #63  <Method Object java.util.Map$Entry.getKey()>
	//   37  100:checkcast       #71  <Class String>
	//   38  103:aload           4
	//   39  105:invokespecial   #76  <Method void bim(String, String)>
	//   40  108:invokeinterface #80  <Method boolean List.add(Object)>
	//   41  113:pop             
				}
			}
		} while(true);
	//   42  114:goto            69
		return ((List) (arraylist));
	//   43  117:aload_1         
	//   44  118:areturn         
	}

	private static void a(HttpURLConnection httpurlconnection, boq boq1)
	{
		byte abyte0[] = boq1.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #86  <Method byte[] boq.a()>
	//    2    4:astore_2        
		if(abyte0 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          89
		{
			httpurlconnection.setDoOutput(true);
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #92  <Method void HttpURLConnection.setDoOutput(boolean)>
			if(!httpurlconnection.getRequestProperties().containsKey("Content-Type"))
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #96  <Method Map HttpURLConnection.getRequestProperties()>
	//*  10   18:ldc1            #98  <String "Content-Type">
	//*  11   20:invokeinterface #101 <Method boolean Map.containsKey(Object)>
	//*  12   25:ifne            68
			{
				boq1 = ((boq) (String.valueOf("UTF-8")));
	//   13   28:ldc1            #103 <String "UTF-8">
	//   14   30:invokestatic    #107 <Method String String.valueOf(Object)>
	//   15   33:astore_1        
				if(((String) (boq1)).length() != 0)
	//*  16   34:aload_1         
	//*  17   35:invokevirtual   #110 <Method int String.length()>
	//*  18   38:ifeq            51
					boq1 = ((boq) ("application/x-www-form-urlencoded; charset=".concat(((String) (boq1)))));
	//   19   41:ldc1            #112 <String "application/x-www-form-urlencoded; charset=">
	//   20   43:aload_1         
	//   21   44:invokevirtual   #116 <Method String String.concat(String)>
	//   22   47:astore_1        
				else
	//*  23   48:goto            61
					boq1 = ((boq) (new String("application/x-www-form-urlencoded; charset=")));
	//   24   51:new             #71  <Class String>
	//   25   54:dup             
	//   26   55:ldc1            #112 <String "application/x-www-form-urlencoded; charset=">
	//   27   57:invokespecial   #119 <Method void String(String)>
	//   28   60:astore_1        
				httpurlconnection.setRequestProperty("Content-Type", ((String) (boq1)));
	//   29   61:aload_0         
	//   30   62:ldc1            #98  <String "Content-Type">
	//   31   64:aload_1         
	//   32   65:invokevirtual   #122 <Method void HttpURLConnection.setRequestProperty(String, String)>
			}
			httpurlconnection = ((HttpURLConnection) (new DataOutputStream(httpurlconnection.getOutputStream())));
	//   33   68:new             #124 <Class DataOutputStream>
	//   34   71:dup             
	//   35   72:aload_0         
	//   36   73:invokevirtual   #128 <Method java.io.OutputStream HttpURLConnection.getOutputStream()>
	//   37   76:invokespecial   #131 <Method void DataOutputStream(java.io.OutputStream)>
	//   38   79:astore_0        
			((DataOutputStream) (httpurlconnection)).write(abyte0);
	//   39   80:aload_0         
	//   40   81:aload_2         
	//   41   82:invokevirtual   #135 <Method void DataOutputStream.write(byte[])>
			((DataOutputStream) (httpurlconnection)).close();
	//   42   85:aload_0         
	//   43   86:invokevirtual   #138 <Method void DataOutputStream.close()>
		}
	//   44   89:return          
	}

	private static InputStream b(HttpURLConnection httpurlconnection)
	{
		IOException ioexception;
		InputStream inputstream;
		try
		{
			inputstream = httpurlconnection.getInputStream();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #144 <Method InputStream HttpURLConnection.getInputStream()>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #147 <Method InputStream HttpURLConnection.getErrorStream()>
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

	public final oz a(boq boq1, Map map)
	{
		boolean flag1;
		HashMap hashmap;
		Object obj = ((Object) (boq1.e()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #152 <Method String boq.e()>
	//    2    4:astore          6
		hashmap = new HashMap();
	//    3    6:new             #154 <Class HashMap>
	//    4    9:dup             
	//    5   10:invokespecial   #155 <Method void HashMap()>
	//    6   13:astore          8
		hashmap.putAll(map);
	//    7   15:aload           8
	//    8   17:aload_2         
	//    9   18:invokevirtual   #159 <Method void HashMap.putAll(Map)>
		hashmap.putAll(boq1.b());
	//   10   21:aload           8
	//   11   23:aload_1         
	//   12   24:invokevirtual   #161 <Method Map boq.b()>
	//   13   27:invokevirtual   #159 <Method void HashMap.putAll(Map)>
		map = ((Map) (a));
	//   14   30:aload_0         
	//   15   31:getfield        #21  <Field sx a>
	//   16   34:astore_2        
		if(map != null)
	//*  17   35:aload_2         
	//*  18   36:ifnull          99
		{
			String s = ((sx) (map)).a(((String) (obj)));
	//   19   39:aload_2         
	//   20   40:aload           6
	//   21   42:invokeinterface #165 <Method String sx.a(String)>
	//   22   47:astore          7
			map = ((Map) (s));
	//   23   49:aload           7
	//   24   51:astore_2        
			if(s == null)
	//*  25   52:aload           7
	//*  26   54:ifnonnull       102
			{
				boq1 = ((boq) (String.valueOf(obj)));
	//   27   57:aload           6
	//   28   59:invokestatic    #107 <Method String String.valueOf(Object)>
	//   29   62:astore_1        
				if(((String) (boq1)).length() != 0)
	//*  30   63:aload_1         
	//*  31   64:invokevirtual   #110 <Method int String.length()>
	//*  32   67:ifeq            80
					boq1 = ((boq) ("URL blocked by rewriter: ".concat(((String) (boq1)))));
	//   33   70:ldc1            #167 <String "URL blocked by rewriter: ">
	//   34   72:aload_1         
	//   35   73:invokevirtual   #116 <Method String String.concat(String)>
	//   36   76:astore_1        
				else
	//*  37   77:goto            90
					boq1 = ((boq) (new String("URL blocked by rewriter: ")));
	//   38   80:new             #71  <Class String>
	//   39   83:dup             
	//   40   84:ldc1            #167 <String "URL blocked by rewriter: ">
	//   41   86:invokespecial   #119 <Method void String(String)>
	//   42   89:astore_1        
				throw new IOException(((String) (boq1)));
	//   43   90:new             #140 <Class IOException>
	//   44   93:dup             
	//   45   94:aload_1         
	//   46   95:invokespecial   #168 <Method void IOException(String)>
	//   47   98:athrow          
			}
		} else
		{
			map = ((Map) (obj));
	//   48   99:aload           6
	//   49  101:astore_2        
		}
		obj = ((Object) (new URL(((String) (map)))));
	//   50  102:new             #170 <Class URL>
	//   51  105:dup             
	//   52  106:aload_2         
	//   53  107:invokespecial   #171 <Method void URL(String)>
	//   54  110:astore          6
		map = ((Map) ((HttpURLConnection)((URL) (obj)).openConnection()));
	//   55  112:aload           6
	//   56  114:invokevirtual   #175 <Method java.net.URLConnection URL.openConnection()>
	//   57  117:checkcast       #88  <Class HttpURLConnection>
	//   58  120:astore_2        
		((HttpURLConnection) (map)).setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
	//   59  121:aload_2         
	//   60  122:invokestatic    #178 <Method boolean HttpURLConnection.getFollowRedirects()>
	//   61  125:invokevirtual   #181 <Method void HttpURLConnection.setInstanceFollowRedirects(boolean)>
		int i = boq1.j();
	//   62  128:aload_1         
	//   63  129:invokevirtual   #184 <Method int boq.j()>
	//   64  132:istore_3        
		((HttpURLConnection) (map)).setConnectTimeout(i);
	//   65  133:aload_2         
	//   66  134:iload_3         
	//   67  135:invokevirtual   #187 <Method void HttpURLConnection.setConnectTimeout(int)>
		((HttpURLConnection) (map)).setReadTimeout(i);
	//   68  138:aload_2         
	//   69  139:iload_3         
	//   70  140:invokevirtual   #190 <Method void HttpURLConnection.setReadTimeout(int)>
		flag1 = false;
	//   71  143:iconst_0        
	//   72  144:istore          4
		((HttpURLConnection) (map)).setUseCaches(false);
	//   73  146:aload_2         
	//   74  147:iconst_0        
	//   75  148:invokevirtual   #193 <Method void HttpURLConnection.setUseCaches(boolean)>
		((HttpURLConnection) (map)).setDoInput(true);
	//   76  151:aload_2         
	//   77  152:iconst_1        
	//   78  153:invokevirtual   #196 <Method void HttpURLConnection.setDoInput(boolean)>
		"https".equals(((Object) (((URL) (obj)).getProtocol())));
	//   79  156:ldc1            #198 <String "https">
	//   80  158:aload           6
	//   81  160:invokevirtual   #201 <Method String URL.getProtocol()>
	//   82  163:invokevirtual   #204 <Method boolean String.equals(Object)>
	//   83  166:pop             
		String s1;
		for(Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); ((HttpURLConnection) (map)).setRequestProperty(s1, (String)hashmap.get(((Object) (s1)))))
	//*  84  167:aload           8
	//*  85  169:invokevirtual   #207 <Method Set HashMap.keySet()>
	//*  86  172:invokeinterface #48  <Method Iterator Set.iterator()>
	//*  87  177:astore          6
	//*  88  179:aload           6
	//*  89  181:invokeinterface #54  <Method boolean Iterator.hasNext()>
	//*  90  186:ifeq            220
			s1 = (String)iterator.next();
	//   91  189:aload           6
	//   92  191:invokeinterface #58  <Method Object Iterator.next()>
	//   93  196:checkcast       #71  <Class String>
	//   94  199:astore          7

	//   95  201:aload_2         
	//   96  202:aload           7
	//   97  204:aload           8
	//   98  206:aload           7
	//   99  208:invokevirtual   #211 <Method Object HashMap.get(Object)>
	//  100  211:checkcast       #71  <Class String>
	//  101  214:invokevirtual   #122 <Method void HttpURLConnection.setRequestProperty(String, String)>
	//* 102  217:goto            179
		boq1.c();
	//  103  220:aload_1         
	//  104  221:invokevirtual   #214 <Method int boq.c()>
		JVM INSTR tableswitch -1 7: default 501
	//	               -1 363
	//	               0 357
	//	               1 343
	//	               2 329
	//	               3 320
	//	               4 311
	//	               5 302
	//	               6 293
	//	               7 279;
	//  105  224:tableswitch     -1 7: default 501
	//	               -1 363
	//	               0 357
	//	               1 343
	//	               2 329
	//	               3 320
	//	               4 311
	//	               5 302
	//	               6 293
	//	               7 279
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
		break MISSING_BLOCK_LABEL_476;
	//  106  276:goto            476
_L2:
		break; /* Loop/switch isn't completed */
_L10:
		((HttpURLConnection) (map)).setRequestMethod("PATCH");
	//  107  279:aload_2         
	//  108  280:ldc1            #216 <String "PATCH">
	//  109  282:invokevirtual   #219 <Method void HttpURLConnection.setRequestMethod(String)>
		a(((HttpURLConnection) (map)), boq1);
	//  110  285:aload_2         
	//  111  286:aload_1         
	//  112  287:invokestatic    #221 <Method void a(HttpURLConnection, boq)>
		break; /* Loop/switch isn't completed */
	//  113  290:goto            363
_L9:
		((HttpURLConnection) (map)).setRequestMethod("TRACE");
	//  114  293:aload_2         
	//  115  294:ldc1            #223 <String "TRACE">
	//  116  296:invokevirtual   #219 <Method void HttpURLConnection.setRequestMethod(String)>
		break; /* Loop/switch isn't completed */
	//  117  299:goto            363
_L8:
		((HttpURLConnection) (map)).setRequestMethod("OPTIONS");
	//  118  302:aload_2         
	//  119  303:ldc1            #225 <String "OPTIONS">
	//  120  305:invokevirtual   #219 <Method void HttpURLConnection.setRequestMethod(String)>
		break; /* Loop/switch isn't completed */
	//  121  308:goto            363
_L7:
		((HttpURLConnection) (map)).setRequestMethod("HEAD");
	//  122  311:aload_2         
	//  123  312:ldc1            #227 <String "HEAD">
	//  124  314:invokevirtual   #219 <Method void HttpURLConnection.setRequestMethod(String)>
		break; /* Loop/switch isn't completed */
	//  125  317:goto            363
_L6:
		((HttpURLConnection) (map)).setRequestMethod("DELETE");
	//  126  320:aload_2         
	//  127  321:ldc1            #229 <String "DELETE">
	//  128  323:invokevirtual   #219 <Method void HttpURLConnection.setRequestMethod(String)>
		break; /* Loop/switch isn't completed */
	//  129  326:goto            363
_L5:
		((HttpURLConnection) (map)).setRequestMethod("PUT");
	//  130  329:aload_2         
	//  131  330:ldc1            #231 <String "PUT">
	//  132  332:invokevirtual   #219 <Method void HttpURLConnection.setRequestMethod(String)>
		a(((HttpURLConnection) (map)), boq1);
	//  133  335:aload_2         
	//  134  336:aload_1         
	//  135  337:invokestatic    #221 <Method void a(HttpURLConnection, boq)>
		break; /* Loop/switch isn't completed */
	//  136  340:goto            363
_L4:
		((HttpURLConnection) (map)).setRequestMethod("POST");
	//  137  343:aload_2         
	//  138  344:ldc1            #233 <String "POST">
	//  139  346:invokevirtual   #219 <Method void HttpURLConnection.setRequestMethod(String)>
		a(((HttpURLConnection) (map)), boq1);
	//  140  349:aload_2         
	//  141  350:aload_1         
	//  142  351:invokestatic    #221 <Method void a(HttpURLConnection, boq)>
		break; /* Loop/switch isn't completed */
	//  143  354:goto            363
_L3:
		((HttpURLConnection) (map)).setRequestMethod("GET");
	//  144  357:aload_2         
	//  145  358:ldc1            #235 <String "GET">
	//  146  360:invokevirtual   #219 <Method void HttpURLConnection.setRequestMethod(String)>
		int j = ((HttpURLConnection) (map)).getResponseCode();
	//  147  363:aload_2         
	//  148  364:invokevirtual   #238 <Method int HttpURLConnection.getResponseCode()>
	//  149  367:istore          5
		if(j == -1)
			break MISSING_BLOCK_LABEL_465;
	//  150  369:iload           5
	//  151  371:iconst_m1       
	//  152  372:icmpeq          465
		boolean flag;
		if(boq1.c() != 4 && (100 > j || j >= 200) && j != 204 && j != 304)
	//* 153  375:aload_1         
	//* 154  376:invokevirtual   #214 <Method int boq.c()>
	//* 155  379:iconst_4        
	//* 156  380:icmpeq          525
	//* 157  383:bipush          100
	//* 158  385:iload           5
	//* 159  387:icmpgt          504
	//* 160  390:iload           5
	//* 161  392:sipush          200
	//* 162  395:icmplt          525
	//* 163  398:goto            504
	//* 164  401:iload_3         
	//* 165  402:ifne            428
	//* 166  405:new             #240 <Class oz>
	//* 167  408:dup             
	//* 168  409:iload           5
	//* 169  411:aload_2         
	//* 170  412:invokevirtual   #243 <Method Map HttpURLConnection.getHeaderFields()>
	//* 171  415:invokestatic    #245 <Method List a(Map)>
	//* 172  418:invokespecial   #248 <Method void oz(int, List)>
	//* 173  421:astore_1        
	//* 174  422:aload_2         
	//* 175  423:invokevirtual   #251 <Method void HttpURLConnection.disconnect()>
	//* 176  426:aload_1         
	//* 177  427:areturn         
	//* 178  428:new             #240 <Class oz>
	//* 179  431:dup             
	//* 180  432:iload           5
	//* 181  434:aload_2         
	//* 182  435:invokevirtual   #243 <Method Map HttpURLConnection.getHeaderFields()>
	//* 183  438:invokestatic    #245 <Method List a(Map)>
	//* 184  441:aload_2         
	//* 185  442:invokevirtual   #254 <Method int HttpURLConnection.getContentLength()>
	//* 186  445:new             #256 <Class ry>
	//* 187  448:dup             
	//* 188  449:aload_2         
	//* 189  450:invokespecial   #259 <Method void ry(HttpURLConnection)>
	//* 190  453:invokespecial   #262 <Method void oz(int, List, int, InputStream)>
	//* 191  456:astore_1        
	//* 192  457:aload_1         
	//* 193  458:areturn         
	//* 194  459:astore_1        
	//* 195  460:iconst_1        
	//* 196  461:istore_3        
	//* 197  462:goto            491
	//* 198  465:new             #140 <Class IOException>
	//* 199  468:dup             
	//* 200  469:ldc2            #264 <String "Could not retrieve response code from HttpUrlConnection.">
	//* 201  472:invokespecial   #168 <Method void IOException(String)>
	//* 202  475:athrow          
	//* 203  476:new             #266 <Class IllegalStateException>
	//* 204  479:dup             
	//* 205  480:ldc2            #268 <String "Unknown method type.">
	//* 206  483:invokespecial   #269 <Method void IllegalStateException(String)>
	//* 207  486:athrow          
	//* 208  487:astore_1        
	//* 209  488:iload           4
	//* 210  490:istore_3        
	//* 211  491:iload_3         
	//* 212  492:ifne            499
	//* 213  495:aload_2         
	//* 214  496:invokevirtual   #251 <Method void HttpURLConnection.disconnect()>
	//* 215  499:aload_1         
	//* 216  500:athrow          
	//* 217  501:goto            276
	//* 218  504:iload           5
	//* 219  506:sipush          204
	//* 220  509:icmpeq          525
	//* 221  512:iload           5
	//* 222  514:sipush          304
	//* 223  517:icmpeq          525
			flag = true;
	//  224  520:iconst_1        
	//  225  521:istore_3        
		else
	//* 226  522:goto            401
			flag = false;
	//  227  525:iconst_0        
	//  228  526:istore_3        
		if(flag)
			break MISSING_BLOCK_LABEL_428;
		boq1 = ((boq) (new oz(j, a(((HttpURLConnection) (map)).getHeaderFields()))));
		((HttpURLConnection) (map)).disconnect();
		return ((oz) (boq1));
		boq1 = ((boq) (new oz(j, a(((HttpURLConnection) (map)).getHeaderFields()), ((HttpURLConnection) (map)).getContentLength(), ((InputStream) (new ry(((HttpURLConnection) (map))))))));
		return ((oz) (boq1));
		boq1;
		flag = true;
		break MISSING_BLOCK_LABEL_491;
		throw new IOException("Could not retrieve response code from HttpUrlConnection.");
		throw new IllegalStateException("Unknown method type.");
		boq1;
		flag = flag1;
		if(!flag)
			((HttpURLConnection) (map)).disconnect();
		throw boq1;
	//* 229  527:goto            401
	}

	private final sx a;
	private final SSLSocketFactory b;
}
