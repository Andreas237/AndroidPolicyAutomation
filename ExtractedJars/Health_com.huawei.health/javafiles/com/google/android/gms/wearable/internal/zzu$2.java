// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzm, zzu, zzcx

class zzu$2 extends zzm
{

	public volatile void zza(com.google.android.gms.common.api.b b)
		throws RemoteException
	{
		zza((zzcx)b);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class zzcx>
	//    3    5:invokevirtual   #33  <Method void zza(zzcx)>
	//    4    8:return          
	}

	protected void zza(zzcx zzcx1)
		throws RemoteException
	{
		zzcx1.zzi(((com.google.android.gms.internal.zzb) (this)), zzu.zza(zzbTX), zzIO);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #18  <Field zzu zzbTX>
	//    4    6:invokestatic    #37  <Method String zzu.zza(zzu)>
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field int zzIO>
	//    7   13:invokevirtual   #41  <Method void zzcx.zzi(com.google.android.gms.internal.zzaad$zzb, String, int)>
	//    8   16:return          
	}

	protected Status zzb(Status status)
	{
		return status;
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	public Result zzc(Status status)
	{
		return ((Result) (zzb(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #47  <Method Status zzb(Status)>
	//    3    5:areturn         
	}

	final int zzIO;
	final zzu zzbTX;

	zzu$2(zzu zzu1, GoogleApiClient googleapiclient, int i)
	{
		zzbTX = zzu1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field zzu zzbTX>
		zzIO = i;
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:putfield        #20  <Field int zzIO>
		super(googleapiclient);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #23  <Method void zzm(GoogleApiClient)>
	//    9   15:return          
	}
}
