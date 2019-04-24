// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sensor.aidl;

import android.app.PendingIntent;
import android.os.*;
import com.samsung.android.sensor.data.SensorConnectorInfo;
import com.samsung.android.sensor.data.SensorDeviceInfo;
import java.util.List;

// Referenced classes of package com.samsung.android.sensor.aidl:
//			ISensorServiceInterface, ISensorServiceCallback, ISensorDeviceScanCallback

private static class ISensorServiceInterface$Stub$Proxy
	implements ISensorServiceInterface
{

	public void addListener(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(sensorconnectorinfo == null) goto _L2; else goto _L1
	//    7   15:aload_1         
	//    8   16:ifnull          76
_L1:
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		sensorconnectorinfo.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #46  <Method void SensorConnectorInfo.writeToParcel(Parcel, int)>
_L3:
		if(sensordeviceinfo == null)
			break MISSING_BLOCK_LABEL_96;
	//   16   30:aload_2         
	//   17   31:ifnull          96
		parcel.writeInt(1);
	//   18   34:aload_3         
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		sensordeviceinfo.writeToParcel(parcel, 0);
	//   21   39:aload_2         
	//   22   40:aload_3         
	//   23   41:iconst_0        
	//   24   42:invokevirtual   #49  <Method void SensorDeviceInfo.writeToParcel(Parcel, int)>
_L4:
		mRemote.transact(11, parcel, parcel1, 0);
	//   25   45:aload_0         
	//   26   46:getfield        #19  <Field IBinder mRemote>
	//   27   49:bipush          11
	//   28   51:aload_3         
	//   29   52:aload           4
	//   30   54:iconst_0        
	//   31   55:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   32   60:pop             
		parcel1.readException();
	//   33   61:aload           4
	//   34   63:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   35   66:aload           4
	//   36   68:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   71:aload_3         
	//   38   72:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   39   75:return          
_L2:
		parcel.writeInt(0);
	//   40   76:aload_3         
	//   41   77:iconst_0        
	//   42   78:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L3
	//*  43   81:goto            30
		sensorconnectorinfo;
	//   44   84:astore_1        
		parcel1.recycle();
	//   45   85:aload           4
	//   46   87:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   47   90:aload_3         
	//   48   91:invokevirtual   #61  <Method void Parcel.recycle()>
		throw sensorconnectorinfo;
	//   49   94:aload_1         
	//   50   95:athrow          
		parcel.writeInt(0);
	//   51   96:aload_3         
	//   52   97:iconst_0        
	//   53   98:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L4
	//*  54  101:goto            45
	}

	public void addPendingIntent(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo, PendingIntent pendingintent)
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
		parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
	//    4   10:aload           4
	//    5   12:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
	//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(sensorconnectorinfo == null) goto _L2; else goto _L1
	//    7   17:aload_1         
	//    8   18:ifnull          101
_L1:
		parcel.writeInt(1);
	//    9   21:aload           4
	//   10   23:iconst_1        
	//   11   24:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		sensorconnectorinfo.writeToParcel(parcel, 0);
	//   12   27:aload_1         
	//   13   28:aload           4
	//   14   30:iconst_0        
	//   15   31:invokevirtual   #46  <Method void SensorConnectorInfo.writeToParcel(Parcel, int)>
_L5:
		if(sensordeviceinfo == null) goto _L4; else goto _L3
	//   16   34:aload_2         
	//   17   35:ifnull          123
_L3:
		parcel.writeInt(1);
	//   18   38:aload           4
	//   19   40:iconst_1        
	//   20   41:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		sensordeviceinfo.writeToParcel(parcel, 0);
	//   21   44:aload_2         
	//   22   45:aload           4
	//   23   47:iconst_0        
	//   24   48:invokevirtual   #49  <Method void SensorDeviceInfo.writeToParcel(Parcel, int)>
_L6:
		if(pendingintent == null)
			break MISSING_BLOCK_LABEL_132;
	//   25   51:aload_3         
	//   26   52:ifnull          132
		parcel.writeInt(1);
	//   27   55:aload           4
	//   28   57:iconst_1        
	//   29   58:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		pendingintent.writeToParcel(parcel, 0);
	//   30   61:aload_3         
	//   31   62:aload           4
	//   32   64:iconst_0        
	//   33   65:invokevirtual   #67  <Method void PendingIntent.writeToParcel(Parcel, int)>
_L7:
		mRemote.transact(13, parcel, parcel1, 0);
	//   34   68:aload_0         
	//   35   69:getfield        #19  <Field IBinder mRemote>
	//   36   72:bipush          13
	//   37   74:aload           4
	//   38   76:aload           5
	//   39   78:iconst_0        
	//   40   79:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   41   84:pop             
		parcel1.readException();
	//   42   85:aload           5
	//   43   87:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   44   90:aload           5
	//   45   92:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   46   95:aload           4
	//   47   97:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   48  100:return          
_L2:
		parcel.writeInt(0);
	//   49  101:aload           4
	//   50  103:iconst_0        
	//   51  104:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L5
	//*  52  107:goto            34
		sensorconnectorinfo;
	//   53  110:astore_1        
		parcel1.recycle();
	//   54  111:aload           5
	//   55  113:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   56  116:aload           4
	//   57  118:invokevirtual   #61  <Method void Parcel.recycle()>
		throw sensorconnectorinfo;
	//   58  121:aload_1         
	//   59  122:athrow          
_L4:
		parcel.writeInt(0);
	//   60  123:aload           4
	//   61  125:iconst_0        
	//   62  126:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L6
	//*  63  129:goto            51
		parcel.writeInt(0);
	//   64  132:aload           4
	//   65  134:iconst_0        
	//   66  135:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L7
	//*  67  138:goto            68
	}

	public IBinder asBinder()
	{
		return mRemote;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field IBinder mRemote>
	//    2    4:areturn         
	}

	public SensorDeviceInfo getDeviceInfoById(String s)
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
		parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   14:aload_2         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #74  <Method void Parcel.writeString(String)>
		mRemote.transact(17, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #19  <Field IBinder mRemote>
	//   12   23:bipush          17
	//   13   25:aload_2         
	//   14   26:aload_3         
	//   15   27:iconst_0        
	//   16   28:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   33:pop             
		parcel1.readException();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #58  <Method void Parcel.readException()>
		if(parcel1.readInt() == 0) goto _L2; else goto _L1
	//   20   38:aload_3         
	//   21   39:invokevirtual   #78  <Method int Parcel.readInt()>
	//   22   42:ifeq            68
_L1:
		s = ((String) ((SensorDeviceInfo)SensorDeviceInfo.CREATOR.createFromParcel(parcel1)));
	//   23   45:getstatic       #82  <Field android.os.Parcelable$Creator SensorDeviceInfo.CREATOR>
	//   24   48:aload_3         
	//   25   49:invokeinterface #88  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   26   54:checkcast       #48  <Class SensorDeviceInfo>
	//   27   57:astore_1        
_L4:
		parcel1.recycle();
	//   28   58:aload_3         
	//   29   59:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   62:aload_2         
	//   31   63:invokevirtual   #61  <Method void Parcel.recycle()>
		return ((SensorDeviceInfo) (s));
	//   32   66:aload_1         
	//   33   67:areturn         
_L2:
		s = null;
	//   34   68:aconst_null     
	//   35   69:astore_1        
		if(true) goto _L4; else goto _L3
	//   36   70:goto            58
_L3:
		s;
	//   37   73:astore_1        
		parcel1.recycle();
	//   38   74:aload_3         
	//   39   75:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   40   78:aload_2         
	//   41   79:invokevirtual   #61  <Method void Parcel.recycle()>
		throw s;
	//   42   82:aload_1         
	//   43   83:athrow          
	}

	public String getInterfaceDescriptor()
	{
		return "com.samsung.android.sensor.aidl.ISensorServiceInterface";
	//    0    0:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
	//    1    2:areturn         
	}

	public List getRegisteredAccessoryDeviceInfoList()
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
		java.util.ArrayList arraylist;
		parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
	//    4    8:aload_1         
	//    5    9:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(8, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          8
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #58  <Method void Parcel.readException()>
		arraylist = parcel1.createTypedArrayList(SensorDeviceInfo.CREATOR);
	//   17   33:aload_2         
	//   18   34:getstatic       #82  <Field android.os.Parcelable$Creator SensorDeviceInfo.CREATOR>
	//   19   37:invokevirtual   #96  <Method java.util.ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
	//   20   40:astore_3        
		parcel1.recycle();
	//   21   41:aload_2         
	//   22   42:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   23   45:aload_1         
	//   24   46:invokevirtual   #61  <Method void Parcel.recycle()>
		return ((List) (arraylist));
	//   25   49:aload_3         
	//   26   50:areturn         
		Exception exception;
		exception;
	//   27   51:astore_3        
		parcel1.recycle();
	//   28   52:aload_2         
	//   29   53:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   56:aload_1         
	//   31   57:invokevirtual   #61  <Method void Parcel.recycle()>
		throw exception;
	//   32   60:aload_3         
	//   33   61:athrow          
	}

	public SensorDeviceInfo getSupportedAndroidDeviceInfo(int i)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   15:aload_3         
	//    8   16:iload_1         
	//    9   17:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mRemote.transact(2, parcel, parcel1, 0);
	//   10   20:aload_0         
	//   11   21:getfield        #19  <Field IBinder mRemote>
	//   12   24:iconst_2        
	//   13   25:aload_3         
	//   14   26:aload           4
	//   15   28:iconst_0        
	//   16   29:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   34:pop             
		parcel1.readException();
	//   18   35:aload           4
	//   19   37:invokevirtual   #58  <Method void Parcel.readException()>
		if(parcel1.readInt() == 0) goto _L2; else goto _L1
	//   20   40:aload           4
	//   21   42:invokevirtual   #78  <Method int Parcel.readInt()>
	//   22   45:ifeq            73
