// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sdk.health.sensor;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.samsung.android.sdk.health.sensor._private._PrivilegeSensorDevice;
import com.samsung.android.sdk.health.sensor.exception.PrivilegeSensorNotSupportedException;
import com.samsung.android.sdk.health.sensor.exception.PrivilegeSensorServiceNotBoundException;
import java.util.List;
import java.util.Random;

// Referenced classes of package com.samsung.android.sdk.health.sensor:
//			ShealthPlatformBinderFactory, _PlatformSensorService, PrivilegeSensorDataListener

public class PrivilegeSensorDevice
{
	public static class Response
	{

		public static final int ERROR_FAILURE = 1;
		public static final int ERROR_NONE = 0;
		public static final int ERROR_NOT_SUPPORTED = 2;

		public Response()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}
	}

	private final class WrappedSensorServiceDataListener extends _PlatformSensorDataListener.Stub
	{

		public void onBulkDataReceived(int i, Bundle abundle[])
			throws RemoteException
		{
			mActualListener.onReceived(i, abundle);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field PrivilegeSensorDataListener mActualListener>
		//    2    4:iload_1         
		//    3    5:aload_2         
		//    4    6:invokeinterface #30  <Method void PrivilegeSensorDataListener.onReceived(int, Bundle[])>
		//    5   11:return          
		}

		public void onDataReceived(int i, Bundle bundle)
			throws RemoteException
		{
			mActualListener.onReceived(i, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field PrivilegeSensorDataListener mActualListener>
		//    2    4:iload_1         
		//    3    5:aload_2         
		//    4    6:invokeinterface #35  <Method void PrivilegeSensorDataListener.onReceived(int, Bundle)>
		//    5   11:return          
		}

		public void onDataStarted(int i, int j)
			throws RemoteException
		{
			mActualListener.onStarted(i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field PrivilegeSensorDataListener mActualListener>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:invokeinterface #40  <Method void PrivilegeSensorDataListener.onStarted(int, int)>
		//    5   11:return          
		}

		public void onDataStopped(int i, int j)
			throws RemoteException
		{
			mActualListener.onStopped(i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field PrivilegeSensorDataListener mActualListener>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:invokeinterface #44  <Method void PrivilegeSensorDataListener.onStopped(int, int)>
		//    5   11:return          
		}

		private PrivilegeSensorDataListener mActualListener;
		final PrivilegeSensorDevice this$0;

		public WrappedSensorServiceDataListener(PrivilegeSensorDataListener privilegesensordatalistener)
		{
			this$0 = PrivilegeSensorDevice.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field PrivilegeSensorDevice this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void _PlatformSensorDataListener$Stub()>
			mActualListener = privilegesensordatalistener;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field PrivilegeSensorDataListener mActualListener>
		//    8   14:return          
		}
	}


	PrivilegeSensorDevice(_PrivilegeSensorDevice _pprivilegesensordevice, Context context)
		throws IllegalStateException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		mDevice = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #35  <Field _PrivilegeSensorDevice mDevice>
		if(_pprivilegesensordevice == null)
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       23
		{
			throw new IllegalStateException("Invalid device");
	//    7   13:new             #31  <Class IllegalStateException>
	//    8   16:dup             
	//    9   17:ldc1            #37  <String "Invalid device">
	//   10   19:invokespecial   #40  <Method void IllegalStateException(String)>
	//   11   22:athrow          
		} else
		{
			mDevice = _pprivilegesensordevice;
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:putfield        #35  <Field _PrivilegeSensorDevice mDevice>
			mDevice.setObjectId(getNextInt());
	//   15   28:aload_0         
	//   16   29:getfield        #35  <Field _PrivilegeSensorDevice mDevice>
	//   17   32:aload_0         
	//   18   33:invokespecial   #44  <Method int getNextInt()>
	//   19   36:invokevirtual   #50  <Method void _PrivilegeSensorDevice.setObjectId(int)>
			mPlatformServiceBinder = ShealthPlatformBinderFactory.getDefaultBinder(context, 106, mDevice.getObjectId(), ((ShealthPlatformDeviceFinder.ServiceConnectionListener) (null)));
	//   20   39:aload_0         
	//   21   40:aload_2         
	//   22   41:bipush          106
	//   23   43:aload_0         
	//   24   44:getfield        #35  <Field _PrivilegeSensorDevice mDevice>
	//   25   47:invokevirtual   #53  <Method int _PrivilegeSensorDevice.getObjectId()>
	//   26   50:i2l             
	//   27   51:aconst_null     
	//   28   52:invokestatic    #59  <Method _PlatformSensorService ShealthPlatformBinderFactory.getDefaultBinder(Context, int, long, ShealthPlatformDeviceFinder$ServiceConnectionListener)>
	//   29   55:putfield        #61  <Field _PlatformSensorService mPlatformServiceBinder>
			return;
	//   30   58:return          
		}
	}

	private void deinitialize()
	{
		mPlatformServiceBinder = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #61  <Field _PlatformSensorService mPlatformServiceBinder>
	//    3    5:return          
	}

	private int getNextInt()
	{
		return (new Random(System.currentTimeMillis())).nextInt();
	//    0    0:new             #65  <Class Random>
	//    1    3:dup             
	//    2    4:invokestatic    #71  <Method long System.currentTimeMillis()>
	//    3    7:invokespecial   #74  <Method void Random(long)>
	//    4   10:invokevirtual   #77  <Method int Random.nextInt()>
	//    5   13:ireturn         
	}

	public void close()
		throws PrivilegeSensorNotSupportedException, PrivilegeSensorServiceNotBoundException, RemoteException
	{
		Log.d(TAG, "close() is called");
	//    0    0:getstatic       #26  <Field String TAG>
	//    1    3:ldc1            #86  <String "close() is called">
	//    2    5:invokestatic    #92  <Method int Log.d(String, String)>
	//    3    8:pop             
		if(mPlatformServiceBinder != null)
	//*   4    9:aload_0         
	//*   5   10:getfield        #61  <Field _PlatformSensorService mPlatformServiceBinder>
	//*   6   13:ifnull          29
			mPlatformServiceBinder.close(mDevice);
	//    7   16:aload_0         
	//    8   17:getfield        #61  <Field _PlatformSensorService mPlatformServiceBinder>
	//    9   20:aload_0         
	//   10   21:getfield        #35  <Field _PrivilegeSensorDevice mDevice>
	//   11   24:invokeinterface #97  <Method void _PlatformSensorService.close(_PrivilegeSensorDevice)>
	//   12   29:return          
	}

	public int getConnectivityType()
		throws IllegalStateException
	{
		if(mDevice == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field _PrivilegeSensorDevice mDevice>
	//*   2    4:ifnonnull       17
		{
			throw new IllegalStateException("Invalid device");
	//    3    7:new             #31  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #37  <String "Invalid device">
	//    6   13:invokespecial   #40  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		} else
		{
			Log.d(TAG, (new StringBuilder()).append("getConnectivityType() : ").append(mDevice.getConnectivityType()).toString());
	//    8   17:getstatic       #26  <Field String TAG>
	//    9   20:new             #100 <Class StringBuilder>
	//   10   23:dup             
	//   11   24:invokespecial   #101 <Method void StringBuilder()>
	//   12   27:ldc1            #103 <String "getConnectivityType() : ">
	//   13   29:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   14   32:aload_0         
	//   15   33:getfield        #35  <Field _PrivilegeSensorDevice mDevice>
	//   16   36:invokevirtual   #109 <Method int _PrivilegeSensorDevice.getConnectivityType()>
	//   17   39:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
	//   18   42:invokevirtual   #115 <Method String StringBuilder.toString()>
	//   19   45:invokestatic    #92  <Method int Log.d(String, String)>
	//   20   48:pop             
			return mDevice.getConnectivityType();
	//   21   49:aload_0         
	//   22   50:getfield        #35  <Field _PrivilegeSensorDevice mDevice>
	//   23   53:invokevirtual   #109 <Method int _PrivilegeSensorDevice.getConnectivityType()>
	//   24   56:ireturn         
		}
	}

	public List getDataType()
		throws IllegalStateException
	{
		if(mDevice == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field _PrivilegeSensorDevice mDevice>
	//*   2    4:ifnonnull       17
			throw new IllegalStateException("Invalid device");
	//    3    7:new             #31  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #37  <String "Invalid device">
	//    6   13:invokespecial   #40  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		else
			return mDevice.getDataType();
	//    8   17:aload_0         
	//    9   18:getfield        #35  <Field _PrivilegeSensorDevice mDevice>
	//   10   21:invokevirtual   #119 <Method List _PrivilegeSensorDevice.getDataType()>
	//   11   24:areturn         
	}

	public int getDeviceType()
		throws IllegalStateException
	{
		if(mDevice == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field _PrivilegeSensorDevice mDevice>
	//*   2    4:ifnonnull       17
			throw new IllegalStateException("Invalid device");
	//    3    7:new             #31  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #37  <String "Invalid device">
	//    6   13:invokespecial   #40  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		else
			return mDevice.getDeviceType();
	//    8   17:aload_0         
	//    9   18:getfield        #35  <Field _PrivilegeSensorDevice mDevice>
	//   10   21:invokevirtual   #124 <Method int _PrivilegeSensorDevice.getDeviceType()>
	//   11   24:ireturn         
	}

	public String getId()
		throws IllegalStateException
	{
		if(mDevice == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field _PrivilegeSensorDevice mDevice>
	//*   2    4:ifnonnull       17
			throw new IllegalStateException("Invalid device");
	//    3    7:new             #31  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #37  <String "Invalid device">
	//    6   13:invokespecial   #40  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		else
			return mDevice.getId();
	//    8   17:aload_0         
	//    9   18:getfield        #35  <Field _PrivilegeSensorDevice mDevice>
	//   10   21:invokevirtual   #127 <Method String _PrivilegeSensorDevice.getId()>
	//   11   24:areturn         
	}

	public String getName()
		throws IllegalStateException
	{
		if(mDevice == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field _PrivilegeSensorDevice mDevice>
	//*   2    4:ifnonnull       17
			throw new IllegalStateException("Invalid device");
	//    3    7:new             #31  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #37  <String "Invalid device">
	//    6   13:invokespecial   #40  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		else
			return mDevice.getName();
	//    8   17:aload_0         
	//    9   18:getfield        #35  <Field _PrivilegeSensorDevice mDevice>
	//   10   21:invokevirtual   #130 <Method String _PrivilegeSensorDevice.getName()>
	//   11   24:areturn         
	}

	public boolean registerListener(PrivilegeSensorDataListener privilegesensordatalistener)
		throws RemoteException, PrivilegeSensorServiceNotBoundException, PrivilegeSensorNotSupportedException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(privilegesensordatalistener != null)
			break MISSING_BLOCK_LABEL_21;
	//    2    2:aload_1         
	//    3    3:ifnonnull       21
		throw new IllegalArgumentException("invalid listener");
	//    4    6:new             #134 <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:ldc1            #136 <String "invalid listener">
	//    7   12:invokespecial   #137 <Method void IllegalArgumentException(String)>
	//    8   15:athrow          
		privilegesensordatalistener;
	//    9   16:astore_1        
		this;
	//   10   17:aload_0         
		JVM INSTR monitorexit ;
	//   11   18:monitorexit     
		throw privilegesensordatalistener;
	//   12   19:aload_1         
	//   13   20:athrow          
		boolean flag;
		if(mDevice == null)
	//*  14   21:aload_0         
	//*  15   22:getfield        #35  <Field _PrivilegeSensorDevice mDevice>
	//*  16   25:ifnonnull       38
			throw new PrivilegeSensorNotSupportedException("Invalid device");
	//   17   28:new             #80  <Class PrivilegeSensorNotSupportedException>
	//   18   31:dup             
	//   19   32:ldc1            #37  <String "Invalid device">
	//   20   34:invokespecial   #138 <Method void PrivilegeSensorNotSupportedException(String)>
	//   21   37:athrow          
		if(mPlatformServiceBinder == null)
	//*  22   38:aload_0         
	//*  23   39:getfield        #61  <Field _PlatformSensorService mPlatformServiceBinder>
	//*  24   42:ifnonnull       55
			throw new PrivilegeSensorServiceNotBoundException("Service is not connected");
	//   25   45:new             #82  <Class PrivilegeSensorServiceNotBoundException>
	//   26   48:dup             
	//   27   49:ldc1            #140 <String "Service is not connected">
	//   28   51:invokespecial   #141 <Method void PrivilegeSensorServiceNotBoundException(String)>
	//   29   54:athrow          
		privilegesensordatalistener = ((PrivilegeSensorDataListener) (new WrappedSensorServiceDataListener(privilegesensordatalistener)));
	//   30   55:new             #9   <Class PrivilegeSensorDevice$WrappedSensorServiceDataListener>
	//   31   58:dup             
	//   32   59:aload_0         
	//   33   60:aload_1         
	//   34   61:invokespecial   #144 <Method void PrivilegeSensorDevice$WrappedSensorServiceDataListener(PrivilegeSensorDevice, PrivilegeSensorDataListener)>
	//   35   64:astore_1        
		flag = mPlatformServiceBinder.registerListener(mDevice, ((_PlatformSensorDataListener) (privilegesensordatalistener)));
	//   36   65:aload_0         
	//   37   66:getfield        #61  <Field _PlatformSensorService mPlatformServiceBinder>
	//   38   69:aload_0         
	//   39   70:getfield        #35  <Field _PrivilegeSensorDevice mDevice>
	//   40   73:aload_1         
	//   41   74:invokeinterface #147 <Method boolean _PlatformSensorService.registerListener(_PrivilegeSensorDevice, _PlatformSensorDataListener)>
	//   42   79:istore_2        
		this;
	//   43   80:aload_0         
		JVM INSTR monitorexit ;
	//   44   81:monitorexit     
		return flag;
	//   45   82:iload_2         
	//   46   83:ireturn         
	}

	public boolean unregisterListener()
		throws RemoteException, PrivilegeSensorServiceNotBoundException, PrivilegeSensorNotSupportedException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mDevice == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #35  <Field _PrivilegeSensorDevice mDevice>
	//*   4    6:ifnonnull       24
			throw new PrivilegeSensorNotSupportedException("Invalid device");
	//    5    9:new             #80  <Class PrivilegeSensorNotSupportedException>
	//    6   12:dup             
	//    7   13:ldc1            #37  <String "Invalid device">
	//    8   15:invokespecial   #138 <Method void PrivilegeSensorNotSupportedException(String)>
	//    9   18:athrow          
		break MISSING_BLOCK_LABEL_24;
		Exception exception;
		exception;
	//   10   19:astore_2        
		this;
	//   11   20:aload_0         
		JVM INSTR monitorexit ;
	//   12   21:monitorexit     
		throw exception;
	//   13   22:aload_2         
	//   14   23:athrow          
		boolean flag;
		if(mPlatformServiceBinder == null)
	//*  15   24:aload_0         
	//*  16   25:getfield        #61  <Field _PlatformSensorService mPlatformServiceBinder>
	//*  17   28:ifnonnull       41
			throw new PrivilegeSensorServiceNotBoundException("Service is not connected");
	//   18   31:new             #82  <Class PrivilegeSensorServiceNotBoundException>
	//   19   34:dup             
	//   20   35:ldc1            #140 <String "Service is not connected">
	//   21   37:invokespecial   #141 <Method void PrivilegeSensorServiceNotBoundException(String)>
	//   22   40:athrow          
		flag = mPlatformServiceBinder.unregisterListener(mDevice);
	//   23   41:aload_0         
	//   24   42:getfield        #61  <Field _PlatformSensorService mPlatformServiceBinder>
	//   25   45:aload_0         
	//   26   46:getfield        #35  <Field _PrivilegeSensorDevice mDevice>
	//   27   49:invokeinterface #152 <Method boolean _PlatformSensorService.unregisterListener(_PrivilegeSensorDevice)>
	//   28   54:istore_1        
		this;
	//   29   55:aload_0         
		JVM INSTR monitorexit ;
	//   30   56:monitorexit     
		return flag;
	//   31   57:iload_1         
	//   32   58:ireturn         
	}

	public static final String TAG = ((Class) (com/samsung/android/sdk/health/sensor/PrivilegeSensorDevice)).getSimpleName();
	_PrivilegeSensorDevice mDevice;
	private _PlatformSensorService mPlatformServiceBinder;

	static 
	{
	//    0    0:ldc1            #2   <Class PrivilegeSensorDevice>
	//    1    2:invokevirtual   #24  <Method String Class.getSimpleName()>
	//    2    5:putstatic       #26  <Field String TAG>
	//*   3    8:return          
	}
}
