// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.safetynet;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal.safetynet:
//			zzx, zzi, zzk

final class zzr extends zzk.zze
{

	zzr(zzk zzk, GoogleApiClient googleapiclient, String s)
	{
		zzac = s;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #10  <Field String zzac>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void zzk$zze(GoogleApiClient)>
	//    6   10:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		anyclient = ((com.google.android.gms.common.api.Api.AnyClient) ((zzx)anyclient));
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class zzx>
	//    2    4:astore_1        
		zzg zzg = zzaf;
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field zzg zzaf>
	//    5    9:astore_2        
		String s = zzac;
	//    6   10:aload_0         
	//    7   11:getfield        #10  <Field String zzac>
	//    8   14:astore_3        
		((zzi)((zzx) (anyclient)).getService()).zza(zzg, s);
	//    9   15:aload_1         
	//   10   16:invokevirtual   #28  <Method android.os.IInterface zzx.getService()>
	//   11   19:checkcast       #30  <Class zzi>
	//   12   22:aload_2         
	//   13   23:aload_3         
	//   14   24:invokeinterface #34  <Method void zzi.zza(zzg, String)>
	//   15   29:return          
	}

	private final String zzac;
}
