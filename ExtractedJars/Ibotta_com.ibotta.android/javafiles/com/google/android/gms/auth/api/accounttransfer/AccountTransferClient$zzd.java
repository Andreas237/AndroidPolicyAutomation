// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzv;

// Referenced classes of package com.google.android.gms.auth.api.accounttransfer:
//			AccountTransferClient

private static class AccountTransferClient$zzd extends zzv
{

	public final void onFailure(Status status)
	{
		zzbg.zzd(status);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field AccountTransferClient$zze zzbg>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #27  <Method void AccountTransferClient$zze.zzd(Status)>
	//    4    8:return          
	}

	private AccountTransferClient$zze zzbg;

	public AccountTransferClient$zzd(AccountTransferClient$zze accounttransferclient$zze)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void zzv()>
		zzbg = accounttransferclient$zze;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field AccountTransferClient$zze zzbg>
	//    5    9:return          
	}
}
