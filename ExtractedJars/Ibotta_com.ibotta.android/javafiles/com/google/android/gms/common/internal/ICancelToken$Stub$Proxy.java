// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.stable.zza;

// Referenced classes of package com.google.android.gms.common.internal:
//			ICancelToken

public static class ICancelToken$Stub$Proxy extends zza
	implements ICancelToken
{

	public void cancel()
		throws RemoteException
	{
		((zza)this).transactOneway(2, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #26  <Method android.os.Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #30  <Method void zza.transactOneway(int, android.os.Parcel)>
	//    5    9:return          
	}

	ICancelToken$Stub$Proxy(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.common.internal.ICancelToken");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #14  <String "com.google.android.gms.common.internal.ICancelToken">
	//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
	//    4    7:return          
	}
}
