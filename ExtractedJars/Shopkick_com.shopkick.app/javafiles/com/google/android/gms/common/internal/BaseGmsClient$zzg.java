// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//			BaseGmsClient

protected final class BaseGmsClient$zzg extends BaseGmsClient$zza
{

	protected final void zza(ConnectionResult connectionresult)
	{
		zzct.zzcf.onReportServiceBinding(connectionresult);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field BaseGmsClient zzct>
	//    2    4:getfield        #27  <Field BaseGmsClient$ConnectionProgressReportCallbacks BaseGmsClient.zzcf>
	//    3    7:aload_1         
	//    4    8:invokeinterface #32  <Method void BaseGmsClient$ConnectionProgressReportCallbacks.onReportServiceBinding(ConnectionResult)>
		zzct.onConnectionFailed(connectionresult);
	//    5   13:aload_0         
	//    6   14:getfield        #16  <Field BaseGmsClient zzct>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #35  <Method void BaseGmsClient.onConnectionFailed(ConnectionResult)>
	//    9   21:return          
	}

	protected final boolean zzm()
	{
		zzct.zzcf.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field BaseGmsClient zzct>
	//    2    4:getfield        #27  <Field BaseGmsClient$ConnectionProgressReportCallbacks BaseGmsClient.zzcf>
	//    3    7:getstatic       #43  <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//    4   10:invokeinterface #32  <Method void BaseGmsClient$ConnectionProgressReportCallbacks.onReportServiceBinding(ConnectionResult)>
		return true;
	//    5   15:iconst_1        
	//    6   16:ireturn         
	}

	private final BaseGmsClient zzct;

	public BaseGmsClient$zzg(BaseGmsClient basegmsclient, int i, Bundle bundle)
	{
		zzct = basegmsclient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field BaseGmsClient zzct>
		super(basegmsclient, i, ((Bundle) (null)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:aconst_null     
	//    7    9:invokespecial   #18  <Method void BaseGmsClient$zza(BaseGmsClient, int, Bundle)>
	//    8   12:return          
	}
}
