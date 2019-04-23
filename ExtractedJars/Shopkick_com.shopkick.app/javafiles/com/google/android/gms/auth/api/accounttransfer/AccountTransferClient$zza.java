// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzs;

// Referenced classes of package com.google.android.gms.auth.api.accounttransfer:
//			AccountTransferClient

private static class AccountTransferClient$zza extends zzs
{

	public final void onFailure(Status status)
	{
		zzav.zza(status);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field AccountTransferClient$zzb zzav>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #27  <Method void AccountTransferClient$zzb.zza(Status)>
	//    4    8:return          
	}

	private AccountTransferClient$zzb zzav;

	public AccountTransferClient$zza(AccountTransferClient$zzb accounttransferclient$zzb)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void zzs()>
		zzav = accounttransferclient$zzb;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field AccountTransferClient$zzb zzav>
	//    5    9:return          
	}
}
