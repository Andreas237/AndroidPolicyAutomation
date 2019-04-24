// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.a;

import android.bluetooth.*;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;

// Referenced classes of package com.irobot.a:
//			g, d, b

class g$23 extends BluetoothGattCallback
{

	public void onCharacteristicChanged(BluetoothGatt bluetoothgatt, BluetoothGattCharacteristic bluetoothgattcharacteristic)
	{
		if(bluetoothgattcharacteristic.getUuid().equals(((Object) (a.w.getUuid()))) && (a.a instanceof g.b))
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #28  <Method UUID BluetoothGattCharacteristic.getUuid()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #16  <Field g a>
	//*   4    8:getfield        #32  <Field BluetoothGattCharacteristic g.w>
	//*   5   11:invokevirtual   #28  <Method UUID BluetoothGattCharacteristic.getUuid()>
	//*   6   14:invokevirtual   #38  <Method boolean UUID.equals(Object)>
	//*   7   17:ifeq            53
	//*   8   20:aload_0         
	//*   9   21:getfield        #16  <Field g a>
	//*  10   24:getfield        #41  <Field g$f g.a>
	//*  11   27:instanceof      #43  <Class g$b>
	//*  12   30:ifeq            53
			((g.b)a.a).b(a, (byte)0);
	//   13   33:aload_0         
	//   14   34:getfield        #16  <Field g a>
	//   15   37:getfield        #41  <Field g$f g.a>
	//   16   40:checkcast       #43  <Class g$b>
	//   17   43:aload_0         
	//   18   44:getfield        #16  <Field g a>
	//   19   47:iconst_0        
	//   20   48:invokeinterface #47  <Method void g$b.b(g, byte)>
	//   21   53:return          
	}

