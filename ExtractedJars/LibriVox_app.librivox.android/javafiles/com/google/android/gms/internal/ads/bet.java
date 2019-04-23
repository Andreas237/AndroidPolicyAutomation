// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bel, ber, bdy, bes

final class bet
	implements bel
{

	private bet(ber ber1)
	{
		a = ber1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ber a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	bet(ber ber1, bes bes)
	{
		this(ber1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void bet(ber)>
	//    3    5:return          
	}

	public final void a()
	{
		ber.v();
	//    0    0:invokestatic    #24  <Method void ber.v()>
		ber.a(a, true);
	//    1    3:aload_0         
	//    2    4:getfield        #12  <Field ber a>
	//    3    7:iconst_1        
	//    4    8:invokestatic    #27  <Method boolean ber.a(ber, boolean)>
	//    5   11:pop             
	//    6   12:return          
	}

	public final void a(int i)
	{
		ber.a(a).a(i);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field ber a>
	//    2    4:invokestatic    #31  <Method bdy ber.a(ber)>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #35  <Method void bdy.a(int)>
		ber.b(i);
	//    5   11:iload_1         
	//    6   12:invokestatic    #38  <Method void ber.b(int)>
	//    7   15:return          
	}

	public final void a(int i, long l, long l1)
	{
		ber.a(a).a(i, l, l1);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field ber a>
	//    2    4:invokestatic    #31  <Method bdy ber.a(ber)>
	//    3    7:iload_1         
	//    4    8:lload_2         
	//    5    9:lload           4
	//    6   11:invokevirtual   #41  <Method void bdy.a(int, long, long)>
		ber.a(i, l, l1);
	//    7   14:iload_1         
	//    8   15:lload_2         
	//    9   16:lload           4
	//   10   18:invokestatic    #42  <Method void ber.a(int, long, long)>
	//   11   21:return          
	}

	private final ber a;
}
