// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.maps.internal:
//			zzw

public static abstract class zzw$zza extends Binder
	implements zzw
{
	static class zza
		implements zzw
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public boolean onMyLocationButtonClick()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
		//    4    9:aload_3         
		//    5   10:ldc1            #33  <String "com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener">
		//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(1, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #18  <Field IBinder zzrk>
		//    9   19:iconst_1        
		//   10   20:aload_3         
		//   11   21:aload           4
		//   12   23:iconst_0        
		//   13   24:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   29:pop             
			parcel1.readException();
		//   15   30:aload           4
		//   16   32:invokevirtual   #46  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   35:aload           4
		//   18   37:invokevirtual   #50  <Method int Parcel.readInt()>
		//   19   40:istore_1        
			boolean flag;
			if(i != 0)
		//*  20   41:iload_1         
		//*  21   42:ifeq            50
				flag = true;
		//   22   45:iconst_1        
		//   23   46:istore_2        
			else
		//*  24   47:goto            52
				flag = false;
		//   25   50:iconst_0        
		//   26   51:istore_2        
			parcel1.recycle();
		//   27   52:aload           4
		//   28   54:invokevirtual   #53  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   57:aload_3         
		//   30   58:invokevirtual   #53  <Method void Parcel.recycle()>
			return flag;
		//   31   61:iload_2         
		//   32   62:ireturn         
			Exception exception;
			exception;
		//   33   63:astore          5
			parcel1.recycle();
		//   34   65:aload           4
		//   35   67:invokevirtual   #53  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   70:aload_3         
		//   37   71:invokevirtual   #53  <Method void Parcel.recycle()>
			throw exception;
		//   38   74:aload           5
		//   39   76:athrow          
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


	public static zzw zzdR(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
	//    4    6:aload_0         
	//    5    7:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener">
	//    6    9:invokeinterface #28  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof zzw))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zzw>
	//*  12   23:ifeq            31
			return (zzw)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zzw>
	//   15   30:areturn         
		else
			return ((zzw) (new zza(ibinder)));
	//   16   31:new             #9   <Class zzw$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #31  <Method void zzw$zza$zza(IBinder)>
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
	//*   2   28:goto            74
		case 1598968902: 
			parcel1.writeString("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
	//    3   31:aload_3         
	//    4   32:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener">
	//    5   34:invokevirtual   #43  <Method void Parcel.writeString(String)>
			return true;
	//    6   37:iconst_1        
	//    7   38:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
	//    8   39:aload_2         
	//    9   40:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener">
	//   10   42:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
			boolean flag = onMyLocationButtonClick();
	//   11   45:aload_0         
	//   12   46:invokevirtual   #50  <Method boolean onMyLocationButtonClick()>
	//   13   49:istore          5
			parcel1.writeNoException();
	//   14   51:aload_3         
	//   15   52:invokevirtual   #53  <Method void Parcel.writeNoException()>
			if(flag)
	//*  16   55:iload           5
	//*  17   57:ifeq            65
				i = 1;
	//   18   60:iconst_1        
	//   19   61:istore_1        
			else
	//*  20   62:goto            67
				i = 0;
	//   21   65:iconst_0        
	//   22   66:istore_1        
			parcel1.writeInt(i);
	//   23   67:aload_3         
	//   24   68:iload_1         
	//   25   69:invokevirtual   #57  <Method void Parcel.writeInt(int)>
			return true;
	//   26   72:iconst_1        
	//   27   73:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//   28   74:aload_0         
	//   29   75:iload_1         
	//   30   76:aload_2         
	//   31   77:aload_3         
	//   32   78:iload           4
	//   33   80:invokespecial   #59  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   34   83:ireturn         
	}

	public zzw$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener">
	//    5    8:invokevirtual   #19  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