_L1:
		SensorDeviceInfo sensordeviceinfo = (SensorDeviceInfo)SensorDeviceInfo.CREATOR.createFromParcel(parcel1);
	//   23   48:getstatic       #82  <Field android.os.Parcelable$Creator SensorDeviceInfo.CREATOR>
	//   24   51:aload           4
	//   25   53:invokeinterface #88  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   26   58:checkcast       #48  <Class SensorDeviceInfo>
	//   27   61:astore_2        
_L4:
		parcel1.recycle();
	//   28   62:aload           4
	//   29   64:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   67:aload_3         
	//   31   68:invokevirtual   #61  <Method void Parcel.recycle()>
		return sensordeviceinfo;
	//   32   71:aload_2         
	//   33   72:areturn         
_L2:
		sensordeviceinfo = null;
	//   34   73:aconst_null     
	//   35   74:astore_2        
		if(true) goto _L4; else goto _L3
	//   36   75:goto            62
_L3:
		Exception exception;
		exception;
	//   37   78:astore_2        
		parcel1.recycle();
	//   38   79:aload           4
	//   39   81:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   40   84:aload_3         
	//   41   85:invokevirtual   #61  <Method void Parcel.recycle()>
		throw exception;
	//   42   88:aload_2         
	//   43   89:athrow          
	}

	public List getSupportedAndroidDeviceInfoList()
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
		java.util.ArrayList arraylist;
		parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
	//    4    8:aload_1         
	//    5    9:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(1, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:iconst_1        
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   27:pop             
		parcel1.readException();
	//   15   28:aload_2         
	//   16   29:invokevirtual   #58  <Method void Parcel.readException()>
		arraylist = parcel1.createTypedArrayList(SensorDeviceInfo.CREATOR);
	//   17   32:aload_2         
	//   18   33:getstatic       #82  <Field android.os.Parcelable$Creator SensorDeviceInfo.CREATOR>
	//   19   36:invokevirtual   #96  <Method java.util.ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
	//   20   39:astore_3        
		parcel1.recycle();
	//   21   40:aload_2         
	//   22   41:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   23   44:aload_1         
	//   24   45:invokevirtual   #61  <Method void Parcel.recycle()>
		return ((List) (arraylist));
	//   25   48:aload_3         
	//   26   49:areturn         
		Exception exception;
		exception;
	//   27   50:astore_3        
		parcel1.recycle();
	//   28   51:aload_2         
	//   29   52:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   55:aload_1         
	//   31   56:invokevirtual   #61  <Method void Parcel.recycle()>
		throw exception;
	//   32   59:aload_3         
	//   33   60:athrow          
	}

	public boolean isAndroidSensorSupported(int i)
		throws RemoteException
	{
		boolean flag;
		Parcel parcel;
		Parcel parcel1;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		parcel = Parcel.obtain();
	//    2    2:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    5:astore_3        
		parcel1 = Parcel.obtain();
	//    4    6:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    5    9:astore          4
		parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
	//    6   11:aload_3         
	//    7   12:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
	//    8   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    9   17:aload_3         
	//   10   18:iload_1         
	//   11   19:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mRemote.transact(3, parcel, parcel1, 0);
	//   12   22:aload_0         
	//   13   23:getfield        #19  <Field IBinder mRemote>
	//   14   26:iconst_3        
	//   15   27:aload_3         
	//   16   28:aload           4
	//   17   30:iconst_0        
	//   18   31:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   19   36:pop             
		parcel1.readException();
	//   20   37:aload           4
	//   21   39:invokevirtual   #58  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   22   42:aload           4
	//   23   44:invokevirtual   #78  <Method int Parcel.readInt()>
	//   24   47:istore_1        
		if(i != 0)
	//*  25   48:iload_1         
	//*  26   49:ifeq            54
			flag = true;
	//   27   52:iconst_1        
	//   28   53:istore_2        
		parcel1.recycle();
	//   29   54:aload           4
	//   30   56:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   59:aload_3         
	//   32   60:invokevirtual   #61  <Method void Parcel.recycle()>
		return flag;
	//   33   63:iload_2         
	//   34   64:ireturn         
		Exception exception;
		exception;
	//   35   65:astore          5
		parcel1.recycle();
	//   36   67:aload           4
	//   37   69:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   72:aload_3         
	//   39   73:invokevirtual   #61  <Method void Parcel.recycle()>
		throw exception;
	//   40   76:aload           5
	//   41   78:athrow          
	}

	public boolean registerAccessoryDeviceInfo(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
		throws RemoteException
	{
		boolean flag;
		Parcel parcel;
		Parcel parcel1;
		flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		parcel = Parcel.obtain();
	//    2    3:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    6:astore          5
		parcel1 = Parcel.obtain();
	//    4    8:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    5   11:astore          6
		parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
	//    6   13:aload           5
	//    7   15:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
	//    8   17:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(sensorconnectorinfo == null) goto _L2; else goto _L1
	//    9   20:aload_1         
	//   10   21:ifnull          99
_L1:
		parcel.writeInt(1);
	//   11   24:aload           5
	//   12   26:iconst_1        
	//   13   27:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		sensorconnectorinfo.writeToParcel(parcel, 0);
	//   14   30:aload_1         
	//   15   31:aload           5
	//   16   33:iconst_0        
	//   17   34:invokevirtual   #46  <Method void SensorConnectorInfo.writeToParcel(Parcel, int)>
_L3:
		if(sensordeviceinfo == null)
			break MISSING_BLOCK_LABEL_121;
	//   18   37:aload_2         
	//   19   38:ifnull          121
		parcel.writeInt(1);
	//   20   41:aload           5
	//   21   43:iconst_1        
	//   22   44:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		sensordeviceinfo.writeToParcel(parcel, 0);
	//   23   47:aload_2         
	//   24   48:aload           5
	//   25   50:iconst_0        
	//   26   51:invokevirtual   #49  <Method void SensorDeviceInfo.writeToParcel(Parcel, int)>
_L4:
		int i;
		mRemote.transact(6, parcel, parcel1, 0);
	//   27   54:aload_0         
	//   28   55:getfield        #19  <Field IBinder mRemote>
	//   29   58:bipush          6
	//   30   60:aload           5
	//   31   62:aload           6
	//   32   64:iconst_0        
	//   33   65:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   34   70:pop             
		parcel1.readException();
	//   35   71:aload           6
	//   36   73:invokevirtual   #58  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   37   76:aload           6
	//   38   78:invokevirtual   #78  <Method int Parcel.readInt()>
	//   39   81:istore_3        
		if(i == 0)
	//*  40   82:iload_3         
	//*  41   83:ifeq            130
	//*  42   86:aload           6
	//*  43   88:invokevirtual   #61  <Method void Parcel.recycle()>
	//*  44   91:aload           5
	//*  45   93:invokevirtual   #61  <Method void Parcel.recycle()>
	//*  46   96:iload           4
	//*  47   98:ireturn         
	//*  48   99:aload           5
	//*  49  101:iconst_0        
	//*  50  102:invokevirtual   #40  <Method void Parcel.writeInt(int)>
	//*  51  105:goto            37
	//*  52  108:astore_1        
	//*  53  109:aload           6
	//*  54  111:invokevirtual   #61  <Method void Parcel.recycle()>
	//*  55  114:aload           5
	//*  56  116:invokevirtual   #61  <Method void Parcel.recycle()>
	//*  57  119:aload_1         
	//*  58  120:athrow          
	//*  59  121:aload           5
	//*  60  123:iconst_0        
	//*  61  124:invokevirtual   #40  <Method void Parcel.writeInt(int)>
	//*  62  127:goto            54
			flag = false;
	//   63  130:iconst_0        
	//   64  131:istore          4
		parcel1.recycle();
		parcel.recycle();
		return flag;
_L2:
		parcel.writeInt(0);
		  goto _L3
		sensorconnectorinfo;
		parcel1.recycle();
		parcel.recycle();
		throw sensorconnectorinfo;
		parcel.writeInt(0);
		  goto _L4
	//*  65  133:goto            86
	}

	public void registerConnector(SensorConnectorInfo sensorconnectorinfo, ISensorServiceCallback isensorservicecallback)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(sensorconnectorinfo == null) goto _L2; else goto _L1
	//    7   15:aload_1         
	//    8   16:ifnull          77
_L1:
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		sensorconnectorinfo.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #46  <Method void SensorConnectorInfo.writeToParcel(Parcel, int)>
_L3:
		if(isensorservicecallback == null)
			break MISSING_BLOCK_LABEL_97;
	//   16   30:aload_2         
	//   17   31:ifnull          97
		sensorconnectorinfo = ((SensorConnectorInfo) (isensorservicecallback.asBinder()));
	//   18   34:aload_2         
	//   19   35:invokeinterface #111 <Method IBinder ISensorServiceCallback.asBinder()>
	//   20   40:astore_1        
_L4:
		parcel.writeStrongBinder(((IBinder) (sensorconnectorinfo)));
	//   21   41:aload_3         
	//   22   42:aload_1         
	//   23   43:invokevirtual   #114 <Method void Parcel.writeStrongBinder(IBinder)>
		mRemote.transact(15, parcel, parcel1, 0);
	//   24   46:aload_0         
	//   25   47:getfield        #19  <Field IBinder mRemote>
	//   26   50:bipush          15
	//   27   52:aload_3         
	//   28   53:aload           4
	//   29   55:iconst_0        
	//   30   56:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   31   61:pop             
		parcel1.readException();
	//   32   62:aload           4
	//   33   64:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   34   67:aload           4
	//   35   69:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   72:aload_3         
	//   37   73:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   38   76:return          
_L2:
		parcel.writeInt(0);
	//   39   77:aload_3         
	//   40   78:iconst_0        
	//   41   79:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L3
	//*  42   82:goto            30
		sensorconnectorinfo;
	//   43   85:astore_1        
		parcel1.recycle();
	//   44   86:aload           4
	//   45   88:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   46   91:aload_3         
	//   47   92:invokevirtual   #61  <Method void Parcel.recycle()>
		throw sensorconnectorinfo;
	//   48   95:aload_1         
	//   49   96:athrow          
		sensorconnectorinfo = null;
	//   50   97:aconst_null     
	//   51   98:astore_1        
		  goto _L4
	//*  52   99:goto            41
	}

	public void releaseAccess(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(sensorconnectorinfo == null) goto _L2; else goto _L1
	//    7   15:aload_1         
	//    8   16:ifnull          76
_L1:
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		sensorconnectorinfo.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #46  <Method void SensorConnectorInfo.writeToParcel(Parcel, int)>
_L3:
		if(sensordeviceinfo == null)
			break MISSING_BLOCK_LABEL_96;
	//   16   30:aload_2         
	//   17   31:ifnull          96
		parcel.writeInt(1);
	//   18   34:aload_3         
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		sensordeviceinfo.writeToParcel(parcel, 0);
	//   21   39:aload_2         
	//   22   40:aload_3         
	//   23   41:iconst_0        
	//   24   42:invokevirtual   #49  <Method void SensorDeviceInfo.writeToParcel(Parcel, int)>
_L4:
		mRemote.transact(10, parcel, parcel1, 0);
	//   25   45:aload_0         
	//   26   46:getfield        #19  <Field IBinder mRemote>
	//   27   49:bipush          10
	//   28   51:aload_3         
	//   29   52:aload           4
	//   30   54:iconst_0        
	//   31   55:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   32   60:pop             
		parcel1.readException();
	//   33   61:aload           4
	//   34   63:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   35   66:aload           4
	//   36   68:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   71:aload_3         
	//   38   72:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   39   75:return          
_L2:
		parcel.writeInt(0);
	//   40   76:aload_3         
	//   41   77:iconst_0        
	//   42   78:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L3
	//*  43   81:goto            30
		sensorconnectorinfo;
	//   44   84:astore_1        
		parcel1.recycle();
	//   45   85:aload           4
	//   46   87:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   47   90:aload_3         
	//   48   91:invokevirtual   #61  <Method void Parcel.recycle()>
		throw sensorconnectorinfo;
	//   49   94:aload_1         
	//   50   95:athrow          
		parcel.writeInt(0);
	//   51   96:aload_3         
	//   52   97:iconst_0        
	//   53   98:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L4
	//*  54  101:goto            45
	}

	public void removeListener(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(sensorconnectorinfo == null) goto _L2; else goto _L1
	//    7   15:aload_1         
	//    8   16:ifnull          76
_L1:
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		sensorconnectorinfo.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #46  <Method void SensorConnectorInfo.writeToParcel(Parcel, int)>
_L3:
		if(sensordeviceinfo == null)
			break MISSING_BLOCK_LABEL_96;
	//   16   30:aload_2         
	//   17   31:ifnull          96
		parcel.writeInt(1);
	//   18   34:aload_3         
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		sensordeviceinfo.writeToParcel(parcel, 0);
	//   21   39:aload_2         
	//   22   40:aload_3         
	//   23   41:iconst_0        
	//   24   42:invokevirtual   #49  <Method void SensorDeviceInfo.writeToParcel(Parcel, int)>
_L4:
		mRemote.transact(12, parcel, parcel1, 0);
	//   25   45:aload_0         
	//   26   46:getfield        #19  <Field IBinder mRemote>
	//   27   49:bipush          12
	//   28   51:aload_3         
	//   29   52:aload           4
	//   30   54:iconst_0        
	//   31   55:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   32   60:pop             
		parcel1.readException();
	//   33   61:aload           4
	//   34   63:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   35   66:aload           4
	//   36   68:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   71:aload_3         
	//   38   72:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   39   75:return          
_L2:
		parcel.writeInt(0);
	//   40   76:aload_3         
	//   41   77:iconst_0        
	//   42   78:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L3
	//*  43   81:goto            30
		sensorconnectorinfo;
	//   44   84:astore_1        
		parcel1.recycle();
	//   45   85:aload           4
	//   46   87:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   47   90:aload_3         
	//   48   91:invokevirtual   #61  <Method void Parcel.recycle()>
		throw sensorconnectorinfo;
	//   49   94:aload_1         
	//   50   95:athrow          
		parcel.writeInt(0);
	//   51   96:aload_3         
	//   52   97:iconst_0        
	//   53   98:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L4
	//*  54  101:goto            45
	}

	public void removePendingIntent(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo, PendingIntent pendingintent)
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
		parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
	//    4   10:aload           4
	//    5   12:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
	//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(sensorconnectorinfo == null) goto _L2; else goto _L1
	//    7   17:aload_1         
	//    8   18:ifnull          101
