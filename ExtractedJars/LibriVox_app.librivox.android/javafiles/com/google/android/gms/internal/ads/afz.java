// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			afy, afn

final class afz
	implements Runnable
{

	afz(afy afy1)
	{
		a = afy1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field afy a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		afy.a(a).destroy();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field afy a>
	//    2    4:invokestatic    #22  <Method afn afy.a(afy)>
	//    3    7:invokeinterface #27  <Method void afn.destroy()>
	//    4   12:return          
	}

	private final afy a;
}
