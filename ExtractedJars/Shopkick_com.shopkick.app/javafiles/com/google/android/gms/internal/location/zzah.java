// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.zzal;

// Referenced classes of package com.google.android.gms.internal.location:
//			zzai, zzaz, zzaf

final class zzah extends zzai
{

	zzah(zzaf zzaf, GoogleApiClient googleapiclient, zzal zzal)
	{
		zzct = zzal;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #10  <Field zzal zzct>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void zzai(GoogleApiClient)>
	//    6   10:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((zzaz)anyclient).zza(zzct, ((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) (this)));
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class zzaz>
	//    2    4:aload_0         
	//    3    5:getfield        #10  <Field zzal zzct>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #24  <Method void zzaz.zza(zzal, com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder)>
	//    6   12:return          
	}

	private final zzal zzct;
}
