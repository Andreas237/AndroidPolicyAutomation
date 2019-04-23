// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.internal.ads.*;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.ads.internal.gmsg:
//			ag, b, a, d, 
//			c, ah

public class HttpClient
	implements ag
{

	public HttpClient(Context context, zzbbi zzbbi1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Context mContext>
		zzbob = zzbbi1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field zzbbi zzbob>
	//    8   14:return          
	}

	private final c zza(b b1)
	{
		Object obj1 = ((Object) ((HttpURLConnection)b1.b().openConnection()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #33  <Method URL b.b()>
	//    2    4:invokevirtual   #39  <Method java.net.URLConnection URL.openConnection()>
	//    3    7:checkcast       #41  <Class HttpURLConnection>
	//    4   10:astore          5
		Object obj = obj1;
	//    5   12:aload           5
	//    6   14:astore          4
		Object obj2;
		Object obj3;
		int i;
		int j;
		Object obj4;
		Iterator iterator;
		java.util.Map.Entry entry;
		Iterator iterator1;
		String s;
		try
		{
			aw.e().a(mContext, zzbob.a, false, ((HttpURLConnection) (obj1)));
	//    7   16:invokestatic    #47  <Method xg aw.e()>
	//    8   19:aload_0         
	//    9   20:getfield        #20  <Field Context mContext>
	//   10   23:aload_0         
	//   11   24:getfield        #22  <Field zzbbi zzbob>
	//   12   27:getfield        #53  <Field String zzbbi.a>
	//   13   30:iconst_0        
	//   14   31:aload           5
	//   15   33:invokevirtual   #58  <Method void xg.a(Context, String, boolean, HttpURLConnection)>
		}
	//*  16   36:aload           5
	//*  17   38:astore          4
	//*  18   40:aload_1         
	//*  19   41:invokevirtual   #62  <Method ArrayList b.c()>
	//*  20   44:checkcast       #64  <Class ArrayList>
	//*  21   47:astore          6
	//*  22   49:aload           5
	//*  23   51:astore          4
	//*  24   53:aload           6
	//*  25   55:invokevirtual   #68  <Method int ArrayList.size()>
	//*  26   58:istore_3        
	//*  27   59:iconst_0        
	//*  28   60:istore_2        
	//*  29   61:iload_2         
	//*  30   62:iload_3         
	//*  31   63:icmpge          115
	//*  32   66:aload           5
	//*  33   68:astore          4
	//*  34   70:aload           6
	//*  35   72:iload_2         
	//*  36   73:invokevirtual   #72  <Method Object ArrayList.get(int)>
	//*  37   76:astore          7
	//*  38   78:iload_2         
	//*  39   79:iconst_1        
	//*  40   80:iadd            
	//*  41   81:istore_2        
	//*  42   82:aload           5
	//*  43   84:astore          4
	//*  44   86:aload           7
	//*  45   88:checkcast       #74  <Class a>
	//*  46   91:astore          7
	//*  47   93:aload           5
	//*  48   95:astore          4
	//*  49   97:aload           5
	//*  50   99:aload           7
	//*  51  101:invokevirtual   #77  <Method String a.a()>
	//*  52  104:aload           7
	//*  53  106:invokevirtual   #79  <Method String a.b()>
	//*  54  109:invokevirtual   #83  <Method void HttpURLConnection.addRequestProperty(String, String)>
	//*  55  112:goto            61
	//*  56  115:aload           5
	//*  57  117:astore          4
	//*  58  119:aload_1         
	//*  59  120:invokevirtual   #86  <Method String b.d()>
	//*  60  123:invokestatic    #92  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  61  126:ifne            571
	//*  62  129:aload           5
	//*  63  131:astore          4
	//*  64  133:aload           5
	//*  65  135:iconst_1        
	//*  66  136:invokevirtual   #96  <Method void HttpURLConnection.setDoOutput(boolean)>
	//*  67  139:aload           5
	//*  68  141:astore          4
	//*  69  143:aload_1         
	//*  70  144:invokevirtual   #86  <Method String b.d()>
	//*  71  147:invokevirtual   #102 <Method byte[] String.getBytes()>
	//*  72  150:astore          6
	//*  73  152:aload           5
	//*  74  154:astore          4
	//*  75  156:aload           5
	//*  76  158:aload           6
	//*  77  160:arraylength     
	//*  78  161:invokevirtual   #106 <Method void HttpURLConnection.setFixedLengthStreamingMode(int)>
	//*  79  164:aload           5
	//*  80  166:astore          4
	//*  81  168:new             #108 <Class BufferedOutputStream>
	//*  82  171:dup             
	//*  83  172:aload           5
	//*  84  174:invokevirtual   #112 <Method java.io.OutputStream HttpURLConnection.getOutputStream()>
	//*  85  177:invokespecial   #115 <Method void BufferedOutputStream(java.io.OutputStream)>
	//*  86  180:astore          7
	//*  87  182:aload           5
	//*  88  184:astore          4
	//*  89  186:aload           7
	//*  90  188:aload           6
	//*  91  190:invokevirtual   #119 <Method void BufferedOutputStream.write(byte[])>
	//*  92  193:aload           5
	//*  93  195:astore          4
	//*  94  197:aload           7
	//*  95  199:invokevirtual   #122 <Method void BufferedOutputStream.close()>
	//*  96  202:goto            205
	//*  97  205:aload           5
	//*  98  207:astore          4
	//*  99  209:new             #124 <Class zz>
	//* 100  212:dup             
	//* 101  213:invokespecial   #125 <Method void zz()>
	//* 102  216:astore          7
	//* 103  218:aload           5
	//* 104  220:astore          4
	//* 105  222:aload           7
	//* 106  224:aload           5
	//* 107  226:aload           6
	//* 108  228:invokevirtual   #128 <Method void zz.a(HttpURLConnection, byte[])>
	//* 109  231:aload           5
	//* 110  233:astore          4
	//* 111  235:new             #64  <Class ArrayList>
	//* 112  238:dup             
	//* 113  239:invokespecial   #129 <Method void ArrayList()>
	//* 114  242:astore          6
	//* 115  244:aload           5
	//* 116  246:astore          4
	//* 117  248:aload           5
	//* 118  250:invokevirtual   #133 <Method Map HttpURLConnection.getHeaderFields()>
	//* 119  253:ifnull          390
	//* 120  256:aload           5
	//* 121  258:astore          4
	//* 122  260:aload           5
	//* 123  262:invokevirtual   #133 <Method Map HttpURLConnection.getHeaderFields()>
	//* 124  265:invokeinterface #139 <Method Set Map.entrySet()>
	//* 125  270:invokeinterface #145 <Method Iterator Set.iterator()>
	//* 126  275:astore          8
	//* 127  277:aload           5
	//* 128  279:astore          4
	//* 129  281:aload           8
	//* 130  283:invokeinterface #151 <Method boolean Iterator.hasNext()>
	//* 131  288:ifeq            390
	//* 132  291:aload           5
	//* 133  293:astore          4
	//* 134  295:aload           8
	//* 135  297:invokeinterface #155 <Method Object Iterator.next()>
	//* 136  302:checkcast       #157 <Class java.util.Map$Entry>
	//* 137  305:astore          9
	//* 138  307:aload           5
	//* 139  309:astore          4
	//* 140  311:aload           9
	//* 141  313:invokeinterface #160 <Method Object java.util.Map$Entry.getValue()>
	//* 142  318:checkcast       #162 <Class List>
	//* 143  321:invokeinterface #163 <Method Iterator List.iterator()>
	//* 144  326:astore          10
	//* 145  328:aload           5
	//* 146  330:astore          4
	//* 147  332:aload           10
	//* 148  334:invokeinterface #151 <Method boolean Iterator.hasNext()>
	//* 149  339:ifeq            277
	//* 150  342:aload           5
	//* 151  344:astore          4
	//* 152  346:aload           10
	//* 153  348:invokeinterface #155 <Method Object Iterator.next()>
	//* 154  353:checkcast       #98  <Class String>
	//* 155  356:astore          11
	//* 156  358:aload           5
	//* 157  360:astore          4
	//* 158  362:aload           6
	//* 159  364:new             #74  <Class a>
	//* 160  367:dup             
	//* 161  368:aload           9
	//* 162  370:invokeinterface #166 <Method Object java.util.Map$Entry.getKey()>
	//* 163  375:checkcast       #98  <Class String>
	//* 164  378:aload           11
	//* 165  380:invokespecial   #168 <Method void a(String, String)>
	//* 166  383:invokevirtual   #172 <Method boolean ArrayList.add(Object)>
	//* 167  386:pop             
	//* 168  387:goto            328
	//* 169  390:aload           5
	//* 170  392:astore          4
	//* 171  394:aload_1         
	//* 172  395:invokevirtual   #173 <Method String b.a()>
	//* 173  398:astore_1        
	//* 174  399:aload           5
	//* 175  401:astore          4
	//* 176  403:aload           5
	//* 177  405:invokevirtual   #176 <Method int HttpURLConnection.getResponseCode()>
	//* 178  408:istore_2        
	//* 179  409:aload           5
	//* 180  411:astore          4
	//* 181  413:invokestatic    #47  <Method xg aw.e()>
	//* 182  416:pop             
	//* 183  417:aload           5
	//* 184  419:astore          4
	//* 185  421:new             #178 <Class d>
	//* 186  424:dup             
	//* 187  425:aload_1         
	//* 188  426:iload_2         
	//* 189  427:aload           6
	//* 190  429:new             #180 <Class InputStreamReader>
	//* 191  432:dup             
	//* 192  433:aload           5
	//* 193  435:invokevirtual   #184 <Method java.io.InputStream HttpURLConnection.getInputStream()>
	//* 194  438:invokespecial   #187 <Method void InputStreamReader(java.io.InputStream)>
	//* 195  441:invokestatic    #190 <Method String xg.a(InputStreamReader)>
	//* 196  444:invokespecial   #193 <Method void d(String, int, List, String)>
	//* 197  447:astore_1        
	//* 198  448:aload           5
	//* 199  450:astore          4
	//* 200  452:aload           7
	//* 201  454:aload           5
	//* 202  456:aload_1         
	//* 203  457:invokevirtual   #195 <Method int d.b()>
	//* 204  460:invokevirtual   #198 <Method void zz.a(HttpURLConnection, int)>
	//* 205  463:aload           5
	//* 206  465:astore          4
	//* 207  467:aload           7
	//* 208  469:aload_1         
	//* 209  470:invokevirtual   #199 <Method String d.d()>
	//* 210  473:invokevirtual   #202 <Method void zz.a(String)>
	//* 211  476:aload           5
	//* 212  478:astore          4
	//* 213  480:new             #204 <Class c>
	//* 214  483:dup             
	//* 215  484:aload_0         
	//* 216  485:iconst_1        
	//* 217  486:aload_1         
	//* 218  487:aconst_null     
	//* 219  488:invokespecial   #207 <Method void c(HttpClient, boolean, d, String)>
	//* 220  491:astore_1        
	//* 221  492:aload           5
	//* 222  494:ifnull          502
	//* 223  497:aload           5
	//* 224  499:invokevirtual   #210 <Method void HttpURLConnection.disconnect()>
	//* 225  502:aload_1         
	//* 226  503:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 227  504:astore          4
		{
			b1 = ((b) (obj1));
	//  228  506:aload           5
	//  229  508:astore_1        
			obj2 = obj;
	//  230  509:aload           4
	//  231  511:astore          5
			break MISSING_BLOCK_LABEL_527;
	//  232  513:goto            527
		}
		obj = obj1;
		obj3 = ((Object) ((ArrayList)b1.c()));
		obj = obj1;
		j = ((ArrayList) (obj3)).size();
		i = 0;
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
		obj = obj1;
		obj4 = ((ArrayList) (obj3)).get(i);
		i++;
		obj = obj1;
		obj4 = ((Object) ((a)obj4));
		obj = obj1;
		((HttpURLConnection) (obj1)).addRequestProperty(((a) (obj4)).a(), ((a) (obj4)).b());
		if(true) goto _L2; else goto _L1
_L1:
		obj = obj1;
		if(TextUtils.isEmpty(((CharSequence) (b1.d())))) goto _L4; else goto _L3
_L3:
		obj = obj1;
		((HttpURLConnection) (obj1)).setDoOutput(true);
		obj = obj1;
		obj3 = ((Object) (b1.d().getBytes()));
		obj = obj1;
		((HttpURLConnection) (obj1)).setFixedLengthStreamingMode(obj3.length);
		obj = obj1;
		obj4 = ((Object) (new BufferedOutputStream(((HttpURLConnection) (obj1)).getOutputStream())));
		obj = obj1;
		((BufferedOutputStream) (obj4)).write(((byte []) (obj3)));
		obj = obj1;
		((BufferedOutputStream) (obj4)).close();
_L9:
		obj = obj1;
		obj4 = ((Object) (new zz()));
		obj = obj1;
		((zz) (obj4)).a(((HttpURLConnection) (obj1)), ((byte []) (obj3)));
		obj = obj1;
		obj3 = ((Object) (new ArrayList()));
		obj = obj1;
		if(((HttpURLConnection) (obj1)).getHeaderFields() == null)
			break MISSING_BLOCK_LABEL_390;
		obj = obj1;
		iterator = ((HttpURLConnection) (obj1)).getHeaderFields().entrySet().iterator();
_L6:
		obj = obj1;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_390;
		obj = obj1;
		entry = (java.util.Map.Entry)iterator.next();
		obj = obj1;
		iterator1 = ((List)entry.getValue()).iterator();
_L7:
		obj = obj1;
		if(!iterator1.hasNext()) goto _L6; else goto _L5
_L5:
		obj = obj1;
		s = (String)iterator1.next();
		obj = obj1;
		((ArrayList) (obj3)).add(((Object) (new a((String)entry.getKey(), s))));
		  goto _L7
		obj = obj1;
		b1 = ((b) (b1.a()));
		obj = obj1;
		i = ((HttpURLConnection) (obj1)).getResponseCode();
		obj = obj1;
		aw.e();
		obj = obj1;
		b1 = ((b) (new d(((String) (b1)), i, ((List) (obj3)), xg.a(new InputStreamReader(((HttpURLConnection) (obj1)).getInputStream())))));
		obj = obj1;
		((zz) (obj4)).a(((HttpURLConnection) (obj1)), ((d) (b1)).b());
		obj = obj1;
		((zz) (obj4)).a(((d) (b1)).d());
		obj = obj1;
		b1 = ((b) (new c(this, true, ((d) (b1)), ((String) (null)))));
		if(obj1 != null)
			((HttpURLConnection) (obj1)).disconnect();
		return ((c) (b1));
		b1;
	//  233  516:astore_1        
		obj = null;
	//  234  517:aconst_null     
	//  235  518:astore          4
		break MISSING_BLOCK_LABEL_559;
	//  236  520:goto            559
		obj2;
	//  237  523:astore          5
		b1 = null;
	//  238  525:aconst_null     
	//  239  526:astore_1        
		obj = ((Object) (b1));
	//  240  527:aload_1         
	//  241  528:astore          4
		obj2 = ((Object) (new c(this, false, ((d) (null)), ((Exception) (obj2)).toString())));
	//  242  530:new             #204 <Class c>
	//  243  533:dup             
	//  244  534:aload_0         
	//  245  535:iconst_0        
	//  246  536:aconst_null     
	//  247  537:aload           5
	//  248  539:invokevirtual   #213 <Method String Exception.toString()>
	//  249  542:invokespecial   #207 <Method void c(HttpClient, boolean, d, String)>
	//  250  545:astore          5
		if(b1 != null)
	//* 251  547:aload_1         
	//* 252  548:ifnull          555
			((HttpURLConnection) (b1)).disconnect();
	//  253  551:aload_1         
	//  254  552:invokevirtual   #210 <Method void HttpURLConnection.disconnect()>
		return ((c) (obj2));
	//  255  555:aload           5
	//  256  557:areturn         
		b1;
	//  257  558:astore_1        
		if(obj != null)
	//* 258  559:aload           4
	//* 259  561:ifnull          569
			((HttpURLConnection) (obj)).disconnect();
	//  260  564:aload           4
	//  261  566:invokevirtual   #210 <Method void HttpURLConnection.disconnect()>
		throw b1;
	//  262  569:aload_1         
	//  263  570:athrow          
_L4:
		obj3 = null;
	//  264  571:aconst_null     
	//  265  572:astore          6
		if(true) goto _L9; else goto _L8
	//  266  574:goto            205
_L8:
	}

	private static JSONObject zza(d d1)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #218 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #219 <Method void JSONObject()>
	//    3    7:astore_1        
		JSONArray jsonarray;
		try
		{
			jsonobject.put("http_request_id", ((Object) (d1.a())));
	//    4    8:aload_1         
	//    5    9:ldc1            #221 <String "http_request_id">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #222 <Method String d.a()>
	//    8   15:invokevirtual   #226 <Method JSONObject JSONObject.put(String, Object)>
	//    9   18:pop             
			if(d1.d() != null)
	//*  10   19:aload_0         
	//*  11   20:invokevirtual   #199 <Method String d.d()>
	//*  12   23:ifnull          37
				jsonobject.put("body", ((Object) (d1.d())));
	//   13   26:aload_1         
	//   14   27:ldc1            #228 <String "body">
	//   15   29:aload_0         
	//   16   30:invokevirtual   #199 <Method String d.d()>
	//   17   33:invokevirtual   #226 <Method JSONObject JSONObject.put(String, Object)>
	//   18   36:pop             
			jsonarray = new JSONArray();
	//   19   37:new             #230 <Class JSONArray>
	//   20   40:dup             
	//   21   41:invokespecial   #231 <Method void JSONArray()>
	//   22   44:astore_2        
			a a1;
			for(Iterator iterator = d1.c().iterator(); iterator.hasNext(); jsonarray.put(((Object) ((new JSONObject()).put("key", ((Object) (a1.a()))).put("value", ((Object) (a1.b())))))))
	//*  23   45:aload_0         
	//*  24   46:invokevirtual   #234 <Method Iterable d.c()>
	//*  25   49:invokeinterface #237 <Method Iterator Iterable.iterator()>
	//*  26   54:astore_3        
	//*  27   55:aload_3         
	//*  28   56:invokeinterface #151 <Method boolean Iterator.hasNext()>
	//*  29   61:ifeq            110
				a1 = (a)iterator.next();
	//   30   64:aload_3         
	//   31   65:invokeinterface #155 <Method Object Iterator.next()>
	//   32   70:checkcast       #74  <Class a>
	//   33   73:astore          4

	//   34   75:aload_2         
	//   35   76:new             #218 <Class JSONObject>
	//   36   79:dup             
	//   37   80:invokespecial   #219 <Method void JSONObject()>
	//   38   83:ldc1            #239 <String "key">
	//   39   85:aload           4
	//   40   87:invokevirtual   #77  <Method String a.a()>
	//   41   90:invokevirtual   #226 <Method JSONObject JSONObject.put(String, Object)>
	//   42   93:ldc1            #241 <String "value">
	//   43   95:aload           4
	//   44   97:invokevirtual   #79  <Method String a.b()>
	//   45  100:invokevirtual   #226 <Method JSONObject JSONObject.put(String, Object)>
	//   46  103:invokevirtual   #244 <Method JSONArray JSONArray.put(Object)>
	//   47  106:pop             
		}
	//*  48  107:goto            55
	//*  49  110:aload_1         
	//*  50  111:ldc1            #246 <String "headers">
	//*  51  113:aload_2         
	//*  52  114:invokevirtual   #226 <Method JSONObject JSONObject.put(String, Object)>
	//*  53  117:pop             
	//*  54  118:aload_1         
	//*  55  119:ldc1            #248 <String "response_code">
	//*  56  121:aload_0         
	//*  57  122:invokevirtual   #195 <Method int d.b()>
	//*  58  125:invokevirtual   #251 <Method JSONObject JSONObject.put(String, int)>
	//*  59  128:pop             
	//*  60  129:aload_1         
	//*  61  130:areturn         
		// Misplaced declaration of an exception variable
		catch(d d1)
	//*  62  131:astore_0        
		{
			wx.b("Error constructing JSON for http response.", ((Throwable) (d1)));
	//   63  132:ldc1            #253 <String "Error constructing JSON for http response.">
	//   64  134:aload_0         
	//   65  135:invokestatic    #258 <Method void wx.b(String, Throwable)>
			return jsonobject;
	//   66  138:aload_1         
	//   67  139:areturn         
		}
		jsonobject.put("headers", ((Object) (jsonarray)));
		jsonobject.put("response_code", d1.b());
		return jsonobject;
	}

	private static b zzc(JSONObject jsonobject)
	{
		URL url;
		Object obj;
		String s;
		String s1;
		s = jsonobject.optString("http_request_id");
	//    0    0:aload_0         
	//    1    1:ldc1            #221 <String "http_request_id">
	//    2    3:invokevirtual   #266 <Method String JSONObject.optString(String)>
	//    3    6:astore          4
		obj = ((Object) (jsonobject.optString("url")));
	//    4    8:aload_0         
	//    5    9:ldc2            #268 <String "url">
	//    6   12:invokevirtual   #266 <Method String JSONObject.optString(String)>
	//    7   15:astore_3        
		url = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		s1 = jsonobject.optString("post_body", ((String) (null)));
	//   10   18:aload_0         
	//   11   19:ldc2            #270 <String "post_body">
	//   12   22:aconst_null     
	//   13   23:invokevirtual   #273 <Method String JSONObject.optString(String, String)>
	//   14   26:astore          5
		obj = ((Object) (new URL(((String) (obj)))));
	//   15   28:new             #35  <Class URL>
	//   16   31:dup             
	//   17   32:aload_3         
	//   18   33:invokespecial   #275 <Method void URL(String)>
	//   19   36:astore_3        
		url = ((URL) (obj));
	//   20   37:aload_3         
	//   21   38:astore_2        
		break MISSING_BLOCK_LABEL_50;
	//   22   39:goto            50
		MalformedURLException malformedurlexception;
		malformedurlexception;
	//   23   42:astore_3        
		wx.b("Error constructing http request.", ((Throwable) (malformedurlexception)));
	//   24   43:ldc2            #277 <String "Error constructing http request.">
	//   25   46:aload_3         
	//   26   47:invokestatic    #258 <Method void wx.b(String, Throwable)>
		ArrayList arraylist = new ArrayList();
	//   27   50:new             #64  <Class ArrayList>
	//   28   53:dup             
	//   29   54:invokespecial   #129 <Method void ArrayList()>
	//   30   57:astore          6
		JSONArray jsonarray = jsonobject.optJSONArray("headers");
	//   31   59:aload_0         
	//   32   60:ldc1            #246 <String "headers">
	//   33   62:invokevirtual   #281 <Method JSONArray JSONObject.optJSONArray(String)>
	//   34   65:astore_3        
		jsonobject = ((JSONObject) (jsonarray));
	//   35   66:aload_3         
	//   36   67:astore_0        
		if(jsonarray == null)
	//*  37   68:aload_3         
	//*  38   69:ifnonnull       80
			jsonobject = ((JSONObject) (new JSONArray()));
	//   39   72:new             #230 <Class JSONArray>
	//   40   75:dup             
	//   41   76:invokespecial   #231 <Method void JSONArray()>
	//   42   79:astore_0        
		for(int i = 0; i < ((JSONArray) (jsonobject)).length(); i++)
	//*  43   80:iconst_0        
	//*  44   81:istore_1        
	//*  45   82:iload_1         
	//*  46   83:aload_0         
	//*  47   84:invokevirtual   #284 <Method int JSONArray.length()>
	//*  48   87:icmpge          132
		{
			JSONObject jsonobject1 = ((JSONArray) (jsonobject)).optJSONObject(i);
	//   49   90:aload_0         
	//   50   91:iload_1         
	//   51   92:invokevirtual   #288 <Method JSONObject JSONArray.optJSONObject(int)>
	//   52   95:astore_3        
			if(jsonobject1 != null)
	//*  53   96:aload_3         
	//*  54   97:ifnull          125
				arraylist.add(((Object) (new a(jsonobject1.optString("key"), jsonobject1.optString("value")))));
	//   55  100:aload           6
	//   56  102:new             #74  <Class a>
	//   57  105:dup             
	//   58  106:aload_3         
	//   59  107:ldc1            #239 <String "key">
	//   60  109:invokevirtual   #266 <Method String JSONObject.optString(String)>
	//   61  112:aload_3         
	//   62  113:ldc1            #241 <String "value">
	//   63  115:invokevirtual   #266 <Method String JSONObject.optString(String)>
	//   64  118:invokespecial   #168 <Method void a(String, String)>
	//   65  121:invokevirtual   #172 <Method boolean ArrayList.add(Object)>
	//   66  124:pop             
		}

	//   67  125:iload_1         
	//   68  126:iconst_1        
	//   69  127:iadd            
	//   70  128:istore_1        
	//*  71  129:goto            82
		return new b(s, url, arraylist, s1);
	//   72  132:new             #29  <Class b>
	//   73  135:dup             
	//   74  136:aload           4
	//   75  138:aload_2         
	//   76  139:aload           6
	//   77  141:aload           5
	//   78  143:invokespecial   #291 <Method void b(String, URL, ArrayList, String)>
	//   79  146:areturn         
	}

	public JSONObject send(JSONObject jsonobject)
	{
		JSONObject jsonobject1 = new JSONObject();
	//    0    0:new             #218 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #219 <Method void JSONObject()>
	//    3    7:astore          4
		String s = "";
	//    4    9:ldc2            #295 <String "">
	//    5   12:astore_2        
		String s1;
		try
		{
			s1 = jsonobject.optString("http_request_id");
	//    6   13:aload_1         
	//    7   14:ldc1            #221 <String "http_request_id">
	//    8   16:invokevirtual   #266 <Method String JSONObject.optString(String)>
	//    9   19:astore_3        
		}
	//*  10   20:aload_3         
	//*  11   21:astore_2        
	//*  12   22:aload_0         
	//*  13   23:aload_1         
	//*  14   24:invokestatic    #297 <Method b zzc(JSONObject)>
	//*  15   27:invokespecial   #299 <Method c zza(b)>
	//*  16   30:astore_1        
	//*  17   31:aload_3         
	//*  18   32:astore_2        
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #301 <Method boolean c.c()>
	//*  21   37:ifeq            73
	//*  22   40:aload_3         
	//*  23   41:astore_2        
	//*  24   42:aload           4
	//*  25   44:ldc2            #303 <String "response">
	//*  26   47:aload_1         
	//*  27   48:invokevirtual   #306 <Method d c.b()>
	//*  28   51:invokestatic    #308 <Method JSONObject zza(d)>
	//*  29   54:invokevirtual   #226 <Method JSONObject JSONObject.put(String, Object)>
	//*  30   57:pop             
	//*  31   58:aload_3         
	//*  32   59:astore_2        
	//*  33   60:aload           4
	//*  34   62:ldc2            #310 <String "success">
	//*  35   65:iconst_1        
	//*  36   66:invokevirtual   #313 <Method JSONObject JSONObject.put(String, boolean)>
	//*  37   69:pop             
	//*  38   70:aload           4
	//*  39   72:areturn         
	//*  40   73:aload_3         
	//*  41   74:astore_2        
	//*  42   75:aload           4
	//*  43   77:ldc2            #303 <String "response">
	//*  44   80:new             #218 <Class JSONObject>
	//*  45   83:dup             
	//*  46   84:invokespecial   #219 <Method void JSONObject()>
	//*  47   87:ldc1            #221 <String "http_request_id">
	//*  48   89:aload_3         
	//*  49   90:invokevirtual   #226 <Method JSONObject JSONObject.put(String, Object)>
	//*  50   93:invokevirtual   #226 <Method JSONObject JSONObject.put(String, Object)>
	//*  51   96:pop             
	//*  52   97:aload_3         
	//*  53   98:astore_2        
	//*  54   99:aload           4
	//*  55  101:ldc2            #310 <String "success">
	//*  56  104:iconst_0        
	//*  57  105:invokevirtual   #313 <Method JSONObject JSONObject.put(String, boolean)>
	//*  58  108:pop             
	//*  59  109:aload_3         
	//*  60  110:astore_2        
	//*  61  111:aload           4
	//*  62  113:ldc2            #315 <String "reason">
	//*  63  116:aload_1         
	//*  64  117:invokevirtual   #316 <Method String c.a()>
	//*  65  120:invokevirtual   #226 <Method JSONObject JSONObject.put(String, Object)>
	//*  66  123:pop             
	//*  67  124:aload           4
	//*  68  126:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  69  127:astore_1        
		{
			wx.b("Error executing http request.", ((Throwable) (jsonobject)));
	//   70  128:ldc2            #318 <String "Error executing http request.">
	//   71  131:aload_1         
	//   72  132:invokestatic    #258 <Method void wx.b(String, Throwable)>
			try
			{
				jsonobject1.put("response", ((Object) ((new JSONObject()).put("http_request_id", ((Object) (s))))));
	//   73  135:aload           4
	//   74  137:ldc2            #303 <String "response">
	//   75  140:new             #218 <Class JSONObject>
	//   76  143:dup             
	//   77  144:invokespecial   #219 <Method void JSONObject()>
	//   78  147:ldc1            #221 <String "http_request_id">
	//   79  149:aload_2         
	//   80  150:invokevirtual   #226 <Method JSONObject JSONObject.put(String, Object)>
	//   81  153:invokevirtual   #226 <Method JSONObject JSONObject.put(String, Object)>
	//   82  156:pop             
				jsonobject1.put("success", false);
	//   83  157:aload           4
	//   84  159:ldc2            #310 <String "success">
	//   85  162:iconst_0        
	//   86  163:invokevirtual   #313 <Method JSONObject JSONObject.put(String, boolean)>
	//   87  166:pop             
				jsonobject1.put("reason", ((Object) (((Exception) (jsonobject)).toString())));
	//   88  167:aload           4
	//   89  169:ldc2            #315 <String "reason">
	//   90  172:aload_1         
	//   91  173:invokevirtual   #213 <Method String Exception.toString()>
	//   92  176:invokevirtual   #226 <Method JSONObject JSONObject.put(String, Object)>
	//   93  179:pop             
			}
	//*  94  180:aload           4
	//*  95  182:areturn         
			// Misplaced declaration of an exception variable
			catch(JSONObject jsonobject)
	//*  96  183:astore_1        
			{
				wx.b("Error executing http request.", ((Throwable) (jsonobject)));
	//   97  184:ldc2            #318 <String "Error executing http request.">
	//   98  187:aload_1         
	//   99  188:invokestatic    #258 <Method void wx.b(String, Throwable)>
				return jsonobject1;
	//  100  191:aload           4
	//  101  193:areturn         
			}
			return jsonobject1;
		}
		s = s1;
		jsonobject = ((JSONObject) (zza(zzc(jsonobject))));
		s = s1;
		if(!((c) (jsonobject)).c())
			break MISSING_BLOCK_LABEL_73;
		s = s1;
		jsonobject1.put("response", ((Object) (zza(((c) (jsonobject)).b()))));
		s = s1;
		jsonobject1.put("success", true);
		return jsonobject1;
		s = s1;
		jsonobject1.put("response", ((Object) ((new JSONObject()).put("http_request_id", ((Object) (s1))))));
		s = s1;
		jsonobject1.put("success", false);
		s = s1;
		jsonobject1.put("reason", ((Object) (((c) (jsonobject)).a())));
		return jsonobject1;
	}

	public final void zza(Object obj, Map map)
	{
		xe.a(((Runnable) (new ah(this, map, (gw)obj))));
	//    0    0:new             #322 <Class ah>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:checkcast       #324 <Class gw>
	//    6   10:invokespecial   #327 <Method void ah(HttpClient, Map, gw)>
	//    7   13:invokestatic    #332 <Method com.google.android.gms.internal.ads.abe xe.a(Runnable)>
	//    8   16:pop             
	//    9   17:return          
	}

	private final Context mContext;
	private final zzbbi zzbob;
}
