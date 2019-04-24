// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sensor.aidl;

import android.os.*;
import com.samsung.android.sensor.data.SensorDeviceInfo;

// Referenced classes of package com.samsung.android.sensor.aidl:
//			ISensorDeviceScanCallback

private static class ISensorDeviceScanCallback$Stub$Proxy
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

	ISensorDeviceScanCallback$Stub$Proxy(IBinder ibinder)
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
