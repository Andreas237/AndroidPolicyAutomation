// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zza;

// Referenced classes of package com.google.android.gms.common.internal:
//			ICancelToken

public static final class ICancelToken$Stub$zza extends zza
	implements ICancelToken
{

	public final void cancel()
		throws RemoteException
	{
		((zza)this).zzc(2, ((zza)this).zza());
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #25  <Method android.os.Parcel zza.zza()>
	//    4    6:invokevirtual   #29  <Method void zza.zzc(int, android.os.Parcel)>
	//    5    9:return          
	}

	ICancelToken$Stub$zza(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.common.internal.ICancelToken");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #14  <String "com.google.android.gms.common.internal.ICancelToken">
	//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
	//    4    7:return          
	}
}
