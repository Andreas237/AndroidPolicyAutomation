// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.internal.cast.*;

// Referenced classes of package com.google.android.gms.cast:
//			RemoteMediaPlayer, zzbn, zzbo

static class RemoteMediaPlayer$zzb extends zzcf
{

	public Result createFailedResult(Status status)
	{
		return ((Result) (new zzbo(this, status)));
	//    0    0:new             #27  <Class zzbo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #30  <Method void zzbo(RemoteMediaPlayer$zzb, Status)>
	//    5    9:areturn         
	}

	protected void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		zza((zzcn)anyclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #36  <Class zzcn>
	//    3    5:invokevirtual   #40  <Method void zza(zzcn)>
	//    4    8:return          
	}

	protected void zza(zzcn zzcn1)
	{
	//    0    0:return          
	}

	zzdm zzgc;

	RemoteMediaPlayer$zzb(GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void zzcf(GoogleApiClient)>
		zzgc = ((zzdm) (new zzbn(this)));
	//    3    5:aload_0         
	//    4    6:new             #17  <Class zzbn>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #20  <Method void zzbn(RemoteMediaPlayer$zzb)>
	//    8   14:putfield        #22  <Field zzdm zzgc>
	//    9   17:return          
	}
}
