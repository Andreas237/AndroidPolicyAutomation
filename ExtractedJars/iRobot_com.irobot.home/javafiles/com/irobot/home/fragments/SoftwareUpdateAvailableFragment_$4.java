// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.core.OnDemandOTAAvailabilityEvent;

// Referenced classes of package com.irobot.home.fragments:
//			SoftwareUpdateAvailableFragment_

class SoftwareUpdateAvailableFragment_$4
	implements Runnable
{

	public void run()
	{
		SoftwareUpdateAvailableFragment_.a(b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field SoftwareUpdateAvailableFragment_ b>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field OnDemandOTAAvailabilityEvent a>
	//    4    8:invokestatic    #28  <Method void SoftwareUpdateAvailableFragment_.a(SoftwareUpdateAvailableFragment_, OnDemandOTAAvailabilityEvent)>
	//    5   11:return          
	}

	final OnDemandOTAAvailabilityEvent a;
	final SoftwareUpdateAvailableFragment_ b;

	SoftwareUpdateAvailableFragment_$4(SoftwareUpdateAvailableFragment_ softwareupdateavailablefragment_, OnDemandOTAAvailabilityEvent ondemandotaavailabilityevent)
	{
		b = softwareupdateavailablefragment_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field SoftwareUpdateAvailableFragment_ b>
		a = ondemandotaavailabilityevent;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field OnDemandOTAAvailabilityEvent a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
