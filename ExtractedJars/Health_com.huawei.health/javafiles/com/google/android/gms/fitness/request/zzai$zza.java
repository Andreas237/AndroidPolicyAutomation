// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.request;

import android.os.*;
import com.google.android.gms.fitness.data.BleDevice;

// Referenced classes of package com.google.android.gms.fitness.request:
//			zzai

public static abstract class zzai$zza extends Binder
	implements zzai
{
	static class zza
		implements zzai
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public void onDeviceFound(BleDevice bledevice)
			throws RemoteException
		{
			Parcel parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel.writeInterfaceToken("com.google.android.gms.fitness.request.IBleScanCallback");
		//    2    4:aload_2         
		//    3    5:ldc1            #33  <String "com.google.android.gms.fitness.request.IBleScanCallback">
		//    4    7:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(bledevice == null)
				break MISSING_BLOCK_LABEL_28;
		//    5   10:aload_1         
		//    6   11:ifnull          28
			parcel.writeInt(1);
		//    7   14:aload_2         
		//    8   15:iconst_1        
		//    9   16:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			bledevice.writeToParcel(parcel, 0);
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokevirtual   #47  <Method void BleDevice.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_33;
		//   14   25:goto            33
			parcel.writeInt(0);
		//   15   28:aload_2         
		//   16   29:iconst_0        
		//   17   30:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			zzrk.transact(1, parcel, ((Parcel) (null)), 1);
		//   18   33:aload_0         
		//   19   34:getfield        #18  <Field IBinder zzrk>
		//   20   37:iconst_1        
		//   21   38:aload_2         
		//   22   39:aconst_null     
		//   23   40:iconst_1        
		//   24   41:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   25   46:pop             
			parcel.recycle();
		//   26   47:aload_2         
		//   27   48:invokevirtual   #56  <Method void Parcel.recycle()>
			return;
		//   28   51:return          
			bledevice;
		//   29   52:astore_1        
			parcel.recycle();
		//   30   53:aload_2         
		//   31   54:invokevirtual   #56  <Method void Parcel.recycle()>
			throw bledevice;
		//   32   57:aload_1         
		//   33   58:athrow          
		}

		public void onScanStopped()
			throws RemoteException
		{
			Parcel parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel.writeInterfaceToken("com.google.android.gms.fitness.request.IBleScanCallback");
		//    2    4:aload_1         
		//    3    5:ldc1            #33  <String "com.google.android.gms.fitness.request.IBleScanCallback">
		//    4    7:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(2, parcel, ((Parcel) (null)), 1);
		//    5   10:aload_0         
		//    6   11:getfield        #18  <Field IBinder zzrk>
		//    7   14:iconst_2        
		//    8   15:aload_1         
		//    9   16:aconst_null     
		//   10   17:iconst_1        
		//   11   18:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   12   23:pop             
			parcel.recycle();
		//   13   24:aload_1         
		//   14   25:invokevirtual   #56  <Method void Parcel.recycle()>
			return;
		//   15   28:return          
			Exception exception;
			exception;
		//   16   29:astore_2        
			parcel.recycle();
		//   17   30:aload_1         
		//   18   31:invokevirtual   #56  <Method void Parcel.recycle()>
			throw exception;
		//   19   34:aload_2         
		//   20   35:athrow          
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


	public static zzai zzcN(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.fitness.request.IBleScanCallback");
	//    4    6:aload_0         
	//    5    7:ldc1            #15  <String "com.google.android.gms.fitness.request.IBleScanCallback">
	//    6    9:invokeinterface #28  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof zzai))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zzai>
	//*  12   23:ifeq            31
			return (zzai)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zzai>
	//   15   30:areturn         
		else
			return ((zzai) (new zza(ibinder)));
	//   16   31:new             #9   <Class zzai$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #31  <Method void zzai$zza$zza(IBinder)>
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
	//	               2: 85
	//	               1598968902: 39
	//*   2   36:goto            97
		case 1598968902: 
			parcel1.writeString("com.google.android.gms.fitness.request.IBleScanCallback");
	//    3   39:aload_3         
	//    4   40:ldc1            #15  <String "com.google.android.gms.fitness.request.IBleScanCallback">
	//    5   42:invokevirtual   #43  <Method void Parcel.writeString(String)>
			return true;
	//    6   45:iconst_1        
	//    7   46:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.fitness.request.IBleScanCallback");
	//    8   47:aload_2         
	//    9   48:ldc1            #15  <String "com.google.android.gms.fitness.request.IBleScanCallback">
	//   10   50:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//*  11   53:aload_2         
	//*  12   54:invokevirtual   #50  <Method int Parcel.readInt()>
	//*  13   57:ifeq            76
				parcel = ((Parcel) ((BleDevice)BleDevice.CREATOR.createFromParcel(parcel)));
	//   14   60:getstatic       #56  <Field android.os.Parcelable$Creator BleDevice.CREATOR>
	//   15   63:aload_2         
	//   16   64:invokeinterface #62  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   17   69:checkcast       #52  <Class BleDevice>
	//   18   72:astore_2        
			else
	//*  19   73:goto            78
				parcel = null;
	//   20   76:aconst_null     
	//   21   77:astore_2        
			onDeviceFound(((BleDevice) (parcel)));
	//   22   78:aload_0         
	//   23   79:aload_2         
	//   24   80:invokevirtual   #66  <Method void onDeviceFound(BleDevice)>
			return true;
	//   25   83:iconst_1        
	//   26   84:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("com.google.android.gms.fitness.request.IBleScanCallback");
	//   27   85:aload_2         
	//   28   86:ldc1            #15  <String "com.google.android.gms.fitness.request.IBleScanCallback">
	//   29   88:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
			onScanStopped();
	//   30   91:aload_0         
	//   31   92:invokevirtual   #69  <Method void onScanStopped()>
			return true;
	//   32   95:iconst_1        
	//   33   96:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//   34   97:aload_0         
	//   35   98:iload_1         
	//   36   99:aload_2         
	//   37  100:aload_3         
	//   38  101:iload           4
	//   39  103:invokespecial   #71  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   40  106:ireturn         
	}

	public zzai$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.google.android.gms.fitness.request.IBleScanCallback");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #15  <String "com.google.android.gms.fitness.request.IBleScanCallback">
	//    5    8:invokevirtual   #19  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
