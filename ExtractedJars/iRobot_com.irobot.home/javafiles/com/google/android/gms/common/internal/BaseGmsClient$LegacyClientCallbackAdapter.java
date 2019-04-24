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
	//*   1    1:invokevirtual   #29  <Method boolean ConnectionResult.isSuccess()>
	//*   2    4:ifeq            23
		{
			zzcs.getRemoteService(((IAccountAccessor) (null)), zzcs.getScopes());
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field BaseGmsClient zzcs>
	//    5   11:aconst_null     
	//    6   12:aload_0         
	//    7   13:getfield        #16  <Field BaseGmsClient zzcs>
	//    8   16:invokevirtual   #33  <Method java.util.Set BaseGmsClient.getScopes()>
	//    9   19:invokevirtual   #37  <Method void BaseGmsClient.getRemoteService(IAccountAccessor, java.util.Set)>
			return;
	//   10   22:return          
		}
		if(BaseGmsClient.zzg(zzcs) != null)
	//*  11   23:aload_0         
	//*  12   24:getfield        #16  <Field BaseGmsClient zzcs>
	//*  13   27:invokestatic    #41  <Method BaseGmsClient$BaseOnConnectionFailedListener BaseGmsClient.zzg(BaseGmsClient)>
	//*  14   30:ifnull          46
			BaseGmsClient.zzg(zzcs).onConnectionFailed(connectionresult);
	//   15   33:aload_0         
	//   16   34:getfield        #16  <Field BaseGmsClient zzcs>
	//   17   37:invokestatic    #41  <Method BaseGmsClient$BaseOnConnectionFailedListener BaseGmsClient.zzg(BaseGmsClient)>
	//   18   40:aload_1         
	//   19   41:invokeinterface #46  <Method void BaseGmsClient$BaseOnConnectionFailedListener.onConnectionFailed(ConnectionResult)>
	//   20   46:return          
	}

	private final BaseGmsClient zzcs;

	public BaseGmsClient$LegacyClientCallbackAdapter(BaseGmsClient basegmsclient)
	{
		zzcs = basegmsclient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field BaseGmsClient zzcs>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
