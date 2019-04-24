// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.sensor.framework;

import android.content.Context;
import com.samsung.android.sensor.data.*;
import com.sec.android.sensor.framework.device.SensorDevice;
import com.sec.android.sensor.framework.device.android.SensorAndroidDeviceFactory;
import com.sec.android.service.health.util.LOG;
import java.util.*;

public class SensorManager
{

	public SensorManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		mContext = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #27  <Field Context mContext>
	//    5    9:return          
	}

	private HashMap createSensorDevices(List list)
	{
		LOG.i(TAG, "createSensorDevices()");
	//    0    0:getstatic       #18  <Field Class TAG>
	//    1    3:ldc1            #31  <String "createSensorDevices()">
	//    2    5:invokestatic    #37  <Method void LOG.i(Class, String)>
		HashMap hashmap = new HashMap();
	//    3    8:new             #39  <Class HashMap>
	//    4   11:dup             
	//    5   12:invokespecial   #40  <Method void HashMap()>
	//    6   15:astore_2        
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext();)
	//*   7   16:aload_1         
	//*   8   17:invokeinterface #46  <Method Iterator List.iterator()>
	//*   9   22:astore_1        
	//*  10   23:aload_1         
	//*  11   24:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//*  12   29:ifeq            85
		{
			Object obj = ((Object) ((SensorAndroidDeviceInfo)(SensorDeviceInfo)((Iterator) (list)).next()));
	//   13   32:aload_1         
	//   14   33:invokeinterface #56  <Method Object Iterator.next()>
	//   15   38:checkcast       #58  <Class SensorDeviceInfo>
	//   16   41:checkcast       #60  <Class SensorAndroidDeviceInfo>
	//   17   44:astore_3        
			obj = ((Object) (SensorAndroidDeviceFactory.createDevice(mContext, ((SensorAndroidDeviceInfo) (obj)).getDeviceType())));
	//   18   45:aload_0         
	//   19   46:getfield        #27  <Field Context mContext>
	//   20   49:aload_3         
	//   21   50:invokevirtual   #64  <Method int SensorAndroidDeviceInfo.getDeviceType()>
	//   22   53:invokestatic    #70  <Method com.sec.android.sensor.framework.device.android.SensorAndroidDevice SensorAndroidDeviceFactory.createDevice(Context, int)>
	//   23   56:astore_3        
			if(obj != null)
	//*  24   57:aload_3         
	//*  25   58:ifnull          74
				hashmap.put(((Object) (((SensorDevice) (obj)).getId())), obj);
	//   26   61:aload_2         
	//   27   62:aload_3         
	//   28   63:invokevirtual   #76  <Method String SensorDevice.getId()>
	//   29   66:aload_3         
	//   30   67:invokevirtual   #80  <Method Object HashMap.put(Object, Object)>
	//   31   70:pop             
			else
	//*  32   71:goto            23
				LOG.w(TAG, "createSensorDevices() device is null!!");
	//   33   74:getstatic       #18  <Field Class TAG>
	//   34   77:ldc1            #82  <String "createSensorDevices() device is null!!">
	//   35   79:invokestatic    #85  <Method void LOG.w(Class, String)>
		}

	//*  36   82:goto            23
		return hashmap;
	//   37   85:aload_2         
	//   38   86:areturn         
	}

	public static SensorManager getInstance()
	{
		return mInstance;
	//    0    0:getstatic       #23  <Field SensorManager mInstance>
	//    1    3:areturn         
	}

	public void addListener(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
	{
		LOG.i(TAG, "addListener()");
	//    0    0:getstatic       #18  <Field Class TAG>
	//    1    3:ldc1            #93  <String "addListener()">
	//    2    5:invokestatic    #37  <Method void LOG.i(Class, String)>
		if(sensorconnectorinfo == null)
	//*   3    8:aload_1         
	//*   4    9:ifnonnull       21
		{
			LOG.e(TAG, "addListener() : SensorConnectorInfo is null !!!");
	//    5   12:getstatic       #18  <Field Class TAG>
	//    6   15:ldc1            #95  <String "addListener() : SensorConnectorInfo is null !!!">
	//    7   17:invokestatic    #98  <Method void LOG.e(Class, String)>
		} else
	//*   8   20:return          
		{
			if(sensordeviceinfo == null)
	//*   9   21:aload_2         
	//*  10   22:ifnonnull       34
			{
				LOG.e(TAG, "addListener() : SensorDeviceInfo is null !!!");
	//   11   25:getstatic       #18  <Field Class TAG>
	//   12   28:ldc1            #100 <String "addListener() : SensorDeviceInfo is null !!!">
	//   13   30:invokestatic    #98  <Method void LOG.e(Class, String)>
				return;
	//   14   33:return          
			}
			LOG.d(TAG, (new StringBuilder()).append("addListener() : ").append(sensorconnectorinfo.getName()).append(" : ").append(sensordeviceinfo.getId()).append(" : ").append(sensordeviceinfo.getDeviceName()).toString());
	//   15   34:getstatic       #18  <Field Class TAG>
	//   16   37:new             #102 <Class StringBuilder>
	//   17   40:dup             
	//   18   41:invokespecial   #103 <Method void StringBuilder()>
	//   19   44:ldc1            #105 <String "addListener() : ">
	//   20   46:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   21   49:aload_1         
	//   22   50:invokevirtual   #114 <Method String SensorConnectorInfo.getName()>
	//   23   53:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   24   56:ldc1            #116 <String " : ">
	//   25   58:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   26   61:aload_2         
	//   27   62:invokevirtual   #117 <Method String SensorDeviceInfo.getId()>
	//   28   65:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   29   68:ldc1            #116 <String " : ">
	//   30   70:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   31   73:aload_2         
	//   32   74:invokevirtual   #120 <Method String SensorDeviceInfo.getDeviceName()>
	//   33   77:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   34   80:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   35   83:invokestatic    #126 <Method void LOG.d(Class, String)>
			if(sensordeviceinfo.getConnectionType() == com.samsung.android.sensor.data.SensorTypes.SensorConnectionType.SENSOR_CONNECTION_TYPE_ANDROID_DEFAULT)
	//*  36   86:aload_2         
	//*  37   87:invokevirtual   #130 <Method com.samsung.android.sensor.data.SensorTypes$SensorConnectionType SensorDeviceInfo.getConnectionType()>
	//*  38   90:getstatic       #136 <Field com.samsung.android.sensor.data.SensorTypes$SensorConnectionType com.samsung.android.sensor.data.SensorTypes$SensorConnectionType.SENSOR_CONNECTION_TYPE_ANDROID_DEFAULT>
	//*  39   93:if_acmpne       135
			{
				if(mAndroidDeviceMap.containsKey(((Object) (sensordeviceinfo.getId()))))
	//*  40   96:aload_0         
	//*  41   97:getfield        #138 <Field HashMap mAndroidDeviceMap>
	//*  42  100:aload_2         
	//*  43  101:invokevirtual   #117 <Method String SensorDeviceInfo.getId()>
	//*  44  104:invokevirtual   #142 <Method boolean HashMap.containsKey(Object)>
	//*  45  107:ifeq            20
				{
					sensordeviceinfo = ((SensorDeviceInfo) ((SensorDevice)mAndroidDeviceMap.get(((Object) (sensordeviceinfo.getId())))));
	//   46  110:aload_0         
	//   47  111:getfield        #138 <Field HashMap mAndroidDeviceMap>
	//   48  114:aload_2         
	//   49  115:invokevirtual   #117 <Method String SensorDeviceInfo.getId()>
	//   50  118:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//   51  121:checkcast       #72  <Class SensorDevice>
	//   52  124:astore_2        
					if(sensordeviceinfo != null)
	//*  53  125:aload_2         
	//*  54  126:ifnull          20
					{
						((SensorDevice) (sensordeviceinfo)).addListener(sensorconnectorinfo);
	//   55  129:aload_2         
	//   56  130:aload_1         
	//   57  131:invokevirtual   #149 <Method void SensorDevice.addListener(SensorConnectorInfo)>
						return;
	//   58  134:return          
					}
				}
			} else
			{
				LOG.d(TAG, "Unsupported Connection Type");
	//   59  135:getstatic       #18  <Field Class TAG>
	//   60  138:ldc1            #151 <String "Unsupported Connection Type">
	//   61  140:invokestatic    #126 <Method void LOG.d(Class, String)>
				return;
	//   62  143:return          
			}
		}
	}

	public Map getAndroidDeviceMap()
	{
		return ((Map) (mAndroidDeviceMap));
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field HashMap mAndroidDeviceMap>
	//    2    4:areturn         
	}

	public void initialize(Context context)
	{
		LOG.i(TAG, "initialize()");
	//    0    0:getstatic       #18  <Field Class TAG>
	//    1    3:ldc1            #158 <String "initialize()">
	//    2    5:invokestatic    #37  <Method void LOG.i(Class, String)>
		if(context == null)
	//*   3    8:aload_1         
	//*   4    9:ifnonnull       21
		{
			LOG.e(TAG, "initialize() : Context is null !!!");
	//    5   12:getstatic       #18  <Field Class TAG>
	//    6   15:ldc1            #160 <String "initialize() : Context is null !!!">
	//    7   17:invokestatic    #98  <Method void LOG.e(Class, String)>
			return;
	//    8   20:return          
		} else
		{
			mContext = context;
	//    9   21:aload_0         
	//   10   22:aload_1         
	//   11   23:putfield        #27  <Field Context mContext>
			mAndroidDeviceMap = createSensorDevices(SensorAndroidDeviceFactory.getSupportedSensorList(context));
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:invokestatic    #164 <Method List SensorAndroidDeviceFactory.getSupportedSensorList(Context)>
	//   16   32:invokespecial   #166 <Method HashMap createSensorDevices(List)>
	//   17   35:putfield        #138 <Field HashMap mAndroidDeviceMap>
			return;
	//   18   38:return          
		}
	}

	public void releaseAccess(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
	{
		LOG.i(TAG, "releaseAccess()");
	//    0    0:getstatic       #18  <Field Class TAG>
	//    1    3:ldc1            #169 <String "releaseAccess()">
	//    2    5:invokestatic    #37  <Method void LOG.i(Class, String)>
		if(sensorconnectorinfo == null)
	//*   3    8:aload_1         
	//*   4    9:ifnonnull       21
		{
			LOG.e(TAG, "releaseAccess() : connectorInfo is null !!!");
	//    5   12:getstatic       #18  <Field Class TAG>
	//    6   15:ldc1            #171 <String "releaseAccess() : connectorInfo is null !!!">
	//    7   17:invokestatic    #98  <Method void LOG.e(Class, String)>
		} else
	//*   8   20:return          
		{
			if(sensordeviceinfo == null)
	//*   9   21:aload_2         
	//*  10   22:ifnonnull       34
			{
				LOG.e(TAG, "releaseAccess() : SensorDeviceInfo is null !!!");
	//   11   25:getstatic       #18  <Field Class TAG>
	//   12   28:ldc1            #173 <String "releaseAccess() : SensorDeviceInfo is null !!!">
	//   13   30:invokestatic    #98  <Method void LOG.e(Class, String)>
				return;
	//   14   33:return          
			}
			LOG.d(TAG, (new StringBuilder()).append("releaseAccess() : ").append(sensorconnectorinfo.getName()).append(" : ").append(sensordeviceinfo.getId()).append(" : ").append(sensordeviceinfo.getDeviceName()).toString());
	//   15   34:getstatic       #18  <Field Class TAG>
	//   16   37:new             #102 <Class StringBuilder>
	//   17   40:dup             
	//   18   41:invokespecial   #103 <Method void StringBuilder()>
	//   19   44:ldc1            #175 <String "releaseAccess() : ">
	//   20   46:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   21   49:aload_1         
	//   22   50:invokevirtual   #114 <Method String SensorConnectorInfo.getName()>
	//   23   53:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   24   56:ldc1            #116 <String " : ">
	//   25   58:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   26   61:aload_2         
	//   27   62:invokevirtual   #117 <Method String SensorDeviceInfo.getId()>
	//   28   65:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   29   68:ldc1            #116 <String " : ">
	//   30   70:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   31   73:aload_2         
	//   32   74:invokevirtual   #120 <Method String SensorDeviceInfo.getDeviceName()>
	//   33   77:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   34   80:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   35   83:invokestatic    #126 <Method void LOG.d(Class, String)>
			if(sensordeviceinfo.getConnectionType() == com.samsung.android.sensor.data.SensorTypes.SensorConnectionType.SENSOR_CONNECTION_TYPE_ANDROID_DEFAULT)
	//*  36   86:aload_2         
	//*  37   87:invokevirtual   #130 <Method com.samsung.android.sensor.data.SensorTypes$SensorConnectionType SensorDeviceInfo.getConnectionType()>
	//*  38   90:getstatic       #136 <Field com.samsung.android.sensor.data.SensorTypes$SensorConnectionType com.samsung.android.sensor.data.SensorTypes$SensorConnectionType.SENSOR_CONNECTION_TYPE_ANDROID_DEFAULT>
	//*  39   93:if_acmpne       136
			{
				if(mAndroidDeviceMap.containsKey(((Object) (sensordeviceinfo.getId()))))
	//*  40   96:aload_0         
	//*  41   97:getfield        #138 <Field HashMap mAndroidDeviceMap>
	//*  42  100:aload_2         
	//*  43  101:invokevirtual   #117 <Method String SensorDeviceInfo.getId()>
	//*  44  104:invokevirtual   #142 <Method boolean HashMap.containsKey(Object)>
	//*  45  107:ifeq            20
				{
					sensordeviceinfo = ((SensorDeviceInfo) ((SensorDevice)mAndroidDeviceMap.get(((Object) (sensordeviceinfo.getId())))));
	//   46  110:aload_0         
	//   47  111:getfield        #138 <Field HashMap mAndroidDeviceMap>
	//   48  114:aload_2         
	//   49  115:invokevirtual   #117 <Method String SensorDeviceInfo.getId()>
	//   50  118:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//   51  121:checkcast       #72  <Class SensorDevice>
	//   52  124:astore_2        
					if(sensordeviceinfo != null)
	//*  53  125:aload_2         
	//*  54  126:ifnull          20
					{
						((SensorDevice) (sensordeviceinfo)).release(sensorconnectorinfo, false);
	//   55  129:aload_2         
	//   56  130:aload_1         
	//   57  131:iconst_0        
	//   58  132:invokevirtual   #179 <Method void SensorDevice.release(SensorConnectorInfo, boolean)>
						return;
	//   59  135:return          
					}
				}
			} else
			{
				LOG.d(TAG, "Unsupported Connection Type");
	//   60  136:getstatic       #18  <Field Class TAG>
	//   61  139:ldc1            #151 <String "Unsupported Connection Type">
	//   62  141:invokestatic    #126 <Method void LOG.d(Class, String)>
				return;
	//   63  144:return          
			}
		}
	}

	public void removeListener(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
	{
		LOG.i(TAG, "removeListener()");
	//    0    0:getstatic       #18  <Field Class TAG>
	//    1    3:ldc1            #182 <String "removeListener()">
	//    2    5:invokestatic    #37  <Method void LOG.i(Class, String)>
		if(sensorconnectorinfo == null)
	//*   3    8:aload_1         
	//*   4    9:ifnonnull       21
		{
			LOG.e(TAG, "removeListener() : SensorConnectorInfo is null !!!");
	//    5   12:getstatic       #18  <Field Class TAG>
	//    6   15:ldc1            #184 <String "removeListener() : SensorConnectorInfo is null !!!">
	//    7   17:invokestatic    #98  <Method void LOG.e(Class, String)>
		} else
	//*   8   20:return          
		{
			if(sensordeviceinfo == null)
	//*   9   21:aload_2         
	//*  10   22:ifnonnull       34
			{
				LOG.e(TAG, "removeListener() : SensorDeviceInfo is null !!!");
	//   11   25:getstatic       #18  <Field Class TAG>
	//   12   28:ldc1            #186 <String "removeListener() : SensorDeviceInfo is null !!!">
	//   13   30:invokestatic    #98  <Method void LOG.e(Class, String)>
				return;
	//   14   33:return          
			}
			LOG.d(TAG, (new StringBuilder()).append("removeListener() : ").append(sensorconnectorinfo.getName()).append(" : ").append(sensordeviceinfo.getId()).append(" : ").append(sensordeviceinfo.getDeviceName()).toString());
	//   15   34:getstatic       #18  <Field Class TAG>
	//   16   37:new             #102 <Class StringBuilder>
	//   17   40:dup             
	//   18   41:invokespecial   #103 <Method void StringBuilder()>
	//   19   44:ldc1            #188 <String "removeListener() : ">
	//   20   46:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   21   49:aload_1         
	//   22   50:invokevirtual   #114 <Method String SensorConnectorInfo.getName()>
	//   23   53:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   24   56:ldc1            #116 <String " : ">
	//   25   58:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   26   61:aload_2         
	//   27   62:invokevirtual   #117 <Method String SensorDeviceInfo.getId()>
	//   28   65:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   29   68:ldc1            #116 <String " : ">
	//   30   70:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   31   73:aload_2         
	//   32   74:invokevirtual   #120 <Method String SensorDeviceInfo.getDeviceName()>
	//   33   77:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   34   80:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   35   83:invokestatic    #126 <Method void LOG.d(Class, String)>
			if(sensordeviceinfo.getConnectionType() == com.samsung.android.sensor.data.SensorTypes.SensorConnectionType.SENSOR_CONNECTION_TYPE_ANDROID_DEFAULT)
	//*  36   86:aload_2         
	//*  37   87:invokevirtual   #130 <Method com.samsung.android.sensor.data.SensorTypes$SensorConnectionType SensorDeviceInfo.getConnectionType()>
	//*  38   90:getstatic       #136 <Field com.samsung.android.sensor.data.SensorTypes$SensorConnectionType com.samsung.android.sensor.data.SensorTypes$SensorConnectionType.SENSOR_CONNECTION_TYPE_ANDROID_DEFAULT>
	//*  39   93:if_acmpne       135
			{
				if(mAndroidDeviceMap.containsKey(((Object) (sensordeviceinfo.getId()))))
	//*  40   96:aload_0         
	//*  41   97:getfield        #138 <Field HashMap mAndroidDeviceMap>
	//*  42  100:aload_2         
	//*  43  101:invokevirtual   #117 <Method String SensorDeviceInfo.getId()>
	//*  44  104:invokevirtual   #142 <Method boolean HashMap.containsKey(Object)>
	//*  45  107:ifeq            20
				{
					sensordeviceinfo = ((SensorDeviceInfo) ((SensorDevice)mAndroidDeviceMap.get(((Object) (sensordeviceinfo.getId())))));
	//   46  110:aload_0         
	//   47  111:getfield        #138 <Field HashMap mAndroidDeviceMap>
	//   48  114:aload_2         
	//   49  115:invokevirtual   #117 <Method String SensorDeviceInfo.getId()>
	//   50  118:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//   51  121:checkcast       #72  <Class SensorDevice>
	//   52  124:astore_2        
					if(sensordeviceinfo != null)
	//*  53  125:aload_2         
	//*  54  126:ifnull          20
					{
						((SensorDevice) (sensordeviceinfo)).removeListener(sensorconnectorinfo);
	//   55  129:aload_2         
	//   56  130:aload_1         
	//   57  131:invokevirtual   #190 <Method void SensorDevice.removeListener(SensorConnectorInfo)>
						return;
	//   58  134:return          
					}
				}
			} else
			{
				LOG.d(TAG, "Unsupported Connection Type");
	//   59  135:getstatic       #18  <Field Class TAG>
	//   60  138:ldc1            #151 <String "Unsupported Connection Type">
	//   61  140:invokestatic    #126 <Method void LOG.d(Class, String)>
				return;
	//   62  143:return          
			}
		}
	}

	public void requestAccess(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
	{
		LOG.i(TAG, "requestAccess()");
	//    0    0:getstatic       #18  <Field Class TAG>
	//    1    3:ldc1            #193 <String "requestAccess()">
	//    2    5:invokestatic    #37  <Method void LOG.i(Class, String)>
		if(sensorconnectorinfo == null)
	//*   3    8:aload_1         
	//*   4    9:ifnonnull       21
		{
			LOG.e(TAG, "requestAccess() : connectorInfo is null !!!");
	//    5   12:getstatic       #18  <Field Class TAG>
	//    6   15:ldc1            #195 <String "requestAccess() : connectorInfo is null !!!">
	//    7   17:invokestatic    #98  <Method void LOG.e(Class, String)>
		} else
	//*   8   20:return          
		{
			if(sensordeviceinfo == null)
	//*   9   21:aload_2         
	//*  10   22:ifnonnull       34
			{
				LOG.e(TAG, "requestAccess() : SensorDeviceInfo is null !!!");
	//   11   25:getstatic       #18  <Field Class TAG>
	//   12   28:ldc1            #197 <String "requestAccess() : SensorDeviceInfo is null !!!">
	//   13   30:invokestatic    #98  <Method void LOG.e(Class, String)>
				return;
	//   14   33:return          
			}
			LOG.d(TAG, (new StringBuilder()).append("requestAccess() : ").append(sensorconnectorinfo.getName()).append(" : ").append(sensordeviceinfo.getId()).append(" : ").append(sensordeviceinfo.getDeviceName()).toString());
	//   15   34:getstatic       #18  <Field Class TAG>
	//   16   37:new             #102 <Class StringBuilder>
	//   17   40:dup             
	//   18   41:invokespecial   #103 <Method void StringBuilder()>
	//   19   44:ldc1            #199 <String "requestAccess() : ">
	//   20   46:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   21   49:aload_1         
	//   22   50:invokevirtual   #114 <Method String SensorConnectorInfo.getName()>
	//   23   53:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   24   56:ldc1            #116 <String " : ">
	//   25   58:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   26   61:aload_2         
	//   27   62:invokevirtual   #117 <Method String SensorDeviceInfo.getId()>
	//   28   65:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   29   68:ldc1            #116 <String " : ">
	//   30   70:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   31   73:aload_2         
	//   32   74:invokevirtual   #120 <Method String SensorDeviceInfo.getDeviceName()>
	//   33   77:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   34   80:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   35   83:invokestatic    #126 <Method void LOG.d(Class, String)>
			if(sensordeviceinfo.getConnectionType() == com.samsung.android.sensor.data.SensorTypes.SensorConnectionType.SENSOR_CONNECTION_TYPE_ANDROID_DEFAULT)
	//*  36   86:aload_2         
	//*  37   87:invokevirtual   #130 <Method com.samsung.android.sensor.data.SensorTypes$SensorConnectionType SensorDeviceInfo.getConnectionType()>
	//*  38   90:getstatic       #136 <Field com.samsung.android.sensor.data.SensorTypes$SensorConnectionType com.samsung.android.sensor.data.SensorTypes$SensorConnectionType.SENSOR_CONNECTION_TYPE_ANDROID_DEFAULT>
	//*  39   93:if_acmpne       135
			{
				if(mAndroidDeviceMap.containsKey(((Object) (sensordeviceinfo.getId()))))
	//*  40   96:aload_0         
	//*  41   97:getfield        #138 <Field HashMap mAndroidDeviceMap>
	//*  42  100:aload_2         
	//*  43  101:invokevirtual   #117 <Method String SensorDeviceInfo.getId()>
	//*  44  104:invokevirtual   #142 <Method boolean HashMap.containsKey(Object)>
	//*  45  107:ifeq            20
				{
					sensordeviceinfo = ((SensorDeviceInfo) ((SensorDevice)mAndroidDeviceMap.get(((Object) (sensordeviceinfo.getId())))));
	//   46  110:aload_0         
	//   47  111:getfield        #138 <Field HashMap mAndroidDeviceMap>
	//   48  114:aload_2         
	//   49  115:invokevirtual   #117 <Method String SensorDeviceInfo.getId()>
	//   50  118:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//   51  121:checkcast       #72  <Class SensorDevice>
	//   52  124:astore_2        
					if(sensordeviceinfo != null)
	//*  53  125:aload_2         
	//*  54  126:ifnull          20
					{
						((SensorDevice) (sensordeviceinfo)).access(sensorconnectorinfo);
	//   55  129:aload_2         
	//   56  130:aload_1         
	//   57  131:invokevirtual   #202 <Method void SensorDevice.access(SensorConnectorInfo)>
						return;
	//   58  134:return          
					}
				}
			} else
			{
				LOG.d(TAG, "Unsupported Connection Type");
	//   59  135:getstatic       #18  <Field Class TAG>
	//   60  138:ldc1            #151 <String "Unsupported Connection Type">
	//   61  140:invokestatic    #126 <Method void LOG.d(Class, String)>
				return;
	//   62  143:return          
			}
		}
	}

	public void uninitialize()
	{
		LOG.i(TAG, "uninitialize()");
	//    0    0:getstatic       #18  <Field Class TAG>
	//    1    3:ldc1            #205 <String "uninitialize()">
	//    2    5:invokestatic    #37  <Method void LOG.i(Class, String)>
	//    3    8:return          
	}

	private static final Class TAG = com/sec/android/sensor/framework/SensorManager;
	private static SensorManager mInstance = new SensorManager();
	private HashMap mAndroidDeviceMap;
	private Context mContext;

	static 
	{
	//    0    0:ldc1            #2   <Class SensorManager>
	//    1    2:putstatic       #18  <Field Class TAG>
	//    2    5:new             #2   <Class SensorManager>
	//    3    8:dup             
	//    4    9:invokespecial   #21  <Method void SensorManager()>
	//    5   12:putstatic       #23  <Field SensorManager mInstance>
	//*   6   15:return          
	}
}
