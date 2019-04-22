// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a.e;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.interactivemedia.v3.a.f.*;
import com.newrelic.agent.android.instrumentation.URLConnectionInstrumentation;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.ads.interactivemedia.v3.a.e:
//			k, m, f

public class h
	implements k
{

	public h(String s, n n1, m m1, int i1, int j1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void Object()>
		g = com.google.ads.interactivemedia.v3.a.f.b.a(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #67  <Method String b.a(String)>
	//    5    9:putfield        #69  <Field String g>
		h = n1;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #71  <Field n h>
		j = m1;
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:putfield        #73  <Field m j>
	//   12   22:aload_0         
	//   13   23:new             #75  <Class HashMap>
	//   14   26:dup             
	//   15   27:invokespecial   #76  <Method void HashMap()>
	//   16   30:putfield        #78  <Field HashMap i>
		e = i1;
	//   17   33:aload_0         
	//   18   34:iload           4
	//   19   36:putfield        #80  <Field int e>
		f = j1;
	//   20   39:aload_0         
	//   21   40:iload           5
	//   22   42:putfield        #82  <Field int f>
		d = flag;
	//   23   45:aload_0         
	//   24   46:iload           6
	//   25   48:putfield        #84  <Field boolean d>
	//   26   51:return          
	}

	private static long a(HttpURLConnection httpurlconnection)
	{
		String s = httpurlconnection.getHeaderField("Content-Length");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "Content-Length">
	//    2    3:invokevirtual   #96  <Method String HttpURLConnection.getHeaderField(String)>
	//    3    6:astore          5
		if(TextUtils.isEmpty(((CharSequence) (s)))) goto _L2; else goto _L1
	//    4    8:aload           5
	//    5   10:invokestatic    #102 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    6   13:ifne            80
_L1:
		long l1 = Long.parseLong(s);
	//    7   16:aload           5
	//    8   18:invokestatic    #108 <Method long Long.parseLong(String)>
	//    9   21:lstore_1        
		  goto _L3
	//*  10   22:goto            84
_L8:
		StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(((Object) (s))).length() + 28);
	//   11   25:new             #110 <Class StringBuilder>
	//   12   28:dup             
	//   13   29:aload           5
	//   14   31:invokestatic    #116 <Method String String.valueOf(Object)>
	//   15   34:invokevirtual   #120 <Method int String.length()>
	//   16   37:bipush          28
	//   17   39:iadd            
	//   18   40:invokespecial   #123 <Method void StringBuilder(int)>
	//   19   43:astore          6
		stringbuilder1.append("Unexpected Content-Length [");
	//   20   45:aload           6
	//   21   47:ldc1            #125 <String "Unexpected Content-Length [">
	//   22   49:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   23   52:pop             
		stringbuilder1.append(s);
	//   24   53:aload           6
	//   25   55:aload           5
	//   26   57:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   27   60:pop             
		stringbuilder1.append("]");
	//   28   61:aload           6
	//   29   63:ldc1            #131 <String "]">
	//   30   65:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   31   68:pop             
		Log.e("DefaultHttpDataSource", stringbuilder1.toString());
	//   32   69:ldc1            #133 <String "DefaultHttpDataSource">
	//   33   71:aload           6
	//   34   73:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   35   76:invokestatic    #142 <Method int Log.e(String, String)>
	//   36   79:pop             
_L2:
		l1 = -1L;
	//   37   80:ldc2w           #143 <Long -1L>
	//   38   83:lstore_1        
_L3:
		httpurlconnection = ((HttpURLConnection) (httpurlconnection.getHeaderField("Content-Range")));
	//   39   84:aload_0         
	//   40   85:ldc1            #146 <String "Content-Range">
	//   41   87:invokevirtual   #96  <Method String HttpURLConnection.getHeaderField(String)>
	//   42   90:astore_0        
		if(TextUtils.isEmpty(((CharSequence) (httpurlconnection)))) goto _L5; else goto _L4
	//   43   91:aload_0         
	//   44   92:invokestatic    #102 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   45   95:ifne            290
_L4:
		Matcher matcher = b.matcher(((CharSequence) (httpurlconnection)));
	//   46   98:getstatic       #51  <Field Pattern b>
	//   47  101:aload_0         
	//   48  102:invokevirtual   #150 <Method Matcher Pattern.matcher(CharSequence)>
	//   49  105:astore          6
		if(!matcher.find()) goto _L5; else goto _L6
	//   50  107:aload           6
	//   51  109:invokevirtual   #156 <Method boolean Matcher.find()>
	//   52  112:ifeq            290
_L6:
		long l2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1L;
	//   53  115:aload           6
	//   54  117:iconst_2        
	//   55  118:invokevirtual   #160 <Method String Matcher.group(int)>
	//   56  121:invokestatic    #108 <Method long Long.parseLong(String)>
	//   57  124:aload           6
	//   58  126:iconst_1        
	//   59  127:invokevirtual   #160 <Method String Matcher.group(int)>
	//   60  130:invokestatic    #108 <Method long Long.parseLong(String)>
	//   61  133:lsub            
	//   62  134:lconst_1        
	//   63  135:ladd            
	//   64  136:lstore_3        
		if(l1 < 0L)
	//*  65  137:lload_1         
	//*  66  138:lconst_0        
	//*  67  139:lcmp            
	//*  68  140:ifge            145
			return l2;
	//   69  143:lload_3         
	//   70  144:lreturn         
		if(l1 == l2) goto _L5; else goto _L7
	//   71  145:lload_1         
	//   72  146:lload_3         
	//   73  147:lcmp            
	//   74  148:ifeq            290
_L7:
		StringBuilder stringbuilder2 = new StringBuilder(String.valueOf(((Object) (s))).length() + 26 + String.valueOf(((Object) (httpurlconnection))).length());
	//   75  151:new             #110 <Class StringBuilder>
	//   76  154:dup             
	//   77  155:aload           5
	//   78  157:invokestatic    #116 <Method String String.valueOf(Object)>
	//   79  160:invokevirtual   #120 <Method int String.length()>
	//   80  163:bipush          26
	//   81  165:iadd            
	//   82  166:aload_0         
	//   83  167:invokestatic    #116 <Method String String.valueOf(Object)>
	//   84  170:invokevirtual   #120 <Method int String.length()>
	//   85  173:iadd            
	//   86  174:invokespecial   #123 <Method void StringBuilder(int)>
	//   87  177:astore          6
		stringbuilder2.append("Inconsistent headers [");
	//   88  179:aload           6
	//   89  181:ldc1            #162 <String "Inconsistent headers [">
	//   90  183:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   91  186:pop             
		stringbuilder2.append(s);
	//   92  187:aload           6
	//   93  189:aload           5
	//   94  191:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   95  194:pop             
		stringbuilder2.append("] [");
	//   96  195:aload           6
	//   97  197:ldc1            #164 <String "] [">
	//   98  199:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   99  202:pop             
		stringbuilder2.append(((String) (httpurlconnection)));
	//  100  203:aload           6
	//  101  205:aload_0         
	//  102  206:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  103  209:pop             
		stringbuilder2.append("]");
	//  104  210:aload           6
	//  105  212:ldc1            #131 <String "]">
	//  106  214:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  107  217:pop             
		Log.w("DefaultHttpDataSource", stringbuilder2.toString());
	//  108  218:ldc1            #133 <String "DefaultHttpDataSource">
	//  109  220:aload           6
	//  110  222:invokevirtual   #137 <Method String StringBuilder.toString()>
	//  111  225:invokestatic    #167 <Method int Log.w(String, String)>
	//  112  228:pop             
		l2 = Math.max(l1, l2);
	//  113  229:lload_1         
	//  114  230:lload_3         
	//  115  231:invokestatic    #173 <Method long Math.max(long, long)>
	//  116  234:lstore_3        
		return l2;
	//  117  235:lload_3         
	//  118  236:lreturn         
_L9:
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (httpurlconnection))).length() + 27);
	//  119  237:new             #110 <Class StringBuilder>
	//  120  240:dup             
	//  121  241:aload_0         
	//  122  242:invokestatic    #116 <Method String String.valueOf(Object)>
	//  123  245:invokevirtual   #120 <Method int String.length()>
	//  124  248:bipush          27
	//  125  250:iadd            
	//  126  251:invokespecial   #123 <Method void StringBuilder(int)>
	//  127  254:astore          5
		stringbuilder.append("Unexpected Content-Range [");
	//  128  256:aload           5
	//  129  258:ldc1            #175 <String "Unexpected Content-Range [">
	//  130  260:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  131  263:pop             
		stringbuilder.append(((String) (httpurlconnection)));
	//  132  264:aload           5
	//  133  266:aload_0         
	//  134  267:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  135  270:pop             
		stringbuilder.append("]");
	//  136  271:aload           5
	//  137  273:ldc1            #131 <String "]">
	//  138  275:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  139  278:pop             
		Log.e("DefaultHttpDataSource", stringbuilder.toString());
	//  140  279:ldc1            #133 <String "DefaultHttpDataSource">
	//  141  281:aload           5
	//  142  283:invokevirtual   #137 <Method String StringBuilder.toString()>
	//  143  286:invokestatic    #142 <Method int Log.e(String, String)>
	//  144  289:pop             
