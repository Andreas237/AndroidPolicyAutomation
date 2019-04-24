// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.text.TextUtils;
import com.amap.api.maps.MapsInitializer;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			jj, eg, x, gw, 
//			hm, go, ew, gr, 
//			l

class eg$a extends jj
{

	private String a(String s)
	{
		String as[] = s.split("&");
	//    0    0:aload_1         
	//    1    1:ldc1            #60  <String "&">
	//    2    3:invokevirtual   #66  <Method String[] String.split(String)>
	//    3    6:astore          4
		Arrays.sort(((Object []) (as)));
	//    4    8:aload           4
	//    5   10:invokestatic    #72  <Method void Arrays.sort(Object[])>
		StringBuffer stringbuffer = new StringBuffer();
	//    6   13:new             #74  <Class StringBuffer>
	//    7   16:dup             
	//    8   17:invokespecial   #75  <Method void StringBuffer()>
	//    9   20:astore          5
		int k = as.length;
	//   10   22:aload           4
	//   11   24:arraylength     
	//   12   25:istore_3        
		for(int j = 0; j < k; j++)
	//*  13   26:iconst_0        
	//*  14   27:istore_2        
	//*  15   28:iload_2         
	//*  16   29:iload_3         
	//*  17   30:icmpge          62
		{
			stringbuffer.append(b(as[j]));
	//   18   33:aload           5
	//   19   35:aload_0         
	//   20   36:aload           4
	//   21   38:iload_2         
	//   22   39:aaload          
	//   23   40:invokespecial   #77  <Method String b(String)>
	//   24   43:invokevirtual   #81  <Method StringBuffer StringBuffer.append(String)>
	//   25   46:pop             
			stringbuffer.append("&");
	//   26   47:aload           5
	//   27   49:ldc1            #60  <String "&">
	//   28   51:invokevirtual   #81  <Method StringBuffer StringBuffer.append(String)>
	//   29   54:pop             
		}

	//   30   55:iload_2         
	//   31   56:iconst_1        
	//   32   57:iadd            
	//   33   58:istore_2        
	//*  34   59:goto            28
		String s1 = stringbuffer.toString();
	//   35   62:aload           5
	//   36   64:invokevirtual   #84  <Method String StringBuffer.toString()>
	//   37   67:astore          4
		if(s1.length() > 1)
	//*  38   69:aload           4
	//*  39   71:invokevirtual   #88  <Method int String.length()>
	//*  40   74:iconst_1        
	//*  41   75:icmple          95
			return (String)s1.subSequence(0, s1.length() - 1);
	//   42   78:aload           4
	//   43   80:iconst_0        
	//   44   81:aload           4
	//   45   83:invokevirtual   #88  <Method int String.length()>
	//   46   86:iconst_1        
	//   47   87:isub            
	//   48   88:invokevirtual   #92  <Method CharSequence String.subSequence(int, int)>
	//   49   91:checkcast       #62  <Class String>
	//   50   94:areturn         
		else
			return s;
	//   51   95:aload_1         
	//   52   96:areturn         
	}

	private String b(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return s;
	//    2    4:aload_1         
	//    3    5:areturn         
		s = URLDecoder.decode(s, "utf-8");
	//    4    6:aload_1         
	//    5    7:ldc1            #98  <String "utf-8">
	//    6    9:invokestatic    #104 <Method String URLDecoder.decode(String, String)>
	//    7   12:astore_1        
		return s;
	//    8   13:aload_1         
	//    9   14:areturn         
		s;
	//   10   15:astore_1        
		hm.c(((Throwable) (s)), "AbstractProtocalHandler", "strReEncoder");
	//   11   16:aload_1         
	//   12   17:ldc1            #106 <String "AbstractProtocalHandler">
	//   13   19:ldc1            #108 <String "strReEncoder">
	//   14   21:invokestatic    #113 <Method void hm.c(Throwable, String, String)>
		break MISSING_BLOCK_LABEL_36;
	//   15   24:goto            36
		s;
	//   16   27:astore_1        
		hm.c(((Throwable) (s)), "AbstractProtocalHandler", "strReEncoderException");
	//   17   28:aload_1         
	//   18   29:ldc1            #106 <String "AbstractProtocalHandler">
	//   19   31:ldc1            #115 <String "strReEncoderException">
	//   20   33:invokestatic    #113 <Method void hm.c(Throwable, String, String)>
		return "";
	//   21   36:ldc1            #24  <String "">
	//   22   38:areturn         
	}

