// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.o.c;

import com.irobot.core.AssetId;
import com.irobot.home.o.d.a;
import com.irobot.home.util.o;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

// Referenced classes of package com.irobot.home.o.c:
//			m

class t extends m
{

	public t(HashMap hashmap)
	{
		super(hashmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void m(HashMap)>
	//    3    5:return          
	}

	public HttpURLConnection a(String s, String s1, String s2, int i)
	{
		URL url = (new a("https")).a(d()).a();
	//    0    0:new             #35  <Class a>
	//    1    3:dup             
	//    2    4:ldc1            #37  <String "https">
	//    3    6:invokespecial   #40  <Method void a(String)>
	//    4    9:aload_0         
	//    5   10:invokevirtual   #43  <Method com.irobot.core.NetworkAddress d()>
	//    6   13:invokevirtual   #46  <Method a a.a(com.irobot.core.NetworkAddress)>
	//    7   16:invokevirtual   #49  <Method URL a.a()>
	//    8   19:astore          6
		if(url != null)
	//*   9   21:aload           6
	//*  10   23:ifnull          36
			o.b("RemoteHttpsAxedaSession", url.toString());
	//   11   26:ldc1            #51  <String "RemoteHttpsAxedaSession">
	//   12   28:aload           6
	//   13   30:invokevirtual   #57  <Method String URL.toString()>
	//   14   33:invokestatic    #62  <Method void o.b(String, String)>
		HttpURLConnection httpurlconnection = (HttpURLConnection)url.openConnection();
	//   15   36:aload           6
	//   16   38:invokevirtual   #66  <Method java.net.URLConnection URL.openConnection()>
	//   17   41:checkcast       #68  <Class HttpURLConnection>
	//   18   44:astore          5
		httpurlconnection.setReadTimeout(i);
	//   19   46:aload           5
	//   20   48:iload           4
	//   21   50:invokevirtual   #72  <Method void HttpURLConnection.setReadTimeout(int)>
		httpurlconnection.setUseCaches(false);
	//   22   53:aload           5
	//   23   55:iconst_0        
	//   24   56:invokevirtual   #76  <Method void HttpURLConnection.setUseCaches(boolean)>
		httpurlconnection.setDoOutput(true);
	//   25   59:aload           5
	//   26   61:iconst_1        
	//   27   62:invokevirtual   #79  <Method void HttpURLConnection.setDoOutput(boolean)>
		httpurlconnection.setRequestMethod(f);
	//   28   65:aload           5
	//   29   67:getstatic       #81  <Field String f>
	//   30   70:invokevirtual   #84  <Method void HttpURLConnection.setRequestMethod(String)>
		s = e;
	//   31   73:getstatic       #86  <Field String e>
	//   32   76:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   33   77:new             #88  <Class StringBuilder>
	//   34   80:dup             
	//   35   81:invokespecial   #90  <Method void StringBuilder()>
	//   36   84:astore          7
		stringbuilder.append("ElPaso@irobot!");
	//   37   86:aload           7
	//   38   88:ldc1            #92  <String "ElPaso@irobot!">
	//   39   90:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   40   93:pop             
		stringbuilder.append(b().getId());
	//   41   94:aload           7
	//   42   96:aload_0         
	//   43   97:invokevirtual   #99  <Method AssetId b()>
	//   44  100:invokevirtual   #104 <Method String AssetId.getId()>
	//   45  103:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   46  106:pop             
		httpurlconnection.setRequestProperty(s, stringbuilder.toString());
	//   47  107:aload           5
	//   48  109:aload_1         
	//   49  110:aload           7
	//   50  112:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   51  115:invokevirtual   #108 <Method void HttpURLConnection.setRequestProperty(String, String)>
		s = c();
	//   52  118:aload_0         
	//   53  119:invokevirtual   #110 <Method String c()>
	//   54  122:astore_1        
		stringbuilder = new StringBuilder();
	//   55  123:new             #88  <Class StringBuilder>
	//   56  126:dup             
	//   57  127:invokespecial   #90  <Method void StringBuilder()>
	//   58  130:astore          7
		stringbuilder.append(a);
	//   59  132:aload           7
	//   60  134:getstatic       #112 <Field String a>
	//   61  137:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   62  140:pop             
		stringbuilder.append("=");
	//   63  141:aload           7
	//   64  143:ldc1            #114 <String "=">
	//   65  145:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   66  148:pop             
		stringbuilder.append(b().getId());
	//   67  149:aload           7
	//   68  151:aload_0         
	//   69  152:invokevirtual   #99  <Method AssetId b()>
	//   70  155:invokevirtual   #104 <Method String AssetId.getId()>
	//   71  158:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   72  161:pop             
		stringbuilder.append("&");
	//   73  162:aload           7
	//   74  164:ldc1            #116 <String "&">
	//   75  166:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   76  169:pop             
		stringbuilder.append(b);
	//   77  170:aload           7
	//   78  172:getstatic       #118 <Field String b>
	//   79  175:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   80  178:pop             
		stringbuilder.append("=");
	//   81  179:aload           7
	//   82  181:ldc1            #114 <String "=">
	//   83  183:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   84  186:pop             
		stringbuilder.append(s);
	//   85  187:aload           7
	//   86  189:aload_1         
	//   87  190:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   88  193:pop             
		stringbuilder.append("&");
	//   89  194:aload           7
	//   90  196:ldc1            #116 <String "&">
	//   91  198:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   92  201:pop             
		stringbuilder.append(c);
	//   93  202:aload           7
	//   94  204:getstatic       #120 <Field String c>
	//   95  207:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   96  210:pop             
		stringbuilder.append("=");
	//   97  211:aload           7
	//   98  213:ldc1            #114 <String "=">
	//   99  215:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//  100  218:pop             
		stringbuilder.append(s1);
	//  101  219:aload           7
	//  102  221:aload_2         
	//  103  222:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//  104  225:pop             
		if(s2 != null && s2.length() > 0)
	//* 105  226:aload_3         
	//* 106  227:ifnull          269
	//* 107  230:aload_3         
	//* 108  231:invokevirtual   #126 <Method int String.length()>
	//* 109  234:ifle            269
		{
			stringbuilder.append("&");
	//  110  237:aload           7
	//  111  239:ldc1            #116 <String "&">
	//  112  241:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//  113  244:pop             
			stringbuilder.append(d);
	//  114  245:aload           7
	//  115  247:getstatic       #128 <Field String d>
	//  116  250:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//  117  253:pop             
			stringbuilder.append("=");
	//  118  254:aload           7
	//  119  256:ldc1            #114 <String "=">
	//  120  258:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//  121  261:pop             
			stringbuilder.append(s2);
	//  122  262:aload           7
	//  123  264:aload_3         
	//  124  265:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//  125  268:pop             
		}
		s = ((String) (stringbuilder.toString().getBytes("UTF-8")));
	//  126  269:aload           7
	//  127  271:invokevirtual   #105 <Method String StringBuilder.toString()>
	//  128  274:ldc1            #130 <String "UTF-8">
	//  129  276:invokevirtual   #134 <Method byte[] String.getBytes(String)>
	//  130  279:astore_1        
		if(!url.toString().contains("axeda.com"))
	//* 131  280:aload           6
	//* 132  282:invokevirtual   #57  <Method String URL.toString()>
	//* 133  285:ldc1            #136 <String "axeda.com">
	//* 134  287:invokevirtual   #140 <Method boolean String.contains(CharSequence)>
	//* 135  290:ifne            311
			s = ((String) (stringbuilder.toString().replace("\"", "\\\"").getBytes("UTF-8")));
	//  136  293:aload           7
	//  137  295:invokevirtual   #105 <Method String StringBuilder.toString()>
	//  138  298:ldc1            #142 <String "\"">
	//  139  300:ldc1            #144 <String "\\\"">
	//  140  302:invokevirtual   #148 <Method String String.replace(CharSequence, CharSequence)>
	//  141  305:ldc1            #130 <String "UTF-8">
	//  142  307:invokevirtual   #134 <Method byte[] String.getBytes(String)>
	//  143  310:astore_1        
		httpurlconnection.getOutputStream().write(((byte []) (s)));
	//  144  311:aload           5
	//  145  313:invokevirtual   #152 <Method OutputStream HttpURLConnection.getOutputStream()>
	//  146  316:aload_1         
	//  147  317:invokevirtual   #158 <Method void OutputStream.write(byte[])>
		return httpurlconnection;
	//  148  320:aload           5
	//  149  322:areturn         
	}

	private static String a = "blid";
	private static String b = "robotpwd";
	private static String c = "method";
	private static String d = "value";
	private static String e = "ASSET-ID";
	private static String f = "POST";

	static 
	{
	//    0    0:return          
	}
}
