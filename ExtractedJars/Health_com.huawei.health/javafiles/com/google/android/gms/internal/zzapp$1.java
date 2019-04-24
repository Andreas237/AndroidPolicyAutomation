// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.result.DataSourcesResult;

// Referenced classes of package com.google.android.gms.internal:
//			zzapp, zzaoj, zzaoc, zzaoy

class zzapp$1 extends a
{

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzaoj)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class zzaoj>
	//    3    5:invokevirtual   #29  <Method void zza(zzaoj)>
	//    4    8:return          
	}

	protected void zza(zzaoj zzaoj1)
		throws RemoteException
	{
		zzaoc zzaoc1 = new zzaoc(((b) (this)));
	//    0    0:new             #32  <Class zzaoc>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #35  <Method void zzaoc(zzaad$zzb)>
	//    4    8:astore_2        
		((zzaoy)zzaoj1.zzxD()).zza(new DataSourcesRequest(zzaUZ, ((zzaon) (zzaoc1))));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #39  <Method android.os.IInterface zzaoj.zzxD()>
	//    7   13:checkcast       #41  <Class zzaoy>
	//    8   16:new             #43  <Class DataSourcesRequest>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #16  <Field DataSourcesRequest zzaUZ>
	//   12   24:aload_2         
	//   13   25:invokespecial   #46  <Method void DataSourcesRequest(DataSourcesRequest, zzaon)>
	//   14   28:invokeinterface #49  <Method void zzaoy.zza(DataSourcesRequest)>
	//   15   33:return          
	}

	protected DataSourcesResult zzaa(Status status)
	{
		return DataSourcesResult.zzae(status);
	//    0    0:aload_1         
	//    1    1:invokestatic    #56  <Method DataSourcesResult DataSourcesResult.zzae(Status)>
	//    2    4:areturn         
	}

	protected Result zzc(Status status)
	{
		return ((Result) (zzaa(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #60  <Method DataSourcesResult zzaa(Status)>
	//    3    5:areturn         
	}

	final DataSourcesRequest zzaUZ;

	zzapp$1(zzapp zzapp1, GoogleApiClient googleapiclient, DataSourcesRequest datasourcesrequest)
	{
		zzaUZ = datasourcesrequest;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #16  <Field DataSourcesRequest zzaUZ>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #19  <Method void zzaoj$zza(GoogleApiClient)>
	//    6   10:return          
	}
}
