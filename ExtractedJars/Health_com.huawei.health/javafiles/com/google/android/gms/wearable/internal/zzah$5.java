// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzm, zzah, zzcx

class zzah$5 extends zzm
{

	public volatile void zza(com.google.android.gms.common.api. )
		throws RemoteException
	{
		zza((zzcx));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class zzcx>
	//    3    5:invokevirtual   #33  <Method void zza(zzcx)>
	//    4    8:return          
	}

	protected void zza(zzcx zzcx1)
		throws RemoteException
	{
		zzcx1.zzb(((com.google.android.gms.internal.zb) (this)), zzbBv, zzbUk);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #18  <Field Uri zzbBv>
	//    4    6:aload_0         
	//    5    7:getfield        #20  <Field int zzbUk>
	//    6   10:invokevirtual   #38  <Method void zzcx.zzb(com.google.android.gms.internal.zzaad$zzb, Uri, int)>
	//    7   13:return          
	}

	protected com.google.android.gms.wearable..DeleteDataItemsResult zzbY(Status status)
	{
		return ((com.google.android.gms.wearable..DeleteDataItemsResult) (new b(status, 0)));
	//    0    0:new             #42  <Class zzah$zzb>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #45  <Method void zzah$zzb(Status, int)>
	//    5    9:areturn         
	}

	public Result zzc(Status status)
	{
		return ((Result) (zzbY(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #49  <Method com.google.android.gms.wearable.DataApi$DeleteDataItemsResult zzbY(Status)>
	//    3    5:areturn         
	}

	final Uri zzbBv;
	final int zzbUk;

	zzah$5(zzah zzah1, GoogleApiClient googleapiclient, Uri uri, int i)
	{
		zzbBv = uri;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #18  <Field Uri zzbBv>
		zzbUk = i;
	//    3    5:aload_0         
	//    4    6:iload           4
	//    5    8:putfield        #20  <Field int zzbUk>
		super(googleapiclient);
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:invokespecial   #23  <Method void zzm(GoogleApiClient)>
	//    9   16:return          
	}
}
