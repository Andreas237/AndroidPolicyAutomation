// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sensor.aidl;

import android.os.*;
import com.samsung.android.sensor.data.SensorData;
import com.samsung.android.sensor.data.SensorDeviceInfo;

// Referenced classes of package com.samsung.android.sensor.aidl:
//			ISensorServiceCallback

public static abstract class ISensorServiceCallback$Stub extends Binder
	implements ISensorServiceCallback
{
	private static class Proxy
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


	public static ISensorServiceCallback asInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.samsung.android.sensor.aidl.ISensorServiceCallback");
	//    4    6:aload_0         
	//    5    7:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceCallback">
	//    6    9:invokeinterface #42  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof ISensorServiceCallback))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class ISensorServiceCallback>
	//*  12   23:ifeq            31
			return (ISensorServiceCallback)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class ISensorServiceCallback>
	//   15   30:areturn         
		else
			return ((ISensorServiceCallback) (new Proxy(ibinder)));
	//   16   31:new             #9   <Class ISensorServiceCallback$Stub$Proxy>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #45  <Method void ISensorServiceCallback$Stub$Proxy(IBinder)>
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
	//*   1    1:lookupswitch    6: default 60
	//	               1: 78
	//	               2: 126
	//	               3: 176
	//	               4: 224
	//	               5: 266
	//	               1598968902: 70
		default:
			return super.onTransact(i, parcel, parcel1, j);
	//    2   60:aload_0         
	//    3   61:iload_1         
	//    4   62:aload_2         
	//    5   63:aload_3         
	//    6   64:iload           4
	//    7   66:invokespecial   #53  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//    8   69:ireturn         

		case 1598968902: 
			parcel1.writeString("com.samsung.android.sensor.aidl.ISensorServiceCallback");
	//    9   70:aload_3         
	//   10   71:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceCallback">
	//   11   73:invokevirtual   #59  <Method void Parcel.writeString(String)>
			return true;
	//   12   76:iconst_1        
	//   13   77:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorServiceCallback");
	//   14   78:aload_2         
	//   15   79:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceCallback">
	//   16   81:invokevirtual   #62  <Method void Parcel.enforceInterface(String)>
			i = parcel.readInt();
	//   17   84:aload_2         
	//   18   85:invokevirtual   #66  <Method int Parcel.readInt()>
	//   19   88:istore_1        
			if(parcel.readInt() != 0)
	//*  20   89:aload_2         
	//*  21   90:invokevirtual   #66  <Method int Parcel.readInt()>
	//*  22   93:ifeq            121
				parcel = ((Parcel) ((SensorDeviceInfo)SensorDeviceInfo.CREATOR.createFromParcel(parcel)));
	//   23   96:getstatic       #72  <Field android.os.Parcelable$Creator SensorDeviceInfo.CREATOR>
	//   24   99:aload_2         
	//   25  100:invokeinterface #78  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   26  105:checkcast       #68  <Class SensorDeviceInfo>
	//   27  108:astore_2        
			else
	//*  28  109:aload_0         
	//*  29  110:iload_1         
	//*  30  111:aload_2         
	//*  31  112:invokevirtual   #82  <Method void onDeviceAccessResultReceived(int, SensorDeviceInfo)>
	//*  32  115:aload_3         
	//*  33  116:invokevirtual   #85  <Method void Parcel.writeNoException()>
	//*  34  119:iconst_1        
	//*  35  120:ireturn         
				parcel = null;
	//   36  121:aconst_null     
	//   37  122:astore_2        
			onDeviceAccessResultReceived(i, ((SensorDeviceInfo) (parcel)));
			parcel1.writeNoException();
			return true;

	//*  38  123:goto            109
		case 2: // '\002'
			parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorServiceCallback");
	//   39  126:aload_2         
	//   40  127:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceCallback">
	//   41  129:invokevirtual   #62  <Method void Parcel.enforceInterface(String)>
			String s = parcel.readString();
	//   42  132:aload_2         
	//   43  133:invokevirtual   #89  <Method String Parcel.readString()>
	//   44  136:astore          5
			if(parcel.readInt() != 0)
	//*  45  138:aload_2         
	//*  46  139:invokevirtual   #66  <Method int Parcel.readInt()>
	//*  47  142:ifeq            171
				parcel = ((Parcel) ((SensorData)SensorData.CREATOR.createFromParcel(parcel)));
	//   48  145:getstatic       #92  <Field android.os.Parcelable$Creator SensorData.CREATOR>
	//   49  148:aload_2         
	//   50  149:invokeinterface #78  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   51  154:checkcast       #91  <Class SensorData>
	//   52  157:astore_2        
			else
	//*  53  158:aload_0         
	//*  54  159:aload           5
	//*  55  161:aload_2         
	//*  56  162:invokevirtual   #96  <Method void onDataReceived(String, SensorData)>
	//*  57  165:aload_3         
	//*  58  166:invokevirtual   #85  <Method void Parcel.writeNoException()>
	//*  59  169:iconst_1        
	//*  60  170:ireturn         
				parcel = null;
	//   61  171:aconst_null     
	//   62  172:astore_2        
			onDataReceived(s, ((SensorData) (parcel)));
			parcel1.writeNoException();
			return true;

	//*  63  173:goto            158
		case 3: // '\003'
			parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorServiceCallback");
	//   64  176:aload_2         
	//   65  177:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceCallback">
	//   66  179:invokevirtual   #62  <Method void Parcel.enforceInterface(String)>
			i = parcel.readInt();
	//   67  182:aload_2         
	//   68  183:invokevirtual   #66  <Method int Parcel.readInt()>
	//   69  186:istore_1        
			if(parcel.readInt() != 0)
	//*  70  187:aload_2         
	//*  71  188:invokevirtual   #66  <Method int Parcel.readInt()>
	//*  72  191:ifeq            219
				parcel = ((Parcel) ((SensorDeviceInfo)SensorDeviceInfo.CREATOR.createFromParcel(parcel)));
	//   73  194:getstatic       #72  <Field android.os.Parcelable$Creator SensorDeviceInfo.CREATOR>
	//   74  197:aload_2         
	//   75  198:invokeinterface #78  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   76  203:checkcast       #68  <Class SensorDeviceInfo>
	//   77  206:astore_2        
			else
	//*  78  207:aload_0         
	//*  79  208:iload_1         
	//*  80  209:aload_2         
	//*  81  210:invokevirtual   #99  <Method void onStateChanged(int, SensorDeviceInfo)>
	//*  82  213:aload_3         
	//*  83  214:invokevirtual   #85  <Method void Parcel.writeNoException()>
	//*  84  217:iconst_1        
	//*  85  218:ireturn         
				parcel = null;
	//   86  219:aconst_null     
	//   87  220:astore_2        
			onStateChanged(i, ((SensorDeviceInfo) (parcel)));
			parcel1.writeNoException();
			return true;

	//*  88  221:goto            207
		case 4: // '\004'
			parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorServiceCallback");
	//   89  224:aload_2         
	//   90  225:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceCallback">
	//   91  227:invokevirtual   #62  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//*  92  230:aload_2         
	//*  93  231:invokevirtual   #66  <Method int Parcel.readInt()>
	//*  94  234:ifeq            261
				parcel = ((Parcel) ((SensorDeviceInfo)SensorDeviceInfo.CREATOR.createFromParcel(parcel)));
	//   95  237:getstatic       #72  <Field android.os.Parcelable$Creator SensorDeviceInfo.CREATOR>
	//   96  240:aload_2         
	//   97  241:invokeinterface #78  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   98  246:checkcast       #68  <Class SensorDeviceInfo>
	//   99  249:astore_2        
			else
	//* 100  250:aload_0         
	//* 101  251:aload_2         
	//* 102  252:invokevirtual   #103 <Method void onSensorDeviceRegistered(SensorDeviceInfo)>
	//* 103  255:aload_3         
	//* 104  256:invokevirtual   #85  <Method void Parcel.writeNoException()>
	//* 105  259:iconst_1        
	//* 106  260:ireturn         
				parcel = null;
	//  107  261:aconst_null     
	//  108  262:astore_2        
			onSensorDeviceRegistered(((SensorDeviceInfo) (parcel)));
			parcel1.writeNoException();
			return true;

	//* 109  263:goto            250
		case 5: // '\005'
			parcel.enforceInterface("com.samsung.android.sensor.aidl.ISensorServiceCallback");
	//  110  266:aload_2         
	//  111  267:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceCallback">
	//  112  269:invokevirtual   #62  <Method void Parcel.enforceInterface(String)>
			break;
		}
		if(parcel.readInt() != 0)
	//* 113  272:aload_2         
	//* 114  273:invokevirtual   #66  <Method int Parcel.readInt()>
	//* 115  276:ifeq            303
			parcel = ((Parcel) ((SensorDeviceInfo)SensorDeviceInfo.CREATOR.createFromParcel(parcel)));
	//  116  279:getstatic       #72  <Field android.os.Parcelable$Creator SensorDeviceInfo.CREATOR>
	//  117  282:aload_2         
	//  118  283:invokeinterface #78  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  119  288:checkcast       #68  <Class SensorDeviceInfo>
	//  120  291:astore_2        
		else
	//* 121  292:aload_0         
	//* 122  293:aload_2         
	//* 123  294:invokevirtual   #106 <Method void onSensorDeviceUnregistered(SensorDeviceInfo)>
	//* 124  297:aload_3         
	//* 125  298:invokevirtual   #85  <Method void Parcel.writeNoException()>
	//* 126  301:iconst_1        
	//* 127  302:ireturn         
			parcel = null;
	//  128  303:aconst_null     
	//  129  304:astore_2        
		onSensorDeviceUnregistered(((SensorDeviceInfo) (parcel)));
		parcel1.writeNoException();
		return true;
	//* 130  305:goto            292
	}

	private static final String DESCRIPTOR = "com.samsung.android.sensor.aidl.ISensorServiceCallback";
	static final int TRANSACTION_onDataReceived = 2;
	static final int TRANSACTION_onDeviceAccessResultReceived = 1;
	static final int TRANSACTION_onSensorDeviceRegistered = 4;
	static final int TRANSACTION_onSensorDeviceUnregistered = 5;
	static final int TRANSACTION_onStateChanged = 3;

	public ISensorServiceCallback$Stub()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.samsung.android.sensor.aidl.ISensorServiceCallback");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #14  <String "com.samsung.android.sensor.aidl.ISensorServiceCallback">
	//    5    8:invokevirtual   #33  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
