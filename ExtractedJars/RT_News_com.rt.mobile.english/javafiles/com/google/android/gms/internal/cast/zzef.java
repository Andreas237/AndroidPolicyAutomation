// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.app.PendingIntent;
import android.os.*;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zza, zzee, zzc, zzec, 
//			zzeg

public final class zzef extends zza
	implements zzee
{

	zzef(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService">
	//    3    4:invokespecial   #13  <Method void zza(IBinder, String)>
	//    4    7:return          
	}

	public final void disconnect()
		throws RemoteException
	{
		((zza)this).transactOneway(3, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method void zza.transactOneway(int, Parcel)>
	//    5    9:return          
	}

	public final void zza(zzec zzec)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(parcel, ((android.os.IInterface) (zzec)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #34  <Method void zzc.zza(Parcel, android.os.IInterface)>
		((zza)this).transactOneway(6, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          6
	//    8   13:aload_2         
	//    9   14:invokevirtual   #26  <Method void zza.transactOneway(int, Parcel)>
	//   10   17:return          
	}

	public final void zza(zzec zzec, int i)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_3        
		zzc.zza(parcel, ((android.os.IInterface) (zzec)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #34  <Method void zzc.zza(Parcel, android.os.IInterface)>
		parcel.writeInt(i);
	//    6   10:aload_3         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		((zza)this).transactOneway(5, parcel);
	//    9   15:aload_0         
	//   10   16:iconst_5        
	//   11   17:aload_3         
	//   12   18:invokevirtual   #26  <Method void zza.transactOneway(int, Parcel)>
	//   13   21:return          
	}

	public final void zza(zzec zzec, PendingIntent pendingintent, String s, String s1, Bundle bundle)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore          6
		zzc.zza(parcel, ((android.os.IInterface) (zzec)));
	//    3    6:aload           6
	//    4    8:aload_1         
	//    5    9:invokestatic    #34  <Method void zzc.zza(Parcel, android.os.IInterface)>
		zzc.zza(parcel, ((android.os.Parcelable) (pendingintent)));
	//    6   12:aload           6
	//    7   14:aload_2         
	//    8   15:invokestatic    #45  <Method void zzc.zza(Parcel, android.os.Parcelable)>
		parcel.writeString(s);
	//    9   18:aload           6
	//   10   20:aload_3         
	//   11   21:invokevirtual   #49  <Method void Parcel.writeString(String)>
		parcel.writeString(s1);
	//   12   24:aload           6
	//   13   26:aload           4
	//   14   28:invokevirtual   #49  <Method void Parcel.writeString(String)>
		zzc.zza(parcel, ((android.os.Parcelable) (bundle)));
	//   15   31:aload           6
	//   16   33:aload           5
	//   17   35:invokestatic    #45  <Method void zzc.zza(Parcel, android.os.Parcelable)>
		((zza)this).transactOneway(8, parcel);
	//   18   38:aload_0         
	//   19   39:bipush          8
	//   20   41:aload           6
	//   21   43:invokevirtual   #26  <Method void zza.transactOneway(int, Parcel)>
	//   22   46:return          
	}

	public final void zza(zzec zzec, zzeg zzeg, String s, String s1, Bundle bundle)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore          6
		zzc.zza(parcel, ((android.os.IInterface) (zzec)));
	//    3    6:aload           6
	//    4    8:aload_1         
	//    5    9:invokestatic    #34  <Method void zzc.zza(Parcel, android.os.IInterface)>
		zzc.zza(parcel, ((android.os.IInterface) (zzeg)));
	//    6   12:aload           6
	//    7   14:aload_2         
	//    8   15:invokestatic    #34  <Method void zzc.zza(Parcel, android.os.IInterface)>
		parcel.writeString(s);
	//    9   18:aload           6
	//   10   20:aload_3         
	//   11   21:invokevirtual   #49  <Method void Parcel.writeString(String)>
		parcel.writeString(s1);
	//   12   24:aload           6
	//   13   26:aload           4
	//   14   28:invokevirtual   #49  <Method void Parcel.writeString(String)>
		zzc.zza(parcel, ((android.os.Parcelable) (bundle)));
	//   15   31:aload           6
	//   16   33:aload           5
	//   17   35:invokestatic    #45  <Method void zzc.zza(Parcel, android.os.Parcelable)>
		((zza)this).transactOneway(7, parcel);
	//   18   38:aload_0         
	//   19   39:bipush          7
	//   20   41:aload           6
	//   21   43:invokevirtual   #26  <Method void zza.transactOneway(int, Parcel)>
	//   22   46:return          
	}
}
