// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.sensor.handler.hrm;

import android.hardware.*;
import android.os.Bundle;
import com.samsung.android.sdk.health.sensor.handler.PrivilegeSensorProfileHandlerListener;
import com.sec.android.service.health.util.LOG;

// Referenced classes of package com.sec.android.service.health.sensor.handler.hrm:
//			HeartRateMonitorHandler

class HeartRateMonitorHandler$1
	implements SensorEventListener
{

	public void onAccuracyChanged(Sensor sensor, int i)
	{
	//    0    0:return          
	}

	public void onSensorChanged(SensorEvent sensorevent)
	{
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:getfield        #28  <Field Sensor SensorEvent.sensor>
	//*   4    8:ifnonnull       12
_L2:
		return;
	//    5   11:return          
		if(sensorevent == null || sensorevent.sensor == null || sensorevent.sensor.getType() != 0x1001a || !"HRM Sensor".equals(((Object) (sensorevent.sensor.getName())))) goto _L2; else goto _L1
	//    6   12:aload_1         
	//    7   13:getfield        #28  <Field Sensor SensorEvent.sensor>
	//    8   16:invokevirtual   #34  <Method int Sensor.getType()>
	//    9   19:ldc1            #35  <Int 0x1001a>
	//   10   21:icmpne          11
	//   11   24:ldc1            #37  <String "HRM Sensor">
	//   12   26:aload_1         
	//   13   27:getfield        #28  <Field Sensor SensorEvent.sensor>
	//   14   30:invokevirtual   #41  <Method String Sensor.getName()>
	//   15   33:invokevirtual   #47  <Method boolean String.equals(Object)>
	//   16   36:iconst_1        
	//   17   37:icmpne          11
_L1:
		int i;
		LOG.d(HeartRateMonitorHandler.access$000(), (new StringBuilder()).append("HeartRateMonitor onSensorChanged : event.accuracy = ").append(sensorevent.accuracy).toString());
	//   18   40:invokestatic    #51  <Method Class HeartRateMonitorHandler.access$000()>
	//   19   43:new             #53  <Class StringBuilder>
	//   20   46:dup             
	//   21   47:invokespecial   #54  <Method void StringBuilder()>
	//   22   50:ldc1            #56  <String "HeartRateMonitor onSensorChanged : event.accuracy = ">
	//   23   52:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   24   55:aload_1         
	//   25   56:getfield        #64  <Field int SensorEvent.accuracy>
	//   26   59:invokevirtual   #67  <Method StringBuilder StringBuilder.append(int)>
	//   27   62:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   28   65:invokestatic    #76  <Method void LOG.d(Class, String)>
		HeartRateMonitorHandler.access$102(HeartRateMonitorHandler.this, (int)sensorevent.values[0]);
	//   29   68:aload_0         
	//   30   69:getfield        #14  <Field HeartRateMonitorHandler this$0>
	//   31   72:aload_1         
	//   32   73:getfield        #80  <Field float[] SensorEvent.values>
	//   33   76:iconst_0        
	//   34   77:faload          
	//   35   78:f2i             
	//   36   79:invokestatic    #84  <Method int HeartRateMonitorHandler.access$102(HeartRateMonitorHandler, int)>
	//   37   82:pop             
		HeartRateMonitorHandler.access$202(HeartRateMonitorHandler.this, (long)sensorevent.values[1]);
	//   38   83:aload_0         
	//   39   84:getfield        #14  <Field HeartRateMonitorHandler this$0>
	//   40   87:aload_1         
	//   41   88:getfield        #80  <Field float[] SensorEvent.values>
	//   42   91:iconst_1        
	//   43   92:faload          
	//   44   93:f2l             
	//   45   94:invokestatic    #88  <Method long HeartRateMonitorHandler.access$202(HeartRateMonitorHandler, long)>
	//   46   97:pop2            
		HeartRateMonitorHandler.access$302(HeartRateMonitorHandler.this, sensorevent.values[2]);
	//   47   98:aload_0         
	//   48   99:getfield        #14  <Field HeartRateMonitorHandler this$0>
	//   49  102:aload_1         
	//   50  103:getfield        #80  <Field float[] SensorEvent.values>
	//   51  106:iconst_2        
	//   52  107:faload          
	//   53  108:invokestatic    #92  <Method float HeartRateMonitorHandler.access$302(HeartRateMonitorHandler, float)>
	//   54  111:pop             
		i = 0;
	//   55  112:iconst_0        
	//   56  113:istore_2        
		HeartRateMonitorHandler.access$100(HeartRateMonitorHandler.this);
	//   57  114:aload_0         
	//   58  115:getfield        #14  <Field HeartRateMonitorHandler this$0>
	//   59  118:invokestatic    #96  <Method int HeartRateMonitorHandler.access$100(HeartRateMonitorHandler)>
		JVM INSTR tableswitch -4 -1: default 152
	//	               -4 364
	//	               -3 357
	//	               -2 350
	//	               -1 343;
	//   60  121:tableswitch     -4 -1: default 152
	//	               -4 364
	//	               -3 357
	//	               -2 350
	//	               -1 343
		   goto _L3 _L4 _L5 _L6 _L7
_L4:
		break MISSING_BLOCK_LABEL_364;
_L3:
		break; /* Loop/switch isn't completed */
_L7:
		break; /* Loop/switch isn't completed */
_L9:
		if(mProfileHandlerListener != null && 10000 <= i && i <= 10003)
	//*  61  152:aload_0         
	//*  62  153:getfield        #14  <Field HeartRateMonitorHandler this$0>
	//*  63  156:getfield        #100 <Field PrivilegeSensorProfileHandlerListener HeartRateMonitorHandler.mProfileHandlerListener>
	//*  64  159:ifnull          201
	//*  65  162:sipush          10000
	//*  66  165:iload_2         
	//*  67  166:icmpgt          201
	//*  68  169:iload_2         
	//*  69  170:sipush          10003
	//*  70  173:icmpgt          201
			LOG.d(HeartRateMonitorHandler.access$000(), (new StringBuilder()).append("HRMListener => state : ").append(i).toString());
	//   71  176:invokestatic    #51  <Method Class HeartRateMonitorHandler.access$000()>
	//   72  179:new             #53  <Class StringBuilder>
	//   73  182:dup             
	//   74  183:invokespecial   #54  <Method void StringBuilder()>
	//   75  186:ldc1            #102 <String "HRMListener => state : ">
	//   76  188:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   77  191:iload_2         
	//   78  192:invokevirtual   #67  <Method StringBuilder StringBuilder.append(int)>
	//   79  195:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   80  198:invokestatic    #76  <Method void LOG.d(Class, String)>
		LOG.d(HeartRateMonitorHandler.access$000(), (new StringBuilder()).append("HRMListener => heartrate = ").append(HeartRateMonitorHandler.access$100(HeartRateMonitorHandler.this)).append(" interval = ").append(HeartRateMonitorHandler.access$200(HeartRateMonitorHandler.this)).append(" SNR = ").append(HeartRateMonitorHandler.access$300(HeartRateMonitorHandler.this)).toString());
	//   81  201:invokestatic    #51  <Method Class HeartRateMonitorHandler.access$000()>
	//   82  204:new             #53  <Class StringBuilder>
	//   83  207:dup             
	//   84  208:invokespecial   #54  <Method void StringBuilder()>
	//   85  211:ldc1            #104 <String "HRMListener => heartrate = ">
	//   86  213:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   87  216:aload_0         
	//   88  217:getfield        #14  <Field HeartRateMonitorHandler this$0>
	//   89  220:invokestatic    #96  <Method int HeartRateMonitorHandler.access$100(HeartRateMonitorHandler)>
	//   90  223:invokevirtual   #67  <Method StringBuilder StringBuilder.append(int)>
	//   91  226:ldc1            #106 <String " interval = ">
	//   92  228:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   93  231:aload_0         
	//   94  232:getfield        #14  <Field HeartRateMonitorHandler this$0>
	//   95  235:invokestatic    #110 <Method long HeartRateMonitorHandler.access$200(HeartRateMonitorHandler)>
	//   96  238:invokevirtual   #113 <Method StringBuilder StringBuilder.append(long)>
	//   97  241:ldc1            #115 <String " SNR = ">
	//   98  243:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   99  246:aload_0         
	//  100  247:getfield        #14  <Field HeartRateMonitorHandler this$0>
	//  101  250:invokestatic    #119 <Method float HeartRateMonitorHandler.access$300(HeartRateMonitorHandler)>
	//  102  253:invokevirtual   #122 <Method StringBuilder StringBuilder.append(float)>
	//  103  256:invokevirtual   #70  <Method String StringBuilder.toString()>
	//  104  259:invokestatic    #76  <Method void LOG.d(Class, String)>
		if(mProfileHandlerListener != null)
	//* 105  262:aload_0         
	//* 106  263:getfield        #14  <Field HeartRateMonitorHandler this$0>
	//* 107  266:getfield        #100 <Field PrivilegeSensorProfileHandlerListener HeartRateMonitorHandler.mProfileHandlerListener>
	//* 108  269:ifnull          11
		{
			sensorevent = ((SensorEvent) (new Bundle()));
	//  109  272:new             #124 <Class Bundle>
	//  110  275:dup             
	//  111  276:invokespecial   #125 <Method void Bundle()>
	//  112  279:astore_1        
			((Bundle) (sensorevent)).putLong("time_stamp", System.currentTimeMillis());
	//  113  280:aload_1         
	//  114  281:ldc1            #127 <String "time_stamp">
	//  115  283:invokestatic    #133 <Method long System.currentTimeMillis()>
	//  116  286:invokevirtual   #137 <Method void Bundle.putLong(String, long)>
			((Bundle) (sensorevent)).putInt("heart_rate", HeartRateMonitorHandler.access$100(HeartRateMonitorHandler.this));
	//  117  289:aload_1         
	//  118  290:ldc1            #139 <String "heart_rate">
	//  119  292:aload_0         
	//  120  293:getfield        #14  <Field HeartRateMonitorHandler this$0>
	//  121  296:invokestatic    #96  <Method int HeartRateMonitorHandler.access$100(HeartRateMonitorHandler)>
	//  122  299:invokevirtual   #143 <Method void Bundle.putInt(String, int)>
			((Bundle) (sensorevent)).putLong("heart_rate_interval", HeartRateMonitorHandler.access$200(HeartRateMonitorHandler.this));
	//  123  302:aload_1         
	//  124  303:ldc1            #145 <String "heart_rate_interval">
	//  125  305:aload_0         
	//  126  306:getfield        #14  <Field HeartRateMonitorHandler this$0>
	//  127  309:invokestatic    #110 <Method long HeartRateMonitorHandler.access$200(HeartRateMonitorHandler)>
	//  128  312:invokevirtual   #137 <Method void Bundle.putLong(String, long)>
			((Bundle) (sensorevent)).putFloat("heart_rate_snr", HeartRateMonitorHandler.access$300(HeartRateMonitorHandler.this));
	//  129  315:aload_1         
	//  130  316:ldc1            #147 <String "heart_rate_snr">
	//  131  318:aload_0         
	//  132  319:getfield        #14  <Field HeartRateMonitorHandler this$0>
	//  133  322:invokestatic    #119 <Method float HeartRateMonitorHandler.access$300(HeartRateMonitorHandler)>
	//  134  325:invokevirtual   #151 <Method void Bundle.putFloat(String, float)>
			mProfileHandlerListener.onDataReceived(1, ((Bundle) (sensorevent)));
	//  135  328:aload_0         
	//  136  329:getfield        #14  <Field HeartRateMonitorHandler this$0>
	//  137  332:getfield        #100 <Field PrivilegeSensorProfileHandlerListener HeartRateMonitorHandler.mProfileHandlerListener>
	//  138  335:iconst_1        
	//  139  336:aload_1         
	//  140  337:invokeinterface #157 <Method void PrivilegeSensorProfileHandlerListener.onDataReceived(int, Bundle)>
			return;
	//  141  342:return          
		}
		if(true) goto _L2; else goto _L8
_L8:
		i = 10000;
	//  142  343:sipush          10000
	//  143  346:istore_2        
		  goto _L9
	//* 144  347:goto            152
_L6:
		i = 10001;
	//  145  350:sipush          10001
	//  146  353:istore_2        
		  goto _L9
	//* 147  354:goto            152
_L5:
		i = 10002;
	//  148  357:sipush          10002
	//  149  360:istore_2        
		  goto _L9
	//* 150  361:goto            152
		i = 10003;
	//  151  364:sipush          10003
	//  152  367:istore_2        
		  goto _L9
	//* 153  368:goto            152
	}

	final HeartRateMonitorHandler this$0;

	HeartRateMonitorHandler$1()
	{
		this$0 = HeartRateMonitorHandler.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field HeartRateMonitorHandler this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
