// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.sensor.framework.device.android;

import android.hardware.*;
import android.os.Bundle;
import com.samsung.android.sensor.data.SensorData;
import com.sec.android.sensor.framework.device.android.util.SensorSpo2Cal;
import com.sec.android.sensor.framework.device.android.util.SensorSpo2ZeroCal;
import com.sec.android.service.health.util.LOG;

// Referenced classes of package com.sec.android.sensor.framework.device.android:
//			SensorAndroidPulseOximeterDevice

class SensorAndroidPulseOximeterDevice$1
	implements SensorEventListener
{

	public void onAccuracyChanged(Sensor sensor, int i)
	{
		LOG.i(SensorAndroidPulseOximeterDevice.access$000(), "onAccuracyChanged()");
	//    0    0:invokestatic    #24  <Method Class SensorAndroidPulseOximeterDevice.access$000()>
	//    1    3:ldc1            #26  <String "onAccuracyChanged()">
	//    2    5:invokestatic    #32  <Method void LOG.i(Class, String)>
		if(sensor == null)
	//*   3    8:aload_1         
	//*   4    9:ifnonnull       20
			LOG.w(SensorAndroidPulseOximeterDevice.access$000(), "onAccuracyChanged() Sensor is null");
	//    5   12:invokestatic    #24  <Method Class SensorAndroidPulseOximeterDevice.access$000()>
	//    6   15:ldc1            #34  <String "onAccuracyChanged() Sensor is null">
	//    7   17:invokestatic    #37  <Method void LOG.w(Class, String)>
	//    8   20:return          
	}

	public void onSensorChanged(SensorEvent sensorevent)
	{
		LOG.i(SensorAndroidPulseOximeterDevice.access$000(), "onSensorChanged()");
	//    0    0:invokestatic    #24  <Method Class SensorAndroidPulseOximeterDevice.access$000()>
	//    1    3:ldc1            #41  <String "onSensorChanged()">
	//    2    5:invokestatic    #32  <Method void LOG.i(Class, String)>
		if(sensorevent != null && sensorevent.sensor != null) goto _L2; else goto _L1
	//    3    8:aload_1         
	//    4    9:ifnull          19
	//    5   12:aload_1         
	//    6   13:getfield        #47  <Field Sensor SensorEvent.sensor>
	//    7   16:ifnonnull       28
_L1:
		LOG.e(SensorAndroidPulseOximeterDevice.access$000(), "Sensor Event is null !!!");
	//    8   19:invokestatic    #24  <Method Class SensorAndroidPulseOximeterDevice.access$000()>
	//    9   22:ldc1            #49  <String "Sensor Event is null !!!">
	//   10   24:invokestatic    #52  <Method void LOG.e(Class, String)>
_L4:
		return;
	//   11   27:return          
_L2:
		if(sensorevent.sensor.getType() != mSensor.getType()) goto _L4; else goto _L3
	//   12   28:aload_1         
	//   13   29:getfield        #47  <Field Sensor SensorEvent.sensor>
	//   14   32:invokevirtual   #58  <Method int Sensor.getType()>
	//   15   35:aload_0         
	//   16   36:getfield        #14  <Field SensorAndroidPulseOximeterDevice this$0>
	//   17   39:getfield        #61  <Field Sensor SensorAndroidPulseOximeterDevice.mSensor>
	//   18   42:invokevirtual   #58  <Method int Sensor.getType()>
	//   19   45:icmpne          27
_L3:
		float f;
		float f1;
		int i;
		long l;
		i = (int)sensorevent.values[0];
	//   20   48:aload_1         
	//   21   49:getfield        #65  <Field float[] SensorEvent.values>
	//   22   52:iconst_0        
	//   23   53:faload          
	//   24   54:f2i             
	//   25   55:istore          4
		l = (long)sensorevent.values[1];
	//   26   57:aload_1         
	//   27   58:getfield        #65  <Field float[] SensorEvent.values>
	//   28   61:iconst_1        
	//   29   62:faload          
	//   30   63:f2l             
	//   31   64:lstore          5
		f1 = sensorevent.values[2];
	//   32   66:aload_1         
	//   33   67:getfield        #65  <Field float[] SensorEvent.values>
	//   34   70:iconst_2        
	//   35   71:faload          
	//   36   72:fstore_3        
		f = sensorevent.values[4];
	//   37   73:aload_1         
	//   38   74:getfield        #65  <Field float[] SensorEvent.values>
	//   39   77:iconst_4        
	//   40   78:faload          
	//   41   79:fstore_2        
		if(!SensorAndroidPulseOximeterDevice.access$100(SensorAndroidPulseOximeterDevice.this)) goto _L6; else goto _L5
	//   42   80:aload_0         
	//   43   81:getfield        #14  <Field SensorAndroidPulseOximeterDevice this$0>
	//   44   84:invokestatic    #69  <Method boolean SensorAndroidPulseOximeterDevice.access$100(SensorAndroidPulseOximeterDevice)>
	//   45   87:ifeq            215
_L5:
		if(f >= 0.0F)
	//*  46   90:fload_2         
	//*  47   91:fconst_0        
	//*  48   92:fcmpg           
	//*  49   93:ifge            207
	//*  50   96:invokestatic    #24  <Method Class SensorAndroidPulseOximeterDevice.access$000()>
	//*  51   99:new             #71  <Class StringBuilder>
	//*  52  102:dup             
	//*  53  103:invokespecial   #72  <Method void StringBuilder()>
	//*  54  106:ldc1            #74  <String "Heart Rate = ">
	//*  55  108:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//*  56  111:iload           4
	//*  57  113:invokevirtual   #81  <Method StringBuilder StringBuilder.append(int)>
	//*  58  116:ldc1            #83  <String " interval = ">
	//*  59  118:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//*  60  121:lload           5
	//*  61  123:invokevirtual   #86  <Method StringBuilder StringBuilder.append(long)>
	//*  62  126:ldc1            #88  <String " SNR = ">
	//*  63  128:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//*  64  131:fload_3         
	//*  65  132:invokevirtual   #91  <Method StringBuilder StringBuilder.append(float)>
	//*  66  135:ldc1            #93  <String " pulseOximetry = ">
	//*  67  137:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//*  68  140:fload_2         
	//*  69  141:invokevirtual   #91  <Method StringBuilder StringBuilder.append(float)>
	//*  70  144:invokevirtual   #97  <Method String StringBuilder.toString()>
	//*  71  147:invokestatic    #100 <Method void LOG.d(Class, String)>
	//*  72  150:new             #102 <Class Bundle>
	//*  73  153:dup             
	//*  74  154:invokespecial   #103 <Method void Bundle()>
	//*  75  157:astore_1        
	//*  76  158:aload_1         
	//*  77  159:ldc1            #105 <String "heart_rate">
	//*  78  161:iload           4
	//*  79  163:invokevirtual   #109 <Method void Bundle.putInt(String, int)>
	//*  80  166:aload_1         
	//*  81  167:ldc1            #111 <String "heart_rate_interval">
	//*  82  169:lload           5
	//*  83  171:invokevirtual   #115 <Method void Bundle.putLong(String, long)>
	//*  84  174:aload_1         
	//*  85  175:ldc1            #117 <String "heart_rate_snr">
	//*  86  177:fload_3         
	//*  87  178:invokevirtual   #121 <Method void Bundle.putFloat(String, float)>
	//*  88  181:aload_1         
	//*  89  182:ldc1            #123 <String "pulse_oximetry">
	//*  90  184:fload_2         
	//*  91  185:invokevirtual   #121 <Method void Bundle.putFloat(String, float)>
	//*  92  188:new             #125 <Class SensorData>
	//*  93  191:dup             
	//*  94  192:iconst_4        
	//*  95  193:aload_1         
	//*  96  194:invokespecial   #128 <Method void SensorData(int, Bundle)>
	//*  97  197:astore_1        
	//*  98  198:aload_0         
	//*  99  199:getfield        #14  <Field SensorAndroidPulseOximeterDevice this$0>
	//* 100  202:aload_1         
	//* 101  203:invokevirtual   #132 <Method void SensorAndroidPulseOximeterDevice.invokeDeviceDataCallback(SensorData)>
	//* 102  206:return          
			f = SensorSpo2ZeroCal.spo2cal(f);
	//  103  207:fload_2         
	//  104  208:invokestatic    #138 <Method float SensorSpo2ZeroCal.spo2cal(float)>
	//  105  211:fstore_2        
_L8:
		LOG.d(SensorAndroidPulseOximeterDevice.access$000(), (new StringBuilder()).append("Heart Rate = ").append(i).append(" interval = ").append(l).append(" SNR = ").append(f1).append(" pulseOximetry = ").append(f).toString());
		sensorevent = ((SensorEvent) (new Bundle()));
		((Bundle) (sensorevent)).putInt("heart_rate", i);
		((Bundle) (sensorevent)).putLong("heart_rate_interval", l);
		((Bundle) (sensorevent)).putFloat("heart_rate_snr", f1);
		((Bundle) (sensorevent)).putFloat("pulse_oximetry", f);
		sensorevent = ((SensorEvent) (new SensorData(4, ((Bundle) (sensorevent)))));
		invokeDeviceDataCallback(((SensorData) (sensorevent)));
		return;
	//* 106  212:goto            96
_L6:
		if(f >= 0.0F)
	//* 107  215:fload_2         
	//* 108  216:fconst_0        
	//* 109  217:fcmpg           
	//* 110  218:ifge            224
	//* 111  221:goto            96
			f = SensorSpo2Cal.spo2cal(f);
	//  112  224:fload_2         
	//  113  225:invokestatic    #141 <Method float SensorSpo2Cal.spo2cal(float)>
	//  114  228:fstore_2        
		if(true) goto _L8; else goto _L7
	//  115  229:goto            221
_L7:
	}

	final SensorAndroidPulseOximeterDevice this$0;

	SensorAndroidPulseOximeterDevice$1()
	{
		this$0 = SensorAndroidPulseOximeterDevice.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field SensorAndroidPulseOximeterDevice this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