_L1:
		parcel.writeInt(1);
	//    9   21:aload           4
	//   10   23:iconst_1        
	//   11   24:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		sensorconnectorinfo.writeToParcel(parcel, 0);
	//   12   27:aload_1         
	//   13   28:aload           4
	//   14   30:iconst_0        
	//   15   31:invokevirtual   #46  <Method void SensorConnectorInfo.writeToParcel(Parcel, int)>
_L5:
		if(sensordeviceinfo == null) goto _L4; else goto _L3
	//   16   34:aload_2         
	//   17   35:ifnull          123
_L3:
		parcel.writeInt(1);
	//   18   38:aload           4
	//   19   40:iconst_1        
	//   20   41:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		sensordeviceinfo.writeToParcel(parcel, 0);
	//   21   44:aload_2         
	//   22   45:aload           4
	//   23   47:iconst_0        
	//   24   48:invokevirtual   #49  <Method void SensorDeviceInfo.writeToParcel(Parcel, int)>
_L6:
		if(pendingintent == null)
			break MISSING_BLOCK_LABEL_132;
	//   25   51:aload_3         
	//   26   52:ifnull          132
		parcel.writeInt(1);
	//   27   55:aload           4
	//   28   57:iconst_1        
	//   29   58:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		pendingintent.writeToParcel(parcel, 0);
	//   30   61:aload_3         
	//   31   62:aload           4
	//   32   64:iconst_0        
	//   33   65:invokevirtual   #67  <Method void PendingIntent.writeToParcel(Parcel, int)>
