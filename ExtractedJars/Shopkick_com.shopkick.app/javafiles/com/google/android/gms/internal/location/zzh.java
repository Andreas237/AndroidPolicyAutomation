// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.ActivityTransitionRequest;

// Referenced classes of package com.google.android.gms.internal.location:
//			zzj, zzaz, zze

final class zzh extends zzj
{

	zzh(zze zze, GoogleApiClient googleapiclient, ActivityTransitionRequest activitytransitionrequest, PendingIntent pendingintent)
	{
		zzby = activitytransitionrequest;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #12  <Field ActivityTransitionRequest zzby>
		zzbz = pendingintent;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #14  <Field PendingIntent zzbz>
		super(googleapiclient);
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:invokespecial   #17  <Method void zzj(GoogleApiClient)>
	//    9   16:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((zzaz)anyclient).zza(zzby, zzbz, ((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) (this)));
	//    0    0:aload_1         
	//    1    1:checkcast       #24  <Class zzaz>
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field ActivityTransitionRequest zzby>
	//    4    8:aload_0         
	//    5    9:getfield        #14  <Field PendingIntent zzbz>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #28  <Method void zzaz.zza(ActivityTransitionRequest, PendingIntent, com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
	//    8   16:return          
	}

	private final ActivityTransitionRequest zzby;
	private final PendingIntent zzbz;
}
