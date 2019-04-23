// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bmz, bmp, bmo, bml, 
//			bnd, bnw

public final class bnc
	implements bmz
{

	public bnc(bml bml1, Uri uri, int i, bnd bnd1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		c = bml1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field bml c>
		a = new bmp(uri, 1);
	//    5    9:aload_0         
	//    6   10:new             #29  <Class bmp>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:iconst_1        
	//   10   16:invokespecial   #32  <Method void bmp(Uri, int)>
	//   11   19:putfield        #34  <Field bmp a>
		b = i;
	//   12   22:aload_0         
	//   13   23:iload_3         
	//   14   24:putfield        #36  <Field int b>
		d = bnd1;
	//   15   27:aload_0         
	//   16   28:aload           4
	//   17   30:putfield        #38  <Field bnd d>
	//   18   33:return          
	}

	public final void a()
	{
		f = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #41  <Field boolean f>
	//    3    5:return          
	}

	public final boolean b()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field boolean f>
	//    2    4:ireturn         
	}

	public final void c()
	{
		bmo bmo1 = new bmo(c, a);
	//    0    0:new             #44  <Class bmo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field bml c>
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field bmp a>
	//    6   12:invokespecial   #47  <Method void bmo(bml, bmp)>
	//    7   15:astore_1        
		bmo1.b();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #49  <Method void bmo.b()>
		e = d.a(c.b(), ((java.io.InputStream) (bmo1)));
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:getfield        #38  <Field bnd d>
	//   13   25:aload_0         
	//   14   26:getfield        #27  <Field bml c>
	//   15   29:invokeinterface #54  <Method Uri bml.b()>
	//   16   34:aload_1         
	//   17   35:invokeinterface #59  <Method Object bnd.a(Uri, java.io.InputStream)>
	//   18   40:putfield        #61  <Field Object e>
		g = bmo1.a();
	//   19   43:aload_0         
	//   20   44:aload_1         
	//   21   45:invokevirtual   #64  <Method long bmo.a()>
	//   22   48:putfield        #66  <Field long g>
		bnw.a(((java.io.Closeable) (bmo1)));
	//   23   51:aload_1         
	//   24   52:invokestatic    #71  <Method void bnw.a(java.io.Closeable)>
		return;
	//   25   55:return          
		Exception exception;
		exception;
	//   26   56:astore_2        
		g = bmo1.a();
	//   27   57:aload_0         
	//   28   58:aload_1         
	//   29   59:invokevirtual   #64  <Method long bmo.a()>
	//   30   62:putfield        #66  <Field long g>
		bnw.a(((java.io.Closeable) (bmo1)));
	//   31   65:aload_1         
	//   32   66:invokestatic    #71  <Method void bnw.a(java.io.Closeable)>
		throw exception;
	//   33   69:aload_2         
	//   34   70:athrow          
	}

	public final Object d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Object e>
	//    2    4:areturn         
	}

	public final long e()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field long g>
	//    2    4:lreturn         
	}

	public final bmp a;
	public final int b;
	private final bml c;
	private final bnd d;
	private volatile Object e;
	private volatile boolean f;
	private volatile long g;
}
