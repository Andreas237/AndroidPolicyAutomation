// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzahc, zzel, zzxn

public final class zzahd extends zzej
	implements zzahc
{

	zzahd(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final IBinder zza(IObjectWrapper iobjectwrapper, zzxn zzxn, int i)
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
		zzel.zza(parcel, ((android.os.IInterface) (zzxn)));
	//    6   12:aload           4
	//    7   14:aload_2         
	//    8   15:invokestatic    #27  <Method void zzel.zza(Parcel, android.os.IInterface)>
		parcel.writeInt(0xbdfcb8);
	//    9   18:aload           4
	//   10   20:ldc1            #28  <Int 0xbdfcb8>
	//   11   22:invokevirtual   #34  <Method void Parcel.writeInt(int)>
		iobjectwrapper = ((IObjectWrapper) (((zzej)this).transactAndReadException(1, parcel)));
	//   12   25:aload_0         
	//   13   26:iconst_1        
	//   14   27:aload           4
	//   15   29:invokevirtual   #38  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   16   32:astore_1        
		zzxn = ((zzxn) (((Parcel) (iobjectwrapper)).readStrongBinder()));
	//   17   33:aload_1         
	//   18   34:invokevirtual   #42  <Method IBinder Parcel.readStrongBinder()>
	//   19   37:astore_2        
		((Parcel) (iobjectwrapper)).recycle();
	//   20   38:aload_1         
	//   21   39:invokevirtual   #46  <Method void Parcel.recycle()>
		return ((IBinder) (zzxn));
	//   22   42:aload_2         
	//   23   43:areturn         
	}
}
