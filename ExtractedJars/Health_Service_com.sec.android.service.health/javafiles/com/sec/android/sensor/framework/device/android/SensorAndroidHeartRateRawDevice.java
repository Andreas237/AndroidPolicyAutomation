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

public class SensorAndroidHeartRateRawDevice extends SensorAndroidDevice
{

	public SensorAndroidHeartRateRawDevice(Context context)
	{
		super(context, 2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_2        
	//    3    3:invokespecial   #21  <Method void SensorAndroidDevice(Context, int)>
		mListener = new SensorEventListener() {

			public void onAccuracyChanged(Sensor sensor, int i)
			{
				LOG.i(SensorAndroidHeartRateRawDevice.TAG, "onAccuracyChanged()");
			//    0    0:invokestatic    #24  <Method Class SensorAndroidHeartRateRawDevice.access$000()>
			//    1    3:ldc1            #26  <String "onAccuracyChanged()">
			//    2    5:invokestatic    #32  <Method void LOG.i(Class, String)>
				if(sensor == null)
			//*   3    8:aload_1         
			//*   4    9:ifnonnull       20
					LOG.w(SensorAndroidHeartRateRawDevice.TAG, "onAccuracyChanged() Sensor is null");
			//    5   12:invokestatic    #24  <Method Class SensorAndroidHeartRateRawDevice.access$000()>
			//    6   15:ldc1            #34  <String "onAccuracyChanged() Sensor is null">
			//    7   17:invokestatic    #37  <Method void LOG.w(Class, String)>
			//    8   20:return          
			}

			public void onSensorChanged(SensorEvent sensorevent)
			{
				LOG.i(SensorAndroidHeartRateRawDevice.TAG, "onSensorChanged()");
			//    0    0:invokestatic    #24  <Method Class SensorAndroidHeartRateRawDevice.access$000()>
			//    1    3:ldc1            #41  <String "onSensorChanged()">
			//    2    5:invokestatic    #32  <Method void LOG.i(Class, String)>
				if(sensorevent == null || sensorevent.sensor == null)
			//*   3    8:aload_1         
			//*   4    9:ifnull          19
			//*   5   12:aload_1         
			//*   6   13:getfield        #47  <Field Sensor SensorEvent.sensor>
			//*   7   16:ifnonnull       28
					LOG.e(SensorAndroidHeartRateRawDevice.TAG, "Sensor Event is null !!!");
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
					LOG.d(SensorAndroidHeartRateRawDevice.TAG, (new StringBuilder()).append("infraredValue = ").append(f).append(" ledValue = ").append(f1).toString());
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
;
	//    4    6:aload_0         
	//    5    7:new             #6   <Class SensorAndroidHeartRateRawDevice$1>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:invokespecial   #24  <Method void SensorAndroidHeartRateRawDevice$1(SensorAndroidHeartRateRawDevice)>
	//    9   15:putfield        #26  <Field SensorEventListener mListener>
		LOG.i(TAG, "SensorAndroidHeartRateRawDevice()");
	//   10   18:getstatic       #15  <Field Class TAG>
	//   11   21:ldc1            #28  <String "SensorAndroidHeartRateRawDevice()">
	//   12   23:invokestatic    #34  <Method void LOG.i(Class, String)>
		if(context == null)
	//*  13   26:aload_1         
	//*  14   27:ifnonnull       39
		{
			LOG.e(TAG, "SensorAndroidHeartRateRawDevice() Context is null !!!");
	//   15   30:getstatic       #15  <Field Class TAG>
	//   16   33:ldc1            #36  <String "SensorAndroidHeartRateRawDevice() Context is null !!!">
	//   17   35:invokestatic    #39  <Method void LOG.e(Class, String)>
		} else
	//*  18   38:return          
		{
			mSensorManager = (SensorManager)context.getSystemService("sensor");
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:ldc1            #41  <String "sensor">
	//   22   43:invokevirtual   #47  <Method Object Context.getSystemService(String)>
	//   23   46:checkcast       #49  <Class SensorManager>
	//   24   49:putfield        #53  <Field SensorManager mSensorManager>
			if(mSensorManager != null)
	//*  25   52:aload_0         
	//*  26   53:getfield        #53  <Field SensorManager mSensorManager>
	//*  27   56:ifnull          38
			{
				mSensor = mSensorManager.getDefaultSensor(0x10019);
	//   28   59:aload_0         
	//   29   60:aload_0         
	//   30   61:getfield        #53  <Field SensorManager mSensorManager>
	//   31   64:ldc1            #54  <Int 0x10019>
	//   32   66:invokevirtual   #58  <Method Sensor SensorManager.getDefaultSensor(int)>
	//   33   69:putfield        #62  <Field Sensor mSensor>
				if(mSensor == null)
	//*  34   72:aload_0         
	//*  35   73:getfield        #62  <Field Sensor mSensor>
	//*  36   76:ifnonnull       38
				{
					LOG.e(TAG, "[SENSOR = HEART_RATE_RAW] is unsupported !!!");
	//   37   79:getstatic       #15  <Field Class TAG>
	//   38   82:ldc1            #64  <String "[SENSOR = HEART_RATE_RAW] is unsupported !!!">
	//   39   84:invokestatic    #39  <Method void LOG.e(Class, String)>
					return;
	//   40   87:return          
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
		mSensorManager.registerListener(mListener, mSensor, 3);
	//    3    8:aload_0         
	//    4    9:getfield        #53  <Field SensorManager mSensorManager>
	//    5   12:aload_0         
	//    6   13:getfield        #26  <Field SensorEventListener mListener>
	//    7   16:aload_0         
	//    8   17:getfield        #62  <Field Sensor mSensor>
	//    9   20:iconst_3        
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

	private static final Class TAG = com/sec/android/sensor/framework/device/android/SensorAndroidHeartRateRawDevice;
	private SensorEventListener mListener;

	static 
	{
	//    0    0:ldc1            #2   <Class SensorAndroidHeartRateRawDevice>
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
