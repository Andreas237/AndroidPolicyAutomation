// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			agd

final class agf
	implements Runnable
{

	agf(agd agd1, int i, int j, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		a = agd1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field agd a>
		b = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field int b>
		c = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #25  <Field int c>
		d = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #27  <Field boolean d>
		e = flag1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #29  <Field boolean e>
	//   17   31:return          
	}

	public final void run()
	{
		a.a(b, c, d, e);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field agd a>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field int b>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field int c>
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field boolean d>
	//    8   16:aload_0         
	//    9   17:getfield        #29  <Field boolean e>
	//   10   20:invokevirtual   #36  <Method void agd.a(int, int, boolean, boolean)>
	//   11   23:return          
	}

	private final agd a;
	private final int b;
	private final int c;
	private final boolean d;
	private final boolean e;
}
