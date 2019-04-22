// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.*;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzc;

// Referenced classes of package com.google.android.gms.common.internal:
//			IGmsCallbacks, ConnectionInfo

public static class IGmsCallbacks$Stub$Proxy extends zza
	implements IGmsCallbacks
{

	public void onAccountValidationComplete(int i, Bundle bundle)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_3        
		parcel.writeInt(i);
	//    3    5:aload_3         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #32  <Method void Parcel.writeInt(int)>
		zzc.zza(parcel, ((android.os.Parcelable) (bundle)));
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokestatic    #38  <Method void zzc.zza(Parcel, android.os.Parcelable)>
		((zza)this).transactAndReadExceptionReturnVoid(2, parcel);
	//    9   15:aload_0         
	//   10   16:iconst_2        
	//   11   17:aload_3         
	//   12   18:invokevirtual   #42  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   13   21:return          
	}

	public void onPostInitComplete(int i, IBinder ibinder, Bundle bundle)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore          4
		parcel.writeInt(i);
	//    3    6:aload           4
	//    4    8:iload_1         
	//    5    9:invokevirtual   #32  <Method void Parcel.writeInt(int)>
		parcel.writeStrongBinder(ibinder);
	//    6   12:aload           4
	//    7   14:aload_2         
	//    8   15:invokevirtual   #48  <Method void Parcel.writeStrongBinder(IBinder)>
		zzc.zza(parcel, ((android.os.Parcelable) (bundle)));
	//    9   18:aload           4
	//   10   20:aload_3         
	//   11   21:invokestatic    #38  <Method void zzc.zza(Parcel, android.os.Parcelable)>
		((zza)this).transactAndReadExceptionReturnVoid(1, parcel);
	//   12   24:aload_0         
	//   13   25:iconst_1        
	//   14   26:aload           4
	//   15   28:invokevirtual   #42  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   16   31:return          
	}

	public void onPostInitCompleteWithConnectionInfo(int i, IBinder ibinder, ConnectionInfo connectioninfo)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore          4
		parcel.writeInt(i);
	//    3    6:aload           4
	//    4    8:iload_1         
	//    5    9:invokevirtual   #32  <Method void Parcel.writeInt(int)>
		parcel.writeStrongBinder(ibinder);
	//    6   12:aload           4
	//    7   14:aload_2         
	//    8   15:invokevirtual   #48  <Method void Parcel.writeStrongBinder(IBinder)>
		zzc.zza(parcel, ((android.os.Parcelable) (connectioninfo)));
	//    9   18:aload           4
	//   10   20:aload_3         
	//   11   21:invokestatic    #38  <Method void zzc.zza(Parcel, android.os.Parcelable)>
		((zza)this).transactAndReadExceptionReturnVoid(3, parcel);
	//   12   24:aload_0         
	//   13   25:iconst_3        
	//   14   26:aload           4
	//   15   28:invokevirtual   #42  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   16   31:return          
	}

	IGmsCallbacks$Stub$Proxy(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.common.internal.IGmsCallbacks");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #14  <String "com.google.android.gms.common.internal.IGmsCallbacks">
	//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
	//    4    7:return          
	}
}
