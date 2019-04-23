// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			BasePendingResult, StatusPendingResult, zaaw

final class zaaz
	implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{

	zaaz(zaaw zaaw, StatusPendingResult statuspendingresult)
	{
		zahi = statuspendingresult;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #12  <Field StatusPendingResult zahi>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void onConnectionFailed(ConnectionResult connectionresult)
	{
		((BasePendingResult) (zahi)).setResult(((com.google.android.gms.common.api.Result) (new Status(8))));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field StatusPendingResult zahi>
	//    2    4:new             #21  <Class Status>
	//    3    7:dup             
	//    4    8:bipush          8
	//    5   10:invokespecial   #24  <Method void Status(int)>
	//    6   13:invokevirtual   #30  <Method void BasePendingResult.setResult(com.google.android.gms.common.api.Result)>
	//    7   16:return          
	}

	private final StatusPendingResult zahi;
}
