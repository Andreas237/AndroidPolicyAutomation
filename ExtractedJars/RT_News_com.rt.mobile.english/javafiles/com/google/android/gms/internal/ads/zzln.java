// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzlm, zzel

public final class zzln extends zzej
	implements zzlm
{

	zzln(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final IBinder zza(IObjectWrapper iobjectwrapper, int i)
		throws RemoteException
	{
		Object obj = ((Object) (((zzej)this).obtainAndWriteInterfaceToken()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_3        
		zzel.zza(((Parcel) (obj)), ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #27  <Method void zzel.zza(Parcel, android.os.IInterface)>
		((Parcel) (obj)).writeInt(0xbdfcb8);
	//    6   10:aload_3         
	//    7   11:ldc1            #28  <Int 0xbdfcb8>
	//    8   13:invokevirtual   #34  <Method void Parcel.writeInt(int)>
		iobjectwrapper = ((IObjectWrapper) (((zzej)this).transactAndReadException(1, ((Parcel) (obj)))));
	//    9   16:aload_0         
	//   10   17:iconst_1        
	//   11   18:aload_3         
	//   12   19:invokevirtual   #38  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   13   22:astore_1        
		obj = ((Object) (((Parcel) (iobjectwrapper)).readStrongBinder()));
	//   14   23:aload_1         
	//   15   24:invokevirtual   #42  <Method IBinder Parcel.readStrongBinder()>
	//   16   27:astore_3        
		((Parcel) (iobjectwrapper)).recycle();
	//   17   28:aload_1         
	//   18   29:invokevirtual   #46  <Method void Parcel.recycle()>
		return ((IBinder) (obj));
	//   19   32:aload_3         
	//   20   33:areturn         
	}
}
