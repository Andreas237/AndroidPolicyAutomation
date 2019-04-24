// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.zzam;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

// Referenced classes of package com.google.android.gms.internal:
//			zzapo, zzaoi, zzaox

class zzapo$2 extends a
{

	protected ListSubscriptionsResult zzZ(Status status)
	{
		return ListSubscriptionsResult.zzah(status);
	//    0    0:aload_1         
	//    1    1:invokestatic    #27  <Method ListSubscriptionsResult ListSubscriptionsResult.zzah(Status)>
	//    2    4:areturn         
	}

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzaoi)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #33  <Class zzaoi>
	//    3    5:invokevirtual   #36  <Method void zza(zzaoi)>
	//    4    8:return          
	}

	protected void zza(zzaoi zzaoi1)
		throws RemoteException
	{
		a a = new a(((b) (this)), ((zzapo$1) (null)));
	//    0    0:new             #39  <Class zzapo$zza>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #42  <Method void zzapo$zza(zzaad$zzb, zzapo$1)>
	//    5    9:astore_2        
		((zzaox)zzaoi1.zzxD()).zza(new zzam(zzaUS, ((zzapa) (a))));
	//    6   10:aload_1         
	//    7   11:invokevirtual   #46  <Method android.os.IInterface zzaoi.zzxD()>
	//    8   14:checkcast       #48  <Class zzaox>
	//    9   17:new             #50  <Class zzam>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:getfield        #16  <Field DataType zzaUS>
	//   13   25:aload_2         
	//   14   26:invokespecial   #53  <Method void zzam(DataType, zzapa)>
	//   15   29:invokeinterface #56  <Method void zzaox.zza(zzam)>
	//   16   34:return          
	}

	protected Result zzc(Status status)
	{
		return ((Result) (zzZ(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #60  <Method ListSubscriptionsResult zzZ(Status)>
	//    3    5:areturn         
	}

	final DataType zzaUS;

	zzapo$2(zzapo zzapo1, GoogleApiClient googleapiclient, DataType datatype)
	{
		zzaUS = datatype;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #16  <Field DataType zzaUS>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #19  <Method void zzaoi$zza(GoogleApiClient)>
	//    6   10:return          
	}
}
