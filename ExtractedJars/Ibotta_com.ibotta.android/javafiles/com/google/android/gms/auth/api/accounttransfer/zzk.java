// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.accounttransfer;


// Referenced classes of package com.google.android.gms.auth.api.accounttransfer:
//			zzj, DeviceMetaData

final class zzk extends AccountTransferClient.zzd
{

	zzk(zzj zzj, AccountTransferClient.zze zze)
	{
		zzbd = zzj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #11  <Field zzj zzbd>
		super(zze);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #14  <Method void AccountTransferClient$zzd(AccountTransferClient$zze)>
	//    6   10:return          
	}

	public final void zzd(DeviceMetaData devicemetadata)
	{
		((AccountTransferClient.zze) (zzbd)).setResult(((Object) (devicemetadata)));
	//    0    0:aload_0         
	//    1    1:getfield        #11  <Field zzj zzbd>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #23  <Method void AccountTransferClient$zze.setResult(Object)>
	//    4    8:return          
	}

	private final zzj zzbd;
}
