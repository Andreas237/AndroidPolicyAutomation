// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//			BaseGmsClient

protected final class BaseGmsClient$PostServiceBindingCallback extends BaseGmsClient.zza
{

	protected final void handleServiceFailure(ConnectionResult connectionresult)
	{
		zzru.mConnectionProgressReportCallbacks.onReportServiceBinding(connectionresult);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field BaseGmsClient zzru>
	//    2    4:getfield        #27  <Field BaseGmsClient$ConnectionProgressReportCallbacks BaseGmsClient.mConnectionProgressReportCallbacks>
	//    3    7:aload_1         
	//    4    8:invokeinterface #32  <Method void BaseGmsClient$ConnectionProgressReportCallbacks.onReportServiceBinding(ConnectionResult)>
		zzru.onConnectionFailed(connectionresult);
	//    5   13:aload_0         
	//    6   14:getfield        #16  <Field BaseGmsClient zzru>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #35  <Method void BaseGmsClient.onConnectionFailed(ConnectionResult)>
	//    9   21:return          
	}

	protected final boolean handleServiceSuccess()
	{
		zzru.mConnectionProgressReportCallbacks.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field BaseGmsClient zzru>
	//    2    4:getfield        #27  <Field BaseGmsClient$ConnectionProgressReportCallbacks BaseGmsClient.mConnectionProgressReportCallbacks>
	//    3    7:getstatic       #43  <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//    4   10:invokeinterface #32  <Method void BaseGmsClient$ConnectionProgressReportCallbacks.onReportServiceBinding(ConnectionResult)>
		return true;
	//    5   15:iconst_1        
	//    6   16:ireturn         
	}

	private final BaseGmsClient zzru;

	public BaseGmsClient$PostServiceBindingCallback(BaseGmsClient basegmsclient, int i, Bundle bundle)
	{
		zzru = basegmsclient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field BaseGmsClient zzru>
		super(basegmsclient, i, bundle);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:aload_3         
	//    7    9:invokespecial   #18  <Method void BaseGmsClient$zza(BaseGmsClient, int, Bundle)>
	//    8   12:return          
	}
}
