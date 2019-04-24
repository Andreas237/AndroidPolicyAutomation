// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.result.DataTypeResult;

// Referenced classes of package com.google.android.gms.internal:
//			zzapk, zzaoe, zzaot

class zzapk$1 extends a
{

	protected DataTypeResult zzV(Status status)
	{
		return DataTypeResult.zzaf(status);
	//    0    0:aload_1         
	//    1    1:invokestatic    #27  <Method DataTypeResult DataTypeResult.zzaf(Status)>
	//    2    4:areturn         
	}

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzaoe)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #33  <Class zzaoe>
	//    3    5:invokevirtual   #36  <Method void zza(zzaoe)>
	//    4    8:return          
	}

	protected void zza(zzaoe zzaoe1)
		throws RemoteException
	{
		a a = new a(((b) (this)), ((zzapk$1) (null)));
	//    0    0:new             #39  <Class zzapk$zza>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #42  <Method void zzapk$zza(zzaad$zzb, zzapk$1)>
	//    5    9:astore_2        
		((zzaot)zzaoe1.zzxD()).zza(new DataTypeCreateRequest(zzaUH, ((zzaoo) (a))));
	//    6   10:aload_1         
	//    7   11:invokevirtual   #46  <Method android.os.IInterface zzaoe.zzxD()>
	//    8   14:checkcast       #48  <Class zzaot>
	//    9   17:new             #50  <Class DataTypeCreateRequest>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:getfield        #16  <Field DataTypeCreateRequest zzaUH>
	//   13   25:aload_2         
	//   14   26:invokespecial   #53  <Method void DataTypeCreateRequest(DataTypeCreateRequest, zzaoo)>
	//   15   29:invokeinterface #56  <Method void zzaot.zza(DataTypeCreateRequest)>
	//   16   34:return          
	}

	protected Result zzc(Status status)
	{
		return ((Result) (zzV(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #60  <Method DataTypeResult zzV(Status)>
	//    3    5:areturn         
	}

	final DataTypeCreateRequest zzaUH;

	zzapk$1(zzapk zzapk1, GoogleApiClient googleapiclient, DataTypeCreateRequest datatypecreaterequest)
	{
		zzaUH = datatypecreaterequest;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #16  <Field DataTypeCreateRequest zzaUH>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #19  <Method void zzaoe$zza(GoogleApiClient)>
	//    6   10:return          
	}
}
