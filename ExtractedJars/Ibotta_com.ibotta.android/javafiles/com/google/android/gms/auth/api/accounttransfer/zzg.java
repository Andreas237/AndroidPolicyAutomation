// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzac;
import com.google.android.gms.internal.auth.zzai;

// Referenced classes of package com.google.android.gms.auth.api.accounttransfer:
//			AccountTransferClient

final class zzg extends AccountTransferClient.zzf
{

	zzg(AccountTransferClient accounttransferclient, zzai zzai)
	{
		zzaz = zzai;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #10  <Field zzai zzaz>
		super(((zzf) (null)));
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #13  <Method void AccountTransferClient$zzf(zzf)>
	//    6   10:return          
	}

	protected final void zzd(zzac zzac1)
		throws RemoteException
	{
		zzac1.zzd(((com.google.android.gms.internal.auth.zzaa) (zzbi)), zzaz);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field com.google.android.gms.internal.auth.zzab zzbi>
	//    3    5:aload_0         
	//    4    6:getfield        #10  <Field zzai zzaz>
	//    5    9:invokeinterface #27  <Method void zzac.zzd(com.google.android.gms.internal.auth.zzaa, zzai)>
	//    6   14:return          
	}

	private final zzai zzaz;
}
