// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzahe, zzel, zzagu

public final class zzahg extends zzej
	implements zzahe
{

	zzahg(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final void onRewardedVideoAdClosed()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(4, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5    9:return          
	}

	public final void onRewardedVideoAdFailedToLoad(int i)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		parcel.writeInt(i);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #34  <Method void Parcel.writeInt(int)>
		((zzej)this).transactAndReadExceptionReturnVoid(7, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          7
	//    8   13:aload_2         
	//    9   14:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public final void onRewardedVideoAdLeftApplication()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(6, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5   10:return          
	}

	public final void onRewardedVideoAdLoaded()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(1, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5    9:return          
	}

	public final void onRewardedVideoAdOpened()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(2, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5    9:return          
	}

	public final void onRewardedVideoCompleted()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(8, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5   10:return          
	}

	public final void onRewardedVideoStarted()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(3, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5    9:return          
	}

	public final void zza(zzagu zzagu)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, ((android.os.IInterface) (zzagu)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #46  <Method void zzel.zza(Parcel, android.os.IInterface)>
		((zzej)this).transactAndReadExceptionReturnVoid(5, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_5        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   16:return          
	}
}
