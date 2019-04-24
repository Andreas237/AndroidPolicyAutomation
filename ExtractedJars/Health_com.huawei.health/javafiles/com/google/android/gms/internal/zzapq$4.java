// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.result.SessionReadResult;

// Referenced classes of package com.google.android.gms.internal:
//			zzapq, zzaok, zzaoz

class zzapq$4 extends a
{

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzaok)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class zzaok>
	//    3    5:invokevirtual   #29  <Method void zza(zzaok)>
	//    4    8:return          
	}

	protected void zza(zzaok zzaok1)
		throws RemoteException
	{
		a a = new a(((b) (this)), ((zzapq$1) (null)));
	//    0    0:new             #32  <Class zzapq$zza>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #35  <Method void zzapq$zza(zzaad$zzb, zzapq$1)>
	//    5    9:astore_2        
		((zzaoz)zzaok1.zzxD()).zza(new SessionReadRequest(zzaVk, ((zzapd) (a))));
	//    6   10:aload_1         
	//    7   11:invokevirtual   #39  <Method android.os.IInterface zzaok.zzxD()>
	//    8   14:checkcast       #41  <Class zzaoz>
	//    9   17:new             #43  <Class SessionReadRequest>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:getfield        #16  <Field SessionReadRequest zzaVk>
	//   13   25:aload_2         
	//   14   26:invokespecial   #46  <Method void SessionReadRequest(SessionReadRequest, zzapd)>
	//   15   29:invokeinterface #49  <Method void zzaoz.zza(SessionReadRequest)>
	//   16   34:return          
	}

	protected SessionReadResult zzac(Status status)
	{
		return SessionReadResult.zzai(status);
	//    0    0:aload_1         
	//    1    1:invokestatic    #56  <Method SessionReadResult SessionReadResult.zzai(Status)>
	//    2    4:areturn         
	}

	protected Result zzc(Status status)
	{
		return ((Result) (zzac(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #60  <Method SessionReadResult zzac(Status)>
	//    3    5:areturn         
	}

	final SessionReadRequest zzaVk;

	zzapq$4(zzapq zzapq1, GoogleApiClient googleapiclient, SessionReadRequest sessionreadrequest)
	{
		zzaVk = sessionreadrequest;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #16  <Field SessionReadRequest zzaVk>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #19  <Method void zzaok$zza(GoogleApiClient)>
	//    6   10:return          
	}
}
