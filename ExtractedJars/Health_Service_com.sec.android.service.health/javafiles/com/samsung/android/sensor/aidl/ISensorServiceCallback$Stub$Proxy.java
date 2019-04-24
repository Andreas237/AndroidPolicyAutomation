// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sensor.aidl;

import android.os.*;
import com.samsung.android.sensor.data.SensorData;
import com.samsung.android.sensor.data.SensorDeviceInfo;

// Referenced classes of package com.samsung.android.sensor.aidl:
//			ISensorServiceCallback

private static class ISensorServiceCallback$Stub$Proxy
	implements ISensorServiceCallback
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
		return "com.samsung.android.sensor.aidl.ISensorServiceCallback";
	//    0    0:ldc1            #26  <String "com.samsung.android.sensor.aidl.ISensorServiceCallback">
	//    1    2:areturn         
	}

	public void onDataReceived(String s, SensorData sensordata)
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
		parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceCallback");
	//    4    9:aload_3         
	//    5   10:ldc1            #26  <String "com.samsung.android.sensor.aidl.ISensorServiceCallback">
	//    6   12:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   15:aload_3         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #43  <Method void Parcel.writeString(String)>
		if(sensordata == null)
			break MISSING_BLOCK_LABEL_65;
	//   10   20:aload_2         
	//   11   21:ifnull          65
		parcel.writeInt(1);
	//   12   24:aload_3         
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #47  <Method void Parcel.writeInt(int)>
		sensordata.writeToParcel(parcel, 0);
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #53  <Method void SensorData.writeToParcel(Parcel, int)>
_L1:
		mRemote.transact(2, parcel, parcel1, 0);
	//   19   35:aload_0         
	//   20   36:getfield        #19  <Field IBinder mRemote>
	//   21   39:iconst_2        
	//   22   40:aload_3         
	//   23   41:aload           4
	//   24   43:iconst_0        
	//   25   44:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   26   49:pop             
		parcel1.readException();
	//   27   50:aload           4
	//   28   52:invokevirtual   #62  <Method void Parcel.readException()>
		parcel1.recycle();
	//   29   55:aload           4
	//   30   57:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   60:aload_3         
	//   32   61:invokevirtual   #65  <Method void Parcel.recycle()>
		return;
	//   33   64:return          
		parcel.writeInt(0);
	//   34   65:aload_3         
	//   35   66:iconst_0        
	//   36   67:invokevirtual   #47  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  37   70:goto            35
		s;
	//   38   73:astore_1        
		parcel1.recycle();
	//   39   74:aload           4
	//   40   76:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   41   79:aload_3         
	//   42   80:invokevirtual   #65  <Method void Parcel.recycle()>
		throw s;
	//   43   83:aload_1         
	//   44   84:athrow          
	}

	public void onDeviceAccessResultReceived(int i, SensorDeviceInfo sensordeviceinfo)
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
		parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceCallback");
	//    4    9:aload_3         
	//    5   10:ldc1            #26  <String "com.samsung.android.sensor.aidl.ISensorServiceCallback">
	//    6   12:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   15:aload_3         
	//    8   16:iload_1         
	//    9   17:invokevirtual   #47  <Method void Parcel.writeInt(int)>
		if(sensordeviceinfo == null)
			break MISSING_BLOCK_LABEL_65;
	//   10   20:aload_2         
	//   11   21:ifnull          65
		parcel.writeInt(1);
	//   12   24:aload_3         
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #47  <Method void Parcel.writeInt(int)>
		sensordeviceinfo.writeToParcel(parcel, 0);
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #71  <Method void SensorDeviceInfo.writeToParcel(Parcel, int)>
_L1:
		mRemote.transact(1, parcel, parcel1, 0);
	//   19   35:aload_0         
	//   20   36:getfield        #19  <Field IBinder mRemote>
	//   21   39:iconst_1        
	//   22   40:aload_3         
	//   23   41:aload           4
	//   24   43:iconst_0        
	//   25   44:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   26   49:pop             
		parcel1.readException();
	//   27   50:aload           4
	//   28   52:invokevirtual   #62  <Method void Parcel.readException()>
		parcel1.recycle();
	//   29   55:aload           4
	//   30   57:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   60:aload_3         
	//   32   61:invokevirtual   #65  <Method void Parcel.recycle()>
		return;
	//   33   64:return          
		parcel.writeInt(0);
	//   34   65:aload_3         
	//   35   66:iconst_0        
	//   36   67:invokevirtual   #47  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  37   70:goto            35
		sensordeviceinfo;
	//   38   73:astore_2        
		parcel1.recycle();
	//   39   74:aload           4
	//   40   76:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   41   79:aload_3         
	//   42   80:invokevirtual   #65  <Method void Parcel.recycle()>
		throw sensordeviceinfo;
	//   43   83:aload_2         
	//   44   84:athrow          
	}

	public void onSensorDeviceRegistered(SensorDeviceInfo sensordeviceinfo)
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
		parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceCallback");
	//    4    8:aload_2         
	//    5    9:ldc1            #26  <String "com.samsung.android.sensor.aidl.ISensorServiceCallback">
	//    6   11:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		if(sensordeviceinfo == null)
			break MISSING_BLOCK_LABEL_56;
	//    7   14:aload_1         
	//    8   15:ifnull          56
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #47  <Method void Parcel.writeInt(int)>
		sensordeviceinfo.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #71  <Method void SensorDeviceInfo.writeToParcel(Parcel, int)>