_L7:
		mRemote.transact(14, parcel, parcel1, 0);
	//   34   68:aload_0         
	//   35   69:getfield        #19  <Field IBinder mRemote>
	//   36   72:bipush          14
	//   37   74:aload           4
	//   38   76:aload           5
	//   39   78:iconst_0        
	//   40   79:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   41   84:pop             
		parcel1.readException();
	//   42   85:aload           5
	//   43   87:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   44   90:aload           5
	//   45   92:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   46   95:aload           4
	//   47   97:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   48  100:return          
_L2:
		parcel.writeInt(0);
	//   49  101:aload           4
	//   50  103:iconst_0        
	//   51  104:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L5
	//*  52  107:goto            34
		sensorconnectorinfo;
	//   53  110:astore_1        
		parcel1.recycle();
	//   54  111:aload           5
	//   55  113:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   56  116:aload           4
	//   57  118:invokevirtual   #61  <Method void Parcel.recycle()>
		throw sensorconnectorinfo;
	//   58  121:aload_1         
	//   59  122:athrow          
_L4:
		parcel.writeInt(0);
	//   60  123:aload           4
	//   61  125:iconst_0        
	//   62  126:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L6
	//*  63  129:goto            51
		parcel.writeInt(0);
	//   64  132:aload           4
	//   65  134:iconst_0        
	//   66  135:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L7
	//*  67  138:goto            68
	}

	public void requestAccess(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(sensorconnectorinfo == null) goto _L2; else goto _L1
	//    7   15:aload_1         
	//    8   16:ifnull          76
_L1:
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		sensorconnectorinfo.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #46  <Method void SensorConnectorInfo.writeToParcel(Parcel, int)>
_L3:
		if(sensordeviceinfo == null)
			break MISSING_BLOCK_LABEL_96;
	//   16   30:aload_2         
	//   17   31:ifnull          96
		parcel.writeInt(1);
	//   18   34:aload_3         
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		sensordeviceinfo.writeToParcel(parcel, 0);
	//   21   39:aload_2         
	//   22   40:aload_3         
	//   23   41:iconst_0        
	//   24   42:invokevirtual   #49  <Method void SensorDeviceInfo.writeToParcel(Parcel, int)>
_L4:
		mRemote.transact(9, parcel, parcel1, 0);
	//   25   45:aload_0         
	//   26   46:getfield        #19  <Field IBinder mRemote>
	//   27   49:bipush          9
	//   28   51:aload_3         
	//   29   52:aload           4
	//   30   54:iconst_0        
	//   31   55:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   32   60:pop             
		parcel1.readException();
	//   33   61:aload           4
	//   34   63:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   35   66:aload           4
	//   36   68:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   71:aload_3         
	//   38   72:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   39   75:return          
_L2:
		parcel.writeInt(0);
	//   40   76:aload_3         
	//   41   77:iconst_0        
	//   42   78:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L3
	//*  43   81:goto            30
		sensorconnectorinfo;
	//   44   84:astore_1        
		parcel1.recycle();
	//   45   85:aload           4
	//   46   87:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   47   90:aload_3         
	//   48   91:invokevirtual   #61  <Method void Parcel.recycle()>
		throw sensorconnectorinfo;
	//   49   94:aload_1         
	//   50   95:athrow          
		parcel.writeInt(0);
	//   51   96:aload_3         
	//   52   97:iconst_0        
	//   53   98:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L4
	//*  54  101:goto            45
	}

	public void setBluetoothIdentifier(List list)
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
		parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeStringList(list);
	//    7   14:aload_2         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #123 <Method void Parcel.writeStringList(List)>
		mRemote.transact(18, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #19  <Field IBinder mRemote>
	//   12   23:bipush          18
	//   13   25:aload_2         
	//   14   26:aload_3         
	//   15   27:iconst_0        
	//   16   28:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   33:pop             
		parcel1.readException();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   24   46:return          
		list;
	//   25   47:astore_1        
		parcel1.recycle();
	//   26   48:aload_3         
	//   27   49:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   52:aload_2         
	//   29   53:invokevirtual   #61  <Method void Parcel.recycle()>
		throw list;
	//   30   56:aload_1         
	//   31   57:athrow          
	}

	public void startAccessoryDeviceScan(SensorConnectorInfo sensorconnectorinfo, ISensorDeviceScanCallback isensordevicescancallback)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(sensorconnectorinfo == null) goto _L2; else goto _L1
	//    7   15:aload_1         
	//    8   16:ifnull          76