	private String d()
	{
		Object obj = ((Object) (new StringBuffer()));
	//    0    0:new             #74  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void StringBuffer()>
	//    3    7:astore_1        
		((StringBuffer) (obj)).append("key=").append(go.f(x.a));
	//    4    8:aload_1         
	//    5    9:ldc1            #117 <String "key=">
	//    6   11:invokevirtual   #81  <Method StringBuffer StringBuffer.append(String)>
	//    7   14:getstatic       #42  <Field android.content.Context x.a>
	//    8   17:invokestatic    #123 <Method String go.f(android.content.Context)>
	//    9   20:invokevirtual   #81  <Method StringBuffer StringBuffer.append(String)>
	//   10   23:pop             
		((StringBuffer) (obj)).append("&channel=amapapi");
	//   11   24:aload_1         
	//   12   25:ldc1            #125 <String "&channel=amapapi">
	//   13   27:invokevirtual   #81  <Method StringBuffer StringBuffer.append(String)>
	//   14   30:pop             
		if(ew.a(b, c, d) || d < 7)
	//*  15   31:aload_0         
	//*  16   32:getfield        #28  <Field int b>
	//*  17   35:aload_0         
	//*  18   36:getfield        #30  <Field int c>
	//*  19   39:aload_0         
	//*  20   40:getfield        #32  <Field int d>
	//*  21   43:invokestatic    #130 <Method boolean ew.a(int, int, int)>
	//*  22   46:ifne            58
	//*  23   49:aload_0         
	//*  24   50:getfield        #32  <Field int d>
	//*  25   53:bipush          7
	//*  26   55:icmpge          104
			((StringBuffer) (obj)).append("&z=").append(d).append("&x=").append(b).append("&y=").append(c).append("&lang=en&size=1&scale=1&style=7");
	//   27   58:aload_1         
	//   28   59:ldc1            #132 <String "&z=">
	//   29   61:invokevirtual   #81  <Method StringBuffer StringBuffer.append(String)>
	//   30   64:aload_0         
	//   31   65:getfield        #32  <Field int d>
	//   32   68:invokevirtual   #135 <Method StringBuffer StringBuffer.append(int)>
	//   33   71:ldc1            #137 <String "&x=">
	//   34   73:invokevirtual   #81  <Method StringBuffer StringBuffer.append(String)>
	//   35   76:aload_0         
	//   36   77:getfield        #28  <Field int b>
	//   37   80:invokevirtual   #135 <Method StringBuffer StringBuffer.append(int)>
	//   38   83:ldc1            #139 <String "&y=">
	//   39   85:invokevirtual   #81  <Method StringBuffer StringBuffer.append(String)>
	//   40   88:aload_0         
	//   41   89:getfield        #30  <Field int c>
	//   42   92:invokevirtual   #135 <Method StringBuffer StringBuffer.append(int)>
	//   43   95:ldc1            #141 <String "&lang=en&size=1&scale=1&style=7">
	//   44   97:invokevirtual   #81  <Method StringBuffer StringBuffer.append(String)>
	//   45  100:pop             
		else
	//*  46  101:goto            187
		if(MapsInitializer.isLoadWorldGridMap())
	//*  47  104:invokestatic    #147 <Method boolean MapsInitializer.isLoadWorldGridMap()>
	//*  48  107:ifeq            187
		{
			((StringBuffer) (obj)).append("&x=").append(b);
	//   49  110:aload_1         
	//   50  111:ldc1            #137 <String "&x=">
	//   51  113:invokevirtual   #81  <Method StringBuffer StringBuffer.append(String)>
	//   52  116:aload_0         
	//   53  117:getfield        #28  <Field int b>
	//   54  120:invokevirtual   #135 <Method StringBuffer StringBuffer.append(int)>
	//   55  123:pop             
			((StringBuffer) (obj)).append("&y=").append(c);
	//   56  124:aload_1         
	//   57  125:ldc1            #139 <String "&y=">
	//   58  127:invokevirtual   #81  <Method StringBuffer StringBuffer.append(String)>
	//   59  130:aload_0         
	//   60  131:getfield        #30  <Field int c>
	//   61  134:invokevirtual   #135 <Method StringBuffer StringBuffer.append(int)>
	//   62  137:pop             
			((StringBuffer) (obj)).append("&z=").append(d);
	//   63  138:aload_1         
	//   64  139:ldc1            #132 <String "&z=">
	//   65  141:invokevirtual   #81  <Method StringBuffer StringBuffer.append(String)>
	//   66  144:aload_0         
	//   67  145:getfield        #32  <Field int d>
	//   68  148:invokevirtual   #135 <Method StringBuffer StringBuffer.append(int)>
	//   69  151:pop             
			((StringBuffer) (obj)).append("&ds=0");
	//   70  152:aload_1         
	//   71  153:ldc1            #149 <String "&ds=0">
	//   72  155:invokevirtual   #81  <Method StringBuffer StringBuffer.append(String)>
	//   73  158:pop             
			((StringBuffer) (obj)).append("&dpitype=webrd");
	//   74  159:aload_1         
	//   75  160:ldc1            #151 <String "&dpitype=webrd">
	//   76  162:invokevirtual   #81  <Method StringBuffer StringBuffer.append(String)>
	//   77  165:pop             
			((StringBuffer) (obj)).append("&lang=").append(e);
	//   78  166:aload_1         
	//   79  167:ldc1            #153 <String "&lang=">
	//   80  169:invokevirtual   #81  <Method StringBuffer StringBuffer.append(String)>
	//   81  172:aload_0         
	//   82  173:getfield        #34  <Field String e>
	//   83  176:invokevirtual   #81  <Method StringBuffer StringBuffer.append(String)>
	//   84  179:pop             
			((StringBuffer) (obj)).append("&scale=2");
	//   85  180:aload_1         
	//   86  181:ldc1            #155 <String "&scale=2">
	//   87  183:invokevirtual   #81  <Method StringBuffer StringBuffer.append(String)>
	//   88  186:pop             
		}
		String s = ((StringBuffer) (obj)).toString();
	//   89  187:aload_1         
	//   90  188:invokevirtual   #84  <Method String StringBuffer.toString()>
	//   91  191:astore_3        
		obj = ((Object) (a(s)));
	//   92  192:aload_0         
	//   93  193:aload_3         
	//   94  194:invokespecial   #157 <Method String a(String)>
	//   95  197:astore_1        
		StringBuffer stringbuffer = new StringBuffer();
	//   96  198:new             #74  <Class StringBuffer>
	//   97  201:dup             
	//   98  202:invokespecial   #75  <Method void StringBuffer()>
	//   99  205:astore_2        
		stringbuffer.append(s);
	//  100  206:aload_2         
	//  101  207:aload_3         
	//  102  208:invokevirtual   #81  <Method StringBuffer StringBuffer.append(String)>
	//  103  211:pop             
		s = gr.a();
	//  104  212:invokestatic    #161 <Method String gr.a()>
	//  105  215:astore_3        
		stringbuffer.append((new StringBuilder()).append("&ts=").append(s).toString());
	//  106  216:aload_2         
	//  107  217:new             #163 <Class StringBuilder>
	//  108  220:dup             
	//  109  221:invokespecial   #164 <Method void StringBuilder()>
	//  110  224:ldc1            #166 <String "&ts=">
	//  111  226:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//  112  229:aload_3         
	//  113  230:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//  114  233:invokevirtual   #170 <Method String StringBuilder.toString()>
	//  115  236:invokevirtual   #81  <Method StringBuffer StringBuffer.append(String)>
	//  116  239:pop             
		stringbuffer.append((new StringBuilder()).append("&scode=").append(gr.a(x.a, s, ((String) (obj)))).toString());
	//  117  240:aload_2         
	//  118  241:new             #163 <Class StringBuilder>
	//  119  244:dup             
	//  120  245:invokespecial   #164 <Method void StringBuilder()>
	//  121  248:ldc1            #172 <String "&scode=">
	//  122  250:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//  123  253:getstatic       #42  <Field android.content.Context x.a>
	//  124  256:aload_3         
	//  125  257:aload_1         
	//  126  258:invokestatic    #175 <Method String gr.a(android.content.Context, String, String)>
	//  127  261:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//  128  264:invokevirtual   #170 <Method String StringBuilder.toString()>
	//  129  267:invokevirtual   #81  <Method StringBuffer StringBuffer.append(String)>
	//  130  270:pop             
		return stringbuffer.toString();
	//  131  271:aload_2         
	//  132  272:invokevirtual   #84  <Method String StringBuffer.toString()>
	//  133  275:areturn         
	}

