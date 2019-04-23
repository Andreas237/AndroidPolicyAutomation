// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal.location:
//			zzab, zzaz, zzac, zzq

final class zzv extends zzab
{

	zzv(zzq zzq, GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #9   <Method void zzab(GoogleApiClient)>
	//    3    5:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((zzaz)anyclient).zza(((zzaj) (new zzac(((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) (this))))));
	//    0    0:aload_1         
	//    1    1:checkcast       #16  <Class zzaz>
	//    2    4:new             #18  <Class zzac>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #21  <Method void zzac(com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
	//    6   12:invokevirtual   #25  <Method void zzaz.zza(zzaj)>
	//    7   15:return          
	}
}
