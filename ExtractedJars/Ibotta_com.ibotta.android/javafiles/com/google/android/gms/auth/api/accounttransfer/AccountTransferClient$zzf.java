// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.internal.auth.zzab;

// Referenced classes of package com.google.android.gms.auth.api.accounttransfer:
//			AccountTransferClient, zzn, zzf

private static abstract class AccountTransferClient$zzf extends AccountTransferClient$zze
{

	zzab zzbi;

	private AccountTransferClient$zzf()
	{
		super(((zzf) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #15  <Method void AccountTransferClient$zze(zzf)>
		zzbi = ((zzab) (new zzn(this)));
	//    3    5:aload_0         
	//    4    6:new             #17  <Class zzn>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #20  <Method void zzn(AccountTransferClient$zzf)>
	//    8   14:putfield        #22  <Field zzab zzbi>
	//    9   17:return          
	}

	AccountTransferClient$zzf(zzf zzf1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void AccountTransferClient$zzf()>
	//    2    4:return          
	}
}
