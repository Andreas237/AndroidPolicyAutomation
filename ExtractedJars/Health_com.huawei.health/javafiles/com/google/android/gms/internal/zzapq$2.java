// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.fitness.request.zzbf;
import com.google.android.gms.fitness.result.SessionStopResult;

// Referenced classes of package com.google.android.gms.internal:
//			zzapq, zzaok, zzaoz

class zzapq$2 extends a
{

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzaok)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #28  <Class zzaok>
	//    3    5:invokevirtual   #31  <Method void zza(zzaok)>
	//    4    8:return          
	}

	protected void zza(zzaok zzaok1)
		throws RemoteException
	{
		b b = new b(((b) (this)), ((zzapq$1) (null)));
	//    0    0:new             #34  <Class zzapq$zzb>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #37  <Method void zzapq$zzb(zzaad$zzb, zzapq$1)>
	//    5    9:astore_2        
		((zzaoz)zzaok1.zzxD()).zza(new zzbf(val$name, zzaVi, ((zzape) (b))));
	//    6   10:aload_1         
	//    7   11:invokevirtual   #41  <Method android.os.IInterface zzaok.zzxD()>
	//    8   14:checkcast       #43  <Class zzaoz>
	//    9   17:new             #45  <Class zzbf>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:getfield        #17  <Field String val$name>
	//   13   25:aload_0         
	//   14   26:getfield        #19  <Field String zzaVi>
	//   15   29:aload_2         
	//   16   30:invokespecial   #48  <Method void zzbf(String, String, zzape)>
	//   17   33:invokeinterface #51  <Method void zzaoz.zza(zzbf)>
	//   18   38:return          
	}

	protected SessionStopResult zzab(Status status)
	{
		return SessionStopResult.zzaj(status);
	//    0    0:aload_1         
	//    1    1:invokestatic    #58  <Method SessionStopResult SessionStopResult.zzaj(Status)>
	//    2    4:areturn         
	}

	protected Result zzc(Status status)
	{
		return ((Result) (zzab(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #62  <Method SessionStopResult zzab(Status)>
	//    3    5:areturn         
	}

	final String val$name;
	final String zzaVi;

	zzapq$2(GoogleApiClient googleapiclient, String s, String s1)
	{
		val$name = s;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #17  <Field String val$name>
		zzaVi = s1;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #19  <Field String zzaVi>
		super(googleapiclient);
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:invokespecial   #22  <Method void zzaok$zza(GoogleApiClient)>
	//    9   16:return          
	}
}
