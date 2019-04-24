// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.maps.internal:
//			zzr

public static abstract class zzr$zza extends Binder
	implements zzr
{
	static class zza
		implements zzr
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public void onMapLoaded()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.google.android.gms.maps.internal.IOnMapLoadedCallback">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(1, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:iconst_1        
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #42  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_2         
		//   16   29:invokevirtual   #45  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   32:aload_2         
		//   18   33:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   36:aload_1         
		//   20   37:invokevirtual   #48  <Method void Parcel.recycle()>
			return;
		//   21   40:return          
			Exception exception;
			exception;
		//   22   41:astore_3        
			parcel1.recycle();
		//   23   42:aload_2         
		//   24   43:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   46:aload_1         
		//   26   47:invokevirtual   #48  <Method void Parcel.recycle()>
			throw exception;
		//   27   50:aload_3         
		//   28   51:athrow          
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


	public static zzr zzdM(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
	//    4    6:aload_0         
	//    5    7:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMapLoadedCallback">
	//    6    9:invokeinterface #28  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof zzr))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zzr>
	//*  12   23:ifeq            31
			return (zzr)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zzr>
	//   15   30:areturn         
		else
			return ((zzr) (new zza(ibinder)));
	//   16   31:new             #9   <Class zzr$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #31  <Method void zzr$zza$zza(IBinder)>
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
	//*   2   28:goto            55
		case 1598968902: 
			parcel1.writeString("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
	//    3   31:aload_3         
	//    4   32:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMapLoadedCallback">
	//    5   34:invokevirtual   #43  <Method void Parcel.writeString(String)>
			return true;
	//    6   37:iconst_1        
	//    7   38:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
	//    8   39:aload_2         
	//    9   40:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMapLoadedCallback">
	//   10   42:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
			onMapLoaded();
	//   11   45:aload_0         
	//   12   46:invokevirtual   #49  <Method void onMapLoaded()>
			parcel1.writeNoException();
	//   13   49:aload_3         
	//   14   50:invokevirtual   #52  <Method void Parcel.writeNoException()>
			return true;
	//   15   53:iconst_1        
	//   16   54:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//   17   55:aload_0         
	//   18   56:iload_1         
	//   19   57:aload_2         
	//   20   58:aload_3         
	//   21   59:iload           4
	//   22   61:invokespecial   #54  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   23   64:ireturn         
	}

	public zzr$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.google.android.gms.maps.internal.IOnMapLoadedCallback");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMapLoadedCallback">
	//    5    8:invokevirtual   #19  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
