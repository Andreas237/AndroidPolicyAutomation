// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.sensor.framework.device.android;

import android.content.Context;
import android.hardware.*;
import android.os.Bundle;
import com.samsung.android.sensor.data.SensorData;
import com.sec.android.service.health.util.LOG;

// Referenced classes of package com.sec.android.sensor.framework.device.android:
//			SensorAndroidDevice

public class SensorAndroidBodyTemperatureDevice extends SensorAndroidDevice
{

	public SensorAndroidBodyTemperatureDevice(Context context)
	{
		super(context, 1024);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:sipush          1024
	//    3    5:invokespecial   #21  <Method void SensorAndroidDevice(Context, int)>
		mListener = new SensorEventListener() {

			public void onAccuracyChanged(Sensor sensor, int i)
			{
				LOG.i(SensorAndroidBodyTemperatureDevice.TAG, "onAccuracyChanged()");
			//    0    0:invokestatic    #24  <Method Class SensorAndroidBodyTemperatureDevice.access$000()>
			//    1    3:ldc1            #26  <String "onAccuracyChanged()">
			//    2    5:invokestatic    #32  <Method void LOG.i(Class, String)>
				if(sensor == null)
			//*   3    8:aload_1         
			//*   4    9:ifnonnull       20
					LOG.w(SensorAndroidBodyTemperatureDevice.TAG, "onAccuracyChanged() Sensor is null");
			//    5   12:invokestatic    #24  <Method Class SensorAndroidBodyTemperatureDevice.access$000()>
			//    6   15:ldc1            #34  <String "onAccuracyChanged() Sensor is null">
			//    7   17:invokestatic    #37  <Method void LOG.w(Class, String)>
			//    8   20:return          
			}

			public void onSensorChanged(SensorEvent sensorevent)
			{
				LOG.i(SensorAndroidBodyTemperatureDevice.TAG, "onSensorChanged()");
			//    0    0:invokestatic    #24  <Method Class SensorAndroidBodyTemperatureDevice.access$000()>
			//    1    3:ldc1            #41  <String "onSensorChanged()">
			//    2    5:invokestatic    #32  <Method void LOG.i(Class, String)>
				if(sensorevent == null || sensorevent.sensor == null)
			//*   3    8:aload_1         
			//*   4    9:ifnull          19
			//*   5   12:aload_1         
			//*   6   13:getfield        #47  <Field Sensor SensorEvent.sensor>
			//*   7   16:ifnonnull       28
					LOG.e(SensorAndroidBodyTemperatureDevice.TAG, "Sensor Event is null !!!");
			//    8   19:invokestatic    #24  <Method Class SensorAndroidBodyTemperatureDevice.access$000()>
			//    9   22:ldc1            #49  <String "Sensor Event is null !!!">
			//   10   24:invokestatic    #52  <Method void LOG.e(Class, String)>
				else
			//*  11   27:return          
				if(sensorevent.sensor.getType() == mSensor.getType())
			//*  12   28:aload_1         
			//*  13   29:getfield        #47  <Field Sensor SensorEvent.sensor>
			//*  14   32:invokevirtual   #58  <Method int Sensor.getType()>
			//*  15   35:aload_0         
			//*  16   36:getfield        #14  <Field SensorAndroidBodyTemperatureDevice this$0>
			//*  17   39:getfield        #61  <Field Sensor SensorAndroidBodyTemperatureDevice.mSensor>
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
					LOG.d(SensorAndroidBodyTemperatureDevice.TAG, (new StringBuilder()).append("infraredValue = ").append(f).append(" ledValue = ").append(f1).toString());
			//   30   62:invokestatic    #24  <Method Class SensorAndroidBodyTemperatureDevice.access$000()>
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
					Bundle bundle = new Bundle();
			//   44   96:new             #88  <Class Bundle>
			//   45   99:dup             
			//   46  100:invokespecial   #89  <Method void Bundle()>
			//   47  103:astore          4
					bundle.putFloat("temperature", sensorevent.values[3]);
			//   48  105:aload           4
			//   49  107:ldc1            #91  <String "temperature">
			//   50  109:aload_1         
			//   51  110:getfield        #65  <Field float[] SensorEvent.values>
			//   52  113:iconst_3        
			//   53  114:faload          
			//   54  115:invokevirtual   #95  <Method void Bundle.putFloat(String, float)>
					bundle.putString("temperature_unit", "CELCIUS");
			//   55  118:aload           4
			//   56  120:ldc1            #97  <String "temperature_unit">
			//   57  122:ldc1            #99  <String "CELCIUS">
			//   58  124:invokevirtual   #103 <Method void Bundle.putString(String, String)>
					bundle.putInt("temperature_type", 0x11171);
			//   59  127:aload           4
			//   60  129:ldc1            #105 <String "temperature_type">
			//   61  131:ldc1            #106 <Int 0x11171>
			//   62  133:invokevirtual   #110 <Method void Bundle.putInt(String, int)>
					sensorevent = ((SensorEvent) (new SensorData(128, bundle)));
			//   63  136:new             #112 <Class SensorData>
			//   64  139:dup             
			//   65  140:sipush          128
			//   66  143:aload           4
			//   67  145:invokespecial   #115 <Method void SensorData(int, Bundle)>
			//   68  148:astore_1        
					invokeDeviceDataCallback(((SensorData) (sensorevent)));
			//   69  149:aload_0         
			//   70  150:getfield        #14  <Field SensorAndroidBodyTemperatureDevice this$0>
			//   71  153:aload_1         
			//   72  154:invokevirtual   #119 <Method void SensorAndroidBodyTemperatureDevice.invokeDeviceDataCallback(SensorData)>
					return;
			//   73  157:return          
				}
			}

			final SensorAndroidBodyTemperatureDevice this$0;

			
			{
				this$0 = SensorAndroidBodyTemperatureDevice.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SensorAndroidBodyTemperatureDevice this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    4    8:aload_0         
	//    5    9:new             #6   <Class SensorAndroidBodyTemperatureDevice$1>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #24  <Method void SensorAndroidBodyTemperatureDevice$1(SensorAndroidBodyTemperatureDevice)>
	//    9   17:putfield        #26  <Field SensorEventListener mListener>
		LOG.i(TAG, "SensorAndroidBodyTemperatureDevice()");
	//   10   20:getstatic       #15  <Field Class TAG>
	//   11   23:ldc1            #28  <String "SensorAndroidBodyTemperatureDevice()">
	//   12   25:invokestatic    #34  <Method void LOG.i(Class, String)>
		if(context == null)
	//*  13   28:aload_1         
	//*  14   29:ifnonnull       41
		{
			LOG.e(TAG, "SensorAndroidBodyTemperatureDevice() Context is null !!!");
	//   15   32:getstatic       #15  <Field Class TAG>
	//   16   35:ldc1            #36  <String "SensorAndroidBodyTemperatureDevice() Context is null !!!">
	//   17   37:invokestatic    #39  <Method void LOG.e(Class, String)>
		} else
	//*  18   40:return          
		{
			mSensorManager = (SensorManager)context.getSystemService("sensor");
	//   19   41:aload_0         
	//   20   42:aload_1         
	//   21   43:ldc1            #41  <String "sensor">
	//   22   45:invokevirtual   #47  <Method Object Context.getSystemService(String)>
	//   23   48:checkcast       #49  <Class SensorManager>
	//   24   51:putfield        #53  <Field SensorManager mSensorManager>
			if(mSensorManager != null)
	//*  25   54:aload_0         
	//*  26   55:getfield        #53  <Field SensorManager mSensorManager>
	//*  27   58:ifnull          40
			{
				mSensor = mSensorManager.getDefaultSensor(0x1001e);
	//   28   61:aload_0         
	//   29   62:aload_0         
	//   30   63:getfield        #53  <Field SensorManager mSensorManager>
	//   31   66:ldc1            #54  <Int 0x1001e>
	//   32   68:invokevirtual   #58  <Method Sensor SensorManager.getDefaultSensor(int)>
	//   33   71:putfield        #62  <Field Sensor mSensor>
				if(mSensor == null)
	//*  34   74:aload_0         
	//*  35   75:getfield        #62  <Field Sensor mSensor>
	//*  36   78:ifnonnull       40
				{
					LOG.e(TAG, "[SENSOR = Body Temperature] is unsupported !!!");
	//   37   81:getstatic       #15  <Field Class TAG>
	//   38   84:ldc1            #64  <String "[SENSOR = Body Temperature] is unsupported !!!">
	//   39   86:invokestatic    #39  <Method void LOG.e(Class, String)>
					return;
	//   40   89:return          
				}
			}
		}
	}

	protected void startSensor()
	{
		LOG.i(TAG, "startSensor()");
	//    0    0:getstatic       #15  <Field Class TAG>
	//    1    3:ldc1            #69  <String "startSensor()">
	//    2    5:invokestatic    #34  <Method void LOG.i(Class, String)>
		mSensorManager.registerListener(mListener, mSensor, 0);
	//    3    8:aload_0         
	//    4    9:getfield        #53  <Field SensorManager mSensorManager>
	//    5   12:aload_0         
	//    6   13:getfield        #26  <Field SensorEventListener mListener>
	//    7   16:aload_0         
	//    8   17:getfield        #62  <Field Sensor mSensor>
	//    9   20:iconst_0        
	//   10   21:invokevirtual   #73  <Method boolean SensorManager.registerListener(SensorEventListener, Sensor, int)>
	//   11   24:pop             
	//   12   25:return          
	}

	protected void stopSensor()
	{
		LOG.i(TAG, "stopSensor()");
	//    0    0:getstatic       #15  <Field Class TAG>
	//    1    3:ldc1            #76  <String "stopSensor()">
	//    2    5:invokestatic    #34  <Method void LOG.i(Class, String)>
		mSensorManager.unregisterListener(mListener, mSensor);
	//    3    8:aload_0         
	//    4    9:getfield        #53  <Field SensorManager mSensorManager>
	//    5   12:aload_0         
	//    6   13:getfield        #26  <Field SensorEventListener mListener>
	//    7   16:aload_0         
	//    8   17:getfield        #62  <Field Sensor mSensor>
	//    9   20:invokevirtual   #80  <Method void SensorManager.unregisterListener(SensorEventListener, Sensor)>
	//   10   23:return          
	}

	public void uninitialize()
	{
	//    0    0:return          
	}

	private static final Class TAG = com/sec/android/sensor/framework/device/android/SensorAndroidBodyTemperatureDevice;
	private SensorEventListener mListener;

	static 
	{
	//    0    0:ldc1            #2   <Class SensorAndroidBodyTemperatureDevice>
	//    1    2:putstatic       #15  <Field Class TAG>
	//*   2    5:return          
	}


/*
	static Class access$000()
	{
		return TAG;
	//    0    0:getstatic       #15  <Field Class TAG>
	//    1    3:areturn         
	}

*/
}
