// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal:
//			zzary, zzash

class zzary$10 extends 
{

	protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
		throws RemoteException
	{
		zza((zzash)zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class zzash>
	//    3    5:invokevirtual   #28  <Method void zza(zzash)>
	//    4    8:return          
	}

	protected void zza(zzash zzash1)
		throws RemoteException
	{
		  = new ((() (this)));
	//    0    0:new             #31  <Class zzary$zzb>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #34  <Method void zzary$zzb(zzaad$zzb)>
	//    4    8:astore_2        
		zzash1.zza(zzbkr, ((zzasc) ()));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #15  <Field PendingIntent zzbkr>
	//    8   14:aload_2         
	//    9   15:invokevirtual   #37  <Method void zzash.zza(PendingIntent, zzasc)>
	//   10   18:return          
	}

	final PendingIntent zzbkr;

	zzary$10(zzary zzary1, GoogleApiClient googleapiclient, PendingIntent pendingintent)
	{
		zzbkr = pendingintent;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #15  <Field PendingIntent zzbkr>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void zzary$zza(GoogleApiClient)>
	//    6   10:return          
	}
}
