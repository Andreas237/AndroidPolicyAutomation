// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sensor.aidl;

import android.os.*;
import com.samsung.android.sensor.data.SensorDeviceInfo;

// Referenced classes of package com.samsung.android.sensor.aidl:
//			ISensorDeviceScanCallback

public static abstract class ISensorDeviceScanCallback$Stub extends Binder
	implements ISensorDeviceScanCallback
{
	private static class Proxy
		implements ISensorDeviceScanCallback
	{

		public IBinder asBinder()
		{
			return mRemote;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field IBinder mRemote>
		//    2    4:areturn         
		}

		public String getInterfaceDescriptor()
		{
			return "com.samsung.android.sensor.aidl.ISensorDeviceScanCallback";
		//    0    0:ldc1            #26  <String "com.samsung.android.sensor.aidl.ISensorDeviceScanCallback">
		//    1    2:areturn         
		}

		public void onDeviceFound(SensorDeviceInfo sensordeviceinfo)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorDeviceScanCallback");
		//    4    8:aload_2         
		//    5    9:ldc1            #26  <String "com.samsung.android.sensor.aidl.ISensorDeviceScanCallback">
		//    6   11:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
			if(sensordeviceinfo == null)
				break MISSING_BLOCK_LABEL_56;
		//    7   14:aload_1         
		//    8   15:ifnull          56
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			sensordeviceinfo.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #50  <Method void SensorDeviceInfo.writeToParcel(Parcel, int)>
_L1:
			mRemote.transact(2, parcel, parcel1, 0);
		//   16   29:aload_0         
		//   17   30:getfield        #19  <Field IBinder mRemote>
		//   18   33:iconst_2        
		//   19   34:aload_2         
		//   20   35:aload_3         
		//   21   36:iconst_0        
		//   22   37:invokeinterface #56  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   42:pop             
			parcel1.readException();
		//   24   43:aload_3         
		//   25   44:invokevirtual   #59  <Method void Parcel.readException()>
			parcel1.recycle();
		//   26   47:aload_3         
		//   27   48:invokevirtual   #62  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   51:aload_2         
		//   29   52:invokevirtual   #62  <Method void Parcel.recycle()>
			return;
		//   30   55:return          
			parcel.writeInt(0);
		//   31   56:aload_2         
		//   32   57:iconst_0        
		//   33   58:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			  goto _L1
		//*  34   61:goto            29
			sensordeviceinfo;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #62  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #62  <Method void Parcel.recycle()>
			throw sensordeviceinfo;
		//   40   73:aload_1         
		//   41   74:athrow          
		}

		public void onDeviceManufactureIdFound(String s, int i)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorDeviceScanCallback");
		//    4    9:aload_3         
		//    5   10:ldc1            #26  <String "com.samsung.android.sensor.aidl.ISensorDeviceScanCallback">
		//    6   12:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   15:aload_3         
		//    8   16:aload_1         
		//    9   17:invokevirtual   #68  <Method void Parcel.writeString(String)>
			parcel.writeInt(i);
		//   10   20:aload_3         
		//   11   21:iload_2         
		//   12   22:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			mRemote.transact(4, parcel, parcel1, 0);
		//   13   25:aload_0         
		//   14   26:getfield        #19  <Field IBinder mRemote>
		//   15   29:iconst_4        
		//   16   30:aload_3         
		//   17   31:aload           4
		//   18   33:iconst_0        
		//   19   34:invokeinterface #56  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   20   39:pop             
			parcel1.readException();
		//   21   40:aload           4
		//   22   42:invokevirtual   #59  <Method void Parcel.readException()>
			parcel1.recycle();
		//   23   45:aload           4
		//   24   47:invokevirtual   #62  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   50:aload_3         
		//   26   51:invokevirtual   #62  <Method void Parcel.recycle()>
			return;
		//   27   54:return          
			s;
		//   28   55:astore_1        
			parcel1.recycle();
		//   29   56:aload           4
		//   30   58:invokevirtual   #62  <Method void Parcel.recycle()>
			parcel.recycle();
		//   31   61:aload_3         
		//   32   62:invokevirtual   #62  <Method void Parcel.recycle()>
			throw s;
		//   33   65:aload_1         
		//   34   66:athrow          
		}

		public void onDeviceScanStarted()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorDeviceScanCallback");
		//    4    8:aload_1         
		//    5    9:ldc1            #26  <String "com.samsung.android.sensor.aidl.ISensorDeviceScanCallback">
		//    6   11:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(1, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:iconst_1        
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #56  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_2         
		//   16   29:invokevirtual   #59  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   32:aload_2         
		//   18   33:invokevirtual   #62  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   36:aload_1         
		//   20   37:invokevirtual   #62  <Method void Parcel.recycle()>
			return;
		//   21   40:return          
			Exception exception;
			exception;
		//   22   41:astore_3        
			parcel1.recycle();
		//   23   42:aload_2         
		//   24   43:invokevirtual   #62  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   46:aload_1         
		//   26   47:invokevirtual   #62  <Method void Parcel.recycle()>
			throw exception;
		//   27   50:aload_3         
		//   28   51:athrow          
		}

		public void onDeviceScanStopped()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorDeviceScanCallback");
		//    4    8:aload_1         
		//    5    9:ldc1            #26  <String "com.samsung.android.sensor.aidl.ISensorDeviceScanCallback">
		//    6   11:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(3, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:iconst_3        
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #56  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_2         
		//   16   29:invokevirtual   #59  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   32:aload_2         
		//   18   33:invokevirtual   #62  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   36:aload_1         
		//   20   37:invokevirtual   #62  <Method void Parcel.recycle()>
			return;
		//   21   40:return          
			Exception exception;
			exception;
		//   22   41:astore_3        
			parcel1.recycle();
		//   23   42:aload_2         
		//   24   43:invokevirtual   #62  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   46:aload_1         
		//   26   47:invokevirtual   #62  <Method void Parcel.recycle()>
			throw exception;
		//   27   50:aload_3         
		//   28   51:athrow          
		}

		private IBinder mRemote;

		Proxy(IBinder ibinder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mRemote = ibinder;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field IBinder mRemote>
		//    5    9:return          
		}
	}


	public static ISensorDeviceScanCallback asInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.samsung.android.sensor.aidl.ISensorDeviceScanCallback");
	//    4    6:aload_0         
	//    5    7:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorDeviceScanCallback">
	//    6    9:invokeinterface #40  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof ISensorDeviceScanCallback))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class ISensorDeviceScanCallback>
	//*  12   23:ifeq            31
			return (ISensorDeviceScanCallback)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class ISensorDeviceScanCallback>
	//   15   30:areturn         
		else
			return ((ISensorDeviceScanCallback) (new Proxy(ibinder)));
	//   16   31:new             #9   <Class ISensorDeviceScanCallback$Stub$Proxy>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #43  <Method void ISensorDeviceScanCallback$Stub$Proxy(IBinder)>
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
	//*   1    1:lookupswitch    5: default 52
	//	               1: 70
	//	               2: 86
	//	               3: 128
	//	               4: 144
	//	               1598968902: 62
		default:
			return super.onTransact(i, parcel, parcel1, j);
	//    2   52:aload_0         
	//    3   53:iload_1         
	//    4   54:aload_2         
	//    5   55:aload_3         
	//    6   56:iload           4
	//    7   58:invokespecial   #51  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//    8   61:ireturn         

		case 1598968902: 
			parcel1.writeString("com.samsung.android.sensor.aidl.ISensorDeviceScanCallback");
	//    9   62:aload_3         
	//   10   63:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorDeviceScanCallback">
	//   11   65:invokevirtual   #57  <Method void Parcel.writeString(String)>
			return true;
	//   12   68:iconst_1        
	//   13   69:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorDeviceScanCallback");
	//   14   70:aload_2         
	//   15   71:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorDeviceScanCallback">
	//   16   73:invokevirtual   #60  <Method void Parcel.enforceInterface(String)>
			onDeviceScanStarted();
	//   17   76:aload_0         
	//   18   77:invokevirtual   #63  <Method void onDeviceScanStarted()>
			parcel1.writeNoException();
	//   19   80:aload_3         
	//   20   81:invokevirtual   #66  <Method void Parcel.writeNoException()>
			return true;
	//   21   84:iconst_1        
	//   22   85:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorDeviceScanCallback");
	//   23   86:aload_2         
	//   24   87:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorDeviceScanCallback">
	//   25   89:invokevirtual   #60  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//*  26   92:aload_2         
	//*  27   93:invokevirtual   #70  <Method int Parcel.readInt()>
	//*  28   96:ifeq            123
				parcel = ((Parcel) ((SensorDeviceInfo)SensorDeviceInfo.CREATOR.createFromParcel(parcel)));
	//   29   99:getstatic       #76  <Field android.os.Parcelable$Creator SensorDeviceInfo.CREATOR>
	//   30  102:aload_2         
	//   31  103:invokeinterface #82  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   32  108:checkcast       #72  <Class SensorDeviceInfo>
	//   33  111:astore_2        
			else
	//*  34  112:aload_0         
	//*  35  113:aload_2         
	//*  36  114:invokevirtual   #86  <Method void onDeviceFound(SensorDeviceInfo)>
	//*  37  117:aload_3         
	//*  38  118:invokevirtual   #66  <Method void Parcel.writeNoException()>
	//*  39  121:iconst_1        
	//*  40  122:ireturn         
				parcel = null;
	//   41  123:aconst_null     
	//   42  124:astore_2        
			onDeviceFound(((SensorDeviceInfo) (parcel)));
			parcel1.writeNoException();
			return true;

	//*  43  125:goto            112
		case 3: // '\003'
			parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorDeviceScanCallback");
	//   44  128:aload_2         
	//   45  129:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorDeviceScanCallback">
	//   46  131:invokevirtual   #60  <Method void Parcel.enforceInterface(String)>
			onDeviceScanStopped();
	//   47  134:aload_0         
	//   48  135:invokevirtual   #89  <Method void onDeviceScanStopped()>
			parcel1.writeNoException();
	//   49  138:aload_3         
	//   50  139:invokevirtual   #66  <Method void Parcel.writeNoException()>
			return true;
	//   51  142:iconst_1        
	//   52  143:ireturn         

		case 4: // '\004'
			parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorDeviceScanCallback");
	//   53  144:aload_2         
	//   54  145:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorDeviceScanCallback">
	//   55  147:invokevirtual   #60  <Method void Parcel.enforceInterface(String)>
			onDeviceManufactureIdFound(parcel.readString(), parcel.readInt());
	//   56  150:aload_0         
	//   57  151:aload_2         
	//   58  152:invokevirtual   #93  <Method String Parcel.readString()>
	//   59  155:aload_2         
	//   60  156:invokevirtual   #70  <Method int Parcel.readInt()>
	//   61  159:invokevirtual   #97  <Method void onDeviceManufactureIdFound(String, int)>
			parcel1.writeNoException();
	//   62  162:aload_3         
	//   63  163:invokevirtual   #66  <Method void Parcel.writeNoException()>
			return true;
	//   64  166:iconst_1        
	//   65  167:ireturn         
		}
	}

	private static final String DESCRIPTOR = "com.samsung.android.sensor.aidl.ISensorDeviceScanCallback";
	static final int TRANSACTION_onDeviceFound = 2;
	static final int TRANSACTION_onDeviceManufactureIdFound = 4;
	static final int TRANSACTION_onDeviceScanStarted = 1;
	static final int TRANSACTION_onDeviceScanStopped = 3;

	public ISensorDeviceScanCallback$Stub()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.samsung.android.sensor.aidl.ISensorDeviceScanCallback");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorDeviceScanCallback">
	//    5    8:invokevirtual   #31  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
