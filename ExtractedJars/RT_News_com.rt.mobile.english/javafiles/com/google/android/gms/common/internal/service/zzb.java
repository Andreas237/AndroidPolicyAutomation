// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;

// Referenced classes of package com.google.android.gms.common.internal.service:
//			zzd, CommonClient, ICommonService, CommonApiImpl

final class zzb extends zzd
{

	zzb(CommonApiImpl commonapiimpl, GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #9   <Method void zzd(GoogleApiClient)>
	//    3    5:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((ICommonService)((BaseGmsClient) ((CommonClient)anyclient)).getService()).clearDefaultAccount(((ICommonCallbacks) (new CommonApiImpl.zza(((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) (this))))));
	//    0    0:aload_1         
	//    1    1:checkcast       #16  <Class CommonClient>
	//    2    4:invokevirtual   #22  <Method android.os.IInterface BaseGmsClient.getService()>
	//    3    7:checkcast       #24  <Class ICommonService>
	//    4   10:new             #26  <Class CommonApiImpl$zza>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokespecial   #29  <Method void CommonApiImpl$zza(com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
	//    8   18:invokeinterface #33  <Method void ICommonService.clearDefaultAccount(ICommonCallbacks)>
	//    9   23:return          
	}
}
