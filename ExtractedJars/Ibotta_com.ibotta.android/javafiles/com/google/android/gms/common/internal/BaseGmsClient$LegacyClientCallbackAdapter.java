// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//			BaseGmsClient

protected class BaseGmsClient$LegacyClientCallbackAdapter
	implements backs
{

	public void onReportServiceBinding(ConnectionResult connectionresult)
	{
		if(connectionresult.isSuccess())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #28  <Method boolean ConnectionResult.isSuccess()>
	//*   2    4:ifeq            22
		{
			connectionresult = ((ConnectionResult) (zzru));
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field BaseGmsClient zzru>
	//    5   11:astore_1        
			((BaseGmsClient) (connectionresult)).getRemoteService(((IAccountAccessor) (null)), ((BaseGmsClient) (connectionresult)).getScopes());
	//    6   12:aload_1         
	//    7   13:aconst_null     
	//    8   14:aload_1         
	//    9   15:invokevirtual   #32  <Method java.util.Set BaseGmsClient.getScopes()>
	//   10   18:invokevirtual   #36  <Method void BaseGmsClient.getRemoteService(IAccountAccessor, java.util.Set)>
			return;
	//   11   21:return          
		}
		if(BaseGmsClient.zzg(zzru) != null)
	//*  12   22:aload_0         
	//*  13   23:getfield        #15  <Field BaseGmsClient zzru>
	//*  14   26:invokestatic    #40  <Method BaseGmsClient$BaseOnConnectionFailedListener BaseGmsClient.zzg(BaseGmsClient)>
	//*  15   29:ifnull          45
			BaseGmsClient.zzg(zzru).onConnectionFailed(connectionresult);
	//   16   32:aload_0         
	//   17   33:getfield        #15  <Field BaseGmsClient zzru>
	//   18   36:invokestatic    #40  <Method BaseGmsClient$BaseOnConnectionFailedListener BaseGmsClient.zzg(BaseGmsClient)>
	//   19   39:aload_1         
	//   20   40:invokeinterface #45  <Method void BaseGmsClient$BaseOnConnectionFailedListener.onConnectionFailed(ConnectionResult)>
	//   21   45:return          
	}

	private final BaseGmsClient zzru;

	public BaseGmsClient$LegacyClientCallbackAdapter(BaseGmsClient basegmsclient)
	{
		zzru = basegmsclient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field BaseGmsClient zzru>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
