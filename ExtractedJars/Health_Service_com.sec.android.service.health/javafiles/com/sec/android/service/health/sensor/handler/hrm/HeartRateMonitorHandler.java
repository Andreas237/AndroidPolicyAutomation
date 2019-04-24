// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.sensor.handler.hrm;

import android.content.Context;
import android.hardware.*;
import android.os.Bundle;
import com.samsung.android.sdk.health.sensor._private._PrivilegeSensorDevice;
import com.samsung.android.sdk.health.sensor.handler.PrivilegeSensorProfileHandlerInterface;
import com.samsung.android.sdk.health.sensor.handler.PrivilegeSensorProfileHandlerListener;
import com.sec.android.service.health.util.LOG;

public class HeartRateMonitorHandler
	implements PrivilegeSensorProfileHandlerInterface
{

	public HeartRateMonitorHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
		bListenerRegistered = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #54  <Field boolean bListenerRegistered>
		mHrmManager = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #56  <Field SensorManager mHrmManager>
		mHrmSensorRAW = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #58  <Field Sensor mHrmSensorRAW>
		mHrmSensor = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #60  <Field Sensor mHrmSensor>
		mProfileHandlerListener = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #62  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
		mHrmDevice = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #64  <Field _PrivilegeSensorDevice mHrmDevice>
		mHeartRate = -1;
	//   20   34:aload_0         
	//   21   35:iconst_m1       
	//   22   36:putfield        #66  <Field int mHeartRate>
		mInterval = 0L;
	//   23   39:aload_0         
	//   24   40:lconst_0        
	//   25   41:putfield        #68  <Field long mInterval>
		mSNR = 0.0F;
	//   26   44:aload_0         
	//   27   45:fconst_0        
	//   28   46:putfield        #70  <Field float mSNR>
		mSNRUNIT = 0x4baf1;
	//   29   49:aload_0         
	//   30   50:ldc1            #71  <Int 0x4baf1>
	//   31   52:putfield        #73  <Field int mSNRUNIT>
		HRMListener = new SensorEventListener() {

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
				LOG.d(HeartRateMonitorHandler.TAG, (new StringBuilder()).append("HeartRateMonitor onSensorChanged : event.accuracy = ").append(sensorevent.accuracy).toString());
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
				mHeartRate = (int)sensorevent.values[0];
			//   29   68:aload_0         
			//   30   69:getfield        #14  <Field HeartRateMonitorHandler this$0>
			//   31   72:aload_1         
			//   32   73:getfield        #80  <Field float[] SensorEvent.values>
			//   33   76:iconst_0        
			//   34   77:faload          
			//   35   78:f2i             
			//   36   79:invokestatic    #84  <Method int HeartRateMonitorHandler.access$102(HeartRateMonitorHandler, int)>
			//   37   82:pop             
				mInterval = (long)sensorevent.values[1];
			//   38   83:aload_0         
			//   39   84:getfield        #14  <Field HeartRateMonitorHandler this$0>
			//   40   87:aload_1         
			//   41   88:getfield        #80  <Field float[] SensorEvent.values>
			//   42   91:iconst_1        
			//   43   92:faload          
			//   44   93:f2l             
			//   45   94:invokestatic    #88  <Method long HeartRateMonitorHandler.access$202(HeartRateMonitorHandler, long)>
			//   46   97:pop2            
				mSNR = sensorevent.values[2];
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
				mHeartRate;
			//   57  114:aload_0         
			//   58  115:getfield        #14  <Field HeartRateMonitorHandler this$0>
			//   59  118:invokestatic    #96  <Method int HeartRateMonitorHandler.access$100(HeartRateMonitorHandler)>
				JVM INSTR tableswitch -4 -1: default 152
			//			               -4 364
			//			               -3 357
			//			               -2 350
			//			               -1 343;
			//   60  121:tableswitch     -4 -1: default 152
			//			               -4 364
			//			               -3 357
			//			               -2 350
			//			               -1 343
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
					LOG.d(HeartRateMonitorHandler.TAG, (new StringBuilder()).append("HRMListener => state : ").append(i).toString());
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
				LOG.d(HeartRateMonitorHandler.TAG, (new StringBuilder()).append("HRMListener => heartrate = ").append(mHeartRate).append(" interval = ").append(mInterval).append(" SNR = ").append(mSNR).toString());
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
					((Bundle) (sensorevent)).putInt("heart_rate", mHeartRate);
			//  117  289:aload_1         
			//  118  290:ldc1            #139 <String "heart_rate">
			//  119  292:aload_0         
			//  120  293:getfield        #14  <Field HeartRateMonitorHandler this$0>
			//  121  296:invokestatic    #96  <Method int HeartRateMonitorHandler.access$100(HeartRateMonitorHandler)>
			//  122  299:invokevirtual   #143 <Method void Bundle.putInt(String, int)>
					((Bundle) (sensorevent)).putLong("heart_rate_interval", mInterval);
			//  123  302:aload_1         
			//  124  303:ldc1            #145 <String "heart_rate_interval">
			//  125  305:aload_0         
			//  126  306:getfield        #14  <Field HeartRateMonitorHandler this$0>
			//  127  309:invokestatic    #110 <Method long HeartRateMonitorHandler.access$200(HeartRateMonitorHandler)>
			//  128  312:invokevirtual   #137 <Method void Bundle.putLong(String, long)>
					((Bundle) (sensorevent)).putFloat("heart_rate_snr", mSNR);
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
;
	//   32   55:aload_0         
	//   33   56:new             #8   <Class HeartRateMonitorHandler$1>
	//   34   59:dup             
	//   35   60:aload_0         
	//   36   61:invokespecial   #76  <Method void HeartRateMonitorHandler$1(HeartRateMonitorHandler)>
	//   37   64:putfield        #78  <Field SensorEventListener HRMListener>
		HRM_rawListener = new SensorEventListener() {

			public void onAccuracyChanged(Sensor sensor, int i)
			{
			//    0    0:return          
			}

			public void onSensorChanged(SensorEvent sensorevent)
			{
			//    0    0:return          
			}

			final HeartRateMonitorHandler this$0;

			
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
;
	//   38   67:aload_0         
	//   39   68:new             #10  <Class HeartRateMonitorHandler$2>
	//   40   71:dup             
	//   41   72:aload_0         
	//   42   73:invokespecial   #79  <Method void HeartRateMonitorHandler$2(HeartRateMonitorHandler)>
	//   43   76:putfield        #81  <Field SensorEventListener HRM_rawListener>
	//   44   79:return          
	}

	private boolean registerHRMListener()
	{
		if(mHrmManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field SensorManager mHrmManager>
	//*   2    4:ifnull          200
		{
			mHrmSensorRAW = mHrmManager.getDefaultSensor(0x10019);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field SensorManager mHrmManager>
	//    6   12:ldc1            #22  <Int 0x10019>
	//    7   14:invokevirtual   #103 <Method Sensor SensorManager.getDefaultSensor(int)>
	//    8   17:putfield        #58  <Field Sensor mHrmSensorRAW>
			boolean flag = mHrmManager.registerListener(HRM_rawListener, mHrmSensorRAW, 3);
	//    9   20:aload_0         
	//   10   21:getfield        #56  <Field SensorManager mHrmManager>
	//   11   24:aload_0         
	//   12   25:getfield        #81  <Field SensorEventListener HRM_rawListener>
	//   13   28:aload_0         
	//   14   29:getfield        #58  <Field Sensor mHrmSensorRAW>
	//   15   32:iconst_3        
	//   16   33:invokevirtual   #107 <Method boolean SensorManager.registerListener(SensorEventListener, Sensor, int)>
	//   17   36:istore_1        
			Class class1 = TAG;
	//   18   37:getstatic       #48  <Field Class TAG>
	//   19   40:astore          4
			StringBuilder stringbuilder = (new StringBuilder()).append("HRM sensor TYPE_HRM_RAW was ");
	//   20   42:new             #109 <Class StringBuilder>
	//   21   45:dup             
	//   22   46:invokespecial   #110 <Method void StringBuilder()>
	//   23   49:ldc1            #112 <String "HRM sensor TYPE_HRM_RAW was ">
	//   24   51:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   25   54:astore          5
			boolean flag1;
			String s;
			if(flag)
	//*  26   56:iload_1         
	//*  27   57:ifeq            205
				s = "";
	//   28   60:ldc1            #118 <String "">
	//   29   62:astore_3        
			else
	//*  30   63:aload           4
	//*  31   65:aload           5
	//*  32   67:aload_3         
	//*  33   68:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//*  34   71:ldc1            #120 <String "registered">
	//*  35   73:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//*  36   76:invokevirtual   #124 <Method String StringBuilder.toString()>
	//*  37   79:invokestatic    #130 <Method void LOG.d(Class, String)>
	//*  38   82:aload_0         
	//*  39   83:aload_0         
	//*  40   84:getfield        #56  <Field SensorManager mHrmManager>
	//*  41   87:ldc1            #20  <Int 0x1001a>
	//*  42   89:invokevirtual   #103 <Method Sensor SensorManager.getDefaultSensor(int)>
	//*  43   92:putfield        #60  <Field Sensor mHrmSensor>
	//*  44   95:aload_0         
	//*  45   96:getfield        #56  <Field SensorManager mHrmManager>
	//*  46   99:aload_0         
	//*  47  100:getfield        #78  <Field SensorEventListener HRMListener>
	//*  48  103:aload_0         
	//*  49  104:getfield        #60  <Field Sensor mHrmSensor>
	//*  50  107:iconst_3        
	//*  51  108:invokevirtual   #107 <Method boolean SensorManager.registerListener(SensorEventListener, Sensor, int)>
	//*  52  111:istore_2        
	//*  53  112:getstatic       #48  <Field Class TAG>
	//*  54  115:astore          4
	//*  55  117:new             #109 <Class StringBuilder>
	//*  56  120:dup             
	//*  57  121:invokespecial   #110 <Method void StringBuilder()>
	//*  58  124:ldc1            #132 <String "HRM sensor TYPE_HRM_BIO was ">
	//*  59  126:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//*  60  129:astore          5
	//*  61  131:iload_2         
	//*  62  132:ifeq            211
	//*  63  135:ldc1            #118 <String "">
	//*  64  137:astore_3        
	//*  65  138:aload           4
	//*  66  140:aload           5
	//*  67  142:aload_3         
	//*  68  143:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//*  69  146:ldc1            #120 <String "registered">
	//*  70  148:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//*  71  151:invokevirtual   #124 <Method String StringBuilder.toString()>
	//*  72  154:invokestatic    #130 <Method void LOG.d(Class, String)>
	//*  73  157:iload_1         
	//*  74  158:ifne            165
	//*  75  161:iload_2         
	//*  76  162:ifeq            217
	//*  77  165:iconst_1        
	//*  78  166:istore_1        
	//*  79  167:aload_0         
	//*  80  168:iload_1         
	//*  81  169:putfield        #54  <Field boolean bListenerRegistered>
	//*  82  172:getstatic       #48  <Field Class TAG>
	//*  83  175:new             #109 <Class StringBuilder>
	//*  84  178:dup             
	//*  85  179:invokespecial   #110 <Method void StringBuilder()>
	//*  86  182:ldc1            #134 <String "HRM sensor bListenerRegistered :  ">
	//*  87  184:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//*  88  187:aload_0         
	//*  89  188:getfield        #54  <Field boolean bListenerRegistered>
	//*  90  191:invokevirtual   #137 <Method StringBuilder StringBuilder.append(boolean)>
	//*  91  194:invokevirtual   #124 <Method String StringBuilder.toString()>
	//*  92  197:invokestatic    #130 <Method void LOG.d(Class, String)>
	//*  93  200:aload_0         
	//*  94  201:getfield        #54  <Field boolean bListenerRegistered>
	//*  95  204:ireturn         
				s = "not ";
	//   96  205:ldc1            #139 <String "not ">
	//   97  207:astore_3        
			LOG.d(class1, stringbuilder.append(s).append("registered").toString());
			mHrmSensor = mHrmManager.getDefaultSensor(0x1001a);
			flag1 = mHrmManager.registerListener(HRMListener, mHrmSensor, 3);
			class1 = TAG;
			stringbuilder = (new StringBuilder()).append("HRM sensor TYPE_HRM_BIO was ");
			if(flag1)
				s = "";
			else
	//*  98  208:goto            63
				s = "not ";
	//   99  211:ldc1            #139 <String "not ">
	//  100  213:astore_3        
			LOG.d(class1, stringbuilder.append(s).append("registered").toString());
			if(flag || flag1)
				flag = true;
			else
	//* 101  214:goto            138
				flag = false;
	//  102  217:iconst_0        
	//  103  218:istore_1        
			bListenerRegistered = flag;
			LOG.d(TAG, (new StringBuilder()).append("HRM sensor bListenerRegistered :  ").append(bListenerRegistered).toString());
		}
		return bListenerRegistered;
	//* 104  219:goto            167
	}

	private boolean unregisterHRMListener()
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		LOG.d(TAG, (new StringBuilder()).append("unregisterHRMListener : current state : ").append(bListenerRegistered).toString());
	//    2    2:getstatic       #48  <Field Class TAG>
	//    3    5:new             #109 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #110 <Method void StringBuilder()>
	//    6   12:ldc1            #142 <String "unregisterHRMListener : current state : ">
	//    7   14:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//    8   17:aload_0         
	//    9   18:getfield        #54  <Field boolean bListenerRegistered>
	//   10   21:invokevirtual   #137 <Method StringBuilder StringBuilder.append(boolean)>
	//   11   24:invokevirtual   #124 <Method String StringBuilder.toString()>
	//   12   27:invokestatic    #130 <Method void LOG.d(Class, String)>
		if(mHrmManager != null)
	//*  13   30:aload_0         
	//*  14   31:getfield        #56  <Field SensorManager mHrmManager>
	//*  15   34:ifnull          74
		{
			LOG.d(TAG, "unregisterSensorManager is called");
	//   16   37:getstatic       #48  <Field Class TAG>
	//   17   40:ldc1            #144 <String "unregisterSensorManager is called">
	//   18   42:invokestatic    #130 <Method void LOG.d(Class, String)>
			mHrmManager.unregisterListener(HRM_rawListener);
	//   19   45:aload_0         
	//   20   46:getfield        #56  <Field SensorManager mHrmManager>
	//   21   49:aload_0         
	//   22   50:getfield        #81  <Field SensorEventListener HRM_rawListener>
	//   23   53:invokevirtual   #148 <Method void SensorManager.unregisterListener(SensorEventListener)>
			mHrmManager.unregisterListener(HRMListener);
	//   24   56:aload_0         
	//   25   57:getfield        #56  <Field SensorManager mHrmManager>
	//   26   60:aload_0         
	//   27   61:getfield        #78  <Field SensorEventListener HRMListener>
	//   28   64:invokevirtual   #148 <Method void SensorManager.unregisterListener(SensorEventListener)>
			bListenerRegistered = false;
	//   29   67:aload_0         
	//   30   68:iconst_0        
	//   31   69:putfield        #54  <Field boolean bListenerRegistered>
			flag = true;
	//   32   72:iconst_1        
	//   33   73:istore_1        
		}
		return flag;
	//   34   74:iload_1         
	//   35   75:ireturn         
	}

	public void deinitialize()
	{
		LOG.d(TAG, "deinitialize is called");
	//    0    0:getstatic       #48  <Field Class TAG>
	//    1    3:ldc1            #151 <String "deinitialize is called">
	//    2    5:invokestatic    #130 <Method void LOG.d(Class, String)>
		if(bListenerRegistered)
	//*   3    8:aload_0         
	//*   4    9:getfield        #54  <Field boolean bListenerRegistered>
	//*   5   12:ifeq            20
			unregisterHRMListener();
	//    6   15:aload_0         
	//    7   16:invokespecial   #153 <Method boolean unregisterHRMListener()>
	//    8   19:pop             
	//    9   20:return          
	}

	public _PrivilegeSensorDevice getDevice()
	{
		return mHrmDevice;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field _PrivilegeSensorDevice mHrmDevice>
	//    2    4:areturn         
	}

	public PrivilegeSensorProfileHandlerListener getProfileHandlerListener()
	{
		return mProfileHandlerListener;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
	//    2    4:areturn         
	}

	public _PrivilegeSensorDevice get_ShealthSensorDevice()
	{
		return mHrmDevice;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field _PrivilegeSensorDevice mHrmDevice>
	//    2    4:areturn         
	}

	public int initialize(Context context, PrivilegeSensorProfileHandlerListener privilegesensorprofilehandlerlistener, _PrivilegeSensorDevice _pprivilegesensordevice, Object obj)
	{
		mContext = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #162 <Field Context mContext>
		mHrmDevice = _pprivilegesensordevice;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #64  <Field _PrivilegeSensorDevice mHrmDevice>
		mProfileHandlerListener = privilegesensorprofilehandlerlistener;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #62  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
		mHrmManager = (SensorManager)context.getSystemService("sensor");
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:ldc1            #164 <String "sensor">
	//   12   19:invokevirtual   #170 <Method Object Context.getSystemService(String)>
	//   13   22:checkcast       #99  <Class SensorManager>
	//   14   25:putfield        #56  <Field SensorManager mHrmManager>
		return 0;
	//   15   28:iconst_0        
	//   16   29:ireturn         
	}

	public void initiallize(Context context, Object obj)
	{
		mContext = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #162 <Field Context mContext>
		mHrmManager = (SensorManager)context.getSystemService("sensor");
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #164 <String "sensor">
	//    6    9:invokevirtual   #170 <Method Object Context.getSystemService(String)>
	//    7   12:checkcast       #99  <Class SensorManager>
	//    8   15:putfield        #56  <Field SensorManager mHrmManager>
	//    9   18:return          
	}

	public void setProfileHandlerListener(PrivilegeSensorProfileHandlerListener privilegesensorprofilehandlerlistener)
	{
		mProfileHandlerListener = privilegesensorprofilehandlerlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
	//    3    5:return          
	}

	public void set_ShealthSensorDevice(_PrivilegeSensorDevice _pprivilegesensordevice)
	{
		mHrmDevice = _pprivilegesensordevice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field _PrivilegeSensorDevice mHrmDevice>
	//    3    5:return          
	}

	public int startReceivingData()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(!bListenerRegistered)
	//*   2    2:aload_0         
	//*   3    3:getfield        #54  <Field boolean bListenerRegistered>
	//*   4    6:ifne            18
			if(registerHRMListener())
	//*   5    9:aload_0         
	//*   6   10:invokespecial   #180 <Method boolean registerHRMListener()>
	//*   7   13:ifeq            63
				i = 0;
	//    8   16:iconst_0        
	//    9   17:istore_1        
			else
	//*  10   18:aload_0         
	//*  11   19:getfield        #62  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
	//*  12   22:ifnull          36
	//*  13   25:aload_0         
	//*  14   26:getfield        #62  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
	//*  15   29:iconst_1        
	//*  16   30:iload_1         
	//*  17   31:invokeinterface #186 <Method void PrivilegeSensorProfileHandlerListener.onDataStarted(int, int)>
	//*  18   36:getstatic       #48  <Field Class TAG>
	//*  19   39:new             #109 <Class StringBuilder>
	//*  20   42:dup             
	//*  21   43:invokespecial   #110 <Method void StringBuilder()>
	//*  22   46:ldc1            #188 <String "startReceivingData() is called. ret : ">
	//*  23   48:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//*  24   51:iload_1         
	//*  25   52:invokevirtual   #191 <Method StringBuilder StringBuilder.append(int)>
	//*  26   55:invokevirtual   #124 <Method String StringBuilder.toString()>
	//*  27   58:invokestatic    #130 <Method void LOG.d(Class, String)>
	//*  28   61:iload_1         
	//*  29   62:ireturn         
				i = 1;
	//   30   63:iconst_1        
	//   31   64:istore_1        
		if(mProfileHandlerListener != null)
			mProfileHandlerListener.onDataStarted(1, i);
		LOG.d(TAG, (new StringBuilder()).append("startReceivingData() is called. ret : ").append(i).toString());
		return i;
	//*  32   65:goto            18
	}

	public int stopReceivingData()
	{
		int i;
		if(unregisterHRMListener())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #153 <Method boolean unregisterHRMListener()>
	//*   2    4:ifeq            54
			i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
		else
	//*   5    9:aload_0         
	//*   6   10:getfield        #62  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
	//*   7   13:ifnull          27
	//*   8   16:aload_0         
	//*   9   17:getfield        #62  <Field PrivilegeSensorProfileHandlerListener mProfileHandlerListener>
	//*  10   20:iconst_1        
	//*  11   21:iload_1         
	//*  12   22:invokeinterface #195 <Method void PrivilegeSensorProfileHandlerListener.onDataStopped(int, int)>
	//*  13   27:getstatic       #48  <Field Class TAG>
	//*  14   30:new             #109 <Class StringBuilder>
	//*  15   33:dup             
	//*  16   34:invokespecial   #110 <Method void StringBuilder()>
	//*  17   37:ldc1            #197 <String "stopReceivingData() is called. ret : ">
	//*  18   39:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//*  19   42:iload_1         
	//*  20   43:invokevirtual   #191 <Method StringBuilder StringBuilder.append(int)>
	//*  21   46:invokevirtual   #124 <Method String StringBuilder.toString()>
	//*  22   49:invokestatic    #130 <Method void LOG.d(Class, String)>
	//*  23   52:iload_1         
	//*  24   53:ireturn         
			i = 1;
	//   25   54:iconst_1        
	//   26   55:istore_1        
		if(mProfileHandlerListener != null)
			mProfileHandlerListener.onDataStopped(1, i);
		LOG.d(TAG, (new StringBuilder()).append("stopReceivingData() is called. ret : ").append(i).toString());
		return i;
	//*  27   56:goto            9
	}

	private static final int RAW_DATA_INTERVAL_CNT = 5;
	private static final Class TAG = com/sec/android/service/health/sensor/handler/hrm/HeartRateMonitorHandler;
	private static final int TYPE_BASE = 0x10000;
	private static final int TYPE_HRM_BIO = 0x1001a;
	public static final int TYPE_HRM_RAW = 0x10019;
	SensorEventListener HRMListener;
	SensorEventListener HRM_rawListener;
	private boolean bListenerRegistered;
	Context mContext;
	private int mHeartRate;
	_PrivilegeSensorDevice mHrmDevice;
	private SensorManager mHrmManager;
	private Sensor mHrmSensor;
	private Sensor mHrmSensorRAW;
	private long mInterval;
	PrivilegeSensorProfileHandlerListener mProfileHandlerListener;
	private float mSNR;
	private int mSNRUNIT;

	static 
	{
	//    0    0:ldc1            #2   <Class HeartRateMonitorHandler>
	//    1    2:putstatic       #48  <Field Class TAG>
	//*   2    5:return          
	}


/*
	static Class access$000()
	{
		return TAG;
	//    0    0:getstatic       #48  <Field Class TAG>
	//    1    3:areturn         
	}

*/


/*
	static int access$100(HeartRateMonitorHandler heartratemonitorhandler)
	{
		return heartratemonitorhandler.mHeartRate;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field int mHeartRate>
	//    2    4:ireturn         
	}

*/


/*
	static int access$102(HeartRateMonitorHandler heartratemonitorhandler, int i)
	{
		heartratemonitorhandler.mHeartRate = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #66  <Field int mHeartRate>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static long access$200(HeartRateMonitorHandler heartratemonitorhandler)
	{
		return heartratemonitorhandler.mInterval;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field long mInterval>
	//    2    4:lreturn         
	}

*/


/*
	static long access$202(HeartRateMonitorHandler heartratemonitorhandler, long l)
	{
		heartratemonitorhandler.mInterval = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #68  <Field long mInterval>
		return l;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

*/


/*
	static float access$300(HeartRateMonitorHandler heartratemonitorhandler)
	{
		return heartratemonitorhandler.mSNR;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field float mSNR>
	//    2    4:freturn         
	}

*/


/*
	static float access$302(HeartRateMonitorHandler heartratemonitorhandler, float f)
	{
		heartratemonitorhandler.mSNR = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #70  <Field float mSNR>
		return f;
	//    3    5:fload_1         
	//    4    6:freturn         
	}

*/
}
