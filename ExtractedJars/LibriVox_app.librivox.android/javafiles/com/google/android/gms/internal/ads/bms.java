// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.*;
import java.lang.reflect.Method;
import java.net.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bml, bmv, bne, bmt, 
//			bmp, bmu, bmn, bnw, 
//			bnq

public final class bms
	implements bml
{

	public bms(String s, bnq bnq, bne bne1, int i1, int j1, boolean flag, bmv bmv1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void Object()>
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #64  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4    8:ifne            60
		{
			f = s;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #66  <Field String f>
			g = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #68  <Field bnq g>
			j = bne1;
	//   11   21:aload_0         
	//   12   22:aload_3         
	//   13   23:putfield        #70  <Field bne j>
			i = new bmv();
	//   14   26:aload_0         
	//   15   27:new             #72  <Class bmv>
	//   16   30:dup             
	//   17   31:invokespecial   #73  <Method void bmv()>
	//   18   34:putfield        #75  <Field bmv i>
			d = i1;
	//   19   37:aload_0         
	//   20   38:iload           4
	//   21   40:putfield        #77  <Field int d>
			e = j1;
	//   22   43:aload_0         
	//   23   44:iload           5
	//   24   46:putfield        #79  <Field int e>
			c = true;
	//   25   49:aload_0         
	//   26   50:iconst_1        
	//   27   51:putfield        #81  <Field boolean c>
			h = null;
	//   28   54:aload_0         
	//   29   55:aconst_null     
	//   30   56:putfield        #83  <Field bmv h>
			return;
	//   31   59:return          
		} else
		{
			throw new IllegalArgumentException();
	//   32   60:new             #85  <Class IllegalArgumentException>
	//   33   63:dup             
	//   34   64:invokespecial   #86  <Method void IllegalArgumentException()>
	//   35   67:athrow          
		}
	}

	private static long a(HttpURLConnection httpurlconnection)
	{
		String s = httpurlconnection.getHeaderField("Content-Length");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "Content-Length">
	//    2    3:invokevirtual   #97  <Method String HttpURLConnection.getHeaderField(String)>
	//    3    6:astore          5
		if(TextUtils.isEmpty(((CharSequence) (s)))) goto _L2; else goto _L1
	//    4    8:aload           5
	//    5   10:invokestatic    #64  <Method boolean TextUtils.isEmpty(CharSequence)>
	//    6   13:ifne            80
_L1:
		long l1 = Long.parseLong(s);
	//    7   16:aload           5
	//    8   18:invokestatic    #103 <Method long Long.parseLong(String)>
	//    9   21:lstore_1        
		  goto _L3
	//*  10   22:goto            84
_L8:
		StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(((Object) (s))).length() + 28);
	//   11   25:new             #105 <Class StringBuilder>
	//   12   28:dup             
	//   13   29:aload           5
	//   14   31:invokestatic    #111 <Method String String.valueOf(Object)>
	//   15   34:invokevirtual   #115 <Method int String.length()>
	//   16   37:bipush          28
	//   17   39:iadd            
	//   18   40:invokespecial   #118 <Method void StringBuilder(int)>
	//   19   43:astore          6
		stringbuilder1.append("Unexpected Content-Length [");
	//   20   45:aload           6
	//   21   47:ldc1            #120 <String "Unexpected Content-Length [">
	//   22   49:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   23   52:pop             
		stringbuilder1.append(s);
	//   24   53:aload           6
	//   25   55:aload           5
	//   26   57:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   27   60:pop             
		stringbuilder1.append("]");
	//   28   61:aload           6
	//   29   63:ldc1            #126 <String "]">
	//   30   65:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   31   68:pop             
		Log.e("DefaultHttpDataSource", stringbuilder1.toString());
	//   32   69:ldc1            #128 <String "DefaultHttpDataSource">
	//   33   71:aload           6
	//   34   73:invokevirtual   #132 <Method String StringBuilder.toString()>
	//   35   76:invokestatic    #137 <Method int Log.e(String, String)>
	//   36   79:pop             
_L2:
		l1 = -1L;
	//   37   80:ldc2w           #138 <Long -1L>
	//   38   83:lstore_1        
_L3:
		httpurlconnection = ((HttpURLConnection) (httpurlconnection.getHeaderField("Content-Range")));
	//   39   84:aload_0         
	//   40   85:ldc1            #141 <String "Content-Range">
	//   41   87:invokevirtual   #97  <Method String HttpURLConnection.getHeaderField(String)>
	//   42   90:astore_0        
		if(TextUtils.isEmpty(((CharSequence) (httpurlconnection)))) goto _L5; else goto _L4
	//   43   91:aload_0         
	//   44   92:invokestatic    #64  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   45   95:ifne            290
_L4:
		Matcher matcher = a.matcher(((CharSequence) (httpurlconnection)));
	//   46   98:getstatic       #48  <Field Pattern a>
	//   47  101:aload_0         
	//   48  102:invokevirtual   #145 <Method Matcher Pattern.matcher(CharSequence)>
	//   49  105:astore          6
		if(!matcher.find()) goto _L5; else goto _L6
	//   50  107:aload           6
	//   51  109:invokevirtual   #151 <Method boolean Matcher.find()>
	//   52  112:ifeq            290
_L6:
		long l2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1L;
	//   53  115:aload           6
	//   54  117:iconst_2        
	//   55  118:invokevirtual   #155 <Method String Matcher.group(int)>
	//   56  121:invokestatic    #103 <Method long Long.parseLong(String)>
	//   57  124:aload           6
	//   58  126:iconst_1        
	//   59  127:invokevirtual   #155 <Method String Matcher.group(int)>
	//   60  130:invokestatic    #103 <Method long Long.parseLong(String)>
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
	//   75  151:new             #105 <Class StringBuilder>
	//   76  154:dup             
	//   77  155:aload           5
	//   78  157:invokestatic    #111 <Method String String.valueOf(Object)>
	//   79  160:invokevirtual   #115 <Method int String.length()>
	//   80  163:bipush          26
	//   81  165:iadd            
	//   82  166:aload_0         
	//   83  167:invokestatic    #111 <Method String String.valueOf(Object)>
	//   84  170:invokevirtual   #115 <Method int String.length()>
	//   85  173:iadd            
	//   86  174:invokespecial   #118 <Method void StringBuilder(int)>
	//   87  177:astore          6
		stringbuilder2.append("Inconsistent headers [");
	//   88  179:aload           6
	//   89  181:ldc1            #157 <String "Inconsistent headers [">
	//   90  183:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   91  186:pop             
		stringbuilder2.append(s);
	//   92  187:aload           6
	//   93  189:aload           5
	//   94  191:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   95  194:pop             
		stringbuilder2.append("] [");
	//   96  195:aload           6
	//   97  197:ldc1            #159 <String "] [">
	//   98  199:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   99  202:pop             
		stringbuilder2.append(((String) (httpurlconnection)));
	//  100  203:aload           6
	//  101  205:aload_0         
	//  102  206:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//  103  209:pop             
		stringbuilder2.append("]");
	//  104  210:aload           6
	//  105  212:ldc1            #126 <String "]">
	//  106  214:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//  107  217:pop             
		Log.w("DefaultHttpDataSource", stringbuilder2.toString());
	//  108  218:ldc1            #128 <String "DefaultHttpDataSource">
	//  109  220:aload           6
	//  110  222:invokevirtual   #132 <Method String StringBuilder.toString()>
	//  111  225:invokestatic    #162 <Method int Log.w(String, String)>
	//  112  228:pop             
		l2 = Math.max(l1, l2);
	//  113  229:lload_1         
	//  114  230:lload_3         
	//  115  231:invokestatic    #168 <Method long Math.max(long, long)>
	//  116  234:lstore_3        
		return l2;
	//  117  235:lload_3         
	//  118  236:lreturn         
_L9:
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (httpurlconnection))).length() + 27);
	//  119  237:new             #105 <Class StringBuilder>
	//  120  240:dup             
	//  121  241:aload_0         
	//  122  242:invokestatic    #111 <Method String String.valueOf(Object)>
	//  123  245:invokevirtual   #115 <Method int String.length()>
	//  124  248:bipush          27
	//  125  250:iadd            
	//  126  251:invokespecial   #118 <Method void StringBuilder(int)>
	//  127  254:astore          5
		stringbuilder.append("Unexpected Content-Range [");
	//  128  256:aload           5
	//  129  258:ldc1            #170 <String "Unexpected Content-Range [">
	//  130  260:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//  131  263:pop             
		stringbuilder.append(((String) (httpurlconnection)));
	//  132  264:aload           5
	//  133  266:aload_0         
	//  134  267:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//  135  270:pop             
		stringbuilder.append("]");
	//  136  271:aload           5
	//  137  273:ldc1            #126 <String "]">
	//  138  275:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//  139  278:pop             
		Log.e("DefaultHttpDataSource", stringbuilder.toString());
	//  140  279:ldc1            #128 <String "DefaultHttpDataSource">
	//  141  281:aload           5
	//  142  283:invokevirtual   #132 <Method String StringBuilder.toString()>
	//  143  286:invokestatic    #137 <Method int Log.e(String, String)>
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

	private final HttpURLConnection a(URL url, byte abyte0[], long l1, long l2, boolean flag, 
			boolean flag1)
	{
		HttpURLConnection httpurlconnection = (HttpURLConnection)url.openConnection();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #177 <Method java.net.URLConnection URL.openConnection()>
	//    2    4:checkcast       #93  <Class HttpURLConnection>
	//    3    7:astore          10
		httpurlconnection.setConnectTimeout(d);
	//    4    9:aload           10
	//    5   11:aload_0         
	//    6   12:getfield        #77  <Field int d>
	//    7   15:invokevirtual   #180 <Method void HttpURLConnection.setConnectTimeout(int)>
		httpurlconnection.setReadTimeout(e);
	//    8   18:aload           10
	//    9   20:aload_0         
	//   10   21:getfield        #79  <Field int e>
	//   11   24:invokevirtual   #183 <Method void HttpURLConnection.setReadTimeout(int)>
		java.util.Map.Entry entry;
		for(url = ((URL) (i.a().entrySet().iterator())); ((Iterator) (url)).hasNext(); httpurlconnection.setRequestProperty((String)entry.getKey(), (String)entry.getValue()))
	//*  12   27:aload_0         
	//*  13   28:getfield        #75  <Field bmv i>
	//*  14   31:invokevirtual   #186 <Method Map bmv.a()>
	//*  15   34:invokeinterface #192 <Method Set Map.entrySet()>
	//*  16   39:invokeinterface #198 <Method Iterator Set.iterator()>
	//*  17   44:astore_1        
	//*  18   45:aload_1         
	//*  19   46:invokeinterface #203 <Method boolean Iterator.hasNext()>
	//*  20   51:ifeq            93
			entry = (java.util.Map.Entry)((Iterator) (url)).next();
	//   21   54:aload_1         
	//   22   55:invokeinterface #207 <Method Object Iterator.next()>
	//   23   60:checkcast       #209 <Class java.util.Map$Entry>
	//   24   63:astore          9

	//   25   65:aload           10
	//   26   67:aload           9
	//   27   69:invokeinterface #212 <Method Object java.util.Map$Entry.getKey()>
	//   28   74:checkcast       #107 <Class String>
	//   29   77:aload           9
	//   30   79:invokeinterface #215 <Method Object java.util.Map$Entry.getValue()>
	//   31   84:checkcast       #107 <Class String>
	//   32   87:invokevirtual   #219 <Method void HttpURLConnection.setRequestProperty(String, String)>
	//*  33   90:goto            45
		if(l1 != 0L || l2 != -1L)
	//*  34   93:lload_3         
	//*  35   94:lconst_0        
	//*  36   95:lcmp            
	//*  37   96:ifne            108
	//*  38   99:lload           5
	//*  39  101:ldc2w           #138 <Long -1L>
	//*  40  104:lcmp            
	//*  41  105:ifeq            214
		{
			url = ((URL) (new StringBuilder(27)));
	//   42  108:new             #105 <Class StringBuilder>
	//   43  111:dup             
	//   44  112:bipush          27
	//   45  114:invokespecial   #118 <Method void StringBuilder(int)>
	//   46  117:astore_1        
			((StringBuilder) (url)).append("bytes=");
	//   47  118:aload_1         
	//   48  119:ldc1            #221 <String "bytes=">
	//   49  121:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   50  124:pop             
			((StringBuilder) (url)).append(l1);
	//   51  125:aload_1         
	//   52  126:lload_3         
	//   53  127:invokevirtual   #224 <Method StringBuilder StringBuilder.append(long)>
	//   54  130:pop             
			((StringBuilder) (url)).append("-");
	//   55  131:aload_1         
	//   56  132:ldc1            #226 <String "-">
	//   57  134:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   58  137:pop             
			Object obj = ((Object) (((StringBuilder) (url)).toString()));
	//   59  138:aload_1         
	//   60  139:invokevirtual   #132 <Method String StringBuilder.toString()>
	//   61  142:astore          9
			url = ((URL) (obj));
	//   62  144:aload           9
	//   63  146:astore_1        
			if(l2 != -1L)
	//*  64  147:lload           5
	//*  65  149:ldc2w           #138 <Long -1L>
	//*  66  152:lcmp            
	//*  67  153:ifeq            206
			{
				url = ((URL) (String.valueOf(obj)));
	//   68  156:aload           9
	//   69  158:invokestatic    #111 <Method String String.valueOf(Object)>
	//   70  161:astore_1        
				obj = ((Object) (new StringBuilder(String.valueOf(((Object) (url))).length() + 20)));
	//   71  162:new             #105 <Class StringBuilder>
	//   72  165:dup             
	//   73  166:aload_1         
	//   74  167:invokestatic    #111 <Method String String.valueOf(Object)>
	//   75  170:invokevirtual   #115 <Method int String.length()>
	//   76  173:bipush          20
	//   77  175:iadd            
	//   78  176:invokespecial   #118 <Method void StringBuilder(int)>
	//   79  179:astore          9
				((StringBuilder) (obj)).append(((String) (url)));
	//   80  181:aload           9
	//   81  183:aload_1         
	//   82  184:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   83  187:pop             
				((StringBuilder) (obj)).append((l1 + l2) - 1L);
	//   84  188:aload           9
	//   85  190:lload_3         
	//   86  191:lload           5
	//   87  193:ladd            
	//   88  194:lconst_1        
	//   89  195:lsub            
	//   90  196:invokevirtual   #224 <Method StringBuilder StringBuilder.append(long)>
	//   91  199:pop             
				url = ((URL) (((StringBuilder) (obj)).toString()));
	//   92  200:aload           9
	//   93  202:invokevirtual   #132 <Method String StringBuilder.toString()>
	//   94  205:astore_1        
			}
			httpurlconnection.setRequestProperty("Range", ((String) (url)));
	//   95  206:aload           10
	//   96  208:ldc1            #228 <String "Range">
	//   97  210:aload_1         
	//   98  211:invokevirtual   #219 <Method void HttpURLConnection.setRequestProperty(String, String)>
		}
		httpurlconnection.setRequestProperty("User-Agent", f);
	//   99  214:aload           10
	//  100  216:ldc1            #230 <String "User-Agent">
	//  101  218:aload_0         
	//  102  219:getfield        #66  <Field String f>
	//  103  222:invokevirtual   #219 <Method void HttpURLConnection.setRequestProperty(String, String)>
		if(!flag)
	//* 104  225:iload           7
	//* 105  227:ifne            239
			httpurlconnection.setRequestProperty("Accept-Encoding", "identity");
	//  106  230:aload           10
	//  107  232:ldc1            #232 <String "Accept-Encoding">
	//  108  234:ldc1            #234 <String "identity">
	//  109  236:invokevirtual   #219 <Method void HttpURLConnection.setRequestProperty(String, String)>
		httpurlconnection.setInstanceFollowRedirects(flag1);
	//  110  239:aload           10
	//  111  241:iload           8
	//  112  243:invokevirtual   #238 <Method void HttpURLConnection.setInstanceFollowRedirects(boolean)>
		if(abyte0 != null)
	//* 113  246:aload_2         
	//* 114  247:ifnull          256
			flag = true;
	//  115  250:iconst_1        
	//  116  251:istore          7
		else
	//* 117  253:goto            259
			flag = false;
	//  118  256:iconst_0        
	//  119  257:istore          7
		httpurlconnection.setDoOutput(flag);
	//  120  259:aload           10
	//  121  261:iload           7
	//  122  263:invokevirtual   #241 <Method void HttpURLConnection.setDoOutput(boolean)>
		if(abyte0 != null)
	//* 123  266:aload_2         
	//* 124  267:ifnull          312
		{
			httpurlconnection.setRequestMethod("POST");
	//  125  270:aload           10
	//  126  272:ldc1            #243 <String "POST">
	//  127  274:invokevirtual   #247 <Method void HttpURLConnection.setRequestMethod(String)>
			if(abyte0.length != 0)
	//* 128  277:aload_2         
	//* 129  278:arraylength     
	//* 130  279:ifeq            312
			{
				httpurlconnection.setFixedLengthStreamingMode(abyte0.length);
	//  131  282:aload           10
	//  132  284:aload_2         
	//  133  285:arraylength     
	//  134  286:invokevirtual   #250 <Method void HttpURLConnection.setFixedLengthStreamingMode(int)>
				httpurlconnection.connect();
	//  135  289:aload           10
	//  136  291:invokevirtual   #253 <Method void HttpURLConnection.connect()>
				url = ((URL) (httpurlconnection.getOutputStream()));
	//  137  294:aload           10
	//  138  296:invokevirtual   #257 <Method OutputStream HttpURLConnection.getOutputStream()>
	//  139  299:astore_1        
				((OutputStream) (url)).write(abyte0);
	//  140  300:aload_1         
	//  141  301:aload_2         
	//  142  302:invokevirtual   #263 <Method void OutputStream.write(byte[])>
				((OutputStream) (url)).close();
	//  143  305:aload_1         
	//  144  306:invokevirtual   #266 <Method void OutputStream.close()>
				return httpurlconnection;
	//  145  309:aload           10
	//  146  311:areturn         
			}
		}
		httpurlconnection.connect();
	//  147  312:aload           10
	//  148  314:invokevirtual   #253 <Method void HttpURLConnection.connect()>
		return httpurlconnection;
	//  149  317:aload           10
	//  150  319:areturn         
	}

	private final void d()
	{
		HttpURLConnection httpurlconnection = l;
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field HttpURLConnection l>
	//    2    4:astore_1        
		if(httpurlconnection != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          32
		{
			try
			{
				httpurlconnection.disconnect();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #273 <Method void HttpURLConnection.disconnect()>
			}
	//*   7   13:goto            27
			catch(Exception exception)
	//*   8   16:astore_1        
			{
				Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", ((Throwable) (exception)));
	//    9   17:ldc1            #128 <String "DefaultHttpDataSource">
	//   10   19:ldc2            #275 <String "Unexpected error while disconnecting">
	//   11   22:aload_1         
	//   12   23:invokestatic    #278 <Method int Log.e(String, String, Throwable)>
	//   13   26:pop             
			}
			l = null;
	//   14   27:aload_0         
	//   15   28:aconst_null     
	//   16   29:putfield        #270 <Field HttpURLConnection l>
		}
	//   17   32:return          
	}

	public final int a(byte abyte0[], int i1, int j1)
	{
		if(q == o) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #283 <Field long q>
	//    2    4:aload_0         
	//    3    5:getfield        #285 <Field long o>
	//    4    8:lcmp            
	//    5    9:ifeq            286
_L1:
		byte abyte2[] = (byte[])b.getAndSet(((Object) (null)));
	//    6   12:getstatic       #55  <Field AtomicReference b>
	//    7   15:aconst_null     
	//    8   16:invokevirtual   #289 <Method Object AtomicReference.getAndSet(Object)>
	//    9   19:checkcast       #291 <Class byte[]>
	//   10   22:astore          8
		byte abyte1[];
		abyte1 = abyte2;
	//   11   24:aload           8
	//   12   26:astore          7
		if(abyte2 != null)
			break MISSING_BLOCK_LABEL_40;
	//   13   28:aload           8
	//   14   30:ifnonnull       40
		abyte1 = new byte[4096];
	//   15   33:sipush          4096
	//   16   36:newarray        byte[]
	//   17   38:astore          7
_L3:
		int k1;
		if(q == o)
			break MISSING_BLOCK_LABEL_147;
	//   18   40:aload_0         
	//   19   41:getfield        #283 <Field long q>
	//   20   44:aload_0         
	//   21   45:getfield        #285 <Field long o>
	//   22   48:lcmp            
	//   23   49:ifeq            147
		k1 = (int)Math.min(o - q, abyte1.length);
	//   24   52:aload_0         
	//   25   53:getfield        #285 <Field long o>
	//   26   56:aload_0         
	//   27   57:getfield        #283 <Field long q>
	//   28   60:lsub            
	//   29   61:aload           7
	//   30   63:arraylength     
	//   31   64:i2l             
	//   32   65:invokestatic    #294 <Method long Math.min(long, long)>
	//   33   68:l2i             
	//   34   69:istore          4
		k1 = m.read(abyte1, 0, k1);
	//   35   71:aload_0         
	//   36   72:getfield        #296 <Field InputStream m>
	//   37   75:aload           7
	//   38   77:iconst_0        
	//   39   78:iload           4
	//   40   80:invokevirtual   #301 <Method int InputStream.read(byte[], int, int)>
	//   41   83:istore          4
		if(Thread.interrupted())
			break MISSING_BLOCK_LABEL_139;
	//   42   85:invokestatic    #306 <Method boolean Thread.interrupted()>
	//   43   88:ifne            139
label0:
		{
			if(k1 == -1)
				break label0;
	//   44   91:iload           4
	//   45   93:iconst_m1       
	//   46   94:icmpeq          131
			long l1;
			try
			{
				q = q + (long)k1;
	//   47   97:aload_0         
	//   48   98:aload_0         
	//   49   99:getfield        #283 <Field long q>
	//   50  102:iload           4
	//   51  104:i2l             
	//   52  105:ladd            
	//   53  106:putfield        #283 <Field long q>
				if(j != null)
	//*  54  109:aload_0         
	//*  55  110:getfield        #70  <Field bne j>
	//*  56  113:ifnull          40
					j.a(((Object) (this)), k1);
	//   57  116:aload_0         
	//   58  117:getfield        #70  <Field bne j>
	//   59  120:aload_0         
	//   60  121:iload           4
	//   61  123:invokeinterface #311 <Method void bne.a(Object, int)>
			}
	//*  62  128:goto            40
	//*  63  131:new             #313 <Class EOFException>
	//*  64  134:dup             
	//*  65  135:invokespecial   #314 <Method void EOFException()>
	//*  66  138:athrow          
	//*  67  139:new             #316 <Class InterruptedIOException>
	//*  68  142:dup             
	//*  69  143:invokespecial   #317 <Method void InterruptedIOException()>
	//*  70  146:athrow          
	//*  71  147:getstatic       #55  <Field AtomicReference b>
	//*  72  150:aload           7
	//*  73  152:invokevirtual   #321 <Method void AtomicReference.set(Object)>
	//*  74  155:goto            286
	//*  75  158:iload_3         
	//*  76  159:istore          4
	//*  77  161:aload_0         
	//*  78  162:getfield        #323 <Field long p>
	//*  79  165:ldc2w           #138 <Long -1L>
	//*  80  168:lcmp            
	//*  81  169:ifeq            202
	//*  82  172:aload_0         
	//*  83  173:getfield        #323 <Field long p>
	//*  84  176:aload_0         
	//*  85  177:getfield        #325 <Field long r>
	//*  86  180:lsub            
	//*  87  181:lstore          5
	//*  88  183:lload           5
	//*  89  185:lconst_0        
	//*  90  186:lcmp            
	//*  91  187:ifne            192
	//*  92  190:iconst_m1       
	//*  93  191:ireturn         
	//*  94  192:iload_3         
	//*  95  193:i2l             
	//*  96  194:lload           5
	//*  97  196:invokestatic    #294 <Method long Math.min(long, long)>
	//*  98  199:l2i             
	//*  99  200:istore          4
	//* 100  202:aload_0         
	//* 101  203:getfield        #296 <Field InputStream m>
	//* 102  206:aload_1         
	//* 103  207:iload_2         
	//* 104  208:iload           4
	//* 105  210:invokevirtual   #301 <Method int InputStream.read(byte[], int, int)>
	//* 106  213:istore_2        
	//* 107  214:iload_2         
	//* 108  215:iconst_m1       
	//* 109  216:icmpne          240
	//* 110  219:aload_0         
	//* 111  220:getfield        #323 <Field long p>
	//* 112  223:ldc2w           #138 <Long -1L>
	//* 113  226:lcmp            
	//* 114  227:ifne            232
	//* 115  230:iconst_m1       
	//* 116  231:ireturn         
	//* 117  232:new             #313 <Class EOFException>
	//* 118  235:dup             
	//* 119  236:invokespecial   #314 <Method void EOFException()>
	//* 120  239:athrow          
	//* 121  240:aload_0         
	//* 122  241:aload_0         
	//* 123  242:getfield        #325 <Field long r>
	//* 124  245:iload_2         
	//* 125  246:i2l             
	//* 126  247:ladd            
	//* 127  248:putfield        #325 <Field long r>
	//* 128  251:aload_0         
	//* 129  252:getfield        #70  <Field bne j>
	//* 130  255:ifnull          269
	//* 131  258:aload_0         
	//* 132  259:getfield        #70  <Field bne j>
	//* 133  262:aload_0         
	//* 134  263:iload_2         
	//* 135  264:invokeinterface #311 <Method void bne.a(Object, int)>
	//* 136  269:iload_2         
	//* 137  270:ireturn         
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
	//* 138  271:astore_1        
			{
				throw new bmt(((IOException) (abyte0)), k, 2);
	//  139  272:new             #327 <Class bmt>
	//  140  275:dup             
	//  141  276:aload_1         
	//  142  277:aload_0         
	//  143  278:getfield        #329 <Field bmp k>
	//  144  281:iconst_2        
	//  145  282:invokespecial   #332 <Method void bmt(IOException, bmp, int)>
	//  146  285:athrow          
			}
		}
		  goto _L3
		throw new EOFException();
		throw new InterruptedIOException();
		b.set(((Object) (abyte1)));
		  goto _L2
_L5:
		k1 = j1;
		if(p == -1L)
			break MISSING_BLOCK_LABEL_202;
		l1 = p - r;
		if(l1 == 0L)
			return -1;
		k1 = (int)Math.min(j1, l1);
		i1 = m.read(abyte0, i1, k1);
		if(i1 != -1)
			break MISSING_BLOCK_LABEL_240;
		if(p == -1L)
			return -1;
		throw new EOFException();
		r = r + (long)i1;
		if(j != null)
			j.a(((Object) (this)), i1);
		return i1;
_L2:
		if(j1 == 0)
	//* 147  286:iload_3         
	//* 148  287:ifne            158
			return 0;
	//  149  290:iconst_0        
	//  150  291:ireturn         
		if(true) goto _L5; else goto _L4
_L4:
	}

	public final long a(bmp bmp1)
	{
		long l7;
		k = bmp1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #329 <Field bmp k>
		l7 = 0L;
	//    3    5:lconst_0        
	//    4    6:lstore          8
		r = 0L;
	//    5    8:aload_0         
	//    6    9:lconst_0        
	//    7   10:putfield        #325 <Field long r>
		q = 0L;
	//    8   13:aload_0         
	//    9   14:lconst_0        
	//   10   15:putfield        #283 <Field long q>
		long l1;
		long l4;
		boolean flag;
		Object obj;
		Object obj1;
		obj = ((Object) (new URL(bmp1.a.toString())));
	//   11   18:new             #173 <Class URL>
	//   12   21:dup             
	//   13   22:aload_1         
	//   14   23:getfield        #338 <Field Uri bmp.a>
	//   15   26:invokevirtual   #341 <Method String Uri.toString()>
	//   16   29:invokespecial   #343 <Method void URL(String)>
	//   17   32:astore          11
		obj1 = ((Object) (bmp1.b));
	//   18   34:aload_1         
	//   19   35:getfield        #345 <Field byte[] bmp.b>
	//   20   38:astore          12
		l4 = bmp1.d;
	//   21   40:aload_1         
	//   22   41:getfield        #347 <Field long bmp.d>
	//   23   44:lstore          6
		l1 = bmp1.e;
	//   24   46:aload_1         
	//   25   47:getfield        #349 <Field long bmp.e>
	//   26   50:lstore          4
		flag = bmp1.a(1);
	//   27   52:aload_1         
	//   28   53:iconst_1        
	//   29   54:invokevirtual   #352 <Method boolean bmp.a(int)>
	//   30   57:istore          10
		if(c) goto _L2; else goto _L1
	//   31   59:aload_0         
	//   32   60:getfield        #81  <Field boolean c>
	//   33   63:ifne            725
_L1:
		obj = ((Object) (a(((URL) (obj)), ((byte []) (obj1)), l4, l1, flag, true)));
	//   34   66:aload_0         
	//   35   67:aload           11
	//   36   69:aload           12
	//   37   71:lload           6
	//   38   73:lload           4
	//   39   75:iload           10
	//   40   77:iconst_1        
	//   41   78:invokespecial   #354 <Method HttpURLConnection a(URL, byte[], long, long, boolean, boolean)>
	//   42   81:astore          11
		  goto _L3
	//*  43   83:goto            169
_L10:
		int i1;
		int j1 = i1 + 1;
	//   44   86:iload_2         
	//   45   87:iconst_1        
	//   46   88:iadd            
	//   47   89:istore_3        
		if(i1 > 20) goto _L5; else goto _L4
	//   48   90:iload_2         
	//   49   91:bipush          20
	//   50   93:icmpgt          624
_L4:
		Object obj2;
		String s;
		try
		{
			obj2 = ((Object) (a(((URL) (obj)), ((byte []) (obj1)), l4, l1, flag, false)));
	//   51   96:aload_0         
	//   52   97:aload           11
	//   53   99:aload           12
	//   54  101:lload           6
	//   55  103:lload           4
	//   56  105:iload           10
	//   57  107:iconst_0        
	//   58  108:invokespecial   #354 <Method HttpURLConnection a(URL, byte[], long, long, boolean, boolean)>
	//   59  111:astore          13
			i1 = ((HttpURLConnection) (obj2)).getResponseCode();
	//   60  113:aload           13
	//   61  115:invokevirtual   #357 <Method int HttpURLConnection.getResponseCode()>
	//   62  118:istore_2        
		}
	//*  63  119:iload_2         
	//*  64  120:sipush          300
	//*  65  123:icmpeq          498
	//*  66  126:iload_2         
	//*  67  127:sipush          301
	//*  68  130:icmpeq          498
	//*  69  133:iload_2         
	//*  70  134:sipush          302
	//*  71  137:icmpeq          498
	//*  72  140:iload_2         
	//*  73  141:sipush          303
	//*  74  144:icmpeq          498
	//*  75  147:aload           12
	//*  76  149:ifnonnull       730
	//*  77  152:iload_2         
	//*  78  153:sipush          307
	//*  79  156:icmpeq          498
	//*  80  159:iload_2         
	//*  81  160:sipush          308
	//*  82  163:icmpne          730
	//*  83  166:goto            498
	//*  84  169:aload_0         
	//*  85  170:aload           11
	//*  86  172:putfield        #270 <Field HttpURLConnection l>
	//*  87  175:aload_0         
	//*  88  176:getfield        #270 <Field HttpURLConnection l>
	//*  89  179:invokevirtual   #357 <Method int HttpURLConnection.getResponseCode()>
	//*  90  182:istore_2        
	//*  91  183:iload_2         
	//*  92  184:sipush          200
	//*  93  187:icmplt          386
	//*  94  190:iload_2         
	//*  95  191:sipush          299
	//*  96  194:icmple          200
	//*  97  197:goto            386
	//*  98  200:aload_0         
	//*  99  201:getfield        #270 <Field HttpURLConnection l>
	//* 100  204:invokevirtual   #360 <Method String HttpURLConnection.getContentType()>
	//* 101  207:pop             
	//* 102  208:lload           8
	//* 103  210:lstore          4
	//* 104  212:iload_2         
	//* 105  213:sipush          200
	//* 106  216:icmpne          238
	//* 107  219:lload           8
	//* 108  221:lstore          4
	//* 109  223:aload_1         
	//* 110  224:getfield        #347 <Field long bmp.d>
	//* 111  227:lconst_0        
	//* 112  228:lcmp            
	//* 113  229:ifeq            238
	//* 114  232:aload_1         
	//* 115  233:getfield        #347 <Field long bmp.d>
	//* 116  236:lstore          4
	//* 117  238:aload_0         
	//* 118  239:lload           4
	//* 119  241:putfield        #285 <Field long o>
	//* 120  244:aload_1         
	//* 121  245:iconst_1        
	//* 122  246:invokevirtual   #352 <Method boolean bmp.a(int)>
	//* 123  249:ifne            319
	//* 124  252:aload_1         
	//* 125  253:getfield        #349 <Field long bmp.e>
	//* 126  256:lstore          6
	//* 127  258:ldc2w           #138 <Long -1L>
	//* 128  261:lstore          4
	//* 129  263:lload           6
	//* 130  265:ldc2w           #138 <Long -1L>
	//* 131  268:lcmp            
	//* 132  269:ifeq            283
	//* 133  272:aload_0         
	//* 134  273:aload_1         
	//* 135  274:getfield        #349 <Field long bmp.e>
	//* 136  277:putfield        #323 <Field long p>
	//* 137  280:goto            327
	//* 138  283:aload_0         
	//* 139  284:getfield        #270 <Field HttpURLConnection l>
	//* 140  287:invokestatic    #362 <Method long a(HttpURLConnection)>
	//* 141  290:lstore          6
	//* 142  292:lload           6
	//* 143  294:ldc2w           #138 <Long -1L>
	//* 144  297:lcmp            
	//* 145  298:ifeq            310
	//* 146  301:lload           6
	//* 147  303:aload_0         
	//* 148  304:getfield        #285 <Field long o>
	//* 149  307:lsub            
	//* 150  308:lstore          4
	//* 151  310:aload_0         
	//* 152  311:lload           4
	//* 153  313:putfield        #323 <Field long p>
	//* 154  316:goto            327
	//* 155  319:aload_0         
	//* 156  320:aload_1         
	//* 157  321:getfield        #349 <Field long bmp.e>
	//* 158  324:putfield        #323 <Field long p>
	//* 159  327:aload_0         
	//* 160  328:aload_0         
	//* 161  329:getfield        #270 <Field HttpURLConnection l>
	//* 162  332:invokevirtual   #366 <Method InputStream HttpURLConnection.getInputStream()>
	//* 163  335:putfield        #296 <Field InputStream m>
	//* 164  338:aload_0         
	//* 165  339:iconst_1        
	//* 166  340:putfield        #368 <Field boolean n>
	//* 167  343:aload_0         
	//* 168  344:getfield        #70  <Field bne j>
	//* 169  347:astore          11
	//* 170  349:aload           11
	//* 171  351:ifnull          363
	//* 172  354:aload           11
	//* 173  356:aload_0         
	//* 174  357:aload_1         
	//* 175  358:invokeinterface #371 <Method void bne.a(Object, bmp)>
	//* 176  363:aload_0         
	//* 177  364:getfield        #323 <Field long p>
	//* 178  367:lreturn         
	//* 179  368:astore          11
	//* 180  370:aload_0         
	//* 181  371:invokespecial   #373 <Method void d()>
	//* 182  374:new             #327 <Class bmt>
	//* 183  377:dup             
	//* 184  378:aload           11
	//* 185  380:aload_1         
	//* 186  381:iconst_1        
	//* 187  382:invokespecial   #332 <Method void bmt(IOException, bmp, int)>
	//* 188  385:athrow          
	//* 189  386:aload_0         
	//* 190  387:getfield        #270 <Field HttpURLConnection l>
	//* 191  390:invokevirtual   #376 <Method Map HttpURLConnection.getHeaderFields()>
	//* 192  393:astore          11
	//* 193  395:aload_0         
	//* 194  396:invokespecial   #373 <Method void d()>
	//* 195  399:new             #378 <Class bmu>
	//* 196  402:dup             
	//* 197  403:iload_2         
	//* 198  404:aload           11
	//* 199  406:aload_1         
	//* 200  407:invokespecial   #381 <Method void bmu(int, Map, bmp)>
	//* 201  410:astore_1        
	//* 202  411:iload_2         
	//* 203  412:sipush          416
	//* 204  415:icmpne          431
	//* 205  418:aload_1         
	//* 206  419:new             #383 <Class bmn>
	//* 207  422:dup             
	//* 208  423:iconst_0        
	//* 209  424:invokespecial   #384 <Method void bmn(int)>
	//* 210  427:invokevirtual   #388 <Method Throwable bmu.initCause(Throwable)>
	//* 211  430:pop             
	//* 212  431:aload_1         
	//* 213  432:athrow          
	//* 214  433:astore          12
	//* 215  435:aload_0         
	//* 216  436:invokespecial   #373 <Method void d()>
	//* 217  439:aload_1         
	//* 218  440:getfield        #338 <Field Uri bmp.a>
	//* 219  443:invokevirtual   #341 <Method String Uri.toString()>
	//* 220  446:invokestatic    #111 <Method String String.valueOf(Object)>
	//* 221  449:astore          11
	//* 222  451:aload           11
	//* 223  453:invokevirtual   #115 <Method int String.length()>
	//* 224  456:ifeq            472
	//* 225  459:ldc2            #390 <String "Unable to connect to ">
	//* 226  462:aload           11
	//* 227  464:invokevirtual   #393 <Method String String.concat(String)>
	//* 228  467:astore          11
	//* 229  469:goto            484
	//* 230  472:new             #107 <Class String>
	//* 231  475:dup             
	//* 232  476:ldc2            #390 <String "Unable to connect to ">
	//* 233  479:invokespecial   #394 <Method void String(String)>
	//* 234  482:astore          11
	//* 235  484:new             #327 <Class bmt>
	//* 236  487:dup             
	//* 237  488:aload           11
	//* 238  490:aload           12
	//* 239  492:aload_1         
	//* 240  493:iconst_1        
	//* 241  494:invokespecial   #397 <Method void bmt(String, IOException, bmp, int)>
	//* 242  497:athrow          
	//* 243  498:aconst_null     
	//* 244  499:astore          12
	//* 245  501:aload           13
	//* 246  503:ldc2            #399 <String "Location">
	//* 247  506:invokevirtual   #97  <Method String HttpURLConnection.getHeaderField(String)>
	//* 248  509:astore          14
	//* 249  511:aload           13
	//* 250  513:invokevirtual   #273 <Method void HttpURLConnection.disconnect()>
	//* 251  516:aload           14
	//* 252  518:ifnull          613
	//* 253  521:new             #173 <Class URL>
	//* 254  524:dup             
	//* 255  525:aload           11
	//* 256  527:aload           14
	//* 257  529:invokespecial   #402 <Method void URL(URL, String)>
	//* 258  532:astore          11
	//* 259  534:aload           11
	//* 260  536:invokevirtual   #405 <Method String URL.getProtocol()>
	//* 261  539:astore          13
	//* 262  541:ldc2            #407 <String "https">
	//* 263  544:aload           13
	//* 264  546:invokevirtual   #411 <Method boolean String.equals(Object)>
	//* 265  549:ifne            737
	//* 266  552:ldc2            #413 <String "http">
	//* 267  555:aload           13
	//* 268  557:invokevirtual   #411 <Method boolean String.equals(Object)>
	//* 269  560:ifne            737
	//* 270  563:aload           13
	//* 271  565:invokestatic    #111 <Method String String.valueOf(Object)>
	//* 272  568:astore          11
	//* 273  570:aload           11
	//* 274  572:invokevirtual   #115 <Method int String.length()>
	//* 275  575:ifeq            591
	//* 276  578:ldc2            #415 <String "Unsupported protocol redirect: ">
	//* 277  581:aload           11
	//* 278  583:invokevirtual   #393 <Method String String.concat(String)>
	//* 279  586:astore          11
	//* 280  588:goto            603
	//* 281  591:new             #107 <Class String>
	//* 282  594:dup             
	//* 283  595:ldc2            #415 <String "Unsupported protocol redirect: ">
	//* 284  598:invokespecial   #394 <Method void String(String)>
	//* 285  601:astore          11
	//* 286  603:new             #417 <Class ProtocolException>
	//* 287  606:dup             
	//* 288  607:aload           11
	//* 289  609:invokespecial   #418 <Method void ProtocolException(String)>
	//* 290  612:athrow          
	//* 291  613:new             #417 <Class ProtocolException>
	//* 292  616:dup             
	//* 293  617:ldc2            #420 <String "Null location redirect">
	//* 294  620:invokespecial   #418 <Method void ProtocolException(String)>
	//* 295  623:athrow          
	//* 296  624:new             #105 <Class StringBuilder>
	//* 297  627:dup             
	//* 298  628:bipush          31
	//* 299  630:invokespecial   #118 <Method void StringBuilder(int)>
	//* 300  633:astore          11
	//* 301  635:aload           11
	//* 302  637:ldc2            #422 <String "Too many redirects: ">
	//* 303  640:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//* 304  643:pop             
	//* 305  644:aload           11
	//* 306  646:iload_3         
	//* 307  647:invokevirtual   #425 <Method StringBuilder StringBuilder.append(int)>
	//* 308  650:pop             
	//* 309  651:new             #427 <Class NoRouteToHostException>
	//* 310  654:dup             
	//* 311  655:aload           11
	//* 312  657:invokevirtual   #132 <Method String StringBuilder.toString()>
	//* 313  660:invokespecial   #428 <Method void NoRouteToHostException(String)>
	//* 314  663:athrow          
		catch(IOException ioexception)
	//* 315  664:astore          12
		{
			obj = ((Object) (String.valueOf(((Object) (bmp1.a.toString())))));
	//  316  666:aload_1         
	//  317  667:getfield        #338 <Field Uri bmp.a>
	//  318  670:invokevirtual   #341 <Method String Uri.toString()>
	//  319  673:invokestatic    #111 <Method String String.valueOf(Object)>
	//  320  676:astore          11
			if(((String) (obj)).length() != 0)
	//* 321  678:aload           11
	//* 322  680:invokevirtual   #115 <Method int String.length()>
	//* 323  683:ifeq            699
				obj = ((Object) ("Unable to connect to ".concat(((String) (obj)))));
	//  324  686:ldc2            #390 <String "Unable to connect to ">
	//  325  689:aload           11
	//  326  691:invokevirtual   #393 <Method String String.concat(String)>
	//  327  694:astore          11
			else
	//* 328  696:goto            711
				obj = ((Object) (new String("Unable to connect to ")));
	//  329  699:new             #107 <Class String>
	//  330  702:dup             
	//  331  703:ldc2            #390 <String "Unable to connect to ">
	//  332  706:invokespecial   #394 <Method void String(String)>
	//  333  709:astore          11
			throw new bmt(((String) (obj)), ioexception, bmp1, 1);
	//  334  711:new             #327 <Class bmt>
	//  335  714:dup             
	//  336  715:aload           11
	//  337  717:aload           12
	//  338  719:aload_1         
	//  339  720:iconst_1        
	//  340  721:invokespecial   #397 <Method void bmt(String, IOException, bmp, int)>
	//  341  724:athrow          
		}
		if(i1 != 300 && i1 != 301 && i1 != 302 && i1 != 303 && (obj1 != null || i1 != 307 && i1 != 308)) goto _L7; else goto _L6
_L3:
		l = ((HttpURLConnection) (obj));
		try
		{
			i1 = l.getResponseCode();
		}
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			d();
			obj = ((Object) (String.valueOf(((Object) (bmp1.a.toString())))));
			if(((String) (obj)).length() != 0)
				obj = ((Object) ("Unable to connect to ".concat(((String) (obj)))));
			else
				obj = ((Object) (new String("Unable to connect to ")));
			throw new bmt(((String) (obj)), ((IOException) (obj1)), bmp1, 1);
		}
		if(i1 >= 200 && i1 <= 299)
		{
			l.getContentType();
			long l2 = l7;
			if(i1 == 200)
			{
				l2 = l7;
				if(bmp1.d != 0L)
					l2 = bmp1.d;
			}
			o = l2;
			if(!bmp1.a(1))
			{
				long l5 = bmp1.e;
				long l3 = -1L;
				if(l5 != -1L)
				{
					p = bmp1.e;
				} else
				{
					long l6 = a(l);
					if(l6 != -1L)
						l3 = l6 - o;
					p = l3;
				}
			} else
			{
				p = bmp1.e;
			}
			try
			{
				m = l.getInputStream();
			}
			// Misplaced declaration of an exception variable
			catch(Object obj)
			{
				d();
				throw new bmt(((IOException) (obj)), bmp1, 1);
			}
			n = true;
			obj = ((Object) (j));
			if(obj != null)
				((bne) (obj)).a(((Object) (this)), bmp1);
			return p;
		}
		obj = ((Object) (l.getHeaderFields()));
		d();
		bmp1 = ((bmp) (new bmu(i1, ((Map) (obj)), bmp1)));
		if(i1 == 416)
			((bmu) (bmp1)).initCause(((Throwable) (new bmn(0))));
		throw bmp1;
_L6:
		obj1 = null;
		s = ((HttpURLConnection) (obj2)).getHeaderField("Location");
		((HttpURLConnection) (obj2)).disconnect();
		if(s == null)
			break MISSING_BLOCK_LABEL_613;
		obj = ((Object) (new URL(((URL) (obj)), s)));
		obj2 = ((Object) (((URL) (obj)).getProtocol()));
		if("https".equals(obj2) || "http".equals(obj2))
			break; /* Loop/switch isn't completed */
		obj = ((Object) (String.valueOf(obj2)));
		if(((String) (obj)).length() != 0)
		{
			obj = ((Object) ("Unsupported protocol redirect: ".concat(((String) (obj)))));
			break MISSING_BLOCK_LABEL_603;
		}
		obj = ((Object) (new String("Unsupported protocol redirect: ")));
		throw new ProtocolException(((String) (obj)));
		throw new ProtocolException("Null location redirect");
_L5:
		obj = ((Object) (new StringBuilder(31)));
		((StringBuilder) (obj)).append("Too many redirects: ");
		((StringBuilder) (obj)).append(j1);
		throw new NoRouteToHostException(((StringBuilder) (obj)).toString());
_L2:
		i1 = 0;
	//  342  725:iconst_0        
	//  343  726:istore_2        
		continue; /* Loop/switch isn't completed */
	//  344  727:goto            86
_L7:
		obj = obj2;
	//  345  730:aload           13
	//  346  732:astore          11
		if(true) goto _L3; else goto _L8
	//  347  734:goto            169
_L8:
		i1 = j1;
	//  348  737:iload_3         
	//  349  738:istore_2        
		if(true) goto _L10; else goto _L9
	//  350  739:goto            86
_L9:
	}

	public final void a()
	{
		if(m == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #296 <Field InputStream m>
	//    2    4:ifnull          184
_L1:
		long l1;
		Object obj;
		obj = ((Object) (l));
	//    3    7:aload_0         
	//    4    8:getfield        #270 <Field HttpURLConnection l>
	//    5   11:astore          4
		if(p == -1L)
	//*   6   13:aload_0         
	//*   7   14:getfield        #323 <Field long p>
	//*   8   17:ldc2w           #138 <Long -1L>
	//*   9   20:lcmp            
	//*  10   21:ifne            32
		{
			l1 = p;
	//   11   24:aload_0         
	//   12   25:getfield        #323 <Field long p>
	//   13   28:lstore_2        
			break MISSING_BLOCK_LABEL_42;
	//   14   29:goto            42
		}
		l1 = p - r;
	//   15   32:aload_0         
	//   16   33:getfield        #323 <Field long p>
	//   17   36:aload_0         
	//   18   37:getfield        #325 <Field long r>
	//   19   40:lsub            
	//   20   41:lstore_2        
		if(bnw.a == 19) goto _L4; else goto _L3
	//   21   42:getstatic       #432 <Field int bnw.a>
	//   22   45:bipush          19
	//   23   47:icmpeq          60
_L3:
		int i1 = bnw.a;
	//   24   50:getstatic       #432 <Field int bnw.a>
	//   25   53:istore_1        
		if(i1 != 20) goto _L5; else goto _L4
	//   26   54:iload_1         
	//   27   55:bipush          20
	//   28   57:icmpne          157
_L4:
		obj = ((Object) (((HttpURLConnection) (obj)).getInputStream()));
	//   29   60:aload           4
	//   30   62:invokevirtual   #366 <Method InputStream HttpURLConnection.getInputStream()>
	//   31   65:astore          4
		if(l1 != -1L) goto _L7; else goto _L6
	//   32   67:lload_2         
	//   33   68:ldc2w           #138 <Long -1L>
	//   34   71:lcmp            
	//   35   72:ifne            276
_L6:
		if(((InputStream) (obj)).read() != -1) goto _L8; else goto _L5
	//   36   75:aload           4
	//   37   77:invokevirtual   #434 <Method int InputStream.read()>
	//   38   80:iconst_m1       
	//   39   81:icmpne          87
	//*  40   84:goto            157
_L8:
		Object obj1;
		try
		{
			String s = obj.getClass().getName();
	//   41   87:aload           4
	//   42   89:invokevirtual   #438 <Method Class Object.getClass()>
	//   43   92:invokevirtual   #443 <Method String Class.getName()>
	//   44   95:astore          5
			if(s.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || s.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"))
	//*  45   97:aload           5
	//*  46   99:ldc2            #445 <String "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream">
	//*  47  102:invokevirtual   #411 <Method boolean String.equals(Object)>
	//*  48  105:ifne            119
	//*  49  108:aload           5
	//*  50  110:ldc2            #447 <String "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream">
	//*  51  113:invokevirtual   #411 <Method boolean String.equals(Object)>
	//*  52  116:ifeq            157
			{
				Method method = obj.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
	//   53  119:aload           4
	//   54  121:invokevirtual   #438 <Method Class Object.getClass()>
	//   55  124:invokevirtual   #450 <Method Class Class.getSuperclass()>
	//   56  127:ldc2            #452 <String "unexpectedEndOfInput">
	//   57  130:iconst_0        
	//   58  131:anewarray       Class[]
	//   59  134:invokevirtual   #456 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   60  137:astore          5
				method.setAccessible(true);
	//   61  139:aload           5
	//   62  141:iconst_1        
	//   63  142:invokevirtual   #461 <Method void Method.setAccessible(boolean)>
				method.invoke(obj, new Object[0]);
	//   64  145:aload           5
	//   65  147:aload           4
	//   66  149:iconst_0        
	//   67  150:anewarray       Object[]
	//   68  153:invokevirtual   #465 <Method Object Method.invoke(Object, Object[])>
	//   69  156:pop             
			}
		}
	//*  70  157:aload_0         
	//*  71  158:getfield        #296 <Field InputStream m>
	//*  72  161:invokevirtual   #466 <Method void InputStream.close()>
	//*  73  164:goto            184
	//*  74  167:astore          4
	//*  75  169:new             #327 <Class bmt>
	//*  76  172:dup             
	//*  77  173:aload           4
	//*  78  175:aload_0         
	//*  79  176:getfield        #329 <Field bmp k>
	//*  80  179:iconst_3        
	//*  81  180:invokespecial   #332 <Method void bmt(IOException, bmp, int)>
	//*  82  183:athrow          
	//*  83  184:aload_0         
	//*  84  185:aconst_null     
	//*  85  186:putfield        #296 <Field InputStream m>
	//*  86  189:aload_0         
	//*  87  190:invokespecial   #373 <Method void d()>
	//*  88  193:aload_0         
	//*  89  194:getfield        #368 <Field boolean n>
	//*  90  197:ifeq            225
	//*  91  200:aload_0         
	//*  92  201:iconst_0        
	//*  93  202:putfield        #368 <Field boolean n>
	//*  94  205:aload_0         
	//*  95  206:getfield        #70  <Field bne j>
	//*  96  209:astore          4
	//*  97  211:aload           4
	//*  98  213:ifnull          225
	//*  99  216:aload           4
	//* 100  218:aload_0         
	//* 101  219:invokeinterface #468 <Method void bne.a(Object)>
	//* 102  224:return          
	//* 103  225:return          
	//* 104  226:astore          4
	//* 105  228:aload_0         
	//* 106  229:aconst_null     
	//* 107  230:putfield        #296 <Field InputStream m>
	//* 108  233:aload_0         
	//* 109  234:invokespecial   #373 <Method void d()>
	//* 110  237:aload_0         
	//* 111  238:getfield        #368 <Field boolean n>
	//* 112  241:ifeq            268
	//* 113  244:aload_0         
	//* 114  245:iconst_0        
	//* 115  246:putfield        #368 <Field boolean n>
	//* 116  249:aload_0         
	//* 117  250:getfield        #70  <Field bne j>
	//* 118  253:astore          5
	//* 119  255:aload           5
	//* 120  257:ifnull          268
	//* 121  260:aload           5
	//* 122  262:aload_0         
	//* 123  263:invokeinterface #468 <Method void bne.a(Object)>
	//* 124  268:aload           4
	//* 125  270:athrow          
		catch(Exception exception) { }
	//  126  271:astore          4
_L5:
		m.close();
		  goto _L2
		obj1;
		throw new bmt(((IOException) (obj1)), k, 3);
_L2:
		m = null;
		d();
		if(n)
		{
			n = false;
			bne bne1 = j;
			if(bne1 != null)
			{
				bne1.a(((Object) (this)));
				return;
			}
		}
		return;
		bne1;
		m = null;
		d();
		if(n)
		{
			n = false;
			bne bne2 = j;
			if(bne2 != null)
				bne2.a(((Object) (this)));
		}
		throw bne1;
	//* 127  273:goto            157
_L7:
		if(l1 <= 2048L) goto _L5; else goto _L8
	//  128  276:lload_2         
	//  129  277:ldc2w           #469 <Long 2048L>
	//  130  280:lcmp            
	//  131  281:ifle            157
	//* 132  284:goto            87
	}

	public final Uri b()
	{
		HttpURLConnection httpurlconnection = l;
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field HttpURLConnection l>
	//    2    4:astore_1        
		if(httpurlconnection == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return Uri.parse(httpurlconnection.getURL().toString());
	//    7   11:aload_1         
	//    8   12:invokevirtual   #475 <Method URL HttpURLConnection.getURL()>
	//    9   15:invokevirtual   #476 <Method String URL.toString()>
	//   10   18:invokestatic    #480 <Method Uri Uri.parse(String)>
	//   11   21:areturn         
	}

	public final Map c()
	{
		HttpURLConnection httpurlconnection = l;
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field HttpURLConnection l>
	//    2    4:astore_1        
		if(httpurlconnection == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return httpurlconnection.getHeaderFields();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #376 <Method Map HttpURLConnection.getHeaderFields()>
	//    9   15:areturn         
	}

	private static final Pattern a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
	private static final AtomicReference b = new AtomicReference();
	private final boolean c;
	private final int d;
	private final int e;
	private final String f;
	private final bnq g;
	private final bmv h;
	private final bmv i;
	private final bne j;
	private bmp k;
	private HttpURLConnection l;
	private InputStream m;
	private boolean n;
	private long o;
	private long p;
	private long q;
	private long r;

	static 
	{
	//    0    0:ldc1            #40  <String "^bytes (\\d+)-(\\d+)/(\\d+)$">
	//    1    2:invokestatic    #46  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #48  <Field Pattern a>
	//    3    8:new             #50  <Class AtomicReference>
	//    4   11:dup             
	//    5   12:invokespecial   #53  <Method void AtomicReference()>
	//    6   15:putstatic       #55  <Field AtomicReference b>
	//*   7   18:return          
	}
}
