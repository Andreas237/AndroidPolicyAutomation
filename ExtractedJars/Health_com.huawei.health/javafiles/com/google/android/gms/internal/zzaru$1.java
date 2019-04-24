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

class zzaru$1 extends a
{

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzash)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #29  <Class zzash>
	//    3    5:invokevirtual   #32  <Method void zza(zzash)>
	//    4    8:return          
	}

	protected void zza(zzash zzash1)
		throws RemoteException
	{
		zzash1.zza(zzbkq, zzbkr);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #17  <Field long zzbkq>
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field PendingIntent zzbkr>
	//    5    9:invokevirtual   #36  <Method void zzash.zza(long, PendingIntent)>
		zzb(((com.google.android.gms.common.api.Result) (Status.zzazx)));
	//    6   12:aload_0         
	//    7   13:getstatic       #42  <Field Status Status.zzazx>
	//    8   16:invokevirtual   #46  <Method void zzb(com.google.android.gms.common.api.Result)>
	//    9   19:return          
	}

	final long zzbkq;
	final PendingIntent zzbkr;

	zzaru$1(zzaru zzaru1, GoogleApiClient googleapiclient, long l, PendingIntent pendingintent)
	{
		zzbkq = l;
	//    0    0:aload_0         
	//    1    1:lload_3         
	//    2    2:putfield        #17  <Field long zzbkq>
		zzbkr = pendingintent;
	//    3    5:aload_0         
	//    4    6:aload           5
	//    5    8:putfield        #19  <Field PendingIntent zzbkr>
		super(googleapiclient);
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:invokespecial   #22  <Method void zzaru$zza(GoogleApiClient)>
	//    9   16:return          
	}
}
