// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.sensor.framework.device.android;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import com.samsung.android.sensor.data.SensorDeviceInfo;
import com.sec.android.service.health.util.LOG;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.sec.android.sensor.framework.device.android:
//			SensorAndroidHeartRateBioDevice, SensorAndroidHeartRateRawDevice, SensorAndroidPulseOximeterDevice, SensorAndroidDeviceInfoFactory, 
//			SensorAndroidDevice

public class SensorAndroidDeviceFactory
{

	public SensorAndroidDeviceFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	public static SensorAndroidDevice createDevice(Context context, int i)
	{
		LOG.i(TAG, "createDevice()");
	//    0    0:getstatic       #22  <Field Class TAG>
	//    1    3:ldc1            #30  <String "createDevice()">
	//    2    5:invokestatic    #36  <Method void LOG.i(Class, String)>
		if(context == null)
	//*   3    8:aload_0         
	//*   4    9:ifnonnull       22
		{
			LOG.e(TAG, "createDevice() Context is null !!!");
	//    5   12:getstatic       #22  <Field Class TAG>
	//    6   15:ldc1            #38  <String "createDevice() Context is null !!!">
	//    7   17:invokestatic    #41  <Method void LOG.e(Class, String)>
			return null;
	//    8   20:aconst_null     
	//    9   21:areturn         
		}
		switch(i)
	//*  10   22:iload_1         
		{
	//*  11   23:tableswitch     101 104: default 52
	//	               101 62
	//	               102 72
	//	               103 81
	//	               104 90
		default:
			LOG.e(TAG, "Unsupported device type !!!");
	//   12   52:getstatic       #22  <Field Class TAG>
	//   13   55:ldc1            #43  <String "Unsupported device type !!!">
	//   14   57:invokestatic    #41  <Method void LOG.e(Class, String)>
			return null;
	//   15   60:aconst_null     
	//   16   61:areturn         

		case 101: // 'e'
			return ((SensorAndroidDevice) (new SensorAndroidHeartRateBioDevice(context, 1)));
	//   17   62:new             #45  <Class SensorAndroidHeartRateBioDevice>
	//   18   65:dup             
	//   19   66:aload_0         
	//   20   67:iconst_1        
	//   21   68:invokespecial   #48  <Method void SensorAndroidHeartRateBioDevice(Context, int)>
	//   22   71:areturn         

		case 102: // 'f'
			return ((SensorAndroidDevice) (new SensorAndroidHeartRateRawDevice(context)));
	//   23   72:new             #50  <Class SensorAndroidHeartRateRawDevice>
	//   24   75:dup             
	//   25   76:aload_0         
	//   26   77:invokespecial   #53  <Method void SensorAndroidHeartRateRawDevice(Context)>
	//   27   80:areturn         

		case 103: // 'g'
			return ((SensorAndroidDevice) (new SensorAndroidPulseOximeterDevice(context)));
	//   28   81:new             #55  <Class SensorAndroidPulseOximeterDevice>
	//   29   84:dup             
	//   30   85:aload_0         
	//   31   86:invokespecial   #56  <Method void SensorAndroidPulseOximeterDevice(Context)>
	//   32   89:areturn         

		case 104: // 'h'
			return ((SensorAndroidDevice) (new SensorAndroidHeartRateBioDevice(context, 8)));
	//   33   90:new             #45  <Class SensorAndroidHeartRateBioDevice>
	//   34   93:dup             
	//   35   94:aload_0         
	//   36   95:bipush          8
	//   37   97:invokespecial   #48  <Method void SensorAndroidHeartRateBioDevice(Context, int)>
	//   38  100:areturn         
		}
	}

