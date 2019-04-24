// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.amap.api.mapcore.util:
//			jf, gp, gt, gv, 
//			gy, gz

static class gp$b extends jf
{

	private Map o()
	{
		String s = gt.t(a);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Context a>
	//    2    4:invokestatic    #46  <Method String gt.t(Context)>
	//    3    7:astore_2        
		Object obj = ((Object) (s));
	//    4    8:aload_2         
	//    5    9:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   6   10:aload_2         
	//*   7   11:invokestatic    #52  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   8   14:ifeq            21
			obj = ((Object) (gt.c()));
	//    9   17:invokestatic    #55  <Method String gt.c()>
	//   10   20:astore_1        
		s = ((String) (obj));
	//   11   21:aload_1         
	//   12   22:astore_2        
		if(!TextUtils.isEmpty(((CharSequence) (obj))))
	//*  13   23:aload_1         
	//*  14   24:invokestatic    #52  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  15   27:ifne            48
			s = gv.b((new StringBuilder(((String) (obj)))).reverse().toString());
	//   16   30:new             #57  <Class StringBuilder>
	//   17   33:dup             
	//   18   34:aload_1         
	//   19   35:invokespecial   #60  <Method void StringBuilder(String)>
	//   20   38:invokevirtual   #64  <Method StringBuilder StringBuilder.reverse()>
	//   21   41:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   22   44:invokestatic    #72  <Method String gv.b(String)>
	//   23   47:astore_2        
		obj = ((Object) (new HashMap()));
	//   24   48:new             #74  <Class HashMap>
	//   25   51:dup             
	//   26   52:invokespecial   #77  <Method void HashMap()>
	//   27   55:astore_1        
		((Map) (obj)).put("authkey", ((Object) (c)));
	//   28   56:aload_1         
	//   29   57:ldc1            #79  <String "authkey">
	//   30   59:aload_0         
	//   31   60:getfield        #21  <Field String c>
	//   32   63:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//   33   68:pop             
		((Map) (obj)).put("plattype", "android");
	//   34   69:aload_1         
	//   35   70:ldc1            #87  <String "plattype">
	//   36   72:ldc1            #89  <String "android">
	//   37   74:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//   38   79:pop             
		((Map) (obj)).put("product", ((Object) (b.a())));
	//   39   80:aload_1         
	//   40   81:ldc1            #91  <String "product">
	//   41   83:aload_0         
	//   42   84:getfield        #94  <Field gy b>
	//   43   87:invokevirtual   #98  <Method String gy.a()>
	//   44   90:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//   45   95:pop             
		((Map) (obj)).put("version", ((Object) (b.b())));
	//   46   96:aload_1         
	//   47   97:ldc1            #100 <String "version">
	//   48   99:aload_0         
	//   49  100:getfield        #94  <Field gy b>
	//   50  103:invokevirtual   #102 <Method String gy.b()>
	//   51  106:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//   52  111:pop             
		((Map) (obj)).put("output", "json");
	//   53  112:aload_1         
	//   54  113:ldc1            #104 <String "output">
	//   55  115:ldc1            #106 <String "json">
	//   56  117:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//   57  122:pop             
		((Map) (obj)).put("androidversion", ((Object) ((new StringBuilder()).append(android.os..VERSION.SDK_INT).append("").toString())));
	//   58  123:aload_1         
	//   59  124:ldc1            #108 <String "androidversion">
	//   60  126:new             #57  <Class StringBuilder>
	//   61  129:dup             
	//   62  130:invokespecial   #109 <Method void StringBuilder()>
	//   63  133:getstatic       #29  <Field int android.os.Build$VERSION.SDK_INT>
	//   64  136:invokevirtual   #113 <Method StringBuilder StringBuilder.append(int)>
	//   65  139:ldc1            #115 <String "">
	//   66  141:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   67  144:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   68  147:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//   69  152:pop             
		((Map) (obj)).put("deviceId", ((Object) (s)));
	//   70  153:aload_1         
	//   71  154:ldc1            #120 <String "deviceId">
	//   72  156:aload_2         
	//   73  157:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//   74  162:pop             
		((Map) (obj)).put("manufacture", ((Object) (Build.MANUFACTURER)));
	//   75  163:aload_1         
	//   76  164:ldc1            #122 <String "manufacture">
	//   77  166:getstatic       #127 <Field String Build.MANUFACTURER>
	//   78  169:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//   79  174:pop             
		if(d != null && !d.isEmpty())
	//*  80  175:aload_0         
	//*  81  176:getfield        #23  <Field Map d>
	//*  82  179:ifnull          204
	//*  83  182:aload_0         
	//*  84  183:getfield        #23  <Field Map d>
	//*  85  186:invokeinterface #130 <Method boolean Map.isEmpty()>
	//*  86  191:ifne            204
			((Map) (obj)).putAll(d);
	//   87  194:aload_1         
	//   88  195:aload_0         
	//   89  196:getfield        #23  <Field Map d>
	//   90  199:invokeinterface #134 <Method void Map.putAll(Map)>
		((Map) (obj)).put("abitype", ((Object) (gz.a(a))));
	//   91  204:aload_1         
	//   92  205:ldc1            #136 <String "abitype">
	//   93  207:aload_0         
	//   94  208:getfield        #40  <Field Context a>
	//   95  211:invokestatic    #140 <Method String gz.a(Context)>
	//   96  214:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//   97  219:pop             
		((Map) (obj)).put("ext", ((Object) (b.e())));
	//   98  220:aload_1         
	//   99  221:ldc1            #142 <String "ext">
	//  100  223:aload_0         
	//  101  224:getfield        #94  <Field gy b>
	//  102  227:invokevirtual   #144 <Method String gy.e()>
	//  103  230:invokeinterface #85  <Method Object Map.put(Object, Object)>
	//  104  235:pop             
		return ((Map) (obj));
	//  105  236:aload_1         
	//  106  237:areturn         
	}

