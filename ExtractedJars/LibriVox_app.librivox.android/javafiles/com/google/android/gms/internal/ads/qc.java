// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.ag;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aap, afn, pt

final class qc
	implements aap
{

	qc(pt pt, String s, ag ag)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #14  <Field String a>
		b = ag;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #16  <Field ag b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void a(Object obj)
	{
		((afn)obj).b(a, b);
	//    0    0:aload_1         
	//    1    1:checkcast       #23  <Class afn>
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field String a>
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field ag b>
	//    6   12:invokeinterface #26  <Method void afn.b(String, ag)>
	//    7   17:return          
	}

	public final void a(Throwable throwable)
	{
	//    0    0:return          
	}

	private final String a;
	private final ag b;
}