	public static SensorDeviceInfo getSupportedSensor(Context context, int i)
	{
		SensorManager sensormanager = (SensorManager)context.getSystemService("sensor");
	//    0    0:aload_0         
	//    1    1:ldc1            #60  <String "sensor">
	//    2    3:invokevirtual   #66  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #68  <Class SensorManager>
	//    4    9:astore_2        
		if(sensormanager != null)
	//*   5   10:aload_2         
	//*   6   11:ifnull          106
		{
			if((i & 1) != 0 && sensormanager.getDefaultSensor(0x1001a) != null)
	//*   7   14:iload_1         
	//*   8   15:iconst_1        
	//*   9   16:iand            
	//*  10   17:ifeq            35
	//*  11   20:aload_2         
	//*  12   21:ldc1            #13  <Int 0x1001a>
	//*  13   23:invokevirtual   #72  <Method android.hardware.Sensor SensorManager.getDefaultSensor(int)>
	//*  14   26:ifnull          35
				return SensorAndroidDeviceInfoFactory.createDeviceInfo(101);
	//   15   29:bipush          101
	//   16   31:invokestatic    #78  <Method SensorDeviceInfo SensorAndroidDeviceInfoFactory.createDeviceInfo(int)>
	//   17   34:areturn         
			if((i & 2) != 0 && sensormanager.getDefaultSensor(0x10019) != null)
	//*  18   35:iload_1         
	//*  19   36:iconst_2        
	//*  20   37:iand            
	//*  21   38:ifeq            56
	//*  22   41:aload_2         
	//*  23   42:ldc1            #15  <Int 0x10019>
	//*  24   44:invokevirtual   #72  <Method android.hardware.Sensor SensorManager.getDefaultSensor(int)>
	//*  25   47:ifnull          56
				return SensorAndroidDeviceInfoFactory.createDeviceInfo(102);
	//   26   50:bipush          102
	//   27   52:invokestatic    #78  <Method SensorDeviceInfo SensorAndroidDeviceInfoFactory.createDeviceInfo(int)>
	//   28   55:areturn         
			if((i & 4) != 0 && sensormanager.getDefaultSensor(0x1001a) != null && isPulseoximeterSupported(context))
	//*  29   56:iload_1         
	//*  30   57:iconst_4        
	//*  31   58:iand            
	//*  32   59:ifeq            84
	//*  33   62:aload_2         
	//*  34   63:ldc1            #13  <Int 0x1001a>
	//*  35   65:invokevirtual   #72  <Method android.hardware.Sensor SensorManager.getDefaultSensor(int)>
	//*  36   68:ifnull          84
	//*  37   71:aload_0         
	//*  38   72:invokestatic    #82  <Method boolean isPulseoximeterSupported(Context)>
	//*  39   75:ifeq            84
				return SensorAndroidDeviceInfoFactory.createDeviceInfo(103);
	//   40   78:bipush          103
	//   41   80:invokestatic    #78  <Method SensorDeviceInfo SensorAndroidDeviceInfoFactory.createDeviceInfo(int)>
	//   42   83:areturn         
			if((i & 8) != 0 && sensormanager.getDefaultSensor(0x1001a) != null)
	//*  43   84:iload_1         
	//*  44   85:bipush          8
	//*  45   87:iand            
	//*  46   88:ifeq            106
	//*  47   91:aload_2         
	//*  48   92:ldc1            #13  <Int 0x1001a>
	//*  49   94:invokevirtual   #72  <Method android.hardware.Sensor SensorManager.getDefaultSensor(int)>
	//*  50   97:ifnull          106
				return SensorAndroidDeviceInfoFactory.createDeviceInfo(104);
	//   51  100:bipush          104
	//   52  102:invokestatic    #78  <Method SensorDeviceInfo SensorAndroidDeviceInfoFactory.createDeviceInfo(int)>
	//   53  105:areturn         
		}
		return null;
	//   54  106:aconst_null     
	//   55  107:areturn         
	}

