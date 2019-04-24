// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzdq, zzdy, zzea

class zzdv extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
{

	public zzdv(zzdq zzdq1, GoogleApiClient googleapiclient)
	{
		zzxu = zzdq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzdq zzxu>
		super(zzdq.zzc(zzdq1), googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #18  <Method com.google.android.gms.common.api.Api zzdq.zzc(zzdq)>
	//    6   10:aload_2         
	//    7   11:invokespecial   #21  <Method void com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl(com.google.android.gms.common.api.Api, GoogleApiClient)>
	//    8   14:return          
	}

	protected Result createFailedResult(Status status)
	{
		return ((Result) (new zzdy(status)));
	//    0    0:new             #26  <Class zzdy>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #29  <Method void zzdy(Status)>
	//    4    8:areturn         
	}

	public void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		zza((zzea)anyclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class zzea>
	//    3    5:invokevirtual   #39  <Method void zza(zzea)>
	//    4    8:return          
	}

	public void zza(zzea zzea1)
		throws RemoteException
	{
	//    0    0:return          
	}

	final zzdq zzxu;
}
