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

final class zzf extends zzj
{

	zzf(zze zze, GoogleApiClient googleapiclient, long l, PendingIntent pendingintent)
	{
		zzbw = l;
	//    0    0:aload_0         
	//    1    1:lload_3         
	//    2    2:putfield        #12  <Field long zzbw>
		zzbx = pendingintent;
	//    3    5:aload_0         
	//    4    6:aload           5
	//    5    8:putfield        #14  <Field PendingIntent zzbx>
		super(googleapiclient);
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:invokespecial   #17  <Method void zzj(GoogleApiClient)>
	//    9   16:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((zzaz)anyclient).zza(zzbw, zzbx);
	//    0    0:aload_1         
	//    1    1:checkcast       #24  <Class zzaz>
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field long zzbw>
	//    4    8:aload_0         
	//    5    9:getfield        #14  <Field PendingIntent zzbx>
	//    6   12:invokevirtual   #28  <Method void zzaz.zza(long, PendingIntent)>
		setResult(((com.google.android.gms.common.api.Result) (Status.RESULT_SUCCESS)));
	//    7   15:aload_0         
	//    8   16:getstatic       #34  <Field Status Status.RESULT_SUCCESS>
	//    9   19:invokevirtual   #38  <Method void setResult(com.google.android.gms.common.api.Result)>
	//   10   22:return          
	}

	private final long zzbw;
	private final PendingIntent zzbx;
}
