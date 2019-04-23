// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.perf.network;

import com.google.android.gms.internal.firebase-perf.v;
import com.google.android.gms.internal.firebase-perf.zzbg;
import com.google.firebase.perf.internal.h;
import java.io.IOException;
import java.net.URI;
import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.google.firebase.perf.network:
//			h, f

public class FirebasePerfHttpClient
{

	private FirebasePerfHttpClient()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	private static Object a(HttpClient httpclient, HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler, zzbg zzbg1, h h1)
	{
		v v1 = v.a(h1);
	//    0    0:aload           5
	//    1    2:invokestatic    #18  <Method v v.a(h)>
	//    2    5:astore          6
		try
		{
			h1 = ((h) (String.valueOf(((Object) (httphost.toURI())))));
	//    3    7:aload_1         
	//    4    8:invokevirtual   #24  <Method String HttpHost.toURI()>
	//    5   11:invokestatic    #30  <Method String String.valueOf(Object)>
	//    6   14:astore          5
			String s = String.valueOf(((Object) (httprequest.getRequestLine().getUri())));
	//    7   16:aload_2         
	//    8   17:invokeinterface #36  <Method RequestLine HttpRequest.getRequestLine()>
	//    9   22:invokeinterface #41  <Method String RequestLine.getUri()>
	//   10   27:invokestatic    #30  <Method String String.valueOf(Object)>
	//   11   30:astore          7
			if(s.length() != 0)
	//*  12   32:aload           7
	//*  13   34:invokevirtual   #45  <Method int String.length()>
	//*  14   37:ifeq            52
			{
				h1 = ((h) (((String) (h1)).concat(s)));
	//   15   40:aload           5
	//   16   42:aload           7
	//   17   44:invokevirtual   #49  <Method String String.concat(String)>
	//   18   47:astore          5
				break MISSING_BLOCK_LABEL_63;
	//   19   49:goto            63
			}
		}
	//*  20   52:new             #26  <Class String>
	//*  21   55:dup             
	//*  22   56:aload           5
	//*  23   58:invokespecial   #52  <Method void String(String)>
	//*  24   61:astore          5
	//*  25   63:aload           6
	//*  26   65:aload           5
	//*  27   67:invokevirtual   #55  <Method v v.a(String)>
	//*  28   70:aload_2         
	//*  29   71:invokeinterface #36  <Method RequestLine HttpRequest.getRequestLine()>
	//*  30   76:invokeinterface #58  <Method String RequestLine.getMethod()>
	//*  31   81:invokevirtual   #61  <Method v v.b(String)>
	//*  32   84:pop             
	//*  33   85:aload_2         
	//*  34   86:invokestatic    #66  <Method Long h.a(org.apache.http.HttpMessage)>
	//*  35   89:astore          5
	//*  36   91:aload           5
	//*  37   93:ifnull          107
	//*  38   96:aload           6
	//*  39   98:aload           5
	//*  40  100:invokevirtual   #72  <Method long Long.longValue()>
	//*  41  103:invokevirtual   #75  <Method v v.a(long)>
	//*  42  106:pop             
	//*  43  107:aload           4
	//*  44  109:invokevirtual   #79  <Method void zzbg.a()>
	//*  45  112:aload           6
	//*  46  114:aload           4
	//*  47  116:invokevirtual   #81  <Method long zzbg.b()>
	//*  48  119:invokevirtual   #83  <Method v v.b(long)>
	//*  49  122:pop             
	//*  50  123:aload_0         
	//*  51  124:aload_1         
	//*  52  125:aload_2         
	//*  53  126:new             #85  <Class f>
	//*  54  129:dup             
	//*  55  130:aload_3         
	//*  56  131:aload           4
	//*  57  133:aload           6
	//*  58  135:invokespecial   #88  <Method void f(ResponseHandler, zzbg, v)>
	//*  59  138:invokeinterface #94  <Method Object HttpClient.execute(HttpHost, HttpRequest, ResponseHandler)>
	//*  60  143:astore_0        
	//*  61  144:aload_0         
	//*  62  145:areturn         
		// Misplaced declaration of an exception variable
		catch(HttpClient httpclient)
	//*  63  146:astore_0        
		{
			v1.e(zzbg1.c());
	//   64  147:aload           6
	//   65  149:aload           4
	//   66  151:invokevirtual   #97  <Method long zzbg.c()>
	//   67  154:invokevirtual   #100 <Method v v.e(long)>
	//   68  157:pop             
			h.a(v1);
	//   69  158:aload           6
	//   70  160:invokestatic    #103 <Method void h.a(v)>
			throw httpclient;
	//   71  163:aload_0         
	//   72  164:athrow          
		}
		h1 = ((h) (new String(((String) (h1)))));
		v1.a(((String) (h1))).b(httprequest.getRequestLine().getMethod());
		h1 = ((h) (h.a(((org.apache.http.HttpMessage) (httprequest)))));
		if(h1 == null)
			break MISSING_BLOCK_LABEL_107;
		v1.a(((Long) (h1)).longValue());
		zzbg1.a();
		v1.b(zzbg1.b());
		httpclient = ((HttpClient) (httpclient.execute(httphost, httprequest, ((ResponseHandler) (new f(responsehandler, zzbg1, v1))))));
		return ((Object) (httpclient));
	}

