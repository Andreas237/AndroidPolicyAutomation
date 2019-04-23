// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal.location:
//			zzj, zzaz, zze

final class zzg extends zzj
{

	zzg(zze zze, GoogleApiClient googleapiclient, PendingIntent pendingintent)
	{
		zzbx = pendingintent;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #10  <Field PendingIntent zzbx>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void zzj(GoogleApiClient)>
	//    6   10:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((zzaz)anyclient).zzb(zzbx);
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class zzaz>
	//    2    4:aload_0         
	//    3    5:getfield        #10  <Field PendingIntent zzbx>
	//    4    8:invokevirtual   #24  <Method void zzaz.zzb(PendingIntent)>
		setResult(((com.google.android.gms.common.api.Result) (Status.RESULT_SUCCESS)));
	//    5   11:aload_0         
	//    6   12:getstatic       #30  <Field Status Status.RESULT_SUCCESS>
	//    7   15:invokevirtual   #34  <Method void setResult(com.google.android.gms.common.api.Result)>
	//    8   18:return          
	}

	private final PendingIntent zzbx;
}
