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
	//*   1    1:invokevirtual   #30  <Method boolean ConnectionResult.isSuccess()>
	//*   2    4:ifeq            22
		{
			connectionresult = ((ConnectionResult) (zzct));
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field BaseGmsClient zzct>
	//    5   11:astore_1        
			((BaseGmsClient) (connectionresult)).getRemoteService(((IAccountAccessor) (null)), ((BaseGmsClient) (connectionresult)).getScopes());
	//    6   12:aload_1         
	//    7   13:aconst_null     
	//    8   14:aload_1         
	//    9   15:invokevirtual   #34  <Method java.util.Set BaseGmsClient.getScopes()>
	//   10   18:invokevirtual   #38  <Method void BaseGmsClient.getRemoteService(IAccountAccessor, java.util.Set)>
			return;
	//   11   21:return          
		}
		if(BaseGmsClient.zzg(zzct) != null)
	//*  12   22:aload_0         
	//*  13   23:getfield        #16  <Field BaseGmsClient zzct>
	//*  14   26:invokestatic    #42  <Method BaseGmsClient$BaseOnConnectionFailedListener BaseGmsClient.zzg(BaseGmsClient)>
	//*  15   29:ifnull          45
			BaseGmsClient.zzg(zzct).onConnectionFailed(connectionresult);
	//   16   32:aload_0         
	//   17   33:getfield        #16  <Field BaseGmsClient zzct>
	//   18   36:invokestatic    #42  <Method BaseGmsClient$BaseOnConnectionFailedListener BaseGmsClient.zzg(BaseGmsClient)>
	//   19   39:aload_1         
	//   20   40:invokeinterface #47  <Method void BaseGmsClient$BaseOnConnectionFailedListener.onConnectionFailed(ConnectionResult)>
	//   21   45:return          
	}

	private final BaseGmsClient zzct;

	public BaseGmsClient$LegacyClientCallbackAdapter(BaseGmsClient basegmsclient)
	{
		zzct = basegmsclient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field BaseGmsClient zzct>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
