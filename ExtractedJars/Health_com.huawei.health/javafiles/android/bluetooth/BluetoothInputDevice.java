// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.bluetooth;

import android.content.*;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.bluetooth:
//			BluetoothProfile, BluetoothAdapter, IBluetoothManager, IBluetoothInputDevice, 
//			BluetoothDevice, IBluetoothStateChangeCallback

public final class BluetoothInputDevice
	implements BluetoothProfile
{

	BluetoothInputDevice(Context context, BluetoothProfile.ServiceListener servicelistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #87  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #8   <Class BluetoothInputDevice$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #90  <Method void BluetoothInputDevice$1(BluetoothInputDevice)>
	//    7   13:putfield        #92  <Field IBluetoothStateChangeCallback mBluetoothStateChangeCallback>
		mConnection = new ServiceConnection() {

			public void onServiceConnected(ComponentName componentname, IBinder ibinder)
			{
				Log.d("BluetoothInputDevice", "Proxy object connected");
			//    0    0:ldc1            #22  <String "BluetoothInputDevice">
			//    1    2:ldc1            #24  <String "Proxy object connected">
			//    2    4:invokestatic    #30  <Method int Log.d(String, String)>
			//    3    7:pop             
				mService = IBluetoothInputDevice.Stub.asInterface(ibinder);
			//    4    8:aload_0         
			//    5    9:getfield        #14  <Field BluetoothInputDevice this$0>
			//    6   12:aload_2         
			//    7   13:invokestatic    #36  <Method IBluetoothInputDevice IBluetoothInputDevice$Stub.asInterface(IBinder)>
			//    8   16:invokestatic    #40  <Method IBluetoothInputDevice BluetoothInputDevice.access$102(BluetoothInputDevice, IBluetoothInputDevice)>
			//    9   19:pop             
				if(mServiceListener != null)
			//*  10   20:aload_0         
			//*  11   21:getfield        #14  <Field BluetoothInputDevice this$0>
			//*  12   24:invokestatic    #44  <Method BluetoothProfile$ServiceListener BluetoothInputDevice.access$300(BluetoothInputDevice)>
			//*  13   27:ifnull          47
					mServiceListener.onServiceConnected(4, ((BluetoothProfile) (BluetoothInputDevice.this)));
			//   14   30:aload_0         
			//   15   31:getfield        #14  <Field BluetoothInputDevice this$0>
			//   16   34:invokestatic    #44  <Method BluetoothProfile$ServiceListener BluetoothInputDevice.access$300(BluetoothInputDevice)>
			//   17   37:iconst_4        
			//   18   38:aload_0         
			//   19   39:getfield        #14  <Field BluetoothInputDevice this$0>
			//   20   42:invokeinterface #49  <Method void BluetoothProfile$ServiceListener.onServiceConnected(int, BluetoothProfile)>
			//   21   47:return          
			}

			public void onServiceDisconnected(ComponentName componentname)
			{
				Log.d("BluetoothInputDevice", "Proxy object disconnected");
			//    0    0:ldc1            #22  <String "BluetoothInputDevice">
			//    1    2:ldc1            #53  <String "Proxy object disconnected">
			//    2    4:invokestatic    #30  <Method int Log.d(String, String)>
			//    3    7:pop             
				mService = null;
			//    4    8:aload_0         
			//    5    9:getfield        #14  <Field BluetoothInputDevice this$0>
			//    6   12:aconst_null     
			//    7   13:invokestatic    #40  <Method IBluetoothInputDevice BluetoothInputDevice.access$102(BluetoothInputDevice, IBluetoothInputDevice)>
			//    8   16:pop             
				if(mServiceListener != null)
			//*   9   17:aload_0         
			//*  10   18:getfield        #14  <Field BluetoothInputDevice this$0>
			//*  11   21:invokestatic    #44  <Method BluetoothProfile$ServiceListener BluetoothInputDevice.access$300(BluetoothInputDevice)>
			//*  12   24:ifnull          40
					mServiceListener.onServiceDisconnected(4);
			//   13   27:aload_0         
			//   14   28:getfield        #14  <Field BluetoothInputDevice this$0>
			//   15   31:invokestatic    #44  <Method BluetoothProfile$ServiceListener BluetoothInputDevice.access$300(BluetoothInputDevice)>
			//   16   34:iconst_4        
			//   17   35:invokeinterface #56  <Method void BluetoothProfile$ServiceListener.onServiceDisconnected(int)>
			//   18   40:return          
			}

			final BluetoothInputDevice this$0;

			
			{
				this$0 = BluetoothInputDevice.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field BluetoothInputDevice this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    8   16:aload_0         
	//    9   17:new             #10  <Class BluetoothInputDevice$2>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #93  <Method void BluetoothInputDevice$2(BluetoothInputDevice)>
	//   13   25:putfield        #95  <Field ServiceConnection mConnection>
		mContext = context;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:putfield        #97  <Field Context mContext>
		mServiceListener = servicelistener;
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:putfield        #99  <Field BluetoothProfile$ServiceListener mServiceListener>
		mAdapter = BluetoothAdapter.getDefaultAdapter();
	//   20   38:aload_0         
	//   21   39:invokestatic    #105 <Method BluetoothAdapter BluetoothAdapter.getDefaultAdapter()>
	//   22   42:putfield        #107 <Field BluetoothAdapter mAdapter>
		servicelistener = ((BluetoothProfile.ServiceListener) (mAdapter.getBluetoothManager()));
	//   23   45:aload_0         
	//   24   46:getfield        #107 <Field BluetoothAdapter mAdapter>
	//   25   49:invokevirtual   #111 <Method IBluetoothManager BluetoothAdapter.getBluetoothManager()>
	//   26   52:astore_2        
		if(servicelistener != null)
	//*  27   53:aload_2         
	//*  28   54:ifnull          80
			try
			{
				((IBluetoothManager) (servicelistener)).registerStateChangeCallback(mBluetoothStateChangeCallback);
	//   29   57:aload_2         
	//   30   58:aload_0         
	//   31   59:getfield        #92  <Field IBluetoothStateChangeCallback mBluetoothStateChangeCallback>
	//   32   62:invokeinterface #117 <Method void IBluetoothManager.registerStateChangeCallback(IBluetoothStateChangeCallback)>
			}
	//*  33   67:goto            80
			// Misplaced declaration of an exception variable
			catch(BluetoothProfile.ServiceListener servicelistener)
	//*  34   70:astore_2        
			{
				Log.e("BluetoothInputDevice", "", ((Throwable) (servicelistener)));
	//   35   71:ldc1            #65  <String "BluetoothInputDevice">
	//   36   73:ldc1            #119 <String "">
	//   37   75:aload_2         
	//   38   76:invokestatic    #125 <Method int Log.e(String, String, Throwable)>
	//   39   79:pop             
			}
		if(!context.bindService(new Intent(((Class) (android/bluetooth/IBluetoothInputDevice)).getName()), mConnection, 0))
	//*  40   80:aload_1         
	//*  41   81:new             #127 <Class Intent>
	//*  42   84:dup             
	//*  43   85:ldc1            #129 <Class IBluetoothInputDevice>
	//*  44   87:invokevirtual   #135 <Method String Class.getName()>
	//*  45   90:invokespecial   #138 <Method void Intent(String)>
	//*  46   93:aload_0         
	//*  47   94:getfield        #95  <Field ServiceConnection mConnection>
	//*  48   97:iconst_0        
	//*  49   98:invokevirtual   #144 <Method boolean Context.bindService(Intent, ServiceConnection, int)>
	//*  50  101:ifne            112
			Log.e("BluetoothInputDevice", "Could not bind to Bluetooth HID Service");
	//   51  104:ldc1            #65  <String "BluetoothInputDevice">
	//   52  106:ldc1            #146 <String "Could not bind to Bluetooth HID Service">
	//   53  108:invokestatic    #149 <Method int Log.e(String, String)>
	//   54  111:pop             
	//   55  112:return          
	}

	private boolean isEnabled()
	{
		return mAdapter.getState() == 12;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field BluetoothAdapter mAdapter>
	//    2    4:invokevirtual   #168 <Method int BluetoothAdapter.getState()>
	//    3    7:bipush          12
	//    4    9:icmpne          14
	//    5   12:iconst_1        
	//    6   13:ireturn         
	//    7   14:iconst_0        
	//    8   15:ireturn         
	}

	private boolean isValidDevice(BluetoothDevice bluetoothdevice)
	{
		if(bluetoothdevice == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		return BluetoothAdapter.checkBluetoothAddress(bluetoothdevice.getAddress());
	//    4    6:aload_1         
	//    5    7:invokevirtual   #175 <Method String BluetoothDevice.getAddress()>
	//    6   10:invokestatic    #179 <Method boolean BluetoothAdapter.checkBluetoothAddress(String)>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	private static void log(String s)
	{
		Log.d("BluetoothInputDevice", s);
	//    0    0:ldc1            #65  <String "BluetoothInputDevice">
	//    1    2:aload_0         
	//    2    3:invokestatic    #183 <Method int Log.d(String, String)>
	//    3    6:pop             
	//    4    7:return          
	}

	void close()
	{
		IBluetoothManager ibluetoothmanager = mAdapter.getBluetoothManager();
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field BluetoothAdapter mAdapter>
	//    2    4:invokevirtual   #111 <Method IBluetoothManager BluetoothAdapter.getBluetoothManager()>
	//    3    7:astore_1        
		if(ibluetoothmanager != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          35
			try
			{
				ibluetoothmanager.unregisterStateChangeCallback(mBluetoothStateChangeCallback);
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #92  <Field IBluetoothStateChangeCallback mBluetoothStateChangeCallback>
	//    9   17:invokeinterface #189 <Method void IBluetoothManager.unregisterStateChangeCallback(IBluetoothStateChangeCallback)>
			}
	//*  10   22:goto            35
			catch(Exception exception)
	//*  11   25:astore_1        
			{
				Log.e("BluetoothInputDevice", "", ((Throwable) (exception)));
	//   12   26:ldc1            #65  <String "BluetoothInputDevice">
	//   13   28:ldc1            #119 <String "">
	//   14   30:aload_1         
	//   15   31:invokestatic    #125 <Method int Log.e(String, String, Throwable)>
	//   16   34:pop             
			}
		ServiceConnection serviceconnection = mConnection;
	//   17   35:aload_0         
	//   18   36:getfield        #95  <Field ServiceConnection mConnection>
	//   19   39:astore_1        
		serviceconnection;
	//   20   40:aload_1         
		JVM INSTR monitorenter ;
	//   21   41:monitorenter    
		IBluetoothInputDevice ibluetoothinputdevice = mService;
	//   22   42:aload_0         
	//   23   43:getfield        #156 <Field IBluetoothInputDevice mService>
	//   24   46:astore_2        
		if(ibluetoothinputdevice == null)
			break MISSING_BLOCK_LABEL_80;
	//   25   47:aload_2         
	//   26   48:ifnull          80
		mService = null;
	//   27   51:aload_0         
	//   28   52:aconst_null     
	//   29   53:putfield        #156 <Field IBluetoothInputDevice mService>
		mContext.unbindService(mConnection);
	//   30   56:aload_0         
	//   31   57:getfield        #97  <Field Context mContext>
	//   32   60:aload_0         
	//   33   61:getfield        #95  <Field ServiceConnection mConnection>
	//   34   64:invokevirtual   #193 <Method void Context.unbindService(ServiceConnection)>
		break MISSING_BLOCK_LABEL_80;
	//   35   67:goto            80
		Object obj;
		obj;
	//   36   70:astore_2        
		Log.e("BluetoothInputDevice", "", ((Throwable) (obj)));
	//   37   71:ldc1            #65  <String "BluetoothInputDevice">
	//   38   73:ldc1            #119 <String "">
	//   39   75:aload_2         
	//   40   76:invokestatic    #125 <Method int Log.e(String, String, Throwable)>
	//   41   79:pop             
		serviceconnection;
	//   42   80:aload_1         
		JVM INSTR monitorexit ;
	//   43   81:monitorexit     
		  goto _L1
	//*  44   82:goto            90
		obj;
	//   45   85:astore_2        
	//*  46   86:aload_1         
		throw obj;
	//   47   87:monitorexit     
	//   48   88:aload_2         
	//   49   89:athrow          
_L1:
		mServiceListener = null;
	//   50   90:aload_0         
	//   51   91:aconst_null     
	//   52   92:putfield        #99  <Field BluetoothProfile$ServiceListener mServiceListener>
		return;
	//   53   95:return          
	}

	public boolean connect(BluetoothDevice bluetoothdevice)
	{
		log((new StringBuilder()).append("connect(").append(((Object) (bluetoothdevice))).append(")").toString());
	//    0    0:new             #196 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #197 <Method void StringBuilder()>
	//    3    7:ldc1            #199 <String "connect(">
	//    4    9:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #206 <Method StringBuilder StringBuilder.append(Object)>
	//    7   16:ldc1            #208 <String ")">
	//    8   18:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   10   24:invokestatic    #213 <Method void log(String)>
		if(mService != null && isEnabled() && isValidDevice(bluetoothdevice))
	//*  11   27:aload_0         
	//*  12   28:getfield        #156 <Field IBluetoothInputDevice mService>
	//*  13   31:ifnull          99
	//*  14   34:aload_0         
	//*  15   35:invokespecial   #215 <Method boolean isEnabled()>
	//*  16   38:ifeq            99
	//*  17   41:aload_0         
	//*  18   42:aload_1         
	//*  19   43:invokespecial   #217 <Method boolean isValidDevice(BluetoothDevice)>
	//*  20   46:ifeq            99
		{
			boolean flag;
			try
			{
				flag = mService.connect(bluetoothdevice);
	//   21   49:aload_0         
	//   22   50:getfield        #156 <Field IBluetoothInputDevice mService>
	//   23   53:aload_1         
	//   24   54:invokeinterface #219 <Method boolean IBluetoothInputDevice.connect(BluetoothDevice)>
	//   25   59:istore_2        
			}
	//*  26   60:iload_2         
	//*  27   61:ireturn         
			// Misplaced declaration of an exception variable
			catch(BluetoothDevice bluetoothdevice)
	//*  28   62:astore_1        
			{
				Log.e("BluetoothInputDevice", (new StringBuilder()).append("Stack:").append(Log.getStackTraceString(new Throwable())).toString());
	//   29   63:ldc1            #65  <String "BluetoothInputDevice">
	//   30   65:new             #196 <Class StringBuilder>
	//   31   68:dup             
	//   32   69:invokespecial   #197 <Method void StringBuilder()>
	//   33   72:ldc1            #221 <String "Stack:">
	//   34   74:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   35   77:new             #223 <Class Throwable>
	//   36   80:dup             
	//   37   81:invokespecial   #224 <Method void Throwable()>
	//   38   84:invokestatic    #228 <Method String Log.getStackTraceString(Throwable)>
	//   39   87:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   40   90:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   41   93:invokestatic    #149 <Method int Log.e(String, String)>
	//   42   96:pop             
				return false;
	//   43   97:iconst_0        
	//   44   98:ireturn         
			}
			return flag;
		}
		if(mService == null)
	//*  45   99:aload_0         
	//*  46  100:getfield        #156 <Field IBluetoothInputDevice mService>
	//*  47  103:ifnonnull       114
			Log.w("BluetoothInputDevice", "Proxy not attached to service");
	//   48  106:ldc1            #65  <String "BluetoothInputDevice">
	//   49  108:ldc1            #230 <String "Proxy not attached to service">
	//   50  110:invokestatic    #233 <Method int Log.w(String, String)>
	//   51  113:pop             
		return false;
	//   52  114:iconst_0        
	//   53  115:ireturn         
	}

	public boolean disconnect(BluetoothDevice bluetoothdevice)
	{
		log((new StringBuilder()).append("disconnect(").append(((Object) (bluetoothdevice))).append(")").toString());
	//    0    0:new             #196 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #197 <Method void StringBuilder()>
	//    3    7:ldc1            #236 <String "disconnect(">
	//    4    9:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #206 <Method StringBuilder StringBuilder.append(Object)>
	//    7   16:ldc1            #208 <String ")">
	//    8   18:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   10   24:invokestatic    #213 <Method void log(String)>
		if(mService != null && isEnabled() && isValidDevice(bluetoothdevice))
	//*  11   27:aload_0         
	//*  12   28:getfield        #156 <Field IBluetoothInputDevice mService>
	//*  13   31:ifnull          99
	//*  14   34:aload_0         
	//*  15   35:invokespecial   #215 <Method boolean isEnabled()>
	//*  16   38:ifeq            99
	//*  17   41:aload_0         
	//*  18   42:aload_1         
	//*  19   43:invokespecial   #217 <Method boolean isValidDevice(BluetoothDevice)>
	//*  20   46:ifeq            99
		{
			boolean flag;
			try
			{
				flag = mService.disconnect(bluetoothdevice);
	//   21   49:aload_0         
	//   22   50:getfield        #156 <Field IBluetoothInputDevice mService>
	//   23   53:aload_1         
	//   24   54:invokeinterface #238 <Method boolean IBluetoothInputDevice.disconnect(BluetoothDevice)>
	//   25   59:istore_2        
			}
	//*  26   60:iload_2         
	//*  27   61:ireturn         
			// Misplaced declaration of an exception variable
			catch(BluetoothDevice bluetoothdevice)
	//*  28   62:astore_1        
			{
				Log.e("BluetoothInputDevice", (new StringBuilder()).append("Stack:").append(Log.getStackTraceString(new Throwable())).toString());
	//   29   63:ldc1            #65  <String "BluetoothInputDevice">
	//   30   65:new             #196 <Class StringBuilder>
	//   31   68:dup             
	//   32   69:invokespecial   #197 <Method void StringBuilder()>
	//   33   72:ldc1            #221 <String "Stack:">
	//   34   74:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   35   77:new             #223 <Class Throwable>
	//   36   80:dup             
	//   37   81:invokespecial   #224 <Method void Throwable()>
	//   38   84:invokestatic    #228 <Method String Log.getStackTraceString(Throwable)>
	//   39   87:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   40   90:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   41   93:invokestatic    #149 <Method int Log.e(String, String)>
	//   42   96:pop             
				return false;
	//   43   97:iconst_0        
	//   44   98:ireturn         
			}
			return flag;
		}
		if(mService == null)
	//*  45   99:aload_0         
	//*  46  100:getfield        #156 <Field IBluetoothInputDevice mService>
	//*  47  103:ifnonnull       114
			Log.w("BluetoothInputDevice", "Proxy not attached to service");
	//   48  106:ldc1            #65  <String "BluetoothInputDevice">
	//   49  108:ldc1            #230 <String "Proxy not attached to service">
	//   50  110:invokestatic    #233 <Method int Log.w(String, String)>
	//   51  113:pop             
		return false;
	//   52  114:iconst_0        
	//   53  115:ireturn         
	}

	public List getConnectedDevices()
	{
		if(mService != null && isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field IBluetoothInputDevice mService>
	//*   2    4:ifnull          69
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #215 <Method boolean isEnabled()>
	//*   5   11:ifeq            69
		{
			List list;
			try
			{
				list = mService.getConnectedDevices();
	//    6   14:aload_0         
	//    7   15:getfield        #156 <Field IBluetoothInputDevice mService>
	//    8   18:invokeinterface #242 <Method List IBluetoothInputDevice.getConnectedDevices()>
	//    9   23:astore_1        
			}
	//*  10   24:aload_1         
	//*  11   25:areturn         
			catch(RemoteException remoteexception)
	//*  12   26:astore_1        
			{
				Log.e("BluetoothInputDevice", (new StringBuilder()).append("Stack:").append(Log.getStackTraceString(new Throwable())).toString());
	//   13   27:ldc1            #65  <String "BluetoothInputDevice">
	//   14   29:new             #196 <Class StringBuilder>
	//   15   32:dup             
	//   16   33:invokespecial   #197 <Method void StringBuilder()>
	//   17   36:ldc1            #221 <String "Stack:">
	//   18   38:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   19   41:new             #223 <Class Throwable>
	//   20   44:dup             
	//   21   45:invokespecial   #224 <Method void Throwable()>
	//   22   48:invokestatic    #228 <Method String Log.getStackTraceString(Throwable)>
	//   23   51:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   24   54:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   25   57:invokestatic    #149 <Method int Log.e(String, String)>
	//   26   60:pop             
				return ((List) (new ArrayList()));
	//   27   61:new             #244 <Class ArrayList>
	//   28   64:dup             
	//   29   65:invokespecial   #245 <Method void ArrayList()>
	//   30   68:areturn         
			}
			return list;
		}
		if(mService == null)
	//*  31   69:aload_0         
	//*  32   70:getfield        #156 <Field IBluetoothInputDevice mService>
	//*  33   73:ifnonnull       84
			Log.w("BluetoothInputDevice", "Proxy not attached to service");
	//   34   76:ldc1            #65  <String "BluetoothInputDevice">
	//   35   78:ldc1            #230 <String "Proxy not attached to service">
	//   36   80:invokestatic    #233 <Method int Log.w(String, String)>
	//   37   83:pop             
		return ((List) (new ArrayList()));
	//   38   84:new             #244 <Class ArrayList>
	//   39   87:dup             
	//   40   88:invokespecial   #245 <Method void ArrayList()>
	//   41   91:areturn         
	}

	public int getConnectionState(BluetoothDevice bluetoothdevice)
	{
		if(mService != null && isEnabled() && isValidDevice(bluetoothdevice))
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field IBluetoothInputDevice mService>
	//*   2    4:ifnull          72
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #215 <Method boolean isEnabled()>
	//*   5   11:ifeq            72
	//*   6   14:aload_0         
	//*   7   15:aload_1         
	//*   8   16:invokespecial   #217 <Method boolean isValidDevice(BluetoothDevice)>
	//*   9   19:ifeq            72
		{
			int i;
			try
			{
				i = mService.getConnectionState(bluetoothdevice);
	//   10   22:aload_0         
	//   11   23:getfield        #156 <Field IBluetoothInputDevice mService>
	//   12   26:aload_1         
	//   13   27:invokeinterface #251 <Method int IBluetoothInputDevice.getConnectionState(BluetoothDevice)>
	//   14   32:istore_2        
			}
	//*  15   33:iload_2         
	//*  16   34:ireturn         
			// Misplaced declaration of an exception variable
			catch(BluetoothDevice bluetoothdevice)
	//*  17   35:astore_1        
			{
				Log.e("BluetoothInputDevice", (new StringBuilder()).append("Stack:").append(Log.getStackTraceString(new Throwable())).toString());
	//   18   36:ldc1            #65  <String "BluetoothInputDevice">
	//   19   38:new             #196 <Class StringBuilder>
	//   20   41:dup             
	//   21   42:invokespecial   #197 <Method void StringBuilder()>
	//   22   45:ldc1            #221 <String "Stack:">
	//   23   47:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   24   50:new             #223 <Class Throwable>
	//   25   53:dup             
	//   26   54:invokespecial   #224 <Method void Throwable()>
	//   27   57:invokestatic    #228 <Method String Log.getStackTraceString(Throwable)>
	//   28   60:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   29   63:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   30   66:invokestatic    #149 <Method int Log.e(String, String)>
	//   31   69:pop             
				return 0;
	//   32   70:iconst_0        
	//   33   71:ireturn         
			}
			return i;
		}
		if(mService == null)
	//*  34   72:aload_0         
	//*  35   73:getfield        #156 <Field IBluetoothInputDevice mService>
	//*  36   76:ifnonnull       87
			Log.w("BluetoothInputDevice", "Proxy not attached to service");
	//   37   79:ldc1            #65  <String "BluetoothInputDevice">
	//   38   81:ldc1            #230 <String "Proxy not attached to service">
	//   39   83:invokestatic    #233 <Method int Log.w(String, String)>
	//   40   86:pop             
		return 0;
	//   41   87:iconst_0        
	//   42   88:ireturn         
	}

	public List getDevicesMatchingConnectionStates(int ai[])
	{
		if(mService != null && isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field IBluetoothInputDevice mService>
	//*   2    4:ifnull          70
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #215 <Method boolean isEnabled()>
	//*   5   11:ifeq            70
		{
			try
			{
				ai = ((int []) (mService.getDevicesMatchingConnectionStates(ai)));
	//    6   14:aload_0         
	//    7   15:getfield        #156 <Field IBluetoothInputDevice mService>
	//    8   18:aload_1         
	//    9   19:invokeinterface #255 <Method List IBluetoothInputDevice.getDevicesMatchingConnectionStates(int[])>
	//   10   24:astore_1        
			}
	//*  11   25:aload_1         
	//*  12   26:areturn         
			// Misplaced declaration of an exception variable
			catch(int ai[])
	//*  13   27:astore_1        
			{
				Log.e("BluetoothInputDevice", (new StringBuilder()).append("Stack:").append(Log.getStackTraceString(new Throwable())).toString());
	//   14   28:ldc1            #65  <String "BluetoothInputDevice">
	//   15   30:new             #196 <Class StringBuilder>
	//   16   33:dup             
	//   17   34:invokespecial   #197 <Method void StringBuilder()>
	//   18   37:ldc1            #221 <String "Stack:">
	//   19   39:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   20   42:new             #223 <Class Throwable>
	//   21   45:dup             
	//   22   46:invokespecial   #224 <Method void Throwable()>
	//   23   49:invokestatic    #228 <Method String Log.getStackTraceString(Throwable)>
	//   24   52:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   25   55:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   26   58:invokestatic    #149 <Method int Log.e(String, String)>
	//   27   61:pop             
				return ((List) (new ArrayList()));
	//   28   62:new             #244 <Class ArrayList>
	//   29   65:dup             
	//   30   66:invokespecial   #245 <Method void ArrayList()>
	//   31   69:areturn         
			}
			return ((List) (ai));
		}
		if(mService == null)
	//*  32   70:aload_0         
	//*  33   71:getfield        #156 <Field IBluetoothInputDevice mService>
	//*  34   74:ifnonnull       85
			Log.w("BluetoothInputDevice", "Proxy not attached to service");
	//   35   77:ldc1            #65  <String "BluetoothInputDevice">
	//   36   79:ldc1            #230 <String "Proxy not attached to service">
	//   37   81:invokestatic    #233 <Method int Log.w(String, String)>
	//   38   84:pop             
		return ((List) (new ArrayList()));
	//   39   85:new             #244 <Class ArrayList>
	//   40   88:dup             
	//   41   89:invokespecial   #245 <Method void ArrayList()>
	//   42   92:areturn         
	}

	public int getPriority(BluetoothDevice bluetoothdevice)
	{
		if(mService != null && isEnabled() && isValidDevice(bluetoothdevice))
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field IBluetoothInputDevice mService>
	//*   2    4:ifnull          72
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #215 <Method boolean isEnabled()>
	//*   5   11:ifeq            72
	//*   6   14:aload_0         
	//*   7   15:aload_1         
	//*   8   16:invokespecial   #217 <Method boolean isValidDevice(BluetoothDevice)>
	//*   9   19:ifeq            72
		{
			int i;
			try
			{
				i = mService.getPriority(bluetoothdevice);
	//   10   22:aload_0         
	//   11   23:getfield        #156 <Field IBluetoothInputDevice mService>
	//   12   26:aload_1         
	//   13   27:invokeinterface #259 <Method int IBluetoothInputDevice.getPriority(BluetoothDevice)>
	//   14   32:istore_2        
			}
	//*  15   33:iload_2         
	//*  16   34:ireturn         
			// Misplaced declaration of an exception variable
			catch(BluetoothDevice bluetoothdevice)
	//*  17   35:astore_1        
			{
				Log.e("BluetoothInputDevice", (new StringBuilder()).append("Stack:").append(Log.getStackTraceString(new Throwable())).toString());
	//   18   36:ldc1            #65  <String "BluetoothInputDevice">
	//   19   38:new             #196 <Class StringBuilder>
	//   20   41:dup             
	//   21   42:invokespecial   #197 <Method void StringBuilder()>
	//   22   45:ldc1            #221 <String "Stack:">
	//   23   47:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   24   50:new             #223 <Class Throwable>
	//   25   53:dup             
	//   26   54:invokespecial   #224 <Method void Throwable()>
	//   27   57:invokestatic    #228 <Method String Log.getStackTraceString(Throwable)>
	//   28   60:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   29   63:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   30   66:invokestatic    #149 <Method int Log.e(String, String)>
	//   31   69:pop             
				return 0;
	//   32   70:iconst_0        
	//   33   71:ireturn         
			}
			return i;
		}
		if(mService == null)
	//*  34   72:aload_0         
	//*  35   73:getfield        #156 <Field IBluetoothInputDevice mService>
	//*  36   76:ifnonnull       87
			Log.w("BluetoothInputDevice", "Proxy not attached to service");
	//   37   79:ldc1            #65  <String "BluetoothInputDevice">
	//   38   81:ldc1            #230 <String "Proxy not attached to service">
	//   39   83:invokestatic    #233 <Method int Log.w(String, String)>
	//   40   86:pop             
		return 0;
	//   41   87:iconst_0        
	//   42   88:ireturn         
	}

	public boolean getProtocolMode(BluetoothDevice bluetoothdevice)
	{
		if(mService != null && isEnabled() && isValidDevice(bluetoothdevice))
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field IBluetoothInputDevice mService>
	//*   2    4:ifnull          72
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #215 <Method boolean isEnabled()>
	//*   5   11:ifeq            72
	//*   6   14:aload_0         
	//*   7   15:aload_1         
	//*   8   16:invokespecial   #217 <Method boolean isValidDevice(BluetoothDevice)>
	//*   9   19:ifeq            72
		{
			boolean flag;
			try
			{
				flag = mService.getProtocolMode(bluetoothdevice);
	//   10   22:aload_0         
	//   11   23:getfield        #156 <Field IBluetoothInputDevice mService>
	//   12   26:aload_1         
	//   13   27:invokeinterface #262 <Method boolean IBluetoothInputDevice.getProtocolMode(BluetoothDevice)>
	//   14   32:istore_2        
			}
	//*  15   33:iload_2         
	//*  16   34:ireturn         
			// Misplaced declaration of an exception variable
			catch(BluetoothDevice bluetoothdevice)
	//*  17   35:astore_1        
			{
				Log.e("BluetoothInputDevice", (new StringBuilder()).append("Stack:").append(Log.getStackTraceString(new Throwable())).toString());
	//   18   36:ldc1            #65  <String "BluetoothInputDevice">
	//   19   38:new             #196 <Class StringBuilder>
	//   20   41:dup             
	//   21   42:invokespecial   #197 <Method void StringBuilder()>
	//   22   45:ldc1            #221 <String "Stack:">
	//   23   47:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   24   50:new             #223 <Class Throwable>
	//   25   53:dup             
	//   26   54:invokespecial   #224 <Method void Throwable()>
	//   27   57:invokestatic    #228 <Method String Log.getStackTraceString(Throwable)>
	//   28   60:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   29   63:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   30   66:invokestatic    #149 <Method int Log.e(String, String)>
	//   31   69:pop             
				return false;
	//   32   70:iconst_0        
	//   33   71:ireturn         
			}
			return flag;
		}
		if(mService == null)
	//*  34   72:aload_0         
	//*  35   73:getfield        #156 <Field IBluetoothInputDevice mService>
	//*  36   76:ifnonnull       87
			Log.w("BluetoothInputDevice", "Proxy not attached to service");
	//   37   79:ldc1            #65  <String "BluetoothInputDevice">
	//   38   81:ldc1            #230 <String "Proxy not attached to service">
	//   39   83:invokestatic    #233 <Method int Log.w(String, String)>
	//   40   86:pop             
		return false;
	//   41   87:iconst_0        
	//   42   88:ireturn         
	}

	public boolean getReport(BluetoothDevice bluetoothdevice, byte byte0, byte byte1, int i)
	{
		if(mService != null && isEnabled() && isValidDevice(bluetoothdevice))
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field IBluetoothInputDevice mService>
	//*   2    4:ifnull          78
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #215 <Method boolean isEnabled()>
	//*   5   11:ifeq            78
	//*   6   14:aload_0         
	//*   7   15:aload_1         
	//*   8   16:invokespecial   #217 <Method boolean isValidDevice(BluetoothDevice)>
	//*   9   19:ifeq            78
		{
			boolean flag;
			try
			{
				flag = mService.getReport(bluetoothdevice, byte0, byte1, i);
	//   10   22:aload_0         
	//   11   23:getfield        #156 <Field IBluetoothInputDevice mService>
	//   12   26:aload_1         
	//   13   27:iload_2         
	//   14   28:iload_3         
	//   15   29:iload           4
	//   16   31:invokeinterface #266 <Method boolean IBluetoothInputDevice.getReport(BluetoothDevice, byte, byte, int)>
	//   17   36:istore          5
			}
	//*  18   38:iload           5
	//*  19   40:ireturn         
			// Misplaced declaration of an exception variable
			catch(BluetoothDevice bluetoothdevice)
	//*  20   41:astore_1        
			{
				Log.e("BluetoothInputDevice", (new StringBuilder()).append("Stack:").append(Log.getStackTraceString(new Throwable())).toString());
	//   21   42:ldc1            #65  <String "BluetoothInputDevice">
	//   22   44:new             #196 <Class StringBuilder>
	//   23   47:dup             
	//   24   48:invokespecial   #197 <Method void StringBuilder()>
	//   25   51:ldc1            #221 <String "Stack:">
	//   26   53:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   27   56:new             #223 <Class Throwable>
	//   28   59:dup             
	//   29   60:invokespecial   #224 <Method void Throwable()>
	//   30   63:invokestatic    #228 <Method String Log.getStackTraceString(Throwable)>
	//   31   66:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   32   69:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   33   72:invokestatic    #149 <Method int Log.e(String, String)>
	//   34   75:pop             
				return false;
	//   35   76:iconst_0        
	//   36   77:ireturn         
			}
			return flag;
		}
		if(mService == null)
	//*  37   78:aload_0         
	//*  38   79:getfield        #156 <Field IBluetoothInputDevice mService>
	//*  39   82:ifnonnull       93
			Log.w("BluetoothInputDevice", "Proxy not attached to service");
	//   40   85:ldc1            #65  <String "BluetoothInputDevice">
	//   41   87:ldc1            #230 <String "Proxy not attached to service">
	//   42   89:invokestatic    #233 <Method int Log.w(String, String)>
	//   43   92:pop             
		return false;
	//   44   93:iconst_0        
	//   45   94:ireturn         
	}

	public boolean sendData(BluetoothDevice bluetoothdevice, String s)
	{
		log((new StringBuilder()).append("sendData(").append(((Object) (bluetoothdevice))).append("), report=").append(s).toString());
	//    0    0:new             #196 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #197 <Method void StringBuilder()>
	//    3    7:ldc2            #270 <String "sendData(">
	//    4   10:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//    5   13:aload_1         
	//    6   14:invokevirtual   #206 <Method StringBuilder StringBuilder.append(Object)>
	//    7   17:ldc2            #272 <String "), report=">
	//    8   20:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//    9   23:aload_2         
	//   10   24:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   11   27:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   12   30:invokestatic    #213 <Method void log(String)>
		if(mService != null && isEnabled() && isValidDevice(bluetoothdevice))
	//*  13   33:aload_0         
	//*  14   34:getfield        #156 <Field IBluetoothInputDevice mService>
	//*  15   37:ifnull          106
	//*  16   40:aload_0         
	//*  17   41:invokespecial   #215 <Method boolean isEnabled()>
	//*  18   44:ifeq            106
	//*  19   47:aload_0         
	//*  20   48:aload_1         
	//*  21   49:invokespecial   #217 <Method boolean isValidDevice(BluetoothDevice)>
	//*  22   52:ifeq            106
		{
			boolean flag;
			try
			{
				flag = mService.sendData(bluetoothdevice, s);
	//   23   55:aload_0         
	//   24   56:getfield        #156 <Field IBluetoothInputDevice mService>
	//   25   59:aload_1         
	//   26   60:aload_2         
	//   27   61:invokeinterface #274 <Method boolean IBluetoothInputDevice.sendData(BluetoothDevice, String)>
	//   28   66:istore_3        
			}
	//*  29   67:iload_3         
	//*  30   68:ireturn         
			// Misplaced declaration of an exception variable
			catch(BluetoothDevice bluetoothdevice)
	//*  31   69:astore_1        
			{
				Log.e("BluetoothInputDevice", (new StringBuilder()).append("Stack:").append(Log.getStackTraceString(new Throwable())).toString());
	//   32   70:ldc1            #65  <String "BluetoothInputDevice">
	//   33   72:new             #196 <Class StringBuilder>
	//   34   75:dup             
	//   35   76:invokespecial   #197 <Method void StringBuilder()>
	//   36   79:ldc1            #221 <String "Stack:">
	//   37   81:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   38   84:new             #223 <Class Throwable>
	//   39   87:dup             
	//   40   88:invokespecial   #224 <Method void Throwable()>
	//   41   91:invokestatic    #228 <Method String Log.getStackTraceString(Throwable)>
	//   42   94:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   43   97:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   44  100:invokestatic    #149 <Method int Log.e(String, String)>
	//   45  103:pop             
				return false;
	//   46  104:iconst_0        
	//   47  105:ireturn         
			}
			return flag;
		}
		if(mService == null)
	//*  48  106:aload_0         
	//*  49  107:getfield        #156 <Field IBluetoothInputDevice mService>
	//*  50  110:ifnonnull       121
			Log.w("BluetoothInputDevice", "Proxy not attached to service");
	//   51  113:ldc1            #65  <String "BluetoothInputDevice">
	//   52  115:ldc1            #230 <String "Proxy not attached to service">
	//   53  117:invokestatic    #233 <Method int Log.w(String, String)>
	//   54  120:pop             
		return false;
	//   55  121:iconst_0        
	//   56  122:ireturn         
	}

	public boolean setPriority(BluetoothDevice bluetoothdevice, int i)
	{
		log((new StringBuilder()).append("setPriority(").append(((Object) (bluetoothdevice))).append(", ").append(i).append(")").toString());
	//    0    0:new             #196 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #197 <Method void StringBuilder()>
	//    3    7:ldc2            #278 <String "setPriority(">
	//    4   10:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//    5   13:aload_1         
	//    6   14:invokevirtual   #206 <Method StringBuilder StringBuilder.append(Object)>
	//    7   17:ldc2            #280 <String ", ">
	//    8   20:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//    9   23:iload_2         
	//   10   24:invokevirtual   #283 <Method StringBuilder StringBuilder.append(int)>
	//   11   27:ldc1            #208 <String ")">
	//   12   29:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   13   32:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   14   35:invokestatic    #213 <Method void log(String)>
		if(mService != null && isEnabled() && isValidDevice(bluetoothdevice))
	//*  15   38:aload_0         
	//*  16   39:getfield        #156 <Field IBluetoothInputDevice mService>
	//*  17   42:ifnull          123
	//*  18   45:aload_0         
	//*  19   46:invokespecial   #215 <Method boolean isEnabled()>
	//*  20   49:ifeq            123
	//*  21   52:aload_0         
	//*  22   53:aload_1         
	//*  23   54:invokespecial   #217 <Method boolean isValidDevice(BluetoothDevice)>
	//*  24   57:ifeq            123
		{
			if(i != 0 && i != 100)
	//*  25   60:iload_2         
	//*  26   61:ifeq            72
	//*  27   64:iload_2         
	//*  28   65:bipush          100
	//*  29   67:icmpeq          72
				return false;
	//   30   70:iconst_0        
	//   31   71:ireturn         
			boolean flag;
			try
			{
				flag = mService.setPriority(bluetoothdevice, i);
	//   32   72:aload_0         
	//   33   73:getfield        #156 <Field IBluetoothInputDevice mService>
	//   34   76:aload_1         
	//   35   77:iload_2         
	//   36   78:invokeinterface #285 <Method boolean IBluetoothInputDevice.setPriority(BluetoothDevice, int)>
	//   37   83:istore_3        
			}
	//*  38   84:iload_3         
	//*  39   85:ireturn         
			// Misplaced declaration of an exception variable
			catch(BluetoothDevice bluetoothdevice)
	//*  40   86:astore_1        
			{
				Log.e("BluetoothInputDevice", (new StringBuilder()).append("Stack:").append(Log.getStackTraceString(new Throwable())).toString());
	//   41   87:ldc1            #65  <String "BluetoothInputDevice">
	//   42   89:new             #196 <Class StringBuilder>
	//   43   92:dup             
	//   44   93:invokespecial   #197 <Method void StringBuilder()>
	//   45   96:ldc1            #221 <String "Stack:">
	//   46   98:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   47  101:new             #223 <Class Throwable>
	//   48  104:dup             
	//   49  105:invokespecial   #224 <Method void Throwable()>
	//   50  108:invokestatic    #228 <Method String Log.getStackTraceString(Throwable)>
	//   51  111:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   52  114:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   53  117:invokestatic    #149 <Method int Log.e(String, String)>
	//   54  120:pop             
				return false;
	//   55  121:iconst_0        
	//   56  122:ireturn         
			}
			return flag;
		}
		if(mService == null)
	//*  57  123:aload_0         
	//*  58  124:getfield        #156 <Field IBluetoothInputDevice mService>
	//*  59  127:ifnonnull       138
			Log.w("BluetoothInputDevice", "Proxy not attached to service");
	//   60  130:ldc1            #65  <String "BluetoothInputDevice">
	//   61  132:ldc1            #230 <String "Proxy not attached to service">
	//   62  134:invokestatic    #233 <Method int Log.w(String, String)>
	//   63  137:pop             
		return false;
	//   64  138:iconst_0        
	//   65  139:ireturn         
	}

	public boolean setProtocolMode(BluetoothDevice bluetoothdevice, int i)
	{
		log((new StringBuilder()).append("setProtocolMode(").append(((Object) (bluetoothdevice))).append(")").toString());
	//    0    0:new             #196 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #197 <Method void StringBuilder()>
	//    3    7:ldc2            #288 <String "setProtocolMode(">
	//    4   10:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//    5   13:aload_1         
	//    6   14:invokevirtual   #206 <Method StringBuilder StringBuilder.append(Object)>
	//    7   17:ldc1            #208 <String ")">
	//    8   19:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//    9   22:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   10   25:invokestatic    #213 <Method void log(String)>
		if(mService != null && isEnabled() && isValidDevice(bluetoothdevice))
	//*  11   28:aload_0         
	//*  12   29:getfield        #156 <Field IBluetoothInputDevice mService>
	//*  13   32:ifnull          101
	//*  14   35:aload_0         
	//*  15   36:invokespecial   #215 <Method boolean isEnabled()>
	//*  16   39:ifeq            101
	//*  17   42:aload_0         
	//*  18   43:aload_1         
	//*  19   44:invokespecial   #217 <Method boolean isValidDevice(BluetoothDevice)>
	//*  20   47:ifeq            101
		{
			boolean flag;
			try
			{
				flag = mService.setProtocolMode(bluetoothdevice, i);
	//   21   50:aload_0         
	//   22   51:getfield        #156 <Field IBluetoothInputDevice mService>
	//   23   54:aload_1         
	//   24   55:iload_2         
	//   25   56:invokeinterface #290 <Method boolean IBluetoothInputDevice.setProtocolMode(BluetoothDevice, int)>
	//   26   61:istore_3        
			}
	//*  27   62:iload_3         
	//*  28   63:ireturn         
			// Misplaced declaration of an exception variable
			catch(BluetoothDevice bluetoothdevice)
	//*  29   64:astore_1        
			{
				Log.e("BluetoothInputDevice", (new StringBuilder()).append("Stack:").append(Log.getStackTraceString(new Throwable())).toString());
	//   30   65:ldc1            #65  <String "BluetoothInputDevice">
	//   31   67:new             #196 <Class StringBuilder>
	//   32   70:dup             
	//   33   71:invokespecial   #197 <Method void StringBuilder()>
	//   34   74:ldc1            #221 <String "Stack:">
	//   35   76:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   36   79:new             #223 <Class Throwable>
	//   37   82:dup             
	//   38   83:invokespecial   #224 <Method void Throwable()>
	//   39   86:invokestatic    #228 <Method String Log.getStackTraceString(Throwable)>
	//   40   89:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   41   92:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   42   95:invokestatic    #149 <Method int Log.e(String, String)>
	//   43   98:pop             
				return false;
	//   44   99:iconst_0        
	//   45  100:ireturn         
			}
			return flag;
		}
		if(mService == null)
	//*  46  101:aload_0         
	//*  47  102:getfield        #156 <Field IBluetoothInputDevice mService>
	//*  48  105:ifnonnull       116
			Log.w("BluetoothInputDevice", "Proxy not attached to service");
	//   49  108:ldc1            #65  <String "BluetoothInputDevice">
	//   50  110:ldc1            #230 <String "Proxy not attached to service">
	//   51  112:invokestatic    #233 <Method int Log.w(String, String)>
	//   52  115:pop             
		return false;
	//   53  116:iconst_0        
	//   54  117:ireturn         
	}

	public boolean setReport(BluetoothDevice bluetoothdevice, byte byte0, String s)
	{
		log((new StringBuilder()).append("setReport(").append(((Object) (bluetoothdevice))).append("), reportType=").append(((int) (byte0))).append(" report=").append(s).toString());
	//    0    0:new             #196 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #197 <Method void StringBuilder()>
	//    3    7:ldc2            #294 <String "setReport(">
	//    4   10:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//    5   13:aload_1         
	//    6   14:invokevirtual   #206 <Method StringBuilder StringBuilder.append(Object)>
	//    7   17:ldc2            #296 <String "), reportType=">
	//    8   20:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//    9   23:iload_2         
	//   10   24:invokevirtual   #283 <Method StringBuilder StringBuilder.append(int)>
	//   11   27:ldc2            #298 <String " report=">
	//   12   30:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   13   33:aload_3         
	//   14   34:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   15   37:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   16   40:invokestatic    #213 <Method void log(String)>
		if(mService != null && isEnabled() && isValidDevice(bluetoothdevice))
	//*  17   43:aload_0         
	//*  18   44:getfield        #156 <Field IBluetoothInputDevice mService>
	//*  19   47:ifnull          119
	//*  20   50:aload_0         
	//*  21   51:invokespecial   #215 <Method boolean isEnabled()>
	//*  22   54:ifeq            119
	//*  23   57:aload_0         
	//*  24   58:aload_1         
	//*  25   59:invokespecial   #217 <Method boolean isValidDevice(BluetoothDevice)>
	//*  26   62:ifeq            119
		{
			boolean flag;
			try
			{
				flag = mService.setReport(bluetoothdevice, byte0, s);
	//   27   65:aload_0         
	//   28   66:getfield        #156 <Field IBluetoothInputDevice mService>
	//   29   69:aload_1         
	//   30   70:iload_2         
	//   31   71:aload_3         
	//   32   72:invokeinterface #300 <Method boolean IBluetoothInputDevice.setReport(BluetoothDevice, byte, String)>
	//   33   77:istore          4
			}
	//*  34   79:iload           4
	//*  35   81:ireturn         
			// Misplaced declaration of an exception variable
			catch(BluetoothDevice bluetoothdevice)
	//*  36   82:astore_1        
			{
				Log.e("BluetoothInputDevice", (new StringBuilder()).append("Stack:").append(Log.getStackTraceString(new Throwable())).toString());
	//   37   83:ldc1            #65  <String "BluetoothInputDevice">
	//   38   85:new             #196 <Class StringBuilder>
	//   39   88:dup             
	//   40   89:invokespecial   #197 <Method void StringBuilder()>
	//   41   92:ldc1            #221 <String "Stack:">
	//   42   94:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   43   97:new             #223 <Class Throwable>
	//   44  100:dup             
	//   45  101:invokespecial   #224 <Method void Throwable()>
	//   46  104:invokestatic    #228 <Method String Log.getStackTraceString(Throwable)>
	//   47  107:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   48  110:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   49  113:invokestatic    #149 <Method int Log.e(String, String)>
	//   50  116:pop             
				return false;
	//   51  117:iconst_0        
	//   52  118:ireturn         
			}
			return flag;
		}
		if(mService == null)
	//*  53  119:aload_0         
	//*  54  120:getfield        #156 <Field IBluetoothInputDevice mService>
	//*  55  123:ifnonnull       134
			Log.w("BluetoothInputDevice", "Proxy not attached to service");
	//   56  126:ldc1            #65  <String "BluetoothInputDevice">
	//   57  128:ldc1            #230 <String "Proxy not attached to service">
	//   58  130:invokestatic    #233 <Method int Log.w(String, String)>
	//   59  133:pop             
		return false;
	//   60  134:iconst_0        
	//   61  135:ireturn         
	}

	public boolean virtualUnplug(BluetoothDevice bluetoothdevice)
	{
		log((new StringBuilder()).append("virtualUnplug(").append(((Object) (bluetoothdevice))).append(")").toString());
	//    0    0:new             #196 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #197 <Method void StringBuilder()>
	//    3    7:ldc2            #303 <String "virtualUnplug(">
	//    4   10:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//    5   13:aload_1         
	//    6   14:invokevirtual   #206 <Method StringBuilder StringBuilder.append(Object)>
	//    7   17:ldc1            #208 <String ")">
	//    8   19:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//    9   22:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   10   25:invokestatic    #213 <Method void log(String)>
		if(mService != null && isEnabled() && isValidDevice(bluetoothdevice))
	//*  11   28:aload_0         
	//*  12   29:getfield        #156 <Field IBluetoothInputDevice mService>
	//*  13   32:ifnull          100
	//*  14   35:aload_0         
	//*  15   36:invokespecial   #215 <Method boolean isEnabled()>
	//*  16   39:ifeq            100
	//*  17   42:aload_0         
	//*  18   43:aload_1         
	//*  19   44:invokespecial   #217 <Method boolean isValidDevice(BluetoothDevice)>
	//*  20   47:ifeq            100
		{
			boolean flag;
			try
			{
				flag = mService.virtualUnplug(bluetoothdevice);
	//   21   50:aload_0         
	//   22   51:getfield        #156 <Field IBluetoothInputDevice mService>
	//   23   54:aload_1         
	//   24   55:invokeinterface #305 <Method boolean IBluetoothInputDevice.virtualUnplug(BluetoothDevice)>
	//   25   60:istore_2        
			}
	//*  26   61:iload_2         
	//*  27   62:ireturn         
			// Misplaced declaration of an exception variable
			catch(BluetoothDevice bluetoothdevice)
	//*  28   63:astore_1        
			{
				Log.e("BluetoothInputDevice", (new StringBuilder()).append("Stack:").append(Log.getStackTraceString(new Throwable())).toString());
	//   29   64:ldc1            #65  <String "BluetoothInputDevice">
	//   30   66:new             #196 <Class StringBuilder>
	//   31   69:dup             
	//   32   70:invokespecial   #197 <Method void StringBuilder()>
	//   33   73:ldc1            #221 <String "Stack:">
	//   34   75:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   35   78:new             #223 <Class Throwable>
	//   36   81:dup             
	//   37   82:invokespecial   #224 <Method void Throwable()>
	//   38   85:invokestatic    #228 <Method String Log.getStackTraceString(Throwable)>
	//   39   88:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   40   91:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   41   94:invokestatic    #149 <Method int Log.e(String, String)>
	//   42   97:pop             
				return false;
	//   43   98:iconst_0        
	//   44   99:ireturn         
			}
			return flag;
		}
		if(mService == null)
	//*  45  100:aload_0         
	//*  46  101:getfield        #156 <Field IBluetoothInputDevice mService>
	//*  47  104:ifnonnull       115
			Log.w("BluetoothInputDevice", "Proxy not attached to service");
	//   48  107:ldc1            #65  <String "BluetoothInputDevice">
	//   49  109:ldc1            #230 <String "Proxy not attached to service">
	//   50  111:invokestatic    #233 <Method int Log.w(String, String)>
	//   51  114:pop             
		return false;
	//   52  115:iconst_0        
	//   53  116:ireturn         
	}

	public static final String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.input.profile.action.CONNECTION_STATE_CHANGED";
	public static final String ACTION_PROTOCOL_MODE_CHANGED = "android.bluetooth.input.profile.action.PROTOCOL_MODE_CHANGED";
	public static final String ACTION_VIRTUAL_UNPLUG_STATUS = "android.bluetooth.input.profile.action.VIRTUAL_UNPLUG_STATUS";
	private static final boolean DBG = true;
	public static final String EXTRA_PROTOCOL_MODE = "android.bluetooth.BluetoothInputDevice.extra.PROTOCOL_MODE";
	public static final String EXTRA_REPORT = "android.bluetooth.BluetoothInputDevice.extra.REPORT";
	public static final String EXTRA_REPORT_BUFFER_SIZE = "android.bluetooth.BluetoothInputDevice.extra.REPORT_BUFFER_SIZE";
	public static final String EXTRA_REPORT_ID = "android.bluetooth.BluetoothInputDevice.extra.REPORT_ID";
	public static final String EXTRA_REPORT_TYPE = "android.bluetooth.BluetoothInputDevice.extra.REPORT_TYPE";
	public static final String EXTRA_VIRTUAL_UNPLUG_STATUS = "android.bluetooth.BluetoothInputDevice.extra.VIRTUAL_UNPLUG_STATUS";
	public static final int INPUT_CONNECT_FAILED_ALREADY_CONNECTED = 5001;
	public static final int INPUT_CONNECT_FAILED_ATTEMPT_FAILED = 5002;
	public static final int INPUT_DISCONNECT_FAILED_NOT_CONNECTED = 5000;
	public static final int INPUT_OPERATION_GENERIC_FAILURE = 5003;
	public static final int INPUT_OPERATION_SUCCESS = 5004;
	public static final int PROTOCOL_BOOT_MODE = 1;
	public static final int PROTOCOL_REPORT_MODE = 0;
	public static final int PROTOCOL_UNSUPPORTED_MODE = 255;
	public static final byte REPORT_TYPE_FEATURE = 2;
	public static final byte REPORT_TYPE_INPUT = 0;
	public static final byte REPORT_TYPE_OUTPUT = 1;
	private static final String TAG = "BluetoothInputDevice";
	private static final boolean VDBG = false;
	public static final int VIRTUAL_UNPLUG_STATUS_FAIL = 1;
	public static final int VIRTUAL_UNPLUG_STATUS_SUCCESS = 0;
	private BluetoothAdapter mAdapter;
	private final IBluetoothStateChangeCallback mBluetoothStateChangeCallback = new IBluetoothStateChangeCallback.Stub() {

		public void onBluetoothStateChange(boolean flag)
		{
			Log.d("BluetoothInputDevice", (new StringBuilder()).append("onBluetoothStateChange: up=").append(flag).toString());
		//    0    0:ldc1            #22  <String "BluetoothInputDevice">
		//    1    2:new             #24  <Class StringBuilder>
		//    2    5:dup             
		//    3    6:invokespecial   #25  <Method void StringBuilder()>
		//    4    9:ldc1            #27  <String "onBluetoothStateChange: up=">
		//    5   11:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
		//    6   14:iload_1         
		//    7   15:invokevirtual   #34  <Method StringBuilder StringBuilder.append(boolean)>
		//    8   18:invokevirtual   #38  <Method String StringBuilder.toString()>
		//    9   21:invokestatic    #44  <Method int Log.d(String, String)>
		//   10   24:pop             
			if(flag)
				break MISSING_BLOCK_LABEL_89;
		//   11   25:iload_1         
		//   12   26:ifne            89
			ServiceConnection serviceconnection = mConnection;
		//   13   29:aload_0         
		//   14   30:getfield        #12  <Field BluetoothInputDevice this$0>
		//   15   33:invokestatic    #48  <Method ServiceConnection BluetoothInputDevice.access$000(BluetoothInputDevice)>
		//   16   36:astore_2        
			serviceconnection;
		//   17   37:aload_2         
			JVM INSTR monitorenter ;
		//   18   38:monitorenter    
			mService = null;
		//   19   39:aload_0         
		//   20   40:getfield        #12  <Field BluetoothInputDevice this$0>
		//   21   43:aconst_null     
		//   22   44:invokestatic    #52  <Method IBluetoothInputDevice BluetoothInputDevice.access$102(BluetoothInputDevice, IBluetoothInputDevice)>
		//   23   47:pop             
			mContext.unbindService(mConnection);
		//   24   48:aload_0         
		//   25   49:getfield        #12  <Field BluetoothInputDevice this$0>
		//   26   52:invokestatic    #56  <Method Context BluetoothInputDevice.access$200(BluetoothInputDevice)>
		//   27   55:aload_0         
		//   28   56:getfield        #12  <Field BluetoothInputDevice this$0>
		//   29   59:invokestatic    #48  <Method ServiceConnection BluetoothInputDevice.access$000(BluetoothInputDevice)>
		//   30   62:invokevirtual   #62  <Method void Context.unbindService(ServiceConnection)>
			break MISSING_BLOCK_LABEL_78;
		//   31   65:goto            78
			Object obj;
			obj;
		//   32   68:astore_3        
			Log.e("BluetoothInputDevice", "", ((Throwable) (obj)));
		//   33   69:ldc1            #22  <String "BluetoothInputDevice">
		//   34   71:ldc1            #64  <String "">
		//   35   73:aload_3         
		//   36   74:invokestatic    #68  <Method int Log.e(String, String, Throwable)>
		//   37   77:pop             
			serviceconnection;
		//   38   78:aload_2         
			JVM INSTR monitorexit ;
		//   39   79:monitorexit     
			  goto _L1
		//*  40   80:goto            88
			obj;
		//   41   83:astore_3        
		//*  42   84:aload_2         
			throw obj;
		//   43   85:monitorexit     
		//   44   86:aload_3         
		//   45   87:athrow          
_L1:
			return;
		//   46   88:return          
			serviceconnection = mConnection;
		//   47   89:aload_0         
		//   48   90:getfield        #12  <Field BluetoothInputDevice this$0>
		//   49   93:invokestatic    #48  <Method ServiceConnection BluetoothInputDevice.access$000(BluetoothInputDevice)>
		//   50   96:astore_2        
			serviceconnection;
		//   51   97:aload_2         
			JVM INSTR monitorenter ;
		//   52   98:monitorenter    
			if(mService == null && !mContext.bindService(new Intent(((Class) (android/bluetooth/IBluetoothInputDevice)).getName()), mConnection, 0))
		//*  53   99:aload_0         
		//*  54  100:getfield        #12  <Field BluetoothInputDevice this$0>
		//*  55  103:invokestatic    #72  <Method IBluetoothInputDevice BluetoothInputDevice.access$100(BluetoothInputDevice)>
		//*  56  106:ifnonnull       150
		//*  57  109:aload_0         
		//*  58  110:getfield        #12  <Field BluetoothInputDevice this$0>
		//*  59  113:invokestatic    #56  <Method Context BluetoothInputDevice.access$200(BluetoothInputDevice)>
		//*  60  116:new             #74  <Class Intent>
		//*  61  119:dup             
		//*  62  120:ldc1            #76  <Class IBluetoothInputDevice>
		//*  63  122:invokevirtual   #81  <Method String Class.getName()>
		//*  64  125:invokespecial   #84  <Method void Intent(String)>
		//*  65  128:aload_0         
		//*  66  129:getfield        #12  <Field BluetoothInputDevice this$0>
		//*  67  132:invokestatic    #48  <Method ServiceConnection BluetoothInputDevice.access$000(BluetoothInputDevice)>
		//*  68  135:iconst_0        
		//*  69  136:invokevirtual   #88  <Method boolean Context.bindService(Intent, ServiceConnection, int)>
		//*  70  139:ifne            150
				Log.e("BluetoothInputDevice", "Could not bind to Bluetooth HID Service");
		//   71  142:ldc1            #22  <String "BluetoothInputDevice">
		//   72  144:ldc1            #90  <String "Could not bind to Bluetooth HID Service">
		//   73  146:invokestatic    #92  <Method int Log.e(String, String)>
		//   74  149:pop             
			break MISSING_BLOCK_LABEL_163;
		//   75  150:goto            163
			obj;
		//   76  153:astore_3        
			Log.e("BluetoothInputDevice", "", ((Throwable) (obj)));
		//   77  154:ldc1            #22  <String "BluetoothInputDevice">
		//   78  156:ldc1            #64  <String "">
		//   79  158:aload_3         
		//   80  159:invokestatic    #68  <Method int Log.e(String, String, Throwable)>
		//   81  162:pop             
			serviceconnection;
		//   82  163:aload_2         
			JVM INSTR monitorexit ;
		//   83  164:monitorexit     
			return;
		//   84  165:return          
			obj;
		//   85  166:astore_3        
		//*  86  167:aload_2         
			throw obj;
		//   87  168:monitorexit     
		//   88  169:aload_3         
		//   89  170:athrow          
		}

		final BluetoothInputDevice this$0;

			
			{
				this$0 = BluetoothInputDevice.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field BluetoothInputDevice this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void IBluetoothStateChangeCallback$Stub()>
			//    5    9:return          
			}
	}
;
	private ServiceConnection mConnection;
	private Context mContext;
	private IBluetoothInputDevice mService;
	private BluetoothProfile.ServiceListener mServiceListener;


/*
	static ServiceConnection access$000(BluetoothInputDevice bluetoothinputdevice)
	{
		return bluetoothinputdevice.mConnection;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field ServiceConnection mConnection>
	//    2    4:areturn         
	}

*/


/*
	static IBluetoothInputDevice access$100(BluetoothInputDevice bluetoothinputdevice)
	{
		return bluetoothinputdevice.mService;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field IBluetoothInputDevice mService>
	//    2    4:areturn         
	}

*/


/*
	static IBluetoothInputDevice access$102(BluetoothInputDevice bluetoothinputdevice, IBluetoothInputDevice ibluetoothinputdevice)
	{
		bluetoothinputdevice.mService = ibluetoothinputdevice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #156 <Field IBluetoothInputDevice mService>
		return ibluetoothinputdevice;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Context access$200(BluetoothInputDevice bluetoothinputdevice)
	{
		return bluetoothinputdevice.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Context mContext>
	//    2    4:areturn         
	}

*/


/*
	static BluetoothProfile.ServiceListener access$300(BluetoothInputDevice bluetoothinputdevice)
	{
		return bluetoothinputdevice.mServiceListener;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field BluetoothProfile$ServiceListener mServiceListener>
	//    2    4:areturn         
	}

*/
}
