// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			pf, abo

final class ph
	implements Runnable
{

	ph(pf pf1, boolean flag, abo abo, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		a = pf1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field pf a>
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #24  <Field boolean b>
		c = abo;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field abo c>
		d = s;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #28  <Field String d>
		e = s1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #30  <Field String e>
	//   17   31:return          
	}

	public final void run()
	{
		a.a(b, c, d, e);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field pf a>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field boolean b>
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field abo c>
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field String d>
	//    8   16:aload_0         
	//    9   17:getfield        #30  <Field String e>
	//   10   20:invokevirtual   #37  <Method void pf.a(boolean, abo, String, String)>
	//   11   23:return          
	}

	private final pf a;
	private final boolean b = true;
	private final abo c;
	private final String d;
	private final String e;
}
