// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk.payments;

import com.paypal.android.sdk.ed;

// Referenced classes of package com.paypal.android.sdk.payments:
//			bb, dl

final class dp
	implements bb
{

	dp(dl dl1)
	{
		a = dl1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field dl a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void a()
	{
		dl.a(a, ed.u);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field dl a>
	//    2    4:getstatic       #22  <Field ed ed.u>
	//    3    7:invokestatic    #27  <Method void dl.a(dl, ed)>
	//    4   10:return          
	}

	private dl a;
}
