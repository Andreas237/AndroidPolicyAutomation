// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bip, bja

final class bir
	implements Runnable
{

	bir(bip bip1)
	{
		a = bip1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field bip a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		if(!bip.b(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field bip a>
	//*   2    4:invokestatic    #23  <Method boolean bip.b(bip)>
	//*   3    7:ifne            26
			bip.c(a).a(((bjj) (a)));
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field bip a>
	//    6   14:invokestatic    #27  <Method bja bip.c(bip)>
	//    7   17:aload_0         
	//    8   18:getfield        #12  <Field bip a>
	//    9   21:invokeinterface #32  <Method void bja.a(bjj)>
	//   10   26:return          
	}

	private final bip a;
}
