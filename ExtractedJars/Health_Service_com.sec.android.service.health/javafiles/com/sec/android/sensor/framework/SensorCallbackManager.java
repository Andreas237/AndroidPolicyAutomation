// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.sensor.framework;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.text.TextUtils;
import com.samsung.android.sensor.aidl.ISensorServiceCallback;
import com.samsung.android.sensor.data.*;
import com.sec.android.sensor.framework.device.SensorDevice;
import com.sec.android.service.health.util.LOG;
import java.util.*;

// Referenced classes of package com.sec.android.sensor.framework:
//			SensorManager

public class SensorCallbackManager
{

	public SensorCallbackManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		mCallbackMap = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #29  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void HashMap()>
	//    6   12:putfield        #32  <Field Map mCallbackMap>
	//    7   15:return          
	}

	public static SensorCallbackManager getInstance()
	{
		return mInstance;
	//    0    0:getstatic       #23  <Field SensorCallbackManager mInstance>
	//    1    3:areturn         
	}

	public void addServiceCallback(String s, ISensorServiceCallback isensorservicecallback)
	{
		LOG.i(TAG, "addServiceCallback()");
	//    0    0:getstatic       #18  <Field Class TAG>
	//    1    3:ldc1            #38  <String "addServiceCallback()">
	//    2    5:invokestatic    #44  <Method void LOG.i(Class, String)>
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   3    8:aload_1         
	//*   4    9:invokestatic    #50  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5   12:iconst_1        
	//*   6   13:icmpne          24
			LOG.w(TAG, "addServiceCallback() : String connectorName is null");
	//    7   16:getstatic       #18  <Field Class TAG>
	//    8   19:ldc1            #52  <String "addServiceCallback() : String connectorName is null">
	//    9   21:invokestatic    #55  <Method void LOG.w(Class, String)>
		if(isensorservicecallback == null)
	//*  10   24:aload_2         
	//*  11   25:ifnonnull       36
			LOG.w(TAG, "addServiceCallback() : ISensorServiceCallback is null");
	//   12   28:getstatic       #18  <Field Class TAG>
	//   13   31:ldc1            #57  <String "addServiceCallback() : ISensorServiceCallback is null">
	//   14   33:invokestatic    #55  <Method void LOG.w(Class, String)>
		mCallbackMap.put(((Object) (s)), ((Object) (isensorservicecallback)));
	//   15   36:aload_0         
	//   16   37:getfield        #32  <Field Map mCallbackMap>
	//   17   40:aload_1         
	//   18   41:aload_2         
	//   19   42:invokeinterface #63  <Method Object Map.put(Object, Object)>
	//   20   47:pop             
	//   21   48:return          
	}

	public ISensorServiceCallback getServiceCallback(String s)
	{
		LOG.i(TAG, "getServiceCallback()");
	//    0    0:getstatic       #18  <Field Class TAG>
	//    1    3:ldc1            #67  <String "getServiceCallback()">
	//    2    5:invokestatic    #44  <Method void LOG.i(Class, String)>
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   3    8:aload_1         
	//*   4    9:invokestatic    #50  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5   12:iconst_1        
	//*   6   13:icmpne          24
			LOG.w(TAG, "getServiceCallback() : String connectorName is null");
	//    7   16:getstatic       #18  <Field Class TAG>
	//    8   19:ldc1            #69  <String "getServiceCallback() : String connectorName is null">
	//    9   21:invokestatic    #55  <Method void LOG.w(Class, String)>
		return (ISensorServiceCallback)mCallbackMap.get(((Object) (s)));
	//   10   24:aload_0         
	//   11   25:getfield        #32  <Field Map mCallbackMap>
	//   12   28:aload_1         
	//   13   29:invokeinterface #73  <Method Object Map.get(Object)>
	//   14   34:checkcast       #75  <Class ISensorServiceCallback>
	//   15   37:areturn         
	}

	public void invokeDataCallback(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo, SensorData sensordata)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		LOG.i(TAG, "invokeDataCallback()");
	//    2    2:getstatic       #18  <Field Class TAG>
	//    3    5:ldc1            #83  <String "invokeDataCallback()">
	//    4    7:invokestatic    #44  <Method void LOG.i(Class, String)>
		if(sensorconnectorinfo != null) goto _L2; else goto _L1
	//    5   10:aload_1         
	//    6   11:ifnonnull       25
