// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.o.c;

import android.bluetooth.*;
import android.util.Log;
import com.irobot.core.NetworkBleCallback;
import com.irobot.core.NetworkSessionCallback;
import java.util.*;

// Referenced classes of package com.irobot.home.o.c:
//			d

class d$4 extends BluetoothGattCallback
{

	public void onCharacteristicChanged(BluetoothGatt bluetoothgatt, BluetoothGattCharacteristic bluetoothgattcharacteristic)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #20  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("onCharacteristicChanged for ");
	//    4    8:aload_3         
	//    5    9:ldc1            #23  <String "onCharacteristicChanged for ">
	//    6   11:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(bluetoothgatt.getDevice().getName());
	//    8   15:aload_3         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #33  <Method BluetoothDevice BluetoothGatt.getDevice()>
	//   11   20:invokevirtual   #39  <Method String BluetoothDevice.getName()>
	//   12   23:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		Log.i("BleSession", stringbuilder.toString());
	//   14   27:ldc1            #41  <String "BleSession">
	//   15   29:aload_3         
	//   16   30:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   17   33:invokestatic    #50  <Method int Log.i(String, String)>
	//   18   36:pop             
		if(d.h(a) != null)
	//*  19   37:aload_0         
	//*  20   38:getfield        #12  <Field d a>
	//*  21   41:invokestatic    #54  <Method NetworkBleCallback d.h(d)>
	//*  22   44:ifnull          68
			d.h(a).onCharacteristicValueUpdated(bluetoothgattcharacteristic.getUuid().toString(), bluetoothgattcharacteristic.getValue());
	//   23   47:aload_0         
	//   24   48:getfield        #12  <Field d a>
	//   25   51:invokestatic    #54  <Method NetworkBleCallback d.h(d)>
	//   26   54:aload_2         
	//   27   55:invokevirtual   #60  <Method UUID BluetoothGattCharacteristic.getUuid()>
	//   28   58:invokevirtual   #63  <Method String UUID.toString()>
	//   29   61:aload_2         
	//   30   62:invokevirtual   #67  <Method byte[] BluetoothGattCharacteristic.getValue()>
	//   31   65:invokevirtual   #73  <Method void NetworkBleCallback.onCharacteristicValueUpdated(String, byte[])>
	//   32   68:return          
	}

	public void onCharacteristicRead(BluetoothGatt bluetoothgatt, BluetoothGattCharacteristic bluetoothgattcharacteristic, int i)
	{
		bluetoothgatt = ((BluetoothGatt) (new StringBuilder()));
	//    0    0:new             #20  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (bluetoothgatt)).append("onCharacteristicRead for ");
	//    4    8:aload_1         
	//    5    9:ldc1            #77  <String "onCharacteristicRead for ">
	//    6   11:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (bluetoothgatt)).append(a.b.getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #12  <Field d a>
	//   11   20:getfield        #81  <Field BluetoothDevice d.b>
	//   12   23:invokevirtual   #39  <Method String BluetoothDevice.getName()>
	//   13   26:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
		((StringBuilder) (bluetoothgatt)).append(" status:");
	//   15   30:aload_1         
	//   16   31:ldc1            #83  <String " status:">
	//   17   33:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
		((StringBuilder) (bluetoothgatt)).append(i);
	//   19   37:aload_1         
	//   20   38:iload_3         
	//   21   39:invokevirtual   #86  <Method StringBuilder StringBuilder.append(int)>
	//   22   42:pop             
		Log.i("BleSession", ((StringBuilder) (bluetoothgatt)).toString());
	//   23   43:ldc1            #41  <String "BleSession">
	//   24   45:aload_1         
	//   25   46:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   26   49:invokestatic    #50  <Method int Log.i(String, String)>
	//   27   52:pop             
		if(i == 0)
	//*  28   53:iload_3         
	//*  29   54:ifne            89
		{
			if(d.h(a) != null)
	//*  30   57:aload_0         
	//*  31   58:getfield        #12  <Field d a>
	//*  32   61:invokestatic    #54  <Method NetworkBleCallback d.h(d)>
	//*  33   64:ifnull          116
			{
				d.h(a).onReadCharacteristicSuccess(bluetoothgattcharacteristic.getUuid().toString(), bluetoothgattcharacteristic.getValue());
	//   34   67:aload_0         
	//   35   68:getfield        #12  <Field d a>
	//   36   71:invokestatic    #54  <Method NetworkBleCallback d.h(d)>
	//   37   74:aload_2         
	//   38   75:invokevirtual   #60  <Method UUID BluetoothGattCharacteristic.getUuid()>
	//   39   78:invokevirtual   #63  <Method String UUID.toString()>
	//   40   81:aload_2         
	//   41   82:invokevirtual   #67  <Method byte[] BluetoothGattCharacteristic.getValue()>
	//   42   85:invokevirtual   #89  <Method void NetworkBleCallback.onReadCharacteristicSuccess(String, byte[])>
				return;
	//   43   88:return          
			}
		} else
		if(d.h(a) != null)
	//*  44   89:aload_0         
	//*  45   90:getfield        #12  <Field d a>
	//*  46   93:invokestatic    #54  <Method NetworkBleCallback d.h(d)>
	//*  47   96:ifnull          116
			d.h(a).onReadCharacteristicFailed(bluetoothgattcharacteristic.getUuid().toString());
	//   48   99:aload_0         
	//   49  100:getfield        #12  <Field d a>
	//   50  103:invokestatic    #54  <Method NetworkBleCallback d.h(d)>
	//   51  106:aload_2         
	//   52  107:invokevirtual   #60  <Method UUID BluetoothGattCharacteristic.getUuid()>
	//   53  110:invokevirtual   #63  <Method String UUID.toString()>
	//   54  113:invokevirtual   #93  <Method void NetworkBleCallback.onReadCharacteristicFailed(String)>
	//   55  116:return          
	}

	public void onCharacteristicWrite(BluetoothGatt bluetoothgatt, BluetoothGattCharacteristic bluetoothgattcharacteristic, int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #20  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append("onCharacteristicWrite for ");
	//    4    9:aload           4
	//    5   11:ldc1            #96  <String "onCharacteristicWrite for ">
	//    6   13:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(bluetoothgatt.getDevice().getName());
	//    8   17:aload           4
	//    9   19:aload_1         
	//   10   20:invokevirtual   #33  <Method BluetoothDevice BluetoothGatt.getDevice()>
	//   11   23:invokevirtual   #39  <Method String BluetoothDevice.getName()>
	//   12   26:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   13   29:pop             
		stringbuilder.append(" status:");
	//   14   30:aload           4
	//   15   32:ldc1            #83  <String " status:">
	//   16   34:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
		stringbuilder.append(i);
	//   18   38:aload           4
	//   19   40:iload_3         
	//   20   41:invokevirtual   #86  <Method StringBuilder StringBuilder.append(int)>
	//   21   44:pop             
		Log.i("BleSession", stringbuilder.toString());
	//   22   45:ldc1            #41  <String "BleSession">
	//   23   47:aload           4
	//   24   49:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   25   52:invokestatic    #50  <Method int Log.i(String, String)>
	//   26   55:pop             
		if(i == 0)
	//*  27   56:iload_3         
	//*  28   57:ifne            92
		{
			if(d.h(a) != null)
	//*  29   60:aload_0         
	//*  30   61:getfield        #12  <Field d a>
	//*  31   64:invokestatic    #54  <Method NetworkBleCallback d.h(d)>
	//*  32   67:ifnull          119
			{
				d.h(a).onWriteCharacteristicSuccess(bluetoothgattcharacteristic.getUuid().toString(), bluetoothgattcharacteristic.getValue());
	//   33   70:aload_0         
	//   34   71:getfield        #12  <Field d a>
	//   35   74:invokestatic    #54  <Method NetworkBleCallback d.h(d)>
	//   36   77:aload_2         
	//   37   78:invokevirtual   #60  <Method UUID BluetoothGattCharacteristic.getUuid()>
	//   38   81:invokevirtual   #63  <Method String UUID.toString()>
	//   39   84:aload_2         
	//   40   85:invokevirtual   #67  <Method byte[] BluetoothGattCharacteristic.getValue()>
	//   41   88:invokevirtual   #99  <Method void NetworkBleCallback.onWriteCharacteristicSuccess(String, byte[])>
				return;
	//   42   91:return          
			}
		} else
		if(d.h(a) != null)
	//*  43   92:aload_0         
	//*  44   93:getfield        #12  <Field d a>
	//*  45   96:invokestatic    #54  <Method NetworkBleCallback d.h(d)>
	//*  46   99:ifnull          119
			d.h(a).onWriteCharacteristicFailed(bluetoothgattcharacteristic.getUuid().toString());
	//   47  102:aload_0         
	//   48  103:getfield        #12  <Field d a>
	//   49  106:invokestatic    #54  <Method NetworkBleCallback d.h(d)>
	//   50  109:aload_2         
	//   51  110:invokevirtual   #60  <Method UUID BluetoothGattCharacteristic.getUuid()>
	//   52  113:invokevirtual   #63  <Method String UUID.toString()>
	//   53  116:invokevirtual   #102 <Method void NetworkBleCallback.onWriteCharacteristicFailed(String)>
	//   54  119:return          
	}

	public void onConnectionStateChange(BluetoothGatt bluetoothgatt, int i, int j)
	{
		if(j == 2)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:icmpne          73
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #20  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void StringBuilder()>
	//    6   12:astore          4
			stringbuilder.append("GATT CONNECTED for ");
	//    7   14:aload           4
	//    8   16:ldc1            #106 <String "GATT CONNECTED for ">
	//    9   18:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
			stringbuilder.append(a.b.getName());
	//   11   22:aload           4
	//   12   24:aload_0         
	//   13   25:getfield        #12  <Field d a>
	//   14   28:getfield        #81  <Field BluetoothDevice d.b>
	//   15   31:invokevirtual   #39  <Method String BluetoothDevice.getName()>
	//   16   34:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
			stringbuilder.append(" w/status ");
	//   18   38:aload           4
	//   19   40:ldc1            #108 <String " w/status ">
	//   20   42:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   21   45:pop             
			stringbuilder.append(i);
	//   22   46:aload           4
	//   23   48:iload_2         
	//   24   49:invokevirtual   #86  <Method StringBuilder StringBuilder.append(int)>
	//   25   52:pop             
			Log.i("BleSession", stringbuilder.toString());
	//   26   53:ldc1            #41  <String "BleSession">
	//   27   55:aload           4
	//   28   57:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   29   60:invokestatic    #50  <Method int Log.i(String, String)>
	//   30   63:pop             
			bluetoothgatt.requestMtu(158);
	//   31   64:aload_1         
	//   32   65:sipush          158
	//   33   68:invokevirtual   #112 <Method boolean BluetoothGatt.requestMtu(int)>
	//   34   71:pop             
			return;
	//   35   72:return          
		}
		if(j == 0)
	//*  36   73:iload_3         
	//*  37   74:ifne            199
		{
			bluetoothgatt = ((BluetoothGatt) (new StringBuilder()));
	//   38   77:new             #20  <Class StringBuilder>
	//   39   80:dup             
	//   40   81:invokespecial   #21  <Method void StringBuilder()>
	//   41   84:astore_1        
			((StringBuilder) (bluetoothgatt)).append("GATT DISCONNECTED for ");
	//   42   85:aload_1         
	//   43   86:ldc1            #114 <String "GATT DISCONNECTED for ">
	//   44   88:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   45   91:pop             
			((StringBuilder) (bluetoothgatt)).append(a.b.getName());
	//   46   92:aload_1         
	//   47   93:aload_0         
	//   48   94:getfield        #12  <Field d a>
	//   49   97:getfield        #81  <Field BluetoothDevice d.b>
	//   50  100:invokevirtual   #39  <Method String BluetoothDevice.getName()>
	//   51  103:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   52  106:pop             
			((StringBuilder) (bluetoothgatt)).append(" w/status ");
	//   53  107:aload_1         
	//   54  108:ldc1            #108 <String " w/status ">
	//   55  110:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   56  113:pop             
			((StringBuilder) (bluetoothgatt)).append(i);
	//   57  114:aload_1         
	//   58  115:iload_2         
	//   59  116:invokevirtual   #86  <Method StringBuilder StringBuilder.append(int)>
	//   60  119:pop             
			Log.i("BleSession", ((StringBuilder) (bluetoothgatt)).toString());
	//   61  120:ldc1            #41  <String "BleSession">
	//   62  122:aload_1         
	//   63  123:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   64  126:invokestatic    #50  <Method int Log.i(String, String)>
	//   65  129:pop             
			a.c.close();
	//   66  130:aload_0         
	//   67  131:getfield        #12  <Field d a>
	//   68  134:getfield        #118 <Field BluetoothGatt d.c>
	//   69  137:invokevirtual   #121 <Method void BluetoothGatt.close()>
			a.c = null;
	//   70  140:aload_0         
	//   71  141:getfield        #12  <Field d a>
	//   72  144:aconst_null     
	//   73  145:putfield        #118 <Field BluetoothGatt d.c>
			a.b = null;
	//   74  148:aload_0         
	//   75  149:getfield        #12  <Field d a>
	//   76  152:aconst_null     
	//   77  153:putfield        #81  <Field BluetoothDevice d.b>
			if(i != 0)
	//*  78  156:iload_2         
	//*  79  157:ifeq            179
			{
				Log.e("BleSession", "BLE onConnectionStateChange failed.");
	//   80  160:ldc1            #41  <String "BleSession">
	//   81  162:ldc1            #123 <String "BLE onConnectionStateChange failed.">
	//   82  164:invokestatic    #126 <Method int Log.e(String, String)>
	//   83  167:pop             
				d.a(a, 5, "BLE onConnectionStateChange failed.");
	//   84  168:aload_0         
	//   85  169:getfield        #12  <Field d a>
	//   86  172:iconst_5        
	//   87  173:ldc1            #123 <String "BLE onConnectionStateChange failed.">
	//   88  175:invokestatic    #129 <Method void d.a(d, int, String)>
				return;
	//   89  178:return          
			}
			if(d.d(a) != null)
	//*  90  179:aload_0         
	//*  91  180:getfield        #12  <Field d a>
	//*  92  183:invokestatic    #133 <Method NetworkSessionCallback d.d(d)>
	//*  93  186:ifnull          199
				d.d(a).disconnected();
	//   94  189:aload_0         
	//   95  190:getfield        #12  <Field d a>
	//   96  193:invokestatic    #133 <Method NetworkSessionCallback d.d(d)>
	//   97  196:invokevirtual   #138 <Method void NetworkSessionCallback.disconnected()>
		}
	//   98  199:return          
	}

	public void onDescriptorWrite(BluetoothGatt bluetoothgatt, BluetoothGattDescriptor bluetoothgattdescriptor, int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #20  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append("onDescriptorWrite for ");
	//    4    9:aload           4
	//    5   11:ldc1            #142 <String "onDescriptorWrite for ">
	//    6   13:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(bluetoothgatt.getDevice().getName());
	//    8   17:aload           4
	//    9   19:aload_1         
	//   10   20:invokevirtual   #33  <Method BluetoothDevice BluetoothGatt.getDevice()>
	//   11   23:invokevirtual   #39  <Method String BluetoothDevice.getName()>
	//   12   26:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   13   29:pop             
		stringbuilder.append(" status:");
	//   14   30:aload           4
	//   15   32:ldc1            #83  <String " status:">
	//   16   34:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
		stringbuilder.append(i);
	//   18   38:aload           4
	//   19   40:iload_3         
	//   20   41:invokevirtual   #86  <Method StringBuilder StringBuilder.append(int)>
	//   21   44:pop             
		Log.i("BleSession", stringbuilder.toString());
	//   22   45:ldc1            #41  <String "BleSession">
	//   23   47:aload           4
	//   24   49:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   25   52:invokestatic    #50  <Method int Log.i(String, String)>
	//   26   55:pop             
		if(i == 0 && bluetoothgattdescriptor.getUuid().compareTo(d.a) == 0)
	//*  27   56:iload_3         
	//*  28   57:ifne            89
	//*  29   60:aload_2         
	//*  30   61:invokevirtual   #145 <Method UUID BluetoothGattDescriptor.getUuid()>
	//*  31   64:getstatic       #148 <Field UUID d.a>
	//*  32   67:invokevirtual   #152 <Method int UUID.compareTo(UUID)>
	//*  33   70:ifne            89
		{
			d.b(a, true);
	//   34   73:aload_0         
	//   35   74:getfield        #12  <Field d a>
	//   36   77:iconst_1        
	//   37   78:invokestatic    #155 <Method boolean d.b(d, boolean)>
	//   38   81:pop             
			d.g(a);
	//   39   82:aload_0         
	//   40   83:getfield        #12  <Field d a>
	//   41   86:invokestatic    #158 <Method void d.g(d)>
		}
	//   42   89:return          
	}

	public void onMtuChanged(BluetoothGatt bluetoothgatt, int i, int j)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #20  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append("onMtuChanged for ");
	//    4    9:aload           4
	//    5   11:ldc1            #161 <String "onMtuChanged for ">
	//    6   13:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(bluetoothgatt.getDevice().getName());
	//    8   17:aload           4
	//    9   19:aload_1         
	//   10   20:invokevirtual   #33  <Method BluetoothDevice BluetoothGatt.getDevice()>
	//   11   23:invokevirtual   #39  <Method String BluetoothDevice.getName()>
	//   12   26:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   13   29:pop             
		stringbuilder.append(" status:");
	//   14   30:aload           4
	//   15   32:ldc1            #83  <String " status:">
	//   16   34:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
		stringbuilder.append(j);
	//   18   38:aload           4
	//   19   40:iload_3         
	//   20   41:invokevirtual   #86  <Method StringBuilder StringBuilder.append(int)>
	//   21   44:pop             
		Log.i("BleSession", stringbuilder.toString());
	//   22   45:ldc1            #41  <String "BleSession">
	//   23   47:aload           4
	//   24   49:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   25   52:invokestatic    #50  <Method int Log.i(String, String)>
	//   26   55:pop             
		if(j == 0)
	//*  27   56:iload_3         
	//*  28   57:ifne            66
		{
			bluetoothgatt.discoverServices();
	//   29   60:aload_1         
	//   30   61:invokevirtual   #165 <Method boolean BluetoothGatt.discoverServices()>
	//   31   64:pop             
			return;
	//   32   65:return          
		} else
		{
			Log.e("BleSession", "BLE request for larger MTU failed.");
	//   33   66:ldc1            #41  <String "BleSession">
	//   34   68:ldc1            #167 <String "BLE request for larger MTU failed.">
	//   35   70:invokestatic    #126 <Method int Log.e(String, String)>
	//   36   73:pop             
			d.a(a, 5, "BLE request for larger MTU failed.");
	//   37   74:aload_0         
	//   38   75:getfield        #12  <Field d a>
	//   39   78:iconst_5        
	//   40   79:ldc1            #167 <String "BLE request for larger MTU failed.">
	//   41   81:invokestatic    #129 <Method void d.a(d, int, String)>
			return;
	//   42   84:return          
		}
	}

	public void onReadRemoteRssi(BluetoothGatt bluetoothgatt, int i, int j)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #20  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append("onReadRemoteRssi for ");
	//    4    9:aload           4
	//    5   11:ldc1            #170 <String "onReadRemoteRssi for ">
	//    6   13:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(bluetoothgatt.getDevice().getName());
	//    8   17:aload           4
	//    9   19:aload_1         
	//   10   20:invokevirtual   #33  <Method BluetoothDevice BluetoothGatt.getDevice()>
	//   11   23:invokevirtual   #39  <Method String BluetoothDevice.getName()>
	//   12   26:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   13   29:pop             
		stringbuilder.append(" status:");
	//   14   30:aload           4
	//   15   32:ldc1            #83  <String " status:">
	//   16   34:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
		stringbuilder.append(j);
	//   18   38:aload           4
	//   19   40:iload_3         
	//   20   41:invokevirtual   #86  <Method StringBuilder StringBuilder.append(int)>
	//   21   44:pop             
		Log.i("BleSession", stringbuilder.toString());
	//   22   45:ldc1            #41  <String "BleSession">
	//   23   47:aload           4
	//   24   49:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   25   52:invokestatic    #50  <Method int Log.i(String, String)>
	//   26   55:pop             
	//   27   56:return          
	}

	public void onReliableWriteCompleted(BluetoothGatt bluetoothgatt, int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #20  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("onReliableWriteCompleted for ");
	//    4    8:aload_3         
	//    5    9:ldc1            #174 <String "onReliableWriteCompleted for ">
	//    6   11:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(bluetoothgatt.getDevice().getName());
	//    8   15:aload_3         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #33  <Method BluetoothDevice BluetoothGatt.getDevice()>
	//   11   20:invokevirtual   #39  <Method String BluetoothDevice.getName()>
	//   12   23:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(" status:");
	//   14   27:aload_3         
	//   15   28:ldc1            #83  <String " status:">
	//   16   30:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append(i);
	//   18   34:aload_3         
	//   19   35:iload_2         
	//   20   36:invokevirtual   #86  <Method StringBuilder StringBuilder.append(int)>
	//   21   39:pop             
		Log.i("BleSession", stringbuilder.toString());
	//   22   40:ldc1            #41  <String "BleSession">
	//   23   42:aload_3         
	//   24   43:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   25   46:invokestatic    #50  <Method int Log.i(String, String)>
	//   26   49:pop             
	//   27   50:return          
	}

	public void onServicesDiscovered(BluetoothGatt bluetoothgatt, int i)
	{
		Object obj;
		obj = ((Object) (new StringBuilder()));
	//    0    0:new             #20  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void StringBuilder()>
	//    3    7:astore_3        
		((StringBuilder) (obj)).append("onServicesDiscovered for ");
	//    4    8:aload_3         
	//    5    9:ldc1            #177 <String "onServicesDiscovered for ">
	//    6   11:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(a.b.getName());
	//    8   15:aload_3         
	//    9   16:aload_0         
	//   10   17:getfield        #12  <Field d a>
	//   11   20:getfield        #81  <Field BluetoothDevice d.b>
	//   12   23:invokevirtual   #39  <Method String BluetoothDevice.getName()>
	//   13   26:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
		((StringBuilder) (obj)).append(" status:");
	//   15   30:aload_3         
	//   16   31:ldc1            #83  <String " status:">
	//   17   33:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
		((StringBuilder) (obj)).append(i);
	//   19   37:aload_3         
	//   20   38:iload_2         
	//   21   39:invokevirtual   #86  <Method StringBuilder StringBuilder.append(int)>
	//   22   42:pop             
		Log.i("BleSession", ((StringBuilder) (obj)).toString());
	//   23   43:ldc1            #41  <String "BleSession">
	//   24   45:aload_3         
	//   25   46:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   26   49:invokestatic    #50  <Method int Log.i(String, String)>
	//   27   52:pop             
		if(i != 0)
			break MISSING_BLOCK_LABEL_377;
	//   28   53:iload_2         
	//   29   54:ifne            377
		obj = ((Object) (d.e(a).keySet().iterator()));
	//   30   57:aload_0         
	//   31   58:getfield        #12  <Field d a>
	//   32   61:invokestatic    #180 <Method HashMap d.e(d)>
	//   33   64:invokevirtual   #186 <Method Set HashMap.keySet()>
	//   34   67:invokeinterface #192 <Method Iterator Set.iterator()>
	//   35   72:astore_3        
_L6:
		if(!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
	//   36   73:aload_3         
	//   37   74:invokeinterface #197 <Method boolean Iterator.hasNext()>
	//   38   79:ifeq            360
_L1:
		BluetoothGattService bluetoothgattservice;
		Object obj1;
		obj1 = ((Object) ((String)((Iterator) (obj)).next()));
	//   39   82:aload_3         
	//   40   83:invokeinterface #201 <Method Object Iterator.next()>
	//   41   88:checkcast       #203 <Class String>
	//   42   91:astore          5
		bluetoothgattservice = bluetoothgatt.getService(UUID.fromString(((String) (obj1))));
	//   43   93:aload_1         
	//   44   94:aload           5
	//   45   96:invokestatic    #207 <Method UUID UUID.fromString(String)>
	//   46   99:invokevirtual   #211 <Method BluetoothGattService BluetoothGatt.getService(UUID)>
	//   47  102:astore          4
		if(bluetoothgattservice != null) goto _L4; else goto _L3
	//   48  104:aload           4
	//   49  106:ifnonnull       167
_L3:
		bluetoothgatt = ((BluetoothGatt) (new StringBuilder()));
	//   50  109:new             #20  <Class StringBuilder>
	//   51  112:dup             
	//   52  113:invokespecial   #21  <Method void StringBuilder()>
	//   53  116:astore_1        
		((StringBuilder) (bluetoothgatt)).append("BLE Service ");
	//   54  117:aload_1         
	//   55  118:ldc1            #213 <String "BLE Service ">
	//   56  120:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   57  123:pop             
		((StringBuilder) (bluetoothgatt)).append(((String) (obj1)));
	//   58  124:aload_1         
	//   59  125:aload           5
	//   60  127:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   61  130:pop             
_L7:
		((StringBuilder) (bluetoothgatt)).append(" not found.");
	//   62  131:aload_1         
	//   63  132:ldc1            #215 <String " not found.">
	//   64  134:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   65  137:pop             
		bluetoothgatt = ((BluetoothGatt) (((StringBuilder) (bluetoothgatt)).toString()));
	//   66  138:aload_1         
	//   67  139:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   68  142:astore_1        
		Log.e("BleSession", ((String) (bluetoothgatt)));
	//   69  143:ldc1            #41  <String "BleSession">
	//   70  145:aload_1         
	//   71  146:invokestatic    #126 <Method int Log.e(String, String)>
	//   72  149:pop             
		d.a(a, 1, ((String) (bluetoothgatt)));
	//   73  150:aload_0         
	//   74  151:getfield        #12  <Field d a>
	//   75  154:iconst_1        
	//   76  155:aload_1         
	//   77  156:invokestatic    #129 <Method void d.a(d, int, String)>
		d.f(a);
	//   78  159:aload_0         
	//   79  160:getfield        #12  <Field d a>
	//   80  163:invokestatic    #218 <Method void d.f(d)>
		return;
	//   81  166:return          
_L4:
		obj1 = ((Object) (((ArrayList)d.e(a).get(obj1)).iterator()));
	//   82  167:aload_0         
	//   83  168:getfield        #12  <Field d a>
	//   84  171:invokestatic    #180 <Method HashMap d.e(d)>
	//   85  174:aload           5
	//   86  176:invokevirtual   #222 <Method Object HashMap.get(Object)>
	//   87  179:checkcast       #224 <Class ArrayList>
	//   88  182:invokevirtual   #225 <Method Iterator ArrayList.iterator()>
	//   89  185:astore          5
_L8:
		if(!((Iterator) (obj1)).hasNext()) goto _L6; else goto _L5
	//   90  187:aload           5
	//   91  189:invokeinterface #197 <Method boolean Iterator.hasNext()>
	//   92  194:ifeq            73
_L5:
		BluetoothGattCharacteristic bluetoothgattcharacteristic;
label0:
		{
			String s = (String)((Iterator) (obj1)).next();
	//   93  197:aload           5
	//   94  199:invokeinterface #201 <Method Object Iterator.next()>
	//   95  204:checkcast       #203 <Class String>
	//   96  207:astore          6
			bluetoothgattcharacteristic = bluetoothgattservice.getCharacteristic(UUID.fromString(s));
	//   97  209:aload           4
	//   98  211:aload           6
	//   99  213:invokestatic    #207 <Method UUID UUID.fromString(String)>
	//  100  216:invokevirtual   #231 <Method BluetoothGattCharacteristic BluetoothGattService.getCharacteristic(UUID)>
	//  101  219:astore          7
			StringBuilder stringbuilder = new StringBuilder();
	//  102  221:new             #20  <Class StringBuilder>
	//  103  224:dup             
	//  104  225:invokespecial   #21  <Method void StringBuilder()>
	//  105  228:astore          8
			stringbuilder.append("Found characteristic: ");
	//  106  230:aload           8
	//  107  232:ldc1            #233 <String "Found characteristic: ">
	//  108  234:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//  109  237:pop             
			stringbuilder.append(s);
	//  110  238:aload           8
	//  111  240:aload           6
	//  112  242:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//  113  245:pop             
			Log.d("BleSession", stringbuilder.toString());
	//  114  246:ldc1            #41  <String "BleSession">
	//  115  248:aload           8
	//  116  250:invokevirtual   #44  <Method String StringBuilder.toString()>
	//  117  253:invokestatic    #235 <Method int Log.d(String, String)>
	//  118  256:pop             
			if(bluetoothgattcharacteristic != null)
				break label0;
	//  119  257:aload           7
	//  120  259:ifnonnull       287
			bluetoothgatt = ((BluetoothGatt) (new StringBuilder()));
	//  121  262:new             #20  <Class StringBuilder>
	//  122  265:dup             
	//  123  266:invokespecial   #21  <Method void StringBuilder()>
	//  124  269:astore_1        
			((StringBuilder) (bluetoothgatt)).append("BLE Characteristic ");
	//  125  270:aload_1         
	//  126  271:ldc1            #237 <String "BLE Characteristic ">
	//  127  273:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//  128  276:pop             
			((StringBuilder) (bluetoothgatt)).append(s);
	//  129  277:aload_1         
	//  130  278:aload           6
	//  131  280:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//  132  283:pop             
		}
		  goto _L7
	//* 133  284:goto            131
		i = bluetoothgattcharacteristic.getProperties();
	//  134  287:aload           7
	//  135  289:invokevirtual   #241 <Method int BluetoothGattCharacteristic.getProperties()>
	//  136  292:istore_2        
		if((i & 0x10) > 0)
	//* 137  293:iload_2         
	//* 138  294:bipush          16
	//* 139  296:iand            
	//* 140  297:ifle            311
			bluetoothgatt.setCharacteristicNotification(bluetoothgattcharacteristic, true);
	//  141  300:aload_1         
	//  142  301:aload           7
	//  143  303:iconst_1        
	//  144  304:invokevirtual   #245 <Method boolean BluetoothGatt.setCharacteristicNotification(BluetoothGattCharacteristic, boolean)>
	//  145  307:pop             
		else
	//* 146  308:goto            187
		if((i & 0x20) > 0)
	//* 147  311:iload_2         
	//* 148  312:bipush          32
	//* 149  314:iand            
	//* 150  315:ifle            187
		{
			bluetoothgatt.setCharacteristicNotification(bluetoothgattcharacteristic, true);
	//  151  318:aload_1         
	//  152  319:aload           7
	//  153  321:iconst_1        
	//  154  322:invokevirtual   #245 <Method boolean BluetoothGatt.setCharacteristicNotification(BluetoothGattCharacteristic, boolean)>
	//  155  325:pop             
			BluetoothGattDescriptor bluetoothgattdescriptor = bluetoothgattcharacteristic.getDescriptor(d.a);
	//  156  326:aload           7
	//  157  328:getstatic       #148 <Field UUID d.a>
	//  158  331:invokevirtual   #249 <Method BluetoothGattDescriptor BluetoothGattCharacteristic.getDescriptor(UUID)>
	//  159  334:astore          6
			if(bluetoothgattdescriptor != null)
	//* 160  336:aload           6
	//* 161  338:ifnull          187
			{
				bluetoothgattdescriptor.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
	//  162  341:aload           6
	//  163  343:getstatic       #253 <Field byte[] BluetoothGattDescriptor.ENABLE_INDICATION_VALUE>
	//  164  346:invokevirtual   #257 <Method boolean BluetoothGattDescriptor.setValue(byte[])>
	//  165  349:pop             
				bluetoothgatt.writeDescriptor(bluetoothgattdescriptor);
	//  166  350:aload_1         
	//  167  351:aload           6
	//  168  353:invokevirtual   #261 <Method boolean BluetoothGatt.writeDescriptor(BluetoothGattDescriptor)>
	//  169  356:pop             
			}
		}
		  goto _L8
	//* 170  357:goto            187
_L2:
		d.a(a, true);
	//  171  360:aload_0         
	//  172  361:getfield        #12  <Field d a>
	//  173  364:iconst_1        
	//  174  365:invokestatic    #263 <Method boolean d.a(d, boolean)>
	//  175  368:pop             
		d.g(a);
	//  176  369:aload_0         
	//  177  370:getfield        #12  <Field d a>
	//  178  373:invokestatic    #158 <Method void d.g(d)>
		return;
	//  179  376:return          
		bluetoothgatt = ((BluetoothGatt) (new StringBuilder()));
	//  180  377:new             #20  <Class StringBuilder>
	//  181  380:dup             
	//  182  381:invokespecial   #21  <Method void StringBuilder()>
	//  183  384:astore_1        
		((StringBuilder) (bluetoothgatt)).append("Failed to discover services for ");
	//  184  385:aload_1         
	//  185  386:ldc2            #265 <String "Failed to discover services for ">
	//  186  389:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//  187  392:pop             
		((StringBuilder) (bluetoothgatt)).append(a.b.getName());
	//  188  393:aload_1         
	//  189  394:aload_0         
	//  190  395:getfield        #12  <Field d a>
	//  191  398:getfield        #81  <Field BluetoothDevice d.b>
	//  192  401:invokevirtual   #39  <Method String BluetoothDevice.getName()>
	//  193  404:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//  194  407:pop             
		bluetoothgatt = ((BluetoothGatt) (((StringBuilder) (bluetoothgatt)).toString()));
	//  195  408:aload_1         
	//  196  409:invokevirtual   #44  <Method String StringBuilder.toString()>
	//  197  412:astore_1        
		Log.e("BleSession", ((String) (bluetoothgatt)));
	//  198  413:ldc1            #41  <String "BleSession">
	//  199  415:aload_1         
	//  200  416:invokestatic    #126 <Method int Log.e(String, String)>
	//  201  419:pop             
		d.a(a, 5, ((String) (bluetoothgatt)));
	//  202  420:aload_0         
	//  203  421:getfield        #12  <Field d a>
	//  204  424:iconst_5        
	//  205  425:aload_1         
	//  206  426:invokestatic    #129 <Method void d.a(d, int, String)>
		d.f(a);
	//  207  429:aload_0         
	//  208  430:getfield        #12  <Field d a>
	//  209  433:invokestatic    #218 <Method void d.f(d)>
		return;
	//  210  436:return          
		  goto _L7
	}

	final d a;

	d$4(d d1)
	{
		a = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field d a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void BluetoothGattCallback()>
	//    5    9:return          
	}
}
