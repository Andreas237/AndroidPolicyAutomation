// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzqi, zzel

public final class zzqj extends zzej
	implements zzqi
{

	zzqj(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final IBinder zza(IObjectWrapper iobjectwrapper, IObjectWrapper iobjectwrapper1, IObjectWrapper iobjectwrapper2)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore          4
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:invokestatic    #27  <Method void zzel.zza(Parcel, android.os.IInterface)>
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper1)));
	//    6   12:aload           4
	//    7   14:aload_2         
	//    8   15:invokestatic    #27  <Method void zzel.zza(Parcel, android.os.IInterface)>
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper2)));
	//    9   18:aload           4
	//   10   20:aload_3         
	//   11   21:invokestatic    #27  <Method void zzel.zza(Parcel, android.os.IInterface)>
		iobjectwrapper = ((IObjectWrapper) (((zzej)this).transactAndReadException(1, parcel)));
	//   12   24:aload_0         
	//   13   25:iconst_1        
	//   14   26:aload           4
	//   15   28:invokevirtual   #31  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   16   31:astore_1        
		iobjectwrapper1 = ((IObjectWrapper) (((Parcel) (iobjectwrapper)).readStrongBinder()));
	//   17   32:aload_1         
	//   18   33:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//   19   36:astore_2        
		((Parcel) (iobjectwrapper)).recycle();
	//   20   37:aload_1         
	//   21   38:invokevirtual   #41  <Method void Parcel.recycle()>
		return ((IBinder) (iobjectwrapper1));
	//   22   41:aload_2         
	//   23   42:areturn         
	}
}
