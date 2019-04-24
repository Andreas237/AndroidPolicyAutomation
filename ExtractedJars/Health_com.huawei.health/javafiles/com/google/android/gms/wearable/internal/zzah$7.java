// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.wearable.DataItemAsset;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzm, zzah, zzcx

class zzah$7 extends zzm
{

	public volatile void zza(com.google.android.gms.common.api. )
		throws RemoteException
	{
		zza((zzcx));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class zzcx>
	//    3    5:invokevirtual   #29  <Method void zza(zzcx)>
	//    4    8:return          
	}

	protected void zza(zzcx zzcx1)
		throws RemoteException
	{
		zzcx1.zza(((com.google.android.gms.internal.zb) (this)), zzbUm);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #16  <Field DataItemAsset zzbUm>
	//    4    6:invokevirtual   #33  <Method void zzcx.zza(com.google.android.gms.internal.zzaad$zzb, DataItemAsset)>
	//    5    9:return          
	}

	protected com.google.android.gms.wearable..GetFdForAssetResult zzbZ(Status status)
	{
		return ((com.google.android.gms.wearable..GetFdForAssetResult) (new c(status, ((android.os.ParcelFileDescriptor) (null)))));
	//    0    0:new             #37  <Class zzah$zzc>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #40  <Method void zzah$zzc(Status, android.os.ParcelFileDescriptor)>
	//    5    9:areturn         
	}

	public Result zzc(Status status)
	{
		return ((Result) (zzbZ(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #44  <Method com.google.android.gms.wearable.DataApi$GetFdForAssetResult zzbZ(Status)>
	//    3    5:areturn         
	}

	final DataItemAsset zzbUm;

	zzah$7(zzah zzah1, GoogleApiClient googleapiclient, DataItemAsset dataitemasset)
	{
		zzbUm = dataitemasset;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #16  <Field DataItemAsset zzbUm>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #19  <Method void zzm(GoogleApiClient)>
	//    6   10:return          
	}
}