_L1:
		LOG.e(TAG, "connectorInfo is null");
	//    7   14:getstatic       #18  <Field Class TAG>
	//    8   17:ldc1            #85  <String "connectorInfo is null">
	//    9   19:invokestatic    #88  <Method void LOG.e(Class, String)>
_L4:
		this;
	//   10   22:aload_0         
		JVM INSTR monitorexit ;
	//   11   23:monitorexit     
		return;
	//   12   24:return          
_L2:
		if(sensordeviceinfo != null)
			break MISSING_BLOCK_LABEL_37;
	//   13   25:aload_2         
	//   14   26:ifnonnull       37
		LOG.w(TAG, "invokeDataCallback() : SensorDeviceInfo is null");
	//   15   29:getstatic       #18  <Field Class TAG>
	//   16   32:ldc1            #90  <String "invokeDataCallback() : SensorDeviceInfo is null">
	//   17   34:invokestatic    #55  <Method void LOG.w(Class, String)>
		if(sensordata != null)
			break MISSING_BLOCK_LABEL_49;
	//   18   37:aload_3         
	//   19   38:ifnonnull       49
		LOG.w(TAG, "invokeDataCallback() : SensorData is null");
	//   20   41:getstatic       #18  <Field Class TAG>
	//   21   44:ldc1            #92  <String "invokeDataCallback() : SensorData is null">
	//   22   46:invokestatic    #55  <Method void LOG.w(Class, String)>
		ISensorServiceCallback isensorservicecallback = (ISensorServiceCallback)mCallbackMap.get(((Object) (sensorconnectorinfo.getName())));
	//   23   49:aload_0         
	//   24   50:getfield        #32  <Field Map mCallbackMap>
	//   25   53:aload_1         
	//   26   54:invokevirtual   #98  <Method String SensorConnectorInfo.getName()>
	//   27   57:invokeinterface #73  <Method Object Map.get(Object)>
	//   28   62:checkcast       #75  <Class ISensorServiceCallback>
	//   29   65:astore          4
		if(isensorservicecallback == null) goto _L4; else goto _L3
	//   30   67:aload           4
	//   31   69:ifnull          22
