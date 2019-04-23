// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bji, bip, bdg, bfc

final class biw
	implements bji
{

	public biw(bip bip1, int i)
	{
		b = bip1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field bip b>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
		a = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field int a>
	//    8   14:return          
	}

	static int a(biw biw1)
	{
		return biw1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int a>
	//    2    4:ireturn         
	}

	public final int a(bdg bdg, bfc bfc, boolean flag)
	{
		return b.a(a, bdg, bfc, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field bip b>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field int a>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:invokevirtual   #27  <Method int bip.a(int, bdg, bfc, boolean)>
	//    8   14:ireturn         
	}

	public final boolean a()
	{
		return b.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field bip b>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field int a>
	//    4    8:invokevirtual   #31  <Method boolean bip.a(int)>
	//    5   11:ireturn         
	}

	public final void a_(long l)
	{
		b.a(a, l);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field bip b>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field int a>
	//    4    8:lload_1         
	//    5    9:invokevirtual   #36  <Method void bip.a(int, long)>
	//    6   12:return          
	}

	public final void b()
	{
		b.g();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field bip b>
	//    2    4:invokevirtual   #39  <Method void bip.g()>
	//    3    7:return          
	}

	private final int a;
	private final bip b;
}
