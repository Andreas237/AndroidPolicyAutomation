// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bpu

final class bpv
	implements Runnable
{

	bpv(bpu bpu1)
	{
		a = bpu1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field bpu a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		bpu.a(a, 3);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field bpu a>
	//    2    4:iconst_3        
	//    3    5:invokestatic    #22  <Method void bpu.a(bpu, int)>
	//    4    8:return          
	}

	private final bpu a;
}
