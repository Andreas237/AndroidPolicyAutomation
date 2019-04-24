// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.o.c;

import android.bluetooth.BluetoothDevice;
import android.util.Log;
import com.irobot.home.h.a;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home.o.c:
//			d

class d$3
	implements Runnable
{

	public void run()
	{
label0:
		{
			synchronized(com.irobot.home.o.c.d.a(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field d a>
	//*   2    4:invokestatic    #23  <Method Object com.irobot.home.o.c.d.a(d)>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
			{
				a.b = com.irobot.home.h.a.a(d.b(a));
	//    6   10:aload_0         
	//    7   11:getfield        #16  <Field d a>
	//    8   14:aload_0         
	//    9   15:getfield        #16  <Field d a>
	//   10   18:invokestatic    #27  <Method com.irobot.core.AssetId d.b(d)>
	//   11   21:invokestatic    #32  <Method BluetoothDevice a.a(com.irobot.core.AssetId)>
	//   12   24:putfield        #35  <Field BluetoothDevice d.b>
				if(a.b != null)
					break label0;
	//   13   27:aload_0         
	//   14   28:getfield        #16  <Field d a>
	//   15   31:getfield        #35  <Field BluetoothDevice d.b>
	//   16   34:ifnonnull       88
				Object obj1 = ((Object) (new StringBuilder()));
	//   17   37:new             #37  <Class StringBuilder>
	//   18   40:dup             
	//   19   41:invokespecial   #38  <Method void StringBuilder()>
	//   20   44:astore_2        
				((StringBuilder) (obj1)).append("BLE Peripheral not found for asset:");
	//   21   45:aload_2         
	//   22   46:ldc1            #40  <String "BLE Peripheral not found for asset:">
	//   23   48:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   24   51:pop             
				((StringBuilder) (obj1)).append(((Object) (d.b(a))));
	//   25   52:aload_2         
	//   26   53:aload_0         
	//   27   54:getfield        #16  <Field d a>
	//   28   57:invokestatic    #27  <Method com.irobot.core.AssetId d.b(d)>
	//   29   60:invokevirtual   #47  <Method StringBuilder StringBuilder.append(Object)>
	//   30   63:pop             
				obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   31   64:aload_2         
	//   32   65:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   33   68:astore_2        
				Log.e("BleSession", ((String) (obj1)));
	//   34   69:ldc1            #53  <String "BleSession">
	//   35   71:aload_2         
	//   36   72:invokestatic    #59  <Method int Log.e(String, String)>
	//   37   75:pop             
				com.irobot.home.o.c.d.a(a, 5, ((String) (obj1)));
	//   38   76:aload_0         
	//   39   77:getfield        #16  <Field d a>
	//   40   80:iconst_5        
	//   41   81:aload_2         
	//   42   82:invokestatic    #62  <Method void com.irobot.home.o.c.d.a(d, int, String)>
			}
	//   43   85:aload_1         
	//   44   86:monitorexit     
			return;
	//   45   87:return          
		}
		StringBuilder stringbuilder = new StringBuilder();
	//   46   88:new             #37  <Class StringBuilder>
	//   47   91:dup             
	//   48   92:invokespecial   #38  <Method void StringBuilder()>
	//   49   95:astore_2        
		stringbuilder.append("connect to BLE Robot ");
	//   50   96:aload_2         
	//   51   97:ldc1            #64  <String "connect to BLE Robot ">
	//   52   99:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   53  102:pop             
		stringbuilder.append(a.b.getName());
	//   54  103:aload_2         
	//   55  104:aload_0         
	//   56  105:getfield        #16  <Field d a>
	//   57  108:getfield        #35  <Field BluetoothDevice d.b>
	//   58  111:invokevirtual   #69  <Method String BluetoothDevice.getName()>
	//   59  114:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   60  117:pop             
		Log.i("BleSession", stringbuilder.toString());
	//   61  118:ldc1            #53  <String "BleSession">
	//   62  120:aload_2         
	//   63  121:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   64  124:invokestatic    #72  <Method int Log.i(String, String)>
	//   65  127:pop             
		a.c = a.b.connectGatt(((android.content.Context) (j.g())), false, d.c(a), 2);
	//   66  128:aload_0         
	//   67  129:getfield        #16  <Field d a>
	//   68  132:aload_0         
	//   69  133:getfield        #16  <Field d a>
	//   70  136:getfield        #35  <Field BluetoothDevice d.b>
	//   71  139:invokestatic    #78  <Method android.app.Application j.g()>
	//   72  142:iconst_0        
	//   73  143:aload_0         
	//   74  144:getfield        #16  <Field d a>
	//   75  147:invokestatic    #82  <Method android.bluetooth.BluetoothGattCallback d.c(d)>
	//   76  150:iconst_2        
	//   77  151:invokevirtual   #86  <Method android.bluetooth.BluetoothGatt BluetoothDevice.connectGatt(android.content.Context, boolean, android.bluetooth.BluetoothGattCallback, int)>
	//   78  154:putfield        #89  <Field android.bluetooth.BluetoothGatt d.c>
		obj;
	//   79  157:aload_1         
		JVM INSTR monitorexit ;
	//   80  158:monitorexit     
		return;
	//   81  159:return          
		exception;
	//   82  160:astore_2        
		obj;
	//   83  161:aload_1         
		JVM INSTR monitorexit ;
	//   84  162:monitorexit     
		throw exception;
	//   85  163:aload_2         
	//   86  164:athrow          
	}

	final d a;

	d$3(d d1)
	{
		a = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field d a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
