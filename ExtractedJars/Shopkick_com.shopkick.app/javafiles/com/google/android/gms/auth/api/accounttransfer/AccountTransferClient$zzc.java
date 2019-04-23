// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.internal.auth.zzy;

// Referenced classes of package com.google.android.gms.auth.api.accounttransfer:
//			AccountTransferClient, zzk, zzc

private static abstract class AccountTransferClient$zzc extends AccountTransferClient$zzb
{

	zzy zzax;

	private AccountTransferClient$zzc()
	{
		super(((zzc) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #15  <Method void AccountTransferClient$zzb(zzc)>
		zzax = ((zzy) (new zzk(this)));
	//    3    5:aload_0         
	//    4    6:new             #17  <Class zzk>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #20  <Method void zzk(AccountTransferClient$zzc)>
	//    8   14:putfield        #22  <Field zzy zzax>
	//    9   17:return          
	}

	AccountTransferClient$zzc(zzc zzc1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void AccountTransferClient$zzc()>
	//    2    4:return          
	}
}