_L3:
		isensorservicecallback.onDataReceived(sensordeviceinfo.getId(), sensordata);
	//   32   72:aload           4
	//   33   74:aload_2         
	//   34   75:invokevirtual   #103 <Method String SensorDeviceInfo.getId()>
	//   35   78:aload_3         
	//   36   79:invokeinterface #107 <Method void ISensorServiceCallback.onDataReceived(String, SensorData)>
		  goto _L4
	//*  37   84:goto            22
		sensordeviceinfo;
	//   38   87:astore_2        
		LOG.e(TAG, "DeadObjectException : Hosting process no longer exists!!");
	//   39   88:getstatic       #18  <Field Class TAG>
	//   40   91:ldc1            #109 <String "DeadObjectException : Hosting process no longer exists!!">
	//   41   93:invokestatic    #88  <Method void LOG.e(Class, String)>
		sensordeviceinfo = ((SensorDeviceInfo) (SensorManager.getInstance().getAndroidDeviceMap()));
	//   42   96:invokestatic    #114 <Method SensorManager SensorManager.getInstance()>
	//   43   99:invokevirtual   #118 <Method Map SensorManager.getAndroidDeviceMap()>
	//   44  102:astore_2        
		if(sensordeviceinfo == null)
			break MISSING_BLOCK_LABEL_180;
	//   45  103:aload_2         
	//   46  104:ifnull          180
		LOG.i(TAG, (new StringBuilder()).append("DeadObjectException : Clear androidDeviceMap ").append(((Map) (sensordeviceinfo)).size()).toString());
	//   47  107:getstatic       #18  <Field Class TAG>
	//   48  110:new             #120 <Class StringBuilder>
	//   49  113:dup             
	//   50  114:invokespecial   #121 <Method void StringBuilder()>
	//   51  117:ldc1            #123 <String "DeadObjectException : Clear androidDeviceMap ">
	//   52  119:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   53  122:aload_2         
	//   54  123:invokeinterface #131 <Method int Map.size()>
	//   55  128:invokevirtual   #134 <Method StringBuilder StringBuilder.append(int)>
	//   56  131:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   57  134:invokestatic    #44  <Method void LOG.i(Class, String)>
		for(sensordeviceinfo = ((SensorDeviceInfo) (((Map) (sensordeviceinfo)).values().iterator())); ((Iterator) (sensordeviceinfo)).hasNext(); ((SensorDevice)((Iterator) (sensordeviceinfo)).next()).release(sensorconnectorinfo, true));
	//   58  137:aload_2         
	//   59  138:invokeinterface #141 <Method Collection Map.values()>
	//   60  143:invokeinterface #147 <Method Iterator Collection.iterator()>
	//   61  148:astore_2        
	//   62  149:aload_2         
	//   63  150:invokeinterface #153 <Method boolean Iterator.hasNext()>
	//   64  155:ifeq            180
	//   65  158:aload_2         
	//   66  159:invokeinterface #157 <Method Object Iterator.next()>
	//   67  164:checkcast       #159 <Class SensorDevice>
	//   68  167:aload_1         
	//   69  168:iconst_1        
	//   70  169:invokevirtual   #163 <Method void SensorDevice.release(SensorConnectorInfo, boolean)>
		break MISSING_BLOCK_LABEL_180;
	//   71  172:goto            149
		sensorconnectorinfo;
	//   72  175:astore_1        
	//*  73  176:aload_0         
		throw sensorconnectorinfo;
	//   74  177:monitorexit     
	//   75  178:aload_1         
	//   76  179:athrow          
		removeServiceCallback(sensorconnectorinfo.getName());
	//   77  180:aload_0         
	//   78  181:aload_1         
	//   79  182:invokevirtual   #98  <Method String SensorConnectorInfo.getName()>
	//   80  185:invokevirtual   #167 <Method void removeServiceCallback(String)>
		  goto _L4
	//*  81  188:goto            22
		sensorconnectorinfo;
	//   82  191:astore_1        
		((RemoteException) (sensorconnectorinfo)).printStackTrace();
	//   83  192:aload_1         
	//   84  193:invokevirtual   #170 <Method void RemoteException.printStackTrace()>
		  goto _L4
	//*  85  196:goto            22
	}

	public void invokeDeviceAccessResultComeCallback(String s, SensorDeviceInfo sensordeviceinfo, int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		LOG.i(TAG, "invokeDeviceAccessResultComeCallback()");
	//    2    2:getstatic       #18  <Field Class TAG>
	//    3    5:ldc1            #174 <String "invokeDeviceAccessResultComeCallback()">
	//    4    7:invokestatic    #44  <Method void LOG.i(Class, String)>
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   5   10:aload_1         
	//*   6   11:invokestatic    #50  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   14:iconst_1        
	//*   8   15:icmpne          26
			LOG.w(TAG, "invokeDeviceAccessResultComeCallback() : String connectorName is null");
	//    9   18:getstatic       #18  <Field Class TAG>
	//   10   21:ldc1            #176 <String "invokeDeviceAccessResultComeCallback() : String connectorName is null">
	//   11   23:invokestatic    #55  <Method void LOG.w(Class, String)>
		if(sensordeviceinfo != null)
			break MISSING_BLOCK_LABEL_38;
	//   12   26:aload_2         
	//   13   27:ifnonnull       38
		LOG.w(TAG, "invokeDeviceAccessResultComeCallback() : SensorDeviceInfo is null");
	//   14   30:getstatic       #18  <Field Class TAG>
	//   15   33:ldc1            #178 <String "invokeDeviceAccessResultComeCallback() : SensorDeviceInfo is null">
	//   16   35:invokestatic    #55  <Method void LOG.w(Class, String)>
		s = ((String) ((ISensorServiceCallback)mCallbackMap.get(((Object) (s)))));
	//   17   38:aload_0         
	//   18   39:getfield        #32  <Field Map mCallbackMap>
	//   19   42:aload_1         
	//   20   43:invokeinterface #73  <Method Object Map.get(Object)>
	//   21   48:checkcast       #75  <Class ISensorServiceCallback>
	//   22   51:astore_1        
		if(s == null)
			break MISSING_BLOCK_LABEL_64;
	//   23   52:aload_1         
	//   24   53:ifnull          64
		((ISensorServiceCallback) (s)).onDeviceAccessResultReceived(i, sensordeviceinfo);
	//   25   56:aload_1         
	//   26   57:iload_3         
	//   27   58:aload_2         
	//   28   59:invokeinterface #182 <Method void ISensorServiceCallback.onDeviceAccessResultReceived(int, SensorDeviceInfo)>
_L1:
		this;
	//   29   64:aload_0         
		JVM INSTR monitorexit ;
	//   30   65:monitorexit     
		return;
	//   31   66:return          
		s;
	//   32   67:astore_1        
		((RemoteException) (s)).printStackTrace();
	//   33   68:aload_1         
	//   34   69:invokevirtual   #170 <Method void RemoteException.printStackTrace()>
		  goto _L1
	//*  35   72:goto            64
		s;
	//   36   75:astore_1        
	//*  37   76:aload_0         
		throw s;
	//   38   77:monitorexit     
	//   39   78:aload_1         
	//   40   79:athrow          
	}

	public void removeServiceCallback(String s)
	{
		LOG.i(TAG, "removeServiceCallback()");
	//    0    0:getstatic       #18  <Field Class TAG>
	//    1    3:ldc1            #184 <String "removeServiceCallback()">
	//    2    5:invokestatic    #44  <Method void LOG.i(Class, String)>
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   3    8:aload_1         
	//*   4    9:invokestatic    #50  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5   12:iconst_1        
	//*   6   13:icmpne          24
			LOG.w(TAG, "removeServiceCallback() : String connectorName is null");
	//    7   16:getstatic       #18  <Field Class TAG>
	//    8   19:ldc1            #186 <String "removeServiceCallback() : String connectorName is null">
	//    9   21:invokestatic    #55  <Method void LOG.w(Class, String)>
		mCallbackMap.remove(((Object) (s)));
	//   10   24:aload_0         
	//   11   25:getfield        #32  <Field Map mCallbackMap>
	//   12   28:aload_1         
	//   13   29:invokeinterface #189 <Method Object Map.remove(Object)>
	//   14   34:pop             
	//   15   35:return          
	}

	private static final Class TAG = com/sec/android/sensor/framework/SensorCallbackManager;
	public static Object callingRemoteCallback = new Object();
	private static SensorCallbackManager mInstance = new SensorCallbackManager();
	private Map mCallbackMap;

	static 
	{
	//    0    0:ldc1            #2   <Class SensorCallbackManager>
	//    1    2:putstatic       #18  <Field Class TAG>
	//    2    5:new             #2   <Class SensorCallbackManager>
	//    3    8:dup             
	//    4    9:invokespecial   #21  <Method void SensorCallbackManager()>
	//    5   12:putstatic       #23  <Field SensorCallbackManager mInstance>
	//    6   15:new             #4   <Class Object>
	//    7   18:dup             
	//    8   19:invokespecial   #24  <Method void Object()>
	//    9   22:putstatic       #26  <Field Object callingRemoteCallback>
	//*  10   25:return          
	}
}
