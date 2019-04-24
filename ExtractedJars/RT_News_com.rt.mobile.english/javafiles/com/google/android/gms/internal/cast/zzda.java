// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.os.*;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.zzaf;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zza, zzcz, zzc

public final class zzda extends zza
	implements zzcz
{

	zzda(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.cast.internal.ICastDeviceController");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.cast.internal.ICastDeviceController">
	//    3    4:invokespecial   #13  <Method void zza(IBinder, String)>
	//    4    7:return          
	}

	public final void disconnect()
		throws RemoteException
	{
		((zza)this).transactOneway(1, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method void zza.transactOneway(int, Parcel)>
	//    5    9:return          
	}

	public final void requestStatus()
		throws RemoteException
	{
		((zza)this).transactOneway(6, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method void zza.transactOneway(int, Parcel)>
	//    5   10:return          
	}

	public final void zza(double d, double d1, boolean flag)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore          6
		parcel.writeDouble(d);
	//    3    6:aload           6
	//    4    8:dload_1         
	//    5    9:invokevirtual   #36  <Method void Parcel.writeDouble(double)>
		parcel.writeDouble(d1);
	//    6   12:aload           6
	//    7   14:dload_3         
	//    8   15:invokevirtual   #36  <Method void Parcel.writeDouble(double)>
		zzc.zza(parcel, flag);
	//    9   18:aload           6
	//   10   20:iload           5
	//   11   22:invokestatic    #41  <Method void zzc.zza(Parcel, boolean)>
		((zza)this).transactOneway(7, parcel);
	//   12   25:aload_0         
	//   13   26:bipush          7
	//   14   28:aload           6
	//   15   30:invokevirtual   #26  <Method void zza.transactOneway(int, Parcel)>
	//   16   33:return          
	}

	public final void zza(String s, String s1, long l)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore          5
		parcel.writeString(s);
	//    3    6:aload           5
	//    4    8:aload_1         
	//    5    9:invokevirtual   #46  <Method void Parcel.writeString(String)>
		parcel.writeString(s1);
	//    6   12:aload           5
	//    7   14:aload_2         
	//    8   15:invokevirtual   #46  <Method void Parcel.writeString(String)>
		parcel.writeLong(l);
	//    9   18:aload           5
	//   10   20:lload_3         
	//   11   21:invokevirtual   #50  <Method void Parcel.writeLong(long)>
		((zza)this).transactOneway(9, parcel);
	//   12   24:aload_0         
	//   13   25:bipush          9
	//   14   27:aload           5
	//   15   29:invokevirtual   #26  <Method void zza.transactOneway(int, Parcel)>
	//   16   32:return          
	}

	public final void zza(String s, String s1, zzaf zzaf)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore          4
		parcel.writeString(s);
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:invokevirtual   #46  <Method void Parcel.writeString(String)>
		parcel.writeString(s1);
	//    6   12:aload           4
	//    7   14:aload_2         
	//    8   15:invokevirtual   #46  <Method void Parcel.writeString(String)>
		zzc.zza(parcel, ((android.os.Parcelable) (zzaf)));
	//    9   18:aload           4
	//   10   20:aload_3         
	//   11   21:invokestatic    #54  <Method void zzc.zza(Parcel, android.os.Parcelable)>
		((zza)this).transactOneway(14, parcel);
	//   12   24:aload_0         
	//   13   25:bipush          14
	//   14   27:aload           4
	//   15   29:invokevirtual   #26  <Method void zza.transactOneway(int, Parcel)>
	//   16   32:return          
	}

	public final void zza(boolean flag, double d, boolean flag1)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore          5
		zzc.zza(parcel, flag);
	//    3    6:aload           5
	//    4    8:iload_1         
	//    5    9:invokestatic    #41  <Method void zzc.zza(Parcel, boolean)>
		parcel.writeDouble(d);
	//    6   12:aload           5
	//    7   14:dload_2         
	//    8   15:invokevirtual   #36  <Method void Parcel.writeDouble(double)>
		zzc.zza(parcel, flag1);
	//    9   18:aload           5
	//   10   20:iload           4
	//   11   22:invokestatic    #41  <Method void zzc.zza(Parcel, boolean)>
		((zza)this).transactOneway(8, parcel);
	//   12   25:aload_0         
	//   13   26:bipush          8
	//   14   28:aload           5
	//   15   30:invokevirtual   #26  <Method void zza.transactOneway(int, Parcel)>
	//   16   33:return          
	}

	public final void zzb(String s, LaunchOptions launchoptions)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_3        
		parcel.writeString(s);
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #46  <Method void Parcel.writeString(String)>
		zzc.zza(parcel, ((android.os.Parcelable) (launchoptions)));
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokestatic    #54  <Method void zzc.zza(Parcel, android.os.Parcelable)>
		((zza)this).transactOneway(13, parcel);
	//    9   15:aload_0         
	//   10   16:bipush          13
	//   11   18:aload_3         
	//   12   19:invokevirtual   #26  <Method void zza.transactOneway(int, Parcel)>
	//   13   22:return          
	}

	public final void zzcx()
		throws RemoteException
	{
		((zza)this).transactOneway(4, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method void zza.transactOneway(int, Parcel)>
	//    5    9:return          
	}

	public final void zzi(String s)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		parcel.writeString(s);
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #46  <Method void Parcel.writeString(String)>
		((zza)this).transactOneway(5, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_5        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #26  <Method void zza.transactOneway(int, Parcel)>
	//   10   16:return          
	}

	public final void zzr(String s)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		parcel.writeString(s);
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #46  <Method void Parcel.writeString(String)>
		((zza)this).transactOneway(11, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          11
	//    8   13:aload_2         
	//    9   14:invokevirtual   #26  <Method void zza.transactOneway(int, Parcel)>
	//   10   17:return          
	}

	public final void zzs(String s)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		parcel.writeString(s);
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #46  <Method void Parcel.writeString(String)>
		((zza)this).transactOneway(12, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          12
	//    8   13:aload_2         
	//    9   14:invokevirtual   #26  <Method void zza.transactOneway(int, Parcel)>
	//   10   17:return          
	}
}
