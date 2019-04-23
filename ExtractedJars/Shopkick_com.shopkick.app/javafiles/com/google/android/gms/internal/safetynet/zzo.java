// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.safetynet;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal.safetynet:
//			zzx, zzi, zzk

final class zzo extends zzk.zzc
{

	zzo(zzk zzk, GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #9   <Method void zzk$zzc(GoogleApiClient)>
	//    3    5:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		anyclient = ((com.google.android.gms.common.api.Api.AnyClient) ((zzx)anyclient));
	//    0    0:aload_1         
	//    1    1:checkcast       #16  <Class zzx>
	//    2    4:astore_1        
		zzg zzg = zzaf;
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field zzg zzaf>
	//    5    9:astore_2        
		((zzi)((zzx) (anyclient)).getService()).zzb(zzg);
	//    6   10:aload_1         
	//    7   11:invokevirtual   #24  <Method android.os.IInterface zzx.getService()>
	//    8   14:checkcast       #26  <Class zzi>
	//    9   17:aload_2         
	//   10   18:invokeinterface #30  <Method void zzi.zzb(zzg)>
	//   11   23:return          
	}
}
