// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.fitness.data.zzs;
import com.google.android.gms.fitness.request.zzax;

// Referenced classes of package com.google.android.gms.internal:
//			zzapp, zzaoj, zzaoy

class zzapp$4 extends c
{

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzaoj)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #32  <Class zzaoj>
	//    3    5:invokevirtual   #35  <Method void zza(zzaoj)>
	//    4    8:return          
	}

	protected void zza(zzaoj zzaoj1)
		throws RemoteException
	{
		b b = new b(((b) (this)), zzaVe, ((zzapp$1) (null)));
	//    0    0:new             #38  <Class zzapp$zzb>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field zzapp$zza zzaVe>
	//    5    9:aconst_null     
	//    6   10:invokespecial   #41  <Method void zzapp$zzb(zzaad$zzb, zzapp$zza, zzapp$1)>
	//    7   13:astore_2        
		((zzaoy)zzaoj1.zzxD()).zza(new zzax(zzaVf, zzaUQ, ((zzapf) (b))));
	//    8   14:aload_1         
	//    9   15:invokevirtual   #45  <Method android.os.IInterface zzaoj.zzxD()>
	//   10   18:checkcast       #47  <Class zzaoy>
	//   11   21:new             #49  <Class zzax>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:getfield        #21  <Field zzs zzaVf>
	//   15   29:aload_0         
	//   16   30:getfield        #23  <Field PendingIntent zzaUQ>
	//   17   33:aload_2         
	//   18   34:invokespecial   #52  <Method void zzax(zzs, PendingIntent, zzapf)>
	//   19   37:invokeinterface #55  <Method void zzaoy.zza(zzax)>
	//   20   42:return          
	}

	protected Status zzb(Status status)
	{
		return status;
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	protected Result zzc(Status status)
	{
		return ((Result) (zzb(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #61  <Method Status zzb(Status)>
	//    3    5:areturn         
	}

	final PendingIntent zzaUQ;
	final a zzaVe;
	final zzs zzaVf;

	zzapp$4(zzapp zzapp1, GoogleApiClient googleapiclient, a a, zzs zzs, PendingIntent pendingintent)
	{
		zzaVe = a;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #19  <Field zzapp$zza zzaVe>
		zzaVf = zzs;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #21  <Field zzs zzaVf>
		zzaUQ = pendingintent;
	//    6   11:aload_0         
	//    7   12:aload           5
	//    8   14:putfield        #23  <Field PendingIntent zzaUQ>
		super(googleapiclient);
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:invokespecial   #26  <Method void zzaoj$zzc(GoogleApiClient)>
	//   12   22:return          
	}
}
