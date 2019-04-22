// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.support;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import bo.app.k;
import com.appboy.Appboy;
import com.appboy.enums.AppboyViewBounds;
import com.newrelic.agent.android.instrumentation.BitmapFactoryInstrumentation;
import java.io.*;
import java.net.*;

// Referenced classes of package com.appboy.support:
//			AppboyLogger, AppboyFileUtils

public class AppboyImageUtils
{

	public AppboyImageUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	static int a(android.graphics.BitmapFactory.Options options, int i, int j)
	{
		int j1 = options.outHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int android.graphics.BitmapFactory$Options.outHeight>
	//    2    4:istore          5
		int k1 = options.outWidth;
	//    3    6:aload_0         
	//    4    7:getfield        #32  <Field int android.graphics.BitmapFactory$Options.outWidth>
	//    5   10:istore          6
		Object obj = ((Object) (a));
	//    6   12:getstatic       #17  <Field String a>
	//    7   15:astore          7
		StringBuilder stringbuilder = new StringBuilder();
	//    8   17:new             #34  <Class StringBuilder>
	//    9   20:dup             
	//   10   21:invokespecial   #35  <Method void StringBuilder()>
	//   11   24:astore          8
		stringbuilder.append("Calculating sample size for source image bounds: (height ");
	//   12   26:aload           8
	//   13   28:ldc1            #37  <String "Calculating sample size for source image bounds: (height ">
	//   14   30:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
		stringbuilder.append(options.outHeight);
	//   16   34:aload           8
	//   17   36:aload_0         
	//   18   37:getfield        #29  <Field int android.graphics.BitmapFactory$Options.outHeight>
	//   19   40:invokevirtual   #44  <Method StringBuilder StringBuilder.append(int)>
	//   20   43:pop             
		stringbuilder.append(" width ");
	//   21   44:aload           8
	//   22   46:ldc1            #46  <String " width ">
	//   23   48:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   24   51:pop             
		stringbuilder.append(options.outWidth);
	//   25   52:aload           8
	//   26   54:aload_0         
	//   27   55:getfield        #32  <Field int android.graphics.BitmapFactory$Options.outWidth>
	//   28   58:invokevirtual   #44  <Method StringBuilder StringBuilder.append(int)>
	//   29   61:pop             
		stringbuilder.append(") and destination image bounds: (height ");
	//   30   62:aload           8
	//   31   64:ldc1            #48  <String ") and destination image bounds: (height ">
	//   32   66:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   33   69:pop             
		stringbuilder.append(j);
	//   34   70:aload           8
	//   35   72:iload_2         
	//   36   73:invokevirtual   #44  <Method StringBuilder StringBuilder.append(int)>
	//   37   76:pop             
		stringbuilder.append(" width ");
	//   38   77:aload           8
	//   39   79:ldc1            #46  <String " width ">
	//   40   81:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   41   84:pop             
		stringbuilder.append(i);
	//   42   85:aload           8
	//   43   87:iload_1         
	//   44   88:invokevirtual   #44  <Method StringBuilder StringBuilder.append(int)>
	//   45   91:pop             
		stringbuilder.append(")");
	//   46   92:aload           8
	//   47   94:ldc1            #50  <String ")">
	//   48   96:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   49   99:pop             
		AppboyLogger.d(((String) (obj)), stringbuilder.toString());
	//   50  100:aload           7
	//   51  102:aload           8
	//   52  104:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   53  107:invokestatic    #58  <Method int AppboyLogger.d(String, String)>
	//   54  110:pop             
		int i1 = 1;
	//   55  111:iconst_1        
	//   56  112:istore          4
		int l = 1;
	//   57  114:iconst_1        
	//   58  115:istore_3        
		if(j1 > j || k1 > i)
	//*  59  116:iload           5
	//*  60  118:iload_2         
	//*  61  119:icmpgt          128
	//*  62  122:iload           6
	//*  63  124:iload_1         
	//*  64  125:icmple          169
		{
			j1 /= 2;
	//   65  128:iload           5
	//   66  130:iconst_2        
	//   67  131:idiv            
	//   68  132:istore          5
			k1 /= 2;
	//   69  134:iload           6
	//   70  136:iconst_2        
	//   71  137:idiv            
	//   72  138:istore          6
			do
			{
				i1 = l;
	//   73  140:iload_3         
	//   74  141:istore          4
				if(j1 / l < j)
					break;
	//   75  143:iload           5
	//   76  145:iload_3         
	//   77  146:idiv            
	//   78  147:iload_2         
	//   79  148:icmplt          169
				i1 = l;
	//   80  151:iload_3         
	//   81  152:istore          4
				if(k1 / l < i)
					break;
	//   82  154:iload           6
	//   83  156:iload_3         
	//   84  157:idiv            
	//   85  158:iload_1         
	//   86  159:icmplt          169
				l *= 2;
	//   87  162:iload_3         
	//   88  163:iconst_2        
	//   89  164:imul            
	//   90  165:istore_3        
			} while(true);
	//   91  166:goto            140
		}
		options = ((android.graphics.BitmapFactory.Options) (a));
	//   92  169:getstatic       #17  <Field String a>
	//   93  172:astore_0        
		obj = ((Object) (new StringBuilder()));
	//   94  173:new             #34  <Class StringBuilder>
	//   95  176:dup             
	//   96  177:invokespecial   #35  <Method void StringBuilder()>
	//   97  180:astore          7
		((StringBuilder) (obj)).append("Using image sample size of ");
	//   98  182:aload           7
	//   99  184:ldc1            #60  <String "Using image sample size of ">
	//  100  186:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//  101  189:pop             
		((StringBuilder) (obj)).append(i1);
	//  102  190:aload           7
	//  103  192:iload           4
	//  104  194:invokevirtual   #44  <Method StringBuilder StringBuilder.append(int)>
	//  105  197:pop             
		AppboyLogger.d(((String) (options)), ((StringBuilder) (obj)).toString());
	//  106  198:aload_0         
	//  107  199:aload           7
	//  108  201:invokevirtual   #54  <Method String StringBuilder.toString()>
	//  109  204:invokestatic    #58  <Method int AppboyLogger.d(String, String)>
	//  110  207:pop             
		return i1;
	//  111  208:iload           4
	//  112  210:ireturn         
	}

