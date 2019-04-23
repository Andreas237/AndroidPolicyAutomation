// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bif, bie, bmp, zzfs

final class big
	implements Runnable
{

	big(bif bif1, bmp bmp, int k, int l, zzfs zzfs, int i1, Object obj, 
			long l1, long l2, long l3)
	{
		j = bif1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field bif j>
		a = bmp;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field bmp a>
		b = k;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #30  <Field int b>
		c = l;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #32  <Field int c>
		d = zzfs;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #34  <Field zzfs d>
		e = i1;
	//   15   27:aload_0         
	//   16   28:iload           6
	//   17   30:putfield        #36  <Field int e>
		f = obj;
	//   18   33:aload_0         
	//   19   34:aload           7
	//   20   36:putfield        #38  <Field Object f>
		g = l1;
	//   21   39:aload_0         
	//   22   40:lload           8
	//   23   42:putfield        #40  <Field long g>
		h = l2;
	//   24   45:aload_0         
	//   25   46:lload           10
	//   26   48:putfield        #42  <Field long h>
		i = l3;
	//   27   51:aload_0         
	//   28   52:lload           12
	//   29   54:putfield        #44  <Field long i>
		super();
	//   30   57:aload_0         
	//   31   58:invokespecial   #47  <Method void Object()>
	//   32   61:return          
	}

	public final void run()
	{
		bif.a(j).a(a, b, c, d, e, f, bif.a(j, g), bif.a(j, h), i);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field bif j>
	//    2    4:invokestatic    #54  <Method bie bif.a(bif)>
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field bmp a>
	//    5   11:aload_0         
	//    6   12:getfield        #30  <Field int b>
	//    7   15:aload_0         
	//    8   16:getfield        #32  <Field int c>
	//    9   19:aload_0         
	//   10   20:getfield        #34  <Field zzfs d>
	//   11   23:aload_0         
	//   12   24:getfield        #36  <Field int e>
	//   13   27:aload_0         
	//   14   28:getfield        #38  <Field Object f>
	//   15   31:aload_0         
	//   16   32:getfield        #26  <Field bif j>
	//   17   35:aload_0         
	//   18   36:getfield        #40  <Field long g>
	//   19   39:invokestatic    #57  <Method long bif.a(bif, long)>
	//   20   42:aload_0         
	//   21   43:getfield        #26  <Field bif j>
	//   22   46:aload_0         
	//   23   47:getfield        #42  <Field long h>
	//   24   50:invokestatic    #57  <Method long bif.a(bif, long)>
	//   25   53:aload_0         
	//   26   54:getfield        #44  <Field long i>
	//   27   57:invokeinterface #62  <Method void bie.a(bmp, int, int, zzfs, int, Object, long, long, long)>
	//   28   62:return          
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
	private final bif j;
}
