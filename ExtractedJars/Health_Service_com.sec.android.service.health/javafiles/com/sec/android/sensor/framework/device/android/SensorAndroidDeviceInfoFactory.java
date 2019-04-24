// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.sensor.framework.device.android;

import com.samsung.android.sensor.data.SensorAndroidDeviceInfo;
import com.samsung.android.sensor.data.SensorDeviceInfo;
import com.sec.android.sensor.framework.SensorObjectIdGenerator;
import com.sec.android.service.health.util.LOG;

public class SensorAndroidDeviceInfoFactory
{

	public SensorAndroidDeviceInfoFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static SensorDeviceInfo createDeviceInfo(int i)
	{
		LOG.i(TAG, "createDeviceInfo()");
	//    0    0:getstatic       #11  <Field Class TAG>
	//    1    3:ldc1            #19  <String "createDeviceInfo()">
	//    2    5:invokestatic    #25  <Method void LOG.i(Class, String)>
		i;
	//    3    8:iload_0         
		JVM INSTR tableswitch 101 104: default 40
	//	               101 50
	//	               102 75
	//	               103 80
	//	               104 85;
	//    4    9:tableswitch     101 104: default 40
	//	               101 50
	//	               102 75
	//	               103 80
	//	               104 85
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		LOG.e(TAG, "Unsupported device type !!!");
	//    5   40:getstatic       #11  <Field Class TAG>
	//    6   43:ldc1            #27  <String "Unsupported device type !!!">
	//    7   45:invokestatic    #30  <Method void LOG.e(Class, String)>
		return null;
	//    8   48:aconst_null     
	//    9   49:areturn         
_L2:
		int j = 1;
	//   10   50:iconst_1        
	//   11   51:istore_1        
_L7:
		return ((SensorDeviceInfo) (new SensorAndroidDeviceInfo(SensorObjectIdGenerator.getInstance().generateId(j), j, com.samsung.android.sensor.data.SensorTypes.SensorConnectionType.SENSOR_CONNECTION_TYPE_ANDROID_DEFAULT, ((String) (null)), i, ((String) (null)), 0)));
	//   12   52:new             #32  <Class SensorAndroidDeviceInfo>
	//   13   55:dup             
	//   14   56:invokestatic    #38  <Method SensorObjectIdGenerator SensorObjectIdGenerator.getInstance()>
	//   15   59:iload_1         
	//   16   60:invokevirtual   #42  <Method String SensorObjectIdGenerator.generateId(int)>
	//   17   63:iload_1         
	//   18   64:getstatic       #48  <Field com.samsung.android.sensor.data.SensorTypes$SensorConnectionType com.samsung.android.sensor.data.SensorTypes$SensorConnectionType.SENSOR_CONNECTION_TYPE_ANDROID_DEFAULT>
	//   19   67:aconst_null     
	//   20   68:iload_0         
	//   21   69:aconst_null     
	//   22   70:iconst_0        
	//   23   71:invokespecial   #51  <Method void SensorAndroidDeviceInfo(String, int, com.samsung.android.sensor.data.SensorTypes$SensorConnectionType, String, int, String, int)>
	//   24   74:areturn         
_L3:
		j = 2;
	//   25   75:iconst_2        
	//   26   76:istore_1        
		continue; /* Loop/switch isn't completed */
	//   27   77:goto            52
_L4:
		j = 4;
	//   28   80:iconst_4        
	//   29   81:istore_1        
		continue; /* Loop/switch isn't completed */
	//   30   82:goto            52
_L5:
		j = 8;
	//   31   85:bipush          8
	//   32   87:istore_1        
		if(true) goto _L7; else goto _L6
	//   33   88:goto            52
_L6:
	}

	private static final Class TAG = com/sec/android/sensor/framework/device/android/SensorAndroidDeviceInfoFactory;

	static 
	{
	//    0    0:ldc1            #2   <Class SensorAndroidDeviceInfoFactory>
	//    1    2:putstatic       #11  <Field Class TAG>
	//*   2    5:return          
	}
}