	private String e()
	{
		if(ew.a(b, c, d) || d < 7)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field int b>
	//*   2    4:aload_0         
	//*   3    5:getfield        #30  <Field int c>
	//*   4    8:aload_0         
	//*   5    9:getfield        #32  <Field int d>
	//*   6   12:invokestatic    #130 <Method boolean ew.a(int, int, int)>
	//*   7   15:ifne            27
	//*   8   18:aload_0         
	//*   9   19:getfield        #32  <Field int d>
	//*  10   22:bipush          7
	//*  11   24:icmpge          64
		{
			int j = a.b.nextInt(0x186a0);
	//   12   27:aload_0         
	//   13   28:getfield        #19  <Field eg a>
	//   14   31:getfield        #178 <Field Random eg.b>
	//   15   34:ldc1            #179 <Int 0x186a0>
	//   16   36:invokevirtual   #185 <Method int Random.nextInt(int)>
	//   17   39:istore_1        
			return String.format(Locale.US, "http://wprd0%d.is.autonavi.com/appmaptile?", new Object[] {
				Integer.valueOf(j % 4 + 1)
			});
	//   18   40:getstatic       #191 <Field Locale Locale.US>
	//   19   43:ldc1            #193 <String "http://wprd0%d.is.autonavi.com/appmaptile?">
	//   20   45:iconst_1        
	//   21   46:anewarray       Object[]
	//   22   49:dup             
	//   23   50:iconst_0        
	//   24   51:iload_1         
	//   25   52:iconst_4        
	//   26   53:irem            
	//   27   54:iconst_1        
	//   28   55:iadd            
	//   29   56:invokestatic    #201 <Method Integer Integer.valueOf(int)>
	//   30   59:aastore         
	//   31   60:invokestatic    #205 <Method String String.format(Locale, String, Object[])>
	//   32   63:areturn         
		}
		if(MapsInitializer.isLoadWorldGridMap())
	//*  33   64:invokestatic    #147 <Method boolean MapsInitializer.isLoadWorldGridMap()>
	//*  34   67:ifeq            73
			return "http://restapi.amap.com/v4/gridmap?";
	//   35   70:ldc1            #207 <String "http://restapi.amap.com/v4/gridmap?">
	//   36   72:areturn         
		else
			return null;
	//   37   73:aconst_null     
	//   38   74:areturn         
	}

