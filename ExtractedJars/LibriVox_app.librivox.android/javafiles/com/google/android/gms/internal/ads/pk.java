// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			agw, pf, abo, afn

final class pk
	implements agw
{

	pk(pf pf1, abo abo, afn afn)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		a = pf1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field pf a>
		b = abo;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field abo b>
		c = afn;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field afn c>
	//   11   19:return          
	}

	public final void a(boolean flag)
	{
		a.b(b, c, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field pf a>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field abo b>
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field afn c>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #30  <Method void pf.b(abo, afn, boolean)>
	//    8   16:return          
	}

	private final pf a;
	private final abo b;
	private final afn c;
}
