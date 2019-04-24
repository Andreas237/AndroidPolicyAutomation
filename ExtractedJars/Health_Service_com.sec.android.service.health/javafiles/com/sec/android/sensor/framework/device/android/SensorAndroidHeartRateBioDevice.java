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

public class SensorAndroidHeartRateBioDevice extends SensorAndroidDevice
{

	public SensorAndroidHeartRateBioDevice(Context context, int i)
	{
		super(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #20  <Method void SensorAndroidDevice(Context, int)>
		mListener = new SensorEventListener() {

			public void onAccuracyChanged(Sensor sensor, int j)
			{
				LOG.i(SensorAndroidHeartRateBioDevice.TAG, "onAccuracyChanged()");
			//    0    0:invokestatic    #24  <Method Class SensorAndroidHeartRateBioDevice.access$000()>
			//    1    3:ldc1            #26  <String "onAccuracyChanged()">
			//    2    5:invokestatic    #32  <Method void LOG.i(Class, String)>
				if(sensor == null)
			//*   3    8:aload_1         
			//*   4    9:ifnonnull       20
					LOG.w(SensorAndroidHeartRateBioDevice.TAG, "onAccuracyChanged() Sensor is null");
			//    5   12:invokestatic    #24  <Method Class SensorAndroidHeartRateBioDevice.access$000()>
			//    6   15:ldc1            #34  <String "onAccuracyChanged() Sensor is null">
			//    7   17:invokestatic    #37  <Method void LOG.w(Class, String)>
			//    8   20:return          
			}

			public void onSensorChanged(SensorEvent sensorevent)
			{
				LOG.i(SensorAndroidHeartRateBioDevice.TAG, "onSensorChanged()");
			//    0    0:invokestatic    #24  <Method Class SensorAndroidHeartRateBioDevice.access$000()>
			//    1    3:ldc1            #41  <String "onSensorChanged()">
			//    2    5:invokestatic    #32  <Method void LOG.i(Class, String)>
				if(sensorevent == null || sensorevent.sensor == null)
			//*   3    8:aload_1         
			//*   4    9:ifnull          19
			//*   5   12:aload_1         
			//*   6   13:getfield        #47  <Field Sensor SensorEvent.sensor>
			//*   7   16:ifnonnull       28
					LOG.e(SensorAndroidHeartRateBioDevice.TAG, "Sensor Event is null !!!");
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
					int j = (int)sensorevent.values[0];
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
					LOG.d(SensorAndroidHeartRateBioDevice.TAG, (new StringBuilder()).append("Heart Rate = ").append(j).append(" interval = ").append(l).append(" SNR = ").append(f).toString());
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
					((Bundle) (sensorevent)).putInt("heart_rate", j);
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
					sensorevent = ((SensorEvent) (new SensorData(
// JavaClassFileOutputException: get_constant: invalid tag

			final SensorAndroidHeartRateBioDevice this$0;

			
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
;
	//    4    6:aload_0         
	//    5    7:new             #6   <Class SensorAndroidHeartRateBioDevice$1>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:invokespecial   #23  <Method void SensorAndroidHeartRateBioDevice$1(SensorAndroidHeartRateBioDevice)>
	//    9   15:putfield        #25  <Field SensorEventListener mListener>
		if(i != 1 && i != 8)
	//*  10   18:iload_2         
	//*  11   19:iconst_1        
	//*  12   20:icmpeq          54
	//*  13   23:iload_2         
	//*  14   24:bipush          8
	//*  15   26:icmpeq          54
			LOG.e(TAG, (new StringBuilder()).append("SensorAndroidHeartRateBioDevice incorrect dataType : ").append(i).toString());
	//   16   29:getstatic       #15  <Field Class TAG>
	//   17   32:new             #27  <Class StringBuilder>
	//   18   35:dup             
	//   19   36:invokespecial   #29  <Method void StringBuilder()>
	//   20   39:ldc1            #31  <String "SensorAndroidHeartRateBioDevice incorrect dataType : ">
	//   21   41:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   22   44:iload_2         
	//   23   45:invokevirtual   #38  <Method StringBuilder StringBuilder.append(int)>
	//   24   48:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   25   51:invokestatic    #48  <Method void LOG.e(Class, String)>
		LOG.i(TAG, "SensorAndroidHeartRateBioDevice()");
	//   26   54:getstatic       #15  <Field Class TAG>
	//   27   57:ldc1            #50  <String "SensorAndroidHeartRateBioDevice()">
	//   28   59:invokestatic    #53  <Method void LOG.i(Class, String)>
		if(context == null)
	//*  29   62:aload_1         
	//*  30   63:ifnonnull       75
		{
			LOG.e(TAG, "SensorAndroidHeartRateBioDevice() Context is null !!!");
	//   31   66:getstatic       #15  <Field Class TAG>
	//   32   69:ldc1            #55  <String "SensorAndroidHeartRateBioDevice() Context is null !!!">
	//   33   71:invokestatic    #48  <Method void LOG.e(Class, String)>
		} else
	//*  34   74:return          
		{
			mSensorManager = (SensorManager)context.getSystemService("sensor");
	//   35   75:aload_0         
	//   36   76:aload_1         
	//   37   77:ldc1            #57  <String "sensor">
	//   38   79:invokevirtual   #63  <Method Object Context.getSystemService(String)>
	//   39   82:checkcast       #65  <Class SensorManager>
	//   40   85:putfield        #69  <Field SensorManager mSensorManager>
			if(mSensorManager != null)
	//*  41   88:aload_0         
	//*  42   89:getfield        #69  <Field SensorManager mSensorManager>
	//*  43   92:ifnull          74
			{
				mSensor = mSensorManager.getDefaultSensor(0x1001a);
	//   44   95:aload_0         
	//   45   96:aload_0         
	//   46   97:getfield        #69  <Field SensorManager mSensorManager>
	//   47  100:ldc1            #70  <Int 0x1001a>
	//   48  102:invokevirtual   #74  <Method Sensor SensorManager.getDefaultSensor(int)>
	//   49  105:putfield        #78  <Field Sensor mSensor>
				if(mSensor == null)
	//*  50  108:aload_0         
	//*  51  109:getfield        #78  <Field Sensor mSensor>
	//*  52  112:ifnonnull       74
				{
					LOG.e(TAG, "[SENSOR = HEART_RATE_BIO] is unsupported !!!");
	//   53  115:getstatic       #15  <Field Class TAG>
	//   54  118:ldc1            #80  <String "[SENSOR = HEART_RATE_BIO] is unsupported !!!">
	//   55  120:invokestatic    #48  <Method void LOG.e(Class, String)>
					return;
	//   56  123:return          
				}
			}
		}
	}

	protected void startSensor()
	{
		LOG.i(TAG, "startSensor()");
	//    0    0:getstatic       #15  <Field Class TAG>
	//    1    3:ldc1            #91  <String "startSensor()">
	//    2    5:invokestatic    #53  <Method void LOG.i(Class, String)>
		mSensorManager.registerListener(mListener, mSensor, 3);
	//    3    8:aload_0         
	//    4    9:getfield        #69  <Field SensorManager mSensorManager>
	//    5   12:aload_0         
	//    6   13:getfield        #25  <Field SensorEventListener mListener>
	//    7   16:aload_0         
	//    8   17:getfield        #78  <Field Sensor mSensor>
	//    9   20:iconst_3        
	//   10   21:invokevirtual   #95  <Method boolean SensorManager.registerListener(SensorEventListener, Sensor, int)>
	//   11   24:pop             
	//   12   25:return          
	}

	protected void stopSensor()
	{
		LOG.i(TAG, "stopSensor()");
	//    0    0:getstatic       #15  <Field Class TAG>
	//    1    3:ldc1            #98  <String "stopSensor()">
	//    2    5:invokestatic    #53  <Method void LOG.i(Class, String)>
		mSensorManager.unregisterListener(mListener, mSensor);
	//    3    8:aload_0         
	//    4    9:getfield        #69  <Field SensorManager mSensorManager>
	//    5   12:aload_0         
	//    6   13:getfield        #25  <Field SensorEventListener mListener>
	//    7   16:aload_0         
	//    8   17:getfield        #78  <Field Sensor mSensor>
	//    9   20:invokevirtual   #102 <Method void SensorManager.unregisterListener(SensorEventListener, Sensor)>
	//   10   23:return          
	}

	public void uninitialize()
	{
	//    0    0:return          
	}

	private static final Class TAG = com/sec/android/sensor/framework/device/android/SensorAndroidHeartRateBioDevice;
	private SensorEventListener mListener;

	static 
	{
	//    0    0:ldc1            #2   <Class SensorAndroidHeartRateBioDevice>
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


/*
	static int access$100(SensorAndroidHeartRateBioDevice sensorandroidheartratebiodevice)
	{
		return sensorandroidheartratebiodevice.mDataType;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field int mDataType>
	//    2    4:ireturn         
	}

*/
}
