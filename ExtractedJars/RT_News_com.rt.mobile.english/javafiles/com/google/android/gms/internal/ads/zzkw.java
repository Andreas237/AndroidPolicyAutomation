// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzkv, zzel, zzjn, 
//			zzxn

public final class zzkw extends zzej
	implements zzkv
{

	zzkw(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IAdManagerCreator">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final IBinder zza(IObjectWrapper iobjectwrapper, zzjn zzjn, String s, zzxn zzxn, int i, int j)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore          7
		zzel.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    6:aload           7
	//    4    8:aload_1         
	//    5    9:invokestatic    #27  <Method void zzel.zza(Parcel, android.os.IInterface)>
		zzel.zza(parcel, ((android.os.Parcelable) (zzjn)));
	//    6   12:aload           7
	//    7   14:aload_2         
	//    8   15:invokestatic    #30  <Method void zzel.zza(Parcel, android.os.Parcelable)>
		parcel.writeString(s);
	//    9   18:aload           7
	//   10   20:aload_3         
	//   11   21:invokevirtual   #36  <Method void Parcel.writeString(String)>
		zzel.zza(parcel, ((android.os.IInterface) (zzxn)));
	//   12   24:aload           7
	//   13   26:aload           4
	//   14   28:invokestatic    #27  <Method void zzel.zza(Parcel, android.os.IInterface)>
		parcel.writeInt(0xbdfcb8);
	//   15   31:aload           7
	//   16   33:ldc1            #37  <Int 0xbdfcb8>
	//   17   35:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		parcel.writeInt(j);
	//   18   38:aload           7
	//   19   40:iload           6
	//   20   42:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		iobjectwrapper = ((IObjectWrapper) (((zzej)this).transactAndReadException(2, parcel)));
	//   21   45:aload_0         
	//   22   46:iconst_2        
	//   23   47:aload           7
	//   24   49:invokevirtual   #45  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   25   52:astore_1        
		zzjn = ((zzjn) (((Parcel) (iobjectwrapper)).readStrongBinder()));
	//   26   53:aload_1         
	//   27   54:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
	//   28   57:astore_2        
		((Parcel) (iobjectwrapper)).recycle();
	//   29   58:aload_1         
	//   30   59:invokevirtual   #53  <Method void Parcel.recycle()>
		return ((IBinder) (zzjn));
	//   31   62:aload_2         
	//   32   63:areturn         
	}
}
