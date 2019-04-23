// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.internal.auth:
//			zzaw, zzak, zzan

abstract class zzap extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
{

	public zzap(GoogleApiClient googleapiclient)
	{
		super(AuthProxy.API, googleapiclient);
	//    0    0:aload_0         
	//    1    1:getstatic       #13  <Field com.google.android.gms.common.api.Api AuthProxy.API>
	//    2    4:aload_1         
	//    3    5:invokespecial   #16  <Method void com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl(com.google.android.gms.common.api.Api, GoogleApiClient)>
	//    4    8:return          
	}

	protected Result createFailedResult(Status status)
	{
		return ((Result) (new zzaw(status)));
	//    0    0:new             #21  <Class zzaw>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #24  <Method void zzaw(Status)>
	//    4    8:areturn         
	}

	protected void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		anyclient = ((com.google.android.gms.common.api.Api.AnyClient) ((zzak)anyclient));
	//    0    0:aload_1         
	//    1    1:checkcast       #30  <Class zzak>
	//    2    4:astore_1        
		zza(((zzak) (anyclient)).getContext(), (zzan)((zzak) (anyclient)).getService());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #34  <Method Context zzak.getContext()>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #38  <Method android.os.IInterface zzak.getService()>
	//    8   14:checkcast       #40  <Class zzan>
	//    9   17:invokevirtual   #44  <Method void zza(Context, zzan)>
	//   10   20:return          
	}

	protected abstract void zza(Context context, zzan zzan1)
		throws RemoteException;
}
