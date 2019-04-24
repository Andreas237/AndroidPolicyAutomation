// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzm, zzu, zzcx

class zzu$6 extends zzm
{

	public volatile void zza(com.google.android.gms.common.api.b b)
		throws RemoteException
	{
		zza((zzcx)b);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #37  <Class zzcx>
	//    3    5:invokevirtual   #40  <Method void zza(zzcx)>
	//    4    8:return          
	}

	protected void zza(zzcx zzcx1)
		throws RemoteException
	{
		zzcx1.zza(((com.google.android.gms.internal.zzb) (this)), zzu.zza(zzbTX), zzbBv, zzbTZ, zzbUa);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #21  <Field zzu zzbTX>
	//    4    6:invokestatic    #44  <Method String zzu.zza(zzu)>
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field Uri zzbBv>
	//    7   13:aload_0         
	//    8   14:getfield        #25  <Field long zzbTZ>
	//    9   17:aload_0         
	//   10   18:getfield        #27  <Field long zzbUa>
	//   11   21:invokevirtual   #47  <Method void zzcx.zza(com.google.android.gms.internal.zzaad$zzb, String, Uri, long, long)>
	//   12   24:return          
	}

	public Status zzb(Status status)
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
	//    2    2:invokevirtual   #53  <Method Status zzb(Status)>
	//    3    5:areturn         
	}

	final Uri zzbBv;
	final zzu zzbTX;
	final long zzbTZ;
	final long zzbUa;

	zzu$6(zzu zzu1, GoogleApiClient googleapiclient, Uri uri, long l, long l1)
	{
		zzbTX = zzu1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field zzu zzbTX>
		zzbBv = uri;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #23  <Field Uri zzbBv>
		zzbTZ = l;
	//    6   10:aload_0         
	//    7   11:lload           4
	//    8   13:putfield        #25  <Field long zzbTZ>
		zzbUa = l1;
	//    9   16:aload_0         
	//   10   17:lload           6
	//   11   19:putfield        #27  <Field long zzbUa>
		super(googleapiclient);
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:invokespecial   #30  <Method void zzm(GoogleApiClient)>
	//   15   27:return          
	}
}
