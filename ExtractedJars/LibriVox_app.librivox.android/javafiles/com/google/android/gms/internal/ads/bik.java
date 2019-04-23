// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bif, bie, zzfs

final class bik
	implements Runnable
{

	bik(bif bif1, int i, zzfs zzfs, int j, Object obj, long l)
	{
		f = bif1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field bif f>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #23  <Field int a>
		b = zzfs;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field zzfs b>
		c = j;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #27  <Field int c>
		d = obj;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #29  <Field Object d>
		e = l;
	//   15   27:aload_0         
	//   16   28:lload           6
	//   17   30:putfield        #31  <Field long e>
		super();
	//   18   33:aload_0         
	//   19   34:invokespecial   #34  <Method void Object()>
	//   20   37:return          
	}

	public final void run()
	{
		bif.a(f).a(a, b, c, d, bif.a(f, e));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field bif f>
	//    2    4:invokestatic    #41  <Method bie bif.a(bif)>
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field int a>
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field zzfs b>
	//    7   15:aload_0         
	//    8   16:getfield        #27  <Field int c>
	//    9   19:aload_0         
	//   10   20:getfield        #29  <Field Object d>
	//   11   23:aload_0         
	//   12   24:getfield        #21  <Field bif f>
	//   13   27:aload_0         
	//   14   28:getfield        #31  <Field long e>
	//   15   31:invokestatic    #44  <Method long bif.a(bif, long)>
	//   16   34:invokeinterface #49  <Method void bie.a(int, zzfs, int, Object, long)>
	//   17   39:return          
	}

	private final int a;
	private final zzfs b;
	private final int c;
	private final Object d;
	private final long e;
	private final bif f;
}
