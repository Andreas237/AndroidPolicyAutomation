// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android.a;

import android.content.Context;
import android.support.v7.*;
import android.util.Log;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.truenet.android.a:
//			i

public final class g
{

	public static final boolean a(URL url, String s, Context context)
	{
		Object obj;
		Object obj1;
		Object obj2;
		Object obj3;
		ae.b(((Object) (url)), "$receiver");
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <String "$receiver">
	//    2    3:invokestatic    #20  <Method void ae.b(Object, String)>
		ae.b(((Object) (s)), "data");
	//    3    6:aload_1         
	//    4    7:ldc1            #22  <String "data">
	//    5    9:invokestatic    #20  <Method void ae.b(Object, String)>
		obj = ((Object) ((HttpURLConnection)null));
	//    6   12:aconst_null     
	//    7   13:checkcast       #24  <Class HttpURLConnection>
	//    8   16:astore          6
		obj3 = ((Object) ((BufferedOutputStream)null));
	//    9   18:aconst_null     
	//   10   19:checkcast       #26  <Class BufferedOutputStream>
	//   11   22:astore          9
		obj1 = obj;
	//   12   24:aload           6
	//   13   26:astore          7
		obj2 = obj;
	//   14   28:aload           6
	//   15   30:astore          8
		java.net.URLConnection urlconnection = url.openConnection();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #32  <Method java.net.URLConnection URL.openConnection()>
	//   18   36:astore          10
		if(urlconnection != null) goto _L2; else goto _L1
	//   19   38:aload           10
	//   20   40:ifnonnull       92
_L1:
		obj1 = obj;
	//   21   43:aload           6
	//   22   45:astore          7
		obj2 = obj;
	//   23   47:aload           6
	//   24   49:astore          8
		try
		{
			throw new bp("null cannot be cast to non-null type java.net.HttpURLConnection");
	//   25   51:new             #34  <Class bp>
	//   26   54:dup             
	//   27   55:ldc1            #36  <String "null cannot be cast to non-null type java.net.HttpURLConnection">
	//   28   57:invokespecial   #40  <Method void bp(String)>
	//   29   60:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  30   61:astore_1        
		{
			obj = obj1;
	//   31   62:aload           7
	//   32   64:astore          6
		}
_L8:
		int j;
		boolean flag;
		boolean flag1;
		if(obj3 != null)
	//*  33   66:aload           9
	//*  34   68:ifnull          76
			try
			{
				((BufferedOutputStream) (obj3)).close();
	//   35   71:aload           9
	//   36   73:invokevirtual   #44  <Method void BufferedOutputStream.close()>
			}
	//*  37   76:aload           6
	//*  38   78:ifnull          86
	//*  39   81:aload           6
	//*  40   83:invokevirtual   #47  <Method void HttpURLConnection.disconnect()>
	//*  41   86:iconst_0        
	//*  42   87:istore          5
	//*  43   89:iload           5
	//*  44   91:ireturn         
	//*  45   92:aload           6
	//*  46   94:astore          7
	//*  47   96:aload           6
	//*  48   98:astore          8
	//*  49  100:aload           10
	//*  50  102:checkcast       #24  <Class HttpURLConnection>
	//*  51  105:astore          6
	//*  52  107:aload           6
	//*  53  109:astore          7
	//*  54  111:aload           6
	//*  55  113:astore          8
	//*  56  115:aload           6
	//*  57  117:ldc1            #49  <String "Cache-Control">
	//*  58  119:ldc1            #51  <String "no-cache">
	//*  59  121:invokevirtual   #55  <Method void HttpURLConnection.setRequestProperty(String, String)>
	//*  60  124:aload_2         
	//*  61  125:ifnull          150
	//*  62  128:aload           6
	//*  63  130:astore          7
	//*  64  132:aload           6
	//*  65  134:astore          8
	//*  66  136:aload           6
	//*  67  138:ldc1            #57  <String "User-Agent">
	//*  68  140:getstatic       #62  <Field i$a i.a>
	//*  69  143:aload_2         
	//*  70  144:invokevirtual   #67  <Method String i$a.a(Context)>
	//*  71  147:invokevirtual   #55  <Method void HttpURLConnection.setRequestProperty(String, String)>
	//*  72  150:aload           6
	//*  73  152:astore          7
	//*  74  154:aload           6
	//*  75  156:astore          8
	//*  76  158:aload           6
	//*  77  160:ldc1            #69  <String "PUT">
	//*  78  162:invokevirtual   #72  <Method void HttpURLConnection.setRequestMethod(String)>
	//*  79  165:aload           6
	//*  80  167:astore          7
	//*  81  169:aload           6
	//*  82  171:astore          8
	//*  83  173:aload           6
	//*  84  175:iconst_1        
	//*  85  176:invokevirtual   #76  <Method void HttpURLConnection.setDoOutput(boolean)>
	//*  86  179:aload           6
	//*  87  181:astore          7
	//*  88  183:aload           6
	//*  89  185:astore          8
	//*  90  187:aload           6
	//*  91  189:ldc1            #78  <String "Content-Type">
	//*  92  191:ldc1            #80  <String "text/html">
	//*  93  193:invokevirtual   #55  <Method void HttpURLConnection.setRequestProperty(String, String)>
	//*  94  196:aload           6
	//*  95  198:astore          7
	//*  96  200:aload           6
	//*  97  202:astore          8
	//*  98  204:aload_1         
	//*  99  205:getstatic       #85  <Field java.nio.charset.Charset az.a>
	//* 100  208:invokevirtual   #91  <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//* 101  211:astore_2        
	//* 102  212:aload           6
	//* 103  214:astore          7
	//* 104  216:aload           6
	//* 105  218:astore          8
	//* 106  220:aload_2         
	//* 107  221:ldc1            #93  <String "(this as java.lang.String).getBytes(charset)">
	//* 108  223:invokestatic    #95  <Method void ae.a(Object, String)>
	//* 109  226:aload           6
	//* 110  228:astore          7
	//* 111  230:aload           6
	//* 112  232:astore          8
	//* 113  234:aload           6
	//* 114  236:aload_2         
	//* 115  237:arraylength     
	//* 116  238:invokevirtual   #99  <Method void HttpURLConnection.setFixedLengthStreamingMode(int)>
	//* 117  241:aload           6
	//* 118  243:astore          7
	//* 119  245:aload           6
	//* 120  247:astore          8
	//* 121  249:aload           6
	//* 122  251:ldc1            #100 <Int 35000>
	//* 123  253:invokevirtual   #103 <Method void HttpURLConnection.setConnectTimeout(int)>
	//* 124  256:aload           6
	//* 125  258:astore          7
	//* 126  260:aload           6
	//* 127  262:astore          8
	//* 128  264:new             #26  <Class BufferedOutputStream>
	//* 129  267:dup             
	//* 130  268:aload           6
	//* 131  270:invokevirtual   #107 <Method java.io.OutputStream HttpURLConnection.getOutputStream()>
	//* 132  273:invokespecial   #110 <Method void BufferedOutputStream(java.io.OutputStream)>
	//* 133  276:astore_1        
	//* 134  277:aload_1         
	//* 135  278:aload_2         
	//* 136  279:invokevirtual   #114 <Method void BufferedOutputStream.write(byte[])>
	//* 137  282:aload_1         
	//* 138  283:invokevirtual   #117 <Method void BufferedOutputStream.flush()>
	//* 139  286:aload           6
	//* 140  288:invokevirtual   #121 <Method int HttpURLConnection.getResponseCode()>
	//* 141  291:istore_3        
	//* 142  292:sipush          200
	//* 143  295:iload_3         
	//* 144  296:icmple          323
	//* 145  299:iconst_0        
	//* 146  300:istore          4
	//* 147  302:aload_1         
	//* 148  303:invokevirtual   #44  <Method void BufferedOutputStream.close()>
	//* 149  306:iload           4
	//* 150  308:istore          5
	//* 151  310:aload           6
	//* 152  312:ifnull          89
	//* 153  315:aload           6
	//* 154  317:invokevirtual   #47  <Method void HttpURLConnection.disconnect()>
	//* 155  320:iload           4
	//* 156  322:ireturn         
	//* 157  323:sipush          299
	//* 158  326:iload_3         
	//* 159  327:icmplt          299
	//* 160  330:iconst_1        
	//* 161  331:istore          4
	//* 162  333:goto            302
	//* 163  336:astore_1        
	//* 164  337:aload_0         
	//* 165  338:invokevirtual   #125 <Method Class Object.getClass()>
	//* 166  341:invokevirtual   #131 <Method String Class.getCanonicalName()>
	//* 167  344:ldc1            #133 <String "stream closed with error!">
	//* 168  346:aload_1         
	//* 169  347:invokestatic    #139 <Method int Log.e(String, String, Throwable)>
	//* 170  350:pop             
	//* 171  351:goto            306
			// Misplaced declaration of an exception variable
			catch(String s)
	//* 172  354:astore_1        
			{
				Log.e(((Object) (url)).getClass().getCanonicalName(), "stream closed with error!", ((Throwable) (s)));
	//  173  355:aload_0         
	//  174  356:invokevirtual   #125 <Method Class Object.getClass()>
	//  175  359:invokevirtual   #131 <Method String Class.getCanonicalName()>
	//  176  362:ldc1            #133 <String "stream closed with error!">
	//  177  364:aload_1         
	//  178  365:invokestatic    #139 <Method int Log.e(String, String, Throwable)>
	//  179  368:pop             
			}
		if(obj != null)
			((HttpURLConnection) (obj)).disconnect();
		flag1 = false;
_L4:
		return flag1;
_L2:
		obj1 = obj;
		obj2 = obj;
		obj = ((Object) ((HttpURLConnection)urlconnection));
		obj1 = obj;
		obj2 = obj;
		((HttpURLConnection) (obj)).setRequestProperty("Cache-Control", "no-cache");
		if(context == null)
			break MISSING_BLOCK_LABEL_150;
		obj1 = obj;
		obj2 = obj;
		((HttpURLConnection) (obj)).setRequestProperty("User-Agent", i.a.a(context));
		obj1 = obj;
		obj2 = obj;
		((HttpURLConnection) (obj)).setRequestMethod("PUT");
		obj1 = obj;
		obj2 = obj;
		((HttpURLConnection) (obj)).setDoOutput(true);
		obj1 = obj;
		obj2 = obj;
		((HttpURLConnection) (obj)).setRequestProperty("Content-Type", "text/html");
		obj1 = obj;
		obj2 = obj;
		context = ((Context) (s.getBytes(az.a)));
		obj1 = obj;
		obj2 = obj;
		ae.a(((Object) (context)), "(this as java.lang.String).getBytes(charset)");
		obj1 = obj;
		obj2 = obj;
		((HttpURLConnection) (obj)).setFixedLengthStreamingMode(context.length);
		obj1 = obj;
		obj2 = obj;
		((HttpURLConnection) (obj)).setConnectTimeout(35000);
		obj1 = obj;
		obj2 = obj;
		s = ((String) (new BufferedOutputStream(((HttpURLConnection) (obj)).getOutputStream())));
		((BufferedOutputStream) (s)).write(((byte []) (context)));
		((BufferedOutputStream) (s)).flush();
		j = ((HttpURLConnection) (obj)).getResponseCode();
		while(false) 
		{
			if(200 > j || 299 < j)
				flag = false;
			else
				flag = true;
			try
			{
				((BufferedOutputStream) (s)).close();
			}
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				Log.e(((Object) (url)).getClass().getCanonicalName(), "stream closed with error!", ((Throwable) (s)));
			}
			flag1 = flag;
			if(obj != null)
			{
				((HttpURLConnection) (obj)).disconnect();
				return flag;
			}
		}
		if(true) goto _L4; else goto _L3
_L3:
	//* 180  369:goto            76
		s;
	//  181  372:astore_1        
		context = ((Context) (obj2));
	//  182  373:aload           8
	//  183  375:astore_2        
_L6:
		if(obj3 != null)
	//* 184  376:aload           9
	//* 185  378:ifnull          386
			try
			{
				((BufferedOutputStream) (obj3)).close();
	//  186  381:aload           9
	//  187  383:invokevirtual   #44  <Method void BufferedOutputStream.close()>
			}
	//* 188  386:aload_2         
	//* 189  387:ifnull          394
	//* 190  390:aload_2         
	//* 191  391:invokevirtual   #47  <Method void HttpURLConnection.disconnect()>
	//* 192  394:aload_1         
	//* 193  395:athrow          
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//* 194  396:astore          6
			{
				Log.e(((Object) (url)).getClass().getCanonicalName(), "stream closed with error!", ((Throwable) (obj)));
	//  195  398:aload_0         
	//  196  399:invokevirtual   #125 <Method Class Object.getClass()>
	//  197  402:invokevirtual   #131 <Method String Class.getCanonicalName()>
	//  198  405:ldc1            #133 <String "stream closed with error!">
	//  199  407:aload           6
	//  200  409:invokestatic    #139 <Method int Log.e(String, String, Throwable)>
	//  201  412:pop             
			}
		if(context != null)
			((HttpURLConnection) (context)).disconnect();
		throw s;
	//* 202  413:goto            386
		Exception exception;
		exception;
	//  203  416:astore          7
		context = ((Context) (s));
	//  204  418:aload_1         
	//  205  419:astore_2        
		s = ((String) (exception));
	//  206  420:aload           7
	//  207  422:astore_1        
		obj3 = ((Object) (context));
	//  208  423:aload_2         
	//  209  424:astore          9
		context = ((Context) (obj));
	//  210  426:aload           6
	//  211  428:astore_2        
		if(true) goto _L6; else goto _L5
	//  212  429:goto            376
_L5:
		context;
	//  213  432:astore_2        
		obj3 = ((Object) (s));
	//  214  433:aload_1         
	//  215  434:astore          9
		if(true) goto _L8; else goto _L7
	//  216  436:goto            66
_L7:
	}