_L1:
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		sensorconnectorinfo.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #46  <Method void SensorConnectorInfo.writeToParcel(Parcel, int)>
_L3:
		if(isensordevicescancallback == null)
			break MISSING_BLOCK_LABEL_96;
	//   16   30:aload_2         
	//   17   31:ifnull          96
		sensorconnectorinfo = ((SensorConnectorInfo) (isensordevicescancallback.asBinder()));
	//   18   34:aload_2         
	//   19   35:invokeinterface #129 <Method IBinder ISensorDeviceScanCallback.asBinder()>
	//   20   40:astore_1        
_L4:
		parcel.writeStrongBinder(((IBinder) (sensorconnectorinfo)));
	//   21   41:aload_3         
	//   22   42:aload_1         
	//   23   43:invokevirtual   #114 <Method void Parcel.writeStrongBinder(IBinder)>
		mRemote.transact(4, parcel, parcel1, 0);
	//   24   46:aload_0         
	//   25   47:getfield        #19  <Field IBinder mRemote>
	//   26   50:iconst_4        
	//   27   51:aload_3         
	//   28   52:aload           4
	//   29   54:iconst_0        
	//   30   55:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   31   60:pop             
		parcel1.readException();
	//   32   61:aload           4
	//   33   63:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   34   66:aload           4
	//   35   68:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   71:aload_3         
	//   37   72:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   38   75:return          
