// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bfb, bol, bok

final class bot
	implements Runnable
{

	bot(bol bol1, bfb bfb1)
	{
		b = bol1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field bol b>
		a = bfb1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field bfb a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		a.a();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field bfb a>
	//    2    4:invokevirtual   #25  <Method void bfb.a()>
		bol.a(b).b(a);
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field bol b>
	//    5   11:invokestatic    #30  <Method bok bol.a(bol)>
	//    6   14:aload_0         
	//    7   15:getfield        #16  <Field bfb a>
	//    8   18:invokeinterface #35  <Method void bok.b(bfb)>
	//    9   23:return          
	}

	private final bfb a;
	private final bol b;
}