	public void onCharacteristicRead(BluetoothGatt bluetoothgatt, BluetoothGattCharacteristic bluetoothgattcharacteristic, int i)
	{
		byte byte0 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(i != 0)
			break MISSING_BLOCK_LABEL_391;
	//    2    3:iload_3         
	//    3    4:ifne            391
		byte abyte0[] = bluetoothgattcharacteristic.getValue();
	//    4    7:aload_2         
	//    5    8:invokevirtual   #53  <Method byte[] BluetoothGattCharacteristic.getValue()>
	//    6   11:astore          5
		if(bluetoothgattcharacteristic.getUuid().equals(((Object) (a.v.getUuid()))))
	//*   7   13:aload_2         
	//*   8   14:invokevirtual   #28  <Method UUID BluetoothGattCharacteristic.getUuid()>
	//*   9   17:aload_0         
	//*  10   18:getfield        #16  <Field g a>
	//*  11   21:getfield        #56  <Field BluetoothGattCharacteristic g.v>
	//*  12   24:invokevirtual   #28  <Method UUID BluetoothGattCharacteristic.getUuid()>
	//*  13   27:invokevirtual   #38  <Method boolean UUID.equals(Object)>
	//*  14   30:ifeq            43
		{
			g.a(a, abyte0);
	//   15   33:aload_0         
	//   16   34:getfield        #16  <Field g a>
	//   17   37:aload           5
	//   18   39:invokestatic    #59  <Method void g.a(g, byte[])>
			return;
	//   19   42:return          
		}
		if(bluetoothgattcharacteristic == a.t)
	//*  20   43:aload_2         
	//*  21   44:aload_0         
	//*  22   45:getfield        #16  <Field g a>
	//*  23   48:getfield        #62  <Field BluetoothGattCharacteristic g.t>
	//*  24   51:if_acmpne       64
		{
			a.c(abyte0);
	//   25   54:aload_0         
	//   26   55:getfield        #16  <Field g a>
	//   27   58:aload           5
	//   28   60:invokevirtual   #66  <Method void g.c(byte[])>
			return;
	//   29   63:return          
		}
		if(((Object) (bluetoothgattcharacteristic)).equals(((Object) (a.w))))
	//*  30   64:aload_2         
	//*  31   65:aload_0         
	//*  32   66:getfield        #16  <Field g a>
	//*  33   69:getfield        #32  <Field BluetoothGattCharacteristic g.w>
	//*  34   72:invokevirtual   #69  <Method boolean Object.equals(Object)>
	//*  35   75:ifeq            124
		{
			if(abyte0 != null)
	//*  36   78:aload           5
	//*  37   80:ifnull          89
				byte0 = abyte0[0];
	//   38   83:aload           5
	//   39   85:iconst_0        
	//   40   86:baload          
	//   41   87:istore          4
			if(a.a instanceof g.b)
	//*  42   89:aload_0         
	//*  43   90:getfield        #16  <Field g a>
	//*  44   93:getfield        #41  <Field g$f g.a>
	//*  45   96:instanceof      #43  <Class g$b>
	//*  46   99:ifeq            438
			{
				((g.b)a.a).b(a, byte0);
	//   47  102:aload_0         
	//   48  103:getfield        #16  <Field g a>
	//   49  106:getfield        #41  <Field g$f g.a>
	//   50  109:checkcast       #43  <Class g$b>
	//   51  112:aload_0         
	//   52  113:getfield        #16  <Field g a>
	//   53  116:iload           4
	//   54  118:invokeinterface #47  <Method void g$b.b(g, byte)>
				return;
	//   55  123:return          
			}
			break MISSING_BLOCK_LABEL_438;
		}
		if(!bluetoothgattcharacteristic.getUuid().equals(((Object) (UUID.fromString("00002A24-0000-1000-8000-00805F9B34FB"))))) goto _L2; else goto _L1
	//   56  124:aload_2         
	//   57  125:invokevirtual   #28  <Method UUID BluetoothGattCharacteristic.getUuid()>
	//   58  128:ldc1            #71  <String "00002A24-0000-1000-8000-00805F9B34FB">
	//   59  130:invokestatic    #75  <Method UUID UUID.fromString(String)>
	//   60  133:invokevirtual   #38  <Method boolean UUID.equals(Object)>
	//   61  136:ifeq            180
_L1:
		String s;
		a.o = bluetoothgattcharacteristic.getStringValue(0);
	//   62  139:aload_0         
	//   63  140:getfield        #16  <Field g a>
	//   64  143:aload_2         
	//   65  144:iconst_0        
	//   66  145:invokevirtual   #79  <Method String BluetoothGattCharacteristic.getStringValue(int)>
	//   67  148:putfield        #83  <Field String g.o>
		bluetoothgattcharacteristic = ((BluetoothGattCharacteristic) (bluetoothgatt.getService(UUID.fromString("0000180A-0000-1000-8000-00805F9B34FB"))));
	//   68  151:aload_1         
	//   69  152:ldc1            #85  <String "0000180A-0000-1000-8000-00805F9B34FB">
	//   70  154:invokestatic    #75  <Method UUID UUID.fromString(String)>
	//   71  157:invokevirtual   #91  <Method BluetoothGattService BluetoothGatt.getService(UUID)>
	//   72  160:astore_2        
		s = "00002A25-0000-1000-8000-00805F9B34FB";
	//   73  161:ldc1            #93  <String "00002A25-0000-1000-8000-00805F9B34FB">
	//   74  163:astore          5
_L4:
		bluetoothgatt.readCharacteristic(((BluetoothGattService) (bluetoothgattcharacteristic)).getCharacteristic(UUID.fromString(s)));
	//   75  165:aload_1         
	//   76  166:aload_2         
	//   77  167:aload           5
	//   78  169:invokestatic    #75  <Method UUID UUID.fromString(String)>
	//   79  172:invokevirtual   #99  <Method BluetoothGattCharacteristic BluetoothGattService.getCharacteristic(UUID)>
	//   80  175:invokevirtual   #103 <Method boolean BluetoothGatt.readCharacteristic(BluetoothGattCharacteristic)>
	//   81  178:pop             
		return;
	//   82  179:return          
_L2:
		if(bluetoothgattcharacteristic.getUuid().equals(((Object) (UUID.fromString("00002A25-0000-1000-8000-00805F9B34FB")))))
	//*  83  180:aload_2         
	//*  84  181:invokevirtual   #28  <Method UUID BluetoothGattCharacteristic.getUuid()>
	//*  85  184:ldc1            #93  <String "00002A25-0000-1000-8000-00805F9B34FB">
	//*  86  186:invokestatic    #75  <Method UUID UUID.fromString(String)>
	//*  87  189:invokevirtual   #38  <Method boolean UUID.equals(Object)>
	//*  88  192:ifeq            224
		{
			a.f = bluetoothgattcharacteristic.getStringValue(0);
	//   89  195:aload_0         
	//   90  196:getfield        #16  <Field g a>
	//   91  199:aload_2         
	//   92  200:iconst_0        
	//   93  201:invokevirtual   #79  <Method String BluetoothGattCharacteristic.getStringValue(int)>
	//   94  204:putfield        #106 <Field String g.f>
			bluetoothgattcharacteristic = ((BluetoothGattCharacteristic) (bluetoothgatt.getService(UUID.fromString("0000180A-0000-1000-8000-00805F9B34FB"))));
	//   95  207:aload_1         
	//   96  208:ldc1            #85  <String "0000180A-0000-1000-8000-00805F9B34FB">
	//   97  210:invokestatic    #75  <Method UUID UUID.fromString(String)>
	//   98  213:invokevirtual   #91  <Method BluetoothGattService BluetoothGatt.getService(UUID)>
	//   99  216:astore_2        
			s = "00002A26-0000-1000-8000-00805F9B34FB";
	//  100  217:ldc1            #108 <String "00002A26-0000-1000-8000-00805F9B34FB">
	//  101  219:astore          5
			continue; /* Loop/switch isn't completed */
	//  102  221:goto            165
		}
		if(bluetoothgattcharacteristic.getUuid().equals(((Object) (UUID.fromString("00002A26-0000-1000-8000-00805F9B34FB")))))
	//* 103  224:aload_2         
	//* 104  225:invokevirtual   #28  <Method UUID BluetoothGattCharacteristic.getUuid()>
	//* 105  228:ldc1            #108 <String "00002A26-0000-1000-8000-00805F9B34FB">
	//* 106  230:invokestatic    #75  <Method UUID UUID.fromString(String)>
	//* 107  233:invokevirtual   #38  <Method boolean UUID.equals(Object)>
	//* 108  236:ifeq            268
		{
			a.p = bluetoothgattcharacteristic.getStringValue(0);
	//  109  239:aload_0         
	//  110  240:getfield        #16  <Field g a>
	//  111  243:aload_2         
	//  112  244:iconst_0        
	//  113  245:invokevirtual   #79  <Method String BluetoothGattCharacteristic.getStringValue(int)>
	//  114  248:putfield        #111 <Field String g.p>
			bluetoothgattcharacteristic = ((BluetoothGattCharacteristic) (bluetoothgatt.getService(UUID.fromString("0000180A-0000-1000-8000-00805F9B34FB"))));
	//  115  251:aload_1         
	//  116  252:ldc1            #85  <String "0000180A-0000-1000-8000-00805F9B34FB">
	//  117  254:invokestatic    #75  <Method UUID UUID.fromString(String)>
	//  118  257:invokevirtual   #91  <Method BluetoothGattService BluetoothGatt.getService(UUID)>
	//  119  260:astore_2        
			s = "00002A27-0000-1000-8000-00805F9B34FB";
	//  120  261:ldc1            #113 <String "00002A27-0000-1000-8000-00805F9B34FB">
	//  121  263:astore          5
			continue; /* Loop/switch isn't completed */
	//  122  265:goto            165
		}
		if(bluetoothgattcharacteristic.getUuid().equals(((Object) (UUID.fromString("00002A27-0000-1000-8000-00805F9B34FB")))))
	//* 123  268:aload_2         
	//* 124  269:invokevirtual   #28  <Method UUID BluetoothGattCharacteristic.getUuid()>
	//* 125  272:ldc1            #113 <String "00002A27-0000-1000-8000-00805F9B34FB">
	//* 126  274:invokestatic    #75  <Method UUID UUID.fromString(String)>
	//* 127  277:invokevirtual   #38  <Method boolean UUID.equals(Object)>
	//* 128  280:ifeq            312
		{
			a.q = bluetoothgattcharacteristic.getStringValue(0);
	//  129  283:aload_0         
	//  130  284:getfield        #16  <Field g a>
	//  131  287:aload_2         
	//  132  288:iconst_0        
	//  133  289:invokevirtual   #79  <Method String BluetoothGattCharacteristic.getStringValue(int)>
	//  134  292:putfield        #116 <Field String g.q>
			bluetoothgattcharacteristic = ((BluetoothGattCharacteristic) (bluetoothgatt.getService(UUID.fromString("0000180A-0000-1000-8000-00805F9B34FB"))));
	//  135  295:aload_1         
	//  136  296:ldc1            #85  <String "0000180A-0000-1000-8000-00805F9B34FB">
	//  137  298:invokestatic    #75  <Method UUID UUID.fromString(String)>
	//  138  301:invokevirtual   #91  <Method BluetoothGattService BluetoothGatt.getService(UUID)>
	//  139  304:astore_2        
			s = "00002A28-0000-1000-8000-00805F9B34FB";
	//  140  305:ldc1            #118 <String "00002A28-0000-1000-8000-00805F9B34FB">
	//  141  307:astore          5
			continue; /* Loop/switch isn't completed */
	//  142  309:goto            165
		}
		if(!bluetoothgattcharacteristic.getUuid().equals(((Object) (UUID.fromString("00002A28-0000-1000-8000-00805F9B34FB")))))
			break; /* Loop/switch isn't completed */
	//  143  312:aload_2         
	//  144  313:invokevirtual   #28  <Method UUID BluetoothGattCharacteristic.getUuid()>
	//  145  316:ldc1            #118 <String "00002A28-0000-1000-8000-00805F9B34FB">
	//  146  318:invokestatic    #75  <Method UUID UUID.fromString(String)>
	//  147  321:invokevirtual   #38  <Method boolean UUID.equals(Object)>
	//  148  324:ifeq            356
		a.r = bluetoothgattcharacteristic.getStringValue(0);
	//  149  327:aload_0         
	//  150  328:getfield        #16  <Field g a>
	//  151  331:aload_2         
	//  152  332:iconst_0        
	//  153  333:invokevirtual   #79  <Method String BluetoothGattCharacteristic.getStringValue(int)>
	//  154  336:putfield        #121 <Field String g.r>
		bluetoothgattcharacteristic = ((BluetoothGattCharacteristic) (bluetoothgatt.getService(UUID.fromString("0000180A-0000-1000-8000-00805F9B34FB"))));
	//  155  339:aload_1         
	//  156  340:ldc1            #85  <String "0000180A-0000-1000-8000-00805F9B34FB">
	//  157  342:invokestatic    #75  <Method UUID UUID.fromString(String)>
	//  158  345:invokevirtual   #91  <Method BluetoothGattService BluetoothGatt.getService(UUID)>
	//  159  348:astore_2        
		s = "00002A29-0000-1000-8000-00805F9B34FB";
	//  160  349:ldc1            #123 <String "00002A29-0000-1000-8000-00805F9B34FB">
	//  161  351:astore          5
		if(true) goto _L4; else goto _L3
	//  162  353:goto            165
_L3:
		if(bluetoothgattcharacteristic.getUuid().equals(((Object) (UUID.fromString("00002A29-0000-1000-8000-00805F9B34FB")))))
	//* 163  356:aload_2         
	//* 164  357:invokevirtual   #28  <Method UUID BluetoothGattCharacteristic.getUuid()>
	//* 165  360:ldc1            #123 <String "00002A29-0000-1000-8000-00805F9B34FB">
	//* 166  362:invokestatic    #75  <Method UUID UUID.fromString(String)>
	//* 167  365:invokevirtual   #38  <Method boolean UUID.equals(Object)>
	//* 168  368:ifeq            438
		{
			a.s = bluetoothgattcharacteristic.getStringValue(0);
	//  169  371:aload_0         
	//  170  372:getfield        #16  <Field g a>
	//  171  375:aload_2         
	//  172  376:iconst_0        
	//  173  377:invokevirtual   #79  <Method String BluetoothGattCharacteristic.getStringValue(int)>
	//  174  380:putfield        #126 <Field String g.s>
			a.m();
	//  175  383:aload_0         
	//  176  384:getfield        #16  <Field g a>
	//  177  387:invokevirtual   #129 <Method void g.m()>
			return;
	//  178  390:return          
		}
		break MISSING_BLOCK_LABEL_438;
		bluetoothgatt = ((BluetoothGatt) (new d(d.a.ALOperationFailedError, String.format(Locale.US, "BLE Status %d", new Object[] {
			Integer.valueOf(i)
		}))));
	//  179  391:new             #131 <Class d>
	//  180  394:dup             
	//  181  395:getstatic       #137 <Field d$a d$a.ALOperationFailedError>
	//  182  398:getstatic       #143 <Field Locale Locale.US>
	//  183  401:ldc1            #145 <String "BLE Status %d">
	//  184  403:iconst_1        
	//  185  404:anewarray       Object[]
	//  186  407:dup             
	//  187  408:iconst_0        
	//  188  409:iload_3         
	//  189  410:invokestatic    #151 <Method Integer Integer.valueOf(int)>
	//  190  413:aastore         
	//  191  414:invokestatic    #157 <Method String String.format(Locale, String, Object[])>
	//  192  417:invokespecial   #160 <Method void d(d$a, String)>
	//  193  420:astore_1        
		a.a.q(a, ((d) (bluetoothgatt)));
	//  194  421:aload_0         
	//  195  422:getfield        #16  <Field g a>
	//  196  425:getfield        #41  <Field g$f g.a>
	//  197  428:aload_0         
	//  198  429:getfield        #16  <Field g a>
	//  199  432:aload_1         
	//  200  433:invokeinterface #165 <Method void g$f.q(g, d)>
	//  201  438:return          
	}

