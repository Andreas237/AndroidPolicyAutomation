// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.ui;

import android.support.v7.*;

// Referenced classes of package com.ext.ui:
//			BillingActivity

class BillingActivity$3
	implements android.support.v7.bz.b
{

	public void a(ca ca1)
	{
		ci.a("BillingActivity", "Setup finished.");
	//    0    0:ldc1            #24  <String "BillingActivity">
	//    1    2:ldc1            #26  <String "Setup finished.">
	//    2    4:invokestatic    #31  <Method void ci.a(String, String)>
		while(!ca1.b() || BillingActivity.a(a) == null) 
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #37  <Method boolean ca.b()>
	//*   5   11:ifne            15
			return;
	//    6   14:return          
	//    7   15:aload_0         
	//    8   16:getfield        #17  <Field BillingActivity a>
	//    9   19:invokestatic    #40  <Method bz BillingActivity.a(BillingActivity)>
	//   10   22:ifnull          14
		ci.a("BillingActivity", "Setup successful. Querying inventory.");
	//   11   25:ldc1            #24  <String "BillingActivity">
	//   12   27:ldc1            #42  <String "Setup successful. Querying inventory.">
	//   13   29:invokestatic    #31  <Method void ci.a(String, String)>
		BillingActivity.a(a).a(a.a);
	//   14   32:aload_0         
	//   15   33:getfield        #17  <Field BillingActivity a>
	//   16   36:invokestatic    #40  <Method bz BillingActivity.a(BillingActivity)>
	//   17   39:aload_0         
	//   18   40:getfield        #17  <Field BillingActivity a>
	//   19   43:getfield        #45  <Field android.support.v7.bz$c BillingActivity.a>
	//   20   46:invokevirtual   #50  <Method void bz.a(android.support.v7.bz$c)>
	//   21   49:return          
	}

	final BillingActivity a;

	BillingActivity$3(BillingActivity billingactivity)
	{
		a = billingactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BillingActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
