// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.google.android.gms.maps.internal:
//			zzs

public static abstract class zzs$zza extends Binder
	implements zzs
{
	static class zza
		implements zzs
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public void onMapLongClick(LatLng latlng)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMapLongClickListener");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IOnMapLongClickListener">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(latlng == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			latlng.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #47  <Method void LatLng.writeToParcel(Parcel, int)>
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
			latlng;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #59  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #59  <Method void Parcel.recycle()>
			throw latlng;
		//   40   73:aload_1         
		//   41   74:athrow          
		}

		private IBinder zzrk;

		zza(IBinder ibinder)
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


	public static zzs zzdN(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLongClickListener");
	//    4    6:aload_0         
	//    5    7:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMapLongClickListener">
	//    6    9:invokeinterface #28  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof zzs))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zzs>
	//*  12   23:ifeq            31
			return (zzs)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zzs>
	//   15   30:areturn         
		else
			return ((zzs) (new zza(ibinder)));
	//   16   31:new             #9   <Class zzs$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #31  <Method void zzs$zza$zza(IBinder)>
	//   20   39:areturn         
	}

	public IBinder asBinder()
	{
		return ((IBinder) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    2: default 28
	//	               1: 39
	//	               1598968902: 31
	//*   2   28:goto            81
		case 1598968902: 
			parcel1.writeString("com.google.android.gms.maps.internal.IOnMapLongClickListener");
	//    3   31:aload_3         
	//    4   32:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMapLongClickListener">
	//    5   34:invokevirtual   #43  <Method void Parcel.writeString(String)>
			return true;
	//    6   37:iconst_1        
	//    7   38:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMapLongClickListener");
	//    8   39:aload_2         
	//    9   40:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMapLongClickListener">
	//   10   42:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//*  11   45:aload_2         
	//*  12   46:invokevirtual   #50  <Method int Parcel.readInt()>
	//*  13   49:ifeq            68
				parcel = ((Parcel) ((LatLng)LatLng.CREATOR.createFromParcel(parcel)));
	//   14   52:getstatic       #56  <Field android.os.Parcelable$Creator LatLng.CREATOR>
	//   15   55:aload_2         
	//   16   56:invokeinterface #62  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   17   61:checkcast       #52  <Class LatLng>
	//   18   64:astore_2        
			else
	//*  19   65:goto            70
				parcel = null;
	//   20   68:aconst_null     
	//   21   69:astore_2        
			onMapLongClick(((LatLng) (parcel)));
	//   22   70:aload_0         
	//   23   71:aload_2         
	//   24   72:invokevirtual   #66  <Method void onMapLongClick(LatLng)>
			parcel1.writeNoException();
	//   25   75:aload_3         
	//   26   76:invokevirtual   #69  <Method void Parcel.writeNoException()>
			return true;
	//   27   79:iconst_1        
	//   28   80:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//   29   81:aload_0         
	//   30   82:iload_1         
	//   31   83:aload_2         
	//   32   84:aload_3         
	//   33   85:iload           4
	//   34   87:invokespecial   #71  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   35   90:ireturn         
	}

	public zzs$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.google.android.gms.maps.internal.IOnMapLongClickListener");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMapLongClickListener">
	//    5    8:invokevirtual   #19  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
