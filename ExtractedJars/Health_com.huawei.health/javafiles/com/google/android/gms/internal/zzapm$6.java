// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.result.DataReadResult;

// Referenced classes of package com.google.android.gms.internal:
//			zzapm, zzaog, zzaov

class zzapm$6 extends a
{

	protected DataReadResult zzX(Status status)
	{
		return DataReadResult.zza(status, zzaUR.getDataTypes(), zzaUR.getDataSources());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #16  <Field DataReadRequest zzaUR>
	//    3    5:invokevirtual   #28  <Method java.util.List DataReadRequest.getDataTypes()>
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field DataReadRequest zzaUR>
	//    6   12:invokevirtual   #31  <Method java.util.List DataReadRequest.getDataSources()>
	//    7   15:invokestatic    #37  <Method DataReadResult DataReadResult.zza(Status, java.util.List, java.util.List)>
	//    8   18:areturn         
	}

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzaog)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #42  <Class zzaog>
	//    3    5:invokevirtual   #45  <Method void zza(zzaog)>
	//    4    8:return          
	}

	protected void zza(zzaog zzaog1)
		throws RemoteException
	{
		a a = new a(((b) (this)), ((zzapm$1) (null)));
	//    0    0:new             #48  <Class zzapm$zza>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #51  <Method void zzapm$zza(zzaad$zzb, zzapm$1)>
	//    5    9:astore_2        
		((zzaov)zzaog1.zzxD()).zza(new DataReadRequest(zzaUR, ((zzaom) (a))));
	//    6   10:aload_1         
	//    7   11:invokevirtual   #55  <Method android.os.IInterface zzaog.zzxD()>
	//    8   14:checkcast       #57  <Class zzaov>
	//    9   17:new             #24  <Class DataReadRequest>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:getfield        #16  <Field DataReadRequest zzaUR>
	//   13   25:aload_2         
	//   14   26:invokespecial   #60  <Method void DataReadRequest(DataReadRequest, zzaom)>
	//   15   29:invokeinterface #63  <Method void zzaov.zza(DataReadRequest)>
	//   16   34:return          
	}

	protected Result zzc(Status status)
	{
		return ((Result) (zzX(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #67  <Method DataReadResult zzX(Status)>
	//    3    5:areturn         
	}

	final DataReadRequest zzaUR;

	zzapm$6(zzapm zzapm1, GoogleApiClient googleapiclient, DataReadRequest datareadrequest)
	{
		zzaUR = datareadrequest;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #16  <Field DataReadRequest zzaUR>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #19  <Method void zzaog$zza(GoogleApiClient)>
	//    6   10:return          
	}
}
