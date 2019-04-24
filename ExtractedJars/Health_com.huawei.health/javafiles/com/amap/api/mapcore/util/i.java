// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import java.util.*;
import org.json.JSONObject;

// Referenced classes of package com.amap.api.mapcore.util:
//			gg, gf, fd, gy, 
//			l, gr, go, gz

public class i extends gg
{
	public static class a
	{

		public int a;
		public String b;
		public String c;
		public boolean d;

		public a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			a = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #19  <Field int a>
			d = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #21  <Field boolean d>
		//    8   14:return          
		}
	}


	public i(Context context, String s)
	{
		super(context, ((Object) (s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void gg(Context, Object)>
	//    4    6:aload_0         
	//    5    7:bipush          8
	//    6    9:newarray        int[]
	//    7   11:dup             
	//    8   12:iconst_0        
	//    9   13:sipush          10000
	//   10   16:iastore         
	//   11   17:dup             
	//   12   18:iconst_1        
	//   13   19:iconst_0        
	//   14   20:iastore         
	//   15   21:dup             
	//   16   22:iconst_2        
	//   17   23:sipush          10018
	//   18   26:iastore         
	//   19   27:dup             
	//   20   28:iconst_3        
	//   21   29:sipush          10019
	//   22   32:iastore         
	//   23   33:dup             
	//   24   34:iconst_4        
	//   25   35:sipush          10020
	//   26   38:iastore         
	//   27   39:dup             
	//   28   40:iconst_5        
	//   29   41:sipush          10021
	//   30   44:iastore         
	//   31   45:dup             
	//   32   46:bipush          6
	//   33   48:sipush          10022
	//   34   51:iastore         
	//   35   52:dup             
	//   36   53:bipush          7
	//   37   55:sipush          10023
	//   38   58:iastore         
	//   39   59:putfield        #17  <Field int[] i>
		d = "/feedback";
	//   40   62:aload_0         
	//   41   63:ldc1            #19  <String "/feedback">
	//   42   65:putfield        #23  <Field String d>
		e = false;
	//   43   68:aload_0         
	//   44   69:iconst_0        
	//   45   70:putfield        #27  <Field boolean e>
	//   46   73:return          
	}

	protected a a(String s)
		throws gf
	{
		int j;
		int k;
		int i1;
		String s1;
		Object obj;
		try
		{
			obj = ((Object) (new JSONObject(s)));
	//    0    0:new             #35  <Class JSONObject>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #38  <Method void JSONObject(String)>
	//    4    8:astore          6
		}
	//*   5   10:iconst_m1       
	//*   6   11:istore_2        
	//*   7   12:ldc1            #40  <String "">
	//*   8   14:astore_1        
	//*   9   15:ldc1            #40  <String "">
	//*  10   17:astore          5
	//*  11   19:aload           6
	//*  12   21:ldc1            #42  <String "errcode">
	//*  13   23:invokevirtual   #46  <Method boolean JSONObject.has(String)>
	//*  14   26:ifeq            54
	//*  15   29:aload           6
	//*  16   31:ldc1            #42  <String "errcode">
	//*  17   33:invokevirtual   #50  <Method int JSONObject.optInt(String)>
	//*  18   36:istore_2        
	//*  19   37:aload           6
	//*  20   39:ldc1            #52  <String "errmsg">
	//*  21   41:invokevirtual   #56  <Method String JSONObject.optString(String)>
	//*  22   44:astore_1        
	//*  23   45:aload           6
	//*  24   47:ldc1            #58  <String "errdetail">
	//*  25   49:invokevirtual   #56  <Method String JSONObject.optString(String)>
	//*  26   52:astore          5
	//*  27   54:new             #7   <Class i$a>
	//*  28   57:dup             
	//*  29   58:invokespecial   #61  <Method void i$a()>
	//*  30   61:astore          6
	//*  31   63:aload           6
	//*  32   65:iload_2         
	//*  33   66:putfield        #64  <Field int i$a.a>
	//*  34   69:aload           6
	//*  35   71:aload_1         
	//*  36   72:putfield        #67  <Field String i$a.b>
	//*  37   75:aload           6
	//*  38   77:aload           5
	//*  39   79:putfield        #70  <Field String i$a.c>
	//*  40   82:aload           6
	//*  41   84:iconst_0        
	//*  42   85:putfield        #72  <Field boolean i$a.d>
	//*  43   88:aload_0         
	//*  44   89:getfield        #17  <Field int[] i>
	//*  45   92:astore_1        
	//*  46   93:aload_1         
	//*  47   94:arraylength     
	//*  48   95:istore          4
	//*  49   97:iconst_0        
	//*  50   98:istore_3        
	//*  51   99:iload_3         
	//*  52  100:iload           4
	//*  53  102:icmpge          128
	//*  54  105:aload_1         
	//*  55  106:iload_3         
	//*  56  107:iaload          
	//*  57  108:iload_2         
	//*  58  109:icmpne          121
	//*  59  112:aload           6
	//*  60  114:iconst_1        
	//*  61  115:putfield        #72  <Field boolean i$a.d>
	//*  62  118:aload           6
	//*  63  120:areturn         
	//*  64  121:iload_3         
	//*  65  122:iconst_1        
	//*  66  123:iadd            
	//*  67  124:istore_3        
	//*  68  125:goto            99
	//*  69  128:aload           6
	//*  70  130:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  71  131:astore_1        
		{
			((Throwable) (s)).printStackTrace();
	//   72  132:aload_1         
	//   73  133:invokevirtual   #75  <Method void Throwable.printStackTrace()>
			return null;
	//   74  136:aconst_null     
	//   75  137:areturn         
		}
		j = -1;
		s = "";
		s1 = "";
		if(((JSONObject) (obj)).has("errcode"))
		{
			j = ((JSONObject) (obj)).optInt("errcode");
			s = ((JSONObject) (obj)).optString("errmsg");
			s1 = ((JSONObject) (obj)).optString("errdetail");
		}
		obj = ((Object) (new a()));
		obj.a = j;
		obj.b = s;
		obj.c = s1;
		obj.d = false;
		s = ((String) (i));
		i1 = s.length;
		k = 0;
_L2:
		if(k >= i1)
			break; /* Loop/switch isn't completed */
		if(s[k] != j)
			break MISSING_BLOCK_LABEL_121;
		obj.d = true;
		return ((a) (obj));
		k++;
		if(true) goto _L2; else goto _L1
_L1:
		return ((a) (obj));
	}

	public Map a()
	{
		Object obj = ((Object) (fd.e()));
	//    0    0:invokestatic    #82  <Method gy fd.e()>
	//    1    3:astore_2        
		String s = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		if(obj != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          15
			s = ((gy) (obj)).b();
	//    6   10:aload_2         
	//    7   11:invokevirtual   #87  <Method String gy.b()>
	//    8   14:astore_1        
		obj = ((Object) (new Hashtable(16)));
	//    9   15:new             #89  <Class Hashtable>
	//   10   18:dup             
	//   11   19:bipush          16
	//   12   21:invokespecial   #92  <Method void Hashtable(int)>
	//   13   24:astore_2        
		((Map) (obj)).put("User-Agent", ((Object) (l.c)));
	//   14   25:aload_2         
	//   15   26:ldc1            #94  <String "User-Agent">
	//   16   28:getstatic       #97  <Field String l.c>
	//   17   31:invokeinterface #103 <Method Object Map.put(Object, Object)>
	//   18   36:pop             
		((Map) (obj)).put("Accept-Encoding", "gzip");
	//   19   37:aload_2         
	//   20   38:ldc1            #105 <String "Accept-Encoding">
	//   21   40:ldc1            #107 <String "gzip">
	//   22   42:invokeinterface #103 <Method Object Map.put(Object, Object)>
	//   23   47:pop             
		((Map) (obj)).put("platinfo", ((Object) (String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", new Object[] {
			s, "3dmap"
		}))));
	//   24   48:aload_2         
	//   25   49:ldc1            #109 <String "platinfo">
	//   26   51:getstatic       #115 <Field Locale Locale.US>
	//   27   54:ldc1            #117 <String "platform=Android&sdkversion=%s&product=%s">
	//   28   56:iconst_2        
	//   29   57:anewarray       Object[]
	//   30   60:dup             
	//   31   61:iconst_0        
	//   32   62:aload_1         
	//   33   63:aastore         
	//   34   64:dup             
	//   35   65:iconst_1        
	//   36   66:ldc1            #121 <String "3dmap">
	//   37   68:aastore         
	//   38   69:invokestatic    #127 <Method String String.format(Locale, String, Object[])>
	//   39   72:invokeinterface #103 <Method Object Map.put(Object, Object)>
	//   40   77:pop             
		((Map) (obj)).put("x-INFO", ((Object) (gr.a(c))));
	//   41   78:aload_2         
	//   42   79:ldc1            #129 <String "x-INFO">
	//   43   81:aload_0         
	//   44   82:getfield        #132 <Field Context c>
	//   45   85:invokestatic    #137 <Method String gr.a(Context)>
	//   46   88:invokeinterface #103 <Method Object Map.put(Object, Object)>
	//   47   93:pop             
		((Map) (obj)).put("key", ((Object) (go.f(c))));
	//   48   94:aload_2         
	//   49   95:ldc1            #139 <String "key">
	//   50   97:aload_0         
	//   51   98:getfield        #132 <Field Context c>
	//   52  101:invokestatic    #144 <Method String go.f(Context)>
	//   53  104:invokeinterface #103 <Method Object Map.put(Object, Object)>
	//   54  109:pop             
		((Map) (obj)).put("logversion", "2.1");
	//   55  110:aload_2         
	//   56  111:ldc1            #146 <String "logversion">
	//   57  113:ldc1            #148 <String "2.1">
	//   58  115:invokeinterface #103 <Method Object Map.put(Object, Object)>
	//   59  120:pop             
		return ((Map) (obj));
	//   60  121:aload_2         
	//   61  122:areturn         
	}

	protected Object b(String s)
		throws gf
	{
		return ((Object) (a(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #153 <Method i$a a(String)>
	//    3    5:areturn         
	}

	public Map b()
	{
		Hashtable hashtable = new Hashtable(16);
	//    0    0:new             #89  <Class Hashtable>
	//    1    3:dup             
	//    2    4:bipush          16
	//    3    6:invokespecial   #92  <Method void Hashtable(int)>
	//    4    9:astore_1        
		((Map) (hashtable)).put("key", ((Object) (go.f(c))));
	//    5   10:aload_1         
	//    6   11:ldc1            #139 <String "key">
	//    7   13:aload_0         
	//    8   14:getfield        #132 <Field Context c>
	//    9   17:invokestatic    #144 <Method String go.f(Context)>
	//   10   20:invokeinterface #103 <Method Object Map.put(Object, Object)>
	//   11   25:pop             
		((Map) (hashtable)).put("pname", "3dmap");
	//   12   26:aload_1         
	//   13   27:ldc1            #155 <String "pname">
	//   14   29:ldc1            #121 <String "3dmap">
	//   15   31:invokeinterface #103 <Method Object Map.put(Object, Object)>
	//   16   36:pop             
		String s = gr.a();
	//   17   37:invokestatic    #157 <Method String gr.a()>
	//   18   40:astore_2        
		String s1 = gr.a(c, s, gz.c(((Map) (hashtable))));
	//   19   41:aload_0         
	//   20   42:getfield        #132 <Field Context c>
	//   21   45:aload_2         
	//   22   46:aload_1         
	//   23   47:invokestatic    #162 <Method String gz.c(Map)>
	//   24   50:invokestatic    #165 <Method String gr.a(Context, String, String)>
	//   25   53:astore_3        
		((Map) (hashtable)).put("ts", ((Object) (s)));
	//   26   54:aload_1         
	//   27   55:ldc1            #167 <String "ts">
	//   28   57:aload_2         
	//   29   58:invokeinterface #103 <Method Object Map.put(Object, Object)>
	//   30   63:pop             
		((Map) (hashtable)).put("scode", ((Object) (s1)));
	//   31   64:aload_1         
	//   32   65:ldc1            #169 <String "scode">
	//   33   67:aload_3         
	//   34   68:invokeinterface #103 <Method Object Map.put(Object, Object)>
	//   35   73:pop             
		return ((Map) (hashtable));
	//   36   74:aload_1         
	//   37   75:areturn         
	}

	public String c()
	{
		return (new StringBuilder()).append("http://restapi.amap.com/v4").append(d).toString();
	//    0    0:new             #171 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #172 <Method void StringBuilder()>
	//    3    7:ldc1            #174 <String "http://restapi.amap.com/v4">
	//    4    9:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #23  <Field String d>
	//    7   16:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//    8   19:invokevirtual   #181 <Method String StringBuilder.toString()>
	//    9   22:areturn         
	}

	private int i[] = {
		10000, 0, 10018, 10019, 10020, 10021, 10022, 10023
	};
}