	private static Bitmap a(Uri uri)
	{
		Object obj;
		obj = ((Object) (new File(uri.getPath())));
	//    0    0:new             #70  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #75  <Method String Uri.getPath()>
	//    4    8:invokespecial   #78  <Method void File(String)>
	//    5   11:astore_1        
		if(!((File) (obj)).exists())
			break MISSING_BLOCK_LABEL_168;
	//    6   12:aload_1         
	//    7   13:invokevirtual   #82  <Method boolean File.exists()>
	//    8   16:ifeq            168
		String s = a;
	//    9   19:getstatic       #17  <Field String a>
	//   10   22:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   11   23:new             #34  <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #35  <Method void StringBuilder()>
	//   14   30:astore_3        
		stringbuilder.append("Retrieving image from path: ");
	//   15   31:aload_3         
	//   16   32:ldc1            #84  <String "Retrieving image from path: ">
	//   17   34:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
		stringbuilder.append(((File) (obj)).getAbsolutePath());
	//   19   38:aload_3         
	//   20   39:aload_1         
	//   21   40:invokevirtual   #87  <Method String File.getAbsolutePath()>
	//   22   43:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
		AppboyLogger.i(s, stringbuilder.toString());
	//   24   47:aload_2         
	//   25   48:aload_3         
	//   26   49:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   27   52:invokestatic    #90  <Method int AppboyLogger.i(String, String)>
	//   28   55:pop             
		obj = ((Object) (BitmapFactoryInstrumentation.decodeFile(((File) (obj)).getAbsolutePath())));
	//   29   56:aload_1         
	//   30   57:invokevirtual   #87  <Method String File.getAbsolutePath()>
	//   31   60:invokestatic    #96  <Method Bitmap BitmapFactoryInstrumentation.decodeFile(String)>
	//   32   63:astore_1        
		return ((Bitmap) (obj));
	//   33   64:aload_1         
	//   34   65:areturn         
		Object obj1;
		obj1;
	//   35   66:astore_1        
		String s1 = a;
	//   36   67:getstatic       #17  <Field String a>
	//   37   70:astore_2        
		StringBuilder stringbuilder1 = new StringBuilder();
	//   38   71:new             #34  <Class StringBuilder>
	//   39   74:dup             
	//   40   75:invokespecial   #35  <Method void StringBuilder()>
	//   41   78:astore_3        
		stringbuilder1.append("Throwable caught in local bitmap file retrieval for Uri: ");
	//   42   79:aload_3         
	//   43   80:ldc1            #98  <String "Throwable caught in local bitmap file retrieval for Uri: ">
	//   44   82:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   45   85:pop             
		stringbuilder1.append(uri.toString());
	//   46   86:aload_3         
	//   47   87:aload_0         
	//   48   88:invokevirtual   #99  <Method String Uri.toString()>
	//   49   91:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   50   94:pop             
		AppboyLogger.e(s1, stringbuilder1.toString(), ((Throwable) (obj1)));
	//   51   95:aload_2         
	//   52   96:aload_3         
	//   53   97:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   54  100:aload_1         
	//   55  101:invokestatic    #103 <Method int AppboyLogger.e(String, String, Throwable)>
	//   56  104:pop             
		break MISSING_BLOCK_LABEL_168;
	//   57  105:goto            168
		uri;
	//   58  108:astore_0        
		AppboyLogger.e(a, "Exception occurred when attempting to retrieve local bitmap.", ((Throwable) (uri)));
	//   59  109:getstatic       #17  <Field String a>
	//   60  112:ldc1            #105 <String "Exception occurred when attempting to retrieve local bitmap.">
	//   61  114:aload_0         
	//   62  115:invokestatic    #103 <Method int AppboyLogger.e(String, String, Throwable)>
	//   63  118:pop             
		break MISSING_BLOCK_LABEL_168;
	//   64  119:goto            168
		obj1;
	//   65  122:astore_1        
		String s2 = a;
	//   66  123:getstatic       #17  <Field String a>
	//   67  126:astore_2        
		StringBuilder stringbuilder2 = new StringBuilder();
	//   68  127:new             #34  <Class StringBuilder>
	//   69  130:dup             
	//   70  131:invokespecial   #35  <Method void StringBuilder()>
	//   71  134:astore_3        
		stringbuilder2.append("Out of Memory Error in local bitmap file retrieval for Uri: ");
	//   72  135:aload_3         
	//   73  136:ldc1            #107 <String "Out of Memory Error in local bitmap file retrieval for Uri: ">
	//   74  138:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   75  141:pop             
		stringbuilder2.append(uri.toString());
	//   76  142:aload_3         
	//   77  143:aload_0         
	//   78  144:invokevirtual   #99  <Method String Uri.toString()>
	//   79  147:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   80  150:pop             
		stringbuilder2.append(".");
	//   81  151:aload_3         
	//   82  152:ldc1            #109 <String ".">
	//   83  154:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   84  157:pop             
		AppboyLogger.e(s2, stringbuilder2.toString(), ((Throwable) (obj1)));
	//   85  158:aload_2         
	//   86  159:aload_3         
	//   87  160:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   88  163:aload_1         
	//   89  164:invokestatic    #103 <Method int AppboyLogger.e(String, String, Throwable)>
	//   90  167:pop             
		return null;
	//   91  168:aconst_null     
	//   92  169:areturn         
	}

