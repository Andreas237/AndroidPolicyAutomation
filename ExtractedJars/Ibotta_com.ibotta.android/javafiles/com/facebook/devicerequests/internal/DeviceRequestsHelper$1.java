// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.devicerequests.internal;

import android.net.nsd.NsdServiceInfo;

// Referenced classes of package com.facebook.devicerequests.internal:
//			DeviceRequestsHelper

static final class DeviceRequestsHelper$1
	implements android.net.nsd.Listener
{

	public void onRegistrationFailed(NsdServiceInfo nsdserviceinfo, int i)
	{
		DeviceRequestsHelper.cleanUpAdvertisementService(val$userCode);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String val$userCode>
	//    2    4:invokestatic    #30  <Method void DeviceRequestsHelper.cleanUpAdvertisementService(String)>
	//    3    7:return          
	}

	public void onServiceRegistered(NsdServiceInfo nsdserviceinfo)
	{
		if(!val$nsdServiceName.equals(((Object) (nsdserviceinfo.getServiceName()))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field String val$nsdServiceName>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #38  <Method String NsdServiceInfo.getServiceName()>
	//*   4    8:invokevirtual   #44  <Method boolean String.equals(Object)>
	//*   5   11:ifne            21
			DeviceRequestsHelper.cleanUpAdvertisementService(val$userCode);
	//    6   14:aload_0         
	//    7   15:getfield        #20  <Field String val$userCode>
	//    8   18:invokestatic    #30  <Method void DeviceRequestsHelper.cleanUpAdvertisementService(String)>
	//    9   21:return          
	}

	public void onServiceUnregistered(NsdServiceInfo nsdserviceinfo)
	{
	//    0    0:return          
	}

	public void onUnregistrationFailed(NsdServiceInfo nsdserviceinfo, int i)
	{
	//    0    0:return          
	}

	final String val$nsdServiceName;
	final String val$userCode;

	DeviceRequestsHelper$1(String s, String s1)
	{
		val$nsdServiceName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field String val$nsdServiceName>
		val$userCode = s1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field String val$userCode>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
