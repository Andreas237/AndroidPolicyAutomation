// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbi

public final class bov
{

	public bov(String s, zzbbi zzbbi1, String s1, JSONObject jsonobject, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		d = zzbbi1.a;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:getfield        #23  <Field String zzbbi.a>
	//    5    9:putfield        #25  <Field String d>
		b = jsonobject;
	//    6   12:aload_0         
	//    7   13:aload           4
	//    8   15:putfield        #27  <Field JSONObject b>
		c = s;
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:putfield        #29  <Field String c>
		a = s1;
	//   12   23:aload_0         
	//   13   24:aload_3         
	//   14   25:putfield        #30  <Field String a>
		e = flag;
	//   15   28:aload_0         
	//   16   29:iload           5
	//   17   31:putfield        #32  <Field boolean e>
		f = flag1;
	//   18   34:aload_0         
	//   19   35:iload           6
	//   20   37:putfield        #34  <Field boolean f>
	//   21   40:return          
	}

	public final String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String a>
	//    2    4:areturn         
	}

	public final String b()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String d>
	//    2    4:areturn         
	}

	public final JSONObject c()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field JSONObject b>
	//    2    4:areturn         
	}

	public final String d()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String c>
	//    2    4:areturn         
	}

	public final boolean e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field boolean e>
	//    2    4:ireturn         
	}

	public final boolean f()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean f>
	//    2    4:ireturn         
	}

	private final String a;
	private final JSONObject b;
	private final String c;
	private final String d;
	private final boolean e;
	private final boolean f;
}