	public void onCharacteristicWrite(BluetoothGatt bluetoothgatt, BluetoothGattCharacteristic bluetoothgattcharacteristic, int i)
	{
		if(i == 0)
	//*   0    0:iload_3         
	//*   1    1:ifne            31
		{
			if(((Object) (bluetoothgattcharacteristic)).equals(((Object) (a.u))))
	//*   2    4:aload_2         
	//*   3    5:aload_0         
	//*   4    6:getfield        #16  <Field g a>
	//*   5    9:getfield        #169 <Field BluetoothGattCharacteristic g.u>
	//*   6   12:invokevirtual   #69  <Method boolean Object.equals(Object)>
	//*   7   15:ifeq            78
			{
				bluetoothgatt.readCharacteristic(a.v);
	//    8   18:aload_1         
	//    9   19:aload_0         
	//   10   20:getfield        #16  <Field g a>
	//   11   23:getfield        #56  <Field BluetoothGattCharacteristic g.v>
	//   12   26:invokevirtual   #103 <Method boolean BluetoothGatt.readCharacteristic(BluetoothGattCharacteristic)>
	//   13   29:pop             
				return;
	//   14   30:return          
			}
		} else
		{
			bluetoothgatt = ((BluetoothGatt) (new d(d.a.ALOperationFailedError, String.format(Locale.US, "BLE Status %d", new Object[] {
				Integer.valueOf(i)
			}))));
	//   15   31:new             #131 <Class d>
	//   16   34:dup             
	//   17   35:getstatic       #137 <Field d$a d$a.ALOperationFailedError>
	//   18   38:getstatic       #143 <Field Locale Locale.US>
	//   19   41:ldc1            #145 <String "BLE Status %d">
	//   20   43:iconst_1        
	//   21   44:anewarray       Object[]
	//   22   47:dup             
	//   23   48:iconst_0        
	//   24   49:iload_3         
	//   25   50:invokestatic    #151 <Method Integer Integer.valueOf(int)>
	//   26   53:aastore         
	//   27   54:invokestatic    #157 <Method String String.format(Locale, String, Object[])>
	//   28   57:invokespecial   #160 <Method void d(d$a, String)>
	//   29   60:astore_1        
			a.a.q(a, ((d) (bluetoothgatt)));
	//   30   61:aload_0         
	//   31   62:getfield        #16  <Field g a>
	//   32   65:getfield        #41  <Field g$f g.a>
	//   33   68:aload_0         
	//   34   69:getfield        #16  <Field g a>
	//   35   72:aload_1         
	//   36   73:invokeinterface #165 <Method void g$f.q(g, d)>
		}
	//   37   78:return          
	}

