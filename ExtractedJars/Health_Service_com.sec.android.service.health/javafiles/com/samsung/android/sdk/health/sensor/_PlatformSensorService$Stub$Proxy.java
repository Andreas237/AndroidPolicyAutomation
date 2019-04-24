// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sdk.health.sensor;

import android.os.*;
import com.samsung.android.sdk.health.sensor._private._PrivilegeSensorDevice;
import java.util.List;

// Referenced classes of package com.samsung.android.sdk.health.sensor:
//			_PlatformSensorService, _PlatformSensorDataListener

private static class _PlatformSensorService$Stub$Proxy
	implements _PlatformSensorService
{

	public IBinder asBinder()
	{
		return mRemote;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field IBinder mRemote>
	//    2    4:areturn         
	}

	public int checkAvailability(int i, int j, int k)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore          4
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    3    8:astore          5
		parcel.writeInterfaceToken("com.samsung.android.sdk.health.sensor._PlatformSensorService");
	//    4   10:aload           4
	//    5   12:ldc1            #34  <String "com.samsung.android.sdk.health.sensor._PlatformSensorService">
	//    6   14:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   17:aload           4
	//    8   19:iload_1         
	//    9   20:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		parcel.writeInt(j);
	//   10   23:aload           4
	//   11   25:iload_2         
	//   12   26:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		parcel.writeInt(k);
	//   13   29:aload           4
	//   14   31:iload_3         
	//   15   32:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		mRemote.transact(2, parcel, parcel1, 0);
	//   16   35:aload_0         
	//   17   36:getfield        #19  <Field IBinder mRemote>
	//   18   39:iconst_2        
	//   19   40:aload           4
	//   20   42:aload           5
	//   21   44:iconst_0        
	//   22   45:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   50:pop             
		parcel1.readException();
	//   24   51:aload           5
	//   25   53:invokevirtual   #51  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   26   56:aload           5
	//   27   58:invokevirtual   #55  <Method int Parcel.readInt()>
	//   28   61:istore_1        
		parcel1.recycle();
	//   29   62:aload           5
	//   30   64:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   67:aload           4
	//   32   69:invokevirtual   #58  <Method void Parcel.recycle()>
		return i;
	//   33   72:iload_1         
	//   34   73:ireturn         
		Exception exception;
		exception;
	//   35   74:astore          6
		parcel1.recycle();
	//   36   76:aload           5
	//   37   78:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   81:aload           4
	//   39   83:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   40   86:aload           6
	//   41   88:athrow          
	}

	public void close(_PrivilegeSensorDevice _pprivilegesensordevice)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.samsung.android.sdk.health.sensor._PlatformSensorService");
	//    4    8:aload_2         
	//    5    9:ldc1            #34  <String "com.samsung.android.sdk.health.sensor._PlatformSensorService">
	//    6   11:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		if(_pprivilegesensordevice == null)
			break MISSING_BLOCK_LABEL_56;
	//    7   14:aload_1         
	//    8   15:ifnull          56
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		_pprivilegesensordevice.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #67  <Method void _PrivilegeSensorDevice.writeToParcel(Parcel, int)>
_L1:
		mRemote.transact(5, parcel, parcel1, 0);
	//   16   29:aload_0         
	//   17   30:getfield        #19  <Field IBinder mRemote>
	//   18   33:iconst_5        
	//   19   34:aload_2         
	//   20   35:aload_3         
	//   21   36:iconst_0        
	//   22   37:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   42:pop             
		parcel1.readException();
	//   24   43:aload_3         
	//   25   44:invokevirtual   #51  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   47:aload_3         
	//   27   48:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   51:aload_2         
	//   29   52:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   30   55:return          
		parcel.writeInt(0);
	//   31   56:aload_2         
	//   32   57:iconst_0        
	//   33   58:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  34   61:goto            29
		_pprivilegesensordevice;
	//   35   64:astore_1        
		parcel1.recycle();
	//   36   65:aload_3         
	//   37   66:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   69:aload_2         
	//   39   70:invokevirtual   #58  <Method void Parcel.recycle()>
		throw _pprivilegesensordevice;
	//   40   73:aload_1         
	//   41   74:athrow          
	}

	public int getAPIVersion()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		int i;
		parcel.writeInterfaceToken("com.samsung.android.sdk.health.sensor._PlatformSensorService");
	//    4    8:aload_2         
	//    5    9:ldc1            #34  <String "com.samsung.android.sdk.health.sensor._PlatformSensorService">
	//    6   11:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(6, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          6
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #51  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #55  <Method int Parcel.readInt()>
	//   19   37:istore_1        
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
		return i;
	//   24   46:iload_1         
	//   25   47:ireturn         
		Exception exception;
		exception;
	//   26   48:astore          4
		parcel1.recycle();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   31   58:aload           4
	//   32   60:athrow          
	}

	public List getConnectedDevices(int i, int j, int k)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    1    3:astore          4
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    3    8:astore          5
		java.util.ArrayList arraylist;
		parcel.writeInterfaceToken("com.samsung.android.sdk.health.sensor._PlatformSensorService");
	//    4   10:aload           4
	//    5   12:ldc1            #34  <String "com.samsung.android.sdk.health.sensor._PlatformSensorService">
	//    6   14:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   17:aload           4
	//    8   19:iload_1         
	//    9   20:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		parcel.writeInt(j);
	//   10   23:aload           4
	//   11   25:iload_2         
	//   12   26:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		parcel.writeInt(k);
	//   13   29:aload           4
	//   14   31:iload_3         
	//   15   32:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		mRemote.transact(1, parcel, parcel1, 0);
	//   16   35:aload_0         
	//   17   36:getfield        #19  <Field IBinder mRemote>
	//   18   39:iconst_1        
	//   19   40:aload           4
	//   20   42:aload           5
	//   21   44:iconst_0        
	//   22   45:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   50:pop             
		parcel1.readException();
	//   24   51:aload           5
	//   25   53:invokevirtual   #51  <Method void Parcel.readException()>
		arraylist = parcel1.createTypedArrayList(_PrivilegeSensorDevice.CREATOR);
	//   26   56:aload           5
	//   27   58:getstatic       #74  <Field android.os.Parcelable$Creator _PrivilegeSensorDevice.CREATOR>
	//   28   61:invokevirtual   #78  <Method java.util.ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
	//   29   64:astore          6
		parcel1.recycle();
	//   30   66:aload           5
	//   31   68:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   32   71:aload           4
	//   33   73:invokevirtual   #58  <Method void Parcel.recycle()>
		return ((List) (arraylist));
	//   34   76:aload           6
	//   35   78:areturn         
		Exception exception;
		exception;
	//   36   79:astore          6
		parcel1.recycle();
	//   37   81:aload           5
	//   38   83:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   39   86:aload           4
	//   40   88:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   41   91:aload           6
	//   42   93:athrow          
	}

	public String getInterfaceDescriptor()
	{
		return "com.samsung.android.sdk.health.sensor._PlatformSensorService";
	//    0    0:ldc1            #34  <String "com.samsung.android.sdk.health.sensor._PlatformSensorService">
	//    1    2:areturn         
	}

	public boolean registerListener(_PrivilegeSensorDevice _pprivilegesensordevice, _PlatformSensorDataListener _pplatformsensordatalistener)
		throws RemoteException
	{
		boolean flag;
		Parcel parcel;
		Parcel parcel1;
		flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		parcel = Parcel.obtain();
	//    2    3:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    3    6:astore          5
		parcel1 = Parcel.obtain();
	//    4    8:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    5   11:astore          6
		parcel.writeInterfaceToken("com.samsung.android.sdk.health.sensor._PlatformSensorService");
	//    6   13:aload           5
	//    7   15:ldc1            #34  <String "com.samsung.android.sdk.health.sensor._PlatformSensorService">
	//    8   17:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		if(_pprivilegesensordevice == null) goto _L2; else goto _L1
	//    9   20:aload_1         
	//   10   21:ifnull          98
_L1:
		parcel.writeInt(1);
	//   11   24:aload           5
	//   12   26:iconst_1        
	//   13   27:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		_pprivilegesensordevice.writeToParcel(parcel, 0);
	//   14   30:aload_1         
	//   15   31:aload           5
	//   16   33:iconst_0        
	//   17   34:invokevirtual   #67  <Method void _PrivilegeSensorDevice.writeToParcel(Parcel, int)>
_L3:
		if(_pplatformsensordatalistener == null)
			break MISSING_BLOCK_LABEL_120;
	//   18   37:aload_2         
	//   19   38:ifnull          120
		_pprivilegesensordevice = ((_PrivilegeSensorDevice) (_pplatformsensordatalistener.asBinder()));
	//   20   41:aload_2         
	//   21   42:invokeinterface #88  <Method IBinder _PlatformSensorDataListener.asBinder()>
	//   22   47:astore_1        
_L4:
		int i;
		parcel.writeStrongBinder(((IBinder) (_pprivilegesensordevice)));
	//   23   48:aload           5
	//   24   50:aload_1         
	//   25   51:invokevirtual   #91  <Method void Parcel.writeStrongBinder(IBinder)>
		mRemote.transact(3, parcel, parcel1, 0);
	//   26   54:aload_0         
	//   27   55:getfield        #19  <Field IBinder mRemote>
	//   28   58:iconst_3        
	//   29   59:aload           5
	//   30   61:aload           6
	//   31   63:iconst_0        
	//   32   64:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   33   69:pop             
		parcel1.readException();
	//   34   70:aload           6
	//   35   72:invokevirtual   #51  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   36   75:aload           6
	//   37   77:invokevirtual   #55  <Method int Parcel.readInt()>
	//   38   80:istore_3        
		if(i == 0)
	//*  39   81:iload_3         
	//*  40   82:ifeq            125
	//*  41   85:aload           6
	//*  42   87:invokevirtual   #58  <Method void Parcel.recycle()>
	//*  43   90:aload           5
	//*  44   92:invokevirtual   #58  <Method void Parcel.recycle()>
	//*  45   95:iload           4
	//*  46   97:ireturn         
	//*  47   98:aload           5
	//*  48  100:iconst_0        
	//*  49  101:invokevirtual   #42  <Method void Parcel.writeInt(int)>
	//*  50  104:goto            37
	//*  51  107:astore_1        
	//*  52  108:aload           6
	//*  53  110:invokevirtual   #58  <Method void Parcel.recycle()>
	//*  54  113:aload           5
	//*  55  115:invokevirtual   #58  <Method void Parcel.recycle()>
	//*  56  118:aload_1         
	//*  57  119:athrow          
	//*  58  120:aconst_null     
	//*  59  121:astore_1        
	//*  60  122:goto            48
			flag = false;
	//   61  125:iconst_0        
	//   62  126:istore          4
		parcel1.recycle();
		parcel.recycle();
		return flag;
_L2:
		parcel.writeInt(0);
		  goto _L3
		_pprivilegesensordevice;
		parcel1.recycle();
		parcel.recycle();
		throw _pprivilegesensordevice;
		_pprivilegesensordevice = null;
		  goto _L4
	//*  63  128:goto            85
	}

	public boolean unregisterListener(_PrivilegeSensorDevice _pprivilegesensordevice)
		throws RemoteException
	{
		boolean flag;
		Parcel parcel;
		Parcel parcel1;
		flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		parcel = Parcel.obtain();
	//    2    2:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    3    5:astore          4
		parcel1 = Parcel.obtain();
	//    4    7:invokestatic    #32  <Method Parcel Parcel.obtain()>
	//    5   10:astore          5
		parcel.writeInterfaceToken("com.samsung.android.sdk.health.sensor._PlatformSensorService");
	//    6   12:aload           4
	//    7   14:ldc1            #34  <String "com.samsung.android.sdk.health.sensor._PlatformSensorService">
	//    8   16:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
		if(_pprivilegesensordevice == null)
			break MISSING_BLOCK_LABEL_79;
	//    9   19:aload_1         
	//   10   20:ifnull          79
		parcel.writeInt(1);
	//   11   23:aload           4
	//   12   25:iconst_1        
	//   13   26:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		_pprivilegesensordevice.writeToParcel(parcel, 0);
	//   14   29:aload_1         
	//   15   30:aload           4
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #67  <Method void _PrivilegeSensorDevice.writeToParcel(Parcel, int)>
_L1:
		int i;
		mRemote.transact(4, parcel, parcel1, 0);
	//   18   36:aload_0         
	//   19   37:getfield        #19  <Field IBinder mRemote>
	//   20   40:iconst_4        
	//   21   41:aload           4
	//   22   43:aload           5
	//   23   45:iconst_0        
	//   24   46:invokeinterface #48  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   25   51:pop             
		parcel1.readException();
	//   26   52:aload           5
	//   27   54:invokevirtual   #51  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   28   57:aload           5
	//   29   59:invokevirtual   #55  <Method int Parcel.readInt()>
	//   30   62:istore_2        
		if(i == 0)
	//*  31   63:iload_2         
	//*  32   64:ifeq            101
	//*  33   67:aload           5
	//*  34   69:invokevirtual   #58  <Method void Parcel.recycle()>
	//*  35   72:aload           4
	//*  36   74:invokevirtual   #58  <Method void Parcel.recycle()>
	//*  37   77:iload_3         
	//*  38   78:ireturn         
	//*  39   79:aload           4
	//*  40   81:iconst_0        
	//*  41   82:invokevirtual   #42  <Method void Parcel.writeInt(int)>
	//*  42   85:goto            36
	//*  43   88:astore_1        
	//*  44   89:aload           5
	//*  45   91:invokevirtual   #58  <Method void Parcel.recycle()>
	//*  46   94:aload           4
	//*  47   96:invokevirtual   #58  <Method void Parcel.recycle()>
	//*  48   99:aload_1         
	//*  49  100:athrow          
			flag = false;
	//   50  101:iconst_0        
	//   51  102:istore_3        
		parcel1.recycle();
		parcel.recycle();
		return flag;
		parcel.writeInt(0);
		  goto _L1
		_pprivilegesensordevice;
		parcel1.recycle();
		parcel.recycle();
		throw _pprivilegesensordevice;
	//*  52  103:goto            67
	}

	private IBinder mRemote;

	_PlatformSensorService$Stub$Proxy(IBinder ibinder)
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
