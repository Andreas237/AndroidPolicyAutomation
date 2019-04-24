// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.metrics;

import com.comscore.analytics.Core;
import com.comscore.applications.KeepAlive;
import com.comscore.measurement.Measurement;
import com.comscore.utils.*;
import java.io.UnsupportedEncodingException;
import java.net.*;

// Referenced classes of package com.comscore.metrics:
//			a

public class Request
{

	public Request(Core core, Measurement measurement)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		d = core;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field Core d>
		e = core.getStorage();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #39  <Method Storage Core.getStorage()>
	//    8   14:putfield        #41  <Field Storage e>
		c = measurement;
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:putfield        #43  <Field Measurement c>
		a = process();
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #47  <Method URL process()>
	//   15   27:putfield        #49  <Field URL a>
	//   16   30:return          
	}

	private static Proxy a(String s)
	{
		int i = s.indexOf(':');
	//    0    0:aload_0         
	//    1    1:bipush          58
	//    2    3:invokevirtual   #56  <Method int String.indexOf(int)>
	//    3    6:istore_1        
		if(i != -1)
	//*   4    7:iload_1         
	//*   5    8:iconst_m1       
	//*   6    9:icmpeq          35
		{
			String s1 = s.substring(0, i);
	//    7   12:aload_0         
	//    8   13:iconst_0        
	//    9   14:iload_1         
	//   10   15:invokevirtual   #60  <Method String String.substring(int, int)>
	//   11   18:astore_2        
			i = Integer.parseInt(s.substring(i + 1));
	//   12   19:aload_0         
	//   13   20:iload_1         
	//   14   21:iconst_1        
	//   15   22:iadd            
	//   16   23:invokevirtual   #63  <Method String String.substring(int)>
	//   17   26:invokestatic    #69  <Method int Integer.parseInt(String)>
	//   18   29:istore_1        
			s = s1;
	//   19   30:aload_2         
	//   20   31:astore_0        
		} else
	//*  21   32:goto            38
		{
			i = 80;
	//   22   35:bipush          80
	//   23   37:istore_1        
		}
		return new Proxy(java.net.Proxy.Type.HTTP, ((java.net.SocketAddress) (new InetSocketAddress(s, i))));
	//   24   38:new             #71  <Class Proxy>
	//   25   41:dup             
	//   26   42:getstatic       #77  <Field java.net.Proxy$Type java.net.Proxy$Type.HTTP>
	//   27   45:new             #79  <Class InetSocketAddress>
	//   28   48:dup             
	//   29   49:aload_0         
	//   30   50:iload_1         
	//   31   51:invokespecial   #82  <Method void InetSocketAddress(String, int)>
	//   32   54:invokespecial   #85  <Method void Proxy(java.net.Proxy$Type, java.net.SocketAddress)>
	//   33   57:areturn         
	}

	private boolean c()
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method void d()>
		boolean flag = a();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #90  <Method boolean a()>
	//    4    8:istore_1        
		if(!flag)
	//*   5    9:iload_1         
	//*   6   10:ifne            17
			e();
	//    7   13:aload_0         
	//    8   14:invokespecial   #92  <Method void e()>
		return flag;
	//    9   17:iload_1         
	//   10   18:ireturn         
	}

	private void d()
	{
		TransmissionMode transmissionmode = d.getOfflineTransmissionMode();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Core d>
	//    2    4:invokevirtual   #96  <Method TransmissionMode Core.getOfflineTransmissionMode()>
	//    3    7:astore_1        
		if(transmissionmode == TransmissionMode.DEFAULT || transmissionmode == TransmissionMode.WIFIONLY && Connectivity.isConnectedWiFi(d.getAppContext()) || transmissionmode == TransmissionMode.PIGGYBACK)
	//*   4    8:aload_1         
	//*   5    9:getstatic       #102 <Field TransmissionMode TransmissionMode.DEFAULT>
	//*   6   12:if_acmpeq       42
	//*   7   15:aload_1         
	//*   8   16:getstatic       #105 <Field TransmissionMode TransmissionMode.WIFIONLY>
	//*   9   19:if_acmpne       35
	//*  10   22:aload_0         
	//*  11   23:getfield        #33  <Field Core d>
	//*  12   26:invokevirtual   #109 <Method android.content.Context Core.getAppContext()>
	//*  13   29:invokestatic    #115 <Method boolean Connectivity.isConnectedWiFi(android.content.Context)>
	//*  14   32:ifne            42
	//*  15   35:aload_1         
	//*  16   36:getstatic       #118 <Field TransmissionMode TransmissionMode.PIGGYBACK>
	//*  17   39:if_acmpne       53
			d.getOfflineCache().flush();
	//   18   42:aload_0         
	//   19   43:getfield        #33  <Field Core d>
	//   20   46:invokevirtual   #122 <Method OfflineMeasurementsCache Core.getOfflineCache()>
	//   21   49:invokevirtual   #127 <Method boolean OfflineMeasurementsCache.flush()>
	//   22   52:pop             
	//   23   53:return          
	}

	private void e()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #129 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #130 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Measurement was not transmitted: ");
	//    4    8:aload_1         
	//    5    9:ldc1            #132 <String "Measurement was not transmitted: ">
	//    6   11:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(c.retrieveLabelsAsString(d.getMeasurementLabelOrder()));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #43  <Field Measurement c>
	//   11   20:aload_0         
	//   12   21:getfield        #33  <Field Core d>
	//   13   24:invokevirtual   #140 <Method String[] Core.getMeasurementLabelOrder()>
	//   14   27:invokevirtual   #146 <Method String Measurement.retrieveLabelsAsString(String[])>
	//   15   30:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
		CSLog.e(((Object) (this)), stringbuilder.toString());
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:invokevirtual   #150 <Method String StringBuilder.toString()>
	//   20   39:invokestatic    #155 <Method void CSLog.e(Object, String)>
		d.getOfflineCache().saveEvent(c);
	//   21   42:aload_0         
	//   22   43:getfield        #33  <Field Core d>
	//   23   46:invokevirtual   #122 <Method OfflineMeasurementsCache Core.getOfflineCache()>
	//   24   49:aload_0         
	//   25   50:getfield        #43  <Field Measurement c>
	//   26   53:invokevirtual   #159 <Method void OfflineMeasurementsCache.saveEvent(Measurement)>
	//   27   56:return          
	}

	protected HttpURLConnection a(URL url)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #162 <Field Proxy b>
	//*   2    4:ifnull          24
			url = ((URL) (url.openConnection(b)));
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #162 <Field Proxy b>
	//    6   12:invokevirtual   #168 <Method java.net.URLConnection URL.openConnection(Proxy)>
	//    7   15:astore_1        
		else
	//*   8   16:aload_1         
	//*   9   17:checkcast       #170 <Class HttpURLConnection>
	//*  10   20:astore_1        
	//*  11   21:goto            32
			url = ((URL) (url.openConnection()));
	//   12   24:aload_1         
	//   13   25:invokevirtual   #173 <Method java.net.URLConnection URL.openConnection()>
	//   14   28:astore_1        
		url = ((URL) ((HttpURLConnection)url));
	//*  15   29:goto            16
		((HttpURLConnection) (url)).setRequestProperty("Connection", "Close");
	//   16   32:aload_1         
	//   17   33:ldc1            #175 <String "Connection">
	//   18   35:ldc1            #177 <String "Close">
	//   19   37:invokevirtual   #181 <Method void HttpURLConnection.setRequestProperty(String, String)>
		return ((HttpURLConnection) (url));
	//   20   40:aload_1         
	//   21   41:areturn         
	}

	protected URL a(URL url, int i, String s)
	{
		switch(i)
	//*   0    0:iload_2         
		{
	//*   1    1:tableswitch     300 305: default 40
	//	               300 42
	//	               301 42
	//	               302 42
	//	               303 42
	//	               304 40
	//	               305 42
		case 304: 
		default:
			return null;
	//    2   40:aconst_null     
	//    3   41:areturn         

		case 300: 
		case 301: 
		case 302: 
		case 303: 
		case 305: 
			break;
		}
		if(s == null)
	//*   4   42:aload_3         
	//*   5   43:ifnonnull       48
			return null;
	//    6   46:aconst_null     
	//    7   47:areturn         
		if(i == 305)
	//*   8   48:iload_2         
	//*   9   49:sipush          305
	//*  10   52:icmpne          139
		{
			i = 0;
	//   11   55:iconst_0        
	//   12   56:istore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   13   57:new             #129 <Class StringBuilder>
	//   14   60:dup             
	//   15   61:invokespecial   #130 <Method void StringBuilder()>
	//   16   64:astore          5
			stringbuilder.append(url.getProtocol());
	//   17   66:aload           5
	//   18   68:aload_1         
	//   19   69:invokevirtual   #185 <Method String URL.getProtocol()>
	//   20   72:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   21   75:pop             
			stringbuilder.append(':');
	//   22   76:aload           5
	//   23   78:bipush          58
	//   24   80:invokevirtual   #188 <Method StringBuilder StringBuilder.append(char)>
	//   25   83:pop             
			if(s.startsWith(stringbuilder.toString()))
	//*  26   84:aload_3         
	//*  27   85:aload           5
	//*  28   87:invokevirtual   #150 <Method String StringBuilder.toString()>
	//*  29   90:invokevirtual   #192 <Method boolean String.startsWith(String)>
	//*  30   93:ifeq            106
				i = url.getProtocol().length() + 1;
	//   31   96:aload_1         
	//   32   97:invokevirtual   #185 <Method String URL.getProtocol()>
	//   33  100:invokevirtual   #196 <Method int String.length()>
	//   34  103:iconst_1        
	//   35  104:iadd            
	//   36  105:istore_2        
			int j = i;
	//   37  106:iload_2         
	//   38  107:istore          4
			if(s.startsWith("//", i))
	//*  39  109:aload_3         
	//*  40  110:ldc1            #198 <String "//">
	//*  41  112:iload_2         
	//*  42  113:invokevirtual   #201 <Method boolean String.startsWith(String, int)>
	//*  43  116:ifeq            124
				j = i + 2;
	//   44  119:iload_2         
	//   45  120:iconst_2        
	//   46  121:iadd            
	//   47  122:istore          4
			b = a(s.substring(j));
	//   48  124:aload_0         
	//   49  125:aload_3         
	//   50  126:iload           4
	//   51  128:invokevirtual   #63  <Method String String.substring(int)>
	//   52  131:invokestatic    #203 <Method Proxy a(String)>
	//   53  134:putfield        #162 <Field Proxy b>
			return url;
	//   54  137:aload_1         
	//   55  138:areturn         
		}
		s = ((String) (new URL(url, s)));
	//   56  139:new             #164 <Class URL>
	//   57  142:dup             
	//   58  143:aload_1         
	//   59  144:aload_3         
	//   60  145:invokespecial   #206 <Method void URL(URL, String)>
	//   61  148:astore_3        
		if(!url.getProtocol().equals(((Object) (((URL) (s)).getProtocol()))))
	//*  62  149:aload_1         
	//*  63  150:invokevirtual   #185 <Method String URL.getProtocol()>
	//*  64  153:aload_3         
	//*  65  154:invokevirtual   #185 <Method String URL.getProtocol()>
	//*  66  157:invokevirtual   #210 <Method boolean String.equals(Object)>
	//*  67  160:ifne            165
			return null;
	//   68  163:aconst_null     
	//   69  164:areturn         
		else
			return ((URL) (s));
	//   70  165:aload_3         
	//   71  166:areturn         
	}

	protected boolean a()
	{
		boolean flag;
		boolean flag1;
		Object obj;
		Object obj1;
		Object obj2;
		String s;
		flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		flag1 = false;
	//    2    2:iconst_0        
	//    3    3:istore          4
		s = null;
	//    4    5:aconst_null     
	//    5    6:astore          9
		obj = null;
	//    6    8:aconst_null     
	//    7    9:astore          5
		obj2 = obj;
	//    8   11:aload           5
	//    9   13:astore          7
		obj1 = ((Object) (s));
	//   10   15:aload           9
	//   11   17:astore          6
		Object obj3 = ((Object) (a));
	//   12   19:aload_0         
	//   13   20:getfield        #49  <Field URL a>
	//   14   23:astore          8
		obj2 = obj;
	//   15   25:aload           5
	//   16   27:astore          7
		obj1 = ((Object) (s));
	//   17   29:aload           9
	//   18   31:astore          6
		if(!b()) goto _L2; else goto _L1
	//   19   33:aload_0         
	//   20   34:invokevirtual   #214 <Method boolean b()>
	//   21   37:ifeq            86
_L1:
		obj2 = obj;
	//   22   40:aload           5
	//   23   42:astore          7
		obj1 = ((Object) (s));
	//   24   44:aload           9
	//   25   46:astore          6
		obj = ((Object) (a(((URL) (obj3)))));
	//   26   48:aload_0         
	//   27   49:aload           8
	//   28   51:invokevirtual   #216 <Method HttpURLConnection a(URL)>
	//   29   54:astore          5
		int i;
		try
		{
			i = ((HttpURLConnection) (obj)).getResponseCode();
	//   30   56:aload           5
	//   31   58:invokevirtual   #219 <Method int HttpURLConnection.getResponseCode()>
	//   32   61:istore_1        
		}
	//*  33   62:goto            200
	//*  34   65:astore          6
	//*  35   67:aload           5
	//*  36   69:astore          7
	//*  37   71:aload           6
	//*  38   73:astore          5
	//*  39   75:goto            486
		// Misplaced declaration of an exception variable
		catch(Object obj1)
	//*  40   78:astore          6
		{
			flag = flag1;
	//   41   80:iload           4
	//   42   82:istore_3        
			break MISSING_BLOCK_LABEL_407;
	//   43   83:goto            407
		}
		  goto _L3
		obj1;
		obj2 = obj;
		obj = obj1;
		break MISSING_BLOCK_LABEL_486;
_L2:
		int j;
		i = 0;
	//   44   86:iconst_0        
	//   45   87:istore_1        
		obj = null;
	//   46   88:aconst_null     
	//   47   89:astore          5
		j = i;
	//   48   91:iload_1         
	//   49   92:istore_2        
		obj2 = obj3;
	//   50   93:aload           8
	//   51   95:astore          7
_L4:
		if(obj2 == null || j >= 5)
			break; /* Loop/switch isn't completed */
	//   52   97:aload           7
	//   53   99:ifnull          200
	//   54  102:iload_2         
	//   55  103:iconst_5        
	//   56  104:icmpge          200
		try
		{
			obj1 = ((Object) (a(((URL) (obj2)))));
	//   57  107:aload_0         
	//   58  108:aload           7
	//   59  110:invokevirtual   #216 <Method HttpURLConnection a(URL)>
	//   60  113:astore          6
		}
	//*  61  115:aload           6
	//*  62  117:iconst_0        
	//*  63  118:invokevirtual   #223 <Method void HttpURLConnection.setInstanceFollowRedirects(boolean)>
	//*  64  121:aload           6
	//*  65  123:invokevirtual   #219 <Method int HttpURLConnection.getResponseCode()>
	//*  66  126:istore_1        
	//*  67  127:aload_0         
	//*  68  128:aload           7
	//*  69  130:iload_1         
	//*  70  131:aload           6
	//*  71  133:ldc1            #225 <String "Location">
	//*  72  135:invokevirtual   #229 <Method String HttpURLConnection.getHeaderField(String)>
	//*  73  138:invokevirtual   #231 <Method URL a(URL, int, String)>
	//*  74  141:astore          7
	//*  75  143:iload_2         
	//*  76  144:iconst_1        
	//*  77  145:iadd            
	//*  78  146:istore_2        
	//*  79  147:aload           6
	//*  80  149:astore          5
	//*  81  151:goto            97
	//*  82  154:astore          5
	//*  83  156:aload           6
	//*  84  158:astore          7
	//*  85  160:goto            486
	//*  86  163:astore          7
	//*  87  165:aload           6
	//*  88  167:astore          5
	//*  89  169:aload           7
	//*  90  171:astore          6
	//*  91  173:iload           4
	//*  92  175:istore_3        
	//*  93  176:goto            407
	//*  94  179:astore          6
	//*  95  181:aload           5
	//*  96  183:astore          7
	//*  97  185:aload           6
	//*  98  187:astore          5
	//*  99  189:goto            486
		// Misplaced declaration of an exception variable
		catch(Object obj1)
	//* 100  192:astore          6
		{
			flag = flag1;
	//  101  194:iload           4
	//  102  196:istore_3        
			break MISSING_BLOCK_LABEL_407;
	//  103  197:goto            407
		}
		try
		{
			((HttpURLConnection) (obj1)).setInstanceFollowRedirects(false);
			i = ((HttpURLConnection) (obj1)).getResponseCode();
			obj2 = ((Object) (a(((URL) (obj2)), i, ((HttpURLConnection) (obj1)).getHeaderField("Location"))));
		}
		// Misplaced declaration of an exception variable
		catch(Object obj2)
		{
			obj = obj1;
			obj1 = obj2;
			flag = flag1;
			break MISSING_BLOCK_LABEL_407;
		}
		j++;
		obj = obj1;
		if(true) goto _L4; else goto _L3
		obj;
		obj2 = obj1;
		break MISSING_BLOCK_LABEL_486;
		obj1;
		obj2 = obj;
		obj = obj1;
		break MISSING_BLOCK_LABEL_486;
_L3:
		obj2 = obj;
	//  104  200:aload           5
	//  105  202:astore          7
		obj1 = obj;
	//  106  204:aload           5
	//  107  206:astore          6
		obj3 = ((Object) (((HttpURLConnection) (obj)).getHeaderField("Content-Type")));
	//  108  208:aload           5
	//  109  210:ldc1            #233 <String "Content-Type">
	//  110  212:invokevirtual   #229 <Method String HttpURLConnection.getHeaderField(String)>
	//  111  215:astore          8
		obj2 = obj;
	//  112  217:aload           5
	//  113  219:astore          7
		obj1 = obj;
	//  114  221:aload           5
	//  115  223:astore          6
		s = ((HttpURLConnection) (obj)).getHeaderField("Content-Length");
	//  116  225:aload           5
	//  117  227:ldc1            #235 <String "Content-Length">
	//  118  229:invokevirtual   #229 <Method String HttpURLConnection.getHeaderField(String)>
	//  119  232:astore          9
		if(i != 200)
			break MISSING_BLOCK_LABEL_307;
	//  120  234:iload_1         
	//  121  235:sipush          200
	//  122  238:icmpne          307
		obj2 = obj;
	//  123  241:aload           5
	//  124  243:astore          7
		obj1 = obj;
	//  125  245:aload           5
	//  126  247:astore          6
		if(!Utils.isNotEmpty(((String) (obj3))))
			break MISSING_BLOCK_LABEL_307;
	//  127  249:aload           8
	//  128  251:invokestatic    #240 <Method boolean Utils.isNotEmpty(String)>
	//  129  254:ifeq            307
		obj2 = obj;
	//  130  257:aload           5
	//  131  259:astore          7
		obj1 = obj;
	//  132  261:aload           5
	//  133  263:astore          6
		if(((String) (obj3)).indexOf("image/") != 0)
			break MISSING_BLOCK_LABEL_307;
	//  134  265:aload           8
	//  135  267:ldc1            #242 <String "image/">
	//  136  269:invokevirtual   #244 <Method int String.indexOf(String)>
	//  137  272:ifne            307
		obj2 = obj;
	//  138  275:aload           5
	//  139  277:astore          7
		obj1 = obj;
	//  140  279:aload           5
	//  141  281:astore          6
		if(!Utils.isNotEmpty(s))
			break MISSING_BLOCK_LABEL_307;
	//  142  283:aload           9
	//  143  285:invokestatic    #240 <Method boolean Utils.isNotEmpty(String)>
	//  144  288:ifeq            307
		obj2 = obj;
	//  145  291:aload           5
	//  146  293:astore          7
		obj1 = obj;
	//  147  295:aload           5
	//  148  297:astore          6
		if(Integer.parseInt(s) > 0)
			break MISSING_BLOCK_LABEL_348;
	//  149  299:aload           9
	//  150  301:invokestatic    #69  <Method int Integer.parseInt(String)>
	//  151  304:ifgt            348
		if(i != 204)
			break MISSING_BLOCK_LABEL_372;
	//  152  307:iload_1         
	//  153  308:sipush          204
	//  154  311:icmpne          372
		obj2 = obj;
	//  155  314:aload           5
	//  156  316:astore          7
		obj1 = obj;
	//  157  318:aload           5
	//  158  320:astore          6
		if(!Utils.isNotEmpty(s))
			break MISSING_BLOCK_LABEL_372;
	//  159  322:aload           9
	//  160  324:invokestatic    #240 <Method boolean Utils.isNotEmpty(String)>
	//  161  327:ifeq            372
		obj2 = obj;
	//  162  330:aload           5
	//  163  332:astore          7
		obj1 = obj;
	//  164  334:aload           5
	//  165  336:astore          6
		i = Integer.parseInt(s);
	//  166  338:aload           9
	//  167  340:invokestatic    #69  <Method int Integer.parseInt(String)>
	//  168  343:istore_1        
		if(i != 0)
			break MISSING_BLOCK_LABEL_372;
	//  169  344:iload_1         
	//  170  345:ifne            372
		obj2 = obj;
	//  171  348:aload           5
	//  172  350:astore          7
		try
		{
			d.getKeepAlive().reset();
	//  173  352:aload_0         
	//  174  353:getfield        #33  <Field Core d>
	//  175  356:invokevirtual   #248 <Method KeepAlive Core.getKeepAlive()>
	//  176  359:invokevirtual   #253 <Method void KeepAlive.reset()>
		}
	//* 177  362:goto            374
		// Misplaced declaration of an exception variable
		catch(Object obj1)
	//* 178  365:astore          6
		{
			flag = true;
	//  179  367:iconst_1        
	//  180  368:istore_3        
			break MISSING_BLOCK_LABEL_407;
	//  181  369:goto            407
		}
		break MISSING_BLOCK_LABEL_374;
		flag = false;
	//  182  372:iconst_0        
	//  183  373:istore_3        
		flag1 = flag;
	//  184  374:iload_3         
	//  185  375:istore          4
		if(obj != null)
	//* 186  377:aload           5
	//* 187  379:ifnull          483
		{
			((HttpURLConnection) (obj)).disconnect();
	//  188  382:aload           5
	//  189  384:invokevirtual   #256 <Method void HttpURLConnection.disconnect()>
			return flag;
	//  190  387:iload_3         
	//  191  388:ireturn         
		}
		break MISSING_BLOCK_LABEL_483;
		obj;
	//  192  389:astore          5
		break MISSING_BLOCK_LABEL_486;
	//  193  391:goto            486
		obj2;
	//  194  394:astore          7
		obj = obj1;
	//  195  396:aload           6
	//  196  398:astore          5
		flag = flag1;
	//  197  400:iload           4
	//  198  402:istore_3        
		obj1 = obj2;
	//  199  403:aload           7
	//  200  405:astore          6
		obj2 = obj;
	//  201  407:aload           5
	//  202  409:astore          7
		obj3 = ((Object) (new StringBuilder()));
	//  203  411:new             #129 <Class StringBuilder>
	//  204  414:dup             
	//  205  415:invokespecial   #130 <Method void StringBuilder()>
	//  206  418:astore          8
		obj2 = obj;
	//  207  420:aload           5
	//  208  422:astore          7
		((StringBuilder) (obj3)).append("Exception sending measurement:");
	//  209  424:aload           8
	//  210  426:ldc2            #258 <String "Exception sending measurement:">
	//  211  429:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  212  432:pop             
		obj2 = obj;
	//  213  433:aload           5
	//  214  435:astore          7
		((StringBuilder) (obj3)).append(((Exception) (obj1)).getLocalizedMessage());
	//  215  437:aload           8
	//  216  439:aload           6
	//  217  441:invokevirtual   #261 <Method String Exception.getLocalizedMessage()>
	//  218  444:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  219  447:pop             
		obj2 = obj;
	//  220  448:aload           5
	//  221  450:astore          7
		CSLog.e(((Object) (this)), ((StringBuilder) (obj3)).toString());
	//  222  452:aload_0         
	//  223  453:aload           8
	//  224  455:invokevirtual   #150 <Method String StringBuilder.toString()>
	//  225  458:invokestatic    #155 <Method void CSLog.e(Object, String)>
		obj2 = obj;
	//  226  461:aload           5
	//  227  463:astore          7
		CSLog.printStackTrace(((Exception) (obj1)));
	//  228  465:aload           6
	//  229  467:invokestatic    #265 <Method void CSLog.printStackTrace(Exception)>
		if(obj != null)
	//* 230  470:aload           5
	//* 231  472:ifnull          480
			((HttpURLConnection) (obj)).disconnect();
	//  232  475:aload           5
	//  233  477:invokevirtual   #256 <Method void HttpURLConnection.disconnect()>
		flag1 = flag;
	//  234  480:iload_3         
	//  235  481:istore          4
		return flag1;
	//  236  483:iload           4
	//  237  485:ireturn         
		if(obj2 != null)
	//* 238  486:aload           7
	//* 239  488:ifnull          496
			((HttpURLConnection) (obj2)).disconnect();
	//  240  491:aload           7
	//  241  493:invokevirtual   #256 <Method void HttpURLConnection.disconnect()>
		throw obj;
	//  242  496:aload           5
	//  243  498:athrow          
	}

	public Boolean availableConnection()
	{
		boolean flag;
		Object obj;
		try
		{
			obj = ((Object) (d.getAppContext()));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Core d>
	//    2    4:invokevirtual   #109 <Method android.content.Context Core.getAppContext()>
	//    3    7:astore_2        
		}
	//*   4    8:iconst_1        
	//*   5    9:istore_1        
	//*   6   10:invokestatic    #272 <Method boolean Connectivity.isEmulator()>
	//*   7   13:ifeq            23
	//*   8   16:ldc2            #274 <String "emu">
	//*   9   19:astore_2        
	//*  10   20:goto            79
	//*  11   23:aload_2         
	//*  12   24:invokestatic    #115 <Method boolean Connectivity.isConnectedWiFi(android.content.Context)>
	//*  13   27:ifeq            37
	//*  14   30:ldc2            #276 <String "wifi">
	//*  15   33:astore_2        
	//*  16   34:goto            79
	//*  17   37:aload_2         
	//*  18   38:invokestatic    #279 <Method boolean Connectivity.isConnectedMobile(android.content.Context)>
	//*  19   41:ifeq            51
	//*  20   44:ldc2            #281 <String "wwan">
	//*  21   47:astore_2        
	//*  22   48:goto            79
	//*  23   51:aload_2         
	//*  24   52:invokestatic    #284 <Method boolean Connectivity.isConnectBluetooth(android.content.Context)>
	//*  25   55:ifeq            65
	//*  26   58:ldc2            #286 <String "bth">
	//*  27   61:astore_2        
	//*  28   62:goto            79
	//*  29   65:aload_2         
	//*  30   66:invokestatic    #289 <Method boolean Connectivity.isConnectEthernet(android.content.Context)>
	//*  31   69:ifeq            104
	//*  32   72:ldc2            #291 <String "eth">
	//*  33   75:astore_2        
	//*  34   76:goto            79
	//*  35   79:aload_0         
	//*  36   80:getfield        #43  <Field Measurement c>
	//*  37   83:ldc2            #293 <String "ns_radio">
	//*  38   86:aload_2         
	//*  39   87:invokevirtual   #296 <Method void Measurement.setLabel(String, String)>
	//*  40   90:iload_1         
	//*  41   91:invokestatic    #302 <Method Boolean Boolean.valueOf(boolean)>
	//*  42   94:areturn         
	//*  43   95:iconst_0        
	//*  44   96:invokestatic    #302 <Method Boolean Boolean.valueOf(boolean)>
	//*  45   99:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			return Boolean.valueOf(false);
		}
		flag = true;
		if(Connectivity.isEmulator())
		{
			obj = "emu";
			break MISSING_BLOCK_LABEL_79;
		}
		if(Connectivity.isConnectedWiFi(((android.content.Context) (obj))))
		{
			obj = "wifi";
			break MISSING_BLOCK_LABEL_79;
		}
		if(Connectivity.isConnectedMobile(((android.content.Context) (obj))))
		{
			obj = "wwan";
			break MISSING_BLOCK_LABEL_79;
		}
		if(Connectivity.isConnectBluetooth(((android.content.Context) (obj))))
		{
			obj = "bth";
			break MISSING_BLOCK_LABEL_79;
		}
		if(Connectivity.isConnectEthernet(((android.content.Context) (obj))))
		{
			obj = "eth";
		} else
	//*  46  100:astore_2        
	//*  47  101:goto            95
		{
			obj = "unknown";
	//   48  104:ldc2            #304 <String "unknown">
	//   49  107:astore_2        
			flag = false;
	//   50  108:iconst_0        
	//   51  109:istore_1        
		}
		c.setLabel("ns_radio", ((String) (obj)));
		return Boolean.valueOf(flag);
	//*  52  110:goto            79
	}

	protected boolean b()
	{
		return REDIRECTION_SUPPORTED;
	//    0    0:getstatic       #26  <Field boolean REDIRECTION_SUPPORTED>
	//    1    3:ireturn         
	}

	public URL process()
	{
		return process(c.getPixelURL());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #43  <Field Measurement c>
	//    3    5:invokevirtual   #307 <Method String Measurement.getPixelURL()>
	//    4    8:invokevirtual   #310 <Method URL process(String)>
	//    5   11:areturn         
	}

	public URL process(String s)
	{
		availableConnection();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #316 <Method Boolean availableConnection()>
	//    2    4:pop             
		String s1 = s.concat(c.retrieveLabelsAsString(d.getMeasurementLabelOrder()));
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #43  <Field Measurement c>
	//    6   10:aload_0         
	//    7   11:getfield        #33  <Field Core d>
	//    8   14:invokevirtual   #140 <Method String[] Core.getMeasurementLabelOrder()>
	//    9   17:invokevirtual   #146 <Method String Measurement.retrieveLabelsAsString(String[])>
	//   10   20:invokevirtual   #319 <Method String String.concat(String)>
	//   11   23:astore_3        
		s = s1;
	//   12   24:aload_3         
	//   13   25:astore_1        
		if(s1.length() > 4096)
	//*  14   26:aload_3         
	//*  15   27:invokevirtual   #196 <Method int String.length()>
	//*  16   30:sipush          4096
	//*  17   33:icmple          136
		{
			s = s1;
	//   18   36:aload_3         
	//   19   37:astore_1        
			if(s1.indexOf("&") > 0)
	//*  20   38:aload_3         
	//*  21   39:ldc2            #321 <String "&">
	//*  22   42:invokevirtual   #244 <Method int String.indexOf(String)>
	//*  23   45:ifle            136
			{
				int i = s1.substring(0, 4088).lastIndexOf("&");
	//   24   48:aload_3         
	//   25   49:iconst_0        
	//   26   50:sipush          4088
	//   27   53:invokevirtual   #60  <Method String String.substring(int, int)>
	//   28   56:ldc2            #321 <String "&">
	//   29   59:invokevirtual   #324 <Method int String.lastIndexOf(String)>
	//   30   62:istore_2        
				try
				{
					s = URLEncoder.encode(s1.substring(i + 1), "UTF-8").replace("+", "%20");
	//   31   63:aload_3         
	//   32   64:iload_2         
	//   33   65:iconst_1        
	//   34   66:iadd            
	//   35   67:invokevirtual   #63  <Method String String.substring(int)>
	//   36   70:ldc2            #326 <String "UTF-8">
	//   37   73:invokestatic    #332 <Method String URLEncoder.encode(String, String)>
	//   38   76:ldc2            #334 <String "+">
	//   39   79:ldc2            #336 <String "%20">
	//   40   82:invokevirtual   #340 <Method String String.replace(CharSequence, CharSequence)>
	//   41   85:astore_1        
				}
	//*  42   86:goto            93
	//*  43   89:ldc2            #342 <String "0">
	//*  44   92:astore_1        
	//*  45   93:new             #129 <Class StringBuilder>
	//*  46   96:dup             
	//*  47   97:invokespecial   #130 <Method void StringBuilder()>
	//*  48  100:astore          4
	//*  49  102:aload           4
	//*  50  104:aload_3         
	//*  51  105:iconst_0        
	//*  52  106:iload_2         
	//*  53  107:invokevirtual   #60  <Method String String.substring(int, int)>
	//*  54  110:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//*  55  113:pop             
	//*  56  114:aload           4
	//*  57  116:ldc2            #344 <String "&ns_cut=">
	//*  58  119:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//*  59  122:pop             
	//*  60  123:aload           4
	//*  61  125:aload_1         
	//*  62  126:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//*  63  129:pop             
	//*  64  130:aload           4
	//*  65  132:invokevirtual   #150 <Method String StringBuilder.toString()>
	//*  66  135:astore_1        
	//*  67  136:aload_1         
	//*  68  137:astore_3        
	//*  69  138:aload_1         
	//*  70  139:invokevirtual   #196 <Method int String.length()>
	//*  71  142:sipush          4096
	//*  72  145:icmple          157
	//*  73  148:aload_1         
	//*  74  149:iconst_0        
	//*  75  150:sipush          4096
	//*  76  153:invokevirtual   #60  <Method String String.substring(int, int)>
	//*  77  156:astore_3        
	//*  78  157:new             #164 <Class URL>
	//*  79  160:dup             
	//*  80  161:aload_3         
	//*  81  162:invokespecial   #347 <Method void URL(String)>
	//*  82  165:astore_1        
	//*  83  166:aload_1         
	//*  84  167:areturn         
	//*  85  168:aconst_null     
	//*  86  169:areturn         
				// Misplaced declaration of an exception variable
				catch(String s)
				{
					s = "0";
				}
				StringBuilder stringbuilder = new StringBuilder();
				stringbuilder.append(s1.substring(0, i));
				stringbuilder.append("&ns_cut=");
				stringbuilder.append(s);
				s = stringbuilder.toString();
			}
		}
		s1 = s;
		if(s.length() > 4096)
			s1 = s.substring(0, 4096);
		try
		{
			s = ((String) (new URL(s1)));
		}
	//*  87  170:astore_1        
	//*  88  171:goto            89
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		return ((URL) (s));
	//*  89  174:astore_1        
	//*  90  175:goto            168
	}

	public boolean send()
	{
		boolean flag;
		android.content.Context context;
		TransmissionMode transmissionmode;
		context = d.getAppContext();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Core d>
	//    2    4:invokevirtual   #109 <Method android.content.Context Core.getAppContext()>
	//    3    7:astore_2        
		flag = Permissions.check(context, "android.permission.ACCESS_NETWORK_STATE").booleanValue();
	//    4    8:aload_2         
	//    5    9:ldc2            #350 <String "android.permission.ACCESS_NETWORK_STATE">
	//    6   12:invokestatic    #356 <Method Boolean Permissions.check(android.content.Context, String)>
	//    7   15:invokevirtual   #359 <Method boolean Boolean.booleanValue()>
	//    8   18:istore_1        
		transmissionmode = d.getLiveTransmissionMode();
	//    9   19:aload_0         
	//   10   20:getfield        #33  <Field Core d>
	//   11   23:invokevirtual   #362 <Method TransmissionMode Core.getLiveTransmissionMode()>
	//   12   26:astore_3        
		e.set("lastMeasurementProcessedTimestamp", String.valueOf(Date.unixTime()));
	//   13   27:aload_0         
	//   14   28:getfield        #41  <Field Storage e>
	//   15   31:ldc2            #364 <String "lastMeasurementProcessedTimestamp">
	//   16   34:invokestatic    #370 <Method long Date.unixTime()>
	//   17   37:invokestatic    #373 <Method String String.valueOf(long)>
	//   18   40:invokevirtual   #378 <Method void Storage.set(String, String)>
		a.a[transmissionmode.ordinal()];
	//   19   43:getstatic       #383 <Field int[] a.a>
	//   20   46:aload_3         
	//   21   47:invokevirtual   #386 <Method int TransmissionMode.ordinal()>
	//   22   50:iaload          
		JVM INSTR tableswitch 1 5: default 84
	//	               1 160
	//	               2 160
	//	               3 141
	//	               4 114
	//	               5 87;
	//   23   51:tableswitch     1 5: default 84
	//	               1 160
	//	               2 160
	//	               3 141
	//	               4 114
	//	               5 87
		   goto _L1 _L2 _L2 _L3 _L4 _L5
	//*  24   84:goto            164
_L5:
		if(flag && !Connectivity.isEmulator() && !Connectivity.isConnectedWiFi(context) && !Connectivity.isDataConnected(context)) goto _L2; else goto _L6
	//   25   87:iload_1         
	//   26   88:ifeq            155
	//   27   91:invokestatic    #272 <Method boolean Connectivity.isEmulator()>
	//   28   94:ifne            155
	//   29   97:aload_2         
	//   30   98:invokestatic    #115 <Method boolean Connectivity.isConnectedWiFi(android.content.Context)>
	//   31  101:ifne            155
	//   32  104:aload_2         
	//   33  105:invokestatic    #389 <Method boolean Connectivity.isDataConnected(android.content.Context)>
	//   34  108:ifeq            160
	//*  35  111:goto            155
_L4:
		if(flag && !Connectivity.isEmulator() && !Connectivity.isConnectedWiFi(context) && !Connectivity.isConnectEthernet(context)) goto _L2; else goto _L6
	//   36  114:iload_1         
	//   37  115:ifeq            155
	//   38  118:invokestatic    #272 <Method boolean Connectivity.isEmulator()>
	//   39  121:ifne            155
	//   40  124:aload_2         
	//   41  125:invokestatic    #115 <Method boolean Connectivity.isConnectedWiFi(android.content.Context)>
	//   42  128:ifne            155
	//   43  131:aload_2         
	//   44  132:invokestatic    #289 <Method boolean Connectivity.isConnectEthernet(android.content.Context)>
	//   45  135:ifeq            160
	//*  46  138:goto            155
_L3:
		if(flag && !availableConnection().booleanValue()) goto _L2; else goto _L6
	//   47  141:iload_1         
	//   48  142:ifeq            155
	//   49  145:aload_0         
	//   50  146:invokevirtual   #316 <Method Boolean availableConnection()>
	//   51  149:invokevirtual   #359 <Method boolean Boolean.booleanValue()>
	//   52  152:ifeq            160
_L6:
		return c();
	//   53  155:aload_0         
	//   54  156:invokespecial   #391 <Method boolean c()>
	//   55  159:ireturn         
_L2:
		e();
	//   56  160:aload_0         
	//   57  161:invokespecial   #92  <Method void e()>
_L1:
		return false;
	//   58  164:iconst_0        
	//   59  165:ireturn         
	}

	public static final boolean REDIRECTION_SUPPORTED;
	protected URL a;
	protected Proxy b;
	private Measurement c;
	private Core d;
	private Storage e;

	static 
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_0        
		boolean flag;
		if(i >= 11 && i <= 13)
	//*   2    4:iload_0         
	//*   3    5:bipush          11
	//*   4    7:icmplt          24
	//*   5   10:iload_0         
	//*   6   11:bipush          13
	//*   7   13:icmple          19
	//*   8   16:goto            24
			flag = false;
	//    9   19:iconst_0        
	//   10   20:istore_1        
		else
	//*  11   21:goto            26
			flag = true;
	//   12   24:iconst_1        
	//   13   25:istore_1        
		REDIRECTION_SUPPORTED = flag;
	//   14   26:iload_1         
	//   15   27:putstatic       #26  <Field boolean REDIRECTION_SUPPORTED>
	//*  16   30:return          
	}
}
