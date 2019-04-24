// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.maps.internal:
//			zzp

public static abstract class zzp$zza extends Binder
	implements zzp
{
	static class zza
		implements zzp
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public void zzK(IObjectWrapper iobjectwrapper)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnLocationChangeListener");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IOnLocationChangeListener">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(iobjectwrapper == null) goto _L2; else goto _L1
		//    7   14:aload_1         
		//    8   15:ifnull          71
_L1:
			iobjectwrapper = ((IObjectWrapper) (iobjectwrapper.asBinder()));
		//    9   18:aload_1         
		//   10   19:invokeinterface #41  <Method IBinder IObjectWrapper.asBinder()>
		//   11   24:astore_1        
		//*  12   25:goto            28
_L4:
			parcel.writeStrongBinder(((IBinder) (iobjectwrapper)));
		//   13   28:aload_2         
		//   14   29:aload_1         
		//   15   30:invokevirtual   #44  <Method void Parcel.writeStrongBinder(IBinder)>
			zzrk.transact(1, parcel, parcel1, 0);
		//   16   33:aload_0         
		//   17   34:getfield        #18  <Field IBinder zzrk>
		//   18   37:iconst_1        
		//   19   38:aload_2         
		//   20   39:aload_3         
		//   21   40:iconst_0        
		//   22   41:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   46:pop             
			parcel1.readException();
		//   24   47:aload_3         
		//   25   48:invokevirtual   #53  <Method void Parcel.readException()>
			parcel1.recycle();
		//   26   51:aload_3         
		//   27   52:invokevirtual   #56  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   55:aload_2         
		//   29   56:invokevirtual   #56  <Method void Parcel.recycle()>
			return;
		//   30   59:return          
			iobjectwrapper;
		//   31   60:astore_1        
			parcel1.recycle();
		//   32   61:aload_3         
		//   33   62:invokevirtual   #56  <Method void Parcel.recycle()>
			parcel.recycle();
		//   34   65:aload_2         
		//   35   66:invokevirtual   #56  <Method void Parcel.recycle()>
			throw iobjectwrapper;
		//   36   69:aload_1         
		//   37   70:athrow          
_L2:
			iobjectwrapper = null;
		//   38   71:aconst_null     
		//   39   72:astore_1        
			if(true) goto _L4; else goto _L3
		//   40   73:goto            28
_L3:
		}

		public void zze(Location location)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnLocationChangeListener");
		//    4    8:aload_2         
		//    5    9:ldc1            #33  <String "com.google.android.gms.maps.internal.IOnLocationChangeListener">
		//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(location == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #63  <Method void Parcel.writeInt(int)>
			location.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #69  <Method void Location.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #63  <Method void Parcel.writeInt(int)>
			zzrk.transact(2, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #18  <Field IBinder zzrk>
		//   22   41:iconst_2        
		//   23   42:aload_2         
		//   24   43:aload_3         
		//   25   44:iconst_0        
		//   26   45:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   50:pop             
			parcel1.readException();
		//   28   51:aload_3         
		//   29   52:invokevirtual   #53  <Method void Parcel.readException()>
			parcel1.recycle();
		//   30   55:aload_3         
		//   31   56:invokevirtual   #56  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   59:aload_2         
		//   33   60:invokevirtual   #56  <Method void Parcel.recycle()>
			return;
		//   34   63:return          
			location;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #56  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #56  <Method void Parcel.recycle()>
			throw location;
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


	public static zzp zzdK(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
	//    4    6:aload_0         
	//    5    7:ldc1            #13  <String "com.google.android.gms.maps.internal.IOnLocationChangeListener">
	//    6    9:invokeinterface #19  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof zzp))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zzp>
	//*  12   23:ifeq            31
			return (zzp)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zzp>
	//   15   30:areturn         
		else
			return ((zzp) (new zza(ibinder)));
	//   16   31:new             #9   <Class zzp$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #23  <Method void zzp$zza$zza(IBinder)>
	//   20   39:areturn         
	}

	public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    3: default 36
	//	               1: 47
	//	               2: 70
	//	               1598968902: 39
	//*   2   36:goto            112
		case 1598968902: 
			parcel1.writeString("com.google.android.gms.maps.internal.IOnLocationChangeListener");
	//    3   39:aload_3         
	//    4   40:ldc1            #13  <String "com.google.android.gms.maps.internal.IOnLocationChangeListener">
	//    5   42:invokevirtual   #34  <Method void Parcel.writeString(String)>
			return true;
	//    6   45:iconst_1        
	//    7   46:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
	//    8   47:aload_2         
	//    9   48:ldc1            #13  <String "com.google.android.gms.maps.internal.IOnLocationChangeListener">
	//   10   50:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			zzK(com.google.android.gms.dynamic.rapper.zza.zzcd(parcel.readStrongBinder()));
	//   11   53:aload_0         
	//   12   54:aload_2         
	//   13   55:invokevirtual   #41  <Method IBinder Parcel.readStrongBinder()>
	//   14   58:invokestatic    #47  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   15   61:invokevirtual   #51  <Method void zzK(IObjectWrapper)>
			parcel1.writeNoException();
	//   16   64:aload_3         
	//   17   65:invokevirtual   #55  <Method void Parcel.writeNoException()>
			return true;
	//   18   68:iconst_1        
	//   19   69:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
	//   20   70:aload_2         
	//   21   71:ldc1            #13  <String "com.google.android.gms.maps.internal.IOnLocationChangeListener">
	//   22   73:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//*  23   76:aload_2         
	//*  24   77:invokevirtual   #59  <Method int Parcel.readInt()>
	//*  25   80:ifeq            99
				parcel = ((Parcel) ((Location)Location.CREATOR.createFromParcel(parcel)));
	//   26   83:getstatic       #65  <Field android.os.Parcelable$Creator Location.CREATOR>
	//   27   86:aload_2         
	//   28   87:invokeinterface #71  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   29   92:checkcast       #61  <Class Location>
	//   30   95:astore_2        
			else
	//*  31   96:goto            101
				parcel = null;
	//   32   99:aconst_null     
	//   33  100:astore_2        
			zze(((Location) (parcel)));
	//   34  101:aload_0         
	//   35  102:aload_2         
	//   36  103:invokevirtual   #75  <Method void zze(Location)>
			parcel1.writeNoException();
	//   37  106:aload_3         
	//   38  107:invokevirtual   #55  <Method void Parcel.writeNoException()>
			return true;
	//   39  110:iconst_1        
	//   40  111:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//   41  112:aload_0         
	//   42  113:iload_1         
	//   43  114:aload_2         
	//   44  115:aload_3         
	//   45  116:iload           4
	//   46  118:invokespecial   #77  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   47  121:ireturn         
	}
}
