// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			aas, abo, aan, abe

final class aav
	implements Runnable
{

	aav(abo abo, aan aan, abe abe)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		a = abo;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field abo a>
		b = aan;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field aan b>
		c = abe;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field abe c>
	//   11   19:return          
	}

	public final void run()
	{
		aas.a(a, b, c);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field abo a>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field aan b>
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field abe c>
	//    6   12:invokestatic    #29  <Method void aas.a(abo, aan, abe)>
	//    7   15:return          
	}

	private final abo a;
	private final aan b;
	private final abe c;
}
