// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzaf;
import com.google.android.gms.internal.auth.zzz;

// Referenced classes of package com.google.android.gms.auth.api.accounttransfer:
//			AccountTransferClient

final class zzd extends AccountTransferClient.zzc
{

	zzd(AccountTransferClient accounttransferclient, zzaf zzaf)
	{
		zzao = zzaf;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #10  <Field zzaf zzao>
		super(((zzc) (null)));
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #13  <Method void AccountTransferClient$zzc(zzc)>
	//    6   10:return          
	}

	protected final void zza(zzz zzz1)
		throws RemoteException
	{
		zzz1.zza(((com.google.android.gms.internal.auth.zzx) (zzax)), zzao);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field com.google.android.gms.internal.auth.zzy zzax>
	//    3    5:aload_0         
	//    4    6:getfield        #10  <Field zzaf zzao>
	//    5    9:invokeinterface #27  <Method void zzz.zza(com.google.android.gms.internal.auth.zzx, zzaf)>
	//    6   14:return          
	}

	private final zzaf zzao;
}