	private static Object a(HttpClient httpclient, HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler, HttpContext httpcontext, zzbg zzbg1, h h1)
	{
		v v1 = v.a(h1);
	//    0    0:aload           6
	//    1    2:invokestatic    #18  <Method v v.a(h)>
	//    2    5:astore          7
		try
		{
			h1 = ((h) (String.valueOf(((Object) (httphost.toURI())))));
	//    3    7:aload_1         
	//    4    8:invokevirtual   #24  <Method String HttpHost.toURI()>
	//    5   11:invokestatic    #30  <Method String String.valueOf(Object)>
	//    6   14:astore          6
			String s = String.valueOf(((Object) (httprequest.getRequestLine().getUri())));
	//    7   16:aload_2         
	//    8   17:invokeinterface #36  <Method RequestLine HttpRequest.getRequestLine()>
	//    9   22:invokeinterface #41  <Method String RequestLine.getUri()>
	//   10   27:invokestatic    #30  <Method String String.valueOf(Object)>
	//   11   30:astore          8
			if(s.length() != 0)
	//*  12   32:aload           8
	//*  13   34:invokevirtual   #45  <Method int String.length()>
	//*  14   37:ifeq            52
			{
				h1 = ((h) (((String) (h1)).concat(s)));
	//   15   40:aload           6
	//   16   42:aload           8
	//   17   44:invokevirtual   #49  <Method String String.concat(String)>
	//   18   47:astore          6
				break MISSING_BLOCK_LABEL_63;
	//   19   49:goto            63
			}
		}
	//*  20   52:new             #26  <Class String>
	//*  21   55:dup             
	//*  22   56:aload           6
	//*  23   58:invokespecial   #52  <Method void String(String)>
	//*  24   61:astore          6
	//*  25   63:aload           7
	//*  26   65:aload           6
	//*  27   67:invokevirtual   #55  <Method v v.a(String)>
	//*  28   70:aload_2         
	//*  29   71:invokeinterface #36  <Method RequestLine HttpRequest.getRequestLine()>
	//*  30   76:invokeinterface #58  <Method String RequestLine.getMethod()>
	//*  31   81:invokevirtual   #61  <Method v v.b(String)>
	//*  32   84:pop             
	//*  33   85:aload_2         
	//*  34   86:invokestatic    #66  <Method Long h.a(org.apache.http.HttpMessage)>
	//*  35   89:astore          6
	//*  36   91:aload           6
	//*  37   93:ifnull          107
	//*  38   96:aload           7
	//*  39   98:aload           6
	//*  40  100:invokevirtual   #72  <Method long Long.longValue()>
	//*  41  103:invokevirtual   #75  <Method v v.a(long)>
	//*  42  106:pop             
	//*  43  107:aload           5
	//*  44  109:invokevirtual   #79  <Method void zzbg.a()>
	//*  45  112:aload           7
	//*  46  114:aload           5
	//*  47  116:invokevirtual   #81  <Method long zzbg.b()>
	//*  48  119:invokevirtual   #83  <Method v v.b(long)>
	//*  49  122:pop             
	//*  50  123:aload_0         
	//*  51  124:aload_1         
	//*  52  125:aload_2         
	//*  53  126:new             #85  <Class f>
	//*  54  129:dup             
	//*  55  130:aload_3         
	//*  56  131:aload           5
	//*  57  133:aload           7
	//*  58  135:invokespecial   #88  <Method void f(ResponseHandler, zzbg, v)>
	//*  59  138:aload           4
	//*  60  140:invokeinterface #107 <Method Object HttpClient.execute(HttpHost, HttpRequest, ResponseHandler, HttpContext)>
	//*  61  145:astore_0        
	//*  62  146:aload_0         
	//*  63  147:areturn         
		// Misplaced declaration of an exception variable
		catch(HttpClient httpclient)
	//*  64  148:astore_0        
		{
			v1.e(zzbg1.c());
	//   65  149:aload           7
	//   66  151:aload           5
	//   67  153:invokevirtual   #97  <Method long zzbg.c()>
	//   68  156:invokevirtual   #100 <Method v v.e(long)>
	//   69  159:pop             
			h.a(v1);
	//   70  160:aload           7
	//   71  162:invokestatic    #103 <Method void h.a(v)>
			throw httpclient;
	//   72  165:aload_0         
	//   73  166:athrow          
		}
		h1 = ((h) (new String(((String) (h1)))));
		v1.a(((String) (h1))).b(httprequest.getRequestLine().getMethod());
		h1 = ((h) (h.a(((org.apache.http.HttpMessage) (httprequest)))));
		if(h1 == null)
			break MISSING_BLOCK_LABEL_107;
		v1.a(((Long) (h1)).longValue());
		zzbg1.a();
		v1.b(zzbg1.b());
		httpclient = ((HttpClient) (httpclient.execute(httphost, httprequest, ((ResponseHandler) (new f(responsehandler, zzbg1, v1))), httpcontext)));
		return ((Object) (httpclient));
	}

