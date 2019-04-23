// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.location;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.internal.location:
//			zzab, zzaz, zzac, zzbm, 
//			zzq

final class zzw extends zzab
{

	zzw(zzq zzq, GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
	{
		zzck = locationrequest;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #14  <Field LocationRequest zzck>
		zzcl = locationlistener;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #16  <Field LocationListener zzcl>
		zzcp = looper;
	//    6   11:aload_0         
	//    7   12:aload           5
	//    8   14:putfield        #18  <Field Looper zzcp>
		super(googleapiclient);
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:invokespecial   #21  <Method void zzab(GoogleApiClient)>
	//   12   22:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		anyclient = ((com.google.android.gms.common.api.Api.AnyClient) ((zzaz)anyclient));
	//    0    0:aload_1         
	//    1    1:checkcast       #28  <Class zzaz>
	//    2    4:astore_1        
		zzac zzac1 = new zzac(((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) (this)));
	//    3    5:new             #30  <Class zzac>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #33  <Method void zzac(com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
	//    7   13:astore_2        
		((zzaz) (anyclient)).zza(zzck, ListenerHolders.createListenerHolder(((Object) (zzcl)), zzbm.zza(zzcp), ((Class) (com/google/android/gms/location/LocationListener)).getSimpleName()), ((zzaj) (zzac1)));
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #14  <Field LocationRequest zzck>
	//   11   19:aload_0         
	//   12   20:getfield        #16  <Field LocationListener zzcl>
	//   13   23:aload_0         
	//   14   24:getfield        #18  <Field Looper zzcp>
	//   15   27:invokestatic    #39  <Method Looper zzbm.zza(Looper)>
	//   16   30:ldc1            #41  <Class LocationListener>
	//   17   32:invokevirtual   #47  <Method String Class.getSimpleName()>
	//   18   35:invokestatic    #53  <Method com.google.android.gms.common.api.internal.ListenerHolder ListenerHolders.createListenerHolder(Object, Looper, String)>
	//   19   38:aload_2         
	//   20   39:invokevirtual   #56  <Method void zzaz.zza(LocationRequest, com.google.android.gms.common.api.internal.ListenerHolder, zzaj)>
	//   21   42:return          
	}

	private final LocationRequest zzck;
	private final LocationListener zzcl;
	private final Looper zzcp;
}
