// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzlg

public final class zzli extends zzej
	implements zzlg
{

	zzli(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.client.ICorrelationIdProvider">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final long getValue()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(1, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5    9:astore_3        
		long l = parcel.readLong();
	//    6   10:aload_3         
	//    7   11:invokevirtual   #31  <Method long Parcel.readLong()>
	//    8   14:lstore_1        
		parcel.recycle();
	//    9   15:aload_3         
	//   10   16:invokevirtual   #35  <Method void Parcel.recycle()>
		return l;
	//   11   19:lload_1         
	//   12   20:lreturn         
	}
}