	private static Object a(HttpClient httpclient, HttpUriRequest httpurirequest, ResponseHandler responsehandler, zzbg zzbg1, h h1)
	{
		h1 = ((h) (v.a(h1)));
	//    0    0:aload           4
	//    1    2:invokestatic    #18  <Method v v.a(h)>
	//    2    5:astore          4
		Long long1;
		try
		{
			((v) (h1)).a(httpurirequest.getURI().toString()).b(httpurirequest.getMethod());
	//    3    7:aload           4
	//    4    9:aload_1         
	//    5   10:invokeinterface #114 <Method URI HttpUriRequest.getURI()>
	//    6   15:invokevirtual   #119 <Method String URI.toString()>
	//    7   18:invokevirtual   #55  <Method v v.a(String)>
	//    8   21:aload_1         
	//    9   22:invokeinterface #120 <Method String HttpUriRequest.getMethod()>
	//   10   27:invokevirtual   #61  <Method v v.b(String)>
	//   11   30:pop             
			long1 = h.a(((org.apache.http.HttpMessage) (httpurirequest)));
	//   12   31:aload_1         
	//   13   32:invokestatic    #66  <Method Long h.a(org.apache.http.HttpMessage)>
	//   14   35:astore          5
		}
	//*  15   37:aload           5
	//*  16   39:ifnull          53
	//*  17   42:aload           4
	//*  18   44:aload           5
	//*  19   46:invokevirtual   #72  <Method long Long.longValue()>
	//*  20   49:invokevirtual   #75  <Method v v.a(long)>
	//*  21   52:pop             
	//*  22   53:aload_3         
	//*  23   54:invokevirtual   #79  <Method void zzbg.a()>
	//*  24   57:aload           4
	//*  25   59:aload_3         
	//*  26   60:invokevirtual   #81  <Method long zzbg.b()>
	//*  27   63:invokevirtual   #83  <Method v v.b(long)>
	//*  28   66:pop             
	//*  29   67:aload_0         
	//*  30   68:aload_1         
	//*  31   69:new             #85  <Class f>
	//*  32   72:dup             
	//*  33   73:aload_2         
	//*  34   74:aload_3         
	//*  35   75:aload           4
	//*  36   77:invokespecial   #88  <Method void f(ResponseHandler, zzbg, v)>
	//*  37   80:invokeinterface #123 <Method Object HttpClient.execute(HttpUriRequest, ResponseHandler)>
	//*  38   85:astore_0        
	//*  39   86:aload_0         
	//*  40   87:areturn         
		// Misplaced declaration of an exception variable
		catch(HttpClient httpclient)
	//*  41   88:astore_0        
		{
			((v) (h1)).e(zzbg1.c());
	//   42   89:aload           4
	//   43   91:aload_3         
	//   44   92:invokevirtual   #97  <Method long zzbg.c()>
	//   45   95:invokevirtual   #100 <Method v v.e(long)>
	//   46   98:pop             
			h.a(((v) (h1)));
	//   47   99:aload           4
	//   48  101:invokestatic    #103 <Method void h.a(v)>
			throw httpclient;
	//   49  104:aload_0         
	//   50  105:athrow          
		}
		if(long1 == null)
			break MISSING_BLOCK_LABEL_53;
		((v) (h1)).a(long1.longValue());
		zzbg1.a();
		((v) (h1)).b(zzbg1.b());
		httpclient = ((HttpClient) (httpclient.execute(httpurirequest, ((ResponseHandler) (new f(responsehandler, zzbg1, ((v) (h1))))))));
		return ((Object) (httpclient));
	}

	private static Object a(HttpClient httpclient, HttpUriRequest httpurirequest, ResponseHandler responsehandler, HttpContext httpcontext, zzbg zzbg1, h h1)
	{
		h1 = ((h) (v.a(h1)));
	//    0    0:aload           5
	//    1    2:invokestatic    #18  <Method v v.a(h)>
	//    2    5:astore          5
		Long long1;
		try
		{
			((v) (h1)).a(httpurirequest.getURI().toString()).b(httpurirequest.getMethod());
	//    3    7:aload           5
	//    4    9:aload_1         
	//    5   10:invokeinterface #114 <Method URI HttpUriRequest.getURI()>
	//    6   15:invokevirtual   #119 <Method String URI.toString()>
	//    7   18:invokevirtual   #55  <Method v v.a(String)>
	//    8   21:aload_1         
	//    9   22:invokeinterface #120 <Method String HttpUriRequest.getMethod()>
	//   10   27:invokevirtual   #61  <Method v v.b(String)>
	//   11   30:pop             
			long1 = h.a(((org.apache.http.HttpMessage) (httpurirequest)));
	//   12   31:aload_1         
	//   13   32:invokestatic    #66  <Method Long h.a(org.apache.http.HttpMessage)>
	//   14   35:astore          6
		}
	//*  15   37:aload           6
	//*  16   39:ifnull          53
	//*  17   42:aload           5
	//*  18   44:aload           6
	//*  19   46:invokevirtual   #72  <Method long Long.longValue()>
	//*  20   49:invokevirtual   #75  <Method v v.a(long)>
	//*  21   52:pop             
	//*  22   53:aload           4
	//*  23   55:invokevirtual   #79  <Method void zzbg.a()>
	//*  24   58:aload           5
	//*  25   60:aload           4
	//*  26   62:invokevirtual   #81  <Method long zzbg.b()>
	//*  27   65:invokevirtual   #83  <Method v v.b(long)>
	//*  28   68:pop             
	//*  29   69:aload_0         
	//*  30   70:aload_1         
	//*  31   71:new             #85  <Class f>
	//*  32   74:dup             
	//*  33   75:aload_2         
	//*  34   76:aload           4
	//*  35   78:aload           5
	//*  36   80:invokespecial   #88  <Method void f(ResponseHandler, zzbg, v)>
	//*  37   83:aload_3         
	//*  38   84:invokeinterface #127 <Method Object HttpClient.execute(HttpUriRequest, ResponseHandler, HttpContext)>
	//*  39   89:astore_0        
	//*  40   90:aload_0         
	//*  41   91:areturn         
		// Misplaced declaration of an exception variable
		catch(HttpClient httpclient)
	//*  42   92:astore_0        
		{
			((v) (h1)).e(zzbg1.c());
	//   43   93:aload           5
	//   44   95:aload           4
	//   45   97:invokevirtual   #97  <Method long zzbg.c()>
	//   46  100:invokevirtual   #100 <Method v v.e(long)>
	//   47  103:pop             
			h.a(((v) (h1)));
	//   48  104:aload           5
	//   49  106:invokestatic    #103 <Method void h.a(v)>
			throw httpclient;
	//   50  109:aload_0         
	//   51  110:athrow          
		}
		if(long1 == null)
			break MISSING_BLOCK_LABEL_53;
		((v) (h1)).a(long1.longValue());
		zzbg1.a();
		((v) (h1)).b(zzbg1.b());
		httpclient = ((HttpClient) (httpclient.execute(httpurirequest, ((ResponseHandler) (new f(responsehandler, zzbg1, ((v) (h1))))), httpcontext)));
		return ((Object) (httpclient));
	}

