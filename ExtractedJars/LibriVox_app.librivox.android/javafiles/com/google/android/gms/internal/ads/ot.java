// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			os, ol, wd

final class ot
	implements Runnable
{

	ot(os os1, wd wd)
	{
		b = os1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field os b>
		a = wd;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field wd a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		os.a(b).b(a);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field os b>
	//    2    4:invokestatic    #26  <Method ol os.a(os)>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field wd a>
	//    5   11:invokeinterface #31  <Method void ol.b(wd)>
	//    6   16:return          
	}

	private final wd a;
	private final os b;
}
