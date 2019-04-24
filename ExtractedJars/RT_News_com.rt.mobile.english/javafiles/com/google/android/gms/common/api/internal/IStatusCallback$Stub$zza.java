// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzc;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			IStatusCallback

public static final class IStatusCallback$Stub$zza extends zza
	implements IStatusCallback
{

	public final void onResult(Status status)
		throws RemoteException
	{
		android.os.Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method android.os.Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(parcel, ((android.os.Parcelable) (status)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #31  <Method void zzc.zza(android.os.Parcel, android.os.Parcelable)>
		((zza)this).transactOneway(1, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #35  <Method void zza.transactOneway(int, android.os.Parcel)>
	//   10   16:return          
	}

	IStatusCallback$Stub$zza(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.common.api.internal.IStatusCallback");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #14  <String "com.google.android.gms.common.api.internal.IStatusCallback">
	//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
	//    4    7:return          
	}
}
