// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bki

final class bkk
	implements Runnable
{

	bkk(bki bki1)
	{
		a = bki1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field bki a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		bki.a(a, false);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field bki a>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #22  <Method void bki.a(bki, boolean)>
	//    4    8:return          
	}

	private final bki a;
}