	public void onConnectionStateChange(BluetoothGatt bluetoothgatt, int i, int j)
	{
		Object obj;
		if(j == 2)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:icmpne          95
		{
			obj = ((Object) (new StringBuilder()));
	//    3    5:new             #173 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #174 <Method void StringBuilder()>
	//    6   12:astore          4
			((StringBuilder) (obj)).append("GATT CONNECTED for ");
	//    7   14:aload           4
	//    8   16:ldc1            #176 <String "GATT CONNECTED for ">
	//    9   18:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
			((StringBuilder) (obj)).append(a.b());
	//   11   22:aload           4
	//   12   24:aload_0         
	//   13   25:getfield        #16  <Field g a>
	//   14   28:invokevirtual   #183 <Method String g.b()>
	//   15   31:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
			((StringBuilder) (obj)).append(" w/status ");
	//   17   35:aload           4
	//   18   37:ldc1            #185 <String " w/status ">
	//   19   39:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   20   42:pop             
			((StringBuilder) (obj)).append(i);
	//   21   43:aload           4
	//   22   45:iload_2         
	//   23   46:invokevirtual   #188 <Method StringBuilder StringBuilder.append(int)>
	//   24   49:pop             
			Log.i("GATT DEBUG", ((StringBuilder) (obj)).toString());
	//   25   50:ldc1            #190 <String "GATT DEBUG">
	//   26   52:aload           4
	//   27   54:invokevirtual   #193 <Method String StringBuilder.toString()>
	//   28   57:invokestatic    #199 <Method int Log.i(String, String)>
	//   29   60:pop             
			Handler handler = new Handler(Looper.getMainLooper());
	//   30   61:new             #201 <Class Handler>
	//   31   64:dup             
	//   32   65:invokestatic    #207 <Method Looper Looper.getMainLooper()>
	//   33   68:invokespecial   #210 <Method void Handler(Looper)>
	//   34   71:astore          5
			obj = ((Object) (new Runnable(bluetoothgatt) {

				public void run()
				{
					a.discoverServices();
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field BluetoothGatt a>
				//    2    4:invokevirtual   #32  <Method boolean BluetoothGatt.discoverServices()>
				//    3    7:pop             
				//    4    8:return          
				}

				final BluetoothGatt a;
				final g._cls23 b;

			
			{
				b = g._cls23.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field g$23 b>
				a = bluetoothgatt;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field BluetoothGatt a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
));
	//   35   73:new             #8   <Class g$23$1>
	//   36   76:dup             
	//   37   77:aload_0         
	//   38   78:aload_1         
	//   39   79:invokespecial   #213 <Method void g$23$1(g$23, BluetoothGatt)>
	//   40   82:astore          4
			bluetoothgatt = ((BluetoothGatt) (handler));
	//   41   84:aload           5
	//   42   86:astore_1        
		} else
	//*  43   87:aload_1         
	//*  44   88:aload           4
	//*  45   90:invokevirtual   #217 <Method boolean Handler.post(Runnable)>
	//*  46   93:pop             
	//*  47   94:return          
		if(j == 0)
	//*  48   95:iload_3         
	//*  49   96:ifne            310
		{
			obj = ((Object) (new StringBuilder()));
	//   50   99:new             #173 <Class StringBuilder>
	//   51  102:dup             
	//   52  103:invokespecial   #174 <Method void StringBuilder()>
	//   53  106:astore          4
			((StringBuilder) (obj)).append("GATT DISCONNECTED for ");
	//   54  108:aload           4
	//   55  110:ldc1            #219 <String "GATT DISCONNECTED for ">
	//   56  112:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   57  115:pop             
			((StringBuilder) (obj)).append(a.b());
	//   58  116:aload           4
	//   59  118:aload_0         
	//   60  119:getfield        #16  <Field g a>
	//   61  122:invokevirtual   #183 <Method String g.b()>
	//   62  125:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   63  128:pop             
			((StringBuilder) (obj)).append(" w/status ");
	//   64  129:aload           4
	//   65  131:ldc1            #185 <String " w/status ">
	//   66  133:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   67  136:pop             
			((StringBuilder) (obj)).append(i);
	//   68  137:aload           4
	//   69  139:iload_2         
	//   70  140:invokevirtual   #188 <Method StringBuilder StringBuilder.append(int)>
	//   71  143:pop             
			Log.i("GATT DEBUG", ((StringBuilder) (obj)).toString());
	//   72  144:ldc1            #190 <String "GATT DEBUG">
	//   73  146:aload           4
	//   74  148:invokevirtual   #193 <Method String StringBuilder.toString()>
	//   75  151:invokestatic    #199 <Method int Log.i(String, String)>
	//   76  154:pop             
			if(i == 0)
	//*  77  155:iload_2         
	//*  78  156:ifne            179
			{
				a.a.p(a, ((d) (null)));
	//   79  159:aload_0         
	//   80  160:getfield        #16  <Field g a>
	//   81  163:getfield        #41  <Field g$f g.a>
	//   82  166:aload_0         
	//   83  167:getfield        #16  <Field g a>
	//   84  170:aconst_null     
	//   85  171:invokeinterface #221 <Method void g$f.p(g, d)>
			} else
	//*  86  176:goto            277
			{
				if(i != 8)
	//*  87  179:iload_2         
	//*  88  180:bipush          8
	//*  89  182:icmpeq          208
				{
					if(i != 133)
	//*  90  185:iload_2         
	//*  91  186:sipush          133
	//*  92  189:icmpeq          200
						obj = ((Object) (d.a.ALOperationFailedError));
	//   93  192:getstatic       #137 <Field d$a d$a.ALOperationFailedError>
	//   94  195:astore          4
					else
	//*  95  197:goto            229
						obj = ((Object) (d.a.ALBluetoothGattError));
	//   96  200:getstatic       #224 <Field d$a d$a.ALBluetoothGattError>
	//   97  203:astore          4
				} else
	//*  98  205:goto            229
				{
					obj = ((Object) (d.a.ALBluetoothGattAuthorizationError));
	//   99  208:getstatic       #227 <Field d$a d$a.ALBluetoothGattAuthorizationError>
	//  100  211:astore          4
					a.a(((g.a) (null)));
	//  101  213:aload_0         
	//  102  214:getfield        #16  <Field g a>
	//  103  217:aconst_null     
	//  104  218:invokevirtual   #230 <Method void g.a(g$a)>
					a.y = null;
	//  105  221:aload_0         
	//  106  222:getfield        #16  <Field g a>
	//  107  225:aconst_null     
	//  108  226:putfield        #234 <Field j g.y>
				}
				obj = ((Object) (new d(((d.a) (obj)), String.format(Locale.US, "BLE Status %d", new Object[] {
					Integer.valueOf(i)
				}))));
	//  109  229:new             #131 <Class d>
	//  110  232:dup             
	//  111  233:aload           4
	//  112  235:getstatic       #143 <Field Locale Locale.US>
	//  113  238:ldc1            #145 <String "BLE Status %d">
	//  114  240:iconst_1        
	//  115  241:anewarray       Object[]
	//  116  244:dup             
	//  117  245:iconst_0        
	//  118  246:iload_2         
	//  119  247:invokestatic    #151 <Method Integer Integer.valueOf(int)>
	//  120  250:aastore         
	//  121  251:invokestatic    #157 <Method String String.format(Locale, String, Object[])>
	//  122  254:invokespecial   #160 <Method void d(d$a, String)>
	//  123  257:astore          4
				a.a.q(a, ((d) (obj)));
	//  124  259:aload_0         
	//  125  260:getfield        #16  <Field g a>
	//  126  263:getfield        #41  <Field g$f g.a>
	//  127  266:aload_0         
	//  128  267:getfield        #16  <Field g a>
	//  129  270:aload           4
	//  130  272:invokeinterface #165 <Method void g$f.q(g, d)>
			}
			obj = ((Object) (new Handler(Looper.getMainLooper())));
	//  131  277:new             #201 <Class Handler>
	//  132  280:dup             
	//  133  281:invokestatic    #207 <Method Looper Looper.getMainLooper()>
	//  134  284:invokespecial   #210 <Method void Handler(Looper)>
	//  135  287:astore          4
			Runnable runnable = new Runnable(bluetoothgatt) {

				public void run()
				{
					a.close();
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field BluetoothGatt a>
				//    2    4:invokevirtual   #31  <Method void BluetoothGatt.close()>
					synchronized(g.a(b.a))
				//*   3    7:aload_0         
				//*   4    8:getfield        #19  <Field g$23 b>
				//*   5   11:getfield        #34  <Field g g$23.a>
				//*   6   14:invokestatic    #39  <Method Object g.a(g)>
				//*   7   17:astore_1        
				//*   8   18:aload_1         
				//*   9   19:monitorenter    
					{
						if(b.a.c == a)
				//*  10   20:aload_0         
				//*  11   21:getfield        #19  <Field g$23 b>
				//*  12   24:getfield        #34  <Field g g$23.a>
				//*  13   27:getfield        #42  <Field BluetoothGatt g.c>
				//*  14   30:aload_0         
				//*  15   31:getfield        #21  <Field BluetoothGatt a>
				//*  16   34:if_acmpne       48
							b.a.c = null;
				//   17   37:aload_0         
				//   18   38:getfield        #19  <Field g$23 b>
				//   19   41:getfield        #34  <Field g g$23.a>
				//   20   44:aconst_null     
				//   21   45:putfield        #42  <Field BluetoothGatt g.c>
					}
				//   22   48:aload_1         
				//   23   49:monitorexit     
					return;
				//   24   50:return          
					exception;
				//   25   51:astore_2        
					obj1;
				//   26   52:aload_1         
					JVM INSTR monitorexit ;
				//   27   53:monitorexit     
					throw exception;
				//   28   54:aload_2         
				//   29   55:athrow          
				}

				final BluetoothGatt a;
				final g._cls23 b;

			
			{
				b = g._cls23.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field g$23 b>
				a = bluetoothgatt;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field BluetoothGatt a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
;
	//  136  289:new             #10  <Class g$23$2>
	//  137  292:dup             
	//  138  293:aload_0         
	//  139  294:aload_1         
	//  140  295:invokespecial   #235 <Method void g$23$2(g$23, BluetoothGatt)>
	//  141  298:astore          5
			bluetoothgatt = ((BluetoothGatt) (obj));
	//  142  300:aload           4
	//  143  302:astore_1        
			obj = ((Object) (runnable));
	//  144  303:aload           5
	//  145  305:astore          4
		} else
	//* 146  307:goto            87
		{
			return;
	//  147  310:return          
		}
		((Handler) (bluetoothgatt)).post(((Runnable) (obj)));
	}

	public void onDescriptorWrite(BluetoothGatt bluetoothgatt, BluetoothGattDescriptor bluetoothgattdescriptor, int i)
	{
		bluetoothgatt.readCharacteristic(bluetoothgatt.getService(UUID.fromString("0000180A-0000-1000-8000-00805F9B34FB")).getCharacteristic(UUID.fromString("00002A24-0000-1000-8000-00805F9B34FB")));
	//    0    0:aload_1         
	//    1    1:aload_1         
	//    2    2:ldc1            #85  <String "0000180A-0000-1000-8000-00805F9B34FB">
	//    3    4:invokestatic    #75  <Method UUID UUID.fromString(String)>
	//    4    7:invokevirtual   #91  <Method BluetoothGattService BluetoothGatt.getService(UUID)>
	//    5   10:ldc1            #71  <String "00002A24-0000-1000-8000-00805F9B34FB">
	//    6   12:invokestatic    #75  <Method UUID UUID.fromString(String)>
	//    7   15:invokevirtual   #99  <Method BluetoothGattCharacteristic BluetoothGattService.getCharacteristic(UUID)>
	//    8   18:invokevirtual   #103 <Method boolean BluetoothGatt.readCharacteristic(BluetoothGattCharacteristic)>
	//    9   21:pop             
	//   10   22:return          
	}

	public void onMtuChanged(BluetoothGatt bluetoothgatt, int i, int j)
	{
	//    0    0:return          
	}

	public void onReadRemoteRssi(BluetoothGatt bluetoothgatt, int i, int j)
	{
		if(j == 0)
	//*   0    0:iload_3         
	//*   1    1:ifne            46
		{
			a.m = i;
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field g a>
	//    4    8:iload_2         
	//    5    9:putfield        #242 <Field int g.m>
			if(a.a instanceof g.b)
	//*   6   12:aload_0         
	//*   7   13:getfield        #16  <Field g a>
	//*   8   16:getfield        #41  <Field g$f g.a>
	//*   9   19:instanceof      #43  <Class g$b>
	//*  10   22:ifeq            46
				((g.b)a.a).a(a, (byte)i);
	//   11   25:aload_0         
	//   12   26:getfield        #16  <Field g a>
	//   13   29:getfield        #41  <Field g$f g.a>
	//   14   32:checkcast       #43  <Class g$b>
	//   15   35:aload_0         
	//   16   36:getfield        #16  <Field g a>
	//   17   39:iload_2         
	//   18   40:int2byte        
	//   19   41:invokeinterface #244 <Method void g$b.a(g, byte)>
		}
	//   20   46:return          
	}

	public void onReliableWriteCompleted(BluetoothGatt bluetoothgatt, int i)
	{
		g g1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field g a>
	//    2    4:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #173 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #174 <Method void StringBuilder()>
	//    6   12:astore          4
		stringbuilder.append("WRITE onReliableWriteCompleted status = ");
	//    7   14:aload           4
	//    8   16:ldc1            #248 <String "WRITE onReliableWriteCompleted status = ">
	//    9   18:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
		stringbuilder.append(i);
	//   11   22:aload           4
	//   12   24:iload_2         
	//   13   25:invokevirtual   #188 <Method StringBuilder StringBuilder.append(int)>
	//   14   28:pop             
		g1.d(stringbuilder.toString());
	//   15   29:aload_3         
	//   16   30:aload           4
	//   17   32:invokevirtual   #193 <Method String StringBuilder.toString()>
	//   18   35:invokevirtual   #252 <Method void g.d(String)>
		if(i == 0)
	//*  19   38:iload_2         
	//*  20   39:ifne            55
		{
			bluetoothgatt.readCharacteristic(a.v);
	//   21   42:aload_1         
	//   22   43:aload_0         
	//   23   44:getfield        #16  <Field g a>
	//   24   47:getfield        #56  <Field BluetoothGattCharacteristic g.v>
	//   25   50:invokevirtual   #103 <Method boolean BluetoothGatt.readCharacteristic(BluetoothGattCharacteristic)>
	//   26   53:pop             
			return;
	//   27   54:return          
		} else
		{
			bluetoothgatt = ((BluetoothGatt) (new d(d.a.ALOperationFailedError, String.format(Locale.US, "BLE Status %d", new Object[] {
				Integer.valueOf(i)
			}))));
	//   28   55:new             #131 <Class d>
	//   29   58:dup             
	//   30   59:getstatic       #137 <Field d$a d$a.ALOperationFailedError>
	//   31   62:getstatic       #143 <Field Locale Locale.US>
	//   32   65:ldc1            #145 <String "BLE Status %d">
	//   33   67:iconst_1        
	//   34   68:anewarray       Object[]
	//   35   71:dup             
	//   36   72:iconst_0        
	//   37   73:iload_2         
	//   38   74:invokestatic    #151 <Method Integer Integer.valueOf(int)>
	//   39   77:aastore         
	//   40   78:invokestatic    #157 <Method String String.format(Locale, String, Object[])>
	//   41   81:invokespecial   #160 <Method void d(d$a, String)>
	//   42   84:astore_1        
			a.a.q(a, ((d) (bluetoothgatt)));
	//   43   85:aload_0         
	//   44   86:getfield        #16  <Field g a>
	//   45   89:getfield        #41  <Field g$f g.a>
	//   46   92:aload_0         
	//   47   93:getfield        #16  <Field g a>
	//   48   96:aload_1         
	//   49   97:invokeinterface #165 <Method void g$f.q(g, d)>
			return;
	//   50  102:return          
		}
	}

	public void onServicesDiscovered(BluetoothGatt bluetoothgatt, int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #173 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #174 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("In onServicesDiscovered for ");
	//    4    8:aload_3         
	//    5    9:ldc1            #255 <String "In onServicesDiscovered for ">
	//    6   11:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(a.b());
	//    8   15:aload_3         
	//    9   16:aload_0         
	//   10   17:getfield        #16  <Field g a>
	//   11   20:invokevirtual   #183 <Method String g.b()>
	//   12   23:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		Log.i("ALRobot", stringbuilder.toString());
	//   14   27:ldc2            #257 <String "ALRobot">
	//   15   30:aload_3         
	//   16   31:invokevirtual   #193 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #199 <Method int Log.i(String, String)>
	//   18   37:pop             
		if(i == 0)
	//*  19   38:iload_2         
	//*  20   39:ifne            232
		{
			Object obj = ((Object) (bluetoothgatt.getService(UUID.fromString("0bd51777-e7cb-469b-8e4d-2742f1ba77cc"))));
	//   21   42:aload_1         
	//   22   43:ldc2            #259 <String "0bd51777-e7cb-469b-8e4d-2742f1ba77cc">
	//   23   46:invokestatic    #75  <Method UUID UUID.fromString(String)>
	//   24   49:invokevirtual   #91  <Method BluetoothGattService BluetoothGatt.getService(UUID)>
	//   25   52:astore_3        
			if(obj == null)
	//*  26   53:aload_3         
	//*  27   54:ifnonnull       97
			{
				bluetoothgatt = ((BluetoothGatt) (new StringBuilder()));
	//   28   57:new             #173 <Class StringBuilder>
	//   29   60:dup             
	//   30   61:invokespecial   #174 <Method void StringBuilder()>
	//   31   64:astore_1        
				((StringBuilder) (bluetoothgatt)).append("Failed to get service for ");
	//   32   65:aload_1         
	//   33   66:ldc2            #261 <String "Failed to get service for ">
	//   34   69:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   35   72:pop             
				((StringBuilder) (bluetoothgatt)).append(a.b());
	//   36   73:aload_1         
	//   37   74:aload_0         
	//   38   75:getfield        #16  <Field g a>
	//   39   78:invokevirtual   #183 <Method String g.b()>
	//   40   81:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   41   84:pop             
				Log.e("ALRobot", ((StringBuilder) (bluetoothgatt)).toString());
	//   42   85:ldc2            #257 <String "ALRobot">
	//   43   88:aload_1         
	//   44   89:invokevirtual   #193 <Method String StringBuilder.toString()>
	//   45   92:invokestatic    #264 <Method int Log.e(String, String)>
	//   46   95:pop             
				return;
	//   47   96:return          
			} else
			{
				a.t = ((BluetoothGattService) (obj)).getCharacteristic(UUID.fromString("e7add780-b042-4876-aae1-112855353cc1"));
	//   48   97:aload_0         
	//   49   98:getfield        #16  <Field g a>
	//   50  101:aload_3         
	//   51  102:ldc2            #266 <String "e7add780-b042-4876-aae1-112855353cc1">
	//   52  105:invokestatic    #75  <Method UUID UUID.fromString(String)>
	//   53  108:invokevirtual   #99  <Method BluetoothGattCharacteristic BluetoothGattService.getCharacteristic(UUID)>
	//   54  111:putfield        #62  <Field BluetoothGattCharacteristic g.t>
				a.v = ((BluetoothGattService) (obj)).getCharacteristic(UUID.fromString("e7add780-b042-4876-aae1-112855353cc3"));
	//   55  114:aload_0         
	//   56  115:getfield        #16  <Field g a>
	//   57  118:aload_3         
	//   58  119:ldc2            #268 <String "e7add780-b042-4876-aae1-112855353cc3">
	//   59  122:invokestatic    #75  <Method UUID UUID.fromString(String)>
	//   60  125:invokevirtual   #99  <Method BluetoothGattCharacteristic BluetoothGattService.getCharacteristic(UUID)>
	//   61  128:putfield        #56  <Field BluetoothGattCharacteristic g.v>
				a.u = ((BluetoothGattService) (obj)).getCharacteristic(UUID.fromString("e7add780-b042-4876-aae1-112855353cc2"));
	//   62  131:aload_0         
	//   63  132:getfield        #16  <Field g a>
	//   64  135:aload_3         
	//   65  136:ldc2            #270 <String "e7add780-b042-4876-aae1-112855353cc2">
	//   66  139:invokestatic    #75  <Method UUID UUID.fromString(String)>
	//   67  142:invokevirtual   #99  <Method BluetoothGattCharacteristic BluetoothGattService.getCharacteristic(UUID)>
	//   68  145:putfield        #169 <Field BluetoothGattCharacteristic g.u>
				a.w = ((BluetoothGattService) (obj)).getCharacteristic(UUID.fromString("e7add780-b042-4876-aae1-112855353cc4"));
	//   69  148:aload_0         
	//   70  149:getfield        #16  <Field g a>
	//   71  152:aload_3         
	//   72  153:ldc2            #272 <String "e7add780-b042-4876-aae1-112855353cc4">
	//   73  156:invokestatic    #75  <Method UUID UUID.fromString(String)>
	//   74  159:invokevirtual   #99  <Method BluetoothGattCharacteristic BluetoothGattService.getCharacteristic(UUID)>
	//   75  162:putfield        #32  <Field BluetoothGattCharacteristic g.w>
				a.u.setWriteType(2);
	//   76  165:aload_0         
	//   77  166:getfield        #16  <Field g a>
	//   78  169:getfield        #169 <Field BluetoothGattCharacteristic g.u>
	//   79  172:iconst_2        
	//   80  173:invokevirtual   #276 <Method void BluetoothGattCharacteristic.setWriteType(int)>
				a.t.setWriteType(1);
	//   81  176:aload_0         
	//   82  177:getfield        #16  <Field g a>
	//   83  180:getfield        #62  <Field BluetoothGattCharacteristic g.t>
	//   84  183:iconst_1        
	//   85  184:invokevirtual   #276 <Method void BluetoothGattCharacteristic.setWriteType(int)>
				bluetoothgatt.setCharacteristicNotification(a.w, true);
	//   86  187:aload_1         
	//   87  188:aload_0         
	//   88  189:getfield        #16  <Field g a>
	//   89  192:getfield        #32  <Field BluetoothGattCharacteristic g.w>
	//   90  195:iconst_1        
	//   91  196:invokevirtual   #280 <Method boolean BluetoothGatt.setCharacteristicNotification(BluetoothGattCharacteristic, boolean)>
	//   92  199:pop             
				obj = ((Object) (a.w.getDescriptor(UUID.fromString(b.a))));
	//   93  200:aload_0         
	//   94  201:getfield        #16  <Field g a>
	//   95  204:getfield        #32  <Field BluetoothGattCharacteristic g.w>
	//   96  207:getstatic       #284 <Field String b.a>
	//   97  210:invokestatic    #75  <Method UUID UUID.fromString(String)>
	//   98  213:invokevirtual   #288 <Method BluetoothGattDescriptor BluetoothGattCharacteristic.getDescriptor(UUID)>
	//   99  216:astore_3        
				((BluetoothGattDescriptor) (obj)).setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
	//  100  217:aload_3         
	//  101  218:getstatic       #294 <Field byte[] BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE>
	//  102  221:invokevirtual   #298 <Method boolean BluetoothGattDescriptor.setValue(byte[])>
	//  103  224:pop             
				bluetoothgatt.writeDescriptor(((BluetoothGattDescriptor) (obj)));
	//  104  225:aload_1         
	//  105  226:aload_3         
	//  106  227:invokevirtual   #302 <Method boolean BluetoothGatt.writeDescriptor(BluetoothGattDescriptor)>
	//  107  230:pop             
				return;
	//  108  231:return          
			}
		} else
		{
			bluetoothgatt = ((BluetoothGatt) (new StringBuilder()));
	//  109  232:new             #173 <Class StringBuilder>
	//  110  235:dup             
	//  111  236:invokespecial   #174 <Method void StringBuilder()>
	//  112  239:astore_1        
			((StringBuilder) (bluetoothgatt)).append("Failed to discover services for ");
	//  113  240:aload_1         
	//  114  241:ldc2            #304 <String "Failed to discover services for ">
	//  115  244:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//  116  247:pop             
			((StringBuilder) (bluetoothgatt)).append(a.b());
	//  117  248:aload_1         
	//  118  249:aload_0         
	//  119  250:getfield        #16  <Field g a>
	//  120  253:invokevirtual   #183 <Method String g.b()>
	//  121  256:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//  122  259:pop             
			Log.e("ALRobot", ((StringBuilder) (bluetoothgatt)).toString());
	//  123  260:ldc2            #257 <String "ALRobot">
	//  124  263:aload_1         
	//  125  264:invokevirtual   #193 <Method String StringBuilder.toString()>
	//  126  267:invokestatic    #264 <Method int Log.e(String, String)>
	//  127  270:pop             
			return;
	//  128  271:return          
		}
	}

	final g a;

	g$23(g g1)
	{
		a = g1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field g a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void BluetoothGattCallback()>
	//    5    9:return          
	}
}
