// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzkk, zzel, zzjj

public final class zzkm extends zzej
	implements zzkk
{

	zzkm(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.client.IAdLoader");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IAdLoader">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final String getMediationAdapterClassName()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(2, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5    9:astore_1        
		String s = parcel.readString();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #31  <Method String Parcel.readString()>
	//    8   14:astore_2        
		parcel.recycle();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #35  <Method void Parcel.recycle()>
		return s;
	//   11   19:aload_2         
	//   12   20:areturn         
	}

	public final boolean isLoading()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(3, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5    9:astore_2        
		boolean flag = zzel.zza(parcel);
	//    6   10:aload_2         
	//    7   11:invokestatic    #44  <Method boolean zzel.zza(Parcel)>
	//    8   14:istore_1        
		parcel.recycle();
	//    9   15:aload_2         
	//   10   16:invokevirtual   #35  <Method void Parcel.recycle()>
		return flag;
	//   11   19:iload_1         
	//   12   20:ireturn         
	}

	public final void zza(zzjj zzjj, int i)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_3        
		zzel.zza(parcel, ((android.os.Parcelable) (zzjj)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #48  <Method void zzel.zza(Parcel, android.os.Parcelable)>
		parcel.writeInt(i);
	//    6   10:aload_3         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #52  <Method void Parcel.writeInt(int)>
		((zzej)this).transactAndReadExceptionReturnVoid(5, parcel);
	//    9   15:aload_0         
	//   10   16:iconst_5        
	//   11   17:aload_3         
	//   12   18:invokevirtual   #56  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   13   21:return          
	}

	public final String zzck()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(4, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5    9:astore_1        
		String s = parcel.readString();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #31  <Method String Parcel.readString()>
	//    8   14:astore_2        
		parcel.recycle();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #35  <Method void Parcel.recycle()>
		return s;
	//   11   19:aload_2         
	//   12   20:areturn         
	}

	public final void zzd(zzjj zzjj)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, ((android.os.Parcelable) (zzjj)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #48  <Method void zzel.zza(Parcel, android.os.Parcelable)>
		((zzej)this).transactAndReadExceptionReturnVoid(1, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #56  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   16:return          
	}
}
