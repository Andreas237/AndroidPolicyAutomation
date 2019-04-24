// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzro

public final class zzrq extends zzej
	implements zzro
{

	zzrq(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final void onUnconfirmedClickCancelled()
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

	public final void onUnconfirmedClickReceived(String s)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		parcel.writeString(s);
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #34  <Method void Parcel.writeString(String)>
		((zzej)this).transactAndReadExceptionReturnVoid(1, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #26  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   16:return          
	}
}
