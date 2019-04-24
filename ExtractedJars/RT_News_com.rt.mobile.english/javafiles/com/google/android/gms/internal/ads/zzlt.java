// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzlr, zzel

public final class zzlt extends zzej
	implements zzlr
{

	zzlt(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final void onVideoEnd()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(4, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method android.os.Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, android.os.Parcel)>
	//    5    9:return          
	}

	public final void onVideoMute(boolean flag)
		throws RemoteException
	{
		android.os.Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method android.os.Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, flag);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #35  <Method void zzel.zza(android.os.Parcel, boolean)>
		((zzej)this).transactAndReadExceptionReturnVoid(5, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_5        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, android.os.Parcel)>
	//   10   16:return          
	}

	public final void onVideoPause()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(3, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method android.os.Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, android.os.Parcel)>
	//    5    9:return          
	}

	public final void onVideoPlay()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(2, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method android.os.Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, android.os.Parcel)>
	//    5    9:return          
	}

	public final void onVideoStart()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(1, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method android.os.Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, android.os.Parcel)>
	//    5    9:return          
	}
}
