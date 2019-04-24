// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.common.internal.service:
//			CommonApi, zzb, BaseCommonServiceCallbacks

public final class CommonApiImpl
	implements CommonApi
{
	private static final class zza extends BaseCommonServiceCallbacks
	{

		public final void onDefaultAccountCleared(int i)
			throws RemoteException
		{
			mResultHolder.setResult(((Object) (new Status(i))));
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder mResultHolder>
		//    2    4:new             #26  <Class Status>
		//    3    7:dup             
		//    4    8:iload_1         
		//    5    9:invokespecial   #28  <Method void Status(int)>
		//    6   12:invokeinterface #34  <Method void com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder.setResult(Object)>
		//    7   17:return          
		}

		private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

		public zza(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void BaseCommonServiceCallbacks()>
			mResultHolder = resultholder;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder mResultHolder>
		//    5    9:return          
		}
	}


	public CommonApiImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public final PendingResult clearDefaultAccount(GoogleApiClient googleapiclient)
	{
		return ((PendingResult) (googleapiclient.execute(((com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) (new zzb(this, googleapiclient))))));
	//    0    0:aload_1         
	//    1    1:new             #18  <Class zzb>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #21  <Method void zzb(CommonApiImpl, GoogleApiClient)>
	//    6   10:invokevirtual   #27  <Method com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl GoogleApiClient.execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl)>
	//    7   13:areturn         
	}
}
