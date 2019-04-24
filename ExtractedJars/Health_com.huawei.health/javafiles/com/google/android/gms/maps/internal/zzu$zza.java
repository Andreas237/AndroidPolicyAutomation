// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;
import com.google.android.gms.maps.model.internal.zzf;

// Referenced classes of package com.google.android.gms.maps.internal:
//			zzu

public static abstract class zzu$zza extends Binder
	implements zzu
{
	static class zza
		implements zzu
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public boolean zza(zzf zzf1)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore          4
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    8:astore          5
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerClickListener");
		//    4   10:aload           4
		//    5   12:ldc1            #32  <String "com.google.android.gms.maps.internal.IOnMarkerClickListener">
		//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzf1 == null) goto _L2; else goto _L1
		//    7   17:aload_1         
		//    8   18:ifnull          100
_L1:
			zzf1 = ((zzf) (zzf1.asBinder()));
		//    9   21:aload_1         
		//   10   22:invokeinterface #40  <Method IBinder zzf.asBinder()>
		//   11   27:astore_1        
		//*  12   28:goto            31
_L4:
			int i;
			parcel.writeStrongBinder(((IBinder) (zzf1)));
		//   13   31:aload           4
		//   14   33:aload_1         
		//   15   34:invokevirtual   #43  <Method void Parcel.writeStrongBinder(IBinder)>
			zzrk.transact(1, parcel, parcel1, 0);
		//   16   37:aload_0         
		//   17   38:getfield        #18  <Field IBinder zzrk>
		//   18   41:iconst_1        
		//   19   42:aload           4
		//   20   44:aload           5
		//   21   46:iconst_0        
		//   22   47:invokeinterface #49  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   52:pop             
			parcel1.readException();
		//   24   53:aload           5
		//   25   55:invokevirtual   #52  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   26   58:aload           5
		//   27   60:invokevirtual   #56  <Method int Parcel.readInt()>
		//   28   63:istore_2        
			boolean flag;
			if(i != 0)
		//*  29   64:iload_2         
		//*  30   65:ifeq            73
				flag = true;
		//   31   68:iconst_1        
		//   32   69:istore_3        
			else
		//*  33   70:goto            75
				flag = false;
		//   34   73:iconst_0        
		//   35   74:istore_3        
			parcel1.recycle();
		//   36   75:aload           5
		//   37   77:invokevirtual   #59  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   80:aload           4
		//   39   82:invokevirtual   #59  <Method void Parcel.recycle()>
			return flag;
		//   40   85:iload_3         
		//   41   86:ireturn         
			zzf1;
		//   42   87:astore_1        
			parcel1.recycle();
		//   43   88:aload           5
		//   44   90:invokevirtual   #59  <Method void Parcel.recycle()>
			parcel.recycle();
		//   45   93:aload           4
		//   46   95:invokevirtual   #59  <Method void Parcel.recycle()>
			throw zzf1;
		//   47   98:aload_1         
		//   48   99:athrow          
_L2:
			zzf1 = null;
		//   49  100:aconst_null     
		//   50  101:astore_1        
			if(true) goto _L4; else goto _L3
		//   51  102:goto            31
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


	public static zzu zzdP(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
	//    4    6:aload_0         
	//    5    7:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMarkerClickListener">
	//    6    9:invokeinterface #28  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof zzu))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zzu>
	//*  12   23:ifeq            31
			return (zzu)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zzu>
	//   15   30:areturn         
		else
			return ((zzu) (new zza(ibinder)));
	//   16   31:new             #9   <Class zzu$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #31  <Method void zzu$zza$zza(IBinder)>
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
			parcel1.writeString("com.google.android.gms.maps.internal.IOnMarkerClickListener");
	//    3   31:aload_3         
	//    4   32:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMarkerClickListener">
	//    5   34:invokevirtual   #43  <Method void Parcel.writeString(String)>
			return true;
	//    6   37:iconst_1        
	//    7   38:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
	//    8   39:aload_2         
	//    9   40:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMarkerClickListener">
	//   10   42:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
			boolean flag = zza(com.google.android.gms.maps.model.internal.zzf$zza.zzen(parcel.readStrongBinder()));
	//   11   45:aload_0         
	//   12   46:aload_2         
	//   13   47:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
	//   14   50:invokestatic    #55  <Method zzf com.google.android.gms.maps.model.internal.zzf$zza.zzen(IBinder)>
	//   15   53:invokevirtual   #58  <Method boolean zza(zzf)>
	//   16   56:istore          5
			parcel1.writeNoException();
	//   17   58:aload_3         
	//   18   59:invokevirtual   #61  <Method void Parcel.writeNoException()>
			if(flag)
	//*  19   62:iload           5
	//*  20   64:ifeq            72
				i = 1;
	//   21   67:iconst_1        
	//   22   68:istore_1        
			else
	//*  23   69:goto            74
				i = 0;
	//   24   72:iconst_0        
	//   25   73:istore_1        
			parcel1.writeInt(i);
	//   26   74:aload_3         
	//   27   75:iload_1         
	//   28   76:invokevirtual   #65  <Method void Parcel.writeInt(int)>
			return true;
	//   29   79:iconst_1        
	//   30   80:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//   31   81:aload_0         
	//   32   82:iload_1         
	//   33   83:aload_2         
	//   34   84:aload_3         
	//   35   85:iload           4
	//   36   87:invokespecial   #67  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   37   90:ireturn         
	}

	public zzu$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.google.android.gms.maps.internal.IOnMarkerClickListener");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #15  <String "com.google.android.gms.maps.internal.IOnMarkerClickListener">
	//    5    8:invokevirtual   #19  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
