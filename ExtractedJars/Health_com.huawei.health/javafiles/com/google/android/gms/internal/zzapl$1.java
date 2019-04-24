// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.fitness.request.GoalsReadRequest;
import com.google.android.gms.fitness.result.GoalsResult;

// Referenced classes of package com.google.android.gms.internal:
//			zzapl, zzaof, zzaou

class zzapl$1 extends a
{

	protected GoalsResult zzW(Status status)
	{
		return GoalsResult.zzag(status);
	//    0    0:aload_1         
	//    1    1:invokestatic    #29  <Method GoalsResult GoalsResult.zzag(Status)>
	//    2    4:areturn         
	}

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzaof)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class zzaof>
	//    3    5:invokevirtual   #38  <Method void zza(zzaof)>
	//    4    8:return          
	}

	protected void zza(zzaof zzaof1)
		throws RemoteException
	{
		a a = new zzaor.zza() {

			public void zza(GoalsResult goalsresult)
				throws RemoteException
			{
				zzaUK.zzb(((Result) (goalsresult)));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field zzapl$1 zzaUK>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #26  <Method void zzapl$1.zzb(Result)>
			//    4    8:return          
			}

			final zzapl._cls1 zzaUK;

			
			{
				zzaUK = zzapl._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field zzapl$1 zzaUK>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void zzaor$zza()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #12  <Class zzapl$1$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #42  <Method void zzapl$1$1(zzapl$1)>
	//    4    8:astore_2        
		((zzaou)zzaof1.zzxD()).zza(new GoalsReadRequest(zzaUJ, ((zzaor) (a))));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #46  <Method android.os.IInterface zzaof.zzxD()>
	//    7   13:checkcast       #48  <Class zzaou>
	//    8   16:new             #50  <Class GoalsReadRequest>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #18  <Field GoalsReadRequest zzaUJ>
	//   12   24:aload_2         
	//   13   25:invokespecial   #53  <Method void GoalsReadRequest(GoalsReadRequest, zzaor)>
	//   14   28:invokeinterface #56  <Method void zzaou.zza(GoalsReadRequest)>
	//   15   33:return          
	}

	protected Result zzc(Status status)
	{
		return ((Result) (zzW(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #60  <Method GoalsResult zzW(Status)>
	//    3    5:areturn         
	}

	final GoalsReadRequest zzaUJ;

	zzapl$1(zzapl zzapl1, GoogleApiClient googleapiclient, GoalsReadRequest goalsreadrequest)
	{
		zzaUJ = goalsreadrequest;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #18  <Field GoalsReadRequest zzaUJ>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #21  <Method void zzaof$zza(GoogleApiClient)>
	//    6   10:return          
	}
}
