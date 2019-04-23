// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bmz, bnf, bml, bmp, 
//			zzfs

public abstract class bjs
	implements bmz
{

	public bjs(bml bml1, bmp bmp1, int i, zzfs zzfs, int j, Object obj, long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		h = (bml)bnf.a(((Object) (bml1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #30  <Method Object bnf.a(Object)>
	//    5    9:checkcast       #32  <Class bml>
	//    6   12:putfield        #34  <Field bml h>
		a = (bmp)bnf.a(((Object) (bmp1)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokestatic    #30  <Method Object bnf.a(Object)>
	//   10   20:checkcast       #36  <Class bmp>
	//   11   23:putfield        #38  <Field bmp a>
		b = i;
	//   12   26:aload_0         
	//   13   27:iload_3         
	//   14   28:putfield        #40  <Field int b>
		c = zzfs;
	//   15   31:aload_0         
	//   16   32:aload           4
	//   17   34:putfield        #42  <Field zzfs c>
		d = j;
	//   18   37:aload_0         
	//   19   38:iload           5
	//   20   40:putfield        #44  <Field int d>
		e = obj;
	//   21   43:aload_0         
	//   22   44:aload           6
	//   23   46:putfield        #46  <Field Object e>
		f = l;
	//   24   49:aload_0         
	//   25   50:lload           7
	//   26   52:putfield        #48  <Field long f>
		g = l1;
	//   27   55:aload_0         
	//   28   56:lload           9
	//   29   58:putfield        #50  <Field long g>
	//   30   61:return          
	}

	public abstract long e();

	public final bmp a;
	public final int b;
	public final zzfs c;
	public final int d;
	public final Object e;
	public final long f;
	public final long g;
	protected final bml h;
}
