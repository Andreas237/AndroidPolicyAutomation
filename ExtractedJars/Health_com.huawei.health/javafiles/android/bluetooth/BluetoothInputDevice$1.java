// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.bluetooth;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

// Referenced classes of package android.bluetooth:
//			BluetoothInputDevice, IBluetoothInputDevice

class BluetoothInputDevice$1 extends llback.Stub
{

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
		android.content.ServiceConnection serviceconnection = BluetoothInputDevice.access$000(BluetoothInputDevice.this);
	//   13   29:aload_0         
	//   14   30:getfield        #12  <Field BluetoothInputDevice this$0>
	//   15   33:invokestatic    #48  <Method android.content.ServiceConnection BluetoothInputDevice.access$000(BluetoothInputDevice)>
	//   16   36:astore_2        
		serviceconnection;
	//   17   37:aload_2         
		JVM INSTR monitorenter ;
	//   18   38:monitorenter    
		BluetoothInputDevice.access$102(BluetoothInputDevice.this, ((IBluetoothInputDevice) (null)));
	//   19   39:aload_0         
	//   20   40:getfield        #12  <Field BluetoothInputDevice this$0>
	//   21   43:aconst_null     
	//   22   44:invokestatic    #52  <Method IBluetoothInputDevice BluetoothInputDevice.access$102(BluetoothInputDevice, IBluetoothInputDevice)>
	//   23   47:pop             
		BluetoothInputDevice.access$200(BluetoothInputDevice.this).unbindService(BluetoothInputDevice.access$000(BluetoothInputDevice.this));
	//   24   48:aload_0         
	//   25   49:getfield        #12  <Field BluetoothInputDevice this$0>
	//   26   52:invokestatic    #56  <Method Context BluetoothInputDevice.access$200(BluetoothInputDevice)>
	//   27   55:aload_0         
	//   28   56:getfield        #12  <Field BluetoothInputDevice this$0>
	//   29   59:invokestatic    #48  <Method android.content.ServiceConnection BluetoothInputDevice.access$000(BluetoothInputDevice)>
	//   30   62:invokevirtual   #62  <Method void Context.unbindService(android.content.ServiceConnection)>
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
		serviceconnection = BluetoothInputDevice.access$000(BluetoothInputDevice.this);
	//   47   89:aload_0         
	//   48   90:getfield        #12  <Field BluetoothInputDevice this$0>
	//   49   93:invokestatic    #48  <Method android.content.ServiceConnection BluetoothInputDevice.access$000(BluetoothInputDevice)>
	//   50   96:astore_2        
		serviceconnection;
	//   51   97:aload_2         
		JVM INSTR monitorenter ;
	//   52   98:monitorenter    
		if(BluetoothInputDevice.access$100(BluetoothInputDevice.this) == null && !BluetoothInputDevice.access$200(BluetoothInputDevice.this).bindService(new Intent(((Class) (android/bluetooth/IBluetoothInputDevice)).getName()), BluetoothInputDevice.access$000(BluetoothInputDevice.this), 0))
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
	//*  67  132:invokestatic    #48  <Method android.content.ServiceConnection BluetoothInputDevice.access$000(BluetoothInputDevice)>
	//*  68  135:iconst_0        
	//*  69  136:invokevirtual   #88  <Method boolean Context.bindService(Intent, android.content.ServiceConnection, int)>
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

	BluetoothInputDevice$1()
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
