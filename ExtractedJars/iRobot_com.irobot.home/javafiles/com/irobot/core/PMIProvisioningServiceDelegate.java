// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.ArrayList;

// Referenced classes of package com.irobot.core:
//			PMIProvisioningError, PMIProvisioningState, PMIAssetInfo

public abstract class PMIProvisioningServiceDelegate
{

	public PMIProvisioningServiceDelegate()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public abstract void onDiscoveryFailure();

	public abstract void onDiscoverySuccess(ArrayList arraylist);

	public abstract void onProvisioningFailure(PMIProvisioningError pmiprovisioningerror);

	public abstract void onProvisioningStateUpdated(PMIProvisioningState pmiprovisioningstate);

	public abstract void onProvisioningSuccess(PMIAssetInfo pmiassetinfo, String s, int i, String s1);
}