	public Map a()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String c()
	{
		if(e)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field boolean e>
	//*   2    4:ifeq            10
			return "https://restapi.amap.com/v3/iasdkauth";
	//    3    7:ldc1            #147 <String "https://restapi.amap.com/v3/iasdkauth">
	//    4    9:areturn         
		else
			return "http://restapi.amap.com/v3/iasdkauth";
	//    5   10:ldc1            #149 <String "http://restapi.amap.com/v3/iasdkauth">
	//    6   12:areturn         
	}

	public boolean d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field boolean e>
	//    2    4:ireturn         
	}

	public byte[] e()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public byte[] f()
	{
		return gz.a(gz.b(o()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #153 <Method Map o()>
	//    2    4:invokestatic    #156 <Method String gz.b(Map)>
	//    3    7:invokestatic    #159 <Method byte[] gz.a(String)>
	//    4   10:areturn         
	}

	protected String h()
	{
		return "3.0";
	//    0    0:ldc1            #162 <String "3.0">
	//    1    2:areturn         
	}

	private String c;
	private Map d;
	private boolean e;

	gp$b(Context context, gy gy1, String s, Map map)
	{
		super(context, gy1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #19  <Method void jf(Context, gy)>
		c = s;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #21  <Field String c>
		d = map;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #23  <Field Map d>
		boolean flag;
		if(android.os..VERSION.SDK_INT != 19)
	//*  10   17:getstatic       #29  <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   20:bipush          19
	//*  12   22:icmpeq          31
			flag = true;
	//   13   25:iconst_1        
	//   14   26:istore          5
		else
	//*  15   28:goto            34
			flag = false;
	//   16   31:iconst_0        
	//   17   32:istore          5
		e = flag;
	//   18   34:aload_0         
	//   19   35:iload           5
	//   20   37:putfield        #31  <Field boolean e>
	//   21   40:return          
	}
}
