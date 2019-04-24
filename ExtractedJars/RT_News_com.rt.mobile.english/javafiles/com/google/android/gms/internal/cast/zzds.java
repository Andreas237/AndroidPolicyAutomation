// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzdv, zzea, zzdw, zzdq

final class zzds extends zzdv
{

	zzds(zzdq zzdq1, GoogleApiClient googleapiclient, String s)
	{
		zzxu = zzdq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzdq zzxu>
		zzxv = s;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #14  <Field String zzxv>
		super(zzdq1, googleapiclient);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:invokespecial   #17  <Method void zzdv(zzdq, GoogleApiClient)>
	//   10   16:return          
	}

	public final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((zzdv)this).zza((zzea)anyclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #24  <Class zzea>
	//    3    5:invokevirtual   #28  <Method void zzdv.zza(zzea)>
	//    4    8:return          
	}

	public final void zza(zzea zzea1)
		throws RemoteException
	{
		zzea1.zza(((zzec) (new zzdw(((zzdv) (this)), zzea1))), zzdq.zzb(zzxu), zzxv);
	//    0    0:aload_1         
	//    1    1:new             #31  <Class zzdw>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #34  <Method void zzdw(zzdv, zzea)>
	//    6   10:aload_0         
	//    7   11:getfield        #12  <Field zzdq zzxu>
	//    8   14:invokestatic    #40  <Method zzeg zzdq.zzb(zzdq)>
	//    9   17:aload_0         
	//   10   18:getfield        #14  <Field String zzxv>
	//   11   21:invokevirtual   #43  <Method void zzea.zza(zzec, zzeg, String)>
	//   12   24:return          
	}

	private final zzdq zzxu;
	private final String zzxv;
}
