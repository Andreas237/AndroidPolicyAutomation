// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal.location:
//			zzab, zzaz, zzac, zzq

final class zzaa extends zzab
{

	zzaa(zzq zzq, GoogleApiClient googleapiclient, PendingIntent pendingintent)
	{
		zzbx = pendingintent;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #10  <Field PendingIntent zzbx>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void zzab(GoogleApiClient)>
	//    6   10:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		anyclient = ((com.google.android.gms.common.api.Api.AnyClient) ((zzaz)anyclient));
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class zzaz>
	//    2    4:astore_1        
		zzac zzac1 = new zzac(((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) (this)));
	//    3    5:new             #22  <Class zzac>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #25  <Method void zzac(com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
	//    7   13:astore_2        
		((zzaz) (anyclient)).zza(zzbx, ((zzaj) (zzac1)));
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #10  <Field PendingIntent zzbx>
	//   11   19:aload_2         
	//   12   20:invokevirtual   #29  <Method void zzaz.zza(PendingIntent, zzaj)>
	//   13   23:return          
	}

	private final PendingIntent zzbx;
}