	public static final String b(URL url, String s, Context context)
	{
		Object obj;
		Object obj1;
		Object obj2;
		Object obj3;
		BufferedOutputStream bufferedoutputstream;
		Object obj4;
		Object obj5;
		obj5 = null;
	//    0    0:aconst_null     
	//    1    1:astore          9
		obj4 = null;
	//    2    3:aconst_null     
	//    3    4:astore          8
		ae.b(((Object) (url)), "$receiver");
	//    4    6:aload_0         
	//    5    7:ldc1            #14  <String "$receiver">
	//    6    9:invokestatic    #20  <Method void ae.b(Object, String)>
		ae.b(((Object) (s)), "data");
	//    7   12:aload_1         
	//    8   13:ldc1            #22  <String "data">
	//    9   15:invokestatic    #20  <Method void ae.b(Object, String)>
		obj = ((Object) ((HttpURLConnection)null));
	//   10   18:aconst_null     
	//   11   19:checkcast       #24  <Class HttpURLConnection>
	//   12   22:astore_3        
		bufferedoutputstream = (BufferedOutputStream)null;
	//   13   23:aconst_null     
	//   14   24:checkcast       #26  <Class BufferedOutputStream>
	//   15   27:astore          7
		obj1 = ((Object) ((BufferedInputStream)null));
	//   16   29:aconst_null     
	//   17   30:checkcast       #144 <Class BufferedInputStream>
	//   18   33:astore          4
		obj2 = obj;
	//   19   35:aload_3         
	//   20   36:astore          5
		obj3 = obj;
	//   21   38:aload_3         
	//   22   39:astore          6
		java.net.URLConnection urlconnection = url.openConnection();
	//   23   41:aload_0         
	//   24   42:invokevirtual   #32  <Method java.net.URLConnection URL.openConnection()>
	//   25   45:astore          10
		if(urlconnection != null) goto _L2; else goto _L1
	//   26   47:aload           10
	//   27   49:ifnonnull       110
_L1:
		obj2 = obj;
	//   28   52:aload_3         
	//   29   53:astore          5
		obj3 = obj;
	//   30   55:aload_3         
	//   31   56:astore          6
		try
		{
			throw new bp("null cannot be cast to non-null type java.net.HttpURLConnection");
	//   32   58:new             #34  <Class bp>
	//   33   61:dup             
	//   34   62:ldc1            #36  <String "null cannot be cast to non-null type java.net.HttpURLConnection">
	//   35   64:invokespecial   #40  <Method void bp(String)>
	//   36   67:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  37   68:astore_1        
		{
			context = ((Context) (obj1));
	//   38   69:aload           4
	//   39   71:astore_2        
		}
		s = ((String) (bufferedoutputstream));
	//   40   72:aload           7
	//   41   74:astore_1        
		obj = obj2;
	//   42   75:aload           5
	//   43   77:astore_3        
_L8:
		if(s == null)
			break MISSING_BLOCK_LABEL_86;
	//   44   78:aload_1         
	//   45   79:ifnull          86
		((BufferedOutputStream) (s)).close();
	//   46   82:aload_1         
	//   47   83:invokevirtual   #44  <Method void BufferedOutputStream.close()>
		static final class a extends af
			implements v
		{

			public Object a()
			{
				return ((Object) (b()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #31  <Method String b()>
			//    2    4:areturn         
			}

			public final String b()
			{
				$line.a = ((Object) ($reader.readLine()));
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field android.support.v7.aj$a $line>
			//    2    4:aload_0         
			//    3    5:getfield        #22  <Field BufferedReader $reader>
			//    4    8:invokevirtual   #37  <Method String BufferedReader.readLine()>
			//    5   11:putfield        #42  <Field Object android.support.v7.aj$a.a>
				return (String)$line.a;
			//    6   14:aload_0         
			//    7   15:getfield        #20  <Field android.support.v7.aj$a $line>
			//    8   18:getfield        #42  <Field Object android.support.v7.aj$a.a>
			//    9   21:checkcast       #44  <Class String>
			//   10   24:areturn         
			}

			final android.support.v7.aj.a $line;
			final BufferedReader $reader;

			a(android.support.v7.aj.a a1, BufferedReader bufferedreader)
			{
				$line = a1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field android.support.v7.aj$a $line>
				$reader = bufferedreader;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field BufferedReader $reader>
				super(0);
			//    6   10:aload_0         
			//    7   11:iconst_0        
			//    8   12:invokespecial   #25  <Method void af(int)>
			//    9   15:return          
			}
		}

		if(context != null)
	//*  48   86:aload_2         
	//*  49   87:ifnull          94
			try
			{
				((BufferedInputStream) (context)).close();
	//   50   90:aload_2         
	//   51   91:invokevirtual   #145 <Method void BufferedInputStream.close()>
			}
	//*  52   94:aload           8
	//*  53   96:astore_0        
	//*  54   97:aload_3         
	//*  55   98:ifnull          108
	//*  56  101:aload_3         
	//*  57  102:invokevirtual   #47  <Method void HttpURLConnection.disconnect()>
	//*  58  105:aload           8
	//*  59  107:astore_0        
	//*  60  108:aload_0         
	//*  61  109:areturn         
	//*  62  110:aload_3         
	//*  63  111:astore          5
	//*  64  113:aload_3         
	//*  65  114:astore          6
	//*  66  116:aload           10
	//*  67  118:checkcast       #24  <Class HttpURLConnection>
	//*  68  121:astore_3        
	//*  69  122:aload_3         
	//*  70  123:astore          5
	//*  71  125:aload_3         
	//*  72  126:astore          6
	//*  73  128:aload_3         
	//*  74  129:ldc1            #49  <String "Cache-Control">
	//*  75  131:ldc1            #51  <String "no-cache">
	//*  76  133:invokevirtual   #55  <Method void HttpURLConnection.setRequestProperty(String, String)>
	//*  77  136:aload_2         
	//*  78  137:ifnull          159
	//*  79  140:aload_3         
	//*  80  141:astore          5
	//*  81  143:aload_3         
	//*  82  144:astore          6
	//*  83  146:aload_3         
	//*  84  147:ldc1            #57  <String "User-Agent">
	//*  85  149:getstatic       #62  <Field i$a i.a>
	//*  86  152:aload_2         
	//*  87  153:invokevirtual   #67  <Method String i$a.a(Context)>
	//*  88  156:invokevirtual   #55  <Method void HttpURLConnection.setRequestProperty(String, String)>
	//*  89  159:aload_3         
	//*  90  160:astore          5
	//*  91  162:aload_3         
	//*  92  163:astore          6
	//*  93  165:aload_3         
	//*  94  166:ldc1            #147 <String "POST">
	//*  95  168:invokevirtual   #72  <Method void HttpURLConnection.setRequestMethod(String)>
	//*  96  171:aload_3         
	//*  97  172:astore          5
	//*  98  174:aload_3         
	//*  99  175:astore          6
	//* 100  177:aload_3         
	//* 101  178:iconst_1        
	//* 102  179:invokevirtual   #76  <Method void HttpURLConnection.setDoOutput(boolean)>
	//* 103  182:aload_3         
	//* 104  183:astore          5
	//* 105  185:aload_3         
	//* 106  186:astore          6
	//* 107  188:aload_3         
	//* 108  189:iconst_1        
	//* 109  190:invokevirtual   #150 <Method void HttpURLConnection.setDoInput(boolean)>
	//* 110  193:aload_3         
	//* 111  194:astore          5
	//* 112  196:aload_3         
	//* 113  197:astore          6
	//* 114  199:aload_1         
	//* 115  200:getstatic       #85  <Field java.nio.charset.Charset az.a>
	//* 116  203:invokevirtual   #91  <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//* 117  206:astore_2        
	//* 118  207:aload_3         
	//* 119  208:astore          5
	//* 120  210:aload_3         
	//* 121  211:astore          6
	//* 122  213:aload_2         
	//* 123  214:ldc1            #93  <String "(this as java.lang.String).getBytes(charset)">
	//* 124  216:invokestatic    #95  <Method void ae.a(Object, String)>
	//* 125  219:aload_3         
	//* 126  220:astore          5
	//* 127  222:aload_3         
	//* 128  223:astore          6
	//* 129  225:aload_3         
	//* 130  226:aload_2         
	//* 131  227:arraylength     
	//* 132  228:invokevirtual   #99  <Method void HttpURLConnection.setFixedLengthStreamingMode(int)>
	//* 133  231:aload_3         
	//* 134  232:astore          5
	//* 135  234:aload_3         
	//* 136  235:astore          6
	//* 137  237:aload_3         
	//* 138  238:ldc1            #78  <String "Content-Type">
	//* 139  240:ldc1            #152 <String "application/json">
	//* 140  242:invokevirtual   #55  <Method void HttpURLConnection.setRequestProperty(String, String)>
	//* 141  245:aload_3         
	//* 142  246:astore          5
	//* 143  248:aload_3         
	//* 144  249:astore          6
	//* 145  251:aload_3         
	//* 146  252:ldc1            #100 <Int 35000>
	//* 147  254:invokevirtual   #155 <Method void HttpURLConnection.setReadTimeout(int)>
	//* 148  257:aload_3         
	//* 149  258:astore          5
	//* 150  260:aload_3         
	//* 151  261:astore          6
	//* 152  263:aload_3         
	//* 153  264:ldc1            #100 <Int 35000>
	//* 154  266:invokevirtual   #103 <Method void HttpURLConnection.setConnectTimeout(int)>
	//* 155  269:aload_3         
	//* 156  270:astore          5
	//* 157  272:aload_3         
	//* 158  273:astore          6
	//* 159  275:new             #26  <Class BufferedOutputStream>
	//* 160  278:dup             
	//* 161  279:aload_3         
	//* 162  280:invokevirtual   #107 <Method java.io.OutputStream HttpURLConnection.getOutputStream()>
	//* 163  283:invokespecial   #110 <Method void BufferedOutputStream(java.io.OutputStream)>
	//* 164  286:astore_1        
	//* 165  287:aload_1         
	//* 166  288:aload_2         
	//* 167  289:invokevirtual   #114 <Method void BufferedOutputStream.write(byte[])>
	//* 168  292:aload_1         
	//* 169  293:invokevirtual   #117 <Method void BufferedOutputStream.flush()>
	//* 170  296:aload_3         
	//* 171  297:invokevirtual   #121 <Method int HttpURLConnection.getResponseCode()>
	//* 172  300:sipush          200
	//* 173  303:icmpne          446
	//* 174  306:new             #157 <Class StringBuilder>
	//* 175  309:dup             
	//* 176  310:invokespecial   #159 <Method void StringBuilder()>
	//* 177  313:astore          5
	//* 178  315:new             #144 <Class BufferedInputStream>
	//* 179  318:dup             
	//* 180  319:aload_3         
	//* 181  320:invokevirtual   #163 <Method InputStream HttpURLConnection.getInputStream()>
	//* 182  323:invokespecial   #166 <Method void BufferedInputStream(InputStream)>
	//* 183  326:astore_2        
	//* 184  327:new             #168 <Class BufferedReader>
	//* 185  330:dup             
	//* 186  331:new             #170 <Class InputStreamReader>
	//* 187  334:dup             
	//* 188  335:aload_2         
	//* 189  336:checkcast       #172 <Class InputStream>
	//* 190  339:invokespecial   #173 <Method void InputStreamReader(InputStream)>
	//* 191  342:checkcast       #175 <Class Reader>
	//* 192  345:invokespecial   #178 <Method void BufferedReader(Reader)>
	//* 193  348:astore          4
	//* 194  350:new             #180 <Class android.support.v7.aj$a>
	//* 195  353:dup             
	//* 196  354:invokespecial   #181 <Method void android.support.v7.aj$a()>
	//* 197  357:astore          6
	//* 198  359:aload           6
	//* 199  361:aconst_null     
	//* 200  362:checkcast       #87  <Class String>
	//* 201  365:putfield        #184 <Field Object android.support.v7.aj$a.a>
	//* 202  368:new             #6   <Class g$a>
	//* 203  371:dup             
	//* 204  372:aload           6
	//* 205  374:aload           4
	//* 206  376:invokespecial   #187 <Method void g$a(android.support.v7.aj$a, BufferedReader)>
	//* 207  379:checkcast       #189 <Class v>
	//* 208  382:invokeinterface #192 <Method Object v.a()>
	//* 209  387:ifnull          407
	//* 210  390:aload           5
	//* 211  392:aload           6
	//* 212  394:getfield        #184 <Field Object android.support.v7.aj$a.a>
	//* 213  397:checkcast       #87  <Class String>
	//* 214  400:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//* 215  403:pop             
	//* 216  404:goto            368
	//* 217  407:aload           5
	//* 218  409:invokevirtual   #199 <Method String StringBuilder.toString()>
	//* 219  412:astore          4
	//* 220  414:aload_2         
	//* 221  415:astore          5
	//* 222  417:aload           4
	//* 223  419:astore_2        
	//* 224  420:aload_1         
	//* 225  421:invokevirtual   #44  <Method void BufferedOutputStream.close()>
	//* 226  424:aload           5
	//* 227  426:ifnull          434
	//* 228  429:aload           5
	//* 229  431:invokevirtual   #145 <Method void BufferedInputStream.close()>
	//* 230  434:aload_2         
	//* 231  435:astore_0        
	//* 232  436:aload_3         
	//* 233  437:ifnull          108
	//* 234  440:aload_3         
	//* 235  441:invokevirtual   #47  <Method void HttpURLConnection.disconnect()>
	//* 236  444:aload_2         
	//* 237  445:areturn         
	//* 238  446:aload           9
	//* 239  448:astore_2        
	//* 240  449:aload           4
	//* 241  451:astore          5
	//* 242  453:goto            420
	//* 243  456:astore_1        
	//* 244  457:aload_0         
	//* 245  458:invokevirtual   #125 <Method Class Object.getClass()>
	//* 246  461:invokevirtual   #131 <Method String Class.getCanonicalName()>
	//* 247  464:ldc1            #133 <String "stream closed with error!">
	//* 248  466:aload_1         
	//* 249  467:invokestatic    #139 <Method int Log.e(String, String, Throwable)>
	//* 250  470:pop             
	//* 251  471:goto            434
			// Misplaced declaration of an exception variable
			catch(String s)
	//* 252  474:astore_1        
			{
				Log.e(((Object) (url)).getClass().getCanonicalName(), "stream closed with error!", ((Throwable) (s)));
	//  253  475:aload_0         
	//  254  476:invokevirtual   #125 <Method Class Object.getClass()>
	//  255  479:invokevirtual   #131 <Method String Class.getCanonicalName()>
	//  256  482:ldc1            #133 <String "stream closed with error!">
	//  257  484:aload_1         
	//  258  485:invokestatic    #139 <Method int Log.e(String, String, Throwable)>
	//  259  488:pop             
			}
		url = ((URL) (obj4));
		if(obj != null)
		{
			((HttpURLConnection) (obj)).disconnect();
			url = ((URL) (obj4));
		}
		return ((String) (url));
_L2:
		obj2 = obj;
		obj3 = obj;
		obj = ((Object) ((HttpURLConnection)urlconnection));
		obj2 = obj;
		obj3 = obj;
		((HttpURLConnection) (obj)).setRequestProperty("Cache-Control", "no-cache");
		if(context == null)
			break MISSING_BLOCK_LABEL_159;
		obj2 = obj;
		obj3 = obj;
		((HttpURLConnection) (obj)).setRequestProperty("User-Agent", i.a.a(context));
		obj2 = obj;
		obj3 = obj;
		((HttpURLConnection) (obj)).setRequestMethod("POST");
		obj2 = obj;
		obj3 = obj;
		((HttpURLConnection) (obj)).setDoOutput(true);
		obj2 = obj;
		obj3 = obj;
		((HttpURLConnection) (obj)).setDoInput(true);
		obj2 = obj;
		obj3 = obj;
		context = ((Context) (s.getBytes(az.a)));
		obj2 = obj;
		obj3 = obj;
		ae.a(((Object) (context)), "(this as java.lang.String).getBytes(charset)");
		obj2 = obj;
		obj3 = obj;
		((HttpURLConnection) (obj)).setFixedLengthStreamingMode(context.length);
		obj2 = obj;
		obj3 = obj;
		((HttpURLConnection) (obj)).setRequestProperty("Content-Type", "application/json");
		obj2 = obj;
		obj3 = obj;
		((HttpURLConnection) (obj)).setReadTimeout(35000);
		obj2 = obj;
		obj3 = obj;
		((HttpURLConnection) (obj)).setConnectTimeout(35000);
		obj2 = obj;
		obj3 = obj;
		s = ((String) (new BufferedOutputStream(((HttpURLConnection) (obj)).getOutputStream())));
		Exception exception;
		try
		{
			((BufferedOutputStream) (s)).write(((byte []) (context)));
			((BufferedOutputStream) (s)).flush();
			if(((HttpURLConnection) (obj)).getResponseCode() != 200)
				break MISSING_BLOCK_LABEL_446;
			obj2 = ((Object) (new StringBuilder()));
			context = ((Context) (new BufferedInputStream(((HttpURLConnection) (obj)).getInputStream())));
		}
	//* 260  489:goto            94
	//* 261  492:astore_1        
	//* 262  493:aload           6
	//* 263  495:astore_2        
	//* 264  496:aload           7
	//* 265  498:astore_3        
	//* 266  499:aload_3         
	//* 267  500:ifnull          507
	//* 268  503:aload_3         
	//* 269  504:invokevirtual   #44  <Method void BufferedOutputStream.close()>
	//* 270  507:aload           4
	//* 271  509:ifnull          517
	//* 272  512:aload           4
	//* 273  514:invokevirtual   #145 <Method void BufferedInputStream.close()>
	//* 274  517:aload_2         
	//* 275  518:ifnull          525
	//* 276  521:aload_2         
	//* 277  522:invokevirtual   #47  <Method void HttpURLConnection.disconnect()>
	//* 278  525:aload_1         
	//* 279  526:athrow          
	//* 280  527:astore_3        
	//* 281  528:aload_0         
	//* 282  529:invokevirtual   #125 <Method Class Object.getClass()>
	//* 283  532:invokevirtual   #131 <Method String Class.getCanonicalName()>
	//* 284  535:ldc1            #133 <String "stream closed with error!">
	//* 285  537:aload_3         
	//* 286  538:invokestatic    #139 <Method int Log.e(String, String, Throwable)>
	//* 287  541:pop             
	//* 288  542:goto            517
	//* 289  545:astore          6
	//* 290  547:aload_1         
	//* 291  548:astore          5
	//* 292  550:aload_3         
	//* 293  551:astore_2        
	//* 294  552:aload           6
	//* 295  554:astore_1        
	//* 296  555:aload           5
	//* 297  557:astore_3        
	//* 298  558:goto            499
	//* 299  561:astore          6
	//* 300  563:aload_2         
	//* 301  564:astore          4
	//* 302  566:aload_1         
	//* 303  567:astore          5
	//* 304  569:aload_3         
	//* 305  570:astore_2        
	//* 306  571:aload           6
	//* 307  573:astore_1        
	//* 308  574:aload           5
	//* 309  576:astore_3        
	//* 310  577:goto            499
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 311  580:astore_2        
		{
			context = ((Context) (obj1));
	//  312  581:aload           4
	//  313  583:astore_2        
			continue; /* Loop/switch isn't completed */
	//  314  584:goto            78
		}
		obj1 = ((Object) (new BufferedReader((Reader)new InputStreamReader((InputStream)context))));
		obj3 = ((Object) (new android.support.v7.aj.a()));
		obj3.a = ((Object) ((String)null));
		for(; ((v)new a(((android.support.v7.aj.a) (obj3)), ((BufferedReader) (obj1)))).a() != null; ((StringBuilder) (obj2)).append((String)((android.support.v7.aj.a) (obj3)).a));
		obj1 = ((Object) (((StringBuilder) (obj2)).toString()));
		obj2 = ((Object) (context));
		context = ((Context) (obj1));
_L4:
		((BufferedOutputStream) (s)).close();
		if(obj2 != null)
			try
			{
				((BufferedInputStream) (obj2)).close();
			}
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				Log.e(((Object) (url)).getClass().getCanonicalName(), "stream closed with error!", ((Throwable) (s)));
			}
		url = ((URL) (context));
		if(obj != null)
		{
			((HttpURLConnection) (obj)).disconnect();
			return ((String) (context));
		}
		break MISSING_BLOCK_LABEL_108;
		context = ((Context) (obj5));
		obj2 = obj1;
		if(true) goto _L4; else goto _L3
_L3:
		s;
		context = ((Context) (obj3));
		obj = ((Object) (bufferedoutputstream));
_L6:
		if(obj == null)
			break MISSING_BLOCK_LABEL_507;
		((BufferedOutputStream) (obj)).close();
		if(obj1 != null)
			try
			{
				((BufferedInputStream) (obj1)).close();
			}
			// Misplaced declaration of an exception variable
			catch(Object obj)
			{
				Log.e(((Object) (url)).getClass().getCanonicalName(), "stream closed with error!", ((Throwable) (obj)));
			}
		if(context != null)
			((HttpURLConnection) (context)).disconnect();
		throw s;
		exception;
		String s1 = s;
		context = ((Context) (obj));
		s = ((String) (exception));
		obj = ((Object) (s1));
		continue; /* Loop/switch isn't completed */
		exception;
		obj1 = ((Object) (context));
		String s2 = s;
		context = ((Context) (obj));
		s = ((String) (exception));
		obj = ((Object) (s2));
		if(true) goto _L6; else goto _L5
_L5:
		break MISSING_BLOCK_LABEL_327;
		Throwable throwable;
		throwable;
	//  315  587:astore          4
		if(true) goto _L8; else goto _L7
	//  316  589:goto            78
_L7:
	}
}
