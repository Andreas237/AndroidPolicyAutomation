// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			gy, gn

public static class gy$a
{

	static String a(gy$a gy$a1)
	{
		return gy$a1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String a>
	//    2    4:areturn         
	}

	static String b(gy$a gy$a1)
	{
		return gy$a1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String b>
	//    2    4:areturn         
	}

	static String c(gy$a gy$a1)
	{
		return gy$a1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String c>
	//    2    4:areturn         
	}

	static String d(gy$a gy$a1)
	{
		return gy$a1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String d>
	//    2    4:areturn         
	}

	static boolean e(gy$a gy$a1)
	{
		return gy$a1.e;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field boolean e>
	//    2    4:ireturn         
	}

	static String f(gy$a gy$a1)
	{
		return gy$a1.f;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String f>
	//    2    4:areturn         
	}

	static String[] g(gy$a gy$a1)
	{
		return gy$a1.g;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String[] g>
	//    2    4:areturn         
	}

	public gy$a a(String s)
	{
		b = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field String b>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public gy$a a(String as[])
	{
		g = (String[])((String []) (as)).clone();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #48  <Method Object _5B_Ljava.lang.String_3B_.clone()>
	//    3    5:checkcast       #44  <Class String[]>
	//    4    8:putfield        #29  <Field String[] g>
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public gy a()
		throws gn
	{
		if(g == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field String[] g>
	//*   2    4:ifnonnull       17
			throw new gn("sdk packages is null");
	//    3    7:new             #51  <Class gn>
	//    4   10:dup             
	//    5   11:ldc1            #53  <String "sdk packages is null">
	//    6   13:invokespecial   #56  <Method void gn(String)>
	//    7   16:athrow          
		else
			return new gy(this, ((gy$1) (null)));
	//    8   17:new             #6   <Class gy>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:aconst_null     
	//   12   23:invokespecial   #59  <Method void gy(gy$a, gy$1)>
	//   13   26:areturn         
	}

	private String a;
	private String b;
	private String c;
	private String d;
	private boolean e;
	private String f;
	private String g[];

	public gy$a(String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		e = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #23  <Field boolean e>
		f = "standard";
	//    5    9:aload_0         
	//    6   10:ldc1            #25  <String "standard">
	//    7   12:putfield        #27  <Field String f>
		g = null;
	//    8   15:aload_0         
	//    9   16:aconst_null     
	//   10   17:putfield        #29  <Field String[] g>
		a = s1;
	//   11   20:aload_0         
	//   12   21:aload_2         
	//   13   22:putfield        #31  <Field String a>
		b = s1;
	//   14   25:aload_0         
	//   15   26:aload_2         
	//   16   27:putfield        #33  <Field String b>
		d = s2;
	//   17   30:aload_0         
	//   18   31:aload_3         
	//   19   32:putfield        #35  <Field String d>
		c = s;
	//   20   35:aload_0         
	//   21   36:aload_1         
	//   22   37:putfield        #37  <Field String c>
	//   23   40:return          
	}
}
