// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aas, abo, abe, aan

final class aay
	implements Runnable
{

	aay(abo abo, abe abe, Class class1, aan aan, Executor executor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		a = abo;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field abo a>
		b = abe;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field abe b>
		c = class1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field Class c>
		d = aan;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #29  <Field aan d>
		e = executor;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #31  <Field Executor e>
	//   17   31:return          
	}

	public final void run()
	{
		aas.a(a, b, c, d, e);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field abo a>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field abe b>
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field Class c>
	//    6   12:aload_0         
	//    7   13:getfield        #29  <Field aan d>
	//    8   16:aload_0         
	//    9   17:getfield        #31  <Field Executor e>
	//   10   20:invokestatic    #37  <Method void aas.a(abo, abe, Class, aan, Executor)>
	//   11   23:return          
	}

	private final abo a;
	private final abe b;
	private final Class c;
	private final aan d;
	private final Executor e;
}
