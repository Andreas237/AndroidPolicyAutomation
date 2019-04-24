// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.sensor.framework.device.android;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.samsung.android.sensor.data.SensorConnectorInfo;
import com.sec.android.sensor.framework.SensorObjectIdGenerator;
import com.sec.android.sensor.framework.device.SensorDevice;
import com.sec.android.service.health.util.LOG;

public abstract class SensorAndroidDevice extends SensorDevice
{

	public SensorAndroidDevice(Context context, int i)
	{
		super(context, SensorObjectIdGenerator.getInstance().generateId(i), i, com.samsung.android.sensor.data.SensorTypes.SensorConnectionType.SENSOR_CONNECTION_TYPE_ANDROID_DEFAULT, new String[0]);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #24  <Method SensorObjectIdGenerator SensorObjectIdGenerator.getInstance()>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #28  <Method String SensorObjectIdGenerator.generateId(int)>
	//    5    9:iload_2         
	//    6   10:getstatic       #34  <Field com.samsung.android.sensor.data.SensorTypes$SensorConnectionType com.samsung.android.sensor.data.SensorTypes$SensorConnectionType.SENSOR_CONNECTION_TYPE_ANDROID_DEFAULT>
	//    7   13:iconst_0        
	//    8   14:anewarray       String[]
	//    9   17:invokespecial   #39  <Method void SensorDevice(Context, String, int, com.samsung.android.sensor.data.SensorTypes$SensorConnectionType, String[])>
		mSensor = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #41  <Field Sensor mSensor>
		mSensorManager = null;
	//   13   25:aload_0         
	//   14   26:aconst_null     
	//   15   27:putfield        #43  <Field SensorManager mSensorManager>
		LOG.i(TAG, "SensorAndroidDevice()");
	//   16   30:getstatic       #15  <Field Class TAG>
	//   17   33:ldc1            #45  <String "SensorAndroidDevice()">
	//   18   35:invokestatic    #51  <Method void LOG.i(Class, String)>
		if(context == null)
	//*  19   38:aload_1         
	//*  20   39:ifnonnull       50
			LOG.w(TAG, "SensorAndroidDevice() Context is null");
	//   21   42:getstatic       #15  <Field Class TAG>
	//   22   45:ldc1            #53  <String "SensorAndroidDevice() Context is null">
	//   23   47:invokestatic    #56  <Method void LOG.w(Class, String)>
	//   24   50:return          
	}

	public void accessSensor(SensorConnectorInfo sensorconnectorinfo)
	{
		LOG.i(TAG, "accessSensor()");
	//    0    0:getstatic       #15  <Field Class TAG>
	//    1    3:ldc1            #60  <String "accessSensor()">
	//    2    5:invokestatic    #51  <Method void LOG.i(Class, String)>
		invokeDeviceAccessResultComeCallback(sensorconnectorinfo, com.samsung.android.sensor.data.SensorTypes.AccessResultCode.ACCESS_CODE_SUCCESS);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:getstatic       #66  <Field com.samsung.android.sensor.data.SensorTypes$AccessResultCode com.samsung.android.sensor.data.SensorTypes$AccessResultCode.ACCESS_CODE_SUCCESS>
	//    6   13:invokevirtual   #70  <Method void invokeDeviceAccessResultComeCallback(SensorConnectorInfo, com.samsung.android.sensor.data.SensorTypes$AccessResultCode)>
	//    7   16:return          
	}

	public void releaseSensor(SensorConnectorInfo sensorconnectorinfo)
	{
		LOG.i(TAG, "releaseSensor()");
	//    0    0:getstatic       #15  <Field Class TAG>
	//    1    3:ldc1            #73  <String "releaseSensor()">
	//    2    5:invokestatic    #51  <Method void LOG.i(Class, String)>
	//    3    8:return          
	}

	private static final Class TAG = com/sec/android/sensor/framework/device/android/SensorAndroidDevice;
	protected Sensor mSensor;
	protected SensorManager mSensorManager;

	static 
	{
	//    0    0:ldc1            #2   <Class SensorAndroidDevice>
	//    1    2:putstatic       #15  <Field Class TAG>
	//*   2    5:return          
	}
}
