// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.paypal.android.sdk:
//			eq, cj, cd, ca, 
//			ab

public final class eg extends eq
{

	public eg(ca ca, ab ab, String s, String s1, String s2, String s3, List list)
	{
		super(cj.e, ca, ab, b(s, s1));
	//    0    0:aload_0         
	//    1    1:getstatic       #17  <Field cj cj.e>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokestatic    #20  <Method String b(String, String)>
	//    7   12:invokespecial   #23  <Method void eq(cj, ca, ab, String)>
		a = s2;
	//    8   15:aload_0         
	//    9   16:aload           5
	//   10   18:putfield        #25  <Field String a>
		c = s3;
	//   11   21:aload_0         
	//   12   22:aload           6
	//   13   24:putfield        #27  <Field String c>
		b = list;
	//   14   27:aload_0         
	//   15   28:aload           7
	//   16   30:putfield        #29  <Field List b>
	//   17   33:return          
	}

	public final String b()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #33  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void HashMap()>
	//    3    7:astore_1        
		hashmap.put("code", ((Object) (a)));
	//    4    8:aload_1         
	//    5    9:ldc1            #38  <String "code">
	//    6   11:aload_0         
	//    7   12:getfield        #25  <Field String a>
	//    8   15:invokevirtual   #42  <Method Object HashMap.put(Object, Object)>
	//    9   18:pop             
		hashmap.put("nonce", ((Object) (c)));
	//   10   19:aload_1         
	//   11   20:ldc1            #44  <String "nonce">
	//   12   22:aload_0         
	//   13   23:getfield        #27  <Field String c>
	//   14   26:invokevirtual   #42  <Method Object HashMap.put(Object, Object)>
	//   15   29:pop             
		hashmap.put("scope", ((Object) (TextUtils.join(" ", ((Iterable) (b))))));
	//   16   30:aload_1         
	//   17   31:ldc1            #46  <String "scope">
	//   18   33:ldc1            #48  <String " ">
	//   19   35:aload_0         
	//   20   36:getfield        #29  <Field List b>
	//   21   39:invokestatic    #54  <Method String TextUtils.join(CharSequence, Iterable)>
	//   22   42:invokevirtual   #42  <Method Object HashMap.put(Object, Object)>
	//   23   45:pop             
		return cd.a(((java.util.Map) (hashmap)));
	//   24   46:aload_1         
	//   25   47:invokestatic    #59  <Method String cd.a(java.util.Map)>
	//   26   50:areturn         
	}

	public final void c()
	{
	//    0    0:return          
	}

	public final void d()
	{
		b(m());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #64  <Method org.json.JSONObject m()>
	//    3    5:invokevirtual   #67  <Method void b(org.json.JSONObject)>
	//    4    8:return          
	}

	public final String e()
	{
		return "{\"code\":\"EOTHbvqh0vwM2ldM2QIXbjVw0hZNuZEJLqdWmfTBLLSvGfqgyy9GKvjGybIxyGMd7gHXCXVtymqFQHS-J-4-Ir6u2LUVVdyLKonwTtdFw9qhBaMb4NZuZHKS0bGxdZlRAB3_Fk8HX2r3z8j03xScx4M\",\"scope\":\"https://uri.paypal.com/services/payments/futurepayments\"}";
	//    0    0:ldc1            #69  <String "{\"code\":\"EOTHbvqh0vwM2ldM2QIXbjVw0hZNuZEJLqdWmfTBLLSvGfqgyy9GKvjGybIxyGMd7gHXCXVtymqFQHS-J-4-Ir6u2LUVVdyLKonwTtdFw9qhBaMb4NZuZHKS0bGxdZlRAB3_Fk8HX2r3z8j03xScx4M\",\"scope\":\"https://uri.paypal.com/services/payments/futurepayments\"}">
	//    1    2:areturn         
	}

	public final String a;
	private List b;
	private final String c;
}
