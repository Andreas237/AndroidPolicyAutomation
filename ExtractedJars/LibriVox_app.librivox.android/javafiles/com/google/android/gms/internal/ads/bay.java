// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bav

final class bay
	implements Runnable
{

	bay(bav bav1)
	{
		a = bav1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field bav a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		bav.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field bav a>
	//    2    4:invokestatic    #21  <Method void bav.a(bav)>
	//    3    7:return          
	}

	private final bav a;
}
