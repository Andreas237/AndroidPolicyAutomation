// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzm, zzu, zzcx

class zzu$5 extends zzm
{

	public volatile void zza(com.google.android.gms.common.api.b b)
		throws RemoteException
	{
		zza((zzcx)b);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #34  <Class zzcx>
	//    3    5:invokevirtual   #37  <Method void zza(zzcx)>
	//    4    8:return          
	}

	protected void zza(zzcx zzcx1)
		throws RemoteException
	{
		zzcx1.zza(((com.google.android.gms.internal.zzb) (this)), zzu.zza(zzbTX), zzbBv, zzbTY);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #20  <Field zzu zzbTX>
	//    4    6:invokestatic    #41  <Method String zzu.zza(zzu)>
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field Uri zzbBv>
	//    7   13:aload_0         
	//    8   14:getfield        #24  <Field boolean zzbTY>
	//    9   17:invokevirtual   #44  <Method void zzcx.zza(com.google.android.gms.internal.zzaad$zzb, String, Uri, boolean)>
	//   10   20:return          
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
	//    2    2:invokevirtual   #50  <Method Status zzb(Status)>
	//    3    5:areturn         
	}

	final Uri zzbBv;
	final zzu zzbTX;
	final boolean zzbTY;

	zzu$5(zzu zzu1, GoogleApiClient googleapiclient, Uri uri, boolean flag)
	{
		zzbTX = zzu1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field zzu zzbTX>
		zzbBv = uri;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #22  <Field Uri zzbBv>
		zzbTY = flag;
	//    6   10:aload_0         
	//    7   11:iload           4
	//    8   13:putfield        #24  <Field boolean zzbTY>
		super(googleapiclient);
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:invokespecial   #27  <Method void zzm(GoogleApiClient)>
	//   12   21:return          
	}
}
