// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.util.Pair;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.craftar:
//			MySSLSocketFactory, CLog

class HttpJSON
{

	HttpJSON()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static JSONObject get(String s)
	{
		HttpsURLConnection.setDefaultSSLSocketFactory(((javax.net.ssl.SSLSocketFactory) (new MySSLSocketFactory())));
	//    0    0:new             #19  <Class MySSLSocketFactory>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void MySSLSocketFactory()>
	//    3    7:invokestatic    #26  <Method void HttpsURLConnection.setDefaultSSLSocketFactory(javax.net.ssl.SSLSocketFactory)>
		Object obj1;
		StringBuffer stringbuffer;
		String s1;
		obj1 = ((Object) ((HttpURLConnection)(new URL(s)).openConnection()));
	//    4   10:new             #28  <Class URL>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokespecial   #31  <Method void URL(String)>
	//    8   18:invokevirtual   #35  <Method java.net.URLConnection URL.openConnection()>
	//    9   21:checkcast       #37  <Class HttpURLConnection>
	//   10   24:astore_2        
		s1 = ((HttpURLConnection) (obj1)).getHeaderField("Content-Encoding");
	//   11   25:aload_2         
	//   12   26:ldc1            #39  <String "Content-Encoding">
	//   13   28:invokevirtual   #43  <Method String HttpURLConnection.getHeaderField(String)>
	//   14   31:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   15   33:new             #45  <Class StringBuilder>
	//   16   36:dup             
	//   17   37:invokespecial   #46  <Method void StringBuilder()>
	//   18   40:astore_1        
		stringbuilder.append("Content-Encoding: ");
	//   19   41:aload_1         
	//   20   42:ldc1            #48  <String "Content-Encoding: ">
	//   21   44:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   22   47:pop             
		stringbuilder.append(s1);
	//   23   48:aload_1         
	//   24   49:aload           4
	//   25   51:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
		CLog.d(stringbuilder.toString());
	//   27   55:aload_1         
	//   28   56:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   29   59:invokestatic    #61  <Method void CLog.d(String)>
		stringbuffer = new StringBuffer("");
	//   30   62:new             #63  <Class StringBuffer>
	//   31   65:dup             
	//   32   66:ldc1            #65  <String "">
	//   33   68:invokespecial   #66  <Method void StringBuffer(String)>
	//   34   71:astore_3        
		Object obj = ((Object) (((HttpURLConnection) (obj1)).getInputStream()));
	//   35   72:aload_2         
	//   36   73:invokevirtual   #70  <Method java.io.InputStream HttpURLConnection.getInputStream()>
	//   37   76:astore_1        
		  goto _L1
	//*  38   77:goto            85
_L4:
		obj = ((Object) (((HttpURLConnection) (obj1)).getErrorStream()));
	//   39   80:aload_2         
	//   40   81:invokevirtual   #73  <Method java.io.InputStream HttpURLConnection.getErrorStream()>
	//   41   84:astore_1        
_L1:
		if(s1 == null)
			break MISSING_BLOCK_LABEL_112;
	//   42   85:aload           4
	//   43   87:ifnull          247
		if(s1.equals("gzip"))
	//*  44   90:aload           4
	//*  45   92:ldc1            #75  <String "gzip">
	//*  46   94:invokevirtual   #81  <Method boolean String.equals(Object)>
	//*  47   97:ifeq            247
			obj = ((Object) (new GZIPInputStream(((java.io.InputStream) (obj)))));
	//   48  100:new             #83  <Class GZIPInputStream>
	//   49  103:dup             
	//   50  104:aload_1         
	//   51  105:invokespecial   #86  <Method void GZIPInputStream(java.io.InputStream)>
	//   52  108:astore_1        
	//*  53  109:goto            112
		obj = ((Object) (new BufferedReader(((java.io.Reader) (new InputStreamReader(((java.io.InputStream) (obj))))))));
	//   54  112:new             #88  <Class BufferedReader>
	//   55  115:dup             
	//   56  116:new             #90  <Class InputStreamReader>
	//   57  119:dup             
	//   58  120:aload_1         
	//   59  121:invokespecial   #91  <Method void InputStreamReader(java.io.InputStream)>
	//   60  124:invokespecial   #94  <Method void BufferedReader(java.io.Reader)>
	//   61  127:astore_1        
_L2:
		s1 = ((BufferedReader) (obj)).readLine();
	//   62  128:aload_1         
	//   63  129:invokevirtual   #97  <Method String BufferedReader.readLine()>
	//   64  132:astore          4
		if(s1 == null)
			break MISSING_BLOCK_LABEL_149;
	//   65  134:aload           4
	//   66  136:ifnull          149
		stringbuffer.append(s1);
	//   67  139:aload_3         
	//   68  140:aload           4
	//   69  142:invokevirtual   #100 <Method StringBuffer StringBuffer.append(String)>
	//   70  145:pop             
		  goto _L2
	//*  71  146:goto            128
		try
		{
			((BufferedReader) (obj)).close();
	//   72  149:aload_1         
	//   73  150:invokevirtual   #103 <Method void BufferedReader.close()>
			obj = ((Object) (stringbuffer.toString()));
	//   74  153:aload_3         
	//   75  154:invokevirtual   #104 <Method String StringBuffer.toString()>
	//   76  157:astore_1        
			if(((HttpURLConnection) (obj1)).getResponseCode() == 200)
	//*  77  158:aload_2         
	//*  78  159:invokevirtual   #108 <Method int HttpURLConnection.getResponseCode()>
	//*  79  162:sipush          200
	//*  80  165:icmpne          177
				return new JSONObject(((String) (obj)));
	//   81  168:new             #110 <Class JSONObject>
	//   82  171:dup             
	//   83  172:aload_1         
	//   84  173:invokespecial   #111 <Method void JSONObject(String)>
	//   85  176:areturn         
			obj1 = ((Object) (new StringBuilder()));
	//   86  177:new             #45  <Class StringBuilder>
	//   87  180:dup             
	//   88  181:invokespecial   #46  <Method void StringBuilder()>
	//   89  184:astore_2        
			((StringBuilder) (obj1)).append("Error posting to ");
	//   90  185:aload_2         
	//   91  186:ldc1            #113 <String "Error posting to ">
	//   92  188:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   93  191:pop             
			((StringBuilder) (obj1)).append(s);
	//   94  192:aload_2         
	//   95  193:aload_0         
	//   96  194:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   97  197:pop             
			((StringBuilder) (obj1)).append(" error: ");
	//   98  198:aload_2         
	//   99  199:ldc1            #115 <String " error: ">
	//  100  201:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//  101  204:pop             
			((StringBuilder) (obj1)).append(((String) (obj)));
	//  102  205:aload_2         
	//  103  206:aload_1         
	//  104  207:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//  105  210:pop             
			CLog.e(((StringBuilder) (obj1)).toString());
	//  106  211:aload_2         
	//  107  212:invokevirtual   #56  <Method String StringBuilder.toString()>
	//  108  215:invokestatic    #118 <Method void CLog.e(String)>
		}
	//* 109  218:new             #110 <Class JSONObject>
	//* 110  221:dup             
	//* 111  222:aload_1         
	//* 112  223:invokespecial   #111 <Method void JSONObject(String)>
	//* 113  226:astore_0        
	//* 114  227:aload_0         
	//* 115  228:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 116  229:astore_0        
		{
			break MISSING_BLOCK_LABEL_234;
	//  117  230:goto            234
		}
		FileNotFoundException filenotfoundexception;
		try
		{
			s = ((String) (new JSONObject(((String) (obj)))));
		}
	//* 118  233:astore_0        
	//* 119  234:aload_0         
	//* 120  235:invokevirtual   #123 <Method void Exception.printStackTrace()>
	//* 121  238:aconst_null     
	//* 122  239:areturn         
	//* 123  240:astore_1        
	//* 124  241:goto            80
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 125  244:astore_0        
		{
			return null;
	//  126  245:aconst_null     
	//  127  246:areturn         
		}
		return ((JSONObject) (s));
		s;
		((Exception) (s)).printStackTrace();
		return null;
		filenotfoundexception;
		if(true) goto _L4; else goto _L3
_L3:
	//* 128  247:goto            112
	}

