// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.internal.location:
//			zzab, zzaz, zzac, zzq

final class zzy extends zzab
{

	zzy(zzq zzq, GoogleApiClient googleapiclient, LocationRequest locationrequest, PendingIntent pendingintent)
	{
		zzck = locationrequest;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #12  <Field LocationRequest zzck>
		zzbx = pendingintent;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #14  <Field PendingIntent zzbx>
		super(googleapiclient);
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:invokespecial   #17  <Method void zzab(GoogleApiClient)>
	//    9   16:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		anyclient = ((com.google.android.gms.common.api.Api.AnyClient) ((zzaz)anyclient));
	//    0    0:aload_1         
	//    1    1:checkcast       #24  <Class zzaz>
	//    2    4:astore_1        
		zzac zzac1 = new zzac(((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) (this)));
	//    3    5:new             #26  <Class zzac>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #29  <Method void zzac(com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
	//    7   13:astore_2        
		((zzaz) (anyclient)).zza(zzck, zzbx, ((zzaj) (zzac1)));
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #12  <Field LocationRequest zzck>
	//   11   19:aload_0         
	//   12   20:getfield        #14  <Field PendingIntent zzbx>
	//   13   23:aload_2         
	//   14   24:invokevirtual   #33  <Method void zzaz.zza(LocationRequest, PendingIntent, zzaj)>
	//   15   27:return          
	}

	private final PendingIntent zzbx;
	private final LocationRequest zzck;
}
