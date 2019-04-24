// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzri, zzel, zzks

public final class zzrk extends zzej
	implements zzri
{

	zzrk(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final void zza(zzks zzks, IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		android.os.Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method android.os.Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_3        
		zzel.zza(parcel, ((android.os.IInterface) (zzks)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #27  <Method void zzel.zza(android.os.Parcel, android.os.IInterface)>
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokestatic    #27  <Method void zzel.zza(android.os.Parcel, android.os.IInterface)>
		((zzej)this).transactAndReadExceptionReturnVoid(1, parcel);
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:aload_3         
	//   12   18:invokevirtual   #31  <Method void zzej.transactAndReadExceptionReturnVoid(int, android.os.Parcel)>
	//   13   21:return          
	}
}