	public static JSONObject post(String s, JSONObject jsonobject)
		throws Exception
	{
		HttpsURLConnection.setDefaultSSLSocketFactory(((javax.net.ssl.SSLSocketFactory) (new MySSLSocketFactory())));
	//    0    0:new             #19  <Class MySSLSocketFactory>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void MySSLSocketFactory()>
	//    3    7:invokestatic    #26  <Method void HttpsURLConnection.setDefaultSSLSocketFactory(javax.net.ssl.SSLSocketFactory)>
		HttpURLConnection httpurlconnection = (HttpURLConnection)(new URL(s)).openConnection();
	//    4   10:new             #28  <Class URL>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokespecial   #31  <Method void URL(String)>
	//    8   18:invokevirtual   #35  <Method java.net.URLConnection URL.openConnection()>
	//    9   21:checkcast       #37  <Class HttpURLConnection>
	//   10   24:astore          4
		httpurlconnection.setRequestMethod("POST");
	//   11   26:aload           4
	//   12   28:ldc1            #127 <String "POST">
	//   13   30:invokevirtual   #130 <Method void HttpURLConnection.setRequestMethod(String)>
		httpurlconnection.addRequestProperty("Accept-encoding", "gzip");
	//   14   33:aload           4
	//   15   35:ldc1            #132 <String "Accept-encoding">
	//   16   37:ldc1            #75  <String "gzip">
	//   17   39:invokevirtual   #136 <Method void HttpURLConnection.addRequestProperty(String, String)>
		httpurlconnection.setDoInput(true);
	//   18   42:aload           4
	//   19   44:iconst_1        
	//   20   45:invokevirtual   #140 <Method void HttpURLConnection.setDoInput(boolean)>
		httpurlconnection.setDoOutput(true);
	//   21   48:aload           4
	//   22   50:iconst_1        
	//   23   51:invokevirtual   #143 <Method void HttpURLConnection.setDoOutput(boolean)>
		Object obj2 = ((Object) (new ArrayList()));
	//   24   54:new             #145 <Class ArrayList>
	//   25   57:dup             
	//   26   58:invokespecial   #146 <Method void ArrayList()>
	//   27   61:astore          5
		String s2;
		for(Iterator iterator = jsonobject.keys(); iterator.hasNext(); ((ArrayList) (obj2)).add(((Object) (new Pair(((Object) (s2)), ((Object) (jsonobject.getString(s2))))))))
	//*  28   63:aload_1         
	//*  29   64:invokevirtual   #150 <Method Iterator JSONObject.keys()>
	//*  30   67:astore_3        
	//*  31   68:aload_3         
	//*  32   69:invokeinterface #156 <Method boolean Iterator.hasNext()>
	//*  33   74:ifeq            112
			s2 = (String)iterator.next();
	//   34   77:aload_3         
	//   35   78:invokeinterface #160 <Method Object Iterator.next()>
	//   36   83:checkcast       #77  <Class String>
	//   37   86:astore          6

	//   38   88:aload           5
	//   39   90:new             #162 <Class Pair>
	//   40   93:dup             
	//   41   94:aload           6
	//   42   96:aload_1         
	//   43   97:aload           6
	//   44   99:invokevirtual   #165 <Method String JSONObject.getString(String)>
	//   45  102:invokespecial   #168 <Method void Pair(Object, Object)>
	//   46  105:invokevirtual   #171 <Method boolean ArrayList.add(Object)>
	//   47  108:pop             
	//*  48  109:goto            68
		jsonobject = "";
	//   49  112:ldc1            #65  <String "">
	//   50  114:astore_1        
		for(int i = 0; i < ((ArrayList) (obj2)).size(); i++)
	//*  51  115:iconst_0        
	//*  52  116:istore_2        
	//*  53  117:iload_2         
	//*  54  118:aload           5
	//*  55  120:invokevirtual   #174 <Method int ArrayList.size()>
	//*  56  123:icmpge          238
		{
			Object obj = ((Object) ((Pair)((ArrayList) (obj2)).get(i)));
	//   57  126:aload           5
	//   58  128:iload_2         
	//   59  129:invokevirtual   #177 <Method Object ArrayList.get(int)>
	//   60  132:checkcast       #162 <Class Pair>
	//   61  135:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   62  136:new             #45  <Class StringBuilder>
	//   63  139:dup             
	//   64  140:invokespecial   #46  <Method void StringBuilder()>
	//   65  143:astore          6
			stringbuilder.append(((String) (jsonobject)));
	//   66  145:aload           6
	//   67  147:aload_1         
	//   68  148:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   69  151:pop             
			stringbuilder.append((String)((Pair) (obj)).first);
	//   70  152:aload           6
	//   71  154:aload_3         
	//   72  155:getfield        #181 <Field Object Pair.first>
	//   73  158:checkcast       #77  <Class String>
	//   74  161:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   75  164:pop             
			stringbuilder.append("=");
	//   76  165:aload           6
	//   77  167:ldc1            #183 <String "=">
	//   78  169:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   79  172:pop             
			stringbuilder.append((String)((Pair) (obj)).second);
	//   80  173:aload           6
	//   81  175:aload_3         
	//   82  176:getfield        #186 <Field Object Pair.second>
	//   83  179:checkcast       #77  <Class String>
	//   84  182:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   85  185:pop             
			obj = ((Object) (stringbuilder.toString()));
	//   86  186:aload           6
	//   87  188:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   88  191:astore_3        
			jsonobject = ((JSONObject) (obj));
	//   89  192:aload_3         
	//   90  193:astore_1        
			if(i < ((ArrayList) (obj2)).size() - 1)
	//*  91  194:iload_2         
	//*  92  195:aload           5
	//*  93  197:invokevirtual   #174 <Method int ArrayList.size()>
	//*  94  200:iconst_1        
	//*  95  201:isub            
	//*  96  202:icmpge          231
			{
				jsonobject = ((JSONObject) (new StringBuilder()));
	//   97  205:new             #45  <Class StringBuilder>
	//   98  208:dup             
	//   99  209:invokespecial   #46  <Method void StringBuilder()>
	//  100  212:astore_1        
				((StringBuilder) (jsonobject)).append(((String) (obj)));
	//  101  213:aload_1         
	//  102  214:aload_3         
	//  103  215:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//  104  218:pop             
				((StringBuilder) (jsonobject)).append("&");
	//  105  219:aload_1         
	//  106  220:ldc1            #188 <String "&">
	//  107  222:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//  108  225:pop             
				jsonobject = ((JSONObject) (((StringBuilder) (jsonobject)).toString()));
	//  109  226:aload_1         
	//  110  227:invokevirtual   #56  <Method String StringBuilder.toString()>
	//  111  230:astore_1        
			}
		}

	//  112  231:iload_2         
	//  113  232:iconst_1        
	//  114  233:iadd            
	//  115  234:istore_2        
	//* 116  235:goto            117
		Object obj1 = ((Object) (httpurlconnection.getOutputStream()));
	//  117  238:aload           4
	//  118  240:invokevirtual   #192 <Method OutputStream HttpURLConnection.getOutputStream()>
	//  119  243:astore_3        
		((OutputStream) (obj1)).write(((String) (jsonobject)).getBytes());
	//  120  244:aload_3         
	//  121  245:aload_1         
	//  122  246:invokevirtual   #196 <Method byte[] String.getBytes()>
	//  123  249:invokevirtual   #202 <Method void OutputStream.write(byte[])>
		((OutputStream) (obj1)).close();
	//  124  252:aload_3         
	//  125  253:invokevirtual   #203 <Method void OutputStream.close()>
		httpurlconnection.connect();
	//  126  256:aload           4
	//  127  258:invokevirtual   #206 <Method void HttpURLConnection.connect()>
		obj2 = ((Object) (httpurlconnection.getHeaderField("Content-Encoding")));
	//  128  261:aload           4
	//  129  263:ldc1            #39  <String "Content-Encoding">
	//  130  265:invokevirtual   #43  <Method String HttpURLConnection.getHeaderField(String)>
	//  131  268:astore          5
		jsonobject = ((JSONObject) (new StringBuilder()));
	//  132  270:new             #45  <Class StringBuilder>
	//  133  273:dup             
	//  134  274:invokespecial   #46  <Method void StringBuilder()>
	//  135  277:astore_1        
		((StringBuilder) (jsonobject)).append("Content-Encoding: ");
	//  136  278:aload_1         
	//  137  279:ldc1            #48  <String "Content-Encoding: ">
	//  138  281:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//  139  284:pop             
		((StringBuilder) (jsonobject)).append(((String) (obj2)));
	//  140  285:aload_1         
	//  141  286:aload           5
	//  142  288:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//  143  291:pop             
		CLog.d(((StringBuilder) (jsonobject)).toString());
	//  144  292:aload_1         
	//  145  293:invokevirtual   #56  <Method String StringBuilder.toString()>
	//  146  296:invokestatic    #61  <Method void CLog.d(String)>
		obj1 = ((Object) (new StringBuffer("")));
	//  147  299:new             #63  <Class StringBuffer>
	//  148  302:dup             
	//  149  303:ldc1            #65  <String "">
	//  150  305:invokespecial   #66  <Method void StringBuffer(String)>
	//  151  308:astore_3        
		try
		{
			jsonobject = ((JSONObject) (httpurlconnection.getInputStream()));
	//  152  309:aload           4
	//  153  311:invokevirtual   #70  <Method java.io.InputStream HttpURLConnection.getInputStream()>
	//  154  314:astore_1        
		}
	//* 155  315:goto            324
	//* 156  318:aload           4
	//* 157  320:invokevirtual   #73  <Method java.io.InputStream HttpURLConnection.getErrorStream()>
	//* 158  323:astore_1        
	//* 159  324:aload           5
	//* 160  326:ifnull          351
	//* 161  329:aload           5
	//* 162  331:ldc1            #75  <String "gzip">
	//* 163  333:invokevirtual   #81  <Method boolean String.equals(Object)>
	//* 164  336:ifeq            351
	//* 165  339:new             #83  <Class GZIPInputStream>
	//* 166  342:dup             
	//* 167  343:aload_1         
	//* 168  344:invokespecial   #86  <Method void GZIPInputStream(java.io.InputStream)>
	//* 169  347:astore_1        
	//* 170  348:goto            351
	//* 171  351:new             #88  <Class BufferedReader>
	//* 172  354:dup             
	//* 173  355:new             #90  <Class InputStreamReader>
	//* 174  358:dup             
	//* 175  359:aload_1         
	//* 176  360:invokespecial   #91  <Method void InputStreamReader(java.io.InputStream)>
	//* 177  363:invokespecial   #94  <Method void BufferedReader(java.io.Reader)>
	//* 178  366:astore_1        
	//* 179  367:aload_1         
	//* 180  368:invokevirtual   #97  <Method String BufferedReader.readLine()>
	//* 181  371:astore          5
	//* 182  373:aload           5
	//* 183  375:ifnull          388
	//* 184  378:aload_3         
	//* 185  379:aload           5
	//* 186  381:invokevirtual   #100 <Method StringBuffer StringBuffer.append(String)>
	//* 187  384:pop             
	//* 188  385:goto            367
	//* 189  388:aload_1         
	//* 190  389:invokevirtual   #103 <Method void BufferedReader.close()>
	//* 191  392:aload_3         
	//* 192  393:invokevirtual   #104 <Method String StringBuffer.toString()>
	//* 193  396:astore_1        
	//* 194  397:aload           4
	//* 195  399:invokevirtual   #108 <Method int HttpURLConnection.getResponseCode()>
	//* 196  402:sipush          200
	//* 197  405:icmpne          417
	//* 198  408:new             #110 <Class JSONObject>
	//* 199  411:dup             
	//* 200  412:aload_1         
	//* 201  413:invokespecial   #111 <Method void JSONObject(String)>
	//* 202  416:areturn         
	//* 203  417:new             #45  <Class StringBuilder>
	//* 204  420:dup             
	//* 205  421:invokespecial   #46  <Method void StringBuilder()>
	//* 206  424:astore_3        
	//* 207  425:aload_3         
	//* 208  426:ldc1            #113 <String "Error posting to ">
	//* 209  428:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//* 210  431:pop             
	//* 211  432:aload_3         
	//* 212  433:aload_0         
	//* 213  434:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//* 214  437:pop             
	//* 215  438:aload_3         
	//* 216  439:ldc1            #115 <String " error: ">
	//* 217  441:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//* 218  444:pop             
	//* 219  445:aload_3         
	//* 220  446:aload_1         
	//* 221  447:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//* 222  450:pop             
	//* 223  451:aload_3         
	//* 224  452:invokevirtual   #56  <Method String StringBuilder.toString()>
	//* 225  455:invokestatic    #118 <Method void CLog.e(String)>
	//* 226  458:new             #110 <Class JSONObject>
	//* 227  461:dup             
	//* 228  462:aload_1         
	//* 229  463:invokespecial   #111 <Method void JSONObject(String)>
	//* 230  466:astore_0        
	//* 231  467:aload_0         
	//* 232  468:areturn         
	//* 233  469:aconst_null     
	//* 234  470:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
		{
			jsonobject = ((JSONObject) (httpurlconnection.getErrorStream()));
		}
		if(obj2 != null && ((String) (obj2)).equals("gzip"))
			jsonobject = ((JSONObject) (new GZIPInputStream(((java.io.InputStream) (jsonobject)))));
		jsonobject = ((JSONObject) (new BufferedReader(((java.io.Reader) (new InputStreamReader(((java.io.InputStream) (jsonobject))))))));
		do
		{
			String s1 = ((BufferedReader) (jsonobject)).readLine();
			if(s1 == null)
				break;
			((StringBuffer) (obj1)).append(s1);
		} while(true);
		((BufferedReader) (jsonobject)).close();
		jsonobject = ((JSONObject) (((StringBuffer) (obj1)).toString()));
		if(httpurlconnection.getResponseCode() == 200)
			return new JSONObject(((String) (jsonobject)));
		obj1 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj1)).append("Error posting to ");
		((StringBuilder) (obj1)).append(s);
		((StringBuilder) (obj1)).append(" error: ");
		((StringBuilder) (obj1)).append(((String) (jsonobject)));
		CLog.e(((StringBuilder) (obj1)).toString());
		try
		{
			s = ((String) (new JSONObject(((String) (jsonobject)))));
		}
	//* 235  471:astore_1        
	//* 236  472:goto            318
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		return ((JSONObject) (s));
	//* 237  475:astore_0        
	//* 238  476:goto            469
	}
}
