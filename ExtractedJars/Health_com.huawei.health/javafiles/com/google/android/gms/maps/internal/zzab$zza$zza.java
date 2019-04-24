// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

// Referenced classes of package com.google.android.gms.maps.internal:
//			zzab

static class zzab$zza$zza
	implements zzab
{

	public IBinder asBinder()
	{
		return zzrk;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrk>
	//    2    4:areturn         
	}

	public void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetviewpanoramacamera)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		if(streetviewpanoramacamera == null)
			break MISSING_BLOCK_LABEL_32;
	//    7   14:aload_1         
	//    8   15:ifnull          32
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		streetviewpanoramacamera.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #47  <Method void StreetViewPanoramaCamera.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_37;
	//   16   29:goto            37
		parcel.writeInt(0);
	//   17   32:aload_2         
	//   18   33:iconst_0        
	//   19   34:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		zzrk.transact(1, parcel, parcel1, 0);
	//   20   37:aload_0         
	//   21   38:getfield        #18  <Field IBinder zzrk>
	//   22   41:iconst_1        
	//   23   42:aload_2         
	//   24   43:aload_3         
	//   25   44:iconst_0        
	//   26   45:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   50:pop             
		parcel1.readException();
	//   28   51:aload_3         
	//   29   52:invokevirtual   #56  <Method void Parcel.readException()>
		parcel1.recycle();
	//   30   55:aload_3         
	//   31   56:invokevirtual   #59  <Method void Parcel.recycle()>
		parcel.recycle();
	//   32   59:aload_2         
	//   33   60:invokevirtual   #59  <Method void Parcel.recycle()>
		return;
	//   34   63:return          
		streetviewpanoramacamera;
	//   35   64:astore_1        
		parcel1.recycle();
	//   36   65:aload_3         
	//   37   66:invokevirtual   #59  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   69:aload_2         
	//   39   70:invokevirtual   #59  <Method void Parcel.recycle()>
		throw streetviewpanoramacamera;
	//   40   73:aload_1         
	//   41   74:athrow          
	}

	private IBinder zzrk;

	zzab$zza$zza(IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		zzrk = ibinder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field IBinder zzrk>
	//    5    9:return          
	}
}
