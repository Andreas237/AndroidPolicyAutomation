// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.sensor.manager;

import android.content.Context;
import android.hardware.SensorManager;
import android.util.SparseArray;
import com.samsung.android.sdk.health.sensor._PlatformSensorDataListener;
import com.samsung.android.sdk.health.sensor._private._PrivilegeSensorDevice;
import com.samsung.android.sdk.health.sensor.handler.PrivilegeSensorProfileHandlerInterface;
import com.sec.android.service.health.sensor.handler.ProfileHandlerController;
import com.sec.android.service.health.sensor.handler.bloodglucose.InternalBGHandler;
import com.sec.android.service.health.sensor.handler.bodytemperature.BodyTemperatureHandler;
import com.sec.android.service.health.sensor.handler.hrm.HeartRateMonitorHandler;
import com.sec.android.service.health.sensor.handler.hrm.PulseOximeterHandler;
import com.sec.android.service.health.sensor.manager.util.Filter;
import com.sec.android.service.health.util.LOG;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.sec.android.service.health.sensor.manager:
//			BaseSensorManager, ISensorListener

public class InternalAndroidSensorManager extends BaseSensorManager
{

	private InternalAndroidSensorManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void BaseSensorManager()>
		mHrmDevice = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #35  <Field _PrivilegeSensorDevice mHrmDevice>
		mPulseOximeterDevice = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #37  <Field _PrivilegeSensorDevice mPulseOximeterDevice>
		mBGDevice = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #39  <Field _PrivilegeSensorDevice mBGDevice>
		mEcgDevice = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #41  <Field _PrivilegeSensorDevice mEcgDevice>
		mBodyTemperatureDevice = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #43  <Field _PrivilegeSensorDevice mBodyTemperatureDevice>
		mHandlerMap = new SparseArray();
	//   17   29:aload_0         
	//   18   30:new             #45  <Class SparseArray>
	//   19   33:dup             
	//   20   34:invokespecial   #46  <Method void SparseArray()>
	//   21   37:putfield        #48  <Field SparseArray mHandlerMap>
	//   22   40:return          
	}

	public static InternalAndroidSensorManager getInstance()
	{
		return sInternalSensorManager;
	//    0    0:getstatic       #31  <Field InternalAndroidSensorManager sInternalSensorManager>
	//    1    3:areturn         
	}

	public List getConnectedDevices(Filter filter)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #54  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void ArrayList()>
	//    3    7:astore_2        
		if(mHrmDevice != null && filter.verifyDevice(mHrmDevice))
	//*   4    8:aload_0         
	//*   5    9:getfield        #35  <Field _PrivilegeSensorDevice mHrmDevice>
	//*   6   12:ifnull          35
	//*   7   15:aload_1         
	//*   8   16:aload_0         
	//*   9   17:getfield        #35  <Field _PrivilegeSensorDevice mHrmDevice>
	//*  10   20:invokevirtual   #61  <Method boolean Filter.verifyDevice(_PrivilegeSensorDevice)>
	//*  11   23:ifeq            35
			arraylist.add(((Object) (mHrmDevice)));
	//   12   26:aload_2         
	//   13   27:aload_0         
	//   14   28:getfield        #35  <Field _PrivilegeSensorDevice mHrmDevice>
	//   15   31:invokevirtual   #65  <Method boolean ArrayList.add(Object)>
	//   16   34:pop             
		if(mPulseOximeterDevice != null && filter.verifyDevice(mPulseOximeterDevice))
	//*  17   35:aload_0         
	//*  18   36:getfield        #37  <Field _PrivilegeSensorDevice mPulseOximeterDevice>
	//*  19   39:ifnull          62
	//*  20   42:aload_1         
	//*  21   43:aload_0         
	//*  22   44:getfield        #37  <Field _PrivilegeSensorDevice mPulseOximeterDevice>
	//*  23   47:invokevirtual   #61  <Method boolean Filter.verifyDevice(_PrivilegeSensorDevice)>
	//*  24   50:ifeq            62
			arraylist.add(((Object) (mPulseOximeterDevice)));
	//   25   53:aload_2         
	//   26   54:aload_0         
	//   27   55:getfield        #37  <Field _PrivilegeSensorDevice mPulseOximeterDevice>
	//   28   58:invokevirtual   #65  <Method boolean ArrayList.add(Object)>
	//   29   61:pop             
		if(mBGDevice != null && filter.verifyDevice(mBGDevice))
	//*  30   62:aload_0         
	//*  31   63:getfield        #39  <Field _PrivilegeSensorDevice mBGDevice>
	//*  32   66:ifnull          89
	//*  33   69:aload_1         
	//*  34   70:aload_0         
	//*  35   71:getfield        #39  <Field _PrivilegeSensorDevice mBGDevice>
	//*  36   74:invokevirtual   #61  <Method boolean Filter.verifyDevice(_PrivilegeSensorDevice)>
	//*  37   77:ifeq            89
			arraylist.add(((Object) (mBGDevice)));
	//   38   80:aload_2         
	//   39   81:aload_0         
	//   40   82:getfield        #39  <Field _PrivilegeSensorDevice mBGDevice>
	//   41   85:invokevirtual   #65  <Method boolean ArrayList.add(Object)>
	//   42   88:pop             
		if(mEcgDevice != null && filter.verifyDevice(mEcgDevice))
	//*  43   89:aload_0         
	//*  44   90:getfield        #41  <Field _PrivilegeSensorDevice mEcgDevice>
	//*  45   93:ifnull          116
	//*  46   96:aload_1         
	//*  47   97:aload_0         
	//*  48   98:getfield        #41  <Field _PrivilegeSensorDevice mEcgDevice>
	//*  49  101:invokevirtual   #61  <Method boolean Filter.verifyDevice(_PrivilegeSensorDevice)>
	//*  50  104:ifeq            116
			arraylist.add(((Object) (mEcgDevice)));
	//   51  107:aload_2         
	//   52  108:aload_0         
	//   53  109:getfield        #41  <Field _PrivilegeSensorDevice mEcgDevice>
	//   54  112:invokevirtual   #65  <Method boolean ArrayList.add(Object)>
	//   55  115:pop             
		if(mBodyTemperatureDevice != null && filter.verifyDevice(mBodyTemperatureDevice))
	//*  56  116:aload_0         
	//*  57  117:getfield        #43  <Field _PrivilegeSensorDevice mBodyTemperatureDevice>
	//*  58  120:ifnull          143
	//*  59  123:aload_1         
	//*  60  124:aload_0         
	//*  61  125:getfield        #43  <Field _PrivilegeSensorDevice mBodyTemperatureDevice>
	//*  62  128:invokevirtual   #61  <Method boolean Filter.verifyDevice(_PrivilegeSensorDevice)>
	//*  63  131:ifeq            143
			arraylist.add(((Object) (mBodyTemperatureDevice)));
	//   64  134:aload_2         
	//   65  135:aload_0         
	//   66  136:getfield        #43  <Field _PrivilegeSensorDevice mBodyTemperatureDevice>
	//   67  139:invokevirtual   #65  <Method boolean ArrayList.add(Object)>
	//   68  142:pop             
		return ((List) (arraylist));
	//   69  143:aload_2         
	//   70  144:areturn         
	}

	public void initialize(Context context, ISensorListener isensorlistener)
	{
		super.initialize(context, isensorlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #71  <Method void BaseSensorManager.initialize(Context, ISensorListener)>
		context = ((Context) ((SensorManager)context.getSystemService("sensor")));
	//    4    6:aload_1         
	//    5    7:ldc1            #73  <String "sensor">
	//    6    9:invokevirtual   #79  <Method Object Context.getSystemService(String)>
	//    7   12:checkcast       #81  <Class SensorManager>
	//    8   15:astore_1        
		if(mHrmDevice == null && context != null && ((SensorManager) (context)).getDefaultSensor(0x10019) != null)
	//*   9   16:aload_0         
	//*  10   17:getfield        #35  <Field _PrivilegeSensorDevice mHrmDevice>
	//*  11   20:ifnonnull       77
	//*  12   23:aload_1         
	//*  13   24:ifnull          77
	//*  14   27:aload_1         
	//*  15   28:ldc1            #82  <Int 0x10019>
	//*  16   30:invokevirtual   #86  <Method android.hardware.Sensor SensorManager.getDefaultSensor(int)>
	//*  17   33:ifnull          77
		{
			mHrmDevice = new _PrivilegeSensorDevice(android.provider.Settings.Secure.getString(mContext.getContentResolver(), "android_id"), "INTERNAL-HRM", 1, 10008, 1, ((android.os.Bundle) (null)));
	//   18   36:aload_0         
	//   19   37:new             #88  <Class _PrivilegeSensorDevice>
	//   20   40:dup             
	//   21   41:aload_0         
	//   22   42:getfield        #92  <Field Context mContext>
	//   23   45:invokevirtual   #96  <Method android.content.ContentResolver Context.getContentResolver()>
	//   24   48:ldc1            #98  <String "android_id">
	//   25   50:invokestatic    #104 <Method String android.provider.Settings$Secure.getString(android.content.ContentResolver, String)>
	//   26   53:ldc1            #106 <String "INTERNAL-HRM">
	//   27   55:iconst_1        
	//   28   56:sipush          10008
	//   29   59:iconst_1        
	//   30   60:aconst_null     
	//   31   61:invokespecial   #109 <Method void _PrivilegeSensorDevice(String, String, int, int, int, android.os.Bundle)>
	//   32   64:putfield        #35  <Field _PrivilegeSensorDevice mHrmDevice>
			mHandlerMap.put(1, com/sec/android/service/health/sensor/handler/hrm/HeartRateMonitorHandler);
	//   33   67:aload_0         
	//   34   68:getfield        #48  <Field SparseArray mHandlerMap>
	//   35   71:iconst_1        
	//   36   72:ldc1            #111 <Class HeartRateMonitorHandler>
	//   37   74:invokevirtual   #115 <Method void SparseArray.put(int, Object)>
		}
		if(mPulseOximeterDevice == null && context != null && ((SensorManager) (context)).getDefaultSensor(0x1001a) != null)
	//*  38   77:aload_0         
	//*  39   78:getfield        #37  <Field _PrivilegeSensorDevice mPulseOximeterDevice>
	//*  40   81:ifnonnull       128
	//*  41   84:aload_1         
	//*  42   85:ifnull          128
	//*  43   88:aload_1         
	//*  44   89:ldc1            #116 <Int 0x1001a>
	//*  45   91:invokevirtual   #86  <Method android.hardware.Sensor SensorManager.getDefaultSensor(int)>
	//*  46   94:ifnull          128
		{
			mPulseOximeterDevice = new _PrivilegeSensorDevice("PULSEOXIMETER", "Samsung PulseOximeter", 1, 10026, 2, ((android.os.Bundle) (null)));
	//   47   97:aload_0         
	//   48   98:new             #88  <Class _PrivilegeSensorDevice>
	//   49  101:dup             
	//   50  102:ldc1            #118 <String "PULSEOXIMETER">
	//   51  104:ldc1            #120 <String "Samsung PulseOximeter">
	//   52  106:iconst_1        
	//   53  107:sipush          10026
	//   54  110:iconst_2        
	//   55  111:aconst_null     
	//   56  112:invokespecial   #109 <Method void _PrivilegeSensorDevice(String, String, int, int, int, android.os.Bundle)>
	//   57  115:putfield        #37  <Field _PrivilegeSensorDevice mPulseOximeterDevice>
			mHandlerMap.put(2, com/sec/android/service/health/sensor/handler/hrm/PulseOximeterHandler);
	//   58  118:aload_0         
	//   59  119:getfield        #48  <Field SparseArray mHandlerMap>
	//   60  122:iconst_2        
	//   61  123:ldc1            #122 <Class PulseOximeterHandler>
	//   62  125:invokevirtual   #115 <Method void SparseArray.put(int, Object)>
		}
		if(mBGDevice == null && context != null && ((SensorManager) (context)).getDefaultSensor(0x1001f) != null)
	//*  63  128:aload_0         
	//*  64  129:getfield        #39  <Field _PrivilegeSensorDevice mBGDevice>
	//*  65  132:ifnonnull       179
	//*  66  135:aload_1         
	//*  67  136:ifnull          179
	//*  68  139:aload_1         
	//*  69  140:ldc1            #123 <Int 0x1001f>
	//*  70  142:invokevirtual   #86  <Method android.hardware.Sensor SensorManager.getDefaultSensor(int)>
	//*  71  145:ifnull          179
		{
			mBGDevice = new _PrivilegeSensorDevice("BLOODGLUCOSE", "BLOODGLUCOSE", 1, 10004, 3, ((android.os.Bundle) (null)));
	//   72  148:aload_0         
	//   73  149:new             #88  <Class _PrivilegeSensorDevice>
	//   74  152:dup             
	//   75  153:ldc1            #125 <String "BLOODGLUCOSE">
	//   76  155:ldc1            #125 <String "BLOODGLUCOSE">
	//   77  157:iconst_1        
	//   78  158:sipush          10004
	//   79  161:iconst_3        
	//   80  162:aconst_null     
	//   81  163:invokespecial   #109 <Method void _PrivilegeSensorDevice(String, String, int, int, int, android.os.Bundle)>
	//   82  166:putfield        #39  <Field _PrivilegeSensorDevice mBGDevice>
			mHandlerMap.put(3, com/sec/android/service/health/sensor/handler/bloodglucose/InternalBGHandler);
	//   83  169:aload_0         
	//   84  170:getfield        #48  <Field SparseArray mHandlerMap>
	//   85  173:iconst_3        
	//   86  174:ldc1            #127 <Class InternalBGHandler>
	//   87  176:invokevirtual   #115 <Method void SparseArray.put(int, Object)>
		}
		if(mBodyTemperatureDevice == null && context != null && ((SensorManager) (context)).getDefaultSensor(0x1001e) != null)
	//*  88  179:aload_0         
	//*  89  180:getfield        #43  <Field _PrivilegeSensorDevice mBodyTemperatureDevice>
	//*  90  183:ifnonnull       232
	//*  91  186:aload_1         
	//*  92  187:ifnull          232
	//*  93  190:aload_1         
	//*  94  191:ldc1            #128 <Int 0x1001e>
	//*  95  193:invokevirtual   #86  <Method android.hardware.Sensor SensorManager.getDefaultSensor(int)>
	//*  96  196:ifnull          232
		{
			mBodyTemperatureDevice = new _PrivilegeSensorDevice("BODYTEMPERATURE", "BODYTEMPERATURE", 1, 10006, 7, ((android.os.Bundle) (null)));
	//   97  199:aload_0         
	//   98  200:new             #88  <Class _PrivilegeSensorDevice>
	//   99  203:dup             
	//  100  204:ldc1            #130 <String "BODYTEMPERATURE">
	//  101  206:ldc1            #130 <String "BODYTEMPERATURE">
	//  102  208:iconst_1        
	//  103  209:sipush          10006
	//  104  212:bipush          7
	//  105  214:aconst_null     
	//  106  215:invokespecial   #109 <Method void _PrivilegeSensorDevice(String, String, int, int, int, android.os.Bundle)>
	//  107  218:putfield        #43  <Field _PrivilegeSensorDevice mBodyTemperatureDevice>
			mHandlerMap.put(7, com/sec/android/service/health/sensor/handler/bodytemperature/BodyTemperatureHandler);
	//  108  221:aload_0         
	//  109  222:getfield        #48  <Field SparseArray mHandlerMap>
	//  110  225:bipush          7
	//  111  227:ldc1            #132 <Class BodyTemperatureHandler>
	//  112  229:invokevirtual   #115 <Method void SparseArray.put(int, Object)>
		}
	//  113  232:return          
	}

	public boolean isDataTypeSupported(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 7: default 48
	//	               0 50
	//	               1 50
	//	               2 50
	//	               3 50
	//	               4 50
	//	               5 48
	//	               6 48
	//	               7 50
		case 5: // '\005'
		case 6: // '\006'
		default:
			return false;
	//    2   48:iconst_0        
	//    3   49:ireturn         

		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 7: // '\007'
			return true;
	//    4   50:iconst_1        
	//    5   51:ireturn         
		}
	}

	public int registerListener(_PrivilegeSensorDevice _pprivilegesensordevice, Integer integer, _PlatformSensorDataListener _pplatformsensordatalistener)
	{
		Object obj;
		ProfileHandlerController profilehandlercontroller;
		Object obj1;
		profilehandlercontroller = getProfileHandlerController(_pprivilegesensordevice.getId());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #144 <Method String _PrivilegeSensorDevice.getId()>
	//    3    5:invokevirtual   #148 <Method ProfileHandlerController getProfileHandlerController(String)>
	//    4    8:astore          5
		obj = ((Object) (profilehandlercontroller));
	//    5   10:aload           5
	//    6   12:astore          4
		if(profilehandlercontroller != null)
			break MISSING_BLOCK_LABEL_107;
	//    7   14:aload           5
	//    8   16:ifnonnull       107
		obj1 = null;
	//    9   19:aconst_null     
	//   10   20:astore          6
		Class class1 = (Class)mHandlerMap.get(((Integer)_pprivilegesensordevice.getDataType().get(0)).intValue());
	//   11   22:aload_0         
	//   12   23:getfield        #48  <Field SparseArray mHandlerMap>
	//   13   26:aload_1         
	//   14   27:invokevirtual   #152 <Method List _PrivilegeSensorDevice.getDataType()>
	//   15   30:iconst_0        
	//   16   31:invokeinterface #158 <Method Object List.get(int)>
	//   17   36:checkcast       #160 <Class Integer>
	//   18   39:invokevirtual   #164 <Method int Integer.intValue()>
	//   19   42:invokevirtual   #165 <Method Object SparseArray.get(int)>
	//   20   45:checkcast       #167 <Class Class>
	//   21   48:astore          7
		obj = ((Object) (obj1));
	//   22   50:aload           6
	//   23   52:astore          4
		if(class1 != null)
	//*  24   54:aload           7
	//*  25   56:ifnull          69
			try
			{
				obj = ((Object) ((PrivilegeSensorProfileHandlerInterface)class1.newInstance()));
	//   26   59:aload           7
	//   27   61:invokevirtual   #171 <Method Object Class.newInstance()>
	//   28   64:checkcast       #173 <Class PrivilegeSensorProfileHandlerInterface>
	//   29   67:astore          4
			}
	//*  30   69:aload           4
	//*  31   71:ifnull          142
	//*  32   74:new             #175 <Class ProfileHandlerController>
	//*  33   77:dup             
	//*  34   78:aload_1         
	//*  35   79:aload           4
	//*  36   81:aload_0         
	//*  37   82:invokespecial   #178 <Method void ProfileHandlerController(_PrivilegeSensorDevice, PrivilegeSensorProfileHandlerInterface, BaseSensorManagerListener)>
	//*  38   85:astore          4
	//*  39   87:aload           4
	//*  40   89:aload_0         
	//*  41   90:getfield        #92  <Field Context mContext>
	//*  42   93:aconst_null     
	//*  43   94:invokevirtual   #182 <Method void ProfileHandlerController.initiallize(Context, Object)>
	//*  44   97:aload_0         
	//*  45   98:aload_1         
	//*  46   99:invokevirtual   #144 <Method String _PrivilegeSensorDevice.getId()>
	//*  47  102:aload           4
	//*  48  104:invokevirtual   #186 <Method void addProfileHandlerController(String, ProfileHandlerController)>
	//*  49  107:aload           4
	//*  50  109:ifnonnull       157
	//*  51  112:iconst_1        
	//*  52  113:ireturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  53  114:astore          4
			{
				((InstantiationException) (obj)).printStackTrace();
	//   54  116:aload           4
	//   55  118:invokevirtual   #189 <Method void InstantiationException.printStackTrace()>
				obj = ((Object) (obj1));
	//   56  121:aload           6
	//   57  123:astore          4
			}
	//*  58  125:goto            69
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  59  128:astore          4
			{
				((IllegalAccessException) (obj)).printStackTrace();
	//   60  130:aload           4
	//   61  132:invokevirtual   #190 <Method void IllegalAccessException.printStackTrace()>
				obj = ((Object) (obj1));
	//   62  135:aload           6
	//   63  137:astore          4
			}
		if(obj != null)
		{
			obj = ((Object) (new ProfileHandlerController(_pprivilegesensordevice, ((PrivilegeSensorProfileHandlerInterface) (obj)), ((BaseSensorManagerListener) (this)))));
			((ProfileHandlerController) (obj)).initiallize(mContext, ((Object) (null)));
			addProfileHandlerController(_pprivilegesensordevice.getId(), ((ProfileHandlerController) (obj)));
		} else
	//*  64  139:goto            69
		{
			LOG.e(TAG, "createDeviceHandler: profileHandlerInterfaced is null !!");
	//   65  142:getstatic       #26  <Field Class TAG>
	//   66  145:ldc1            #192 <String "createDeviceHandler: profileHandlerInterfaced is null !!">
	//   67  147:invokestatic    #198 <Method void LOG.e(Class, String)>
			obj = ((Object) (profilehandlercontroller));
	//   68  150:aload           5
	//   69  152:astore          4
		}
		if(obj == null)
			return 1;
		else
	//*  70  154:goto            107
			return ((ProfileHandlerController) (obj)).registerListener(_pprivilegesensordevice, integer, _pplatformsensordatalistener);
	//   71  157:aload           4
	//   72  159:aload_1         
	//   73  160:aload_2         
	//   74  161:aload_3         
	//   75  162:invokevirtual   #200 <Method int ProfileHandlerController.registerListener(_PrivilegeSensorDevice, Integer, _PlatformSensorDataListener)>
	//   76  165:ireturn         
	}

	public int unregisterListener(_PrivilegeSensorDevice _pprivilegesensordevice, Integer integer)
	{
		_pprivilegesensordevice = ((_PrivilegeSensorDevice) (getProfileHandlerController(_pprivilegesensordevice.getId())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #144 <Method String _PrivilegeSensorDevice.getId()>
	//    3    5:invokevirtual   #148 <Method ProfileHandlerController getProfileHandlerController(String)>
	//    4    8:astore_1        
		if(_pprivilegesensordevice != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          19
			return ((ProfileHandlerController) (_pprivilegesensordevice)).unregisterListener(integer);
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #205 <Method int ProfileHandlerController.unregisterListener(Integer)>
	//   10   18:ireturn         
		else
			return 1;
	//   11   19:iconst_1        
	//   12   20:ireturn         
	}

	private static final String FEATURE_HEALTHCOVER = "com.sec.feature.healthcover";
	private static final Class TAG = com/sec/android/service/health/sensor/manager/InternalAndroidSensorManager;
	private static InternalAndroidSensorManager sInternalSensorManager = new InternalAndroidSensorManager();
	private _PrivilegeSensorDevice mBGDevice;
	private _PrivilegeSensorDevice mBodyTemperatureDevice;
	private _PrivilegeSensorDevice mEcgDevice;
	private SparseArray mHandlerMap;
	private _PrivilegeSensorDevice mHrmDevice;
	private _PrivilegeSensorDevice mPulseOximeterDevice;

	static 
	{
	//    0    0:ldc1            #2   <Class InternalAndroidSensorManager>
	//    1    2:putstatic       #26  <Field Class TAG>
	//    2    5:new             #2   <Class InternalAndroidSensorManager>
	//    3    8:dup             
	//    4    9:invokespecial   #29  <Method void InternalAndroidSensorManager()>
	//    5   12:putstatic       #31  <Field InternalAndroidSensorManager sInternalSensorManager>
	//*   6   15:return          
	}
}
