// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzm, zzq, zzcx

class zzq$1 extends zzm
{

	public volatile void zza(com.google.android.gms.common.api.b b)
		throws RemoteException
	{
		zza((zzcx)b);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #29  <Class zzcx>
	//    3    5:invokevirtual   #32  <Method void zza(zzcx)>
	//    4    8:return          
	}

	protected void zza(zzcx zzcx1)
		throws RemoteException
	{
		zzcx1.zze(((com.google.android.gms.internal.zzb) (this)), zzbTR, zzJB);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #17  <Field String zzbTR>
	//    4    6:aload_0         
	//    5    7:getfield        #19  <Field String zzJB>
	//    6   10:invokevirtual   #37  <Method void zzcx.zze(com.google.android.gms.internal.zzaad$zzb, String, String)>
	//    7   13:return          
	}

	public com.google.android.gms.wearable.lApi.OpenChannelResult zzbT(Status status)
	{
		return ((com.google.android.gms.wearable.lApi.OpenChannelResult) (new a(status, ((com.google.android.gms.wearable.Channel) (null)))));
	//    0    0:new             #41  <Class zzq$zza>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #44  <Method void zzq$zza(Status, com.google.android.gms.wearable.Channel)>
	//    5    9:areturn         
	}

	public Result zzc(Status status)
	{
		return ((Result) (zzbT(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #48  <Method com.google.android.gms.wearable.ChannelApi$OpenChannelResult zzbT(Status)>
	//    3    5:areturn         
	}

	final String zzJB;
	final String zzbTR;

	zzq$1(zzq zzq1, GoogleApiClient googleapiclient, String s, String s1)
	{
		zzbTR = s;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #17  <Field String zzbTR>
		zzJB = s1;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #19  <Field String zzJB>
		super(googleapiclient);
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:invokespecial   #22  <Method void zzm(GoogleApiClient)>
	//    9   16:return          
	}
}
