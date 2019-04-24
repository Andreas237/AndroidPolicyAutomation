// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.sensor.framework.device.android;

import android.hardware.*;
import android.os.Bundle;
import com.samsung.android.sensor.data.SensorData;
import com.sec.android.service.health.util.LOG;

// Referenced classes of package com.sec.android.sensor.framework.device.android:
//			SensorAndroidHeartRateBioDevice

class SensorAndroidHeartRateBioDevice$1
	implements SensorEventListener
{

	public void onAccuracyChanged(Sensor sensor, int i)
	{
		LOG.i(SensorAndroidHeartRateBioDevice.access$000(), "onAccuracyChanged()");
	//    0    0:invokestatic    #24  <Method Class SensorAndroidHeartRateBioDevice.access$000()>
	//    1    3:ldc1            #26  <String "onAccuracyChanged()">
	//    2    5:invokestatic    #32  <Method void LOG.i(Class, String)>
		if(sensor == null)
	//*   3    8:aload_1         
	//*   4    9:ifnonnull       20
			LOG.w(SensorAndroidHeartRateBioDevice.access$000(), "onAccuracyChanged() Sensor is null");
	//    5   12:invokestatic    #24  <Method Class SensorAndroidHeartRateBioDevice.access$000()>
	//    6   15:ldc1            #34  <String "onAccuracyChanged() Sensor is null">
	//    7   17:invokestatic    #37  <Method void LOG.w(Class, String)>
	//    8   20:return          
	}

	public void onSensorChanged(SensorEvent sensorevent)
	{
		LOG.i(SensorAndroidHeartRateBioDevice.access$000(), "onSensorChanged()");
	//    0    0:invokestatic    #24  <Method Class SensorAndroidHeartRateBioDevice.access$000()>
	//    1    3:ldc1            #41  <String "onSensorChanged()">
	//    2    5:invokestatic    #32  <Method void LOG.i(Class, String)>
		if(sensorevent == null || sensorevent.sensor == null)
	//*   3    8:aload_1         
	//*   4    9:ifnull          19
	//*   5   12:aload_1         
	//*   6   13:getfield        #47  <Field Sensor SensorEvent.sensor>
	//*   7   16:ifnonnull       28
			LOG.e(SensorAndroidHeartRateBioDevice.access$000(), "Sensor Event is null !!!");
	//    8   19:invokestatic    #24  <Method Class SensorAndroidHeartRateBioDevice.access$000()>
	//    9   22:ldc1            #49  <String "Sensor Event is null !!!">
	//   10   24:invokestatic    #52  <Method void LOG.e(Class, String)>
		else
	//*  11   27:return          
		if(sensorevent.sensor.getType() == mSensor.getType())
	//*  12   28:aload_1         
	//*  13   29:getfield        #47  <Field Sensor SensorEvent.sensor>
	//*  14   32:invokevirtual   #58  <Method int Sensor.getType()>
	//*  15   35:aload_0         
	//*  16   36:getfield        #14  <Field SensorAndroidHeartRateBioDevice this$0>
	//*  17   39:getfield        #61  <Field Sensor SensorAndroidHeartRateBioDevice.mSensor>
	//*  18   42:invokevirtual   #58  <Method int Sensor.getType()>
	//*  19   45:icmpne          27
		{
			int i = (int)sensorevent.values[0];
	//   20   48:aload_1         
	//   21   49:getfield        #65  <Field float[] SensorEvent.values>
	//   22   52:iconst_0        
	//   23   53:faload          
	//   24   54:f2i             
	//   25   55:istore_3        
			long l = (long)sensorevent.values[1];
	//   26   56:aload_1         
	//   27   57:getfield        #65  <Field float[] SensorEvent.values>
	//   28   60:iconst_1        
	//   29   61:faload          
	//   30   62:f2l             
	//   31   63:lstore          4
			float f = sensorevent.values[2];
	//   32   65:aload_1         
	//   33   66:getfield        #65  <Field float[] SensorEvent.values>
	//   34   69:iconst_2        
	//   35   70:faload          
	//   36   71:fstore_2        
			LOG.d(SensorAndroidHeartRateBioDevice.access$000(), (new StringBuilder()).append("Heart Rate = ").append(i).append(" interval = ").append(l).append(" SNR = ").append(f).toString());
	//   37   72:invokestatic    #24  <Method Class SensorAndroidHeartRateBioDevice.access$000()>
	//   38   75:new             #67  <Class StringBuilder>
	//   39   78:dup             
	//   40   79:invokespecial   #68  <Method void StringBuilder()>
	//   41   82:ldc1            #70  <String "Heart Rate = ">
	//   42   84:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   43   87:iload_3         
	//   44   88:invokevirtual   #77  <Method StringBuilder StringBuilder.append(int)>
	//   45   91:ldc1            #79  <String " interval = ">
	//   46   93:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   47   96:lload           4
	//   48   98:invokevirtual   #82  <Method StringBuilder StringBuilder.append(long)>
	//   49  101:ldc1            #84  <String " SNR = ">
	//   50  103:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   51  106:fload_2         
	//   52  107:invokevirtual   #87  <Method StringBuilder StringBuilder.append(float)>
	//   53  110:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   54  113:invokestatic    #94  <Method void LOG.d(Class, String)>
			sensorevent = ((SensorEvent) (new Bundle()));
	//   55  116:new             #96  <Class Bundle>
	//   56  119:dup             
	//   57  120:invokespecial   #97  <Method void Bundle()>
	//   58  123:astore_1        
			((Bundle) (sensorevent)).putInt("heart_rate", i);
	//   59  124:aload_1         
	//   60  125:ldc1            #99  <String "heart_rate">
	//   61  127:iload_3         
	//   62  128:invokevirtual   #103 <Method void Bundle.putInt(String, int)>
			((Bundle) (sensorevent)).putLong("heart_rate_interval", l);
	//   63  131:aload_1         
	//   64  132:ldc1            #105 <String "heart_rate_interval">
	//   65  134:lload           4
	//   66  136:invokevirtual   #109 <Method void Bundle.putLong(String, long)>
			((Bundle) (sensorevent)).putFloat("heart_rate_snr", f);
	//   67  139:aload_1         
	//   68  140:ldc1            #111 <String "heart_rate_snr">
	//   69  142:fload_2         
	//   70  143:invokevirtual   #115 <Method void Bundle.putFloat(String, float)>
			sensorevent = ((SensorEvent) (new SensorData(SensorAndroidHeartRateBioDevice.access$100(SensorAndroidHeartRateBioDevice.this), ((Bundle) (sensorevent)))));
	//   71  146:new             #117 <Class SensorData>
	//   72  149:dup             
	//   73  150:aload_0         
	//   74  151:getfield        #14  <Field SensorAndroidHeartRateBioDevice this$0>
	//   75  154:invokestatic    #121 <Method int SensorAndroidHeartRateBioDevice.access$100(SensorAndroidHeartRateBioDevice)>
	//   76  157:aload_1         
	//   77  158:invokespecial   #124 <Method void SensorData(int, Bundle)>
	//   78  161:astore_1        
			invokeDeviceDataCallback(((SensorData) (sensorevent)));
	//   79  162:aload_0         
	//   80  163:getfield        #14  <Field SensorAndroidHeartRateBioDevice this$0>
	//   81  166:aload_1         
	//   82  167:invokevirtual   #128 <Method void SensorAndroidHeartRateBioDevice.invokeDeviceDataCallback(SensorData)>
			return;
	//   83  170:return          
		}
	}

	final SensorAndroidHeartRateBioDevice this$0;

	SensorAndroidHeartRateBioDevice$1()
	{
		this$0 = SensorAndroidHeartRateBioDevice.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field SensorAndroidHeartRateBioDevice this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
