// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.http;

import com.newrelic.agent.android.instrumentation.okhttp3.OkHttp3Instrumentation;
import java.io.IOException;
import java.security.cert.*;
import java.util.*;
import okhttp3.*;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.platform.Platform;
import okio.*;

final class ResponseHeaderRecord
{

	ResponseHeaderRecord(Response response1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void Object()>
		url = response1.request().url().toString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #64  <Method Request Response.request()>
	//    5    9:invokevirtual   #69  <Method HttpUrl Request.url()>
	//    6   12:invokevirtual   #72  <Method String HttpUrl.toString()>
	//    7   15:putfield        #74  <Field String url>
		varyHeaders = HttpHeaders.varyHeaders(response1);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokestatic    #79  <Method Headers HttpHeaders.varyHeaders(Response)>
	//   11   23:putfield        #81  <Field Headers varyHeaders>
		requestMethod = response1.request().method();
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokevirtual   #64  <Method Request Response.request()>
	//   15   31:invokevirtual   #84  <Method String Request.method()>
	//   16   34:putfield        #86  <Field String requestMethod>
		protocol = response1.protocol();
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:invokevirtual   #89  <Method Protocol Response.protocol()>
	//   20   42:putfield        #91  <Field Protocol protocol>
		code = response1.code();
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:invokevirtual   #94  <Method int Response.code()>
	//   24   50:putfield        #96  <Field int code>
		message = response1.message();
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:invokevirtual   #98  <Method String Response.message()>
	//   28   58:putfield        #100 <Field String message>
		responseHeaders = response1.headers();
	//   29   61:aload_0         
	//   30   62:aload_1         
	//   31   63:invokevirtual   #104 <Method Headers Response.headers()>
	//   32   66:putfield        #106 <Field Headers responseHeaders>
		handshake = response1.handshake();
	//   33   69:aload_0         
	//   34   70:aload_1         
	//   35   71:invokevirtual   #109 <Method Handshake Response.handshake()>
	//   36   74:putfield        #111 <Field Handshake handshake>
		sentRequestMillis = response1.sentRequestAtMillis();
	//   37   77:aload_0         
	//   38   78:aload_1         
	//   39   79:invokevirtual   #115 <Method long Response.sentRequestAtMillis()>
	//   40   82:putfield        #117 <Field long sentRequestMillis>
		receivedResponseMillis = response1.receivedResponseAtMillis();
	//   41   85:aload_0         
	//   42   86:aload_1         
	//   43   87:invokevirtual   #120 <Method long Response.receivedResponseAtMillis()>
	//   44   90:putfield        #122 <Field long receivedResponseMillis>
	//   45   93:return          
	}

