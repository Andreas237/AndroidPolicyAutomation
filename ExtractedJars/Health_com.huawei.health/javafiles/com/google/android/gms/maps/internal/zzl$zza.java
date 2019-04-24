// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;
import com.google.android.gms.maps.model.internal.zzd;

// Referenced classes of package com.google.android.gms.maps.internal:
//			zzl

public static abstract class zzl$zza extends Binder
	implements zzl
{
	static class zza
		implements zzl
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public void onIndoorBuildingFocused()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.google.android.gms.maps.internal.IOnIndoorStateChangeListener">
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

		public void zza(zzd zzd1)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.maps.internal.IOnIndoorStateChangeListener">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzd1 == null) goto _L2; else goto _L1
		//    7   14:aload_1         
		//    8   15:ifnull          71
_L1:
			zzd1 = ((zzd) (zzd1.asBinder()));
		//    9   18:aload_1         
		//   10   19:invokeinterface #54  <Method IBinder zzd.asBinder()>
		//   11   24:astore_1        
		//*  12   25:goto            28
_L4:
			parcel.writeStrongBinder(((IBinder) (zzd1)));
		//   13   28:aload_2         
		//   14   29:aload_1         
		//   15   30:invokevirtual   #57  <Method void Parcel.writeStrongBinder(IBinder)>
			zzrk.transact(2, parcel, parcel1, 0);
		//   16   33:aload_0         
		//   17   34:getfield        #18  <Field IBinder zzrk>
		//   18   37:iconst_2        
		//   19   38:aload_2         
		//   20   39:aload_3         
		//   21   40:iconst_0        
		//   22   41:invokeinterface #42  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   46:pop             
			parcel1.readException();
		//   24   47:aload_3         
		//   25   48:invokevirtual   #45  <Method void Parcel.readException()>
			parcel1.recycle();
		//   26   51:aload_3         
		//   27   52:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   55:aload_2         
		//   29   56:invokevirtual   #48  <Method void Parcel.recycle()>
			return;
		//   30   59:return          
			zzd1;
		//   31   60:astore_1        
			parcel1.recycle();
		//   32   61:aload_3         
		//   33   62:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   34   65:aload_2         
		//   35   66:invokevirtual   #48  <Method void Parcel.recycle()>
			throw zzd1;
		//   36   69:aload_1         
		//   37   70:athrow          
_L2:
			zzd1 = null;
		//   38   71:aconst_null     
		//   39   72:astore_1        
			if(true) goto _L4; else goto _L3
		//   40   73:goto            28
_L3:
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


	public static zzl zzdG(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
	//    4    6:aload_0         
	//    5    7:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnIndoorStateChangeListener">
	//    6    9:invokeinterface #28  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof zzl))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zzl>
	//*  12   23:ifeq            31
			return (zzl)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zzl>
	//   15   30:areturn         
		else
			return ((zzl) (new zza(ibinder)));
	//   16   31:new             #9   <Class zzl$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #31  <Method void zzl$zza$zza(IBinder)>
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
	//*   1    1:lookupswitch    3: default 36
	//	               1: 47
	//	               2: 63
	//	               1598968902: 39
	//*   2   36:goto            86
		case 1598968902: 
			parcel1.writeString("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
	//    3   39:aload_3         
	//    4   40:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnIndoorStateChangeListener">
	//    5   42:invokevirtual   #43  <Method void Parcel.writeString(String)>
			return true;
	//    6   45:iconst_1        
	//    7   46:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
	//    8   47:aload_2         
	//    9   48:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnIndoorStateChangeListener">
	//   10   50:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
			onIndoorBuildingFocused();
	//   11   53:aload_0         
	//   12   54:invokevirtual   #49  <Method void onIndoorBuildingFocused()>
			parcel1.writeNoException();
	//   13   57:aload_3         
	//   14   58:invokevirtual   #52  <Method void Parcel.writeNoException()>
			return true;
	//   15   61:iconst_1        
	//   16   62:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
	//   17   63:aload_2         
	//   18   64:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnIndoorStateChangeListener">
	//   19   66:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
			zza(com.google.android.gms.maps.model.internal.zzd$zza.zzel(parcel.readStrongBinder()));
	//   20   69:aload_0         
	//   21   70:aload_2         
	//   22   71:invokevirtual   #55  <Method IBinder Parcel.readStrongBinder()>
	//   23   74:invokestatic    #61  <Method zzd com.google.android.gms.maps.model.internal.zzd$zza.zzel(IBinder)>
	//   24   77:invokevirtual   #64  <Method void zza(zzd)>
			parcel1.writeNoException();
	//   25   80:aload_3         
	//   26   81:invokevirtual   #52  <Method void Parcel.writeNoException()>
			return true;
	//   27   84:iconst_1        
	//   28   85:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//   29   86:aload_0         
	//   30   87:iload_1         
	//   31   88:aload_2         
	//   32   89:aload_3         
	//   33   90:iload           4
	//   34   92:invokespecial   #66  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   35   95:ireturn         
	}

	public zzl$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnIndoorStateChangeListener">
	//    5    8:invokevirtual   #19  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
