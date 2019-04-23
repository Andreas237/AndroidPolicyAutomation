// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk.payments;


// Referenced classes of package com.paypal.android.sdk.payments:
//			bk, bz, PaymentConfirmActivity

final class ca
	implements bk
{

	ca(bz bz1)
	{
		a = bz1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field bz a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void a()
	{
		PaymentConfirmActivity.b(a.a);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field bz a>
	//    2    4:getfield        #21  <Field PaymentConfirmActivity bz.a>
	//    3    7:invokestatic    #27  <Method void PaymentConfirmActivity.b(PaymentConfirmActivity)>
	//    4   10:return          
	}

	private bz a;
}
