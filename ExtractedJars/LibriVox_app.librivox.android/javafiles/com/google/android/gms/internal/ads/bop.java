// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bol, bok

final class bop
	implements Runnable
{

	bop(bol bol1, int i, long l)
	{
		c = bol1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field bol c>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #18  <Field int a>
		b = l;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #20  <Field long b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #23  <Method void Object()>
	//   11   19:return          
	}

	public final void run()
	{
		bol.a(c).a(a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field bol c>
	//    2    4:invokestatic    #30  <Method bok bol.a(bol)>
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field int a>
	//    5   11:aload_0         
	//    6   12:getfield        #20  <Field long b>
	//    7   15:invokeinterface #35  <Method void bok.a(int, long)>
	//    8   20:return          
	}

	private final int a;
	private final long b;
	private final bol c;
}