	public static List getSupportedSensorList(Context context)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #86  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #87  <Method void ArrayList()>
	//    3    7:astore_1        
		SensorManager sensormanager = (SensorManager)context.getSystemService("sensor");
	//    4    8:aload_0         
	//    5    9:ldc1            #60  <String "sensor">
	//    6   11:invokevirtual   #66  <Method Object Context.getSystemService(String)>
	//    7   14:checkcast       #68  <Class SensorManager>
	//    8   17:astore_2        
		if(sensormanager != null)
	//*   9   18:aload_2         
	//*  10   19:ifnull          95
		{
			if(sensormanager.getDefaultSensor(0x1001a) != null)
	//*  11   22:aload_2         
	//*  12   23:ldc1            #13  <Int 0x1001a>
	//*  13   25:invokevirtual   #72  <Method android.hardware.Sensor SensorManager.getDefaultSensor(int)>
	//*  14   28:ifnull          74
			{
				((List) (arraylist)).add(((Object) (SensorAndroidDeviceInfoFactory.createDeviceInfo(101))));
	//   15   31:aload_1         
	//   16   32:bipush          101
	//   17   34:invokestatic    #78  <Method SensorDeviceInfo SensorAndroidDeviceInfoFactory.createDeviceInfo(int)>
	//   18   37:invokeinterface #93  <Method boolean List.add(Object)>
	//   19   42:pop             
				((List) (arraylist)).add(((Object) (SensorAndroidDeviceInfoFactory.createDeviceInfo(104))));
	//   20   43:aload_1         
	//   21   44:bipush          104
	//   22   46:invokestatic    #78  <Method SensorDeviceInfo SensorAndroidDeviceInfoFactory.createDeviceInfo(int)>
	//   23   49:invokeinterface #93  <Method boolean List.add(Object)>
	//   24   54:pop             
				if(isPulseoximeterSupported(context))
	//*  25   55:aload_0         
	//*  26   56:invokestatic    #82  <Method boolean isPulseoximeterSupported(Context)>
	//*  27   59:ifeq            74
					((List) (arraylist)).add(((Object) (SensorAndroidDeviceInfoFactory.createDeviceInfo(103))));
	//   28   62:aload_1         
	//   29   63:bipush          103
	//   30   65:invokestatic    #78  <Method SensorDeviceInfo SensorAndroidDeviceInfoFactory.createDeviceInfo(int)>
	//   31   68:invokeinterface #93  <Method boolean List.add(Object)>
	//   32   73:pop             
			}
			if(sensormanager.getDefaultSensor(0x10019) != null)
	//*  33   74:aload_2         
	//*  34   75:ldc1            #15  <Int 0x10019>
	//*  35   77:invokevirtual   #72  <Method android.hardware.Sensor SensorManager.getDefaultSensor(int)>
	//*  36   80:ifnull          95
				((List) (arraylist)).add(((Object) (SensorAndroidDeviceInfoFactory.createDeviceInfo(102))));
	//   37   83:aload_1         
	//   38   84:bipush          102
	//   39   86:invokestatic    #78  <Method SensorDeviceInfo SensorAndroidDeviceInfoFactory.createDeviceInfo(int)>
	//   40   89:invokeinterface #93  <Method boolean List.add(Object)>
	//   41   94:pop             
		}
		return ((List) (arraylist));
	//   42   95:aload_1         
	//   43   96:areturn         
	}

	public static boolean isPulseoximeterSupported(Context context)
	{
		return context.getPackageManager().hasSystemFeature("com.sec.feature.spo2") || context.getPackageManager().hasSystemFeature("com.sec.feature.spo2zero");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #99  <Method PackageManager Context.getPackageManager()>
	//    2    4:ldc1            #101 <String "com.sec.feature.spo2">
	//    3    6:invokevirtual   #107 <Method boolean PackageManager.hasSystemFeature(String)>
	//    4    9:ifne            24
	//    5   12:aload_0         
	//    6   13:invokevirtual   #99  <Method PackageManager Context.getPackageManager()>
	//    7   16:ldc1            #109 <String "com.sec.feature.spo2zero">
	//    8   18:invokevirtual   #107 <Method boolean PackageManager.hasSystemFeature(String)>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public static boolean isSensorSupported(Context context, int i)
	{
label0:
		{
			boolean flag;
label1:
			{
				boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
				SensorManager sensormanager = (SensorManager)context.getSystemService("sensor");
	//    2    2:aload_0         
	//    3    3:ldc1            #60  <String "sensor">
	//    4    5:invokevirtual   #66  <Method Object Context.getSystemService(String)>
	//    5    8:checkcast       #68  <Class SensorManager>
	//    6   11:astore          4
				flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
				if(sensormanager == null)
					break label0;
	//    9   15:aload           4
	//   10   17:ifnull          156
				if((i & 1) != 0)
	//*  11   20:iload_1         
	//*  12   21:iconst_1        
	//*  13   22:iand            
	//*  14   23:ifeq            40
				{
					flag = flag1;
	//   15   26:iload_3         
	//   16   27:istore_2        
					if(sensormanager.getDefaultSensor(0x1001a) == null)
						break label1;
	//   17   28:aload           4
	//   18   30:ldc1            #13  <Int 0x1001a>
	//   19   32:invokevirtual   #72  <Method android.hardware.Sensor SensorManager.getDefaultSensor(int)>
	//   20   35:ifnull          154
					flag = true;
	//   21   38:iconst_1        
	//   22   39:istore_2        
				}
				if((i & 4) != 0)
	//*  23   40:iload_1         
	//*  24   41:iconst_4        
	//*  25   42:iand            
	//*  26   43:ifeq            69
				{
					flag = flag1;
	//   27   46:iload_3         
	//   28   47:istore_2        
					if(sensormanager.getDefaultSensor(0x1001a) == null)
						break label1;
	//   29   48:aload           4
	//   30   50:ldc1            #13  <Int 0x1001a>
	//   31   52:invokevirtual   #72  <Method android.hardware.Sensor SensorManager.getDefaultSensor(int)>
	//   32   55:ifnull          154
					flag = flag1;
	//   33   58:iload_3         
	//   34   59:istore_2        
					if(!isPulseoximeterSupported(context))
						break label1;
	//   35   60:aload_0         
	//   36   61:invokestatic    #82  <Method boolean isPulseoximeterSupported(Context)>
	//   37   64:ifeq            154
					flag = true;
	//   38   67:iconst_1        
	//   39   68:istore_2        
				}
				if((i & 8) != 0)
	//*  40   69:iload_1         
	//*  41   70:bipush          8
	//*  42   72:iand            
	//*  43   73:ifeq            90
				{
					flag = flag1;
	//   44   76:iload_3         
	//   45   77:istore_2        
					if(sensormanager.getDefaultSensor(0x1001a) == null)
						break label1;
	//   46   78:aload           4
	//   47   80:ldc1            #13  <Int 0x1001a>
	//   48   82:invokevirtual   #72  <Method android.hardware.Sensor SensorManager.getDefaultSensor(int)>
	//   49   85:ifnull          154
					flag = true;
	//   50   88:iconst_1        
	//   51   89:istore_2        
				}
				if((i & 2) != 0)
	//*  52   90:iload_1         
	//*  53   91:iconst_2        
	//*  54   92:iand            
	//*  55   93:ifeq            110
				{
					flag = flag1;
	//   56   96:iload_3         
	//   57   97:istore_2        
					if(sensormanager.getDefaultSensor(0x10019) == null)
						break label1;
	//   58   98:aload           4
	//   59  100:ldc1            #15  <Int 0x10019>
	//   60  102:invokevirtual   #72  <Method android.hardware.Sensor SensorManager.getDefaultSensor(int)>
	//   61  105:ifnull          154
					flag = true;
	//   62  108:iconst_1        
	//   63  109:istore_2        
				}
				if((i & 0x400) != 0)
	//*  64  110:iload_1         
	//*  65  111:sipush          1024
	//*  66  114:iand            
	//*  67  115:ifeq            132
				{
					flag = flag1;
	//   68  118:iload_3         
	//   69  119:istore_2        
					if(sensormanager.getDefaultSensor(0x1001e) == null)
						break label1;
	//   70  120:aload           4
	//   71  122:ldc1            #9   <Int 0x1001e>
	//   72  124:invokevirtual   #72  <Method android.hardware.Sensor SensorManager.getDefaultSensor(int)>
	//   73  127:ifnull          154
					flag = true;
	//   74  130:iconst_1        
	//   75  131:istore_2        
				}
				if((i & 0x80) != 0)
	//*  76  132:iload_1         
	//*  77  133:sipush          128
	//*  78  136:iand            
	//*  79  137:ifeq            154
				{
					flag = flag1;
	//   80  140:iload_3         
	//   81  141:istore_2        
					if(sensormanager.getDefaultSensor(0x1001f) != null)
	//*  82  142:aload           4
	//*  83  144:ldc1            #7   <Int 0x1001f>
	//*  84  146:invokevirtual   #72  <Method android.hardware.Sensor SensorManager.getDefaultSensor(int)>
	//*  85  149:ifnull          154
						flag = true;
	//   86  152:iconst_1        
	//   87  153:istore_2        
				}
			}
			return flag;
	//   88  154:iload_2         
	//   89  155:ireturn         
		}
		LOG.d(TAG, "isDeviceAvailable SensorManager is null");
	//   90  156:getstatic       #22  <Field Class TAG>
	//   91  159:ldc1            #113 <String "isDeviceAvailable SensorManager is null">
	//   92  161:invokestatic    #116 <Method void LOG.d(Class, String)>
		return false;
	//   93  164:iconst_0        
	//   94  165:ireturn         
	}

	public static final int SENSOR_ANDROID_BLOOD_GLUCOSE = 0x1001f;
	public static final int SENSOR_ANDROID_BODY_TEMPERATURE = 0x1001e;
	public static final int SENSOR_ANDROID_DATA_TYPE_BASE = 0x10000;
	public static final int SENSOR_ANDROID_HEART_RATE_BIO = 0x1001a;
	public static final int SENSOR_ANDROID_HEART_RATE_RAW = 0x10019;
	private static final Class TAG = com/sec/android/sensor/framework/device/android/SensorAndroidDeviceFactory;

	static 
	{
	//    0    0:ldc1            #2   <Class SensorAndroidDeviceFactory>
	//    1    2:putstatic       #22  <Field Class TAG>
	//*   2    5:return          
	}
}
