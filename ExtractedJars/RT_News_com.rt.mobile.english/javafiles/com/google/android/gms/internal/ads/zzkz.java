// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzkx

public final class zzkz extends zzej
	implements zzkx
{

	zzkz(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.client.IAdMetadataListener");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IAdMetadataListener">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final void zzt()
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
