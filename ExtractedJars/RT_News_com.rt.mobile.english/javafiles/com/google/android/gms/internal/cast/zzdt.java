// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzdv, zzea, zzdx, zzdq

final class zzdt extends zzdv
{

	zzdt(zzdq zzdq, GoogleApiClient googleapiclient)
	{
		super(zzdq, googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #8   <Method void zzdv(zzdq, GoogleApiClient)>
	//    4    6:return          
	}

	public final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((zzdv)this).zza((zzea)anyclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #15  <Class zzea>
	//    3    5:invokevirtual   #19  <Method void zzdv.zza(zzea)>
	//    4    8:return          
	}

	public final void zza(zzea zzea1)
		throws RemoteException
	{
		zzea1.zza(((zzec) (new zzdx(((zzdv) (this))))));
	//    0    0:aload_1         
	//    1    1:new             #22  <Class zzdx>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #25  <Method void zzdx(zzdv)>
	//    5    9:invokevirtual   #28  <Method void zzea.zza(zzec)>
	//    6   12:return          
	}
}
