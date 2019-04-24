// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.sensor.framework.device.android;

import android.hardware.*;
import android.os.Bundle;
import com.samsung.android.sensor.data.SensorData;
import com.sec.android.service.health.util.LOG;

// Referenced classes of package com.sec.android.sensor.framework.device.android:
//			SensorAndroidBloodGlucoseDevice

class SensorAndroidBloodGlucoseDevice$1
	implements SensorEventListener
{

	public void onAccuracyChanged(Sensor sensor, int i)
	{
		LOG.i(SensorAndroidBloodGlucoseDevice.access$000(), "onAccuracyChanged()");
	//    0    0:invokestatic    #24  <Method Class SensorAndroidBloodGlucoseDevice.access$000()>
	//    1    3:ldc1            #26  <String "onAccuracyChanged()">
	//    2    5:invokestatic    #32  <Method void LOG.i(Class, String)>
		if(sensor == null)
	//*   3    8:aload_1         
	//*   4    9:ifnonnull       20
			LOG.w(SensorAndroidBloodGlucoseDevice.access$000(), "onAccuracyChanged() Sensor is null");
	//    5   12:invokestatic    #24  <Method Class SensorAndroidBloodGlucoseDevice.access$000()>
	//    6   15:ldc1            #34  <String "onAccuracyChanged() Sensor is null">
	//    7   17:invokestatic    #37  <Method void LOG.w(Class, String)>
	//    8   20:return          
	}

	public void onSensorChanged(SensorEvent sensorevent)
	{
		LOG.i(SensorAndroidBloodGlucoseDevice.access$000(), "onSensorChanged()");
	//    0    0:invokestatic    #24  <Method Class SensorAndroidBloodGlucoseDevice.access$000()>
	//    1    3:ldc1            #41  <String "onSensorChanged()">
	//    2    5:invokestatic    #32  <Method void LOG.i(Class, String)>
		if(sensorevent == null || sensorevent.sensor == null)
	//*   3    8:aload_1         
	//*   4    9:ifnull          19
	//*   5   12:aload_1         
	//*   6   13:getfield        #47  <Field Sensor SensorEvent.sensor>
	//*   7   16:ifnonnull       28
			LOG.e(SensorAndroidBloodGlucoseDevice.access$000(), "Sensor Event is null !!!");
	//    8   19:invokestatic    #24  <Method Class SensorAndroidBloodGlucoseDevice.access$000()>
	//    9   22:ldc1            #49  <String "Sensor Event is null !!!">
	//   10   24:invokestatic    #52  <Method void LOG.e(Class, String)>
		else
	//*  11   27:return          
		if(sensorevent.sensor.getType() == mSensor.getType())
	//*  12   28:aload_1         
	//*  13   29:getfield        #47  <Field Sensor SensorEvent.sensor>
	//*  14   32:invokevirtual   #58  <Method int Sensor.getType()>
	//*  15   35:aload_0         
	//*  16   36:getfield        #14  <Field SensorAndroidBloodGlucoseDevice this$0>
	//*  17   39:getfield        #61  <Field Sensor SensorAndroidBloodGlucoseDevice.mSensor>
	//*  18   42:invokevirtual   #58  <Method int Sensor.getType()>
	//*  19   45:icmpne          27
		{
			Bundle bundle = new Bundle();
	//   20   48:new             #63  <Class Bundle>
	//   21   51:dup             
	//   22   52:invokespecial   #64  <Method void Bundle()>
	//   23   55:astore_2        
			bundle.putInt("glucose_sensor_state", (int)sensorevent.values[0]);
	//   24   56:aload_2         
	//   25   57:ldc1            #66  <String "glucose_sensor_state">
	//   26   59:aload_1         
	//   27   60:getfield        #70  <Field float[] SensorEvent.values>
	//   28   63:iconst_0        
	//   29   64:faload          
	//   30   65:f2i             
	//   31   66:invokevirtual   #74  <Method void Bundle.putInt(String, int)>
			bundle.putInt("glucose_error_detail", (int)sensorevent.values[1]);
	//   32   69:aload_2         
	//   33   70:ldc1            #76  <String "glucose_error_detail">
	//   34   72:aload_1         
	//   35   73:getfield        #70  <Field float[] SensorEvent.values>
	//   36   76:iconst_1        
	//   37   77:faload          
	//   38   78:f2i             
	//   39   79:invokevirtual   #74  <Method void Bundle.putInt(String, int)>
			bundle.putFloat("glucose", sensorevent.values[4]);
	//   40   82:aload_2         
	//   41   83:ldc1            #78  <String "glucose">
	//   42   85:aload_1         
	//   43   86:getfield        #70  <Field float[] SensorEvent.values>
	//   44   89:iconst_4        
	//   45   90:faload          
	//   46   91:invokevirtual   #82  <Method void Bundle.putFloat(String, float)>
			bundle.putString("glucose_unit", "MGDL");
	//   47   94:aload_2         
	//   48   95:ldc1            #84  <String "glucose_unit">
	//   49   97:ldc1            #86  <String "MGDL">
	//   50   99:invokevirtual   #90  <Method void Bundle.putString(String, String)>
			bundle.putString("sample_type", "WHOLE_BLOOD");
	//   51  102:aload_2         
	//   52  103:ldc1            #92  <String "sample_type">
	//   53  105:ldc1            #94  <String "WHOLE_BLOOD">
	//   54  107:invokevirtual   #90  <Method void Bundle.putString(String, String)>
			sensorevent = ((SensorEvent) (new SensorData(128, bundle)));
	//   55  110:new             #96  <Class SensorData>
	//   56  113:dup             
	//   57  114:sipush          128
	//   58  117:aload_2         
	//   59  118:invokespecial   #99  <Method void SensorData(int, Bundle)>
	//   60  121:astore_1        
			invokeDeviceDataCallback(((SensorData) (sensorevent)));
	//   61  122:aload_0         
	//   62  123:getfield        #14  <Field SensorAndroidBloodGlucoseDevice this$0>
	//   63  126:aload_1         
	//   64  127:invokevirtual   #103 <Method void SensorAndroidBloodGlucoseDevice.invokeDeviceDataCallback(SensorData)>
			return;
	//   65  130:return          
		}
	}

	final SensorAndroidBloodGlucoseDevice this$0;

	SensorAndroidBloodGlucoseDevice$1()
	{
		this$0 = SensorAndroidBloodGlucoseDevice.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field SensorAndroidBloodGlucoseDevice this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
