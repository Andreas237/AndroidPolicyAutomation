// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ul

public final class un
{

	public un()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	static String a(un un1)
	{
		return un1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String a>
	//    2    4:areturn         
	}

	static String b(un un1)
	{
		return un1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String b>
	//    2    4:areturn         
	}

	static int c(un un1)
	{
		return un1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int c>
	//    2    4:ireturn         
	}

	static long d(un un1)
	{
		return un1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field long d>
	//    2    4:lreturn         
	}

	public final ul a()
	{
		return new ul(this, ((um) (null)));
	//    0    0:new             #30  <Class ul>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #33  <Method void ul(un, um)>
	//    5    9:areturn         
	}

	public final un a(int i)
	{
		c = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field int c>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final un a(long l)
	{
		d = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #27  <Field long d>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final un a(String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field String a>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final un b(String s)
	{
		b = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field String b>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private String a;
	private String b;
	private int c;
	private long d;
}
