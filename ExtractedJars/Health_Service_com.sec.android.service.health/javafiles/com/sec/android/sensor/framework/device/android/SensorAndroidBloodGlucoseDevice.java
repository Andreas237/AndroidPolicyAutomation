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

public class SensorAndroidBloodGlucoseDevice extends SensorAndroidDevice
{

	public SensorAndroidBloodGlucoseDevice(Context context, boolean flag)
	{
		super(context, 128);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:sipush          128
	//    3    5:invokespecial   #21  <Method void SensorAndroidDevice(Context, int)>
		mListener = new SensorEventListener() {

			public void onAccuracyChanged(Sensor sensor, int i)
			{
				LOG.i(SensorAndroidBloodGlucoseDevice.TAG, "onAccuracyChanged()");
			//    0    0:invokestatic    #24  <Method Class SensorAndroidBloodGlucoseDevice.access$000()>
			//    1    3:ldc1            #26  <String "onAccuracyChanged()">
			//    2    5:invokestatic    #32  <Method void LOG.i(Class, String)>
				if(sensor == null)
			//*   3    8:aload_1         
			//*   4    9:ifnonnull       20
					LOG.w(SensorAndroidBloodGlucoseDevice.TAG, "onAccuracyChanged() Sensor is null");
			//    5   12:invokestatic    #24  <Method Class SensorAndroidBloodGlucoseDevice.access$000()>
			//    6   15:ldc1            #34  <String "onAccuracyChanged() Sensor is null">
			//    7   17:invokestatic    #37  <Method void LOG.w(Class, String)>
			//    8   20:return          
			}

			public void onSensorChanged(SensorEvent sensorevent)
			{
				LOG.i(SensorAndroidBloodGlucoseDevice.TAG, "onSensorChanged()");
			//    0    0:invokestatic    #24  <Method Class SensorAndroidBloodGlucoseDevice.access$000()>
			//    1    3:ldc1            #41  <String "onSensorChanged()">
			//    2    5:invokestatic    #32  <Method void LOG.i(Class, String)>
				if(sensorevent == null || sensorevent.sensor == null)
			//*   3    8:aload_1         
			//*   4    9:ifnull          19
			//*   5   12:aload_1         
			//*   6   13:getfield        #47  <Field Sensor SensorEvent.sensor>
			//*   7   16:ifnonnull       28
					LOG.e(SensorAndroidBloodGlucoseDevice.TAG, "Sensor Event is null !!!");
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
;
	//    4    8:aload_0         
	//    5    9:new             #6   <Class SensorAndroidBloodGlucoseDevice$1>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #24  <Method void SensorAndroidBloodGlucoseDevice$1(SensorAndroidBloodGlucoseDevice)>
	//    9   17:putfield        #26  <Field SensorEventListener mListener>
		LOG.i(TAG, "SensorAndroidBloodGlucoseDevice()");
	//   10   20:getstatic       #15  <Field Class TAG>
	//   11   23:ldc1            #28  <String "SensorAndroidBloodGlucoseDevice()">
	//   12   25:invokestatic    #34  <Method void LOG.i(Class, String)>
		if(context == null)
	//*  13   28:aload_1         
	//*  14   29:ifnonnull       41
		{
			LOG.e(TAG, "SensorAndroidBloodGlucoseDevice() Context is null !!!");
	//   15   32:getstatic       #15  <Field Class TAG>
	//   16   35:ldc1            #36  <String "SensorAndroidBloodGlucoseDevice() Context is null !!!">
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
				mSensor = mSensorManager.getDefaultSensor(0x1001f);
	//   28   61:aload_0         
	//   29   62:aload_0         
	//   30   63:getfield        #53  <Field SensorManager mSensorManager>
	//   31   66:ldc1            #54  <Int 0x1001f>
	//   32   68:invokevirtual   #58  <Method Sensor SensorManager.getDefaultSensor(int)>
	//   33   71:putfield        #62  <Field Sensor mSensor>
				if(mSensor == null)
	//*  34   74:aload_0         
	//*  35   75:getfield        #62  <Field Sensor mSensor>
	//*  36   78:ifnonnull       40
				{
					LOG.e(TAG, "[SENSOR = BLOOD_GLUCOSE] is unsupported !!!");
	//   37   81:getstatic       #15  <Field Class TAG>
	//   38   84:ldc1            #64  <String "[SENSOR = BLOOD_GLUCOSE] is unsupported !!!">
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

	private static final Class TAG = com/sec/android/sensor/framework/device/android/SensorAndroidBloodGlucoseDevice;
	private SensorEventListener mListener;

	static 
	{
	//    0    0:ldc1            #2   <Class SensorAndroidBloodGlucoseDevice>
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
