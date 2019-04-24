// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamic;

import android.os.IBinder;

// Referenced classes of package com.google.android.gms.dynamic:
//			zzd

private static class zzd$zza$zza
	implements zzd
{

	public IBinder asBinder()
	{
		return zzrp;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrp>
	//    2    4:areturn         
	}

	private IBinder zzrp;

	zzd$zza$zza(IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		zzrp = ibinder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field IBinder zzrp>
	//    5    9:return          
	}
}
