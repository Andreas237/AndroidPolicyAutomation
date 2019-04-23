// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bdy, bdx

final class bea
	implements Runnable
{

	bea(bdy bdy1, String s, long l, long l1)
	{
		d = bdy1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field bdy d>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field String a>
		b = l;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #21  <Field long b>
		c = l1;
	//    9   15:aload_0         
	//   10   16:lload           5
	//   11   18:putfield        #23  <Field long c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #26  <Method void Object()>
	//   14   25:return          
	}

	public final void run()
	{
		bdy.a(d).a(a, b, c);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field bdy d>
	//    2    4:invokestatic    #33  <Method bdx bdy.a(bdy)>
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field String a>
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field long b>
	//    7   15:aload_0         
	//    8   16:getfield        #23  <Field long c>
	//    9   19:invokeinterface #38  <Method void bdx.a(String, long, long)>
	//   10   24:return          
	}

	private final String a;
	private final long b;
	private final long c;
	private final bdy d;
}
