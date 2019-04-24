// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import java.util.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			gg, gf, fd, gy, 
//			l, gr, go, gz

public class dt extends gg
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


	public dt(Context context, String s)
	{
		super(context, ((Object) (s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void gg(Context, Object)>
		d = "/map/styles";
	//    4    6:aload_0         
	//    5    7:ldc1            #17  <String "/map/styles">
	//    6    9:putfield        #20  <Field String d>
	//    7   12:return          
	}

	protected a a(String s)
		throws gf
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	protected a a(byte abyte0[])
		throws gf
	{
		a a1 = new a();
	//    0    0:new             #7   <Class dt$a>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void dt$a()>
	//    3    7:astore_2        
		a1.a = abyte0;
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:putfield        #32  <Field byte[] dt$a.a>
		return a1;
	//    7   13:aload_2         
	//    8   14:areturn         
	}

	public Map a()
	{
		Object obj = ((Object) (fd.e()));
	//    0    0:invokestatic    #39  <Method gy fd.e()>
	//    1    3:astore_2        
		String s = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		if(obj != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          15
			s = ((gy) (obj)).b();
	//    6   10:aload_2         
	//    7   11:invokevirtual   #45  <Method String gy.b()>
	//    8   14:astore_1        
		obj = ((Object) (new Hashtable(16)));
	//    9   15:new             #47  <Class Hashtable>
	//   10   18:dup             
	//   11   19:bipush          16
	//   12   21:invokespecial   #50  <Method void Hashtable(int)>
	//   13   24:astore_2        
		((Map) (obj)).put("User-Agent", ((Object) (l.c)));
	//   14   25:aload_2         
	//   15   26:ldc1            #52  <String "User-Agent">
	//   16   28:getstatic       #57  <Field String l.c>
	//   17   31:invokeinterface #63  <Method Object Map.put(Object, Object)>
	//   18   36:pop             
		((Map) (obj)).put("Accept-Encoding", "gzip");
	//   19   37:aload_2         
	//   20   38:ldc1            #65  <String "Accept-Encoding">
	//   21   40:ldc1            #67  <String "gzip">
	//   22   42:invokeinterface #63  <Method Object Map.put(Object, Object)>
	//   23   47:pop             
		((Map) (obj)).put("platinfo", ((Object) (String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", new Object[] {
			s, "3dmap"
		}))));
	//   24   48:aload_2         
	//   25   49:ldc1            #69  <String "platinfo">
	//   26   51:getstatic       #75  <Field Locale Locale.US>
	//   27   54:ldc1            #77  <String "platform=Android&sdkversion=%s&product=%s">
	//   28   56:iconst_2        
	//   29   57:anewarray       Object[]
	//   30   60:dup             
	//   31   61:iconst_0        
	//   32   62:aload_1         
	//   33   63:aastore         
	//   34   64:dup             
	//   35   65:iconst_1        
	//   36   66:ldc1            #81  <String "3dmap">
	//   37   68:aastore         
	//   38   69:invokestatic    #87  <Method String String.format(Locale, String, Object[])>
	//   39   72:invokeinterface #63  <Method Object Map.put(Object, Object)>
	//   40   77:pop             
		((Map) (obj)).put("x-INFO", ((Object) (gr.a(c))));
	//   41   78:aload_2         
	//   42   79:ldc1            #89  <String "x-INFO">
	//   43   81:aload_0         
	//   44   82:getfield        #92  <Field Context c>
	//   45   85:invokestatic    #97  <Method String gr.a(Context)>
	//   46   88:invokeinterface #63  <Method Object Map.put(Object, Object)>
	//   47   93:pop             
		((Map) (obj)).put("key", ((Object) (go.f(c))));
	//   48   94:aload_2         
	//   49   95:ldc1            #99  <String "key">
	//   50   97:aload_0         
	//   51   98:getfield        #92  <Field Context c>
	//   52  101:invokestatic    #104 <Method String go.f(Context)>
	//   53  104:invokeinterface #63  <Method Object Map.put(Object, Object)>
	//   54  109:pop             
		((Map) (obj)).put("logversion", "2.1");
	//   55  110:aload_2         
	//   56  111:ldc1            #106 <String "logversion">
	//   57  113:ldc1            #108 <String "2.1">
	//   58  115:invokeinterface #63  <Method Object Map.put(Object, Object)>
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
	//    2    2:invokevirtual   #113 <Method dt$a a(String)>
	//    3    5:areturn         
	}

	protected Object b(byte abyte0[])
		throws gf
	{
		return ((Object) (a(abyte0)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #116 <Method dt$a a(byte[])>
	//    3    5:areturn         
	}

	public Map b()
	{
		Hashtable hashtable = new Hashtable(16);
	//    0    0:new             #47  <Class Hashtable>
	//    1    3:dup             
	//    2    4:bipush          16
	//    3    6:invokespecial   #50  <Method void Hashtable(int)>
	//    4    9:astore_1        
		((Map) (hashtable)).put("key", ((Object) (go.f(c))));
	//    5   10:aload_1         
	//    6   11:ldc1            #99  <String "key">
	//    7   13:aload_0         
	//    8   14:getfield        #92  <Field Context c>
	//    9   17:invokestatic    #104 <Method String go.f(Context)>
	//   10   20:invokeinterface #63  <Method Object Map.put(Object, Object)>
	//   11   25:pop             
		((Map) (hashtable)).put("output", "bin");
	//   12   26:aload_1         
	//   13   27:ldc1            #118 <String "output">
	//   14   29:ldc1            #120 <String "bin">
	//   15   31:invokeinterface #63  <Method Object Map.put(Object, Object)>
	//   16   36:pop             
		((Map) (hashtable)).put("styleid", ((Object) (i)));
	//   17   37:aload_1         
	//   18   38:ldc1            #122 <String "styleid">
	//   19   40:aload_0         
	//   20   41:getfield        #124 <Field String i>
	//   21   44:invokeinterface #63  <Method Object Map.put(Object, Object)>
	//   22   49:pop             
		String s = gr.a();
	//   23   50:invokestatic    #126 <Method String gr.a()>
	//   24   53:astore_2        
		String s1 = gr.a(c, s, gz.c(((Map) (hashtable))));
	//   25   54:aload_0         
	//   26   55:getfield        #92  <Field Context c>
	//   27   58:aload_2         
	//   28   59:aload_1         
	//   29   60:invokestatic    #131 <Method String gz.c(Map)>
	//   30   63:invokestatic    #134 <Method String gr.a(Context, String, String)>
	//   31   66:astore_3        
		((Map) (hashtable)).put("ts", ((Object) (s)));
	//   32   67:aload_1         
	//   33   68:ldc1            #136 <String "ts">
	//   34   70:aload_2         
	//   35   71:invokeinterface #63  <Method Object Map.put(Object, Object)>
	//   36   76:pop             
		((Map) (hashtable)).put("scode", ((Object) (s1)));
	//   37   77:aload_1         
	//   38   78:ldc1            #138 <String "scode">
	//   39   80:aload_3         
	//   40   81:invokeinterface #63  <Method Object Map.put(Object, Object)>
	//   41   86:pop             
		return ((Map) (hashtable));
	//   42   87:aload_1         
	//   43   88:areturn         
	}

	public String c()
	{
		return (new StringBuilder()).append("http://restapi.amap.com/v4").append(d).toString();
	//    0    0:new             #140 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #141 <Method void StringBuilder()>
	//    3    7:ldc1            #143 <String "http://restapi.amap.com/v4">
	//    4    9:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #20  <Field String d>
	//    7   16:invokevirtual   #147 <Method StringBuilder StringBuilder.append(String)>
	//    8   19:invokevirtual   #150 <Method String StringBuilder.toString()>
	//    9   22:areturn         
	}

	public void c(String s)
	{
		i = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #124 <Field String i>
	//    3    5:return          
	}

	private String i;
}