	ResponseHeaderRecord(Source source)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void Object()>
		int j;
		Object obj;
		BufferedSource bufferedsource;
		bufferedsource = Okio.buffer(source);
	//    2    4:aload_1         
	//    3    5:invokestatic    #131 <Method BufferedSource Okio.buffer(Source)>
	//    4    8:astore          11
		url = bufferedsource.readUtf8LineStrict();
	//    5   10:aload_0         
	//    6   11:aload           11
	//    7   13:invokeinterface #136 <Method String BufferedSource.readUtf8LineStrict()>
	//    8   18:putfield        #74  <Field String url>
		requestMethod = bufferedsource.readUtf8LineStrict();
	//    9   21:aload_0         
	//   10   22:aload           11
	//   11   24:invokeinterface #136 <Method String BufferedSource.readUtf8LineStrict()>
	//   12   29:putfield        #86  <Field String requestMethod>
		obj = ((Object) (new okhttp3.Headers.Builder()));
	//   13   32:new             #138 <Class okhttp3.Headers$Builder>
	//   14   35:dup             
	//   15   36:invokespecial   #139 <Method void okhttp3.Headers$Builder()>
	//   16   39:astore          10
		j = readInt(bufferedsource);
	//   17   41:aload           11
	//   18   43:invokestatic    #143 <Method int readInt(BufferedSource)>
	//   19   46:istore          4
		int i;
		boolean flag;
		flag = false;
	//   20   48:iconst_0        
	//   21   49:istore_3        
		i = 0;
	//   22   50:iconst_0        
	//   23   51:istore_2        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   24   52:iload_2         
	//   25   53:iload           4
	//   26   55:icmpge          78
		addHeaderLenient(((okhttp3.Headers.Builder) (obj)), bufferedsource.readUtf8LineStrict());
	//   27   58:aload_0         
	//   28   59:aload           10
	//   29   61:aload           11
	//   30   63:invokeinterface #136 <Method String BufferedSource.readUtf8LineStrict()>
	//   31   68:invokespecial   #147 <Method void addHeaderLenient(okhttp3.Headers$Builder, String)>
		i++;
	//   32   71:iload_2         
	//   33   72:iconst_1        
	//   34   73:iadd            
	//   35   74:istore_2        
		if(true) goto _L2; else goto _L1
	//   36   75:goto            52
_L1:
		varyHeaders = ((okhttp3.Headers.Builder) (obj)).build();
	//   37   78:aload_0         
	//   38   79:aload           10
	//   39   81:invokevirtual   #150 <Method Headers okhttp3.Headers$Builder.build()>
	//   40   84:putfield        #81  <Field Headers varyHeaders>
		obj = ((Object) (StatusLine.parse(bufferedsource.readUtf8LineStrict())));
	//   41   87:aload           11
	//   42   89:invokeinterface #136 <Method String BufferedSource.readUtf8LineStrict()>
	//   43   94:invokestatic    #156 <Method StatusLine StatusLine.parse(String)>
	//   44   97:astore          10
		protocol = ((StatusLine) (obj)).protocol;
	//   45   99:aload_0         
	//   46  100:aload           10
	//   47  102:getfield        #157 <Field Protocol StatusLine.protocol>
	//   48  105:putfield        #91  <Field Protocol protocol>
		code = ((StatusLine) (obj)).code;
	//   49  108:aload_0         
	//   50  109:aload           10
	//   51  111:getfield        #158 <Field int StatusLine.code>
	//   52  114:putfield        #96  <Field int code>
		message = ((StatusLine) (obj)).message;
	//   53  117:aload_0         
	//   54  118:aload           10
	//   55  120:getfield        #159 <Field String StatusLine.message>
	//   56  123:putfield        #100 <Field String message>
		obj = ((Object) (new okhttp3.Headers.Builder()));
	//   57  126:new             #138 <Class okhttp3.Headers$Builder>
	//   58  129:dup             
	//   59  130:invokespecial   #139 <Method void okhttp3.Headers$Builder()>
	//   60  133:astore          10
		j = readInt(bufferedsource);
	//   61  135:aload           11
	//   62  137:invokestatic    #143 <Method int readInt(BufferedSource)>
	//   63  140:istore          4
		i = ((int) (flag));
	//   64  142:iload_3         
	//   65  143:istore_2        
_L4:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   66  144:iload_2         
	//   67  145:iload           4
	//   68  147:icmpge          170
		addHeaderLenient(((okhttp3.Headers.Builder) (obj)), bufferedsource.readUtf8LineStrict());
	//   69  150:aload_0         
	//   70  151:aload           10
	//   71  153:aload           11
	//   72  155:invokeinterface #136 <Method String BufferedSource.readUtf8LineStrict()>
	//   73  160:invokespecial   #147 <Method void addHeaderLenient(okhttp3.Headers$Builder, String)>
		i++;
	//   74  163:iload_2         
	//   75  164:iconst_1        
	//   76  165:iadd            
	//   77  166:istore_2        
		if(true) goto _L4; else goto _L3
	//   78  167:goto            144
_L3:
		Object obj1;
		String s;
		obj1 = ((Object) (((okhttp3.Headers.Builder) (obj)).get(SENT_MILLIS)));
	//   79  170:aload           10
	//   80  172:getstatic       #51  <Field String SENT_MILLIS>
	//   81  175:invokevirtual   #162 <Method String okhttp3.Headers$Builder.get(String)>
	//   82  178:astore          12
		s = ((okhttp3.Headers.Builder) (obj)).get(RECEIVED_MILLIS);
	//   83  180:aload           10
	//   84  182:getstatic       #55  <Field String RECEIVED_MILLIS>
	//   85  185:invokevirtual   #162 <Method String okhttp3.Headers$Builder.get(String)>
	//   86  188:astore          13
		((okhttp3.Headers.Builder) (obj)).removeAll(SENT_MILLIS);
	//   87  190:aload           10
	//   88  192:getstatic       #51  <Field String SENT_MILLIS>
	//   89  195:invokevirtual   #166 <Method okhttp3.Headers$Builder okhttp3.Headers$Builder.removeAll(String)>
	//   90  198:pop             
		((okhttp3.Headers.Builder) (obj)).removeAll(RECEIVED_MILLIS);
	//   91  199:aload           10
	//   92  201:getstatic       #55  <Field String RECEIVED_MILLIS>
	//   93  204:invokevirtual   #166 <Method okhttp3.Headers$Builder okhttp3.Headers$Builder.removeAll(String)>
	//   94  207:pop             
		long l1 = 0L;
	//   95  208:lconst_0        
	//   96  209:lstore          7
		if(obj1 == null) goto _L6; else goto _L5
	//   97  211:aload           12
	//   98  213:ifnull          431
_L5:
		long l = Long.parseLong(((String) (obj1)));
	//   99  216:aload           12
	//  100  218:invokestatic    #172 <Method long Long.parseLong(String)>
	//  101  221:lstore          5
	//* 102  223:goto            226
_L8:
		sentRequestMillis = l;
	//  103  226:aload_0         
	//  104  227:lload           5
	//  105  229:putfield        #117 <Field long sentRequestMillis>
		l = l1;
	//  106  232:lload           7
	//  107  234:lstore          5
		if(s == null)
			break MISSING_BLOCK_LABEL_248;
	//  108  236:aload           13
	//  109  238:ifnull          248
		l = Long.parseLong(s);
	//  110  241:aload           13
	//  111  243:invokestatic    #172 <Method long Long.parseLong(String)>
	//  112  246:lstore          5
		boolean flag1;
		receivedResponseMillis = l;
	//  113  248:aload_0         
	//  114  249:lload           5
	//  115  251:putfield        #122 <Field long receivedResponseMillis>
		responseHeaders = ((okhttp3.Headers.Builder) (obj)).build();
	//  116  254:aload_0         
	//  117  255:aload           10
	//  118  257:invokevirtual   #150 <Method Headers okhttp3.Headers$Builder.build()>
	//  119  260:putfield        #106 <Field Headers responseHeaders>
		flag1 = isHttps();
	//  120  263:aload_0         
	//  121  264:invokespecial   #176 <Method boolean isHttps()>
	//  122  267:istore          9
		obj = null;
	//  123  269:aconst_null     
	//  124  270:astore          10
		if(!flag1)
			break MISSING_BLOCK_LABEL_408;
	//  125  272:iload           9
	//  126  274:ifeq            408
		obj1 = ((Object) (bufferedsource.readUtf8LineStrict()));
	//  127  277:aload           11
	//  128  279:invokeinterface #136 <Method String BufferedSource.readUtf8LineStrict()>
	//  129  284:astore          12
		if(((String) (obj1)).length() <= 0)
	//* 130  286:aload           12
	//* 131  288:invokevirtual   #181 <Method int String.length()>
	//* 132  291:ifgt            362
		{
			obj1 = ((Object) (CipherSuite.forJavaName(bufferedsource.readUtf8LineStrict())));
	//  133  294:aload           11
	//  134  296:invokeinterface #136 <Method String BufferedSource.readUtf8LineStrict()>
	//  135  301:invokestatic    #187 <Method CipherSuite CipherSuite.forJavaName(String)>
	//  136  304:astore          12
			List list = readCertificateList(bufferedsource);
	//  137  306:aload_0         
	//  138  307:aload           11
	//  139  309:invokespecial   #191 <Method List readCertificateList(BufferedSource)>
	//  140  312:astore          13
			List list1 = readCertificateList(bufferedsource);
	//  141  314:aload_0         
	//  142  315:aload           11
	//  143  317:invokespecial   #191 <Method List readCertificateList(BufferedSource)>
	//  144  320:astore          14
			if(!bufferedsource.exhausted())
	//* 145  322:aload           11
	//* 146  324:invokeinterface #194 <Method boolean BufferedSource.exhausted()>
	//* 147  329:ifne            344
				obj = ((Object) (TlsVersion.forJavaName(bufferedsource.readUtf8LineStrict())));
	//  148  332:aload           11
	//  149  334:invokeinterface #136 <Method String BufferedSource.readUtf8LineStrict()>
	//  150  339:invokestatic    #199 <Method TlsVersion TlsVersion.forJavaName(String)>
	//  151  342:astore          10
			handshake = Handshake.get(((TlsVersion) (obj)), ((CipherSuite) (obj1)), list, list1);
	//  152  344:aload_0         
	//  153  345:aload           10
	//  154  347:aload           12
	//  155  349:aload           13
	//  156  351:aload           14
	//  157  353:invokestatic    #204 <Method Handshake Handshake.get(TlsVersion, CipherSuite, List, List)>
	//  158  356:putfield        #111 <Field Handshake handshake>
			break MISSING_BLOCK_LABEL_413;
	//  159  359:goto            413
		}
		StringBuilder stringbuilder = new StringBuilder();
	//  160  362:new             #27  <Class StringBuilder>
	//  161  365:dup             
	//  162  366:invokespecial   #30  <Method void StringBuilder()>
	//  163  369:astore          10
		stringbuilder.append("expected \"\" but was \"");
	//  164  371:aload           10
	//  165  373:ldc1            #206 <String "expected \"\" but was \"">
	//  166  375:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//  167  378:pop             
		stringbuilder.append(((String) (obj1)));
	//  168  379:aload           10
	//  169  381:aload           12
	//  170  383:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//  171  386:pop             
		stringbuilder.append("\"");
	//  172  387:aload           10
	//  173  389:ldc1            #208 <String "\"">
	//  174  391:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//  175  394:pop             
		throw new IOException(stringbuilder.toString());
	//  176  395:new             #125 <Class IOException>
	//  177  398:dup             
	//  178  399:aload           10
	//  179  401:invokevirtual   #49  <Method String StringBuilder.toString()>
	//  180  404:invokespecial   #211 <Method void IOException(String)>
	//  181  407:athrow          
		handshake = null;
	//  182  408:aload_0         
	//  183  409:aconst_null     
	//  184  410:putfield        #111 <Field Handshake handshake>
		source.close();
	//  185  413:aload_1         
	//  186  414:invokeinterface #216 <Method void Source.close()>
		return;
	//  187  419:return          
		Exception exception;
		exception;
	//  188  420:astore          10
		source.close();
	//  189  422:aload_1         
	//  190  423:invokeinterface #216 <Method void Source.close()>
		throw exception;
	//  191  428:aload           10
	//  192  430:athrow          
_L6:
		l = 0L;
	//  193  431:lconst_0        
	//  194  432:lstore          5
		if(true) goto _L8; else goto _L7
	//  195  434:goto            226
_L7:
	}

	private void addHeaderLenient(okhttp3.Headers.Builder builder, String s)
	{
		int i = s.indexOf(":", 1);
	//    0    0:aload_2         
	//    1    1:ldc1            #219 <String ":">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #223 <Method int String.indexOf(String, int)>
	//    4    7:istore_3        
		if(i != -1)
	//*   5    8:iload_3         
	//*   6    9:iconst_m1       
	//*   7   10:icmpeq          32
		{
			builder.add(s.substring(0, i), s.substring(i + 1));
	//    8   13:aload_1         
	//    9   14:aload_2         
	//   10   15:iconst_0        
	//   11   16:iload_3         
	//   12   17:invokevirtual   #227 <Method String String.substring(int, int)>
	//   13   20:aload_2         
	//   14   21:iload_3         
	//   15   22:iconst_1        
	//   16   23:iadd            
	//   17   24:invokevirtual   #230 <Method String String.substring(int)>
	//   18   27:invokevirtual   #234 <Method okhttp3.Headers$Builder okhttp3.Headers$Builder.add(String, String)>
	//   19   30:pop             
			return;
	//   20   31:return          
		}
		if(s.startsWith(":"))
	//*  21   32:aload_2         
	//*  22   33:ldc1            #219 <String ":">
	//*  23   35:invokevirtual   #238 <Method boolean String.startsWith(String)>
	//*  24   38:ifeq            54
		{
			builder.add("", s.substring(1));
	//   25   41:aload_1         
	//   26   42:ldc1            #240 <String "">
	//   27   44:aload_2         
	//   28   45:iconst_1        
	//   29   46:invokevirtual   #230 <Method String String.substring(int)>
	//   30   49:invokevirtual   #234 <Method okhttp3.Headers$Builder okhttp3.Headers$Builder.add(String, String)>
	//   31   52:pop             
			return;
	//   32   53:return          
		} else
		{
			builder.add("", s);
	//   33   54:aload_1         
	//   34   55:ldc1            #240 <String "">
	//   35   57:aload_2         
	//   36   58:invokevirtual   #234 <Method okhttp3.Headers$Builder okhttp3.Headers$Builder.add(String, String)>
	//   37   61:pop             
			return;
	//   38   62:return          
		}
	}

	private boolean isHttps()
	{
		return url.startsWith("https://");
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field String url>
	//    2    4:ldc1            #242 <String "https://">
	//    3    6:invokevirtual   #238 <Method boolean String.startsWith(String)>
	//    4    9:ireturn         
	}

	private List readCertificateList(BufferedSource bufferedsource)
		throws IOException
	{
		int j = readInt(bufferedsource);
	//    0    0:aload_1         
	//    1    1:invokestatic    #143 <Method int readInt(BufferedSource)>
	//    2    4:istore_3        
		if(j == -1)
	//*   3    5:iload_3         
	//*   4    6:iconst_m1       
	//*   5    7:icmpne          14
			return Collections.emptyList();
	//    6   10:invokestatic    #250 <Method List Collections.emptyList()>
	//    7   13:areturn         
		int i;
		CertificateFactory certificatefactory;
		ArrayList arraylist;
		String s;
		Buffer buffer;
		try
		{
			certificatefactory = CertificateFactory.getInstance("X.509");
	//    8   14:ldc1            #252 <String "X.509">
	//    9   16:invokestatic    #258 <Method CertificateFactory CertificateFactory.getInstance(String)>
	//   10   19:astore          4
			arraylist = new ArrayList(j);
	//   11   21:new             #260 <Class ArrayList>
	//   12   24:dup             
	//   13   25:iload_3         
	//   14   26:invokespecial   #263 <Method void ArrayList(int)>
	//   15   29:astore          5
		}
	//*  16   31:iconst_0        
	//*  17   32:istore_2        
	//*  18   33:iload_2         
	//*  19   34:iload_3         
	//*  20   35:icmpge          91
	//*  21   38:aload_1         
	//*  22   39:invokeinterface #136 <Method String BufferedSource.readUtf8LineStrict()>
	//*  23   44:astore          6
	//*  24   46:new             #265 <Class Buffer>
	//*  25   49:dup             
	//*  26   50:invokespecial   #266 <Method void Buffer()>
	//*  27   53:astore          7
	//*  28   55:aload           7
	//*  29   57:aload           6
	//*  30   59:invokestatic    #272 <Method ByteString ByteString.decodeBase64(String)>
	//*  31   62:invokevirtual   #276 <Method Buffer Buffer.write(ByteString)>
	//*  32   65:pop             
	//*  33   66:aload           5
	//*  34   68:aload           4
	//*  35   70:aload           7
	//*  36   72:invokevirtual   #280 <Method java.io.InputStream Buffer.inputStream()>
	//*  37   75:invokevirtual   #284 <Method Certificate CertificateFactory.generateCertificate(java.io.InputStream)>
	//*  38   78:invokeinterface #289 <Method boolean List.add(Object)>
	//*  39   83:pop             
	//*  40   84:iload_2         
	//*  41   85:iconst_1        
	//*  42   86:iadd            
	//*  43   87:istore_2        
	//*  44   88:goto            33
	//*  45   91:aload           5
	//*  46   93:areturn         
		// Misplaced declaration of an exception variable
		catch(BufferedSource bufferedsource)
	//*  47   94:astore_1        
		{
			throw new IOException(((CertificateException) (bufferedsource)).getMessage());
	//   48   95:new             #125 <Class IOException>
	//   49   98:dup             
	//   50   99:aload_1         
	//   51  100:invokevirtual   #292 <Method String CertificateException.getMessage()>
	//   52  103:invokespecial   #211 <Method void IOException(String)>
	//   53  106:athrow          
		}
		i = 0;
		if(i >= j)
			break; /* Loop/switch isn't completed */
		s = bufferedsource.readUtf8LineStrict();
		buffer = new Buffer();
		buffer.write(ByteString.decodeBase64(s));
		((List) (arraylist)).add(((Object) (certificatefactory.generateCertificate(buffer.inputStream()))));
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_33;
_L1:
		return ((List) (arraylist));
	}

	private static int readInt(BufferedSource bufferedsource)
		throws IOException
	{
		long l;
		StringBuilder stringbuilder;
		try
		{
			l = bufferedsource.readDecimalLong();
	//    0    0:aload_0         
	//    1    1:invokeinterface #299 <Method long BufferedSource.readDecimalLong()>
	//    2    6:lstore_1        
			bufferedsource = ((BufferedSource) (bufferedsource.readUtf8LineStrict()));
	//    3    7:aload_0         
	//    4    8:invokeinterface #136 <Method String BufferedSource.readUtf8LineStrict()>
	//    5   13:astore_0        
		}
	//*   6   14:lload_1         
	//*   7   15:lconst_0        
	//*   8   16:lcmp            
	//*   9   17:iflt            38
	//*  10   20:lload_1         
	//*  11   21:ldc2w           #300 <Long 0x7fffffffL>
	//*  12   24:lcmp            
	//*  13   25:ifgt            38
	//*  14   28:aload_0         
	//*  15   29:invokevirtual   #304 <Method boolean String.isEmpty()>
	//*  16   32:ifeq            38
	//*  17   35:lload_1         
	//*  18   36:l2i             
	//*  19   37:ireturn         
	//*  20   38:new             #27  <Class StringBuilder>
	//*  21   41:dup             
	//*  22   42:invokespecial   #30  <Method void StringBuilder()>
	//*  23   45:astore_3        
	//*  24   46:aload_3         
	//*  25   47:ldc2            #306 <String "expected an int but was \"">
	//*  26   50:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//*  27   53:pop             
	//*  28   54:aload_3         
	//*  29   55:lload_1         
	//*  30   56:invokevirtual   #309 <Method StringBuilder StringBuilder.append(long)>
	//*  31   59:pop             
	//*  32   60:aload_3         
	//*  33   61:aload_0         
	//*  34   62:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//*  35   65:pop             
	//*  36   66:aload_3         
	//*  37   67:ldc1            #208 <String "\"">
	//*  38   69:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//*  39   72:pop             
	//*  40   73:new             #125 <Class IOException>
	//*  41   76:dup             
	//*  42   77:aload_3         
	//*  43   78:invokevirtual   #49  <Method String StringBuilder.toString()>
	//*  44   81:invokespecial   #211 <Method void IOException(String)>
	//*  45   84:athrow          
		// Misplaced declaration of an exception variable
		catch(BufferedSource bufferedsource)
	//*  46   85:astore_0        
		{
			throw new IOException(((NumberFormatException) (bufferedsource)).getMessage());
	//   47   86:new             #125 <Class IOException>
	//   48   89:dup             
	//   49   90:aload_0         
	//   50   91:invokevirtual   #310 <Method String NumberFormatException.getMessage()>
	//   51   94:invokespecial   #211 <Method void IOException(String)>
	//   52   97:athrow          
		}
		if(l < 0L || l > 0x7fffffffL)
			break MISSING_BLOCK_LABEL_38;
		if(((String) (bufferedsource)).isEmpty())
			return (int)l;
		stringbuilder = new StringBuilder();
		stringbuilder.append("expected an int but was \"");
		stringbuilder.append(l);
		stringbuilder.append(((String) (bufferedsource)));
		stringbuilder.append("\"");
		throw new IOException(stringbuilder.toString());
	}

	private void writeCertList(BufferedSink bufferedsink, List list)
		throws IOException
	{
		int i;
		int j;
		try
		{
			bufferedsink.writeDecimalLong(list.size()).writeByte(10);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #317 <Method int List.size()>
	//    3    7:i2l             
	//    4    8:invokeinterface #323 <Method BufferedSink BufferedSink.writeDecimalLong(long)>
	//    5   13:bipush          10
	//    6   15:invokeinterface #327 <Method BufferedSink BufferedSink.writeByte(int)>
	//    7   20:pop             
		}
	//*   8   21:iconst_0        
	//*   9   22:istore_3        
	//*  10   23:aload_2         
	//*  11   24:invokeinterface #317 <Method int List.size()>
	//*  12   29:istore          4
	//*  13   31:iload_3         
	//*  14   32:iload           4
	//*  15   34:icmpge          77
	//*  16   37:aload_1         
	//*  17   38:aload_2         
	//*  18   39:iload_3         
	//*  19   40:invokeinterface #330 <Method Object List.get(int)>
	//*  20   45:checkcast       #332 <Class Certificate>
	//*  21   48:invokevirtual   #336 <Method byte[] Certificate.getEncoded()>
	//*  22   51:invokestatic    #340 <Method ByteString ByteString.of(byte[])>
	//*  23   54:invokevirtual   #343 <Method String ByteString.base64()>
	//*  24   57:invokeinterface #347 <Method BufferedSink BufferedSink.writeUtf8(String)>
	//*  25   62:bipush          10
	//*  26   64:invokeinterface #327 <Method BufferedSink BufferedSink.writeByte(int)>
	//*  27   69:pop             
	//*  28   70:iload_3         
	//*  29   71:iconst_1        
	//*  30   72:iadd            
	//*  31   73:istore_3        
	//*  32   74:goto            31
	//*  33   77:return          
		// Misplaced declaration of an exception variable
		catch(BufferedSink bufferedsink)
	//*  34   78:astore_1        
		{
			throw new IOException(((CertificateEncodingException) (bufferedsink)).getMessage());
	//   35   79:new             #125 <Class IOException>
	//   36   82:dup             
	//   37   83:aload_1         
	//   38   84:invokevirtual   #348 <Method String CertificateEncodingException.getMessage()>
	//   39   87:invokespecial   #211 <Method void IOException(String)>
	//   40   90:athrow          
		}
		i = 0;
		j = list.size();
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
		bufferedsink.writeUtf8(ByteString.of(((Certificate)list.get(i)).getEncoded()).base64()).writeByte(10);
		i++;
		if(true) goto _L2; else goto _L1
_L1:
	}

	Response response()
	{
		Object obj = ((Object) ((new okhttp3.Request.Builder()).url(url).method(requestMethod, RequestBody.create(MediaType.parse("application/json; charset=utf-8"), "")).headers(varyHeaders)));
	//    0    0:new             #353 <Class okhttp3.Request$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #354 <Method void okhttp3.Request$Builder()>
	//    3    7:aload_0         
	//    4    8:getfield        #74  <Field String url>
	//    5   11:invokevirtual   #357 <Method okhttp3.Request$Builder okhttp3.Request$Builder.url(String)>
	//    6   14:aload_0         
	//    7   15:getfield        #86  <Field String requestMethod>
	//    8   18:ldc2            #359 <String "application/json; charset=utf-8">
	//    9   21:invokestatic    #364 <Method MediaType MediaType.parse(String)>
	//   10   24:ldc1            #240 <String "">
	//   11   26:invokestatic    #370 <Method RequestBody RequestBody.create(MediaType, String)>
	//   12   29:invokevirtual   #373 <Method okhttp3.Request$Builder okhttp3.Request$Builder.method(String, RequestBody)>
	//   13   32:aload_0         
	//   14   33:getfield        #81  <Field Headers varyHeaders>
	//   15   36:invokevirtual   #376 <Method okhttp3.Request$Builder okhttp3.Request$Builder.headers(Headers)>
	//   16   39:astore_1        
		if(!(obj instanceof okhttp3.Request.Builder))
	//*  17   40:aload_1         
	//*  18   41:instanceof      #353 <Class okhttp3.Request$Builder>
	//*  19   44:ifne            55
			obj = ((Object) (((okhttp3.Request.Builder) (obj)).build()));
	//   20   47:aload_1         
	//   21   48:invokevirtual   #378 <Method Request okhttp3.Request$Builder.build()>
	//   22   51:astore_1        
		else
	//*  23   52:goto            63
			obj = ((Object) (OkHttp3Instrumentation.build((okhttp3.Request.Builder)obj)));
	//   24   55:aload_1         
	//   25   56:checkcast       #353 <Class okhttp3.Request$Builder>
	//   26   59:invokestatic    #383 <Method Request OkHttp3Instrumentation.build(okhttp3.Request$Builder)>
	//   27   62:astore_1        
		return (new okhttp3.Response.Builder()).request(((Request) (obj))).protocol(protocol).code(code).message(message).headers(responseHeaders).handshake(handshake).sentRequestAtMillis(sentRequestMillis).receivedResponseAtMillis(receivedResponseMillis).build();
	//   28   63:new             #385 <Class okhttp3.Response$Builder>
	//   29   66:dup             
	//   30   67:invokespecial   #386 <Method void okhttp3.Response$Builder()>
	//   31   70:aload_1         
	//   32   71:invokevirtual   #389 <Method okhttp3.Response$Builder okhttp3.Response$Builder.request(Request)>
	//   33   74:aload_0         
	//   34   75:getfield        #91  <Field Protocol protocol>
	//   35   78:invokevirtual   #392 <Method okhttp3.Response$Builder okhttp3.Response$Builder.protocol(Protocol)>
	//   36   81:aload_0         
	//   37   82:getfield        #96  <Field int code>
	//   38   85:invokevirtual   #395 <Method okhttp3.Response$Builder okhttp3.Response$Builder.code(int)>
	//   39   88:aload_0         
	//   40   89:getfield        #100 <Field String message>
	//   41   92:invokevirtual   #398 <Method okhttp3.Response$Builder okhttp3.Response$Builder.message(String)>
	//   42   95:aload_0         
	//   43   96:getfield        #106 <Field Headers responseHeaders>
	//   44   99:invokevirtual   #401 <Method okhttp3.Response$Builder okhttp3.Response$Builder.headers(Headers)>
	//   45  102:aload_0         
	//   46  103:getfield        #111 <Field Handshake handshake>
	//   47  106:invokevirtual   #404 <Method okhttp3.Response$Builder okhttp3.Response$Builder.handshake(Handshake)>
	//   48  109:aload_0         
	//   49  110:getfield        #117 <Field long sentRequestMillis>
	//   50  113:invokevirtual   #407 <Method okhttp3.Response$Builder okhttp3.Response$Builder.sentRequestAtMillis(long)>
	//   51  116:aload_0         
	//   52  117:getfield        #122 <Field long receivedResponseMillis>
	//   53  120:invokevirtual   #409 <Method okhttp3.Response$Builder okhttp3.Response$Builder.receivedResponseAtMillis(long)>
	//   54  123:invokevirtual   #411 <Method Response okhttp3.Response$Builder.build()>
	//   55  126:areturn         
	}

	void writeTo(Sink sink)
		throws IOException
	{
		sink = ((Sink) (Okio.buffer(sink)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #416 <Method BufferedSink Okio.buffer(Sink)>
	//    2    4:astore_1        
		((BufferedSink) (sink)).writeUtf8(url).writeByte(10);
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #74  <Field String url>
	//    6   10:invokeinterface #347 <Method BufferedSink BufferedSink.writeUtf8(String)>
	//    7   15:bipush          10
	//    8   17:invokeinterface #327 <Method BufferedSink BufferedSink.writeByte(int)>
	//    9   22:pop             
		((BufferedSink) (sink)).writeUtf8(requestMethod).writeByte(10);
	//   10   23:aload_1         
	//   11   24:aload_0         
	//   12   25:getfield        #86  <Field String requestMethod>
	//   13   28:invokeinterface #347 <Method BufferedSink BufferedSink.writeUtf8(String)>
	//   14   33:bipush          10
	//   15   35:invokeinterface #327 <Method BufferedSink BufferedSink.writeByte(int)>
	//   16   40:pop             
		((BufferedSink) (sink)).writeDecimalLong(varyHeaders.size()).writeByte(10);
	//   17   41:aload_1         
	//   18   42:aload_0         
	//   19   43:getfield        #81  <Field Headers varyHeaders>
	//   20   46:invokevirtual   #419 <Method int Headers.size()>
	//   21   49:i2l             
	//   22   50:invokeinterface #323 <Method BufferedSink BufferedSink.writeDecimalLong(long)>
	//   23   55:bipush          10
	//   24   57:invokeinterface #327 <Method BufferedSink BufferedSink.writeByte(int)>
	//   25   62:pop             
		int k = varyHeaders.size();
	//   26   63:aload_0         
	//   27   64:getfield        #81  <Field Headers varyHeaders>
	//   28   67:invokevirtual   #419 <Method int Headers.size()>
	//   29   70:istore          4
		boolean flag = false;
	//   30   72:iconst_0        
	//   31   73:istore_3        
		for(int i = 0; i < k; i++)
	//*  32   74:iconst_0        
	//*  33   75:istore_2        
	//*  34   76:iload_2         
	//*  35   77:iload           4
	//*  36   79:icmpge          132
			((BufferedSink) (sink)).writeUtf8(varyHeaders.name(i)).writeUtf8(": ").writeUtf8(varyHeaders.value(i)).writeByte(10);
	//   37   82:aload_1         
	//   38   83:aload_0         
	//   39   84:getfield        #81  <Field Headers varyHeaders>
	//   40   87:iload_2         
	//   41   88:invokevirtual   #422 <Method String Headers.name(int)>
	//   42   91:invokeinterface #347 <Method BufferedSink BufferedSink.writeUtf8(String)>
	//   43   96:ldc2            #424 <String ": ">
	//   44   99:invokeinterface #347 <Method BufferedSink BufferedSink.writeUtf8(String)>
	//   45  104:aload_0         
	//   46  105:getfield        #81  <Field Headers varyHeaders>
	//   47  108:iload_2         
	//   48  109:invokevirtual   #427 <Method String Headers.value(int)>
	//   49  112:invokeinterface #347 <Method BufferedSink BufferedSink.writeUtf8(String)>
	//   50  117:bipush          10
	//   51  119:invokeinterface #327 <Method BufferedSink BufferedSink.writeByte(int)>
	//   52  124:pop             

	//   53  125:iload_2         
	//   54  126:iconst_1        
	//   55  127:iadd            
	//   56  128:istore_2        
	//*  57  129:goto            76
		((BufferedSink) (sink)).writeUtf8((new StatusLine(protocol, code, message)).toString()).writeByte(10);
	//   58  132:aload_1         
	//   59  133:new             #152 <Class StatusLine>
	//   60  136:dup             
	//   61  137:aload_0         
	//   62  138:getfield        #91  <Field Protocol protocol>
	//   63  141:aload_0         
	//   64  142:getfield        #96  <Field int code>
	//   65  145:aload_0         
	//   66  146:getfield        #100 <Field String message>
	//   67  149:invokespecial   #430 <Method void StatusLine(Protocol, int, String)>
	//   68  152:invokevirtual   #431 <Method String StatusLine.toString()>
	//   69  155:invokeinterface #347 <Method BufferedSink BufferedSink.writeUtf8(String)>
	//   70  160:bipush          10
	//   71  162:invokeinterface #327 <Method BufferedSink BufferedSink.writeByte(int)>
	//   72  167:pop             
		((BufferedSink) (sink)).writeDecimalLong(responseHeaders.size() + 2).writeByte(10);
	//   73  168:aload_1         
	//   74  169:aload_0         
	//   75  170:getfield        #106 <Field Headers responseHeaders>
	//   76  173:invokevirtual   #419 <Method int Headers.size()>
	//   77  176:iconst_2        
	//   78  177:iadd            
	//   79  178:i2l             
	//   80  179:invokeinterface #323 <Method BufferedSink BufferedSink.writeDecimalLong(long)>
	//   81  184:bipush          10
	//   82  186:invokeinterface #327 <Method BufferedSink BufferedSink.writeByte(int)>
	//   83  191:pop             
		k = responseHeaders.size();
	//   84  192:aload_0         
	//   85  193:getfield        #106 <Field Headers responseHeaders>
	//   86  196:invokevirtual   #419 <Method int Headers.size()>
	//   87  199:istore          4
		for(int j = ((int) (flag)); j < k; j++)
	//*  88  201:iload_3         
	//*  89  202:istore_2        
	//*  90  203:iload_2         
	//*  91  204:iload           4
	//*  92  206:icmpge          259
			((BufferedSink) (sink)).writeUtf8(responseHeaders.name(j)).writeUtf8(": ").writeUtf8(responseHeaders.value(j)).writeByte(10);
	//   93  209:aload_1         
	//   94  210:aload_0         
	//   95  211:getfield        #106 <Field Headers responseHeaders>
	//   96  214:iload_2         
	//   97  215:invokevirtual   #422 <Method String Headers.name(int)>
	//   98  218:invokeinterface #347 <Method BufferedSink BufferedSink.writeUtf8(String)>
	//   99  223:ldc2            #424 <String ": ">
	//  100  226:invokeinterface #347 <Method BufferedSink BufferedSink.writeUtf8(String)>
	//  101  231:aload_0         
	//  102  232:getfield        #106 <Field Headers responseHeaders>
	//  103  235:iload_2         
	//  104  236:invokevirtual   #427 <Method String Headers.value(int)>
	//  105  239:invokeinterface #347 <Method BufferedSink BufferedSink.writeUtf8(String)>
	//  106  244:bipush          10
	//  107  246:invokeinterface #327 <Method BufferedSink BufferedSink.writeByte(int)>
	//  108  251:pop             

	//  109  252:iload_2         
	//  110  253:iconst_1        
	//  111  254:iadd            
	//  112  255:istore_2        
	//* 113  256:goto            203
		((BufferedSink) (sink)).writeUtf8(SENT_MILLIS).writeUtf8(": ").writeDecimalLong(sentRequestMillis).writeByte(10);
	//  114  259:aload_1         
	//  115  260:getstatic       #51  <Field String SENT_MILLIS>
	//  116  263:invokeinterface #347 <Method BufferedSink BufferedSink.writeUtf8(String)>
	//  117  268:ldc2            #424 <String ": ">
	//  118  271:invokeinterface #347 <Method BufferedSink BufferedSink.writeUtf8(String)>
	//  119  276:aload_0         
	//  120  277:getfield        #117 <Field long sentRequestMillis>
	//  121  280:invokeinterface #323 <Method BufferedSink BufferedSink.writeDecimalLong(long)>
	//  122  285:bipush          10
	//  123  287:invokeinterface #327 <Method BufferedSink BufferedSink.writeByte(int)>
	//  124  292:pop             
		((BufferedSink) (sink)).writeUtf8(RECEIVED_MILLIS).writeUtf8(": ").writeDecimalLong(receivedResponseMillis).writeByte(10);
	//  125  293:aload_1         
	//  126  294:getstatic       #55  <Field String RECEIVED_MILLIS>
	//  127  297:invokeinterface #347 <Method BufferedSink BufferedSink.writeUtf8(String)>
	//  128  302:ldc2            #424 <String ": ">
	//  129  305:invokeinterface #347 <Method BufferedSink BufferedSink.writeUtf8(String)>
	//  130  310:aload_0         
	//  131  311:getfield        #122 <Field long receivedResponseMillis>
	//  132  314:invokeinterface #323 <Method BufferedSink BufferedSink.writeDecimalLong(long)>
	//  133  319:bipush          10
	//  134  321:invokeinterface #327 <Method BufferedSink BufferedSink.writeByte(int)>
	//  135  326:pop             
		if(isHttps())
	//* 136  327:aload_0         
	//* 137  328:invokespecial   #176 <Method boolean isHttps()>
	//* 138  331:ifeq            425
		{
			((BufferedSink) (sink)).writeByte(10);
	//  139  334:aload_1         
	//  140  335:bipush          10
	//  141  337:invokeinterface #327 <Method BufferedSink BufferedSink.writeByte(int)>
	//  142  342:pop             
			((BufferedSink) (sink)).writeUtf8(handshake.cipherSuite().javaName()).writeByte(10);
	//  143  343:aload_1         
	//  144  344:aload_0         
	//  145  345:getfield        #111 <Field Handshake handshake>
	//  146  348:invokevirtual   #435 <Method CipherSuite Handshake.cipherSuite()>
	//  147  351:invokevirtual   #438 <Method String CipherSuite.javaName()>
	//  148  354:invokeinterface #347 <Method BufferedSink BufferedSink.writeUtf8(String)>
	//  149  359:bipush          10
	//  150  361:invokeinterface #327 <Method BufferedSink BufferedSink.writeByte(int)>
	//  151  366:pop             
			writeCertList(((BufferedSink) (sink)), handshake.peerCertificates());
	//  152  367:aload_0         
	//  153  368:aload_1         
	//  154  369:aload_0         
	//  155  370:getfield        #111 <Field Handshake handshake>
	//  156  373:invokevirtual   #441 <Method List Handshake.peerCertificates()>
	//  157  376:invokespecial   #443 <Method void writeCertList(BufferedSink, List)>
			writeCertList(((BufferedSink) (sink)), handshake.localCertificates());
	//  158  379:aload_0         
	//  159  380:aload_1         
	//  160  381:aload_0         
	//  161  382:getfield        #111 <Field Handshake handshake>
	//  162  385:invokevirtual   #446 <Method List Handshake.localCertificates()>
	//  163  388:invokespecial   #443 <Method void writeCertList(BufferedSink, List)>
			if(handshake.tlsVersion() != null)
	//* 164  391:aload_0         
	//* 165  392:getfield        #111 <Field Handshake handshake>
	//* 166  395:invokevirtual   #450 <Method TlsVersion Handshake.tlsVersion()>
	//* 167  398:ifnull          425
				((BufferedSink) (sink)).writeUtf8(handshake.tlsVersion().javaName()).writeByte(10);
	//  168  401:aload_1         
	//  169  402:aload_0         
	//  170  403:getfield        #111 <Field Handshake handshake>
	//  171  406:invokevirtual   #450 <Method TlsVersion Handshake.tlsVersion()>
	//  172  409:invokevirtual   #451 <Method String TlsVersion.javaName()>
	//  173  412:invokeinterface #347 <Method BufferedSink BufferedSink.writeUtf8(String)>
	//  174  417:bipush          10
	//  175  419:invokeinterface #327 <Method BufferedSink BufferedSink.writeByte(int)>
	//  176  424:pop             
		}
		((BufferedSink) (sink)).close();
	//  177  425:aload_1         
	//  178  426:invokeinterface #452 <Method void BufferedSink.close()>
	//  179  431:return          
	}

	private static final String RECEIVED_MILLIS;
	private static final String SENT_MILLIS;
	private final int code;
	private final Handshake handshake;
	private final String message;
	private final Protocol protocol;
	private final long receivedResponseMillis;
	private final String requestMethod;
	private final Headers responseHeaders;
	private final long sentRequestMillis;
	private final String url;
	private final Headers varyHeaders;

	static 
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #27  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void StringBuilder()>
	//    3    7:astore_0        
		stringbuilder.append(Platform.get().getPrefix());
	//    4    8:aload_0         
	//    5    9:invokestatic    #36  <Method Platform Platform.get()>
	//    6   12:invokevirtual   #40  <Method String Platform.getPrefix()>
	//    7   15:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		stringbuilder.append("-Sent-Millis");
	//    9   19:aload_0         
	//   10   20:ldc1            #46  <String "-Sent-Millis">
	//   11   22:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
		SENT_MILLIS = stringbuilder.toString();
	//   13   26:aload_0         
	//   14   27:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   15   30:putstatic       #51  <Field String SENT_MILLIS>
		stringbuilder = new StringBuilder();
	//   16   33:new             #27  <Class StringBuilder>
	//   17   36:dup             
	//   18   37:invokespecial   #30  <Method void StringBuilder()>
	//   19   40:astore_0        
		stringbuilder.append(Platform.get().getPrefix());
	//   20   41:aload_0         
	//   21   42:invokestatic    #36  <Method Platform Platform.get()>
	//   22   45:invokevirtual   #40  <Method String Platform.getPrefix()>
	//   23   48:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   24   51:pop             
		stringbuilder.append("-Received-Millis");
	//   25   52:aload_0         
	//   26   53:ldc1            #53  <String "-Received-Millis">
	//   27   55:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   28   58:pop             
		RECEIVED_MILLIS = stringbuilder.toString();
	//   29   59:aload_0         
	//   30   60:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   31   63:putstatic       #55  <Field String RECEIVED_MILLIS>
	//*  32   66:return          
	}
}
