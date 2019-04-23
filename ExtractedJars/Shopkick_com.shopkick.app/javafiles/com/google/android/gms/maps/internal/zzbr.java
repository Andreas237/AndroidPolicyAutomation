// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

// Referenced classes of package com.google.android.gms.maps.internal:
//			IProjectionDelegate

public final class zzbr extends zza
	implements IProjectionDelegate
{

	zzbr(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.maps.internal.IProjectionDelegate">
	//    3    4:invokespecial   #13  <Method void zza(IBinder, String)>
	//    4    7:return          
	}

	public final LatLng fromScreenLocation(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		Object obj = ((Object) (((zza)this).obtainAndWriteInterfaceToken()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(((Parcel) (obj)), ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #28  <Method void zzc.zza(Parcel, android.os.IInterface)>
		iobjectwrapper = ((IObjectWrapper) (((zza)this).transactAndReadException(1, ((Parcel) (obj)))));
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #32  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//   10   16:astore_1        
		obj = ((Object) ((LatLng)zzc.zza(((Parcel) (iobjectwrapper)), LatLng.CREATOR)));
	//   11   17:aload_1         
	//   12   18:getstatic       #38  <Field android.os.Parcelable$Creator LatLng.CREATOR>
	//   13   21:invokestatic    #41  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
	//   14   24:checkcast       #34  <Class LatLng>
	//   15   27:astore_2        
		((Parcel) (iobjectwrapper)).recycle();
	//   16   28:aload_1         
	//   17   29:invokevirtual   #47  <Method void Parcel.recycle()>
		return ((LatLng) (obj));
	//   18   32:aload_2         
	//   19   33:areturn         
	}

	public final VisibleRegion getVisibleRegion()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(3, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #32  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5    9:astore_1        
		VisibleRegion visibleregion = (VisibleRegion)zzc.zza(parcel, VisibleRegion.CREATOR);
	//    6   10:aload_1         
	//    7   11:getstatic       #53  <Field android.os.Parcelable$Creator VisibleRegion.CREATOR>
	//    8   14:invokestatic    #41  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
	//    9   17:checkcast       #52  <Class VisibleRegion>
	//   10   20:astore_2        
		parcel.recycle();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #47  <Method void Parcel.recycle()>
		return visibleregion;
	//   13   25:aload_2         
	//   14   26:areturn         
	}

	public final IObjectWrapper toScreenLocation(LatLng latlng)
		throws RemoteException
	{
		Object obj = ((Object) (((zza)this).obtainAndWriteInterfaceToken()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(((Parcel) (obj)), ((android.os.Parcelable) (latlng)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #58  <Method void zzc.zza(Parcel, android.os.Parcelable)>
		latlng = ((LatLng) (((zza)this).transactAndReadException(2, ((Parcel) (obj)))));
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #32  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//   10   16:astore_1        
		obj = ((Object) (com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(((Parcel) (latlng)).readStrongBinder())));
	//   11   17:aload_1         
	//   12   18:invokevirtual   #62  <Method IBinder Parcel.readStrongBinder()>
	//   13   21:invokestatic    #68  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   14   24:astore_2        
		((Parcel) (latlng)).recycle();
	//   15   25:aload_1         
	//   16   26:invokevirtual   #47  <Method void Parcel.recycle()>
		return ((IObjectWrapper) (obj));
	//   17   29:aload_2         
	//   18   30:areturn         
	}
}