	private static Bitmap a(Uri uri, int i, int j)
	{
		String s;
		s = uri.toString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #99  <Method String Uri.toString()>
	//    2    4:astore          8
		if(Appboy.getOutboundNetworkRequestsOffline())
	//*   3    6:invokestatic    #121 <Method boolean Appboy.getOutboundNetworkRequestsOffline()>
	//*   4    9:ifeq            53
		{
			uri = ((Uri) (a));
	//    5   12:getstatic       #17  <Field String a>
	//    6   15:astore_0        
			StringBuilder stringbuilder = new StringBuilder();
	//    7   16:new             #34  <Class StringBuilder>
	//    8   19:dup             
	//    9   20:invokespecial   #35  <Method void StringBuilder()>
	//   10   23:astore          4
			stringbuilder.append("SDK is in offline mode, not downloading remote bitmap with uri: ");
	//   11   25:aload           4
	//   12   27:ldc1            #123 <String "SDK is in offline mode, not downloading remote bitmap with uri: ">
	//   13   29:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   14   32:pop             
			stringbuilder.append(s);
	//   15   33:aload           4
	//   16   35:aload           8
	//   17   37:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   18   40:pop             
			AppboyLogger.i(((String) (uri)), stringbuilder.toString());
	//   19   41:aload_0         
	//   20   42:aload           4
	//   21   44:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   22   47:invokestatic    #90  <Method int AppboyLogger.i(String, String)>
	//   23   50:pop             
			return null;
	//   24   51:aconst_null     
	//   25   52:areturn         
		}
		Object obj2;
		Object obj5;
		obj5 = ((Object) (new URL(s)));
	//   26   53:new             #125 <Class URL>
	//   27   56:dup             
	//   28   57:aload           8
	//   29   59:invokespecial   #126 <Method void URL(String)>
	//   30   62:astore          9
		obj2 = ((Object) ((HttpURLConnection)k.a(((URL) (obj5)))));
	//   31   64:aload           9
	//   32   66:invokestatic    #131 <Method java.net.URLConnection k.a(URL)>
	//   33   69:checkcast       #133 <Class HttpURLConnection>
	//   34   72:astore          6
		Object obj;
		Object obj1;
		Object obj3;
		Object obj4;
		int l;
		Object obj6;
		try
		{
			l = ((HttpURLConnection) (obj2)).getResponseCode();
	//   35   74:aload           6
	//   36   76:invokevirtual   #137 <Method int HttpURLConnection.getResponseCode()>
	//   37   79:istore_3        
		}
	//*  38   80:iload_3         
	//*  39   81:sipush          200
	//*  40   84:icmpeq          161
	//*  41   87:getstatic       #17  <Field String a>
	//*  42   90:astore_0        
	//*  43   91:new             #34  <Class StringBuilder>
	//*  44   94:dup             
	//*  45   95:invokespecial   #35  <Method void StringBuilder()>
	//*  46   98:astore          4
	//*  47  100:aload           4
	//*  48  102:ldc1            #139 <String "HTTP response code was ">
	//*  49  104:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//*  50  107:pop             
	//*  51  108:aload           4
	//*  52  110:iload_3         
	//*  53  111:invokevirtual   #44  <Method StringBuilder StringBuilder.append(int)>
	//*  54  114:pop             
	//*  55  115:aload           4
	//*  56  117:ldc1            #141 <String ". Bitmap with url ">
	//*  57  119:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//*  58  122:pop             
	//*  59  123:aload           4
	//*  60  125:aload           9
	//*  61  127:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//*  62  130:pop             
	//*  63  131:aload           4
	//*  64  133:ldc1            #146 <String " could not be downloaded.">
	//*  65  135:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//*  66  138:pop             
	//*  67  139:aload_0         
	//*  68  140:aload           4
	//*  69  142:invokevirtual   #54  <Method String StringBuilder.toString()>
	//*  70  145:invokestatic    #149 <Method int AppboyLogger.w(String, String)>
	//*  71  148:pop             
	//*  72  149:aload           6
	//*  73  151:ifnull          159
	//*  74  154:aload           6
	//*  75  156:invokevirtual   #152 <Method void HttpURLConnection.disconnect()>
	//*  76  159:aconst_null     
	//*  77  160:areturn         
	//*  78  161:aload           6
	//*  79  163:invokevirtual   #156 <Method InputStream HttpURLConnection.getInputStream()>
	//*  80  166:astore_0        
	//*  81  167:iload_1         
	//*  82  168:ifeq            685
	//*  83  171:iload_2         
	//*  84  172:ifeq            685
	//*  85  175:aload           6
	//*  86  177:astore          4
	//*  87  179:aload_0         
	//*  88  180:astore          5
	//*  89  182:getstatic       #17  <Field String a>
	//*  90  185:astore          7
	//*  91  187:aload           6
	//*  92  189:astore          4
	//*  93  191:aload_0         
	//*  94  192:astore          5
	//*  95  194:new             #34  <Class StringBuilder>
	//*  96  197:dup             
	//*  97  198:invokespecial   #35  <Method void StringBuilder()>
	//*  98  201:astore          10
	//*  99  203:aload           6
	//* 100  205:astore          4
	//* 101  207:aload_0         
	//* 102  208:astore          5
	//* 103  210:aload           10
	//* 104  212:ldc1            #158 <String "Sampling bitmap with destination image bounds: (height ">
	//* 105  214:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//* 106  217:pop             
	//* 107  218:aload           6
	//* 108  220:astore          4
	//* 109  222:aload_0         
	//* 110  223:astore          5
	//* 111  225:aload           10
	//* 112  227:iload_2         
	//* 113  228:invokevirtual   #44  <Method StringBuilder StringBuilder.append(int)>
	//* 114  231:pop             
	//* 115  232:aload           6
	//* 116  234:astore          4
	//* 117  236:aload_0         
	//* 118  237:astore          5
	//* 119  239:aload           10
	//* 120  241:ldc1            #46  <String " width ">
	//* 121  243:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//* 122  246:pop             
	//* 123  247:aload           6
	//* 124  249:astore          4
	//* 125  251:aload_0         
	//* 126  252:astore          5
	//* 127  254:aload           10
	//* 128  256:iload_1         
	//* 129  257:invokevirtual   #44  <Method StringBuilder StringBuilder.append(int)>
	//* 130  260:pop             
	//* 131  261:aload           6
	//* 132  263:astore          4
	//* 133  265:aload_0         
	//* 134  266:astore          5
	//* 135  268:aload           10
	//* 136  270:ldc1            #50  <String ")">
	//* 137  272:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//* 138  275:pop             
	//* 139  276:aload           6
	//* 140  278:astore          4
	//* 141  280:aload_0         
	//* 142  281:astore          5
	//* 143  283:aload           7
	//* 144  285:aload           10
	//* 145  287:invokevirtual   #54  <Method String StringBuilder.toString()>
	//* 146  290:invokestatic    #58  <Method int AppboyLogger.d(String, String)>
	//* 147  293:pop             
	//* 148  294:aload           6
	//* 149  296:astore          4
	//* 150  298:aload_0         
	//* 151  299:astore          5
	//* 152  301:aload_0         
	//* 153  302:invokestatic    #161 <Method android.graphics.BitmapFactory$Options a(InputStream)>
	//* 154  305:astore          10
	//* 155  307:aload           6
	//* 156  309:astore          4
	//* 157  311:aload_0         
	//* 158  312:astore          5
	//* 159  314:aload           6
	//* 160  316:invokevirtual   #152 <Method void HttpURLConnection.disconnect()>
	//* 161  319:aload           6
	//* 162  321:astore          4
	//* 163  323:aload_0         
	//* 164  324:astore          5
	//* 165  326:aload           9
	//* 166  328:invokestatic    #131 <Method java.net.URLConnection k.a(URL)>
	//* 167  331:checkcast       #133 <Class HttpURLConnection>
	//* 168  334:astore          7
	//* 169  336:aload           7
	//* 170  338:invokevirtual   #156 <Method InputStream HttpURLConnection.getInputStream()>
	//* 171  341:astore          4
	//* 172  343:aload           10
	//* 173  345:getfield        #29  <Field int android.graphics.BitmapFactory$Options.outHeight>
	//* 174  348:ifeq            409
	//* 175  351:aload           10
	//* 176  353:getfield        #32  <Field int android.graphics.BitmapFactory$Options.outWidth>
	//* 177  356:ifne            362
	//* 178  359:goto            409
	//* 179  362:aload           4
	//* 180  364:aload           10
	//* 181  366:iload_1         
	//* 182  367:iload_2         
	//* 183  368:invokestatic    #164 <Method Bitmap a(InputStream, android.graphics.BitmapFactory$Options, int, int)>
	//* 184  371:astore_0        
	//* 185  372:aload           7
	//* 186  374:ifnull          382
	//* 187  377:aload           7
	//* 188  379:invokevirtual   #152 <Method void HttpURLConnection.disconnect()>
	//* 189  382:aload           4
	//* 190  384:ifnull          407
	//* 191  387:aload           4
	//* 192  389:invokevirtual   #169 <Method void InputStream.close()>
	//* 193  392:aload_0         
	//* 194  393:areturn         
	//* 195  394:astore          4
	//* 196  396:getstatic       #17  <Field String a>
	//* 197  399:ldc1            #171 <String "IOException during closing of bitmap metadata download stream.">
	//* 198  401:aload           4
	//* 199  403:invokestatic    #103 <Method int AppboyLogger.e(String, String, Throwable)>
	//* 200  406:pop             
	//* 201  407:aload_0         
	//* 202  408:areturn         
	//* 203  409:getstatic       #17  <Field String a>
	//* 204  412:astore_0        
	//* 205  413:new             #34  <Class StringBuilder>
	//* 206  416:dup             
	//* 207  417:invokespecial   #35  <Method void StringBuilder()>
	//* 208  420:astore          5
	//* 209  422:aload           5
	//* 210  424:ldc1            #173 <String "The bitmap metadata with image url ">
	//* 211  426:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//* 212  429:pop             
	//* 213  430:aload           5
	//* 214  432:aload           9
	//* 215  434:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//* 216  437:pop             
	//* 217  438:aload           5
	//* 218  440:ldc1            #175 <String " had bounds: (height ">
	//* 219  442:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//* 220  445:pop             
	//* 221  446:aload           5
	//* 222  448:aload           10
	//* 223  450:getfield        #29  <Field int android.graphics.BitmapFactory$Options.outHeight>
	//* 224  453:invokevirtual   #44  <Method StringBuilder StringBuilder.append(int)>
	//* 225  456:pop             
	//* 226  457:aload           5
	//* 227  459:ldc1            #46  <String " width ">
	//* 228  461:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//* 229  464:pop             
	//* 230  465:aload           5
	//* 231  467:aload           10
	//* 232  469:getfield        #32  <Field int android.graphics.BitmapFactory$Options.outWidth>
	//* 233  472:invokevirtual   #44  <Method StringBuilder StringBuilder.append(int)>
	//* 234  475:pop             
	//* 235  476:aload           5
	//* 236  478:ldc1            #177 <String "). Returning a bitmap with no sampling.">
	//* 237  480:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//* 238  483:pop             
	//* 239  484:aload_0         
	//* 240  485:aload           5
	//* 241  487:invokevirtual   #54  <Method String StringBuilder.toString()>
	//* 242  490:invokestatic    #149 <Method int AppboyLogger.w(String, String)>
	//* 243  493:pop             
	//* 244  494:aload           4
	//* 245  496:invokestatic    #181 <Method Bitmap BitmapFactoryInstrumentation.decodeStream(InputStream)>
	//* 246  499:astore_0        
	//* 247  500:aload           7
	//* 248  502:ifnull          510
	//* 249  505:aload           7
	//* 250  507:invokevirtual   #152 <Method void HttpURLConnection.disconnect()>
	//* 251  510:aload           4
	//* 252  512:ifnull          535
	//* 253  515:aload           4
	//* 254  517:invokevirtual   #169 <Method void InputStream.close()>
	//* 255  520:aload_0         
	//* 256  521:areturn         
	//* 257  522:astore          4
	//* 258  524:getstatic       #17  <Field String a>
	//* 259  527:ldc1            #171 <String "IOException during closing of bitmap metadata download stream.">
	//* 260  529:aload           4
	//* 261  531:invokestatic    #103 <Method int AppboyLogger.e(String, String, Throwable)>
	//* 262  534:pop             
	//* 263  535:aload_0         
	//* 264  536:areturn         
	//* 265  537:astore          6
	//* 266  539:aload           4
	//* 267  541:astore_0        
	//* 268  542:goto            607
	//* 269  545:astore          5
	//* 270  547:aload           4
	//* 271  549:astore_0        
	//* 272  550:aload           5
	//* 273  552:astore          4
	//* 274  554:goto            622
	//* 275  557:astore          5
	//* 276  559:aload           4
	//* 277  561:astore_0        
	//* 278  562:aload           5
	//* 279  564:astore          4
	//* 280  566:goto            635
	//* 281  569:astore          5
	//* 282  571:aload           4
	//* 283  573:astore_0        
	//* 284  574:aload           5
	//* 285  576:astore          4
	//* 286  578:goto            648
	//* 287  581:astore          5
	//* 288  583:aload           4
	//* 289  585:astore_0        
	//* 290  586:aload           5
	//* 291  588:astore          4
	//* 292  590:goto            661
	//* 293  593:astore          5
	//* 294  595:aload           4
	//* 295  597:astore_0        
	//* 296  598:aload           5
	//* 297  600:astore          4
	//* 298  602:goto            674
	//* 299  605:astore          6
	//* 300  607:aload           7
	//* 301  609:astore          4
	//* 302  611:aload_0         
	//* 303  612:astore          5
	//* 304  614:aload           6
	//* 305  616:astore_0        
	//* 306  617:goto            1404
	//* 307  620:astore          4
	//* 308  622:aload           7
	//* 309  624:astore          6
	//* 310  626:aload           4
	//* 311  628:astore          7
	//* 312  630:goto            823
	//* 313  633:astore          4
	//* 314  635:aload           7
	//* 315  637:astore          6
	//* 316  639:aload           4
	//* 317  641:astore          7
	//* 318  643:goto            929
	//* 319  646:astore          4
	//* 320  648:aload           7
	//* 321  650:astore          6
	//* 322  652:aload           4
	//* 323  654:astore          7
	//* 324  656:goto            1048
	//* 325  659:astore          4
	//* 326  661:aload           7
	//* 327  663:astore          6
	//* 328  665:aload           4
	//* 329  667:astore          7
	//* 330  669:goto            1169
	//* 331  672:astore          4
	//* 332  674:aload           7
	//* 333  676:astore          6
	//* 334  678:aload           4
	//* 335  680:astore          7
	//* 336  682:goto            1290
	//* 337  685:aload           6
	//* 338  687:astore          4
	//* 339  689:aload_0         
	//* 340  690:astore          5
	//* 341  692:aload_0         
	//* 342  693:invokestatic    #181 <Method Bitmap BitmapFactoryInstrumentation.decodeStream(InputStream)>
	//* 343  696:astore          7
	//* 344  698:aload           6
	//* 345  700:ifnull          708
	//* 346  703:aload           6
	//* 347  705:invokevirtual   #152 <Method void HttpURLConnection.disconnect()>
	//* 348  708:aload_0         
	//* 349  709:ifnull          730
	//* 350  712:aload_0         
	//* 351  713:invokevirtual   #169 <Method void InputStream.close()>
	//* 352  716:aload           7
	//* 353  718:areturn         
	//* 354  719:astore_0        
	//* 355  720:getstatic       #17  <Field String a>
	//* 356  723:ldc1            #171 <String "IOException during closing of bitmap metadata download stream.">
	//* 357  725:aload_0         
	//* 358  726:invokestatic    #103 <Method int AppboyLogger.e(String, String, Throwable)>
	//* 359  729:pop             
	//* 360  730:aload           7
	//* 361  732:areturn         
	//* 362  733:astore          7
	//* 363  735:goto            823
	//* 364  738:astore          7
	//* 365  740:goto            929
	//* 366  743:astore          7
	//* 367  745:goto            1048
	//* 368  748:astore          7
	//* 369  750:goto            1169
	//* 370  753:astore          7
	//* 371  755:goto            1290
	//* 372  758:astore_0        
	//* 373  759:aconst_null     
	//* 374  760:astore          5
	//* 375  762:aload           6
	//* 376  764:astore          4
	//* 377  766:goto            1404
	//* 378  769:astore          7
	//* 379  771:aconst_null     
	//* 380  772:astore_0        
	//* 381  773:goto            823
	//* 382  776:astore          7
	//* 383  778:aconst_null     
	//* 384  779:astore_0        
	//* 385  780:goto            929
	//* 386  783:astore          7
	//* 387  785:aconst_null     
	//* 388  786:astore_0        
	//* 389  787:goto            1048
	//* 390  790:astore          7
	//* 391  792:aconst_null     
	//* 392  793:astore_0        
	//* 393  794:goto            1169
		// Misplaced declaration of an exception variable
		catch(Object obj4)
	//* 394  797:astore          7
		{
			uri = null;
	//  395  799:aconst_null     
	//  396  800:astore_0        
			break MISSING_BLOCK_LABEL_1290;
	//  397  801:goto            1290
		}
		// Misplaced declaration of an exception variable
		catch(Object obj4)
		{
			uri = null;
			break MISSING_BLOCK_LABEL_1169;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj4)
		{
			uri = null;
			break MISSING_BLOCK_LABEL_1048;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj4)
		{
			uri = null;
			break MISSING_BLOCK_LABEL_929;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj4)
		{
			uri = null;
			break MISSING_BLOCK_LABEL_823;
		}
		if(l == 200)
			break MISSING_BLOCK_LABEL_161;
		uri = ((Uri) (a));
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("HTTP response code was ");
		((StringBuilder) (obj)).append(l);
		((StringBuilder) (obj)).append(". Bitmap with url ");
		((StringBuilder) (obj)).append(obj5);
		((StringBuilder) (obj)).append(" could not be downloaded.");
		AppboyLogger.w(((String) (uri)), ((StringBuilder) (obj)).toString());
		if(obj2 != null)
			((HttpURLConnection) (obj2)).disconnect();
		return null;
		uri = ((Uri) (((HttpURLConnection) (obj2)).getInputStream()));
		if(i == 0 || j == 0)
			break MISSING_BLOCK_LABEL_685;
		obj = obj2;
		obj1 = ((Object) (uri));
		try
		{
			obj3 = ((Object) (a));
		}
		// Misplaced declaration of an exception variable
		catch(Object obj4)
		{
			break MISSING_BLOCK_LABEL_1290;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj4)
		{
			break MISSING_BLOCK_LABEL_1169;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj4)
		{
			break MISSING_BLOCK_LABEL_1048;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj4)
		{
			break MISSING_BLOCK_LABEL_929;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj4)
		{
			break MISSING_BLOCK_LABEL_823;
		}
		obj = obj2;
		obj1 = ((Object) (uri));
		obj6 = ((Object) (new StringBuilder()));
		obj = obj2;
		obj1 = ((Object) (uri));
		((StringBuilder) (obj6)).append("Sampling bitmap with destination image bounds: (height ");
		obj = obj2;
		obj1 = ((Object) (uri));
		((StringBuilder) (obj6)).append(j);
		obj = obj2;
		obj1 = ((Object) (uri));
		((StringBuilder) (obj6)).append(" width ");
		obj = obj2;
		obj1 = ((Object) (uri));
		((StringBuilder) (obj6)).append(i);
		obj = obj2;
		obj1 = ((Object) (uri));
		((StringBuilder) (obj6)).append(")");
		obj = obj2;
		obj1 = ((Object) (uri));
		AppboyLogger.d(((String) (obj3)), ((StringBuilder) (obj6)).toString());
		obj = obj2;
		obj1 = ((Object) (uri));
		obj6 = ((Object) (a(((InputStream) (uri)))));
		obj = obj2;
		obj1 = ((Object) (uri));
		((HttpURLConnection) (obj2)).disconnect();
		obj = obj2;
		obj1 = ((Object) (uri));
		obj3 = ((Object) ((HttpURLConnection)k.a(((URL) (obj5)))));
		obj = ((Object) (((HttpURLConnection) (obj3)).getInputStream()));
		if(((android.graphics.BitmapFactory.Options) (obj6)).outHeight == 0 || ((android.graphics.BitmapFactory.Options) (obj6)).outWidth == 0)
			break MISSING_BLOCK_LABEL_409;
		try
		{
			uri = ((Uri) (a(((InputStream) (obj)), ((android.graphics.BitmapFactory.Options) (obj6)), i, j)));
		}
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			uri = ((Uri) (obj));
			obj = obj1;
			break MISSING_BLOCK_LABEL_674;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			uri = ((Uri) (obj));
			obj = obj1;
			break MISSING_BLOCK_LABEL_661;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			uri = ((Uri) (obj));
			obj = obj1;
			break MISSING_BLOCK_LABEL_648;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			uri = ((Uri) (obj));
			obj = obj1;
			break MISSING_BLOCK_LABEL_635;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			uri = ((Uri) (obj));
			obj = obj1;
			break MISSING_BLOCK_LABEL_622;
		}
		if(obj3 != null)
			((HttpURLConnection) (obj3)).disconnect();
		if(obj == null)
			break MISSING_BLOCK_LABEL_407;
		((InputStream) (obj)).close();
		return ((Bitmap) (uri));
		obj;
		AppboyLogger.e(a, "IOException during closing of bitmap metadata download stream.", ((Throwable) (obj)));
		return ((Bitmap) (uri));
		uri = ((Uri) (a));
		obj1 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj1)).append("The bitmap metadata with image url ");
		((StringBuilder) (obj1)).append(obj5);
		((StringBuilder) (obj1)).append(" had bounds: (height ");
		((StringBuilder) (obj1)).append(((android.graphics.BitmapFactory.Options) (obj6)).outHeight);
		((StringBuilder) (obj1)).append(" width ");
		((StringBuilder) (obj1)).append(((android.graphics.BitmapFactory.Options) (obj6)).outWidth);
		((StringBuilder) (obj1)).append("). Returning a bitmap with no sampling.");
		AppboyLogger.w(((String) (uri)), ((StringBuilder) (obj1)).toString());
		uri = ((Uri) (BitmapFactoryInstrumentation.decodeStream(((InputStream) (obj)))));
		if(obj3 != null)
			((HttpURLConnection) (obj3)).disconnect();
		if(obj == null)
			break MISSING_BLOCK_LABEL_535;
		((InputStream) (obj)).close();
		return ((Bitmap) (uri));
		obj;
		AppboyLogger.e(a, "IOException during closing of bitmap metadata download stream.", ((Throwable) (obj)));
		return ((Bitmap) (uri));
		obj2;
		uri = ((Uri) (obj));
		break MISSING_BLOCK_LABEL_607;
		obj2;
		obj = obj3;
		obj1 = ((Object) (uri));
		uri = ((Uri) (obj2));
		break MISSING_BLOCK_LABEL_1404;
		obj;
		obj2 = obj3;
		obj3 = obj;
		break MISSING_BLOCK_LABEL_823;
		obj;
		obj2 = obj3;
		obj3 = obj;
		break MISSING_BLOCK_LABEL_929;
		obj;
		obj2 = obj3;
		obj3 = obj;
		break MISSING_BLOCK_LABEL_1048;
		obj;
		obj2 = obj3;
		obj3 = obj;
		break MISSING_BLOCK_LABEL_1169;
		obj;
		obj2 = obj3;
		obj3 = obj;
		break MISSING_BLOCK_LABEL_1290;
		obj = obj2;
		obj1 = ((Object) (uri));
		obj3 = ((Object) (BitmapFactoryInstrumentation.decodeStream(((InputStream) (uri)))));
		if(obj2 != null)
			((HttpURLConnection) (obj2)).disconnect();
		if(uri == null)
			break MISSING_BLOCK_LABEL_730;
		((InputStream) (uri)).close();
		return ((Bitmap) (obj3));
		uri;
		AppboyLogger.e(a, "IOException during closing of bitmap metadata download stream.", ((Throwable) (uri)));
		return ((Bitmap) (obj3));
		uri;
		obj1 = null;
		obj = obj2;
		break MISSING_BLOCK_LABEL_1404;
		uri;
	//  398  804:astore_0        
		obj = null;
	//  399  805:aconst_null     
	//  400  806:astore          4
		obj1 = obj;
	//  401  808:aload           4
	//  402  810:astore          5
		break MISSING_BLOCK_LABEL_1404;
	//  403  812:goto            1404
		obj4;
	//  404  815:astore          7
		obj2 = null;
	//  405  817:aconst_null     
	//  406  818:astore          6
		uri = ((Uri) (obj2));
	//  407  820:aload           6
	//  408  822:astore_0        
		obj = obj2;
	//  409  823:aload           6
	//  410  825:astore          4
		obj1 = ((Object) (uri));
	//  411  827:aload_0         
	//  412  828:astore          5
		obj5 = ((Object) (a));
	//  413  830:getstatic       #17  <Field String a>
	//  414  833:astore          9
		obj = obj2;
	//  415  835:aload           6
	//  416  837:astore          4
		obj1 = ((Object) (uri));
	//  417  839:aload_0         
	//  418  840:astore          5
		StringBuilder stringbuilder1 = new StringBuilder();
	//  419  842:new             #34  <Class StringBuilder>
	//  420  845:dup             
	//  421  846:invokespecial   #35  <Method void StringBuilder()>
	//  422  849:astore          10
		obj = obj2;
	//  423  851:aload           6
	//  424  853:astore          4
		obj1 = ((Object) (uri));
	//  425  855:aload_0         
	//  426  856:astore          5
		stringbuilder1.append("Throwable caught in image bitmap download for Uri: ");
	//  427  858:aload           10
	//  428  860:ldc1            #183 <String "Throwable caught in image bitmap download for Uri: ">
	//  429  862:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//  430  865:pop             
		obj = obj2;
	//  431  866:aload           6
	//  432  868:astore          4
		obj1 = ((Object) (uri));
	//  433  870:aload_0         
	//  434  871:astore          5
		stringbuilder1.append(s);
	//  435  873:aload           10
	//  436  875:aload           8
	//  437  877:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//  438  880:pop             
		obj = obj2;
	//  439  881:aload           6
	//  440  883:astore          4
		obj1 = ((Object) (uri));
	//  441  885:aload_0         
	//  442  886:astore          5
		AppboyLogger.e(((String) (obj5)), stringbuilder1.toString(), ((Throwable) (obj4)));
	//  443  888:aload           9
	//  444  890:aload           10
	//  445  892:invokevirtual   #54  <Method String StringBuilder.toString()>
	//  446  895:aload           7
	//  447  897:invokestatic    #103 <Method int AppboyLogger.e(String, String, Throwable)>
	//  448  900:pop             
		if(obj2 != null)
	//* 449  901:aload           6
	//* 450  903:ifnull          911
			((HttpURLConnection) (obj2)).disconnect();
	//  451  906:aload           6
	//  452  908:invokevirtual   #152 <Method void HttpURLConnection.disconnect()>
		if(uri != null)
	//* 453  911:aload_0         
	//* 454  912:ifnull          1401
		{
			try
			{
				((InputStream) (uri)).close();
	//  455  915:aload_0         
	//  456  916:invokevirtual   #169 <Method void InputStream.close()>
			}
	//* 457  919:aconst_null     
	//* 458  920:areturn         
	//* 459  921:astore          7
	//* 460  923:aconst_null     
	//* 461  924:astore          6
	//* 462  926:aload           6
	//* 463  928:astore_0        
	//* 464  929:aload           6
	//* 465  931:astore          4
	//* 466  933:aload_0         
	//* 467  934:astore          5
	//* 468  936:getstatic       #17  <Field String a>
	//* 469  939:astore          9
	//* 470  941:aload           6
	//* 471  943:astore          4
	//* 472  945:aload_0         
	//* 473  946:astore          5
	//* 474  948:new             #34  <Class StringBuilder>
	//* 475  951:dup             
	//* 476  952:invokespecial   #35  <Method void StringBuilder()>
	//* 477  955:astore          10
	//* 478  957:aload           6
	//* 479  959:astore          4
	//* 480  961:aload_0         
	//* 481  962:astore          5
	//* 482  964:aload           10
	//* 483  966:ldc1            #185 <String "Exception in image bitmap download for Uri: ">
	//* 484  968:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//* 485  971:pop             
	//* 486  972:aload           6
	//* 487  974:astore          4
	//* 488  976:aload_0         
	//* 489  977:astore          5
	//* 490  979:aload           10
	//* 491  981:aload           8
	//* 492  983:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//* 493  986:pop             
	//* 494  987:aload           6
	//* 495  989:astore          4
	//* 496  991:aload_0         
	//* 497  992:astore          5
	//* 498  994:aload           9
	//* 499  996:aload           10
	//* 500  998:invokevirtual   #54  <Method String StringBuilder.toString()>
	//* 501 1001:aload           7
	//* 502 1003:invokestatic    #103 <Method int AppboyLogger.e(String, String, Throwable)>
	//* 503 1006:pop             
	//* 504 1007:aload           6
	//* 505 1009:ifnull          1017
	//* 506 1012:aload           6
	//* 507 1014:invokevirtual   #152 <Method void HttpURLConnection.disconnect()>
	//* 508 1017:aload_0         
	//* 509 1018:ifnull          1401
	//* 510 1021:aload_0         
	//* 511 1022:invokevirtual   #169 <Method void InputStream.close()>
	//* 512 1025:aconst_null     
	//* 513 1026:areturn         
			// Misplaced declaration of an exception variable
			catch(Uri uri)
	//* 514 1027:astore_0        
			{
				AppboyLogger.e(a, "IOException during closing of bitmap metadata download stream.", ((Throwable) (uri)));
	//  515 1028:getstatic       #17  <Field String a>
	//  516 1031:ldc1            #171 <String "IOException during closing of bitmap metadata download stream.">
	//  517 1033:aload_0         
	//  518 1034:invokestatic    #103 <Method int AppboyLogger.e(String, String, Throwable)>
	//  519 1037:pop             
				return null;
	//  520 1038:aconst_null     
	//  521 1039:areturn         
			}
			return null;
		}
		break MISSING_BLOCK_LABEL_1401;
		obj4;
		obj2 = null;
		uri = ((Uri) (obj2));
		obj = obj2;
		obj1 = ((Object) (uri));
		obj5 = ((Object) (a));
		obj = obj2;
		obj1 = ((Object) (uri));
		stringbuilder1 = new StringBuilder();
		obj = obj2;
		obj1 = ((Object) (uri));
		stringbuilder1.append("Exception in image bitmap download for Uri: ");
		obj = obj2;
		obj1 = ((Object) (uri));
		stringbuilder1.append(s);
		obj = obj2;
		obj1 = ((Object) (uri));
		AppboyLogger.e(((String) (obj5)), stringbuilder1.toString(), ((Throwable) (obj4)));
		if(obj2 != null)
			((HttpURLConnection) (obj2)).disconnect();
		if(uri == null)
			break MISSING_BLOCK_LABEL_1401;
		((InputStream) (uri)).close();
		return null;
		obj4;
	//  522 1040:astore          7
		obj2 = null;
	//  523 1042:aconst_null     
	//  524 1043:astore          6
		uri = ((Uri) (obj2));
	//  525 1045:aload           6
	//  526 1047:astore_0        
		obj = obj2;
	//  527 1048:aload           6
	//  528 1050:astore          4
		obj1 = ((Object) (uri));
	//  529 1052:aload_0         
	//  530 1053:astore          5
		obj5 = ((Object) (a));
	//  531 1055:getstatic       #17  <Field String a>
	//  532 1058:astore          9
		obj = obj2;
	//  533 1060:aload           6
	//  534 1062:astore          4
		obj1 = ((Object) (uri));
	//  535 1064:aload_0         
	//  536 1065:astore          5
		stringbuilder1 = new StringBuilder();
	//  537 1067:new             #34  <Class StringBuilder>
	//  538 1070:dup             
	//  539 1071:invokespecial   #35  <Method void StringBuilder()>
	//  540 1074:astore          10
		obj = obj2;
	//  541 1076:aload           6
	//  542 1078:astore          4
		obj1 = ((Object) (uri));
	//  543 1080:aload_0         
	//  544 1081:astore          5
		stringbuilder1.append("Malformed URL Exception in image bitmap download for Uri: ");
	//  545 1083:aload           10
	//  546 1085:ldc1            #187 <String "Malformed URL Exception in image bitmap download for Uri: ">
	//  547 1087:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//  548 1090:pop             
		obj = obj2;
	//  549 1091:aload           6
	//  550 1093:astore          4
		obj1 = ((Object) (uri));
	//  551 1095:aload_0         
	//  552 1096:astore          5
		stringbuilder1.append(s);
	//  553 1098:aload           10
	//  554 1100:aload           8
	//  555 1102:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//  556 1105:pop             
		obj = obj2;
	//  557 1106:aload           6
	//  558 1108:astore          4
		obj1 = ((Object) (uri));
	//  559 1110:aload_0         
	//  560 1111:astore          5
		stringbuilder1.append(". Image Uri may be corrupted.");
	//  561 1113:aload           10
	//  562 1115:ldc1            #189 <String ". Image Uri may be corrupted.">
	//  563 1117:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//  564 1120:pop             
		obj = obj2;
	//  565 1121:aload           6
	//  566 1123:astore          4
		obj1 = ((Object) (uri));
	//  567 1125:aload_0         
	//  568 1126:astore          5
		AppboyLogger.e(((String) (obj5)), stringbuilder1.toString(), ((Throwable) (obj4)));
	//  569 1128:aload           9
	//  570 1130:aload           10
	//  571 1132:invokevirtual   #54  <Method String StringBuilder.toString()>
	//  572 1135:aload           7
	//  573 1137:invokestatic    #103 <Method int AppboyLogger.e(String, String, Throwable)>
	//  574 1140:pop             
		if(obj2 != null)
	//* 575 1141:aload           6
	//* 576 1143:ifnull          1151
			((HttpURLConnection) (obj2)).disconnect();
	//  577 1146:aload           6
	//  578 1148:invokevirtual   #152 <Method void HttpURLConnection.disconnect()>
		if(uri == null)
			break MISSING_BLOCK_LABEL_1401;
	//  579 1151:aload_0         
	//  580 1152:ifnull          1401
		((InputStream) (uri)).close();
	//  581 1155:aload_0         
	//  582 1156:invokevirtual   #169 <Method void InputStream.close()>
		return null;
	//  583 1159:aconst_null     
	//  584 1160:areturn         
		obj4;
	//  585 1161:astore          7
		obj2 = null;
	//  586 1163:aconst_null     
	//  587 1164:astore          6
		uri = ((Uri) (obj2));
	//  588 1166:aload           6
	//  589 1168:astore_0        
		obj = obj2;
	//  590 1169:aload           6
	//  591 1171:astore          4
		obj1 = ((Object) (uri));
	//  592 1173:aload_0         
	//  593 1174:astore          5
		obj5 = ((Object) (a));
	//  594 1176:getstatic       #17  <Field String a>
	//  595 1179:astore          9
		obj = obj2;
	//  596 1181:aload           6
	//  597 1183:astore          4
		obj1 = ((Object) (uri));
	//  598 1185:aload_0         
	//  599 1186:astore          5
		stringbuilder1 = new StringBuilder();
	//  600 1188:new             #34  <Class StringBuilder>
	//  601 1191:dup             
	//  602 1192:invokespecial   #35  <Method void StringBuilder()>
	//  603 1195:astore          10
		obj = obj2;
	//  604 1197:aload           6
	//  605 1199:astore          4
		obj1 = ((Object) (uri));
	//  606 1201:aload_0         
	//  607 1202:astore          5
		stringbuilder1.append("Unknown Host Exception in image bitmap download for Uri: ");
	//  608 1204:aload           10
	//  609 1206:ldc1            #191 <String "Unknown Host Exception in image bitmap download for Uri: ">
	//  610 1208:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//  611 1211:pop             
		obj = obj2;
	//  612 1212:aload           6
	//  613 1214:astore          4
		obj1 = ((Object) (uri));
	//  614 1216:aload_0         
	//  615 1217:astore          5
		stringbuilder1.append(s);
	//  616 1219:aload           10
	//  617 1221:aload           8
	//  618 1223:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//  619 1226:pop             
		obj = obj2;
	//  620 1227:aload           6
	//  621 1229:astore          4
		obj1 = ((Object) (uri));
	//  622 1231:aload_0         
	//  623 1232:astore          5
		stringbuilder1.append(". Device may be offline.");
	//  624 1234:aload           10
	//  625 1236:ldc1            #193 <String ". Device may be offline.">
	//  626 1238:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//  627 1241:pop             
		obj = obj2;
	//  628 1242:aload           6
	//  629 1244:astore          4
		obj1 = ((Object) (uri));
	//  630 1246:aload_0         
	//  631 1247:astore          5
		AppboyLogger.e(((String) (obj5)), stringbuilder1.toString(), ((Throwable) (obj4)));
	//  632 1249:aload           9
	//  633 1251:aload           10
	//  634 1253:invokevirtual   #54  <Method String StringBuilder.toString()>
	//  635 1256:aload           7
	//  636 1258:invokestatic    #103 <Method int AppboyLogger.e(String, String, Throwable)>
	//  637 1261:pop             
		if(obj2 != null)
	//* 638 1262:aload           6
	//* 639 1264:ifnull          1272
			((HttpURLConnection) (obj2)).disconnect();
	//  640 1267:aload           6
	//  641 1269:invokevirtual   #152 <Method void HttpURLConnection.disconnect()>
		if(uri == null)
			break MISSING_BLOCK_LABEL_1401;
	//  642 1272:aload_0         
	//  643 1273:ifnull          1401
		((InputStream) (uri)).close();
	//  644 1276:aload_0         
	//  645 1277:invokevirtual   #169 <Method void InputStream.close()>
		return null;
	//  646 1280:aconst_null     
	//  647 1281:areturn         
		obj4;
	//  648 1282:astore          7
		obj2 = null;
	//  649 1284:aconst_null     
	//  650 1285:astore          6
		uri = ((Uri) (obj2));
	//  651 1287:aload           6
	//  652 1289:astore_0        
		obj = obj2;
	//  653 1290:aload           6
	//  654 1292:astore          4
		obj1 = ((Object) (uri));
	//  655 1294:aload_0         
	//  656 1295:astore          5
		obj5 = ((Object) (a));
	//  657 1297:getstatic       #17  <Field String a>
	//  658 1300:astore          9
		obj = obj2;
	//  659 1302:aload           6
	//  660 1304:astore          4
		obj1 = ((Object) (uri));
	//  661 1306:aload_0         
	//  662 1307:astore          5
		stringbuilder1 = new StringBuilder();
	//  663 1309:new             #34  <Class StringBuilder>
	//  664 1312:dup             
	//  665 1313:invokespecial   #35  <Method void StringBuilder()>
	//  666 1316:astore          10
		obj = obj2;
	//  667 1318:aload           6
	//  668 1320:astore          4
		obj1 = ((Object) (uri));
	//  669 1322:aload_0         
	//  670 1323:astore          5
		stringbuilder1.append("Out of Memory Error in image bitmap download for Uri: ");
	//  671 1325:aload           10
	//  672 1327:ldc1            #195 <String "Out of Memory Error in image bitmap download for Uri: ">
	//  673 1329:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//  674 1332:pop             
		obj = obj2;
	//  675 1333:aload           6
	//  676 1335:astore          4
		obj1 = ((Object) (uri));
	//  677 1337:aload_0         
	//  678 1338:astore          5
		stringbuilder1.append(s);
	//  679 1340:aload           10
	//  680 1342:aload           8
	//  681 1344:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//  682 1347:pop             
		obj = obj2;
	//  683 1348:aload           6
	//  684 1350:astore          4
		obj1 = ((Object) (uri));
	//  685 1352:aload_0         
	//  686 1353:astore          5
		stringbuilder1.append(".");
	//  687 1355:aload           10
	//  688 1357:ldc1            #109 <String ".">
	//  689 1359:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//  690 1362:pop             
		obj = obj2;
	//  691 1363:aload           6
	//  692 1365:astore          4
		obj1 = ((Object) (uri));
	//  693 1367:aload_0         
	//  694 1368:astore          5
		AppboyLogger.e(((String) (obj5)), stringbuilder1.toString(), ((Throwable) (obj4)));
	//  695 1370:aload           9
	//  696 1372:aload           10
	//  697 1374:invokevirtual   #54  <Method String StringBuilder.toString()>
	//  698 1377:aload           7
	//  699 1379:invokestatic    #103 <Method int AppboyLogger.e(String, String, Throwable)>
	//  700 1382:pop             
		if(obj2 != null)
	//* 701 1383:aload           6
	//* 702 1385:ifnull          1393
			((HttpURLConnection) (obj2)).disconnect();
	//  703 1388:aload           6
	//  704 1390:invokevirtual   #152 <Method void HttpURLConnection.disconnect()>
		if(uri == null)
			break MISSING_BLOCK_LABEL_1401;
	//  705 1393:aload_0         
	//  706 1394:ifnull          1401
		((InputStream) (uri)).close();
	//  707 1397:aload_0         
	//  708 1398:invokevirtual   #169 <Method void InputStream.close()>
		return null;
	//  709 1401:aconst_null     
	//  710 1402:areturn         
		uri;
	//  711 1403:astore_0        
		if(obj != null)
	//* 712 1404:aload           4
	//* 713 1406:ifnull          1414
			((HttpURLConnection) (obj)).disconnect();
	//  714 1409:aload           4
	//  715 1411:invokevirtual   #152 <Method void HttpURLConnection.disconnect()>
		if(obj1 != null)
	//* 716 1414:aload           5
	//* 717 1416:ifnull          1440
			try
			{
				((InputStream) (obj1)).close();
	//  718 1419:aload           5
	//  719 1421:invokevirtual   #169 <Method void InputStream.close()>
			}
	//* 720 1424:goto            1440
			catch(IOException ioexception)
	//* 721 1427:astore          4
			{
				AppboyLogger.e(a, "IOException during closing of bitmap metadata download stream.", ((Throwable) (ioexception)));
	//  722 1429:getstatic       #17  <Field String a>
	//  723 1432:ldc1            #171 <String "IOException during closing of bitmap metadata download stream.">
	//  724 1434:aload           4
	//  725 1436:invokestatic    #103 <Method int AppboyLogger.e(String, String, Throwable)>
	//  726 1439:pop             
			}
		throw uri;
	//  727 1440:aload_0         
	//  728 1441:athrow          
	}

	private static Bitmap a(InputStream inputstream, android.graphics.BitmapFactory.Options options, int i, int j)
	{
		options.inSampleSize = a(options, i, j);
	//    0    0:aload_1         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokestatic    #197 <Method int a(android.graphics.BitmapFactory$Options, int, int)>
	//    5    7:putfield        #200 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
		options.inJustDecodeBounds = false;
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:putfield        #204 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		return BitmapFactoryInstrumentation.decodeStream(inputstream, ((android.graphics.Rect) (null)), options);
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:aload_1         
	//   12   18:invokestatic    #207 <Method Bitmap BitmapFactoryInstrumentation.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//   13   21:areturn         
	}

	static android.graphics.BitmapFactory.Options a(InputStream inputstream)
	{
		android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
	//    0    0:new             #25  <Class android.graphics.BitmapFactory$Options>
	//    1    3:dup             
	//    2    4:invokespecial   #208 <Method void android.graphics.BitmapFactory$Options()>
	//    3    7:astore_1        
		options.inJustDecodeBounds = true;
	//    4    8:aload_1         
	//    5    9:iconst_1        
	//    6   10:putfield        #204 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		BitmapFactoryInstrumentation.decodeStream(inputstream, ((android.graphics.Rect) (null)), options);
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:aload_1         
	//   10   16:invokestatic    #207 <Method Bitmap BitmapFactoryInstrumentation.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//   11   19:pop             
		return options;
	//   12   20:aload_1         
	//   13   21:areturn         
	}

	public static Bitmap getBitmap(Context context, Uri uri, AppboyViewBounds appboyviewbounds)
	{
		if(uri == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			AppboyLogger.i(a, "Null Uri received. Not getting image.");
	//    2    4:getstatic       #17  <Field String a>
	//    3    7:ldc1            #212 <String "Null Uri received. Not getting image.">
	//    4    9:invokestatic    #90  <Method int AppboyLogger.i(String, String)>
	//    5   12:pop             
			return null;
	//    6   13:aconst_null     
	//    7   14:areturn         
		}
		if(AppboyFileUtils.isLocalUri(uri))
	//*   8   15:aload_1         
	//*   9   16:invokestatic    #218 <Method boolean AppboyFileUtils.isLocalUri(Uri)>
	//*  10   19:ifeq            27
			return a(uri);
	//   11   22:aload_1         
	//   12   23:invokestatic    #220 <Method Bitmap a(Uri)>
	//   13   26:areturn         
		if(AppboyFileUtils.isRemoteUri(uri))
	//*  14   27:aload_1         
	//*  15   28:invokestatic    #223 <Method boolean AppboyFileUtils.isRemoteUri(Uri)>
	//*  16   31:ifeq            86
		{
			if(context != null && appboyviewbounds != null)
	//*  17   34:aload_0         
	//*  18   35:ifnull          79
	//*  19   38:aload_2         
	//*  20   39:ifnonnull       45
	//*  21   42:goto            79
			{
				context = ((Context) (getDefaultScreenDisplayMetrics(context)));
	//   22   45:aload_0         
	//   23   46:invokestatic    #227 <Method DisplayMetrics getDefaultScreenDisplayMetrics(Context)>
	//   24   49:astore_0        
				int i = getPixelsFromDensityAndDp(((DisplayMetrics) (context)).densityDpi, appboyviewbounds.getHeightDp());
	//   25   50:aload_0         
	//   26   51:getfield        #232 <Field int DisplayMetrics.densityDpi>
	//   27   54:aload_2         
	//   28   55:invokevirtual   #237 <Method int AppboyViewBounds.getHeightDp()>
	//   29   58:invokestatic    #241 <Method int getPixelsFromDensityAndDp(int, int)>
	//   30   61:istore_3        
				return a(uri, getPixelsFromDensityAndDp(((DisplayMetrics) (context)).densityDpi, appboyviewbounds.getWidthDp()), i);
	//   31   62:aload_1         
	//   32   63:aload_0         
	//   33   64:getfield        #232 <Field int DisplayMetrics.densityDpi>
	//   34   67:aload_2         
	//   35   68:invokevirtual   #244 <Method int AppboyViewBounds.getWidthDp()>
	//   36   71:invokestatic    #241 <Method int getPixelsFromDensityAndDp(int, int)>
	//   37   74:iload_3         
	//   38   75:invokestatic    #246 <Method Bitmap a(Uri, int, int)>
	//   39   78:areturn         
			} else
			{
				return a(uri, 0, 0);
	//   40   79:aload_1         
	//   41   80:iconst_0        
	//   42   81:iconst_0        
	//   43   82:invokestatic    #246 <Method Bitmap a(Uri, int, int)>
	//   44   85:areturn         
			}
		} else
		{
			AppboyLogger.w(a, "Uri with unknown scheme received. Not getting image.");
	//   45   86:getstatic       #17  <Field String a>
	//   46   89:ldc1            #248 <String "Uri with unknown scheme received. Not getting image.">
	//   47   91:invokestatic    #149 <Method int AppboyLogger.w(String, String)>
	//   48   94:pop             
			return null;
	//   49   95:aconst_null     
	//   50   96:areturn         
		}
	}

	public static Bitmap getBitmap(Uri uri)
	{
		return getBitmap(((Context) (null)), uri, ((AppboyViewBounds) (null)));
	//    0    0:aconst_null     
	//    1    1:aload_0         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #250 <Method Bitmap getBitmap(Context, Uri, AppboyViewBounds)>
	//    4    6:areturn         
	}

	public static DisplayMetrics getDefaultScreenDisplayMetrics(Context context)
	{
		context = ((Context) ((WindowManager)context.getSystemService("window")));
	//    0    0:aload_0         
	//    1    1:ldc1            #252 <String "window">
	//    2    3:invokevirtual   #258 <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #260 <Class WindowManager>
	//    4    9:astore_0        
		DisplayMetrics displaymetrics = new DisplayMetrics();
	//    5   10:new             #229 <Class DisplayMetrics>
	//    6   13:dup             
	//    7   14:invokespecial   #261 <Method void DisplayMetrics()>
	//    8   17:astore_1        
		((WindowManager) (context)).getDefaultDisplay().getMetrics(displaymetrics);
	//    9   18:aload_0         
	//   10   19:invokeinterface #265 <Method Display WindowManager.getDefaultDisplay()>
	//   11   24:aload_1         
	//   12   25:invokevirtual   #271 <Method void Display.getMetrics(DisplayMetrics)>
		return displaymetrics;
	//   13   28:aload_1         
	//   14   29:areturn         
	}

	public static int getImageLoaderCacheSize()
	{
		return Math.max(1024, Math.min((int)Math.min(Runtime.getRuntime().maxMemory() / 8L, 0x7fffffffL), 0x2000000));
	//    0    0:sipush          1024
	//    1    3:invokestatic    #278 <Method Runtime Runtime.getRuntime()>
	//    2    6:invokevirtual   #282 <Method long Runtime.maxMemory()>
	//    3    9:ldc2w           #283 <Long 8L>
	//    4   12:ldiv            
	//    5   13:ldc2w           #285 <Long 0x7fffffffL>
	//    6   16:invokestatic    #292 <Method long Math.min(long, long)>
	//    7   19:l2i             
	//    8   20:ldc2            #293 <Int 0x2000000>
	//    9   23:invokestatic    #295 <Method int Math.min(int, int)>
	//   10   26:invokestatic    #298 <Method int Math.max(int, int)>
	//   11   29:ireturn         
	}

	public static int getPixelsFromDensityAndDp(int i, int j)
	{
		return Math.abs((i * j) / 160);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:imul            
	//    3    3:sipush          160
	//    4    6:idiv            
	//    5    7:invokestatic    #302 <Method int Math.abs(int)>
	//    6   10:ireturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/support/AppboyImageUtils);

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyImageUtils>
	//    1    2:invokestatic    #15  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #17  <Field String a>
	//*   3    8:return          
	}
}
