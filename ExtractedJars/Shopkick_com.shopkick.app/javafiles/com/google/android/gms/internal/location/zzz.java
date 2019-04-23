// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationListener;

// Referenced classes of package com.google.android.gms.internal.location:
//			zzab, zzaz, zzac, zzq

final class zzz extends zzab
{

	zzz(zzq zzq, GoogleApiClient googleapiclient, LocationListener locationlistener)
	{
		zzcl = locationlistener;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #10  <Field LocationListener zzcl>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void zzab(GoogleApiClient)>
	//    6   10:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((zzaz)anyclient).zza(ListenerHolders.createListenerKey(((Object) (zzcl)), ((Class) (com/google/android/gms/location/LocationListener)).getSimpleName()), ((zzaj) (new zzac(((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) (this))))));
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class zzaz>
	//    2    4:aload_0         
	//    3    5:getfield        #10  <Field LocationListener zzcl>
	//    4    8:ldc1            #22  <Class LocationListener>
	//    5   10:invokevirtual   #28  <Method String Class.getSimpleName()>
	//    6   13:invokestatic    #34  <Method com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey ListenerHolders.createListenerKey(Object, String)>
	//    7   16:new             #36  <Class zzac>
	//    8   19:dup             
	//    9   20:aload_0         
	//   10   21:invokespecial   #39  <Method void zzac(com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
	//   11   24:invokevirtual   #43  <Method void zzaz.zza(com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey, zzaj)>
	//   12   27:return          
	}

	private final LocationListener zzcl;
}
