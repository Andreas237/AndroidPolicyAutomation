// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.bluetooth;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;

// Referenced classes of package android.bluetooth:
//			BluetoothInputDevice

class BluetoothInputDevice$2
	implements ServiceConnection
{

	public void onServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		Log.d("BluetoothInputDevice", "Proxy object connected");
	//    0    0:ldc1            #22  <String "BluetoothInputDevice">
	//    1    2:ldc1            #24  <String "Proxy object connected">
	//    2    4:invokestatic    #30  <Method int Log.d(String, String)>
	//    3    7:pop             
		BluetoothInputDevice.access$102(BluetoothInputDevice.this, tub.asInterface(ibinder));
	//    4    8:aload_0         
	//    5    9:getfield        #14  <Field BluetoothInputDevice this$0>
	//    6   12:aload_2         
	//    7   13:invokestatic    #36  <Method IBluetoothInputDevice IBluetoothInputDevice$Stub.asInterface(IBinder)>
	//    8   16:invokestatic    #40  <Method IBluetoothInputDevice BluetoothInputDevice.access$102(BluetoothInputDevice, IBluetoothInputDevice)>
	//    9   19:pop             
		if(BluetoothInputDevice.access$300(BluetoothInputDevice.this) != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #14  <Field BluetoothInputDevice this$0>
	//*  12   24:invokestatic    #44  <Method BluetoothProfile$ServiceListener BluetoothInputDevice.access$300(BluetoothInputDevice)>
	//*  13   27:ifnull          47
			BluetoothInputDevice.access$300(BluetoothInputDevice.this).onServiceConnected(4, ((BluetoothProfile) (BluetoothInputDevice.this)));
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
		BluetoothInputDevice.access$102(BluetoothInputDevice.this, ((IBluetoothInputDevice) (null)));
	//    4    8:aload_0         
	//    5    9:getfield        #14  <Field BluetoothInputDevice this$0>
	//    6   12:aconst_null     
	//    7   13:invokestatic    #40  <Method IBluetoothInputDevice BluetoothInputDevice.access$102(BluetoothInputDevice, IBluetoothInputDevice)>
	//    8   16:pop             
		if(BluetoothInputDevice.access$300(BluetoothInputDevice.this) != null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #14  <Field BluetoothInputDevice this$0>
	//*  11   21:invokestatic    #44  <Method BluetoothProfile$ServiceListener BluetoothInputDevice.access$300(BluetoothInputDevice)>
	//*  12   24:ifnull          40
			BluetoothInputDevice.access$300(BluetoothInputDevice.this).onServiceDisconnected(4);
	//   13   27:aload_0         
	//   14   28:getfield        #14  <Field BluetoothInputDevice this$0>
	//   15   31:invokestatic    #44  <Method BluetoothProfile$ServiceListener BluetoothInputDevice.access$300(BluetoothInputDevice)>
	//   16   34:iconst_4        
	//   17   35:invokeinterface #56  <Method void BluetoothProfile$ServiceListener.onServiceDisconnected(int)>
	//   18   40:return          
	}

	final BluetoothInputDevice this$0;

	BluetoothInputDevice$2()
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
