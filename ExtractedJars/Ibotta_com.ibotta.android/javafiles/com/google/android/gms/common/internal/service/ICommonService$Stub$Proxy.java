// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzc;

// Referenced classes of package com.google.android.gms.common.internal.service:
//			ICommonService, ICommonCallbacks

public static class ICommonService$Stub$Proxy extends zza
	implements ICommonService
{

	public void clearDefaultAccount(ICommonCallbacks icommoncallbacks)
		throws RemoteException
	{
		android.os.Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method android.os.Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(parcel, ((android.os.IInterface) (icommoncallbacks)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #32  <Method void zzc.zza(android.os.Parcel, android.os.IInterface)>
		((zza)this).transactOneway(1, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #36  <Method void zza.transactOneway(int, android.os.Parcel)>
	//   10   16:return          
	}

	ICommonService$Stub$Proxy(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.common.internal.service.ICommonService");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #14  <String "com.google.android.gms.common.internal.service.ICommonService">
	//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
	//    4    7:return          
	}
}
