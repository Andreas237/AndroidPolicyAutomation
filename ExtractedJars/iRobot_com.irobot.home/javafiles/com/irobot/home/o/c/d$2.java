// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.o.c;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattService;
import android.util.Log;
import com.irobot.core.BleUuidRequestAttribute;
import com.irobot.core.RequestAttributeKey;
import java.util.HashMap;
import java.util.UUID;

// Referenced classes of package com.irobot.home.o.c:
//			d

class d$2
	implements Runnable
{

	public void run()
	{
label0:
		{
			synchronized(d.a(b))
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field d b>
	//*   2    4:invokestatic    #29  <Method Object d.a(d)>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
			{
				if(b.c != null)
					break label0;
	//    6   10:aload_0         
	//    7   11:getfield        #19  <Field d b>
	//    8   14:getfield        #33  <Field BluetoothGatt d.c>
	//    9   17:ifnonnull       41
				Log.e("BleSession", "BluetoothAdapter not initialized");
	//   10   20:ldc1            #35  <String "BleSession">
	//   11   22:ldc1            #37  <String "BluetoothAdapter not initialized">
	//   12   24:invokestatic    #43  <Method int Log.e(String, String)>
	//   13   27:pop             
				d.a(b, 5, "BluetoothAdapter not initialized");
	//   14   28:aload_0         
	//   15   29:getfield        #19  <Field d b>
	//   16   32:iconst_5        
	//   17   33:ldc1            #37  <String "BluetoothAdapter not initialized">
	//   18   35:invokestatic    #46  <Method void d.a(d, int, String)>
			}
	//   19   38:aload_1         
	//   20   39:monitorexit     
			return;
	//   21   40:return          
		}
		Object obj1;
		Object obj2;
		BluetoothGattService bluetoothgattservice;
		obj2 = ((Object) (((BleUuidRequestAttribute)a.get(((Object) (RequestAttributeKey.BleServiceUuid)))).uuidString()));
	//   22   41:aload_0         
	//   23   42:getfield        #21  <Field HashMap a>
	//   24   45:getstatic       #52  <Field RequestAttributeKey RequestAttributeKey.BleServiceUuid>
	//   25   48:invokevirtual   #58  <Method Object HashMap.get(Object)>
	//   26   51:checkcast       #60  <Class BleUuidRequestAttribute>
	//   27   54:invokevirtual   #64  <Method String BleUuidRequestAttribute.uuidString()>
	//   28   57:astore_3        
		obj1 = ((Object) (((BleUuidRequestAttribute)a.get(((Object) (RequestAttributeKey.BleCharacteristicUuid)))).uuidString()));
	//   29   58:aload_0         
	//   30   59:getfield        #21  <Field HashMap a>
	//   31   62:getstatic       #67  <Field RequestAttributeKey RequestAttributeKey.BleCharacteristicUuid>
	//   32   65:invokevirtual   #58  <Method Object HashMap.get(Object)>
	//   33   68:checkcast       #60  <Class BleUuidRequestAttribute>
	//   34   71:invokevirtual   #64  <Method String BleUuidRequestAttribute.uuidString()>
	//   35   74:astore_2        
		bluetoothgattservice = b.c.getService(UUID.fromString(((String) (obj2))));
	//   36   75:aload_0         
	//   37   76:getfield        #19  <Field d b>
	//   38   79:getfield        #33  <Field BluetoothGatt d.c>
	//   39   82:aload_3         
	//   40   83:invokestatic    #73  <Method UUID UUID.fromString(String)>
	//   41   86:invokevirtual   #79  <Method BluetoothGattService BluetoothGatt.getService(UUID)>
	//   42   89:astore          4
		if(bluetoothgattservice != null)
			break MISSING_BLOCK_LABEL_141;
	//   43   91:aload           4
	//   44   93:ifnonnull       141
		obj1 = ((Object) (new StringBuilder()));
	//   45   96:new             #81  <Class StringBuilder>
	//   46   99:dup             
	//   47  100:invokespecial   #82  <Method void StringBuilder()>
	//   48  103:astore_2        
		((StringBuilder) (obj1)).append("Failed to get service for uuid:");
	//   49  104:aload_2         
	//   50  105:ldc1            #84  <String "Failed to get service for uuid:">
	//   51  107:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   52  110:pop             
		((StringBuilder) (obj1)).append(((String) (obj2)));
	//   53  111:aload_2         
	//   54  112:aload_3         
	//   55  113:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   56  116:pop             
		obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   57  117:aload_2         
	//   58  118:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   59  121:astore_2        
		Log.e("BleSession", ((String) (obj1)));
	//   60  122:ldc1            #35  <String "BleSession">
	//   61  124:aload_2         
	//   62  125:invokestatic    #43  <Method int Log.e(String, String)>
	//   63  128:pop             
		d.a(b, 1, ((String) (obj1)));
	//   64  129:aload_0         
	//   65  130:getfield        #19  <Field d b>
	//   66  133:iconst_1        
	//   67  134:aload_2         
	//   68  135:invokestatic    #46  <Method void d.a(d, int, String)>
		obj;
	//   69  138:aload_1         
		JVM INSTR monitorexit ;
	//   70  139:monitorexit     
		return;
	//   71  140:return          
		obj2 = ((Object) (bluetoothgattservice.getCharacteristic(UUID.fromString(((String) (obj1))))));
	//   72  141:aload           4
	//   73  143:aload_2         
	//   74  144:invokestatic    #73  <Method UUID UUID.fromString(String)>
	//   75  147:invokevirtual   #97  <Method android.bluetooth.BluetoothGattCharacteristic BluetoothGattService.getCharacteristic(UUID)>
	//   76  150:astore_3        
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_170;
	//   77  151:aload_3         
	//   78  152:ifnull          170
		b.c.readCharacteristic(((android.bluetooth.BluetoothGattCharacteristic) (obj2)));
	//   79  155:aload_0         
	//   80  156:getfield        #19  <Field d b>
	//   81  159:getfield        #33  <Field BluetoothGatt d.c>
	//   82  162:aload_3         
	//   83  163:invokevirtual   #101 <Method boolean BluetoothGatt.readCharacteristic(android.bluetooth.BluetoothGattCharacteristic)>
	//   84  166:pop             
		break MISSING_BLOCK_LABEL_212;
	//   85  167:goto            212
		StringBuilder stringbuilder = new StringBuilder();
	//   86  170:new             #81  <Class StringBuilder>
	//   87  173:dup             
	//   88  174:invokespecial   #82  <Method void StringBuilder()>
	//   89  177:astore_3        
		stringbuilder.append("Error, did not find characteristic ");
	//   90  178:aload_3         
	//   91  179:ldc1            #103 <String "Error, did not find characteristic ">
	//   92  181:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   93  184:pop             
		stringbuilder.append(((String) (obj1)));
	//   94  185:aload_3         
	//   95  186:aload_2         
	//   96  187:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   97  190:pop             
		obj1 = ((Object) (stringbuilder.toString()));
	//   98  191:aload_3         
	//   99  192:invokevirtual   #91  <Method String StringBuilder.toString()>
	//  100  195:astore_2        
		Log.e("BleSession", ((String) (obj1)));
	//  101  196:ldc1            #35  <String "BleSession">
	//  102  198:aload_2         
	//  103  199:invokestatic    #43  <Method int Log.e(String, String)>
	//  104  202:pop             
		d.a(b, 1, ((String) (obj1)));
	//  105  203:aload_0         
	//  106  204:getfield        #19  <Field d b>
	//  107  207:iconst_1        
	//  108  208:aload_2         
	//  109  209:invokestatic    #46  <Method void d.a(d, int, String)>
		obj;
	//  110  212:aload_1         
		JVM INSTR monitorexit ;
	//  111  213:monitorexit     
		return;
	//  112  214:return          
		exception;
	//  113  215:astore_2        
		obj;
	//  114  216:aload_1         
		JVM INSTR monitorexit ;
	//  115  217:monitorexit     
		throw exception;
	//  116  218:aload_2         
	//  117  219:athrow          
	}

	final HashMap a;
	final d b;

	d$2(d d1, HashMap hashmap)
	{
		b = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field d b>
		a = hashmap;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field HashMap a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
