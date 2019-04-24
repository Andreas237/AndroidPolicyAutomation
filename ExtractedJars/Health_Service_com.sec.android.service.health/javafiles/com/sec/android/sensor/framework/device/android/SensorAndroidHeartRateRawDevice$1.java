// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.sensor.framework.device.android;

import android.hardware.*;
import android.os.Bundle;
import com.samsung.android.sensor.data.SensorData;
import com.sec.android.service.health.util.LOG;

// Referenced classes of package com.sec.android.sensor.framework.device.android:
//			SensorAndroidHeartRateRawDevice

class SensorAndroidHeartRateRawDevice$1
	implements SensorEventListener
{

	public void onAccuracyChanged(Sensor sensor, int i)
	{
		LOG.i(SensorAndroidHeartRateRawDevice.access$000(), "onAccuracyChanged()");
	//    0    0:invokestatic    #24  <Method Class SensorAndroidHeartRateRawDevice.access$000()>
	//    1    3:ldc1            #26  <String "onAccuracyChanged()">
	//    2    5:invokestatic    #32  <Method void LOG.i(Class, String)>
		if(sensor == null)
	//*   3    8:aload_1         
	//*   4    9:ifnonnull       20
			LOG.w(SensorAndroidHeartRateRawDevice.access$000(), "onAccuracyChanged() Sensor is null");
	//    5   12:invokestatic    #24  <Method Class SensorAndroidHeartRateRawDevice.access$000()>
	//    6   15:ldc1            #34  <String "onAccuracyChanged() Sensor is null">
	//    7   17:invokestatic    #37  <Method void LOG.w(Class, String)>
	//    8   20:return          
	}

	public void onSensorChanged(SensorEvent sensorevent)
	{
		LOG.i(SensorAndroidHeartRateRawDevice.access$000(), "onSensorChanged()");
	//    0    0:invokestatic    #24  <Method Class SensorAndroidHeartRateRawDevice.access$000()>
	//    1    3:ldc1            #41  <String "onSensorChanged()">
	//    2    5:invokestatic    #32  <Method void LOG.i(Class, String)>
		if(sensorevent == null || sensorevent.sensor == null)
	//*   3    8:aload_1         
	//*   4    9:ifnull          19
	//*   5   12:aload_1         
	//*   6   13:getfield        #47  <Field Sensor SensorEvent.sensor>
	//*   7   16:ifnonnull       28
			LOG.e(SensorAndroidHeartRateRawDevice.access$000(), "Sensor Event is null !!!");
	//    8   19:invokestatic    #24  <Method Class SensorAndroidHeartRateRawDevice.access$000()>
	//    9   22:ldc1            #49  <String "Sensor Event is null !!!">
	//   10   24:invokestatic    #52  <Method void LOG.e(Class, String)>
		else
	//*  11   27:return          
		if(sensorevent.sensor.getType() == mSensor.getType())
	//*  12   28:aload_1         
	//*  13   29:getfield        #47  <Field Sensor SensorEvent.sensor>
	//*  14   32:invokevirtual   #58  <Method int Sensor.getType()>
	//*  15   35:aload_0         
	//*  16   36:getfield        #14  <Field SensorAndroidHeartRateRawDevice this$0>
	//*  17   39:getfield        #61  <Field Sensor SensorAndroidHeartRateRawDevice.mSensor>
	//*  18   42:invokevirtual   #58  <Method int Sensor.getType()>
	//*  19   45:icmpne          27
		{
			float f = sensorevent.values[0];
	//   20   48:aload_1         
	//   21   49:getfield        #65  <Field float[] SensorEvent.values>
	//   22   52:iconst_0        
	//   23   53:faload          
	//   24   54:fstore_2        
			float f1 = sensorevent.values[1];
	//   25   55:aload_1         
	//   26   56:getfield        #65  <Field float[] SensorEvent.values>
	//   27   59:iconst_1        
	//   28   60:faload          
	//   29   61:fstore_3        
			LOG.d(SensorAndroidHeartRateRawDevice.access$000(), (new StringBuilder()).append("infraredValue = ").append(f).append(" ledValue = ").append(f1).toString());
	//   30   62:invokestatic    #24  <Method Class SensorAndroidHeartRateRawDevice.access$000()>
	//   31   65:new             #67  <Class StringBuilder>
	//   32   68:dup             
	//   33   69:invokespecial   #68  <Method void StringBuilder()>
	//   34   72:ldc1            #70  <String "infraredValue = ">
	//   35   74:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   36   77:fload_2         
	//   37   78:invokevirtual   #77  <Method StringBuilder StringBuilder.append(float)>
	//   38   81:ldc1            #79  <String " ledValue = ">
	//   39   83:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   40   86:fload_3         
	//   41   87:invokevirtual   #77  <Method StringBuilder StringBuilder.append(float)>
	//   42   90:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   43   93:invokestatic    #86  <Method void LOG.d(Class, String)>
			sensorevent = ((SensorEvent) (new Bundle()));
	//   44   96:new             #88  <Class Bundle>
	//   45   99:dup             
	//   46  100:invokespecial   #89  <Method void Bundle()>
	//   47  103:astore_1        
			((Bundle) (sensorevent)).putFloat("heart_rate_infra", f);
	//   48  104:aload_1         
	//   49  105:ldc1            #91  <String "heart_rate_infra">
	//   50  107:fload_2         
	//   51  108:invokevirtual   #95  <Method void Bundle.putFloat(String, float)>
			((Bundle) (sensorevent)).putFloat("heart_rate_led", f1);
	//   52  111:aload_1         
	//   53  112:ldc1            #97  <String "heart_rate_led">
	//   54  114:fload_3         
	//   55  115:invokevirtual   #95  <Method void Bundle.putFloat(String, float)>
			sensorevent = ((SensorEvent) (new SensorData(2, ((Bundle) (sensorevent)))));
	//   56  118:new             #99  <Class SensorData>
	//   57  121:dup             
	//   58  122:iconst_2        
	//   59  123:aload_1         
	//   60  124:invokespecial   #102 <Method void SensorData(int, Bundle)>
	//   61  127:astore_1        
			invokeDeviceDataCallback(((SensorData) (sensorevent)));
	//   62  128:aload_0         
	//   63  129:getfield        #14  <Field SensorAndroidHeartRateRawDevice this$0>
	//   64  132:aload_1         
	//   65  133:invokevirtual   #106 <Method void SensorAndroidHeartRateRawDevice.invokeDeviceDataCallback(SensorData)>
			return;
	//   66  136:return          
		}
	}

	final SensorAndroidHeartRateRawDevice this$0;

	SensorAndroidHeartRateRawDevice$1()
	{
		this$0 = SensorAndroidHeartRateRawDevice.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field SensorAndroidHeartRateRawDevice this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