	private static HttpResponse a(HttpClient httpclient, HttpHost httphost, HttpRequest httprequest, zzbg zzbg1, h h1)
	{
		v v1 = v.a(h1);
	//    0    0:aload           4
	//    1    2:invokestatic    #18  <Method v v.a(h)>
	//    2    5:astore          5
		try
		{
			h1 = ((h) (String.valueOf(((Object) (httphost.toURI())))));
	//    3    7:aload_1         
	//    4    8:invokevirtual   #24  <Method String HttpHost.toURI()>
	//    5   11:invokestatic    #30  <Method String String.valueOf(Object)>
	//    6   14:astore          4
			String s = String.valueOf(((Object) (httprequest.getRequestLine().getUri())));
	//    7   16:aload_2         
	//    8   17:invokeinterface #36  <Method RequestLine HttpRequest.getRequestLine()>
	//    9   22:invokeinterface #41  <Method String RequestLine.getUri()>
	//   10   27:invokestatic    #30  <Method String String.valueOf(Object)>
	//   11   30:astore          6
			if(s.length() != 0)
	//*  12   32:aload           6
	//*  13   34:invokevirtual   #45  <Method int String.length()>
	//*  14   37:ifeq            52
			{
				h1 = ((h) (((String) (h1)).concat(s)));
	//   15   40:aload           4
	//   16   42:aload           6
	//   17   44:invokevirtual   #49  <Method String String.concat(String)>
	//   18   47:astore          4
				break MISSING_BLOCK_LABEL_63;
	//   19   49:goto            63
			}
		}
	//*  20   52:new             #26  <Class String>
	//*  21   55:dup             
	//*  22   56:aload           4
	//*  23   58:invokespecial   #52  <Method void String(String)>
	//*  24   61:astore          4
	//*  25   63:aload           5
	//*  26   65:aload           4
	//*  27   67:invokevirtual   #55  <Method v v.a(String)>
	//*  28   70:aload_2         
	//*  29   71:invokeinterface #36  <Method RequestLine HttpRequest.getRequestLine()>
	//*  30   76:invokeinterface #58  <Method String RequestLine.getMethod()>
	//*  31   81:invokevirtual   #61  <Method v v.b(String)>
	//*  32   84:pop             
	//*  33   85:aload_2         
	//*  34   86:invokestatic    #66  <Method Long h.a(org.apache.http.HttpMessage)>
	//*  35   89:astore          4
	//*  36   91:aload           4
	//*  37   93:ifnull          107
	//*  38   96:aload           5
	//*  39   98:aload           4
	//*  40  100:invokevirtual   #72  <Method long Long.longValue()>
	//*  41  103:invokevirtual   #75  <Method v v.a(long)>
	//*  42  106:pop             
	//*  43  107:aload_3         
	//*  44  108:invokevirtual   #79  <Method void zzbg.a()>
	//*  45  111:aload           5
	//*  46  113:aload_3         
	//*  47  114:invokevirtual   #81  <Method long zzbg.b()>
	//*  48  117:invokevirtual   #83  <Method v v.b(long)>
	//*  49  120:pop             
	//*  50  121:aload_0         
	//*  51  122:aload_1         
	//*  52  123:aload_2         
	//*  53  124:invokeinterface #131 <Method HttpResponse HttpClient.execute(HttpHost, HttpRequest)>
	//*  54  129:astore_0        
	//*  55  130:aload           5
	//*  56  132:aload_3         
	//*  57  133:invokevirtual   #97  <Method long zzbg.c()>
	//*  58  136:invokevirtual   #100 <Method v v.e(long)>
	//*  59  139:pop             
	//*  60  140:aload           5
	//*  61  142:aload_0         
	//*  62  143:invokeinterface #137 <Method StatusLine HttpResponse.getStatusLine()>
	//*  63  148:invokeinterface #142 <Method int StatusLine.getStatusCode()>
	//*  64  153:invokevirtual   #145 <Method v v.a(int)>
	//*  65  156:pop             
	//*  66  157:aload_0         
	//*  67  158:invokestatic    #66  <Method Long h.a(org.apache.http.HttpMessage)>
	//*  68  161:astore_1        
	//*  69  162:aload_1         
	//*  70  163:ifnull          176
	//*  71  166:aload           5
	//*  72  168:aload_1         
	//*  73  169:invokevirtual   #72  <Method long Long.longValue()>
	//*  74  172:invokevirtual   #148 <Method v v.f(long)>
	//*  75  175:pop             
	//*  76  176:aload_0         
	//*  77  177:invokestatic    #151 <Method String h.a(HttpResponse)>
	//*  78  180:astore_1        
	//*  79  181:aload_1         
	//*  80  182:ifnull          192
	//*  81  185:aload           5
	//*  82  187:aload_1         
	//*  83  188:invokevirtual   #153 <Method v v.c(String)>
	//*  84  191:pop             
	//*  85  192:aload           5
	//*  86  194:invokevirtual   #157 <Method com.google.android.gms.internal.firebase_2D_perf.bt v.d()>
	//*  87  197:pop             
	//*  88  198:aload_0         
	//*  89  199:areturn         
		// Misplaced declaration of an exception variable
		catch(HttpClient httpclient)
	//*  90  200:astore_0        
		{
			v1.e(zzbg1.c());
	//   91  201:aload           5
	//   92  203:aload_3         
	//   93  204:invokevirtual   #97  <Method long zzbg.c()>
	//   94  207:invokevirtual   #100 <Method v v.e(long)>
	//   95  210:pop             
			h.a(v1);
	//   96  211:aload           5
	//   97  213:invokestatic    #103 <Method void h.a(v)>
			throw httpclient;
	//   98  216:aload_0         
	//   99  217:athrow          
		}
		h1 = ((h) (new String(((String) (h1)))));
		v1.a(((String) (h1))).b(httprequest.getRequestLine().getMethod());
		h1 = ((h) (h.a(((org.apache.http.HttpMessage) (httprequest)))));
		if(h1 == null)
			break MISSING_BLOCK_LABEL_107;
		v1.a(((Long) (h1)).longValue());
		zzbg1.a();
		v1.b(zzbg1.b());
		httpclient = ((HttpClient) (httpclient.execute(httphost, httprequest)));
		v1.e(zzbg1.c());
		v1.a(((HttpResponse) (httpclient)).getStatusLine().getStatusCode());
		httphost = ((HttpHost) (h.a(((org.apache.http.HttpMessage) (httpclient)))));
		if(httphost == null)
			break MISSING_BLOCK_LABEL_176;
		v1.f(((Long) (httphost)).longValue());
		httphost = ((HttpHost) (h.a(((HttpResponse) (httpclient)))));
		if(httphost == null)
			break MISSING_BLOCK_LABEL_192;
		v1.c(((String) (httphost)));
		v1.d();
		return ((HttpResponse) (httpclient));
	}

