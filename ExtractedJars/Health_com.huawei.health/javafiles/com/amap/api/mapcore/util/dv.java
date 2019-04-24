// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import java.util.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			gg, gf, fd, gy, 
//			l, gr, go, gz

public class dv extends gg
{
	public static class a
	{

		public byte a[];
		public int b;

		public a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			b = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #16  <Field int b>
		//    5    9:return          
		}
	}


	public dv(Context context, String s)
	{
		super(context, ((Object) (s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #13  <Method void gg(Context, Object)>
		d = "/map/styles";
	//    4    6:aload_0         
	//    5    7:ldc1            #15  <String "/map/styles">
	//    6    9:putfield        #19  <Field String d>
	//    7   12:return          
	}

	protected a a(byte abyte0[])
		throws gf
	{
		a a1 = new a();
	//    0    0:new             #7   <Class dv$a>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void dv$a()>
	//    3    7:astore_2        
		a1.a = abyte0;
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:putfield        #29  <Field byte[] dv$a.a>
		return a1;
	//    7   13:aload_2         
	//    8   14:areturn         
	}

	public Map a()
	{
		Object obj = ((Object) (fd.e()));
	//    0    0:invokestatic    #37  <Method gy fd.e()>
	//    1    3:astore_2        
		String s = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		if(obj != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          15
			s = ((gy) (obj)).b();
	//    6   10:aload_2         
	//    7   11:invokevirtual   #43  <Method String gy.b()>
	//    8   14:astore_1        
		obj = ((Object) (new HashMap(16)));
	//    9   15:new             #45  <Class HashMap>
	//   10   18:dup             
	//   11   19:bipush          16
	//   12   21:invokespecial   #48  <Method void HashMap(int)>
	//   13   24:astore_2        
		((Map) (obj)).put("User-Agent", ((Object) (l.c)));
	//   14   25:aload_2         
	//   15   26:ldc1            #50  <String "User-Agent">
	//   16   28:getstatic       #55  <Field String l.c>
	//   17   31:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//   18   36:pop             
		((Map) (obj)).put("Accept-Encoding", "gzip");
	//   19   37:aload_2         
	//   20   38:ldc1            #63  <String "Accept-Encoding">
	//   21   40:ldc1            #65  <String "gzip">
	//   22   42:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//   23   47:pop             
		((Map) (obj)).put("platinfo", ((Object) (String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", new Object[] {
			s, "3dmap"
		}))));
	//   24   48:aload_2         
	//   25   49:ldc1            #67  <String "platinfo">
	//   26   51:getstatic       #73  <Field Locale Locale.US>
	//   27   54:ldc1            #75  <String "platform=Android&sdkversion=%s&product=%s">
	//   28   56:iconst_2        
	//   29   57:anewarray       Object[]
	//   30   60:dup             
	//   31   61:iconst_0        
	//   32   62:aload_1         
	//   33   63:aastore         
	//   34   64:dup             
	//   35   65:iconst_1        
	//   36   66:ldc1            #79  <String "3dmap">
	//   37   68:aastore         
	//   38   69:invokestatic    #85  <Method String String.format(Locale, String, Object[])>
	//   39   72:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//   40   77:pop             
		((Map) (obj)).put("x-INFO", ((Object) (gr.a(c))));
	//   41   78:aload_2         
	//   42   79:ldc1            #87  <String "x-INFO">
	//   43   81:aload_0         
	//   44   82:getfield        #90  <Field Context c>
	//   45   85:invokestatic    #95  <Method String gr.a(Context)>
	//   46   88:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//   47   93:pop             
		((Map) (obj)).put("key", ((Object) (go.f(c))));
	//   48   94:aload_2         
	//   49   95:ldc1            #97  <String "key">
	//   50   97:aload_0         
	//   51   98:getfield        #90  <Field Context c>
	//   52  101:invokestatic    #102 <Method String go.f(Context)>
	//   53  104:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//   54  109:pop             
		((Map) (obj)).put("logversion", "2.1");
	//   55  110:aload_2         
	//   56  111:ldc1            #104 <String "logversion">
	//   57  113:ldc1            #106 <String "2.1">
	//   58  115:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//   59  120:pop             
		return ((Map) (obj));
	//   60  121:aload_2         
	//   61  122:areturn         
	}

	public void a(String s)
	{
		d = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field String d>
	//    3    5:return          
	}

	protected Object b(String s)
		throws gf
	{
		return ((Object) (c(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #113 <Method dv$a c(String)>
	//    3    5:areturn         
	}

	protected Object b(byte abyte0[])
		throws gf
	{
		return ((Object) (a(abyte0)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #116 <Method dv$a a(byte[])>
	//    3    5:areturn         
	}

	public Map b()
	{
		HashMap hashmap = new HashMap(16);
	//    0    0:new             #45  <Class HashMap>
	//    1    3:dup             
	//    2    4:bipush          16
	//    3    6:invokespecial   #48  <Method void HashMap(int)>
	//    4    9:astore_1        
		((Map) (hashmap)).put("key", ((Object) (go.f(c))));
	//    5   10:aload_1         
	//    6   11:ldc1            #97  <String "key">
	//    7   13:aload_0         
	//    8   14:getfield        #90  <Field Context c>
	//    9   17:invokestatic    #102 <Method String go.f(Context)>
	//   10   20:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//   11   25:pop             
		((Map) (hashmap)).put("output", "bin");
	//   12   26:aload_1         
	//   13   27:ldc1            #118 <String "output">
	//   14   29:ldc1            #120 <String "bin">
	//   15   31:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//   16   36:pop             
		String s = gr.a();
	//   17   37:invokestatic    #122 <Method String gr.a()>
	//   18   40:astore_2        
		String s1 = gr.a(c, s, gz.c(((Map) (hashmap))));
	//   19   41:aload_0         
	//   20   42:getfield        #90  <Field Context c>
	//   21   45:aload_2         
	//   22   46:aload_1         
	//   23   47:invokestatic    #127 <Method String gz.c(Map)>
	//   24   50:invokestatic    #130 <Method String gr.a(Context, String, String)>
	//   25   53:astore_3        
		((Map) (hashmap)).put("ts", ((Object) (s)));
	//   26   54:aload_1         
	//   27   55:ldc1            #132 <String "ts">
	//   28   57:aload_2         
	//   29   58:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//   30   63:pop             
		((Map) (hashmap)).put("scode", ((Object) (s1)));
	//   31   64:aload_1         
	//   32   65:ldc1            #134 <String "scode">
	//   33   67:aload_3         
	//   34   68:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//   35   73:pop             
		return ((Map) (hashmap));
	//   36   74:aload_1         
	//   37   75:areturn         
	}

	protected a c(String s)
		throws gf
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String c()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String d>
	//    2    4:areturn         
	}
}
