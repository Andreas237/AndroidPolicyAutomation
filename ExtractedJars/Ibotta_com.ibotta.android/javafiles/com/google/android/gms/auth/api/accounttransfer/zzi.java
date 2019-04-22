// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.accounttransfer;


// Referenced classes of package com.google.android.gms.auth.api.accounttransfer:
//			zzh

final class zzi extends AccountTransferClient.zzd
{

	zzi(zzh zzh, AccountTransferClient.zze zze)
	{
		zzbb = zzh;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #11  <Field zzh zzbb>
		super(zze);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #14  <Method void AccountTransferClient$zzd(AccountTransferClient$zze)>
	//    6   10:return          
	}

	public final void zzd(byte abyte0[])
	{
		((AccountTransferClient.zze) (zzbb)).setResult(((Object) (abyte0)));
	//    0    0:aload_0         
	//    1    1:getfield        #11  <Field zzh zzbb>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #23  <Method void AccountTransferClient$zze.setResult(Object)>
	//    4    8:return          
	}

	private final zzh zzbb;
}