_L1:
		mRemote.transact(4, parcel, parcel1, 0);
	//   16   29:aload_0         
	//   17   30:getfield        #19  <Field IBinder mRemote>
	//   18   33:iconst_4        
	//   19   34:aload_2         
	//   20   35:aload_3         
	//   21   36:iconst_0        
	//   22   37:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   42:pop             
		parcel1.readException();
	//   24   43:aload_3         
	//   25   44:invokevirtual   #62  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   47:aload_3         
	//   27   48:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   51:aload_2         
	//   29   52:invokevirtual   #65  <Method void Parcel.recycle()>
		return;
	//   30   55:return          
		parcel.writeInt(0);
	//   31   56:aload_2         
	//   32   57:iconst_0        
	//   33   58:invokevirtual   #47  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  34   61:goto            29
		sensordeviceinfo;
	//   35   64:astore_1        
		parcel1.recycle();
	//   36   65:aload_3         
	//   37   66:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   69:aload_2         
	//   39   70:invokevirtual   #65  <Method void Parcel.recycle()>
		throw sensordeviceinfo;
	//   40   73:aload_1         
	//   41   74:athrow          
	}

	public void onSensorDeviceUnregistered(SensorDeviceInfo sensordeviceinfo)
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
		parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceCallback");
	//    4    8:aload_2         
	//    5    9:ldc1            #26  <String "com.samsung.android.sensor.aidl.ISensorServiceCallback">
	//    6   11:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		if(sensordeviceinfo == null)
			break MISSING_BLOCK_LABEL_56;
	//    7   14:aload_1         
	//    8   15:ifnull          56
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #47  <Method void Parcel.writeInt(int)>
		sensordeviceinfo.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #71  <Method void SensorDeviceInfo.writeToParcel(Parcel, int)>
_L1:
		mRemote.transact(5, parcel, parcel1, 0);
	//   16   29:aload_0         
	//   17   30:getfield        #19  <Field IBinder mRemote>
	//   18   33:iconst_5        
	//   19   34:aload_2         
	//   20   35:aload_3         
	//   21   36:iconst_0        
	//   22   37:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   42:pop             
		parcel1.readException();
	//   24   43:aload_3         
	//   25   44:invokevirtual   #62  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   47:aload_3         
	//   27   48:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   51:aload_2         
	//   29   52:invokevirtual   #65  <Method void Parcel.recycle()>
		return;
	//   30   55:return          
		parcel.writeInt(0);
	//   31   56:aload_2         
	//   32   57:iconst_0        
	//   33   58:invokevirtual   #47  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  34   61:goto            29
		sensordeviceinfo;
	//   35   64:astore_1        
		parcel1.recycle();
	//   36   65:aload_3         
	//   37   66:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   69:aload_2         
	//   39   70:invokevirtual   #65  <Method void Parcel.recycle()>
		throw sensordeviceinfo;
	//   40   73:aload_1         
	//   41   74:athrow          
	}

	public void onStateChanged(int i, SensorDeviceInfo sensordeviceinfo)
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
		parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceCallback");
	//    4    9:aload_3         
	//    5   10:ldc1            #26  <String "com.samsung.android.sensor.aidl.ISensorServiceCallback">
	//    6   12:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   15:aload_3         
	//    8   16:iload_1         
	//    9   17:invokevirtual   #47  <Method void Parcel.writeInt(int)>
		if(sensordeviceinfo == null)
			break MISSING_BLOCK_LABEL_65;
	//   10   20:aload_2         
	//   11   21:ifnull          65
		parcel.writeInt(1);
	//   12   24:aload_3         
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #47  <Method void Parcel.writeInt(int)>
		sensordeviceinfo.writeToParcel(parcel, 0);
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #71  <Method void SensorDeviceInfo.writeToParcel(Parcel, int)>
_L1:
		mRemote.transact(3, parcel, parcel1, 0);
	//   19   35:aload_0         
	//   20   36:getfield        #19  <Field IBinder mRemote>
	//   21   39:iconst_3        
	//   22   40:aload_3         
	//   23   41:aload           4
	//   24   43:iconst_0        
	//   25   44:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   26   49:pop             
		parcel1.readException();
	//   27   50:aload           4
	//   28   52:invokevirtual   #62  <Method void Parcel.readException()>
		parcel1.recycle();
	//   29   55:aload           4
	//   30   57:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   60:aload_3         
	//   32   61:invokevirtual   #65  <Method void Parcel.recycle()>
		return;
	//   33   64:return          
		parcel.writeInt(0);
	//   34   65:aload_3         
	//   35   66:iconst_0        
	//   36   67:invokevirtual   #47  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  37   70:goto            35
		sensordeviceinfo;
	//   38   73:astore_2        
		parcel1.recycle();
	//   39   74:aload           4
	//   40   76:invokevirtual   #65  <Method void Parcel.recycle()>
		parcel.recycle();
	//   41   79:aload_3         
	//   42   80:invokevirtual   #65  <Method void Parcel.recycle()>
		throw sensordeviceinfo;
	//   43   83:aload_2         
	//   44   84:athrow          
	}

	private IBinder mRemote;

	ISensorServiceCallback$Stub$Proxy(IBinder ibinder)
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
