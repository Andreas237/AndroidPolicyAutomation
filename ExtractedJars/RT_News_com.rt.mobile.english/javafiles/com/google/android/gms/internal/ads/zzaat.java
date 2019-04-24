// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzaas, zzel

public final class zzaat extends zzej
	implements zzaas
{

	zzaat(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final IBinder zzp(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		Object obj = ((Object) (((zzej)this).obtainAndWriteInterfaceToken()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(((Parcel) (obj)), ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #28  <Method void zzel.zza(Parcel, android.os.IInterface)>
		iobjectwrapper = ((IObjectWrapper) (((zzej)this).transactAndReadException(1, ((Parcel) (obj)))));
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #32  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   10   16:astore_1        
		obj = ((Object) (((Parcel) (iobjectwrapper)).readStrongBinder()));
	//   11   17:aload_1         
	//   12   18:invokevirtual   #38  <Method IBinder Parcel.readStrongBinder()>
	//   13   21:astore_2        
		((Parcel) (iobjectwrapper)).recycle();
	//   14   22:aload_1         
	//   15   23:invokevirtual   #42  <Method void Parcel.recycle()>
		return ((IBinder) (obj));
	//   16   26:aload_2         
	//   17   27:areturn         
	}
}
