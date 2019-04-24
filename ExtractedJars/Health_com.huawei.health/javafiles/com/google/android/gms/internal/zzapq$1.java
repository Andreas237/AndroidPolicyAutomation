// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.zzbd;

// Referenced classes of package com.google.android.gms.internal:
//			zzapq, zzaok, zzapr, zzaoz

class zzapq$1 extends c
{

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzaok)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class zzaok>
	//    3    5:invokevirtual   #28  <Method void zza(zzaok)>
	//    4    8:return          
	}

	protected void zza(zzaok zzaok1)
		throws RemoteException
	{
		zzapr zzapr1 = new zzapr(((b) (this)));
	//    0    0:new             #31  <Class zzapr>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #34  <Method void zzapr(zzaad$zzb)>
	//    4    8:astore_2        
		((zzaoz)zzaok1.zzxD()).zza(new zzbd(zzaVh, ((zzapf) (zzapr1))));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #38  <Method android.os.IInterface zzaok.zzxD()>
	//    7   13:checkcast       #40  <Class zzaoz>
	//    8   16:new             #42  <Class zzbd>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #15  <Field Session zzaVh>
	//   12   24:aload_2         
	//   13   25:invokespecial   #45  <Method void zzbd(Session, zzapf)>
	//   14   28:invokeinterface #48  <Method void zzaoz.zza(zzbd)>
	//   15   33:return          
	}

	final Session zzaVh;

	zzapq$1(zzapq zzapq1, GoogleApiClient googleapiclient, Session session)
	{
		zzaVh = session;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #15  <Field Session zzaVh>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void zzaok$zzc(GoogleApiClient)>
	//    6   10:return          
	}
}
