// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//			zzaru, zzash

class zzaru$2 extends a
{

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzash)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class zzash>
	//    3    5:invokevirtual   #28  <Method void zza(zzash)>
	//    4    8:return          
	}

	protected void zza(zzash zzash1)
		throws RemoteException
	{
		zzash1.zzc(zzbkr);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field PendingIntent zzbkr>
	//    3    5:invokevirtual   #33  <Method void zzash.zzc(PendingIntent)>
		zzb(((com.google.android.gms.common.api.Result) (Status.zzazx)));
	//    4    8:aload_0         
	//    5    9:getstatic       #39  <Field Status Status.zzazx>
	//    6   12:invokevirtual   #43  <Method void zzb(com.google.android.gms.common.api.Result)>
	//    7   15:return          
	}

	final PendingIntent zzbkr;

	zzaru$2(zzaru zzaru1, GoogleApiClient googleapiclient, PendingIntent pendingintent)
	{
		zzbkr = pendingintent;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #15  <Field PendingIntent zzbkr>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void zzaru$zza(GoogleApiClient)>
	//    6   10:return          
	}
}