_L2:
		parcel.writeInt(0);
	//   39   76:aload_3         
	//   40   77:iconst_0        
	//   41   78:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L3
	//*  42   81:goto            30
		sensorconnectorinfo;
	//   43   84:astore_1        
		parcel1.recycle();
	//   44   85:aload           4
	//   45   87:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   46   90:aload_3         
	//   47   91:invokevirtual   #61  <Method void Parcel.recycle()>
		throw sensorconnectorinfo;
	//   48   94:aload_1         
	//   49   95:athrow          
		sensorconnectorinfo = null;
	//   50   96:aconst_null     
	//   51   97:astore_1        
		  goto _L4
	//*  52   98:goto            41
	}

	public void stopAccessoryDeviceScan(SensorConnectorInfo sensorconnectorinfo)
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
		parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(sensorconnectorinfo == null)
			break MISSING_BLOCK_LABEL_56;
	//    7   14:aload_1         
	//    8   15:ifnull          56
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		sensorconnectorinfo.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #46  <Method void SensorConnectorInfo.writeToParcel(Parcel, int)>
_L1:
		mRemote.transact(5, parcel, parcel1, 0);
	//   16   29:aload_0         
	//   17   30:getfield        #19  <Field IBinder mRemote>
	//   18   33:iconst_5        
	//   19   34:aload_2         
	//   20   35:aload_3         
	//   21   36:iconst_0        
	//   22   37:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   42:pop             
		parcel1.readException();
	//   24   43:aload_3         
	//   25   44:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   47:aload_3         
	//   27   48:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   51:aload_2         
	//   29   52:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   30   55:return          
		parcel.writeInt(0);
	//   31   56:aload_2         
	//   32   57:iconst_0        
	//   33   58:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  34   61:goto            29
		sensorconnectorinfo;
	//   35   64:astore_1        
		parcel1.recycle();
	//   36   65:aload_3         
	//   37   66:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   69:aload_2         
	//   39   70:invokevirtual   #61  <Method void Parcel.recycle()>
		throw sensorconnectorinfo;
	//   40   73:aload_1         
	//   41   74:athrow          
	}

	public void unregisterAccessoryDeviceInfo(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(sensorconnectorinfo == null) goto _L2; else goto _L1
	//    7   15:aload_1         
	//    8   16:ifnull          76
_L1:
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		sensorconnectorinfo.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #46  <Method void SensorConnectorInfo.writeToParcel(Parcel, int)>
_L3:
		if(sensordeviceinfo == null)
			break MISSING_BLOCK_LABEL_96;
	//   16   30:aload_2         
	//   17   31:ifnull          96
		parcel.writeInt(1);
	//   18   34:aload_3         
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		sensordeviceinfo.writeToParcel(parcel, 0);
	//   21   39:aload_2         
	//   22   40:aload_3         
	//   23   41:iconst_0        
	//   24   42:invokevirtual   #49  <Method void SensorDeviceInfo.writeToParcel(Parcel, int)>
_L4:
		mRemote.transact(7, parcel, parcel1, 0);
	//   25   45:aload_0         
	//   26   46:getfield        #19  <Field IBinder mRemote>
	//   27   49:bipush          7
	//   28   51:aload_3         
	//   29   52:aload           4
	//   30   54:iconst_0        
	//   31   55:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   32   60:pop             
		parcel1.readException();
	//   33   61:aload           4
	//   34   63:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   35   66:aload           4
	//   36   68:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   71:aload_3         
	//   38   72:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   39   75:return          
_L2:
		parcel.writeInt(0);
	//   40   76:aload_3         
	//   41   77:iconst_0        
	//   42   78:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L3
	//*  43   81:goto            30
		sensorconnectorinfo;
	//   44   84:astore_1        
		parcel1.recycle();
	//   45   85:aload           4
	//   46   87:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   47   90:aload_3         
	//   48   91:invokevirtual   #61  <Method void Parcel.recycle()>
		throw sensorconnectorinfo;
	//   49   94:aload_1         
	//   50   95:athrow          
		parcel.writeInt(0);
	//   51   96:aload_3         
	//   52   97:iconst_0        
	//   53   98:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L4
	//*  54  101:goto            45
	}

	public void unregisterConnector(SensorConnectorInfo sensorconnectorinfo)
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
		parcel.writeInterfaceToken("com.samsung.android.sensor.aidl.ISensorServiceInterface");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "com.samsung.android.sensor.aidl.ISensorServiceInterface">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(sensorconnectorinfo == null)
			break MISSING_BLOCK_LABEL_57;
	//    7   14:aload_1         
	//    8   15:ifnull          57
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		sensorconnectorinfo.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #46  <Method void SensorConnectorInfo.writeToParcel(Parcel, int)>
_L1:
		mRemote.transact(16, parcel, parcel1, 0);
	//   16   29:aload_0         
	//   17   30:getfield        #19  <Field IBinder mRemote>
	//   18   33:bipush          16
	//   19   35:aload_2         
	//   20   36:aload_3         
	//   21   37:iconst_0        
	//   22   38:invokeinterface #55  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   43:pop             
		parcel1.readException();
	//   24   44:aload_3         
	//   25   45:invokevirtual   #58  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   48:aload_3         
	//   27   49:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   52:aload_2         
	//   29   53:invokevirtual   #61  <Method void Parcel.recycle()>
		return;
	//   30   56:return          
		parcel.writeInt(0);
	//   31   57:aload_2         
	//   32   58:iconst_0        
	//   33   59:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  34   62:goto            29
		sensorconnectorinfo;
	//   35   65:astore_1        
		parcel1.recycle();
	//   36   66:aload_3         
	//   37   67:invokevirtual   #61  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   70:aload_2         
	//   39   71:invokevirtual   #61  <Method void Parcel.recycle()>
		throw sensorconnectorinfo;
	//   40   74:aload_1         
	//   41   75:athrow          
	}

	private IBinder mRemote;

	ISensorServiceInterface$Stub$Proxy(IBinder ibinder)
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