	private static HttpResponse a(HttpClient httpclient, HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext, zzbg zzbg1, h h1)
	{
		v v1 = v.a(h1);
	//    0    0:aload           5
	//    1    2:invokestatic    #18  <Method v v.a(h)>
	//    2    5:astore          6
		try
		{
			h1 = ((h) (String.valueOf(((Object) (httphost.toURI())))));
	//    3    7:aload_1         
	//    4    8:invokevirtual   #24  <Method String HttpHost.toURI()>
	//    5   11:invokestatic    #30  <Method String String.valueOf(Object)>
	//    6   14:astore          5
			String s = String.valueOf(((Object) (httprequest.getRequestLine().getUri())));
	//    7   16:aload_2         
	//    8   17:invokeinterface #36  <Method RequestLine HttpRequest.getRequestLine()>
	//    9   22:invokeinterface #41  <Method String RequestLine.getUri()>
	//   10   27:invokestatic    #30  <Method String String.valueOf(Object)>
	//   11   30:astore          7
			if(s.length() != 0)
	//*  12   32:aload           7
	//*  13   34:invokevirtual   #45  <Method int String.length()>
	//*  14   37:ifeq            52
			{
				h1 = ((h) (((String) (h1)).concat(s)));
	//   15   40:aload           5
	//   16   42:aload           7
	//   17   44:invokevirtual   #49  <Method String String.concat(String)>
	//   18   47:astore          5
				break MISSING_BLOCK_LABEL_63;
	//   19   49:goto            63
			}
		}
	//*  20   52:new             #26  <Class String>
	//*  21   55:dup             
	//*  22   56:aload           5
	//*  23   58:invokespecial   #52  <Method void String(String)>
	//*  24   61:astore          5
	//*  25   63:aload           6
	//*  26   65:aload           5
	//*  27   67:invokevirtual   #55  <Method v v.a(String)>
	//*  28   70:aload_2         
	//*  29   71:invokeinterface #36  <Method RequestLine HttpRequest.getRequestLine()>
	//*  30   76:invokeinterface #58  <Method String RequestLine.getMethod()>
	//*  31   81:invokevirtual   #61  <Method v v.b(String)>
	//*  32   84:pop             
	//*  33   85:aload_2         
	//*  34   86:invokestatic    #66  <Method Long h.a(org.apache.http.HttpMessage)>
	//*  35   89:astore          5
	//*  36   91:aload           5
	//*  37   93:ifnull          107
	//*  38   96:aload           6
	//*  39   98:aload           5
	//*  40  100:invokevirtual   #72  <Method long Long.longValue()>
	//*  41  103:invokevirtual   #75  <Method v v.a(long)>
	//*  42  106:pop             
	//*  43  107:aload           4
	//*  44  109:invokevirtual   #79  <Method void zzbg.a()>
	//*  45  112:aload           6
	//*  46  114:aload           4
	//*  47  116:invokevirtual   #81  <Method long zzbg.b()>
	//*  48  119:invokevirtual   #83  <Method v v.b(long)>
	//*  49  122:pop             
	//*  50  123:aload_0         
	//*  51  124:aload_1         
	//*  52  125:aload_2         
	//*  53  126:aload_3         
	//*  54  127:invokeinterface #161 <Method HttpResponse HttpClient.execute(HttpHost, HttpRequest, HttpContext)>
	//*  55  132:astore_0        
	//*  56  133:aload           6
	//*  57  135:aload           4
	//*  58  137:invokevirtual   #97  <Method long zzbg.c()>
	//*  59  140:invokevirtual   #100 <Method v v.e(long)>
	//*  60  143:pop             
	//*  61  144:aload           6
	//*  62  146:aload_0         
	//*  63  147:invokeinterface #137 <Method StatusLine HttpResponse.getStatusLine()>
	//*  64  152:invokeinterface #142 <Method int StatusLine.getStatusCode()>
	//*  65  157:invokevirtual   #145 <Method v v.a(int)>
	//*  66  160:pop             
	//*  67  161:aload_0         
	//*  68  162:invokestatic    #66  <Method Long h.a(org.apache.http.HttpMessage)>
	//*  69  165:astore_1        
	//*  70  166:aload_1         
	//*  71  167:ifnull          180
	//*  72  170:aload           6
	//*  73  172:aload_1         
	//*  74  173:invokevirtual   #72  <Method long Long.longValue()>
	//*  75  176:invokevirtual   #148 <Method v v.f(long)>
	//*  76  179:pop             
	//*  77  180:aload_0         
	//*  78  181:invokestatic    #151 <Method String h.a(HttpResponse)>
	//*  79  184:astore_1        
	//*  80  185:aload_1         
	//*  81  186:ifnull          196
	//*  82  189:aload           6
	//*  83  191:aload_1         
	//*  84  192:invokevirtual   #153 <Method v v.c(String)>
	//*  85  195:pop             
	//*  86  196:aload           6
	//*  87  198:invokevirtual   #157 <Method com.google.android.gms.internal.firebase_2D_perf.bt v.d()>
	//*  88  201:pop             
	//*  89  202:aload_0         
	//*  90  203:areturn         
		// Misplaced declaration of an exception variable
		catch(HttpClient httpclient)
	//*  91  204:astore_0        
		{
			v1.e(zzbg1.c());
	//   92  205:aload           6
	//   93  207:aload           4
	//   94  209:invokevirtual   #97  <Method long zzbg.c()>
	//   95  212:invokevirtual   #100 <Method v v.e(long)>
	//   96  215:pop             
			h.a(v1);
	//   97  216:aload           6
	//   98  218:invokestatic    #103 <Method void h.a(v)>
			throw httpclient;
	//   99  221:aload_0         
	//  100  222:athrow          
		}
		h1 = ((h) (new String(((String) (h1)))));
		v1.a(((String) (h1))).b(httprequest.getRequestLine().getMethod());
		h1 = ((h) (h.a(((org.apache.http.HttpMessage) (httprequest)))));
		if(h1 == null)
			break MISSING_BLOCK_LABEL_107;
		v1.a(((Long) (h1)).longValue());
		zzbg1.a();
		v1.b(zzbg1.b());
		httpclient = ((HttpClient) (httpclient.execute(httphost, httprequest, httpcontext)));
		v1.e(zzbg1.c());
		v1.a(((HttpResponse) (httpclient)).getStatusLine().getStatusCode());
		httphost = ((HttpHost) (h.a(((org.apache.http.HttpMessage) (httpclient)))));
		if(httphost == null)
			break MISSING_BLOCK_LABEL_180;
		v1.f(((Long) (httphost)).longValue());
		httphost = ((HttpHost) (h.a(((HttpResponse) (httpclient)))));
		if(httphost == null)
			break MISSING_BLOCK_LABEL_196;
		v1.c(((String) (httphost)));
		v1.d();
		return ((HttpResponse) (httpclient));
	}

