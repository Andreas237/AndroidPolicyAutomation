// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzqd, zzel

public final class zzqe extends zzej
	implements zzqd
{

	zzqe(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final IBinder zza(IObjectWrapper iobjectwrapper, IObjectWrapper iobjectwrapper1, IObjectWrapper iobjectwrapper2, int i)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore          5
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    6:aload           5
	//    4    8:aload_1         
	//    5    9:invokestatic    #27  <Method void zzel.zza(Parcel, android.os.IInterface)>
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper1)));
	//    6   12:aload           5
	//    7   14:aload_2         
	//    8   15:invokestatic    #27  <Method void zzel.zza(Parcel, android.os.IInterface)>
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper2)));
	//    9   18:aload           5
	//   10   20:aload_3         
	//   11   21:invokestatic    #27  <Method void zzel.zza(Parcel, android.os.IInterface)>
		parcel.writeInt(0xbdfcb8);
	//   12   24:aload           5
	//   13   26:ldc1            #28  <Int 0xbdfcb8>
	//   14   28:invokevirtual   #34  <Method void Parcel.writeInt(int)>
		iobjectwrapper = ((IObjectWrapper) (((zzej)this).transactAndReadException(1, parcel)));
	//   15   31:aload_0         
	//   16   32:iconst_1        
	//   17   33:aload           5
	//   18   35:invokevirtual   #38  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   19   38:astore_1        
		iobjectwrapper1 = ((IObjectWrapper) (((Parcel) (iobjectwrapper)).readStrongBinder()));
	//   20   39:aload_1         
	//   21   40:invokevirtual   #42  <Method IBinder Parcel.readStrongBinder()>
	//   22   43:astore_2        
		((Parcel) (iobjectwrapper)).recycle();
	//   23   44:aload_1         
	//   24   45:invokevirtual   #46  <Method void Parcel.recycle()>
		return ((IBinder) (iobjectwrapper1));
	//   25   48:aload_2         
	//   26   49:areturn         
	}
}
