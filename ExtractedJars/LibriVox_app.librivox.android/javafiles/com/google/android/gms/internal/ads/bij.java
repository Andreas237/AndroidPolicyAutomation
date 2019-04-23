// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bif, bie, bmp, zzfs

final class bij
	implements Runnable
{

	bij(bif bif1, bmp bmp, int i1, int j1, zzfs zzfs, int k1, Object obj, 
			long l1, long l2, long l3, long l4, long l5, IOException ioexception, boolean flag)
	{
		n = bif1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field bif n>
		a = bmp;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #34  <Field bmp a>
		b = i1;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #36  <Field int b>
		c = j1;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #38  <Field int c>
		d = zzfs;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #40  <Field zzfs d>
		e = k1;
	//   15   27:aload_0         
	//   16   28:iload           6
	//   17   30:putfield        #42  <Field int e>
		f = obj;
	//   18   33:aload_0         
	//   19   34:aload           7
	//   20   36:putfield        #44  <Field Object f>
		g = l1;
	//   21   39:aload_0         
	//   22   40:lload           8
	//   23   42:putfield        #46  <Field long g>
		h = l2;
	//   24   45:aload_0         
	//   25   46:lload           10
	//   26   48:putfield        #48  <Field long h>
		i = l3;
	//   27   51:aload_0         
	//   28   52:lload           12
	//   29   54:putfield        #50  <Field long i>
		j = l4;
	//   30   57:aload_0         
	//   31   58:lload           14
	//   32   60:putfield        #52  <Field long j>
		k = l5;
	//   33   63:aload_0         
	//   34   64:lload           16
	//   35   66:putfield        #54  <Field long k>
		l = ioexception;
	//   36   69:aload_0         
	//   37   70:aload           18
	//   38   72:putfield        #56  <Field IOException l>
		m = flag;
	//   39   75:aload_0         
	//   40   76:iload           19
	//   41   78:putfield        #58  <Field boolean m>
		super();
	//   42   81:aload_0         
	//   43   82:invokespecial   #61  <Method void Object()>
	//   44   85:return          
	}

	public final void run()
	{
		bif.a(n).a(a, b, c, d, e, f, bif.a(n, g), bif.a(n, h), i, j, k, l, m);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field bif n>
	//    2    4:invokestatic    #68  <Method bie bif.a(bif)>
	//    3    7:aload_0         
	//    4    8:getfield        #34  <Field bmp a>
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field int b>
	//    7   15:aload_0         
	//    8   16:getfield        #38  <Field int c>
	//    9   19:aload_0         
	//   10   20:getfield        #40  <Field zzfs d>
	//   11   23:aload_0         
	//   12   24:getfield        #42  <Field int e>
	//   13   27:aload_0         
	//   14   28:getfield        #44  <Field Object f>
	//   15   31:aload_0         
	//   16   32:getfield        #32  <Field bif n>
	//   17   35:aload_0         
	//   18   36:getfield        #46  <Field long g>
	//   19   39:invokestatic    #71  <Method long bif.a(bif, long)>
	//   20   42:aload_0         
	//   21   43:getfield        #32  <Field bif n>
	//   22   46:aload_0         
	//   23   47:getfield        #48  <Field long h>
	//   24   50:invokestatic    #71  <Method long bif.a(bif, long)>
	//   25   53:aload_0         
	//   26   54:getfield        #50  <Field long i>
	//   27   57:aload_0         
	//   28   58:getfield        #52  <Field long j>
	//   29   61:aload_0         
	//   30   62:getfield        #54  <Field long k>
	//   31   65:aload_0         
	//   32   66:getfield        #56  <Field IOException l>
	//   33   69:aload_0         
	//   34   70:getfield        #58  <Field boolean m>
	//   35   73:invokeinterface #76  <Method void bie.a(bmp, int, int, zzfs, int, Object, long, long, long, long, long, IOException, boolean)>
	//   36   78:return          
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
	private final IOException l;
	private final boolean m;
	private final bif n;
}
