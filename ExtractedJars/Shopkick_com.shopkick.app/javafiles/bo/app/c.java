// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.zip.GZIPInputStream;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			d, aq, dr, h, 
//			v

public final class c
	implements d
{

	public c(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		b = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #27  <Field int b>
	//    5    9:return          
	}

	private InputStream a(HttpURLConnection httpurlconnection)
	{
		httpurlconnection.connect();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #33  <Method void HttpURLConnection.connect()>
		if(httpurlconnection.getResponseCode() / 100 == 2)
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #37  <Method int HttpURLConnection.getResponseCode()>
	//*   4    8:bipush          100
	//*   5   10:idiv            
	//*   6   11:iconst_2        
	//*   7   12:icmpne          51
		{
			if("gzip".equalsIgnoreCase(httpurlconnection.getContentEncoding()))
	//*   8   15:ldc1            #39  <String "gzip">
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #43  <Method String HttpURLConnection.getContentEncoding()>
	//*  11   21:invokevirtual   #49  <Method boolean String.equalsIgnoreCase(String)>
	//*  12   24:ifeq            39
				return ((InputStream) (new GZIPInputStream(httpurlconnection.getInputStream())));
	//   13   27:new             #51  <Class GZIPInputStream>
	//   14   30:dup             
	//   15   31:aload_1         
	//   16   32:invokevirtual   #55  <Method InputStream HttpURLConnection.getInputStream()>
	//   17   35:invokespecial   #58  <Method void GZIPInputStream(InputStream)>
	//   18   38:areturn         
			else
				return ((InputStream) (new BufferedInputStream(httpurlconnection.getInputStream())));
	//   19   39:new             #60  <Class BufferedInputStream>
	//   20   42:dup             
	//   21   43:aload_1         
	//   22   44:invokevirtual   #55  <Method InputStream HttpURLConnection.getInputStream()>
	//   23   47:invokespecial   #61  <Method void BufferedInputStream(InputStream)>
	//   24   50:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   25   51:new             #63  <Class StringBuilder>
	//   26   54:dup             
	//   27   55:invokespecial   #64  <Method void StringBuilder()>
	//   28   58:astore_2        
			stringbuilder.append("Bad Http response code from Appboy: [");
	//   29   59:aload_2         
	//   30   60:ldc1            #66  <String "Bad Http response code from Appboy: [">
	//   31   62:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   32   65:pop             
			stringbuilder.append(httpurlconnection.getResponseCode());
	//   33   66:aload_2         
	//   34   67:aload_1         
	//   35   68:invokevirtual   #37  <Method int HttpURLConnection.getResponseCode()>
	//   36   71:invokevirtual   #73  <Method StringBuilder StringBuilder.append(int)>
	//   37   74:pop             
			stringbuilder.append("]");
	//   38   75:aload_2         
	//   39   76:ldc1            #75  <String "]">
	//   40   78:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   41   81:pop             
			throw new aq(stringbuilder.toString());
	//   42   82:new             #77  <Class aq>
	//   43   85:dup             
	//   44   86:aload_2         
	//   45   87:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   46   90:invokespecial   #83  <Method void aq(String)>
	//   47   93:athrow          
		}
	}

	private String a(BufferedReader bufferedreader)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #63  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #64  <Method void StringBuilder()>
	//    3    7:astore_2        
		do
		{
			String s = bufferedreader.readLine();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #89  <Method String BufferedReader.readLine()>
	//    6   12:astore_3        
			if(s != null)
	//*   7   13:aload_3         
	//*   8   14:ifnull          26
				stringbuilder.append(s);
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   12   22:pop             
			else
	//*  13   23:goto            8
				return stringbuilder.toString();
	//   14   26:aload_2         
	//   15   27:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   16   30:areturn         
		} while(true);
	}

	private JSONObject a(URI uri, JSONObject jsonobject, Map map, v v1)
	{
		IOException ioexception;
		uri = ((URI) (dr.a(uri)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #97  <Method URL dr.a(URI)>
	//    2    4:astore_1        
		if(uri != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          96
		{
			JSONObject jsonobject1;
			try
			{
				jsonobject1 = a(((URL) (uri)), jsonobject, map, v1);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:aload           4
	//   10   15:invokespecial   #100 <Method JSONObject a(URL, JSONObject, Map, v)>
	//   11   18:astore          5
			}
	//*  12   20:aload           5
	//*  13   22:areturn         
	//*  14   23:aload_0         
	//*  15   24:aload_1         
	//*  16   25:aload_2         
	//*  17   26:aload_3         
	//*  18   27:aload           4
	//*  19   29:invokespecial   #100 <Method JSONObject a(URL, JSONObject, Map, v)>
	//*  20   32:astore_2        
	//*  21   33:aload_2         
	//*  22   34:areturn         
	//*  23   35:astore_2        
	//*  24   36:new             #63  <Class StringBuilder>
	//*  25   39:dup             
	//*  26   40:invokespecial   #64  <Method void StringBuilder()>
	//*  27   43:astore_3        
	//*  28   44:aload_3         
	//*  29   45:ldc1            #102 <String "Experienced IOException twice during request to [">
	//*  30   47:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//*  31   50:pop             
	//*  32   51:aload_3         
	//*  33   52:aload_1         
	//*  34   53:invokevirtual   #105 <Method String URL.toString()>
	//*  35   56:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//*  36   59:pop             
	//*  37   60:aload_3         
	//*  38   61:ldc1            #107 <String "], failing: [">
	//*  39   63:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//*  40   66:pop             
	//*  41   67:aload_3         
	//*  42   68:aload_2         
	//*  43   69:invokevirtual   #110 <Method String IOException.getMessage()>
	//*  44   72:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//*  45   75:pop             
	//*  46   76:aload_3         
	//*  47   77:ldc1            #75  <String "]">
	//*  48   79:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//*  49   82:pop             
	//*  50   83:new             #77  <Class aq>
	//*  51   86:dup             
	//*  52   87:aload_3         
	//*  53   88:invokevirtual   #80  <Method String StringBuilder.toString()>
	//*  54   91:aload_2         
	//*  55   92:invokespecial   #113 <Method void aq(String, Throwable)>
	//*  56   95:athrow          
	//*  57   96:aconst_null     
	//*  58   97:areturn         
			// Misplaced declaration of an exception variable
			catch(IOException ioexception)
			{
				try
				{
					jsonobject = a(((URL) (uri)), jsonobject, map, v1);
				}
				// Misplaced declaration of an exception variable
				catch(JSONObject jsonobject)
				{
					map = ((Map) (new StringBuilder()));
					((StringBuilder) (map)).append("Experienced IOException twice during request to [");
					((StringBuilder) (map)).append(((URL) (uri)).toString());
					((StringBuilder) (map)).append("], failing: [");
					((StringBuilder) (map)).append(((IOException) (jsonobject)).getMessage());
					((StringBuilder) (map)).append("]");
					throw new aq(((StringBuilder) (map)).toString(), ((Throwable) (jsonobject)));
				}
				return jsonobject;
			}
			return jsonobject1;
		} else
		{
			return null;
		}
	//*  59   98:astore          5
	//*  60  100:goto            23
	}

	private JSONObject a(URL url, JSONObject jsonobject, Map map, v v1)
	{
		if(url == null)
			break MISSING_BLOCK_LABEL_25;
	//    0    0:aload_1         
	//    1    1:ifnull          25
		jsonobject = ((JSONObject) (b(url, jsonobject, map, v1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #122 <Method HttpURLConnection b(URL, JSONObject, Map, v)>
	//    8   13:astore_2        
		break MISSING_BLOCK_LABEL_27;
	//    9   14:goto            27
		url;
	//   10   17:astore_1        
		jsonobject = null;
	//   11   18:aconst_null     
	//   12   19:astore_2        
		map = ((Map) (jsonobject));
	//   13   20:aload_2         
	//   14   21:astore_3        
		break MISSING_BLOCK_LABEL_222;
	//   15   22:goto            222
		jsonobject = null;
	//   16   25:aconst_null     
	//   17   26:astore_2        
		if(jsonobject == null)
			break MISSING_BLOCK_LABEL_254;
	//   18   27:aload_2         
	//   19   28:ifnull          254
		map = ((Map) (a(((HttpURLConnection) (jsonobject)))));
	//   20   31:aload_0         
	//   21   32:aload_2         
	//   22   33:invokespecial   #124 <Method InputStream a(HttpURLConnection)>
	//   23   36:astore_3        
		v1 = ((v) (new BufferedReader(((java.io.Reader) (new InputStreamReader(((InputStream) (map)), "UTF-8"))))));
	//   24   37:new             #86  <Class BufferedReader>
	//   25   40:dup             
	//   26   41:new             #126 <Class InputStreamReader>
	//   27   44:dup             
	//   28   45:aload_3         
	//   29   46:ldc1            #128 <String "UTF-8">
	//   30   48:invokespecial   #131 <Method void InputStreamReader(InputStream, String)>
	//   31   51:invokespecial   #134 <Method void BufferedReader(java.io.Reader)>
	//   32   54:astore          4
		v1 = ((v) (new JSONObject(a(((BufferedReader) (v1))))));
	//   33   56:new             #136 <Class JSONObject>
	//   34   59:dup             
	//   35   60:aload_0         
	//   36   61:aload           4
	//   37   63:invokespecial   #138 <Method String a(BufferedReader)>
	//   38   66:invokespecial   #139 <Method void JSONObject(String)>
	//   39   69:astore          4
		if(jsonobject != null)
	//*  40   71:aload_2         
	//*  41   72:ifnull          79
			((HttpURLConnection) (jsonobject)).disconnect();
	//   42   75:aload_2         
	//   43   76:invokevirtual   #142 <Method void HttpURLConnection.disconnect()>
		if(map == null)
			break MISSING_BLOCK_LABEL_101;
	//   44   79:aload_3         
	//   45   80:ifnull          101
		((InputStream) (map)).close();
	//   46   83:aload_3         
	//   47   84:invokevirtual   #147 <Method void InputStream.close()>
		return ((JSONObject) (v1));
	//   48   87:aload           4
	//   49   89:areturn         
		url;
	//   50   90:astore_1        
		AppboyLogger.e(a, "Caught an error trying to close the inputStream in getResult", ((Throwable) (url)));
	//   51   91:getstatic       #20  <Field String a>
	//   52   94:ldc1            #149 <String "Caught an error trying to close the inputStream in getResult">
	//   53   96:aload_1         
	//   54   97:invokestatic    #153 <Method int AppboyLogger.e(String, String, Throwable)>
	//   55  100:pop             
		return ((JSONObject) (v1));
	//   56  101:aload           4
	//   57  103:areturn         
		v1;
	//   58  104:astore          4
		String s = a;
	//   59  106:getstatic       #20  <Field String a>
	//   60  109:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//   61  111:new             #63  <Class StringBuilder>
	//   62  114:dup             
	//   63  115:invokespecial   #64  <Method void StringBuilder()>
	//   64  118:astore          6
		stringbuilder.append("Unable to parse response [");
	//   65  120:aload           6
	//   66  122:ldc1            #155 <String "Unable to parse response [">
	//   67  124:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   68  127:pop             
		stringbuilder.append(((Object) (v1)));
	//   69  128:aload           6
	//   70  130:aload           4
	//   71  132:invokevirtual   #158 <Method StringBuilder StringBuilder.append(Object)>
	//   72  135:pop             
		stringbuilder.append("]");
	//   73  136:aload           6
	//   74  138:ldc1            #75  <String "]">
	//   75  140:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   76  143:pop             
		AppboyLogger.e(s, stringbuilder.toString());
	//   77  144:aload           5
	//   78  146:aload           6
	//   79  148:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   80  151:invokestatic    #161 <Method int AppboyLogger.e(String, String)>
	//   81  154:pop             
		break MISSING_BLOCK_LABEL_256;
	//   82  155:goto            256
		v1;
	//   83  158:astore          4
		String s1 = a;
	//   84  160:getstatic       #20  <Field String a>
	//   85  163:astore          5
		StringBuilder stringbuilder1 = new StringBuilder();
	//   86  165:new             #63  <Class StringBuilder>
	//   87  168:dup             
	//   88  169:invokespecial   #64  <Method void StringBuilder()>
	//   89  172:astore          6
		stringbuilder1.append("Could not read from response stream [");
	//   90  174:aload           6
	//   91  176:ldc1            #163 <String "Could not read from response stream [">
	//   92  178:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   93  181:pop             
		stringbuilder1.append(((IOException) (v1)).getMessage());
	//   94  182:aload           6
	//   95  184:aload           4
	//   96  186:invokevirtual   #110 <Method String IOException.getMessage()>
	//   97  189:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   98  192:pop             
		stringbuilder1.append("]");
	//   99  193:aload           6
	//  100  195:ldc1            #75  <String "]">
	//  101  197:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//  102  200:pop             
		AppboyLogger.e(s1, stringbuilder1.toString());
	//  103  201:aload           5
	//  104  203:aload           6
	//  105  205:invokevirtual   #80  <Method String StringBuilder.toString()>
	//  106  208:invokestatic    #161 <Method int AppboyLogger.e(String, String)>
	//  107  211:pop             
		break MISSING_BLOCK_LABEL_256;
	//  108  212:goto            256
		url;
	//  109  215:astore_1        
		break MISSING_BLOCK_LABEL_222;
	//  110  216:goto            222
		url;
	//  111  219:astore_1        
		map = null;
	//  112  220:aconst_null     
	//  113  221:astore_3        
		if(jsonobject != null)
	//* 114  222:aload_2         
	//* 115  223:ifnull          230
			((HttpURLConnection) (jsonobject)).disconnect();
	//  116  226:aload_2         
	//  117  227:invokevirtual   #142 <Method void HttpURLConnection.disconnect()>
		if(map != null)
	//* 118  230:aload_3         
	//* 119  231:ifnull          252
			try
			{
				((InputStream) (map)).close();
	//  120  234:aload_3         
	//  121  235:invokevirtual   #147 <Method void InputStream.close()>
			}
	//* 122  238:goto            252
			// Misplaced declaration of an exception variable
			catch(JSONObject jsonobject)
	//* 123  241:astore_2        
			{
				AppboyLogger.e(a, "Caught an error trying to close the inputStream in getResult", ((Throwable) (jsonobject)));
	//  124  242:getstatic       #20  <Field String a>
	//  125  245:ldc1            #149 <String "Caught an error trying to close the inputStream in getResult">
	//  126  247:aload_2         
	//  127  248:invokestatic    #153 <Method int AppboyLogger.e(String, String, Throwable)>
	//  128  251:pop             
			}
		throw url;
	//  129  252:aload_1         
	//  130  253:athrow          
		map = null;
	//  131  254:aconst_null     
	//  132  255:astore_3        
		if(jsonobject != null)
	//* 133  256:aload_2         
	//* 134  257:ifnull          264
			((HttpURLConnection) (jsonobject)).disconnect();
	//  135  260:aload_2         
	//  136  261:invokevirtual   #142 <Method void HttpURLConnection.disconnect()>
		if(map != null)
	//* 137  264:aload_3         
	//* 138  265:ifnull          286
			try
			{
				((InputStream) (map)).close();
	//  139  268:aload_3         
	//  140  269:invokevirtual   #147 <Method void InputStream.close()>
			}
	//* 141  272:goto            286
			// Misplaced declaration of an exception variable
			catch(JSONObject jsonobject)
	//* 142  275:astore_2        
			{
				AppboyLogger.e(a, "Caught an error trying to close the inputStream in getResult", ((Throwable) (jsonobject)));
	//  143  276:getstatic       #20  <Field String a>
	//  144  279:ldc1            #149 <String "Caught an error trying to close the inputStream in getResult">
	//  145  281:aload_2         
	//  146  282:invokestatic    #153 <Method int AppboyLogger.e(String, String, Throwable)>
	//  147  285:pop             
			}
		jsonobject = ((JSONObject) (a));
	//  148  286:getstatic       #20  <Field String a>
	//  149  289:astore_2        
		map = ((Map) (new StringBuilder()));
	//  150  290:new             #63  <Class StringBuilder>
	//  151  293:dup             
	//  152  294:invokespecial   #64  <Method void StringBuilder()>
	//  153  297:astore_3        
		((StringBuilder) (map)).append("Failed to get result from [");
	//  154  298:aload_3         
	//  155  299:ldc1            #165 <String "Failed to get result from [">
	//  156  301:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//  157  304:pop             
		((StringBuilder) (map)).append(((Object) (url)));
	//  158  305:aload_3         
	//  159  306:aload_1         
	//  160  307:invokevirtual   #158 <Method StringBuilder StringBuilder.append(Object)>
	//  161  310:pop             
		((StringBuilder) (map)).append("]. Returning null.");
	//  162  311:aload_3         
	//  163  312:ldc1            #167 <String "]. Returning null.">
	//  164  314:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//  165  317:pop             
		AppboyLogger.w(((String) (jsonobject)), ((StringBuilder) (map)).toString());
	//  166  318:aload_2         
	//  167  319:aload_3         
	//  168  320:invokevirtual   #80  <Method String StringBuilder.toString()>
	//  169  323:invokestatic    #170 <Method int AppboyLogger.w(String, String)>
	//  170  326:pop             
		return null;
	//  171  327:aconst_null     
	//  172  328:areturn         
	}

	private void a(HttpURLConnection httpurlconnection, JSONObject jsonobject)
	{
		httpurlconnection.setDoOutput(true);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #176 <Method void HttpURLConnection.setDoOutput(boolean)>
		httpurlconnection = ((HttpURLConnection) (new BufferedOutputStream(httpurlconnection.getOutputStream())));
	//    3    5:new             #178 <Class BufferedOutputStream>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokevirtual   #182 <Method OutputStream HttpURLConnection.getOutputStream()>
	//    7   13:invokespecial   #185 <Method void BufferedOutputStream(OutputStream)>
	//    8   16:astore_1        
		((OutputStream) (httpurlconnection)).write(jsonobject.toString().getBytes("UTF-8"));
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokevirtual   #186 <Method String JSONObject.toString()>
	//   12   22:ldc1            #128 <String "UTF-8">
	//   13   24:invokevirtual   #190 <Method byte[] String.getBytes(String)>
	//   14   27:invokevirtual   #196 <Method void OutputStream.write(byte[])>
		((OutputStream) (httpurlconnection)).flush();
	//   15   30:aload_1         
	//   16   31:invokevirtual   #199 <Method void OutputStream.flush()>
		((OutputStream) (httpurlconnection)).close();
	//   17   34:aload_1         
	//   18   35:invokevirtual   #200 <Method void OutputStream.close()>
	//   19   38:return          
	}

	private HttpURLConnection b(URL url, JSONObject jsonobject, Map map, v v1)
	{
		HttpURLConnection httpurlconnection;
		try
		{
			httpurlconnection = (HttpURLConnection)h.a(url);
	//    0    0:aload_1         
	//    1    1:invokestatic    #205 <Method java.net.URLConnection h.a(URL)>
	//    2    4:checkcast       #30  <Class HttpURLConnection>
	//    3    7:astore          5
			httpurlconnection.setConnectTimeout(5000);
	//    4    9:aload           5
	//    5   11:sipush          5000
	//    6   14:invokevirtual   #208 <Method void HttpURLConnection.setConnectTimeout(int)>
			httpurlconnection.setReadTimeout(b);
	//    7   17:aload           5
	//    8   19:aload_0         
	//    9   20:getfield        #27  <Field int b>
	//   10   23:invokevirtual   #211 <Method void HttpURLConnection.setReadTimeout(int)>
			httpurlconnection.setInstanceFollowRedirects(false);
	//   11   26:aload           5
	//   12   28:iconst_0        
	//   13   29:invokevirtual   #214 <Method void HttpURLConnection.setInstanceFollowRedirects(boolean)>
			httpurlconnection.setRequestMethod(v1.toString());
	//   14   32:aload           5
	//   15   34:aload           4
	//   16   36:invokevirtual   #217 <Method String v.toString()>
	//   17   39:invokevirtual   #220 <Method void HttpURLConnection.setRequestMethod(String)>
			a(httpurlconnection, map);
	//   18   42:aload_0         
	//   19   43:aload           5
	//   20   45:aload_3         
	//   21   46:invokevirtual   #223 <Method void a(HttpURLConnection, Map)>
			if(v1 == v.b)
	//*  22   49:aload           4
	//*  23   51:getstatic       #226 <Field v v.b>
	//*  24   54:if_acmpne       64
				a(httpurlconnection, jsonobject);
	//   25   57:aload_0         
	//   26   58:aload           5
	//   27   60:aload_2         
	//   28   61:invokespecial   #228 <Method void a(HttpURLConnection, JSONObject)>
		}
	//*  29   64:aload           5
	//*  30   66:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  31   67:astore_2        
		{
			map = ((Map) (new StringBuilder()));
	//   32   68:new             #63  <Class StringBuilder>
	//   33   71:dup             
	//   34   72:invokespecial   #64  <Method void StringBuilder()>
	//   35   75:astore_3        
			((StringBuilder) (map)).append("Could not set up connection [");
	//   36   76:aload_3         
	//   37   77:ldc1            #230 <String "Could not set up connection [">
	//   38   79:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   39   82:pop             
			((StringBuilder) (map)).append(url.toString());
	//   40   83:aload_3         
	//   41   84:aload_1         
	//   42   85:invokevirtual   #105 <Method String URL.toString()>
	//   43   88:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   44   91:pop             
			((StringBuilder) (map)).append("] [");
	//   45   92:aload_3         
	//   46   93:ldc1            #232 <String "] [">
	//   47   95:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   48   98:pop             
			((StringBuilder) (map)).append(((IOException) (jsonobject)).getMessage());
	//   49   99:aload_3         
	//   50  100:aload_2         
	//   51  101:invokevirtual   #110 <Method String IOException.getMessage()>
	//   52  104:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   53  107:pop             
			((StringBuilder) (map)).append("].  Appboy will try to reconnect periodically.");
	//   54  108:aload_3         
	//   55  109:ldc1            #234 <String "].  Appboy will try to reconnect periodically.">
	//   56  111:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   57  114:pop             
			throw new aq(((StringBuilder) (map)).toString(), ((Throwable) (jsonobject)));
	//   58  115:new             #77  <Class aq>
	//   59  118:dup             
	//   60  119:aload_3         
	//   61  120:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   62  123:aload_2         
	//   63  124:invokespecial   #113 <Method void aq(String, Throwable)>
	//   64  127:athrow          
		}
		return httpurlconnection;
	}

	public JSONObject a(URI uri, Map map)
	{
		return a(uri, ((JSONObject) (null)), map, v.a);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:getstatic       #238 <Field v v.a>
	//    5    7:invokespecial   #240 <Method JSONObject a(URI, JSONObject, Map, v)>
	//    6   10:areturn         
	}

	public JSONObject a(URI uri, Map map, JSONObject jsonobject)
	{
		return a(uri, jsonobject, map, v.b);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:aload_2         
	//    4    4:getstatic       #226 <Field v v.b>
	//    5    7:invokespecial   #240 <Method JSONObject a(URI, JSONObject, Map, v)>
	//    6   10:areturn         
	}

	void a(HttpURLConnection httpurlconnection, Map map)
	{
		java.util.Map.Entry entry;
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); httpurlconnection.setRequestProperty((String)entry.getKey(), (String)entry.getValue()))
	//*   0    0:aload_2         
	//*   1    1:invokeinterface #249 <Method Set Map.entrySet()>
	//*   2    6:invokeinterface #255 <Method Iterator Set.iterator()>
	//*   3   11:astore_2        
	//*   4   12:aload_2         
	//*   5   13:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            56
			entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//    7   21:aload_2         
	//    8   22:invokeinterface #265 <Method Object Iterator.next()>
	//    9   27:checkcast       #267 <Class java.util.Map$Entry>
	//   10   30:astore_3        

	//   11   31:aload_1         
	//   12   32:aload_3         
	//   13   33:invokeinterface #270 <Method Object java.util.Map$Entry.getKey()>
	//   14   38:checkcast       #45  <Class String>
	//   15   41:aload_3         
	//   16   42:invokeinterface #273 <Method Object java.util.Map$Entry.getValue()>
	//   17   47:checkcast       #45  <Class String>
	//   18   50:invokevirtual   #277 <Method void HttpURLConnection.setRequestProperty(String, String)>
	//*  19   53:goto            12
	//   20   56:return          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/c);
	private final int b;

	static 
	{
	//    0    0:ldc1            #2   <Class c>
	//    1    2:invokestatic    #18  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #20  <Field String a>
	//*   3    8:return          
	}
}
