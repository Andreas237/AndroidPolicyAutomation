// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bce

final class bcf
	implements Runnable
{

	bcf(bce bce1)
	{
		a = bce1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field bce a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		bce.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field bce a>
	//    2    4:invokestatic    #21  <Method void bce.a(bce)>
	//    3    7:return          
	}

	private final bce a;
}
