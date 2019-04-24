// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzrf, zzel, zzqs

public final class zzrh extends zzej
	implements zzrf
{

	zzrh(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final void zzb(zzqs zzqs)
		throws RemoteException
	{
		android.os.Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method android.os.Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, ((android.os.IInterface) (zzqs)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #28  <Method void zzel.zza(android.os.Parcel, android.os.IInterface)>
		((zzej)this).transactAndReadExceptionReturnVoid(1, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #32  <Method void zzej.transactAndReadExceptionReturnVoid(int, android.os.Parcel)>
	//   10   16:return          
	}
}