_L5:
		return l1;
	//  145  290:lload_1         
	//  146  291:lreturn         
		NumberFormatException numberformatexception1;
		numberformatexception1;
	//  147  292:astore          6
		  goto _L8
	//* 148  294:goto            25
		NumberFormatException numberformatexception;
		numberformatexception;
	//  149  297:astore          5
		  goto _L9
	//* 150  299:goto            237
	}

	private HttpURLConnection a(URL url, byte abyte0[], long l1, long l2, boolean flag, 
			boolean flag1)
		throws IOException
	{
		HttpURLConnection httpurlconnection;
		httpurlconnection = (HttpURLConnection)URLConnectionInstrumentation.openConnection(url.openConnection());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #184 <Method java.net.URLConnection URL.openConnection()>
	//    2    4:invokestatic    #189 <Method java.net.URLConnection URLConnectionInstrumentation.openConnection(java.net.URLConnection)>
	//    3    7:checkcast       #93  <Class HttpURLConnection>
	//    4   10:astore          10
		httpurlconnection.setConnectTimeout(e);
	//    5   12:aload           10
	//    6   14:aload_0         
	//    7   15:getfield        #80  <Field int e>
	//    8   18:invokevirtual   #192 <Method void HttpURLConnection.setConnectTimeout(int)>
		httpurlconnection.setReadTimeout(f);
	//    9   21:aload           10
	//   10   23:aload_0         
	//   11   24:getfield        #82  <Field int f>
	//   12   27:invokevirtual   #195 <Method void HttpURLConnection.setReadTimeout(int)>
		url = ((URL) (i));
	//   13   30:aload_0         
	//   14   31:getfield        #78  <Field HashMap i>
	//   15   34:astore_1        
		url;
	//   16   35:aload_1         
		JVM INSTR monitorenter ;
	//   17   36:monitorenter    
		java.util.Map.Entry entry;
		for(Iterator iterator = i.entrySet().iterator(); iterator.hasNext(); httpurlconnection.setRequestProperty((String)entry.getKey(), (String)entry.getValue()))
	//*  18   37:aload_0         
	//*  19   38:getfield        #78  <Field HashMap i>
	//*  20   41:invokevirtual   #199 <Method Set HashMap.entrySet()>
	//*  21   44:invokeinterface #205 <Method Iterator Set.iterator()>
	//*  22   49:astore          9
	//*  23   51:aload           9
	//*  24   53:invokeinterface #210 <Method boolean Iterator.hasNext()>
	//*  25   58:ifeq            101
			entry = (java.util.Map.Entry)iterator.next();
	//   26   61:aload           9
	//   27   63:invokeinterface #214 <Method Object Iterator.next()>
	//   28   68:checkcast       #216 <Class java.util.Map$Entry>
	//   29   71:astore          11

	//   30   73:aload           10
	//   31   75:aload           11
	//   32   77:invokeinterface #219 <Method Object java.util.Map$Entry.getKey()>
	//   33   82:checkcast       #112 <Class String>
	//   34   85:aload           11
	//   35   87:invokeinterface #222 <Method Object java.util.Map$Entry.getValue()>
	//   36   92:checkcast       #112 <Class String>
	//   37   95:invokevirtual   #226 <Method void HttpURLConnection.setRequestProperty(String, String)>
	//*  38   98:goto            51
		url;
	//   39  101:aload_1         
		JVM INSTR monitorexit ;
	//   40  102:monitorexit     
		if(l1 != 0L || l2 != -1L)
	//*  41  103:lload_3         
	//*  42  104:lconst_0        
	//*  43  105:lcmp            
	//*  44  106:ifne            118
	//*  45  109:lload           5
	//*  46  111:ldc2w           #143 <Long -1L>
	//*  47  114:lcmp            
	//*  48  115:ifeq            224
		{
			url = ((URL) (new StringBuilder(27)));
	//   49  118:new             #110 <Class StringBuilder>
	//   50  121:dup             
	//   51  122:bipush          27
	//   52  124:invokespecial   #123 <Method void StringBuilder(int)>
	//   53  127:astore_1        
			((StringBuilder) (url)).append("bytes=");
	//   54  128:aload_1         
	//   55  129:ldc1            #228 <String "bytes=">
	//   56  131:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   57  134:pop             
			((StringBuilder) (url)).append(l1);
	//   58  135:aload_1         
	//   59  136:lload_3         
	//   60  137:invokevirtual   #231 <Method StringBuilder StringBuilder.append(long)>
	//   61  140:pop             
			((StringBuilder) (url)).append("-");
	//   62  141:aload_1         
	//   63  142:ldc1            #233 <String "-">
	//   64  144:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   65  147:pop             
			Object obj = ((Object) (((StringBuilder) (url)).toString()));
	//   66  148:aload_1         
	//   67  149:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   68  152:astore          9
			url = ((URL) (obj));
	//   69  154:aload           9
	//   70  156:astore_1        
			if(l2 != -1L)
	//*  71  157:lload           5
	//*  72  159:ldc2w           #143 <Long -1L>
	//*  73  162:lcmp            
	//*  74  163:ifeq            216
			{
				url = ((URL) (String.valueOf(obj)));
	//   75  166:aload           9
	//   76  168:invokestatic    #116 <Method String String.valueOf(Object)>
	//   77  171:astore_1        
				obj = ((Object) (new StringBuilder(String.valueOf(((Object) (url))).length() + 20)));
	//   78  172:new             #110 <Class StringBuilder>
	//   79  175:dup             
	//   80  176:aload_1         
	//   81  177:invokestatic    #116 <Method String String.valueOf(Object)>
	//   82  180:invokevirtual   #120 <Method int String.length()>
	//   83  183:bipush          20
	//   84  185:iadd            
	//   85  186:invokespecial   #123 <Method void StringBuilder(int)>
	//   86  189:astore          9
				((StringBuilder) (obj)).append(((String) (url)));
	//   87  191:aload           9
	//   88  193:aload_1         
	//   89  194:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   90  197:pop             
				((StringBuilder) (obj)).append((l1 + l2) - 1L);
	//   91  198:aload           9
	//   92  200:lload_3         
	//   93  201:lload           5
	//   94  203:ladd            
	//   95  204:lconst_1        
	//   96  205:lsub            
	//   97  206:invokevirtual   #231 <Method StringBuilder StringBuilder.append(long)>
	//   98  209:pop             
				url = ((URL) (((StringBuilder) (obj)).toString()));
	//   99  210:aload           9
	//  100  212:invokevirtual   #137 <Method String StringBuilder.toString()>
	//  101  215:astore_1        
			}
			httpurlconnection.setRequestProperty("Range", ((String) (url)));
	//  102  216:aload           10
	//  103  218:ldc1            #235 <String "Range">
	//  104  220:aload_1         
	//  105  221:invokevirtual   #226 <Method void HttpURLConnection.setRequestProperty(String, String)>
		}
		httpurlconnection.setRequestProperty("User-Agent", g);
	//  106  224:aload           10
	//  107  226:ldc1            #237 <String "User-Agent">
	//  108  228:aload_0         
	//  109  229:getfield        #69  <Field String g>
	//  110  232:invokevirtual   #226 <Method void HttpURLConnection.setRequestProperty(String, String)>
		if(!flag)
	//* 111  235:iload           7
	//* 112  237:ifne            249
			httpurlconnection.setRequestProperty("Accept-Encoding", "identity");
	//  113  240:aload           10
	//  114  242:ldc1            #239 <String "Accept-Encoding">
	//  115  244:ldc1            #241 <String "identity">
	//  116  246:invokevirtual   #226 <Method void HttpURLConnection.setRequestProperty(String, String)>
		httpurlconnection.setInstanceFollowRedirects(flag1);
	//  117  249:aload           10
	//  118  251:iload           8
	//  119  253:invokevirtual   #245 <Method void HttpURLConnection.setInstanceFollowRedirects(boolean)>
		if(abyte0 != null)
	//* 120  256:aload_2         
	//* 121  257:ifnull          266
			flag = true;
	//  122  260:iconst_1        
	//  123  261:istore          7
		else
	//* 124  263:goto            269
			flag = false;
	//  125  266:iconst_0        
	//  126  267:istore          7
		httpurlconnection.setDoOutput(flag);
	//  127  269:aload           10
	//  128  271:iload           7
	//  129  273:invokevirtual   #248 <Method void HttpURLConnection.setDoOutput(boolean)>
		if(abyte0 != null)
	//* 130  276:aload_2         
	//* 131  277:ifnull          330
		{
			httpurlconnection.setRequestMethod("POST");
	//  132  280:aload           10
	//  133  282:ldc1            #250 <String "POST">
	//  134  284:invokevirtual   #254 <Method void HttpURLConnection.setRequestMethod(String)>
			if(abyte0.length == 0)
	//* 135  287:aload_2         
	//* 136  288:arraylength     
	//* 137  289:ifne            300
			{
				httpurlconnection.connect();
	//  138  292:aload           10
	//  139  294:invokevirtual   #257 <Method void HttpURLConnection.connect()>
				return httpurlconnection;
	//  140  297:aload           10
	//  141  299:areturn         
			} else
			{
				httpurlconnection.setFixedLengthStreamingMode(abyte0.length);
	//  142  300:aload           10
	//  143  302:aload_2         
	//  144  303:arraylength     
	//  145  304:invokevirtual   #260 <Method void HttpURLConnection.setFixedLengthStreamingMode(int)>
				httpurlconnection.connect();
	//  146  307:aload           10
	//  147  309:invokevirtual   #257 <Method void HttpURLConnection.connect()>
				url = ((URL) (httpurlconnection.getOutputStream()));
	//  148  312:aload           10
	//  149  314:invokevirtual   #264 <Method OutputStream HttpURLConnection.getOutputStream()>
	//  150  317:astore_1        
				((OutputStream) (url)).write(abyte0);
	//  151  318:aload_1         
	//  152  319:aload_2         
	//  153  320:invokevirtual   #270 <Method void OutputStream.write(byte[])>
				((OutputStream) (url)).close();
	//  154  323:aload_1         
	//  155  324:invokevirtual   #273 <Method void OutputStream.close()>
				return httpurlconnection;
	//  156  327:aload           10
	//  157  329:areturn         
			}
		} else
		{
			httpurlconnection.connect();
	//  158  330:aload           10
	//  159  332:invokevirtual   #257 <Method void HttpURLConnection.connect()>
			return httpurlconnection;
	//  160  335:aload           10
	//  161  337:areturn         
		}
		abyte0;
	//  162  338:astore_2        
		url;
	//  163  339:aload_1         
		JVM INSTR monitorexit ;
	//  164  340:monitorexit     
		throw abyte0;
	//  165  341:aload_2         
	//  166  342:athrow          
	}

	private static URL a(URL url, String s)
		throws IOException
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          84
		{
			url = new URL(url, s);
	//    2    4:new             #180 <Class URL>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #278 <Method void URL(URL, String)>
	//    7   13:astore_0        
			s = url.getProtocol();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #281 <Method String URL.getProtocol()>
	//   10   18:astore_1        
			if(!"https".equals(((Object) (s))) && !"http".equals(((Object) (s))))
	//*  11   19:ldc2            #283 <String "https">
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #287 <Method boolean String.equals(Object)>
	//*  14   26:ifne            82
	//*  15   29:ldc2            #289 <String "http">
	//*  16   32:aload_1         
	//*  17   33:invokevirtual   #287 <Method boolean String.equals(Object)>
	//*  18   36:ifne            82
			{
				url = ((URL) (String.valueOf(((Object) (s)))));
	//   19   39:aload_1         
	//   20   40:invokestatic    #116 <Method String String.valueOf(Object)>
	//   21   43:astore_0        
				if(((String) (url)).length() != 0)
	//*  22   44:aload_0         
	//*  23   45:invokevirtual   #120 <Method int String.length()>
	//*  24   48:ifeq            62
					url = ((URL) ("Unsupported protocol redirect: ".concat(((String) (url)))));
	//   25   51:ldc2            #291 <String "Unsupported protocol redirect: ">
	//   26   54:aload_0         
	//   27   55:invokevirtual   #294 <Method String String.concat(String)>
	//   28   58:astore_0        
				else
	//*  29   59:goto            73
					url = ((URL) (new String("Unsupported protocol redirect: ")));
	//   30   62:new             #112 <Class String>
	//   31   65:dup             
	//   32   66:ldc2            #291 <String "Unsupported protocol redirect: ">
	//   33   69:invokespecial   #296 <Method void String(String)>
	//   34   72:astore_0        
				throw new ProtocolException(((String) (url)));
	//   35   73:new             #298 <Class ProtocolException>
	//   36   76:dup             
	//   37   77:aload_0         
	//   38   78:invokespecial   #299 <Method void ProtocolException(String)>
	//   39   81:athrow          
			} else
			{
				return url;
	//   40   82:aload_0         
	//   41   83:areturn         
			}
		} else
		{
			throw new ProtocolException("Null location redirect");
	//   42   84:new             #298 <Class ProtocolException>
	//   43   87:dup             
	//   44   88:ldc2            #301 <String "Null location redirect">
	//   45   91:invokespecial   #299 <Method void ProtocolException(String)>
	//   46   94:athrow          
		}
	}

	private int b(byte abyte0[], int i1, int j1)
		throws IOException
	{
		if(j1 == 0)
	//*   0    0:iload_3         
	//*   1    1:ifne            6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		i1 = m.read(abyte0, i1, j1);
	//    4    6:aload_0         
	//    5    7:getfield        #304 <Field InputStream m>
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:iload_3         
	//    9   13:invokevirtual   #309 <Method int InputStream.read(byte[], int, int)>
	//   10   16:istore_2        
		if(i1 == -1)
	//*  11   17:iload_2         
	//*  12   18:iconst_m1       
	//*  13   19:icmpne          59
		{
			long l1 = p;
	//   14   22:aload_0         
	//   15   23:getfield        #311 <Field long p>
	//   16   26:lstore          4
			if(l1 != -1L)
	//*  17   28:lload           4
	//*  18   30:ldc2w           #143 <Long -1L>
	//*  19   33:lcmp            
	//*  20   34:ifeq            57
			{
				if(l1 == r)
	//*  21   37:lload           4
	//*  22   39:aload_0         
	//*  23   40:getfield        #313 <Field long r>
	//*  24   43:lcmp            
	//*  25   44:ifne            49
					return -1;
	//   26   47:iconst_m1       
	//   27   48:ireturn         
				else
					throw new EOFException();
	//   28   49:new             #315 <Class EOFException>
	//   29   52:dup             
	//   30   53:invokespecial   #316 <Method void EOFException()>
	//   31   56:athrow          
			} else
			{
				return -1;
	//   32   57:iconst_m1       
	//   33   58:ireturn         
			}
		}
		r = r + (long)i1;
	//   34   59:aload_0         
	//   35   60:aload_0         
	//   36   61:getfield        #313 <Field long r>
	//   37   64:iload_2         
	//   38   65:i2l             
	//   39   66:ladd            
	//   40   67:putfield        #313 <Field long r>
		abyte0 = ((byte []) (j));
	//   41   70:aload_0         
	//   42   71:getfield        #73  <Field m j>
	//   43   74:astore_1        
		if(abyte0 != null)
	//*  44   75:aload_1         
	//*  45   76:ifnull          86
			((m) (abyte0)).a(i1);
	//   46   79:aload_1         
	//   47   80:iload_2         
	//   48   81:invokeinterface #320 <Method void m.a(int)>
		return i1;
	//   49   86:iload_2         
	//   50   87:ireturn         
	}

	private HttpURLConnection b(f f1)
		throws IOException
	{
		URL url = new URL(f1.a.toString());
	//    0    0:new             #180 <Class URL>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getfield        #326 <Field Uri f.a>
	//    4    8:invokevirtual   #329 <Method String Uri.toString()>
	//    5   11:invokespecial   #330 <Method void URL(String)>
	//    6   14:astore          10
		byte abyte1[] = f1.b;
	//    7   16:aload_1         
	//    8   17:getfield        #333 <Field byte[] com.google.ads.interactivemedia.v3.a.e.f.b>
	//    9   20:astore          11
		long l1 = f1.d;
	//   10   22:aload_1         
	//   11   23:getfield        #335 <Field long f.d>
	//   12   26:lstore          4
		long l2 = f1.e;
	//   13   28:aload_1         
	//   14   29:getfield        #337 <Field long f.e>
	//   15   32:lstore          6
		int j1 = f1.g;
	//   16   34:aload_1         
	//   17   35:getfield        #339 <Field int f.g>
	//   18   38:istore_3        
		int i1 = 0;
	//   19   39:iconst_0        
	//   20   40:istore_2        
		boolean flag;
		if((j1 & 1) != 0)
	//*  21   41:iload_3         
	//*  22   42:iconst_1        
	//*  23   43:iand            
	//*  24   44:ifeq            53
			flag = true;
	//   25   47:iconst_1        
	//   26   48:istore          8
		else
	//*  27   50:goto            56
			flag = false;
	//   28   53:iconst_0        
	//   29   54:istore          8
		f1 = ((f) (url));
	//   30   56:aload           10
	//   31   58:astore_1        
		byte abyte0[] = abyte1;
	//   32   59:aload           11
	//   33   61:astore          9
		if(!d)
	//*  34   63:aload_0         
	//*  35   64:getfield        #84  <Field boolean d>
	//*  36   67:ifne            86
			return a(url, abyte1, l1, l2, flag, true);
	//   37   70:aload_0         
	//   38   71:aload           10
	//   39   73:aload           11
	//   40   75:lload           4
	//   41   77:lload           6
	//   42   79:iload           8
	//   43   81:iconst_1        
	//   44   82:invokespecial   #341 <Method HttpURLConnection a(URL, byte[], long, long, boolean, boolean)>
	//   45   85:areturn         
		do
		{
			int k1 = i1 + 1;
	//   46   86:iload_2         
	//   47   87:iconst_1        
	//   48   88:iadd            
	//   49   89:istore_3        
			if(i1 <= 20)
	//*  50   90:iload_2         
	//*  51   91:bipush          20
	//*  52   93:icmpgt          201
			{
				HttpURLConnection httpurlconnection = a(((URL) (f1)), abyte0, l1, l2, flag, false);
	//   53   96:aload_0         
	//   54   97:aload_1         
	//   55   98:aload           9
	//   56  100:lload           4
	//   57  102:lload           6
	//   58  104:iload           8
	//   59  106:iconst_0        
	//   60  107:invokespecial   #341 <Method HttpURLConnection a(URL, byte[], long, long, boolean, boolean)>
	//   61  110:astore          10
				i1 = httpurlconnection.getResponseCode();
	//   62  112:aload           10
	//   63  114:invokevirtual   #344 <Method int HttpURLConnection.getResponseCode()>
	//   64  117:istore_2        
				if(i1 != 300 && i1 != 301 && i1 != 302 && i1 != 303 && (abyte0 != null || i1 != 307 && i1 != 308))
	//*  65  118:iload_2         
	//*  66  119:sipush          300
	//*  67  122:icmpeq          171
	//*  68  125:iload_2         
	//*  69  126:sipush          301
	//*  70  129:icmpeq          171
	//*  71  132:iload_2         
	//*  72  133:sipush          302
	//*  73  136:icmpeq          171
	//*  74  139:iload_2         
	//*  75  140:sipush          303
	//*  76  143:icmpeq          171
	//*  77  146:aload           9
	//*  78  148:ifnonnull       168
	//*  79  151:iload_2         
	//*  80  152:sipush          307
	//*  81  155:icmpeq          171
	//*  82  158:iload_2         
	//*  83  159:sipush          308
	//*  84  162:icmpne          168
	//*  85  165:goto            171
					return httpurlconnection;
	//   86  168:aload           10
	//   87  170:areturn         
				abyte0 = null;
	//   88  171:aconst_null     
	//   89  172:astore          9
				String s = httpurlconnection.getHeaderField("Location");
	//   90  174:aload           10
	//   91  176:ldc2            #346 <String "Location">
	//   92  179:invokevirtual   #96  <Method String HttpURLConnection.getHeaderField(String)>
	//   93  182:astore          11
				httpurlconnection.disconnect();
	//   94  184:aload           10
	//   95  186:invokevirtual   #349 <Method void HttpURLConnection.disconnect()>
				f1 = ((f) (a(((URL) (f1)), s)));
	//   96  189:aload_1         
	//   97  190:aload           11
	//   98  192:invokestatic    #351 <Method URL a(URL, String)>
	//   99  195:astore_1        
				i1 = k1;
	//  100  196:iload_3         
	//  101  197:istore_2        
			} else
	//* 102  198:goto            86
			{
				f1 = ((f) (new StringBuilder(31)));
	//  103  201:new             #110 <Class StringBuilder>
	//  104  204:dup             
	//  105  205:bipush          31
	//  106  207:invokespecial   #123 <Method void StringBuilder(int)>
	//  107  210:astore_1        
				((StringBuilder) (f1)).append("Too many redirects: ");
	//  108  211:aload_1         
	//  109  212:ldc2            #353 <String "Too many redirects: ">
	//  110  215:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  111  218:pop             
				((StringBuilder) (f1)).append(k1);
	//  112  219:aload_1         
	//  113  220:iload_3         
	//  114  221:invokevirtual   #356 <Method StringBuilder StringBuilder.append(int)>
	//  115  224:pop             
				throw new NoRouteToHostException(((StringBuilder) (f1)).toString());
	//  116  225:new             #358 <Class NoRouteToHostException>
	//  117  228:dup             
	//  118  229:aload_1         
	//  119  230:invokevirtual   #137 <Method String StringBuilder.toString()>
	//  120  233:invokespecial   #359 <Method void NoRouteToHostException(String)>
	//  121  236:athrow          
			}
		} while(true);
	}

	private void c()
		throws IOException
	{
		if(q == o)
	//*   0    0:aload_0         
	//*   1    1:getfield        #361 <Field long q>
	//*   2    4:aload_0         
	//*   3    5:getfield        #363 <Field long o>
	//*   4    8:lcmp            
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		byte abyte1[] = (byte[])c.getAndSet(((Object) (null)));
	//    7   13:getstatic       #58  <Field AtomicReference c>
	//    8   16:aconst_null     
	//    9   17:invokevirtual   #367 <Method Object AtomicReference.getAndSet(Object)>
	//   10   20:checkcast       #368 <Class byte[]>
	//   11   23:astore          7
		byte abyte0[] = abyte1;
	//   12   25:aload           7
	//   13   27:astore          6
		if(abyte1 == null)
	//*  14   29:aload           7
	//*  15   31:ifnonnull       41
			abyte0 = new byte[4096];
	//   16   34:sipush          4096
	//   17   37:newarray        byte[]
	//   18   39:astore          6
		do
		{
			long l1 = q;
	//   19   41:aload_0         
	//   20   42:getfield        #361 <Field long q>
	//   21   45:lstore_2        
			long l2 = o;
	//   22   46:aload_0         
	//   23   47:getfield        #363 <Field long o>
	//   24   50:lstore          4
			if(l1 != l2)
	//*  25   52:lload_2         
	//*  26   53:lload           4
	//*  27   55:lcmp            
	//*  28   56:ifeq            144
			{
				int i1 = (int)Math.min(l2 - l1, abyte0.length);
	//   29   59:lload           4
	//   30   61:lload_2         
	//   31   62:lsub            
	//   32   63:aload           6
	//   33   65:arraylength     
	//   34   66:i2l             
	//   35   67:invokestatic    #371 <Method long Math.min(long, long)>
	//   36   70:l2i             
	//   37   71:istore_1        
				i1 = m.read(abyte0, 0, i1);
	//   38   72:aload_0         
	//   39   73:getfield        #304 <Field InputStream m>
	//   40   76:aload           6
	//   41   78:iconst_0        
	//   42   79:iload_1         
	//   43   80:invokevirtual   #309 <Method int InputStream.read(byte[], int, int)>
	//   44   83:istore_1        
				if(!Thread.interrupted())
	//*  45   84:invokestatic    #376 <Method boolean Thread.interrupted()>
	//*  46   87:ifne            136
				{
					if(i1 != -1)
	//*  47   90:iload_1         
	//*  48   91:iconst_m1       
	//*  49   92:icmpeq          128
					{
						q = q + (long)i1;
	//   50   95:aload_0         
	//   51   96:aload_0         
	//   52   97:getfield        #361 <Field long q>
	//   53  100:iload_1         
	//   54  101:i2l             
	//   55  102:ladd            
	//   56  103:putfield        #361 <Field long q>
						m m1 = j;
	//   57  106:aload_0         
	//   58  107:getfield        #73  <Field m j>
	//   59  110:astore          7
						if(m1 != null)
	//*  60  112:aload           7
	//*  61  114:ifnull          41
							m1.a(i1);
	//   62  117:aload           7
	//   63  119:iload_1         
	//   64  120:invokeinterface #320 <Method void m.a(int)>
					} else
	//*  65  125:goto            41
					{
						throw new EOFException();
	//   66  128:new             #315 <Class EOFException>
	//   67  131:dup             
	//   68  132:invokespecial   #316 <Method void EOFException()>
	//   69  135:athrow          
					}
				} else
				{
					throw new InterruptedIOException();
	//   70  136:new             #378 <Class InterruptedIOException>
	//   71  139:dup             
	//   72  140:invokespecial   #379 <Method void InterruptedIOException()>
	//   73  143:athrow          
				}
			} else
			{
				c.set(((Object) (abyte0)));
	//   74  144:getstatic       #58  <Field AtomicReference c>
	//   75  147:aload           6
	//   76  149:invokevirtual   #383 <Method void AtomicReference.set(Object)>
				return;
	//   77  152:return          
			}
		} while(true);
	}

	private void d()
	{
		HttpURLConnection httpurlconnection = l;
	//    0    0:aload_0         
	//    1    1:getfield        #387 <Field HttpURLConnection l>
	//    2    4:astore_1        
		if(httpurlconnection != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          32
		{
			try
			{
				httpurlconnection.disconnect();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #349 <Method void HttpURLConnection.disconnect()>
			}
	//*   7   13:goto            27
			catch(Exception exception)
	//*   8   16:astore_1        
			{
				Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", ((Throwable) (exception)));
	//    9   17:ldc1            #133 <String "DefaultHttpDataSource">
	//   10   19:ldc2            #389 <String "Unexpected error while disconnecting">
	//   11   22:aload_1         
	//   12   23:invokestatic    #392 <Method int Log.e(String, String, Throwable)>
	//   13   26:pop             
			}
			l = null;
	//   14   27:aload_0         
	//   15   28:aconst_null     
	//   16   29:putfield        #387 <Field HttpURLConnection l>
		}
	//   17   32:return          
	}

	public int a(byte abyte0[], int i1, int j1)
		throws k.a
	{
		try
		{
			c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #396 <Method void c()>
			i1 = b(abyte0, i1, j1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:invokespecial   #398 <Method int b(byte[], int, int)>
	//    7   11:istore_2        
		}
	//*   8   12:iload_2         
	//*   9   13:ireturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  10   14:astore_1        
		{
			throw new k.a(((IOException) (abyte0)), k, 2);
	//   11   15:new             #394 <Class k$a>
	//   12   18:dup             
	//   13   19:aload_1         
	//   14   20:aload_0         
	//   15   21:getfield        #400 <Field f k>
	//   16   24:iconst_2        
	//   17   25:invokespecial   #403 <Method void k$a(IOException, f, int)>
	//   18   28:athrow          
		}
		return i1;
	}

	public long a(f f1)
		throws k.a
	{
		k = f1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #400 <Field f k>
		long l3 = 0L;
	//    3    5:lconst_0        
	//    4    6:lstore          5
		r = 0L;
	//    5    8:aload_0         
	//    6    9:lconst_0        
	//    7   10:putfield        #313 <Field long r>
		q = 0L;
	//    8   13:aload_0         
	//    9   14:lconst_0        
	//   10   15:putfield        #361 <Field long q>
		int i1;
		try
		{
			l = b(f1);
	//   11   18:aload_0         
	//   12   19:aload_0         
	//   13   20:aload_1         
	//   14   21:invokespecial   #406 <Method HttpURLConnection b(f)>
	//   15   24:putfield        #387 <Field HttpURLConnection l>
		}
	//*  16   27:aload_0         
	//*  17   28:getfield        #387 <Field HttpURLConnection l>
	//*  18   31:invokevirtual   #344 <Method int HttpURLConnection.getResponseCode()>
	//*  19   34:istore_2        
	//*  20   35:iload_2         
	//*  21   36:sipush          200
	//*  22   39:icmplt          263
	//*  23   42:iload_2         
	//*  24   43:sipush          299
	//*  25   46:icmpgt          263
	//*  26   49:aload_0         
	//*  27   50:getfield        #387 <Field HttpURLConnection l>
	//*  28   53:invokevirtual   #409 <Method String HttpURLConnection.getContentType()>
	//*  29   56:astore          9
	//*  30   58:aload_0         
	//*  31   59:getfield        #71  <Field n h>
	//*  32   62:astore          10
	//*  33   64:aload           10
	//*  34   66:ifnull          99
	//*  35   69:aload           10
	//*  36   71:aload           9
	//*  37   73:invokeinterface #413 <Method boolean n.a(Object)>
	//*  38   78:ifeq            84
	//*  39   81:goto            99
	//*  40   84:aload_0         
	//*  41   85:invokespecial   #415 <Method void d()>
	//*  42   88:new             #417 <Class k$b>
	//*  43   91:dup             
	//*  44   92:aload           9
	//*  45   94:aload_1         
	//*  46   95:invokespecial   #420 <Method void k$b(String, f)>
	//*  47   98:athrow          
	//*  48   99:lload           5
	//*  49  101:lstore_3        
	//*  50  102:iload_2         
	//*  51  103:sipush          200
	//*  52  106:icmpne          126
	//*  53  109:lload           5
	//*  54  111:lstore_3        
	//*  55  112:aload_1         
	//*  56  113:getfield        #335 <Field long f.d>
	//*  57  116:lconst_0        
	//*  58  117:lcmp            
	//*  59  118:ifeq            126
	//*  60  121:aload_1         
	//*  61  122:getfield        #335 <Field long f.d>
	//*  62  125:lstore_3        
	//*  63  126:aload_0         
	//*  64  127:lload_3         
	//*  65  128:putfield        #363 <Field long o>
	//*  66  131:aload_1         
	//*  67  132:getfield        #339 <Field int f.g>
	//*  68  135:iconst_1        
	//*  69  136:iand            
	//*  70  137:ifne            201
	//*  71  140:aload_0         
	//*  72  141:getfield        #387 <Field HttpURLConnection l>
	//*  73  144:invokestatic    #422 <Method long a(HttpURLConnection)>
	//*  74  147:lstore          5
	//*  75  149:aload_1         
	//*  76  150:getfield        #337 <Field long f.e>
	//*  77  153:lstore          7
	//*  78  155:ldc2w           #143 <Long -1L>
	//*  79  158:lstore_3        
	//*  80  159:lload           7
	//*  81  161:ldc2w           #143 <Long -1L>
	//*  82  164:lcmp            
	//*  83  165:ifeq            176
	//*  84  168:aload_1         
	//*  85  169:getfield        #337 <Field long f.e>
	//*  86  172:lstore_3        
	//*  87  173:goto            193
	//*  88  176:lload           5
	//*  89  178:ldc2w           #143 <Long -1L>
	//*  90  181:lcmp            
	//*  91  182:ifeq            193
	//*  92  185:lload           5
	//*  93  187:aload_0         
	//*  94  188:getfield        #363 <Field long o>
	//*  95  191:lsub            
	//*  96  192:lstore_3        
	//*  97  193:aload_0         
	//*  98  194:lload_3         
	//*  99  195:putfield        #311 <Field long p>
	//* 100  198:goto            209
	//* 101  201:aload_0         
	//* 102  202:aload_1         
	//* 103  203:getfield        #337 <Field long f.e>
	//* 104  206:putfield        #311 <Field long p>
	//* 105  209:aload_0         
	//* 106  210:aload_0         
	//* 107  211:getfield        #387 <Field HttpURLConnection l>
	//* 108  214:invokevirtual   #426 <Method InputStream HttpURLConnection.getInputStream()>
	//* 109  217:putfield        #304 <Field InputStream m>
	//* 110  220:aload_0         
	//* 111  221:iconst_1        
	//* 112  222:putfield        #428 <Field boolean n>
	//* 113  225:aload_0         
	//* 114  226:getfield        #73  <Field m j>
	//* 115  229:astore_1        
	//* 116  230:aload_1         
	//* 117  231:ifnull          240
	//* 118  234:aload_1         
	//* 119  235:invokeinterface #430 <Method void m.a()>
	//* 120  240:aload_0         
	//* 121  241:getfield        #311 <Field long p>
	//* 122  244:lreturn         
	//* 123  245:astore          9
	//* 124  247:aload_0         
	//* 125  248:invokespecial   #415 <Method void d()>
	//* 126  251:new             #394 <Class k$a>
	//* 127  254:dup             
	//* 128  255:aload           9
	//* 129  257:aload_1         
	//* 130  258:iconst_1        
	//* 131  259:invokespecial   #403 <Method void k$a(IOException, f, int)>
	//* 132  262:athrow          
	//* 133  263:aload_0         
	//* 134  264:getfield        #387 <Field HttpURLConnection l>
	//* 135  267:invokevirtual   #434 <Method java.util.Map HttpURLConnection.getHeaderFields()>
	//* 136  270:astore          9
	//* 137  272:aload_0         
	//* 138  273:invokespecial   #415 <Method void d()>
	//* 139  276:new             #436 <Class k$c>
	//* 140  279:dup             
	//* 141  280:iload_2         
	//* 142  281:aload           9
	//* 143  283:aload_1         
	//* 144  284:invokespecial   #439 <Method void k$c(int, java.util.Map, f)>
	//* 145  287:athrow          
	//* 146  288:astore          10
	//* 147  290:aload_0         
	//* 148  291:invokespecial   #415 <Method void d()>
	//* 149  294:aload_1         
	//* 150  295:getfield        #326 <Field Uri f.a>
	//* 151  298:invokevirtual   #329 <Method String Uri.toString()>
	//* 152  301:invokestatic    #116 <Method String String.valueOf(Object)>
	//* 153  304:astore          9
	//* 154  306:aload           9
	//* 155  308:invokevirtual   #120 <Method int String.length()>
	//* 156  311:ifeq            327
	//* 157  314:ldc2            #441 <String "Unable to connect to ">
	//* 158  317:aload           9
	//* 159  319:invokevirtual   #294 <Method String String.concat(String)>
	//* 160  322:astore          9
	//* 161  324:goto            339
	//* 162  327:new             #112 <Class String>
	//* 163  330:dup             
	//* 164  331:ldc2            #441 <String "Unable to connect to ">
	//* 165  334:invokespecial   #296 <Method void String(String)>
	//* 166  337:astore          9
	//* 167  339:new             #394 <Class k$a>
	//* 168  342:dup             
	//* 169  343:aload           9
	//* 170  345:aload           10
	//* 171  347:aload_1         
	//* 172  348:iconst_1        
	//* 173  349:invokespecial   #444 <Method void k$a(String, IOException, f, int)>
	//* 174  352:athrow          
		catch(IOException ioexception2)
	//* 175  353:astore          10
		{
			String s2 = String.valueOf(((Object) (f1.a.toString())));
	//  176  355:aload_1         
	//  177  356:getfield        #326 <Field Uri f.a>
	//  178  359:invokevirtual   #329 <Method String Uri.toString()>
	//  179  362:invokestatic    #116 <Method String String.valueOf(Object)>
	//  180  365:astore          9
			if(s2.length() != 0)
	//* 181  367:aload           9
	//* 182  369:invokevirtual   #120 <Method int String.length()>
	//* 183  372:ifeq            388
				s2 = "Unable to connect to ".concat(s2);
	//  184  375:ldc2            #441 <String "Unable to connect to ">
	//  185  378:aload           9
	//  186  380:invokevirtual   #294 <Method String String.concat(String)>
	//  187  383:astore          9
			else
	//* 188  385:goto            400
				s2 = new String("Unable to connect to ");
	//  189  388:new             #112 <Class String>
	//  190  391:dup             
	//  191  392:ldc2            #441 <String "Unable to connect to ">
	//  192  395:invokespecial   #296 <Method void String(String)>
	//  193  398:astore          9
			throw new k.a(s2, ioexception2, f1, 1);
	//  194  400:new             #394 <Class k$a>
	//  195  403:dup             
	//  196  404:aload           9
	//  197  406:aload           10
	//  198  408:aload_1         
	//  199  409:iconst_1        
	//  200  410:invokespecial   #444 <Method void k$a(String, IOException, f, int)>
	//  201  413:athrow          
		}
		try
		{
			i1 = l.getResponseCode();
		}
		catch(IOException ioexception1)
		{
			d();
			String s1 = String.valueOf(((Object) (f1.a.toString())));
			if(s1.length() != 0)
				s1 = "Unable to connect to ".concat(s1);
			else
				s1 = new String("Unable to connect to ");
			throw new k.a(s1, ioexception1, f1, 1);
		}
		if(i1 >= 200 && i1 <= 299)
		{
			String s = l.getContentType();
			n n1 = h;
			if(n1 != null && !n1.a(((Object) (s))))
			{
				d();
				throw new k.b(s, f1);
			}
			long l1 = l3;
			if(i1 == 200)
			{
				l1 = l3;
				if(f1.d != 0L)
					l1 = f1.d;
			}
			o = l1;
			if((f1.g & 1) == 0)
			{
				long l4 = a(l);
				long l5 = f1.e;
				long l2 = -1L;
				if(l5 != -1L)
					l2 = f1.e;
				else
				if(l4 != -1L)
					l2 = l4 - o;
				p = l2;
			} else
			{
				p = f1.e;
			}
			try
			{
				m = l.getInputStream();
			}
			catch(IOException ioexception)
			{
				d();
				throw new k.a(ioexception, f1, 1);
			}
			n = true;
			f1 = ((f) (j));
			if(f1 != null)
				((m) (f1)).a();
			return p;
		} else
		{
			java.util.Map map = l.getHeaderFields();
			d();
			throw new k.c(i1, map, f1);
		}
	}

	public void a()
		throws k.a
	{
		if(m == null)
			break MISSING_BLOCK_LABEL_43;
	//    0    0:aload_0         
	//    1    1:getfield        #304 <Field InputStream m>
	//    2    4:ifnull          43
		com.google.ads.interactivemedia.v3.a.f.q.a(l, b());
	//    3    7:aload_0         
	//    4    8:getfield        #387 <Field HttpURLConnection l>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #447 <Method long b()>
	//    7   15:invokestatic    #452 <Method void q.a(HttpURLConnection, long)>
		m.close();
	//    8   18:aload_0         
	//    9   19:getfield        #304 <Field InputStream m>
	//   10   22:invokevirtual   #453 <Method void InputStream.close()>
		break MISSING_BLOCK_LABEL_43;
	//   11   25:goto            43
		Object obj;
		obj;
	//   12   28:astore_1        
		throw new k.a(((IOException) (obj)), k, 3);
	//   13   29:new             #394 <Class k$a>
	//   14   32:dup             
	//   15   33:aload_1         
	//   16   34:aload_0         
	//   17   35:getfield        #400 <Field f k>
	//   18   38:iconst_3        
	//   19   39:invokespecial   #403 <Method void k$a(IOException, f, int)>
	//   20   42:athrow          
		m = null;
	//   21   43:aload_0         
	//   22   44:aconst_null     
	//   23   45:putfield        #304 <Field InputStream m>
		d();
	//   24   48:aload_0         
	//   25   49:invokespecial   #415 <Method void d()>
		if(n)
	//*  26   52:aload_0         
	//*  27   53:getfield        #428 <Field boolean n>
	//*  28   56:ifeq            79
		{
			n = false;
	//   29   59:aload_0         
	//   30   60:iconst_0        
	//   31   61:putfield        #428 <Field boolean n>
			m m1 = j;
	//   32   64:aload_0         
	//   33   65:getfield        #73  <Field m j>
	//   34   68:astore_1        
			if(m1 != null)
	//*  35   69:aload_1         
	//*  36   70:ifnull          79
				m1.b();
	//   37   73:aload_1         
	//   38   74:invokeinterface #455 <Method void com.google.ads.interactivemedia.v3.a.e.m.b()>
		}
		return;
	//   39   79:return          
		m1;
	//   40   80:astore_1        
		m = null;
	//   41   81:aload_0         
	//   42   82:aconst_null     
	//   43   83:putfield        #304 <Field InputStream m>
		d();
	//   44   86:aload_0         
	//   45   87:invokespecial   #415 <Method void d()>
		if(n)
	//*  46   90:aload_0         
	//*  47   91:getfield        #428 <Field boolean n>
	//*  48   94:ifeq            117
		{
			n = false;
	//   49   97:aload_0         
	//   50   98:iconst_0        
	//   51   99:putfield        #428 <Field boolean n>
			m m2 = j;
	//   52  102:aload_0         
	//   53  103:getfield        #73  <Field m j>
	//   54  106:astore_2        
			if(m2 != null)
	//*  55  107:aload_2         
	//*  56  108:ifnull          117
				m2.b();
	//   57  111:aload_2         
	//   58  112:invokeinterface #455 <Method void com.google.ads.interactivemedia.v3.a.e.m.b()>
		}
		throw m1;
	//   59  117:aload_1         
	//   60  118:athrow          
	}

	protected final long b()
	{
		long l1 = p;
	//    0    0:aload_0         
	//    1    1:getfield        #311 <Field long p>
	//    2    4:lstore_1        
		if(l1 == -1L)
	//*   3    5:lload_1         
	//*   4    6:ldc2w           #143 <Long -1L>
	//*   5    9:lcmp            
	//*   6   10:ifne            15
			return l1;
	//    7   13:lload_1         
	//    8   14:lreturn         
		else
			return l1 - r;
	//    9   15:lload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #313 <Field long r>
	//   12   20:lsub            
	//   13   21:lreturn         
	}

	private static final Pattern b = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
	private static final AtomicReference c = new AtomicReference();
	private final boolean d;
	private final int e;
	private final int f;
	private final String g;
	private final n h;
	private final HashMap i = new HashMap();
	private final m j;
	private f k;
	private HttpURLConnection l;
	private InputStream m;
	private boolean n;
	private long o;
	private long p;
	private long q;
	private long r;

	static 
	{
	//    0    0:ldc1            #43  <String "^bytes (\\d+)-(\\d+)/(\\d+)$">
	//    1    2:invokestatic    #49  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #51  <Field Pattern b>
	//    3    8:new             #53  <Class AtomicReference>
	//    4   11:dup             
	//    5   12:invokespecial   #56  <Method void AtomicReference()>
	//    6   15:putstatic       #58  <Field AtomicReference c>
	//*   7   18:return          
	}
}