	private static HttpResponse a(HttpClient httpclient, HttpUriRequest httpurirequest, zzbg zzbg1, h h1)
	{
		h1 = ((h) (v.a(h1)));
	//    0    0:aload_3         
	//    1    1:invokestatic    #18  <Method v v.a(h)>
	//    2    4:astore_3        
		Long long1;
		try
		{
			((v) (h1)).a(httpurirequest.getURI().toString()).b(httpurirequest.getMethod());
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokeinterface #114 <Method URI HttpUriRequest.getURI()>
	//    6   12:invokevirtual   #119 <Method String URI.toString()>
	//    7   15:invokevirtual   #55  <Method v v.a(String)>
	//    8   18:aload_1         
	//    9   19:invokeinterface #120 <Method String HttpUriRequest.getMethod()>
	//   10   24:invokevirtual   #61  <Method v v.b(String)>
	//   11   27:pop             
			long1 = h.a(((org.apache.http.HttpMessage) (httpurirequest)));
	//   12   28:aload_1         
	//   13   29:invokestatic    #66  <Method Long h.a(org.apache.http.HttpMessage)>
	//   14   32:astore          4
		}
	//*  15   34:aload           4
	//*  16   36:ifnull          49
	//*  17   39:aload_3         
	//*  18   40:aload           4
	//*  19   42:invokevirtual   #72  <Method long Long.longValue()>
	//*  20   45:invokevirtual   #75  <Method v v.a(long)>
	//*  21   48:pop             
	//*  22   49:aload_2         
	//*  23   50:invokevirtual   #79  <Method void zzbg.a()>
	//*  24   53:aload_3         
	//*  25   54:aload_2         
	//*  26   55:invokevirtual   #81  <Method long zzbg.b()>
	//*  27   58:invokevirtual   #83  <Method v v.b(long)>
	//*  28   61:pop             
	//*  29   62:aload_0         
	//*  30   63:aload_1         
	//*  31   64:invokeinterface #165 <Method HttpResponse HttpClient.execute(HttpUriRequest)>
	//*  32   69:astore_0        
	//*  33   70:aload_3         
	//*  34   71:aload_2         
	//*  35   72:invokevirtual   #97  <Method long zzbg.c()>
	//*  36   75:invokevirtual   #100 <Method v v.e(long)>
	//*  37   78:pop             
	//*  38   79:aload_3         
	//*  39   80:aload_0         
	//*  40   81:invokeinterface #137 <Method StatusLine HttpResponse.getStatusLine()>
	//*  41   86:invokeinterface #142 <Method int StatusLine.getStatusCode()>
	//*  42   91:invokevirtual   #145 <Method v v.a(int)>
	//*  43   94:pop             
	//*  44   95:aload_0         
	//*  45   96:invokestatic    #66  <Method Long h.a(org.apache.http.HttpMessage)>
	//*  46   99:astore_1        
	//*  47  100:aload_1         
	//*  48  101:ifnull          113
	//*  49  104:aload_3         
	//*  50  105:aload_1         
	//*  51  106:invokevirtual   #72  <Method long Long.longValue()>
	//*  52  109:invokevirtual   #148 <Method v v.f(long)>
	//*  53  112:pop             
	//*  54  113:aload_0         
	//*  55  114:invokestatic    #151 <Method String h.a(HttpResponse)>
	//*  56  117:astore_1        
	//*  57  118:aload_1         
	//*  58  119:ifnull          128
	//*  59  122:aload_3         
	//*  60  123:aload_1         
	//*  61  124:invokevirtual   #153 <Method v v.c(String)>
	//*  62  127:pop             
	//*  63  128:aload_3         
	//*  64  129:invokevirtual   #157 <Method com.google.android.gms.internal.firebase_2D_perf.bt v.d()>
	//*  65  132:pop             
	//*  66  133:aload_0         
	//*  67  134:areturn         
		// Misplaced declaration of an exception variable
		catch(HttpClient httpclient)
	//*  68  135:astore_0        
		{
			((v) (h1)).e(zzbg1.c());
	//   69  136:aload_3         
	//   70  137:aload_2         
	//   71  138:invokevirtual   #97  <Method long zzbg.c()>
	//   72  141:invokevirtual   #100 <Method v v.e(long)>
	//   73  144:pop             
			h.a(((v) (h1)));
	//   74  145:aload_3         
	//   75  146:invokestatic    #103 <Method void h.a(v)>
			throw httpclient;
	//   76  149:aload_0         
	//   77  150:athrow          
		}
		if(long1 == null)
			break MISSING_BLOCK_LABEL_49;
		((v) (h1)).a(long1.longValue());
		zzbg1.a();
		((v) (h1)).b(zzbg1.b());
		httpclient = ((HttpClient) (httpclient.execute(httpurirequest)));
		((v) (h1)).e(zzbg1.c());
		((v) (h1)).a(((HttpResponse) (httpclient)).getStatusLine().getStatusCode());
		httpurirequest = ((HttpUriRequest) (h.a(((org.apache.http.HttpMessage) (httpclient)))));
		if(httpurirequest == null)
			break MISSING_BLOCK_LABEL_113;
		((v) (h1)).f(((Long) (httpurirequest)).longValue());
		httpurirequest = ((HttpUriRequest) (h.a(((HttpResponse) (httpclient)))));
		if(httpurirequest == null)
			break MISSING_BLOCK_LABEL_128;
		((v) (h1)).c(((String) (httpurirequest)));
		((v) (h1)).d();
		return ((HttpResponse) (httpclient));
	}

