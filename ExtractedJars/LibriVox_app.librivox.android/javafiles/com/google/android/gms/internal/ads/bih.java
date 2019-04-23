// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bif, bie, bmp, zzfs

final class bih
	implements Runnable
{

	bih(bif bif1, bmp bmp, int i1, int j1, zzfs zzfs, int k1, Object obj, 
			long l1, long l2, long l3, long l4, long l5)
	{
		l = bif1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field bif l>
		a = bmp;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #30  <Field bmp a>
		b = i1;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #32  <Field int b>
		c = j1;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #34  <Field int c>
		d = zzfs;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #36  <Field zzfs d>
		e = k1;
	//   15   27:aload_0         
	//   16   28:iload           6
	//   17   30:putfield        #38  <Field int e>
		f = obj;
	//   18   33:aload_0         
	//   19   34:aload           7
	//   20   36:putfield        #40  <Field Object f>
		g = l1;
	//   21   39:aload_0         
	//   22   40:lload           8
	//   23   42:putfield        #42  <Field long g>
		h = l2;
	//   24   45:aload_0         
	//   25   46:lload           10
	//   26   48:putfield        #44  <Field long h>
		i = l3;
	//   27   51:aload_0         
	//   28   52:lload           12
	//   29   54:putfield        #46  <Field long i>
		j = l4;
	//   30   57:aload_0         
	//   31   58:lload           14
	//   32   60:putfield        #48  <Field long j>
		k = l5;
	//   33   63:aload_0         
	//   34   64:lload           16
	//   35   66:putfield        #50  <Field long k>
		super();
	//   36   69:aload_0         
	//   37   70:invokespecial   #53  <Method void Object()>
	//   38   73:return          
	}

	public final void run()
	{
		bif.a(l).a(a, b, c, d, e, f, bif.a(l, g), bif.a(l, h), i, j, k);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field bif l>
	//    2    4:invokestatic    #60  <Method bie bif.a(bif)>
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field bmp a>
	//    5   11:aload_0         
	//    6   12:getfield        #32  <Field int b>
	//    7   15:aload_0         
	//    8   16:getfield        #34  <Field int c>
	//    9   19:aload_0         
	//   10   20:getfield        #36  <Field zzfs d>
	//   11   23:aload_0         
	//   12   24:getfield        #38  <Field int e>
	//   13   27:aload_0         
	//   14   28:getfield        #40  <Field Object f>
	//   15   31:aload_0         
	//   16   32:getfield        #28  <Field bif l>
	//   17   35:aload_0         
	//   18   36:getfield        #42  <Field long g>
	//   19   39:invokestatic    #63  <Method long bif.a(bif, long)>
	//   20   42:aload_0         
	//   21   43:getfield        #28  <Field bif l>
	//   22   46:aload_0         
	//   23   47:getfield        #44  <Field long h>
	//   24   50:invokestatic    #63  <Method long bif.a(bif, long)>
	//   25   53:aload_0         
	//   26   54:getfield        #46  <Field long i>
	//   27   57:aload_0         
	//   28   58:getfield        #48  <Field long j>
	//   29   61:aload_0         
	//   30   62:getfield        #50  <Field long k>
	//   31   65:invokeinterface #68  <Method void bie.a(bmp, int, int, zzfs, int, Object, long, long, long, long, long)>
	//   32   70:return          
	}

	private final bmp a;
	private final int b;
	private final int c;
	private final zzfs d;
	private final int e;
	private final Object f;
	private final long g;
	private final long h;
	private final long i;
	private final long j;
	private final long k;
	private final bif l;
}
