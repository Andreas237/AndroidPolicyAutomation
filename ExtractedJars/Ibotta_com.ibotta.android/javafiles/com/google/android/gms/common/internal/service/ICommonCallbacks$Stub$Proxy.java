// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal.service;

import android.os.*;
import com.google.android.gms.internal.stable.zza;

// Referenced classes of package com.google.android.gms.common.internal.service:
//			ICommonCallbacks

public static class ICommonCallbacks$Stub$Proxy extends zza
	implements ICommonCallbacks
{

	public void onDefaultAccountCleared(int i)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		parcel.writeInt(i);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #31  <Method void Parcel.writeInt(int)>
		((zza)this).transactAndReadExceptionReturnVoid(1, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #35  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   16:return          
	}

	ICommonCallbacks$Stub$Proxy(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.common.internal.service.ICommonCallbacks");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #14  <String "com.google.android.gms.common.internal.service.ICommonCallbacks">
	//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
	//    4    7:return          
	}
}