	private static HttpResponse a(HttpClient httpclient, HttpUriRequest httpurirequest, HttpContext httpcontext, zzbg zzbg1, h h1)
	{
		h1 = ((h) (v.a(h1)));
	//    0    0:aload           4
	//    1    2:invokestatic    #18  <Method v v.a(h)>
	//    2    5:astore          4
		Long long1;
		try
		{
			((v) (h1)).a(httpurirequest.getURI().toString()).b(httpurirequest.getMethod());
	//    3    7:aload           4
	//    4    9:aload_1         
	//    5   10:invokeinterface #114 <Method URI HttpUriRequest.getURI()>
	//    6   15:invokevirtual   #119 <Method String URI.toString()>
	//    7   18:invokevirtual   #55  <Method v v.a(String)>
	//    8   21:aload_1         
	//    9   22:invokeinterface #120 <Method String HttpUriRequest.getMethod()>
	//   10   27:invokevirtual   #61  <Method v v.b(String)>
	//   11   30:pop             
			long1 = h.a(((org.apache.http.HttpMessage) (httpurirequest)));
	//   12   31:aload_1         
	//   13   32:invokestatic    #66  <Method Long h.a(org.apache.http.HttpMessage)>
	//   14   35:astore          5
		}
	//*  15   37:aload           5
	//*  16   39:ifnull          53
	//*  17   42:aload           4
	//*  18   44:aload           5
	//*  19   46:invokevirtual   #72  <Method long Long.longValue()>
	//*  20   49:invokevirtual   #75  <Method v v.a(long)>
	//*  21   52:pop             
	//*  22   53:aload_3         
	//*  23   54:invokevirtual   #79  <Method void zzbg.a()>
	//*  24   57:aload           4
	//*  25   59:aload_3         
	//*  26   60:invokevirtual   #81  <Method long zzbg.b()>
	//*  27   63:invokevirtual   #83  <Method v v.b(long)>
	//*  28   66:pop             
	//*  29   67:aload_0         
	//*  30   68:aload_1         
	//*  31   69:aload_2         
	//*  32   70:invokeinterface #169 <Method HttpResponse HttpClient.execute(HttpUriRequest, HttpContext)>
	//*  33   75:astore_0        
	//*  34   76:aload           4
	//*  35   78:aload_3         
	//*  36   79:invokevirtual   #97  <Method long zzbg.c()>
	//*  37   82:invokevirtual   #100 <Method v v.e(long)>
	//*  38   85:pop             
	//*  39   86:aload           4
	//*  40   88:aload_0         
	//*  41   89:invokeinterface #137 <Method StatusLine HttpResponse.getStatusLine()>
	//*  42   94:invokeinterface #142 <Method int StatusLine.getStatusCode()>
	//*  43   99:invokevirtual   #145 <Method v v.a(int)>
	//*  44  102:pop             
	//*  45  103:aload_0         
	//*  46  104:invokestatic    #66  <Method Long h.a(org.apache.http.HttpMessage)>
	//*  47  107:astore_1        
	//*  48  108:aload_1         
	//*  49  109:ifnull          122
	//*  50  112:aload           4
	//*  51  114:aload_1         
	//*  52  115:invokevirtual   #72  <Method long Long.longValue()>
	//*  53  118:invokevirtual   #148 <Method v v.f(long)>
	//*  54  121:pop             
	//*  55  122:aload_0         
	//*  56  123:invokestatic    #151 <Method String h.a(HttpResponse)>
	//*  57  126:astore_1        
	//*  58  127:aload_1         
	//*  59  128:ifnull          138
	//*  60  131:aload           4
	//*  61  133:aload_1         
	//*  62  134:invokevirtual   #153 <Method v v.c(String)>
	//*  63  137:pop             
	//*  64  138:aload           4
	//*  65  140:invokevirtual   #157 <Method com.google.android.gms.internal.firebase_2D_perf.bt v.d()>
	//*  66  143:pop             
	//*  67  144:aload_0         
	//*  68  145:areturn         
		// Misplaced declaration of an exception variable
		catch(HttpClient httpclient)
	//*  69  146:astore_0        
		{
			((v) (h1)).e(zzbg1.c());
	//   70  147:aload           4
	//   71  149:aload_3         
	//   72  150:invokevirtual   #97  <Method long zzbg.c()>
	//   73  153:invokevirtual   #100 <Method v v.e(long)>
	//   74  156:pop             
			h.a(((v) (h1)));
	//   75  157:aload           4
	//   76  159:invokestatic    #103 <Method void h.a(v)>
			throw httpclient;
	//   77  162:aload_0         
	//   78  163:athrow          
		}
		if(long1 == null)
			break MISSING_BLOCK_LABEL_53;
		((v) (h1)).a(long1.longValue());
		zzbg1.a();
		((v) (h1)).b(zzbg1.b());
		httpclient = ((HttpClient) (httpclient.execute(httpurirequest, httpcontext)));
		((v) (h1)).e(zzbg1.c());
		((v) (h1)).a(((HttpResponse) (httpclient)).getStatusLine().getStatusCode());
		httpurirequest = ((HttpUriRequest) (h.a(((org.apache.http.HttpMessage) (httpclient)))));
		if(httpurirequest == null)
			break MISSING_BLOCK_LABEL_122;
		((v) (h1)).f(((Long) (httpurirequest)).longValue());
		httpurirequest = ((HttpUriRequest) (h.a(((HttpResponse) (httpclient)))));
		if(httpurirequest == null)
			break MISSING_BLOCK_LABEL_138;
		((v) (h1)).c(((String) (httpurirequest)));
		((v) (h1)).d();
		return ((HttpResponse) (httpclient));
	}