	public Map a()
	{
		Hashtable hashtable = new Hashtable(16);
	//    0    0:new             #210 <Class Hashtable>
	//    1    3:dup             
	//    2    4:bipush          16
	//    3    6:invokespecial   #212 <Method void Hashtable(int)>
	//    4    9:astore_1        
		((Map) (hashtable)).put("User-Agent", ((Object) (l.c)));
	//    5   10:aload_1         
	//    6   11:ldc1            #214 <String "User-Agent">
	//    7   13:getstatic       #218 <Field String l.c>
	//    8   16:invokeinterface #224 <Method Object Map.put(Object, Object)>
	//    9   21:pop             
		((Map) (hashtable)).put("Accept-Encoding", "gzip");
	//   10   22:aload_1         
	//   11   23:ldc1            #226 <String "Accept-Encoding">
	//   12   25:ldc1            #228 <String "gzip">
	//   13   27:invokeinterface #224 <Method Object Map.put(Object, Object)>
	//   14   32:pop             
		((Map) (hashtable)).put("platinfo", ((Object) (String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", new Object[] {
			"6.3.1", "3dmap"
		}))));
	//   15   33:aload_1         
	//   16   34:ldc1            #230 <String "platinfo">
	//   17   36:getstatic       #191 <Field Locale Locale.US>
	//   18   39:ldc1            #232 <String "platform=Android&sdkversion=%s&product=%s">
	//   19   41:iconst_2        
	//   20   42:anewarray       Object[]
	//   21   45:dup             
	//   22   46:iconst_0        
	//   23   47:ldc1            #234 <String "6.3.1">
	//   24   49:aastore         
	//   25   50:dup             
	//   26   51:iconst_1        
	//   27   52:ldc1            #236 <String "3dmap">
	//   28   54:aastore         
	//   29   55:invokestatic    #205 <Method String String.format(Locale, String, Object[])>
	//   30   58:invokeinterface #224 <Method Object Map.put(Object, Object)>
	//   31   63:pop             
		((Map) (hashtable)).put("x-INFO", ((Object) (gr.a(x.a))));
	//   32   64:aload_1         
	//   33   65:ldc1            #238 <String "x-INFO">
	//   34   67:getstatic       #42  <Field android.content.Context x.a>
	//   35   70:invokestatic    #240 <Method String gr.a(android.content.Context)>
	//   36   73:invokeinterface #224 <Method Object Map.put(Object, Object)>
	//   37   78:pop             
		((Map) (hashtable)).put("key", ((Object) (go.f(x.a))));
	//   38   79:aload_1         
	//   39   80:ldc1            #242 <String "key">
	//   40   82:getstatic       #42  <Field android.content.Context x.a>
	//   41   85:invokestatic    #123 <Method String go.f(android.content.Context)>
	//   42   88:invokeinterface #224 <Method Object Map.put(Object, Object)>
	//   43   93:pop             
		((Map) (hashtable)).put("logversion", "2.1");
	//   44   94:aload_1         
	//   45   95:ldc1            #244 <String "logversion">
	//   46   97:ldc1            #246 <String "2.1">
	//   47   99:invokeinterface #224 <Method Object Map.put(Object, Object)>
	//   48  104:pop             
		return ((Map) (hashtable));
	//   49  105:aload_1         
	//   50  106:areturn         
	}

	public Map b()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String c()
	{
		if(TextUtils.isEmpty(((CharSequence) (i))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field String i>
	//*   2    4:invokestatic    #254 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   3    7:ifeq            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		else
			return (new StringBuilder()).append(i).append(d()).toString();
	//    6   12:new             #163 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #164 <Method void StringBuilder()>
	//    9   19:aload_0         
	//   10   20:getfield        #26  <Field String i>
	//   11   23:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   12   26:aload_0         
	//   13   27:invokespecial   #256 <Method String d()>
	//   14   30:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:invokevirtual   #170 <Method String StringBuilder.toString()>
	//   16   36:areturn         
	}

	final eg a;
	private int b;
	private int c;
	private int d;
	private String e;
	private String i;

	public eg$a(eg eg1, int j, int k, int i1, String s)
	{
		a = eg1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field eg a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void jj()>
		i = "";
	//    5    9:aload_0         
	//    6   10:ldc1            #24  <String "">
	//    7   12:putfield        #26  <Field String i>
		b = j;
	//    8   15:aload_0         
	//    9   16:iload_2         
	//   10   17:putfield        #28  <Field int b>
		c = k;
	//   11   20:aload_0         
	//   12   21:iload_3         
	//   13   22:putfield        #30  <Field int c>
		d = i1;
	//   14   25:aload_0         
	//   15   26:iload           4
	//   16   28:putfield        #32  <Field int d>
		e = s;
	//   17   31:aload_0         
	//   18   32:aload           5
	//   19   34:putfield        #34  <Field String e>
		i = e();
	//   20   37:aload_0         
	//   21   38:aload_0         
	//   22   39:invokespecial   #37  <Method String e()>
	//   23   42:putfield        #26  <Field String i>
		a(gw.a(x.a));
	//   24   45:aload_0         
	//   25   46:getstatic       #42  <Field android.content.Context x.a>
	//   26   49:invokestatic    #47  <Method java.net.Proxy gw.a(android.content.Context)>
	//   27   52:invokevirtual   #50  <Method void a(java.net.Proxy)>
		a(5000);
	//   28   55:aload_0         
	//   29   56:sipush          5000
	//   30   59:invokevirtual   #53  <Method void a(int)>
		b(50000);
	//   31   62:aload_0         
	//   32   63:ldc1            #54  <Int 50000>
	//   33   65:invokevirtual   #56  <Method void b(int)>
	//   34   68:return          
	}
}