	public static Object execute(HttpClient httpclient, HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler)
	{
		return a(httpclient, httphost, httprequest, responsehandler, new zzbg(), h.a());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:new             #77  <Class zzbg>
	//    5    7:dup             
	//    6    8:invokespecial   #172 <Method void zzbg()>
	//    7   11:invokestatic    #177 <Method h h.a()>
	//    8   14:invokestatic    #179 <Method Object a(HttpClient, HttpHost, HttpRequest, ResponseHandler, zzbg, h)>
	//    9   17:areturn         
	}

	public static Object execute(HttpClient httpclient, HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler, HttpContext httpcontext)
	{
		return a(httpclient, httphost, httprequest, responsehandler, httpcontext, new zzbg(), h.a());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:new             #77  <Class zzbg>
	//    6    9:dup             
	//    7   10:invokespecial   #172 <Method void zzbg()>
	//    8   13:invokestatic    #177 <Method h h.a()>
	//    9   16:invokestatic    #183 <Method Object a(HttpClient, HttpHost, HttpRequest, ResponseHandler, HttpContext, zzbg, h)>
	//   10   19:areturn         
	}

	public static Object execute(HttpClient httpclient, HttpUriRequest httpurirequest, ResponseHandler responsehandler)
	{
		return a(httpclient, httpurirequest, responsehandler, new zzbg(), h.a());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #77  <Class zzbg>
	//    4    6:dup             
	//    5    7:invokespecial   #172 <Method void zzbg()>
	//    6   10:invokestatic    #177 <Method h h.a()>
	//    7   13:invokestatic    #186 <Method Object a(HttpClient, HttpUriRequest, ResponseHandler, zzbg, h)>
	//    8   16:areturn         
	}

	public static Object execute(HttpClient httpclient, HttpUriRequest httpurirequest, ResponseHandler responsehandler, HttpContext httpcontext)
	{
		return a(httpclient, httpurirequest, responsehandler, httpcontext, new zzbg(), h.a());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:new             #77  <Class zzbg>
	//    5    7:dup             
	//    6    8:invokespecial   #172 <Method void zzbg()>
	//    7   11:invokestatic    #177 <Method h h.a()>
	//    8   14:invokestatic    #189 <Method Object a(HttpClient, HttpUriRequest, ResponseHandler, HttpContext, zzbg, h)>
	//    9   17:areturn         
	}

	public static HttpResponse execute(HttpClient httpclient, HttpHost httphost, HttpRequest httprequest)
	{
		return a(httpclient, httphost, httprequest, new zzbg(), h.a());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #77  <Class zzbg>
	//    4    6:dup             
	//    5    7:invokespecial   #172 <Method void zzbg()>
	//    6   10:invokestatic    #177 <Method h h.a()>
	//    7   13:invokestatic    #192 <Method HttpResponse a(HttpClient, HttpHost, HttpRequest, zzbg, h)>
	//    8   16:areturn         
	}

	public static HttpResponse execute(HttpClient httpclient, HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
	{
		return a(httpclient, httphost, httprequest, httpcontext, new zzbg(), h.a());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:new             #77  <Class zzbg>
	//    5    7:dup             
	//    6    8:invokespecial   #172 <Method void zzbg()>
	//    7   11:invokestatic    #177 <Method h h.a()>
	//    8   14:invokestatic    #195 <Method HttpResponse a(HttpClient, HttpHost, HttpRequest, HttpContext, zzbg, h)>
	//    9   17:areturn         
	}

	public static HttpResponse execute(HttpClient httpclient, HttpUriRequest httpurirequest)
	{
		return a(httpclient, httpurirequest, new zzbg(), h.a());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #77  <Class zzbg>
	//    3    5:dup             
	//    4    6:invokespecial   #172 <Method void zzbg()>
	//    5    9:invokestatic    #177 <Method h h.a()>
	//    6   12:invokestatic    #198 <Method HttpResponse a(HttpClient, HttpUriRequest, zzbg, h)>
	//    7   15:areturn         
	}

	public static HttpResponse execute(HttpClient httpclient, HttpUriRequest httpurirequest, HttpContext httpcontext)
	{
		return a(httpclient, httpurirequest, httpcontext, new zzbg(), h.a());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #77  <Class zzbg>
	//    4    6:dup             
	//    5    7:invokespecial   #172 <Method void zzbg()>
	//    6   10:invokestatic    #177 <Method h h.a()>
	//    7   13:invokestatic    #201 <Method HttpResponse a(HttpClient, HttpUriRequest, HttpContext, zzbg, h)>
	//    8   16:areturn         
	}
}
